/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 07:13:32 GMT 2018
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
      byteArray0[3] = (byte) (-49);
      byteArray0[4] = (byte) (-49);
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.getGapOffsets(byteArray0);
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
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.decode(byteArray0, (-1L));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // index can not be negative: -1
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.getUngappedLength(byteArray0);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[25];
      Nucleotide nucleotide0 = defaultNucleotideCodec0.decode(byteArray0, (byte)14);
      assertEquals(Nucleotide.Gap, nucleotide0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[4];
      int int0 = defaultNucleotideCodec0.getNumberOfGaps(byteArray0);
      assertEquals(0, int0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.decode(byteArray0, (byte)14);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // index 14 corresponds to encodedIndex 11  encodedglyph length is 9
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[13];
      byteArray0[1] = (byte)11;
      byteArray0[7] = (byte)11;
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.getNumberOfGaps(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 13
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
      byte[] byteArray0 = new byte[5];
      int int0 = defaultNucleotideCodec0.getNumberOfGapsUntil(byteArray0, 65);
      assertEquals(0, int0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[5];
      int int0 = defaultNucleotideCodec0.getGappedOffsetFor(byteArray0, (byte)0);
      assertEquals(0, int0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[5];
      byteArray0[2] = (byte)52;
      defaultNucleotideCodec0.getGappedOffsetFor(byteArray0, (byte)0);
      DefaultNucleotideCodec[] defaultNucleotideCodecArray0 = DefaultNucleotideCodec.values();
      assertEquals(1, defaultNucleotideCodecArray0.length);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[5];
      byteArray0[3] = (byte) (-102);
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.getGappedOffsetFor(byteArray0, (byte) (-102));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[5];
      byteArray0[3] = (byte) (-57);
      byteArray0[4] = (byte)78;
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.getGappedOffsetFor(byteArray0, (byte) (-57));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      boolean boolean0 = defaultNucleotideCodec0.isGap(byteArray0, 1);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[8];
      String string0 = defaultNucleotideCodec0.toString(byteArray0);
      assertEquals("", string0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.70805020110221
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Nucleotide nucleotide0 = Nucleotide.Amino;
      Set<Nucleotide> set0 = nucleotide0.getBasesFor();
      byte[] byteArray0 = defaultNucleotideCodec0.encode((Collection<Nucleotide>) set0);
      Iterator<Nucleotide> iterator0 = defaultNucleotideCodec0.iterator(byteArray0);
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.encode(9, iterator0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no more elements
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Range range0 = Range.of((long) 225);
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.iterator(byteArray0, range0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // range [ 225 .. 225 ]/0B is out of range of sequence which is only [ 0 .. -1 ]/0B
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[8];
      byteArray0[3] = (byte)5;
      String string0 = defaultNucleotideCodec0.toString(byteArray0);
      assertEquals("-----", string0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Nucleotide nucleotide0 = Nucleotide.Weak;
      Set<Nucleotide> set0 = nucleotide0.getBasesFor();
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = defaultNucleotideCodec0.encode((Collection<Nucleotide>) set0);
      String string0 = defaultNucleotideCodec0.toString(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)2, (byte)30}, byteArray0);
      assertEquals("AT", string0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[13];
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Range range0 = Range.of((-1024L));
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.iterator(byteArray0, range0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // range [ -1024 .. -1024 ]/0B is out of range of sequence which is only [ 0 .. -1 ]/0B
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      int int0 = 185270293;
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Iterator<Nucleotide> iterator0 = defaultNucleotideCodec0.iterator(byteArray0);
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.encode(185270293, iterator0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no more elements
         //
         verifyException("org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl", e);
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Nucleotide nucleotide0 = Nucleotide.Gap;
      byte[] byteArray0 = defaultNucleotideCodec0.encode(nucleotide0);
      int int0 = defaultNucleotideCodec0.getNumberOfGapsUntil(byteArray0, 255);
      assertEquals(1, int0);
      assertEquals(5, byteArray0.length);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Nucleotide nucleotide0 = Nucleotide.Gap;
      byte[] byteArray0 = defaultNucleotideCodec0.encode(nucleotide0);
      int int0 = defaultNucleotideCodec0.getUngappedOffsetFor(byteArray0, (byte) (-128));
      assertEquals((-128), int0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)1, (byte)0}, byteArray0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Range range0 = Range.ofLength(0L);
      defaultNucleotideCodec0.iterator(byteArray0, range0);
      // Undeclared exception!
      try { 
        DefaultNucleotideCodec.valueOf("klVWv%/1cWn+");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.klVWv%/1cWn+
         //
         verifyException("java.lang.Enum", e);
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[4];
      byteArray0[1] = (byte)8;
      Range range0 = Range.ofLength(32L);
      // Undeclared exception!
      try { 
        defaultNucleotideCodec0.iterator(byteArray0, range0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
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
      byte[] byteArray0 = new byte[13];
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Nucleotide nucleotide0 = defaultNucleotideCodec0.decode(byteArray0, (byte)9);
      assertEquals(Nucleotide.Gap, nucleotide0);
  }
}
