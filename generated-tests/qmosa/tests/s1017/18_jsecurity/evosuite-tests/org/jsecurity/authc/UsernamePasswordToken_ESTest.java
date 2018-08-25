/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 14:17:55 GMT 2018
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
  public void test0()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      usernamePasswordToken0.clear();
      usernamePasswordToken0.setUsername("");
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      char[] charArray0 = new char[7];
      charArray0[0] = 'e';
      charArray0[1] = '^';
      charArray0[2] = 'a';
      charArray0[3] = 'k';
      charArray0[4] = '8';
      charArray0[5] = '}';
      charArray0[6] = 'W';
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("#Z&9#+FDLX&o", charArray0, false);
      char[] charArray1 = new char[6];
      charArray1[0] = 'W';
      charArray1[1] = 'a';
      charArray1[2] = 'E';
      charArray1[3] = '8';
      charArray1[4] = 'W';
      charArray1[5] = '^';
      usernamePasswordToken0.setPassword(charArray1);
      usernamePasswordToken0.setUsername("r&C^~1T\"dM+9 /");
      usernamePasswordToken0.setRememberMe(false);
      usernamePasswordToken0.setRememberMe(false);
      usernamePasswordToken0.isRememberMe();
      usernamePasswordToken0.setRememberMe(false);
      usernamePasswordToken0.toString();
      usernamePasswordToken0.setPassword(charArray0);
      String string0 = usernamePasswordToken0.toString();
      assertEquals("org.jsecurity.authc.UsernamePasswordToken - r&C^~1T\"dM+9 /, rememberMe=false", string0);
      
      usernamePasswordToken0.getCredentials();
      boolean boolean0 = usernamePasswordToken0.isRememberMe();
      assertFalse(boolean0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", "", true, (InetAddress) null);
      usernamePasswordToken0.setUsername("");
      char[] charArray0 = new char[4];
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.clear();
      charArray0[0] = '\\';
      usernamePasswordToken0.setInetAddress((InetAddress) null);
      charArray0[1] = 'c';
      charArray0[2] = '+';
      usernamePasswordToken0.setRememberMe(true);
      charArray0[3] = 'S';
      usernamePasswordToken0.setPassword(charArray0);
      char[] charArray1 = new char[0];
      usernamePasswordToken0.setPassword(charArray1);
      usernamePasswordToken0.getUsername();
      usernamePasswordToken0.setUsername("");
      usernamePasswordToken0.setRememberMe(true);
      usernamePasswordToken0.clear();
      usernamePasswordToken0.getCredentials();
      usernamePasswordToken0.isRememberMe();
      assertFalse(usernamePasswordToken0.isRememberMe());
      
      usernamePasswordToken0.setRememberMe(true);
      assertTrue(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("3W(iSjW,eSwyFsGQh", "3W(iSjW,eSwyFsGQh");
      usernamePasswordToken0.setRememberMe(false);
      char[] charArray0 = new char[3];
      usernamePasswordToken0.setRememberMe(true);
      charArray0[0] = '(';
      charArray0[1] = ']';
      charArray0[2] = '7';
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.clear();
      usernamePasswordToken0.clear();
      usernamePasswordToken0.setRememberMe(false);
      usernamePasswordToken0.clear();
      usernamePasswordToken0.clear();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("M,^P>dyHar", "wFPQBQZaXlom/_K", false);
      usernamePasswordToken0.setUsername("M,^P>dyHar");
      char[] charArray0 = new char[3];
      charArray0[0] = '^';
      charArray0[1] = ';';
      usernamePasswordToken0.toString();
      usernamePasswordToken0.toString();
      usernamePasswordToken0.setRememberMe(true);
      charArray0[2] = '_';
      usernamePasswordToken0.setPassword(charArray0);
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-60);
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte) (-1);
      byteArray0[4] = (byte)107;
      try { 
        MockInetAddress.getByAddress(byteArray0);
        fail("Expecting exception: UnknownHostException");
      
      } catch(UnknownHostException e) {
         //
         // Not IPv4: [0, -60, 0, -1, 107]
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockInetAddress", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      char[] charArray0 = new char[7];
      charArray0[0] = '&';
      charArray0[1] = 'x';
      charArray0[2] = 'd';
      charArray0[3] = 'k';
      charArray0[4] = '8';
      charArray0[5] = 'a';
      charArray0[6] = 'l';
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", charArray0, inetAddress0);
      usernamePasswordToken0.getInetAddress();
      InetAddress inetAddress1 = MockInetAddress.getLocalHost();
      usernamePasswordToken0.setInetAddress(inetAddress1);
      usernamePasswordToken0.clear();
      usernamePasswordToken0.getInetAddress();
      usernamePasswordToken0.setUsername("");
      usernamePasswordToken0.setInetAddress(inetAddress1);
      usernamePasswordToken0.setRememberMe(false);
      usernamePasswordToken0.getCredentials();
      usernamePasswordToken0.toString();
      usernamePasswordToken0.setRememberMe(false);
      usernamePasswordToken0.getCredentials();
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      char[] charArray0 = new char[3];
      charArray0[0] = '4';
      charArray0[1] = ']';
      charArray0[2] = 'T';
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", charArray0);
      usernamePasswordToken0.setUsername("");
      usernamePasswordToken0.setUsername("");
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.isRememberMe();
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.clear();
      usernamePasswordToken0.toString();
      usernamePasswordToken0.getUsername();
      usernamePasswordToken0.getPrincipal();
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000'}, charArray0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", "", inetAddress0);
      char[] charArray0 = new char[7];
      charArray0[0] = 'B';
      charArray0[1] = 'B';
      charArray0[2] = '6';
      charArray0[3] = 'w';
      charArray0[4] = 'E';
      charArray0[5] = 'E';
      charArray0[6] = '=';
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.getPassword();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("org.jsecurity.authc.UsernamePasswordToken", (String) null, true);
      char[] charArray0 = new char[1];
      charArray0[0] = ')';
      byte[] byteArray0 = new byte[0];
      InetAddress inetAddress0 = MockInetAddress.getByName((String) null);
      usernamePasswordToken0.setInetAddress(inetAddress0);
      try { 
        MockInetAddress.getByAddress(byteArray0);
        fail("Expecting exception: UnknownHostException");
      
      } catch(UnknownHostException e) {
         //
         // Not IPv4: []
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockInetAddress", e);
      }
  }
}