/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 16:56:04 GMT 2018
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
      advancedSettings0.getPerformancePreferencesBandwidth();
      advancedSettings0.setClientIdentifier("*X=]vHpM#{`]MF");
      advancedSettings0.setSocketLinger(1);
      advancedSettings0.setPerformancePreferencesBandwidth((-1481));
      advancedSettings0.setBacklog(70);
      advancedSettings0.setClientSocketSendBufferSize(0);
      advancedSettings0.setPerformancePreferencesBandwidth(0);
      int int0 = advancedSettings0.getSocketLinger();
      assertEquals("*X=]vHpM#{`]MF", advancedSettings0.getClientIdentifier());
      assertEquals(1, int0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setSocketLinger((-5471));
      advancedSettings0.getClientSocketReceiveBufferSize();
      advancedSettings0.getUseDirectByteBuffer();
      advancedSettings0.setBacklog(65536);
      assertEquals(65536, advancedSettings0.getBacklog());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      String string0 = "aT8s";
      advancedSettings0.setPerformancePreferencesBandwidth((-1));
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("aT8s");
        fail("Expecting exception: UnsupportedCharsetException");
      
      } catch(UnsupportedCharsetException e) {
         //
         // aT8s
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
      advancedSettings0.setClientSocketTcpNoDelay(false);
      advancedSettings0.setByteBufferSize(1);
      advancedSettings0.setClientSocketTcpNoDelay(true);
      advancedSettings0.setByteBufferSize(547);
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setClientIdentifier("");
      assertTrue(advancedSettings0.getClientSocketTcpNoDelay());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setPerformancePreferencesLatency(0);
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setPerformancePreferencesLatency((-1350));
      advancedSettings0.setBacklog((-2949));
      advancedSettings0.setPerformancePreferencesConnectionTime(1);
      advancedSettings0.setClientIdentifier("\">SOKw1c");
      assertEquals((-1350), advancedSettings0.getPerformancePreferencesLatency());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketTcpNoDelay(true);
      advancedSettings0.setClientSocketSendBufferSize(1700);
      advancedSettings0.setClientSocketReceiveBufferSize((-871));
      advancedSettings0.getDebugNonBlockingMode();
      advancedSettings0.setClientSocketSendBufferSize(0);
      advancedSettings0.getMaxThreadsForNioWrite();
      advancedSettings0.getDebugNonBlockingMode();
      assertEquals(0, advancedSettings0.getClientSocketSendBufferSize());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      String string0 = "</performance-preferences-latency>\n";
      int int0 = 15;
      advancedSettings0.setMaxThreadsForNioWrite(15);
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("</performance-preferences-latency>\n");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // </performance-preferences-latency>
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
      advancedSettings0.setClientSocketTrafficClass("Q~Y");
      advancedSettings0.setDebugNonBlockingMode(false);
      advancedSettings0.getBacklog();
      advancedSettings0.setClientSocketTrafficClass("[`*");
      advancedSettings0.setByteBufferSize(3029);
      assertEquals(3029, advancedSettings0.getByteBufferSize());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setByteBufferSize((-2254));
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      
      AdvancedSettings advancedSettings1 = new AdvancedSettings();
      boolean boolean0 = advancedSettings1.getClientSocketTcpNoDelay();
      assertEquals(0, advancedSettings1.getPerformancePreferencesBandwidth());
      assertEquals((-1), advancedSettings1.getSocketLinger());
      assertFalse(boolean0);
      assertTrue(advancedSettings1.getUseDirectByteBuffer());
      assertEquals(0, advancedSettings1.getPerformancePreferencesConnectionTime());
      assertEquals(0, advancedSettings1.getPerformancePreferencesLatency());
      assertEquals(10, advancedSettings1.getMaxThreadsForNioWrite());
      assertEquals("ISO-8859-1", advancedSettings1.getCharset());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings1.getClientIdentifier());
      assertEquals(0, advancedSettings1.getBacklog());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientIdentifier("f");
      advancedSettings0.setClientSocketReceiveBufferSize(0);
      advancedSettings0.setClientSocketSendBufferSize(0);
      advancedSettings0.setQSObjectPoolMaker("");
      advancedSettings0.setByteBufferSize(0);
      advancedSettings0.setClientIdentifier("FqExWV");
      advancedSettings0.getPerformancePreferencesConnectionTime();
      advancedSettings0.getClientSocketSendBufferSize();
      advancedSettings0.getCharset();
      advancedSettings0.getClientSocketTrafficClass();
      assertEquals("FqExWV", advancedSettings0.getClientIdentifier());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      String string0 = "";
      advancedSettings0.setCharset("");
      advancedSettings0.setClientSocketSendBufferSize(2882);
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setPerformancePreferencesConnectionTime((-428));
      advancedSettings0.setClientSocketTcpNoDelay(true);
      advancedSettings0.setByteBufferSize((-1));
      advancedSettings0.setCharset("");
      advancedSettings0.setDebugNonBlockingMode(true);
      advancedSettings0.setPerformancePreferencesLatency((-428));
      advancedSettings0.setClientSocketTcpNoDelay(false);
      advancedSettings0.setCharset("");
      advancedSettings0.getQSObjectPoolMaker();
      String string1 = "f";
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("f");
        fail("Expecting exception: UnsupportedCharsetException");
      
      } catch(UnsupportedCharsetException e) {
         //
         // f
         //
         verifyException("org.quickserver.util.xmlreader.AdvancedSettings", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setPerformancePreferencesLatency((-680));
      advancedSettings0.setDebugNonBlockingMode(true);
      advancedSettings0.setDebugNonBlockingMode(false);
      advancedSettings0.getCharset();
      advancedSettings0.setClientSocketTcpNoDelay(true);
      assertEquals((-680), advancedSettings0.getPerformancePreferencesLatency());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientIdentifier("JRz,KAHG!|");
      advancedSettings0.setPerformancePreferencesBandwidth(0);
      advancedSettings0.setClientSocketTrafficClass("`+I@|");
      advancedSettings0.setClientIdentifier("JRz,KAHG!|");
      advancedSettings0.setUseDirectByteBuffer(true);
      advancedSettings0.setByteBufferSize(1);
      int int0 = advancedSettings0.getPerformancePreferencesConnectionTime();
      assertEquals("JRz,KAHG!|", advancedSettings0.getClientIdentifier());
      assertEquals(0, int0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.getClientSocketTrafficClass();
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setByteBufferSize((-1561));
      advancedSettings0.setClientSocketSendBufferSize((-1022));
      advancedSettings0.getClientSocketReceiveBufferSize();
      advancedSettings0.getDebugNonBlockingMode();
      advancedSettings0.setByteBufferSize(0);
      assertEquals((-1022), advancedSettings0.getClientSocketSendBufferSize());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setPerformancePreferencesBandwidth(1);
      advancedSettings0.setUseDirectByteBuffer(true);
      advancedSettings0.setClientSocketTrafficClass("");
      advancedSettings0.setClientSocketSendBufferSize(1);
      advancedSettings0.getClientSocketReceiveBufferSize();
      advancedSettings0.setClientSocketReceiveBufferSize(1);
      advancedSettings0.getPerformancePreferencesLatency();
      advancedSettings0.getClientSocketTcpNoDelay();
      advancedSettings0.getUseDirectByteBuffer();
      advancedSettings0.setPerformancePreferencesLatency(1);
      advancedSettings0.setPerformancePreferencesBandwidth(2401);
      advancedSettings0.getClientSocketReceiveBufferSize();
      advancedSettings0.setPerformancePreferencesLatency(0);
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setCharset("");
      advancedSettings0.setBacklog(0);
      advancedSettings0.setPerformancePreferencesConnectionTime(586);
      advancedSettings0.getByteBufferSize();
      advancedSettings0.getClientIdentifier();
      advancedSettings0.setDebugNonBlockingMode(false);
      assertEquals(586, advancedSettings0.getPerformancePreferencesConnectionTime());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.890371757896165
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      String string0 = advancedSettings0.toXML("");
      assertEquals("<advanced-settings>\n\t<charset>ISO-8859-1</charset>\n\t<use-direct-byte-buffer>true</use-direct-byte-buffer>\n\t<byte-buffer-size>65536</byte-buffer-size>\n\t<backlog>0</backlog>\n\t<socket-linger>-1</socket-linger>\n\t<debug-non-blocking-mode>false</debug-non-blocking-mode>\n\t<client-identifier>org.quickserver.net.server.impl.OptimisticClientIdentifier</client-identifier>\n\t<qsobject-pool-maker>org.quickserver.util.pool.MakeQSObjectPool</qsobject-pool-maker>\n\t<max-threads-for-nio-write>10</max-threads-for-nio-write>\n\t<performance-preferences-connection-time>0</performance-preferences-connection-time>\n\t<performance-preferences-latency>0</performance-preferences-latency>\n\t<performance-preferences-bandwidth>0</performance-preferences-bandwidth>\n\t<client-socket-tcp-no-delay>false</client-socket-tcp-no-delay>\n</advanced-settings>\n", string0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=3.0910424533583143
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketReceiveBufferSize(1441);
      advancedSettings0.setClientSocketTcpNoDelay(true);
      advancedSettings0.setPerformancePreferencesBandwidth(1441);
      advancedSettings0.getUseDirectByteBuffer();
      advancedSettings0.setClientSocketReceiveBufferSize((-34));
      advancedSettings0.toXML((String) null);
      advancedSettings0.getPerformancePreferencesBandwidth();
      advancedSettings0.getPerformancePreferencesConnectionTime();
      advancedSettings0.setClientSocketReceiveBufferSize((-2138));
      advancedSettings0.setMaxThreadsForNioWrite((-362));
      boolean boolean0 = advancedSettings0.getUseDirectByteBuffer();
      assertEquals(1441, advancedSettings0.getPerformancePreferencesBandwidth());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=3.0910424533583143
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setSocketLinger(0);
      advancedSettings0.setPerformancePreferencesConnectionTime(0);
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setClientSocketSendBufferSize(2882);
      advancedSettings0.toXML("");
      advancedSettings0.setSocketLinger(0);
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
  //Test case number: 19
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setCharset("");
      advancedSettings0.setClientSocketTcpNoDelay(false);
      advancedSettings0.setCharset("");
      advancedSettings0.setByteBufferSize((-1));
      advancedSettings0.setQSObjectPoolMaker("");
      advancedSettings0.setByteBufferSize((-1));
      advancedSettings0.setClientIdentifier("w$k9g");
      advancedSettings0.setPerformancePreferencesConnectionTime(2384);
      advancedSettings0.getBacklog();
      advancedSettings0.getSocketLinger();
      advancedSettings0.setClientSocketTrafficClass("");
      advancedSettings0.setBacklog(2384);
      advancedSettings0.setClientSocketTrafficClass("0");
      advancedSettings0.setCharset((String) null);
      assertEquals("w$k9g", advancedSettings0.getClientIdentifier());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setDebugNonBlockingMode(false);
      advancedSettings0.setBacklog(3135);
      advancedSettings0.setSocketLinger(0);
      advancedSettings0.setClientSocketSendBufferSize(3135);
      advancedSettings0.setBacklog(0);
      advancedSettings0.getMaxThreadsForNioWrite();
      advancedSettings0.getByteBufferSize();
      advancedSettings0.setDebugNonBlockingMode(true);
      advancedSettings0.setSocketLinger(2293);
      advancedSettings0.setUseDirectByteBuffer(false);
      advancedSettings0.setClientIdentifier((String) null);
      advancedSettings0.setPerformancePreferencesLatency(0);
      advancedSettings0.setQSObjectPoolMaker("~");
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("~");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // ~
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=3.1354942159291497
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketSendBufferSize(659);
      advancedSettings0.setDebugNonBlockingMode(false);
      advancedSettings0.getBacklog();
      advancedSettings0.setClientSocketTrafficClass(">");
      advancedSettings0.setUseDirectByteBuffer(false);
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.getUseDirectByteBuffer();
      advancedSettings0.setClientSocketTcpNoDelay(false);
      advancedSettings0.toXML("org.quickserver.util.pool.MakeQSObjectPool");
      advancedSettings0.getByteBufferSize();
      advancedSettings0.setClientSocketSendBufferSize(270);
      advancedSettings0.getSocketLinger();
      advancedSettings0.getClientSocketReceiveBufferSize();
      advancedSettings0.getPerformancePreferencesConnectionTime();
      int int0 = advancedSettings0.getPerformancePreferencesConnectionTime();
      assertEquals(270, advancedSettings0.getClientSocketSendBufferSize());
      assertEquals(0, int0);
  }
}