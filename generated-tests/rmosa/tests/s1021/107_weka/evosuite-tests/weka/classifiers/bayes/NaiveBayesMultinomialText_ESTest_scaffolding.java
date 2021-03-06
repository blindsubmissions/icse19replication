/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Aug 23 14:56:01 GMT 2018
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
      "weka.core.DistanceFunction",
      "weka.classifiers.AbstractClassifier",
      "org.pentaho.packageManagement.PackageConstraint",
      "weka.attributeSelection.AttributeEvaluator",
      "weka.filters.unsupervised.attribute.Center",
      "org.pentaho.packageManagement.Package",
      "weka.core.OptionHandler",
      "weka.core.xml.XMLBasicSerialization",
      "weka.core.WekaException",
      "weka.filters.StreamableFilter",
      "weka.filters.UnsupervisedFilter",
      "weka.core.logging.Logger$Level",
      "weka.core.scripting.JythonSerializableObject",
      "weka.classifiers.Classifier",
      "weka.classifiers.evaluation.output.prediction.AbstractOutput",
      "weka.core.Capabilities$Capability",
      "weka.core.DenseInstance",
      "weka.core.SparseInstance",
      "org.pentaho.packageManagement.PackageManager",
      "weka.core.stemmers.Stemmer",
      "weka.attributeSelection.AttributeTransformer",
      "weka.core.tokenizers.WordTokenizer",
      "weka.classifiers.functions.supportVector.PrecomputedKernelMatrixKernel",
      "weka.classifiers.misc.SerializedClassifier",
      "weka.filters.unsupervised.attribute.ReplaceMissingValues",
      "org.pentaho.packageManagement.DefaultPackageManager",
      "weka.attributeSelection.PrincipalComponents",
      "weka.core.stemmers.SnowballStemmer",
      "weka.classifiers.Evaluation",
      "weka.classifiers.functions.supportVector.Kernel",
      "weka.core.WekaPackageManager",
      "org.bounce.net.DefaultAuthenticator",
      "weka.core.tokenizers.CharacterDelimitedTokenizer",
      "weka.core.Option",
      "weka.core.stemmers.NullStemmer",
      "weka.filters.unsupervised.attribute.PotentialClassIgnorer",
      "weka.filters.Sourcable",
      "weka.core.Utils",
      "weka.core.tokenizers.Tokenizer",
      "weka.core.Attribute",
      "weka.core.NoSupportForMissingValuesException",
      "weka.core.Stopwords",
      "weka.classifiers.UpdateableClassifier",
      "weka.core.tokenizers.AlphabeticTokenizer",
      "weka.classifiers.bayes.NaiveBayesMultinomialText",
      "weka.core.FastVector",
      "weka.core.MultiInstanceCapabilitiesHandler",
      "weka.core.Capabilities",
      "weka.core.Copyable",
      "weka.core.BinarySparseInstance",
      "weka.classifiers.bayes.NaiveBayesMultinomialText$Count",
      "weka.core.UnassignedDatasetException",
      "weka.core.SerializedObject",
      "weka.core.Summarizable",
      "weka.core.RevisionUtils",
      "weka.core.neighboursearch.balltrees.BallNode",
      "org.pentaho.packageManagement.PackageManager$1",
      "weka.core.Instance",
      "weka.core.ProtectedProperties",
      "weka.core.matrix.Matrix",
      "weka.core.AttributeStats",
      "weka.core.WeightedInstancesHandler",
      "weka.core.CapabilitiesHandler",
      "weka.filters.unsupervised.attribute.Remove",
      "weka.attributeSelection.ASEvaluation",
      "weka.core.AbstractInstance",
      "weka.core.Instances",
      "weka.core.scripting.JythonObject",
      "org.pentaho.packageManagement.DefaultPackage",
      "weka.core.UnassignedClassException",
      "weka.core.Version",
      "weka.attributeSelection.UnsupervisedAttributeEvaluator",
      "weka.filters.unsupervised.attribute.Standardize",
      "weka.core.UnsupportedAttributeTypeException",
      "weka.core.RevisionHandler",
      "weka.classifiers.evaluation.output.prediction.PlainText",
      "weka.core.xml.XMLSerialization",
      "weka.classifiers.xml.XMLClassifier",
      "weka.filters.Filter",
      "weka.core.converters.ArffLoader$ArffReader"
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
      "weka.classifiers.CostMatrix",
      "weka.core.Utils",
      "weka.classifiers.bayes.BayesNet",
      "weka.classifiers.bayes.net.search.SearchAlgorithm",
      "weka.core.Tag",
      "weka.classifiers.bayes.net.search.local.LocalScoreSearchAlgorithm",
      "weka.classifiers.bayes.net.search.local.K2",
      "weka.classifiers.bayes.net.estimate.BayesNetEstimator",
      "weka.classifiers.bayes.net.estimate.SimpleEstimator",
      "weka.core.BinarySparseInstance",
      "weka.core.Option",
      "weka.core.RevisionUtils",
      "weka.core.DenseInstance",
      "weka.core.SerializedObject",
      "weka.attributeSelection.ASEvaluation",
      "weka.attributeSelection.UnsupervisedAttributeEvaluator",
      "weka.attributeSelection.PrincipalComponents",
      "weka.filters.Filter",
      "weka.filters.supervised.attribute.Discretize",
      "weka.core.Range",
      "weka.classifiers.Evaluation",
      "weka.core.UnassignedDatasetException",
      "weka.core.Javadoc",
      "weka.core.OptionHandlerJavadoc",
      "weka.core.neighboursearch.NearestNeighbourSearch",
      "weka.core.neighboursearch.CoverTree",
      "weka.core.NormalizableDistance",
      "weka.core.EuclideanDistance",
      "weka.core.Instances",
      "weka.core.TestInstances",
      "weka.classifiers.bayes.NaiveBayes",
      "weka.classifiers.bayes.NaiveBayesUpdateable",
      "weka.core.neighboursearch.BallTree",
      "weka.core.neighboursearch.balltrees.BallTreeConstructor",
      "weka.core.neighboursearch.balltrees.TopDownConstructor",
      "weka.core.neighboursearch.balltrees.BallSplitter",
      "weka.core.neighboursearch.balltrees.PointsClosestToFurthestChildren",
      "weka.classifiers.misc.SerializedClassifier",
      "weka.classifiers.RandomizableClassifier",
      "weka.classifiers.functions.SGDText",
      "weka.core.stemmers.LovinsStemmer",
      "weka.core.stemmers.IteratedLovinsStemmer",
      "weka.core.TechnicalInformation",
      "weka.core.TechnicalInformation$Type",
      "weka.core.TechnicalInformation$Field",
      "weka.core.Capabilities",
      "org.pentaho.packageManagement.PackageManager",
      "org.pentaho.packageManagement.DefaultPackageManager",
      "weka.core.Version",
      "weka.core.Environment",
      "weka.core.WekaPackageManager",
      "weka.core.converters.ArffLoader$ArffReader",
      "weka.classifiers.SingleClassifierEnhancer",
      "weka.classifiers.RandomizableSingleClassifierEnhancer",
      "weka.classifiers.meta.CostSensitiveClassifier",
      "weka.classifiers.rules.ZeroR",
      "weka.core.neighboursearch.KDTree",
      "weka.core.neighboursearch.kdtrees.KDTreeNodeSplitter",
      "weka.core.neighboursearch.kdtrees.SlidingMidPointOfWidestSide",
      "weka.core.tokenizers.NGramTokenizer",
      "weka.core.Stopwords",
      "weka.core.stemmers.Stemming",
      "weka.classifiers.functions.supportVector.Kernel",
      "weka.classifiers.functions.supportVector.PrecomputedKernelMatrixKernel",
      "weka.core.tokenizers.AlphabeticTokenizer",
      "weka.core.ProtectedProperties",
      "weka.core.Attribute",
      "weka.core.neighboursearch.NearestNeighbourSearch$MyHeap",
      "weka.core.neighboursearch.NearestNeighbourSearch$MyHeapElement",
      "weka.classifiers.IteratedSingleClassifierEnhancer",
      "weka.classifiers.ParallelIteratedSingleClassifierEnhancer",
      "weka.classifiers.RandomizableParallelIteratedSingleClassifierEnhancer",
      "weka.classifiers.meta.RandomCommittee",
      "weka.classifiers.trees.RandomTree",
      "weka.classifiers.misc.InputMappedClassifier",
      "weka.filters.unsupervised.attribute.PotentialClassIgnorer",
      "weka.filters.unsupervised.attribute.ReplaceMissingValues",
      "weka.core.stemmers.SnowballStemmer",
      "weka.core.neighboursearch.LinearNNSearch",
      "weka.core.neighboursearch.balltrees.BallNode",
      "weka.classifiers.bayes.net.BIFReader",
      "weka.classifiers.lazy.IBk",
      "weka.core.FindWithCapabilities",
      "weka.core.SingleIndex",
      "weka.core.ClassDiscovery",
      "weka.classifiers.bayes.NaiveBayesMultinomial",
      "weka.core.neighboursearch.balltrees.BottomUpConstructor",
      "weka.classifiers.meta.MultiClassClassifier",
      "weka.classifiers.meta.MultiClassClassifierUpdateable",
      "weka.classifiers.functions.Logistic",
      "weka.classifiers.rules.OneR",
      "weka.filters.SimpleFilter",
      "weka.filters.SimpleStreamFilter",
      "weka.filters.MultiFilter",
      "weka.filters.AllFilter",
      "weka.core.WekaEnumeration",
      "weka.core.Attribute$1",
      "weka.classifiers.functions.supportVector.StringKernel",
      "weka.classifiers.trees.m5.M5Base",
      "weka.classifiers.rules.M5Rules",
      "weka.classifiers.functions.LinearRegression",
      "weka.classifiers.rules.PART",
      "weka.classifiers.rules.part.MakeDecList",
      "weka.classifiers.meta.RegressionByDiscretization",
      "weka.filters.unsupervised.attribute.Discretize",
      "weka.classifiers.trees.J48",
      "weka.attributeSelection.GainRatioAttributeEval",
      "weka.classifiers.functions.SimpleLogistic",
      "weka.classifiers.functions.SGD",
      "weka.classifiers.functions.GaussianProcesses",
      "weka.classifiers.functions.supportVector.CachedKernel",
      "weka.classifiers.functions.supportVector.PolyKernel",
      "weka.classifiers.meta.CVParameterSelection",
      "weka.core.FastVector",
      "weka.attributeSelection.CorrelationAttributeEval",
      "weka.classifiers.meta.AdditiveRegression",
      "weka.classifiers.trees.DecisionStump",
      "weka.core.WekaException",
      "weka.core.UnsupportedAttributeTypeException",
      "weka.classifiers.meta.AttributeSelectedClassifier",
      "weka.attributeSelection.CfsSubsetEval",
      "weka.attributeSelection.ASSearch",
      "weka.attributeSelection.BestFirst",
      "weka.classifiers.RandomizableIteratedSingleClassifierEnhancer",
      "weka.classifiers.meta.AdaBoostM1",
      "weka.classifiers.rules.JRip",
      "weka.attributeSelection.WrapperSubsetEval",
      "weka.classifiers.MultipleClassifiersCombiner",
      "weka.classifiers.RandomizableMultipleClassifiersCombiner",
      "weka.classifiers.meta.MultiScheme",
      "weka.attributeSelection.InfoGainAttributeEval",
      "weka.classifiers.trees.REPTree",
      "weka.classifiers.functions.supportVector.Puk",
      "weka.core.UnassignedClassException",
      "weka.core.Queue",
      "weka.core.AttributeLocator",
      "weka.core.StringLocator",
      "weka.core.RelationalLocator",
      "weka.core.ContingencyTables",
      "weka.core.Queue$QueueNode",
      "weka.classifiers.functions.supportVector.NormalizedPolyKernel",
      "weka.classifiers.trees.j48.ClassifierTree",
      "weka.classifiers.trees.j48.C45PruneableClassifierTree",
      "weka.estimators.Estimator",
      "weka.estimators.KernelEstimator",
      "weka.classifiers.meta.Vote",
      "weka.core.ManhattanDistance",
      "weka.classifiers.functions.MultilayerPerceptron",
      "weka.filters.unsupervised.attribute.NominalToBinary",
      "weka.classifiers.functions.neural.SigmoidUnit",
      "weka.classifiers.functions.neural.LinearUnit",
      "weka.classifiers.meta.FilteredClassifier",
      "weka.filters.supervised.attribute.AttributeSelection",
      "weka.attributeSelection.AttributeSelection",
      "weka.attributeSelection.GreedyStepwise",
      "weka.estimators.DiscreteEstimator",
      "weka.core.matrix.Matrix",
      "weka.estimators.MahalanobisEstimator",
      "weka.classifiers.meta.LogitBoost",
      "weka.classifiers.trees.LMT",
      "weka.classifiers.rules.DecisionTable",
      "weka.classifiers.ParallelMultipleClassifiersCombiner",
      "weka.classifiers.RandomizableParallelMultipleClassifiersCombiner",
      "weka.classifiers.meta.Stacking",
      "weka.estimators.PoissonEstimator",
      "weka.attributeSelection.ReliefFAttributeEval",
      "weka.classifiers.trees.M5P",
      "weka.classifiers.trees.RandomForest",
      "weka.estimators.NormalEstimator",
      "weka.classifiers.functions.SMOreg",
      "weka.classifiers.functions.supportVector.RegOptimizer",
      "weka.classifiers.functions.supportVector.RegSMO",
      "weka.classifiers.functions.supportVector.RegSMOImproved",
      "weka.classifiers.functions.VotedPerceptron",
      "weka.classifiers.lazy.KStar",
      "weka.classifiers.functions.SimpleLinearRegression",
      "weka.classifiers.meta.Bagging",
      "weka.attributeSelection.SymmetricalUncertAttributeEval",
      "weka.classifiers.functions.SMO",
      "weka.attributeSelection.OneRAttributeEval",
      "weka.core.neighboursearch.balltrees.MiddleOutConstructor",
      "weka.classifiers.bayes.NaiveBayesMultinomialUpdateable",
      "weka.core.SelectedTag",
      "weka.classifiers.meta.ClassificationViaRegression",
      "weka.classifiers.functions.supportVector.RBFKernel",
      "weka.classifiers.lazy.LWL",
      "weka.core.MinkowskiDistance",
      "weka.core.TechnicalInformationHandlerJavadoc",
      "weka.core.AttributeStats",
      "weka.experiment.Stats",
      "weka.core.ClassCache",
      "weka.core.AllJavadoc",
      "weka.core.neighboursearch.PerformanceStats",
      "weka.core.neighboursearch.kdtrees.KDTreeNode",
      "weka.core.SerializationHelper",
      "weka.core.converters.ConverterUtils$DataSource",
      "weka.core.converters.AbstractLoader",
      "weka.core.converters.AbstractFileLoader",
      "weka.core.converters.ArffLoader",
      "weka.core.Check",
      "weka.core.CheckGOE",
      "weka.core.neighboursearch.TreePerformanceStats",
      "weka.core.neighboursearch.balltrees.BottomUpConstructor$TempNode",
      "weka.core.CheckOptionHandler",
      "weka.classifiers.meta.RandomSubSpace"
    );
  }
}
