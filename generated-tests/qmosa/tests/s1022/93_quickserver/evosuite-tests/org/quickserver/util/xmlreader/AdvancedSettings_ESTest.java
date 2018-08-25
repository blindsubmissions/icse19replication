/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 15:35:09 GMT 2018
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
      advancedSettings0.getUseDirectByteBuffer();
      advancedSettings0.setClientSocketTrafficClass("");
      advancedSettings0.setPerformancePreferencesLatency(1783);
      advancedSettings0.setQSObjectPoolMaker("");
      advancedSettings0.getPerformancePreferencesBandwidth();
      advancedSettings0.getClientSocketTrafficClass();
      advancedSettings0.setSocketLinger(1645);
      advancedSettings0.getClientSocketTcpNoDelay();
      advancedSettings0.setBacklog(0);
      advancedSettings0.getBacklog();
      int int0 = advancedSettings0.getPerformancePreferencesConnectionTime();
      assertEquals(1645, advancedSettings0.getSocketLinger());
      assertEquals(0, int0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setByteBufferSize((-1));
      advancedSettings0.setPerformancePreferencesLatency(791);
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("</client-socket-traffic-class>\n");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // </client-socket-traffic-class>
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=3.1354942159291497
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketReceiveBufferSize(838);
      advancedSettings0.toXML((String) null);
      advancedSettings0.setPerformancePreferencesLatency(0);
      advancedSettings0.setClientSocketTrafficClass((String) null);
      advancedSettings0.setMaxThreadsForNioWrite((-1));
      advancedSettings0.setByteBufferSize((-801));
      assertEquals(838, advancedSettings0.getClientSocketReceiveBufferSize());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      String string0 = "!9^@[ ]QCyzP_@XgGs";
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setQSObjectPoolMaker("!9^@[ ]QCyzP_@XgGs");
      advancedSettings0.setDebugNonBlockingMode(false);
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("(wJO");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // (wJO
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.9412316867217543
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setPerformancePreferencesBandwidth(0);
      advancedSettings0.setCharset("");
      advancedSettings0.toXML("");
      String string0 = "-\"V21i8X^7LbuAlt\"";
      int int0 = 1784;
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("-\"V21i8X^7LbuAlt\"");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // -\"V21i8X^7LbuAlt\"
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setQSObjectPoolMaker((String) null);
      advancedSettings0.setSocketLinger(0);
      advancedSettings0.setSocketLinger(0);
      advancedSettings0.setClientIdentifier(";iI@f%\"YhZ%#&.!Wf");
      advancedSettings0.setBacklog(602);
      advancedSettings0.setByteBufferSize((-236));
      advancedSettings0.getUseDirectByteBuffer();
      advancedSettings0.setClientSocketSendBufferSize(0);
      advancedSettings0.setQSObjectPoolMaker((String) null);
      advancedSettings0.setPerformancePreferencesLatency(1213);
      assertEquals(1213, advancedSettings0.getPerformancePreferencesLatency());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      int int0 = 0;
      advancedSettings0.setPerformancePreferencesConnectionTime(0);
      advancedSettings0.setPerformancePreferencesConnectionTime((-48));
      advancedSettings0.setClientSocketSendBufferSize(0);
      advancedSettings0.setMaxThreadsForNioWrite(0);
      advancedSettings0.setUseDirectByteBuffer(false);
      boolean boolean0 = false;
      advancedSettings0.setClientSocketTcpNoDelay(false);
      advancedSettings0.setUseDirectByteBuffer(false);
      advancedSettings0.setPerformancePreferencesConnectionTime(949);
      String string0 = "</client-socket-receive-buffer-size>\n";
      advancedSettings0.setQSObjectPoolMaker("</client-socket-receive-buffer-size>\n");
      advancedSettings0.setClientIdentifier("</client-socket-receive-buffer-size>\n");
      advancedSettings0.setQSObjectPoolMaker("</client-socket-receive-buffer-size>\n");
      advancedSettings0.getDebugNonBlockingMode();
      advancedSettings0.getClientIdentifier();
      advancedSettings0.getByteBufferSize();
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("}/T,2");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // }/T,2
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=3.052520501533813
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      int int0 = 0;
      advancedSettings0.setByteBufferSize(0);
      advancedSettings0.setClientIdentifier("uY-}+C~_");
      advancedSettings0.setClientSocketTrafficClass("uY-}+C~_");
      advancedSettings0.toXML("");
      int int1 = 0;
      String string0 = "R.6O<n$.*bN";
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("R.6O<n$.*bN");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // R.6O<n$.*bN
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.685945324669788
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setPerformancePreferencesLatency(0);
      advancedSettings0.setBacklog(0);
      advancedSettings0.setSocketLinger(0);
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setByteBufferSize(2767);
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setPerformancePreferencesLatency(0);
      advancedSettings0.setPerformancePreferencesLatency(0);
      advancedSettings0.setDebugNonBlockingMode(true);
      advancedSettings0.setClientSocketReceiveBufferSize(0);
      advancedSettings0.setClientSocketTrafficClass("");
      advancedSettings0.getCharset();
      advancedSettings0.setClientIdentifier("org.quickserver.util.pool.MakeQSObjectPool");
      advancedSettings0.setPerformancePreferencesLatency(0);
      advancedSettings0.setDebugNonBlockingMode(true);
      advancedSettings0.getClientSocketTrafficClass();
      advancedSettings0.getBacklog();
      advancedSettings0.getClientSocketSendBufferSize();
      advancedSettings0.setPerformancePreferencesLatency((-1));
      advancedSettings0.getPerformancePreferencesConnectionTime();
      int int0 = advancedSettings0.getPerformancePreferencesConnectionTime();
      assertTrue(advancedSettings0.getDebugNonBlockingMode());
      assertEquals(0, int0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.1639556568820564
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketTcpNoDelay(false);
      advancedSettings0.setByteBufferSize((-2525));
      advancedSettings0.setSocketLinger((-2525));
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setClientIdentifier("");
      advancedSettings0.setClientSocketTcpNoDelay(false);
      advancedSettings0.getDebugNonBlockingMode();
      advancedSettings0.getPerformancePreferencesBandwidth();
      advancedSettings0.setQSObjectPoolMaker("");
      assertEquals((-2525), advancedSettings0.getSocketLinger());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=3.1276178314119045
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientIdentifier("");
      advancedSettings0.setByteBufferSize(0);
      advancedSettings0.setUseDirectByteBuffer(false);
      advancedSettings0.setMaxThreadsForNioWrite(3190);
      advancedSettings0.toXML("#Myqe04_R");
      advancedSettings0.setPerformancePreferencesLatency(0);
      advancedSettings0.setClientSocketSendBufferSize((-1740));
      advancedSettings0.toXML("#Myqe04_R");
      advancedSettings0.getDebugNonBlockingMode();
      advancedSettings0.setPerformancePreferencesConnectionTime(0);
      advancedSettings0.setDebugNonBlockingMode(false);
      advancedSettings0.setDebugNonBlockingMode(false);
      advancedSettings0.getCharset();
      advancedSettings0.toXML("P)r74Z$");
      advancedSettings0.setPerformancePreferencesLatency(0);
      assertEquals(3190, advancedSettings0.getMaxThreadsForNioWrite());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.599301927099795
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setPerformancePreferencesConnectionTime((-507));
      advancedSettings0.getSocketLinger();
      advancedSettings0.getSocketLinger();
      advancedSettings0.setPerformancePreferencesLatency(649);
      advancedSettings0.setPerformancePreferencesLatency(1);
      advancedSettings0.setDebugNonBlockingMode(true);
      advancedSettings0.setBacklog((-1));
      advancedSettings0.setClientIdentifier("");
      advancedSettings0.setPerformancePreferencesLatency((-507));
      advancedSettings0.setClientSocketReceiveBufferSize((-1155));
      advancedSettings0.setPerformancePreferencesLatency((-507));
      advancedSettings0.setClientSocketTcpNoDelay(true);
      advancedSettings0.setClientSocketTrafficClass("");
      advancedSettings0.setPerformancePreferencesBandwidth(0);
      advancedSettings0.getDebugNonBlockingMode();
      advancedSettings0.setCharset("");
      int int0 = advancedSettings0.getByteBufferSize();
      assertEquals((-507), advancedSettings0.getPerformancePreferencesLatency());
      assertEquals(65536, int0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.7709738809556868
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setSocketLinger(0);
      advancedSettings0.setClientSocketSendBufferSize((-1900));
      advancedSettings0.setPerformancePreferencesConnectionTime(10);
      advancedSettings0.setUseDirectByteBuffer(true);
      advancedSettings0.setClientSocketTrafficClass("org.quickserver.util.pool.MakeQSObjectPool");
      advancedSettings0.setClientSocketTcpNoDelay(true);
      advancedSettings0.getClientSocketSendBufferSize();
      advancedSettings0.setSocketLinger((-1900));
      advancedSettings0.getMaxThreadsForNioWrite();
      advancedSettings0.getDebugNonBlockingMode();
      advancedSettings0.getSocketLinger();
      advancedSettings0.getUseDirectByteBuffer();
      advancedSettings0.getClientSocketReceiveBufferSize();
      advancedSettings0.setPerformancePreferencesLatency((-1900));
      advancedSettings0.setUseDirectByteBuffer(true);
      advancedSettings0.getPerformancePreferencesConnectionTime();
      advancedSettings0.setPerformancePreferencesConnectionTime((-1900));
      advancedSettings0.getClientSocketReceiveBufferSize();
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
  /*Coverage entropy=3.131333581636701
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketReceiveBufferSize(616);
      advancedSettings0.getUseDirectByteBuffer();
      advancedSettings0.getClientSocketReceiveBufferSize();
      advancedSettings0.setClientSocketSendBufferSize((-1));
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setClientSocketReceiveBufferSize((-1));
      advancedSettings0.setMaxThreadsForNioWrite((-1965));
      advancedSettings0.getClientIdentifier();
      advancedSettings0.getSocketLinger();
      advancedSettings0.getClientSocketTrafficClass();
      advancedSettings0.getClientIdentifier();
      advancedSettings0.getClientIdentifier();
      advancedSettings0.getClientSocketSendBufferSize();
      advancedSettings0.setCharset((String) null);
      advancedSettings0.toXML("org.quickserver.net.server.impl.OptimisticClientIdentifier");
      advancedSettings0.setClientSocketTcpNoDelay(true);
      advancedSettings0.setClientIdentifier("org.quickserver.net.server.impl.OptimisticClientIdentifier");
      advancedSettings0.setClientSocketReceiveBufferSize(616);
      advancedSettings0.setClientIdentifier((String) null);
      advancedSettings0.setCharset("");
      assertEquals(616, advancedSettings0.getClientSocketReceiveBufferSize());
  }
}
