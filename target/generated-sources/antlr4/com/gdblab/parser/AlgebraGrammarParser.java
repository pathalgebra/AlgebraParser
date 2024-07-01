// Generated from com\gdblab\parser\AlgebraGrammar.g4 by ANTLR 4.7.1
package com.gdblab.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AlgebraGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

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
		T__52=53, T__53=54, LETTER=55, DIGIT=56, SIGN=57, SYMBOL=58, WS=59;
	public static final int
		RULE_pathQuery = 0, RULE_projection = 1, RULE_partProj = 2, RULE_groupProj = 3, 
		RULE_pathProj = 4, RULE_restrictor_ext = 5, RULE_orderby = 6, RULE_groupby = 7, 
		RULE_orderbyoption = 8, RULE_groupbyoption = 9, RULE_pathPattern = 10, 
		RULE_nodePattern = 11, RULE_edgePattern = 12, RULE_rpq = 13, RULE_rpqrestrictor = 14, 
		RULE_var = 15, RULE_pathName = 16, RULE_attribute = 17, RULE_complexCondition = 18, 
		RULE_condition = 19, RULE_compareSym = 20, RULE_function = 21, RULE_boolOp = 22, 
		RULE_text = 23, RULE_label = 24, RULE_number = 25;
	public static final String[] ruleNames = {
		"pathQuery", "projection", "partProj", "groupProj", "pathProj", "restrictor_ext", 
		"orderby", "groupby", "orderbyoption", "groupbyoption", "pathPattern", 
		"nodePattern", "edgePattern", "rpq", "rpqrestrictor", "var", "pathName", 
		"attribute", "complexCondition", "condition", "compareSym", "function", 
		"boolOp", "text", "label", "number"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'MATCH'", "'ALL'", "'PARTITIONS'", "'GROUPS'", "'PATHS'", "'WALK'", 
		"'TRAIL'", "'SIMPLE'", "'ACYCLIC'", "'SHORTEST'", "'ORDER BY'", "'GROUP BY'", 
		"'PARTITION'", "'GROUP'", "'PATH'", "'PARTITION GROUP'", "'PARTITION PATH'", 
		"'GROUP PATH'", "'PARTITION GROUP PATH'", "'SOURCE'", "'TARGET'", "'LENGTH'", 
		"'SOURCE TARGET'", "'SOURCE LENGTH'", "'TARGET LENGTH'", "'SOURCE TARGET LENGTH'", 
		"'='", "'WHERE'", "'('", "')'", "'-['", "']->'", "'<-['", "']'", "'~['", 
		"']~'", "'!'", "'^'", "'?'", "'+'", "'*'", "'/'", "'|'", "'{'", "'}'", 
		"'''", "'!='", "'<'", "'>'", "'<='", "'>='", "','", "'AND'", "'OR'", null, 
		null, "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "LETTER", "DIGIT", "SIGN", "SYMBOL", 
		"WS"
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
	public String getGrammarFileName() { return "AlgebraGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AlgebraGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class PathQueryContext extends ParserRuleContext {
		public ProjectionContext projection() {
			return getRuleContext(ProjectionContext.class,0);
		}
		public PathPatternContext pathPattern() {
			return getRuleContext(PathPatternContext.class,0);
		}
		public TerminalNode EOF() { return getToken(AlgebraGrammarParser.EOF, 0); }
		public Restrictor_extContext restrictor_ext() {
			return getRuleContext(Restrictor_extContext.class,0);
		}
		public GroupbyContext groupby() {
			return getRuleContext(GroupbyContext.class,0);
		}
		public OrderbyContext orderby() {
			return getRuleContext(OrderbyContext.class,0);
		}
		public PathQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).enterPathQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).exitPathQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraGrammarVisitor ) return ((AlgebraGrammarVisitor<? extends T>)visitor).visitPathQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathQueryContext pathQuery() throws RecognitionException {
		PathQueryContext _localctx = new PathQueryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_pathQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(T__0);
			setState(53);
			projection();
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) {
				{
				setState(54);
				restrictor_ext();
				}
			}

			setState(57);
			pathPattern();
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(58);
				groupby();
				}
			}

			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(61);
				orderby();
				}
			}

			setState(64);
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

	public static class ProjectionContext extends ParserRuleContext {
		public PartProjContext partProj() {
			return getRuleContext(PartProjContext.class,0);
		}
		public GroupProjContext groupProj() {
			return getRuleContext(GroupProjContext.class,0);
		}
		public PathProjContext pathProj() {
			return getRuleContext(PathProjContext.class,0);
		}
		public ProjectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_projection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).enterProjection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).exitProjection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraGrammarVisitor ) return ((AlgebraGrammarVisitor<? extends T>)visitor).visitProjection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProjectionContext projection() throws RecognitionException {
		ProjectionContext _localctx = new ProjectionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_projection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			partProj();
			setState(67);
			groupProj();
			setState(68);
			pathProj();
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

	public static class PartProjContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public PartProjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partProj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).enterPartProj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).exitPartProj(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraGrammarVisitor ) return ((AlgebraGrammarVisitor<? extends T>)visitor).visitPartProj(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartProjContext partProj() throws RecognitionException {
		PartProjContext _localctx = new PartProjContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_partProj);
		try {
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				match(T__1);
				setState(71);
				match(T__2);
				}
				break;
			case DIGIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				number();
				setState(73);
				match(T__2);
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

	public static class GroupProjContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public GroupProjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupProj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).enterGroupProj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).exitGroupProj(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraGrammarVisitor ) return ((AlgebraGrammarVisitor<? extends T>)visitor).visitGroupProj(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupProjContext groupProj() throws RecognitionException {
		GroupProjContext _localctx = new GroupProjContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_groupProj);
		try {
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				match(T__1);
				setState(78);
				match(T__3);
				}
				break;
			case DIGIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				number();
				setState(80);
				match(T__3);
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

	public static class PathProjContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public PathProjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathProj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).enterPathProj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).exitPathProj(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraGrammarVisitor ) return ((AlgebraGrammarVisitor<? extends T>)visitor).visitPathProj(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathProjContext pathProj() throws RecognitionException {
		PathProjContext _localctx = new PathProjContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_pathProj);
		try {
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				match(T__1);
				setState(85);
				match(T__4);
				}
				break;
			case DIGIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				number();
				setState(87);
				match(T__4);
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

	public static class Restrictor_extContext extends ParserRuleContext {
		public Restrictor_extContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restrictor_ext; }
	 
		public Restrictor_extContext() { }
		public void copyFrom(Restrictor_extContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WALKContext extends Restrictor_extContext {
		public WALKContext(Restrictor_extContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).enterWALK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).exitWALK(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraGrammarVisitor ) return ((AlgebraGrammarVisitor<? extends T>)visitor).visitWALK(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SHORTESTContext extends Restrictor_extContext {
		public SHORTESTContext(Restrictor_extContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).enterSHORTEST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).exitSHORTEST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraGrammarVisitor ) return ((AlgebraGrammarVisitor<? extends T>)visitor).visitSHORTEST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TRAILContext extends Restrictor_extContext {
		public TRAILContext(Restrictor_extContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).enterTRAIL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).exitTRAIL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraGrammarVisitor ) return ((AlgebraGrammarVisitor<? extends T>)visitor).visitTRAIL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ACYCLICContext extends Restrictor_extContext {
		public ACYCLICContext(Restrictor_extContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).enterACYCLIC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).exitACYCLIC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraGrammarVisitor ) return ((AlgebraGrammarVisitor<? extends T>)visitor).visitACYCLIC(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SIMPLEContext extends Restrictor_extContext {
		public SIMPLEContext(Restrictor_extContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).enterSIMPLE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).exitSIMPLE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraGrammarVisitor ) return ((AlgebraGrammarVisitor<? extends T>)visitor).visitSIMPLE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Restrictor_extContext restrictor_ext() throws RecognitionException {
		Restrictor_extContext _localctx = new Restrictor_extContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_restrictor_ext);
		try {
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				_localctx = new WALKContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				match(T__5);
				}
				break;
			case T__6:
				_localctx = new TRAILContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				match(T__6);
				}
				break;
			case T__7:
				_localctx = new SIMPLEContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(93);
				match(T__7);
				}
				break;
			case T__8:
				_localctx = new ACYCLICContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(94);
				match(T__8);
				}
				break;
			case T__9:
				_localctx = new SHORTESTContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(95);
				match(T__9);
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

	public static class OrderbyContext extends ParserRuleContext {
		public OrderbyoptionContext orderbyoption() {
			return getRuleContext(OrderbyoptionContext.class,0);
		}
		public OrderbyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderby; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).enterOrderby(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).exitOrderby(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraGrammarVisitor ) return ((AlgebraGrammarVisitor<? extends T>)visitor).visitOrderby(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderbyContext orderby() throws RecognitionException {
		OrderbyContext _localctx = new OrderbyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_orderby);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(T__10);
			setState(99);
			orderbyoption();
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

	public static class GroupbyContext extends ParserRuleContext {
		public GroupbyoptionContext groupbyoption() {
			return getRuleContext(GroupbyoptionContext.class,0);
		}
		public GroupbyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupby; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).enterGroupby(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).exitGroupby(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraGrammarVisitor ) return ((AlgebraGrammarVisitor<? extends T>)visitor).visitGroupby(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupbyContext groupby() throws RecognitionException {
		GroupbyContext _localctx = new GroupbyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_groupby);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(T__11);
			setState(102);
			groupbyoption();
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

	public static class OrderbyoptionContext extends ParserRuleContext {
		public OrderbyoptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderbyoption; }
	 
		public OrderbyoptionContext() { }
		public void copyFrom(OrderbyoptionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PATHContext extends OrderbyoptionContext {
		public PATHContext(OrderbyoptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).enterPATH(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).exitPATH(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraGrammarVisitor ) return ((AlgebraGrammarVisitor<? extends T>)visitor).visitPATH(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GROUPContext extends OrderbyoptionContext {
		public GROUPContext(OrderbyoptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).enterGROUP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).exitGROUP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraGrammarVisitor ) return ((AlgebraGrammarVisitor<? extends T>)visitor).visitGROUP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PARTITIONGROUPPATHContext extends OrderbyoptionContext {
		public PARTITIONGROUPPATHContext(OrderbyoptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).enterPARTITIONGROUPPATH(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).exitPARTITIONGROUPPATH(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraGrammarVisitor ) return ((AlgebraGrammarVisitor<? extends T>)visitor).visitPARTITIONGROUPPATH(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PARTITIONGROUPContext extends OrderbyoptionContext {
		public PARTITIONGROUPContext(OrderbyoptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).enterPARTITIONGROUP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).exitPARTITIONGROUP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraGrammarVisitor ) return ((AlgebraGrammarVisitor<? extends T>)visitor).visitPARTITIONGROUP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GROUPPATHContext extends OrderbyoptionContext {
		public GROUPPATHContext(OrderbyoptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).enterGROUPPATH(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).exitGROUPPATH(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraGrammarVisitor ) return ((AlgebraGrammarVisitor<? extends T>)visitor).visitGROUPPATH(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PARTITIONContext extends OrderbyoptionContext {
		public PARTITIONContext(OrderbyoptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).enterPARTITION(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).exitPARTITION(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraGrammarVisitor ) return ((AlgebraGrammarVisitor<? extends T>)visitor).visitPARTITION(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PARTITIONPATHContext extends OrderbyoptionContext {
		public PARTITIONPATHContext(OrderbyoptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).enterPARTITIONPATH(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).exitPARTITIONPATH(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraGrammarVisitor ) return ((AlgebraGrammarVisitor<? extends T>)visitor).visitPARTITIONPATH(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderbyoptionContext orderbyoption() throws RecognitionException {
		OrderbyoptionContext _localctx = new OrderbyoptionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_orderbyoption);
		try {
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				_localctx = new PARTITIONContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				match(T__12);
				}
				break;
			case T__13:
				_localctx = new GROUPContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				match(T__13);
				}
				break;
			case T__14:
				_localctx = new PATHContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				match(T__14);
				}
				break;
			case T__15:
				_localctx = new PARTITIONGROUPContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(107);
				match(T__15);
				}
				break;
			case T__16:
				_localctx = new PARTITIONPATHContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(108);
				match(T__16);
				}
				break;
			case T__17:
				_localctx = new GROUPPATHContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(109);
				match(T__17);
				}
				break;
			case T__18:
				_localctx = new PARTITIONGROUPPATHContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(110);
				match(T__18);
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

	public static class GroupbyoptionContext extends ParserRuleContext {
		public GroupbyoptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupbyoption; }
	 
		public GroupbyoptionContext() { }
		public void copyFrom(GroupbyoptionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TARGETContext extends GroupbyoptionContext {
		public TARGETContext(GroupbyoptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).enterTARGET(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).exitTARGET(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraGrammarVisitor ) return ((AlgebraGrammarVisitor<? extends T>)visitor).visitTARGET(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SOURCETARGETContext extends GroupbyoptionContext {
		public SOURCETARGETContext(GroupbyoptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).enterSOURCETARGET(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).exitSOURCETARGET(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraGrammarVisitor ) return ((AlgebraGrammarVisitor<? extends T>)visitor).visitSOURCETARGET(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SOURCELENGTHContext extends GroupbyoptionContext {
		public SOURCELENGTHContext(GroupbyoptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).enterSOURCELENGTH(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).exitSOURCELENGTH(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraGrammarVisitor ) return ((AlgebraGrammarVisitor<? extends T>)visitor).visitSOURCELENGTH(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LENGTHContext extends GroupbyoptionContext {
		public LENGTHContext(GroupbyoptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).enterLENGTH(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).exitLENGTH(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraGrammarVisitor ) return ((AlgebraGrammarVisitor<? extends T>)visitor).visitLENGTH(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SOURCETARGETLENGTHContext extends GroupbyoptionContext {
		public SOURCETARGETLENGTHContext(GroupbyoptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).enterSOURCETARGETLENGTH(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).exitSOURCETARGETLENGTH(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraGrammarVisitor ) return ((AlgebraGrammarVisitor<? extends T>)visitor).visitSOURCETARGETLENGTH(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SOURCEContext extends GroupbyoptionContext {
		public SOURCEContext(GroupbyoptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).enterSOURCE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).exitSOURCE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraGrammarVisitor ) return ((AlgebraGrammarVisitor<? extends T>)visitor).visitSOURCE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TARGETLENGTHContext extends GroupbyoptionContext {
		public TARGETLENGTHContext(GroupbyoptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).enterTARGETLENGTH(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).exitTARGETLENGTH(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraGrammarVisitor ) return ((AlgebraGrammarVisitor<? extends T>)visitor).visitTARGETLENGTH(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupbyoptionContext groupbyoption() throws RecognitionException {
		GroupbyoptionContext _localctx = new GroupbyoptionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_groupbyoption);
		try {
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				_localctx = new SOURCEContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				match(T__19);
				}
				break;
			case T__20:
				_localctx = new TARGETContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				match(T__20);
				}
				break;
			case T__21:
				_localctx = new LENGTHContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(115);
				match(T__21);
				}
				break;
			case T__22:
				_localctx = new SOURCETARGETContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(116);
				match(T__22);
				}
				break;
			case T__23:
				_localctx = new SOURCELENGTHContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(117);
				match(T__23);
				}
				break;
			case T__24:
				_localctx = new TARGETLENGTHContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(118);
				match(T__24);
				}
				break;
			case T__25:
				_localctx = new SOURCETARGETLENGTHContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(119);
				match(T__25);
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

	public static class PathPatternContext extends ParserRuleContext {
		public PathNameContext pathName() {
			return getRuleContext(PathNameContext.class,0);
		}
		public List<NodePatternContext> nodePattern() {
			return getRuleContexts(NodePatternContext.class);
		}
		public NodePatternContext nodePattern(int i) {
			return getRuleContext(NodePatternContext.class,i);
		}
		public EdgePatternContext edgePattern() {
			return getRuleContext(EdgePatternContext.class,0);
		}
		public ComplexConditionContext complexCondition() {
			return getRuleContext(ComplexConditionContext.class,0);
		}
		public PathPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).enterPathPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).exitPathPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraGrammarVisitor ) return ((AlgebraGrammarVisitor<? extends T>)visitor).visitPathPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathPatternContext pathPattern() throws RecognitionException {
		PathPatternContext _localctx = new PathPatternContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_pathPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			pathName();
			setState(123);
			match(T__26);
			setState(124);
			nodePattern();
			setState(125);
			edgePattern();
			setState(126);
			nodePattern();
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__27) {
				{
				setState(127);
				match(T__27);
				setState(128);
				complexCondition();
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

	public static class NodePatternContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public NodePatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nodePattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).enterNodePattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).exitNodePattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraGrammarVisitor ) return ((AlgebraGrammarVisitor<? extends T>)visitor).visitNodePattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NodePatternContext nodePattern() throws RecognitionException {
		NodePatternContext _localctx = new NodePatternContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_nodePattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(T__28);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__38) {
				{
				setState(132);
				var();
				}
			}

			setState(135);
			match(T__29);
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

	public static class EdgePatternContext extends ParserRuleContext {
		public RpqContext rpq() {
			return getRuleContext(RpqContext.class,0);
		}
		public EdgePatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edgePattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).enterEdgePattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).exitEdgePattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraGrammarVisitor ) return ((AlgebraGrammarVisitor<? extends T>)visitor).visitEdgePattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EdgePatternContext edgePattern() throws RecognitionException {
		EdgePatternContext _localctx = new EdgePatternContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_edgePattern);
		int _la;
		try {
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				match(T__30);
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__28) | (1L << T__36) | (1L << SIGN))) != 0)) {
					{
					setState(138);
					rpq(0);
					}
				}

				setState(141);
				match(T__31);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				match(T__32);
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__28) | (1L << T__36) | (1L << SIGN))) != 0)) {
					{
					setState(143);
					rpq(0);
					}
				}

				setState(146);
				match(T__33);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
				match(T__34);
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__28) | (1L << T__36) | (1L << SIGN))) != 0)) {
					{
					setState(148);
					rpq(0);
					}
				}

				setState(151);
				match(T__35);
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

	public static class RpqContext extends ParserRuleContext {
		public RpqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rpq; }
	 
		public RpqContext() { }
		public void copyFrom(RpqContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NegatedContext extends RpqContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public NegatedContext(RpqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).enterNegated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).exitNegated(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraGrammarVisitor ) return ((AlgebraGrammarVisitor<? extends T>)visitor).visitNegated(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConcatenationContext extends RpqContext {
		public List<RpqContext> rpq() {
			return getRuleContexts(RpqContext.class);
		}
		public RpqContext rpq(int i) {
			return getRuleContext(RpqContext.class,i);
		}
		public ConcatenationContext(RpqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).enterConcatenation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).exitConcatenation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraGrammarVisitor ) return ((AlgebraGrammarVisitor<? extends T>)visitor).visitConcatenation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StarContext extends RpqContext {
		public RpqContext rpq() {
			return getRuleContext(RpqContext.class,0);
		}
		public RpqrestrictorContext rpqrestrictor() {
			return getRuleContext(RpqrestrictorContext.class,0);
		}
		public StarContext(RpqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).enterStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).exitStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraGrammarVisitor ) return ((AlgebraGrammarVisitor<? extends T>)visitor).visitStar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LblContext extends RpqContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public LblContext(RpqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).enterLbl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).exitLbl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraGrammarVisitor ) return ((AlgebraGrammarVisitor<? extends T>)visitor).visitLbl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlternationContext extends RpqContext {
		public List<RpqContext> rpq() {
			return getRuleContexts(RpqContext.class);
		}
		public RpqContext rpq(int i) {
			return getRuleContext(RpqContext.class,i);
		}
		public AlternationContext(RpqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).enterAlternation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).exitAlternation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraGrammarVisitor ) return ((AlgebraGrammarVisitor<? extends T>)visitor).visitAlternation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OptionalContext extends RpqContext {
		public RpqContext rpq() {
			return getRuleContext(RpqContext.class,0);
		}
		public OptionalContext(RpqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).enterOptional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).exitOptional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraGrammarVisitor ) return ((AlgebraGrammarVisitor<? extends T>)visitor).visitOptional(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReverseContext extends RpqContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public ReverseContext(RpqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).enterReverse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).exitReverse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraGrammarVisitor ) return ((AlgebraGrammarVisitor<? extends T>)visitor).visitReverse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesisContext extends RpqContext {
		public RpqContext rpq() {
			return getRuleContext(RpqContext.class,0);
		}
		public ParenthesisContext(RpqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).enterParenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).exitParenthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraGrammarVisitor ) return ((AlgebraGrammarVisitor<? extends T>)visitor).visitParenthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusContext extends RpqContext {
		public RpqContext rpq() {
			return getRuleContext(RpqContext.class,0);
		}
		public RpqrestrictorContext rpqrestrictor() {
			return getRuleContext(RpqrestrictorContext.class,0);
		}
		public PlusContext(RpqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).enterPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).exitPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraGrammarVisitor ) return ((AlgebraGrammarVisitor<? extends T>)visitor).visitPlus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RpqContext rpq() throws RecognitionException {
		return rpq(0);
	}

	private RpqContext rpq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RpqContext _localctx = new RpqContext(_ctx, _parentState);
		RpqContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_rpq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				_localctx = new ParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(155);
				match(T__28);
				setState(156);
				rpq(0);
				setState(157);
				match(T__29);
				}
				break;
			case 2:
				{
				_localctx = new LblContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(159);
				label();
				}
				break;
			case 3:
				{
				_localctx = new NegatedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(160);
				match(T__36);
				setState(161);
				label();
				}
				break;
			case 4:
				{
				_localctx = new ReverseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(162);
				label();
				setState(163);
				match(T__37);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(187);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(185);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ConcatenationContext(new RpqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rpq);
						setState(167);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(168);
						match(T__41);
						setState(169);
						rpq(3);
						}
						break;
					case 2:
						{
						_localctx = new AlternationContext(new RpqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rpq);
						setState(170);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(171);
						match(T__42);
						setState(172);
						rpq(2);
						}
						break;
					case 3:
						{
						_localctx = new OptionalContext(new RpqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rpq);
						setState(173);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(174);
						match(T__38);
						}
						break;
					case 4:
						{
						_localctx = new PlusContext(new RpqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rpq);
						setState(175);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(176);
						match(T__39);
						setState(178);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
						case 1:
							{
							setState(177);
							rpqrestrictor();
							}
							break;
						}
						}
						break;
					case 5:
						{
						_localctx = new StarContext(new RpqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rpq);
						setState(180);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(181);
						match(T__40);
						setState(183);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
						case 1:
							{
							setState(182);
							rpqrestrictor();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(189);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class RpqrestrictorContext extends ParserRuleContext {
		public Restrictor_extContext restrictor_ext() {
			return getRuleContext(Restrictor_extContext.class,0);
		}
		public RpqrestrictorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rpqrestrictor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).enterRpqrestrictor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).exitRpqrestrictor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraGrammarVisitor ) return ((AlgebraGrammarVisitor<? extends T>)visitor).visitRpqrestrictor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RpqrestrictorContext rpqrestrictor() throws RecognitionException {
		RpqrestrictorContext _localctx = new RpqrestrictorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_rpqrestrictor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(T__43);
			setState(191);
			restrictor_ext();
			setState(192);
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

	public static class VarContext extends ParserRuleContext {
		public List<TerminalNode> LETTER() { return getTokens(AlgebraGrammarParser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(AlgebraGrammarParser.LETTER, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(AlgebraGrammarParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(AlgebraGrammarParser.DIGIT, i);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraGrammarVisitor ) return ((AlgebraGrammarVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(T__38);
			setState(195);
			match(LETTER);
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LETTER || _la==DIGIT) {
				{
				{
				setState(196);
				_la = _input.LA(1);
				if ( !(_la==LETTER || _la==DIGIT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(201);
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

	public static class PathNameContext extends ParserRuleContext {
		public List<TerminalNode> LETTER() { return getTokens(AlgebraGrammarParser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(AlgebraGrammarParser.LETTER, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(AlgebraGrammarParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(AlgebraGrammarParser.DIGIT, i);
		}
		public PathNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).enterPathName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).exitPathName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraGrammarVisitor ) return ((AlgebraGrammarVisitor<? extends T>)visitor).visitPathName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathNameContext pathName() throws RecognitionException {
		PathNameContext _localctx = new PathNameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_pathName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(LETTER);
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LETTER || _la==DIGIT) {
				{
				{
				setState(203);
				_la = _input.LA(1);
				if ( !(_la==LETTER || _la==DIGIT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(208);
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

	public static class AttributeContext extends ParserRuleContext {
		public List<TerminalNode> LETTER() { return getTokens(AlgebraGrammarParser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(AlgebraGrammarParser.LETTER, i);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraGrammarVisitor ) return ((AlgebraGrammarVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(209);
				match(LETTER);
				}
				}
				setState(212); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LETTER );
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

	public static class ComplexConditionContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BoolOpContext boolOp() {
			return getRuleContext(BoolOpContext.class,0);
		}
		public ComplexConditionContext complexCondition() {
			return getRuleContext(ComplexConditionContext.class,0);
		}
		public ComplexConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).enterComplexCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).exitComplexCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraGrammarVisitor ) return ((AlgebraGrammarVisitor<? extends T>)visitor).visitComplexCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexConditionContext complexCondition() throws RecognitionException {
		ComplexConditionContext _localctx = new ComplexConditionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_complexCondition);
		try {
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				condition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				condition();
				setState(216);
				boolOp();
				setState(217);
				complexCondition();
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

	public static class ConditionContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public CompareSymContext compareSym() {
			return getRuleContext(CompareSymContext.class,0);
		}
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraGrammarVisitor ) return ((AlgebraGrammarVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			function();
			setState(222);
			compareSym();
			setState(223);
			match(T__45);
			setState(224);
			text();
			setState(225);
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

	public static class CompareSymContext extends ParserRuleContext {
		public CompareSymContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareSym; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).enterCompareSym(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).exitCompareSym(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraGrammarVisitor ) return ((AlgebraGrammarVisitor<? extends T>)visitor).visitCompareSym(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareSymContext compareSym() throws RecognitionException {
		CompareSymContext _localctx = new CompareSymContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_compareSym);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50))) != 0)) ) {
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

	public static class FunctionContext extends ParserRuleContext {
		public List<TextContext> text() {
			return getRuleContexts(TextContext.class);
		}
		public TextContext text(int i) {
			return getRuleContext(TextContext.class,i);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraGrammarVisitor ) return ((AlgebraGrammarVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_function);
		try {
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				text();
				setState(230);
				match(T__28);
				setState(231);
				text();
				setState(232);
				match(T__29);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				text();
				setState(235);
				match(T__28);
				setState(236);
				function();
				setState(237);
				match(T__29);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(239);
				text();
				setState(240);
				match(T__28);
				setState(241);
				function();
				setState(242);
				match(T__51);
				setState(243);
				text();
				setState(244);
				match(T__29);
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

	public static class BoolOpContext extends ParserRuleContext {
		public BoolOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).enterBoolOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).exitBoolOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraGrammarVisitor ) return ((AlgebraGrammarVisitor<? extends T>)visitor).visitBoolOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolOpContext boolOp() throws RecognitionException {
		BoolOpContext _localctx = new BoolOpContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_boolOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			_la = _input.LA(1);
			if ( !(_la==T__52 || _la==T__53) ) {
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

	public static class TextContext extends ParserRuleContext {
		public List<TerminalNode> LETTER() { return getTokens(AlgebraGrammarParser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(AlgebraGrammarParser.LETTER, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(AlgebraGrammarParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(AlgebraGrammarParser.DIGIT, i);
		}
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraGrammarVisitor ) return ((AlgebraGrammarVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_text);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(250);
				_la = _input.LA(1);
				if ( !(_la==LETTER || _la==DIGIT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(253); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LETTER || _la==DIGIT );
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
		public TerminalNode SIGN() { return getToken(AlgebraGrammarParser.SIGN, 0); }
		public List<TerminalNode> LETTER() { return getTokens(AlgebraGrammarParser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(AlgebraGrammarParser.LETTER, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(AlgebraGrammarParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(AlgebraGrammarParser.DIGIT, i);
		}
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).exitLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraGrammarVisitor ) return ((AlgebraGrammarVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_label);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(SIGN);
			setState(256);
			match(LETTER);
			setState(260);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(257);
					_la = _input.LA(1);
					if ( !(_la==LETTER || _la==DIGIT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(262);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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

	public static class NumberContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(AlgebraGrammarParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(AlgebraGrammarParser.DIGIT, i);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraGrammarVisitor ) return ((AlgebraGrammarVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(263);
				match(DIGIT);
				}
				}
				setState(266); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
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
		case 13:
			return rpq_sempred((RpqContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean rpq_sempred(RpqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3=\u010f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\2\5\2:\n\2\3\2\3\2\5\2>\n\2\3\2\5\2A\n"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4N\n\4\3\5\3\5\3\5\3"+
		"\5\3\5\5\5U\n\5\3\6\3\6\3\6\3\6\3\6\5\6\\\n\6\3\7\3\7\3\7\3\7\3\7\5\7"+
		"c\n\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nr\n\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\5\13{\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\5\f\u0084\n\f\3\r\3\r\5\r\u0088\n\r\3\r\3\r\3\16\3\16\5\16\u008e\n\16"+
		"\3\16\3\16\3\16\5\16\u0093\n\16\3\16\3\16\3\16\5\16\u0098\n\16\3\16\5"+
		"\16\u009b\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u00a8\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u00b5\n\17\3\17\3\17\3\17\5\17\u00ba\n\17\7\17\u00bc\n\17\f\17\16"+
		"\17\u00bf\13\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\7\21\u00c8\n\21\f\21"+
		"\16\21\u00cb\13\21\3\22\3\22\7\22\u00cf\n\22\f\22\16\22\u00d2\13\22\3"+
		"\23\6\23\u00d5\n\23\r\23\16\23\u00d6\3\24\3\24\3\24\3\24\3\24\5\24\u00de"+
		"\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00f9"+
		"\n\27\3\30\3\30\3\31\6\31\u00fe\n\31\r\31\16\31\u00ff\3\32\3\32\3\32\7"+
		"\32\u0105\n\32\f\32\16\32\u0108\13\32\3\33\6\33\u010b\n\33\r\33\16\33"+
		"\u010c\3\33\2\3\34\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,."+
		"\60\62\64\2\5\3\29:\4\2\35\35\61\65\3\2\678\2\u0124\2\66\3\2\2\2\4D\3"+
		"\2\2\2\6M\3\2\2\2\bT\3\2\2\2\n[\3\2\2\2\fb\3\2\2\2\16d\3\2\2\2\20g\3\2"+
		"\2\2\22q\3\2\2\2\24z\3\2\2\2\26|\3\2\2\2\30\u0085\3\2\2\2\32\u009a\3\2"+
		"\2\2\34\u00a7\3\2\2\2\36\u00c0\3\2\2\2 \u00c4\3\2\2\2\"\u00cc\3\2\2\2"+
		"$\u00d4\3\2\2\2&\u00dd\3\2\2\2(\u00df\3\2\2\2*\u00e5\3\2\2\2,\u00f8\3"+
		"\2\2\2.\u00fa\3\2\2\2\60\u00fd\3\2\2\2\62\u0101\3\2\2\2\64\u010a\3\2\2"+
		"\2\66\67\7\3\2\2\679\5\4\3\28:\5\f\7\298\3\2\2\29:\3\2\2\2:;\3\2\2\2;"+
		"=\5\26\f\2<>\5\20\t\2=<\3\2\2\2=>\3\2\2\2>@\3\2\2\2?A\5\16\b\2@?\3\2\2"+
		"\2@A\3\2\2\2AB\3\2\2\2BC\7\2\2\3C\3\3\2\2\2DE\5\6\4\2EF\5\b\5\2FG\5\n"+
		"\6\2G\5\3\2\2\2HI\7\4\2\2IN\7\5\2\2JK\5\64\33\2KL\7\5\2\2LN\3\2\2\2MH"+
		"\3\2\2\2MJ\3\2\2\2N\7\3\2\2\2OP\7\4\2\2PU\7\6\2\2QR\5\64\33\2RS\7\6\2"+
		"\2SU\3\2\2\2TO\3\2\2\2TQ\3\2\2\2U\t\3\2\2\2VW\7\4\2\2W\\\7\7\2\2XY\5\64"+
		"\33\2YZ\7\7\2\2Z\\\3\2\2\2[V\3\2\2\2[X\3\2\2\2\\\13\3\2\2\2]c\7\b\2\2"+
		"^c\7\t\2\2_c\7\n\2\2`c\7\13\2\2ac\7\f\2\2b]\3\2\2\2b^\3\2\2\2b_\3\2\2"+
		"\2b`\3\2\2\2ba\3\2\2\2c\r\3\2\2\2de\7\r\2\2ef\5\22\n\2f\17\3\2\2\2gh\7"+
		"\16\2\2hi\5\24\13\2i\21\3\2\2\2jr\7\17\2\2kr\7\20\2\2lr\7\21\2\2mr\7\22"+
		"\2\2nr\7\23\2\2or\7\24\2\2pr\7\25\2\2qj\3\2\2\2qk\3\2\2\2ql\3\2\2\2qm"+
		"\3\2\2\2qn\3\2\2\2qo\3\2\2\2qp\3\2\2\2r\23\3\2\2\2s{\7\26\2\2t{\7\27\2"+
		"\2u{\7\30\2\2v{\7\31\2\2w{\7\32\2\2x{\7\33\2\2y{\7\34\2\2zs\3\2\2\2zt"+
		"\3\2\2\2zu\3\2\2\2zv\3\2\2\2zw\3\2\2\2zx\3\2\2\2zy\3\2\2\2{\25\3\2\2\2"+
		"|}\5\"\22\2}~\7\35\2\2~\177\5\30\r\2\177\u0080\5\32\16\2\u0080\u0083\5"+
		"\30\r\2\u0081\u0082\7\36\2\2\u0082\u0084\5&\24\2\u0083\u0081\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\27\3\2\2\2\u0085\u0087\7\37\2\2\u0086\u0088\5 \21"+
		"\2\u0087\u0086\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a"+
		"\7 \2\2\u008a\31\3\2\2\2\u008b\u008d\7!\2\2\u008c\u008e\5\34\17\2\u008d"+
		"\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u009b\7\""+
		"\2\2\u0090\u0092\7#\2\2\u0091\u0093\5\34\17\2\u0092\u0091\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u009b\7$\2\2\u0095\u0097\7%\2"+
		"\2\u0096\u0098\5\34\17\2\u0097\u0096\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\u009b\7&\2\2\u009a\u008b\3\2\2\2\u009a\u0090\3\2"+
		"\2\2\u009a\u0095\3\2\2\2\u009b\33\3\2\2\2\u009c\u009d\b\17\1\2\u009d\u009e"+
		"\7\37\2\2\u009e\u009f\5\34\17\2\u009f\u00a0\7 \2\2\u00a0\u00a8\3\2\2\2"+
		"\u00a1\u00a8\5\62\32\2\u00a2\u00a3\7\'\2\2\u00a3\u00a8\5\62\32\2\u00a4"+
		"\u00a5\5\62\32\2\u00a5\u00a6\7(\2\2\u00a6\u00a8\3\2\2\2\u00a7\u009c\3"+
		"\2\2\2\u00a7\u00a1\3\2\2\2\u00a7\u00a2\3\2\2\2\u00a7\u00a4\3\2\2\2\u00a8"+
		"\u00bd\3\2\2\2\u00a9\u00aa\f\4\2\2\u00aa\u00ab\7,\2\2\u00ab\u00bc\5\34"+
		"\17\5\u00ac\u00ad\f\3\2\2\u00ad\u00ae\7-\2\2\u00ae\u00bc\5\34\17\4\u00af"+
		"\u00b0\f\7\2\2\u00b0\u00bc\7)\2\2\u00b1\u00b2\f\6\2\2\u00b2\u00b4\7*\2"+
		"\2\u00b3\u00b5\5\36\20\2\u00b4\u00b3\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"\u00bc\3\2\2\2\u00b6\u00b7\f\5\2\2\u00b7\u00b9\7+\2\2\u00b8\u00ba\5\36"+
		"\20\2\u00b9\u00b8\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb"+
		"\u00a9\3\2\2\2\u00bb\u00ac\3\2\2\2\u00bb\u00af\3\2\2\2\u00bb\u00b1\3\2"+
		"\2\2\u00bb\u00b6\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\35\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1\7.\2\2"+
		"\u00c1\u00c2\5\f\7\2\u00c2\u00c3\7/\2\2\u00c3\37\3\2\2\2\u00c4\u00c5\7"+
		")\2\2\u00c5\u00c9\79\2\2\u00c6\u00c8\t\2\2\2\u00c7\u00c6\3\2\2\2\u00c8"+
		"\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca!\3\2\2\2"+
		"\u00cb\u00c9\3\2\2\2\u00cc\u00d0\79\2\2\u00cd\u00cf\t\2\2\2\u00ce\u00cd"+
		"\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1"+
		"#\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d5\79\2\2\u00d4\u00d3\3\2\2\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7%\3\2\2\2"+
		"\u00d8\u00de\5(\25\2\u00d9\u00da\5(\25\2\u00da\u00db\5.\30\2\u00db\u00dc"+
		"\5&\24\2\u00dc\u00de\3\2\2\2\u00dd\u00d8\3\2\2\2\u00dd\u00d9\3\2\2\2\u00de"+
		"\'\3\2\2\2\u00df\u00e0\5,\27\2\u00e0\u00e1\5*\26\2\u00e1\u00e2\7\60\2"+
		"\2\u00e2\u00e3\5\60\31\2\u00e3\u00e4\7\60\2\2\u00e4)\3\2\2\2\u00e5\u00e6"+
		"\t\3\2\2\u00e6+\3\2\2\2\u00e7\u00e8\5\60\31\2\u00e8\u00e9\7\37\2\2\u00e9"+
		"\u00ea\5\60\31\2\u00ea\u00eb\7 \2\2\u00eb\u00f9\3\2\2\2\u00ec\u00ed\5"+
		"\60\31\2\u00ed\u00ee\7\37\2\2\u00ee\u00ef\5,\27\2\u00ef\u00f0\7 \2\2\u00f0"+
		"\u00f9\3\2\2\2\u00f1\u00f2\5\60\31\2\u00f2\u00f3\7\37\2\2\u00f3\u00f4"+
		"\5,\27\2\u00f4\u00f5\7\66\2\2\u00f5\u00f6\5\60\31\2\u00f6\u00f7\7 \2\2"+
		"\u00f7\u00f9\3\2\2\2\u00f8\u00e7\3\2\2\2\u00f8\u00ec\3\2\2\2\u00f8\u00f1"+
		"\3\2\2\2\u00f9-\3\2\2\2\u00fa\u00fb\t\4\2\2\u00fb/\3\2\2\2\u00fc\u00fe"+
		"\t\2\2\2\u00fd\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\61\3\2\2\2\u0101\u0102\7;\2\2\u0102\u0106\79\2\2"+
		"\u0103\u0105\t\2\2\2\u0104\u0103\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104"+
		"\3\2\2\2\u0106\u0107\3\2\2\2\u0107\63\3\2\2\2\u0108\u0106\3\2\2\2\u0109"+
		"\u010b\7:\2\2\u010a\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010a\3\2"+
		"\2\2\u010c\u010d\3\2\2\2\u010d\65\3\2\2\2\369=@MT[bqz\u0083\u0087\u008d"+
		"\u0092\u0097\u009a\u00a7\u00b4\u00b9\u00bb\u00bd\u00c9\u00d0\u00d6\u00dd"+
		"\u00f8\u00ff\u0106\u010c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}