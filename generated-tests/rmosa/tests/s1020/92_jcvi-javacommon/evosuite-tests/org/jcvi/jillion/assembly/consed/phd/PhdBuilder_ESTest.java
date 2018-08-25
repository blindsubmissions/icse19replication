/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 14:31:27 GMT 2018
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
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jcvi.jillion.assembly.consed.phd.ArtificialPhd;
import org.jcvi.jillion.assembly.consed.phd.DefaultPhd;
import org.jcvi.jillion.assembly.consed.phd.DefaultPhdReadTag;
import org.jcvi.jillion.assembly.consed.phd.Phd;
import org.jcvi.jillion.assembly.consed.phd.PhdBuilder;
import org.jcvi.jillion.assembly.consed.phd.PhdReadTag;
import org.jcvi.jillion.assembly.consed.phd.PhdWholeReadItem;
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
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
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
  //Test case number: 1
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn((-3609L)).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn((-3609L)).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder("(Ue|2;?%+zlx/3;_/+q", nucleotideSequence0, qualitySequence0);
      PositionSequence positionSequence0 = null;
      // Undeclared exception!
      try { 
        phdBuilder0.fakePeaks((-560), 1838);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // first peak position must be >0
         //
         verifyException("org.jcvi.jillion.assembly.consed.phd.PhdBuilder", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder("vB&2iu\"}hQh", nucleotideSequence0, qualitySequence0);
      // Undeclared exception!
      try { 
        phdBuilder0.wholeReadItems((List<PhdWholeReadItem>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder("id can not be null", nucleotideSequence0, qualitySequence0);
      PhdBuilder phdBuilder1 = phdBuilder0.copy();
      assertFalse(phdBuilder1.equals((Object)phdBuilder0));
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn((-98L), 0L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn((-98L)).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder("vB&2iu\"}hQh", nucleotideSequence0, qualitySequence0);
      phdBuilder0.fakePeaks();
      phdBuilder0.build();
      PhdBuilder phdBuilder1 = phdBuilder0.peaks((PositionSequence) null);
      assertSame(phdBuilder0, phdBuilder1);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
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
  //Test case number: 6
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn((-98L)).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn((-98L)).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder("vB&2iu\"}hQh", nucleotideSequence0, qualitySequence0);
      Phd phd0 = phdBuilder0.build();
      assertEquals("vB&2iu\"}hQh", phd0.getId());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(9223372036854775807L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(9223372036854775807L).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder("(Ue|2;?%+zlx/3;_/+q", nucleotideSequence0, qualitySequence0);
      PositionSequence positionSequence0 = null;
      HashMap<String, String> hashMap0 = new HashMap<String, String>(128, 9223372036854775807L);
      // Undeclared exception!
      try { 
        phdBuilder0.comments((Map<String, String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.HashMap", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      PhdBuilder phdBuilder0 = null;
      try {
        phdBuilder0 = new PhdBuilder("ojvzI<{|", nucleotideSequence0, (QualitySequence) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // qualities can not be null
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
  //Test case number: 10
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
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
  //Test case number: 11
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(1358L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = null;
      try {
        phdBuilder0 = new PhdBuilder("positions must all have the same length", nucleotideSequence0, qualitySequence0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // sequence and qualities have unequal lengths
         //
         verifyException("org.jcvi.jillion.assembly.consed.phd.PhdBuilder", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn((-98L)).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn((-98L)).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder("vB&2iu\"}hQh", nucleotideSequence0, qualitySequence0);
      phdBuilder0.fakePeaks();
      LinkedList<PhdReadTag> linkedList0 = new LinkedList<PhdReadTag>();
      phdBuilder0.readTags(linkedList0);
      // Undeclared exception!
      try { 
        phdBuilder0.fakePeaks(1030, (-265));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // peak spacing must be >0
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
      doReturn(6125L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      ArtificialPhd artificialPhd0 = new ArtificialPhd("(Ue|2;?%+zlx/3;_/+q", nucleotideSequence0, qualitySequence0, 19);
      PositionSequence positionSequence0 = artificialPhd0.getPositionSequence();
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)15;
      byteArray0[1] = (byte)12;
      short[] shortArray0 = new short[5];
      shortArray0[0] = (short) (byte)12;
      shortArray0[1] = (short) (byte)15;
      shortArray0[2] = (short) (byte)12;
      shortArray0[3] = (short) (byte)15;
      shortArray0[4] = (short) (byte)15;
      DefaultChannel defaultChannel0 = new DefaultChannel(byteArray0, shortArray0);
      DefaultChannelGroup defaultChannelGroup0 = new DefaultChannelGroup(defaultChannel0, defaultChannel0, defaultChannel0, defaultChannel0);
      Map<String, String> map0 = artificialPhd0.getComments();
      BasicChromatogram basicChromatogram0 = new BasicChromatogram("n'Ca^f#GgZ", nucleotideSequence0, qualitySequence0, positionSequence0, defaultChannelGroup0, map0);
      PhdBuilder phdBuilder0 = new PhdBuilder(basicChromatogram0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Map<String, String> map0 = ZoneId.SHORT_IDS;
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      NucleotideSequence nucleotideSequence1 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn((long)707).when(nucleotideSequence1).getLength();
      QualitySequence qualitySequence1 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      ArtificialPhd artificialPhd0 = new ArtificialPhd("", nucleotideSequence1, qualitySequence1, 707);
      ArtificialPhd.createNewbler454Phd("", nucleotideSequence0, qualitySequence0);
      PositionSequence positionSequence0 = artificialPhd0.getPositionSequence();
      NucleotideSequence nucleotideSequence2 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      QualitySequence qualitySequence2 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(qualitySequence2).getLength();
      DefaultPhd defaultPhd0 = new DefaultPhd((String) null, nucleotideSequence2, qualitySequence2, (PositionSequence) null, map0);
      PhdBuilder phdBuilder0 = new PhdBuilder(defaultPhd0);
      // Undeclared exception!
      try { 
        phdBuilder0.peaks(positionSequence0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // peaks and qualities have unequal lengths
         //
         verifyException("org.jcvi.jillion.assembly.consed.phd.PhdBuilder", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Map<String, String> map0 = new HashMap<String, String>();
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(198L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(198L, 0L).when(qualitySequence0).getLength();
      NucleotideSequence nucleotideSequence1 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn((long)707).when(nucleotideSequence1).getLength();
      ArtificialPhd artificialPhd0 = new ArtificialPhd("", nucleotideSequence1, qualitySequence0, 707);
      QualitySequence qualitySequence1 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      ArtificialPhd artificialPhd1 = ArtificialPhd.createNewbler454Phd("Ru,{", nucleotideSequence0, qualitySequence1);
      PositionSequence positionSequence0 = artificialPhd1.getPositionSequence();
      NucleotideSequence nucleotideSequence2 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      QualitySequence qualitySequence2 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      DefaultPhd defaultPhd0 = new DefaultPhd("Ru,{", nucleotideSequence2, qualitySequence2, positionSequence0, map0);
      PhdBuilder phdBuilder0 = new PhdBuilder(artificialPhd0);
      phdBuilder0.peaks(positionSequence0);
      PositionSequence positionSequence1 = artificialPhd1.getPositionSequence();
      // Undeclared exception!
      try { 
        phdBuilder0.peaks(positionSequence1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // peaks and qualities have unequal lengths
         //
         verifyException("org.jcvi.jillion.assembly.consed.phd.PhdBuilder", e);
      }
  }
}