/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 11:53:26 GMT 2018
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
      EncodingFactory.getEncoding("");
      char[] charArray0 = new char[1];
      charArray0[0] = '#';
      EncodingFactory.getEncoding("", charArray0);
      EncodingFactory.getJavaEncoding("");
      EncodingFactory.createEncoding("L@P1;CXvj");
      String string0 = EncodingFactory.getIscEncoding("=C|t");
      assertNull(string0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EncodingFactory.getCharacterSetSize((-334));
      EncodingFactory.getCharacterSetSize(1735);
      String string0 = "{";
      // Undeclared exception!
      EncodingFactory.getTranslator("{");
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.7479662368880953
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = "~ZqOe6: 2=20[n1G";
      EncodingFactory.getIscEncoding("~ZqOe6: 2=20[n1G");
      EncodingFactory.getJavaEncoding("~ZqOe6: 2=20[n1G");
      EncodingFactory.getCharacterSetSize(0);
      EncodingFactory.getIscEncodingSize("~ZqOe6: 2=20[n1G");
      // Undeclared exception!
      EncodingFactory.getTranslator("~ZqOe6: 2=20[n1G");
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = "";
      EncodingFactory.getJavaEncodingForAlias("");
      EncodingFactory.getJavaEncoding((String) null);
      String string1 = "Cp869";
      // Undeclared exception!
      EncodingFactory.getTranslator("Cp869");
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.1034356407098538
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EncodingFactory.getIscEncoding("");
      EncodingFactory.getIscEncodingSize((String) null);
      EncodingFactory.getJavaEncoding("isc_encoding_size.properties");
      char[] charArray0 = new char[2];
      charArray0[0] = '-';
      charArray0[1] = 'p';
      EncodingFactory.getEncoding("", charArray0);
      EncodingFactory.getJavaEncoding("Cp858");
      Encoding encoding0 = EncodingFactory.getEncoding("ISO8859_6");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.9061547465398496
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EncodingFactory.getJavaEncoding("");
      EncodingFactory.getJavaEncodingForAlias((String) null);
      EncodingFactory.getJavaEncodingForAlias("");
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getEncoding("", encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getEncoding((String) null, encodingFactory0.DEFAULT_MAPPING);
      // Undeclared exception!
      EncodingFactory.getTranslator((String) null);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.1175722656612508
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EncodingFactory.getIscEncoding("[x/<M]|P%`3Sik|b");
      EncodingFactory.getEncoding("[x/<M]|P%`3Sik|b", (String) null);
      char[] charArray0 = new char[7];
      charArray0[0] = 'Q';
      charArray0[1] = '';
      charArray0[2] = 'n';
      charArray0[3] = 'z';
      charArray0[4] = '8';
      charArray0[5] = 'Y';
      charArray0[6] = '3';
      EncodingFactory.getEncoding("", charArray0);
      EncodingFactory.getJavaEncodingForAlias("");
      EncodingFactory.createEncoding("Cp1250");
      int int0 = EncodingFactory.getIscEncodingSize("cNx,xH(L>(oDi]S8G@l");
      assertEquals(1, int0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.3365927726355034
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EncodingFactory.getCharacterSetSize(0);
      EncodingFactory.getIscEncodingSize((String) null);
      EncodingFactory.getJavaEncoding((String) null);
      EncodingFactory.getIscEncoding((String) null);
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getEncoding((String) null, encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getJavaEncoding((String) null);
      EncodingFactory.getJavaEncodingForAlias("$)&Ao6$$oZE");
      // Undeclared exception!
      try { 
        EncodingFactory.createEncoding((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.8462202193216335
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EncodingFactory.getCharacterSetSize(0);
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getJavaEncodingForAlias("Cp858");
      String string0 = "Cp865";
      String string1 = "HxL%'#787+dv*R9";
      char[] charArray0 = new char[3];
      // Undeclared exception!
      EncodingFactory.getEncoding("v7d|EgnjpGw+", "");
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.126201616279816
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EncodingFactory.getEncoding("QAyV$Fj");
      EncodingFactory.getIscEncodingSize("QAyV$Fj");
      EncodingFactory.getIscEncodingSize("NI5n3P");
      EncodingFactory.createEncoding("@_ITNq");
      char[] charArray0 = new char[2];
      charArray0[0] = '1';
      charArray0[1] = 'u';
      EncodingFactory.getEncoding("@_ITNq", charArray0);
      // Undeclared exception!
      EncodingFactory.getEncoding((String) null, "!Lw`]");
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.118384512313842
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EncodingFactory.getIscEncoding("iXHU9DY4");
      EncodingFactory.getIscEncodingSize((String) null);
      EncodingFactory.getJavaEncoding("iXHU9DY4");
      char[] charArray0 = new char[0];
      EncodingFactory.getEncoding(" 2_V?I", charArray0);
      EncodingFactory.getJavaEncoding("Cp1257");
      Encoding encoding0 = EncodingFactory.getEncoding("Cp858");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.8324668987136756
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = "";
      EncodingFactory.getIscEncoding("");
      EncodingFactory.getIscEncodingSize((String) null);
      EncodingFactory.getJavaEncoding("isc_encoding_size.properties");
      char[] charArray0 = new char[2];
      EncodingFactory.getEncoding((String) null, charArray0);
      EncodingFactory.getIscEncoding((String) null);
      EncodingFactory encodingFactory0 = new EncodingFactory();
      char[] charArray1 = new char[0];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_1", charArray1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.4114760301684262
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.getEncoding("QAyV$Fj");
      EncodingFactory.getIscEncodingSize("QAyV$Fj");
      EncodingFactory.getIscEncodingSize("QAyV$Fj");
      EncodingFactory.getJavaEncoding("UTF8");
      char[] charArray0 = new char[3];
      charArray0[0] = '-';
      charArray0[1] = 'p';
      charArray0[2] = 'p';
      EncodingFactory.getEncoding("WIN1250", charArray0);
      EncodingFactory.getJavaEncoding("yM1?{(ldacf&&C");
      Encoding encoding1 = EncodingFactory.getEncoding("org.firebirdsql.jdbc.FBSQLException");
      assertFalse(encoding1.equals((Object)encoding0));
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.855185888136899
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = "";
      EncodingFactory.getEncoding("");
      char[] charArray0 = new char[1];
      charArray0[0] = '#';
      EncodingFactory.getEncoding("", charArray0);
      String string1 = "Cp852";
      EncodingFactory.createEncoding("Cp852");
      EncodingFactory.getEncoding("HY009", charArray0);
      // Undeclared exception!
      EncodingFactory.getEncoding(" h_6(4", "LY=oBwE9M`");
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.7256945348971954
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      char[] charArray0 = new char[1];
      char char0 = '#';
      EncodingFactory.createEncoding("ISO8859_3");
      String string0 = "t:_,,^k<]X=Io2:@{";
      EncodingFactory.getIscEncoding("t:_,,^k<]X=Io2:@{");
      EncodingFactory.createEncoding("DOS862");
      String string1 = "";
      String string2 = "Cp864";
      // Undeclared exception!
      EncodingFactory.getEncoding("DOS862", "Cp864");
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.9288392596635145
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = "";
      EncodingFactory.getEncoding("");
      char[] charArray0 = new char[1];
      EncodingFactory.getIscEncoding("ISO8859_4");
      EncodingFactory.createEncoding("ISO8859_4");
      EncodingFactory.getEncoding("yP~HADmS5e~n A", charArray0);
      EncodingFactory.getIscEncoding("Cp864");
      EncodingFactory encodingFactory0 = new EncodingFactory();
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
  //Test case number: 16
  /*Coverage entropy=1.3157588998898628
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EncodingFactory.getCharacterSetSize(0);
      EncodingFactory.createEncoding("Cp1253");
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getEncoding("Cp1252");
      EncodingFactory.getJavaEncodingForAlias("isc_encoding_size.properties");
      String string0 = ");D>";
      EncodingFactory.getEncoding((String) null, encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getEncoding("ISO8859_8");
      EncodingFactory.getIscEncoding("HY009");
      // Undeclared exception!
      EncodingFactory.getEncoding("Cp1253", "HY105");
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.4352951763943773
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EncodingFactory.getEncoding((String) null);
      EncodingFactory.getIscEncodingSize("ISO8859_4");
      EncodingFactory.getJavaEncoding("`uNtE.;cr@]T");
      EncodingFactory.getIscEncoding((String) null);
      EncodingFactory encodingFactory0 = new EncodingFactory();
      char[] charArray0 = new char[1];
      charArray0[0] = 'e';
      EncodingFactory.getEncoding("DOS861", charArray0);
      EncodingFactory.getJavaEncoding("HY000");
      EncodingFactory.getJavaEncodingForAlias((String) null);
      // Undeclared exception!
      try { 
        EncodingFactory.createEncoding((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.5359610497090694
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = "Cp1257";
      EncodingFactory.getEncoding("Cp1257");
      char[] charArray0 = new char[1];
      charArray0[0] = '#';
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
  //Test case number: 19
  /*Coverage entropy=0.3805062184775959
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = "Cp860";
      EncodingFactory.getEncoding("Cp860");
      char[] charArray0 = new char[1];
      charArray0[0] = '#';
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp860", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.8346096344580884
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      EncodingFactory.createEncoding("");
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getJavaEncoding("5F@esu_bejccXB|7S");
      EncodingFactory.getJavaEncoding("");
      EncodingFactory.getIscEncodingSize("isc_encodings.properties");
      EncodingFactory.getIscEncoding("isc_encodings.properties");
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp1253", (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.5403058252265167
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EncodingFactory.getEncoding("QAyV$Fj");
      EncodingFactory.getIscEncodingSize("QAyV$Fj");
      String string0 = "NI5n3P";
      EncodingFactory.getIscEncodingSize("NI5n3P");
      String string1 = "@\\_ITN\\q";
      EncodingFactory.createEncoding("@_ITNq");
      char[] charArray0 = new char[1];
      String string2 = null;
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
  //Test case number: 22
  /*Coverage entropy=0.44624376141549005
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = "";
      EncodingFactory.getEncoding("");
      char[] charArray0 = new char[1];
      charArray0[0] = '#';
      EncodingFactory.createEncoding("Cp869");
      String string1 = null;
      String string2 = "";
      // Undeclared exception!
      EncodingFactory.getEncoding("Cp1250", "1h");
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.0116009116784799
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = "QAyV$Fj";
      EncodingFactory.getEncoding("QAyV$Fj");
      EncodingFactory.getIscEncodingSize("QAyV$Fj");
      EncodingFactory.getIscEncodingSize("QAyV$Fj");
      EncodingFactory.getIscEncodingSize("QAyV$Fj");
      EncodingFactory.createEncoding("Cp852");
      char[] charArray0 = new char[9];
      charArray0[0] = 'u';
      charArray0[1] = '1';
      charArray0[2] = '1';
      charArray0[3] = '1';
      charArray0[4] = 'u';
      charArray0[5] = 'u';
      charArray0[6] = 'u';
      charArray0[7] = '1';
      charArray0[8] = 'u';
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
  //Test case number: 24
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = "Cp775";
      char[] charArray0 = new char[2];
      charArray0[0] = '@';
      charArray0[1] = 't';
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
  //Test case number: 25
  /*Coverage entropy=0.9159489015425819
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      EncodingFactory.getEncoding("");
      char[] charArray0 = new char[1];
      char char0 = '#';
      charArray0[0] = '#';
      EncodingFactory.getEncoding("", charArray0);
      EncodingFactory.getJavaEncodingForAlias("M7u=(sV)eI|!");
      EncodingFactory.getEncoding("ID,Db%|Ox", charArray0);
      EncodingFactory.getEncoding((String) null);
      EncodingFactory.getIscEncoding((String) null);
      EncodingFactory.getEncoding((String) null, charArray0);
      EncodingFactory.getJavaEncoding("Cp860");
      EncodingFactory.getJavaEncoding((String) null);
      String string0 = "F_}0U_A";
      EncodingFactory.getEncoding("F_}0U_A", charArray0);
      String string1 = "ISO8859_2";
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
  //Test case number: 26
  /*Coverage entropy=1.4561377669806799
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[0] = 'Y';
      charArray0[1] = '\"';
      EncodingFactory.getEncoding("W7;~;XDCk#", charArray0);
      EncodingFactory.getCharacterSetSize(52);
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.createEncoding("Cp863");
      EncodingFactory.getIscEncoding("");
      EncodingFactory.getEncoding((String) null, (String) null);
      EncodingFactory.getEncoding("isc_encoding_size.properties");
      EncodingFactory.createEncoding(">(}PnEHP``g");
      EncodingFactory.getIscEncoding("");
      EncodingFactory.getIscEncodingSize("isc_encodings.properties");
      EncodingFactory.createEncoding(">(}PnEHP``g");
      // Undeclared exception!
      EncodingFactory.getEncoding((String) null, "");
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.0790774247673154
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      EncodingFactory.getIscEncoding("");
      EncodingFactory.getIscEncodingSize((String) null);
      EncodingFactory.getJavaEncoding("isc_encoding_size.properties");
      char[] charArray0 = new char[2];
      charArray0[0] = '-';
      charArray0[1] = 'p';
      EncodingFactory.getEncoding("", charArray0);
      EncodingFactory.getJavaEncoding("Cp858");
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
  //Test case number: 28
  /*Coverage entropy=0.8796248691414936
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      EncodingFactory.createEncoding("Cp1253");
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getEncoding("Cp1252");
      EncodingFactory.getJavaEncodingForAlias("isc_encoding_size.properties");
      EncodingFactory.getJavaEncoding("Cp1252");
      EncodingFactory.getEncoding((String) null, encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getEncoding("ISO8859_8");
      EncodingFactory.getIscEncoding("HY009");
      EncodingFactory.getEncoding("", encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getJavaEncodingForAlias("Cp858");
      Encoding encoding0 = EncodingFactory.getEncoding("ISO8859_13", encodingFactory0.DEFAULT_MAPPING);
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=0.8207129033378099
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      EncodingFactory.createEncoding("Cp1253");
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getEncoding("isc_encoding_size.properties");
      EncodingFactory.getJavaEncodingForAlias("isc_encoding_size.properties");
      EncodingFactory.getEncoding((String) null, encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getEncoding("ISO8859_8");
      EncodingFactory.getIscEncoding("Cp1253");
      EncodingFactory.getEncoding("isc_encodings.properties", encodingFactory0.DEFAULT_MAPPING);
      Encoding encoding0 = EncodingFactory.getEncoding("ISO8859_8", encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getEncoding("isc_encodings.properties");
      Encoding encoding1 = EncodingFactory.getEncoding("ISO8859_8");
      assertFalse(encoding1.equals((Object)encoding0));
  }

  /**
  //Test case number: 30
  /*Coverage entropy=0.5646639521076031
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      String string0 = "iXHU9DY4";
      EncodingFactory.getIscEncoding("iXHU9DY4");
      EncodingFactory.getIscEncodingSize((String) null);
      EncodingFactory.getIscEncoding((String) null);
      char[] charArray0 = new char[8];
      charArray0[0] = ')';
      charArray0[1] = '3';
      charArray0[2] = '4';
      charArray0[3] = 'P';
      charArray0[4] = 'P';
      charArray0[5] = '}';
      charArray0[6] = 'U';
      charArray0[7] = 's';
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_7", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 31
  /*Coverage entropy=0.5332555753496773
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      char[] charArray0 = new char[1];
      EncodingFactory.getIscEncoding("ISO8859_4");
      EncodingFactory.createEncoding("ISO8859_4");
      EncodingFactory.getEncoding("Incorrect mapping format. Key should consist only of 4 characters, but ", charArray0);
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
  //Test case number: 32
  /*Coverage entropy=0.4643566259363562
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      EncodingFactory.getJavaEncodingForAlias("Cp737");
      EncodingFactory.getJavaEncodingForAlias("Cp737");
      EncodingFactory.getJavaEncodingForAlias("Cp737");
      char[] charArray0 = new char[2];
      charArray0[0] = 'U';
      charArray0[1] = 'c';
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
  //Test case number: 33
  /*Coverage entropy=1.4735023850806486
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      EncodingFactory.getEncoding("Cp1257");
      char[] charArray0 = new char[1];
      String string0 = "Cp1252";
      EncodingFactory.getEncoding("Cp1252");
      EncodingFactory.getJavaEncodingForAlias("Cp1252");
      String string1 = null;
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp1252", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 34
  /*Coverage entropy=0.815722890725723
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      EncodingFactory.createEncoding("ISO8859_3");
      EncodingFactory.getIscEncoding("t:_,,k<]X=Io2:@{");
      EncodingFactory.createEncoding("DOS862");
      EncodingFactory.getJavaEncoding("DOS862");
      EncodingFactory.getIscEncoding("t:_,,k<]X=Io2:@{");
      char[] charArray0 = new char[2];
      charArray0[0] = '#';
      charArray0[1] = '#';
      EncodingFactory.getEncoding("t:_,,k<]X=Io2:@{", charArray0);
      EncodingFactory.getIscEncoding("DOS862");
      EncodingFactory.getEncoding(")l,}", charArray0);
      EncodingFactory.getJavaEncodingForAlias("rf%eIg<q}");
      EncodingFactory.getEncoding("rf%eIg<q}", charArray0);
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
  //Test case number: 35
  /*Coverage entropy=1.293929828102627
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      EncodingFactory.getCharacterSetSize(52);
      EncodingFactory encodingFactory0 = new EncodingFactory();
      Encoding encoding0 = EncodingFactory.createEncoding("Cp863");
      EncodingFactory.getIscEncoding("");
      EncodingFactory.getEncoding((String) null, (String) null);
      EncodingFactory.getEncoding("isc_encoding_size.properties");
      Encoding encoding1 = EncodingFactory.getEncoding("Cp863", encodingFactory0.DEFAULT_MAPPING);
      assertFalse(encoding1.equals((Object)encoding0));
  }

  /**
  //Test case number: 36
  /*Coverage entropy=1.390682627812953
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      EncodingFactory.getJavaEncodingForAlias("Cp737");
      EncodingFactory.getJavaEncodingForAlias("Cp737");
      String string0 = EncodingFactory.getJavaEncodingForAlias("Cp737");
      assertNotNull(string0);
      assertEquals("Cp737", string0);
      
      String string1 = EncodingFactory.getJavaEncoding("Cp737");
      assertNull(string1);
      
      EncodingFactory.createEncoding("Cp737");
      EncodingFactory.getIscEncoding("Cp737");
      int int0 = EncodingFactory.getIscEncodingSize("iXHU9DY4");
      assertEquals(1, int0);
      
      EncodingFactory.createEncoding("-#Xl0^hR");
      String string2 = EncodingFactory.getIscEncoding("Cp737");
      assertEquals("DOS737", string2);
      assertNotNull(string2);
  }

  /**
  //Test case number: 37
  /*Coverage entropy=1.1428852304537855
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      EncodingFactory.createEncoding("Cp1253");
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getEncoding("Cp1252");
      EncodingFactory.getJavaEncodingForAlias("isc_encoding_size.properties");
      EncodingFactory.getJavaEncoding("Cp1252");
      EncodingFactory.getEncoding((String) null, encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getEncoding("ISO8859_8");
      EncodingFactory.getJavaEncoding((String) null);
      EncodingFactory.getEncoding("Cp858", encodingFactory0.DEFAULT_MAPPING);
      String string0 = EncodingFactory.getJavaEncoding("org.firebirdsql.encodings.Encoding_ISO8859_6");
      assertNull(string0);
  }

  /**
  //Test case number: 38
  /*Coverage entropy=1.2904336535288885
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      EncodingFactory.getEncoding("");
      char[] charArray0 = new char[1];
      charArray0[0] = '#';
      EncodingFactory.getCharacterSetSize(4533);
      EncodingFactory.getJavaEncoding("");
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
  //Test case number: 39
  /*Coverage entropy=0.7457401705864138
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      EncodingFactory.getIscEncodingSize((String) null);
      char[] charArray0 = new char[0];
      String string0 = "Cp862";
      EncodingFactory.getJavaEncodingForAlias("Cp862");
      EncodingFactory.getJavaEncodingForAlias("ISO8859_9");
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
  //Test case number: 40
  /*Coverage entropy=1.0820648982566796
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      EncodingFactory.createEncoding("ISO8859_3");
      EncodingFactory.getIscEncoding("ISO8859_13");
      Encoding encoding0 = EncodingFactory.createEncoding("ISO8859_13");
      char[] charArray0 = new char[8];
      charArray0[0] = 'N';
      charArray0[1] = '#';
      charArray0[2] = '#';
      charArray0[3] = '#';
      charArray0[4] = '+';
      charArray0[5] = '#';
      charArray0[6] = '#';
      charArray0[7] = '#';
      EncodingFactory.getEncoding("~xD@Y@lFf\"i6FYf<", charArray0);
      EncodingFactory.getIscEncoding("ISO8859_13");
      EncodingFactory.getEncoding("t:_,,^k<]X=Io2:@{", charArray0);
      EncodingFactory.getJavaEncoding("ISO8859_3");
      EncodingFactory.getJavaEncodingForAlias("");
      EncodingFactory.createEncoding("org.firebirdsql.encodings.Encoding_Cp1252");
      char[] charArray1 = new char[3];
      charArray1[0] = 'u';
      charArray1[1] = 'N';
      charArray1[2] = 'N';
      EncodingFactory.getEncoding("Incorrect mapping format. Key should consist only of 4 characters, but ", charArray1);
      EncodingFactory.getJavaEncoding("ISO8859_13");
      Encoding encoding1 = EncodingFactory.getEncoding("ISO8859_13");
      assertFalse(encoding1.equals((Object)encoding0));
  }

  /**
  //Test case number: 41
  /*Coverage entropy=1.1730233531432874
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getEncoding("isc_encodings.properties");
      EncodingFactory.getJavaEncodingForAlias("isc_encoding_size.properties");
      EncodingFactory.getJavaEncoding("08006");
      EncodingFactory.getEncoding((String) null, encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getEncoding((String) null);
      EncodingFactory.getIscEncoding((String) null);
      EncodingFactory.getEncoding("HSULIEFETmx&#J", encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getEncoding("HY009", encodingFactory0.DEFAULT_MAPPING);
      String string0 = EncodingFactory.ISC_ENCODINGS_RESOURCE;
      Encoding encoding0 = EncodingFactory.createEncoding("Cp857");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 42
  /*Coverage entropy=1.0371413557324087
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      EncodingFactory.getEncoding("");
      char[] charArray0 = new char[1];
      charArray0[0] = '#';
      Encoding encoding0 = EncodingFactory.getEncoding("", charArray0);
      EncodingFactory.getJavaEncoding("org.firebirdsql.encodings.Encoding_Cp1250");
      EncodingFactory.getEncoding("Cp775");
      EncodingFactory.getJavaEncodingForAlias("org.firebirdsql.encodings.Encoding_Cp1250");
      EncodingFactory.getJavaEncodingForAlias((String) null);
      Encoding encoding1 = EncodingFactory.getEncoding("r@n", charArray0);
      assertFalse(encoding1.equals((Object)encoding0));
  }

  /**
  //Test case number: 43
  /*Coverage entropy=1.1919410398539314
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      EncodingFactory.getEncoding("QAyV$Fj");
      EncodingFactory.getIscEncoding("QAyV$Fj");
      EncodingFactory.getIscEncodingSize("UNICODE_FSS");
      EncodingFactory.getJavaEncoding((String) null);
      char[] charArray0 = new char[8];
      charArray0[0] = '.';
      charArray0[1] = '.';
      charArray0[2] = 't';
      EncodingFactory.getEncoding("UNICODE_FSS", charArray0);
      EncodingFactory.getJavaEncoding("Cp864");
      EncodingFactory.createEncoding("Cp864");
      EncodingFactory.getIscEncoding("org.firebirdsql.encodings.Encoding_Cp1251");
      EncodingFactory.getJavaEncodingForAlias((String) null);
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp866", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 44
  /*Coverage entropy=1.057656617035097
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      EncodingFactory.getJavaEncodingForAlias("Cp862");
      String string0 = EncodingFactory.ISC_ENCODING_SIZE_RESOURCE;
      char[] charArray0 = new char[9];
      charArray0[0] = 'a';
      charArray0[1] = 'U';
      charArray0[2] = 'U';
      charArray0[3] = 'c';
      charArray0[4] = 'c';
      charArray0[5] = 'U';
      charArray0[6] = 'U';
      charArray0[7] = ',';
      charArray0[8] = 'x';
      Encoding encoding0 = EncodingFactory.getEncoding("3p~~fH%^W?ao\"Bxd", charArray0);
      EncodingFactory.getJavaEncoding("Cp860");
      EncodingFactory.getEncoding("Cp862");
      Encoding encoding1 = EncodingFactory.getEncoding("Sa-zD6r[Xq>b+(V", charArray0);
      assertFalse(encoding1.equals((Object)encoding0));
  }

  /**
  //Test case number: 45
  /*Coverage entropy=0.9638746463443179
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      EncodingFactory.createEncoding("Cp1253");
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getEncoding("isc_encodings.properties");
      EncodingFactory.getJavaEncodingForAlias("(|");
      EncodingFactory.getJavaEncoding("ISO8859_1");
      EncodingFactory.getEncoding("isc_encoding_size.properties", encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getEncoding("NONE");
      EncodingFactory.getIscEncoding("WIN1256");
      EncodingFactory.getEncoding("", encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getEncoding("R", encodingFactory0.DEFAULT_MAPPING);
      String string0 = EncodingFactory.ISC_ENCODINGS_RESOURCE;
      // Undeclared exception!
      try { 
        EncodingFactory.createEncoding((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 46
  /*Coverage entropy=1.6726254461503203
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getEncoding("isc_encodings.properties");
      EncodingFactory.getJavaEncodingForAlias("isc_encoding_size.properties");
      EncodingFactory.getJavaEncoding("08006");
      EncodingFactory.getEncoding((String) null, encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getEncoding((String) null);
      EncodingFactory.getIscEncoding("isc_encoding_size.properties");
      EncodingFactory.getEncoding("isc_encodings.properties", encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getJavaEncodingForAlias((String) null);
      EncodingFactory.getEncoding("W<uB*Jj", encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getEncoding("Cp1256", encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getEncoding("W<uB*Jj", encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getJavaEncodingForAlias("lX");
      EncodingFactory.getJavaEncodingForAlias((String) null);
      // Undeclared exception!
      EncodingFactory.getTranslator("isc_encodings.properties");
  }

  /**
  //Test case number: 47
  /*Coverage entropy=1.1728126724264318
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getEncoding("_]z^|^z");
      EncodingFactory.getEncoding("_]z^|^z", encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getJavaEncoding("JfOQoI6FngQtZ0zFM{");
      EncodingFactory.createEncoding("ISO8859_1");
      EncodingFactory.getIscEncoding("WIN1257");
      // Undeclared exception!
      EncodingFactory.getTranslator("WIN1257");
  }

  /**
  //Test case number: 48
  /*Coverage entropy=0.9397904419812783
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      EncodingFactory.getJavaEncodingForAlias("Cp737");
      EncodingFactory.getJavaEncodingForAlias("Cp737");
      char[] charArray0 = new char[1];
      charArray0[0] = '-';
      EncodingFactory.getEncoding("ASCII", charArray0);
      EncodingFactory.getJavaEncoding("Cp737");
      EncodingFactory.createEncoding("Cp1254");
      EncodingFactory.getIscEncoding("ASCII");
      EncodingFactory.getJavaEncodingForAlias("Cp737");
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
}