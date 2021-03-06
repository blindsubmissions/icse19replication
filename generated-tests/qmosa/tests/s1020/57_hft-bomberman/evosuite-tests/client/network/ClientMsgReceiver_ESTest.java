/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 16:24:22 GMT 2018
 */

package client.network;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import client.BomberClient;
import client.network.ClientMsgReceiver;
import java.awt.HeadlessException;
import java.net.Proxy;
import java.sql.BatchUpdateException;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.sql.SQLWarning;
import messages.global.JoinAckMsg;
import messages.round.RoundTimeOneSecondLeftMsg;
import messages.session.SessionChatMsg;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
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
      Proxy proxy0 = Proxy.NO_PROXY;
      MockSocket mockSocket0 = new MockSocket(proxy0);
      ClientMsgReceiver clientMsgReceiver0 = new ClientMsgReceiver(mockSocket0, (BomberClient) null);
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
      long long0 = 0L;
      RoundTimeOneSecondLeftMsg roundTimeOneSecondLeftMsg0 = new RoundTimeOneSecondLeftMsg(long0);
      clientMsgReceiver0.processMsg(roundTimeOneSecondLeftMsg0);
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
      String string0 = "";
      SQLWarning sQLWarning0 = new SQLWarning();
      SQLException sQLException0 = new SQLException(string0, sQLWarning0);
      // Undeclared exception!
      try { 
        clientMsgReceiver0.handleConnectionLoss(sQLException0);
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
      Proxy proxy0 = Proxy.NO_PROXY;
      MockSocket mockSocket0 = new MockSocket();
      mockSocket0.close();
      Proxy proxy1 = Proxy.NO_PROXY;
      MockSocket mockSocket1 = new MockSocket(proxy1);
      SQLDataException sQLDataException0 = new SQLDataException("kfU&e.S/M", "kfU&e.S/M", (-2185));
      int int0 = 0;
      int[] intArray0 = new int[1];
      intArray0[0] = 0;
      BatchUpdateException batchUpdateException0 = new BatchUpdateException("allowConnection(): connection refused", "allowConnection(): connection refused", 0, intArray0, sQLDataException0);
      ClientMsgReceiver clientMsgReceiver0 = new ClientMsgReceiver(mockSocket1, (BomberClient) null);
      JoinAckMsg joinAckMsg0 = new JoinAckMsg(true, 0);
      // Undeclared exception!
      try { 
        clientMsgReceiver0.processMsg(joinAckMsg0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("client.BomberClient", e);
      }
  }
}
