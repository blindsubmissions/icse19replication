/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 18:58:25 GMT 2018
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
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setSocketLinger(97);
      advancedSettings0.getDebugNonBlockingMode();
      advancedSettings0.setClientSocketTrafficClass("");
      advancedSettings0.setBacklog(858);
      advancedSettings0.setClientIdentifier("d:syl>dE[9#n<G|_");
      advancedSettings0.getBacklog();
      advancedSettings0.setClientSocketReceiveBufferSize(151);
      advancedSettings0.setClientIdentifier("");
      advancedSettings0.getClientSocketSendBufferSize();
      advancedSettings0.setByteBufferSize(858);
      advancedSettings0.setUseDirectByteBuffer(false);
      advancedSettings0.setClientSocketTrafficClass("");
      advancedSettings0.getClientIdentifier();
      assertEquals(97, advancedSettings0.getSocketLinger());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setQSObjectPoolMaker("}:mM");
      advancedSettings0.setBacklog((-167));
      advancedSettings0.setByteBufferSize((-167));
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      
      advancedSettings0.setClientSocketTcpNoDelay(true);
      advancedSettings0.setClientSocketSendBufferSize(0);
      advancedSettings0.getCharset();
      advancedSettings0.getClientSocketTrafficClass();
      boolean boolean0 = advancedSettings0.getUseDirectByteBuffer();
      assertTrue(advancedSettings0.getClientSocketTcpNoDelay());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setSocketLinger((-1));
      advancedSettings0.setClientSocketReceiveBufferSize(0);
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("pnhoLGrG");
        fail("Expecting exception: UnsupportedCharsetException");
      
      } catch(UnsupportedCharsetException e) {
         //
         // pnhoLGrG
         //
         verifyException("org.quickserver.util.xmlreader.AdvancedSettings", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setBacklog(65536);
      advancedSettings0.setUseDirectByteBuffer(false);
      advancedSettings0.setDebugNonBlockingMode(false);
      String string0 = "tw\\x\\=nRcZ";
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("twx=nRcZ");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // twx=nRcZ
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketSendBufferSize((-1));
      advancedSettings0.setClientIdentifier("</client-socket-receive-buffer-size>\n");
      AdvancedSettings advancedSettings1 = new AdvancedSettings();
      advancedSettings1.setClientSocketSendBufferSize(52);
      advancedSettings0.setPerformancePreferencesLatency((-1));
      advancedSettings1.getClientSocketTrafficClass();
      advancedSettings1.setMaxThreadsForNioWrite((-1));
      advancedSettings0.setPerformancePreferencesConnectionTime(4);
      advancedSettings1.setCharset("");
      advancedSettings1.setClientSocketReceiveBufferSize(4);
      advancedSettings1.getPerformancePreferencesConnectionTime();
      advancedSettings1.setMaxThreadsForNioWrite((-170));
      advancedSettings1.setPerformancePreferencesLatency(2527);
      advancedSettings0.setClientSocketTcpNoDelay(false);
      advancedSettings0.setSocketLinger(4);
      advancedSettings1.getPerformancePreferencesConnectionTime();
      advancedSettings0.setPerformancePreferencesLatency(4);
      assertEquals(4, advancedSettings0.getPerformancePreferencesConnectionTime());
      
      AdvancedSettings advancedSettings2 = new AdvancedSettings();
      int int0 = advancedSettings2.getPerformancePreferencesLatency();
      assertEquals(0, int0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientIdentifier("l6^AXN}+");
      advancedSettings0.setMaxThreadsForNioWrite(1);
      advancedSettings0.getSocketLinger();
      advancedSettings0.setClientSocketReceiveBufferSize(0);
      assertEquals("l6^AXN}+", advancedSettings0.getClientIdentifier());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setPerformancePreferencesLatency(14);
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("pnhoLGrG");
        fail("Expecting exception: UnsupportedCharsetException");
      
      } catch(UnsupportedCharsetException e) {
         //
         // pnhoLGrG
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
      advancedSettings0.setClientSocketTrafficClass("");
      int int0 = 0;
      advancedSettings0.setBacklog(0);
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset(":mnNE)&qN9<Sp");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // :mnNE)&qN9<Sp
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
      int int0 = 0;
      String string0 = "";
      advancedSettings0.setQSObjectPoolMaker("");
      advancedSettings0.setClientSocketTrafficClass("");
      advancedSettings0.setClientSocketReceiveBufferSize(0);
      String string1 = "wQYZ+N0";
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("wQYZ+N0");
        fail("Expecting exception: UnsupportedCharsetException");
      
      } catch(UnsupportedCharsetException e) {
         //
         // wQYZ+N0
         //
         verifyException("org.quickserver.util.xmlreader.AdvancedSettings", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.833213344056216
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setQSObjectPoolMaker("\t<qsobject-pool-maker>");
      advancedSettings0.setBacklog(0);
      advancedSettings0.setClientSocketSendBufferSize(0);
      advancedSettings0.setClientSocketTrafficClass("");
      advancedSettings0.setDebugNonBlockingMode(false);
      advancedSettings0.setDebugNonBlockingMode(false);
      advancedSettings0.setUseDirectByteBuffer(true);
      advancedSettings0.setSocketLinger(0);
      advancedSettings0.setPerformancePreferencesLatency((-860));
      advancedSettings0.setPerformancePreferencesBandwidth(921);
      advancedSettings0.setPerformancePreferencesLatency(1);
      advancedSettings0.getSocketLinger();
      advancedSettings0.setClientSocketSendBufferSize(3711);
      advancedSettings0.getCharset();
      advancedSettings0.getClientSocketTcpNoDelay();
      advancedSettings0.setDebugNonBlockingMode(true);
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.getPerformancePreferencesConnectionTime();
      advancedSettings0.getDebugNonBlockingMode();
      advancedSettings0.setDebugNonBlockingMode(true);
      advancedSettings0.setClientSocketTrafficClass("\t<qsobject-pool-maker>");
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setClientIdentifier("ISO-8859-1");
      advancedSettings0.setClientSocketTrafficClass("\t<client-socket-send-buffer-size>");
      assertEquals(1, advancedSettings0.getPerformancePreferencesLatency());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketTcpNoDelay(false);
      advancedSettings0.setCharset("");
      advancedSettings0.setClientSocketReceiveBufferSize((-737));
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("pnhoLGrG");
        fail("Expecting exception: UnsupportedCharsetException");
      
      } catch(UnsupportedCharsetException e) {
         //
         // pnhoLGrG
         //
         verifyException("org.quickserver.util.xmlreader.AdvancedSettings", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setMaxThreadsForNioWrite((-3777));
      advancedSettings0.setSocketLinger((-1));
      advancedSettings0.setClientSocketTcpNoDelay(true);
      advancedSettings0.getUseDirectByteBuffer();
      advancedSettings0.setByteBufferSize(0);
      advancedSettings0.setClientIdentifier((String) null);
      advancedSettings0.setCharset("");
      advancedSettings0.setClientSocketTrafficClass("");
      advancedSettings0.setClientSocketTcpNoDelay(true);
      advancedSettings0.setClientSocketReceiveBufferSize(439);
      advancedSettings0.setDebugNonBlockingMode(true);
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setPerformancePreferencesConnectionTime((-980));
      advancedSettings0.setByteBufferSize((-980));
      advancedSettings0.setPerformancePreferencesLatency(1);
      advancedSettings0.getPerformancePreferencesBandwidth();
      advancedSettings0.setCharset("");
      advancedSettings0.setClientSocketTcpNoDelay(false);
      advancedSettings0.getPerformancePreferencesConnectionTime();
      advancedSettings0.setPerformancePreferencesConnectionTime((-1));
      advancedSettings0.getSocketLinger();
      advancedSettings0.getPerformancePreferencesLatency();
      advancedSettings0.getPerformancePreferencesLatency();
      advancedSettings0.setPerformancePreferencesConnectionTime((-1));
      int int0 = advancedSettings0.getMaxThreadsForNioWrite();
      assertTrue(advancedSettings0.getDebugNonBlockingMode());
      assertEquals((-3777), int0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
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
  //Test case number: 13
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      String string0 = null;
      advancedSettings0.setByteBufferSize(0);
      advancedSettings0.setClientSocketReceiveBufferSize(10);
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("?");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // ?
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      int int0 = (-1);
      advancedSettings0.setByteBufferSize(10);
      advancedSettings0.setClientSocketReceiveBufferSize(10);
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("?");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // ?
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketSendBufferSize(0);
      advancedSettings0.setMaxThreadsForNioWrite((-3595));
      advancedSettings0.setClientSocketSendBufferSize(1);
      advancedSettings0.setClientSocketTcpNoDelay(true);
      advancedSettings0.getBacklog();
      advancedSettings0.getMaxThreadsForNioWrite();
      advancedSettings0.setCharset("");
      advancedSettings0.setSocketLinger((-1304));
      int int0 = advancedSettings0.getSocketLinger();
      assertEquals((-1304), int0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.getClientIdentifier();
      advancedSettings0.setClientSocketTrafficClass("");
      advancedSettings0.setClientSocketTrafficClass("");
      advancedSettings0.setMaxThreadsForNioWrite(0);
      advancedSettings0.setDebugNonBlockingMode(false);
      advancedSettings0.setClientSocketTrafficClass("");
      advancedSettings0.setQSObjectPoolMaker("org.quickserver.net.server.impl.OptimisticClientIdentifier");
      advancedSettings0.getClientSocketTrafficClass();
      advancedSettings0.getClientSocketReceiveBufferSize();
      advancedSettings0.setPerformancePreferencesLatency(639);
      assertEquals(639, advancedSettings0.getPerformancePreferencesLatency());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.getClientIdentifier();
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
  /*Coverage entropy=3.401197381662154
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setPerformancePreferencesBandwidth(1);
      advancedSettings0.toXML((String) null);
      advancedSettings0.setCharset((String) null);
      advancedSettings0.getPerformancePreferencesLatency();
      advancedSettings0.setClientSocketTcpNoDelay(true);
      advancedSettings0.setPerformancePreferencesBandwidth((-275));
      advancedSettings0.setMaxThreadsForNioWrite(480);
      advancedSettings0.getPerformancePreferencesLatency();
      advancedSettings0.setByteBufferSize((-1099));
      advancedSettings0.setUseDirectByteBuffer(false);
      advancedSettings0.setClientSocketTcpNoDelay(true);
      advancedSettings0.setBacklog(0);
      advancedSettings0.setPerformancePreferencesLatency(0);
      advancedSettings0.toXML("");
      advancedSettings0.setQSObjectPoolMaker("OA(wM}.ZO/g>oL");
      advancedSettings0.getCharset();
      advancedSettings0.setClientSocketTcpNoDelay(false);
      advancedSettings0.getByteBufferSize();
      advancedSettings0.setSocketLinger(65536);
      advancedSettings0.getClientSocketSendBufferSize();
      advancedSettings0.setClientSocketSendBufferSize(0);
      advancedSettings0.setUseDirectByteBuffer(true);
      advancedSettings0.getUseDirectByteBuffer();
      advancedSettings0.setUseDirectByteBuffer(false);
      advancedSettings0.getClientSocketSendBufferSize();
      advancedSettings0.setClientSocketTrafficClass("[X");
      advancedSettings0.setBacklog(0);
      assertEquals((-275), advancedSettings0.getPerformancePreferencesBandwidth());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setBacklog(0);
      advancedSettings0.setClientIdentifier("");
      advancedSettings0.setUseDirectByteBuffer(true);
      advancedSettings0.setBacklog(980);
      advancedSettings0.getMaxThreadsForNioWrite();
      advancedSettings0.setPerformancePreferencesLatency(10);
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("[2gJ[V%b");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // [2gJ[V%b
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=3.2188758248681983
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketSendBufferSize((-1));
      advancedSettings0.setClientSocketSendBufferSize(1041);
      advancedSettings0.setClientSocketSendBufferSize(1041);
      advancedSettings0.setMaxThreadsForNioWrite(383);
      advancedSettings0.getPerformancePreferencesBandwidth();
      advancedSettings0.getClientIdentifier();
      advancedSettings0.setPerformancePreferencesConnectionTime((-375));
      advancedSettings0.getClientSocketReceiveBufferSize();
      advancedSettings0.setPerformancePreferencesBandwidth(0);
      advancedSettings0.setQSObjectPoolMaker("org.quickserver.net.server.impl.OptimisticClientIdentifier");
      advancedSettings0.getMaxThreadsForNioWrite();
      advancedSettings0.setMaxThreadsForNioWrite((-1));
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.toXML("@xI|>E1@LmEySy4EJ");
      advancedSettings0.setClientSocketSendBufferSize((-184));
      advancedSettings0.setClientSocketTcpNoDelay(true);
      advancedSettings0.setClientIdentifier("#&Xi");
      advancedSettings0.getMaxThreadsForNioWrite();
      advancedSettings0.setClientIdentifier("");
      assertEquals("#&Xi", advancedSettings0.getClientIdentifier());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=3.2580965380214835
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setUseDirectByteBuffer(true);
      advancedSettings0.setCharset((String) null);
      advancedSettings0.setBacklog((-426));
      advancedSettings0.setBacklog((-426));
      advancedSettings0.setQSObjectPoolMaker("");
      advancedSettings0.setPerformancePreferencesBandwidth((-426));
      advancedSettings0.setPerformancePreferencesConnectionTime((-426));
      advancedSettings0.setSocketLinger((-732));
      advancedSettings0.toXML("");
      advancedSettings0.getDebugNonBlockingMode();
      advancedSettings0.toXML("");
      advancedSettings0.setClientSocketTrafficClass("");
      advancedSettings0.getUseDirectByteBuffer();
      advancedSettings0.getByteBufferSize();
      advancedSettings0.setQSObjectPoolMaker("\t<client-identifier>");
      advancedSettings0.getByteBufferSize();
      advancedSettings0.toXML("<advanced-settings>\n\t<charset>ISO-8859-1</charset>\n\t<use-direct-byte-buffer>true</use-direct-byte-buffer>\n\t<byte-buffer-size>65536</byte-buffer-size>\n\t<backlog>0</backlog>\n\t<socket-linger>-732</socket-linger>\n\t<debug-non-blocking-mode>false</debug-non-blocking-mode>\n\t<client-identifier>org.quickserver.net.server.impl.OptimisticClientIdentifier</client-identifier>\n\t<qsobject-pool-maker></qsobject-pool-maker>\n\t<max-threads-for-nio-write>10</max-threads-for-nio-write>\n\t<performance-preferences-connection-time>-426</performance-preferences-connection-time>\n\t<performance-preferences-latency>0</performance-preferences-latency>\n\t<performance-preferences-bandwidth>-426</performance-preferences-bandwidth>\n\t<client-socket-tcp-no-delay>false</client-socket-tcp-no-delay>\n</advanced-settings>\n");
      assertEquals((-426), advancedSettings0.getPerformancePreferencesBandwidth());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setUseDirectByteBuffer(true);
      advancedSettings0.setBacklog((-1));
      advancedSettings0.setPerformancePreferencesConnectionTime((-438));
      advancedSettings0.setPerformancePreferencesConnectionTime((-438));
      String string0 = "=`";
      advancedSettings0.setClientSocketSendBufferSize((-438));
      advancedSettings0.setClientIdentifier("=`");
      int int0 = 1;
      advancedSettings0.setBacklog(1);
      advancedSettings0.setCharset("");
      advancedSettings0.setCharset("");
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("=`");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // =`
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketTrafficClass("");
      advancedSettings0.setCharset((String) null);
      advancedSettings0.setDebugNonBlockingMode(true);
      advancedSettings0.setPerformancePreferencesLatency(2107);
      String string0 = "2/^s)D#+V43OvDUat";
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("2/^s)D#+V43OvDUat");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // 2/^s)D#+V43OvDUat
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=3.332204510175204
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setSocketLinger(10);
      advancedSettings0.getCharset();
      advancedSettings0.setMaxThreadsForNioWrite(108);
      advancedSettings0.setClientSocketSendBufferSize(10);
      advancedSettings0.getClientSocketTrafficClass();
      advancedSettings0.setMaxThreadsForNioWrite(469);
      advancedSettings0.setPerformancePreferencesConnectionTime(0);
      advancedSettings0.getPerformancePreferencesBandwidth();
      advancedSettings0.setDebugNonBlockingMode(false);
      advancedSettings0.setClientIdentifier("ISO-8859-1");
      advancedSettings0.setBacklog(1461);
      advancedSettings0.setPerformancePreferencesBandwidth(0);
      advancedSettings0.setPerformancePreferencesBandwidth(10);
      advancedSettings0.setPerformancePreferencesBandwidth(0);
      advancedSettings0.getMaxThreadsForNioWrite();
      advancedSettings0.setClientSocketSendBufferSize(0);
      advancedSettings0.setClientSocketReceiveBufferSize(469);
      advancedSettings0.getCharset();
      advancedSettings0.setClientIdentifier("ISO-8859-1");
      advancedSettings0.getUseDirectByteBuffer();
      advancedSettings0.setPerformancePreferencesLatency(469);
      advancedSettings0.getClientSocketTrafficClass();
      advancedSettings0.getMaxThreadsForNioWrite();
      advancedSettings0.toXML("");
      advancedSettings0.getSocketLinger();
      advancedSettings0.setMaxThreadsForNioWrite(0);
      advancedSettings0.setDebugNonBlockingMode(true);
      assertEquals(0, advancedSettings0.getMaxThreadsForNioWrite());
  }
}