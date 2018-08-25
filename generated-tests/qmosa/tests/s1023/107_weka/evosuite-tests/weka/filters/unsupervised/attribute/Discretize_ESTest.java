/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 14:49:14 GMT 2018
 */

package weka.filters.unsupervised.attribute;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.Comparator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.evosuite.runtime.util.SystemInUtil;
import org.junit.runner.RunWith;
import weka.core.Attribute;
import weka.core.BinarySparseInstance;
import weka.core.Capabilities;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.SparseInstance;
import weka.filters.AllFilter;
import weka.filters.Filter;
import weka.filters.unsupervised.attribute.Discretize;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Discretize_ESTest extends Discretize_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      double[][] doubleArray0 = new double[4][7];
      double[] doubleArray1 = new double[9];
      doubleArray1[0] = (-302.3488556566);
      doubleArray1[1] = (-2224.0);
      doubleArray1[2] = 0.0;
      doubleArray1[3] = 5.3;
      doubleArray1[4] = (-1203.9936047);
      doubleArray1[5] = 1.0;
      doubleArray1[6] = 1157.939545584016;
      doubleArray1[7] = 2944.559766801748;
      doubleArray1[8] = 1.0;
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[2];
      doubleArray2[0] = 1157.939545584016;
      doubleArray2[1] = 5.3;
      doubleArray0[1] = doubleArray2;
      double[] doubleArray3 = new double[5];
      doubleArray3[0] = (-302.3488556566);
      doubleArray3[1] = 0.0;
      doubleArray3[2] = 5.3;
      doubleArray3[3] = 2520.075499733553;
      doubleArray3[4] = (-302.3488556566);
      doubleArray0[2] = doubleArray3;
      double[] doubleArray4 = new double[1];
      doubleArray4[0] = 0.0;
      doubleArray0[3] = doubleArray4;
      discretize0.m_CutPoints = doubleArray0;
      discretize0.globalInfo();
      assertFalse(discretize0.getMakeBinary());
      
      discretize0.setMakeBinary(true);
      discretize0.desiredWeightOfInstancesPerIntervalTipText();
      discretize0.getRevision();
      assertTrue(discretize0.getMakeBinary());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = "";
      Discretize discretize0 = new Discretize("");
      discretize0.setOutputFormat();
      discretize0.getCapabilities();
      Filter.makeCopies(discretize0, 0);
      discretize0.makeBinaryTipText();
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
  //Test case number: 2
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String[] stringArray0 = new String[2];
      int[] intArray0 = new int[5];
      intArray0[0] = 0;
      intArray0[1] = 0;
      intArray0[2] = 7;
      intArray0[3] = 504;
      intArray0[4] = 0;
      discretize0.setAttributeIndicesArray(intArray0);
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
  //Test case number: 3
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = "d;J}#+#";
      Discretize discretize0 = new Discretize("d;J}#+#");
      String[] stringArray0 = new String[0];
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
  //Test case number: 4
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.m_ClassIndex = (-678);
      discretize0.getInvertSelection();
      String string0 = discretize0.getRevision();
      assertEquals("8964", string0);
      
      discretize0.getCapabilities();
      discretize0.setAttributeIndices("");
      discretize0.getInvertSelection();
      discretize0.getInvertSelection();
      discretize0.setMakeBinary(false);
      Filter.makeCopies(discretize0, 40);
      int int0 = discretize0.getBins();
      assertEquals(10, int0);
      
      discretize0.getCapabilities();
      discretize0.setOutputFormat();
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getFindNumBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Discretize.main(stringArray0);
      Discretize discretize0 = new Discretize("fmZQY.A+V:(x");
      double[][] doubleArray0 = new double[2][6];
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = 2839.1;
      doubleArray1[1] = 747.3081629112396;
      doubleArray1[2] = 0.0;
      doubleArray1[3] = (-1.0);
      doubleArray1[4] = 0.0;
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[0];
      doubleArray0[1] = doubleArray2;
      discretize0.m_CutPoints = doubleArray0;
      // Undeclared exception!
      try { 
        discretize0.findNumBins((-1384));
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
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.m_DefaultCols = "";
      discretize0.setUseEqualFrequency(true);
      discretize0.m_MakeBinary = true;
      discretize0.invertSelectionTipText();
      discretize0.m_DefaultCols = "=";
      int int0 = 0;
      // Undeclared exception!
      try { 
        discretize0.findNumBins(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.772588722239781
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.getRevision();
      discretize0.getCapabilities();
      discretize0.listOptions();
      discretize0.getFindNumBins();
      discretize0.getDesiredWeightOfInstancesPerInterval();
      String[] stringArray0 = null;
      try { 
        Filter.filterFile(discretize0, (String[]) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // 
         // Unable to determine structure as arff (Reason: org.evosuite.runtime.mock.java.lang.MockThrowable: premature end of file, read Token[EOF], line 1).
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
  //Test case number: 8
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Discretize discretize0 = new Discretize("");
      discretize0.useBinNumbersTipText();
      int[] intArray0 = new int[9];
      intArray0[0] = 89;
      intArray0[1] = 0;
      intArray0[2] = 487;
      intArray0[3] = 0;
      intArray0[4] = 0;
      intArray0[5] = 1;
      intArray0[6] = 0;
      intArray0[7] = (-2275);
      intArray0[8] = (-2493);
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance(0.0, intArray0, 4);
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
  //Test case number: 9
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Discretize discretize0 = new Discretize("zsI\"HZ&(");
      discretize0.getAttributeIndices();
      discretize0.getCutPoints(859);
      discretize0.getUseBinNumbers();
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
  //Test case number: 10
  /*Coverage entropy=2.772588722239781
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.useBinNumbersTipText();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "Use bin numbers (eg BXofY) rather than ranges for for discretized attributes";
      stringArray0[1] = "Use bin numbers (eg BXofY) rather than ranges for for discretized attributes";
      stringArray0[2] = "Use bin numbers (eg BXofY) rather than ranges for for discretized attributes";
      stringArray0[3] = "Use bin numbers (eg BXofY) rather than ranges for for discretized attributes";
      discretize0.getRevision();
      stringArray0[4] = "Use bin numbers (eg BXofY) rather than ranges for for discretized attributes";
      discretize0.setOptions(stringArray0);
      discretize0.useEqualFrequencyTipText();
      discretize0.getCapabilities();
      int int0 = 3218;
      // Undeclared exception!
      try { 
        discretize0.findNumBins(3218);
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
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Discretize discretize0 = new Discretize("");
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      discretize0.setOptions(stringArray0);
      String string0 = discretize0.findNumBinsTipText();
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseEqualFrequency());
      assertEquals("Optimize number of equal-width bins using leave-one-out. Doesn't work for equal-frequency binning", string0);
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, true);
      Discretize discretize0 = new Discretize();
      discretize0.m_DefaultCols = "=J-!~txnrA";
      String[] stringArray0 = discretize0.getOptions();
      discretize0.setOptions(stringArray0);
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
      assertEquals(6, stringArray0.length);
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseEqualFrequency());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      Discretize discretize0 = new Discretize("$#");
      String string0 = discretize0.attributeIndicesTipText();
      assertEquals("Specify range of attributes to act on. This is a comma separated list of attribute indices, with \"first\" and \"last\" valid values. Specify an inclusive range with \"-\". E.g: \"first-3,5,6-10,last\".", string0);
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseEqualFrequency());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      double[][] doubleArray0 = new double[0][4];
      discretize0.m_CutPoints = doubleArray0;
      discretize0.setUseEqualFrequency(false);
      discretize0.getRevision();
      Discretize discretize1 = new Discretize("");
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
  //Test case number: 15
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Discretize discretize0 = new Discretize("QoP^(?lUQZh8c%,e1N");
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = 0.0;
      int[] intArray0 = new int[2];
      intArray0[0] = 3158;
      intArray0[1] = 15000;
      int int0 = 622;
      discretize0.binsTipText();
      discretize0.getCutPoints(15000);
      // Undeclared exception!
      try { 
        discretize0.findNumBins(3158);
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
  /*Coverage entropy=2.4260151319598084
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, true);
      Discretize discretize0 = new Discretize();
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "N7ezCS]=>");
      discretize0.m_DefaultCols = "=J-!~txnrA";
      discretize0.setUseEqualFrequency(true);
      discretize0.getOptions();
      // Undeclared exception!
      try { 
        discretize0.convertInstance((Instance) null);
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
      Discretize discretize0 = new Discretize();
      discretize0.getInvertSelection();
      discretize0.getBinRangesString(62);
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
  //Test case number: 18
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      double[][] doubleArray0 = new double[10][4];
      discretize0.m_CutPoints = doubleArray0;
      discretize0.setUseEqualFrequency(false);
      discretize0.getRevision();
      Discretize discretize1 = new Discretize("");
      // Undeclared exception!
      try { 
        discretize0.getCutPoints(110);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 110
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.3958857213716516
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.getRevision();
      Discretize discretize1 = new Discretize("");
      discretize1.setOutputFormat();
      discretize1.getOptions();
      // Undeclared exception!
      try { 
        discretize0.convertInstance((Instance) null);
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
  /*Coverage entropy=2.3114234446919735
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.m_UseBinNumbers = true;
      discretize0.getOptions();
      double double0 = 0.0;
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 0.0;
      // Undeclared exception!
      try { 
        discretize0.numPendingOutput();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // No output instance format defined
         //
         verifyException("weka.filters.Filter", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=2.17157089695751
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SystemInUtil.addInputLine("Optimize number of equal-width bins using leave-one-out. Doesn't work for equal-frequency binning");
      Discretize discretize0 = new Discretize("Optimize number of equal-width bins using leave-one-out. Doesn't work for equal-frequency binning");
      assertFalse(discretize0.getFindNumBins());
      
      discretize0.m_FindNumBins = true;
      discretize0.getOptions();
      assertTrue(discretize0.getFindNumBins());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=2.0431918705451206
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      double[][] doubleArray0 = new double[0][4];
      discretize0.m_CutPoints = doubleArray0;
      Discretize discretize1 = new Discretize();
      discretize1.setOutputFormat();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "The class index will be unset temporarily before the filter is applied.";
      FileSystemHandling.shouldAllThrowIOExceptions();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Attribute attribute0 = new Attribute((String) null, 39);
      arrayList0.add(attribute0);
      Instances instances0 = new Instances("0n<", arrayList0, 39);
      discretize1.setInputFormat(instances0);
      try { 
        discretize0.setOptions(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=2.5052899909184174
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      assertFalse(discretize0.getMakeBinary());
      
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Attribute attribute0 = new Attribute("-0OLkbjCD|R", (-1879048189));
      arrayList0.add(attribute0);
      Instances instances0 = new Instances((String) null, arrayList0, 0);
      AllFilter allFilter0 = new AllFilter();
      boolean boolean0 = discretize0.setInputFormat(instances0);
      assertFalse(boolean0);
      
      String[] stringArray0 = new String[4];
      stringArray0[0] = "B~HvU";
      stringArray0[1] = "real";
      stringArray0[2] = "relational";
      stringArray0[3] = "numeric";
      discretize0.setOptions(stringArray0);
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getFindNumBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=2.6062413911624556
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Attribute attribute0 = new Attribute("-0OLkbjCD|R", (-1879048151));
      arrayList0.add(attribute0);
      Instances instances0 = new Instances((String) null, arrayList0, 0);
      AllFilter allFilter0 = new AllFilter();
      discretize0.setInputFormat(instances0);
      discretize0.batchFinished();
      discretize0.getOutputFormat();
      int[] intArray0 = new int[3];
      intArray0[0] = 4;
      intArray0[1] = (-1879048151);
      intArray0[2] = (-1879048151);
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance((-1879048151), intArray0, 4);
      // Undeclared exception!
      try { 
        discretize0.calculateCutPointsByEqualFrequencyBinning((-3927));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3927
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=2.6883373254474634
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Attribute attribute0 = new Attribute("-0OLkbjCD|R", (-1879048151));
      arrayList0.add(attribute0);
      Instances instances0 = new Instances((String) null, arrayList0, 0);
      AllFilter allFilter0 = new AllFilter();
      discretize0.setInputFormat(instances0);
      discretize0.batchFinished();
      discretize0.getOutputFormat();
      int[] intArray0 = new int[3];
      intArray0[0] = 4;
      discretize0.batchFinished();
      discretize0.getOutputFormat();
      Discretize discretize1 = new Discretize();
      Discretize discretize2 = new Discretize("string");
      // Undeclared exception!
      try { 
        discretize2.findNumBins(4);
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
  /*Coverage entropy=2.739997406578141
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Attribute attribute0 = new Attribute("Copy with second attribute set to be missing: ", (-1879048151));
      arrayList0.add(attribute0);
      Instances instances0 = new Instances("-0OLkbjCD|R", arrayList0, 811);
      AllFilter allFilter0 = new AllFilter();
      discretize0.setInputFormat(instances0);
      discretize0.batchFinished();
      discretize0.getOutputFormat();
      Discretize discretize1 = new Discretize("string");
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance(1);
      boolean boolean0 = discretize0.input(binarySparseInstance0);
      assertFalse(discretize0.isNewBatch());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=2.821563807860364
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Attribute attribute0 = new Attribute("-2LkbmCDR", (-1879048189));
      arrayList0.add(attribute0);
      Instances instances0 = new Instances((String) null, arrayList0, 0);
      AllFilter allFilter0 = new AllFilter();
      discretize0.setInvertSelection(true);
      discretize0.setInputFormat(instances0);
      discretize0.batchFinished();
      discretize0.getOutputFormat();
      // Undeclared exception!
      try { 
        discretize0.convertInstance((Instance) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.8343719702816235
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Attribute attribute0 = new Attribute("Copy with second attribute set to be missing: ", (-1879048151));
      arrayList0.add(attribute0);
      Instances instances0 = new Instances("-0OLkbjCD|R", arrayList0, 811);
      AllFilter allFilter0 = new AllFilter();
      discretize0.setInputFormat(instances0);
      Instances instances1 = new Instances(instances0, 3);
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance(1);
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
  //Test case number: 29
  /*Coverage entropy=2.5466396686309767
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Attribute attribute0 = new Attribute("Specify range of attributes to act on. This is a comma separated list of attribute indices, with \"first\" and \"last\" valid values. Specify an inclusive range with \"-\". E.g: \"first-3,5,6-10,last\".", (-1879048151));
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      arrayList0.add(attribute0);
      Instances instances0 = new Instances("$#", arrayList0, 79);
      AllFilter allFilter0 = new AllFilter();
      Discretize discretize0 = new Discretize();
      discretize0.setInputFormat(instances0);
      discretize0.batchFinished();
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance(0);
      discretize0.input(binarySparseInstance0);
      assertFalse(discretize0.isNewBatch());
      
      discretize0.batchFinished();
      assertEquals(10, discretize0.getBins());
  }

  /**
  //Test case number: 30
  /*Coverage entropy=2.614962193558532
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      int int0 = (-1879048151);
      Attribute attribute0 = new Attribute("Specify range of attributes to act on. This is a comma separated list of attribute indices, with \"first and \"last\" valid values. Specify an inclusive range with \"-\". E.g: \"first-3,5,6-10,last\".", (-1879048151));
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/home/ubuntu/wekafiles");
      FileSystemHandling.shouldThrowIOException(evoSuiteFile0);
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("relational", arrayList0, 1018);
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      instances0.sort(comparator0);
      arrayList0.add(attribute0);
      instances0.toArray();
      AllFilter allFilter0 = new AllFilter();
      Discretize discretize0 = new Discretize();
      discretize0.setInputFormat(instances0);
      discretize0.batchFinished();
      Instances instances1 = new Instances(instances0, 0);
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance(1);
      discretize0.input(binarySparseInstance0);
      discretize0.input(binarySparseInstance0);
      System.setCurrentTimeMillis(1);
      // Undeclared exception!
      try { 
        discretize0.findNumBins(2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  /**
  //Test case number: 31
  /*Coverage entropy=2.6360014279164754
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Attribute attribute0 = new Attribute("Specify range of attributes to act on. This is a comma separated list of attribute indices, with \"first\" and \"last\" valid values. Specify an inclusive range with \"-\". E.g: \"first-3,5,6-10,last\".");
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("relational", arrayList0, 995);
      arrayList0.add(attribute0);
      instances0.toArray();
      AllFilter allFilter0 = new AllFilter();
      Discretize discretize0 = new Discretize();
      discretize0.setInputFormat(instances0);
      discretize0.batchFinished();
      Instances instances1 = new Instances(instances0, 0);
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance(1);
      discretize0.input(binarySparseInstance0);
      System.setCurrentTimeMillis(1);
      discretize0.getBinRangesString(0);
  }
}