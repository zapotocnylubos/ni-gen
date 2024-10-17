#include <iostream>
#include <fstream>
#include <string>
#include <vector>
#include <map>
#include <set>
#include <stack>

#include "../antlr4/runtime/Cpp/runtime/src/antlr4-runtime.h"
#include "grammar/TCLexer.h"
#include "grammar/TCParser.h"

using namespace antlr4;

int main(int argc, const char* argv[]) {
    std::ifstream stream;
    stream.open(argv[1]);
    ANTLRInputStream input(stream);

    TCLexer lexer(&input);
    CommonTokenStream tokens(&lexer);
    TCParser parser(&tokens);

    tree::ParseTree* tree = parser.program();
    std::cout << tree->toStringTree(&parser) << std::endl;

    return 0;
}
