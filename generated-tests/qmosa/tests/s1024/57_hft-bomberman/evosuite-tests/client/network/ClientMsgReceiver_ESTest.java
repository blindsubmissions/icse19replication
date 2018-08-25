/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 17:36:23 GMT 2018
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
import java.sql.DataTruncation;
import java.sql.SQLFeatureNotSupportedException;
import java.sql.SQLTransactionRollbackException;
import java.sql.SQLTransientException;
import java.sql.SQLWarning;
import java.util.LinkedList;
import java.util.Stack;
import messages.global.MapInfo;
import messages.global.MapListMsg;
import messages.round.MagicKillMsg;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockSocket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClientMsgReceiver_ESTest extends ClientMsgReceiver_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Proxy proxy0 = Proxy.NO_PROXY;
      MockSocket mockSocket0 = new MockSocket(proxy0);
      BomberClient bomberClient0 = BomberClient.getInstance();
      ClientMsgReceiver clientMsgReceiver0 = new ClientMsgReceiver(mockSocket0, bomberClient0);
      String string0 = "wB[`j)62Sp'";
      int int0 = 2624;
      long[] longArray0 = new long[4];
      longArray0[0] = (long) int0;
      longArray0[1] = (long) int0;
      longArray0[2] = (long) int0;
      longArray0[3] = (long) int0;
      String string1 = "a4<3Uklg$!%_`1%|f";
      String string2 = "aaK|XWbT5NW{q8:!";
      int int1 = 0;
      String string3 = "__M4-\\` $Hiu)sw\\:K}";
      String string4 = "";
      int int2 = 160;
      int[] intArray0 = new int[7];
      intArray0[0] = int1;
      intArray0[1] = int1;
      intArray0[2] = int1;
      intArray0[3] = int1;
      intArray0[4] = int2;
      intArray0[5] = int1;
      intArray0[6] = int2;
      BatchUpdateException batchUpdateException0 = new BatchUpdateException(string2, intArray0);
      SQLWarning sQLWarning0 = new SQLWarning(string3, string4, int2, batchUpdateException0);
      SQLTransactionRollbackException sQLTransactionRollbackException0 = new SQLTransactionRollbackException(string1, string2, int1, sQLWarning0);
      BatchUpdateException batchUpdateException1 = new BatchUpdateException(string0, string0, int0, longArray0, sQLTransactionRollbackException0);
      SQLFeatureNotSupportedException sQLFeatureNotSupportedException0 = new SQLFeatureNotSupportedException(string0, batchUpdateException1);
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
  //Test case number: 1
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Proxy proxy0 = Proxy.NO_PROXY;
      MockSocket mockSocket0 = new MockSocket(proxy0);
      BomberClient bomberClient0 = BomberClient.getInstance();
      ClientMsgReceiver clientMsgReceiver0 = new ClientMsgReceiver(mockSocket0, bomberClient0);
      String string0 = "wB[`j)62Sp'";
      int int0 = 2624;
      long[] longArray0 = new long[4];
      longArray0[0] = (long) int0;
      longArray0[1] = (long) int0;
      longArray0[2] = (long) int0;
      longArray0[3] = (long) int0;
      String string1 = "";
      int int1 = 160;
      String string2 = "q9<u{+Ngmytjz=S@";
      int[] intArray0 = new int[2];
      intArray0[0] = int1;
      intArray0[1] = int0;
      BatchUpdateException batchUpdateException0 = new BatchUpdateException(string2, intArray0);
      String string3 = "client.network.ClientMsgReceiver";
      String string4 = "The password you have entered isn't correct!";
      int int2 = 120;
      SQLWarning sQLWarning0 = new SQLWarning(string3, string4, int2, batchUpdateException0);
      String string5 = "";
      String string6 = "Rq4~&";
      int int3 = (-1078);
      SQLTransactionRollbackException sQLTransactionRollbackException0 = new SQLTransactionRollbackException(string5, string6, int3, batchUpdateException0);
      String string7 = "";
      int int4 = (-41);
      BatchUpdateException batchUpdateException1 = new BatchUpdateException(string7, string1, int4, longArray0, sQLWarning0);
      SQLFeatureNotSupportedException sQLFeatureNotSupportedException0 = new SQLFeatureNotSupportedException(string0, sQLTransactionRollbackException0);
      int int5 = 1;
      MagicKillMsg magicKillMsg0 = new MagicKillMsg(int5);
      clientMsgReceiver0.processMsg(magicKillMsg0);
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
  //Test case number: 2
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Proxy proxy0 = Proxy.NO_PROXY;
      MockSocket mockSocket0 = new MockSocket(proxy0);
      DataTruncation dataTruncation0 = new DataTruncation(0, true, true, 0, 0);
      dataTruncation0.getDataSize();
      LinkedList<MapInfo> linkedList0 = new LinkedList<MapInfo>();
      Stack<MapInfo> stack0 = new Stack<MapInfo>();
      MapListMsg mapListMsg0 = new MapListMsg(stack0);
      mapListMsg0.toString();
      ClientMsgReceiver clientMsgReceiver0 = new ClientMsgReceiver(mockSocket0, (BomberClient) null);
      // Undeclared exception!
      try { 
        clientMsgReceiver0.processMsg(mapListMsg0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("messages.global.MapListMsg", e);
      }
  }
}
