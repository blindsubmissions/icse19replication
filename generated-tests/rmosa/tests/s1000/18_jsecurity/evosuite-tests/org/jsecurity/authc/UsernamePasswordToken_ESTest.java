/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 04:36:57 GMT 2018
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
      char[] charArray0 = new char[0];
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.setUsername((String) null);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
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
  //Test case number: 2
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", "", inetAddress0);
      assertFalse(usernamePasswordToken0.isRememberMe());
      
      usernamePasswordToken0.setRememberMe(true);
      usernamePasswordToken0.isRememberMe();
      char[] charArray0 = new char[7];
      charArray0[0] = '0';
      charArray0[1] = '5';
      charArray0[2] = '3';
      charArray0[3] = '(';
      charArray0[4] = ':';
      charArray0[5] = 'l';
      charArray0[6] = 'F';
      usernamePasswordToken0.setPassword(charArray0);
      assertTrue(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", "C!", true);
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      usernamePasswordToken0.setInetAddress(inetAddress0);
      usernamePasswordToken0.setInetAddress((InetAddress) null);
      usernamePasswordToken0.setUsername("");
      usernamePasswordToken0.setRememberMe(true);
      usernamePasswordToken0.isRememberMe();
      usernamePasswordToken0.setUsername("");
      assertTrue(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      char[] charArray0 = new char[8];
      charArray0[0] = '<';
      charArray0[1] = 'd';
      charArray0[2] = '_';
      charArray0[3] = 'r';
      charArray0[4] = '6';
      charArray0[5] = ' ';
      charArray0[6] = 'g';
      charArray0[7] = 'G';
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("ZmB/;.nu0", charArray0);
      usernamePasswordToken0.getCredentials();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      char[] charArray0 = new char[7];
      charArray0[0] = '?';
      charArray0[1] = '7';
      charArray0[2] = 'Y';
      charArray0[3] = 'N';
      charArray0[4] = '3';
      charArray0[5] = '-';
      charArray0[6] = '/';
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("|B7vq`t_N>\"", charArray0);
      usernamePasswordToken0.getPrincipal();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("z}0W@P<,c", "7F)JIN_Y|nIJ", false);
      usernamePasswordToken0.getUsername();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      usernamePasswordToken0.toString();
      usernamePasswordToken0.getUsername();
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)1;
      byteArray0[1] = (byte) (-62);
      byteArray0[2] = (byte)94;
      byteArray0[3] = (byte) (-64);
      byteArray0[4] = (byte) (-1);
      try { 
        MockInetAddress.getByAddress("KgdQV6fr^y&1'SA", byteArray0);
        fail("Expecting exception: UnknownHostException");
      
      } catch(UnknownHostException e) {
         //
         // Not IPv4: [1, -62, 94, -64, -1]
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockInetAddress", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", "fd", true, inetAddress0);
      usernamePasswordToken0.getPrincipal();
      String string0 = usernamePasswordToken0.toString();
      assertEquals("org.jsecurity.authc.UsernamePasswordToken - , rememberMe=true (/192.168.1.42)", string0);
      
      usernamePasswordToken0.getInetAddress();
      usernamePasswordToken0.getPrincipal();
      assertTrue(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("x/xk,jH.E", " (");
      usernamePasswordToken0.setUsername("x/xk,jH.E");
      usernamePasswordToken0.getUsername();
      usernamePasswordToken0.isRememberMe();
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)1;
      byteArray0[1] = (byte)1;
      byteArray0[2] = (byte) (-44);
      try { 
        MockInetAddress.getByAddress(byteArray0);
        fail("Expecting exception: UnknownHostException");
      
      } catch(UnknownHostException e) {
         //
         // Not IPv4: [1, 1, -44]
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockInetAddress", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      char[] charArray0 = new char[8];
      charArray0[0] = '6';
      charArray0[1] = 'E';
      charArray0[2] = 'm';
      charArray0[3] = '\"';
      charArray0[4] = ']';
      charArray0[5] = '.';
      charArray0[6] = '8';
      charArray0[7] = '!';
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", charArray0, inetAddress0);
      usernamePasswordToken0.getUsername();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
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
