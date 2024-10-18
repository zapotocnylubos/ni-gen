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
};

#endif //NI_GEN_ASTBUILDER_H
