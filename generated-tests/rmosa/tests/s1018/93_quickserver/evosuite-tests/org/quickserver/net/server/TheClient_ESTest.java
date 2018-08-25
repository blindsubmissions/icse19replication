/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 13:41:17 GMT 2018
 */

package org.quickserver.net.server;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.nio.channels.SocketChannel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockInetSocketAddress;
import org.evosuite.runtime.mock.java.net.MockSocket;
import org.junit.runner.RunWith;
import org.quickserver.net.qsadmin.CommandHandler;
import org.quickserver.net.qsadmin.Data;
import org.quickserver.net.server.Authenticator;
import org.quickserver.net.server.ClientAuthenticationHandler;
import org.quickserver.net.server.ClientBinaryHandler;
import org.quickserver.net.server.ClientCommandHandler;
import org.quickserver.net.server.ClientData;
import org.quickserver.net.server.ClientEvent;
import org.quickserver.net.server.ClientExtendedEventHandler;
import org.quickserver.net.server.ClientHandler;
import org.quickserver.net.server.ClientObjectHandler;
import org.quickserver.net.server.ClientWriteHandler;
import org.quickserver.net.server.DataType;
import org.quickserver.net.server.QuickServer;
import org.quickserver.net.server.TheClient;
import org.quickserver.net.server.impl.BlockingClientHandler;
import org.quickserver.net.server.impl.DefaultClientEventHandler;
import org.quickserver.net.server.impl.NonBlockingClientHandler;
import org.quickserver.util.xmlreader.QuickServerConfig;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TheClient_ESTest extends TheClient_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getAuthenticator();
      theClient0.setAuthenticator((Authenticator) null);
      theClient0.setMaxAuthTryMsg("");
      theClient0.getClientWriteHandler();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getAuthenticator();
      BlockingClientHandler blockingClientHandler0 = new BlockingClientHandler(0);
      blockingClientHandler0.getServer();
      theClient0.setServer((QuickServer) null);
      theClient0.setAuthenticator((Authenticator) null);
      theClient0.setMaxAuthTry((-1537));
      theClient0.getTimeout();
      theClient0.setMaxConnectionMsg("aq]d");
      assertEquals((-1537), theClient0.getMaxAuthTry());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getMaxAuthTryMsg();
      DefaultClientEventHandler defaultClientEventHandler0 = new DefaultClientEventHandler();
      theClient0.setClientEventHandler(defaultClientEventHandler0);
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setTrusted(false);
      theClient0.setTimeout(50);
      Data data0 = new Data();
      theClient0.setClientData(data0);
      theClient0.setClientObjectHandler((ClientObjectHandler) null);
      ClientEvent clientEvent0 = ClientEvent.CLOSE_CON;
      theClient0.setClientEvent(clientEvent0);
      theClient0.setTrusted(true);
      theClient0.getMaxAuthTryMsg();
      assertTrue(theClient0.getTrusted());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientAuthenticationHandler();
      theClient0.setClientAuthenticationHandler((ClientAuthenticationHandler) null);
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setClientWriteHandler((ClientWriteHandler) null);
      theClient0.getCommunicationLogging();
      boolean boolean0 = theClient0.getCommunicationLogging();
      assertTrue(boolean0);
      
      theClient0.getAuthenticator();
      theClient0.setAuthenticator((Authenticator) null);
      theClient0.getClientExtendedEventHandler();
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientData();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      InetSocketAddress inetSocketAddress0 = MockInetSocketAddress.createUnresolved("", 202);
      Proxy.Type proxy_Type0 = Proxy.Type.SOCKS;
      Proxy proxy0 = new Proxy(proxy_Type0, inetSocketAddress0);
      MockSocket mockSocket0 = new MockSocket(proxy0);
      theClient0.getClientBinaryHandler();
      theClient0.setClientBinaryHandler((ClientBinaryHandler) null);
      TheClient theClient1 = new TheClient();
      theClient0.getClientExtendedEventHandler();
      theClient0.setClientExtendedEventHandler((ClientExtendedEventHandler) null);
      theClient1.getMaxAuthTry();
      TheClient theClient2 = new TheClient();
      theClient2.setServer((QuickServer) null);
      theClient1.setMaxAuthTryMsg("");
      theClient2.getSocketChannel();
      theClient1.setTrusted(false);
      theClient1.setCommunicationLogging(false);
      assertFalse(theClient1.getCommunicationLogging());
      
      theClient0.getMaxAuthTryMsg();
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientObjectHandler();
      theClient0.setClientObjectHandler((ClientObjectHandler) null);
      theClient0.getClientWriteHandler();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientExtendedEventHandler();
      theClient0.getClientCommandHandler();
      theClient0.setClientCommandHandler((ClientCommandHandler) null);
      DefaultClientEventHandler defaultClientEventHandler0 = new DefaultClientEventHandler();
      theClient0.setClientEventHandler(defaultClientEventHandler0);
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      ClientEvent clientEvent0 = ClientEvent.ACCEPT;
      theClient0.setClientEvent(clientEvent0);
      theClient0.getAuthenticator();
      theClient0.setCommunicationLogging(false);
      theClient0.getMaxAuthTryMsg();
      DefaultClientEventHandler defaultClientEventHandler0 = new DefaultClientEventHandler();
      boolean boolean0 = false;
      QuickServer quickServer0 = new QuickServer();
      // Undeclared exception!
      try { 
        quickServer0.findClientByKey((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.quickserver.net.server.QuickServer", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientBinaryHandler();
      theClient0.setClientBinaryHandler((ClientBinaryHandler) null);
      theClient0.setTimeoutMsg("F{07A]d_[V");
      theClient0.getClientObjectHandler();
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setTimeout((-133));
      theClient0.getClientWriteHandler();
      theClient0.setClientWriteHandler((ClientWriteHandler) null);
      ClientEvent clientEvent0 = ClientEvent.ACCEPT;
      theClient0.setClientEvent(clientEvent0);
      boolean boolean0 = theClient0.getCommunicationLogging();
      assertEquals((-133), theClient0.getTimeout());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientObjectHandler();
      theClient0.setTrusted(true);
      theClient0.setClientObjectHandler((ClientObjectHandler) null);
      theClient0.setTimeoutMsg(";BDVm`(6)wD\"&+");
      CommandHandler commandHandler0 = new CommandHandler();
      NonBlockingClientHandler nonBlockingClientHandler0 = new NonBlockingClientHandler();
      commandHandler0.lostConnection(nonBlockingClientHandler0);
      NonBlockingClientHandler nonBlockingClientHandler1 = new NonBlockingClientHandler();
      commandHandler0.lostConnection(nonBlockingClientHandler1);
      BlockingClientHandler blockingClientHandler0 = new BlockingClientHandler();
      // Undeclared exception!
      try { 
        blockingClientHandler0.getBufferedWriter();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Writer", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setMaxConnectionMsg((String) null);
      theClient0.setMaxConnectionMsg((String) null);
      theClient0.getClientEventHandler();
      theClient0.setTrusted(false);
      assertTrue(theClient0.getCommunicationLogging());
      
      theClient0.setCommunicationLogging(false);
      theClient0.getSocketChannel();
      theClient0.setSocketChannel((SocketChannel) null);
      theClient0.setClientWriteHandler((ClientWriteHandler) null);
      theClient0.getServer();
      theClient0.getClientCommandHandler();
      theClient0.setTimeoutMsg("\t<class-name>");
      assertFalse(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientCommandHandler();
      theClient0.getClientObjectHandler();
      theClient0.setClientObjectHandler((ClientObjectHandler) null);
      theClient0.getTimeoutMsg();
      String string0 = "";
      ClientEvent clientEvent0 = ClientEvent.LOST_CON;
      theClient0.setClientEvent(clientEvent0);
      theClient0.setTimeoutMsg("");
      int int0 = 3673;
      BlockingClientHandler blockingClientHandler0 = new BlockingClientHandler(3673);
      // Undeclared exception!
      try { 
        blockingClientHandler0.getSelectionKey();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Can't get in blocking mode!
         //
         verifyException("org.quickserver.net.server.impl.BlockingClientHandler", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      QuickServer quickServer0 = new QuickServer("");
      theClient0.setServer(quickServer0);
      boolean boolean0 = theClient0.getTrusted();
      assertFalse(boolean0);
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      InetSocketAddress inetSocketAddress0 = MockInetSocketAddress.createUnresolved("", 4030);
      Proxy.Type proxy_Type0 = Proxy.Type.SOCKS;
      Proxy proxy0 = new Proxy(proxy_Type0, inetSocketAddress0);
      MockSocket mockSocket0 = new MockSocket(proxy0);
      theClient0.setSocket(mockSocket0);
      theClient0.setTimeout(23);
      theClient0.setCommunicationLogging(false);
      QuickServer quickServer0 = new QuickServer("");
      DataType dataType0 = DataType.IN;
      DataType dataType1 = DataType.OUT;
      quickServer0.getDefaultDataMode(dataType1);
      quickServer0.setTimeout(17);
      theClient0.setServer(quickServer0);
      theClient0.getMaxConnectionMsg();
      theClient0.toString();
      theClient0.toString();
      theClient0.toString();
      theClient0.toString();
      assertEquals(23, theClient0.getTimeout());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      InetSocketAddress inetSocketAddress0 = MockInetSocketAddress.createUnresolved("", 202);
      Proxy.Type proxy_Type0 = Proxy.Type.SOCKS;
      Proxy proxy0 = new Proxy(proxy_Type0, inetSocketAddress0);
      MockSocket mockSocket0 = new MockSocket(proxy0);
      theClient0.setSocket(mockSocket0);
      QuickServer quickServer0 = new QuickServer("\\j\")");
      DataType dataType0 = DataType.IN;
      DataType dataType1 = DataType.IN;
      quickServer0.getDefaultDataMode(dataType1);
      quickServer0.setTimeout((-3025));
      theClient0.setServer(quickServer0);
      theClient0.toString();
      theClient0.setTimeoutMsg(";vF9Gb9E-j7}4|m,|");
      theClient0.toString();
      theClient0.toString();
      theClient0.toString();
      theClient0.toString();
      TheClient theClient1 = new TheClient();
      theClient0.toString();
      theClient0.toString();
      theClient1.toString();
      theClient0.toString();
      theClient1.toString();
      String string0 = theClient1.toString();
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", string0);
      assertTrue(theClient1.getCommunicationLogging());
      assertFalse(theClient1.getTrusted());
  }
}