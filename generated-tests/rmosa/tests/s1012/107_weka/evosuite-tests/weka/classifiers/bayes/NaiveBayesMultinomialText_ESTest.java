/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 10:45:36 GMT 2018
 */

package weka.classifiers.bayes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import weka.attributeSelection.PrincipalComponents;
import weka.classifiers.AbstractClassifier;
import weka.classifiers.bayes.BayesNet;
import weka.classifiers.bayes.NaiveBayesMultinomialText;
import weka.classifiers.functions.SGDText;
import weka.classifiers.functions.supportVector.PrecomputedKernelMatrixKernel;
import weka.classifiers.meta.CostSensitiveClassifier;
import weka.core.AbstractInstance;
import weka.core.Attribute;
import weka.core.BinarySparseInstance;
import weka.core.Capabilities;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.SparseInstance;
import weka.core.TestInstances;
import weka.core.neighboursearch.balltrees.BallNode;
import weka.core.stemmers.SnowballStemmer;
import weka.core.stemmers.Stemmer;
import weka.filters.MultiFilter;
import weka.filters.supervised.attribute.Discretize;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NaiveBayesMultinomialText_ESTest extends NaiveBayesMultinomialText_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "\tConvert all tokens to lowercase before adding to the dictionary.";
      stringArray0[1] = "2R|29ccDxi%]p";
      stringArray0[2] = "";
      stringArray0[3] = "JE<z8o26~{U";
      stringArray0[5] = "JE<z8o26~{U";
      NaiveBayesMultinomialText.main(stringArray0);
      assertEquals(6, stringArray0.length);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      String string0 = naiveBayesMultinomialText0.LNormTipText();
      assertEquals(3.0, naiveBayesMultinomialText0.getMinWordFrequency(), 0.01);
      assertEquals(1.0, naiveBayesMultinomialText0.getNorm(), 0.01);
      assertEquals("The LNorm to use for document length normalization.", string0);
      assertEquals(2.0, naiveBayesMultinomialText0.getLNorm(), 0.01);
      assertFalse(naiveBayesMultinomialText0.getUseWordFrequencies());
      assertEquals(0, naiveBayesMultinomialText0.getPeriodicPruning());
      assertFalse(naiveBayesMultinomialText0.getNormalizeDocLength());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      String string0 = naiveBayesMultinomialText0.minWordFrequencyTipText();
      assertFalse(naiveBayesMultinomialText0.getNormalizeDocLength());
      assertFalse(naiveBayesMultinomialText0.getUseWordFrequencies());
      assertEquals(1.0, naiveBayesMultinomialText0.getNorm(), 0.01);
      assertEquals(0, naiveBayesMultinomialText0.getPeriodicPruning());
      assertEquals(3.0, naiveBayesMultinomialText0.getMinWordFrequency(), 0.01);
      assertEquals("Ignore any words that don't occur at least min frequency times in the training data. If periodic pruning is turned on, then the dictionary is pruned according to this value", string0);
      assertEquals(2.0, naiveBayesMultinomialText0.getLNorm(), 0.01);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 0.0;
      SGDText sGDText0 = new SGDText();
      sGDText0.getTokenizer();
      naiveBayesMultinomialText0.getLNorm();
      naiveBayesMultinomialText0.normalizeDocLengthTipText();
      naiveBayesMultinomialText0.getCapabilities();
      boolean boolean0 = true;
      naiveBayesMultinomialText0.setLowercaseTokens(true);
      BallNode ballNode0 = new BallNode(0);
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance(1.3, (int[]) null, 41);
      BinarySparseInstance binarySparseInstance1 = new BinarySparseInstance((SparseInstance) binarySparseInstance0);
      // Undeclared exception!
      try { 
        binarySparseInstance1.attribute(31);
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      String string0 = naiveBayesMultinomialText0.normTipText();
      assertEquals("The norm of the instances after normalization.", string0);
      assertEquals(1.0, naiveBayesMultinomialText0.getNorm(), 0.01);
      assertEquals(0, naiveBayesMultinomialText0.getPeriodicPruning());
      assertFalse(naiveBayesMultinomialText0.getUseWordFrequencies());
      assertFalse(naiveBayesMultinomialText0.getNormalizeDocLength());
      assertEquals(3.0, naiveBayesMultinomialText0.getMinWordFrequency(), 0.01);
      assertEquals(2.0, naiveBayesMultinomialText0.getLNorm(), 0.01);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.563833134301647
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      String[] stringArray0 = naiveBayesMultinomialText0.getOptions();
      naiveBayesMultinomialText0.setOptions(stringArray0);
      Capabilities capabilities0 = naiveBayesMultinomialText0.getCapabilities();
      TestInstances testInstances0 = TestInstances.forCapabilities(capabilities0);
      Instances instances0 = testInstances0.generate();
      Instances instances1 = new Instances(instances0);
      naiveBayesMultinomialText0.buildClassifier(instances0);
      naiveBayesMultinomialText0.toString();
      CostSensitiveClassifier costSensitiveClassifier0 = new CostSensitiveClassifier();
      File file0 = costSensitiveClassifier0.getOnDemandDirectory();
      naiveBayesMultinomialText0.m_normalize = true;
      File file1 = MockFile.createTempFile("@data", "/", file0);
      try { 
        MockFile.createTempFile(".bsi", "ivistic", file1);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      String string0 = naiveBayesMultinomialText0.stopwordsTipText();
      assertEquals(3.0, naiveBayesMultinomialText0.getMinWordFrequency(), 0.01);
      assertEquals(2.0, naiveBayesMultinomialText0.getLNorm(), 0.01);
      assertFalse(naiveBayesMultinomialText0.getNormalizeDocLength());
      assertEquals("The file containing the stopwords (if this is a directory then the default ones are used).", string0);
      assertEquals(0, naiveBayesMultinomialText0.getPeriodicPruning());
      assertFalse(naiveBayesMultinomialText0.getUseWordFrequencies());
      assertEquals(1.0, naiveBayesMultinomialText0.getNorm(), 0.01);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      String string0 = naiveBayesMultinomialText0.periodicPruningTipText();
      assertEquals(0, naiveBayesMultinomialText0.getPeriodicPruning());
      assertFalse(naiveBayesMultinomialText0.getNormalizeDocLength());
      assertEquals(1.0, naiveBayesMultinomialText0.getNorm(), 0.01);
      assertFalse(naiveBayesMultinomialText0.getUseWordFrequencies());
      assertEquals(3.0, naiveBayesMultinomialText0.getMinWordFrequency(), 0.01);
      assertEquals("How often (number of instances) to prune the dictionary of low frequency terms. 0 means don't prune. Setting a positive integer n means prune after every n instances", string0);
      assertEquals(2.0, naiveBayesMultinomialText0.getLNorm(), 0.01);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      String string0 = naiveBayesMultinomialText0.stemmerTipText();
      assertEquals(0, naiveBayesMultinomialText0.getPeriodicPruning());
      assertEquals(1.0, naiveBayesMultinomialText0.getNorm(), 0.01);
      assertEquals(2.0, naiveBayesMultinomialText0.getLNorm(), 0.01);
      assertEquals(3.0, naiveBayesMultinomialText0.getMinWordFrequency(), 0.01);
      assertEquals("The stemming algorithm to use on the words.", string0);
      assertFalse(naiveBayesMultinomialText0.getUseWordFrequencies());
      assertFalse(naiveBayesMultinomialText0.getNormalizeDocLength());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      String string0 = naiveBayesMultinomialText0.lowercaseTokensTipText();
      assertEquals(0, naiveBayesMultinomialText0.getPeriodicPruning());
      assertEquals(1.0, naiveBayesMultinomialText0.getNorm(), 0.01);
      assertFalse(naiveBayesMultinomialText0.getNormalizeDocLength());
      assertEquals("Whether to convert all tokens to lowercase", string0);
      assertFalse(naiveBayesMultinomialText0.getUseWordFrequencies());
      assertEquals(2.0, naiveBayesMultinomialText0.getLNorm(), 0.01);
      assertEquals(3.0, naiveBayesMultinomialText0.getMinWordFrequency(), 0.01);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      String string0 = naiveBayesMultinomialText0.getRevision();
      assertEquals(2.0, naiveBayesMultinomialText0.getLNorm(), 0.01);
      assertFalse(naiveBayesMultinomialText0.getNormalizeDocLength());
      assertFalse(naiveBayesMultinomialText0.getUseWordFrequencies());
      assertEquals(0, naiveBayesMultinomialText0.getPeriodicPruning());
      assertEquals("9122", string0);
      assertEquals(1.0, naiveBayesMultinomialText0.getNorm(), 0.01);
      assertEquals(3.0, naiveBayesMultinomialText0.getMinWordFrequency(), 0.01);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      String string0 = naiveBayesMultinomialText0.useWordFrequenciesTipText();
      assertEquals(2.0, naiveBayesMultinomialText0.getLNorm(), 0.01);
      assertFalse(naiveBayesMultinomialText0.getNormalizeDocLength());
      assertFalse(naiveBayesMultinomialText0.getUseWordFrequencies());
      assertEquals(0, naiveBayesMultinomialText0.getPeriodicPruning());
      assertEquals(3.0, naiveBayesMultinomialText0.getMinWordFrequency(), 0.01);
      assertEquals("Use word frequencies rather than binary bag of words representation", string0);
      assertEquals(1.0, naiveBayesMultinomialText0.getNorm(), 0.01);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      String string0 = naiveBayesMultinomialText0.globalInfo();
      assertEquals(2.0, naiveBayesMultinomialText0.getLNorm(), 0.01);
      assertFalse(naiveBayesMultinomialText0.getUseWordFrequencies());
      assertEquals(0, naiveBayesMultinomialText0.getPeriodicPruning());
      assertFalse(naiveBayesMultinomialText0.getNormalizeDocLength());
      assertEquals(3.0, naiveBayesMultinomialText0.getMinWordFrequency(), 0.01);
      assertEquals("Multinomial naive bayes for text data. Operates directly (and only) on String attributes. Other types of input attributes are accepted but ignored during training and classification", string0);
      assertEquals(1.0, naiveBayesMultinomialText0.getNorm(), 0.01);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      naiveBayesMultinomialText0.m_wordFrequencies = false;
      naiveBayesMultinomialText0.m_wordFrequencies = true;
      naiveBayesMultinomialText0.getOptions();
      assertTrue(naiveBayesMultinomialText0.getUseWordFrequencies());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      assertFalse(naiveBayesMultinomialText0.getNormalizeDocLength());
      
      naiveBayesMultinomialText0.m_useStopList = true;
      naiveBayesMultinomialText0.getOptions();
      assertTrue(naiveBayesMultinomialText0.getNormalizeDocLength());
      
      MultiFilter multiFilter0 = new MultiFilter();
      assertFalse(multiFilter0.getDebug());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      String string0 = naiveBayesMultinomialText0.tokenizerTipText();
      assertEquals(1.0, naiveBayesMultinomialText0.getNorm(), 0.01);
      assertEquals(2.0, naiveBayesMultinomialText0.getLNorm(), 0.01);
      assertEquals(3.0, naiveBayesMultinomialText0.getMinWordFrequency(), 0.01);
      assertEquals("The tokenizing algorithm to use on the strings.", string0);
      assertFalse(naiveBayesMultinomialText0.getUseWordFrequencies());
      assertFalse(naiveBayesMultinomialText0.getNormalizeDocLength());
      assertEquals(0, naiveBayesMultinomialText0.getPeriodicPruning());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=3.2580965380214835
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      SnowballStemmer snowballStemmer0 = new SnowballStemmer();
      naiveBayesMultinomialText0.m_stemmer = (Stemmer) snowballStemmer0;
      Random.setNextRandom((-807));
      String[] stringArray0 = naiveBayesMultinomialText0.getOptions();
      naiveBayesMultinomialText0.setOptions(stringArray0);
      assertEquals(2.0, naiveBayesMultinomialText0.getLNorm(), 0.01);
      assertFalse(naiveBayesMultinomialText0.getNormalizeDocLength());
      assertEquals(0, naiveBayesMultinomialText0.getPeriodicPruning());
      assertEquals(12, stringArray0.length);
      assertFalse(naiveBayesMultinomialText0.getUseStopList());
      assertEquals(3.0, naiveBayesMultinomialText0.getMinWordFrequency(), 0.01);
      assertEquals(1.0, naiveBayesMultinomialText0.getNorm(), 0.01);
      assertFalse(naiveBayesMultinomialText0.getUseWordFrequencies());
      assertFalse(naiveBayesMultinomialText0.getLowercaseTokens());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.3740826231014704
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      Capabilities capabilities0 = naiveBayesMultinomialText0.getCapabilities();
      TestInstances testInstances0 = TestInstances.forCapabilities(capabilities0);
      Instances instances0 = testInstances0.generate();
      Instances instances1 = new Instances(instances0);
      naiveBayesMultinomialText0.toString();
      CostSensitiveClassifier costSensitiveClassifier0 = new CostSensitiveClassifier();
      costSensitiveClassifier0.getOnDemandDirectory();
      naiveBayesMultinomialText0.m_normalize = true;
      MockFile mockFile0 = new MockFile(".arff");
      naiveBayesMultinomialText0.setStopwords(mockFile0);
      naiveBayesMultinomialText0.buildClassifier(instances0);
      Instance instance0 = null;
      // Undeclared exception!
      try { 
        naiveBayesMultinomialText0.tokenizeInstance((Instance) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.bayes.NaiveBayesMultinomialText", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      naiveBayesMultinomialText0.getUseStopList();
      naiveBayesMultinomialText0.setUseStopList(true);
      naiveBayesMultinomialText0.useStopListTipText();
      double[] doubleArray0 = new double[0];
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance(13.0, doubleArray0);
      naiveBayesMultinomialText0.tokenizeInstance(binarySparseInstance0, false);
      // Undeclared exception!
      try { 
        naiveBayesMultinomialText0.tokenizeInstance(binarySparseInstance0, true);
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
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      MockFile mockFile0 = new MockFile("9@ab^K;Q", "");
      MockFile.createTempFile("$Fw", "Ee;Gq+kh<d_7X_[.");
      mockFile0.setWritable(true, true);
      naiveBayesMultinomialText0.m_stopwordsFile = (File) mockFile0;
      String[] stringArray0 = naiveBayesMultinomialText0.getOptions();
      assertEquals(3.0, naiveBayesMultinomialText0.getMinWordFrequency(), 0.01);
      assertEquals(1.0, naiveBayesMultinomialText0.getNorm(), 0.01);
      assertEquals(0, naiveBayesMultinomialText0.getPeriodicPruning());
      assertEquals(2.0, naiveBayesMultinomialText0.getLNorm(), 0.01);
      assertEquals(14, stringArray0.length);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=2.557638006765699
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      naiveBayesMultinomialText0.getOptions();
      naiveBayesMultinomialText0.pruneDictionary();
      CostSensitiveClassifier costSensitiveClassifier0 = new CostSensitiveClassifier();
      File file0 = costSensitiveClassifier0.getOnDemandDirectory();
      naiveBayesMultinomialText0.setLowercaseTokens(true);
      naiveBayesMultinomialText0.setStopwords(file0);
      naiveBayesMultinomialText0.getOptions();
      int[] intArray0 = new int[8];
      intArray0[0] = 1;
      intArray0[1] = (-2141);
      intArray0[2] = 2;
      intArray0[3] = 1;
      intArray0[4] = 1;
      intArray0[5] = 2;
      intArray0[6] = 1;
      intArray0[7] = 1;
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance(11.0, intArray0, 1);
      try { 
        naiveBayesMultinomialText0.distributionForInstance(binarySparseInstance0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // DenseInstance doesn't have access to a dataset!
         //
         verifyException("weka.core.AbstractInstance", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "-stopwords";
      stringArray0[1] = "-stopwords";
      stringArray0[2] = "";
      stringArray0[3] = "Whether to convert all tokens to lowercase";
      naiveBayesMultinomialText0.setOptions(stringArray0);
      assertEquals(2.0, naiveBayesMultinomialText0.getLNorm(), 0.01);
      assertEquals(1.0, naiveBayesMultinomialText0.getNorm(), 0.01);
      assertFalse(naiveBayesMultinomialText0.getLowercaseTokens());
      assertEquals(3.0, naiveBayesMultinomialText0.getMinWordFrequency(), 0.01);
      assertFalse(naiveBayesMultinomialText0.getUseWordFrequencies());
      assertFalse(naiveBayesMultinomialText0.getUseStopList());
      assertEquals(0, naiveBayesMultinomialText0.getPeriodicPruning());
      assertFalse(naiveBayesMultinomialText0.getNormalizeDocLength());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      LinkedHashMap<Integer, LinkedHashMap<String, NaiveBayesMultinomialText.Count>> linkedHashMap0 = new LinkedHashMap<Integer, LinkedHashMap<String, NaiveBayesMultinomialText.Count>>();
      String string0 = "VQCx-";
      String[] stringArray0 = new String[8];
      stringArray0[0] = "w";
      PrecomputedKernelMatrixKernel precomputedKernelMatrixKernel0 = new PrecomputedKernelMatrixKernel();
      File file0 = precomputedKernelMatrixKernel0.getKernelMatrixFile();
      File file1 = MockFile.createTempFile("-stemmer", "w", file0);
      naiveBayesMultinomialText0.setStopwords(file1);
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 4.0;
      doubleArray0[1] = 4.0;
      doubleArray0[2] = 4.0;
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance(4.0, doubleArray0);
      SparseInstance sparseInstance0 = new SparseInstance((Instance) binarySparseInstance0);
      BinarySparseInstance binarySparseInstance1 = new BinarySparseInstance((SparseInstance) binarySparseInstance0);
      try { 
        naiveBayesMultinomialText0.distributionForInstance(binarySparseInstance1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // DenseInstance doesn't have access to a dataset!
         //
         verifyException("weka.core.AbstractInstance", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      Capabilities capabilities0 = naiveBayesMultinomialText0.getCapabilities();
      TestInstances testInstances0 = TestInstances.forCapabilities(capabilities0);
      naiveBayesMultinomialText0.m_useStopList = true;
      Instances instances0 = testInstances0.generate();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/home/ubuntu/wekafiles");
      FileSystemHandling.shouldThrowIOException(evoSuiteFile0);
      naiveBayesMultinomialText0.buildClassifier(instances0);
      BinarySparseInstance binarySparseInstance0 = null;
      try {
        binarySparseInstance0 = new BinarySparseInstance((-1), (double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.BinarySparseInstance", e);
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.6535566654733695
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      Locale.getISOCountries();
      Capabilities capabilities0 = naiveBayesMultinomialText0.getCapabilities();
      TestInstances testInstances0 = TestInstances.forCapabilities(capabilities0);
      Instances instances0 = testInstances0.generate();
      Instances instances1 = new Instances(instances0, (-2));
      naiveBayesMultinomialText0.buildClassifier(instances0);
      naiveBayesMultinomialText0.toString();
      CostSensitiveClassifier costSensitiveClassifier0 = new CostSensitiveClassifier();
      File file0 = costSensitiveClassifier0.getOnDemandDirectory();
      naiveBayesMultinomialText0.m_normalize = true;
      MockFile.createTempFile("@data", "/", file0);
      double[] doubleArray0 = new double[0];
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance((-2), doubleArray0);
      naiveBayesMultinomialText0.distributionForInstance(binarySparseInstance0);
      // Undeclared exception!
      try { 
        naiveBayesMultinomialText0.tokenizeInstance(binarySparseInstance0, true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // DenseInstance doesn't have access to a dataset!
         //
         verifyException("weka.core.AbstractInstance", e);
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.8622016991829657
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      Locale.getISOCountries();
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "");
      naiveBayesMultinomialText0.getCapabilities();
      TestInstances testInstances0 = new TestInstances();
      Instances instances0 = testInstances0.generate();
      Instances instances1 = new Instances(instances0);
      naiveBayesMultinomialText0.buildClassifier(instances0);
      naiveBayesMultinomialText0.toString();
      double[] doubleArray0 = new double[0];
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance(3.0, doubleArray0);
      SparseInstance sparseInstance0 = new SparseInstance((Instance) binarySparseInstance0);
      SparseInstance sparseInstance1 = new SparseInstance(sparseInstance0);
      BinarySparseInstance binarySparseInstance1 = new BinarySparseInstance(sparseInstance1);
      int int0 = (-5290);
      AbstractInstance.s_numericAfterDecimalPoint = (-5290);
      naiveBayesMultinomialText0.distributionForInstance(sparseInstance1);
      // Undeclared exception!
      try { 
        naiveBayesMultinomialText0.tokenizeInstance(binarySparseInstance1, true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // DenseInstance doesn't have access to a dataset!
         //
         verifyException("weka.core.AbstractInstance", e);
      }
  }

  /**
  //Test case number: 26
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      naiveBayesMultinomialText0.setPeriodicPruning(20);
      Capabilities capabilities0 = naiveBayesMultinomialText0.getCapabilities();
      TestInstances testInstances0 = TestInstances.forCapabilities(capabilities0);
      Instances instances0 = testInstances0.generate();
      Instances instances1 = new Instances(instances0);
      NaiveBayesMultinomialText naiveBayesMultinomialText1 = new NaiveBayesMultinomialText();
      naiveBayesMultinomialText0.buildClassifier(instances1);
      naiveBayesMultinomialText1.toString();
      naiveBayesMultinomialText0.toString();
      Discretize discretize0 = new Discretize();
      discretize0.getOptions();
  }

  /**
  //Test case number: 27
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      naiveBayesMultinomialText0.getCapabilities();
      TestInstances testInstances0 = new TestInstances();
      Instances instances0 = testInstances0.generate();
      Instances instances1 = new Instances(instances0);
      naiveBayesMultinomialText0.toString();
      CostSensitiveClassifier costSensitiveClassifier0 = new CostSensitiveClassifier();
      SparseInstance sparseInstance0 = new SparseInstance(78);
      instances0.add((Instance) sparseInstance0);
      costSensitiveClassifier0.getOnDemandDirectory();
      naiveBayesMultinomialText0.m_normalize = false;
      MockFile mockFile0 = new MockFile(".arff");
      naiveBayesMultinomialText0.setStopwords(mockFile0);
      naiveBayesMultinomialText0.buildClassifier(instances0);
      // Undeclared exception!
      try { 
        naiveBayesMultinomialText0.tokenizeInstance(sparseInstance0, false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // DenseInstance doesn't have access to a dataset!
         //
         verifyException("weka.core.AbstractInstance", e);
      }
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      Capabilities capabilities0 = naiveBayesMultinomialText0.getCapabilities();
      TestInstances.forCapabilities(capabilities0);
      AbstractClassifier.makeCopy(naiveBayesMultinomialText0);
      boolean boolean0 = true;
      naiveBayesMultinomialText0.m_useStopList = true;
      double[] doubleArray0 = new double[8];
      MockFile mockFile0 = new MockFile("weka/core/Capabilities.props", "weka/core/Capabilities.props");
      MockFile mockFile1 = new MockFile(mockFile0, "\tHow often to prune the dictionary of low frequency words (default = 0, i.e. don't prune)");
      naiveBayesMultinomialText0.setStopwords(mockFile1);
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance(3516.318, doubleArray0);
      SparseInstance sparseInstance0 = new SparseInstance((Instance) binarySparseInstance0);
      try { 
        naiveBayesMultinomialText0.distributionForInstance(binarySparseInstance0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // DenseInstance doesn't have access to a dataset!
         //
         verifyException("weka.core.AbstractInstance", e);
      }
  }

  /**
  //Test case number: 29
  /*Coverage entropy=3.4965075614664793
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      String[] stringArray0 = naiveBayesMultinomialText0.getOptions();
      naiveBayesMultinomialText0.setOptions(stringArray0);
      Capabilities capabilities0 = naiveBayesMultinomialText0.getCapabilities();
      TestInstances testInstances0 = TestInstances.forCapabilities(capabilities0);
      Instances instances0 = testInstances0.generate();
      Instances instances1 = new Instances(instances0);
      naiveBayesMultinomialText0.buildClassifier(instances0);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/home/ubuntu/wekafiles/props/Capabilities.props");
      FileSystemHandling.setPermissions(evoSuiteFile0, false, false, false);
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "Src and Dest string indices differ in length: ");
      MockFile mockFile0 = new MockFile(" ", ".bsi");
      naiveBayesMultinomialText0.m_normalize = true;
      naiveBayesMultinomialText0.m_wordFrequencies = true;
      naiveBayesMultinomialText0.setStopwords(mockFile0);
      double[] doubleArray0 = new double[0];
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance((-2), doubleArray0);
      SparseInstance sparseInstance0 = new SparseInstance((Instance) binarySparseInstance0);
      BinarySparseInstance binarySparseInstance1 = new BinarySparseInstance(sparseInstance0);
      double[] doubleArray1 = naiveBayesMultinomialText0.m_probOfClass;
      naiveBayesMultinomialText0.buildClassifier(instances1);
      NaiveBayesMultinomialText naiveBayesMultinomialText1 = new NaiveBayesMultinomialText();
      NaiveBayesMultinomialText naiveBayesMultinomialText2 = new NaiveBayesMultinomialText();
      // Undeclared exception!
      try { 
        naiveBayesMultinomialText2.tokenizeInstance(binarySparseInstance0, true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // DenseInstance doesn't have access to a dataset!
         //
         verifyException("weka.core.AbstractInstance", e);
      }
  }

  /**
  //Test case number: 30
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      naiveBayesMultinomialText0.m_leplace = 3.0;
      naiveBayesMultinomialText0.m_stemmer = null;
      naiveBayesMultinomialText0.getOptions();
      naiveBayesMultinomialText0.pruneDictionary();
  }

  /**
  //Test case number: 31
  /*Coverage entropy=3.332204510175204
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      String[] stringArray0 = naiveBayesMultinomialText0.getOptions();
      naiveBayesMultinomialText0.setOptions(stringArray0);
      Capabilities capabilities0 = naiveBayesMultinomialText0.getCapabilities();
      TestInstances.forCapabilities(capabilities0);
      naiveBayesMultinomialText0.listOptions();
      naiveBayesMultinomialText0.getOptions();
      naiveBayesMultinomialText0.setOptions(stringArray0);
      String[] stringArray1 = new String[5];
      stringArray1[0] = "-tokenizer";
      stringArray1[1] = " ";
      stringArray1[2] = " ";
      stringArray1[3] = "weka.core.ListOptions";
      stringArray1[4] = "weka.core.ListOptions";
      try { 
        naiveBayesMultinomialText0.setOptions(stringArray1);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid tokenizer specification string
         //
         verifyException("weka.classifiers.bayes.NaiveBayesMultinomialText", e);
      }
  }

  /**
  //Test case number: 32
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      Capabilities capabilities0 = naiveBayesMultinomialText0.getCapabilities();
      TestInstances testInstances0 = TestInstances.forCapabilities(capabilities0);
      Instances instances0 = testInstances0.generate();
      Instances instances1 = new Instances(instances0);
      naiveBayesMultinomialText0.toString();
      CostSensitiveClassifier costSensitiveClassifier0 = new CostSensitiveClassifier();
      costSensitiveClassifier0.getOnDemandDirectory();
      naiveBayesMultinomialText0.m_lowercaseTokens = true;
      naiveBayesMultinomialText0.m_normalize = true;
      MockFile mockFile0 = new MockFile(".arff");
      naiveBayesMultinomialText0.setStopwords(mockFile0);
      naiveBayesMultinomialText0.buildClassifier(instances0);
      Instance instance0 = null;
      // Undeclared exception!
      try { 
        naiveBayesMultinomialText0.tokenizeInstance((Instance) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.bayes.NaiveBayesMultinomialText", e);
      }
  }
}