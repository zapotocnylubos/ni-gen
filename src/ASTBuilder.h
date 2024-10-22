#ifndef NI_GEN_ASTBUILDER_H
#define NI_GEN_ASTBUILDER_H

#include <memory>
#include <vector>
#include <string>
#include <any>

#include "TCParser.h"
#include "TCParserBaseVisitor.h"
#include "AST.h"

// AST Builder (Visitor Implementation)

class ASTBuilder : public TCParserBaseVisitor {
public:

    std::any visitFunctionDefinition(TCParser::FunctionDefinitionContext *ctx) override {
        std::cout << "Function definition" << std::endl;
        return visitChildren(ctx);
    }

    std::any visitDeclaration(TCParser::DeclarationContext *ctx) override {
        std::cout << "Declaration" << std::endl;
        return visitChildren(ctx);
    }

    std::any visitTypeSpecifierInt(TCParser::TypeSpecifierIntContext *ctx) override {
        std::cout << "Int type" << std::endl;
        return visitChildren(ctx);
    }

    std::any visitTypeSpecifierChar(TCParser::TypeSpecifierCharContext *ctx) override {
        std::cout << "Char type" << std::endl;
        return visitChildren(ctx);
    }

    std::any visitTypeSpecifierFloat(TCParser::TypeSpecifierFloatContext *ctx) override {
        std::cout << "Float type" << std::endl;
        return visitChildren(ctx);
    }

    virtual std::any visitTypeSpecifierDouble(TCParser::TypeSpecifierDoubleContext *ctx) override {
        std::cout << "Double type" << std::endl;
        return visitChildren(ctx);
    }

    std::any visitTypeSpecifierVoid(TCParser::TypeSpecifierVoidContext *ctx) override {
        std::cout << "Void type" << std::endl;
        return visitChildren(ctx);
    }

    virtual std::any visitTypeSpecifierBool(TCParser::TypeSpecifierBoolContext *ctx) override {
        std::cout << "Bool type" << std::endl;
        return visitChildren(ctx);
    }

    std::any visitDeclarator(TCParser::DeclaratorContext *ctx) override {
        return visitChildren(ctx);
    }

    std::any visitDirectDeclarator(TCParser::DirectDeclaratorContext *ctx) override {
        std::cout << "Direct declarator " << ctx->IDENTIFIER()->getText() << std::endl;
        return visitChildren(ctx);
    }

    std::any visitPointer(TCParser::PointerContext *ctx) override {
        return visitChildren(ctx);
    }

    std::any visitConstantExpression(TCParser::ConstantExpressionContext *ctx) override {
        return visitChildren(ctx);
    }

    std::any visitParameterTypeList(TCParser::ParameterTypeListContext *ctx) override {
        return visitChildren(ctx);
    }

    std::any visitParameterList(TCParser::ParameterListContext *ctx) override {
        return visitChildren(ctx);
    }

    std::any visitParameterDeclaration(TCParser::ParameterDeclarationContext *ctx) override {
        return visitChildren(ctx);
    }

    std::any visitInitDeclaratorList(TCParser::InitDeclaratorListContext *ctx) override {
        return visitChildren(ctx);
    }

    std::any visitInitDeclarator(TCParser::InitDeclaratorContext *ctx) override {
        return visitChildren(ctx);
    }

    std::any visitInitializer(TCParser::InitializerContext *ctx) override {
        return visitChildren(ctx);
    }

    std::any visitCompoundStatement(TCParser::CompoundStatementContext *ctx) override {
        std::cout << "Compound statement" << std::endl;
        return visitChildren(ctx);
    }

    std::any visitStatement(TCParser::StatementContext *ctx) override {
        std::cout << "Statement" << std::endl;
        return visitChildren(ctx);
    }

    std::any visitCaseStatement(TCParser::CaseStatementContext *ctx) override {
        return visitChildren(ctx);
    }

    std::any visitDefaultStatement(TCParser::DefaultStatementContext *ctx) override {
        return visitChildren(ctx);
    }

