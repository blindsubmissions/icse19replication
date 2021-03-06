/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 10:24:25 GMT 2018
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
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientIdentifier("");
      advancedSettings0.setDebugNonBlockingMode(true);
      advancedSettings0.setUseDirectByteBuffer(true);
      int int0 = advancedSettings0.getPerformancePreferencesBandwidth();
      assertTrue(advancedSettings0.getDebugNonBlockingMode());
      assertEquals(0, int0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketSendBufferSize((-1013));
      advancedSettings0.setClientSocketTcpNoDelay(true);
      advancedSettings0.setBacklog(0);
      advancedSettings0.getDebugNonBlockingMode();
      advancedSettings0.setQSObjectPoolMaker("");
      int int0 = advancedSettings0.getClientSocketSendBufferSize();
      assertEquals((-1013), int0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setUseDirectByteBuffer(true);
      int int0 = (-4438);
      advancedSettings0.setSocketLinger((-4438));
      advancedSettings0.setClientIdentifier((String) null);
      String string0 = "yjWk@HO!7{Y)`8oSpxo";
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("2B!+$#7U%Vc=< |<6");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // 2B!+$#7U%Vc=< |<6
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      
      advancedSettings0.setMaxThreadsForNioWrite(0);
      advancedSettings0.setPerformancePreferencesConnectionTime(0);
      advancedSettings0.setClientSocketTcpNoDelay(true);
      advancedSettings0.setClientSocketSendBufferSize(0);
      advancedSettings0.getQSObjectPoolMaker();
      int int0 = advancedSettings0.getByteBufferSize();
      assertEquals(65536, int0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setQSObjectPoolMaker("");
      advancedSettings0.setUseDirectByteBuffer(true);
      advancedSettings0.setPerformancePreferencesBandwidth((-1629));
      advancedSettings0.getSocketLinger();
      advancedSettings0.setSocketLinger((-1));
      advancedSettings0.getCharset();
      advancedSettings0.setByteBufferSize((-1));
      advancedSettings0.setPerformancePreferencesLatency((-1));
      advancedSettings0.setMaxThreadsForNioWrite((-1));
      advancedSettings0.setClientIdentifier("");
      advancedSettings0.setClientSocketSendBufferSize((-1));
      advancedSettings0.getClientIdentifier();
      advancedSettings0.getBacklog();
      advancedSettings0.setClientIdentifier((String) null);
      advancedSettings0.setPerformancePreferencesBandwidth((-1));
      assertEquals((-1), advancedSettings0.getClientSocketSendBufferSize());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      int int0 = (-1284);
      advancedSettings0.setPerformancePreferencesLatency((-1284));
      int int1 = (-301);
      advancedSettings0.setBacklog((-301));
      advancedSettings0.setDebugNonBlockingMode(false);
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("</client-identifier>\n");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // </client-identifier>
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setDebugNonBlockingMode(true);
      advancedSettings0.setPerformancePreferencesBandwidth((-1));
      advancedSettings0.setPerformancePreferencesLatency(0);
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setClientSocketTcpNoDelay(false);
      String string0 = "";
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("org.quickserver.util.xmlreader.AdvancedSettings");
        fail("Expecting exception: UnsupportedCharsetException");
      
      } catch(UnsupportedCharsetException e) {
         //
         // org.quickserver.util.xmlreader.AdvancedSettings
         //
         verifyException("org.quickserver.util.xmlreader.AdvancedSettings", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      boolean boolean0 = advancedSettings0.getUseDirectByteBuffer();
      assertTrue(boolean0);
      
      advancedSettings0.setDebugNonBlockingMode(false);
      String string0 = advancedSettings0.getClientIdentifier();
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertFalse(advancedSettings0.getDebugNonBlockingMode());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", string0);
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      int int0 = 65536;
      advancedSettings0.setMaxThreadsForNioWrite(65536);
      int int1 = 0;
      advancedSettings0.setPerformancePreferencesConnectionTime(65536);
      advancedSettings0.setBacklog(65536);
      advancedSettings0.setClientSocketTrafficClass((String) null);
      advancedSettings0.setClientSocketReceiveBufferSize(65536);
      advancedSettings0.setClientSocketReceiveBufferSize(0);
      advancedSettings0.getQSObjectPoolMaker();
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
  //Test case number: 9
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      int int0 = 65536;
      advancedSettings0.setMaxThreadsForNioWrite(65536);
      advancedSettings0.setSocketLinger((-4438));
      advancedSettings0.setClientIdentifier("</debug-non-blocking-mode>\n");
      String string0 = "yjWk@HO!7{Y)`8oSpxo";
      String string1 = "2B!+$#7U%Vc=< |<6";
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("yjWk@HO!7{Y)`8oSpxo");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // yjWk@HO!7{Y)`8oSpxo
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
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.getBacklog();
      boolean boolean0 = true;
      advancedSettings0.setBacklog((-2594));
      advancedSettings0.setDebugNonBlockingMode(true);
      advancedSettings0.getQSObjectPoolMaker();
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("</client-identifier>\n");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // </client-identifier>
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = "yjWk@HO!7{Y)`8oSpxo";
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setCharset((String) null);
      AdvancedSettings advancedSettings1 = new AdvancedSettings();
      advancedSettings1.setCharset((String) null);
      AdvancedSettings advancedSettings2 = new AdvancedSettings();
      // Undeclared exception!
      try { 
        advancedSettings2.setCharset("2B!+$#7U%Vc=< |<6");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // 2B!+$#7U%Vc=< |<6
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setUseDirectByteBuffer(true);
      advancedSettings0.getClientSocketTcpNoDelay();
      advancedSettings0.setClientSocketTcpNoDelay(false);
      advancedSettings0.setClientSocketSendBufferSize((-2845));
      advancedSettings0.setPerformancePreferencesConnectionTime(0);
      advancedSettings0.setClientIdentifier("eCz");
      int int0 = advancedSettings0.getPerformancePreferencesLatency();
      assertEquals((-2845), advancedSettings0.getClientSocketSendBufferSize());
      assertEquals(0, int0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketTcpNoDelay(true);
      advancedSettings0.getPerformancePreferencesBandwidth();
      advancedSettings0.setClientSocketTcpNoDelay(true);
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.getPerformancePreferencesLatency();
      advancedSettings0.setBacklog(0);
      advancedSettings0.setUseDirectByteBuffer(false);
      advancedSettings0.setMaxThreadsForNioWrite((-3041));
      advancedSettings0.setPerformancePreferencesLatency(1633);
      advancedSettings0.getBacklog();
      advancedSettings0.getPerformancePreferencesBandwidth();
      advancedSettings0.setByteBufferSize(0);
      advancedSettings0.setClientIdentifier("");
      int int0 = advancedSettings0.getPerformancePreferencesConnectionTime();
      assertEquals(1633, advancedSettings0.getPerformancePreferencesLatency());
      assertEquals(0, int0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setMaxThreadsForNioWrite(0);
      advancedSettings0.getClientSocketTcpNoDelay();
      advancedSettings0.setClientSocketReceiveBufferSize((-648));
      advancedSettings0.getPerformancePreferencesBandwidth();
      advancedSettings0.setPerformancePreferencesLatency(5201);
      advancedSettings0.getPerformancePreferencesBandwidth();
      advancedSettings0.getBacklog();
      int int0 = advancedSettings0.getPerformancePreferencesBandwidth();
      assertEquals((-648), advancedSettings0.getClientSocketReceiveBufferSize());
      assertEquals(0, int0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.70805020110221
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketReceiveBufferSize(0);
      advancedSettings0.setSocketLinger(3390);
      advancedSettings0.setByteBufferSize(0);
      advancedSettings0.setClientSocketTrafficClass(";f{I{MUzr))$?");
      advancedSettings0.setPerformancePreferencesConnectionTime(615);
      advancedSettings0.setClientSocketTcpNoDelay(false);
      advancedSettings0.setClientIdentifier("5y-_X{$BpS");
      advancedSettings0.setDebugNonBlockingMode(true);
      advancedSettings0.setClientSocketTrafficClass("W+?c)1L/3K[-NUWO?");
      advancedSettings0.setClientIdentifier("W+?c)1L/3K[-NUWO?");
      advancedSettings0.setBacklog(0);
      advancedSettings0.setPerformancePreferencesConnectionTime(633);
      advancedSettings0.getClientSocketTcpNoDelay();
      advancedSettings0.setClientSocketReceiveBufferSize(0);
      advancedSettings0.getClientSocketReceiveBufferSize();
      advancedSettings0.setCharset((String) null);
      advancedSettings0.setPerformancePreferencesBandwidth(0);
      int int0 = advancedSettings0.getPerformancePreferencesConnectionTime();
      assertEquals("W+?c)1L/3K[-NUWO?", advancedSettings0.getClientIdentifier());
      assertEquals(633, int0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.toXML("T^.");
      boolean boolean0 = false;
      advancedSettings0.setUseDirectByteBuffer(false);
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("T^.<advanced-settings>\nT^.\t<charset>ISO-8859-1</charset>\nT^.\t<use-direct-byte-buffer>true</use-direct-byte-buffer>\nT^.\t<byte-buffer-size>65536</byte-buffer-size>\nT^.\t<backlog>0</backlog>\nT^.\t<socket-linger>-1</socket-linger>\nT^.\t<debug-non-blocking-mode>false</debug-non-blocking-mode>\nT^.\t<client-identifier>org.quickserver.net.server.impl.OptimisticClientIdentifier</client-identifier>\nT^.\t<qsobject-pool-maker>org.quickserver.util.pool.MakeQSObjectPool</qsobject-pool-maker>\nT^.\t<max-threads-for-nio-write>10</max-threads-for-nio-write>\nT^.\t<performance-preferences-connection-time>0</performance-preferences-connection-time>\nT^.\t<performance-preferences-latency>0</performance-preferences-latency>\nT^.\t<performance-preferences-bandwidth>0</performance-preferences-bandwidth>\nT^.\t<client-socket-tcp-no-delay>false</client-socket-tcp-no-delay>\nT^.</advanced-settings>\n");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // T^.<advanced-settings>
         // T^.\t<charset>ISO-8859-1</charset>
         // T^.\t<use-direct-byte-buffer>true</use-direct-byte-buffer>
         // T^.\t<byte-buffer-size>65536</byte-buffer-size>
         // T^.\t<backlog>0</backlog>
         // T^.\t<socket-linger>-1</socket-linger>
         // T^.\t<debug-non-blocking-mode>false</debug-non-blocking-mode>
         // T^.\t<client-identifier>org.quickserver.net.server.impl.OptimisticClientIdentifier</client-identifier>
         // T^.\t<qsobject-pool-maker>org.quickserver.util.pool.MakeQSObjectPool</qsobject-pool-maker>
         // T^.\t<max-threads-for-nio-write>10</max-threads-for-nio-write>
         // T^.\t<performance-preferences-connection-time>0</performance-preferences-connection-time>
         // T^.\t<performance-preferences-latency>0</performance-preferences-latency>
         // T^.\t<performance-preferences-bandwidth>0</performance-preferences-bandwidth>
         // T^.\t<client-socket-tcp-no-delay>false</client-socket-tcp-no-delay>
         // T^.</advanced-settings>
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketTcpNoDelay(false);
      advancedSettings0.setClientSocketReceiveBufferSize(0);
      advancedSettings0.setPerformancePreferencesLatency(2355);
      advancedSettings0.setUseDirectByteBuffer(false);
      advancedSettings0.setCharset("");
      advancedSettings0.setBacklog(0);
      advancedSettings0.setClientSocketSendBufferSize(1);
      advancedSettings0.setMaxThreadsForNioWrite(0);
      advancedSettings0.setUseDirectByteBuffer(false);
      advancedSettings0.setClientSocketSendBufferSize(1);
      advancedSettings0.getClientSocketSendBufferSize();
      advancedSettings0.setQSObjectPoolMaker("");
      advancedSettings0.setBacklog(2751);
      advancedSettings0.setCharset("");
      advancedSettings0.setPerformancePreferencesLatency(1718);
      advancedSettings0.setCharset("");
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("</charset>\n");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // </charset>
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=3.1354942159291497
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.getPerformancePreferencesBandwidth();
      advancedSettings0.setClientSocketTrafficClass("");
      advancedSettings0.setClientSocketSendBufferSize(0);
      advancedSettings0.setByteBufferSize(0);
      advancedSettings0.setClientSocketTrafficClass("");
      advancedSettings0.setClientSocketReceiveBufferSize(0);
      String string0 = advancedSettings0.toXML("");
      assertEquals("<advanced-settings>\n\t<charset>ISO-8859-1</charset>\n\t<use-direct-byte-buffer>true</use-direct-byte-buffer>\n\t<byte-buffer-size>65536</byte-buffer-size>\n\t<backlog>0</backlog>\n\t<socket-linger>-1</socket-linger>\n\t<debug-non-blocking-mode>false</debug-non-blocking-mode>\n\t<client-identifier>org.quickserver.net.server.impl.OptimisticClientIdentifier</client-identifier>\n\t<qsobject-pool-maker>org.quickserver.util.pool.MakeQSObjectPool</qsobject-pool-maker>\n\t<max-threads-for-nio-write>10</max-threads-for-nio-write>\n\t<performance-preferences-connection-time>0</performance-preferences-connection-time>\n\t<performance-preferences-latency>0</performance-preferences-latency>\n\t<performance-preferences-bandwidth>0</performance-preferences-bandwidth>\n\t<client-socket-tcp-no-delay>false</client-socket-tcp-no-delay>\n\t<client-socket-traffic-class></client-socket-traffic-class>\n</advanced-settings>\n", string0);
      
      advancedSettings0.setQSObjectPoolMaker("<advanced-settings>\n\t<charset>ISO-8859-1</charset>\n\t<use-direct-byte-buffer>true</use-direct-byte-buffer>\n\t<byte-buffer-size>65536</byte-buffer-size>\n\t<backlog>0</backlog>\n\t<socket-linger>-1</socket-linger>\n\t<debug-non-blocking-mode>false</debug-non-blocking-mode>\n\t<client-identifier>org.quickserver.net.server.impl.OptimisticClientIdentifier</client-identifier>\n\t<qsobject-pool-maker>org.quickserver.util.pool.MakeQSObjectPool</qsobject-pool-maker>\n\t<max-threads-for-nio-write>10</max-threads-for-nio-write>\n\t<performance-preferences-connection-time>0</performance-preferences-connection-time>\n\t<performance-preferences-latency>0</performance-preferences-latency>\n\t<performance-preferences-bandwidth>0</performance-preferences-bandwidth>\n\t<client-socket-tcp-no-delay>false</client-socket-tcp-no-delay>\n\t<client-socket-traffic-class></client-socket-traffic-class>\n</advanced-settings>\n");
      assertEquals(65536, advancedSettings0.getByteBufferSize());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=3.2188758248681983
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setBacklog(0);
      advancedSettings0.setPerformancePreferencesBandwidth(0);
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setClientSocketReceiveBufferSize((-3183));
      advancedSettings0.setClientSocketTrafficClass("");
      advancedSettings0.setClientSocketSendBufferSize(2277);
      advancedSettings0.getByteBufferSize();
      advancedSettings0.setMaxThreadsForNioWrite(65536);
      advancedSettings0.setClientIdentifier("\t<socket-linger>");
      advancedSettings0.setMaxThreadsForNioWrite(2277);
      advancedSettings0.getClientSocketReceiveBufferSize();
      advancedSettings0.toXML("");
      assertEquals("\t<socket-linger>", advancedSettings0.getClientIdentifier());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=2.70805020110221
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setQSObjectPoolMaker("");
      advancedSettings0.setUseDirectByteBuffer(true);
      advancedSettings0.setPerformancePreferencesBandwidth((-1629));
      advancedSettings0.getSocketLinger();
      advancedSettings0.setSocketLinger((-1));
      advancedSettings0.getCharset();
      advancedSettings0.setByteBufferSize(671);
      advancedSettings0.setPerformancePreferencesLatency((-1));
      advancedSettings0.setMaxThreadsForNioWrite(671);
      advancedSettings0.setClientIdentifier("");
      advancedSettings0.setClientSocketSendBufferSize((-1));
      advancedSettings0.getClientIdentifier();
      advancedSettings0.getClientSocketTcpNoDelay();
      advancedSettings0.getBacklog();
      advancedSettings0.setClientIdentifier((String) null);
      advancedSettings0.setPerformancePreferencesBandwidth((-1));
      assertEquals(671, advancedSettings0.getByteBufferSize());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=3.2958368660043296
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.toXML((String) null);
      advancedSettings0.setCharset("");
      advancedSettings0.setClientSocketTcpNoDelay(false);
      advancedSettings0.getClientSocketReceiveBufferSize();
      advancedSettings0.setClientSocketSendBufferSize(10);
      advancedSettings0.setSocketLinger((-1090));
      advancedSettings0.getClientSocketTcpNoDelay();
      advancedSettings0.setPerformancePreferencesBandwidth(10);
      advancedSettings0.getPerformancePreferencesBandwidth();
      advancedSettings0.setPerformancePreferencesLatency(0);
      advancedSettings0.setClientIdentifier("!iZn");
      advancedSettings0.setClientSocketReceiveBufferSize(10);
      advancedSettings0.setPerformancePreferencesConnectionTime(0);
      advancedSettings0.getClientSocketTcpNoDelay();
      advancedSettings0.setSocketLinger(0);
      advancedSettings0.getUseDirectByteBuffer();
      int int0 = advancedSettings0.getPerformancePreferencesLatency();
      assertEquals("!iZn", advancedSettings0.getClientIdentifier());
      assertEquals(0, int0);
  }
}
