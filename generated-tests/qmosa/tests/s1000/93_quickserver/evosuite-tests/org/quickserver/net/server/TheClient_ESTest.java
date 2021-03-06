/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 09:24:42 GMT 2018
 */

package org.quickserver.net.server;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.channels.SocketChannel;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.evosuite.runtime.mock.java.net.MockInetSocketAddress;
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
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.toString();
      theClient0.setTimeout(125);
      QuickServer quickServer0 = new QuickServer("{TheClient no socket, Event: (ClientEvent-Run Blocking)}");
      quickServer0.setClientAuthenticationHandler("");
      theClient0.setServer(quickServer0);
      NonBlockingClientHandler nonBlockingClientHandler0 = new NonBlockingClientHandler();
      nonBlockingClientHandler0.setSecure(true);
      nonBlockingClientHandler0.getSocketChannel();
      theClient0.setSocketChannel((SocketChannel) null);
      theClient0.getClientAuthenticationHandler();
      theClient0.setClientCommandHandler((ClientCommandHandler) null);
      theClient0.setTrusted(true);
      theClient0.setMaxConnectionMsg((String) null);
      theClient0.getClientBinaryHandler();
      theClient0.setClientBinaryHandler((ClientBinaryHandler) null);
      theClient0.setTimeout(125);
      theClient0.getClientCommandHandler();
      assertEquals(125, theClient0.getTimeout());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientExtendedEventHandler();
      theClient0.setClientExtendedEventHandler((ClientExtendedEventHandler) null);
      theClient0.setMaxConnectionMsg("=P:I0j1QUqs.");
      theClient0.setTimeout((-167));
      theClient0.setTimeout((-167));
      theClient0.getClientWriteHandler();
      theClient0.setClientWriteHandler((ClientWriteHandler) null);
      theClient0.setMaxAuthTryMsg("");
      theClient0.toString();
      theClient0.setMaxConnectionMsg("");
      theClient0.getClientAuthenticationHandler();
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
  //Test case number: 2
  /*Coverage entropy=2.833213344056216
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientExtendedEventHandler();
      theClient0.setClientExtendedEventHandler((ClientExtendedEventHandler) null);
      theClient0.getClientBinaryHandler();
      theClient0.setClientBinaryHandler((ClientBinaryHandler) null);
      theClient0.setTimeout(596);
      theClient0.getCommunicationLogging();
      theClient0.setClientExtendedEventHandler((ClientExtendedEventHandler) null);
      theClient0.setTimeout(4);
      theClient0.getAuthenticator();
      ClientEvent clientEvent0 = ClientEvent.RUN_BLOCKING;
      theClient0.setClientEvent(clientEvent0);
      theClient0.setTimeoutMsg("org.quickserver.net.server.TheClient");
      theClient0.toString();
      MockSocket mockSocket0 = new MockSocket();
      theClient0.setSocket(mockSocket0);
      theClient0.getServer();
      theClient0.getClientWriteHandler();
      theClient0.getClientAuthenticationHandler();
      theClient0.getClientObjectHandler();
      theClient0.setClientObjectHandler((ClientObjectHandler) null);
      assertEquals(4, theClient0.getTimeout());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.70805020110221
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      CommandHandler commandHandler0 = new CommandHandler();
      theClient0.setClientEventHandler(commandHandler0);
      theClient0.getClientAuthenticationHandler();
      theClient0.setClientAuthenticationHandler((ClientAuthenticationHandler) null);
      theClient0.getClientObjectHandler();
      theClient0.setClientObjectHandler((ClientObjectHandler) null);
      assertFalse(theClient0.getTrusted());
      
      theClient0.setTrusted(true);
      theClient0.setMaxAuthTryMsg("");
      theClient0.getClientWriteHandler();
      theClient0.setClientWriteHandler((ClientWriteHandler) null);
      theClient0.getTimeoutMsg();
      theClient0.getClientBinaryHandler();
      theClient0.setClientBinaryHandler((ClientBinaryHandler) null);
      theClient0.getTimeoutMsg();
      theClient0.getServer();
      theClient0.getClientData();
      assertTrue(theClient0.getTrusted());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientExtendedEventHandler();
      theClient0.setClientExtendedEventHandler((ClientExtendedEventHandler) null);
      theClient0.getClientBinaryHandler();
      theClient0.setClientBinaryHandler((ClientBinaryHandler) null);
      theClient0.getClientData();
      theClient0.setMaxAuthTry(0);
      theClient0.getSocketChannel();
      String string0 = "";
      // Undeclared exception!
      try { 
        MockInetSocketAddress.createUnresolved("", (-1963));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // port out of range:-1963
         //
         verifyException("java.net.InetSocketAddress", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      CommandHandler commandHandler0 = new CommandHandler();
      theClient0.setClientCommandHandler(commandHandler0);
      theClient0.setClientExtendedEventHandler((ClientExtendedEventHandler) null);
      theClient0.setAuthenticator((Authenticator) null);
      theClient0.getClientBinaryHandler();
      theClient0.setCommunicationLogging(true);
      theClient0.getClientAuthenticationHandler();
      theClient0.setClientAuthenticationHandler((ClientAuthenticationHandler) null);
      theClient0.getServer();
      theClient0.getClientAuthenticationHandler();
      theClient0.getAuthenticator();
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
  //Test case number: 6
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientCommandHandler();
      theClient0.setClientCommandHandler((ClientCommandHandler) null);
      int int0 = theClient0.getTimeout();
      assertEquals(0, int0);
      
      theClient0.getClientWriteHandler();
      theClient0.setCommunicationLogging(true);
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getAuthenticator();
      theClient0.setAuthenticator((Authenticator) null);
      theClient0.getMaxAuthTry();
      theClient0.getClientAuthenticationHandler();
      theClient0.toString();
      TheClient theClient1 = new TheClient();
      theClient1.getClientEventHandler();
      theClient0.setClientEventHandler((ClientEventHandler) null);
      theClient1.setTimeout(1480);
      theClient0.setTimeoutMsg("{TheClient no socket, Event: (ClientEvent-Run Blocking)}");
      theClient0.getClientExtendedEventHandler();
      theClient0.getMaxAuthTryMsg();
      theClient1.getCommunicationLogging();
      NonBlockingClientHandler nonBlockingClientHandler0 = new NonBlockingClientHandler(1480);
      nonBlockingClientHandler0.getSocketChannel();
      MockInetSocketAddress mockInetSocketAddress0 = null;
      try {
        mockInetSocketAddress0 = new MockInetSocketAddress((String) null, 636);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // hostname can't be null
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockInetSocketAddress", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          TheClient theClient0 = new TheClient();
          theClient0.setMaxAuthTryMsg("sOzzO(JM`I ");
          theClient0.setMaxAuthTryMsg("sOzzO(JM`I ");
          theClient0.getClientBinaryHandler();
          theClient0.getClientBinaryHandler();
          theClient0.setClientBinaryHandler((ClientBinaryHandler) null);
          theClient0.getSocket();
          theClient0.getAuthenticator();
          theClient0.toString();
          theClient0.setTimeoutMsg("!Ox,bMN0qRxGwJ-");
          theClient0.getAuthenticator();
          theClient0.getTrusted();
          theClient0.getMaxAuthTryMsg();
          theClient0.getCommunicationLogging();
          theClient0.setCommunicationLogging(true);
          theClient0.getTimeoutMsg();
          MockInetSocketAddress mockInetSocketAddress0 = new MockInetSocketAddress("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", 0);
          mockInetSocketAddress0.getHostName();
          theClient0.setClientBinaryHandler((ClientBinaryHandler) null);
          mockInetSocketAddress0.getHostName();
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
             // sun.reflect.GeneratedMethodAccessor151.invoke(Unknown Source)
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
  //Test case number: 9
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientObjectHandler();
      theClient0.setMaxConnectionMsg((String) null);
      theClient0.setClientObjectHandler((ClientObjectHandler) null);
      theClient0.getAuthenticator();
      org.quickserver.net.qsadmin.Authenticator authenticator0 = new org.quickserver.net.qsadmin.Authenticator();
      theClient0.setClientAuthenticationHandler(authenticator0);
      theClient0.setClientEventHandler((ClientEventHandler) null);
      ClientAuthenticationHandler clientAuthenticationHandler0 = theClient0.getClientAuthenticationHandler();
      theClient0.getClientObjectHandler();
      theClient0.getClientExtendedEventHandler();
      theClient0.setClientAuthenticationHandler(clientAuthenticationHandler0);
      theClient0.setClientExtendedEventHandler((ClientExtendedEventHandler) null);
      theClient0.getSocket();
      theClient0.getSocket();
      theClient0.getClientExtendedEventHandler();
      theClient0.getClientBinaryHandler();
      theClient0.setClientBinaryHandler((ClientBinaryHandler) null);
      theClient0.setClientData((ClientData) null);
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientObjectHandler();
      theClient0.setTrusted(true);
      theClient0.getTimeout();
      theClient0.getMaxConnectionMsg();
      theClient0.setClientObjectHandler((ClientObjectHandler) null);
      theClient0.setMaxConnectionMsg((String) null);
      theClient0.getSocketChannel();
      InetAddress inetAddress0 = MockInetAddress.getByName("");
      MockSocket mockSocket0 = null;
      try {
        mockSocket0 = new MockSocket(inetAddress0, (-2431));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // port out of range:-2431
         //
         verifyException("java.net.InetSocketAddress", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      ClientEvent clientEvent0 = ClientEvent.ACCEPT;
      theClient0.setClientEvent(clientEvent0);
      theClient0.setTimeout(0);
      theClient0.setTimeout((-2318));
      theClient0.getCommunicationLogging();
      theClient0.getClientEvent();
      theClient0.getMaxConnectionMsg();
      theClient0.getCommunicationLogging();
      theClient0.getClientExtendedEventHandler();
      theClient0.setClientExtendedEventHandler((ClientExtendedEventHandler) null);
      assertEquals((-2318), theClient0.getTimeout());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.751666616931517
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setTimeout(0);
      theClient0.setClientEvent((ClientEvent) null);
      theClient0.toString();
      theClient0.getClientEventHandler();
      TheClient theClient1 = new TheClient();
      theClient1.setTimeout(0);
      theClient1.getCommunicationLogging();
      theClient0.getClientExtendedEventHandler();
      theClient0.setClientExtendedEventHandler((ClientExtendedEventHandler) null);
      theClient0.setTimeout(182);
      theClient1.getAuthenticator();
      ClientEvent clientEvent0 = ClientEvent.RUN_BLOCKING;
      theClient0.setClientEvent(clientEvent0);
      theClient1.setTimeoutMsg("N,)'K'H");
      theClient0.toString();
      MockSocket mockSocket0 = new MockSocket();
      theClient0.setSocket(mockSocket0);
      theClient1.getServer();
      theClient0.getClientWriteHandler();
      theClient1.getClientAuthenticationHandler();
      theClient0.getClientObjectHandler();
      theClient1.setClientObjectHandler((ClientObjectHandler) null);
      theClient0.toString();
      assertEquals(182, theClient0.getTimeout());
  }
}
