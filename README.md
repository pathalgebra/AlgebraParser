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

Syntax
--------------------------------------------------------------------------------
```
query           :   'MATCH' selector restrictor? pathPattern groupby? orderby?
pathPattern     :   pathName '=' nodePattern edgePattern nodePattern ('WHERE' complexCondition)? 
nodePattern     :   '('var?')';
edgePattern     :   '-['rpq?']->' | '<-['rpq?']' | '~['rpq?']~'
selector        :   partitionSelector groupSelector pathSelector
partitionSelector : 'ALL' 'PARTITIONS' | number 'PARTITIONS'
groupSelector   :   'ALL' 'GROUPS' | number 'GROUPS'
pathSelector    :   'ALL' 'PATHS' | number 'PATHS'
restrictor      :   'WALK' | 'SIMPLE' | 'TRAIL' | 'ACYCLIC' | 'SHORTEST' 
orderby         :   'ORDER BY' orderbyoption;
groupby         :   'GROUP BY' groupbyoption;
orderbyoption   :   'PARTITION' | 'GROUP' | 'PATH'    
                |   'PARTITION GROUP'  | 'PARTITION PATH' 
                |   'GROUP PATH' | 'PARTITION GROUP PATH' 
groupbyoption   :   'SOURCE' | 'TARGET' | 'LENGTH' 
                |   'SOURCE TARGET' | 'SOURCE LENGTH'
                |   'TARGET LENGTH' | 'SOURCE TARGET LENGTH'
rpq             : '(' rpq ')'  | label | '!' label 
                | label '^' | rpq '?'| rpq '+' rpqrestrictor? 
                | rpq '*' rpqrestrictor? | rpq '/' rpq  |
                  rpq '|' rpq 

```

[Example](#example)
================================================================================

Query
```
MATCH ALL PARTITIONS ALL GROUPS 1 PATHS 
p = (?x)-[(:Likes|:Knows)*{WALK}]->(?y)  
GROUP BY TARGET ORDER BY GROUP
```

Output
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
