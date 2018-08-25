/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 09:56:01 GMT 2018
 */

package org.jcvi.jillion.core.residue.nt;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.BufferUnderflowException;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Consumer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jcvi.jillion.core.Range;
import org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec;
import org.jcvi.jillion.core.residue.nt.Nucleotide;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DefaultNucleotideCodec_ESTest extends DefaultNucleotideCodec_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)0;
      byte byte0 = (byte)13;
      byteArray0[1] = (byte)13;
      byte[] byteArray1 = new byte[7];
      byteArray1[0] = (byte)0;
      byteArray1[1] = (byte)13;
      byteArray1[2] = (byte)0;
      byteArray1[3] = (byte)13;
      byteArray1[4] = (byte)0;
      byteArray1[5] = (byte)13;
      byteArray1[6] = (byte)13;
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.getNumberOfGaps(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.1006789212792607
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DefaultNucleotideCodec.values();
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)8;
      byteArray0[1] = (byte)109;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte) (-1);
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte)32;
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.getUngappedOffsetFor(byteArray0, 697);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.110016553375461
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[9];
      byte byte0 = (byte)72;
      byteArray0[0] = (byte)72;
      byteArray0[1] = (byte)54;
      byteArray0[2] = (byte) (-39);
      byteArray0[3] = (byte)9;
      byte byte1 = (byte)0;
      byteArray0[4] = (byte)0;
      byte byte2 = (byte)6;
      byteArray0[5] = (byte)6;
      byte byte3 = (byte)0;
      byteArray0[6] = (byte)0;
      byte byte4 = (byte)0;
      byteArray0[7] = (byte)0;
      byteArray0[8] = (byte) (-1);
      defaultNucleotideCodec0.getGappedOffsetFor(byteArray0, (byte)6);
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.isGap(byteArray0, 1073741824);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[2];
      byte byte0 = (byte)4;
      Nucleotide nucleotide0 = Nucleotide.NotCytosine;
      defaultNucleotideCodec0.encode(nucleotide0);
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.getUngappedOffsetFor(byteArray0, 1073741824);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.20082764903455
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[7];
      byte byte0 = (byte)98;
      byteArray0[0] = (byte)98;
      byte byte1 = (byte)0;
      byteArray0[1] = (byte)0;
      defaultNucleotideCodec0.decode(byteArray0, 1L);
      byteArray0[2] = (byte)0;
      defaultNucleotideCodec0.decodedLengthOf(byteArray0);
      byte byte2 = (byte)13;
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.getGapOffsets(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Nucleotide nucleotide0 = Nucleotide.NotCytosine;
      Set<Nucleotide> set0 = nucleotide0.getBasesFor();
      defaultNucleotideCodec0.encode((Collection<Nucleotide>) set0);
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.encode(341, (Iterator<Nucleotide>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[4];
      defaultNucleotideCodec0.toString(byteArray0);
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)65;
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.getGapOffsets(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[6];
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec1.getUngappedLength(byteArray0);
      Range.of(0L, (-1L));
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.ZERO_BASED;
      Range.CoordinateSystem range_CoordinateSystem1 = Range.CoordinateSystem.ZERO_BASED;
      // Undeclared exception!
      try { 
        Range.of(range_CoordinateSystem1, 4009L, 550L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // length can not be negative
         //
         verifyException("org.jcvi.jillion.core.Range$Builder", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-114);
      byteArray0[1] = (byte)9;
      byteArray0[2] = (byte)74;
      byteArray0[3] = (byte)7;
      byteArray0[4] = (byte)11;
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.decode(byteArray0, (byte) (-114));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // index can not be negative: -114
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      defaultNucleotideCodec0.getGappedOffsetFor(byteArray0, 306);
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray1 = new byte[9];
      byteArray1[0] = (byte) (-1);
      byteArray1[1] = (byte)0;
      byteArray1[2] = (byte) (-1);
      byteArray1[3] = (byte) (-1);
      byteArray1[4] = (byte)0;
      byteArray1[5] = (byte)0;
      byteArray1[6] = (byte)0;
      byteArray1[7] = (byte) (-1);
      byteArray1[8] = (byte)0;
      defaultNucleotideCodec1.isGap(byteArray1, 427);
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.RESIDUE_BASED;
      Range range0 = Range.of(range_CoordinateSystem0, (long) (byte) (-1), 1L);
      // Undeclared exception!
      try { 
        defaultNucleotideCodec1.iterator(byteArray1, range0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must be >=0
         //
         verifyException("org.jcvi.jillion.core.Range$Builder", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.8989267893363289
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[5];
      byte byte0 = (byte)108;
      byteArray0[0] = (byte)108;
      byte byte1 = (byte) (-12);
      byteArray0[1] = (byte) (-12);
      byte byte2 = (byte)0;
      byte byte3 = (byte)0;
      byte byte4 = (byte) (-1);
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      // Undeclared exception!
      try { 
        defaultNucleotideCodec1.getGappedOffsetFor(byteArray0, (byte) (-12));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)118;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)58;
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.SPACE_BASED;
      Range range0 = Range.of(range_CoordinateSystem0, (long) (byte)0, 2147483647L);
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.iterator(byteArray0, range0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // range [ 0 .. 2147483646 ]/0B is out of range of sequence which is only [ 0 .. 1979711545 ]/0B
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.757281866195724
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Nucleotide nucleotide0 = Nucleotide.NotCytosine;
      Set<Nucleotide> set0 = nucleotide0.getBasesFor();
      byte[] byteArray0 = defaultNucleotideCodec0.encode((Collection<Nucleotide>) set0);
      long long0 = defaultNucleotideCodec0.getUngappedLength(byteArray0);
      assertEquals(3L, long0);
      
      int int0 = defaultNucleotideCodec0.getGappedOffsetFor(byteArray0, (-586));
      assertEquals(3, int0);
      
      DefaultNucleotideCodec.values();
      int int1 = defaultNucleotideCodec0.getNumberOfGapsUntil(byteArray0, 341);
      assertEquals(0, int1);
      assertEquals(6, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)3, (byte)18, (byte) (-32)}, byteArray0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.1458417525947544
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Range range0 = Range.ofLength(3846L);
      range0.toString();
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)81;
      byteArray0[2] = (byte)34;
      byteArray0[3] = (byte) (-39);
      byteArray0[4] = (byte)11;
      byteArray0[5] = (byte)54;
      defaultNucleotideCodec1.iterator(byteArray0, range0);
      byte[] byteArray1 = new byte[8];
      byteArray1[0] = (byte) (-39);
      byteArray1[1] = (byte)81;
      byteArray1[2] = (byte) (-39);
      byteArray1[3] = (byte)0;
      byteArray1[4] = (byte)81;
      byteArray1[5] = (byte)81;
      byteArray1[6] = (byte) (-39);
      byteArray1[7] = (byte)54;
      defaultNucleotideCodec0.getNumberOfGaps(byteArray1);
      // Undeclared exception!
      try { 
        DefaultNucleotideCodec.valueOf("\\Koc");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.\\Koc
         //
         verifyException("java.lang.Enum", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)1;
      byteArray0[1] = (byte) (-128);
      byteArray0[2] = (byte) (-1);
      byteArray0[3] = (byte) (-1);
      byteArray0[4] = (byte)3;
      byteArray0[5] = (byte) (-42);
      // Undeclared exception!
      try { 
        defaultNucleotideCodec1.decode(byteArray0, 4L);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // index 4 corresponds to encodedIndex 6  encodedglyph length is 6
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.6156305770275505
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      int int0 = defaultNucleotideCodec0.getGappedOffsetFor(byteArray0, 306);
      assertEquals(0, int0);
      
      Nucleotide nucleotide0 = Nucleotide.NotCytosine;
      nucleotide0.getAllPossibleAmbiguities();
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      Nucleotide nucleotide1 = Nucleotide.Weak;
      Set<Nucleotide> set0 = nucleotide1.getBasesFor();
      byte[] byteArray1 = defaultNucleotideCodec1.encode((Collection<Nucleotide>) set0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)2, (byte)30}, byteArray1);
      
      DefaultNucleotideCodec defaultNucleotideCodec2 = DefaultNucleotideCodec.INSTANCE;
      boolean boolean0 = defaultNucleotideCodec2.isGap(byteArray0, (-5932));
      assertFalse(boolean0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.5393673998815776
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Nucleotide nucleotide0 = Nucleotide.Amino;
      Set<Nucleotide> set0 = nucleotide0.getBasesFor();
      byte[] byteArray0 = defaultNucleotideCodec0.encode((Collection<Nucleotide>) set0);
      long long0 = defaultNucleotideCodec0.getUngappedLength(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)2, (byte)29}, byteArray0);
      assertEquals(2L, long0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.2161022480912633
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[7];
      byte byte0 = (byte)98;
      byteArray0[0] = (byte)98;
      byte byte1 = (byte)0;
      byteArray0[1] = (byte)0;
      defaultNucleotideCodec0.decode(byteArray0, (byte)0);
      byteArray0[2] = (byte)98;
      defaultNucleotideCodec0.decodedLengthOf(byteArray0);
      byte byte2 = (byte)13;
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.getGapOffsets(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[7];
      defaultNucleotideCodec0.getUngappedOffsetFor(byteArray0, 0);
      defaultNucleotideCodec0.getNumberOfGapsUntil(byteArray0, 84);
      byteArray0[0] = (byte)0;
      byteArray0[2] = (byte)0;
      byte byte0 = (byte) (-1);
      byte[] byteArray1 = new byte[9];
      byteArray1[0] = (byte) (-1);
      byteArray1[1] = (byte)0;
      byteArray1[2] = (byte) (-1);
      byteArray1[3] = (byte) (-1);
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      Iterator<Nucleotide> iterator0 = defaultNucleotideCodec1.iterator(byteArray0);
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.encode(12, iterator0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no more elements
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.701935198763085
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Nucleotide nucleotide0 = Nucleotide.NotGuanine;
      Set<Nucleotide> set0 = nucleotide0.getBasesFor();
      byte[] byteArray0 = defaultNucleotideCodec0.encode((Collection<Nucleotide>) set0);
      long long0 = defaultNucleotideCodec0.getUngappedLength(byteArray0);
      assertEquals(3L, long0);
      
      String string0 = defaultNucleotideCodec0.toString(byteArray0);
      assertEquals("ACT", string0);
      assertEquals(6, byteArray0.length);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=2.684656541916559
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Nucleotide nucleotide0 = Nucleotide.Gap;
      Set<Nucleotide> set0 = nucleotide0.getBasesFor();
      byte[] byteArray0 = defaultNucleotideCodec0.encode((Collection<Nucleotide>) set0);
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      int int0 = defaultNucleotideCodec1.getGappedOffsetFor(byteArray0, 899);
      assertEquals(0, int0);
      
      DefaultNucleotideCodec.values();
      DefaultNucleotideCodec defaultNucleotideCodec2 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec2.getNumberOfGapsUntil(byteArray0, (-586));
      int int1 = defaultNucleotideCodec2.getNumberOfGapsUntil(byteArray0, 899);
      assertFalse(int1 == int0);
      assertEquals(5, byteArray0.length);
      assertEquals(1, int1);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=2.3114234446919735
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)34;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)34;
      byteArray0[3] = (byte)34;
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte)81;
      byteArray0[6] = (byte)81;
      Range range0 = Range.ofLength((byte)0);
      defaultNucleotideCodec0.iterator(byteArray0, range0);
      Nucleotide nucleotide0 = Nucleotide.Purine;
      Set<Nucleotide> set0 = nucleotide0.getAllPossibleAmbiguities();
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray1 = defaultNucleotideCodec1.encode((Collection<Nucleotide>) set0);
      DefaultNucleotideCodec defaultNucleotideCodec2 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec2.toString(byteArray1);
      // Undeclared exception!
      try { 
        DefaultNucleotideCodec.valueOf("/*`!-c5kdunPa?u(");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec./*`!-c5kdunPa?u(
         //
         verifyException("java.lang.Enum", e);
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=2.3114234446919735
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      DefaultNucleotideCodec.values();
      Nucleotide nucleotide0 = Nucleotide.Weak;
      Set<Nucleotide> set0 = nucleotide0.getBasesFor();
      byte[] byteArray0 = defaultNucleotideCodec0.encode((Collection<Nucleotide>) set0);
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec1.toString(byteArray0);
      String string0 = "-iqx}X>tdr7#2)k8i";
      // Undeclared exception!
      try { 
        DefaultNucleotideCodec.valueOf("-iqx}X>tdr7#2)k8i");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.-iqx}X>tdr7#2)k8i
         //
         verifyException("java.lang.Enum", e);
      }
  }
}
