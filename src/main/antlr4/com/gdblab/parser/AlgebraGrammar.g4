grammar AlgebraGrammar;

pathQuery       :   'MATCH' projection restrictor_ext? pathPattern groupby? orderby?  EOF;
projection      :   partProj groupProj pathProj;
partProj        :   'ALL' 'PARTITIONS' | number 'PARTITIONS';
groupProj       :   'ALL' 'GROUPS' | number 'GROUPS';
pathProj        :   'ALL' 'PATHS' | number 'PATHS';
restrictor_ext  :   'WALK' # WALK | 'TRAIL' # TRAIL| 'SIMPLE' # SIMPLE| 'ACYCLIC' # ACYCLIC| 'SHORTEST' # SHORTEST;
orderby         :   'ORDER BY' orderbyoption;
groupby         :   'GROUP BY' groupbyoption;
orderbyoption   :   'PARTITION' # PARTITION
                |   'GROUP'     #GROUP
                |   'PATH'     #PATH
                |   'PARTITION GROUP' #PARTITIONGROUP
                |   'PARTITION PATH' #PARTITIONPATH
                |   'GROUP PATH' #GROUPPATH
                |   'PARTITION GROUP PATH' #PARTITIONGROUPPATH;
groupbyoption   :   'SOURCE' # SOURCE 
                |   'TARGET' # TARGET
                |   'LENGTH' # LENGTH
                |   'SOURCE TARGET' # SOURCETARGET
                |   'SOURCE LENGTH' # SOURCELENGTH
                |   'TARGET LENGTH' # TARGETLENGTH
                |   'SOURCE TARGET LENGTH'# SOURCETARGETLENGTH;
pathPattern     :   pathName '=' nodePattern edgePattern nodePattern ('WHERE' complexCondition)? ;
nodePattern     :   '('var?')';
edgePattern     :   '-['rpq?']->' | '<-['rpq?']' | '~['rpq?']~';


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
rpqrestrictor   : '{'restrictor_ext'}';
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


