/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 13:37:30 GMT 2018
 */

package state;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;
import state.Party;
import state.Player;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Player_ESTest extends Player_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Player player0 = new Player(833, "", 659);
      Enumeration<SequenceInputStream> enumeration0 = (Enumeration<SequenceInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      Player player1 = new Player(1220, "", "", 833);
      player0.setJoinOK(player1, false);
      player0.setDead(1L, false);
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte) (-1);
      player0.unpack(byteArray0);
      byte[] byteArray1 = new byte[2];
      player0.setZ(833);
      byteArray1[0] = (byte)0;
      byteArray1[1] = (byte) (-57);
      sequenceInputStream0.read(byteArray1);
      DataInputStream dataInputStream0 = new DataInputStream(sequenceInputStream0);
      try { 
        dataInputStream0.readByte();
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Player player0 = new Player(0);
      player0.getSubparty();
      player0.setX(0.0F);
      player0.gangStrength();
      player0.head = null;
      player0.getTimeOfDeath();
      player0.type();
      player0.isDead();
      player0.setX((-520.361F));
      player0.getPictureId();
      player0.gangStrength();
      player0.getX();
      player0.getName();
      player0.setZ(2311.743F);
      Player player1 = new Player(5, "state.Player$JoinInfo", "", (short)4919, 0);
      MockPrintStream mockPrintStream0 = null;
      try {
        mockPrintStream0 = new MockPrintStream("");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = 1676;
      Player player0 = new Player(1676, "_}~hT", "_}~hT", 1676, 1676);
      player0.getSubparty();
      player0.getSubparty();
      player0.pack();
      Player player1 = new Player();
      player0.head = (Party) player1;
      player0.setConnected(true);
      player0.setConnected(false);
      boolean boolean0 = false;
      player0.setDead(0L, false);
      player0.getStrength();
      player0.setY(1676);
      player0.getX();
      Player player2 = null;
      boolean boolean1 = true;
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
  //Test case number: 3
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Player player0 = new Player((-4605));
      player0.setDead((long) (-4605), true);
      player0.setDead();
      player0.getPictureId();
      player0.setMoney(2088.0F);
      player0.getX();
      Player player1 = new Player(0, "x2X7W[+ZfK", "x2X7W[+ZfK", 5);
      player1.setY(10.0F);
      player0.setJoinOK(player1, true);
      player0.reset(true);
      assertEquals(0L, player0.getTimeOfDeath());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Player player0 = new Player();
      assertTrue(player0.isConnected());
      
      player0.setConnected(false);
      float float0 = player0.getY();
      assertFalse(player0.isConnected());
      assertEquals(0.0F, float0, 0.01F);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Player player0 = new Player();
      player0.setY(10.0F);
      player0.setMoney(0.0F);
      player0.setZ(0.0F);
      player0.gangStrength();
      player0.reset(true);
      player0.getMoney();
      player0.gangStrength();
      player0.getX();
      Player player1 = new Player((short)4919, "gui.ModuleBrowserDialog$ModuleFilter", 1);
      player1.head = (Party) player0;
      player1.getSubparty();
      player1.setMoney(1);
      player0.isJoinOK(player1, true);
      assertEquals(10.0F, player0.getY(), 0.01F);
      
      player1.setX(1302.1F);
      assertEquals(1302.1F, player1.getX(), 0.01F);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Player player0 = new Player(1199);
      player0.getMoney();
      player0.setX(0.0F);
      player0.setDead();
      byte[] byteArray0 = new byte[1];
      player0.setDead(0L);
      byteArray0[0] = (byte)0;
      player0.unpack(byteArray0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream((byte)0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
      dataOutputStream0.close();
      dataOutputStream0.writeBoolean(false);
      Party party0 = new Party(1199);
      player0.remove(party0);
      dataOutputStream0.writeFloat(0L);
      dataOutputStream0.writeShort(2);
      player0.pack(dataOutputStream0);
      player0.setMoney(4206.6F);
      player0.pack(dataOutputStream0);
      player0.setY(0.0F);
      player0.setY(10.0F);
      player0.setDead();
      player0.unpack(byteArray0);
      player0.getZ();
      player0.unpack(byteArray0);
      player0.unpack(byteArray0);
      player0.setMoney(0.0F);
      player0.reset(false);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 1382, 1199);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      boolean boolean0 = player0.unpack(dataInputStream0);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Player player0 = new Player();
      player0.setDead();
      player0.getPictureId();
      byte[] byteArray0 = player0.pack();
      player0.setMoney((-1526.994F));
      player0.getZ();
      player0.unpack(byteArray0);
      assertEquals((-1526.994F), player0.getMoney(), 0.01F);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.8133554045006157
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Player player0 = new Player((-2488), "aEIv]ekp^W(", "aEIv]ekp^W(", (-2488));
      byte[] byteArray0 = new byte[1];
      player0.setConnected(false);
      byteArray0[0] = (byte)4;
      player0.unpack(byteArray0);
      player0.setZ(2275);
      player0.getSubparty();
      player0.reset(false);
      Player player1 = new Player((-2488), "aEIv]ekp^W(", (String) null, 2275, (-1812));
      player0.remove(player1);
      player0.setConnected(true);
      player0.isDead();
      player1.isDead();
      player0.setDead();
      player0.getX();
      player1.getIP();
      player0.isDead();
      player1.getIP();
      player1.id = (-2488);
      player1.getZ();
      player1.setDead((long) (short)4919, false);
      player0.getMoney();
      player0.getX();
      player1.setDead((long) (-1812));
      assertEquals((-1812L), player1.getTimeOfDeath());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Player player0 = new Player(0, "", 0);
      player0.setZ(0);
      player0.setMoney(0);
      Player player1 = new Player();
      player0.remove(player1);
      player0.id = (int) (short)4919;
      player0.setDead((long) 0, true);
      float float0 = player0.getY();
      assertEquals(0.0F, float0, 0.01F);
      
      player0.setMoney(0.0F);
      player0.getTimeOfDeath();
      boolean boolean0 = player0.isConnected();
      assertEquals(0.0F, player0.getMoney(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(0, player0.getPictureId());
      assertEquals(0.0F, player0.getZ(), 0.01F);
      assertTrue(boolean0);
      
      String string0 = player1.getName();
      assertEquals("Player-1", string0);
      
      player1.reset(false);
      assertEquals("0.0.0.0", player1.getIP());
      assertFalse(player1.isDead());
      assertEquals(0, player1.getPictureId());
      assertEquals(1, player1.getStrength());
      assertEquals(0L, player1.getTimeOfDeath());
      assertEquals(10.0F, player1.getX(), 0.01F);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Player player0 = new Player();
      long long0 = player0.getTimeOfDeath();
      assertEquals(0L, long0);
      
      String string0 = player0.toString();
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals("Player-1", string0);
      assertEquals(0, player0.getPictureId());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.3693821196946767
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Player player0 = new Player(165, "~j$t;(40E e`!IV", "]?{{a&X$mV", 2313, 4897);
      Player player1 = new Player(2313);
      player0.isJoinOK(player1, false);
      player0.setDead(0L, false);
      player0.setJoinOK(player1, false);
      player0.isJoinOK(player1, false);
      Player player2 = new Player();
      player1.setMoney(1.0F);
      player2.getY();
      Player player3 = new Player((short)4919, "T1yO:k49DQ8{E", "]?{{a&X$mV", 1372);
      Player player4 = new Player(4897);
      player3.isJoinOK(player1, false);
      player1.isJoinOK(player4, true);
      assertEquals(1.0F, player1.getMoney(), 0.01F);
      
      player4.isJoinOK(player3, false);
      boolean boolean0 = player0.isJoinOK(player3, false);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.242973226438147
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Player player0 = new Player(165, "~j$t;(40E e`!IV", "]?{{a&X$mV", 2313, 4897);
      Player player1 = new Player(2313);
      player0.isJoinOK(player1, false);
      player1.setDead(1392409296320L, true);
      player1.setJoinOK(player0, true);
      player1.isJoinOK(player0, false);
      Player player2 = new Player();
      player0.setMoney((-2986.6436F));
      Player player3 = new Player((-2181), "]?{{a&X$mV", "L~;VB&", (short)4919, 165);
      player3.getY();
      Player player4 = new Player(2313, "]?{{a&X$mV", (String) null, (-2181));
      Player player5 = new Player(165);
      player3.isJoinOK(player1, false);
      player0.isJoinOK(player1, true);
      player3.isJoinOK(player1, false);
      assertEquals(1392409296320L, player1.getTimeOfDeath());
      
      player3.isJoinOK(player5, true);
      assertEquals("Player165", player5.getName());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.8310204811135165
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Player player0 = new Player(165, "~j$t;(40E e`!IV", "]?{{a&X$mV", 2313, 4897);
      Player player1 = new Player(2313);
      player0.setJoinOK(player1, true);
      player1.isJoinOK(player0, false);
      player1.prev = (Party) player0;
      Player player2 = new Player(2147340491, "]?{{a&X$mV", "", 2147340491, 2621);
      player2.isJoinOK(player0, false);
      player1.isJoinOK(player0, false);
      System.setCurrentTimeMillis((short)4919);
      System.setCurrentTimeMillis(1392409296320L);
      player0.isJoinOK(player1, false);
      player1.isJoinOK(player2, true);
      System.setCurrentTimeMillis(1392409296320L);
  }
}
