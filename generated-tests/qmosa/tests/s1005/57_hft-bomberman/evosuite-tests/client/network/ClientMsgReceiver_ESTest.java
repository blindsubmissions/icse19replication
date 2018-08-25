/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 12:03:14 GMT 2018
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
import java.util.Vector;
import javax.swing.ImageIcon;
import messages.global.InfoRequestMsg;
import messages.global.SessionDetailsMsg;
import messages.round.ClientQuitRunningSessionMsg;
import messages.session.SessionParticipationMsg;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.lang.MockException;
import org.evosuite.runtime.mock.java.net.MockInetSocketAddress;
import org.evosuite.runtime.mock.java.net.MockSocket;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClientMsgReceiver_ESTest extends ClientMsgReceiver_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Proxy.Type proxy_Type0 = Proxy.Type.SOCKS;
      MockInetSocketAddress mockInetSocketAddress0 = new MockInetSocketAddress("xlXQQWrsGtM(nzFE}m", 3555);
      Proxy proxy0 = new Proxy(proxy_Type0, mockInetSocketAddress0);
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
      String string0 = "\\oSL0-";
      int[] intArray0 = new int[1];
      int int0 = 0;
      intArray0[0] = int0;
      Thread.UncaughtExceptionHandler thread_UncaughtExceptionHandler0 = clientMsgReceiver0.getUncaughtExceptionHandler();
      clientMsgReceiver0.setUncaughtExceptionHandler(thread_UncaughtExceptionHandler0);
      BatchUpdateException batchUpdateException0 = new BatchUpdateException(string0, intArray0);
      // Undeclared exception!
      try { 
        clientMsgReceiver0.handleConnectionLoss(batchUpdateException0);
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
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MockSocket mockSocket0 = new MockSocket();
      BomberClient bomberClient0 = BomberClient.getInstance();
      ClientMsgReceiver clientMsgReceiver0 = new ClientMsgReceiver(mockSocket0, bomberClient0);
      String string0 = "$2";
      Vector<String> vector0 = new Vector<String>();
      ImageIcon imageIcon0 = new ImageIcon();
      int int0 = (-132);
      SessionDetailsMsg sessionDetailsMsg0 = new SessionDetailsMsg(string0, vector0, imageIcon0, int0, int0, int0);
      clientMsgReceiver0.processMsg(sessionDetailsMsg0);
      boolean boolean0 = true;
      EvoSuiteFile evoSuiteFile0 = null;
      FileSystemHandling.createFolder(evoSuiteFile0);
      String string1 = "";
      SessionParticipationMsg sessionParticipationMsg0 = new SessionParticipationMsg(boolean0, int0, string1);
      clientMsgReceiver0.processMsg(sessionParticipationMsg0);
      long long0 = 506L;
      System.setCurrentTimeMillis(long0);
  }
}
