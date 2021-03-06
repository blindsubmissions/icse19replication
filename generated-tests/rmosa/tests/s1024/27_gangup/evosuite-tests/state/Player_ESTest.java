/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 16:20:30 GMT 2018
 */

package state;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
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
      Player player0 = new Player(0);
      player0.setDead((-5341L));
      boolean boolean0 = true;
      Player player1 = null;
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
  //Test case number: 1
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Player player0 = new Player(4);
      Player player1 = new Player((short)4919);
      player1.setConnected(true);
      boolean boolean0 = player0.isJoinOK(player1, true);
      assertFalse(boolean0);
      assertEquals(0, player1.getPictureId());
      assertEquals("Player4919", player1.getName());
      assertEquals("0.0.0.0", player1.getIP());
      assertFalse(player1.isDead());
      assertEquals(10.0F, player1.getX(), 0.01F);
      assertTrue(player1.isConnected());
      assertEquals(0L, player1.getTimeOfDeath());
      assertEquals(0.0F, player1.getY(), 0.01F);
      assertEquals(1, player1.getStrength());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Player player0 = new Player();
      float float0 = player0.getX();
      assertEquals(10.0F, float0, 0.01F);
      
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)0;
      player0.unpack(byteArray0);
      byteArray0[1] = (byte) (-25);
      byteArray0[2] = (byte)114;
      byteArray0[3] = (byte)2;
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte)1;
      player0.unpack(byteArray0);
      assertEquals(1, player0.getStrength());
      assertEquals(0, player0.getPictureId());
      assertTrue(player0.isConnected());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals("Player-1", player0.getName());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Player player0 = new Player(7);
      Player player1 = new Player(7);
      player1.remove(player0);
      player1.setJoinOK(player0, true);
      player1.reset(false);
      player1.isJoinOK(player0, false);
      boolean boolean0 = player0.isJoinOK(player1, false);
      assertEquals(0.0F, player1.getY(), 0.01F);
      assertFalse(player1.isDead());
      assertEquals(10.0F, player1.getX(), 0.01F);
      assertEquals(0L, player1.getTimeOfDeath());
      assertEquals("Player7", player1.toString());
      assertEquals(0, player1.getPictureId());
      assertFalse(boolean0);
      assertEquals(1, player1.getStrength());
      assertEquals("0.0.0.0", player1.getIP());
      assertTrue(player1.isConnected());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Player player0 = new Player(494);
      Player player1 = new Player();
      Player player2 = new Player();
      player2.isDead();
      System.setCurrentTimeMillis(0L);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Player player0 = new Player((-1006));
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)37;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      Player player1 = new Player(0, "e_,jNW)wWGKJ", "e_,jNW)wWGKJ", (byte)0);
      player0.head = (Party) player1;
      assertEquals(0, player1.getPictureId());
      
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      dataInputStream0.markSupported();
      boolean boolean0 = player0.unpack(dataInputStream0);
      assertFalse(boolean0);
      
      String string0 = player0.getIP();
      assertEquals(1, player0.getStrength());
      assertEquals(0, player0.getPictureId());
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals("Player-1006", player0.getName());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals("0.0.0.0", string0);
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Player player0 = new Player(7);
      Player player1 = new Player(7);
      player1.getSubparty();
      player0.isJoinOK(player1, true);
      Player player2 = new Player();
      player2.pack();
      player1.isJoinOK(player2, false);
      System.setCurrentTimeMillis((-1L));
      System.setCurrentTimeMillis((-1L));
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Player player0 = new Player();
      player0.getIP();
      player0.isConnected();
      byte[] byteArray0 = player0.pack();
      int int0 = (-1);
      Player player1 = new Player((short)4919, "0.0.0.0", (-1));
      player1.id = (-2076);
      player0.setJoinOK(player1, true);
      player0.unpack(byteArray0);
      // Undeclared exception!
      try { 
        MockFile.createTempFile("`", "0.0.0.0");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Prefix string too short
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Player player0 = new Player(7);
      Player player1 = new Player(7);
      player0.reset(true);
      player1.setJoinOK(player0, true);
      player1.isJoinOK(player0, false);
      boolean boolean0 = player1.isJoinOK(player0, true);
      assertTrue(boolean0);
      
      System.setCurrentTimeMillis(1064L);
      boolean boolean1 = player1.isJoinOK(player0, false);
      assertTrue(player1.isConnected());
      assertEquals(0.0F, player0.getMoney(), 0.01F);
      assertEquals("0.0.0.0", player1.getIP());
      assertEquals("Player7", player1.toString());
      assertFalse(boolean1);
      assertEquals(0, player1.getPictureId());
      assertEquals(10.0F, player1.getX(), 0.01F);
      assertEquals(0.0F, player1.getY(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(1, player1.getStrength());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Player player0 = new Player((-17));
      Player player1 = new Player((-1330));
      player1.isBoss();
      player0.isJoinOK(player1, true);
      player0.setMoney((-1330));
      assertEquals((-1330.0F), player0.getMoney(), 0.01F);
      
      float float0 = player1.getMoney();
      assertEquals(0.0F, float0, 0.01F);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=3.178053830347946
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Player player0 = new Player();
      player0.setMoney(1540.0F);
      player0.setX(0.0F);
      byte[] byteArray0 = player0.pack();
      player0.setDead((-2797L));
      player0.setDead((-2797L), true);
      Party party0 = new Party();
      party0.remove(player0);
      party0.add(player0);
      party0.remove(player0);
      player0.add(party0);
      player0.setX(0.0F);
      player0.getZ();
      player0.reset(true);
      player0.getPictureId();
      player0.setDead();
      player0.type();
      player0.getTimeOfDeath();
      player0.getZ();
      Player player1 = new Player((-764), "Player.unpack(): *** WARNING *** data is not of proper type!", "Player.unpack(): *** WARNING *** data is not of proper type!", (-764), 0);
      player0.setJoinOK(player1, true);
      player0.toString();
      player0.setMoney(0.2F);
      player1.unpack(byteArray0);
      player1.setDead((long) (short)4919);
      player1.isConnected();
      float float0 = player1.getMoney();
      assertEquals(4919L, player1.getTimeOfDeath());
      assertEquals(0.0F, float0, 0.01F);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int int0 = (-4054);
      Player player0 = new Player((-4054));
      player0.setY(0.0F);
      player0.getStrength();
      Player player1 = new Player();
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(enumeration0).hasMoreElements();
      doReturn((Object) null).when(enumeration0).nextElement();
      player1.gangStrength();
      SequenceInputStream sequenceInputStream0 = null;
      try {
        sequenceInputStream0 = new SequenceInputStream(enumeration0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.SequenceInputStream", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Player player0 = new Player();
      player0.gangStrength();
      player0.setDead(2189L);
      player0.gangStrength();
      player0.isConnected();
      player0.getY();
      player0.setX(0.0F);
      player0.setZ(0.0F);
      player0.isDead();
      float float0 = player0.getZ();
      assertEquals(2189L, player0.getTimeOfDeath());
      assertEquals(0.0F, float0, 0.01F);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Player player0 = new Player(7);
      Player player1 = new Player();
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)111;
      byteArray0[1] = (byte)55;
      byteArray0[2] = (byte)74;
      byteArray0[3] = (byte)55;
      byteArray0[4] = (byte)71;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      player1.id = (-1966);
      player1.setJoinOK(player0, true);
      player0.isJoinOK(player1, true);
      System.setCurrentTimeMillis(1392409296320L);
      boolean boolean0 = player1.isJoinOK(player0, false);
      assertEquals(0L, player1.getTimeOfDeath());
      assertFalse(player1.isDead());
      assertEquals(10.0F, player1.getX(), 0.01F);
      assertEquals("0.0.0.0", player1.getIP());
      assertEquals("Player-1", player1.toString());
      assertFalse(boolean0);
      assertEquals(0, player1.getPictureId());
      assertEquals(1, player1.getStrength());
      assertEquals(0.0F, player1.getY(), 0.01F);
      assertTrue(player1.isConnected());
  }
}
