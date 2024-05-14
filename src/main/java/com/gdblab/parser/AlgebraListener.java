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
import java.util.Stack;


public class AlgebraListener extends AlgebraGrammarBaseListener{
    
    RPQExpression root;
    private AlgebraTree atree;
    private Stack<RPQExpression> stack;
    private boolean finished;
    private boolean firstNode;
    private boolean lastNode;
    
    

    public AlgebraListener() {
        super();
        this.atree = new AlgebraTree();
        this.stack = new Stack();
        root = null;
        this.finished = false;
        this.firstNode = true;
        this.lastNode = false;
    }
    
    public RPQExpression getRoot() {
        
        if (finished) {
           return root;
        }
        throw new RuntimeException("Parsing is not finished.");
    }

    public AlgebraTree getAlgebraTree() {
        return atree;
    }

    public boolean isFinished() {
        return finished;
    }
    
    @Override public void exitQuery(AlgebraGrammarParser.QueryContext ctx) {
        if(!stack.isEmpty()){
            root = stack.pop();
            this.atree.setRoot(root);
            finished = true;
        }
        else if (lastNode){
            root = new LabelExpression("");
            this.atree.setRoot(root);
            finished = true;
        }
            
    }
   
//.-----------------------------------------------------------------------------------------------------    
//Selectors
//.-----------------------------------------------------------------------------------------------------
   

    @Override
    public void exitSelector(AlgebraGrammarParser.SelectorContext ctx) {
        String selector ="";
        for (int i = 0; i < ctx.getChildCount(); i++) {
            for (int j = 0; j < ctx.getChild(i).getChildCount(); j++) {
                selector+= (" "+ctx.getChild(i).getChild(j).getText());
            }
        }
        atree.setSelector(selector);
    }
    
    

    
//.-----------------------------------------------------------------------------------------------------
//Restrictors
//.-----------------------------------------------------------------------------------------------------    

    @Override
    public void exitSHORTEST(AlgebraGrammarParser.SHORTESTContext ctx) {
        if (ctx.getParent().getParent() == null)
            atree.setOutterRestrictor(ctx.getText());
    }

   

    @Override
    public void exitACYCLIC(AlgebraGrammarParser.ACYCLICContext ctx) {
       if (ctx.getParent().getParent() == null)
        atree.setOutterRestrictor(ctx.getText());
    }

    

    @Override
    public void exitTRAIL(AlgebraGrammarParser.TRAILContext ctx) {
        if (ctx.getParent().getParent() == null)
            atree.setOutterRestrictor(ctx.getText());
    }

   

    @Override
    public void exitSIMPLE(AlgebraGrammarParser.SIMPLEContext ctx) {
        if (ctx.getParent().getParent() == null)
            atree.setOutterRestrictor(ctx.getText());
    }

    

    @Override
    public void exitWALK(AlgebraGrammarParser.WALKContext ctx) {
        if (ctx.getParent().getParent() == null)
            atree.setOutterRestrictor(ctx.getText());
    }

    
    
    


//.-----------------------------------------------------------------------------------------------------
//OrderBy
//.-----------------------------------------------------------------------------------------------------      
   
    @Override
    public void exitGROUP(AlgebraGrammarParser.GROUPContext ctx) {
        atree.setOrderby("Group");   
    }


    @Override
    public void exitPARTITION(AlgebraGrammarParser.PARTITIONContext ctx) {
        atree.setOrderby("Partition");
    }
   
     @Override
    public void exitPARTITIONGROUP(AlgebraGrammarParser.PARTITIONGROUPContext ctx) {
        atree.setOrderby("Partition Group");
    }

    @Override
    public void exitPARTITIONGROUPPATH(AlgebraGrammarParser.PARTITIONGROUPPATHContext ctx) {
        atree.setOrderby("Partition Group Path");
    }

    @Override
    public void exitGROUPPATH(AlgebraGrammarParser.GROUPPATHContext ctx) {
        atree.setOrderby("Group Path");
    }

