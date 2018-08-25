/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 15:01:42 GMT 2018
 */

package org.jcvi.jillion.core.residue.nt;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.BufferUnderflowException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
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
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-1);
      byteArray0[2] = (byte)89;
      byteArray0[3] = (byte)8;
      byteArray0[4] = (byte)15;
      byteArray0[5] = (byte)0;
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.getUngappedOffsetFor(byteArray0, (-1375));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.20082764903455
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[8];
      byte byte0 = (byte)0;
      byteArray0[0] = (byte)0;
      byte byte1 = (byte)8;
      byteArray0[1] = (byte)8;
      defaultNucleotideCodec0.decode(byteArray0, (byte)0);
      byte byte2 = (byte)31;
      byteArray0[2] = (byte)31;
      byte byte3 = (byte) (-68);
      byteArray0[3] = (byte) (-68);
      byteArray0[4] = (byte) (-68);
      byte byte4 = (byte)0;
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.getGappedOffsetFor(byteArray0, (-500));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-45);
      byteArray0[1] = (byte)3;
      byteArray0[2] = (byte) (-54);
      byteArray0[3] = (byte)7;
      byteArray0[4] = (byte)7;
      byteArray0[5] = (byte)4;
      Range range0 = Range.of(1307L);
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.iterator(byteArray0, range0);
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
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-105);
      byteArray0[1] = (byte)119;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)0;
      defaultNucleotideCodec0.getUngappedLength(byteArray0);
      byte[] byteArray1 = new byte[6];
      byteArray1[0] = (byte)40;
      byteArray1[1] = (byte)0;
      byteArray1[2] = (byte) (-12);
      byteArray1[3] = (byte)4;
      byteArray1[4] = (byte) (-113);
      byteArray1[5] = (byte) (-89);
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.getNumberOfGapsUntil(byteArray1, (byte)40);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.0431918705451206
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = new byte[9];
      byteArray1[0] = (byte)0;
      byteArray1[1] = (byte) (-96);
      byteArray1[2] = (byte) (-96);
      byteArray1[3] = (byte) (-96);
      byteArray1[4] = (byte) (-96);
      byteArray1[5] = (byte) (-96);
      byteArray1[6] = (byte) (-18);
      byteArray1[7] = (byte) (-96);
      byteArray1[8] = (byte) (-96);
      defaultNucleotideCodec0.getGappedOffsetFor(byteArray1, 3424);
      byteArray0[0] = (byte) (-96);
      byteArray0[1] = (byte)27;
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.getNumberOfGaps(byteArray0);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.8711604142318068
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[5];
      byte byte0 = (byte)79;
      byteArray0[0] = (byte)79;
      byte byte1 = (byte)40;
      byteArray0[1] = (byte)40;
      byte byte2 = (byte)31;
      byteArray0[2] = (byte)31;
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
  //Test case number: 6
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)46;
      byteArray0[1] = (byte) (-128);
      byteArray0[2] = (byte)72;
      byte byte0 = (byte)0;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)1;
      byte byte1 = (byte) (-2);
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.toString(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[6];
      byte byte0 = (byte) (-45);
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.decode(byteArray0, (byte) (-45));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // index can not be negative: -45
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)66;
      byteArray0[1] = (byte)8;
      byteArray0[2] = (byte)33;
      byteArray0[3] = (byte) (-27);
      byteArray0[4] = (byte)16;
      byteArray0[5] = (byte)7;
      byteArray0[6] = (byte)109;
      byteArray0[7] = (byte) (-105);
      Range range0 = Range.of((long) (byte)33);
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.iterator(byteArray0, range0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 20
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-61);
      byteArray0[1] = (byte)5;
      byteArray0[2] = (byte)71;
      byteArray0[3] = (byte)1;
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte) (-113);
      byteArray0[6] = (byte) (-96);
      byteArray0[7] = (byte) (-34);
      byteArray0[8] = (byte)0;
      int int0 = defaultNucleotideCodec0.getNumberOfGapsUntil(byteArray0, (byte) (-34));
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      Nucleotide nucleotide0 = Nucleotide.NotGuanine;
      byte[] byteArray1 = defaultNucleotideCodec1.encode(nucleotide0);
      int int1 = defaultNucleotideCodec1.getNumberOfGaps(byteArray0);
      assertEquals(0, int1);
      
      DefaultNucleotideCodec.values();
      byte[] byteArray2 = new byte[5];
      byteArray2[0] = (byte) (-96);
      byteArray2[1] = (byte) (-96);
      byteArray2[2] = (byte) (-34);
      byteArray2[3] = (byte)9;
      byteArray2[4] = (byte)1;
      int int2 = defaultNucleotideCodec0.getGappedOffsetFor(byteArray2, (byte) (-61));
      assertTrue(int2 == int0);
      
      String string0 = defaultNucleotideCodec0.toString(byteArray1);
      assertEquals("H", string0);
      assertEquals(5, byteArray1.length);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.4515830605217857
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-61);
      byteArray0[1] = (byte)5;
      byteArray0[2] = (byte)71;
      byteArray0[3] = (byte)1;
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte) (-113);
      byteArray0[6] = (byte) (-96);
      byteArray0[7] = (byte) (-34);
      byteArray0[8] = (byte)0;
      int int0 = defaultNucleotideCodec0.getNumberOfGapsUntil(byteArray0, (byte) (-34));
      Nucleotide nucleotide0 = Nucleotide.Purine;
      byte[] byteArray1 = defaultNucleotideCodec0.encode(nucleotide0);
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec1.iterator(byteArray1);
      int int1 = defaultNucleotideCodec0.getNumberOfGaps(byteArray1);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)1, (byte) (-64)}, byteArray1);
      assertTrue(int1 == int0);
      assertEquals(0, int1);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[6];
      defaultNucleotideCodec0.getGapOffsets(byteArray0);
      byteArray0[0] = (byte) (-45);
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec1.getNumberOfGaps(byteArray0);
      defaultNucleotideCodec0.isGap(byteArray0, 547);
      defaultNucleotideCodec1.getUngappedLength(byteArray0);
      DefaultNucleotideCodec defaultNucleotideCodec2 = DefaultNucleotideCodec.INSTANCE;
      // Undeclared exception!
      try { 
        defaultNucleotideCodec2.encode((Collection<Nucleotide>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.67235169799427
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Nucleotide nucleotide0 = Nucleotide.Strong;
      Set<Nucleotide> set0 = nucleotide0.getBasesFor();
      byte[] byteArray0 = defaultNucleotideCodec0.encode((Collection<Nucleotide>) set0);
      defaultNucleotideCodec0.toString(byteArray0);
      defaultNucleotideCodec0.getNumberOfGapsUntil(byteArray0, 4);
      defaultNucleotideCodec0.getGappedOffsetFor(byteArray0, 0);
      // Undeclared exception!
      try { 
        Range.parseRange("g8kPR=Ex`2G3");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // can not parse g8kPR=Ex`2G3 into a Range
         //
         verifyException("org.jcvi.jillion.core.Range", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.464507779299039
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)15;
      byteArray0[1] = (byte) (-127);
      byteArray0[2] = (byte) (-15);
      byteArray0[3] = (byte)13;
      LinkedList<Nucleotide> linkedList0 = new LinkedList<Nucleotide>();
      Nucleotide nucleotide0 = Nucleotide.Strong;
      linkedList0.add(nucleotide0);
      defaultNucleotideCodec0.encode((Collection<Nucleotide>) linkedList0);
      byteArray0[4] = (byte)107;
      byteArray0[5] = (byte)12;
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
  //Test case number: 14
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-61);
      byteArray0[1] = (byte)5;
      byteArray0[2] = (byte)71;
      byteArray0[3] = (byte)1;
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte) (-113);
      byteArray0[7] = (byte) (-34);
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.RESIDUE_BASED;
      defaultNucleotideCodec0.iterator(byteArray0);
      Range range0 = Range.of(range_CoordinateSystem0, (-2307L), 0L);
      range0.getEnd();
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.iterator(byteArray0, range0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must be >=0
         //
         verifyException("org.jcvi.jillion.core.Range$Builder", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte byte0 = (byte)0;
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)0;
      defaultNucleotideCodec0.getUngappedOffsetFor(byteArray0, (byte)0);
      Nucleotide nucleotide0 = Nucleotide.Amino;
      byte[] byteArray1 = defaultNucleotideCodec0.encode(nucleotide0);
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      // Undeclared exception!
      try { 
        defaultNucleotideCodec1.decode(byteArray1, 2066L);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // index 2066 corresponds to encodedIndex 1037  encodedglyph length is 5
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.611212599421004
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[8];
      defaultNucleotideCodec0.toString(byteArray0);
      Nucleotide nucleotide0 = Nucleotide.Purine;
      defaultNucleotideCodec0.getUngappedOffsetFor(byteArray0, (byte)0);
      defaultNucleotideCodec0.encode(nucleotide0);
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)8;
      defaultNucleotideCodec0.decode(byteArray0, (byte)0);
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      // Undeclared exception!
      try { 
        defaultNucleotideCodec1.getNumberOfGapsUntil(byteArray0, 4);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.772588722239781
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-61);
      byteArray0[1] = (byte)5;
      byteArray0[2] = (byte)71;
      byteArray0[3] = (byte)1;
      byteArray0[4] = (byte)0;
      Nucleotide nucleotide0 = Nucleotide.Amino;
      Set<Nucleotide> set0 = nucleotide0.getAllPossibleAmbiguities();
      LinkedList<Nucleotide> linkedList0 = new LinkedList<Nucleotide>(set0);
      defaultNucleotideCodec0.encode((Collection<Nucleotide>) linkedList0);
      byteArray0[5] = (byte) (-113);
      byteArray0[6] = (byte) (-96);
      byteArray0[7] = (byte) (-34);
      byteArray0[8] = (byte)0;
      defaultNucleotideCodec0.getNumberOfGapsUntil(byteArray0, (byte) (-34));
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      Nucleotide nucleotide1 = Nucleotide.NotGuanine;
      defaultNucleotideCodec1.encode(nucleotide1);
      defaultNucleotideCodec1.getNumberOfGaps(byteArray0);
      DefaultNucleotideCodec.values();
      byte[] byteArray1 = new byte[5];
      byteArray1[0] = (byte) (-96);
      byteArray1[1] = (byte) (-96);
      byteArray1[2] = (byte) (-34);
      defaultNucleotideCodec1.isGap(byteArray1, (byte)0);
      // Undeclared exception!
      try { 
        DefaultNucleotideCodec.valueOf(" corresponds to encodedIndex ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec. corresponds to encodedIndex 
         //
         verifyException("java.lang.Enum", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-61);
      byteArray0[1] = (byte)5;
      byteArray0[2] = (byte)71;
      Iterator<Nucleotide> iterator0 = defaultNucleotideCodec0.iterator(byteArray0);
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.encode(10, iterator0);
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
  /*Coverage entropy=2.8875778250565496
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[14];
      Nucleotide nucleotide0 = Nucleotide.Purine;
      byte[] byteArray1 = defaultNucleotideCodec0.encode(nucleotide0);
      defaultNucleotideCodec0.decode(byteArray0, (byte)0);
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec1.getUngappedLength(byteArray0);
      defaultNucleotideCodec1.getGapOffsets(byteArray0);
      Range range0 = Range.ofLength(0L);
      defaultNucleotideCodec0.iterator(byteArray1, range0);
      DefaultNucleotideCodec defaultNucleotideCodec2 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray2 = new byte[3];
      byteArray2[0] = (byte) (-1);
      byteArray2[1] = (byte)50;
      byteArray2[2] = (byte) (-48);
      // Undeclared exception!
      try { 
        defaultNucleotideCodec2.getUngappedOffsetFor(byteArray2, (byte)50);
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
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[16];
      Nucleotide nucleotide0 = defaultNucleotideCodec0.decode(byteArray0, 1L);
      assertEquals(Nucleotide.Gap, nucleotide0);
      
      Nucleotide nucleotide1 = Nucleotide.Amino;
      byte[] byteArray1 = defaultNucleotideCodec0.encode(nucleotide1);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)1, (byte) (-96)}, byteArray1);
      
      boolean boolean0 = defaultNucleotideCodec0.isGap(byteArray0, (-383));
      assertFalse(boolean0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=2.5382584458855306
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[19];
      Nucleotide nucleotide0 = Nucleotide.Purine;
      byte[] byteArray1 = defaultNucleotideCodec0.encode(nucleotide0);
      Nucleotide nucleotide1 = defaultNucleotideCodec0.decode(byteArray0, (byte)0);
      defaultNucleotideCodec0.iterator(byteArray0);
      byte[] byteArray2 = defaultNucleotideCodec0.encode(nucleotide1);
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec0.isGap(byteArray0, (-1147));
      defaultNucleotideCodec1.decode(byteArray0, 0L);
      DefaultNucleotideCodec defaultNucleotideCodec2 = DefaultNucleotideCodec.INSTANCE;
      DefaultNucleotideCodec defaultNucleotideCodec3 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec3.getNumberOfGapsUntil(byteArray1, 333);
      DefaultNucleotideCodec defaultNucleotideCodec4 = DefaultNucleotideCodec.INSTANCE;
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.RESIDUE_BASED;
      Range.of(range_CoordinateSystem0, (-3052L), (long) 333);
      defaultNucleotideCodec2.isGap(byteArray2, 0);
      byte[] byteArray3 = new byte[6];
      byteArray3[0] = (byte)11;
      byteArray3[1] = (byte) (-105);
      byteArray3[2] = (byte) (-102);
      byteArray3[3] = (byte) (-78);
      byteArray3[4] = (byte)65;
      byteArray3[5] = (byte)101;
      // Undeclared exception!
      try { 
        defaultNucleotideCodec4.isGap(byteArray3, 13);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=2.4582044327855743
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[19];
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec1.iterator(byteArray0);
      Nucleotide nucleotide0 = Nucleotide.Gap;
      byte[] byteArray1 = defaultNucleotideCodec1.encode(nucleotide0);
      DefaultNucleotideCodec defaultNucleotideCodec2 = DefaultNucleotideCodec.INSTANCE;
      int int0 = defaultNucleotideCodec2.getNumberOfGapsUntil(byteArray1, 5);
      assertEquals(1, int0);
      assertEquals(5, byteArray1.length);
      
      DefaultNucleotideCodec defaultNucleotideCodec3 = DefaultNucleotideCodec.INSTANCE;
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.ZERO_BASED;
      Range.of(range_CoordinateSystem0, (long) 1, 2L);
      DefaultNucleotideCodec defaultNucleotideCodec4 = DefaultNucleotideCodec.INSTANCE;
      boolean boolean0 = defaultNucleotideCodec4.isGap(byteArray0, 0);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=2.5850551150485943
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[19];
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      Iterator<Nucleotide> iterator0 = defaultNucleotideCodec1.iterator(byteArray0);
      Nucleotide nucleotide0 = Nucleotide.Gap;
      byte[] byteArray1 = defaultNucleotideCodec1.encode(nucleotide0);
      int int0 = 5;
      DefaultNucleotideCodec defaultNucleotideCodec2 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec2.getNumberOfGapsUntil(byteArray1, (-2987));
      DefaultNucleotideCodec defaultNucleotideCodec3 = DefaultNucleotideCodec.INSTANCE;
      // Undeclared exception!
      try { 
        defaultNucleotideCodec3.encode((-2987), iterator0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.ByteBuffer", e);
      }
  }
}
