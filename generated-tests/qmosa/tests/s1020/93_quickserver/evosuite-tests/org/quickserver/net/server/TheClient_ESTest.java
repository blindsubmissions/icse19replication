/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 15:02:14 GMT 2018
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
import org.quickserver.net.server.ClientObjectHandler;
import org.quickserver.net.server.ClientWriteHandler;
import org.quickserver.net.server.QuickServer;
import org.quickserver.net.server.TheClient;
import org.quickserver.net.server.impl.BlockingClientHandler;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TheClient_ESTest extends TheClient_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setAuthenticator((Authenticator) null);
      org.quickserver.net.qsadmin.Authenticator authenticator0 = new org.quickserver.net.qsadmin.Authenticator();
      theClient0.setClientAuthenticationHandler(authenticator0);
      theClient0.setTrusted(false);
      theClient0.setTimeoutMsg(" hY");
      theClient0.getClientCommandHandler();
      theClient0.getClientExtendedEventHandler();
      theClient0.setClientExtendedEventHandler((ClientExtendedEventHandler) null);
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.70805020110221
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setMaxConnectionMsg("FjzHBBfCqSWS");
      theClient0.getClientCommandHandler();
      theClient0.getClientEventHandler();
      theClient0.setClientEventHandler((ClientEventHandler) null);
      theClient0.setClientCommandHandler((ClientCommandHandler) null);
      Data data0 = new Data();
      theClient0.setClientData(data0);
      theClient0.setTrusted(false);
      assertTrue(theClient0.getCommunicationLogging());
      
      theClient0.setCommunicationLogging(false);
      theClient0.getClientBinaryHandler();
      theClient0.setClientBinaryHandler((ClientBinaryHandler) null);
      theClient0.getMaxConnectionMsg();
      theClient0.getClientWriteHandler();
      theClient0.getCommunicationLogging();
      theClient0.getClientAuthenticationHandler();
      assertFalse(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      TheClient theClient1 = new TheClient();
      theClient1.getAuthenticator();
      theClient0.setAuthenticator((Authenticator) null);
      theClient0.setTrusted(false);
      theClient0.setClientObjectHandler((ClientObjectHandler) null);
      theClient0.getClientExtendedEventHandler();
      theClient0.setClientExtendedEventHandler((ClientExtendedEventHandler) null);
      int int0 = theClient0.getTimeout();
      assertEquals(0, int0);
      
      theClient0.getClientEvent();
      CommandHandler commandHandler0 = new CommandHandler();
      theClient0.setClientEventHandler(commandHandler0);
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
      theClient0.setMaxAuthTry(1280);
      theClient0.setTimeout(1280);
      theClient0.getClientData();
      MockSocket mockSocket0 = null;
      try {
        mockSocket0 = new MockSocket((InetAddress) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockSocket", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getMaxConnectionMsg();
      theClient0.getMaxConnectionMsg();
      theClient0.getClientWriteHandler();
      theClient0.setClientWriteHandler((ClientWriteHandler) null);
      theClient0.getClientObjectHandler();
      theClient0.setClientObjectHandler((ClientObjectHandler) null);
      theClient0.setClientCommandHandler((ClientCommandHandler) null);
      int int0 = theClient0.getTimeout();
      assertEquals(0, int0);
      
      String string0 = theClient0.toString();
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", string0);
      
      theClient0.getClientExtendedEventHandler();
      theClient0.setClientExtendedEventHandler((ClientExtendedEventHandler) null);
      theClient0.setClientObjectHandler((ClientObjectHandler) null);
      TheClient theClient1 = new TheClient();
      theClient1.getClientData();
      theClient0.setClientData((ClientData) null);
      theClient1.getClientCommandHandler();
      assertFalse(theClient1.getTrusted());
      assertTrue(theClient1.getCommunicationLogging());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      ClientEvent clientEvent0 = ClientEvent.WRITE;
      theClient0.setClientEvent(clientEvent0);
      theClient0.getClientData();
      BlockingClientHandler blockingClientHandler0 = new BlockingClientHandler();
      blockingClientHandler0.setMaxConnectionMsg("UQAapWhkBACE,mH5<6");
      CommandHandler commandHandler0 = new CommandHandler();
      theClient0.setClientEventHandler(commandHandler0);
      // Undeclared exception!
      try { 
        blockingClientHandler0.sendClientBinary((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.quickserver.net.server.impl.BasicClientHandler", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=3.0910424533583143
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientWriteHandler();
      theClient0.setClientWriteHandler((ClientWriteHandler) null);
      theClient0.getClientCommandHandler();
      theClient0.setClientCommandHandler((ClientCommandHandler) null);
      theClient0.setTimeoutMsg("{TheClient ");
      theClient0.setTimeout((-2375));
      theClient0.getMaxAuthTryMsg();
      theClient0.getClientEvent();
      theClient0.setTrusted(true);
      theClient0.getClientAuthenticationHandler();
      theClient0.getClientEventHandler();
      theClient0.getAuthenticator();
      theClient0.setAuthenticator((Authenticator) null);
      theClient0.getMaxConnectionMsg();
      theClient0.setClientCommandHandler((ClientCommandHandler) null);
      theClient0.getClientObjectHandler();
      theClient0.getSocket();
      theClient0.getClientEventHandler();
      theClient0.getClientAuthenticationHandler();
      theClient0.getClientBinaryHandler();
      theClient0.setClientBinaryHandler((ClientBinaryHandler) null);
      theClient0.getClientBinaryHandler();
      theClient0.getSocket();
      theClient0.getClientExtendedEventHandler();
      theClient0.getMaxAuthTry();
      theClient0.setMaxAuthTryMsg("{TheClient ");
      assertEquals((-2375), theClient0.getTimeout());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      org.quickserver.net.qsadmin.Authenticator authenticator0 = new org.quickserver.net.qsadmin.Authenticator();
      String string0 = theClient0.toString();
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", string0);
      
      theClient0.setClientAuthenticationHandler(authenticator0);
      theClient0.setServer((QuickServer) null);
      int int0 = theClient0.getMaxAuthTry();
      assertEquals(0, int0);
      
      ClientEvent clientEvent0 = theClient0.getClientEvent();
      theClient0.setClientEvent(clientEvent0);
      theClient0.getClientObjectHandler();
      theClient0.getClientCommandHandler();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      String string0 = theClient0.toString();
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", string0);
      
      theClient0.getSocket();
      theClient0.setSocket((Socket) null);
      theClient0.getClientEventHandler();
      theClient0.getClientObjectHandler();
      theClient0.setClientObjectHandler((ClientObjectHandler) null);
      theClient0.getClientData();
      theClient0.getTimeoutMsg();
      theClient0.getMaxConnectionMsg();
      theClient0.getClientAuthenticationHandler();
      theClient0.setMaxConnectionMsg((String) null);
      theClient0.getTrusted();
      theClient0.setMaxAuthTryMsg(", Event: ");
      theClient0.getClientCommandHandler();
      theClient0.getTimeout();
      theClient0.getAuthenticator();
      theClient0.setClientObjectHandler((ClientObjectHandler) null);
      theClient0.getClientObjectHandler();
      theClient0.setClientAuthenticationHandler((ClientAuthenticationHandler) null);
      theClient0.setTrusted(false);
      theClient0.setClientAuthenticationHandler((ClientAuthenticationHandler) null);
      int int0 = theClient0.getTimeout();
      assertEquals(0, int0);
      
      MockSocket mockSocket0 = new MockSocket();
      theClient0.setSocket(mockSocket0);
      theClient0.setClientEvent((ClientEvent) null);
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      SocketChannel socketChannel0 = SocketChannel.open();
      theClient0.setSocketChannel(socketChannel0);
      theClient0.getAuthenticator();
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.9264175554979963
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      String string0 = theClient0.toString();
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", string0);
      
      theClient0.getSocket();
      theClient0.setSocket((Socket) null);
      theClient0.getClientEventHandler();
      theClient0.getClientObjectHandler();
      theClient0.setClientObjectHandler((ClientObjectHandler) null);
      theClient0.getClientData();
      theClient0.getTimeoutMsg();
      theClient0.getMaxConnectionMsg();
      theClient0.getClientAuthenticationHandler();
      theClient0.setMaxConnectionMsg((String) null);
      theClient0.getTrusted();
      theClient0.setMaxAuthTryMsg(", Event: ");
      theClient0.getClientCommandHandler();
      theClient0.getTimeout();
      theClient0.getAuthenticator();
      theClient0.setClientObjectHandler((ClientObjectHandler) null);
      theClient0.getClientObjectHandler();
      theClient0.setClientAuthenticationHandler((ClientAuthenticationHandler) null);
      theClient0.setTrusted(false);
      theClient0.setClientAuthenticationHandler((ClientAuthenticationHandler) null);
      int int0 = theClient0.getTimeout();
      assertEquals(0, int0);
      
      MockSocket mockSocket0 = new MockSocket();
      theClient0.setSocket(mockSocket0);
      theClient0.setClientAuthenticationHandler((ClientAuthenticationHandler) null);
      theClient0.toString();
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.toString();
      theClient0.setTrusted(false);
      theClient0.getClientObjectHandler();
      theClient0.getClientExtendedEventHandler();
      theClient0.setClientExtendedEventHandler((ClientExtendedEventHandler) null);
      theClient0.setTimeout(1439);
      theClient0.getClientObjectHandler();
      theClient0.setTrusted(false);
      theClient0.setTimeout(32);
      theClient0.getAuthenticator();
      theClient0.getClientObjectHandler();
      theClient0.getTimeout();
      theClient0.getTrusted();
      theClient0.getServer();
      assertEquals(32, theClient0.getTimeout());
  }
}
