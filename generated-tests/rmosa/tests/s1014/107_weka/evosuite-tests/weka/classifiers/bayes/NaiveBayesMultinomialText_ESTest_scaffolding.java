/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Aug 23 11:40:39 GMT 2018
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
      "org.pentaho.packageManagement.PackageConstraint",
      "weka.attributeSelection.AttributeEvaluator",
      "org.pentaho.packageManagement.Package",
      "weka.core.xml.XMLBasicSerialization",
      "weka.attributeSelection.SubsetEvaluator",
      "weka.classifiers.CostMatrix",
      "weka.filters.UnsupervisedFilter",
      "weka.core.logging.Logger$Level",
      "weka.core.neighboursearch.kdtrees.KDTreeNodeSplitter",
      "weka.classifiers.evaluation.output.prediction.AbstractOutput",
      "weka.attributeSelection.CfsSubsetEval",
      "weka.core.DenseInstance",
      "weka.core.stemmers.Stemmer",
      "weka.classifiers.functions.supportVector.PrecomputedKernelMatrixKernel",
      "weka.classifiers.RandomizableSingleClassifierEnhancer",
      "org.pentaho.packageManagement.DefaultPackageManager",
      "org.bounce.net.DefaultAuthenticator",
      "weka.core.neighboursearch.KDTree",
      "weka.core.stemmers.NullStemmer",
      "weka.classifiers.functions.SGDText",
      "weka.core.Utils",
      "weka.core.CustomDisplayStringProvider",
      "weka.core.tokenizers.Tokenizer",
      "weka.core.NormalizableDistance",
      "weka.core.NoSupportForMissingValuesException",
      "weka.classifiers.UpdateableClassifier",
      "weka.classifiers.bayes.NaiveBayesMultinomialText",
      "weka.core.MultiInstanceCapabilitiesHandler",
      "weka.core.Copyable",
      "weka.core.Capabilities",
      "weka.core.BinarySparseInstance",
      "weka.classifiers.bayes.NaiveBayesMultinomialText$Count",
      "weka.core.SerializedObject",
      "weka.core.Summarizable",
      "weka.core.AdditionalMeasureProducer",
      "org.pentaho.packageManagement.PackageManager$1",
      "weka.attributeSelection.GreedyStepwise",
      "weka.core.Drawable",
      "weka.core.matrix.Matrix",
      "weka.core.CapabilitiesHandler",
      "weka.core.neighboursearch.NearestNeighbourSearch$MyHeap",
      "weka.attributeSelection.ASEvaluation",
      "weka.core.AbstractInstance",
      "weka.core.scripting.JythonObject",
      "weka.core.SelectedTag",
      "org.pentaho.packageManagement.DefaultPackage",
      "weka.core.Version",
      "weka.attributeSelection.AttributeSelection",
      "weka.core.Tag",
      "weka.classifiers.AbstractClassifier",
      "weka.filters.unsupervised.attribute.Center",
      "weka.core.OptionHandler",
      "weka.core.WekaException",
      "weka.core.neighboursearch.kdtrees.SlidingMidPointOfWidestSide",
      "weka.filters.StreamableFilter",
      "weka.core.Range",
      "weka.core.scripting.JythonSerializableObject",
      "weka.classifiers.Classifier",
      "weka.core.Capabilities$Capability",
      "weka.core.SparseInstance",
      "org.pentaho.packageManagement.PackageManager",
      "weka.attributeSelection.AttributeTransformer",
      "weka.core.tokenizers.WordTokenizer",
      "weka.filters.unsupervised.attribute.ReplaceMissingValues",
      "weka.attributeSelection.PrincipalComponents",
      "weka.core.stemmers.SnowballStemmer",
      "weka.core.neighboursearch.kdtrees.KDTreeNode",
      "weka.classifiers.Evaluation",
      "weka.classifiers.functions.supportVector.Kernel",
      "weka.core.WekaPackageManager",
      "weka.attributeSelection.ASSearch",
      "weka.core.TechnicalInformationHandler",
      "weka.core.neighboursearch.LinearNNSearch",
      "weka.attributeSelection.StartSetHandler",
      "weka.core.tokenizers.CharacterDelimitedTokenizer",
      "weka.core.Option",
      "weka.classifiers.meta.CostSensitiveClassifier",
      "weka.core.neighboursearch.PerformanceStats",
      "weka.filters.unsupervised.attribute.PotentialClassIgnorer",
      "weka.filters.Sourcable",
      "weka.core.Attribute",
      "weka.core.Stopwords",
      "weka.core.FastVector",
      "weka.core.UnassignedDatasetException",
      "weka.classifiers.RandomizableClassifier",
      "weka.attributeSelection.RankedOutputSearch",
      "weka.classifiers.SingleClassifierEnhancer",
      "weka.core.RevisionUtils",
      "weka.core.Instance",
      "weka.core.ProtectedProperties",
      "weka.core.AttributeStats",
      "weka.core.WeightedInstancesHandler",
      "weka.core.neighboursearch.NearestNeighbourSearch",
      "weka.filters.unsupervised.attribute.Remove",
      "weka.core.Randomizable",
      "weka.core.EuclideanDistance",
      "weka.core.Instances",
      "weka.core.UnassignedClassException",
      "weka.classifiers.rules.ZeroR",
      "weka.attributeSelection.UnsupervisedAttributeEvaluator",
      "weka.filters.unsupervised.attribute.Standardize",
      "weka.core.TechnicalInformation",
      "weka.core.UnsupportedAttributeTypeException",
      "weka.classifiers.Sourcable",
      "weka.core.RevisionHandler",
      "weka.classifiers.evaluation.output.prediction.PlainText",
      "weka.core.neighboursearch.TreePerformanceStats",
      "weka.core.xml.XMLSerialization",
      "weka.classifiers.xml.XMLClassifier",
      "weka.classifiers.lazy.IBk",
      "weka.filters.Filter"
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
      "weka.core.Utils",
      "weka.classifiers.Evaluation",
      "weka.core.Option",
      "weka.core.RevisionUtils",
      "weka.filters.Filter",
      "weka.filters.supervised.attribute.Discretize",
      "weka.core.Range",
      "weka.core.Capabilities",
      "org.pentaho.packageManagement.PackageManager",
      "org.pentaho.packageManagement.DefaultPackageManager",
      "weka.core.Version",
      "weka.core.Environment",
      "weka.core.WekaPackageManager",
      "weka.core.tokenizers.NGramTokenizer",
      "weka.core.SerializedObject",
      "weka.classifiers.RandomizableClassifier",
      "weka.core.Tag",
      "weka.classifiers.functions.SGDText",
      "weka.core.neighboursearch.NearestNeighbourSearch",
      "weka.core.neighboursearch.KDTree",
      "weka.core.NormalizableDistance",
      "weka.core.EuclideanDistance",
      "weka.core.neighboursearch.kdtrees.KDTreeNodeSplitter",
      "weka.core.neighboursearch.kdtrees.SlidingMidPointOfWidestSide",
      "weka.classifiers.SingleClassifierEnhancer",
      "weka.classifiers.misc.InputMappedClassifier",
      "weka.classifiers.rules.ZeroR",
      "weka.core.AbstractInstance",
      "weka.core.SparseInstance",
      "weka.core.BinarySparseInstance",
      "weka.core.Instances",
      "weka.core.converters.ArffLoader$ArffReader",
      "weka.core.UnassignedDatasetException",
      "weka.core.neighboursearch.CoverTree",
      "weka.core.neighboursearch.balltrees.BallNode",
      "weka.classifiers.misc.SerializedClassifier",
      "weka.core.Stopwords",
      "weka.attributeSelection.ASEvaluation",
      "weka.attributeSelection.UnsupervisedAttributeEvaluator",
      "weka.attributeSelection.PrincipalComponents",
      "weka.attributeSelection.AttributeSelection",
      "weka.core.TestInstances",
      "weka.core.DenseInstance",
      "weka.classifiers.RandomizableSingleClassifierEnhancer",
      "weka.classifiers.meta.CostSensitiveClassifier",
      "weka.classifiers.CostMatrix",
      "weka.classifiers.bayes.NaiveBayes",
      "weka.core.neighboursearch.BallTree",
      "weka.core.neighboursearch.balltrees.BallTreeConstructor",
      "weka.core.neighboursearch.balltrees.TopDownConstructor",
      "weka.core.neighboursearch.balltrees.BallSplitter",
      "weka.core.neighboursearch.balltrees.PointsClosestToFurthestChildren",
      "weka.core.neighboursearch.NearestNeighbourSearch$MyHeap",
      "weka.core.neighboursearch.NearestNeighbourSearch$MyHeapElement",
      "weka.core.Attribute",
      "weka.core.ProtectedProperties",
      "weka.core.stemmers.LovinsStemmer",
      "weka.core.stemmers.Stemming",
      "weka.classifiers.lazy.IBk",
      "weka.core.neighboursearch.LinearNNSearch",
      "weka.core.SelectedTag",
      "weka.classifiers.bayes.BayesNet",
      "weka.classifiers.bayes.net.search.SearchAlgorithm",
      "weka.classifiers.bayes.net.search.local.LocalScoreSearchAlgorithm",
      "weka.classifiers.bayes.net.search.local.K2",
      "weka.classifiers.bayes.net.estimate.BayesNetEstimator",
      "weka.classifiers.bayes.net.estimate.SimpleEstimator",
      "weka.core.stemmers.SnowballStemmer",
      "weka.core.tokenizers.AlphabeticTokenizer",
      "weka.classifiers.functions.SGD",
      "weka.core.stemmers.IteratedLovinsStemmer",
      "weka.core.ChebyshevDistance",
      "weka.core.TechnicalInformation",
      "weka.core.TechnicalInformation$Type",
      "weka.core.TechnicalInformation$Field",
      "weka.classifiers.bayes.net.BIFReader",
      "weka.filters.AllFilter",
      "weka.core.WekaException",
      "weka.core.UnsupportedAttributeTypeException",
      "weka.classifiers.trees.DecisionStump",
      "weka.classifiers.functions.supportVector.Kernel",
      "weka.classifiers.functions.supportVector.PrecomputedKernelMatrixKernel",
      "weka.classifiers.meta.MultiClassClassifier",
      "weka.classifiers.meta.MultiClassClassifierUpdateable",
      "weka.classifiers.functions.Logistic",
      "weka.core.UnassignedClassException",
      "weka.classifiers.lazy.KStar",
      "weka.classifiers.IteratedSingleClassifierEnhancer",
      "weka.classifiers.RandomizableIteratedSingleClassifierEnhancer",
      "weka.classifiers.meta.AdaBoostM1",
      "weka.classifiers.trees.J48",
      "weka.classifiers.trees.j48.ClassifierTree",
      "weka.classifiers.trees.j48.C45PruneableClassifierTree",
      "weka.classifiers.rules.DecisionTable",
      "weka.attributeSelection.ASSearch",
      "weka.attributeSelection.BestFirst",
      "weka.core.neighboursearch.balltrees.BottomUpConstructor",
      "weka.classifiers.trees.REPTree",
      "weka.classifiers.functions.supportVector.CachedKernel",
      "weka.classifiers.functions.supportVector.RBFKernel",
      "weka.classifiers.functions.VotedPerceptron",
      "weka.classifiers.MultipleClassifiersCombiner",
      "weka.classifiers.RandomizableMultipleClassifiersCombiner",
      "weka.classifiers.meta.Vote",
      "weka.attributeSelection.OneRAttributeEval",
      "weka.classifiers.meta.FilteredClassifier",
      "weka.filters.supervised.attribute.AttributeSelection",
      "weka.attributeSelection.CfsSubsetEval",
      "weka.attributeSelection.GreedyStepwise",
      "weka.filters.unsupervised.attribute.PotentialClassIgnorer",
      "weka.filters.unsupervised.attribute.ReplaceMissingValues",
      "weka.estimators.Estimator",
      "weka.estimators.KernelEstimator",
      "weka.core.WekaEnumeration",
      "weka.core.Attribute$1",
      "weka.classifiers.functions.supportVector.Puk",
      "weka.classifiers.meta.AdditiveRegression",
      "weka.filters.SimpleFilter",
      "weka.filters.SimpleStreamFilter",
      "weka.filters.MultiFilter",
      "weka.classifiers.meta.LogitBoost",
      "weka.classifiers.rules.OneR",
      "weka.core.matrix.Matrix",
      "weka.classifiers.lazy.LWL",
      "weka.attributeSelection.ReliefFAttributeEval",
      "weka.attributeSelection.InfoGainAttributeEval",
      "weka.classifiers.meta.MultiScheme",
      "weka.classifiers.functions.SimpleLinearRegression",
      "weka.classifiers.ParallelMultipleClassifiersCombiner",
      "weka.classifiers.RandomizableParallelMultipleClassifiersCombiner",
      "weka.classifiers.meta.Stacking",
      "weka.classifiers.trees.RandomTree",
      "weka.classifiers.meta.RegressionByDiscretization",
      "weka.filters.unsupervised.attribute.Discretize",
      "weka.classifiers.ParallelIteratedSingleClassifierEnhancer",
      "weka.classifiers.RandomizableParallelIteratedSingleClassifierEnhancer",
      "weka.classifiers.meta.Bagging",
      "weka.classifiers.meta.AttributeSelectedClassifier",
      "weka.core.AttributeStats",
      "weka.classifiers.functions.supportVector.StringKernel",
      "weka.estimators.PoissonEstimator",
      "weka.attributeSelection.SymmetricalUncertAttributeEval",
      "weka.core.FindWithCapabilities",
      "weka.core.SingleIndex",
      "weka.classifiers.bayes.NaiveBayesMultinomial",
      "weka.classifiers.meta.RandomCommittee",
      "weka.classifiers.functions.LinearRegression",
      "weka.classifiers.bayes.NaiveBayesUpdateable",
      "weka.classifiers.meta.ClassificationViaRegression",
      "weka.classifiers.trees.m5.M5Base",
      "weka.classifiers.trees.M5P",
      "weka.attributeSelection.CorrelationAttributeEval",
      "weka.classifiers.meta.CVParameterSelection",
      "weka.core.FastVector",
      "weka.classifiers.trees.RandomForest",
      "weka.core.Check",
      "weka.core.CheckGOE",
      "weka.estimators.DiscreteEstimator",
      "weka.classifiers.meta.RandomSubSpace",
      "weka.classifiers.rules.PART",
      "weka.classifiers.rules.part.MakeDecList",
      "weka.experiment.Stats",
      "weka.attributeSelection.GainRatioAttributeEval",
      "weka.attributeSelection.WrapperSubsetEval",
      "weka.classifiers.trees.LMT",
      "weka.classifiers.functions.SimpleLogistic",
      "weka.classifiers.rules.JRip",
      "weka.classifiers.functions.supportVector.PolyKernel",
      "weka.classifiers.functions.supportVector.NormalizedPolyKernel",
      "weka.core.neighboursearch.balltrees.MiddleOutConstructor",
      "weka.classifiers.bayes.NaiveBayesMultinomialUpdateable",
      "weka.core.ClassDiscovery",
      "weka.classifiers.rules.M5Rules",
      "weka.core.CheckOptionHandler",
      "weka.estimators.NormalEstimator",
      "weka.classifiers.functions.MultilayerPerceptron",
      "weka.filters.unsupervised.attribute.NominalToBinary",
      "weka.classifiers.functions.neural.SigmoidUnit",
      "weka.classifiers.functions.neural.LinearUnit",
      "weka.estimators.MahalanobisEstimator",
      "weka.classifiers.functions.SMO",
      "weka.classifiers.functions.GaussianProcesses",
      "weka.core.ListOptions",
      "weka.core.Javadoc",
      "weka.core.OptionHandlerJavadoc",
      "weka.classifiers.functions.SMOreg",
      "weka.classifiers.functions.supportVector.RegOptimizer",
      "weka.classifiers.functions.supportVector.RegSMO",
      "weka.classifiers.functions.supportVector.RegSMOImproved",
      "weka.classifiers.rules.OneR$OneRRule",
      "weka.core.MinkowskiDistance",
      "weka.core.neighboursearch.PerformanceStats",
      "weka.core.neighboursearch.TreePerformanceStats",
      "weka.core.ManhattanDistance",
      "weka.core.GlobalInfoJavadoc",
      "weka.core.Queue",
      "weka.core.AttributeLocator",
      "weka.core.StringLocator",
      "weka.core.RelationalLocator",
      "weka.core.ContingencyTables",
      "weka.core.Queue$QueueNode",
      "weka.core.SerializationHelper",
      "weka.core.TechnicalInformationHandlerJavadoc"
    );
  }
}
