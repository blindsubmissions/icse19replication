/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 06:49:54 GMT 2018
 */

package state;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileDescriptor;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
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
      player0.setZ((-1.0F));
      Player player1 = new Player();
      boolean boolean0 = player0.isJoinOK(player1, false);
      assertEquals((-1.0F), player0.getZ(), 0.01F);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Player player0 = new Player(0);
      Player player1 = new Player((short)4919);
      assertEquals(10.0F, player1.getX(), 0.01F);
      
      player1.setX(0);
      Player player2 = new Player();
      boolean boolean0 = player1.isJoinOK(player0, true);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Player player0 = new Player(0);
      int int0 = player0.gangStrength();
      assertEquals(1, int0);
      
      float float0 = player0.getY();
      assertEquals(0.0F, float0, 0.01F);
      
      Player player1 = new Player();
      assertEquals(0, player1.getPictureId());
      assertTrue(player1.isConnected());
      assertEquals("0.0.0.0", player1.getIP());
      assertEquals("Player-1", player1.getName());
      assertFalse(player1.isDead());
      assertEquals(10.0F, player1.getX(), 0.01F);
      assertEquals(0L, player1.getTimeOfDeath());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Player player0 = new Player(1100);
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)53;
      byteArray0[4] = (byte)55;
      byteArray0[5] = (byte)55;
      byteArray0[6] = (byte)13;
      byteArray0[7] = (byte)0;
      byteArray0[8] = (byte)5;
      player0.unpack(byteArray0);
      assertEquals(0, player0.getPictureId());
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertTrue(player0.isConnected());
      assertEquals("Player1100", player0.toString());
      assertEquals("0.0.0.0", player0.getIP());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          Player player0 = new Player(0);
          Party party0 = player0.next;
          player0.remove((Party) null);
          player0.getStrength();
          player0.pack();
          player0.setDead();
          player0.getTimeOfDeath();
          FileDescriptor fileDescriptor0 = new FileDescriptor();
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
             // sun.reflect.GeneratedConstructorAccessor55.newInstance(Unknown Source)
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
  //Test case number: 5
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Player player0 = new Player(969, (String) null, "M[CH$UNOqHz{'rD", 969, 1);
      player0.setY(0.0F);
      Player player1 = new Player((short)4919, "M[CH$UNOqHz{'rD", (String) null, (-327), 1124);
      player0.next = (Party) player1;
      assertEquals((-327), player1.getPictureId());
      assertEquals(1124, player1.getStrength());
      
      player0.setY(0.0F);
      float float0 = player0.getX();
      assertEquals(10.0F, float0, 0.01F);
      
      player0.setY(0.0F);
      assertTrue(player0.isConnected());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Player player0 = new Player(1, "m", 1);
      player0.reset(false);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      
      Player player1 = new Player((-84));
      Player player2 = new Player((short)4919, "lf_rZ1)M", "T1Kb0Tz*;i", (short)4919);
      Player player3 = new Player(5);
      boolean boolean0 = player1.isJoinOK(player2, true);
      assertEquals("0.0.0.0", player1.getIP());
      assertEquals("lf_rZ1)M", player2.getIP());
      assertEquals(4919, player2.getPictureId());
      assertEquals(1, player2.getStrength());
      assertTrue(player2.isConnected());
      assertFalse(boolean0);
      assertEquals(0, player1.getPictureId());
      assertEquals("Player-84", player1.getName());
      assertEquals(0.0F, player2.getY(), 0.01F);
      assertEquals(10.0F, player2.getX(), 0.01F);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)49;
      Player player0 = new Player((-2835), " ", (-3259));
      System.setCurrentTimeMillis((byte)49);
      System.setCurrentTimeMillis((-3259));
      player0.reset(true);
      System.setCurrentTimeMillis((-1L));
      System.setCurrentTimeMillis((-2835));
      System.setCurrentTimeMillis(3174L);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Player player0 = new Player(0);
      player0.setY(3678.0F);
      player0.getMoney();
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-86);
      byteArray0[1] = (byte) (-71);
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte) (-117);
      byteArray0[4] = (byte)5;
      byteArray0[5] = (byte)1;
      byteArray0[6] = (byte) (-1);
      byteArray0[7] = (byte)0;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      boolean boolean0 = player0.unpack(dataInputStream0);
      assertEquals(3678.0F, player0.getY(), 0.01F);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Player player0 = new Player();
      player0.setDead();
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      // Undeclared exception!
      try { 
        dataInputStream0.close();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.FilterInputStream", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Player player0 = new Player((-2572), "N$c", 4136);
      float float0 = player0.getMoney();
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(0.0F, float0, 0.01F);
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(4136, player0.getPictureId());
      assertEquals(1, player0.getStrength());
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Player player0 = new Player();
      String string0 = player0.getName();
      assertEquals("Player-1", string0);
      
      int int0 = player0.getStrength();
      assertEquals(0, player0.getPictureId());
      assertEquals(1, int0);
      assertTrue(player0.isConnected());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals("0.0.0.0", player0.getIP());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Player player0 = new Player((-414));
      Party party0 = new Party(1951);
      player0.prev = party0;
      player0.setX(555.5F);
      player0.setDead((long) (-414));
      player0.isConnected();
      player0.setMoney(555.5F);
      player0.toString();
      assertEquals((-414L), player0.getTimeOfDeath());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Player player0 = new Player(0);
      Player player1 = new Player((short)4919);
      player0.setJoinOK(player1, false);
      Party party0 = new Party();
      player0.add(party0);
      player0.getSubparty();
      player0.setX(0);
      player0.isDead();
      player0.setX((-1029.421F));
      player0.pack();
      player0.getTimeOfDeath();
      player0.getName();
      assertEquals((-1029.421F), player0.getX(), 0.01F);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.833213344056216
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Player player0 = new Player((-2129), "?3cmQ", (-2129));
      Player player1 = new Player((short)4919, "", " s", 1135, (-2129));
      player0.setDead();
      player1.setConnected(true);
      Player player2 = new Player(0, "?3cmQ", " s", (-782));
      player0.setMoney(1001.8F);
      player1.setJoinOK(player2, true);
      player0.setJoinOK(player1, false);
      player0.getZ();
      player0.getPictureId();
      player0.type();
      player0.getIP();
      player0.isDead();
      player0.toString();
      assertEquals(1001.8F, player0.getMoney(), 0.01F);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Player player0 = new Player(0);
      player0.gangStrength();
      byte[] byteArray0 = player0.pack();
      player0.isConnected();
      player0.unpack(byteArray0);
      player0.setX((-470.2F));
      assertEquals((-470.2F), player0.getX(), 0.01F);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Player player0 = new Player(0);
      player0.setX(0);
      player0.add(player0);
      player0.setDead();
      player0.setDead();
      player0.setJoinOK(player0, true);
      player0.isJoinOK(player0, true);
      System.setCurrentTimeMillis(1L);
      System.setCurrentTimeMillis(1L);
      System.setCurrentTimeMillis((-420));
      System.setCurrentTimeMillis(1L);
      System.setCurrentTimeMillis(15000L);
      player0.isJoinOK(player0, false);
      player0.isJoinOK(player0, false);
      Player player1 = new Player(164);
      boolean boolean0 = player0.isJoinOK(player1, false);
      assertEquals(1392409281320L, player0.getTimeOfDeath());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.2102535776209735
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      System.setCurrentTimeMillis((-1L));
      Player player0 = new Player(1);
      player0.setDead();
      Player player1 = new Player(1, "", "", 5, 162);
      player0.setJoinOK(player1, true);
      player1.isJoinOK(player0, true);
      System.setCurrentTimeMillis(1);
      System.setCurrentTimeMillis(0L);
      System.setCurrentTimeMillis(0L);
      System.setCurrentTimeMillis(5464L);
      System.setCurrentTimeMillis(1392409296320L);
      player0.isJoinOK(player1, true);
      player1.isJoinOK(player0, false);
      System.setCurrentTimeMillis((short)4919);
  }
}