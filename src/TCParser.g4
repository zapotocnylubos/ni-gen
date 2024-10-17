parser grammar TCParser;

options {
  tokenVocab = TCLexer;
} // Reference to the lexer file

// Root rule
program : (declaration | functionDefinition)* EOF;

// Declarations
declaration : typeSpecifier declaratorList SEMI;

declaratorList : declarator (COMMA declarator)*;
declarator : ID (LBRACK NUM RBRACK)?;

// Function definitions
functionDefinition : typeSpecifier ID LPAREN parameterList? RPAREN compoundStatement;
parameterList : parameter (COMMA parameter)*;
parameter : typeSpecifier declarator;

// Types
typeSpecifier : INT | VOID | CHAR;

// Statements
statement
    : compoundStatement
    | expressionStatement
    | selectionStatement
    | iterationStatement
    | returnStatement;

compoundStatement : LBRACE (declaration | statement)* RBRACE;
expressionStatement : expression? SEMI;

selectionStatement : IF LPAREN expression RPAREN statement (ELSE statement)?;
iterationStatement : WHILE LPAREN expression RPAREN statement;
returnStatement : RETURN expression? SEMI;

// Expressions
expression
    : assignmentExpression
    | expression COMMA assignmentExpression;

assignmentExpression
    : logicalOrExpression
    | unaryExpression ASSIGN assignmentExpression;

logicalOrExpression : logicalAndExpression (OR logicalAndExpression)*;
logicalAndExpression : equalityExpression (AND equalityExpression)*;
equalityExpression : relationalExpression ((EQ | NE) relationalExpression)*;
relationalExpression : additiveExpression ((LT | GT | LE | GE) additiveExpression)*;
additiveExpression : multiplicativeExpression ((PLUS | MINUS) multiplicativeExpression)*;
multiplicativeExpression : unaryExpression ((MUL | DIV) unaryExpression)*;
unaryExpression : (PLUS | MINUS | NOT)? primaryExpression;
primaryExpression
    : ID
    | NUM
    | CHARLIT
    | LPAREN expression RPAREN;

// Function calls
functionCall : ID LPAREN argumentList? RPAREN;
argumentList : expression (COMMA expression)*;
