/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 09:34:52 GMT 2018
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
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      usernamePasswordToken0.getPrincipal();
      InetAddress inetAddress0 = MockInetAddress.getByName("27QON8");
      usernamePasswordToken0.clear();
      usernamePasswordToken0.setInetAddress(inetAddress0);
      String string0 = usernamePasswordToken0.toString();
      assertEquals("org.jsecurity.authc.UsernamePasswordToken - null, rememberMe=false (27QON8/200.42.42.0)", string0);
      
      usernamePasswordToken0.isRememberMe();
      usernamePasswordToken0.setUsername(">*@`iBrF");
      usernamePasswordToken0.setInetAddress(inetAddress0);
      usernamePasswordToken0.setUsername((String) null);
      InetAddress inetAddress1 = usernamePasswordToken0.getInetAddress();
      InetAddress inetAddress2 = usernamePasswordToken0.getInetAddress();
      usernamePasswordToken0.getPassword();
      usernamePasswordToken0.setInetAddress(inetAddress1);
      usernamePasswordToken0.setPassword((char[]) null);
      usernamePasswordToken0.getInetAddress();
      usernamePasswordToken0.isRememberMe();
      usernamePasswordToken0.clear();
      usernamePasswordToken0.getPassword();
      usernamePasswordToken0.setPassword((char[]) null);
      usernamePasswordToken0.setInetAddress(inetAddress2);
      usernamePasswordToken0.isRememberMe();
      usernamePasswordToken0.getInetAddress();
      usernamePasswordToken0.clear();
      usernamePasswordToken0.clear();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken((String) null, (String) null);
      char[] charArray0 = new char[2];
      charArray0[0] = 'Z';
      charArray0[1] = 'z';
      usernamePasswordToken0.setPassword(charArray0);
      assertFalse(usernamePasswordToken0.isRememberMe());
      
      usernamePasswordToken0.setRememberMe(true);
      assertTrue(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", (char[]) null, false);
      usernamePasswordToken0.setRememberMe(false);
      usernamePasswordToken0.toString();
      usernamePasswordToken0.setRememberMe(true);
      usernamePasswordToken0.getCredentials();
      usernamePasswordToken0.setUsername("");
      usernamePasswordToken0.clear();
      usernamePasswordToken0.setUsername("org.jsecurity.authc.UsernamePasswordToken - , rememberMe=false");
      usernamePasswordToken0.setPassword((char[]) null);
      usernamePasswordToken0.setUsername((String) null);
      usernamePasswordToken0.setPassword((char[]) null);
      usernamePasswordToken0.setPassword((char[]) null);
      usernamePasswordToken0.getInetAddress();
      usernamePasswordToken0.setInetAddress((InetAddress) null);
      usernamePasswordToken0.isRememberMe();
      usernamePasswordToken0.clear();
      usernamePasswordToken0.getInetAddress();
      usernamePasswordToken0.isRememberMe();
      usernamePasswordToken0.setUsername("IRbKG'&6@HvPHk");
      usernamePasswordToken0.setInetAddress((InetAddress) null);
      usernamePasswordToken0.getUsername();
      usernamePasswordToken0.getPassword();
      usernamePasswordToken0.toString();
      usernamePasswordToken0.setUsername("(nZ");
      usernamePasswordToken0.isRememberMe();
      usernamePasswordToken0.getInetAddress();
      usernamePasswordToken0.isRememberMe();
      usernamePasswordToken0.clear();
      usernamePasswordToken0.setPassword((char[]) null);
      usernamePasswordToken0.getCredentials();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      char[] charArray0 = new char[6];
      charArray0[0] = '5';
      charArray0[1] = '\'';
      charArray0[2] = '%';
      charArray0[3] = ']';
      charArray0[4] = 'R';
      charArray0[5] = '^';
      InetAddress inetAddress0 = MockInetAddress.getByName("`8");
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("(.~", charArray0, inetAddress0);
      usernamePasswordToken0.toString();
      usernamePasswordToken0.setUsername("");
      usernamePasswordToken0.setRememberMe(false);
      usernamePasswordToken0.getPrincipal();
      usernamePasswordToken0.toString();
      usernamePasswordToken0.getInetAddress();
      usernamePasswordToken0.clear();
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.getUsername();
      usernamePasswordToken0.getInetAddress();
      usernamePasswordToken0.getPrincipal();
      char[] charArray1 = usernamePasswordToken0.getPassword();
      usernamePasswordToken0.isRememberMe();
      usernamePasswordToken0.getInetAddress();
      usernamePasswordToken0.getPrincipal();
      usernamePasswordToken0.setInetAddress((InetAddress) null);
      usernamePasswordToken0.getInetAddress();
      usernamePasswordToken0.setPassword(charArray1);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      char[] charArray0 = new char[4];
      charArray0[0] = '*';
      charArray0[1] = 'E';
      charArray0[2] = 'H';
      charArray0[3] = '<';
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", charArray0);
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.getPrincipal();
      usernamePasswordToken0.getCredentials();
      usernamePasswordToken0.getInetAddress();
      usernamePasswordToken0.setUsername("");
      usernamePasswordToken0.setInetAddress((InetAddress) null);
      usernamePasswordToken0.isRememberMe();
      usernamePasswordToken0.setInetAddress((InetAddress) null);
      usernamePasswordToken0.getUsername();
      usernamePasswordToken0.setInetAddress((InetAddress) null);
      usernamePasswordToken0.setRememberMe(false);
      usernamePasswordToken0.clear();
      usernamePasswordToken0.getPassword();
      usernamePasswordToken0.getCredentials();
      usernamePasswordToken0.setRememberMe(false);
      usernamePasswordToken0.setRememberMe(true);
      assertTrue(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", (String) null, false, inetAddress0);
      usernamePasswordToken0.setInetAddress(inetAddress0);
      usernamePasswordToken0.getPrincipal();
      usernamePasswordToken0.setUsername("");
      String string0 = usernamePasswordToken0.toString();
      assertEquals("org.jsecurity.authc.UsernamePasswordToken - , rememberMe=false (/127.0.0.1)", string0);
      
      usernamePasswordToken0.getPrincipal();
      usernamePasswordToken0.getPassword();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = ", rememberMe=";
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken(", rememberMe=", ", rememberMe=", false);
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)45;
      byteArray0[1] = (byte) (-1);
      try { 
        MockInetAddress.getByAddress(byteArray0);
        fail("Expecting exception: UnknownHostException");
      
      } catch(UnknownHostException e) {
         //
         // Not IPv4: [45, -1]
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockInetAddress", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.0982737395252498
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("wL:Z", "J}tOj3+ftP.8Q^^");
      char[] charArray0 = new char[2];
      charArray0[0] = '-';
      charArray0[1] = 'a';
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.setRememberMe(false);
      usernamePasswordToken0.setInetAddress((InetAddress) null);
      usernamePasswordToken0.isRememberMe();
      usernamePasswordToken0.clear();
      usernamePasswordToken0.setRememberMe(true);
      usernamePasswordToken0.getUsername();
      usernamePasswordToken0.isRememberMe();
      char[] charArray1 = new char[4];
      charArray1[0] = 'Z';
      charArray1[1] = '?';
      usernamePasswordToken0.setPassword(charArray1);
      charArray1[2] = 'k';
      charArray1[3] = '>';
      usernamePasswordToken0.setPassword(charArray1);
      usernamePasswordToken0.setInetAddress((InetAddress) null);
      usernamePasswordToken0.getUsername();
      usernamePasswordToken0.clear();
      usernamePasswordToken0.setUsername("J}tOj3+ftP.8Q^^");
      usernamePasswordToken0.setInetAddress((InetAddress) null);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", "", false, inetAddress0);
      usernamePasswordToken0.getUsername();
      String string0 = usernamePasswordToken0.toString();
      assertEquals("org.jsecurity.authc.UsernamePasswordToken - , rememberMe=false (/127.0.0.1)", string0);
      
      char[] charArray0 = new char[0];
      usernamePasswordToken0.setPassword(charArray0);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken((String) null, (String) null, inetAddress0);
      String string0 = usernamePasswordToken0.toString();
      assertEquals("org.jsecurity.authc.UsernamePasswordToken - null, rememberMe=false (/192.168.1.42)", string0);
      
      usernamePasswordToken0.getUsername();
      usernamePasswordToken0.clear();
      char[] charArray0 = new char[7];
      charArray0[0] = 'F';
      charArray0[1] = 'f';
      charArray0[2] = 'H';
      charArray0[3] = '}';
      charArray0[4] = '\'';
      charArray0[5] = '9';
      charArray0[6] = '*';
      usernamePasswordToken0.setPassword(charArray0);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", (String) null, false);
      usernamePasswordToken0.toString();
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
}
