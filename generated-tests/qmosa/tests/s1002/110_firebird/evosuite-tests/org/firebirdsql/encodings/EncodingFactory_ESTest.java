/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 08:36:20 GMT 2018
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
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EncodingFactory.getEncoding("");
      EncodingFactory.getCharacterSetSize((-1304));
      EncodingFactory.getEncoding("", (char[]) null);
      EncodingFactory.getEncoding("", (char[]) null);
      EncodingFactory.getJavaEncodingForAlias("");
      EncodingFactory.getJavaEncoding("");
      EncodingFactory.getIscEncoding("I6M?Qm@i");
      EncodingFactory.getIscEncodingSize("I6M?Qm@i");
      EncodingFactory.getEncoding("I6M?Qm@i", (String) null);
      EncodingFactory.getJavaEncoding((String) null);
      EncodingFactory.getEncoding("s2;E`");
      EncodingFactory.getJavaEncoding((String) null);
      EncodingFactory.getJavaEncoding("I6M?Qm@i");
      EncodingFactory.getEncoding((String) null);
      EncodingFactory.getIscEncodingSize("x)_-2C(#$c_|v");
      EncodingFactory.getIscEncodingSize((String) null);
      EncodingFactory.getIscEncodingSize((String) null);
      EncodingFactory.getEncoding("lHgmt@Qi");
      EncodingFactory.createEncoding("W%");
      // Undeclared exception!
      EncodingFactory.getEncoding("", "");
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getEncoding("isc_encoding_size.properties");
      EncodingFactory.getEncoding("");
      EncodingFactory.getIscEncoding("isc_encodings.properties");
      EncodingFactory.getEncoding("isc_encoding_size.properties");
      EncodingFactory.getIscEncoding("isc_encodings.properties");
      // Undeclared exception!
      EncodingFactory.getTranslator((String) null);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.094729047527649
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = "";
      EncodingFactory.createEncoding("");
      String string1 = "";
      EncodingFactory.createEncoding("");
      EncodingFactory.getIscEncodingSize("");
      String string2 = "";
      EncodingFactory.getJavaEncodingForAlias("");
      EncodingFactory.getCharacterSetSize(1);
      // Undeclared exception!
      EncodingFactory.getEncoding("F", "");
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.0718825105512684
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getEncoding("isc_encoding_size.properties", encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getJavaEncodingForAlias("isc_encodings.properties");
      EncodingFactory.getEncoding("");
      EncodingFactory.getEncoding("isc_encoding_size.properties", encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.createEncoding("isc_encodings.properties");
      EncodingFactory.createEncoding("isc_encodings.properties");
      String string0 = EncodingFactory.getJavaEncodingForAlias("");
      assertNull(string0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.8507142252380404
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      char[] charArray0 = new char[0];
      EncodingFactory.getEncoding(">u!{`PWVrCMya", charArray0);
      EncodingFactory.getCharacterSetSize((-1777));
      EncodingFactory.getJavaEncodingForAlias("ISO8859_6");
      // Undeclared exception!
      EncodingFactory.getTranslator("r/G]OBDN<S)");
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.47420812719914446
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = "lI";
      EncodingFactory.getJavaEncodingForAlias("lI");
      char[] charArray0 = new char[6];
      charArray0[0] = 'k';
      charArray0[1] = 'Y';
      charArray0[2] = 'W';
      charArray0[3] = '+';
      charArray0[4] = 'U';
      charArray0[5] = '\"';
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_5", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = "ISO8859_2";
      char[] charArray0 = new char[3];
      charArray0[0] = '.';
      charArray0[1] = 'b';
      charArray0[2] = '}';
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_2", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = null;
      char[] charArray0 = null;
      EncodingFactory.getEncoding((String) null, (char[]) null);
      String string1 = "{IZK4)1lxez";
      // Undeclared exception!
      EncodingFactory.getTranslator("{IZK4)1lxez");
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.1724454632290944
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int int0 = EncodingFactory.getCharacterSetSize(43);
      assertEquals(1, int0);
      
      EncodingFactory.getIscEncoding("qY;\")c *\" %R4/z");
      EncodingFactory.getJavaEncoding("");
      EncodingFactory.createEncoding("n5! }4$cn)HB2fH|3");
      EncodingFactory.getIscEncoding("tzvZ7S{lifS.&+UA4R");
      EncodingFactory.getIscEncodingSize((String) null);
      EncodingFactory.createEncoding("-UEEQ@C");
      EncodingFactory.getJavaEncoding("-UEEQ@C");
      String string0 = EncodingFactory.getJavaEncoding("ISO8859_3");
      assertEquals("ISO-8859-3", string0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.7418725584440977
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EncodingFactory.getJavaEncodingForAlias((String) null);
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getEncoding("");
      EncodingFactory.createEncoding("62+g3.N5#9/ts4i~j]~");
      EncodingFactory.getJavaEncoding("HY002");
      String string0 = EncodingFactory.getJavaEncodingForAlias((String) null);
      assertNull(string0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.6340441403828485
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      char[] charArray0 = new char[0];
      EncodingFactory.getEncoding(">u!{`PWVrCMya", charArray0);
      EncodingFactory.getEncoding(">u!{`PWVrCMya", charArray0);
      String string0 = null;
      EncodingFactory.createEncoding(">u!{`PWVrCMya");
      EncodingFactory.createEncoding("Cp1257");
      // Undeclared exception!
      EncodingFactory.getTranslator(">u!{`PWVrCMya");
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.0821110659588415
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = EncodingFactory.getJavaEncodingForAlias("lI");
      assertNull(string0);
      
      char[] charArray0 = new char[7];
      charArray0[0] = 'Y';
      charArray0[1] = 'G';
      charArray0[2] = 'G';
      charArray0[3] = '`';
      charArray0[4] = '`';
      charArray0[5] = 'l';
      charArray0[6] = 'G';
      EncodingFactory.getEncoding((String) null, charArray0);
      int int0 = EncodingFactory.getIscEncodingSize("ISO8859_1");
      assertEquals(1, int0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.128668877308052
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      char[] charArray0 = new char[0];
      EncodingFactory.getEncoding(">u!{`PWVrCMya", charArray0);
      EncodingFactory.getJavaEncodingForAlias(">u!{`PWVrCMya");
      EncodingFactory.getIscEncodingSize(">u!{`PWVrCMya");
      String string0 = EncodingFactory.getIscEncoding((String) null);
      assertNull(string0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.8499760430315393
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EncodingFactory.createEncoding("ISO8859_3");
      EncodingFactory.getIscEncoding("(3");
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getJavaEncodingForAlias("org.firebirdsql.encodings.CharacterTranslator");
      EncodingFactory.getJavaEncodingForAlias("s;rIPu");
      // Undeclared exception!
      EncodingFactory.getTranslator("Cp437");
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.8769609959156035
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      char[] charArray0 = new char[0];
      EncodingFactory.getEncoding(">u!{`PWVrCMya", charArray0);
      EncodingFactory.getCharacterSetSize((-1777));
      EncodingFactory.createEncoding(">u!{`PWVrCMya");
      EncodingFactory.createEncoding("Cp857");
      // Undeclared exception!
      EncodingFactory.getTranslator((String) null);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.0374539457798924
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EncodingFactory.createEncoding("ISO8859_5");
      EncodingFactory.getJavaEncoding("");
      EncodingFactory.getEncoding("", (char[]) null);
      EncodingFactory.getJavaEncodingForAlias("c2/k$izz#q:!@ch,b");
      EncodingFactory.createEncoding("ISO8859_8");
      EncodingFactory encodingFactory0 = new EncodingFactory();
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.45056120886630463
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      char[] charArray0 = new char[3];
      charArray0[0] = '.';
      EncodingFactory.createEncoding("ISO8859_2");
      EncodingFactory.createEncoding("08007");
      EncodingFactory.getCharacterSetSize(0);
      Encoding encoding0 = EncodingFactory.createEncoding("Cp1256");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.2209093151365735
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      char[] charArray0 = new char[0];
      EncodingFactory.getEncoding(">u!{`PWVrCMya", charArray0);
      EncodingFactory.getCharacterSetSize((-1777));
      EncodingFactory.getIscEncodingSize(">u!{`PWVrCMya");
      EncodingFactory.getIscEncodingSize(" yF-r1$=53Bw@zvPVuV");
      EncodingFactory.getEncoding("ISO8859_6");
      EncodingFactory.createEncoding(".L6\n6$pJm3^kK6O");
      // Undeclared exception!
      EncodingFactory.getEncoding("ISO8859_6", " yF-r1$=53Bw@zvPVuV");
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.8891591637540215
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EncodingFactory.getIscEncoding("org.firebirdsql.encodings.Encoding_Cp864");
      EncodingFactory.getJavaEncoding("Y/9#j\"cgG");
      EncodingFactory.createEncoding("V!n&JnY'>");
      EncodingFactory.getIscEncoding((String) null);
      EncodingFactory.getIscEncodingSize("");
      EncodingFactory.createEncoding("NONE");
      EncodingFactory.getJavaEncoding("V!n&JnY'>");
      EncodingFactory.getJavaEncoding((String) null);
      String string0 = EncodingFactory.getJavaEncoding("$/0");
      assertNull(string0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = "ISO8859_7";
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_7", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = "QU94jIv$M";
      char[] charArray0 = new char[11];
      charArray0[0] = '9';
      charArray0[1] = '9';
      charArray0[2] = 'l';
      char[] charArray1 = new char[3];
      charArray1[0] = '9';
      charArray1[1] = 'l';
      charArray1[2] = 'Z';
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp860", charArray1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.981096754402682
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EncodingFactory.getEncoding("");
      EncodingFactory.getCharacterSetSize((-1304));
      EncodingFactory.getJavaEncodingForAlias("");
      EncodingFactory.getEncoding("Cp1253");
      EncodingFactory.getJavaEncoding("");
      EncodingFactory.createEncoding("ISO8859_13");
      EncodingFactory.getIscEncoding("ISO8859_2");
      EncodingFactory.getIscEncodingSize("bMn9eflJ.Xrw8Gbd~9m");
      EncodingFactory.createEncoding("Cp1253");
      EncodingFactory.getJavaEncoding("QamLyC!X=;b=.f#lLUb");
      String string0 = EncodingFactory.getJavaEncoding("{1oj`");
      assertNull(string0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.868304943932727
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      EncodingFactory.getEncoding("ISO8859_2");
      EncodingFactory.getJavaEncoding("WIN1256");
      EncodingFactory.createEncoding("WIN1255");
      String string0 = EncodingFactory.ISC_ENCODING_SIZE_RESOURCE;
      int int0 = EncodingFactory.getIscEncodingSize("GDS Exception. ");
      assertEquals(1, int0);
      
      EncodingFactory.createEncoding("ISO8859_1");
      EncodingFactory.getJavaEncoding("Cp860");
      String string1 = EncodingFactory.getJavaEncoding("WIN1256");
      assertNotNull(string1);
      assertEquals("Cp1256", string1);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.9159489015425817
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      EncodingFactory.getIscEncodingSize("");
      EncodingFactory.getEncoding("ISO8859_4");
      String string0 = EncodingFactory.getJavaEncoding("DOS861");
      assertNotNull(string0);
      
      EncodingFactory.createEncoding("QamLyC!X=;b=.f#lUb");
      String string1 = EncodingFactory.getIscEncoding("ZUTe");
      assertNull(string1);
      
      int int0 = EncodingFactory.getIscEncodingSize("Cp860");
      assertEquals(1, int0);
      
      String string2 = EncodingFactory.getJavaEncoding("ISO8859_4");
      assertEquals("ISO-8859-4", string2);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.6060252027357298
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      EncodingFactory.getJavaEncoding("DOS862");
      String string0 = "Hc!0+q";
      char[] charArray0 = new char[5];
      charArray0[0] = 'D';
      charArray0[1] = 'F';
      charArray0[2] = '';
      charArray0[3] = 'S';
      charArray0[4] = 'R';
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp862", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.297295830625819
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      EncodingFactory.createEncoding("ISO8859_5");
      EncodingFactory.getJavaEncoding("");
      EncodingFactory.createEncoding("Cp1255");
      EncodingFactory.getIscEncoding("org.firebirdsql.encodings.Encoding_ISO8859_4");
      EncodingFactory.getIscEncodingSize((String) null);
      String string0 = EncodingFactory.getJavaEncoding("");
      assertNull(string0);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.1090838304259174
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String string0 = "ISO8859_7";
      EncodingFactory.getCharacterSetSize((-1777));
      char[] charArray0 = new char[5];
      charArray0[0] = 'g';
      charArray0[1] = ',';
      charArray0[2] = 'b';
      charArray0[3] = '8';
      charArray0[4] = '-';
      EncodingFactory.getEncoding("?aH>", charArray0);
      EncodingFactory.getJavaEncodingForAlias("HY009");
      EncodingFactory.createEncoding("ISO8859_7");
      EncodingFactory.createEncoding("Cp857");
      // Undeclared exception!
      EncodingFactory.getTranslator((String) null);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.4057820512559034
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      EncodingFactory.getEncoding("");
      EncodingFactory.getCharacterSetSize((-1304));
      EncodingFactory.getEncoding("", (char[]) null);
      EncodingFactory.getEncoding("", (char[]) null);
      EncodingFactory.getJavaEncodingForAlias("");
      EncodingFactory.getJavaEncoding("");
      EncodingFactory.getIscEncoding("I6M?Qm@i");
      EncodingFactory.getIscEncodingSize("I6M?Qm@i");
      EncodingFactory.getEncoding("I6M?Qm@i", (String) null);
      EncodingFactory.getJavaEncoding((String) null);
      EncodingFactory.getEncoding("s2;E`");
      EncodingFactory.getJavaEncoding((String) null);
      EncodingFactory.getJavaEncoding("I6M?Qm@i");
      Encoding encoding0 = EncodingFactory.createEncoding("Cp1254");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.0105852339203338
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      char[] charArray0 = new char[3];
      charArray0[0] = '9';
      EncodingFactory.createEncoding("ISO8859_9");
      EncodingFactory.getEncoding("DG.Q");
      EncodingFactory.getJavaEncodingForAlias("C{u");
      EncodingFactory.getJavaEncoding((String) null);
      EncodingFactory encodingFactory0 = new EncodingFactory();
      String string0 = EncodingFactory.ISC_ENCODINGS_RESOURCE;
      EncodingFactory.getIscEncodingSize("C{u");
      String string1 = EncodingFactory.getIscEncoding("KSC_5601");
      assertNull(string1);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=0.8327213014523246
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      EncodingFactory.createEncoding("");
      EncodingFactory.getEncoding("Cp864");
      EncodingFactory.getIscEncodingSize("");
      char[] charArray0 = new char[7];
      charArray0[0] = '4';
      charArray0[1] = 'X';
      charArray0[2] = '$';
      charArray0[3] = 'e';
      charArray0[4] = '^';
      charArray0[5] = '\"';
      charArray0[6] = '.';
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp864", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.1165107682127633
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      String string0 = "";
      EncodingFactory.createEncoding("");
      EncodingFactory.getEncoding("Cp864");
      EncodingFactory.getIscEncodingSize("");
      char[] charArray0 = new char[7];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp737", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 31
  /*Coverage entropy=0.5313039033395413
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      EncodingFactory.getJavaEncodingForAlias("Cp869");
      char[] charArray0 = new char[8];
      charArray0[0] = '_';
      charArray0[1] = 'M';
      charArray0[2] = '|';
      charArray0[3] = '4';
      charArray0[4] = 'u';
      charArray0[5] = 'j';
      charArray0[6] = 'p';
      charArray0[7] = 'v';
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp869", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }
}
