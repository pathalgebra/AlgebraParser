Our parser consists of a Java application divided into two main components: the query parser and the parse tree to query plan tree transformer. The query parser allows us to parse a textual query into a parse tree using our grammar. We achieve this using the ANTLR ANTLR (ANother Tool for Language Recognition), library. 
Subsequently, the parse tree to query tree transformer traverses the parse tree from left to right, extracting all the algebraic operations.
This process results in a query plan tree, which is displayed later in the command line.
<dl>
  <dt>Query parser</dt>
  <dd>The parser was designed to work using the grammar described in Section \ref{sec:syntax}. The parser essentially consists of a small command-line interface where users can write queries, execute the example query, or exit the application. Whether it’s a test query or a user formulated query, the parser reads it using the ANTLR library. Essentially, the query (represented as a string) is converted into a Char Stream, which is then passed to the lexical analyzer for correctness analysis. Once the query is analyzed, common tokens are extracted, and the parsing process begins. As a result of this process, ANTLR allows us to generate a parse tree for the entered query, which serves as input for the second component.</dd>
  <dt>Parse tree to query plan tree transformer.</dt>
  <dd>This component essentially allows us to traverse the parse tree generated earlier. To achieve this, we extended the \emph{parse listener} provided by \emph{ANTLR} for our grammar. Essentially, this listener enables us to traverse the parse tree left to right in depth-first fashion, analyzing each component of the input query. For each grammar symbol (whether terminal or non-terminal), we generate methods that track whether we have entered or exited a  node in the tree. In our implementation, we maintain a data structure related to the query plan.</dd>
</dl>

```
MATCH ALL PARTITIONS ALL GROUPS 1 PATHS 
p = (?x)-[(:Likes|:Knows)*{WALK}]->(?y)  
GROUP BY TARGET ORDER BY GROUP
```
