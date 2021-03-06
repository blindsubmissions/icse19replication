/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 12:35:14 GMT 2018
 */

package state;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
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
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Player player0 = new Player(3, "", 1158);
      player0.setDead((long) 1158);
      player0.setDead(780L, true);
      player0.next = null;
      player0.add((Party) null);
      player0.setDead();
      player0.type();
      player0.getName();
      player0.id = 0;
      player0.setConnected(true);
      player0.setMoney(0);
      player0.boss = null;
      player0.setDead(1L, false);
      player0.getZ();
      player0.setMoney(0);
      player0.getZ();
      player0.reset(false);
      player0.setDead((-1472L), true);
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte) (-78);
      byteArray0[3] = (byte)10;
      byteArray0[4] = (byte)49;
      byteArray0[5] = (byte) (-45);
      byteArray0[6] = (byte) (-90);
      byteArray0[7] = (byte)5;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, (-1802));
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      boolean boolean0 = player0.unpack(dataInputStream0);
      assertEquals((-1472L), player0.getTimeOfDeath());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.833213344056216
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Player player0 = new Player((-21), "*eV( ,)QR", "th\"#|cR5e<cUg[(", (-21), (-21));
      player0.setDead();
      player0.getSubparty();
      Player player1 = new Player((short)4919, "", "", (short)4919);
      player0.setJoinOK(player1, false);
      Player player2 = new Player();
      player2.setJoinOK(player0, false);
      player0.getSubparty();
      player1.setMoney(0.1F);
      player2.setJoinOK(player0, false);
      player0.add(player2);
      player0.toString();
      player2.prev = (Party) player0;
      player0.isConnected();
      player0.toString();
      player0.setY((-21));
      player0.prev = (Party) player1;
      byte[] byteArray0 = new byte[0];
      player1.unpack(byteArray0);
      player2.setJoinOK(player1, false);
      player0.setDead(0L, false);
      player2.setJoinOK(player0, true);
      player0.getMoney();
      player0.setY(0.1F);
      assertEquals(0.1F, player0.getY(), 0.01F);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Player player0 = new Player();
      Party party0 = new Party();
      player0.boss = party0;
      Party party1 = player0.boss;
      party1.getSubparty();
      player0.head = party1;
      player0.head = party1;
      player0.setDead((-1L));
      player0.setDead((-1L), true);
      player0.type();
      party1.boss = player0.boss;
      player0.setDead(0L, true);
      player0.getX();
      player0.getStrength();
      player0.reset(true);
      int int0 = player0.type();
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(5, int0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Player player0 = new Player((-1), (String) null, "", (-1), 3);
      Player player1 = new Player((short)4919, (String) null, "", 0);
      player0.remove(player1);
      assertEquals(1, player1.getStrength());
      
      player0.pack();
      assertEquals(3, player0.getStrength());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals((-1), player0.getPictureId());
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Player player0 = new Player(0, "", "", 89, 0);
      player0.setDead((-694L));
      player0.setX(0.0F);
      player0.setX(748.0353F);
      int int0 = 0;
      Party party0 = new Party(0);
      player0.next = party0;
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      // Undeclared exception!
      try { 
        player0.unpack(dataInputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Player player0 = new Player(0);
      player0.setDead((long) 0, false);
      Player player1 = new Player();
      player0.boss = (Party) player1;
      player0.setDead(0L);
      player0.setY(0);
      player0.gangStrength();
      player0.setY(1.0F);
      player0.getIP();
      player0.reset(true);
      assertEquals(1.0F, player0.getY(), 0.01F);
      
      player1.setDead((long) 0, false);
      int int0 = player1.gangStrength();
      assertEquals(1, int0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int int0 = (-248);
      Player player0 = new Player((-248), "US63Z}qM", (-909));
      player0.setX((-248));
      player0.pack();
      player0.getPictureId();
      player0.getStrength();
      player0.getName();
      String string0 = "D$sKar3:T1>~.;#Hua";
      File file0 = MockFile.createTempFile("US63Z}qM", "D$sKar3:T1>~.;#Hua");
      try { 
        MockFile.createTempFile("US63Z}qM", "state.Party", file0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Player player0 = new Player();
      player0.setConnected(false);
      player0.setDead();
      player0.setConnected(false);
      player0.setConnected(true);
      player0.isDead();
      player0.pack();
      player0.setY(0.1F);
      player0.type();
      player0.setDead((long) 5, true);
      MockPrintStream mockPrintStream0 = null;
      try {
        mockPrintStream0 = new MockPrintStream("=RJDVH<Q`", "/Y=S");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(Throwable e) {
         //
         // /Y=S
         //
         verifyException("java.io.PrintStream", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Player player0 = new Player(2147, "th):8'|',bDe", 1602);
      player0.isConnected();
      Player player1 = new Player();
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)108;
      byteArray0[1] = (byte)111;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 964, 2147);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0);
      DataInputStream dataInputStream0 = new DataInputStream(bufferedInputStream0);
      player1.unpack(dataInputStream0);
      player0.isJoinOK(player1, false);
      player0.setDead();
      assertEquals(1392409281320L, player0.getTimeOfDeath());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Player player0 = new Player(3, (String) null, "zfAhH$<if=6d.YhG:", 3);
      player0.setMoney(3);
      player0.getName();
      player0.setDead((long) 3);
      player0.gangStrength();
      player0.setDead((long) 1, false);
      Player player1 = new Player();
      player0.isJoinOK(player1, true);
      player1.getTimeOfDeath();
      player0.getName();
      player0.getIP();
      player0.setDead((long) 3);
      assertEquals(3L, player0.getTimeOfDeath());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.945934775756114
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      Player player0 = new Player(2113, "|nli. RSHnv", "|nli. RSHnv", 2113, 2113);
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, true, false);
      player0.setZ(14135);
      Player player1 = new Player(14135, "|nli. RSHnv", (String) null, (short)4919);
      player1.setZ(2630.0F);
      player1.setJoinOK(player0, true);
      player1.isJoinOK(player0, false);
      player1.setX(1.0F);
      player1.isJoinOK(player0, true);
      player0.isJoinOK(player1, false);
      player1.isJoinOK(player0, false);
      MockFileInputStream mockFileInputStream0 = null;
      try {
        mockFileInputStream0 = new MockFileInputStream((FileDescriptor) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.FileInputStream", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      System.setCurrentTimeMillis(1392409296320L);
      Player player0 = new Player((-2949), "3YStlloh!", "3YStlloh!", (-2949));
      Player player1 = new Player((short)4919);
      byte[] byteArray0 = player1.pack();
      player0.isJoinOK(player1, true);
      player1.isJoinOK(player0, true);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      byteArrayInputStream0.close();
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "3YStlloh!");
      player1.unpack(dataInputStream0);
      player0.isJoinOK(player1, true);
      System.setCurrentTimeMillis((-2949));
      boolean boolean0 = player1.unpack(dataInputStream0);
      assertEquals(0, byteArrayInputStream0.available());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.8310204811135162
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Player player0 = new Player();
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)1;
      byteArray0[1] = (byte)1;
      player0.unpack(byteArray0);
      Player player1 = new Player();
      player1.head = (Party) player0;
      player0.setJoinOK(player1, true);
      player1.isJoinOK(player0, false);
      player1.isJoinOK(player0, true);
      boolean boolean0 = player0.isJoinOK(player1, true);
      System.setCurrentTimeMillis(1392409296320L);
      boolean boolean1 = player0.isJoinOK(player1, true);
      assertFalse(boolean1 == boolean0);
      assertTrue(player1.isConnected());
      assertEquals(1, player1.getStrength());
      assertEquals("0.0.0.0", player1.getIP());
      assertEquals(10.0F, player1.getX(), 0.01F);
      assertFalse(player1.isDead());
      assertEquals(0L, player1.getTimeOfDeath());
      assertEquals(0.0F, player1.getY(), 0.01F);
      assertEquals(0, player1.getPictureId());
      assertEquals("Player-1", player1.getName());
      assertFalse(boolean1);
  }
}
