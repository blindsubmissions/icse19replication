/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 04:37:39 GMT 2018
 */

package state;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.PipedInputStream;
import java.io.PrintStream;
import java.io.SequenceInputStream;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.junit.runner.RunWith;
import state.Packable;
import state.Player;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Player_ESTest extends Player_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Player player0 = new Player(5);
      player0.setDead(0L);
      player0.getMoney();
      assertEquals(0.0F, player0.getY(), 0.01F);
      
      player0.setY(1.0F);
      assertEquals(1, player0.getStrength());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Player player0 = new Player(0, "", "NS~# aVtX0 }tJ:v", (-848));
      player0.getSubparty();
      player0.setX(2370.543F);
      player0.setConnected(true);
      float float0 = player0.getY();
      assertEquals(2370.543F, player0.getX(), 0.01F);
      assertEquals(0.0F, float0, 0.01F);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = 1700;
      String string0 = "Player";
      int int1 = 4;
      Player player0 = new Player(1700, "Player", 4);
      player0.setDead();
      player0.getSubparty();
      player0.type();
      player0.getName();
      player0.setDead((long) 4);
      boolean boolean0 = false;
      // Undeclared exception!
      try { 
        player0.isJoinOK((Player) null, false);
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
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Player player0 = new Player(0);
      Player player1 = new Player((short)4919);
      player0.add(player1);
      player0.getStrength();
      player0.gangStrength();
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-126);
      byteArray0[1] = (byte)59;
      byteArray0[2] = (byte)5;
      player0.getMoney();
      player0.getY();
      player1.getZ();
      PipedInputStream pipedInputStream0 = null;
      try {
        pipedInputStream0 = new PipedInputStream((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Pipe Size <= 0
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Player player0 = new Player(1003);
      boolean boolean0 = true;
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)62;
      byteArray0[1] = (byte)2;
      byteArray0[2] = (byte)3;
      byteArray0[3] = (byte)82;
      byteArray0[4] = (byte)10;
      player0.unpack(byteArray0);
      Player player1 = new Player((short)4919);
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
      String string0 = "}sm\\~3j$7}t";
      MockPrintStream mockPrintStream0 = null;
      try {
        mockPrintStream0 = new MockPrintStream(mockFile0, "}sm~3j$7}t");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(Throwable e) {
         //
         // }sm~3j$7}t
         //
         verifyException("java.io.PrintStream", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.7480673485460891
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Player player0 = new Player(1003);
      Player player1 = new Player((short)4919);
      player0.setJoinOK(player1, true);
      player0.isJoinOK(player1, true);
      player1.setDead();
      player1.isJoinOK(player0, true);
      player0.isJoinOK(player1, true);
      System.setCurrentTimeMillis(1277L);
      System.setCurrentTimeMillis((-343L));
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Player player0 = new Player(1700);
      String string0 = player0.getIP();
      assertEquals(1, player0.getStrength());
      assertFalse(player0.isDead());
      assertEquals(0, player0.getPictureId());
      assertEquals("0.0.0.0", string0);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals("Player1700", player0.toString());
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Player player0 = new Player(235);
      player0.toString();
      player0.setDead((-2018L));
      assertEquals((-2018L), player0.getTimeOfDeath());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Player player0 = new Player(1003);
      Player player1 = new Player();
      boolean boolean0 = player0.isConnected();
      boolean boolean1 = player1.isJoinOK(player0, true);
      assertEquals(1, player1.getStrength());
      assertFalse(player1.isDead());
      assertEquals(10.0F, player1.getX(), 0.01F);
      assertEquals(0L, player1.getTimeOfDeath());
      assertEquals(0.0F, player1.getY(), 0.01F);
      assertFalse(boolean1 == boolean0);
      assertEquals(0, player1.getPictureId());
      assertEquals("Player-1", player1.toString());
      assertEquals("0.0.0.0", player1.getIP());
      assertFalse(boolean1);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int int0 = 1003;
      Player player0 = new Player(1003);
      int int1 = 2;
      Player player1 = null;
      player0.isDead();
      // Undeclared exception!
      try { 
        player0.isJoinOK((Player) null, false);
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
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Player player0 = new Player((-2216));
      int int0 = player0.type();
      assertEquals(5, int0);
      
      player0.reset(true);
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertTrue(player0.isConnected());
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
      assertEquals("Player-2216", player0.getName());
      assertEquals(0.0F, player0.getMoney(), 0.01F);
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(0, player0.getPictureId());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Player player0 = new Player(1003);
      player0.setY(0.1F);
      Player player1 = new Player(512);
      boolean boolean0 = player0.isJoinOK(player1, true);
      assertEquals(0.1F, player0.getY(), 0.01F);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Player player0 = new Player((-423));
      int int0 = Packable.GAME_STATE;
      player0.setDead();
      player0.isDead();
      player0.isDead();
      player0.setY(4);
      player0.setDead();
      MockFile mockFile0 = new MockFile("");
      mockFile0.setReadable(true);
      MockFileOutputStream mockFileOutputStream0 = null;
      try {
        mockFileOutputStream0 = new MockFileOutputStream(mockFile0, true);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Player player0 = new Player(4153, "nM] ++fHGs", 4153);
      player0.pack();
      MockFileInputStream mockFileInputStream0 = null;
      try {
        mockFileInputStream0 = new MockFileInputStream("nM] ++fHGs");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Player player0 = new Player(5);
      Player player1 = new Player(1);
      player0.setJoinOK(player1, true);
      player0.setY((-1209.5F));
      player0.setDead((-1113L), true);
      player0.setY(4919);
      long long0 = player0.getTimeOfDeath();
      assertEquals(4919.0F, player0.getY(), 0.01F);
      assertEquals((-1113L), long0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Player player0 = new Player();
      player0.toString();
      player0.setZ((-339.3F));
      player0.setX(0.0F);
      player0.setMoney(0.0F);
      int int0 = player0.getPictureId();
      assertEquals((-339.3F), player0.getZ(), 0.01F);
      assertEquals(0, int0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Player player0 = new Player();
      player0.reset(false);
      Player player1 = new Player((short)4919);
      boolean boolean0 = player0.isJoinOK(player1, true);
      assertEquals("0.0.0.0", player1.getIP());
      assertTrue(player1.isConnected());
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(0.0F, player1.getY(), 0.01F);
      assertEquals(0, player1.getPictureId());
      assertEquals(1, player1.getStrength());
      assertEquals("Player4919", player1.getName());
      assertEquals(10.0F, player1.getX(), 0.01F);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Player player0 = new Player((-1128), (String) null, (String) null, 0, (-1128));
      float float0 = player0.getX();
      assertEquals((-1128), player0.getStrength());
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertTrue(player0.isConnected());
      assertEquals(0, player0.getPictureId());
      assertFalse(player0.isDead());
      assertEquals(10.0F, float0, 0.01F);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Player player0 = new Player(512);
      player0.setDead((-2400L));
      player0.reset(true);
      Player player1 = new Player((short)4919);
      player0.isJoinOK(player1, false);
      byte[] byteArray0 = player0.pack();
      player1.getSubparty();
      player1.unpack(byteArray0);
      player0.id = 512;
      player1.isJoinOK(player0, true);
      boolean boolean0 = player1.isJoinOK(player0, false);
      assertEquals("Player512", player1.toString());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Player player0 = new Player(1003);
      player0.setJoinOK(player0, false);
      player0.isJoinOK(player0, true);
      System.setCurrentTimeMillis(1075L);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Player player0 = new Player(1003);
      Player player1 = new Player(1003, "", "tn9)!PimW-FJcL", 1003, 2688);
      player1.setConnected(true);
      player0.isJoinOK(player1, false);
      player1.isJoinOK(player0, false);
      player0.setJoinOK(player1, false);
      player1.setX(2762.6382F);
      player1.isJoinOK(player0, false);
      System.setCurrentTimeMillis(1392409296320L);
      Player player2 = new Player();
      player2.isJoinOK(player0, true);
      player1.isJoinOK(player0, true);
      boolean boolean0 = player0.isJoinOK(player1, false);
      assertEquals(2762.6382F, player1.getX(), 0.01F);
      assertFalse(boolean0);
  }
}