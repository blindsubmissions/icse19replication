/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 11:04:47 GMT 2018
 */

package org.quickserver.net.server;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.channels.SocketChannel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.evosuite.runtime.mock.java.net.MockInetSocketAddress;
import org.evosuite.runtime.mock.java.net.MockSocket;
import org.junit.runner.RunWith;
import org.quickserver.net.qsadmin.CommandHandler;
import org.quickserver.net.qsadmin.Data;
import org.quickserver.net.server.Authenticator;
import org.quickserver.net.server.ClientBinaryHandler;
import org.quickserver.net.server.ClientCommandHandler;
import org.quickserver.net.server.ClientData;
import org.quickserver.net.server.ClientEvent;
import org.quickserver.net.server.ClientEventHandler;
import org.quickserver.net.server.ClientExtendedEventHandler;
import org.quickserver.net.server.ClientHandler;
import org.quickserver.net.server.ClientObjectHandler;
import org.quickserver.net.server.ClientWriteHandler;
import org.quickserver.net.server.QuickServer;
import org.quickserver.net.server.TheClient;
import org.quickserver.net.server.impl.BlockingClientHandler;
import org.quickserver.net.server.impl.DefaultClientEventHandler;
import org.quickserver.net.server.impl.NonBlockingClientHandler;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TheClient_ESTest extends TheClient_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      TheClient theClient1 = new TheClient();
      theClient1.setTrusted(false);
      theClient1.getClientObjectHandler();
      theClient0.setClientObjectHandler((ClientObjectHandler) null);
      theClient0.setTrusted(false);
      theClient0.getTrusted();
      int int0 = theClient0.getMaxAuthTry();
      assertEquals(0, int0);
      
      String string0 = theClient0.toString();
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", string0);
      
      theClient1.getTimeoutMsg();
      assertTrue(theClient1.getCommunicationLogging());
      assertFalse(theClient1.getTrusted());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientObjectHandler();
      theClient0.setClientObjectHandler((ClientObjectHandler) null);
      Data data0 = new Data();
      theClient0.setClientData(data0);
      QuickServer quickServer0 = new QuickServer("EhphC#h:k-]/(Y");
      // Undeclared exception!
      try { 
        quickServer0.getSSLSocketFactory();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Secure setting is not yet enabled for loading!
         //
         verifyException("org.quickserver.net.server.QuickServer", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientWriteHandler();
      theClient0.setClientWriteHandler((ClientWriteHandler) null);
      theClient0.getSocket();
      int int0 = theClient0.getMaxAuthTry();
      assertEquals(0, int0);
      
      theClient0.getAuthenticator();
      theClient0.setAuthenticator((Authenticator) null);
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setClientExtendedEventHandler((ClientExtendedEventHandler) null);
      theClient0.setTimeout(1);
      theClient0.toString();
      assertEquals(1, theClient0.getTimeout());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      ClientEvent clientEvent0 = ClientEvent.LOST_CON;
      theClient0.setClientEvent(clientEvent0);
      theClient0.setTimeoutMsg("Cr-wCv4");
      DefaultClientEventHandler defaultClientEventHandler0 = new DefaultClientEventHandler();
      ClientHandler clientHandler0 = null;
      // Undeclared exception!
      try { 
        defaultClientEventHandler0.lostConnection((ClientHandler) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.quickserver.net.server.impl.DefaultClientEventHandler", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientData();
      BlockingClientHandler blockingClientHandler0 = new BlockingClientHandler();
      blockingClientHandler0.getServer();
      assertEquals("<ClientHandler-Pool#-1-ID:1>", blockingClientHandler0.getName());
      
      theClient0.setServer((QuickServer) null);
      theClient0.getClientBinaryHandler();
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setMaxConnectionMsg("org.quickserver.net.server.TheClient");
      theClient0.getClientObjectHandler();
      theClient0.setClientObjectHandler((ClientObjectHandler) null);
      theClient0.getClientWriteHandler();
      theClient0.setClientWriteHandler((ClientWriteHandler) null);
      theClient0.setMaxAuthTry(32);
      org.quickserver.net.qsadmin.Authenticator authenticator0 = new org.quickserver.net.qsadmin.Authenticator();
      theClient0.setClientAuthenticationHandler(authenticator0);
      assertEquals(32, theClient0.getMaxAuthTry());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientExtendedEventHandler();
      theClient0.setClientExtendedEventHandler((ClientExtendedEventHandler) null);
      String string0 = theClient0.toString();
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", string0);
      
      theClient0.getSocket();
      theClient0.getMaxAuthTryMsg();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setMaxAuthTryMsg("`(h%");
      int int0 = (-1077);
      theClient0.setTimeout((-1077));
      theClient0.getClientBinaryHandler();
      theClient0.setClientBinaryHandler((ClientBinaryHandler) null);
      String string0 = ":BX(1p1'+";
      QuickServer quickServer0 = new QuickServer(":BX(1p1'+");
      quickServer0.setServerBanner((String) null);
      quickServer0.makeServerSocket();
      quickServer0.getQSAdminServer();
      // Undeclared exception!
      quickServer0.startQSAdminServer();
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      DefaultClientEventHandler defaultClientEventHandler0 = new DefaultClientEventHandler();
      theClient0.setClientEventHandler(defaultClientEventHandler0);
      theClient0.getMaxAuthTryMsg();
      theClient0.setMaxAuthTry(0);
      assertFalse(theClient0.getTrusted());
      assertEquals(0, theClient0.getMaxAuthTry());
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientEventHandler();
      theClient0.setClientEventHandler((ClientEventHandler) null);
      theClient0.getAuthenticator();
      theClient0.setAuthenticator((Authenticator) null);
      theClient0.setTrusted(false);
      org.quickserver.net.qsadmin.Authenticator authenticator0 = new org.quickserver.net.qsadmin.Authenticator();
      BlockingClientHandler blockingClientHandler0 = new BlockingClientHandler();
      ClientEvent clientEvent0 = ClientEvent.MAX_CON_BLOCKING;
      theClient0.setClientEvent(clientEvent0);
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-118);
      byteArray0[2] = (byte)100;
      byteArray0[3] = (byte) (-67);
      byteArray0[4] = (byte)0;
      // Undeclared exception!
      try { 
        authenticator0.handleAuthentication((ClientHandler) blockingClientHandler0, byteArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // String/Byte mode not implemented!
         //
         verifyException("org.quickserver.net.server.QuickAuthenticationHandler", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setServer((QuickServer) null);
      theClient0.getClientWriteHandler();
      org.quickserver.net.qsadmin.Authenticator authenticator0 = new org.quickserver.net.qsadmin.Authenticator();
      NonBlockingClientHandler nonBlockingClientHandler0 = new NonBlockingClientHandler(9876);
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-14);
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte) (-86);
      byteArray0[3] = (byte) (-38);
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte) (-4);
      byteArray0[7] = (byte)13;
      // Undeclared exception!
      try { 
        authenticator0.handleAuthentication((ClientHandler) nonBlockingClientHandler0, byteArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // String/Byte mode not implemented!
         //
         verifyException("org.quickserver.net.server.QuickAuthenticationHandler", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientCommandHandler();
      theClient0.setClientCommandHandler((ClientCommandHandler) null);
      ClientEvent clientEvent0 = ClientEvent.WRITE;
      theClient0.setClientEvent(clientEvent0);
      QuickServer quickServer0 = new QuickServer();
      theClient0.setServer(quickServer0);
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      int int0 = 0;
      theClient0.setTimeout(0);
      NonBlockingClientHandler nonBlockingClientHandler0 = new NonBlockingClientHandler(0);
      nonBlockingClientHandler0.getSocketChannel();
      theClient0.setSocketChannel((SocketChannel) null);
      theClient0.getClientCommandHandler();
      theClient0.setClientCommandHandler((ClientCommandHandler) null);
      theClient0.getClientData();
      theClient0.getCommunicationLogging();
      theClient0.getClientObjectHandler();
      theClient0.setClientObjectHandler((ClientObjectHandler) null);
      byte[] byteArray0 = new byte[0];
      try { 
        MockInetAddress.getByAddress("org.quickserver.net.server.GhostSocketReaper", byteArray0);
        fail("Expecting exception: UnknownHostException");
      
      } catch(UnknownHostException e) {
         //
         // Not IPv4: []
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockInetAddress", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setTimeoutMsg("i.D.");
      theClient0.toString();
      theClient0.setClientCommandHandler((ClientCommandHandler) null);
      MockSocket mockSocket0 = null;
      try {
        mockSocket0 = new MockSocket("{TheClient ", 0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Remote address/port is not opened: org.evosuite.runtime.vnet.EndPointInfo@1ddcdbae
         //
         verifyException("org.evosuite.runtime.vnet.VirtualNetwork", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      boolean boolean0 = false;
      theClient0.setCommunicationLogging(false);
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      theClient0.setMaxConnectionMsg((String) null);
      MockSocket mockSocket0 = null;
      try {
        mockSocket0 = new MockSocket(inetAddress0, (-851), true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // port out of range:-851
         //
         verifyException("java.net.InetSocketAddress", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      int int0 = theClient0.getTimeout();
      assertEquals(0, int0);
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setMaxConnectionMsg("m_[#nVe9GyV");
      theClient0.getClientBinaryHandler();
      theClient0.setClientBinaryHandler((ClientBinaryHandler) null);
      boolean boolean0 = theClient0.getCommunicationLogging();
      MockSocket mockSocket0 = new MockSocket();
      mockSocket0.setKeepAlive(true);
      theClient0.setSocket(mockSocket0);
      theClient0.getClientBinaryHandler();
      int int0 = theClient0.getMaxAuthTry();
      assertEquals(0, int0);
      
      theClient0.getClientCommandHandler();
      theClient0.setClientCommandHandler((ClientCommandHandler) null);
      QuickServer quickServer0 = new QuickServer("hMaS? #H");
      theClient0.setServer(quickServer0);
      theClient0.getServer();
      theClient0.getClientCommandHandler();
      boolean boolean1 = theClient0.getTrusted();
      assertFalse(boolean1 == boolean0);
      
      String string0 = theClient0.toString();
      assertEquals("{TheClient Socket[unconnected], Event: (ClientEvent-Run Blocking)}", string0);
      
      theClient0.setClientBinaryHandler((ClientBinaryHandler) null);
      theClient0.getClientEventHandler();
      assertEquals(0, theClient0.getMaxAuthTry());
  }
}