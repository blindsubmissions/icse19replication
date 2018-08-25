/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 08:12:04 GMT 2018
 */

package weka.filters.unsupervised.attribute;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Properties;
import java.util.Random;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import weka.core.Attribute;
import weka.core.BinarySparseInstance;
import weka.core.Capabilities;
import weka.core.DenseInstance;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.ProtectedProperties;
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
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.getBinRangesString(0);
      discretize0.setBins(98);
      discretize0.m_ClassIndex = (-784);
      discretize0.m_ClassIndex = 98;
      String[] stringArray0 = new String[0];
      int[] intArray0 = new int[4];
      intArray0[0] = 0;
      intArray0[1] = 0;
      intArray0[2] = (-784);
      intArray0[3] = 0;
      discretize0.setAttributeIndicesArray(intArray0);
      assertEquals(98, discretize0.getBins());
      
      Discretize.main(stringArray0);
      discretize0.setBins(0);
      assertFalse(discretize0.getMakeBinary());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = "";
      Discretize discretize0 = new Discretize("");
      int[] intArray0 = null;
      // Undeclared exception!
      try { 
        discretize0.setAttributeIndicesArray((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.Range", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Discretize discretize0 = new Discretize("");
      String string0 = discretize0.invertSelectionTipText();
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals("Set attribute selection mode. If false, only selected (numeric) attributes in the range will be discretized; if true, only non-selected attributes will be discretized.", string0);
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getFindNumBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Discretize discretize0 = new Discretize("");
      discretize0.listOptions();
      discretize0.setOutputFormat();
      discretize0.findNumBinsTipText();
      discretize0.binsTipText();
      Filter.makeCopies(discretize0, 0);
      discretize0.getFindNumBins();
      // Undeclared exception!
      try { 
        discretize0.calculateCutPointsByEqualWidthBinning(125);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      int[] intArray0 = new int[1];
      discretize0.getBinRangesString((-3131));
      intArray0[0] = (-3131);
      discretize0.m_MakeBinary = false;
      discretize0.setAttributeIndicesArray(intArray0);
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
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.invertSelectionTipText();
      double[][] doubleArray0 = new double[6][7];
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = 1.7976931348623157E308;
      doubleArray1[1] = 0.0;
      doubleArray1[2] = 1678.9626620001;
      doubleArray1[3] = 2775.28357482332;
      doubleArray1[4] = 0.0;
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[8];
      doubleArray2[0] = 5.3;
      doubleArray2[1] = Double.POSITIVE_INFINITY;
      doubleArray2[2] = 1678.9626620001;
      doubleArray2[3] = 1678.9626620001;
      doubleArray2[4] = 1678.9626620001;
      doubleArray2[5] = 2775.28357482332;
      doubleArray2[6] = 1678.9626620001;
      doubleArray2[7] = 1.7976931348623157E308;
      doubleArray0[1] = doubleArray2;
      double[] doubleArray3 = new double[8];
      doubleArray3[0] = 2775.28357482332;
      doubleArray3[1] = 5.3;
      doubleArray3[2] = 0.0;
      doubleArray3[3] = 2775.28357482332;
      doubleArray3[4] = 1678.9626620001;
      doubleArray3[5] = 1.7976931348623157E308;
      doubleArray3[6] = 2775.28357482332;
      doubleArray3[7] = 0.0;
      doubleArray0[2] = doubleArray3;
      double[] doubleArray4 = new double[6];
      doubleArray4[0] = 0.0;
      doubleArray4[1] = 1.7976931348623157E308;
      doubleArray4[2] = 0.0;
      doubleArray4[3] = 1.7976931348623157E308;
      doubleArray4[4] = 1678.9626620001;
      doubleArray4[5] = Double.POSITIVE_INFINITY;
      doubleArray0[3] = doubleArray4;
      double[] doubleArray5 = new double[7];
      doubleArray5[0] = 0.0;
      doubleArray5[1] = 2775.28357482332;
      doubleArray5[2] = 0.0;
      doubleArray5[3] = 2775.28357482332;
      doubleArray5[4] = Double.POSITIVE_INFINITY;
      doubleArray5[5] = 1678.9626620001;
      doubleArray5[6] = 1110.0188;
      doubleArray0[4] = doubleArray5;
      double[] doubleArray6 = new double[2];
      doubleArray6[0] = 0.0;
      doubleArray6[1] = 2775.28357482332;
      doubleArray0[5] = doubleArray6;
      discretize0.m_CutPoints = doubleArray0;
      discretize0.getAttributeIndices();
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

  /**
  //Test case number: 6
  /*Coverage entropy=3.178053830347946
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.setUseEqualFrequency(true);
      discretize0.getBinRangesString(62);
      discretize0.m_ClassIndex = 1265;
      discretize0.getRevision();
      discretize0.getAttributeIndices();
      String[] stringArray0 = discretize0.getOptions();
      Discretize.main(stringArray0);
      discretize0.getRevision();
      discretize0.binsTipText();
      boolean boolean0 = false;
      AllFilter allFilter0 = new AllFilter();
      StringReader stringReader0 = new StringReader("sn9J_x}u19r");
      Instances instances0 = null;
      try {
        instances0 = new Instances(stringReader0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // keyword @relation expected, read Token[sn9J_x], line 1
         //
         verifyException("weka.core.converters.ArffLoader$ArffReader", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.setUseBinNumbers(true);
      discretize0.setMakeBinary(false);
      discretize0.getCapabilities();
      discretize0.setUseEqualFrequency(false);
      discretize0.toString();
      int int0 = 0;
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
  //Test case number: 8
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.globalInfo();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "An instance filter that discretizes a range of numeric attributes in the dataset into nominal attributes. Discretization is by simple binning. Skips the class attribute if set.";
      stringArray0[1] = "An instance filter that discretizes a range of numeric attributes in the dataset into nominal attributes. Discretization is by simple binning. Skips the class attribute if set.";
      stringArray0[2] = "An instance filter that discretizes a range of numeric attributes in the dataset into nominal attributes. Discretization is by simple binning. Skips the class attribute if set.";
      stringArray0[3] = "An instance filter that discretizes a range of numeric attributes in the dataset into nominal attributes. Discretization is by simple binning. Skips the class attribute if set.";
      stringArray0[4] = "'";
      stringArray0[5] = "An instance filter that discretizes a range of numeric attributes in the dataset into nominal attributes. Discretization is by simple binning. Skips the class attribute if set.";
      stringArray0[6] = "An instance filter that discretizes a range of numeric attributes in the dataset into nominal attributes. Discretization is by simple binning. Skips the class attribute if set.";
      discretize0.setOptions(stringArray0);
      int int0 = (-130);
      // Undeclared exception!
      try { 
        discretize0.calculateCutPointsByEqualWidthBinning((-130));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Discretize discretize0 = new Discretize("");
      Range range0 = new Range("");
      discretize0.m_DiscretizeCols = range0;
      discretize0.useBinNumbersTipText();
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
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      MultiFilter multiFilter0 = new MultiFilter();
      Filter.makeCopy(multiFilter0);
      String string0 = discretize0.makeBinaryTipText();
      assertEquals("Make resulting attributes binary.", string0);
      
      discretize0.setOutputFormat();
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getFindNumBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getUseBinNumbers());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) (-721);
      doubleArray0[1] = (double) (-721);
      doubleArray0[2] = (double) (-721);
      doubleArray0[3] = (double) (-721);
      doubleArray0[4] = 2.0;
      doubleArray0[5] = (double) (-721);
      String[] stringArray0 = new String[0];
      Discretize.main(stringArray0);
      Discretize discretize0 = new Discretize();
      String string0 = discretize0.attributeIndicesTipText();
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals(10, discretize0.getBins());
      assertEquals("Specify range of attributes to act on. This is a comma separated list of attribute indices, with \"first\" and \"last\" valid values. Specify an inclusive range with \"-\". E.g: \"first-3,5,6-10,last\".", string0);
      assertFalse(discretize0.getUseEqualFrequency());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.6525875347201473
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.getBinRangesString(65);
      discretize0.m_ClassIndex = 1235;
      discretize0.getRevision();
      discretize0.getAttributeIndices();
      String[] stringArray0 = Locale.getISOLanguages();
      Discretize.main(stringArray0);
      discretize0.getRevision();
      discretize0.setOptions(stringArray0);
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance(1235);
      // Undeclared exception!
      try { 
        discretize0.input(binarySparseInstance0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No input instance format defined
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.6476849213228197
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      Discretize discretize0 = new Discretize("");
      String[] stringArray0 = discretize0.getOptions();
      discretize0.setOptions(stringArray0);
      BinarySparseInstance binarySparseInstance0 = null;
      try {
        binarySparseInstance0 = new BinarySparseInstance((-363));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.BinarySparseInstance", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      assertFalse(discretize0.getMakeBinary());
      
      discretize0.m_MakeBinary = false;
      String string0 = discretize0.useEqualFrequencyTipText();
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals(10, discretize0.getBins());
      assertEquals("If set to true, equal-frequency binning will be used instead of equal-width binning.", string0);
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getFindNumBins());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.getAttributeIndices();
      Discretize discretize1 = new Discretize("first-last");
      String[] stringArray0 = discretize0.getOptions();
      assertEquals(6, stringArray0.length);
      assertEquals(10, discretize0.getBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      
      discretize1.setOutputFormat();
      discretize1.getCutPoints(66);
      assertEquals(10, discretize1.getBins());
      assertEquals((-1.0), discretize1.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize1.getUseBinNumbers());
      assertFalse(discretize1.getMakeBinary());
      assertFalse(discretize1.getUseEqualFrequency());
      assertFalse(discretize1.getFindNumBins());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.getBinRangesString(0);
      discretize0.setOutputFormat();
      String string0 = discretize0.desiredWeightOfInstancesPerIntervalTipText();
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getMakeBinary());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getFindNumBins());
      assertEquals(10, discretize0.getBins());
      assertEquals("Sets the desired weight of instances per interval for equal-frequency binning.", string0);
      assertFalse(discretize0.getUseBinNumbers());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      Discretize discretize0 = new Discretize();
      double[][] doubleArray0 = new double[1][6];
      double[] doubleArray1 = new double[4];
      doubleArray1[0] = 0.0;
      doubleArray1[1] = Double.NEGATIVE_INFINITY;
      discretize0.setAttributeIndices("\tOutput binary attributes for discretized attributes.");
      doubleArray1[2] = 3.0;
      doubleArray1[3] = 680.89412533;
      doubleArray0[0] = doubleArray1;
      discretize0.m_CutPoints = doubleArray0;
      // Undeclared exception!
      try { 
        discretize0.getCutPoints(255);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 255
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.359849252163834
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      SparseInstance sparseInstance0 = new SparseInstance(3268.3148267407405, doubleArray0);
      Discretize discretize0 = new Discretize();
      discretize0.m_FindNumBins = true;
      discretize0.getOptions();
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
  //Test case number: 19
  /*Coverage entropy=2.809678234077784
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      Discretize discretize0 = new Discretize();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "java.net.useSystemProxies";
      stringArray0[1] = "Filter said collect output";
      stringArray0[2] = "vfH'1R";
      stringArray0[3] = "13\n&B`#5w!(%+^!F\"j";
      stringArray0[4] = "weka/core/version.txt";
      stringArray0[5] = "Optimize number of equal-width bins using leave-one-out. Doesn't work for equal-frequency binning";
      stringArray0[6] = "Hi()OYxc$Oc/";
      stringArray0[7] = "\tSpecifies the desired weight of instances per bin for\n\tequal-frequency binning. If this is set to a positive\n\tnumber then the -B option will be ignored.\n\t(default = -1)";
      stringArray0[8] = "-Y";
      discretize0.setOptions(stringArray0);
      discretize0.getOptions();
      assertTrue(discretize0.getUseBinNumbers());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=2.714452351742496
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.setOutputFormat();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances(")8j'", arrayList0, 1);
      Instances instances1 = new Instances(instances0, 2975);
      Properties properties0 = new Properties();
      ProtectedProperties protectedProperties0 = new ProtectedProperties(properties0);
      Attribute attribute0 = new Attribute("", (String) null, protectedProperties0);
      arrayList0.add(attribute0);
      Instances instances2 = new Instances(instances1, 86);
      discretize0.setInputFormat(instances2);
      discretize0.setInputFormat(instances2);
      int int0 = 2314;
      discretize0.getBinRangesString(2314);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "q9";
      stringArray0[1] = ".bsi";
      stringArray0[2] = "@relation";
      stringArray0[3] = ".bsi";
      stringArray0[4] = "@data";
      stringArray0[5] = "pm{Z";
      stringArray0[6] = "relational";
      discretize0.setOptions(stringArray0);
      // Undeclared exception!
      try { 
        discretize0.findNumBins(3);
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
  /*Coverage entropy=2.8782183066708504
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.setOutputFormat();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("Capabilities.props");
      Range range0 = new Range();
      discretize0.m_DiscretizeCols = range0;
      FileSystemHandling.setPermissions(evoSuiteFile0, false, false, false);
      Instances instances0 = new Instances(")8j'", arrayList0, 1);
      Instances instances1 = new Instances(instances0, 1);
      Properties properties0 = new Properties();
      ProtectedProperties protectedProperties0 = new ProtectedProperties(properties0);
      Attribute attribute0 = new Attribute("@relation", protectedProperties0);
      arrayList0.add(attribute0);
      Properties properties1 = new Properties();
      ProtectedProperties protectedProperties1 = new ProtectedProperties(properties1);
      Attribute attribute1 = new Attribute("", (String) null, protectedProperties1);
      arrayList0.add(attribute1);
      Instances instances2 = new Instances(instances1, 86);
      boolean boolean0 = discretize0.m_IgnoreClass;
      boolean boolean1 = discretize0.setInputFormat(instances2);
      discretize0.getBinRangesString(2293);
      String[] stringArray0 = new String[7];
      stringArray0[0] = ".arff";
      boolean boolean2 = discretize0.batchFinished();
      assertTrue(boolean2 == boolean1);
      
      discretize0.findNumBins(1);
      int[] intArray0 = new int[9];
      intArray0[0] = 2665;
      intArray0[1] = 1;
      intArray0[2] = 1;
      intArray0[3] = 2;
      intArray0[4] = 1466;
      intArray0[5] = 0;
      intArray0[6] = 1;
      intArray0[7] = 3;
      intArray0[8] = 2293;
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance(2, intArray0, 2293);
      SparseInstance sparseInstance0 = new SparseInstance((Instance) binarySparseInstance0);
      discretize0.convertInstance(sparseInstance0);
      assertFalse(discretize0.getFindNumBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertTrue(discretize0.isNewBatch());
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getUseBinNumbers());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=2.4831652713181676
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.setOutputFormat();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances(")8j'", arrayList0, 1);
      Instances instances1 = new Instances(instances0, 1);
      Properties properties0 = new Properties();
      Attribute attribute0 = new Attribute("-B <num>");
      arrayList0.add(attribute0);
      Instances instances2 = new Instances(instances0, 0);
      discretize0.setInputFormat(instances1);
      Discretize discretize1 = new Discretize();
      discretize1.setInputFormat(instances2);
      discretize0.getBinRangesString((-1));
      discretize0.batchFinished();
      // Undeclared exception!
      try { 
        discretize0.getBinRangesString(6);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=2.7467059471170976
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.setOutputFormat();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("Capabilities.props");
      Range range0 = discretize0.m_DiscretizeCols;
      discretize0.m_DiscretizeCols = range0;
      FileSystemHandling.setPermissions(evoSuiteFile0, false, false, false);
      Instances instances0 = new Instances(")8j'", arrayList0, 1);
      Instances instances1 = new Instances(instances0, 1);
      Properties properties0 = new Properties();
      ProtectedProperties protectedProperties0 = new ProtectedProperties(properties0);
      Attribute attribute0 = new Attribute("@relation", protectedProperties0);
      arrayList0.add(attribute0);
      Properties properties1 = new Properties();
      ProtectedProperties protectedProperties1 = new ProtectedProperties(properties1);
      Attribute attribute1 = new Attribute("", (String) null, protectedProperties1);
      arrayList0.add(attribute1);
      Instances instances2 = new Instances(instances1, 86);
      boolean boolean0 = discretize0.m_IgnoreClass;
      discretize0.setInputFormat(instances2);
      discretize0.getBinRangesString(2293);
      String[] stringArray0 = new String[7];
      stringArray0[0] = ".arff";
      discretize0.batchFinished();
      discretize0.findNumBins(1);
      int[] intArray0 = new int[9];
      intArray0[0] = 2665;
      intArray0[1] = 1;
      intArray0[0] = 1;
      intArray0[3] = 2;
      intArray0[4] = 1466;
      intArray0[5] = 0;
      intArray0[6] = 1;
      intArray0[7] = 3;
      intArray0[8] = 2293;
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance(2, intArray0, 2293);
      SparseInstance sparseInstance0 = new SparseInstance((Instance) binarySparseInstance0);
      // Undeclared exception!
      try { 
        discretize0.convertInstance(sparseInstance0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.SparseInstance", e);
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=2.6070341598008206
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.setOutputFormat();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances(")8j'", arrayList0, 1);
      Instances instances1 = new Instances(instances0, 1);
      Properties properties0 = new Properties();
      arrayList0.trimToSize();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("Capabilities.props");
      FileSystemHandling.setPermissions(evoSuiteFile0, true, false, false);
      ProtectedProperties protectedProperties0 = new ProtectedProperties(properties0);
      Attribute attribute0 = new Attribute(".arff");
      arrayList0.add(attribute0);
      Instances instances2 = new Instances(instances1, 86);
      discretize0.setInputFormat(instances2);
      Discretize discretize1 = new Discretize();
      discretize1.setInputFormat(instances1);
      discretize0.getBinRangesString(3);
      discretize1.batchFinished();
      discretize0.setOutputFormat();
      discretize0.setOutputFormat();
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance(2);
      discretize1.input(binarySparseInstance0);
      // Undeclared exception!
      try { 
        discretize0.input(binarySparseInstance0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Instance has no dataset assigned!!
         //
         verifyException("weka.core.RelationalLocator", e);
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=2.7144523517424957
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.setOutputFormat();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances(")8j'", arrayList0, 1);
      Instances instances1 = new Instances(instances0, 1);
      Properties properties0 = new Properties();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("Capabilities.props");
      FileSystemHandling.setPermissions(evoSuiteFile0, true, true, true);
      ProtectedProperties protectedProperties0 = new ProtectedProperties(properties0);
      ProtectedProperties protectedProperties1 = new ProtectedProperties(properties0);
      Attribute attribute0 = new Attribute(".bsi");
      LinkedList<String> linkedList0 = new LinkedList<String>();
      Attribute attribute1 = new Attribute("' `'0g", linkedList0, 4);
      arrayList0.add(attribute1);
      Instances instances2 = new Instances(instances0, 7);
      discretize0.isNewBatch();
      discretize0.setInputFormat(instances0);
      discretize0.batchFinished();
      discretize0.setOutputFormat();
      discretize0.calculateCutPoints();
      // Undeclared exception!
      try { 
        discretize0.calculateCutPointsByEqualFrequencyBinning(3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  /**
  //Test case number: 26
  /*Coverage entropy=2.62915226493963
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances(")8j'", arrayList0, 1);
      Instances instances1 = new Instances(instances0, 1);
      Properties properties0 = new Properties();
      Attribute attribute0 = new Attribute("-B <nuT>");
      arrayList0.add(attribute0);
      Instances instances2 = new Instances(instances0, 0);
      discretize0.setInputFormat(instances1);
      discretize0.setInputFormat(instances2);
      discretize0.getBinRangesString((-1));
      discretize0.batchFinished();
      discretize0.setOutputFormat();
      discretize0.toString();
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance(895);
      int[] intArray0 = new int[3];
      intArray0[0] = 1;
      intArray0[1] = 2;
      intArray0[2] = 3;
      BinarySparseInstance binarySparseInstance1 = new BinarySparseInstance((-1.0), intArray0, 2);
      SparseInstance sparseInstance0 = new SparseInstance((Instance) binarySparseInstance1);
      discretize0.convertInstance(binarySparseInstance1);
      discretize0.batchFinished();
      discretize0.input(binarySparseInstance1);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String[] stringArray0 = new String[8];
      stringArray0[0] = ")";
      stringArray0[1] = "5:7L'O?`\",r{j6G5";
      stringArray0[2] = "-D";
      stringArray0[3] = "An averagable attribute must be ordered";
      stringArray0[4] = "{Qpo J[=Fm";
      stringArray0[5] = "If set to true, equal-frequency binning will be used instead of equal-width binning.";
      stringArray0[6] = "9QHJ9eAn>]Xb";
      stringArray0[7] = "@Invert matching sense of cnlum8 indexe(.";
      Filter.runFilter(discretize0, stringArray0);
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("", arrayList0, 2);
      Instances instances1 = new Instances(instances0, (-1201));
      Properties properties0 = new Properties();
      Attribute attribute0 = new Attribute("@relation");
      arrayList0.add(attribute0);
      Instances instances2 = new Instances(instances0, (-1982292595));
      try { 
        discretize0.setInputFormat(instances0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // weka.filters.unsupervised.attribute.Discretize: Class attribute not set!
         //
         verifyException("weka.core.Capabilities", e);
      }
  }

  /**
  //Test case number: 28
  /*Coverage entropy=2.537622781528729
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.setOutputFormat();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances(")8j'", arrayList0, 1);
      Properties properties0 = new Properties();
      Attribute attribute0 = new Attribute(".bsi", 1);
      arrayList0.add(attribute0);
      Instances instances1 = new Instances(instances0, 0);
      discretize0.setInputFormat(instances0);
      Discretize discretize1 = new Discretize();
      discretize1.setInputFormat(instances1);
      discretize0.getBinRangesString((-1));
      discretize0.batchFinished();
      discretize1.setOutputFormat();
      discretize1.toString();
      discretize0.calculateCutPoints();
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 1;
      doubleArray0[2] = (double) 0;
      doubleArray0[3] = (double) 1;
      doubleArray0[4] = (double) 3;
      doubleArray0[5] = (double) 0;
      DenseInstance denseInstance0 = new DenseInstance(4, doubleArray0);
      discretize0.convertInstance(denseInstance0);
  }
}