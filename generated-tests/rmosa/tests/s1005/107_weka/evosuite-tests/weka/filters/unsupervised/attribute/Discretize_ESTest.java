/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 07:19:17 GMT 2018
 */

package weka.filters.unsupervised.attribute;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.io.StringReader;
import java.util.function.Consumer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import weka.core.BinarySparseInstance;
import weka.core.DenseInstance;
import weka.core.Instance;
import weka.core.Instances;
import weka.filters.AllFilter;
import weka.filters.Filter;
import weka.filters.unsupervised.attribute.Discretize;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Discretize_ESTest extends Discretize_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.findNumBinsTipText();
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "first-last";
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
  //Test case number: 1
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.globalInfo();
      double[] doubleArray0 = new double[2];
      int[] intArray0 = new int[3];
      intArray0[1] = 0;
      // Undeclared exception!
      try { 
        discretize0.outputPeek();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // No output instance format defined
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
      Discretize discretize0 = new Discretize();
      String string0 = discretize0.invertSelectionTipText();
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getFindNumBins());
      assertEquals("Set attribute selection mode. If false, only selected (numeric) attributes in the range will be discretized; if true, only non-selected attributes will be discretized.", string0);
      assertFalse(discretize0.getMakeBinary());
      assertEquals(10, discretize0.getBins());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.listOptions();
      assertEquals(10, discretize0.getBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseBinNumbers());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.getBinRangesString((-1879048189));
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getMakeBinary());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getUseEqualFrequency());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.9978527044124283
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Discretize discretize0 = new Discretize("");
      double[][] doubleArray0 = new double[6][2];
      discretize0.m_CutPoints = doubleArray0;
      String[] stringArray0 = new String[7];
      String[] stringArray1 = new String[3];
      stringArray1[0] = "";
      stringArray1[1] = "";
      stringArray1[2] = "";
      discretize0.setOptions(stringArray1);
      stringArray0[0] = "";
      stringArray0[3] = "h0a.w;rJn4ik";
      stringArray0[4] = "";
      discretize0.setBins((-2084322361));
      Filter.runFilter(discretize0, stringArray0);
      discretize0.getBinRangesString(2);
      discretize0.setAttributeIndices("A3U>S^ rv&kE0~");
      discretize0.setFindNumBins(false);
      // Undeclared exception!
      try { 
        discretize0.getBinRangesString((-2084322361));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2084322361
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String string0 = discretize0.getRevision();
      assertEquals(10, discretize0.getBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals("8964", string0);
      assertFalse(discretize0.getUseEqualFrequency());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[7];
      Discretize.main(stringArray0);
      assertEquals(7, stringArray0.length);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.setOutputFormat();
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseEqualFrequency());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String string0 = discretize0.attributeIndicesTipText();
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getFindNumBins());
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
      assertEquals("Specify range of attributes to act on. This is a comma separated list of attribute indices, with \"first\" and \"last\" valid values. Specify an inclusive range with \"-\". E.g: \"first-3,5,6-10,last\".", string0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.useEqualFrequencyTipText();
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
  //Test case number: 11
  /*Coverage entropy=2.133628922152431
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.setIgnoreClass(true);
      discretize0.m_ClassIndex = (-554);
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

  /**
  //Test case number: 12
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      double[][] doubleArray0 = new double[4][2];
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
  //Test case number: 13
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.useBinNumbersTipText();
      int[] intArray0 = new int[4];
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      intArray0[0] = (-2540);
      intArray0[3] = (-2308);
      // Undeclared exception!
      try { 
        discretize0.getOutputFormat();
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
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Discretize discretize0 = new Discretize();
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
  //Test case number: 15
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Discretize discretize0 = new Discretize("inMtegr");
      discretize0.desiredWeightOfInstancesPerIntervalTipText();
      // Undeclared exception!
      try { 
        discretize0.getOutputFormat();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // No output format defined.
         //
         verifyException("weka.filters.Filter", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Discretize discretize0 = new Discretize();
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
  //Test case number: 17
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.binsTipText();
      int int0 = (-3406);
      BinarySparseInstance binarySparseInstance0 = null;
      try {
        binarySparseInstance0 = new BinarySparseInstance((-3406));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.BinarySparseInstance", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      Discretize discretize1 = new Discretize();
      discretize1.makeBinaryTipText();
      AllFilter allFilter0 = new AllFilter();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/home/ubuntu/wekafiles");
      FileSystemHandling.shouldThrowIOException(evoSuiteFile0);
      StringReader stringReader0 = new StringReader("Make resulting attributes binary.");
      Instances instances0 = null;
      try {
        instances0 = new Instances(stringReader0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // keyword @relation expected, read Token[Make], line 1
         //
         verifyException("weka.core.converters.ArffLoader$ArffReader", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.getCutPoints((-2560));
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseEqualFrequency());
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Discretize discretize0 = new Discretize();
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
  //Test case number: 21
  /*Coverage entropy=2.2420052954825502
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Discretize discretize0 = new Discretize("");
      discretize0.getOptions();
      double[][] doubleArray0 = new double[6][2];
      discretize0.m_CutPoints = doubleArray0;
      int int0 = 2;
      String[] stringArray0 = new String[7];
      stringArray0[0] = "";
      stringArray0[3] = "h0a.w;rJn4ik";
      stringArray0[4] = "";
      discretize0.setBins((-2084322361));
      Filter.runFilter(discretize0, stringArray0);
      discretize0.getBinRangesString(2);
      discretize0.setAttributeIndices("A3U>S^ rv&kE0~");
      discretize0.setFindNumBins(false);
      // Undeclared exception!
      try { 
        discretize0.getBinRangesString((-2084322361));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2084322361
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=2.2275247137250096
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      int int0 = (-554);
      discretize0.setUseBinNumbers(true);
      discretize0.m_ClassIndex = (-554);
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

  /**
  //Test case number: 23
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-M";
      stringArray0[1] = "jG";
      try { 
        discretize0.setOptions(stringArray0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-B";
      stringArray0[1] = ")";
      stringArray0[2] = ")";
      try { 
        discretize0.setOptions(stringArray0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \")\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "`v";
      stringArray0[1] = "Ajz^Ul$T]gw'";
      stringArray0[2] = "Sets the desired weight of instances per interval for equal-frequency binning.";
      stringArray0[3] = "}B";
      stringArray0[4] = "-R";
      stringArray0[5] = "Sets the desired weight of instances per interval for equal-frequency binning.";
      stringArray0[6] = "`v";
      stringArray0[7] = "g;aZyIK x";
      discretize0.setOptions(stringArray0);
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseEqualFrequency());
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
  }

  /**
  //Test case number: 26
  /*Coverage entropy=2.2275247137250096
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.m_ClassIndex = (-554);
      discretize0.setUseEqualFrequency(true);
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

  /**
  //Test case number: 27
  /*Coverage entropy=2.2275247137250096
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.m_ClassIndex = (-554);
      discretize0.setMakeBinary(true);
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

  /**
  //Test case number: 28
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      double[][] doubleArray0 = new double[6][6];
      double[] doubleArray1 = new double[24];
      doubleArray1[3] = 0.0;
      doubleArray1[5] = (-25.2568315226354);
      double[] doubleArray2 = new double[10];
      doubleArray2[6] = (-25.2568315226354);
      double[] doubleArray3 = new double[4];
      doubleArray3[1] = 0.0;
      doubleArray3[2] = (-25.2568315226354);
      doubleArray3[3] = (-25.2568315226354);
      double[] doubleArray4 = new double[2];
      doubleArray4[1] = (-25.2568315226354);
      doubleArray0[4] = doubleArray4;
      double[] doubleArray5 = new double[3];
      doubleArray5[0] = (-25.2568315226354);
      doubleArray5[2] = (-25.2568315226354);
      discretize0.m_CutPoints = doubleArray0;
      // Undeclared exception!
      try { 
        discretize0.getCutPoints(89);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 89
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      double[][] doubleArray0 = new double[10][2];
      discretize0.m_CutPoints = doubleArray0;
      // Undeclared exception!
      try { 
        discretize0.getBinRangesString(44);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 44
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  /**
  //Test case number: 30
  /*Coverage entropy=2.133628922152431
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.m_FindNumBins = true;
      discretize0.m_ClassIndex = (-554);
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

  /**
  //Test case number: 31
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Discretize discretize0 = new Discretize("");
      boolean boolean0 = true;
      discretize0.setInvertSelection(true);
      discretize0.getOptions();
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
  //Test case number: 32
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.m_IgnoreClass = true;
      discretize0.m_UseBinNumbers = true;
      discretize0.setMakeBinary(true);
      try { 
        discretize0.setInputFormat((Instances) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can't ignore class when changing the number of attributes!
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  /**
  //Test case number: 33
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.m_MakeBinary = true;
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
}