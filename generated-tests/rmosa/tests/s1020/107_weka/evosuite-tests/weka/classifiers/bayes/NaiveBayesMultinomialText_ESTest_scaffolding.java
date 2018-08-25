/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Aug 23 14:20:30 GMT 2018
 */

package weka.classifiers.bayes;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class NaiveBayesMultinomialText_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "weka.classifiers.bayes.NaiveBayesMultinomialText"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("user.country", "US"); 
    java.lang.System.setProperty("user.dir", "/home/ubuntu/evosuite_readability_gen/projects/107_weka"); 
    java.lang.System.setProperty("user.home", "/home/ubuntu"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "ubuntu"); 
    java.lang.System.setProperty("user.timezone", "Etc/UTC"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(NaiveBayesMultinomialText_ESTest_scaffolding.class.getClassLoader() ,
      "weka.core.Environment",
      "weka.core.TestInstances",
      "weka.filters.unsupervised.attribute.NominalToBinary",
      "weka.classifiers.AbstractClassifier",
      "org.pentaho.packageManagement.PackageConstraint",
      "weka.attributeSelection.AttributeEvaluator",
      "weka.filters.unsupervised.attribute.Center",
      "org.pentaho.packageManagement.Package",
      "weka.core.OptionHandler",
      "weka.core.xml.XMLBasicSerialization",
      "weka.core.WekaException",
      "weka.classifiers.trees.m5.M5Base",
      "weka.filters.StreamableFilter",
      "weka.filters.UnsupervisedFilter",
      "weka.core.logging.Logger$Level",
      "weka.classifiers.Classifier",
      "weka.classifiers.evaluation.output.prediction.AbstractOutput",
      "weka.core.Capabilities$Capability",
      "weka.core.SparseInstance",
      "weka.core.DenseInstance",
      "org.pentaho.packageManagement.PackageManager",
      "weka.core.stemmers.Stemmer",
      "weka.attributeSelection.AttributeTransformer",
      "weka.core.tokenizers.WordTokenizer",
      "weka.classifiers.misc.SerializedClassifier",
      "weka.classifiers.functions.supportVector.PrecomputedKernelMatrixKernel",
      "weka.filters.unsupervised.attribute.ReplaceMissingValues",
      "org.pentaho.packageManagement.DefaultPackageManager",
      "weka.attributeSelection.PrincipalComponents",
      "weka.core.stemmers.SnowballStemmer",
      "weka.classifiers.Evaluation",
      "weka.classifiers.functions.supportVector.Kernel",
      "weka.core.WekaPackageManager",
      "org.bounce.net.DefaultAuthenticator",
      "weka.filters.SupervisedFilter",
      "weka.core.TechnicalInformationHandler",
      "weka.core.tokenizers.CharacterDelimitedTokenizer",
      "weka.core.Option",
      "weka.core.stemmers.NullStemmer",
      "weka.filters.unsupervised.attribute.PotentialClassIgnorer",
      "weka.core.AllJavadoc",
      "weka.classifiers.functions.SGDText",
      "weka.classifiers.trees.m5.RuleNode",
      "weka.filters.Sourcable",
      "weka.core.Utils",
      "weka.core.tokenizers.Tokenizer",
      "weka.core.Attribute",
      "weka.core.NoSupportForMissingValuesException",
      "weka.core.Stopwords",
      "weka.classifiers.UpdateableClassifier",
      "weka.classifiers.bayes.NaiveBayesMultinomialText",
      "weka.core.FastVector",
      "weka.core.MultiInstanceCapabilitiesHandler",
      "weka.core.Copyable",
      "weka.core.Capabilities",
      "weka.filters.supervised.attribute.NominalToBinary",
      "weka.classifiers.bayes.NaiveBayesMultinomialText$Count",
      "weka.core.BinarySparseInstance",
      "weka.core.UnassignedDatasetException",
      "weka.classifiers.RandomizableClassifier",
      "weka.core.SerializedObject",
      "weka.core.Summarizable",
      "weka.core.RevisionUtils",
      "weka.core.AdditionalMeasureProducer",
      "org.pentaho.packageManagement.PackageManager$1",
      "weka.core.Instance",
      "weka.core.ProtectedProperties",
      "weka.core.Drawable",
      "weka.core.matrix.Matrix",
      "weka.core.AttributeStats",
      "weka.core.WeightedInstancesHandler",
      "weka.core.CapabilitiesHandler",
      "weka.filters.unsupervised.attribute.Remove",
      "weka.classifiers.rules.M5Rules",
      "weka.core.Randomizable",
      "weka.core.Javadoc",
      "weka.attributeSelection.ASEvaluation",
      "weka.core.AbstractInstance",
      "weka.core.Instances",
      "weka.core.SelectedTag",
      "org.pentaho.packageManagement.DefaultPackage",
      "weka.core.UnassignedClassException",
      "weka.core.Version",
      "weka.attributeSelection.UnsupervisedAttributeEvaluator",
      "weka.filters.unsupervised.attribute.Standardize",
      "weka.core.UnsupportedAttributeTypeException",
      "weka.core.TechnicalInformation",
      "weka.classifiers.Sourcable",
      "weka.core.RevisionHandler",
      "weka.classifiers.evaluation.output.prediction.PlainText",
      "weka.filters.unsupervised.attribute.RemoveUseless",
      "weka.core.xml.XMLSerialization",
      "weka.classifiers.xml.XMLClassifier",
      "weka.filters.Filter",
      "weka.core.Tag"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(NaiveBayesMultinomialText_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "weka.classifiers.AbstractClassifier",
      "weka.classifiers.bayes.NaiveBayesMultinomialText",
      "weka.classifiers.bayes.NaiveBayesMultinomialText$Count",
      "weka.core.Capabilities$Capability",
      "weka.core.tokenizers.Tokenizer",
      "weka.core.tokenizers.CharacterDelimitedTokenizer",
      "weka.core.tokenizers.WordTokenizer",
      "weka.core.stemmers.NullStemmer",
      "weka.core.AbstractInstance",
      "weka.core.SparseInstance",
      "weka.core.BinarySparseInstance",
      "weka.core.Attribute",
      "weka.core.ProtectedProperties",
      "weka.core.Utils",
      "weka.core.UnassignedDatasetException",
      "weka.core.RevisionUtils",
      "weka.classifiers.Evaluation",
      "weka.core.Option",
      "weka.core.Instances",
      "weka.classifiers.bayes.NaiveBayes",
      "weka.classifiers.CostMatrix",
      "weka.core.Capabilities",
      "org.pentaho.packageManagement.PackageManager",
      "org.pentaho.packageManagement.DefaultPackageManager",
      "weka.core.Version",
      "weka.core.Environment",
      "weka.core.WekaPackageManager",
      "weka.core.SerializedObject",
      "weka.core.DenseInstance",
      "weka.core.neighboursearch.NearestNeighbourSearch",
      "weka.core.neighboursearch.CoverTree",
      "weka.core.NormalizableDistance",
      "weka.core.EuclideanDistance",
      "weka.core.Range",
      "weka.core.Stopwords",
      "weka.core.neighboursearch.BallTree",
      "weka.core.neighboursearch.balltrees.BallTreeConstructor",
      "weka.core.neighboursearch.balltrees.TopDownConstructor",
      "weka.core.neighboursearch.balltrees.BallSplitter",
      "weka.core.neighboursearch.balltrees.PointsClosestToFurthestChildren",
      "weka.core.neighboursearch.NearestNeighbourSearch$MyHeap",
      "weka.core.neighboursearch.NearestNeighbourSearch$MyHeapElement",
      "weka.core.TestInstances",
      "weka.attributeSelection.ASEvaluation",
      "weka.attributeSelection.UnsupervisedAttributeEvaluator",
      "weka.attributeSelection.PrincipalComponents",
      "weka.filters.Filter",
      "weka.filters.SimpleFilter",
      "weka.filters.SimpleStreamFilter",
      "weka.filters.MultiFilter",
      "weka.filters.AllFilter",
      "weka.core.tokenizers.NGramTokenizer",
      "weka.filters.supervised.attribute.Discretize",
      "weka.core.stemmers.LovinsStemmer",
      "weka.classifiers.trees.J48",
      "weka.core.neighboursearch.balltrees.MiddleOutConstructor",
      "weka.core.neighboursearch.balltrees.BallNode",
      "weka.core.neighboursearch.LinearNNSearch",
      "weka.classifiers.SingleClassifierEnhancer",
      "weka.classifiers.misc.InputMappedClassifier",
      "weka.classifiers.rules.ZeroR",
      "weka.classifiers.RandomizableClassifier",
      "weka.core.Tag",
      "weka.classifiers.functions.SGDText",
      "weka.classifiers.bayes.BayesNet",
      "weka.classifiers.bayes.net.search.SearchAlgorithm",
      "weka.classifiers.bayes.net.search.local.LocalScoreSearchAlgorithm",
      "weka.classifiers.bayes.net.search.local.K2",
      "weka.classifiers.bayes.net.estimate.BayesNetEstimator",
      "weka.classifiers.bayes.net.estimate.SimpleEstimator",
      "weka.classifiers.functions.supportVector.Kernel",
      "weka.classifiers.functions.supportVector.PrecomputedKernelMatrixKernel",
      "weka.core.stemmers.SnowballStemmer",
      "weka.classifiers.IteratedSingleClassifierEnhancer",
      "weka.classifiers.ParallelIteratedSingleClassifierEnhancer",
      "weka.classifiers.RandomizableParallelIteratedSingleClassifierEnhancer",
      "weka.classifiers.meta.RandomCommittee",
      "weka.classifiers.trees.RandomTree",
      "weka.classifiers.RandomizableSingleClassifierEnhancer",
      "weka.classifiers.meta.CostSensitiveClassifier",
      "weka.classifiers.bayes.net.BIFReader",
      "weka.core.FindWithCapabilities",
      "weka.core.SingleIndex",
      "weka.core.WekaException",
      "weka.core.UnsupportedAttributeTypeException",
      "weka.filters.unsupervised.attribute.PotentialClassIgnorer",
      "weka.filters.unsupervised.attribute.ReplaceMissingValues",
      "weka.core.tokenizers.AlphabeticTokenizer",
      "weka.core.stemmers.IteratedLovinsStemmer",
      "weka.classifiers.MultipleClassifiersCombiner",
      "weka.classifiers.ParallelMultipleClassifiersCombiner",
      "weka.classifiers.RandomizableParallelMultipleClassifiersCombiner",
      "weka.classifiers.meta.Stacking",
      "weka.core.neighboursearch.KDTree",
      "weka.core.neighboursearch.kdtrees.KDTreeNodeSplitter",
      "weka.core.neighboursearch.kdtrees.SlidingMidPointOfWidestSide",
      "weka.core.SelectedTag",
      "weka.classifiers.functions.LinearRegression",
      "weka.core.converters.ArffLoader$ArffReader",
      "weka.core.UnassignedClassException",
      "weka.classifiers.meta.RegressionByDiscretization",
      "weka.filters.unsupervised.attribute.Discretize",
      "weka.classifiers.trees.j48.ClassifierTree",
      "weka.classifiers.trees.j48.C45PruneableClassifierTree",
      "weka.attributeSelection.OneRAttributeEval",
      "weka.classifiers.bayes.NaiveBayesMultinomial",
      "weka.classifiers.functions.GaussianProcesses",
      "weka.classifiers.functions.supportVector.CachedKernel",
      "weka.classifiers.functions.supportVector.PolyKernel",
      "weka.classifiers.lazy.IBk",
      "weka.classifiers.trees.m5.M5Base",
      "weka.classifiers.rules.M5Rules",
      "weka.classifiers.misc.SerializedClassifier",
      "weka.classifiers.meta.AdditiveRegression",
      "weka.classifiers.rules.DecisionTable",
      "weka.attributeSelection.ASSearch",
      "weka.attributeSelection.BestFirst",
      "weka.classifiers.RandomizableMultipleClassifiersCombiner",
      "weka.classifiers.meta.MultiScheme",
      "weka.estimators.Estimator",
      "weka.estimators.DiscreteEstimator",
      "weka.core.neighboursearch.balltrees.BottomUpConstructor",
      "weka.classifiers.meta.RandomSubSpace",
      "weka.classifiers.trees.REPTree",
      "weka.classifiers.trees.RandomForest",
      "weka.classifiers.rules.JRip",
      "weka.classifiers.meta.AttributeSelectedClassifier",
      "weka.attributeSelection.CfsSubsetEval",
      "weka.classifiers.functions.Logistic",
      "weka.core.stemmers.Stemming",
      "weka.classifiers.RandomizableIteratedSingleClassifierEnhancer",
      "weka.classifiers.meta.AdaBoostM1",
      "weka.classifiers.trees.DecisionStump",
      "weka.core.WekaEnumeration",
      "weka.core.Attribute$1",
      "weka.classifiers.meta.FilteredClassifier",
      "weka.filters.supervised.attribute.AttributeSelection",
      "weka.attributeSelection.AttributeSelection",
      "weka.attributeSelection.GreedyStepwise",
      "weka.classifiers.rules.OneR",
      "weka.estimators.PoissonEstimator",
      "weka.classifiers.meta.LogitBoost",
      "weka.estimators.KernelEstimator",
      "weka.core.MinkowskiDistance",
      "weka.classifiers.meta.ClassificationViaRegression",
      "weka.classifiers.trees.M5P",
      "weka.estimators.MahalanobisEstimator",
      "weka.classifiers.lazy.LWL",
      "weka.attributeSelection.Ranker",
      "weka.classifiers.meta.MultiClassClassifier",
      "weka.classifiers.functions.SMO",
      "weka.attributeSelection.CorrelationAttributeEval",
      "weka.attributeSelection.ReliefFAttributeEval",
      "weka.core.matrix.Matrix",
      "weka.core.TechnicalInformation",
      "weka.core.TechnicalInformation$Type",
      "weka.core.TechnicalInformation$Field",
      "weka.attributeSelection.GainRatioAttributeEval",
      "weka.attributeSelection.InfoGainAttributeEval",
      "weka.estimators.NormalEstimator",
      "weka.classifiers.meta.Vote",
      "weka.core.Javadoc",
      "weka.core.ClassDiscovery",
      "weka.core.ClassCache",
      "weka.core.AllJavadoc",
      "weka.core.Queue",
      "weka.core.AttributeLocator",
      "weka.core.StringLocator",
      "weka.core.RelationalLocator",
      "weka.core.GlobalInfoJavadoc",
      "weka.classifiers.functions.SimpleLinearRegression",
      "weka.classifiers.functions.VotedPerceptron",
      "weka.classifiers.bayes.NaiveBayesMultinomialUpdateable",
      "weka.classifiers.trees.LMT",
      "weka.core.TechnicalInformationHandlerJavadoc",
      "weka.classifiers.functions.supportVector.Puk",
      "weka.classifiers.functions.SimpleLogistic",
      "weka.core.AttributeStats",
      "weka.attributeSelection.WrapperSubsetEval",
      "weka.core.neighboursearch.PerformanceStats",
      "weka.core.neighboursearch.TreePerformanceStats",
      "weka.classifiers.functions.SMOreg",
      "weka.classifiers.functions.supportVector.RegOptimizer",
      "weka.classifiers.functions.supportVector.RegSMO",
      "weka.classifiers.functions.supportVector.RegSMOImproved",
      "weka.classifiers.functions.supportVector.NormalizedPolyKernel",
      "weka.classifiers.meta.Bagging",
      "weka.classifiers.functions.SGD",
      "weka.classifiers.functions.supportVector.RBFKernel",
      "weka.classifiers.meta.MultiClassClassifierUpdateable",
      "weka.attributeSelection.SymmetricalUncertAttributeEval",
      "weka.classifiers.functions.supportVector.StringKernel",
      "weka.core.converters.ConverterUtils$DataSource",
      "weka.core.converters.AbstractLoader",
      "weka.core.converters.AbstractFileLoader",
      "weka.core.converters.ArffLoader",
      "weka.classifiers.bayes.NaiveBayesUpdateable",
      "weka.classifiers.functions.MultilayerPerceptron",
      "weka.core.FastVector",
      "weka.filters.unsupervised.attribute.NominalToBinary",
      "weka.classifiers.functions.neural.SigmoidUnit",
      "weka.classifiers.functions.neural.LinearUnit",
      "weka.core.ChebyshevDistance",
      "weka.core.Check",
      "weka.core.CheckOptionHandler",
      "weka.classifiers.lazy.KStar",
      "weka.classifiers.meta.CVParameterSelection",
      "weka.classifiers.rules.PART",
      "weka.classifiers.rules.part.MakeDecList",
      "weka.core.CheckGOE",
      "weka.core.ContingencyTables",
      "weka.core.Queue$QueueNode",
      "weka.core.OptionHandlerJavadoc",
      "weka.classifiers.trees.j48.SplitCriterion",
      "weka.classifiers.trees.j48.EntropyBasedSplitCrit",
      "weka.classifiers.trees.j48.EntropySplitCrit",
      "weka.classifiers.rules.part.ClassifierDecList",
      "weka.classifiers.rules.OneR$OneRRule",
      "weka.core.ManhattanDistance",
      "weka.experiment.Stats",
      "weka.core.ListOptions",
      "weka.filters.unsupervised.attribute.NumericToBinary",
      "weka.core.SerializationHelper",
      "weka.core.neighboursearch.kdtrees.KDTreeNode"
    );
  }
}
