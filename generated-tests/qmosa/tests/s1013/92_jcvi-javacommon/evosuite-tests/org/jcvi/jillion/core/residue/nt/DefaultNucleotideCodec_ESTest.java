/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 13:22:15 GMT 2018
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
  /*Coverage entropy=2.772588722239781
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-19);
      Nucleotide nucleotide0 = Nucleotide.NotGuanine;
      Set<Nucleotide> set0 = nucleotide0.getAllPossibleAmbiguities();
      byte[] byteArray1 = defaultNucleotideCodec0.encode((Collection<Nucleotide>) set0);
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte) (-54);
      defaultNucleotideCodec0.isGap(byteArray0, (byte) (-54));
      byteArray0[3] = (byte) (-55);
      byteArray0[4] = (byte) (-88);
      defaultNucleotideCodec0.toString(byteArray1);
      byteArray0[5] = (byte)63;
      byteArray0[6] = (byte) (-23);
      byte[] byteArray2 = new byte[6];
      byteArray2[0] = (byte)1;
      byteArray2[1] = (byte) (-23);
      byteArray2[2] = (byte) (-55);
      byteArray2[3] = (byte) (-23);
      byteArray2[4] = (byte) (-54);
      byteArray2[5] = (byte)0;
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.isGap(byteArray2, (-1962));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Nucleotide nucleotide0 = Nucleotide.Amino;
      defaultNucleotideCodec0.encode(nucleotide0);
      int int0 = 15;
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      Range range0 = Range.ofLength(359L);
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.ZERO_BASED;
      Range range1 = Range.of(range_CoordinateSystem0, (-874L), (-874L));
      range0.isSubRangeOf(range1);
      // Undeclared exception!
      try { 
        Range.ofLength((-2918L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must be >=0
         //
         verifyException("org.jcvi.jillion.core.Range$Builder", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.8711604142318068
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)4;
      byteArray0[1] = (byte) (-1);
      byteArray0[2] = (byte)14;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)7;
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte) (-63);
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
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.valueOf("INSTANCE");
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)118;
      byteArray0[1] = (byte) (-43);
      byteArray0[2] = (byte) (-107);
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)5;
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte)0;
      Range range0 = Range.of((long) (byte)0, (long) (byte)0);
      Iterator<Nucleotide> iterator0 = defaultNucleotideCodec0.iterator(byteArray0, range0);
      assertNotNull(iterator0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.253857589601352
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[9];
      defaultNucleotideCodec0.getUngappedLength(byteArray0);
      byteArray0[0] = (byte)60;
      byteArray0[1] = (byte)82;
      byte byte0 = (byte) (-73);
      byteArray0[2] = (byte) (-73);
      byteArray0[3] = (byte)86;
      defaultNucleotideCodec0.iterator(byteArray0);
      byteArray0[4] = (byte)8;
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.decode(byteArray0, 3555L);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // index 3555 corresponds to encodedIndex 1781  encodedglyph length is 9
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.1006789212792607
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)89;
      byteArray0[1] = (byte)71;
      byte byte0 = (byte)0;
      byteArray0[2] = (byte)0;
      int int0 = (-3383);
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.getUngappedOffsetFor(byteArray0, (-3383));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-14);
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.decode(byteArray0, (byte) (-14));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // index can not be negative: -14
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[4];
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      Iterator<Nucleotide> iterator0 = defaultNucleotideCodec1.iterator(byteArray0);
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
  //Test case number: 8
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[5];
      byte byte0 = (byte)0;
      byte byte1 = (byte)83;
      byte byte2 = (byte)3;
      byte byte3 = (byte)0;
      byte byte4 = (byte)0;
      Range range0 = Range.ofLength(3149L);
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.iterator(byteArray0, range0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // range [ 0 .. 3148 ]/0B is out of range of sequence which is only [ 0 .. -1 ]/0B
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Collection<Nucleotide> collection0 = null;
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte) (-72);
      byteArray0[3] = (byte) (-11);
      Range range0 = Range.of((long) (byte) (-11), 2L);
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.iterator(byteArray0, range0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // range [ -11 .. 2 ]/0B is out of range of sequence which is only [ 0 .. 47348 ]/0B
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.395908119293929
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[6];
      byteArray0[1] = (byte)78;
      Range range0 = Range.ofLength(0L);
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec1.iterator(byteArray0, range0);
      DefaultNucleotideCodec defaultNucleotideCodec2 = DefaultNucleotideCodec.INSTANCE;
      // Undeclared exception!
      try { 
        defaultNucleotideCodec2.getNumberOfGapsUntil(byteArray0, (byte)78);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.980638939500363
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.valueOf("INSTANCE");
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte) (-50);
      byteArray0[1] = (byte) (-38);
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec1.decodedLengthOf(byteArray0);
      defaultNucleotideCodec0.decodedLengthOf(byteArray0);
      DefaultNucleotideCodec defaultNucleotideCodec2 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec2.getUngappedLength(byteArray0);
      Nucleotide nucleotide0 = Nucleotide.NotGuanine;
      Set<Nucleotide> set0 = nucleotide0.getBasesFor();
      byte[] byteArray1 = defaultNucleotideCodec0.encode((Collection<Nucleotide>) set0);
      Nucleotide nucleotide1 = defaultNucleotideCodec0.decode(byteArray0, 0L);
      assertEquals(Nucleotide.Gap, nucleotide1);
      
      defaultNucleotideCodec0.getNumberOfGapsUntil(byteArray0, 1717986918);
      long long0 = defaultNucleotideCodec1.getUngappedLength(byteArray0);
      assertEquals((-824573952L), long0);
      
      defaultNucleotideCodec1.getUngappedOffsetFor(byteArray1, (-651));
      defaultNucleotideCodec2.getGappedOffsetFor(byteArray0, (byte) (-38));
      defaultNucleotideCodec0.getGappedOffsetFor(byteArray0, (byte) (-50));
      DefaultNucleotideCodec defaultNucleotideCodec3 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec3.decodedLengthOf(byteArray1);
      defaultNucleotideCodec3.decodedLengthOf(byteArray1);
      DefaultNucleotideCodec defaultNucleotideCodec4 = DefaultNucleotideCodec.INSTANCE;
      int int0 = defaultNucleotideCodec4.getGappedOffsetFor(byteArray1, (byte) (-38));
      assertEquals(3, int0);
      
      DefaultNucleotideCodec defaultNucleotideCodec5 = DefaultNucleotideCodec.INSTANCE;
      int int1 = defaultNucleotideCodec5.getNumberOfGapsUntil(byteArray1, (byte) (-38));
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)3, (byte)29, (byte) (-32)}, byteArray1);
      assertEquals(0, int1);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.7516666169315163
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-3);
      byte byte0 = (byte) (-2);
      defaultNucleotideCodec0.getGappedOffsetFor(byteArray0, 2130);
      Nucleotide nucleotide0 = Nucleotide.NotCytosine;
      Set<Nucleotide> set0 = nucleotide0.getBasesFor();
      byte[] byteArray1 = defaultNucleotideCodec0.encode((Collection<Nucleotide>) set0);
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec1.toString(byteArray1);
      DefaultNucleotideCodec defaultNucleotideCodec2 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray2 = new byte[5];
      byteArray2[0] = (byte) (-2);
      byteArray2[1] = (byte) (-3);
      byteArray2[2] = (byte) (-3);
      byteArray2[3] = (byte) (-3);
      byteArray2[4] = (byte) (-3);
      // Undeclared exception!
      try { 
        defaultNucleotideCodec2.toString(byteArray2);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.6525875347201477
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[9];
      defaultNucleotideCodec0.toString(byteArray0);
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      Nucleotide nucleotide0 = Nucleotide.Pyrimidine;
      Set<Nucleotide> set0 = nucleotide0.getBasesFor();
      byte[] byteArray1 = defaultNucleotideCodec1.encode((Collection<Nucleotide>) set0);
      DefaultNucleotideCodec defaultNucleotideCodec2 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec2.toString(byteArray1);
      defaultNucleotideCodec2.toString(byteArray1);
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.getUngappedOffsetFor((byte[]) null, 12);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.ByteBuffer", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.948783720452396
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      DefaultNucleotideCodec defaultNucleotideCodec2 = DefaultNucleotideCodec.INSTANCE;
      Nucleotide nucleotide0 = Nucleotide.Pyrimidine;
      Set<Nucleotide> set0 = nucleotide0.getBasesFor();
      byte[] byteArray0 = defaultNucleotideCodec1.encode((Collection<Nucleotide>) set0);
      Nucleotide nucleotide1 = defaultNucleotideCodec0.decode(byteArray0, 0L);
      assertEquals(Nucleotide.Cytosine, nucleotide1);
      
      defaultNucleotideCodec1.getNumberOfGapsUntil(byteArray0, 1717986918);
      DefaultNucleotideCodec defaultNucleotideCodec3 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec3.getUngappedLength(byteArray0);
      DefaultNucleotideCodec defaultNucleotideCodec4 = DefaultNucleotideCodec.INSTANCE;
      int int0 = defaultNucleotideCodec4.getUngappedOffsetFor(byteArray0, (-1209));
      assertEquals((-1209), int0);
      
      int int1 = defaultNucleotideCodec2.getGappedOffsetFor(byteArray0, (-1209));
      assertEquals(2, int1);
      
      defaultNucleotideCodec2.getGappedOffsetFor(byteArray0, 1717986918);
      DefaultNucleotideCodec defaultNucleotideCodec5 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec5.decodedLengthOf(byteArray0);
      defaultNucleotideCodec0.decodedLengthOf(byteArray0);
      DefaultNucleotideCodec defaultNucleotideCodec6 = DefaultNucleotideCodec.INSTANCE;
      DefaultNucleotideCodec defaultNucleotideCodec7 = DefaultNucleotideCodec.INSTANCE;
      int int2 = defaultNucleotideCodec7.getGappedOffsetFor(byteArray0, 0);
      int int3 = defaultNucleotideCodec6.getNumberOfGapsUntil(byteArray0, 5);
      assertTrue(int3 == int2);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)2, (byte) (-34)}, byteArray0);
      assertEquals(0, int3);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.4525700132959214
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      Nucleotide nucleotide0 = Nucleotide.Pyrimidine;
      Set<Nucleotide> set0 = nucleotide0.getBasesFor();
      defaultNucleotideCodec1.encode((Collection<Nucleotide>) set0);
      DefaultNucleotideCodec defaultNucleotideCodec2 = DefaultNucleotideCodec.INSTANCE;
      Set<Nucleotide> set1 = nucleotide0.getBasesFor();
      defaultNucleotideCodec0.encode((Collection<Nucleotide>) set1);
      DefaultNucleotideCodec.values();
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)102;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)8;
      byteArray0[3] = (byte) (-37);
      byteArray0[4] = (byte) (-11);
      byteArray0[5] = (byte)40;
      byteArray0[6] = (byte)5;
      byteArray0[7] = (byte) (-42);
      // Undeclared exception!
      try { 
        defaultNucleotideCodec2.getGappedOffsetFor(byteArray0, (-2398));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.293412589485358
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DefaultNucleotideCodec.valueOf("INSTANCE");
      byte[] byteArray0 = new byte[7];
      byteArray0[5] = (byte) (-50);
      byteArray0[1] = (byte) (-38);
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec0.decodedLengthOf(byteArray0);
      defaultNucleotideCodec0.iterator(byteArray0);
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec1.decode(byteArray0, 1L);
      DefaultNucleotideCodec defaultNucleotideCodec2 = DefaultNucleotideCodec.valueOf("INSTANCE");
      // Undeclared exception!
      try { 
        defaultNucleotideCodec2.isGap(byteArray0, 14286848);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=3.0447063524141162
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[9];
      defaultNucleotideCodec0.toString(byteArray0);
      defaultNucleotideCodec0.decodedLengthOf(byteArray0);
      defaultNucleotideCodec0.decodedLengthOf(byteArray0);
      defaultNucleotideCodec0.getUngappedLength(byteArray0);
      Nucleotide nucleotide0 = Nucleotide.Gap;
      Set<Nucleotide> set0 = nucleotide0.getBasesFor();
      byte[] byteArray1 = defaultNucleotideCodec0.encode((Collection<Nucleotide>) set0);
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec1.decode(byteArray0, 0);
      DefaultNucleotideCodec defaultNucleotideCodec2 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray2 = defaultNucleotideCodec2.encode((Collection<Nucleotide>) set0);
      DefaultNucleotideCodec defaultNucleotideCodec3 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec3.toString(byteArray1);
      DefaultNucleotideCodec defaultNucleotideCodec4 = DefaultNucleotideCodec.INSTANCE;
      DefaultNucleotideCodec defaultNucleotideCodec5 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec5.toString(byteArray0);
      DefaultNucleotideCodec defaultNucleotideCodec6 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec6.getNumberOfGapsUntil(byteArray1, 4);
      DefaultNucleotideCodec.values();
      defaultNucleotideCodec1.isGap(byteArray2, 0);
      defaultNucleotideCodec4.getGappedOffsetFor(byteArray1, (-16908803));
      defaultNucleotideCodec0.getNumberOfGapsUntil(byteArray0, 1497825280);
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
  //Test case number: 18
  /*Coverage entropy=3.025596903831831
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[9];
      defaultNucleotideCodec0.toString(byteArray0);
      defaultNucleotideCodec0.decodedLengthOf(byteArray0);
      defaultNucleotideCodec0.decodedLengthOf(byteArray0);
      defaultNucleotideCodec0.getUngappedLength(byteArray0);
      Nucleotide nucleotide0 = Nucleotide.Gap;
      Set<Nucleotide> set0 = nucleotide0.getBasesFor();
      byte[] byteArray1 = defaultNucleotideCodec0.encode((Collection<Nucleotide>) set0);
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec1.decode(byteArray0, 0);
      DefaultNucleotideCodec defaultNucleotideCodec2 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray2 = defaultNucleotideCodec2.encode((Collection<Nucleotide>) set0);
      DefaultNucleotideCodec defaultNucleotideCodec3 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec3.toString(byteArray1);
      DefaultNucleotideCodec defaultNucleotideCodec4 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec4.isGap(byteArray0, 1553);
      defaultNucleotideCodec0.getNumberOfGapsUntil(byteArray2, (-3166));
      DefaultNucleotideCodec defaultNucleotideCodec5 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec5.isGap(byteArray0, 75);
      DefaultNucleotideCodec defaultNucleotideCodec6 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray3 = new byte[0];
      // Undeclared exception!
      try { 
        defaultNucleotideCodec6.isGap(byteArray3, (-1));
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }
}