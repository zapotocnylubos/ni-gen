cmake_minimum_required(VERSION 3.28)
project(TinyCParser)

set(CMAKE_CXX_STANDARD 20)

# Include ANTLR4 runtime
add_subdirectory(antlr4-runtime/runtime/Cpp)

# Generate ANTLR4 lexer and parser
find_package(ANTLR REQUIRED)

# ANTLR4
#find_package(ANTLR4 REQUIRED)
#include_directories(${ANTLR4_INCLUDE_DIRS})

antlr_target(LexerParser
        src/TCLexer.g4
        src/TCParser.g4
        PACKAGE antlr4-cpp-runtime
        OUTPUT_DIRECTORY ${CMAKE_BINARY_DIR}/generated
)

# Add source files
include_directories(${CMAKE_BINARY_DIR}/generated)
include_directories(${CMAKE_SOURCE_DIR}/antlr4-runtime/runtime/Cpp/runtime/src)



add_executable(ni_gen src/main.cpp ${ANTLR_LexerParser_OUTPUTS})

target_link_libraries(ni_gen antlr4_static)
