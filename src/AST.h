#ifndef NI_GEN_TCAST_H
#define NI_GEN_TCAST_H

#include <memory>
#include <vector>
#include <string>

// AST Node Definitions

// Base class for all AST nodes
class ASTNode {
public:
    virtual ~ASTNode() = default;
};

// Program node
class Program : public ASTNode {
public:
    std::vector<std::unique_ptr<ASTNode>> externalDeclarations; // functionDefinition or declaration
};

// FunctionDefinition node
class FunctionDefinition : public ASTNode {
public:
    std::unique_ptr<ASTNode> typeSpecifier;
    std::unique_ptr<ASTNode> declarator;
    std::unique_ptr<ASTNode> compoundStatement;
};

// Declaration node
class Declaration : public ASTNode {
public:
    std::unique_ptr<ASTNode> typeSpecifier;
    std::vector<std::unique_ptr<ASTNode>> initDeclaratorList;
};

// TypeSpecifier node
class TypeSpecifier : public ASTNode {
public:
    std::string typeName; // "int", "char", "float", or "void"
};

// Pointer node
class Pointer : public ASTNode {
public:
    int level; // Number of '*'s
};

// Declarator node
class Declarator : public ASTNode {
public:
    std::unique_ptr<ASTNode> pointer; // May be nullptr
    std::unique_ptr<ASTNode> directDeclarator;
};

// DirectDeclarator node
class DirectDeclarator : public ASTNode {
public:
    std::string identifier;
    std::vector<std::unique_ptr<ASTNode>> arraySizes; // For array dimensions
    std::unique_ptr<ASTNode> parameterTypeList; // For function parameters
};

// ParameterTypeList node
class ParameterTypeList : public ASTNode {
public:
    std::vector<std::unique_ptr<ASTNode>> parameterList; // List of ParameterDeclaration
};

// ParameterDeclaration node
class ParameterDeclaration : public ASTNode {
public:
    std::unique_ptr<ASTNode> typeSpecifier;
    std::unique_ptr<ASTNode> declarator;
};

// InitDeclarator node
class InitDeclarator : public ASTNode {
public:
    std::unique_ptr<ASTNode> declarator;
    std::unique_ptr<ASTNode> initializer; // May be nullptr
};

// Initializer node
class Initializer : public ASTNode {
public:
    std::unique_ptr<ASTNode> assignmentExpression;
};

// CompoundStatement node
class CompoundStatement : public ASTNode {
public:
    std::vector<std::unique_ptr<ASTNode>> blockItems; // Declarations or statements
};

// Statement node (base class)
class Statement : public ASTNode {
};

// LabeledStatement node
class LabeledStatement : public Statement {
public:
    enum class LabelType { Case, Default };
    LabelType labelType;
    std::unique_ptr<ASTNode> expression; // For "case", this is the constant expression
    std::unique_ptr<ASTNode> statement;
};

// ExpressionStatement node
class ExpressionStatement : public Statement {
public:
    std::unique_ptr<ASTNode> expression; // May be nullptr
};

// SelectionStatement node
class SelectionStatement : public Statement {
public:
    enum class Type { If, IfElse, Switch };
    Type type;
    std::unique_ptr<ASTNode> condition;
    std::unique_ptr<ASTNode> thenStatement;
    std::unique_ptr<ASTNode> elseStatement; // For if-else, may be nullptr
};

// IterationStatement node
class IterationStatement : public Statement {
public:
    enum class Type { While, DoWhile, For };
    Type type;
    std::unique_ptr<ASTNode> initialization; // For "for" loop
    std::unique_ptr<ASTNode> condition;
    std::unique_ptr<ASTNode> increment; // For "for" loop
    std::unique_ptr<ASTNode> statement;
};

// JumpStatement node
class JumpStatement : public Statement {
public:
    enum class Type { Return, Break, Continue };
    Type type;
    std::unique_ptr<ASTNode> expression; // For "return", may be nullptr
};

// Expression node (base class)
class Expression : public ASTNode {
};

// AssignmentExpression node
class AssignmentExpression : public Expression {
public:
    std::unique_ptr<ASTNode> left;
    std::string op; // Assignment operator
    std::unique_ptr<ASTNode> right;
};

// ConditionalExpression node
class ConditionalExpression : public Expression {
public:
    std::unique_ptr<ASTNode> condition;
    std::unique_ptr<ASTNode> trueExpression;
    std::unique_ptr<ASTNode> falseExpression;
};

// BinaryExpression node
class BinaryExpression : public Expression {
public:
    std::string op;
    std::unique_ptr<ASTNode> left;
    std::unique_ptr<ASTNode> right;
};

// UnaryExpression node
class UnaryExpression : public Expression {
public:
    std::string op;
    std::unique_ptr<ASTNode> operand;
};

// PostfixExpression node
class PostfixExpression : public Expression {
public:
    std::unique_ptr<ASTNode> primary;
    struct Suffix {
        enum class Type { FunctionCall, ArrayAccess, MemberAccess, PostIncrement, PostDecrement };
        Type type;
        std::unique_ptr<ASTNode> expression; // For function arguments or array index
        std::string memberName; // For member access
    };
    std::vector<Suffix> suffixes;
};

// PrimaryExpression node
class PrimaryExpression : public Expression {
public:
    enum class Type { Identifier, Constant, StringLiteral, Expression };
    Type type;
    std::string value; // For identifier, constant, string literal
    std::unique_ptr<ASTNode> expression; // For parenthesized expression
};

// ArgumentExpressionList node
class ArgumentExpressionList : public ASTNode {
public:
    std::vector<std::unique_ptr<ASTNode>> arguments;
};

#endif //NI_GEN_AST_H
