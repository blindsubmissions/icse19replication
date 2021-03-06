/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 12:02:59 GMT 2018
 */

package state;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
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
      Player player0 = new Player((-1187));
      player0.setZ(0.0F);
      player0.id = (-1187);
      player0.setY(0.0F);
      long long0 = player0.getTimeOfDeath();
      assertEquals(0.0F, player0.getZ(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, long0);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0, player0.getPictureId());
      assertEquals(1, player0.getStrength());
      assertEquals("0.0.0.0", player0.getIP());
      assertTrue(player0.isConnected());
      assertEquals("Player-1187", player0.toString());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Player player0 = new Player();
      Player player1 = new Player(0);
      player1.next = (Party) player0;
      player0.setJoinOK(player1, true);
      player1.setDead();
      player0.boss = (Party) player1;
      player0.setDead(0L);
      Player player2 = null;
      // Undeclared exception!
      try { 
        player0.setJoinOK((Player) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("state.Player", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Player player0 = new Player();
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)10;
      byteArray0[1] = (byte)61;
      byteArray0[2] = (byte) (-67);
      player0.unpack(byteArray0);
      // Undeclared exception!
      try { 
        player0.pack((DataOutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("state.Player", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Player player0 = new Player((-1322));
      int int0 = player0.getPictureId();
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0, int0);
      assertEquals(1, player0.getStrength());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals("0.0.0.0", player0.getIP());
      assertTrue(player0.isConnected());
      assertEquals("Player-1322", player0.getName());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Player player0 = new Player(0, ";{T3]o\"7)", ";{T3]o\"7)", 0);
      Player player1 = new Player((-666), ";{T3]o\"7)", (-1742));
      player0.head = (Party) player1;
      player0.setX(0.0F);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-103);
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte) (-67);
      byteArray0[1] = (byte)102;
      byteArray0[4] = (byte)0;
      try { 
        pipedOutputStream0.write(byteArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Player player0 = new Player((-172), "5P`wtp'", (-635));
      Player player1 = new Player(4, "state.Player$JoinInfo", "5P`wtp'", (-172), 4);
      player0.isJoinOK(player1, false);
      player1.prev = (Party) player0;
      player1.setDead(3551L, false);
      player0.next = player1.prev;
      assertEquals(3551L, player1.getTimeOfDeath());
      
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("state.Player$JoinInfo", false);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      player0.pack(dataOutputStream0);
      int int0 = player0.type();
      assertEquals(5, int0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Player player0 = new Player(2680);
      Party party0 = player0.prev;
      player0.prev = null;
      player0.prev = null;
      player0.getSubparty();
      long long0 = player0.getTimeOfDeath();
      assertEquals(0L, long0);
      
      String string0 = player0.getName();
      assertEquals("0.0.0.0", player0.getIP());
      assertTrue(player0.isConnected());
      assertEquals("Player2680", string0);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0, player0.getPictureId());
      assertEquals(1, player0.getStrength());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Player player0 = new Player((-172), "5P`wtp'", (-635));
      Player player1 = new Player(4, "sKtae.Player$JoinIfo", "5P`wtp'", (-172), 4);
      player0.isJoinOK(player1, false);
      player1.prev = (Party) player0;
      player1.setDead(3551L, false);
      player0.next = player1.prev;
      player0.setMoney((short)4919);
      player0.next.getSubparty();
      player1.getTimeOfDeath();
      player1.setY(0.0F);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      player0.isDead();
      player0.setDead(3685L);
      assertEquals(4919.0F, player0.getMoney(), 0.01F);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      long long0 = 855L;
      System.setCurrentTimeMillis(855L);
      System.setCurrentTimeMillis((-850L));
      Player player0 = new Player(235);
      int int0 = (-624);
      Player player1 = new Player((-624), (String) null, (String) null, 3594);
      boolean boolean0 = false;
      FileSystemHandling fileSystemHandling1 = new FileSystemHandling();
      // Undeclared exception!
      try { 
        player1.pack();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = "_}~hT\\";
      Player player0 = new Player(1676, "_}~hT", "_}~hT", 1676, 1676);
      player0.getSubparty();
      player0.getSubparty();
      Player player1 = new Player();
      player0.head = (Party) player1;
      player0.setConnected(true);
      player0.setConnected(false);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "_}~hT");
      player0.getStrength();
      player0.setY(1676);
      player0.getX();
      // Undeclared exception!
      try { 
        player0.setJoinOK((Player) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("state.Player", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Player player0 = new Player(0, "?c0Fbagve:XY@0VVD:", 0);
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)2;
      byteArray0[1] = (byte)91;
      byteArray0[2] = (byte)5;
      byteArray0[3] = (byte)38;
      byteArray0[4] = (byte)4;
      byteArray0[5] = (byte)4;
      byteArray0[6] = (byte)0;
      player0.unpack(byteArray0);
      player0.getSubparty();
      player0.setDead();
      assertEquals(1392409281320L, player0.getTimeOfDeath());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Player player0 = new Player((-894), "", 1119);
      player0.setX(1.0F);
      player0.add((Party) null);
      long long0 = 0L;
      player0.setDead(0L);
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      ObjectInputStream objectInputStream0 = null;
      try {
        objectInputStream0 = new ObjectInputStream(mockFileInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Player player0 = new Player((-3619), "Gj_#OE:_NLz7{=", "Gj_#OE:_NLz7{=", 10);
      player0.reset(true);
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, player0.getMoney(), 0.01F);
      assertTrue(player0.isConnected());
      assertFalse(player0.isDead());
      assertEquals(10, player0.getPictureId());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Player player0 = new Player(0, "o9yN^qr[g;>7'eT&", "o9yN^qr[g;>7'eT&", (-1), (-2588));
      player0.getIP();
      assertEquals((-1), player0.getPictureId());
      assertEquals((-2588), player0.getStrength());
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertTrue(player0.isConnected());
      assertFalse(player0.isDead());
      assertEquals(0.0F, player0.getY(), 0.01F);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Player player0 = new Player();
      assertTrue(player0.isConnected());
      
      player0.setConnected(false);
      float float0 = player0.getY();
      assertFalse(player0.isConnected());
      assertEquals(0.0F, float0, 0.01F);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Player player0 = new Player();
      player0.setY(10.0F);
      player0.setMoney(0.2F);
      player0.setZ(0.2F);
      player0.gangStrength();
      player0.reset(true);
      player0.setDead((long) 1, true);
      player0.getMoney();
      player0.gangStrength();
      Player player1 = new Player((short)4919, "gui.ModuleBrowserDialog$ModuleFilter", 1);
      player1.head = (Party) player0;
      player0.isJoinOK(player1, true);
      player0.setDead((-1138L), false);
      assertEquals(0.2F, player0.getZ(), 0.01F);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Player player0 = new Player(4, (String) null, 0);
      assertEquals(0, player0.getPictureId());
      
      Player player1 = new Player();
      float float0 = player1.getZ();
      assertEquals(0, player1.getPictureId());
      assertTrue(player1.isConnected());
      assertEquals(0.0F, float0, 0.01F);
      assertEquals("0.0.0.0", player1.getIP());
      assertEquals(0.0F, player1.getY(), 0.01F);
      assertEquals("Player-1", player1.getName());
      assertEquals(1, player1.getStrength());
      assertFalse(player1.isDead());
      assertEquals(10.0F, player1.getX(), 0.01F);
      assertEquals(0L, player1.getTimeOfDeath());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      System.setCurrentTimeMillis(0L);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "h$");
      Player player0 = new Player();
      Player player1 = new Player((short)4919);
      byte[] byteArray0 = player1.pack();
      player1.unpack(byteArray0);
      player0.setJoinOK(player1, false);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "");
      player0.isJoinOK(player1, false);
      player0.setJoinOK(player1, true);
      FileSystemHandling.shouldAllThrowIOExceptions();
      player1.boss = (Party) player0;
      player1.isJoinOK(player0, true);
      player0.isJoinOK(player1, true);
      player1.gangStrength();
      Player player2 = new Player(8);
      player2.head = player1.boss;
      player1.boss.remove(player2.head);
      player1.setZ(0.0F);
      player1.isJoinOK(player2, true);
      System.setCurrentTimeMillis(0L);
      player1.isJoinOK(player0, true);
      player2.head.boss = (Party) player1;
      player2.isJoinOK(player1, true);
      player0.isJoinOK(player1, false);
      player1.isJoinOK(player2, true);
      boolean boolean0 = player1.isJoinOK(player2, false);
      assertEquals(55, player1.getId());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      System.setCurrentTimeMillis(0L);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "d}|y\neek.>#J#Pr<");
      Player player0 = new Player();
      Player player1 = new Player((short)4919);
      player1.pack();
      player0.setMoney(1.0F);
      player1.setJoinOK(player0, false);
      Player player2 = new Player();
      player2.isJoinOK(player0, false);
      player0.setJoinOK(player1, false);
      FileSystemHandling.shouldAllThrowIOExceptions();
      player2.setX((-757L));
      player0.setDead(8L, false);
      player1.setMoney(0.0F);
      player2.getSubparty();
      player1.getTimeOfDeath();
      player0.setY(1.0F);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      player0.isDead();
      System.setCurrentTimeMillis(0L);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Player player0 = new Player((-172), "5P`wtp'", (-635));
      Player player1 = new Player(4, "sKtae.Player$JoinIfo", "5P`wtp'", (-172), 4);
      player1.isConnected();
      player0.isJoinOK(player1, false);
      player1.isJoinOK(player0, true);
      int int0 = player0.gangStrength();
      assertEquals(1, int0);
      
      Player player2 = new Player();
      player2.remove(player0);
      player0.isJoinOK(player2, true);
      System.setCurrentTimeMillis((short)4919);
      Player player3 = new Player((short)4919, "5P`wtp'", "5P`wtp'", (-635), (-5198));
      player3.isJoinOK(player1, true);
      player1.isJoinOK(player3, false);
      assertEquals((-5198), player3.getStrength());
      
      player1.isJoinOK(player0, true);
      player0.isJoinOK(player1, false);
      boolean boolean0 = player1.isJoinOK(player2, false);
      assertEquals(10.0F, player2.getX(), 0.01F);
      assertFalse(player2.isDead());
      assertEquals(0.0F, player2.getY(), 0.01F);
      assertEquals(0L, player2.getTimeOfDeath());
      assertEquals(0, player2.getPictureId());
      assertFalse(boolean0);
      assertEquals((-172), player1.getPictureId());
      assertEquals("Player-1", player2.toString());
      assertEquals("0.0.0.0", player2.getIP());
      assertEquals("sKtae.Player$JoinIfo", player1.getIP());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Player player0 = new Player((-172), "gui.ModuleBrowserDialog$ModuleFilter", (-172));
      Player player1 = new Player(1259, "Ni&72", "gui.ModuleBrowserDialog$ModuleFilter", (-172), (short)4919);
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, false, true);
      player1.isJoinOK(player0, true);
      boolean boolean0 = player1.isJoinOK(player0, true);
      assertEquals(1, player0.getStrength());
      assertFalse(boolean0);
      assertEquals("0.0.0.0", player0.getIP());
      
      player1.toString();
      assertEquals(0L, player1.getTimeOfDeath());
      assertFalse(player1.isDead());
      assertEquals(4919, player1.getStrength());
      assertEquals(0.0F, player1.getY(), 0.01F);
      assertEquals(10.0F, player1.getX(), 0.01F);
      assertTrue(player1.isConnected());
      assertEquals("Ni&72", player1.getIP());
      assertEquals((-172), player1.getPictureId());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      System.setCurrentTimeMillis(0L);
      Player player0 = new Player();
      Player player1 = new Player((short)4919);
      player1.pack();
      player0.setJoinOK(player1, false);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "");
      player0.isJoinOK(player1, false);
      player1.setJoinOK(player0, true);
      FileSystemHandling.shouldAllThrowIOExceptions();
      player0.isJoinOK(player1, false);
      boolean boolean0 = player0.isJoinOK(player1, false);
      player0.gangStrength();
      FileSystemHandling.shouldAllThrowIOExceptions();
      player1.isJoinOK(player0, false);
      Player player2 = new Player();
      player0.isJoinOK(player2, true);
      int int0 = player1.gangStrength();
      assertEquals(1, int0);
      
      Player player3 = new Player(16882);
      player0.remove(player1);
      player3.isJoinOK(player1, false);
      System.setCurrentTimeMillis(16882);
      Player player4 = new Player();
      player2.add(player0);
      boolean boolean1 = player0.isJoinOK(player1, false);
      assertFalse(boolean1 == boolean0);
      
      player4.isJoinOK(player0, false);
      player3.isJoinOK(player1, true);
      player4.isJoinOK(player3, false);
      boolean boolean2 = player4.isJoinOK(player2, false);
      assertFalse(player2.isDead());
      assertEquals(10.0F, player2.getX(), 0.01F);
      assertEquals(0L, player2.getTimeOfDeath());
      assertEquals(0.0F, player2.getY(), 0.01F);
      assertTrue(player2.isConnected());
      assertEquals("Player-1", player2.toString());
      assertFalse(boolean2);
  }
}
