/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 10:21:04 GMT 2018
 */

package state;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.PipedInputStream;
import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import state.Party;
import state.Player;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Player_ESTest extends Player_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
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
  //Test case number: 1
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Player player0 = new Player();
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte) (-113);
      byteArray0[3] = (byte) (-48);
      byteArray0[4] = (byte)21;
      byteArray0[5] = (byte)60;
      byteArray0[6] = (byte) (-17);
      byteArray0[7] = (byte)0;
      player0.unpack(byteArray0);
      float float0 = 0.0F;
      player0.setMoney(0.0F);
      player0.pack();
      // Undeclared exception!
      try { 
        player0.setJoinOK((Player) null, false);
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
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Player player0 = new Player((-848));
      player0.setMoney((-848));
      player0.getName();
      player0.pack();
      player0.getX();
      player0.type();
      player0.isConnected();
      player0.getName();
      MockPrintStream mockPrintStream0 = new MockPrintStream("Player-848");
      Locale locale0 = Locale.ENGLISH;
      Locale locale1 = locale0.stripExtensions();
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) "-7iEXoy%y|U8";
      objectArray0[1] = (Object) "Player-848";
      mockPrintStream0.printf(locale1, "n|P{IK&a!\"J", objectArray0);
      MockPrintStream mockPrintStream1 = null;
      try {
        mockPrintStream1 = new MockPrintStream(mockPrintStream0, true, "-7iEXoy%y|U8");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(Throwable e) {
         //
         // -7iEXoy%y|U8
         //
         verifyException("java.io.PrintStream", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.70805020110221
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Player player0 = new Player((-126), "", (-126));
      Player player1 = new Player();
      player0.getSubparty();
      player1.remove(player0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("9V=UKse24W", true);
      mockFileOutputStream0.release();
      player0.remove(player1);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      dataOutputStream0.writeFloat((short)4919);
      mockFileOutputStream0.release();
      dataOutputStream0.writeBoolean(true);
      player0.pack(dataOutputStream0);
      player0.setJoinOK(player1, true);
      player1.reset(false);
      player0.setJoinOK(player1, false);
      player0.getIP();
      player1.setMoney((-808.13934F));
      player1.getStrength();
      player0.getX();
      player1.isDead();
      player0.setDead((long) (short)4919, false);
      player1.setDead();
      assertEquals(1392409281320L, player1.getTimeOfDeath());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Player player0 = new Player(2, "", 2);
      Player player1 = new Player((short)4919, "", "Y;)yZ", (short)4919, (short)4919);
      player0.prev = (Party) player1;
      player0.setDead();
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-77);
      player1.unpack(byteArray0);
      MockFile mockFile0 = new MockFile("Y;)yZ", ")");
      // Undeclared exception!
      try { 
        MockFile.createTempFile(")", ")");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Prefix string too short
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Player player0 = new Player(10, "", "", 1230, 3869);
      Player player1 = new Player((-686), "", "", (-686), 3869);
      Player player2 = new Player(1);
      player1.next = (Party) player2;
      player2.gangStrength();
      player1.boss = (Party) player2;
      player0.setJoinOK(player1, false);
      player0.getStrength();
      player1.setDead((long) 1);
      player2.isDead();
      player0.setMoney(132.4489F);
      assertEquals(132.4489F, player0.getMoney(), 0.01F);
      
      float float0 = player2.getX();
      assertEquals(10.0F, float0, 0.01F);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.70805020110221
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          int int0 = 0;
          Player player0 = new Player(1668, "", "gui.ModuleBrowserDialog$ModuleFilter", 0, 0);
          player0.reset(false);
          player0.setDead();
          player0.setY(1668);
          player0.pack();
          player0.setZ((-542.644F));
          String string0 = "2Po8\"5hS=~";
          int int1 = 0;
          Player player1 = new Player((short)4919, "2Po8\"5hS=~", "", 0, 0);
          player0.setJoinOK(player1, false);
          player0.gangStrength();
          FileDescriptor fileDescriptor0 = new FileDescriptor();
          player1.id = 632;
          MockFileOutputStream mockFileOutputStream0 = null;
          try {
            mockFileOutputStream0 = new MockFileOutputStream(fileDescriptor0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.lang.RuntimePermission\" \"writeFileDescriptor\")
             // java.lang.Thread.getStackTrace(Thread.java:1559)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:434)
             // java.lang.SecurityManager.checkWrite(SecurityManager.java:954)
             // java.io.FileOutputStream.<init>(FileOutputStream.java:245)
             // org.evosuite.runtime.mock.java.io.MockFileOutputStream.<init>(MockFileOutputStream.java:114)
             // sun.reflect.GeneratedConstructorAccessor63.newInstance(Unknown Source)
             // sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
             // java.lang.reflect.Constructor.newInstance(Constructor.java:423)
             // org.evosuite.testcase.statements.ConstructorStatement$1.execute(ConstructorStatement.java:233)
             // org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:169)
             // org.evosuite.testcase.statements.ConstructorStatement.execute(ConstructorStatement.java:188)
             // org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:307)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:213)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:55)
             // java.util.concurrent.FutureTask.run(FutureTask.java:266)
             // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
             // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
             // java.lang.Thread.run(Thread.java:748)
             //
             verifyException("org.evosuite.runtime.sandbox.MSecurityManager", e);
          }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Player player0 = new Player(1028);
      player0.setMoney(1028);
      Party party0 = player0.gangBoss();
      player0.prev = party0;
      player0.setDead();
      player0.setConnected(true);
      player0.setConnected(true);
      player0.setMoney((-8.7742F));
      player0.setZ(1028);
      player0.reset(true);
      player0.getName();
      player0.setConnected(true);
      player0.getName();
      player0.isConnected();
      party0.prev = null;
      Player player1 = new Player((-2345));
      player0.setJoinOK(player1, true);
      player0.setJoinOK(player1, true);
      player0.getY();
      player0.setJoinOK(player1, true);
      Player player2 = new Player();
      player0.setJoinOK(player2, true);
      assertEquals(1028.0F, player0.getZ(), 0.01F);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Player player0 = new Player(1, "(K$?Pz>}2oM-z4;,bO", 1508);
      player0.setY(10.0F);
      player0.setConnected(false);
      player0.setX(1508);
      player0.getY();
      player0.getZ();
      player0.remove((Party) null);
      player0.setX((-2720.0F));
      player0.isDead();
      player0.isConnected();
      float float0 = player0.getX();
      assertEquals((-2720.0F), float0, 0.01F);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Player player0 = new Player((-424), " ", "Y1}5>Oa@%nPW", (-2183));
      Party party0 = player0.gangBoss();
      player0.next = party0;
      player0.pack();
      player0.gangStrength();
      player0.setX((-424));
      player0.setX((-424));
      party0.next = player0.next;
      party0.head = (Party) player0;
      player0.next.remove(party0);
      player0.isDead();
      player0.setDead();
      player0.getMoney();
      Player player1 = new Player();
      party0.remove(player1);
      player0.setConnected(true);
      player0.isDead();
      player0.setDead(1135L, false);
      assertEquals(1135L, player0.getTimeOfDeath());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Player player0 = new Player(4977, "KGNc.qs%Z>/^ ", "vW?v}ws9k|s", 0);
      player0.toString();
      assertEquals(0, player0.getPictureId());
      assertTrue(player0.isConnected());
      assertEquals("KGNc.qs%Z>/^ ", player0.getIP());
      assertEquals(1, player0.getStrength());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Player player0 = new Player(10, "WA88'zmU", "]nR:-m", 10, (-664));
      player0.id = (-155);
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)1;
      byteArray0[2] = (byte) (-55);
      byteArray0[3] = (byte)116;
      Party party0 = player0.head;
      player0.remove((Party) null);
      byteArray0[4] = (byte) (-118);
      byteArray0[5] = (byte)0;
      player0.setMoney((byte) (-55));
      player0.isDead();
      player0.pack();
      Player player1 = new Player(0, "gui.ModuleBrowserDialog$ModuleFilter", (-1697));
      player0.isJoinOK(player1, false);
      boolean boolean0 = player1.isJoinOK(player0, false);
      assertEquals((-55.0F), player0.getMoney(), 0.01F);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Player player0 = new Player(1);
      player0.setZ(10.0F);
      player0.getPictureId();
      System.setCurrentTimeMillis(1508);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.488327743368588
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Player player0 = new Player(4);
      player0.setConnected(true);
      player0.setDead(0L, true);
      player0.setConnected(true);
      Player player1 = new Player((short)4919);
      player1.boss = (Party) player0;
      player0.add(player1);
      player0.setDead();
      player0.getName();
      Player player2 = new Player();
      player2.setJoinOK(player0, false);
      player2.isJoinOK(player0, true);
      assertEquals(1392409281320L, player0.getTimeOfDeath());
      
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      DataInputStream dataInputStream1 = new DataInputStream(dataInputStream0);
      dataInputStream1.available();
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      player2.unpack(byteArray0);
      Player player3 = new Player(4919);
      player3.isConnected();
      player3.setDead((long) (byte)0, false);
      assertEquals("Player4919", player3.getName());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.639340587232432
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Player player0 = new Player(4);
      player0.setConnected(true);
      player0.setDead(0L, true);
      player0.setConnected(true);
      Player player1 = new Player((short)4919);
      player1.prev = (Party) player0;
      player1.boss = (Party) player0;
      player0.add(player1);
      player0.setDead();
      player0.getName();
      player0.setJoinOK(player1, true);
      player0.isJoinOK(player1, true);
      byte[] byteArray0 = player1.pack();
      player0.unpack(byteArray0);
      assertTrue(player0.isDead());
      
      boolean boolean0 = player1.isConnected();
      assertTrue(boolean0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.8310204811135162
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Player player0 = new Player((-1));
      Player player1 = new Player((short)4919, "", 29696);
      player0.setMoney((short)4919);
      player1.id = (int) (short)4919;
      player0.isJoinOK(player1, true);
      player0.id = (-1);
      player0.isJoinOK(player1, false);
      player0.isJoinOK(player1, false);
      player0.boss = (Party) player1;
      player0.remove(player1);
      System.setCurrentTimeMillis((-1L));
      player0.add(player1);
      player0.getSubparty();
      player0.isJoinOK(player1, false);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      player0.setJoinOK(player1, false);
      player0.isJoinOK(player1, true);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
      player1.pack(dataOutputStream0);
      System.setCurrentTimeMillis(4919);
      System.setCurrentTimeMillis(29696);
      player0.isJoinOK(player1, false);
      Player player2 = new Player(1);
      boolean boolean0 = player2.isJoinOK(player0, false);
      assertEquals(4919.0F, player0.getMoney(), 0.01F);
      assertFalse(boolean0);
  }
}