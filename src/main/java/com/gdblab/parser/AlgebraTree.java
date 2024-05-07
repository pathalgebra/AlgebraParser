/*
 * The copyrights of the source code in this file belong to:
 * - 
 *
 * This software is released in open source under the Apache License, 
 * Version 2.0 (the "License"); you may not use this file except in 
 * compliance with the License. You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.gdblab.parser;

import com.gdblab.parser.impl.*;

public class AlgebraTree {
    private String selector;
    private String groupby;
    private String orderby;
    private String outterRestrictor;
    private String condition;
    RPQExpression root;
    private int restDeep;

    public AlgebraTree() {
        restDeep = 0;
        outterRestrictor ="";
    }

    public String getOutterRestrictor() {
        return outterRestrictor;
    }

    public void setOutterRestrictor(String outterRestrictor) {
        if(this.outterRestrictor.length()==0)
            this.outterRestrictor = outterRestrictor;
    }

    public String getSelector() {
        return selector;
    }

    public void setSelector(String selector) {
        this.selector = selector;
    }

    public String getGroupby() {
        return groupby;
    }

    public void setGroupby(String groupby) {
        this.groupby = groupby;
    }

    public String getOrderby() {
        return orderby;
    }

    public void setOrderby(String orderby) {
        this.orderby = orderby;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getCondition() {
        return condition;
    }

   

    public RPQExpression getRoot() {
        return root;
    }

    public void setRoot(RPQExpression root) {
        this.root = root;
    }
    
    public void visit(RPQExpression root){
        int deep =0;
        String proj = "Projection (" + selector.trim() + ")"; 
        printDeepness(deep, proj);
        String orderBy = "OrderBy ("+orderby+")";
        printDeepness(deep, orderBy);
        String group = "Group ("+groupby+")";
        printDeepness(deep, group);
        String restrictor = "Restrictor ("+outterRestrictor+")";
        printDeepness(deep, restrictor);
        
        if (this.condition != null ){
            String select ="Select( "+this.condition+ " )";
            deep++;
            printDeepness(deep, select);
        }
        deep++;
        goTo(root,deep);
            
       
    }
    
    public void goTo(RPQExpression exp,int deep){
        
        if(deep < restDeep){
            restDeep=0;
        }
        
        if (exp instanceof AlternationPathExpression)
            visit((AlternationPathExpression)exp , deep);
        else if (exp instanceof ConcatenationPathExpression)
            visit ((ConcatenationPathExpression)exp, deep);
        else if (exp instanceof LabelExpression)
            visit ((LabelExpression)exp, deep);
        else if (exp instanceof OneOrMoreExpression)
            visit ((OneOrMoreExpression)exp, deep);
        else if (exp instanceof OptionalExpression)
            visit ((OptionalExpression)exp, deep);
        
        else if (exp instanceof ParenthesisPathExpression)
            visit ((ParenthesisPathExpression)exp, deep);
        else if (exp instanceof RestrictorPathExpression)
            visit ((RestrictorPathExpression)exp, deep);
    }
    
    public void visit(AlternationPathExpression exp ,int deep){
        printDeepness(deep, "Union");
        goTo(exp.getLeftChild(), deep+1);
        goTo(exp.getRightChild(), deep+1);
        
    }
    
    public void visit(ConcatenationPathExpression exp,int deep){
        printDeepness(deep,"Node Join");
        goTo(exp.getLeftChild(),deep+1);
        goTo(exp.getRightChild(),deep+1);  
    }
    
    public void visit(LabelExpression exp,int deep){
        String text;
        if(exp.getLabel().equals("Sn"))
            text = "Select: (Sn)";
        else if (exp.getLabel().length()==0)
            text = "Select: (Se)";
        else
            text = "Select: (label(edge(1)) = " +exp.getLabel().replace(":", "")+" , Se)";
        printDeepness(deep,text);
    }
    
    public void visit(OneOrMoreExpression exp,int deep){
        String plusStar= "Recursive Join (restrictor: ";
        if(exp.getRestrictor()!=null)
            printDeepness(deep,plusStar + exp.getRestrictor()+ ")");
        else
            printDeepness(deep,plusStar + outterRestrictor+ ")");
        goTo(exp.getChild(),deep+1); 
    }
    
    public void visit(OptionalExpression exp,int deep){
        printDeepness(deep,"Union");
        goTo(exp.getLeftChild(),deep+1);
        goTo(exp.getRightChild(),deep+1);
    }
    
    public void visit(ParenthesisPathExpression exp,int deep){
        //System.out.println("()");
        goTo(exp.getChild(),deep);
    }
    
    
    
    public void visit(RestrictorPathExpression exp,int deep){
        exp.getRestrictor();
        restDeep = deep;
        goTo(exp.getChild(),deep); 
    }
    
    
    
    

    
    private void printDeepness(int deep, String text){
        for (int i = 0; i < deep; i++){
            if(i < deep -1)
                System.out.print(" ");
            else
                System.out.println("-> "+text);
        }
        if (deep == 0)
            System.out.println(text);
            
    }
   
    
    
}
