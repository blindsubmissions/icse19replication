/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 17:05:43 GMT 2018
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
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("<^C<Cb", "<^C<Cb");
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      usernamePasswordToken0.toString();
      String string0 = usernamePasswordToken0.toString();
      assertEquals("org.jsecurity.authc.UsernamePasswordToken - null, rememberMe=false", string0);
      
      char[] charArray0 = new char[4];
      charArray0[0] = '\\';
      charArray0[1] = 'm';
      charArray0[2] = '7';
      charArray0[3] = 'U';
      usernamePasswordToken0.setPassword(charArray0);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken(", rememberMe=", "", false, (InetAddress) null);
      usernamePasswordToken0.setUsername("");
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      char[] charArray0 = new char[3];
      charArray0[0] = ';';
      charArray0[1] = 'y';
      charArray0[2] = 'k';
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken(" (", charArray0);
      usernamePasswordToken0.clear();
      usernamePasswordToken0.clear();
      usernamePasswordToken0.getPassword();
      usernamePasswordToken0.clear();
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000'}, charArray0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken(" $Fq44ZtD", " $Fq44ZtD", inetAddress0);
      char[] charArray0 = new char[5];
      charArray0[0] = '\'';
      charArray0[1] = 'W';
      charArray0[2] = '-';
      charArray0[3] = 'c';
      charArray0[4] = '\\';
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.getCredentials();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      char[] charArray0 = new char[7];
      charArray0[0] = '`';
      charArray0[1] = 'W';
      charArray0[2] = '?';
      charArray0[3] = 'L';
      charArray0[4] = '[';
      charArray0[5] = '\'';
      charArray0[6] = '+';
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", charArray0, false);
      boolean boolean0 = usernamePasswordToken0.isRememberMe();
      assertFalse(boolean0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken((String) null, "", true);
      usernamePasswordToken0.setUsername("");
      String string0 = usernamePasswordToken0.toString();
      assertEquals("org.jsecurity.authc.UsernamePasswordToken - , rememberMe=true", string0);
      
      usernamePasswordToken0.setUsername("");
      usernamePasswordToken0.setRememberMe(true);
      usernamePasswordToken0.setUsername("");
      String string1 = usernamePasswordToken0.toString();
      assertEquals("org.jsecurity.authc.UsernamePasswordToken - , rememberMe=true", string1);
      
      usernamePasswordToken0.getCredentials();
      usernamePasswordToken0.getPassword();
      boolean boolean0 = usernamePasswordToken0.isRememberMe();
      assertTrue(boolean0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken(" - ", " - ", (InetAddress) null);
      char[] charArray0 = new char[4];
      charArray0[0] = '1';
      charArray0[1] = '<';
      charArray0[2] = 'u';
      charArray0[3] = 'F';
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.setUsername(" - ");
      usernamePasswordToken0.getInetAddress();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("~8NJRz,KAHG!|q6U", "Q", inetAddress0);
      usernamePasswordToken0.getInetAddress();
      String string0 = usernamePasswordToken0.toString();
      assertEquals("org.jsecurity.authc.UsernamePasswordToken - ~8NJRz,KAHG!|q6U, rememberMe=false (/192.168.1.42)", string0);
      
      usernamePasswordToken0.clear();
      usernamePasswordToken0.isRememberMe();
      usernamePasswordToken0.getUsername();
      char[] charArray0 = new char[0];
      usernamePasswordToken0.setPassword(charArray0);
      String string1 = usernamePasswordToken0.toString();
      assertEquals("org.jsecurity.authc.UsernamePasswordToken - null, rememberMe=false", string1);
      
      usernamePasswordToken0.getUsername();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      char[] charArray0 = new char[3];
      charArray0[0] = 'c';
      charArray0[1] = 'C';
      charArray0[2] = 'N';
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", charArray0, false);
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      usernamePasswordToken0.setInetAddress(inetAddress0);
      String string0 = usernamePasswordToken0.toString();
      assertEquals("org.jsecurity.authc.UsernamePasswordToken - , rememberMe=false (/192.168.1.42)", string0);
      
      usernamePasswordToken0.setUsername("");
      usernamePasswordToken0.setRememberMe(false);
      usernamePasswordToken0.getPrincipal();
      usernamePasswordToken0.getUsername();
      usernamePasswordToken0.getPrincipal();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = '/';
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", charArray0, inetAddress0);
      usernamePasswordToken0.setInetAddress(inetAddress0);
      usernamePasswordToken0.clear();
      usernamePasswordToken0.toString();
      usernamePasswordToken0.getInetAddress();
      usernamePasswordToken0.clear();
      usernamePasswordToken0.toString();
      usernamePasswordToken0.clear();
      usernamePasswordToken0.toString();
      usernamePasswordToken0.getPrincipal();
      usernamePasswordToken0.getPassword();
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.setInetAddress(inetAddress0);
      usernamePasswordToken0.clear();
      usernamePasswordToken0.setRememberMe(true);
      boolean boolean0 = usernamePasswordToken0.isRememberMe();
      assertTrue(boolean0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken((String) null, (String) null);
      char[] charArray0 = new char[1];
      usernamePasswordToken0.setRememberMe(true);
      usernamePasswordToken0.toString();
      charArray0[0] = 'C';
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.getPrincipal();
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      usernamePasswordToken0.setInetAddress(inetAddress0);
      usernamePasswordToken0.toString();
      char[] charArray1 = usernamePasswordToken0.getPassword();
      usernamePasswordToken0.clear();
      usernamePasswordToken0.getInetAddress();
      usernamePasswordToken0.getCredentials();
      usernamePasswordToken0.getPassword();
      usernamePasswordToken0.setPassword(charArray1);
      usernamePasswordToken0.setUsername("");
      usernamePasswordToken0.toString();
      usernamePasswordToken0.setPassword(charArray0);
      assertArrayEquals(new char[] {'\u0000'}, charArray0);
      
      usernamePasswordToken0.getUsername();
      usernamePasswordToken0.getUsername();
      usernamePasswordToken0.getPrincipal();
      usernamePasswordToken0.getUsername();
      usernamePasswordToken0.toString();
      usernamePasswordToken0.isRememberMe();
      usernamePasswordToken0.getCredentials();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      boolean boolean0 = true;
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken(")PXz-", (String) null, true);
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-82);
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)56;
      byteArray0[4] = (byte)78;
      byteArray0[5] = (byte)88;
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte)84;
      byteArray0[8] = (byte) (-1);
      try { 
        MockInetAddress.getByAddress("", byteArray0);
        fail("Expecting exception: UnknownHostException");
      
      } catch(UnknownHostException e) {
         //
         // Not IPv4: [-82, 0, 0, 56, 78, 88, 0, 84, -1]
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockInetAddress", e);
      }
  }
}
