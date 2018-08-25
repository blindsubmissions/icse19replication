/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 06:04:55 GMT 2018
 */

package state;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PipedInputStream;
import java.io.UnsupportedEncodingException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.io.MockFile;
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
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Player player0 = new Player((-2531));
      MockFile mockFile0 = new MockFile("", "6");
      MockFile mockFile1 = new MockFile(mockFile0, "6");
      MockFile.createTempFile("HGskjUj>ktQJ,$WA", "eu-3lT^4G<:1eK", (File) mockFile1);
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)67;
      byteArray0[1] = (byte)21;
      byteArray0[2] = (byte)0;
      player0.getTimeOfDeath();
      player0.setY((-2531));
      player0.toString();
      player0.setX(401.0F);
      float float0 = player0.getY();
      assertEquals(401.0F, player0.getX(), 0.01F);
      assertEquals((-2531.0F), float0, 0.01F);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Player player0 = new Player(4);
      player0.isJoinOK(player0, false);
      Player player1 = new Player();
      boolean boolean0 = player0.isJoinOK(player1, false);
      assertEquals("Player-1", player1.toString());
      assertFalse(boolean0);
      
      float float0 = player0.getY();
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(0, player0.getPictureId());
      assertFalse(player0.isDead());
      assertEquals(0.0F, float0, 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(1, player0.getStrength());
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Player player0 = new Player(4, "", "/-s", 4);
      player0.pack();
      player0.pack();
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(4, player0.getPictureId());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals("", player0.getIP());
      assertTrue(player0.isConnected());
      assertEquals(1, player0.getStrength());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Player player0 = new Player(27);
      player0.setDead((long) 27, true);
      player0.pack();
      player0.pack();
      player0.getTimeOfDeath();
      player0.getY();
      player0.getTimeOfDeath();
      player0.setConnected(true);
      player0.getX();
      player0.getY();
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
  //Test case number: 4
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Player player0 = new Player((-3530));
      byte[] byteArray0 = new byte[3];
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      byteArray0[0] = (byte)0;
      byteArray0[2] = (byte) (-109);
      byteArray0[2] = (byte) (-26);
      player0.unpack(byteArray0);
      player0.setMoney((short)4919);
      assertEquals(4919.0F, player0.getMoney(), 0.01F);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Player player0 = new Player();
      player0.setDead();
      player0.setY(0.0F);
      player0.next = null;
      player0.remove((Party) null);
      assertEquals(1392409281320L, player0.getTimeOfDeath());
      
      player0.setDead(0L, true);
      player0.getTimeOfDeath();
      player0.toString();
      player0.getTimeOfDeath();
      player0.pack();
      player0.getIP();
      player0.isConnected();
      player0.type();
      float float0 = player0.getZ();
      assertEquals(0.0F, float0, 0.01F);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Player player0 = new Player(1689, "", "&WnjF~Xv", 0);
      Party party0 = new Party(4919);
      player0.boss = party0;
      player0.getStrength();
      player0.setDead();
      assertEquals(1392409281320L, player0.getTimeOfDeath());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Player player0 = new Player(2147340491);
      player0.reset(false);
      boolean boolean0 = player0.isConnected();
      assertTrue(boolean0);
      
      int int0 = player0.type();
      assertEquals(1, player0.getStrength());
      assertEquals(0, player0.getPictureId());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(5, int0);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals("Player2147340491", player0.toString());
      assertFalse(player0.isDead());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Player player0 = new Player(1936, "ktd2VaOBP?Vh06", 164);
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)92;
      byteArray0[1] = (byte)10;
      byteArray0[2] = (byte) (-48);
      player0.reset(false);
      boolean boolean0 = player0.isDead();
      assertTrue(player0.isConnected());
      assertEquals(164, player0.getPictureId());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(1, player0.getStrength());
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Player player0 = new Player(0, "", 1249);
      player0.setDead((long) 1249, true);
      player0.gangStrength();
      boolean boolean0 = player0.isDead();
      assertEquals(1249L, player0.getTimeOfDeath());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      System.setCurrentTimeMillis(1506L);
      int int0 = 5;
      Player player0 = new Player(5);
      player0.setZ(788.3897F);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream((short)4919);
      try { 
        byteArrayOutputStream0.toString("pytxdGzh0gm:6<!_");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(UnsupportedEncodingException e) {
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      System.setCurrentTimeMillis(15000L);
      System.setCurrentTimeMillis(15000L);
      Player player0 = new Player((-7793));
      Player player1 = new Player((-2493), ".*[.]class$", (short)4919);
      player0.isJoinOK(player1, true);
      player1.isJoinOK(player0, true);
      Player player2 = new Player();
      player1.reset(true);
      player0.isJoinOK(player2, false);
      boolean boolean0 = player1.isJoinOK(player0, true);
      assertEquals(10.0F, player1.getX(), 0.01F);
      assertEquals(0L, player1.getTimeOfDeath());
      assertEquals(0, player0.getPictureId());
      assertEquals(0.0F, player1.getY(), 0.01F);
      assertFalse(player1.isDead());
      assertFalse(boolean0);
      assertEquals(1, player1.getStrength());
      assertTrue(player1.isConnected());
      assertEquals("0.0.0.0", player1.getIP());
      assertEquals(4919, player1.getPictureId());
      assertEquals("Player-7793", player0.toString());
      assertEquals(0.0F, player1.getMoney(), 0.01F);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "W :[3XG<\"/s;*X");
      Player player0 = new Player();
      int int0 = (-20147);
      player0.setX((-20147));
      PipedInputStream pipedInputStream0 = new PipedInputStream(3227);
      ObjectInputStream objectInputStream0 = null;
      try {
        objectInputStream0 = new ObjectInputStream(pipedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Player player0 = new Player(5, "module.ModuleBrowserDialog$ModuleFilter", "module.ModuleBrowserDialog$ModuleFilter", 5);
      float float0 = player0.getZ();
      assertEquals(0.0F, float0, 0.01F);
      
      player0.getName();
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertTrue(player0.isConnected());
      assertEquals(5, player0.getPictureId());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Player player0 = new Player(10, "WA88'zmU", "]nR:-m", 10, (-664));
      player0.id = (-155);
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)1;
      byteArray0[2] = (byte) (-55);
      byteArray0[3] = (byte)116;
      byteArray0[4] = (byte) (-118);
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte) (-122);
      byteArray0[7] = (byte)0;
      player0.unpack(byteArray0);
      assertEquals(0L, player0.getTimeOfDeath());
      
      player0.setDead((-1L), true);
      player0.getMoney();
      player0.toString();
      assertEquals(10.0F, player0.getX(), 0.01F);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Player player0 = new Player(4);
      Player player1 = new Player((short)4919);
      player1.boss = (Party) player0;
      player0.add(player1);
      player0.setDead();
      player0.setJoinOK(player1, false);
      boolean boolean0 = player0.isDead();
      assertEquals(1392409281320L, player0.getTimeOfDeath());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Player player0 = new Player(4);
      player0.setConnected(true);
      player0.setDead(45L, true);
      player0.setConnected(true);
      Player player1 = new Player((short)4919);
      player0.add(player1);
      PipedInputStream pipedInputStream0 = new PipedInputStream((short)4919);
      int int0 = player0.getPictureId();
      assertEquals(45L, player0.getTimeOfDeath());
      assertEquals(0, int0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Player player0 = new Player((-1));
      player0.setMoney((-323.1007F));
      player0.setDead();
      byte[] byteArray0 = player0.pack();
      player0.unpack(byteArray0);
      assertEquals(1392409281320L, player0.getTimeOfDeath());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.7480673485460891
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Player player0 = new Player(4);
      player0.setConnected(true);
      player0.setDead(0L, true);
      player0.setConnected(true);
      player0.add(player0);
      player0.setConnected(true);
      player0.setJoinOK(player0, true);
      player0.isJoinOK(player0, true);
      player0.isJoinOK(player0, false);
      Player player1 = new Player();
      player0.isJoinOK(player1, false);
      System.setCurrentTimeMillis(1506L);
  }
}
