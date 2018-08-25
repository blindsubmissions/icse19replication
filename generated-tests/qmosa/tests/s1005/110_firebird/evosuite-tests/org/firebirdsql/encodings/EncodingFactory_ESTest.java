/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 09:23:58 GMT 2018
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
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = "AiKc2bT(HXLJaK";
      char[] charArray0 = new char[6];
      charArray0[0] = 'O';
      charArray0[1] = 'K';
      charArray0[2] = 'L';
      charArray0[3] = 'r';
      charArray0[4] = 'O';
      charArray0[5] = 'K';
      EncodingFactory.getEncoding("AiKc2bT(HXLJaK", charArray0);
      EncodingFactory.getEncoding("7?0aOE5");
      // Undeclared exception!
      EncodingFactory.getTranslator("AiKc2bT(HXLJaK");
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.2718685126965625
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = "h]@{Pljm/\\$";
      EncodingFactory.getJavaEncoding("h]@{Pljm/$");
      EncodingFactory.getIscEncodingSize("h]@{Pljm/$");
      EncodingFactory.getJavaEncodingForAlias((String) null);
      EncodingFactory.getJavaEncodingForAlias((String) null);
      EncodingFactory.getIscEncoding((String) null);
      EncodingFactory.getJavaEncoding((String) null);
      EncodingFactory.getCharacterSetSize(0);
      EncodingFactory.getIscEncoding((String) null);
      EncodingFactory.getCharacterSetSize(0);
      EncodingFactory.createEncoding("Cp1250");
      // Undeclared exception!
      EncodingFactory.getTranslator("0$6ls;`rm4GKJD<jsAS");
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.6425990774875225
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.createEncoding("`NJT@m|0ER[&~");
      EncodingFactory.getEncoding("Cp863");
      // Undeclared exception!
      EncodingFactory.getEncoding("Cp863", "08007");
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.0253262207700673
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EncodingFactory.getJavaEncodingForAlias("00Todjm&,p77tY");
      EncodingFactory.getIscEncodingSize((String) null);
      EncodingFactory.getEncoding("fZ0j~W[M^4W", (String) null);
      // Undeclared exception!
      EncodingFactory.getEncoding("Cp852", "zF/B|P8*");
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.4105135571148382
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = null;
      EncodingFactory.getJavaEncoding((String) null);
      EncodingFactory.getIscEncoding("");
      // Undeclared exception!
      EncodingFactory.getEncoding((String) null, "");
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EncodingFactory.getCharacterSetSize(65536);
      EncodingFactory.getCharacterSetSize(3862);
      EncodingFactory.getJavaEncoding((String) null);
      Encoding encoding0 = EncodingFactory.getEncoding("");
      char[] charArray0 = new char[5];
      charArray0[0] = 'Z';
      charArray0[1] = '\\';
      charArray0[2] = 'J';
      charArray0[3] = '5';
      charArray0[4] = ',';
      Encoding encoding1 = EncodingFactory.getEncoding("nOTyXWNU?}Y", charArray0);
      assertFalse(encoding1.equals((Object)encoding0));
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.2509149553679562
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = "Cp1255";
      EncodingFactory.getJavaEncoding("Cp1255");
      String string1 = "AT&Qz_3EN";
      EncodingFactory.getIscEncoding("AT&Qz_3EN");
      EncodingFactory.getEncoding((String) null);
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getIscEncoding("Cp864");
      EncodingFactory.createEncoding("AT&Qz_3EN");
      String string2 = "Cp1250";
      // Undeclared exception!
      EncodingFactory.getEncoding("[vI#WK1[1Vuw?", "Cp1250");
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.3432354898535608
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int int0 = 0;
      EncodingFactory.getCharacterSetSize(0);
      char[] charArray0 = new char[0];
      EncodingFactory.getEncoding("q=713N07,D", charArray0);
      EncodingFactory.getIscEncoding("q=713N07,D");
      EncodingFactory.getJavaEncodingForAlias("q=713N07,D");
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getIscEncodingSize("isc_encoding_size.properties");
      EncodingFactory.getIscEncoding("");
      EncodingFactory.getJavaEncoding(" could not be found.");
      EncodingFactory.getJavaEncodingForAlias((String) null);
      int int1 = (-2769);
      EncodingFactory.getCharacterSetSize((-2769));
      // Undeclared exception!
      EncodingFactory.getEncoding((String) null, "Wy:<vKdk3");
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EncodingFactory.getIscEncodingSize((String) null);
      char[] charArray0 = new char[8];
      charArray0[0] = 's';
      charArray0[1] = 'U';
      charArray0[2] = ']';
      charArray0[3] = ',';
      charArray0[4] = 'j';
      charArray0[5] = 'L';
      charArray0[6] = 'q';
      charArray0[7] = 'k';
      EncodingFactory.getEncoding((String) null, charArray0);
      String string0 = EncodingFactory.getJavaEncoding((String) null);
      assertNull(string0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.2129326183457454
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getIscEncodingSize("isc_encoding_size.properties");
      EncodingFactory.getEncoding("^JmX?fv1,#ZX_K#");
      EncodingFactory.getJavaEncodingForAlias("");
      EncodingFactory.createEncoding(")si0X=3");
      EncodingFactory.getIscEncoding("GDS Exception. ");
      EncodingFactory.getEncoding("isc_encodings.properties", encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.createEncoding("-Rrr[6WWtX");
      Encoding encoding0 = EncodingFactory.getEncoding("?).9", encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getEncoding("ahHQW)E,oIgL{,'\"", encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getEncoding("ISO8859_2", encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getIscEncoding("isc_encodings.properties");
      EncodingFactory.getJavaEncodingForAlias((String) null);
      EncodingFactory.getEncoding("ISO8859_2", (String) null);
      EncodingFactory.getIscEncoding("");
      EncodingFactory.getJavaEncodingForAlias("z(1fwDDAWe<fhMtlC");
      EncodingFactory.getEncoding("ahHQW)E,oIgL{,'\"");
      EncodingFactory.getJavaEncodingForAlias("");
      Encoding encoding1 = EncodingFactory.createEncoding("_\"z^(i^I@ iGh2'Y*u-");
      assertFalse(encoding1.equals((Object)encoding0));
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.3479749600127222
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EncodingFactory.getIscEncodingSize("");
      EncodingFactory.getEncoding("Cp437");
      EncodingFactory encodingFactory0 = new EncodingFactory();
      // Undeclared exception!
      EncodingFactory.getTranslator("Cp437");
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.1526883273573711
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EncodingFactory.getIscEncoding("R39CFU?");
      EncodingFactory.getEncoding("Cp1252");
      EncodingFactory.getIscEncoding("Nhyx|]#T~z3N]");
      EncodingFactory.getIscEncoding("R39CFU?");
      int int0 = EncodingFactory.getIscEncodingSize("Nhyx|]#T~z3N]");
      char[] charArray0 = new char[7];
      charArray0[0] = 'E';
      charArray0[1] = 'Z';
      charArray0[2] = '-';
      charArray0[3] = 'r';
      charArray0[4] = 'm';
      charArray0[5] = '-';
      charArray0[6] = 'B';
      EncodingFactory.getEncoding("R39CFU?", charArray0);
      int int1 = EncodingFactory.getCharacterSetSize(1);
      assertTrue(int1 == int0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.4805434056443516
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EncodingFactory.getIscEncodingSize("NtxA'G[VGZj;");
      EncodingFactory.getJavaEncodingForAlias("NtxA'G[VGZj;");
      EncodingFactory.getIscEncoding("BioV4");
      EncodingFactory.createEncoding("U;i?}i");
      EncodingFactory.getJavaEncoding("fy$w'c5]r,E|nN");
      EncodingFactory.getJavaEncodingForAlias((String) null);
      EncodingFactory.getJavaEncodingForAlias("");
      char[] charArray0 = new char[0];
      EncodingFactory.getEncoding("fy$w'c5]r,E|nN", charArray0);
      EncodingFactory.getJavaEncodingForAlias("");
      EncodingFactory.getIscEncoding("Cp775");
      EncodingFactory.createEncoding("BioV4");
      EncodingFactory.getIscEncodingSize("BioV4");
      EncodingFactory.getEncoding("Z#IlDN9H\u0007i^C=~>\"", charArray0);
      EncodingFactory.getJavaEncoding("gf<=[RiN~_sc");
      EncodingFactory.getIscEncodingSize((String) null);
      // Undeclared exception!
      EncodingFactory.getTranslator("Cp737");
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.5735160760972796
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = "HY092";
      EncodingFactory.getJavaEncodingForAlias("HY092");
      char[] charArray0 = new char[1];
      charArray0[0] = '\"';
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
  //Test case number: 14
  /*Coverage entropy=0.8271672911398954
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[1] = 'Y';
      EncodingFactory.getEncoding("qD%}x", charArray0);
      EncodingFactory.createEncoding("Cp1256");
      int int0 = EncodingFactory.getIscEncodingSize("qD%}x");
      assertEquals(1, int0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.3114313374732376
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EncodingFactory.getCharacterSetSize(48);
      EncodingFactory.createEncoding("{|@~k`l`EJ1<wU4Q@");
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getEncoding("HY105");
      EncodingFactory.getEncoding("Cp1252", encodingFactory0.DEFAULT_MAPPING);
      int int0 = EncodingFactory.getCharacterSetSize((-1793982769));
      assertEquals(1, int0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EncodingFactory.getIscEncoding("NONE");
      EncodingFactory.createEncoding("NONE");
      // Undeclared exception!
      EncodingFactory.getTranslator("ISO8859_5");
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.0441868483113734
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = "Cp850";
      EncodingFactory.createEncoding("Cp850");
      String string1 = null;
      EncodingFactory.getJavaEncodingForAlias((String) null);
      EncodingFactory.createEncoding("org.firebirdsql.encodings.Encoding_ISO8859_2");
      String string2 = "ISO8859_9";
      EncodingFactory.getIscEncodingSize("ISO8859_9");
      // Undeclared exception!
      EncodingFactory.getTranslator("org.firebirdsql.encodings.Encoding_ISO8859_2");
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.2588940777280202
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.createEncoding("`NJT@m|0ER[&~");
      EncodingFactory.getEncoding("Cp1254");
      EncodingFactory.getJavaEncodingForAlias("Cp865");
      EncodingFactory.getEncoding("Cp865", encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getJavaEncodingForAlias("Cp865");
      EncodingFactory.getEncoding("Cp865");
      EncodingFactory.getCharacterSetSize(1317);
      EncodingFactory.getCharacterSetSize(1317);
      EncodingFactory.getJavaEncoding("`!k/d][Y7mA_");
      EncodingFactory.getJavaEncodingForAlias("Cp1254");
      char[] charArray0 = new char[7];
      charArray0[0] = '~';
      charArray0[1] = 'I';
      charArray0[2] = 'o';
      charArray0[3] = 'F';
      charArray0[4] = 'V';
      charArray0[5] = '|';
      EncodingFactory.getEncoding("`!k/d][Y7mA_", charArray0);
      EncodingFactory.getJavaEncodingForAlias("QN}KFxYF-<Il%^!!");
      // Undeclared exception!
      EncodingFactory.getTranslator("");
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.1464631760614805
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      EncodingFactory.getIscEncoding("R39CFU?");
      EncodingFactory.getEncoding("Cp1252");
      EncodingFactory.createEncoding("Nhyx|]#T~z3N]");
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getEncoding("isc_encoding_size.properties");
      char[] charArray0 = new char[6];
      charArray0[0] = '';
      charArray0[1] = 'f';
      charArray0[2] = '@';
      charArray0[3] = '^';
      char char0 = '+';
      charArray0[4] = '+';
      charArray0[5] = '3';
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
  //Test case number: 20
  /*Coverage entropy=1.2382467451972623
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      EncodingFactory.getJavaEncoding("VfmY9Wyq^,Q:j");
      EncodingFactory.getIscEncoding("ISO8859_9");
      EncodingFactory.getJavaEncodingForAlias("VfmY9Wyq^,Q:j");
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getIscEncodingSize("isc_encodings.properties");
      EncodingFactory.getIscEncoding("");
      EncodingFactory.getJavaEncoding((String) null);
      EncodingFactory.getJavaEncodingForAlias("Cp852");
      EncodingFactory.getCharacterSetSize((-4177984));
      EncodingFactory.getEncoding("F9bY_AbCD<d", encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getEncoding("ISO8859_9", encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getIscEncoding("F9bY_AbCD<d");
      EncodingFactory.getJavaEncodingForAlias("");
      // Undeclared exception!
      EncodingFactory.getEncoding("HY000", "Ez#Y");
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.8022388430968207
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[1] = 'Y';
      EncodingFactory.getEncoding("qD%}x", charArray0);
      String string0 = EncodingFactory.getJavaEncoding("ISO8859_2");
      assertNotNull(string0);
      assertEquals("ISO-8859-2", string0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=2.029395601506142
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      int int0 = EncodingFactory.getIscEncodingSize("isc_encoding_size.properties");
      EncodingFactory.getEncoding("^JmX?fv1,#ZX_K#");
      EncodingFactory.getJavaEncodingForAlias("");
      EncodingFactory.createEncoding(")si0X=3");
      String string0 = EncodingFactory.getIscEncoding("GDS Exception. ");
      assertNull(string0);
      
      EncodingFactory encodingFactory1 = new EncodingFactory();
      EncodingFactory.getEncoding("");
      EncodingFactory.getEncoding("Cp1254", encodingFactory0.DEFAULT_MAPPING);
      int int1 = EncodingFactory.getCharacterSetSize((-3046));
      assertTrue(int1 == int0);
      assertEquals(1, int1);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.6075751554588926
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      EncodingFactory.getIscEncodingSize("NtxA'G[VGZj;");
      EncodingFactory.getJavaEncodingForAlias("NtxA'G[VGZj;");
      EncodingFactory.createEncoding("U;i?}i");
      EncodingFactory.getJavaEncoding("fy$w'c5]r,E|nN");
      EncodingFactory.getJavaEncodingForAlias((String) null);
      EncodingFactory.getJavaEncodingForAlias("");
      char[] charArray0 = new char[0];
      EncodingFactory.getEncoding("fy$w'c5]r,E|nN", charArray0);
      EncodingFactory.getJavaEncodingForAlias("");
      EncodingFactory.getIscEncoding("Cp775");
      EncodingFactory.createEncoding("BioV4");
      EncodingFactory.getIscEncodingSize("BioV4");
      EncodingFactory.getEncoding("Z#IlDN9H\u0007i^C=~>\"", charArray0);
      EncodingFactory.getJavaEncoding("gf<=[RiN~_sc");
      EncodingFactory.getIscEncodingSize((String) null);
      EncodingFactory.getJavaEncodingForAlias("DOS862");
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp1256", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.2382034279507843
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.createEncoding("`NJT@m|0ER[&~");
      EncodingFactory.getEncoding("Cp863");
      EncodingFactory.getJavaEncodingForAlias("Cp865");
      EncodingFactory.getEncoding("Cp865", encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getJavaEncodingForAlias("Cp865");
      EncodingFactory.getEncoding("Cp865");
      EncodingFactory.getCharacterSetSize(1317);
      EncodingFactory.getCharacterSetSize(1317);
      EncodingFactory.getJavaEncoding("`!k/d][Y7mA_");
      EncodingFactory.getJavaEncodingForAlias("Cp863");
      char[] charArray0 = new char[7];
      charArray0[0] = '~';
      charArray0[1] = 'I';
      charArray0[2] = 'o';
      charArray0[3] = 'F';
      charArray0[4] = 'W';
      charArray0[5] = '|';
      charArray0[6] = '{';
      EncodingFactory.getEncoding("c>1dV(9d", charArray0);
      EncodingFactory.getJavaEncodingForAlias("udL]|,$;1+nx.c");
      Encoding encoding0 = EncodingFactory.createEncoding("Cp775");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String string0 = "Cp1250";
      char[] charArray0 = new char[1];
      charArray0[0] = 'A';
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp1250", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.4354735656251962
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = 'l';
      EncodingFactory.getEncoding("q=713N07,D", charArray0);
      EncodingFactory.getIscEncoding("q=713N07,D");
      EncodingFactory.getJavaEncodingForAlias((String) null);
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getIscEncodingSize((String) null);
      EncodingFactory.getIscEncoding((String) null);
      EncodingFactory.getJavaEncoding("`5 (egi.");
      String string0 = "|4rz *4N\\i`;`6}aqg";
      EncodingFactory.getJavaEncodingForAlias("q=713N07,D");
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp1257", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.2176279131254795
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      EncodingFactory.getJavaEncoding("VfmY9Wyq^,Q:j");
      String string0 = EncodingFactory.getIscEncoding("ISO8859_9");
      assertEquals("ISO8859_9", string0);
      assertNotNull(string0);
      
      EncodingFactory.getJavaEncodingForAlias("VfmY9Wyq^,Q:j");
      EncodingFactory encodingFactory0 = new EncodingFactory();
      int int0 = EncodingFactory.getIscEncodingSize("isc_encodings.properties");
      assertEquals(1, int0);
      
      EncodingFactory.getIscEncoding("");
      EncodingFactory.getJavaEncoding((String) null);
      EncodingFactory.getEncoding("ISO8859_3", encodingFactory0.DEFAULT_MAPPING);
      int int1 = EncodingFactory.getCharacterSetSize(4);
      assertEquals(4, int1);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.22371807606583377
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      EncodingFactory.getCharacterSetSize(0);
      String string0 = "q=713N07,D";
      char[] charArray0 = new char[7];
      charArray0[0] = '\"';
      charArray0[1] = '\"';
      charArray0[2] = '\"';
      charArray0[3] = '\"';
      charArray0[4] = '\"';
      charArray0[5] = '\"';
      charArray0[6] = '\"';
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_6", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 29
  /*Coverage entropy=0.5648452627817429
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      EncodingFactory.getJavaEncodingForAlias((String) null);
      String string0 = "h60nO!";
      char[] charArray0 = new char[1];
      charArray0[0] = '2';
      EncodingFactory.getEncoding("h60nO!", charArray0);
      EncodingFactory.getEncoding((String) null, charArray0);
      EncodingFactory.createEncoding("Cp775");
      String string1 = "Cp1251";
      EncodingFactory.createEncoding("Cp1251");
      // Undeclared exception!
      EncodingFactory.getTranslator("v|TB3*F')I^Wc5");
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.0933277921902085
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      EncodingFactory.getIscEncodingSize("NtxA'G[VGZj;");
      EncodingFactory.getJavaEncodingForAlias("NtxA'G[VGZj;");
      EncodingFactory.createEncoding("U;i?}i");
      EncodingFactory.getJavaEncoding("fy$w'c5]r,E|nN");
      EncodingFactory.getJavaEncodingForAlias((String) null);
      char[] charArray0 = new char[0];
      EncodingFactory.getEncoding("fy$w'c5]r,E|nN", charArray0);
      EncodingFactory.getJavaEncodingForAlias("");
      EncodingFactory.getIscEncoding("Cp775");
      EncodingFactory.getIscEncoding("s\"i|$2Js{y|5sG\"DOl>");
      EncodingFactory.getJavaEncoding("DOS862");
      EncodingFactory.getJavaEncodingForAlias((String) null);
      EncodingFactory.getEncoding((String) null, charArray0);
      Encoding encoding0 = EncodingFactory.createEncoding("Cp1253");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.3507032992806878
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      String string0 = "Cp1255";
      EncodingFactory.getIscEncoding("Cp1255");
      EncodingFactory.getEncoding("F9bY_AbCD<d");
      EncodingFactory.createEncoding("Cp1255");
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getEncoding("u$RxR");
      EncodingFactory.getJavaEncodingForAlias("Cp437");
      EncodingFactory.getCharacterSetSize((-4177984));
      EncodingFactory.getEncoding("s|(h)", encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getEncoding("Nhyx|]#T~z3N]", encodingFactory0.DEFAULT_MAPPING);
      String string1 = "x=?0UxSuHBHY?";
      EncodingFactory.getIscEncoding("x=?0UxSuHBHY?");
      EncodingFactory.getJavaEncodingForAlias("Cp1255");
      // Undeclared exception!
      EncodingFactory.getEncoding("Cp1257", "isc_encodings.properties");
  }

  /**
  //Test case number: 32
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String string0 = "qD%}x";
      char[] charArray0 = new char[2];
      EncodingFactory.getEncoding("qD%}x", charArray0);
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp862", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 33
  /*Coverage entropy=1.220532287733014
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = 'l';
      EncodingFactory.getEncoding("q=713N07,D", charArray0);
      EncodingFactory.getEncoding("Cp852");
      EncodingFactory.getCharacterSetSize(1317);
      EncodingFactory.getCharacterSetSize((-1158706846));
      EncodingFactory.getJavaEncoding("yl$.JGo%un;{");
      String string0 = "Cp437";
      EncodingFactory.getJavaEncodingForAlias("Cp437");
      EncodingFactory.getJavaEncoding("7V]");
      EncodingFactory.getJavaEncodingForAlias((String) null);
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp861", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 34
  /*Coverage entropy=1.1185537085989763
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      char[] charArray0 = new char[2];
      EncodingFactory.getEncoding("qD%}x", charArray0);
      EncodingFactory.getEncoding(">67g-u");
      EncodingFactory.getEncoding(">67g-u", charArray0);
      EncodingFactory.getIscEncodingSize(">67g-u");
      EncodingFactory.createEncoding("qD%}x");
      EncodingFactory.createEncoding("Cp866");
      String string0 = EncodingFactory.getJavaEncodingForAlias("qD%}x");
      assertNull(string0);
  }

  /**
  //Test case number: 35
  /*Coverage entropy=1.4821693083585323
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = 'l';
      EncodingFactory.getEncoding("q=713N07,D", charArray0);
      String string0 = "Cp852";
      EncodingFactory.getEncoding("Cp852");
      EncodingFactory.getCharacterSetSize(1317);
      EncodingFactory.getCharacterSetSize((-1158706846));
      EncodingFactory.getJavaEncoding("yl$.JGo%un;{");
      String string1 = "Cp437";
      EncodingFactory.getJavaEncodingForAlias("Cp437");
      EncodingFactory.getJavaEncoding("yl$.JGo%un;{");
      EncodingFactory.getJavaEncodingForAlias((String) null);
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp437", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 36
  /*Coverage entropy=1.8306855287903425
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      EncodingFactory.getJavaEncoding("VfmY9Wyq^,Q:j");
      EncodingFactory.getIscEncoding("VfmY9Wyq^,Q:j");
      EncodingFactory.getJavaEncodingForAlias("VfmY9Wyq^,Q:j");
      EncodingFactory.getJavaEncodingForAlias((String) null);
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getIscEncodingSize("isc_encoding_size.properties");
      EncodingFactory.getIscEncoding((String) null);
      EncodingFactory.getJavaEncoding("ISO8859_9");
      EncodingFactory.getJavaEncodingForAlias("x2as`-");
      EncodingFactory.getEncoding("Cp1255", encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.createEncoding("VfmY9Wyq^,Q:j");
      String string0 = EncodingFactory.getJavaEncoding(";1+g@?(3~KAyie");
      assertNull(string0);
  }

  /**
  //Test case number: 37
  /*Coverage entropy=1.172330007877176
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      char[] charArray0 = new char[2];
      EncodingFactory.getEncoding("qD%}x", charArray0);
      EncodingFactory.getJavaEncodingForAlias("org.firebirdsql.encodings.Encoding_Cp1255");
      EncodingFactory.getEncoding("WIN1255", charArray0);
      EncodingFactory.getJavaEncodingForAlias("WIN1255");
      EncodingFactory.getEncoding((String) null);
      EncodingFactory.getCharacterSetSize(1317);
      EncodingFactory.getCharacterSetSize(1317);
      EncodingFactory.getJavaEncoding("Cp858");
      EncodingFactory.getJavaEncodingForAlias("ISO8859_7");
      EncodingFactory.createEncoding("utf8");
      EncodingFactory.getIscEncodingSize("KdHV{UJ7SX%ebXU$");
      EncodingFactory.getJavaEncoding("ISO8859_7");
      EncodingFactory.getJavaEncoding("org.firebirdsql.jdbc.FBSQLException");
      String string0 = EncodingFactory.getJavaEncoding("Cp1253");
      assertNull(string0);
  }

  /**
  //Test case number: 38
  /*Coverage entropy=1.2773072516686907
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getEncoding("Cp437");
      EncodingFactory.getEncoding("Cp437", encodingFactory0.DEFAULT_MAPPING);
      int int0 = EncodingFactory.getIscEncodingSize("Nh.s'4){)(}f0uj");
      assertEquals(1, int0);
      
      EncodingFactory.createEncoding("isc_encodings.properties");
      EncodingFactory.createEncoding("ISO8859_1");
      String string0 = EncodingFactory.getJavaEncodingForAlias("Cp437");
      assertNotNull(string0);
      assertEquals("Cp437", string0);
  }

  /**
  //Test case number: 39
  /*Coverage entropy=1.235659360866368
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      EncodingFactory.getIscEncoding("R39CFU?");
      EncodingFactory.getIscEncoding("Nhyx|]#T~z3N]");
      EncodingFactory.getJavaEncodingForAlias((String) null);
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getIscEncodingSize("DOS737");
      EncodingFactory.getIscEncoding("DOS737");
      EncodingFactory.getJavaEncoding("9Fpyw-l^}");
      EncodingFactory.getJavaEncodingForAlias("isc_encodings.properties");
      EncodingFactory.getEncoding((String) null, encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.createEncoding("Cp862");
      EncodingFactory.getEncoding("", encodingFactory0.DEFAULT_MAPPING);
      Encoding encoding0 = EncodingFactory.createEncoding("Cp1252");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 40
  /*Coverage entropy=1.9793537068514886
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.createEncoding("`NJT@m|0ER[&~");
      EncodingFactory.getEncoding("isc_encodings.properties");
      EncodingFactory.getJavaEncodingForAlias("Cp865");
      EncodingFactory.getEncoding("Cp865", encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getJavaEncodingForAlias("Cp865");
      String string0 = EncodingFactory.defaultEncoding;
      String string1 = "Zo\"9-Ra-xPE^M-][y";
      EncodingFactory.getEncoding("Cp1253", encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getJavaEncodingForAlias("Zo\"9-Ra-xPE^M-][y");
      EncodingFactory.getCharacterSetSize((-4177984));
      EncodingFactory.getEncoding((String) null, encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getEncoding("Cp1253", encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getIscEncoding("`NJT@m|0ER[&~");
      EncodingFactory.getJavaEncodingForAlias("HY000");
      String string2 = "xl,~A3nQF}DAnoi#5W";
      // Undeclared exception!
      EncodingFactory.getEncoding("xl,~A3nQF}DAnoi#5W", "HY000");
  }

  /**
  //Test case number: 41
  /*Coverage entropy=1.7400202964616238
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getIscEncodingSize("isc_encoding_size.properties");
      EncodingFactory.getEncoding("^JmX?fv1,#ZX_K#");
      EncodingFactory.getJavaEncodingForAlias("");
      EncodingFactory.createEncoding(")si0X=3");
      EncodingFactory.getIscEncoding("GDS Exception. ");
      EncodingFactory.createEncoding("-Rrr[6WWtX");
      EncodingFactory.getEncoding("GDS Exception. ", encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getEncoding("ahHQW)E,oIgL{,'\"", encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getEncoding("ISO8859_2", encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getIscEncoding("isc_encodings.properties");
      EncodingFactory.getJavaEncodingForAlias((String) null);
      EncodingFactory.getEncoding("ISO8859_2", (String) null);
      EncodingFactory.getJavaEncodingForAlias("z(1fwDDAWe<fhMtlC");
      EncodingFactory.getEncoding("ahHQW)E,oIgL{,'\"");
      EncodingFactory.getJavaEncodingForAlias("");
      EncodingFactory.getEncoding("&?", encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getEncoding("Cp775", encodingFactory0.DEFAULT_MAPPING);
      String string0 = EncodingFactory.getJavaEncoding("Cp775");
      assertNull(string0);
  }

  /**
  //Test case number: 42
  /*Coverage entropy=0.7579048419744566
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      EncodingFactory.getJavaEncoding("$S0x 5ucd");
      EncodingFactory.createEncoding("$S0x 5ucd");
      EncodingFactory.createEncoding("$S0x 5ucd");
      EncodingFactory.createEncoding("$S0x 5ucd");
      EncodingFactory.getJavaEncodingForAlias("$S0x 5ucd");
      char[] charArray0 = new char[7];
      charArray0[0] = '';
      charArray0[1] = 'i';
      charArray0[2] = 'V';
      charArray0[3] = ']';
      charArray0[4] = '}';
      charArray0[5] = 'Z';
      charArray0[6] = 's';
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_1", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}