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

// Declarator rule.
// A declarator can include an optional pointer and an identifier, optionally followed by a parameter type list (for functions).
declarator
    :   pointer? IDENTIFIER parameterTypeList?
    ;

// Pointer rule.
// This rule matches one or more '*' symbols, representing pointer types.
pointer
    :   STAR pointer?
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

// Compound statement rule.
// Represents a block of statements enclosed in braces.
compoundStatement
    :   LBRACE (declaration | statement)* RBRACE
    ;

// Statement rule.
// Can be an expression statement or another compound statement.
statement
    :   expressionStatement
    |   compoundStatement
    |   selectionStatement
    |   iterationStatement
    |   jumpStatement
    ;

// Expression statement rule.
// An optional expression followed by a semicolon.
expressionStatement
    :   expression? SEMICOLON
    ;

// **Control Flow Statements**
// Includes selection statements (if-else) and iteration (while, for).

// If-else statement rule.
selectionStatement
    :   IF LPAREN expression RPAREN statement (ELSE statement)?
    ;

// Iteration statement rule (while loop or for loop).
iterationStatement
    :   WHILE LPAREN expression RPAREN statement
    |   FOR LPAREN expressionStatement expressionStatement expression? RPAREN statement
    ;

// **Jump Statements**
// Handles return statements in functions.

jumpStatement
    :   RETURN expression? SEMICOLON
    ;

// **Expressions**
// Handles the parsing of expressions, including assignments and arithmetic operations.

// Expression rule.
// An expression can be an assignment expression or a sequence of expressions separated by commas.
expression
    :   assignmentExpression (COMMA assignmentExpression)*
    ;

// Assignment expression rule.
// An assignment or a conditional expression.
assignmentExpression
    :   conditionalExpression
    |   unaryExpression assignmentOperator assignmentExpression
    ;

// Assignment operator rule.
// Matches assignment operators like '=', '*=', '/=', etc.
assignmentOperator
    :   ASSIGN
    |   MUL_ASSIGN
    |   DIV_ASSIGN
    |   MOD_ASSIGN
    |   ADD_ASSIGN
    |   SUB_ASSIGN
    ;

// Conditional expression rule.
// For simplicity, we use logical OR expressions here.
conditionalExpression
    :   logicalOrExpression
    ;

// Logical OR expression rule.
// Represents logical OR operations.
logicalOrExpression
    :   logicalAndExpression (OR_OP logicalAndExpression)*
    ;

// Logical AND expression rule.
// Represents logical AND operations.
logicalAndExpression
    :   equalityExpression (AND_OP equalityExpression)*
    ;

// Equality expression rule.
// Handles '==' and '!=' comparisons.
equalityExpression
    :   relationalExpression ( (EQ | NEQ) relationalExpression )*
    ;

// Relational expression rule.
// Handles relational operators like '<', '>', '<=', '>='.
relationalExpression
    :   additiveExpression ( (LT | GT | LE | GE) additiveExpression )*
    ;

// Additive expression rule.
// Handles addition and subtraction.
additiveExpression
    :   multiplicativeExpression ( (PLUS | MINUS) multiplicativeExpression )*
    ;

// Multiplicative expression rule.
// Handles multiplication, division, and modulus.
multiplicativeExpression
    :   unaryExpression ( (STAR | DIV | MOD) unaryExpression )*
    ;

// Unary expression rule.
// Handles unary operators and postfix expressions.
unaryExpression
    :   postfixExpression
    |   unaryOperator unaryExpression
    ;

// Unary operator rule.
// Matches unary operators like '&', '*', '+', '-', '!'.
unaryOperator
    :   AMP
    |   STAR
    |   PLUS
    |   MINUS
    |   NOT_OP
    ;

// Postfix expression rule.
// Handles function calls and array accesses.
postfixExpression
    :   primaryExpression
        ( LPAREN argumentExpressionList? RPAREN )*  // For function calls
        ( LBRACKET expression RBRACKET )*           // For array accesses
    ;

// Primary expression rule.
// Matches identifiers, constants, string literals, and parenthesized expressions.
primaryExpression
    :   IDENTIFIER
    |   CONSTANT
    |   STRING_LITERAL
    |   LPAREN expression RPAREN
    ;

// Argument expression list rule.
// A comma-separated list of assignment expressions (function arguments).
argumentExpressionList
    :   assignmentExpression (COMMA assignmentExpression)*
    ;
