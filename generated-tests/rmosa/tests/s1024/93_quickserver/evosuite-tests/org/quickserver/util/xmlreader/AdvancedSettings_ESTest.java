/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 16:37:49 GMT 2018
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
      advancedSettings0.getBacklog();
      advancedSettings0.setUseDirectByteBuffer(false);
      advancedSettings0.getClientSocketReceiveBufferSize();
      advancedSettings0.getClientSocketSendBufferSize();
      advancedSettings0.setSocketLinger((-499));
      assertEquals((-499), advancedSettings0.getSocketLinger());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      boolean boolean0 = true;
      advancedSettings0.setDebugNonBlockingMode(true);
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
  //Test case number: 2
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientIdentifier("");
      advancedSettings0.setPerformancePreferencesLatency(0);
      boolean boolean0 = advancedSettings0.getClientSocketTcpNoDelay();
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertFalse(boolean0);
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      int int0 = 3222;
      advancedSettings0.setMaxThreadsForNioWrite(3222);
      String string0 = "w$JTpr8;Uhe_";
      advancedSettings0.setClientIdentifier("w$JTpr8;Uhe_");
      int int1 = (-3938);
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("\t<performance-preferences-latency>");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // \t<performance-preferences-latency>
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.getQSObjectPoolMaker();
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
  //Test case number: 5
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketTrafficClass((String) null);
      advancedSettings0.setMaxThreadsForNioWrite(534);
      advancedSettings0.setBacklog(0);
      advancedSettings0.getClientSocketSendBufferSize();
      advancedSettings0.setCharset((String) null);
      advancedSettings0.setPerformancePreferencesConnectionTime(0);
      advancedSettings0.getPerformancePreferencesBandwidth();
      int int0 = advancedSettings0.getClientSocketSendBufferSize();
      assertEquals(534, advancedSettings0.getMaxThreadsForNioWrite());
      assertEquals(0, int0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketSendBufferSize((-1));
      advancedSettings0.setUseDirectByteBuffer(true);
      advancedSettings0.setUseDirectByteBuffer(false);
      advancedSettings0.setDebugNonBlockingMode(true);
      advancedSettings0.setUseDirectByteBuffer(true);
      advancedSettings0.getPerformancePreferencesBandwidth();
      advancedSettings0.getClientSocketTcpNoDelay();
      advancedSettings0.getCharset();
      boolean boolean0 = advancedSettings0.getUseDirectByteBuffer();
      assertTrue(advancedSettings0.getDebugNonBlockingMode());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setPerformancePreferencesConnectionTime(0);
      int int0 = 0;
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("ZdmP!}:");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // ZdmP!}:
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      int int0 = 0;
      advancedSettings0.setUseDirectByteBuffer(true);
      advancedSettings0.setUseDirectByteBuffer(true);
      advancedSettings0.setDebugNonBlockingMode(true);
      advancedSettings0.setClientSocketReceiveBufferSize(0);
      advancedSettings0.setClientSocketTrafficClass("}");
      advancedSettings0.setDebugNonBlockingMode(true);
      advancedSettings0.setByteBufferSize((-174));
      advancedSettings0.getDebugNonBlockingMode();
      advancedSettings0.getClientSocketTrafficClass();
      advancedSettings0.setBacklog(0);
      advancedSettings0.setUseDirectByteBuffer(true);
      advancedSettings0.getUseDirectByteBuffer();
      advancedSettings0.getPerformancePreferencesConnectionTime();
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("}");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // }
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketSendBufferSize((-1));
      advancedSettings0.setSocketLinger(1155);
      advancedSettings0.setClientIdentifier("Hyq!I&V:^O");
      advancedSettings0.setClientSocketTrafficClass("Hyq!I&V:^O");
      advancedSettings0.getCharset();
      advancedSettings0.setPerformancePreferencesConnectionTime(2517);
      advancedSettings0.setClientSocketTcpNoDelay(true);
      advancedSettings0.getCharset();
      advancedSettings0.getSocketLinger();
      advancedSettings0.getByteBufferSize();
      advancedSettings0.setDebugNonBlockingMode(true);
      advancedSettings0.setClientSocketReceiveBufferSize(198);
      advancedSettings0.getPerformancePreferencesBandwidth();
      advancedSettings0.setClientSocketTrafficClass("");
      assertEquals("Hyq!I&V:^O", advancedSettings0.getClientIdentifier());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setDebugNonBlockingMode(true);
      advancedSettings0.getClientIdentifier();
      advancedSettings0.setMaxThreadsForNioWrite(0);
      advancedSettings0.getQSObjectPoolMaker();
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
  //Test case number: 11
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setMaxThreadsForNioWrite(1197);
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.getClientSocketTrafficClass();
      assertEquals(1197, advancedSettings0.getMaxThreadsForNioWrite());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.890371757896165
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      String string0 = advancedSettings0.toXML("");
      assertEquals("<advanced-settings>\n\t<charset>ISO-8859-1</charset>\n\t<use-direct-byte-buffer>true</use-direct-byte-buffer>\n\t<byte-buffer-size>65536</byte-buffer-size>\n\t<backlog>0</backlog>\n\t<socket-linger>-1</socket-linger>\n\t<debug-non-blocking-mode>false</debug-non-blocking-mode>\n\t<client-identifier>org.quickserver.net.server.impl.OptimisticClientIdentifier</client-identifier>\n\t<qsobject-pool-maker>org.quickserver.util.pool.MakeQSObjectPool</qsobject-pool-maker>\n\t<max-threads-for-nio-write>10</max-threads-for-nio-write>\n\t<performance-preferences-connection-time>0</performance-preferences-connection-time>\n\t<performance-preferences-latency>0</performance-preferences-latency>\n\t<performance-preferences-bandwidth>0</performance-preferences-bandwidth>\n\t<client-socket-tcp-no-delay>false</client-socket-tcp-no-delay>\n</advanced-settings>\n", string0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setPerformancePreferencesLatency((-2042));
      advancedSettings0.setClientSocketTcpNoDelay(false);
      advancedSettings0.setSocketLinger(65536);
      advancedSettings0.setClientSocketReceiveBufferSize((-2042));
      advancedSettings0.getDebugNonBlockingMode();
      assertEquals((-2042), advancedSettings0.getPerformancePreferencesLatency());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      String string0 = "\t<backlog>";
      advancedSettings0.setQSObjectPoolMaker("\t<backlog>");
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

  /**
  //Test case number: 15
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("r");
        fail("Expecting exception: UnsupportedCharsetException");
      
      } catch(UnsupportedCharsetException e) {
         //
         // r
         //
         verifyException("org.quickserver.util.xmlreader.AdvancedSettings", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setPerformancePreferencesConnectionTime(1242);
      advancedSettings0.setClientSocketReceiveBufferSize(14);
      advancedSettings0.setSocketLinger(14);
      advancedSettings0.setUseDirectByteBuffer(false);
      advancedSettings0.setCharset("");
      advancedSettings0.setPerformancePreferencesConnectionTime(0);
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setPerformancePreferencesBandwidth(10);
      advancedSettings0.setClientSocketTrafficClass("s]H{GY+Tc0iCAi@)");
      advancedSettings0.setDebugNonBlockingMode(true);
      advancedSettings0.setPerformancePreferencesConnectionTime(0);
      advancedSettings0.setDebugNonBlockingMode(true);
      advancedSettings0.getBacklog();
      advancedSettings0.setBacklog(0);
      advancedSettings0.setPerformancePreferencesBandwidth(0);
      int int0 = advancedSettings0.getBacklog();
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals(0, int0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setSocketLinger(0);
      advancedSettings0.setClientIdentifier((String) null);
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setBacklog(0);
      String string0 = "h-7mO$gdP|Q>D";
      advancedSettings0.setClientSocketTcpNoDelay(true);
      advancedSettings0.setClientSocketSendBufferSize(0);
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("h-7mO$gdP|Q>D");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // h-7mO$gdP|Q>D
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setByteBufferSize((-47));
      advancedSettings0.setClientSocketReceiveBufferSize((-47));
      advancedSettings0.setByteBufferSize((-919));
      advancedSettings0.toXML("org.quickserver.net.server.impl.OptimisticClientIdentifier");
      advancedSettings0.setClientSocketReceiveBufferSize(65536);
      advancedSettings0.getClientSocketReceiveBufferSize();
      advancedSettings0.getSocketLinger();
      advancedSettings0.setPerformancePreferencesBandwidth(0);
      assertEquals(65536, advancedSettings0.getClientSocketReceiveBufferSize());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=2.70805020110221
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketTcpNoDelay(true);
      advancedSettings0.setMaxThreadsForNioWrite(65536);
      advancedSettings0.setCharset("");
      advancedSettings0.setPerformancePreferencesBandwidth((-1469));
      advancedSettings0.setPerformancePreferencesLatency(851);
      advancedSettings0.setClientIdentifier("cxwQ-");
      advancedSettings0.setBacklog((-1087));
      advancedSettings0.setUseDirectByteBuffer(false);
      advancedSettings0.setByteBufferSize(65536);
      advancedSettings0.getClientSocketTcpNoDelay();
      advancedSettings0.getSocketLinger();
      advancedSettings0.getClientIdentifier();
      advancedSettings0.setClientSocketSendBufferSize((-1469));
      advancedSettings0.getCharset();
      assertEquals("cxwQ-", advancedSettings0.getClientIdentifier());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=3.0910424533583143
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setPerformancePreferencesBandwidth(2017);
      advancedSettings0.setPerformancePreferencesConnectionTime(239);
      advancedSettings0.setClientSocketReceiveBufferSize(239);
      String string0 = advancedSettings0.toXML("<advanced-settings>\n");
      advancedSettings0.setClientSocketTcpNoDelay(true);
      advancedSettings0.toXML((String) null);
      String string1 = advancedSettings0.toXML("<advanced-settings>\n\t<charset>ISO-8859-1</charset>\n\t<use-direct-byte-buffer>true</use-direct-byte-buffer>\n\t<byte-buffer-size>65536</byte-buffer-size>\n\t<backlog>0</backlog>\n\t<socket-linger>-1</socket-linger>\n\t<debug-non-blocking-mode>false</debug-non-blocking-mode>\n\t<client-identifier>org.quickserver.net.server.impl.OptimisticClientIdentifier</client-identifier>\n\t<qsobject-pool-maker>org.quickserver.util.pool.MakeQSObjectPool</qsobject-pool-maker>\n\t<max-threads-for-nio-write>10</max-threads-for-nio-write>\n\t<performance-preferences-connection-time>239</performance-preferences-connection-time>\n\t<performance-preferences-latency>0</performance-preferences-latency>\n\t<performance-preferences-bandwidth>2017</performance-preferences-bandwidth>\n\t<client-socket-tcp-no-delay>true</client-socket-tcp-no-delay>\n\t<client-socket-receive-buffer-size>239</client-socket-receive-buffer-size>\n</advanced-settings>\n");
      String string2 = advancedSettings0.toXML(string0);
      advancedSettings0.toXML(string1);
      String string3 = advancedSettings0.toXML("6z1IC!");
      advancedSettings0.toXML("");
      advancedSettings0.toXML("");
      advancedSettings0.toXML("shS:W36:Q\"r");
      advancedSettings0.toXML(string2);
      advancedSettings0.setPerformancePreferencesBandwidth(2017);
      advancedSettings0.toXML(string3);
      advancedSettings0.toXML("<advanced-settings>\n\t<charset>ISO-8859-1</charset>\n\t<use-direct-byte-buffer>true</use-direct-byte-buffer>\n\t<byte-buffer-size>65536</byte-buffer-size>\n\t<backlog>0</backlog>\n\t<socket-linger>-1</socket-linger>\n\t<debug-non-blocking-mode>false</debug-non-blocking-mode>\n\t<client-identifier>org.quickserver.net.server.impl.OptimisticClientIdentifier</client-identifier>\n\t<qsobject-pool-maker>org.quickserver.util.pool.MakeQSObjectPool</qsobject-pool-maker>\n\t<max-threads-for-nio-write>10</max-threads-for-nio-write>\n\t<performance-preferences-connection-time>239</performance-preferences-connection-time>\n\t<performance-preferences-latency>0</performance-preferences-latency>\n\t<performance-preferences-bandwidth>2017</performance-preferences-bandwidth>\n\t<client-socket-tcp-no-delay>true</client-socket-tcp-no-delay>\n\t<client-socket-receive-buffer-size>239</client-socket-receive-buffer-size>\n</advanced-settings>\n");
      advancedSettings0.toXML(string3);
      advancedSettings0.toXML("");
      advancedSettings0.toXML("\u000684SzSR^*4u>");
      advancedSettings0.toXML("org.quickserver.util.xmlreader.AdvancedSettings");
      advancedSettings0.toXML("R*now32N~s13");
      assertEquals(2017, advancedSettings0.getPerformancePreferencesBandwidth());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientIdentifier("");
      advancedSettings0.setQSObjectPoolMaker("");
      advancedSettings0.setCharset("");
      advancedSettings0.setBacklog((-1729));
      advancedSettings0.setCharset("");
      advancedSettings0.setPerformancePreferencesConnectionTime(1);
      advancedSettings0.setPerformancePreferencesConnectionTime((-5625));
      advancedSettings0.setPerformancePreferencesConnectionTime((-2891));
      assertEquals((-2891), advancedSettings0.getPerformancePreferencesConnectionTime());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=3.1354942159291497
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setMaxThreadsForNioWrite((-1826));
      advancedSettings0.setQSObjectPoolMaker("c76(TMirDmq");
      advancedSettings0.setClientIdentifier("c76(TMirDmq");
      advancedSettings0.toXML("\t<performance-preferences-connection-time>");
      advancedSettings0.setClientIdentifier("Ssqw6BGM{Vy-%OhxE");
      advancedSettings0.setClientIdentifier("org.quickserver.net.server.impl.OptimisticClientIdentifier");
      advancedSettings0.getClientSocketTrafficClass();
      advancedSettings0.setPerformancePreferencesLatency(1);
      advancedSettings0.getSocketLinger();
      advancedSettings0.setClientSocketSendBufferSize((-1));
      advancedSettings0.toXML((String) null);
      assertEquals((-1826), advancedSettings0.getMaxThreadsForNioWrite());
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setCharset((String) null);
      advancedSettings0.setClientSocketTrafficClass("");
      advancedSettings0.setCharset((String) null);
      advancedSettings0.setQSObjectPoolMaker("");
      advancedSettings0.setPerformancePreferencesConnectionTime((-5625));
      advancedSettings0.setPerformancePreferencesConnectionTime((-5625));
      advancedSettings0.setPerformancePreferencesConnectionTime(907);
      assertEquals(907, advancedSettings0.getPerformancePreferencesConnectionTime());
  }

  /**
  //Test case number: 25
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setPerformancePreferencesLatency(0);
      advancedSettings0.setBacklog((-2063));
      advancedSettings0.setClientSocketTrafficClass("");
      advancedSettings0.setClientSocketSendBufferSize((-2063));
      advancedSettings0.setCharset("");
      advancedSettings0.setBacklog(0);
      AdvancedSettings advancedSettings1 = new AdvancedSettings();
      advancedSettings1.setClientSocketReceiveBufferSize((-1087));
      advancedSettings1.getCharset();
      advancedSettings1.setCharset("ISO-8859-1");
      advancedSettings1.setClientIdentifier("");
      advancedSettings1.setBacklog((-2063));
      advancedSettings1.getClientIdentifier();
      advancedSettings0.setClientIdentifier("FPu");
      advancedSettings1.setUseDirectByteBuffer(true);
      advancedSettings1.getDebugNonBlockingMode();
      advancedSettings1.getBacklog();
      advancedSettings1.getBacklog();
      advancedSettings1.setClientSocketReceiveBufferSize(0);
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("\t<performance-preferences-latency>");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // \t<performance-preferences-latency>
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }
}
