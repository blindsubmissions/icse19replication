/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 12:17:28 GMT 2018
 */

package org.firebirdsql.encodings;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.firebirdsql.encodings.Encoding;
import org.firebirdsql.encodings.EncodingFactory;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EncodingFactory_ESTest extends EncodingFactory_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EncodingFactory.createEncoding("HY105");
      EncodingFactory.getCharacterSetSize(0);
      EncodingFactory.createEncoding("Cp1251");
      EncodingFactory.getEncoding("[ZyN_Yh@*|", (char[]) null);
      EncodingFactory.getIscEncoding(" could not be found.");
      EncodingFactory.getJavaEncodingForAlias((String) null);
      Encoding encoding0 = EncodingFactory.getEncoding("");
      EncodingFactory.getCharacterSetSize(1654);
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getJavaEncoding("");
      EncodingFactory.getEncoding("");
      EncodingFactory.getEncoding("v_c9qX,(", (char[]) null);
      Encoding encoding1 = EncodingFactory.getEncoding("", encodingFactory0.DEFAULT_MAPPING);
      assertFalse(encoding1.equals((Object)encoding0));
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = "\\#?6WrvWtE";
      char[] charArray0 = new char[2];
      charArray0[0] = 'w';
      charArray0[1] = ':';
      EncodingFactory.getEncoding("#?6WrvWtE", charArray0);
      String string1 = "]r.@7@)WD5,d\\'.w";
      String string2 = "";
      // Undeclared exception!
      EncodingFactory.getEncoding("]r.@7@)WD5,d'.w", "");
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.3393717343898155
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EncodingFactory.getJavaEncodingForAlias("4^");
      EncodingFactory.getIscEncoding("Exception. ");
      EncodingFactory.getEncoding((String) null, (String) null);
      EncodingFactory.getIscEncodingSize("4^");
      EncodingFactory.getJavaEncoding("4^");
      EncodingFactory.getCharacterSetSize((-1124));
      char[] charArray0 = new char[6];
      charArray0[0] = 'v';
      charArray0[1] = 'J';
      charArray0[2] = '9';
      charArray0[3] = 'U';
      charArray0[4] = 'M';
      charArray0[5] = 'p';
      EncodingFactory.getEncoding("Exception. ", charArray0);
      EncodingFactory.getJavaEncodingForAlias("ISO8859_8");
      EncodingFactory.getIscEncoding("ISO8859_8");
      EncodingFactory.getIscEncodingSize("");
      EncodingFactory.getCharacterSetSize(1);
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_8", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.5419764327628247
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = ")dveM1;Db8?p9%";
      EncodingFactory.getJavaEncoding(")dveM1;Db8?p9%");
      EncodingFactory.getIscEncoding("D2F$");
      String string1 = "";
      EncodingFactory.getJavaEncodingForAlias("");
      // Undeclared exception!
      try { 
        EncodingFactory.createEncoding((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.7565367399084861
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getIscEncodingSize("isc_encodings.properties");
      EncodingFactory.getIscEncoding("B4BW-yK/kp(RcA=XNCI");
      EncodingFactory.getIscEncoding("");
      EncodingFactory.getJavaEncoding((String) null);
      // Undeclared exception!
      try { 
        EncodingFactory.createEncoding((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.12693054534140227
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EncodingFactory.getIscEncodingSize((String) null);
      Encoding encoding0 = EncodingFactory.createEncoding("0H0^X!yH&fDSj}w");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.2047854169135204
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = "";
      EncodingFactory.getIscEncodingSize("");
      EncodingFactory.getJavaEncoding("");
      EncodingFactory.getCharacterSetSize((-1));
      EncodingFactory.getIscEncodingSize("");
      EncodingFactory.createEncoding("l7GS#sR.Wo6`=");
      EncodingFactory.getEncoding("");
      char[] charArray0 = new char[7];
      charArray0[0] = '5';
      charArray0[1] = 's';
      charArray0[2] = 'G';
      charArray0[3] = 'T';
      charArray0[4] = 'V';
      charArray0[5] = 'K';
      charArray0[6] = '|';
      EncodingFactory.getEncoding((String) null, charArray0);
      EncodingFactory.getEncoding((String) null);
      // Undeclared exception!
      EncodingFactory.getTranslator("l7GS#sR.Wo6`=");
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.9077607509414879
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EncodingFactory.getCharacterSetSize(65536);
      char[] charArray0 = new char[5];
      charArray0[0] = '*';
      charArray0[1] = 'F';
      charArray0[2] = 'X';
      charArray0[3] = ')';
      charArray0[4] = '/';
      Encoding encoding0 = EncodingFactory.getEncoding((String) null, charArray0);
      EncodingFactory.getEncoding("Cp863");
      EncodingFactory.createEncoding("db.");
      EncodingFactory.createEncoding("ISO8859_6");
      EncodingFactory.getEncoding("ISO8859_6");
      Encoding encoding1 = EncodingFactory.getEncoding("25000");
      assertFalse(encoding1.equals((Object)encoding0));
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.6313022594130944
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EncodingFactory.getIscEncodingSize("org.firebirdsql.encodings.CharacterTranslator");
      EncodingFactory.getJavaEncoding("org.firebirdsql.encodings.CharacterTranslator");
      char[] charArray0 = new char[8];
      charArray0[0] = 'l';
      charArray0[1] = 'z';
      charArray0[2] = 'g';
      charArray0[3] = '}';
      charArray0[4] = '=';
      charArray0[5] = ']';
      charArray0[6] = '\\';
      charArray0[7] = '9';
      EncodingFactory.getEncoding((String) null, charArray0);
      EncodingFactory encodingFactory0 = new EncodingFactory();
      String string0 = EncodingFactory.getJavaEncoding("isc_encodings.properties");
      assertNull(string0);
      
      EncodingFactory.getIscEncoding((String) null);
      EncodingFactory.getEncoding((String) null, (String) null);
      EncodingFactory.getIscEncoding((String) null);
      EncodingFactory.getIscEncodingSize((String) null);
      int int0 = EncodingFactory.getCharacterSetSize(4);
      assertEquals(4, int0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.4955539786605911
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EncodingFactory.getCharacterSetSize((-3625));
      EncodingFactory.getEncoding("ISO8859_9");
      char[] charArray0 = new char[6];
      charArray0[0] = 'l';
      charArray0[1] = '$';
      charArray0[2] = 'K';
      charArray0[3] = ';';
      charArray0[4] = 'X';
      charArray0[5] = '<';
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_9", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.530592547266804
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EncodingFactory.getCharacterSetSize(65536);
      char[] charArray0 = new char[5];
      EncodingFactory.getEncoding((String) null, charArray0);
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.createEncoding("We^v>/95");
      EncodingFactory.getCharacterSetSize((-3229));
      EncodingFactory.getJavaEncodingForAlias("isc_encodings.properties");
      EncodingFactory.getIscEncodingSize("Cp860");
      EncodingFactory.getJavaEncodingForAlias("Cp1257");
      EncodingFactory.getCharacterSetSize(4);
      EncodingFactory.getJavaEncoding("ISO8859_4");
      char[] charArray1 = new char[1];
      charArray1[0] = '}';
      EncodingFactory.getEncoding("WIN1257", charArray1);
      EncodingFactory.getEncoding("Cp860", encodingFactory0.DEFAULT_MAPPING);
      // Undeclared exception!
      EncodingFactory.getTranslator("Cp860");
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.6078432867642234
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EncodingFactory.getCharacterSetSize(0);
      EncodingFactory.createEncoding("Cp1251");
      EncodingFactory.getEncoding("[ZyN_Yh@*|", (char[]) null);
      EncodingFactory.getIscEncoding("HY105");
      EncodingFactory.getJavaEncodingForAlias((String) null);
      EncodingFactory.getEncoding("");
      EncodingFactory.getCharacterSetSize(1654);
      EncodingFactory encodingFactory0 = new EncodingFactory();
      char[] charArray0 = new char[1];
      charArray0[0] = 'M';
      EncodingFactory.getEncoding((String) null, charArray0);
      EncodingFactory.getCharacterSetSize(2143);
      Encoding encoding0 = EncodingFactory.getEncoding("Cp1257", encodingFactory0.DEFAULT_MAPPING);
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.8771109532844323
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EncodingFactory.createEncoding("01S06");
      EncodingFactory.getJavaEncodingForAlias(" found.");
      char[] charArray0 = new char[4];
      charArray0[0] = '1';
      EncodingFactory.getEncoding("? bRBXv=0!**^", charArray0);
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.createEncoding("isc_encoding_size.properties");
      EncodingFactory.getCharacterSetSize(1067);
      EncodingFactory.getJavaEncodingForAlias("Cp863");
      EncodingFactory.getIscEncodingSize("org.firebirdsql.encodings.Encoding_ISO8859_8");
      EncodingFactory.getJavaEncodingForAlias("org.firebirdsql.encodings.Encoding_ISO8859_8");
      EncodingFactory.getCharacterSetSize(53);
      EncodingFactory.getJavaEncoding((String) null);
      EncodingFactory.getEncoding("Cp1254", encodingFactory0.DEFAULT_MAPPING);
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp1254", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.7664123555634648
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EncodingFactory.getJavaEncodingForAlias("4^");
      EncodingFactory.getIscEncoding("Exception. ");
      EncodingFactory.getEncoding((String) null, (String) null);
      EncodingFactory.getIscEncodingSize("4^");
      EncodingFactory.getJavaEncoding("4^");
      EncodingFactory.getCharacterSetSize((-1124));
      char[] charArray0 = new char[6];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp852", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.167019129614686
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EncodingFactory.getCharacterSetSize(1);
      EncodingFactory.getEncoding("Ny|<!yB)O% B");
      Encoding encoding0 = EncodingFactory.getEncoding("v_c9qX,(", (char[]) null);
      EncodingFactory.getEncoding("Ny|<!yB)O% B", (char[]) null);
      EncodingFactory.getIscEncodingSize("ISO8859_6");
      Encoding encoding1 = EncodingFactory.createEncoding("+{");
      assertFalse(encoding1.equals((Object)encoding0));
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.4182608415450186
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EncodingFactory.getJavaEncodingForAlias("4^");
      EncodingFactory.getIscEncoding("Exception. ");
      EncodingFactory.getEncoding((String) null, (String) null);
      EncodingFactory.getIscEncodingSize("4^");
      EncodingFactory.getJavaEncoding("4^");
      EncodingFactory.getCharacterSetSize((-1124));
      char[] charArray0 = new char[6];
      charArray0[0] = 'v';
      charArray0[1] = 'O';
      charArray0[2] = '9';
      charArray0[3] = 'U';
      charArray0[4] = 'M';
      charArray0[5] = 'p';
      EncodingFactory.getEncoding("Exception. ", charArray0);
      EncodingFactory.getJavaEncodingForAlias("ISO8859_8");
      EncodingFactory.getIscEncoding("ISO8859_8");
      EncodingFactory.createEncoding("ISO8859_8");
      EncodingFactory.getEncoding((String) null);
      Encoding encoding0 = EncodingFactory.getEncoding("Cp864");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.4794090592280063
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EncodingFactory.getCharacterSetSize(65536);
      char[] charArray0 = new char[5];
      charArray0[0] = '*';
      charArray0[1] = 'F';
      EncodingFactory.getJavaEncodingForAlias("utf8");
      String string0 = "RMo:^S/nCz";
      EncodingFactory.getIscEncodingSize("");
      EncodingFactory.getEncoding("Cp857");
      // Undeclared exception!
      EncodingFactory.getTranslator("");
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.2857297786730009
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getEncoding("isc_encodings.properties", encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getIscEncoding("isc_encoding_size.properties");
      EncodingFactory.getIscEncoding("isc_encoding_size.properties");
      EncodingFactory.getEncoding("DOS864");
      EncodingFactory.getJavaEncodingForAlias("");
      EncodingFactory.getIscEncodingSize("8r{8J7U/A)r");
      EncodingFactory.createEncoding("Cp1256");
      EncodingFactory.getEncoding("RMo:^S/nCz");
      // Undeclared exception!
      EncodingFactory.getTranslator("isc_encodings.properties");
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.9627055474542263
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EncodingFactory.getJavaEncodingForAlias("4^");
      EncodingFactory.getCharacterSetSize((-1147130608));
      String string0 = "ISO8859_9";
      EncodingFactory.getEncoding("ISO8859_2");
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_2", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      char[] charArray0 = new char[8];
      charArray0[0] = '-';
      charArray0[1] = 'U';
      charArray0[2] = 'L';
      charArray0[3] = 'j';
      charArray0[4] = ')';
      charArray0[5] = '&';
      charArray0[6] = 'P';
      charArray0[7] = 'y';
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp737", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.12693054534140227
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      EncodingFactory.getIscEncodingSize((String) null);
      Encoding encoding0 = EncodingFactory.createEncoding("ISO8859_13");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EncodingFactory.getJavaEncoding("Cp1250");
      EncodingFactory.getJavaEncoding((String) null);
      EncodingFactory.createEncoding("NONE");
      String string0 = "k";
      // Undeclared exception!
      EncodingFactory.getTranslator("k");
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.9433794572946459
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      EncodingFactory.getCharacterSetSize(0);
      String string0 = "Cp1251";
      EncodingFactory.createEncoding("Cp1251");
      String string1 = "[ZyN_Yh@*|";
      EncodingFactory.getEncoding("[ZyN_Yh@*|", (char[]) null);
      EncodingFactory.getIscEncoding("HY105");
      String string2 = null;
      EncodingFactory.getJavaEncodingForAlias((String) null);
      EncodingFactory.getEncoding("");
      EncodingFactory.getCharacterSetSize(1676);
      String string3 = "ISO8859_13";
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_13", (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.3592367006650063
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      EncodingFactory.createEncoding("01S06");
      EncodingFactory.getJavaEncodingForAlias(" found.");
      char[] charArray0 = new char[4];
      charArray0[0] = '1';
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp1251", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.3877456392347236
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      EncodingFactory.createEncoding("01S06");
      EncodingFactory.getJavaEncodingForAlias(" found.");
      char[] charArray0 = new char[4];
      charArray0[0] = '1';
      EncodingFactory.getEncoding("R%J", charArray0);
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.createEncoding("");
      EncodingFactory.getCharacterSetSize(1067);
      EncodingFactory.getJavaEncodingForAlias((String) null);
      EncodingFactory.getIscEncodingSize("? bRBXv=0!**^");
      EncodingFactory.getJavaEncodingForAlias("isc_encodings.properties");
      EncodingFactory.getCharacterSetSize(35);
      EncodingFactory.getJavaEncoding("R%J");
      EncodingFactory.getEncoding("isc_encoding_size.properties", encodingFactory0.DEFAULT_MAPPING);
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp863", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.4540634237218675
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String string0 = "4^";
      EncodingFactory.getJavaEncodingForAlias("4^");
      EncodingFactory.getIscEncoding("Exception. ");
      EncodingFactory.getEncoding((String) null, (String) null);
      EncodingFactory.getIscEncodingSize("4^");
      EncodingFactory.getJavaEncoding("4^");
      EncodingFactory.getCharacterSetSize((-1124));
      char[] charArray0 = new char[6];
      charArray0[0] = 'v';
      charArray0[1] = 'O';
      charArray0[2] = '9';
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp869", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.4764555081841912
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      EncodingFactory.getJavaEncodingForAlias("4^");
      EncodingFactory.getIscEncoding("Exception. ");
      EncodingFactory.getEncoding((String) null, (String) null);
      EncodingFactory.getIscEncodingSize("4^");
      EncodingFactory.getJavaEncoding("4^");
      EncodingFactory.getCharacterSetSize((-1124));
      char[] charArray0 = new char[6];
      EncodingFactory.getEncoding("4^", charArray0);
      EncodingFactory.createEncoding("WIN1255");
      EncodingFactory.getEncoding("Cp1255");
      String string0 = "ISO8859_2";
      // Undeclared exception!
      EncodingFactory.getTranslator("ISO8859_2");
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.3246221109096887
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      EncodingFactory.getCharacterSetSize(65536);
      char[] charArray0 = new char[5];
      charArray0[0] = '*';
      charArray0[1] = 'F';
      EncodingFactory.getJavaEncodingForAlias("ISO8859_7");
      EncodingFactory.getEncoding("ISO8859_7");
      EncodingFactory.getCharacterSetSize((-3014));
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getIscEncodingSize("ISO8859_7");
      EncodingFactory.getEncoding("", encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getCharacterSetSize(3792);
      EncodingFactory.getEncoding("7f<5L(MqC)v/q", encodingFactory0.DEFAULT_MAPPING);
      // Undeclared exception!
      EncodingFactory.getTranslator("ISO-8859-7");
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.1318296913541235
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      EncodingFactory.getCharacterSetSize(65516);
      char[] charArray0 = new char[5];
      String string0 = "Cp866";
      EncodingFactory.getJavaEncodingForAlias("Cp866");
      EncodingFactory.getEncoding("*k>EM!f!ei;'5", charArray0);
      EncodingFactory.getEncoding("Cp866");
      // Undeclared exception!
      try { 
        EncodingFactory.createEncoding((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 29
  /*Coverage entropy=2.451583060521786
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      EncodingFactory.getJavaEncodingForAlias("4^");
      EncodingFactory.getIscEncoding("Exception. ");
      EncodingFactory.getEncoding((String) null, (String) null);
      EncodingFactory.getIscEncodingSize("4^");
      EncodingFactory.getJavaEncoding("4^");
      EncodingFactory.getCharacterSetSize(1);
      char[] charArray0 = new char[6];
      charArray0[0] = 'v';
      EncodingFactory.getJavaEncodingForAlias((String) null);
      EncodingFactory.getEncoding("cp866");
      EncodingFactory.getCharacterSetSize(0);
      EncodingFactory encodingFactory0 = new EncodingFactory();
      // Undeclared exception!
      EncodingFactory.getEncoding((String) null, "cp866");
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.5808414563590494
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      EncodingFactory.getJavaEncodingForAlias("4^");
      EncodingFactory.getIscEncoding("Exception. ");
      EncodingFactory.getEncoding((String) null, (String) null);
      EncodingFactory.getIscEncodingSize("4^");
      EncodingFactory.getIscEncoding((String) null);
      EncodingFactory.getIscEncoding("4^");
      char[] charArray0 = new char[9];
      charArray0[0] = '$';
      charArray0[1] = '&';
      charArray0[2] = 'i';
      charArray0[3] = 'm';
      charArray0[4] = '{';
      charArray0[5] = 'a';
      charArray0[6] = '>';
      charArray0[7] = '8';
      charArray0[8] = '3';
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp775", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.8051274077913926
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      EncodingFactory.getJavaEncodingForAlias("4^");
      String string0 = "Exception. ";
      EncodingFactory.getIscEncoding("Exception. ");
      EncodingFactory.getEncoding((String) null, (String) null);
      EncodingFactory.getIscEncodingSize("4^");
      EncodingFactory.getJavaEncoding("4^");
      EncodingFactory.getCharacterSetSize((-1124));
      char[] charArray0 = new char[6];
      charArray0[0] = 'v';
      charArray0[1] = 'J';
      EncodingFactory.getCharacterSetSize(1535);
      EncodingFactory.getJavaEncodingForAlias("DOS860");
      EncodingFactory.getIscEncodingSize((String) null);
      EncodingFactory.getJavaEncodingForAlias("uLt3Fz{#6^`X$[");
      EncodingFactory.getCharacterSetSize(657);
      EncodingFactory.getJavaEncoding((String) null);
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp850", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 32
  /*Coverage entropy=0.1425058673927378
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String string0 = "ISO8859_4";
      EncodingFactory.createEncoding("ISO8859_4");
      char[] charArray0 = new char[2];
      charArray0[0] = '6';
      charArray0[1] = 'I';
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_4", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 33
  /*Coverage entropy=1.362140514429356
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      EncodingFactory.createEncoding("01S06");
      EncodingFactory.getJavaEncodingForAlias(" found.");
      char[] charArray0 = new char[4];
      charArray0[0] = '1';
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.createEncoding("isc_encoding_size.properties");
      EncodingFactory.getCharacterSetSize(1067);
      EncodingFactory.getJavaEncodingForAlias("Cp863");
      EncodingFactory.getIscEncodingSize("org.firebirdsql.encodings.Encoding_ISO8859_8");
      EncodingFactory.getJavaEncodingForAlias("org.firebirdsql.encodings.Encoding_ISO8859_8");
      EncodingFactory.getCharacterSetSize(53);
      EncodingFactory.getJavaEncoding("ISO8859_7");
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp865", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 34
  /*Coverage entropy=1.3466032368373184
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      EncodingFactory.getCharacterSetSize(0);
      EncodingFactory.createEncoding("Cp1251");
      char[] charArray0 = null;
      EncodingFactory.getEncoding("~,{", (char[]) null);
      EncodingFactory.getIscEncoding("[ZyN_Yh@*|");
      EncodingFactory.getJavaEncodingForAlias("Cp866");
      EncodingFactory.getIscEncodingSize("Cp857");
      String string0 = "Cp1255";
      EncodingFactory.getEncoding("Cp858");
      String string1 = "w.{kS<`4,_w";
      // Undeclared exception!
      EncodingFactory.getTranslator("w.{kS<`4,_w");
  }

  /**
  //Test case number: 35
  /*Coverage entropy=0.815722890725723
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      EncodingFactory.createEncoding("01S06");
      EncodingFactory.getJavaEncodingForAlias(" found.");
      char[] charArray0 = new char[4];
      charArray0[0] = '1';
      charArray0[1] = '}';
      charArray0[2] = '#';
      EncodingFactory.getEncoding("DOS862", charArray0);
      EncodingFactory.getEncoding(" found.");
      EncodingFactory.createEncoding("Su:;%?,I]yG4");
      EncodingFactory.getJavaEncoding("Cp850");
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_3", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 36
  /*Coverage entropy=2.231606951608935
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      EncodingFactory.createEncoding("01S06");
      EncodingFactory.getJavaEncodingForAlias(" found.");
      char[] charArray0 = new char[4];
      EncodingFactory.getEncoding((String) null, charArray0);
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.createEncoding("ISO8859_7");
      EncodingFactory.getCharacterSetSize(1067);
      EncodingFactory.getJavaEncodingForAlias((String) null);
      EncodingFactory.getIscEncodingSize("01S06");
      EncodingFactory.getJavaEncodingForAlias("isc_encoding_size.properties");
      EncodingFactory.getCharacterSetSize(444);
      EncodingFactory.getJavaEncoding("");
      EncodingFactory.getEncoding("NONE", encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getEncoding("isc_encodings.properties", encodingFactory0.DEFAULT_MAPPING);
      // Undeclared exception!
      EncodingFactory.getTranslator("01S06");
  }

  /**
  //Test case number: 37
  /*Coverage entropy=1.3317273390975104
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      EncodingFactory.getJavaEncodingForAlias("WIN1250");
      EncodingFactory.getCharacterSetSize((-1147130608));
      EncodingFactory.getEncoding("Cp437");
      char[] charArray0 = new char[2];
      charArray0[0] = '+';
      charArray0[1] = 'M';
      Encoding encoding0 = EncodingFactory.getEncoding("HY105", charArray0);
      EncodingFactory.createEncoding("ISO8859_9");
      EncodingFactory.getJavaEncodingForAlias("ISO8859_9");
      EncodingFactory.getIscEncoding("m");
      EncodingFactory.getIscEncodingSize("HY009");
      EncodingFactory.getCharacterSetSize(4);
      char[] charArray1 = new char[7];
      charArray1[0] = '+';
      charArray1[1] = 'M';
      charArray1[2] = 'M';
      charArray1[3] = '+';
      charArray1[4] = 'M';
      charArray1[5] = '+';
      charArray1[6] = '+';
      Encoding encoding1 = EncodingFactory.getEncoding("tlskzk", charArray1);
      assertFalse(encoding1.equals((Object)encoding0));
  }
}
