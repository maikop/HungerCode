// Generated from hunger.g4 by ANTLR 4.2.2
package antlrgen;
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
		public LauseContext lause(int i) {
			return getRuleContext(LauseContext.class,i);
		}
		public List<LauseContext> lause() {
			return getRuleContexts(LauseContext.class);
		}
		public KoodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kood; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hungerVisitor ) return ((hungerVisitor<? extends T>)visitor).visitKood(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KoodContext kood() throws RecognitionException {
		KoodContext _localctx = new KoodContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_kood);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(20); lause();
				setState(21); match(20);
				}
				}
				setState(25); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 9) | (1L << 10) | (1L << 15) | (1L << 16) | (1L << 17) | (1L << 19) | (1L << 21) | (1L << 23) | (1L << 25) | (1L << String))) != 0) );
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
		public NewFoodContext newFood() {
			return getRuleContext(NewFoodContext.class,0);
		}
		public OmistamineContext omistamine() {
			return getRuleContext(OmistamineContext.class,0);
		}
		public NewRecipeContext newRecipe() {
			return getRuleContext(NewRecipeContext.class,0);
		}
		public RecipeNameContext recipeName() {
			return getRuleContext(RecipeNameContext.class,0);
		}
		public DefineerimineContext defineerimine() {
			return getRuleContext(DefineerimineContext.class,0);
		}
		public LauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lause; }
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
			setState(32);
			switch (_input.LA(1)) {
			case 25:
				enterOuterAlt(_localctx, 1);
				{
				setState(27); newRecipe();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 2);
				{
				setState(28); newFood();
				}
				break;
			case String:
				enterOuterAlt(_localctx, 3);
				{
				setState(29); omistamine();
				}
				break;
			case 5:
			case 10:
			case 15:
			case 17:
			case 19:
			case 21:
			case 23:
				enterOuterAlt(_localctx, 4);
				{
				setState(30); defineerimine();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 5);
				{
				setState(31); recipeName();
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

	public static class NewRecipeContext extends ParserRuleContext {
		public OmistamineContext omistamine(int i) {
			return getRuleContext(OmistamineContext.class,i);
		}
		public List<TerminalNode> Number() { return getTokens(hungerParser.Number); }
		public List<OmistamineContext> omistamine() {
			return getRuleContexts(OmistamineContext.class);
		}
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
			setState(34); match(25);
			setState(35); match(3);
			setState(36); recipeName();
			setState(39); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(37); match(2);
					setState(38); omistamine();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(41); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
			setState(47);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(43); match(2);
				setState(44); match(7);
				setState(45); match(18);
				setState(46); match(Number);
				}
				break;
			}
			setState(53);
			_la = _input.LA(1);
			if (_la==2) {
				{
				setState(49); match(2);
				setState(50); match(14);
				setState(51); match(18);
				setState(52); match(Number);
				}
			}

			setState(55); match(13);
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
		public TerminalNode String(int i) {
			return getToken(hungerParser.String, i);
		}
		public NewFoodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newFood; }
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(57); match(16);
			setState(58); match(3);
			setState(59); match(String);
			setState(64);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(60); match(2);
					setState(61); match(String);
					}
					} 
				}
				setState(66);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(69);
			_la = _input.LA(1);
			if (_la==2) {
				{
				setState(67); match(2);
				setState(68);
				_la = _input.LA(1);
				if ( !(_la==1 || _la==11) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(71); match(13);
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
		public TerminalNode Number() { return getToken(hungerParser.Number, 0); }
		public OmistamineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_omistamine; }
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
			setState(85);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(73); match(String);
				}
				setState(74); match(18);
				setState(75); match(Number);
				setState(76);
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
				{
				setState(77); match(String);
				}
				setState(78); match(18);
				setState(79); match(Number);
				setState(80); match(22);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(81); match(String);
				}
				setState(82); match(18);
				setState(83); match(Number);
				setState(84);
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
		public TerminalNode Number() { return getToken(hungerParser.Number, 0); }
		public LitreContext litre() {
			return getRuleContext(LitreContext.class,0);
		}
		public PieceContext piece() {
			return getRuleContext(PieceContext.class,0);
		}
		public DefineerimineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defineerimine; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hungerVisitor ) return ((hungerVisitor<? extends T>)visitor).visitDefineerimine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefineerimineContext defineerimine() throws RecognitionException {
		DefineerimineContext _localctx = new DefineerimineContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_defineerimine);
		int _la;
		try {
			setState(102);
			switch (_input.LA(1)) {
			case 5:
			case 19:
			case 23:
				enterOuterAlt(_localctx, 1);
				{
				setState(87); kilogram();
				setState(88); match(18);
				setState(89); match(Number);
				setState(90);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 8) | (1L << 12) | (1L << 26))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 2);
				{
				setState(92); piece();
				setState(93); match(18);
				setState(94); match(Number);
				setState(95); match(22);
				}
				break;
			case 10:
			case 17:
			case 21:
				enterOuterAlt(_localctx, 3);
				{
				setState(97); litre();
				setState(98); match(18);
				setState(99); match(Number);
				setState(100);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 6) | (1L << 24))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hungerVisitor ) return ((hungerVisitor<? extends T>)visitor).visitKilogram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KilogramContext kilogram() throws RecognitionException {
		KilogramContext _localctx = new KilogramContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_kilogram);
		try {
			setState(110);
			switch (_input.LA(1)) {
			case 23:
				enterOuterAlt(_localctx, 1);
				{
				setState(104); match(23);
				setState(105); match(String);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 2);
				{
				setState(106); match(19);
				setState(107); match(String);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 3);
				{
				setState(108); match(5);
				setState(109); match(String);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hungerVisitor ) return ((hungerVisitor<? extends T>)visitor).visitLitre(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LitreContext litre() throws RecognitionException {
		LitreContext _localctx = new LitreContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_litre);
		try {
			setState(118);
			switch (_input.LA(1)) {
			case 21:
				enterOuterAlt(_localctx, 1);
				{
				setState(112); match(21);
				setState(113); match(String);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 2);
				{
				setState(114); match(10);
				setState(115); match(String);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 3);
				{
				setState(116); match(17);
				setState(117); match(String);
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
			setState(120); match(15);
			setState(121); match(String);
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
			setState(123); match(9);
			setState(124); match(String);
			setState(125); match(9);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\37\u0082\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\3\2\3\2\3\2\6\2\32\n\2\r\2\16\2\33\3\3\3\3\3\3\3\3\3\3\5\3#\n\3"+
		"\3\4\3\4\3\4\3\4\3\4\6\4*\n\4\r\4\16\4+\3\4\3\4\3\4\3\4\5\4\62\n\4\3\4"+
		"\3\4\3\4\3\4\5\48\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\7\5A\n\5\f\5\16\5D\13"+
		"\5\3\5\3\5\5\5H\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\5\6X\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\5\7i\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\bq\n\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\5\ty\n\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\2\2\f\2\4\6\b\n\f\16"+
		"\20\22\24\2\5\4\2\3\3\r\r\5\2\n\n\16\16\34\34\5\2\6\6\b\b\32\32\u0089"+
		"\2\31\3\2\2\2\4\"\3\2\2\2\6$\3\2\2\2\b;\3\2\2\2\nW\3\2\2\2\fh\3\2\2\2"+
		"\16p\3\2\2\2\20x\3\2\2\2\22z\3\2\2\2\24}\3\2\2\2\26\27\5\4\3\2\27\30\7"+
		"\26\2\2\30\32\3\2\2\2\31\26\3\2\2\2\32\33\3\2\2\2\33\31\3\2\2\2\33\34"+
		"\3\2\2\2\34\3\3\2\2\2\35#\5\6\4\2\36#\5\b\5\2\37#\5\n\6\2 #\5\f\7\2!#"+
		"\5\24\13\2\"\35\3\2\2\2\"\36\3\2\2\2\"\37\3\2\2\2\" \3\2\2\2\"!\3\2\2"+
		"\2#\5\3\2\2\2$%\7\33\2\2%&\7\5\2\2&)\5\24\13\2\'(\7\4\2\2(*\5\n\6\2)\'"+
		"\3\2\2\2*+\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\61\3\2\2\2-.\7\4\2\2./\7\t\2\2"+
		"/\60\7\24\2\2\60\62\7\35\2\2\61-\3\2\2\2\61\62\3\2\2\2\62\67\3\2\2\2\63"+
		"\64\7\4\2\2\64\65\7\20\2\2\65\66\7\24\2\2\668\7\35\2\2\67\63\3\2\2\2\67"+
		"8\3\2\2\289\3\2\2\29:\7\17\2\2:\7\3\2\2\2;<\7\22\2\2<=\7\5\2\2=B\7\36"+
		"\2\2>?\7\4\2\2?A\7\36\2\2@>\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2CG\3"+
		"\2\2\2DB\3\2\2\2EF\7\4\2\2FH\t\2\2\2GE\3\2\2\2GH\3\2\2\2HI\3\2\2\2IJ\7"+
		"\17\2\2J\t\3\2\2\2KL\7\36\2\2LM\7\24\2\2MN\7\35\2\2NX\t\3\2\2OP\7\36\2"+
		"\2PQ\7\24\2\2QR\7\35\2\2RX\7\30\2\2ST\7\36\2\2TU\7\24\2\2UV\7\35\2\2V"+
		"X\t\4\2\2WK\3\2\2\2WO\3\2\2\2WS\3\2\2\2X\13\3\2\2\2YZ\5\16\b\2Z[\7\24"+
		"\2\2[\\\7\35\2\2\\]\t\3\2\2]i\3\2\2\2^_\5\22\n\2_`\7\24\2\2`a\7\35\2\2"+
		"ab\7\30\2\2bi\3\2\2\2cd\5\20\t\2de\7\24\2\2ef\7\35\2\2fg\t\4\2\2gi\3\2"+
		"\2\2hY\3\2\2\2h^\3\2\2\2hc\3\2\2\2i\r\3\2\2\2jk\7\31\2\2kq\7\36\2\2lm"+
		"\7\25\2\2mq\7\36\2\2no\7\7\2\2oq\7\36\2\2pj\3\2\2\2pl\3\2\2\2pn\3\2\2"+
		"\2q\17\3\2\2\2rs\7\27\2\2sy\7\36\2\2tu\7\f\2\2uy\7\36\2\2vw\7\23\2\2w"+
		"y\7\36\2\2xr\3\2\2\2xt\3\2\2\2xv\3\2\2\2y\21\3\2\2\2z{\7\21\2\2{|\7\36"+
		"\2\2|\23\3\2\2\2}~\7\13\2\2~\177\7\36\2\2\177\u0080\7\13\2\2\u0080\25"+
		"\3\2\2\2\r\33\"+\61\67BGWhpx";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}