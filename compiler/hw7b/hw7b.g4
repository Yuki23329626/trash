
// The grammer of hw7b
grammar hw7b;

// Parser rules
token:(POINT|ZERO|ONE)*
;

s returns[double val]: l[1] { $l.val = $l.val*Math.pow(2, $l.pos);} r { $val = $l.val + $r.val; System.out.printf("%f\n", $val);}
;
r returns[double val]: POINT l[0] { $val = $l.val/2; }
| { $val = 0;}
;
l [int side] returns[double val, int pos]: b ls[$side] { if($side == 1){$pos = $ls.pos+1; $val = $b.val + $ls.val/2;}else if($side == 0){$val = $b.val + $ls.val/2;}}
;
ls [int side] returns[double val, int pos]: b ls1=ls[$side] { if($side == 1){$pos = $ls1.pos+1; $val = $b.val + $ls1.val/2;}else if($side == 0){$val = $b.val + $ls1.val/2;}}
| { if($side == 1){$pos = -1; $val = 0;}else if($side == 0){$val = 0;}}
;
b returns[double val]: ZERO { $val = 0; }
| ONE { $val = 1; }
;

// lexer rules
POINT: '.';
ZERO: '0';
ONE: '1';
WHITESPACE: [ \t\r\n]+ -> skip ;
ERROR: [.];