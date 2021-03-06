/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 10:56:48 GMT 2018
 */

package org.jcvi.jillion.assembly.consed.phd;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.ZoneId;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jcvi.jillion.assembly.consed.phd.ArtificialPhd;
import org.jcvi.jillion.assembly.consed.phd.Phd;
import org.jcvi.jillion.assembly.consed.phd.PhdBuilder;
import org.jcvi.jillion.assembly.consed.phd.PhdReadTag;
import org.jcvi.jillion.assembly.consed.phd.PhdWholeReadItem;
import org.jcvi.jillion.core.pos.PositionSequence;
import org.jcvi.jillion.core.qual.QualitySequence;
import org.jcvi.jillion.core.residue.nt.NucleotideSequence;
import org.jcvi.jillion.trace.chromat.Chromatogram;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PhdBuilder_ESTest extends PhdBuilder_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn((-9223372036854775808L)).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn((-9223372036854775808L)).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder("", nucleotideSequence0, qualitySequence0);
      NucleotideSequence nucleotideSequence1 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(nucleotideSequence1).getLength();
      QualitySequence qualitySequence1 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      ArtificialPhd artificialPhd0 = ArtificialPhd.createNewbler454Phd("a)", nucleotideSequence1, qualitySequence1);
      List<PhdWholeReadItem> list0 = artificialPhd0.getWholeReadItems();
      NucleotideSequence nucleotideSequence2 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(nucleotideSequence2).getLength();
      QualitySequence qualitySequence2 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      Map<String, String> map0 = ZoneId.SHORT_IDS;
      ArtificialPhd artificialPhd1 = new ArtificialPhd("a)", nucleotideSequence2, qualitySequence2, map0, list0, (List<PhdReadTag>) null, 325);
      Object object0 = new Object();
      artificialPhd1.equals("");
      Map<String, String> map1 = new HashMap<String, String>();
      phdBuilder0.comments(map0);
      // Undeclared exception!
      try { 
        artificialPhd0.getPositionSequence();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // initial capacity should be > 0 :0
         //
         verifyException("org.jcvi.jillion.internal.core.util.GrowableShortArray", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder("3\"%rv:sf:Uj(", nucleotideSequence0, qualitySequence0);
      PhdBuilder phdBuilder1 = phdBuilder0.fakePeaks();
      assertSame(phdBuilder1, phdBuilder0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(1050L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(1050L).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder("Ez6QHN", nucleotideSequence0, qualitySequence0);
      // Undeclared exception!
      try { 
        phdBuilder0.fakePeaks(15, (-2146797111));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // peak spacing must be >0
         //
         verifyException("org.jcvi.jillion.assembly.consed.phd.PhdBuilder", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn((-1L)).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn((-1L)).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder("[Pu*K`aK-U|", nucleotideSequence0, qualitySequence0);
      int int0 = 2143806449;
      PhdBuilder phdBuilder1 = phdBuilder0.fakePeaks(2143806449, 2143806449);
      phdBuilder1.fakePeaks(3677, 2140179281);
      // Undeclared exception!
      try { 
        phdBuilder0.fakePeaks(2143806449, (-814));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // peak spacing must be >0
         //
         verifyException("org.jcvi.jillion.assembly.consed.phd.PhdBuilder", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(4253L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      Map<String, String> map0 = new HashMap<String, String>();
      ArtificialPhd artificialPhd0 = ArtificialPhd.createNewbler454Phd("", nucleotideSequence0, qualitySequence0, map0);
      PhdBuilder phdBuilder0 = new PhdBuilder(artificialPhd0);
      LinkedList<PhdReadTag> linkedList0 = new LinkedList<PhdReadTag>();
      PhdBuilder phdBuilder1 = phdBuilder0.readTags(linkedList0);
      assertSame(phdBuilder0, phdBuilder1);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PhdBuilder phdBuilder0 = null;
      try {
        phdBuilder0 = new PhdBuilder((Phd) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // phd to copy can not be null
         //
         verifyException("org.jcvi.jillion.assembly.consed.phd.PhdBuilder", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder("Cytosine", nucleotideSequence0, qualitySequence0);
      LinkedList<PhdWholeReadItem> linkedList0 = new LinkedList<PhdWholeReadItem>();
      PhdBuilder phdBuilder1 = phdBuilder0.wholeReadItems(linkedList0);
      assertSame(phdBuilder1, phdBuilder0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(5L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(5L).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder("5&#9T]7i-LR9y0?\u0003H1", nucleotideSequence0, qualitySequence0);
      // Undeclared exception!
      try { 
        phdBuilder0.fakePeaks((-1901), 789);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // first peak position must be >0
         //
         verifyException("org.jcvi.jillion.assembly.consed.phd.PhdBuilder", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(5L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(5L).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder("5&#9T]7i-LR9y0?\u0003H1", nucleotideSequence0, qualitySequence0);
      PhdBuilder phdBuilder1 = phdBuilder0.copy();
      assertFalse(phdBuilder1.equals((Object)phdBuilder0));
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.5004024235381879
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder("", nucleotideSequence0, qualitySequence0);
      phdBuilder0.build();
      NucleotideSequence nucleotideSequence1 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(nucleotideSequence1).getLength();
      QualitySequence qualitySequence1 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      ArtificialPhd artificialPhd0 = ArtificialPhd.createNewbler454Phd("", nucleotideSequence1, qualitySequence1);
      // Undeclared exception!
      try { 
        artificialPhd0.getPositionSequence();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // initial capacity should be > 0 :0
         //
         verifyException("org.jcvi.jillion.internal.core.util.GrowableShortArray", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PhdBuilder phdBuilder0 = null;
      try {
        phdBuilder0 = new PhdBuilder((Chromatogram) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // chromatogram can not be null
         //
         verifyException("org.jcvi.jillion.assembly.consed.phd.PhdBuilder", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      PhdBuilder phdBuilder0 = null;
      try {
        phdBuilder0 = new PhdBuilder("(d+)s*,s*(d+)", nucleotideSequence0, (QualitySequence) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // qualities can not be null
         //
         verifyException("org.jcvi.jillion.assembly.consed.phd.PhdBuilder", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      PhdBuilder phdBuilder0 = null;
      try {
        phdBuilder0 = new PhdBuilder((String) null, nucleotideSequence0, qualitySequence0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // id can not be null
         //
         verifyException("org.jcvi.jillion.assembly.consed.phd.PhdBuilder", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(2853L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn((-2034L)).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = null;
      try {
        phdBuilder0 = new PhdBuilder("1<2wAC", nucleotideSequence0, qualitySequence0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // sequence and qualities have unequal lengths
         //
         verifyException("org.jcvi.jillion.assembly.consed.phd.PhdBuilder", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      PhdBuilder phdBuilder0 = null;
      try {
        phdBuilder0 = new PhdBuilder("", (NucleotideSequence) null, qualitySequence0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // sequence can not be null
         //
         verifyException("org.jcvi.jillion.assembly.consed.phd.PhdBuilder", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn((-1L), 0L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn((-1L)).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder("[Pu*K`aK-U|", nucleotideSequence0, qualitySequence0);
      phdBuilder0.fakePeaks(3677, 2140179281);
      phdBuilder0.fakePeaks(2143806449, 2140179281);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      PhdBuilder phdBuilder1 = phdBuilder0.fakePeaks(2143806449, 2143806449);
      phdBuilder1.build();
      System.setCurrentTimeMillis(2143806449);
      System.setCurrentTimeMillis(2029L);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.6829081047004717
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(4294967295L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(4294967295L, 0L).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder("(", nucleotideSequence0, qualitySequence0);
      PositionSequence positionSequence0 = null;
      PhdBuilder phdBuilder1 = phdBuilder0.peaks((PositionSequence) null);
      NucleotideSequence nucleotideSequence1 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(3909L).when(nucleotideSequence1).getLength();
      QualitySequence qualitySequence1 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      ArtificialPhd artificialPhd0 = new ArtificialPhd("(", nucleotideSequence1, qualitySequence1, 498);
      artificialPhd0.getPositionSequence();
      PositionSequence positionSequence1 = artificialPhd0.getPositionSequence();
      // Undeclared exception!
      try { 
        phdBuilder1.peaks(positionSequence1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // peaks and qualities have unequal lengths
         //
         verifyException("org.jcvi.jillion.assembly.consed.phd.PhdBuilder", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(4253L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(4253L).when(qualitySequence0).getLength();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      ArtificialPhd artificialPhd0 = ArtificialPhd.createNewbler454Phd("#?{z $J)@B'[VTXI75", nucleotideSequence0, qualitySequence0, (Map<String, String>) hashMap0);
      PhdBuilder phdBuilder0 = new PhdBuilder(artificialPhd0);
      LinkedList<PhdReadTag> linkedList0 = new LinkedList<PhdReadTag>();
      PositionSequence positionSequence0 = artificialPhd0.getPositionSequence();
      phdBuilder0.peaks(positionSequence0);
      System.setCurrentTimeMillis(4253L);
      System.setCurrentTimeMillis(4253L);
      System.setCurrentTimeMillis(4253L);
  }
}
