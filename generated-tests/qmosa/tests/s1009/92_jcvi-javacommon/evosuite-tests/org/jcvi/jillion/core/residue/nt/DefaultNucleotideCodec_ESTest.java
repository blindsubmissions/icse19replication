/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 12:06:38 GMT 2018
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
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DefaultNucleotideCodec.values();
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      int int0 = (-409);
      LinkedList<Nucleotide> linkedList0 = new LinkedList<Nucleotide>();
      Nucleotide nucleotide0 = Nucleotide.Amino;
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-52);
      byteArray0[1] = (byte)52;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte) (-62);
      defaultNucleotideCodec0.getUngappedLength(byteArray0);
      linkedList0.add(nucleotide0);
      Nucleotide nucleotide1 = Nucleotide.Keto;
      linkedList0.add(0, nucleotide1);
      // Undeclared exception!
      try { 
        linkedList0.listIterator(1322);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1322, Size: 2
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)76;
      byteArray0[1] = (byte) (-47);
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte) (-89);
      byteArray0[4] = (byte)10;
      byteArray0[5] = (byte) (-74);
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte)0;
      int int0 = defaultNucleotideCodec0.getGappedOffsetFor(byteArray0, 1441);
      assertEquals(0, int0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)82;
      byteArray0[1] = (byte) (-1);
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)68;
      byteArray0[4] = (byte) (-29);
      byteArray0[5] = (byte)5;
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
  //Test case number: 3
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-91);
      defaultNucleotideCodec0.getNumberOfGaps(byteArray0);
      byteArray0[1] = (byte)8;
      defaultNucleotideCodec0.getNumberOfGapsUntil(byteArray0, (byte)8);
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
  /*Coverage entropy=2.8443053266982616
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[4];
      byte byte0 = (byte)0;
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)75;
      byte byte1 = (byte)0;
      LinkedList<Nucleotide> linkedList0 = new LinkedList<Nucleotide>();
      Nucleotide nucleotide0 = Nucleotide.NotCytosine;
      linkedList0.add(nucleotide0);
      byte[] byteArray1 = defaultNucleotideCodec0.encode((Collection<Nucleotide>) linkedList0);
      Nucleotide nucleotide1 = Nucleotide.Pyrimidine;
      linkedList0.add(nucleotide1);
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec1.getUngappedOffsetFor(byteArray1, (byte)75);
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.decode(byteArray1, (-2416L));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // index can not be negative: -2416
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[8];
      byte byte0 = (byte) (-92);
      byteArray0[0] = (byte) (-92);
      byteArray0[1] = (byte)9;
      byte byte1 = (byte)0;
      byteArray0[2] = (byte)0;
      byte byte2 = (byte) (-1);
      byteArray0[3] = (byte) (-1);
      byte byte3 = (byte)21;
      byteArray0[4] = (byte)21;
      byteArray0[5] = (byte) (-87);
      byte byte4 = (byte)81;
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      Iterator<Nucleotide> iterator0 = defaultNucleotideCodec1.iterator(byteArray0);
      defaultNucleotideCodec1.getNumberOfGapsUntil(byteArray0, (byte) (-87));
      // Undeclared exception!
      try { 
        defaultNucleotideCodec1.encode((int) (byte)9, iterator0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no more elements
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.7655866155925652
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[5];
      defaultNucleotideCodec0.iterator(byteArray0);
      byteArray0[0] = (byte)16;
      byteArray0[1] = (byte)0;
      LinkedList<Nucleotide> linkedList0 = new LinkedList<Nucleotide>();
      Nucleotide nucleotide0 = Nucleotide.Pyrimidine;
      linkedList0.add(nucleotide0);
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      LinkedList<Nucleotide> linkedList1 = new LinkedList<Nucleotide>();
      DefaultNucleotideCodec defaultNucleotideCodec2 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray1 = defaultNucleotideCodec2.encode((Collection<Nucleotide>) linkedList1);
      LinkedList<Nucleotide> linkedList2 = new LinkedList<Nucleotide>();
      Nucleotide nucleotide1 = Nucleotide.Thymine;
      linkedList0.add(nucleotide1);
      defaultNucleotideCodec0.getUngappedOffsetFor(byteArray1, 5);
      defaultNucleotideCodec2.decode(byteArray0, (byte)0);
      defaultNucleotideCodec0.getNumberOfGaps(byteArray1);
      byte[] byteArray2 = new byte[7];
      byteArray2[0] = (byte)16;
      byteArray2[1] = (byte)43;
      byteArray2[2] = (byte)0;
      byteArray2[3] = (byte) (-82);
      byteArray2[4] = (byte)0;
      byteArray2[5] = (byte)16;
      byteArray2[6] = (byte)0;
      // Undeclared exception!
      try { 
        defaultNucleotideCodec1.getGapOffsets(byteArray2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)76;
      byteArray0[0] = (byte) (-47);
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte) (-89);
      byteArray0[4] = (byte)10;
      byteArray0[5] = (byte) (-74);
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte)0;
      int int0 = defaultNucleotideCodec0.getGappedOffsetFor(byteArray0, 1441);
      assertEquals(0, int0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.9264175554979963
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[4];
      byte byte0 = (byte)0;
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)75;
      LinkedList<Nucleotide> linkedList0 = new LinkedList<Nucleotide>();
      Nucleotide nucleotide0 = Nucleotide.NotCytosine;
      linkedList0.add(nucleotide0);
      byte[] byteArray1 = defaultNucleotideCodec0.encode((Collection<Nucleotide>) linkedList0);
      Nucleotide nucleotide1 = Nucleotide.Pyrimidine;
      linkedList0.add(nucleotide1);
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec1.getUngappedOffsetFor(byteArray1, (byte)75);
      DefaultNucleotideCodec defaultNucleotideCodec2 = DefaultNucleotideCodec.INSTANCE;
      int int0 = 470;
      DefaultNucleotideCodec defaultNucleotideCodec3 = DefaultNucleotideCodec.INSTANCE;
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.ZERO_BASED;
      Range range0 = Range.of(range_CoordinateSystem0, (-1L), (long) (byte)0);
      // Undeclared exception!
      try { 
        defaultNucleotideCodec3.iterator(byteArray1, range0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // range [ -1 .. 0 ]/0B is out of range of sequence which is only [ 0 .. 0 ]/0B
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.8979325974734658
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[4];
      byte byte0 = (byte)0;
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec1.isGap(byteArray0, (byte)0);
      Nucleotide nucleotide0 = Nucleotide.Purine;
      nucleotide0.getAllPossibleAmbiguities();
      Set<Nucleotide> set0 = nucleotide0.getAllPossibleAmbiguities();
      defaultNucleotideCodec0.getGapOffsets(byteArray0);
      defaultNucleotideCodec1.toString(byteArray0);
      nucleotide0.getBasesFor();
      LinkedList<Nucleotide> linkedList0 = new LinkedList<Nucleotide>(set0);
      DefaultNucleotideCodec defaultNucleotideCodec2 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec2.encode((Collection<Nucleotide>) set0);
      defaultNucleotideCodec1.iterator(byteArray0);
      Nucleotide nucleotide1 = Nucleotide.Unknown;
      linkedList0.add(nucleotide1);
      Nucleotide nucleotide2 = Nucleotide.NotCytosine;
      byte[] byteArray1 = defaultNucleotideCodec0.encode(nucleotide2);
      defaultNucleotideCodec0.getUngappedOffsetFor(byteArray1, 32);
      DefaultNucleotideCodec defaultNucleotideCodec3 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec3.getNumberOfGapsUntil(byteArray0, (byte)0);
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
  /*Coverage entropy=1.8989267893363289
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)76;
      byteArray0[1] = (byte) (-47);
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte) (-89);
      byteArray0[4] = (byte) (-47);
      byteArray0[6] = (byte) (-21);
      byteArray0[7] = (byte)0;
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.getGappedOffsetFor(byteArray0, (byte) (-89));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.8114194983013414
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      LinkedList<Nucleotide> linkedList0 = new LinkedList<Nucleotide>();
      Nucleotide nucleotide0 = Nucleotide.Strong;
      linkedList0.add(nucleotide0);
      byte[] byteArray0 = defaultNucleotideCodec0.encode((Collection<Nucleotide>) linkedList0);
      defaultNucleotideCodec0.getUngappedOffsetFor(byteArray0, (-3356));
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec1.getNumberOfGaps(byteArray0);
      List<Integer> list0 = new LinkedList<Integer>();
      DefaultNucleotideCodec defaultNucleotideCodec2 = DefaultNucleotideCodec.INSTANCE;
      Nucleotide nucleotide1 = Nucleotide.Gap;
      byte[] byteArray1 = defaultNucleotideCodec2.encode(nucleotide1);
      int int0 = new Integer(1939);
      DefaultNucleotideCodec defaultNucleotideCodec3 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec3.getNumberOfGapsUntil(byteArray1, 1939);
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
  //Test case number: 12
  /*Coverage entropy=2.772588722239781
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[5];
      defaultNucleotideCodec0.iterator(byteArray0);
      LinkedList<Nucleotide> linkedList0 = new LinkedList<Nucleotide>();
      Nucleotide nucleotide0 = Nucleotide.Unknown;
      linkedList0.add(nucleotide0);
      defaultNucleotideCodec0.encode((Collection<Nucleotide>) linkedList0);
      linkedList0.add(nucleotide0);
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec1.getUngappedOffsetFor(byteArray0, 75);
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.RESIDUE_BASED;
      Range range0 = Range.of(range_CoordinateSystem0, (long) 75, (long) 75);
      DefaultNucleotideCodec defaultNucleotideCodec2 = DefaultNucleotideCodec.INSTANCE;
      // Undeclared exception!
      try { 
        defaultNucleotideCodec2.iterator(byteArray0, range0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // range [ 74 .. 74 ]/0B is out of range of sequence which is only [ 0 .. -1 ]/0B
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.880058105880462
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      LinkedList<Nucleotide> linkedList0 = new LinkedList<Nucleotide>();
      Nucleotide nucleotide0 = Nucleotide.Strong;
      linkedList0.add(nucleotide0);
      byte[] byteArray0 = defaultNucleotideCodec0.encode((Collection<Nucleotide>) linkedList0);
      int int0 = defaultNucleotideCodec0.getUngappedOffsetFor(byteArray0, (-3356));
      assertEquals((-3356), int0);
      
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      int int1 = defaultNucleotideCodec1.getNumberOfGaps(byteArray0);
      assertEquals(0, int1);
      
      Byte byte0 = new Byte((byte)66);
      DefaultNucleotideCodec defaultNucleotideCodec2 = DefaultNucleotideCodec.INSTANCE;
      DefaultNucleotideCodec defaultNucleotideCodec3 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec3.isGap(byteArray0, (-1839));
      defaultNucleotideCodec2.isGap(byteArray0, (-2850));
      DefaultNucleotideCodec defaultNucleotideCodec4 = DefaultNucleotideCodec.INSTANCE;
      String string0 = defaultNucleotideCodec4.toString(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)1, (byte) (-80)}, byteArray0);
      assertEquals("S", string0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.2718685126965625
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      LinkedList<Nucleotide> linkedList0 = new LinkedList<Nucleotide>();
      Nucleotide nucleotide0 = Nucleotide.Strong;
      linkedList0.add(nucleotide0);
      LinkedList<Nucleotide> linkedList1 = new LinkedList<Nucleotide>();
      Nucleotide nucleotide1 = Nucleotide.Keto;
      linkedList0.add(nucleotide1);
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = defaultNucleotideCodec1.encode((Collection<Nucleotide>) linkedList0);
      LinkedList<Nucleotide> linkedList2 = new LinkedList<Nucleotide>();
      Nucleotide nucleotide2 = Nucleotide.Unknown;
      linkedList2.add(nucleotide2);
      // Undeclared exception!
      try { 
        defaultNucleotideCodec1.decode(byteArray0, (-3356));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // index can not be negative: -3356
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.8456384931342558
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      LinkedList<Nucleotide> linkedList0 = new LinkedList<Nucleotide>();
      defaultNucleotideCodec0.encode((Collection<Nucleotide>) linkedList0);
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      Nucleotide nucleotide0 = Nucleotide.Gap;
      byte[] byteArray0 = defaultNucleotideCodec1.encode(nucleotide0);
      defaultNucleotideCodec0.getNumberOfGapsUntil(byteArray0, (byte)16);
      defaultNucleotideCodec0.isGap(byteArray0, 0);
      DefaultNucleotideCodec defaultNucleotideCodec2 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray1 = new byte[6];
      byteArray1[0] = (byte)16;
      byteArray1[1] = (byte) (-117);
      byteArray1[2] = (byte)16;
      byteArray1[3] = (byte)16;
      byteArray1[4] = (byte)16;
      byteArray1[5] = (byte)16;
      // Undeclared exception!
      try { 
        defaultNucleotideCodec2.toString(byteArray1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=3.052520501533812
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[5];
      defaultNucleotideCodec0.iterator(byteArray0);
      byteArray0[0] = (byte)16;
      byteArray0[1] = (byte)0;
      LinkedList<Nucleotide> linkedList0 = new LinkedList<Nucleotide>();
      Nucleotide nucleotide0 = Nucleotide.Pyrimidine;
      linkedList0.add(nucleotide0);
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      Range range0 = Range.ofLength((byte)0);
      defaultNucleotideCodec0.iterator(byteArray0, range0);
      DefaultNucleotideCodec defaultNucleotideCodec2 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray1 = defaultNucleotideCodec2.encode((Collection<Nucleotide>) linkedList0);
      LinkedList<Nucleotide> linkedList1 = new LinkedList<Nucleotide>();
      Nucleotide nucleotide1 = Nucleotide.Thymine;
      linkedList0.add(nucleotide1);
      defaultNucleotideCodec0.getUngappedOffsetFor(byteArray1, (byte)16);
      defaultNucleotideCodec2.decode(byteArray0, (byte)0);
      Byte byte0 = new Byte((byte)16);
      byte[] byteArray2 = new byte[7];
      byteArray2[0] = (byte)16;
      byteArray2[1] = (byte)43;
      byteArray2[2] = (byte)0;
      byteArray0[1] = (byte) (-82);
      byteArray2[4] = (byte)0;
      byteArray2[5] = (byte)16;
      byteArray2[6] = (byte)0;
      // Undeclared exception!
      try { 
        defaultNucleotideCodec1.getGapOffsets(byteArray2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.72840754003429
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedList<Nucleotide> linkedList0 = new LinkedList<Nucleotide>();
      Nucleotide nucleotide0 = Nucleotide.Gap;
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = defaultNucleotideCodec0.encode(nucleotide0);
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec1.getNumberOfGapsUntil(byteArray0, 8);
      DefaultNucleotideCodec defaultNucleotideCodec2 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec2.isGap(byteArray0, 0);
      DefaultNucleotideCodec defaultNucleotideCodec3 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec3.getUngappedOffsetFor(byteArray0, 1);
      defaultNucleotideCodec2.decode(byteArray0, 1);
      Byte byte0 = new Byte((byte)32);
      Nucleotide nucleotide1 = Nucleotide.Strong;
      linkedList0.add(nucleotide1);
      DefaultNucleotideCodec defaultNucleotideCodec4 = DefaultNucleotideCodec.INSTANCE;
      // Undeclared exception!
      try { 
        defaultNucleotideCodec4.decode(byteArray0, (-1765L));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // index can not be negative: -1765
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.9761388013384353
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[5];
      defaultNucleotideCodec0.iterator(byteArray0);
      byteArray0[0] = (byte)16;
      byteArray0[1] = (byte)16;
      LinkedList<Nucleotide> linkedList0 = new LinkedList<Nucleotide>();
      Nucleotide nucleotide0 = Nucleotide.Pyrimidine;
      linkedList0.add(nucleotide0);
      Range range0 = Range.ofLength((byte)16);
      defaultNucleotideCodec0.iterator(byteArray0, range0);
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray1 = defaultNucleotideCodec1.encode((Collection<Nucleotide>) linkedList0);
      LinkedList<Nucleotide> linkedList1 = new LinkedList<Nucleotide>();
      Nucleotide nucleotide1 = Nucleotide.Thymine;
      linkedList0.add(nucleotide1);
      defaultNucleotideCodec0.getUngappedOffsetFor(byteArray1, (byte)16);
      LinkedList<Nucleotide> linkedList2 = new LinkedList<Nucleotide>();
      linkedList2.add(nucleotide1);
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.decode(byteArray0, 4L);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // index 4 corresponds to encodedIndex 6  encodedglyph length is 5
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.82694429858756
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[5];
      defaultNucleotideCodec0.iterator(byteArray0);
      LinkedList<Nucleotide> linkedList0 = new LinkedList<Nucleotide>();
      byte[] byteArray1 = defaultNucleotideCodec0.encode((Collection<Nucleotide>) linkedList0);
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      Nucleotide nucleotide0 = Nucleotide.Gap;
      byte[] byteArray2 = defaultNucleotideCodec1.encode(nucleotide0);
      DefaultNucleotideCodec defaultNucleotideCodec2 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec2.getNumberOfGapsUntil(byteArray2, (byte)16);
      defaultNucleotideCodec1.isGap(byteArray1, 1);
      defaultNucleotideCodec2.toString(byteArray1);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray1);
      
      defaultNucleotideCodec0.toString(byteArray0);
      String string0 = defaultNucleotideCodec1.toString(byteArray2);
      assertEquals("-", string0);
      
      int int0 = defaultNucleotideCodec1.getNumberOfGapsUntil(byteArray2, (-2146503060));
      assertEquals(0, int0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=2.6145894329476076
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[5];
      defaultNucleotideCodec0.iterator(byteArray0);
      byteArray0[0] = (byte)16;
      LinkedList<Nucleotide> linkedList0 = new LinkedList<Nucleotide>();
      Nucleotide nucleotide0 = Nucleotide.Pyrimidine;
      linkedList0.add(nucleotide0);
      LinkedList<Nucleotide> linkedList1 = new LinkedList<Nucleotide>();
      Nucleotide nucleotide1 = Nucleotide.Thymine;
      linkedList0.add(nucleotide1);
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray1 = defaultNucleotideCodec0.encode((Collection<Nucleotide>) linkedList0);
      LinkedList<Nucleotide> linkedList2 = new LinkedList<Nucleotide>();
      defaultNucleotideCodec1.getNumberOfGapsUntil(byteArray1, (byte)16);
      linkedList1.pollFirst();
      DefaultNucleotideCodec defaultNucleotideCodec2 = DefaultNucleotideCodec.INSTANCE;
      linkedList0.add((Nucleotide) null);
      defaultNucleotideCodec2.toString(byteArray1);
      byte[] byteArray2 = new byte[6];
      byteArray2[0] = (byte)0;
      byteArray2[1] = (byte)32;
      byteArray2[2] = (byte)16;
      byteArray2[3] = (byte)0;
      byteArray2[4] = (byte)0;
      linkedList0.add(nucleotide0);
      byteArray2[5] = (byte)32;
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.toString(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec", e);
      }
  }
}
