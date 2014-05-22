// Generated from C:/Users/Anna/IdeaProjects/HungerCode/grammar\hunger.g4 by ANTLR 4.x
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class hungerParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__25=1, T__24=2, T__23=3, T__22=4, T__21=5, T__20=6, T__19=7, T__18=8, 
		T__17=9, T__16=10, T__15=11, T__14=12, T__13=13, T__12=14, T__11=15, T__10=16, 
		T__9=17, T__8=18, T__7=19, T__6=20, T__5=21, T__4=22, T__3=23, T__2=24, 
		T__1=25, T__0=26, Number=27, String=28, Whitespace=29;
	public static final String[] tokenNames = {
		"<INVALID>", "'True'", "','", "'('", "'dl'", "'Milligram'", "'l'", "'servings'", 
		"'mg'", "'\"'", "'Decilitre'", "'False'", "'kg'", "')'", "'star'", "'Piece'", 
		"'newFood'", "'Millilitre'", "'='", "'Gram'", "';'", "'Litre'", "'pc'", 
		"'Kilogram'", "'ml'", "'newRecipe'", "'g'", "Number", "String", "Whitespace"
	};
	public static final int
		RULE_kood = 0, RULE_lause = 1, RULE_newRecipe = 2, RULE_newFood = 3, RULE_omistamine = 4, 
		RULE_defineerimine = 5, RULE_kilogram = 6, RULE_litre = 7, RULE_piece = 8, 
		RULE_recipeName = 9;
	public static final String[] ruleNames = {
		"kood", "lause", "newRecipe", "newFood", "omistamine", "defineerimine", 
		"kilogram", "litre", "piece", "recipeName"
	};

	@Override
	public String getGrammarFileName() { return "hunger.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public hungerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class KoodContext extends ParserRuleContext {
		public LauseContext lause() {
			return getRuleContext(LauseContext.class,0);
		}
		public KoodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kood; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hungerListener ) ((hungerListener)listener).enterKood(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hungerListener ) ((hungerListener)listener).exitKood(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hungerVisitor ) return ((hungerVisitor<? extends T>)visitor).visitKood(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KoodContext kood() throws RecognitionException {
		KoodContext _localctx = new KoodContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_kood);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20); lause();
			setState(21); match(20);
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

	public static class LauseContext extends ParserRuleContext {
		public KilogramContext kilogram() {
			return getRuleContext(KilogramContext.class,0);
		}
		public OmistamineContext omistamine() {
			return getRuleContext(OmistamineContext.class,0);
		}
		public NewRecipeContext newRecipe() {
			return getRuleContext(NewRecipeContext.class,0);
		}
		public DefineerimineContext defineerimine() {
			return getRuleContext(DefineerimineContext.class,0);
		}
		public LauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hungerListener ) ((hungerListener)listener).enterLause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hungerListener ) ((hungerListener)listener).exitLause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hungerVisitor ) return ((hungerVisitor<? extends T>)visitor).visitLause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LauseContext lause() throws RecognitionException {
		LauseContext _localctx = new LauseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_lause);
		try {
			setState(28);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(23); newRecipe();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(24); omistamine();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(25); defineerimine();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(26); kilogram();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
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

	public static class NewRecipeContext extends ParserRuleContext {
		public List<TerminalNode> String() { return getTokens(hungerParser.String); }
		public OmistamineContext omistamine(int i) {
			return getRuleContext(OmistamineContext.class,i);
		}
		public TerminalNode String(int i) {
			return getToken(hungerParser.String, i);
		}
		public List<OmistamineContext> omistamine() {
			return getRuleContexts(OmistamineContext.class);
		}
		public List<TerminalNode> Number() { return getTokens(hungerParser.Number); }
		public RecipeNameContext recipeName() {
			return getRuleContext(RecipeNameContext.class,0);
		}
		public TerminalNode Number(int i) {
			return getToken(hungerParser.Number, i);
		}
		public NewRecipeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newRecipe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hungerListener ) ((hungerListener)listener).enterNewRecipe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hungerListener ) ((hungerListener)listener).exitNewRecipe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hungerVisitor ) return ((hungerVisitor<? extends T>)visitor).visitNewRecipe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewRecipeContext newRecipe() throws RecognitionException {
		NewRecipeContext _localctx = new NewRecipeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_newRecipe);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(30); match(25);
			setState(31); match(3);
			setState(32); recipeName();
			setState(38); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(33); match(2);
					setState(36);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						setState(34); omistamine();
						}
						break;

					case 2:
						{
						setState(35); match(String);
						}
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(40); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
			setState(46);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(42); match(2);
				setState(43); match(7);
				setState(44); match(18);
				setState(45); match(Number);
				}
				break;
			}
			setState(52);
			_la = _input.LA(1);
			if (_la==2) {
				{
				setState(48); match(2);
				setState(49); match(14);
				setState(50); match(18);
				setState(51); match(Number);
				}
			}

			setState(54); match(13);
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

	public static class NewFoodContext extends ParserRuleContext {
		public List<TerminalNode> String() { return getTokens(hungerParser.String); }
		public OmistamineContext omistamine(int i) {
			return getRuleContext(OmistamineContext.class,i);
		}
		public TerminalNode String(int i) {
			return getToken(hungerParser.String, i);
		}
		public List<OmistamineContext> omistamine() {
			return getRuleContexts(OmistamineContext.class);
		}
		public NewFoodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newFood; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hungerListener ) ((hungerListener)listener).enterNewFood(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hungerListener ) ((hungerListener)listener).exitNewFood(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hungerVisitor ) return ((hungerVisitor<? extends T>)visitor).visitNewFood(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewFoodContext newFood() throws RecognitionException {
		NewFoodContext _localctx = new NewFoodContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_newFood);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56); match(16);
			setState(57); match(3);
			setState(60); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(60);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(58); omistamine();
					}
					break;

				case 2:
					{
					setState(59); match(String);
					}
					break;
				}
				}
				setState(62); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 10) | (1L << 15) | (1L << 17) | (1L << 19) | (1L << 21) | (1L << 23) | (1L << String))) != 0) );
			setState(65);
			_la = _input.LA(1);
			if (_la==1 || _la==11) {
				{
				setState(64);
				_la = _input.LA(1);
				if ( !(_la==1 || _la==11) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(67); match(13);
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

	public static class OmistamineContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(hungerParser.String, 0); }
		public KilogramContext kilogram() {
			return getRuleContext(KilogramContext.class,0);
		}
		public TerminalNode Number() { return getToken(hungerParser.Number, 0); }
		public LitreContext litre() {
			return getRuleContext(LitreContext.class,0);
		}
		public PieceContext piece() {
			return getRuleContext(PieceContext.class,0);
		}
		public OmistamineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_omistamine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hungerListener ) ((hungerListener)listener).enterOmistamine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hungerListener ) ((hungerListener)listener).exitOmistamine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hungerVisitor ) return ((hungerVisitor<? extends T>)visitor).visitOmistamine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OmistamineContext omistamine() throws RecognitionException {
		OmistamineContext _localctx = new OmistamineContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_omistamine);
		int _la;
		try {
			setState(90);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				switch (_input.LA(1)) {
				case String:
					{
					setState(69); match(String);
					}
					break;
				case 5:
				case 19:
				case 23:
					{
					setState(70); kilogram();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(73); match(18);
				setState(74); match(Number);
				setState(75);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 8) | (1L << 12) | (1L << 26))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				switch (_input.LA(1)) {
				case String:
					{
					setState(76); match(String);
					}
					break;
				case 15:
					{
					setState(77); piece();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(80); match(18);
				setState(81); match(Number);
				setState(82); match(22);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
				switch (_input.LA(1)) {
				case String:
					{
					setState(83); match(String);
					}
					break;
				case 10:
				case 17:
				case 21:
					{
					setState(84); litre();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(87); match(18);
				setState(88); match(Number);
				setState(89);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 6) | (1L << 24))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
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

	public static class DefineerimineContext extends ParserRuleContext {
		public KilogramContext kilogram() {
			return getRuleContext(KilogramContext.class,0);
		}
		public PieceContext piece() {
			return getRuleContext(PieceContext.class,0);
		}
		public LitreContext litre() {
			return getRuleContext(LitreContext.class,0);
		}
		public DefineerimineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defineerimine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hungerListener ) ((hungerListener)listener).enterDefineerimine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hungerListener ) ((hungerListener)listener).exitDefineerimine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hungerVisitor ) return ((hungerVisitor<? extends T>)visitor).visitDefineerimine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefineerimineContext defineerimine() throws RecognitionException {
		DefineerimineContext _localctx = new DefineerimineContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_defineerimine);
		try {
			setState(95);
			switch (_input.LA(1)) {
			case 5:
			case 19:
			case 23:
				enterOuterAlt(_localctx, 1);
				{
				setState(92); kilogram();
				}
				break;
			case 10:
			case 17:
			case 21:
				enterOuterAlt(_localctx, 2);
				{
				setState(93); litre();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 3);
				{
				setState(94); piece();
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

	public static class KilogramContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(hungerParser.String, 0); }
		public KilogramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kilogram; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hungerListener ) ((hungerListener)listener).enterKilogram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hungerListener ) ((hungerListener)listener).exitKilogram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hungerVisitor ) return ((hungerVisitor<? extends T>)visitor).visitKilogram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KilogramContext kilogram() throws RecognitionException {
		KilogramContext _localctx = new KilogramContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_kilogram);
		try {
			setState(103);
			switch (_input.LA(1)) {
			case 23:
				enterOuterAlt(_localctx, 1);
				{
				setState(97); match(23);
				setState(98); match(String);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 2);
				{
				setState(99); match(19);
				setState(100); match(String);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 3);
				{
				setState(101); match(5);
				setState(102); match(String);
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

	public static class LitreContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(hungerParser.String, 0); }
		public LitreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_litre; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hungerListener ) ((hungerListener)listener).enterLitre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hungerListener ) ((hungerListener)listener).exitLitre(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hungerVisitor ) return ((hungerVisitor<? extends T>)visitor).visitLitre(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LitreContext litre() throws RecognitionException {
		LitreContext _localctx = new LitreContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_litre);
		try {
			setState(111);
			switch (_input.LA(1)) {
			case 21:
				enterOuterAlt(_localctx, 1);
				{
				setState(105); match(21);
				setState(106); match(String);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 2);
				{
				setState(107); match(10);
				setState(108); match(String);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 3);
				{
				setState(109); match(17);
				setState(110); match(String);
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

	public static class PieceContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(hungerParser.String, 0); }
		public PieceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_piece; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hungerListener ) ((hungerListener)listener).enterPiece(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hungerListener ) ((hungerListener)listener).exitPiece(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hungerVisitor ) return ((hungerVisitor<? extends T>)visitor).visitPiece(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PieceContext piece() throws RecognitionException {
		PieceContext _localctx = new PieceContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_piece);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113); match(15);
			setState(114); match(String);
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

	public static class RecipeNameContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(hungerParser.String, 0); }
		public RecipeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recipeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hungerListener ) ((hungerListener)listener).enterRecipeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hungerListener ) ((hungerListener)listener).exitRecipeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hungerVisitor ) return ((hungerVisitor<? extends T>)visitor).visitRecipeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecipeNameContext recipeName() throws RecognitionException {
		RecipeNameContext _localctx = new RecipeNameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_recipeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116); match(9);
			setState(117); match(String);
			setState(118); match(9);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\37{\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3\37\n\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4"+
		"\'\n\4\6\4)\n\4\r\4\16\4*\3\4\3\4\3\4\3\4\5\4\61\n\4\3\4\3\4\3\4\3\4\5"+
		"\4\67\n\4\3\4\3\4\3\5\3\5\3\5\3\5\6\5?\n\5\r\5\16\5@\3\5\5\5D\n\5\3\5"+
		"\3\5\3\6\3\6\5\6J\n\6\3\6\3\6\3\6\3\6\3\6\5\6Q\n\6\3\6\3\6\3\6\3\6\3\6"+
		"\5\6X\n\6\3\6\3\6\3\6\5\6]\n\6\3\7\3\7\3\7\5\7b\n\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\5\bj\n\b\3\t\3\t\3\t\3\t\3\t\3\t\5\tr\n\t\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24\2\5\4\2\3\3\r\r\5\2\n\n"+
		"\16\16\34\34\5\2\6\6\b\b\32\32\u0086\2\26\3\2\2\2\4\36\3\2\2\2\6 \3\2"+
		"\2\2\b:\3\2\2\2\n\\\3\2\2\2\fa\3\2\2\2\16i\3\2\2\2\20q\3\2\2\2\22s\3\2"+
		"\2\2\24v\3\2\2\2\26\27\5\4\3\2\27\30\7\26\2\2\30\3\3\2\2\2\31\37\5\6\4"+
		"\2\32\37\5\n\6\2\33\37\5\f\7\2\34\37\5\16\b\2\35\37\3\2\2\2\36\31\3\2"+
		"\2\2\36\32\3\2\2\2\36\33\3\2\2\2\36\34\3\2\2\2\36\35\3\2\2\2\37\5\3\2"+
		"\2\2 !\7\33\2\2!\"\7\5\2\2\"(\5\24\13\2#&\7\4\2\2$\'\5\n\6\2%\'\7\36\2"+
		"\2&$\3\2\2\2&%\3\2\2\2\')\3\2\2\2(#\3\2\2\2)*\3\2\2\2*(\3\2\2\2*+\3\2"+
		"\2\2+\60\3\2\2\2,-\7\4\2\2-.\7\t\2\2./\7\24\2\2/\61\7\35\2\2\60,\3\2\2"+
		"\2\60\61\3\2\2\2\61\66\3\2\2\2\62\63\7\4\2\2\63\64\7\20\2\2\64\65\7\24"+
		"\2\2\65\67\7\35\2\2\66\62\3\2\2\2\66\67\3\2\2\2\678\3\2\2\289\7\17\2\2"+
		"9\7\3\2\2\2:;\7\22\2\2;>\7\5\2\2<?\5\n\6\2=?\7\36\2\2><\3\2\2\2>=\3\2"+
		"\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2AC\3\2\2\2BD\t\2\2\2CB\3\2\2\2CD\3\2"+
		"\2\2DE\3\2\2\2EF\7\17\2\2F\t\3\2\2\2GJ\7\36\2\2HJ\5\16\b\2IG\3\2\2\2I"+
		"H\3\2\2\2JK\3\2\2\2KL\7\24\2\2LM\7\35\2\2M]\t\3\2\2NQ\7\36\2\2OQ\5\22"+
		"\n\2PN\3\2\2\2PO\3\2\2\2QR\3\2\2\2RS\7\24\2\2ST\7\35\2\2T]\7\30\2\2UX"+
		"\7\36\2\2VX\5\20\t\2WU\3\2\2\2WV\3\2\2\2XY\3\2\2\2YZ\7\24\2\2Z[\7\35\2"+
		"\2[]\t\4\2\2\\I\3\2\2\2\\P\3\2\2\2\\W\3\2\2\2]\13\3\2\2\2^b\5\16\b\2_"+
		"b\5\20\t\2`b\5\22\n\2a^\3\2\2\2a_\3\2\2\2a`\3\2\2\2b\r\3\2\2\2cd\7\31"+
		"\2\2dj\7\36\2\2ef\7\25\2\2fj\7\36\2\2gh\7\7\2\2hj\7\36\2\2ic\3\2\2\2i"+
		"e\3\2\2\2ig\3\2\2\2j\17\3\2\2\2kl\7\27\2\2lr\7\36\2\2mn\7\f\2\2nr\7\36"+
		"\2\2op\7\23\2\2pr\7\36\2\2qk\3\2\2\2qm\3\2\2\2qo\3\2\2\2r\21\3\2\2\2s"+
		"t\7\21\2\2tu\7\36\2\2u\23\3\2\2\2vw\7\13\2\2wx\7\36\2\2xy\7\13\2\2y\25"+
		"\3\2\2\2\21\36&*\60\66>@CIPW\\aiq";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}