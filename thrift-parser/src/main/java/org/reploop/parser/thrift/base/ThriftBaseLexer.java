// Generated from org/reploop/parser/thrift/base/ThriftBase.g4 by ANTLR 4.9.1
package org.reploop.parser.thrift.base;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ThriftBaseLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

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
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		XsdAll=53, XsdOptional=54, XsdNillable=55, FieldRequiredness=56, ONEWAY=57, 
		ID=58, ST_ID=59, LITERAL=60, INT=61, DOUBLE=62, FLOAT=63, STRING=64, LINE_COMMENT=65, 
		COMMENT=66, WS=67;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
			"T__41", "T__42", "T__43", "T__44", "T__45", "T__46", "T__47", "T__48", 
			"T__49", "T__50", "T__51", "XsdAll", "XsdOptional", "XsdNillable", "FieldRequiredness", 
			"ONEWAY", "ID", "ST_ID", "LITERAL", "INT", "DOUBLE", "FLOAT", "STRING", 
			"LINE_COMMENT", "COMMENT", "WS", "ID_LETTER", "DIGIT", "ESC", "SIGN", 
			"EXPONENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'include'", "'cpp_include'", "'namespace'", "'smalltalk.category'", 
			"'smalltalk.prefix'", "'xsd_namespace'", "'php_namespace'", "'*'", "'cpp'", 
			"'java'", "'py'", "'perl'", "'rb'", "'cocoa'", "'csharp'", "'typedef'", 
			"'enum'", "'{'", "'}'", "'='", "'senum'", "'const'", "'['", "']'", "':'", 
			"'struct'", "'union'", "'xsd_attrs'", "'exception'", "'service'", "'extends'", 
			"'('", "')'", "'throws'", "'void'", "'string'", "'binary'", "'slist'", 
			"'bool'", "'byte'", "'i16'", "'i32'", "'i64'", "'double'", "'map'", "'<'", 
			"','", "'>'", "'set'", "'list'", "';'", "'cpp_type'", "'xsd_all'", "'xsd_optional'", 
			"'xsd_nillable'", null, "'oneway'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "XsdAll", "XsdOptional", "XsdNillable", 
			"FieldRequiredness", "ONEWAY", "ID", "ST_ID", "LITERAL", "INT", "DOUBLE", 
			"FLOAT", "STRING", "LINE_COMMENT", "COMMENT", "WS"
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


	public ThriftBaseLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ThriftBase.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2E\u0296\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3"+
		"\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3"+
		"#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3"+
		"&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3"+
		"+\3+\3+\3+\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3/\3/\3\60\3\60"+
		"\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\38\38\38\38\38\38\38\38\38\38\38\38\38\39\39\39\39\39\39\39\39\3"+
		"9\39\39\39\39\39\39\39\59\u01fc\n9\3:\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\7"+
		";\u0209\n;\f;\16;\u020c\13;\3<\3<\3<\3<\7<\u0212\n<\f<\16<\u0215\13<\3"+
		"=\3=\7=\u0219\n=\f=\16=\u021c\13=\3=\3=\3=\7=\u0221\n=\f=\16=\u0224\13"+
		"=\3=\5=\u0227\n=\3>\5>\u022a\n>\3>\6>\u022d\n>\r>\16>\u022e\3?\3?\3?\6"+
		"?\u0234\n?\r?\16?\u0235\5?\u0238\n?\3?\3?\3?\5?\u023d\n?\3?\3?\6?\u0241"+
		"\n?\r?\16?\u0242\3?\3?\3?\5?\u0248\n?\5?\u024a\n?\3@\6@\u024d\n@\r@\16"+
		"@\u024e\3@\3@\7@\u0253\n@\f@\16@\u0256\13@\3@\3@\6@\u025a\n@\r@\16@\u025b"+
		"\5@\u025e\n@\3A\3A\3A\7A\u0263\nA\fA\16A\u0266\13A\3A\3A\3B\3B\3B\3B\7"+
		"B\u026e\nB\fB\16B\u0271\13B\3B\3B\3B\3B\3C\3C\3C\3C\7C\u027b\nC\fC\16"+
		"C\u027e\13C\3C\3C\3C\3C\3C\3D\6D\u0286\nD\rD\16D\u0287\3D\3D\3E\3E\3F"+
		"\3F\3G\3G\3G\3H\3H\3I\3I\7\u021a\u0222\u0264\u026f\u027c\2J\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w"+
		"=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089\2\u008b\2\u008d\2\u008f"+
		"\2\u0091\2\3\2\b\5\2\13\f\17\17\"\"\5\2C\\aac|\3\2\62;\b\2$$^^ddppttv"+
		"v\4\2--//\4\2GGgg\2\u02ab\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2"+
		"\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]"+
		"\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2"+
		"\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2"+
		"\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2"+
		"\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\3\u0093\3\2\2\2\5"+
		"\u009b\3\2\2\2\7\u00a7\3\2\2\2\t\u00b1\3\2\2\2\13\u00c4\3\2\2\2\r\u00d5"+
		"\3\2\2\2\17\u00e3\3\2\2\2\21\u00f1\3\2\2\2\23\u00f3\3\2\2\2\25\u00f7\3"+
		"\2\2\2\27\u00fc\3\2\2\2\31\u00ff\3\2\2\2\33\u0104\3\2\2\2\35\u0107\3\2"+
		"\2\2\37\u010d\3\2\2\2!\u0114\3\2\2\2#\u011c\3\2\2\2%\u0121\3\2\2\2\'\u0123"+
		"\3\2\2\2)\u0125\3\2\2\2+\u0127\3\2\2\2-\u012d\3\2\2\2/\u0133\3\2\2\2\61"+
		"\u0135\3\2\2\2\63\u0137\3\2\2\2\65\u0139\3\2\2\2\67\u0140\3\2\2\29\u0146"+
		"\3\2\2\2;\u0150\3\2\2\2=\u015a\3\2\2\2?\u0162\3\2\2\2A\u016a\3\2\2\2C"+
		"\u016c\3\2\2\2E\u016e\3\2\2\2G\u0175\3\2\2\2I\u017a\3\2\2\2K\u0181\3\2"+
		"\2\2M\u0188\3\2\2\2O\u018e\3\2\2\2Q\u0193\3\2\2\2S\u0198\3\2\2\2U\u019c"+
		"\3\2\2\2W\u01a0\3\2\2\2Y\u01a4\3\2\2\2[\u01ab\3\2\2\2]\u01af\3\2\2\2_"+
		"\u01b1\3\2\2\2a\u01b3\3\2\2\2c\u01b5\3\2\2\2e\u01b9\3\2\2\2g\u01be\3\2"+
		"\2\2i\u01c0\3\2\2\2k\u01c9\3\2\2\2m\u01d1\3\2\2\2o\u01de\3\2\2\2q\u01fb"+
		"\3\2\2\2s\u01fd\3\2\2\2u\u0204\3\2\2\2w\u020d\3\2\2\2y\u0226\3\2\2\2{"+
		"\u0229\3\2\2\2}\u0249\3\2\2\2\177\u025d\3\2\2\2\u0081\u025f\3\2\2\2\u0083"+
		"\u0269\3\2\2\2\u0085\u0276\3\2\2\2\u0087\u0285\3\2\2\2\u0089\u028b\3\2"+
		"\2\2\u008b\u028d\3\2\2\2\u008d\u028f\3\2\2\2\u008f\u0292\3\2\2\2\u0091"+
		"\u0294\3\2\2\2\u0093\u0094\7k\2\2\u0094\u0095\7p\2\2\u0095\u0096\7e\2"+
		"\2\u0096\u0097\7n\2\2\u0097\u0098\7w\2\2\u0098\u0099\7f\2\2\u0099\u009a"+
		"\7g\2\2\u009a\4\3\2\2\2\u009b\u009c\7e\2\2\u009c\u009d\7r\2\2\u009d\u009e"+
		"\7r\2\2\u009e\u009f\7a\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7p\2\2\u00a1"+
		"\u00a2\7e\2\2\u00a2\u00a3\7n\2\2\u00a3\u00a4\7w\2\2\u00a4\u00a5\7f\2\2"+
		"\u00a5\u00a6\7g\2\2\u00a6\6\3\2\2\2\u00a7\u00a8\7p\2\2\u00a8\u00a9\7c"+
		"\2\2\u00a9\u00aa\7o\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7u\2\2\u00ac\u00ad"+
		"\7r\2\2\u00ad\u00ae\7c\2\2\u00ae\u00af\7e\2\2\u00af\u00b0\7g\2\2\u00b0"+
		"\b\3\2\2\2\u00b1\u00b2\7u\2\2\u00b2\u00b3\7o\2\2\u00b3\u00b4\7c\2\2\u00b4"+
		"\u00b5\7n\2\2\u00b5\u00b6\7n\2\2\u00b6\u00b7\7v\2\2\u00b7\u00b8\7c\2\2"+
		"\u00b8\u00b9\7n\2\2\u00b9\u00ba\7m\2\2\u00ba\u00bb\7\60\2\2\u00bb\u00bc"+
		"\7e\2\2\u00bc\u00bd\7c\2\2\u00bd\u00be\7v\2\2\u00be\u00bf\7g\2\2\u00bf"+
		"\u00c0\7i\2\2\u00c0\u00c1\7q\2\2\u00c1\u00c2\7t\2\2\u00c2\u00c3\7{\2\2"+
		"\u00c3\n\3\2\2\2\u00c4\u00c5\7u\2\2\u00c5\u00c6\7o\2\2\u00c6\u00c7\7c"+
		"\2\2\u00c7\u00c8\7n\2\2\u00c8\u00c9\7n\2\2\u00c9\u00ca\7v\2\2\u00ca\u00cb"+
		"\7c\2\2\u00cb\u00cc\7n\2\2\u00cc\u00cd\7m\2\2\u00cd\u00ce\7\60\2\2\u00ce"+
		"\u00cf\7r\2\2\u00cf\u00d0\7t\2\2\u00d0\u00d1\7g\2\2\u00d1\u00d2\7h\2\2"+
		"\u00d2\u00d3\7k\2\2\u00d3\u00d4\7z\2\2\u00d4\f\3\2\2\2\u00d5\u00d6\7z"+
		"\2\2\u00d6\u00d7\7u\2\2\u00d7\u00d8\7f\2\2\u00d8\u00d9\7a\2\2\u00d9\u00da"+
		"\7p\2\2\u00da\u00db\7c\2\2\u00db\u00dc\7o\2\2\u00dc\u00dd\7g\2\2\u00dd"+
		"\u00de\7u\2\2\u00de\u00df\7r\2\2\u00df\u00e0\7c\2\2\u00e0\u00e1\7e\2\2"+
		"\u00e1\u00e2\7g\2\2\u00e2\16\3\2\2\2\u00e3\u00e4\7r\2\2\u00e4\u00e5\7"+
		"j\2\2\u00e5\u00e6\7r\2\2\u00e6\u00e7\7a\2\2\u00e7\u00e8\7p\2\2\u00e8\u00e9"+
		"\7c\2\2\u00e9\u00ea\7o\2\2\u00ea\u00eb\7g\2\2\u00eb\u00ec\7u\2\2\u00ec"+
		"\u00ed\7r\2\2\u00ed\u00ee\7c\2\2\u00ee\u00ef\7e\2\2\u00ef\u00f0\7g\2\2"+
		"\u00f0\20\3\2\2\2\u00f1\u00f2\7,\2\2\u00f2\22\3\2\2\2\u00f3\u00f4\7e\2"+
		"\2\u00f4\u00f5\7r\2\2\u00f5\u00f6\7r\2\2\u00f6\24\3\2\2\2\u00f7\u00f8"+
		"\7l\2\2\u00f8\u00f9\7c\2\2\u00f9\u00fa\7x\2\2\u00fa\u00fb\7c\2\2\u00fb"+
		"\26\3\2\2\2\u00fc\u00fd\7r\2\2\u00fd\u00fe\7{\2\2\u00fe\30\3\2\2\2\u00ff"+
		"\u0100\7r\2\2\u0100\u0101\7g\2\2\u0101\u0102\7t\2\2\u0102\u0103\7n\2\2"+
		"\u0103\32\3\2\2\2\u0104\u0105\7t\2\2\u0105\u0106\7d\2\2\u0106\34\3\2\2"+
		"\2\u0107\u0108\7e\2\2\u0108\u0109\7q\2\2\u0109\u010a\7e\2\2\u010a\u010b"+
		"\7q\2\2\u010b\u010c\7c\2\2\u010c\36\3\2\2\2\u010d\u010e\7e\2\2\u010e\u010f"+
		"\7u\2\2\u010f\u0110\7j\2\2\u0110\u0111\7c\2\2\u0111\u0112\7t\2\2\u0112"+
		"\u0113\7r\2\2\u0113 \3\2\2\2\u0114\u0115\7v\2\2\u0115\u0116\7{\2\2\u0116"+
		"\u0117\7r\2\2\u0117\u0118\7g\2\2\u0118\u0119\7f\2\2\u0119\u011a\7g\2\2"+
		"\u011a\u011b\7h\2\2\u011b\"\3\2\2\2\u011c\u011d\7g\2\2\u011d\u011e\7p"+
		"\2\2\u011e\u011f\7w\2\2\u011f\u0120\7o\2\2\u0120$\3\2\2\2\u0121\u0122"+
		"\7}\2\2\u0122&\3\2\2\2\u0123\u0124\7\177\2\2\u0124(\3\2\2\2\u0125\u0126"+
		"\7?\2\2\u0126*\3\2\2\2\u0127\u0128\7u\2\2\u0128\u0129\7g\2\2\u0129\u012a"+
		"\7p\2\2\u012a\u012b\7w\2\2\u012b\u012c\7o\2\2\u012c,\3\2\2\2\u012d\u012e"+
		"\7e\2\2\u012e\u012f\7q\2\2\u012f\u0130\7p\2\2\u0130\u0131\7u\2\2\u0131"+
		"\u0132\7v\2\2\u0132.\3\2\2\2\u0133\u0134\7]\2\2\u0134\60\3\2\2\2\u0135"+
		"\u0136\7_\2\2\u0136\62\3\2\2\2\u0137\u0138\7<\2\2\u0138\64\3\2\2\2\u0139"+
		"\u013a\7u\2\2\u013a\u013b\7v\2\2\u013b\u013c\7t\2\2\u013c\u013d\7w\2\2"+
		"\u013d\u013e\7e\2\2\u013e\u013f\7v\2\2\u013f\66\3\2\2\2\u0140\u0141\7"+
		"w\2\2\u0141\u0142\7p\2\2\u0142\u0143\7k\2\2\u0143\u0144\7q\2\2\u0144\u0145"+
		"\7p\2\2\u01458\3\2\2\2\u0146\u0147\7z\2\2\u0147\u0148\7u\2\2\u0148\u0149"+
		"\7f\2\2\u0149\u014a\7a\2\2\u014a\u014b\7c\2\2\u014b\u014c\7v\2\2\u014c"+
		"\u014d\7v\2\2\u014d\u014e\7t\2\2\u014e\u014f\7u\2\2\u014f:\3\2\2\2\u0150"+
		"\u0151\7g\2\2\u0151\u0152\7z\2\2\u0152\u0153\7e\2\2\u0153\u0154\7g\2\2"+
		"\u0154\u0155\7r\2\2\u0155\u0156\7v\2\2\u0156\u0157\7k\2\2\u0157\u0158"+
		"\7q\2\2\u0158\u0159\7p\2\2\u0159<\3\2\2\2\u015a\u015b\7u\2\2\u015b\u015c"+
		"\7g\2\2\u015c\u015d\7t\2\2\u015d\u015e\7x\2\2\u015e\u015f\7k\2\2\u015f"+
		"\u0160\7e\2\2\u0160\u0161\7g\2\2\u0161>\3\2\2\2\u0162\u0163\7g\2\2\u0163"+
		"\u0164\7z\2\2\u0164\u0165\7v\2\2\u0165\u0166\7g\2\2\u0166\u0167\7p\2\2"+
		"\u0167\u0168\7f\2\2\u0168\u0169\7u\2\2\u0169@\3\2\2\2\u016a\u016b\7*\2"+
		"\2\u016bB\3\2\2\2\u016c\u016d\7+\2\2\u016dD\3\2\2\2\u016e\u016f\7v\2\2"+
		"\u016f\u0170\7j\2\2\u0170\u0171\7t\2\2\u0171\u0172\7q\2\2\u0172\u0173"+
		"\7y\2\2\u0173\u0174\7u\2\2\u0174F\3\2\2\2\u0175\u0176\7x\2\2\u0176\u0177"+
		"\7q\2\2\u0177\u0178\7k\2\2\u0178\u0179\7f\2\2\u0179H\3\2\2\2\u017a\u017b"+
		"\7u\2\2\u017b\u017c\7v\2\2\u017c\u017d\7t\2\2\u017d\u017e\7k\2\2\u017e"+
		"\u017f\7p\2\2\u017f\u0180\7i\2\2\u0180J\3\2\2\2\u0181\u0182\7d\2\2\u0182"+
		"\u0183\7k\2\2\u0183\u0184\7p\2\2\u0184\u0185\7c\2\2\u0185\u0186\7t\2\2"+
		"\u0186\u0187\7{\2\2\u0187L\3\2\2\2\u0188\u0189\7u\2\2\u0189\u018a\7n\2"+
		"\2\u018a\u018b\7k\2\2\u018b\u018c\7u\2\2\u018c\u018d\7v\2\2\u018dN\3\2"+
		"\2\2\u018e\u018f\7d\2\2\u018f\u0190\7q\2\2\u0190\u0191\7q\2\2\u0191\u0192"+
		"\7n\2\2\u0192P\3\2\2\2\u0193\u0194\7d\2\2\u0194\u0195\7{\2\2\u0195\u0196"+
		"\7v\2\2\u0196\u0197\7g\2\2\u0197R\3\2\2\2\u0198\u0199\7k\2\2\u0199\u019a"+
		"\7\63\2\2\u019a\u019b\78\2\2\u019bT\3\2\2\2\u019c\u019d\7k\2\2\u019d\u019e"+
		"\7\65\2\2\u019e\u019f\7\64\2\2\u019fV\3\2\2\2\u01a0\u01a1\7k\2\2\u01a1"+
		"\u01a2\78\2\2\u01a2\u01a3\7\66\2\2\u01a3X\3\2\2\2\u01a4\u01a5\7f\2\2\u01a5"+
		"\u01a6\7q\2\2\u01a6\u01a7\7w\2\2\u01a7\u01a8\7d\2\2\u01a8\u01a9\7n\2\2"+
		"\u01a9\u01aa\7g\2\2\u01aaZ\3\2\2\2\u01ab\u01ac\7o\2\2\u01ac\u01ad\7c\2"+
		"\2\u01ad\u01ae\7r\2\2\u01ae\\\3\2\2\2\u01af\u01b0\7>\2\2\u01b0^\3\2\2"+
		"\2\u01b1\u01b2\7.\2\2\u01b2`\3\2\2\2\u01b3\u01b4\7@\2\2\u01b4b\3\2\2\2"+
		"\u01b5\u01b6\7u\2\2\u01b6\u01b7\7g\2\2\u01b7\u01b8\7v\2\2\u01b8d\3\2\2"+
		"\2\u01b9\u01ba\7n\2\2\u01ba\u01bb\7k\2\2\u01bb\u01bc\7u\2\2\u01bc\u01bd"+
		"\7v\2\2\u01bdf\3\2\2\2\u01be\u01bf\7=\2\2\u01bfh\3\2\2\2\u01c0\u01c1\7"+
		"e\2\2\u01c1\u01c2\7r\2\2\u01c2\u01c3\7r\2\2\u01c3\u01c4\7a\2\2\u01c4\u01c5"+
		"\7v\2\2\u01c5\u01c6\7{\2\2\u01c6\u01c7\7r\2\2\u01c7\u01c8\7g\2\2\u01c8"+
		"j\3\2\2\2\u01c9\u01ca\7z\2\2\u01ca\u01cb\7u\2\2\u01cb\u01cc\7f\2\2\u01cc"+
		"\u01cd\7a\2\2\u01cd\u01ce\7c\2\2\u01ce\u01cf\7n\2\2\u01cf\u01d0\7n\2\2"+
		"\u01d0l\3\2\2\2\u01d1\u01d2\7z\2\2\u01d2\u01d3\7u\2\2\u01d3\u01d4\7f\2"+
		"\2\u01d4\u01d5\7a\2\2\u01d5\u01d6\7q\2\2\u01d6\u01d7\7r\2\2\u01d7\u01d8"+
		"\7v\2\2\u01d8\u01d9\7k\2\2\u01d9\u01da\7q\2\2\u01da\u01db\7p\2\2\u01db"+
		"\u01dc\7c\2\2\u01dc\u01dd\7n\2\2\u01ddn\3\2\2\2\u01de\u01df\7z\2\2\u01df"+
		"\u01e0\7u\2\2\u01e0\u01e1\7f\2\2\u01e1\u01e2\7a\2\2\u01e2\u01e3\7p\2\2"+
		"\u01e3\u01e4\7k\2\2\u01e4\u01e5\7n\2\2\u01e5\u01e6\7n\2\2\u01e6\u01e7"+
		"\7c\2\2\u01e7\u01e8\7d\2\2\u01e8\u01e9\7n\2\2\u01e9\u01ea\7g\2\2\u01ea"+
		"p\3\2\2\2\u01eb\u01ec\7t\2\2\u01ec\u01ed\7g\2\2\u01ed\u01ee\7s\2\2\u01ee"+
		"\u01ef\7w\2\2\u01ef\u01f0\7k\2\2\u01f0\u01f1\7t\2\2\u01f1\u01f2\7g\2\2"+
		"\u01f2\u01fc\7f\2\2\u01f3\u01f4\7q\2\2\u01f4\u01f5\7r\2\2\u01f5\u01f6"+
		"\7v\2\2\u01f6\u01f7\7k\2\2\u01f7\u01f8\7q\2\2\u01f8\u01f9\7p\2\2\u01f9"+
		"\u01fa\7c\2\2\u01fa\u01fc\7n\2\2\u01fb\u01eb\3\2\2\2\u01fb\u01f3\3\2\2"+
		"\2\u01fcr\3\2\2\2\u01fd\u01fe\7q\2\2\u01fe\u01ff\7p\2\2\u01ff\u0200\7"+
		"g\2\2\u0200\u0201\7y\2\2\u0201\u0202\7c\2\2\u0202\u0203\7{\2\2\u0203t"+
		"\3\2\2\2\u0204\u020a\5\u0089E\2\u0205\u0209\5\u0089E\2\u0206\u0209\5\u008b"+
		"F\2\u0207\u0209\7\60\2\2\u0208\u0205\3\2\2\2\u0208\u0206\3\2\2\2\u0208"+
		"\u0207\3\2\2\2\u0209\u020c\3\2\2\2\u020a\u0208\3\2\2\2\u020a\u020b\3\2"+
		"\2\2\u020bv\3\2\2\2\u020c\u020a\3\2\2\2\u020d\u0213\5\u0089E\2\u020e\u0212"+
		"\5\u0089E\2\u020f\u0212\5\u008bF\2\u0210\u0212\4/\60\2\u0211\u020e\3\2"+
		"\2\2\u0211\u020f\3\2\2\2\u0211\u0210\3\2\2\2\u0212\u0215\3\2\2\2\u0213"+
		"\u0211\3\2\2\2\u0213\u0214\3\2\2\2\u0214x\3\2\2\2\u0215\u0213\3\2\2\2"+
		"\u0216\u021a\7$\2\2\u0217\u0219\13\2\2\2\u0218\u0217\3\2\2\2\u0219\u021c"+
		"\3\2\2\2\u021a\u021b\3\2\2\2\u021a\u0218\3\2\2\2\u021b\u021d\3\2\2\2\u021c"+
		"\u021a\3\2\2\2\u021d\u0227\7$\2\2\u021e\u0222\7)\2\2\u021f\u0221\13\2"+
		"\2\2\u0220\u021f\3\2\2\2\u0221\u0224\3\2\2\2\u0222\u0223\3\2\2\2\u0222"+
		"\u0220\3\2\2\2\u0223\u0225\3\2\2\2\u0224\u0222\3\2\2\2\u0225\u0227\7)"+
		"\2\2\u0226\u0216\3\2\2\2\u0226\u021e\3\2\2\2\u0227z\3\2\2\2\u0228\u022a"+
		"\5\u008fH\2\u0229\u0228\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022c\3\2\2"+
		"\2\u022b\u022d\5\u008bF\2\u022c\u022b\3\2\2\2\u022d\u022e\3\2\2\2\u022e"+
		"\u022c\3\2\2\2\u022e\u022f\3\2\2\2\u022f|\3\2\2\2\u0230\u0237\5{>\2\u0231"+
		"\u0233\7\60\2\2\u0232\u0234\5\u008bF\2\u0233\u0232\3\2\2\2\u0234\u0235"+
		"\3\2\2\2\u0235\u0233\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0238\3\2\2\2\u0237"+
		"\u0231\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u023c\3\2\2\2\u0239\u023a\5\u0091"+
		"I\2\u023a\u023b\5{>\2\u023b\u023d\3\2\2\2\u023c\u0239\3\2\2\2\u023c\u023d"+
		"\3\2\2\2\u023d\u024a\3\2\2\2\u023e\u0240\7\60\2\2\u023f\u0241\5\u008b"+
		"F\2\u0240\u023f\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0240\3\2\2\2\u0242"+
		"\u0243\3\2\2\2\u0243\u0247\3\2\2\2\u0244\u0245\5\u0091I\2\u0245\u0246"+
		"\5{>\2\u0246\u0248\3\2\2\2\u0247\u0244\3\2\2\2\u0247\u0248\3\2\2\2\u0248"+
		"\u024a\3\2\2\2\u0249\u0230\3\2\2\2\u0249\u023e\3\2\2\2\u024a~\3\2\2\2"+
		"\u024b\u024d\5\u008bF\2\u024c\u024b\3\2\2\2\u024d\u024e\3\2\2\2\u024e"+
		"\u024c\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u0254\7\60"+
		"\2\2\u0251\u0253\5\u008bF\2\u0252\u0251\3\2\2\2\u0253\u0256\3\2\2\2\u0254"+
		"\u0252\3\2\2\2\u0254\u0255\3\2\2\2\u0255\u025e\3\2\2\2\u0256\u0254\3\2"+
		"\2\2\u0257\u0259\7\60\2\2\u0258\u025a\5\u008bF\2\u0259\u0258\3\2\2\2\u025a"+
		"\u025b\3\2\2\2\u025b\u0259\3\2\2\2\u025b\u025c\3\2\2\2\u025c\u025e\3\2"+
		"\2\2\u025d\u024c\3\2\2\2\u025d\u0257\3\2\2\2\u025e\u0080\3\2\2\2\u025f"+
		"\u0264\7$\2\2\u0260\u0263\5\u008dG\2\u0261\u0263\13\2\2\2\u0262\u0260"+
		"\3\2\2\2\u0262\u0261\3\2\2\2\u0263\u0266\3\2\2\2\u0264\u0265\3\2\2\2\u0264"+
		"\u0262\3\2\2\2\u0265\u0267\3\2\2\2\u0266\u0264\3\2\2\2\u0267\u0268\7$"+
		"\2\2\u0268\u0082\3\2\2\2\u0269\u026a\7\61\2\2\u026a\u026b\7\61\2\2\u026b"+
		"\u026f\3\2\2\2\u026c\u026e\13\2\2\2\u026d\u026c\3\2\2\2\u026e\u0271\3"+
		"\2\2\2\u026f\u0270\3\2\2\2\u026f\u026d\3\2\2\2\u0270\u0272\3\2\2\2\u0271"+
		"\u026f\3\2\2\2\u0272\u0273\7\f\2\2\u0273\u0274\3\2\2\2\u0274\u0275\bB"+
		"\2\2\u0275\u0084\3\2\2\2\u0276\u0277\7\61\2\2\u0277\u0278\7,\2\2\u0278"+
		"\u027c\3\2\2\2\u0279\u027b\13\2\2\2\u027a\u0279\3\2\2\2\u027b\u027e\3"+
		"\2\2\2\u027c\u027d\3\2\2\2\u027c\u027a\3\2\2\2\u027d\u027f\3\2\2\2\u027e"+
		"\u027c\3\2\2\2\u027f\u0280\7,\2\2\u0280\u0281\7\61\2\2\u0281\u0282\3\2"+
		"\2\2\u0282\u0283\bC\2\2\u0283\u0086\3\2\2\2\u0284\u0286\t\2\2\2\u0285"+
		"\u0284\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u0285\3\2\2\2\u0287\u0288\3\2"+
		"\2\2\u0288\u0289\3\2\2\2\u0289\u028a\bD\3\2\u028a\u0088\3\2\2\2\u028b"+
		"\u028c\t\3\2\2\u028c\u008a\3\2\2\2\u028d\u028e\t\4\2\2\u028e\u008c\3\2"+
		"\2\2\u028f\u0290\7^\2\2\u0290\u0291\t\5\2\2\u0291\u008e\3\2\2\2\u0292"+
		"\u0293\t\6\2\2\u0293\u0090\3\2\2\2\u0294\u0295\t\7\2\2\u0295\u0092\3\2"+
		"\2\2\34\2\u01fb\u0208\u020a\u0211\u0213\u021a\u0222\u0226\u0229\u022e"+
		"\u0235\u0237\u023c\u0242\u0247\u0249\u024e\u0254\u025b\u025d\u0262\u0264"+
		"\u026f\u027c\u0287\4\2\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}