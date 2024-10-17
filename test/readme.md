
root@1fad46c2b82f:/code/test# git clone https://github.com/antlr/antlr4.git

root@1fad46c2b82f:/code/test/antlr4/runtime/Cpp# mkdir build && mkdir run && cd build

root@1fad46c2b82f:/code/test/antlr4/runtime/Cpp/build# cmake .. -DANTLR_JAR_LOCATION=/code/test/antlr-4.13.2-complete.jar

root@1fad46c2b82f:/code/test/antlr4/runtime/Cpp/build# make

root@1fad46c2b82f:/code/test/antlr4/runtime/Cpp/build# DESTDIR=/code/test/antlr4/runtime/Cpp/run make install

java -jar ../antlr-4.13.2-complete.jar -Dlanguage=Cpp -no-listener -visitor Expr.g4

g++ -std=c++20 -I../antlr4/runtime/Cpp/run/usr/local/include/antlr4-runtime -o arithmetic main.cpp ../grammar/ExprLexer.cpp ../grammar/ExprParser.cpp /code/test/antlr4/runtime/Cpp/run/usr/local/lib/libantlr4-runtime.a
