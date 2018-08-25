/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 11:08:35 GMT 2018
 */

package state;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;
import state.Party;
import state.Player;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Player_ESTest extends Player_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = 540;
      Player player0 = new Player(4, "k}KQ~", "k}KQ~", 0, 540);
      Player player1 = new Player(4, "k}KQ~", "k}KQ~", 10, 4);
      player0.next = (Party) player1;
      boolean boolean0 = false;
      player0.reset(false);
      player1.getMoney();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      boolean boolean1 = false;
      MockPrintStream mockPrintStream0 = new MockPrintStream(pipedOutputStream0, false);
      MockPrintStream mockPrintStream1 = new MockPrintStream(mockPrintStream0);
      mockPrintStream1.println('j');
      try { 
        pipedOutputStream0.write((-2831));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Player player0 = new Player();
      player0.getSubparty();
      player0.pack();
      player0.boss = null;
      player0.setMoney(0.0F);
      player0.getMoney();
      player0.setMoney(1.0F);
      assertEquals(1.0F, player0.getMoney(), 0.01F);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int int0 = 2899;
      Player player0 = new Player(2899, "Tfz", "Tfz", 5);
      boolean boolean0 = true;
      player0.setDead();
      player0.setConnected(true);
      player0.type();
      MockFileOutputStream mockFileOutputStream0 = null;
      try {
        mockFileOutputStream0 = new MockFileOutputStream((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Player player0 = new Player(0, "", 2404);
      player0.getSubparty();
      Player player1 = new Player((short)4919);
      player0.boss = (Party) player1;
      player0.setMoney(0.2F);
      player1.setConnected(false);
      player0.getY();
      player0.toString();
      player0.gangStrength();
      player0.toString();
      player0.getName();
      player1.setJoinOK(player0, false);
      player1.gangStrength();
      player1.setConnected(true);
      int int0 = player1.getStrength();
      assertTrue(player1.isConnected());
      assertEquals(1, int0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Player player0 = new Player(3127, "", 3127);
      player0.setConnected(false);
      player0.setDead();
      player0.isConnected();
      player0.getName();
      player0.setConnected(false);
      player0.setConnected(false);
      player0.setDead((-1L), false);
      player0.setDead();
      player0.setDead((-2092L), false);
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)10;
      byteArray0[1] = (byte)3;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte) (-41);
      player0.setConnected(false);
      player0.unpack(byteArray0);
      float float0 = player0.getZ();
      assertEquals((-2092L), player0.getTimeOfDeath());
      assertEquals(0.0F, float0, 0.01F);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=3.1354942159291497
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Player player0 = new Player(10, "Player.unpack(): *** WARNING *** [EOF] data was incomplete: ", "Player.unpack(): *** WARNING *** [EOF] data was incomplete: ", 0, 0);
      player0.pack();
      player0.gangStrength();
      player0.setConnected(false);
      player0.setY(1528.2786F);
      player0.getIP();
      player0.setDead((long) 0);
      player0.setMoney(561.7067F);
      player0.getPictureId();
      player0.getX();
      player0.getTimeOfDeath();
      Player player1 = new Player(0, "Player.unpack(): *** WARNING *** [EOF] data was incomplete: ", "Player.unpack(): *** WARNING *** [EOF] data was incomplete: ", (short)4919, 0);
      player0.prev = (Party) player1;
      player0.getZ();
      Player player2 = new Player((-3901), "Player.unpack(): *** WARNING *** [EOF] data was incomplete: ", "1Zucc:+", 10, 2805);
      player0.setJoinOK(player2, false);
      player2.id = 0;
      player2.isJoinOK(player0, false);
      player2.getTimeOfDeath();
      player2.setConnected(false);
      player0.pack();
      player2.toString();
      player0.isDead();
      player2.getY();
      Player player3 = new Player(1);
      player0.setJoinOK(player3, true);
      assertFalse(player0.isConnected());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Player player0 = new Player(2896, (String) null, 0);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      pipedInputStream0.markSupported();
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      player0.id = (-1090);
      player0.unpack(dataInputStream0);
      player0.setMoney(0);
      player0.isDead();
      player0.reset(false);
      DataInputStream dataInputStream1 = new DataInputStream(dataInputStream0);
      boolean boolean0 = player0.unpack(dataInputStream1);
      assertFalse(boolean0);
      
      player0.getName();
      assertEquals(0, player0.getPictureId());
      assertTrue(player0.isConnected());
      assertEquals(1, player0.getStrength());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(0.0F, player0.getMoney(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Player player0 = new Player(2767, "state.Player$JoinInfo", "jw/6XbA9", 0);
      Party party0 = player0.gangBoss();
      party0.id = 0;
      player0.prev = party0;
      player0.getTimeOfDeath();
      player0.setX(0L);
      player0.setZ(0.0F);
      player0.gangStrength();
      player0.type();
      player0.setDead((long) 1);
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        player0.pack(dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Player player0 = new Player(0);
      Player player1 = new Player((short)4919, "", 0);
      player0.id = 0;
      player0.setJoinOK(player1, false);
      player0.setDead(1L, true);
      player0.gangStrength();
      player0.getSubparty();
      player0.getTimeOfDeath();
      player1.setDead(1L, true);
      player1.setY(0);
      player1.getY();
      player0.isConnected();
      player1.reset(true);
      player1.setZ((short)4919);
      player0.getStrength();
      player1.gangStrength();
      boolean boolean0 = player0.isJoinOK(player1, true);
      assertEquals(0L, player1.getTimeOfDeath());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.7709738809556868
  */
  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Player player0 = new Player(0, "", "", 0);
      player0.isConnected();
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)79;
      byteArray0[1] = (byte)0;
      Player player1 = new Player(11);
      player0.remove(player1);
      byteArray0[2] = (byte) (-125);
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte)0;
      player0.setZ((byte) (-125));
      player0.setDead((long) (byte)0, false);
      byteArray0[6] = (byte)0;
      player0.unpack(byteArray0);
      player1.remove(player0);
      player0.setX(607.3529F);
      player0.pack();
      player0.gangStrength();
      player0.setJoinOK(player1, true);
      player1.setConnected(true);
      player0.getZ();
      System.setCurrentTimeMillis((byte)0);
      boolean boolean0 = player0.isJoinOK(player1, true);
      assertTrue(player0.isDead());
      assertTrue(boolean0);
  }
}
