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
		TRUE=1, FALSE=2, ELSE=3, IF=4, FI=5, INT=6, MAIN=7, RETURN=8, WHILE=9, 
		READ=10, WRITE=11, ADD=12, MINUS=13, MULTIPLY=14, DIVIDE=15, PERCENT=16, 
		EQ=17, NOTEQ=18, GREATERTHAN=19, GREATERTHAN_OR_EQ=20, LESSTHAN=21, LESSTHAN_OR_EQ=22, 
		AND=23, OR=24, NOT=25, ASSIGN=26, LP=27, RP=28, LB=29, RB=30, SEMICOLON=31, 
		NUMBER=32, ID=33, COMMENT=34, WHITESPACE=35, ERROR=36;
	public static final int
		RULE_token = 0, RULE_program = 1, RULE_declarations = 2, RULE_statements = 3, 
		RULE_statement = 4, RULE_bool_expression = 5, RULE_bool_expressions = 6, 
		RULE_bool_term = 7, RULE_bool_terms = 8, RULE_bool_factor = 9, RULE_rel_expression = 10, 
		RULE_relation_op = 11, RULE_arith_expression = 12, RULE_arith_expressions = 13, 
		RULE_arith_term = 14, RULE_arith_terms = 15, RULE_arith_factor = 16, RULE_primary_expression = 17;
	public static final String[] ruleNames = {
		"token", "program", "declarations", "statements", "statement", "bool_expression", 
		"bool_expressions", "bool_term", "bool_terms", "bool_factor", "rel_expression", 
		"relation_op", "arith_expression", "arith_expressions", "arith_term", 
		"arith_terms", "arith_factor", "primary_expression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'true'", "'false'", "'else'", "'if'", "'fi'", "'int'", "'main'", 
		"'return'", "'while'", "'read'", "'write'", "'+'", "'-'", "'*'", "'/'", 
		"'%'", "'=='", "'!='", "'>'", "'>='", "'<'", "'<='", "'&&'", "'||'", "'!'", 
		"'='", "'('", "')'", "'{'", "'}'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TRUE", "FALSE", "ELSE", "IF", "FI", "INT", "MAIN", "RETURN", "WHILE", 
		"READ", "WRITE", "ADD", "MINUS", "MULTIPLY", "DIVIDE", "PERCENT", "EQ", 
		"NOTEQ", "GREATERTHAN", "GREATERTHAN_OR_EQ", "LESSTHAN", "LESSTHAN_OR_EQ", 
		"AND", "OR", "NOT", "ASSIGN", "LP", "RP", "LB", "RB", "SEMICOLON", "NUMBER", 
		"ID", "COMMENT", "WHITESPACE", "ERROR"
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
			System.out.println("\t"+".data");
			setState(47);
			declarations();

						System.out.println("\t"+".text");
						System.out.println("main:");
					
			setState(49);
			statements(0, 1);
			setState(50);
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
		public Token ID;
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
			setState(58);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				match(INT);
				setState(53);
				((DeclarationsContext)_localctx).ID = match(ID);
				setState(54);
				match(SEMICOLON);
				System.out.println((((DeclarationsContext)_localctx).ID!=null?((DeclarationsContext)_localctx).ID.getText():null) + ":\t" + ".word 0");
				setState(56);
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
		public int reg;
		public int label;
		public int nreg;
		public int nlabel;
		public StatementContext statement;
		public StatementsContext statements1;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public StatementsContext(ParserRuleContext parent, int invokingState, int reg, int label) {
			super(parent, invokingState);
			this.reg = reg;
			this.label = label;
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

	public final StatementsContext statements(int reg,int label) throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState(), reg, label);
		enterRule(_localctx, 6, RULE_statements);
		try {
			setState(65);
			switch (_input.LA(1)) {
			case IF:
			case RETURN:
			case WHILE:
			case READ:
			case WRITE:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				((StatementsContext)_localctx).statement = statement(0, _localctx.label);
				setState(61);
				((StatementsContext)_localctx).statements1 = statements(((StatementsContext)_localctx).statement.nreg, ((StatementsContext)_localctx).statement.nlabel);

						((StatementsContext)_localctx).nreg =  ((StatementsContext)_localctx).statements1.nreg;
						((StatementsContext)_localctx).nlabel =  ((StatementsContext)_localctx).statements1.nlabel;
					
				}
				break;
			case RB:
				enterOuterAlt(_localctx, 2);
				{

						((StatementsContext)_localctx).nreg =  _localctx.reg;
						((StatementsContext)_localctx).nlabel =  _localctx.label;
					
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
		public int reg;
		public int label;
		public int nreg;
		public int nlabel;
		public Token ID;
		public Arith_expressionContext arith_expression;
		public Bool_expressionContext bool_expression;
		public StatementsContext statements1;
		public StatementsContext statements2;
		public StatementsContext statements;
		public TerminalNode ID() { return getToken(CactusParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(CactusParser.ASSIGN, 0); }
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CactusParser.SEMICOLON, 0); }
		public TerminalNode READ() { return getToken(CactusParser.READ, 0); }
		public TerminalNode WRITE() { return getToken(CactusParser.WRITE, 0); }
		public TerminalNode RETURN() { return getToken(CactusParser.RETURN, 0); }
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
		public List<TerminalNode> RB() { return getTokens(CactusParser.RB); }
		public TerminalNode RB(int i) {
			return getToken(CactusParser.RB, i);
		}
		public TerminalNode ELSE() { return getToken(CactusParser.ELSE, 0); }
		public TerminalNode FI() { return getToken(CactusParser.FI, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public TerminalNode WHILE() { return getToken(CactusParser.WHILE, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public StatementContext(ParserRuleContext parent, int invokingState, int reg, int label) {
			super(parent, invokingState);
			this.reg = reg;
			this.label = label;
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

	public final StatementContext statement(int reg,int label) throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState(), reg, label);
		enterRule(_localctx, 8, RULE_statement);
		try {
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				((StatementContext)_localctx).ID = match(ID);
				setState(68);
				match(ASSIGN);
				setState(69);
				((StatementContext)_localctx).arith_expression = arith_expression(_localctx.reg);

						System.out.printf("\tla\t$t%d, %s\n", ((StatementContext)_localctx).arith_expression.nreg, (((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null));
						System.out.printf("\tsw\t$t%d, 0($t%d)\n", ((StatementContext)_localctx).arith_expression.place, ((StatementContext)_localctx).arith_expression.nreg);
						((StatementContext)_localctx).nreg =  ((StatementContext)_localctx).arith_expression.nreg-1;
						((StatementContext)_localctx).nlabel =  _localctx.label;
					
				setState(71);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				match(READ);
				setState(74);
				((StatementContext)_localctx).ID = match(ID);
				setState(75);
				match(SEMICOLON);

						System.out.printf("\tli\t$v0, 5\n\tsyscall\n");
						System.out.printf("\tla\t$t%d, %s\n", _localctx.reg, (((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null));
						System.out.printf("\tsw\t$v0, 0($t%d)\n", _localctx.reg);
						((StatementContext)_localctx).nreg =  _localctx.reg;
						((StatementContext)_localctx).nlabel =  _localctx.label;
					
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				match(WRITE);
				setState(78);
				((StatementContext)_localctx).arith_expression = arith_expression(_localctx.reg);
				setState(79);
				match(SEMICOLON);

						System.out.printf("\tmove\t$a0, $t%d\n", ((StatementContext)_localctx).arith_expression.place);
						System.out.printf("\tli\t$v0, 1\n\tsyscall\n");
						((StatementContext)_localctx).nreg =  _localctx.reg;
						((StatementContext)_localctx).nlabel =  _localctx.label;
					
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(82);
				match(RETURN);
				setState(83);
				match(SEMICOLON);

						System.out.printf("\tli\t$v0, 10\n\tsyscall\n");
						((StatementContext)_localctx).nreg =  _localctx.reg;
						((StatementContext)_localctx).nlabel =  _localctx.label;
					
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(85);
				match(IF);
				setState(86);
				match(LP);

						int Btrue = _localctx.label++;
						int Bfalse = _localctx.label++;
						int Lnext = _localctx.label++;
					
				setState(88);
				((StatementContext)_localctx).bool_expression = bool_expression(Btrue, Bfalse, _localctx.reg, _localctx.label);
				setState(89);
				match(RP);
				setState(90);
				match(LB);

						System.out.printf("L%d:\t# then\n", Btrue);
					
				setState(92);
				((StatementContext)_localctx).statements1 = statements(((StatementContext)_localctx).bool_expression.nreg, ((StatementContext)_localctx).bool_expression.nlabel);
				setState(93);
				match(RB);
				setState(94);
				match(ELSE);

						System.out.printf("\tb\tL%d\n", Lnext);
						System.out.printf("L%d:\t# else\n", Bfalse);
					
				setState(96);
				match(LB);
				setState(97);
				((StatementContext)_localctx).statements2 = statements(((StatementContext)_localctx).statements1.nreg, ((StatementContext)_localctx).statements1.nlabel);
				setState(98);
				match(RB);
				setState(99);
				match(FI);

						System.out.printf("L%d:\t# endif\n", Lnext);
						((StatementContext)_localctx).nreg =  ((StatementContext)_localctx).statements2.nreg;
						((StatementContext)_localctx).nlabel =  ((StatementContext)_localctx).statements2.nlabel;
					
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(102);
				match(IF);
				setState(103);
				match(LP);

						int Btrue = _localctx.label++;
						int Bfalse = _localctx.label++;
					
				setState(105);
				((StatementContext)_localctx).bool_expression = bool_expression(Btrue, Bfalse, _localctx.reg, _localctx.label);
				setState(106);
				match(RP);
				setState(107);
				match(LB);

						System.out.printf("L%d:\t# then\n", Btrue);
					
				setState(109);
				((StatementContext)_localctx).statements = statements(((StatementContext)_localctx).bool_expression.nreg, ((StatementContext)_localctx).bool_expression.nlabel);

						System.out.printf("L%d:\t# then\n", Bfalse);
					
				setState(111);
				match(RB);
				setState(112);
				match(FI);

						((StatementContext)_localctx).nreg =  ((StatementContext)_localctx).statements.nreg;
						((StatementContext)_localctx).nlabel =  ((StatementContext)_localctx).statements.nlabel;
					
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{

						int Lbegin = _localctx.label++;
						System.out.printf("L%d:\t# while\n", Lbegin);
					
				setState(116);
				match(WHILE);
				setState(117);
				match(LP);

						int Btrue = _localctx.label++;
						int Bfalse = _localctx.label++;
					
				setState(119);
				((StatementContext)_localctx).bool_expression = bool_expression(Btrue, Bfalse, _localctx.reg, _localctx.label);
				setState(120);
				match(RP);
				setState(121);
				match(LB);

						System.out.printf("L%d:\t# body\n", Btrue);
					
				setState(123);
				((StatementContext)_localctx).statements = statements(((StatementContext)_localctx).bool_expression.nreg, ((StatementContext)_localctx).bool_expression.nlabel);

						System.out.printf("\tb\tL%d\n", Lbegin);
						System.out.printf("L%d:\t# end while\n", Bfalse);
					
				setState(125);
				match(RB);

						((StatementContext)_localctx).nreg =  ((StatementContext)_localctx).statements.nreg;
						((StatementContext)_localctx).nlabel =  ((StatementContext)_localctx).statements.nlabel;
					
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
		public int btrue;
		public int bfalse;
		public int reg;
		public int label;
		public int nreg;
		public int nlabel;
		public Bool_termContext bool_term;
		public Bool_expressionsContext bool_expressions;
		public Bool_termContext bool_term() {
			return getRuleContext(Bool_termContext.class,0);
		}
		public Bool_expressionsContext bool_expressions() {
			return getRuleContext(Bool_expressionsContext.class,0);
		}
		public Bool_expressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Bool_expressionContext(ParserRuleContext parent, int invokingState, int btrue, int bfalse, int reg, int label) {
			super(parent, invokingState);
			this.btrue = btrue;
			this.bfalse = bfalse;
			this.reg = reg;
			this.label = label;
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

	public final Bool_expressionContext bool_expression(int btrue,int bfalse,int reg,int label) throws RecognitionException {
		Bool_expressionContext _localctx = new Bool_expressionContext(_ctx, getState(), btrue, bfalse, reg, label);
		enterRule(_localctx, 10, RULE_bool_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{

					int temp = _localctx.label++;
				
			setState(131);
			((Bool_expressionContext)_localctx).bool_term = bool_term(_localctx.btrue, temp, _localctx.reg, _localctx.label);
			setState(132);
			((Bool_expressionContext)_localctx).bool_expressions = bool_expressions(_localctx.btrue, _localctx.bfalse, ((Bool_expressionContext)_localctx).bool_term.nreg, ((Bool_expressionContext)_localctx).bool_term.nlabel, temp);

					((Bool_expressionContext)_localctx).nreg =  ((Bool_expressionContext)_localctx).bool_expressions.nreg;
					((Bool_expressionContext)_localctx).nlabel =  ((Bool_expressionContext)_localctx).bool_expressions.nlabel;
				
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

	public static class Bool_expressionsContext extends ParserRuleContext {
		public int btrue;
		public int bfalse;
		public int reg;
		public int label;
		public int temp;
		public int nreg;
		public int nlabel;
		public Bool_termContext bool_term;
		public Bool_expressionsContext bool_expressions;
		public TerminalNode OR() { return getToken(CactusParser.OR, 0); }
		public Bool_termContext bool_term() {
			return getRuleContext(Bool_termContext.class,0);
		}
		public Bool_expressionsContext bool_expressions() {
			return getRuleContext(Bool_expressionsContext.class,0);
		}
		public Bool_expressionsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Bool_expressionsContext(ParserRuleContext parent, int invokingState, int btrue, int bfalse, int reg, int label, int temp) {
			super(parent, invokingState);
			this.btrue = btrue;
			this.bfalse = bfalse;
			this.reg = reg;
			this.label = label;
			this.temp = temp;
		}
		@Override public int getRuleIndex() { return RULE_bool_expressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterBool_expressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitBool_expressions(this);
		}
	}

	public final Bool_expressionsContext bool_expressions(int btrue,int bfalse,int reg,int label,int temp) throws RecognitionException {
		Bool_expressionsContext _localctx = new Bool_expressionsContext(_ctx, getState(), btrue, bfalse, reg, label, temp);
		enterRule(_localctx, 12, RULE_bool_expressions);
		try {
			setState(142);
			switch (_input.LA(1)) {
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				match(OR);

						System.out.printf("L%d:\n", _localctx.temp);
					
				setState(137);
				((Bool_expressionsContext)_localctx).bool_term = bool_term(_localctx.btrue, _localctx.bfalse, _localctx.reg, _localctx.label);
				setState(138);
				((Bool_expressionsContext)_localctx).bool_expressions = bool_expressions(_localctx.btrue, _localctx.bfalse, ((Bool_expressionsContext)_localctx).bool_term.nreg, ((Bool_expressionsContext)_localctx).bool_term.nlabel, _localctx.temp);

						((Bool_expressionsContext)_localctx).nreg =  _localctx.nreg;
						((Bool_expressionsContext)_localctx).nlabel =  _localctx.nlabel;
					
				}
				break;
			case RP:
				enterOuterAlt(_localctx, 2);
				{

						System.out.printf("L%d:\n", _localctx.temp);
						System.out.printf("\tb\tL%d\n", _localctx.bfalse);
						((Bool_expressionsContext)_localctx).nreg =  _localctx.reg;
						((Bool_expressionsContext)_localctx).nlabel =  _localctx.label;
					
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
		public int btrue;
		public int bfalse;
		public int reg;
		public int label;
		public int nreg;
		public int nlabel;
		public Bool_factorContext bool_factor;
		public Bool_termsContext bool_terms;
		public Bool_factorContext bool_factor() {
			return getRuleContext(Bool_factorContext.class,0);
		}
		public Bool_termsContext bool_terms() {
			return getRuleContext(Bool_termsContext.class,0);
		}
		public Bool_termContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Bool_termContext(ParserRuleContext parent, int invokingState, int btrue, int bfalse, int reg, int label) {
			super(parent, invokingState);
			this.btrue = btrue;
			this.bfalse = bfalse;
			this.reg = reg;
			this.label = label;
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

	public final Bool_termContext bool_term(int btrue,int bfalse,int reg,int label) throws RecognitionException {
		Bool_termContext _localctx = new Bool_termContext(_ctx, getState(), btrue, bfalse, reg, label);
		enterRule(_localctx, 14, RULE_bool_term);
		try {
			enterOuterAlt(_localctx, 1);
			{

					int temp = _localctx.label++;
				
			setState(145);
			((Bool_termContext)_localctx).bool_factor = bool_factor(temp, _localctx.bfalse, _localctx.reg, _localctx.label);
			setState(146);
			((Bool_termContext)_localctx).bool_terms = bool_terms(_localctx.btrue, _localctx.bfalse, ((Bool_termContext)_localctx).bool_factor.nreg, ((Bool_termContext)_localctx).bool_factor.nlabel, temp);

					((Bool_termContext)_localctx).nreg =  ((Bool_termContext)_localctx).bool_terms.nreg;
					((Bool_termContext)_localctx).nlabel =  ((Bool_termContext)_localctx).bool_terms.nlabel;
				
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

	public static class Bool_termsContext extends ParserRuleContext {
		public int btrue;
		public int bfalse;
		public int reg;
		public int label;
		public int temp;
		public int nreg;
		public int nlabel;
		public Bool_factorContext bool_factor;
		public Bool_termsContext bool_terms;
		public TerminalNode AND() { return getToken(CactusParser.AND, 0); }
		public Bool_factorContext bool_factor() {
			return getRuleContext(Bool_factorContext.class,0);
		}
		public Bool_termsContext bool_terms() {
			return getRuleContext(Bool_termsContext.class,0);
		}
		public Bool_termsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Bool_termsContext(ParserRuleContext parent, int invokingState, int btrue, int bfalse, int reg, int label, int temp) {
			super(parent, invokingState);
			this.btrue = btrue;
			this.bfalse = bfalse;
			this.reg = reg;
			this.label = label;
			this.temp = temp;
		}
		@Override public int getRuleIndex() { return RULE_bool_terms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterBool_terms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitBool_terms(this);
		}
	}

	public final Bool_termsContext bool_terms(int btrue,int bfalse,int reg,int label,int temp) throws RecognitionException {
		Bool_termsContext _localctx = new Bool_termsContext(_ctx, getState(), btrue, bfalse, reg, label, temp);
		enterRule(_localctx, 16, RULE_bool_terms);
		try {
			setState(156);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				match(AND);

						System.out.printf("L%d:\n", _localctx.temp);
					
				setState(151);
				((Bool_termsContext)_localctx).bool_factor = bool_factor(_localctx.btrue, _localctx.bfalse, _localctx.reg, _localctx.label);
				setState(152);
				((Bool_termsContext)_localctx).bool_terms = bool_terms(_localctx.btrue, _localctx.bfalse, ((Bool_termsContext)_localctx).bool_factor.nreg, ((Bool_termsContext)_localctx).bool_factor.nlabel, _localctx.temp);

						((Bool_termsContext)_localctx).nreg =  _localctx.nreg;
						((Bool_termsContext)_localctx).nlabel =  _localctx.nlabel;
					
				}
				break;
			case OR:
			case RP:
				enterOuterAlt(_localctx, 2);
				{

						System.out.printf("L%d:\n", _localctx.temp);
						System.out.printf("\tb\tL%d\n", _localctx.btrue);
						((Bool_termsContext)_localctx).nreg =  _localctx.reg;
						((Bool_termsContext)_localctx).nlabel =  _localctx.label;
					
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
		public int btrue;
		public int bfalse;
		public int reg;
		public int label;
		public int nreg;
		public int nlabel;
		public Bool_factorContext bool_factor;
		public Rel_expressionContext rel_expression;
		public TerminalNode NOT() { return getToken(CactusParser.NOT, 0); }
		public Bool_factorContext bool_factor() {
			return getRuleContext(Bool_factorContext.class,0);
		}
		public Rel_expressionContext rel_expression() {
			return getRuleContext(Rel_expressionContext.class,0);
		}
		public Bool_factorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Bool_factorContext(ParserRuleContext parent, int invokingState, int btrue, int bfalse, int reg, int label) {
			super(parent, invokingState);
			this.btrue = btrue;
			this.bfalse = bfalse;
			this.reg = reg;
			this.label = label;
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

	public final Bool_factorContext bool_factor(int btrue,int bfalse,int reg,int label) throws RecognitionException {
		Bool_factorContext _localctx = new Bool_factorContext(_ctx, getState(), btrue, bfalse, reg, label);
		enterRule(_localctx, 18, RULE_bool_factor);
		try {
			setState(165);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				match(NOT);
				setState(159);
				((Bool_factorContext)_localctx).bool_factor = bool_factor(_localctx.bfalse, _localctx.btrue, _localctx.reg, _localctx.label);

						((Bool_factorContext)_localctx).nreg =  _localctx.nreg;
						((Bool_factorContext)_localctx).nlabel =  _localctx.nlabel;
					
				}
				break;
			case MINUS:
			case LP:
			case NUMBER:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				((Bool_factorContext)_localctx).rel_expression = rel_expression(_localctx.btrue, _localctx.bfalse, _localctx.reg, _localctx.label);

						((Bool_factorContext)_localctx).nreg =  ((Bool_factorContext)_localctx).rel_expression.nreg;
						((Bool_factorContext)_localctx).nlabel =  ((Bool_factorContext)_localctx).rel_expression.nlabel;
					
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
		public int btrue;
		public int bfalse;
		public int reg;
		public int label;
		public int nreg;
		public int nlabel;
		public Arith_expressionContext arith_expression1;
		public Relation_opContext relation_op;
		public Arith_expressionContext arith_expression2;
		public Relation_opContext relation_op() {
			return getRuleContext(Relation_opContext.class,0);
		}
		public List<Arith_expressionContext> arith_expression() {
			return getRuleContexts(Arith_expressionContext.class);
		}
		public Arith_expressionContext arith_expression(int i) {
			return getRuleContext(Arith_expressionContext.class,i);
		}
		public Rel_expressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Rel_expressionContext(ParserRuleContext parent, int invokingState, int btrue, int bfalse, int reg, int label) {
			super(parent, invokingState);
			this.btrue = btrue;
			this.bfalse = bfalse;
			this.reg = reg;
			this.label = label;
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

	public final Rel_expressionContext rel_expression(int btrue,int bfalse,int reg,int label) throws RecognitionException {
		Rel_expressionContext _localctx = new Rel_expressionContext(_ctx, getState(), btrue, bfalse, reg, label);
		enterRule(_localctx, 20, RULE_rel_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			((Rel_expressionContext)_localctx).arith_expression1 = arith_expression(_localctx.reg);
			setState(168);
			((Rel_expressionContext)_localctx).relation_op = relation_op();
			setState(169);
			((Rel_expressionContext)_localctx).arith_expression2 = arith_expression(((Rel_expressionContext)_localctx).arith_expression1.nreg);

					System.out.printf("\t%s\t$t%d, $t%d, L%d\n", ((Rel_expressionContext)_localctx).relation_op.op, ((Rel_expressionContext)_localctx).arith_expression1.place, ((Rel_expressionContext)_localctx).arith_expression2.place, _localctx.btrue);
					System.out.printf("\tb\tL%d\n", _localctx.bfalse);
					((Rel_expressionContext)_localctx).nreg =  ((Rel_expressionContext)_localctx).arith_expression2.nreg+2;
					((Rel_expressionContext)_localctx).nlabel =  _localctx.label;
				
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
		public String op;
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
		try {
			setState(184);
			switch (_input.LA(1)) {
			case EQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(EQ);
				((Relation_opContext)_localctx).op =  "beq";
				}
				break;
			case NOTEQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				match(NOTEQ);
				((Relation_opContext)_localctx).op =  "bne";
				}
				break;
			case GREATERTHAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(176);
				match(GREATERTHAN);
				((Relation_opContext)_localctx).op =  "bgt";
				}
				break;
			case GREATERTHAN_OR_EQ:
				enterOuterAlt(_localctx, 4);
				{
				setState(178);
				match(GREATERTHAN_OR_EQ);
				((Relation_opContext)_localctx).op =  "bge";
				}
				break;
			case LESSTHAN:
				enterOuterAlt(_localctx, 5);
				{
				setState(180);
				match(LESSTHAN);
				((Relation_opContext)_localctx).op =  "blt";
				}
				break;
			case LESSTHAN_OR_EQ:
				enterOuterAlt(_localctx, 6);
				{
				setState(182);
				match(LESSTHAN_OR_EQ);
				((Relation_opContext)_localctx).op =  "ble";
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

	public static class Arith_expressionContext extends ParserRuleContext {
		public int reg;
		public int nreg;
		public int place;
		public Arith_termContext arith_term;
		public Arith_expressionsContext arith_expressions;
		public Arith_termContext arith_term() {
			return getRuleContext(Arith_termContext.class,0);
		}
		public Arith_expressionsContext arith_expressions() {
			return getRuleContext(Arith_expressionsContext.class,0);
		}
		public Arith_expressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Arith_expressionContext(ParserRuleContext parent, int invokingState, int reg) {
			super(parent, invokingState);
			this.reg = reg;
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

	public final Arith_expressionContext arith_expression(int reg) throws RecognitionException {
		Arith_expressionContext _localctx = new Arith_expressionContext(_ctx, getState(), reg);
		enterRule(_localctx, 24, RULE_arith_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			((Arith_expressionContext)_localctx).arith_term = arith_term(_localctx.reg);
			setState(187);
			((Arith_expressionContext)_localctx).arith_expressions = arith_expressions(((Arith_expressionContext)_localctx).arith_term.nreg, ((Arith_expressionContext)_localctx).arith_term.place);

					((Arith_expressionContext)_localctx).nreg =  ((Arith_expressionContext)_localctx).arith_expressions.nreg;
					((Arith_expressionContext)_localctx).place =  ((Arith_expressionContext)_localctx).arith_expressions.place;
				
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

	public static class Arith_expressionsContext extends ParserRuleContext {
		public int reg;
		public int leftPlace;
		public int nreg;
		public int place;
		public Arith_termContext arith_term;
		public TerminalNode ADD() { return getToken(CactusParser.ADD, 0); }
		public Arith_termContext arith_term() {
			return getRuleContext(Arith_termContext.class,0);
		}
		public Arith_expressionsContext arith_expressions() {
			return getRuleContext(Arith_expressionsContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(CactusParser.MINUS, 0); }
		public Arith_expressionsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Arith_expressionsContext(ParserRuleContext parent, int invokingState, int reg, int leftPlace) {
			super(parent, invokingState);
			this.reg = reg;
			this.leftPlace = leftPlace;
		}
		@Override public int getRuleIndex() { return RULE_arith_expressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterArith_expressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitArith_expressions(this);
		}
	}

	public final Arith_expressionsContext arith_expressions(int reg,int leftPlace) throws RecognitionException {
		Arith_expressionsContext _localctx = new Arith_expressionsContext(_ctx, getState(), reg, leftPlace);
		enterRule(_localctx, 26, RULE_arith_expressions);
		try {
			setState(201);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				match(ADD);
				setState(191);
				((Arith_expressionsContext)_localctx).arith_term = arith_term(_localctx.reg);
				setState(192);
				arith_expressions(((Arith_expressionsContext)_localctx).arith_term.nreg, ((Arith_expressionsContext)_localctx).arith_term.place);

						System.out.printf("\tadd\t$t%d, $t%d, $t%d\n", _localctx.leftPlace, _localctx.leftPlace, ((Arith_expressionsContext)_localctx).arith_term.place);
						((Arith_expressionsContext)_localctx).nreg =  ((Arith_expressionsContext)_localctx).arith_term.nreg-1;
						((Arith_expressionsContext)_localctx).place =  _localctx.leftPlace;
					
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				match(MINUS);
				setState(196);
				((Arith_expressionsContext)_localctx).arith_term = arith_term(_localctx.reg);
				setState(197);
				arith_expressions(((Arith_expressionsContext)_localctx).arith_term.nreg, ((Arith_expressionsContext)_localctx).arith_term.place);

						System.out.printf("\tsub\t%s, %s, %s\n", _localctx.leftPlace, _localctx.leftPlace, ((Arith_expressionsContext)_localctx).arith_term.place);
						((Arith_expressionsContext)_localctx).nreg =  ((Arith_expressionsContext)_localctx).arith_term.nreg-1;
						((Arith_expressionsContext)_localctx).place =  _localctx.leftPlace;
					
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

						((Arith_expressionsContext)_localctx).nreg =  _localctx.reg;
						((Arith_expressionsContext)_localctx).place =  _localctx.leftPlace;
					
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
		public int reg;
		public int nreg;
		public int place;
		public Arith_factorContext arith_factor;
		public Arith_termsContext arith_terms;
		public Arith_factorContext arith_factor() {
			return getRuleContext(Arith_factorContext.class,0);
		}
		public Arith_termsContext arith_terms() {
			return getRuleContext(Arith_termsContext.class,0);
		}
		public Arith_termContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Arith_termContext(ParserRuleContext parent, int invokingState, int reg) {
			super(parent, invokingState);
			this.reg = reg;
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

	public final Arith_termContext arith_term(int reg) throws RecognitionException {
		Arith_termContext _localctx = new Arith_termContext(_ctx, getState(), reg);
		enterRule(_localctx, 28, RULE_arith_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			((Arith_termContext)_localctx).arith_factor = arith_factor(_localctx.reg);
			setState(204);
			((Arith_termContext)_localctx).arith_terms = arith_terms(((Arith_termContext)_localctx).arith_factor.nreg, ((Arith_termContext)_localctx).arith_factor.place);

					((Arith_termContext)_localctx).nreg =  ((Arith_termContext)_localctx).arith_terms.nreg;
					((Arith_termContext)_localctx).place =  ((Arith_termContext)_localctx).arith_terms.place;
				
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

	public static class Arith_termsContext extends ParserRuleContext {
		public int reg;
		public int leftPlace;
		public int nreg;
		public int place;
		public Arith_factorContext arith_factor;
		public TerminalNode MULTIPLY() { return getToken(CactusParser.MULTIPLY, 0); }
		public Arith_factorContext arith_factor() {
			return getRuleContext(Arith_factorContext.class,0);
		}
		public Arith_termsContext arith_terms() {
			return getRuleContext(Arith_termsContext.class,0);
		}
		public TerminalNode DIVIDE() { return getToken(CactusParser.DIVIDE, 0); }
		public TerminalNode PERCENT() { return getToken(CactusParser.PERCENT, 0); }
		public Arith_termsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Arith_termsContext(ParserRuleContext parent, int invokingState, int reg, int leftPlace) {
			super(parent, invokingState);
			this.reg = reg;
			this.leftPlace = leftPlace;
		}
		@Override public int getRuleIndex() { return RULE_arith_terms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterArith_terms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitArith_terms(this);
		}
	}

	public final Arith_termsContext arith_terms(int reg,int leftPlace) throws RecognitionException {
		Arith_termsContext _localctx = new Arith_termsContext(_ctx, getState(), reg, leftPlace);
		enterRule(_localctx, 30, RULE_arith_terms);
		try {
			setState(223);
			switch (_input.LA(1)) {
			case MULTIPLY:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				match(MULTIPLY);
				setState(208);
				((Arith_termsContext)_localctx).arith_factor = arith_factor(_localctx.reg);
				setState(209);
				arith_terms(((Arith_termsContext)_localctx).arith_factor.nreg, ((Arith_termsContext)_localctx).arith_factor.place);

						System.out.printf("\tmul\t%s, %s, %s\n", _localctx.leftPlace, _localctx.leftPlace, ((Arith_termsContext)_localctx).arith_factor.place);
						((Arith_termsContext)_localctx).nreg =  ((Arith_termsContext)_localctx).arith_factor.nreg-1;
						((Arith_termsContext)_localctx).place =  _localctx.leftPlace;
					
				}
				break;
			case DIVIDE:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				match(DIVIDE);
				setState(213);
				((Arith_termsContext)_localctx).arith_factor = arith_factor(_localctx.reg);
				setState(214);
				arith_terms(((Arith_termsContext)_localctx).arith_factor.nreg, ((Arith_termsContext)_localctx).arith_factor.place);

						System.out.printf("\tdiv\t%s, %s, %s\n", _localctx.leftPlace, _localctx.leftPlace, ((Arith_termsContext)_localctx).arith_factor.place);
						((Arith_termsContext)_localctx).nreg =  ((Arith_termsContext)_localctx).arith_factor.nreg-1;
						((Arith_termsContext)_localctx).place =  _localctx.leftPlace;
					
				}
				break;
			case PERCENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(217);
				match(PERCENT);
				setState(218);
				((Arith_termsContext)_localctx).arith_factor = arith_factor(_localctx.reg);
				setState(219);
				arith_terms(((Arith_termsContext)_localctx).arith_factor.nreg, ((Arith_termsContext)_localctx).arith_factor.place);

						System.out.printf("\trem\t%s, %s, %s\n", _localctx.leftPlace, _localctx.leftPlace, ((Arith_termsContext)_localctx).arith_factor.place);
						((Arith_termsContext)_localctx).nreg =  ((Arith_termsContext)_localctx).arith_factor.nreg-1;
						((Arith_termsContext)_localctx).place =  _localctx.leftPlace;
					
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

						((Arith_termsContext)_localctx).nreg =  _localctx.reg;
						((Arith_termsContext)_localctx).place =  _localctx.leftPlace;
					
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
		public int reg;
		public int nreg;
		public int place;
		public Arith_factorContext arith_factor1;
		public Primary_expressionContext primary_expression;
		public TerminalNode MINUS() { return getToken(CactusParser.MINUS, 0); }
		public Arith_factorContext arith_factor() {
			return getRuleContext(Arith_factorContext.class,0);
		}
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public Arith_factorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Arith_factorContext(ParserRuleContext parent, int invokingState, int reg) {
			super(parent, invokingState);
			this.reg = reg;
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

	public final Arith_factorContext arith_factor(int reg) throws RecognitionException {
		Arith_factorContext _localctx = new Arith_factorContext(_ctx, getState(), reg);
		enterRule(_localctx, 32, RULE_arith_factor);
		try {
			setState(232);
			switch (_input.LA(1)) {
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				match(MINUS);
				setState(226);
				((Arith_factorContext)_localctx).arith_factor1 = arith_factor(_localctx.reg);

						System.out.printf("\tneg\t$t%d, $t%d\n", ((Arith_factorContext)_localctx).arith_factor1.place, ((Arith_factorContext)_localctx).arith_factor1.place);
						((Arith_factorContext)_localctx).nreg =  ((Arith_factorContext)_localctx).arith_factor1.nreg;
						((Arith_factorContext)_localctx).place =  ((Arith_factorContext)_localctx).arith_factor1.place;
					
				}
				break;
			case LP:
			case NUMBER:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				((Arith_factorContext)_localctx).primary_expression = primary_expression(_localctx.reg);

						((Arith_factorContext)_localctx).nreg =  ((Arith_factorContext)_localctx).primary_expression.nreg;
						((Arith_factorContext)_localctx).place =  ((Arith_factorContext)_localctx).primary_expression.place;
					
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
		public int reg;
		public int nreg;
		public int place;
		public Token NUMBER;
		public Token ID;
		public Arith_expressionContext arith_expression;
		public TerminalNode NUMBER() { return getToken(CactusParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(CactusParser.ID, 0); }
		public TerminalNode LP() { return getToken(CactusParser.LP, 0); }
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(CactusParser.RP, 0); }
		public Primary_expressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Primary_expressionContext(ParserRuleContext parent, int invokingState, int reg) {
			super(parent, invokingState);
			this.reg = reg;
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

	public final Primary_expressionContext primary_expression(int reg) throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState(), reg);
		enterRule(_localctx, 34, RULE_primary_expression);
		try {
			setState(243);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				((Primary_expressionContext)_localctx).NUMBER = match(NUMBER);

						System.out.printf("\tli\t$t%d, %d\n", _localctx.reg, (((Primary_expressionContext)_localctx).NUMBER!=null?Integer.valueOf(((Primary_expressionContext)_localctx).NUMBER.getText()):0));
						((Primary_expressionContext)_localctx).place =  _localctx.reg;
						((Primary_expressionContext)_localctx).nreg =  _localctx.reg+1;
					
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				((Primary_expressionContext)_localctx).ID = match(ID);

						System.out.printf("\tla\t$t%d, %s\n", _localctx.reg, (((Primary_expressionContext)_localctx).ID!=null?((Primary_expressionContext)_localctx).ID.getText():null));
						System.out.printf("\tlw\t$t%d, 0($t%d)\n", _localctx.reg, _localctx.reg);
						((Primary_expressionContext)_localctx).place =  _localctx.reg;
						((Primary_expressionContext)_localctx).nreg =  _localctx.reg+1;
					
				}
				break;
			case LP:
				enterOuterAlt(_localctx, 3);
				{
				setState(238);
				match(LP);
				setState(239);
				((Primary_expressionContext)_localctx).arith_expression = arith_expression(_localctx.reg);
				setState(240);
				match(RP);

						((Primary_expressionContext)_localctx).nreg =  ((Primary_expressionContext)_localctx).arith_expression.nreg;
						((Primary_expressionContext)_localctx).place =  ((Primary_expressionContext)_localctx).arith_expression.place;
					
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3&\u00f8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\7\2(\n\2\f\2\16\2+\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4=\n\4\3\5\3\5\3\5\3\5\3\5\5\5D\n\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0083\n\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0091\n\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\5\n\u009f\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5"+
		"\13\u00a8\n\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\5\r\u00bb\n\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00cc\n\17\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u00e2\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00eb\n"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00f6\n\23\3\23"+
		"\2\2\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\3\3\2\5%\u00fe\2"+
		")\3\2\2\2\4,\3\2\2\2\6<\3\2\2\2\bC\3\2\2\2\n\u0082\3\2\2\2\f\u0084\3\2"+
		"\2\2\16\u0090\3\2\2\2\20\u0092\3\2\2\2\22\u009e\3\2\2\2\24\u00a7\3\2\2"+
		"\2\26\u00a9\3\2\2\2\30\u00ba\3\2\2\2\32\u00bc\3\2\2\2\34\u00cb\3\2\2\2"+
		"\36\u00cd\3\2\2\2 \u00e1\3\2\2\2\"\u00ea\3\2\2\2$\u00f5\3\2\2\2&(\t\2"+
		"\2\2\'&\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*\3\3\2\2\2+)\3\2\2\2,-"+
		"\7\t\2\2-.\7\35\2\2./\7\36\2\2/\60\7\37\2\2\60\61\b\3\1\2\61\62\5\6\4"+
		"\2\62\63\b\3\1\2\63\64\5\b\5\2\64\65\7 \2\2\65\5\3\2\2\2\66\67\7\b\2\2"+
		"\678\7#\2\289\7!\2\29:\b\4\1\2:=\5\6\4\2;=\3\2\2\2<\66\3\2\2\2<;\3\2\2"+
		"\2=\7\3\2\2\2>?\5\n\6\2?@\5\b\5\2@A\b\5\1\2AD\3\2\2\2BD\b\5\1\2C>\3\2"+
		"\2\2CB\3\2\2\2D\t\3\2\2\2EF\7#\2\2FG\7\34\2\2GH\5\32\16\2HI\b\6\1\2IJ"+
		"\7!\2\2J\u0083\3\2\2\2KL\7\f\2\2LM\7#\2\2MN\7!\2\2N\u0083\b\6\1\2OP\7"+
		"\r\2\2PQ\5\32\16\2QR\7!\2\2RS\b\6\1\2S\u0083\3\2\2\2TU\7\n\2\2UV\7!\2"+
		"\2V\u0083\b\6\1\2WX\7\6\2\2XY\7\35\2\2YZ\b\6\1\2Z[\5\f\7\2[\\\7\36\2\2"+
		"\\]\7\37\2\2]^\b\6\1\2^_\5\b\5\2_`\7 \2\2`a\7\5\2\2ab\b\6\1\2bc\7\37\2"+
		"\2cd\5\b\5\2de\7 \2\2ef\7\7\2\2fg\b\6\1\2g\u0083\3\2\2\2hi\7\6\2\2ij\7"+
		"\35\2\2jk\b\6\1\2kl\5\f\7\2lm\7\36\2\2mn\7\37\2\2no\b\6\1\2op\5\b\5\2"+
		"pq\b\6\1\2qr\7 \2\2rs\7\7\2\2st\b\6\1\2t\u0083\3\2\2\2uv\b\6\1\2vw\7\13"+
		"\2\2wx\7\35\2\2xy\b\6\1\2yz\5\f\7\2z{\7\36\2\2{|\7\37\2\2|}\b\6\1\2}~"+
		"\5\b\5\2~\177\b\6\1\2\177\u0080\7 \2\2\u0080\u0081\b\6\1\2\u0081\u0083"+
		"\3\2\2\2\u0082E\3\2\2\2\u0082K\3\2\2\2\u0082O\3\2\2\2\u0082T\3\2\2\2\u0082"+
		"W\3\2\2\2\u0082h\3\2\2\2\u0082u\3\2\2\2\u0083\13\3\2\2\2\u0084\u0085\b"+
		"\7\1\2\u0085\u0086\5\20\t\2\u0086\u0087\5\16\b\2\u0087\u0088\b\7\1\2\u0088"+
		"\r\3\2\2\2\u0089\u008a\7\32\2\2\u008a\u008b\b\b\1\2\u008b\u008c\5\20\t"+
		"\2\u008c\u008d\5\16\b\2\u008d\u008e\b\b\1\2\u008e\u0091\3\2\2\2\u008f"+
		"\u0091\b\b\1\2\u0090\u0089\3\2\2\2\u0090\u008f\3\2\2\2\u0091\17\3\2\2"+
		"\2\u0092\u0093\b\t\1\2\u0093\u0094\5\24\13\2\u0094\u0095\5\22\n\2\u0095"+
		"\u0096\b\t\1\2\u0096\21\3\2\2\2\u0097\u0098\7\31\2\2\u0098\u0099\b\n\1"+
		"\2\u0099\u009a\5\24\13\2\u009a\u009b\5\22\n\2\u009b\u009c\b\n\1\2\u009c"+
		"\u009f\3\2\2\2\u009d\u009f\b\n\1\2\u009e\u0097\3\2\2\2\u009e\u009d\3\2"+
		"\2\2\u009f\23\3\2\2\2\u00a0\u00a1\7\33\2\2\u00a1\u00a2\5\24\13\2\u00a2"+
		"\u00a3\b\13\1\2\u00a3\u00a8\3\2\2\2\u00a4\u00a5\5\26\f\2\u00a5\u00a6\b"+
		"\13\1\2\u00a6\u00a8\3\2\2\2\u00a7\u00a0\3\2\2\2\u00a7\u00a4\3\2\2\2\u00a8"+
		"\25\3\2\2\2\u00a9\u00aa\5\32\16\2\u00aa\u00ab\5\30\r\2\u00ab\u00ac\5\32"+
		"\16\2\u00ac\u00ad\b\f\1\2\u00ad\27\3\2\2\2\u00ae\u00af\7\23\2\2\u00af"+
		"\u00bb\b\r\1\2\u00b0\u00b1\7\24\2\2\u00b1\u00bb\b\r\1\2\u00b2\u00b3\7"+
		"\25\2\2\u00b3\u00bb\b\r\1\2\u00b4\u00b5\7\26\2\2\u00b5\u00bb\b\r\1\2\u00b6"+
		"\u00b7\7\27\2\2\u00b7\u00bb\b\r\1\2\u00b8\u00b9\7\30\2\2\u00b9\u00bb\b"+
		"\r\1\2\u00ba\u00ae\3\2\2\2\u00ba\u00b0\3\2\2\2\u00ba\u00b2\3\2\2\2\u00ba"+
		"\u00b4\3\2\2\2\u00ba\u00b6\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\31\3\2\2"+
		"\2\u00bc\u00bd\5\36\20\2\u00bd\u00be\5\34\17\2\u00be\u00bf\b\16\1\2\u00bf"+
		"\33\3\2\2\2\u00c0\u00c1\7\16\2\2\u00c1\u00c2\5\36\20\2\u00c2\u00c3\5\34"+
		"\17\2\u00c3\u00c4\b\17\1\2\u00c4\u00cc\3\2\2\2\u00c5\u00c6\7\17\2\2\u00c6"+
		"\u00c7\5\36\20\2\u00c7\u00c8\5\34\17\2\u00c8\u00c9\b\17\1\2\u00c9\u00cc"+
		"\3\2\2\2\u00ca\u00cc\b\17\1\2\u00cb\u00c0\3\2\2\2\u00cb\u00c5\3\2\2\2"+
		"\u00cb\u00ca\3\2\2\2\u00cc\35\3\2\2\2\u00cd\u00ce\5\"\22\2\u00ce\u00cf"+
		"\5 \21\2\u00cf\u00d0\b\20\1\2\u00d0\37\3\2\2\2\u00d1\u00d2\7\20\2\2\u00d2"+
		"\u00d3\5\"\22\2\u00d3\u00d4\5 \21\2\u00d4\u00d5\b\21\1\2\u00d5\u00e2\3"+
		"\2\2\2\u00d6\u00d7\7\21\2\2\u00d7\u00d8\5\"\22\2\u00d8\u00d9\5 \21\2\u00d9"+
		"\u00da\b\21\1\2\u00da\u00e2\3\2\2\2\u00db\u00dc\7\22\2\2\u00dc\u00dd\5"+
		"\"\22\2\u00dd\u00de\5 \21\2\u00de\u00df\b\21\1\2\u00df\u00e2\3\2\2\2\u00e0"+
		"\u00e2\b\21\1\2\u00e1\u00d1\3\2\2\2\u00e1\u00d6\3\2\2\2\u00e1\u00db\3"+
		"\2\2\2\u00e1\u00e0\3\2\2\2\u00e2!\3\2\2\2\u00e3\u00e4\7\17\2\2\u00e4\u00e5"+
		"\5\"\22\2\u00e5\u00e6\b\22\1\2\u00e6\u00eb\3\2\2\2\u00e7\u00e8\5$\23\2"+
		"\u00e8\u00e9\b\22\1\2\u00e9\u00eb\3\2\2\2\u00ea\u00e3\3\2\2\2\u00ea\u00e7"+
		"\3\2\2\2\u00eb#\3\2\2\2\u00ec\u00ed\7\"\2\2\u00ed\u00f6\b\23\1\2\u00ee"+
		"\u00ef\7#\2\2\u00ef\u00f6\b\23\1\2\u00f0\u00f1\7\35\2\2\u00f1\u00f2\5"+
		"\32\16\2\u00f2\u00f3\7\36\2\2\u00f3\u00f4\b\23\1\2\u00f4\u00f6\3\2\2\2"+
		"\u00f5\u00ec\3\2\2\2\u00f5\u00ee\3\2\2\2\u00f5\u00f0\3\2\2\2\u00f6%\3"+
		"\2\2\2\16)<C\u0082\u0090\u009e\u00a7\u00ba\u00cb\u00e1\u00ea\u00f5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}