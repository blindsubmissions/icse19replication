/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 15:02:07 GMT 2018
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
  public void test0()  throws Throwable  {
      char[] charArray0 = new char[7];
      charArray0[0] = 'y';
      charArray0[1] = '#';
      charArray0[2] = ' ';
      charArray0[3] = 's';
      charArray0[4] = 'B';
      charArray0[5] = '&';
      charArray0[6] = 'i';
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("r45_Ruks|DMzE=", charArray0);
      usernamePasswordToken0.getPrincipal();
      usernamePasswordToken0.getUsername();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = 'A';
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("#yby$o*i6\"w>", charArray0, inetAddress0);
      usernamePasswordToken0.setPassword(charArray0);
      InetAddress inetAddress1 = usernamePasswordToken0.getInetAddress();
      usernamePasswordToken0.setUsername("");
      usernamePasswordToken0.setInetAddress(inetAddress1);
      usernamePasswordToken0.getUsername();
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.setInetAddress(inetAddress0);
      usernamePasswordToken0.clear();
      usernamePasswordToken0.setInetAddress(inetAddress1);
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.isRememberMe();
      usernamePasswordToken0.getUsername();
      usernamePasswordToken0.getPassword();
      usernamePasswordToken0.getPrincipal();
      usernamePasswordToken0.setUsername("");
      usernamePasswordToken0.getUsername();
      usernamePasswordToken0.getInetAddress();
      usernamePasswordToken0.getPrincipal();
      usernamePasswordToken0.getPassword();
      usernamePasswordToken0.setInetAddress(inetAddress0);
      usernamePasswordToken0.setRememberMe(false);
      usernamePasswordToken0.getPassword();
      usernamePasswordToken0.isRememberMe();
      usernamePasswordToken0.isRememberMe();
      usernamePasswordToken0.toString();
      usernamePasswordToken0.getPassword();
      assertArrayEquals(new char[] {'\u0000'}, charArray0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      usernamePasswordToken0.setInetAddress(inetAddress0);
      boolean boolean0 = usernamePasswordToken0.isRememberMe();
      assertFalse(boolean0);
      
      usernamePasswordToken0.getPrincipal();
      usernamePasswordToken0.getPassword();
      usernamePasswordToken0.getCredentials();
      usernamePasswordToken0.getInetAddress();
      usernamePasswordToken0.setPassword((char[]) null);
      usernamePasswordToken0.setRememberMe(false);
      usernamePasswordToken0.getUsername();
      usernamePasswordToken0.setUsername((String) null);
      usernamePasswordToken0.getCredentials();
      String string0 = usernamePasswordToken0.toString();
      assertEquals("org.jsecurity.authc.UsernamePasswordToken - null, rememberMe=false (/192.168.1.42)", string0);
      
      usernamePasswordToken0.getPassword();
      usernamePasswordToken0.setUsername((String) null);
      usernamePasswordToken0.setPassword((char[]) null);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken((String) null, "mx7L\fm?{", true, inetAddress0);
      char[] charArray0 = new char[4];
      charArray0[0] = 'q';
      charArray0[1] = 'i';
      charArray0[2] = '}';
      charArray0[3] = 'K';
      usernamePasswordToken0.setPassword(charArray0);
      assertTrue(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = 'k';
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", charArray0, true);
      usernamePasswordToken0.clear();
      usernamePasswordToken0.getUsername();
      usernamePasswordToken0.toString();
      usernamePasswordToken0.clear();
      usernamePasswordToken0.clear();
      usernamePasswordToken0.toString();
      usernamePasswordToken0.setUsername("");
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      usernamePasswordToken0.setInetAddress(inetAddress0);
      usernamePasswordToken0.clear();
      usernamePasswordToken0.setRememberMe(false);
      usernamePasswordToken0.setUsername("");
      usernamePasswordToken0.getInetAddress();
      assertArrayEquals(new char[] {'\u0000'}, charArray0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.5810937501718239
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("&Y", "&Y", true);
      usernamePasswordToken0.setRememberMe(false);
      usernamePasswordToken0.setUsername(";(Y6(i{Sw9mn79{b");
      char[] charArray0 = new char[7];
      usernamePasswordToken0.setUsername("&Y");
      charArray0[0] = 'H';
      charArray0[1] = 'O';
      usernamePasswordToken0.setUsername("&Y");
      charArray0[2] = '(';
      usernamePasswordToken0.setUsername("<P1oYkalC.AXF");
      usernamePasswordToken0.setRememberMe(false);
      charArray0[3] = 'C';
      charArray0[4] = 'u';
      charArray0[5] = 'm';
      charArray0[6] = '<';
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.clear();
      usernamePasswordToken0.clear();
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.setPassword(charArray0);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.8310204811135165
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", "");
      char[] charArray0 = new char[7];
      charArray0[0] = '%';
      charArray0[1] = '>';
      usernamePasswordToken0.setRememberMe(false);
      charArray0[2] = 'T';
      charArray0[3] = 'h';
      charArray0[4] = 'z';
      charArray0[5] = '';
      charArray0[6] = 'C';
      usernamePasswordToken0.setRememberMe(true);
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.getCredentials();
      usernamePasswordToken0.clear();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken((String) null, (String) null, inetAddress0);
      usernamePasswordToken0.setUsername("[L_1\"!1Jt");
      usernamePasswordToken0.getUsername();
      char[] charArray0 = new char[3];
      charArray0[0] = 'w';
      charArray0[1] = 'Y';
      usernamePasswordToken0.setPassword(charArray0);
      charArray0[2] = '`';
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.getPassword();
      usernamePasswordToken0.getInetAddress();
      usernamePasswordToken0.setRememberMe(false);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", (String) null);
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)1;
      byteArray0[1] = (byte)0;
      try { 
        MockInetAddress.getByAddress("", byteArray0);
        fail("Expecting exception: UnknownHostException");
      
      } catch(UnknownHostException e) {
         //
         // Not IPv4: [1, 0]
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockInetAddress", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.5070264355574188
  */
  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", "", inetAddress0);
      usernamePasswordToken0.setInetAddress(inetAddress0);
      usernamePasswordToken0.clear();
      usernamePasswordToken0.getCredentials();
      usernamePasswordToken0.getInetAddress();
      usernamePasswordToken0.getInetAddress();
      usernamePasswordToken0.setUsername("^9KS_lj@#g[W");
      char[] charArray0 = new char[1];
      usernamePasswordToken0.setInetAddress((InetAddress) null);
      charArray0[0] = 'S';
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.setInetAddress(inetAddress0);
      usernamePasswordToken0.clear();
      usernamePasswordToken0.setRememberMe(false);
      usernamePasswordToken0.setRememberMe(true);
      usernamePasswordToken0.toString();
      usernamePasswordToken0.getInetAddress();
      usernamePasswordToken0.getPassword();
      usernamePasswordToken0.setInetAddress((InetAddress) null);
      usernamePasswordToken0.setUsername("");
      usernamePasswordToken0.getPrincipal();
      usernamePasswordToken0.isRememberMe();
      usernamePasswordToken0.clear();
      usernamePasswordToken0.getInetAddress();
      usernamePasswordToken0.setPassword(charArray0);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }
}