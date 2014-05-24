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
		T__24=1, T__23=2, T__22=3, T__21=4, T__20=5, T__19=6, T__18=7, T__17=8, 
		T__16=9, T__15=10, T__14=11, T__13=12, T__12=13, T__11=14, T__10=15, T__9=16, 
		T__8=17, T__7=18, T__6=19, T__5=20, T__4=21, T__3=22, T__2=23, T__1=24, 
		T__0=25, Number=26, String=27, Whitespace=28;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'True'", "'Decilitre'", "'False'", "'kg'", "')'", "'star'", "','", "'Piece'", 
		"'newFood'", "'('", "'='", "'dl'", "'Millilitre'", "'Gram'", "'Milligram'", 
		"'Litre'", "'l'", "'pc'", "'servings'", "'newRecipe'", "'ml'", "'Kilogram'", 
		"'mg'", "'\"'", "'g'", "Number", "String", "Whitespace"
	};
	public static final String[] ruleNames = {
		"T__24", "T__23", "T__22", "T__21", "T__20", "T__19", "T__18", "T__17", 
		"T__16", "T__15", "T__14", "T__13", "T__12", "T__11", "T__10", "T__9", 
		"T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", 
		"Number", "String", "Whitespace"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\36\u00db\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\33\7\33\u00c0\n\33\f\33\16\33\u00c3\13\33\5\33"+
		"\u00c5\n\33\3\33\3\33\6\33\u00c9\n\33\r\33\16\33\u00ca\5\33\u00cd\n\33"+
		"\3\34\3\34\6\34\u00d1\n\34\r\34\16\34\u00d2\3\35\6\35\u00d6\n\35\r\35"+
		"\16\35\u00d7\3\35\3\35\2\2\36\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36\3\2\7\3\2\63;\3\2\62;\4\2C\\c|\5\2\62;C\\c|"+
		"\5\2\13\f\17\17\"\"\u00e0\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\3;\3\2\2\2\5@\3\2\2\2\7J\3\2\2\2\tP\3\2\2\2\13S\3"+
		"\2\2\2\rU\3\2\2\2\17Z\3\2\2\2\21\\\3\2\2\2\23b\3\2\2\2\25j\3\2\2\2\27"+
		"l\3\2\2\2\31n\3\2\2\2\33q\3\2\2\2\35|\3\2\2\2\37\u0081\3\2\2\2!\u008b"+
		"\3\2\2\2#\u0091\3\2\2\2%\u0093\3\2\2\2\'\u0096\3\2\2\2)\u009f\3\2\2\2"+
		"+\u00a9\3\2\2\2-\u00ac\3\2\2\2/\u00b5\3\2\2\2\61\u00b8\3\2\2\2\63\u00ba"+
		"\3\2\2\2\65\u00c4\3\2\2\2\67\u00ce\3\2\2\29\u00d5\3\2\2\2;<\7V\2\2<=\7"+
		"t\2\2=>\7w\2\2>?\7g\2\2?\4\3\2\2\2@A\7F\2\2AB\7g\2\2BC\7e\2\2CD\7k\2\2"+
		"DE\7n\2\2EF\7k\2\2FG\7v\2\2GH\7t\2\2HI\7g\2\2I\6\3\2\2\2JK\7H\2\2KL\7"+
		"c\2\2LM\7n\2\2MN\7u\2\2NO\7g\2\2O\b\3\2\2\2PQ\7m\2\2QR\7i\2\2R\n\3\2\2"+
		"\2ST\7+\2\2T\f\3\2\2\2UV\7u\2\2VW\7v\2\2WX\7c\2\2XY\7t\2\2Y\16\3\2\2\2"+
		"Z[\7.\2\2[\20\3\2\2\2\\]\7R\2\2]^\7k\2\2^_\7g\2\2_`\7e\2\2`a\7g\2\2a\22"+
		"\3\2\2\2bc\7p\2\2cd\7g\2\2de\7y\2\2ef\7H\2\2fg\7q\2\2gh\7q\2\2hi\7f\2"+
		"\2i\24\3\2\2\2jk\7*\2\2k\26\3\2\2\2lm\7?\2\2m\30\3\2\2\2no\7f\2\2op\7"+
		"n\2\2p\32\3\2\2\2qr\7O\2\2rs\7k\2\2st\7n\2\2tu\7n\2\2uv\7k\2\2vw\7n\2"+
		"\2wx\7k\2\2xy\7v\2\2yz\7t\2\2z{\7g\2\2{\34\3\2\2\2|}\7I\2\2}~\7t\2\2~"+
		"\177\7c\2\2\177\u0080\7o\2\2\u0080\36\3\2\2\2\u0081\u0082\7O\2\2\u0082"+
		"\u0083\7k\2\2\u0083\u0084\7n\2\2\u0084\u0085\7n\2\2\u0085\u0086\7k\2\2"+
		"\u0086\u0087\7i\2\2\u0087\u0088\7t\2\2\u0088\u0089\7c\2\2\u0089\u008a"+
		"\7o\2\2\u008a \3\2\2\2\u008b\u008c\7N\2\2\u008c\u008d\7k\2\2\u008d\u008e"+
		"\7v\2\2\u008e\u008f\7t\2\2\u008f\u0090\7g\2\2\u0090\"\3\2\2\2\u0091\u0092"+
		"\7n\2\2\u0092$\3\2\2\2\u0093\u0094\7r\2\2\u0094\u0095\7e\2\2\u0095&\3"+
		"\2\2\2\u0096\u0097\7u\2\2\u0097\u0098\7g\2\2\u0098\u0099\7t\2\2\u0099"+
		"\u009a\7x\2\2\u009a\u009b\7k\2\2\u009b\u009c\7p\2\2\u009c\u009d\7i\2\2"+
		"\u009d\u009e\7u\2\2\u009e(\3\2\2\2\u009f\u00a0\7p\2\2\u00a0\u00a1\7g\2"+
		"\2\u00a1\u00a2\7y\2\2\u00a2\u00a3\7T\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a5"+
		"\7e\2\2\u00a5\u00a6\7k\2\2\u00a6\u00a7\7r\2\2\u00a7\u00a8\7g\2\2\u00a8"+
		"*\3\2\2\2\u00a9\u00aa\7o\2\2\u00aa\u00ab\7n\2\2\u00ab,\3\2\2\2\u00ac\u00ad"+
		"\7M\2\2\u00ad\u00ae\7k\2\2\u00ae\u00af\7n\2\2\u00af\u00b0\7q\2\2\u00b0"+
		"\u00b1\7i\2\2\u00b1\u00b2\7t\2\2\u00b2\u00b3\7c\2\2\u00b3\u00b4\7o\2\2"+
		"\u00b4.\3\2\2\2\u00b5\u00b6\7o\2\2\u00b6\u00b7\7i\2\2\u00b7\60\3\2\2\2"+
		"\u00b8\u00b9\7$\2\2\u00b9\62\3\2\2\2\u00ba\u00bb\7i\2\2\u00bb\64\3\2\2"+
		"\2\u00bc\u00c5\7\62\2\2\u00bd\u00c1\t\2\2\2\u00be\u00c0\t\3\2\2\u00bf"+
		"\u00be\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2"+
		"\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00bc\3\2\2\2\u00c4"+
		"\u00bd\3\2\2\2\u00c5\u00cc\3\2\2\2\u00c6\u00c8\7\60\2\2\u00c7\u00c9\t"+
		"\3\2\2\u00c8\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00c6\3\2\2\2\u00cc\u00cd\3\2"+
		"\2\2\u00cd\66\3\2\2\2\u00ce\u00d0\t\4\2\2\u00cf\u00d1\t\5\2\2\u00d0\u00cf"+
		"\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"8\3\2\2\2\u00d4\u00d6\t\6\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2"+
		"\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da"+
		"\b\35\2\2\u00da:\3\2\2\2\t\2\u00c1\u00c4\u00ca\u00cc\u00d2\u00d7\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}