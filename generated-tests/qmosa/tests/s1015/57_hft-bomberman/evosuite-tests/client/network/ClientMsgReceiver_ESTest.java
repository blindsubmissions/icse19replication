/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 14:58:25 GMT 2018
 */

package client.network;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import client.BomberClient;
import client.ClientGameRound;
import client.ClientGameSession;
import client.network.ClientMsgReceiver;
import client.view.GameCanvas;
import java.awt.Component;
import java.awt.HeadlessException;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.net.Proxy;
import java.sql.SQLDataException;
import java.sql.SQLNonTransientException;
import java.sql.SQLTimeoutException;
import java.util.LinkedList;
import javax.swing.ImageIcon;
import messages.Message;
import messages.global.GlobalStateMsg;
import messages.global.JoinSessionMsg;
import messages.round.MagicKillMsg;
import messages.round.PlayerStateMsg;
import messages.round.RoundStateMsg;
import messages.round.TileHitPlayerMsg;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Proxy proxy0 = Proxy.NO_PROXY;
      MockSocket mockSocket0 = new MockSocket(proxy0);
      BomberClient bomberClient0 = BomberClient.getInstance();
      ClientMsgReceiver clientMsgReceiver0 = new ClientMsgReceiver(mockSocket0, bomberClient0);
      mockSocket0.getReuseAddress();
      String string0 = "";
      JoinSessionMsg joinSessionMsg0 = new JoinSessionMsg(string0, string0);
      clientMsgReceiver0.processMsg(joinSessionMsg0);
      Message message0 = null;
      clientMsgReceiver0.processMsg(message0);
      int int0 = (-1427);
      TileHitPlayerMsg tileHitPlayerMsg0 = new TileHitPlayerMsg(int0);
      String string1 = "pRz=IA;i";
      LinkedList<String> linkedList0 = new LinkedList<String>();
      ImageIcon imageIcon0 = new ImageIcon(string1);
      int int1 = (-1946);
      int int2 = 2088;
      ClientGameSession clientGameSession0 = null;
      try {
        clientGameSession0 = new ClientGameSession(string1, linkedList0, imageIcon0, int1, int2, int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // maps empty?: true nrOfPlayers: -1946 totalRounds: 2088
         //
         verifyException("common.GameSession", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Proxy proxy0 = Proxy.NO_PROXY;
      MockSocket mockSocket0 = new MockSocket(proxy0);
      ClientMsgReceiver clientMsgReceiver0 = new ClientMsgReceiver(mockSocket0, (BomberClient) null);
      SQLTimeoutException sQLTimeoutException0 = new SQLTimeoutException();
      // Undeclared exception!
      try { 
        clientMsgReceiver0.handleConnectionLoss(sQLTimeoutException0);
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
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-56);
      byteArray0[1] = (byte) (-28);
      ClientMsgReceiver clientMsgReceiver0 = new ClientMsgReceiver(mockSocket0, (BomberClient) null);
      mockSocket0.getReuseAddress();
      JoinSessionMsg joinSessionMsg0 = new JoinSessionMsg("", "");
      GlobalStateMsg globalStateMsg0 = new GlobalStateMsg(260);
      // Undeclared exception!
      try { 
        clientMsgReceiver0.processMsg(globalStateMsg0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }
}
