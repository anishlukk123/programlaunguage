
	
	package lazylex;

	enum TokenType {
	  // Single-character tokens.
	  LEFT_PAREN, RIGHT_PAREN, LEFT_BRACE, RIGHT_BRACE,
	  COMMA, DOT, MINUS, PLUS, SEMICOLON, SLASH, STAR,

	  // One or two character tokens.
	  BANG, BANG_EQUAL,
	  EQUAL, EQUAL_EQUAL,
	  GREATER, GREATER_EQUAL,
	  LESS, LESS_EQUAL,

	  // Literals.
	  IDENTIFIER, STRING, NUMBER,

	  // Keywords.
	  ANDA, CLASS, ELSEE, FALSE, FUN, FORA, IFA, NIL, ORA,
	  PRINT, RETURN, SUPER, THIS, TRUE, VAR, WHIL,
	  EOF
	}

