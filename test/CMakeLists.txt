# CMakeLists.txt
cmake_minimum_required(VERSION 3.10)
project(antlr_simple_project)

# Set C++ standard
set(CMAKE_CXX_STANDARD 11)
set(CMAKE_CXX_STANDARD_REQUIRED True)

# Add ANTLR C++ Runtime as a subdirectory
add_subdirectory(extern/antlr4/runtime/Cpp)

# Set ANTLR generation directories
set(ANTLR_JAR "${CMAKE_CURRENT_SOURCE_DIR}/antlr-4.13.2-complete.jar")
set(ANTLR_GEN_DIR "${CMAKE_CURRENT_BINARY_DIR}/generated")

# Define ANTLR command
find_package(Java REQUIRED)
find_package(JNI REQUIRED)
set(ANTLR_CMD "${Java_JAVA_EXECUTABLE}" "-jar" "${ANTLR_JAR}")

# Generate sources from grammar
file(GLOB GRAMMARS "grammar/*.g4")
foreach(grammar ${GRAMMARS})
    get_filename_component(grammar_name ${grammar} NAME_WE)
    set(output_dir "${ANTLR_GEN_DIR}/${grammar_name}")
    file(MAKE_DIRECTORY ${output_dir})

    add_custom_command(
            OUTPUT "${output_dir}/${grammar_name}Lexer.cpp" "${output_dir}/${grammar_name}Parser.cpp"
            COMMAND ${ANTLR_CMD} -Dlanguage=Cpp -o "${output_dir}" "${grammar}"
            DEPENDS "${grammar}" "${ANTLR_JAR}"
            COMMENT "Generating parser and lexer for ${grammar_name}"
    )

    list(APPEND GENERATED_SOURCES
            "${output_dir}/${grammar_name}Lexer.cpp"
            "${output_dir}/${grammar_name}Parser.cpp"
            "${output_dir}/${grammar_name}Lexer.h"
            "${output_dir}/${grammar_name}Parser.h"
    )
endforeach()

# Include ANTLR runtime headers and generated sources
include_directories(${ANTLR4_RUNTIME_INCLUDE_DIR} ${ANTLR_GEN_DIR} extern/antlr4/runtime/Cpp/include)

# Add executable
add_executable(antlr_simple_project
        src/main.cpp
        ${GENERATED_SOURCES}
)

# Link ANTLR runtime library
target_link_libraries(antlr_simple_project PRIVATE antlr4_static)
