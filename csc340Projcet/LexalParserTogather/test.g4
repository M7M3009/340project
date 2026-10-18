grammar test ;

//lexal
IF: 'if';
ELSE: 'else';


WHILE: 'while';
FOR: 'for';
PRINT: 'print';
ADD: '+';
SUBTRACTION: '-';
MULTIPLICATION: '*';
DIVISION: '/';
MOD: '%';
EQUALITY: '==';
NOTEQUALITY: '!=';
LESSTHAN: '>';
LESSTHANOREQUAL: '>=';
MORETHAN: '<';
MORETHANOREQUAL: '<=';
ANDBOOLEAN: '&&';
ORBOOLEAN: '||';
NOT: '!';
ASSIGNMENT: '=';
SIMICOLON: ';';
OPENPARENTHESIS: '(';
CLOSEDPARENTHESIS: ')';
OPENBRACE: '{';
CLOSEDBRACE: '}';

ID : [a-zA-Z][a-zA-Z0-9]*;
INT : '0'|[1-9][0-9]*;


COMMENT : '//' ~[\r\n]* -> skip ;

WS : [ \t\r\n]+ -> skip ;


//parser
program : stmtList;

stmtList : stmt stmtList
         | /*epslon*/ ;

stmt : assignStmt SIMICOLON
 | ifStmt
 | whileStmt
 | forStmt
 | printStmt SIMICOLON
 | block;

block : OPENBRACE stmtList CLOSEDBRACE;

assignStmt : ID ASSIGNMENT expr;
ifStmt : IF OPENPARENTHESIS expr CLOSEDPARENTHESIS stmt elsePart;
elsePart :ELSE stmt | /*epslon*/ ;
whileStmt : WHILE OPENPARENTHESIS expr CLOSEDPARENTHESIS stmt;
forStmt : FOR OPENPARENTHESIS assignStmt SIMICOLON expr SIMICOLON assignStmt CLOSEDPARENTHESIS stmt;
printStmt : PRINT OPENPARENTHESIS expr CLOSEDPARENTHESIS;

expr : orExpr;
orExpr : andExpr orExprPrime;
orExprPrime : ORBOOLEAN andExpr orExprPrime | /*epslon*/;
andExpr : equalityExpr andExprPrime;
andExprPrime : ANDBOOLEAN equalityExpr andExprPrime | /*epslon*/;
equalityExpr : relExpr equalityExprPrime;    //HEERE IS LEFT FACTORED was equalityExpr : relExpr | relExpr eqOp relExpr;
equalityExprPrime : /*epslon*/ | eqOp relExpr;
eqOp : EQUALITY | NOTEQUALITY;
relExpr : addExpr relExprPrime; //here was left factor
relExprPrime : /*epslon*/ | relOp addExpr;
relOp : MORETHAN | MORETHANOREQUAL | LESSTHAN | LESSTHANOREQUAL;
addExpr : mulExpr addExprPrime;
addExprPrime : ADD mulExpr addExprPrime | SUBTRACTION mulExpr addExprPrime | /*epslon*/;
mulExpr : unaryExpr mulExprPrime;
mulExprPrime : MULTIPLICATION unaryExpr mulExprPrime | DIVISION unaryExpr mulExprPrime | MOD unaryExpr mulExprPrime | /*epslon*/;
unaryExpr : NOT unaryExpr | primary;
primary : ID | INT | OPENPARENTHESIS expr CLOSEDPARENTHESIS;
