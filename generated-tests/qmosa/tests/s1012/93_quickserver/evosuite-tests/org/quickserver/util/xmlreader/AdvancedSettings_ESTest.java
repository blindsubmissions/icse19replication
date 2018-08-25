/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 12:51:26 GMT 2018
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
  /*Coverage entropy=2.833213344056216
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setPerformancePreferencesBandwidth(1803);
      advancedSettings0.setUseDirectByteBuffer(false);
      advancedSettings0.setSocketLinger(1803);
      advancedSettings0.setPerformancePreferencesLatency(1147);
      advancedSettings0.setSocketLinger(1147);
      advancedSettings0.setClientSocketTcpNoDelay(false);
      advancedSettings0.setPerformancePreferencesLatency(1147);
      advancedSettings0.setBacklog(1147);
      advancedSettings0.setDebugNonBlockingMode(false);
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setClientSocketReceiveBufferSize(667);
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.getSocketLinger();
      advancedSettings0.getPerformancePreferencesBandwidth();
      advancedSettings0.setClientSocketTrafficClass("]* 8of]_fZgS6");
      advancedSettings0.setDebugNonBlockingMode(true);
      advancedSettings0.setClientSocketTcpNoDelay(false);
      advancedSettings0.setClientIdentifier("{5y-0bqp]ivyKAbo2(");
      advancedSettings0.getClientSocketSendBufferSize();
      advancedSettings0.getClientIdentifier();
      advancedSettings0.setSocketLinger(1803);
      advancedSettings0.setClientSocketSendBufferSize(1147);
      assertTrue(advancedSettings0.getDebugNonBlockingMode());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      int int0 = 1910;
      advancedSettings0.setClientSocketSendBufferSize(1910);
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("GmxkxvU(=P:m1r%g");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // GmxkxvU(=P:m1r%g
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=3.2188758248681983
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setBacklog(0);
      advancedSettings0.getClientIdentifier();
      advancedSettings0.setClientIdentifier("");
      advancedSettings0.setClientSocketTcpNoDelay(true);
      advancedSettings0.setPerformancePreferencesConnectionTime(569);
      advancedSettings0.getPerformancePreferencesConnectionTime();
      advancedSettings0.setUseDirectByteBuffer(false);
      advancedSettings0.getUseDirectByteBuffer();
      advancedSettings0.getPerformancePreferencesConnectionTime();
      advancedSettings0.setQSObjectPoolMaker("org.quickserver.net.server.impl.OptimisticClientIdentifier");
      advancedSettings0.setBacklog(569);
      advancedSettings0.getClientSocketTcpNoDelay();
      String string0 = advancedSettings0.toXML("org.quickserver.net.server.impl.OptimisticClientIdentifier");
      advancedSettings0.getByteBufferSize();
      advancedSettings0.getPerformancePreferencesConnectionTime();
      advancedSettings0.setQSObjectPoolMaker("");
      advancedSettings0.getByteBufferSize();
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset(string0);
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // org.quickserver.net.server.impl.OptimisticClientIdentifier<advanced-settings>
         // org.quickserver.net.server.impl.OptimisticClientIdentifier\t<charset>ISO-8859-1</charset>
         // org.quickserver.net.server.impl.OptimisticClientIdentifier\t<use-direct-byte-buffer>false</use-direct-byte-buffer>
         // org.quickserver.net.server.impl.OptimisticClientIdentifier\t<byte-buffer-size>65536</byte-buffer-size>
         // org.quickserver.net.server.impl.OptimisticClientIdentifier\t<backlog>569</backlog>
         // org.quickserver.net.server.impl.OptimisticClientIdentifier\t<socket-linger>-1</socket-linger>
         // org.quickserver.net.server.impl.OptimisticClientIdentifier\t<debug-non-blocking-mode>false</debug-non-blocking-mode>
         // org.quickserver.net.server.impl.OptimisticClientIdentifier\t<client-identifier>org.quickserver.net.server.impl.OptimisticClientIdentifier</client-identifier>
         // org.quickserver.net.server.impl.OptimisticClientIdentifier\t<qsobject-pool-maker>org.quickserver.net.server.impl.OptimisticClientIdentifier</qsobject-pool-maker>
         // org.quickserver.net.server.impl.OptimisticClientIdentifier\t<max-threads-for-nio-write>10</max-threads-for-nio-write>
         // org.quickserver.net.server.impl.OptimisticClientIdentifier\t<performance-preferences-connection-time>569</performance-preferences-connection-time>
         // org.quickserver.net.server.impl.OptimisticClientIdentifier\t<performance-preferences-latency>0</performance-preferences-latency>
         // org.quickserver.net.server.impl.OptimisticClientIdentifier\t<performance-preferences-bandwidth>0</performance-preferences-bandwidth>
         // org.quickserver.net.server.impl.OptimisticClientIdentifier\t<client-socket-tcp-no-delay>true</client-socket-tcp-no-delay>
         // org.quickserver.net.server.impl.OptimisticClientIdentifier</advanced-settings>
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=3.075220548054372
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setCharset("");
      advancedSettings0.setPerformancePreferencesBandwidth((-1054));
      assertEquals((-1054), advancedSettings0.getPerformancePreferencesBandwidth());
      
      advancedSettings0.setPerformancePreferencesBandwidth(0);
      advancedSettings0.toXML("");
      advancedSettings0.getDebugNonBlockingMode();
      advancedSettings0.toXML("");
      advancedSettings0.getPerformancePreferencesLatency();
      advancedSettings0.setPerformancePreferencesBandwidth(0);
      advancedSettings0.getCharset();
      advancedSettings0.getPerformancePreferencesLatency();
      advancedSettings0.setPerformancePreferencesLatency(0);
      advancedSettings0.setDebugNonBlockingMode(false);
      int int0 = advancedSettings0.getPerformancePreferencesBandwidth();
      assertEquals(0, int0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=3.2188758248681983
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
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
      assertEquals(2277, advancedSettings0.getMaxThreadsForNioWrite());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.9264175554979963
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setSocketLinger(987);
      advancedSettings0.setClientIdentifier("</socket-linger>\n");
      advancedSettings0.setSocketLinger(0);
      advancedSettings0.setClientSocketTcpNoDelay(true);
      advancedSettings0.getPerformancePreferencesConnectionTime();
      advancedSettings0.setClientSocketTrafficClass("~");
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setPerformancePreferencesBandwidth(0);
      advancedSettings0.getClientSocketTrafficClass();
      advancedSettings0.getClientSocketTcpNoDelay();
      advancedSettings0.setByteBufferSize(0);
      advancedSettings0.setPerformancePreferencesConnectionTime(0);
      advancedSettings0.setClientSocketTcpNoDelay(true);
      advancedSettings0.getUseDirectByteBuffer();
      advancedSettings0.setPerformancePreferencesConnectionTime(0);
      advancedSettings0.getDebugNonBlockingMode();
      advancedSettings0.setByteBufferSize(0);
      advancedSettings0.getBacklog();
      advancedSettings0.getClientSocketTrafficClass();
      advancedSettings0.setClientSocketTrafficClass("'pH__ajO");
      advancedSettings0.getSocketLinger();
      advancedSettings0.getClientSocketReceiveBufferSize();
      advancedSettings0.setByteBufferSize(1);
      advancedSettings0.setClientSocketSendBufferSize(0);
      advancedSettings0.getDebugNonBlockingMode();
      advancedSettings0.setPerformancePreferencesLatency(0);
      assertEquals("</socket-linger>\n", advancedSettings0.getClientIdentifier());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.70805020110221
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
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
      assertEquals((-1), advancedSettings0.getPerformancePreferencesBandwidth());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.8310204811135162
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setMaxThreadsForNioWrite(65536);
      advancedSettings0.setPerformancePreferencesConnectionTime(65536);
      advancedSettings0.setBacklog(65536);
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
  //Test case number: 8
  /*Coverage entropy=3.262567945550165
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
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

  /**
  //Test case number: 9
  /*Coverage entropy=2.0431918705451206
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      int int0 = (-1284);
      advancedSettings0.setPerformancePreferencesLatency((-1284));
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setQSObjectPoolMaker("YgG|");
      advancedSettings0.setBacklog((-1284));
      int int1 = 3059;
      advancedSettings0.setClientSocketReceiveBufferSize((-1284));
      advancedSettings0.setClientSocketSendBufferSize(3059);
      String string0 = "<advanced-settings>\n";
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("<advanced-settings>\n");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // <advanced-settings>
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setUseDirectByteBuffer(false);
      advancedSettings0.setBacklog((-1382));
      advancedSettings0.setUseDirectByteBuffer(false);
      advancedSettings0.setPerformancePreferencesConnectionTime(0);
      advancedSettings0.setClientIdentifier((String) null);
      advancedSettings0.setCharset((String) null);
      advancedSettings0.setClientIdentifier((String) null);
      advancedSettings0.setDebugNonBlockingMode(false);
      advancedSettings0.setSocketLinger(10);
      advancedSettings0.setPerformancePreferencesBandwidth(10);
      advancedSettings0.getPerformancePreferencesLatency();
      advancedSettings0.setBacklog(3003);
      advancedSettings0.getBacklog();
      advancedSettings0.setClientSocketTrafficClass("zC@@+W>");
      advancedSettings0.setClientSocketReceiveBufferSize(3003);
      int int0 = advancedSettings0.getClientSocketSendBufferSize();
      assertEquals(10, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals(0, int0);
  }
}