/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 12:41:34 GMT 2018
 */

package weka.filters.unsupervised.attribute;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import weka.core.Attribute;
import weka.core.DenseInstance;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.ProtectedProperties;
import weka.core.SparseInstance;
import weka.filters.AllFilter;
import weka.filters.Filter;
import weka.filters.unsupervised.attribute.Discretize;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Discretize_ESTest extends Discretize_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      int int0 = 6;
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
  //Test case number: 1
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Discretize discretize0 = new Discretize("$Revision: 8964 $");
      discretize0.globalInfo();
      discretize0.m_UseEqualFrequency = false;
      int int0 = 73;
      discretize0.getBinRangesString(73);
      String[] stringArray0 = new String[3];
      double[][] doubleArray0 = new double[8][1];
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = (double) 73;
      doubleArray1[1] = (double) 73;
      doubleArray1[2] = 521.85;
      doubleArray1[3] = (double) 73;
      doubleArray1[4] = 1.0;
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[8];
      doubleArray2[0] = 1.0;
      doubleArray2[1] = 1.0;
      doubleArray2[2] = (double) 73;
      doubleArray2[3] = 521.85;
      doubleArray2[4] = 521.85;
      doubleArray2[5] = (double) 73;
      doubleArray2[6] = 521.85;
      doubleArray2[7] = 1.0;
      doubleArray0[1] = doubleArray2;
      double[] doubleArray3 = new double[5];
      doubleArray3[0] = (double) 73;
      doubleArray3[1] = (double) 73;
      doubleArray3[2] = 521.85;
      doubleArray3[3] = 1.0;
      doubleArray3[4] = (double) 73;
      doubleArray0[2] = doubleArray3;
      double[] doubleArray4 = new double[5];
      doubleArray4[0] = (double) 73;
      doubleArray4[1] = 1.0;
      doubleArray4[2] = (double) 73;
      doubleArray4[3] = 521.85;
      doubleArray4[4] = 521.85;
      doubleArray0[3] = doubleArray4;
      double[] doubleArray5 = new double[4];
      doubleArray5[0] = 521.85;
      doubleArray5[1] = 1.0;
      doubleArray5[2] = 1.0;
      doubleArray5[3] = (double) 73;
      doubleArray0[4] = doubleArray5;
      double[] doubleArray6 = new double[6];
      doubleArray6[0] = 1.0;
      doubleArray6[1] = 521.85;
      doubleArray6[2] = (double) 73;
      doubleArray6[3] = (double) 73;
      doubleArray6[4] = (double) 73;
      doubleArray6[5] = (double) 73;
      doubleArray0[5] = doubleArray6;
      double[] doubleArray7 = new double[0];
      doubleArray0[6] = doubleArray7;
      double[] doubleArray8 = new double[0];
      doubleArray0[7] = doubleArray8;
      discretize0.m_CutPoints = doubleArray0;
      stringArray0[0] = null;
      stringArray0[1] = "$Revision: 8964 $";
      stringArray0[2] = null;
      try { 
        discretize0.setOptions(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.Utils", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Discretize discretize0 = new Discretize("");
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 1.0;
      doubleArray0[1] = 1.0;
      doubleArray0[2] = 1.0;
      discretize0.setDesiredWeightOfInstancesPerInterval(1.0);
      doubleArray0[3] = 1.0;
      doubleArray0[4] = 1.0;
      doubleArray0[5] = 1.0;
      doubleArray0[6] = 1.0;
      SparseInstance sparseInstance0 = new SparseInstance(1.0, doubleArray0);
      sparseInstance0.dataset();
      // Undeclared exception!
      try { 
        discretize0.getCapabilities((Instances) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.filters.Filter", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Discretize discretize0 = new Discretize("");
      String[] stringArray0 = new String[9];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "'Tx";
      discretize0.m_DesiredWeightOfInstancesPerInterval = 0.0;
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "";
      stringArray0[6] = "";
      stringArray0[7] = "";
      stringArray0[8] = "";
      Filter.runFilter(discretize0, stringArray0);
      discretize0.m_MakeBinary = false;
      discretize0.getUseEqualFrequency();
      int int0 = 0;
      // Undeclared exception!
      try { 
        discretize0.calculateCutPointsByEqualFrequencyBinning(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.Instances", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      int[] intArray0 = new int[3];
      intArray0[0] = (-895);
      int int0 = (-1);
      discretize0.setOutputFormat();
      intArray0[1] = (-1);
      intArray0[2] = 456;
      discretize0.setAttributeIndicesArray(intArray0);
      discretize0.getAttributeIndices();
      discretize0.globalInfo();
      discretize0.setDesiredWeightOfInstancesPerInterval(0.0);
      discretize0.setUseEqualFrequency(true);
      discretize0.desiredWeightOfInstancesPerIntervalTipText();
      discretize0.setFindNumBins(true);
      DenseInstance denseInstance0 = null;
      try {
        denseInstance0 = new DenseInstance((-895));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.DenseInstance", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.293118601486813
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = "M?F3/=eCJ[0D";
      Discretize discretize0 = new Discretize("M?F3/=eCJ[0D");
      discretize0.setInvertSelection(true);
      discretize0.m_DesiredWeightOfInstancesPerInterval = 0.0;
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
  //Test case number: 6
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Discretize discretize0 = new Discretize("P[Y;,__pLSc\"v`\"2O");
      assertFalse(discretize0.getFindNumBins());
      
      String[] stringArray0 = new String[6];
      stringArray0[0] = "P[Y;,__pLSc\"v`\"2O";
      stringArray0[1] = "P[Y;,__pLSc\"v`\"2O";
      stringArray0[2] = "P[Y;,__pLSc\"v`\"2O";
      stringArray0[3] = "P[Y;,__pLSc\"v`\"2O";
      stringArray0[4] = "P[Y;,__pLSc\"v`\"2O";
      stringArray0[5] = "P[Y;,__pLSc\"v`\"2O";
      Filter.runFilter(discretize0, stringArray0);
      discretize0.useEqualFrequencyTipText();
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = "";
      Discretize discretize0 = new Discretize("");
      discretize0.binsTipText();
      discretize0.useBinNumbersTipText();
      Discretize discretize1 = new Discretize();
      discretize1.getDesiredWeightOfInstancesPerInterval();
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
  //Test case number: 8
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "";
      Discretize.main(stringArray0);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "");
      // Undeclared exception!
      try { 
        discretize0.calculateCutPointsByEqualWidthBinning(616);
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
  /*Coverage entropy=2.03195622385697
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Discretize discretize0 = new Discretize("");
      String[] stringArray0 = discretize0.getOptions();
      assertEquals(4, stringArray0.length);
      assertEquals(10, discretize0.getBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=3.0910424533583143
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      Discretize discretize0 = new Discretize();
      discretize0.getCapabilities();
      discretize0.setAttributeIndices("weka/core/Capabilities.props");
      discretize0.setFindNumBins(false);
      String string0 = discretize0.useBinNumbersTipText();
      assertEquals("Use bin numbers (eg BXofY) rather than ranges for for discretized attributes", string0);
      
      discretize0.invertSelectionTipText();
      Discretize discretize1 = new Discretize();
      String[] stringArray0 = discretize1.getOptions();
      assertEquals((-1.0), discretize1.getDesiredWeightOfInstancesPerInterval(), 0.01);
      
      discretize1.setOptions(stringArray0);
      assertFalse(discretize1.getMakeBinary());
      assertEquals(6, stringArray0.length);
      assertEquals(10, discretize1.getBins());
      assertFalse(discretize1.getUseEqualFrequency());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.setInvertSelection(true);
      boolean boolean0 = discretize0.getMakeBinary();
      assertFalse(boolean0);
      
      discretize0.setMakeBinary(true);
      discretize0.getCutPoints(1048);
      discretize0.findNumBinsTipText();
      assertTrue(discretize0.getMakeBinary());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Discretize discretize0 = new Discretize("");
      String string0 = discretize0.binsTipText();
      assertEquals("Number of bins.", string0);
      
      discretize0.setInvertSelection(false);
      discretize0.getMakeBinary();
      discretize0.setMakeBinary(false);
      discretize0.getCutPoints((-3535));
      String string1 = discretize0.makeBinaryTipText();
      assertEquals("Make resulting attributes binary.", string1);
      
      String string2 = discretize0.findNumBinsTipText();
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getUseEqualFrequency());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertEquals("Optimize number of equal-width bins using leave-one-out. Doesn't work for equal-frequency binning", string2);
      assertFalse(discretize0.getFindNumBins());
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getUseBinNumbers());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      Discretize discretize0 = new Discretize("weka.core.StringLocator");
      discretize0.m_ClassIndex = (-658);
      discretize0.attributeIndicesTipText();
      // Undeclared exception!
      try { 
        discretize0.calculateCutPointsByEqualWidthBinning(2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Discretize discretize0 = new Discretize(":+U.+Y2;:gq^XVM_");
      discretize0.getRevision();
      discretize0.m_FindNumBins = false;
      int int0 = (-728);
      // Undeclared exception!
      try { 
        discretize0.calculateCutPointsByEqualFrequencyBinning((-728));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.Instances", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Discretize discretize0 = new Discretize("iNL.9oyIv5#|rjeRi#");
      discretize0.binsTipText();
      discretize0.setOutputFormat();
      discretize0.getCutPoints((-3535));
      DenseInstance denseInstance0 = new DenseInstance(1962.940710223641, (double[]) null);
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
  //Test case number: 16
  /*Coverage entropy=2.8985935194123327
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Discretize discretize0 = new Discretize("Y@J LLK`#zeEIjT");
      String[] stringArray0 = new String[3];
      stringArray0[0] = "Y@J LLK`#zeEIjT";
      stringArray0[1] = "Y@J LLK`#zeEIjT";
      discretize0.setMakeBinary(false);
      stringArray0[2] = "Y@J LLK`#zeEIjT";
      discretize0.setAttributeIndices("7)Tl1Y");
      discretize0.setFindNumBins(true);
      discretize0.useBinNumbersTipText();
      discretize0.invertSelectionTipText();
      Discretize discretize1 = new Discretize();
      discretize0.getOptions();
      assertTrue(discretize0.getFindNumBins());
      
      discretize0.setOptions(stringArray0);
      assertFalse(discretize0.getUseEqualFrequency());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.70805020110221
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      Discretize discretize1 = new Discretize();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "^8";
      stringArray0[1] = "Arff data files";
      stringArray0[2] = "Arff data files";
      Filter.runFilter(discretize1, stringArray0);
      discretize0.useEqualFrequencyTipText();
      try { 
        discretize1.setInputFormat((Instances) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.filters.Filter", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.shouldAllThrowIOExceptions();
      Discretize discretize0 = new Discretize("Help requested");
      double[][] doubleArray0 = new double[0][0];
      discretize0.m_CutPoints = doubleArray0;
      Locale.getISOCountries();
      // Undeclared exception!
      try { 
        discretize0.getCutPoints(2409);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2409
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.5665989181145106
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      Discretize discretize0 = new Discretize("    athValues.addElement(\"");
      Discretize discretize1 = new Discretize();
      assertFalse(discretize1.getUseBinNumbers());
      
      discretize1.setUseBinNumbers(true);
      discretize1.getOptions();
      assertTrue(discretize1.getUseBinNumbers());
      
      discretize0.setOutputFormat();
      assertEquals(10, discretize0.getBins());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=2.8133554045006157
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Discretize discretize0 = new Discretize("Y@J LLK`#zeEIjT");
      String[] stringArray0 = new String[7];
      stringArray0[0] = "Y@J LLK`#zeEIjT";
      stringArray0[1] = "Y@J LLK`#zeEIjT";
      discretize0.setMakeBinary(true);
      stringArray0[2] = "Y@J LLK`#zeEIjT";
      discretize0.setAttributeIndices("7)Tl1Y");
      discretize0.setFindNumBins(true);
      discretize0.useBinNumbersTipText();
      discretize0.invertSelectionTipText();
      Discretize discretize1 = new Discretize();
      discretize0.getOptions();
      try { 
        discretize0.setOptions(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.Utils", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Discretize discretize0 = new Discretize("5G|,`oX)1z>");
      double[][] doubleArray0 = new double[8][2];
      double[] doubleArray1 = new double[4];
      doubleArray1[0] = 0.0;
      doubleArray1[1] = (-1607.6238855);
      doubleArray1[2] = (-976.47171561429);
      doubleArray1[3] = 1029.203561391;
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[5];
      doubleArray2[0] = 0.0;
      doubleArray2[1] = 1029.203561391;
      doubleArray2[2] = 0.0;
      doubleArray2[3] = 1029.203561391;
      doubleArray2[4] = 0.0;
      doubleArray0[1] = doubleArray2;
      double[] doubleArray3 = new double[7];
      doubleArray3[0] = (-1607.6238855);
      doubleArray3[1] = 1029.203561391;
      doubleArray3[2] = 0.0;
      doubleArray3[3] = (-976.47171561429);
      doubleArray3[4] = 1029.203561391;
      doubleArray3[5] = 0.0;
      doubleArray3[6] = (-976.47171561429);
      doubleArray0[2] = doubleArray3;
      double[] doubleArray4 = new double[7];
      doubleArray4[0] = 1029.203561391;
      doubleArray4[1] = (-976.47171561429);
      doubleArray4[2] = (-976.47171561429);
      doubleArray4[3] = 1029.203561391;
      doubleArray4[4] = 0.0;
      doubleArray4[5] = (-1607.6238855);
      doubleArray4[6] = 1029.203561391;
      doubleArray0[3] = doubleArray4;
      double[] doubleArray5 = new double[7];
      doubleArray5[0] = 1029.203561391;
      doubleArray5[1] = (-976.47171561429);
      doubleArray5[2] = (-976.47171561429);
      doubleArray5[3] = 0.0;
      doubleArray5[4] = (-1607.6238855);
      doubleArray5[5] = 0.0;
      doubleArray5[6] = 5.5;
      doubleArray0[4] = doubleArray5;
      double[] doubleArray6 = new double[6];
      doubleArray6[0] = 0.0;
      doubleArray6[1] = (-976.47171561429);
      doubleArray6[2] = 278.8217;
      doubleArray6[3] = 1029.203561391;
      doubleArray6[4] = (-1607.6238855);
      doubleArray6[5] = (-1607.6238855);
      doubleArray0[5] = doubleArray6;
      double[] doubleArray7 = new double[2];
      doubleArray7[0] = 5.5;
      doubleArray7[1] = 1029.203561391;
      doubleArray0[6] = doubleArray7;
      double[] doubleArray8 = new double[7];
      doubleArray8[0] = 278.8217;
      doubleArray8[1] = 0.0;
      doubleArray8[2] = (-807.5277);
      doubleArray8[3] = (-1607.6238855);
      doubleArray8[4] = 278.8217;
      doubleArray8[5] = (-976.47171561429);
      doubleArray8[6] = 0.0;
      doubleArray0[7] = doubleArray8;
      discretize0.m_CutPoints = doubleArray0;
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
  //Test case number: 22
  /*Coverage entropy=2.871476118054867
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("IRE0x@~+vz.^-b!>", arrayList0, 2395);
      Attribute attribute0 = new Attribute(".arff", 2395);
      arrayList0.add(attribute0);
      Instances instances1 = new Instances(instances0, 1);
      Discretize discretize0 = new Discretize();
      discretize0.setInputFormat(instances1);
      discretize0.batchFinished();
      discretize0.setInputFormat(instances0);
      // Undeclared exception!
      try { 
        discretize0.calculateCutPointsByEqualFrequencyBinning(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.9061547465398496
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("Problem instantiating package manager. Using DefaultPackageManager.", arrayList0, 2395);
      Attribute attribute0 = new Attribute("h- UkP", (-2103657448));
      arrayList0.add(attribute0);
      Integer[] integerArray0 = new Integer[6];
      integerArray0[0] = (Integer) 0;
      Integer integer0 = new Integer(2);
      integerArray0[1] = integer0;
      Integer integer1 = new Integer((-2103657448));
      integerArray0[2] = integer1;
      integerArray0[3] = (Integer) 0;
      Integer integer2 = new Integer(2);
      integerArray0[4] = integer2;
      attribute0.copy();
      integerArray0[5] = (Integer) 3;
      instances0.toArray(integerArray0);
      Instances instances1 = new Instances(instances0, (-378));
      Discretize discretize0 = new Discretize();
      discretize0.setInputFormat(instances0);
      int[] intArray0 = new int[3];
      intArray0[0] = 3118;
      // Undeclared exception!
      try { 
        discretize0.findNumBins(54);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Discretize discretize0 = new Discretize("Specify range of attributes to act on. This is a comma separated list of attribute indices, with \"first\" and \"last\" valid values. Specify an inclusive range with \"-\". E.g: \"first-3,5,6-10,last\".");
      discretize0.m_UseBinNumbers = true;
      double[][] doubleArray0 = new double[4][8];
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = 1187.67698;
      doubleArray1[1] = 4877.30406605;
      doubleArray1[2] = 2.0;
      doubleArray1[3] = (-0.1);
      doubleArray1[4] = 183.13150972671;
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[1];
      doubleArray2[0] = 183.13150972671;
      doubleArray0[1] = doubleArray2;
      double[] doubleArray3 = new double[2];
      doubleArray3[0] = 686.7;
      doubleArray3[1] = 860.7;
      doubleArray0[2] = doubleArray3;
      double[] doubleArray4 = new double[7];
      doubleArray4[0] = (-0.1);
      doubleArray4[1] = 1187.67698;
      doubleArray4[2] = 2.0;
      doubleArray4[3] = 183.13150972671;
      doubleArray4[4] = 183.13150972671;
      doubleArray4[5] = 2.0;
      doubleArray4[6] = 4877.30406605;
      doubleArray0[3] = doubleArray4;
      discretize0.m_CutPoints = doubleArray0;
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, false);
      // Undeclared exception!
      try { 
        discretize0.getBinRangesString(4305);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4305
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=2.9122553964722835
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("IRE0x@~+vz.(z^-b!>", arrayList0, 2395);
      Attribute attribute0 = new Attribute(".arff", 2395);
      arrayList0.add(attribute0);
      Instances instances1 = new Instances(instances0, 1);
      Discretize discretize0 = new Discretize();
      discretize0.setInputFormat(instances1);
      discretize0.batchFinished();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "@relation";
      stringArray0[1] = "integer";
      stringArray0[2] = "date";
      stringArray0[3] = ".bsi";
      stringArray0[4] = ".arff";
      stringArray0[5] = "@end";
      stringArray0[6] = "real";
      Filter.runFilter(discretize0, stringArray0);
      assertFalse(discretize0.isOutputFormatDefined());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=2.458311329683084
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      Discretize discretize0 = new Discretize("Optimize number of equal-width bins using leave-one-out. Doesn't wrk for equal-frequency binning");
      discretize0.m_IgnoreClass = true;
      discretize0.getCapabilities();
      String[] stringArray0 = discretize0.getOptions();
      assertEquals(7, stringArray0.length);
      assertEquals(10, discretize0.getBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=2.649158683274018
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Properties properties0 = new Properties();
      ProtectedProperties protectedProperties0 = new ProtectedProperties(properties0);
      Attribute attribute0 = new Attribute("RELATIONAL_CLASS", (List<String>) null, protectedProperties0);
      Attribute attribute1 = attribute0.copy("RELATIONAL_CLASS");
      arrayList0.add(attribute1);
      Instances instances0 = new Instances("@attribute", arrayList0, 332);
      Attribute attribute2 = new Attribute("@end", (-692));
      Instances instances1 = new Instances(instances0, 0);
      Discretize discretize0 = new Discretize();
      instances1.addAll((Collection<? extends Instance>) instances0);
      Discretize discretize1 = new Discretize();
      assertFalse(discretize1.getMakeBinary());
      
      Instances instances2 = new Instances(instances1);
      boolean boolean0 = discretize1.setInputFormat(instances0);
      boolean boolean1 = discretize1.batchFinished();
      assertTrue(boolean1 == boolean0);
      
      discretize1.setOutputFormat();
      assertFalse(discretize1.getUseBinNumbers());
      assertFalse(discretize1.getUseEqualFrequency());
      assertTrue(discretize1.isNewBatch());
      assertEquals((-1.0), discretize1.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertEquals(10, discretize1.getBins());
  }

  /**
  //Test case number: 28
  /*Coverage entropy=2.739997406578141
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Attribute attribute0 = new Attribute("Specify range of attributes to act on. This is a comma separated list of attribute indices, with \"first\" and \"last\" valid values. Specify an inclusive range with \"-\". E.g: \"first-3,5,6-10,last\".");
      Instances instances0 = new Instances("Fz9L}", arrayList0, 70);
      attribute0.addStringValue("Fz9L}");
      Attribute attribute1 = new Attribute("Capabilities:", 0);
      arrayList0.add(attribute1);
      Instances instances1 = new Instances(instances0, 4358);
      Discretize discretize0 = new Discretize();
      discretize0.setInputFormat(instances1);
      discretize0.batchFinished();
      discretize0.getBinRangesString(0);
      discretize0.getCapabilities();
      // Undeclared exception!
      try { 
        discretize0.input((Instance) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  /**
  //Test case number: 29
  /*Coverage entropy=2.6185692086879166
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Attribute attribute0 = new Attribute("Specify range of attributes to act on. This is a comma separated list of attribute indices, with \"first\" and \"last\" valid values. Specify an inclusive range with \"-\". E.g: \"first-3,5,6-10,last\".");
      arrayList0.add(attribute0);
      Instances instances0 = new Instances("@end", arrayList0, 3);
      Attribute attribute1 = new Attribute("@end", 1);
      Discretize discretize0 = new Discretize();
      Instances instances1 = new Instances(instances0);
      discretize0.setInputFormat(instances1);
      boolean boolean0 = discretize0.batchFinished();
      assertFalse(boolean0);
      
      discretize0.m_UseEqualFrequency = false;
      DenseInstance denseInstance0 = new DenseInstance(3);
      discretize0.convertInstance(denseInstance0);
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals(10, discretize0.getBins());
      assertTrue(discretize0.isNewBatch());
  }

  /**
  //Test case number: 30
  /*Coverage entropy=2.0069548922107656
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("$Revision: 8964 $", arrayList0, 1374);
      Attribute attribute0 = new Attribute("Inserted", 1374);
      arrayList0.add(attribute0);
      Integer integer0 = new Integer(3);
      Integer integer1 = new Integer((-1717986916));
      Attribute attribute1 = new Attribute(".bsi", instances0);
      Integer[] integerArray0 = new Integer[8];
      integerArray0[0] = (Integer) 0;
      integerArray0[1] = (Integer) 0;
      integerArray0[2] = (Integer) 0;
      integerArray0[3] = (Integer) 3;
      integerArray0[4] = (Integer) 1;
      integerArray0[5] = (Integer) 0;
      integerArray0[6] = (Integer) 4;
      integerArray0[7] = (Integer) 2;
      instances0.toArray(integerArray0);
      instances0.toArray(integerArray0);
      Instances instances1 = new Instances(instances0, (int) integerArray0[3]);
      Discretize discretize0 = new Discretize();
      discretize0.setFindNumBins(true);
      discretize0.setInputFormat(instances0);
      discretize0.setInputFormat(instances1);
      System.setCurrentTimeMillis(0);
      discretize0.calculateCutPoints();
  }

  /**
  //Test case number: 31
  /*Coverage entropy=2.628997487616943
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Attribute attribute0 = new Attribute("Specify range of attributes to act on. This is a comma separated list of attribute indices, with \"first\" and \"last\" valid values. Specify an inclusive range with \"-\". E.g: \"first-3,5,6-10,last\".");
      Instances instances0 = new Instances("Fz9L}", arrayList0, 70);
      attribute0.addStringValue("Fz9L}");
      Attribute attribute1 = new Attribute("Capabilities:", 0);
      arrayList0.add(attribute1);
      Instances instances1 = new Instances(instances0, 4358);
      Discretize discretize0 = new Discretize();
      discretize0.setInputFormat(instances1);
      discretize0.batchFinished();
      discretize0.getBinRangesString(0);
      discretize0.getCapabilities();
      discretize0.batchFinished();
  }
}
