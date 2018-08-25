/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 14:22:09 GMT 2018
 */

package client.network;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import client.BomberClient;
import client.network.ClientMsgReceiver;
import java.awt.HeadlessException;
import java.net.Proxy;
import java.sql.SQLDataException;
import messages.global.GlobalChatMsg;
import messages.global.JoinSessionMsg;
import messages.round.BombMoveMsg;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThread;
import org.evosuite.runtime.mock.java.net.MockInetSocketAddress;
import org.evosuite.runtime.mock.java.net.MockSocket;
import org.junit.runner.RunWith;
import server.BomberServer;
import server.ClientInfo;
import server.ServerGameSession;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClientMsgReceiver_ESTest extends ClientMsgReceiver_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Proxy.Type proxy_Type0 = Proxy.Type.SOCKS;
      int int0 = 890;
      MockInetSocketAddress mockInetSocketAddress0 = new MockInetSocketAddress(890);
      Proxy proxy0 = new Proxy(proxy_Type0, mockInetSocketAddress0);
      mockInetSocketAddress0.getHostName();
      MockSocket mockSocket0 = new MockSocket(proxy0);
      mockSocket0.getLocalAddress();
      mockSocket0.getLocalPort();
      mockSocket0.getLocalSocketAddress();
      mockInetSocketAddress0.getHostName();
      BomberClient bomberClient0 = BomberClient.getInstance();
      ClientMsgReceiver clientMsgReceiver0 = new ClientMsgReceiver(mockSocket0, bomberClient0);
      // Undeclared exception!
      try { 
        clientMsgReceiver0.closeConnection();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("client.network.ClientMsgReceiver", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MockSocket mockSocket0 = new MockSocket();
      BomberClient bomberClient0 = BomberClient.getInstance();
      ClientMsgReceiver clientMsgReceiver0 = new ClientMsgReceiver(mockSocket0, bomberClient0);
      int int0 = 0;
      int[] intArray0 = new int[3];
      int int1 = 3931;
      intArray0[0] = int1;
      intArray0[1] = int0;
      intArray0[2] = int0;
      boolean boolean0 = true;
      BombMoveMsg bombMoveMsg0 = new BombMoveMsg(int0, intArray0, intArray0, boolean0);
      clientMsgReceiver0.processMsg(bombMoveMsg0);
      assertFalse(clientMsgReceiver0.isDaemon());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MockSocket mockSocket0 = new MockSocket();
      BomberClient bomberClient0 = BomberClient.getInstance();
      ClientMsgReceiver clientMsgReceiver0 = new ClientMsgReceiver(mockSocket0, bomberClient0);
      String string0 = null;
      int int0 = 50;
      SQLDataException sQLDataException0 = new SQLDataException(string0, string0, int0);
      // Undeclared exception!
      try { 
        clientMsgReceiver0.handleConnectionLoss(sQLDataException0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MockSocket mockSocket0 = new MockSocket();
      BomberClient bomberClient0 = BomberClient.getInstance();
      ClientMsgReceiver clientMsgReceiver0 = new ClientMsgReceiver(mockSocket0, bomberClient0);
      String string0 = null;
      int int0 = 50;
      SQLDataException sQLDataException0 = new SQLDataException(string0, string0, int0);
      String string1 = "Unknown message type: ";
      GlobalChatMsg globalChatMsg0 = new GlobalChatMsg(string1, string0);
      // Undeclared exception!
      try { 
        clientMsgReceiver0.processMsg(globalChatMsg0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }
}
