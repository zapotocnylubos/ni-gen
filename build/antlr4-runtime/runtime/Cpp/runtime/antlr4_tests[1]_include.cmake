if(EXISTS "/code/build/antlr4-runtime/runtime/Cpp/runtime/antlr4_tests[1]_tests.cmake")
  include("/code/build/antlr4-runtime/runtime/Cpp/runtime/antlr4_tests[1]_tests.cmake")
else()
  add_test(antlr4_tests_NOT_BUILT antlr4_tests_NOT_BUILT)
endif()