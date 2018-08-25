/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 14:50:36 GMT 2018
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
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)92;
      byteArray0[1] = (byte)8;
      byte byte0 = (byte) (-45);
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.getNumberOfGaps(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[4];
      Nucleotide nucleotide0 = Nucleotide.Thymine;
      byte[] byteArray1 = defaultNucleotideCodec0.encode(nucleotide0);
      byteArray0[0] = (byte)80;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte) (-58);
      defaultNucleotideCodec0.getGappedOffsetFor(byteArray1, 0);
      byteArray0[3] = (byte)17;
      defaultNucleotideCodec0.decodedLengthOf(byteArray0);
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.isGap(byteArray0, 5);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.70805020110221
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)126;
      LinkedList<Nucleotide> linkedList0 = new LinkedList<Nucleotide>();
      byte[] byteArray1 = defaultNucleotideCodec0.encode((Collection<Nucleotide>) linkedList0);
      byteArray0[1] = (byte) (-51);
      defaultNucleotideCodec0.getNumberOfGaps(byteArray1);
      byteArray0[2] = (byte)5;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)7;
      Nucleotide nucleotide0 = Nucleotide.NotThymine;
      defaultNucleotideCodec0.encode(nucleotide0);
      byteArray0[5] = (byte) (-49);
      defaultNucleotideCodec0.getGappedOffsetFor(byteArray1, (byte)126);
      byteArray0[6] = (byte) (-41);
      // Undeclared exception!
      defaultNucleotideCodec0.toString(byteArray0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)98;
      byteArray0[1] = (byte)32;
      byteArray0[2] = (byte)52;
      byteArray0[3] = (byte) (-114);
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte) (-3);
      byteArray0[8] = (byte)10;
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.decode(byteArray0, (byte)32);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // index 32 corresponds to encodedIndex 20  encodedglyph length is 9
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.1192809219098505
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)42;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)0;
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.getUngappedOffsetFor(byteArray0, 579);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[5];
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      Nucleotide nucleotide0 = defaultNucleotideCodec1.decode(byteArray0, (byte)0);
      assertEquals(Nucleotide.Gap, nucleotide0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.273965716419247
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Nucleotide nucleotide0 = Nucleotide.Thymine;
      byte[] byteArray0 = defaultNucleotideCodec0.encode(nucleotide0);
      defaultNucleotideCodec0.getNumberOfGaps(byteArray0);
      // Undeclared exception!
      try { 
        DefaultNucleotideCodec.valueOf((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Name is null
         //
         verifyException("java.lang.Enum", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[5];
      byte byte0 = (byte)0;
      byteArray0[0] = (byte)0;
      byte byte1 = (byte)0;
      defaultNucleotideCodec0.iterator(byteArray0);
      Range range0 = Range.of(1L, 876L);
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.iterator(byteArray0, range0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // range [ 1 .. 876 ]/0B is out of range of sequence which is only [ 0 .. -1 ]/0B
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte) (-55);
      byteArray0[1] = (byte) (-56);
      byteArray0[2] = (byte) (-39);
      byteArray0[3] = (byte)0;
      defaultNucleotideCodec0.getNumberOfGapsUntil(byteArray0, 1081);
      byteArray0[4] = (byte)75;
      byteArray0[5] = (byte)0;
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.decode(byteArray0, (byte) (-1));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // index can not be negative: -1
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DefaultNucleotideCodec.values();
      byte byte0 = (byte)8;
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-45);
      byteArray0[1] = (byte) (-45);
      byteArray0[2] = (byte) (-45);
      byteArray0[3] = (byte)8;
      byteArray0[4] = (byte)92;
      byteArray0[5] = (byte)16;
      defaultNucleotideCodec0.getNumberOfGaps(byteArray0);
      defaultNucleotideCodec0.iterator(byteArray0);
      Range range0 = Range.of((-346L), (-1L));
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
  //Test case number: 10
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[8];
      defaultNucleotideCodec0.decode(byteArray0, 9223372036854775807L);
      defaultNucleotideCodec0.getNumberOfGaps(byteArray0);
      defaultNucleotideCodec0.iterator(byteArray0);
      byte byte0 = (byte) (-89);
      byte[] byteArray1 = new byte[0];
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.toString(byteArray1);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-114);
      byteArray0[1] = (byte) (-64);
      byteArray0[2] = (byte) (-118);
      byteArray0[3] = (byte) (-1);
      int int0 = defaultNucleotideCodec0.getNumberOfGapsUntil(byteArray0, (byte) (-64));
      assertEquals(0, int0);
      
      byte[] byteArray1 = new byte[5];
      boolean boolean0 = defaultNucleotideCodec0.isGap(byteArray1, (byte)84);
      assertFalse(boolean0);
      
      String string0 = defaultNucleotideCodec0.toString(byteArray1);
      assertEquals("", string0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      Nucleotide nucleotide0 = Nucleotide.Cytosine;
      Set<Nucleotide> set0 = nucleotide0.getAllPossibleAmbiguities();
      defaultNucleotideCodec1.encode((Collection<Nucleotide>) set0);
      LinkedList<Nucleotide> linkedList0 = new LinkedList<Nucleotide>();
      DefaultNucleotideCodec defaultNucleotideCodec2 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec2.encode((Collection<Nucleotide>) linkedList0);
      Range range0 = Range.of(8L, 8L);
      Range range1 = Range.of(1L);
      range0.complement(range1);
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-2);
      byteArray0[1] = (byte)99;
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.iterator(byteArray0, range1);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.507674582526619
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Nucleotide nucleotide0 = Nucleotide.Thymine;
      byte[] byteArray0 = defaultNucleotideCodec0.encode(nucleotide0);
      int int0 = defaultNucleotideCodec0.getGappedOffsetFor(byteArray0, (-1328));
      assertEquals(1, int0);
      
      defaultNucleotideCodec0.decodedLengthOf(byteArray0);
      defaultNucleotideCodec0.isGap(byteArray0, (-3458));
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      int int1 = defaultNucleotideCodec1.getNumberOfGapsUntil(byteArray0, (byte)0);
      assertEquals(0, int1);
      assertFalse(int1 == int0);
      
      DefaultNucleotideCodec defaultNucleotideCodec2 = DefaultNucleotideCodec.INSTANCE;
      boolean boolean0 = defaultNucleotideCodec2.isGap(byteArray0, 0);
      assertFalse(boolean0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)1, (byte) (-32)}, byteArray0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.772588722239781
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[8];
      byte[] byteArray1 = new byte[4];
      byteArray1[0] = (byte)0;
      byteArray1[1] = (byte)0;
      byteArray1[2] = (byte)0;
      byteArray1[3] = (byte)0;
      int int0 = defaultNucleotideCodec0.getNumberOfGaps(byteArray1);
      byteArray0[0] = (byte)0;
      LinkedList<Nucleotide> linkedList0 = new LinkedList<Nucleotide>();
      Iterator<Nucleotide> iterator0 = linkedList0.iterator();
      byte[] byteArray2 = defaultNucleotideCodec0.encode((int) (byte)0, iterator0);
      Nucleotide nucleotide0 = Nucleotide.Pyrimidine;
      linkedList0.add(nucleotide0);
      int int1 = defaultNucleotideCodec0.getGappedOffsetFor(byteArray0, 1431);
      assertTrue(int1 == int0);
      
      defaultNucleotideCodec0.getGapOffsets(byteArray1);
      defaultNucleotideCodec0.iterator(byteArray0);
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec1.getGapOffsets(byteArray1);
      defaultNucleotideCodec0.decodedLengthOf(byteArray1);
      defaultNucleotideCodec1.decodedLengthOf(byteArray2);
      defaultNucleotideCodec0.getUngappedLength(byteArray1);
      defaultNucleotideCodec1.iterator(byteArray1);
      defaultNucleotideCodec0.toString(byteArray2);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray2);
      
      boolean boolean0 = defaultNucleotideCodec1.isGap(byteArray0, (byte)0);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.3794476433534975
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[9];
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      Iterator<Nucleotide> iterator0 = defaultNucleotideCodec1.iterator(byteArray0);
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.encode(66, iterator0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no more elements
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.802001039135075
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Nucleotide nucleotide0 = Nucleotide.Thymine;
      byte[] byteArray0 = defaultNucleotideCodec0.encode(nucleotide0);
      defaultNucleotideCodec0.getGappedOffsetFor(byteArray0, (-1328));
      defaultNucleotideCodec0.decodedLengthOf(byteArray0);
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      Range range0 = Range.ofLength(1);
      Iterator<Nucleotide> iterator0 = defaultNucleotideCodec0.iterator(byteArray0, range0);
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.encode((-558), iterator0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.ByteBuffer", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.2102535776209735
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Nucleotide nucleotide0 = Nucleotide.Thymine;
      byte[] byteArray0 = defaultNucleotideCodec0.encode(nucleotide0);
      Nucleotide nucleotide1 = Nucleotide.NotCytosine;
      Range range0 = Range.ofLength(0L);
      defaultNucleotideCodec0.iterator(byteArray0, range0);
      defaultNucleotideCodec0.encode(nucleotide1);
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      String string0 = defaultNucleotideCodec1.toString(byteArray0);
      assertEquals("T", string0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.7912945696950127
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Nucleotide nucleotide0 = Nucleotide.Thymine;
      byte[] byteArray0 = defaultNucleotideCodec0.encode(nucleotide0);
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      Nucleotide nucleotide1 = Nucleotide.Strong;
      Set<Nucleotide> set0 = nucleotide1.getBasesFor();
      byte[] byteArray1 = defaultNucleotideCodec1.encode((Collection<Nucleotide>) set0);
      defaultNucleotideCodec1.isGap(byteArray0, (-1073741823));
      Nucleotide nucleotide2 = Nucleotide.Pyrimidine;
      defaultNucleotideCodec0.encode(nucleotide2);
      DefaultNucleotideCodec defaultNucleotideCodec2 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec2.getNumberOfGapsUntil(byteArray1, (-1073741823));
      DefaultNucleotideCodec defaultNucleotideCodec3 = DefaultNucleotideCodec.INSTANCE;
      boolean boolean0 = defaultNucleotideCodec3.isGap(byteArray0, 11);
      assertFalse(boolean0);
      
      int int0 = defaultNucleotideCodec1.getNumberOfGapsUntil(byteArray0, (-1073741823));
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)1, (byte) (-32)}, byteArray0);
      assertEquals(0, int0);
      
      String string0 = defaultNucleotideCodec1.toString(byteArray1);
      assertEquals("CG", string0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)2, (byte) (-46)}, byteArray1);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.415052121917807
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      LinkedList<Nucleotide> linkedList0 = new LinkedList<Nucleotide>();
      DefaultNucleotideCodec defaultNucleotideCodec2 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte) (-8);
      byteArray0[1] = (byte)14;
      byteArray0[2] = (byte) (-8);
      byteArray0[3] = (byte) (-8);
      byteArray0[4] = (byte)39;
      byteArray0[5] = (byte)10;
      byteArray0[6] = (byte)117;
      defaultNucleotideCodec2.getNumberOfGaps(byteArray0);
      DefaultNucleotideCodec defaultNucleotideCodec3 = DefaultNucleotideCodec.INSTANCE;
      Nucleotide nucleotide0 = Nucleotide.NotCytosine;
      byte[] byteArray1 = defaultNucleotideCodec3.encode(nucleotide0);
      DefaultNucleotideCodec defaultNucleotideCodec4 = DefaultNucleotideCodec.INSTANCE;
      Nucleotide nucleotide1 = Nucleotide.Gap;
      byte[] byteArray2 = defaultNucleotideCodec4.encode(nucleotide1);
      String string0 = defaultNucleotideCodec2.toString(byteArray1);
      assertEquals("D", string0);
      
      int int0 = defaultNucleotideCodec1.getGappedOffsetFor(byteArray2, (byte) (-8));
      assertEquals(1, int0);
      assertEquals(5, byteArray2.length);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=2.8188057478879354
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[9];
      defaultNucleotideCodec0.getGappedOffsetFor(byteArray0, (-2942));
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec1.decodedLengthOf(byteArray0);
      Nucleotide nucleotide0 = Nucleotide.Thymine;
      Set<Nucleotide> set0 = nucleotide0.getAllPossibleAmbiguities();
      LinkedList<Nucleotide> linkedList0 = new LinkedList<Nucleotide>(set0);
      byte[] byteArray1 = defaultNucleotideCodec0.encode((Collection<Nucleotide>) linkedList0);
      defaultNucleotideCodec1.isGap(byteArray1, 0);
      byte[] byteArray2 = defaultNucleotideCodec0.encode(nucleotide0);
      DefaultNucleotideCodec defaultNucleotideCodec2 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray3 = new byte[5];
      byteArray3[1] = (byte)0;
      byteArray3[3] = (byte)1;
      byteArray3[4] = (byte)0;
      defaultNucleotideCodec0.getNumberOfGapsUntil(byteArray3, 0);
      defaultNucleotideCodec1.isGap(byteArray3, (-1));
      defaultNucleotideCodec2.getNumberOfGapsUntil(byteArray2, (-1686));
      DefaultNucleotideCodec defaultNucleotideCodec3 = DefaultNucleotideCodec.INSTANCE;
      DefaultNucleotideCodec defaultNucleotideCodec4 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec4.toString(byteArray1);
      defaultNucleotideCodec3.getNumberOfGapsUntil(byteArray3, (-1147));
      // Undeclared exception!
      try { 
        DefaultNucleotideCodec.valueOf("NHDBWYK");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.NHDBWYK
         //
         verifyException("java.lang.Enum", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=2.8265291108244894
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[9];
      defaultNucleotideCodec0.getGappedOffsetFor(byteArray0, (-2942));
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec1.decodedLengthOf(byteArray0);
      Nucleotide nucleotide0 = Nucleotide.Thymine;
      Set<Nucleotide> set0 = nucleotide0.getAllPossibleAmbiguities();
      LinkedList<Nucleotide> linkedList0 = new LinkedList<Nucleotide>(set0);
      byte[] byteArray1 = defaultNucleotideCodec0.encode((Collection<Nucleotide>) linkedList0);
      defaultNucleotideCodec1.isGap(byteArray1, 0);
      byte[] byteArray2 = defaultNucleotideCodec0.encode(nucleotide0);
      DefaultNucleotideCodec defaultNucleotideCodec2 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray3 = new byte[5];
      byteArray3[1] = (byte)0;
      byteArray3[3] = (byte)1;
      byteArray3[4] = (byte)0;
      defaultNucleotideCodec2.getNumberOfGapsUntil(byteArray3, 1952257861);
      defaultNucleotideCodec0.isGap(byteArray2, (-2383));
      assertEquals(5, byteArray2.length);
      
      defaultNucleotideCodec0.getNumberOfGapsUntil(byteArray1, (-2383));
      DefaultNucleotideCodec defaultNucleotideCodec3 = DefaultNucleotideCodec.INSTANCE;
      Set<Nucleotide> set1 = nucleotide0.getBasesFor();
      linkedList0.addAll((Collection<? extends Nucleotide>) set1);
      String string0 = defaultNucleotideCodec3.toString(byteArray3);
      assertEquals("-", string0);
      
      int int0 = defaultNucleotideCodec3.getNumberOfGapsUntil(byteArray0, 0);
      assertEquals(0, int0);
      
      boolean boolean0 = defaultNucleotideCodec0.isGap(byteArray3, 0);
      boolean boolean1 = defaultNucleotideCodec3.isGap(byteArray1, 0);
      assertEquals(8, byteArray1.length);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)7, (byte) (-7), (byte)104, (byte)67, (byte)80}, byteArray1);
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
  }
}
