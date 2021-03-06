/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 07 14:27:31 GMT 2018
 */

package visu.handball.moves.model;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import visu.handball.moves.model.PassEvent;
import visu.handball.moves.model.player.Defender;
import visu.handball.moves.model.player.MovePoint;
import visu.handball.moves.model.player.Offender;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PassEvent_ESTest extends PassEvent_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Offender offender0 = new Offender(2408, 2408);
      PassEvent passEvent0 = new PassEvent(offender0, 2408, 1);
      passEvent0.setGoalPass(false);
      assertFalse(passEvent0.isGoalPass());
      assertFalse(passEvent0.isDestinationPointSet());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Offender offender0 = new Offender(2385, 2385);
      PassEvent passEvent0 = new PassEvent(offender0, 2385, 1);
      PassEvent passEvent1 = new PassEvent(offender0, 2385, 1);
      boolean boolean0 = passEvent0.equals(passEvent1);
      assertFalse(passEvent1.isDestinationPointSet());
      assertTrue(boolean0);
      assertFalse(passEvent1.isGoalPass());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Offender offender0 = new Offender(2385, 2385);
      PassEvent passEvent0 = new PassEvent(offender0, 2385, 1);
      boolean boolean0 = passEvent0.equals(offender0);
      assertFalse(boolean0);
      assertFalse(passEvent0.isDestinationPointSet());
      assertFalse(passEvent0.isGoalPass());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.34883209584303193
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Offender offender0 = new Offender(2438, 2438);
      PassEvent passEvent0 = new PassEvent(offender0, 2438, 1);
      PassEvent passEvent1 = new PassEvent(offender0, 2438, 2438);
      boolean boolean0 = passEvent0.equals(passEvent1);
      assertFalse(passEvent1.equals((Object)passEvent0));
      assertFalse(boolean0);
      assertFalse(passEvent1.isGoalPass());
      assertFalse(passEvent1.isDestinationPointSet());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Offender offender0 = new Offender(0, 0);
      PassEvent passEvent0 = new PassEvent(offender0, 1, 0);
      String string0 = passEvent0.toString();
      assertEquals("Passweg nicht definiert", string0);
      assertFalse(passEvent0.isDestinationPointSet());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Offender offender0 = new Offender(2429, 2429);
      PassEvent passEvent0 = new PassEvent(offender0, 2429, 1);
      passEvent0.setDestinationPlayer(offender0, true);
      String string0 = passEvent0.toString();
      assertEquals("Pass zu Spieler \" Angreifer 1\"", string0);
      
      boolean boolean0 = passEvent0.equals(passEvent0);
      assertFalse(passEvent0.isDestinationPointSet());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Offender offender0 = new Offender((-14), (-14));
      PassEvent passEvent0 = new PassEvent(offender0, (-14), (-14));
      passEvent0.setGoalPass(true);
      passEvent0.toString();
      assertTrue(passEvent0.isDestinationPointSet());
      assertTrue(passEvent0.isGoalPass());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Offender offender0 = new Offender((-4431), (-4431));
      PassEvent passEvent0 = new PassEvent(offender0, (-4431), 1);
      boolean boolean0 = passEvent0.equals((Object) null);
      assertFalse(passEvent0.isDestinationPointSet());
      assertFalse(boolean0);
      assertFalse(passEvent0.isGoalPass());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.30463609734923813
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Offender offender0 = new Offender(2403, 2403);
      PassEvent passEvent0 = new PassEvent(offender0, 2403, 1);
      PassEvent passEvent1 = new PassEvent(offender0, 1, 1);
      boolean boolean0 = passEvent0.equals(passEvent1);
      assertFalse(boolean0);
      assertFalse(passEvent1.isGoalPass());
      assertFalse(passEvent1.isDestinationPointSet());
      assertFalse(passEvent1.equals((Object)passEvent0));
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.908908734898781
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Offender offender0 = new Offender(2446, 2446);
      PassEvent passEvent0 = new PassEvent(offender0, 2446, 1);
      PassEvent passEvent1 = new PassEvent(offender0, 2446, 1);
      assertTrue(passEvent1.equals((Object)passEvent0));
      
      passEvent1.setDestinationPlayer(offender0, true);
      boolean boolean0 = passEvent0.equals(passEvent1);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.7509687782493434
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Offender offender0 = new Offender(2413, 2413);
      PassEvent passEvent0 = new PassEvent(offender0, 2413, 1);
      passEvent0.setDestinationPlayer(offender0, true);
      PassEvent passEvent1 = new PassEvent(offender0, 2413, 1);
      boolean boolean0 = passEvent0.equals(passEvent1);
      assertFalse(boolean0);
      assertFalse(passEvent0.isDestinationPointSet());
      assertFalse(passEvent1.isGoalPass());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.45056120886630463
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Offender offender0 = new Offender((-4431), (-4431));
      PassEvent passEvent0 = new PassEvent(offender0, (-4431), 1);
      PassEvent passEvent1 = new PassEvent(offender0, (-4431), 1);
      assertTrue(passEvent1.equals((Object)passEvent0));
      
      MovePoint movePoint0 = new MovePoint(1, 1);
      passEvent0.destinationPoint = movePoint0;
      boolean boolean0 = passEvent0.equals(passEvent1);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.5875009311062074
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Offender offender0 = new Offender(2400, 2400);
      PassEvent passEvent0 = new PassEvent(offender0, 2400, 1);
      PassEvent passEvent1 = new PassEvent(offender0, 2400, 1);
      assertFalse(passEvent1.isDestinationPointSet());
      
      passEvent1.setDestinationPoint(2400, 1, false);
      boolean boolean0 = passEvent0.equals(passEvent1);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.3250829733914482
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Offender offender0 = new Offender(2393, 2393);
      PassEvent passEvent0 = new PassEvent(offender0, 2393, 1);
      PassEvent passEvent1 = new PassEvent(offender0, 1, 2393);
      Defender defender0 = new Defender(2393, 2393);
      PassEvent passEvent2 = new PassEvent(defender0, 1, 2393);
      boolean boolean0 = passEvent2.equals(passEvent1);
      assertFalse(passEvent2.isDestinationPointSet());
      assertFalse(boolean0);
      assertFalse(passEvent2.isGoalPass());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.7549967581308246
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Offender offender0 = new Offender(2385, 2385);
      PassEvent passEvent0 = new PassEvent(offender0, 2385, 1);
      passEvent0.setGoalPass(true);
      PassEvent passEvent1 = new PassEvent(offender0, 2385, 1);
      boolean boolean0 = passEvent0.equals(passEvent1);
      assertTrue(passEvent0.isDestinationPointSet());
      assertFalse(passEvent1.isDestinationPointSet());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.9404479886553263
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Offender offender0 = new Offender(0, 0);
      PassEvent passEvent0 = new PassEvent(offender0, 0, 1);
      PassEvent passEvent1 = new PassEvent(offender0, 0, 1);
      MovePoint movePoint0 = new MovePoint(1, 1);
      passEvent0.destinationPoint = movePoint0;
      passEvent1.destinationPoint = movePoint0;
      boolean boolean0 = passEvent0.equals(passEvent1);
      assertTrue(passEvent1.equals((Object)passEvent0));
      assertFalse(passEvent1.isDestinationPointSet());
      assertFalse(passEvent1.isGoalPass());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.5481178804418445
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Offender offender0 = new Offender(0, 0);
      PassEvent passEvent0 = new PassEvent(offender0, 0, 1);
      PassEvent passEvent1 = new PassEvent(offender0, 0, 1);
      assertTrue(passEvent1.equals((Object)passEvent0));
      
      Offender offender1 = new Offender(0, 0);
      passEvent1.setPlayer(offender1);
      MovePoint movePoint0 = new MovePoint(2, 2);
      passEvent0.destinationPoint = movePoint0;
      passEvent1.destinationPoint = movePoint0;
      boolean boolean0 = passEvent0.equals(passEvent1);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.30463609734923813
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Offender offender0 = new Offender(0, 0);
      PassEvent passEvent0 = new PassEvent(offender0, 0, 1);
      PassEvent passEvent1 = new PassEvent(offender0, 0, 0);
      MovePoint movePoint0 = new MovePoint(1, 1);
      passEvent0.destinationPoint = movePoint0;
      passEvent1.destinationPoint = passEvent0.destinationPoint;
      boolean boolean0 = passEvent0.equals(passEvent1);
      assertFalse(passEvent1.isDestinationPointSet());
      assertFalse(boolean0);
      assertFalse(passEvent1.isGoalPass());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.2711893730418441
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Offender offender0 = new Offender(0, 0);
      PassEvent passEvent0 = new PassEvent(offender0, 0, 1);
      PassEvent passEvent1 = new PassEvent(offender0, 1, 1);
      MovePoint movePoint0 = new MovePoint(1, 1);
      passEvent0.destinationPoint = movePoint0;
      passEvent1.destinationPoint = movePoint0;
      boolean boolean0 = passEvent0.equals(passEvent1);
      assertFalse(passEvent1.isDestinationPointSet());
      assertFalse(boolean0);
      assertFalse(passEvent1.isGoalPass());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.8377716126398524
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Offender offender0 = new Offender(53, 53);
      PassEvent passEvent0 = new PassEvent(offender0, 53, 1);
      PassEvent passEvent1 = new PassEvent(offender0, 53, 1);
      passEvent1.setDestinationPlayer(offender0, false);
      MovePoint movePoint0 = new MovePoint(1, 1);
      passEvent0.destinationPoint = movePoint0;
      passEvent1.destinationPoint = movePoint0;
      boolean boolean0 = passEvent0.equals(passEvent1);
      assertFalse(passEvent1.equals((Object)passEvent0));
      assertTrue(passEvent1.isDestinationPointSet());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.806504609875222
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Offender offender0 = new Offender(0, 0);
      PassEvent passEvent0 = new PassEvent(offender0, 0, 1);
      passEvent0.setDestinationPlayer(offender0, false);
      PassEvent passEvent1 = new PassEvent(offender0, 0, 1);
      MovePoint movePoint0 = new MovePoint(1, 1);
      passEvent0.destinationPoint = movePoint0;
      passEvent1.destinationPoint = passEvent0.destinationPoint;
      boolean boolean0 = passEvent0.equals(passEvent1);
      assertTrue(passEvent0.isDestinationPointSet());
      assertFalse(passEvent1.isDestinationPointSet());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.6885673693022827
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Offender offender0 = new Offender(0, 0);
      PassEvent passEvent0 = new PassEvent(offender0, 0, 1);
      PassEvent passEvent1 = new PassEvent(offender0, 0, 1);
      passEvent0.setGoalPass(true);
      MovePoint movePoint0 = new MovePoint(1, 1);
      passEvent0.destinationPoint = movePoint0;
      passEvent1.destinationPoint = passEvent0.destinationPoint;
      boolean boolean0 = passEvent1.equals(passEvent0);
      assertTrue(passEvent0.isDestinationPointSet());
      assertFalse(passEvent1.isDestinationPointSet());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.3250829733914482
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Offender offender0 = new Offender(0, 0);
      PassEvent passEvent0 = new PassEvent(offender0, 0, 1);
      PassEvent passEvent1 = new PassEvent(offender0, 0, 1);
      assertFalse(passEvent1.isDestinationPointSet());
      
      passEvent1.setDestinationPoint(1, 0, false);
      MovePoint movePoint0 = new MovePoint(1, 1);
      passEvent0.destinationPoint = movePoint0;
      boolean boolean0 = passEvent1.equals(passEvent0);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.34883209584303193
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Offender offender0 = new Offender(0, 0);
      PassEvent passEvent0 = new PassEvent(offender0, 0, 1);
      PassEvent passEvent1 = new PassEvent(offender0, 0, 1);
      assertFalse(passEvent1.isDestinationPointSet());
      
      passEvent1.setDestinationPoint(1, 0, false);
      MovePoint movePoint0 = new MovePoint(1, 1);
      movePoint0.setCurrent_x(0);
      passEvent0.destinationPoint = movePoint0;
      boolean boolean0 = passEvent1.equals(passEvent0);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.806504609875222
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Offender offender0 = new Offender(2423, 2423);
      PassEvent passEvent0 = new PassEvent(offender0, 2423, 1);
      PassEvent passEvent1 = new PassEvent(offender0, 2423, 1);
      passEvent0.setDestinationPlayer(offender0, true);
      assertFalse(passEvent0.equals((Object)passEvent1));
      
      passEvent1.setDestinationPlayer(offender0, true);
      boolean boolean0 = passEvent0.equals(passEvent1);
      assertTrue(passEvent0.equals((Object)passEvent1));
      assertTrue(boolean0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.7509687782493434
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Offender offender0 = new Offender(2435, 2435);
      PassEvent passEvent0 = new PassEvent(offender0, 2435, 1);
      PassEvent passEvent1 = new PassEvent(offender0, 2435, 1);
      assertTrue(passEvent1.equals((Object)passEvent0));
      
      Offender offender1 = new Offender(2435, 2);
      passEvent1.setDestinationPlayer(offender1, true);
      passEvent0.setDestinationPlayer(offender0, true);
      boolean boolean0 = passEvent0.equals(passEvent1);
      assertFalse(boolean0);
  }
}
