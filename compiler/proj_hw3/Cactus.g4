
// The grammer of Cactus language
grammar Cactus;

// Parser rules
token:(ID|ELSE|IF|FI|INT|MAIN|RETURN|WHILE|READ|WRITE|ADD|MINUS|MULTIPLY|DIVIDE|PERCENT|EQ|NOTEQ|GREATERTHAN|GREATERTHAN_OR_EQ|LESSTHAN|LESSTHAN_OR_EQ|AND|OR|NOT|ASSIGN|LP|RP|LB|RB|SEMICOLON|WHITESPACE|COMMENT|NUMBER)*
;

program:MAIN LP RP LB
		{System.out.println("\t"+".data");}
		declarations
		{
			System.out.println("\t"+".text");
			System.out.println("main:");
		}
		statements[0, 1] RB
;

declarations :
	INT ID SEMICOLON {System.out.println($ID.text + ":\t" + ".word 0");} declarations
|
;

statements[int reg, int label] returns[int nreg, int nlabel]:
	statement[0, $label] statements1=statements[$statement.nreg, $statement.nlabel]
	{
		$nreg = $statements1.nreg;
		$nlabel = $statements1.nlabel;
	}
|	{
		$nreg = $reg;
		$nlabel = $label;
	}
;

statement[int reg, int label] returns[int nreg, int nlabel]:
	ID ASSIGN arith_expression[$reg]
	{
		System.out.printf("\tla\t\$t%d, %s\n", $arith_expression.nreg, $ID.text);
		System.out.printf("\tsw\t\$t%d, 0(\$t%d)\n", $arith_expression.place, $arith_expression.nreg);
		$nreg = $arith_expression.nreg-1;
		$nlabel = $label;
	}
SEMICOLON
|	READ ID SEMICOLON
	{
		System.out.printf("\tli\t\$v0, 5\n\tsyscall\n");
		System.out.printf("\tla\t\$t%d, %s\n", $reg, $ID.text);
		System.out.printf("\tsw\t\$v0, 0(\$t%d)\n", $reg);
		$nreg = $reg;
		$nlabel = $label;
	}
|	WRITE arith_expression[$reg] SEMICOLON
	{
		System.out.printf("\tmove\t\$a0, \$t%d\n", $arith_expression.place);
		System.out.printf("\tli\t\$v0, 1\n\tsyscall\n");
		$nreg = $reg;
		$nlabel = $label;
	}
|	RETURN SEMICOLON
	{
		System.out.printf("\tli\t\$v0, 10\n\tsyscall\n");
		$nreg = $reg;
		$nlabel = $label;
	}
|	IF LP 
	{
		int Btrue = $label++;
		int Bfalse = $label++;
		int Lnext = $label++;
	}
	bool_expression[Btrue, Bfalse, $reg, $label] RP LB
	{
		System.out.printf("L%d:\t# then\n", Btrue);
	}
	statements1=statements[$bool_expression.nreg, $bool_expression.nlabel] RB ELSE
	{
		System.out.printf("\tb\tL%d\n", Lnext);
		System.out.printf("L%d:\t# else\n", Bfalse);
	}
	LB statements2=statements[$statements1.nreg, $statements1.nlabel] RB FI
	{
		System.out.printf("L%d:\t# endif\n", Lnext);
		$nreg = $statements2.nreg;
		$nlabel = $statements2.nlabel;
	}
|	IF LP
	{
		int Btrue = $label++;
		int Bfalse = $label++;
	}
	bool_expression[Btrue, Bfalse, $reg, $label] RP LB
	{
		System.out.printf("L%d:\t# then\n", Btrue);
	}
	statements[$bool_expression.nreg, $bool_expression.nlabel]
	{
		System.out.printf("L%d:\t# then\n", Bfalse);
	}
	RB FI
	{
		$nreg = $statements.nreg;
		$nlabel = $statements.nlabel;
	}
