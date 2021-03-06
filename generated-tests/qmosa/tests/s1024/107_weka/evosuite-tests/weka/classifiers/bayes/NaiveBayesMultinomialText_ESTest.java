/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 15:00:56 GMT 2018
 */

package weka.classifiers.bayes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import weka.attributeSelection.PrincipalComponents;
import weka.classifiers.AbstractClassifier;
import weka.classifiers.bayes.NaiveBayesMultinomialText;
import weka.classifiers.functions.SGDText;
import weka.classifiers.functions.supportVector.PrecomputedKernelMatrixKernel;
import weka.classifiers.meta.CostSensitiveClassifier;
import weka.classifiers.misc.SerializedClassifier;
import weka.core.Attribute;
import weka.core.BinarySparseInstance;
import weka.core.Capabilities;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.SparseInstance;
import weka.core.Stopwords;
import weka.core.TestInstances;
import weka.core.stemmers.LovinsStemmer;
import weka.core.stemmers.NullStemmer;
import weka.core.stemmers.SnowballStemmer;
import weka.core.stemmers.Stemmer;
import weka.core.tokenizers.Tokenizer;
import weka.core.tokenizers.WordTokenizer;
import weka.filters.Filter;
import weka.filters.supervised.attribute.Discretize;
import weka.filters.unsupervised.attribute.ReplaceMissingValues;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NaiveBayesMultinomialText_ESTest extends NaiveBayesMultinomialText_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      double double0 = 1.0;
      SGDText sGDText0 = new SGDText();
      sGDText0.getLossFunction();
      naiveBayesMultinomialText0.setStopwords((File) null);
      naiveBayesMultinomialText0.m_lnorm = 1927.651739931443;
      Tokenizer tokenizer0 = sGDText0.getTokenizer();
      naiveBayesMultinomialText0.setTokenizer(tokenizer0);
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = 1927.651739931443;
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance(0.0, doubleArray0);
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
  //Test case number: 1
  /*Coverage entropy=2.772588722239781
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      naiveBayesMultinomialText0.m_data = null;
      naiveBayesMultinomialText0.getNorm();
      naiveBayesMultinomialText0.pruneDictionary();
      naiveBayesMultinomialText0.getLowercaseTokens();
      naiveBayesMultinomialText0.setLowercaseTokens(false);
      String[] stringArray0 = naiveBayesMultinomialText0.getOptions();
      assertEquals(12, stringArray0.length);
      
      naiveBayesMultinomialText0.getUseStopList();
      naiveBayesMultinomialText0.setNorm(1.0);
      assertEquals(3.0, naiveBayesMultinomialText0.getMinWordFrequency(), 0.01);
      assertEquals(2.0, naiveBayesMultinomialText0.getLNorm(), 0.01);
      assertEquals(1.0, naiveBayesMultinomialText0.getNorm(), 0.01);
      assertEquals(0, naiveBayesMultinomialText0.getPeriodicPruning());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      SerializedClassifier serializedClassifier0 = new SerializedClassifier();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "FL0q";
      stringArray0[1] = "H`JnG\"2SphGiW1d^";
      stringArray0[2] = "";
      String[] stringArray1 = new String[5];
      stringArray1[0] = "FL0q";
      stringArray1[1] = "4bJO|-x";
      stringArray1[2] = "4bJO|-x";
      stringArray1[3] = "H`JnG\"2SphGiW1d^";
      stringArray1[4] = "";
      serializedClassifier0.setOptions(stringArray1);
      stringArray0[3] = "4bJO|-x";
      NaiveBayesMultinomialText.main(stringArray0);
      File file0 = serializedClassifier0.getModelFile();
      naiveBayesMultinomialText0.setStopwords(file0);
      naiveBayesMultinomialText0.reset();
      assertFalse(naiveBayesMultinomialText0.getUseStopList());
      assertEquals(1.0, naiveBayesMultinomialText0.getNorm(), 0.01);
      assertEquals(3.0, naiveBayesMultinomialText0.getMinWordFrequency(), 0.01);
      assertEquals(2.0, naiveBayesMultinomialText0.getLNorm(), 0.01);
      assertFalse(naiveBayesMultinomialText0.getNormalizeDocLength());
      assertFalse(naiveBayesMultinomialText0.getUseWordFrequencies());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      naiveBayesMultinomialText0.m_periodicP = (-1269);
      naiveBayesMultinomialText0.getLowercaseTokens();
      naiveBayesMultinomialText0.listOptions();
      naiveBayesMultinomialText0.getCapabilities();
      naiveBayesMultinomialText0.setNorm(15.0);
      assertEquals(15.0, naiveBayesMultinomialText0.getNorm(), 0.01);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      boolean boolean0 = false;
      naiveBayesMultinomialText0.setLowercaseTokens(false);
      naiveBayesMultinomialText0.listOptions();
      naiveBayesMultinomialText0.tokenizerTipText();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "";
      stringArray0[1] = "The tokenizing algorithm to use on the strings.";
      stringArray0[2] = "The tokenizing algorithm to use on the strings.";
      int int0 = 0;
      naiveBayesMultinomialText0.setPeriodicPruning(0);
      stringArray0[3] = "The tokenizing algorithm to use on the strings.";
      stringArray0[4] = "The tokenizing algorithm to use on the strings.";
      stringArray0[5] = "The tokenizing algorithm to use on the strings.";
      try { 
        AbstractClassifier.forName("The tokenizing algorithm to use on the strings.", stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Can't find class called: The tokenizing algorithm to use on the strings.
         //
         verifyException("weka.core.Utils", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      naiveBayesMultinomialText0.m_normalize = true;
      String[] stringArray0 = new String[4];
      stringArray0[0] = "normalize";
      stringArray0[1] = "\tNormalize dimensions' widths.";
      stringArray0[2] = "Q28";
      stringArray0[3] = "";
      naiveBayesMultinomialText0.setOptions(stringArray0);
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (-2045.6656574094866);
      naiveBayesMultinomialText0.m_wordsPerClass = doubleArray0;
      naiveBayesMultinomialText0.LNormTipText();
      naiveBayesMultinomialText0.getNorm();
      String[] stringArray1 = new String[5];
      stringArray1[0] = "normalize";
      stringArray1[1] = "Q28";
      stringArray1[2] = "Q28";
      stringArray1[3] = "The LNorm to use for document length normalization.";
      AbstractClassifier.runClassifier(naiveBayesMultinomialText0, stringArray0);
      stringArray1[4] = "\tNormalize dimensions' widths.";
      naiveBayesMultinomialText0.setOptions(stringArray1);
      naiveBayesMultinomialText0.tokenizerTipText();
      naiveBayesMultinomialText0.reset();
      naiveBayesMultinomialText0.getPeriodicPruning();
      naiveBayesMultinomialText0.listOptions();
      naiveBayesMultinomialText0.getUseWordFrequencies();
      naiveBayesMultinomialText0.getLowercaseTokens();
      naiveBayesMultinomialText0.setLowercaseTokens(false);
      CostSensitiveClassifier costSensitiveClassifier0 = new CostSensitiveClassifier();
      File file0 = costSensitiveClassifier0.getOnDemandDirectory();
      naiveBayesMultinomialText0.setStopwords(file0);
      naiveBayesMultinomialText0.getCapabilities();
      naiveBayesMultinomialText0.pruneDictionary();
      assertFalse(naiveBayesMultinomialText0.getNormalizeDocLength());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      naiveBayesMultinomialText0.m_stopwordsFile = null;
      MockFile mockFile0 = new MockFile("klg$!");
      mockFile0.setReadOnly();
      naiveBayesMultinomialText0.pruneDictionary();
      assertFalse(naiveBayesMultinomialText0.getNormalizeDocLength());
      
      naiveBayesMultinomialText0.m_normalize = true;
      naiveBayesMultinomialText0.m_stopwordsFile = (File) mockFile0;
      mockFile0.toURL();
      naiveBayesMultinomialText0.setUseWordFrequencies(false);
      naiveBayesMultinomialText0.useWordFrequenciesTipText();
      String string0 = naiveBayesMultinomialText0.stopwordsTipText();
      assertEquals("The file containing the stopwords (if this is a directory then the default ones are used).", string0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      naiveBayesMultinomialText0.lowercaseTokensTipText();
      WordTokenizer wordTokenizer0 = new WordTokenizer();
      naiveBayesMultinomialText0.m_tokenizer = (Tokenizer) wordTokenizer0;
      wordTokenizer0.getRevision();
      naiveBayesMultinomialText0.setTokenizer(wordTokenizer0);
      naiveBayesMultinomialText0.getRevision();
      naiveBayesMultinomialText0.LNormTipText();
      naiveBayesMultinomialText0.setPeriodicPruning((-1));
      assertEquals((-1), naiveBayesMultinomialText0.getPeriodicPruning());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      naiveBayesMultinomialText0.getLNorm();
      naiveBayesMultinomialText0.globalInfo();
      naiveBayesMultinomialText0.globalInfo();
      PrincipalComponents principalComponents0 = new PrincipalComponents();
      int[] intArray0 = new int[7];
      intArray0[0] = (-2975);
      intArray0[1] = (-515);
      intArray0[2] = (-226);
      intArray0[3] = (-670);
      intArray0[4] = (-1);
      intArray0[5] = (-892);
      intArray0[6] = (-2271);
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance(0.0, intArray0, 2264);
      try { 
        principalComponents0.convertInstance(binarySparseInstance0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // convertInstance: Principal components not built yet
         //
         verifyException("weka.attributeSelection.PrincipalComponents", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      naiveBayesMultinomialText0.getRevision();
      Stopwords stopwords0 = naiveBayesMultinomialText0.m_stopwords;
      naiveBayesMultinomialText0.m_stopwords = null;
      naiveBayesMultinomialText0.setMinWordFrequency(2.0);
      naiveBayesMultinomialText0.setNormalizeDocLength(true);
      naiveBayesMultinomialText0.getNorm();
      naiveBayesMultinomialText0.getNormalizeDocLength();
      naiveBayesMultinomialText0.normalizeDocLengthTipText();
      naiveBayesMultinomialText0.reset();
      assertTrue(naiveBayesMultinomialText0.getNormalizeDocLength());
      assertEquals(2.0, naiveBayesMultinomialText0.getMinWordFrequency(), 0.01);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      naiveBayesMultinomialText0.getCapabilities();
      naiveBayesMultinomialText0.setNormalizeDocLength(false);
      naiveBayesMultinomialText0.getRevision();
      naiveBayesMultinomialText0.normTipText();
      naiveBayesMultinomialText0.getLNorm();
      ReplaceMissingValues replaceMissingValues0 = new ReplaceMissingValues();
      // Undeclared exception!
      try { 
        replaceMissingValues0.getOutputFormat();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // No output format defined.
         //
         verifyException("weka.filters.Filter", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String[] stringArray0 = new String[0];
      NaiveBayesMultinomialText.main(stringArray0);
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      File file0 = null;
      naiveBayesMultinomialText0.setStopwords((File) null);
      naiveBayesMultinomialText0.setUseStopList(true);
      naiveBayesMultinomialText0.useStopListTipText();
      naiveBayesMultinomialText0.normalizeDocLengthTipText();
      naiveBayesMultinomialText0.tokenizerTipText();
      naiveBayesMultinomialText0.LNormTipText();
      WordTokenizer wordTokenizer0 = new WordTokenizer();
      naiveBayesMultinomialText0.setTokenizer(wordTokenizer0);
      BinarySparseInstance binarySparseInstance0 = null;
      try {
        binarySparseInstance0 = new BinarySparseInstance((-1243));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.BinarySparseInstance", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 4.9E-324;
      doubleArray0[1] = 0.0;
      doubleArray0[2] = (-173.30379469724);
      doubleArray0[3] = 0.0;
      doubleArray0[4] = 1.0;
      doubleArray0[5] = 0.0;
      naiveBayesMultinomialText0.m_wordsPerClass = doubleArray0;
      naiveBayesMultinomialText0.m_t = 0.0;
      naiveBayesMultinomialText0.m_t = 3.0;
      boolean boolean0 = true;
      naiveBayesMultinomialText0.setNormalizeDocLength(true);
      LinkedHashMap<String, NaiveBayesMultinomialText.Count> linkedHashMap0 = new LinkedHashMap<String, NaiveBayesMultinomialText.Count>();
      naiveBayesMultinomialText0.m_inputVector = linkedHashMap0;
      naiveBayesMultinomialText0.setStopwords((File) null);
      naiveBayesMultinomialText0.setLNorm(0.0);
      naiveBayesMultinomialText0.useWordFrequenciesTipText();
      naiveBayesMultinomialText0.periodicPruningTipText();
      naiveBayesMultinomialText0.setUseWordFrequencies(true);
      NullStemmer nullStemmer0 = new NullStemmer();
      String[] stringArray0 = new String[0];
      NullStemmer.main(stringArray0);
      naiveBayesMultinomialText0.setStemmer(nullStemmer0);
      Discretize discretize0 = new Discretize();
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
  //Test case number: 13
  /*Coverage entropy=2.0982737395252498
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      naiveBayesMultinomialText0.m_stemmer = (Stemmer) lovinsStemmer0;
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.getRevision();
      naiveBayesMultinomialText0.setNormalizeDocLength(false);
      File file0 = MockFile.createTempFile("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.", "A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.");
      naiveBayesMultinomialText0.setStopwords(file0);
      naiveBayesMultinomialText0.stemmerTipText();
      naiveBayesMultinomialText0.LNormTipText();
      naiveBayesMultinomialText0.getCapabilities();
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 2252.625707704239;
      doubleArray0[1] = 2252.625707704239;
      doubleArray0[2] = 1109.7656579;
      doubleArray0[3] = 2252.625707704239;
      doubleArray0[4] = 2252.625707704239;
      SparseInstance sparseInstance0 = new SparseInstance(2252.625707704239, doubleArray0);
      try { 
        naiveBayesMultinomialText0.updateClassifier(sparseInstance0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // DenseInstance doesn't have access to a dataset!
         //
         verifyException("weka.core.AbstractInstance", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=3.3966337170421057
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      Tokenizer tokenizer0 = naiveBayesMultinomialText0.getTokenizer();
      naiveBayesMultinomialText0.setTokenizer(tokenizer0);
      naiveBayesMultinomialText0.stopwordsTipText();
      naiveBayesMultinomialText0.pruneDictionary();
      naiveBayesMultinomialText0.setLowercaseTokens(true);
      naiveBayesMultinomialText0.lowercaseTokensTipText();
      String[] stringArray0 = naiveBayesMultinomialText0.getOptions();
      naiveBayesMultinomialText0.setOptions(stringArray0);
      naiveBayesMultinomialText0.setLowercaseTokens(false);
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 1149.7787;
      doubleArray0[1] = 1149.7787;
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance(1149.7787, doubleArray0);
      AbstractClassifier.makeCopy(naiveBayesMultinomialText0);
      SparseInstance sparseInstance0 = new SparseInstance((SparseInstance) binarySparseInstance0);
      try { 
        naiveBayesMultinomialText0.updateClassifier(sparseInstance0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // DenseInstance doesn't have access to a dataset!
         //
         verifyException("weka.core.AbstractInstance", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      String string0 = naiveBayesMultinomialText0.minWordFrequencyTipText();
      assertEquals(2.0, naiveBayesMultinomialText0.getLNorm(), 0.01);
      assertEquals(1.0, naiveBayesMultinomialText0.getNorm(), 0.01);
      assertEquals(3.0, naiveBayesMultinomialText0.getMinWordFrequency(), 0.01);
      assertEquals("Ignore any words that don't occur at least min frequency times in the training data. If periodic pruning is turned on, then the dictionary is pruned according to this value", string0);
      assertFalse(naiveBayesMultinomialText0.getUseWordFrequencies());
      assertFalse(naiveBayesMultinomialText0.getNormalizeDocLength());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.830650293601348
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      naiveBayesMultinomialText0.getTokenizer();
      naiveBayesMultinomialText0.lowercaseTokensTipText();
      TestInstances testInstances0 = new TestInstances();
      Instances instances0 = testInstances0.generate("Whether to convert all tokens to lowercase");
      MockRandom mockRandom0 = new MockRandom((-2));
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)87;
      byteArray0[3] = (byte)94;
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte)16;
      mockRandom0.nextBytes(byteArray0);
      instances0.resample(mockRandom0);
      naiveBayesMultinomialText0.buildClassifier(instances0);
      naiveBayesMultinomialText0.setLNorm((-2));
      naiveBayesMultinomialText0.getStopwords();
      Stemmer stemmer0 = naiveBayesMultinomialText0.getStemmer();
      int[] intArray0 = new int[8];
      intArray0[0] = (-1);
      intArray0[1] = (-2);
      intArray0[2] = (-1);
      naiveBayesMultinomialText0.setStemmer(stemmer0);
      naiveBayesMultinomialText0.toString();
      naiveBayesMultinomialText0.getNormalizeDocLength();
      naiveBayesMultinomialText0.getOptions();
      naiveBayesMultinomialText0.periodicPruningTipText();
      NaiveBayesMultinomialText naiveBayesMultinomialText1 = new NaiveBayesMultinomialText();
      naiveBayesMultinomialText1.listOptions();
      naiveBayesMultinomialText0.getLowercaseTokens();
      assertEquals((-2.0), naiveBayesMultinomialText0.getLNorm(), 0.01);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.7478680974667573
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      Tokenizer tokenizer0 = naiveBayesMultinomialText0.getTokenizer();
      naiveBayesMultinomialText0.setTokenizer(tokenizer0);
      naiveBayesMultinomialText0.stopwordsTipText();
      naiveBayesMultinomialText0.pruneDictionary();
      PrecomputedKernelMatrixKernel precomputedKernelMatrixKernel0 = new PrecomputedKernelMatrixKernel();
      File file0 = precomputedKernelMatrixKernel0.getKernelMatrixFile();
      naiveBayesMultinomialText0.setStopwords(file0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.662247729572388
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      naiveBayesMultinomialText0.m_data = null;
      SerializedClassifier serializedClassifier0 = new SerializedClassifier();
      File file0 = serializedClassifier0.getModelFile();
      MockFile mockFile0 = new MockFile(file0, "on~y");
      mockFile0.toURL();
      naiveBayesMultinomialText0.setStopwords(mockFile0);
      naiveBayesMultinomialText0.getNorm();
      naiveBayesMultinomialText0.pruneDictionary();
      naiveBayesMultinomialText0.getLowercaseTokens();
      naiveBayesMultinomialText0.setLowercaseTokens(false);
      naiveBayesMultinomialText0.getOptions();
      naiveBayesMultinomialText0.getDebug();
      naiveBayesMultinomialText0.debugTipText();
      naiveBayesMultinomialText0.stopwordsTipText();
      Random.setNextRandom((-2570));
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      naiveBayesMultinomialText0.setPeriodicPruning(3980);
      // Undeclared exception!
      try { 
        naiveBayesMultinomialText0.pruneDictionary();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.bayes.NaiveBayesMultinomialText", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=2.8567260316530594
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      naiveBayesMultinomialText0.setUseWordFrequencies(true);
      LinkedHashMap<Integer, LinkedHashMap<String, NaiveBayesMultinomialText.Count>> linkedHashMap0 = new LinkedHashMap<Integer, LinkedHashMap<String, NaiveBayesMultinomialText.Count>>();
      naiveBayesMultinomialText0.m_probOfWordGivenClass = (Map<Integer, LinkedHashMap<String, NaiveBayesMultinomialText.Count>>) linkedHashMap0;
      String[] stringArray0 = naiveBayesMultinomialText0.getOptions();
      naiveBayesMultinomialText0.setOptions(stringArray0);
      System.setCurrentTimeMillis(1L);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      MockRandom mockRandom0 = new MockRandom((-1619L));
      byte[] byteArray0 = new byte[21];
      byteArray0[0] = (byte)87;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)16;
      byteArray0[3] = (byte)87;
      byteArray0[4] = (byte)16;
      byteArray0[5] = (byte)94;
      byteArray0[6] = (byte)94;
      byteArray0[7] = (byte)0;
      mockRandom0.nextBytes(byteArray0);
      TestInstances testInstances0 = new TestInstances();
      Instances instances0 = testInstances0.generate();
      naiveBayesMultinomialText0.buildClassifier(instances0);
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance((byte)0);
      naiveBayesMultinomialText0.distributionForInstance(binarySparseInstance0);
      System.setCurrentTimeMillis(1L);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=2.9898480455631775
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      SnowballStemmer snowballStemmer0 = new SnowballStemmer();
      naiveBayesMultinomialText0.setStemmer(snowballStemmer0);
      naiveBayesMultinomialText0.toString();
      naiveBayesMultinomialText0.getNormalizeDocLength();
      String[] stringArray0 = naiveBayesMultinomialText0.getOptions();
      naiveBayesMultinomialText0.periodicPruningTipText();
      NaiveBayesMultinomialText naiveBayesMultinomialText1 = new NaiveBayesMultinomialText();
      naiveBayesMultinomialText1.listOptions();
      naiveBayesMultinomialText0.getLowercaseTokens();
      naiveBayesMultinomialText0.setOptions(stringArray0);
  }
}
