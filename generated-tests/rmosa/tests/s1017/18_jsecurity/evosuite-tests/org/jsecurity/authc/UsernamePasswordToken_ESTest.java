/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 13:15:03 GMT 2018
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      usernamePasswordToken0.setRememberMe(false);
      byte[] byteArray0 = new byte[0];
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

  /**
  //Test case number: 1
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      usernamePasswordToken0.clear();
      usernamePasswordToken0.setUsername("");
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      char[] charArray0 = new char[6];
      charArray0[0] = 'l';
      charArray0[1] = '7';
      charArray0[2] = 'C';
      charArray0[3] = 's';
      charArray0[4] = 'm';
      charArray0[5] = 'h';
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("7e}TSird", charArray0, false);
      String string0 = usernamePasswordToken0.toString();
      assertEquals("org.jsecurity.authc.UsernamePasswordToken - 7e}TSird, rememberMe=false", string0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      char[] charArray0 = new char[9];
      charArray0[0] = '0';
      charArray0[1] = ' ';
      charArray0[2] = 'N';
      charArray0[3] = '#';
      charArray0[4] = '0';
      charArray0[5] = '-';
      charArray0[6] = '=';
      charArray0[7] = '9';
      charArray0[8] = '';
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", charArray0, false);
      usernamePasswordToken0.getPassword();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("1`O/", "GsAO-v<TNKSJ?ldmf", true);
      String string0 = usernamePasswordToken0.toString();
      assertEquals("org.jsecurity.authc.UsernamePasswordToken - 1`O/, rememberMe=true", string0);
      
      InetAddress inetAddress0 = MockInetAddress.getByName("1`O/");
      usernamePasswordToken0.setRememberMe(true);
      char[] charArray0 = new char[0];
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.setInetAddress(inetAddress0);
      usernamePasswordToken0.getUsername();
      usernamePasswordToken0.getCredentials();
      assertTrue(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      char[] charArray0 = new char[3];
      charArray0[0] = 'G';
      charArray0[1] = 'v';
      charArray0[2] = 'F';
      usernamePasswordToken0.setPassword(charArray0);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken((String) null, "");
      usernamePasswordToken0.clear();
      usernamePasswordToken0.toString();
      char[] charArray0 = new char[4];
      charArray0[0] = '&';
      charArray0[1] = 'W';
      charArray0[2] = '^';
      charArray0[3] = '8';
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.setRememberMe(true);
      usernamePasswordToken0.toString();
      usernamePasswordToken0.isRememberMe();
      usernamePasswordToken0.getInetAddress();
      assertTrue(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("z)sYzt!5pB&*$W", "");
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      usernamePasswordToken0.setInetAddress(inetAddress0);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      usernamePasswordToken0.toString();
      String string0 = usernamePasswordToken0.toString();
      assertEquals("org.jsecurity.authc.UsernamePasswordToken - null, rememberMe=false", string0);
      
      usernamePasswordToken0.clear();
      usernamePasswordToken0.getInetAddress();
      usernamePasswordToken0.getUsername();
      usernamePasswordToken0.getInetAddress();
      String string1 = usernamePasswordToken0.toString();
      assertEquals("org.jsecurity.authc.UsernamePasswordToken - null, rememberMe=false", string1);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("E1F;^$uJ6Qffr", "=O*");
      usernamePasswordToken0.clear();
      usernamePasswordToken0.setRememberMe(true);
      usernamePasswordToken0.getUsername();
      assertTrue(usernamePasswordToken0.isRememberMe());
      
      usernamePasswordToken0.clear();
      usernamePasswordToken0.clear();
      usernamePasswordToken0.getUsername();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
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
  //Test case number: 11
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      char[] charArray0 = new char[8];
      charArray0[0] = 'f';
      charArray0[1] = 'q';
      charArray0[2] = '\\';
      charArray0[3] = 'y';
      charArray0[4] = ' ';
      charArray0[5] = '_';
      charArray0[6] = 'E';
      charArray0[7] = 'd';
      InetAddress inetAddress0 = MockInetAddress.getByName("");
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", charArray0, inetAddress0);
      usernamePasswordToken0.toString();
      usernamePasswordToken0.setUsername("");
      usernamePasswordToken0.clear();
      char[] charArray1 = new char[6];
      charArray1[0] = 'f';
      charArray1[1] = 'E';
      charArray1[2] = 'y';
      charArray1[3] = '_';
      charArray1[4] = 'f';
      charArray1[5] = 'f';
      usernamePasswordToken0.setPassword(charArray1);
      usernamePasswordToken0.setRememberMe(false);
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.setRememberMe(true);
      char[] charArray2 = usernamePasswordToken0.getPassword();
      usernamePasswordToken0.setPassword(charArray2);
      usernamePasswordToken0.clear();
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", "", true, inetAddress0);
      usernamePasswordToken0.getInetAddress();
      assertTrue(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      char[] charArray0 = new char[8];
      charArray0[0] = 'i';
      charArray0[1] = 'B';
      charArray0[2] = 'a';
      charArray0[3] = 's';
      charArray0[4] = '-';
      charArray0[5] = 'y';
      charArray0[6] = 'I';
      charArray0[7] = 's';
      InetAddress inetAddress0 = MockInetAddress.getByName("");
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken(".Ynz;}d`/hC+", charArray0, true, inetAddress0);
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.setInetAddress(inetAddress0);
      usernamePasswordToken0.toString();
      usernamePasswordToken0.setRememberMe(true);
      usernamePasswordToken0.setUsername(".Ynz;}d`/hC+");
      usernamePasswordToken0.clear();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
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
  //Test case number: 15
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
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
  //Test case number: 16
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
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
