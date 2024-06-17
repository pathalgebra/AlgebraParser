Algebra Parser
================================================================================
Our parser consists of a Java application divided into two main components: the query parser and the parse tree to query plan tree transformer. The query parser allows us to parse a textual query into a parse tree using our grammar. We achieve this using the ANTLR  (ANother Tool for Language Recognition), library. 

Subsequently, the parse tree to query tree transformer traverses the parse tree from left to right, extracting all the algebraic operations.
This process results in a query plan tree, which is displayed later in the command line.

Table of Contents
================================================================================
- [Project Build](#project-build)
- [Using Algebra Parser](#project-parser)
- [Example](#example)




[Project build](#project-build)
================================================================================
Algebra Parser should be able to work on any computer that supports Java 17. If you use another Java version, you have to edit the pom.xml file with the dessired version. 


Install Dependencies:
--------------------------------------------------------------------------------
Algebra parser needs:
- Apache Maven
- Java 17
  
Build the Project:
--------------------------------------------------------------------------------
```
mvn package
```

Run the project:
--------------------------------------------------------------------------------
To run the project you need to load the jar file available in the target folder.
```
java - jar AlgebraParser-1.0-SNAPSHOT-jar-with-dependencies.jar
```



[Using Algebra Parser](#project-parser)
================================================================================

The basic pattern of a query is the following:
```
'MATCH' selector restrictor? pathPattern groupby? orderby?
```
Where selector, and pathPatter are mandatory, while the rest of the parameters are optional.

The syntax of Algebra parser is described below. This syntax allows you to use each of the algebra operators, so it may differ from that exposed in SQL/PGQ.

Syntax
--------------------------------------------------------------------------------
```
query             :   'MATCH' selector restrictor? pathPattern groupby? orderby?
pathPattern       :   pathName '=' nodePattern edgePattern nodePattern ('WHERE' complexCondition)? 
nodePattern       :   '('var?')';
edgePattern       :   '-['rpq?']->' | '<-['rpq?']' | '~['rpq?']~'
selector          :   partitionSelector groupSelector pathSelector
partitionSelector :   'ALL' 'PARTITIONS' | number 'PARTITIONS'
groupSelector     :   'ALL' 'GROUPS' | number 'GROUPS'
pathSelector      :   'ALL' 'PATHS' | number 'PATHS'
restrictor        :   'WALK' | 'SIMPLE' | 'TRAIL' | 'ACYCLIC' | 'SHORTEST' 
orderby           :   'ORDER BY' orderbyoption;
groupby           :   'GROUP BY' groupbyoption;
orderbyoption     :   'PARTITION' | 'GROUP' | 'PATH'    
                  |   'PARTITION GROUP'  | 'PARTITION PATH' 
                  |   'GROUP PATH' | 'PARTITION GROUP PATH' 
groupbyoption     :   'SOURCE' | 'TARGET' | 'LENGTH' 
                  |   'SOURCE TARGET' | 'SOURCE LENGTH'
                  |   'TARGET LENGTH' | 'SOURCE TARGET LENGTH'
rpq               :   '(' rpq ')'  | label | '!' label 
                  |   label '^' | rpq '?'| rpq '+' rpqrestrictor? 
                  |   rpq '*' rpqrestrictor? | rpq '/' rpq  |
complexCondition  :   condition | condition boolOp complexCondition;
condition         :   function compareSym '\''text'\'' ;
compareSym        :   '=' | '!=' | '<' | '>' | '<=' | '>=';
function          :   text'('text')' | text'('function')' |  text'('function','text')';
boolOp            :   'AND' | 'OR';
                       rpq '|' rpq 

```

[Example](#example)
================================================================================

Query 1
```
MATCH ALL PARTITIONS ALL GROUPS 1 PATHS 
p = (?x)-[(:Likes|:Knows)*{WALK}]->(?y)  
GROUP BY TARGET ORDER BY GROUP
```

Output 1
```
Projection (ALL PARTITIONS ALL GROUPS 1 PATHS)
OrderBy (Group)
Group (Target)
-> Union
 -> Recursive Join (restrictor: WALK)
  -> Union
   -> Select: (label(edge(1)) = Likes , Se)
   -> Select: (label(edge(1)) = Knows , Se)
 -> Select: (Sn)
```
Query 2 
```
MATCH ALL PARTITIONS ALL GROUPS 1 PATHS TRAIL p = (?x)-[(:Likes|:Knows)* {SIMPLE} /(:Likes*|:Knows+)?]->(?y) WHERE  Property(first(p),name) = 'Apu' AND  Property(last(p),name) = 'Lisa' GROUP BY TARGET ORDER BY GROUP
```

Output 2
```
Projection (ALL PARTITIONS ALL GROUPS 1 PATHS)
OrderBy (Group)
Group (Target)
Restrictor (TRAIL)
-> Select( Property(first(p),name)='Apu' AND Property(last(p),name)='Lisa' )
 -> Node Join
  -> Union
   -> Recursive Join (restrictor: SIMPLE)
    -> Union
     -> Select: (label(edge(1)) = Likes , Se)
     -> Select: (label(edge(1)) = Knows , Se)
   -> Select: (Sn)
  -> Union
   -> Union
    -> Union
     -> Recursive Join (restrictor: TRAIL)
      -> Select: (label(edge(1)) = Likes , Se)
     -> Select: (Sn)
    -> Recursive Join (restrictor: TRAIL)
     -> Select: (label(edge(1)) = Knows , Se)
   -> Select: (Sn)
```
