/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 15:55:56 GMT 2018
 */

package org.jcvi.jillion.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jcvi.jillion.core.Range;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Range_ESTest extends Range_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=3.0910424533583143
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.RESIDUE_BASED;
      long long0 = (-573L);
      Range.of(range_CoordinateSystem0, (-573L), (-573L));
      String string0 = "H9's";
      // Undeclared exception!
      try { 
        Range.parseRange("H9's", range_CoordinateSystem0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // can not parse H9's into a Range
         //
         verifyException("org.jcvi.jillion.core.Range", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Range.Builder range_Builder0 = new Range.Builder();
      long long0 = (-758L);
      range_Builder0.shift(215L);
      range_Builder0.expandBegin((-758L));
      range_Builder0.contractEnd((-758L));
      range_Builder0.expandBegin((-758L));
      // Undeclared exception!
      try { 
        range_Builder0.copy();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // length can not be negative
         //
         verifyException("org.jcvi.jillion.core.Range$Builder", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=3.4657359027997248
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Range range0 = Range.of((-18L));
      range0.getBegin();
      Range.of(0L);
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.SPACE_BASED;
      Range.Builder range_Builder0 = new Range.Builder(range_CoordinateSystem0, (-1271L), (-609L));
      range_Builder0.build();
      // Undeclared exception!
      try { 
        Range.ofLength((-18L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must be >=0
         //
         verifyException("org.jcvi.jillion.core.Range$Builder", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=3.332204510175204
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Range range0 = Range.of(1021L, 1021L);
      Range range1 = Range.ofLength(1021L);
      boolean boolean0 = range0.startsBefore(range1);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=3.9512437185814298
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.RESIDUE_BASED;
      Range range0 = Range.of(range_CoordinateSystem0, 0L, 1353L);
      range0.equals(range_CoordinateSystem0);
      Range.CoordinateSystem range_CoordinateSystem1 = Range.CoordinateSystem.ZERO_BASED;
      Range.of((-264L), 1353L);
      Range range1 = Range.ofLength(1353L);
      range0.complement(range1);
      Range.Builder range_Builder0 = new Range.Builder(range_CoordinateSystem1, 0L, 1784L);
      Range.Builder range_Builder1 = range_Builder0.shift(1353L);
      Range range2 = range_Builder0.build();
      range2.iterator();
      Range.of(229L);
      Range.Builder range_Builder2 = range_Builder1.contractBegin(0L);
      range2.iterator();
      range0.getBegin();
      range_Builder1.expandBegin(1233L);
      Range.Builder range_Builder3 = range_Builder0.contractBegin(0L);
      assertSame(range_Builder3, range_Builder2);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=3.36274100073709
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      long long0 = (-361L);
      Range range0 = Range.of((-361L), 0L);
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.ZERO_BASED;
      long long1 = (-2147483648L);
      range0.spliterator();
      Range range1 = Range.of(range_CoordinateSystem0, (-2147483648L), 689L);
      // Undeclared exception!
      try { 
        range1.split((-2147483648L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // max splitLength must be >= 1
         //
         verifyException("org.jcvi.jillion.core.Range", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.8943995444300383
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Range.Builder range_Builder0 = new Range.Builder();
      range_Builder0.contractEnd(0L);
      Range range0 = Range.ofLength(0L);
      Range range1 = range0.asRange();
      long long0 = 1378L;
      range1.getBegin();
      Range range2 = Range.ofLength(0L);
      // Undeclared exception!
      try { 
        range2.split(0L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // max splitLength must be >= 1
         //
         verifyException("org.jcvi.jillion.core.Range", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.8969882423813793
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.SPACE_BASED;
      Range range0 = Range.of(range_CoordinateSystem0, 942L, 942L);
      range0.getLength();
      // Undeclared exception!
      try { 
        Range.parseRange("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // can not parse  into a Range
         //
         verifyException("org.jcvi.jillion.core.Range", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.9412316867217543
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      long long0 = (-1302L);
      Range range0 = Range.of((-1302L));
      // Undeclared exception!
      try { 
        range0.intersects((Range) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null Range used in intersection operation.
         //
         verifyException("org.jcvi.jillion.core.Range", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=3.332204510175204
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Range range0 = Range.ofLength(2705L);
      range0.split(2705L);
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.ZERO_BASED;
      range0.toString(range_CoordinateSystem0);
      Range.Builder range_Builder0 = new Range.Builder(0L);
      Range.Builder range_Builder1 = new Range.Builder(range_Builder0);
      range_Builder0.contractBegin(0L);
      range_Builder0.expandEnd((-9223372036854775808L));
      range_Builder1.contractEnd((-3620L));
      Range.Builder range_Builder2 = range_Builder1.expandEnd((-1L));
      assertSame(range_Builder2, range_Builder1);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.8892425051146353
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Range.Builder range_Builder0 = new Range.Builder();
      range_Builder0.shift(0L);
      long long0 = (-1762L);
      Range range0 = range_Builder0.build();
      range0.split(32767L);
      // Undeclared exception!
      try { 
        Range.parseRange(" Ki-65>");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // can not parse  Ki-65> into a Range
         //
         verifyException("org.jcvi.jillion.core.Range", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=3.245786052610189
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Range range0 = Range.of(2205L);
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.ZERO_BASED;
      range0.toString();
      Range.of(range_CoordinateSystem0, 0L, 0L);
      Range range1 = Range.of(0L);
      range0.equals("");
      range1.split(2205L);
      Long long0 = new Long((-2147483648L));
      range0.equals(long0);
      range0.getEnd();
      // Undeclared exception!
      try { 
        Range.parseRange("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // can not parse  into a Range
         //
         verifyException("org.jcvi.jillion.core.Range", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=3.7526806898740777
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Range range0 = Range.of(3376L);
      range0.getBegin();
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.ZERO_BASED;
      range0.getEnd(range_CoordinateSystem0);
      Range range1 = Range.of(range_CoordinateSystem0, 154L, 154L);
      range0.endsBefore(range1);
      range0.complement(range1);
      LinkedList<Range> linkedList0 = new LinkedList<Range>();
      List<Range> list0 = range0.complementFrom(linkedList0);
      range0.complementFrom(list0);
      range0.getEnd();
      range1.startsBefore(range0);
      Range.CoordinateSystem range_CoordinateSystem1 = Range.CoordinateSystem.SPACE_BASED;
      range_CoordinateSystem1.getAbbreviatedName();
      Range.Builder range_Builder0 = new Range.Builder(3376L);
      Range.Builder range_Builder1 = new Range.Builder(2097L);
      Range.Builder range_Builder2 = range_Builder1.copy();
      Range.CoordinateSystem range_CoordinateSystem2 = Range.CoordinateSystem.ZERO_BASED;
      range_CoordinateSystem2.toString();
      Range.of((-280L));
      Range.Builder range_Builder3 = range_Builder2.expandEnd(360L);
      assertSame(range_Builder2, range_Builder3);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=3.10460557531321
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Range range0 = Range.of(11L, 11L);
      Range range1 = Range.ofLength(1628L);
      range1.intersects(range0);
      boolean boolean0 = range1.startsBefore(range0);
      assertTrue(boolean0);
      
      Object object0 = new Object();
      boolean boolean1 = range1.equals(object0);
      boolean boolean2 = range0.intersects(range1);
      assertFalse(boolean2 == boolean1);
      assertTrue(boolean2);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=3.813442281588338
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.RESIDUE_BASED;
      Range range0 = Range.of(range_CoordinateSystem0, 0L, 1353L);
      range0.equals(range_CoordinateSystem0);
      Range.CoordinateSystem range_CoordinateSystem1 = Range.CoordinateSystem.ZERO_BASED;
      Range.of((-264L), 1353L);
      Range range1 = Range.ofLength(1353L);
      range0.complement(range1);
      Range.Builder range_Builder0 = new Range.Builder(range_CoordinateSystem1, 0L, 1784L);
      Range.Builder range_Builder1 = range_Builder0.shift(1353L);
      Range range2 = range_Builder0.build();
      range2.iterator();
      Range.of(229L);
      Range.Builder range_Builder2 = new Range.Builder(0L);
      range_Builder0.copy();
      range_CoordinateSystem0.toString();
      Range range3 = Range.of((-1L));
      Range.CoordinateSystem range_CoordinateSystem2 = Range.CoordinateSystem.SPACE_BASED;
      range3.getBegin(range_CoordinateSystem2);
      Range.Builder range_Builder3 = new Range.Builder(range_Builder1);
      Range.Builder range_Builder4 = range_Builder3.expandEnd(429L);
      range2.getEnd();
      Range range4 = range_Builder4.build();
      assertFalse(range4.isEmpty());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=3.5928758868854933
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Range range0 = Range.of(127L, 127L);
      Range range1 = range0.asRange();
      Range.of(127L, 127L);
      Consumer<Long> consumer0 = (Consumer<Long>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      range0.forEach(consumer0);
      Range.CoordinateSystem.values();
      Range range2 = Range.of(127L);
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.SPACE_BASED;
      range0.getEnd(range_CoordinateSystem0);
      range1.complement(range2);
      // Undeclared exception!
      try { 
        Range.of(range_CoordinateSystem0, 127L, 1L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // length can not be negative
         //
         verifyException("org.jcvi.jillion.core.Range$Builder", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.947004770161297
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.RESIDUE_BASED;
      Range.Builder range_Builder0 = new Range.Builder(range_CoordinateSystem0, 0L, 0L);
      range_Builder0.expandEnd(581L);
      Range range0 = Range.ofLength(0L);
      // Undeclared exception!
      try { 
        range0.endsBefore((Range) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Null Range used in range comparison operation.
         //
         verifyException("org.jcvi.jillion.core.Range", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=3.3058467485543064
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Range range0 = Range.of((-18L));
      range0.getBegin();
      Range.of(0L);
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.SPACE_BASED;
      Range.Builder range_Builder0 = new Range.Builder(range_CoordinateSystem0, (-1271L), (-1271L));
      range_Builder0.build();
      range_Builder0.build();
      // Undeclared exception!
      try { 
        Range.ofLength((-18L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must be >=0
         //
         verifyException("org.jcvi.jillion.core.Range$Builder", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=3.2994270309115605
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Range range0 = Range.of((-18L));
      range0.getBegin();
      Range range1 = Range.of(0L);
      Range range2 = Range.ofLength(9223372036854775807L);
      range2.intersection(range1);
      // Undeclared exception!
      try { 
        Range.Comparators.valueOf("SB");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant org.jcvi.jillion.core.Range.Comparators.SB
         //
         verifyException("java.lang.Enum", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=3.2462115390776916
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Range range0 = Range.of(11L, 11L);
      Range range1 = Range.ofLength(11L);
      range1.intersects(range0);
      range1.startsBefore(range0);
      range1.endsBefore(range0);
      Object object0 = new Object();
      range1.equals(object0);
      range0.intersects(range1);
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.SPACE_BASED;
      // Undeclared exception!
      try { 
        Range.parseRange("file can not be null", range_CoordinateSystem0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // can not parse file can not be null into a Range
         //
         verifyException("org.jcvi.jillion.core.Range", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=3.6757024186125826
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Range range0 = Range.of(3376L);
      range0.getBegin();
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.SPACE_BASED;
      long long0 = range0.getEnd(range_CoordinateSystem0);
      assertEquals(3377L, long0);
      
      Range range1 = Range.of(range_CoordinateSystem0, 154L, 154L);
      boolean boolean0 = range0.endsBefore(range1);
      assertFalse(boolean0);
      
      List<Range> list0 = range0.complement(range1);
      assertTrue(list0.contains(range0));
      
      LinkedList<Range> linkedList0 = new LinkedList<Range>();
      List<Range> list1 = range0.complementFrom(linkedList0);
      range0.complementFrom(list1);
      range0.getEnd();
      range1.startsBefore(range0);
      Range.CoordinateSystem range_CoordinateSystem1 = Range.CoordinateSystem.SPACE_BASED;
      range_CoordinateSystem1.getAbbreviatedName();
      Range.Builder range_Builder0 = new Range.Builder(3376L);
      Range.Builder range_Builder1 = new Range.Builder(154L, 3377L);
      range_Builder1.copy();
      range_Builder0.contractBegin(3376L);
      range1.iterator();
      Range range2 = Range.ofLength(154L);
      assertFalse(range2.isEmpty());
      
      boolean boolean1 = range0.startsBefore(range1);
      assertFalse(range1.isEmpty());
      assertFalse(boolean1);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=3.848387202072923
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.RESIDUE_BASED;
      Range range0 = Range.of(range_CoordinateSystem0, 0L, 1353L);
      range0.equals(range_CoordinateSystem0);
      Range.CoordinateSystem range_CoordinateSystem1 = Range.CoordinateSystem.ZERO_BASED;
      Range.of((-264L), 1353L);
      Range range1 = Range.ofLength(1353L);
      range0.complement(range1);
      Range.Builder range_Builder0 = new Range.Builder(range_CoordinateSystem1, 0L, 1784L);
      Range.Builder range_Builder1 = range_Builder0.shift(1353L);
      Range range2 = range_Builder0.build();
      range2.iterator();
      Range.of(229L);
      Range.CoordinateSystem range_CoordinateSystem2 = Range.CoordinateSystem.SPACE_BASED;
      range_CoordinateSystem2.toString();
      Range.of(9223372036854773602L);
      Range.Builder range_Builder2 = range_Builder1.expandEnd(360L);
      assertSame(range_Builder2, range_Builder0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=3.7493258295993024
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.RESIDUE_BASED;
      Range range0 = Range.of(range_CoordinateSystem0, 0L, 1353L);
      boolean boolean0 = range0.equals(range_CoordinateSystem0);
      Range.CoordinateSystem range_CoordinateSystem1 = Range.CoordinateSystem.ZERO_BASED;
      Range.of((-264L), 1353L);
      Range range1 = Range.ofLength(1353L);
      List<Range> list0 = range0.complement(range1);
      assertFalse(list0.contains(range1));
      assertFalse(range1.isEmpty());
      assertEquals(1, list0.size());
      
      Range.Builder range_Builder0 = new Range.Builder(range_CoordinateSystem1, 0L, 1784L);
      Range.Builder range_Builder1 = range_Builder0.shift(1353L);
      Range range2 = range_Builder0.build();
      range2.iterator();
      Range.of(229L);
      range_Builder1.contractBegin(0L);
      range2.iterator();
      boolean boolean1 = range0.isSubRangeOf(range2);
      assertTrue(boolean1 == boolean0);
      assertFalse(range2.isEmpty());
      assertFalse(boolean1);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=3.159438759081077
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Range range0 = Range.of(1021L, 1021L);
      Range range1 = Range.of(1021L);
      range0.startsBefore(range1);
      Object object0 = new Object();
      Range range2 = Range.of(1021L);
      boolean boolean0 = range2.equals(range0);
      boolean boolean1 = range0.intersects(range1);
      assertTrue(boolean1);
      assertTrue(boolean1 == boolean0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=3.4611812938892896
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.RESIDUE_BASED;
      long long0 = (-310L);
      Range range0 = Range.of(range_CoordinateSystem0, (-310L), (-310L));
      Range range1 = Range.of((-310L));
      range1.iterator();
      range1.toString();
      range1.startsBefore(range0);
      range0.isSubRangeOf(range1);
      Range.Builder range_Builder0 = new Range.Builder(range0);
      Range.of((-310L), 2807L);
      Range range2 = null;
      // Undeclared exception!
      try { 
        range0.complement((Range) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null Range used in intersection operation.
         //
         verifyException("org.jcvi.jillion.core.Range", e);
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=3.7495351246022475
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Range range0 = Range.of(3376L);
      range0.getBegin();
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.ZERO_BASED;
      range0.getEnd(range_CoordinateSystem0);
      Range range1 = Range.of(range_CoordinateSystem0, 154L, 154L);
      range0.endsBefore(range1);
      range0.complement(range1);
      LinkedList<Range> linkedList0 = new LinkedList<Range>();
      linkedList0.add(range1);
      List<Range> list0 = range0.complementFrom(linkedList0);
      range0.complementFrom(list0);
      range0.getEnd();
      range1.startsBefore(range0);
      Range.CoordinateSystem range_CoordinateSystem1 = Range.CoordinateSystem.SPACE_BASED;
      range_CoordinateSystem1.getAbbreviatedName();
      Range.Builder range_Builder0 = new Range.Builder(3376L);
      Range.Builder range_Builder1 = new Range.Builder(3376L);
      Range.Builder range_Builder2 = range_Builder1.copy();
      Range.CoordinateSystem range_CoordinateSystem2 = Range.CoordinateSystem.ZERO_BASED;
      range_CoordinateSystem2.toString();
      Range.of((-280L));
      range_Builder2.expandEnd(360L);
      // Undeclared exception!
      try { 
        Range.parseRange("lu");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // can not parse lu into a Range
         //
         verifyException("org.jcvi.jillion.core.Range", e);
      }
  }

  /**
  //Test case number: 26
  /*Coverage entropy=3.4508645517668968
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Range range0 = Range.of(3706L);
      range0.getLength();
      range0.split(4294967295L);
      Range range1 = Range.of(242L, 242L);
      range0.split(242L);
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.ZERO_BASED;
      Range range2 = Range.of(range_CoordinateSystem0, 242L, 3706L);
      range2.complement(range1);
      range2.split(400L);
      range2.asRange();
      range1.getBegin(range_CoordinateSystem0);
      // Undeclared exception!
      try { 
        Range.parseRange(".D}k|MdGjJ}d", range_CoordinateSystem0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // can not parse .D}k|MdGjJ}d into a Range
         //
         verifyException("org.jcvi.jillion.core.Range", e);
      }
  }

  /**
  //Test case number: 27
  /*Coverage entropy=3.768718660761637
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.RESIDUE_BASED;
      Range range0 = Range.of(range_CoordinateSystem0, 0L, 1353L);
      range0.equals(range_CoordinateSystem0);
      Range range1 = Range.of((-264L), 1353L);
      Range range2 = Range.ofLength(8L);
      List<Range> list0 = range1.complement(range2);
      Range.Builder range_Builder0 = new Range.Builder(range_CoordinateSystem0, 4294967295L, 4294967295L);
      range0.complementFrom(list0);
      Range.Builder range_Builder1 = range_Builder0.shift(8L);
      range_Builder1.build();
      range2.iterator();
      Range.of((-264L));
      Range.Builder range_Builder2 = new Range.Builder();
      Range.Builder range_Builder3 = null;
      try {
        range_Builder3 = new Range.Builder((-1L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must be >=0
         //
         verifyException("org.jcvi.jillion.core.Range$Builder", e);
      }
  }

  /**
  //Test case number: 28
  /*Coverage entropy=3.7376696182833657
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Range range0 = Range.of((-18L));
      range0.toString();
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.SPACE_BASED;
      Range range1 = Range.of(range_CoordinateSystem0, (-725L), 0L);
      Range range2 = Range.of(0L);
      range2.getEnd();
      range0.equals("");
      range2.complement(range1);
      long long0 = (-2351L);
      Long long1 = new Long((-2351L));
      // Undeclared exception!
      try { 
        Range.parseRange("ax", range_CoordinateSystem0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // can not parse ax into a Range
         //
         verifyException("org.jcvi.jillion.core.Range", e);
      }
  }

  /**
  //Test case number: 29
  /*Coverage entropy=2.9669434861893547
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.RESIDUE_BASED;
      Range range0 = Range.of(range_CoordinateSystem0, 2147483647L, 2147483647L);
      Range.CoordinateSystem range_CoordinateSystem1 = Range.CoordinateSystem.SPACE_BASED;
      range0.split(2895L);
      range0.equals(range_CoordinateSystem0);
      // Undeclared exception!
      try { 
        Range.of(range_CoordinateSystem1, 1268L, (-1717L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // length can not be negative
         //
         verifyException("org.jcvi.jillion.core.Range$Builder", e);
      }
  }

  /**
  //Test case number: 30
  /*Coverage entropy=3.313318880551397
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Range range0 = Range.of(11L, 11L);
      Range range1 = Range.ofLength(11L);
      range1.intersects(range0);
      range0.equals(range1);
      range0.complement(range1);
      Long long0 = new Long((-2351L));
      String string0 = "ax";
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.RESIDUE_BASED;
      // Undeclared exception!
      try { 
        Range.parseRange("", range_CoordinateSystem0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // can not parse  into a Range
         //
         verifyException("org.jcvi.jillion.core.Range", e);
      }
  }

  /**
  //Test case number: 31
  /*Coverage entropy=3.3348789537740453
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Range range0 = Range.of(2205L);
      range0.getBegin();
      long long0 = (-2552L);
      Range.of(2060L);
      Range range1 = Range.ofLength(2205L);
      Range range2 = range1.intersection(range0);
      Range.ofLength(2147483647L);
      range2.intersection(range1);
      // Undeclared exception!
      try { 
        Range.Comparators.valueOf("[ %d .. %d ]/%s");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant org.jcvi.jillion.core.Range.Comparators.[ %d .. %d ]/%s
         //
         verifyException("java.lang.Enum", e);
      }
  }

  /**
  //Test case number: 32
  /*Coverage entropy=2.887577825056549
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Range range0 = Range.of((-18L));
      long long0 = 0L;
      range0.toString();
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.SPACE_BASED;
      long long1 = (-725L);
      // Undeclared exception!
      try { 
        range0.isSubRangeOf((Range) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // range can not be null
         //
         verifyException("org.jcvi.jillion.core.Range", e);
      }
  }

  /**
  //Test case number: 33
  /*Coverage entropy=3.563089088991838
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Range range0 = Range.of((-264L), 1353L);
      Range range1 = Range.ofLength(1353L);
      assertFalse(range1.isEmpty());
      
      range0.iterator();
      Range range2 = Range.of(9223372036854775807L);
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.SPACE_BASED;
      range_CoordinateSystem0.toString();
      Range range3 = Range.of((-9223372036854775808L));
      assertFalse(range3.equals((Object)range2));
  }

  /**
  //Test case number: 34
  /*Coverage entropy=3.339085464248101
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Range range0 = Range.of(1464L, 2147483647L);
      range0.asRange();
      Range.of((-907L), (-887L));
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      range0.forEach(consumer0);
  }

  /**
  //Test case number: 35
  /*Coverage entropy=3.2797378364773384
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Range range0 = Range.of(11L, 11L);
      range0.intersects(range0);
      range0.equals(range0);
      range0.complement(range0);
      Long long0 = new Long((-2351L));
      String string0 = "ax";
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.RESIDUE_BASED;
      // Undeclared exception!
      try { 
        Range.parseRange("", range_CoordinateSystem0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // can not parse  into a Range
         //
         verifyException("org.jcvi.jillion.core.Range", e);
      }
  }

  /**
  //Test case number: 36
  /*Coverage entropy=3.820651977005379
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Range range0 = Range.of(2205L);
      range0.toString();
      Range range1 = Range.of((-725L));
      range1.getEnd();
      range1.equals((Object) null);
      range0.complement(range1);
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.SPACE_BASED;
      Range range2 = Range.parseRange("[ 2205 .. 2205 ]/0B", range_CoordinateSystem0);
      Object object0 = new Object();
      Object object1 = new Object();
      range2.equals(object1);
      range0.getEnd();
      // Undeclared exception!
      try { 
        Range.parseRange("]w11%8`; Ni'!9|");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // can not parse ]w11%8`; Ni'!9| into a Range
         //
         verifyException("org.jcvi.jillion.core.Range", e);
      }
  }

  /**
  //Test case number: 37
  /*Coverage entropy=3.6344063253904944
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      long long0 = 2205L;
      Range range0 = Range.of(2205L);
      Range range1 = Range.of((-2147483648L), (-2147483648L));
      long long1 = 65535L;
      range1.equals(range0);
      Range range2 = Range.ofLength(65535L);
      range2.complement(range1);
      // Undeclared exception!
      try { 
        range0.split((-264L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // max splitLength must be >= 1
         //
         verifyException("org.jcvi.jillion.core.Range", e);
      }
  }

  /**
  //Test case number: 38
  /*Coverage entropy=3.3624120300445792
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Range range0 = Range.of(2205L);
      range0.getBegin();
      Range range1 = Range.of((-2552L));
      Range range2 = range1.intersection(range0);
      Range range3 = Range.ofLength(32767L);
      range2.equals(range0);
      range3.intersection(range0);
      // Undeclared exception!
      try { 
        Range.Comparators.valueOf("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant org.jcvi.jillion.core.Range.Comparators.
         //
         verifyException("java.lang.Enum", e);
      }
  }

  /**
  //Test case number: 39
  /*Coverage entropy=3.6291982203617414
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.RESIDUE_BASED;
      Range range0 = Range.of(range_CoordinateSystem0, 0L, 1353L);
      range0.equals(range_CoordinateSystem0);
      Range range1 = Range.of((-264L), 1353L);
      Range range2 = Range.of(range_CoordinateSystem0, (-264L), 1353L);
      List<Range> list0 = range1.complement(range2);
      Range.Builder range_Builder0 = new Range.Builder(range_CoordinateSystem0, 4294967295L, 4294967295L);
      range0.complementFrom(list0);
      range_Builder0.shift(8L);
      range2.iterator();
      Range.of((-264L));
      Range.Builder range_Builder1 = new Range.Builder();
      Range.Builder range_Builder2 = null;
      try {
        range_Builder2 = new Range.Builder((-1L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must be >=0
         //
         verifyException("org.jcvi.jillion.core.Range$Builder", e);
      }
  }
}
