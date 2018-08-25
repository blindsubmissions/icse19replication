/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 11:01:21 GMT 2018
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
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)124;
      byteArray0[1] = (byte) (-1);
      byte byte0 = (byte)0;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)7;
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte)69;
      byte byte1 = (byte)13;
      byteArray0[6] = (byte)13;
      byte byte2 = (byte) (-63);
      byteArray0[7] = (byte) (-63);
      defaultNucleotideCodec0.iterator(byteArray0);
      byte byte3 = (byte) (-40);
      byteArray0[8] = (byte) (-40);
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.getGapOffsets(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[6];
      byte byte0 = (byte) (-125);
      byteArray0[0] = (byte) (-125);
      byte byte1 = (byte) (-12);
      byteArray0[1] = (byte) (-12);
      byte byte2 = (byte)24;
      byteArray0[2] = (byte)24;
      defaultNucleotideCodec0.decode(byteArray0, 0L);
      byteArray0[3] = (byte)66;
      byte byte3 = (byte)0;
      defaultNucleotideCodec0.getUngappedLength(byteArray0);
      byteArray0[4] = (byte)0;
      byte byte4 = (byte)0;
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.decode(byteArray0, (byte)66);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // index 66 corresponds to encodedIndex 37  encodedglyph length is 6
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DefaultNucleotideCodec.values();
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[6];
      defaultNucleotideCodec0.getNumberOfGaps(byteArray0);
      byteArray0[0] = (byte) (-21);
      byte byte0 = (byte)53;
      byteArray0[1] = (byte)53;
      byteArray0[2] = (byte)116;
      byte byte1 = (byte)29;
      byteArray0[3] = (byte)29;
      byteArray0[4] = (byte) (-1);
      byteArray0[5] = (byte)0;
      Iterator<Nucleotide> iterator0 = defaultNucleotideCodec1.iterator(byteArray0);
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.encode((-379), iterator0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.ByteBuffer", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.9913464134109882
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-36);
      byteArray0[2] = (byte)71;
      byteArray0[3] = (byte)32;
      byteArray0[4] = (byte)81;
      byteArray0[5] = (byte) (-76);
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.getUngappedLength(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.6023807799324814
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)15;
      byte byte0 = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte) (-100);
      byteArray0[4] = (byte)28;
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte)0;
      defaultNucleotideCodec0.decode(byteArray0, 0L);
      byteArray0[7] = (byte)0;
      byteArray0[8] = (byte)3;
      Iterator<Nucleotide> iterator0 = defaultNucleotideCodec0.iterator(byteArray0);
      defaultNucleotideCodec0.encode(8, iterator0);
      byte[] byteArray1 = new byte[0];
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.decode(byteArray1, (-4233L));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // index can not be negative: -4233
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.getUngappedOffsetFor((byte[]) null, 2851);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.ByteBuffer", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.70805020110221
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-35);
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)14;
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte) (-1);
      defaultNucleotideCodec0.getGapOffsets(byteArray0);
      defaultNucleotideCodec0.getGappedOffsetFor(byteArray0, 87);
      Nucleotide nucleotide0 = Nucleotide.Adenine;
      Set<Nucleotide> set0 = nucleotide0.getAllPossibleAmbiguities();
      defaultNucleotideCodec0.encode((Collection<Nucleotide>) set0);
      defaultNucleotideCodec0.encode((Collection<Nucleotide>) set0);
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.toString((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.ByteBuffer", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.8711604142318068
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DefaultNucleotideCodec.values();
      DefaultNucleotideCodec.values();
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)64;
      byteArray0[1] = (byte) (-105);
      byteArray0[2] = (byte)90;
      byteArray0[3] = (byte)47;
      byteArray0[4] = (byte) (-97);
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte)4;
      byteArray0[7] = (byte)9;
      byteArray0[8] = (byte)11;
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.getGappedOffsetFor(byteArray0, (byte) (-97));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-36);
      byteArray0[2] = (byte)71;
      byteArray0[3] = (byte)32;
      byteArray0[2] = (byte)81;
      defaultNucleotideCodec0.decodedLengthOf(byteArray0);
      Range range0 = Range.of((long) (byte)71);
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.iterator(byteArray0, range0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 39
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
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-36);
      byteArray0[2] = (byte)71;
      LinkedList<Nucleotide> linkedList0 = new LinkedList<Nucleotide>();
      Nucleotide nucleotide0 = Nucleotide.Unknown;
      linkedList0.offerFirst(nucleotide0);
      Range range0 = Range.of((-4200L));
      range0.iterator();
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      // Undeclared exception!
      try { 
        defaultNucleotideCodec1.iterator(byteArray0, range0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // range [ -4200 .. -4200 ]/0B is out of range of sequence which is only [ 0 .. 14436095 ]/0B
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)10;
      byteArray0[1] = (byte)10;
      byteArray0[2] = (byte)10;
      byteArray0[3] = (byte)10;
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.toString(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.8946891171539901
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)52;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)10;
      byteArray0[3] = (byte)127;
      byteArray0[4] = (byte)69;
      byteArray0[5] = (byte)24;
      byteArray0[6] = (byte) (-118);
      byteArray0[7] = (byte)4;
      byteArray0[8] = (byte)32;
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.getNumberOfGaps(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.7516666169315167
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DefaultNucleotideCodec.values();
      DefaultNucleotideCodec.values();
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)64;
      byteArray0[1] = (byte) (-105);
      byteArray0[2] = (byte)90;
      byteArray0[3] = (byte)47;
      byteArray0[4] = (byte) (-97);
      byteArray0[5] = (byte)0;
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec1.getGappedOffsetFor(byteArray0, 12);
      Nucleotide nucleotide0 = Nucleotide.Adenine;
      Set<Nucleotide> set0 = nucleotide0.getAllPossibleAmbiguities();
      DefaultNucleotideCodec defaultNucleotideCodec2 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec2.encode((Collection<Nucleotide>) set0);
      defaultNucleotideCodec1.encode((Collection<Nucleotide>) set0);
      // Undeclared exception!
      defaultNucleotideCodec0.toString(byteArray0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.5232109529528914
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[3];
      Nucleotide nucleotide0 = Nucleotide.Adenine;
      Set<Nucleotide> set0 = nucleotide0.getBasesFor();
      byte[] byteArray1 = defaultNucleotideCodec0.encode((Collection<Nucleotide>) set0);
      defaultNucleotideCodec0.toString(byteArray1);
      LinkedList<Nucleotide> linkedList0 = new LinkedList<Nucleotide>();
      linkedList0.parallelStream();
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec1.encode((Collection<Nucleotide>) linkedList0);
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.iterator(byteArray0);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[6];
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec1.decodedLengthOf(byteArray0);
      Range.of(1L);
      defaultNucleotideCodec0.decode(byteArray0, 1L);
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.ZERO_BASED;
      // Undeclared exception!
      try { 
        Range.parseRange("+", range_CoordinateSystem0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // can not parse + into a Range
         //
         verifyException("org.jcvi.jillion.core.Range", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.0431918705451206
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[8];
      int int0 = 6;
      defaultNucleotideCodec0.getUngappedLength(byteArray0);
      Range range0 = Range.of((long) 6, 1631L);
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.iterator(byteArray0, range0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // range [ 6 .. 1631 ]/0B is out of range of sequence which is only [ 0 .. -1 ]/0B
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.9730014063936125
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)0;
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec1.decodedLengthOf(byteArray0);
      Range.of(4L);
      Range range0 = Range.ofLength(0);
      defaultNucleotideCodec1.iterator(byteArray0, range0);
      int int0 = defaultNucleotideCodec1.getNumberOfGapsUntil(byteArray0, 2146997901);
      assertEquals(0, int0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec0.decodedLengthOf(byteArray0);
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec1.getGapOffsets(byteArray0);
      DefaultNucleotideCodec defaultNucleotideCodec2 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec2.getNumberOfGapsUntil(byteArray0, 0);
      String string0 = defaultNucleotideCodec1.toString(byteArray0);
      assertEquals("", string0);
      
      int int0 = defaultNucleotideCodec1.getNumberOfGapsUntil(byteArray0, 0);
      assertEquals(0, int0);
      
      Nucleotide nucleotide0 = Nucleotide.NotCytosine;
      byte[] byteArray1 = defaultNucleotideCodec0.encode(nucleotide0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)1, (byte)96}, byteArray1);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.607805034342705
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Nucleotide nucleotide0 = Nucleotide.Amino;
      Set<Nucleotide> set0 = nucleotide0.getBasesFor();
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = defaultNucleotideCodec1.encode((Collection<Nucleotide>) set0);
      defaultNucleotideCodec1.toString(byteArray0);
      DefaultNucleotideCodec defaultNucleotideCodec2 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec2.iterator(byteArray0);
      DefaultNucleotideCodec defaultNucleotideCodec3 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec3.getNumberOfGapsUntil(byteArray0, (-622));
      DefaultNucleotideCodec defaultNucleotideCodec4 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec4.getNumberOfGapsUntil(byteArray0, 0);
      // Undeclared exception!
      try { 
        DefaultNucleotideCodec.valueOf("qtpsJi)]-q");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.qtpsJi)]-q
         //
         verifyException("java.lang.Enum", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.7878762280875935
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Nucleotide nucleotide0 = Nucleotide.Gap;
      Set<Nucleotide> set0 = nucleotide0.getBasesFor();
      byte[] byteArray0 = defaultNucleotideCodec0.encode((Collection<Nucleotide>) set0);
      defaultNucleotideCodec0.toString(byteArray0);
      defaultNucleotideCodec0.iterator(byteArray0);
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec1.getGapOffsets(byteArray0);
      DefaultNucleotideCodec defaultNucleotideCodec2 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec2.getNumberOfGapsUntil(byteArray0, 42);
      DefaultNucleotideCodec defaultNucleotideCodec3 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec3.toString(byteArray0);
      DefaultNucleotideCodec defaultNucleotideCodec4 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec4.isGap(byteArray0, 42);
      defaultNucleotideCodec3.getNumberOfGapsUntil(byteArray0, 31);
      defaultNucleotideCodec1.isGap(byteArray0, 42);
      byte[] byteArray1 = new byte[1];
      byteArray1[0] = (byte)48;
      // Undeclared exception!
      try { 
        defaultNucleotideCodec4.getNumberOfGapsUntil(byteArray1, 1);
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
  /*Coverage entropy=2.7886260379670387
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Nucleotide nucleotide0 = Nucleotide.Gap;
      Set<Nucleotide> set0 = nucleotide0.getBasesFor();
      byte[] byteArray0 = defaultNucleotideCodec0.encode((Collection<Nucleotide>) set0);
      defaultNucleotideCodec0.toString(byteArray0);
      defaultNucleotideCodec0.iterator(byteArray0);
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec1.getGapOffsets(byteArray0);
      DefaultNucleotideCodec defaultNucleotideCodec2 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec2.getGapOffsets(byteArray0);
      defaultNucleotideCodec2.getNumberOfGapsUntil(byteArray0, (-541));
      DefaultNucleotideCodec defaultNucleotideCodec3 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec1.toString(byteArray0);
      DefaultNucleotideCodec defaultNucleotideCodec4 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec4.isGap(byteArray0, 0);
      byte[] byteArray1 = new byte[2];
      byteArray1[0] = (byte)14;
      byteArray1[1] = (byte) (-13);
      // Undeclared exception!
      try { 
        defaultNucleotideCodec3.getNumberOfGapsUntil(byteArray1, (-541));
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=2.833213344056216
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Nucleotide nucleotide0 = Nucleotide.Strong;
      Set<Nucleotide> set0 = nucleotide0.getAllPossibleAmbiguities();
      byte[] byteArray0 = defaultNucleotideCodec0.encode((Collection<Nucleotide>) set0);
      defaultNucleotideCodec0.toString(byteArray0);
      Iterator<Nucleotide> iterator0 = defaultNucleotideCodec0.iterator(byteArray0);
      DefaultNucleotideCodec defaultNucleotideCodec1 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec0.getGapOffsets(byteArray0);
      defaultNucleotideCodec1.getNumberOfGapsUntil(byteArray0, 1656);
      DefaultNucleotideCodec defaultNucleotideCodec2 = DefaultNucleotideCodec.INSTANCE;
      defaultNucleotideCodec2.toString(byteArray0);
      defaultNucleotideCodec0.isGap(byteArray0, 1656);
      defaultNucleotideCodec1.getNumberOfGapsUntil(byteArray0, 4);
      int int0 = (-2698);
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.encode(4, iterator0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no more elements
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl", e);
      }
  }
}
