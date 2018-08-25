/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 09:09:39 GMT 2018
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
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = 'g';
      InetAddress inetAddress0 = MockInetAddress.getByName("");
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", charArray0, true, inetAddress0);
      usernamePasswordToken0.setUsername(", rememberMe=");
      usernamePasswordToken0.getInetAddress();
      usernamePasswordToken0.setRememberMe(true);
      usernamePasswordToken0.setUsername("");
      usernamePasswordToken0.setInetAddress(inetAddress0);
      assertTrue(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      char[] charArray0 = new char[9];
      charArray0[0] = 'D';
      charArray0[1] = 'B';
      charArray0[2] = '!';
      charArray0[3] = 'M';
      charArray0[4] = 's';
      charArray0[5] = 'z';
      charArray0[6] = '`';
      charArray0[7] = 'L';
      charArray0[8] = 'z';
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("U0U:S8902)z~!", charArray0, inetAddress0);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = 'N';
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("&wob<{,_;ytp[8", charArray0);
      usernamePasswordToken0.setUsername("&wob<{,_;ytp[8");
      usernamePasswordToken0.getInetAddress();
      usernamePasswordToken0.getCredentials();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      usernamePasswordToken0.setUsername("5");
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      usernamePasswordToken0.getPrincipal();
      String string0 = usernamePasswordToken0.toString();
      assertEquals("org.jsecurity.authc.UsernamePasswordToken - null, rememberMe=false", string0);
      
      char[] charArray0 = new char[6];
      charArray0[0] = '~';
      charArray0[1] = '!';
      charArray0[2] = 'I';
      charArray0[3] = '+';
      charArray0[4] = '}';
      charArray0[5] = 'i';
      usernamePasswordToken0.setPassword(charArray0);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken((String) null, "");
      char[] charArray0 = new char[9];
      charArray0[0] = 'I';
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      usernamePasswordToken0.setInetAddress(inetAddress0);
      charArray0[1] = 'J';
      charArray0[2] = 'S';
      charArray0[3] = '(';
      charArray0[4] = 'O';
      charArray0[5] = 'H';
      charArray0[6] = 'd';
      charArray0[7] = 'J';
      usernamePasswordToken0.setPassword(charArray0);
      charArray0[8] = 'u';
      usernamePasswordToken0.setPassword(charArray0);
      String string0 = usernamePasswordToken0.toString();
      assertEquals("org.jsecurity.authc.UsernamePasswordToken - null, rememberMe=false (/192.168.1.42)", string0);
      
      usernamePasswordToken0.getPassword();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("Gj47T!i+", "Gj47T!i+", true);
      char[] charArray0 = new char[7];
      charArray0[0] = '(';
      charArray0[1] = '$';
      charArray0[2] = '.';
      charArray0[3] = 'v';
      charArray0[4] = '!';
      charArray0[5] = '`';
      charArray0[6] = 'V';
      usernamePasswordToken0.setPassword(charArray0);
      assertTrue(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      char[] charArray0 = new char[4];
      charArray0[0] = '2';
      charArray0[1] = '&';
      charArray0[2] = 'j';
      charArray0[3] = 'L';
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", charArray0);
      usernamePasswordToken0.clear();
      usernamePasswordToken0.setUsername((String) null);
      usernamePasswordToken0.setRememberMe(true);
      usernamePasswordToken0.clear();
      usernamePasswordToken0.toString();
      boolean boolean0 = usernamePasswordToken0.isRememberMe();
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      char[] charArray0 = new char[9];
      charArray0[0] = 'c';
      charArray0[1] = 'o';
      charArray0[2] = '^';
      charArray0[3] = 'L';
      charArray0[4] = 'o';
      charArray0[5] = 'x';
      charArray0[6] = 's';
      charArray0[7] = '}';
      charArray0[8] = 'u';
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", charArray0, false);
      usernamePasswordToken0.clear();
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("q=O/N&%z8R?k", "q=O/N&%z8R?k");
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-94);
      byteArray0[1] = (byte)33;
      byteArray0[2] = (byte)104;
      byteArray0[3] = (byte)37;
      InetAddress inetAddress0 = MockInetAddress.getByAddress(byteArray0);
      usernamePasswordToken0.setInetAddress(inetAddress0);
      usernamePasswordToken0.clear();
      usernamePasswordToken0.getPrincipal();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("$dy", "", true, inetAddress0);
      usernamePasswordToken0.setInetAddress(inetAddress0);
      usernamePasswordToken0.setInetAddress(inetAddress0);
      usernamePasswordToken0.setUsername("");
      char[] charArray0 = new char[5];
      charArray0[0] = 'Q';
      charArray0[1] = '5';
      charArray0[2] = '`';
      charArray0[3] = 'v';
      charArray0[4] = 'b';
      usernamePasswordToken0.setPassword(charArray0);
      assertTrue(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("[prB,2XQl){>r^", "[prB,2XQl){>r^", inetAddress0);
      usernamePasswordToken0.setInetAddress(inetAddress0);
      char[] charArray0 = usernamePasswordToken0.getPassword();
      usernamePasswordToken0.setUsername("[prB,2XQl){>r^");
      usernamePasswordToken0.getUsername();
      usernamePasswordToken0.clear();
      usernamePasswordToken0.getUsername();
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.getCredentials();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }
}
