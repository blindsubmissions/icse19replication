/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Aug 23 09:50:34 GMT 2018
 */

package weka.classifiers;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class Evaluation_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "weka.classifiers.Evaluation"; 
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
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Evaluation_ESTest_scaffolding.class.getClassLoader() ,
      "weka.core.Environment",
      "weka.clusterers.AbstractClusterer",
      "weka.filters.unsupervised.attribute.NominalToBinary",
      "weka.classifiers.functions.MultilayerPerceptron$ControlPanel",
      "weka.core.converters.TextDirectoryLoader",
      "org.pentaho.packageManagement.PackageConstraint",
      "weka.core.xml.XMLBasicSerialization",
      "weka.filters.UnsupervisedFilter",
      "weka.classifiers.evaluation.output.prediction.AbstractOutput",
      "weka.core.DenseInstance",
      "weka.core.converters.DatabaseConverter",
      "weka.classifiers.trees.J48",
      "weka.classifiers.functions.SimpleLinearRegression",
      "weka.classifiers.evaluation.output.prediction.CSV",
      "org.pentaho.packageManagement.DefaultPackageManager",
      "weka.estimators.UnivariateIntervalEstimator",
      "org.bounce.net.DefaultAuthenticator",
      "weka.filters.SimpleStreamFilter",
      "weka.core.converters.JSONLoader",
      "weka.core.neighboursearch.KDTree",
      "weka.core.stemmers.NullStemmer",
      "weka.classifiers.functions.SGDText",
      "weka.core.CustomDisplayStringProvider",
      "weka.core.NormalizableDistance",
      "weka.classifiers.functions.SMOreg",
      "weka.core.TechnicalInformation$Type",
      "weka.core.Copyable",
      "weka.core.BinarySparseInstance",
      "weka.classifiers.RandomizableMultipleClassifiersCombiner",
      "weka.core.SerializedObject",
      "weka.clusterers.UpdateableClusterer",
      "weka.core.AdditionalMeasureProducer",
      "weka.core.neighboursearch.balltrees.BallNode",
      "weka.classifiers.functions.supportVector.RegOptimizer",
      "weka.classifiers.misc.InputMappedClassifier",
      "weka.experiment.ResultProducer",
      "weka.classifiers.functions.neural.NeuralConnection",
      "weka.core.Version",
      "weka.classifiers.AbstractClassifier",
      "weka.core.converters.ArffLoader",
      "weka.filters.unsupervised.attribute.Center",
      "weka.classifiers.meta.Stacking",
      "weka.core.WekaException",
      "weka.classifiers.functions.neural.NeuralNode",
      "weka.classifiers.trees.RandomForest",
      "weka.filters.StreamableFilter",
      "weka.core.Attribute$1",
      "weka.core.PartitionGenerator",
      "weka.classifiers.functions.MultilayerPerceptron$NeuralEnd",
      "weka.core.SparseInstance",
      "weka.classifiers.trees.j48.ClassifierSplitModel",
      "weka.attributeSelection.AttributeTransformer",
      "weka.core.tokenizers.WordTokenizer",
      "weka.classifiers.trees.j48.ClassifierTree",
      "weka.classifiers.functions.MultilayerPerceptron",
      "weka.filters.unsupervised.attribute.ReplaceMissingValues",
      "weka.attributeSelection.PrincipalComponents",
      "weka.core.neighboursearch.kdtrees.KDTreeNode",
      "weka.classifiers.trees.j48.PruneableClassifierTree",
      "weka.classifiers.Evaluation",
      "weka.classifiers.functions.supportVector.Kernel",
      "weka.classifiers.functions.neural.LinearUnit",
      "weka.classifiers.functions.SMO",
      "weka.classifiers.evaluation.ThresholdCurve",
      "weka.core.converters.URLSourcedLoader",
      "weka.core.converters.FileSourcedConverter",
      "weka.core.neighboursearch.LinearNNSearch",
      "weka.clusterers.Clusterer",
      "weka.core.neighboursearch.PerformanceStats",
      "weka.estimators.UnivariateKernelEstimator",
      "weka.core.UnassignedDatasetException",
      "weka.classifiers.RandomizableClassifier",
      "weka.core.RevisionUtils",
      "weka.classifiers.meta.RandomCommittee",
      "weka.core.converters.Loader",
      "weka.classifiers.functions.supportVector.RegSMO",
      "weka.core.ProtectedProperties",
      "weka.core.StringLocator",
      "weka.core.AttributeStats",
      "weka.filters.MultiFilter",
      "weka.classifiers.trees.DecisionStump",
      "weka.estimators.UnivariateQuantileEstimator",
      "weka.filters.unsupervised.attribute.Remove",
      "weka.core.Randomizable",
      "weka.classifiers.trees.j48.NoSplit",
      "weka.core.EuclideanDistance",
      "weka.core.Instances",
      "weka.core.converters.AbstractFileLoader",
      "weka.classifiers.bayes.NaiveBayesMultinomial",
      "weka.core.converters.DatabaseConnection",
      "weka.core.TechnicalInformation",
      "weka.core.UnsupportedAttributeTypeException",
      "weka.core.RevisionHandler",
      "weka.experiment.Stats",
      "weka.core.converters.ConverterUtils$DataSource",
      "weka.classifiers.xml.XMLClassifier",
      "weka.filters.Filter",
      "weka.filters.supervised.attribute.Discretize",
      "weka.core.TestInstances",
      "weka.core.DistanceFunction",
      "weka.attributeSelection.AttributeEvaluator",
      "org.pentaho.packageManagement.Package",
      "weka.classifiers.CostMatrix",
      "weka.core.logging.Logger$Level",
      "weka.core.neighboursearch.kdtrees.KDTreeNodeSplitter",
      "weka.core.stemmers.Stemmer",
      "weka.classifiers.evaluation.output.prediction.Null",
      "weka.core.converters.IncrementalConverter",
      "weka.classifiers.RandomizableSingleClassifierEnhancer",
      "weka.clusterers.FarthestFirst",
      "weka.filters.SimpleFilter",
      "weka.core.EnvironmentHandler",
      "weka.classifiers.trees.j48.C45ModelSelection",
      "weka.core.RelationalLocator",
      "weka.core.Utils",
      "weka.core.tokenizers.Tokenizer",
      "weka.core.NoSupportForMissingValuesException",
      "weka.classifiers.UpdateableClassifier",
      "weka.classifiers.ParallelMultipleClassifiersCombiner",
      "weka.core.MultiInstanceCapabilitiesHandler",
      "weka.core.Capabilities",
      "weka.core.AttributeLocator",
      "weka.core.converters.SVMLightLoader",
      "weka.classifiers.functions.supportVector.CachedKernel",
      "weka.classifiers.meta.RegressionByDiscretization",
      "weka.core.Summarizable",
      "weka.classifiers.trees.j48.ModelSelection",
      "org.pentaho.packageManagement.PackageManager$1",
      "weka.core.Drawable",
      "weka.core.ListOptions",
      "weka.core.matrix.Matrix",
      "weka.classifiers.ConditionalDensityEstimator",
      "weka.core.CapabilitiesHandler",
      "weka.classifiers.trees.REPTree",
      "weka.core.neighboursearch.NearestNeighbourSearch$MyHeap",
      "weka.attributeSelection.ASEvaluation",
      "weka.core.AbstractInstance",
      "weka.core.scripting.JythonObject",
      "weka.core.SelectedTag",
      "org.pentaho.packageManagement.DefaultPackage",
      "weka.classifiers.trees.j48.C45PruneableClassifierTree",
      "weka.classifiers.ParallelIteratedSingleClassifierEnhancer",
      "weka.core.Queue",
      "weka.clusterers.RandomizableClusterer",
      "weka.core.converters.AbstractLoader",
      "weka.filters.AllFilter",
      "weka.core.converters.BatchConverter",
      "weka.core.Tag",
      "weka.classifiers.IteratedSingleClassifierEnhancer",
      "weka.classifiers.trees.j48.BinC45ModelSelection",
      "weka.estimators.UnivariateDensityEstimator",
      "weka.core.OptionHandler",
      "weka.core.neighboursearch.kdtrees.SlidingMidPointOfWidestSide",
      "weka.core.Range",
      "weka.core.scripting.JythonSerializableObject",
      "weka.classifiers.Classifier",
      "weka.attributeSelection.InfoGainAttributeEval",
      "weka.core.Capabilities$Capability",
      "org.pentaho.packageManagement.PackageManager",
      "weka.core.WekaEnumeration",
      "weka.core.WekaPackageManager",
      "weka.estimators.UnivariateEqualFrequencyHistogramEstimator",
      "weka.filters.SupervisedFilter",
      "weka.core.TechnicalInformationHandler",
      "weka.experiment.DatabaseUtils",
      "weka.classifiers.meta.CostSensitiveClassifier",
      "weka.core.tokenizers.CharacterDelimitedTokenizer",
      "weka.core.Option",
      "weka.filters.unsupervised.attribute.PotentialClassIgnorer",
      "weka.classifiers.functions.neural.NeuralMethod",
      "weka.filters.unsupervised.attribute.NumericToBinary",
      "weka.filters.Sourcable",
      "weka.core.Attribute",
      "weka.classifiers.functions.MultilayerPerceptron$NodePanel",
      "weka.classifiers.meta.MultiScheme",
      "weka.core.FastVector",
      "weka.classifiers.MultipleClassifiersCombiner",
      "weka.core.BatchPredictor",
      "weka.classifiers.functions.supportVector.RegSMOImproved",
      "weka.classifiers.functions.neural.SigmoidUnit",
      "weka.classifiers.trees.RandomTree",
      "weka.classifiers.SingleClassifierEnhancer",
      "weka.core.Instance",
      "weka.classifiers.functions.supportVector.PolyKernel",
      "weka.classifiers.IntervalEstimator",
      "weka.core.Matchable",
      "weka.core.WeightedInstancesHandler",
      "weka.core.neighboursearch.NearestNeighbourSearch",
      "weka.classifiers.functions.GaussianProcesses",
      "weka.core.TechnicalInformation$Field",
      "weka.filters.unsupervised.attribute.Discretize",
      "weka.core.converters.DatabaseLoader",
      "weka.classifiers.RandomizableParallelMultipleClassifiersCombiner",
      "weka.filters.unsupervised.attribute.Normalize",
      "weka.core.UnassignedClassException",
      "weka.classifiers.rules.ZeroR",
      "weka.filters.unsupervised.attribute.Standardize",
      "weka.attributeSelection.UnsupervisedAttributeEvaluator",
      "weka.classifiers.Sourcable",
      "weka.classifiers.evaluation.output.prediction.PlainText",
      "weka.core.xml.XMLSerialization",
      "weka.core.neighboursearch.TreePerformanceStats",
      "weka.classifiers.lazy.IBk",
      "weka.classifiers.RandomizableParallelIteratedSingleClassifierEnhancer"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.util.Comparator", false, Evaluation_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("java.util.function.Consumer", false, Evaluation_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Evaluation_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "weka.classifiers.Evaluation",
      "weka.core.pmml.PMMLFactory$ModelType",
      "weka.core.pmml.PMMLFactory$1",
      "weka.core.xml.KOML",
      "weka.core.Version",
      "weka.core.Utils",
      "weka.core.converters.ConverterUtils$DataSource",
      "weka.core.converters.AbstractLoader",
      "weka.core.converters.AbstractFileLoader",
      "weka.core.converters.ArffLoader",
      "org.pentaho.packageManagement.PackageManager",
      "org.pentaho.packageManagement.DefaultPackageManager",
      "weka.core.Environment",
      "weka.core.WekaPackageManager",
      "weka.gui.GenericPropertiesCreator",
      "weka.core.ClassDiscovery",
      "weka.core.ClassCache",
      "weka.gui.GenericObjectEditor",
      "weka.core.converters.ConverterUtils",
      "weka.core.Instances",
      "weka.core.TestInstances",
      "weka.core.Attribute",
      "weka.core.ProtectedProperties",
      "weka.core.AbstractInstance",
      "weka.core.DenseInstance",
      "weka.classifiers.CostMatrix",
      "weka.classifiers.AbstractClassifier",
      "weka.classifiers.SingleClassifierEnhancer",
      "weka.classifiers.RandomizableSingleClassifierEnhancer",
      "weka.core.Tag",
      "weka.classifiers.meta.CostSensitiveClassifier",
      "weka.classifiers.rules.ZeroR",
      "weka.core.UnassignedClassException",
      "weka.classifiers.bayes.BayesNet",
      "weka.classifiers.bayes.net.search.SearchAlgorithm",
      "weka.classifiers.bayes.net.search.local.LocalScoreSearchAlgorithm",
      "weka.classifiers.bayes.net.search.local.K2",
      "weka.classifiers.bayes.net.estimate.BayesNetEstimator",
      "weka.classifiers.bayes.net.estimate.SimpleEstimator",
      "weka.classifiers.lazy.IBk",
      "weka.core.neighboursearch.NearestNeighbourSearch",
      "weka.core.neighboursearch.LinearNNSearch",
      "weka.core.NormalizableDistance",
      "weka.core.EuclideanDistance",
      "weka.core.Range",
      "weka.core.SparseInstance",
      "weka.core.BinarySparseInstance",
      "weka.attributeSelection.ASEvaluation",
      "weka.attributeSelection.UnsupervisedAttributeEvaluator",
      "weka.attributeSelection.PrincipalComponents",
      "weka.core.converters.ArffLoader$ArffReader",
      "weka.core.converters.LibSVMLoader",
      "weka.core.converters.JSONLoader",
      "weka.core.converters.TextDirectoryLoader",
      "weka.filters.Filter",
      "weka.filters.AllFilter",
      "weka.core.converters.CSVLoader",
      "weka.core.converters.DatabaseLoader",
      "weka.experiment.DatabaseUtils",
      "weka.core.converters.DatabaseConnection",
      "weka.core.Option",
      "weka.core.converters.SerializedInstancesLoader",
      "weka.clusterers.AbstractClusterer",
      "weka.clusterers.RandomizableClusterer",
      "weka.clusterers.SimpleKMeans",
      "weka.core.neighboursearch.CoverTree",
      "weka.classifiers.IteratedSingleClassifierEnhancer",
      "weka.classifiers.RandomizableIteratedSingleClassifierEnhancer",
      "weka.classifiers.meta.LogitBoost",
      "weka.classifiers.trees.DecisionStump",
      "weka.core.converters.SVMLightLoader",
      "weka.classifiers.evaluation.output.prediction.AbstractOutput",
      "weka.classifiers.evaluation.output.prediction.XML",
      "weka.core.UnassignedDatasetException",
      "weka.core.converters.MatlabLoader",
      "weka.core.RevisionUtils",
      "weka.estimators.Estimator",
      "weka.estimators.DiscreteEstimator",
      "weka.core.SerializedObject",
      "weka.experiment.InstanceQuery",
      "weka.core.Capabilities",
      "weka.core.Capabilities$Capability",
      "weka.classifiers.RandomizableClassifier",
      "weka.classifiers.functions.SGDText",
      "weka.core.tokenizers.Tokenizer",
      "weka.core.tokenizers.CharacterDelimitedTokenizer",
      "weka.core.tokenizers.WordTokenizer",
      "weka.core.stemmers.NullStemmer",
      "weka.classifiers.rules.DecisionTable",
      "weka.attributeSelection.ASSearch",
      "weka.attributeSelection.BestFirst",
      "weka.classifiers.evaluation.output.prediction.CSV",
      "weka.classifiers.misc.SerializedClassifier",
      "weka.classifiers.lazy.KStar",
      "weka.classifiers.bayes.NaiveBayes",
      "weka.classifiers.bayes.NaiveBayesUpdateable",
      "weka.core.WekaException",
      "weka.core.UnsupportedAttributeTypeException",
      "weka.classifiers.functions.SimpleLogistic",
      "weka.core.converters.C45Loader",
      "weka.core.ManhattanDistance",
      "weka.core.xml.XMLDocument",
      "weka.core.xml.XMLInstances",
      "weka.core.converters.XRFFLoader",
      "weka.classifiers.trees.RandomTree",
      "weka.classifiers.misc.InputMappedClassifier",
      "weka.core.FindWithCapabilities",
      "weka.core.SingleIndex",
      "weka.classifiers.evaluation.NumericPrediction",
      "weka.classifiers.evaluation.Prediction",
      "weka.core.Javadoc",
      "weka.core.TechnicalInformationHandlerJavadoc",
      "weka.classifiers.meta.MultiClassClassifier",
      "weka.classifiers.functions.Logistic",
      "weka.core.neighboursearch.NearestNeighbourSearch$MyHeap",
      "weka.core.neighboursearch.NearestNeighbourSearch$MyHeapElement",
      "weka.classifiers.meta.FilteredClassifier",
      "weka.filters.supervised.attribute.AttributeSelection",
      "weka.attributeSelection.AttributeSelection",
      "weka.attributeSelection.CfsSubsetEval",
      "weka.attributeSelection.GreedyStepwise",
      "weka.classifiers.trees.J48",
      "weka.filters.supervised.attribute.Discretize",
      "weka.classifiers.meta.MultiClassClassifierUpdateable",
      "weka.classifiers.trees.m5.M5Base",
      "weka.classifiers.rules.M5Rules",
      "weka.classifiers.MultipleClassifiersCombiner",
      "weka.classifiers.ParallelMultipleClassifiersCombiner",
      "weka.classifiers.RandomizableParallelMultipleClassifiersCombiner",
      "weka.classifiers.meta.Stacking",
      "weka.core.AllJavadoc",
      "weka.core.WekaEnumeration",
      "weka.core.Attribute$1",
      "weka.classifiers.trees.REPTree",
      "weka.classifiers.meta.AttributeSelectedClassifier",
      "weka.classifiers.ParallelIteratedSingleClassifierEnhancer",
      "weka.classifiers.RandomizableParallelIteratedSingleClassifierEnhancer",
      "weka.classifiers.meta.RandomCommittee",
      "weka.core.OptionHandlerJavadoc",
      "weka.classifiers.meta.CVParameterSelection",
      "weka.core.FastVector",
      "weka.classifiers.functions.GaussianProcesses",
      "weka.classifiers.functions.supportVector.Kernel",
      "weka.classifiers.functions.supportVector.CachedKernel",
      "weka.classifiers.functions.supportVector.PolyKernel",
      "weka.core.ListOptions",
      "weka.classifiers.bayes.NaiveBayesMultinomialText",
      "weka.core.neighboursearch.balltrees.BallNode",
      "weka.core.Check",
      "weka.core.CheckGOE",
      "weka.classifiers.trees.RandomForest",
      "weka.classifiers.meta.RandomSubSpace",
      "weka.classifiers.meta.Bagging",
      "weka.classifiers.rules.JRip",
      "weka.classifiers.meta.ClassificationViaRegression",
      "weka.classifiers.trees.M5P",
      "weka.clusterers.HierarchicalClusterer",
      "weka.classifiers.lazy.LWL",
      "weka.classifiers.functions.MultilayerPerceptron",
      "weka.filters.unsupervised.attribute.NominalToBinary",
      "weka.classifiers.functions.neural.SigmoidUnit",
      "weka.classifiers.functions.neural.LinearUnit",
      "weka.classifiers.pmml.consumer.PMMLClassifier",
      "weka.classifiers.pmml.consumer.Regression",
      "weka.classifiers.pmml.consumer.Regression$Normalization",
      "weka.clusterers.Cobweb",
      "weka.core.GlobalInfoJavadoc",
      "weka.core.CheckOptionHandler",
      "weka.classifiers.functions.SMOreg",
      "weka.classifiers.functions.supportVector.RegOptimizer",
      "weka.classifiers.functions.supportVector.RegSMO",
      "weka.classifiers.functions.supportVector.RegSMOImproved",
      "weka.classifiers.meta.AdditiveRegression",
      "weka.classifiers.functions.LinearRegression",
      "weka.classifiers.meta.RegressionByDiscretization",
      "weka.filters.unsupervised.attribute.PotentialClassIgnorer",
      "weka.filters.unsupervised.attribute.Discretize",
      "weka.estimators.UnivariateKernelEstimator",
      "weka.estimators.UnivariateEqualFrequencyHistogramEstimator",
      "weka.classifiers.meta.AdaBoostM1",
      "weka.classifiers.functions.SimpleLinearRegression",
      "weka.classifiers.trees.j48.ClassifierTree",
      "weka.classifiers.trees.j48.C45PruneableClassifierTree",
      "weka.classifiers.bayes.NaiveBayesMultinomial",
      "weka.classifiers.bayes.NaiveBayesMultinomialUpdateable",
      "weka.classifiers.evaluation.output.prediction.HTML",
      "weka.filters.SimpleFilter",
      "weka.filters.SimpleStreamFilter",
      "weka.filters.MultiFilter",
      "weka.classifiers.rules.OneR",
      "weka.classifiers.evaluation.output.prediction.PlainText",
      "weka.classifiers.rules.PART",
      "weka.core.MinkowskiDistance",
      "weka.core.neighboursearch.balltrees.BallTreeConstructor",
      "weka.core.neighboursearch.balltrees.BottomUpConstructor",
      "weka.core.TechnicalInformation",
      "weka.core.TechnicalInformation$Type",
      "weka.core.TechnicalInformation$Field",
      "weka.core.neighboursearch.KDTree",
      "weka.core.neighboursearch.kdtrees.KDTreeNodeSplitter",
      "weka.core.neighboursearch.kdtrees.SlidingMidPointOfWidestSide",
      "weka.classifiers.RandomizableMultipleClassifiersCombiner",
      "weka.classifiers.meta.MultiScheme",
      "weka.core.ChebyshevDistance",
      "weka.classifiers.functions.SGD",
      "weka.classifiers.functions.SMO",
      "weka.estimators.KernelEstimator",
      "weka.core.SelectedTag",
      "weka.clusterers.AbstractDensityBasedClusterer",
      "weka.clusterers.MakeDensityBasedClusterer",
      "weka.classifiers.functions.supportVector.RBFKernel",
      "weka.core.tokenizers.AlphabeticTokenizer",
      "weka.estimators.PoissonEstimator",
      "weka.classifiers.functions.VotedPerceptron",
      "weka.estimators.NormalEstimator",
      "weka.experiment.Stats",
      "weka.core.neighboursearch.BallTree",
      "weka.core.neighboursearch.balltrees.TopDownConstructor",
      "weka.core.neighboursearch.balltrees.BallSplitter",
      "weka.core.neighboursearch.balltrees.PointsClosestToFurthestChildren",
      "weka.core.Queue",
      "weka.core.AttributeLocator",
      "weka.core.StringLocator",
      "weka.core.RelationalLocator",
      "weka.attributeSelection.ReliefFAttributeEval",
      "weka.classifiers.functions.supportVector.Puk",
      "weka.core.neighboursearch.kdtrees.MidPointOfWidestDimension",
      "weka.clusterers.FarthestFirst",
      "weka.attributeSelection.WrapperSubsetEval",
      "weka.attributeSelection.CorrelationAttributeEval",
      "weka.clusterers.RandomizableDensityBasedClusterer",
      "weka.clusterers.EM",
      "weka.classifiers.evaluation.output.prediction.Null",
      "weka.clusterers.SingleClustererEnhancer",
      "weka.clusterers.FilteredClusterer",
      "weka.attributeSelection.InfoGainAttributeEval",
      "weka.core.AttributeStats",
      "weka.classifiers.functions.supportVector.PrecomputedKernelMatrixKernel",
      "weka.attributeSelection.SymmetricalUncertAttributeEval",
      "weka.classifiers.meta.Vote",
      "weka.core.tokenizers.NGramTokenizer",
      "weka.classifiers.pmml.consumer.TreeModel",
      "weka.classifiers.pmml.consumer.TreeModel$MiningFunction",
      "weka.classifiers.pmml.consumer.TreeModel$MissingValueStrategy",
      "weka.classifiers.pmml.consumer.TreeModel$NoTrueChildStrategy",
      "weka.classifiers.pmml.consumer.TreeModel$SplitCharacteristic",
      "weka.core.neighboursearch.kdtrees.KDTreeNode",
      "weka.attributeSelection.GainRatioAttributeEval",
      "weka.classifiers.pmml.consumer.SupportVectorMachineModel",
      "weka.classifiers.pmml.consumer.NeuralNetwork$MiningFunction",
      "weka.classifiers.pmml.consumer.SupportVectorMachineModel$classificationMethod",
      "weka.classifiers.pmml.consumer.SupportVectorMachineModel$SVM_representation",
      "weka.core.pmml.VectorDictionary",
      "weka.classifiers.functions.supportVector.NormalizedPolyKernel",
      "weka.classifiers.bayes.net.BIFReader",
      "weka.core.matrix.Matrix",
      "weka.classifiers.trees.LMT",
      "weka.core.neighboursearch.PerformanceStats",
      "weka.core.neighboursearch.TreePerformanceStats",
      "weka.classifiers.rules.part.MakeDecList",
      "weka.classifiers.functions.supportVector.StringKernel",
      "weka.core.neighboursearch.balltrees.MiddleOutConstructor",
      "weka.classifiers.pmml.consumer.RuleSetModel",
      "weka.attributeSelection.OneRAttributeEval",
      "weka.classifiers.misc.InputMappedClassifierBeanInfo",
      "weka.classifiers.rules.OneR$OneRRule",
      "weka.core.ContingencyTables",
      "weka.gui.LogPanel",
      "weka.gui.LogPanel$1",
      "weka.gui.LogPanel$4",
      "weka.clusterers.ClusterEvaluation",
      "weka.core.neighboursearch.kdtrees.KMeansInpiredMethod",
      "weka.core.Queue$QueueNode",
      "weka.classifiers.trees.j48.ModelSelection",
      "weka.classifiers.trees.j48.C45ModelSelection",
      "weka.classifiers.trees.j48.Distribution",
      "weka.classifiers.trees.j48.ClassifierSplitModel",
      "weka.classifiers.trees.j48.NoSplit",
      "weka.classifiers.trees.j48.SplitCriterion",
      "weka.classifiers.trees.j48.EntropyBasedSplitCrit",
      "weka.classifiers.trees.j48.InfoGainSplitCrit",
      "weka.classifiers.trees.j48.GainRatioSplitCrit",
      "weka.classifiers.trees.j48.C45Split",
      "weka.classifiers.trees.j48.Stats",
      "weka.core.Statistics",
      "weka.classifiers.evaluation.ThresholdCurve"
    );
  }
}
