/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 12:50:48 GMT 2018
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
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      char[] charArray0 = new char[6];
      charArray0[0] = 'D';
      charArray0[1] = 'X';
      charArray0[2] = 'g';
      charArray0[3] = 'D';
      charArray0[4] = 't';
      charArray0[5] = 'q';
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", charArray0, inetAddress0);
      usernamePasswordToken0.toString();
      usernamePasswordToken0.getUsername();
      usernamePasswordToken0.setRememberMe(true);
      usernamePasswordToken0.setRememberMe(true);
      usernamePasswordToken0.setInetAddress(inetAddress0);
      usernamePasswordToken0.getUsername();
      usernamePasswordToken0.toString();
      usernamePasswordToken0.toString();
      usernamePasswordToken0.setRememberMe(true);
      usernamePasswordToken0.clear();
      usernamePasswordToken0.setRememberMe(true);
      usernamePasswordToken0.toString();
      usernamePasswordToken0.getPassword();
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
      assertTrue(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("C{5y-0bqp]", "C{5y-0bqp]");
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-1);
      byteArray0[1] = (byte)70;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)82;
      InetAddress inetAddress0 = MockInetAddress.getByAddress("C{5y-0bqp]", byteArray0);
      usernamePasswordToken0.setInetAddress(inetAddress0);
      String string0 = usernamePasswordToken0.toString();
      assertEquals("org.jsecurity.authc.UsernamePasswordToken - C{5y-0bqp], rememberMe=false (C{5y-0bqp]/255.70.0.82)", string0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", "", true);
      char[] charArray0 = new char[5];
      charArray0[0] = '_';
      charArray0[1] = 'f';
      usernamePasswordToken0.setPassword(charArray0);
      charArray0[2] = 'Z';
      String string0 = usernamePasswordToken0.toString();
      assertEquals("org.jsecurity.authc.UsernamePasswordToken - , rememberMe=true", string0);
      
      charArray0[3] = 'g';
      charArray0[4] = 'S';
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.isRememberMe();
      usernamePasswordToken0.setUsername("");
      assertTrue(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.7478680974667573
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("fyEyS:n", "", false, inetAddress0);
      usernamePasswordToken0.setUsername("fyEyS:n");
      usernamePasswordToken0.getUsername();
      char[] charArray0 = new char[4];
      charArray0[0] = 'k';
      charArray0[1] = 'Q';
      charArray0[2] = 'R';
      usernamePasswordToken0.clear();
      charArray0[3] = ';';
      usernamePasswordToken0.setPassword(charArray0);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      usernamePasswordToken0.setInetAddress((InetAddress) null);
      usernamePasswordToken0.setUsername("");
      usernamePasswordToken0.getPassword();
      boolean boolean0 = usernamePasswordToken0.isRememberMe();
      assertFalse(boolean0);
      
      usernamePasswordToken0.setPassword((char[]) null);
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      usernamePasswordToken0.setInetAddress(inetAddress0);
      InetAddress inetAddress1 = usernamePasswordToken0.getInetAddress();
      usernamePasswordToken0.setPassword((char[]) null);
      usernamePasswordToken0.getCredentials();
      usernamePasswordToken0.getPrincipal();
      usernamePasswordToken0.setInetAddress((InetAddress) null);
      usernamePasswordToken0.setPassword((char[]) null);
      usernamePasswordToken0.getCredentials();
      usernamePasswordToken0.setInetAddress(inetAddress1);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = 'n';
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", charArray0);
      usernamePasswordToken0.toString();
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      usernamePasswordToken0.setInetAddress(inetAddress0);
      usernamePasswordToken0.getPassword();
      usernamePasswordToken0.isRememberMe();
      usernamePasswordToken0.getPassword();
      usernamePasswordToken0.getUsername();
      usernamePasswordToken0.setUsername("')1];cvF[v");
      InetAddress inetAddress1 = usernamePasswordToken0.getInetAddress();
      usernamePasswordToken0.setInetAddress(inetAddress1);
      usernamePasswordToken0.setInetAddress(inetAddress1);
      usernamePasswordToken0.getPassword();
      usernamePasswordToken0.toString();
      usernamePasswordToken0.getInetAddress();
      usernamePasswordToken0.setUsername("org.jsecurity.authc.UsernamePasswordToken - ')1];cvF[v, rememberMe=false (/192.168.1.42)");
      usernamePasswordToken0.clear();
      usernamePasswordToken0.toString();
      usernamePasswordToken0.clear();
      InetAddress inetAddress2 = MockInetAddress.getByName("urC$#Sx? -@\"O^!$jz");
      usernamePasswordToken0.setInetAddress(inetAddress2);
      usernamePasswordToken0.isRememberMe();
      usernamePasswordToken0.setInetAddress(inetAddress0);
      usernamePasswordToken0.getPassword();
      usernamePasswordToken0.getPassword();
      assertArrayEquals(new char[] {'\u0000'}, charArray0);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = 'p';
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", charArray0, false);
      char[] charArray1 = new char[6];
      charArray1[0] = 'p';
      charArray1[1] = 'p';
      charArray1[2] = 'p';
      charArray1[3] = 'p';
      usernamePasswordToken0.setRememberMe(false);
      charArray1[4] = 'p';
      usernamePasswordToken0.toString();
      charArray1[5] = 'p';
      usernamePasswordToken0.setPassword(charArray1);
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      usernamePasswordToken0.setInetAddress(inetAddress0);
      usernamePasswordToken0.setRememberMe(false);
      usernamePasswordToken0.toString();
      usernamePasswordToken0.setRememberMe(false);
      usernamePasswordToken0.getPassword();
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.toString();
      usernamePasswordToken0.setUsername("");
      usernamePasswordToken0.isRememberMe();
      usernamePasswordToken0.toString();
      usernamePasswordToken0.setUsername("");
      usernamePasswordToken0.toString();
      usernamePasswordToken0.clear();
      usernamePasswordToken0.getInetAddress();
      usernamePasswordToken0.getCredentials();
      assertArrayEquals(new char[] {'\u0000'}, charArray0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("37Pu\"Utz**H;~", "37Pu\"Utz**H;~", inetAddress0);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }
}