// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class fileParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMA=1, SEMI=2, COLON=3, ASSIGN=4, LBR=5, RBR=6, PLUS=7, MINUS=8, NEG=9, 
		OR=10, AND=11, EQUAL=12, NOTEQUAL=13, GREATER=14, GREATEREQUAL=15, LESS=16, 
		LESSEQUAL=17, Main=18, Begin=19, End=20, Void=21, Is=22, Return=23, Variable=24, 
		Integer=25, If=26, Else=27, True=28, False=29, While=30, Skip=31, Constant=32, 
		Boolean=33, BOOL=34, LINECOMMENT=35, MULTICOMMENT=36, WS=37, ID=38, NUMBER=39;
	public static final int
		RULE_prog = 0, RULE_decl_list = 1, RULE_decl = 2, RULE_var_decl = 3, RULE_const_decl = 4, 
		RULE_function_list = 5, RULE_function = 6, RULE_type = 7, RULE_parameter_list = 8, 
		RULE_nemp_parameter_list = 9, RULE_main = 10, RULE_statement_block = 11, 
		RULE_statement = 12, RULE_expression = 13, RULE_binary_arith_op = 14, 
		RULE_fragment2 = 15, RULE_condition = 16, RULE_comp_op = 17, RULE_arg_list = 18, 
		RULE_nemp_arg_list = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "decl_list", "decl", "var_decl", "const_decl", "function_list", 
			"function", "type", "parameter_list", "nemp_parameter_list", "main", 
			"statement_block", "statement", "expression", "binary_arith_op", "fragment2", 
			"condition", "comp_op", "arg_list", "nemp_arg_list"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "';'", "':'", "':='", "'('", "')'", "'+'", "'-'", "'~'", 
			"'|'", "'&'", "'='", "'!='", "'<'", "'<='", "'>'", "'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMA", "SEMI", "COLON", "ASSIGN", "LBR", "RBR", "PLUS", "MINUS", 
			"NEG", "OR", "AND", "EQUAL", "NOTEQUAL", "GREATER", "GREATEREQUAL", "LESS", 
			"LESSEQUAL", "Main", "Begin", "End", "Void", "Is", "Return", "Variable", 
			"Integer", "If", "Else", "True", "False", "While", "Skip", "Constant", 
			"Boolean", "BOOL", "LINECOMMENT", "MULTICOMMENT", "WS", "ID", "NUMBER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public fileParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public Decl_listContext decl_list() {
			return getRuleContext(Decl_listContext.class,0);
		}
		public Function_listContext function_list() {
			return getRuleContext(Function_listContext.class,0);
		}
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			decl_list();
			setState(41);
			function_list();
			setState(42);
			main();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Decl_listContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(fileParser.SEMI, 0); }
		public Decl_listContext decl_list() {
			return getRuleContext(Decl_listContext.class,0);
		}
		public Decl_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).enterDecl_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).exitDecl_list(this);
		}
	}

	public final Decl_listContext decl_list() throws RecognitionException {
		Decl_listContext _localctx = new Decl_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decl_list);
		try {
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Variable:
			case Constant:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				decl();
				setState(45);
				match(SEMI);
				setState(46);
				decl_list();
				}
				break;
			case RBR:
			case Main:
			case Begin:
			case End:
			case Void:
			case Integer:
			case If:
			case Else:
			case While:
			case Skip:
			case Boolean:
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclContext extends ParserRuleContext {
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public Const_declContext const_decl() {
			return getRuleContext(Const_declContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl);
		try {
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Variable:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				var_decl();
				}
				break;
			case Constant:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				const_decl();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Var_declContext extends ParserRuleContext {
		public TerminalNode Variable() { return getToken(fileParser.Variable, 0); }
		public TerminalNode ID() { return getToken(fileParser.ID, 0); }
		public TerminalNode COLON() { return getToken(fileParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).exitVar_decl(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(Variable);
			setState(56);
			match(ID);
			setState(57);
			match(COLON);
			setState(58);
			type();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Const_declContext extends ParserRuleContext {
		public TerminalNode Constant() { return getToken(fileParser.Constant, 0); }
		public TerminalNode ID() { return getToken(fileParser.ID, 0); }
		public TerminalNode COLON() { return getToken(fileParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(fileParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Const_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).enterConst_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).exitConst_decl(this);
		}
	}

	public final Const_declContext const_decl() throws RecognitionException {
		Const_declContext _localctx = new Const_declContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_const_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(Constant);
			setState(61);
			match(ID);
			setState(62);
			match(COLON);
			setState(63);
			type();
			setState(64);
			match(ASSIGN);
			setState(65);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_listContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public Function_listContext function_list() {
			return getRuleContext(Function_listContext.class,0);
		}
		public Function_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).enterFunction_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).exitFunction_list(this);
		}
	}

	public final Function_listContext function_list() throws RecognitionException {
		Function_listContext _localctx = new Function_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function_list);
		try {
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RBR:
			case Void:
			case Integer:
			case Boolean:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				function();
				setState(68);
				function_list();
				}
				break;
			case Main:
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(fileParser.ID, 0); }
		public List<TerminalNode> LBR() { return getTokens(fileParser.LBR); }
		public TerminalNode LBR(int i) {
			return getToken(fileParser.LBR, i);
		}
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public TerminalNode RBR() { return getToken(fileParser.RBR, 0); }
		public TerminalNode Is() { return getToken(fileParser.Is, 0); }
		public Decl_listContext decl_list() {
			return getRuleContext(Decl_listContext.class,0);
		}
		public TerminalNode Begin() { return getToken(fileParser.Begin, 0); }
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public TerminalNode Return() { return getToken(fileParser.Return, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(fileParser.SEMI, 0); }
		public TerminalNode End() { return getToken(fileParser.End, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_function);
		try {
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Void:
			case Integer:
			case Boolean:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				type();
				setState(74);
				match(ID);
				setState(75);
				match(LBR);
				setState(76);
				parameter_list();
				setState(77);
				match(RBR);
				setState(78);
				match(Is);
				setState(79);
				decl_list();
				setState(80);
				match(Begin);
				setState(81);
				statement_block();
				setState(82);
				match(Return);
				setState(83);
				match(LBR);
				setState(84);
				expression();
				}
				break;
			case RBR:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				match(RBR);
				setState(87);
				match(SEMI);
				setState(88);
				match(End);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode Integer() { return getToken(fileParser.Integer, 0); }
		public TerminalNode Boolean() { return getToken(fileParser.Boolean, 0); }
		public TerminalNode Void() { return getToken(fileParser.Void, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 8625586176L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Parameter_listContext extends ParserRuleContext {
		public Nemp_parameter_listContext nemp_parameter_list() {
			return getRuleContext(Nemp_parameter_listContext.class,0);
		}
		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).enterParameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).exitParameter_list(this);
		}
	}

	public final Parameter_listContext parameter_list() throws RecognitionException {
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parameter_list);
		try {
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				nemp_parameter_list();
				}
				break;
			case RBR:
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

	@SuppressWarnings("CheckReturnValue")
	public static class Nemp_parameter_listContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(fileParser.ID, 0); }
		public TerminalNode COLON() { return getToken(fileParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(fileParser.COMMA, 0); }
		public Nemp_parameter_listContext nemp_parameter_list() {
			return getRuleContext(Nemp_parameter_listContext.class,0);
		}
		public Nemp_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nemp_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).enterNemp_parameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).exitNemp_parameter_list(this);
		}
	}

	public final Nemp_parameter_listContext nemp_parameter_list() throws RecognitionException {
		Nemp_parameter_listContext _localctx = new Nemp_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_nemp_parameter_list);
		try {
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				match(ID);
				setState(98);
				match(COLON);
				setState(99);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				match(ID);
				setState(101);
				match(COLON);
				setState(102);
				type();
				setState(103);
				match(COMMA);
				setState(104);
				nemp_parameter_list();
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

	@SuppressWarnings("CheckReturnValue")
	public static class MainContext extends ParserRuleContext {
		public TerminalNode Main() { return getToken(fileParser.Main, 0); }
		public TerminalNode Begin() { return getToken(fileParser.Begin, 0); }
		public Decl_listContext decl_list() {
			return getRuleContext(Decl_listContext.class,0);
		}
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public TerminalNode End() { return getToken(fileParser.End, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).exitMain(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(Main);
			setState(109);
			match(Begin);
			setState(110);
			decl_list();
			setState(111);
			statement_block();
			setState(112);
			match(End);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Statement_blockContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public Statement_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).enterStatement_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).exitStatement_block(this);
		}
	}

	public final Statement_blockContext statement_block() throws RecognitionException {
		Statement_blockContext _localctx = new Statement_blockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statement_block);
		try {
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Begin:
			case If:
			case Else:
			case While:
			case Skip:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				statement();
				setState(115);
				statement_block();
				}
				break;
			case End:
			case Return:
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(fileParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(fileParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(fileParser.SEMI, 0); }
		public TerminalNode LBR() { return getToken(fileParser.LBR, 0); }
		public Arg_listContext arg_list() {
			return getRuleContext(Arg_listContext.class,0);
		}
		public TerminalNode RBR() { return getToken(fileParser.RBR, 0); }
		public TerminalNode Begin() { return getToken(fileParser.Begin, 0); }
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public TerminalNode End() { return getToken(fileParser.End, 0); }
		public TerminalNode If() { return getToken(fileParser.If, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode Else() { return getToken(fileParser.Else, 0); }
		public TerminalNode While() { return getToken(fileParser.While, 0); }
		public TerminalNode Skip() { return getToken(fileParser.Skip, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_statement);
		try {
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				match(ID);
				setState(121);
				match(ASSIGN);
				setState(122);
				expression();
				setState(123);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				match(ID);
				setState(126);
				match(LBR);
				setState(127);
				arg_list();
				setState(128);
				match(RBR);
				setState(129);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(131);
				match(Begin);
				setState(132);
				statement_block();
				setState(133);
				match(End);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(135);
				match(If);
				setState(136);
				condition(0);
				setState(137);
				match(Begin);
				setState(138);
				statement_block();
				setState(139);
				match(End);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(141);
				match(Else);
				setState(142);
				match(Begin);
				setState(143);
				statement_block();
				setState(144);
				match(End);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(146);
				match(While);
				setState(147);
				condition(0);
				setState(148);
				match(Begin);
				setState(149);
				statement_block();
				setState(150);
				match(End);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(152);
				match(Skip);
				setState(153);
				match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public List<Fragment2Context> fragment2() {
			return getRuleContexts(Fragment2Context.class);
		}
		public Fragment2Context fragment2(int i) {
			return getRuleContext(Fragment2Context.class,i);
		}
		public Binary_arith_opContext binary_arith_op() {
			return getRuleContext(Binary_arith_opContext.class,0);
		}
		public TerminalNode LBR() { return getToken(fileParser.LBR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBR() { return getToken(fileParser.RBR, 0); }
		public TerminalNode ID() { return getToken(fileParser.ID, 0); }
		public Arg_listContext arg_list() {
			return getRuleContext(Arg_listContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expression);
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				fragment2();
				setState(157);
				binary_arith_op();
				setState(158);
				fragment2();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				match(LBR);
				setState(161);
				expression();
				setState(162);
				match(RBR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
				match(ID);
				setState(165);
				match(LBR);
				setState(166);
				arg_list();
				setState(167);
				match(RBR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(169);
				fragment2();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Binary_arith_opContext extends ParserRuleContext {
		public Token op;
		public TerminalNode PLUS() { return getToken(fileParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(fileParser.MINUS, 0); }
		public Binary_arith_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_arith_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).enterBinary_arith_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).exitBinary_arith_op(this);
		}
	}

	public final Binary_arith_opContext binary_arith_op() throws RecognitionException {
		Binary_arith_opContext _localctx = new Binary_arith_opContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_binary_arith_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			((Binary_arith_opContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
				((Binary_arith_opContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Fragment2Context extends ParserRuleContext {
		public TerminalNode ID() { return getToken(fileParser.ID, 0); }
		public TerminalNode MINUS() { return getToken(fileParser.MINUS, 0); }
		public TerminalNode NUMBER() { return getToken(fileParser.NUMBER, 0); }
		public TerminalNode True() { return getToken(fileParser.True, 0); }
		public TerminalNode False() { return getToken(fileParser.False, 0); }
		public TerminalNode LBR() { return getToken(fileParser.LBR, 0); }
		public Arg_listContext arg_list() {
			return getRuleContext(Arg_listContext.class,0);
		}
		public TerminalNode RBR() { return getToken(fileParser.RBR, 0); }
		public Fragment2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fragment2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).enterFragment2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).exitFragment2(this);
		}
	}

	public final Fragment2Context fragment2() throws RecognitionException {
		Fragment2Context _localctx = new Fragment2Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_fragment2);
		try {
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				match(MINUS);
				setState(176);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(177);
				match(NUMBER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(178);
				match(True);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(179);
				match(False);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(180);
				match(ID);
				setState(181);
				match(LBR);
				setState(182);
				arg_list();
				setState(183);
				match(RBR);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public Token op;
		public TerminalNode NEG() { return getToken(fileParser.NEG, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode LBR() { return getToken(fileParser.LBR, 0); }
		public TerminalNode RBR() { return getToken(fileParser.RBR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Comp_opContext comp_op() {
			return getRuleContext(Comp_opContext.class,0);
		}
		public TerminalNode OR() { return getToken(fileParser.OR, 0); }
		public TerminalNode AND() { return getToken(fileParser.AND, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		return condition(0);
	}

	private ConditionContext condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionContext _localctx = new ConditionContext(_ctx, _parentState);
		ConditionContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_condition, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(189);
				match(NEG);
				setState(190);
				condition(4);
				}
				break;
			case 2:
				{
				setState(191);
				match(LBR);
				setState(192);
				condition(0);
				setState(193);
				match(RBR);
				}
				break;
			case 3:
				{
				setState(195);
				expression();
				setState(196);
				comp_op();
				setState(197);
				expression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(206);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_condition);
					setState(201);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(202);
					((ConditionContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==OR || _la==AND) ) {
						((ConditionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(203);
					condition(2);
					}
					} 
				}
				setState(208);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Comp_opContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(fileParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(fileParser.NOTEQUAL, 0); }
		public TerminalNode GREATER() { return getToken(fileParser.GREATER, 0); }
		public TerminalNode GREATEREQUAL() { return getToken(fileParser.GREATEREQUAL, 0); }
		public TerminalNode LESS() { return getToken(fileParser.LESS, 0); }
		public TerminalNode LESSEQUAL() { return getToken(fileParser.LESSEQUAL, 0); }
		public Comp_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).enterComp_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).exitComp_op(this);
		}
	}

	public final Comp_opContext comp_op() throws RecognitionException {
		Comp_opContext _localctx = new Comp_opContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_comp_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 258048L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Arg_listContext extends ParserRuleContext {
		public Nemp_arg_listContext nemp_arg_list() {
			return getRuleContext(Nemp_arg_listContext.class,0);
		}
		public Arg_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).enterArg_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).exitArg_list(this);
		}
	}

	public final Arg_listContext arg_list() throws RecognitionException {
		Arg_listContext _localctx = new Arg_listContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_arg_list);
		try {
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				nemp_arg_list();
				}
				break;
			case RBR:
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

	@SuppressWarnings("CheckReturnValue")
	public static class Nemp_arg_listContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(fileParser.ID, 0); }
		public TerminalNode COMMA() { return getToken(fileParser.COMMA, 0); }
		public Nemp_arg_listContext nemp_arg_list() {
			return getRuleContext(Nemp_arg_listContext.class,0);
		}
		public Nemp_arg_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nemp_arg_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).enterNemp_arg_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).exitNemp_arg_list(this);
		}
	}

	public final Nemp_arg_listContext nemp_arg_list() throws RecognitionException {
		Nemp_arg_listContext _localctx = new Nemp_arg_listContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_nemp_arg_list);
		try {
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				match(ID);
				setState(217);
				match(COMMA);
				setState(218);
				nemp_arg_list();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\'\u00de\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"2\b\u0001\u0001\u0002\u0001\u0002\u0003\u00026\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005H\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006Z\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0003\b`\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\tk\b\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000bw\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u009b\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u00ab\b\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00bb\b\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00c8\b\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00cd\b\u0010\n\u0010"+
		"\f\u0010\u00d0\t\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u00d6\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u00dc\b\u0013\u0001\u0013\u0000\u0001 \u0014\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&\u0000\u0004\u0003\u0000\u0015\u0015\u0019\u0019!!\u0001\u0000\u0007"+
		"\b\u0001\u0000\n\u000b\u0001\u0000\f\u0011\u00e4\u0000(\u0001\u0000\u0000"+
		"\u0000\u00021\u0001\u0000\u0000\u0000\u00045\u0001\u0000\u0000\u0000\u0006"+
		"7\u0001\u0000\u0000\u0000\b<\u0001\u0000\u0000\u0000\nG\u0001\u0000\u0000"+
		"\u0000\fY\u0001\u0000\u0000\u0000\u000e[\u0001\u0000\u0000\u0000\u0010"+
		"_\u0001\u0000\u0000\u0000\u0012j\u0001\u0000\u0000\u0000\u0014l\u0001"+
		"\u0000\u0000\u0000\u0016v\u0001\u0000\u0000\u0000\u0018\u009a\u0001\u0000"+
		"\u0000\u0000\u001a\u00aa\u0001\u0000\u0000\u0000\u001c\u00ac\u0001\u0000"+
		"\u0000\u0000\u001e\u00ba\u0001\u0000\u0000\u0000 \u00c7\u0001\u0000\u0000"+
		"\u0000\"\u00d1\u0001\u0000\u0000\u0000$\u00d5\u0001\u0000\u0000\u0000"+
		"&\u00db\u0001\u0000\u0000\u0000()\u0003\u0002\u0001\u0000)*\u0003\n\u0005"+
		"\u0000*+\u0003\u0014\n\u0000+\u0001\u0001\u0000\u0000\u0000,-\u0003\u0004"+
		"\u0002\u0000-.\u0005\u0002\u0000\u0000./\u0003\u0002\u0001\u0000/2\u0001"+
		"\u0000\u0000\u000002\u0001\u0000\u0000\u00001,\u0001\u0000\u0000\u0000"+
		"10\u0001\u0000\u0000\u00002\u0003\u0001\u0000\u0000\u000036\u0003\u0006"+
		"\u0003\u000046\u0003\b\u0004\u000053\u0001\u0000\u0000\u000054\u0001\u0000"+
		"\u0000\u00006\u0005\u0001\u0000\u0000\u000078\u0005\u0018\u0000\u0000"+
		"89\u0005&\u0000\u00009:\u0005\u0003\u0000\u0000:;\u0003\u000e\u0007\u0000"+
		";\u0007\u0001\u0000\u0000\u0000<=\u0005 \u0000\u0000=>\u0005&\u0000\u0000"+
		">?\u0005\u0003\u0000\u0000?@\u0003\u000e\u0007\u0000@A\u0005\u0004\u0000"+
		"\u0000AB\u0003\u001a\r\u0000B\t\u0001\u0000\u0000\u0000CD\u0003\f\u0006"+
		"\u0000DE\u0003\n\u0005\u0000EH\u0001\u0000\u0000\u0000FH\u0001\u0000\u0000"+
		"\u0000GC\u0001\u0000\u0000\u0000GF\u0001\u0000\u0000\u0000H\u000b\u0001"+
		"\u0000\u0000\u0000IJ\u0003\u000e\u0007\u0000JK\u0005&\u0000\u0000KL\u0005"+
		"\u0005\u0000\u0000LM\u0003\u0010\b\u0000MN\u0005\u0006\u0000\u0000NO\u0005"+
		"\u0016\u0000\u0000OP\u0003\u0002\u0001\u0000PQ\u0005\u0013\u0000\u0000"+
		"QR\u0003\u0016\u000b\u0000RS\u0005\u0017\u0000\u0000ST\u0005\u0005\u0000"+
		"\u0000TU\u0003\u001a\r\u0000UZ\u0001\u0000\u0000\u0000VW\u0005\u0006\u0000"+
		"\u0000WX\u0005\u0002\u0000\u0000XZ\u0005\u0014\u0000\u0000YI\u0001\u0000"+
		"\u0000\u0000YV\u0001\u0000\u0000\u0000Z\r\u0001\u0000\u0000\u0000[\\\u0007"+
		"\u0000\u0000\u0000\\\u000f\u0001\u0000\u0000\u0000]`\u0003\u0012\t\u0000"+
		"^`\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_^\u0001\u0000\u0000"+
		"\u0000`\u0011\u0001\u0000\u0000\u0000ab\u0005&\u0000\u0000bc\u0005\u0003"+
		"\u0000\u0000ck\u0003\u000e\u0007\u0000de\u0005&\u0000\u0000ef\u0005\u0003"+
		"\u0000\u0000fg\u0003\u000e\u0007\u0000gh\u0005\u0001\u0000\u0000hi\u0003"+
		"\u0012\t\u0000ik\u0001\u0000\u0000\u0000ja\u0001\u0000\u0000\u0000jd\u0001"+
		"\u0000\u0000\u0000k\u0013\u0001\u0000\u0000\u0000lm\u0005\u0012\u0000"+
		"\u0000mn\u0005\u0013\u0000\u0000no\u0003\u0002\u0001\u0000op\u0003\u0016"+
		"\u000b\u0000pq\u0005\u0014\u0000\u0000q\u0015\u0001\u0000\u0000\u0000"+
		"rs\u0003\u0018\f\u0000st\u0003\u0016\u000b\u0000tw\u0001\u0000\u0000\u0000"+
		"uw\u0001\u0000\u0000\u0000vr\u0001\u0000\u0000\u0000vu\u0001\u0000\u0000"+
		"\u0000w\u0017\u0001\u0000\u0000\u0000xy\u0005&\u0000\u0000yz\u0005\u0004"+
		"\u0000\u0000z{\u0003\u001a\r\u0000{|\u0005\u0002\u0000\u0000|\u009b\u0001"+
		"\u0000\u0000\u0000}~\u0005&\u0000\u0000~\u007f\u0005\u0005\u0000\u0000"+
		"\u007f\u0080\u0003$\u0012\u0000\u0080\u0081\u0005\u0006\u0000\u0000\u0081"+
		"\u0082\u0005\u0002\u0000\u0000\u0082\u009b\u0001\u0000\u0000\u0000\u0083"+
		"\u0084\u0005\u0013\u0000\u0000\u0084\u0085\u0003\u0016\u000b\u0000\u0085"+
		"\u0086\u0005\u0014\u0000\u0000\u0086\u009b\u0001\u0000\u0000\u0000\u0087"+
		"\u0088\u0005\u001a\u0000\u0000\u0088\u0089\u0003 \u0010\u0000\u0089\u008a"+
		"\u0005\u0013\u0000\u0000\u008a\u008b\u0003\u0016\u000b\u0000\u008b\u008c"+
		"\u0005\u0014\u0000\u0000\u008c\u009b\u0001\u0000\u0000\u0000\u008d\u008e"+
		"\u0005\u001b\u0000\u0000\u008e\u008f\u0005\u0013\u0000\u0000\u008f\u0090"+
		"\u0003\u0016\u000b\u0000\u0090\u0091\u0005\u0014\u0000\u0000\u0091\u009b"+
		"\u0001\u0000\u0000\u0000\u0092\u0093\u0005\u001e\u0000\u0000\u0093\u0094"+
		"\u0003 \u0010\u0000\u0094\u0095\u0005\u0013\u0000\u0000\u0095\u0096\u0003"+
		"\u0016\u000b\u0000\u0096\u0097\u0005\u0014\u0000\u0000\u0097\u009b\u0001"+
		"\u0000\u0000\u0000\u0098\u0099\u0005\u001f\u0000\u0000\u0099\u009b\u0005"+
		"\u0002\u0000\u0000\u009ax\u0001\u0000\u0000\u0000\u009a}\u0001\u0000\u0000"+
		"\u0000\u009a\u0083\u0001\u0000\u0000\u0000\u009a\u0087\u0001\u0000\u0000"+
		"\u0000\u009a\u008d\u0001\u0000\u0000\u0000\u009a\u0092\u0001\u0000\u0000"+
		"\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009b\u0019\u0001\u0000\u0000"+
		"\u0000\u009c\u009d\u0003\u001e\u000f\u0000\u009d\u009e\u0003\u001c\u000e"+
		"\u0000\u009e\u009f\u0003\u001e\u000f\u0000\u009f\u00ab\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a1\u0005\u0005\u0000\u0000\u00a1\u00a2\u0003\u001a\r\u0000"+
		"\u00a2\u00a3\u0005\u0006\u0000\u0000\u00a3\u00ab\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a5\u0005&\u0000\u0000\u00a5\u00a6\u0005\u0005\u0000\u0000\u00a6"+
		"\u00a7\u0003$\u0012\u0000\u00a7\u00a8\u0005\u0006\u0000\u0000\u00a8\u00ab"+
		"\u0001\u0000\u0000\u0000\u00a9\u00ab\u0003\u001e\u000f\u0000\u00aa\u009c"+
		"\u0001\u0000\u0000\u0000\u00aa\u00a0\u0001\u0000\u0000\u0000\u00aa\u00a4"+
		"\u0001\u0000\u0000\u0000\u00aa\u00a9\u0001\u0000\u0000\u0000\u00ab\u001b"+
		"\u0001\u0000\u0000\u0000\u00ac\u00ad\u0007\u0001\u0000\u0000\u00ad\u001d"+
		"\u0001\u0000\u0000\u0000\u00ae\u00bb\u0005&\u0000\u0000\u00af\u00b0\u0005"+
		"\b\u0000\u0000\u00b0\u00bb\u0005&\u0000\u0000\u00b1\u00bb\u0005\'\u0000"+
		"\u0000\u00b2\u00bb\u0005\u001c\u0000\u0000\u00b3\u00bb\u0005\u001d\u0000"+
		"\u0000\u00b4\u00b5\u0005&\u0000\u0000\u00b5\u00b6\u0005\u0005\u0000\u0000"+
		"\u00b6\u00b7\u0003$\u0012\u0000\u00b7\u00b8\u0005\u0006\u0000\u0000\u00b8"+
		"\u00bb\u0001\u0000\u0000\u0000\u00b9\u00bb\u0001\u0000\u0000\u0000\u00ba"+
		"\u00ae\u0001\u0000\u0000\u0000\u00ba\u00af\u0001\u0000\u0000\u0000\u00ba"+
		"\u00b1\u0001\u0000\u0000\u0000\u00ba\u00b2\u0001\u0000\u0000\u0000\u00ba"+
		"\u00b3\u0001\u0000\u0000\u0000\u00ba\u00b4\u0001\u0000\u0000\u0000\u00ba"+
		"\u00b9\u0001\u0000\u0000\u0000\u00bb\u001f\u0001\u0000\u0000\u0000\u00bc"+
		"\u00bd\u0006\u0010\uffff\uffff\u0000\u00bd\u00be\u0005\t\u0000\u0000\u00be"+
		"\u00c8\u0003 \u0010\u0004\u00bf\u00c0\u0005\u0005\u0000\u0000\u00c0\u00c1"+
		"\u0003 \u0010\u0000\u00c1\u00c2\u0005\u0006\u0000\u0000\u00c2\u00c8\u0001"+
		"\u0000\u0000\u0000\u00c3\u00c4\u0003\u001a\r\u0000\u00c4\u00c5\u0003\""+
		"\u0011\u0000\u00c5\u00c6\u0003\u001a\r\u0000\u00c6\u00c8\u0001\u0000\u0000"+
		"\u0000\u00c7\u00bc\u0001\u0000\u0000\u0000\u00c7\u00bf\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c3\u0001\u0000\u0000\u0000\u00c8\u00ce\u0001\u0000\u0000"+
		"\u0000\u00c9\u00ca\n\u0001\u0000\u0000\u00ca\u00cb\u0007\u0002\u0000\u0000"+
		"\u00cb\u00cd\u0003 \u0010\u0002\u00cc\u00c9\u0001\u0000\u0000\u0000\u00cd"+
		"\u00d0\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00ce"+
		"\u00cf\u0001\u0000\u0000\u0000\u00cf!\u0001\u0000\u0000\u0000\u00d0\u00ce"+
		"\u0001\u0000\u0000\u0000\u00d1\u00d2\u0007\u0003\u0000\u0000\u00d2#\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d6\u0003&\u0013\u0000\u00d4\u00d6\u0001\u0000"+
		"\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d4\u0001\u0000"+
		"\u0000\u0000\u00d6%\u0001\u0000\u0000\u0000\u00d7\u00dc\u0005&\u0000\u0000"+
		"\u00d8\u00d9\u0005&\u0000\u0000\u00d9\u00da\u0005\u0001\u0000\u0000\u00da"+
		"\u00dc\u0003&\u0013\u0000\u00db\u00d7\u0001\u0000\u0000\u0000\u00db\u00d8"+
		"\u0001\u0000\u0000\u0000\u00dc\'\u0001\u0000\u0000\u0000\u000e15GY_jv"+
		"\u009a\u00aa\u00ba\u00c7\u00ce\u00d5\u00db";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}