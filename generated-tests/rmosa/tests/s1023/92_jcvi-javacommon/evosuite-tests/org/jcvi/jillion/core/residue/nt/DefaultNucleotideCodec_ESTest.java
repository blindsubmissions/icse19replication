/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 15:46:05 GMT 2018
 */

package org.jcvi.jillion.core.residue.nt;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.BufferOverflowException;
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Nucleotide nucleotide0 = Nucleotide.Amino;
      byte[] byteArray0 = defaultNucleotideCodec0.encode(nucleotide0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)1, (byte) (-96)}, byteArray0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.encode((-8), (Iterator<Nucleotide>) null);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.getUngappedLength((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.ByteBuffer", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.getUngappedOffsetFor(byteArray0, 302);
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
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[5];
      int int0 = defaultNucleotideCodec0.getNumberOfGapsUntil(byteArray0, (byte)0);
      assertEquals(0, int0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[19];
      byteArray0[1] = (byte)20;
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.getNumberOfGaps(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 19
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.decode(byteArray0, (-1073741828));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // index can not be negative: -1073741828
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      LinkedList<Nucleotide> linkedList0 = new LinkedList<Nucleotide>();
      byte[] byteArray0 = defaultNucleotideCodec0.encode((Collection<Nucleotide>) linkedList0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.encode(1, (Iterator<Nucleotide>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.encode(11, (Iterator<Nucleotide>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Nucleotide nucleotide0 = Nucleotide.Keto;
      Set<Nucleotide> set0 = nucleotide0.getBasesFor();
      byte[] byteArray0 = defaultNucleotideCodec0.encode((Collection<Nucleotide>) set0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)2, (byte)46}, byteArray0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[8];
      byteArray0[4] = (byte) (-17);
      byteArray0[3] = (byte) (-17);
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.getGapOffsets(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.decode(byteArray0, 4294967279L);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // index 4294967279 corresponds to encodedIndex 2147483643  encodedglyph length is 7
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[21];
      byteArray0[1] = (byte)14;
      int int0 = defaultNucleotideCodec0.getGappedOffsetFor(byteArray0, (byte)0);
      assertEquals(0, int0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[4];
      byteArray0[3] = (byte)1;
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
  //Test case number: 15
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[7];
      defaultNucleotideCodec0.decodedLengthOf(byteArray0);
      byteArray0[3] = (byte)3;
      defaultNucleotideCodec0.toString(byteArray0);
      byte[] byteArray1 = new byte[1];
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      int int0 = defaultNucleotideCodec0.getGappedOffsetFor(byteArray0, (-2020));
      assertEquals(0, int0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Nucleotide nucleotide0 = defaultNucleotideCodec0.decode(byteArray0, 2L);
      assertEquals(Nucleotide.Gap, nucleotide0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      int int0 = defaultNucleotideCodec0.getNumberOfGaps(byteArray0);
      assertEquals(0, int0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Iterator<Nucleotide> iterator0 = defaultNucleotideCodec0.iterator(byteArray0);
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.encode(423, iterator0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no more elements
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Range range0 = Range.of((-7L));
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.iterator(byteArray0, range0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // range [ -7 .. -7 ]/0B is out of range of sequence which is only [ 0 .. -1 ]/0B
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[4];
      boolean boolean0 = defaultNucleotideCodec0.isGap(byteArray0, (-1073741823));
      assertFalse(boolean0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[9];
      byteArray0[3] = (byte)2;
      defaultNucleotideCodec0.toString(byteArray0);
      // Undeclared exception!
      try { 
        DefaultNucleotideCodec.valueOf("--");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.--
         //
         verifyException("java.lang.Enum", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      String string0 = defaultNucleotideCodec0.toString(byteArray0);
      assertEquals("", string0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[19];
      byteArray0[1] = (byte) (-110);
      byteArray0[4] = (byte) (-110);
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.getGappedOffsetFor(byteArray0, (byte) (-110));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 19
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl", e);
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte)10;
      byteArray0[4] = (byte)16;
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.getNumberOfGaps(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl", e);
      }
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Nucleotide nucleotide0 = defaultNucleotideCodec0.decode(byteArray0, 9223372036854775807L);
      assertEquals(Nucleotide.Gap, nucleotide0);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Range range0 = Range.of(0L, 0L);
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.iterator(byteArray0, range0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // range [ 0 .. 0 ]/0B is out of range of sequence which is only [ 0 .. -1 ]/0B
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl", e);
      }
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Range range0 = Range.ofLength(0L);
      Iterator<Nucleotide> iterator0 = defaultNucleotideCodec0.iterator(byteArray0, range0);
      assertNotNull(iterator0);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[5];
      byteArray0[3] = (byte)2;
      Byte byte0 = new Byte((byte)0);
      int int0 = defaultNucleotideCodec0.getNumberOfGapsUntil(byteArray0, (int) byte0);
      assertEquals(1, int0);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[20];
      byteArray0[2] = (byte)75;
      Range range0 = Range.of((long) (byte)69, (long) (byte)75);
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.iterator(byteArray0, range0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 38
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl", e);
      }
  }

  /**
  //Test case number: 31
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[13];
      byteArray0[3] = (byte)10;
      byte[] byteArray1 = new byte[1];
      boolean boolean0 = defaultNucleotideCodec0.isGap(byteArray0, (byte)0);
      assertTrue(boolean0);
  }
}
