/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 15:45:44 GMT 2018
 */

package org.quickserver.net.server;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.InetAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.nio.channels.SocketChannel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.evosuite.runtime.mock.java.net.MockInetSocketAddress;
import org.evosuite.runtime.mock.java.net.MockSocket;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteRemoteAddress;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.evosuite.runtime.testdata.NetworkHandling;
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
import org.quickserver.net.server.QuickServer;
import org.quickserver.net.server.TheClient;
import org.quickserver.net.server.impl.BlockingClientHandler;
import org.quickserver.net.server.impl.DefaultClientEventHandler;
import org.quickserver.net.server.impl.NonBlockingClientHandler;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TheClient_ESTest extends TheClient_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      DefaultClientEventHandler defaultClientEventHandler0 = new DefaultClientEventHandler();
      CommandHandler commandHandler0 = new CommandHandler();
      defaultClientEventHandler0.setClientCommandHandler(commandHandler0);
      theClient0.setClientEventHandler(defaultClientEventHandler0);
      theClient0.getClientBinaryHandler();
      theClient0.setClientBinaryHandler((ClientBinaryHandler) null);
      theClient0.toString();
      theClient0.getServer();
      theClient0.getClientAuthenticationHandler();
      theClient0.setClientAuthenticationHandler((ClientAuthenticationHandler) null);
      theClient0.getClientCommandHandler();
      ClientEvent clientEvent0 = ClientEvent.LOST_CON;
      theClient0.setClientEvent(clientEvent0);
      theClient0.setClientEventHandler(defaultClientEventHandler0);
      theClient0.getServer();
      theClient0.getClientBinaryHandler();
      theClient0.getClientCommandHandler();
      BlockingClientHandler blockingClientHandler0 = new BlockingClientHandler(0);
      // Undeclared exception!
      try { 
        blockingClientHandler0.readBinary();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Can't read Binary :DataType.IN is not in DataMode.BINARY
         //
         verifyException("org.quickserver.net.server.impl.BasicClientHandler", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getCommunicationLogging();
      DefaultClientEventHandler defaultClientEventHandler0 = new DefaultClientEventHandler();
      theClient0.getClientCommandHandler();
      defaultClientEventHandler0.setClientCommandHandler((ClientCommandHandler) null);
      CommandHandler commandHandler0 = new CommandHandler();
      defaultClientEventHandler0.setClientCommandHandler(commandHandler0);
      theClient0.setClientEventHandler(defaultClientEventHandler0);
      theClient0.setCommunicationLogging(false);
      theClient0.setTimeout(3001);
      theClient0.setMaxConnectionMsg(", Event: ");
      theClient0.setTimeout(111);
      theClient0.setTimeoutMsg("V38r#M(O.}");
      theClient0.getClientWriteHandler();
      theClient0.getClientObjectHandler();
      theClient0.getAuthenticator();
      assertEquals(111, theClient0.getTimeout());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setSocketChannel((SocketChannel) null);
      theClient0.setClientEvent((ClientEvent) null);
      theClient0.setTimeoutMsg("");
      theClient0.setCommunicationLogging(false);
      theClient0.setTimeout((-1931));
      theClient0.getClientObjectHandler();
      theClient0.setClientObjectHandler((ClientObjectHandler) null);
      theClient0.getAuthenticator();
      theClient0.getClientEvent();
      CommandHandler commandHandler0 = new CommandHandler();
      theClient0.setClientCommandHandler(commandHandler0);
      theClient0.getClientData();
      theClient0.setClientData((ClientData) null);
      MockSocket mockSocket0 = null;
      try {
        mockSocket0 = new MockSocket((InetAddress) null, (-1206), false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockSocket", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setCommunicationLogging(true);
      theClient0.getClientWriteHandler();
      theClient0.setClientWriteHandler((ClientWriteHandler) null);
      theClient0.setTrusted(false);
      theClient0.getClientBinaryHandler();
      theClient0.getMaxAuthTryMsg();
      theClient0.getClientEvent();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientBinaryHandler();
      theClient0.toString();
      theClient0.setClientBinaryHandler((ClientBinaryHandler) null);
      ClientExtendedEventHandler clientExtendedEventHandler0 = null;
      theClient0.setClientExtendedEventHandler((ClientExtendedEventHandler) null);
      theClient0.getClientObjectHandler();
      theClient0.setClientObjectHandler((ClientObjectHandler) null);
      theClient0.getClientWriteHandler();
      theClient0.setClientWriteHandler((ClientWriteHandler) null);
      theClient0.setClientWriteHandler((ClientWriteHandler) null);
      theClient0.setMaxAuthTry(0);
      theClient0.getTimeoutMsg();
      theClient0.getMaxAuthTryMsg();
      theClient0.getAuthenticator();
      theClient0.getAuthenticator();
      int int0 = 0;
      BlockingClientHandler blockingClientHandler0 = new BlockingClientHandler(0);
      Proxy.Type proxy_Type0 = Proxy.Type.HTTP;
      MockInetSocketAddress mockInetSocketAddress0 = new MockInetSocketAddress("", 0);
      Proxy proxy0 = new Proxy(proxy_Type0, mockInetSocketAddress0);
      MockSocket mockSocket0 = null;
      try {
        mockSocket0 = new MockSocket(proxy0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid Proxy
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockSocket", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      MockSocket mockSocket0 = new MockSocket();
      theClient0.setSocket(mockSocket0);
      theClient0.setTimeout((-3008));
      assertEquals((-3008), theClient0.getTimeout());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      SocketChannel socketChannel0 = SocketChannel.open();
      theClient0.getClientObjectHandler();
      theClient0.setClientObjectHandler((ClientObjectHandler) null);
      theClient0.setSocketChannel(socketChannel0);
      theClient0.getClientCommandHandler();
      theClient0.getClientEventHandler();
      MockSocket mockSocket0 = new MockSocket();
      mockSocket0.getRemoteSocketAddress();
      // Undeclared exception!
      try { 
        SocketChannel.open((SocketAddress) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientData();
      theClient0.setClientEvent((ClientEvent) null);
      theClient0.setClientData((ClientData) null);
      theClient0.setTimeout(862);
      theClient0.getMaxConnectionMsg();
      TheClient theClient1 = new TheClient();
      theClient1.getAuthenticator();
      theClient0.setMaxConnectionMsg((String) null);
      theClient0.setAuthenticator((Authenticator) null);
      theClient1.getClientEventHandler();
      theClient0.setClientEventHandler((ClientEventHandler) null);
      theClient0.getClientBinaryHandler();
      theClient1.getSocketChannel();
      theClient0.getTimeout();
      theClient1.getMaxConnectionMsg();
      Data data0 = new Data();
      theClient0.setClientData(data0);
      theClient0.getClientWriteHandler();
      theClient1.getClientExtendedEventHandler();
      theClient0.setClientExtendedEventHandler((ClientExtendedEventHandler) null);
      theClient1.getClientBinaryHandler();
      theClient1.getMaxAuthTry();
      theClient0.getClientExtendedEventHandler();
      theClient1.getServer();
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      MockSocket mockSocket0 = null;
      try {
        mockSocket0 = new MockSocket(inetAddress0, (-1854), true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // port out of range:-1854
         //
         verifyException("java.net.InetSocketAddress", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.772588722239781
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setTimeout((-2554));
      theClient0.getAuthenticator();
      theClient0.setMaxConnectionMsg((String) null);
      theClient0.setTimeoutMsg((String) null);
      ClientEvent clientEvent0 = theClient0.getClientEvent();
      theClient0.setClientEvent(clientEvent0);
      theClient0.setMaxAuthTryMsg((String) null);
      theClient0.getClientExtendedEventHandler();
      boolean boolean0 = false;
      theClient0.setTrusted(false);
      theClient0.getMaxAuthTry();
      theClient0.getClientData();
      theClient0.getTimeout();
      theClient0.getClientAuthenticationHandler();
      theClient0.getServer();
      theClient0.getClientObjectHandler();
      CommandHandler commandHandler0 = new CommandHandler();
      NonBlockingClientHandler nonBlockingClientHandler0 = new NonBlockingClientHandler(25);
      nonBlockingClientHandler0.hasEvent(clientEvent0);
      try { 
        commandHandler0.handleCommand(nonBlockingClientHandler0, (String) null);
        fail("Expecting exception: SocketException");
      
      } catch(SocketException e) {
         //
         // Connection is no more open!
         //
         verifyException("org.quickserver.net.server.impl.BasicClientHandler", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setTimeoutMsg("org.quickserver.net.server.TheClient");
      ClientEvent clientEvent0 = theClient0.getClientEvent();
      theClient0.setClientEvent(clientEvent0);
      theClient0.getSocket();
      theClient0.getClientExtendedEventHandler();
      theClient0.setMaxAuthTry(0);
      theClient0.getServer();
      CommandHandler commandHandler0 = new CommandHandler();
      QuickServer quickServer0 = new QuickServer();
      String string0 = "5X[T{rjA:s@bpw wOB";
      // Undeclared exception!
      try { 
        quickServer0.findClientByKey("5X[T{rjA:s@bpw wOB");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.quickserver.net.server.QuickServer", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setServer((QuickServer) null);
      theClient0.getClientBinaryHandler();
      theClient0.getClientExtendedEventHandler();
      theClient0.setClientExtendedEventHandler((ClientExtendedEventHandler) null);
      theClient0.setClientBinaryHandler((ClientBinaryHandler) null);
      DefaultClientEventHandler defaultClientEventHandler0 = new DefaultClientEventHandler();
      NonBlockingClientHandler nonBlockingClientHandler0 = new NonBlockingClientHandler(735);
      boolean boolean0 = false;
      try { 
        nonBlockingClientHandler0.isConected();
        fail("Expecting exception: SocketException");
      
      } catch(SocketException e) {
         //
         // Connection is no more open!
         //
         verifyException("org.quickserver.net.server.impl.BasicClientHandler", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getAuthenticator();
      theClient0.setAuthenticator((Authenticator) null);
      CommandHandler commandHandler0 = new CommandHandler();
      theClient0.setClientEventHandler(commandHandler0);
      theClient0.setSocket((Socket) null);
      theClient0.getAuthenticator();
      theClient0.getTrusted();
      boolean boolean0 = theClient0.getTrusted();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      MockSocket mockSocket0 = new MockSocket();
      theClient0.setSocket(mockSocket0);
      theClient0.toString();
      theClient0.setMaxConnectionMsg("{TheClient Socket[unconnected], Event: (ClientEvent-Run Blocking)}");
      BlockingClientHandler blockingClientHandler0 = new BlockingClientHandler((-3793));
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress(", Event: ", 1);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      blockingClientHandler0.getClientData();
      assertEquals("<ClientHandler-Pool#-3793-ID:1>", blockingClientHandler0.getName());
      
      theClient0.setClientData((ClientData) null);
      theClient0.setCommunicationLogging(true);
      System.setCurrentTimeMillis(500L);
      theClient0.toString();
      System.setCurrentTimeMillis(500L);
      theClient0.toString();
      theClient0.toString();
      System.setCurrentTimeMillis(2048L);
      System.setCurrentTimeMillis((-3793));
      System.setCurrentTimeMillis(2048L);
      String string0 = theClient0.toString();
      assertEquals("{TheClient Socket[unconnected], Event: (ClientEvent-Run Blocking)}", string0);
  }
}
