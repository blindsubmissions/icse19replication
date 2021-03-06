/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 06:39:33 GMT 2018
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
      char[] charArray0 = new char[7];
      charArray0[0] = '\\';
      charArray0[1] = 'q';
      charArray0[2] = '';
      charArray0[3] = '+';
      charArray0[4] = '1';
      charArray0[5] = 'H';
      charArray0[6] = '}';
      InetAddress inetAddress0 = MockInetAddress.getByName("");
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", charArray0, inetAddress0);
      assertFalse(usernamePasswordToken0.isRememberMe());
      
      usernamePasswordToken0.setRememberMe(true);
      assertTrue(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[0] = '.';
      charArray0[1] = ' ';
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("f}0(dA_:X.Kl5JW')q", charArray0, inetAddress0);
      usernamePasswordToken0.setInetAddress(inetAddress0);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken((String) null, "o#8W+h/y_BG*N=O");
      usernamePasswordToken0.getPrincipal();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      char[] charArray0 = new char[4];
      charArray0[0] = ':';
      charArray0[1] = 'a';
      charArray0[2] = 'l';
      charArray0[3] = 'f';
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken(" =)!o_", charArray0, true);
      usernamePasswordToken0.clear();
      usernamePasswordToken0.getCredentials();
      usernamePasswordToken0.getPassword();
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      char[] charArray0 = new char[7];
      charArray0[0] = '9';
      charArray0[1] = 'S';
      charArray0[2] = 'y';
      charArray0[3] = 'p';
      charArray0[4] = 'A';
      charArray0[5] = '+';
      charArray0[6] = '^';
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", charArray0);
      usernamePasswordToken0.setUsername("7+h#6/F{O|cF@t^^");
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      usernamePasswordToken0.getUsername();
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)7;
      byteArray0[1] = (byte) (-89);
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte) (-29);
      byteArray0[5] = (byte)108;
      try { 
        MockInetAddress.getByAddress(byteArray0);
        fail("Expecting exception: UnknownHostException");
      
      } catch(UnknownHostException e) {
         //
         // Not IPv4: [7, -89, 0, 0, -29, 108]
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockInetAddress", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-2);
      byteArray0[1] = (byte) (-1);
      byteArray0[2] = (byte) (-105);
      byteArray0[3] = (byte) (-3);
      InetAddress inetAddress0 = MockInetAddress.getByAddress("", byteArray0);
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", "3lhc98CW}H", inetAddress0);
      boolean boolean0 = usernamePasswordToken0.isRememberMe();
      assertFalse(boolean0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("R'}", (char[]) null, false, (InetAddress) null);
      usernamePasswordToken0.setRememberMe(false);
      usernamePasswordToken0.setRememberMe(true);
      usernamePasswordToken0.getUsername();
      usernamePasswordToken0.clear();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      String string0 = usernamePasswordToken0.toString();
      assertEquals("org.jsecurity.authc.UsernamePasswordToken - null, rememberMe=false", string0);
      
      char[] charArray0 = new char[0];
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.setUsername("");
      usernamePasswordToken0.getPassword();
      boolean boolean0 = usernamePasswordToken0.isRememberMe();
      assertFalse(boolean0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", "", false, inetAddress0);
      usernamePasswordToken0.getUsername();
      char[] charArray0 = new char[7];
      charArray0[0] = 'j';
      charArray0[1] = '^';
      charArray0[2] = '1';
      charArray0[3] = '';
      charArray0[4] = '_';
      charArray0[5] = 'n';
      charArray0[6] = 'I';
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.setInetAddress(inetAddress0);
      usernamePasswordToken0.getPrincipal();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = 'S';
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("X09@qGx", charArray0);
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.clear();
      usernamePasswordToken0.toString();
      usernamePasswordToken0.clear();
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.getInetAddress();
      usernamePasswordToken0.setPassword(charArray0);
      assertArrayEquals(new char[] {'\u0000'}, charArray0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      char[] charArray0 = new char[8];
      charArray0[0] = 'S';
      charArray0[1] = 'T';
      charArray0[2] = '$';
      charArray0[3] = 'p';
      charArray0[4] = '`';
      charArray0[5] = '8';
      charArray0[6] = '>';
      charArray0[7] = 'Z';
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("org.jsecurity.authc.UsernamePasswordToken", charArray0, inetAddress0);
      String string0 = usernamePasswordToken0.toString();
      assertEquals("org.jsecurity.authc.UsernamePasswordToken - org.jsecurity.authc.UsernamePasswordToken, rememberMe=false (/192.168.1.42)", string0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken(" - ", " - ", false);
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      char[] charArray0 = new char[8];
      charArray0[0] = ')';
      charArray0[1] = 'k';
      charArray0[2] = '(';
      charArray0[3] = '<';
      charArray0[4] = '7';
      charArray0[5] = 'S';
      charArray0[6] = '7';
      usernamePasswordToken0.setInetAddress(inetAddress0);
      charArray0[7] = 'A';
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.setInetAddress(inetAddress0);
      usernamePasswordToken0.getCredentials();
      usernamePasswordToken0.getInetAddress();
      usernamePasswordToken0.getInetAddress();
      usernamePasswordToken0.getInetAddress();
      usernamePasswordToken0.getPassword();
      usernamePasswordToken0.getUsername();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", "");
      usernamePasswordToken0.getPassword();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", (String) null, true, inetAddress0);
      usernamePasswordToken0.setUsername("");
      String string0 = usernamePasswordToken0.toString();
      assertEquals("org.jsecurity.authc.UsernamePasswordToken - , rememberMe=true (/192.168.1.42)", string0);
  }
}
