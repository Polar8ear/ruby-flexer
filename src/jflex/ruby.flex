
%%

%class RubyLexer
%unicode
%line
%column

%type Token

/* main character classes */
LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]

WhiteSpace = {LineTerminator} | [ \t\f]+

/* comments */
SingleLineComment = "#" {InputCharacter}* {LineTerminator}?
EmebeddedDocumentation = "=begin" (.|{LineTerminator})+ "=end"


/* identifiers */
Identifier = [a-zA-Z][a-zA-Z0-9_]*

/* integer literals */
DecIntegerLiteral = 0 | [1-9][0-9_]*
DecLongLiteral    = {DecIntegerLiteral} [lL]

HexIntegerLiteral = 0 [xX] 0* {HexDigit} {1,8}
HexLongLiteral    = 0 [xX] 0* {HexDigit} {1,16} [lL]
HexDigit          = [0-9a-fA-F]

OctIntegerLiteral = 0+ [1-3]? {OctDigit} {1,15}
OctLongLiteral    = 0+ 1? {OctDigit} {1,21} [lL]
OctDigit          = [0-7]

/* floating point literals */
FloatLiteral  = ({FLit1}|{FLit2}|{FLit3}) {Exponent}? [fF]
DoubleLiteral = ({FLit1}|{FLit2}|{FLit3}) {Exponent}?

FLit1    = [0-9]+ \. [0-9]*
FLit2    = \. [0-9]+
FLit3    = [0-9]+
Exponent = [eE] [+-]? [0-9]+

/* string and character literals */
StringCharacter = [^\r\n\"\\]

%{
  private String yyString;
%}

%state STRING, ML_STRING

%%

<YYINITIAL> {

  /* keywords */
  "BEGIN"                        |
  "ensure"                       |
  "assert"                       |
  "nil"                          |
  "self"                         |
  "when"                         |
  "END"                          |
  "false"                        |
  "not"                          |
  "super"                        |
  "alias"                        |
  "defined?"                     |
  "or"                           |
  "then"                         |
  "yield"                        |
  "and"                          |
  "redo"                         |
  "true"                         |
  "else"                         |
  "in"                           |
  "rescue"                       |
  "undef"                        |
  "break"                        |
  "elsif"                        |
  "module"                       |
  "retry"                        |
  "unless"                       |
  "next"                         |
  "return"                       |
  "begin"                        |
  "case"                         |
  "class"                        |
  "def"                          |
  "for"                          |
  "while"                        |
  "until"                        |
  "do"                           |
  "if"                           |
  "end"                          |
  "self"                         |
  "nil"                          |
  "true"                         |
  "false"                        |
  "__FILE__"                     |
  "__LINE__"                     {  return new Token(TokenType.KEYWORD, yytext());  }



  /* operators */

  "("                            |
  ")"                            |
  "{"                            |
  "}"                            |
  "["                            |
  "]"                            |
  "+"                            |
  "-"                            |
  "*"                            |
  "**"                           |
  "/"                            |
  "//"                           |
  "%"                            |
  "<<"                           |
  ">>"                           |
  "&"                            |
  "|"                            |
  "^"                            |
  "~"                            |
  "<"                            |
  ">"                            |
  "<="                           |
  ">="                           |
  "=="                           |
  "!="                           |
  "<>"                           |
  "@"                            |
  ","                            |
  "?"                            |
  ":"                            |
  "."                            |
  ".."                           |
  "`"                            |
  "="                            |
  ";"                            |
  "+="                           |
  "-="                           |
  "*="                           |
  "/="                           |
  "//="                          |
  "%="                           |
  "&="                           |
  "|="                           |
  "^="                           |
  ">>="                          |
  "<<="                          |
  "**="                          { return new Token(TokenType.OPERATOR, yytext()); }

  /* string literal */
  (\"|\'){3}                     {
                                    yybegin(ML_STRING);
                                    yyString = "";
                                 }

  \" | \'                        {
                                    yybegin(STRING);
                                    yyString = "";
                                 }

  /* numeric literals */

  {DecIntegerLiteral}            |
  {DecLongLiteral}               |

  {HexIntegerLiteral}            |
  {HexLongLiteral}               |

  {OctIntegerLiteral}            |
  {OctLongLiteral}               |

  {FloatLiteral}                 |
  {DoubleLiteral}                |
  {FloatLiteral}[jJ]             { return new Token(TokenType.NUMBER, yytext()); }

  /* comments */
  {SingleLineComment}            {
                                    // ignore single line comments
                                 }

  {EmebeddedDocumentation}       {
                                   // ignore embedded documentation
                                 }

  /* whitespace */
  {WhiteSpace}                   { }

  /* identifiers */
  // global identifier
  \$ {Identifier}                 |

  // method identifier (allowed ? ! = at the end of identifier name)
  {Identifier} ("?"|"!"|"=")      |
  {Identifier}                   { return new Token(TokenType.IDENTIFIER, yytext()); }
}

<STRING> {
  \"                             {
                                     yybegin(YYINITIAL);
                                     // length also includes the trailing quote
                                     return new Token(TokenType.LITERAL, yyString);
                                 }

  // character such as \n \t
  \\.                            |
  {StringCharacter}+             { yyString += yytext(); }

  /* escape sequences */
  {LineTerminator}               { throw new RuntimeException(String.format("Unterminated String: %s at line %d col %d", yytext(), yyline, yycolumn)); }
}

<ML_STRING> {
  \"{3}                          {
                                     yybegin(YYINITIAL);
                                     // length also includes the trailing quote
                                     return new Token(TokenType.LITERAL, yyString);
                                 }

  // character such as \n \t
  \\.                            |
  {StringCharacter}+             { yyString += yytext(); }

  /* escape sequences */
  {LineTerminator}               { yyString += yytext(); }
}


/* error fallback */
[^]                              { throw new RuntimeException(String.format("Input Not Found: %s", yytext())); }
<<EOF>>                          { return new Token(TokenType.END_OF_FILE); }
