/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 17:35:47 GMT 2018
 */

package org.quickserver.net.server;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.channels.SocketChannel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.evosuite.runtime.mock.java.net.MockInetSocketAddress;
import org.junit.runner.RunWith;
import org.quickserver.net.qsadmin.CommandHandler;
import org.quickserver.net.server.Authenticator;
import org.quickserver.net.server.ClientAuthenticationHandler;
import org.quickserver.net.server.ClientBinaryHandler;
import org.quickserver.net.server.ClientCommandHandler;
import org.quickserver.net.server.ClientData;
import org.quickserver.net.server.ClientEvent;
import org.quickserver.net.server.ClientEventHandler;
import org.quickserver.net.server.ClientExtendedEventHandler;
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
  /*Coverage entropy=2.833213344056216
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setMaxAuthTry(0);
      theClient0.setMaxAuthTry(0);
      theClient0.setCommunicationLogging(true);
      theClient0.setTimeoutMsg((String) null);
      theClient0.setTimeoutMsg("");
      theClient0.setMaxAuthTryMsg("");
      theClient0.setMaxAuthTry(0);
      theClient0.setTimeoutMsg("");
      theClient0.getClientData();
      theClient0.getTimeout();
      theClient0.getMaxConnectionMsg();
      theClient0.getClientWriteHandler();
      theClient0.setClientWriteHandler((ClientWriteHandler) null);
      assertFalse(theClient0.getTrusted());
      
      theClient0.setTrusted(true);
      theClient0.setAuthenticator((Authenticator) null);
      theClient0.getClientAuthenticationHandler();
      theClient0.setClientAuthenticationHandler((ClientAuthenticationHandler) null);
      theClient0.getTimeout();
      theClient0.getClientCommandHandler();
      theClient0.getClientExtendedEventHandler();
      theClient0.setClientWriteHandler((ClientWriteHandler) null);
      theClient0.getClientObjectHandler();
      theClient0.setAuthenticator((Authenticator) null);
      assertTrue(theClient0.getTrusted());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      ClientEvent clientEvent0 = ClientEvent.ACCEPT;
      theClient0.setClientEvent(clientEvent0);
      theClient0.getAuthenticator();
      theClient0.setAuthenticator((Authenticator) null);
      theClient0.getSocketChannel();
      theClient0.getClientEventHandler();
      theClient0.getClientAuthenticationHandler();
      theClient0.getMaxAuthTryMsg();
      theClient0.getSocketChannel();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setTrusted(true);
      theClient0.getAuthenticator();
      theClient0.setAuthenticator((Authenticator) null);
      theClient0.setTrusted(true);
      theClient0.getTimeoutMsg();
      theClient0.getSocket();
      theClient0.getClientData();
      theClient0.setClientData((ClientData) null);
      theClient0.getMaxAuthTry();
      DefaultClientEventHandler defaultClientEventHandler0 = new DefaultClientEventHandler();
      NonBlockingClientHandler nonBlockingClientHandler0 = new NonBlockingClientHandler(0);
      // Undeclared exception!
      try { 
        defaultClientEventHandler0.gotConnected(nonBlockingClientHandler0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.quickserver.net.server.impl.BasicClientHandler", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getAuthenticator();
      theClient0.setAuthenticator((Authenticator) null);
      TheClient theClient1 = new TheClient();
      theClient1.getClientExtendedEventHandler();
      theClient0.setClientExtendedEventHandler((ClientExtendedEventHandler) null);
      theClient1.setMaxAuthTryMsg("{TheClient ");
      theClient1.getClientWriteHandler();
      theClient0.setClientWriteHandler((ClientWriteHandler) null);
      theClient0.getClientBinaryHandler();
      theClient1.setClientBinaryHandler((ClientBinaryHandler) null);
      theClient1.setCommunicationLogging(false);
      DefaultClientEventHandler defaultClientEventHandler0 = new DefaultClientEventHandler();
      theClient0.setClientEventHandler(defaultClientEventHandler0);
      theClient0.getClientExtendedEventHandler();
      theClient0.setClientExtendedEventHandler((ClientExtendedEventHandler) null);
      assertTrue(theClient0.getCommunicationLogging());
      
      int int0 = theClient1.getMaxAuthTry();
      assertFalse(theClient1.getCommunicationLogging());
      assertEquals(0, int0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientAuthenticationHandler();
      theClient0.setClientAuthenticationHandler((ClientAuthenticationHandler) null);
      theClient0.setTimeout(0);
      theClient0.getClientEventHandler();
      theClient0.setClientEventHandler((ClientEventHandler) null);
      theClient0.getClientCommandHandler();
      theClient0.setClientCommandHandler((ClientCommandHandler) null);
      theClient0.getClientExtendedEventHandler();
      theClient0.setClientExtendedEventHandler((ClientExtendedEventHandler) null);
      theClient0.getServer();
      theClient0.getClientWriteHandler();
      theClient0.toString();
      theClient0.getClientBinaryHandler();
      theClient0.getClientEventHandler();
      theClient0.setClientEventHandler((ClientEventHandler) null);
      theClient0.getAuthenticator();
      theClient0.setClientEvent((ClientEvent) null);
      theClient0.getClientWriteHandler();
      theClient0.getClientExtendedEventHandler();
      BlockingClientHandler blockingClientHandler0 = new BlockingClientHandler();
      blockingClientHandler0.getSocket();
      assertEquals("<ClientHandler-Pool#-1-ID:1>", blockingClientHandler0.getName());
      
      theClient0.setSocket((Socket) null);
      theClient0.setMaxConnectionMsg("Error closing client: ");
      theClient0.getClientEventHandler();
      theClient0.getMaxConnectionMsg();
      theClient0.setCommunicationLogging(true);
      boolean boolean0 = theClient0.getTrusted();
      assertFalse(boolean0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setMaxAuthTry(60000);
      theClient0.getClientEventHandler();
      theClient0.setClientEventHandler((ClientEventHandler) null);
      theClient0.getMaxAuthTry();
      BlockingClientHandler blockingClientHandler0 = new BlockingClientHandler();
      blockingClientHandler0.getClientData();
      theClient0.setClientData((ClientData) null);
      QuickServer quickServer0 = new QuickServer(" YSRf7;0G:");
      theClient0.setServer(quickServer0);
      theClient0.toString();
      assertEquals(60000, theClient0.getMaxAuthTry());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setSocketChannel((SocketChannel) null);
      theClient0.setMaxConnectionMsg("2j:v$$q0y??H6\"&$");
      theClient0.setMaxConnectionMsg("");
      theClient0.setMaxConnectionMsg("");
      theClient0.setTimeoutMsg((String) null);
      theClient0.getMaxAuthTryMsg();
      theClient0.setTimeout(520);
      theClient0.setMaxConnectionMsg("");
      theClient0.getTimeout();
      theClient0.getClientData();
      assertEquals(520, theClient0.getTimeout());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientAuthenticationHandler();
      theClient0.getClientWriteHandler();
      theClient0.setClientWriteHandler((ClientWriteHandler) null);
      theClient0.toString();
      CommandHandler commandHandler0 = new CommandHandler();
      theClient0.setClientCommandHandler(commandHandler0);
      theClient0.setClientAuthenticationHandler((ClientAuthenticationHandler) null);
      theClient0.getAuthenticator();
      theClient0.getTrusted();
      theClient0.toString();
      ClientEvent clientEvent0 = theClient0.getClientEvent();
      theClient0.setClientEvent(clientEvent0);
      theClient0.getMaxAuthTry();
      theClient0.getClientEventHandler();
      theClient0.getCommunicationLogging();
      theClient0.toString();
      theClient0.setMaxAuthTry(0);
      theClient0.getClientExtendedEventHandler();
      theClient0.setClientExtendedEventHandler((ClientExtendedEventHandler) null);
      theClient0.getClientData();
      theClient0.setClientData((ClientData) null);
      theClient0.setClientCommandHandler(commandHandler0);
      theClient0.setCommunicationLogging(true);
      theClient0.getTimeoutMsg();
      BlockingClientHandler blockingClientHandler0 = new BlockingClientHandler();
      // Undeclared exception!
      try { 
        blockingClientHandler0.getSocketChannel();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Can't get in blocking mode!
         //
         verifyException("org.quickserver.net.server.impl.BlockingClientHandler", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.70805020110221
  */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.toString();
      theClient0.setTimeout(5);
      theClient0.setClientBinaryHandler((ClientBinaryHandler) null);
      theClient0.getClientObjectHandler();
      theClient0.getClientCommandHandler();
      theClient0.setClientCommandHandler((ClientCommandHandler) null);
      theClient0.setClientObjectHandler((ClientObjectHandler) null);
      theClient0.getClientEventHandler();
      theClient0.setMaxConnectionMsg("{TheClient no socket, Event: (ClientEvent-Run Blocking)}");
      theClient0.getClientExtendedEventHandler();
      theClient0.setClientExtendedEventHandler((ClientExtendedEventHandler) null);
      theClient0.getMaxConnectionMsg();
      theClient0.getClientEvent();
      SocketChannel socketChannel0 = SocketChannel.open();
      theClient0.setSocketChannel(socketChannel0);
      theClient0.toString();
      try { 
        QuickServer.load("*qRx%m8");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Could not init server from xml file
         //
         verifyException("org.quickserver.net.server.QuickServer", e);
      }
  }
}
