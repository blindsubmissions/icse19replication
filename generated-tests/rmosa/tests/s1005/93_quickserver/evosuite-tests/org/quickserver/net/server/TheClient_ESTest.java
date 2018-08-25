/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 07:26:08 GMT 2018
 */

package org.quickserver.net.server;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Proxy;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.evosuite.runtime.mock.java.net.MockInetSocketAddress;
import org.evosuite.runtime.mock.java.net.MockSocket;
import org.junit.runner.RunWith;
import org.quickserver.net.qsadmin.CommandHandler;
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
import org.quickserver.net.server.impl.NonBlockingClientHandler;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TheClient_ESTest extends TheClient_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientCommandHandler();
      theClient0.setClientCommandHandler((ClientCommandHandler) null);
      theClient0.getClientCommandHandler();
      org.quickserver.net.qsadmin.Authenticator authenticator0 = new org.quickserver.net.qsadmin.Authenticator();
      NonBlockingClientHandler nonBlockingClientHandler0 = new NonBlockingClientHandler((-1374));
      // Undeclared exception!
      try { 
        authenticator0.handleAuthentication((ClientHandler) nonBlockingClientHandler0, (Object) theClient0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // String/Byte mode not implemented!
         //
         verifyException("org.quickserver.net.server.QuickAuthenticationHandler", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientWriteHandler();
      theClient0.setClientWriteHandler((ClientWriteHandler) null);
      int int0 = 0;
      MockSocket mockSocket0 = null;
      try {
        mockSocket0 = new MockSocket("o*b]KBB>", 0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Remote address/port is not opened: org.evosuite.runtime.vnet.EndPointInfo@67b7b733
         //
         verifyException("org.evosuite.runtime.vnet.VirtualNetwork", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientData();
      BlockingClientHandler blockingClientHandler0 = new BlockingClientHandler(18);
      blockingClientHandler0.getClientData();
      assertEquals("<ClientHandler-Pool#18-ID:1>", blockingClientHandler0.getName());
      
      theClient0.setClientData((ClientData) null);
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setMaxAuthTry(1137);
      QuickServer quickServer0 = new QuickServer();
      theClient0.setServer(quickServer0);
      assertEquals(1137, theClient0.getMaxAuthTry());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientAuthenticationHandler();
      theClient0.getClientObjectHandler();
      theClient0.setClientObjectHandler((ClientObjectHandler) null);
      theClient0.getClientEvent();
      theClient0.getClientCommandHandler();
      String string0 = theClient0.toString();
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", string0);
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setTimeout((-187));
      theClient0.getTimeoutMsg();
      theClient0.toString();
      assertEquals((-187), theClient0.getTimeout());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getAuthenticator();
      theClient0.setAuthenticator((Authenticator) null);
      theClient0.setMaxConnectionMsg((String) null);
      theClient0.getTrusted();
      theClient0.getClientBinaryHandler();
      theClient0.setClientBinaryHandler((ClientBinaryHandler) null);
      CommandHandler commandHandler0 = new CommandHandler();
      QuickServer quickServer0 = new QuickServer("C(^\u0007Dzpob'a*");
      String string0 = "</class-name>\n";
      // Undeclared exception!
      try { 
        quickServer0.findClientByKey("</class-name>\n");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.quickserver.net.server.QuickServer", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setCommunicationLogging(true);
      theClient0.toString();
      String string0 = theClient0.toString();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", string0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.toString();
      CommandHandler commandHandler0 = new CommandHandler();
      theClient0.setClientEventHandler(commandHandler0);
      QuickServer quickServer0 = new QuickServer();
      quickServer0.setConsoleLoggingToMini();
      quickServer0.getBindAddr();
      theClient0.setMaxConnectionMsg("~5|,+mNnw");
      ClientEventHandler clientEventHandler0 = theClient0.getClientEventHandler();
      TheClient theClient1 = new TheClient();
      theClient1.setClientEventHandler(clientEventHandler0);
      theClient1.toString();
      System.setCurrentTimeMillis((-1077L));
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setTrusted(true);
      theClient0.getClientAuthenticationHandler();
      String string0 = "ki}&FPP";
      QuickServer quickServer0 = new QuickServer("ki}&FPP");
      quickServer0.setConsoleLoggingToMini();
      quickServer0.getBindAddr();
      quickServer0.getQSAdminServer();
      // Undeclared exception!
      try { 
        quickServer0.loadSSLContext();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Secure setting is not yet enabled for loading!
         //
         verifyException("org.quickserver.net.server.QuickServer", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getMaxConnectionMsg();
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getTimeoutMsg();
      org.quickserver.net.qsadmin.Authenticator authenticator0 = new org.quickserver.net.qsadmin.Authenticator();
      theClient0.setClientAuthenticationHandler(authenticator0);
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setTimeoutMsg("lQ%lG-'#!^R&KP@L");
      theClient0.getClientObjectHandler();
      InetAddress inetAddress0 = MockInetAddress.getByName(":|f3");
      MockSocket mockSocket0 = null;
      try {
        mockSocket0 = new MockSocket(inetAddress0, 0, true);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Remote address/port is not opened: org.evosuite.runtime.vnet.EndPointInfo@67b7b733
         //
         verifyException("org.evosuite.runtime.vnet.VirtualNetwork", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getTimeout();
      theClient0.getCommunicationLogging();
      TheClient theClient1 = new TheClient();
      theClient0.getServer();
      Proxy.Type proxy_Type0 = Proxy.Type.HTTP;
      MockInetSocketAddress mockInetSocketAddress0 = new MockInetSocketAddress("-ERR System Error!", 0);
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
  //Test case number: 14
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getSocketChannel();
      theClient0.setSocketChannel((SocketChannel) null);
      org.quickserver.net.qsadmin.Authenticator authenticator0 = new org.quickserver.net.qsadmin.Authenticator();
      theClient0.setClientAuthenticationHandler(authenticator0);
      ByteBuffer[] byteBufferArray0 = new ByteBuffer[3];
      NonBlockingClientHandler nonBlockingClientHandler0 = new NonBlockingClientHandler();
      try { 
        nonBlockingClientHandler0.encrypt((ByteBuffer) null);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.quickserver.net.server.impl.NonBlockingClientHandler", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      BlockingClientHandler blockingClientHandler0 = new BlockingClientHandler();
      blockingClientHandler0.getSocket();
      theClient0.setSocket((Socket) null);
      theClient0.toString();
      System.setCurrentTimeMillis(120000L);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getSocket();
      theClient0.setMaxAuthTry(0);
      theClient0.setSocket((Socket) null);
      theClient0.setClientObjectHandler((ClientObjectHandler) null);
      ClientEvent clientEvent0 = ClientEvent.MAX_CON;
      theClient0.setClientEvent(clientEvent0);
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
      assertEquals(0, theClient0.getMaxAuthTry());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setMaxConnectionMsg((String) null);
      TheClient theClient1 = new TheClient();
      assertFalse(theClient1.getTrusted());
      
      theClient1.setTrusted(true);
      assertTrue(theClient1.getTrusted());
  }
}