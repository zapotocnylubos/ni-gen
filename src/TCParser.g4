// Parser grammar for a tiny subset of the C language including functions and pointers.

parser grammar TCParser;

options {
  tokenVocab=TCLexer; // Import tokens from TCLexer.g4
}

// **Program Structure**
program
    :   externalDeclaration* EOF
    ;

externalDeclaration
    :   functionDefinition
    |   declaration
    ;

// **Function Definitions and Declarations**
functionDefinition
    :   typeSpecifier declarator compoundStatement
    ;

declaration
    :   typeSpecifier initDeclaratorList? SEMICOLON
    ;

// **Type Specifiers**
typeSpecifier
    :   INT    # typeSpecifierInt
    |   CHAR   # typeSpecifierChar
    |   FLOAT  # typeSpecifierFloat
    |   DOUBLE # typeSpecifierDouble
    |   VOID   # typeSpecifierVoid
    |   BOOL   # typeSpecifierBool
    ;

// **Declarators and Pointers**
declarator
    :   pointer? directDeclarator
    ;

directDeclarator
    :   (IDENTIFIER | LPAREN declarator RPAREN) directDeclaratorSuffix*
    ;

directDeclaratorSuffix
    :   LBRACKET constantExpression? RBRACKET
    |   parameterTypeList
    ;

pointer
    :   STAR+
    ;

// **Constants**
constantExpression
    :   conditionalExpression
    ;

// **Parameters and Arguments**
parameterTypeList
    :   LPAREN parameterList? RPAREN
    ;

parameterList
    :   parameterDeclaration (COMMA parameterDeclaration)*
    ;

parameterDeclaration
    :   typeSpecifier declarator
    ;

// **Initialization**
initDeclaratorList
    :   initDeclarator (COMMA initDeclarator)*
    ;

initDeclarator
    :   declarator (ASSIGN initializer)?
    ;

initializer
    :   assignmentExpression
    ;

// **Statements**
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
    :   CASE constantExpression COLON statement # caseStatement
    |   DEFAULT COLON statement                 # defaultStatement
    ;

// **Expression Statement**
expressionStatement
    :   expression? SEMICOLON
    ;

// **Control Flow Statements**
selectionStatement
    :   IF LPAREN expression RPAREN statement (ELSE statement)? # ifStatement
    |   SWITCH LPAREN expression RPAREN compoundStatement       # switchStatement
    ;

iterationStatement
    :   WHILE LPAREN expression RPAREN statement                                        # whileStatement
    |   FOR LPAREN expressionStatement expressionStatement expression? RPAREN statement # forStatement
    |   DO statement WHILE LPAREN expression RPAREN SEMICOLON                           # doWhileStatement
    ;

// **Jump Statements**
jumpStatement
    :   RETURN expression? SEMICOLON # returnStatement
    |   BREAK SEMICOLON              # breakStatement
    |   CONTINUE SEMICOLON           # continueStatement
    ;

// **Expressions**
expression
    :   assignmentExpression (COMMA assignmentExpression)*
    ;

assignmentExpression
    : conditionalExpression                                   # assignmentExpressionConditional
    | unaryExpression assignmentOperator assignmentExpression # assignmentExpressionAssignment
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
conditionalExpression
    :   logicalOrExpression (QUESTION expression COLON conditionalExpression)?
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
    :   LPAREN typeName RPAREN castExpression    # castExpressionCast
    |   unaryExpression                          # castExpressionUnary
    ;

// **Unary Expression**
unaryExpression
    :   postfixExpression                         # unaryExpressionPostfix
    |   INCREMENT unaryExpression                 # unaryExpressionIncrement
    |   DECREMENT unaryExpression                 # unaryExpressionDecrement
    |   unaryOperator unaryExpression             # unaryExpressionUnaryOperator
    ;

// **Unary Operator**
unaryOperator
    :   AMP     # unaryOperatorAddressOf
    |   STAR    # unaryOperatorDereference
    |   PLUS    # unaryOperatorPlus
    |   MINUS   # unaryOperatorMinus
    |   NOT_OP  # unaryOperatorNot
    |   BIT_NOT # unaryOperatorBitwiseNot
    ;

// **Postfix Expression**
postfixExpression
    :   primaryExpression postfixSuffix*
    ;

postfixSuffix
    :   LPAREN argumentExpressionList? RPAREN # postfixSuffixFunctionCall
    |   LBRACKET expression RBRACKET          # postfixSuffixArrayAccess
    |   DOT IDENTIFIER                        # postfixSuffixStructMember
    |   INCREMENT                             # postfixSuffixIncrement
    |   DECREMENT                             # postfixSuffixDecrement
    ;

// **Primary Expression**
primaryExpression
    :   CONSTANT                 # primaryExpressionConstant
    |   IDENTIFIER               # primaryExpressionIdentifier
    |   STRING_LITERAL           # primaryExpressionStringLiteral
    |   LPAREN expression RPAREN # primaryExpressionParenthesized
    ;

// **Argument Expression List**
argumentExpressionList
    :   assignmentExpression (COMMA assignmentExpression)*
    ;

// **Type Name**
typeName
    :   typeSpecifier pointer?
    ;
