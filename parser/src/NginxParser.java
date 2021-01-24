// Generated from src/Nginx.g4 by ANTLR 4.9
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NginxParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, ID=14, WS=15, COMMENT=16;
	public static final int
		RULE_nginx = 0, RULE_stat = 1, RULE_ifDirective = 2, RULE_locationDirective = 3, 
		RULE_upstreamDirective = 4, RULE_contextDirective = 5, RULE_includeDirective = 6, 
		RULE_serverDirective = 7, RULE_value = 8, RULE_block = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"nginx", "stat", "ifDirective", "locationDirective", "upstreamDirective", 
			"contextDirective", "includeDirective", "serverDirective", "value", "block"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'if'", "'location'", "'='", "'^~'", "'~*'", "'~'", "'upstream'", 
			"'server'", "'http'", "'include'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "ID", "WS", "COMMENT"
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
	public String getGrammarFileName() { return "Nginx.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public NginxParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class NginxContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public NginxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nginx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).enterNginx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).exitNginx(this);
		}
	}

	public final NginxContext nginx() throws RecognitionException {
		NginxContext _localctx = new NginxContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_nginx);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << ID))) != 0)) {
				{
				{
				setState(20);
				stat();
				}
				}
				setState(25);
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
	public static class IfBlockContext extends StatContext {
		public IfDirectiveContext ifDirective() {
			return getRuleContext(IfDirectiveContext.class,0);
		}
		public IfBlockContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).enterIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).exitIfBlock(this);
		}
	}
	public static class LocationBlockContext extends StatContext {
		public LocationDirectiveContext locationDirective() {
			return getRuleContext(LocationDirectiveContext.class,0);
		}
		public LocationBlockContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).enterLocationBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).exitLocationBlock(this);
		}
	}
	public static class ValuesContext extends StatContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public ValuesContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).enterValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).exitValues(this);
		}
	}
	public static class UpstreamBlockContext extends StatContext {
		public UpstreamDirectiveContext upstreamDirective() {
			return getRuleContext(UpstreamDirectiveContext.class,0);
		}
		public UpstreamBlockContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).enterUpstreamBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).exitUpstreamBlock(this);
		}
	}
	public static class ContextBlockContext extends StatContext {
		public ContextDirectiveContext contextDirective() {
			return getRuleContext(ContextDirectiveContext.class,0);
		}
		public ContextBlockContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).enterContextBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).exitContextBlock(this);
		}
	}
	public static class ServerBlockContext extends StatContext {
		public ServerDirectiveContext serverDirective() {
			return getRuleContext(ServerDirectiveContext.class,0);
		}
		public ServerBlockContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).enterServerBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).exitServerBlock(this);
		}
	}
	public static class IncludeBlockContext extends StatContext {
		public IncludeDirectiveContext includeDirective() {
			return getRuleContext(IncludeDirectiveContext.class,0);
		}
		public IncludeBlockContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).enterIncludeBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).exitIncludeBlock(this);
		}
	}
	public static class ValueBlockContext extends StatContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ValueBlockContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).enterValueBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).exitValueBlock(this);
		}
	}
	public static class ValuesBlockContext extends StatContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ValuesBlockContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).enterValuesBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).exitValuesBlock(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		int _la;
		try {
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new UpstreamBlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				upstreamDirective();
				}
				break;
			case 2:
				_localctx = new ContextBlockContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				contextDirective();
				}
				break;
			case 3:
				_localctx = new ServerBlockContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(28);
				serverDirective();
				}
				break;
			case 4:
				_localctx = new IfBlockContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(29);
				ifDirective();
				}
				break;
			case 5:
				_localctx = new IncludeBlockContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(30);
				includeDirective();
				}
				break;
			case 6:
				_localctx = new LocationBlockContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(31);
				locationDirective();
				}
				break;
			case 7:
				_localctx = new ValueBlockContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(32);
				value();
				setState(33);
				block();
				}
				break;
			case 8:
				_localctx = new ValuesBlockContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(35);
				value();
				setState(37); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(36);
					value();
					}
					}
					setState(39); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				setState(41);
				block();
				}
				break;
			case 9:
				_localctx = new ValuesContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(44); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(43);
					value();
					}
					}
					setState(46); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				setState(48);
				match(T__0);
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

	public static class IfDirectiveContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).enterIfDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).exitIfDirective(this);
		}
	}

	public final IfDirectiveContext ifDirective() throws RecognitionException {
		IfDirectiveContext _localctx = new IfDirectiveContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ifDirective);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(T__1);
			setState(56);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(53);
					matchWildcard();
					}
					} 
				}
				setState(58);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(59);
			block();
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

	public static class LocationDirectiveContext extends ParserRuleContext {
		public LocationDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_locationDirective; }
	 
		public LocationDirectiveContext() { }
		public void copyFrom(LocationDirectiveContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EqualLocationContext extends LocationDirectiveContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public EqualLocationContext(LocationDirectiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).enterEqualLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).exitEqualLocation(this);
		}
	}
	public static class RegexLocationContext extends LocationDirectiveContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public RegexLocationContext(LocationDirectiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).enterRegexLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).exitRegexLocation(this);
		}
	}
	public static class NormalLocationContext extends LocationDirectiveContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public NormalLocationContext(LocationDirectiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).enterNormalLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).exitNormalLocation(this);
		}
	}
	public static class ICaseRegexLocationContext extends LocationDirectiveContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ICaseRegexLocationContext(LocationDirectiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).enterICaseRegexLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).exitICaseRegexLocation(this);
		}
	}
	public static class HeadRegexLocationContext extends LocationDirectiveContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public HeadRegexLocationContext(LocationDirectiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).enterHeadRegexLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).exitHeadRegexLocation(this);
		}
	}

	public final LocationDirectiveContext locationDirective() throws RecognitionException {
		LocationDirectiveContext _localctx = new LocationDirectiveContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_locationDirective);
		try {
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new EqualLocationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				match(T__2);
				setState(62);
				match(T__3);
				setState(63);
				value();
				setState(64);
				block();
				}
				break;
			case 2:
				_localctx = new HeadRegexLocationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				match(T__2);
				setState(67);
				match(T__4);
				setState(68);
				value();
				setState(69);
				block();
				}
				break;
			case 3:
				_localctx = new ICaseRegexLocationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				match(T__2);
				setState(72);
				match(T__5);
				setState(73);
				value();
				setState(74);
				block();
				}
				break;
			case 4:
				_localctx = new RegexLocationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(76);
				match(T__2);
				setState(77);
				match(T__6);
				setState(78);
				value();
				setState(79);
				block();
				}
				break;
			case 5:
				_localctx = new NormalLocationContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(81);
				match(T__2);
				setState(82);
				value();
				setState(83);
				block();
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

	public static class UpstreamDirectiveContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(NginxParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public UpstreamDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_upstreamDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).enterUpstreamDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).exitUpstreamDirective(this);
		}
	}

	public final UpstreamDirectiveContext upstreamDirective() throws RecognitionException {
		UpstreamDirectiveContext _localctx = new UpstreamDirectiveContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_upstreamDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(T__7);
			setState(88);
			match(ID);
			setState(89);
			block();
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

	public static class ContextDirectiveContext extends ParserRuleContext {
		public Token context;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ContextDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contextDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).enterContextDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).exitContextDirective(this);
		}
	}

	public final ContextDirectiveContext contextDirective() throws RecognitionException {
		ContextDirectiveContext _localctx = new ContextDirectiveContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_contextDirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			((ContextDirectiveContext)_localctx).context = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__8 || _la==T__9) ) {
				((ContextDirectiveContext)_localctx).context = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(92);
			block();
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

	public static class IncludeDirectiveContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public IncludeDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_includeDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).enterIncludeDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).exitIncludeDirective(this);
		}
	}

	public final IncludeDirectiveContext includeDirective() throws RecognitionException {
		IncludeDirectiveContext _localctx = new IncludeDirectiveContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_includeDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(T__10);
			setState(95);
			value();
			setState(96);
			match(T__0);
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

	public static class ServerDirectiveContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public ServerDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serverDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).enterServerDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).exitServerDirective(this);
		}
	}

	public final ServerDirectiveContext serverDirective() throws RecognitionException {
		ServerDirectiveContext _localctx = new ServerDirectiveContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_serverDirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(T__8);
			setState(100); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(99);
				value();
				}
				}
				setState(102); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(104);
			match(T__0);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(NginxParser.ID, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(ID);
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
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(T__11);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << ID))) != 0)) {
				{
				{
				setState(109);
				stat();
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
			match(T__12);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\22x\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\7\2\30\n\2\f\2\16\2\33\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\6\3(\n\3\r\3\16\3)\3\3\3\3\3\3\6\3/\n\3\r\3\16\3\60\3\3\3\3\5\3\65"+
		"\n\3\3\4\3\4\7\49\n\4\f\4\16\4<\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\5\5X\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\6\tg\n\t"+
		"\r\t\16\th\3\t\3\t\3\n\3\n\3\13\3\13\7\13q\n\13\f\13\16\13t\13\13\3\13"+
		"\3\13\3\13\3:\2\f\2\4\6\b\n\f\16\20\22\24\2\3\3\2\13\f\2\177\2\31\3\2"+
		"\2\2\4\64\3\2\2\2\6\66\3\2\2\2\bW\3\2\2\2\nY\3\2\2\2\f]\3\2\2\2\16`\3"+
		"\2\2\2\20d\3\2\2\2\22l\3\2\2\2\24n\3\2\2\2\26\30\5\4\3\2\27\26\3\2\2\2"+
		"\30\33\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\3\3\2\2\2\33\31\3\2\2\2"+
		"\34\65\5\n\6\2\35\65\5\f\7\2\36\65\5\20\t\2\37\65\5\6\4\2 \65\5\16\b\2"+
		"!\65\5\b\5\2\"#\5\22\n\2#$\5\24\13\2$\65\3\2\2\2%\'\5\22\n\2&(\5\22\n"+
		"\2\'&\3\2\2\2()\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*+\3\2\2\2+,\5\24\13\2,\65"+
		"\3\2\2\2-/\5\22\n\2.-\3\2\2\2/\60\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61"+
		"\62\3\2\2\2\62\63\7\3\2\2\63\65\3\2\2\2\64\34\3\2\2\2\64\35\3\2\2\2\64"+
		"\36\3\2\2\2\64\37\3\2\2\2\64 \3\2\2\2\64!\3\2\2\2\64\"\3\2\2\2\64%\3\2"+
		"\2\2\64.\3\2\2\2\65\5\3\2\2\2\66:\7\4\2\2\679\13\2\2\28\67\3\2\2\29<\3"+
		"\2\2\2:;\3\2\2\2:8\3\2\2\2;=\3\2\2\2<:\3\2\2\2=>\5\24\13\2>\7\3\2\2\2"+
		"?@\7\5\2\2@A\7\6\2\2AB\5\22\n\2BC\5\24\13\2CX\3\2\2\2DE\7\5\2\2EF\7\7"+
		"\2\2FG\5\22\n\2GH\5\24\13\2HX\3\2\2\2IJ\7\5\2\2JK\7\b\2\2KL\5\22\n\2L"+
		"M\5\24\13\2MX\3\2\2\2NO\7\5\2\2OP\7\t\2\2PQ\5\22\n\2QR\5\24\13\2RX\3\2"+
		"\2\2ST\7\5\2\2TU\5\22\n\2UV\5\24\13\2VX\3\2\2\2W?\3\2\2\2WD\3\2\2\2WI"+
		"\3\2\2\2WN\3\2\2\2WS\3\2\2\2X\t\3\2\2\2YZ\7\n\2\2Z[\7\20\2\2[\\\5\24\13"+
		"\2\\\13\3\2\2\2]^\t\2\2\2^_\5\24\13\2_\r\3\2\2\2`a\7\r\2\2ab\5\22\n\2"+
		"bc\7\3\2\2c\17\3\2\2\2df\7\13\2\2eg\5\22\n\2fe\3\2\2\2gh\3\2\2\2hf\3\2"+
		"\2\2hi\3\2\2\2ij\3\2\2\2jk\7\3\2\2k\21\3\2\2\2lm\7\20\2\2m\23\3\2\2\2"+
		"nr\7\16\2\2oq\5\4\3\2po\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2su\3\2\2"+
		"\2tr\3\2\2\2uv\7\17\2\2v\25\3\2\2\2\n\31)\60\64:Whr";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}