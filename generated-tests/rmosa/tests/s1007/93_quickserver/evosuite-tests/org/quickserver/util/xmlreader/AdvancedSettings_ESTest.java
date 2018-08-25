/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 08:17:29 GMT 2018
 */

package org.quickserver.util.xmlreader;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.quickserver.util.xmlreader.AdvancedSettings;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AdvancedSettings_ESTest extends AdvancedSettings_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketSendBufferSize((-1));
      advancedSettings0.getBacklog();
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setDebugNonBlockingMode(false);
      advancedSettings0.setSocketLinger(0);
      advancedSettings0.setPerformancePreferencesLatency(0);
      advancedSettings0.setPerformancePreferencesLatency((-3392));
      advancedSettings0.setClientSocketSendBufferSize((-3392));
      advancedSettings0.getPerformancePreferencesBandwidth();
      advancedSettings0.setDebugNonBlockingMode(true);
      advancedSettings0.getQSObjectPoolMaker();
      assertTrue(advancedSettings0.getDebugNonBlockingMode());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setPerformancePreferencesBandwidth(2904);
      advancedSettings0.getUseDirectByteBuffer();
      advancedSettings0.getBacklog();
      advancedSettings0.setClientSocketTcpNoDelay(true);
      assertEquals(2904, advancedSettings0.getPerformancePreferencesBandwidth());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketReceiveBufferSize(0);
      advancedSettings0.setPerformancePreferencesLatency(0);
      advancedSettings0.setUseDirectByteBuffer(false);
      advancedSettings0.setClientIdentifier("");
      advancedSettings0.getMaxThreadsForNioWrite();
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setClientSocketTrafficClass("");
      advancedSettings0.getDebugNonBlockingMode();
      advancedSettings0.setClientIdentifier("_J5wtzZIYM.nb$");
      advancedSettings0.setSocketLinger(10);
      advancedSettings0.setSocketLinger(10);
      advancedSettings0.setClientSocketReceiveBufferSize((-496));
      advancedSettings0.setClientSocketReceiveBufferSize(0);
      advancedSettings0.setByteBufferSize(0);
      advancedSettings0.setClientSocketTrafficClass("");
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setPerformancePreferencesLatency((-1050));
      advancedSettings0.setPerformancePreferencesLatency((-1777));
      assertEquals(0, advancedSettings0.getClientSocketReceiveBufferSize());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setPerformancePreferencesBandwidth(0);
      advancedSettings0.setMaxThreadsForNioWrite((-1267));
      advancedSettings0.getClientIdentifier();
      advancedSettings0.getClientSocketSendBufferSize();
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.getClientIdentifier();
      assertEquals((-1267), advancedSettings0.getMaxThreadsForNioWrite());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setPerformancePreferencesLatency(1);
      advancedSettings0.setByteBufferSize(1);
      advancedSettings0.setByteBufferSize(1);
      advancedSettings0.setSocketLinger(1);
      advancedSettings0.setSocketLinger((-147));
      advancedSettings0.setPerformancePreferencesConnectionTime((-1));
      advancedSettings0.setClientSocketSendBufferSize((-147));
      advancedSettings0.getPerformancePreferencesConnectionTime();
      advancedSettings0.setByteBufferSize(4532);
      advancedSettings0.setMaxThreadsForNioWrite(1);
      advancedSettings0.getClientSocketTcpNoDelay();
      advancedSettings0.setClientIdentifier("</client-socket-traffic-class>\n");
      advancedSettings0.getCharset();
      advancedSettings0.getClientSocketReceiveBufferSize();
      advancedSettings0.getClientSocketSendBufferSize();
      advancedSettings0.setClientSocketTrafficClass("]B+)=klivW/:Db5[6nl");
      advancedSettings0.setByteBufferSize(1);
      assertEquals((-147), advancedSettings0.getSocketLinger());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketTrafficClass("</performance-preferences-latency>\n");
      String string0 = "+prEh>Mx,+%{uHDZ2";
      advancedSettings0.setClientSocketTrafficClass("+prEh>Mx,+%{uHDZ2");
      advancedSettings0.getClientSocketTcpNoDelay();
      advancedSettings0.setBacklog((-1));
      advancedSettings0.setMaxThreadsForNioWrite((-1));
      advancedSettings0.getByteBufferSize();
      advancedSettings0.setClientIdentifier("+prEh>Mx,+%{uHDZ2");
      advancedSettings0.setClientSocketReceiveBufferSize(2379);
      advancedSettings0.setCharset("");
      advancedSettings0.setPerformancePreferencesBandwidth(3394);
      advancedSettings0.setClientSocketReceiveBufferSize(0);
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("+prEh>Mx,+%{uHDZ2");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // +prEh>Mx,+%{uHDZ2
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.4750763110546947
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.getQSObjectPoolMaker();
      boolean boolean0 = false;
      advancedSettings0.setClientSocketTcpNoDelay(false);
      advancedSettings0.setByteBufferSize(194);
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("org.quickserver.util.pool.MakeQSObjectPool");
        fail("Expecting exception: UnsupportedCharsetException");
      
      } catch(UnsupportedCharsetException e) {
         //
         // org.quickserver.util.pool.MakeQSObjectPool
         //
         verifyException("org.quickserver.util.xmlreader.AdvancedSettings", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.getClientSocketSendBufferSize();
      advancedSettings0.setClientSocketTcpNoDelay(false);
      advancedSettings0.setDebugNonBlockingMode(false);
      advancedSettings0.setDebugNonBlockingMode(false);
      advancedSettings0.setDebugNonBlockingMode(false);
      advancedSettings0.setPerformancePreferencesBandwidth(0);
      advancedSettings0.getMaxThreadsForNioWrite();
      advancedSettings0.getPerformancePreferencesConnectionTime();
      advancedSettings0.setPerformancePreferencesConnectionTime(0);
      advancedSettings0.setMaxThreadsForNioWrite(3262);
      advancedSettings0.getUseDirectByteBuffer();
      advancedSettings0.setPerformancePreferencesBandwidth(0);
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("\t<max-threads-for-nio-write>");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // \t<max-threads-for-nio-write>
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setUseDirectByteBuffer(true);
      advancedSettings0.getSocketLinger();
      advancedSettings0.getClientIdentifier();
      advancedSettings0.setUseDirectByteBuffer(false);
      advancedSettings0.setPerformancePreferencesConnectionTime(0);
      assertFalse(advancedSettings0.getUseDirectByteBuffer());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setDebugNonBlockingMode(false);
      advancedSettings0.setClientSocketSendBufferSize(0);
      advancedSettings0.setBacklog(0);
      advancedSettings0.setPerformancePreferencesConnectionTime((-1));
      advancedSettings0.setDebugNonBlockingMode(true);
      advancedSettings0.getClientSocketTcpNoDelay();
      advancedSettings0.setByteBufferSize((-1638));
      advancedSettings0.setUseDirectByteBuffer(true);
      String string0 = "^2NYt8-X2>i";
      advancedSettings0.setClientIdentifier("^2NYt8-X2>i");
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("^2NYt8-X2>i");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // ^2NYt8-X2>i
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setByteBufferSize(0);
      advancedSettings0.setPerformancePreferencesBandwidth((-286));
      advancedSettings0.getClientIdentifier();
      advancedSettings0.getClientSocketTrafficClass();
      advancedSettings0.setClientSocketSendBufferSize((-1386));
      assertEquals((-1386), advancedSettings0.getClientSocketSendBufferSize());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setDebugNonBlockingMode(false);
      advancedSettings0.setClientSocketSendBufferSize(0);
      advancedSettings0.setBacklog(0);
      advancedSettings0.setDebugNonBlockingMode(true);
      advancedSettings0.setByteBufferSize((-1638));
      advancedSettings0.setUseDirectByteBuffer(true);
      advancedSettings0.setClientIdentifier("^2NYt8-X2>i");
      advancedSettings0.setClientIdentifier("^2NYt8-X2>i");
      advancedSettings0.setClientSocketReceiveBufferSize(0);
      String string0 = "org.quickserver.net.server.impl.OptimisticClientIdentifier";
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("org.quickserver.net.server.impl.OptimisticClientIdentifier");
        fail("Expecting exception: UnsupportedCharsetException");
      
      } catch(UnsupportedCharsetException e) {
         //
         // org.quickserver.net.server.impl.OptimisticClientIdentifier
         //
         verifyException("org.quickserver.util.xmlreader.AdvancedSettings", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setBacklog((-1390));
      advancedSettings0.setCharset("");
      advancedSettings0.setPerformancePreferencesConnectionTime(1211);
      advancedSettings0.setDebugNonBlockingMode(false);
      advancedSettings0.setBacklog(65536);
      advancedSettings0.getClientSocketSendBufferSize();
      advancedSettings0.setClientIdentifier("");
      advancedSettings0.setUseDirectByteBuffer(false);
      advancedSettings0.getPerformancePreferencesBandwidth();
      advancedSettings0.setMaxThreadsForNioWrite((-1390));
      assertEquals(1211, advancedSettings0.getPerformancePreferencesConnectionTime());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      int int0 = 0;
      advancedSettings0.setBacklog(0);
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setBacklog(0);
      String string0 = "|QXopBf:k#/";
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("|QXopBf:k#/");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // |QXopBf:k#/
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.toXML("\t<qsobject-pool-maker>");
      advancedSettings0.setClientSocketTrafficClass("");
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals(0, advancedSettings0.getClientSocketSendBufferSize());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertEquals(0, advancedSettings0.getClientSocketReceiveBufferSize());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals((-1), advancedSettings0.getSocketLinger());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=3.178053830347946
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketSendBufferSize(0);
      advancedSettings0.setClientSocketSendBufferSize(3453);
      advancedSettings0.setClientSocketSendBufferSize(377);
      advancedSettings0.setSocketLinger(377);
      advancedSettings0.getUseDirectByteBuffer();
      advancedSettings0.setClientSocketTcpNoDelay(true);
      advancedSettings0.getPerformancePreferencesConnectionTime();
      advancedSettings0.setClientIdentifier("");
      advancedSettings0.setClientIdentifier("\t<socket-linger>");
      advancedSettings0.setMaxThreadsForNioWrite(0);
      advancedSettings0.getBacklog();
      String string0 = advancedSettings0.toXML("\t<socket-linger>");
      advancedSettings0.getUseDirectByteBuffer();
      advancedSettings0.setClientSocketTrafficClass("");
      advancedSettings0.getPerformancePreferencesConnectionTime();
      advancedSettings0.setClientSocketTrafficClass(string0);
      advancedSettings0.getCharset();
      int int0 = advancedSettings0.getPerformancePreferencesBandwidth();
      assertEquals("\t<socket-linger>", advancedSettings0.getClientIdentifier());
      assertEquals(0, int0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setQSObjectPoolMaker("plS>h");
      advancedSettings0.setPerformancePreferencesLatency(0);
      advancedSettings0.setClientSocketTrafficClass("");
      String string0 = advancedSettings0.getQSObjectPoolMaker();
      assertEquals("plS>h", string0);
      
      advancedSettings0.setClientSocketReceiveBufferSize(0);
      advancedSettings0.setBacklog((-1873));
      advancedSettings0.setCharset("");
      advancedSettings0.setUseDirectByteBuffer(true);
      advancedSettings0.setPerformancePreferencesLatency(0);
      assertEquals(0, advancedSettings0.getBacklog());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals(0, advancedSettings0.getClientSocketReceiveBufferSize());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setDebugNonBlockingMode(false);
      advancedSettings0.setClientSocketTrafficClass("+prEh>Mx,+%{uHDZ2");
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("+prEh>Mx,+%{uHDZ2");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // +prEh>Mx,+%{uHDZ2
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=3.2188758248681983
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setMaxThreadsForNioWrite(822);
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setClientSocketTrafficClass("H0Q.");
      advancedSettings0.setClientSocketSendBufferSize(0);
      advancedSettings0.setClientSocketTcpNoDelay(true);
      String string0 = advancedSettings0.toXML("org.quickserver.util.pool.MakeQSObjectPool");
      advancedSettings0.setClientSocketReceiveBufferSize((-2741));
      advancedSettings0.setClientSocketTcpNoDelay(true);
      advancedSettings0.getSocketLinger();
      advancedSettings0.setClientSocketTrafficClass("Nz'");
      advancedSettings0.getClientSocketReceiveBufferSize();
      advancedSettings0.setQSObjectPoolMaker(string0);
      advancedSettings0.setClientSocketTcpNoDelay(false);
      advancedSettings0.getPerformancePreferencesLatency();
      advancedSettings0.setClientSocketSendBufferSize(0);
      advancedSettings0.setQSObjectPoolMaker("H0Q.");
      advancedSettings0.setPerformancePreferencesLatency(0);
      advancedSettings0.getUseDirectByteBuffer();
      advancedSettings0.setClientSocketTcpNoDelay(true);
      assertTrue(advancedSettings0.getClientSocketTcpNoDelay());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketSendBufferSize((-1));
      advancedSettings0.setMaxThreadsForNioWrite(0);
      advancedSettings0.getBacklog();
      advancedSettings0.getClientSocketSendBufferSize();
      advancedSettings0.setPerformancePreferencesConnectionTime(0);
      advancedSettings0.setPerformancePreferencesBandwidth(1);
      advancedSettings0.setPerformancePreferencesBandwidth((-1));
      advancedSettings0.setDebugNonBlockingMode(true);
      advancedSettings0.setPerformancePreferencesLatency((-44));
      advancedSettings0.setSocketLinger(0);
      advancedSettings0.getMaxThreadsForNioWrite();
      advancedSettings0.setDebugNonBlockingMode(false);
      advancedSettings0.setPerformancePreferencesBandwidth(0);
      advancedSettings0.setClientSocketTcpNoDelay(false);
      advancedSettings0.setSocketLinger(1545);
      advancedSettings0.setByteBufferSize(3808);
      advancedSettings0.setCharset("");
      advancedSettings0.getMaxThreadsForNioWrite();
      advancedSettings0.setCharset((String) null);
      advancedSettings0.setSocketLinger(0);
      assertEquals((-44), advancedSettings0.getPerformancePreferencesLatency());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=3.0910424533583143
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.getClientSocketTrafficClass();
      advancedSettings0.getPerformancePreferencesLatency();
      advancedSettings0.setCharset((String) null);
      advancedSettings0.setByteBufferSize(0);
      advancedSettings0.toXML("'#B6H84<?Ph");
      advancedSettings0.setClientSocketTcpNoDelay(true);
      advancedSettings0.setUseDirectByteBuffer(true);
      advancedSettings0.setByteBufferSize(0);
      advancedSettings0.toXML((String) null);
      advancedSettings0.setUseDirectByteBuffer(false);
      advancedSettings0.getMaxThreadsForNioWrite();
      advancedSettings0.getClientSocketReceiveBufferSize();
      advancedSettings0.getQSObjectPoolMaker();
      assertFalse(advancedSettings0.getUseDirectByteBuffer());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=3.0804763069961507
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setPerformancePreferencesConnectionTime((-1401));
      advancedSettings0.setCharset("");
      advancedSettings0.setClientSocketReceiveBufferSize((-1401));
      advancedSettings0.setClientSocketTcpNoDelay(true);
      advancedSettings0.setDebugNonBlockingMode(true);
      advancedSettings0.setClientSocketTcpNoDelay(true);
      advancedSettings0.setQSObjectPoolMaker("");
      advancedSettings0.setQSObjectPoolMaker("bWG}F0~py");
      advancedSettings0.setDebugNonBlockingMode(true);
      advancedSettings0.getDebugNonBlockingMode();
      advancedSettings0.toXML("bWG}F0~py");
      advancedSettings0.setCharset("");
      assertEquals((-1401), advancedSettings0.getClientSocketReceiveBufferSize());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setByteBufferSize(0);
      advancedSettings0.setPerformancePreferencesConnectionTime(0);
      advancedSettings0.setClientSocketTrafficClass((String) null);
      int int0 = 0;
      advancedSettings0.setMaxThreadsForNioWrite(0);
      advancedSettings0.setClientSocketSendBufferSize(0);
      advancedSettings0.setClientSocketSendBufferSize(0);
      advancedSettings0.setPerformancePreferencesConnectionTime(0);
      advancedSettings0.setClientIdentifier((String) null);
      advancedSettings0.setByteBufferSize((-1553));
      String string0 = "\t<backlog>";
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("\t<backlog>");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // \t<backlog>
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }
}