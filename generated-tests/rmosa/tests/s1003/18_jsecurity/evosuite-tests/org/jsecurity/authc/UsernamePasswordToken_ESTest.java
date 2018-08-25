/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 06:03:37 GMT 2018
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
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("#M.G'W2VH=", "#M.G'W2VH=", true);
      usernamePasswordToken0.setRememberMe(true);
      usernamePasswordToken0.isRememberMe();
      usernamePasswordToken0.setRememberMe(true);
      assertTrue(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("bZ", "bZ", inetAddress0);
      usernamePasswordToken0.getPrincipal();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[0] = '=';
      charArray0[1] = 'I';
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("G)9uy_e'KUK<", charArray0);
      usernamePasswordToken0.getPrincipal();
      usernamePasswordToken0.setRememberMe(false);
      usernamePasswordToken0.getInetAddress();
      usernamePasswordToken0.setRememberMe(true);
      usernamePasswordToken0.getInetAddress();
      usernamePasswordToken0.setPassword((char[]) null);
      assertTrue(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getByName("MVrv%9Yg6Qx~9C&");
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("MVrv%9Yg6Qx~9C&", (char[]) null, inetAddress0);
      String string0 = usernamePasswordToken0.toString();
      assertEquals("org.jsecurity.authc.UsernamePasswordToken - MVrv%9Yg6Qx~9C&, rememberMe=false (MVrv%9Yg6Qx~9C&/200.42.42.0)", string0);
      
      usernamePasswordToken0.setUsername(" - ");
      usernamePasswordToken0.clear();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", "");
      usernamePasswordToken0.clear();
      char[] charArray0 = new char[2];
      charArray0[0] = ']';
      usernamePasswordToken0.clear();
      charArray0[1] = 'w';
      usernamePasswordToken0.setPassword(charArray0);
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)120;
      byteArray0[1] = (byte)0;
      try { 
        MockInetAddress.getByAddress("", byteArray0);
        fail("Expecting exception: UnknownHostException");
      
      } catch(UnknownHostException e) {
         //
         // Not IPv4: [120, 0]
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockInetAddress", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("sTv8cJfMQ]:K}", "sTv8cJfMQ]:K}", true);
      char[] charArray0 = new char[7];
      charArray0[0] = '9';
      charArray0[1] = '3';
      charArray0[2] = '\"';
      charArray0[3] = '+';
      charArray0[4] = '@';
      charArray0[5] = '+';
      charArray0[6] = '=';
      usernamePasswordToken0.setPassword(charArray0);
      char[] charArray1 = new char[1];
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      usernamePasswordToken0.setInetAddress(inetAddress0);
      charArray1[0] = '_';
      usernamePasswordToken0.setPassword(charArray1);
      boolean boolean0 = usernamePasswordToken0.isRememberMe();
      assertTrue(boolean0);
      
      usernamePasswordToken0.getPassword();
      assertTrue(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[0] = '8';
      charArray0[1] = 'K';
      charArray0[2] = 'R';
      charArray0[3] = '^';
      charArray0[4] = '~';
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("iyJT>vnZSCKOZ8,7A-", charArray0);
      usernamePasswordToken0.clear();
      usernamePasswordToken0.getUsername();
      usernamePasswordToken0.clear();
      usernamePasswordToken0.setRememberMe(true);
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.setInetAddress((InetAddress) null);
      usernamePasswordToken0.setRememberMe(true);
      usernamePasswordToken0.getCredentials();
      usernamePasswordToken0.getUsername();
      usernamePasswordToken0.setRememberMe(true);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
      assertTrue(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", "", false, (InetAddress) null);
      usernamePasswordToken0.clear();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken((String) null, "", true);
      char[] charArray0 = new char[7];
      charArray0[0] = '.';
      charArray0[1] = '=';
      charArray0[2] = ')';
      charArray0[3] = 'W';
      charArray0[4] = 'l';
      charArray0[5] = 'v';
      charArray0[6] = '!';
      usernamePasswordToken0.setPassword(charArray0);
      String string0 = usernamePasswordToken0.toString();
      assertEquals("org.jsecurity.authc.UsernamePasswordToken - null, rememberMe=true", string0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", (String) null, true, inetAddress0);
      usernamePasswordToken0.toString();
      usernamePasswordToken0.toString();
      char[] charArray0 = new char[0];
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.setUsername((String) null);
      usernamePasswordToken0.setInetAddress(inetAddress0);
      usernamePasswordToken0.setUsername(")");
      usernamePasswordToken0.setInetAddress(inetAddress0);
      assertTrue(usernamePasswordToken0.isRememberMe());
      
      usernamePasswordToken0.clear();
      usernamePasswordToken0.setRememberMe(false);
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.toString();
      usernamePasswordToken0.setUsername((String) null);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      assertFalse(usernamePasswordToken0.isRememberMe());
      
      usernamePasswordToken0.setRememberMe(true);
      usernamePasswordToken0.toString();
      usernamePasswordToken0.getPrincipal();
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      usernamePasswordToken0.setInetAddress(inetAddress0);
      assertTrue(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken((String) null, (String) null);
      usernamePasswordToken0.setUsername((String) null);
      usernamePasswordToken0.setRememberMe(false);
      usernamePasswordToken0.toString();
      usernamePasswordToken0.setRememberMe(false);
      usernamePasswordToken0.setRememberMe(true);
      usernamePasswordToken0.getPrincipal();
      assertTrue(usernamePasswordToken0.isRememberMe());
  }
}
