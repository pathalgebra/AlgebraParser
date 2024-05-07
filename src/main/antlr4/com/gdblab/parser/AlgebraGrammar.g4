grammar AlgebraGrammar;

query           :   'MATCH' selector restrictor pathPattern groupby? orderby?  EOF;
pathPattern     :   pathName '=' nodePattern edgePattern nodePattern ('WHERE' complexCondition)? ;
nodePattern     :   '('var? label?')';
edgePattern     :   '-['rpq?']->' | '<-['rpq?']' | '~['rpq?']~';
selector        :   partitionSelector groupSelector pathSelector;
partitionSelector : 'ALL' 'PARTITIONS' | number 'PARTITIONS';
groupSelector   :   'ALL' 'GROUPS' | number 'GROUPS';
pathSelector    :   'ALL' 'PATHS' | number 'PATHS';

restrictor      :   'WALK' # WALK| 'SIMPLE' # SIMPLE| 'TRAIL' # TRAIL| 'ACYCLIC' # ACYCLIC| 'SHORTEST' # SHORTEST;
orderby         :   'ORDER BY' orderbyoption;
groupby         :   'GROUP BY' groupbyoption;
orderbyoption   :   'PARTITION' # PARTITION
                |   'GROUP'     #GROUP
                |   'PARTITION GROUP' #PARTITIONGROUP;
groupbyoption   :   'SOURCE' # SOURCE 
                |   'TARGET' # TARGET
                |   'LENGTH' # LENGTH
                |   'SOURCE TARGET' # SOURCETARGET
                |   'SOURCE LENGTH' # SOURCELENGTH
                |   'TARGET LENGTH' # TARGETLENGTH
                |   'SOURCE TARGET LENGTH'# SOURCETARGETLENGTH;
rpq             : '(' rpq ')'  # parenthesis
                | label     # lbl
                | '!' label # negated
                | label '^' # reverse
                | rpq '?'   # optional
                | rpq '+' rpqrestrictor? # plus
                | rpq '*' rpqrestrictor? # star
                | rpq '/' rpq # concatenation
                | rpq '|' rpq # alternation
                
                ;
rpqrestrictor   : '{'restrictor'}';
var             :   '?'LETTER ( LETTER | DIGIT)*;
pathName        :   LETTER ( LETTER | DIGIT)*;
attribute       :   LETTER+;
complexCondition:   condition | condition boolOp complexCondition;
condition       :   function compareSym '\''text'\'' ;
compareSym      :   '=' | '!=' | '<' | '>' | '<=' | '>=';
function        :   text'('text')' | text'('function')' |  text'('function','text')';
boolOp          :   'AND' | 'OR';
text            :   (LETTER | DIGIT)+;
label           :   SIGN LETTER ( LETTER | DIGIT)*;
number          :   (DIGIT)+;
LETTER          :   [a-zA-Z];
DIGIT           :   [0-9];
SIGN            :   ':' ;
SYMBOL          :   [.,:'=] ;
WS: [ \t\r\n]+ -> skip;


