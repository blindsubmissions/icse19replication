/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 13:58:50 GMT 2018
 */

package org.quickserver.net.server;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.nio.channels.SocketChannel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
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
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setTrusted(false);
      theClient0.setCommunicationLogging(false);
      theClient0.getClientAuthenticationHandler();
      theClient0.getClientCommandHandler();
      BlockingClientHandler blockingClientHandler0 = new BlockingClientHandler(16);
      blockingClientHandler0.info();
      Proxy proxy0 = Proxy.NO_PROXY;
      MockSocket mockSocket0 = new MockSocket(proxy0);
      try { 
        mockSocket0.sendUrgentData(16);
        fail("Expecting exception: SocketException");
      
      } catch(SocketException e) {
         //
         // Urgent data not supported
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockSocket", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      BlockingClientHandler blockingClientHandler0 = new BlockingClientHandler();
      blockingClientHandler0.getServer();
      assertEquals("<ClientHandler-Pool#-1-ID:1>", blockingClientHandler0.getName());
      
      theClient0.setServer((QuickServer) null);
      theClient0.toString();
      String string0 = theClient0.toString();
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", string0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientBinaryHandler();
      theClient0.setClientBinaryHandler((ClientBinaryHandler) null);
      theClient0.setSocketChannel((SocketChannel) null);
      TheClient theClient1 = new TheClient();
      theClient1.getAuthenticator();
      theClient0.setAuthenticator((Authenticator) null);
      theClient0.toString();
      theClient0.setMaxAuthTry((-554));
      theClient0.getClientObjectHandler();
      theClient1.setClientObjectHandler((ClientObjectHandler) null);
      TheClient theClient2 = new TheClient();
      theClient2.getSocket();
      theClient0.toString();
      assertEquals((-554), theClient0.getMaxAuthTry());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      ClientEvent clientEvent0 = ClientEvent.MAX_CON;
      theClient0.setClientEvent(clientEvent0);
      String string0 = theClient0.toString();
      assertTrue(theClient0.getCommunicationLogging());
      assertEquals("{TheClient no socket, Event: (ClientEvent-Max Connection)}", string0);
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setTrusted(false);
      String string0 = theClient0.toString();
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", string0);
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientExtendedEventHandler();
      Data data0 = new Data();
      data0.setLastAsked("");
      theClient0.setClientData(data0);
      theClient0.getAuthenticator();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getMaxConnectionMsg();
      theClient0.getClientAuthenticationHandler();
      BlockingClientHandler blockingClientHandler0 = new BlockingClientHandler(0);
      blockingClientHandler0.setSecure(false);
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
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientExtendedEventHandler();
      theClient0.setClientExtendedEventHandler((ClientExtendedEventHandler) null);
      theClient0.setTimeoutMsg("");
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.toString();
      theClient0.toString();
      theClient0.toString();
      theClient0.getClientData();
      theClient0.setClientData((ClientData) null);
      theClient0.toString();
      String string0 = "]H4z@,t>q[j\\u=";
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, string0);
      theClient0.toString();
      theClient0.toString();
      theClient0.toString();
      theClient0.toString();
      theClient0.toString();
      theClient0.toString();
      theClient0.toString();
      TheClient theClient1 = new TheClient();
      theClient1.toString();
      theClient0.toString();
      TheClient theClient2 = new TheClient();
      String string1 = theClient2.toString();
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", string1);
      assertFalse(theClient2.getTrusted());
      assertTrue(theClient2.getCommunicationLogging());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setMaxAuthTryMsg("J#9x[NtT");
      String string0 = theClient0.toString();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", string0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientWriteHandler();
      theClient0.setClientWriteHandler((ClientWriteHandler) null);
      theClient0.getClientAuthenticationHandler();
      theClient0.setSocket((Socket) null);
      theClient0.setTimeoutMsg("");
      theClient0.getSocketChannel();
      theClient0.setClientAuthenticationHandler((ClientAuthenticationHandler) null);
      theClient0.setClientBinaryHandler((ClientBinaryHandler) null);
      TheClient theClient1 = new TheClient();
      theClient1.setClientWriteHandler((ClientWriteHandler) null);
      NetworkHandling.sendMessageOnTcp((EvoSuiteLocalAddress) null, "");
      theClient1.setTimeoutMsg("");
      String string0 = theClient0.toString();
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", string0);
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
      theClient0.toString();
      CommandHandler commandHandler0 = new CommandHandler();
      theClient0.setClientEventHandler(commandHandler0);
      String string0 = theClient0.toString();
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", string0);
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      boolean boolean0 = theClient0.getCommunicationLogging();
      assertTrue(boolean0);
      
      theClient0.getClientEventHandler();
      theClient0.getClientBinaryHandler();
      theClient0.setClientBinaryHandler((ClientBinaryHandler) null);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("B1i/Gdf^O)C-Q^m[");
      FileSystemHandling.createFolder(evoSuiteFile0);
      theClient0.getClientCommandHandler();
      theClient0.setClientCommandHandler((ClientCommandHandler) null);
      theClient0.setMaxConnectionMsg("\t<class-name>");
      String string0 = theClient0.toString();
      assertFalse(theClient0.getTrusted());
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", string0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.772588722239781
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientExtendedEventHandler();
      theClient0.getMaxAuthTryMsg();
      theClient0.getCommunicationLogging();
      theClient0.getClientEvent();
      MockSocket mockSocket0 = new MockSocket();
      theClient0.setSocket(mockSocket0);
      theClient0.toString();
      theClient0.getClientEvent();
      QuickServer quickServer0 = new QuickServer((String) null);
      theClient0.getCommunicationLogging();
      theClient0.getMaxAuthTryMsg();
      theClient0.setMaxConnectionMsg("A[b%|L{[R0UG");
      theClient0.getClientObjectHandler();
      theClient0.setClientObjectHandler((ClientObjectHandler) null);
      theClient0.setClientObjectHandler((ClientObjectHandler) null);
      theClient0.setTimeoutMsg("A[b%|L{[R0UG");
      theClient0.getTimeout();
      theClient0.getMaxAuthTry();
      TheClient theClient1 = new TheClient();
      theClient1.getTrusted();
      theClient1.getClientBinaryHandler();
      theClient1.setClientBinaryHandler((ClientBinaryHandler) null);
      theClient1.setClientBinaryHandler((ClientBinaryHandler) null);
      InetAddress inetAddress0 = MockInetAddress.getByName("f5L");
      MockSocket mockSocket1 = null;
      try {
        mockSocket1 = new MockSocket((String) null, 2136, inetAddress0, 0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Remote address/port is not opened: org.evosuite.runtime.vnet.EndPointInfo@1384f234
         //
         verifyException("org.evosuite.runtime.vnet.VirtualNetwork", e);
      }
  }
}