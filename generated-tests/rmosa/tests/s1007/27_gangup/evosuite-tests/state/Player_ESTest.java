/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 08:17:26 GMT 2018
 */

package state;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
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
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Player player0 = new Player();
      float float0 = player0.getX();
      assertEquals(1, player0.getStrength());
      assertEquals(0, player0.getPictureId());
      assertEquals(10.0F, float0, 0.01F);
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals("Player-1", player0.getName());
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Player player0 = new Player(2524, "state.Party", "", 2524);
      player0.setDead((-1779L));
      Player player1 = new Player(2524, "1PEwX'^W\"", (String) null, 2524, (-1280));
      player1.getSubparty();
      player1.setY(0.2F);
      player0.setY(19);
      player0.isDead();
      System.setCurrentTimeMillis((short)4919);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Player player0 = new Player((-1788), "", (-1788));
      Party party0 = player0.boss;
      player0.boss = null;
      player0.next = null;
      player0.setDead((long) (-1788), true);
      player0.getX();
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)64;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte) (-31);
      byteArray0[4] = (byte)85;
      player0.unpack(byteArray0);
      assertEquals((-1788L), player0.getTimeOfDeath());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Player player0 = new Player(0, "", "", 746, 0);
      player0.reset(true);
      player0.setDead(0L, true);
      player0.id = (-1440);
      player0.getName();
      player0.setDead(629L, true);
      assertEquals(629L, player0.getTimeOfDeath());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Player player0 = new Player(0);
      int int0 = player0.type();
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(1, player0.getStrength());
      assertEquals("Player0", player0.toString());
      assertEquals(5, int0);
      assertEquals("0.0.0.0", player0.getIP());
      assertTrue(player0.isConnected());
      assertEquals(0, player0.getPictureId());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Player player0 = new Player();
      String string0 = "";
      Player player1 = new Player((-188), "", (String) null, (-188));
      player0.next = (Party) player1;
      player0.getZ();
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
  //Test case number: 6
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Player player0 = new Player(0, "EhXMt\"!$qc+p", "E#j1!;$", 0);
      player0.getSubparty();
      player0.setJoinOK(player0, false);
      player0.setY(0);
      player0.setY(0.0F);
      boolean boolean0 = player0.isJoinOK(player0, true);
      assertFalse(boolean0);
      
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-5);
      player0.setY(0);
      boolean boolean1 = player0.isJoinOK(player0, false);
      assertTrue(player0.isConnected());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
      assertFalse(player0.isDead());
      assertEquals(0, player0.getPictureId());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals("EhXMt\"!$qc+p", player0.getIP());
      assertTrue(boolean1);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Player player0 = new Player(0, "(LxRS!", "module.ModuleBrowserDialog$ModuleFilter", 0, 1814);
      player0.setMoney(2235.2432F);
      Player player1 = new Player((-1), "module.ModuleBrowserDialog$ModuleFilter", 1);
      player0.setJoinOK(player1, true);
      assertEquals(2235.2432F, player0.getMoney(), 0.01F);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Player player0 = new Player((-1), "Nd(LRS!", (-28));
      player0.setConnected(true);
      player0.id = (-1);
      System.setCurrentTimeMillis(1L);
      System.setCurrentTimeMillis(1392409296320L);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Player player0 = new Player();
      player0.getY();
      player0.getIP();
      boolean boolean0 = false;
      player0.reset(false);
      SequenceInputStream sequenceInputStream0 = null;
      try {
        sequenceInputStream0 = new SequenceInputStream((Enumeration<? extends InputStream>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.SequenceInputStream", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Player player0 = new Player();
      player0.setDead();
      player0.setZ(0);
      player0.id = 0;
      player0.pack();
      Player player1 = new Player(0, "(O-L", "(O-L", (-1328));
      player0.add(player1);
      player0.getStrength();
      player0.setZ(0L);
      player0.setDead(0L, false);
      player0.getSubparty();
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
  //Test case number: 11
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Player player0 = new Player();
      Player player1 = new Player();
      player0.add(player1);
      player0.gangStrength();
      boolean boolean0 = true;
      player0.reset(true);
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      player1.setDead(0L, false);
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      DataInputStream dataInputStream0 = new DataInputStream(mockFileInputStream0);
      player1.unpack(dataInputStream0);
      mockFileInputStream0.markSupported();
      long long0 = 0L;
      try { 
        dataInputStream0.readInt();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Player player0 = new Player((-777), "g;A`rIIDp`1(TX\">b", 3);
      player0.setY(0.0F);
      player0.setY((-565.6757F));
      player0.getName();
      player0.gangStrength();
      player0.setDead((long) (-777));
      player0.getPictureId();
      player0.toString();
      assertEquals((-777L), player0.getTimeOfDeath());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Player player0 = new Player((-307));
      Party party0 = new Party((-307));
      party0.boss = (Party) player0;
      Party party1 = new Party(2077);
      player0.remove(party1);
      player0.prev = party0;
      int int0 = player0.gangStrength();
      assertEquals(1, int0);
      
      boolean boolean0 = player0.isConnected();
      assertTrue(boolean0);
      
      float float0 = player0.getMoney();
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(0, player0.getPictureId());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals("Player-307", player0.getName());
      assertEquals(0.0F, float0, 0.01F);
      assertFalse(player0.isDead());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Player player0 = new Player(0, "", 0);
      player0.isDead();
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
  //Test case number: 15
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Player player0 = new Player(0, "", "", 48);
      byte[] byteArray0 = player0.pack();
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "");
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      Player player1 = new Player(48, "Player.unpack(): *** WARNING *** [IO] failed to unpack data: ", (-1));
      player0.reset(false);
      player1.setY((short)4919);
      player1.setDead((long) 0, false);
      player0.next = (Party) player1;
      player0.isJoinOK(player1, false);
      player1.isJoinOK(player0, false);
      assertEquals(4919.0F, player1.getY(), 0.01F);
      
      System.setCurrentTimeMillis((short)4919);
      System.setCurrentTimeMillis((short)4919);
      System.setCurrentTimeMillis(1222L);
      System.setCurrentTimeMillis((-1056L));
      player0.unpack(byteArray0);
      assertEquals(48, player0.getPictureId());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Player player0 = new Player(0, "", "", 48);
      player0.pack();
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "");
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      Player player1 = new Player(48, "Player.unpack(): *** WARNING *** [IO] failed to unpack data: ", (-1));
      player0.reset(false);
      player1.setY((short)4919);
      player1.setDead((long) 0, false);
      player0.next = (Party) player1;
      player0.isJoinOK(player1, false);
      player1.isJoinOK(player0, false);
      System.setCurrentTimeMillis((short)4919);
      System.setCurrentTimeMillis((short)4919);
      System.setCurrentTimeMillis(1222L);
      System.setCurrentTimeMillis((-1056L));
      System.setCurrentTimeMillis((-1));
      player0.setJoinOK(player1, true);
      System.setCurrentTimeMillis(1196L);
      boolean boolean0 = player0.isJoinOK(player1, true);
      player1.setDead(290L);
      player0.getTimeOfDeath();
      System.setCurrentTimeMillis(19919L);
      boolean boolean1 = player0.isJoinOK(player1, false);
      assertEquals(4919.0F, player1.getY(), 0.01F);
      assertFalse(boolean1 == boolean0);
  }
}
