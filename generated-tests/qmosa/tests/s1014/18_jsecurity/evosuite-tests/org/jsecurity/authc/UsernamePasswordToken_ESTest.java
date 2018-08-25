/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 13:12:22 GMT 2018
 */

package org.jsecurity.authc;

import org.junit.Test;
import static org.junit.Assert.*;
import java.net.InetAddress;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.jsecurity.authc.UsernamePasswordToken;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UsernamePasswordToken_ESTest extends UsernamePasswordToken_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("(BtGA.@V~y-IK6z{", "(BtGA.@V~y-IK6z{");
      char[] charArray0 = new char[1];
      charArray0[0] = '0';
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.setRememberMe(true);
      usernamePasswordToken0.getInetAddress();
      usernamePasswordToken0.toString();
      assertTrue(usernamePasswordToken0.isRememberMe());
      
      usernamePasswordToken0.clear();
      usernamePasswordToken0.toString();
      usernamePasswordToken0.getCredentials();
      usernamePasswordToken0.setUsername("");
      char[] charArray1 = new char[1];
      charArray1[0] = '.';
      usernamePasswordToken0.setPassword(charArray1);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = 'a';
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", charArray0, true);
      usernamePasswordToken0.setUsername("");
      usernamePasswordToken0.setRememberMe(true);
      usernamePasswordToken0.setUsername("");
      usernamePasswordToken0.getCredentials();
      usernamePasswordToken0.setRememberMe(true);
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.setRememberMe(true);
      usernamePasswordToken0.getUsername();
      usernamePasswordToken0.setUsername("");
      usernamePasswordToken0.isRememberMe();
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.setUsername("");
      usernamePasswordToken0.setUsername((String) null);
      usernamePasswordToken0.setUsername((String) null);
      usernamePasswordToken0.setRememberMe(true);
      usernamePasswordToken0.getUsername();
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.getPassword();
      char[] charArray1 = new char[0];
      usernamePasswordToken0.setPassword(charArray1);
      usernamePasswordToken0.getPrincipal();
      usernamePasswordToken0.getPrincipal();
      usernamePasswordToken0.getInetAddress();
      String string0 = usernamePasswordToken0.toString();
      assertTrue(usernamePasswordToken0.isRememberMe());
      assertEquals("org.jsecurity.authc.UsernamePasswordToken - null, rememberMe=true", string0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", "", inetAddress0);
      usernamePasswordToken0.setUsername("");
      usernamePasswordToken0.getPassword();
      usernamePasswordToken0.getPrincipal();
      usernamePasswordToken0.setRememberMe(true);
      usernamePasswordToken0.setUsername("Z2Dw:eRQ");
      usernamePasswordToken0.clear();
      usernamePasswordToken0.getCredentials();
      usernamePasswordToken0.setRememberMe(true);
      usernamePasswordToken0.getPassword();
      usernamePasswordToken0.getInetAddress();
      usernamePasswordToken0.setInetAddress(inetAddress0);
      usernamePasswordToken0.clear();
      usernamePasswordToken0.setRememberMe(true);
      usernamePasswordToken0.isRememberMe();
      usernamePasswordToken0.getUsername();
      usernamePasswordToken0.getUsername();
      usernamePasswordToken0.getUsername();
      usernamePasswordToken0.setPassword((char[]) null);
      usernamePasswordToken0.getInetAddress();
      usernamePasswordToken0.getInetAddress();
      assertTrue(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      char[] charArray0 = new char[4];
      charArray0[0] = 'J';
      charArray0[1] = 'U';
      charArray0[2] = ',';
      charArray0[3] = 'A';
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("=RIHuGM?=Y/`IefSU", charArray0);
      assertFalse(usernamePasswordToken0.isRememberMe());
      
      usernamePasswordToken0.setRememberMe(true);
      usernamePasswordToken0.toString();
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      usernamePasswordToken0.toString();
      usernamePasswordToken0.setInetAddress(inetAddress0);
      usernamePasswordToken0.setUsername("");
      usernamePasswordToken0.toString();
      usernamePasswordToken0.getUsername();
      usernamePasswordToken0.getPrincipal();
      usernamePasswordToken0.setRememberMe(true);
      usernamePasswordToken0.setRememberMe(true);
      usernamePasswordToken0.getCredentials();
      usernamePasswordToken0.isRememberMe();
      usernamePasswordToken0.setUsername("");
      usernamePasswordToken0.isRememberMe();
      usernamePasswordToken0.toString();
      assertTrue(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      usernamePasswordToken0.setUsername("('.rvzO");
      char[] charArray0 = new char[0];
      usernamePasswordToken0.setPassword(charArray0);
      InetAddress inetAddress0 = MockInetAddress.getByName("('.rvzO");
      usernamePasswordToken0.setUsername("('.rvzO");
      usernamePasswordToken0.setInetAddress(inetAddress0);
      usernamePasswordToken0.clear();
      usernamePasswordToken0.getInetAddress();
      usernamePasswordToken0.setInetAddress((InetAddress) null);
      char[] charArray1 = usernamePasswordToken0.getPassword();
      assertNull(charArray1);
      
      usernamePasswordToken0.setPassword((char[]) null);
      usernamePasswordToken0.setUsername("('.rvzO");
      usernamePasswordToken0.setRememberMe(false);
      usernamePasswordToken0.getUsername();
      usernamePasswordToken0.getCredentials();
      usernamePasswordToken0.getCredentials();
      usernamePasswordToken0.getUsername();
      usernamePasswordToken0.setInetAddress((InetAddress) null);
      usernamePasswordToken0.setInetAddress((InetAddress) null);
      usernamePasswordToken0.getInetAddress();
      usernamePasswordToken0.setInetAddress((InetAddress) null);
      usernamePasswordToken0.getCredentials();
      usernamePasswordToken0.getPrincipal();
      usernamePasswordToken0.getPassword();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.893788232391138
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("Zko9z>+U}{~~d", "Zko9z>+U}{~~d", false);
      usernamePasswordToken0.clear();
      usernamePasswordToken0.getPrincipal();
      usernamePasswordToken0.clear();
      usernamePasswordToken0.setRememberMe(false);
      usernamePasswordToken0.isRememberMe();
      usernamePasswordToken0.setUsername("");
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken((String) null, (String) null, false);
      usernamePasswordToken0.setUsername("yH/,[dp[38M");
      usernamePasswordToken0.clear();
      usernamePasswordToken0.setUsername(".$\"/8'GDbXi(r`>@hH");
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      usernamePasswordToken0.setInetAddress(inetAddress0);
      usernamePasswordToken0.clear();
      usernamePasswordToken0.setUsername((String) null);
      String string0 = usernamePasswordToken0.toString();
      assertEquals("org.jsecurity.authc.UsernamePasswordToken - null, rememberMe=false", string0);
      
      usernamePasswordToken0.getPassword();
      usernamePasswordToken0.getCredentials();
      usernamePasswordToken0.setUsername("");
      usernamePasswordToken0.getInetAddress();
      usernamePasswordToken0.setInetAddress(inetAddress0);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.0982737395252498
  */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("Dk", "", true, inetAddress0);
      usernamePasswordToken0.clear();
      usernamePasswordToken0.setInetAddress(inetAddress0);
      usernamePasswordToken0.setRememberMe(true);
      usernamePasswordToken0.isRememberMe();
      usernamePasswordToken0.toString();
      usernamePasswordToken0.clear();
      usernamePasswordToken0.setRememberMe(true);
      usernamePasswordToken0.setRememberMe(true);
      usernamePasswordToken0.setRememberMe(false);
      usernamePasswordToken0.setRememberMe(true);
      InetAddress inetAddress1 = MockInetAddress.getByName("r8^o9PTmZ2ER)~\"b");
      usernamePasswordToken0.setInetAddress(inetAddress1);
      usernamePasswordToken0.getCredentials();
      usernamePasswordToken0.getCredentials();
      usernamePasswordToken0.setInetAddress(inetAddress0);
      usernamePasswordToken0.getPassword();
      usernamePasswordToken0.clear();
      usernamePasswordToken0.setInetAddress(inetAddress1);
      usernamePasswordToken0.setInetAddress(inetAddress1);
      usernamePasswordToken0.setInetAddress(inetAddress1);
      usernamePasswordToken0.setRememberMe(true);
      assertTrue(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken((String) null, (char[]) null, inetAddress0);
      String string0 = usernamePasswordToken0.toString();
      assertEquals("org.jsecurity.authc.UsernamePasswordToken - null, rememberMe=false (/192.168.1.42)", string0);
      
      InetAddress inetAddress1 = MockInetAddress.getLocalHost();
      usernamePasswordToken0.setInetAddress(inetAddress1);
      usernamePasswordToken0.setInetAddress(inetAddress0);
      usernamePasswordToken0.isRememberMe();
      usernamePasswordToken0.setInetAddress(inetAddress1);
      usernamePasswordToken0.clear();
      String string1 = usernamePasswordToken0.toString();
      assertEquals("org.jsecurity.authc.UsernamePasswordToken - null, rememberMe=false", string1);
      
      usernamePasswordToken0.getPrincipal();
      usernamePasswordToken0.setPassword((char[]) null);
      usernamePasswordToken0.getUsername();
      char[] charArray0 = new char[9];
      charArray0[0] = '%';
      charArray0[1] = 'N';
      charArray0[2] = 'E';
      charArray0[3] = '7';
      charArray0[4] = '[';
      charArray0[5] = 'P';
      charArray0[6] = 'H';
      charArray0[7] = '*';
      charArray0[8] = 'd';
      usernamePasswordToken0.setPassword(charArray0);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", (String) null);
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      usernamePasswordToken0.setInetAddress(inetAddress0);
      String string0 = usernamePasswordToken0.toString();
      assertEquals("org.jsecurity.authc.UsernamePasswordToken - , rememberMe=false (/192.168.1.42)", string0);
      
      usernamePasswordToken0.setRememberMe(false);
      usernamePasswordToken0.clear();
      usernamePasswordToken0.getCredentials();
      usernamePasswordToken0.setInetAddress(inetAddress0);
      usernamePasswordToken0.setUsername(" - ");
      usernamePasswordToken0.getPassword();
      usernamePasswordToken0.getPrincipal();
      usernamePasswordToken0.clear();
      usernamePasswordToken0.setInetAddress(inetAddress0);
      usernamePasswordToken0.getPassword();
      usernamePasswordToken0.getUsername();
      usernamePasswordToken0.setUsername("org.jsecurity.authc.UsernamePasswordToken - , rememberMe=false (/192.168.1.42)");
      usernamePasswordToken0.setPassword((char[]) null);
      usernamePasswordToken0.setRememberMe(false);
      usernamePasswordToken0.setUsername((String) null);
      usernamePasswordToken0.setPassword((char[]) null);
      usernamePasswordToken0.isRememberMe();
      usernamePasswordToken0.clear();
      usernamePasswordToken0.setInetAddress(inetAddress0);
      usernamePasswordToken0.getPrincipal();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }
}