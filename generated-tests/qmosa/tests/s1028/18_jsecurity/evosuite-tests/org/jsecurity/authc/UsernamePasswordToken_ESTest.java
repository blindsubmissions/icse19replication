/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 17:24:21 GMT 2018
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
      char[] charArray0 = new char[0];
      boolean boolean0 = true;
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken((String) null, charArray0, true);
      byte[] byteArray0 = new byte[7];
      usernamePasswordToken0.setRememberMe(true);
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-32);
      String string0 = null;
      InetAddress inetAddress0 = MockInetAddress.getByName((String) null);
      usernamePasswordToken0.setInetAddress(inetAddress0);
      byteArray0[2] = (byte) (-58);
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte)40;
      byteArray0[6] = (byte)42;
      try { 
        MockInetAddress.getByAddress((String) null, byteArray0);
        fail("Expecting exception: UnknownHostException");
      
      } catch(UnknownHostException e) {
         //
         // Not IPv4: [0, -32, -58, 0, 0, 40, 42]
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockInetAddress", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte) (-125);
      InetAddress inetAddress0 = MockInetAddress.getByAddress(" - ", byteArray0);
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken(" - ", " - ", inetAddress0);
      usernamePasswordToken0.setUsername(" - ");
      usernamePasswordToken0.getInetAddress();
      usernamePasswordToken0.setPassword((char[]) null);
      usernamePasswordToken0.getInetAddress();
      usernamePasswordToken0.clear();
      usernamePasswordToken0.getPrincipal();
      usernamePasswordToken0.getCredentials();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken(";ORtF,x=&Y7@", ";ORtF,x=&Y7@", false);
      usernamePasswordToken0.clear();
      usernamePasswordToken0.clear();
      usernamePasswordToken0.setRememberMe(false);
      usernamePasswordToken0.setUsername("xKW{,FG=WQB%n");
      usernamePasswordToken0.isRememberMe();
      char[] charArray0 = new char[3];
      charArray0[0] = 'A';
      charArray0[1] = '~';
      charArray0[2] = '4';
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.getCredentials();
      usernamePasswordToken0.clear();
      usernamePasswordToken0.getCredentials();
      usernamePasswordToken0.getPrincipal();
      usernamePasswordToken0.setUsername(";ORtF,x=&Y7@");
      usernamePasswordToken0.getUsername();
      usernamePasswordToken0.setUsername("xKW{,FG=WQB%n");
      usernamePasswordToken0.getUsername();
      usernamePasswordToken0.toString();
      usernamePasswordToken0.setUsername(";ORtF,x=&Y7@");
      usernamePasswordToken0.setUsername("xKW{,FG=WQB%n");
      usernamePasswordToken0.getPrincipal();
      usernamePasswordToken0.toString();
      usernamePasswordToken0.isRememberMe();
      usernamePasswordToken0.clear();
      usernamePasswordToken0.toString();
      usernamePasswordToken0.setPassword(charArray0);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000'}, charArray0);
      
      usernamePasswordToken0.getInetAddress();
      usernamePasswordToken0.getPrincipal();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      char[] charArray0 = new char[9];
      charArray0[0] = 'A';
      charArray0[1] = 'K';
      charArray0[2] = 'N';
      charArray0[3] = '~';
      charArray0[4] = '.';
      charArray0[5] = '0';
      charArray0[6] = 's';
      charArray0[7] = '~';
      charArray0[8] = 'V';
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("org.jsecurity.authc.UsernamePasswordToken", charArray0);
      usernamePasswordToken0.getPrincipal();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      char[] charArray0 = new char[7];
      charArray0[0] = '?';
      charArray0[1] = ':';
      charArray0[2] = 'W';
      charArray0[3] = '4';
      charArray0[4] = 'w';
      charArray0[5] = 'N';
      charArray0[6] = '9';
      usernamePasswordToken0.setPassword(charArray0);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", "");
      char[] charArray0 = new char[5];
      charArray0[0] = 'J';
      charArray0[1] = 'W';
      charArray0[2] = 'A';
      charArray0[3] = '&';
      charArray0[4] = ':';
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.getInetAddress();
      usernamePasswordToken0.getCredentials();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.3693821196946767
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("|';M7)", "|';M7)", true);
      String string0 = usernamePasswordToken0.toString();
      assertEquals("org.jsecurity.authc.UsernamePasswordToken - |';M7), rememberMe=true", string0);
      
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      char[] charArray0 = new char[4];
      charArray0[0] = 'q';
      charArray0[1] = '`';
      charArray0[2] = 'G';
      charArray0[3] = '5';
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.setInetAddress(inetAddress0);
      usernamePasswordToken0.setRememberMe(true);
      usernamePasswordToken0.setRememberMe(true);
      usernamePasswordToken0.getPassword();
      usernamePasswordToken0.setUsername("org.jsecurity.authc.UsernamePasswordToken - |';M7), rememberMe=true");
      usernamePasswordToken0.isRememberMe();
      usernamePasswordToken0.setUsername("");
      usernamePasswordToken0.getUsername();
      String string1 = usernamePasswordToken0.toString();
      assertEquals("org.jsecurity.authc.UsernamePasswordToken - , rememberMe=true (/127.0.0.1)", string1);
      
      usernamePasswordToken0.getInetAddress();
      usernamePasswordToken0.getInetAddress();
      assertTrue(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.4260151319598084
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getByName((String) null);
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken((String) null, (String) null, inetAddress0);
      usernamePasswordToken0.getInetAddress();
      usernamePasswordToken0.toString();
      usernamePasswordToken0.getCredentials();
      char[] charArray0 = new char[4];
      charArray0[0] = 'I';
      charArray0[1] = '';
      charArray0[2] = 'j';
      charArray0[3] = '0';
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.getInetAddress();
      String string0 = usernamePasswordToken0.toString();
      assertEquals("org.jsecurity.authc.UsernamePasswordToken - null, rememberMe=false (/127.0.0.1)", string0);
      
      usernamePasswordToken0.setUsername("4(YM&(LRg]vR^8");
      usernamePasswordToken0.getUsername();
      usernamePasswordToken0.getCredentials();
      usernamePasswordToken0.clear();
      usernamePasswordToken0.getUsername();
      usernamePasswordToken0.getInetAddress();
      usernamePasswordToken0.isRememberMe();
      usernamePasswordToken0.setInetAddress(inetAddress0);
      usernamePasswordToken0.getPrincipal();
      usernamePasswordToken0.isRememberMe();
      usernamePasswordToken0.setInetAddress((InetAddress) null);
      boolean boolean0 = usernamePasswordToken0.isRememberMe();
      assertFalse(boolean0);
      
      usernamePasswordToken0.setUsername("org.jsecurity.authc.UsernamePasswordToken - null, rememberMe=false (/127.0.0.1)");
      usernamePasswordToken0.setUsername("4(YM&(LRg]vR^8");
      usernamePasswordToken0.clear();
      usernamePasswordToken0.getPrincipal();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken((String) null, (String) null, false, (InetAddress) null);
      usernamePasswordToken0.getPrincipal();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken(")", "", true, (InetAddress) null);
      usernamePasswordToken0.setInetAddress((InetAddress) null);
      usernamePasswordToken0.setInetAddress((InetAddress) null);
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      usernamePasswordToken0.setInetAddress(inetAddress0);
      char[] charArray0 = new char[9];
      charArray0[0] = 'H';
      charArray0[1] = '2';
      charArray0[2] = 'C';
      charArray0[3] = '8';
      charArray0[4] = '[';
      charArray0[5] = 'p';
      charArray0[6] = '<';
      charArray0[7] = 'A';
      charArray0[8] = 'q';
      usernamePasswordToken0.setPassword(charArray0);
      assertTrue(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.2718685126965625
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", (String) null);
      usernamePasswordToken0.clear();
      usernamePasswordToken0.getPassword();
      char[] charArray0 = new char[8];
      charArray0[0] = 'v';
      usernamePasswordToken0.toString();
      charArray0[1] = 'F';
      charArray0[2] = 'n';
      usernamePasswordToken0.clear();
      charArray0[3] = '-';
      charArray0[4] = '-';
      InetAddress inetAddress0 = MockInetAddress.getByName("TMIyC1szdDn=h~qC#");
      usernamePasswordToken0.setInetAddress(inetAddress0);
      charArray0[5] = 'm';
      charArray0[6] = 'g';
      charArray0[7] = '%';
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.isRememberMe();
      usernamePasswordToken0.isRememberMe();
      usernamePasswordToken0.setUsername("rqCfB");
      usernamePasswordToken0.getPassword();
      String string0 = usernamePasswordToken0.toString();
      assertEquals("org.jsecurity.authc.UsernamePasswordToken - rqCfB, rememberMe=false (TMIyC1szdDn=h~qC#/200.42.42.0)", string0);
      
      usernamePasswordToken0.getCredentials();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      char[] charArray0 = new char[4];
      charArray0[0] = '@';
      charArray0[1] = '(';
      charArray0[2] = '';
      charArray0[3] = 'B';
      InetAddress inetAddress0 = MockInetAddress.getByName("6YJO:/wq");
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("6YJO:/wq", charArray0, inetAddress0);
      usernamePasswordToken0.clear();
      usernamePasswordToken0.getInetAddress();
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }
}
