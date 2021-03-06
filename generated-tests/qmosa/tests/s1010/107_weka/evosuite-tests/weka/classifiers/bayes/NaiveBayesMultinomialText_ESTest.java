/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 11:08:40 GMT 2018
 */

package weka.classifiers.bayes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;
import weka.classifiers.AbstractClassifier;
import weka.classifiers.Classifier;
import weka.classifiers.bayes.NaiveBayesMultinomialText;
import weka.classifiers.functions.SGDText;
import weka.classifiers.lazy.LWL;
import weka.core.Attribute;
import weka.core.BinarySparseInstance;
import weka.core.DenseInstance;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.SparseInstance;
import weka.core.TestInstances;
import weka.core.neighboursearch.balltrees.BallNode;
import weka.core.stemmers.SnowballStemmer;
import weka.core.stemmers.Stemmer;
import weka.core.tokenizers.AlphabeticTokenizer;
import weka.core.tokenizers.NGramTokenizer;
import weka.core.tokenizers.Tokenizer;
import weka.core.tokenizers.WordTokenizer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NaiveBayesMultinomialText_ESTest extends NaiveBayesMultinomialText_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "Ignore any words that don't occur at least min frequency times in the training data. If periodic pruning is turned on, then the dictionary is pruned according to this value";
      stringArray0[1] = "AGT|HF.M0|@HL";
      naiveBayesMultinomialText0.reset();
      Stemmer stemmer0 = naiveBayesMultinomialText0.getStemmer();
      naiveBayesMultinomialText0.m_stemmer = stemmer0;
      naiveBayesMultinomialText0.setLowercaseTokens(false);
      stringArray0[2] = "0yQmMAX#my3J";
      AbstractClassifier.runClassifier(naiveBayesMultinomialText0, stringArray0);
      String string0 = naiveBayesMultinomialText0.normTipText();
      assertEquals("The norm of the instances after normalization.", string0);
      
      boolean boolean0 = naiveBayesMultinomialText0.getLowercaseTokens();
      assertFalse(boolean0);
      
      naiveBayesMultinomialText0.listOptions();
      assertFalse(naiveBayesMultinomialText0.getNormalizeDocLength());
      assertEquals(3.0, naiveBayesMultinomialText0.getMinWordFrequency(), 0.01);
      assertEquals(2.0, naiveBayesMultinomialText0.getLNorm(), 0.01);
      assertEquals(1.0, naiveBayesMultinomialText0.getNorm(), 0.01);
      assertEquals(0, naiveBayesMultinomialText0.getPeriodicPruning());
      assertFalse(naiveBayesMultinomialText0.getUseWordFrequencies());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      naiveBayesMultinomialText0.getUseWordFrequencies();
      NaiveBayesMultinomialText naiveBayesMultinomialText1 = new NaiveBayesMultinomialText();
      Tokenizer tokenizer0 = naiveBayesMultinomialText1.getTokenizer();
      naiveBayesMultinomialText0.m_tokenizer = tokenizer0;
      WordTokenizer wordTokenizer0 = (WordTokenizer)naiveBayesMultinomialText0.m_tokenizer;
      naiveBayesMultinomialText0.setTokenizer(wordTokenizer0);
      naiveBayesMultinomialText0.lowercaseTokensTipText();
      naiveBayesMultinomialText0.getPeriodicPruning();
      naiveBayesMultinomialText0.getTokenizer();
      naiveBayesMultinomialText1.listOptions();
      naiveBayesMultinomialText0.setNorm(0.0);
      naiveBayesMultinomialText1.setNorm(0.0);
      naiveBayesMultinomialText1.setNormalizeDocLength(true);
      naiveBayesMultinomialText1.setMinWordFrequency(2101.1513925212);
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) 0;
      File file0 = naiveBayesMultinomialText0.getStopwords();
      MockFile mockFile0 = new MockFile(file0, "Whether to convert all tokens to lowercase");
      naiveBayesMultinomialText0.setStopwords(mockFile0);
      doubleArray0[1] = 0.0;
      doubleArray0[2] = 0.0;
      doubleArray0[3] = 2.0;
      doubleArray0[4] = 0.0;
      doubleArray0[5] = 2101.1513925212;
      SparseInstance sparseInstance0 = null;
      try {
        sparseInstance0 = new SparseInstance(2.0, doubleArray0, (int[]) null, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.SparseInstance", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      naiveBayesMultinomialText0.setPeriodicPruning((-408));
      naiveBayesMultinomialText0.getUseWordFrequencies();
      naiveBayesMultinomialText0.getRevision();
      naiveBayesMultinomialText0.m_stemmer = null;
      naiveBayesMultinomialText0.setOptions((String[]) null);
      naiveBayesMultinomialText0.getStopwords();
      assertEquals((-408), naiveBayesMultinomialText0.getPeriodicPruning());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      naiveBayesMultinomialText0.stemmerTipText();
      Map<Integer, LinkedHashMap<String, NaiveBayesMultinomialText.Count>> map0 = naiveBayesMultinomialText0.m_probOfWordGivenClass;
      File file0 = MockFile.createTempFile("The stemming algorithm to use on the words.", "");
      naiveBayesMultinomialText0.m_stopwordsFile = file0;
      naiveBayesMultinomialText0.m_probOfWordGivenClass = null;
      SnowballStemmer snowballStemmer0 = new SnowballStemmer("The stemming algorithm to use on the words.");
      snowballStemmer0.setOptions((String[]) null);
      naiveBayesMultinomialText0.setStemmer(snowballStemmer0);
      naiveBayesMultinomialText0.setStemmer(snowballStemmer0);
      naiveBayesMultinomialText0.useStopListTipText();
      naiveBayesMultinomialText0.tokenizerTipText();
      assertEquals(2.0, naiveBayesMultinomialText0.getLNorm(), 0.01);
      
      naiveBayesMultinomialText0.setLNorm(0.0);
      assertEquals(0.0, naiveBayesMultinomialText0.getLNorm(), 0.01);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.70805020110221
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      naiveBayesMultinomialText0.listOptions();
      naiveBayesMultinomialText0.tokenizerTipText();
      String[] stringArray0 = new String[9];
      naiveBayesMultinomialText0.m_useStopList = true;
      stringArray0[0] = "The tokenizing algorithm to use on the strings.";
      stringArray0[1] = "The tokenizing algorithm to use on the strings.";
      stringArray0[2] = "The tokenizing algorithm to use on the strings.";
      stringArray0[3] = "The tokenizing algorithm to use on the strings.";
      stringArray0[4] = "";
      stringArray0[5] = "The tokenizing algorithm to use on the strings.";
      stringArray0[6] = "The tokenizing algorithm to use on the strings.";
      stringArray0[7] = "x&y>:_,1>RLDe&c-'S";
      stringArray0[8] = "The tokenizing algorithm to use on the strings.";
      NaiveBayesMultinomialText.main(stringArray0);
      naiveBayesMultinomialText0.useWordFrequenciesTipText();
      naiveBayesMultinomialText0.setOptions(stringArray0);
      naiveBayesMultinomialText0.getStopwords();
      AlphabeticTokenizer alphabeticTokenizer0 = new AlphabeticTokenizer();
      AlphabeticTokenizer alphabeticTokenizer1 = new AlphabeticTokenizer();
      Tokenizer.runTokenizer(alphabeticTokenizer1, stringArray0);
      alphabeticTokenizer0.setOptions((String[]) null);
      naiveBayesMultinomialText0.setTokenizer(alphabeticTokenizer0);
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance(2578);
      binarySparseInstance0.insertAttributeAt(68);
      binarySparseInstance0.setValueSparse(2578, 2578);
      Attribute attribute0 = new Attribute("");
      // Undeclared exception!
      try { 
        binarySparseInstance0.relationalValue(attribute0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Attribute isn't relation-valued!
         //
         verifyException("weka.core.AbstractInstance", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.833213344056216
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      naiveBayesMultinomialText0.getOptions();
      naiveBayesMultinomialText0.pruneDictionary();
      naiveBayesMultinomialText0.toString();
      naiveBayesMultinomialText0.m_t = 1.0;
      naiveBayesMultinomialText0.setLowercaseTokens(true);
      naiveBayesMultinomialText0.setPeriodicPruning(1738);
      int[] intArray0 = new int[2];
      intArray0[0] = 1738;
      intArray0[1] = 1738;
      SparseInstance sparseInstance0 = null;
      try {
        sparseInstance0 = new SparseInstance(1.0, (double[]) null, intArray0, (-2781));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.SparseInstance", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = 0.0;
      doubleArray0[2] = (-1956.495914481248);
      doubleArray0[3] = 1248.7;
      doubleArray0[4] = (-2708.618537);
      doubleArray0[5] = 0.0;
      doubleArray0[6] = (-2338.228194);
      doubleArray0[7] = 0.0;
      naiveBayesMultinomialText0.m_probOfClass = doubleArray0;
      AbstractClassifier.runClassifier(naiveBayesMultinomialText0, (String[]) null);
      assertEquals(0, naiveBayesMultinomialText0.getPeriodicPruning());
      
      naiveBayesMultinomialText0.pruneDictionary();
      String string0 = naiveBayesMultinomialText0.normalizeDocLengthTipText();
      assertFalse(naiveBayesMultinomialText0.getNormalizeDocLength());
      assertFalse(naiveBayesMultinomialText0.getUseWordFrequencies());
      assertEquals(1.0, naiveBayesMultinomialText0.getNorm(), 0.01);
      assertEquals(3.0, naiveBayesMultinomialText0.getMinWordFrequency(), 0.01);
      assertEquals(2.0, naiveBayesMultinomialText0.getLNorm(), 0.01);
      assertEquals("If true then document length is normalized according to the settings for norm and lnorm", string0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      naiveBayesMultinomialText0.m_lowercaseTokens = true;
      LinkedHashMap<String, NaiveBayesMultinomialText.Count> linkedHashMap0 = new LinkedHashMap<String, NaiveBayesMultinomialText.Count>();
      naiveBayesMultinomialText0.m_inputVector = linkedHashMap0;
      NaiveBayesMultinomialText naiveBayesMultinomialText1 = new NaiveBayesMultinomialText();
      WordTokenizer wordTokenizer0 = (WordTokenizer)naiveBayesMultinomialText1.m_tokenizer;
      naiveBayesMultinomialText0.setTokenizer(wordTokenizer0);
      naiveBayesMultinomialText0.stopwordsTipText();
      naiveBayesMultinomialText0.setNorm(0.0);
      double[] doubleArray0 = new double[0];
      DenseInstance denseInstance0 = new DenseInstance(0.0, doubleArray0);
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance(denseInstance0);
      Instances instances0 = naiveBayesMultinomialText0.m_data;
      Attribute attribute0 = null;
      try {
        attribute0 = new Attribute("]I'Vn.*[7jAW3f6@", (Instances) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.Attribute", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      double double0 = (-485.934914501);
      SparseInstance sparseInstance0 = new SparseInstance(0);
      SparseInstance sparseInstance1 = new SparseInstance((Instance) sparseInstance0);
      try { 
        naiveBayesMultinomialText0.distributionForInstance(sparseInstance1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.bayes.NaiveBayesMultinomialText", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=3.2188758248681983
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      naiveBayesMultinomialText0.normalizeDocLengthTipText();
      LWL lWL0 = new LWL();
      Classifier classifier0 = lWL0.getClassifier();
      AbstractClassifier.makeCopies(classifier0, 5);
      naiveBayesMultinomialText0.listOptions();
      naiveBayesMultinomialText0.getPeriodicPruning();
      String[] stringArray0 = new String[2];
      naiveBayesMultinomialText0.setPeriodicPruning((-2236));
      stringArray0[0] = "If true then document length is normalized according to the settings for norm and lnorm";
      stringArray0[1] = "If true then document length is normalized according to the settings for norm and lnorm";
      NaiveBayesMultinomialText.main(stringArray0);
      naiveBayesMultinomialText0.useWordFrequenciesTipText();
      NGramTokenizer nGramTokenizer0 = new NGramTokenizer();
      nGramTokenizer0.setNGramMinSize(86);
      nGramTokenizer0.setDelimiters("");
      naiveBayesMultinomialText0.setTokenizer(nGramTokenizer0);
      naiveBayesMultinomialText0.setLowercaseTokens(true);
      naiveBayesMultinomialText0.globalInfo();
      naiveBayesMultinomialText0.getNormalizeDocLength();
      naiveBayesMultinomialText0.reset();
      naiveBayesMultinomialText0.getStopwords();
      naiveBayesMultinomialText0.getCapabilities();
      naiveBayesMultinomialText0.getMinWordFrequency();
      naiveBayesMultinomialText0.setOptions(stringArray0);
      naiveBayesMultinomialText0.getCapabilities();
      naiveBayesMultinomialText0.listOptions();
      naiveBayesMultinomialText0.lowercaseTokensTipText();
      naiveBayesMultinomialText0.pruneDictionary();
      naiveBayesMultinomialText0.getCapabilities();
      naiveBayesMultinomialText0.getLowercaseTokens();
      naiveBayesMultinomialText0.setPeriodicPruning((-2236));
      naiveBayesMultinomialText0.reset();
      naiveBayesMultinomialText0.setLNorm(3620.960499084);
      assertEquals(3620.960499084, naiveBayesMultinomialText0.getLNorm(), 0.01);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      naiveBayesMultinomialText0.setUseWordFrequencies(true);
      SGDText sGDText0 = new SGDText();
      File file0 = sGDText0.getStopwords();
      naiveBayesMultinomialText0.m_stopwordsFile = file0;
      String[] stringArray0 = new String[5];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "1Km:tSPQycSCGd!Q)";
      stringArray0[3] = "LWZ}x%5?.['*+n^U}";
      stringArray0[4] = "How often (number of instances) to prune the dictionary of low frequency terms. 0 means don't prune. Setting a positive integer n means prune after every n instances";
      NaiveBayesMultinomialText.main(stringArray0);
      NaiveBayesMultinomialText.main(stringArray0);
      naiveBayesMultinomialText0.setLNorm(7.0);
      naiveBayesMultinomialText0.toString();
      naiveBayesMultinomialText0.getOptions();
      naiveBayesMultinomialText0.lowercaseTokensTipText();
      BinarySparseInstance binarySparseInstance0 = null;
      try {
        binarySparseInstance0 = new BinarySparseInstance((Instance) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.BinarySparseInstance", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.890371757896165
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      Tokenizer tokenizer0 = naiveBayesMultinomialText0.getTokenizer();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "M3f;%q^QJF%+xiT";
      stringArray0[1] = ">2w^~E;x";
      stringArray0[2] = "\tThe number of relational attributes (default 1).";
      stringArray0[3] = "$J-_~)=";
      stringArray0[4] = "";
      stringArray0[5] = "user.dir";
      NaiveBayesMultinomialText.main(stringArray0);
      naiveBayesMultinomialText0.m_useStopList = true;
      naiveBayesMultinomialText0.m_leplace = 107.308744032;
      naiveBayesMultinomialText0.m_tokenizer = tokenizer0;
      naiveBayesMultinomialText0.setLNorm((-481.1));
      naiveBayesMultinomialText0.setUseStopList(true);
      naiveBayesMultinomialText0.m_normalize = true;
      naiveBayesMultinomialText0.periodicPruningTipText();
      naiveBayesMultinomialText0.getOptions();
  }

  /**
  //Test case number: 12
  /*Coverage entropy=3.35462479700817
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      naiveBayesMultinomialText0.setNormalizeDocLength(true);
      naiveBayesMultinomialText0.reset();
      naiveBayesMultinomialText0.reset();
      naiveBayesMultinomialText0.getUseStopList();
      naiveBayesMultinomialText0.minWordFrequencyTipText();
      AlphabeticTokenizer alphabeticTokenizer0 = new AlphabeticTokenizer();
      String[] stringArray0 = new String[5];
      naiveBayesMultinomialText0.setPeriodicPruning(93);
      naiveBayesMultinomialText0.m_tokenizer = (Tokenizer) alphabeticTokenizer0;
      stringArray0[0] = "Ignore any words that don't occur at least min frequency times in the training data. If periodic pruning is turned on, then the dictionary is pruned according to this value";
      stringArray0[1] = "Ignore any words that don't occur at least min frequency times in the training data. If periodic pruning is turned on, then the dictionary is pruned according to this value";
      naiveBayesMultinomialText0.m_periodicP = 93;
      naiveBayesMultinomialText0.setDebug(false);
      stringArray0[2] = "Ignore any words that don't occur at least min frequency times in the training data. If periodic pruning is turned on, then the dictionary is pruned according to this value";
      stringArray0[3] = "Ignore any words that don't occur at least min frequency times in the training data. If periodic pruning is turned on, then the dictionary is pruned according to this value";
      stringArray0[4] = "Ignore any words that don't occur at least min frequency times in the training data. If periodic pruning is turned on, then the dictionary is pruned according to this value";
      Tokenizer.runTokenizer(alphabeticTokenizer0, stringArray0);
      naiveBayesMultinomialText0.setTokenizer(alphabeticTokenizer0);
      naiveBayesMultinomialText0.setNorm(2956.6);
      naiveBayesMultinomialText0.setNorm((-1711.5374615));
      naiveBayesMultinomialText0.normalizeDocLengthTipText();
      String[] stringArray1 = naiveBayesMultinomialText0.getOptions();
      naiveBayesMultinomialText0.setMinWordFrequency(0.0);
      naiveBayesMultinomialText0.pruneDictionary();
      naiveBayesMultinomialText0.minWordFrequencyTipText();
      NaiveBayesMultinomialText naiveBayesMultinomialText1 = new NaiveBayesMultinomialText();
      WordTokenizer wordTokenizer0 = (WordTokenizer)naiveBayesMultinomialText1.m_tokenizer;
      Tokenizer.runTokenizer(wordTokenizer0, stringArray0);
      naiveBayesMultinomialText0.setNormalizeDocLength(true);
      naiveBayesMultinomialText0.lowercaseTokensTipText();
      naiveBayesMultinomialText1.setOptions(stringArray1);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=3.178053830347946
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      naiveBayesMultinomialText0.setNormalizeDocLength(true);
      naiveBayesMultinomialText0.reset();
      naiveBayesMultinomialText0.reset();
      naiveBayesMultinomialText0.getUseStopList();
      naiveBayesMultinomialText0.minWordFrequencyTipText();
      AlphabeticTokenizer alphabeticTokenizer0 = new AlphabeticTokenizer();
      naiveBayesMultinomialText0.setPeriodicPruning((-2379));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "Ignore any words that don't occur at least min frequency times in the training data. If periodic pruning is turned on, then the dictionary is pruned according to this value";
      Tokenizer.runTokenizer(alphabeticTokenizer0, stringArray0);
      naiveBayesMultinomialText0.setTokenizer(alphabeticTokenizer0);
      naiveBayesMultinomialText0.setNorm(7.0);
      naiveBayesMultinomialText0.setNorm(0.0);
      naiveBayesMultinomialText0.normalizeDocLengthTipText();
      naiveBayesMultinomialText0.getOptions();
      naiveBayesMultinomialText0.setMinWordFrequency((-2379));
      naiveBayesMultinomialText0.pruneDictionary();
      naiveBayesMultinomialText0.minWordFrequencyTipText();
      naiveBayesMultinomialText0.setNormalizeDocLength(false);
      NaiveBayesMultinomialText naiveBayesMultinomialText1 = new NaiveBayesMultinomialText();
      naiveBayesMultinomialText1.lowercaseTokensTipText();
      naiveBayesMultinomialText1.LNormTipText();
  }

  /**
  //Test case number: 14
  /*Coverage entropy=3.0280290733074104
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      naiveBayesMultinomialText0.reset();
      NaiveBayesMultinomialText naiveBayesMultinomialText1 = new NaiveBayesMultinomialText();
      naiveBayesMultinomialText1.getUseStopList();
      naiveBayesMultinomialText0.minWordFrequencyTipText();
      AlphabeticTokenizer alphabeticTokenizer0 = new AlphabeticTokenizer();
      naiveBayesMultinomialText1.setPeriodicPruning(93);
      naiveBayesMultinomialText0.setDebug(false);
      NaiveBayesMultinomialText naiveBayesMultinomialText2 = new NaiveBayesMultinomialText();
      WordTokenizer wordTokenizer0 = new WordTokenizer();
      naiveBayesMultinomialText2.setTokenizer(wordTokenizer0);
      naiveBayesMultinomialText1.setNorm(3739.94866994);
      naiveBayesMultinomialText1.setNorm((-1711.5374615));
      naiveBayesMultinomialText1.normalizeDocLengthTipText();
      NaiveBayesMultinomialText naiveBayesMultinomialText3 = new NaiveBayesMultinomialText();
      naiveBayesMultinomialText3.getOptions();
      naiveBayesMultinomialText2.setMinWordFrequency(0.0);
      // Undeclared exception!
      try { 
        naiveBayesMultinomialText1.pruneDictionary();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.bayes.NaiveBayesMultinomialText", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=3.5508536106210093
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      naiveBayesMultinomialText0.getUseStopList();
      naiveBayesMultinomialText0.minWordFrequencyTipText();
      AlphabeticTokenizer alphabeticTokenizer0 = new AlphabeticTokenizer();
      NaiveBayesMultinomialText naiveBayesMultinomialText1 = new NaiveBayesMultinomialText();
      naiveBayesMultinomialText1.setPeriodicPruning(294);
      naiveBayesMultinomialText0.setDebug(true);
      NaiveBayesMultinomialText naiveBayesMultinomialText2 = new NaiveBayesMultinomialText();
      WordTokenizer wordTokenizer0 = new WordTokenizer();
      naiveBayesMultinomialText2.setTokenizer(wordTokenizer0);
      naiveBayesMultinomialText2.setNorm(294);
      naiveBayesMultinomialText0.setNorm(93);
      NaiveBayesMultinomialText naiveBayesMultinomialText3 = new NaiveBayesMultinomialText();
      naiveBayesMultinomialText3.normalizeDocLengthTipText();
      NaiveBayesMultinomialText naiveBayesMultinomialText4 = new NaiveBayesMultinomialText();
      String[] stringArray0 = naiveBayesMultinomialText2.getOptions();
      naiveBayesMultinomialText3.setMinWordFrequency((-2758.63533));
      naiveBayesMultinomialText2.pruneDictionary();
      naiveBayesMultinomialText4.minWordFrequencyTipText();
      NaiveBayesMultinomialText naiveBayesMultinomialText5 = new NaiveBayesMultinomialText();
      WordTokenizer wordTokenizer1 = (WordTokenizer)naiveBayesMultinomialText5.m_tokenizer;
      naiveBayesMultinomialText0.setNormalizeDocLength(true);
      naiveBayesMultinomialText0.lowercaseTokensTipText();
      naiveBayesMultinomialText1.setOptions(stringArray0);
      TestInstances testInstances0 = new TestInstances();
      Instances instances0 = testInstances0.generate("Ignore any words that don't occur at least min frequency times in the training data. If periodic pruning is turned on, then the dictionary is pruned according to this value");
      naiveBayesMultinomialText4.buildClassifier(instances0);
      naiveBayesMultinomialText5.getOptions();
      int[] intArray0 = new int[1];
      intArray0[0] = (-1);
      Instance instance0 = BallNode.calcCentroidPivot(117, (-1), intArray0, instances0);
      try { 
        naiveBayesMultinomialText4.distributionForInstance(instance0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // DenseInstance doesn't have access to a dataset!
         //
         verifyException("weka.core.AbstractInstance", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.8739867076185663
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      naiveBayesMultinomialText0.setLNorm(0.0);
      naiveBayesMultinomialText0.periodicPruningTipText();
      NaiveBayesMultinomialText naiveBayesMultinomialText1 = new NaiveBayesMultinomialText();
      naiveBayesMultinomialText1.setNormalizeDocLength(true);
      naiveBayesMultinomialText0.lowercaseTokensTipText();
      String[] stringArray0 = new String[27];
      stringArray0[0] = "How often (number of instances) to prune the dictionary of low frequency terms. 0 means don't prune. Setting a positive integer n means prune after every n instances";
      stringArray0[1] = "";
      stringArray0[2] = "-stopwords";
      stringArray0[3] = "\tSpecify the norm that each instance must have (default 1.0)";
      stringArray0[4] = "!k9^se?";
      stringArray0[5] = "\tSpecify the norm that each instance must have (default 1.0)";
      stringArray0[6] = "";
      stringArray0[7] = "";
      TestInstances testInstances0 = new TestInstances();
      Instances instances0 = testInstances0.generate("!k9^se?");
      naiveBayesMultinomialText1.buildClassifier(instances0);
      NaiveBayesMultinomialText naiveBayesMultinomialText2 = new NaiveBayesMultinomialText();
      naiveBayesMultinomialText2.getOptions();
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.17157089695751
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      DenseInstance denseInstance0 = new DenseInstance(1);
      naiveBayesMultinomialText0.normTipText();
      MockFile mockFile0 = new MockFile("c`k +9M>");
      File file0 = MockFile.createTempFile("The norm of the instances after normalization.", "The norm of the instances after normalization.", (File) mockFile0);
      naiveBayesMultinomialText0.setStopwords(file0);
      System.setCurrentTimeMillis(2004318071);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "c`k +9M>";
      stringArray0[1] = "The norm of the instances after normalization.";
      stringArray0[2] = "c`k +9M>";
      stringArray0[3] = "The norm of the instances after normalization.";
      stringArray0[4] = "The norm of the instances after normalization.";
      stringArray0[5] = "c`k +9M>";
      naiveBayesMultinomialText0.setOptions(stringArray0);
      System.setCurrentTimeMillis(26L);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.729722341528714
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      naiveBayesMultinomialText0.toString();
      TestInstances testInstances0 = new TestInstances();
      Instances instances0 = testInstances0.generate(" ");
      naiveBayesMultinomialText0.buildClassifier(instances0);
      naiveBayesMultinomialText0.toString();
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.079151272882851
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "";
      stringArray0[1] = "[U";
      stringArray0[2] = "";
      stringArray0[3] = "5KD&hYFIoKyJn";
      stringArray0[4] = "";
      stringArray0[5] = "-stopwords";
      stringArray0[6] = "\tSpecify L-norm to use (default 2.0)";
      stringArray0[7] = "The month in which the work was published or, for an unpublished work, in which it was written. You should use the standard three-letter abbreviation, as described in Appendix B.1.3 of the LaTeX book.";
      stringArray0[8] = "t|c7g*6}OUWc<\"j&";
      naiveBayesMultinomialText0.setOptions(stringArray0);
  }
}
