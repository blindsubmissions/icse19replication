/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 11:22:57 GMT 2018
 */

package org.jcvi.jillion.core.residue.nt;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.BufferUnderflowException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
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
      int int0 = 86;
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-119);
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)1;
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte)8;
      byteArray0[6] = (byte)0;
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
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)31;
      byteArray0[1] = (byte)2;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte) (-1);
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.getUngappedOffsetFor(byteArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Nucleotide nucleotide0 = Nucleotide.Amino;
      byte[] byteArray0 = defaultNucleotideCodec0.encode(nucleotide0);
      defaultNucleotideCodec0.getGapOffsets(byteArray0);
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.decode(byteArray0, (-102L));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // index can not be negative: -102
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)127;
      byteArray0[1] = (byte)1;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)0;
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.decode(byteArray0, (byte)127);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // index 127 corresponds to encodedIndex 67  encodedglyph length is 4
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DefaultNucleotideCodec.values();
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Nucleotide nucleotide0 = Nucleotide.Cytosine;
      Set<Nucleotide> set0 = nucleotide0.getBasesFor();
      defaultNucleotideCodec0.encode((Collection<Nucleotide>) set0);
      LinkedList<Nucleotide> linkedList0 = new LinkedList<Nucleotide>();
      defaultNucleotideCodec0.encode((Collection<Nucleotide>) linkedList0);
      Nucleotide nucleotide1 = Nucleotide.Amino;
      byte[] byteArray0 = defaultNucleotideCodec0.encode(nucleotide1);
      Range range0 = null;
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.iterator(byteArray0, (Range) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.898745539586339
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Nucleotide nucleotide0 = Nucleotide.Weak;
      Set<Nucleotide> set0 = nucleotide0.getAllPossibleAmbiguities();
      byte[] byteArray0 = defaultNucleotideCodec0.encode((Collection<Nucleotide>) set0);
      boolean boolean0 = defaultNucleotideCodec0.isGap(byteArray0, 8);
      assertFalse(boolean0);
      
      defaultNucleotideCodec0.getUngappedLength(byteArray0);
      defaultNucleotideCodec0.iterator(byteArray0);
      defaultNucleotideCodec0.getGapOffsets(byteArray0);
      Nucleotide nucleotide1 = Nucleotide.Strong;
      byte[] byteArray1 = defaultNucleotideCodec0.encode(nucleotide1);
      byte[] byteArray2 = new byte[6];
      byteArray2[0] = (byte) (-75);
      byteArray2[1] = (byte)71;
      byteArray2[2] = (byte)71;
      byteArray2[3] = (byte)7;
      byteArray2[4] = (byte) (-114);
      byteArray2[5] = (byte)11;
      defaultNucleotideCodec0.iterator(byteArray2);
      defaultNucleotideCodec0.iterator(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      
      long long0 = defaultNucleotideCodec0.getUngappedLength(byteArray1);
      assertEquals(1L, long0);
      
      defaultNucleotideCodec0.iterator(byteArray1);
      String string0 = defaultNucleotideCodec0.toString(byteArray1);
      assertEquals("S", string0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.833213344056216
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Nucleotide nucleotide0 = Nucleotide.Weak;
      Set<Nucleotide> set0 = nucleotide0.getAllPossibleAmbiguities();
      byte[] byteArray0 = defaultNucleotideCodec0.encode((Collection<Nucleotide>) set0);
      int int0 = 8;
      defaultNucleotideCodec0.getUngappedLength(byteArray0);
      defaultNucleotideCodec0.isGap(byteArray0, 8);
      defaultNucleotideCodec0.getUngappedLength(byteArray0);
      defaultNucleotideCodec0.iterator(byteArray0);
      Nucleotide nucleotide1 = Nucleotide.Guanine;
      defaultNucleotideCodec0.encode(nucleotide1);
      defaultNucleotideCodec0.toString(byteArray0);
      defaultNucleotideCodec0.encode(nucleotide0);
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray1 = new byte[2];
      byteArray1[0] = (byte) (-102);
      byteArray1[1] = (byte) (-1);
      // Undeclared exception!
      try { 
        defaultNucleotideCodec1.getNumberOfGaps(byteArray1);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[8];
      int int0 = (-1331);
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.ZERO_BASED;
      Range range0 = Range.of(range_CoordinateSystem0, 2L, 1279L);
      // Undeclared exception!
      try { 
        defaultNucleotideCodec1.iterator(byteArray0, range0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // range [ 2 .. 1279 ]/0B is out of range of sequence which is only [ 0 .. -1 ]/0B
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.0069548922107656
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)14;
      byteArray0[1] = (byte)14;
      byteArray0[2] = (byte)14;
      byteArray0[3] = (byte) (-82);
      byteArray0[1] = (byte)10;
      byteArray0[5] = (byte) (-82);
      byteArray0[6] = (byte)14;
      // Undeclared exception!
      try { 
        defaultNucleotideCodec1.getNumberOfGapsUntil(byteArray0, (byte) (-82));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DefaultNucleotideCodec.values();
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Nucleotide nucleotide0 = Nucleotide.Cytosine;
      Set<Nucleotide> set0 = nucleotide0.getBasesFor();
      byte[] byteArray0 = defaultNucleotideCodec0.encode((Collection<Nucleotide>) set0);
      LinkedList<Nucleotide> linkedList0 = new LinkedList<Nucleotide>();
      byte[] byteArray1 = defaultNucleotideCodec0.encode((Collection<Nucleotide>) linkedList0);
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec1.decode(byteArray0, (byte)0);
      defaultNucleotideCodec0.toString(byteArray1);
      // Undeclared exception!
      try { 
        DefaultNucleotideCodec.valueOf("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.
         //
         verifyException("java.lang.Enum", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.925202764171108
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Nucleotide nucleotide0 = Nucleotide.Weak;
      Set<Nucleotide> set0 = nucleotide0.getAllPossibleAmbiguities();
      byte[] byteArray0 = defaultNucleotideCodec0.encode((Collection<Nucleotide>) set0);
      boolean boolean0 = defaultNucleotideCodec0.isGap(byteArray0, 4);
      assertFalse(boolean0);
      
      defaultNucleotideCodec0.getUngappedLength(byteArray0);
      defaultNucleotideCodec0.iterator(byteArray0);
      defaultNucleotideCodec0.getGapOffsets(byteArray0);
      Nucleotide nucleotide1 = Nucleotide.Strong;
      int int0 = defaultNucleotideCodec0.getGappedOffsetFor(byteArray0, 4);
      assertEquals(0, int0);
      
      byte[] byteArray1 = defaultNucleotideCodec0.encode(nucleotide1);
      defaultNucleotideCodec0.iterator(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      
      long long0 = defaultNucleotideCodec0.getUngappedLength(byteArray1);
      assertEquals(1L, long0);
      
      defaultNucleotideCodec0.iterator(byteArray1);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)1, (byte) (-80)}, byteArray1);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.2102535776209735
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Nucleotide nucleotide0 = Nucleotide.Weak;
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      Set<Nucleotide> set0 = nucleotide0.getBasesFor();
      byte[] byteArray0 = defaultNucleotideCodec1.encode((Collection<Nucleotide>) set0);
      LinkedList<Nucleotide> linkedList0 = new LinkedList<Nucleotide>();
      DefaultNucleotideCodec defaultNucleotideCodec2 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec2.encode((Collection<Nucleotide>) linkedList0);
      DefaultNucleotideCodec defaultNucleotideCodec3 = DefaultNucleotideCodec.INSTANCE;
      // Undeclared exception!
      try { 
        defaultNucleotideCodec3.decode(byteArray0, (-1100L));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // index can not be negative: -1100
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.954673212304816
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Nucleotide nucleotide0 = Nucleotide.Weak;
      Set<Nucleotide> set0 = nucleotide0.getAllPossibleAmbiguities();
      byte[] byteArray0 = defaultNucleotideCodec0.encode((Collection<Nucleotide>) set0);
      defaultNucleotideCodec0.isGap(byteArray0, 8);
      defaultNucleotideCodec0.getUngappedLength(byteArray0);
      defaultNucleotideCodec0.iterator(byteArray0);
      defaultNucleotideCodec0.toString(byteArray0);
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec0.iterator(byteArray0);
      Range range0 = Range.of(0L);
      byte[] byteArray1 = new byte[5];
      byteArray1[0] = (byte)21;
      byteArray1[1] = (byte)32;
      byteArray1[2] = (byte)116;
      byteArray1[3] = (byte)5;
      byteArray1[4] = (byte)1;
      defaultNucleotideCodec0.iterator(byteArray1, range0);
      defaultNucleotideCodec1.iterator(byteArray1, range0);
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.isGap(byteArray1, (-2554));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DefaultNucleotideCodec.values();
      DefaultNucleotideCodec.values();
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      LinkedList<Nucleotide> linkedList0 = new LinkedList<Nucleotide>();
      byte[] byteArray0 = defaultNucleotideCodec0.encode((Collection<Nucleotide>) linkedList0);
      byte[] byteArray1 = new byte[6];
      byte byte0 = (byte) (-1);
      byteArray1[0] = (byte) (-1);
      byteArray1[1] = (byte)7;
      byte byte1 = (byte) (-15);
      byteArray1[2] = (byte) (-15);
      byteArray1[3] = (byte)9;
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      Range range0 = Range.of((-1L));
      // Undeclared exception!
      try { 
        defaultNucleotideCodec1.iterator(byteArray0, range0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // range [ -1 .. -1 ]/0B is out of range of sequence which is only [ 0 .. -1 ]/0B
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.5350251619107556
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Nucleotide nucleotide0 = Nucleotide.Weak;
      nucleotide0.getAllPossibleAmbiguities();
      byte[] byteArray0 = defaultNucleotideCodec0.encode(nucleotide0);
      defaultNucleotideCodec0.isGap(byteArray0, 8);
      defaultNucleotideCodec0.getUngappedLength(byteArray0);
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec1.iterator(byteArray0);
      defaultNucleotideCodec0.iterator(byteArray0);
      DefaultNucleotideCodec defaultNucleotideCodec2 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec2.getUngappedLength(byteArray0);
      DefaultNucleotideCodec defaultNucleotideCodec3 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec3.iterator(byteArray0);
      DefaultNucleotideCodec defaultNucleotideCodec4 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec4.toString(byteArray0);
      byte[] byteArray1 = new byte[6];
      byteArray1[0] = (byte)71;
      byteArray1[1] = (byte)11;
      byteArray1[2] = (byte)95;
      byteArray1[3] = (byte)7;
      byteArray1[4] = (byte) (-75);
      byteArray1[5] = (byte)71;
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.getGappedOffsetFor(byteArray1, (-479));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.707269709784813
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Nucleotide nucleotide0 = Nucleotide.Weak;
      Set<Nucleotide> set0 = nucleotide0.getAllPossibleAmbiguities();
      byte[] byteArray0 = defaultNucleotideCodec0.encode((Collection<Nucleotide>) set0);
      defaultNucleotideCodec0.isGap(byteArray0, 4);
      defaultNucleotideCodec0.getUngappedLength(byteArray0);
      defaultNucleotideCodec0.iterator(byteArray0);
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      Range range0 = Range.ofLength(0L);
      defaultNucleotideCodec1.iterator(byteArray0, range0);
      defaultNucleotideCodec1.iterator(byteArray0, range0);
      DefaultNucleotideCodec defaultNucleotideCodec2 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec2.isGap(byteArray0, (byte)116);
      // Undeclared exception!
      try { 
        DefaultNucleotideCodec.valueOf("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.
         //
         verifyException("java.lang.Enum", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.698011019844113
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Nucleotide nucleotide0 = Nucleotide.Weak;
      nucleotide0.getAllPossibleAmbiguities();
      byte[] byteArray0 = defaultNucleotideCodec0.encode(nucleotide0);
      long long0 = defaultNucleotideCodec0.getUngappedLength(byteArray0);
      assertEquals(1L, long0);
      
      defaultNucleotideCodec0.iterator(byteArray0);
      defaultNucleotideCodec0.iterator(byteArray0);
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      DefaultNucleotideCodec defaultNucleotideCodec2 = DefaultNucleotideCodec.INSTANCE;
      Nucleotide nucleotide1 = defaultNucleotideCodec2.decode(byteArray0, 1L);
      assertEquals(Nucleotide.Gap, nucleotide1);
      
      String string0 = defaultNucleotideCodec1.toString(byteArray0);
      assertEquals("W", string0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.70805020110221
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Nucleotide nucleotide0 = Nucleotide.Weak;
      Set<Nucleotide> set0 = nucleotide0.getAllPossibleAmbiguities();
      byte[] byteArray0 = defaultNucleotideCodec0.encode((Collection<Nucleotide>) set0);
      defaultNucleotideCodec0.isGap(byteArray0, 8);
      Iterator<Nucleotide> iterator0 = defaultNucleotideCodec0.iterator(byteArray0);
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.encode(11, iterator0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no more elements
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.5475313664679278
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Nucleotide nucleotide0 = Nucleotide.Cytosine;
      nucleotide0.getAllPossibleAmbiguities();
      Nucleotide nucleotide1 = Nucleotide.Gap;
      byte[] byteArray0 = defaultNucleotideCodec0.encode(nucleotide1);
      boolean boolean0 = defaultNucleotideCodec0.isGap(byteArray0, 8);
      assertFalse(boolean0);
      
      defaultNucleotideCodec0.getUngappedLength(byteArray0);
      long long0 = defaultNucleotideCodec0.getUngappedLength(byteArray0);
      assertEquals(0L, long0);
      
      int int0 = defaultNucleotideCodec0.getGappedOffsetFor(byteArray0, (-46));
      assertEquals(1, int0);
      assertEquals(5, byteArray0.length);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.665394159983386
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Nucleotide nucleotide0 = Nucleotide.Weak;
      nucleotide0.getAllPossibleAmbiguities();
      Nucleotide nucleotide1 = Nucleotide.Amino;
      nucleotide1.getAllPossibleAmbiguities();
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = defaultNucleotideCodec1.encode(nucleotide1);
      defaultNucleotideCodec0.toString(byteArray0);
      Nucleotide nucleotide2 = Nucleotide.Gap;
      byte[] byteArray1 = defaultNucleotideCodec0.encode(nucleotide2);
      defaultNucleotideCodec1.isGap(byteArray1, 1);
      DefaultNucleotideCodec defaultNucleotideCodec2 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec2.getNumberOfGaps(byteArray0);
      defaultNucleotideCodec1.getUngappedLength(byteArray0);
      defaultNucleotideCodec1.iterator(byteArray0);
      DefaultNucleotideCodec defaultNucleotideCodec3 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec3.getNumberOfGapsUntil(byteArray1, 8);
      byte[] byteArray2 = new byte[2];
      byteArray2[0] = (byte) (-70);
      byteArray2[1] = (byte)8;
      // Undeclared exception!
      try { 
        defaultNucleotideCodec2.isGap(byteArray2, (byte) (-70));
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=2.6505496920040796
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Nucleotide nucleotide0 = Nucleotide.Weak;
      nucleotide0.getAllPossibleAmbiguities();
      Nucleotide nucleotide1 = Nucleotide.Amino;
      nucleotide1.getAllPossibleAmbiguities();
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = defaultNucleotideCodec1.encode(nucleotide1);
      defaultNucleotideCodec0.toString(byteArray0);
      Nucleotide nucleotide2 = Nucleotide.Gap;
      byte[] byteArray1 = defaultNucleotideCodec0.encode(nucleotide2);
      defaultNucleotideCodec1.isGap(byteArray1, 1);
      DefaultNucleotideCodec defaultNucleotideCodec2 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec2.getNumberOfGaps(byteArray0);
      defaultNucleotideCodec1.getUngappedLength(byteArray0);
      defaultNucleotideCodec1.iterator(byteArray0);
      DefaultNucleotideCodec defaultNucleotideCodec3 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec3.getNumberOfGapsUntil(byteArray1, (-8));
      byte[] byteArray2 = new byte[6];
      byteArray2[0] = (byte) (-70);
      byteArray2[1] = (byte)30;
      defaultNucleotideCodec2.isGap(byteArray2, (byte) (-70));
      defaultNucleotideCodec2.isGap(byteArray2, (byte)30);
      DefaultNucleotideCodec.values();
      // Undeclared exception!
      try { 
        DefaultNucleotideCodec.valueOf("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.
         //
         verifyException("java.lang.Enum", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=2.8867753454601965
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Nucleotide nucleotide0 = Nucleotide.Unknown;
      nucleotide0.getAllPossibleAmbiguities();
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      Set<Nucleotide> set0 = nucleotide0.getBasesFor();
      byte[] byteArray0 = defaultNucleotideCodec1.encode((Collection<Nucleotide>) set0);
      DefaultNucleotideCodec defaultNucleotideCodec2 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec2.isGap(byteArray0, 8);
      defaultNucleotideCodec0.getUngappedLength(byteArray0);
      defaultNucleotideCodec0.iterator(byteArray0);
      defaultNucleotideCodec1.getGapOffsets(byteArray0);
      DefaultNucleotideCodec defaultNucleotideCodec3 = DefaultNucleotideCodec.INSTANCE;
      Nucleotide nucleotide1 = Nucleotide.NotGuanine;
      byte[] byteArray1 = defaultNucleotideCodec3.encode(nucleotide1);
      int int0 = defaultNucleotideCodec0.getNumberOfGapsUntil(byteArray0, 1908874353);
      defaultNucleotideCodec1.iterator(byteArray0);
      DefaultNucleotideCodec defaultNucleotideCodec4 = DefaultNucleotideCodec.INSTANCE;
      long long0 = defaultNucleotideCodec4.getUngappedLength(byteArray1);
      assertEquals(1L, long0);
      
      DefaultNucleotideCodec defaultNucleotideCodec5 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec5.iterator(byteArray1);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)1, (byte) (-112)}, byteArray1);
      
      String string0 = defaultNucleotideCodec4.toString(byteArray0);
      assertEquals("ACGT", string0);
      
      int int1 = defaultNucleotideCodec5.getGappedOffsetFor(byteArray0, 0);
      assertEquals(6, byteArray0.length);
      assertTrue(int1 == int0);
      assertEquals(0, int1);
  }
}
