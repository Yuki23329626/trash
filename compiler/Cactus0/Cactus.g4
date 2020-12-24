
// The grammer of Cactus
grammar Cactus;

// Parser rules
token:(ID|ELSE|IF|FI|INT|MAIN|RETURN|WHILE|READ|WRITE|ADD|MINUS|MULTIPLY|DIVIDE|PERCENT|EQUALS|NOTEQUALS|GREATERTHAN|GREATERTHAN_OR_EQUALS|LESSTHAN|LESSTHAN_OR_EQUALS|AND|OR|NOT|ASSIGN|LPARENTHESIS|RPARENTHESIS|LBRACE|RBRACE|SEMICOLON|WHITESPACE|COMMENT|NUMBER)*;

// lexer rules
ID: [a-zA-z_]+[a-zA-Z_0-9]* ;
NUMBER: [0-9]+;
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
EQUALS:'=';
NOTEQUALS:'!=';
GREATERTHAN:'>';
GREATERTHAN_OR_EQUALS:'>=';
LESSTHAN:'<';
LESSTHAN_OR_EQUALS:'<=';
AND:'&&';
OR:'||';
NOT:'!';
ASSIGN:'=';
LPARENTHESIS:'(';
RPARENTHESIS:')';
LBRACE:'{';
RBRACE:'}';
SEMICOLON:';';
COMMENT:'/*'(COMMENT|.)*?'*/' -> skip;
WHITESPACE: [ \t\r\n]+ -> skip ;
