/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 12:51:43 GMT 2018
 */

package org.quickserver.net.server;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.net.SocketOption;
import java.nio.ByteBuffer;
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
import org.quickserver.net.server.DataMode;
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
  /*Coverage entropy=2.70805020110221
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          TheClient theClient0 = new TheClient();
          TheClient theClient1 = new TheClient();
          theClient0.getClientExtendedEventHandler();
          theClient0.setClientExtendedEventHandler((ClientExtendedEventHandler) null);
          theClient0.setCommunicationLogging(true);
          theClient1.getClientObjectHandler();
          theClient0.setClientObjectHandler((ClientObjectHandler) null);
          theClient0.setClientAuthenticationHandler((ClientAuthenticationHandler) null);
          ClientEvent clientEvent0 = null;
          theClient1.setClientEvent((ClientEvent) null);
          theClient1.getTimeoutMsg();
          QuickServer quickServer0 = new QuickServer();
          DataMode dataMode0 = DataMode.STRING;
          DataType dataType0 = DataType.IN;
          quickServer0.setDefaultDataMode(dataMode0, dataType0);
          theClient0.setServer(quickServer0);
          theClient1.getTimeout();
          theClient1.setClientEvent((ClientEvent) null);
          theClient0.getClientEventHandler();
          theClient1.getMaxAuthTryMsg();
          theClient1.setClientBinaryHandler((ClientBinaryHandler) null);
          theClient1.getMaxConnectionMsg();
          theClient1.setClientBinaryHandler((ClientBinaryHandler) null);
          MockInetSocketAddress mockInetSocketAddress0 = new MockInetSocketAddress("", 0);
          // Undeclared exception!
          try { 
            SocketChannel.open((SocketAddress) mockInetSocketAddress0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.net.SocketPermission\" \"127.0.0.1:0\" \"connect,resolve\")
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
  //Test case number: 1
  /*Coverage entropy=2.772588722239781
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setTimeout(2974);
      theClient0.getClientEventHandler();
      theClient0.getClientCommandHandler();
      theClient0.setClientCommandHandler((ClientCommandHandler) null);
      boolean boolean0 = false;
      theClient0.setCommunicationLogging(false);
      theClient0.setClientEventHandler((ClientEventHandler) null);
      BlockingClientHandler blockingClientHandler0 = new BlockingClientHandler(2974);
      ClientEvent clientEvent0 = theClient0.getClientEvent();
      blockingClientHandler0.isClientEventNext(clientEvent0);
      blockingClientHandler0.getClientData();
      theClient0.setClientData((ClientData) null);
      theClient0.setTrusted(true);
      theClient0.setCommunicationLogging(true);
      theClient0.setClientEventHandler((ClientEventHandler) null);
      theClient0.setMaxAuthTry(2974);
      theClient0.setMaxAuthTryMsg("");
      theClient0.setMaxConnectionMsg("^4iwcm)|r1v3UP>1~*");
      theClient0.getServer();
      theClient0.getAuthenticator();
      theClient0.setAuthenticator((Authenticator) null);
      theClient0.getClientEvent();
      SocketChannel socketChannel0 = SocketChannel.open();
      // Undeclared exception!
      try { 
        socketChannel0.write((ByteBuffer[]) null, 2974, 2974);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setTimeout(0);
      theClient0.setTimeout((-1173));
      theClient0.setClientAuthenticationHandler((ClientAuthenticationHandler) null);
      theClient0.setClientObjectHandler((ClientObjectHandler) null);
      theClient0.setClientAuthenticationHandler((ClientAuthenticationHandler) null);
      theClient0.getMaxConnectionMsg();
      theClient0.getClientWriteHandler();
      ClientEvent clientEvent0 = ClientEvent.READ;
      theClient0.setClientEvent(clientEvent0);
      theClient0.getClientExtendedEventHandler();
      theClient0.getMaxAuthTry();
      theClient0.getClientData();
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      MockSocket mockSocket0 = null;
      try {
        mockSocket0 = new MockSocket(inetAddress0, 0, true);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Remote address/port is not opened: org.evosuite.runtime.vnet.EndPointInfo@44a67895
         //
         verifyException("org.evosuite.runtime.vnet.VirtualNetwork", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      MockSocket mockSocket0 = new MockSocket();
      mockSocket0.getReceiveBufferSize();
      theClient0.getClientObjectHandler();
      boolean boolean0 = false;
      mockSocket0.setSoLinger(false, (-2290));
      theClient0.setClientObjectHandler((ClientObjectHandler) null);
      theClient0.setSocket(mockSocket0);
      theClient0.getMaxAuthTry();
      theClient0.getSocket();
      BlockingClientHandler blockingClientHandler0 = new BlockingClientHandler();
      blockingClientHandler0.getClientData();
      theClient0.setClientData((ClientData) null);
      theClient0.getClientWriteHandler();
      theClient0.getMaxConnectionMsg();
      theClient0.getTimeoutMsg();
      TheClient theClient1 = new TheClient();
      theClient1.getClientBinaryHandler();
      theClient0.setClientBinaryHandler((ClientBinaryHandler) null);
      SocketChannel socketChannel0 = SocketChannel.open();
      SocketOption<Object> socketOption0 = (SocketOption<Object>) mock(SocketOption.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(socketOption0).toString();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        socketChannel0.setOption(socketOption0, object0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientWriteHandler();
      theClient0.setClientWriteHandler((ClientWriteHandler) null);
      theClient0.getClientAuthenticationHandler();
      theClient0.getClientCommandHandler();
      theClient0.getClientObjectHandler();
      theClient0.setClientObjectHandler((ClientObjectHandler) null);
      theClient0.getServer();
      int int0 = theClient0.getTimeout();
      assertEquals(0, int0);
      
      theClient0.getClientBinaryHandler();
      theClient0.setClientBinaryHandler((ClientBinaryHandler) null);
      theClient0.setTrusted(false);
      theClient0.setClientObjectHandler((ClientObjectHandler) null);
      theClient0.getSocketChannel();
      theClient0.getClientEventHandler();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientBinaryHandler();
      theClient0.setClientBinaryHandler((ClientBinaryHandler) null);
      theClient0.getClientBinaryHandler();
      theClient0.setClientBinaryHandler((ClientBinaryHandler) null);
      theClient0.setServer((QuickServer) null);
      theClient0.getCommunicationLogging();
      CommandHandler commandHandler0 = new CommandHandler();
      NonBlockingClientHandler nonBlockingClientHandler0 = new NonBlockingClientHandler(58);
      // Undeclared exception!
      try { 
        nonBlockingClientHandler0.readBinary();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Can't read Binary :DataType.IN is not in DataMode.BINARY
         //
         verifyException("org.quickserver.net.server.impl.BasicClientHandler", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      String string0 = "u2B!+$#7U%Vc=< |<6E";
      int int0 = 3028;
      theClient0.setTimeoutMsg("AZNI#]}tlG)o");
      MockInetAddress.getLoopbackAddress();
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
  //Test case number: 7
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientBinaryHandler();
      theClient0.setClientBinaryHandler((ClientBinaryHandler) null);
      theClient0.setClientBinaryHandler((ClientBinaryHandler) null);
      theClient0.setAuthenticator((Authenticator) null);
      int int0 = theClient0.getTimeout();
      theClient0.getClientWriteHandler();
      theClient0.setClientWriteHandler((ClientWriteHandler) null);
      theClient0.getClientExtendedEventHandler();
      Data data0 = new Data();
      theClient0.setClientData(data0);
      theClient0.getClientCommandHandler();
      theClient0.setClientCommandHandler((ClientCommandHandler) null);
      int int1 = theClient0.getMaxAuthTry();
      assertTrue(int1 == int0);
      
      theClient0.toString();
      theClient0.getClientEvent();
      theClient0.setAuthenticator((Authenticator) null);
      theClient0.getClientWriteHandler();
      theClient0.setClientWriteHandler((ClientWriteHandler) null);
      boolean boolean0 = theClient0.getTrusted();
      assertFalse(boolean0);
      
      theClient0.setClientCommandHandler((ClientCommandHandler) null);
      theClient0.getSocket();
      theClient0.setMaxConnectionMsg("{TheClient no socket, Event: (ClientEvent-Run Blocking)}");
      String string0 = theClient0.toString();
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", string0);
      
      Data data1 = new Data();
      theClient0.setClientData(data1);
      theClient0.getAuthenticator();
      theClient0.getClientEvent();
      theClient0.getMaxAuthTryMsg();
      theClient0.setMaxAuthTryMsg(":C$E+gYgftod");
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setMaxAuthTry(1);
      theClient0.toString();
      BlockingClientHandler blockingClientHandler0 = new BlockingClientHandler((-2093));
      blockingClientHandler0.resetTotalReadBytes();
      blockingClientHandler0.getServer();
      theClient0.setServer((QuickServer) null);
      theClient0.toString();
      CommandHandler commandHandler0 = new CommandHandler();
      theClient0.setClientEventHandler(commandHandler0);
      theClient0.getClientEvent();
      theClient0.getSocketChannel();
      theClient0.toString();
      theClient0.getAuthenticator();
      theClient0.getClientAuthenticationHandler();
      theClient0.getClientBinaryHandler();
      theClient0.setClientBinaryHandler((ClientBinaryHandler) null);
      theClient0.setSocketChannel((SocketChannel) null);
      theClient0.setSocketChannel((SocketChannel) null);
      assertEquals(1, theClient0.getMaxAuthTry());
  }
}
