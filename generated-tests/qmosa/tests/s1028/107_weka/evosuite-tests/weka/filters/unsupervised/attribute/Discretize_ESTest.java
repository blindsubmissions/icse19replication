/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 16:09:31 GMT 2018
 */

package weka.filters.unsupervised.attribute;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import weka.core.Attribute;
import weka.core.BinarySparseInstance;
import weka.core.DenseInstance;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.Range;
import weka.core.SparseInstance;
import weka.filters.AllFilter;
import weka.filters.Filter;
import weka.filters.MultiFilter;
import weka.filters.unsupervised.attribute.Discretize;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Discretize_ESTest extends Discretize_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.m_UseBinNumbers = true;
      discretize0.getOptions();
      discretize0.getRevision();
      Range range0 = null;
      try {
        range0 = new Range((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.Range", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Discretize discretize0 = new Discretize("");
      String[] stringArray0 = new String[9];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "*}7)q3";
      stringArray0[4] = "";
      stringArray0[5] = "";
      stringArray0[6] = "";
      stringArray0[7] = "";
      stringArray0[8] = "";
      // Undeclared exception!
      try { 
        discretize0.batchFinished();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No input instance format defined
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.9683918915419634
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.getOptions();
      discretize0.getInvertSelection();
      discretize0.setDesiredWeightOfInstancesPerInterval(1081.26711202785);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "\nEmpty dataset:\n";
      stringArray0[1] = "Name";
      discretize0.m_NumBins = 1487;
      Discretize.main(stringArray0);
      discretize0.getUseEqualFrequency();
      discretize0.setUseEqualFrequency(true);
      // Undeclared exception!
      try { 
        discretize0.calculateCutPointsByEqualFrequencyBinning(7);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.Instances", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.setOutputFormat();
      discretize0.m_UseBinNumbers = false;
      discretize0.makeBinaryTipText();
      int int0 = 8;
      discretize0.getCutPoints(8);
      discretize0.useBinNumbersTipText();
      discretize0.setOutputFormat();
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (double) 8;
      doubleArray0[1] = (double) 8;
      doubleArray0[2] = (double) 8;
      doubleArray0[3] = (double) 8;
      doubleArray0[4] = (double) 8;
      SparseInstance sparseInstance0 = new SparseInstance(8, doubleArray0);
      // Undeclared exception!
      try { 
        sparseInstance0.relationalValue(8);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // DenseInstance doesn't have access to a dataset!
         //
         verifyException("weka.core.AbstractInstance", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      int int0 = discretize0.getBins();
      assertEquals(10, int0);
      
      discretize0.toString();
      discretize0.listOptions();
      String string0 = discretize0.getRevision();
      assertEquals("8964", string0);
      
      discretize0.setDesiredWeightOfInstancesPerInterval((-1.0));
      String string1 = discretize0.desiredWeightOfInstancesPerIntervalTipText();
      assertEquals("Sets the desired weight of instances per interval for equal-frequency binning.", string1);
      
      int[] intArray0 = new int[4];
      intArray0[0] = 10;
      intArray0[1] = 10;
      intArray0[2] = 10;
      intArray0[3] = 10;
      discretize0.setAttributeIndicesArray(intArray0);
      assertFalse(discretize0.getFindNumBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getUseBinNumbers());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.setMakeBinary(true);
      discretize0.binsTipText();
      discretize0.binsTipText();
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-1.0);
      doubleArray0[1] = (-1.0);
      doubleArray0[2] = (-1.0);
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance((-1.0), doubleArray0);
      ArrayList<String> arrayList0 = new ArrayList<String>();
      Attribute attribute0 = new Attribute("Number of bins.", arrayList0, 0);
      binarySparseInstance0.toString(attribute0, 0);
      BinarySparseInstance binarySparseInstance1 = new BinarySparseInstance((SparseInstance) binarySparseInstance0);
      AllFilter allFilter0 = new AllFilter();
      // Undeclared exception!
      try { 
        allFilter0.getOutputFormat();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // No output format defined.
         //
         verifyException("weka.filters.Filter", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.setUseEqualFrequency(false);
      discretize0.m_DiscretizeCols = null;
      Filter.makeCopies(discretize0, 123);
      discretize0.getDesiredWeightOfInstancesPerInterval();
      discretize0.attributeIndicesTipText();
      discretize0.setMakeBinary(false);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "Specify range of attributes to act on. This is a comma separated list of attribute indices, with \"first\" and \"last\" valid values. Specify an inclusive range with \"-\". E.g: \"first-3,5,6-10,last\".";
      stringArray0[1] = "Specify range of attributes to act on. This is a comma separated list of attribute indices, with \"first\" and \"last\" valid values. Specify an inclusive range with \"-\". E.g: \"first-3,5,6-10,last\".";
      stringArray0[2] = "Specify range of attributes to act on. This is a comma separated list of attribute indices, with \"first\" and \"last\" valid values. Specify an inclusive range with \"-\". E.g: \"first-3,5,6-10,last\".";
      stringArray0[3] = "Specify range of attributes to act on. This is a comma separated list of attribute indices, with \"first\" and \"last\" valid values. Specify an inclusive range with \"-\". E.g: \"first-3,5,6-10,last\".";
      stringArray0[4] = "Specify range of attributes to act on. This is a comma separated list of attribute indices, with \"first\" and \"last\" valid values. Specify an inclusive range with \"-\". E.g: \"first-3,5,6-10,last\".";
      Filter.runFilter(discretize0, stringArray0);
      try { 
        discretize0.setInputFormat((Instances) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.filters.Filter", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      assertFalse(discretize0.getFindNumBins());
      
      discretize0.setFindNumBins(true);
      discretize0.findNumBinsTipText();
      assertTrue(discretize0.getFindNumBins());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Discretize discretize0 = new Discretize("Specify range of attributes to act on. This is a comma separated list of attribute indices, with \"first\" and \"last\" valid values. Specify an inclusive range with \"-\". E.g: \"first-3,5,6-10,last\".");
      discretize0.m_ClassIndex = 0;
      discretize0.makeBinaryTipText();
      discretize0.getCutPoints((-1258));
      discretize0.globalInfo();
      int[] intArray0 = new int[4];
      intArray0[0] = 0;
      intArray0[1] = (-1258);
      intArray0[2] = (-36);
      intArray0[3] = 0;
      discretize0.setAttributeIndicesArray(intArray0);
      discretize0.setUseBinNumbers(false);
      discretize0.setDesiredWeightOfInstancesPerInterval(2018.0);
      discretize0.invertSelectionTipText();
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = 2018.0;
      doubleArray0[2] = (double) (-1258);
      doubleArray0[3] = (double) 0;
      DenseInstance denseInstance0 = new DenseInstance((-1258), doubleArray0);
      // Undeclared exception!
      try { 
        discretize0.input(denseInstance0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No input instance format defined
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.getRevision();
      discretize0.setBins((-1115));
      discretize0.m_FindNumBins = true;
      discretize0.setAttributeIndices("");
      discretize0.useEqualFrequencyTipText();
      discretize0.setBins(1982);
      discretize0.m_FindNumBins = true;
      discretize0.setUseEqualFrequency(false);
      discretize0.getBins();
      // Undeclared exception!
      try { 
        discretize0.calculateCutPoints();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.3958857213716516
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Discretize discretize0 = new Discretize("");
      int int0 = (-1);
      discretize0.m_NumBins = (-1);
      discretize0.useEqualFrequencyTipText();
      discretize0.getOptions();
      discretize0.setInvertSelection(true);
      boolean boolean0 = true;
      discretize0.setMakeBinary(true);
      discretize0.getInvertSelection();
      // Undeclared exception!
      try { 
        discretize0.calculateCutPointsByEqualWidthBinning((-1766));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.setUseEqualFrequency(true);
      discretize0.getDesiredWeightOfInstancesPerInterval();
      Discretize discretize1 = new Discretize("first-last");
      discretize0.setMakeBinary(true);
      MultiFilter multiFilter0 = new MultiFilter();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "first-last";
      Filter.runFilter(multiFilter0, stringArray0);
      try { 
        discretize0.setInputFormat((Instances) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.filters.Filter", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      Discretize discretize1 = new Discretize();
      discretize1.setUseEqualFrequency(true);
      Discretize discretize2 = new Discretize("0Rqn");
      discretize2.getDesiredWeightOfInstancesPerInterval();
      Discretize discretize3 = new Discretize("hh0(r>@Cpm");
      discretize0.setMakeBinary(false);
      MultiFilter multiFilter0 = new MultiFilter();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "0Rqn";
      stringArray0[1] = "hh0(r>@Cpm";
      stringArray0[2] = "hh0(r>@Cpm";
      stringArray0[3] = "hh0(r>@Cpm";
      stringArray0[4] = "-M";
      stringArray0[5] = "hh0(r>@Cpm";
      stringArray0[6] = "0Rqn";
      stringArray0[7] = "0Rqn";
      Filter.runFilter(discretize2, stringArray0);
      try { 
        discretize0.setInputFormat((Instances) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.filters.Filter", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.4260151319598084
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      assertFalse(discretize0.getUseEqualFrequency());
      
      discretize0.setUseEqualFrequency(true);
      discretize0.setOutputFormat();
      discretize0.getOptions();
      assertTrue(discretize0.getUseEqualFrequency());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.8133554045006157
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.setUseEqualFrequency(true);
      discretize0.getDesiredWeightOfInstancesPerInterval();
      Discretize discretize1 = new Discretize();
      discretize1.setAttributeIndices("first-laUst");
      discretize0.setMakeBinary(true);
      MultiFilter multiFilter0 = new MultiFilter();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "first-laUst";
      Filter.runFilter(multiFilter0, stringArray0);
      discretize0.isFirstBatchDone();
      discretize1.getUseEqualFrequency();
      Discretize discretize2 = new Discretize();
      discretize0.getOptions();
      Discretize discretize3 = new Discretize("first-laUst");
      discretize2.invertSelectionTipText();
      discretize3.getCapabilities();
      // Undeclared exception!
      try { 
        discretize3.findNumBins(606);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=3.0280290733074104
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Discretize discretize0 = new Discretize("/");
      Filter.makeCopy(discretize0);
      int int0 = (-787);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      Filter.makeCopy(discretize0);
      discretize0.setFindNumBins(false);
      discretize0.getBinRangesString((-787));
      String[] stringArray0 = discretize0.getOptions();
      discretize0.setOptions(stringArray0);
      // Undeclared exception!
      try { 
        discretize0.calculateCutPointsByEqualWidthBinning((-787));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.458311329683084
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.m_IgnoreClass = true;
      discretize0.getOptions();
      // Undeclared exception!
      try { 
        discretize0.input((Instance) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No input instance format defined
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Discretize discretize0 = new Discretize("\tSpecifies list of columns to Discretize. First and last are valid indexes.\n\t(default: first-last)");
      double[][] doubleArray0 = new double[8][5];
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = 328.64852861;
      doubleArray1[1] = (double) (-1591);
      doubleArray1[2] = (double) (-1591);
      doubleArray1[3] = (double) (-1591);
      doubleArray1[4] = (double) (-1591);
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[4];
      doubleArray2[0] = (double) (-1591);
      doubleArray2[1] = 328.64852861;
      doubleArray2[2] = (double) (-1591);
      doubleArray2[3] = 1469.50316374;
      doubleArray0[1] = doubleArray2;
      double[] doubleArray3 = new double[9];
      doubleArray3[0] = 328.64852861;
      doubleArray3[1] = 328.64852861;
      doubleArray3[2] = (double) (-1591);
      doubleArray3[3] = 1469.50316374;
      doubleArray3[4] = 328.64852861;
      doubleArray3[5] = 1469.50316374;
      doubleArray3[6] = (double) (-1591);
      doubleArray3[7] = 328.64852861;
      doubleArray3[8] = (double) (-1591);
      doubleArray0[2] = doubleArray3;
      double[] doubleArray4 = new double[9];
      doubleArray4[0] = (-917.765740618);
      doubleArray4[1] = (double) (-1591);
      doubleArray4[2] = 0.0;
      doubleArray4[3] = 328.64852861;
      doubleArray4[4] = 328.64852861;
      doubleArray4[5] = 1469.50316374;
      doubleArray4[6] = 328.64852861;
      doubleArray4[7] = (double) (-1591);
      doubleArray4[8] = 492.151333;
      doubleArray0[3] = doubleArray4;
      double[] doubleArray5 = new double[7];
      doubleArray5[0] = 328.64852861;
      doubleArray5[1] = (-1565.488541487);
      doubleArray5[2] = 1469.50316374;
      doubleArray5[3] = 10.0;
      doubleArray5[4] = (-917.765740618);
      doubleArray5[5] = 0.0;
      doubleArray5[6] = 0.0;
      doubleArray0[4] = doubleArray5;
      double[] doubleArray6 = new double[2];
      doubleArray6[0] = (-1.7976931348623157E308);
      doubleArray6[1] = 10.0;
      doubleArray0[5] = doubleArray6;
      double[] doubleArray7 = new double[1];
      doubleArray7[0] = 0.0;
      doubleArray0[6] = doubleArray7;
      double[] doubleArray8 = new double[6];
      doubleArray8[0] = 492.151333;
      doubleArray8[1] = 0.0;
      doubleArray8[2] = 2371.959;
      doubleArray8[3] = 492.151333;
      doubleArray8[4] = 0.0;
      doubleArray8[5] = (-1.7976931348623157E308);
      doubleArray0[7] = doubleArray8;
      discretize0.m_CutPoints = doubleArray0;
      // Undeclared exception!
      try { 
        discretize0.getCutPoints((-1591));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1591
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.5209026864206248
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.m_FindNumBins = true;
      discretize0.getOptions();
      discretize0.getInvertSelection();
      discretize0.setDesiredWeightOfInstancesPerInterval(1081.26711202785);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "\nEmpty dataset:\n";
      stringArray0[1] = "Name";
      discretize0.m_NumBins = 1487;
      Discretize.main(stringArray0);
      discretize0.getUseEqualFrequency();
      discretize0.setUseEqualFrequency(true);
      // Undeclared exception!
      try { 
        discretize0.calculateCutPointsByEqualFrequencyBinning(7);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.Instances", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.532591160801121
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.setMakeBinary(true);
      discretize0.setUseEqualFrequency(true);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "fDq,@k(ZU*^Z:!o3");
      discretize0.setOutputFormat();
      discretize0.setInvertSelection(true);
      discretize0.getOptions();
      // Undeclared exception!
      try { 
        discretize0.batchFinished();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No input instance format defined
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }
}
