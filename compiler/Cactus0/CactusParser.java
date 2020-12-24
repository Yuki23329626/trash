// Generated from Cactus.g4 by ANTLR 4.5.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CactusParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ID=1, NUMBER=2, ELSE=3, IF=4, FI=5, INT=6, MAIN=7, RETURN=8, WHILE=9, 
		READ=10, WRITE=11, ADD=12, MINUS=13, MULTIPLY=14, DIVIDE=15, PERCENT=16, 
		EQUALS=17, NOTEQUALS=18, GREATERTHAN=19, GREATERTHAN_OR_EQUALS=20, LESSTHAN=21, 
		LESSTHAN_OR_EQUALS=22, AND=23, OR=24, NOT=25, ASSIGN=26, LPARENTHESIS=27, 
		RPARENTHESIS=28, LBRACE=29, RBRACE=30, SEMICOLON=31, COMMENT=32, WHITESPACE=33;
	public static final int
		RULE_token = 0;
	public static final String[] ruleNames = {
		"token"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'else'", "'if'", "'fi'", "'int'", "'main'", "'return'", 
		"'while'", "'read'", "'write'", "'+'", "'-'", "'*'", "'/'", "'%'", null, 
		"'!='", "'>'", "'>='", "'<'", "'<='", "'&&'", "'||'", "'!'", null, "'('", 
		"')'", "'{'", "'}'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ID", "NUMBER", "ELSE", "IF", "FI", "INT", "MAIN", "RETURN", "WHILE", 
		"READ", "WRITE", "ADD", "MINUS", "MULTIPLY", "DIVIDE", "PERCENT", "EQUALS", 
		"NOTEQUALS", "GREATERTHAN", "GREATERTHAN_OR_EQUALS", "LESSTHAN", "LESSTHAN_OR_EQUALS", 
		"AND", "OR", "NOT", "ASSIGN", "LPARENTHESIS", "RPARENTHESIS", "LBRACE", 
		"RBRACE", "SEMICOLON", "COMMENT", "WHITESPACE"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Cactus.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CactusParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TokenContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CactusParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CactusParser.ID, i);
		}
		public List<TerminalNode> ELSE() { return getTokens(CactusParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(CactusParser.ELSE, i);
		}
		public List<TerminalNode> IF() { return getTokens(CactusParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(CactusParser.IF, i);
		}
		public List<TerminalNode> FI() { return getTokens(CactusParser.FI); }
		public TerminalNode FI(int i) {
			return getToken(CactusParser.FI, i);
		}
		public List<TerminalNode> INT() { return getTokens(CactusParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(CactusParser.INT, i);
		}
		public List<TerminalNode> MAIN() { return getTokens(CactusParser.MAIN); }
		public TerminalNode MAIN(int i) {
			return getToken(CactusParser.MAIN, i);
		}
		public List<TerminalNode> RETURN() { return getTokens(CactusParser.RETURN); }
		public TerminalNode RETURN(int i) {
			return getToken(CactusParser.RETURN, i);
		}
		public List<TerminalNode> WHILE() { return getTokens(CactusParser.WHILE); }
		public TerminalNode WHILE(int i) {
			return getToken(CactusParser.WHILE, i);
		}
		public List<TerminalNode> READ() { return getTokens(CactusParser.READ); }
		public TerminalNode READ(int i) {
			return getToken(CactusParser.READ, i);
		}
		public List<TerminalNode> WRITE() { return getTokens(CactusParser.WRITE); }
		public TerminalNode WRITE(int i) {
			return getToken(CactusParser.WRITE, i);
		}
		public List<TerminalNode> ADD() { return getTokens(CactusParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(CactusParser.ADD, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(CactusParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(CactusParser.MINUS, i);
		}
		public List<TerminalNode> MULTIPLY() { return getTokens(CactusParser.MULTIPLY); }
		public TerminalNode MULTIPLY(int i) {
			return getToken(CactusParser.MULTIPLY, i);
		}
		public List<TerminalNode> DIVIDE() { return getTokens(CactusParser.DIVIDE); }
		public TerminalNode DIVIDE(int i) {
			return getToken(CactusParser.DIVIDE, i);
		}
		public List<TerminalNode> PERCENT() { return getTokens(CactusParser.PERCENT); }
		public TerminalNode PERCENT(int i) {
			return getToken(CactusParser.PERCENT, i);
		}
		public List<TerminalNode> EQUALS() { return getTokens(CactusParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(CactusParser.EQUALS, i);
		}
		public List<TerminalNode> NOTEQUALS() { return getTokens(CactusParser.NOTEQUALS); }
		public TerminalNode NOTEQUALS(int i) {
			return getToken(CactusParser.NOTEQUALS, i);
		}
		public List<TerminalNode> GREATERTHAN() { return getTokens(CactusParser.GREATERTHAN); }
		public TerminalNode GREATERTHAN(int i) {
			return getToken(CactusParser.GREATERTHAN, i);
		}
		public List<TerminalNode> GREATERTHAN_OR_EQUALS() { return getTokens(CactusParser.GREATERTHAN_OR_EQUALS); }
		public TerminalNode GREATERTHAN_OR_EQUALS(int i) {
			return getToken(CactusParser.GREATERTHAN_OR_EQUALS, i);
		}
		public List<TerminalNode> LESSTHAN() { return getTokens(CactusParser.LESSTHAN); }
		public TerminalNode LESSTHAN(int i) {
			return getToken(CactusParser.LESSTHAN, i);
		}
		public List<TerminalNode> LESSTHAN_OR_EQUALS() { return getTokens(CactusParser.LESSTHAN_OR_EQUALS); }
		public TerminalNode LESSTHAN_OR_EQUALS(int i) {
			return getToken(CactusParser.LESSTHAN_OR_EQUALS, i);
		}
		public List<TerminalNode> AND() { return getTokens(CactusParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(CactusParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(CactusParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(CactusParser.OR, i);
		}
		public List<TerminalNode> NOT() { return getTokens(CactusParser.NOT); }
		public TerminalNode NOT(int i) {
			return getToken(CactusParser.NOT, i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(CactusParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(CactusParser.ASSIGN, i);
		}
		public List<TerminalNode> LPARENTHESIS() { return getTokens(CactusParser.LPARENTHESIS); }
		public TerminalNode LPARENTHESIS(int i) {
			return getToken(CactusParser.LPARENTHESIS, i);
		}
		public List<TerminalNode> RPARENTHESIS() { return getTokens(CactusParser.RPARENTHESIS); }
		public TerminalNode RPARENTHESIS(int i) {
			return getToken(CactusParser.RPARENTHESIS, i);
		}
		public List<TerminalNode> LBRACE() { return getTokens(CactusParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(CactusParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(CactusParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(CactusParser.RBRACE, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(CactusParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CactusParser.SEMICOLON, i);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(CactusParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(CactusParser.WHITESPACE, i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(CactusParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(CactusParser.COMMENT, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(CactusParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(CactusParser.NUMBER, i);
		}
		public TokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitToken(this);
		}
	}

	public final TokenContext token() throws RecognitionException {
		TokenContext _localctx = new TokenContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_token);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(5);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << NUMBER) | (1L << ELSE) | (1L << IF) | (1L << FI) | (1L << INT) | (1L << MAIN) | (1L << RETURN) | (1L << WHILE) | (1L << READ) | (1L << WRITE) | (1L << ADD) | (1L << MINUS) | (1L << MULTIPLY) | (1L << DIVIDE) | (1L << PERCENT) | (1L << EQUALS) | (1L << NOTEQUALS) | (1L << GREATERTHAN) | (1L << GREATERTHAN_OR_EQUALS) | (1L << LESSTHAN) | (1L << LESSTHAN_OR_EQUALS) | (1L << AND) | (1L << OR) | (1L << NOT) | (1L << ASSIGN) | (1L << LPARENTHESIS) | (1L << RPARENTHESIS) | (1L << LBRACE) | (1L << RBRACE) | (1L << SEMICOLON) | (1L << COMMENT) | (1L << WHITESPACE))) != 0)) {
				{
				{
				setState(2);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << NUMBER) | (1L << ELSE) | (1L << IF) | (1L << FI) | (1L << INT) | (1L << MAIN) | (1L << RETURN) | (1L << WHILE) | (1L << READ) | (1L << WRITE) | (1L << ADD) | (1L << MINUS) | (1L << MULTIPLY) | (1L << DIVIDE) | (1L << PERCENT) | (1L << EQUALS) | (1L << NOTEQUALS) | (1L << GREATERTHAN) | (1L << GREATERTHAN_OR_EQUALS) | (1L << LESSTHAN) | (1L << LESSTHAN_OR_EQUALS) | (1L << AND) | (1L << OR) | (1L << NOT) | (1L << ASSIGN) | (1L << LPARENTHESIS) | (1L << RPARENTHESIS) | (1L << LBRACE) | (1L << RBRACE) | (1L << SEMICOLON) | (1L << COMMENT) | (1L << WHITESPACE))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(7);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3#\13\4\2\t\2\3\2\7"+
		"\2\6\n\2\f\2\16\2\t\13\2\3\2\2\2\3\2\2\3\3\2\3#\n\2\7\3\2\2\2\4\6\t\2"+
		"\2\2\5\4\3\2\2\2\6\t\3\2\2\2\7\5\3\2\2\2\7\b\3\2\2\2\b\3\3\2\2\2\t\7\3"+
		"\2\2\2\3\7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}