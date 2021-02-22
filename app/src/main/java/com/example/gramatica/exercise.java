/* The following code was generated by JFlex 1.7.0 */

/*Primera seccion, librerias */
package com.example.gramatica;
import java_cup.runtime.*;
import static com.example.gramatica.sym.*;
import com.example.DAO.Token;
import com.example.DAO.TokenError;
import java.util.ArrayList;
import java.util.List;

/*Segunda seccion, config*/

/**
 * This class is a scanner generated by
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>graficadora.jflex</tt>
 */
public class exercise implements java_cup.runtime.Scanner {

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
          "\10\0\3\1\1\0\2\1\22\0\1\1\7\0\1\33\1\34\1\31"+
                  "\1\27\1\35\1\30\1\3\1\32\12\2\47\0\1\4\1\26\1\21"+
                  "\1\15\1\14\1\22\1\23\1\0\1\17\1\12\1\0\1\7\1\16"+
                  "\1\20\1\11\1\25\1\0\1\10\1\0\1\24\1\6\1\13\3\0"+
                  "\1\5\u05e5\0\12\2\206\0\12\2\306\0\12\2\u019c\0\12\2\166\0"+
                  "\12\2\166\0\12\2\166\0\12\2\166\0\12\2\166\0\12\2\166\0"+
                  "\12\2\166\0\12\2\166\0\12\2\166\0\12\2\140\0\12\2\166\0"+
                  "\12\2\106\0\12\2\u0116\0\12\2\106\0\12\2\u0746\0\12\2\46\0"+
                  "\12\2\u012c\0\12\2\200\0\12\2\246\0\12\2\6\0\12\2\266\0"+
                  "\12\2\126\0\12\2\206\0\12\2\6\0\12\2\u89c6\0\12\2\u02a6\0"+
                  "\12\2\46\0\12\2\306\0\12\2\26\0\12\2\126\0\12\2\u0196\0"+
                  "\12\2\u5316\0\12\2\u0586\0\12\2\u0bbc\0\12\2\200\0\12\2\74\0"+
                  "\12\2\220\0\12\2\u0116\0\12\2\u0156\0\12\2\166\0\12\2\u0176\0"+
                  "\12\2\146\0\12\2\146\0\12\2\u01a6\0\12\2\u0366\0\12\2\u4e06\0"+
                  "\12\2\346\0\12\2\u6c74\0\62\2\u1150\0\12\2\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\u16b5\0";

