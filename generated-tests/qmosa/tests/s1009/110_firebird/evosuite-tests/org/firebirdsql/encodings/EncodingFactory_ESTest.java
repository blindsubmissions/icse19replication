/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 10:32:27 GMT 2018
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
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EncodingFactory.getEncoding("h64");
      EncodingFactory.getJavaEncodingForAlias("%M!]&L'?_L9F8e");
      EncodingFactory.getJavaEncodingForAlias((String) null);
      char[] charArray0 = new char[4];
      charArray0[0] = 'H';
      charArray0[1] = 'u';
      charArray0[2] = 'U';
      charArray0[3] = 'w';
      Encoding encoding0 = EncodingFactory.getEncoding((String) null, charArray0);
      EncodingFactory.getCharacterSetSize(0);
      Encoding encoding1 = EncodingFactory.getEncoding("", charArray0);
      assertFalse(encoding1.equals((Object)encoding0));
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EncodingFactory.createEncoding("");
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getJavaEncoding("isc_encodings.properties");
      EncodingFactory.getEncoding("");
      EncodingFactory.getEncoding((String) null, encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.createEncoding("Cp1255");
      EncodingFactory.createEncoding("isc_encodings.properties");
      EncodingFactory.getEncoding((String) null, encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getCharacterSetSize((-2222));
      EncodingFactory.getEncoding("isc_encoding_size.properties", (String) null);
      EncodingFactory.createEncoding("`@8VRZKpc$')mI");
      EncodingFactory.getEncoding((String) null);
      EncodingFactory.getIscEncodingSize("59g");
      String string0 = EncodingFactory.getIscEncoding("isc_encoding_size.properties");
      assertNull(string0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.3629234715124521
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EncodingFactory.getIscEncoding((String) null);
      String string0 = "4R$~S";
      EncodingFactory.getEncoding("4R$~S");
      // Undeclared exception!
      EncodingFactory.getTranslator((String) null);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.2718685126965625
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getIscEncodingSize("isc_encoding_size.properties");
      EncodingFactory.getJavaEncodingForAlias("isc_encodings.properties");
      EncodingFactory.getIscEncoding("nInS");
      String string0 = "];f{1/=FB";
      EncodingFactory.getJavaEncodingForAlias("];f{1/=FB");
      EncodingFactory.getEncoding("isc_encodings.properties", encodingFactory0.DEFAULT_MAPPING);
      String string1 = "a`{> @qZV:Iy~;y";
      // Undeclared exception!
      EncodingFactory.getEncoding("a`{> @qZV:Iy~;y", "isc_encoding_size.properties");
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.1724454632290944
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EncodingFactory.getIscEncoding("~^#rCR5");
      EncodingFactory.getIscEncoding("%`Y/\"1lI_`Z2H");
      EncodingFactory.getJavaEncodingForAlias("M");
      EncodingFactory.getIscEncoding((String) null);
      EncodingFactory.getEncoding("");
      // Undeclared exception!
      EncodingFactory.getTranslator("~^#rCR5");
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.5498260458782016
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = "";
      EncodingFactory.getIscEncodingSize("");
      String string1 = "ISO8859_8";
      EncodingFactory.getIscEncodingSize("ISO8859_8");
      EncodingFactory encodingFactory0 = new EncodingFactory();
      // Undeclared exception!
      EncodingFactory.getTranslator("isc_encodings.properties");
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.485051274375796
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = "Incorrect mapping format. Mapped value should consist only of single character, but ";
      EncodingFactory.getJavaEncodingForAlias("Incorrect mapping format. Mapped value should consist only of single character, but ");
      EncodingFactory.getEncoding((String) null);
      String string1 = ":xmRrOp";
      EncodingFactory.getIscEncodingSize(":xmRrOp");
      char[] charArray0 = new char[1];
      charArray0[0] = 'A';
      EncodingFactory.getEncoding((String) null, charArray0);
      String string2 = "";
      EncodingFactory.getJavaEncoding("");
      EncodingFactory.createEncoding("0DX1(");
      // Undeclared exception!
      EncodingFactory.getTranslator((String) null);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.802833351173347
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EncodingFactory.getEncoding((String) null);
      EncodingFactory.createEncoding("");
      EncodingFactory.getIscEncodingSize((String) null);
      EncodingFactory.getIscEncodingSize("");
      String string0 = "s46)(";
      // Undeclared exception!
      EncodingFactory.getEncoding((String) null, "s46)(");
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.2062305566075642
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EncodingFactory.getIscEncodingSize((String) null);
      EncodingFactory.getIscEncoding((String) null);
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getEncoding("isc_encoding_size.properties");
      EncodingFactory.getEncoding("isc_encodings.properties");
      EncodingFactory.getJavaEncoding((String) null);
      String string0 = EncodingFactory.getJavaEncodingForAlias("?=(.Dk]");
      assertNull(string0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.1943276152682527
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getEncoding("Cp863", encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getJavaEncodingForAlias("isc_encodings.properties");
      EncodingFactory.getJavaEncodingForAlias((String) null);
      int int0 = EncodingFactory.getCharacterSetSize(40);
      EncodingFactory.getJavaEncodingForAlias("isc_encodings.properties");
      EncodingFactory.getJavaEncodingForAlias((String) null);
      int int1 = EncodingFactory.getIscEncodingSize("s YM tH#iBfaT5<}7");
      assertTrue(int1 == int0);
      assertEquals(1, int1);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.6179522643873894
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = "ISO8859_13";
      EncodingFactory.createEncoding("ISO8859_13");
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getJavaEncoding("ISO8859_13");
      EncodingFactory.getEncoding("isc_encodings.properties");
      EncodingFactory.getEncoding("isc_encodings.properties", encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.createEncoding("NONE");
      String string1 = "Cp1251";
      EncodingFactory.createEncoding("Cp1251");
      EncodingFactory.getEncoding("Cp775", encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getCharacterSetSize(7);
      // Undeclared exception!
      EncodingFactory.getEncoding("Cp775", "Cp775");
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.9342186307326666
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EncodingFactory.getJavaEncodingForAlias("Incorrect mapping format. Mapped value should consist only of single character, but ");
      EncodingFactory.getEncoding((String) null);
      EncodingFactory.getIscEncodingSize(":xmRrOp");
      char[] charArray0 = new char[1];
      charArray0[0] = 'A';
      EncodingFactory.getEncoding("Incorrect mapping format. All properties should start with \"db.\", but ");
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
  //Test case number: 12
  /*Coverage entropy=1.0549201679861442
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      char[] charArray0 = new char[6];
      charArray0[0] = 'w';
      charArray0[1] = 'w';
      charArray0[2] = 'U';
      charArray0[3] = 'w';
      charArray0[4] = 'w';
      charArray0[5] = 'w';
      EncodingFactory.getEncoding("NONE", charArray0);
      EncodingFactory.getCharacterSetSize(0);
      EncodingFactory.getEncoding("NONE", charArray0);
      char[] charArray1 = new char[4];
      charArray1[0] = 'U';
      charArray1[1] = 'U';
      charArray1[2] = 'U';
      charArray1[3] = 'w';
      EncodingFactory.getEncoding("NONE", charArray1);
      // Undeclared exception!
      EncodingFactory.getTranslator("NONE");
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.662255034907742
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getEncoding("Cp863", encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getJavaEncodingForAlias("isc_encodings.properties");
      EncodingFactory.getJavaEncodingForAlias((String) null);
      int int0 = EncodingFactory.getCharacterSetSize(40);
      String string0 = EncodingFactory.getJavaEncodingForAlias("isc_encodings.properties");
      assertNull(string0);
      
      EncodingFactory.getJavaEncoding("59zh+.$e_J[0hTwM");
      EncodingFactory.getEncoding("Cp737");
      String string1 = EncodingFactory.getIscEncoding("59zh+.$e_J[0hTwM");
      assertNull(string1);
      
      EncodingFactory.getIscEncoding((String) null);
      EncodingFactory.getJavaEncoding(" |uq7];1zBm*Z1k0(");
      EncodingFactory.getEncoding((String) null, (String) null);
      int int1 = EncodingFactory.getIscEncodingSize((String) null);
      assertTrue(int1 == int0);
      assertEquals(1, int1);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.3671002914352812
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EncodingFactory.createEncoding("w7!8hh");
      EncodingFactory.getJavaEncodingForAlias("Cp850");
      char[] charArray0 = new char[3];
      charArray0[0] = '!';
      charArray0[1] = '!';
      charArray0[2] = '!';
      EncodingFactory.getEncoding("SJIS_0208", charArray0);
      EncodingFactory.getIscEncoding("01S00");
      EncodingFactory.createEncoding("08003");
      EncodingFactory.getCharacterSetSize((-1408));
      String string0 = "=2)bS$;";
      EncodingFactory.getJavaEncoding("DOS860");
      EncodingFactory.getEncoding("");
      String string1 = "08S01";
      String string2 = "db.";
      // Undeclared exception!
      EncodingFactory.getEncoding("DOS860", "db.");
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.6001660731596457
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EncodingFactory.getEncoding("?k?Uz<JT}.");
      String string0 = "Cp1255";
      String string1 = null;
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp1255", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.2000873227678652
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EncodingFactory.getJavaEncodingForAlias("08q_~)+z.E");
      EncodingFactory.getEncoding("Cp437");
      // Undeclared exception!
      EncodingFactory.getTranslator("Cp437");
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.1262016162798163
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = "w7!8hh";
      EncodingFactory.getJavaEncoding("w7!8hh");
      EncodingFactory.getIscEncoding("w7!8hh");
      int int0 = 0;
      EncodingFactory.getCharacterSetSize(0);
      EncodingFactory.getEncoding("D<IY");
      String string1 = null;
      char[] charArray0 = new char[1];
      charArray0[0] = 'f';
      EncodingFactory.getEncoding("w7!8hh", charArray0);
      EncodingFactory.createEncoding("ISO8859_9");
      // Undeclared exception!
      try { 
        EncodingFactory.createEncoding((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.0429581300914452
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      String string0 = "Cp863";
      String string1 = "";
      EncodingFactory.getEncoding("Cp863");
      String string2 = "Cp1255";
      EncodingFactory.getEncoding("Cp863", encodingFactory0.DEFAULT_MAPPING);
      // Undeclared exception!
      EncodingFactory.getEncoding("", "isc_encodings.properties");
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.0731610432118073
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      EncodingFactory.createEncoding("");
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getJavaEncoding("isc_encodings.properties");
      EncodingFactory.getEncoding("ISO8859_6", encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getJavaEncodingForAlias((String) null);
      EncodingFactory.getJavaEncodingForAlias((String) null);
      EncodingFactory.getCharacterSetSize(1);
      EncodingFactory.getEncoding("");
      EncodingFactory.getJavaEncodingForAlias("KSC_5601");
      String string0 = EncodingFactory.getJavaEncoding("");
      assertNull(string0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.977006172908861
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getJavaEncodingForAlias("isc_encodings.properties");
      EncodingFactory.createEncoding("isc_encoding_size.properties");
      String string0 = "Cp1251";
      EncodingFactory.createEncoding("isc_encodings.properties");
      EncodingFactory.getEncoding("Cp1251", encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getCharacterSetSize(7);
      String string1 = "ISO8859_8";
      // Undeclared exception!
      EncodingFactory.getEncoding("ur4)+'<!;(2\"b", "ISO8859_8");
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.155709341332858
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EncodingFactory.getJavaEncoding("w7!8hh");
      EncodingFactory.getIscEncoding("w7!8hh");
      EncodingFactory.getJavaEncoding((String) null);
      EncodingFactory.getEncoding("sD98ywEV0");
      char[] charArray0 = new char[3];
      charArray0[0] = 'R';
      charArray0[1] = '-';
      charArray0[2] = '3';
      EncodingFactory.getEncoding((String) null, charArray0);
      EncodingFactory.createEncoding("w7!8hh");
      EncodingFactory.createEncoding("utf8");
      EncodingFactory.getEncoding("t\u00059l<oEmqLI|", charArray0);
      EncodingFactory.getCharacterSetSize((-2222));
      // Undeclared exception!
      EncodingFactory.getEncoding("RpFPH+=6=HjmZW-", "3e|$GWs8>*D{b1b");
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.12425083738963087
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = "";
      char[] charArray0 = new char[3];
      String string1 = "Xro/MI<bC}";
      EncodingFactory.getEncoding("Xro/MI<bC}", charArray0);
      EncodingFactory.createEncoding("Xro/MI<bC}");
      EncodingFactory.createEncoding("Xro/MI<bC}");
      String string2 = "2e[";
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
  //Test case number: 23
  /*Coverage entropy=1.0310949132397724
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      EncodingFactory.getIscEncodingSize("");
      EncodingFactory.getCharacterSetSize(0);
      EncodingFactory.getIscEncoding("fumeh");
      char[] charArray0 = new char[0];
      EncodingFactory.getEncoding("");
      EncodingFactory.getEncoding((String) null, charArray0);
      String string0 = "ISO8859_9";
      EncodingFactory.createEncoding("ISO8859_9");
      EncodingFactory.createEncoding("ISO8859_9");
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
  //Test case number: 24
  /*Coverage entropy=1.1041133279229196
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getEncoding("Cp863", encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getJavaEncodingForAlias("isc_encodings.properties");
      EncodingFactory.getJavaEncodingForAlias((String) null);
      EncodingFactory.getCharacterSetSize(40);
      EncodingFactory.getEncoding("ISO8859_6");
      EncodingFactory.getEncoding("}\"{BY@[H&rR=Z", encodingFactory0.DEFAULT_MAPPING);
      Encoding encoding0 = EncodingFactory.createEncoding("Cp1253");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.7565367399084861
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      String string0 = "a%Z72Op)I@xR/";
      String string1 = "Cp1252";
      EncodingFactory.getEncoding("Cp1252", encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getEncoding("\fIE+", encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getIscEncoding("a%Z72Op)I@xR/");
      EncodingFactory.getCharacterSetSize(22);
      // Undeclared exception!
      EncodingFactory.getEncoding("isc_encodings.properties", "ISO8859_6");
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.012370703244161
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      EncodingFactory.createEncoding("w7!8hh");
      EncodingFactory.createEncoding("Cp865");
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getJavaEncoding("{*[&>uS F");
      EncodingFactory.getEncoding("Cp850");
      EncodingFactory.getEncoding("isc_encoding_size.properties", (char[]) null);
      Encoding encoding0 = EncodingFactory.getEncoding("Cp1257");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.0433129203914828
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      EncodingFactory.getIscEncodingSize(":xmRrOp");
      char[] charArray0 = new char[1];
      charArray0[0] = 'A';
      String string0 = "Incorrect mapping format. All properties should start with \"db.\", but ";
      EncodingFactory.getEncoding("Incorrect mapping format. All properties should start with \"db.\", but ");
      EncodingFactory.getEncoding("ISO88t59_3", charArray0);
      EncodingFactory.getCharacterSetSize((-1));
      EncodingFactory.createEncoding("org.firebirdsql.encodings.Encoding_Cp1251");
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp864", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.8660598702493092
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      String string0 = "w7!8hh";
      EncodingFactory.createEncoding("w7!8hh");
      EncodingFactory.getJavaEncodingForAlias("Cp850");
      String string1 = "SJIS_0208";
      char[] charArray0 = new char[3];
      charArray0[0] = '!';
      charArray0[1] = '!';
      charArray0[2] = '!';
      EncodingFactory.getEncoding("SJIS_0208", charArray0);
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
  //Test case number: 29
  /*Coverage entropy=0.7457401705864138
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      EncodingFactory.createEncoding("w7!8hh");
      EncodingFactory.getJavaEncodingForAlias("Cp850");
      EncodingFactory.getJavaEncodingForAlias("Cp850");
      Encoding encoding0 = EncodingFactory.getEncoding("Cp862");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.2122132490677107
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      EncodingFactory.createEncoding("");
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getJavaEncoding("isc_encodings.properties");
      String string0 = "s ";
      EncodingFactory.getEncoding("isc_encoding_size.properties", encodingFactory0.DEFAULT_MAPPING);
      String string1 = "ISO8859_8";
      EncodingFactory.createEncoding("ISO8859_8");
      EncodingFactory.createEncoding("isc_encodings.properties");
      EncodingFactory.getEncoding("isc_encodings.properties", encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getCharacterSetSize(7);
      String string2 = "a<Yu/v9Ci";
      // Undeclared exception!
      EncodingFactory.getEncoding((String) null, "a<Yu/v9Ci");
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.3803149872859355
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getEncoding("isc_encoding_size.properties", encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getCharacterSetSize(40);
      EncodingFactory.createEncoding("#rTg,R#:");
      EncodingFactory.getEncoding("Cp437");
      EncodingFactory.getIscEncoding((String) null);
      EncodingFactory.getIscEncodingSize("#rTg,R#:");
      Encoding encoding0 = EncodingFactory.getEncoding("Cp858", encodingFactory0.DEFAULT_MAPPING);
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.110731985511428
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      EncodingFactory.createEncoding("ISO8859_13");
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getEncoding((String) null, encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getEncoding("isc_encoding_size.properties", encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getJavaEncodingForAlias("$l");
      EncodingFactory.getEncoding("Cp858");
      String string0 = EncodingFactory.getJavaEncodingForAlias("ISO8859_6");
      assertNotNull(string0);
      
      String string1 = EncodingFactory.getJavaEncoding("ISO8859_6");
      assertNotNull(string1);
      assertEquals("ISO-8859-6", string1);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=1.3605257726286264
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      EncodingFactory.createEncoding("Cp862");
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getIscEncodingSize("org.firebirdsql.encodings.Encoding_Cp1251");
      EncodingFactory.getJavaEncoding("Ctp?;GK");
      EncodingFactory.getIscEncoding("isc_encodings.properties");
      EncodingFactory.getEncoding("");
      EncodingFactory.getEncoding("HY009", encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getCharacterSetSize(820);
      EncodingFactory.createEncoding("Cp864");
      EncodingFactory.getEncoding("isc_encodings.properties", encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getCharacterSetSize((-1381));
      EncodingFactory.getJavaEncoding("ISO8859_7");
      Encoding encoding0 = EncodingFactory.createEncoding("Cp865");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 34
  /*Coverage entropy=1.1200650404828076
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getEncoding("Cp863", encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getJavaEncodingForAlias("isc_encodings.properties");
      EncodingFactory.getJavaEncodingForAlias((String) null);
      EncodingFactory.getCharacterSetSize(40);
      EncodingFactory.getEncoding("Cp863");
      EncodingFactory.getEncoding("07001", encodingFactory0.DEFAULT_MAPPING);
      Encoding encoding0 = EncodingFactory.getEncoding("Cp1254");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 35
  /*Coverage entropy=1.2383607076734782
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      EncodingFactory.createEncoding("");
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getJavaEncoding("isc_encodings.properties");
      EncodingFactory.getIscEncoding("");
      EncodingFactory.getEncoding("isc_encodings.properties");
      EncodingFactory.getEncoding("ISO8859_3", encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getCharacterSetSize(820);
      EncodingFactory.createEncoding("wYHVDt-TV_j");
      EncodingFactory.getEncoding("wYHVDt-TV_j", encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getCharacterSetSize((-1381));
      EncodingFactory.getJavaEncoding("sY");
      EncodingFactory.createEncoding("Cp866");
      String string0 = EncodingFactory.getJavaEncoding((String) null);
      assertNull(string0);
  }

  /**
  //Test case number: 36
  /*Coverage entropy=1.1809999987312694
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      char[] charArray0 = new char[3];
      EncodingFactory.getJavaEncodingForAlias("?xuMoZ");
      EncodingFactory.createEncoding("ISO8859_2");
      String string0 = "Cp1251";
      EncodingFactory.createEncoding("ODQHdG>a");
      EncodingFactory.getEncoding("org.firebirdsql.encodings.Encoding_ISO8859_4", charArray0);
      EncodingFactory.getCharacterSetSize(55);
      String string1 = "DOS860";
      String string2 = "26000";
      // Undeclared exception!
      EncodingFactory.getEncoding("ODQHdG>a", "26000");
  }

  /**
  //Test case number: 37
  /*Coverage entropy=1.5585617635055233
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getEncoding("Cp1256", encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.createEncoding(">![");
      EncodingFactory.createEncoding("isc_encodings.properties");
      EncodingFactory.getJavaEncoding("isc_encodings.properties");
      EncodingFactory.getEncoding("DOS861");
      char[] charArray0 = new char[1];
      charArray0[0] = 'B';
      EncodingFactory.getEncoding((String) null, charArray0);
      EncodingFactory.getEncoding("ISO8859_7");
      EncodingFactory.getJavaEncodingForAlias(">![");
      EncodingFactory.getJavaEncodingForAlias("utf8");
      EncodingFactory.createEncoding("isc_encoding_size.properties");
      EncodingFactory.getJavaEncoding("DOS861");
      // Undeclared exception!
      EncodingFactory.getTranslator("Cp1256");
  }

  /**
  //Test case number: 38
  /*Coverage entropy=1.1431867648158567
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      EncodingFactory.createEncoding("w7!8hh");
      Encoding encoding0 = EncodingFactory.createEncoding("Cp865");
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getEncoding("Cp850");
      EncodingFactory.getIscEncoding("utf8");
      EncodingFactory.getIscEncodingSize("`DQK?wk}.RTqD");
      EncodingFactory.getIscEncoding("zj&YckbOI;");
      Encoding encoding1 = EncodingFactory.getEncoding("Cp865", encodingFactory0.DEFAULT_MAPPING);
      assertFalse(encoding1.equals((Object)encoding0));
  }
}
