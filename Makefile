
.PHONY: antlr
antlr:
	@echo "Creating lib directory..."
	@mkdir -p lib
	@echo "Downloading ANTLR..."
	@curl -L https://www.antlr.org/download/antlr-4.13.2-complete.jar -o lib/antlr-4.13.2-complete.jar

.PHONY: antlr_runtime
antlr_runtime:
	@echo "Creating lib directory..."
	@mkdir -p lib
	@echo "Removing old ANTLR runtime (if any)..."
	@rm -rf lib/antlr4-4.13.2
	@echo "Downloading ANTLR runtime..."
	@curl -L https://github.com/antlr/antlr4/archive/refs/tags/4.13.2.zip -o lib/antlr4-cpp-runtime-4.13.2-source.zip
	@echo "Extracting ANTLR runtime..."
	@unzip lib/antlr4-cpp-runtime-4.13.2-source.zip -d lib
	@echo "Building ANTLR runtime..."
	@(cd lib/antlr4-4.13.2/runtime/Cpp && mkdir build && mkdir run && cd build)
	@(cd lib/antlr4-4.13.2/runtime/Cpp/build && cmake .. -DANTLR_JAR_LOCATION=../../../antlr-4.13.2-complete.jar)
	@(cd lib/antlr4-4.13.2/runtime/Cpp/build && make)
	@(cd lib/antlr4-4.13.2/runtime/Cpp/build && DESTDIR=../run make install)

.PHONY: lexer
lexer:
	@echo "Creating build directory..."
	@mkdir -p build
	@echo "Generating Lexer..."
	@(cd src && java -jar ../lib/antlr-4.13.2-complete.jar -Dlanguage=Cpp -o ../build -no-listener -visitor TCLexer.g4)

.PHONY: parser
parser:
	@echo "Creating build directory..."
	@mkdir -p build
	@echo "Generating Parser..."
	@(cd src && java -jar ../lib/antlr-4.13.2-complete.jar -Dlanguage=Cpp -o ../build -no-listener -visitor -lib ../build TCParser.g4)

.PHONY: compile
compile:
	@echo "Creating bin directory..."
	@mkdir -p bin
	@echo "Compiling..."
	@g++ -std=c++20 -I lib/antlr4-4.13.2/runtime/Cpp/run/usr/local/include/antlr4-runtime -I build -o bin/tc src/*.cpp build/*.cpp lib/antlr4-4.13.2/runtime/Cpp/run/usr/local/lib/libantlr4-runtime.a
