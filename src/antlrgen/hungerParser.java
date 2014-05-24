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
			setState(27);
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
				setState(23); newFood();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(24); omistamine();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(25); defineerimine();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(26); recipeName();
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
		public TerminalNode String(int i) {
			return getToken(hungerParser.String, i);
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
			setState(29); match(20);
			setState(30); match(10);
			setState(31); recipeName();
			setState(34); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(32); match(7);
					setState(33); match(String);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(36); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
			setState(42);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(38); match(7);
				setState(39); match(19);
				setState(40); match(11);
				setState(41); match(Number);
				}
				break;
			}
			setState(48);
			_la = _input.LA(1);
			if (_la==7) {
				{
				setState(44); match(7);
				setState(45); match(6);
				setState(46); match(11);
				setState(47); match(Number);
				}
			}

			setState(50); match(5);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(52); match(9);
			setState(53); match(10);
			setState(54); match(String);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==7) {
				{
				{
				setState(55); match(7);
				setState(56); match(String);
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
			_la = _input.LA(1);
			if (_la==1 || _la==3) {
				{
				setState(62);
				_la = _input.LA(1);
				if ( !(_la==1 || _la==3) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(65); match(5);
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
			setState(88);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				switch (_input.LA(1)) {
				case String:
					{
					setState(67); match(String);
					}
					break;
				case 14:
				case 15:
				case 22:
					{
					setState(68); kilogram();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(71); match(11);
				setState(72); match(Number);
				setState(73);
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
				setState(76);
				switch (_input.LA(1)) {
				case String:
					{
					setState(74); match(String);
					}
					break;
				case 8:
					{
					setState(75); piece();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(78); match(11);
				setState(79); match(Number);
				setState(80); match(18);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				switch (_input.LA(1)) {
				case String:
					{
					setState(81); match(String);
					}
					break;
				case 2:
				case 13:
				case 16:
					{
					setState(82); litre();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(85); match(11);
				setState(86); match(Number);
				setState(87);
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
			setState(93);
			switch (_input.LA(1)) {
			case 14:
			case 15:
			case 22:
				enterOuterAlt(_localctx, 1);
				{
				setState(90); kilogram();
				}
				break;
			case 2:
			case 13:
			case 16:
				enterOuterAlt(_localctx, 2);
				{
				setState(91); litre();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 3);
				{
				setState(92); piece();
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
			setState(101);
			switch (_input.LA(1)) {
			case 22:
				enterOuterAlt(_localctx, 1);
				{
				setState(95); match(22);
				setState(96); match(String);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 2);
				{
				setState(97); match(14);
				setState(98); match(String);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 3);
				{
				setState(99); match(15);
				setState(100); match(String);
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
			setState(109);
			switch (_input.LA(1)) {
			case 16:
				enterOuterAlt(_localctx, 1);
				{
				setState(103); match(16);
				setState(104); match(String);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105); match(2);
				setState(106); match(String);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 3);
				{
				setState(107); match(13);
				setState(108); match(String);
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
			setState(111); match(8);
			setState(112); match(String);
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
			setState(114); match(24);
			setState(115); match(String);
			setState(116); match(24);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\36y\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3\36\n\3\3\4\3\4\3\4\3\4\3\4\6\4%\n\4\r\4"+
		"\16\4&\3\4\3\4\3\4\3\4\5\4-\n\4\3\4\3\4\3\4\3\4\5\4\63\n\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\7\5<\n\5\f\5\16\5?\13\5\3\5\5\5B\n\5\3\5\3\5\3\6\3\6"+
		"\5\6H\n\6\3\6\3\6\3\6\3\6\3\6\5\6O\n\6\3\6\3\6\3\6\3\6\3\6\5\6V\n\6\3"+
		"\6\3\6\3\6\5\6[\n\6\3\7\3\7\3\7\5\7`\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\bh"+
		"\n\b\3\t\3\t\3\t\3\t\3\t\3\t\5\tp\n\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24\2\5\4\2\3\3\5\5\5\2\6\6\31\31\33\33"+
		"\5\2\16\16\23\23\27\27\u0082\2\26\3\2\2\2\4\35\3\2\2\2\6\37\3\2\2\2\b"+
		"\66\3\2\2\2\nZ\3\2\2\2\f_\3\2\2\2\16g\3\2\2\2\20o\3\2\2\2\22q\3\2\2\2"+
		"\24t\3\2\2\2\26\27\5\4\3\2\27\3\3\2\2\2\30\36\5\6\4\2\31\36\5\b\5\2\32"+
		"\36\5\n\6\2\33\36\5\f\7\2\34\36\5\24\13\2\35\30\3\2\2\2\35\31\3\2\2\2"+
		"\35\32\3\2\2\2\35\33\3\2\2\2\35\34\3\2\2\2\36\5\3\2\2\2\37 \7\26\2\2 "+
		"!\7\f\2\2!$\5\24\13\2\"#\7\t\2\2#%\7\35\2\2$\"\3\2\2\2%&\3\2\2\2&$\3\2"+
		"\2\2&\'\3\2\2\2\',\3\2\2\2()\7\t\2\2)*\7\25\2\2*+\7\r\2\2+-\7\34\2\2,"+
		"(\3\2\2\2,-\3\2\2\2-\62\3\2\2\2./\7\t\2\2/\60\7\b\2\2\60\61\7\r\2\2\61"+
		"\63\7\34\2\2\62.\3\2\2\2\62\63\3\2\2\2\63\64\3\2\2\2\64\65\7\7\2\2\65"+
		"\7\3\2\2\2\66\67\7\13\2\2\678\7\f\2\28=\7\35\2\29:\7\t\2\2:<\7\35\2\2"+
		";9\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>A\3\2\2\2?=\3\2\2\2@B\t\2\2\2"+
		"A@\3\2\2\2AB\3\2\2\2BC\3\2\2\2CD\7\7\2\2D\t\3\2\2\2EH\7\35\2\2FH\5\16"+
		"\b\2GE\3\2\2\2GF\3\2\2\2HI\3\2\2\2IJ\7\r\2\2JK\7\34\2\2K[\t\3\2\2LO\7"+
		"\35\2\2MO\5\22\n\2NL\3\2\2\2NM\3\2\2\2OP\3\2\2\2PQ\7\r\2\2QR\7\34\2\2"+
		"R[\7\24\2\2SV\7\35\2\2TV\5\20\t\2US\3\2\2\2UT\3\2\2\2VW\3\2\2\2WX\7\r"+
		"\2\2XY\7\34\2\2Y[\t\4\2\2ZG\3\2\2\2ZN\3\2\2\2ZU\3\2\2\2[\13\3\2\2\2\\"+
		"`\5\16\b\2]`\5\20\t\2^`\5\22\n\2_\\\3\2\2\2_]\3\2\2\2_^\3\2\2\2`\r\3\2"+
		"\2\2ab\7\30\2\2bh\7\35\2\2cd\7\20\2\2dh\7\35\2\2ef\7\21\2\2fh\7\35\2\2"+
		"ga\3\2\2\2gc\3\2\2\2ge\3\2\2\2h\17\3\2\2\2ij\7\22\2\2jp\7\35\2\2kl\7\4"+
		"\2\2lp\7\35\2\2mn\7\17\2\2np\7\35\2\2oi\3\2\2\2ok\3\2\2\2om\3\2\2\2p\21"+
		"\3\2\2\2qr\7\n\2\2rs\7\35\2\2s\23\3\2\2\2tu\7\32\2\2uv\7\35\2\2vw\7\32"+
		"\2\2w\25\3\2\2\2\17\35&,\62=AGNUZ_go";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}