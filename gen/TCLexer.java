// Generated from /Users/zapotocnylubos/syncthing/ni-gen/src/grammar/TCLexer.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class TCLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELSE=2, WHILE=3, RETURN=4, INT=5, VOID=6, CHAR=7, ASSIGN=8, PLUS=9, 
		MINUS=10, MUL=11, DIV=12, LT=13, GT=14, LE=15, GE=16, EQ=17, NE=18, AND=19, 
		OR=20, NOT=21, LPAREN=22, RPAREN=23, LBRACE=24, RBRACE=25, SEMI=26, COMMA=27, 
		LBRACK=28, RBRACK=29, ID=30, NUM=31, CHARLIT=32, STRINGLIT=33, WS=34, 
		COMMENT=35, LINE_COMMENT=36;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IF", "ELSE", "WHILE", "RETURN", "INT", "VOID", "CHAR", "ASSIGN", "PLUS", 
			"MINUS", "MUL", "DIV", "LT", "GT", "LE", "GE", "EQ", "NE", "AND", "OR", 
			"NOT", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "SEMI", "COMMA", "LBRACK", 
			"RBRACK", "ID", "NUM", "CHARLIT", "STRINGLIT", "WS", "COMMENT", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'else'", "'while'", "'return'", "'int'", "'void'", "'char'", 
			"'='", "'+'", "'-'", "'*'", "'/'", "'<'", "'>'", "'<='", "'>='", "'=='", 
			"'!='", "'&&'", "'||'", "'!'", "'('", "')'", "'{'", "'}'", "';'", "','", 
			"'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ELSE", "WHILE", "RETURN", "INT", "VOID", "CHAR", "ASSIGN", 
			"PLUS", "MINUS", "MUL", "DIV", "LT", "GT", "LE", "GE", "EQ", "NE", "AND", 
			"OR", "NOT", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "SEMI", "COMMA", 
			"LBRACK", "RBRACK", "ID", "NUM", "CHARLIT", "STRINGLIT", "WS", "COMMENT", 
			"LINE_COMMENT"
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


	public TCLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TCLexer.g4"; }

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
		"\u0004\u0000$\u00dd\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001d\u0001\u001d\u0005\u001d\u00a1\b\u001d\n\u001d\f\u001d\u00a4"+
		"\t\u001d\u0001\u001e\u0004\u001e\u00a7\b\u001e\u000b\u001e\f\u001e\u00a8"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u00af\b\u001f"+
		"\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0005 \u00b7\b \n"+
		" \f \u00ba\t \u0001 \u0001 \u0001!\u0004!\u00bf\b!\u000b!\f!\u00c0\u0001"+
		"!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0005\"\u00c9\b\"\n\"\f\"\u00cc"+
		"\t\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001"+
		"#\u0005#\u00d7\b#\n#\f#\u00da\t#\u0001#\u0001#\u0001\u00ca\u0000$\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/"+
		"\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f? A!C\"E#G$\u0001"+
		"\u0000\u0007\u0003\u0000AZ__az\u0004\u000009AZ__az\u0001\u000009\u0003"+
		"\u0000\n\n\r\r\'\'\u0003\u0000\n\n\r\r\"\"\u0003\u0000\t\n\r\r  \u0002"+
		"\u0000\n\n\r\r\u00e4\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000"+
		"%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u0000"+
		"3\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001"+
		"\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000"+
		"\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000"+
		"A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000E\u0001"+
		"\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0001I\u0001\u0000\u0000"+
		"\u0000\u0003L\u0001\u0000\u0000\u0000\u0005Q\u0001\u0000\u0000\u0000\u0007"+
		"W\u0001\u0000\u0000\u0000\t^\u0001\u0000\u0000\u0000\u000bb\u0001\u0000"+
		"\u0000\u0000\rg\u0001\u0000\u0000\u0000\u000fl\u0001\u0000\u0000\u0000"+
		"\u0011n\u0001\u0000\u0000\u0000\u0013p\u0001\u0000\u0000\u0000\u0015r"+
		"\u0001\u0000\u0000\u0000\u0017t\u0001\u0000\u0000\u0000\u0019v\u0001\u0000"+
		"\u0000\u0000\u001bx\u0001\u0000\u0000\u0000\u001dz\u0001\u0000\u0000\u0000"+
		"\u001f}\u0001\u0000\u0000\u0000!\u0080\u0001\u0000\u0000\u0000#\u0083"+
		"\u0001\u0000\u0000\u0000%\u0086\u0001\u0000\u0000\u0000\'\u0089\u0001"+
		"\u0000\u0000\u0000)\u008c\u0001\u0000\u0000\u0000+\u008e\u0001\u0000\u0000"+
		"\u0000-\u0090\u0001\u0000\u0000\u0000/\u0092\u0001\u0000\u0000\u00001"+
		"\u0094\u0001\u0000\u0000\u00003\u0096\u0001\u0000\u0000\u00005\u0098\u0001"+
		"\u0000\u0000\u00007\u009a\u0001\u0000\u0000\u00009\u009c\u0001\u0000\u0000"+
		"\u0000;\u009e\u0001\u0000\u0000\u0000=\u00a6\u0001\u0000\u0000\u0000?"+
		"\u00aa\u0001\u0000\u0000\u0000A\u00b2\u0001\u0000\u0000\u0000C\u00be\u0001"+
		"\u0000\u0000\u0000E\u00c4\u0001\u0000\u0000\u0000G\u00d2\u0001\u0000\u0000"+
		"\u0000IJ\u0005i\u0000\u0000JK\u0005f\u0000\u0000K\u0002\u0001\u0000\u0000"+
		"\u0000LM\u0005e\u0000\u0000MN\u0005l\u0000\u0000NO\u0005s\u0000\u0000"+
		"OP\u0005e\u0000\u0000P\u0004\u0001\u0000\u0000\u0000QR\u0005w\u0000\u0000"+
		"RS\u0005h\u0000\u0000ST\u0005i\u0000\u0000TU\u0005l\u0000\u0000UV\u0005"+
		"e\u0000\u0000V\u0006\u0001\u0000\u0000\u0000WX\u0005r\u0000\u0000XY\u0005"+
		"e\u0000\u0000YZ\u0005t\u0000\u0000Z[\u0005u\u0000\u0000[\\\u0005r\u0000"+
		"\u0000\\]\u0005n\u0000\u0000]\b\u0001\u0000\u0000\u0000^_\u0005i\u0000"+
		"\u0000_`\u0005n\u0000\u0000`a\u0005t\u0000\u0000a\n\u0001\u0000\u0000"+
		"\u0000bc\u0005v\u0000\u0000cd\u0005o\u0000\u0000de\u0005i\u0000\u0000"+
		"ef\u0005d\u0000\u0000f\f\u0001\u0000\u0000\u0000gh\u0005c\u0000\u0000"+
		"hi\u0005h\u0000\u0000ij\u0005a\u0000\u0000jk\u0005r\u0000\u0000k\u000e"+
		"\u0001\u0000\u0000\u0000lm\u0005=\u0000\u0000m\u0010\u0001\u0000\u0000"+
		"\u0000no\u0005+\u0000\u0000o\u0012\u0001\u0000\u0000\u0000pq\u0005-\u0000"+
		"\u0000q\u0014\u0001\u0000\u0000\u0000rs\u0005*\u0000\u0000s\u0016\u0001"+
		"\u0000\u0000\u0000tu\u0005/\u0000\u0000u\u0018\u0001\u0000\u0000\u0000"+
		"vw\u0005<\u0000\u0000w\u001a\u0001\u0000\u0000\u0000xy\u0005>\u0000\u0000"+
		"y\u001c\u0001\u0000\u0000\u0000z{\u0005<\u0000\u0000{|\u0005=\u0000\u0000"+
		"|\u001e\u0001\u0000\u0000\u0000}~\u0005>\u0000\u0000~\u007f\u0005=\u0000"+
		"\u0000\u007f \u0001\u0000\u0000\u0000\u0080\u0081\u0005=\u0000\u0000\u0081"+
		"\u0082\u0005=\u0000\u0000\u0082\"\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u0005!\u0000\u0000\u0084\u0085\u0005=\u0000\u0000\u0085$\u0001\u0000"+
		"\u0000\u0000\u0086\u0087\u0005&\u0000\u0000\u0087\u0088\u0005&\u0000\u0000"+
		"\u0088&\u0001\u0000\u0000\u0000\u0089\u008a\u0005|\u0000\u0000\u008a\u008b"+
		"\u0005|\u0000\u0000\u008b(\u0001\u0000\u0000\u0000\u008c\u008d\u0005!"+
		"\u0000\u0000\u008d*\u0001\u0000\u0000\u0000\u008e\u008f\u0005(\u0000\u0000"+
		"\u008f,\u0001\u0000\u0000\u0000\u0090\u0091\u0005)\u0000\u0000\u0091."+
		"\u0001\u0000\u0000\u0000\u0092\u0093\u0005{\u0000\u0000\u00930\u0001\u0000"+
		"\u0000\u0000\u0094\u0095\u0005}\u0000\u0000\u00952\u0001\u0000\u0000\u0000"+
		"\u0096\u0097\u0005;\u0000\u0000\u00974\u0001\u0000\u0000\u0000\u0098\u0099"+
		"\u0005,\u0000\u0000\u00996\u0001\u0000\u0000\u0000\u009a\u009b\u0005["+
		"\u0000\u0000\u009b8\u0001\u0000\u0000\u0000\u009c\u009d\u0005]\u0000\u0000"+
		"\u009d:\u0001\u0000\u0000\u0000\u009e\u00a2\u0007\u0000\u0000\u0000\u009f"+
		"\u00a1\u0007\u0001\u0000\u0000\u00a0\u009f\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a3<\u0001\u0000\u0000\u0000\u00a4\u00a2"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a7\u0007\u0002\u0000\u0000\u00a6\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9>\u0001"+
		"\u0000\u0000\u0000\u00aa\u00ae\u0005\'\u0000\u0000\u00ab\u00af\b\u0003"+
		"\u0000\u0000\u00ac\u00ad\u0005\\\u0000\u0000\u00ad\u00af\t\u0000\u0000"+
		"\u0000\u00ae\u00ab\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000"+
		"\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005\'\u0000\u0000"+
		"\u00b1@\u0001\u0000\u0000\u0000\u00b2\u00b8\u0005\"\u0000\u0000\u00b3"+
		"\u00b7\b\u0004\u0000\u0000\u00b4\u00b5\u0005\\\u0000\u0000\u00b5\u00b7"+
		"\t\u0000\u0000\u0000\u00b6\u00b3\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b7\u00ba\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00bb\u0001"+
		"\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005"+
		"\"\u0000\u0000\u00bcB\u0001\u0000\u0000\u0000\u00bd\u00bf\u0007\u0005"+
		"\u0000\u0000\u00be\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000"+
		"\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c3\u0006!\u0000"+
		"\u0000\u00c3D\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005/\u0000\u0000\u00c5"+
		"\u00c6\u0005*\u0000\u0000\u00c6\u00ca\u0001\u0000\u0000\u0000\u00c7\u00c9"+
		"\t\u0000\u0000\u0000\u00c8\u00c7\u0001\u0000\u0000\u0000\u00c9\u00cc\u0001"+
		"\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001"+
		"\u0000\u0000\u0000\u00cb\u00cd\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001"+
		"\u0000\u0000\u0000\u00cd\u00ce\u0005*\u0000\u0000\u00ce\u00cf\u0005/\u0000"+
		"\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d1\u0006\"\u0000\u0000"+
		"\u00d1F\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005/\u0000\u0000\u00d3\u00d4"+
		"\u0005/\u0000\u0000\u00d4\u00d8\u0001\u0000\u0000\u0000\u00d5\u00d7\b"+
		"\u0006\u0000\u0000\u00d6\u00d5\u0001\u0000\u0000\u0000\u00d7\u00da\u0001"+
		"\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001"+
		"\u0000\u0000\u0000\u00d9\u00db\u0001\u0000\u0000\u0000\u00da\u00d8\u0001"+
		"\u0000\u0000\u0000\u00db\u00dc\u0006#\u0000\u0000\u00dcH\u0001\u0000\u0000"+
		"\u0000\t\u0000\u00a2\u00a8\u00ae\u00b6\u00b8\u00c0\u00ca\u00d8\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}