|	{
		int Lbegin = $label++;
		System.out.printf("L%d:\t# while\n", Lbegin);
	}
	WHILE LP
	{
		int Btrue = $label++;
		int Bfalse = $label++;
	}
	bool_expression[Btrue, Bfalse, $reg, $label] RP LB
	{
		System.out.printf("L%d:\t# body\n", Btrue);
	}
	statements[$bool_expression.nreg, $bool_expression.nlabel]
	{
		System.out.printf("\tb\tL%d\n", Lbegin);
		System.out.printf("L%d:\t# end while\n", Bfalse);
	}
	RB
	{
		$nreg = $statements.nreg;
		$nlabel = $statements.nlabel;
	}
;

bool_expression[int btrue, int bfalse, int reg, int label] returns[int nreg, int nlabel]:
	{
		int temp = $label++;
	}
	bool_term[$btrue, temp, $reg, $label] bool_expressions[$btrue, $bfalse, $bool_term.nreg, $bool_term.nlabel, temp]
	{
		$nreg = $bool_expressions.nreg;
		$nlabel = $bool_expressions.nlabel;
	}
;

bool_expressions[int btrue, int bfalse, int reg, int label, int temp] returns[int nreg, int nlabel]:
	OR
	{
		System.out.printf("L%d:\n", $temp);
	}
	bool_term[$btrue, $bfalse, $reg, $label] bool_expressions[$btrue, $bfalse, $bool_term.nreg, $bool_term.nlabel, $temp]
	{
		$nreg = $bool_expressions.nreg;
		$nlabel = $bool_expressions.nlabel;
	}
|	{
		System.out.printf("L%d:\n", $temp);
		System.out.printf("\tb\tL%d\n", $bfalse);
		$nreg = $reg;
		$nlabel = $label;
	}
;

bool_term[int btrue, int bfalse, int reg, int label] returns[int nreg, int nlabel]:
	{
		int temp = $label++;
	}
	bool_factor[temp, $bfalse, $reg, $label] bool_terms[$btrue, $bfalse, $bool_factor.nreg, $bool_factor.nlabel, temp]
	{
		$nreg = $bool_terms.nreg;
		$nlabel = $bool_terms.nlabel;
	}
;

bool_terms[int btrue, int bfalse, int reg, int label, int temp] returns[int nreg, int nlabel]:
	AND
	{
		System.out.printf("L%d:\n", $temp);
	}
	bool_factor[$btrue, $bfalse, $reg, $label] bool_terms[$btrue, $bfalse, $bool_factor.nreg, $bool_factor.nlabel, $temp]
	{
		$nreg = $bool_terms.nreg;
		$nlabel = $bool_terms.nlabel;
	}
|	{
		System.out.printf("L%d:\n", $temp);
		System.out.printf("\tb\tL%d\n", $btrue);
		$nreg = $reg;
		$nlabel = $label;
	}
;

bool_factor[int btrue, int bfalse, int reg, int label] returns[int nreg, int nlabel]:
	NOT bool_factor[$bfalse, $btrue, $reg, $label]
	{
		$nreg = $bool_factor.nreg;
		$nlabel = $bool_factor.nlabel;
	}
|	rel_expression[$btrue, $bfalse, $reg, $label]
	{
		$nreg = $rel_expression.nreg;
		$nlabel = $rel_expression.nlabel;
	}
;

rel_expression[int btrue, int bfalse, int reg, int label] returns[int nreg, int nlabel]:
	arith_expression1=arith_expression[$reg] relation_op arith_expression2=arith_expression[$arith_expression1.nreg]
	{
		System.out.printf("\t%s\t\$t%d, \$t%d, L%d\n", $relation_op.op, $arith_expression1.place, $arith_expression2.place, $btrue);
		System.out.printf("\tb\tL%d\n", $bfalse);
		$nreg = $arith_expression2.nreg+2;
		$nlabel = $label;
	}
;

relation_op returns[String op]:
	EQ {$op = "beq";}
