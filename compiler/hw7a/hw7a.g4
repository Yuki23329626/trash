
// The grammer of hw6a
grammar hw7a;

// Parser rules
token:(POINT|ZERO|ONE)*
;

s returns[double val]: l { $l.val = $l.val*Math.pow(2, $l.pos);} r { $val = $l.val + $r.val; System.out.printf("%f\n", $val);}
;
r returns[double val]: POINT l { $val = $l.val/2; }
| { $val = 0;}
;
l returns[double val, int pos]: b ls { $pos = $ls.pos + 1; $val = $b.val + $ls.val/2;}
;
ls returns[double val, int pos]: b ls1=ls { $pos = $ls1.pos + 1; $ls.val = $b.val + $ls1.val/2;}
| { $pos = -1; $val = 0; }
;
b returns[double val]: ZERO { $val = 0; }
| ONE { $val = 1; }
;

// lexer rules
POINT: '.';
ZERO: '0';
ONE: '1';
WHITESPACE: [ \t\r\n]+ -> skip;