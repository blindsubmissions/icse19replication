/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Aug 23 13:09:41 GMT 2018
 */

package weka.classifiers.rules;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class JRip_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "weka.classifiers.rules.JRip"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(JRip_ESTest_scaffolding.class.getClassLoader() ,
      "weka.core.Environment",
      "weka.filters.unsupervised.attribute.NominalToBinary",
      "weka.core.DistanceFunction",
      "org.pentaho.packageManagement.PackageConstraint",
      "weka.attributeSelection.AttributeEvaluator",
      "org.pentaho.packageManagement.Package",
      "weka.core.xml.XMLBasicSerialization",
      "weka.classifiers.rules.RuleStats",
      "weka.attributeSelection.SubsetEvaluator",
      "weka.classifiers.CostMatrix",
      "weka.filters.UnsupervisedFilter",
      "weka.core.logging.Logger$Level",
      "weka.core.neighboursearch.CoverTree$DistanceNode",
      "weka.classifiers.evaluation.output.prediction.AbstractOutput",
      "weka.attributeSelection.CfsSubsetEval",
      "weka.core.DenseInstance",
      "weka.classifiers.trees.J48",
      "weka.classifiers.rules.JRip$NominalAntd",
      "weka.filters.supervised.attribute.ClassOrder",
      "org.pentaho.packageManagement.DefaultPackageManager",
      "org.bounce.net.DefaultAuthenticator",
      "weka.core.neighboursearch.CoverTree$MyHeap",
      "weka.classifiers.trees.j48.C45ModelSelection",
      "weka.core.RelationalLocator",
      "weka.core.Utils",
      "weka.core.CustomDisplayStringProvider",
      "weka.core.tokenizers.Tokenizer",
      "weka.core.NormalizableDistance",
      "weka.classifiers.rules.Rule",
      "weka.core.NoSupportForMissingValuesException",
      "weka.classifiers.UpdateableClassifier",
      "weka.core.TechnicalInformation$Type",
      "weka.core.Copyable",
      "weka.core.Capabilities",
      "weka.core.AttributeLocator",
      "weka.core.BinarySparseInstance",
      "weka.clusterers.UpdateableClusterer",
      "weka.core.Summarizable",
      "weka.attributeSelection.BestFirst",
      "weka.classifiers.trees.j48.ModelSelection",
      "weka.core.AdditionalMeasureProducer",
      "org.pentaho.packageManagement.PackageManager$1",
      "weka.attributeSelection.GreedyStepwise",
      "weka.core.Drawable",
      "weka.core.CapabilitiesHandler",
      "weka.attributeSelection.ASEvaluation",
      "weka.core.AbstractInstance",
      "weka.classifiers.meta.FilteredClassifier",
      "weka.core.SelectedTag",
      "org.pentaho.packageManagement.DefaultPackage",
      "weka.classifiers.trees.j48.C45PruneableClassifierTree",
      "weka.core.Version",
      "weka.attributeSelection.AttributeSelection",
      "weka.core.Tag",
      "weka.classifiers.trees.j48.BinC45ModelSelection",
      "weka.core.neighboursearch.CoverTree",
      "weka.classifiers.AbstractClassifier",
      "weka.filters.unsupervised.attribute.Center",
      "weka.core.OptionHandler",
      "weka.classifiers.rules.JRip",
      "weka.core.WekaException",
      "weka.filters.supervised.attribute.AttributeSelection",
      "weka.filters.StreamableFilter",
      "weka.core.Range",
      "weka.core.PartitionGenerator",
      "weka.classifiers.Classifier",
      "weka.core.neighboursearch.NearestNeighbourSearch$NeighborList",
      "weka.core.Capabilities$Capability",
      "weka.core.SparseInstance",
      "org.pentaho.packageManagement.PackageManager",
      "weka.attributeSelection.AttributeTransformer",
      "weka.classifiers.trees.j48.ClassifierTree",
      "weka.filters.unsupervised.attribute.ReplaceMissingValues",
      "weka.attributeSelection.PrincipalComponents",
      "weka.classifiers.trees.j48.PruneableClassifierTree",
      "weka.classifiers.Evaluation",
      "weka.core.WekaPackageManager",
      "weka.attributeSelection.ASSearch",
      "weka.filters.SupervisedFilter",
      "weka.core.TechnicalInformationHandler",
      "weka.core.neighboursearch.LinearNNSearch",
      "weka.attributeSelection.StartSetHandler",
      "weka.core.tokenizers.CharacterDelimitedTokenizer",
      "weka.core.Option",
      "weka.filters.unsupervised.attribute.PotentialClassIgnorer",
      "weka.core.neighboursearch.PerformanceStats",
      "weka.filters.Sourcable",
      "weka.core.Attribute",
      "weka.core.FastVector",
      "weka.core.UnassignedDatasetException",
      "weka.core.tokenizers.NGramTokenizer",
      "weka.attributeSelection.RankedOutputSearch",
      "weka.classifiers.SingleClassifierEnhancer",
      "weka.core.RevisionUtils",
      "weka.core.Instance",
      "weka.core.ProtectedProperties",
      "weka.core.StringLocator",
      "weka.core.Matchable",
      "weka.core.AttributeStats",
      "weka.core.WeightedInstancesHandler",
      "weka.core.neighboursearch.NearestNeighbourSearch",
      "weka.core.TechnicalInformation$Field",
      "weka.classifiers.rules.JRip$NumericAntd",
      "weka.core.neighboursearch.covertrees.Stack",
      "weka.filters.unsupervised.attribute.Remove",
      "weka.core.EuclideanDistance",
      "weka.core.Instances",
      "weka.core.neighboursearch.CoverTree$CoverTreeNode",
      "weka.core.UnassignedClassException",
      "weka.classifiers.rules.ZeroR",
      "weka.classifiers.rules.JRip$Antd",
      "weka.attributeSelection.UnsupervisedAttributeEvaluator",
      "weka.filters.unsupervised.attribute.Standardize",
      "weka.attributeSelection.Ranker",
      "weka.core.TechnicalInformation",
      "weka.core.UnsupportedAttributeTypeException",
      "weka.classifiers.Sourcable",
      "weka.core.RevisionHandler",
      "weka.classifiers.evaluation.output.prediction.PlainText",
      "weka.core.neighboursearch.TreePerformanceStats",
      "weka.core.xml.XMLSerialization",
      "weka.classifiers.xml.XMLClassifier",
      "weka.filters.Filter",
      "weka.classifiers.lazy.IBk",
      "weka.filters.supervised.attribute.Discretize",
      "weka.classifiers.rules.JRip$RipperRule"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(JRip_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "weka.classifiers.AbstractClassifier",
      "weka.classifiers.rules.JRip",
      "weka.classifiers.rules.Rule",
      "weka.classifiers.rules.JRip$RipperRule",
      "weka.classifiers.rules.JRip$Antd",
      "weka.classifiers.rules.JRip$NumericAntd",
      "weka.classifiers.rules.JRip$NominalAntd",
      "weka.core.TechnicalInformation$Type",
      "weka.core.TechnicalInformation$Field",
      "weka.core.Capabilities$Capability",
      "weka.core.Utils",
      "weka.core.FastVector",
      "weka.core.Instances",
      "weka.core.converters.ArffLoader$ArffReader",
      "weka.core.Attribute",
      "weka.core.ProtectedProperties",
      "weka.core.AbstractInstance",
      "weka.core.SparseInstance",
      "weka.core.BinarySparseInstance",
      "weka.core.neighboursearch.NearestNeighbourSearch",
      "weka.core.neighboursearch.CoverTree",
      "weka.core.NormalizableDistance",
      "weka.core.EuclideanDistance",
      "weka.core.Range",
      "weka.filters.Filter",
      "weka.filters.supervised.attribute.ClassOrder",
      "weka.core.DenseInstance",
      "weka.core.UnassignedDatasetException",
      "weka.classifiers.bayes.NaiveBayesMultinomialText",
      "weka.core.tokenizers.Tokenizer",
      "weka.core.tokenizers.CharacterDelimitedTokenizer",
      "weka.core.tokenizers.WordTokenizer",
      "weka.core.stemmers.NullStemmer",
      "weka.core.RevisionUtils",
      "weka.core.SerializedObject",
      "weka.classifiers.Evaluation",
      "weka.core.Option",
      "weka.core.WekaEnumeration",
      "weka.core.Attribute$1",
      "weka.classifiers.rules.RuleStats",
      "weka.core.UnassignedClassException",
      "weka.core.Version",
      "weka.core.Environment",
      "weka.core.Tag",
      "weka.classifiers.rules.DecisionTable",
      "weka.attributeSelection.ASSearch",
      "weka.attributeSelection.BestFirst",
      "weka.core.TechnicalInformation",
      "weka.attributeSelection.ASEvaluation",
      "weka.attributeSelection.UnsupervisedAttributeEvaluator",
      "weka.attributeSelection.PrincipalComponents",
      "weka.classifiers.SingleClassifierEnhancer",
      "weka.classifiers.misc.InputMappedClassifier",
      "weka.classifiers.rules.ZeroR",
      "weka.filters.SimpleFilter",
      "weka.filters.SimpleStreamFilter",
      "weka.filters.MultiFilter",
      "weka.filters.AllFilter",
      "weka.classifiers.lazy.IBk",
      "weka.core.neighboursearch.LinearNNSearch",
      "weka.classifiers.CostMatrix",
      "weka.core.neighboursearch.balltrees.BallNode",
      "weka.classifiers.functions.MultilayerPerceptron",
      "weka.filters.unsupervised.attribute.NominalToBinary",
      "weka.classifiers.functions.neural.SigmoidUnit",
      "weka.classifiers.functions.neural.LinearUnit",
      "weka.classifiers.MultipleClassifiersCombiner",
      "weka.classifiers.ParallelMultipleClassifiersCombiner",
      "weka.classifiers.RandomizableParallelMultipleClassifiersCombiner",
      "weka.classifiers.meta.Stacking",
      "weka.core.neighboursearch.KDTree",
      "weka.core.neighboursearch.kdtrees.KDTreeNodeSplitter",
      "weka.core.neighboursearch.kdtrees.SlidingMidPointOfWidestSide",
      "weka.core.Capabilities",
      "org.pentaho.packageManagement.PackageManager",
      "org.pentaho.packageManagement.DefaultPackageManager",
      "weka.core.WekaPackageManager",
      "weka.classifiers.functions.SMO",
      "weka.classifiers.functions.supportVector.Kernel",
      "weka.classifiers.functions.supportVector.CachedKernel",
      "weka.classifiers.functions.supportVector.PolyKernel",
      "weka.core.SelectedTag",
      "weka.classifiers.bayes.BayesNet",
      "weka.classifiers.bayes.net.search.SearchAlgorithm",
      "weka.classifiers.bayes.net.search.local.LocalScoreSearchAlgorithm",
      "weka.classifiers.bayes.net.search.local.K2",
      "weka.classifiers.bayes.net.estimate.BayesNetEstimator",
      "weka.classifiers.bayes.net.estimate.SimpleEstimator",
      "weka.classifiers.RandomizableSingleClassifierEnhancer",
      "weka.classifiers.meta.CostSensitiveClassifier",
      "weka.filters.unsupervised.attribute.Remove",
      "weka.core.neighboursearch.BallTree",
      "weka.core.neighboursearch.balltrees.BallTreeConstructor",
      "weka.core.neighboursearch.balltrees.TopDownConstructor",
      "weka.core.neighboursearch.balltrees.BallSplitter",
      "weka.core.neighboursearch.balltrees.PointsClosestToFurthestChildren",
      "weka.core.neighboursearch.balltrees.MiddleOutConstructor",
      "weka.core.WekaException",
      "weka.core.neighboursearch.NearestNeighbourSearch$MyHeap",
      "weka.core.neighboursearch.NearestNeighbourSearch$MyHeapElement",
      "weka.core.tokenizers.AlphabeticTokenizer",
      "weka.classifiers.IteratedSingleClassifierEnhancer",
      "weka.classifiers.ParallelIteratedSingleClassifierEnhancer",
      "weka.classifiers.RandomizableParallelIteratedSingleClassifierEnhancer",
      "weka.classifiers.meta.Bagging",
      "weka.classifiers.trees.REPTree",
      "weka.classifiers.meta.FilteredClassifier",
      "weka.filters.supervised.attribute.AttributeSelection",
      "weka.attributeSelection.AttributeSelection",
      "weka.attributeSelection.CfsSubsetEval",
      "weka.attributeSelection.GreedyStepwise",
      "weka.classifiers.trees.J48",
      "weka.filters.supervised.attribute.Discretize",
      "weka.classifiers.rules.DecisionTableHashKey",
      "weka.classifiers.bayes.NaiveBayesMultinomial",
      "weka.classifiers.functions.LinearRegression",
      "weka.classifiers.rules.OneR",
      "weka.classifiers.functions.neural.NeuralConnection",
      "weka.classifiers.functions.MultilayerPerceptron$NeuralEnd",
      "weka.attributeSelection.WrapperSubsetEval",
      "weka.classifiers.trees.LMT",
      "weka.classifiers.lazy.LWL",
      "weka.classifiers.trees.DecisionStump",
      "weka.classifiers.functions.SimpleLogistic",
      "weka.core.converters.ConverterUtils$DataSource",
      "weka.core.converters.AbstractLoader",
      "weka.core.converters.AbstractFileLoader",
      "weka.core.converters.ArffLoader",
      "weka.attributeSelection.CorrelationAttributeEval",
      "weka.classifiers.trees.m5.M5Base",
      "weka.classifiers.rules.M5Rules",
      "weka.core.neighboursearch.balltrees.BottomUpConstructor",
      "weka.classifiers.RandomizableClassifier",
      "weka.classifiers.functions.SGD",
      "weka.classifiers.meta.ClassificationViaRegression",
      "weka.classifiers.trees.M5P",
      "weka.classifiers.meta.CVParameterSelection",
      "weka.core.tokenizers.NGramTokenizer",
      "weka.classifiers.RandomizableMultipleClassifiersCombiner",
      "weka.classifiers.meta.MultiScheme",
      "weka.core.AttributeStats",
      "weka.classifiers.bayes.NaiveBayes",
      "weka.classifiers.bayes.NaiveBayesUpdateable",
      "weka.core.ChebyshevDistance",
      "weka.classifiers.meta.AdditiveRegression",
      "weka.classifiers.functions.supportVector.PrecomputedKernelMatrixKernel",
      "weka.classifiers.misc.SerializedClassifier",
      "weka.classifiers.functions.SimpleLinearRegression",
      "weka.core.neighboursearch.PerformanceStats",
      "weka.core.neighboursearch.TreePerformanceStats",
      "weka.core.UnsupportedAttributeTypeException",
      "weka.core.neighboursearch.kdtrees.MedianOfWidestDimension",
      "weka.classifiers.meta.RegressionByDiscretization",
      "weka.filters.unsupervised.attribute.PotentialClassIgnorer",
      "weka.filters.unsupervised.attribute.Discretize",
      "weka.classifiers.meta.RandomCommittee",
      "weka.classifiers.trees.RandomTree",
      "weka.classifiers.functions.SGDText",
      "weka.attributeSelection.ReliefFAttributeEval",
      "weka.classifiers.meta.MultiClassClassifier",
      "weka.classifiers.functions.Logistic"
    );
  }
}
