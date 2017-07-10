// Generated from Lua.g4 by ANTLR 4.5.3
package br.unb.erekobot.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LuaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		NAME=67, NORMALSTRING=68, CHARSTRING=69, LONGSTRING=70, INT=71, HEX=72, 
		FLOAT=73, HEX_FLOAT=74, COMMENT=75, LINE_COMMENT=76, WS=77, SHEBANG=78;
	public static final int
		RULE_chunk = 0, RULE_block = 1, RULE_stat = 2, RULE_retstat = 3, RULE_label = 4, 
		RULE_funcname = 5, RULE_varlist = 6, RULE_namelist = 7, RULE_explist = 8, 
		RULE_exp = 9, RULE_prefixexp = 10, RULE_functioncall = 11, RULE_varOrExp = 12, 
		RULE_var = 13, RULE_varSuffix = 14, RULE_nameAndArgs = 15, RULE_args = 16, 
		RULE_functiondef = 17, RULE_funcbody = 18, RULE_parlist = 19, RULE_tableconstructor = 20, 
		RULE_fieldlist = 21, RULE_field = 22, RULE_fieldsep = 23, RULE_operatorOr = 24, 
		RULE_operatorAnd = 25, RULE_operatorComparison = 26, RULE_operatorStrcat = 27, 
		RULE_operatorAddSub = 28, RULE_operatorMulDivMod = 29, RULE_operatorBitwise = 30, 
		RULE_operatorUnary = 31, RULE_operatorPower = 32, RULE_number = 33, RULE_string = 34;
	public static final String[] ruleNames = {
		"chunk", "block", "stat", "retstat", "label", "funcname", "varlist", "namelist", 
		"explist", "exp", "prefixexp", "functioncall", "varOrExp", "var", "varSuffix", 
		"nameAndArgs", "args", "functiondef", "funcbody", "parlist", "tableconstructor", 
		"fieldlist", "field", "fieldsep", "operatorOr", "operatorAnd", "operatorComparison", 
		"operatorStrcat", "operatorAddSub", "operatorMulDivMod", "operatorBitwise", 
		"operatorUnary", "operatorPower", "number", "string"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'if'", "'('", "'sim_call_type'", "'=='", "'sim_childscriptcall_initialization'", 
		"')'", "'then'", "'end'", "'sim_childscriptcall_actuation'", "'sim_childscriptcall_sensing'", 
		"'sim_childscriptcall_cleanup'", "'='", "'simGetScriptSimulationParameter'", 
		"'simSetScriptAttribute'", "'simGetObjectAssociatedWithScript'", "'simGetObjectHandle'", 
		"'simSetJointPosition'", "','", "'not'", "'firstTimeHere93846738'", "'break'", 
		"'goto'", "'do'", "'while'", "'repeat'", "'until'", "'elseif'", "'else'", 
		"'for'", "'in'", "'function'", "'local'", "'return'", "'::'", "'.'", "':'", 
		"'nil'", "'false'", "'true'", "'...'", "'['", "']'", "'{'", "'}'", "'or'", 
		"'and'", "'<'", "'>'", "'<='", "'>='", "'~='", "'..'", "'+'", "'-'", "'*'", 
		"'/'", "'%'", "'//'", "'&'", "'|'", "'~'", "'<<'", "'>>'", "'#'", "'^'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "NAME", "NORMALSTRING", "CHARSTRING", 
		"LONGSTRING", "INT", "HEX", "FLOAT", "HEX_FLOAT", "COMMENT", "LINE_COMMENT", 
		"WS", "SHEBANG"
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
	public String getGrammarFileName() { return "Lua.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LuaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ChunkContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(LuaParser.EOF, 0); }
		public ChunkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chunk; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitChunk(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChunkContext chunk() throws RecognitionException {
		ChunkContext _localctx = new ChunkContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_chunk);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			block();
			setState(71);
			match(EOF);
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public RetstatContext retstat() {
			return getRuleContext(RetstatContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__14) | (1L << T__17) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__29) | (1L << T__31) | (1L << T__32) | (1L << T__34))) != 0) || _la==NAME) {
				{
				{
				setState(73);
				stat();
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
			_la = _input.LA(1);
			if (_la==T__33) {
				{
				setState(79);
				retstat();
				}
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

	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FirstTimeAttribContext extends StatContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public FirstTimeAttribContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitFirstTimeAttrib(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LoopFunContext extends StatContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LoopFunContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitLoopFun(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BreakContext extends StatContext {
		public BreakContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitBreak(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SensingContext extends StatContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public SensingContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitSensing(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetScriptContext extends StatContext {
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public SetScriptContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitSetScript(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RepeatContext extends StatContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public RepeatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitRepeat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CleanupContext extends StatContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CleanupContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitCleanup(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GetScriptContext extends StatContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public GetScriptContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitGetScript(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetupFunContext extends StatContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public SetupFunContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitSetupFun(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LocalFuncDeclarationContext extends StatContext {
		public TerminalNode NAME() { return getToken(LuaParser.NAME, 0); }
		public FuncbodyContext funcbody() {
			return getRuleContext(FuncbodyContext.class,0);
		}
		public LocalFuncDeclarationContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitLocalFuncDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FirstTimeIfContext extends StatContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FirstTimeIfContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitFirstTimeIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GetObjectContext extends StatContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public GetObjectContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitGetObject(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LocalAttribContext extends StatContext {
		public NamelistContext namelist() {
			return getRuleContext(NamelistContext.class,0);
		}
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public LocalAttribContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitLocalAttrib(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GotoContext extends StatContext {
		public TerminalNode NAME() { return getToken(LuaParser.NAME, 0); }
		public GotoContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitGoto(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetJointContext extends StatContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public SetJointContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitSetJoint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForContext extends StatContext {
		public TerminalNode NAME() { return getToken(LuaParser.NAME, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoContext extends StatContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public DoContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitDo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileContext extends StatContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncDeclarationContext extends StatContext {
		public FuncnameContext funcname() {
			return getRuleContext(FuncnameContext.class,0);
		}
		public FuncbodyContext funcbody() {
			return getRuleContext(FuncbodyContext.class,0);
		}
		public FuncDeclarationContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitFuncDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LabellContext extends StatContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public LabellContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitLabell(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SemiColonContext extends StatContext {
		public SemiColonContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitSemiColon(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncCallContext extends StatContext {
		public FunctioncallContext functioncall() {
			return getRuleContext(FunctioncallContext.class,0);
		}
		public FuncCallContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GetHandleContext extends StatContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public GetHandleContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitGetHandle(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiAttribContext extends StatContext {
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public MultiAttribContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitMultiAttrib(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfContext extends StatContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public IfContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForMultiAttribContext extends StatContext {
		public NamelistContext namelist() {
			return getRuleContext(NamelistContext.class,0);
		}
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForMultiAttribContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitForMultiAttrib(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stat);
		int _la;
		try {
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new SemiColonContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				match(T__0);
				}
				break;
			case 2:
				_localctx = new SetupFunContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				match(T__1);
				setState(84);
				match(T__2);
				setState(85);
				match(T__3);
				setState(86);
				match(T__4);
				setState(87);
				match(T__5);
				setState(88);
				match(T__6);
				setState(89);
				match(T__7);
				setState(90);
				block();
				setState(91);
				match(T__8);
				}
				break;
			case 3:
				_localctx = new LoopFunContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(93);
				match(T__1);
				setState(94);
				match(T__2);
				setState(95);
				match(T__3);
				setState(96);
				match(T__4);
				setState(97);
				match(T__9);
				setState(98);
				match(T__6);
				setState(99);
				match(T__7);
				setState(100);
				block();
				setState(101);
				match(T__8);
				}
				break;
			case 4:
				_localctx = new SensingContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(103);
				match(T__1);
				setState(104);
				match(T__2);
				setState(105);
				match(T__3);
				setState(106);
				match(T__4);
				setState(107);
				match(T__10);
				setState(108);
				match(T__6);
				setState(109);
				match(T__7);
				setState(110);
				block();
				setState(111);
				match(T__8);
				}
				break;
			case 5:
				_localctx = new CleanupContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(113);
				match(T__1);
				setState(114);
				match(T__2);
				setState(115);
				match(T__3);
				setState(116);
				match(T__4);
				setState(117);
				match(T__11);
				setState(118);
				match(T__6);
				setState(119);
				match(T__7);
				setState(120);
				block();
				setState(121);
				match(T__8);
				}
				break;
			case 6:
				_localctx = new GetScriptContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(123);
				var();
				setState(124);
				match(T__12);
				setState(125);
				match(T__13);
				setState(126);
				match(T__2);
				setState(127);
				explist();
				setState(128);
				match(T__6);
				}
				break;
			case 7:
				_localctx = new SetScriptContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(130);
				match(T__14);
				setState(131);
				match(T__2);
				setState(132);
				explist();
				setState(133);
				match(T__6);
				}
				break;
			case 8:
				_localctx = new GetObjectContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(135);
				var();
				setState(136);
				match(T__12);
				setState(137);
				match(T__15);
				setState(138);
				match(T__2);
				setState(139);
				explist();
				setState(140);
				match(T__6);
				}
				break;
			case 9:
				_localctx = new GetHandleContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(142);
				var();
				setState(143);
				match(T__12);
				setState(144);
				match(T__16);
				setState(145);
				match(T__2);
				setState(146);
				explist();
				setState(147);
				match(T__6);
				}
				break;
			case 10:
				_localctx = new SetJointContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(149);
				match(T__17);
				setState(150);
				match(T__2);
				setState(151);
				exp(0);
				setState(152);
				match(T__18);
				setState(153);
				exp(0);
				setState(154);
				match(T__6);
				}
				break;
			case 11:
				_localctx = new FirstTimeIfContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(156);
				match(T__1);
				setState(157);
				match(T__19);
				setState(158);
				match(T__20);
				setState(159);
				match(T__7);
				setState(160);
				block();
				setState(161);
				match(T__8);
				}
				break;
			case 12:
				_localctx = new FirstTimeAttribContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(163);
				match(T__20);
				setState(164);
				match(T__12);
				setState(165);
				exp(0);
				}
				break;
			case 13:
				_localctx = new MultiAttribContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(166);
				varlist();
				setState(167);
				match(T__12);
				setState(168);
				explist();
				}
				break;
			case 14:
				_localctx = new FuncCallContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(170);
				functioncall();
				}
				break;
			case 15:
				_localctx = new LabellContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(171);
				label();
				}
				break;
			case 16:
				_localctx = new BreakContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(172);
				match(T__21);
				}
				break;
			case 17:
				_localctx = new GotoContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(173);
				match(T__22);
				setState(174);
				match(NAME);
				}
				break;
			case 18:
				_localctx = new DoContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(175);
				match(T__23);
				setState(176);
				block();
				setState(177);
				match(T__8);
				}
				break;
			case 19:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(179);
				match(T__24);
				setState(180);
				exp(0);
				setState(181);
				match(T__23);
				setState(182);
				block();
				setState(183);
				match(T__8);
				}
				break;
			case 20:
				_localctx = new RepeatContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(185);
				match(T__25);
				setState(186);
				block();
				setState(187);
				match(T__26);
				setState(188);
				exp(0);
				}
				break;
			case 21:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(190);
				match(T__1);
				setState(191);
				exp(0);
				setState(192);
				match(T__7);
				setState(193);
				block();
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__27) {
					{
					{
					setState(194);
					match(T__27);
					setState(195);
					exp(0);
					setState(196);
					match(T__7);
					setState(197);
					block();
					}
					}
					setState(203);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(206);
				_la = _input.LA(1);
				if (_la==T__28) {
					{
					setState(204);
					match(T__28);
					setState(205);
					block();
					}
				}

				setState(208);
				match(T__8);
				}
				break;
			case 22:
				_localctx = new ForContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(210);
				match(T__29);
				setState(211);
				match(NAME);
				setState(212);
				match(T__12);
				setState(213);
				exp(0);
				setState(214);
				match(T__18);
				setState(215);
				exp(0);
				setState(218);
				_la = _input.LA(1);
				if (_la==T__18) {
					{
					setState(216);
					match(T__18);
					setState(217);
					exp(0);
					}
				}

				setState(220);
				match(T__23);
				setState(221);
				block();
				setState(222);
				match(T__8);
				}
				break;
			case 23:
				_localctx = new ForMultiAttribContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(224);
				match(T__29);
				setState(225);
				namelist();
				setState(226);
				match(T__30);
				setState(227);
				explist();
				setState(228);
				match(T__23);
				setState(229);
				block();
				setState(230);
				match(T__8);
				}
				break;
			case 24:
				_localctx = new FuncDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(232);
				match(T__31);
				setState(233);
				funcname();
				setState(234);
				funcbody();
				}
				break;
			case 25:
				_localctx = new LocalFuncDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(236);
				match(T__32);
				setState(237);
				match(T__31);
				setState(238);
				match(NAME);
				setState(239);
				funcbody();
				}
				break;
			case 26:
				_localctx = new LocalAttribContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(240);
				match(T__32);
				setState(241);
				namelist();
				setState(244);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(242);
					match(T__12);
					setState(243);
					explist();
					}
				}

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

	public static class RetstatContext extends ParserRuleContext {
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public RetstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retstat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitRetstat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetstatContext retstat() throws RecognitionException {
		RetstatContext _localctx = new RetstatContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_retstat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(T__33);
			setState(250);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__19) | (1L << T__31) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__43) | (1L << T__54) | (1L << T__61))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__64 - 65)) | (1L << (NAME - 65)) | (1L << (NORMALSTRING - 65)) | (1L << (CHARSTRING - 65)) | (1L << (LONGSTRING - 65)) | (1L << (INT - 65)) | (1L << (HEX - 65)) | (1L << (FLOAT - 65)) | (1L << (HEX_FLOAT - 65)))) != 0)) {
				{
				setState(249);
				explist();
				}
			}

			setState(253);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(252);
				match(T__0);
				}
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

	public static class LabelContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(LuaParser.NAME, 0); }
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(T__34);
			setState(256);
			match(NAME);
			setState(257);
			match(T__34);
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

	public static class FuncnameContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(LuaParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(LuaParser.NAME, i);
		}
		public FuncnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcname; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitFuncname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncnameContext funcname() throws RecognitionException {
		FuncnameContext _localctx = new FuncnameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_funcname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(NAME);
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__35) {
				{
				{
				setState(260);
				match(T__35);
				setState(261);
				match(NAME);
				}
				}
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(269);
			_la = _input.LA(1);
			if (_la==T__36) {
				{
				setState(267);
				match(T__36);
				setState(268);
				match(NAME);
				}
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

	public static class VarlistContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public VarlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varlist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitVarlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarlistContext varlist() throws RecognitionException {
		VarlistContext _localctx = new VarlistContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_varlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			var();
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18) {
				{
				{
				setState(272);
				match(T__18);
				setState(273);
				var();
				}
				}
				setState(278);
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

	public static class NamelistContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(LuaParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(LuaParser.NAME, i);
		}
		public NamelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namelist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitNamelist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamelistContext namelist() throws RecognitionException {
		NamelistContext _localctx = new NamelistContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_namelist);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(NAME);
			setState(284);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(280);
					match(T__18);
					setState(281);
					match(NAME);
					}
					} 
				}
				setState(286);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class ExplistContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ExplistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitExplist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplistContext explist() throws RecognitionException {
		ExplistContext _localctx = new ExplistContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_explist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			exp(0);
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18) {
				{
				{
				setState(288);
				match(T__18);
				setState(289);
				exp(0);
				}
				}
				setState(294);
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

	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BitWiseContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OperatorBitwiseContext operatorBitwise() {
			return getRuleContext(OperatorBitwiseContext.class,0);
		}
		public BitWiseContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitBitWise(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OperatorOrContext operatorOr() {
			return getRuleContext(OperatorOrContext.class,0);
		}
		public OrContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OperatorAddSubContext operatorAddSub() {
			return getRuleContext(OperatorAddSubContext.class,0);
		}
		public AddSubContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueContext extends ExpContext {
		public TrueContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseContext extends ExpContext {
		public FalseContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableConstructorContext extends ExpContext {
		public TableconstructorContext tableconstructor() {
			return getRuleContext(TableconstructorContext.class,0);
		}
		public TableConstructorContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitTableConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NilContext extends ExpContext {
		public NilContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitNil(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberrContext extends ExpContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumberrContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitNumberr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OperatorComparisonContext operatorComparison() {
			return getRuleContext(OperatorComparisonContext.class,0);
		}
		public ComparisonContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncDefContext extends ExpContext {
		public FunctiondefContext functiondef() {
			return getRuleContext(FunctiondefContext.class,0);
		}
		public FuncDefContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitFuncDef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultDivModContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OperatorMulDivModContext operatorMulDivMod() {
			return getRuleContext(OperatorMulDivModContext.class,0);
		}
		public MultDivModContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitMultDivMod(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OperatorAndContext operatorAnd() {
			return getRuleContext(OperatorAndContext.class,0);
		}
		public AndContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrefixExpressionContext extends ExpContext {
		public PrefixexpContext prefixexp() {
			return getRuleContext(PrefixexpContext.class,0);
		}
		public PrefixExpressionContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitPrefixExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringgContext extends ExpContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public StringgContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitStringg(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperatorPowerrContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OperatorPowerContext operatorPower() {
			return getRuleContext(OperatorPowerContext.class,0);
		}
		public OperatorPowerrContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitOperatorPowerr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RetincenceContext extends ExpContext {
		public RetincenceContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitRetincence(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryOperatorContext extends ExpContext {
		public OperatorUnaryContext operatorUnary() {
			return getRuleContext(OperatorUnaryContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public UnaryOperatorContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitUnaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StrCatContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OperatorStrcatContext operatorStrcat() {
			return getRuleContext(OperatorStrcatContext.class,0);
		}
		public StrCatContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitStrCat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			switch (_input.LA(1)) {
			case T__37:
				{
				_localctx = new NilContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(296);
				match(T__37);
				}
				break;
			case T__38:
				{
				_localctx = new FalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(297);
				match(T__38);
				}
				break;
			case T__39:
				{
				_localctx = new TrueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(298);
				match(T__39);
				}
				break;
			case INT:
			case HEX:
			case FLOAT:
			case HEX_FLOAT:
				{
				_localctx = new NumberrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(299);
				number();
				}
				break;
			case NORMALSTRING:
			case CHARSTRING:
			case LONGSTRING:
				{
				_localctx = new StringgContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(300);
				string();
				}
				break;
			case T__40:
				{
				_localctx = new RetincenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(301);
				match(T__40);
				}
				break;
			case T__31:
				{
				_localctx = new FuncDefContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(302);
				functiondef();
				}
				break;
			case T__2:
			case NAME:
				{
				_localctx = new PrefixExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(303);
				prefixexp();
				}
				break;
			case T__43:
				{
				_localctx = new TableConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(304);
				tableconstructor();
				}
				break;
			case T__19:
			case T__54:
			case T__61:
			case T__64:
				{
				_localctx = new UnaryOperatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(305);
				operatorUnary();
				setState(306);
				exp(8);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(344);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(342);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new OperatorPowerrContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(310);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(311);
						operatorPower();
						setState(312);
						exp(9);
						}
						break;
					case 2:
						{
						_localctx = new MultDivModContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(314);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(315);
						operatorMulDivMod();
						setState(316);
						exp(8);
						}
						break;
					case 3:
						{
						_localctx = new AddSubContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(318);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(319);
						operatorAddSub();
						setState(320);
						exp(7);
						}
						break;
					case 4:
						{
						_localctx = new StrCatContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(322);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(323);
						operatorStrcat();
						setState(324);
						exp(5);
						}
						break;
					case 5:
						{
						_localctx = new ComparisonContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(326);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(327);
						operatorComparison();
						setState(328);
						exp(5);
						}
						break;
					case 6:
						{
						_localctx = new AndContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(330);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(331);
						operatorAnd();
						setState(332);
						exp(4);
						}
						break;
					case 7:
						{
						_localctx = new OrContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(334);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(335);
						operatorOr();
						setState(336);
						exp(3);
						}
						break;
					case 8:
						{
						_localctx = new BitWiseContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(338);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(339);
						operatorBitwise();
						setState(340);
						exp(2);
						}
						break;
					}
					} 
				}
				setState(346);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class PrefixexpContext extends ParserRuleContext {
		public VarOrExpContext varOrExp() {
			return getRuleContext(VarOrExpContext.class,0);
		}
		public List<NameAndArgsContext> nameAndArgs() {
			return getRuleContexts(NameAndArgsContext.class);
		}
		public NameAndArgsContext nameAndArgs(int i) {
			return getRuleContext(NameAndArgsContext.class,i);
		}
		public PrefixexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixexp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitPrefixexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixexpContext prefixexp() throws RecognitionException {
		PrefixexpContext _localctx = new PrefixexpContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_prefixexp);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			varOrExp();
			setState(351);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(348);
					nameAndArgs();
					}
					} 
				}
				setState(353);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class FunctioncallContext extends ParserRuleContext {
		public VarOrExpContext varOrExp() {
			return getRuleContext(VarOrExpContext.class,0);
		}
		public List<NameAndArgsContext> nameAndArgs() {
			return getRuleContexts(NameAndArgsContext.class);
		}
		public NameAndArgsContext nameAndArgs(int i) {
			return getRuleContext(NameAndArgsContext.class,i);
		}
		public FunctioncallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functioncall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitFunctioncall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctioncallContext functioncall() throws RecognitionException {
		FunctioncallContext _localctx = new FunctioncallContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_functioncall);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			varOrExp();
			setState(356); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(355);
					nameAndArgs();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(358); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class VarOrExpContext extends ParserRuleContext {
		public VarOrExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varOrExp; }
	 
		public VarOrExpContext() { }
		public void copyFrom(VarOrExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarrContext extends VarOrExpContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public VarrContext(VarOrExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitVarr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExpContext extends VarOrExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ParenExpContext(VarOrExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitParenExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarOrExpContext varOrExp() throws RecognitionException {
		VarOrExpContext _localctx = new VarOrExpContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_varOrExp);
		try {
			setState(365);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new VarrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(360);
				var();
				}
				break;
			case 2:
				_localctx = new ParenExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(361);
				match(T__2);
				setState(362);
				exp(0);
				setState(363);
				match(T__6);
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(LuaParser.NAME, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<VarSuffixContext> varSuffix() {
			return getRuleContexts(VarSuffixContext.class);
		}
		public VarSuffixContext varSuffix(int i) {
			return getRuleContext(VarSuffixContext.class,i);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_var);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			switch (_input.LA(1)) {
			case NAME:
				{
				setState(367);
				match(NAME);
				}
				break;
			case T__2:
				{
				setState(368);
				match(T__2);
				setState(369);
				exp(0);
				setState(370);
				match(T__6);
				setState(371);
				varSuffix();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(378);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(375);
					varSuffix();
					}
					} 
				}
				setState(380);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class VarSuffixContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode NAME() { return getToken(LuaParser.NAME, 0); }
		public List<NameAndArgsContext> nameAndArgs() {
			return getRuleContexts(NameAndArgsContext.class);
		}
		public NameAndArgsContext nameAndArgs(int i) {
			return getRuleContext(NameAndArgsContext.class,i);
		}
		public VarSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varSuffix; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitVarSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarSuffixContext varSuffix() throws RecognitionException {
		VarSuffixContext _localctx = new VarSuffixContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_varSuffix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__36) | (1L << T__43))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (NORMALSTRING - 68)) | (1L << (CHARSTRING - 68)) | (1L << (LONGSTRING - 68)))) != 0)) {
				{
				{
				setState(381);
				nameAndArgs();
				}
				}
				setState(386);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(393);
			switch (_input.LA(1)) {
			case T__41:
				{
				setState(387);
				match(T__41);
				setState(388);
				exp(0);
				setState(389);
				match(T__42);
				}
				break;
			case T__35:
				{
				setState(391);
				match(T__35);
				setState(392);
				match(NAME);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class NameAndArgsContext extends ParserRuleContext {
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode NAME() { return getToken(LuaParser.NAME, 0); }
		public NameAndArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameAndArgs; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitNameAndArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameAndArgsContext nameAndArgs() throws RecognitionException {
		NameAndArgsContext _localctx = new NameAndArgsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_nameAndArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			_la = _input.LA(1);
			if (_la==T__36) {
				{
				setState(395);
				match(T__36);
				setState(396);
				match(NAME);
				}
			}

			setState(399);
			args();
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

	public static class ArgsContext extends ParserRuleContext {
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public TableconstructorContext tableconstructor() {
			return getRuleContext(TableconstructorContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_args);
		int _la;
		try {
			setState(408);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(401);
				match(T__2);
				setState(403);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__19) | (1L << T__31) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__43) | (1L << T__54) | (1L << T__61))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__64 - 65)) | (1L << (NAME - 65)) | (1L << (NORMALSTRING - 65)) | (1L << (CHARSTRING - 65)) | (1L << (LONGSTRING - 65)) | (1L << (INT - 65)) | (1L << (HEX - 65)) | (1L << (FLOAT - 65)) | (1L << (HEX_FLOAT - 65)))) != 0)) {
					{
					setState(402);
					explist();
					}
				}

				setState(405);
				match(T__6);
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 2);
				{
				setState(406);
				tableconstructor();
				}
				break;
			case NORMALSTRING:
			case CHARSTRING:
			case LONGSTRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(407);
				string();
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

	public static class FunctiondefContext extends ParserRuleContext {
		public FuncbodyContext funcbody() {
			return getRuleContext(FuncbodyContext.class,0);
		}
		public FunctiondefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functiondef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitFunctiondef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctiondefContext functiondef() throws RecognitionException {
		FunctiondefContext _localctx = new FunctiondefContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_functiondef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			match(T__31);
			setState(411);
			funcbody();
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

	public static class FuncbodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParlistContext parlist() {
			return getRuleContext(ParlistContext.class,0);
		}
		public FuncbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcbody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitFuncbody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncbodyContext funcbody() throws RecognitionException {
		FuncbodyContext _localctx = new FuncbodyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_funcbody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			match(T__2);
			setState(415);
			_la = _input.LA(1);
			if (_la==T__40 || _la==NAME) {
				{
				setState(414);
				parlist();
				}
			}

			setState(417);
			match(T__6);
			setState(418);
			block();
			setState(419);
			match(T__8);
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

	public static class ParlistContext extends ParserRuleContext {
		public NamelistContext namelist() {
			return getRuleContext(NamelistContext.class,0);
		}
		public ParlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parlist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitParlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParlistContext parlist() throws RecognitionException {
		ParlistContext _localctx = new ParlistContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_parlist);
		int _la;
		try {
			setState(427);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(421);
				namelist();
				setState(424);
				_la = _input.LA(1);
				if (_la==T__18) {
					{
					setState(422);
					match(T__18);
					setState(423);
					match(T__40);
					}
				}

				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 2);
				{
				setState(426);
				match(T__40);
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

	public static class TableconstructorContext extends ParserRuleContext {
		public FieldlistContext fieldlist() {
			return getRuleContext(FieldlistContext.class,0);
		}
		public TableconstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableconstructor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitTableconstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableconstructorContext tableconstructor() throws RecognitionException {
		TableconstructorContext _localctx = new TableconstructorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_tableconstructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(T__43);
			setState(431);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__19) | (1L << T__31) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__43) | (1L << T__54) | (1L << T__61))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__64 - 65)) | (1L << (NAME - 65)) | (1L << (NORMALSTRING - 65)) | (1L << (CHARSTRING - 65)) | (1L << (LONGSTRING - 65)) | (1L << (INT - 65)) | (1L << (HEX - 65)) | (1L << (FLOAT - 65)) | (1L << (HEX_FLOAT - 65)))) != 0)) {
				{
				setState(430);
				fieldlist();
				}
			}

			setState(433);
			match(T__44);
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

	public static class FieldlistContext extends ParserRuleContext {
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public List<FieldsepContext> fieldsep() {
			return getRuleContexts(FieldsepContext.class);
		}
		public FieldsepContext fieldsep(int i) {
			return getRuleContext(FieldsepContext.class,i);
		}
		public FieldlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldlist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitFieldlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldlistContext fieldlist() throws RecognitionException {
		FieldlistContext _localctx = new FieldlistContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_fieldlist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			field();
			setState(441);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(436);
					fieldsep();
					setState(437);
					field();
					}
					} 
				}
				setState(443);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(445);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__18) {
				{
				setState(444);
				fieldsep();
				}
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

	public static class FieldContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode NAME() { return getToken(LuaParser.NAME, 0); }
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_field);
		try {
			setState(457);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(447);
				match(T__41);
				setState(448);
				exp(0);
				setState(449);
				match(T__42);
				setState(450);
				match(T__12);
				setState(451);
				exp(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(453);
				match(NAME);
				setState(454);
				match(T__12);
				setState(455);
				exp(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(456);
				exp(0);
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

	public static class FieldsepContext extends ParserRuleContext {
		public FieldsepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldsep; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitFieldsep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldsepContext fieldsep() throws RecognitionException {
		FieldsepContext _localctx = new FieldsepContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_fieldsep);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__18) ) {
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

	public static class OperatorOrContext extends ParserRuleContext {
		public OperatorOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorOr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitOperatorOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorOrContext operatorOr() throws RecognitionException {
		OperatorOrContext _localctx = new OperatorOrContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_operatorOr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			match(T__45);
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

	public static class OperatorAndContext extends ParserRuleContext {
		public OperatorAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorAnd; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitOperatorAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorAndContext operatorAnd() throws RecognitionException {
		OperatorAndContext _localctx = new OperatorAndContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_operatorAnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			match(T__46);
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

	public static class OperatorComparisonContext extends ParserRuleContext {
		public OperatorComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorComparison; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitOperatorComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorComparisonContext operatorComparison() throws RecognitionException {
		OperatorComparisonContext _localctx = new OperatorComparisonContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_operatorComparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51))) != 0)) ) {
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

	public static class OperatorStrcatContext extends ParserRuleContext {
		public OperatorStrcatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorStrcat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitOperatorStrcat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorStrcatContext operatorStrcat() throws RecognitionException {
		OperatorStrcatContext _localctx = new OperatorStrcatContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_operatorStrcat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			match(T__52);
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

	public static class OperatorAddSubContext extends ParserRuleContext {
		public OperatorAddSubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorAddSub; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitOperatorAddSub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorAddSubContext operatorAddSub() throws RecognitionException {
		OperatorAddSubContext _localctx = new OperatorAddSubContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_operatorAddSub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			_la = _input.LA(1);
			if ( !(_la==T__53 || _la==T__54) ) {
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

	public static class OperatorMulDivModContext extends ParserRuleContext {
		public OperatorMulDivModContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorMulDivMod; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitOperatorMulDivMod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorMulDivModContext operatorMulDivMod() throws RecognitionException {
		OperatorMulDivModContext _localctx = new OperatorMulDivModContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_operatorMulDivMod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58))) != 0)) ) {
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

	public static class OperatorBitwiseContext extends ParserRuleContext {
		public OperatorBitwiseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorBitwise; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitOperatorBitwise(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorBitwiseContext operatorBitwise() throws RecognitionException {
		OperatorBitwiseContext _localctx = new OperatorBitwiseContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_operatorBitwise);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			_la = _input.LA(1);
			if ( !(((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (T__59 - 60)) | (1L << (T__60 - 60)) | (1L << (T__61 - 60)) | (1L << (T__62 - 60)) | (1L << (T__63 - 60)))) != 0)) ) {
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

	public static class OperatorUnaryContext extends ParserRuleContext {
		public OperatorUnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorUnary; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitOperatorUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorUnaryContext operatorUnary() throws RecognitionException {
		OperatorUnaryContext _localctx = new OperatorUnaryContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_operatorUnary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			_la = _input.LA(1);
			if ( !(((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (T__19 - 20)) | (1L << (T__54 - 20)) | (1L << (T__61 - 20)) | (1L << (T__64 - 20)))) != 0)) ) {
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

	public static class OperatorPowerContext extends ParserRuleContext {
		public OperatorPowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorPower; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitOperatorPower(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorPowerContext operatorPower() throws RecognitionException {
		OperatorPowerContext _localctx = new OperatorPowerContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_operatorPower);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			match(T__65);
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(LuaParser.INT, 0); }
		public TerminalNode HEX() { return getToken(LuaParser.HEX, 0); }
		public TerminalNode FLOAT() { return getToken(LuaParser.FLOAT, 0); }
		public TerminalNode HEX_FLOAT() { return getToken(LuaParser.HEX_FLOAT, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			_la = _input.LA(1);
			if ( !(((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (INT - 71)) | (1L << (HEX - 71)) | (1L << (FLOAT - 71)) | (1L << (HEX_FLOAT - 71)))) != 0)) ) {
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode NORMALSTRING() { return getToken(LuaParser.NORMALSTRING, 0); }
		public TerminalNode CHARSTRING() { return getToken(LuaParser.CHARSTRING, 0); }
		public TerminalNode LONGSTRING() { return getToken(LuaParser.LONGSTRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			_la = _input.LA(1);
			if ( !(((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (NORMALSTRING - 68)) | (1L << (CHARSTRING - 68)) | (1L << (LONGSTRING - 68)))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3P\u01e6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\3\3\7\3M\n\3\f\3\16\3P\13\3\3\3\5"+
		"\3S\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u00ca\n\4"+
		"\f\4\16\4\u00cd\13\4\3\4\3\4\5\4\u00d1\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\5\4\u00dd\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00f7\n\4\5\4"+
		"\u00f9\n\4\3\5\3\5\5\5\u00fd\n\5\3\5\5\5\u0100\n\5\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\7\7\u0109\n\7\f\7\16\7\u010c\13\7\3\7\3\7\5\7\u0110\n\7\3\b\3"+
		"\b\3\b\7\b\u0115\n\b\f\b\16\b\u0118\13\b\3\t\3\t\3\t\7\t\u011d\n\t\f\t"+
		"\16\t\u0120\13\t\3\n\3\n\3\n\7\n\u0125\n\n\f\n\16\n\u0128\13\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0137"+
		"\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\7\13\u0159\n\13\f\13\16\13\u015c\13\13\3\f\3"+
		"\f\7\f\u0160\n\f\f\f\16\f\u0163\13\f\3\r\3\r\6\r\u0167\n\r\r\r\16\r\u0168"+
		"\3\16\3\16\3\16\3\16\3\16\5\16\u0170\n\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u0178\n\17\3\17\7\17\u017b\n\17\f\17\16\17\u017e\13\17\3\20\7\20"+
		"\u0181\n\20\f\20\16\20\u0184\13\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u018c\n\20\3\21\3\21\5\21\u0190\n\21\3\21\3\21\3\22\3\22\5\22\u0196\n"+
		"\22\3\22\3\22\3\22\5\22\u019b\n\22\3\23\3\23\3\23\3\24\3\24\5\24\u01a2"+
		"\n\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\5\25\u01ab\n\25\3\25\5\25\u01ae"+
		"\n\25\3\26\3\26\5\26\u01b2\n\26\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u01ba"+
		"\n\27\f\27\16\27\u01bd\13\27\3\27\5\27\u01c0\n\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u01cc\n\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3"+
		"#\3$\3$\3$\2\3\24%\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDF\2\n\4\2\3\3\25\25\4\2\7\7\62\66\3\289\3\2:=\3\2>B\6"+
		"\2\26\2699@@CC\3\2IL\3\2FH\u020c\2H\3\2\2\2\4N\3\2\2\2\6\u00f8\3\2\2\2"+
		"\b\u00fa\3\2\2\2\n\u0101\3\2\2\2\f\u0105\3\2\2\2\16\u0111\3\2\2\2\20\u0119"+
		"\3\2\2\2\22\u0121\3\2\2\2\24\u0136\3\2\2\2\26\u015d\3\2\2\2\30\u0164\3"+
		"\2\2\2\32\u016f\3\2\2\2\34\u0177\3\2\2\2\36\u0182\3\2\2\2 \u018f\3\2\2"+
		"\2\"\u019a\3\2\2\2$\u019c\3\2\2\2&\u019f\3\2\2\2(\u01ad\3\2\2\2*\u01af"+
		"\3\2\2\2,\u01b5\3\2\2\2.\u01cb\3\2\2\2\60\u01cd\3\2\2\2\62\u01cf\3\2\2"+
		"\2\64\u01d1\3\2\2\2\66\u01d3\3\2\2\28\u01d5\3\2\2\2:\u01d7\3\2\2\2<\u01d9"+
		"\3\2\2\2>\u01db\3\2\2\2@\u01dd\3\2\2\2B\u01df\3\2\2\2D\u01e1\3\2\2\2F"+
		"\u01e3\3\2\2\2HI\5\4\3\2IJ\7\2\2\3J\3\3\2\2\2KM\5\6\4\2LK\3\2\2\2MP\3"+
		"\2\2\2NL\3\2\2\2NO\3\2\2\2OR\3\2\2\2PN\3\2\2\2QS\5\b\5\2RQ\3\2\2\2RS\3"+
		"\2\2\2S\5\3\2\2\2T\u00f9\7\3\2\2UV\7\4\2\2VW\7\5\2\2WX\7\6\2\2XY\7\7\2"+
		"\2YZ\7\b\2\2Z[\7\t\2\2[\\\7\n\2\2\\]\5\4\3\2]^\7\13\2\2^\u00f9\3\2\2\2"+
		"_`\7\4\2\2`a\7\5\2\2ab\7\6\2\2bc\7\7\2\2cd\7\f\2\2de\7\t\2\2ef\7\n\2\2"+
		"fg\5\4\3\2gh\7\13\2\2h\u00f9\3\2\2\2ij\7\4\2\2jk\7\5\2\2kl\7\6\2\2lm\7"+
		"\7\2\2mn\7\r\2\2no\7\t\2\2op\7\n\2\2pq\5\4\3\2qr\7\13\2\2r\u00f9\3\2\2"+
		"\2st\7\4\2\2tu\7\5\2\2uv\7\6\2\2vw\7\7\2\2wx\7\16\2\2xy\7\t\2\2yz\7\n"+
		"\2\2z{\5\4\3\2{|\7\13\2\2|\u00f9\3\2\2\2}~\5\34\17\2~\177\7\17\2\2\177"+
		"\u0080\7\20\2\2\u0080\u0081\7\5\2\2\u0081\u0082\5\22\n\2\u0082\u0083\7"+
		"\t\2\2\u0083\u00f9\3\2\2\2\u0084\u0085\7\21\2\2\u0085\u0086\7\5\2\2\u0086"+
		"\u0087\5\22\n\2\u0087\u0088\7\t\2\2\u0088\u00f9\3\2\2\2\u0089\u008a\5"+
		"\34\17\2\u008a\u008b\7\17\2\2\u008b\u008c\7\22\2\2\u008c\u008d\7\5\2\2"+
		"\u008d\u008e\5\22\n\2\u008e\u008f\7\t\2\2\u008f\u00f9\3\2\2\2\u0090\u0091"+
		"\5\34\17\2\u0091\u0092\7\17\2\2\u0092\u0093\7\23\2\2\u0093\u0094\7\5\2"+
		"\2\u0094\u0095\5\22\n\2\u0095\u0096\7\t\2\2\u0096\u00f9\3\2\2\2\u0097"+
		"\u0098\7\24\2\2\u0098\u0099\7\5\2\2\u0099\u009a\5\24\13\2\u009a\u009b"+
		"\7\25\2\2\u009b\u009c\5\24\13\2\u009c\u009d\7\t\2\2\u009d\u00f9\3\2\2"+
		"\2\u009e\u009f\7\4\2\2\u009f\u00a0\7\26\2\2\u00a0\u00a1\7\27\2\2\u00a1"+
		"\u00a2\7\n\2\2\u00a2\u00a3\5\4\3\2\u00a3\u00a4\7\13\2\2\u00a4\u00f9\3"+
		"\2\2\2\u00a5\u00a6\7\27\2\2\u00a6\u00a7\7\17\2\2\u00a7\u00f9\5\24\13\2"+
		"\u00a8\u00a9\5\16\b\2\u00a9\u00aa\7\17\2\2\u00aa\u00ab\5\22\n\2\u00ab"+
		"\u00f9\3\2\2\2\u00ac\u00f9\5\30\r\2\u00ad\u00f9\5\n\6\2\u00ae\u00f9\7"+
		"\30\2\2\u00af\u00b0\7\31\2\2\u00b0\u00f9\7E\2\2\u00b1\u00b2\7\32\2\2\u00b2"+
		"\u00b3\5\4\3\2\u00b3\u00b4\7\13\2\2\u00b4\u00f9\3\2\2\2\u00b5\u00b6\7"+
		"\33\2\2\u00b6\u00b7\5\24\13\2\u00b7\u00b8\7\32\2\2\u00b8\u00b9\5\4\3\2"+
		"\u00b9\u00ba\7\13\2\2\u00ba\u00f9\3\2\2\2\u00bb\u00bc\7\34\2\2\u00bc\u00bd"+
		"\5\4\3\2\u00bd\u00be\7\35\2\2\u00be\u00bf\5\24\13\2\u00bf\u00f9\3\2\2"+
		"\2\u00c0\u00c1\7\4\2\2\u00c1\u00c2\5\24\13\2\u00c2\u00c3\7\n\2\2\u00c3"+
		"\u00cb\5\4\3\2\u00c4\u00c5\7\36\2\2\u00c5\u00c6\5\24\13\2\u00c6\u00c7"+
		"\7\n\2\2\u00c7\u00c8\5\4\3\2\u00c8\u00ca\3\2\2\2\u00c9\u00c4\3\2\2\2\u00ca"+
		"\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00d0\3\2"+
		"\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00cf\7\37\2\2\u00cf\u00d1\5\4\3\2\u00d0"+
		"\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\7\13"+
		"\2\2\u00d3\u00f9\3\2\2\2\u00d4\u00d5\7 \2\2\u00d5\u00d6\7E\2\2\u00d6\u00d7"+
		"\7\17\2\2\u00d7\u00d8\5\24\13\2\u00d8\u00d9\7\25\2\2\u00d9\u00dc\5\24"+
		"\13\2\u00da\u00db\7\25\2\2\u00db\u00dd\5\24\13\2\u00dc\u00da\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\7\32\2\2\u00df\u00e0\5"+
		"\4\3\2\u00e0\u00e1\7\13\2\2\u00e1\u00f9\3\2\2\2\u00e2\u00e3\7 \2\2\u00e3"+
		"\u00e4\5\20\t\2\u00e4\u00e5\7!\2\2\u00e5\u00e6\5\22\n\2\u00e6\u00e7\7"+
		"\32\2\2\u00e7\u00e8\5\4\3\2\u00e8\u00e9\7\13\2\2\u00e9\u00f9\3\2\2\2\u00ea"+
		"\u00eb\7\"\2\2\u00eb\u00ec\5\f\7\2\u00ec\u00ed\5&\24\2\u00ed\u00f9\3\2"+
		"\2\2\u00ee\u00ef\7#\2\2\u00ef\u00f0\7\"\2\2\u00f0\u00f1\7E\2\2\u00f1\u00f9"+
		"\5&\24\2\u00f2\u00f3\7#\2\2\u00f3\u00f6\5\20\t\2\u00f4\u00f5\7\17\2\2"+
		"\u00f5\u00f7\5\22\n\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f9"+
		"\3\2\2\2\u00f8T\3\2\2\2\u00f8U\3\2\2\2\u00f8_\3\2\2\2\u00f8i\3\2\2\2\u00f8"+
		"s\3\2\2\2\u00f8}\3\2\2\2\u00f8\u0084\3\2\2\2\u00f8\u0089\3\2\2\2\u00f8"+
		"\u0090\3\2\2\2\u00f8\u0097\3\2\2\2\u00f8\u009e\3\2\2\2\u00f8\u00a5\3\2"+
		"\2\2\u00f8\u00a8\3\2\2\2\u00f8\u00ac\3\2\2\2\u00f8\u00ad\3\2\2\2\u00f8"+
		"\u00ae\3\2\2\2\u00f8\u00af\3\2\2\2\u00f8\u00b1\3\2\2\2\u00f8\u00b5\3\2"+
		"\2\2\u00f8\u00bb\3\2\2\2\u00f8\u00c0\3\2\2\2\u00f8\u00d4\3\2\2\2\u00f8"+
		"\u00e2\3\2\2\2\u00f8\u00ea\3\2\2\2\u00f8\u00ee\3\2\2\2\u00f8\u00f2\3\2"+
		"\2\2\u00f9\7\3\2\2\2\u00fa\u00fc\7$\2\2\u00fb\u00fd\5\22\n\2\u00fc\u00fb"+
		"\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00ff\3\2\2\2\u00fe\u0100\7\3\2\2\u00ff"+
		"\u00fe\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\t\3\2\2\2\u0101\u0102\7%\2\2"+
		"\u0102\u0103\7E\2\2\u0103\u0104\7%\2\2\u0104\13\3\2\2\2\u0105\u010a\7"+
		"E\2\2\u0106\u0107\7&\2\2\u0107\u0109\7E\2\2\u0108\u0106\3\2\2\2\u0109"+
		"\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010f\3\2"+
		"\2\2\u010c\u010a\3\2\2\2\u010d\u010e\7\'\2\2\u010e\u0110\7E\2\2\u010f"+
		"\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\r\3\2\2\2\u0111\u0116\5\34\17"+
		"\2\u0112\u0113\7\25\2\2\u0113\u0115\5\34\17\2\u0114\u0112\3\2\2\2\u0115"+
		"\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\17\3\2\2"+
		"\2\u0118\u0116\3\2\2\2\u0119\u011e\7E\2\2\u011a\u011b\7\25\2\2\u011b\u011d"+
		"\7E\2\2\u011c\u011a\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e"+
		"\u011f\3\2\2\2\u011f\21\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0126\5\24\13"+
		"\2\u0122\u0123\7\25\2\2\u0123\u0125\5\24\13\2\u0124\u0122\3\2\2\2\u0125"+
		"\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\23\3\2\2"+
		"\2\u0128\u0126\3\2\2\2\u0129\u012a\b\13\1\2\u012a\u0137\7(\2\2\u012b\u0137"+
		"\7)\2\2\u012c\u0137\7*\2\2\u012d\u0137\5D#\2\u012e\u0137\5F$\2\u012f\u0137"+
		"\7+\2\2\u0130\u0137\5$\23\2\u0131\u0137\5\26\f\2\u0132\u0137\5*\26\2\u0133"+
		"\u0134\5@!\2\u0134\u0135\5\24\13\n\u0135\u0137\3\2\2\2\u0136\u0129\3\2"+
		"\2\2\u0136\u012b\3\2\2\2\u0136\u012c\3\2\2\2\u0136\u012d\3\2\2\2\u0136"+
		"\u012e\3\2\2\2\u0136\u012f\3\2\2\2\u0136\u0130\3\2\2\2\u0136\u0131\3\2"+
		"\2\2\u0136\u0132\3\2\2\2\u0136\u0133\3\2\2\2\u0137\u015a\3\2\2\2\u0138"+
		"\u0139\f\13\2\2\u0139\u013a\5B\"\2\u013a\u013b\5\24\13\13\u013b\u0159"+
		"\3\2\2\2\u013c\u013d\f\t\2\2\u013d\u013e\5<\37\2\u013e\u013f\5\24\13\n"+
		"\u013f\u0159\3\2\2\2\u0140\u0141\f\b\2\2\u0141\u0142\5:\36\2\u0142\u0143"+
		"\5\24\13\t\u0143\u0159\3\2\2\2\u0144\u0145\f\7\2\2\u0145\u0146\58\35\2"+
		"\u0146\u0147\5\24\13\7\u0147\u0159\3\2\2\2\u0148\u0149\f\6\2\2\u0149\u014a"+
		"\5\66\34\2\u014a\u014b\5\24\13\7\u014b\u0159\3\2\2\2\u014c\u014d\f\5\2"+
		"\2\u014d\u014e\5\64\33\2\u014e\u014f\5\24\13\6\u014f\u0159\3\2\2\2\u0150"+
		"\u0151\f\4\2\2\u0151\u0152\5\62\32\2\u0152\u0153\5\24\13\5\u0153\u0159"+
		"\3\2\2\2\u0154\u0155\f\3\2\2\u0155\u0156\5> \2\u0156\u0157\5\24\13\4\u0157"+
		"\u0159\3\2\2\2\u0158\u0138\3\2\2\2\u0158\u013c\3\2\2\2\u0158\u0140\3\2"+
		"\2\2\u0158\u0144\3\2\2\2\u0158\u0148\3\2\2\2\u0158\u014c\3\2\2\2\u0158"+
		"\u0150\3\2\2\2\u0158\u0154\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u0158\3\2"+
		"\2\2\u015a\u015b\3\2\2\2\u015b\25\3\2\2\2\u015c\u015a\3\2\2\2\u015d\u0161"+
		"\5\32\16\2\u015e\u0160\5 \21\2\u015f\u015e\3\2\2\2\u0160\u0163\3\2\2\2"+
		"\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\27\3\2\2\2\u0163\u0161"+
		"\3\2\2\2\u0164\u0166\5\32\16\2\u0165\u0167\5 \21\2\u0166\u0165\3\2\2\2"+
		"\u0167\u0168\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\31"+
		"\3\2\2\2\u016a\u0170\5\34\17\2\u016b\u016c\7\5\2\2\u016c\u016d\5\24\13"+
		"\2\u016d\u016e\7\t\2\2\u016e\u0170\3\2\2\2\u016f\u016a\3\2\2\2\u016f\u016b"+
		"\3\2\2\2\u0170\33\3\2\2\2\u0171\u0178\7E\2\2\u0172\u0173\7\5\2\2\u0173"+
		"\u0174\5\24\13\2\u0174\u0175\7\t\2\2\u0175\u0176\5\36\20\2\u0176\u0178"+
		"\3\2\2\2\u0177\u0171\3\2\2\2\u0177\u0172\3\2\2\2\u0178\u017c\3\2\2\2\u0179"+
		"\u017b\5\36\20\2\u017a\u0179\3\2\2\2\u017b\u017e\3\2\2\2\u017c\u017a\3"+
		"\2\2\2\u017c\u017d\3\2\2\2\u017d\35\3\2\2\2\u017e\u017c\3\2\2\2\u017f"+
		"\u0181\5 \21\2\u0180\u017f\3\2\2\2\u0181\u0184\3\2\2\2\u0182\u0180\3\2"+
		"\2\2\u0182\u0183\3\2\2\2\u0183\u018b\3\2\2\2\u0184\u0182\3\2\2\2\u0185"+
		"\u0186\7,\2\2\u0186\u0187\5\24\13\2\u0187\u0188\7-\2\2\u0188\u018c\3\2"+
		"\2\2\u0189\u018a\7&\2\2\u018a\u018c\7E\2\2\u018b\u0185\3\2\2\2\u018b\u0189"+
		"\3\2\2\2\u018c\37\3\2\2\2\u018d\u018e\7\'\2\2\u018e\u0190\7E\2\2\u018f"+
		"\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192\5\""+
		"\22\2\u0192!\3\2\2\2\u0193\u0195\7\5\2\2\u0194\u0196\5\22\n\2\u0195\u0194"+
		"\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u019b\7\t\2\2\u0198"+
		"\u019b\5*\26\2\u0199\u019b\5F$\2\u019a\u0193\3\2\2\2\u019a\u0198\3\2\2"+
		"\2\u019a\u0199\3\2\2\2\u019b#\3\2\2\2\u019c\u019d\7\"\2\2\u019d\u019e"+
		"\5&\24\2\u019e%\3\2\2\2\u019f\u01a1\7\5\2\2\u01a0\u01a2\5(\25\2\u01a1"+
		"\u01a0\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\7\t"+
		"\2\2\u01a4\u01a5\5\4\3\2\u01a5\u01a6\7\13\2\2\u01a6\'\3\2\2\2\u01a7\u01aa"+
		"\5\20\t\2\u01a8\u01a9\7\25\2\2\u01a9\u01ab\7+\2\2\u01aa\u01a8\3\2\2\2"+
		"\u01aa\u01ab\3\2\2\2\u01ab\u01ae\3\2\2\2\u01ac\u01ae\7+\2\2\u01ad\u01a7"+
		"\3\2\2\2\u01ad\u01ac\3\2\2\2\u01ae)\3\2\2\2\u01af\u01b1\7.\2\2\u01b0\u01b2"+
		"\5,\27\2\u01b1\u01b0\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3"+
		"\u01b4\7/\2\2\u01b4+\3\2\2\2\u01b5\u01bb\5.\30\2\u01b6\u01b7\5\60\31\2"+
		"\u01b7\u01b8\5.\30\2\u01b8\u01ba\3\2\2\2\u01b9\u01b6\3\2\2\2\u01ba\u01bd"+
		"\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bf\3\2\2\2\u01bd"+
		"\u01bb\3\2\2\2\u01be\u01c0\5\60\31\2\u01bf\u01be\3\2\2\2\u01bf\u01c0\3"+
		"\2\2\2\u01c0-\3\2\2\2\u01c1\u01c2\7,\2\2\u01c2\u01c3\5\24\13\2\u01c3\u01c4"+
		"\7-\2\2\u01c4\u01c5\7\17\2\2\u01c5\u01c6\5\24\13\2\u01c6\u01cc\3\2\2\2"+
		"\u01c7\u01c8\7E\2\2\u01c8\u01c9\7\17\2\2\u01c9\u01cc\5\24\13\2\u01ca\u01cc"+
		"\5\24\13\2\u01cb\u01c1\3\2\2\2\u01cb\u01c7\3\2\2\2\u01cb\u01ca\3\2\2\2"+
		"\u01cc/\3\2\2\2\u01cd\u01ce\t\2\2\2\u01ce\61\3\2\2\2\u01cf\u01d0\7\60"+
		"\2\2\u01d0\63\3\2\2\2\u01d1\u01d2\7\61\2\2\u01d2\65\3\2\2\2\u01d3\u01d4"+
		"\t\3\2\2\u01d4\67\3\2\2\2\u01d5\u01d6\7\67\2\2\u01d69\3\2\2\2\u01d7\u01d8"+
		"\t\4\2\2\u01d8;\3\2\2\2\u01d9\u01da\t\5\2\2\u01da=\3\2\2\2\u01db\u01dc"+
		"\t\6\2\2\u01dc?\3\2\2\2\u01dd\u01de\t\7\2\2\u01deA\3\2\2\2\u01df\u01e0"+
		"\7D\2\2\u01e0C\3\2\2\2\u01e1\u01e2\t\b\2\2\u01e2E\3\2\2\2\u01e3\u01e4"+
		"\t\t\2\2\u01e4G\3\2\2\2$NR\u00cb\u00d0\u00dc\u00f6\u00f8\u00fc\u00ff\u010a"+
		"\u010f\u0116\u011e\u0126\u0136\u0158\u015a\u0161\u0168\u016f\u0177\u017c"+
		"\u0182\u018b\u018f\u0195\u019a\u01a1\u01aa\u01ad\u01b1\u01bb\u01bf\u01cb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}