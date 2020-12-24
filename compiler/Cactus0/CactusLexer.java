// Generated from Cactus.g4 by ANTLR 4.5.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CactusLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"ID", "NUMBER", "ELSE", "IF", "FI", "INT", "MAIN", "RETURN", "WHILE", 
		"READ", "WRITE", "ADD", "MINUS", "MULTIPLY", "DIVIDE", "PERCENT", "EQUALS", 
		"NOTEQUALS", "GREATERTHAN", "GREATERTHAN_OR_EQUALS", "LESSTHAN", "LESSTHAN_OR_EQUALS", 
		"AND", "OR", "NOT", "ASSIGN", "LPARENTHESIS", "RPARENTHESIS", "LBRACE", 
		"RBRACE", "SEMICOLON", "COMMENT", "WHITESPACE"
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


	public CactusLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Cactus.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2#\u00c4\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\6\2G\n\2\r\2\16\2H\3\2\7\2L\n\2\f\2\16\2O\13\2\3\3\6\3"+
		"R\n\3\r\3\16\3S\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!"+
		"\3!\3!\3!\3!\7!\u00b4\n!\f!\16!\u00b7\13!\3!\3!\3!\3!\3!\3\"\6\"\u00bf"+
		"\n\"\r\"\16\"\u00c0\3\"\3\"\3\u00b5\2#\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#\3\2\6\3\2C|\6\2\62;C\\a"+
		"ac|\3\2\62;\5\2\13\f\17\17\"\"\u00c9\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\3F\3\2\2\2\5Q\3\2\2\2\7U\3\2\2\2\tZ\3\2\2\2\13]\3\2\2"+
		"\2\r`\3\2\2\2\17d\3\2\2\2\21i\3\2\2\2\23p\3\2\2\2\25v\3\2\2\2\27{\3\2"+
		"\2\2\31\u0081\3\2\2\2\33\u0083\3\2\2\2\35\u0085\3\2\2\2\37\u0087\3\2\2"+
		"\2!\u0089\3\2\2\2#\u008b\3\2\2\2%\u008d\3\2\2\2\'\u0090\3\2\2\2)\u0092"+
		"\3\2\2\2+\u0095\3\2\2\2-\u0097\3\2\2\2/\u009a\3\2\2\2\61\u009d\3\2\2\2"+
		"\63\u00a0\3\2\2\2\65\u00a2\3\2\2\2\67\u00a4\3\2\2\29\u00a6\3\2\2\2;\u00a8"+
		"\3\2\2\2=\u00aa\3\2\2\2?\u00ac\3\2\2\2A\u00ae\3\2\2\2C\u00be\3\2\2\2E"+
		"G\t\2\2\2FE\3\2\2\2GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2IM\3\2\2\2JL\t\3\2\2"+
		"KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\4\3\2\2\2OM\3\2\2\2PR\t\4\2"+
		"\2QP\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T\6\3\2\2\2UV\7g\2\2VW\7n\2"+
		"\2WX\7u\2\2XY\7g\2\2Y\b\3\2\2\2Z[\7k\2\2[\\\7h\2\2\\\n\3\2\2\2]^\7h\2"+
		"\2^_\7k\2\2_\f\3\2\2\2`a\7k\2\2ab\7p\2\2bc\7v\2\2c\16\3\2\2\2de\7o\2\2"+
		"ef\7c\2\2fg\7k\2\2gh\7p\2\2h\20\3\2\2\2ij\7t\2\2jk\7g\2\2kl\7v\2\2lm\7"+
		"w\2\2mn\7t\2\2no\7p\2\2o\22\3\2\2\2pq\7y\2\2qr\7j\2\2rs\7k\2\2st\7n\2"+
		"\2tu\7g\2\2u\24\3\2\2\2vw\7t\2\2wx\7g\2\2xy\7c\2\2yz\7f\2\2z\26\3\2\2"+
		"\2{|\7y\2\2|}\7t\2\2}~\7k\2\2~\177\7v\2\2\177\u0080\7g\2\2\u0080\30\3"+
		"\2\2\2\u0081\u0082\7-\2\2\u0082\32\3\2\2\2\u0083\u0084\7/\2\2\u0084\34"+
		"\3\2\2\2\u0085\u0086\7,\2\2\u0086\36\3\2\2\2\u0087\u0088\7\61\2\2\u0088"+
		" \3\2\2\2\u0089\u008a\7\'\2\2\u008a\"\3\2\2\2\u008b\u008c\7?\2\2\u008c"+
		"$\3\2\2\2\u008d\u008e\7#\2\2\u008e\u008f\7?\2\2\u008f&\3\2\2\2\u0090\u0091"+
		"\7@\2\2\u0091(\3\2\2\2\u0092\u0093\7@\2\2\u0093\u0094\7?\2\2\u0094*\3"+
		"\2\2\2\u0095\u0096\7>\2\2\u0096,\3\2\2\2\u0097\u0098\7>\2\2\u0098\u0099"+
		"\7?\2\2\u0099.\3\2\2\2\u009a\u009b\7(\2\2\u009b\u009c\7(\2\2\u009c\60"+
		"\3\2\2\2\u009d\u009e\7~\2\2\u009e\u009f\7~\2\2\u009f\62\3\2\2\2\u00a0"+
		"\u00a1\7#\2\2\u00a1\64\3\2\2\2\u00a2\u00a3\7?\2\2\u00a3\66\3\2\2\2\u00a4"+
		"\u00a5\7*\2\2\u00a58\3\2\2\2\u00a6\u00a7\7+\2\2\u00a7:\3\2\2\2\u00a8\u00a9"+
		"\7}\2\2\u00a9<\3\2\2\2\u00aa\u00ab\7\177\2\2\u00ab>\3\2\2\2\u00ac\u00ad"+
		"\7=\2\2\u00ad@\3\2\2\2\u00ae\u00af\7\61\2\2\u00af\u00b0\7,\2\2\u00b0\u00b5"+
		"\3\2\2\2\u00b1\u00b4\5A!\2\u00b2\u00b4\13\2\2\2\u00b3\u00b1\3\2\2\2\u00b3"+
		"\u00b2\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b5\u00b3\3\2"+
		"\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00b9\7,\2\2\u00b9"+
		"\u00ba\7\61\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\b!\2\2\u00bcB\3\2\2\2"+
		"\u00bd\u00bf\t\5\2\2\u00be\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00be"+
		"\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\b\"\2\2\u00c3"+
		"D\3\2\2\2\t\2HMS\u00b3\u00b5\u00c0\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}