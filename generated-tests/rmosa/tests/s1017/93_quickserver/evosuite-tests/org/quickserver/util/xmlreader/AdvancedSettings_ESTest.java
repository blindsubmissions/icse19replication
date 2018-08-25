/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 13:05:28 GMT 2018
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
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketTrafficClass("");
      advancedSettings0.setClientSocketTrafficClass("f$wuGVig e");
      advancedSettings0.setMaxThreadsForNioWrite(1);
      advancedSettings0.getUseDirectByteBuffer();
      advancedSettings0.setPerformancePreferencesBandwidth(3271);
      advancedSettings0.setByteBufferSize((-1));
      assertEquals(3271, advancedSettings0.getPerformancePreferencesBandwidth());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      int int0 = 248;
      advancedSettings0.setPerformancePreferencesBandwidth(248);
      AdvancedSettings advancedSettings1 = new AdvancedSettings();
      advancedSettings1.setQSObjectPoolMaker("");
      advancedSettings0.setCharset("");
      advancedSettings1.getCharset();
      advancedSettings0.setDebugNonBlockingMode(true);
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("tv 4S5;|{r*$");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // tv 4S5;|{r*$
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.getUseDirectByteBuffer();
      advancedSettings0.setClientSocketReceiveBufferSize(3947);
      advancedSettings0.getClientSocketSendBufferSize();
      advancedSettings0.getClientSocketReceiveBufferSize();
      advancedSettings0.setQSObjectPoolMaker("\t<charset>");
      advancedSettings0.setMaxThreadsForNioWrite(3947);
      int int0 = advancedSettings0.getClientSocketReceiveBufferSize();
      assertEquals(3947, int0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.getDebugNonBlockingMode();
      advancedSettings0.setClientSocketTrafficClass("");
      advancedSettings0.setClientSocketTcpNoDelay(false);
      advancedSettings0.setSocketLinger((-964));
      advancedSettings0.setClientSocketReceiveBufferSize((-756));
      advancedSettings0.setUseDirectByteBuffer(false);
      advancedSettings0.setPerformancePreferencesBandwidth((-756));
      advancedSettings0.setSocketLinger(0);
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.getByteBufferSize();
      advancedSettings0.setSocketLinger(1663);
      advancedSettings0.getCharset();
      assertEquals((-756), advancedSettings0.getPerformancePreferencesBandwidth());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      int int0 = advancedSettings0.getMaxThreadsForNioWrite();
      assertEquals(10, int0);
      
      advancedSettings0.setBacklog((-1));
      advancedSettings0.setByteBufferSize((-1));
      advancedSettings0.setQSObjectPoolMaker("O ?q[69N~|[=E[ED");
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals((-1), advancedSettings0.getSocketLinger());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.getClientIdentifier();
      advancedSettings0.setSocketLinger(1216);
      advancedSettings0.setByteBufferSize(0);
      int int0 = advancedSettings0.getSocketLinger();
      assertEquals(1216, int0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setPerformancePreferencesBandwidth(0);
      advancedSettings0.setCharset("");
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      
      advancedSettings0.setMaxThreadsForNioWrite(0);
      advancedSettings0.setClientSocketSendBufferSize(0);
      advancedSettings0.getClientSocketTcpNoDelay();
      int int0 = advancedSettings0.getPerformancePreferencesConnectionTime();
      assertEquals(0, advancedSettings0.getMaxThreadsForNioWrite());
      assertEquals(0, int0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      int int0 = 10;
      advancedSettings0.setClientSocketTrafficClass("JFA-U;+");
      boolean boolean0 = true;
      advancedSettings0.setDebugNonBlockingMode(true);
      advancedSettings0.setPerformancePreferencesLatency(10);
      advancedSettings0.setCharset("");
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("\t<performance-preferences-bandwidth>");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // \t<performance-preferences-bandwidth>
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.getClientSocketTrafficClass();
      advancedSettings0.setCharset((String) null);
      advancedSettings0.setCharset("");
      advancedSettings0.getClientSocketSendBufferSize();
      advancedSettings0.setPerformancePreferencesBandwidth(0);
      advancedSettings0.getDebugNonBlockingMode();
      advancedSettings0.getClientSocketSendBufferSize();
      advancedSettings0.setMaxThreadsForNioWrite((-568));
      advancedSettings0.setPerformancePreferencesBandwidth(0);
      advancedSettings0.getClientSocketSendBufferSize();
      advancedSettings0.setPerformancePreferencesConnectionTime((-568));
      advancedSettings0.getClientIdentifier();
      advancedSettings0.getClientSocketReceiveBufferSize();
      advancedSettings0.setClientSocketTcpNoDelay(false);
      advancedSettings0.setClientSocketReceiveBufferSize(0);
      boolean boolean0 = advancedSettings0.getUseDirectByteBuffer();
      assertEquals((-568), advancedSettings0.getMaxThreadsForNioWrite());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setUseDirectByteBuffer(true);
      String string0 = advancedSettings0.getQSObjectPoolMaker();
      assertNotNull(string0);
      assertEquals("org.quickserver.util.pool.MakeQSObjectPool", string0);
      
      advancedSettings0.setPerformancePreferencesLatency(0);
      int int0 = advancedSettings0.getClientSocketReceiveBufferSize();
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertEquals(0, int0);
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setPerformancePreferencesBandwidth(0);
      advancedSettings0.setByteBufferSize((-239));
      advancedSettings0.setCharset((String) null);
      advancedSettings0.getClientSocketTcpNoDelay();
      advancedSettings0.setClientIdentifier("<r");
      advancedSettings0.setUseDirectByteBuffer(false);
      advancedSettings0.setClientIdentifier((String) null);
      advancedSettings0.setBacklog((-239));
      assertEquals("<r", advancedSettings0.getClientIdentifier());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setQSObjectPoolMaker("");
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setMaxThreadsForNioWrite(10);
      advancedSettings0.setSocketLinger((-171));
      advancedSettings0.setBacklog((-171));
      advancedSettings0.getClientSocketSendBufferSize();
      advancedSettings0.getClientSocketReceiveBufferSize();
      advancedSettings0.setClientSocketReceiveBufferSize((-171));
      advancedSettings0.setCharset("");
      advancedSettings0.setSocketLinger((-1699));
      advancedSettings0.setMaxThreadsForNioWrite(0);
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setClientSocketSendBufferSize(0);
      advancedSettings0.getCharset();
      advancedSettings0.getPerformancePreferencesBandwidth();
      advancedSettings0.setPerformancePreferencesConnectionTime(0);
      advancedSettings0.setCharset("ISO-8859-1");
      advancedSettings0.setSocketLinger(0);
      advancedSettings0.getCharset();
      advancedSettings0.setBacklog(65536);
      assertEquals(0, advancedSettings0.getMaxThreadsForNioWrite());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientIdentifier("");
      advancedSettings0.setQSObjectPoolMaker("");
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setMaxThreadsForNioWrite((-2936));
      advancedSettings0.setSocketLinger((-2936));
      advancedSettings0.setByteBufferSize((-201));
      advancedSettings0.setMaxThreadsForNioWrite((-201));
      advancedSettings0.getDebugNonBlockingMode();
      advancedSettings0.getCharset();
      advancedSettings0.setDebugNonBlockingMode(false);
      advancedSettings0.setByteBufferSize(0);
      assertEquals((-201), advancedSettings0.getMaxThreadsForNioWrite());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setByteBufferSize(0);
      String string0 = advancedSettings0.toXML("w");
      assertEquals("w<advanced-settings>\nw\t<charset>ISO-8859-1</charset>\nw\t<use-direct-byte-buffer>true</use-direct-byte-buffer>\nw\t<byte-buffer-size>65536</byte-buffer-size>\nw\t<backlog>0</backlog>\nw\t<socket-linger>-1</socket-linger>\nw\t<debug-non-blocking-mode>false</debug-non-blocking-mode>\nw\t<client-identifier>org.quickserver.net.server.impl.OptimisticClientIdentifier</client-identifier>\nw\t<qsobject-pool-maker>org.quickserver.util.pool.MakeQSObjectPool</qsobject-pool-maker>\nw\t<max-threads-for-nio-write>10</max-threads-for-nio-write>\nw\t<performance-preferences-connection-time>0</performance-preferences-connection-time>\nw\t<performance-preferences-latency>0</performance-preferences-latency>\nw\t<performance-preferences-bandwidth>0</performance-preferences-bandwidth>\nw\t<client-socket-tcp-no-delay>false</client-socket-tcp-no-delay>\nw</advanced-settings>\n", string0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientIdentifier(".<)HL");
      advancedSettings0.setClientSocketTcpNoDelay(true);
      advancedSettings0.setQSObjectPoolMaker("<Z/#ZKq9~iQT");
      assertEquals(".<)HL", advancedSettings0.getClientIdentifier());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      int int0 = 17;
      advancedSettings0.setByteBufferSize(17);
      advancedSettings0.setQSObjectPoolMaker((String) null);
      advancedSettings0.setByteBufferSize(17);
      advancedSettings0.setPerformancePreferencesBandwidth(17);
      advancedSettings0.setDebugNonBlockingMode(false);
      advancedSettings0.setBacklog(17);
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("icZ6(.{H]Q");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // icZ6(.{H]Q
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=3.1354942159291497
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setPerformancePreferencesBandwidth(0);
      advancedSettings0.toXML((String) null);
      advancedSettings0.toXML("<advanced-settings>\n\t<charset>ISO-8859-1</charset>\n\t<use-direct-byte-buffer>true</use-direct-byte-buffer>\n\t<byte-buffer-size>65536</byte-buffer-size>\n\t<backlog>0</backlog>\n\t<socket-linger>-1</socket-linger>\n\t<debug-non-blocking-mode>false</debug-non-blocking-mode>\n\t<client-identifier>org.quickserver.net.server.impl.OptimisticClientIdentifier</client-identifier>\n\t<qsobject-pool-maker>org.quickserver.util.pool.MakeQSObjectPool</qsobject-pool-maker>\n\t<max-threads-for-nio-write>10</max-threads-for-nio-write>\n\t<performance-preferences-connection-time>0</performance-preferences-connection-time>\n\t<performance-preferences-latency>0</performance-preferences-latency>\n\t<performance-preferences-bandwidth>0</performance-preferences-bandwidth>\n\t<client-socket-tcp-no-delay>false</client-socket-tcp-no-delay>\n</advanced-settings>\n");
      advancedSettings0.setQSObjectPoolMaker("</performance-preferences-connection-time>\n");
      advancedSettings0.setClientIdentifier("%~7kb,_2,!d@bJ");
      advancedSettings0.getClientSocketTrafficClass();
      advancedSettings0.getUseDirectByteBuffer();
      advancedSettings0.setPerformancePreferencesBandwidth(0);
      advancedSettings0.setClientIdentifier("L::)2AYSF OBb%");
      advancedSettings0.setClientSocketSendBufferSize(0);
      advancedSettings0.setClientSocketSendBufferSize(0);
      advancedSettings0.setPerformancePreferencesLatency(0);
      assertEquals("L::)2AYSF OBb%", advancedSettings0.getClientIdentifier());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=3.0910424533583143
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setSocketLinger(1447);
      advancedSettings0.setClientSocketReceiveBufferSize(1447);
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setClientIdentifier("+");
      advancedSettings0.setClientIdentifier("dM!qe$Y");
      advancedSettings0.setPerformancePreferencesLatency((-980));
      advancedSettings0.toXML("}h<leOaZQ#Xy'#Rj2");
      advancedSettings0.setClientIdentifier("fmnOfYoNWA?");
      advancedSettings0.setClientSocketReceiveBufferSize((-980));
      assertEquals("fmnOfYoNWA?", advancedSettings0.getClientIdentifier());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=3.2188758248681983
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketTrafficClass("JFA-U;+");
      advancedSettings0.setDebugNonBlockingMode(true);
      advancedSettings0.setPerformancePreferencesLatency(10);
      advancedSettings0.setCharset("");
      advancedSettings0.getPerformancePreferencesLatency();
      advancedSettings0.setCharset("");
      advancedSettings0.setQSObjectPoolMaker("JFA-U;+");
      advancedSettings0.setClientSocketTrafficClass("\t<max-threads-for-nio-write>");
      advancedSettings0.getPerformancePreferencesLatency();
      advancedSettings0.getDebugNonBlockingMode();
      advancedSettings0.getClientSocketTrafficClass();
      advancedSettings0.toXML("\"B(:zU");
      advancedSettings0.setBacklog(1239);
      advancedSettings0.setUseDirectByteBuffer(true);
      advancedSettings0.getClientSocketTrafficClass();
      advancedSettings0.getClientSocketTrafficClass();
      assertTrue(advancedSettings0.getDebugNonBlockingMode());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=3.2958368660043296
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketSendBufferSize((-2520));
      advancedSettings0.getDebugNonBlockingMode();
      advancedSettings0.setQSObjectPoolMaker("");
      advancedSettings0.setUseDirectByteBuffer(false);
      advancedSettings0.setClientSocketReceiveBufferSize((-2520));
      advancedSettings0.setClientSocketTcpNoDelay(false);
      advancedSettings0.setByteBufferSize(0);
      advancedSettings0.setPerformancePreferencesBandwidth(0);
      advancedSettings0.toXML("");
      advancedSettings0.setPerformancePreferencesConnectionTime(0);
      advancedSettings0.setPerformancePreferencesBandwidth(10);
      advancedSettings0.getSocketLinger();
      advancedSettings0.setByteBufferSize((-1));
      advancedSettings0.setPerformancePreferencesLatency((-2548));
      assertEquals(10, advancedSettings0.getPerformancePreferencesBandwidth());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketTcpNoDelay(false);
      advancedSettings0.setUseDirectByteBuffer(false);
      advancedSettings0.setQSObjectPoolMaker("oJK");
      advancedSettings0.setClientIdentifier("\t<charset>");
      advancedSettings0.setDebugNonBlockingMode(false);
      AdvancedSettings advancedSettings1 = new AdvancedSettings();
      // Undeclared exception!
      try { 
        advancedSettings1.setCharset("oJK");
        fail("Expecting exception: UnsupportedCharsetException");
      
      } catch(UnsupportedCharsetException e) {
         //
         // oJK
         //
         verifyException("org.quickserver.util.xmlreader.AdvancedSettings", e);
      }
  }
}