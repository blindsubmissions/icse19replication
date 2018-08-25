/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 15:08:16 GMT 2018
 */

package org.quickserver.net.server;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketOption;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.evosuite.runtime.mock.java.net.MockInetSocketAddress;
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
import org.quickserver.net.server.ClientData;
import org.quickserver.net.server.ClientEvent;
import org.quickserver.net.server.ClientExtendedEventHandler;
import org.quickserver.net.server.ClientHandler;
import org.quickserver.net.server.ClientObjectHandler;
import org.quickserver.net.server.ClientWriteHandler;
import org.quickserver.net.server.QuickServer;
import org.quickserver.net.server.TheClient;
import org.quickserver.net.server.impl.BlockingClientHandler;
import org.quickserver.net.server.impl.NonBlockingClientHandler;
import org.quickserver.util.xmlreader.DBObjectPoolConfig;
import org.quickserver.util.xmlreader.QuickServerConfig;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TheClient_ESTest extends TheClient_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setTimeout((-1355));
      theClient0.setMaxAuthTry((-1));
      Proxy proxy0 = Proxy.NO_PROXY;
      MockSocket mockSocket0 = new MockSocket(proxy0);
      theClient0.setSocket(mockSocket0);
      theClient0.toString();
      CommandHandler commandHandler0 = new CommandHandler();
      NonBlockingClientHandler nonBlockingClientHandler0 = new NonBlockingClientHandler();
      commandHandler0.closingConnection(nonBlockingClientHandler0);
      theClient0.setClientEventHandler(commandHandler0);
      theClient0.getSocketChannel();
      theClient0.getClientBinaryHandler();
      assertEquals((-1), theClient0.getMaxAuthTry());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
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
  //Test case number: 2
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      String string0 = "";
      theClient0.toString();
      theClient0.setTimeoutMsg("");
      theClient0.getClientData();
      ClientEvent clientEvent0 = ClientEvent.READ;
      theClient0.setClientEvent(clientEvent0);
      theClient0.getTimeout();
      theClient0.getClientWriteHandler();
      theClient0.setClientWriteHandler((ClientWriteHandler) null);
      theClient0.getTimeout();
      theClient0.getClientEventHandler();
      theClient0.getMaxAuthTryMsg();
      theClient0.getClientWriteHandler();
      theClient0.getClientAuthenticationHandler();
      Proxy proxy0 = Proxy.NO_PROXY;
      MockSocket mockSocket0 = new MockSocket(proxy0);
      mockSocket0.setSoLinger(false, 0);
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      MockSocket mockSocket1 = null;
      try {
        mockSocket1 = new MockSocket(inetAddress0, 0, inetAddress0, 0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Remote address/port is not opened: org.evosuite.runtime.vnet.EndPointInfo@739da7e9
         //
         verifyException("org.evosuite.runtime.vnet.VirtualNetwork", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientEventHandler();
      theClient0.getAuthenticator();
      theClient0.setAuthenticator((Authenticator) null);
      BlockingClientHandler blockingClientHandler0 = new BlockingClientHandler();
      CommandHandler commandHandler0 = new CommandHandler();
      String string0 = "0vB~V+Fpu";
      // Undeclared exception!
      try { 
        commandHandler0.handleCommand(blockingClientHandler0, "0vB~V+Fpu");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.quickserver.net.qsadmin.CommandHandler", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, (String) null);
      TheClient theClient0 = new TheClient();
      theClient0.getClientObjectHandler();
      theClient0.setClientObjectHandler((ClientObjectHandler) null);
      QuickServer quickServer0 = new QuickServer("Gd].*HaUW");
      QuickServerConfig quickServerConfig0 = new QuickServerConfig();
      quickServerConfig0.getDBObjectPoolConfig();
      quickServer0.setDBObjectPoolConfig((DBObjectPoolConfig) null);
      theClient0.setServer(quickServer0);
      theClient0.toString();
      theClient0.getClientExtendedEventHandler();
      theClient0.setClientExtendedEventHandler((ClientExtendedEventHandler) null);
      theClient0.toString();
      String string0 = theClient0.toString();
      assertFalse(theClient0.getTrusted());
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", string0);
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientData();
      String string0 = "$!Pv&";
      theClient0.setMaxConnectionMsg("$!Pv&");
      boolean boolean0 = true;
      theClient0.setTimeout(9876);
      MockSocket mockSocket0 = null;
      try {
        mockSocket0 = new MockSocket("", 9876);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Remote address/port is not opened: org.evosuite.runtime.vnet.EndPointInfo@39879278
         //
         verifyException("org.evosuite.runtime.vnet.VirtualNetwork", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientBinaryHandler();
      theClient0.setClientBinaryHandler((ClientBinaryHandler) null);
      theClient0.getClientEventHandler();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getSocket();
      CommandHandler commandHandler0 = new CommandHandler();
      theClient0.setClientCommandHandler(commandHandler0);
      theClient0.getClientWriteHandler();
      theClient0.setClientWriteHandler((ClientWriteHandler) null);
      theClient0.getAuthenticator();
      theClient0.setAuthenticator((Authenticator) null);
      theClient0.setAuthenticator((Authenticator) null);
      theClient0.getSocketChannel();
      BlockingClientHandler blockingClientHandler0 = new BlockingClientHandler(2045);
      // Undeclared exception!
      try { 
        commandHandler0.handleCommand(blockingClientHandler0, "_?");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.quickserver.net.qsadmin.CommandHandler", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientAuthenticationHandler();
      theClient0.getClientWriteHandler();
      theClient0.setClientWriteHandler((ClientWriteHandler) null);
      assertFalse(theClient0.getTrusted());
      
      theClient0.setTrusted(true);
      theClient0.setTrusted(true);
      theClient0.getMaxAuthTry();
      theClient0.setTrusted(true);
      theClient0.getClientObjectHandler();
      assertTrue(theClient0.getTrusted());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
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
  //Test case number: 10
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setServer((QuickServer) null);
      theClient0.getClientData();
      theClient0.setClientExtendedEventHandler((ClientExtendedEventHandler) null);
      CommandHandler commandHandler0 = new CommandHandler();
      NonBlockingClientHandler nonBlockingClientHandler0 = new NonBlockingClientHandler();
      commandHandler0.lostConnection(nonBlockingClientHandler0);
      String string0 = "org.quickserver.net.server.TheClient";
      // Undeclared exception!
      try { 
        commandHandler0.handleCommand(nonBlockingClientHandler0, "org.quickserver.net.server.TheClient");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.quickserver.net.qsadmin.CommandHandler", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setTimeout((-511));
      theClient0.setTimeoutMsg((String) null);
      theClient0.getClientObjectHandler();
      theClient0.getClientObjectHandler();
      theClient0.setClientObjectHandler((ClientObjectHandler) null);
      theClient0.getAuthenticator();
      theClient0.setTimeout(91);
      theClient0.getCommunicationLogging();
      theClient0.getAuthenticator();
      TheClient theClient1 = new TheClient();
      theClient1.setMaxAuthTry((-1));
      BlockingClientHandler blockingClientHandler0 = new BlockingClientHandler();
      blockingClientHandler0.getServer();
      theClient1.setServer((QuickServer) null);
      assertEquals((-1), theClient1.getMaxAuthTry());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getSocketChannel();
      int int0 = theClient0.getMaxAuthTry();
      assertFalse(theClient0.getTrusted());
      assertEquals(0, int0);
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          TheClient theClient0 = new TheClient();
          theClient0.setCommunicationLogging(true);
          theClient0.getClientWriteHandler();
          theClient0.getClientEvent();
          ClientEvent clientEvent0 = ClientEvent.ACCEPT;
          theClient0.setClientEvent(clientEvent0);
          theClient0.getClientCommandHandler();
          theClient0.getClientEventHandler();
          theClient0.getClientWriteHandler();
          theClient0.setMaxConnectionMsg("");
          MockInetSocketAddress mockInetSocketAddress0 = new MockInetSocketAddress("OFF", 0);
          // Undeclared exception!
          try { 
            SocketChannel.open((SocketAddress) mockInetSocketAddress0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.net.SocketPermission\" \"200.42.42.0:0\" \"connect,resolve\")
             // java.lang.Thread.getStackTrace(Thread.java:1559)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:434)
             // java.lang.SecurityManager.checkConnect(SecurityManager.java:1051)
             // sun.nio.ch.SocketChannelImpl.connect(SocketChannelImpl.java:625)
             // java.nio.channels.SocketChannel.open(SocketChannel.java:189)
             // sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
             // sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
             // sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
             // java.lang.reflect.Method.invoke(Method.java:498)
             // org.evosuite.testcase.statements.MethodStatement$1.execute(MethodStatement.java:257)
             // org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:169)
             // org.evosuite.testcase.statements.MethodStatement.execute(MethodStatement.java:220)
             // org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:307)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:213)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:55)
             // java.util.concurrent.FutureTask.run(FutureTask.java:266)
             // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
             // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
             // java.lang.Thread.run(Thread.java:748)
             //
             verifyException("org.evosuite.runtime.sandbox.MSecurityManager", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientBinaryHandler();
      theClient0.setClientBinaryHandler((ClientBinaryHandler) null);
      theClient0.setClientBinaryHandler((ClientBinaryHandler) null);
      theClient0.getClientExtendedEventHandler();
      theClient0.setClientExtendedEventHandler((ClientExtendedEventHandler) null);
      theClient0.getMaxAuthTryMsg();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setTimeout((-511));
      theClient0.setTimeoutMsg((String) null);
      BlockingClientHandler blockingClientHandler0 = new BlockingClientHandler(91);
      blockingClientHandler0.getClientData();
      theClient0.setClientData((ClientData) null);
      theClient0.setTimeoutMsg("lg;aJ:Vc#!|RKq");
      theClient0.getSocketChannel();
      assertEquals((-511), theClient0.getTimeout());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.toString();
      NetworkHandling.sendMessageOnTcp((EvoSuiteLocalAddress) null, "{TheClient no socket, Event: (ClientEvent-Run Blocking)}");
      SocketChannel socketChannel0 = SocketChannel.open();
      theClient0.setSocketChannel(socketChannel0);
      theClient0.setClientData((ClientData) null);
      theClient0.toString();
      theClient0.toString();
      theClient0.toString();
      String string0 = theClient0.toString();
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", string0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getSocketChannel();
      theClient0.toString();
      CommandHandler commandHandler0 = new CommandHandler();
      BlockingClientHandler blockingClientHandler0 = new BlockingClientHandler();
      // Undeclared exception!
      try { 
        commandHandler0.handleCommand(blockingClientHandler0, "{TheClient no socket, Event: (ClientEvent-Run Blocking)}");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.quickserver.net.qsadmin.CommandHandler", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
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
  //Test case number: 19
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getServer();
      org.quickserver.net.qsadmin.Authenticator authenticator0 = new org.quickserver.net.qsadmin.Authenticator();
      Data data0 = new Data();
      theClient0.setClientData(data0);
      theClient0.setClientAuthenticationHandler(authenticator0);
      theClient0.setMaxAuthTry(1461);
      assertEquals(1461, theClient0.getMaxAuthTry());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientExtendedEventHandler();
      theClient0.setClientExtendedEventHandler((ClientExtendedEventHandler) null);
      theClient0.setCommunicationLogging(true);
      String string0 = theClient0.toString();
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", string0);
      
      theClient0.getClientData();
      theClient0.getMaxConnectionMsg();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }
}
