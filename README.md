# Ruby Flexer

## Introduction

This is a lexical analyzer for the language, Ruby using JFlex. This is a part of assignment of the course TTTK2053 Compiler Construction

## Executing the Program

1. (Optional) Create RubyLexer.java from ruby.flex

```bash
  jflex src/jflex/ruby.flex -d src/main

  # Alternatively, you can delete the previous file before creating the lexer
  rm -f src/main/RubyLexer.java && jflex src/jflex/ruby.flex -d src/main
```

2. Compile the program and run the program on one of the example files `factorial.rb`

```bash
  javac -d target -cp src/main/ src/main/App.java  && java -cp target/ App src/data/factorial.rb
```