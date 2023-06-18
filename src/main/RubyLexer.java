// DO NOT EDIT
// Generated by JFlex 1.9.1 http://jflex.de/
// source: src/jflex/ruby.flex



@SuppressWarnings("fallthrough")
class RubyLexer {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;
  public static final int STRING = 2;
  public static final int ML_STRING = 4;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0,  0,  1,  1,  2, 2
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\37\u0100\1\u0200\267\u0100\10\u0300\u1020\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\1\3\1\4\1\5\22\0\1\1"+
    "\1\6\1\7\1\10\1\11\2\12\1\13\2\14\1\15"+
    "\1\16\1\14\1\16\1\17\1\20\1\21\1\22\6\23"+
    "\2\24\2\14\1\25\1\26\1\27\1\30\1\14\1\31"+
    "\1\32\1\31\1\33\1\34\1\35\1\36\1\37\1\40"+
    "\1\41\1\37\1\42\1\37\1\43\11\37\1\44\2\37"+
    "\1\14\1\45\1\14\1\12\1\46\1\14\1\47\1\50"+
    "\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\41"+
    "\1\60\1\61\1\62\1\63\1\64\1\65\1\37\1\66"+
    "\1\67\1\70\1\71\1\37\1\72\1\73\1\74\1\37"+
    "\1\14\1\12\2\14\6\0\1\3\u01a2\0\2\3\326\0"+
    "\u0100\3";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1024];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\1\1\3\2\1\1\1\3\1\4\1\1\5\5"+
    "\2\6\3\5\3\7\1\1\20\7\1\10\2\11\1\12"+
    "\1\1\2\10\1\1\1\0\2\4\1\7\5\6\1\0"+
    "\2\6\1\0\1\6\1\0\3\7\1\0\10\7\1\13"+
    "\17\7\1\0\1\14\1\6\1\0\3\6\1\0\1\7"+
    "\2\0\6\7\1\13\16\7\2\6\1\0\1\7\2\0"+
    "\7\7\2\6\2\0\1\7\2\6\2\0\1\7\2\6"+
    "\2\0\1\7\2\6\1\0\1\13\2\6\1\0\2\6"+
    "\1\0\1\6\1\0\1\15\1\6\1\0\1\6\1\0"+
    "\1\6\1\0\1\6\1\0\1\6\1\0\1\6\1\0"+
    "\1\6\1\0\4\6";

  private static int [] zzUnpackAction() {
    int [] result = new int[183];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\75\0\172\0\267\0\364\0\267\0\u0131\0\u016e"+
    "\0\u01ab\0\u01e8\0\u0225\0\u016e\0\267\0\u0262\0\u029f\0\u02dc"+
    "\0\u0319\0\u0356\0\u0393\0\u03d0\0\u040d\0\u044a\0\u0487\0\u04c4"+
    "\0\u0501\0\u053e\0\u057b\0\u05b8\0\u05f5\0\u0632\0\u066f\0\u06ac"+
    "\0\u06e9\0\u0726\0\u0763\0\u07a0\0\u07dd\0\u081a\0\u0857\0\u0894"+
    "\0\u08d1\0\u090e\0\267\0\u094b\0\267\0\u0988\0\267\0\u09c5"+
    "\0\u0a02\0\u0a3f\0\267\0\u0a7c\0\u0ab9\0\u0af6\0\u0b33\0\u0b70"+
    "\0\u0bad\0\u0bea\0\u0c27\0\u0c64\0\267\0\u0ca1\0\u0cde\0\u0d1b"+
    "\0\267\0\u0d58\0\u0d95\0\u0dd2\0\u0e0f\0\u0e4c\0\u0e89\0\u0ec6"+
    "\0\u0f03\0\u0f40\0\u0f7d\0\u0fba\0\u044a\0\u0ff7\0\u1034\0\u1071"+
    "\0\u10ae\0\u10eb\0\u1128\0\u1165\0\u11a2\0\u11df\0\u121c\0\u1259"+
    "\0\u1296\0\u12d3\0\u1310\0\u134d\0\u138a\0\267\0\u13c7\0\u1404"+
    "\0\u1441\0\u147e\0\u14bb\0\u14f8\0\u1535\0\u1572\0\u15af\0\u15ec"+
    "\0\u1629\0\u1666\0\u16a3\0\u16e0\0\u171d\0\u175a\0\u1797\0\u17d4"+
    "\0\u1811\0\u184e\0\u188b\0\u18c8\0\u1905\0\u1942\0\u197f\0\u19bc"+
    "\0\u19f9\0\u1a36\0\u1a73\0\u1ab0\0\u1aed\0\u1b2a\0\u1b67\0\u1ba4"+
    "\0\u1be1\0\u1c1e\0\u1c5b\0\u1c98\0\u1cd5\0\u1d12\0\u1d4f\0\u1d8c"+
    "\0\u1dc9\0\u1e06\0\u1e43\0\u1e80\0\u1ebd\0\u1efa\0\u1f37\0\u1f74"+
    "\0\u1fb1\0\u1fee\0\u202b\0\u2068\0\u20a5\0\u20e2\0\u211f\0\u215c"+
    "\0\u2199\0\u21d6\0\u2213\0\267\0\u2250\0\u228d\0\u22ca\0\u2307"+
    "\0\u2344\0\u2381\0\u23be\0\u23fb\0\u20e2\0\u2438\0\u2475\0\u24b2"+
    "\0\u24ef\0\u252c\0\u2569\0\u25a6\0\u25e3\0\u2620\0\u265d\0\u269a"+
    "\0\u26d7\0\u2714\0\u2751\0\u278e\0\u27cb\0\u2808\0\u2845";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[183];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length() - 1;
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpacktrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\4\1\5\1\6\1\4\1\5\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\11\1\15\1\16\1\14\1\17"+
    "\1\20\1\21\3\22\1\23\1\24\1\25\1\15\1\26"+
    "\1\27\1\26\1\30\10\26\1\4\1\31\1\32\1\33"+
    "\1\34\1\35\1\36\1\37\2\26\1\40\2\26\1\41"+
    "\1\42\1\43\1\26\1\44\1\45\1\46\1\47\1\50"+
    "\1\26\1\51\2\52\1\53\2\52\1\54\1\52\1\55"+
    "\35\52\1\56\31\52\1\57\2\52\1\60\1\52\1\61"+
    "\35\52\1\56\27\52\76\0\1\5\2\0\1\5\72\0"+
    "\1\6\120\0\1\15\55\0\1\62\3\0\1\62\61\0"+
    "\2\12\1\63\2\12\1\64\67\12\31\0\14\65\2\0"+
    "\26\65\15\0\1\14\10\0\1\15\65\0\1\15\1\0"+
    "\4\66\70\0\1\14\5\0\1\15\65\0\1\66\1\0"+
    "\1\67\1\70\1\71\1\72\7\0\1\73\1\74\4\0"+
    "\1\75\1\0\1\76\6\0\1\73\1\74\4\0\1\75"+
    "\11\0\1\76\20\0\1\66\1\0\4\22\7\0\1\73"+
    "\1\74\4\0\1\75\3\0\1\77\4\0\1\73\1\74"+
    "\4\0\1\75\40\0\1\14\2\15\73\0\1\15\21\0"+
    "\1\100\52\0\1\15\1\14\53\0\1\101\12\0\4\26"+
    "\1\0\1\101\1\0\1\101\14\26\1\0\27\26\6\0"+
    "\1\101\12\0\4\26\1\0\1\101\1\0\1\101\3\26"+
    "\1\102\10\26\1\0\27\26\6\0\1\101\12\0\4\26"+
    "\1\0\1\101\1\0\1\101\12\26\1\103\1\26\1\0"+
    "\27\26\46\0\1\104\34\0\1\101\12\0\4\26\1\0"+
    "\1\101\1\0\1\101\14\26\1\0\13\26\1\105\1\26"+
    "\1\106\3\26\1\107\5\26\6\0\1\101\12\0\4\26"+
    "\1\0\1\101\1\0\1\101\14\26\1\0\5\26\1\110"+
    "\12\26\1\111\6\26\6\0\1\101\12\0\4\26\1\0"+
    "\1\101\1\0\1\101\14\26\1\0\1\26\1\112\11\26"+
    "\1\113\13\26\6\0\1\101\12\0\4\26\1\0\1\101"+
    "\1\0\1\101\14\26\1\0\5\26\1\114\10\26\1\115"+
    "\10\26\6\0\1\101\12\0\4\26\1\0\1\101\1\0"+
    "\1\101\14\26\1\0\13\26\1\116\1\26\1\117\11\26"+
    "\6\0\1\101\12\0\4\26\1\0\1\101\1\0\1\101"+
    "\14\26\1\0\1\26\1\120\14\26\1\43\10\26\6\0"+
    "\1\101\12\0\4\26\1\0\1\101\1\0\1\101\14\26"+
    "\1\0\6\26\1\115\6\26\1\115\11\26\6\0\1\101"+
    "\12\0\4\26\1\0\1\101\1\0\1\101\14\26\1\0"+
    "\16\26\1\121\10\26\6\0\1\101\12\0\4\26\1\0"+
    "\1\101\1\0\1\101\14\26\1\0\5\26\1\122\3\26"+
    "\1\123\4\26\1\124\10\26\6\0\1\101\12\0\4\26"+
    "\1\0\1\101\1\0\1\101\14\26\1\0\20\26\1\115"+
    "\6\26\6\0\1\101\12\0\4\26\1\0\1\101\1\0"+
    "\1\101\14\26\1\0\5\26\1\125\21\26\6\0\1\101"+
    "\12\0\4\26\1\0\1\101\1\0\1\101\14\26\1\0"+
    "\5\26\1\126\15\26\1\127\3\26\6\0\1\101\12\0"+
    "\4\26\1\0\1\101\1\0\1\101\14\26\1\0\10\26"+
    "\1\130\7\26\1\131\6\26\6\0\1\101\12\0\4\26"+
    "\1\0\1\101\1\0\1\101\14\26\1\0\15\26\1\132"+
    "\11\26\6\0\1\101\12\0\4\26\1\0\1\101\1\0"+
    "\1\101\14\26\1\0\10\26\1\133\16\26\6\0\1\101"+
    "\12\0\4\26\1\0\1\101\1\0\1\101\14\26\1\0"+
    "\11\26\1\134\15\26\2\52\1\0\2\52\1\0\1\52"+
    "\1\0\35\52\1\0\27\52\2\0\1\53\72\0\2\57"+
    "\4\0\67\57\2\0\1\57\101\0\1\135\74\0\1\136"+
    "\3\0\1\136\63\0\1\63\113\0\4\65\4\0\14\65"+
    "\1\0\27\65\21\0\4\66\7\0\1\73\1\74\15\0"+
    "\1\73\1\74\37\0\1\66\1\0\1\67\1\70\1\71"+
    "\1\72\7\0\1\73\1\74\4\0\1\75\10\0\1\73"+
    "\1\74\4\0\1\75\32\0\1\66\1\0\3\71\1\72"+
    "\7\0\1\73\1\74\4\0\1\75\10\0\1\73\1\74"+
    "\4\0\1\75\32\0\1\66\1\0\3\137\1\72\7\0"+
    "\1\73\1\74\4\0\1\75\10\0\1\73\1\74\4\0"+
    "\1\75\32\0\1\66\1\0\4\72\7\0\1\73\1\74"+
    "\15\0\1\73\1\74\36\0\1\140\2\0\4\141\111\0"+
    "\1\75\54\0\1\142\3\143\4\0\5\143\11\0\6\143"+
    "\41\0\4\77\15\0\1\75\3\0\1\77\12\0\1\75"+
    "\66\0\1\144\27\0\1\101\12\0\4\26\1\0\1\101"+
    "\1\0\1\101\5\26\1\145\6\26\1\0\27\26\6\0"+
    "\1\101\12\0\4\26\1\0\1\101\1\0\1\101\2\26"+
    "\1\115\11\26\1\0\27\26\35\0\1\146\4\0\1\147"+
    "\40\0\1\101\12\0\4\26\1\0\1\101\1\0\1\101"+
    "\14\26\1\0\11\26\1\150\15\26\6\0\1\101\12\0"+
    "\4\26\1\0\1\101\1\0\1\101\14\26\1\0\4\26"+
    "\1\115\22\26\6\0\1\101\12\0\4\26\1\0\1\101"+
    "\1\0\1\101\14\26\1\0\21\26\1\151\5\26\6\0"+
    "\1\101\12\0\4\26\1\0\1\101\1\0\1\101\14\26"+
    "\1\0\7\26\1\152\17\26\6\0\1\101\12\0\4\26"+
    "\1\0\1\101\1\0\1\101\14\26\1\0\5\26\1\153"+
    "\21\26\6\0\1\101\12\0\4\26\1\0\1\101\1\0"+
    "\1\101\14\26\1\0\21\26\1\154\5\26\6\0\1\101"+
    "\12\0\4\26\1\0\1\101\1\0\1\101\14\26\1\0"+
    "\1\26\1\155\25\26\6\0\1\101\12\0\4\26\1\0"+
    "\1\101\1\0\1\101\14\26\1\0\6\26\1\156\20\26"+
    "\6\0\1\101\12\0\4\26\1\0\1\101\1\0\1\101"+
    "\14\26\1\0\21\26\1\157\5\26\6\0\1\101\12\0"+
    "\4\26\1\0\1\101\1\0\1\101\14\26\1\0\4\26"+
    "\1\115\14\26\1\160\5\26\6\0\1\101\12\0\4\26"+
    "\1\0\1\101\1\0\1\101\14\26\1\0\13\26\1\112"+
    "\13\26\6\0\1\101\12\0\4\26\1\0\1\101\1\0"+
    "\1\101\14\26\1\0\4\26\1\161\22\26\6\0\1\101"+
    "\12\0\4\26\1\0\1\101\1\0\1\101\14\26\1\0"+
    "\25\26\1\124\1\26\6\0\1\101\12\0\4\26\1\0"+
    "\1\101\1\0\1\101\14\26\1\0\13\26\1\115\13\26"+
    "\6\0\1\101\12\0\4\26\1\0\1\101\1\0\1\101"+
    "\14\26\1\0\22\26\1\115\4\26\6\0\1\101\12\0"+
    "\4\26\1\0\1\101\1\0\1\101\14\26\1\0\4\26"+
    "\1\162\14\26\1\163\1\164\4\26\6\0\1\101\12\0"+
    "\4\26\1\0\1\101\1\0\1\101\14\26\1\0\13\26"+
    "\1\165\13\26\6\0\1\101\12\0\4\26\1\0\1\101"+
    "\1\0\1\101\14\26\1\0\17\26\1\166\7\26\6\0"+
    "\1\101\12\0\4\26\1\0\1\101\1\0\1\101\14\26"+
    "\1\0\5\26\1\167\21\26\6\0\1\101\12\0\4\26"+
    "\1\0\1\101\1\0\1\101\14\26\1\0\23\26\1\154"+
    "\3\26\6\0\1\101\12\0\4\26\1\0\1\101\1\0"+
    "\1\101\14\26\1\0\4\26\1\170\6\26\1\171\6\26"+
    "\1\172\4\26\6\0\1\101\12\0\4\26\1\0\1\101"+
    "\1\0\1\101\14\26\1\0\5\26\1\167\3\26\1\173"+
    "\15\26\6\0\1\101\12\0\4\26\1\0\1\101\1\0"+
    "\1\101\14\26\1\0\5\26\1\174\21\26\7\0\1\55"+
    "\104\0\1\66\1\0\3\175\1\72\7\0\1\73\1\74"+
    "\4\0\1\75\10\0\1\73\1\74\4\0\1\75\34\0"+
    "\4\141\71\0\4\141\10\0\1\74\16\0\1\74\41\0"+
    "\1\142\3\143\4\0\5\143\4\0\1\75\4\0\6\143"+
    "\4\0\1\75\34\0\4\176\4\0\5\176\4\0\1\75"+
    "\4\0\6\176\4\0\1\75\70\0\1\177\25\0\1\101"+
    "\12\0\4\26\1\0\1\101\1\0\1\101\7\26\1\200"+
    "\4\26\1\0\27\26\40\0\1\201\74\0\1\202\42\0"+
    "\1\101\12\0\4\26\1\0\1\101\1\0\1\101\14\26"+
    "\1\0\1\26\1\203\25\26\6\0\1\101\12\0\4\26"+
    "\1\0\1\101\1\0\1\101\14\26\1\0\5\26\1\204"+
    "\21\26\6\0\1\101\12\0\4\26\1\0\1\101\1\0"+
    "\1\101\14\26\1\0\11\26\1\167\15\26\6\0\1\101"+
    "\12\0\4\26\1\0\1\101\1\0\1\101\14\26\1\0"+
    "\1\26\1\205\25\26\6\0\1\101\12\0\4\26\1\0"+
    "\1\101\1\0\1\101\14\26\1\0\5\26\1\115\21\26"+
    "\6\0\1\101\12\0\4\26\1\0\1\101\1\0\1\101"+
    "\14\26\1\0\21\26\1\203\5\26\6\0\1\101\12\0"+
    "\4\26\1\0\1\101\1\0\1\101\14\26\1\0\11\26"+
    "\1\206\15\26\6\0\1\101\12\0\4\26\1\0\1\101"+
    "\1\0\1\101\14\26\1\0\5\26\1\115\3\26\1\165"+
    "\15\26\6\0\1\101\12\0\4\26\1\0\1\101\1\0"+
    "\1\101\14\26\1\0\23\26\1\207\3\26\6\0\1\101"+
    "\12\0\4\26\1\0\1\101\1\0\1\101\14\26\1\0"+
    "\23\26\1\173\3\26\6\0\1\101\12\0\4\26\1\0"+
    "\1\101\1\0\1\101\14\26\1\0\16\26\1\115\10\26"+
    "\6\0\1\101\12\0\4\26\1\0\1\101\1\0\1\101"+
    "\14\26\1\0\3\26\1\131\23\26\6\0\1\101\12\0"+
    "\4\26\1\0\1\101\1\0\1\101\14\26\1\0\20\26"+
    "\1\210\2\26\1\211\3\26\6\0\1\101\12\0\4\26"+
    "\1\0\1\101\1\0\1\101\14\26\1\0\6\26\1\115"+
    "\20\26\6\0\1\101\12\0\4\26\1\0\1\101\1\0"+
    "\1\101\14\26\1\0\5\26\1\43\21\26\6\0\1\101"+
    "\12\0\4\26\1\0\1\101\1\0\1\101\14\26\1\0"+
    "\15\26\1\115\11\26\6\0\1\101\12\0\4\26\1\0"+
    "\1\101\1\0\1\101\14\26\1\0\5\26\1\165\21\26"+
    "\6\0\1\101\12\0\4\26\1\0\1\101\1\0\1\101"+
    "\14\26\1\0\5\26\1\155\21\26\6\0\1\101\12\0"+
    "\4\26\1\0\1\101\1\0\1\101\14\26\1\0\11\26"+
    "\1\123\15\26\6\0\1\101\12\0\4\26\1\0\1\101"+
    "\1\0\1\101\14\26\1\0\13\26\1\154\13\26\6\0"+
    "\1\101\12\0\4\26\1\0\1\101\1\0\1\101\14\26"+
    "\1\0\13\26\1\106\13\26\17\0\1\66\1\0\3\212"+
    "\1\72\7\0\1\73\1\74\4\0\1\75\10\0\1\73"+
    "\1\74\4\0\1\75\34\0\4\213\4\0\5\213\4\0"+
    "\1\75\4\0\6\213\4\0\1\75\72\0\1\214\23\0"+
    "\1\101\12\0\4\26\1\0\1\101\1\0\1\101\12\26"+
    "\1\115\1\26\1\0\27\26\42\0\1\215\75\0\1\215"+
    "\37\0\1\101\12\0\4\26\1\0\1\101\1\0\1\101"+
    "\14\26\1\0\21\26\1\115\5\26\6\0\1\101\12\0"+
    "\4\26\1\0\1\101\1\0\1\101\14\26\1\0\20\26"+
    "\1\124\6\26\6\0\1\101\12\0\4\26\1\0\1\101"+
    "\1\0\1\101\14\26\1\0\12\26\1\115\14\26\6\0"+
    "\1\101\12\0\4\26\1\0\1\101\1\0\1\101\14\26"+
    "\1\0\15\26\1\216\11\26\6\0\1\101\12\0\4\26"+
    "\1\0\1\101\1\0\1\101\14\26\1\0\20\26\1\154"+
    "\6\26\6\0\1\101\12\0\4\26\1\0\1\101\1\0"+
    "\1\101\14\26\1\0\26\26\1\115\6\0\1\101\12\0"+
    "\4\26\1\0\1\101\1\0\1\101\14\26\1\0\20\26"+
    "\1\167\6\26\17\0\1\66\1\0\3\217\1\72\7\0"+
    "\1\73\1\74\4\0\1\75\10\0\1\73\1\74\4\0"+
    "\1\75\34\0\4\220\4\0\5\220\4\0\1\75\4\0"+
    "\6\220\4\0\1\75\76\0\1\221\45\0\1\222\46\0"+
    "\1\101\12\0\4\26\1\0\1\101\1\0\1\101\14\26"+
    "\1\0\5\26\1\223\21\26\17\0\1\66\1\0\3\224"+
    "\1\72\7\0\1\73\1\74\4\0\1\75\10\0\1\73"+
    "\1\74\4\0\1\75\34\0\4\225\4\0\5\225\4\0"+
    "\1\75\4\0\6\225\4\0\1\75\13\0\3\226\2\0"+
    "\70\226\46\0\1\227\34\0\1\101\12\0\4\26\1\0"+
    "\1\101\1\0\1\101\14\26\1\0\4\26\1\230\22\26"+
    "\17\0\1\66\1\0\3\231\1\72\7\0\1\73\1\74"+
    "\4\0\1\75\10\0\1\73\1\74\4\0\1\75\34\0"+
    "\4\232\4\0\5\232\4\0\1\75\4\0\6\232\4\0"+
    "\1\75\13\0\3\226\2\0\21\226\1\233\46\226\46\0"+
    "\1\234\34\0\1\101\12\0\4\26\1\0\1\101\1\0"+
    "\1\234\14\26\1\0\27\26\17\0\1\66\1\0\3\235"+
    "\1\72\7\0\1\73\1\74\4\0\1\75\10\0\1\73"+
    "\1\74\4\0\1\75\34\0\4\236\4\0\5\236\4\0"+
    "\1\75\4\0\6\236\4\0\1\75\13\0\3\226\2\0"+
    "\21\226\1\233\24\226\1\237\21\226\17\0\1\66\1\0"+
    "\3\240\1\72\7\0\1\73\1\74\4\0\1\75\10\0"+
    "\1\73\1\74\4\0\1\75\34\0\4\241\4\0\5\241"+
    "\4\0\1\75\4\0\6\241\4\0\1\75\13\0\3\226"+
    "\2\0\21\226\1\233\34\226\1\242\11\226\17\0\1\66"+
    "\1\0\3\243\1\72\7\0\1\73\1\74\4\0\1\75"+
    "\10\0\1\73\1\74\4\0\1\75\34\0\4\244\4\0"+
    "\5\244\4\0\1\75\4\0\6\244\4\0\1\75\13\0"+
    "\3\226\2\0\21\226\1\233\23\226\1\245\22\226\17\0"+
    "\1\66\1\0\3\246\1\72\7\0\1\73\1\74\4\0"+
    "\1\75\10\0\1\73\1\74\4\0\1\75\34\0\4\247"+
    "\4\0\5\247\4\0\1\75\4\0\6\247\4\0\1\75"+
    "\32\0\1\66\1\0\3\250\1\72\7\0\1\73\1\74"+
    "\4\0\1\75\10\0\1\73\1\74\4\0\1\75\34\0"+
    "\4\251\4\0\5\251\4\0\1\75\4\0\6\251\4\0"+
    "\1\75\32\0\1\66\1\0\3\252\1\72\7\0\1\73"+
    "\1\74\4\0\1\75\10\0\1\73\1\74\4\0\1\75"+
    "\34\0\4\253\4\0\5\253\4\0\1\75\4\0\6\253"+
    "\4\0\1\75\32\0\1\66\1\0\3\254\1\72\7\0"+
    "\1\73\1\74\4\0\1\75\10\0\1\73\1\74\4\0"+
    "\1\75\34\0\4\255\4\0\5\255\4\0\1\75\4\0"+
    "\6\255\4\0\1\75\32\0\1\66\1\0\3\256\1\72"+
    "\7\0\1\73\1\74\4\0\1\75\10\0\1\73\1\74"+
    "\4\0\1\75\34\0\4\257\4\0\5\257\4\0\1\75"+
    "\4\0\6\257\4\0\1\75\32\0\1\66\1\0\3\260"+
    "\1\72\7\0\1\73\1\74\4\0\1\75\10\0\1\73"+
    "\1\74\4\0\1\75\34\0\4\261\4\0\5\261\4\0"+
    "\1\75\4\0\6\261\4\0\1\75\32\0\1\66\1\0"+
    "\3\262\1\72\7\0\1\73\1\74\4\0\1\75\10\0"+
    "\1\73\1\74\4\0\1\75\34\0\4\263\4\0\5\263"+
    "\4\0\1\75\4\0\6\263\4\0\1\75\32\0\1\66"+
    "\1\0\3\264\1\72\7\0\1\73\1\74\4\0\1\75"+
    "\10\0\1\73\1\74\4\0\1\75\55\0\1\75\16\0"+
    "\1\75\32\0\1\66\1\0\3\265\1\72\7\0\1\73"+
    "\1\74\4\0\1\75\10\0\1\73\1\74\4\0\1\75"+
    "\32\0\1\66\1\0\3\266\1\72\7\0\1\73\1\74"+
    "\4\0\1\75\10\0\1\73\1\74\4\0\1\75\32\0"+
    "\1\66\1\0\3\267\1\72\7\0\1\73\1\74\4\0"+
    "\1\75\10\0\1\73\1\74\4\0\1\75\32\0\1\66"+
    "\1\0\4\72\7\0\1\73\1\74\4\0\1\75\10\0"+
    "\1\73\1\74\4\0\1\75\13\0";

  private static int [] zzUnpacktrans() {
    int [] result = new int[10370];
    int offset = 0;
    offset = zzUnpacktrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpacktrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\3\0\1\11\1\1\1\11\6\1\1\11\35\1\1\11"+
    "\1\1\1\11\1\1\1\11\2\1\1\0\1\11\7\1"+
    "\1\0\1\1\1\11\1\0\1\1\1\0\1\11\2\1"+
    "\1\0\30\1\1\0\1\11\1\1\1\0\3\1\1\0"+
    "\1\1\2\0\27\1\1\0\1\1\2\0\11\1\2\0"+
    "\3\1\2\0\3\1\2\0\3\1\1\0\1\11\2\1"+
    "\1\0\2\1\1\0\1\1\1\0\2\1\1\0\1\1"+
    "\1\0\1\1\1\0\1\1\1\0\1\1\1\0\1\1"+
    "\1\0\1\1\1\0\4\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[183];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen())];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;

  /* user code: */
  private String yyString;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  RubyLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** Returns the maximum size of the scanner buffer, which limits the size of tokens. */
  private int zzMaxBufferLen() {
    return Integer.MAX_VALUE;
  }

  /**  Whether the scanner buffer can grow to accommodate a larger token. */
  private boolean zzCanGrow() {
    return true;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate && zzCanGrow()) {
      /* if not, and it can grow: blow it up */
      char newBuffer[] = new char[Math.min(zzBuffer.length * 2, zzMaxBufferLen())];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      if (requested == 0) {
        throw new java.io.EOFException("Scan buffer limit reached ["+zzBuffer.length+"]");
      }
      else {
        throw new java.io.IOException(
            "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
      }
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    int initBufferSize = Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen());
    if (zzBuffer.length > initBufferSize) {
      zzBuffer = new char[initBufferSize];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  public Token yylex() throws java.io.IOException
  {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof)
            zzPeek = false;
          else
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
              {
                return new Token(TokenType.END_OF_FILE);
              }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { throw new RuntimeException(String.format("Input Not Found: %s", yytext()));
            }
          // fall through
          case 14: break;
          case 2:
            { 
            }
          // fall through
          case 15: break;
          case 3:
            { yybegin(STRING);
                                    yyString = "";
            }
          // fall through
          case 16: break;
          case 4:
            { // ignore single line comments
            }
          // fall through
          case 17: break;
          case 5:
            { return new Token(TokenType.OPERATOR, yytext());
            }
          // fall through
          case 18: break;
          case 6:
            { return new Token(TokenType.NUMBER, yytext());
            }
          // fall through
          case 19: break;
          case 7:
            { return new Token(TokenType.IDENTIFIER, yytext());
            }
          // fall through
          case 20: break;
          case 8:
            { yyString += yytext();
            }
          // fall through
          case 21: break;
          case 9:
            { throw new RuntimeException(String.format("Unterminated String: %s at line %d col %d", yytext(), yyline, yycolumn));
            }
          // fall through
          case 22: break;
          case 10:
            { yybegin(YYINITIAL);
                                     // length also includes the trailing quote
                                     return new Token(TokenType.LITERAL, yyString);
            }
          // fall through
          case 23: break;
          case 11:
            { return new Token(TokenType.KEYWORD, yytext());
            }
          // fall through
          case 24: break;
          case 12:
            { yybegin(ML_STRING);
                                    yyString = "";
            }
          // fall through
          case 25: break;
          case 13:
            { // ignore embedded documentation
            }
          // fall through
          case 26: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
