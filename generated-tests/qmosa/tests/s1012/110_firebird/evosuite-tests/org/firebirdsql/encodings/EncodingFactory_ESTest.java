/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 11:30:50 GMT 2018
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
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getIscEncodingSize("isc_encoding_size.properties");
      EncodingFactory.getEncoding("6'4");
      EncodingFactory.createEncoding("isc_encoding_size.properties");
      EncodingFactory.getJavaEncoding("isc_encoding_size.properties");
      EncodingFactory.getEncoding((String) null, encodingFactory0.DEFAULT_MAPPING);
      // Undeclared exception!
      EncodingFactory.getEncoding("isc_encodings.properties", "isc_encodings.properties");
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.9245651677080483
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EncodingFactory.getIscEncoding("/6]ACu(U:eJ^Z6,R;s");
      String string0 = "";
      EncodingFactory.getIscEncodingSize("");
      EncodingFactory.getIscEncoding("urC$#Sx? -@\"O^!$jz");
      EncodingFactory.getEncoding("f\u0002 Dg5E");
      String string1 = "\"5OS+";
      EncodingFactory.getJavaEncodingForAlias("\"5OS+");
      // Undeclared exception!
      EncodingFactory.getTranslator("");
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.8658105790417806
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EncodingFactory.getJavaEncoding("WCXv");
      EncodingFactory.getJavaEncoding("");
      char[] charArray0 = new char[3];
      charArray0[0] = 'A';
      charArray0[1] = ':';
      charArray0[2] = 'g';
      EncodingFactory.getEncoding((String) null, charArray0);
      // Undeclared exception!
      EncodingFactory.getTranslator((String) null);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.7677614722893296
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EncodingFactory.getCharacterSetSize(593);
      EncodingFactory.getCharacterSetSize((-496));
      EncodingFactory.getCharacterSetSize(0);
      EncodingFactory encodingFactory0 = new EncodingFactory();
      String string0 = "8PK!XWd Hvc9xXK";
      EncodingFactory.getIscEncoding("8PK!XWd Hvc9xXK");
      EncodingFactory.getEncoding("8PK!XWd Hvc9xXK", encodingFactory0.DEFAULT_MAPPING);
      // Undeclared exception!
      EncodingFactory.getTranslator("isc_encodings.properties");
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.9495936677167384
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = "Cp861";
      EncodingFactory.getEncoding("Cp861");
      String string1 = "Cp1257";
      EncodingFactory.getEncoding("Cp1257");
      EncodingFactory.createEncoding("Cp861");
      EncodingFactory.getEncoding("Cp861");
      EncodingFactory.createEncoding("LhWdD4[Df|");
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getEncoding("Cp861");
      // Undeclared exception!
      EncodingFactory.getEncoding("LhWdD4[Df|", "Cp861");
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.8654978254966557
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EncodingFactory.getJavaEncoding("(");
      EncodingFactory.getIscEncodingSize("");
      EncodingFactory.getJavaEncoding("OZ*`oP");
      String string0 = " ge!a}tsnap";
      EncodingFactory.getIscEncodingSize(" ge!a}tsnap");
      EncodingFactory.getIscEncodingSize("(");
      EncodingFactory.getEncoding("ISO8859_8");
      // Undeclared exception!
      EncodingFactory.getTranslator(">=ey6m6Jo_[<c *");
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.220997451025198
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EncodingFactory.getJavaEncodingForAlias("&b>=:Of34m0U*");
      EncodingFactory.getJavaEncoding("&b>=:Of34m0U*");
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getIscEncodingSize("isc_encoding_size.properties");
      EncodingFactory.getEncoding("39Hwafw.(7I6w4']{");
      EncodingFactory.getIscEncodingSize((String) null);
      EncodingFactory.getIscEncoding((String) null);
      EncodingFactory.getEncoding("isc_encoding_size.properties");
      EncodingFactory.getJavaEncodingForAlias((String) null);
      // Undeclared exception!
      EncodingFactory.getEncoding((String) null, "39Hwafw.(7I6w4']{");
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.9061547465398496
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EncodingFactory.createEncoding("HY002");
      Encoding encoding0 = EncodingFactory.getEncoding("HY002", (String) null);
      EncodingFactory.getJavaEncodingForAlias("HY002");
      EncodingFactory.getEncoding("Incorrect mapping format. All properties should start with \"db.\", but ");
      char[] charArray0 = new char[8];
      charArray0[0] = '+';
      charArray0[1] = ']';
      charArray0[2] = '_';
      charArray0[3] = 'Z';
      charArray0[4] = 'q';
      charArray0[5] = '1';
      charArray0[6] = '<';
      charArray0[7] = 'v';
      Encoding encoding1 = EncodingFactory.getEncoding("", charArray0);
      assertNotSame(encoding1, encoding0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.0455944438444056
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = null;
      EncodingFactory.getJavaEncoding((String) null);
      EncodingFactory.getJavaEncoding((String) null);
      EncodingFactory.getIscEncodingSize((String) null);
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getEncoding("J@R1\"1@7OgDhwE5G", (String) null);
      EncodingFactory.getJavaEncodingForAlias("isc_encodings.properties");
      EncodingFactory.createEncoding("ISO8859_7");
      // Undeclared exception!
      EncodingFactory.getTranslator("isc_encodings.properties");
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.6091450788381643
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EncodingFactory.getEncoding("Cp861");
      EncodingFactory.createEncoding("Cp861");
      EncodingFactory.createEncoding("07001");
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getJavaEncoding("DOS864");
      EncodingFactory.getJavaEncodingForAlias("07001");
      EncodingFactory.getEncoding("isc_encodings.properties");
      EncodingFactory.getJavaEncodingForAlias("DOS864");
      EncodingFactory.getJavaEncoding("");
      EncodingFactory.getIscEncoding((String) null);
      EncodingFactory.getJavaEncoding("Cp866");
      EncodingFactory.getCharacterSetSize((-760));
      String string0 = "5dC+~";
      EncodingFactory.getEncoding("HY105", (String) null);
      String string1 = "(^OW CZ`Y^J$5";
      EncodingFactory.getEncoding("(^OW CZ`Y^J$5", encodingFactory0.DEFAULT_MAPPING);
      // Undeclared exception!
      EncodingFactory.getTranslator((String) null);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.2534703185313114
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = "Cp861";
      EncodingFactory.getEncoding("Cp861");
      EncodingFactory.getEncoding("Cp1257");
      EncodingFactory.createEncoding("Cp861");
      EncodingFactory.getEncoding("Cp1257");
      EncodingFactory.createEncoding("ZhWdD4>Df");
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getEncoding("Cp861");
      EncodingFactory.getEncoding("Cp861", encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getJavaEncoding("org.firebirdsql.encodings.Encoding_OneByte");
      String string1 = "";
      EncodingFactory.getJavaEncodingForAlias("");
      EncodingFactory.getEncoding("Cp1257");
      // Undeclared exception!
      EncodingFactory.getTranslator((String) null);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.0216998012879275
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EncodingFactory.getEncoding("HY000");
      EncodingFactory.getIscEncodingSize("");
      String string0 = "urC$#Sx\\? -@\"O^!$jz";
      String string1 = "HzIRd6|hjr=`;t";
      EncodingFactory.getIscEncoding("HzIRd6|hjr=`;t");
      EncodingFactory.getEncoding("f\u0002 Dg5E");
      String string2 = "\"5OS+";
      EncodingFactory.getJavaEncodingForAlias("ISO8859_13");
      // Undeclared exception!
      EncodingFactory.getTranslator("");
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.815722890725723
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EncodingFactory.getIscEncodingSize("&Mrli)^n7$e`W]");
      EncodingFactory.createEncoding("ISO8859_5");
      EncodingFactory.getJavaEncoding("&Mrli)^n7$e`W]");
      // Undeclared exception!
      EncodingFactory.getTranslator((String) null);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.5644893495392438
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getIscEncoding("isc_encoding_size.properties");
      EncodingFactory.getJavaEncodingForAlias((String) null);
      EncodingFactory.getJavaEncoding("ISO8859_9");
      EncodingFactory.getJavaEncodingForAlias("Cp850");
      EncodingFactory.getEncoding("Cp863");
      String string0 = "Cp1255";
      EncodingFactory.getJavaEncodingForAlias("Cp1255");
      EncodingFactory.getJavaEncoding("07005");
      EncodingFactory.getIscEncoding("Cp1255");
      EncodingFactory.getJavaEncoding((String) null);
      EncodingFactory.getCharacterSetSize((-760));
      EncodingFactory.getEncoding((String) null, (String) null);
      EncodingFactory.getEncoding("Cp863", encodingFactory0.DEFAULT_MAPPING);
      // Undeclared exception!
      EncodingFactory.getTranslator("Cp850");
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.3268496059912183
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EncodingFactory.getEncoding("Cp861");
      EncodingFactory.createEncoding("Cp861");
      EncodingFactory.createEncoding("07001");
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getJavaEncoding("DOS864");
      EncodingFactory.getJavaEncodingForAlias("07001");
      EncodingFactory.getEncoding("isc_encodings.properties");
      EncodingFactory.getJavaEncodingForAlias("DOS864");
      EncodingFactory.getJavaEncoding("");
      EncodingFactory.getIscEncoding((String) null);
      EncodingFactory.getJavaEncoding("ISO8859_2");
      String string0 = "5dC+~";
      EncodingFactory.getEncoding("Cp862", encodingFactory0.DEFAULT_MAPPING);
      String string1 = "";
      // Undeclared exception!
      EncodingFactory.getTranslator((String) null);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.5002340327148593
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EncodingFactory.getEncoding("Cp861");
      EncodingFactory.getEncoding("Cp1257");
      EncodingFactory.createEncoding("Cp861");
      EncodingFactory.getEncoding("Cp1257");
      EncodingFactory.createEncoding("ZhWdD4>Df");
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getEncoding("Cp861");
      EncodingFactory.getEncoding("Cp861", encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.createEncoding("isc_encoding_size.properties");
      EncodingFactory.getJavaEncoding("org.firebirdsql.encodings.Encoding_OneByte");
      EncodingFactory.getEncoding("Cp861", encodingFactory0.DEFAULT_MAPPING);
      String string0 = "DOS865";
      EncodingFactory.getJavaEncodingForAlias("DOS865");
      EncodingFactory.getIscEncodingSize("ISO8859_8");
      // Undeclared exception!
      try { 
        EncodingFactory.createEncoding((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.2435596325339096
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getIscEncoding("isc_encoding_size.properties");
      EncodingFactory.getJavaEncodingForAlias((String) null);
      EncodingFactory.getEncoding("83puNlT\"", encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getJavaEncoding((String) null);
      EncodingFactory.getJavaEncodingForAlias((String) null);
      String string0 = "Cp864";
      EncodingFactory.getEncoding("Cp864");
      // Undeclared exception!
      EncodingFactory.getTranslator("");
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.8778382404072833
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = "txA4^_,IRi<,3F)\\u";
      EncodingFactory.getEncoding(string0);
      EncodingFactory.createEncoding(string0);
      EncodingFactory.createEncoding("|-P");
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getJavaEncodingForAlias("WIN1256");
      EncodingFactory.getJavaEncoding("ISO8859_4");
      EncodingFactory.createEncoding("Cp437");
      EncodingFactory.getJavaEncodingForAlias("UNICODE_FSS");
      EncodingFactory.getIscEncodingSize("UNICODE_FSS");
      EncodingFactory.getIscEncoding("CK");
      EncodingFactory.getEncoding("isc_encoding_size.properties");
      // Undeclared exception!
      EncodingFactory.getEncoding((String) null, "isc_encoding_size.properties");
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.3903773829077755
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = "Cp861";
      EncodingFactory.getEncoding("Cp861");
      EncodingFactory.createEncoding("Cp861");
      String string1 = "07001";
      EncodingFactory.createEncoding("Cp861");
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getJavaEncoding("07001");
      EncodingFactory.getJavaEncodingForAlias("Incorrect mapping format. Key should consist only of 4 characters, but ");
      EncodingFactory.getJavaEncodingForAlias("isc_encodings.properties");
      EncodingFactory.getJavaEncoding("HY000");
      EncodingFactory.getIscEncoding("07005");
      EncodingFactory.getJavaEncoding((String) null);
      EncodingFactory.getEncoding("Cp860", encodingFactory0.DEFAULT_MAPPING);
      // Undeclared exception!
      EncodingFactory.getTranslator("HY000");
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.3088822245034084
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      EncodingFactory.getEncoding("3&;J15J");
      EncodingFactory.getCharacterSetSize(0);
      EncodingFactory.createEncoding("3&;J15J");
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getEncoding("isc_encoding_size.properties", encodingFactory0.DEFAULT_MAPPING);
      Encoding encoding0 = EncodingFactory.getEncoding("isc_encoding_size.properties");
      EncodingFactory.getJavaEncodingForAlias("3&;J15J");
      EncodingFactory.getJavaEncodingForAlias("isc_encodings.properties");
      EncodingFactory.getEncoding("8001", encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getIscEncoding("3&;J15J");
      EncodingFactory.createEncoding("Cp1254");
      EncodingFactory.getIscEncodingSize("isc_encoding_size.properties");
      EncodingFactory.getIscEncoding("!t{04~N_e;#5,");
      EncodingFactory.getIscEncoding("isc_encoding_size.properties");
      EncodingFactory.getJavaEncodingForAlias("*W[0Le8");
      EncodingFactory.getIscEncoding("isc_encoding_size.properties");
      EncodingFactory.getEncoding("ISO8859_13");
      EncodingFactory.getIscEncodingSize("Cp860");
      Encoding encoding1 = EncodingFactory.createEncoding("isc_encodings.properties");
      assertNotSame(encoding1, encoding0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=2.072139762748707
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getIscEncoding("isc_encoding_size.properties");
      EncodingFactory.getJavaEncodingForAlias((String) null);
      EncodingFactory.getJavaEncoding("ISO8859_9");
      EncodingFactory.getJavaEncodingForAlias("A|.56");
      EncodingFactory.getEncoding("Cp863");
      EncodingFactory.getJavaEncodingForAlias("Cp1255");
      EncodingFactory.getJavaEncoding("07005");
      EncodingFactory.getIscEncoding("Cp1255");
      EncodingFactory.getJavaEncoding((String) null);
      EncodingFactory.getCharacterSetSize((-760));
      EncodingFactory.getJavaEncodingForAlias("ISO8859_9");
      EncodingFactory.getIscEncodingSize("DOS864");
      EncodingFactory.createEncoding("Cp1255");
      EncodingFactory.getJavaEncoding("DOS865");
      EncodingFactory encodingFactory1 = new EncodingFactory();
      EncodingFactory.getJavaEncodingForAlias("Cp865");
      EncodingFactory.getJavaEncodingForAlias("4ilkr7g=-.Z07$`A");
      // Undeclared exception!
      EncodingFactory.getTranslator("ISO-8859-9");
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.49535988174746093
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EncodingFactory.createEncoding("ISO8859_4");
      String string0 = "#83bJA{n";
      EncodingFactory.getJavaEncoding("#83bJA{n");
      // Undeclared exception!
      try { 
        EncodingFactory.createEncoding((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.443966404115417
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      EncodingFactory.getEncoding("Cp861");
      EncodingFactory.createEncoding("Cp861");
      EncodingFactory.createEncoding("Cp861");
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getJavaEncoding("07001");
      EncodingFactory.getJavaEncodingForAlias("Incorrect mapping format. Key should consist only of 4 characters, but ");
      EncodingFactory.getJavaEncodingForAlias("isc_encodings.properties");
      EncodingFactory.getJavaEncoding("HY000");
      EncodingFactory.getIscEncoding("07005");
      EncodingFactory.getJavaEncoding((String) null);
      EncodingFactory.getEncoding("Cp860");
      EncodingFactory.getJavaEncodingForAlias((String) null);
      EncodingFactory.getEncoding("HY000", (String) null);
      // Undeclared exception!
      EncodingFactory.getEncoding("A,-hotz*7q=dK|g]pv", "isc_encodings.properties");
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.4447822652239695
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      EncodingFactory.getEncoding("3&;J15J");
      EncodingFactory.getCharacterSetSize(0);
      EncodingFactory.createEncoding("3&;J15J");
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getEncoding("isc_encoding_size.properties", encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getEncoding("isc_encoding_size.properties");
      EncodingFactory.getJavaEncodingForAlias("3&;J15J");
      EncodingFactory.getJavaEncodingForAlias("isc_encodings.properties");
      EncodingFactory.getEncoding("8001", encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getIscEncoding("3&;J15J");
      EncodingFactory.createEncoding("Cp1254");
      EncodingFactory.getIscEncodingSize("isc_encoding_size.properties");
      EncodingFactory.getIscEncoding("!t{04~N_e;#5,");
      EncodingFactory.getIscEncoding("isc_encoding_size.properties");
      EncodingFactory.getJavaEncodingForAlias("*W[0Le8");
      EncodingFactory.getJavaEncodingForAlias("eND1Bwt:ZJFMU&");
      EncodingFactory.getEncoding("Cp862", (String) null);
      EncodingFactory.getJavaEncoding((String) null);
      EncodingFactory.getJavaEncoding("eND1Bwt:ZJFMU&");
      EncodingFactory.getJavaEncodingForAlias("Cp858");
      Encoding encoding0 = EncodingFactory.createEncoding("Cp1255");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.1809438619784614
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = "3&;J15J";
      EncodingFactory.getEncoding("3&;J15J");
      EncodingFactory.getCharacterSetSize(0);
      EncodingFactory.createEncoding("3&;J15J");
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getEncoding("isc_encoding_size.properties", encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getJavaEncoding("Cp865");
      EncodingFactory.getJavaEncodingForAlias("{C{/-");
      EncodingFactory.getJavaEncodingForAlias("Cp852");
      EncodingFactory.getJavaEncoding("Cp869");
      EncodingFactory.getIscEncoding("Cp865");
      String string1 = "Resource Exception. ";
      EncodingFactory.getJavaEncoding("Resource Exception. ");
      String string2 = "ISO8859_6";
      EncodingFactory.getEncoding("ISO8859_6", encodingFactory0.DEFAULT_MAPPING);
      // Undeclared exception!
      EncodingFactory.getTranslator((String) null);
  }
}
