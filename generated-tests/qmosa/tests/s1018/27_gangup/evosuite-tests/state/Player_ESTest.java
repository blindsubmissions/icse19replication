/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 14:42:22 GMT 2018
 */

package state;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PipedInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import state.Party;
import state.Player;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Player_ESTest extends Player_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=2.833213344056216
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Player player0 = new Player(4);
      Player player1 = new Player((short)4919);
      player0.boss = (Party) player1;
      player0.setX(1.0F);
      player0.getMoney();
      player0.setX((-1609.1971F));
      player0.setMoney(0.0F);
      player0.getX();
      player1.setJoinOK(player0, false);
      player0.setZ((-1662.7F));
      player0.reset(false);
      player0.getIP();
      player0.getStrength();
      player0.getName();
      player1.getTimeOfDeath();
      player1.getSubparty();
      player0.toString();
      player1.getIP();
      player1.setMoney(1.0F);
      player0.gangStrength();
      player0.setY(0.1F);
      player1.isConnected();
      assertEquals(1.0F, player1.getMoney(), 0.01F);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Player player0 = new Player(4169, "2|-%Nice^=<xp>|t)_", 1);
      player0.setX(1);
      player0.getMoney();
      player0.getIP();
      assertEquals(0L, player0.getTimeOfDeath());
      
      player0.setDead((long) 1, false);
      assertEquals(1, player0.getPictureId());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Player player0 = new Player(977, (String) null, (String) null, 977, 977);
      player0.setMoney(991.122F);
      Party party0 = player0.next;
      player0.add((Party) null);
      player0.setX((-359.8389F));
      player0.getPictureId();
      player0.isConnected();
      player0.setMoney((-359.8389F));
      player0.toString();
      PipedInputStream pipedInputStream0 = new PipedInputStream(5);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0);
      DataInputStream dataInputStream0 = new DataInputStream(bufferedInputStream0);
      dataInputStream0.available();
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        dataInputStream0.read(byteArray0, 5, 977);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.BufferedInputStream", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Player player0 = new Player(0, "", "", 0);
      Player player1 = new Player((short)4919, "", "", (-1), (short)4919);
      player0.setJoinOK(player1, true);
      player0.setY(0);
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, player0.getY(), 0.01F);
      
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-1);
      byteArray0[1] = (byte) (-68);
      byteArray0[2] = (byte)22;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte) (-1);
      byteArray0[5] = (byte)16;
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte)0;
      player1.unpack(byteArray0);
      assertEquals(10.0F, player1.getX(), 0.01F);
      assertEquals((-1), player1.getPictureId());
      assertFalse(player1.isDead());
      assertEquals(4919, player1.getStrength());
      assertEquals(0L, player1.getTimeOfDeath());
      assertTrue(player1.isConnected());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Player player0 = new Player();
      player0.toString();
      player0.getSubparty();
      Player player1 = new Player((short)4919);
      player1.setDead();
      player0.next = (Party) player1;
      player1.add(player0);
      player0.setJoinOK(player1, true);
      player1.getZ();
      player0.setDead((long) (short)4919);
      float float0 = player0.getMoney();
      assertEquals(4919L, player0.getTimeOfDeath());
      assertEquals(0.0F, float0, 0.01F);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Player player0 = new Player((-2440), "L(?X=&<yp<", "L(?X=&<yp<", (-2440));
      player0.setDead((-26L));
      Player player1 = new Player((short)4919, "6g |@sXIV#", (-1550));
      player0.next = (Party) player1;
      Player player2 = new Player((-2440), "", "6g |@sXIV#", (-1550), (-1));
      player2.setX(0.2F);
      player0.setJoinOK(player2, false);
      player0.setZ((-1.0F));
      player2.isConnected();
      player2.getX();
      player2.reset(true);
      player0.setMoney(10.0F);
      player2.getName();
      player2.setDead();
      player0.toString();
      player0.gangStrength();
      float float0 = player2.getMoney();
      assertEquals(0.2F, player2.getX(), 0.01F);
      assertEquals(0.0F, float0, 0.01F);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Player player0 = new Player(0, "", 0);
      Player player1 = new Player((-2703));
      player1.setDead();
      player0.add(player1);
      player0.setConnected(false);
      player0.reset(true);
      player1.setConnected(true);
      player0.setDead();
      player1.setDead();
      player1.isJoinOK(player0, true);
      player0.gangStrength();
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)4;
      byteArray0[1] = (byte) (-34);
      byteArray0[2] = (byte) (-89);
      byteArray0[3] = (byte)0;
      player0.unpack(byteArray0);
      assertTrue(player0.isDead());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Player player0 = new Player(3, "y3!{JJN<`]0?WZ&fo", " aL/}:", (-723), (-723));
      player0.getStrength();
      Party party0 = player0.gangBoss();
      party0.id = 0;
      player0.add(party0);
      player0.pack();
      player0.setDead((long) (-723), true);
      player0.setZ((-723));
      player0.getName();
      player0.setConnected(true);
      assertEquals((-723L), player0.getTimeOfDeath());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Player player0 = new Player(3, "Player.unpack(): *** WARNING *** data is not of proper type!", "Vm`(6)wD", 0);
      player0.reset(true);
      int int0 = player0.type();
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals("Player.unpack(): *** WARNING *** data is not of proper type!", player0.getIP());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(0, player0.getPictureId());
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, player0.getMoney(), 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertTrue(player0.isConnected());
      assertEquals(5, int0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Player player0 = new Player(0, "dg{l%", "", 0);
      player0.isConnected();
      Player player1 = new Player((-520), "gYeYtPP|#i__cnx:", "", (-65), 0);
      player0.setJoinOK(player1, true);
      player0.id = (-1);
      player0.setDead();
      player0.getZ();
      boolean boolean0 = player0.isDead();
      assertEquals(1392409281320L, player0.getTimeOfDeath());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Player player0 = new Player(0, "state.Player$JoinInfo", 0);
      player0.getY();
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      try { 
        mockFileInputStream0.reset();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // mark/reset not supported
         //
         verifyException("java.io.InputStream", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Player player0 = new Player(0, "dg{l%", "", 0);
      player0.isConnected();
      Player player1 = new Player((-520), "gYeYtPP|#i__cnx:", "", (-65), 0);
      player0.setJoinOK(player1, true);
      player0.id = (-1);
      player0.setDead();
      player0.getZ();
      assertEquals(1392409281320L, player0.getTimeOfDeath());
      
      boolean boolean0 = player1.isDead();
      assertFalse(boolean0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      System.setCurrentTimeMillis(1952L);
      System.setCurrentTimeMillis(1952L);
      Player player0 = new Player((-866), "Player.unpack(): *** WARNING *** [IO] failed to unpack data: ", "Player.unpack(): *** WARNING *** [IO] failed to unpack data: ", (-866));
      Player player1 = new Player();
      player0.setDead((long) (short)4919);
      player0.setY(276.47693F);
      player0.setJoinOK(player1, false);
      player0.head = (Party) player1;
      player0.isJoinOK(player1, false);
      System.setCurrentTimeMillis(0L);
      player0.setJoinOK(player1, false);
      System.setCurrentTimeMillis(0L);
      System.setCurrentTimeMillis(0L);
      MockFileInputStream mockFileInputStream0 = null;
      try {
        mockFileInputStream0 = new MockFileInputStream("Player.unpack(): *** WARNING *** [IO] failed to unpack data: ");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.0982737395252498
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      System.setCurrentTimeMillis(1952L);
      System.setCurrentTimeMillis(1952L);
      Player player0 = new Player((-866), "Player.unpack(): *** WARNING *** [IO] failed to unpack data: ", "Player.unpack(): *** WARNING *** [IO] failed to unpack data: ", (-866));
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("Player.unpack(): *** WARNING *** [IO] failed to unpack data: ");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "Player.unpack(): *** WARNING *** [IO] failed to unpack data: ");
      Player player1 = new Player((short)4919, "Player.unpack(): *** WARNING *** [IO] failed to unpack data: ", (-866));
      player0.setDead((long) (short)4919);
      player0.setY(276.47693F);
      player0.setJoinOK(player1, true);
      player0.head = (Party) player1;
      player0.isJoinOK(player1, false);
      System.setCurrentTimeMillis(0L);
      player0.setJoinOK(player1, false);
      System.setCurrentTimeMillis(0L);
      System.setCurrentTimeMillis(0L);
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream("Player.unpack(): *** WARNING *** [IO] failed to unpack data: ");
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.8133554045006157
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      System.setCurrentTimeMillis(1952L);
      System.setCurrentTimeMillis(1952L);
      Player player0 = new Player((-866), "Player.unpack(): *** WARNING *** [IO] failed to unpack data: ", "Player.unpack(): *** WARNING *** [IO] failed to unpack data: ", (-866));
      player0.setDead((long) (-866));
      Player player1 = new Player(508);
      player0.setJoinOK(player1, false);
      player1.isJoinOK(player0, false);
      System.setCurrentTimeMillis(508);
      player1.setJoinOK(player0, false);
      player1.reset(true);
      player1.setConnected(false);
      player0.setDead();
      player0.setDead();
      player1.isJoinOK(player0, false);
      player1.gangStrength();
      byte[] byteArray0 = player0.pack();
      player0.unpack(byteArray0);
      // Undeclared exception!
      try { 
        player0.unpack((DataInputStream) null);
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
  /*Coverage entropy=2.5665989181145106
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      System.setCurrentTimeMillis(1952L);
      System.setCurrentTimeMillis(1952L);
      Player player0 = new Player((-882), "Player.unpack(): *** WARNING *** [IO] failed to unpack data: ", "Player.unpack(): *** WARNING *** [IO] failed to unpack data: ", (-882));
      Player player1 = new Player((short)4919, "Player.unpack(): *** WARNING *** [IO] failed to unpack data: ", "Player.unpack(): *** WARNING *** [IO] failed to unpack data: ", (-882), (short)4919);
      player0.setJoinOK(player1, false);
      player0.head = (Party) player1;
      player0.isJoinOK(player1, false);
      player1.pack();
      System.setCurrentTimeMillis(0L);
      player0.setJoinOK(player1, false);
      player0.reset(true);
      player0.setConnected(true);
      player0.setJoinOK(player1, true);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      Player player2 = new Player((-27938), "state.Player$JoinInfo", "Player.unpack(): *** WARNING *** [IO] failed to unpack data: ", 2499, (-27938));
      player0.isJoinOK(player2, false);
      System.setCurrentTimeMillis((-27938));
      player2.setJoinOK(player0, true);
      System.setCurrentTimeMillis(1L);
      player1.id = (-882);
      player2.setDead();
      player0.isJoinOK(player2, true);
      player2.isJoinOK(player0, true);
      System.setCurrentTimeMillis(2916L);
  }
}
