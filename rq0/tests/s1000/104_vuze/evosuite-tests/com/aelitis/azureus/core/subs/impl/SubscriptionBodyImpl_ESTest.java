/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 07 13:47:57 GMT 2018
 */

package com.aelitis.azureus.core.subs.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.aelitis.azureus.core.subs.SubscriptionException;
import com.aelitis.azureus.core.subs.impl.SubscriptionBodyImpl;
import com.aelitis.azureus.core.subs.impl.SubscriptionImpl;
import com.aelitis.azureus.core.subs.impl.SubscriptionManagerImpl;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.gudy.azureus2.platform.win32.PlatformManagerImpl;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SubscriptionBodyImpl_ESTest extends SubscriptionBodyImpl_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/home/ubuntu/.Azureus");
      FileSystemHandling.shouldThrowIOException(evoSuiteFile0);
      SubscriptionManagerImpl subscriptionManagerImpl0 = new SubscriptionManagerImpl(true);
      byte[] byteArray0 = new byte[5];
      HashMap<Long, Object> hashMap0 = new HashMap<Long, Object>();
      SubscriptionBodyImpl subscriptionBodyImpl0 = new SubscriptionBodyImpl(subscriptionManagerImpl0, "QwXIJV>%PAPzib", true, "QwXIJV>%PAPzib", byteArray0, (byte)26, (byte)26, hashMap0);
      SubscriptionBodyImpl.verify(byteArray0, byteArray0, (byte)26, (byte)26, byteArray0);
      subscriptionManagerImpl0.getSubscriptionFromSID(byteArray0);
      try { 
        subscriptionBodyImpl0.writeVuzeFile((SubscriptionImpl) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Operation failed
         //
         verifyException("com.aelitis.azureus.core.subs.impl.SubscriptionBodyImpl", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      SubscriptionBodyImpl subscriptionBodyImpl0 = null;
      try {
        subscriptionBodyImpl0 = new SubscriptionBodyImpl((SubscriptionManagerImpl) null, hashMap0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Invalid subscription - details missing
         //
         verifyException("com.aelitis.azureus.core.subs.impl.SubscriptionBodyImpl", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SubscriptionManagerImpl subscriptionManagerImpl0 = new SubscriptionManagerImpl(true);
      int int0 = 16777261;
      HashMap<Long, String> hashMap0 = new HashMap<Long, String>();
      SubscriptionBodyImpl subscriptionBodyImpl0 = new SubscriptionBodyImpl(subscriptionManagerImpl0, "l|B]-sWUr<", true, "qP Zk*x/Bh:lANelX", (byte[]) null, 16777261, 16777261, hashMap0);
      subscriptionBodyImpl0.getHash();
      subscriptionBodyImpl0.getJSON();
      // Undeclared exception!
      try { 
        subscriptionBodyImpl0.getShortID();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.gudy.azureus2.core3.util.SHA1Simple", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SubscriptionManagerImpl subscriptionManagerImpl0 = null;
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      SubscriptionBodyImpl subscriptionBodyImpl0 = new SubscriptionBodyImpl((SubscriptionManagerImpl) null, "Alg.Alias.KeyGenerator.1.2.840.113549.3.4", false, "Alg.Alias.KeyGenerator.1.2.840.113549.3.4", (byte[]) null, 1027, 1974, hashMap0);
      // Undeclared exception!
      try { 
        subscriptionBodyImpl0.getShortID();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.gudy.azureus2.core3.util.SHA1Simple", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SubscriptionManagerImpl subscriptionManagerImpl0 = new SubscriptionManagerImpl(true);
      byte[] byteArray0 = new byte[5];
      HashMap<Long, Object> hashMap0 = new HashMap<Long, Object>();
      SubscriptionBodyImpl subscriptionBodyImpl0 = new SubscriptionBodyImpl(subscriptionManagerImpl0, "QwXIJV>%PAPzib", true, "QwXIJV>%PAPzib", byteArray0, (byte)26, (byte)26, hashMap0);
      try { 
        SubscriptionBodyImpl.sign(byteArray0, byteArray0, 0, 0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Failed to decode private key
         //
         verifyException("com.aelitis.azureus.core.security.CryptoECCUtils", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SubscriptionManagerImpl subscriptionManagerImpl0 = new SubscriptionManagerImpl(true);
      int int0 = 16777261;
      HashMap<Long, String> hashMap0 = new HashMap<Long, String>();
      // Undeclared exception!
      try { 
        SubscriptionBodyImpl.encode((byte[]) null, 16777261, 16777261);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.aelitis.azureus.core.subs.impl.SubscriptionBodyImpl", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      byte[] byteArray0 = new byte[0];
      SubscriptionBodyImpl subscriptionBodyImpl0 = new SubscriptionBodyImpl((SubscriptionManagerImpl) null, "Ki*NhE", true, "Ki*NhE", byteArray0, 512, 512, hashMap0);
      SubscriptionManagerImpl subscriptionManagerImpl0 = new SubscriptionManagerImpl(true);
      SubscriptionImpl subscriptionImpl0 = null;
      try {
        subscriptionImpl0 = new SubscriptionImpl((SubscriptionManagerImpl) null, subscriptionBodyImpl0, 512, true);
        fail("Expecting exception: Exception");
      
      } catch(Throwable e) {
         //
         // !subscription.version.bad!
         //
         verifyException("com.aelitis.azureus.core.subs.impl.SubscriptionImpl", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SubscriptionManagerImpl subscriptionManagerImpl0 = new SubscriptionManagerImpl(true);
      byte[] byteArray0 = new byte[4];
      HashMap<Long, Object> hashMap0 = new HashMap<Long, Object>();
      SubscriptionBodyImpl subscriptionBodyImpl0 = new SubscriptionBodyImpl(subscriptionManagerImpl0, "QwXIJV>%PAPzib", true, "QwXIJV>%PAPzib", byteArray0, (byte)26, (byte)26, (Map) null);
      subscriptionManagerImpl0.getSubscriptionFromSID(byteArray0);
      try { 
        subscriptionBodyImpl0.writeVuzeFile((SubscriptionImpl) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Operation failed
         //
         verifyException("com.aelitis.azureus.core.subs.impl.SubscriptionBodyImpl", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      System.setCurrentTimeMillis(1800000L);
      SubscriptionManagerImpl subscriptionManagerImpl0 = new SubscriptionManagerImpl(false);
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-80);
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)3;
      byteArray0[3] = (byte) (-71);
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte) (-109);
      byteArray0[6] = (byte)97;
      byteArray0[7] = (byte)1;
      HashMap<Object, Long> hashMap0 = new HashMap<Object, Long>();
      SubscriptionBodyImpl subscriptionBodyImpl0 = new SubscriptionBodyImpl(subscriptionManagerImpl0, "", false, "", byteArray0, (byte)3, (byte)0, hashMap0);
      int int0 = subscriptionBodyImpl0.getSigDataSize();
      assertEquals(0, int0);
      assertEquals(0, hashMap0.size());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SubscriptionManagerImpl subscriptionManagerImpl0 = new SubscriptionManagerImpl(true);
      byte[] byteArray0 = new byte[5];
      HashMap<Long, Object> hashMap0 = new HashMap<Long, Object>();
      SubscriptionBodyImpl subscriptionBodyImpl0 = new SubscriptionBodyImpl(subscriptionManagerImpl0, "QwXIJV>%PAPzib", true, "QwXIJV>%PAPzib", byteArray0, (byte)26, (byte)26, hashMap0);
      subscriptionBodyImpl0.setJSON("QwXIJV>%PAPzib");
      subscriptionManagerImpl0.getSubscriptionFromSID(byteArray0);
      // Undeclared exception!
      try { 
        subscriptionBodyImpl0.updateDetails((SubscriptionImpl) null, hashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.aelitis.azureus.core.subs.impl.SubscriptionBodyImpl", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SubscriptionManagerImpl subscriptionManagerImpl0 = new SubscriptionManagerImpl(true);
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      SubscriptionBodyImpl subscriptionBodyImpl0 = new SubscriptionBodyImpl(subscriptionManagerImpl0, "e", true, "e", (byte[]) null, 205, 940, hashMap0);
      subscriptionBodyImpl0.getSig();
      assertTrue(hashMap0.isEmpty());
      assertEquals(0, hashMap0.size());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = SubscriptionBodyImpl.deriveShortID(byteArray0, (Map) null);
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      SubscriptionManagerImpl subscriptionManagerImpl0 = new SubscriptionManagerImpl(true);
      SubscriptionBodyImpl subscriptionBodyImpl0 = new SubscriptionBodyImpl(subscriptionManagerImpl0, "0Y>7ItQDr9UYnu\"tw%", false, "0Y>7ItQDr9UYnu\"tw%", byteArray1, 2163, 9, (Map) null);
      SubscriptionException subscriptionException0 = new SubscriptionException("R");
      subscriptionException0.getLocalizedMessage();
      try { 
        subscriptionBodyImpl0.rethrow(subscriptionException0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
      }
  }
}