/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 19:03:55 GMT 2018
 */

package state;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FilterOutputStream;
import java.io.PipedInputStream;
import java.io.PushbackInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import state.Packable;
import state.Party;
import state.Player;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Player_ESTest extends Player_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      long long0 = 0L;
      System.setCurrentTimeMillis(0L);
      System.setCurrentTimeMillis(0L);
      System.setCurrentTimeMillis(0L);
      int int0 = 4919;
      Player player0 = new Player(4919);
      player0.setX(4919);
      player0.setZ(0L);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PushbackInputStream pushbackInputStream0 = null;
      try {
        pushbackInputStream0 = new PushbackInputStream(pipedInputStream0, (-1144));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // size <= 0
         //
         verifyException("java.io.PushbackInputStream", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Player player0 = new Player(0, (String) null, (String) null, 783);
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)10;
      byteArray0[1] = (byte) (-55);
      byteArray0[2] = (byte)0;
      player0.unpack(byteArray0);
      player0.getName();
      boolean boolean0 = player0.isDead();
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
      assertEquals(783, player0.getPictureId());
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertTrue(player0.isConnected());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Player player0 = new Player((-2047));
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      player0.getIP();
      Player player1 = new Player((short)4919, "0.0.0.0", (-1685));
      player1.setMoney((-2047));
      boolean boolean0 = player0.isJoinOK(player1, false);
      assertEquals((-2047.0F), player1.getMoney(), 0.01F);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Player player0 = new Player(0);
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)4;
      byteArray0[1] = (byte)55;
      byteArray0[2] = (byte) (-2);
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte)94;
      player0.unpack(byteArray0);
      player0.type();
      System.setCurrentTimeMillis(2982L);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Player player0 = new Player(0);
      player0.setDead((long) 0);
      Player player1 = new Player((-993));
      player1.getZ();
      int int0 = Packable.GAME_STATE;
      assertEquals(4, int0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Player player0 = new Player((-3487));
      MockFile mockFile0 = new MockFile("^a5gN(x\"%duP>", "^a5gN(x\"%duP>");
      MockFile mockFile1 = new MockFile(mockFile0, "^a5gN(x\"%duP>");
      Party party0 = player0.next;
      player0.add((Party) null);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile1);
      FilterOutputStream filterOutputStream0 = new FilterOutputStream(mockPrintStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(filterOutputStream0);
      player0.pack(dataOutputStream0);
      player0.getY();
      player0.setDead((long) (-3487));
      player0.getMoney();
      player0.toString();
      player0.getIP();
      assertEquals((-3487L), player0.getTimeOfDeath());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      Player player0 = new Player((-748), "g", 2578);
      player0.setX((-748));
      player0.setX(2578);
      pipedInputStream0.close();
      player0.getIP();
      player0.toString();
      player0.isConnected();
      player0.setX((-957.7119F));
      assertEquals((-957.7119F), player0.getX(), 0.01F);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Player player0 = new Player(0);
      String string0 = "hNp-D<Af";
      player0.getPictureId();
      player0.setZ(0);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      BufferedInputStream bufferedInputStream0 = null;
      try {
        bufferedInputStream0 = new BufferedInputStream(pipedInputStream0, (-708));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Buffer size <= 0
         //
         verifyException("java.io.BufferedInputStream", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.4750763110546947
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-53);
      byteArray0[1] = (byte)127;
      byteArray0[2] = (byte)1;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      Player player0 = new Player(0);
      player0.reset(false);
      player0.setJoinOK(player0, true);
      player0.setJoinOK(player0, false);
      player0.isJoinOK(player0, false);
      System.setCurrentTimeMillis((-1L));
      System.setCurrentTimeMillis((-1L));
      System.setCurrentTimeMillis(0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Player player0 = new Player(0);
      boolean boolean0 = false;
      player0.gangStrength();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("module.ModuleBrowserDialog$ModuleFilter");
      player0.setDead();
      MockFileOutputStream mockFileOutputStream1 = null;
      try {
        mockFileOutputStream1 = new MockFileOutputStream("");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Player player0 = new Player(0);
      player0.pack();
      boolean boolean0 = player0.isDead();
      assertFalse(boolean0);
      
      Player player1 = new Player((-2486));
      assertEquals(10.0F, player1.getX(), 0.01F);
      assertEquals(0L, player1.getTimeOfDeath());
      assertEquals("0.0.0.0", player1.getIP());
      assertEquals(0, player1.getPictureId());
      assertEquals(1, player1.getStrength());
      assertEquals(0.0F, player1.getY(), 0.01F);
      assertEquals("Player-2486", player1.toString());
      assertTrue(player1.isConnected());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Player player0 = new Player(0);
      player0.setJoinOK(player0, true);
      player0.setJoinOK(player0, false);
      player0.isJoinOK(player0, false);
      Player player1 = new Player(0);
      long long0 = player1.getTimeOfDeath();
      assertEquals(0L, long0);
      
      String string0 = player1.toString();
      assertEquals("Player0", string0);
      
      player0.setJoinOK(player1, true);
      boolean boolean0 = player1.isConnected();
      boolean boolean1 = player0.isJoinOK(player1, true);
      assertEquals(0, player1.getPictureId());
      assertEquals("0.0.0.0", player1.getIP());
      assertTrue(boolean1 == boolean0);
      assertFalse(player1.isDead());
      assertEquals(1, player1.getStrength());
      assertEquals(0.0F, player1.getY(), 0.01F);
      assertEquals(10.0F, player1.getX(), 0.01F);
      assertTrue(boolean1);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Player player0 = new Player(0, "Player.pack(): *** ERROR *** [IO] pack failed! current state is inconsistent: ", "Player.pack(): *** ERROR *** [IO] pack failed! current state is inconsistent: ", 737, 737);
      Party party0 = new Party();
      player0.add(party0);
      player0.isDead();
      boolean boolean0 = player0.isDead();
      assertFalse(boolean0);
      
      player0.getY();
      player0.setDead(0L, false);
      assertTrue(player0.isDead());
      
      player0.reset(false);
      assertEquals(737, player0.getStrength());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Player player0 = new Player((-3078), "rd@U!K", "rd@U!K", 2182, 553);
      player0.setY(2182);
      int int0 = player0.getStrength();
      assertEquals(2182.0F, player0.getY(), 0.01F);
      assertEquals(553, int0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Player player0 = new Player((-901), "g:*|/J1?q}?", "g:*|/J1?q}?", (-901));
      player0.reset(true);
      // Undeclared exception!
      try { 
        player0.isJoinOK((Player) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("state.Player", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Player player0 = new Player();
      int int0 = player0.gangStrength();
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0, player0.getPictureId());
      assertFalse(player0.isDead());
      assertEquals("Player-1", player0.getName());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertTrue(player0.isConnected());
      assertEquals(1, int0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Player player0 = new Player((-984));
      player0.getX();
      Player player1 = new Player(4, ".*[.]class$", "ES|X`PmL-", 0, (-1273));
      MockFileInputStream mockFileInputStream0 = null;
      try {
        mockFileInputStream0 = new MockFileInputStream("state.Party");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Player player0 = new Player((-11));
      assertTrue(player0.isConnected());
      
      player0.setConnected(false);
      assertFalse(player0.isConnected());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Player player0 = new Player(0);
      player0.setZ((byte) (-81));
      byte[] byteArray0 = player0.pack();
      player0.unpack(byteArray0);
      int int0 = player0.type();
      assertEquals((-81.0F), player0.getZ(), 0.01F);
      assertEquals(5, int0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Player player0 = new Player(0);
      Player player1 = new Player(0, "hNp-D<Af", 34);
      player1.setDead((long) (short)4919);
      player1.setJoinOK(player0, false);
      boolean boolean0 = player1.isDead();
      assertEquals(4919L, player1.getTimeOfDeath());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Player player0 = new Player(0);
      player0.setJoinOK(player0, true);
      Player player1 = new Player(0);
      player1.setJoinOK(player0, true);
      player1.setJoinOK(player0, true);
      boolean boolean0 = player0.isJoinOK(player1, false);
      assertTrue(player1.isConnected());
      assertEquals("0.0.0.0", player1.getIP());
      assertFalse(boolean0);
      assertEquals("Player0", player1.getName());
      assertEquals(1, player1.getStrength());
      assertEquals(0, player1.getPictureId());
      assertEquals(0.0F, player1.getY(), 0.01F);
      assertEquals(10.0F, player1.getX(), 0.01F);
      assertEquals(0L, player1.getTimeOfDeath());
      assertFalse(player1.isDead());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Player player0 = new Player();
      Player player1 = new Player();
      player0.remove(player1);
      byte[] byteArray0 = new byte[1];
      player0.unpack(byteArray0);
      player1.setJoinOK(player0, true);
      player0.setDead((-3400L));
      player1.setX(0.1F);
      player0.setY(1532.0F);
      player1.isJoinOK(player0, true);
      player0.setJoinOK(player1, false);
      player1.setJoinOK(player0, true);
      player1.isJoinOK(player0, true);
      System.setCurrentTimeMillis(863L);
      System.setCurrentTimeMillis(1392409296320L);
      player1.isJoinOK(player0, true);
      player0.isJoinOK(player1, true);
      System.setCurrentTimeMillis(863L);
  }
}