  /**
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
          "\1\0\1\1\1\2\1\3\12\1\1\4\1\5\1\6"+
                  "\1\7\1\10\1\11\1\12\21\0\1\3\22\0\1\13"+
                  "\20\0\1\14\4\0\1\15\4\0\1\16\2\0\1\17"+
                  "\10\0\1\20\2\0\1\21\1\0\1\22\1\23\1\24"+
                  "\1\0\1\25";

  private static int [] zzUnpackAction() {
    int [] result = new int[106];
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
          "\0\0\0\36\0\36\0\74\0\132\0\170\0\226\0\264"+
                  "\0\322\0\360\0\u010e\0\u012c\0\u014a\0\u0168\0\36\0\36"+
                  "\0\36\0\36\0\36\0\36\0\36\0\u0186\0\u01a4\0\u01c2"+
                  "\0\u01e0\0\u01fe\0\u021c\0\u023a\0\u0258\0\u0276\0\u0294\0\u02b2"+
                  "\0\u02d0\0\u02ee\0\u030c\0\u032a\0\u0348\0\u0366\0\u0186\0\u0384"+
                  "\0\u03a2\0\u03c0\0\u03de\0\u03fc\0\u041a\0\u0438\0\u0456\0\u0474"+
                  "\0\u0492\0\u04b0\0\u04ce\0\u04ec\0\u050a\0\u0528\0\u0546\0\u0564"+
                  "\0\u0582\0\36\0\u05a0\0\u05be\0\u05dc\0\u05fa\0\u0618\0\u0636"+
                  "\0\u0654\0\u0672\0\u0690\0\u06ae\0\u06cc\0\u06ea\0\u0708\0\u0726"+
                  "\0\u0744\0\u0762\0\36\0\u0780\0\u079e\0\u07bc\0\u07da\0\36"+
                  "\0\u07f8\0\u0816\0\u0834\0\u0852\0\36\0\u0870\0\u088e\0\36"+
                  "\0\u08ac\0\u08ca\0\u08e8\0\u0906\0\u0924\0\u0942\0\u0960\0\u097e"+
                  "\0\36\0\u099c\0\u09ba\0\36\0\u09d8\0\36\0\36\0\36"+
                  "\0\u09f6\0\36";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[106];
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
          "\1\2\1\3\1\4\1\2\1\5\2\2\1\6\1\7"+
                  "\1\10\1\2\1\11\2\2\1\12\1\2\1\13\1\14"+
                  "\1\2\1\15\1\2\1\16\1\2\1\17\1\20\1\21"+
                  "\1\22\1\23\1\24\1\25\40\0\1\4\1\26\37\0"+
                  "\1\27\10\0\1\30\1\0\1\31\34\0\1\32\27\0"+
                  "\1\33\2\0\1\34\47\0\1\35\23\0\1\36\32\0"+
                  "\1\37\30\0\1\40\7\0\1\41\25\0\1\42\1\0"+
                  "\1\43\10\0\1\44\26\0\1\45\36\0\1\46\26\0"+
                  "\1\47\41\0\1\50\33\0\1\51\50\0\1\52\4\0"+
                  "\1\53\31\0\1\54\27\0\1\55\44\0\1\56\26\0"+
                  "\1\57\33\0\1\60\35\0\1\61\35\0\1\62\50\0"+
                  "\1\63\34\0\1\64\17\0\1\65\3\0\1\66\35\0"+
                  "\1\67\31\0\1\70\40\0\1\71\35\0\1\72\36\0"+
                  "\1\73\43\0\1\74\33\0\1\75\35\0\1\76\32\0"+
                  "\1\72\50\0\1\77\25\0\1\100\36\0\1\64\24\0"+
                  "\1\101\35\0\1\102\41\0\1\55\41\0\1\72\36\0"+
                  "\1\103\33\0\1\104\43\0\1\105\36\0\1\106\32\0"+
                  "\1\107\35\0\1\110\22\0\1\111\41\0\1\112\31\0"+
                  "\1\113\35\0\1\114\55\0\1\115\26\0\1\55\40\0"+
                  "\1\116\25\0\1\117\31\0\1\120\37\0\1\121\46\0"+
                  "\1\122\41\0\1\123\21\0\1\124\36\0\1\125\44\0"+
                  "\1\126\36\0\1\127\26\0\1\130\36\0\1\131\27\0"+
                  "\1\132\40\0\1\133\47\0\1\134\25\0\1\135\33\0"+
                  "\1\55\37\0\1\136\47\0\1\137\16\0\1\72\46\0"+
                  "\1\140\31\0\1\141\30\0\1\142\51\0\1\143\25\0"+
                  "\1\144\33\0\1\145\40\0\1\146\34\0\1\147\36\0"+
                  "\1\150\33\0\1\151\37\0\1\152\24\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2580];
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
          "Unknown internal scanner error",
          "Error: could not match input",
          "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
          "\1\0\2\11\13\1\7\11\21\0\1\1\22\0\1\11"+
                  "\20\0\1\11\4\0\1\11\4\0\1\11\2\0\1\11"+
                  "\10\0\1\11\2\0\1\11\1\0\3\11\1\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[106];
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
   * zzAtBOL == true iff the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true iff the scanner is at the EOF */
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
  //Creamos un listado de los operadores invocados
  ArrayList<Token> listadoOperadoresInvocados = new ArrayList();
  ArrayList<TokenError> listadoErroresLexicos = new ArrayList();

  //Funciones
  //retorna un simbolo despues de crear un nuevo token y agregarlo al listado
  private Symbol retornarSimbolo(int tipo, String tipoToken, String lexema, int fila, int columna){
    //creamos un  token auxiliar
    Token tokenAux = new Token(tipoToken, lexema, fila, columna);
    //Agregamos al listado
    listadoOperadoresInvocados.add(tokenAux);
    //retornamos el token aux como simbolo
    return new Symbol(tipo, tokenAux);
  }

  //Agregamos un token al array list de errores lexicos
  private void addErrorLexico(String tipoToken, String lexema, String msgError, int fila, int columna){
    //creamos un  token auxiliar
    TokenError tokenErrorAux = new TokenError(tipoToken, lexema, msgError, fila, columna);
    //Agregamos al listado
    listadoErroresLexicos.add(tokenErrorAux);
  }

  //Obtenemos el arrLust de los errores lexicos
  public ArrayList<TokenError> obtenerListadoErroresLexicos(){
    return listadoErroresLexicos;
  }

