/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 07:34:26 GMT 2018
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
      advancedSettings0.setClientSocketSendBufferSize((-2772));
      advancedSettings0.setDebugNonBlockingMode(true);
      String string0 = "{";
      advancedSettings0.setClientSocketReceiveBufferSize((-2772));
      advancedSettings0.setQSObjectPoolMaker("{");
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("QpH/7CUona^&Pk");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // QpH/7CUona^&Pk
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setMaxThreadsForNioWrite(0);
      advancedSettings0.setDebugNonBlockingMode(true);
      advancedSettings0.getClientIdentifier();
      advancedSettings0.getPerformancePreferencesBandwidth();
      advancedSettings0.getClientSocketTcpNoDelay();
      advancedSettings0.getByteBufferSize();
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setMaxThreadsForNioWrite(65536);
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("9VI9FAm)=s?tL/?chf");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // 9VI9FAm)=s?tL/?chf
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setMaxThreadsForNioWrite(668);
      advancedSettings0.setBacklog(0);
      advancedSettings0.setQSObjectPoolMaker("L'JX]:%l_/j0F&");
      advancedSettings0.setQSObjectPoolMaker("03Nn1%}\"{FuB,&K");
      advancedSettings0.setPerformancePreferencesLatency(2865);
      advancedSettings0.setPerformancePreferencesLatency(0);
      advancedSettings0.getUseDirectByteBuffer();
      advancedSettings0.setByteBufferSize(1);
      advancedSettings0.getCharset();
      advancedSettings0.setClientSocketSendBufferSize(0);
      advancedSettings0.setQSObjectPoolMaker("");
      advancedSettings0.getCharset();
      advancedSettings0.setPerformancePreferencesBandwidth(0);
      advancedSettings0.setPerformancePreferencesBandwidth((-193));
      advancedSettings0.getCharset();
      advancedSettings0.setQSObjectPoolMaker("ISO-8859-1");
      advancedSettings0.setPerformancePreferencesConnectionTime(2865);
      assertEquals(668, advancedSettings0.getMaxThreadsForNioWrite());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setCharset("");
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setPerformancePreferencesConnectionTime(0);
      advancedSettings0.getDebugNonBlockingMode();
      advancedSettings0.getPerformancePreferencesLatency();
      advancedSettings0.setPerformancePreferencesLatency(0);
      advancedSettings0.setPerformancePreferencesLatency((-1));
      advancedSettings0.getDebugNonBlockingMode();
      advancedSettings0.setByteBufferSize(1);
      advancedSettings0.setClientSocketReceiveBufferSize(0);
      advancedSettings0.getSocketLinger();
      advancedSettings0.setUseDirectByteBuffer(false);
      advancedSettings0.setMaxThreadsForNioWrite(0);
      advancedSettings0.getUseDirectByteBuffer();
      advancedSettings0.setClientSocketReceiveBufferSize((-1));
      int int0 = advancedSettings0.getClientSocketReceiveBufferSize();
      assertEquals((-1), int0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientIdentifier("Z_+Y@dXxTGK-oqgn]&{");
      advancedSettings0.setPerformancePreferencesBandwidth(1202);
      advancedSettings0.setUseDirectByteBuffer(true);
      advancedSettings0.setClientIdentifier("");
      advancedSettings0.setBacklog((-4119));
      advancedSettings0.setByteBufferSize(0);
      advancedSettings0.getSocketLinger();
      advancedSettings0.getPerformancePreferencesLatency();
      int int0 = advancedSettings0.getSocketLinger();
      assertEquals(1202, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals((-1), int0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setPerformancePreferencesConnectionTime(0);
      advancedSettings0.getClientSocketSendBufferSize();
      advancedSettings0.getClientSocketReceiveBufferSize();
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset(";G_uzo9.^v(");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // ;G_uzo9.^v(
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.getMaxThreadsForNioWrite();
      advancedSettings0.setQSObjectPoolMaker("");
      advancedSettings0.setClientIdentifier("");
      advancedSettings0.setPerformancePreferencesConnectionTime(3442);
      advancedSettings0.getClientSocketTcpNoDelay();
      advancedSettings0.getByteBufferSize();
      advancedSettings0.getPerformancePreferencesLatency();
      advancedSettings0.getPerformancePreferencesConnectionTime();
      int int0 = advancedSettings0.getSocketLinger();
      assertEquals(3442, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertEquals((-1), int0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("tqMVO");
        fail("Expecting exception: UnsupportedCharsetException");
      
      } catch(UnsupportedCharsetException e) {
         //
         // tqMVO
         //
         verifyException("org.quickserver.util.xmlreader.AdvancedSettings", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientIdentifier("");
      advancedSettings0.setClientSocketSendBufferSize((-1));
      advancedSettings0.getClientIdentifier();
      advancedSettings0.setPerformancePreferencesConnectionTime((-376));
      assertEquals((-376), advancedSettings0.getPerformancePreferencesConnectionTime());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setByteBufferSize(1192);
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setByteBufferSize(1192);
      advancedSettings0.setUseDirectByteBuffer(true);
      advancedSettings0.getClientSocketTrafficClass();
      assertEquals(1192, advancedSettings0.getByteBufferSize());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setBacklog(3279);
      advancedSettings0.setPerformancePreferencesBandwidth(3279);
      advancedSettings0.setDebugNonBlockingMode(false);
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setUseDirectByteBuffer(false);
      advancedSettings0.setPerformancePreferencesLatency((-1066));
      advancedSettings0.setClientIdentifier("org.quickserver.util.pool.MakeQSObjectPool");
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
  //Test case number: 11
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      int int0 = 2442;
      int int1 = 2711;
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setClientSocketTrafficClass("");
      String string0 = "j";
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
  //Test case number: 12
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setBacklog(0);
      advancedSettings0.setByteBufferSize(0);
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals(0, advancedSettings0.getBacklog());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=3.0910424533583143
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketTcpNoDelay(false);
      advancedSettings0.toXML("jwXZs6UCn*'qcH/Ph");
      int int0 = 1598;
      advancedSettings0.setQSObjectPoolMaker("'}B2Q\"A");
      advancedSettings0.setClientSocketReceiveBufferSize(1598);
      String string0 = "s! 3";
      advancedSettings0.setQSObjectPoolMaker("s! 3");
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("jwXZs6UCn*'qcH/Ph");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // jwXZs6UCn*'qcH/Ph
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
      advancedSettings0.toXML((String) null);
      advancedSettings0.toXML("");
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setClientSocketReceiveBufferSize(2139);
      advancedSettings0.setBacklog((-2034));
      advancedSettings0.setQSObjectPoolMaker("1t1H}Pu ;?OnzMs_K");
      advancedSettings0.setByteBufferSize((-1978));
      advancedSettings0.setByteBufferSize(2139);
      advancedSettings0.setPerformancePreferencesBandwidth(2139);
      assertEquals(2139, advancedSettings0.getByteBufferSize());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      int int0 = 951;
      advancedSettings0.setPerformancePreferencesConnectionTime(951);
      advancedSettings0.setClientSocketTrafficClass("");
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("}L=(imtN*");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // }L=(imtN*
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
      advancedSettings0.setClientIdentifier((String) null);
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setMaxThreadsForNioWrite((-598));
      advancedSettings0.setUseDirectByteBuffer(false);
      advancedSettings0.setClientSocketSendBufferSize(3663);
      advancedSettings0.toXML((String) null);
      advancedSettings0.getClientSocketReceiveBufferSize();
      advancedSettings0.setClientSocketTcpNoDelay(true);
      advancedSettings0.getMaxThreadsForNioWrite();
      advancedSettings0.setClientSocketTcpNoDelay(true);
      advancedSettings0.getMaxThreadsForNioWrite();
      advancedSettings0.getQSObjectPoolMaker();
      int int0 = advancedSettings0.getMaxThreadsForNioWrite();
      assertEquals((-598), int0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketTcpNoDelay(false);
      int int0 = 0;
      advancedSettings0.setByteBufferSize(0);
      advancedSettings0.setUseDirectByteBuffer(false);
      advancedSettings0.setClientSocketTcpNoDelay(false);
      advancedSettings0.setSocketLinger(3805);
      advancedSettings0.setQSObjectPoolMaker("f`^");
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
  //Test case number: 18
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketTrafficClass("N=MqX!3<");
      advancedSettings0.setCharset("");
      advancedSettings0.setClientIdentifier("");
      int int0 = advancedSettings0.getBacklog();
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals(0, int0);
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setUseDirectByteBuffer(true);
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("!hl4){#");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // !hl4){#
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=3.1354942159291497
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setPerformancePreferencesConnectionTime(10);
      advancedSettings0.setPerformancePreferencesLatency((-1795));
      advancedSettings0.setClientSocketReceiveBufferSize((-1795));
      advancedSettings0.setClientSocketReceiveBufferSize(2031);
      advancedSettings0.setMaxThreadsForNioWrite((-2569));
      int int0 = 0;
      advancedSettings0.toXML("");
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("<advanced-settings>\n\t<charset>ISO-8859-1</charset>\n\t<use-direct-byte-buffer>true</use-direct-byte-buffer>\n\t<byte-buffer-size>65536</byte-buffer-size>\n\t<backlog>0</backlog>\n\t<socket-linger>-1</socket-linger>\n\t<debug-non-blocking-mode>false</debug-non-blocking-mode>\n\t<client-identifier>org.quickserver.net.server.impl.OptimisticClientIdentifier</client-identifier>\n\t<qsobject-pool-maker>org.quickserver.util.pool.MakeQSObjectPool</qsobject-pool-maker>\n\t<max-threads-for-nio-write>-2569</max-threads-for-nio-write>\n\t<performance-preferences-connection-time>10</performance-preferences-connection-time>\n\t<performance-preferences-latency>-1795</performance-preferences-latency>\n\t<performance-preferences-bandwidth>0</performance-preferences-bandwidth>\n\t<client-socket-tcp-no-delay>false</client-socket-tcp-no-delay>\n\t<client-socket-receive-buffer-size>2031</client-socket-receive-buffer-size>\n</advanced-settings>\n");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // <advanced-settings>
         // \t<charset>ISO-8859-1</charset>
         // \t<use-direct-byte-buffer>true</use-direct-byte-buffer>
         // \t<byte-buffer-size>65536</byte-buffer-size>
         // \t<backlog>0</backlog>
         // \t<socket-linger>-1</socket-linger>
         // \t<debug-non-blocking-mode>false</debug-non-blocking-mode>
         // \t<client-identifier>org.quickserver.net.server.impl.OptimisticClientIdentifier</client-identifier>
         // \t<qsobject-pool-maker>org.quickserver.util.pool.MakeQSObjectPool</qsobject-pool-maker>
         // \t<max-threads-for-nio-write>-2569</max-threads-for-nio-write>
         // \t<performance-preferences-connection-time>10</performance-preferences-connection-time>
         // \t<performance-preferences-latency>-1795</performance-preferences-latency>
         // \t<performance-preferences-bandwidth>0</performance-preferences-bandwidth>
         // \t<client-socket-tcp-no-delay>false</client-socket-tcp-no-delay>
         // \t<client-socket-receive-buffer-size>2031</client-socket-receive-buffer-size>
         // </advanced-settings>
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=3.2958368660043296
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setPerformancePreferencesConnectionTime((-107));
      advancedSettings0.setClientSocketSendBufferSize(752);
      advancedSettings0.getByteBufferSize();
      advancedSettings0.setUseDirectByteBuffer(false);
      advancedSettings0.setUseDirectByteBuffer(false);
      advancedSettings0.setSocketLinger(0);
      advancedSettings0.setPerformancePreferencesConnectionTime(1886);
      advancedSettings0.setPerformancePreferencesConnectionTime(752);
      advancedSettings0.getClientIdentifier();
      advancedSettings0.getMaxThreadsForNioWrite();
      advancedSettings0.setClientSocketSendBufferSize(10);
      advancedSettings0.setClientIdentifier("org.quickserver.net.server.impl.OptimisticClientIdentifier");
      advancedSettings0.setUseDirectByteBuffer(false);
      advancedSettings0.setClientSocketTrafficClass("org.quickserver.net.server.impl.OptimisticClientIdentifier");
      advancedSettings0.getPerformancePreferencesBandwidth();
      advancedSettings0.setClientSocketTcpNoDelay(false);
      advancedSettings0.setClientSocketReceiveBufferSize(65536);
      advancedSettings0.toXML("");
      advancedSettings0.setCharset("");
      advancedSettings0.toXML("org.quickserver.net.server.impl.OptimisticClientIdentifier");
      assertEquals(752, advancedSettings0.getPerformancePreferencesConnectionTime());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientIdentifier("\"S%QmVu*CZ}pT+1");
      advancedSettings0.setClientIdentifier("\"S%QmVu*CZ}pT+1");
      advancedSettings0.setByteBufferSize(0);
      advancedSettings0.setClientSocketTrafficClass((String) null);
      advancedSettings0.setPerformancePreferencesBandwidth(665);
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.getPerformancePreferencesLatency();
      advancedSettings0.setQSObjectPoolMaker("\"S%QmVu*CZ}pT+1");
      advancedSettings0.setSocketLinger(2012);
      advancedSettings0.setClientIdentifier((String) null);
      advancedSettings0.getClientSocketTcpNoDelay();
      advancedSettings0.setByteBufferSize(0);
      advancedSettings0.getClientSocketTrafficClass();
      advancedSettings0.getDebugNonBlockingMode();
      advancedSettings0.setCharset((String) null);
      advancedSettings0.getClientSocketTrafficClass();
      advancedSettings0.setSocketLinger(0);
      advancedSettings0.setClientIdentifier("");
      int int0 = advancedSettings0.getBacklog();
      assertEquals(665, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals(0, int0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setSocketLinger((-4268));
      advancedSettings0.setQSObjectPoolMaker("");
      advancedSettings0.setClientSocketTcpNoDelay(false);
      boolean boolean0 = true;
      advancedSettings0.setClientSocketTrafficClass("");
      advancedSettings0.setCharset("");
      advancedSettings0.setDebugNonBlockingMode(true);
      advancedSettings0.setClientSocketSendBufferSize((-4268));
      advancedSettings0.setCharset((String) null);
      int int0 = 2142;
      advancedSettings0.setClientSocketTrafficClass("</backlog>\n");
      advancedSettings0.setMaxThreadsForNioWrite((-4268));
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setByteBufferSize(3145);
      advancedSettings0.setMaxThreadsForNioWrite((-4268));
      advancedSettings0.setMaxThreadsForNioWrite(2142);
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("\t<use-direct-byte-buffer>");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // \t<use-direct-byte-buffer>
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=2.833213344056216
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setUseDirectByteBuffer(false);
      advancedSettings0.setSocketLinger(1163);
      advancedSettings0.setUseDirectByteBuffer(false);
      advancedSettings0.setClientSocketSendBufferSize(1163);
      advancedSettings0.getByteBufferSize();
      advancedSettings0.getByteBufferSize();
      advancedSettings0.setClientSocketTrafficClass((String) null);
      advancedSettings0.getClientSocketTrafficClass();
      advancedSettings0.getPerformancePreferencesLatency();
      advancedSettings0.setPerformancePreferencesLatency(0);
      advancedSettings0.setClientSocketTrafficClass((String) null);
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setQSObjectPoolMaker((String) null);
      advancedSettings0.getCharset();
      advancedSettings0.setClientIdentifier("org.quickserver.util.pool.MakeQSObjectPool");
      advancedSettings0.getSocketLinger();
      advancedSettings0.setByteBufferSize(0);
      advancedSettings0.getUseDirectByteBuffer();
      advancedSettings0.setCharset("ISO-8859-1");
      assertEquals("org.quickserver.util.pool.MakeQSObjectPool", advancedSettings0.getClientIdentifier());
  }
}
