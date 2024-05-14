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

package com.gdblab.main;


import com.gdblab.parser.AlgebraGrammarLexer;
import com.gdblab.parser.AlgebraGrammarParser;
import com.gdblab.parser.AlgebraListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.antlr.v4.runtime.*;

public class Main {

    public static void main(String[] args) throws IOException {
        String query = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            query ="";
            while (query.length() == 0){
                System.out.print("Query (/q quit. /e example.): ");
                query = br.readLine();
                if(query.equals("/q")){
                    System.exit(0);
                }
                else if (query.equals("/e")) {
                    query= "MATCH ALL PARTITIONS ALL GROUPS 1 PATHS TRAIL p = (?x)-[(:Likes|:Knows)* {SIMPLE} /(:Likes*|:Knows+)?]->(?y) WHERE  Property(first(p),name) = 'Apu' AND  Property(last(p),name) = 'Lisa' GROUP BY TARGET ORDER BY GROUP";
                    System.out.println(query);
                }
            }
            CharStream input = CharStreams.fromString(query);
            AlgebraGrammarLexer lexer = new AlgebraGrammarLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            AlgebraGrammarParser parser = new AlgebraGrammarParser(tokens);

            parser.removeParseListeners();
            AlgebraListener aList = new AlgebraListener();
            parser.addParseListener(aList);
            parser.query();

            if(aList.isFinished())
                aList.getAlgebraTree().visit(aList.getRoot());
            else
                System.out.println("Query Error");     
        }  
    }
}
