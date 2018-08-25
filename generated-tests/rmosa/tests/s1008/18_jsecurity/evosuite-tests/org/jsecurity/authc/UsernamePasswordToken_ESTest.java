/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 08:43:28 GMT 2018
 */

package org.jsecurity.authc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.InetAddress;
import java.net.UnknownHostException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.jsecurity.authc.UsernamePasswordToken;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UsernamePasswordToken_ESTest extends UsernamePasswordToken_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      usernamePasswordToken0.setUsername("");
      usernamePasswordToken0.clear();
      usernamePasswordToken0.clear();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken((String) null, (String) null, true);
      char[] charArray0 = new char[6];
      charArray0[0] = 'M';
      charArray0[1] = '\\';
      charArray0[2] = 'I';
      charArray0[3] = '0';
      charArray0[4] = '';
      charArray0[5] = 'c';
      usernamePasswordToken0.setPassword(charArray0);
      assertTrue(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      char[] charArray0 = new char[0];
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", charArray0, inetAddress0);
      usernamePasswordToken0.clear();
      String string0 = usernamePasswordToken0.toString();
      assertEquals("org.jsecurity.authc.UsernamePasswordToken - null, rememberMe=false", string0);
      
      usernamePasswordToken0.clear();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", "", false);
      usernamePasswordToken0.setRememberMe(false);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken(")", ")");
      boolean boolean0 = false;
      usernamePasswordToken0.setRememberMe(false);
      usernamePasswordToken0.clear();
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-123);
      byteArray0[2] = (byte)40;
      usernamePasswordToken0.clear();
      byteArray0[3] = (byte)9;
      byteArray0[4] = (byte) (-107);
      try { 
        MockInetAddress.getByAddress(byteArray0);
        fail("Expecting exception: UnknownHostException");
      
      } catch(UnknownHostException e) {
         //
         // Not IPv4: [0, -123, 40, 9, -107]
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockInetAddress", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("s96@;eAN{!F^cUI|", "s96@;eAN{!F^cUI|", true);
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      usernamePasswordToken0.setInetAddress(inetAddress0);
      usernamePasswordToken0.setUsername("s96@;eAN{!F^cUI|");
      usernamePasswordToken0.getInetAddress();
      assertTrue(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", "");
      usernamePasswordToken0.getCredentials();
      usernamePasswordToken0.setRememberMe(false);
      usernamePasswordToken0.isRememberMe();
      usernamePasswordToken0.setUsername("");
      usernamePasswordToken0.setPassword((char[]) null);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      usernamePasswordToken0.setRememberMe(false);
      char[] charArray0 = new char[3];
      charArray0[0] = '*';
      charArray0[1] = 'f';
      charArray0[2] = 'V';
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.getPrincipal();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("yfSF*KdO/{3)AN", "", true);
      usernamePasswordToken0.getUsername();
      assertTrue(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("`dCLV85Y%?f", "=9Qs%EJy\"F\"7tK#h4Cr", true, inetAddress0);
      boolean boolean0 = usernamePasswordToken0.isRememberMe();
      assertTrue(boolean0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken((String) null, (String) null);
      byte[] byteArray0 = new byte[8];
      usernamePasswordToken0.setRememberMe(false);
      usernamePasswordToken0.setRememberMe(false);
      byteArray0[0] = (byte)0;
      InetAddress inetAddress0 = MockInetAddress.getByName("");
      usernamePasswordToken0.setInetAddress(inetAddress0);
      byteArray0[1] = (byte)9;
      usernamePasswordToken0.toString();
      byteArray0[2] = (byte)35;
      byteArray0[3] = (byte) (-31);
      byteArray0[4] = (byte)124;
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte) (-84);
      byteArray0[7] = (byte)0;
      try { 
        MockInetAddress.getByAddress((String) null, byteArray0);
        fail("Expecting exception: UnknownHostException");
      
      } catch(UnknownHostException e) {
         //
         // Not IPv4: [0, 9, 35, -31, 124, 0, -84, 0]
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockInetAddress", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      char[] charArray0 = new char[4];
      charArray0[0] = 'a';
      charArray0[1] = 'l';
      charArray0[2] = '0';
      charArray0[3] = 'g';
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("da", charArray0);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      char[] charArray0 = new char[7];
      charArray0[0] = '=';
      charArray0[1] = '\"';
      charArray0[2] = ':';
      charArray0[3] = '?';
      charArray0[4] = '0';
      charArray0[5] = 'S';
      charArray0[6] = 'y';
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken(",M7O", charArray0, true);
      assertTrue(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("J|AdZUh", "J|AdZUh", inetAddress0);
      usernamePasswordToken0.toString();
      usernamePasswordToken0.setRememberMe(false);
      char[] charArray0 = usernamePasswordToken0.getPassword();
      usernamePasswordToken0.setUsername("");
      InetAddress inetAddress1 = MockInetAddress.anyLocalAddress();
      usernamePasswordToken0.toString();
      usernamePasswordToken0.setInetAddress(inetAddress1);
      usernamePasswordToken0.setInetAddress(inetAddress1);
      usernamePasswordToken0.toString();
      usernamePasswordToken0.getUsername();
      usernamePasswordToken0.getPrincipal();
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.setUsername("");
      usernamePasswordToken0.getPassword();
      usernamePasswordToken0.setUsername("");
      usernamePasswordToken0.setRememberMe(true);
      usernamePasswordToken0.isRememberMe();
      usernamePasswordToken0.getCredentials();
      usernamePasswordToken0.clear();
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.getCredentials();
      usernamePasswordToken0.isRememberMe();
      usernamePasswordToken0.getCredentials();
      usernamePasswordToken0.getUsername();
      usernamePasswordToken0.getCredentials();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", (String) null, true, (InetAddress) null);
      char[] charArray0 = new char[7];
      charArray0[0] = 'U';
      charArray0[1] = 'K';
      charArray0[2] = '\'';
      charArray0[3] = '0';
      charArray0[4] = 'g';
      charArray0[5] = 'P';
      charArray0[6] = 'W';
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.setUsername((String) null);
      usernamePasswordToken0.setRememberMe(true);
      String string0 = usernamePasswordToken0.toString();
      assertEquals("org.jsecurity.authc.UsernamePasswordToken - null, rememberMe=true", string0);
      
      usernamePasswordToken0.getPrincipal();
      usernamePasswordToken0.getPrincipal();
      assertTrue(usernamePasswordToken0.isRememberMe());
  }
}
