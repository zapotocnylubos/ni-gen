// Lexer grammar for a tiny subset of the C language including functions and pointers.

lexer grammar TCLexer;

// **Keywords**
// Tokens for basic data types and other keywords.
INT         :   'int';
CHAR        :   'char';
FLOAT       :   'float';
VOID        :   'void';
IF          :   'if';
ELSE        :   'else';
FOR         :   'for';
WHILE       :   'while';
DO          :   'do';
SWITCH      :   'switch';
CASE        :   'case';
DEFAULT     :   'default';
RETURN      :   'return';
BREAK       :   'break';
CONTINUE    :   'continue';

// **Operators and Punctuation**
// Tokens for operators and punctuation symbols used in the language.
SEMICOLON   :   ';';
COLON       :   ':';
COMMA       :   ',';
DOT         :   '.';
QUESTION    :   '?';

ASSIGN      :   '=';
ADD_ASSIGN  :   '+=';
SUB_ASSIGN  :   '-=';
MUL_ASSIGN  :   '*=';
DIV_ASSIGN  :   '/=';
MOD_ASSIGN  :   '%=';

PLUS        :   '+';
MINUS       :   '-';
STAR        :   '*';
DIV         :   '/';
MOD         :   '%';

INCREMENT   :   '++';
DECREMENT   :   '--';

LT          :   '<';
GT          :   '>';
LE          :   '<=';
GE          :   '>=';

EQ          :   '==';
NEQ         :   '!=';

AND_OP      :   '&&';
OR_OP       :   '||';
NOT_OP      :   '!';

AMP         :   '&';
BIT_OR      :   '|';
BIT_XOR     :   '^';
BIT_NOT     :   '~';
LSHIFT      :   '<<';
RSHIFT      :   '>>';

// Parentheses and brackets
LPAREN      :   '(';
RPAREN      :   ')';
LBRACE      :   '{';
RBRACE      :   '}';
LBRACKET    :   '[';
RBRACKET    :   ']';

// **Identifiers**
// Matches variable and function names starting with a letter or underscore.
IDENTIFIER
    :   [a-zA-Z_] [a-zA-Z0-9_]*
    ;

// **Constants**
// Matches integer constants, floating-point constants, character constants, and boolean literals.
CONSTANT
    :   IntegerConstant
    |   FloatingConstant
    |   CharacterConstant
    |   BOOLEAN_LITERAL
    ;

// **Boolean Literals**
BOOLEAN_LITERAL
    :   'true' | 'false'
    ;

// **String Literals**
// Matches string literals enclosed in double quotes.
STRING_LITERAL
    :   '"' (EscapeSequence | ~["\\])* '"'
    ;

// **Fragments**
// Helper rules used within other lexer rules (not tokens themselves).

// Matches decimal integer constants.
fragment IntegerConstant
    :   DecimalConstant
    ;

// Matches decimal numbers (e.g., '123', '0').
fragment DecimalConstant
    :   [1-9] [0-9]*    // Non-zero starting digit.
    |   '0'             // Zero.
    ;

// Matches floating-point constants (e.g., '3.14', '0.1e-2').
fragment FloatingConstant
    :   [0-9]+ '.' [0-9]* ExponentPart? FloatSuffix?
    |   '.' [0-9]+ ExponentPart? FloatSuffix?
    |   [0-9]+ ExponentPart FloatSuffix?
    ;

// Matches the exponent part of floating constants (e.g., 'e+1', 'E-2').
fragment ExponentPart
    :   [eE] [+-]? [0-9]+
    ;

// Matches floating-point suffixes ('f' or 'F').
fragment FloatSuffix
    :   [fF]
    ;

// Matches character constants (e.g., 'a', '\n').
fragment CharacterConstant
    :   '\'' (EscapeSequence | ~['\\]) '\''
    ;

// Matches escape sequences in strings and character constants.
fragment EscapeSequence
    :   '\\' [abfnrtv\\'"?]     // Standard escape sequences.
    |   '\\' OctalEscape        // Octal escape sequences.
    ;

// Corrected OctalEscape fragment.
fragment OctalEscape
    :   [0-7] [0-7]? [0-7]?     // Matches one to three octal digits.
    ;

// **Comments and Whitespace**
// Rules to skip over comments and whitespace.

// Skips block comments (e.g., '/* comment */').
COMMENT
    :   '/*' .*? '*/' -> skip
    ;

// Skips line comments (e.g., '// comment').
LINE_COMMENT
    :   '//' ~[\r\n]* -> skip
    ;

// Skips whitespace (spaces, tabs, newlines, form feed).
WS
    :   [ \t\r\n\f]+ -> skip
    ;