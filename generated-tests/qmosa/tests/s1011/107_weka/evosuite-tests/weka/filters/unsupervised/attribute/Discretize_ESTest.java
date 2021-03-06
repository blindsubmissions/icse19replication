/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 11:20:00 GMT 2018
 */

package weka.filters.unsupervised.attribute;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.evosuite.runtime.util.SystemInUtil;
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
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = "";
      Discretize discretize0 = new Discretize("");
      String[] stringArray0 = new String[5];
      stringArray0[0] = "";
      stringArray0[1] = "";
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
  //Test case number: 1
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.getCapabilities();
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
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Discretize discretize0 = new Discretize("");
      int[] intArray0 = new int[7];
      intArray0[0] = 68;
      intArray0[1] = 0;
      intArray0[2] = (-80);
      intArray0[3] = 104;
      intArray0[4] = 0;
      intArray0[5] = 1622;
      intArray0[6] = 0;
      discretize0.setAttributeIndicesArray(intArray0);
      assertEquals(10, discretize0.getBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getUseEqualFrequency());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.70805020110221
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Discretize discretize0 = new Discretize("An instance filter that discretizes a range of numeric attributes in the dataset into nominal attributes. Discretization is by simple binning. Skips the class attribute if set.");
      boolean boolean0 = true;
      discretize0.setUseEqualFrequency(true);
      int int0 = (-3379);
      discretize0.getBinRangesString((-3379));
      discretize0.getMakeBinary();
      discretize0.setUseEqualFrequency(false);
      discretize0.listOptions();
      discretize0.desiredWeightOfInstancesPerIntervalTipText();
      discretize0.getCapabilities();
      AllFilter allFilter0 = new AllFilter();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "Sets the desired weight of instances per interval for equal-frequency binning.";
      stringArray0[1] = "Sets the desired weight of instances per interval for equal-frequency binning.";
      try { 
        Filter.filterFile(discretize0, stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // 
         // Illegal options: Sets the desired weight of instances per interval for equal-frequency binning. Sets the desired weight of instances per interval for equal-frequency binning. 
         // Filter options:
         // 
         // -unset-class-temporarily
         // \tUnsets the class index temporarily before the filter is
         // \tapplied to the data.
         // \t(default: no)
         // -B <num>
         // \tSpecifies the (maximum) number of bins to divide numeric attributes into.
         // \t(default = 10)
         // -M <num>
         // \tSpecifies the desired weight of instances per bin for
         // \tequal-frequency binning. If this is set to a positive
         // \tnumber then the -B option will be ignored.
         // \t(default = -1)
         // -F
         // \tUse equal-frequency instead of equal-width discretization.
         // -O
         // \tOptimize number of bins using leave-one-out estimate
         // \tof estimated entropy (for equal-width discretization).
         // \tIf this is set then the -B option will be ignored.
         // -R <col1,col2-col4,...>
         // \tSpecifies list of columns to Discretize. First and last are valid indexes.
         // \t(default: first-last)
         // -V
         // \tInvert matching sense of column indexes.
         // -D
         // \tOutput binary attributes for discretized attributes.
         // -Y
         // \tUse bin numbers rather than ranges for discretized attributes.
         // 
         // General options:
         // 
         // -h
         // \tGet help on available options.
         // \t(use -b -h for help on batch mode.)
         // -i <file>
         // \tThe name of the file containing input instances.
         // \tIf not supplied then instances will be read from stdin.
         // -o <file>
         // \tThe name of the file output instances will be written to.
         // \tIf not supplied then instances will be written to stdout.
         // -c <class index>
         // \tThe number of the attribute to use as the class.
         // \t\"first\" and \"last\" are also valid entries.
         // \tIf not supplied then no class is assigned.
         //
         verifyException("weka.filters.Filter", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.m_NumBins = 0;
      discretize0.setOutputFormat();
      discretize0.setDesiredWeightOfInstancesPerInterval(0.0);
      discretize0.getInvertSelection();
      double[][] doubleArray0 = new double[9][4];
      double[] doubleArray1 = new double[2];
      doubleArray1[0] = (double) 0;
      doubleArray1[1] = (double) 0;
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[7];
      doubleArray2[0] = 39.0;
      doubleArray2[1] = 0.0;
      doubleArray2[2] = (double) 0;
      doubleArray2[3] = (double) 0;
      doubleArray2[4] = (double) 0;
      doubleArray2[5] = (double) 0;
      doubleArray2[6] = (double) 0;
      doubleArray0[1] = doubleArray2;
      double[] doubleArray3 = new double[9];
      doubleArray3[0] = (double) 0;
      doubleArray3[1] = 39.0;
      doubleArray3[2] = (double) 0;
      doubleArray3[3] = 39.0;
      doubleArray3[4] = (double) 0;
      doubleArray3[5] = (double) 0;
      doubleArray3[6] = 0.0;
      doubleArray3[7] = (double) 0;
      doubleArray3[8] = (double) 0;
      doubleArray0[2] = doubleArray3;
      double[] doubleArray4 = new double[9];
      doubleArray4[0] = 0.0;
      doubleArray4[1] = (double) 0;
      doubleArray4[2] = 330.74447;
      doubleArray4[3] = (double) 0;
      doubleArray4[4] = 39.0;
      doubleArray4[5] = 0.0;
      doubleArray4[6] = 0.0;
      doubleArray4[7] = (double) 0;
      doubleArray4[8] = (double) 0;
      doubleArray0[3] = doubleArray4;
      double[] doubleArray5 = new double[8];
      doubleArray5[0] = (double) 0;
      doubleArray5[1] = 0.0;
      doubleArray5[2] = (double) 0;
      doubleArray5[3] = (double) 0;
      doubleArray5[4] = 0.0;
      doubleArray5[5] = (double) 0;
      doubleArray5[6] = (double) 0;
      doubleArray5[7] = (double) 0;
      doubleArray0[4] = doubleArray5;
      double[] doubleArray6 = new double[1];
      doubleArray6[0] = (double) 0;
      doubleArray0[5] = doubleArray6;
      double[] doubleArray7 = new double[6];
      doubleArray7[0] = (double) 0;
      doubleArray7[1] = 330.74447;
      doubleArray7[2] = (double) 0;
      doubleArray7[3] = (double) 0;
      doubleArray7[4] = 0.0;
      doubleArray7[5] = (double) 0;
      doubleArray0[6] = doubleArray7;
      double[] doubleArray8 = new double[6];
      doubleArray8[0] = (double) 0;
      doubleArray8[1] = (double) 0;
      doubleArray8[2] = (double) 0;
      doubleArray8[3] = 1357.81256541;
      doubleArray8[4] = 330.74447;
      doubleArray8[5] = 330.74447;
      doubleArray0[7] = doubleArray8;
      double[] doubleArray9 = new double[6];
      doubleArray9[0] = 330.74447;
      doubleArray9[1] = 1357.81256541;
      doubleArray9[2] = (double) 0;
      doubleArray9[3] = (double) 0;
      doubleArray9[4] = 0.0;
      doubleArray9[5] = 1357.81256541;
      doubleArray0[8] = doubleArray9;
      discretize0.m_CutPoints = doubleArray0;
      // Undeclared exception!
      try { 
        discretize0.calculateCutPointsByEqualWidthBinning(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Discretize discretize0 = new Discretize("%=Rf2BbNv60N3onP");
      discretize0.makeBinaryTipText();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "%=Rf2BbNv60N3onP";
      stringArray0[1] = "%=Rf2BbNv60N3onP";
      stringArray0[2] = "%=Rf2BbNv60N3onP";
      stringArray0[3] = "r@Q)Z";
      stringArray0[4] = "Make resulting attributes binary.";
      stringArray0[5] = "";
      stringArray0[6] = "Make resulting attributes binary.";
      stringArray0[7] = "Make resulting attributes binary.";
      try { 
        Filter.batchFilterFile(discretize0, stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // 
         // No first input file given.
         // 
         // Filter options:
         // 
         // -unset-class-temporarily
         // \tUnsets the class index temporarily before the filter is
         // \tapplied to the data.
         // \t(default: no)
         // -B <num>
         // \tSpecifies the (maximum) number of bins to divide numeric attributes into.
         // \t(default = 10)
         // -M <num>
         // \tSpecifies the desired weight of instances per bin for
         // \tequal-frequency binning. If this is set to a positive
         // \tnumber then the -B option will be ignored.
         // \t(default = -1)
         // -F
         // \tUse equal-frequency instead of equal-width discretization.
         // -O
         // \tOptimize number of bins using leave-one-out estimate
         // \tof estimated entropy (for equal-width discretization).
         // \tIf this is set then the -B option will be ignored.
         // -R <col1,col2-col4,...>
         // \tSpecifies list of columns to Discretize. First and last are valid indexes.
         // \t(default: first-last)
         // -V
         // \tInvert matching sense of column indexes.
         // -D
         // \tOutput binary attributes for discretized attributes.
         // -Y
         // \tUse bin numbers rather than ranges for discretized attributes.
         // 
         // General options:
         // 
         // -h
         // \tGet help on available options.
         // -i <filename>
         // \tThe file containing first input instances.
         // -o <filename>
         // \tThe file first output instances will be written to.
         // -r <filename>
         // \tThe file containing second input instances.
         // -s <filename>
         // \tThe file second output instances will be written to.
         // -c <class index>
         // \tThe number of the attribute to use as the class.
         // \t\"first\" and \"last\" are also valid entries.
         // \tIf not supplied then no class is assigned.
         //
         verifyException("weka.filters.Filter", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.m_MakeBinary = false;
      discretize0.setUseBinNumbers(true);
      int int0 = 13;
      discretize0.setBins(13);
      discretize0.getBinRangesString(13);
      discretize0.setBins(13);
      discretize0.m_UseBinNumbers = true;
      discretize0.useEqualFrequencyTipText();
      discretize0.setInvertSelection(true);
      int int1 = 840;
      discretize0.setBins(840);
      discretize0.getRevision();
      discretize0.m_UseEqualFrequency = false;
      // Undeclared exception!
      try { 
        discretize0.calculateCutPointsByEqualFrequencyBinning(13);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.Instances", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Discretize discretize0 = new Discretize("Y");
      discretize0.setBins(41);
      discretize0.setOutputFormat();
      discretize0.getCutPoints(479);
      discretize0.getRevision();
      assertEquals(41, discretize0.getBins());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.useEqualFrequencyTipText();
      discretize0.getUseEqualFrequency();
      discretize0.invertSelectionTipText();
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
  //Test case number: 9
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[0] = "B2q0|Fe";
      stringArray0[1] = "4";
      stringArray0[3] = "B2q0|Fe";
      stringArray0[4] = "4";
      stringArray0[5] = "-O";
      stringArray0[6] = "iN";
      stringArray0[7] = "'3k";
      Discretize discretize0 = new Discretize();
      discretize0.attributeIndicesTipText();
      String string0 = discretize0.attributeIndicesTipText();
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals("Specify range of attributes to act on. This is a comma separated list of attribute indices, with \"first\" and \"last\" valid values. Specify an inclusive range with \"-\". E.g: \"first-3,5,6-10,last\".", string0);
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getFindNumBins());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.03195622385697
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Discretize discretize0 = new Discretize("n;Nq");
      Range range0 = new Range();
      discretize0.m_DiscretizeCols = range0;
      discretize0.getOptions();
      discretize0.m_FindNumBins = false;
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
  //Test case number: 11
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.globalInfo();
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-83);
      byteArray0[2] = (byte)118;
      byteArray0[3] = (byte)68;
      byteArray0[4] = (byte) (-76);
      byteArray0[5] = (byte)1;
      byteArray0[6] = (byte) (-76);
      byteArray0[7] = (byte)6;
      byteArray0[8] = (byte) (-51);
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      // Undeclared exception!
      try { 
        discretize0.findNumBins((-729));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String[] stringArray0 = discretize0.getOptions();
      assertEquals(6, stringArray0.length);
      
      Discretize discretize1 = new Discretize();
      discretize0.setIgnoreClass(true);
      discretize0.getBinRangesString(2639);
      boolean boolean0 = discretize0.getFindNumBins();
      assertFalse(boolean0);
      
      discretize0.getAttributeIndices();
      discretize0.getCapabilities();
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getUseBinNumbers());
      
      String string0 = discretize1.binsTipText();
      assertEquals("Number of bins.", string0);
      assertEquals((-1.0), discretize1.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertEquals(10, discretize1.getBins());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "4:";
      int int0 = 2374;
      discretize0.m_ClassIndex = 2374;
      stringArray0[1] = "Headers don't match:\n";
      discretize0.setOptions(stringArray0);
      Discretize.main(stringArray0);
      discretize0.findNumBinsTipText();
      // Undeclared exception!
      try { 
        discretize0.findNumBins(2374);
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
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Discretize discretize0 = new Discretize("%A-oi@");
      discretize0.getCutPoints(479);
      Discretize discretize1 = new Discretize("%A-oi@");
      String string0 = discretize1.getRevision();
      assertEquals("8964", string0);
      
      String string1 = discretize0.useBinNumbersTipText();
      assertEquals(10, discretize0.getBins());
      assertEquals("Use bin numbers (eg BXofY) rather than ranges for for discretized attributes", string1);
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getMakeBinary());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getUseBinNumbers());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Discretize discretize0 = new Discretize("Y");
      String[] stringArray0 = discretize0.getOptions();
      FileSystemHandling.shouldAllThrowIOExceptions();
      discretize0.setOptions(stringArray0);
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getFindNumBins());
      assertEquals(6, stringArray0.length);
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getUseBinNumbers());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.1639556568820564
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.getRevision();
      discretize0.m_FindNumBins = true;
      discretize0.getOptions();
      // Undeclared exception!
      try { 
        discretize0.findNumBins(787);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String[] stringArray0 = new String[3];
      Discretize.main(stringArray0);
      Discretize discretize0 = new Discretize("vuR|#X;C_.ql}p");
      int[] intArray0 = new int[8];
      intArray0[0] = 2;
      intArray0[1] = 2147483645;
      intArray0[2] = 66;
      intArray0[3] = (-1968526675);
      intArray0[4] = 79;
      intArray0[5] = (-1789569704);
      intArray0[6] = 986;
      intArray0[7] = 123;
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance((-1443.884), intArray0, (-326));
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
  //Test case number: 18
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Discretize discretize0 = new Discretize("n #,by(/1k");
      Locale.getISOLanguages();
      FileSystemHandling.shouldAllThrowIOExceptions();
      discretize0.getBinRangesString(255);
      discretize0.getOptions();
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance(82);
      BinarySparseInstance binarySparseInstance1 = new BinarySparseInstance((Instance) binarySparseInstance0);
      binarySparseInstance1.dataset();
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
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Discretize discretize0 = new Discretize("    runFilter(new WekaWrapper(), args);\n");
      assertFalse(discretize0.getMakeBinary());
      
      discretize0.setMakeBinary(true);
      discretize0.getCapabilities();
      discretize0.getBinRangesString(44);
      assertTrue(discretize0.getMakeBinary());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=2.8053739589572353
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      SystemInUtil.addInputLine("\tSpecifies list of columns to Discretize. First and last are valid indexes.\n\t(default: first-last)");
      String[] stringArray0 = new String[9];
      stringArray0[0] = "\tSpecifies list of columns to Discretize. First and last are valid indexes.\n\t(default: first-last)";
      stringArray0[1] = "\tSpecifies list of columns to Discretize. First and last are valid indexes.\n\t(default: first-last)";
      stringArray0[2] = "aa";
      stringArray0[3] = "aa";
      stringArray0[4] = "aa";
      stringArray0[5] = "aa";
      stringArray0[6] = "\tSpecifies list of columns to Discretize. First and last are valid indexes.\n\t(default: first-last)";
      stringArray0[7] = "\tSpecifies list of columns to Discretize. First and last are valid indexes.\n\t(default: first-last)";
      stringArray0[8] = "aa";
      Discretize.main(stringArray0);
      Discretize discretize0 = new Discretize();
      discretize0.setInvertSelection(true);
      String[] stringArray1 = discretize0.getOptions();
      assertEquals(10, discretize0.getBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertEquals(7, stringArray1.length);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=2.3693821196946767
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SystemInUtil.addInputLine("g8Vk[71#8oWIS");
      Discretize discretize0 = new Discretize();
      discretize0.m_IgnoreClass = true;
      FileSystemHandling.shouldAllThrowIOExceptions();
      String[] stringArray0 = discretize0.getOptions();
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertEquals(7, stringArray0.length);
      assertEquals(10, discretize0.getBins());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      Discretize discretize0 = new Discretize();
      FileSystemHandling.shouldAllThrowIOExceptions();
      double[][] doubleArray0 = new double[8][1];
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = 0.0;
      doubleArray1[1] = (-541.7413606279048);
      doubleArray1[2] = 5.3;
      doubleArray1[3] = 0.0;
      doubleArray1[4] = 0.0;
      doubleArray1[5] = 0.0;
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[6];
      doubleArray2[0] = 0.0;
      doubleArray2[1] = 0.0;
      doubleArray2[2] = 0.0;
      doubleArray2[3] = (-541.7413606279048);
      doubleArray2[4] = 0.0;
      doubleArray2[5] = 5.3;
      doubleArray0[1] = doubleArray2;
      double[] doubleArray3 = new double[2];
      doubleArray3[0] = 0.0;
      doubleArray3[1] = 0.0;
      doubleArray0[2] = doubleArray3;
      double[] doubleArray4 = new double[6];
      doubleArray4[0] = 0.0;
      doubleArray4[1] = 0.0;
      doubleArray4[2] = 0.0;
      doubleArray4[3] = 0.0;
      doubleArray4[4] = 0.0;
      doubleArray4[5] = 0.0;
      doubleArray0[3] = doubleArray4;
      double[] doubleArray5 = new double[4];
      doubleArray5[0] = 0.0;
      doubleArray5[1] = 0.0;
      doubleArray5[2] = 0.0;
      doubleArray5[3] = 0.0;
      doubleArray0[4] = doubleArray5;
      double[] doubleArray6 = new double[0];
      doubleArray0[5] = doubleArray6;
      double[] doubleArray7 = new double[2];
      doubleArray7[0] = (-541.7413606279048);
      doubleArray7[1] = 0.0;
      doubleArray0[6] = doubleArray7;
      double[] doubleArray8 = new double[4];
      doubleArray8[0] = 0.0;
      doubleArray8[1] = 0.0;
      doubleArray8[2] = (-541.7413606279048);
      doubleArray8[3] = 0.0;
      doubleArray0[7] = doubleArray8;
      discretize0.m_CutPoints = doubleArray0;
      Filter.makeCopy(discretize0);
      // Undeclared exception!
      try { 
        discretize0.getCutPoints(2147483645);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2147483645
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=2.685945324669788
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      Discretize discretize0 = new Discretize();
      discretize0.setMakeBinary(true);
      discretize0.getOptions();
      int[] intArray0 = new int[1];
      intArray0[0] = 1;
      discretize0.setAttributeIndicesArray(intArray0);
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-84);
      byteArray0[1] = (byte) (-91);
      byteArray0[2] = (byte) (-84);
      byteArray0[3] = (byte) (-84);
      byteArray0[4] = (byte) (-84);
      byteArray0[5] = (byte) (-84);
      byteArray0[6] = (byte) (-84);
      byteArray0[7] = (byte) (-84);
      byteArray0[8] = (byte) (-84);
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "4");
      discretize0.getBinRangesString(276);
      // Undeclared exception!
      try { 
        discretize0.calculateCutPointsByEqualFrequencyBinning((-213));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.Instances", e);
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=2.809678234077784
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Discretize discretize0 = new Discretize("Y");
      assertFalse(discretize0.getUseBinNumbers());
      
      discretize0.m_UseBinNumbers = true;
      String[] stringArray0 = discretize0.getOptions();
      FileSystemHandling.shouldAllThrowIOExceptions();
      discretize0.setOptions(stringArray0);
      discretize0.getOptions();
      assertTrue(discretize0.getUseBinNumbers());
  }

  /**
  //Test case number: 25
  /*Coverage entropy=2.507026435557418
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Discretize discretize0 = new Discretize("zI%8m9");
      discretize0.setAttributeIndices("NpEi;^fx63B");
      discretize0.setUseEqualFrequency(true);
      SystemInUtil.addInputLine("zI%8m9");
      discretize0.setUseBinNumbers(false);
      int int0 = 185;
      Filter.makeCopies(discretize0, 185);
      discretize0.getOptions();
      int int1 = (-2884);
      // Undeclared exception!
      try { 
        discretize0.findNumBins((-2884));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  /**
  //Test case number: 26
  /*Coverage entropy=2.0431918705451206
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      Attribute attribute0 = new Attribute("Options:\n\t-list-packages <all | installed | available>\n\t-package-info <repository | installed | archive> <packageName | packageZip>\n\t-install-package <packageName | packageZip | URL> [version]\n\t-uninstall-package packageName\n\t-refresh-cache", (-1717986916));
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      arrayList0.add(attribute0);
      Instances instances0 = new Instances("string", arrayList0, 3);
      Discretize discretize0 = new Discretize();
      Attribute attribute1 = new Attribute("[Weka] loading ", (List<String>) null);
      attribute0.addStringValue(attribute1, 0);
      discretize0.setInputFormat(instances0);
      // Undeclared exception!
      try { 
        discretize0.calculateCutPointsByEqualFrequencyBinning(2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  /**
  //Test case number: 27
  /*Coverage entropy=2.739997406578141
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      Attribute attribute0 = new Attribute("Options:\n\t-list-packages <all | installed | available>\n\t-package-info <repository | installed | archive> <packageName | packageZip>\n\t-install-package <packageName | packageZip | URL> [version]\n\t-uninstall-package packageName\n\t-refresh-cache", (-1717986916));
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      arrayList0.add(attribute0);
      Instances instances0 = new Instances("string", arrayList0, 3);
      Discretize discretize0 = new Discretize();
      Attribute attribute1 = new Attribute("[Weka] loading ", (List<String>) null);
      attribute0.addStringValue(attribute1, 0);
      discretize0.setInputFormat(instances0);
      discretize0.batchFinished();
      discretize0.findNumBins(0);
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 5.7;
      DenseInstance denseInstance0 = new DenseInstance(0.0, doubleArray0);
      discretize0.input(denseInstance0);
      discretize0.batchFinished();
      System.setCurrentTimeMillis(1219L);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=2.5641781457665154
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      Attribute attribute0 = new Attribute("Options:\n\t-list-packages <all | installed | available>\n\t-package-info <repository | installed | archive> <packageName | packageZip>\n\t-install-package <packageName | packageZip | URL> [version]\n\t-uninstall-package packageName\n\t-refresh-cache", (-1717986916));
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      arrayList0.add(attribute0);
      Instances instances0 = new Instances("string", arrayList0, 3);
      Discretize discretize0 = new Discretize();
      Attribute attribute1 = new Attribute("[Weka] loading ", (List<String>) null);
      attribute0.addStringValue(attribute1, 0);
      discretize0.setInputFormat(instances0);
      discretize0.batchFinished();
      discretize0.findNumBins(0);
      double[] doubleArray0 = new double[11];
      doubleArray0[0] = 5.7;
      discretize0.getBinRangesString(0);
      Instances instances1 = null;
      // Undeclared exception!
      try { 
        discretize0.findNumBins(2147483645);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2147483645
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.8343719702816235
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      Attribute attribute0 = new Attribute("Options:\n\t-list-packages <all | installed | available>\n\t-package-info <repository | installed | archive> <packageName | packageZip>\n\t-install-package <packageName | packageZip | URL> [version]\n\t-uninstall-package packageName\n\t-refresh-cache", (-1717986916));
      FileSystemHandling.shouldAllThrowIOExceptions();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      arrayList0.add(attribute0);
      Instances instances0 = new Instances("string", arrayList0, 3);
      Discretize discretize0 = new Discretize();
      Attribute attribute1 = new Attribute("[Weka] loading ", (List<String>) null);
      attribute1.equals((Object) null);
      attribute0.addStringValue(attribute1, 0);
      attribute0.equalsMsg((Object) null);
      Discretize discretize1 = new Discretize();
      Attribute attribute2 = new Attribute(".arff", (List<String>) null);
      discretize1.setInputFormat(instances0);
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) (-1717986916);
      doubleArray0[1] = (double) (-1);
      doubleArray0[2] = (double) 4;
      doubleArray0[3] = (double) 0;
      int[] intArray0 = new int[8];
      intArray0[0] = 0;
      intArray0[1] = 3;
      intArray0[2] = (-1717986916);
      intArray0[3] = (-1717986916);
      intArray0[4] = 1;
      intArray0[5] = 2528;
      intArray0[6] = 0;
      intArray0[7] = 2;
      SparseInstance sparseInstance0 = new SparseInstance(1, doubleArray0, intArray0, 3);
      // Undeclared exception!
      try { 
        discretize1.input(sparseInstance0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Instance has no dataset assigned!!
         //
         verifyException("weka.core.RelationalLocator", e);
      }
  }
}
