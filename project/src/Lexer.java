/* The following code was generated by JFlex 1.6.0 */

import java_cup.runtime.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.0
 * from the specification file <tt>src/Lexer.lex</tt>
 */
public class Lexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\34\1\6\1\10\1\11\1\7\22\0\1\34\1\41\1\12"+
    "\1\17\2\0\1\45\1\5\1\51\1\52\1\43\1\42\1\37\1\14"+
    "\1\15\1\16\1\1\11\2\1\36\1\35\1\47\1\40\1\50\2\0"+
    "\5\3\1\13\15\3\1\13\6\3\1\55\1\0\1\56\1\44\1\4"+
    "\1\0\1\22\1\24\1\20\1\62\1\60\1\32\1\3\1\21\1\27"+
    "\2\3\1\26\1\65\1\30\1\25\1\33\1\61\1\23\1\57\1\31"+
    "\1\63\1\3\1\64\3\3\1\53\1\46\1\54\7\0\1\10\u1fa2\0"+
    "\1\10\1\10\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\1\3\1\1\2\4\1\1\1\5"+
    "\1\6\1\7\1\10\1\1\12\3\1\11\1\12\1\13"+
    "\1\14\1\15\1\16\1\17\1\20\2\1\1\21\1\22"+
    "\1\23\1\24\1\25\1\26\1\27\1\30\5\3\4\0"+
    "\1\31\1\0\1\32\2\0\5\3\1\33\1\3\1\34"+
    "\1\35\5\3\1\36\2\3\1\37\1\40\1\41\1\42"+
    "\1\43\1\15\1\44\2\3\1\45\3\3\2\0\1\46"+
    "\1\47\3\0\2\3\1\50\3\3\1\51\6\3\1\52"+
    "\4\3\3\0\1\53\1\4\1\3\1\54\1\3\1\55"+
    "\1\56\1\3\1\57\1\3\1\60\1\61\1\3\1\62"+
    "\2\63\1\0\1\64\2\3\1\65\1\66\2\67\1\70"+
    "\1\71";

  private static int [] zzUnpackAction() {
    int [] result = new int[140];
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
    "\0\0\0\66\0\154\0\242\0\330\0\u010e\0\66\0\u0144"+
    "\0\u017a\0\330\0\u01b0\0\66\0\u01e6\0\u021c\0\u0252\0\u0288"+
    "\0\u02be\0\u02f4\0\u032a\0\u0360\0\u0396\0\u03cc\0\u0402\0\u0438"+
    "\0\66\0\u046e\0\66\0\u04a4\0\u04da\0\66\0\66\0\66"+
    "\0\u0510\0\u0546\0\u057c\0\66\0\66\0\66\0\66\0\66"+
    "\0\66\0\66\0\u05b2\0\u05e8\0\u061e\0\u0654\0\u068a\0\u06c0"+
    "\0\u06f6\0\u072c\0\u017a\0\66\0\u0762\0\u0798\0\u07ce\0\u021c"+
    "\0\u0804\0\u083a\0\u0870\0\u08a6\0\u08dc\0\330\0\u0912\0\u0870"+
    "\0\330\0\u0948\0\u097e\0\u09b4\0\u09ea\0\u0a20\0\330\0\u0a56"+
    "\0\u0a8c\0\66\0\66\0\66\0\66\0\66\0\66\0\66"+
    "\0\u0ac2\0\u0af8\0\330\0\u0b2e\0\u0b64\0\u0b9a\0\u0bd0\0\u0c06"+
    "\0\u06f6\0\66\0\u0c3c\0\u0c72\0\u0ca8\0\u0cde\0\u0d14\0\330"+
    "\0\u0d4a\0\u0d80\0\u0db6\0\330\0\u0dec\0\u0e22\0\u0e58\0\u0e8e"+
    "\0\u0ec4\0\u0efa\0\330\0\u0f30\0\u0f66\0\u0f9c\0\u0fd2\0\u1008"+
    "\0\u103e\0\u1074\0\u0c72\0\u07ce\0\u10aa\0\330\0\u10e0\0\330"+
    "\0\330\0\u1116\0\330\0\u114c\0\330\0\330\0\u1182\0\330"+
    "\0\66\0\u11b8\0\u11ee\0\330\0\u1224\0\u125a\0\330\0\330"+
    "\0\66\0\u1290\0\330\0\330";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[140];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\2\1\6\1\7\1\10"+
    "\1\2\1\7\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\5\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\5\1\26\1\27\1\30\1\7\1\31\1\32\1\33"+
    "\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43"+
    "\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53"+
    "\1\54\1\5\1\55\1\5\1\56\1\57\72\0\1\60"+
    "\10\0\1\61\51\0\2\4\1\0\1\60\10\0\1\61"+
    "\51\0\4\5\6\0\1\5\4\0\14\5\23\0\7\5"+
    "\6\62\4\0\54\62\6\0\1\7\57\0\12\63\1\64"+
    "\53\63\1\0\1\65\1\66\102\0\1\67\46\0\6\70"+
    "\1\7\1\10\2\0\54\70\1\0\4\5\6\0\1\5"+
    "\4\0\1\5\1\71\12\5\23\0\7\5\1\0\4\5"+
    "\6\0\1\5\4\0\6\5\1\72\5\5\23\0\7\5"+
    "\1\0\4\5\6\0\1\5\4\0\2\5\1\73\11\5"+
    "\23\0\1\5\1\74\5\5\1\0\4\5\6\0\1\5"+
    "\4\0\5\5\1\75\6\5\23\0\7\5\1\0\4\5"+
    "\6\0\1\5\4\0\14\5\23\0\3\5\1\76\3\5"+
    "\1\0\4\5\6\0\1\5\4\0\14\5\23\0\1\5"+
    "\1\77\5\5\1\0\4\5\6\0\1\5\4\0\10\5"+
    "\1\100\1\5\1\101\1\5\23\0\7\5\1\0\4\5"+
    "\6\0\1\5\4\0\1\5\1\102\3\5\1\103\6\5"+
    "\23\0\3\5\1\104\3\5\1\0\4\5\6\0\1\5"+
    "\4\0\5\5\1\105\1\106\1\107\4\5\23\0\3\5"+
    "\1\110\3\5\1\0\4\5\6\0\1\5\4\0\3\5"+
    "\1\111\10\5\23\0\7\5\36\0\1\112\1\0\1\113"+
    "\75\0\1\114\55\0\1\115\72\0\1\116\66\0\1\117"+
    "\57\0\1\120\26\0\4\5\6\0\1\5\4\0\14\5"+
    "\23\0\1\5\1\121\5\5\1\0\4\5\6\0\1\5"+
    "\4\0\6\5\1\122\5\5\23\0\7\5\1\0\4\5"+
    "\6\0\1\5\4\0\5\5\1\123\1\5\1\124\4\5"+
    "\23\0\7\5\1\0\4\5\6\0\1\5\4\0\1\5"+
    "\1\125\12\5\23\0\7\5\1\0\4\5\6\0\1\5"+
    "\4\0\2\5\1\126\11\5\23\0\7\5\1\0\1\127"+
    "\1\130\64\0\2\131\70\0\1\132\64\0\1\133\10\0"+
    "\1\134\51\0\2\66\1\0\1\133\10\0\1\134\50\0"+
    "\10\67\2\0\5\67\1\135\46\67\1\0\4\5\6\0"+
    "\1\5\4\0\2\5\1\136\11\5\23\0\7\5\1\0"+
    "\4\5\6\0\1\5\4\0\7\5\1\137\4\5\23\0"+
    "\7\5\1\0\4\5\6\0\1\5\4\0\11\5\1\140"+
    "\2\5\23\0\7\5\1\0\4\5\6\0\1\5\4\0"+
    "\2\5\1\141\6\5\1\142\2\5\23\0\7\5\1\0"+
    "\4\5\6\0\1\5\4\0\5\5\1\143\6\5\23\0"+
    "\7\5\1\0\4\5\6\0\1\5\4\0\10\5\1\144"+
    "\3\5\23\0\7\5\1\0\4\5\6\0\1\5\4\0"+
    "\14\5\23\0\1\5\1\145\5\5\1\0\4\5\6\0"+
    "\1\5\4\0\13\5\1\140\23\0\7\5\1\0\4\5"+
    "\6\0\1\5\4\0\14\5\23\0\1\5\1\146\5\5"+
    "\1\0\4\5\6\0\1\5\4\0\3\5\1\147\10\5"+
    "\23\0\7\5\1\0\4\5\6\0\1\5\4\0\5\5"+
    "\1\150\6\5\23\0\7\5\1\0\4\5\6\0\1\5"+
    "\4\0\14\5\23\0\1\5\1\151\5\5\1\0\4\5"+
    "\6\0\1\5\4\0\7\5\1\152\4\5\23\0\7\5"+
    "\1\0\4\5\6\0\1\5\4\0\14\5\23\0\2\5"+
    "\1\153\4\5\1\0\4\5\6\0\1\5\4\0\14\5"+
    "\23\0\1\154\6\5\1\0\4\5\6\0\1\5\4\0"+
    "\1\155\13\5\23\0\7\5\1\0\4\5\6\0\1\5"+
    "\4\0\7\5\1\156\4\5\23\0\7\5\1\0\4\5"+
    "\6\0\1\5\4\0\7\5\1\157\4\5\23\0\7\5"+
    "\16\0\1\160\50\0\2\130\13\0\1\160\50\0\1\161"+
    "\1\162\64\0\2\163\63\0\10\67\2\0\4\67\1\164"+
    "\1\135\46\67\1\0\4\5\6\0\1\5\4\0\3\5"+
    "\1\140\10\5\23\0\7\5\1\0\4\5\6\0\1\5"+
    "\4\0\2\5\1\165\11\5\23\0\7\5\1\0\4\5"+
    "\6\0\1\5\4\0\14\5\23\0\3\5\1\166\3\5"+
    "\1\0\4\5\6\0\1\5\4\0\14\5\23\0\4\5"+
    "\1\167\2\5\1\0\4\5\6\0\1\5\4\0\6\5"+
    "\1\140\5\5\23\0\7\5\1\0\4\5\6\0\1\5"+
    "\4\0\10\5\1\170\3\5\23\0\7\5\1\0\4\5"+
    "\6\0\1\5\4\0\12\5\1\171\1\5\23\0\7\5"+
    "\1\0\4\5\6\0\1\5\4\0\2\5\1\172\11\5"+
    "\23\0\7\5\1\0\4\5\6\0\1\5\4\0\2\5"+
    "\1\73\11\5\23\0\7\5\1\0\4\5\6\0\1\5"+
    "\4\0\12\5\1\173\1\5\23\0\7\5\1\0\4\5"+
    "\6\0\1\5\4\0\10\5\1\174\3\5\23\0\7\5"+
    "\1\0\4\5\6\0\1\5\4\0\14\5\23\0\1\5"+
    "\1\175\5\5\1\0\4\5\6\0\1\5\4\0\11\5"+
    "\1\176\2\5\23\0\7\5\1\0\4\5\6\0\1\5"+
    "\4\0\6\5\1\177\5\5\23\0\7\5\1\0\4\5"+
    "\6\0\1\5\4\0\10\5\1\200\3\5\23\0\7\5"+
    "\1\0\1\201\1\202\101\0\1\203\50\0\2\162\13\0"+
    "\1\203\50\0\4\5\6\0\1\5\4\0\14\5\23\0"+
    "\1\204\6\5\1\0\4\5\6\0\1\5\4\0\3\5"+
    "\1\205\10\5\23\0\7\5\1\0\4\5\6\0\1\5"+
    "\4\0\6\5\1\206\5\5\23\0\7\5\1\0\4\5"+
    "\6\0\1\5\4\0\11\5\1\207\2\5\23\0\7\5"+
    "\1\0\4\5\6\0\1\5\4\0\14\5\23\0\1\5"+
    "\1\210\5\5\1\0\2\202\64\0\1\211\1\212\64\0"+
    "\4\5\6\0\1\5\4\0\10\5\1\213\3\5\23\0"+
    "\7\5\1\0\4\5\6\0\1\5\4\0\6\5\1\214"+
    "\5\5\23\0\7\5\1\0\2\212\63\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4806];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
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


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\4\1\1\11\4\1\1\11\14\1\1\11"+
    "\1\1\1\11\2\1\3\11\3\1\7\11\5\1\4\0"+
    "\1\11\1\0\1\1\2\0\21\1\7\11\6\1\2\0"+
    "\1\1\1\11\3\0\22\1\3\0\16\1\1\11\1\1"+
    "\1\0\5\1\1\11\3\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[140];
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

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
  /* Code between %{ and %}, both of which must be at the beginning of a
  line, will be copied letter to letter into the lexer class source.
  Here you declare member variables and functions that are used inside
  scanner actions. */

  /* To create a new java_cup.runtime.Symbol with information about
       the current token, the token will have no value in this
       case. */
  private Symbol symbol(int type) {
    //System.out.print(type+" ");
        return new Symbol(type, yyline, yycolumn);
    }
    
    /* Also creates a new java_cup.runtime.Symbol with information
       about the current token, but this object has a value. */
    private Symbol symbol(int type, Object value) {
      //System.out.print(type+"("+value+") ");
        return new Symbol(type, yyline, yycolumn, value);
    }



  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 178) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;           
    int totalRead = 0;
    while (totalRead < requested) {
      int numRead = zzReader.read(zzBuffer, zzEndRead + totalRead, requested - totalRead);
      if (numRead == -1) {
        break;
      }
      totalRead += numRead;
    }

    if (totalRead > 0) {
      zzEndRead += totalRead;
      if (totalRead == requested) { /* possibly more input available */
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      return false;
    }

    // totalRead = 0: End of stream
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

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
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
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
        // peek one character ahead if it is \n (if we have counted one line too much)
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
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
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

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 1: 
          { throw new Error("Illegal character <"+yytext()+">");
          }
        case 58: break;
        case 2: 
          { return symbol(sym.INT_LITERAL, new Integer(yytext()));
          }
        case 59: break;
        case 3: 
          { return symbol(sym.IDENT, new String(yytext()));
          }
        case 60: break;
        case 4: 
          { 
          }
        case 61: break;
        case 5: 
          { return symbol(sym.BOOL_LITERAL, new Boolean(yytext()=="T"?true:false));
          }
        case 62: break;
        case 6: 
          { return symbol(sym.MINUS_OP);
          }
        case 63: break;
        case 7: 
          { return symbol(sym.DOT_OP);
          }
        case 64: break;
        case 8: 
          { return symbol(sym.DIV_OP);
          }
        case 65: break;
        case 9: 
          { return symbol(sym.SEMI);
          }
        case 66: break;
        case 10: 
          { return symbol(sym.COLON);
          }
        case 67: break;
        case 11: 
          { return symbol(sym.COMMA);
          }
        case 68: break;
        case 12: 
          { return symbol(sym.EQ_OP);
          }
        case 69: break;
        case 13: 
          { return symbol(sym.OR_OP);
          }
        case 70: break;
        case 14: 
          { return symbol(sym.PLUS_OP);
          }
        case 71: break;
        case 15: 
          { return symbol(sym.MULT_OP);
          }
        case 72: break;
        case 16: 
          { return symbol(sym.POW_OP);
          }
        case 73: break;
        case 17: 
          { return symbol(sym.LT_OP);
          }
        case 74: break;
        case 18: 
          { return symbol(sym.RANGLE);
          }
        case 75: break;
        case 19: 
          { return symbol(sym.LPAREN);
          }
        case 76: break;
        case 20: 
          { return symbol(sym.RPAREN);
          }
        case 77: break;
        case 21: 
          { return symbol(sym.LBRACE);
          }
        case 78: break;
        case 22: 
          { return symbol(sym.RBRACE);
          }
        case 79: break;
        case 23: 
          { return symbol(sym.LBRACK);
          }
        case 80: break;
        case 24: 
          { return symbol(sym.RBRACK);
          }
        case 81: break;
        case 25: 
          { return symbol(sym.STRING_LITERAL, new String(yytext()));
          }
        case 82: break;
        case 26: 
          { return symbol(sym.NEG_INT_LITERAL, new Integer(yytext()));
          }
        case 83: break;
        case 27: 
          { return symbol(sym.OD);
          }
        case 84: break;
        case 28: 
          { return symbol(sym.IN_OP);
          }
        case 85: break;
        case 29: 
          { return symbol(sym.IF);
          }
        case 86: break;
        case 30: 
          { return symbol(sym.FI);
          }
        case 87: break;
        case 31: 
          { return symbol(sym.CONCAT_OP);
          }
        case 88: break;
        case 32: 
          { return symbol(sym.ASSIGN_OP);
          }
        case 89: break;
        case 33: 
          { return symbol(sym.IMPL_OP);
          }
        case 90: break;
        case 34: 
          { return symbol(sym.NEQ_OP);
          }
        case 91: break;
        case 35: 
          { return symbol(sym.AND_OP);
          }
        case 92: break;
        case 36: 
          { return symbol(sym.LTE_OP);
          }
        case 93: break;
        case 37: 
          { return symbol(sym.DO);
          }
        case 94: break;
        case 38: 
          { return symbol(sym.FLOAT_LITERAL, new Float(yytext()));
          }
        case 95: break;
        case 39: 
          { return symbol(sym.CHAR_LITERAL, new Character(yytext().charAt(0)));
          }
        case 96: break;
        case 40: 
          { return symbol(sym.TYPE);
          }
        case 97: break;
        case 41: 
          { return symbol(sym.LEN);
          }
        case 98: break;
        case 42: 
          { return symbol(sym.SEQ);
          }
        case 99: break;
        case 43: 
          { return symbol(sym.NEG_FLOAT_LITERAL, new Float(yytext()));
          }
        case 100: break;
        case 44: 
          { return symbol(sym.READ);
          }
        case 101: break;
        case 45: 
          { return symbol(sym.THEN);
          }
        case 102: break;
        case 46: 
          { return symbol(sym.TDEF);
          }
        case 103: break;
        case 47: 
          { return symbol(sym.FDEF);
          }
        case 104: break;
        case 48: 
          { return symbol(sym.ELSE);
          }
        case 105: break;
        case 49: 
          { return symbol(sym.DICT);
          }
        case 106: break;
        case 50: 
          { return symbol(sym.MAIN);
          }
        case 107: break;
        case 51: 
          { return symbol(sym.RATIONAL_LITERAL, new String(yytext()));
          }
        case 108: break;
        case 52: 
          { return symbol(sym.ALIAS);
          }
        case 109: break;
        case 53: 
          { return symbol(sym.PRINT);
          }
        case 110: break;
        case 54: 
          { return symbol(sym.WHILE);
          }
        case 111: break;
        case 55: 
          { return symbol(sym.NEG_RATIONAL_LITERAL, new String(yytext()));
          }
        case 112: break;
        case 56: 
          { return symbol(sym.RETURN);
          }
        case 113: break;
        case 57: 
          { return symbol(sym.FORALL);
          }
        case 114: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
