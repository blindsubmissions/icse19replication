/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 18:59:55 GMT 2018
 */

package client.network;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import client.BomberClient;
import client.network.ClientMsgReceiver;
import java.awt.HeadlessException;
import java.net.Proxy;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Stack;
import java.util.Vector;
import messages.global.MapInfo;
import messages.global.MapListMsg;
import messages.round.BombExplodedMsg;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockInetSocketAddress;
import org.evosuite.runtime.mock.java.net.MockSocket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClientMsgReceiver_ESTest extends ClientMsgReceiver_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockSocket mockSocket0 = new MockSocket();
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
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Proxy.Type proxy_Type0 = Proxy.Type.SOCKS;
      String string0 = "ERROR";
      int int0 = 826;
      MockInetSocketAddress mockInetSocketAddress0 = new MockInetSocketAddress("ERROR", 826);
      Proxy proxy0 = new Proxy(proxy_Type0, mockInetSocketAddress0);
      MockSocket mockSocket0 = new MockSocket(proxy0);
      BomberClient bomberClient0 = BomberClient.getInstance();
      ClientMsgReceiver clientMsgReceiver0 = new ClientMsgReceiver(mockSocket0, bomberClient0);
      Vector<Integer> vector0 = new Vector<Integer>();
      boolean boolean0 = true;
      BombExplodedMsg bombExplodedMsg0 = new BombExplodedMsg(int0, vector0, vector0, vector0, boolean0);
      clientMsgReceiver0.processMsg(bombExplodedMsg0);
      SQLIntegrityConstraintViolationException sQLIntegrityConstraintViolationException0 = new SQLIntegrityConstraintViolationException(string0);
      // Undeclared exception!
      try { 
        clientMsgReceiver0.handleConnectionLoss(sQLIntegrityConstraintViolationException0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Proxy.Type proxy_Type0 = Proxy.Type.SOCKS;
      MockInetSocketAddress mockInetSocketAddress0 = new MockInetSocketAddress("ERROR", 826);
      Proxy proxy0 = new Proxy(proxy_Type0, mockInetSocketAddress0);
      MockSocket mockSocket0 = new MockSocket(proxy0);
      BomberClient bomberClient0 = BomberClient.getInstance();
      ClientMsgReceiver clientMsgReceiver0 = new ClientMsgReceiver(mockSocket0, bomberClient0);
      Vector<Integer> vector0 = new Vector<Integer>();
      Stack<MapInfo> stack0 = new Stack<MapInfo>();
      MapListMsg mapListMsg0 = new MapListMsg(stack0);
      // Undeclared exception!
      try { 
        clientMsgReceiver0.processMsg(mapListMsg0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }
}