/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 12:58:00 GMT 2018
 */

package state;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.PushbackInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;
import state.Packable;
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
      Player player0 = new Player();
      Party party0 = player0.gangBoss();
      player0.prev = party0;
      player0.type();
      player0.getTimeOfDeath();
      MockPrintStream mockPrintStream0 = null;
      try {
        mockPrintStream0 = new MockPrintStream("", "");
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
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Player player0 = new Player(3, "S", "S", (-1909));
      Player player1 = new Player((-4039), "S", 2042);
      player0.setJoinOK(player1, false);
      assertEquals("0.0.0.0", player1.getIP());
      
      player0.reset(false);
      player0.getIP();
      assertEquals((-1909), player0.getPictureId());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertTrue(player0.isConnected());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.70805020110221
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Player player0 = new Player(50);
      Player player1 = new Player(0, "bpc2vx 9nA}iK6[", "Tb.1bh_ZOdxR#tu'!", 1456, 0);
      player1.setX(0);
      player1.gangStrength();
      player0.setDead((long) 1456, false);
      player0.boss = (Party) player1;
      player0.isJoinOK(player1, false);
      player0.setY((-3324.956F));
      player1.setX((short)4919);
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(mockFileInputStream0);
      mockFileInputStream0.mark(1456);
      DataInputStream dataInputStream0 = new DataInputStream(pushbackInputStream0);
      player1.unpack(dataInputStream0);
      player1.getStrength();
      player0.setJoinOK(player1, false);
      player1.setDead();
      assertEquals(1392409281320L, player1.getTimeOfDeath());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=3.178053830347946
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Player player0 = new Player(10, "gCK?p", "gCK?p", 10);
      byte[] byteArray0 = player0.pack();
      player0.setMoney(10);
      player0.getMoney();
      player0.setDead(1843L, false);
      player0.type();
      player0.setZ(0.0F);
      Player player1 = new Player((-884), "gCK?p", 930);
      player0.unpack(byteArray0);
      player0.setJoinOK(player1, true);
      player1.setDead();
      player1.setX(1855.2F);
      player1.next = (Party) player0;
      player0.toString();
      player1.gangStrength();
      player1.getIP();
      player0.setDead(1150L, false);
      player1.type();
      player1.setJoinOK(player0, true);
      player1.pack();
      player0.setY((-1.0F));
      player0.isConnected();
      player1.getName();
      assertTrue(player1.isDead());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Player player0 = new Player(4, "ft?VcAp:", 4);
      player0.setZ(0.0F);
      player0.getY();
      player0.id = 4;
      Party party0 = new Party();
      party0.next = (Party) player0;
      player0.add(party0);
      player0.reset(true);
      player0.getPictureId();
      player0.toString();
      player0.type();
      player0.gangStrength();
      player0.setDead((long) 4, true);
      player0.setZ(0.0F);
      player0.gangStrength();
      player0.getIP();
      player0.setX(0.0F);
      assertEquals(4L, player0.getTimeOfDeath());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Player player0 = new Player();
      Player player1 = new Player(0, "y8lvV", 0);
      player0.setJoinOK(player1, false);
      player0.setX((-480.323F));
      player0.setMoney(0.0F);
      player0.setX(0.0F);
      player0.reset(true);
      Player player2 = new Player((short)4919, "und`o{A,", "und`o{A,", (short)4919);
      player0.setJoinOK(player2, false);
      player0.getTimeOfDeath();
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = player0.pack();
      byteArray0[0] = (byte) (-33);
      byteArray0[1] = (byte) (-75);
      player2.head = (Party) player0;
      player0.setZ(0.0F);
      byteArray0[2] = (byte)4;
      player0.unpack(byteArray0);
      player0.unpack(byteArray1);
      player0.getTimeOfDeath();
      byte[] byteArray2 = player0.pack();
      player0.setDead((long) (byte) (-75));
      player2.isConnected();
      player2.setMoney((-480.323F));
      player2.getX();
      player2.unpack(byteArray2);
      assertEquals((-75L), player0.getTimeOfDeath());
      assertEquals((-1), player0.getId());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Player player0 = new Player(0, "module.ModuleBrowserDialog$ModuleFilter", "module.ModuleBrowserDialog$ModuleFilter", 0, 0);
      player0.setConnected(true);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertTrue(player0.isConnected());
      assertEquals(0, player0.getStrength());
      assertEquals(0, player0.getPictureId());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Player player0 = new Player(0, "", 0);
      Player player1 = new Player();
      player0.head = (Party) player1;
      player0.prev = (Party) player1;
      player0.setY(0);
      player0.pack();
      assertEquals(10.0F, player0.getX(), 0.01F);
      
      player0.setX(0.0F);
      player0.isDead();
      player0.getY();
      player0.getX();
      player0.setX(0.0F);
      long long0 = player0.getTimeOfDeath();
      assertEquals(0L, long0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Player player0 = new Player(4, "Player.pack(): *** ERROR *** [IO] pack failed! current state is inconsistent: ", "Player.pack(): *** ERROR *** [IO] pack failed! current state is inconsistent: ", 4);
      player0.setDead();
      player0.getX();
      boolean boolean0 = player0.isDead();
      assertEquals(1392409281320L, player0.getTimeOfDeath());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Player player0 = new Player(0, "EK^,LB", "EK^,LB", 0);
      int int0 = player0.getPictureId();
      assertEquals(0, int0);
      
      Player player1 = new Player();
      player1.setZ(0);
      player0.isJoinOK(player1, false);
      assertEquals("0.0.0.0", player1.getIP());
      assertEquals(0.0F, player1.getZ(), 0.01F);
      assertEquals(0, player1.getPictureId());
      assertEquals("Player-1", player1.getName());
      
      player0.toString();
      float float0 = player0.getX();
      assertEquals(10.0F, float0, 0.01F);
      
      player0.getZ();
      int int1 = player0.gangStrength();
      assertEquals(1, int1);
      
      player0.setY(0.0F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertTrue(player0.isConnected());
      assertFalse(player0.isDead());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.833213344056216
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Player player0 = new Player(3866, "]kAuDGF@", "", 3866);
      player0.getSubparty();
      player0.setZ(682.237F);
      player0.getTimeOfDeath();
      player0.id = 3866;
      Player player1 = new Player(3866, "state.Player$JoinInfo", 699);
      player0.setJoinOK(player1, false);
      Player player2 = new Player();
      player2.setDead();
      player0.isJoinOK(player1, false);
      player0.toString();
      player2.getX();
      player1.getZ();
      player1.gangStrength();
      player2.setY(0.1F);
      assertEquals(1392409281320L, player2.getTimeOfDeath());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.7072697097848133
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Player player0 = new Player(2, "*y%U$G(?P", "UH*Sq,dt&sn", 2);
      Player player1 = new Player();
      player1.getSubparty();
      player0.setZ((-2133.87F));
      player1.getTimeOfDeath();
      Player player2 = new Player((-950), ".*-+tw\"xR_SJ/}Y[t", 2002);
      player1.setJoinOK(player0, true);
      Player player3 = new Player();
      player0.setDead();
      player1.isJoinOK(player0, false);
      player1.toString();
      player2.getX();
      Player player4 = new Player(2);
      player2.getZ();
      int int0 = Packable.GAME_STATE;
      player2.setY((-472.57834F));
      assertEquals((-472.57834F), player2.getY(), 0.01F);
  }
}
