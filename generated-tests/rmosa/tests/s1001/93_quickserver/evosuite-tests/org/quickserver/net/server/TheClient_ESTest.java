/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 04:57:02 GMT 2018
 */

package org.quickserver.net.server;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.InetAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketOption;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
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
import org.quickserver.net.server.ClientEventHandler;
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

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TheClient_ESTest extends TheClient_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientEventHandler();
      theClient0.getSocket();
      boolean boolean0 = theClient0.getTrusted();
      assertFalse(boolean0);
      
      theClient0.setClientEventHandler((ClientEventHandler) null);
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getAuthenticator();
      theClient0.setAuthenticator((Authenticator) null);
      theClient0.setClientWriteHandler((ClientWriteHandler) null);
      theClient0.getCommunicationLogging();
      int int0 = 1938;
      MockInetSocketAddress mockInetSocketAddress0 = null;
      try {
        mockInetSocketAddress0 = new MockInetSocketAddress((String) null, 1938);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // hostname can't be null
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockInetSocketAddress", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      BlockingClientHandler blockingClientHandler0 = new BlockingClientHandler(0);
      assertEquals("<ClientHandler-Pool#0-ID:1>", blockingClientHandler0.getName());
      
      theClient0.getClientData();
      theClient0.setClientData((ClientData) null);
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getMaxConnectionMsg();
      theClient0.getAuthenticator();
      theClient0.setMaxConnectionMsg((String) null);
      theClient0.getMaxConnectionMsg();
      theClient0.getClientEventHandler();
      theClient0.getClientEvent();
      String string0 = theClient0.toString();
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", string0);
      
      theClient0.setMaxConnectionMsg((String) null);
      theClient0.getClientData();
      QuickServer quickServer0 = new QuickServer((String) null);
      CommandHandler commandHandler0 = new CommandHandler();
      theClient0.setClientCommandHandler(commandHandler0);
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientBinaryHandler();
      theClient0.setClientBinaryHandler((ClientBinaryHandler) null);
      theClient0.getClientEventHandler();
      theClient0.getClientObjectHandler();
      ClientEvent clientEvent0 = ClientEvent.RUN_BLOCKING;
      theClient0.setClientEvent(clientEvent0);
      TheClient theClient1 = new TheClient();
      theClient1.getClientBinaryHandler();
      theClient0.setClientBinaryHandler((ClientBinaryHandler) null);
      TheClient theClient2 = new TheClient();
      theClient2.getTimeoutMsg();
      String string0 = theClient1.toString();
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", string0);
      
      int int0 = theClient2.getMaxAuthTry();
      assertTrue(theClient2.getCommunicationLogging());
      assertEquals(0, int0);
      assertFalse(theClient2.getTrusted());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getTrusted();
      int int0 = 125;
      theClient0.setMaxAuthTry(125);
      theClient0.getClientExtendedEventHandler();
      theClient0.setClientExtendedEventHandler((ClientExtendedEventHandler) null);
      TheClient theClient1 = new TheClient();
      theClient1.getClientObjectHandler();
      ClientEvent clientEvent0 = ClientEvent.RUN_BLOCKING;
      ClientEvent clientEvent1 = ClientEvent.CLOSE_CON;
      theClient1.setClientEvent(clientEvent1);
      try { 
        MockInetAddress.getByAddress("mQ(12b0?", (byte[]) null);
        fail("Expecting exception: UnknownHostException");
      
      } catch(UnknownHostException e) {
         //
         // Not IPv4: null
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockInetAddress", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setTrusted(false);
      theClient0.setMaxConnectionMsg("org.quickserver.net.server.TheClient");
      ClientEvent clientEvent0 = ClientEvent.ACCEPT;
      theClient0.setClientEvent(clientEvent0);
      org.quickserver.net.qsadmin.Authenticator authenticator0 = new org.quickserver.net.qsadmin.Authenticator();
      NonBlockingClientHandler nonBlockingClientHandler0 = new NonBlockingClientHandler((-1046));
      // Undeclared exception!
      try { 
        authenticator0.handleAuthentication((ClientHandler) nonBlockingClientHandler0, (byte[]) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // String/Byte mode not implemented!
         //
         verifyException("org.quickserver.net.server.QuickAuthenticationHandler", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Proxy proxy0 = Proxy.NO_PROXY;
      MockSocket mockSocket0 = new MockSocket(proxy0);
      Data data0 = new Data();
      TheClient theClient0 = new TheClient();
      QuickServer quickServer0 = new QuickServer("B}j'}Yz!ou=m$X{", 0);
      theClient0.setServer(quickServer0);
      theClient0.toString();
      String string0 = theClient0.toString();
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", string0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setTimeoutMsg((String) null);
      theClient0.setMaxAuthTryMsg("+OK Server Stopped");
      theClient0.toString();
      TheClient theClient1 = new TheClient();
      TheClient theClient2 = new TheClient();
      theClient2.getClientCommandHandler();
      theClient1.setClientCommandHandler((ClientCommandHandler) null);
      theClient1.toString();
      TheClient theClient3 = new TheClient();
      String string0 = theClient3.toString();
      assertTrue(theClient3.getCommunicationLogging());
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", string0);
      assertFalse(theClient3.getTrusted());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      BlockingClientHandler blockingClientHandler0 = new BlockingClientHandler();
      blockingClientHandler0.getClientData();
      theClient0.setClientData((ClientData) null);
      theClient0.setTimeout(1131);
      TheClient theClient1 = new TheClient();
      theClient1.getSocketChannel();
      ByteBuffer[] byteBufferArray0 = new ByteBuffer[4];
      // Undeclared exception!
      try { 
        ByteBuffer.allocate((-1072));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.ByteBuffer", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getSocket();
      theClient0.setSocket((Socket) null);
      Data data0 = new Data();
      theClient0.setClientData(data0);
      theClient0.setMaxAuthTryMsg("R[dGQ bNgH5\"%");
      theClient0.setMaxAuthTryMsg("{TheClient ");
      theClient0.toString();
      String string0 = theClient0.toString();
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", string0);
      
      int int0 = theClient0.getMaxAuthTry();
      assertFalse(theClient0.getTrusted());
      assertEquals(0, int0);
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getMaxAuthTryMsg();
      theClient0.getClientWriteHandler();
      theClient0.setClientWriteHandler((ClientWriteHandler) null);
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      Data data0 = new Data();
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-13);
      byteArray0[1] = (byte) (-108);
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)0;
      data0.setPassword(byteArray0);
      data0.setUsername("-ERR insufficient param");
      theClient0.setClientData(data0);
      theClient0.getTimeout();
      theClient0.setTrusted(true);
      String string0 = "</server-hooks>\n";
      try { 
        QuickServer.load("</server-hooks>\n");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Could not init server from xml file
         //
         verifyException("org.quickserver.net.server.QuickServer", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientAuthenticationHandler();
      theClient0.setClientAuthenticationHandler((ClientAuthenticationHandler) null);
      theClient0.getClientObjectHandler();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      BlockingClientHandler blockingClientHandler0 = new BlockingClientHandler();
      blockingClientHandler0.resetTotalReadBytes();
      blockingClientHandler0.getSocket();
      assertEquals("<ClientHandler-Pool#-1-ID:7>", blockingClientHandler0.getName());
      
      theClient0.setSocket((Socket) null);
      ClientEvent clientEvent0 = ClientEvent.MAX_CON_BLOCKING;
      theClient0.setClientEvent(clientEvent0);
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setTimeout(25);
      theClient0.getClientEvent();
      BlockingClientHandler blockingClientHandler0 = new BlockingClientHandler(1);
      blockingClientHandler0.getClientData();
      theClient0.setClientData((ClientData) null);
      theClient0.setSocketChannel((SocketChannel) null);
      QuickServer quickServer0 = new QuickServer((String) null, 25);
      DataType dataType0 = DataType.IN;
      quickServer0.getDefaultDataMode(dataType0);
      QuickServer.getVersionNo();
      theClient0.setServer(quickServer0);
      DefaultClientEventHandler defaultClientEventHandler0 = new DefaultClientEventHandler();
      // Undeclared exception!
      try { 
        defaultClientEventHandler0.gotConnected(blockingClientHandler0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.quickserver.net.server.impl.BasicClientHandler", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientObjectHandler();
      theClient0.setClientObjectHandler((ClientObjectHandler) null);
      MockSocket mockSocket0 = new MockSocket();
      Proxy proxy0 = Proxy.NO_PROXY;
      MockSocket mockSocket1 = new MockSocket(proxy0);
      theClient0.setSocket(mockSocket1);
      Data data0 = new Data();
      theClient0.setClientData(data0);
      theClient0.toString();
      theClient0.toString();
      String string0 = theClient0.toString();
      assertEquals("{TheClient Socket[unconnected], Event: (ClientEvent-Run Blocking)}", string0);
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }
}
