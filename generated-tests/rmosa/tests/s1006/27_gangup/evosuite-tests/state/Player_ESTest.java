/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 07:44:35 GMT 2018
 */

package state;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
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
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Player player0 = new Player(0);
      player0.setMoney((-3401.4214F));
      MockPrintStream mockPrintStream0 = new MockPrintStream("Oh");
      mockPrintStream0.checkError();
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      player0.pack(dataOutputStream0);
      float float0 = player0.getX();
      assertEquals((-3401.4214F), player0.getMoney(), 0.01F);
      assertEquals(10.0F, float0, 0.01F);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Player player0 = new Player();
      player0.getSubparty();
      player0.pack();
      player0.boss = null;
      player0.getMoney();
      player0.setMoney(1.0F);
      assertEquals(1.0F, player0.getMoney(), 0.01F);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Player player0 = new Player((-2411), "Z6b=q=L=IL", (-2411));
      player0.reset(true);
      player0.setDead(1L);
      Player player1 = new Player(3010, "Z6b=q=L=IL", 483);
      player1.add(player0);
      player1.prev = (Party) player0;
      player0.isJoinOK(player1, false);
      player1.reset(false);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "Z6b=q=L=IL");
      player1.isJoinOK(player0, false);
      player1.isJoinOK(player0, false);
      System.setCurrentTimeMillis(2631L);
      System.setCurrentTimeMillis((-1833L));
      player0.isJoinOK(player1, true);
      boolean boolean0 = player0.isJoinOK(player1, true);
      assertEquals(1L, player0.getTimeOfDeath());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Player player0 = new Player(3444);
      String string0 = "C";
      int int0 = (-1316);
      player0.setY(487.8017F);
      byte[] byteArray0 = player0.pack();
      boolean boolean0 = false;
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("C");
      player0.remove(player0);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(mockFileOutputStream0);
      // Undeclared exception!
      try { 
        bufferedOutputStream0.write(byteArray0, (-1316), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.BufferedOutputStream", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Player player0 = new Player(0);
      Party party0 = player0.next;
      player0.prev = null;
      player0.setDead((long) 0);
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
  //Test case number: 5
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Player player0 = new Player(0);
      player0.getSubparty();
      Player player1 = new Player(5271, "Player.pack(): *** ERROR *** [IO] pack failed! current state is inconsistent: ", "Player.pack(): *** ERROR *** [IO] pack failed! current state is inconsistent: ", (-1));
      player0.setJoinOK(player1, true);
      assertFalse(player1.isDead());
      assertEquals(10.0F, player1.getX(), 0.01F);
      assertEquals(0L, player1.getTimeOfDeath());
      assertEquals(0, player0.getPictureId());
      assertEquals(0.0F, player1.getY(), 0.01F);
      assertEquals(1, player1.getStrength());
      assertEquals((-1), player1.getPictureId());
      assertEquals("Player0", player0.toString());
      assertTrue(player1.isConnected());
      assertEquals("0.0.0.0", player0.getIP());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Player player0 = new Player((-837));
      player0.setZ((-837));
      boolean boolean0 = true;
      player0.getSubparty();
      int int0 = 417;
      String string0 = "state.Party";
      int int1 = 4919;
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0);
      try { 
        bufferedInputStream0.reset();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Resetting to invalid mark
         //
         verifyException("java.io.BufferedInputStream", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Player player0 = new Player();
      long long0 = player0.getTimeOfDeath();
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertTrue(player0.isConnected());
      assertEquals(0L, long0);
      assertEquals(1, player0.getStrength());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals("Player-1", player0.toString());
      assertEquals(0, player0.getPictureId());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Player player0 = new Player();
      Player player1 = new Player();
      player0.isJoinOK(player1, true);
      player1.setY(0.1F);
      player1.getIP();
      player0.getY();
      Player player2 = new Player();
      player2.setDead((-1192L), true);
      assertEquals((-1192L), player2.getTimeOfDeath());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Player player0 = new Player(0);
      Party party0 = player0.gangBoss();
      player0.add(party0);
      float float0 = player0.getX();
      assertEquals(10.0F, float0, 0.01F);
      
      int int0 = player0.getStrength();
      assertTrue(player0.isConnected());
      assertEquals(0, player0.getPictureId());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals("Player0", player0.getName());
      assertEquals(1, int0);
      assertFalse(player0.isDead());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Player player0 = new Player();
      Player player1 = new Player(1, "a", (-103));
      assertEquals((-103), player1.getPictureId());
      
      player0.pack();
      boolean boolean0 = player0.isConnected();
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertTrue(boolean0);
      assertEquals(1, player0.getStrength());
      assertEquals(0, player0.getPictureId());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals("Player-1", player0.getName());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = "Player.unpack(): *** WARNING *** data is not of proper type!";
      int int0 = 2170;
      int int1 = 1;
      Player player0 = new Player(2170, "Player.unpack(): *** WARNING *** data is not of proper type!", "Player.unpack(): *** WARNING *** data is not of proper type!", 1);
      player0.reset(true);
      player0.add(player0);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "Player.unpack(): *** WARNING *** data is not of proper type!");
      // Undeclared exception!
      try { 
        player0.gangStrength();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Player player0 = new Player(2170, "KZ", "KZ", 1);
      player0.add((Party) null);
      player0.gangStrength();
      Player player1 = new Player((-1906), "state.Player", "Player.unpack(): *** WARNING *** data is not of proper type!", 1);
      int int0 = player1.gangStrength();
      assertEquals(1, int0);
      
      boolean boolean0 = player0.isJoinOK(player1, true);
      assertEquals(1, player1.getPictureId());
      assertEquals("state.Player", player1.getIP());
      assertEquals(0.0F, player1.getY(), 0.01F);
      assertFalse(boolean0);
      assertTrue(player1.isConnected());
      assertEquals(10.0F, player1.getX(), 0.01F);
      assertEquals(0L, player1.getTimeOfDeath());
      assertFalse(player1.isDead());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Player player0 = new Player();
      player0.type();
      Party party0 = new Party();
      party0.add(player0);
      party0.next = (Party) player0;
      player0.prev = party0;
      // Undeclared exception!
      try { 
        player0.gangStrength();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // state.Party cannot be cast to state.Player
         //
         verifyException("state.Player", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Player player0 = new Player(0);
      player0.id = 0;
      player0.add((Party) null);
      assertEquals(0L, player0.getTimeOfDeath());
      
      player0.setDead(1L, true);
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte) (-1);
      byteArray0[4] = (byte)0;
      player0.unpack(byteArray0);
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
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
  //Test case number: 16
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
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
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertTrue(player0.isConnected());
      assertEquals(0, player0.getPictureId());
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, player0.getMoney(), 0.01F);
      assertEquals("0.0.0.0", player0.getIP());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Player player0 = new Player();
      Player player1 = new Player();
      player0.isJoinOK(player1, false);
      player0.getZ();
      Player player2 = new Player((short)4919);
      int int0 = Packable.GAME_EVENT;
      assertEquals(3, int0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Player player0 = new Player(0);
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)98;
      byteArray0[1] = (byte) (-10);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      int int0 = player0.getPictureId();
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0, int0);
      
      player0.setDead((long) 0, true);
      player0.getX();
      float float0 = player0.getX();
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(10.0F, float0, 0.01F);
      assertTrue(player0.isConnected());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(1, player0.getStrength());
      assertEquals("Player0", player0.toString());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Player player0 = new Player((-270));
      player0.getIP();
      player0.setMoney(0.2F);
      player0.setX((-270));
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      String string0 = "";
      // Undeclared exception!
      try { 
        dataOutputStream0.writeShort((short)4919);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Player player0 = new Player((-1612), "EZxV%gZ}^Pd", (-1612));
      player0.setDead();
      player0.isDead();
      Player player1 = new Player((-838), "EZxV%gZ}^Pd", "", (-838), 1382);
      player1.reset(false);
      player0.head = (Party) player1;
      player1.setDead((long) (-1612));
      player0.reset(true);
      player0.getMoney();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-23);
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)2;
      byteArray0[4] = (byte)4;
      byteArray0[5] = (byte) (-46);
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte)10;
      pipedOutputStream0.write(byteArray0);
      byte[] byteArray1 = new byte[0];
      pipedOutputStream0.write(byteArray1);
      pipedOutputStream0.write(byteArray1);
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      player0.unpack(dataInputStream0);
      player0.reset(false);
      assertEquals(0L, player0.getTimeOfDeath());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Player player0 = new Player(1, "", 1);
      player0.setDead();
      player0.setDead(0L, true);
      player0.setDead((-1260L), true);
      boolean boolean0 = player0.isDead();
      assertEquals((-1260L), player0.getTimeOfDeath());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      System.setCurrentTimeMillis(18733L);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      System.setCurrentTimeMillis(18733L);
      Player player0 = new Player();
      Player player1 = new Player();
      player1.setJoinOK(player0, false);
      player0.setConnected(true);
      player0.isJoinOK(player1, false);
      player1.isJoinOK(player0, false);
      player1.isJoinOK(player0, true);
      System.setCurrentTimeMillis(0L);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      System.setCurrentTimeMillis(3733L);
      Player player0 = new Player();
      Player player1 = new Player();
      player1.setJoinOK(player0, false);
      byte[] byteArray0 = player1.pack();
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, true, true);
      player0.setConnected(false);
      player0.isJoinOK(player1, false);
      player1.setMoney((short)4919);
      player1.setConnected(true);
      player1.isJoinOK(player0, true);
      player1.remove(player0);
      System.setCurrentTimeMillis(33733L);
      player0.isJoinOK(player1, true);
      FileSystemHandling fileSystemHandling1 = new FileSystemHandling();
      player1.unpack(byteArray0);
      player0.isJoinOK(player1, true);
      Player player2 = new Player();
      Player player3 = new Player((-1), (String) null, 1338);
      player2.boss = (Party) player3;
      player1.isJoinOK(player2, false);
      System.setCurrentTimeMillis((short)4919);
  }
}