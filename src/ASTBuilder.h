#ifndef NI_GEN_ASTBUILDER_H
#define NI_GEN_ASTBUILDER_H

#include <memory>
#include <vector>
#include <string>

#include "TCParser.h"
#include "TCParserBaseVisitor.h"
#include "AST.h"

// AST Builder (Visitor Implementation)

class ASTBuilder : public TCParserBaseVisitor {
public:
    std::any visitConditionalExpressionTernary(TCParser::ConditionalExpressionTernaryContext *ctx) override {
        std::cout << "Ternary expression" << std::endl;
        return visitChildren(ctx);
    }

    virtual std::any visitPrimaryExpressionIdentifier(TCParser::PrimaryExpressionIdentifierContext *ctx) override {
        std::cout << "Identifier " << ctx->IDENTIFIER()->getText() << std::endl;
        return visitChildren(ctx);
    }

    virtual std::any visitPrimaryExpressionConstant(TCParser::PrimaryExpressionConstantContext *ctx) override {
        std::cout << "Constant " << ctx->CONSTANT()->getText() << std::endl;
        return visitChildren(ctx);
    }

    virtual std::any visitPrimaryExpressionStringLiteral(TCParser::PrimaryExpressionStringLiteralContext *ctx) override {
        std::cout << "String literal " << ctx->STRING_LITERAL()->getText() << std::endl;
        return visitChildren(ctx);
    }

    virtual std::any visitPrimaryExpressionParenthesized(TCParser::PrimaryExpressionParenthesizedContext *ctx) override {
        std::cout << "Parenthesized expression" << std::endl;
        return visitChildren(ctx);
    }
};

#endif //NI_GEN_ASTBUILDER_H
