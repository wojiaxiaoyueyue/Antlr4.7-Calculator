// Generated from Calc.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalcLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, ID=6, NUMBER=7, COMMENT=8, LINE_COMMENT=9, 
		WS=10, MUL=11, DIV=12, ADD=13, SUB=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "ID", "NUMBER", "COMMENT", "LINE_COMMENT", 
		"WS", "MUL", "DIV", "ADD", "SUB"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'print('", "')'", "'^'", "'('", null, null, null, null, 
		null, "'*'", "'/'", "'+'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "ID", "NUMBER", "COMMENT", "LINE_COMMENT", 
		"WS", "MUL", "DIV", "ADD", "SUB"
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


	public CalcLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Calc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20v\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\6\7\60\n\7\r\7\16\7\61\3\b\6\b\65\n"+
		"\b\r\b\16\b\66\3\b\3\b\6\b;\n\b\r\b\16\b<\5\b?\n\b\5\bA\n\b\3\b\6\bD\n"+
		"\b\r\b\16\bE\5\bH\n\b\3\t\3\t\3\t\3\t\7\tN\n\t\f\t\16\tQ\13\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\7\n\\\n\n\f\n\16\n_\13\n\3\n\5\nb\n\n\3\n"+
		"\3\n\3\n\3\n\3\13\6\13i\n\13\r\13\16\13j\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\4O]\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\3\2\5\4\2C\\c|\3\2\62;\5\2\13\f\17\17\"\"\2\u0080"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\3\37\3\2\2\2\5!\3\2\2\2\7(\3\2"+
		"\2\2\t*\3\2\2\2\13,\3\2\2\2\r/\3\2\2\2\17G\3\2\2\2\21I\3\2\2\2\23W\3\2"+
		"\2\2\25h\3\2\2\2\27n\3\2\2\2\31p\3\2\2\2\33r\3\2\2\2\35t\3\2\2\2\37 \7"+
		"?\2\2 \4\3\2\2\2!\"\7r\2\2\"#\7t\2\2#$\7k\2\2$%\7p\2\2%&\7v\2\2&\'\7*"+
		"\2\2\'\6\3\2\2\2()\7+\2\2)\b\3\2\2\2*+\7`\2\2+\n\3\2\2\2,-\7*\2\2-\f\3"+
		"\2\2\2.\60\t\2\2\2/.\3\2\2\2\60\61\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62"+
		"\16\3\2\2\2\63\65\t\3\2\2\64\63\3\2\2\2\65\66\3\2\2\2\66\64\3\2\2\2\66"+
		"\67\3\2\2\2\67@\3\2\2\28>\7\60\2\29;\t\3\2\2:9\3\2\2\2;<\3\2\2\2<:\3\2"+
		"\2\2<=\3\2\2\2=?\3\2\2\2>:\3\2\2\2>?\3\2\2\2?A\3\2\2\2@8\3\2\2\2@A\3\2"+
		"\2\2AH\3\2\2\2BD\t\3\2\2CB\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2FH\3\2"+
		"\2\2G\64\3\2\2\2GC\3\2\2\2H\20\3\2\2\2IJ\7\61\2\2JK\7,\2\2KO\3\2\2\2L"+
		"N\13\2\2\2ML\3\2\2\2NQ\3\2\2\2OP\3\2\2\2OM\3\2\2\2PR\3\2\2\2QO\3\2\2\2"+
		"RS\7,\2\2ST\7\61\2\2TU\3\2\2\2UV\b\t\2\2V\22\3\2\2\2WX\7\61\2\2XY\7\61"+
		"\2\2Y]\3\2\2\2Z\\\13\2\2\2[Z\3\2\2\2\\_\3\2\2\2]^\3\2\2\2][\3\2\2\2^a"+
		"\3\2\2\2_]\3\2\2\2`b\7\17\2\2a`\3\2\2\2ab\3\2\2\2bc\3\2\2\2cd\7\f\2\2"+
		"de\3\2\2\2ef\b\n\2\2f\24\3\2\2\2gi\t\4\2\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2"+
		"\2jk\3\2\2\2kl\3\2\2\2lm\b\13\2\2m\26\3\2\2\2no\7,\2\2o\30\3\2\2\2pq\7"+
		"\61\2\2q\32\3\2\2\2rs\7-\2\2s\34\3\2\2\2tu\7/\2\2u\36\3\2\2\2\16\2\61"+
		"\66<>@EGO]aj\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}