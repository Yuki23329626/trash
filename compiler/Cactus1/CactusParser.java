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
		ELSE=1, IF=2, FI=3, INT=4, MAIN=5, RETURN=6, WHILE=7, READ=8, WRITE=9, 
		ADD=10, MINUS=11, MULTIPLY=12, DIVIDE=13, PERCENT=14, EQ=15, NOTEQ=16, 
		GREATERTHAN=17, GREATERTHAN_OR_EQ=18, LESSTHAN=19, LESSTHAN_OR_EQ=20, 
		AND=21, OR=22, NOT=23, ASSIGN=24, LP=25, RP=26, LB=27, RB=28, SEMICOLON=29, 
		NUMBER=30, ID=31, COMMENT=32, WHITESPACE=33, ERROR=34;
	public static final int
		RULE_token = 0, RULE_program = 1, RULE_declarations = 2, RULE_statements = 3, 
		RULE_statement = 4, RULE_bool_expression = 5, RULE_bool_expression1 = 6, 
		RULE_bool_term = 7, RULE_bool_term1 = 8, RULE_bool_factor = 9, RULE_rel_expression = 10, 
		RULE_relation_op = 11, RULE_arith_expression = 12, RULE_arith_expression1 = 13, 
		RULE_arith_term = 14, RULE_arith_term1 = 15, RULE_arith_factor = 16, RULE_primary_expression = 17;
	public static final String[] ruleNames = {
		"token", "program", "declarations", "statements", "statement", "bool_expression", 
		"bool_expression1", "bool_term", "bool_term1", "bool_factor", "rel_expression", 
		"relation_op", "arith_expression", "arith_expression1", "arith_term", 
		"arith_term1", "arith_factor", "primary_expression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'else'", "'if'", "'fi'", "'int'", "'main'", "'return'", "'while'", 
		"'read'", "'write'", "'+'", "'-'", "'*'", "'/'", "'%'", "'=='", "'!='", 
		"'>'", "'>='", "'<'", "'<='", "'&&'", "'||'", "'!'", "'='", "'('", "')'", 
		"'{'", "'}'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ELSE", "IF", "FI", "INT", "MAIN", "RETURN", "WHILE", "READ", "WRITE", 
		"ADD", "MINUS", "MULTIPLY", "DIVIDE", "PERCENT", "EQ", "NOTEQ", "GREATERTHAN", 
		"GREATERTHAN_OR_EQ", "LESSTHAN", "LESSTHAN_OR_EQ", "AND", "OR", "NOT", 
		"ASSIGN", "LP", "RP", "LB", "RB", "SEMICOLON", "NUMBER", "ID", "COMMENT", 
		"WHITESPACE", "ERROR"
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
		public List<TerminalNode> EQ() { return getTokens(CactusParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(CactusParser.EQ, i);
		}
		public List<TerminalNode> NOTEQ() { return getTokens(CactusParser.NOTEQ); }
		public TerminalNode NOTEQ(int i) {
			return getToken(CactusParser.NOTEQ, i);
		}
		public List<TerminalNode> GREATERTHAN() { return getTokens(CactusParser.GREATERTHAN); }
		public TerminalNode GREATERTHAN(int i) {
			return getToken(CactusParser.GREATERTHAN, i);
		}
		public List<TerminalNode> GREATERTHAN_OR_EQ() { return getTokens(CactusParser.GREATERTHAN_OR_EQ); }
		public TerminalNode GREATERTHAN_OR_EQ(int i) {
			return getToken(CactusParser.GREATERTHAN_OR_EQ, i);
		}
		public List<TerminalNode> LESSTHAN() { return getTokens(CactusParser.LESSTHAN); }
		public TerminalNode LESSTHAN(int i) {
			return getToken(CactusParser.LESSTHAN, i);
		}
		public List<TerminalNode> LESSTHAN_OR_EQ() { return getTokens(CactusParser.LESSTHAN_OR_EQ); }
		public TerminalNode LESSTHAN_OR_EQ(int i) {
			return getToken(CactusParser.LESSTHAN_OR_EQ, i);
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
		public List<TerminalNode> LP() { return getTokens(CactusParser.LP); }
		public TerminalNode LP(int i) {
			return getToken(CactusParser.LP, i);
		}
		public List<TerminalNode> RP() { return getTokens(CactusParser.RP); }
		public TerminalNode RP(int i) {
			return getToken(CactusParser.RP, i);
		}
		public List<TerminalNode> LB() { return getTokens(CactusParser.LB); }
		public TerminalNode LB(int i) {
			return getToken(CactusParser.LB, i);
		}
		public List<TerminalNode> RB() { return getTokens(CactusParser.RB); }
		public TerminalNode RB(int i) {
			return getToken(CactusParser.RB, i);
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
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ELSE) | (1L << IF) | (1L << FI) | (1L << INT) | (1L << MAIN) | (1L << RETURN) | (1L << WHILE) | (1L << READ) | (1L << WRITE) | (1L << ADD) | (1L << MINUS) | (1L << MULTIPLY) | (1L << DIVIDE) | (1L << PERCENT) | (1L << EQ) | (1L << NOTEQ) | (1L << GREATERTHAN) | (1L << GREATERTHAN_OR_EQ) | (1L << LESSTHAN) | (1L << LESSTHAN_OR_EQ) | (1L << AND) | (1L << OR) | (1L << NOT) | (1L << ASSIGN) | (1L << LP) | (1L << RP) | (1L << LB) | (1L << RB) | (1L << SEMICOLON) | (1L << NUMBER) | (1L << ID) | (1L << COMMENT) | (1L << WHITESPACE))) != 0)) {
				{
				{
				setState(36);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ELSE) | (1L << IF) | (1L << FI) | (1L << INT) | (1L << MAIN) | (1L << RETURN) | (1L << WHILE) | (1L << READ) | (1L << WRITE) | (1L << ADD) | (1L << MINUS) | (1L << MULTIPLY) | (1L << DIVIDE) | (1L << PERCENT) | (1L << EQ) | (1L << NOTEQ) | (1L << GREATERTHAN) | (1L << GREATERTHAN_OR_EQ) | (1L << LESSTHAN) | (1L << LESSTHAN_OR_EQ) | (1L << AND) | (1L << OR) | (1L << NOT) | (1L << ASSIGN) | (1L << LP) | (1L << RP) | (1L << LB) | (1L << RB) | (1L << SEMICOLON) | (1L << NUMBER) | (1L << ID) | (1L << COMMENT) | (1L << WHITESPACE))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(41);
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

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(CactusParser.MAIN, 0); }
		public TerminalNode LP() { return getToken(CactusParser.LP, 0); }
		public TerminalNode RP() { return getToken(CactusParser.RP, 0); }
		public TerminalNode LB() { return getToken(CactusParser.LB, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode RB() { return getToken(CactusParser.RB, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(MAIN);
			setState(43);
			match(LP);
			setState(44);
			match(RP);
			setState(45);
			match(LB);
			setState(46);
			declarations();
			setState(47);
			statements();
			setState(48);
			match(RB);
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

	public static class DeclarationsContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(CactusParser.INT, 0); }
		public TerminalNode ID() { return getToken(CactusParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(CactusParser.SEMICOLON, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitDeclarations(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declarations);
		try {
			setState(55);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				match(INT);
				setState(51);
				match(ID);
				setState(52);
				match(SEMICOLON);
				setState(53);
				declarations();
				}
				break;
			case IF:
			case RETURN:
			case WHILE:
			case READ:
			case WRITE:
			case RB:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class StatementsContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statements);
		try {
			setState(61);
			switch (_input.LA(1)) {
			case IF:
			case RETURN:
			case WHILE:
			case READ:
			case WRITE:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				statement();
				setState(58);
				statements();
				}
				break;
			case RB:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CactusParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(CactusParser.ASSIGN, 0); }
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CactusParser.SEMICOLON, 0); }
		public TerminalNode IF() { return getToken(CactusParser.IF, 0); }
		public TerminalNode LP() { return getToken(CactusParser.LP, 0); }
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(CactusParser.RP, 0); }
		public List<TerminalNode> LB() { return getTokens(CactusParser.LB); }
		public TerminalNode LB(int i) {
			return getToken(CactusParser.LB, i);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public List<TerminalNode> RB() { return getTokens(CactusParser.RB); }
		public TerminalNode RB(int i) {
			return getToken(CactusParser.RB, i);
		}
		public TerminalNode ELSE() { return getToken(CactusParser.ELSE, 0); }
		public TerminalNode FI() { return getToken(CactusParser.FI, 0); }
		public TerminalNode WHILE() { return getToken(CactusParser.WHILE, 0); }
		public TerminalNode READ() { return getToken(CactusParser.READ, 0); }
		public TerminalNode WRITE() { return getToken(CactusParser.WRITE, 0); }
		public TerminalNode RETURN() { return getToken(CactusParser.RETURN, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		try {
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				match(ID);
				setState(64);
				match(ASSIGN);
				setState(65);
				arith_expression();
				setState(66);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				match(IF);
				setState(69);
				match(LP);
				setState(70);
				bool_expression();
				setState(71);
				match(RP);
				setState(72);
				match(LB);
				setState(73);
				statements();
				setState(74);
				match(RB);
				setState(75);
				match(ELSE);
				setState(76);
				match(LB);
				setState(77);
				statements();
				setState(78);
				match(RB);
				setState(79);
				match(FI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				match(IF);
				setState(82);
				match(LP);
				setState(83);
				bool_expression();
				setState(84);
				match(RP);
				setState(85);
				match(LB);
				setState(86);
				statements();
				setState(87);
				match(RB);
				setState(88);
				match(FI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(90);
				match(WHILE);
				setState(91);
				match(LP);
				setState(92);
				bool_expression();
				setState(93);
				match(RP);
				setState(94);
				match(LB);
				setState(95);
				statements();
				setState(96);
				match(RB);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(98);
				match(READ);
				setState(99);
				match(ID);
				setState(100);
				match(SEMICOLON);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(101);
				match(WRITE);
				setState(102);
				arith_expression();
				setState(103);
				match(SEMICOLON);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(105);
				match(RETURN);
				setState(106);
				match(SEMICOLON);
				}
				break;
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

	public static class Bool_expressionContext extends ParserRuleContext {
		public Bool_termContext bool_term() {
			return getRuleContext(Bool_termContext.class,0);
		}
		public Bool_expression1Context bool_expression1() {
			return getRuleContext(Bool_expression1Context.class,0);
		}
		public Bool_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterBool_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitBool_expression(this);
		}
	}

	public final Bool_expressionContext bool_expression() throws RecognitionException {
		Bool_expressionContext _localctx = new Bool_expressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_bool_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			bool_term();
			setState(110);
			bool_expression1();
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

	public static class Bool_expression1Context extends ParserRuleContext {
		public TerminalNode OR() { return getToken(CactusParser.OR, 0); }
		public Bool_termContext bool_term() {
			return getRuleContext(Bool_termContext.class,0);
		}
		public Bool_expression1Context bool_expression1() {
			return getRuleContext(Bool_expression1Context.class,0);
		}
		public Bool_expression1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expression1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterBool_expression1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitBool_expression1(this);
		}
	}

	public final Bool_expression1Context bool_expression1() throws RecognitionException {
		Bool_expression1Context _localctx = new Bool_expression1Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_bool_expression1);
		try {
			setState(117);
			switch (_input.LA(1)) {
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				match(OR);
				setState(113);
				bool_term();
				setState(114);
				bool_expression1();
				}
				break;
			case RP:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Bool_termContext extends ParserRuleContext {
		public Bool_factorContext bool_factor() {
			return getRuleContext(Bool_factorContext.class,0);
		}
		public Bool_term1Context bool_term1() {
			return getRuleContext(Bool_term1Context.class,0);
		}
		public Bool_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterBool_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitBool_term(this);
		}
	}

	public final Bool_termContext bool_term() throws RecognitionException {
		Bool_termContext _localctx = new Bool_termContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_bool_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			bool_factor();
			setState(120);
			bool_term1();
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

	public static class Bool_term1Context extends ParserRuleContext {
		public TerminalNode AND() { return getToken(CactusParser.AND, 0); }
		public Bool_factorContext bool_factor() {
			return getRuleContext(Bool_factorContext.class,0);
		}
		public Bool_term1Context bool_term1() {
			return getRuleContext(Bool_term1Context.class,0);
		}
		public Bool_term1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_term1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterBool_term1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitBool_term1(this);
		}
	}

	public final Bool_term1Context bool_term1() throws RecognitionException {
		Bool_term1Context _localctx = new Bool_term1Context(_ctx, getState());
		enterRule(_localctx, 16, RULE_bool_term1);
		try {
			setState(127);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				match(AND);
				setState(123);
				bool_factor();
				setState(124);
				bool_term1();
				}
				break;
			case OR:
			case RP:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Bool_factorContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(CactusParser.NOT, 0); }
		public Bool_factorContext bool_factor() {
			return getRuleContext(Bool_factorContext.class,0);
		}
		public Rel_expressionContext rel_expression() {
			return getRuleContext(Rel_expressionContext.class,0);
		}
		public Bool_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterBool_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitBool_factor(this);
		}
	}

	public final Bool_factorContext bool_factor() throws RecognitionException {
		Bool_factorContext _localctx = new Bool_factorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_bool_factor);
		try {
			setState(132);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				match(NOT);
				setState(130);
				bool_factor();
				}
				break;
			case MINUS:
			case LP:
			case NUMBER:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				rel_expression();
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

	public static class Rel_expressionContext extends ParserRuleContext {
		public List<Arith_expressionContext> arith_expression() {
			return getRuleContexts(Arith_expressionContext.class);
		}
		public Arith_expressionContext arith_expression(int i) {
			return getRuleContext(Arith_expressionContext.class,i);
		}
		public Relation_opContext relation_op() {
			return getRuleContext(Relation_opContext.class,0);
		}
		public Rel_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterRel_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitRel_expression(this);
		}
	}

	public final Rel_expressionContext rel_expression() throws RecognitionException {
		Rel_expressionContext _localctx = new Rel_expressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_rel_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			arith_expression();
			setState(135);
			relation_op();
			setState(136);
			arith_expression();
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

	public static class Relation_opContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(CactusParser.EQ, 0); }
		public TerminalNode NOTEQ() { return getToken(CactusParser.NOTEQ, 0); }
		public TerminalNode GREATERTHAN() { return getToken(CactusParser.GREATERTHAN, 0); }
		public TerminalNode GREATERTHAN_OR_EQ() { return getToken(CactusParser.GREATERTHAN_OR_EQ, 0); }
		public TerminalNode LESSTHAN() { return getToken(CactusParser.LESSTHAN, 0); }
		public TerminalNode LESSTHAN_OR_EQ() { return getToken(CactusParser.LESSTHAN_OR_EQ, 0); }
		public Relation_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterRelation_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitRelation_op(this);
		}
	}

	public final Relation_opContext relation_op() throws RecognitionException {
		Relation_opContext _localctx = new Relation_opContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_relation_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NOTEQ) | (1L << GREATERTHAN) | (1L << GREATERTHAN_OR_EQ) | (1L << LESSTHAN) | (1L << LESSTHAN_OR_EQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class Arith_expressionContext extends ParserRuleContext {
		public Arith_termContext arith_term() {
			return getRuleContext(Arith_termContext.class,0);
		}
		public Arith_expression1Context arith_expression1() {
			return getRuleContext(Arith_expression1Context.class,0);
		}
		public Arith_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterArith_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitArith_expression(this);
		}
	}

	public final Arith_expressionContext arith_expression() throws RecognitionException {
		Arith_expressionContext _localctx = new Arith_expressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_arith_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			arith_term();
			setState(141);
			arith_expression1();
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

	public static class Arith_expression1Context extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(CactusParser.ADD, 0); }
		public Arith_termContext arith_term() {
			return getRuleContext(Arith_termContext.class,0);
		}
		public Arith_expression1Context arith_expression1() {
			return getRuleContext(Arith_expression1Context.class,0);
		}
		public TerminalNode MINUS() { return getToken(CactusParser.MINUS, 0); }
		public Arith_expression1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_expression1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterArith_expression1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitArith_expression1(this);
		}
	}

	public final Arith_expression1Context arith_expression1() throws RecognitionException {
		Arith_expression1Context _localctx = new Arith_expression1Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_arith_expression1);
		try {
			setState(152);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				match(ADD);
				setState(144);
				arith_term();
				setState(145);
				arith_expression1();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				match(MINUS);
				setState(148);
				arith_term();
				setState(149);
				arith_expression1();
				}
				break;
			case EQ:
			case NOTEQ:
			case GREATERTHAN:
			case GREATERTHAN_OR_EQ:
			case LESSTHAN:
			case LESSTHAN_OR_EQ:
			case AND:
			case OR:
			case RP:
			case SEMICOLON:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class Arith_termContext extends ParserRuleContext {
		public Arith_factorContext arith_factor() {
			return getRuleContext(Arith_factorContext.class,0);
		}
		public Arith_term1Context arith_term1() {
			return getRuleContext(Arith_term1Context.class,0);
		}
		public Arith_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterArith_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitArith_term(this);
		}
	}

	public final Arith_termContext arith_term() throws RecognitionException {
		Arith_termContext _localctx = new Arith_termContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_arith_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			arith_factor();
			setState(155);
			arith_term1();
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

	public static class Arith_term1Context extends ParserRuleContext {
		public TerminalNode MULTIPLY() { return getToken(CactusParser.MULTIPLY, 0); }
		public Arith_factorContext arith_factor() {
			return getRuleContext(Arith_factorContext.class,0);
		}
		public Arith_term1Context arith_term1() {
			return getRuleContext(Arith_term1Context.class,0);
		}
		public TerminalNode DIVIDE() { return getToken(CactusParser.DIVIDE, 0); }
		public TerminalNode PERCENT() { return getToken(CactusParser.PERCENT, 0); }
		public Arith_term1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_term1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterArith_term1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitArith_term1(this);
		}
	}

	public final Arith_term1Context arith_term1() throws RecognitionException {
		Arith_term1Context _localctx = new Arith_term1Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_arith_term1);
		try {
			setState(170);
			switch (_input.LA(1)) {
			case MULTIPLY:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				match(MULTIPLY);
				setState(158);
				arith_factor();
				setState(159);
				arith_term1();
				}
				break;
			case DIVIDE:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				match(DIVIDE);
				setState(162);
				arith_factor();
				setState(163);
				arith_term1();
				}
				break;
			case PERCENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(165);
				match(PERCENT);
				setState(166);
				arith_factor();
				setState(167);
				arith_term1();
				}
				break;
			case ADD:
			case MINUS:
			case EQ:
			case NOTEQ:
			case GREATERTHAN:
			case GREATERTHAN_OR_EQ:
			case LESSTHAN:
			case LESSTHAN_OR_EQ:
			case AND:
			case OR:
			case RP:
			case SEMICOLON:
				enterOuterAlt(_localctx, 4);
				{
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

	public static class Arith_factorContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(CactusParser.MINUS, 0); }
		public Arith_factorContext arith_factor() {
			return getRuleContext(Arith_factorContext.class,0);
		}
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public Arith_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterArith_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitArith_factor(this);
		}
	}

	public final Arith_factorContext arith_factor() throws RecognitionException {
		Arith_factorContext _localctx = new Arith_factorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_arith_factor);
		try {
			setState(175);
			switch (_input.LA(1)) {
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(MINUS);
				setState(173);
				arith_factor();
				}
				break;
			case LP:
			case NUMBER:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				primary_expression();
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

	public static class Primary_expressionContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(CactusParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(CactusParser.ID, 0); }
		public TerminalNode LP() { return getToken(CactusParser.LP, 0); }
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(CactusParser.RP, 0); }
		public Primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterPrimary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitPrimary_expression(this);
		}
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_primary_expression);
		try {
			setState(183);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				match(NUMBER);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				match(ID);
				}
				break;
			case LP:
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
				match(LP);
				setState(180);
				arith_expression();
				setState(181);
				match(RP);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3$\u00bc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\7\2(\n\2\f\2\16\2+\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\5\4:\n\4\3\5\3\5\3\5\3\5\5\5@\n\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\5\6n\n\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\bx\n\b"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\n\u0082\n\n\3\13\3\13\3\13\5\13\u0087"+
		"\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u009b\n\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00ad\n\21\3\22\3\22"+
		"\3\22\5\22\u00b2\n\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00ba\n\23\3"+
		"\23\2\2\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\4\3\2\3#\3\2\21"+
		"\26\u00bd\2)\3\2\2\2\4,\3\2\2\2\69\3\2\2\2\b?\3\2\2\2\nm\3\2\2\2\fo\3"+
		"\2\2\2\16w\3\2\2\2\20y\3\2\2\2\22\u0081\3\2\2\2\24\u0086\3\2\2\2\26\u0088"+
		"\3\2\2\2\30\u008c\3\2\2\2\32\u008e\3\2\2\2\34\u009a\3\2\2\2\36\u009c\3"+
		"\2\2\2 \u00ac\3\2\2\2\"\u00b1\3\2\2\2$\u00b9\3\2\2\2&(\t\2\2\2\'&\3\2"+
		"\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*\3\3\2\2\2+)\3\2\2\2,-\7\7\2\2-.\7"+
		"\33\2\2./\7\34\2\2/\60\7\35\2\2\60\61\5\6\4\2\61\62\5\b\5\2\62\63\7\36"+
		"\2\2\63\5\3\2\2\2\64\65\7\6\2\2\65\66\7!\2\2\66\67\7\37\2\2\67:\5\6\4"+
		"\28:\3\2\2\29\64\3\2\2\298\3\2\2\2:\7\3\2\2\2;<\5\n\6\2<=\5\b\5\2=@\3"+
		"\2\2\2>@\3\2\2\2?;\3\2\2\2?>\3\2\2\2@\t\3\2\2\2AB\7!\2\2BC\7\32\2\2CD"+
		"\5\32\16\2DE\7\37\2\2En\3\2\2\2FG\7\4\2\2GH\7\33\2\2HI\5\f\7\2IJ\7\34"+
		"\2\2JK\7\35\2\2KL\5\b\5\2LM\7\36\2\2MN\7\3\2\2NO\7\35\2\2OP\5\b\5\2PQ"+
		"\7\36\2\2QR\7\5\2\2Rn\3\2\2\2ST\7\4\2\2TU\7\33\2\2UV\5\f\7\2VW\7\34\2"+
		"\2WX\7\35\2\2XY\5\b\5\2YZ\7\36\2\2Z[\7\5\2\2[n\3\2\2\2\\]\7\t\2\2]^\7"+
		"\33\2\2^_\5\f\7\2_`\7\34\2\2`a\7\35\2\2ab\5\b\5\2bc\7\36\2\2cn\3\2\2\2"+
		"de\7\n\2\2ef\7!\2\2fn\7\37\2\2gh\7\13\2\2hi\5\32\16\2ij\7\37\2\2jn\3\2"+
		"\2\2kl\7\b\2\2ln\7\37\2\2mA\3\2\2\2mF\3\2\2\2mS\3\2\2\2m\\\3\2\2\2md\3"+
		"\2\2\2mg\3\2\2\2mk\3\2\2\2n\13\3\2\2\2op\5\20\t\2pq\5\16\b\2q\r\3\2\2"+
		"\2rs\7\30\2\2st\5\20\t\2tu\5\16\b\2ux\3\2\2\2vx\3\2\2\2wr\3\2\2\2wv\3"+
		"\2\2\2x\17\3\2\2\2yz\5\24\13\2z{\5\22\n\2{\21\3\2\2\2|}\7\27\2\2}~\5\24"+
		"\13\2~\177\5\22\n\2\177\u0082\3\2\2\2\u0080\u0082\3\2\2\2\u0081|\3\2\2"+
		"\2\u0081\u0080\3\2\2\2\u0082\23\3\2\2\2\u0083\u0084\7\31\2\2\u0084\u0087"+
		"\5\24\13\2\u0085\u0087\5\26\f\2\u0086\u0083\3\2\2\2\u0086\u0085\3\2\2"+
		"\2\u0087\25\3\2\2\2\u0088\u0089\5\32\16\2\u0089\u008a\5\30\r\2\u008a\u008b"+
		"\5\32\16\2\u008b\27\3\2\2\2\u008c\u008d\t\3\2\2\u008d\31\3\2\2\2\u008e"+
		"\u008f\5\36\20\2\u008f\u0090\5\34\17\2\u0090\33\3\2\2\2\u0091\u0092\7"+
		"\f\2\2\u0092\u0093\5\36\20\2\u0093\u0094\5\34\17\2\u0094\u009b\3\2\2\2"+
		"\u0095\u0096\7\r\2\2\u0096\u0097\5\36\20\2\u0097\u0098\5\34\17\2\u0098"+
		"\u009b\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u0091\3\2\2\2\u009a\u0095\3\2"+
		"\2\2\u009a\u0099\3\2\2\2\u009b\35\3\2\2\2\u009c\u009d\5\"\22\2\u009d\u009e"+
		"\5 \21\2\u009e\37\3\2\2\2\u009f\u00a0\7\16\2\2\u00a0\u00a1\5\"\22\2\u00a1"+
		"\u00a2\5 \21\2\u00a2\u00ad\3\2\2\2\u00a3\u00a4\7\17\2\2\u00a4\u00a5\5"+
		"\"\22\2\u00a5\u00a6\5 \21\2\u00a6\u00ad\3\2\2\2\u00a7\u00a8\7\20\2\2\u00a8"+
		"\u00a9\5\"\22\2\u00a9\u00aa\5 \21\2\u00aa\u00ad\3\2\2\2\u00ab\u00ad\3"+
		"\2\2\2\u00ac\u009f\3\2\2\2\u00ac\u00a3\3\2\2\2\u00ac\u00a7\3\2\2\2\u00ac"+
		"\u00ab\3\2\2\2\u00ad!\3\2\2\2\u00ae\u00af\7\r\2\2\u00af\u00b2\5\"\22\2"+
		"\u00b0\u00b2\5$\23\2\u00b1\u00ae\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2#\3"+
		"\2\2\2\u00b3\u00ba\7 \2\2\u00b4\u00ba\7!\2\2\u00b5\u00b6\7\33\2\2\u00b6"+
		"\u00b7\5\32\16\2\u00b7\u00b8\7\34\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00b3"+
		"\3\2\2\2\u00b9\u00b4\3\2\2\2\u00b9\u00b5\3\2\2\2\u00ba%\3\2\2\2\r)9?m"+
		"w\u0081\u0086\u009a\u00ac\u00b1\u00b9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}