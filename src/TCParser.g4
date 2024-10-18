// Parser grammar for a tiny subset of the C language including functions and pointers.

parser grammar TCParser;

options {
  tokenVocab=TCLexer; // // Import tokens from TCLexer.g4
}


// **Program Structure**
// The starting rule for parsing a C program.
// A program is a sequence of function definitions and declarations.
program
    :   (functionDefinition | declaration)* EOF
    ;

// **Function Definitions and Declarations**
// Defines how functions and variable declarations are parsed.

// Function definition rule.
// A function definition consists of a return type, a function declarator, and a compound statement (function body).
functionDefinition
    :   typeSpecifier declarator compoundStatement
    ;

// Declaration rule for variable declarations.
// A declaration consists of a type specifier, an optional list of initialized declarators, and a semicolon.
declaration
    :   typeSpecifier initDeclaratorList? SEMICOLON
    ;

// **Type Specifiers**
// This rule matches basic types like 'int', 'char', 'float', and 'void'.
typeSpecifier
    :   INT
    |   CHAR
    |   FLOAT
    |   VOID
    ;

// **Declarators and Pointers**
// Handles variable and function declarators, possibly including pointers and parameters.

declarator
    :   pointer? directDeclarator
    ;

directDeclarator
    :   IDENTIFIER
        ( LBRACKET constantExpression? RBRACKET )*   // For array declarations
        ( parameterTypeList )?                       // For function declarators
    ;

// Pointer rule.
// This rule matches one or more '*' symbols, representing pointer types.
pointer
    :   STAR pointer?
    ;

// **Constants**
constantExpression
    :   conditionalExpression
    ;

// **Parameters and Arguments**
// Defines how function parameters and arguments are parsed.

// Parameter type list rule.
// Encloses the parameter list in parentheses.
parameterTypeList
    :   LPAREN parameterList? RPAREN
    ;

// Parameter list rule.
// A comma-separated list of parameter declarations.
parameterList
    :   parameterDeclaration (COMMA parameterDeclaration)*
    ;

// Parameter declaration rule.
// Each parameter has a type specifier and a declarator.
parameterDeclaration
    :   typeSpecifier declarator
    ;

// **Initialization**
// Handles variable initializations in declarations.

// Init declarator list rule.
// A comma-separated list of initialized declarators.
initDeclaratorList
    :   initDeclarator (COMMA initDeclarator)*
    ;

// Init declarator rule.
// A declarator with an optional initializer (assignment).
initDeclarator
    :   declarator (ASSIGN initializer)?
    ;

// Initializer rule.
// An initializer is an assignment expression.
initializer
    :   assignmentExpression
    ;

// **Statements**
// Defines different types of statements in the language.

compoundStatement
    :   LBRACE (declaration | statement)* RBRACE
    ;

statement
    :   labeledStatement
    |   expressionStatement
    |   compoundStatement
    |   selectionStatement
    |   iterationStatement
    |   jumpStatement
    ;

// **Labeled Statements**
labeledStatement
    :   CASE constantExpression COLON statement
    |   DEFAULT COLON statement
    ;

// **Expression Statement**
// An optional expression followed by a semicolon.
expressionStatement
    :   expression? SEMICOLON
    ;

// **Control Flow Statements**
// Includes selection statements (if-else, switch-case) and iteration (while, for, do-while).

// Selection statement rule.
selectionStatement
    :   IF LPAREN expression RPAREN statement (ELSE statement)?
    |   SWITCH LPAREN expression RPAREN compoundStatement
    ;

// Iteration statement rule.
iterationStatement
    :   WHILE LPAREN expression RPAREN statement
    |   FOR LPAREN expressionStatement expressionStatement expression? RPAREN statement
    |   DO statement WHILE LPAREN expression RPAREN SEMICOLON
    ;

// **Jump Statements**
// Handles return statements in functions.

jumpStatement
    :   RETURN expression? SEMICOLON
    |   BREAK SEMICOLON
    |   CONTINUE SEMICOLON
    ;

// **Expressions**
// Handles the parsing of expressions, including assignments and arithmetic operations.

expression
    :   assignmentExpression (COMMA assignmentExpression)*
    ;

assignmentExpression
    :   conditionalExpression                                   # assignmentExpressionConditional
    |   unaryExpression assignmentOperator assignmentExpression # assignmentExpressionAssignment
    ;

