parser grammar miniLangParser;

options {
    tokenVocab = miniLangLexal;
}

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
