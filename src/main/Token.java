public class Token {
  TokenType type;
  String value;

  Token(TokenType type) {
    this.type = type;
  }

  Token(TokenType type, String value) {
    this.type = type;
    this.value = value;
  }

  public String toString() {
    return "<Token: " + type +
      (value != null ? "; " + value : "") +
      ">";
  }
}
