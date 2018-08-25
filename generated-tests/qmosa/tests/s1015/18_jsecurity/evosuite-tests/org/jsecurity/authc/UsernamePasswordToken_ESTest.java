/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 13:45:06 GMT 2018
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
      char[] charArray0 = new char[2];
      charArray0[0] = ']';
      charArray0[1] = '{';
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("]", charArray0);
      boolean boolean0 = true;
      usernamePasswordToken0.setUsername("[7rB])-@y");
      usernamePasswordToken0.clear();
      usernamePasswordToken0.toString();
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.toString();
      usernamePasswordToken0.setRememberMe(true);
      usernamePasswordToken0.clear();
      usernamePasswordToken0.toString();
      usernamePasswordToken0.clear();
      try { 
        MockInetAddress.getByAddress("sF@_>", (byte[]) null);
        fail("Expecting exception: UnknownHostException");
      
      } catch(UnknownHostException e) {
         //
         // Not IPv4: null
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockInetAddress", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      usernamePasswordToken0.toString();
      String string0 = usernamePasswordToken0.toString();
      assertEquals("org.jsecurity.authc.UsernamePasswordToken - null, rememberMe=false", string0);
      
      char[] charArray0 = new char[8];
      charArray0[0] = '7';
      charArray0[1] = ',';
      charArray0[2] = '~';
      charArray0[3] = '$';
      charArray0[4] = '/';
      charArray0[5] = 'j';
      charArray0[6] = '(';
      charArray0[7] = 'R';
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.clear();
      usernamePasswordToken0.setPassword((char[]) null);
      usernamePasswordToken0.setPassword((char[]) null);
      String string1 = usernamePasswordToken0.toString();
      assertEquals("org.jsecurity.authc.UsernamePasswordToken - null, rememberMe=false", string1);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("*CI2XLism9m:'$^T~#1", "", true);
      boolean boolean0 = usernamePasswordToken0.isRememberMe();
      assertTrue(boolean0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getByName((String) null);
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("jIkCo0qA:CS=M^43k", "jIkCo0qA:CS=M^43k", true, inetAddress0);
      usernamePasswordToken0.setRememberMe(true);
      char[] charArray0 = usernamePasswordToken0.getPassword();
      usernamePasswordToken0.toString();
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.getCredentials();
      char[] charArray1 = usernamePasswordToken0.getPassword();
      usernamePasswordToken0.setRememberMe(true);
      usernamePasswordToken0.clear();
      usernamePasswordToken0.setInetAddress((InetAddress) null);
      usernamePasswordToken0.setPassword(charArray1);
      usernamePasswordToken0.setPassword(charArray1);
      usernamePasswordToken0.getPrincipal();
      usernamePasswordToken0.getInetAddress();
      usernamePasswordToken0.toString();
      usernamePasswordToken0.clear();
      usernamePasswordToken0.clear();
      usernamePasswordToken0.getCredentials();
      assertFalse(usernamePasswordToken0.isRememberMe());
      
      usernamePasswordToken0.setRememberMe(true);
      assertTrue(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      char[] charArray0 = new char[8];
      charArray0[0] = 'D';
      charArray0[1] = 'O';
      charArray0[2] = 'w';
      charArray0[3] = 's';
      charArray0[4] = ']';
      charArray0[5] = '7';
      charArray0[6] = 'I';
      charArray0[7] = '9';
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("? p$3JS_}", charArray0, false);
      usernamePasswordToken0.toString();
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      usernamePasswordToken0.setInetAddress(inetAddress0);
      usernamePasswordToken0.clear();
      usernamePasswordToken0.getUsername();
      usernamePasswordToken0.getPassword();
      usernamePasswordToken0.getInetAddress();
      usernamePasswordToken0.clear();
      usernamePasswordToken0.toString();
      usernamePasswordToken0.getInetAddress();
      usernamePasswordToken0.getCredentials();
      usernamePasswordToken0.getInetAddress();
      usernamePasswordToken0.getInetAddress();
      usernamePasswordToken0.getCredentials();
      usernamePasswordToken0.toString();
      usernamePasswordToken0.toString();
      usernamePasswordToken0.getPassword();
      usernamePasswordToken0.getCredentials();
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.2102535776209735
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("o(\"($iO'jv#T03n-", " (", inetAddress0);
      usernamePasswordToken0.setRememberMe(false);
      String string0 = usernamePasswordToken0.toString();
      assertEquals("org.jsecurity.authc.UsernamePasswordToken - o(\"($iO'jv#T03n-, rememberMe=false (/127.0.0.1)", string0);
      
      usernamePasswordToken0.setUsername("o(\"($iO'jv#T03n-");
      usernamePasswordToken0.clear();
      usernamePasswordToken0.toString();
      usernamePasswordToken0.setUsername("");
      char[] charArray0 = new char[0];
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.setInetAddress(inetAddress0);
      usernamePasswordToken0.setUsername(")");
      usernamePasswordToken0.setInetAddress(inetAddress0);
      usernamePasswordToken0.setUsername("]");
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.isRememberMe();
      usernamePasswordToken0.setInetAddress(inetAddress0);
      usernamePasswordToken0.setUsername("2JWdd|I");
      usernamePasswordToken0.toString();
      usernamePasswordToken0.getUsername();
      usernamePasswordToken0.setInetAddress(inetAddress0);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      char[] charArray0 = new char[8];
      charArray0[0] = 'X';
      charArray0[1] = 'u';
      charArray0[2] = '+';
      charArray0[3] = '+';
      charArray0[4] = 'x';
      charArray0[5] = '5';
      charArray0[6] = 'V';
      charArray0[7] = '';
      InetAddress inetAddress0 = MockInetAddress.getByName("t('=KH2x3;wyN;");
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", charArray0, inetAddress0);
      usernamePasswordToken0.getCredentials();
      char[] charArray1 = new char[0];
      usernamePasswordToken0.setPassword(charArray1);
      assertFalse(usernamePasswordToken0.isRememberMe());
      
      usernamePasswordToken0.setRememberMe(true);
      assertTrue(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("&3GsY", (String) null);
      usernamePasswordToken0.clear();
      usernamePasswordToken0.isRememberMe();
      usernamePasswordToken0.isRememberMe();
      usernamePasswordToken0.toString();
      usernamePasswordToken0.clear();
      char[] charArray0 = new char[8];
      charArray0[0] = '9';
      usernamePasswordToken0.clear();
      charArray0[1] = 'v';
      charArray0[2] = ',';
      charArray0[3] = 'J';
      charArray0[4] = 'G';
      charArray0[5] = 'c';
      charArray0[6] = 'k';
      usernamePasswordToken0.setPassword(charArray0);
      charArray0[7] = 'i';
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.setPassword(charArray0);
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-43);
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte) (-36);
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)6;
      try { 
        MockInetAddress.getByAddress("&3GsY", byteArray0);
        fail("Expecting exception: UnknownHostException");
      
      } catch(UnknownHostException e) {
         //
         // Not IPv4: [-43, 0, -36, 0, 6]
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockInetAddress", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.488327743368588
  */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", "");
      usernamePasswordToken0.clear();
      usernamePasswordToken0.toString();
      usernamePasswordToken0.setRememberMe(false);
      usernamePasswordToken0.setRememberMe(true);
      usernamePasswordToken0.getInetAddress();
      usernamePasswordToken0.setRememberMe(false);
      usernamePasswordToken0.isRememberMe();
      usernamePasswordToken0.getPrincipal();
      usernamePasswordToken0.setInetAddress((InetAddress) null);
      char[] charArray0 = new char[5];
      charArray0[0] = 'A';
      usernamePasswordToken0.setPassword(charArray0);
      charArray0[1] = '4';
      charArray0[2] = '7';
      charArray0[3] = 'Y';
      charArray0[4] = '!';
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.getPassword();
      usernamePasswordToken0.clear();
      usernamePasswordToken0.getUsername();
      usernamePasswordToken0.getPassword();
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.getCredentials();
      usernamePasswordToken0.getInetAddress();
      usernamePasswordToken0.setInetAddress((InetAddress) null);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }
}