  //Obtenemos el lstado de los tokens
  public ArrayList<Token> obtenerListadoTokens(){
    return listadoOperadoresInvocados;
  }



  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public exercise(java.io.Reader in) {
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
    while (i < 326) {
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
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
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

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        zzDoEOF();
        { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
          { addErrorLexico ("LEXICO", yytext(), "Token no valido",yyline + 1, yycolumn + 1);
          }
          // fall through
          case 22: break;
          case 2:
          { /*  */
          }
          // fall through
          case 23: break;
          case 3:
          { return retornarSimbolo(ENTERO         , "ENTERO"         , yytext(), yyline + 1, yycolumn + 1);
          }
          // fall through
          case 24: break;
          case 4:
          { return retornarSimbolo(SUMA           , "SUMA"           , yytext(), yyline + 1, yycolumn + 1);
          }
          // fall through
          case 25: break;
          case 5:
          { return retornarSimbolo(RESTA          , "RESTA"          , yytext(), yyline + 1, yycolumn + 1);
          }
          // fall through
          case 26: break;
          case 6:
          { return retornarSimbolo(MULTIPLICACION , "MULTIPLICACION" , yytext(), yyline + 1, yycolumn + 1);
          }
          // fall through
          case 27: break;
          case 7:
          { return retornarSimbolo(DIVISION       , "DIVISION"       , yytext(), yyline + 1, yycolumn + 1);
          }
          // fall through
          case 28: break;
          case 8:
          { return retornarSimbolo(PARENTESISA    , "PARENTESISA"    , yytext(), yyline + 1, yycolumn + 1);
          }
          // fall through
          case 29: break;
          case 9:
          { return retornarSimbolo(PARENTESISB    , "PARENTESISB"    , yytext(), yyline + 1, yycolumn + 1);
          }
          // fall through
          case 30: break;
          case 10:
          { return retornarSimbolo(COMA           , "COMA"           , yytext(), yyline + 1, yycolumn + 1);
          }
          // fall through
          case 31: break;
          case 11:
          { return retornarSimbolo(COLOR          , "COLOR"          , yytext(), yyline + 1, yycolumn + 1);
          }
          // fall through
          case 32: break;
          case 12:
          { return retornarSimbolo(LINEA          , "LINEA"          , yytext(), yyline + 1, yycolumn + 1);
          }
          // fall through
          case 33: break;
          case 13:
          { return retornarSimbolo(CURVA          , "CURVA"          , yytext(), yyline + 1, yycolumn + 1);
          }
          // fall through
          case 34: break;
          case 14:
          { return retornarSimbolo(ANIMAR         , "ANIMAR"         , yytext(), yyline + 1, yycolumn + 1);
          }
          // fall through
          case 35: break;
          case 15:
          { return retornarSimbolo(OBJETO         , "OBJETO"         , yytext(), yyline + 1, yycolumn + 1);
          }
          // fall through
          case 36: break;
          case 16:
          { return retornarSimbolo(CIRCULO        , "CIRCULO"        , yytext(), yyline + 1, yycolumn + 1);
          }
          // fall through
          case 37: break;
          case 17:
          { return retornarSimbolo(ANTERIOR       , "ANTERIOR"       , yytext(), yyline + 1, yycolumn + 1);
          }
          // fall through
          case 38: break;
          case 18:
          { return retornarSimbolo(CUADRADO       , "CUADRADO"       , yytext(), yyline + 1, yycolumn + 1);
          }
          // fall through
          case 39: break;
          case 19:
          { return retornarSimbolo(GRAFICAR       , "GRAFICAR"       , yytext(), yyline + 1, yycolumn + 1);
          }
          // fall through
          case 40: break;
          case 20:
          { return retornarSimbolo(POLIGONO       , "POLIGONO"       , yytext(), yyline + 1, yycolumn + 1);
          }
          // fall through
          case 41: break;
          case 21:
          { return retornarSimbolo(RECTANGULO     , "RECTANGULO"     , yytext(), yyline + 1, yycolumn + 1);
          }
          // fall through
          case 42: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }

  /**
   * Converts an int token code into the name of the
   * token by reflection on the cup symbol class/interface sym
   *
   * This code was contributed by Karl Meissner <meissnersd@yahoo.com>
   */
  private String getTokenName(int token) {
    try {
      java.lang.reflect.Field [] classFields = sym.class.getFields();
      for (int i = 0; i < classFields.length; i++) {
        if (classFields[i].getInt(null) == token) {
          return classFields[i].getName();
        }
      }
    } catch (Exception e) {
      e.printStackTrace(System.err);
    }

    return "UNKNOWN TOKEN";
  }

  /**
   * Same as next_token but also prints the token to standard out
   * for debugging.
   *
   * This code was contributed by Karl Meissner <meissnersd@yahoo.com>
   */
  public java_cup.runtime.Symbol debug_next_token() throws java.io.IOException {
    java_cup.runtime.Symbol s = next_token();
    System.out.println( "line:" + (yyline+1) + " col:" + (yycolumn+1) + " --"+ yytext() + "--" + getTokenName(s.sym) + "--");
    return s;
  }

  /**
   * Runs the scanner on input files.
   *
   * This main method is the debugging routine for the scanner.
   * It prints debugging information about each returned token to
   * System.out until the end of file is reached, or an error occured.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String argv[]) {
    if (argv.length == 0) {
      System.out.println("Usage : java exercise [ --encoding <name> ] <inputfile(s)>");
    }
    else {
      int firstFilePos = 0;
      String encodingName = "UTF-8";
      if (argv[0].equals("--encoding")) {
        firstFilePos = 2;
        encodingName = argv[1];
        try {
          java.nio.charset.Charset.forName(encodingName); // Side-effect: is encodingName valid?
        } catch (Exception e) {
          System.out.println("Invalid encoding '" + encodingName + "'");
          return;
        }
      }
      for (int i = firstFilePos; i < argv.length; i++) {
        exercise scanner = null;
        try {
          java.io.FileInputStream stream = new java.io.FileInputStream(argv[i]);
          java.io.Reader reader = new java.io.InputStreamReader(stream, encodingName);
          scanner = new exercise(reader);
          while ( !scanner.zzAtEOF ) scanner.debug_next_token();
        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
      }
    }
  }


}