    std::any visitExpressionStatement(TCParser::ExpressionStatementContext *ctx) override {
        std::cout << "Expression statement" << std::endl;
        return visitChildren(ctx);
    }

    std::any visitIfStatement(TCParser::IfStatementContext *ctx) override {
        return visitChildren(ctx);
    }

    std::any visitSwitchStatement(TCParser::SwitchStatementContext *ctx) override {
        return visitChildren(ctx);
    }

    std::any visitWhileStatement(TCParser::WhileStatementContext *ctx) override {
        return visitChildren(ctx);
    }

    std::any visitForStatement(TCParser::ForStatementContext *ctx) override {
        return visitChildren(ctx);
    }

    std::any visitDoWhileStatement(TCParser::DoWhileStatementContext *ctx) override {
        return visitChildren(ctx);
    }

    std::any visitReturnStatement(TCParser::ReturnStatementContext *ctx) override {
        std::cout << "Return statement" << std::endl;
        return visitChildren(ctx);
    }

    std::any visitBreakStatement(TCParser::BreakStatementContext *ctx) override {
        return visitChildren(ctx);
    }

    std::any visitContinueStatement(TCParser::ContinueStatementContext *ctx) override {
        return visitChildren(ctx);
    }

    std::any visitExpression(TCParser::ExpressionContext *ctx) override {
        return visitChildren(ctx);
    }

    std::any visitAssignmentExpressionConditional(TCParser::AssignmentExpressionConditionalContext *ctx) override {
        std::cout << "Conditional assignment expression" << std::endl;
        return visitChildren(ctx);
    }

    std::any visitAssignmentExpressionAssignment(TCParser::AssignmentExpressionAssignmentContext *ctx) override {
        std::cout << "Assignment expression" << std::endl;
        return visitChildren(ctx);
    }

    std::any visitAssignmentOperatorAssign(TCParser::AssignmentOperatorAssignContext *ctx) override {
        std::cout << "Assignment operator = " << std::endl;
        return visitChildren(ctx);
    }

    std::any visitAssignmentOperatorMulAssign(TCParser::AssignmentOperatorMulAssignContext *ctx) override {
        std::cout << "Assignment operator *= " << std::endl;
        return visitChildren(ctx);
    }

    std::any visitAssignmentOperatorDivAssign(TCParser::AssignmentOperatorDivAssignContext *ctx) override {
        std::cout << "Assignment operator /= " << std::endl;
        return visitChildren(ctx);
    }

    std::any visitAssignmentOperatorModAssign(TCParser::AssignmentOperatorModAssignContext *ctx) override {
        std::cout << "Assignment operator %= " << std::endl;
        return visitChildren(ctx);
    }

    std::any visitAssignmentOperatorAddAssign(TCParser::AssignmentOperatorAddAssignContext *ctx) override {
        std::cout << "Assignment operator += " << std::endl;
        return visitChildren(ctx);
    }

    std::any visitAssignmentOperatorSubAssign(TCParser::AssignmentOperatorSubAssignContext *ctx) override {
        std::cout << "Assignment operator -= " << std::endl;
        return visitChildren(ctx);
    }

//    std::any visitUnaryExpressionPostfix(TCParser::UnaryExpressionPostfixContext *ctx) override {
//        std::cout << "Unary postfix expression" << std::endl;
//        return visitChildren(ctx);
//    }

    std::any visitUnaryExpressionUnaryOperator(TCParser::UnaryExpressionUnaryOperatorContext *ctx) override {
        return visitChildren(ctx);
    }

    std::any visitUnaryExpressionIncrement(TCParser::UnaryExpressionIncrementContext *ctx) override {
        std::cout << "Unary increment expression" << std::endl;
        return visitChildren(ctx);
    }

    std::any visitUnaryExpressionDecrement(TCParser::UnaryExpressionDecrementContext *ctx) override {
        std::cout << "Unary decrement expression" << std::endl;
        return visitChildren(ctx);
    }

    std::any visitUnaryOperatorAddressOf(TCParser::UnaryOperatorAddressOfContext *ctx) override {
        std::cout << "Unary operator &" << std::endl;
        return visitChildren(ctx);
    }

