/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 07 13:43:10 GMT 2018
 */

package org.bouncycastle.asn1;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.BERConstructedOctetString;
import org.bouncycastle.asn1.BERTaggedObject;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DERObjectIdentifier_ESTest extends DERObjectIdentifier_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DERObjectIdentifier dERObjectIdentifier0 = null;
      try {
        dERObjectIdentifier0 = new DERObjectIdentifier("C_=o/");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // string C_=o/ not an OID
         //
         verifyException("org.bouncycastle.asn1.DERObjectIdentifier", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DERObjectIdentifier dERObjectIdentifier0 = null;
      try {
        dERObjectIdentifier0 = new DERObjectIdentifier("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // string  not an OID
         //
         verifyException("org.bouncycastle.asn1.DERObjectIdentifier", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      DERObjectIdentifier dERObjectIdentifier0 = new DERObjectIdentifier(byteArray0);
      dERObjectIdentifier0.hashCode();
      assertEquals("0.0.0", dERObjectIdentifier0.getId());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-7);
      DERObjectIdentifier dERObjectIdentifier0 = new DERObjectIdentifier(byteArray0);
      String string0 = dERObjectIdentifier0.toString();
      assertEquals("", string0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        DERObjectIdentifier.getInstance((ASN1TaggedObject) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.bouncycastle.asn1.DERObjectIdentifier", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        DERObjectIdentifier.getInstance((Object) "2.14768.8424497293505149440.0");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // illegal object in getInstance: java.lang.String
         //
         verifyException("org.bouncycastle.asn1.DERObjectIdentifier", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-12);
      DERObjectIdentifier dERObjectIdentifier0 = new DERObjectIdentifier(byteArray0);
      assertEquals("2.14768.0.0.0.0.0.0.0", dERObjectIdentifier0.toString());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.7986522062521288
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DERObjectIdentifier dERObjectIdentifier0 = new DERObjectIdentifier("2.1468.8424497293505149440.0");
      BERConstructedOctetString bERConstructedOctetString0 = new BERConstructedOctetString((DEREncodable) dERObjectIdentifier0);
      DERObjectIdentifier dERObjectIdentifier1 = DERObjectIdentifier.getInstance((Object) bERConstructedOctetString0);
      assertEquals("0.6.12.1548.8424497293505149440.0", dERObjectIdentifier1.toString());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.4609855560478324
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DERObjectIdentifier dERObjectIdentifier0 = new DERObjectIdentifier("2.14768.8424497293505149440.0");
      BERConstructedOctetString bERConstructedOctetString0 = new BERConstructedOctetString((DERObject) dERObjectIdentifier0);
      dERObjectIdentifier0.equals(bERConstructedOctetString0);
      byte[] byteArray0 = dERObjectIdentifier0.getDEREncoded();
      assertEquals(14, byteArray0.length);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DERObjectIdentifier dERObjectIdentifier0 = DERObjectIdentifier.getInstance((Object) null);
      assertNull(dERObjectIdentifier0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.45056120886630463
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[14];
      DERObjectIdentifier dERObjectIdentifier0 = new DERObjectIdentifier(byteArray0);
      BERTaggedObject bERTaggedObject0 = new BERTaggedObject((byte) (-41), dERObjectIdentifier0);
      DERObjectIdentifier dERObjectIdentifier1 = DERObjectIdentifier.getInstance((Object) bERTaggedObject0);
      assertEquals("0.0.0.0.0.0.0.0.0.0.0.0.0.0.0", dERObjectIdentifier1.toString());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)58;
      DERObjectIdentifier dERObjectIdentifier0 = new DERObjectIdentifier(byteArray0);
      assertEquals("1.18.0.0", dERObjectIdentifier0.toString());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.34883209584303193
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      DERObjectIdentifier dERObjectIdentifier0 = new DERObjectIdentifier(byteArray0);
      boolean boolean0 = dERObjectIdentifier0.asn1Equals(dERObjectIdentifier0);
      assertTrue(boolean0);
      assertEquals("0.0", dERObjectIdentifier0.toString());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.090867278573495
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DERObjectIdentifier dERObjectIdentifier0 = new DERObjectIdentifier("2.14768.0.65816385105508864.0");
      assertEquals("2.14768.0.65816385105508864.0", dERObjectIdentifier0.getId());
      
      byte[] byteArray0 = dERObjectIdentifier0.getDEREncoded();
      assertEquals(14, byteArray0.length);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.090867278573495
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DERObjectIdentifier dERObjectIdentifier0 = new DERObjectIdentifier("2.147680.65816385105508864.0");
      byte[] byteArray0 = dERObjectIdentifier0.getDEREncoded();
      assertEquals(14, byteArray0.length);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.1097385521061456
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DERObjectIdentifier dERObjectIdentifier0 = new DERObjectIdentifier("2.245184944.0.0.0.0.0");
      byte[] byteArray0 = dERObjectIdentifier0.getDEREncoded();
      assertEquals(11, byteArray0.length);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DERObjectIdentifier dERObjectIdentifier0 = null;
      try {
        dERObjectIdentifier0 = new DERObjectIdentifier("Y.g1H7");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // string Y.g1H7 not an OID
         //
         verifyException("org.bouncycastle.asn1.DERObjectIdentifier", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.119606167144626
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DERObjectIdentifier dERObjectIdentifier0 = new DERObjectIdentifier("0.6.9245185024.0.0.0.0.0");
      byte[] byteArray0 = dERObjectIdentifier0.getDEREncoded();
      assertEquals(13, byteArray0.length);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.1177327443974296
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      DERObjectIdentifier dERObjectIdentifier0 = new DERObjectIdentifier("2.1468.8424497.93505149440.0");
      dERObjectIdentifier0.getEncoded("EG;LNXA");
      dERObjectIdentifier0.getDEREncoded();
      byte[] byteArray0 = dERObjectIdentifier0.getDEREncoded();
      assertEquals(15, byteArray0.length);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.1177327443974296
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DERObjectIdentifier dERObjectIdentifier0 = new DERObjectIdentifier("2.1468.424472505149440.0");
      assertEquals("2.1468.424472505149440.0", dERObjectIdentifier0.getId());
      
      byte[] byteArray0 = dERObjectIdentifier0.getDEREncoded();
      assertEquals(12, byteArray0.length);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DERObjectIdentifier dERObjectIdentifier0 = null;
      try {
        dERObjectIdentifier0 = new DERObjectIdentifier("..Q/7");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // string ..Q/7 not an OID
         //
         verifyException("org.bouncycastle.asn1.DERObjectIdentifier", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.34883209584303193
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DERObjectIdentifier dERObjectIdentifier0 = null;
      try {
        dERObjectIdentifier0 = new DERObjectIdentifier("2.14768.842449729N505149440.0");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // string 2.14768.842449729N505149440.0 not an OID
         //
         verifyException("org.bouncycastle.asn1.DERObjectIdentifier", e);
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.34883209584303193
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DERObjectIdentifier dERObjectIdentifier0 = null;
      try {
        dERObjectIdentifier0 = new DERObjectIdentifier("2.245184944.0.0.0.0.");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // string 2.245184944.0.0.0.0. not an OID
         //
         verifyException("org.bouncycastle.asn1.DERObjectIdentifier", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[19];
      byteArray0[0] = (byte) (-12);
      byteArray0[1] = (byte) (-12);
      byteArray0[2] = (byte) (-12);
      byteArray0[3] = (byte) (-12);
      byteArray0[4] = (byte) (-12);
      byteArray0[5] = (byte) (-12);
      byteArray0[6] = (byte) (-12);
      byteArray0[7] = (byte) (-12);
      byteArray0[8] = (byte) (-12);
      DERObjectIdentifier dERObjectIdentifier0 = new DERObjectIdentifier(byteArray0);
      System.setCurrentTimeMillis((byte) (-12));
      System.setCurrentTimeMillis((byte) (-12));
      System.setCurrentTimeMillis((byte) (-12));
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.1109343929991262
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DERObjectIdentifier dERObjectIdentifier0 = new DERObjectIdentifier("2.14768.84244729350149440.0");
      byte[] byteArray0 = dERObjectIdentifier0.getDEREncoded();
      assertEquals(14, byteArray0.length);
  }
}
