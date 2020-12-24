
// The grammer of Cactus language
grammar Cactus;

// Parser rules
token:(ID|ELSE|IF|FI|INT|MAIN|RETURN|WHILE|READ|WRITE|ADD|MINUS|MULTIPLY|DIVIDE|PERCENT|EQ|NOTEQ|GREATERTHAN|GREATERTHAN_OR_EQ|LESSTHAN|LESSTHAN_OR_EQ|AND|OR|NOT|ASSIGN|LP|RP|LB|RB|SEMICOLON|WHITESPACE|COMMENT|NUMBER)*
;
program: MAIN LP RP LB declarations statements RB
;
declarations : 
INT ID SEMICOLON declarations
|
;
statements : 
statement statements
|
;
statement : 
ID ASSIGN arith_expression SEMICOLON
| IF LP bool_expression RP LB statements RB ELSE LB statements RB FI
| IF LP bool_expression RP LB statements RB FI
| WHILE LP bool_expression RP LB statements RB
| READ ID SEMICOLON
| WRITE arith_expression SEMICOLON
| RETURN SEMICOLON
;
bool_expression :
bool_term bool_expression1
;
bool_expression1 :
OR bool_term bool_expression1
|
;
bool_term :
bool_factor bool_term1
;
bool_term1 :
AND bool_factor bool_term1
|
;
bool_factor :
NOT bool_factor
| rel_expression
;
rel_expression :
arith_expression relation_op arith_expression
;
relation_op :
EQ
| NOTEQ
| GREATERTHAN
| GREATERTHAN_OR_EQ
| LESSTHAN
| LESSTHAN_OR_EQ
;
arith_expression :
arith_term arith_expression1
;
arith_expression1 :
ADD arith_term arith_expression1
| MINUS arith_term arith_expression1
|
;
arith_term :
arith_factor arith_term1
;
arith_term1 :
MULTIPLY arith_factor arith_term1
| DIVIDE arith_factor arith_term1
| PERCENT arith_factor arith_term1
|
;
arith_factor :
MINUS arith_factor
| primary_expression
;
primary_expression :
NUMBER
| ID
| LP arith_expression RP
;

// lexer rules
ELSE:'else';
IF:'if';
FI:'fi';
INT:'int';
MAIN:'main';
RETURN:'return';
WHILE:'while';
READ:'read';
WRITE:'write';
ADD:'+';
MINUS:'-';
MULTIPLY:'*';
DIVIDE:'/';
PERCENT:'%';
EQ:'==';
NOTEQ:'!=';
GREATERTHAN:'>';
GREATERTHAN_OR_EQ:'>=';
LESSTHAN:'<';
LESSTHAN_OR_EQ:'<=';
AND:'&&';
OR:'||';
NOT:'!';
ASSIGN:'=';
LP:'(';
RP:')';
LB:'{';
RB:'}';
SEMICOLON:';';
NUMBER: [0-9]+;
ID: [a-zA-z_]+[a-zA-Z_0-9]* ;
COMMENT:'/*'('/'*?COMMENT|('/'*|'*'*)~[/*])*?'*'*?'*/' -> skip;
WHITESPACE: [ \t\r\n]+ -> skip ;
ERROR: [.];