assignmentOperator
    :   ASSIGN     # assignmentOperatorAssign
    |   MUL_ASSIGN # assignmentOperatorMulAssign
    |   DIV_ASSIGN # assignmentOperatorDivAssign
    |   MOD_ASSIGN # assignmentOperatorModAssign
    |   ADD_ASSIGN # assignmentOperatorAddAssign
    |   SUB_ASSIGN # assignmentOperatorSubAssign
    ;

// **Conditional Expression**
// Include the ternary conditional operator.
conditionalExpression
    :   logicalOrExpression                                                 # conditionalExpressionLogicalOr
    |   logicalOrExpression QUESTION expression COLON conditionalExpression # conditionalExpressionTernary
    ;

// **Logical OR Expression**
logicalOrExpression
    :   logicalAndExpression (OR_OP logicalAndExpression)*
    ;

// **Logical AND Expression**
logicalAndExpression
    :   inclusiveOrExpression (AND_OP inclusiveOrExpression)*
    ;

// **Bitwise Inclusive OR Expression**
inclusiveOrExpression
    :   exclusiveOrExpression (BIT_OR exclusiveOrExpression)*
    ;

// **Bitwise Exclusive OR Expression**
exclusiveOrExpression
    :   andExpression (BIT_XOR andExpression)*
    ;

// **Bitwise AND Expression**
andExpression
    :   equalityExpression (AMP equalityExpression)*
    ;

// **Equality Expression**
equalityExpression
    :   relationalExpression ((EQ | NEQ) relationalExpression)*
    ;

// **Relational Expression**
relationalExpression
    :   shiftExpression ((LT | GT | LE | GE) shiftExpression)*
    ;

// **Shift Expression**
shiftExpression
    :   additiveExpression ((LSHIFT | RSHIFT) additiveExpression)*
    ;

// **Additive Expression**
additiveExpression
    :   multiplicativeExpression ((PLUS | MINUS) multiplicativeExpression)*
    ;

// **Multiplicative Expression**
multiplicativeExpression
    :   castExpression ((STAR | DIV | MOD) castExpression)*
    ;

// **Cast Expression**
castExpression
    :   unaryExpression                            # castExpressionUnary
    |   LPAREN typeSpecifier RPAREN castExpression # castExpressionType
    ;

// **Unary Expression**
// Handles unary operators and postfix expressions.
unaryExpression
    :   postfixExpression             # unaryExpressionPostfix
    |   unaryOperator unaryExpression # unaryExpressionUnaryOperator
    |   INCREMENT unaryExpression     # unaryExpressionIncrement
    |   DECREMENT unaryExpression     # unaryExpressionDecrement
    ;

// **Unary Operator**
// Matches unary operators like '&', '*', '+', '-', '!', '~'.
unaryOperator
    :   AMP     # unaryOperatorAddressOf
    |   STAR    # unaryOperatorDereference
    |   PLUS    # unaryOperatorPlus
    |   MINUS   # unaryOperatorMinus
    |   NOT_OP  # unaryOperatorNot
    |   BIT_NOT # unaryOperatorBitwiseNot
    ;

// **Postfix Expression**
// Handles function calls, array accesses, and postfix increment/decrement.
postfixExpression
    :   primaryExpression
        (   // Suffixes
            ( LPAREN argumentExpressionList? RPAREN )     // Function calls
            | ( LBRACKET expression RBRACKET )            // Array accesses
            | ( DOT IDENTIFIER )                          // Struct member access (if structs are included)
            | ( INCREMENT )                               // Postfix increment
            | ( DECREMENT )                               // Postfix decrement
        )*
    ;

// **Primary Expression**
// Matches identifiers, constants, string literals, and parenthesized expressions.
primaryExpression
    :   IDENTIFIER               # primaryExpressionIdentifier
    |   CONSTANT                 # primaryExpressionConstant
    |   STRING_LITERAL           # primaryExpressionStringLiteral
    |   LPAREN expression RPAREN # primaryExpressionParenthesized
    ;

// **Argument Expression List**
// A comma-separated list of assignment expressions (function arguments).
argumentExpressionList
    :   assignmentExpression (COMMA assignmentExpression)*
    ;
