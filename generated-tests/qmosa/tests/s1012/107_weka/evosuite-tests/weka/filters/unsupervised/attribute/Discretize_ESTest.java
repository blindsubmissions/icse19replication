/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 11:31:16 GMT 2018
 */

package weka.filters.unsupervised.attribute;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
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
      Discretize discretize0 = new Discretize("");
      discretize0.attributeIndicesTipText();
      int int0 = 0;
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance(0);
      discretize0.getBinRangesString(6);
      SparseInstance sparseInstance0 = new SparseInstance((SparseInstance) binarySparseInstance0);
      // Undeclared exception!
      try { 
        binarySparseInstance0.setClassValue("");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // DenseInstance doesn't have access to a dataset!
         //
         verifyException("weka.core.AbstractInstance", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.setMakeBinary(true);
      String[] stringArray0 = new String[4];
      int[] intArray0 = new int[4];
      intArray0[0] = 2553;
      intArray0[1] = 0;
      intArray0[2] = (-1);
      intArray0[3] = 82;
      discretize0.setAttributeIndicesArray(intArray0);
      stringArray0[0] = "";
      stringArray0[1] = "'B";
      stringArray0[2] = "J7Xnki_:EPs>";
      stringArray0[3] = "qt*;'_R?d/n]#3i";
      discretize0.setOptions(stringArray0);
      discretize0.getCapabilities();
      discretize0.m_NumBins = 13;
      boolean boolean0 = false;
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
  //Test case number: 2
  /*Coverage entropy=2.772588722239781
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.getInvertSelection();
      discretize0.getOptions();
      discretize0.listOptions();
      discretize0.getAttributeIndices();
      discretize0.setAttributeIndices("   * turns the Instances object into an array of Objects\n");
      discretize0.getBins();
      discretize0.m_FindNumBins = false;
      discretize0.invertSelectionTipText();
      discretize0.setOutputFormat();
      int int0 = 368;
      discretize0.setBins(368);
      discretize0.setBins(10);
      discretize0.listOptions();
      discretize0.m_ClassIndex = 368;
      discretize0.getInvertSelection();
      boolean boolean0 = false;
      // Undeclared exception!
      try { 
        discretize0.calculateCutPointsByEqualWidthBinning(368);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=3.0910424533583143
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.getCapabilities();
      discretize0.getOptions();
      String[] stringArray0 = new String[2];
      discretize0.toString();
      discretize0.m_NumBins = 2177;
      stringArray0[0] = "X~o9}(Are_";
      stringArray0[1] = "%R'>d1,FA}roDNWx";
      discretize0.setOptions(stringArray0);
      discretize0.setOutputFormat();
      discretize0.getRevision();
      discretize0.setDesiredWeightOfInstancesPerInterval((-1118.7185));
      String[] stringArray1 = new String[1];
      stringArray1[0] = "X~o9}(Are_";
      discretize0.setOptions(stringArray1);
      discretize0.m_DiscretizeCols = null;
      discretize0.setMakeBinary(false);
      // Undeclared exception!
      try { 
        discretize0.getAttributeIndices();
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
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Discretize discretize0 = new Discretize("$Revision: 8964 $");
      int int0 = 278;
      double[][] doubleArray0 = new double[4][3];
      double[] doubleArray1 = new double[9];
      doubleArray1[0] = (double) 278;
      doubleArray1[1] = (double) 278;
      discretize0.m_FindNumBins = true;
      doubleArray1[2] = (double) 278;
      doubleArray1[3] = (double) 278;
      doubleArray1[4] = (double) 278;
      doubleArray1[5] = (double) 278;
      doubleArray1[6] = (double) 278;
      doubleArray1[7] = 5.3;
      doubleArray1[8] = (double) 278;
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[0];
      doubleArray0[1] = doubleArray2;
      double[] doubleArray3 = new double[0];
      doubleArray0[2] = doubleArray3;
      double[] doubleArray4 = new double[4];
      doubleArray4[0] = (double) 278;
      doubleArray4[1] = 5.3;
      doubleArray4[2] = 5.3;
      doubleArray4[3] = (double) 278;
      doubleArray0[3] = doubleArray4;
      discretize0.m_CutPoints = doubleArray0;
      discretize0.m_NumBins = 278;
      discretize0.getInvertSelection();
      discretize0.getOptions();
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
  //Test case number: 5
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.globalInfo();
      int[] intArray0 = new int[3];
      intArray0[0] = 709;
      intArray0[1] = 1035;
      intArray0[2] = (-1550);
      discretize0.setAttributeIndicesArray(intArray0);
      discretize0.globalInfo();
      discretize0.desiredWeightOfInstancesPerIntervalTipText();
      discretize0.desiredWeightOfInstancesPerIntervalTipText();
      discretize0.getDesiredWeightOfInstancesPerInterval();
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) (-1550);
      doubleArray0[1] = (double) (-1550);
      doubleArray0[2] = (double) (-1550);
      doubleArray0[3] = (double) (-1550);
      doubleArray0[4] = (double) (-1550);
      doubleArray0[5] = (double) 709;
      SparseInstance sparseInstance0 = null;
      try {
        sparseInstance0 = new SparseInstance((-1416.322257413), doubleArray0, intArray0, 1035);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("weka.core.SparseInstance", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.582306344313967
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.getRevision();
      discretize0.m_DefaultCols = "8964";
      String[] stringArray0 = new String[9];
      stringArray0[0] = "8964";
      stringArray0[1] = "8964";
      stringArray0[2] = "8964";
      stringArray0[3] = "8964";
      stringArray0[4] = "8964";
      stringArray0[5] = "8964";
      stringArray0[6] = "";
      stringArray0[7] = "8964";
      stringArray0[8] = "8964";
      discretize0.setOptions(stringArray0);
      discretize0.m_CutPoints = null;
      discretize0.desiredWeightOfInstancesPerIntervalTipText();
      discretize0.listOptions();
      discretize0.setOutputFormat();
      discretize0.desiredWeightOfInstancesPerIntervalTipText();
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance(1426);
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
  //Test case number: 7
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String string0 = discretize0.binsTipText();
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getFindNumBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertEquals("Number of bins.", string0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.setDesiredWeightOfInstancesPerInterval(1428.36438397344);
      discretize0.useBinNumbersTipText();
      assertEquals(1428.36438397344, discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      
      String[] stringArray0 = new String[7];
      stringArray0[0] = "IF";
      stringArray0[1] = "Use bin numbers (eg BXofY) rather than ranges for for discretized attributes";
      stringArray0[2] = "Use bin numbers (eg BXofY) rather than ranges for for discretized attributes";
      stringArray0[3] = "Use bin numbers (eg BXofY) rather than ranges for for discretized attributes";
      stringArray0[4] = "Use bin numbers (eg BXofY) rather than ranges for for discretized attributes";
      stringArray0[5] = "Use bin numbers (eg BXofY) rather than ranges for for discretized attributes";
      stringArray0[6] = "Use bin numbers (eg BXofY) rather than ranges for for discretized attributes";
      discretize0.setOptions(stringArray0);
      assertEquals("Use bin numbers (eg BXofY) rather than ranges for for discretized attributes", discretize0.useBinNumbersTipText());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Discretize discretize0 = new Discretize("Kn3Ru! SYV");
      discretize0.getBinRangesString(86);
      discretize0.setOutputFormat();
      String string0 = discretize0.useEqualFrequencyTipText();
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseEqualFrequency());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertEquals("If set to true, equal-frequency binning will be used instead of equal-width binning.", string0);
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.m_DefaultCols = "first-last";
      discretize0.m_MakeBinary = true;
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
  //Test case number: 11
  /*Coverage entropy=2.3958857213716516
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Discretize discretize0 = new Discretize("SH\"[\"OiB");
      Range range0 = new Range();
      discretize0.m_DiscretizeCols = range0;
      String[] stringArray0 = discretize0.getOptions();
      assertEquals(4, stringArray0.length);
      
      discretize0.setUseEqualFrequency(false);
      discretize0.getAttributeIndices();
      discretize0.getCutPoints(791);
      discretize0.getInvertSelection();
      discretize0.getUseBinNumbers();
      String string0 = discretize0.makeBinaryTipText();
      assertEquals("Make resulting attributes binary.", string0);
      
      discretize0.setUseBinNumbers(false);
      assertEquals(10, discretize0.getBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getUseEqualFrequency());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (double) 278;
      String[] stringArray0 = new String[5];
      stringArray0[0] = "";
      stringArray0[1] = "$Revision: 8964 $";
      stringArray0[2] = "// Timestamp: ";
      stringArray0[3] = "";
      stringArray0[4] = "$Revision: 8964 $";
      Discretize discretize0 = new Discretize();
      discretize0.findNumBinsTipText();
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
  //Test case number: 13
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SystemInUtil.addInputLine("jZ4}.L_ALR2&S");
      SystemInUtil.addInputLine("UOwCOa 2~Q/I k");
      Discretize discretize0 = new Discretize("jZ4}.L_ALR2&S");
      discretize0.setFindNumBins(false);
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, true);
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
  //Test case number: 14
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Discretize discretize0 = new Discretize();
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
  //Test case number: 15
  /*Coverage entropy=3.0752205480543715
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "first-last";
      stringArray0[1] = "jZ4}.L_ALR2&S";
      stringArray0[2] = "\tOutput binary attributes for discretized attributes.";
      stringArray0[3] = "H/1A9B";
      stringArray0[4] = "Make resulting attributes binary.";
      stringArray0[5] = "";
      stringArray0[6] = "T}Or=FW-:(]\u0003@";
      stringArray0[7] = "AR:";
      Discretize.main(stringArray0);
      String[] stringArray1 = discretize0.getOptions();
      Filter.runFilter(discretize0, stringArray1);
      Discretize discretize1 = new Discretize();
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
  //Test case number: 16
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Discretize discretize0 = new Discretize("$Revision: 8964 $");
      int int0 = 278;
      double[][] doubleArray0 = new double[4][3];
      double[] doubleArray1 = new double[9];
      doubleArray1[0] = (double) 278;
      doubleArray1[1] = (double) 278;
      doubleArray1[3] = (double) 278;
      doubleArray1[5] = (double) 278;
      doubleArray1[6] = (double) 278;
      doubleArray1[7] = 5.3;
      doubleArray1[8] = (double) 278;
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[0];
      doubleArray0[1] = doubleArray2;
      doubleArray0[2] = doubleArray2;
      discretize0.m_NumBins = (-3900);
      double[] doubleArray3 = new double[4];
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      doubleArray3[1] = 5.3;
      doubleArray3[2] = 5.3;
      doubleArray3[3] = (double) 278;
      doubleArray0[3] = doubleArray3;
      discretize0.m_CutPoints = doubleArray0;
      // Undeclared exception!
      try { 
        discretize0.getCutPoints(679);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 679
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Discretize discretize0 = new Discretize("\tOptimize number of:bins using leave-one-out estimate\n\tof estimated e5tropy (for equal-width discretization).\n\tIf this is set then the -B option will be ignored.");
      Discretize discretize1 = new Discretize();
      double[][] doubleArray0 = new double[9][0];
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = 2626.0;
      doubleArray1[1] = 1.2;
      doubleArray1[2] = (-3244.81278056397);
      doubleArray1[3] = 0.0;
      doubleArray1[4] = 2124.0;
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[8];
      doubleArray2[0] = 1.2;
      doubleArray2[1] = 0.0;
      doubleArray2[2] = 0.0;
      doubleArray2[3] = 2124.0;
      doubleArray2[4] = 0.0;
      doubleArray2[5] = 2626.0;
      doubleArray2[6] = 1.2;
      doubleArray2[7] = 2124.0;
      doubleArray0[1] = doubleArray2;
      double[] doubleArray3 = new double[2];
      doubleArray3[0] = 0.0;
      doubleArray3[1] = 0.0;
      doubleArray0[2] = doubleArray3;
      double[] doubleArray4 = new double[3];
      doubleArray4[0] = (-3244.81278056397);
      doubleArray4[1] = 1.2;
      doubleArray4[2] = 0.0;
      doubleArray0[3] = doubleArray4;
      double[] doubleArray5 = new double[8];
      doubleArray5[0] = (-3244.81278056397);
      doubleArray5[1] = 2626.0;
      doubleArray5[2] = (-3244.81278056397);
      doubleArray5[3] = 2124.0;
      doubleArray5[4] = 1.2;
      doubleArray5[5] = (-3244.81278056397);
      doubleArray5[6] = 1.2;
      doubleArray5[7] = 2124.0;
      doubleArray0[4] = doubleArray5;
      double[] doubleArray6 = new double[3];
      doubleArray6[0] = 100.0;
      doubleArray6[1] = 2626.0;
      doubleArray6[2] = 2626.0;
      doubleArray0[5] = doubleArray6;
      double[] doubleArray7 = new double[6];
      doubleArray7[0] = (-365.9673181);
      doubleArray7[1] = 2626.0;
      doubleArray7[2] = (-1.0);
      doubleArray7[3] = (-3244.81278056397);
      doubleArray7[4] = 0.0;
      doubleArray7[5] = 2626.0;
      doubleArray0[6] = doubleArray7;
      double[] doubleArray8 = new double[7];
      doubleArray8[0] = 1.2;
      doubleArray8[1] = 2626.0;
      doubleArray8[2] = 2626.0;
      doubleArray8[3] = 1.0;
      doubleArray8[4] = 2626.0;
      doubleArray8[5] = (-888.882);
      doubleArray8[6] = 1.2;
      doubleArray0[7] = doubleArray8;
      double[] doubleArray9 = new double[4];
      doubleArray9[0] = (-1.0);
      doubleArray9[1] = 2626.0;
      doubleArray9[2] = 1.0;
      doubleArray9[3] = (-888.882);
      doubleArray0[8] = doubleArray9;
      discretize1.m_CutPoints = doubleArray0;
      // Undeclared exception!
      try { 
        discretize1.getBinRangesString(44);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 44
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.458311329683084
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Discretize discretize0 = new Discretize("KX+R${#G ");
      discretize0.setIgnoreClass(true);
      discretize0.getOptions();
      discretize0.getBinRangesString(86);
      int[] intArray0 = new int[3];
      intArray0[0] = 86;
      intArray0[1] = 86;
      intArray0[2] = 86;
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance((-2491.519185546041), intArray0, 86);
      BinarySparseInstance binarySparseInstance1 = new BinarySparseInstance((SparseInstance) binarySparseInstance0);
      SparseInstance sparseInstance0 = new SparseInstance((SparseInstance) binarySparseInstance1);
      // Undeclared exception!
      try { 
        binarySparseInstance0.relationalValue(6);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // DenseInstance doesn't have access to a dataset!
         //
         verifyException("weka.core.AbstractInstance", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.5400363038209806
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SystemInUtil.addInputLine("    ");
      Discretize discretize0 = new Discretize();
      Filter.makeCopy(discretize0);
      discretize0.getAttributeIndices();
      assertFalse(discretize0.getMakeBinary());
      
      discretize0.setMakeBinary(true);
      discretize0.setOutputFormat();
      discretize0.getOptions();
      assertTrue(discretize0.getMakeBinary());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=2.3114234446919735
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SystemInUtil.addInputLine("An instance filer that discretizes a range of numeric attributes in the dataset into nominal attributes. Discretization is by simple binning. Skips the class attribute if set.");
      Discretize discretize0 = new Discretize("An instance filer that discretizes a range of numeric attributes in the dataset into nominal attributes. Discretization is by simple binning. Skips the class attribute if set.");
      assertFalse(discretize0.getUseBinNumbers());
      
      discretize0.m_UseBinNumbers = true;
      discretize0.getOptions();
      assertTrue(discretize0.getUseBinNumbers());
  }
}
