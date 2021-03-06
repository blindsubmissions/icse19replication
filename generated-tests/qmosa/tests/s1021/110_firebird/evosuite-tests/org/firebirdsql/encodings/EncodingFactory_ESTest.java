/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 14:14:29 GMT 2018
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
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = "";
      EncodingFactory.getJavaEncoding("");
      char[] charArray0 = new char[0];
      EncodingFactory.getEncoding("", charArray0);
      EncodingFactory.getEncoding((String) null, (String) null);
      EncodingFactory.getIscEncoding((String) null);
      // Undeclared exception!
      EncodingFactory.getTranslator((String) null);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EncodingFactory.getJavaEncoding("2v5_");
      String string0 = "gmC|+&?O9>P_]HAvU";
      EncodingFactory.getIscEncoding("gmC|+&?O9>P_]HAvU");
      EncodingFactory.getIscEncodingSize((String) null);
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getEncoding("cO", encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getJavaEncodingForAlias((String) null);
      // Undeclared exception!
      try { 
        EncodingFactory.createEncoding((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.974563818434652
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = "Cp863";
      EncodingFactory.getJavaEncodingForAlias("Cp863");
      EncodingFactory.getEncoding("Cp863");
      EncodingFactory.getJavaEncodingForAlias("AS&YCY.nk6Y\"");
      EncodingFactory.getJavaEncodingForAlias((String) null);
      EncodingFactory.getJavaEncoding("Cp863");
      char[] charArray0 = new char[2];
      charArray0[0] = 'J';
      charArray0[1] = ':';
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
  //Test case number: 3
  /*Coverage entropy=1.6749900127837865
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getIscEncoding("fc(I[I9hoPRX]_^");
      EncodingFactory.getIscEncoding("^F8Jy6!mZ+C^TNp])S");
      String string0 = EncodingFactory.getJavaEncodingForAlias("3ZC#{");
      assertNull(string0);
      
      EncodingFactory.getIscEncodingSize("isc_encoding_size.properties");
      int int0 = EncodingFactory.getIscEncodingSize("isc_encodings.properties");
      assertEquals(1, int0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.2718685126965625
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = null;
      EncodingFactory.getEncoding((String) null, (String) null);
      String string1 = null;
      EncodingFactory.getJavaEncodingForAlias((String) null);
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getEncoding((String) null, encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getJavaEncodingForAlias("Nmt(OwLo)d%]b0");
      EncodingFactory.getIscEncoding("7?cc");
      EncodingFactory.getJavaEncodingForAlias("");
      String string2 = "";
      EncodingFactory.getJavaEncodingForAlias("");
      // Undeclared exception!
      EncodingFactory.getTranslator("");
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.2533399948605684
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EncodingFactory.getEncoding(":Yz?i[\">yqOI");
      String string0 = "ISO8859_5";
      EncodingFactory.getEncoding("ISO8859_5");
      EncodingFactory.createEncoding("ISO8859_5");
      EncodingFactory.createEncoding("ISO8859_5");
      EncodingFactory.getEncoding("");
      EncodingFactory.getJavaEncoding(":Yz?i[\">yqOI");
      EncodingFactory.getCharacterSetSize(871);
      EncodingFactory.getIscEncoding("nOCI\"IH0O@+");
      String string1 = "Cp850";
      EncodingFactory.getEncoding("Cp850");
      char[] charArray0 = new char[4];
      charArray0[0] = '*';
      charArray0[1] = ')';
      charArray0[2] = 'K';
      charArray0[3] = '2';
      EncodingFactory.getEncoding("", charArray0);
      // Undeclared exception!
      EncodingFactory.getTranslator("");
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.3039835835806424
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EncodingFactory.getIscEncodingSize("");
      EncodingFactory.getIscEncoding("Incorrect mapping format. All properties should start with \"db.\", but ");
      EncodingFactory.getIscEncoding("Incorrect mapping format. All properties should start with \"db.\", but ");
      EncodingFactory.getIscEncoding((String) null);
      EncodingFactory.getJavaEncodingForAlias((String) null);
      EncodingFactory.getIscEncoding((String) null);
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getEncoding("25000");
      EncodingFactory.getJavaEncoding((String) null);
      EncodingFactory.getEncoding("");
      EncodingFactory.createEncoding("!6+q~S");
      EncodingFactory.getIscEncodingSize((String) null);
      // Undeclared exception!
      try { 
        EncodingFactory.createEncoding((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.9722469794234416
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EncodingFactory.getCharacterSetSize(44);
      String string0 = "{Zp^FX!";
      EncodingFactory.getIscEncoding("{Zp^FX!");
      EncodingFactory.getEncoding("08S01");
      EncodingFactory.getEncoding((String) null);
      // Undeclared exception!
      EncodingFactory.getEncoding("{Zp^FX!", "08S01");
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.36764947740014225
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = "Cp861";
      EncodingFactory.getEncoding("Cp861");
      char[] charArray0 = new char[9];
      charArray0[0] = '4';
      charArray0[1] = 'C';
      charArray0[2] = '!';
      charArray0[3] = 'A';
      charArray0[4] = '\"';
      charArray0[5] = 'A';
      charArray0[6] = 'n';
      charArray0[7] = 'v';
      charArray0[8] = 'B';
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
  //Test case number: 9
  /*Coverage entropy=1.351783994289646
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = "Cp1255";
      EncodingFactory.createEncoding("Cp1255");
      String string1 = "DCO3xX";
      EncodingFactory.getIscEncodingSize("DCO3xX");
      String string2 = "";
      String string3 = "db.";
      // Undeclared exception!
      EncodingFactory.getEncoding("", "db.");
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.1185957085905367
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EncodingFactory.getCharacterSetSize((-122));
      Encoding encoding0 = EncodingFactory.getEncoding("");
      EncodingFactory.createEncoding(".X.|L[");
      EncodingFactory.getIscEncodingSize("");
      EncodingFactory.getEncoding("ISO8859_4");
      char[] charArray0 = new char[4];
      charArray0[0] = '%';
      charArray0[1] = 'i';
      charArray0[2] = 'o';
      charArray0[3] = '[';
      Encoding encoding1 = EncodingFactory.getEncoding("", charArray0);
      assertFalse(encoding1.equals((Object)encoding0));
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.4663857281012644
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EncodingFactory.getCharacterSetSize((-136));
      EncodingFactory.getEncoding("");
      EncodingFactory.createEncoding(".X.|L[");
      int int0 = EncodingFactory.getIscEncodingSize("");
      EncodingFactory.getEncoding("ISO8859_4");
      char[] charArray0 = new char[4];
      charArray0[0] = '%';
      charArray0[1] = 'i';
      charArray0[2] = 'o';
      charArray0[3] = '[';
      EncodingFactory.getEncoding("", charArray0);
      EncodingFactory.getJavaEncodingForAlias(":3.y{]B_B42~{D");
      int int1 = EncodingFactory.getIscEncodingSize("ISO8859_13");
      assertTrue(int1 == int0);
      assertEquals(1, int1);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.257412347539219
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      char[] charArray0 = new char[6];
      charArray0[0] = ':';
      charArray0[1] = 'J';
      charArray0[2] = ':';
      charArray0[3] = ':';
      charArray0[4] = ':';
      charArray0[5] = 'J';
      EncodingFactory.getEncoding((String) null, charArray0);
      String string0 = "sG^$4 \"FtTOo{7_";
      EncodingFactory.getIscEncodingSize("sG^$4 \"FtTOo{7_");
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getCharacterSetSize(0);
      EncodingFactory.createEncoding("ISO8859_7");
      String string1 = "org.firebirdsql.encodings.Encoding_Cp850";
      EncodingFactory.getJavaEncoding("org.firebirdsql.encodings.Encoding_Cp850");
      // Undeclared exception!
      EncodingFactory.getTranslator("isc_encodings.properties");
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.2820462400528454
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = EncodingFactory.getJavaEncoding("ISO8859_7");
      assertNotNull(string0);
      assertEquals("ISO-8859-7", string0);
      
      String string1 = EncodingFactory.getJavaEncodingForAlias("ISO8859_7");
      assertEquals("ISO-8859-7", string1);
      assertNotNull(string1);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.5082104534598053
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EncodingFactory.getCharacterSetSize((-122));
      EncodingFactory.getIscEncoding("Resource Exception. ");
      EncodingFactory.getIscEncoding("!LC8QjdFz_K");
      EncodingFactory.getJavaEncodingForAlias("!LC8QjdFz_K");
      EncodingFactory.getIscEncoding((String) null);
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getEncoding("DOS865");
      EncodingFactory.getEncoding((String) null);
      EncodingFactory.createEncoding("DOS865");
      EncodingFactory.getIscEncodingSize("Cp869");
      EncodingFactory.createEncoding("DOS862");
      EncodingFactory.getIscEncoding("Cp1251");
      EncodingFactory.getEncoding("Cp862");
      EncodingFactory.createEncoding("Cp862");
      EncodingFactory.getCharacterSetSize((-1454123733));
      EncodingFactory.getEncoding("isc_encoding_size.properties");
      EncodingFactory.getIscEncoding("&[OTs[P3b");
      String string0 = EncodingFactory.getJavaEncoding("Resource Exception. ");
      assertNull(string0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.036840744526001
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EncodingFactory.getJavaEncodingForAlias("Cp863");
      EncodingFactory.getEncoding("Cp863");
      EncodingFactory.getIscEncoding("Resource Exception. ");
      EncodingFactory.getIscEncoding("Resource Exception. ");
      EncodingFactory.getJavaEncodingForAlias("Cp863");
      EncodingFactory.getIscEncoding("Cp863");
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getEncoding("Cp863");
      EncodingFactory.getJavaEncoding("isc_encoding_size.properties");
      EncodingFactory.getEncoding("{43]5V+F$XVQ");
      EncodingFactory.createEncoding("{43]5V+F$XVQ");
      EncodingFactory.getIscEncodingSize((String) null);
      EncodingFactory.createEncoding("26000");
      EncodingFactory.getIscEncoding("Cp1255");
      EncodingFactory.getEncoding("25000");
      EncodingFactory.getEncoding("Cp1255", encodingFactory0.DEFAULT_MAPPING);
      // Undeclared exception!
      EncodingFactory.getEncoding("Cp1255", "m]Ku9gvA8");
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.3237218834840658
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EncodingFactory.getJavaEncodingForAlias("Cp863");
      EncodingFactory.getEncoding("Cp863");
      EncodingFactory.getIscEncoding("Resource Exception. ");
      EncodingFactory.getIscEncoding("Resource Exception. ");
      EncodingFactory.getJavaEncodingForAlias("Cp863");
      EncodingFactory.getIscEncoding("Cp863");
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getEncoding("Cp863");
      EncodingFactory.getJavaEncoding("isc_encoding_size.properties");
      Encoding encoding0 = EncodingFactory.getEncoding("{43]5V+F$XVQ");
      EncodingFactory.createEncoding("{43]5V+F$XVQ");
      EncodingFactory.getIscEncodingSize((String) null);
      EncodingFactory.createEncoding("26000");
      EncodingFactory.getIscEncoding("Cp1255");
      EncodingFactory.getEncoding("25000");
      EncodingFactory.getJavaEncoding("{43]5V+F$XVQ");
      EncodingFactory.getCharacterSetSize((-1970));
      EncodingFactory.getEncoding("Cp864");
      EncodingFactory.getIscEncoding("@&zviT0,TaA8");
      EncodingFactory.getJavaEncodingForAlias("8f['YeDwdLiG;v>|");
      EncodingFactory.createEncoding("Cp1255");
      EncodingFactory.getEncoding("ISO8859_2", encodingFactory0.DEFAULT_MAPPING);
      Encoding encoding1 = EncodingFactory.createEncoding("07001");
      assertFalse(encoding1.equals((Object)encoding0));
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.7288053216112402
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EncodingFactory.getJavaEncodingForAlias("Incorrect mapping format. Mapped value should consist only of single character, but ");
      EncodingFactory.getEncoding("org.firebirdsql.encodings.Enoding_Cp1255");
      EncodingFactory.getJavaEncoding("]iLF?\"o#ryqef");
      char[] charArray0 = new char[7];
      charArray0[0] = 'J';
      charArray0[1] = 'L';
      charArray0[2] = 'J';
      charArray0[3] = 'J';
      charArray0[4] = 'J';
      charArray0[5] = 'J';
      charArray0[6] = 'J';
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_13", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.2130075659799042
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EncodingFactory.getJavaEncoding("Cp1251");
      Encoding encoding0 = EncodingFactory.createEncoding("Cp1251");
      Encoding encoding1 = EncodingFactory.createEncoding("Cp1251");
      assertFalse(encoding1.equals((Object)encoding0));
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.2771133574914559
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      EncodingFactory.getEncoding("Cp861");
      char[] charArray0 = new char[9];
      charArray0[0] = '4';
      charArray0[1] = 'C';
      charArray0[2] = '!';
      charArray0[3] = 'A';
      charArray0[4] = '\"';
      charArray0[5] = 'A';
      charArray0[6] = 'n';
      EncodingFactory.getEncoding("8CPj.7Ns/;T5UP1", charArray0);
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
  //Test case number: 20
  /*Coverage entropy=1.406684801133168
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      EncodingFactory.getCharacterSetSize(0);
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getEncoding("isc_encoding_size.properties");
      EncodingFactory.createEncoding("Cp852");
      EncodingFactory.getIscEncodingSize("N}4MiBNU$v^\"jqfWC");
      EncodingFactory.createEncoding("*`-6FV");
      EncodingFactory.getIscEncoding("*`-6FV");
      EncodingFactory.getEncoding("N}4MiBNU$v^\"jqfWC");
      EncodingFactory.getEncoding("26000", encodingFactory0.DEFAULT_MAPPING);
      // Undeclared exception!
      EncodingFactory.getEncoding("m]Ku9gvA8", "26000");
  }

  /**
  //Test case number: 21
  /*Coverage entropy=2.273965716419247
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      int int0 = (-122);
      EncodingFactory.getCharacterSetSize((-122));
      EncodingFactory.getIscEncoding("Resource Exception. ");
      EncodingFactory.getIscEncoding("!LC8QjdFz_K");
      EncodingFactory.getJavaEncodingForAlias("!LC8QjdFz_K");
      EncodingFactory.getIscEncoding((String) null);
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getEncoding("DOS865");
      EncodingFactory.getEncoding((String) null);
      EncodingFactory.createEncoding("DOS865");
      EncodingFactory.createEncoding("");
      EncodingFactory.getEncoding("NONE", encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getEncoding((String) null, encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getJavaEncoding("Kb=Q_YRr");
      // Undeclared exception!
      EncodingFactory.getTranslator("Cp862");
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.1352276866060664
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      char[] charArray0 = new char[6];
      charArray0[0] = 'J';
      charArray0[3] = 'J';
      charArray0[4] = 'J';
      charArray0[5] = 'J';
      EncodingFactory.getEncoding((String) null, charArray0);
      EncodingFactory.getIscEncodingSize("sG^$4 \"FtTOo{7_");
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getEncoding("isc_encoding_size.properties", charArray0);
      EncodingFactory.getIscEncoding("ISO8859_7");
      EncodingFactory.getIscEncodingSize("ISO8859_8");
      EncodingFactory.createEncoding("Cp863");
      EncodingFactory.getEncoding("hE*[RhP6s2lQP~");
      Encoding encoding0 = EncodingFactory.createEncoding("ISO8859_9");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.815722890725723
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = "Cp863";
      EncodingFactory.getJavaEncodingForAlias("Cp863");
      EncodingFactory.getEncoding("S$lY(!J.bg!+J");
      String string1 = "ISO8859_4";
      EncodingFactory.getJavaEncoding("ISO8859_4");
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_4", (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.8875134902641038
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = "Cy863";
      EncodingFactory.getJavaEncodingForAlias("Cp869");
      String string1 = "ISO8859_13";
      EncodingFactory.getEncoding("ISO8859_13");
      EncodingFactory.getJavaEncoding("Cp869");
      char[] charArray0 = null;
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp869", (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.4985690796770055
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      EncodingFactory.getJavaEncodingForAlias("Cp863");
      EncodingFactory.getEncoding("Cp863");
      EncodingFactory.getIscEncoding("Resource Exception. ");
      EncodingFactory.getIscEncoding("Resource Exception. ");
      EncodingFactory.getJavaEncodingForAlias("Cp863");
      EncodingFactory.getIscEncoding("Cp863");
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getEncoding("Cp863");
      EncodingFactory.getJavaEncoding("isc_encoding_size.properties");
      EncodingFactory.getEncoding("{43]5V+F$XVQ");
      EncodingFactory.createEncoding("{43]5V+F$XVQ");
      EncodingFactory.getIscEncodingSize((String) null);
      EncodingFactory.getEncoding("Cp863", encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getEncoding("]r4TQB4&1KTe*yP");
      EncodingFactory.getEncoding("a:tsVwC!", encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getEncoding("Cp850", encodingFactory0.DEFAULT_MAPPING);
      char[] charArray0 = new char[2];
      charArray0[0] = 'f';
      charArray0[1] = 't';
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
  //Test case number: 26
  /*Coverage entropy=1.2348817763902298
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      EncodingFactory.getJavaEncodingForAlias("Cp863");
      EncodingFactory.getEncoding("Cp863");
      EncodingFactory.getIscEncoding("Resource Exception. ");
      EncodingFactory.getIscEncoding("Resource Exception. ");
      EncodingFactory.getIscEncoding((String) null);
      char[] charArray0 = new char[5];
      charArray0[0] = 'x';
      EncodingFactory.createEncoding("4ML~P0L{zx|");
      EncodingFactory.getIscEncoding("Cp1255");
      EncodingFactory.getEncoding("FsP");
      EncodingFactory.getJavaEncoding("nt.");
      EncodingFactory.getCharacterSetSize(65536);
      EncodingFactory.getEncoding("Resource Exception. ");
      EncodingFactory.getIscEncoding((String) null);
      EncodingFactory.getJavaEncodingForAlias("FsP");
      EncodingFactory.createEncoding("8f['YeDwdLiG;v>|");
      Encoding encoding0 = EncodingFactory.getEncoding("@&zviT0,TaA8", charArray0);
      EncodingFactory.createEncoding("Cp1257");
      Encoding encoding1 = EncodingFactory.getEncoding("DOS860", charArray0);
      assertFalse(encoding1.equals((Object)encoding0));
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.224408651092903
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      char char0 = 'J';
      char[] charArray0 = new char[6];
      charArray0[0] = 'J';
      charArray0[3] = 'J';
      charArray0[4] = 'J';
      charArray0[5] = 'J';
      EncodingFactory.getEncoding((String) null, charArray0);
      EncodingFactory.getIscEncodingSize("G^$4 \"FtTOo{7_");
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getEncoding("isc_encoding_size.properties", charArray0);
      EncodingFactory.getIscEncoding("ISO8859_7");
      EncodingFactory.getEncoding("P.G3q66o?<E2EDK", charArray0);
      EncodingFactory.getEncoding("Cp775");
      // Undeclared exception!
      EncodingFactory.getTranslator("Cp775");
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.1967636021645855
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      EncodingFactory.getJavaEncodingForAlias("Cp863");
      EncodingFactory.getEncoding("Cp863");
      EncodingFactory.getJavaEncoding("Cp863");
      EncodingFactory.getIscEncodingSize((String) null);
      EncodingFactory.createEncoding("HRgb#Fj6PXjecH");
      EncodingFactory.getIscEncoding("Y>75IEy]6LG@*");
      EncodingFactory.getEncoding("ISO8859_3");
      EncodingFactory.createEncoding("ASCII");
      EncodingFactory.getCharacterSetSize((-142612505));
      EncodingFactory.getEncoding("Cp863");
      EncodingFactory.getIscEncoding("vh7");
      EncodingFactory.getJavaEncoding("'a_=e5z2$egF&/x");
      // Undeclared exception!
      EncodingFactory.getTranslator((String) null);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.6179522643873894
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      EncodingFactory.getCharacterSetSize((-122));
      EncodingFactory.getIscEncoding("Resource Exception. ");
      EncodingFactory.getIscEncoding("!LC8QjdFz_K");
      EncodingFactory.getJavaEncodingForAlias("!LC8QjdFz_K");
      EncodingFactory.getIscEncoding((String) null);
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getIscEncodingSize((String) null);
      EncodingFactory encodingFactory1 = new EncodingFactory();
      EncodingFactory.getEncoding("07005", encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getJavaEncodingForAlias("Resource Exception. ");
      EncodingFactory.createEncoding("<])o.LYMO&-}sa");
      EncodingFactory.getEncoding("Cp775", encodingFactory1.DEFAULT_MAPPING);
      EncodingFactory.getEncoding("KSC_5601", encodingFactory1.DEFAULT_MAPPING);
      EncodingFactory.getIscEncoding("Cp1254");
      // Undeclared exception!
      EncodingFactory.getTranslator("ISO8859_13");
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.254708265123138
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      char[] charArray0 = new char[6];
      charArray0[0] = 'J';
      charArray0[3] = 'J';
      charArray0[4] = 'J';
      charArray0[5] = 'J';
      EncodingFactory.getEncoding((String) null, charArray0);
      EncodingFactory.getEncoding("DOS865");
      EncodingFactory.getEncoding("Cp869");
      EncodingFactory.createEncoding("Cp862");
      EncodingFactory.getIscEncodingSize((String) null);
      EncodingFactory.createEncoding("Cp862");
      EncodingFactory.getIscEncoding("DOS865");
      EncodingFactory.getEncoding("v5;X\"");
      EncodingFactory.createEncoding("kmd^x ");
      EncodingFactory.getCharacterSetSize(1);
      EncodingFactory.getEncoding("2QP}o?taO'![@!A28-");
      EncodingFactory.getIscEncoding("Cp864");
      String string0 = EncodingFactory.getJavaEncoding("{MGP");
      assertNull(string0);
  }
}
