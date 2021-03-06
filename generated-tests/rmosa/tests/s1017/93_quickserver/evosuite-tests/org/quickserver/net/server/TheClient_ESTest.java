/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 12:56:48 GMT 2018
 */

package org.quickserver.net.server;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketOption;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.evosuite.runtime.mock.java.net.MockSocket;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteLocalAddress;
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
import org.quickserver.net.server.ClientExtendedEventHandler;
import org.quickserver.net.server.ClientObjectHandler;
import org.quickserver.net.server.ClientWriteHandler;
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
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      ClientEvent clientEvent0 = ClientEvent.CLOSE_CON;
      theClient0.setClientEvent(clientEvent0);
      theClient0.getClientEventHandler();
      BlockingClientHandler blockingClientHandler0 = new BlockingClientHandler();
      int int0 = (-921);
      MockSocket mockSocket0 = null;
      try {
        mockSocket0 = new MockSocket("SwyFsGQh", (-921), false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // port out of range:-921
         //
         verifyException("java.net.InetSocketAddress", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      ClientBinaryHandler clientBinaryHandler0 = null;
      theClient0.setClientBinaryHandler((ClientBinaryHandler) null);
      CommandHandler commandHandler0 = new CommandHandler();
      NonBlockingClientHandler nonBlockingClientHandler0 = new NonBlockingClientHandler();
      boolean boolean0 = false;
      ClientEvent clientEvent0 = ClientEvent.MAX_CON_BLOCKING;
      ClientEvent clientEvent1 = ClientEvent.MAX_CON;
      nonBlockingClientHandler0.removeEvent(clientEvent1);
      nonBlockingClientHandler0.isClientEventNext(clientEvent0);
      theClient0.setClientAuthenticationHandler((ClientAuthenticationHandler) null);
      try { 
        commandHandler0.handleCommand(nonBlockingClientHandler0, "");
        fail("Expecting exception: SocketException");
      
      } catch(SocketException e) {
         //
         // Connection is no more open!
         //
         verifyException("org.quickserver.net.server.impl.BasicClientHandler", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      DefaultClientEventHandler defaultClientEventHandler0 = new DefaultClientEventHandler();
      theClient0.setClientEventHandler(defaultClientEventHandler0);
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      ClientEvent clientEvent0 = theClient0.getClientEvent();
      theClient0.setClientEvent(clientEvent0);
      boolean boolean0 = true;
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
  //Test case number: 4
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setCommunicationLogging(true);
      theClient0.getClientAuthenticationHandler();
      theClient0.setClientAuthenticationHandler((ClientAuthenticationHandler) null);
      NonBlockingClientHandler nonBlockingClientHandler0 = new NonBlockingClientHandler();
      assertEquals("<ClientHandler-Pool#-1-ID:10>", nonBlockingClientHandler0.getName());
      
      theClient0.getAuthenticator();
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.toString();
      theClient0.getClientWriteHandler();
      theClient0.setClientWriteHandler((ClientWriteHandler) null);
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)125;
      try { 
        MockInetAddress.getByAddress("", byteArray0);
        fail("Expecting exception: UnknownHostException");
      
      } catch(UnknownHostException e) {
         //
         // Not IPv4: [125]
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockInetAddress", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      FileSystemHandling.shouldAllThrowIOExceptions();
      theClient0.getClientData();
      System.setCurrentTimeMillis((-6145L));
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getMaxAuthTryMsg();
      theClient0.getClientWriteHandler();
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
      theClient0.getTrusted();
      theClient0.setMaxAuthTry(0);
      theClient0.setMaxAuthTry(125);
      Data data0 = new Data();
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-1);
      byteArray0[2] = (byte) (-1);
      byteArray0[3] = (byte)46;
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte) (-4);
      data0.setPassword(byteArray0);
      byte[] byteArray1 = new byte[5];
      byteArray1[0] = (byte) (-109);
      byteArray1[1] = (byte)94;
      byteArray1[2] = (byte)0;
      byteArray1[3] = (byte) (-58);
      byteArray1[4] = (byte)0;
      data0.setPassword(byteArray1);
      theClient0.setClientData(data0);
      theClient0.getSocket();
      assertEquals(125, theClient0.getMaxAuthTry());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setMaxAuthTry((-2200));
      NetworkHandling.sendMessageOnTcp((EvoSuiteLocalAddress) null, "Started {0}, Date: {1}");
      TheClient theClient1 = new TheClient();
      theClient0.getTimeoutMsg();
      assertEquals((-2200), theClient0.getMaxAuthTry());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientCommandHandler();
      theClient0.setClientCommandHandler((ClientCommandHandler) null);
      String string0 = theClient0.toString();
      assertFalse(theClient0.getTrusted());
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", string0);
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientObjectHandler();
      theClient0.setTrusted(false);
      QuickServer quickServer0 = new QuickServer();
      InetAddress inetAddress0 = quickServer0.getBindAddr();
      MockSocket mockSocket0 = null;
      try {
        mockSocket0 = new MockSocket("", 58, inetAddress0, 0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Remote address/port is not opened: org.evosuite.runtime.vnet.EndPointInfo@2e4603b9
         //
         verifyException("org.evosuite.runtime.vnet.VirtualNetwork", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.toString();
      DefaultClientEventHandler defaultClientEventHandler0 = new DefaultClientEventHandler();
      QuickServer quickServer0 = new QuickServer();
      theClient0.toString();
      org.quickserver.net.qsadmin.Authenticator authenticator0 = new org.quickserver.net.qsadmin.Authenticator();
      theClient0.setClientAuthenticationHandler(authenticator0);
      System.setCurrentTimeMillis((-885L));
      String string0 = theClient0.toString();
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", string0);
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
      BlockingClientHandler blockingClientHandler0 = new BlockingClientHandler();
      blockingClientHandler0.getClientData();
      assertEquals("<ClientHandler-Pool#-1-ID:16>", blockingClientHandler0.getName());
      
      theClient0.setClientData((ClientData) null);
      theClient0.setClientData((ClientData) null);
      theClient0.getClientObjectHandler();
      theClient0.getClientAuthenticationHandler();
      ClientEvent clientEvent0 = ClientEvent.ACCEPT;
      theClient0.setClientEvent(clientEvent0);
      theClient0.setCommunicationLogging(false);
      theClient0.getCommunicationLogging();
      theClient0.getTimeoutMsg();
      Data data0 = new Data();
      theClient0.setClientData(data0);
      QuickServer quickServer0 = new QuickServer();
      theClient0.setServer(quickServer0);
      theClient0.setCommunicationLogging(false);
      assertFalse(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      System.setCurrentTimeMillis(0L);
      FileSystemHandling.shouldAllThrowIOExceptions();
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-103);
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte) (-78);
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      TheClient theClient0 = new TheClient();
      theClient0.toString();
      theClient0.toString();
      theClient0.getAuthenticator();
      theClient0.setAuthenticator((Authenticator) null);
      theClient0.toString();
      System.setCurrentTimeMillis(0L);
      theClient0.toString();
      System.setCurrentTimeMillis(0L);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setMaxAuthTryMsg("5B+YZ4o_`ee/_Fp");
      theClient0.toString();
      System.setCurrentTimeMillis(1020L);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientExtendedEventHandler();
      int int0 = 0;
      theClient0.setTimeout(0);
      String string0 = "";
      QuickServer quickServer0 = new QuickServer("", 16);
      // Undeclared exception!
      try { 
        quickServer0.getSSLContext("");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Secure setting is not yet enabled for loading!
         //
         verifyException("org.quickserver.net.server.QuickServer", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientExtendedEventHandler();
      theClient0.setClientExtendedEventHandler((ClientExtendedEventHandler) null);
      theClient0.toString();
      theClient0.toString();
      System.setCurrentTimeMillis((-2013L));
      String string0 = theClient0.toString();
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", string0);
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      Data data0 = new Data();
      theClient0.setClientData(data0);
      int int0 = theClient0.getMaxAuthTry();
      assertEquals(0, int0);
      
      ClientEvent clientEvent0 = ClientEvent.WRITE;
      theClient0.setClientEvent(clientEvent0);
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientObjectHandler();
      theClient0.setClientObjectHandler((ClientObjectHandler) null);
      String string0 = theClient0.toString();
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", string0);
      
      QuickServer quickServer0 = new QuickServer("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", 0);
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      quickServer0.setClassLoader(classLoader0);
      theClient0.setServer((QuickServer) null);
      int int0 = theClient0.getTimeout();
      assertEquals(0, int0);
      
      TheClient theClient1 = new TheClient();
      assertFalse(theClient1.getTrusted());
      assertTrue(theClient1.getCommunicationLogging());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      String string0 = "canp|";
      theClient0.setTimeoutMsg("canp|");
      try { 
        MockInetAddress.getByAddress("canp|", (byte[]) null);
        fail("Expecting exception: UnknownHostException");
      
      } catch(UnknownHostException e) {
         //
         // Not IPv4: null
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockInetAddress", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.toString();
      NonBlockingClientHandler nonBlockingClientHandler0 = new NonBlockingClientHandler(0);
      nonBlockingClientHandler0.getSocketChannel();
      assertEquals("<ClientHandler-Pool#0-ID:1>", nonBlockingClientHandler0.getName());
      
      theClient0.setSocketChannel((SocketChannel) null);
      TheClient theClient1 = new TheClient();
      String string0 = theClient1.toString();
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", string0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getMaxConnectionMsg();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientBinaryHandler();
      theClient0.setClientBinaryHandler((ClientBinaryHandler) null);
      theClient0.toString();
      MockSocket mockSocket0 = new MockSocket();
      mockSocket0.getInetAddress();
      theClient0.setCommunicationLogging(false);
      theClient0.setSocket(mockSocket0);
      theClient0.getServer();
      theClient0.setMaxConnectionMsg((String) null);
      Data data0 = new Data();
      theClient0.setClientData(data0);
      theClient0.setClientData(data0);
      theClient0.setMaxConnectionMsg("{TheClient no socket, Event: (ClientEvent-Run Blocking)}");
      theClient0.setClientBinaryHandler((ClientBinaryHandler) null);
      theClient0.setSocket(mockSocket0);
      theClient0.setClientData(data0);
      theClient0.setMaxAuthTry(1);
      System.setCurrentTimeMillis((-2284L));
      theClient0.toString();
      assertEquals(1, theClient0.getMaxAuthTry());
  }
}
