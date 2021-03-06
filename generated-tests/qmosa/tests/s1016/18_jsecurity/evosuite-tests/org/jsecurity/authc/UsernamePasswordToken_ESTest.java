/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 13:56:12 GMT 2018
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
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", "", false);
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      usernamePasswordToken0.setInetAddress(inetAddress0);
      usernamePasswordToken0.setRememberMe(false);
      usernamePasswordToken0.setInetAddress(inetAddress0);
      String string0 = usernamePasswordToken0.toString();
      assertEquals("org.jsecurity.authc.UsernamePasswordToken - , rememberMe=false (/192.168.1.42)", string0);
      
      usernamePasswordToken0.getPassword();
      usernamePasswordToken0.setUsername((String) null);
      usernamePasswordToken0.clear();
      usernamePasswordToken0.toString();
      usernamePasswordToken0.getCredentials();
      usernamePasswordToken0.setUsername("");
      usernamePasswordToken0.clear();
      usernamePasswordToken0.getPrincipal();
      char[] charArray0 = usernamePasswordToken0.getPassword();
      assertNull(charArray0);
      
      usernamePasswordToken0.toString();
      usernamePasswordToken0.setUsername("org.jsecurity.authc.UsernamePasswordToken - null, rememberMe=false");
      usernamePasswordToken0.toString();
      usernamePasswordToken0.setPassword((char[]) null);
      usernamePasswordToken0.getCredentials();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      char[] charArray0 = new char[0];
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken(".t{,1?E", charArray0, (InetAddress) null);
      usernamePasswordToken0.toString();
      usernamePasswordToken0.setInetAddress((InetAddress) null);
      usernamePasswordToken0.setInetAddress((InetAddress) null);
      usernamePasswordToken0.getCredentials();
      usernamePasswordToken0.toString();
      usernamePasswordToken0.toString();
      String string0 = usernamePasswordToken0.toString();
      assertEquals("org.jsecurity.authc.UsernamePasswordToken - .t{,1?E, rememberMe=false", string0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[0] = '2';
      charArray0[1] = '6';
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("/FW ", charArray0, true);
      usernamePasswordToken0.clear();
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      usernamePasswordToken0.setInetAddress(inetAddress0);
      usernamePasswordToken0.setRememberMe(false);
      usernamePasswordToken0.toString();
      char[] charArray1 = new char[8];
      charArray1[0] = '2';
      charArray1[1] = '6';
      charArray1[2] = '6';
      charArray1[3] = '6';
      charArray1[4] = '6';
      charArray1[5] = '2';
      charArray1[6] = '2';
      charArray1[7] = '2';
      usernamePasswordToken0.setPassword(charArray1);
      usernamePasswordToken0.getUsername();
      usernamePasswordToken0.getUsername();
      usernamePasswordToken0.toString();
      usernamePasswordToken0.clear();
      usernamePasswordToken0.getInetAddress();
      usernamePasswordToken0.getInetAddress();
      usernamePasswordToken0.getInetAddress();
      usernamePasswordToken0.setUsername((String) null);
      usernamePasswordToken0.getCredentials();
      usernamePasswordToken0.setInetAddress((InetAddress) null);
      usernamePasswordToken0.getInetAddress();
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.getUsername();
      usernamePasswordToken0.isRememberMe();
      usernamePasswordToken0.setRememberMe(false);
      assertArrayEquals(new char[] {'\u0000', '\u0000'}, charArray0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      usernamePasswordToken0.getPassword();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.395908119293929
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getByName("");
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", "", false, inetAddress0);
      usernamePasswordToken0.clear();
      usernamePasswordToken0.clear();
      usernamePasswordToken0.getInetAddress();
      usernamePasswordToken0.toString();
      usernamePasswordToken0.isRememberMe();
      usernamePasswordToken0.setInetAddress(inetAddress0);
      usernamePasswordToken0.setInetAddress(inetAddress0);
      usernamePasswordToken0.isRememberMe();
      usernamePasswordToken0.setRememberMe(false);
      usernamePasswordToken0.setUsername("");
      usernamePasswordToken0.toString();
      String string0 = usernamePasswordToken0.toString();
      assertEquals("org.jsecurity.authc.UsernamePasswordToken - , rememberMe=false (/127.0.0.1)", string0);
      
      usernamePasswordToken0.getUsername();
      usernamePasswordToken0.clear();
      usernamePasswordToken0.clear();
      usernamePasswordToken0.setUsername("");
      usernamePasswordToken0.getInetAddress();
      usernamePasswordToken0.getPrincipal();
      usernamePasswordToken0.setInetAddress(inetAddress0);
      char[] charArray0 = new char[6];
      charArray0[0] = '}';
      charArray0[1] = 'i';
      charArray0[2] = 'O';
      charArray0[3] = 'F';
      charArray0[4] = 'D';
      charArray0[5] = 'r';
      usernamePasswordToken0.setPassword(charArray0);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("~jDr%'4[T", "~jDr%'4[T");
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      char[] charArray0 = new char[9];
      charArray0[0] = ';';
      charArray0[1] = 'p';
      charArray0[2] = '<';
      charArray0[3] = '9';
      charArray0[4] = '[';
      charArray0[5] = '>';
      charArray0[6] = 'g';
      charArray0[7] = '';
      charArray0[8] = 's';
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", charArray0);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken((String) null, (String) null, false, inetAddress0);
      usernamePasswordToken0.setInetAddress(inetAddress0);
      usernamePasswordToken0.isRememberMe();
      usernamePasswordToken0.clear();
      usernamePasswordToken0.setPassword((char[]) null);
      usernamePasswordToken0.getPassword();
      usernamePasswordToken0.getPrincipal();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken((String) null, (String) null, false);
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte) (-15);
      try { 
        MockInetAddress.getByAddress(byteArray0);
        fail("Expecting exception: UnknownHostException");
      
      } catch(UnknownHostException e) {
         //
         // Not IPv4: [0, 0, 0, 0, -15]
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockInetAddress", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.9730014063936125
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("w<", "w<", inetAddress0);
      usernamePasswordToken0.clear();
      usernamePasswordToken0.getCredentials();
      usernamePasswordToken0.setUsername("");
      char[] charArray0 = new char[7];
      charArray0[0] = 'N';
      charArray0[1] = 'd';
      charArray0[2] = 'b';
      charArray0[3] = 'y';
      charArray0[4] = '@';
      charArray0[5] = '\'';
      charArray0[6] = ',';
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.setRememberMe(true);
      assertTrue(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.4410152780267027
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("Uw]1$j[|oVl3VaP1", (String) null);
      usernamePasswordToken0.setUsername("org.jsecurity.authc.UsernamePasswordToken");
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      usernamePasswordToken0.setInetAddress(inetAddress0);
      usernamePasswordToken0.isRememberMe();
      usernamePasswordToken0.setUsername((String) null);
      usernamePasswordToken0.toString();
      char[] charArray0 = new char[0];
      InetAddress inetAddress1 = MockInetAddress.anyLocalAddress();
      usernamePasswordToken0.setInetAddress(inetAddress1);
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.setUsername("Uw]1$j[|oVl3VaP1");
      usernamePasswordToken0.setRememberMe(true);
      usernamePasswordToken0.setInetAddress(inetAddress1);
      usernamePasswordToken0.setUsername("rNI1F8u)DO&");
      usernamePasswordToken0.setInetAddress(inetAddress0);
      usernamePasswordToken0.getPassword();
      usernamePasswordToken0.setRememberMe(false);
      usernamePasswordToken0.getPrincipal();
      usernamePasswordToken0.clear();
      usernamePasswordToken0.toString();
      usernamePasswordToken0.getPrincipal();
      usernamePasswordToken0.getUsername();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }
}