    std::any visitUnaryOperatorDereference(TCParser::UnaryOperatorDereferenceContext *ctx) override {
        std::cout << "Unary operator *" << std::endl;
        return visitChildren(ctx);
    }

    std::any visitUnaryOperatorPlus(TCParser::UnaryOperatorPlusContext *ctx) override {
        std::cout << "Unary operator +" << std::endl;
        return visitChildren(ctx);
    }

    std::any visitUnaryOperatorMinus(TCParser::UnaryOperatorMinusContext *ctx) override {
        std::cout << "Unary operator -" << std::endl;
        return visitChildren(ctx);
    }

    std::any visitUnaryOperatorNot(TCParser::UnaryOperatorNotContext *ctx) override {
        std::cout << "Unary operator !" << std::endl;
        return visitChildren(ctx);
    }

    std::any visitUnaryOperatorBitwiseNot(TCParser::UnaryOperatorBitwiseNotContext *ctx) override {
        std::cout << "Unary operator ~" << std::endl;
        return visitChildren(ctx);
    }

    std::any visitPostfixExpression(TCParser::PostfixExpressionContext *ctx) override {
        return visitChildren(ctx);
    }

    std::any visitPostfixSuffixFunctionCall(TCParser::PostfixSuffixFunctionCallContext *ctx) override {
        return visitChildren(ctx);
    }

    std::any visitPostfixSuffixArrayAccess(TCParser::PostfixSuffixArrayAccessContext *ctx) override {
        return visitChildren(ctx);
    }

    std::any visitPostfixSuffixStructMember(TCParser::PostfixSuffixStructMemberContext *ctx) override {
        return visitChildren(ctx);
    }

    std::any visitPostfixSuffixIncrement(TCParser::PostfixSuffixIncrementContext *ctx) override {
        return visitChildren(ctx);
    }

    std::any visitPostfixSuffixDecrement(TCParser::PostfixSuffixDecrementContext *ctx) override {
        return visitChildren(ctx);
    }

//    virtual std::any visitPrimaryExpressionIdentifier(TCParser::PrimaryExpressionIdentifierContext *ctx) override {
//        std::cout << "Identifier " << ctx->IDENTIFIER()->getText() << std::endl;
//        return visitChildren(ctx);
//    }

//    virtual std::any visitPrimaryExpressionConstant(TCParser::PrimaryExpressionConstantContext *ctx) override {
//        std::cout << "Constant " << ctx->CONSTANT()->getText() << std::endl;
//        return visitChildren(ctx);
//    }
//
//    virtual std::any visitPrimaryExpressionStringLiteral(TCParser::PrimaryExpressionStringLiteralContext *ctx) override {
//        std::cout << "String literal " << ctx->STRING_LITERAL()->getText() << std::endl;
//        return visitChildren(ctx);
//    }
//
//    virtual std::any visitPrimaryExpressionParenthesized(TCParser::PrimaryExpressionParenthesizedContext *ctx) override {
//        std::cout << "Parenthesized expression" << std::endl;
//        return visitChildren(ctx);
//    }

//    std::any visitPrimaryExpressionIdentifier(TCParser::PrimaryExpressionIdentifierContext *ctx) {
//        std::cout << "Identifier " << ctx->IDENTIFIER()->getText() << std::endl;
//        auto identifier = std::make_shared<Identifier>();
//        identifier->name = ctx->IDENTIFIER()->getText();
//        return identifier;
////        return std::make_shared<Identifier>();
////        return std::any(identifier);
//        //return visitChildren(ctx);
//    }

    std::any visitPrimaryExpressionConstant(TCParser::PrimaryExpressionConstantContext *ctx) override {
        std::cout << "Constant " << ctx->CONSTANT()->getText() << std::endl;
        return visitChildren(ctx);
    }

//    std::any visitPrimaryExpressionStringLiteral(TCParser::PrimaryExpressionStringLiteralContext *ctx) override {
//        std::cout << "String literal " << ctx->STRING_LITERAL()->getText() << std::endl;
//        return visitChildren(ctx);
//    }
};

#endif //NI_GEN_ASTBUILDER_H
