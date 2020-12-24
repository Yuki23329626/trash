// Generated from hw7b.g4 by ANTLR 4.5.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class hw7bParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		POINT=1, ZERO=2, ONE=3, WHITESPACE=4, ERROR=5;
	public static final int
		RULE_token = 0, RULE_s = 1, RULE_r = 2, RULE_l = 3, RULE_ls = 4, RULE_b = 5;
	public static final String[] ruleNames = {
		"token", "s", "r", "l", "ls", "b"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", "'0'", "'1'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "POINT", "ZERO", "ONE", "WHITESPACE", "ERROR"
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
	public String getGrammarFileName() { return "hw7b.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public hw7bParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TokenContext extends ParserRuleContext {
		public List<TerminalNode> POINT() { return getTokens(hw7bParser.POINT); }
		public TerminalNode POINT(int i) {
			return getToken(hw7bParser.POINT, i);
		}
		public List<TerminalNode> ZERO() { return getTokens(hw7bParser.ZERO); }
		public TerminalNode ZERO(int i) {
			return getToken(hw7bParser.ZERO, i);
		}
		public List<TerminalNode> ONE() { return getTokens(hw7bParser.ONE); }
		public TerminalNode ONE(int i) {
			return getToken(hw7bParser.ONE, i);
		}
		public TokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hw7bListener ) ((hw7bListener)listener).enterToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hw7bListener ) ((hw7bListener)listener).exitToken(this);
		}
	}

	public final TokenContext token() throws RecognitionException {
		TokenContext _localctx = new TokenContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_token);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << POINT) | (1L << ZERO) | (1L << ONE))) != 0)) {
				{
				{
				setState(12);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << POINT) | (1L << ZERO) | (1L << ONE))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(17);
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

	public static class SContext extends ParserRuleContext {
		public double val;
		public LContext l;
		public RContext r;
		public LContext l() {
			return getRuleContext(LContext.class,0);
		}
		public RContext r() {
			return getRuleContext(RContext.class,0);
		}
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hw7bListener ) ((hw7bListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hw7bListener ) ((hw7bListener)listener).exitS(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_s);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			((SContext)_localctx).l = l(1);
			 ((SContext)_localctx).l.val = ((SContext)_localctx).l.val*Math.pow(2, ((SContext)_localctx).l.pos);
			setState(20);
			((SContext)_localctx).r = r();
			 ((SContext)_localctx).val =  ((SContext)_localctx).l.val + ((SContext)_localctx).r.val; System.out.printf("%f\n", _localctx.val);
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

	public static class RContext extends ParserRuleContext {
		public double val;
		public LContext l;
		public TerminalNode POINT() { return getToken(hw7bParser.POINT, 0); }
		public LContext l() {
			return getRuleContext(LContext.class,0);
		}
		public RContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hw7bListener ) ((hw7bListener)listener).enterR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hw7bListener ) ((hw7bListener)listener).exitR(this);
		}
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_r);
		try {
			setState(28);
			switch (_input.LA(1)) {
			case POINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(23);
				match(POINT);
				setState(24);
				((RContext)_localctx).l = l(0);
				 ((RContext)_localctx).val =  ((RContext)_localctx).l.val/2; 
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				 ((RContext)_localctx).val =  0;
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class LContext extends ParserRuleContext {
		public int side;
		public double val;
		public int pos;
		public BContext b;
		public LsContext ls;
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public LsContext ls() {
			return getRuleContext(LsContext.class,0);
		}
		public LContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public LContext(ParserRuleContext parent, int invokingState, int side) {
			super(parent, invokingState);
			this.side = side;
		}
		@Override public int getRuleIndex() { return RULE_l; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hw7bListener ) ((hw7bListener)listener).enterL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hw7bListener ) ((hw7bListener)listener).exitL(this);
		}
	}

	public final LContext l(int side) throws RecognitionException {
		LContext _localctx = new LContext(_ctx, getState(), side);
		enterRule(_localctx, 6, RULE_l);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			((LContext)_localctx).b = b();
			setState(31);
			((LContext)_localctx).ls = ls(_localctx.side);
			 if(_localctx.side == 1){((LContext)_localctx).pos =  ((LContext)_localctx).ls.pos+1; ((LContext)_localctx).val =  ((LContext)_localctx).b.val + ((LContext)_localctx).ls.val/2;}else if(_localctx.side == 0){((LContext)_localctx).val =  ((LContext)_localctx).b.val + ((LContext)_localctx).ls.val/2;}
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

	public static class LsContext extends ParserRuleContext {
		public int side;
		public double val;
		public int pos;
		public BContext b;
		public LsContext ls1;
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public LsContext ls() {
			return getRuleContext(LsContext.class,0);
		}
		public LsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public LsContext(ParserRuleContext parent, int invokingState, int side) {
			super(parent, invokingState);
			this.side = side;
		}
		@Override public int getRuleIndex() { return RULE_ls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hw7bListener ) ((hw7bListener)listener).enterLs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hw7bListener ) ((hw7bListener)listener).exitLs(this);
		}
	}

	public final LsContext ls(int side) throws RecognitionException {
		LsContext _localctx = new LsContext(_ctx, getState(), side);
		enterRule(_localctx, 8, RULE_ls);
		try {
			setState(39);
			switch (_input.LA(1)) {
			case ZERO:
			case ONE:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				((LsContext)_localctx).b = b();
				setState(35);
				((LsContext)_localctx).ls1 = ls(_localctx.side);
				 if(_localctx.side == 1){((LsContext)_localctx).pos =  ((LsContext)_localctx).ls1.pos+1; ((LsContext)_localctx).val =  ((LsContext)_localctx).b.val + ((LsContext)_localctx).ls1.val/2;}else if(_localctx.side == 0){((LsContext)_localctx).val =  ((LsContext)_localctx).b.val + ((LsContext)_localctx).ls1.val/2;}
				}
				break;
			case EOF:
			case POINT:
				enterOuterAlt(_localctx, 2);
				{
				 if(_localctx.side == 1){((LsContext)_localctx).pos =  -1; ((LsContext)_localctx).val =  0;}else if(_localctx.side == 0){((LsContext)_localctx).val =  0;}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class BContext extends ParserRuleContext {
		public double val;
		public TerminalNode ZERO() { return getToken(hw7bParser.ZERO, 0); }
		public TerminalNode ONE() { return getToken(hw7bParser.ONE, 0); }
		public BContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_b; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hw7bListener ) ((hw7bListener)listener).enterB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hw7bListener ) ((hw7bListener)listener).exitB(this);
		}
	}

	public final BContext b() throws RecognitionException {
		BContext _localctx = new BContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_b);
		try {
			setState(45);
			switch (_input.LA(1)) {
			case ZERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				match(ZERO);
				 ((BContext)_localctx).val =  0; 
				}
				break;
			case ONE:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				match(ONE);
				 ((BContext)_localctx).val =  1; 
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\7\62\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\7\2\20\n\2\f\2\16\2\23\13\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4\37\n\4\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\5\6*\n\6\3\7\3\7\3\7\3\7\5\7\60\n\7\3\7\2\2\b\2\4\6\b"+
		"\n\f\2\3\3\2\3\5/\2\21\3\2\2\2\4\24\3\2\2\2\6\36\3\2\2\2\b \3\2\2\2\n"+
		")\3\2\2\2\f/\3\2\2\2\16\20\t\2\2\2\17\16\3\2\2\2\20\23\3\2\2\2\21\17\3"+
		"\2\2\2\21\22\3\2\2\2\22\3\3\2\2\2\23\21\3\2\2\2\24\25\5\b\5\2\25\26\b"+
		"\3\1\2\26\27\5\6\4\2\27\30\b\3\1\2\30\5\3\2\2\2\31\32\7\3\2\2\32\33\5"+
		"\b\5\2\33\34\b\4\1\2\34\37\3\2\2\2\35\37\b\4\1\2\36\31\3\2\2\2\36\35\3"+
		"\2\2\2\37\7\3\2\2\2 !\5\f\7\2!\"\5\n\6\2\"#\b\5\1\2#\t\3\2\2\2$%\5\f\7"+
		"\2%&\5\n\6\2&\'\b\6\1\2\'*\3\2\2\2(*\b\6\1\2)$\3\2\2\2)(\3\2\2\2*\13\3"+
		"\2\2\2+,\7\4\2\2,\60\b\7\1\2-.\7\5\2\2.\60\b\7\1\2/+\3\2\2\2/-\3\2\2\2"+
		"\60\r\3\2\2\2\6\21\36)/";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}