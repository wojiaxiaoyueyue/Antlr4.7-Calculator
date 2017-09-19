grammar Calc;

prog : stat+;

stat : expr             # printExpr
     | ID '=' expr      # assign
     | 'print(' ID ')'  # print
     ;

expr : <assoc=right> expr '^' expr # power
     | expr op=(MUL|DIV) expr   # MulDiv
     | expr op=(ADD|SUB) expr   # AddSub
     | sign=(ADD|SUB)?NUMBER       # number
     | ID                       # id
     | '(' expr ')'             # parens
     ;


ID   : [a-zA-Z]+;
NUMBER  : [0-9]+('.'([0-9]+)?)?
        | [0-9]+;
COMMENT : '/*' .*? '*/' -> skip;
LINE_COMMENT : '//' .*? '\r'? '\n' -> skip;
WS   : [ \t\r\n]+ -> skip;
MUL  : '*';
DIV  : '/';
ADD  : '+';
SUB  : '-';