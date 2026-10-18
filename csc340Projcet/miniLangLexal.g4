lexer grammar miniLangLexal;

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
