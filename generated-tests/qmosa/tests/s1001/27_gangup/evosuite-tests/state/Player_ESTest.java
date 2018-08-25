/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 09:47:35 GMT 2018
 */

package state;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.io.UnsupportedEncodingException;
import java.util.Enumeration;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
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
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Player player0 = new Player();
      player0.getY();
      player0.isConnected();
      player0.getX();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)43;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)3;
      byteArray0[4] = (byte)123;
      byteArray0[5] = (byte)0;
      player0.unpack(byteArray0);
      byteArrayOutputStream0.flush();
      byteArrayOutputStream0.write((-3494));
      DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
      dataOutputStream0.writeFloat((-3771.0F));
      dataOutputStream0.writeLong((-3348L));
      dataOutputStream0.writeLong((-3348L));
      player0.pack(dataOutputStream0);
      player0.getStrength();
      player0.setConnected(true);
      player0.setDead(2408L, false);
      player0.reset(false);
      Player player1 = new Player(1, "", (short)4919);
      player0.isJoinOK(player1, false);
      assertEquals(0L, player0.getTimeOfDeath());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = 1888;
      Player player0 = new Player(1888, "", 1383);
      Party party0 = player0.boss;
      boolean boolean0 = true;
      player0.reset(true);
      player0.setX(1217.0693F);
      MockFile mockFile0 = new MockFile("", "");
      MockPrintStream mockPrintStream0 = null;
      try {
        mockPrintStream0 = new MockPrintStream(mockFile0, "");
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
  /*Coverage entropy=2.833213344056216
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Player player0 = new Player();
      player0.setX(0.0F);
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)5;
      byteArray0[1] = (byte)1;
      byteArray0[2] = (byte)5;
      byteArray0[3] = (byte)70;
      byteArray0[4] = (byte) (-78);
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte)97;
      byteArray0[7] = (byte)6;
      byteArray0[8] = (byte)1;
      Player player1 = new Player((-1));
      player0.setJoinOK(player1, false);
      player0.unpack(byteArray0);
      player0.setX(1323.4F);
      player0.setY((byte)97);
      player0.getZ();
      player0.getZ();
      player0.gangStrength();
      player0.setMoney(1.0F);
      player0.pack();
      player0.setDead();
      float float0 = player0.getX();
      assertEquals(1.0F, player0.getMoney(), 0.01F);
      assertEquals(1323.4F, float0, 0.01F);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Player player0 = new Player(110, "wH=zIRbKG'&6@HvPH", 1991);
      Player player1 = new Player(1991, "wH=zIRbKG'&6@HvPH", (-398));
      player0.pack();
      player1.setX(110);
      player0.setJoinOK(player1, false);
      player0.setDead((long) 110, true);
      player0.type();
      player1.setDead((long) (short)4919, true);
      String string0 = "^@(O vmvUl";
      String string1 = "nf`=i9F^I";
      MockFile mockFile0 = new MockFile("^@(O vmvUl", "nf`=i9F^I");
      MockPrintStream mockPrintStream0 = null;
      try {
        mockPrintStream0 = new MockPrintStream(mockFile0, "");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(Throwable e) {
         //
         // 
         //
         verifyException("java.io.PrintStream", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Player player0 = new Player((-4580), "", "", (-4580), 4554);
      Player player1 = new Player((-733), (String) null, "/K+a-uN\"AD]+1w^<6", 2247, 0);
      player1.setDead((-886L));
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false, false, false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      player0.setZ(10.0F);
      SequenceInputStream sequenceInputStream1 = new SequenceInputStream(sequenceInputStream0, sequenceInputStream0);
      sequenceInputStream0.mark(0);
      sequenceInputStream1.close();
      DataInputStream dataInputStream0 = new DataInputStream(sequenceInputStream1);
      player1.unpack(dataInputStream0);
      player0.setJoinOK(player1, true);
      player0.setMoney((-4580));
      player1.setY((-733));
      assertEquals((-886L), player1.getTimeOfDeath());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.70805020110221
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Player player0 = new Player();
      player0.setDead();
      Player player1 = new Player((short)4919, "", "", (short)4919);
      player0.remove(player1);
      player1.setDead();
      player1.head = (Party) player0;
      player0.setJoinOK(player1, true);
      player0.add(player1);
      player0.setMoney(0.1F);
      player0.getTimeOfDeath();
      player0.id = 2559;
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)115;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)26;
      byteArray0[3] = (byte) (-1);
      player0.unpack(byteArray0);
      player0.setDead();
      player0.getTimeOfDeath();
      player0.toString();
      float float0 = player1.getX();
      assertEquals(1392409281320L, player1.getTimeOfDeath());
      assertEquals(10.0F, float0, 0.01F);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Player player0 = new Player();
      player0.reset(false);
      player0.setDead(2313L, false);
      player0.next = null;
      player0.getIP();
      player0.setY(2313L);
      player0.setMoney((-393.9042F));
      player0.getName();
      player0.setZ(0.0F);
      player0.setConnected(true);
      assertEquals((-393.9042F), player0.getMoney(), 0.01F);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Player player0 = new Player();
      player0.setDead(2536L, true);
      player0.remove((Party) null);
      player0.setZ(1556.0226F);
      player0.setDead();
      player0.getPictureId();
      player0.getPictureId();
      player0.setDead();
      player0.getTimeOfDeath();
      player0.getTimeOfDeath();
      player0.reset(false);
      assertEquals(0L, player0.getTimeOfDeath());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Player player0 = new Player();
      Player player1 = new Player();
      player0.isJoinOK(player1, false);
      player0.getMoney();
      player1.setDead(0L);
      player0.setMoney(58.158F);
      player0.getX();
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) null);
      PushbackInputStream pushbackInputStream1 = new PushbackInputStream(pushbackInputStream0, 210);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pushbackInputStream1, (short)4919);
      try { 
        pushbackInputStream0.unread((int) (short)4919);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.PushbackInputStream", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Player player0 = new Player();
      player0.getIP();
      player0.isDead();
      int int0 = 0;
      File file0 = MockFile.createTempFile("yd{Uop&lqR", "0.0.0.0");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      DataInputStream dataInputStream0 = new DataInputStream(mockFileInputStream0);
      try { 
        dataInputStream0.readUnsignedByte();
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.70805020110221
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Player player0 = new Player(1, "", " ", 1, 1);
      Player player1 = new Player((short)4919, " ", "", 1);
      player0.head = (Party) player1;
      player0.pack();
      player0.setDead(1L);
      player0.setConnected(true);
      player0.head.getSubparty();
      player1.setConnected(true);
      player0.setMoney(0.0F);
      player0.setX(0.0F);
      player1.add(player0.head);
      player0.setDead(885L);
      player1.setY((short)4919);
      player0.type();
      player0.toString();
      player0.isDead();
      player1.setDead(0L, false);
      assertEquals(4919.0F, player1.getY(), 0.01F);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.685945324669788
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Player player0 = new Player();
      player0.setX(0.0F);
      byte[] byteArray0 = new byte[9];
      byteArray0[1] = (byte)1;
      byteArray0[2] = (byte)5;
      byteArray0[3] = (byte)70;
      byteArray0[4] = (byte) (-78);
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte)97;
      byteArray0[7] = (byte)6;
      byteArray0[8] = (byte)1;
      Player player1 = new Player((-1));
      player0.setJoinOK(player1, false);
      player0.unpack(byteArray0);
      player0.setX(1323.4F);
      player0.setY((byte)97);
      player0.getZ();
      player0.getZ();
      player0.gangStrength();
      byte[] byteArray1 = player0.pack();
      player0.setDead();
      player0.unpack(byteArray1);
      assertEquals(1392409281320L, player0.getTimeOfDeath());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.0431918705451206
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Player player0 = new Player(773, "", 912);
      Player player1 = new Player(773, "", (-3363));
      player0.remove(player1);
      Player player2 = new Player(236, "", "Player", 912);
      Party party0 = player0.next;
      player2.remove((Party) null);
      player2.setDead((-3941L));
      player0.setJoinOK(player2, false);
      player2.next = null;
      player1.setDead((-4686L), false);
      player0.isJoinOK(player2, false);
      boolean boolean0 = player1.isJoinOK(player2, true);
      assertEquals((-3941L), player2.getTimeOfDeath());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.2102535776209735
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Player player0 = new Player(773, "", 912);
      Player player1 = new Player(773, "", (-3363));
      player0.remove(player1);
      Player player2 = new Player((short)4919, "", "Player", 912);
      Party party0 = player0.next;
      player2.remove((Party) null);
      player2.setDead((-3941L));
      player0.setJoinOK(player2, false);
      player2.next = null;
      player0.isJoinOK(player2, false);
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)19;
      player1.unpack(byteArray0);
      boolean boolean0 = player0.isJoinOK(player2, true);
      assertEquals((-3941L), player2.getTimeOfDeath());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.9730014063936125
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Player player0 = new Player(Integer.MAX_VALUE, "rO-", Integer.MAX_VALUE);
      Player player1 = new Player(4919);
      player1.next = (Party) player0;
      player0.boss = (Party) player1;
      player0.setJoinOK(player1, true);
      player0.setMoney(Integer.MAX_VALUE);
      player0.isJoinOK(player1, false);
      System.setCurrentTimeMillis((short)4919);
      System.setCurrentTimeMillis(4919);
      System.setCurrentTimeMillis(3096L);
      player1.setJoinOK(player0, true);
      System.setCurrentTimeMillis(0L);
      System.setCurrentTimeMillis(1392409281297L);
      player0.prev = player1.next;
      player1.isJoinOK(player0, true);
      System.setCurrentTimeMillis(4919);
      byte[] byteArray0 = new byte[0];
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      player1.isJoinOK(player0, true);
      player0.isJoinOK(player1, true);
      assertEquals(2.14748365E9F, player0.getMoney(), 0.01F);
      
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, false, false);
      System.setCurrentTimeMillis(1392409281297L);
      System.setCurrentTimeMillis((short)4919);
      Player player2 = new Player((short)4919, "Utw", "Utw", (-1), 3297);
      player1.isJoinOK(player2, false);
      boolean boolean0 = player1.isJoinOK(player2, false);
      assertFalse(boolean0);
  }
}