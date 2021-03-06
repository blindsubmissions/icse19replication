/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 07 13:43:36 GMT 2018
 */

package com.aelitis.azureus.core.peermanager.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.aelitis.azureus.core.peermanager.utils.BTPeerIDByteDecoderDefinitions;
import com.aelitis.azureus.core.peermanager.utils.BTPeerIDByteDecoderUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BTPeerIDByteDecoderUtils_ESTest extends BTPeerIDByteDecoderUtils_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      // Undeclared exception!
      try { 
        BTPeerIDByteDecoderUtils.decodeAzStyleVersionNumber("1.2.3", "1.2.3");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // unknown AZ style version number scheme - 1.2.3
         //
         verifyException("com.aelitis.azureus.core.peermanager.utils.BTPeerIDByteDecoderUtils", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = BTPeerIDByteDecoderUtils.getMainlineStyleVersionNumber("Fv-TDBP6N-:w,+96b^#");
      assertNull(string0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        BTPeerIDByteDecoderUtils.decodeAzStyleVersionNumber("1.2.3", "2.3.4");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // unknown AZ style version number scheme - 2.3.4
         //
         verifyException("com.aelitis.azureus.core.peermanager.utils.BTPeerIDByteDecoderUtils", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = BTPeerIDByteDecoderUtils.getShadowStyleVersionNumber("-;ssQU$Z?[8o6VEI");
      assertNull(string0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        BTPeerIDByteDecoderUtils.decodeAzStyleVersionNumber("AllPeers", "AllPeers");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // unknown AZ style version number scheme - AllPeers
         //
         verifyException("com.aelitis.azureus.core.peermanager.utils.BTPeerIDByteDecoderUtils", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = BTPeerIDByteDecoderUtils.getTwoByteThreePartVersion((byte)1, (byte)1);
      assertEquals("1.0.1", string0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.7356219397587946
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        BTPeerIDByteDecoderUtils.getShadowStyleVersionNumber(" la{CS");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = BTPeerIDByteDecoderUtils.getMainlineStyleVersionNumber("M2/W1$z'}39 eTj^I[");
      assertNull(string0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BTPeerIDByteDecoderUtils bTPeerIDByteDecoderUtils0 = new BTPeerIDByteDecoderUtils();
  }

  /**
  //Test case number: 9
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = BTPeerIDByteDecoderUtils.decodeMnemonic('Z');
      assertEquals("(Dev)", string0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = BTPeerIDByteDecoderUtils.decodeMnemonic('H');
      assertNull(string0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      boolean boolean0 = BTPeerIDByteDecoderUtils.isPossibleSpoofClient("v1234");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = BTPeerIDByteDecoderUtils.extractReadableVersionSubstringFromPeerID(" ");
      assertEquals("", string0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      boolean boolean0 = BTPeerIDByteDecoderUtils.isMainlineStyle("2.3.4");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      boolean boolean0 = BTPeerIDByteDecoderUtils.isShadowStyle("-U/23D43\"bwY/'V");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.7356219397587946
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        BTPeerIDByteDecoderUtils.getShadowStyleVersionNumber("1.2.3");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      boolean boolean0 = BTPeerIDByteDecoderUtils.isMainlineStyle("Fv-TDBP*N-:w,+96J^#");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = BTPeerIDByteDecoderUtils.extractReadableVersionSubstringFromPeerID("E12.3DUDP0");
      assertEquals("E12.3DUDP0", string0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.6837389058487535
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = BTPeerIDByteDecoderUtils.getShadowStyleVersionNumber("FlashGet");
      assertNotNull(string0);
      assertEquals("79.68.86.75.16", string0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = BTPeerIDByteDecoderUtils.getMainlineStyleVersionNumber("-6L88!:D$s3f%]&");
      assertNull(string0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.8239592165010823
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        BTPeerIDByteDecoderUtils.getShadowStyleVersionNumber("AU#OrLiZ");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      boolean boolean0 = BTPeerIDByteDecoderUtils.isPossibleSpoofClient("KGetHTTPBT");
      assertTrue(boolean0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      boolean boolean0 = BTPeerIDByteDecoderUtils.isAzStyle("-;ssQU$Z?[8o6VEI");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.9184277849930975
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = BTPeerIDByteDecoderUtils.getShadowStyleVersionNumber("12.3-4");
      assertNotNull(string0);
      assertEquals("2.62.3", string0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      boolean boolean0 = BTPeerIDByteDecoderUtils.isPossibleSpoofClient("-B8!ND}$s3f%+$J]&UDP0");
      assertTrue(boolean0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.9589449955752118
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        BTPeerIDByteDecoderUtils.decodeAzStyleVersionNumber("-L8!:&a%&PTP", "3.4");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // not an integer character: !
         //
         verifyException("com.aelitis.azureus.core.peermanager.utils.BTPeerIDByteDecoderUtils", e);
      }
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.5004024235381879
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        BTPeerIDByteDecoderUtils.decodeCustomVersionNumber("#%Tn/|Q#}", "abcde -> ab.cd");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // unknown custom version number scheme - abcde -> ab.cd
         //
         verifyException("com.aelitis.azureus.core.peermanager.utils.BTPeerIDByteDecoderUtils", e);
      }
  }

  /**
  //Test case number: 27
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BTPeerIDByteDecoderUtils.decodeMnemonic('X');
      // Undeclared exception!
      try { 
        BTPeerIDByteDecoderUtils.decodeCustomVersionNumber("(Dev)", "(Dev)");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // unknown custom version number scheme - (Dev)
         //
         verifyException("com.aelitis.azureus.core.peermanager.utils.BTPeerIDByteDecoderUtils", e);
      }
  }

  /**
  //Test case number: 28
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      boolean boolean0 = BTPeerIDByteDecoderUtils.isShadowStyle("X@7z?-kFc%5D}");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.0466304865832219
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try { 
        BTPeerIDByteDecoderUtils.decodeAzStyleVersionNumber("1.2(34)", "1.2(34)");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // not an integer character: .
         //
         verifyException("com.aelitis.azureus.core.peermanager.utils.BTPeerIDByteDecoderUtils", e);
      }
  }

  /**
  //Test case number: 30
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      boolean boolean0 = BTPeerIDByteDecoderUtils.isShadowStyle("?`Q+THE");
      BTPeerIDByteDecoderUtils.decodeMnemonic('|');
      boolean boolean1 = BTPeerIDByteDecoderUtils.isPossibleSpoofClient(";kY:&jRpW");
      assertTrue(boolean1 == boolean0);
      
      String string0 = BTPeerIDByteDecoderUtils.decodeMnemonic('b');
      assertNotNull(string0);
      assertEquals("Beta", string0);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BTPeerIDByteDecoderUtils.decodeMnemonic('B');
      // Undeclared exception!
      try { 
        BTPeerIDByteDecoderUtils.isAzStyle((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.aelitis.azureus.core.peermanager.utils.BTPeerIDByteDecoderUtils", e);
      }
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String string0 = BTPeerIDByteDecoderUtils.getMainlineStyleVersionNumber("X@7z?-kFc%5D}");
      assertNull(string0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      // Undeclared exception!
      try { 
        BTPeerIDByteDecoderUtils.decodeAzStyleVersionNumber("abcde -> ab.cd", "1.2.3.4");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // unknown AZ style version number scheme - 1.2.3.4
         //
         verifyException("com.aelitis.azureus.core.peermanager.utils.BTPeerIDByteDecoderUtils", e);
      }
  }

  /**
  //Test case number: 34
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      boolean boolean0 = BTPeerIDByteDecoderUtils.isShadowStyle("312.3-");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 35
  /*Coverage entropy=0.8461447967228176
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      // Undeclared exception!
      try { 
        BTPeerIDByteDecoderUtils.decodeAzStyleVersionNumber("Beta", "1.2");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // not an integer character: B
         //
         verifyException("com.aelitis.azureus.core.peermanager.utils.BTPeerIDByteDecoderUtils", e);
      }
  }

  /**
  //Test case number: 36
  /*Coverage entropy=0.922980661086409
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      // Undeclared exception!
      try { 
        BTPeerIDByteDecoderUtils.decodeAzStyleVersionNumber("v1234", "v1234");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // not an integer character: v
         //
         verifyException("com.aelitis.azureus.core.peermanager.utils.BTPeerIDByteDecoderUtils", e);
      }
  }

  /**
  //Test case number: 37
  /*Coverage entropy=0.410116318288409
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      String string0 = BTPeerIDByteDecoderUtils.decodeAzStyleVersionNumber("12.3-4", "12.3-4");
      assertEquals("12.62-3", string0);
  }

  /**
  //Test case number: 38
  /*Coverage entropy=1.1490596969706202
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      // Undeclared exception!
      try { 
        BTPeerIDByteDecoderUtils.decodeAzStyleVersionNumber("114oJ.1.2\"\"wDP]", "1.2.3");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // unknown AZ style version number scheme - 1.2.3
         //
         verifyException("com.aelitis.azureus.core.peermanager.utils.BTPeerIDByteDecoderUtils", e);
      }
  }

  /**
  //Test case number: 39
  /*Coverage entropy=0.8018185525433373
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      String string0 = BTPeerIDByteDecoderUtils.getShadowStyleVersionNumber("T00---0");
      assertEquals("0", string0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 40
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      // Undeclared exception!
      try { 
        BTPeerIDByteDecoderUtils.decodeAzStyleVersionNumber("1.234", "1.234");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // not an integer character: .
         //
         verifyException("com.aelitis.azureus.core.peermanager.utils.BTPeerIDByteDecoderUtils", e);
      }
  }

  /**
  //Test case number: 41
  /*Coverage entropy=0.45056120886630463
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      BTPeerIDByteDecoderDefinitions.VER_AZ_LAST_THREE_DIGITS = "1.2(34)";
      BTPeerIDByteDecoderDefinitions.VER_AZ_THREE_DIGITS = "1.2(34)";
      boolean boolean0 = BTPeerIDByteDecoderUtils.isAzStyle("RM");
      assertFalse(boolean0);
      
      String string0 = BTPeerIDByteDecoderUtils.decodeMnemonic('x');
      assertEquals("(Dev)", string0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 42
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      boolean boolean0 = BTPeerIDByteDecoderUtils.isShadowStyle("E12.3-4");
      assertTrue(boolean0);
  }

  /**
  //Test case number: 43
  /*Coverage entropy=1.0237155068361252
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      // Undeclared exception!
      try { 
        BTPeerIDByteDecoderUtils.decodeAzStyleVersionNumber("1.2.34", "1.2.34");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // not an integer character: .
         //
         verifyException("com.aelitis.azureus.core.peermanager.utils.BTPeerIDByteDecoderUtils", e);
      }
  }

  /**
  //Test case number: 44
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      // Undeclared exception!
      try { 
        BTPeerIDByteDecoderUtils.decodeCustomVersionNumber("abcd -> a.b.cd", "abcd -> a.b.cd");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // unknown custom version number scheme - abcd -> a.b.cd
         //
         verifyException("com.aelitis.azureus.core.peermanager.utils.BTPeerIDByteDecoderUtils", e);
      }
  }

  /**
  //Test case number: 45
  /*Coverage entropy=1.1973401339967784
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      // Undeclared exception!
      try { 
        BTPeerIDByteDecoderUtils.decodeAzStyleVersionNumber("1.23 [4]", "1.23 [4]");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // unknown AZ style version number scheme - 1.23 [4]
         //
         verifyException("com.aelitis.azureus.core.peermanager.utils.BTPeerIDByteDecoderUtils", e);
      }
  }

  /**
  //Test case number: 46
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      // Undeclared exception!
      try { 
        BTPeerIDByteDecoderUtils.decodeCustomVersionNumber("BOW-STYLE", "BOW-STYLE");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // unknown custom version number scheme - BOW-STYLE
         //
         verifyException("com.aelitis.azureus.core.peermanager.utils.BTPeerIDByteDecoderUtils", e);
      }
  }

  /**
  //Test case number: 47
  /*Coverage entropy=0.3250829733914482
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      boolean boolean0 = BTPeerIDByteDecoderUtils.isShadowStyle("P0b/8-uvk");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 48
  /*Coverage entropy=0.45056120886630463
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      boolean boolean0 = BTPeerIDByteDecoderUtils.isShadowStyle("T00---0");
      assertTrue(boolean0);
  }

  /**
  //Test case number: 49
  /*Coverage entropy=0.6909233093138181
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      // Undeclared exception!
      try { 
        BTPeerIDByteDecoderUtils.decodeAzStyleVersionNumber("DansClient", "2.33.4");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // unknown AZ style version number scheme - 2.33.4
         //
         verifyException("com.aelitis.azureus.core.peermanager.utils.BTPeerIDByteDecoderUtils", e);
      }
  }

  /**
  //Test case number: 50
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      // Undeclared exception!
      try { 
        BTPeerIDByteDecoderUtils.decodeCustomVersionNumber("abcde", "abcde");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // unknown custom version number scheme - abcde
         //
         verifyException("com.aelitis.azureus.core.peermanager.utils.BTPeerIDByteDecoderUtils", e);
      }
  }

  /**
  //Test case number: 51
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      // Undeclared exception!
      try { 
        BTPeerIDByteDecoderUtils.decodeCustomVersionNumber("a.b.c.d.e", "a.b.c.d.e");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // unknown custom version number scheme - a.b.c.d.e
         //
         verifyException("com.aelitis.azureus.core.peermanager.utils.BTPeerIDByteDecoderUtils", e);
      }
  }

  /**
  //Test case number: 52
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      BTPeerIDByteDecoderUtils.isAzStyle("2I+L](J2QX1l];}");
      // Undeclared exception!
      try { 
        BTPeerIDByteDecoderUtils.decodeCustomVersionNumber("2I+L](J2QX1l];}", "abcde -> a.b.c.d.e");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // unknown custom version number scheme - abcde -> a.b.c.d.e
         //
         verifyException("com.aelitis.azureus.core.peermanager.utils.BTPeerIDByteDecoderUtils", e);
      }
  }

  /**
  //Test case number: 53
  /*Coverage entropy=1.2047933096947843
  */
  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      // Undeclared exception!
      try { 
        BTPeerIDByteDecoderUtils.decodeAzStyleVersionNumber("1.2.3 [4]", "1.2.3 [4]");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // unknown AZ style version number scheme - 1.2.3 [4]
         //
         verifyException("com.aelitis.azureus.core.peermanager.utils.BTPeerIDByteDecoderUtils", e);
      }
  }

  /**
  //Test case number: 54
  /*Coverage entropy=0.34883209584303193
  */
  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      boolean boolean0 = BTPeerIDByteDecoderUtils.isShadowStyle("T00-~-0STTPBT");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 55
  /*Coverage entropy=1.0937704472491416
  */
  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      // Undeclared exception!
      try { 
        BTPeerIDByteDecoderUtils.decodeAzStyleVersionNumber("1.2.3=[RD].4", "1.2.3=[RD].4");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // unknown AZ style version number scheme - 1.2.3=[RD].4
         //
         verifyException("com.aelitis.azureus.core.peermanager.utils.BTPeerIDByteDecoderUtils", e);
      }
  }

  /**
  //Test case number: 56
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      String string0 = BTPeerIDByteDecoderUtils.getMainlineStyleVersionNumber("T500---~HT'PT");
      assertNull(string0);
  }

  /**
  //Test case number: 57
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      // Undeclared exception!
      try { 
        BTPeerIDByteDecoderUtils.decodeCustomVersionNumber("00", "abcde -> ab.cd");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // unknown custom version number scheme - abcde -> ab.cd
         //
         verifyException("com.aelitis.azureus.core.peermanager.utils.BTPeerIDByteDecoderUtils", e);
      }
  }

  /**
  //Test case number: 58
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      boolean boolean0 = BTPeerIDByteDecoderUtils.isAzStyle("-L{:1F%-TP");
      assertTrue(boolean0);
  }

  /**
  //Test case number: 59
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      String string0 = BTPeerIDByteDecoderUtils.getMainlineStyleVersionNumber("T5`00---~HT'PT");
      assertNull(string0);
  }

  /**
  //Test case number: 60
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      // Undeclared exception!
      try { 
        BTPeerIDByteDecoderUtils.decodeCustomVersionNumber("A0C", "BOW-STYLE");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // unknown custom version number scheme - BOW-STYLE
         //
         verifyException("com.aelitis.azureus.core.peermanager.utils.BTPeerIDByteDecoderUtils", e);
      }
  }

  /**
  //Test case number: 61
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      boolean boolean0 = BTPeerIDByteDecoderUtils.isMainlineStyle("10-------");
      assertTrue(boolean0);
  }

  /**
  //Test case number: 62
  /*Coverage entropy=1.1822230016451067
  */
  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      // Undeclared exception!
      try { 
        BTPeerIDByteDecoderUtils.decodeAzStyleVersionNumber("12.34", "12.34");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // unknown AZ style version number scheme - 12.34
         //
         verifyException("com.aelitis.azureus.core.peermanager.utils.BTPeerIDByteDecoderUtils", e);
      }
  }

  /**
  //Test case number: 63
  /*Coverage entropy=1.0027182645175161
  */
  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      // Undeclared exception!
      try { 
        BTPeerIDByteDecoderUtils.decodeAzStyleVersionNumber("transmission", "transmission");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // unknown AZ style version number scheme - transmission
         //
         verifyException("com.aelitis.azureus.core.peermanager.utils.BTPeerIDByteDecoderUtils", e);
      }
  }

  /**
  //Test case number: 64
  /*Coverage entropy=1.0596846673731528
  */
  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      // Undeclared exception!
      try { 
        BTPeerIDByteDecoderUtils.decodeAzStyleVersionNumber("8CDZS!lW!^'<V{Zx_KtT", "1.2.3=[RD].4");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // unknown AZ style version number scheme - 1.2.3=[RD].4
         //
         verifyException("com.aelitis.azureus.core.peermanager.utils.BTPeerIDByteDecoderUtils", e);
      }
  }

  /**
  //Test case number: 65
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      boolean boolean0 = BTPeerIDByteDecoderUtils.isMainlineStyle("1---e----");
      assertTrue(boolean0);
  }

  /**
  //Test case number: 66
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      BTPeerIDByteDecoderUtils.isMainlineStyle("1'--Gp--O");
      boolean boolean0 = BTPeerIDByteDecoderUtils.isMainlineStyle("1'--Gp--O");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 67
  /*Coverage entropy=1.020036958401841
  */
  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      // Undeclared exception!
      try { 
        BTPeerIDByteDecoderUtils.decodeAzStyleVersionNumber("2.34", "2.34");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // unknown AZ style version number scheme - 2.34
         //
         verifyException("com.aelitis.azureus.core.peermanager.utils.BTPeerIDByteDecoderUtils", e);
      }
  }

  /**
  //Test case number: 68
  /*Coverage entropy=1.237597168232557
  */
  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      // Undeclared exception!
      try { 
        BTPeerIDByteDecoderUtils.decodeAzStyleVersionNumber("100.T6", "transmission");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // unknown AZ style version number scheme - transmission
         //
         verifyException("com.aelitis.azureus.core.peermanager.utils.BTPeerIDByteDecoderUtils", e);
      }
  }

  /**
  //Test case number: 69
  /*Coverage entropy=1.4593594123475304
  */
  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      BTPeerIDByteDecoderUtils.isAzStyle("12.34");
      // Undeclared exception!
      try { 
        BTPeerIDByteDecoderUtils.decodeAzStyleVersionNumber("00100.T6", "12.34");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // unknown AZ style version number scheme - 12.34
         //
         verifyException("com.aelitis.azureus.core.peermanager.utils.BTPeerIDByteDecoderUtils", e);
      }
  }
}
