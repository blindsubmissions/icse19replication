/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 09:34:51 GMT 2018
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
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[0] = 'U';
      charArray0[1] = ']';
      charArray0[2] = '4';
      charArray0[3] = 'R';
      charArray0[4] = 'J';
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", charArray0, false);
      usernamePasswordToken0.setUsername("Ux==`O/vI`ewm7");
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.clear();
      usernamePasswordToken0.clear();
      usernamePasswordToken0.setUsername("");
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", "", true);
      assertTrue(usernamePasswordToken0.isRememberMe());
      
      usernamePasswordToken0.clear();
      usernamePasswordToken0.setRememberMe(false);
      usernamePasswordToken0.setRememberMe(false);
      usernamePasswordToken0.setUsername("");
      usernamePasswordToken0.setRememberMe(false);
      InetAddress inetAddress0 = MockInetAddress.getByName((String) null);
      usernamePasswordToken0.setInetAddress(inetAddress0);
      usernamePasswordToken0.clear();
      usernamePasswordToken0.getPrincipal();
      usernamePasswordToken0.setUsername("");
      usernamePasswordToken0.getUsername();
      usernamePasswordToken0.setUsername("");
      usernamePasswordToken0.setUsername((String) null);
      usernamePasswordToken0.getCredentials();
      usernamePasswordToken0.getCredentials();
      usernamePasswordToken0.getPrincipal();
      char[] charArray0 = new char[6];
      charArray0[0] = 'Q';
      charArray0[1] = 'T';
      charArray0[2] = 'E';
      charArray0[3] = 'p';
      charArray0[4] = 'A';
      charArray0[5] = '}';
      usernamePasswordToken0.setPassword(charArray0);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.0982737395252498
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("LU", "LU", true);
      usernamePasswordToken0.clear();
      char[] charArray0 = new char[8];
      charArray0[0] = 'w';
      charArray0[1] = 'q';
      charArray0[2] = '9';
      charArray0[3] = '3';
      charArray0[4] = 'H';
      charArray0[5] = '9';
      charArray0[6] = 'l';
      charArray0[7] = '3';
      usernamePasswordToken0.setPassword(charArray0);
      assertFalse(usernamePasswordToken0.isRememberMe());
      
      usernamePasswordToken0.setRememberMe(true);
      usernamePasswordToken0.toString();
      usernamePasswordToken0.setInetAddress((InetAddress) null);
      usernamePasswordToken0.setUsername("LA@e");
      usernamePasswordToken0.setRememberMe(true);
      char[] charArray1 = usernamePasswordToken0.getPassword();
      usernamePasswordToken0.setUsername("LU");
      usernamePasswordToken0.toString();
      usernamePasswordToken0.setPassword(charArray1);
      assertTrue(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getByName("xi%=:_%&st:2J'~e");
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("xi%=:_%&st:2J'~e", "", false, inetAddress0);
      InetAddress inetAddress1 = usernamePasswordToken0.getInetAddress();
      char[] charArray0 = new char[1];
      charArray0[0] = 's';
      String string0 = usernamePasswordToken0.toString();
      assertEquals("org.jsecurity.authc.UsernamePasswordToken - xi%=:_%&st:2J'~e, rememberMe=false (xi%=:_%&st:2J'~e/200.42.42.0)", string0);
      
      usernamePasswordToken0.clear();
      usernamePasswordToken0.setInetAddress(inetAddress1);
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.getPassword();
      usernamePasswordToken0.setPassword(charArray0);
      char[] charArray1 = usernamePasswordToken0.getPassword();
      usernamePasswordToken0.getCredentials();
      usernamePasswordToken0.setPassword(charArray1);
      usernamePasswordToken0.getUsername();
      usernamePasswordToken0.getUsername();
      usernamePasswordToken0.setUsername("");
      usernamePasswordToken0.setInetAddress(inetAddress0);
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.setInetAddress(inetAddress1);
      usernamePasswordToken0.clear();
      usernamePasswordToken0.clear();
      usernamePasswordToken0.getPrincipal();
      usernamePasswordToken0.getCredentials();
      usernamePasswordToken0.setInetAddress(inetAddress1);
      usernamePasswordToken0.isRememberMe();
      usernamePasswordToken0.setRememberMe(false);
      usernamePasswordToken0.getPrincipal();
      Object object0 = usernamePasswordToken0.getCredentials();
      assertNull(object0);
      
      usernamePasswordToken0.clear();
      usernamePasswordToken0.getPrincipal();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      char[] charArray0 = new char[5];
      charArray0[0] = 'f';
      charArray0[1] = '{';
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)16;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)5;
      byteArray0[4] = (byte) (-82);
      byteArray0[5] = (byte)116;
      try { 
        MockInetAddress.getByAddress(byteArray0);
        fail("Expecting exception: UnknownHostException");
      
      } catch(UnknownHostException e) {
         //
         // Not IPv4: [0, 16, 0, 5, -82, 116]
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockInetAddress", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", "");
      InetAddress inetAddress0 = MockInetAddress.getByName((String) null);
      usernamePasswordToken0.setInetAddress(inetAddress0);
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-35);
      byteArray0[2] = (byte)82;
      byteArray0[3] = (byte)10;
      InetAddress inetAddress1 = MockInetAddress.getByAddress("Bh>Y6me", byteArray0);
      usernamePasswordToken0.setInetAddress(inetAddress1);
      usernamePasswordToken0.getCredentials();
      usernamePasswordToken0.getPrincipal();
      char[] charArray0 = new char[3];
      charArray0[0] = '\'';
      charArray0[1] = '9';
      charArray0[2] = '|';
      usernamePasswordToken0.setPassword(charArray0);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      char[] charArray0 = new char[3];
      charArray0[0] = 'z';
      charArray0[1] = 'T';
      charArray0[2] = '';
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", charArray0);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      char[] charArray0 = new char[3];
      charArray0[0] = ':';
      charArray0[1] = '2';
      charArray0[2] = ':';
      InetAddress inetAddress0 = MockInetAddress.getByName("org.jsecurity.authc.UsernamePasswordToken");
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("SY(z8^E@Q|;&sXo", charArray0, inetAddress0);
      InetAddress inetAddress1 = MockInetAddress.getLoopbackAddress();
      usernamePasswordToken0.setInetAddress(inetAddress1);
      usernamePasswordToken0.setRememberMe(true);
      usernamePasswordToken0.toString();
      usernamePasswordToken0.clear();
      usernamePasswordToken0.clear();
      char[] charArray1 = new char[0];
      usernamePasswordToken0.setPassword(charArray1);
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.getCredentials();
      usernamePasswordToken0.setRememberMe(false);
      usernamePasswordToken0.getPrincipal();
      usernamePasswordToken0.isRememberMe();
      usernamePasswordToken0.setRememberMe(false);
      usernamePasswordToken0.getPassword();
      usernamePasswordToken0.clear();
      usernamePasswordToken0.getPrincipal();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.893788232391138
  */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("0gxQe-_mZ", "0gxQe-_mZ", inetAddress0);
      usernamePasswordToken0.clear();
      usernamePasswordToken0.setRememberMe(false);
      usernamePasswordToken0.clear();
      usernamePasswordToken0.setRememberMe(false);
      usernamePasswordToken0.getCredentials();
      usernamePasswordToken0.setRememberMe(true);
      usernamePasswordToken0.getPrincipal();
      usernamePasswordToken0.getPassword();
      assertTrue(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.2718685126965625
  */
  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", (String) null, true, inetAddress0);
      usernamePasswordToken0.toString();
      assertTrue(usernamePasswordToken0.isRememberMe());
      
      usernamePasswordToken0.clear();
      usernamePasswordToken0.getUsername();
      usernamePasswordToken0.isRememberMe();
      usernamePasswordToken0.clear();
      usernamePasswordToken0.isRememberMe();
      usernamePasswordToken0.getInetAddress();
      usernamePasswordToken0.clear();
      usernamePasswordToken0.toString();
      usernamePasswordToken0.setUsername("1277q~X");
      usernamePasswordToken0.setRememberMe(false);
      char[] charArray0 = new char[4];
      charArray0[0] = '9';
      charArray0[1] = '\\';
      charArray0[2] = 'm';
      charArray0[3] = '?';
      usernamePasswordToken0.setPassword(charArray0);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }
}
