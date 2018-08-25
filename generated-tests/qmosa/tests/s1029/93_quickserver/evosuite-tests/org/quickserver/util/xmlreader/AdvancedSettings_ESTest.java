/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 17:35:44 GMT 2018
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
      assertEquals("ISO-8859-1", advancedSettings0.getClientIdentifier());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
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
  //Test case number: 2
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
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
  //Test case number: 3
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setSocketLinger(1105);
      advancedSettings0.setBacklog(0);
      advancedSettings0.setDebugNonBlockingMode(true);
      advancedSettings0.setPerformancePreferencesConnectionTime(0);
      advancedSettings0.setClientSocketSendBufferSize(0);
      advancedSettings0.setMaxThreadsForNioWrite(1234);
      advancedSettings0.setPerformancePreferencesConnectionTime(0);
      advancedSettings0.setDebugNonBlockingMode(true);
      advancedSettings0.setDebugNonBlockingMode(false);
      advancedSettings0.setClientSocketTrafficClass("");
      advancedSettings0.getBacklog();
      advancedSettings0.getClientSocketReceiveBufferSize();
      advancedSettings0.setUseDirectByteBuffer(true);
      advancedSettings0.getCharset();
      advancedSettings0.setClientSocketSendBufferSize(1105);
      assertFalse(advancedSettings0.getDebugNonBlockingMode());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=3.4339872044851467
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientIdentifier("\t<performance-preferences-connection-time>");
      advancedSettings0.setPerformancePreferencesConnectionTime((-22));
      advancedSettings0.setPerformancePreferencesLatency((-22));
      advancedSettings0.toXML((String) null);
      advancedSettings0.setDebugNonBlockingMode(true);
      advancedSettings0.getUseDirectByteBuffer();
      advancedSettings0.setQSObjectPoolMaker("0d8o(IB{hkZW:b!uQ!");
      advancedSettings0.getBacklog();
      advancedSettings0.setClientIdentifier("u<fsPfB<\"/nPaQjVnA");
      advancedSettings0.setPerformancePreferencesConnectionTime(0);
      advancedSettings0.setPerformancePreferencesLatency(1);
      advancedSettings0.getClientSocketReceiveBufferSize();
      advancedSettings0.setSocketLinger(0);
      advancedSettings0.setClientSocketSendBufferSize(0);
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setSocketLinger((-248));
      advancedSettings0.setClientSocketReceiveBufferSize(1);
      advancedSettings0.getClientSocketSendBufferSize();
      advancedSettings0.setClientSocketTcpNoDelay(false);
      advancedSettings0.setByteBufferSize(0);
      advancedSettings0.setPerformancePreferencesBandwidth((-22));
      advancedSettings0.setClientSocketTrafficClass("$5**r");
      advancedSettings0.setQSObjectPoolMaker("u<fsPfB<\"/nPaQjVnA");
      advancedSettings0.getUseDirectByteBuffer();
      advancedSettings0.setMaxThreadsForNioWrite((-22));
      int int0 = advancedSettings0.getPerformancePreferencesConnectionTime();
      assertEquals("u<fsPfB<\"/nPaQjVnA", advancedSettings0.getClientIdentifier());
      assertEquals(0, int0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.7072697097848133
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientIdentifier("\t<client-socket-send-buffer-size>");
      advancedSettings0.setPerformancePreferencesConnectionTime(1069);
      advancedSettings0.setSocketLinger(0);
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setQSObjectPoolMaker("");
      advancedSettings0.setClientSocketReceiveBufferSize((-1));
      advancedSettings0.getPerformancePreferencesBandwidth();
      advancedSettings0.getMaxThreadsForNioWrite();
      advancedSettings0.setClientSocketReceiveBufferSize(10);
      advancedSettings0.setPerformancePreferencesLatency((-1351));
      advancedSettings0.getClientSocketReceiveBufferSize();
      advancedSettings0.setMaxThreadsForNioWrite((-1710));
      advancedSettings0.setClientIdentifier("");
      advancedSettings0.getClientSocketSendBufferSize();
      advancedSettings0.getClientSocketTcpNoDelay();
      advancedSettings0.getClientSocketReceiveBufferSize();
      advancedSettings0.setQSObjectPoolMaker("\t<client-socket-send-buffer-size>");
      advancedSettings0.getClientSocketTrafficClass();
      advancedSettings0.getCharset();
      advancedSettings0.setSocketLinger((-380));
      int int0 = advancedSettings0.getMaxThreadsForNioWrite();
      assertEquals(1069, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertEquals((-1710), int0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=3.3445488586064442
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setPerformancePreferencesConnectionTime((-737));
      advancedSettings0.setUseDirectByteBuffer(true);
      advancedSettings0.setByteBufferSize(1);
      advancedSettings0.setByteBufferSize((-1688));
      advancedSettings0.setByteBufferSize((-737));
      advancedSettings0.setDebugNonBlockingMode(false);
      advancedSettings0.setClientIdentifier("fMkRK'k");
      advancedSettings0.toXML("");
      advancedSettings0.setClientSocketReceiveBufferSize(1705);
      advancedSettings0.setBacklog(1615);
      advancedSettings0.setClientSocketTrafficClass("");
      advancedSettings0.setPerformancePreferencesBandwidth(1705);
      advancedSettings0.getPerformancePreferencesLatency();
      advancedSettings0.getPerformancePreferencesConnectionTime();
      advancedSettings0.getUseDirectByteBuffer();
      advancedSettings0.getCharset();
      advancedSettings0.getPerformancePreferencesLatency();
      advancedSettings0.setClientSocketReceiveBufferSize(0);
      advancedSettings0.setPerformancePreferencesLatency(1);
      advancedSettings0.setByteBufferSize(1);
      advancedSettings0.getClientSocketReceiveBufferSize();
      advancedSettings0.getClientSocketTrafficClass();
      advancedSettings0.setClientSocketSendBufferSize((-1688));
      advancedSettings0.getClientSocketTcpNoDelay();
      int int0 = advancedSettings0.getMaxThreadsForNioWrite();
      assertEquals("fMkRK'k", advancedSettings0.getClientIdentifier());
      assertEquals(10, int0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=3.1064969046460247
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
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
      assertEquals((-1), advancedSettings0.getMaxThreadsForNioWrite());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=3.2625679455501655
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketSendBufferSize((-593));
      advancedSettings0.setClientSocketTcpNoDelay(false);
      advancedSettings0.setByteBufferSize(259);
      advancedSettings0.setClientSocketTrafficClass("");
      advancedSettings0.setByteBufferSize((-1));
      advancedSettings0.getClientSocketTrafficClass();
      advancedSettings0.getCharset();
      advancedSettings0.toXML("ISO-8859-1");
      advancedSettings0.setUseDirectByteBuffer(false);
      advancedSettings0.setUseDirectByteBuffer(false);
      advancedSettings0.setClientSocketTrafficClass("");
      advancedSettings0.setClientSocketSendBufferSize((-1));
      advancedSettings0.setUseDirectByteBuffer(true);
      advancedSettings0.setCharset("");
      advancedSettings0.getMaxThreadsForNioWrite();
      advancedSettings0.setMaxThreadsForNioWrite(259);
      advancedSettings0.getCharset();
      advancedSettings0.setBacklog(2520);
      advancedSettings0.getClientSocketSendBufferSize();
      advancedSettings0.setSocketLinger(0);
      int int0 = advancedSettings0.getClientSocketReceiveBufferSize();
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals(0, int0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.4750763110546947
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
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
  //Test case number: 10
  /*Coverage entropy=2.615630577027551
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setMaxThreadsForNioWrite(1);
      advancedSettings0.setClientIdentifier("rVrxsEaM\";owe");
      advancedSettings0.setBacklog(1834);
      advancedSettings0.setPerformancePreferencesLatency((-1090));
      advancedSettings0.setClientIdentifier("$bo");
      advancedSettings0.setClientSocketReceiveBufferSize((-1090));
      advancedSettings0.setClientSocketTrafficClass("$bo");
      advancedSettings0.setDebugNonBlockingMode(false);
      advancedSettings0.setClientSocketTcpNoDelay(true);
      advancedSettings0.setUseDirectByteBuffer(false);
      advancedSettings0.setClientSocketTrafficClass("$bo");
      advancedSettings0.setDebugNonBlockingMode(true);
      advancedSettings0.setPerformancePreferencesConnectionTime(0);
      advancedSettings0.setBacklog((-1090));
      advancedSettings0.setBacklog((-1090));
      advancedSettings0.getPerformancePreferencesConnectionTime();
      advancedSettings0.setByteBufferSize(1834);
      advancedSettings0.setPerformancePreferencesBandwidth((-211));
      assertEquals((-211), advancedSettings0.getPerformancePreferencesBandwidth());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=3.401197381662154
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
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
      assertFalse(advancedSettings0.getUseDirectByteBuffer());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=3.2829507132875912
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
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
      assertEquals("ISO-8859-1", advancedSettings0.getClientIdentifier());
  }
}
