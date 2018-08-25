/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 17:44:56 GMT 2018
 */

package org.jcvi.jillion.core.residue.nt;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
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
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Nucleotide nucleotide0 = Nucleotide.Gap;
      Set<Nucleotide> set0 = nucleotide0.getBasesFor();
      defaultNucleotideCodec0.encode((Collection<Nucleotide>) set0);
      int int0 = (-2978);
      LinkedList<Nucleotide> linkedList0 = new LinkedList<Nucleotide>();
      Nucleotide nucleotide1 = Nucleotide.Keto;
      linkedList0.add(nucleotide1);
      ListIterator<Nucleotide> listIterator0 = linkedList0.listIterator();
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.encode((-2978), (Iterator<Nucleotide>) listIterator0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.ByteBuffer", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.8989267893363289
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)15;
      byte byte0 = (byte)27;
      byteArray0[1] = (byte)27;
      byte byte1 = (byte)0;
      byteArray0[2] = (byte)0;
      byte byte2 = (byte) (-14);
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
  //Test case number: 2
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)10;
      byteArray0[1] = (byte)69;
      defaultNucleotideCodec0.decodedLengthOf(byteArray0);
      byteArray0[2] = (byte)23;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)67;
      byteArray0[5] = (byte)27;
      Range range0 = Range.of(1L, 1L);
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.ZERO_BASED;
      range0.getBegin(range_CoordinateSystem0);
      range0.split(172294144);
      defaultNucleotideCodec0.iterator(byteArray0, range0);
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.getUngappedLength(byteArray0);
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
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-117);
      byteArray0[1] = (byte)23;
      Nucleotide nucleotide0 = Nucleotide.Unknown;
      defaultNucleotideCodec0.encode(nucleotide0);
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)55;
      byteArray0[5] = (byte)48;
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte)0;
      defaultNucleotideCodec0.getGapOffsets(byteArray0);
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.toString(byteArray0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DefaultNucleotideCodec.values();
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      LinkedList<Nucleotide> linkedList0 = new LinkedList<Nucleotide>();
      ListIterator<Nucleotide> listIterator0 = linkedList0.listIterator();
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.encode(7, (Iterator<Nucleotide>) listIterator0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.LinkedList$ListItr", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.valueOf("INSTANCE");
      byte[] byteArray0 = new byte[3];
      byte byte0 = (byte)0;
      LinkedList<Nucleotide> linkedList0 = new LinkedList<Nucleotide>();
      defaultNucleotideCodec0.encode((Collection<Nucleotide>) linkedList0);
      byteArray0[0] = (byte)0;
      byte byte1 = (byte)0;
      long long0 = (-32768L);
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.decode(byteArray0, 925L);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // index 925 corresponds to encodedIndex 466  encodedglyph length is 3
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte) (-75);
      byteArray0[1] = (byte)11;
      byteArray0[2] = (byte) (-46);
      byteArray0[3] = (byte)0;
      byte byte0 = (byte)0;
      LinkedList<Nucleotide> linkedList0 = new LinkedList<Nucleotide>();
      linkedList0.listIterator();
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      int int0 = 10;
      Iterator<Nucleotide> iterator0 = defaultNucleotideCodec0.iterator(byteArray0);
      // Undeclared exception!
      try { 
        defaultNucleotideCodec1.encode(10, iterator0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no more elements
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      LinkedList<Nucleotide> linkedList0 = new LinkedList<Nucleotide>();
      Nucleotide nucleotide0 = Nucleotide.Keto;
      Set<Nucleotide> set0 = nucleotide0.getBasesFor();
      byte[] byteArray0 = defaultNucleotideCodec0.encode((Collection<Nucleotide>) set0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)2, (byte)46}, byteArray0);
      
      byte[] byteArray1 = new byte[4];
      byteArray1[0] = (byte) (-107);
      byteArray1[1] = (byte) (-44);
      byteArray1[2] = (byte)0;
      byteArray1[3] = (byte)101;
      boolean boolean0 = defaultNucleotideCodec0.isGap(byteArray1, 223);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.4005631264087506
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)42;
      Nucleotide nucleotide0 = Nucleotide.Weak;
      byte[] byteArray1 = defaultNucleotideCodec0.encode(nucleotide0);
      byteArray0[2] = (byte) (-23);
      defaultNucleotideCodec0.getNumberOfGaps(byteArray1);
      byte byte0 = (byte)0;
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.getUngappedOffsetFor(byteArray0, 1073741824);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[8];
      defaultNucleotideCodec0.isGap(byteArray0, 1721);
      byteArray0[0] = (byte)0;
      defaultNucleotideCodec0.getNumberOfGaps(byteArray0);
      defaultNucleotideCodec0.getNumberOfGaps(byteArray0);
      defaultNucleotideCodec0.getUngappedOffsetFor(byteArray0, (byte)0);
      defaultNucleotideCodec0.getGapOffsets(byteArray0);
      // Undeclared exception!
      try { 
        DefaultNucleotideCodec.valueOf("GUXvR-Xdk-pn^,");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.GUXvR-Xdk-pn^,
         //
         verifyException("java.lang.Enum", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.1192809219098505
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DefaultNucleotideCodec.values();
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-23);
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte) (-23);
      byteArray0[5] = (byte) (-23);
      byteArray0[6] = (byte) (-65);
      byteArray0[7] = (byte) (-23);
      byteArray0[8] = (byte) (-23);
      // Undeclared exception!
      try { 
        defaultNucleotideCodec1.getUngappedOffsetFor(byteArray0, (byte) (-23));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.665394159983386
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-117);
      byteArray0[1] = (byte)23;
      Nucleotide nucleotide0 = Nucleotide.Unknown;
      byte[] byteArray1 = defaultNucleotideCodec0.encode(nucleotide0);
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)55;
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec1.getUngappedOffsetFor(byteArray0, 1717986918);
      DefaultNucleotideCodec defaultNucleotideCodec2 = DefaultNucleotideCodec.INSTANCE;
      int int0 = defaultNucleotideCodec2.getGappedOffsetFor(byteArray1, (byte)0);
      List<Integer> list0 = new LinkedList<Integer>();
      DefaultNucleotideCodec defaultNucleotideCodec3 = DefaultNucleotideCodec.INSTANCE;
      int int1 = defaultNucleotideCodec3.getNumberOfGaps(byteArray1);
      assertTrue(int1 == int0);
      
      DefaultNucleotideCodec defaultNucleotideCodec4 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec4.getGapOffsets(byteArray1);
      DefaultNucleotideCodec defaultNucleotideCodec5 = DefaultNucleotideCodec.INSTANCE;
      int int2 = defaultNucleotideCodec5.getUngappedOffsetFor(byteArray0, 466);
      assertEquals(466, int2);
      
      DefaultNucleotideCodec defaultNucleotideCodec6 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec6.iterator(byteArray1);
      Nucleotide nucleotide1 = Nucleotide.Strong;
      DefaultNucleotideCodec defaultNucleotideCodec7 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray2 = defaultNucleotideCodec7.encode(nucleotide1);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)1, (byte) (-80)}, byteArray2);
      
      defaultNucleotideCodec2.getGapOffsets(byteArray0);
      DefaultNucleotideCodec defaultNucleotideCodec8 = DefaultNucleotideCodec.INSTANCE;
      long long0 = defaultNucleotideCodec8.getUngappedLength(byteArray0);
      assertEquals((-1961426944L), long0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=3.0146356756514834
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Nucleotide nucleotide0 = Nucleotide.Gap;
      Set<Nucleotide> set0 = nucleotide0.getBasesFor();
      byte[] byteArray0 = defaultNucleotideCodec0.encode((Collection<Nucleotide>) set0);
      LinkedList<Nucleotide> linkedList0 = new LinkedList<Nucleotide>();
      linkedList0.containsAll(set0);
      Nucleotide nucleotide1 = Nucleotide.Keto;
      linkedList0.add(nucleotide1);
      defaultNucleotideCodec0.toString(byteArray0);
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec1.getNumberOfGaps(byteArray0);
      Nucleotide nucleotide2 = Nucleotide.Strong;
      defaultNucleotideCodec1.getNumberOfGapsUntil(byteArray0, 5);
      defaultNucleotideCodec1.toString(byteArray0);
      defaultNucleotideCodec1.encode(nucleotide2);
      DefaultNucleotideCodec defaultNucleotideCodec2 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec2.iterator(byteArray0);
      Nucleotide nucleotide3 = Nucleotide.Strong;
      byte[] byteArray1 = defaultNucleotideCodec1.encode(nucleotide3);
      DefaultNucleotideCodec defaultNucleotideCodec3 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec3.isGap(byteArray1, (-2142));
      defaultNucleotideCodec3.getGappedOffsetFor(byteArray0, 4);
      DefaultNucleotideCodec defaultNucleotideCodec4 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec4.getNumberOfGapsUntil(byteArray0, 1073741824);
      DefaultNucleotideCodec defaultNucleotideCodec5 = DefaultNucleotideCodec.INSTANCE;
      // Undeclared exception!
      try { 
        defaultNucleotideCodec5.decode(byteArray0, (-3329L));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // index can not be negative: -3329
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.72840754003429
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[5];
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      LinkedList<Nucleotide> linkedList0 = new LinkedList<Nucleotide>();
      byte[] byteArray1 = defaultNucleotideCodec1.encode((Collection<Nucleotide>) linkedList0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray1);
      
      LinkedList<Nucleotide> linkedList1 = new LinkedList<Nucleotide>();
      linkedList1.clear();
      Nucleotide nucleotide0 = Nucleotide.Gap;
      LinkedList<Nucleotide> linkedList2 = new LinkedList<Nucleotide>();
      linkedList2.add(nucleotide0);
      Nucleotide nucleotide1 = Nucleotide.Purine;
      byte[] byteArray2 = defaultNucleotideCodec0.encode(nucleotide1);
      List<Integer> list0 = defaultNucleotideCodec1.getGapOffsets(byteArray2);
      assertEquals(0, list0.size());
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)1, (byte) (-64)}, byteArray2);
      
      String string0 = defaultNucleotideCodec1.toString(byteArray0);
      assertEquals("", string0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Nucleotide nucleotide0 = Nucleotide.Strong;
      byte[] byteArray0 = defaultNucleotideCodec0.encode(nucleotide0);
      Range range0 = Range.of(124L);
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.RESIDUE_BASED;
      range0.toString(range_CoordinateSystem0);
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.iterator(byteArray0, range0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // range [ 124 .. 124 ]/0B is out of range of sequence which is only [ 0 .. 0 ]/0B
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.7774745973465635
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Nucleotide nucleotide0 = Nucleotide.NotThymine;
      Set<Nucleotide> set0 = nucleotide0.getBasesFor();
      byte[] byteArray0 = defaultNucleotideCodec0.encode((Collection<Nucleotide>) set0);
      LinkedList<Nucleotide> linkedList0 = new LinkedList<Nucleotide>();
      linkedList0.containsAll(set0);
      Nucleotide nucleotide1 = Nucleotide.Keto;
      linkedList0.add(nucleotide1);
      defaultNucleotideCodec0.toString(byteArray0);
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec1.getNumberOfGaps(byteArray0);
      Nucleotide nucleotide2 = Nucleotide.Strong;
      defaultNucleotideCodec1.getNumberOfGapsUntil(byteArray0, 5);
      defaultNucleotideCodec1.toString(byteArray0);
      defaultNucleotideCodec1.encode(nucleotide2);
      DefaultNucleotideCodec defaultNucleotideCodec2 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec2.iterator(byteArray0);
      Nucleotide nucleotide3 = Nucleotide.Strong;
      defaultNucleotideCodec1.encode(nucleotide3);
      // Undeclared exception!
      try { 
        DefaultNucleotideCodec.valueOf("ACG");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.ACG
         //
         verifyException("java.lang.Enum", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.7255503958317204
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte) (-117);
      byteArray0[1] = (byte)23;
      Nucleotide nucleotide0 = Nucleotide.Unknown;
      byte[] byteArray1 = defaultNucleotideCodec0.encode(nucleotide0);
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)55;
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec1.getUngappedOffsetFor(byteArray0, 1717986918);
      DefaultNucleotideCodec defaultNucleotideCodec2 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec2.getGappedOffsetFor(byteArray1, (byte)0);
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      DefaultNucleotideCodec defaultNucleotideCodec3 = DefaultNucleotideCodec.INSTANCE;
      int int0 = new Integer((byte)55);
      DefaultNucleotideCodec defaultNucleotideCodec4 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec4.decode(byteArray0, 0L);
      DefaultNucleotideCodec defaultNucleotideCodec5 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec5.decodedLengthOf(byteArray0);
      // Undeclared exception!
      try { 
        DefaultNucleotideCodec.valueOf("vp");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.vp
         //
         verifyException("java.lang.Enum", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.6646191951934917
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      LinkedList<Nucleotide> linkedList0 = new LinkedList<Nucleotide>();
      linkedList0.clear();
      Nucleotide nucleotide0 = Nucleotide.Purine;
      byte[] byteArray0 = defaultNucleotideCodec0.encode(nucleotide0);
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec1.isGap(byteArray0, (-2722));
      DefaultNucleotideCodec defaultNucleotideCodec2 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec2.getGappedOffsetFor(byteArray0, (-2722));
      defaultNucleotideCodec2.getNumberOfGapsUntil(byteArray0, 4);
      // Undeclared exception!
      try { 
        defaultNucleotideCodec2.decode(byteArray0, (-2722));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // index can not be negative: -2722
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.7985132569432936
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-117);
      byteArray0[1] = (byte)23;
      Nucleotide nucleotide0 = Nucleotide.Unknown;
      byte[] byteArray1 = defaultNucleotideCodec0.encode(nucleotide0);
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)55;
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec1.getUngappedOffsetFor(byteArray0, 1717986918);
      DefaultNucleotideCodec defaultNucleotideCodec2 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec2.getGappedOffsetFor(byteArray1, (byte)0);
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      DefaultNucleotideCodec defaultNucleotideCodec3 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec3.getNumberOfGaps(byteArray1);
      DefaultNucleotideCodec defaultNucleotideCodec4 = DefaultNucleotideCodec.INSTANCE;
      Range range0 = Range.of((-1L));
      // Undeclared exception!
      try { 
        defaultNucleotideCodec4.iterator(byteArray0, range0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must be >=0
         //
         verifyException("org.jcvi.jillion.core.Range$Builder", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.972845711672121
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Nucleotide nucleotide0 = Nucleotide.Gap;
      Set<Nucleotide> set0 = nucleotide0.getBasesFor();
      byte[] byteArray0 = defaultNucleotideCodec0.encode((Collection<Nucleotide>) set0);
      LinkedList<Nucleotide> linkedList0 = new LinkedList<Nucleotide>();
      linkedList0.containsAll(set0);
      Nucleotide nucleotide1 = Nucleotide.Keto;
      linkedList0.add(nucleotide1);
      defaultNucleotideCodec0.toString(byteArray0);
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec1.getNumberOfGaps(byteArray0);
      Nucleotide nucleotide2 = Nucleotide.Strong;
      defaultNucleotideCodec1.getNumberOfGapsUntil(byteArray0, 5);
      defaultNucleotideCodec1.toString(byteArray0);
      defaultNucleotideCodec1.encode(nucleotide2);
      DefaultNucleotideCodec defaultNucleotideCodec2 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec2.iterator(byteArray0);
      Nucleotide nucleotide3 = Nucleotide.Strong;
      byte[] byteArray1 = defaultNucleotideCodec1.encode(nucleotide3);
      DefaultNucleotideCodec defaultNucleotideCodec3 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec3.isGap(byteArray1, (-2142));
      defaultNucleotideCodec3.getGappedOffsetFor(byteArray0, (-2142));
      DefaultNucleotideCodec defaultNucleotideCodec4 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec4.getNumberOfGapsUntil(byteArray0, 1073741824);
      DefaultNucleotideCodec defaultNucleotideCodec5 = DefaultNucleotideCodec.INSTANCE;
      // Undeclared exception!
      try { 
        defaultNucleotideCodec5.decode(byteArray0, (-3329L));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // index can not be negative: -3329
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=2.4799555205445176
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte) (-117);
      byteArray0[1] = (byte)23;
      Nucleotide nucleotide0 = Nucleotide.Unknown;
      byte[] byteArray1 = defaultNucleotideCodec0.encode(nucleotide0);
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)0;
      Range range0 = Range.ofLength((byte)0);
      range0.split(2515L);
      defaultNucleotideCodec0.iterator(byteArray1, range0);
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray2 = new byte[6];
      byteArray2[0] = (byte)0;
      byteArray2[1] = (byte)23;
      byteArray2[2] = (byte) (-117);
      byteArray2[3] = (byte)7;
      byteArray2[4] = (byte)23;
      byteArray2[5] = (byte)0;
      // Undeclared exception!
      try { 
        defaultNucleotideCodec1.getGappedOffsetFor(byteArray2, (byte) (-117));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=2.9307406810122405
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Nucleotide nucleotide0 = Nucleotide.Gap;
      Set<Nucleotide> set0 = nucleotide0.getBasesFor();
      byte[] byteArray0 = defaultNucleotideCodec0.encode((Collection<Nucleotide>) set0);
      LinkedList<Nucleotide> linkedList0 = new LinkedList<Nucleotide>();
      linkedList0.containsAll(set0);
      Nucleotide nucleotide1 = Nucleotide.Keto;
      linkedList0.add(nucleotide1);
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec1.isGap(byteArray0, (-835));
      DefaultNucleotideCodec defaultNucleotideCodec2 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec2.getUngappedOffsetFor(byteArray0, 239);
      defaultNucleotideCodec2.getGappedOffsetFor(byteArray0, 1542919);
      DefaultNucleotideCodec defaultNucleotideCodec3 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec3.getNumberOfGapsUntil(byteArray0, (-835));
      DefaultNucleotideCodec defaultNucleotideCodec4 = DefaultNucleotideCodec.INSTANCE;
      // Undeclared exception!
      try { 
        defaultNucleotideCodec4.decode(byteArray0, 1542919);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // index 1542919 corresponds to encodedIndex 771463  encodedglyph length is 5
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec", e);
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=2.6941537039844596
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte) (-117);
      byteArray0[1] = (byte)23;
      Nucleotide nucleotide0 = Nucleotide.Unknown;
      byte[] byteArray1 = defaultNucleotideCodec0.encode(nucleotide0);
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)0;
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec1.getUngappedOffsetFor(byteArray0, (-1282));
      DefaultNucleotideCodec defaultNucleotideCodec2 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec2.getGappedOffsetFor(byteArray1, (byte) (-117));
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      DefaultNucleotideCodec defaultNucleotideCodec3 = DefaultNucleotideCodec.INSTANCE;
      Integer integer0 = new Integer((byte)0);
      defaultNucleotideCodec2.decode(byteArray1, 1);
      DefaultNucleotideCodec defaultNucleotideCodec4 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec4.decodedLengthOf(byteArray1);
      // Undeclared exception!
      try { 
        DefaultNucleotideCodec.valueOf("rsHiH*U\u0004");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.rsHiH*U\u0004
         //
         verifyException("java.lang.Enum", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=2.7912945696950127
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Nucleotide nucleotide0 = Nucleotide.NotThymine;
      Set<Nucleotide> set0 = nucleotide0.getBasesFor();
      byte[] byteArray0 = defaultNucleotideCodec0.encode((Collection<Nucleotide>) set0);
      LinkedList<Nucleotide> linkedList0 = new LinkedList<Nucleotide>();
      LinkedList<Nucleotide> linkedList1 = new LinkedList<Nucleotide>();
      linkedList1.containsAll(set0);
      Nucleotide nucleotide1 = Nucleotide.Unknown;
      linkedList0.add(nucleotide1);
      String string0 = defaultNucleotideCodec0.toString(byteArray0);
      assertEquals("ACG", string0);
      
      linkedList0.add(nucleotide0);
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      int int0 = defaultNucleotideCodec1.getNumberOfGaps(byteArray0);
      int int1 = defaultNucleotideCodec1.getNumberOfGapsUntil(byteArray0, 1124090777);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)3, (byte)29, (byte)32}, byteArray0);
      assertTrue(int1 == int0);
      
      Nucleotide nucleotide2 = Nucleotide.Unknown;
      nucleotide2.getAllPossibleAmbiguities();
      byte[] byteArray1 = defaultNucleotideCodec0.encode((Collection<Nucleotide>) linkedList0);
      defaultNucleotideCodec1.isGap(byteArray1, 134503424);
      String string1 = defaultNucleotideCodec1.toString(byteArray1);
      assertEquals("NV", string1);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=2.728352370092261
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Nucleotide nucleotide0 = Nucleotide.Gap;
      Set<Nucleotide> set0 = nucleotide0.getBasesFor();
      byte[] byteArray0 = defaultNucleotideCodec0.encode((Collection<Nucleotide>) set0);
      LinkedList<Nucleotide> linkedList0 = new LinkedList<Nucleotide>();
      linkedList0.pollLast();
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray1 = defaultNucleotideCodec1.encode((Collection<Nucleotide>) linkedList0);
      defaultNucleotideCodec1.toString(byteArray1);
      defaultNucleotideCodec1.isGap(byteArray0, 0);
      DefaultNucleotideCodec defaultNucleotideCodec2 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec2.isGap(byteArray0, (-1872));
      DefaultNucleotideCodec[] defaultNucleotideCodecArray0 = DefaultNucleotideCodec.values();
      assertEquals(1, defaultNucleotideCodecArray0.length);
  }
}
