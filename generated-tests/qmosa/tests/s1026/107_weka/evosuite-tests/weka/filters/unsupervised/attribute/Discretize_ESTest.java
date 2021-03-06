/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 15:46:15 GMT 2018
 */

package weka.filters.unsupervised.attribute;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.Reader;
import java.util.ArrayList;
import java.util.function.Consumer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import weka.core.Attribute;
import weka.core.BinarySparseInstance;
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
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.setUseEqualFrequency(true);
      discretize0.getBinRangesString(2274);
      String string0 = null;
      discretize0.setFindNumBins(true);
      // Undeclared exception!
      try { 
        discretize0.setAttributeIndices((String) null);
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
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.getUseBinNumbers();
      discretize0.m_FindNumBins = false;
      int int0 = 0;
      discretize0.getBinRangesString(0);
      discretize0.setFindNumBins(false);
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
  //Test case number: 2
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Discretize discretize0 = new Discretize("[KIcEW2gB9g");
      Filter.makeCopy(discretize0);
      discretize0.toString();
      discretize0.setOutputFormat();
      discretize0.m_FindNumBins = false;
      discretize0.setBins(86);
      discretize0.findNumBinsTipText();
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
  //Test case number: 3
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.m_UseBinNumbers = true;
      discretize0.setDesiredWeightOfInstancesPerInterval((-2128.112));
      discretize0.m_IgnoreClass = true;
      discretize0.listOptions();
      discretize0.makeBinaryTipText();
      discretize0.setMakeBinary(true);
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (-1.7976931348623157E308);
      double[][] doubleArray1 = new double[2][8];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      discretize0.m_CutPoints = doubleArray1;
      doubleArray0[1] = (-1.7976931348623157E308);
      doubleArray0[2] = (-2128.112);
      doubleArray0[3] = (-2128.112);
      doubleArray0[4] = (-1.7976931348623157E308);
      SparseInstance sparseInstance0 = new SparseInstance((-1.7976931348623157E308), doubleArray0);
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance(sparseInstance0);
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
  //Test case number: 4
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.m_FindNumBins = true;
      discretize0.m_IgnoreClass = true;
      discretize0.setInvertSelection(false);
      discretize0.getBinRangesString(4591);
      discretize0.binsTipText();
      discretize0.getRevision();
      discretize0.invertSelectionTipText();
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
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      int int0 = 13;
      String[] stringArray0 = new String[7];
      stringArray0[0] = "";
      stringArray0[1] = "-EZ<_^:sVY|N*";
      stringArray0[2] = "ordered";
      int[] intArray0 = new int[8];
      intArray0[0] = 13;
      intArray0[1] = 13;
      intArray0[2] = 13;
      intArray0[3] = 13;
      intArray0[4] = 13;
      intArray0[5] = 13;
      intArray0[6] = 13;
      intArray0[7] = 13;
      discretize0.setAttributeIndicesArray(intArray0);
      stringArray0[3] = "-M";
      stringArray0[4] = "^$5";
      discretize0.m_FindNumBins = false;
      stringArray0[5] = "";
      discretize0.setIgnoreClass(false);
      stringArray0[6] = "";
      discretize0.m_DesiredWeightOfInstancesPerInterval = (double) 13;
      try { 
        Filter.filterFile(discretize0, stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // 
         // For input string: \"^$5\"
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
  //Test case number: 6
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Discretize discretize0 = new Discretize("&SI0m~O}GL-]");
      discretize0.m_IgnoreClass = true;
      discretize0.useBinNumbersTipText();
      Instance instance0 = null;
      discretize0.m_UseEqualFrequency = true;
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
  //Test case number: 7
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = "BqZ<";
      Discretize discretize0 = new Discretize("BqZ<");
      Range range0 = new Range();
      discretize0.m_DiscretizeCols = range0;
      range0.getInvert();
      discretize0.getInvertSelection();
      discretize0.m_DesiredWeightOfInstancesPerInterval = (-1326.42872007);
      boolean boolean0 = false;
      discretize0.setUseBinNumbers(false);
      discretize0.desiredWeightOfInstancesPerIntervalTipText();
      // Undeclared exception!
      try { 
        range0.getSelection();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No upper limit has been specified for range
         //
         verifyException("weka.core.Range", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.attributeIndicesTipText();
      discretize0.getAttributeIndices();
      discretize0.setFindNumBins(true);
      discretize0.setDesiredWeightOfInstancesPerInterval(0.0);
      discretize0.getInvertSelection();
      double[] doubleArray0 = new double[0];
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance((-2809.219), doubleArray0);
      SparseInstance sparseInstance0 = new SparseInstance((-2809.219), doubleArray0);
      // Undeclared exception!
      try { 
        sparseInstance0.setClassValue(2642.0142);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // DenseInstance doesn't have access to a dataset!
         //
         verifyException("weka.core.AbstractInstance", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = "+";
      Discretize discretize0 = new Discretize("+");
      double[][] doubleArray0 = new double[4][3];
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = (-117.37286111);
      doubleArray1[1] = 0.0;
      doubleArray1[2] = (-1.0);
      doubleArray1[3] = 0.0;
      doubleArray1[4] = (-1441.0584708877);
      doubleArray1[5] = 0.0;
      doubleArray1[6] = (-1691.2368778894197);
      doubleArray1[7] = 1445.05197647;
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[3];
      doubleArray2[0] = (-1441.0584708877);
      doubleArray2[1] = (-1.0);
      doubleArray2[2] = (-117.37286111);
      doubleArray0[1] = doubleArray2;
      double[] doubleArray3 = new double[9];
      doubleArray3[0] = (-1.0);
      doubleArray3[1] = (-1441.0584708877);
      doubleArray3[2] = 0.0;
      doubleArray3[3] = (-1.0);
      doubleArray3[4] = (-1.0);
      doubleArray3[5] = 1445.05197647;
      doubleArray3[6] = 0.0;
      doubleArray3[7] = 0.0;
      doubleArray3[8] = 0.0;
      doubleArray0[2] = doubleArray3;
      double[] doubleArray4 = new double[6];
      doubleArray4[0] = (-1691.2368778894197);
      doubleArray4[1] = (-1691.2368778894197);
      doubleArray4[2] = 0.0;
      doubleArray4[3] = 0.0;
      doubleArray4[4] = (-1691.2368778894197);
      doubleArray4[5] = (-1691.2368778894197);
      doubleArray0[3] = doubleArray4;
      discretize0.m_CutPoints = doubleArray0;
      String[] stringArray0 = new String[8];
      discretize0.getOptions();
      stringArray0[0] = "+";
      stringArray0[1] = "+";
      discretize0.setUseBinNumbers(false);
      stringArray0[2] = "+";
      stringArray0[3] = "+";
      String string1 = "5t%;'@c.B Q0Qf!2";
      stringArray0[4] = "5t%;'@c.B Q0Qf!2";
      double double0 = 0.0;
      discretize0.m_DesiredWeightOfInstancesPerInterval = 0.0;
      stringArray0[5] = "+";
      stringArray0[6] = "+";
      stringArray0[7] = "+";
      try { 
        Filter.filterFile(discretize0, stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // 
         // Illegal options: + + + + 5t%;'@c.B Q0Qf!2 + + + 
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
  //Test case number: 10
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Discretize discretize0 = new Discretize("");
      discretize0.setIgnoreClass(false);
      String string0 = discretize0.useEqualFrequencyTipText();
      assertEquals(10, discretize0.getBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getFindNumBins());
      assertEquals("If set to true, equal-frequency binning will be used instead of equal-width binning.", string0);
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getUseBinNumbers());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.9785084205272367
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String string0 = null;
      String[] stringArray0 = discretize0.getOptions();
      discretize0.setUseBinNumbers(true);
      try { 
        Filter.filterFile(discretize0, stringArray0);
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
  //Test case number: 12
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.m_UseBinNumbers = true;
      discretize0.setDesiredWeightOfInstancesPerInterval((-2128.112));
      discretize0.m_IgnoreClass = true;
      discretize0.listOptions();
      discretize0.makeBinaryTipText();
      discretize0.setMakeBinary(true);
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (-1.7976931348623157E308);
      double[][] doubleArray1 = new double[2][8];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      discretize0.m_CutPoints = doubleArray1;
      doubleArray0[1] = (-1.7976931348623157E308);
      doubleArray0[2] = (-2128.112);
      doubleArray0[3] = (-2128.112);
      doubleArray0[4] = (-1.7976931348623157E308);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "Make resulting attributes binary.";
      stringArray0[1] = "Make resulting attributes binary.";
      stringArray0[2] = "Make resulting attributes binary.";
      stringArray0[3] = "A";
      stringArray0[4] = "Make resulting attributes binary.";
      stringArray0[5] = "Make resulting attributes binary.";
      stringArray0[6] = "Make resulting attributes binary.";
      stringArray0[7] = "Make resulting attributes binary.";
      Discretize.main(stringArray0);
      assertEquals(8, stringArray0.length);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (-2878.2855439434634);
      doubleArray0[1] = (-2878.2855439434634);
      doubleArray0[2] = (-2878.2855439434634);
      doubleArray0[3] = (-1650.072161008);
      doubleArray0[4] = (-2878.2855439434634);
      Discretize discretize0 = new Discretize();
      String string0 = discretize0.getAttributeIndices();
      assertEquals("first-last", string0);
      
      discretize0.getCapabilities();
      String string1 = discretize0.globalInfo();
      assertEquals("An instance filter that discretizes a range of numeric attributes in the dataset into nominal attributes. Discretization is by simple binning. Skips the class attribute if set.", string1);
      
      discretize0.getCutPoints((-2526));
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseEqualFrequency());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.772588722239781
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Discretize discretize0 = new Discretize("Use bin numbers (eg BXofY) rather than ranges for for discretized attributes");
      discretize0.toString();
      discretize0.setOutputFormat();
      String[] stringArray0 = new String[1];
      discretize0.setUseEqualFrequency(false);
      discretize0.m_DesiredWeightOfInstancesPerInterval = 0.0;
      int[] intArray0 = new int[7];
      intArray0[0] = 2;
      intArray0[1] = (-1932735280);
      intArray0[2] = 4;
      intArray0[3] = 1603;
      discretize0.getAttributeIndices();
      intArray0[4] = 2547;
      intArray0[5] = 105;
      intArray0[6] = 3;
      discretize0.setAttributeIndicesArray(intArray0);
      stringArray0[0] = "weka.filters.unsupervised.attribute.Discretize";
      discretize0.setOptions(stringArray0);
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance(1326.93067424382, intArray0, 2);
      SparseInstance sparseInstance0 = new SparseInstance((SparseInstance) binarySparseInstance0);
      sparseInstance0.dataset();
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
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Discretize discretize0 = new Discretize("Set attribute selection mode. If false, only selected (numeric) attributes in the range will be discretized; if true, only non-selected attributes will be discretized.");
      discretize0.m_MakeBinary = true;
      discretize0.getCutPoints(114);
      discretize0.getCapabilities();
      // Undeclared exception!
      try { 
        discretize0.calculateCutPointsByEqualWidthBinning(114);
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
  /*Coverage entropy=2.20082764903455
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      SparseInstance sparseInstance0 = new SparseInstance(0.0, doubleArray0);
      Discretize discretize0 = new Discretize("NadT7K#U21x#,");
      discretize0.setInvertSelection(true);
      discretize0.getOptions();
      MultiFilter multiFilter0 = new MultiFilter();
      multiFilter0.isStreamableFilter();
      // Undeclared exception!
      try { 
        multiFilter0.getFilter(2364);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2364
         //
         verifyException("weka.filters.MultiFilter", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.941616952644221
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.m_IgnoreClass = true;
      discretize0.m_FindNumBins = false;
      discretize0.getInvertSelection();
      discretize0.getRevision();
      String[] stringArray0 = discretize0.getOptions();
      discretize0.setUseEqualFrequency(false);
      discretize0.setOptions(stringArray0);
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
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Discretize discretize0 = new Discretize("modulo");
      double[][] doubleArray0 = new double[0][9];
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
  //Test case number: 19
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance((-1717986916), (int[]) null, 0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 1599;
      doubleArray0[2] = (double) (-1717986916);
      doubleArray0[3] = (double) 0;
      doubleArray0[4] = (double) (-1717986916);
      doubleArray0[6] = (double) 1599;
      BinarySparseInstance binarySparseInstance1 = new BinarySparseInstance(1599, doubleArray0);
      SparseInstance sparseInstance0 = new SparseInstance((SparseInstance) binarySparseInstance1);
      binarySparseInstance0.dataset();
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

  /**
  //Test case number: 20
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Discretize discretize0 = new Discretize("modulo");
      double[][] doubleArray0 = new double[0][9];
      discretize0.m_CutPoints = doubleArray0;
      // Undeclared exception!
      try { 
        discretize0.getCutPoints(53);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 53
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Discretize discretize0 = new Discretize("modulo");
      double[][] doubleArray0 = new double[0][9];
      int[] intArray0 = new int[2];
      discretize0.setBins(79);
      intArray0[0] = (-1988);
      intArray0[1] = (-2380);
      discretize0.setAttributeIndicesArray(intArray0);
      discretize0.m_CutPoints = doubleArray0;
      // Undeclared exception!
      try { 
        discretize0.getBinRangesString(1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=2.03195622385697
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Discretize discretize0 = new Discretize("");
      String[] stringArray0 = discretize0.getOptions();
      assertEquals(10, discretize0.getBins());
      assertEquals(4, stringArray0.length);
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=2.8053739589572353
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.m_IgnoreClass = true;
      discretize0.m_FindNumBins = true;
      discretize0.getInvertSelection();
      discretize0.getRevision();
      String[] stringArray0 = discretize0.getOptions();
      discretize0.setUseEqualFrequency(false);
      discretize0.setOptions(stringArray0);
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
  //Test case number: 24
  /*Coverage entropy=2.0688846458275627
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Discretize discretize0 = new Discretize("Set attribute selestion mode. Iw f}lse, only v:lected (numeric) attributes in tKe range will be discretized; if true, only non-selected attributes will be discretized.");
      assertFalse(discretize0.getMakeBinary());
      
      discretize0.setMakeBinary(true);
      discretize0.getOptions();
      assertTrue(discretize0.getMakeBinary());
  }
}
