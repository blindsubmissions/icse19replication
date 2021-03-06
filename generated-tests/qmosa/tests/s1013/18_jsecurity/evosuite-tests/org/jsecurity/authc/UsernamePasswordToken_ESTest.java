/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 13:01:25 GMT 2018
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
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      char[] charArray0 = new char[0];
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken(" (", charArray0, true);
      usernamePasswordToken0.toString();
      usernamePasswordToken0.setUsername(" (");
      boolean boolean0 = usernamePasswordToken0.isRememberMe();
      assertTrue(boolean0);
      
      usernamePasswordToken0.getPassword();
      usernamePasswordToken0.clear();
      usernamePasswordToken0.getPassword();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", "");
      char[] charArray0 = new char[3];
      charArray0[0] = '';
      charArray0[1] = '(';
      charArray0[2] = '*';
      usernamePasswordToken0.setPassword(charArray0);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      char[] charArray0 = new char[4];
      charArray0[0] = 't';
      charArray0[1] = 'h';
      charArray0[2] = 'l';
      charArray0[3] = 'o';
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", charArray0);
      usernamePasswordToken0.clear();
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.clear();
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.setUsername("");
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      char[] charArray0 = new char[3];
      charArray0[0] = '<';
      charArray0[1] = 'y';
      charArray0[2] = 'Q';
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken(")", charArray0, inetAddress0);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("n}d", "n}d", false);
      char[] charArray0 = new char[2];
      charArray0[0] = 'A';
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      usernamePasswordToken0.setInetAddress(inetAddress0);
      charArray0[1] = 'l';
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.getCredentials();
      usernamePasswordToken0.clear();
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)0;
      try { 
        MockInetAddress.getByAddress("n}d", byteArray0);
        fail("Expecting exception: UnknownHostException");
      
      } catch(UnknownHostException e) {
         //
         // Not IPv4: [0]
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockInetAddress", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("xt*nLR+;x~cGW:4[9", "", inetAddress0);
      usernamePasswordToken0.clear();
      char[] charArray0 = new char[3];
      charArray0[0] = 'r';
      charArray0[1] = '!';
      charArray0[2] = '\\';
      usernamePasswordToken0.setPassword(charArray0);
      char[] charArray1 = new char[1];
      usernamePasswordToken0.setInetAddress(inetAddress0);
      usernamePasswordToken0.setPassword(charArray1);
      charArray1[0] = 'u';
      usernamePasswordToken0.setPassword(charArray1);
      usernamePasswordToken0.setRememberMe(true);
      usernamePasswordToken0.toString();
      assertTrue(usernamePasswordToken0.isRememberMe());
      
      usernamePasswordToken0.clear();
      usernamePasswordToken0.setInetAddress(inetAddress0);
      usernamePasswordToken0.getInetAddress();
      usernamePasswordToken0.clear();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.0982737395252498
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken((String) null, (String) null, inetAddress0);
      char[] charArray0 = new char[5];
      charArray0[0] = 'V';
      charArray0[1] = 'W';
      charArray0[2] = 'P';
      charArray0[3] = ',';
      charArray0[4] = 'T';
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.setUsername("AT9^m#aDxdpT^-=zU;s");
      usernamePasswordToken0.clear();
      usernamePasswordToken0.setPassword(charArray0);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
      
      usernamePasswordToken0.setInetAddress(inetAddress0);
      usernamePasswordToken0.getInetAddress();
      usernamePasswordToken0.getCredentials();
      char[] charArray1 = usernamePasswordToken0.getPassword();
      usernamePasswordToken0.setPassword(charArray1);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray1);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      char[] charArray0 = new char[8];
      charArray0[0] = '!';
      charArray0[1] = 'D';
      charArray0[2] = '#';
      charArray0[3] = 'u';
      charArray0[4] = '~';
      charArray0[5] = 'p';
      charArray0[6] = 'y';
      charArray0[7] = 'F';
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", charArray0);
      usernamePasswordToken0.clear();
      usernamePasswordToken0.clear();
      usernamePasswordToken0.clear();
      usernamePasswordToken0.getPassword();
      usernamePasswordToken0.getUsername();
      usernamePasswordToken0.toString();
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      usernamePasswordToken0.setInetAddress(inetAddress0);
      usernamePasswordToken0.setRememberMe(false);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      usernamePasswordToken0.toString();
      usernamePasswordToken0.setRememberMe(true);
      usernamePasswordToken0.setRememberMe(true);
      usernamePasswordToken0.getInetAddress();
      usernamePasswordToken0.toString();
      usernamePasswordToken0.getUsername();
      usernamePasswordToken0.getPrincipal();
      usernamePasswordToken0.setRememberMe(false);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.3114234446919735
  */
  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getByName("cSH);D>w1V`l`L`>");
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("Y?As4H+2<f{3fy4Z7E0", "Y?As4H+2<f{3fy4Z7E0", true, inetAddress0);
      usernamePasswordToken0.setUsername("3oN;m");
      usernamePasswordToken0.getUsername();
      usernamePasswordToken0.getPassword();
      usernamePasswordToken0.getCredentials();
      usernamePasswordToken0.getInetAddress();
      char[] charArray0 = new char[0];
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.isRememberMe();
      usernamePasswordToken0.getCredentials();
      usernamePasswordToken0.getPassword();
      assertTrue(usernamePasswordToken0.isRememberMe());
      
      usernamePasswordToken0.clear();
      usernamePasswordToken0.clear();
      usernamePasswordToken0.setInetAddress(inetAddress0);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }
}
