/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 17:16:26 GMT 2018
 */

package state;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FilterOutputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
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
      int int0 = (-7);
      Player player0 = new Player((-7), "y!</}", "y!</}", 442);
      player0.id = 0;
      player0.gangStrength();
      player0.setDead();
      player0.setDead();
      player0.setY(4034.629F);
      player0.setMoney(4034.629F);
      boolean boolean0 = true;
      // Undeclared exception!
      try { 
        MockFile.createTempFile("", "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Prefix string too short
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Player player0 = new Player((-4019), "state.Party", "#QtS5V=n@3O", 0, 0);
      player0.setDead((-1L));
      player0.setDead();
      player0.setDead((-836L));
      Player player1 = new Player((-650), "state.Party", "state.Party", (-664), (short)4919);
      player0.prev = (Party) player1;
      player0.type();
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-4);
      byteArray0[2] = (byte)1;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)1;
      player0.gangStrength();
      byteArray0[5] = (byte)44;
      player0.unpack(byteArray0);
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
  //Test case number: 2
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Player player0 = new Player(1452);
      player0.setMoney(1452);
      player0.id = (-228);
      player0.isDead();
      int int0 = player0.type();
      assertEquals(1452.0F, player0.getMoney(), 0.01F);
      assertEquals(5, int0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Player player0 = new Player(3);
      String string0 = player0.getName();
      assertEquals("Player3", string0);
      
      float float0 = player0.getMoney();
      assertEquals(0.0F, float0, 0.01F);
      
      float float1 = player0.getZ();
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(float1, float0, 0.01F);
      assertEquals(1, player0.getStrength());
      assertEquals(0L, player0.getTimeOfDeath());
      assertTrue(player0.isConnected());
      assertEquals(0.0F, float1, 0.01F);
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(0, player0.getPictureId());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Player player0 = new Player(0);
      player0.id = 0;
      player0.setDead((long) 0, false);
      player0.getY();
      Party party0 = new Party((short)4919);
      player0.head = party0;
      party0.boss = player0.head;
      player0.setDead((-570L));
      party0.head = (Party) player0;
      assertEquals((-570L), player0.getTimeOfDeath());
      
      player0.setDead((long) 0);
      player0.pack();
      player0.setDead(0L);
      party0.add(player0);
      Player player1 = (Player)player0.prev;
      player0.head.add(player1);
      party0.id = 0;
      player0.isConnected();
      player0.type();
      int int0 = player0.getStrength();
      assertEquals(1, int0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Player player0 = new Player(0, ":Sz]}G[/", "['_Q~_qEq='h7", 0);
      player0.setDead(0L, true);
      player0.reset(false);
      Player player1 = new Player(0);
      player0.gangStrength();
      player0.boss = (Party) player1;
      player0.pack();
      player0.setY((-1.0F));
      player0.getTimeOfDeath();
      player0.setDead(2038L, false);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(byteArrayOutputStream0, true);
      FilterOutputStream filterOutputStream0 = new FilterOutputStream(mockPrintStream0);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(filterOutputStream0);
      mockPrintStream0.write(0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(bufferedOutputStream0);
      dataOutputStream0.writeBytes("['_Q~_qEq='h7");
      player1.pack(dataOutputStream0);
      player0.setDead();
      player0.setZ((-1.0F));
      assertTrue(player0.isDead());
      
      boolean boolean0 = player1.isConnected();
      assertTrue(boolean0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Player player0 = new Player();
      Player player1 = new Player((short)4919, "Player.unpack(): *** WARNING *** [IO] failed to unpack data: ", "Player.unpack(): *** WARNING *** [IO] failed to unpack data: ", (short)4919);
      player1.setX(0.2F);
      player1.add(player0);
      // Undeclared exception!
      try { 
        player1.unpack((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Player player0 = new Player((-1), "0.0.0.0", (-1));
      player0.id = 2;
      player0.setDead();
      player0.reset(false);
      player0.isDead();
      player0.type();
      player0.gangStrength();
      player0.reset(true);
      Player player1 = new Player(2, "C]MVT'P8P", "6QADwY8^aNt=#", 535);
      player1.add(player0);
      player1.gangStrength();
      player0.setJoinOK(player1, false);
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)64;
      byteArray0[2] = (byte)2;
      byteArray0[3] = (byte)127;
      player0.unpack(byteArray0);
      assertEquals(0L, player0.getTimeOfDeath());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int int0 = (-1071);
      Player player0 = new Player((-1071));
      Player player1 = new Player(166, "ipS`TWLL", "SSat4*;qQ", 57, 2250);
      player0.setJoinOK(player1, false);
      boolean boolean0 = true;
      player0.setConnected(true);
      boolean boolean1 = true;
      player0.setConnected(true);
      player0.setMoney((-1071));
      player0.setX((-1071));
      // Undeclared exception!
      try { 
        player0.unpack((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Player player0 = new Player(2863, "", (String) null, 2863, (-711));
      float float0 = player0.getX();
      assertEquals((-711), player0.getStrength());
      assertEquals(2863, player0.getPictureId());
      assertTrue(player0.isConnected());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, float0, 0.01F);
      assertFalse(player0.isDead());
      assertEquals(0L, player0.getTimeOfDeath());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Player player0 = new Player(160, "jA;YfJK X&|`;N~z&f", 160);
      player0.pack();
      player0.getIP();
      Party party0 = new Party((short)4919);
      player0.boss = party0;
      player0.setConnected(true);
      player0.getPictureId();
      party0.head = (Party) player0;
      party0.add(player0);
      player0.setZ(0.0F);
      player0.setConnected(false);
      party0.head = (Party) player0;
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      DataInputStream dataInputStream0 = new DataInputStream(sequenceInputStream0);
      player0.unpack(dataInputStream0);
      player0.setZ(0.0F);
      assertFalse(player0.isConnected());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Player player0 = new Player();
      Player player1 = new Player((short)4919, "I-GJ#9,t", "", (short)4919, (-615));
      player0.boss = (Party) player1;
      player0.setDead((long) 0, true);
      Party party0 = new Party(0);
      party0.boss = (Party) player0;
      player0.add(party0);
      player0.type();
      player0.setY(0.0F);
      player0.setDead((long) 0, true);
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-3);
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte) (-59);
      byteArray0[4] = (byte)103;
      byteArray0[5] = (byte)83;
      byteArray0[6] = (byte)0;
      player1.unpack(byteArray0);
      player1.type();
      player0.getZ();
      player0.setDead((long) 0);
      player1.gangStrength();
      boolean boolean0 = player1.isJoinOK(player0, false);
      assertTrue(player0.isDead());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Player player0 = new Player(275, "MQeR", 275);
      Player player1 = new Player();
      player1.add(player0);
      player0.setJoinOK(player1, true);
      Player player2 = new Player(0, "MQeR", "a##RAXx_%g{8Zq", 275);
      player1.boss = (Party) player2;
      player0.setZ(275);
      MockFile mockFile0 = new MockFile("a##RAXx_%g{8Zq");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      dataOutputStream0.writeShort(275);
      player2.pack(dataOutputStream0);
      player0.head = (Party) player1;
      player0.setZ(275);
      player0.getName();
      player1.id = 0;
      player1.setX(0.2F);
      player0.getStrength();
      player0.toString();
      player1.setConnected(true);
      player0.pack();
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)5;
      // Undeclared exception!
      try { 
        dataInputStream0.read(byteArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=3.0910424533583143
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Player player0 = new Player((-264), "", (-264));
      player0.reset(true);
      player0.getY();
      Player player1 = new Player();
      player0.setJoinOK(player1, true);
      player0.getX();
      byte[] byteArray0 = player0.pack();
      player0.setY(0.0F);
      player0.getPictureId();
      Player player2 = new Player((-264), "Player.unpack(): *** WARNING *** [EOF] data was incomplete: ", (-723));
      player0.boss = (Party) player2;
      player2.next = (Party) player0;
      player0.getMoney();
      player0.setDead();
      player2.pack();
      player0.unpack(byteArray0);
      player0.setMoney((-264));
      player0.getZ();
      player2.setDead();
      player2.setMoney(0.0F);
      player0.isJoinOK(player2, false);
      player0.type();
      assertEquals(1392409281320L, player0.getTimeOfDeath());
      
      Player player3 = new Player(0, "gui.ModuleBrowserDialog$ModuleFilter", 0);
      player1.setJoinOK(player3, false);
      assertEquals(10.0F, player1.getX(), 0.01F);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Player player0 = new Player((-1), "0.0.0.0", (-1));
      player0.id = 2;
      player0.setDead();
      player0.reset(false);
      player0.isDead();
      player0.type();
      player0.gangStrength();
      player0.reset(false);
      Player player1 = new Player(2, "C]MVT'P8P", "6QADwY8^aNt=#", 535);
      player1.add(player0);
      player1.setJoinOK(player0, true);
      player1.gangStrength();
      player0.setJoinOK(player1, false);
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)64;
      byteArray0[2] = (byte)2;
      boolean boolean0 = player0.isJoinOK(player1, false);
      assertEquals(0L, player0.getTimeOfDeath());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Player player0 = new Player(4919, "state.Player", "state.Player", (-3584));
      player0.setZ(1.0F);
      player0.setDead((long) (-3584));
      player0.isDead();
      Player player1 = new Player();
      boolean boolean0 = player0.isJoinOK(player1, false);
      assertEquals((-3584L), player0.getTimeOfDeath());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.7072697097848133
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Player player0 = new Player(258, "0.0.0.0", "0.0.0.0", 258, 258);
      player0.id = 2;
      player0.setDead();
      player0.reset(false);
      player0.isDead();
      player0.type();
      player0.gangStrength();
      player0.reset(false);
      Player player1 = new Player(2, "C]MVT'P8P", "6QADwY8^aNt=#", 535);
      player1.add(player0);
      player1.setJoinOK(player0, true);
      player1.gangStrength();
      player0.setJoinOK(player1, false);
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)0;
      player1.unpack(byteArray0);
      player1.setDead((long) 258);
      boolean boolean0 = player0.isJoinOK(player1, true);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.5400363038209806
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Player player0 = new Player((-1), "0.0.0.0", (-1));
      player0.id = 2;
      player0.setDead();
      player0.reset(false);
      player0.isBoss();
      player0.type();
      player0.gangStrength();
      player0.reset(false);
      Player player1 = new Player((-2678), "C]}VT,P8g", "mJv8jRpu<dU&,&\"t>", (-1));
      player1.add(player0);
      player1.setJoinOK(player0, true);
      player0.gangStrength();
      player1.setX(1);
      player0.setJoinOK(player1, true);
      player1.isJoinOK(player0, true);
      player0.isJoinOK(player1, true);
      System.setCurrentTimeMillis(1392409296320L);
      boolean boolean0 = player1.isJoinOK(player0, true);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(boolean0);
  }
}