/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 15:24:17 GMT 2018
 */

package org.quickserver.net.server;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.Socket;
import java.net.SocketOption;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.net.MockSocket;
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
  /*Coverage entropy=2.70805020110221
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      ClientEvent clientEvent0 = ClientEvent.READ;
      theClient0.setClientEvent(clientEvent0);
      theClient0.setMaxConnectionMsg("");
      ClientEvent clientEvent1 = ClientEvent.LOST_CON;
      theClient0.setClientEvent(clientEvent1);
      theClient0.getTimeout();
      theClient0.getAuthenticator();
      DefaultClientEventHandler defaultClientEventHandler0 = new DefaultClientEventHandler();
      theClient0.setClientEventHandler(defaultClientEventHandler0);
      theClient0.setMaxAuthTryMsg("");
      theClient0.setClientEvent(clientEvent0);
      theClient0.getClientBinaryHandler();
      theClient0.setClientBinaryHandler((ClientBinaryHandler) null);
      theClient0.getClientWriteHandler();
      TheClient theClient1 = new TheClient();
      theClient1.getClientObjectHandler();
      theClient1.setMaxAuthTryMsg("");
      theClient0.setClientObjectHandler((ClientObjectHandler) null);
      theClient0.setClientCommandHandler((ClientCommandHandler) null);
      theClient1.getAuthenticator();
      theClient0.setTimeout(0);
      theClient0.getTimeoutMsg();
      theClient0.getClientObjectHandler();
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
      assertEquals(0, theClient0.getTimeout());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getMaxAuthTryMsg();
      TheClient theClient1 = new TheClient();
      theClient1.getAuthenticator();
      theClient0.setAuthenticator((Authenticator) null);
      theClient1.getClientCommandHandler();
      theClient1.setClientCommandHandler((ClientCommandHandler) null);
      theClient0.getClientObjectHandler();
      theClient0.setClientObjectHandler((ClientObjectHandler) null);
      QuickServer quickServer0 = new QuickServer();
      theClient0.setServer(quickServer0);
      quickServer0.getQSAdminServerPort();
      theClient0.getMaxAuthTryMsg();
      theClient0.setServer(quickServer0);
      theClient1.getClientBinaryHandler();
      theClient1.setClientBinaryHandler((ClientBinaryHandler) null);
      theClient0.getAuthenticator();
      ClientEvent clientEvent0 = theClient1.getClientEvent();
      theClient1.setTimeout(0);
      theClient1.getTimeoutMsg();
      boolean boolean0 = theClient0.getCommunicationLogging();
      assertTrue(boolean0);
      
      theClient1.setCommunicationLogging(false);
      theClient0.getSocketChannel();
      theClient0.setAuthenticator((Authenticator) null);
      theClient0.setClientEvent(clientEvent0);
      assertFalse(theClient1.getCommunicationLogging());
      
      theClient0.getClientEvent();
      DefaultClientEventHandler defaultClientEventHandler0 = new DefaultClientEventHandler();
      theClient0.setClientEventHandler(defaultClientEventHandler0);
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setClientAuthenticationHandler((ClientAuthenticationHandler) null);
      theClient0.getClientWriteHandler();
      theClient0.setClientWriteHandler((ClientWriteHandler) null);
      org.quickserver.net.qsadmin.Authenticator authenticator0 = new org.quickserver.net.qsadmin.Authenticator();
      NonBlockingClientHandler nonBlockingClientHandler0 = new NonBlockingClientHandler();
      NonBlockingClientHandler nonBlockingClientHandler1 = new NonBlockingClientHandler(0);
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)93;
      byteArray0[1] = (byte) (-95);
      byteArray0[2] = (byte)80;
      byteArray0[3] = (byte) (-5);
      byteArray0[4] = (byte)54;
      byteArray0[5] = (byte) (-52);
      byteArray0[6] = (byte)25;
      // Undeclared exception!
      try { 
        authenticator0.handleAuthentication((ClientHandler) nonBlockingClientHandler1, byteArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // String/Byte mode not implemented!
         //
         verifyException("org.quickserver.net.server.QuickAuthenticationHandler", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientObjectHandler();
      theClient0.setClientObjectHandler((ClientObjectHandler) null);
      theClient0.setClientObjectHandler((ClientObjectHandler) null);
      theClient0.setTimeoutMsg("Wz#hI:'g`J{u%721M");
      theClient0.getTimeoutMsg();
      theClient0.getClientData();
      theClient0.setClientData((ClientData) null);
      theClient0.getClientExtendedEventHandler();
      theClient0.setClientExtendedEventHandler((ClientExtendedEventHandler) null);
      theClient0.getClientObjectHandler();
      QuickServer quickServer0 = null;
      try {
        quickServer0 = new QuickServer("Wz#hI:'g`J{u%721M", (-636));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Port number can not be less than 0!
         //
         verifyException("org.quickserver.net.server.QuickServer", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      TheClient theClient1 = new TheClient();
      theClient1.getAuthenticator();
      theClient0.setAuthenticator((Authenticator) null);
      theClient0.getMaxAuthTry();
      theClient0.getAuthenticator();
      theClient0.setAuthenticator((Authenticator) null);
      BlockingClientHandler blockingClientHandler0 = new BlockingClientHandler();
      blockingClientHandler0.clean();
      blockingClientHandler0.getClientData();
      theClient1.setClientData((ClientData) null);
      theClient1.getClientCommandHandler();
      org.quickserver.net.qsadmin.Authenticator authenticator0 = new org.quickserver.net.qsadmin.Authenticator();
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-52);
      byteArray0[2] = (byte) (-52);
      byteArray0[3] = (byte) (-1);
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
  //Test case number: 5
  /*Coverage entropy=2.890371757896165
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientWriteHandler();
      theClient0.setClientWriteHandler((ClientWriteHandler) null);
      theClient0.getClientExtendedEventHandler();
      theClient0.setClientExtendedEventHandler((ClientExtendedEventHandler) null);
      theClient0.setMaxAuthTry(1665);
      theClient0.getClientAuthenticationHandler();
      theClient0.getClientEventHandler();
      theClient0.getClientEvent();
      theClient0.getServer();
      theClient0.setMaxConnectionMsg((String) null);
      theClient0.getClientAuthenticationHandler();
      theClient0.getClientEventHandler();
      theClient0.getServer();
      theClient0.setClientExtendedEventHandler((ClientExtendedEventHandler) null);
      theClient0.getMaxAuthTry();
      theClient0.getClientObjectHandler();
      theClient0.setClientObjectHandler((ClientObjectHandler) null);
      theClient0.setClientEventHandler((ClientEventHandler) null);
      theClient0.getTrusted();
      theClient0.getClientWriteHandler();
      theClient0.getClientExtendedEventHandler();
      theClient0.setClientExtendedEventHandler((ClientExtendedEventHandler) null);
      theClient0.getClientCommandHandler();
      theClient0.setTimeoutMsg((String) null);
      theClient0.setTimeoutMsg("");
      assertEquals(1665, theClient0.getMaxAuthTry());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientExtendedEventHandler();
      theClient0.setClientExtendedEventHandler((ClientExtendedEventHandler) null);
      theClient0.setCommunicationLogging(true);
      String string0 = theClient0.toString();
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", string0);
      
      theClient0.getClientData();
      theClient0.getMaxConnectionMsg();
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.70805020110221
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientEventHandler();
      theClient0.getAuthenticator();
      theClient0.setAuthenticator((Authenticator) null);
      theClient0.setClientEventHandler((ClientEventHandler) null);
      theClient0.toString();
      theClient0.getClientObjectHandler();
      theClient0.setClientObjectHandler((ClientObjectHandler) null);
      String string0 = theClient0.toString();
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", string0);
      
      CommandHandler commandHandler0 = new CommandHandler();
      theClient0.setClientCommandHandler(commandHandler0);
      theClient0.setMaxAuthTryMsg("F^33");
      theClient0.setClientEvent((ClientEvent) null);
      theClient0.getSocketChannel();
      theClient0.getClientCommandHandler();
      theClient0.setAuthenticator((Authenticator) null);
      theClient0.setSocketChannel((SocketChannel) null);
      boolean boolean0 = theClient0.getCommunicationLogging();
      assertFalse(theClient0.getTrusted());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setTrusted(false);
      String string0 = "/n5!=tYG{&5,OZh";
      theClient0.getAuthenticator();
      theClient0.setAuthenticator((Authenticator) null);
      theClient0.setMaxAuthTry(0);
      theClient0.setTimeout(0);
      theClient0.setMaxAuthTryMsg("/n5!=tYG{&5,OZh");
      theClient0.setTrusted(true);
      theClient0.setMaxAuthTry(192);
      theClient0.getClientWriteHandler();
      theClient0.setClientWriteHandler((ClientWriteHandler) null);
      theClient0.setTimeoutMsg("/n5!=tYG{&5,OZh");
      theClient0.getClientEventHandler();
      theClient0.getAuthenticator();
      org.quickserver.net.qsadmin.Authenticator authenticator0 = new org.quickserver.net.qsadmin.Authenticator();
      try { 
        QuickServer.load("/n5!=tYG{&5,OZh");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Could not init server from xml file
         //
         verifyException("org.quickserver.net.server.QuickServer", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      MockSocket mockSocket0 = new MockSocket();
      theClient0.setTrusted(false);
      theClient0.setSocket(mockSocket0);
      theClient0.getTrusted();
      theClient0.getClientWriteHandler();
      org.quickserver.net.qsadmin.Authenticator authenticator0 = new org.quickserver.net.qsadmin.Authenticator();
      theClient0.setClientAuthenticationHandler(authenticator0);
      theClient0.getSocket();
      theClient0.getAuthenticator();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      MockSocket mockSocket0 = new MockSocket();
      mockSocket0.getRemoteSocketAddress();
      mockSocket0.getTcpNoDelay();
      theClient0.setSocket(mockSocket0);
      theClient0.getMaxAuthTryMsg();
      String string0 = theClient0.toString();
      assertEquals("{TheClient Socket[unconnected], Event: (ClientEvent-Run Blocking)}", string0);
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }
}