    @Override
    public void exitPARTITIONPATH(AlgebraGrammarParser.PARTITIONPATHContext ctx) {
        atree.setOrderby("Partition Path");
    }
    
    
    
    

//.-----------------------------------------------------------------------------------------------------
//Groupby
//.-----------------------------------------------------------------------------------------------------      
       
    @Override
    public void exitSOURCE(AlgebraGrammarParser.SOURCEContext ctx) {
        atree.setGroupby("Source");
    }
    
    
     @Override
    public void exitTARGET(AlgebraGrammarParser.TARGETContext ctx) {
        atree.setGroupby("Target");
    }
    
    
    @Override
    public void exitLENGTH(AlgebraGrammarParser.LENGTHContext ctx) {
        atree.setGroupby("Lenght");
    } 
    
    @Override
    public void exitSOURCETARGET(AlgebraGrammarParser.SOURCETARGETContext ctx) {
        atree.setGroupby("Source Target");
    }
    
    @Override
    public void exitSOURCELENGTH(AlgebraGrammarParser.SOURCELENGTHContext ctx) {
        atree.setGroupby("Source Lenght");
    }
    
     @Override
    public void exitTARGETLENGTH(AlgebraGrammarParser.TARGETLENGTHContext ctx) {
        atree.setGroupby("Target Lenght");
    }
   
     @Override
    public void exitSOURCETARGETLENGTH(AlgebraGrammarParser.SOURCETARGETLENGTHContext ctx) {
        atree.setGroupby("Source Target Lenght");
    }
 
 
   
//.-----------------------------------------------------------------------------------------------------
//pathPattern
//.-----------------------------------------------------------------------------------------------------     
    
  @Override
    public void exitPathPattern(AlgebraGrammarParser.PathPatternContext ctx) {
         
    }

    @Override
    public void enterPathPattern(AlgebraGrammarParser.PathPatternContext ctx) {
         
    }   
    
    
//.-----------------------------------------------------------------------------------------------------
//NodePattern
//.-----------------------------------------------------------------------------------------------------       
 @Override
    public void exitNodePattern(AlgebraGrammarParser.NodePatternContext ctx) {
        String var = "";
        String condition = "";
        String label = "";
        for (int i = 0; i < ctx.getChildCount(); i++) {
            if(ctx.getChild(i) instanceof AlgebraGrammarParser.VarContext)
                var = ctx.getChild(i).getText();
            else if (ctx.getChild(i) instanceof AlgebraGrammarParser.ConditionContext)
                condition =  ctx.getChild(i).getText();
            else if (ctx.getChild(i) instanceof AlgebraGrammarParser.LabelContext)
                label =  ctx.getChild(i).getText();
        }
        
        if (firstNode){
            firstNode = false;
        }
        else
            lastNode = true;
        
    }

    
 //.-----------------------------------------------------------------------------------------------------
//EdgePattern
//.-----------------------------------------------------------------------------------------------------    

 @Override
    public void exitEdgePattern(AlgebraGrammarParser.EdgePatternContext ctx) {
        
    }

    @Override
    public void enterEdgePattern(AlgebraGrammarParser.EdgePatternContext ctx) {
    }
   
   

    
//.-----------------------------------------------------------------------------------------------------
//Condition
//.-----------------------------------------------------------------------------------------------------    

    
    @Override
    public void exitCondition(AlgebraGrammarParser.ConditionContext ctx) {
         this.atree.setCondition(ctx.getText());
    }

    

    @Override
    public void exitComplexCondition(AlgebraGrammarParser.ComplexConditionContext ctx) {
        String condition = "";
        for (int i = 0; i < ctx.getChildCount(); i++) {
            
            condition += " " + ctx.getChild(i).getText();
        }
        this.atree.setCondition(condition.trim());
    }
    
    
    
    
    
    
//.-----------------------------------------------------------------------------------------------------
//Variables
//.----------------------------------------------------------------------------------------------------- 
    
