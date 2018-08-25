/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 14:59:51 GMT 2018
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
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = '=';
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken(";;k>2oN?`sTNAM__el=", charArray0, inetAddress0);
      InetAddress inetAddress1 = MockInetAddress.getByName("K?,Lhw;g7TAxzM2");
      usernamePasswordToken0.setInetAddress(inetAddress1);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", "");
      char[] charArray0 = new char[2];
      charArray0[0] = 'T';
      charArray0[1] = 'Z';
      usernamePasswordToken0.setPassword(charArray0);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      char[] charArray0 = new char[6];
      charArray0[0] = 'f';
      charArray0[1] = '5';
      charArray0[2] = 'M';
      charArray0[3] = '_';
      charArray0[4] = 'u';
      charArray0[5] = 's';
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", charArray0, false);
      usernamePasswordToken0.clear();
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-125);
      byteArray0[1] = (byte)4;
      try { 
        MockInetAddress.getByAddress(byteArray0);
        fail("Expecting exception: UnknownHostException");
      
      } catch(UnknownHostException e) {
         //
         // Not IPv4: [-125, 4]
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockInetAddress", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getByName("J`F");
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("J`F", "J`F", true, inetAddress0);
      assertTrue(usernamePasswordToken0.isRememberMe());
      
      usernamePasswordToken0.clear();
      usernamePasswordToken0.toString();
      usernamePasswordToken0.getUsername();
      usernamePasswordToken0.getUsername();
      usernamePasswordToken0.setInetAddress(inetAddress0);
      usernamePasswordToken0.clear();
      usernamePasswordToken0.getPassword();
      usernamePasswordToken0.getPrincipal();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", "", true);
      char[] charArray0 = new char[8];
      charArray0[0] = 'e';
      charArray0[1] = 'L';
      charArray0[2] = 'q';
      charArray0[3] = 'O';
      charArray0[4] = '\"';
      charArray0[5] = '5';
      usernamePasswordToken0.setRememberMe(true);
      charArray0[6] = 'j';
      charArray0[7] = 'L';
      usernamePasswordToken0.setPassword(charArray0);
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      usernamePasswordToken0.setInetAddress(inetAddress0);
      usernamePasswordToken0.setInetAddress(inetAddress0);
      usernamePasswordToken0.clear();
      usernamePasswordToken0.toString();
      usernamePasswordToken0.setInetAddress(inetAddress0);
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.setInetAddress(inetAddress0);
      usernamePasswordToken0.getPassword();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)1;
      byteArray0[1] = (byte)7;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)61;
      InetAddress inetAddress0 = MockInetAddress.getByAddress(byteArray0);
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken((String) null, (String) null, false, inetAddress0);
      usernamePasswordToken0.getPrincipal();
      usernamePasswordToken0.getUsername();
      usernamePasswordToken0.setUsername(", rememberMe=");
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = 'K';
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("0", charArray0, false);
      usernamePasswordToken0.getUsername();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("V", (String) null, false, inetAddress0);
      usernamePasswordToken0.setInetAddress(inetAddress0);
      String string0 = usernamePasswordToken0.toString();
      assertEquals("org.jsecurity.authc.UsernamePasswordToken - V, rememberMe=false (/192.168.1.42)", string0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      char[] charArray0 = new char[5];
      charArray0[0] = '_';
      charArray0[1] = 'f';
      charArray0[2] = 'Z';
      charArray0[3] = '\\';
      charArray0[4] = '>';
      usernamePasswordToken0.setPassword(charArray0);
      char[] charArray1 = new char[3];
      charArray1[0] = 'T';
      charArray1[1] = 'Z';
      charArray1[2] = '\\';
      usernamePasswordToken0.setPassword(charArray1);
      usernamePasswordToken0.setPassword((char[]) null);
      usernamePasswordToken0.setRememberMe(true);
      usernamePasswordToken0.setUsername((String) null);
      usernamePasswordToken0.clear();
      usernamePasswordToken0.setRememberMe(true);
      usernamePasswordToken0.getUsername();
      boolean boolean0 = usernamePasswordToken0.isRememberMe();
      assertTrue(boolean0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", "", true, (InetAddress) null);
      assertTrue(usernamePasswordToken0.isRememberMe());
      
      char[] charArray0 = new char[6];
      charArray0[0] = '';
      charArray0[1] = 'K';
      charArray0[2] = 'V';
      charArray0[3] = 'V';
      usernamePasswordToken0.clear();
      charArray0[4] = 'b';
      charArray0[5] = 'u';
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.clear();
      usernamePasswordToken0.getCredentials();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      char[] charArray0 = new char[9];
      charArray0[0] = 'X';
      charArray0[1] = '%';
      charArray0[2] = '6';
      charArray0[3] = 'A';
      charArray0[4] = '\"';
      charArray0[5] = '*';
      charArray0[6] = '[';
      charArray0[7] = ';';
      charArray0[8] = 'O';
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("!o|3O'Q6Fh zZ", charArray0, inetAddress0);
      boolean boolean0 = usernamePasswordToken0.isRememberMe();
      assertFalse(boolean0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("gshFurkJt3c*", (String) null, true);
      usernamePasswordToken0.getUsername();
      char[] charArray0 = new char[9];
      charArray0[0] = 'D';
      charArray0[1] = 'j';
      charArray0[2] = '>';
      charArray0[3] = ',';
      charArray0[4] = 'f';
      charArray0[5] = '/';
      charArray0[6] = '&';
      charArray0[7] = '\"';
      charArray0[8] = 'A';
      usernamePasswordToken0.setPassword(charArray0);
      assertTrue(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[0] = 'h';
      charArray0[1] = 'R';
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", charArray0, false);
      usernamePasswordToken0.getCredentials();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("XgFF|/", "", inetAddress0);
      usernamePasswordToken0.clear();
      usernamePasswordToken0.getInetAddress();
      char[] charArray0 = new char[7];
      charArray0[0] = 'Q';
      charArray0[1] = '2';
      charArray0[2] = 'N';
      charArray0[3] = '2';
      charArray0[4] = 'l';
      charArray0[5] = 'm';
      charArray0[6] = '!';
      usernamePasswordToken0.setPassword(charArray0);
      usernamePasswordToken0.getPassword();
      usernamePasswordToken0.getCredentials();
      usernamePasswordToken0.getInetAddress();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      char[] charArray0 = new char[3];
      charArray0[0] = 'y';
      charArray0[1] = ';';
      charArray0[2] = '';
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken(")", charArray0);
      usernamePasswordToken0.setRememberMe(false);
      usernamePasswordToken0.setUsername("");
      usernamePasswordToken0.clear();
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000'}, charArray0);
  }
}