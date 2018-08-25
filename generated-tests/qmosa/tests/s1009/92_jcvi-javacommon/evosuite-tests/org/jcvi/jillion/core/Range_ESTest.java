/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 12:06:49 GMT 2018
 */

package org.jcvi.jillion.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.ToDoubleFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jcvi.jillion.core.Range;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Range_ESTest extends Range_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      long long0 = 5786L;
      Range.ofLength(5786L);
      // Undeclared exception!
      try { 
        Range.parseRange("?_L9F8e");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // can not parse ?_L9F8e into a Range
         //
         verifyException("org.jcvi.jillion.core.Range", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=3.2188758248681983
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Range.Builder range_Builder0 = new Range.Builder(0L);
      Range range0 = Range.of((-2157L));
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.RESIDUE_BASED;
      String string0 = range0.toString(range_CoordinateSystem0);
      assertEquals("[ -2156 .. -2156 ]/RB", string0);
      
      Range range1 = Range.of(556L);
      boolean boolean0 = range0.isSubRangeOf(range1);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.9412316867217543
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      long long0 = (-1501L);
      Range range0 = Range.of((-1501L));
      String string0 = null;
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.SPACE_BASED;
      Range range1 = null;
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
  //Test case number: 3
  /*Coverage entropy=3.4339872044851467
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Range.Builder range_Builder0 = new Range.Builder((-1129L), (-1L));
      range_Builder0.contractBegin((-32768L));
      Range.Builder range_Builder1 = range_Builder0.shift((-1L));
      range_Builder0.copy();
      Range range0 = Range.of(1225L);
      range0.toString();
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      range0.forEach(consumer0);
      LinkedList<Range> linkedList0 = new LinkedList<Range>();
      range0.complementFrom(linkedList0);
      Range.Builder range_Builder2 = range_Builder0.contractBegin((-1129L));
      assertSame(range_Builder2, range_Builder1);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=3.1202915653012844
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.SPACE_BASED;
      long long0 = (-716L);
      Range.Builder range_Builder0 = new Range.Builder(range_CoordinateSystem0, (-716L), (-716L));
      long long1 = 1857L;
      Range range0 = Range.of(1857L);
      range0.getLength();
      // Undeclared exception!
      try { 
        Range.of(1857L, 1L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // length can not be negative
         //
         verifyException("org.jcvi.jillion.core.Range$Builder", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.8309404302537744
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Range.ofLength(0L);
      long long0 = 1912L;
      long long1 = 525L;
      // Undeclared exception!
      try { 
        Range.of(1912L, 525L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // length can not be negative
         //
         verifyException("org.jcvi.jillion.core.Range$Builder", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.RESIDUE_BASED;
      long long0 = 2191L;
      Range.Builder range_Builder0 = new Range.Builder(range_CoordinateSystem0, 2191L, 2191L);
      // Undeclared exception!
      try { 
        range_Builder0.contractEnd(2191L);
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
  /*Coverage entropy=3.429424146204271
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.RESIDUE_BASED;
      Range range0 = Range.of(range_CoordinateSystem0, (-181L), (-181L));
      range0.iterator();
      Range range1 = range0.asRange();
      range1.intersects(range0);
      range1.intersection(range0);
      Range.CoordinateSystem range_CoordinateSystem1 = Range.CoordinateSystem.RESIDUE_BASED;
      range0.getEnd(range_CoordinateSystem1);
      range1.getBegin(range_CoordinateSystem0);
      // Undeclared exception!
      try { 
        Range.parseRange("\"NSG5^uDQ[G", range_CoordinateSystem0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // can not parse \"NSG5^uDQ[G into a Range
         //
         verifyException("org.jcvi.jillion.core.Range", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=3.4945204079620367
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Range range0 = Range.of(365L);
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.SPACE_BASED;
      LinkedList<Range> linkedList0 = new LinkedList<Range>();
      linkedList0.add(range0);
      List<Range> list0 = range0.complementFrom(linkedList0);
      assertTrue(list0.isEmpty());
      
      Range range1 = Range.of(range_CoordinateSystem0, 871L, 871L);
      range1.iterator();
      range1.complement(range0);
      long long0 = range0.getBegin();
      assertEquals(365L, long0);
      
      Range.CoordinateSystem range_CoordinateSystem1 = Range.CoordinateSystem.ZERO_BASED;
      long long1 = range1.getBegin(range_CoordinateSystem1);
      assertEquals(871L, long1);
      
      range_CoordinateSystem1.getAbbreviatedName();
      Range range2 = range1.asRange();
      assertTrue(range2.isEmpty());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=3.3284718813307355
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Range range0 = Range.ofLength(0L);
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.RESIDUE_BASED;
      Range.of(range_CoordinateSystem0, 0L, 2147483647L);
      range0.getEnd();
      Range.CoordinateSystem range_CoordinateSystem1 = Range.CoordinateSystem.RESIDUE_BASED;
      range0.toString(range_CoordinateSystem1);
      // Undeclared exception!
      try { 
        Range.of(9223372036854775807L, (-249L));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // given length -249 would make range [9223372036854775807 - ? ] beyond max allowed end offset
         //
         verifyException("org.jcvi.jillion.core.Range$Builder", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Range.Builder range_Builder0 = new Range.Builder((-1336L), 0L);
      range_Builder0.expandBegin((-1336L));
      range_Builder0.expandEnd(0L);
      range_Builder0.expandEnd(0L);
      long long0 = (-1368L);
      range_Builder0.expandEnd((-1368L));
      // Undeclared exception!
      try { 
        range_Builder0.contractBegin(2147483647L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // length can not be negative
         //
         verifyException("org.jcvi.jillion.core.Range$Builder", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=3.4339872044851467
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Range range0 = Range.ofLength(0L);
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.RESIDUE_BASED;
      Range range1 = Range.of(range_CoordinateSystem0, 0L, 0L);
      List<Range> list0 = range0.complement(range1);
      range0.complementFrom(list0);
      Range.CoordinateSystem range_CoordinateSystem1 = Range.CoordinateSystem.ZERO_BASED;
      // Undeclared exception!
      try { 
        Range.parseRange("ZSN<bum A:", range_CoordinateSystem1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // can not parse ZSN<bum A: into a Range
         //
         verifyException("org.jcvi.jillion.core.Range", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=3.7232586923531557
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.SPACE_BASED;
      Range.Builder range_Builder0 = new Range.Builder(range_CoordinateSystem0, (-1860L), 0L);
      range_Builder0.contractEnd(0L);
      Range range0 = range_Builder0.build();
      Range range1 = Range.ofLength(255L);
      boolean boolean0 = range0.isSubRangeOf(range1);
      assertFalse(boolean0);
      
      range_Builder0.contractEnd(0L);
      Range.Builder range_Builder1 = range_Builder0.contractEnd(0L);
      Range range2 = Range.ofLength(0L);
      Range range3 = Range.of(4294967295L);
      range3.getEnd(range_CoordinateSystem0);
      range3.iterator();
      LinkedList<Range> linkedList0 = new LinkedList<Range>();
      range2.complementFrom(linkedList0);
      assertTrue(range2.isEmpty());
      
      Range.CoordinateSystem.values();
      range3.complement(range2);
      Range.CoordinateSystem range_CoordinateSystem1 = Range.CoordinateSystem.RESIDUE_BASED;
      String string0 = range3.toString(range_CoordinateSystem1);
      assertEquals("[ 4294967296 .. 4294967296 ]/RB", string0);
      
      range_Builder1.shift((-1860L));
      Range range4 = Range.of(0L);
      assertNotSame(range4, range1);
      assertFalse(range4.isEmpty());
      
      Range.CoordinateSystem range_CoordinateSystem2 = Range.CoordinateSystem.SPACE_BASED;
      Range range5 = Range.of(range_CoordinateSystem2, (-1841L), 0L);
      assertNotSame(range5, range0);
      assertFalse(range5.isEmpty());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.8782183066708504
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Range range0 = Range.of(0L);
      long long0 = 488L;
      Range range1 = null;
      // Undeclared exception!
      try { 
        range0.startsBefore((Range) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Null Range used in range comparison operation.
         //
         verifyException("org.jcvi.jillion.core.Range", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.772588722239781
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Range.Builder range_Builder0 = new Range.Builder();
      Range range0 = range_Builder0.build();
      // Undeclared exception!
      try { 
        range0.split((-1252L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // max splitLength must be >= 1
         //
         verifyException("org.jcvi.jillion.core.Range", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=3.401197381662154
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      long long0 = (-1713L);
      Range range0 = Range.of((-1713L));
      Object object0 = new Object();
      range0.equals(object0);
      Range.Builder range_Builder0 = new Range.Builder((-1713L), (-1713L));
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      range_Builder0.shift((-1713L));
      range0.forEach(consumer0);
      // Undeclared exception!
      try { 
        range_Builder0.contractBegin(255L);
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
  /*Coverage entropy=3.347877419079571
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Range.Builder range_Builder0 = new Range.Builder(622L, 622L);
      Range range0 = Range.ofLength(1L);
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.RESIDUE_BASED;
      Range range1 = Range.of(range_CoordinateSystem0, (-2153L), 1L);
      boolean boolean0 = range0.isSubRangeOf(range1);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=3.4572234522278356
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Range range0 = Range.ofLength(676L);
      range0.toString();
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      Range.parseRange("[ 0 .. 675 ]/0B");
      range0.forEach(consumer0);
      range0.toString();
      range0.getBegin();
      Range.of(676L);
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
  //Test case number: 18
  /*Coverage entropy=3.0146300137242736
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.SPACE_BASED;
      Range range0 = Range.of(range_CoordinateSystem0, 344L, 1421L);
      range0.split(344L);
      Range.CoordinateSystem range_CoordinateSystem1 = Range.CoordinateSystem.RESIDUE_BASED;
      Range.Builder range_Builder0 = null;
      try {
        range_Builder0 = new Range.Builder(range_CoordinateSystem1, 1421L, 668L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // length can not be negative
         //
         verifyException("org.jcvi.jillion.core.Range$Builder", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=3.678392578468838
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.SPACE_BASED;
      Range.Builder range_Builder0 = new Range.Builder(range_CoordinateSystem0, (-1860L), 0L);
      range_Builder0.contractEnd(0L);
      Range range0 = range_Builder0.build();
      Range range1 = Range.ofLength(255L);
      range0.isSubRangeOf(range1);
      range_Builder0.contractEnd(0L);
      range_Builder0.contractEnd(0L);
      Range.ofLength(0L);
      Range range2 = Range.of(4294967295L);
      range2.getEnd(range_CoordinateSystem0);
      Range range3 = Range.of((-1860L));
      range0.complement(range3);
      Range.CoordinateSystem range_CoordinateSystem1 = Range.CoordinateSystem.ZERO_BASED;
      Range.CoordinateSystem range_CoordinateSystem2 = Range.CoordinateSystem.ZERO_BASED;
      range1.getBegin(range_CoordinateSystem2);
      range_CoordinateSystem1.getAbbreviatedName();
      Range range4 = range3.asRange();
      assertSame(range3, range4);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=3.471435875770147
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Range range0 = Range.of(365L);
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.SPACE_BASED;
      LinkedList<Range> linkedList0 = new LinkedList<Range>();
      linkedList0.add(range0);
      List<Range> list0 = range0.complementFrom(linkedList0);
      assertTrue(list0.isEmpty());
      
      Range range1 = Range.of(range_CoordinateSystem0, 871L, 871L);
      range1.iterator();
      List<Range> list1 = range0.complement(range1);
      range1.getBegin();
      Range.CoordinateSystem range_CoordinateSystem1 = Range.CoordinateSystem.ZERO_BASED;
      Range.CoordinateSystem range_CoordinateSystem2 = Range.CoordinateSystem.SPACE_BASED;
      range1.getBegin(range_CoordinateSystem2);
      range_CoordinateSystem1.getAbbreviatedName();
      range0.asRange();
      List<Range> list2 = range0.split(365L);
      assertTrue(list2.equals((Object)list1));
  }

  /**
  //Test case number: 21
  /*Coverage entropy=2.8782183066708504
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      long long0 = 1123L;
      long long1 = 0L;
      Range range0 = Range.ofLength(1354L);
      range0.getLength();
      LinkedList<Range> linkedList0 = new LinkedList<Range>();
      ToDoubleFunction<Object> toDoubleFunction0 = (ToDoubleFunction<Object>) mock(ToDoubleFunction.class, new ViolatedAssumptionAnswer());
      Comparator<Object> comparator0 = Comparator.comparingDouble((ToDoubleFunction<? super Object>) toDoubleFunction0);
      linkedList0.sort(comparator0);
      range0.complementFrom(linkedList0);
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
  //Test case number: 22
  /*Coverage entropy=3.4126078214645363
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.RESIDUE_BASED;
      Range range0 = Range.of(range_CoordinateSystem0, (-181L), (-181L));
      range0.iterator();
      Range range1 = Range.of((-181L));
      range1.intersects(range0);
      range1.intersection(range0);
      Range.CoordinateSystem range_CoordinateSystem1 = Range.CoordinateSystem.RESIDUE_BASED;
      range0.getEnd(range_CoordinateSystem1);
      range1.getBegin(range_CoordinateSystem0);
      // Undeclared exception!
      try { 
        Range.parseRange("\"NSG5^uDQ[G", range_CoordinateSystem0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // can not parse \"NSG5^uDQ[G into a Range
         //
         verifyException("org.jcvi.jillion.core.Range", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=3.7641606229589843
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.SPACE_BASED;
      Range.Builder range_Builder0 = new Range.Builder(range_CoordinateSystem0, (-1860L), 0L);
      range_Builder0.contractEnd(0L);
      Range range0 = range_Builder0.build();
      Range range1 = Range.ofLength(255L);
      range0.isSubRangeOf(range1);
      range_Builder0.contractEnd(0L);
      range_Builder0.contractEnd(0L);
      Range range2 = Range.ofLength(0L);
      Range range3 = Range.of(4294967295L);
      range3.getEnd(range_CoordinateSystem0);
      range3.iterator();
      LinkedList<Range> linkedList0 = new LinkedList<Range>();
      range2.complementFrom(linkedList0);
      Range.CoordinateSystem.values();
      range3.complement(range2);
      Range range4 = Range.of((-1860L), 4294967296L);
      assertFalse(range4.equals((Object)range2));
  }

  /**
  //Test case number: 24
  /*Coverage entropy=3.4657359027997248
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.RESIDUE_BASED;
      long long0 = (-181L);
      Range range0 = Range.of(range_CoordinateSystem0, (-181L), (-181L));
      range0.iterator();
      Range range1 = range0.asRange();
      range1.intersects(range0);
      range1.intersection(range0);
      Range.CoordinateSystem range_CoordinateSystem1 = Range.CoordinateSystem.RESIDUE_BASED;
      range0.getEnd(range_CoordinateSystem1);
      range1.getBegin(range_CoordinateSystem0);
      Range range2 = null;
      Range.Builder range_Builder0 = null;
      try {
        range_Builder0 = new Range.Builder((Range) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // range can not be null
         //
         verifyException("org.jcvi.jillion.core.Range$Builder", e);
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=3.284892360251434
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.SPACE_BASED;
      Range range0 = Range.of(range_CoordinateSystem0, 255L, 255L);
      Range.CoordinateSystem range_CoordinateSystem1 = Range.CoordinateSystem.ZERO_BASED;
      Range range1 = Range.of(range_CoordinateSystem1, 255L, 255L);
      Range.CoordinateSystem range_CoordinateSystem2 = Range.CoordinateSystem.SPACE_BASED;
      String string0 = range1.toString(range_CoordinateSystem2);
      assertEquals("[ 255 .. 256 ]/SB", string0);
      
      Range.of(255L, 1859L);
      boolean boolean0 = range0.startsBefore(range1);
      assertFalse(boolean0);
      
      long long0 = range0.getLength();
      assertEquals(0L, long0);
      
      range0.complement(range1);
      assertTrue(range0.isEmpty());
  }

  /**
  //Test case number: 26
  /*Coverage entropy=3.435049411128326
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.SPACE_BASED;
      Range range0 = Range.of(range_CoordinateSystem0, 344L, 1421L);
      Range range1 = Range.of((-1L));
      range0.complement(range1);
      Range range2 = range0.asRange();
      assertSame(range2, range0);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=3.5911526323981415
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.SPACE_BASED;
      Range.Builder range_Builder0 = new Range.Builder(range_CoordinateSystem0, (-1860L), 0L);
      range_Builder0.contractEnd(0L);
      Range range0 = range_Builder0.build();
      Range range1 = Range.ofLength(255L);
      range0.isSubRangeOf(range1);
      range_Builder0.contractEnd(0L);
      range_Builder0.contractBegin((-1860L));
      range_Builder0.contractEnd(0L);
      Range range2 = Range.ofLength(0L);
      Range range3 = Range.of(4294967295L);
      range3.getEnd(range_CoordinateSystem0);
      range3.iterator();
      LinkedList<Range> linkedList0 = new LinkedList<Range>();
      range2.complementFrom(linkedList0);
      Range.CoordinateSystem[] range_CoordinateSystemArray0 = Range.CoordinateSystem.values();
      range0.isSubRangeOf(range2);
      range2.startsBefore(range3);
      Range.CoordinateSystem[] range_CoordinateSystemArray1 = Range.CoordinateSystem.values();
      assertFalse(range_CoordinateSystemArray1.equals((Object)range_CoordinateSystemArray0));
  }

  /**
  //Test case number: 28
  /*Coverage entropy=2.0642580751745085
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      long long0 = 622L;
      Range.Builder range_Builder0 = new Range.Builder(622L, 622L);
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.ZERO_BASED;
      // Undeclared exception!
      try { 
        Range.of(range_CoordinateSystem0, 830L, (-9223372036854775808L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Range coordinates 830, -9223372036854775808 are not valid Zero Based coordinates
         //
         verifyException("org.jcvi.jillion.core.Range$Builder", e);
      }
  }

  /**
  //Test case number: 29
  /*Coverage entropy=3.4199815053887392
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Range range0 = Range.of((-2661L), (-2661L));
      Range range1 = Range.of((-2661L));
      long long0 = range0.getBegin();
      assertEquals((-2661L), long0);
      
      Long long1 = new Long((-2661L));
      boolean boolean0 = range0.intersects(range1);
      Range range2 = Range.ofLength(600L);
      assertFalse(range2.isEmpty());
      
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.RESIDUE_BASED;
      Range.of(range_CoordinateSystem0, (-3075L), (-2661L));
      Range range3 = Range.of((-2661L), (-1406L));
      boolean boolean1 = range3.isSubRangeOf(range1);
      assertFalse(boolean1 == boolean0);
      assertSame(range1, range0);
      assertFalse(boolean1);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=3.6280156368701584
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Range range0 = Range.ofLength(0L);
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.RESIDUE_BASED;
      Range range1 = Range.of(range_CoordinateSystem0, 0L, 0L);
      range0.complement(range1);
      LinkedList<Range> linkedList0 = new LinkedList<Range>();
      range0.complementFrom(linkedList0);
      Range.CoordinateSystem.values();
      Range range2 = Range.ofLength(0L);
      range0.complement(range2);
      Range.CoordinateSystem range_CoordinateSystem1 = Range.CoordinateSystem.RESIDUE_BASED;
      range0.toString(range_CoordinateSystem0);
      Range.Builder range_Builder0 = new Range.Builder(range0);
      range_Builder0.shift(0L);
      Range.of(0L);
      // Undeclared exception!
      try { 
        Range.of(range_CoordinateSystem1, 255L, (-900L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // length can not be negative
         //
         verifyException("org.jcvi.jillion.core.Range$Builder", e);
      }
  }

  /**
  //Test case number: 31
  /*Coverage entropy=3.8986781752421305
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Range range0 = Range.of(365L);
      Range range1 = Range.of((-1L), 2147483647L);
      List<Range> list0 = range0.complement(range1);
      range1.complementFrom(list0);
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.SPACE_BASED;
      Range.of(range_CoordinateSystem0, (-2374L), 365L);
      range1.iterator();
      Range range2 = Range.of(1509L);
      range1.complement(range2);
      range0.getBegin();
      range2.getBegin(range_CoordinateSystem0);
      range_CoordinateSystem0.getAbbreviatedName();
      // Undeclared exception!
      try { 
        Range.ofLength((-1228L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must be >=0
         //
         verifyException("org.jcvi.jillion.core.Range$Builder", e);
      }
  }

  /**
  //Test case number: 32
  /*Coverage entropy=3.5069518953604475
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Range range0 = Range.of((-1501L));
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.SPACE_BASED;
      Range.CoordinateSystem range_CoordinateSystem1 = Range.CoordinateSystem.ZERO_BASED;
      Range.Builder range_Builder0 = new Range.Builder(range_CoordinateSystem1, (-1501L), (-1501L));
      range_Builder0.contractEnd((-1501L));
      range_Builder0.build();
      Range range1 = Range.ofLength(255L);
      range0.isSubRangeOf(range1);
      Range.Builder range_Builder1 = range_Builder0.contractEnd(255L);
      range_Builder1.contractEnd((-1501L));
      Range.ofLength(0L);
      long long0 = 9223372036854775807L;
      Range.of(9223372036854775807L);
      // Undeclared exception!
      try { 
        Range.parseRange("UglhmE8oc1}\"{");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // can not parse UglhmE8oc1}\"{ into a Range
         //
         verifyException("org.jcvi.jillion.core.Range", e);
      }
  }

  /**
  //Test case number: 33
  /*Coverage entropy=3.815234652142389
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Range range0 = Range.of(365L);
      range0.spliterator();
      Range range1 = Range.of((-1L), 2147483647L);
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.SPACE_BASED;
      Range.of(range_CoordinateSystem0, (-2374L), 365L);
      range1.iterator();
      Range range2 = Range.of((-1L));
      range1.complement(range2);
      Range.of((-2374L), (-2374L));
      range0.getBegin();
      range2.getBegin(range_CoordinateSystem0);
      range_CoordinateSystem0.getAbbreviatedName();
      Range range3 = range1.asRange();
      assertFalse(range3.equals((Object)range2));
  }

  /**
  //Test case number: 34
  /*Coverage entropy=3.47622405709491
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Range range0 = Range.ofLength(9223372036854775807L);
      Range range1 = Range.ofLength(9223372036854775807L);
      Range range2 = Range.ofLength(9223372036854775807L);
      range0.startsBefore(range1);
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.ZERO_BASED;
      Range.of(range_CoordinateSystem0, 0L, 343L);
      List<Range> list0 = range2.complement(range1);
      range2.complementFrom(list0);
      // Undeclared exception!
      try { 
        Range.of(range_CoordinateSystem0, 1535L, (-128L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // length can not be negative
         //
         verifyException("org.jcvi.jillion.core.Range$Builder", e);
      }
  }

  /**
  //Test case number: 35
  /*Coverage entropy=3.1931597420249545
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      long long0 = 9223372036854775807L;
      Range.ofLength(9223372036854775807L);
      Range range0 = Range.ofLength(9223372036854775807L);
      Range.Builder range_Builder0 = new Range.Builder(range0);
      range_Builder0.shift(9223372036854775807L);
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      range0.forEach(consumer0);
      long long1 = 156L;
      Range range1 = Range.of(156L);
      Range.Builder range_Builder1 = new Range.Builder(range1);
      // Undeclared exception!
      try { 
        range_Builder1.contractBegin(9223372036854775807L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // length can not be negative
         //
         verifyException("org.jcvi.jillion.core.Range$Builder", e);
      }
  }

  /**
  //Test case number: 36
  /*Coverage entropy=2.9412316867217543
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Range.of((-2661L));
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.SPACE_BASED;
      long long0 = (-3240L);
      Range range0 = Range.of((-3240L));
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
  //Test case number: 37
  /*Coverage entropy=3.421499550652205
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.SPACE_BASED;
      Range range0 = Range.of(range_CoordinateSystem0, 1123L, 1123L);
      range0.spliterator();
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      range0.forEach(consumer0);
      Range range1 = Range.of(1123L);
      Range range2 = Range.of(range_CoordinateSystem0, 1123L, 1123L);
      range2.startsBefore(range0);
      boolean boolean0 = range1.intersects(range0);
      assertFalse(boolean0);
      
      Range range3 = range0.intersection(range1);
      range0.getBegin();
      long long0 = range3.getBegin(range_CoordinateSystem0);
      assertFalse(range1.isEmpty());
      assertSame(range0, range2);
      assertTrue(range3.isEmpty());
      assertEquals(1123L, long0);
  }

  /**
  //Test case number: 38
  /*Coverage entropy=3.6775345073654315
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Range range0 = Range.of(365L);
      Range range1 = Range.of((-1L), 2147483647L);
      List<Range> list0 = range0.complement(range1);
      range1.complementFrom(list0);
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.SPACE_BASED;
      Range.of(range_CoordinateSystem0, (-2374L), 365L);
      range1.iterator();
      range1.complement(range1);
      Range.CoordinateSystem range_CoordinateSystem1 = Range.CoordinateSystem.SPACE_BASED;
      Range.of(range_CoordinateSystem1, (-2374L), (-1399L));
      // Undeclared exception!
      try { 
        Range.ofLength((-1L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must be >=0
         //
         verifyException("org.jcvi.jillion.core.Range$Builder", e);
      }
  }

  /**
  //Test case number: 39
  /*Coverage entropy=3.531452678991548
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.RESIDUE_BASED;
      Range range0 = Range.of(range_CoordinateSystem0, 127L, 1941L);
      range0.spliterator();
      Consumer<Long> consumer0 = (Consumer<Long>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      range0.forEach(consumer0);
      Range range1 = Range.of((-1501L));
      Range.CoordinateSystem range_CoordinateSystem1 = Range.CoordinateSystem.SPACE_BASED;
      Range range2 = Range.of(range_CoordinateSystem1, (-1501L), 1941L);
      range2.startsBefore(range0);
      boolean boolean0 = range2.intersects(range1);
      assertTrue(boolean0);
      
      Range range3 = range0.intersection(range2);
      range0.getBegin();
      Range.CoordinateSystem range_CoordinateSystem2 = Range.CoordinateSystem.RESIDUE_BASED;
      long long0 = range1.getBegin(range_CoordinateSystem2);
      assertEquals((-1500L), long0);
      
      Range.CoordinateSystem range_CoordinateSystem3 = Range.CoordinateSystem.RESIDUE_BASED;
      String string0 = range0.toString(range_CoordinateSystem3);
      assertEquals("[ 127 .. 1941 ]/RB", string0);
      
      boolean boolean1 = range2.endsBefore(range3);
      assertSame(range3, range0);
      assertFalse(range3.isEmpty());
      assertFalse(boolean1);
  }

  /**
  //Test case number: 40
  /*Coverage entropy=3.0280290733074104
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      long long0 = (-1501L);
      Range range0 = Range.of((-1501L));
      String string0 = null;
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.SPACE_BASED;
      Range range1 = null;
      range0.equals((Object) null);
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
  //Test case number: 41
  /*Coverage entropy=3.5553480614894135
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Range.of(9L, 9L);
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.RESIDUE_BASED;
      Range.of(range_CoordinateSystem0, 9L, 2147483647L);
      Range.of(9L, 9L);
      Range.CoordinateSystem range_CoordinateSystem1 = Range.CoordinateSystem.SPACE_BASED;
      Range range0 = Range.of(range_CoordinateSystem1, 2147483647L, 2147483647L);
      range0.getBegin();
      Range.CoordinateSystem.values();
      long long0 = 0L;
      long long1 = 4117L;
      Range.of(0L);
      String string0 = "A#2nrd9 }@";
      range0.getEnd(range_CoordinateSystem0);
      Range.CoordinateSystem range_CoordinateSystem2 = Range.CoordinateSystem.RESIDUE_BASED;
      // Undeclared exception!
      try { 
        Range.parseRange("A#2nrd9 }@", range_CoordinateSystem2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // can not parse A#2nrd9 }@ into a Range
         //
         verifyException("org.jcvi.jillion.core.Range", e);
      }
  }

  /**
  //Test case number: 42
  /*Coverage entropy=2.9761388013384344
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Range range0 = Range.of(0L);
      Spliterator<Long> spliterator0 = range0.spliterator();
      long long0 = range0.getBegin();
      assertEquals(0L, long0);
      
      boolean boolean0 = range0.equals(spliterator0);
      assertFalse(range0.isEmpty());
      assertFalse(boolean0);
  }
}
