// Generated from hunger.g4 by ANTLR 4.2.2
package antlrgen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class hungerLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__25=1, T__24=2, T__23=3, T__22=4, T__21=5, T__20=6, T__19=7, T__18=8, 
		T__17=9, T__16=10, T__15=11, T__14=12, T__13=13, T__12=14, T__11=15, T__10=16, 
		T__9=17, T__8=18, T__7=19, T__6=20, T__5=21, T__4=22, T__3=23, T__2=24, 
		T__1=25, T__0=26, Number=27, String=28, Whitespace=29;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'True'", "','", "'('", "'dl'", "'Milligram'", "'l'", "'servings'", "'mg'", 
		"'\"'", "'Decilitre'", "'False'", "'kg'", "')'", "'star'", "'Piece'", 
		"'newFood'", "'Millilitre'", "'='", "'Gram'", "';'", "'Litre'", "'pc'", 
		"'Kilogram'", "'ml'", "'newRecipe'", "'g'", "Number", "String", "Whitespace"
	};
	public static final String[] ruleNames = {
		"T__25", "T__24", "T__23", "T__22", "T__21", "T__20", "T__19", "T__18", 
		"T__17", "T__16", "T__15", "T__14", "T__13", "T__12", "T__11", "T__10", 
		"T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", 
		"T__0", "Number", "String", "Whitespace"
	};


	public hungerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "hunger.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\37\u00df\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34\7\34\u00c4\n\34\f\34"+
		"\16\34\u00c7\13\34\5\34\u00c9\n\34\3\34\3\34\6\34\u00cd\n\34\r\34\16\34"+
		"\u00ce\5\34\u00d1\n\34\3\35\3\35\6\35\u00d5\n\35\r\35\16\35\u00d6\3\36"+
		"\6\36\u00da\n\36\r\36\16\36\u00db\3\36\3\36\2\2\37\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37\3\2\7\3\2\63;\3\2"+
		"\62;\4\2C\\c|\5\2\62;C\\c|\5\2\13\f\17\17\"\"\u00e4\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\3=\3\2\2\2\5"+
		"B\3\2\2\2\7D\3\2\2\2\tF\3\2\2\2\13I\3\2\2\2\rS\3\2\2\2\17U\3\2\2\2\21"+
		"^\3\2\2\2\23a\3\2\2\2\25c\3\2\2\2\27m\3\2\2\2\31s\3\2\2\2\33v\3\2\2\2"+
		"\35x\3\2\2\2\37}\3\2\2\2!\u0083\3\2\2\2#\u008b\3\2\2\2%\u0096\3\2\2\2"+
		"\'\u0098\3\2\2\2)\u009d\3\2\2\2+\u009f\3\2\2\2-\u00a5\3\2\2\2/\u00a8\3"+
		"\2\2\2\61\u00b1\3\2\2\2\63\u00b4\3\2\2\2\65\u00be\3\2\2\2\67\u00c8\3\2"+
		"\2\29\u00d2\3\2\2\2;\u00d9\3\2\2\2=>\7V\2\2>?\7t\2\2?@\7w\2\2@A\7g\2\2"+
		"A\4\3\2\2\2BC\7.\2\2C\6\3\2\2\2DE\7*\2\2E\b\3\2\2\2FG\7f\2\2GH\7n\2\2"+
		"H\n\3\2\2\2IJ\7O\2\2JK\7k\2\2KL\7n\2\2LM\7n\2\2MN\7k\2\2NO\7i\2\2OP\7"+
		"t\2\2PQ\7c\2\2QR\7o\2\2R\f\3\2\2\2ST\7n\2\2T\16\3\2\2\2UV\7u\2\2VW\7g"+
		"\2\2WX\7t\2\2XY\7x\2\2YZ\7k\2\2Z[\7p\2\2[\\\7i\2\2\\]\7u\2\2]\20\3\2\2"+
		"\2^_\7o\2\2_`\7i\2\2`\22\3\2\2\2ab\7$\2\2b\24\3\2\2\2cd\7F\2\2de\7g\2"+
		"\2ef\7e\2\2fg\7k\2\2gh\7n\2\2hi\7k\2\2ij\7v\2\2jk\7t\2\2kl\7g\2\2l\26"+
		"\3\2\2\2mn\7H\2\2no\7c\2\2op\7n\2\2pq\7u\2\2qr\7g\2\2r\30\3\2\2\2st\7"+
		"m\2\2tu\7i\2\2u\32\3\2\2\2vw\7+\2\2w\34\3\2\2\2xy\7u\2\2yz\7v\2\2z{\7"+
		"c\2\2{|\7t\2\2|\36\3\2\2\2}~\7R\2\2~\177\7k\2\2\177\u0080\7g\2\2\u0080"+
		"\u0081\7e\2\2\u0081\u0082\7g\2\2\u0082 \3\2\2\2\u0083\u0084\7p\2\2\u0084"+
		"\u0085\7g\2\2\u0085\u0086\7y\2\2\u0086\u0087\7H\2\2\u0087\u0088\7q\2\2"+
		"\u0088\u0089\7q\2\2\u0089\u008a\7f\2\2\u008a\"\3\2\2\2\u008b\u008c\7O"+
		"\2\2\u008c\u008d\7k\2\2\u008d\u008e\7n\2\2\u008e\u008f\7n\2\2\u008f\u0090"+
		"\7k\2\2\u0090\u0091\7n\2\2\u0091\u0092\7k\2\2\u0092\u0093\7v\2\2\u0093"+
		"\u0094\7t\2\2\u0094\u0095\7g\2\2\u0095$\3\2\2\2\u0096\u0097\7?\2\2\u0097"+
		"&\3\2\2\2\u0098\u0099\7I\2\2\u0099\u009a\7t\2\2\u009a\u009b\7c\2\2\u009b"+
		"\u009c\7o\2\2\u009c(\3\2\2\2\u009d\u009e\7=\2\2\u009e*\3\2\2\2\u009f\u00a0"+
		"\7N\2\2\u00a0\u00a1\7k\2\2\u00a1\u00a2\7v\2\2\u00a2\u00a3\7t\2\2\u00a3"+
		"\u00a4\7g\2\2\u00a4,\3\2\2\2\u00a5\u00a6\7r\2\2\u00a6\u00a7\7e\2\2\u00a7"+
		".\3\2\2\2\u00a8\u00a9\7M\2\2\u00a9\u00aa\7k\2\2\u00aa\u00ab\7n\2\2\u00ab"+
		"\u00ac\7q\2\2\u00ac\u00ad\7i\2\2\u00ad\u00ae\7t\2\2\u00ae\u00af\7c\2\2"+
		"\u00af\u00b0\7o\2\2\u00b0\60\3\2\2\2\u00b1\u00b2\7o\2\2\u00b2\u00b3\7"+
		"n\2\2\u00b3\62\3\2\2\2\u00b4\u00b5\7p\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7"+
		"\7y\2\2\u00b7\u00b8\7T\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba\7e\2\2\u00ba"+
		"\u00bb\7k\2\2\u00bb\u00bc\7r\2\2\u00bc\u00bd\7g\2\2\u00bd\64\3\2\2\2\u00be"+
		"\u00bf\7i\2\2\u00bf\66\3\2\2\2\u00c0\u00c9\7\62\2\2\u00c1\u00c5\t\2\2"+
		"\2\u00c2\u00c4\t\3\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3"+
		"\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8"+
		"\u00c0\3\2\2\2\u00c8\u00c1\3\2\2\2\u00c9\u00d0\3\2\2\2\u00ca\u00cc\7\60"+
		"\2\2\u00cb\u00cd\t\3\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce"+
		"\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00ca\3\2"+
		"\2\2\u00d0\u00d1\3\2\2\2\u00d18\3\2\2\2\u00d2\u00d4\t\4\2\2\u00d3\u00d5"+
		"\t\5\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6"+
		"\u00d7\3\2\2\2\u00d7:\3\2\2\2\u00d8\u00da\t\6\2\2\u00d9\u00d8\3\2\2\2"+
		"\u00da\u00db\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd"+
		"\3\2\2\2\u00dd\u00de\b\36\2\2\u00de<\3\2\2\2\t\2\u00c5\u00c8\u00ce\u00d0"+
		"\u00d6\u00db\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}