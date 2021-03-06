/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 15:57:57 GMT 2018
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
import org.evosuite.runtime.util.SystemInUtil;
import org.junit.runner.RunWith;
import weka.core.Attribute;
import weka.core.BinarySparseInstance;
import weka.core.Instance;
import weka.core.Instances;
import weka.filters.AllFilter;
import weka.filters.Filter;
import weka.filters.unsupervised.attribute.Discretize;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Discretize_ESTest extends Discretize_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "";
      stringArray0[1] = "7~oy!";
      stringArray0[2] = "}EW iB)uHH&-qMb";
      stringArray0[3] = "{?p]ev";
      stringArray0[4] = "    for (i = 0 ; i < inst.numAttributes(); i++) {\n";
      stringArray0[5] = "";
      stringArray0[6] = "   * @param instanceInfo the format of the data to convert\n";
      stringArray0[7] = "";
      Discretize.main(stringArray0);
      Discretize discretize0 = new Discretize();
      discretize0.m_NumBins = 0;
      discretize0.m_NumBins = 0;
      discretize0.setOutputFormat();
      // Undeclared exception!
      try { 
        discretize0.findNumBins(10);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Discretize discretize0 = new Discretize("Specify range of attributes to act on. This is a comma separated list of attribute indices, with \"first\" and \"last\" valid values. Specify an inclusive range with \"-\". E.g: \"first-3,5,6-10,last\".");
      discretize0.getRevision();
      discretize0.getBinRangesString(2230);
      discretize0.getAttributeIndices();
      discretize0.getBinRangesString(68);
      discretize0.getCapabilities();
      discretize0.desiredWeightOfInstancesPerIntervalTipText();
      double[] doubleArray0 = new double[0];
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance(0.0, doubleArray0);
      binarySparseInstance0.dataset();
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
  //Test case number: 2
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Discretize discretize0 = new Discretize("r/g\"RthBF`,gl3$-(");
      String string0 = discretize0.useEqualFrequencyTipText();
      assertEquals("If set to true, equal-frequency binning will be used instead of equal-width binning.", string0);
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getFindNumBins());
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getUseEqualFrequency());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Discretize discretize0 = new Discretize("");
      discretize0.setUseBinNumbers(false);
      discretize0.setMakeBinary(false);
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
  //Test case number: 4
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Discretize discretize0 = new Discretize();
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
  //Test case number: 5
  /*Coverage entropy=2.70805020110221
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "xv^{M\"K-0";
      stringArray0[1] = ":'CbzW@6BCY{wtjQx)";
      stringArray0[2] = "&>lB,C$6El3s";
      stringArray0[3] = "m=,;";
      stringArray0[4] = "S,On{uD'i [T]1`.";
      discretize0.m_MakeBinary = true;
      stringArray0[5] = "M8$D2|VIYy";
      discretize0.setOptions(stringArray0);
      discretize0.m_DesiredWeightOfInstancesPerInterval = (-1.0);
      discretize0.m_MakeBinary = false;
      discretize0.getUseEqualFrequency();
      discretize0.setAttributeIndices("M8$D2|VIYy");
      discretize0.setDesiredWeightOfInstancesPerInterval(0.0);
      discretize0.getCutPoints((-2056));
      discretize0.setMakeBinary(false);
      discretize0.setOutputFormat();
      discretize0.listOptions();
      discretize0.getDesiredWeightOfInstancesPerInterval();
      discretize0.setAttributeIndices("/");
      assertEquals(0.0, discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.setOutputFormat();
      discretize0.setOutputFormat();
      discretize0.m_DesiredWeightOfInstancesPerInterval = 0.0;
      discretize0.setBins((-211));
      discretize0.makeBinaryTipText();
      double double0 = (-2085.051);
      // Undeclared exception!
      try { 
        discretize0.output();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // No output instance format defined
         //
         verifyException("weka.filters.Filter", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      int[] intArray0 = new int[0];
      discretize0.setAttributeIndicesArray(intArray0);
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getFindNumBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Discretize discretize0 = new Discretize("");
      assertFalse(discretize0.getUseEqualFrequency());
      
      discretize0.setUseEqualFrequency(true);
      discretize0.listOptions();
      discretize0.getUseBinNumbers();
      discretize0.invertSelectionTipText();
      boolean boolean0 = discretize0.getUseBinNumbers();
      assertTrue(discretize0.getUseEqualFrequency());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.setOutputFormat();
      discretize0.getMakeBinary();
      discretize0.globalInfo();
      discretize0.getMakeBinary();
      discretize0.getOptions();
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
  //Test case number: 10
  /*Coverage entropy=2.4582044327855743
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Discretize discretize0 = new Discretize("");
      discretize0.setMakeBinary(false);
      discretize0.mayRemoveInstanceAfterFirstBatchDone();
      discretize0.getCapabilities();
      discretize0.getBinRangesString(1);
      discretize0.getOptions();
      discretize0.getOptions();
      discretize0.m_FindNumBins = true;
      discretize0.getOptions();
      // Undeclared exception!
      try { 
        discretize0.calculateCutPointsByEqualWidthBinning(1329);
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
  /*Coverage entropy=2.5400363038209806
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Discretize discretize0 = new Discretize("");
      discretize0.setMakeBinary(true);
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
  //Test case number: 12
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      FileSystemHandling.shouldAllThrowIOExceptions();
      discretize0.getCutPoints(292);
      String string0 = discretize0.attributeIndicesTipText();
      assertEquals("Specify range of attributes to act on. This is a comma separated list of attribute indices, with \"first\" and \"last\" valid values. Specify an inclusive range with \"-\". E.g: \"first-3,5,6-10,last\".", string0);
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getFindNumBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.4260151319598084
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.listOptions();
      discretize0.setUseEqualFrequency(true);
      discretize0.getMakeBinary();
      discretize0.getOptions();
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
  //Test case number: 14
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Discretize discretize0 = new Discretize("jf7`~");
      assertFalse(discretize0.getFindNumBins());
      
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-R <col1,col2-col4,...>";
      stringArray0[1] = "-R <col1,col2-col4,...>";
      Filter.runFilter(discretize0, stringArray0);
      String string0 = discretize0.binsTipText();
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getMakeBinary());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertEquals("Number of bins.", string0);
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getUseBinNumbers());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String string0 = discretize0.useBinNumbersTipText();
      assertEquals("Use bin numbers (eg BXofY) rather than ranges for for discretized attributes", string0);
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseEqualFrequency());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String string0 = discretize0.findNumBinsTipText();
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getUseEqualFrequency());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getFindNumBins());
      assertEquals(10, discretize0.getBins());
      assertEquals("Optimize number of equal-width bins using leave-one-out. Doesn't work for equal-frequency binning", string0);
      assertFalse(discretize0.getUseBinNumbers());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("-M", arrayList0, 82);
      Instances instances1 = new Instances(instances0);
      Discretize discretize0 = new Discretize();
      Discretize discretize1 = new Discretize();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-M";
      stringArray0[1] = ".bsi";
      stringArray0[2] = "@data";
      Discretize.main(stringArray0);
      discretize0.setOutputFormat();
      assertEquals(10, discretize0.getBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getMakeBinary());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.739997406578141
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      Discretize discretize0 = new Discretize("Specify range of attributes to act on. This is a comma separated list of attribute indices,with \"first\" and \"last\" valid values. Specify an inclusie range with \"-\". E.g: \"first-3,5,6-10,last\".");
      String[] stringArray0 = discretize0.getOptions();
      discretize0.setOptions(stringArray0);
      assertEquals(6, stringArray0.length);
      
      discretize0.setOutputFormat();
      assertEquals(10, discretize0.getBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getUseBinNumbers());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.293118601486813
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      Discretize discretize0 = new Discretize("Specify range of attributes to act on. This is a comma separated list of attribute indices,with \"first\" and \"last\" valid values. Specify an inclusie range with \"-\". E.g: \"first-3,5,6-10,last\".");
      discretize0.getAttributeIndices();
      discretize0.setInvertSelection(true);
      discretize0.getOptions();
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
  //Test case number: 20
  /*Coverage entropy=2.70805020110221
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.setMakeBinary(true);
      discretize0.mayRemoveInstanceAfterFirstBatchDone();
      discretize0.getCapabilities();
      discretize0.getBinRangesString(1);
      discretize0.getOptions();
      discretize0.getOptions();
      discretize0.getOptions();
      int int0 = 1329;
      // Undeclared exception!
      try { 
        discretize0.calculateCutPointsByEqualWidthBinning(1329);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      double[][] doubleArray0 = new double[4][0];
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = (double) 501;
      doubleArray1[1] = (double) 501;
      doubleArray1[2] = (double) 501;
      doubleArray1[3] = (double) 501;
      doubleArray1[4] = (-559.0);
      doubleArray1[5] = (double) 501;
      doubleArray1[6] = (double) 501;
      doubleArray1[7] = (-1.7976931348623157E308);
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[7];
      doubleArray2[0] = (double) 501;
      doubleArray2[1] = (double) 501;
      doubleArray2[2] = (-559.0);
      doubleArray2[3] = (-1.7976931348623157E308);
      doubleArray2[4] = (-1.7976931348623157E308);
      doubleArray2[5] = (-559.0);
      doubleArray2[6] = (-1.7976931348623157E308);
      doubleArray0[1] = doubleArray2;
      double[] doubleArray3 = new double[1];
      doubleArray3[0] = (-1.7976931348623157E308);
      doubleArray0[2] = doubleArray3;
      double[] doubleArray4 = new double[9];
      doubleArray4[0] = (-559.0);
      doubleArray4[1] = (-1.7976931348623157E308);
      doubleArray4[2] = (double) 501;
      doubleArray4[3] = (-559.0);
      doubleArray4[4] = (-1.7976931348623157E308);
      doubleArray4[5] = (-559.0);
      doubleArray4[6] = (double) 501;
      doubleArray4[7] = 0.0;
      doubleArray4[8] = (-1.7976931348623157E308);
      doubleArray0[3] = doubleArray4;
      discretize0.m_CutPoints = doubleArray0;
      // Undeclared exception!
      try { 
        discretize0.getCutPoints(501);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 501
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=2.3693821196946767
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.getOptions();
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, true);
      Discretize discretize1 = new Discretize();
      discretize1.setIgnoreClass(true);
      discretize1.getOptions();
      System.setCurrentTimeMillis(1006L);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      Instance instance0 = null;
      Discretize discretize0 = new Discretize();
      discretize0.getInvertSelection();
      discretize0.setMakeBinary(true);
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
  //Test case number: 24
  /*Coverage entropy=2.9683918915419634
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Discretize discretize0 = new Discretize("Set attribue selection mode. If false, only selected (numeric) attributes in the range will be discretized; if true, only non-selected attributs will be discretized.");
      String[] stringArray0 = new String[3];
      stringArray0[0] = "Set attribue selection mode. If false, only selected (numeric) attributes in the range will be discretized; if true, only non-selected attributs will be discretized.";
      discretize0.setUseBinNumbers(true);
      stringArray0[1] = "Set attribue selection mode. If false, only selected (numeric) attributes in the range will be discretized; if true, only non-selected attributs will be discretized.";
      stringArray0[2] = "Set attribue selection mode. If false, only selected (numeric) attributes in the range will be discretized; if true, only non-selected attributs will be discretized.";
      Discretize.main(stringArray0);
      discretize0.getOptions();
      assertTrue(discretize0.getUseBinNumbers());
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.shouldAllThrowIOExceptions();
      SystemInUtil.addInputLine(")I!N*-&pf4");
      Discretize discretize0 = new Discretize();
      double[][] doubleArray0 = new double[6][3];
      double[] doubleArray1 = new double[1];
      doubleArray1[0] = 1.0;
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[9];
      doubleArray2[0] = 1.0;
      doubleArray2[1] = 1.0;
      doubleArray2[2] = 1.0;
      doubleArray2[3] = 0.0;
      doubleArray2[4] = 1.0;
      doubleArray2[5] = 1.0;
      doubleArray2[6] = 1.0;
      doubleArray2[7] = 1.0;
      doubleArray2[8] = 1.0;
      doubleArray0[1] = doubleArray2;
      double[] doubleArray3 = new double[6];
      doubleArray3[0] = 1.0;
      doubleArray3[1] = 1.0;
      doubleArray3[2] = 0.0;
      doubleArray3[3] = 0.0;
      doubleArray3[4] = 0.0;
      doubleArray3[5] = 48.0;
      doubleArray0[2] = doubleArray3;
      double[] doubleArray4 = new double[6];
      doubleArray4[0] = 1.0;
      doubleArray4[1] = 48.0;
      doubleArray4[2] = 48.0;
      doubleArray4[3] = 1.0;
      doubleArray4[4] = 1.0;
      doubleArray4[5] = 0.0;
      doubleArray0[3] = doubleArray4;
      double[] doubleArray5 = new double[7];
      doubleArray5[0] = 48.0;
      doubleArray5[1] = 48.0;
      doubleArray5[2] = 48.0;
      doubleArray5[3] = 48.0;
      doubleArray5[4] = 48.0;
      doubleArray5[5] = 0.0;
      doubleArray5[6] = 0.0;
      doubleArray0[4] = doubleArray5;
      double[] doubleArray6 = new double[7];
      doubleArray6[0] = 48.0;
      doubleArray6[1] = 1.0;
      doubleArray6[2] = 1.0;
      doubleArray6[3] = 0.0;
      doubleArray6[4] = 1.0;
      doubleArray6[5] = 0.0;
      doubleArray6[6] = 0.0;
      doubleArray0[5] = doubleArray6;
      discretize0.m_CutPoints = doubleArray0;
      discretize0.setBins((-1740));
      // Undeclared exception!
      try { 
        discretize0.setOutputFormat();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }
}
