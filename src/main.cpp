// main.cpp
// This program uses the TinyC lexer and parser to parse basic C code and prints the parse tree.

#include <iostream>
#include <fstream>
#include <string>

#include "antlr4-runtime.h"
#include "TCLexer.h"
#include "TCParser.h"
#include "AST.h"
#include "ASTBuilder.h"


using namespace antlr4;

int main(int argc, const char* argv[]) {
    // Check for input file argument
    if (argc < 2) {
        std::cerr << "Usage: " << argv[0] << " <input_file.c>" << std::endl;
        return 1;
    }

    // Read the input C code from a file
    std::ifstream stream;
    stream.open(argv[1]);
    if (!stream.is_open()) {
        std::cerr << "Could not open input file: " << argv[1] << std::endl;
        return 1;
    }

    // Create an ANTLRInputStream with the input code
    ANTLRInputStream input(stream);

    // Create a lexer instance
    TCLexer lexer(&input);

    // Create a token stream from the lexer
    CommonTokenStream tokens(&lexer);

    // print all tokens
//     tokens.fill();
//     for (auto token : tokens.getTokens()) {
//         std::cout << token->toString() << std::endl;
//     }
//     return 0;

    // Create a parser instance
    TCParser parser(&tokens);

    // Parse the input starting from the 'program' rule
    tree::ParseTree* tree = parser.program();

//     Print the parse tree in LISP-style notation
     std::cout << tree->toStringTree(&parser) << std::endl;

    // Build the AST from the parse tree
    ASTBuilder ast_builder;
    ast_builder.visit(tree);

    return 0;
}
