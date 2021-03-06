/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 13:11:45 GMT 2018
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
  /*Coverage entropy=3.912023005428145
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Range range0 = Range.of(0L, 0L);
      range0.toString();
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.RESIDUE_BASED;
      long long0 = 0L;
      Range range1 = Range.of(range_CoordinateSystem0, 0L, 0L);
      range0.isSubRangeOf(range1);
      LinkedList<Range> linkedList0 = new LinkedList<Range>();
      linkedList0.add(range0);
      range0.complementFrom(linkedList0);
      Range.Comparators.values();
      long long1 = 529L;
      Range range2 = Range.of(529L);
      Range.CoordinateSystem range_CoordinateSystem1 = Range.CoordinateSystem.RESIDUE_BASED;
      range2.toString(range_CoordinateSystem1);
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      range2.forEach(consumer0);
      range_CoordinateSystem1.toString();
      range2.isEmpty();
      // Undeclared exception!
      try { 
        Range.parseRange("(d+)s*,s*(d+)", range_CoordinateSystem1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // can not parse (d+)s*,s*(d+) into a Range
         //
         verifyException("org.jcvi.jillion.core.Range", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=3.2580965380214835
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.ZERO_BASED;
      Range range0 = Range.of(range_CoordinateSystem0, (-1L), (-1L));
      range0.isEmpty();
      Range.CoordinateSystem range_CoordinateSystem1 = Range.CoordinateSystem.SPACE_BASED;
      range0.getEnd();
      range0.getEnd(range_CoordinateSystem1);
      Long long0 = new Long((-768L));
      range0.equals(long0);
      range0.getBegin(range_CoordinateSystem1);
      LinkedList<Range> linkedList0 = new LinkedList<Range>();
      linkedList0.add(range0);
      linkedList0.add(range0);
      linkedList0.push((Range) null);
      linkedList0.add(range0);
      // Undeclared exception!
      try { 
        range0.complementFrom(linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // The second parameter in the comparison is null.
         //
         verifyException("org.jcvi.jillion.core.Range$Comparators$1", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=3.5553480614894135
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.RESIDUE_BASED;
      Range range0 = Range.of(range_CoordinateSystem0, 0L, 1445L);
      Range range1 = Range.of(1445L);
      range0.spliterator();
      range1.intersects(range0);
      range0.startsBefore(range1);
      range0.asRange();
      range1.iterator();
      String string0 = "__H2hJ7kimB`>}";
      range0.intersects(range1);
      // Undeclared exception!
      try { 
        Range.Comparators.valueOf("__H2hJ7kimB`>}");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant org.jcvi.jillion.core.Range.Comparators.__H2hJ7kimB`>}
         //
         verifyException("java.lang.Enum", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Range.Builder range_Builder0 = new Range.Builder(0L, 0L);
      range_Builder0.contractEnd(0L);
      range_Builder0.expandEnd(1760L);
      range_Builder0.expandBegin(0L);
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.RESIDUE_BASED;
      long long0 = (-2315L);
      Range.Builder range_Builder1 = null;
      try {
        range_Builder1 = new Range.Builder(range_CoordinateSystem0, 0L, (-2315L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // length can not be negative
         //
         verifyException("org.jcvi.jillion.core.Range$Builder", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      long long0 = 195L;
      Range.Builder range_Builder0 = new Range.Builder((-1741L), 195L);
      range_Builder0.expandEnd(0L);
      Range.Builder range_Builder1 = range_Builder0.expandEnd(0L);
      range_Builder1.contractBegin(0L);
      range_Builder0.copy();
      range_Builder0.copy();
      range_Builder1.shift((-2180L));
      range_Builder1.contractEnd(1L);
      // Undeclared exception!
      try { 
        Range.ofLength((-1741L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must be >=0
         //
         verifyException("org.jcvi.jillion.core.Range$Builder", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.6525875347201477
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      long long0 = 0L;
      Range range0 = Range.ofLength(0L);
      range0.getEnd();
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
  //Test case number: 6
  /*Coverage entropy=2.941616952644221
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Range range0 = Range.of(2147483647L);
      Long long0 = new Long(1049L);
      range0.equals(long0);
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.SPACE_BASED;
      long long1 = (-1586L);
      Range.Builder range_Builder0 = null;
      try {
        range_Builder0 = new Range.Builder(range_CoordinateSystem0, 1049L, (-1586L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // length can not be negative
         //
         verifyException("org.jcvi.jillion.core.Range$Builder", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=3.4965075614664793
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.RESIDUE_BASED;
      long long0 = (-2821L);
      Range range0 = Range.of(range_CoordinateSystem0, (-2821L), (-2821L));
      range0.equals(range_CoordinateSystem0);
      range0.iterator();
      Range.ofLength(1201L);
      // Undeclared exception!
      try { 
        Range.parseRange("org.jcvi.jillion.core.Range$UnsignedByteStartLongLengthRange");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // can not parse org.jcvi.jillion.core.Range$UnsignedByteStartLongLengthRange into a Range
         //
         verifyException("org.jcvi.jillion.core.Range", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.8782183066708504
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      long long0 = 0L;
      Range range0 = Range.of(0L);
      // Undeclared exception!
      try { 
        range0.split(0L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // max splitLength must be >= 1
         //
         verifyException("org.jcvi.jillion.core.Range", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=3.8501476017100575
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Range range0 = Range.ofLength(1209L);
      Range range1 = Range.ofLength(127L);
      range0.endsBefore(range1);
      range0.getLength();
      Range.Builder range_Builder0 = new Range.Builder(range0);
      range_Builder0.expandEnd(1209L);
      Range range2 = range_Builder0.build();
      range2.complement(range0);
      range_Builder0.shift(1209L);
      Consumer<Long> consumer0 = (Consumer<Long>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      range0.forEach(consumer0);
      LinkedList<Range> linkedList0 = new LinkedList<Range>();
      LinkedList<Object> linkedList1 = new LinkedList<Object>();
      linkedList0.parallelStream();
      linkedList0.containsAll(linkedList1);
      range0.complementFrom(linkedList0);
      long long0 = (-5797L);
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.RESIDUE_BASED;
      range0.getEnd(range_CoordinateSystem0);
      range_Builder0.expandEnd((-5797L));
      range0.isEmpty();
      // Undeclared exception!
      try { 
        Range.parseRange((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=3.839962017635195
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.RESIDUE_BASED;
      Range range0 = Range.of(range_CoordinateSystem0, (-1732L), 2147483647L);
      Range.CoordinateSystem range_CoordinateSystem1 = Range.CoordinateSystem.ZERO_BASED;
      String string0 = range0.toString(range_CoordinateSystem1);
      assertEquals("[ -1733 .. 2147483646 ]/0B", string0);
      
      Range.CoordinateSystem range_CoordinateSystem2 = Range.CoordinateSystem.RESIDUE_BASED;
      Range.Builder range_Builder0 = new Range.Builder(range_CoordinateSystem2, (-1732L), (-1732L));
      Range.Builder range_Builder1 = range_Builder0.expandBegin(2120L);
      Range range1 = Range.ofLength(2120L);
      range_Builder0.contractBegin(0L);
      String string1 = range1.toString(range_CoordinateSystem2);
      assertEquals("[ 1 .. 2120 ]/RB", string1);
      
      range0.iterator();
      range_Builder0.expandBegin((-1732L));
      range_Builder1.contractBegin(251L);
      Range range2 = range_Builder1.build();
      range0.getBegin();
      range0.isEmpty();
      range_Builder1.shift((-1732L));
      range_Builder0.expandEnd(25L);
      Range.parseRange("[ 1 .. 2120 ]/RB", range_CoordinateSystem0);
      range1.getBegin();
      range1.equals(range_CoordinateSystem0);
      range1.iterator();
      range_CoordinateSystem1.getAbbreviatedName();
      List<Range> list0 = range2.complement(range1);
      assertTrue(list0.contains(range2));
  }

  /**
  //Test case number: 11
  /*Coverage entropy=3.6542220950859425
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Range.Builder range_Builder0 = new Range.Builder();
      Range range0 = Range.of((-1L), (-1L));
      range0.getEnd();
      range_Builder0.expandBegin((-1585L));
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.SPACE_BASED;
      range0.spliterator();
      range0.getEnd(range_CoordinateSystem0);
      Range.Comparators.values();
      Range.ofLength(0L);
      Range.CoordinateSystem range_CoordinateSystem1 = Range.CoordinateSystem.RESIDUE_BASED;
      range0.getEnd(range_CoordinateSystem1);
      Range range1 = Range.ofLength(1L);
      range1.spliterator();
      range0.endsBefore(range1);
      range1.startsBefore(range0);
      // Undeclared exception!
      try { 
        range_Builder0.build();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // length can not be negative
         //
         verifyException("org.jcvi.jillion.core.Range$Builder", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=3.5609483036962266
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Range range0 = Range.of((-3748L));
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.SPACE_BASED;
      range0.getBegin(range_CoordinateSystem0);
      LinkedList<Range> linkedList0 = new LinkedList<Range>();
      linkedList0.offerFirst(range0);
      List<Range> list0 = range0.complementFrom(linkedList0);
      range0.complementFrom(list0);
      long long0 = 0L;
      Range.ofLength(0L);
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
  //Test case number: 13
  /*Coverage entropy=3.1303705038132295
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Range range0 = Range.ofLength(1L);
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.SPACE_BASED;
      Range range1 = Range.of(range_CoordinateSystem0, 1L, 1L);
      range0.isSubRangeOf(range1);
      Range.Builder range_Builder0 = null;
      try {
        range_Builder0 = new Range.Builder(1L, (-1314L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // length can not be negative
         //
         verifyException("org.jcvi.jillion.core.Range$Builder", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=3.4276396309598454
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.RESIDUE_BASED;
      long long0 = (-2821L);
      Range range0 = Range.of(range_CoordinateSystem0, (-2821L), (-2821L));
      range0.isSubRangeOf(range0);
      range0.iterator();
      Range.ofLength(1201L);
      // Undeclared exception!
      try { 
        Range.parseRange("org.jcvi.jillion.core.Range$UnsignedByteStartLongLengthRange");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // can not parse org.jcvi.jillion.core.Range$UnsignedByteStartLongLengthRange into a Range
         //
         verifyException("org.jcvi.jillion.core.Range", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=3.400148916170243
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Range range0 = Range.of(42L);
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.ZERO_BASED;
      range0.getBegin(range_CoordinateSystem0);
      LinkedList<Range> linkedList0 = new LinkedList<Range>();
      linkedList0.add(range0);
      linkedList0.add(range0);
      Range range1 = null;
      linkedList0.push(range0);
      linkedList0.add(range0);
      List<Range> list0 = range0.complementFrom(linkedList0);
      range0.complementFrom(list0);
      Range.Builder range_Builder0 = null;
      try {
        range_Builder0 = new Range.Builder(1053L, (-690L));
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
  /*Coverage entropy=2.941616952644221
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.SPACE_BASED;
      Range range0 = Range.ofLength(0L);
      range0.spliterator();
      range0.intersects(range0);
      range0.startsBefore(range0);
      range0.asRange();
      range0.iterator();
      String string0 = "__H2hJ7kimB`>}";
      // Undeclared exception!
      try { 
        Range.Comparators.valueOf("__H2hJ7kimB`>}");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant org.jcvi.jillion.core.Range.Comparators.__H2hJ7kimB`>}
         //
         verifyException("java.lang.Enum", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.6525875347201477
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Range range0 = Range.ofLength(0L);
      // Undeclared exception!
      try { 
        range0.intersection((Range) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null Range used in intersection operation.
         //
         verifyException("org.jcvi.jillion.core.Range", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.821563807860364
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Range range0 = Range.of((-13L));
      // Undeclared exception!
      try { 
        range0.toString((Range.CoordinateSystem) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // coordinateSystem can not be null
         //
         verifyException("org.jcvi.jillion.core.Range", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=3.610917912644226
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      long long0 = 2147483642L;
      Range range0 = Range.of(2147483642L, 2147483642L);
      Range range1 = Range.ofLength(2147483642L);
      List<Range> list0 = range1.complement(range0);
      List<Range> list1 = range0.complementFrom(list0);
      List<Range> list2 = range0.complementFrom(list1);
      range0.complementFrom(list2);
      long long1 = (-3722L);
      long long2 = 0L;
      // Undeclared exception!
      try { 
        Range.ofLength((-1043L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must be >=0
         //
         verifyException("org.jcvi.jillion.core.Range$Builder", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=3.6114991343532297
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.RESIDUE_BASED;
      Range range0 = Range.of(range_CoordinateSystem0, (-2821L), (-2821L));
      range0.equals(range_CoordinateSystem0);
      range0.iterator();
      Range range1 = Range.ofLength(1201L);
      long long0 = 1164L;
      Range range2 = Range.of(1164L, 1164L);
      range1.complement(range2);
      Range.Builder range_Builder0 = new Range.Builder();
      // Undeclared exception!
      try { 
        range_Builder0.contractBegin(1204L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // length can not be negative
         //
         verifyException("org.jcvi.jillion.core.Range$Builder", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=3.7376696182833657
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.ZERO_BASED;
      Range range0 = Range.of(range_CoordinateSystem0, (-1L), (-1L));
      range0.isEmpty();
      Range.CoordinateSystem range_CoordinateSystem1 = Range.CoordinateSystem.SPACE_BASED;
      range0.getEnd();
      range0.getEnd(range_CoordinateSystem1);
      Long long0 = new Long((-767L));
      range0.getBegin(range_CoordinateSystem1);
      LinkedList<Range> linkedList0 = new LinkedList<Range>();
      linkedList0.add(range0);
      linkedList0.add(range0);
      linkedList0.add(range0);
      List<Range> list0 = range0.complementFrom(linkedList0);
      range0.complementFrom(list0);
      long long1 = (-690L);
      Range.Builder range_Builder0 = null;
      try {
        range_Builder0 = new Range.Builder((-391L), (-690L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // length can not be negative
         //
         verifyException("org.jcvi.jillion.core.Range$Builder", e);
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=3.6254885055475397
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Range range0 = Range.ofLength(1209L);
      Range range1 = Range.ofLength(127L);
      boolean boolean0 = range0.endsBefore(range1);
      assertFalse(boolean0);
      
      long long0 = range0.getLength();
      assertEquals(1209L, long0);
      
      Range.Builder range_Builder0 = new Range.Builder(range0);
      range_Builder0.expandEnd(1209L);
      Range range2 = range_Builder0.build();
      List<Range> list0 = range2.complement(range0);
      assertEquals(1, list0.size());
      
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.SPACE_BASED;
      range0.getLength();
      Range range3 = Range.of(range_CoordinateSystem0, 65535L, 65535L);
      range2.isEmpty();
      long long1 = range1.getEnd(range_CoordinateSystem0);
      assertEquals(127L, long1);
      
      Long long2 = new Long(65535L);
      range2.equals("org.jcvi.jillion.internal.core.util.Caches");
      List<Range> list1 = range2.complement(range3);
      assertTrue(range3.isEmpty());
      assertFalse(list1.equals((Object)list0));
      
      List<Range> list2 = range2.split(1209L);
      assertTrue(list2.contains(range0));
  }

  /**
  //Test case number: 23
  /*Coverage entropy=3.060287092608695
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Range.CoordinateSystem.values();
      long long0 = (-2147483648L);
      Range range0 = Range.of((-2147483648L), (-2147483648L));
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.RESIDUE_BASED;
      // Undeclared exception!
      try { 
        range0.split((-2147483648L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // max splitLength must be >= 1
         //
         verifyException("org.jcvi.jillion.core.Range", e);
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=3.914122532828073
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Range.Builder range_Builder0 = new Range.Builder();
      Range range0 = range_Builder0.build();
      long long0 = 0L;
      Range.Builder range_Builder1 = range_Builder0.contractEnd(0L);
      Range.CoordinateSystem.values();
      Range range1 = Range.of(0L, 0L);
      range1.endsBefore(range0);
      long long1 = (-4150L);
      Range range2 = Range.of((-4150L), 2147483647L);
      Range range3 = Range.of(0L);
      range_Builder0.contractBegin(0L);
      range2.isEmpty();
      range1.isEmpty();
      range2.iterator();
      range0.complement(range1);
      range2.complement(range1);
      Range range4 = range3.asRange();
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.SPACE_BASED;
      range4.getBegin(range_CoordinateSystem0);
      Range.Builder range_Builder2 = new Range.Builder();
      range_Builder1.contractBegin(0L);
      // Undeclared exception!
      try { 
        Range.CoordinateSystem.valueOf("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant org.jcvi.jillion.core.Range.CoordinateSystem.
         //
         verifyException("java.lang.Enum", e);
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=3.7773253776319202
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Range range0 = Range.ofLength(2147483648L);
      Range range1 = Range.ofLength(127L);
      range0.endsBefore(range1);
      range0.getLength();
      Range.Builder range_Builder0 = new Range.Builder(range0);
      range_Builder0.expandEnd(2147483648L);
      Range range2 = range_Builder0.build();
      range2.complement(range0);
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.SPACE_BASED;
      range0.getLength();
      Range.of(range_CoordinateSystem0, 65535L, 65535L);
      range2.isEmpty();
      range1.getEnd(range_CoordinateSystem0);
      Long long0 = new Long(65535L);
      Range.CoordinateSystem range_CoordinateSystem1 = Range.CoordinateSystem.ZERO_BASED;
      // Undeclared exception!
      try { 
        Range.parseRange("/e.ZnD#B(g", range_CoordinateSystem1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // can not parse /e.ZnD#B(g into a Range
         //
         verifyException("org.jcvi.jillion.core.Range", e);
      }
  }

  /**
  //Test case number: 26
  /*Coverage entropy=3.311973238061831
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Range range0 = Range.of(2147483649L);
      Long long0 = new Long(2147483649L);
      LinkedList<Range> linkedList0 = new LinkedList<Range>();
      linkedList0.push(range0);
      LinkedList<Range> linkedList1 = new LinkedList<Range>();
      linkedList1.add(range0);
      List<Range> list0 = range0.complementFrom(linkedList1);
      range0.complementFrom(list0);
      Range.Builder range_Builder0 = new Range.Builder(1049L, 1049L);
      long long1 = 1L;
      long long2 = 3227L;
      range_Builder0.expandBegin(3227L);
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.ZERO_BASED;
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
  //Test case number: 27
  /*Coverage entropy=3.867201380449728
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Range range0 = Range.of((-13L));
      Range range1 = Range.of((-13L), 255L);
      range1.endsBefore(range0);
      range1.getLength();
      Range.Builder range_Builder0 = new Range.Builder(range0);
      Range.Builder range_Builder1 = range_Builder0.expandEnd(4481L);
      Range range2 = range_Builder1.build();
      List<Range> list0 = range0.complement(range2);
      assertEquals(1, list0.size());
      assertFalse(list0.contains(range0));
      
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.SPACE_BASED;
      long long0 = range2.getLength();
      assertEquals(4482L, long0);
      
      Range.CoordinateSystem range_CoordinateSystem1 = Range.CoordinateSystem.ZERO_BASED;
      Range range3 = Range.of(range_CoordinateSystem1, 255L, 255L);
      boolean boolean0 = range3.isEmpty();
      assertFalse(boolean0);
      
      range0.getEnd(range_CoordinateSystem0);
      Long long1 = new Long(235L);
      range2.equals(range1);
      range1.split(4482L);
      assertFalse(range1.equals((Object)range2));
  }

  /**
  //Test case number: 28
  /*Coverage entropy=3.535173402656391
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Range range0 = Range.ofLength(1209L);
      Range range1 = Range.ofLength(127L);
      range0.endsBefore(range1);
      long long0 = range0.getLength();
      assertEquals(1209L, long0);
      
      Range.Builder range_Builder0 = new Range.Builder(range0);
      range_Builder0.expandEnd(1209L);
      Range range2 = Range.ofLength(1209L);
      List<Range> list0 = range2.complement(range0);
      assertEquals(0, list0.size());
      
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.SPACE_BASED;
      range0.getLength();
      Range range3 = Range.of(range_CoordinateSystem0, 65535L, 65535L);
      range2.isEmpty();
      long long1 = range1.getEnd(range_CoordinateSystem0);
      assertEquals(127L, long1);
      
      Long long2 = new Long(65535L);
      List<Range> list1 = range2.complement(range3);
      assertTrue(list1.contains(range0));
      assertTrue(range3.isEmpty());
  }

  /**
  //Test case number: 29
  /*Coverage entropy=3.634878839932466
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Range.Builder range_Builder0 = new Range.Builder();
      Range range0 = range_Builder0.build();
      long long0 = 0L;
      range_Builder0.contractEnd(0L);
      Range range1 = Range.ofLength(0L);
      Range range2 = Range.of(0L, 2147483647L);
      Range range3 = Range.of(0L);
      String string0 = "_iA(SXt4W4z{%zKh!I";
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.ZERO_BASED;
      range_Builder0.contractBegin(0L);
      range2.isEmpty();
      range1.isEmpty();
      range2.iterator();
      range0.complement(range1);
      range2.complement(range1);
      Range range4 = range3.asRange();
      Range.CoordinateSystem range_CoordinateSystem1 = Range.CoordinateSystem.SPACE_BASED;
      range4.getBegin(range_CoordinateSystem1);
      range4.intersects(range1);
      // Undeclared exception!
      try { 
        Range.CoordinateSystem.valueOf("_iA(SXt4W4z{%zKh!I");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant org.jcvi.jillion.core.Range.CoordinateSystem._iA(SXt4W4z{%zKh!I
         //
         verifyException("java.lang.Enum", e);
      }
  }

  /**
  //Test case number: 30
  /*Coverage entropy=2.864738512190568
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Range range0 = Range.of(2066L);
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.RESIDUE_BASED;
      long long0 = range0.getEnd(range_CoordinateSystem0);
      assertEquals(2067L, long0);
      
      Long long1 = new Long((-1729L));
      Long long2 = new Long(1329L);
      Long long3 = new Long(2066L);
      boolean boolean0 = range0.equals(long3);
      assertFalse(range0.isEmpty());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=2.788626037967039
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Range range0 = Range.ofLength(9223372036854775765L);
      long long0 = range0.getEnd();
      assertEquals(9223372036854775764L, long0);
      
      boolean boolean0 = range0.equals((Object) null);
      assertFalse(boolean0);
  }
}
