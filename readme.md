# TinyC Compiler Project

## Overview

This repository contains the implementation of a compiler for **TinyC**, a simple C-like programming language.
The compiler targets the LLVM IR and generates code for the **Tiny86** backend.
The project is developed as part of a term-long course on compiler construction, focusing on both theoretical and practical aspects of backend optimization and code generation.

## Project Structure

The project is structured into several components, reflecting the different stages of the compilation process:

- **Syntax & Semantic Analysis**:
    - Parsing TinyC source code into an Abstract Syntax Tree (AST)
    - Type checking and ensuring semantic correctness

- **LLVM IR Generation**:
    - Translating TinyC code to LLVM Intermediate Representation (IR)
    - Includes data types, functions, and control flow constructs

- **Optimization**:
    - Basic optimization passes to improve the performance of the generated IR

- **Code Generation**:
    - Targeting Tiny86, a simplified CPU architecture
    - Converting LLVM IR to Tiny86 assembly

## Development Phases

The project is developed incrementally, with 5 major deadlines throughout the course.
Each deadline will be tagged as a branch in this repository (`deadline1`, `deadline2`, etc.),
and a brief description of the progress will be included in the `README`.

1. Syntax & Semantics
2. Parser (to ASTs)
3. Translation to LLVM IR
4. Typechecking
5. Tiny86 code generation

## Requirements

- **LLVM**: The compiler leverages LLVM libraries for generating and optimizing intermediate representation.
- **Tiny86**: The final output is targeted towards the Tiny86 backend, which simulates a simplified CPU architecture.

## Getting Started

To build the compiler:

```shell
make antlr antlr_runtime
make lexer parser
make compile
```

Try to parse a TinyC source file:

```shell
./bin/tc example/simple.c
```
