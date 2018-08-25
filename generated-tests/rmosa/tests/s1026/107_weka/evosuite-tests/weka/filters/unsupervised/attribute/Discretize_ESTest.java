/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 17:41:31 GMT 2018
 */

package weka.filters.unsupervised.attribute;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;
import weka.core.Attribute;
import weka.core.BinarySparseInstance;
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
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
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
  //Test case number: 1
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.getBinRangesString((-2134546997));
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getFindNumBins());
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.1383972463477248
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.setOptions((String[]) null);
      AllFilter allFilter0 = new AllFilter();
      String string0 = "Number of bins.";
      StringReader stringReader0 = new StringReader("Number of bins.");
      Instances instances0 = null;
      try {
        instances0 = new Instances(stringReader0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // keyword @relation expected, read Token[Number], line 1
         //
         verifyException("weka.core.converters.ArffLoader$ArffReader", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String[] stringArray0 = new String[0];
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
  //Test case number: 4
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Discretize discretize0 = new Discretize("2\"%GlF^");
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
  //Test case number: 5
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.setOutputFormat();
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getFindNumBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getUseBinNumbers());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
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
  //Test case number: 7
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Discretize discretize0 = new Discretize("9Lon5@x");
      discretize0.globalInfo();
      boolean boolean0 = true;
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
  //Test case number: 8
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String string0 = discretize0.getRevision();
      assertEquals("8964", string0);
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getUseEqualFrequency());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getFindNumBins());
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getUseBinNumbers());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      double[][] doubleArray0 = new double[6][8];
      double[] doubleArray1 = new double[9];
      doubleArray1[0] = (-914.0896894005957);
      double[] doubleArray2 = new double[7];
      doubleArray2[0] = (-914.0896894005957);
      double[] doubleArray3 = new double[6];
      doubleArray3[0] = 165.37;
      double[] doubleArray4 = new double[3];
      doubleArray4[2] = (-914.0896894005957);
      String string0 = discretize0.binsTipText();
      assertEquals("Number of bins.", string0);
      assertFalse(discretize0.getUseEqualFrequency());
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getFindNumBins());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      Range range0 = discretize0.m_DiscretizeCols;
      double[] doubleArray0 = new double[6];
      double[] doubleArray1 = new double[2];
      discretize0.invertSelectionTipText();
      StringReader stringReader0 = new StringReader("'B2of2'");
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
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
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
  //Test case number: 12
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "s[l0bHG=^";
      stringArray0[1] = "{0";
      stringArray0[2] = "";
      stringArray0[3] = "-M";
      stringArray0[4] = "7fD,Ge4";
      try { 
        discretize0.setOptions(stringArray0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
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
      Random.setNextRandom((-1039));
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Discretize discretize0 = new Discretize("BqZ<");
      Range range0 = new Range();
      discretize0.m_DiscretizeCols = range0;
      range0.getInvert();
      discretize0.m_DesiredWeightOfInstancesPerInterval = (-1326.42872007);
      discretize0.desiredWeightOfInstancesPerIntervalTipText();
      MultiFilter multiFilter0 = new MultiFilter();
      discretize0.m_CutPoints = null;
      // Undeclared exception!
      try { 
        multiFilter0.getFilter(250);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 250
         //
         verifyException("weka.filters.MultiFilter", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String string0 = discretize0.attributeIndicesTipText();
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertEquals("Specify range of attributes to act on. This is a comma separated list of attribute indices, with \"first\" and \"last\" valid values. Specify an inclusive range with \"-\". E.g: \"first-3,5,6-10,last\".", string0);
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getUseEqualFrequency());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.7721393884375287
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Properties properties0 = new Properties();
      ProtectedProperties protectedProperties0 = new ProtectedProperties(properties0);
      Attribute attribute0 = new Attribute("5 * log(5):", "y", protectedProperties0);
      arrayList0.add(attribute0);
      Instances instances0 = new Instances("Vfk+:<n;//=?TyC]", arrayList0, 2);
      discretize0.setInputFormat(instances0);
      // Undeclared exception!
      try { 
        discretize0.calculateCutPointsByEqualFrequencyBinning(35);
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
  /*Coverage entropy=2.133628922152431
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Discretize discretize0 = new Discretize("W");
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
  //Test case number: 18
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Discretize discretize0 = new Discretize("");
      String string0 = discretize0.useEqualFrequencyTipText();
      assertFalse(discretize0.getFindNumBins());
      assertEquals("If set to true, equal-frequency binning will be used instead of equal-width binning.", string0);
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getUseEqualFrequency());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Random.setNextRandom(4184);
      Discretize discretize0 = new Discretize();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "Headers don't match:\n";
      stringArray0[1] = "-B";
      stringArray0[2] = "n))\"b8Z45l<Jj@a";
      stringArray0[3] = "_[jc<u9~/iMK?~PW";
      stringArray0[4] = "* @param format\tthe data format to use";
      try { 
        discretize0.setOptions(stringArray0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"n))\"b8Z45l<Jj@a\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "-R";
      String string0 = "W3YhK^]zKRKRM e";
      stringArray0[1] = "W3YhK^]zKRKRM e";
      stringArray0[2] = "y>9$RiZ";
      stringArray0[3] = "fbC-^rT4di E17>";
      stringArray0[4] = "Q}?R/}@i6Av(|rK=CG";
      discretize0.setOptions(stringArray0);
      AllFilter allFilter0 = new AllFilter();
      StringReader stringReader0 = new StringReader("");
      Instances instances0 = null;
      try {
        instances0 = new Instances(stringReader0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // premature end of file, read Token[EOF], line 1
         //
         verifyException("weka.core.converters.ArffLoader$ArffReader", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.5065950881316383
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.getMakeBinary();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Properties properties0 = new Properties();
      ProtectedProperties protectedProperties0 = new ProtectedProperties(properties0);
      Attribute attribute0 = new Attribute("}n#_/6ZKX d?p!", ">=", protectedProperties0);
      arrayList0.add(attribute0);
      attribute0.copy("]");
      Instances instances0 = new Instances("}n#_/6ZKX d?p!", arrayList0, 36);
      discretize0.setInputFormat(instances0);
      // Undeclared exception!
      try { 
        discretize0.findNumBins(1);
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
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String[] stringArray0 = new String[1];
      Discretize.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.getCutPoints(1965);
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getFindNumBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.m_IgnoreClass = true;
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (double) 98;
      doubleArray0[3] = (double) 98;
      doubleArray0[4] = (double) 98;
      doubleArray0[5] = (double) 98;
      doubleArray0[6] = (double) 98;
      doubleArray0[7] = (double) 98;
      SparseInstance sparseInstance0 = new SparseInstance(98, doubleArray0);
      sparseInstance0.dataset();
      discretize0.m_MakeBinary = true;
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
  //Test case number: 25
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (double) 98;
      doubleArray0[3] = (double) 98;
      doubleArray0[4] = (double) 98;
      doubleArray0[5] = (double) 98;
      doubleArray0[6] = (double) 98;
      doubleArray0[7] = (double) 98;
      SparseInstance sparseInstance0 = new SparseInstance(98, doubleArray0);
      sparseInstance0.dataset();
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
  //Test case number: 26
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Discretize discretize0 = new Discretize("");
      String[] stringArray0 = discretize0.getOptions();
      assertEquals(4, stringArray0.length);
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertEquals(10, discretize0.getBins());
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      double[][] doubleArray0 = new double[2][8];
      discretize0.m_CutPoints = doubleArray0;
      // Undeclared exception!
      try { 
        discretize0.getCutPoints(2099);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2099
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  /**
  //Test case number: 28
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      assertFalse(discretize0.getUseBinNumbers());
      
      discretize0.m_UseBinNumbers = true;
      discretize0.getOptions();
      assertTrue(discretize0.getUseBinNumbers());
  }

  /**
  //Test case number: 29
  /*Coverage entropy=2.2275247137250096
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Discretize discretize0 = new Discretize("W");
      discretize0.setMakeBinary(true);
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
  //Test case number: 30
  /*Coverage entropy=1.337829610145688
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.makeBinaryTipText();
      double[][] doubleArray0 = new double[32][8];
      discretize0.m_CutPoints = doubleArray0;
      int int0 = 3;
      discretize0.getBinRangesString(3);
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
  //Test case number: 31
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.setUseEqualFrequency(true);
      discretize0.m_DiscretizeCols = null;
      // Undeclared exception!
      try { 
        discretize0.getOptions();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  /**
  //Test case number: 32
  /*Coverage entropy=2.2275247137250096
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String string0 = "W";
      Discretize discretize0 = new Discretize("W");
      discretize0.setFindNumBins(true);
      discretize0.getOptions();
      AllFilter allFilter0 = new AllFilter();
      Instances instances0 = null;
      Instances instances1 = null;
      try {
        instances1 = new Instances((Instances) null, (-333));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.Instances", e);
      }
  }

  /**
  //Test case number: 33
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.setInvertSelection(true);
      String[] stringArray0 = discretize0.getOptions();
      assertEquals(7, stringArray0.length);
      assertEquals(10, discretize0.getBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
  }

  /**
  //Test case number: 34
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.setIgnoreClass(true);
      String[] stringArray0 = discretize0.getOptions();
      assertEquals(7, stringArray0.length);
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertEquals(10, discretize0.getBins());
  }

  /**
  //Test case number: 35
  /*Coverage entropy=2.833213344056216
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.getMakeBinary();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      discretize0.m_DefaultCols = "else if (format.attribute(i).isNominal())";
      Properties properties0 = new Properties();
      ArrayList<Locale.LanguageRange> arrayList1 = new ArrayList<Locale.LanguageRange>();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.EXTENDED_FILTERING;
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) arrayList1, (Collection<String>) linkedList0, locale_FilteringMode0);
      Attribute attribute0 = new Attribute("else if (format.attribute(i).isNominal())", list0, 1081);
      arrayList0.add(attribute0);
      ProtectedProperties protectedProperties0 = new ProtectedProperties(properties0);
      Attribute attribute1 = new Attribute("}n#_/6ZKX d?p!", ">=", protectedProperties0);
      arrayList0.add(attribute1);
      Instances instances0 = new Instances("}n#_/6ZKX d?p!", arrayList0, 36);
      boolean boolean0 = discretize0.setInputFormat(instances0);
      assertFalse(boolean0);
      
      discretize0.batchFinished();
      discretize0.setOutputFormat();
      String[] stringArray0 = discretize0.getOptions();
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertTrue(discretize0.isNewBatch());
      assertEquals(6, stringArray0.length);
      assertEquals(10, discretize0.getBins());
  }

  /**
  //Test case number: 36
  /*Coverage entropy=2.890371757896165
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.getMakeBinary();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      discretize0.m_DefaultCols = "else if (format.attribute(i).isNominal())";
      Properties properties0 = new Properties();
      ProtectedProperties protectedProperties0 = new ProtectedProperties(properties0);
      Attribute attribute0 = new Attribute("}n#_/6ZKX d?p!", ">=", protectedProperties0);
      arrayList0.add(attribute0);
      Instances instances0 = new Instances("}n#_/6ZKX d?p!", arrayList0, 44);
      discretize0.setInputFormat(instances0);
      boolean boolean0 = discretize0.batchFinished();
      assertFalse(boolean0);
      
      String[] stringArray0 = discretize0.getOptions();
      assertEquals(6, stringArray0.length);
      
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) 3;
      doubleArray0[1] = 5.70001;
      doubleArray0[2] = (double) 1;
      doubleArray0[3] = (double) 44;
      int[] intArray0 = new int[4];
      intArray0[0] = (-1772);
      intArray0[1] = 0;
      intArray0[2] = 1;
      intArray0[3] = 44;
      SparseInstance sparseInstance0 = new SparseInstance(0, doubleArray0, intArray0, 25);
      discretize0.convertInstance(sparseInstance0);
      discretize0.batchFinished();
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertEquals(10, discretize0.getBins());
  }

  /**
  //Test case number: 37
  /*Coverage entropy=2.70805020110221
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.getMakeBinary();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Properties properties0 = new Properties();
      ProtectedProperties protectedProperties0 = new ProtectedProperties(properties0);
      Attribute attribute0 = new Attribute("}n#_/6ZKX d?p!", ">=", protectedProperties0);
      arrayList0.add(attribute0);
      Instances instances0 = new Instances("}n#_/6ZKX d?p!", arrayList0, 36);
      discretize0.setInputFormat(instances0);
      SparseInstance sparseInstance0 = new SparseInstance(1);
      String[] stringArray0 = new String[0];
      discretize0.setOptions(stringArray0);
      // Undeclared exception!
      try { 
        discretize0.input(sparseInstance0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Instance has no dataset assigned!!
         //
         verifyException("weka.core.RelationalLocator", e);
      }
  }

  /**
  //Test case number: 38
  /*Coverage entropy=2.890371757896165
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.getMakeBinary();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      discretize0.m_DefaultCols = "else if (format.attribute(i).isNominal())";
      Properties properties0 = new Properties();
      ProtectedProperties protectedProperties0 = new ProtectedProperties(properties0);
      Attribute attribute0 = new Attribute("}n#_/6ZKX d?p!", ">=", protectedProperties0);
      arrayList0.add(attribute0);
      Instances instances0 = new Instances("}n#_/6ZKX d?p!", arrayList0, 44);
      discretize0.setInputFormat(instances0);
      discretize0.batchFinished();
      discretize0.getOptions();
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) 3;
      String string0 = discretize0.getBinRangesString(0);
      assertEquals("All", string0);
      
      boolean boolean0 = discretize0.batchFinished();
      assertFalse(boolean0);
      
      discretize0.setOutputFormat();
      String[] stringArray0 = discretize0.getOptions();
      assertTrue(discretize0.isNewBatch());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertEquals(10, discretize0.getBins());
      assertEquals(6, stringArray0.length);
  }

  /**
  //Test case number: 39
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.getInvertSelection();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      discretize0.m_DefaultCols = "else if (format.attribute(i).isNominal())";
      Properties properties0 = new Properties();
      ProtectedProperties protectedProperties0 = new ProtectedProperties(properties0);
      protectedProperties0.stringPropertyNames();
      Attribute attribute0 = new Attribute("}n#_/6ZKX d?p!", ">=", protectedProperties0);
      arrayList0.add(attribute0);
      Instances instances0 = new Instances("}n#_/6ZKX d?p!", arrayList0, 44);
      discretize0.setInputFormat(instances0);
      discretize0.batchFinished();
      discretize0.getOptions();
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = 5.70001;
      ArrayList<Attribute> arrayList1 = new ArrayList<Attribute>();
      arrayList1.trimToSize();
      Instances instances1 = new Instances("75W", arrayList1, 3);
      discretize0.setInputFormat(instances0);
      discretize0.batchFinished();
      discretize0.setOutputFormat();
      discretize0.getOptions();
      DenseInstance denseInstance0 = new DenseInstance(4, doubleArray0);
      discretize0.input(denseInstance0);
      boolean boolean0 = discretize0.input(denseInstance0);
      assertFalse(discretize0.isNewBatch());
      assertTrue(boolean0);
  }
}
