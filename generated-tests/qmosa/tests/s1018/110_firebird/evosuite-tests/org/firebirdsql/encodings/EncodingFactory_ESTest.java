/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 13:28:01 GMT 2018
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
      char[] charArray0 = new char[5];
      charArray0[0] = '8';
      charArray0[1] = ' ';
      charArray0[2] = 'B';
      charArray0[3] = 'a';
      charArray0[4] = 'y';
      EncodingFactory.getEncoding("", charArray0);
      EncodingFactory.getIscEncodingSize("");
      EncodingFactory.getIscEncodingSize(",Udw^L8aq]dU*cuX");
      EncodingFactory.getJavaEncoding((String) null);
      EncodingFactory.getJavaEncoding((String) null);
      EncodingFactory.getIscEncodingSize("");
      EncodingFactory.getCharacterSetSize(1);
      EncodingFactory.getJavaEncodingForAlias((String) null);
      EncodingFactory.getJavaEncodingForAlias("Character translation ");
      EncodingFactory.getEncoding("", charArray0);
      String string0 = EncodingFactory.getIscEncoding("");
      assertNull(string0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getJavaEncoding("isc_encodings.properties");
      EncodingFactory.getEncoding((String) null, encodingFactory0.DEFAULT_MAPPING);
      String string0 = EncodingFactory.getJavaEncoding((String) null);
      assertNull(string0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.0253262207700677
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EncodingFactory.getCharacterSetSize(0);
      EncodingFactory.getIscEncoding("Cp737");
      EncodingFactory.getEncoding("");
      EncodingFactory.getJavaEncodingForAlias("$Y,i(?:Ctk)4epq';");
      EncodingFactory.getIscEncoding((String) null);
      EncodingFactory.getJavaEncodingForAlias("HY000");
      EncodingFactory.getJavaEncoding((String) null);
      String string0 = EncodingFactory.getJavaEncodingForAlias("4/aP1}o7<DR 'Cv$1,n");
      assertNull(string0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.1458417525947544
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getJavaEncoding("isc_encodings.properties");
      EncodingFactory.getEncoding("isc_encoding_size.properties", encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getEncoding("isc_encodings.properties", (String) null);
      // Undeclared exception!
      EncodingFactory.getEncoding("isc_encoding_size.properties", "");
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.4105135571148382
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EncodingFactory.getJavaEncoding("-?@\u0004jR7gf8f");
      EncodingFactory.getJavaEncoding((String) null);
      EncodingFactory.getJavaEncoding("0!FdG?/hVN[2xHM##x");
      String string0 = "Cp1250";
      EncodingFactory.getJavaEncoding("Cp1250");
      EncodingFactory.getIscEncodingSize((String) null);
      String string1 = "mrt<V*=qj)V:BEA _V";
      String string2 = "NONE";
      // Undeclared exception!
      EncodingFactory.getEncoding("mrt<V*=qj)V:BEA _V", "NONE");
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.277034259466139
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EncodingFactory.getJavaEncodingForAlias("Cp861");
      // Undeclared exception!
      EncodingFactory.getTranslator("8JNd@;8IG,=\"?");
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.9061547465398496
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EncodingFactory.getJavaEncoding("");
      EncodingFactory.getJavaEncoding("");
      EncodingFactory.getJavaEncoding("org.firebirdsql.jdbc.FBSQLException");
      char[] charArray0 = new char[2];
      charArray0[0] = '.';
      charArray0[1] = 'j';
      EncodingFactory.getEncoding("", charArray0);
      EncodingFactory.getJavaEncoding((String) null);
      EncodingFactory.getCharacterSetSize((-991));
      EncodingFactory.getCharacterSetSize((-3040));
      EncodingFactory.getJavaEncodingForAlias("2Tf");
      // Undeclared exception!
      EncodingFactory.getTranslator((String) null);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = "Cp861";
      char[] charArray0 = new char[9];
      charArray0[0] = 'a';
      charArray0[1] = 'y';
      charArray0[2] = 'M';
      charArray0[3] = 'h';
      charArray0[4] = 'L';
      charArray0[5] = 'y';
      charArray0[6] = 'K';
      charArray0[7] = '(';
      charArray0[8] = 'a';
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
  //Test case number: 8
  /*Coverage entropy=1.01631902368759
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EncodingFactory.getCharacterSetSize(0);
      Encoding encoding0 = EncodingFactory.createEncoding("2]");
      EncodingFactory.createEncoding("2]");
      EncodingFactory.getIscEncoding(" ");
      EncodingFactory.createEncoding("ISO8859_9");
      char[] charArray0 = new char[9];
      charArray0[0] = '8';
      charArray0[1] = 'N';
      charArray0[2] = '5';
      charArray0[3] = '$';
      charArray0[4] = 'S';
      charArray0[5] = 'C';
      charArray0[6] = 'm';
      charArray0[7] = 'W';
      charArray0[8] = ';';
      Encoding encoding1 = EncodingFactory.getEncoding("", charArray0);
      assertFalse(encoding1.equals((Object)encoding0));
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.451512073578371
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EncodingFactory.getEncoding("2NDtWvc?6}y;H");
      EncodingFactory.getJavaEncodingForAlias("2NDtWvc?6}y;H");
      EncodingFactory.getJavaEncoding((String) null);
      EncodingFactory.getIscEncoding((String) null);
      EncodingFactory.getJavaEncodingForAlias((String) null);
      char[] charArray0 = new char[0];
      EncodingFactory.getEncoding((String) null, charArray0);
      EncodingFactory.createEncoding("p6)L(Gnxn=wd");
      EncodingFactory.getEncoding((String) null, (String) null);
      // Undeclared exception!
      EncodingFactory.getTranslator("Acgu7f7Z!ey3]b");
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.5432925412827021
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EncodingFactory.createEncoding("07005");
      EncodingFactory.getIscEncoding("UNICODE_FSS");
      EncodingFactory.createEncoding("08007");
      char[] charArray0 = new char[8];
      charArray0[0] = 'N';
      charArray0[1] = '$';
      charArray0[2] = '$';
      charArray0[3] = 'N';
      charArray0[4] = ';';
      charArray0[5] = 'D';
      charArray0[6] = 'W';
      charArray0[7] = '}';
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
  //Test case number: 11
  /*Coverage entropy=1.241709545718516
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EncodingFactory.getCharacterSetSize(1662);
      EncodingFactory.getIscEncoding("26000");
      char[] charArray0 = new char[8];
      charArray0[0] = '6';
      charArray0[1] = 'K';
      charArray0[2] = '\'';
      charArray0[3] = 'J';
      charArray0[4] = 'b';
      charArray0[5] = 'd';
      charArray0[6] = '}';
      charArray0[7] = 'r';
      EncodingFactory.getEncoding((String) null, charArray0);
      EncodingFactory.createEncoding("26000");
      Encoding encoding0 = EncodingFactory.createEncoding("26000");
      EncodingFactory.getIscEncoding("org.firebirdsql.encodings.Encoding_ISO8859_9");
      EncodingFactory.getJavaEncoding((String) null);
      EncodingFactory.getIscEncoding("Cp775");
      EncodingFactory.createEncoding("ISO8859_4");
      Encoding encoding1 = EncodingFactory.getEncoding("DOS775", (String) null);
      assertFalse(encoding1.equals((Object)encoding0));
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.7677614722893296
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EncodingFactory.createEncoding("07005");
      EncodingFactory.getIscEncoding("UNICODE_FSS");
      EncodingFactory.createEncoding("08007");
      char[] charArray0 = new char[8];
      charArray0[0] = 'N';
      charArray0[1] = '$';
      charArray0[2] = '$';
      charArray0[3] = 'N';
      EncodingFactory.createEncoding("Cp1250");
      EncodingFactory.createEncoding("UNICODE_FSS");
      EncodingFactory.getIscEncoding("N~4#O>&<");
      EncodingFactory.getJavaEncoding("07005");
      EncodingFactory.getIscEncoding("08007");
      EncodingFactory.createEncoding("Cp1251");
      // Undeclared exception!
      EncodingFactory.getEncoding("WFO.1C'", "org.firebirdsql.encodings.Encoding_ISO8859_9");
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.2233215680668157
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EncodingFactory.getCharacterSetSize(0);
      char[] charArray0 = new char[0];
      EncodingFactory.getEncoding("@#M", charArray0);
      EncodingFactory.createEncoding("@#M");
      EncodingFactory.createEncoding("Cp852");
      String string0 = "Cp850";
      EncodingFactory.getIscEncoding("Cp850");
      EncodingFactory.getJavaEncoding("@#M");
      EncodingFactory.getJavaEncoding("DOS850");
      EncodingFactory.createEncoding("DOS850");
      // Undeclared exception!
      EncodingFactory.getEncoding("Oh:M/", "26000");
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.2968943286154
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EncodingFactory.getJavaEncodingForAlias("");
      EncodingFactory.getIscEncodingSize("");
      EncodingFactory.getEncoding("");
      EncodingFactory.getIscEncoding("I4lVY|i{.5D}");
      EncodingFactory.getIscEncoding(",OsR^sz3");
      EncodingFactory.getCharacterSetSize(0);
      char[] charArray0 = new char[6];
      charArray0[0] = ' ';
      EncodingFactory.getEncoding("DOS850", charArray0);
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
  //Test case number: 15
  /*Coverage entropy=1.0494439761475711
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EncodingFactory.getCharacterSetSize(1662);
      EncodingFactory.getIscEncoding("26000");
      char[] charArray0 = new char[8];
      charArray0[0] = '%';
      charArray0[1] = 'K';
      charArray0[2] = '\'';
      charArray0[3] = 'J';
      charArray0[4] = 'b';
      charArray0[5] = 'd';
      charArray0[6] = '}';
      EncodingFactory.createEncoding("Cp850");
      Encoding encoding0 = EncodingFactory.getEncoding("26000", charArray0);
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.245623418760189
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EncodingFactory.createEncoding("&@yMQfGlZnJ7\"");
      EncodingFactory.getJavaEncoding("aKQBdy");
      char[] charArray0 = new char[8];
      charArray0[0] = '`';
      charArray0[1] = 'k';
      charArray0[2] = '7';
      charArray0[3] = '7';
      charArray0[4] = '7';
      charArray0[5] = 'r';
      charArray0[6] = 'r';
      charArray0[7] = 'k';
      EncodingFactory.getEncoding("[[b`a", charArray0);
      String string0 = EncodingFactory.getJavaEncoding("Cp1251");
      assertNull(string0);
      
      EncodingFactory.getJavaEncoding((String) null);
      int int0 = EncodingFactory.getIscEncodingSize("KSC_5601");
      assertEquals(2, int0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.2453906293017585
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EncodingFactory.getJavaEncodingForAlias("");
      EncodingFactory.getIscEncodingSize("");
      EncodingFactory.getEncoding("");
      EncodingFactory.getIscEncoding("I4lVY|i{.5D}");
      EncodingFactory.getIscEncoding(",OsR^sz3");
      EncodingFactory.createEncoding(",OsR^sz3");
      EncodingFactory.getCharacterSetSize(0);
      char[] charArray0 = new char[6];
      charArray0[0] = ' ';
      charArray0[1] = ')';
      charArray0[2] = 'A';
      charArray0[3] = '5';
      charArray0[4] = 'g';
      charArray0[5] = 'M';
      EncodingFactory.getEncoding("DOS864", charArray0);
      EncodingFactory.getEncoding("SJIS_0208", charArray0);
      EncodingFactory.createEncoding("ISO8859_6");
      // Undeclared exception!
      try { 
        EncodingFactory.createEncoding((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.4427833121586762
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EncodingFactory.getCharacterSetSize(1662);
      EncodingFactory.getIscEncoding("26000");
      EncodingFactory.createEncoding("k_CP8&<>a@");
      EncodingFactory.createEncoding("Cp1257");
      EncodingFactory.getIscEncoding(" ");
      EncodingFactory.createEncoding("26000");
      // Undeclared exception!
      EncodingFactory.getEncoding("26000", "k_CP8&<>a@");
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.0346249355573136
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      EncodingFactory.getCharacterSetSize(0);
      EncodingFactory.createEncoding("2]");
      EncodingFactory.createEncoding("2]");
      EncodingFactory.getIscEncoding("2]");
      EncodingFactory.getJavaEncodingForAlias("Cp864");
      EncodingFactory.getEncoding("Nr0}+tc");
      EncodingFactory.getEncoding("Cp864");
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_1", (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.5292482930376912
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      EncodingFactory.getCharacterSetSize(0);
      EncodingFactory.createEncoding("2]");
      EncodingFactory.createEncoding("2]");
      EncodingFactory.getIscEncoding(" ");
      EncodingFactory.getCharacterSetSize(3141);
      char[] charArray0 = new char[6];
      charArray0[0] = ' ';
      charArray0[1] = '\"';
      charArray0[2] = ' ';
      charArray0[3] = ' ';
      charArray0[4] = ' ';
      charArray0[5] = ' ';
      EncodingFactory.getEncoding("ASCII", charArray0);
      String string0 = "Cp864";
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
  //Test case number: 21
  /*Coverage entropy=0.6694323156292942
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EncodingFactory.getJavaEncodingForAlias("");
      EncodingFactory.createEncoding("I4@@E}?BuZR3c&");
      EncodingFactory.createEncoding("I4@@E}?BuZR3c&");
      EncodingFactory.getIscEncoding("DOS866");
      EncodingFactory.createEncoding("ISO8859_5");
      char[] charArray0 = new char[3];
      charArray0[0] = 'S';
      charArray0[1] = 'N';
      charArray0[2] = ';';
      EncodingFactory.getEncoding((String) null, charArray0);
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_5", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.7992374511960495
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      EncodingFactory.getCharacterSetSize(1662);
      EncodingFactory.getIscEncoding("26000");
      EncodingFactory.createEncoding("k_CP8&<>a@");
      EncodingFactory.createEncoding("Cp1257");
      char[] charArray0 = new char[3];
      charArray0[0] = '|';
      charArray0[1] = '';
      charArray0[2] = 'u';
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
  //Test case number: 23
  /*Coverage entropy=1.277034259466139
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      EncodingFactory.getJavaEncodingForAlias("*ysx");
      EncodingFactory.getJavaEncodingForAlias("*ysx");
      char[] charArray0 = new char[1];
      charArray0[0] = '0';
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("cp861", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.156750971308615
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      EncodingFactory.createEncoding("}z1a{Uk%omoG`DLK");
      EncodingFactory.getJavaEncoding("vZ:6mguLIMG");
      EncodingFactory.getJavaEncoding("Cp437");
      EncodingFactory.getJavaEncodingForAlias("}z1a{Uk%omoG`DLK");
      EncodingFactory.getJavaEncodingForAlias("Cp737");
      char[] charArray0 = new char[1];
      charArray0[0] = 'm';
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
  //Test case number: 25
  /*Coverage entropy=1.1779747328373493
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      EncodingFactory.getJavaEncodingForAlias("*ysx");
      EncodingFactory.getJavaEncodingForAlias("*ysx");
      EncodingFactory.createEncoding("Cp775");
      EncodingFactory.getIscEncoding("Cp437");
      EncodingFactory.getCharacterSetSize(791);
      char[] charArray0 = new char[2];
      charArray0[0] = ' ';
      charArray0[1] = '\"';
      EncodingFactory.getEncoding("WMxZNiENL={W`aq|", charArray0);
      EncodingFactory.getEncoding((String) null, charArray0);
      EncodingFactory.getJavaEncoding("*ysx");
      EncodingFactory.createEncoding(" ;L/=<9|:");
      EncodingFactory.createEncoding("Cp775");
      Encoding encoding0 = EncodingFactory.createEncoding("Cp1250");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.7328679513998633
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      EncodingFactory.createEncoding("2]");
      EncodingFactory.createEncoding("2]");
      EncodingFactory.createEncoding("2]");
      EncodingFactory.getJavaEncodingForAlias("NONE");
      EncodingFactory.getEncoding("Cp869");
      EncodingFactory.createEncoding("NONE");
      // Undeclared exception!
      EncodingFactory.getTranslator("org.firebirdsql.encodings.Encoding_Cp1250");
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.2257016597530763
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      EncodingFactory.getCharacterSetSize(0);
      EncodingFactory.createEncoding("2]");
      EncodingFactory.createEncoding("2]");
      EncodingFactory.createEncoding("2]");
      EncodingFactory.getIscEncoding("2]");
      EncodingFactory.getJavaEncodingForAlias("Cp852");
      EncodingFactory.getEncoding("Cp860");
      EncodingFactory.getEncoding("Cp860");
      char[] charArray0 = new char[1];
      charArray0[0] = 'Q';
      EncodingFactory.getEncoding("}{;", charArray0);
      // Undeclared exception!
      EncodingFactory.getTranslator("Cp852");
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.8251864988031563
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      EncodingFactory.getCharacterSetSize(0);
      EncodingFactory.getIscEncoding(":z}0e`/");
      String string0 = "Cp862";
      char[] charArray0 = new char[3];
      charArray0[0] = 'J';
      charArray0[1] = '6';
      charArray0[2] = '\'';
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
  //Test case number: 29
  /*Coverage entropy=0.6694323156292942
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      EncodingFactory.createEncoding("2]");
      EncodingFactory.createEncoding("2]");
      EncodingFactory.getIscEncoding("DOS|864");
      char[] charArray0 = new char[6];
      EncodingFactory.getIscEncodingSize("ISO8859u2");
      Encoding encoding0 = EncodingFactory.createEncoding("ISO8859_7");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=0.6870920273799715
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      EncodingFactory.getCharacterSetSize(0);
      EncodingFactory.createEncoding("2]");
      EncodingFactory.createEncoding("2]");
      EncodingFactory.createEncoding("2]");
      String string0 = "Cp1256";
      char[] charArray0 = new char[9];
      charArray0[0] = 'W';
      charArray0[1] = ';';
      charArray0[2] = 'N';
      charArray0[3] = 'p';
      charArray0[4] = 'N';
      charArray0[5] = ';';
      charArray0[6] = 'N';
      charArray0[7] = ';';
      charArray0[8] = ';';
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
  //Test case number: 31
  /*Coverage entropy=1.2534703185313114
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      String string0 = "P3Gmj";
      EncodingFactory.getIscEncoding("P3Gmj");
      char[] charArray0 = new char[0];
      EncodingFactory.getEncoding("P3Gmj", charArray0);
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getJavaEncodingForAlias("HY092");
      EncodingFactory.getEncoding((String) null);
      EncodingFactory.createEncoding("");
      EncodingFactory.getJavaEncoding((String) null);
      char[] charArray1 = new char[8];
      charArray1[0] = 'h';
      charArray1[1] = 'h';
      charArray1[2] = 't';
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
  //Test case number: 32
  /*Coverage entropy=1.5501328557052076
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      EncodingFactory.getJavaEncodingForAlias("");
      EncodingFactory.getIscEncodingSize("");
      EncodingFactory.getEncoding("");
      EncodingFactory.getIscEncoding((String) null);
      EncodingFactory.getIscEncoding(",OsR^sz3");
      EncodingFactory.getCharacterSetSize(0);
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
  //Test case number: 33
  /*Coverage entropy=0.8253786341406708
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      EncodingFactory.getCharacterSetSize(0);
      EncodingFactory.createEncoding("2]");
      EncodingFactory.createEncoding("2]");
      EncodingFactory.getIscEncoding(" ");
      EncodingFactory.getIscEncoding(" ");
      EncodingFactory.getCharacterSetSize((-1171638326));
      char[] charArray0 = new char[5];
      charArray0[0] = 'R';
      charArray0[1] = 'm';
      charArray0[2] = 'm';
      charArray0[3] = 'O';
      charArray0[4] = '@';
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
  //Test case number: 34
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      char[] charArray0 = new char[4];
      charArray0[0] = '^';
      charArray0[1] = 'W';
      charArray0[2] = 'b';
      charArray0[3] = ';';
      EncodingFactory.getEncoding("DOS863", charArray0);
      String string0 = "DOS850";
      char[] charArray1 = new char[0];
      EncodingFactory.getEncoding("%#h64yHu)7>Z6", charArray1);
      String string1 = "Cp1255";
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
  //Test case number: 35
  /*Coverage entropy=0.8499898040436213
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      EncodingFactory.createEncoding("2]");
      EncodingFactory.createEncoding("2]");
      EncodingFactory.getIscEncoding("DOS864");
      char[] charArray0 = new char[6];
      EncodingFactory.getJavaEncoding("*p");
      EncodingFactory.getIscEncodingSize("DOS864");
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
  //Test case number: 36
  /*Coverage entropy=1.0396203564698523
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      EncodingFactory.getCharacterSetSize(15);
      EncodingFactory.createEncoding("]");
      char[] charArray0 = new char[2];
      charArray0[0] = '?';
      charArray0[1] = 'x';
      EncodingFactory.getEncoding("]", charArray0);
      EncodingFactory.getEncoding("", charArray0);
      EncodingFactory.getJavaEncoding("]");
      EncodingFactory.getIscEncodingSize(":.4$>FYV`V\"^m}m");
      char[] charArray1 = new char[2];
      charArray1[0] = 'x';
      charArray1[1] = '?';
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_2", charArray1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 37
  /*Coverage entropy=0.8046725637738129
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      EncodingFactory.getCharacterSetSize(1662);
      EncodingFactory.getIscEncoding("2600~");
      char[] charArray0 = new char[8];
      charArray0[0] = '6';
      char char0 = 'K';
      charArray0[1] = 'K';
      char char1 = '\'';
      charArray0[2] = '\'';
      charArray0[3] = 'J';
      charArray0[4] = 'b';
      char char2 = 'd';
      char char3 = 'h';
      char char4 = 'h';
      String string0 = "Cp866";
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
  //Test case number: 38
  /*Coverage entropy=1.1222022310353852
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      EncodingFactory.getCharacterSetSize(0);
      EncodingFactory.createEncoding("2]");
      char[] charArray0 = new char[0];
      EncodingFactory.getEncoding(">}9/MCW;kQ]w", charArray0);
      EncodingFactory.getEncoding("pM!N", charArray0);
      EncodingFactory.getJavaEncoding("ISO8859_13");
      EncodingFactory.getIscEncodingSize("pM!N");
      EncodingFactory.getJavaEncoding("DqIG");
      Encoding encoding0 = EncodingFactory.createEncoding("ISO8859_13");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 39
  /*Coverage entropy=0.9835069237541881
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = 'b';
      EncodingFactory.getEncoding((String) null, charArray0);
      EncodingFactory.getEncoding("iIk", charArray0);
      EncodingFactory.getJavaEncoding("DOS850");
      EncodingFactory.createEncoding("DOS850");
      EncodingFactory.getJavaEncodingForAlias((String) null);
      EncodingFactory.getJavaEncodingForAlias((String) null);
      Encoding encoding0 = EncodingFactory.createEncoding("Cp861");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 40
  /*Coverage entropy=0.7071094627648349
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      EncodingFactory.createEncoding("2]");
      EncodingFactory.createEncoding("2]");
      EncodingFactory.getIscEncoding("DOS864");
      char[] charArray0 = new char[6];
      charArray0[2] = ';';
      charArray0[4] = ';';
      EncodingFactory.getEncoding("HY092", charArray0);
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
  //Test case number: 41
  /*Coverage entropy=0.19144408195771734
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      String string0 = "2]";
      EncodingFactory.createEncoding("2]");
      EncodingFactory.createEncoding("2]");
      EncodingFactory.createEncoding("UNICODE_FSS");
      String string1 = null;
      char[] charArray0 = new char[5];
      charArray0[0] = ';';
      charArray0[1] = 'j';
      charArray0[2] = ';';
      charArray0[3] = ';';
      charArray0[4] = ';';
      EncodingFactory.getEncoding((String) null, charArray0);
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp858", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 42
  /*Coverage entropy=1.6769877743224173
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      EncodingFactory.createEncoding("2]");
      EncodingFactory.createEncoding("2]");
      EncodingFactory.createEncoding("2]");
      EncodingFactory.getJavaEncodingForAlias("NONE");
      char[] charArray0 = new char[8];
      charArray0[0] = 'G';
      charArray0[1] = '|';
      charArray0[2] = 'Y';
      charArray0[3] = '`';
      charArray0[4] = '=';
      charArray0[5] = '\\';
      charArray0[6] = '2';
      charArray0[7] = '^';
      EncodingFactory.getEncoding("NONE", charArray0);
      EncodingFactory.getEncoding("6(AA/o$::p)Z:]", charArray0);
      EncodingFactory.getJavaEncoding("\"i;zC^yC@");
      EncodingFactory.createEncoding("Cp1255");
      EncodingFactory.getJavaEncodingForAlias("NONE");
      EncodingFactory.getJavaEncodingForAlias("Cp1257");
      // Undeclared exception!
      try { 
        EncodingFactory.createEncoding((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 43
  /*Coverage entropy=1.7147431158325055
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      EncodingFactory.getJavaEncodingForAlias("");
      EncodingFactory.createEncoding("I4@@E}?BuZR3c&");
      EncodingFactory.createEncoding("I4@@E}?BuZR3c&");
      EncodingFactory.getIscEncoding("DOS866");
      char[] charArray0 = new char[9];
      charArray0[0] = 'y';
      charArray0[1] = 'R';
      charArray0[2] = 't';
      charArray0[3] = ';';
      charArray0[4] = '4';
      charArray0[5] = 'J';
      charArray0[6] = '1';
      charArray0[7] = 'Y';
      charArray0[8] = 'C';
      EncodingFactory.getEncoding((String) null, charArray0);
      EncodingFactory.getJavaEncoding("ISO8859_7");
      EncodingFactory.getIscEncodingSize("GDS Exception. ");
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp1253", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 44
  /*Coverage entropy=1.7721393884375285
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      String string0 = "";
      EncodingFactory.getJavaEncodingForAlias("");
      EncodingFactory.getIscEncodingSize((String) null);
      EncodingFactory.getEncoding("");
      EncodingFactory.getIscEncoding("");
      char[] charArray0 = new char[7];
      charArray0[0] = '1';
      charArray0[2] = ';';
      charArray0[3] = '\"';
      charArray0[4] = '>';
      charArray0[5] = 'Y';
      charArray0[6] = '(';
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
  //Test case number: 45
  /*Coverage entropy=1.294545165844896
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      EncodingFactory.getJavaEncodingForAlias("");
      EncodingFactory.createEncoding("Cp1252");
      EncodingFactory.createEncoding("");
      String string0 = "NONE";
      EncodingFactory.getJavaEncodingForAlias("\"$OX");
      EncodingFactory.getEncoding("F%kdyp@T");
      String string1 = null;
      // Undeclared exception!
      try { 
        EncodingFactory.createEncoding((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 46
  /*Coverage entropy=0.68937906138404
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("2]");
      EncodingFactory.createEncoding("Cp865");
      EncodingFactory.getIscEncoding("AdY97cT<pu");
      EncodingFactory.getJavaEncoding("08006");
      Encoding encoding1 = EncodingFactory.createEncoding("/m 1wm_!c@bg$+$");
      assertFalse(encoding1.equals((Object)encoding0));
  }
}
