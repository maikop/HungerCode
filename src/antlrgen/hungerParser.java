// Generated from hunger.g4 by ANTLR 4.2
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
		T__24=1, T__23=2, T__22=3, T__21=4, T__20=5, T__19=6, T__18=7, T__17=8, 
		T__16=9, T__15=10, T__14=11, T__13=12, T__12=13, T__11=14, T__10=15, T__9=16, 
		T__8=17, T__7=18, T__6=19, T__5=20, T__4=21, T__3=22, T__2=23, T__1=24, 
		T__0=25, Number=26, String=27, Whitespace=28;
	public static final String[] tokenNames = {
		"<INVALID>", "'True'", "'Decilitre'", "'False'", "'kg'", "')'", "'star'", 
		"','", "'Piece'", "'newFood'", "'('", "'='", "'dl'", "'Millilitre'", "'Gram'", 
		"'Milligram'", "'Litre'", "'l'", "'pc'", "'servings'", "'newRecipe'", 
		"'ml'", "'Kilogram'", "'mg'", "'\"'", "'g'", "Number", "String", "Whitespace"
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
		public RecipeNameContext recipeName() {
			return getRuleContext(RecipeNameContext.class,0);
		}
		public PieceContext piece() {
			return getRuleContext(PieceContext.class,0);
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
			setState(29);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(22); newRecipe();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(23); omistamine();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(24); defineerimine();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(25); kilogram();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(26); piece();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(27); recipeName();
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
			setState(31); match(20);
			setState(32); match(10);
			setState(33); recipeName();
			setState(39); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(34); match(7);
					setState(37);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						setState(35); omistamine();
						}
						break;

					case 2:
						{
						setState(36); match(String);
						}
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(41); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			setState(47);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(43); match(7);
				setState(44); match(19);
				setState(45); match(11);
				setState(46); match(Number);
				}
				break;
			}
			setState(53);
			_la = _input.LA(1);
			if (_la==7) {
				{
				setState(49); match(7);
				setState(50); match(6);
				setState(51); match(11);
				setState(52); match(Number);
				}
			}

			setState(55); match(5);
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
			setState(57); match(9);
			setState(58); match(10);
			setState(61); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(61);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(59); omistamine();
					}
					break;

				case 2:
					{
					setState(60); match(String);
					}
					break;
				}
				}
				setState(63); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 8) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 22) | (1L << String))) != 0) );
			setState(66);
			_la = _input.LA(1);
			if (_la==1 || _la==3) {
				{
				setState(65);
				_la = _input.LA(1);
				if ( !(_la==1 || _la==3) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(68); match(5);
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
			setState(91);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				switch (_input.LA(1)) {
				case String:
					{
					setState(70); match(String);
					}
					break;
				case 14:
				case 15:
				case 22:
					{
					setState(71); kilogram();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(74); match(11);
				setState(75); match(Number);
				setState(76);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 23) | (1L << 25))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				switch (_input.LA(1)) {
				case String:
					{
					setState(77); match(String);
					}
					break;
				case 8:
					{
					setState(78); piece();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(81); match(11);
				setState(82); match(Number);
				setState(83); match(18);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				switch (_input.LA(1)) {
				case String:
					{
					setState(84); match(String);
					}
					break;
				case 2:
				case 13:
				case 16:
					{
					setState(85); litre();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(88); match(11);
				setState(89); match(Number);
				setState(90);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 12) | (1L << 17) | (1L << 21))) != 0)) ) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hungerVisitor ) return ((hungerVisitor<? extends T>)visitor).visitDefineerimine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefineerimineContext defineerimine() throws RecognitionException {
		DefineerimineContext _localctx = new DefineerimineContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_defineerimine);
		try {
			setState(96);
			switch (_input.LA(1)) {
			case 14:
			case 15:
			case 22:
				enterOuterAlt(_localctx, 1);
				{
				setState(93); kilogram();
				}
				break;
			case 2:
			case 13:
			case 16:
				enterOuterAlt(_localctx, 2);
				{
				setState(94); litre();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 3);
				{
				setState(95); piece();
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
			setState(104);
			switch (_input.LA(1)) {
			case 22:
				enterOuterAlt(_localctx, 1);
				{
				setState(98); match(22);
				setState(99); match(String);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 2);
				{
				setState(100); match(14);
				setState(101); match(String);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 3);
				{
				setState(102); match(15);
				setState(103); match(String);
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
			setState(112);
			switch (_input.LA(1)) {
			case 16:
				enterOuterAlt(_localctx, 1);
				{
				setState(106); match(16);
				setState(107); match(String);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108); match(2);
				setState(109); match(String);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 3);
				{
				setState(110); match(13);
				setState(111); match(String);
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
			setState(114); match(8);
			setState(115); match(String);
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
			setState(117); match(24);
			setState(118); match(String);
			setState(119); match(24);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\36|\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3 \n\3\3\4\3\4\3\4\3\4\3\4\3\4\5"+
		"\4(\n\4\6\4*\n\4\r\4\16\4+\3\4\3\4\3\4\3\4\5\4\62\n\4\3\4\3\4\3\4\3\4"+
		"\5\48\n\4\3\4\3\4\3\5\3\5\3\5\3\5\6\5@\n\5\r\5\16\5A\3\5\5\5E\n\5\3\5"+
		"\3\5\3\6\3\6\5\6K\n\6\3\6\3\6\3\6\3\6\3\6\5\6R\n\6\3\6\3\6\3\6\3\6\3\6"+
		"\5\6Y\n\6\3\6\3\6\3\6\5\6^\n\6\3\7\3\7\3\7\5\7c\n\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\5\bk\n\b\3\t\3\t\3\t\3\t\3\t\3\t\5\ts\n\t\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24\2\5\4\2\3\3\5\5\5\2\6\6"+
		"\31\31\33\33\5\2\16\16\23\23\27\27\u0089\2\26\3\2\2\2\4\37\3\2\2\2\6!"+
		"\3\2\2\2\b;\3\2\2\2\n]\3\2\2\2\fb\3\2\2\2\16j\3\2\2\2\20r\3\2\2\2\22t"+
		"\3\2\2\2\24w\3\2\2\2\26\27\5\4\3\2\27\3\3\2\2\2\30 \5\6\4\2\31 \5\n\6"+
		"\2\32 \5\f\7\2\33 \5\16\b\2\34 \5\22\n\2\35 \5\24\13\2\36 \3\2\2\2\37"+
		"\30\3\2\2\2\37\31\3\2\2\2\37\32\3\2\2\2\37\33\3\2\2\2\37\34\3\2\2\2\37"+
		"\35\3\2\2\2\37\36\3\2\2\2 \5\3\2\2\2!\"\7\26\2\2\"#\7\f\2\2#)\5\24\13"+
		"\2$\'\7\t\2\2%(\5\n\6\2&(\7\35\2\2\'%\3\2\2\2\'&\3\2\2\2(*\3\2\2\2)$\3"+
		"\2\2\2*+\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\61\3\2\2\2-.\7\t\2\2./\7\25\2\2"+
		"/\60\7\r\2\2\60\62\7\34\2\2\61-\3\2\2\2\61\62\3\2\2\2\62\67\3\2\2\2\63"+
		"\64\7\t\2\2\64\65\7\b\2\2\65\66\7\r\2\2\668\7\34\2\2\67\63\3\2\2\2\67"+
		"8\3\2\2\289\3\2\2\29:\7\7\2\2:\7\3\2\2\2;<\7\13\2\2<?\7\f\2\2=@\5\n\6"+
		"\2>@\7\35\2\2?=\3\2\2\2?>\3\2\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2"+
		"\2\2CE\t\2\2\2DC\3\2\2\2DE\3\2\2\2EF\3\2\2\2FG\7\7\2\2G\t\3\2\2\2HK\7"+
		"\35\2\2IK\5\16\b\2JH\3\2\2\2JI\3\2\2\2KL\3\2\2\2LM\7\r\2\2MN\7\34\2\2"+
		"N^\t\3\2\2OR\7\35\2\2PR\5\22\n\2QO\3\2\2\2QP\3\2\2\2RS\3\2\2\2ST\7\r\2"+
		"\2TU\7\34\2\2U^\7\24\2\2VY\7\35\2\2WY\5\20\t\2XV\3\2\2\2XW\3\2\2\2YZ\3"+
		"\2\2\2Z[\7\r\2\2[\\\7\34\2\2\\^\t\4\2\2]J\3\2\2\2]Q\3\2\2\2]X\3\2\2\2"+
		"^\13\3\2\2\2_c\5\16\b\2`c\5\20\t\2ac\5\22\n\2b_\3\2\2\2b`\3\2\2\2ba\3"+
		"\2\2\2c\r\3\2\2\2de\7\30\2\2ek\7\35\2\2fg\7\20\2\2gk\7\35\2\2hi\7\21\2"+
		"\2ik\7\35\2\2jd\3\2\2\2jf\3\2\2\2jh\3\2\2\2k\17\3\2\2\2lm\7\22\2\2ms\7"+
		"\35\2\2no\7\4\2\2os\7\35\2\2pq\7\17\2\2qs\7\35\2\2rl\3\2\2\2rn\3\2\2\2"+
		"rp\3\2\2\2s\21\3\2\2\2tu\7\n\2\2uv\7\35\2\2v\23\3\2\2\2wx\7\32\2\2xy\7"+
		"\35\2\2yz\7\32\2\2z\25\3\2\2\2\21\37\'+\61\67?ADJQX]bjr";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}