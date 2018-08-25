/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 13:59:04 GMT 2018
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
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setByteBufferSize((-2025));
      advancedSettings0.setPerformancePreferencesBandwidth((-2025));
      advancedSettings0.getSocketLinger();
      advancedSettings0.setPerformancePreferencesBandwidth((-1334));
      assertEquals((-1334), advancedSettings0.getPerformancePreferencesBandwidth());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setPerformancePreferencesBandwidth(1347);
      advancedSettings0.setCharset((String) null);
      advancedSettings0.setCharset((String) null);
      advancedSettings0.setCharset((String) null);
      advancedSettings0.setCharset((String) null);
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("ja;Z");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // ja;Z
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setDebugNonBlockingMode(true);
      advancedSettings0.setQSObjectPoolMaker((String) null);
      advancedSettings0.setPerformancePreferencesLatency((-623));
      advancedSettings0.setSocketLinger((-2555));
      advancedSettings0.setUseDirectByteBuffer(true);
      advancedSettings0.setClientIdentifier("2I5iu;4co");
      advancedSettings0.getClientSocketTrafficClass();
      advancedSettings0.getPerformancePreferencesLatency();
      advancedSettings0.setMaxThreadsForNioWrite((-623));
      advancedSettings0.setDebugNonBlockingMode(true);
      assertEquals((-623), advancedSettings0.getMaxThreadsForNioWrite());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      int int0 = 1;
      advancedSettings0.setPerformancePreferencesConnectionTime(1);
      advancedSettings0.getUseDirectByteBuffer();
      advancedSettings0.getUseDirectByteBuffer();
      advancedSettings0.setUseDirectByteBuffer(true);
      String string0 = ",(>Y ";
      advancedSettings0.setQSObjectPoolMaker(",(>Y ");
      advancedSettings0.setUseDirectByteBuffer(true);
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset(",(>Y ");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // ,(>Y 
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setPerformancePreferencesLatency((-51));
      advancedSettings0.setClientIdentifier("oVA{I!cslyKq~");
      advancedSettings0.setClientSocketReceiveBufferSize((-51));
      advancedSettings0.setClientIdentifier("");
      advancedSettings0.setDebugNonBlockingMode(false);
      advancedSettings0.getBacklog();
      advancedSettings0.getPerformancePreferencesConnectionTime();
      AdvancedSettings advancedSettings1 = new AdvancedSettings();
      advancedSettings1.getClientSocketSendBufferSize();
      // Undeclared exception!
      try { 
        advancedSettings1.setCharset("IUClQZ7ka{uG=m;2Q");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // IUClQZ7ka{uG=m;2Q
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setBacklog(868);
      advancedSettings0.setQSObjectPoolMaker("");
      advancedSettings0.setUseDirectByteBuffer(false);
      advancedSettings0.setDebugNonBlockingMode(true);
      advancedSettings0.setPerformancePreferencesConnectionTime(3451);
      advancedSettings0.getClientIdentifier();
      assertEquals(868, advancedSettings0.getBacklog());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.70805020110221
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setBacklog((-391));
      advancedSettings0.setUseDirectByteBuffer(false);
      advancedSettings0.setClientSocketTrafficClass("");
      advancedSettings0.setClientSocketSendBufferSize(0);
      advancedSettings0.getClientSocketTrafficClass();
      advancedSettings0.setClientSocketTrafficClass("");
      advancedSettings0.setClientSocketSendBufferSize(1000);
      advancedSettings0.setUseDirectByteBuffer(false);
      advancedSettings0.getClientSocketSendBufferSize();
      advancedSettings0.setSocketLinger((-911));
      advancedSettings0.setClientSocketTrafficClass("");
      advancedSettings0.setSocketLinger((-4489));
      advancedSettings0.setPerformancePreferencesLatency(1000);
      advancedSettings0.setByteBufferSize(3526);
      advancedSettings0.setPerformancePreferencesLatency((-911));
      advancedSettings0.setPerformancePreferencesBandwidth((-738));
      advancedSettings0.setCharset("");
      advancedSettings0.setQSObjectPoolMaker("");
      advancedSettings0.setMaxThreadsForNioWrite((-4489));
      advancedSettings0.setClientSocketReceiveBufferSize((-885));
      advancedSettings0.getClientSocketTrafficClass();
      assertEquals(1000, advancedSettings0.getClientSocketSendBufferSize());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketReceiveBufferSize(3743);
      advancedSettings0.setQSObjectPoolMaker("sK:3G");
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setClientSocketSendBufferSize(577);
      advancedSettings0.setPerformancePreferencesBandwidth(65536);
      advancedSettings0.setPerformancePreferencesConnectionTime(65536);
      advancedSettings0.setDebugNonBlockingMode(true);
      advancedSettings0.getPerformancePreferencesBandwidth();
      advancedSettings0.setDebugNonBlockingMode(false);
      advancedSettings0.setUseDirectByteBuffer(false);
      advancedSettings0.setClientIdentifier("");
      advancedSettings0.setPerformancePreferencesBandwidth(0);
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("sK:3G");
        fail("Expecting exception: UnsupportedCharsetException");
      
      } catch(UnsupportedCharsetException e) {
         //
         // sK:3G
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
      advancedSettings0.setClientSocketSendBufferSize(1);
      advancedSettings0.setDebugNonBlockingMode(true);
      advancedSettings0.setClientSocketTrafficClass(".Cy9N>R");
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("kTOT\"+");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // kTOT\"+
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.getClientSocketReceiveBufferSize();
      advancedSettings0.setByteBufferSize(38);
      assertEquals(38, advancedSettings0.getByteBufferSize());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setBacklog(0);
      advancedSettings0.setCharset((String) null);
      int int0 = advancedSettings0.getClientSocketSendBufferSize();
      assertEquals(0, int0);
      
      advancedSettings0.getDebugNonBlockingMode();
      boolean boolean0 = advancedSettings0.getUseDirectByteBuffer();
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertTrue(boolean0);
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketTcpNoDelay(true);
      advancedSettings0.setDebugNonBlockingMode(true);
      advancedSettings0.setPerformancePreferencesBandwidth(0);
      advancedSettings0.getClientSocketTcpNoDelay();
      advancedSettings0.getClientSocketReceiveBufferSize();
      advancedSettings0.setCharset("");
      advancedSettings0.setClientSocketSendBufferSize(0);
      advancedSettings0.setClientSocketTrafficClass("");
      advancedSettings0.getMaxThreadsForNioWrite();
      advancedSettings0.setClientSocketTcpNoDelay(true);
      assertTrue(advancedSettings0.getDebugNonBlockingMode());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.833213344056216
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketReceiveBufferSize((-546));
      advancedSettings0.setCharset((String) null);
      advancedSettings0.setPerformancePreferencesBandwidth((-460));
      advancedSettings0.setPerformancePreferencesBandwidth(2214);
      advancedSettings0.setClientIdentifier("jaM1D-YN?&>");
      advancedSettings0.setClientIdentifier("jaM1D-YN?&>");
      advancedSettings0.setBacklog(1);
      advancedSettings0.setDebugNonBlockingMode(false);
      advancedSettings0.setPerformancePreferencesBandwidth(1823);
      advancedSettings0.getClientSocketReceiveBufferSize();
      advancedSettings0.getSocketLinger();
      advancedSettings0.setMaxThreadsForNioWrite(0);
      advancedSettings0.getUseDirectByteBuffer();
      advancedSettings0.getClientSocketSendBufferSize();
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setPerformancePreferencesLatency(0);
      advancedSettings0.setQSObjectPoolMaker((String) null);
      advancedSettings0.getMaxThreadsForNioWrite();
      advancedSettings0.getCharset();
      assertEquals("jaM1D-YN?&>", advancedSettings0.getClientIdentifier());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setPerformancePreferencesLatency((-51));
      advancedSettings0.setClientSocketTcpNoDelay(false);
      advancedSettings0.getByteBufferSize();
      boolean boolean0 = false;
      advancedSettings0.setClientSocketTcpNoDelay(false);
      String string0 = "U0t=M 1SAzV=mQg&aQr";
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("U0t=M 1SAzV=mQg&aQr");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // U0t=M 1SAzV=mQg&aQr
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.890371757896165
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setDebugNonBlockingMode(false);
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setPerformancePreferencesBandwidth((-2268));
      advancedSettings0.setByteBufferSize(0);
      advancedSettings0.setClientIdentifier("");
      advancedSettings0.setDebugNonBlockingMode(true);
      advancedSettings0.setCharset((String) null);
      advancedSettings0.setBacklog(0);
      advancedSettings0.setClientSocketTcpNoDelay(false);
      advancedSettings0.setCharset("");
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setPerformancePreferencesConnectionTime(0);
      advancedSettings0.setClientSocketTcpNoDelay(true);
      advancedSettings0.getDebugNonBlockingMode();
      advancedSettings0.getByteBufferSize();
      advancedSettings0.getClientSocketTrafficClass();
      advancedSettings0.getClientSocketTcpNoDelay();
      advancedSettings0.setClientSocketTrafficClass("org.quickserver.util.pool.MakeQSObjectPool");
      advancedSettings0.getClientSocketTcpNoDelay();
      advancedSettings0.setQSObjectPoolMaker("");
      advancedSettings0.getPerformancePreferencesLatency();
      advancedSettings0.setClientIdentifier((String) null);
      advancedSettings0.setQSObjectPoolMaker("");
      advancedSettings0.setQSObjectPoolMaker((String) null);
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setPerformancePreferencesBandwidth(0);
      advancedSettings0.setUseDirectByteBuffer(false);
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=3.178053830347946
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setBacklog((-391));
      advancedSettings0.setUseDirectByteBuffer(false);
      advancedSettings0.setClientSocketTrafficClass("");
      advancedSettings0.setClientSocketSendBufferSize(0);
      advancedSettings0.getClientSocketTrafficClass();
      advancedSettings0.setClientSocketTrafficClass("");
      advancedSettings0.setClientSocketSendBufferSize(1000);
      advancedSettings0.setUseDirectByteBuffer(false);
      advancedSettings0.getClientSocketSendBufferSize();
      advancedSettings0.setSocketLinger((-911));
      advancedSettings0.setSocketLinger((-4489));
      AdvancedSettings advancedSettings1 = new AdvancedSettings();
      advancedSettings1.setClientSocketTrafficClass("");
      advancedSettings0.setMaxThreadsForNioWrite((-391));
      advancedSettings1.getBacklog();
      advancedSettings0.toXML("");
      advancedSettings0.getDebugNonBlockingMode();
      advancedSettings1.setMaxThreadsForNioWrite(1000);
      advancedSettings0.getDebugNonBlockingMode();
      advancedSettings0.getClientIdentifier();
      advancedSettings0.setSocketLinger((-391));
      assertEquals((-391), advancedSettings0.getMaxThreadsForNioWrite());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=3.2188758248681983
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setMaxThreadsForNioWrite((-2387));
      advancedSettings0.setClientSocketTcpNoDelay(false);
      advancedSettings0.toXML("");
      advancedSettings0.setCharset((String) null);
      String string0 = "";
      advancedSettings0.setClientSocketTrafficClass("");
      advancedSettings0.setByteBufferSize(0);
      advancedSettings0.setClientSocketReceiveBufferSize((-172));
      advancedSettings0.toXML("K8?tS~B&Mn;");
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setQSObjectPoolMaker("");
      advancedSettings0.getByteBufferSize();
      advancedSettings0.toXML("K8?tS~B&Mn;");
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("K8?tS~B&Mn;");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // K8?tS~B&Mn;
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      String string0 = advancedSettings0.toXML((String) null);
      assertEquals("<advanced-settings>\n\t<charset>ISO-8859-1</charset>\n\t<use-direct-byte-buffer>true</use-direct-byte-buffer>\n\t<byte-buffer-size>65536</byte-buffer-size>\n\t<backlog>0</backlog>\n\t<socket-linger>-1</socket-linger>\n\t<debug-non-blocking-mode>false</debug-non-blocking-mode>\n\t<client-identifier>org.quickserver.net.server.impl.OptimisticClientIdentifier</client-identifier>\n\t<qsobject-pool-maker>org.quickserver.util.pool.MakeQSObjectPool</qsobject-pool-maker>\n\t<max-threads-for-nio-write>10</max-threads-for-nio-write>\n\t<performance-preferences-connection-time>0</performance-preferences-connection-time>\n\t<performance-preferences-latency>0</performance-preferences-latency>\n\t<performance-preferences-bandwidth>0</performance-preferences-bandwidth>\n\t<client-socket-tcp-no-delay>false</client-socket-tcp-no-delay>\n</advanced-settings>\n", string0);
      
      advancedSettings0.setCharset((String) null);
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
  }
}
