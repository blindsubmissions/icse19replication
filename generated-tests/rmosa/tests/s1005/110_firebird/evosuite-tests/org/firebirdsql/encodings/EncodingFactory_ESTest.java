/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 07:04:51 GMT 2018
 */

package org.firebirdsql.encodings;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.firebirdsql.encodings.CharacterTranslator;
import org.firebirdsql.encodings.Encoding;
import org.firebirdsql.encodings.EncodingFactory;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EncodingFactory_ESTest extends EncodingFactory_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.24267348118901844
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EncodingFactory.getEncoding("ISO8859_4");
      String string0 = "jUO@g>hiVx";
      EncodingFactory.createEncoding("jUO@g>hiVx");
      EncodingFactory.createEncoding("ISO8859_4");
      // Undeclared exception!
      EncodingFactory.getTranslator((String) null);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.35569801063169865
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[0] = 'H';
      charArray0[1] = 'Y';
      EncodingFactory.getEncoding("qD%}x", charArray0);
      EncodingFactory.getJavaEncodingForAlias("qD%}x");
      String string0 = EncodingFactory.getJavaEncodingForAlias((String) null);
      assertNull(string0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.3629234715124521
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EncodingFactory.createEncoding("g");
      String string0 = EncodingFactory.getJavaEncoding("g");
      assertNull(string0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.4728646678699161
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EncodingFactory.createEncoding("+4(UcRfmDa");
      EncodingFactory.getJavaEncodingForAlias("ASCII");
      String string0 = EncodingFactory.getJavaEncoding("+4(UcRfmDa");
      assertNull(string0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      EncodingFactory.getEncoding("bFHl1-J-@aA:IpfS$+", "bFHl1-J-@aA:IpfS$+");
  }

  /**
  //Test case number: 6
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int int0 = EncodingFactory.getCharacterSetSize('q');
      assertEquals(1, int0);
      
      int int1 = EncodingFactory.getCharacterSetSize(1);
      assertTrue(int1 == int0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp1250");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = EncodingFactory.getJavaEncoding((String) null);
      assertNull(string0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = EncodingFactory.getIscEncoding((String) null);
      assertNull(string0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp863");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      char[] charArray0 = new char[2];
      String string0 = null;
      EncodingFactory.getEncoding("Cp1256", (String) null);
      // Undeclared exception!
      try { 
        EncodingFactory.createEncoding((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int int0 = EncodingFactory.getIscEncodingSize((String) null);
      assertEquals(1, int0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EncodingFactory.getIscEncoding("ISO8859_9");
      String string0 = EncodingFactory.getIscEncoding("ISO8859_9");
      assertNotNull(string0);
      assertEquals("ISO8859_9", string0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.4728646678699161
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EncodingFactory.getEncoding((String) null);
      String string0 = EncodingFactory.getJavaEncodingForAlias("Cp860");
      assertEquals("Cp860", string0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.3629234715124521
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("UTF8");
      EncodingFactory.getJavaEncodingForAlias("UTF8");
      EncodingFactory.getJavaEncodingForAlias("UTF8");
      Encoding encoding1 = EncodingFactory.createEncoding("UTF-8");
      assertFalse(encoding1.equals((Object)encoding0));
  }

  /**
  //Test case number: 16
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      char[] charArray0 = new char[0];
      Encoding encoding0 = EncodingFactory.getEncoding((String) null, charArray0);
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = "ISO8859_2";
      char[] charArray0 = new char[1];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_2", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("ISO8859_2");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp437");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp1252");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = "Cp865";
      char[] charArray0 = new char[1];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp865", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      EncodingFactory.createEncoding("Cp865");
      // Undeclared exception!
      EncodingFactory.getTranslator("Cp1256");
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      EncodingFactory.getIscEncodingSize("");
      int int0 = EncodingFactory.getIscEncodingSize("");
      assertEquals(1, int0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      char[] charArray0 = new char[1];
      EncodingFactory.getEncoding("NONE", charArray0);
      String string0 = EncodingFactory.defaultEncoding;
      String string1 = EncodingFactory.getJavaEncodingForAlias("NONE");
      assertNull(string1);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      char[] charArray0 = new char[1];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp1252", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 26
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_3", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 27
  /*Coverage entropy=0.3629234715124521
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      EncodingFactory.createEncoding("UTF8");
      String string0 = EncodingFactory.getJavaEncoding("UTF8");
      assertNotNull(string0);
      assertEquals("UTF-8", string0);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("ISO8859_8");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String string0 = "Cp1253";
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
  //Test case number: 30
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      String string0 = "Cp1257";
      char[] charArray0 = new char[2];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp1257", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 31
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      char[] charArray0 = new char[4];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp862", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      int int0 = EncodingFactory.getIscEncodingSize("ISO8859_6");
      assertEquals(1, int0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp861");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 34
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("ISO8859_9");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 35
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp1253");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 36
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      String string0 = "Cp858";
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp858", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 37
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      char[] charArray0 = new char[1];
      String string0 = "Cp861";
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp861", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 38
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      String string0 = "ISO8859_13";
      EncodingFactory.createEncoding("ISO8859_13");
      CharacterTranslator characterTranslator0 = new CharacterTranslator();
  }

  /**
  //Test case number: 39
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      char[] charArray0 = new char[2];
      String string0 = "ISO8859_7";
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_7", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 40
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      String string0 = "Cp863";
      char[] charArray0 = new char[20];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp863", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 20
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 41
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_5", (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 42
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp862");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 43
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = '<';
      EncodingFactory.getEncoding("big5", charArray0);
      EncodingFactory.getJavaEncodingForAlias("big5");
      EncodingFactory.getEncoding("big5", charArray0);
      EncodingFactory.getJavaEncodingForAlias("Big5");
      String string0 = EncodingFactory.getJavaEncodingForAlias("big5");
      assertNotNull(string0);
      assertEquals("Big5", string0);
  }

  /**
  //Test case number: 44
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      String string0 = "Cp737";
      char[] charArray0 = new char[6];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp737", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 45
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      String string0 = "Cp850";
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp850", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 46
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp869");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 47
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp1257");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 48
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      String string0 = "Cp864";
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp864", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 49
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_4", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 50
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp864");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 51
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      String string0 = "ISO8859_1";
      char[] charArray0 = new char[1];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_1", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 52
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      EncodingFactory.createEncoding("Cp1251");
      String string0 = EncodingFactory.ISC_ENCODINGS_RESOURCE;
      assertEquals("isc_encodings.properties", string0);
  }

  /**
  //Test case number: 53
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      char[] charArray0 = new char[1];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp1255", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 54
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp1254");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 55
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp775");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 56
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      char[] charArray0 = new char[20];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp869", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 20
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 57
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp850");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 58
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      char[] charArray0 = new char[1];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_8", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 59
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      char[] charArray0 = new char[2];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_6", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 60
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      String string0 = "Cp857";
      char[] charArray0 = new char[1];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp857", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 61
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("ISO8859_5");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 62
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      String string0 = "ISO8859_13";
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_13", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 63
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      char[] charArray0 = new char[1];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp1250", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 64
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      EncodingFactory.createEncoding("ISO8859_1");
      String string0 = EncodingFactory.ISC_ENCODING_SIZE_RESOURCE;
      assertEquals("isc_encoding_size.properties", string0);
  }

  /**
  //Test case number: 65
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp860");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 66
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp852");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 67
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp1255");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 68
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp737");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 69
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      String string0 = "Cp1251";
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp1251", (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 70
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("NONE");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 71
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      char[] charArray0 = new char[3];
      charArray0[2] = '[';
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp852", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 72
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp857");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 73
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      char[] charArray0 = new char[1];
      String string0 = "Cp437";
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp437", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 74
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      char[] charArray0 = new char[3];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp1254", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 75
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      char[] charArray0 = new char[15];
      String string0 = "ISO8859_9";
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_9", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 15
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 76
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      char[] charArray0 = new char[3];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp1256", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 77
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("ISO8859_7");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 78
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp860", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 79
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      String string0 = "Cp863";
      String string1 = "Cp775";
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp775", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 80
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp858");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 81
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("ISO8859_6");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 82
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      String string0 = "Cp866";
      char[] charArray0 = new char[1];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp866", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 83
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("ISO8859_3");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 84
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp866");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 85
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      EncodingFactory.getIscEncoding("big5");
      EncodingFactory.createEncoding("big5");
      CharacterTranslator characterTranslator0 = new CharacterTranslator();
  }
}