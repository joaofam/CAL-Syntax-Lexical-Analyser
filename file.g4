grammar file;

prog:                   decl_list function_list main;

decl_list:              decl SEMI decl_list |;

decl:                   var_decl | const_decl;

var_decl:               Variable ID COLON type;

const_decl:             Constant ID COLON type ASSIGN expression;

function_list:          function function_list |;

function:               type ID LBR parameter_list RBR Is
                        decl_list
                        Begin
                        statement_block
                        Return LBR expression | RBR SEMI
                        End;

type:                   Integer | Boolean | Void;
parameter_list:         nemp_parameter_list |;

nemp_parameter_list:    ID COLON type | ID COLON type COMMA nemp_parameter_list;

main:                   Main
                        Begin
                        decl_list
                        statement_block
                        End;

statement_block:        statement statement_block |; // fix here

statement:              ID ASSIGN expression SEMI | 
                        ID LBR arg_list RBR SEMI |
                        Begin statement_block End |
                        If condition Begin statement_block End |
                        Else Begin statement_block End |
                        While condition Begin statement_block End |
                        Skip SEMI;

expression:             fragment2 binary_arith_op fragment2 |
                        LBR expression RBR |
                        ID LBR arg_list RBR |
                        fragment2;

binary_arith_op:        op=(PLUS | MINUS);

fragment2:              ID | MINUS ID | NUMBER | True | False |
                        ID LBR arg_list RBR |;

                        // mutually left-recursive fixed through aid of https://stackoverflow.com/questions/41017948/antlr4-the-following-sets-of-rules-are-mutually-left-recursive
condition:              NEG condition |
                        LBR condition RBR |
                        expression comp_op expression |
                        condition op=(OR | AND) condition; // fix here

comp_op:                EQUAL | NOTEQUAL | GREATER | GREATEREQUAL | LESS | LESSEQUAL;

arg_list:               nemp_arg_list |;

nemp_arg_list:          ID | ID COMMA nemp_arg_list;


fragment A:       'a' | 'A';
fragment B:       'b' | 'B';
fragment C:       'c' | 'C';
fragment D:       'd' | 'D';
fragment E:       'e' | 'E';
fragment F:       'f' | 'F';
fragment G:       'g' | 'G';
fragment H:       'h' | 'H';
fragment I:       'i' | 'G';
fragment K:       'k' | 'K';
fragment L:       'l' | 'L';
fragment M:       'm' | 'M';
fragment N:       'n' | 'N';
fragment O:       'o' | 'O';
fragment P:       'p' | 'P';
fragment R:       'r' | 'R';
fragment S:       's' | 'S';
fragment T:       't' | 'T';
fragment U:       'u' | 'U';
fragment V:       'v' | 'V';
fragment W:       'w' | 'W';
fragment Y:       'y' | 'Y';

COMMA:            ',';
SEMI:             ';';
COLON:            ':';
ASSIGN:           ':=';
LBR:              '(';
RBR:              ')';
PLUS:             '+';
MINUS:            '-';
NEG:              '~';
OR:               '|';
AND:              '&';
EQUAL:            '=';
NOTEQUAL:         '!=';
GREATER:          '<';
GREATEREQUAL:     '<=';
LESS:             '>';
LESSEQUAL:        '>=';

Main:             M A I N;
Begin:            B E G I N;
End:              E N D;
Void:             V O I D;
Is:               I S;
Return:           R E T U R N;
Variable:         V A R I A B L E;
Integer:          I N T E G E R;
If:               I F;
Else:             E L S E;
True:             T R U E;
False:            F A L S E;
While:            W H I L E;
Skip:             S K I P;
Constant:         C O N S T A N T;
Boolean:          B O O L E A N;

fragment Letter:		[a-zA-Z];
fragment Digit:         [0-9];
fragment UnderScore:	'_';

BOOL:               'true' | 'false';
LINECOMMENT:      '//' ~[\r\n]* -> skip; //https://stackoverflow.com/questions/7070763/parse-comment-line
MULTICOMMENT:     '/*' (MULTICOMMENT | .)*? '*/' -> skip; // https://stackoverflow.com/questions/12898052/antlr-how-to-skip-multiline-comments
WS:               [ \t\r\n]+ -> skip; 
ID:               Letter (Letter | Digit | UnderScore)*;
NUMBER:           [0-9]+;

