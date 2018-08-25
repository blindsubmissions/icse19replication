/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 05:34:14 GMT 2018
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
      advancedSettings0.setSocketLinger(0);
      advancedSettings0.setByteBufferSize(1451);
      advancedSettings0.getCharset();
      advancedSettings0.getPerformancePreferencesBandwidth();
      int int0 = advancedSettings0.getClientSocketSendBufferSize();
      assertEquals(1451, advancedSettings0.getByteBufferSize());
      assertEquals(0, int0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketSendBufferSize((-2080));
      advancedSettings0.setDebugNonBlockingMode(false);
      advancedSettings0.setByteBufferSize((-2080));
      advancedSettings0.setClientSocketSendBufferSize(1);
      advancedSettings0.setClientSocketSendBufferSize(10);
      advancedSettings0.getDebugNonBlockingMode();
      advancedSettings0.setCharset("");
      AdvancedSettings advancedSettings1 = new AdvancedSettings();
      advancedSettings1.setClientIdentifier("DiSlY@J6K%O^An.o");
      advancedSettings0.setClientIdentifier("");
      assertEquals(10, advancedSettings0.getClientSocketSendBufferSize());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      int int0 = advancedSettings0.getClientSocketSendBufferSize();
      assertEquals(0, int0);
      
      advancedSettings0.setUseDirectByteBuffer(true);
      String string0 = advancedSettings0.getQSObjectPoolMaker();
      assertEquals("org.quickserver.util.pool.MakeQSObjectPool", string0);
      assertNotNull(string0);
      
      advancedSettings0.setBacklog(0);
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setMaxThreadsForNioWrite((-2544));
      advancedSettings0.setSocketLinger(580);
      advancedSettings0.setClientIdentifier("\t<performance-preferences-connection-time>");
      assertEquals("\t<performance-preferences-connection-time>", advancedSettings0.getClientIdentifier());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketSendBufferSize(1620);
      advancedSettings0.setSocketLinger(543);
      advancedSettings0.setUseDirectByteBuffer(false);
      advancedSettings0.setClientSocketTrafficClass("");
      advancedSettings0.getMaxThreadsForNioWrite();
      advancedSettings0.setDebugNonBlockingMode(false);
      advancedSettings0.getClientSocketReceiveBufferSize();
      advancedSettings0.getByteBufferSize();
      advancedSettings0.setDebugNonBlockingMode(true);
      assertEquals(543, advancedSettings0.getSocketLinger());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientIdentifier("");
      boolean boolean0 = false;
      advancedSettings0.setClientSocketTcpNoDelay(false);
      advancedSettings0.setMaxThreadsForNioWrite((-4381));
      advancedSettings0.setBacklog((-4381));
      advancedSettings0.setPerformancePreferencesConnectionTime(0);
      advancedSettings0.getSocketLinger();
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("N,~");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // N,~
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setClientIdentifier("org.quickserver.util.pool.MakeQSObjectPool");
      advancedSettings0.setPerformancePreferencesLatency((-184));
      advancedSettings0.setPerformancePreferencesConnectionTime((-184));
      advancedSettings0.setClientIdentifier("6");
      advancedSettings0.setPerformancePreferencesLatency(0);
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("oQamLyC!X");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // oQamLyC!X
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setDebugNonBlockingMode(false);
      advancedSettings0.setByteBufferSize((-2080));
      advancedSettings0.setPerformancePreferencesBandwidth(1);
      advancedSettings0.setClientSocketSendBufferSize(1);
      advancedSettings0.setClientSocketSendBufferSize(1);
      boolean boolean0 = false;
      advancedSettings0.setMaxThreadsForNioWrite(1);
      String string0 = "i_Yrn5! }4";
      advancedSettings0.setClientSocketSendBufferSize(10);
      advancedSettings0.setByteBufferSize(0);
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("i_Yrn5! }4");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // i_Yrn5! }4
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketSendBufferSize(1620);
      advancedSettings0.setSocketLinger(543);
      advancedSettings0.setQSObjectPoolMaker("");
      advancedSettings0.setCharset("");
      advancedSettings0.setClientSocketTrafficClass("");
      advancedSettings0.getClientIdentifier();
      int int0 = advancedSettings0.getClientSocketReceiveBufferSize();
      assertEquals(543, advancedSettings0.getSocketLinger());
      assertEquals(0, int0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setPerformancePreferencesLatency((-1900));
      advancedSettings0.setQSObjectPoolMaker("");
      advancedSettings0.setDebugNonBlockingMode(true);
      advancedSettings0.setClientSocketTrafficClass("");
      advancedSettings0.getClientSocketTrafficClass();
      advancedSettings0.setQSObjectPoolMaker("");
      advancedSettings0.setSocketLinger(0);
      advancedSettings0.setMaxThreadsForNioWrite((-1900));
      advancedSettings0.getClientSocketTcpNoDelay();
      int int0 = advancedSettings0.getClientSocketSendBufferSize();
      assertTrue(advancedSettings0.getDebugNonBlockingMode());
      assertEquals(0, int0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.8891591637540217
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setPerformancePreferencesConnectionTime(0);
      advancedSettings0.setCharset((String) null);
      advancedSettings0.setClientSocketTrafficClass("&)o;Ymz3Q|F");
      advancedSettings0.setCharset("");
      advancedSettings0.setClientSocketTcpNoDelay(true);
      advancedSettings0.setClientIdentifier("&)o;Ymz3Q|F");
      int int0 = advancedSettings0.getClientSocketReceiveBufferSize();
      assertEquals("&)o;Ymz3Q|F", advancedSettings0.getClientIdentifier());
      assertEquals(0, int0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketSendBufferSize(1);
      int int0 = 2268;
      advancedSettings0.setBacklog(2268);
      String string0 = "DhMFmD[";
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("DhMFmD[");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // DhMFmD[
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.70805020110221
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setByteBufferSize(456);
      advancedSettings0.setClientSocketReceiveBufferSize(2261);
      advancedSettings0.setMaxThreadsForNioWrite((-890));
      advancedSettings0.setClientSocketTrafficClass("");
      advancedSettings0.setByteBufferSize(456);
      advancedSettings0.setClientIdentifier("");
      advancedSettings0.setQSObjectPoolMaker("");
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setCharset("");
      advancedSettings0.setClientIdentifier("");
      advancedSettings0.getSocketLinger();
      advancedSettings0.setClientSocketSendBufferSize((-1));
      advancedSettings0.setByteBufferSize((-890));
      advancedSettings0.setPerformancePreferencesConnectionTime(456);
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setPerformancePreferencesLatency(456);
      AdvancedSettings advancedSettings1 = new AdvancedSettings();
      advancedSettings1.setQSObjectPoolMaker("");
      advancedSettings0.getPerformancePreferencesLatency();
      advancedSettings0.setUseDirectByteBuffer(true);
      advancedSettings0.setClientSocketReceiveBufferSize(931);
      assertEquals((-1), advancedSettings0.getClientSocketSendBufferSize());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.toXML("");
      advancedSettings0.setClientSocketSendBufferSize(0);
      advancedSettings0.toXML("");
      advancedSettings0.setPerformancePreferencesLatency((-3423));
      advancedSettings0.getClientSocketReceiveBufferSize();
      int int0 = advancedSettings0.getMaxThreadsForNioWrite();
      assertEquals((-3423), advancedSettings0.getPerformancePreferencesLatency());
      assertEquals(10, int0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=3.367295829986472
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketReceiveBufferSize((-17));
      advancedSettings0.setClientSocketReceiveBufferSize((-984));
      advancedSettings0.setMaxThreadsForNioWrite((-984));
      advancedSettings0.setClientSocketTcpNoDelay(false);
      advancedSettings0.setDebugNonBlockingMode(false);
      advancedSettings0.setClientIdentifier((String) null);
      advancedSettings0.toXML((String) null);
      advancedSettings0.getClientSocketTcpNoDelay();
      advancedSettings0.setMaxThreadsForNioWrite((-984));
      advancedSettings0.setSocketLinger((-984));
      advancedSettings0.setByteBufferSize((-513));
      advancedSettings0.setClientSocketSendBufferSize(398);
      advancedSettings0.setClientSocketSendBufferSize((-513));
      advancedSettings0.setPerformancePreferencesBandwidth(0);
      advancedSettings0.setBacklog(0);
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setDebugNonBlockingMode(true);
      advancedSettings0.getPerformancePreferencesBandwidth();
      advancedSettings0.setClientSocketSendBufferSize(2027);
      advancedSettings0.setClientSocketSendBufferSize((-1514));
      advancedSettings0.setClientSocketSendBufferSize(0);
      advancedSettings0.setClientSocketTcpNoDelay(true);
      advancedSettings0.getPerformancePreferencesLatency();
      advancedSettings0.setClientSocketTrafficClass("");
      int int0 = advancedSettings0.getClientSocketSendBufferSize();
      assertTrue(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals(0, int0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=3.178053830347946
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketSendBufferSize((-4422));
      advancedSettings0.setUseDirectByteBuffer(false);
      advancedSettings0.setByteBufferSize((-4422));
      advancedSettings0.setQSObjectPoolMaker("z9_g8WMDk");
      advancedSettings0.toXML((String) null);
      advancedSettings0.setClientSocketSendBufferSize(1);
      advancedSettings0.getCharset();
      advancedSettings0.getUseDirectByteBuffer();
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.getClientSocketTrafficClass();
      advancedSettings0.setUseDirectByteBuffer(true);
      advancedSettings0.setClientSocketTrafficClass(")22");
      advancedSettings0.setBacklog((-4422));
      int int0 = advancedSettings0.getSocketLinger();
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals((-1), int0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientIdentifier((String) null);
      advancedSettings0.setCharset((String) null);
      advancedSettings0.setMaxThreadsForNioWrite(0);
      advancedSettings0.setMaxThreadsForNioWrite(0);
      advancedSettings0.setClientSocketTcpNoDelay(true);
      advancedSettings0.setClientSocketTrafficClass("\t<performance-preferences-latency>");
      advancedSettings0.setDebugNonBlockingMode(true);
      advancedSettings0.setMaxThreadsForNioWrite(0);
      advancedSettings0.getCharset();
      advancedSettings0.setPerformancePreferencesBandwidth(0);
      advancedSettings0.getBacklog();
      advancedSettings0.setPerformancePreferencesConnectionTime((-1658));
      assertEquals((-1658), advancedSettings0.getPerformancePreferencesConnectionTime());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setCharset("");
      advancedSettings0.setPerformancePreferencesConnectionTime(0);
      String string0 = "Q5";
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("Q5");
        fail("Expecting exception: UnsupportedCharsetException");
      
      } catch(UnsupportedCharsetException e) {
         //
         // Q5
         //
         verifyException("org.quickserver.util.xmlreader.AdvancedSettings", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setMaxThreadsForNioWrite(0);
      advancedSettings0.setClientIdentifier("\"oz4}de/((");
      assertEquals("\"oz4}de/((", advancedSettings0.getClientIdentifier());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.toXML((String) null);
      advancedSettings0.getBacklog();
      advancedSettings0.setClientSocketTcpNoDelay(false);
      advancedSettings0.setClientSocketSendBufferSize((-1061));
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("<advanced-settings>\n\t<charset>ISO-8859-1</charset>\n\t<use-direct-byte-buffer>true</use-direct-byte-buffer>\n\t<byte-buffer-size>65536</byte-buffer-size>\n\t<backlog>0</backlog>\n\t<socket-linger>-1</socket-linger>\n\t<debug-non-blocking-mode>false</debug-non-blocking-mode>\n\t<client-identifier>org.quickserver.net.server.impl.OptimisticClientIdentifier</client-identifier>\n\t<qsobject-pool-maker>org.quickserver.util.pool.MakeQSObjectPool</qsobject-pool-maker>\n\t<max-threads-for-nio-write>10</max-threads-for-nio-write>\n\t<performance-preferences-connection-time>0</performance-preferences-connection-time>\n\t<performance-preferences-latency>0</performance-preferences-latency>\n\t<performance-preferences-bandwidth>0</performance-preferences-bandwidth>\n\t<client-socket-tcp-no-delay>false</client-socket-tcp-no-delay>\n</advanced-settings>\n");
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
         // \t<max-threads-for-nio-write>10</max-threads-for-nio-write>
         // \t<performance-preferences-connection-time>0</performance-preferences-connection-time>
         // \t<performance-preferences-latency>0</performance-preferences-latency>
         // \t<performance-preferences-bandwidth>0</performance-preferences-bandwidth>
         // \t<client-socket-tcp-no-delay>false</client-socket-tcp-no-delay>
         // </advanced-settings>
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=3.2958368660043296
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setBacklog(2705);
      advancedSettings0.setPerformancePreferencesLatency(2705);
      advancedSettings0.setClientSocketTcpNoDelay(false);
      advancedSettings0.setSocketLinger(2705);
      advancedSettings0.getSocketLinger();
      advancedSettings0.setUseDirectByteBuffer(false);
      advancedSettings0.setClientSocketTrafficClass("Q-llp=Q#J");
      advancedSettings0.getClientSocketReceiveBufferSize();
      advancedSettings0.setClientSocketTcpNoDelay(false);
      advancedSettings0.setUseDirectByteBuffer(false);
      advancedSettings0.setBacklog(2705);
      advancedSettings0.getClientSocketReceiveBufferSize();
      advancedSettings0.setPerformancePreferencesBandwidth((-374));
      advancedSettings0.getClientIdentifier();
      advancedSettings0.getSocketLinger();
      advancedSettings0.setMaxThreadsForNioWrite(2705);
      advancedSettings0.setDebugNonBlockingMode(false);
      advancedSettings0.setPerformancePreferencesLatency(2705);
      advancedSettings0.setMaxThreadsForNioWrite(1);
      advancedSettings0.getDebugNonBlockingMode();
      advancedSettings0.setSocketLinger(2705);
      advancedSettings0.toXML("org.quickserver.net.server.impl.OptimisticClientIdentifier");
      advancedSettings0.setSocketLinger(2705);
      advancedSettings0.getByteBufferSize();
      advancedSettings0.getClientSocketTcpNoDelay();
      advancedSettings0.setMaxThreadsForNioWrite((-374));
      assertEquals((-374), advancedSettings0.getMaxThreadsForNioWrite());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=2.833213344056216
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientIdentifier("");
      advancedSettings0.setClientSocketTcpNoDelay(false);
      advancedSettings0.setMaxThreadsForNioWrite((-4381));
      advancedSettings0.setClientSocketSendBufferSize((-4381));
      advancedSettings0.setQSObjectPoolMaker("");
      advancedSettings0.setClientSocketTrafficClass("");
      advancedSettings0.setByteBufferSize(1153);
      advancedSettings0.setUseDirectByteBuffer(true);
      advancedSettings0.setQSObjectPoolMaker("");
      advancedSettings0.setQSObjectPoolMaker(":");
      advancedSettings0.getDebugNonBlockingMode();
      advancedSettings0.getPerformancePreferencesLatency();
      advancedSettings0.setClientSocketTcpNoDelay(true);
      advancedSettings0.getPerformancePreferencesLatency();
      advancedSettings0.getClientSocketTrafficClass();
      advancedSettings0.getCharset();
      advancedSettings0.getUseDirectByteBuffer();
      advancedSettings0.getPerformancePreferencesLatency();
      advancedSettings0.setClientSocketTcpNoDelay(true);
      advancedSettings0.getByteBufferSize();
      advancedSettings0.setCharset("ISO-8859-1");
      advancedSettings0.setQSObjectPoolMaker("");
      advancedSettings0.getPerformancePreferencesBandwidth();
      advancedSettings0.setCharset("");
      assertEquals((-4381), advancedSettings0.getMaxThreadsForNioWrite());
  }
}