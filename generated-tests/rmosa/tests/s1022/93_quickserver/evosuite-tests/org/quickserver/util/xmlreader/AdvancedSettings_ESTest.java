/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 15:38:30 GMT 2018
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
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setByteBufferSize((-2525));
      advancedSettings0.setSocketLinger((-2525));
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setClientIdentifier("");
      advancedSettings0.setClientSocketTcpNoDelay(false);
      advancedSettings0.getDebugNonBlockingMode();
      advancedSettings0.getPerformancePreferencesBandwidth();
      advancedSettings0.setQSObjectPoolMaker("");
      assertEquals((-2525), advancedSettings0.getSocketLinger());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setSocketLinger((-1));
      advancedSettings0.setPerformancePreferencesLatency((-1));
      advancedSettings0.getByteBufferSize();
      advancedSettings0.setDebugNonBlockingMode(false);
      advancedSettings0.getClientSocketSendBufferSize();
      advancedSettings0.setByteBufferSize(65536);
      advancedSettings0.getPerformancePreferencesLatency();
      advancedSettings0.getUseDirectByteBuffer();
      advancedSettings0.setDebugNonBlockingMode(true);
      assertTrue(advancedSettings0.getDebugNonBlockingMode());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setSocketLinger((-1175));
      advancedSettings0.setQSObjectPoolMaker("[}udb%&");
      int int0 = advancedSettings0.getBacklog();
      assertEquals((-1175), advancedSettings0.getSocketLinger());
      assertEquals(0, int0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setCharset((String) null);
      int int0 = advancedSettings0.getBacklog();
      int int1 = advancedSettings0.getPerformancePreferencesLatency();
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertTrue(int1 == int0);
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals(0, int1);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientIdentifier("");
      advancedSettings0.setClientSocketTrafficClass("");
      advancedSettings0.setClientIdentifier("");
      String string0 = "</client-socket-send-buffer-size>\n";
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("</client-socket-send-buffer-size>\n");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // </client-socket-send-buffer-size>
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketTrafficClass((String) null);
      advancedSettings0.setSocketLinger(1396);
      advancedSettings0.setSocketLinger(1396);
      advancedSettings0.getUseDirectByteBuffer();
      advancedSettings0.setPerformancePreferencesLatency(1364);
      advancedSettings0.getClientSocketSendBufferSize();
      advancedSettings0.setByteBufferSize(867);
      advancedSettings0.setBacklog(0);
      advancedSettings0.getClientSocketTrafficClass();
      advancedSettings0.setMaxThreadsForNioWrite((-1));
      advancedSettings0.setMaxThreadsForNioWrite(0);
      advancedSettings0.getCharset();
      assertEquals(1396, advancedSettings0.getSocketLinger());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setByteBufferSize((-1));
      advancedSettings0.setPerformancePreferencesLatency(791);
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("</client-socket-traffic-class>\n");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // </client-socket-traffic-class>
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setByteBufferSize(0);
      advancedSettings0.setSocketLinger(10);
      advancedSettings0.setQSObjectPoolMaker(")X?p,xu3rkm6In-xA");
      advancedSettings0.getDebugNonBlockingMode();
      assertEquals(10, advancedSettings0.getSocketLinger());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setCharset("");
      String string0 = advancedSettings0.getCharset();
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals("ISO-8859-1", string0);
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setDebugNonBlockingMode(false);
      advancedSettings0.getByteBufferSize();
      advancedSettings0.setSocketLinger(1628);
      advancedSettings0.setClientSocketTcpNoDelay(false);
      assertEquals(1628, advancedSettings0.getSocketLinger());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setSocketLinger((-1333));
      advancedSettings0.setQSObjectPoolMaker("");
      advancedSettings0.setSocketLinger(65536);
      advancedSettings0.getClientSocketSendBufferSize();
      advancedSettings0.getClientIdentifier();
      advancedSettings0.getPerformancePreferencesBandwidth();
      advancedSettings0.setClientSocketSendBufferSize(0);
      advancedSettings0.getMaxThreadsForNioWrite();
      advancedSettings0.getCharset();
      advancedSettings0.setClientIdentifier("");
      advancedSettings0.setClientSocketTcpNoDelay(false);
      assertEquals(65536, advancedSettings0.getSocketLinger());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketSendBufferSize((-476));
      advancedSettings0.setPerformancePreferencesBandwidth(848);
      advancedSettings0.setClientSocketReceiveBufferSize((-1255));
      advancedSettings0.setBacklog(848);
      advancedSettings0.getDebugNonBlockingMode();
      advancedSettings0.getClientIdentifier();
      advancedSettings0.getByteBufferSize();
      String string0 = "}/T,2";
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
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientIdentifier("");
      advancedSettings0.setClientSocketSendBufferSize(2907);
      advancedSettings0.setClientSocketReceiveBufferSize((-2333));
      advancedSettings0.setClientSocketReceiveBufferSize((-2333));
      advancedSettings0.setUseDirectByteBuffer(false);
      advancedSettings0.getUseDirectByteBuffer();
      advancedSettings0.setPerformancePreferencesBandwidth(10);
      advancedSettings0.setUseDirectByteBuffer(true);
      advancedSettings0.getPerformancePreferencesConnectionTime();
      advancedSettings0.setPerformancePreferencesConnectionTime(2907);
      advancedSettings0.getClientSocketReceiveBufferSize();
      AdvancedSettings advancedSettings1 = new AdvancedSettings();
      // Undeclared exception!
      try { 
        advancedSettings1.setCharset("S");
        fail("Expecting exception: UnsupportedCharsetException");
      
      } catch(UnsupportedCharsetException e) {
         //
         // S
         //
         verifyException("org.quickserver.util.xmlreader.AdvancedSettings", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      String string0 = "!9^@[ ]QCyzP_@XgGs";
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setQSObjectPoolMaker("!9^@[ ]QCyzP_@XgGs");
      advancedSettings0.setDebugNonBlockingMode(false);
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("(wJO");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // (wJO
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=3.1354942159291497
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketReceiveBufferSize(838);
      advancedSettings0.toXML((String) null);
      advancedSettings0.setPerformancePreferencesLatency(0);
      advancedSettings0.setClientSocketTrafficClass((String) null);
      advancedSettings0.setMaxThreadsForNioWrite((-1));
      advancedSettings0.setByteBufferSize((-801));
      assertEquals(838, advancedSettings0.getClientSocketReceiveBufferSize());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.890371757896165
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      String string0 = advancedSettings0.toXML("^(|j$");
      assertEquals("^(|j$<advanced-settings>\n^(|j$\t<charset>ISO-8859-1</charset>\n^(|j$\t<use-direct-byte-buffer>true</use-direct-byte-buffer>\n^(|j$\t<byte-buffer-size>65536</byte-buffer-size>\n^(|j$\t<backlog>0</backlog>\n^(|j$\t<socket-linger>-1</socket-linger>\n^(|j$\t<debug-non-blocking-mode>false</debug-non-blocking-mode>\n^(|j$\t<client-identifier>org.quickserver.net.server.impl.OptimisticClientIdentifier</client-identifier>\n^(|j$\t<qsobject-pool-maker>org.quickserver.util.pool.MakeQSObjectPool</qsobject-pool-maker>\n^(|j$\t<max-threads-for-nio-write>10</max-threads-for-nio-write>\n^(|j$\t<performance-preferences-connection-time>0</performance-preferences-connection-time>\n^(|j$\t<performance-preferences-latency>0</performance-preferences-latency>\n^(|j$\t<performance-preferences-bandwidth>0</performance-preferences-bandwidth>\n^(|j$\t<client-socket-tcp-no-delay>false</client-socket-tcp-no-delay>\n^(|j$</advanced-settings>\n", string0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setQSObjectPoolMaker((String) null);
      advancedSettings0.setSocketLinger(0);
      advancedSettings0.setSocketLinger(0);
      advancedSettings0.setClientIdentifier(";iI@f%\"YhZ%#&.!Wf");
      advancedSettings0.setBacklog(602);
      advancedSettings0.setByteBufferSize((-236));
      advancedSettings0.getUseDirectByteBuffer();
      advancedSettings0.setClientSocketSendBufferSize(0);
      advancedSettings0.setQSObjectPoolMaker((String) null);
      advancedSettings0.setPerformancePreferencesLatency(1213);
      assertEquals(602, advancedSettings0.getBacklog());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setQSObjectPoolMaker("3.pU!|ic]ef=X#=U");
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      
      advancedSettings0.setUseDirectByteBuffer(false);
      advancedSettings0.setUseDirectByteBuffer(false);
      advancedSettings0.setClientSocketTcpNoDelay(false);
      advancedSettings0.setDebugNonBlockingMode(false);
      assertFalse(advancedSettings0.getUseDirectByteBuffer());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketTrafficClass("d|u`!=WCyaUv>(}6s");
      boolean boolean0 = advancedSettings0.getClientSocketTcpNoDelay();
      assertFalse(boolean0);
      
      advancedSettings0.toXML("d|u`!=WCyaUv>(}6s");
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertEquals(0, advancedSettings0.getClientSocketReceiveBufferSize());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals(0, advancedSettings0.getClientSocketSendBufferSize());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setSocketLinger(0);
      advancedSettings0.setClientSocketSendBufferSize((-1900));
      advancedSettings0.setClientSocketTcpNoDelay(true);
      advancedSettings0.setByteBufferSize((-1900));
      advancedSettings0.setSocketLinger((-1582));
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setClientIdentifier("org.quickserver.util.pool.MakeQSObjectPool");
      advancedSettings0.setClientSocketTcpNoDelay(false);
      advancedSettings0.getDebugNonBlockingMode();
      advancedSettings0.getPerformancePreferencesBandwidth();
      advancedSettings0.setQSObjectPoolMaker("");
      advancedSettings0.setCharset("");
      assertEquals("org.quickserver.util.pool.MakeQSObjectPool", advancedSettings0.getClientIdentifier());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setDebugNonBlockingMode(false);
      advancedSettings0.setClientSocketTrafficClass("VfL:P+i*v$[g}]u");
      advancedSettings0.setClientSocketTrafficClass("");
      advancedSettings0.setClientSocketTrafficClass("");
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setClientSocketTcpNoDelay(false);
      advancedSettings0.setPerformancePreferencesBandwidth(3556);
      advancedSettings0.setByteBufferSize(3556);
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
  //Test case number: 21
  /*Coverage entropy=3.2188758248681983
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setDebugNonBlockingMode(true);
      advancedSettings0.setClientSocketSendBufferSize(0);
      advancedSettings0.setSocketLinger((-1686));
      advancedSettings0.setPerformancePreferencesConnectionTime(0);
      advancedSettings0.setPerformancePreferencesLatency(0);
      advancedSettings0.setBacklog(0);
      advancedSettings0.setClientSocketSendBufferSize(0);
      advancedSettings0.setClientSocketSendBufferSize((-1));
      advancedSettings0.toXML("");
      advancedSettings0.setClientIdentifier("");
      advancedSettings0.getMaxThreadsForNioWrite();
      boolean boolean0 = advancedSettings0.getUseDirectByteBuffer();
      assertTrue(advancedSettings0.getDebugNonBlockingMode());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setPerformancePreferencesConnectionTime((-507));
      advancedSettings0.getSocketLinger();
      advancedSettings0.getSocketLinger();
      advancedSettings0.setPerformancePreferencesLatency(649);
      advancedSettings0.setPerformancePreferencesLatency(1);
      advancedSettings0.setDebugNonBlockingMode(true);
      advancedSettings0.setBacklog((-1));
      advancedSettings0.setClientIdentifier("");
      advancedSettings0.setPerformancePreferencesLatency((-507));
      advancedSettings0.setClientSocketReceiveBufferSize((-1155));
      advancedSettings0.setPerformancePreferencesLatency((-507));
      advancedSettings0.setClientSocketTcpNoDelay(true);
      advancedSettings0.setClientSocketTrafficClass("");
      advancedSettings0.setPerformancePreferencesBandwidth(0);
      advancedSettings0.getDebugNonBlockingMode();
      advancedSettings0.setCharset("");
      int int0 = advancedSettings0.getByteBufferSize();
      assertEquals((-507), advancedSettings0.getPerformancePreferencesConnectionTime());
      assertEquals(65536, int0);
  }
}