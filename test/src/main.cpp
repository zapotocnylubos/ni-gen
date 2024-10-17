// src/main.cpp
#include <iostream>
#include "antlr4-runtime.h"
#include "../grammar/ExprLexer.h"
#include "../grammar/ExprParser.h"

using namespace antlr4;

int main(int argc, const char* argv[]) {
    std::string input = "3 + 4 * 5";
    ANTLRInputStream inputStream(input);
    ExprLexer lexer(&inputStream);
    CommonTokenStream tokens(&lexer);
    ExprParser parser(&tokens);

    tree::ParseTree* tree = parser.prog();
    std::cout << "Parsed expression: " << tree->toStringTree(&parser) << std::endl;

    return 0;
}
