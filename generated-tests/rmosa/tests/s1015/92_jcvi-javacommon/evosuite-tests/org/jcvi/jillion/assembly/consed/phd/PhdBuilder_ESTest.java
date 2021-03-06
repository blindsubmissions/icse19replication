/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 12:10:38 GMT 2018
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
import java.util.function.BiFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.jcvi.jillion.assembly.consed.phd.ArtificialPhd;
import org.jcvi.jillion.assembly.consed.phd.DefaultPhd;
import org.jcvi.jillion.assembly.consed.phd.DefaultPhdReadTag;
import org.jcvi.jillion.assembly.consed.phd.Phd;
import org.jcvi.jillion.assembly.consed.phd.PhdBuilder;
import org.jcvi.jillion.assembly.consed.phd.PhdReadTag;
import org.jcvi.jillion.assembly.consed.phd.PhdWholeReadItem;
import org.jcvi.jillion.core.Range;
import org.jcvi.jillion.core.pos.PositionSequence;
import org.jcvi.jillion.core.qual.QualitySequence;
import org.jcvi.jillion.core.residue.nt.NucleotideSequence;
import org.jcvi.jillion.internal.trace.chromat.BasicChromatogram;
import org.jcvi.jillion.internal.trace.chromat.DefaultChannel;
import org.jcvi.jillion.internal.trace.chromat.DefaultChannelGroup;
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
      String string0 = "z=";
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder("z=", nucleotideSequence0, qualitySequence0);
      int int0 = 1157;
      int int1 = 0;
      // Undeclared exception!
      try { 
        phdBuilder0.fakePeaks(1157, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // peak spacing must be >0
         //
         verifyException("org.jcvi.jillion.assembly.consed.phd.PhdBuilder", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
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
  //Test case number: 2
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
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
  //Test case number: 3
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
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
  //Test case number: 4
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      PhdBuilder phdBuilder0 = null;
      try {
        phdBuilder0 = new PhdBuilder("yN,", nucleotideSequence0, (QualitySequence) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // qualities can not be null
         //
         verifyException("org.jcvi.jillion.assembly.consed.phd.PhdBuilder", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      ArtificialPhd artificialPhd0 = new ArtificialPhd("L'=tNR~/]f}X", nucleotideSequence0, qualitySequence0, 1439);
      PhdBuilder phdBuilder0 = null;
      try {
        phdBuilder0 = new PhdBuilder(artificialPhd0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // initial capacity should be > 0 :0
         //
         verifyException("org.jcvi.jillion.internal.core.util.GrowableShortArray", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.7677614722893296
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L, 0L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder("$d", nucleotideSequence0, qualitySequence0);
      PhdBuilder phdBuilder1 = phdBuilder0.copy();
      phdBuilder0.fakePeaks();
      PhdBuilder phdBuilder2 = phdBuilder0.fakePeaks();
      Phd phd0 = phdBuilder2.build();
      phdBuilder1.copy();
      phdBuilder0.fakePeaks();
      LinkedList<PhdWholeReadItem> linkedList0 = new LinkedList<PhdWholeReadItem>();
      NucleotideSequence nucleotideSequence1 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(nucleotideSequence1).getLength();
      QualitySequence qualitySequence1 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      ArtificialPhd.createNewbler454Phd("$d", nucleotideSequence1, qualitySequence1);
      linkedList0.add((PhdWholeReadItem) null);
      phdBuilder2.wholeReadItems(linkedList0);
      // Undeclared exception!
      try { 
        phd0.getPositionSequence();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // initial capacity should be > 0 :0
         //
         verifyException("org.jcvi.jillion.internal.core.util.GrowableShortArray", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(106L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      ArtificialPhd artificialPhd0 = new ArtificialPhd("L'=tNR~/]f}X", nucleotideSequence0, qualitySequence0, 1439);
      NucleotideSequence nucleotideSequence1 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      QualitySequence qualitySequence1 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L, 0L, 0L, 0L, 0L).when(qualitySequence1).getLength();
      PositionSequence positionSequence0 = artificialPhd0.getPositionSequence();
      DefaultChannel defaultChannel0 = new DefaultChannel(qualitySequence1, positionSequence0);
      DefaultChannelGroup defaultChannelGroup0 = new DefaultChannelGroup(defaultChannel0, defaultChannel0, defaultChannel0, defaultChannel0);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      BasicChromatogram basicChromatogram0 = new BasicChromatogram("L'=tNR~/]f}X", nucleotideSequence1, qualitySequence1, positionSequence0, defaultChannelGroup0, hashMap0);
      PhdBuilder phdBuilder0 = new PhdBuilder(basicChromatogram0);
      LinkedList<PhdWholeReadItem> linkedList0 = new LinkedList<PhdWholeReadItem>();
      PhdBuilder phdBuilder1 = phdBuilder0.wholeReadItems(linkedList0);
      PhdBuilder phdBuilder2 = phdBuilder1.comments(hashMap0);
      // Undeclared exception!
      try { 
        phdBuilder2.peaks(positionSequence0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // peaks and qualities have unequal lengths
         //
         verifyException("org.jcvi.jillion.assembly.consed.phd.PhdBuilder", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(3697L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(3697L).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder("Guanine", nucleotideSequence0, qualitySequence0);
      NucleotideSequence nucleotideSequence1 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(3697L).when(nucleotideSequence1).getLength();
      QualitySequence qualitySequence1 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      Map<String, String> map0 = ZoneId.SHORT_IDS;
      ArtificialPhd artificialPhd0 = new ArtificialPhd("", nucleotideSequence1, qualitySequence1, 0);
      artificialPhd0.getWholeReadItems();
      NucleotideSequence nucleotideSequence2 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      QualitySequence qualitySequence2 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      PositionSequence positionSequence0 = mock(PositionSequence.class, new ViolatedAssumptionAnswer());
      artificialPhd0.getReadTags();
      int int0 = (-411);
      // Undeclared exception!
      try { 
        phdBuilder0.fakePeaks((-411), 2692);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // first peak position must be >0
         //
         verifyException("org.jcvi.jillion.assembly.consed.phd.PhdBuilder", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn((-3833L)).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(1128L).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = null;
      try {
        phdBuilder0 = new PhdBuilder("x`UeZ30's~Z9/", nucleotideSequence0, qualitySequence0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // sequence and qualities have unequal lengths
         //
         verifyException("org.jcvi.jillion.assembly.consed.phd.PhdBuilder", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder("~'H+", nucleotideSequence0, qualitySequence0);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      NucleotideSequence nucleotideSequence1 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      QualitySequence qualitySequence1 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      PhdBuilder phdBuilder1 = phdBuilder0.peaks((PositionSequence) null);
      PhdBuilder phdBuilder2 = phdBuilder1.comments(hashMap0);
      assertSame(phdBuilder2, phdBuilder1);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(2737L, 2737L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(2737L, 0L).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder("", nucleotideSequence0, qualitySequence0);
      phdBuilder0.build();
      PhdBuilder phdBuilder1 = phdBuilder0.fakePeaks();
      PhdBuilder phdBuilder2 = phdBuilder0.fakePeaks();
      phdBuilder2.fakePeaks(92, 31);
      LinkedList<PhdReadTag> linkedList0 = new LinkedList<PhdReadTag>();
      phdBuilder2.readTags(linkedList0);
      Phd phd0 = phdBuilder1.build();
      phdBuilder0.copy();
      NucleotideSequence nucleotideSequence1 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn((long)92).when(nucleotideSequence1).getLength();
      QualitySequence qualitySequence1 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      ArtificialPhd.createNewbler454Phd("", nucleotideSequence1, qualitySequence1);
      PositionSequence positionSequence0 = phd0.getPositionSequence();
      // Undeclared exception!
      try { 
        phdBuilder1.peaks(positionSequence0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // peaks and qualities have unequal lengths
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
}
