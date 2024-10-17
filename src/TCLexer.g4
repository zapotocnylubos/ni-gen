lexer grammar TCLexer;

// Keywords
IF      : 'if';
ELSE    : 'else';
WHILE   : 'while';
RETURN  : 'return';
INT     : 'int';
VOID    : 'void';
CHAR    : 'char';

// Operators
ASSIGN  : '=';
PLUS    : '+';
MINUS   : '-';
MUL     : '*';
DIV     : '/';
LT      : '<';
GT      : '>';
LE      : '<=';
GE      : '>=';
EQ      : '==';
NE      : '!=';
AND     : '&&';
OR      : '||';
NOT     : '!';

// Punctuation
LPAREN  : '(';
RPAREN  : ')';
LBRACE  : '{';
RBRACE  : '}';
SEMI    : ';';
COMMA   : ',';
LBRACK  : '[';
RBRACK  : ']';

// Literals
ID      : [a-zA-Z_][a-zA-Z_0-9]*;
NUM     : [0-9]+;
CHARLIT : '\'' ( ~[\r\n'] | '\\' . ) '\'';
STRINGLIT: '"' ( ~[\r\n"] | '\\' . )* '"';

// Whitespace and comments
WS      : [ \t\r\n]+ -> skip;
COMMENT : '/*' .*? '*/' -> skip;
LINE_COMMENT : '//' ~[\r\n]* -> skip;
