/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 10:23:59 GMT 2018
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
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      char[] charArray0 = new char[9];
      charArray0[0] = '[';
      charArray0[1] = '4';
      charArray0[2] = 'f';
      charArray0[3] = '{';
      charArray0[4] = '*';
      charArray0[5] = 'X';
      charArray0[6] = '~';
      charArray0[7] = 'o';
      charArray0[8] = '9';
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", charArray0, (InetAddress) null);
      usernamePasswordToken0.getInetAddress();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("37Pu\"Utz**H;~", "37Pu\"Utz**H;~", inetAddress0);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[0] = '%';
      charArray0[1] = 'V';
      charArray0[2] = 'c';
      charArray0[3] = '=';
      charArray0[4] = '<';
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", charArray0, true);
      usernamePasswordToken0.getPassword();
      assertTrue(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      usernamePasswordToken0.getPrincipal();
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)103;
      byteArray0[1] = (byte) (-63);
      byteArray0[2] = (byte)59;
      byteArray0[3] = (byte) (-62);
      InetAddress inetAddress0 = MockInetAddress.getByAddress("1&w:dp=i/S", byteArray0);
      usernamePasswordToken0.setInetAddress(inetAddress0);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
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
  //Test case number: 5
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      char[] charArray0 = new char[3];
      usernamePasswordToken0.toString();
      charArray0[0] = '&';
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.clear();
      charArray0[1] = ',';
      usernamePasswordToken0.clear();
      charArray0[2] = 'L';
      usernamePasswordToken0.setPassword(charArray0);
      InetAddress inetAddress0 = MockInetAddress.getByName("org.jsecurity.authc.UsernamePasswordToken - null, rememberMe=false");
      usernamePasswordToken0.setInetAddress(inetAddress0);
      usernamePasswordToken0.setRememberMe(true);
      usernamePasswordToken0.setRememberMe(true);
      assertTrue(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = '7';
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken(", rememberMe=", charArray0);
      usernamePasswordToken0.toString();
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.getUsername();
      String string0 = usernamePasswordToken0.toString();
      assertEquals("org.jsecurity.authc.UsernamePasswordToken - , rememberMe=, rememberMe=false", string0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
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
  //Test case number: 8
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      char[] charArray0 = new char[4];
      charArray0[0] = 'w';
      charArray0[1] = '{';
      charArray0[2] = 'W';
      charArray0[3] = '7';
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("Ih5\u0003rB", charArray0);
      usernamePasswordToken0.setUsername("Ih5\u0003rB");
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
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
  //Test case number: 10
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = '`';
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", charArray0);
      assertFalse(usernamePasswordToken0.isRememberMe());
      
      usernamePasswordToken0.setRememberMe(true);
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.setRememberMe(true);
      usernamePasswordToken0.getCredentials();
      usernamePasswordToken0.getInetAddress();
      usernamePasswordToken0.getPassword();
      usernamePasswordToken0.getPrincipal();
      usernamePasswordToken0.setRememberMe(true);
      usernamePasswordToken0.getInetAddress();
      assertTrue(usernamePasswordToken0.isRememberMe());
  }
}
