/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 17:12:07 GMT 2018
 */

package client.network;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import client.BomberClient;
import client.network.ClientMsgReceiver;
import java.awt.HeadlessException;
import java.awt.Point;
import java.awt.ScrollPane;
import java.net.Proxy;
import java.sql.BatchUpdateException;
import java.sql.SQLFeatureNotSupportedException;
import java.sql.SQLTransientConnectionException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import javax.swing.ImageIcon;
import messages.global.GlobalChatMsg;
import messages.global.SessionListMsg;
import messages.round.ClientQuitRunningSessionMsg;
import messages.round.NewBombMsg;
import messages.round.RoundTimeOverMsg;
import messages.round.TileHitPlayerMsg;
import messages.session.PlayerInfo;
import org.apache.log4j.LogManager;
import org.apache.log4j.helpers.Loader;
import org.apache.log4j.spi.RepositorySelector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
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
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Proxy proxy0 = Proxy.NO_PROXY;
      MockSocket mockSocket0 = new MockSocket(proxy0);
      BomberClient bomberClient0 = BomberClient.getInstance();
      ClientMsgReceiver clientMsgReceiver0 = new ClientMsgReceiver(mockSocket0, bomberClient0);
      SQLFeatureNotSupportedException sQLFeatureNotSupportedException0 = new SQLFeatureNotSupportedException();
      // Undeclared exception!
      try { 
        clientMsgReceiver0.handleConnectionLoss(sQLFeatureNotSupportedException0);
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
      MockSocket mockSocket0 = new MockSocket();
      mockSocket0.getTcpNoDelay();
      mockSocket0.getKeepAlive();
      BomberClient bomberClient0 = BomberClient.getInstance();
      ClientMsgReceiver clientMsgReceiver0 = new ClientMsgReceiver(mockSocket0, bomberClient0);
      Stack<PlayerInfo> stack0 = new Stack<PlayerInfo>();
      PlayerInfo playerInfo0 = mock(PlayerInfo.class, new ViolatedAssumptionAnswer());
      stack0.add(playerInfo0);
      String string0 = "%\"%28B;1}r]6)}v";
      GlobalChatMsg globalChatMsg0 = new GlobalChatMsg(string0);
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