    @Override
    public void exitVar(AlgebraGrammarParser.VarContext ctx) {
    }

    @Override
    public void enterVar(AlgebraGrammarParser.VarContext ctx) {
    }
    
//.-----------------------------------------------------------------------------------------------------
//Auxiliares
//.-----------------------------------------------------------------------------------------------------  
   
 @Override
    public void exitNumber(AlgebraGrammarParser.NumberContext ctx) {
    }

    @Override
    public void enterNumber(AlgebraGrammarParser.NumberContext ctx) {
    }

    @Override
    public void exitLabel(AlgebraGrammarParser.LabelContext ctx) {
    }

    @Override
    public void enterLabel(AlgebraGrammarParser.LabelContext ctx) {
    }

    @Override
    public void exitText(AlgebraGrammarParser.TextContext ctx) {
    }

    @Override
    public void enterText(AlgebraGrammarParser.TextContext ctx) {
    }

    @Override
    public void exitAttribute(AlgebraGrammarParser.AttributeContext ctx) {
    }

    @Override
    public void enterAttribute(AlgebraGrammarParser.AttributeContext ctx) {
    }

    

    
//.-----------------------------------------------------------------------------------------------------
//RPQ
//.-----------------------------------------------------------------------------------------------------    
  
    @Override
    public void exitPlus(AlgebraGrammarParser.PlusContext ctx) {
        String restrictor = null;
        if (ctx.getChildCount()>2)
            restrictor= ctx.getChild(2).getChild(1).getText();
        else if (atree.getOutterRestrictor().isBlank())
            restrictor = "WALK";
        else
            restrictor = atree.getOutterRestrictor();
         stack.push(new OneOrMoreExpression(stack.pop(),restrictor));
    }

    

    @Override
    public void exitParenthesis(AlgebraGrammarParser.ParenthesisContext ctx) {
        stack.push(new ParenthesisPathExpression(stack.pop()));
    }

    @Override
    public void enterParenthesis(AlgebraGrammarParser.ParenthesisContext ctx) {
    }
       
    @Override
    public void exitReverse(AlgebraGrammarParser.ReverseContext ctx) {
        stack.push(new LabelExpression(ctx.getText()));
    }


    @Override
    public void exitOptional(AlgebraGrammarParser.OptionalContext ctx) {
        RPQExpression right = new LabelExpression("Sn");
        RPQExpression left = stack.pop();
        stack.push(new OptionalExpression(left,right));
    }

   

    @Override
    public void exitAlternation(AlgebraGrammarParser.AlternationContext ctx) {
        final RPQExpression right = stack.pop();
        final RPQExpression left = stack.pop();
        stack.push(new AlternationPathExpression(left,right));  
    }


    @Override
    public void exitLbl(AlgebraGrammarParser.LblContext ctx) {
         stack.push(new LabelExpression(ctx.getText()));
         
    }

   

    @Override
    public void exitStar(AlgebraGrammarParser.StarContext ctx) {
        String restrictor = null;
        if (ctx.getChildCount()>2)
            restrictor= ctx.getChild(2).getChild(1).getText();
        else if (atree.getOutterRestrictor().isBlank())
            restrictor = "WALK";
        else
            restrictor = atree.getOutterRestrictor();
        
        RPQExpression right = new LabelExpression("Sn");
        RPQExpression left = new OneOrMoreExpression(stack.pop(),restrictor);
        
        stack.push(new AlternationPathExpression(left,right));
        
    }

    
    @Override
    public void exitConcatenation(AlgebraGrammarParser.ConcatenationContext ctx) {
        final RPQExpression right = stack.pop();
        final RPQExpression left = stack.pop();
        stack.push(new ConcatenationPathExpression(left,right));   
    }


    @Override
    public void exitNegated(AlgebraGrammarParser.NegatedContext ctx) {
         stack.push(new LabelExpression(ctx.getText()));
         
    }

    
    
    
   
}
