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
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, LETTER=51, DIGIT=52, 
		SIGN=53, SYMBOL=54, WS=55;
	public static final int
		RULE_query = 0, RULE_pathPattern = 1, RULE_nodePattern = 2, RULE_edgePattern = 3, 
		RULE_selector = 4, RULE_partitionSelector = 5, RULE_groupSelector = 6, 
		RULE_pathSelector = 7, RULE_restrictor = 8, RULE_orderby = 9, RULE_groupby = 10, 
		RULE_orderbyoption = 11, RULE_groupbyoption = 12, RULE_rpq = 13, RULE_rpqrestrictor = 14, 
		RULE_var = 15, RULE_pathName = 16, RULE_attribute = 17, RULE_complexCondition = 18, 
		RULE_condition = 19, RULE_compareSym = 20, RULE_function = 21, RULE_boolOp = 22, 
		RULE_text = 23, RULE_label = 24, RULE_number = 25;
	public static final String[] ruleNames = {
		"query", "pathPattern", "nodePattern", "edgePattern", "selector", "partitionSelector", 
		"groupSelector", "pathSelector", "restrictor", "orderby", "groupby", "orderbyoption", 
		"groupbyoption", "rpq", "rpqrestrictor", "var", "pathName", "attribute", 
		"complexCondition", "condition", "compareSym", "function", "boolOp", "text", 
		"label", "number"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'MATCH'", "'='", "'WHERE'", "'('", "')'", "'-['", "']->'", "'<-['", 
		"']'", "'~['", "']~'", "'ALL'", "'PARTITIONS'", "'GROUPS'", "'PATHS'", 
		"'WALK'", "'SIMPLE'", "'TRAIL'", "'ACYCLIC'", "'SHORTEST'", "'ORDER BY'", 
		"'GROUP BY'", "'PARTITION'", "'GROUP'", "'PARTITION GROUP'", "'SOURCE'", 
		"'TARGET'", "'LENGTH'", "'SOURCE TARGET'", "'SOURCE LENGTH'", "'TARGET LENGTH'", 
		"'SOURCE TARGET LENGTH'", "'!'", "'^'", "'?'", "'+'", "'*'", "'/'", "'|'", 
		"'{'", "'}'", "'''", "'!='", "'<'", "'>'", "'<='", "'>='", "','", "'AND'", 
		"'OR'", null, null, "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "LETTER", "DIGIT", "SIGN", "SYMBOL", "WS"
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
	public static class QueryContext extends ParserRuleContext {
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public RestrictorContext restrictor() {
			return getRuleContext(RestrictorContext.class,0);
		}
		public PathPatternContext pathPattern() {
			return getRuleContext(PathPatternContext.class,0);
		}
		public TerminalNode EOF() { return getToken(AlgebraGrammarParser.EOF, 0); }
		public GroupbyContext groupby() {
			return getRuleContext(GroupbyContext.class,0);
		}
		public OrderbyContext orderby() {
			return getRuleContext(OrderbyContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraGrammarVisitor ) return ((AlgebraGrammarVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(T__0);
			setState(53);
			selector();
			setState(54);
			restrictor();
			setState(55);
			pathPattern();
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(56);
				groupby();
				}
			}

			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(59);
				orderby();
				}
			}

			setState(62);
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
		enterRule(_localctx, 2, RULE_pathPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			pathName();
			setState(65);
			match(T__1);
			setState(66);
			nodePattern();
			setState(67);
			edgePattern();
			setState(68);
			nodePattern();
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(69);
				match(T__2);
				setState(70);
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
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
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
		enterRule(_localctx, 4, RULE_nodePattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(T__3);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__34) {
				{
				setState(74);
				var();
				}
			}

			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SIGN) {
				{
				setState(77);
				label();
				}
			}

			setState(80);
			match(T__4);
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
		enterRule(_localctx, 6, RULE_edgePattern);
		int _la;
		try {
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				match(T__5);
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__32) | (1L << SIGN))) != 0)) {
					{
					setState(83);
					rpq(0);
					}
				}

				setState(86);
				match(T__6);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				match(T__7);
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__32) | (1L << SIGN))) != 0)) {
					{
					setState(88);
					rpq(0);
					}
				}

				setState(91);
				match(T__8);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				match(T__9);
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__32) | (1L << SIGN))) != 0)) {
					{
					setState(93);
					rpq(0);
					}
				}

				setState(96);
				match(T__10);
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

	public static class SelectorContext extends ParserRuleContext {
		public PartitionSelectorContext partitionSelector() {
			return getRuleContext(PartitionSelectorContext.class,0);
		}
		public GroupSelectorContext groupSelector() {
			return getRuleContext(GroupSelectorContext.class,0);
		}
		public PathSelectorContext pathSelector() {
			return getRuleContext(PathSelectorContext.class,0);
		}
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).exitSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraGrammarVisitor ) return ((AlgebraGrammarVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_selector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			partitionSelector();
			setState(100);
			groupSelector();
			setState(101);
			pathSelector();
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

	public static class PartitionSelectorContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public PartitionSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).enterPartitionSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).exitPartitionSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraGrammarVisitor ) return ((AlgebraGrammarVisitor<? extends T>)visitor).visitPartitionSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionSelectorContext partitionSelector() throws RecognitionException {
		PartitionSelectorContext _localctx = new PartitionSelectorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_partitionSelector);
		try {
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				match(T__11);
				setState(104);
				match(T__12);
				}
				break;
			case DIGIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				number();
				setState(106);
				match(T__12);
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

	public static class GroupSelectorContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public GroupSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).enterGroupSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).exitGroupSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraGrammarVisitor ) return ((AlgebraGrammarVisitor<? extends T>)visitor).visitGroupSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupSelectorContext groupSelector() throws RecognitionException {
		GroupSelectorContext _localctx = new GroupSelectorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_groupSelector);
		try {
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				match(T__11);
				setState(111);
				match(T__13);
				}
				break;
			case DIGIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				number();
				setState(113);
				match(T__13);
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

	public static class PathSelectorContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public PathSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).enterPathSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraGrammarListener ) ((AlgebraGrammarListener)listener).exitPathSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraGrammarVisitor ) return ((AlgebraGrammarVisitor<? extends T>)visitor).visitPathSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathSelectorContext pathSelector() throws RecognitionException {
		PathSelectorContext _localctx = new PathSelectorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_pathSelector);
		try {
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				match(T__11);
				setState(118);
				match(T__14);
				}
				break;
			case DIGIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				number();
				setState(120);
				match(T__14);
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

	public static class RestrictorContext extends ParserRuleContext {
		public RestrictorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restrictor; }
	 
		public RestrictorContext() { }
		public void copyFrom(RestrictorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WALKContext extends RestrictorContext {
		public WALKContext(RestrictorContext ctx) { copyFrom(ctx); }
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
	public static class SHORTESTContext extends RestrictorContext {
		public SHORTESTContext(RestrictorContext ctx) { copyFrom(ctx); }
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
	public static class TRAILContext extends RestrictorContext {
		public TRAILContext(RestrictorContext ctx) { copyFrom(ctx); }
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
	public static class ACYCLICContext extends RestrictorContext {
		public ACYCLICContext(RestrictorContext ctx) { copyFrom(ctx); }
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
	public static class SIMPLEContext extends RestrictorContext {
		public SIMPLEContext(RestrictorContext ctx) { copyFrom(ctx); }
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

	public final RestrictorContext restrictor() throws RecognitionException {
		RestrictorContext _localctx = new RestrictorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_restrictor);
		try {
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				_localctx = new WALKContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(T__15);
				}
				break;
			case T__16:
				_localctx = new SIMPLEContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				match(T__16);
				}
				break;
			case T__17:
				_localctx = new TRAILContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				match(T__17);
				}
				break;
			case T__18:
				_localctx = new ACYCLICContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(127);
				match(T__18);
				}
				break;
			case T__19:
				_localctx = new SHORTESTContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(128);
				match(T__19);
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
		enterRule(_localctx, 18, RULE_orderby);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(T__20);
			setState(132);
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
		enterRule(_localctx, 20, RULE_groupby);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(T__21);
			setState(135);
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

	public final OrderbyoptionContext orderbyoption() throws RecognitionException {
		OrderbyoptionContext _localctx = new OrderbyoptionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_orderbyoption);
		try {
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				_localctx = new PARTITIONContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				match(T__22);
				}
				break;
			case T__23:
				_localctx = new GROUPContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				match(T__23);
				}
				break;
			case T__24:
				_localctx = new PARTITIONGROUPContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
				match(T__24);
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
		enterRule(_localctx, 24, RULE_groupbyoption);
		try {
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
				_localctx = new SOURCEContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				match(T__25);
				}
				break;
			case T__26:
				_localctx = new TARGETContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				match(T__26);
				}
				break;
			case T__27:
				_localctx = new LENGTHContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
				match(T__27);
				}
				break;
			case T__28:
				_localctx = new SOURCETARGETContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(145);
				match(T__28);
				}
				break;
			case T__29:
				_localctx = new SOURCELENGTHContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(146);
				match(T__29);
				}
				break;
			case T__30:
				_localctx = new TARGETLENGTHContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(147);
				match(T__30);
				}
				break;
			case T__31:
				_localctx = new SOURCETARGETLENGTHContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(148);
				match(T__31);
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
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				_localctx = new ParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(152);
				match(T__3);
				setState(153);
				rpq(0);
				setState(154);
				match(T__4);
				}
				break;
			case 2:
				{
				_localctx = new LblContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(156);
				label();
				}
				break;
			case 3:
				{
				_localctx = new NegatedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(157);
				match(T__32);
				setState(158);
				label();
				}
				break;
			case 4:
				{
				_localctx = new ReverseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(159);
				label();
				setState(160);
				match(T__33);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(184);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(182);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ConcatenationContext(new RpqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rpq);
						setState(164);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(165);
						match(T__37);
						setState(166);
						rpq(3);
						}
						break;
					case 2:
						{
						_localctx = new AlternationContext(new RpqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rpq);
						setState(167);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(168);
						match(T__38);
						setState(169);
						rpq(2);
						}
						break;
					case 3:
						{
						_localctx = new OptionalContext(new RpqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rpq);
						setState(170);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(171);
						match(T__34);
						}
						break;
					case 4:
						{
						_localctx = new PlusContext(new RpqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rpq);
						setState(172);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(173);
						match(T__35);
						setState(175);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
						case 1:
							{
							setState(174);
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
						setState(177);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(178);
						match(T__36);
						setState(180);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
						case 1:
							{
							setState(179);
							rpqrestrictor();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(186);
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
		public RestrictorContext restrictor() {
			return getRuleContext(RestrictorContext.class,0);
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
			setState(187);
			match(T__39);
			setState(188);
			restrictor();
			setState(189);
			match(T__40);
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
			setState(191);
			match(T__34);
			setState(192);
			match(LETTER);
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LETTER || _la==DIGIT) {
				{
				{
				setState(193);
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
				setState(198);
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
			setState(199);
			match(LETTER);
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LETTER || _la==DIGIT) {
				{
				{
				setState(200);
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
				setState(205);
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
			setState(207); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(206);
				match(LETTER);
				}
				}
				setState(209); 
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
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				condition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				condition();
				setState(213);
				boolOp();
				setState(214);
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
			setState(218);
			function();
			setState(219);
			compareSym();
			setState(220);
			match(T__41);
			setState(221);
			text();
			setState(222);
			match(T__41);
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
			setState(224);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46))) != 0)) ) {
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
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				text();
				setState(227);
				match(T__3);
				setState(228);
				text();
				setState(229);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				text();
				setState(232);
				match(T__3);
				setState(233);
				function();
				setState(234);
				match(T__4);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(236);
				text();
				setState(237);
				match(T__3);
				setState(238);
				function();
				setState(239);
				match(T__47);
				setState(240);
				text();
				setState(241);
				match(T__4);
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
			setState(245);
			_la = _input.LA(1);
			if ( !(_la==T__48 || _la==T__49) ) {
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
			setState(248); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(247);
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
				setState(250); 
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
			setState(252);
			match(SIGN);
			setState(253);
			match(LETTER);
			setState(257);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(254);
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
				setState(259);
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
			setState(261); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(260);
				match(DIGIT);
				}
				}
				setState(263); 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39\u010c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\2\5\2<\n\2\3\2\5\2?\n\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3J\n\3\3\4\3\4\5\4N\n\4\3\4\5\4Q\n\4\3"+
		"\4\3\4\3\5\3\5\5\5W\n\5\3\5\3\5\3\5\5\5\\\n\5\3\5\3\5\3\5\5\5a\n\5\3\5"+
		"\5\5d\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7o\n\7\3\b\3\b\3\b\3\b"+
		"\3\b\5\bv\n\b\3\t\3\t\3\t\3\t\3\t\5\t}\n\t\3\n\3\n\3\n\3\n\3\n\5\n\u0084"+
		"\n\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\5\r\u008f\n\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\5\16\u0098\n\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u00a5\n\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u00b2\n\17\3\17\3\17\3\17\5\17\u00b7\n"+
		"\17\7\17\u00b9\n\17\f\17\16\17\u00bc\13\17\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\7\21\u00c5\n\21\f\21\16\21\u00c8\13\21\3\22\3\22\7\22\u00cc\n"+
		"\22\f\22\16\22\u00cf\13\22\3\23\6\23\u00d2\n\23\r\23\16\23\u00d3\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u00db\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\5\27\u00f6\n\27\3\30\3\30\3\31\6\31\u00fb\n\31\r"+
		"\31\16\31\u00fc\3\32\3\32\3\32\7\32\u0102\n\32\f\32\16\32\u0105\13\32"+
		"\3\33\6\33\u0108\n\33\r\33\16\33\u0109\3\33\2\3\34\34\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\2\5\3\2\65\66\4\2\4\4-\61\3\2"+
		"\63\64\2\u011d\2\66\3\2\2\2\4B\3\2\2\2\6K\3\2\2\2\bc\3\2\2\2\ne\3\2\2"+
		"\2\fn\3\2\2\2\16u\3\2\2\2\20|\3\2\2\2\22\u0083\3\2\2\2\24\u0085\3\2\2"+
		"\2\26\u0088\3\2\2\2\30\u008e\3\2\2\2\32\u0097\3\2\2\2\34\u00a4\3\2\2\2"+
		"\36\u00bd\3\2\2\2 \u00c1\3\2\2\2\"\u00c9\3\2\2\2$\u00d1\3\2\2\2&\u00da"+
		"\3\2\2\2(\u00dc\3\2\2\2*\u00e2\3\2\2\2,\u00f5\3\2\2\2.\u00f7\3\2\2\2\60"+
		"\u00fa\3\2\2\2\62\u00fe\3\2\2\2\64\u0107\3\2\2\2\66\67\7\3\2\2\678\5\n"+
		"\6\289\5\22\n\29;\5\4\3\2:<\5\26\f\2;:\3\2\2\2;<\3\2\2\2<>\3\2\2\2=?\5"+
		"\24\13\2>=\3\2\2\2>?\3\2\2\2?@\3\2\2\2@A\7\2\2\3A\3\3\2\2\2BC\5\"\22\2"+
		"CD\7\4\2\2DE\5\6\4\2EF\5\b\5\2FI\5\6\4\2GH\7\5\2\2HJ\5&\24\2IG\3\2\2\2"+
		"IJ\3\2\2\2J\5\3\2\2\2KM\7\6\2\2LN\5 \21\2ML\3\2\2\2MN\3\2\2\2NP\3\2\2"+
		"\2OQ\5\62\32\2PO\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RS\7\7\2\2S\7\3\2\2\2TV\7"+
		"\b\2\2UW\5\34\17\2VU\3\2\2\2VW\3\2\2\2WX\3\2\2\2Xd\7\t\2\2Y[\7\n\2\2Z"+
		"\\\5\34\17\2[Z\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]d\7\13\2\2^`\7\f\2\2_a\5"+
		"\34\17\2`_\3\2\2\2`a\3\2\2\2ab\3\2\2\2bd\7\r\2\2cT\3\2\2\2cY\3\2\2\2c"+
		"^\3\2\2\2d\t\3\2\2\2ef\5\f\7\2fg\5\16\b\2gh\5\20\t\2h\13\3\2\2\2ij\7\16"+
		"\2\2jo\7\17\2\2kl\5\64\33\2lm\7\17\2\2mo\3\2\2\2ni\3\2\2\2nk\3\2\2\2o"+
		"\r\3\2\2\2pq\7\16\2\2qv\7\20\2\2rs\5\64\33\2st\7\20\2\2tv\3\2\2\2up\3"+
		"\2\2\2ur\3\2\2\2v\17\3\2\2\2wx\7\16\2\2x}\7\21\2\2yz\5\64\33\2z{\7\21"+
		"\2\2{}\3\2\2\2|w\3\2\2\2|y\3\2\2\2}\21\3\2\2\2~\u0084\7\22\2\2\177\u0084"+
		"\7\23\2\2\u0080\u0084\7\24\2\2\u0081\u0084\7\25\2\2\u0082\u0084\7\26\2"+
		"\2\u0083~\3\2\2\2\u0083\177\3\2\2\2\u0083\u0080\3\2\2\2\u0083\u0081\3"+
		"\2\2\2\u0083\u0082\3\2\2\2\u0084\23\3\2\2\2\u0085\u0086\7\27\2\2\u0086"+
		"\u0087\5\30\r\2\u0087\25\3\2\2\2\u0088\u0089\7\30\2\2\u0089\u008a\5\32"+
		"\16\2\u008a\27\3\2\2\2\u008b\u008f\7\31\2\2\u008c\u008f\7\32\2\2\u008d"+
		"\u008f\7\33\2\2\u008e\u008b\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008d\3"+
		"\2\2\2\u008f\31\3\2\2\2\u0090\u0098\7\34\2\2\u0091\u0098\7\35\2\2\u0092"+
		"\u0098\7\36\2\2\u0093\u0098\7\37\2\2\u0094\u0098\7 \2\2\u0095\u0098\7"+
		"!\2\2\u0096\u0098\7\"\2\2\u0097\u0090\3\2\2\2\u0097\u0091\3\2\2\2\u0097"+
		"\u0092\3\2\2\2\u0097\u0093\3\2\2\2\u0097\u0094\3\2\2\2\u0097\u0095\3\2"+
		"\2\2\u0097\u0096\3\2\2\2\u0098\33\3\2\2\2\u0099\u009a\b\17\1\2\u009a\u009b"+
		"\7\6\2\2\u009b\u009c\5\34\17\2\u009c\u009d\7\7\2\2\u009d\u00a5\3\2\2\2"+
		"\u009e\u00a5\5\62\32\2\u009f\u00a0\7#\2\2\u00a0\u00a5\5\62\32\2\u00a1"+
		"\u00a2\5\62\32\2\u00a2\u00a3\7$\2\2\u00a3\u00a5\3\2\2\2\u00a4\u0099\3"+
		"\2\2\2\u00a4\u009e\3\2\2\2\u00a4\u009f\3\2\2\2\u00a4\u00a1\3\2\2\2\u00a5"+
		"\u00ba\3\2\2\2\u00a6\u00a7\f\4\2\2\u00a7\u00a8\7(\2\2\u00a8\u00b9\5\34"+
		"\17\5\u00a9\u00aa\f\3\2\2\u00aa\u00ab\7)\2\2\u00ab\u00b9\5\34\17\4\u00ac"+
		"\u00ad\f\7\2\2\u00ad\u00b9\7%\2\2\u00ae\u00af\f\6\2\2\u00af\u00b1\7&\2"+
		"\2\u00b0\u00b2\5\36\20\2\u00b1\u00b0\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		"\u00b9\3\2\2\2\u00b3\u00b4\f\5\2\2\u00b4\u00b6\7\'\2\2\u00b5\u00b7\5\36"+
		"\20\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8"+
		"\u00a6\3\2\2\2\u00b8\u00a9\3\2\2\2\u00b8\u00ac\3\2\2\2\u00b8\u00ae\3\2"+
		"\2\2\u00b8\u00b3\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\35\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00be\7*\2\2"+
		"\u00be\u00bf\5\22\n\2\u00bf\u00c0\7+\2\2\u00c0\37\3\2\2\2\u00c1\u00c2"+
		"\7%\2\2\u00c2\u00c6\7\65\2\2\u00c3\u00c5\t\2\2\2\u00c4\u00c3\3\2\2\2\u00c5"+
		"\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7!\3\2\2\2"+
		"\u00c8\u00c6\3\2\2\2\u00c9\u00cd\7\65\2\2\u00ca\u00cc\t\2\2\2\u00cb\u00ca"+
		"\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce"+
		"#\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d2\7\65\2\2\u00d1\u00d0\3\2\2\2"+
		"\u00d2\u00d3\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4%\3"+
		"\2\2\2\u00d5\u00db\5(\25\2\u00d6\u00d7\5(\25\2\u00d7\u00d8\5.\30\2\u00d8"+
		"\u00d9\5&\24\2\u00d9\u00db\3\2\2\2\u00da\u00d5\3\2\2\2\u00da\u00d6\3\2"+
		"\2\2\u00db\'\3\2\2\2\u00dc\u00dd\5,\27\2\u00dd\u00de\5*\26\2\u00de\u00df"+
		"\7,\2\2\u00df\u00e0\5\60\31\2\u00e0\u00e1\7,\2\2\u00e1)\3\2\2\2\u00e2"+
		"\u00e3\t\3\2\2\u00e3+\3\2\2\2\u00e4\u00e5\5\60\31\2\u00e5\u00e6\7\6\2"+
		"\2\u00e6\u00e7\5\60\31\2\u00e7\u00e8\7\7\2\2\u00e8\u00f6\3\2\2\2\u00e9"+
		"\u00ea\5\60\31\2\u00ea\u00eb\7\6\2\2\u00eb\u00ec\5,\27\2\u00ec\u00ed\7"+
		"\7\2\2\u00ed\u00f6\3\2\2\2\u00ee\u00ef\5\60\31\2\u00ef\u00f0\7\6\2\2\u00f0"+
		"\u00f1\5,\27\2\u00f1\u00f2\7\62\2\2\u00f2\u00f3\5\60\31\2\u00f3\u00f4"+
		"\7\7\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00e4\3\2\2\2\u00f5\u00e9\3\2\2\2\u00f5"+
		"\u00ee\3\2\2\2\u00f6-\3\2\2\2\u00f7\u00f8\t\4\2\2\u00f8/\3\2\2\2\u00f9"+
		"\u00fb\t\2\2\2\u00fa\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fa\3\2"+
		"\2\2\u00fc\u00fd\3\2\2\2\u00fd\61\3\2\2\2\u00fe\u00ff\7\67\2\2\u00ff\u0103"+
		"\7\65\2\2\u0100\u0102\t\2\2\2\u0101\u0100\3\2\2\2\u0102\u0105\3\2\2\2"+
		"\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\63\3\2\2\2\u0105\u0103"+
		"\3\2\2\2\u0106\u0108\7\66\2\2\u0107\u0106\3\2\2\2\u0108\u0109\3\2\2\2"+
		"\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\65\3\2\2\2\36;>IMPV[`c"+
		"nu|\u0083\u008e\u0097\u00a4\u00b1\u00b6\u00b8\u00ba\u00c6\u00cd\u00d3"+
		"\u00da\u00f5\u00fc\u0103\u0109";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}