|	NOTEQ {$op = "bne";}
|	GREATERTHAN {$op = "bgt";}
|	GREATERTHAN_OR_EQ {$op = "bge";}
|	LESSTHAN {$op = "blt";}
|	LESSTHAN_OR_EQ {$op = "ble";}
;

arith_expression[int reg] returns[int nreg, int place]:
	arith_term[$reg] arith_expressions[$arith_term.nreg, $arith_term.place]
	{
		$nreg = $arith_expressions.nreg;
		$place = $arith_expressions.place;
	}
;

arith_expressions[int reg, int leftPlace] returns[int nreg, int place]:
	ADD arith_term[$reg] arith_expressions[$arith_term.nreg, $arith_term.place]
	{
		System.out.printf("\tadd\t\$t%d, \$t%d, \$t%d\n", $leftPlace, $leftPlace, $arith_term.place);
		$nreg = $arith_term.nreg-1;
		$place = $leftPlace;
	}
|	MINUS arith_term[$reg] arith_expressions[$arith_term.nreg, $arith_term.place]
	{
		System.out.printf("\tsub\t%s, %s, %s\n", $leftPlace, $leftPlace, $arith_term.place);
		$nreg = $arith_term.nreg-1;
		$place = $leftPlace;
	}
|	{
		$nreg = $reg;
		$place = $leftPlace;
	}
;

arith_term[int reg] returns[int nreg, int place]:
	arith_factor[$reg] arith_terms[$arith_factor.nreg, $arith_factor.place]
	{
		$nreg = $arith_terms.nreg;
		$place = $arith_terms.place;
	}
;

arith_terms[int reg, int leftPlace] returns[int nreg, int place]:
	MULTIPLY arith_factor[$reg] arith_terms[$arith_factor.nreg, $arith_factor.place]
	{
		System.out.printf("\tmul\t%s, %s, %s\n", $leftPlace, $leftPlace, $arith_factor.place);
		$nreg = $arith_factor.nreg-1;
		$place = $leftPlace;
	}
|	DIVIDE arith_factor[$reg] arith_terms[$arith_factor.nreg, $arith_factor.place]
	{
		System.out.printf("\tdiv\t%s, %s, %s\n", $leftPlace, $leftPlace, $arith_factor.place);
		$nreg = $arith_factor.nreg-1;
		$place = $leftPlace;
	}
|	PERCENT arith_factor[$reg] arith_terms[$arith_factor.nreg, $arith_factor.place]
	{
		System.out.printf("\trem\t%s, %s, %s\n", $leftPlace, $leftPlace, $arith_factor.place);
		$nreg = $arith_factor.nreg-1;
		$place = $leftPlace;
	}
|	{
		$nreg = $reg;
		$place = $leftPlace;
	}
;

arith_factor[int reg] returns[int nreg, int place]:
	MINUS arith_factor1=arith_factor[$reg]
	{
		System.out.printf("\tneg\t\$t%d, \$t%d\n", $arith_factor1.place, $arith_factor1.place);
		$nreg = $arith_factor1.nreg;
		$place = $arith_factor1.place;
	}
|	primary_expression[$reg]
	{
		$nreg = $primary_expression.nreg;
		$place = $primary_expression.place;
	}
;

primary_expression[int reg] returns[int nreg, int place]:
	NUMBER
	{
		System.out.printf("\tli\t\$t%d, %d\n", $reg, $NUMBER.int);
		$place = $reg;
		$nreg = $reg+1;
	}
|	ID
	{
		System.out.printf("\tla\t\$t%d, %s\n", $reg, $ID.text);
		System.out.printf("\tlw\t\$t%d, 0(\$t%d)\n", $reg, $reg);
		$place = $reg;
		$nreg = $reg+1;
	}
|	LP arith_expression[$reg] RP
	{
		$nreg = $arith_expression.nreg;
		$place = $arith_expression.place;
	}
;

// lexer rules
TRUE: 'true';
FALSE: 'false';
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