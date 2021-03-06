/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Aug 23 12:15:53 GMT 2018
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
      "weka.filters.unsupervised.attribute.NominalToBinary",
      "weka.clusterers.AbstractClusterer",
      "weka.core.converters.TextDirectoryLoader",
      "org.pentaho.packageManagement.PackageConstraint",
      "weka.core.xml.XMLBasicSerialization",
      "weka.filters.UnsupervisedFilter",
      "weka.core.neighboursearch.CoverTree$DistanceNode",
      "weka.classifiers.evaluation.output.prediction.AbstractOutput",
      "weka.core.DenseInstance",
      "weka.core.converters.DatabaseConverter",
      "weka.classifiers.trees.J48",
      "weka.classifiers.functions.SimpleLinearRegression",
      "weka.classifiers.pmml.consumer.TreeModel$MiningFunction",
      "org.pentaho.packageManagement.DefaultPackageManager",
      "weka.estimators.UnivariateIntervalEstimator",
      "org.bounce.net.DefaultAuthenticator",
      "weka.core.neighboursearch.CoverTree$MyHeap",
      "weka.estimators.IncrementalEstimator",
      "weka.clusterers.NumberOfClustersRequestable",
      "weka.core.stemmers.NullStemmer",
      "weka.core.CustomDisplayStringProvider",
      "weka.core.NormalizableDistance",
      "weka.clusterers.SimpleKMeans",
      "weka.core.TechnicalInformation$Type",
      "weka.core.Copyable",
      "weka.filters.supervised.attribute.NominalToBinary",
      "weka.core.BinarySparseInstance",
      "weka.core.SerializedObject",
      "weka.clusterers.UpdateableClusterer",
      "weka.core.neighboursearch.balltrees.BallNode",
      "weka.core.AdditionalMeasureProducer",
      "weka.classifiers.RandomizableIteratedSingleClassifierEnhancer",
      "weka.classifiers.meta.MultiClassClassifier",
      "weka.core.Optimization",
      "weka.classifiers.pmml.consumer.PMMLClassifier",
      "weka.classifiers.misc.InputMappedClassifier",
      "weka.experiment.ResultProducer",
      "weka.core.Version",
      "weka.classifiers.meta.MultiClassClassifier$Code",
      "weka.gui.Logger",
      "weka.classifiers.evaluation.NominalPrediction",
      "weka.core.neighboursearch.CoverTree",
      "weka.core.converters.ArffLoader",
      "weka.classifiers.AbstractClassifier",
      "weka.filters.unsupervised.attribute.Center",
      "weka.classifiers.meta.Stacking",
      "weka.core.WekaException",
      "weka.filters.StreamableFilter",
      "weka.core.Attribute$1",
      "weka.core.PartitionGenerator",
      "weka.core.neighboursearch.NearestNeighbourSearch$NeighborList",
      "weka.core.SparseInstance",
      "weka.attributeSelection.AttributeTransformer",
      "weka.core.tokenizers.WordTokenizer",
      "weka.classifiers.misc.SerializedClassifier",
      "weka.core.pmml.PMMLModel",
      "weka.classifiers.trees.j48.ClassifierTree",
      "weka.filters.unsupervised.attribute.ReplaceMissingValues",
      "weka.attributeSelection.PrincipalComponents",
      "weka.classifiers.trees.j48.PruneableClassifierTree",
      "weka.classifiers.Evaluation",
      "weka.classifiers.functions.supportVector.Kernel",
      "weka.classifiers.evaluation.TwoClassStats",
      "weka.classifiers.pmml.consumer.TreeModel",
      "weka.classifiers.evaluation.ThresholdCurve",
      "weka.core.converters.URLSourcedLoader",
      "weka.core.converters.FileSourcedConverter",
      "weka.core.neighboursearch.LinearNNSearch",
      "weka.clusterers.Clusterer",
      "weka.core.neighboursearch.PerformanceStats",
      "weka.core.tokenizers.AlphabeticTokenizer",
      "weka.estimators.UnivariateKernelEstimator",
      "weka.core.UnassignedDatasetException",
      "weka.classifiers.meta.CVParameterSelection",
      "weka.classifiers.RandomizableClassifier",
      "weka.core.RevisionUtils",
      "weka.core.converters.Loader",
      "weka.estimators.Estimator",
      "weka.core.ProtectedProperties",
      "weka.core.converters.C45Loader",
      "weka.core.StringLocator",
      "weka.core.AttributeStats",
      "weka.classifiers.trees.DecisionStump",
      "weka.estimators.UnivariateQuantileEstimator",
      "weka.core.neighboursearch.covertrees.Stack",
      "weka.filters.unsupervised.attribute.Remove",
      "weka.core.Randomizable",
      "weka.classifiers.rules.M5Rules",
      "weka.core.EuclideanDistance",
      "weka.core.Instances",
      "weka.core.converters.AbstractFileLoader",
      "weka.core.converters.ConverterUtils$DataSink",
      "weka.core.xml.XMLInstances",
      "weka.core.converters.DatabaseConnection",
      "weka.core.UnsupportedAttributeTypeException",
      "weka.core.TechnicalInformation",
      "weka.classifiers.functions.Logistic$OptEngCG",
      "weka.core.RevisionHandler",
      "weka.experiment.Stats",
      "weka.core.converters.ConverterUtils$DataSource",
      "weka.classifiers.rules.OneR$OneRRule",
      "weka.classifiers.xml.XMLClassifier",
      "weka.filters.Filter",
      "weka.filters.supervised.attribute.Discretize",
      "weka.core.TestInstances",
      "weka.core.converters.ConverterUtils",
      "weka.core.DistanceFunction",
      "weka.classifiers.meta.MultiClassClassifierUpdateable",
      "weka.attributeSelection.AttributeEvaluator",
      "org.pentaho.packageManagement.Package",
      "weka.classifiers.trees.m5.M5Base",
      "weka.attributeSelection.SubsetEvaluator",
      "weka.classifiers.CostMatrix",
      "weka.classifiers.evaluation.NumericPrediction",
      "weka.core.logging.Logger$Level",
      "weka.classifiers.pmml.consumer.TreeModel$SplitCharacteristic",
      "weka.core.ConjugateGradientOptimization",
      "weka.classifiers.functions.LinearRegression",
      "weka.core.stemmers.Stemmer",
      "weka.classifiers.functions.supportVector.PrecomputedKernelMatrixKernel",
      "weka.core.converters.IncrementalConverter",
      "weka.classifiers.RandomizableSingleClassifierEnhancer",
      "weka.classifiers.meta.LogitBoost",
      "weka.classifiers.bayes.NaiveBayes",
      "weka.classifiers.meta.MultiClassClassifier$RandomCode",
      "weka.core.EnvironmentHandler",
      "weka.classifiers.trees.j48.C45ModelSelection",
      "weka.classifiers.functions.Logistic",
      "weka.classifiers.trees.m5.RuleNode",
      "weka.core.RelationalLocator",
      "weka.core.Utils",
      "weka.core.converters.XRFFLoader",
      "weka.core.tokenizers.Tokenizer",
      "weka.classifiers.pmml.consumer.TreeModel$MissingValueStrategy",
      "weka.filters.unsupervised.instance.RemoveWithValues",
      "weka.core.NoSupportForMissingValuesException",
      "weka.classifiers.UpdateableClassifier",
      "weka.classifiers.ParallelMultipleClassifiersCombiner",
      "weka.classifiers.bayes.NaiveBayesMultinomialText",
      "weka.core.MultiInstanceCapabilitiesHandler",
      "weka.classifiers.meta.MultiClassClassifier$ExhaustiveCode",
      "weka.core.Capabilities",
      "weka.core.AttributeLocator",
      "weka.core.converters.SVMLightLoader",
      "weka.classifiers.functions.supportVector.CachedKernel",
      "weka.classifiers.meta.RegressionByDiscretization",
      "weka.core.Summarizable",
      "weka.classifiers.trees.j48.ModelSelection",
      "org.pentaho.packageManagement.PackageManager$1",
      "weka.core.Drawable",
      "weka.core.matrix.Matrix",
      "weka.classifiers.ConditionalDensityEstimator",
      "weka.core.CapabilitiesHandler",
      "weka.core.pmml.MiningSchema",
      "weka.attributeSelection.ASEvaluation",
      "weka.core.AbstractInstance",
      "weka.core.converters.LibSVMLoader",
      "weka.core.SelectedTag",
      "org.pentaho.packageManagement.DefaultPackage",
      "weka.estimators.DiscreteEstimator",
      "weka.classifiers.bayes.NaiveBayesUpdateable",
      "weka.classifiers.trees.j48.C45PruneableClassifierTree",
      "weka.clusterers.RandomizableClusterer",
      "weka.classifiers.evaluation.Prediction",
      "weka.core.converters.AbstractLoader",
      "weka.filters.AllFilter",
      "weka.filters.unsupervised.attribute.RemoveUseless",
      "weka.core.converters.BatchConverter",
      "weka.core.Tag",
      "weka.classifiers.IteratedSingleClassifierEnhancer",
      "weka.classifiers.trees.j48.BinC45ModelSelection",
      "weka.estimators.UnivariateDensityEstimator",
      "weka.core.OptionHandler",
      "weka.core.converters.MatlabLoader",
      "weka.core.Range",
      "weka.attributeSelection.WrapperSubsetEval",
      "weka.classifiers.Classifier",
      "weka.core.Capabilities$Capability",
      "org.pentaho.packageManagement.PackageManager",
      "weka.core.WekaEnumeration",
      "weka.classifiers.trees.M5P",
      "weka.core.WekaPackageManager",
      "weka.estimators.UnivariateEqualFrequencyHistogramEstimator",
      "weka.filters.SupervisedFilter",
      "weka.core.TechnicalInformationHandler",
      "weka.experiment.DatabaseUtils",
      "weka.classifiers.functions.SimpleLogistic",
      "weka.classifiers.lazy.LWL",
      "weka.core.tokenizers.CharacterDelimitedTokenizer",
      "weka.classifiers.meta.CostSensitiveClassifier",
      "weka.core.Option",
      "weka.filters.unsupervised.attribute.PotentialClassIgnorer",
      "weka.filters.Sourcable",
      "weka.classifiers.meta.MultiClassClassifier$StandardCode",
      "weka.core.Attribute",
      "weka.core.FastVector",
      "weka.classifiers.MultipleClassifiersCombiner",
      "weka.core.xml.XMLDocument",
      "weka.core.BatchPredictor",
      "weka.classifiers.SingleClassifierEnhancer",
      "weka.classifiers.pmml.consumer.TreeModel$NoTrueChildStrategy",
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
      "weka.classifiers.functions.SGD",
      "weka.classifiers.RandomizableParallelMultipleClassifiersCombiner",
      "weka.core.neighboursearch.CoverTree$CoverTreeNode",
      "weka.classifiers.rules.OneR",
      "weka.filters.unsupervised.attribute.Normalize",
      "weka.core.UnassignedClassException",
      "weka.classifiers.rules.ZeroR",
      "weka.filters.unsupervised.attribute.Standardize",
      "weka.attributeSelection.UnsupervisedAttributeEvaluator",
      "weka.classifiers.Sourcable",
      "weka.classifiers.functions.Logistic$OptEng",
      "weka.classifiers.evaluation.output.prediction.PlainText",
      "weka.core.xml.XMLSerialization",
      "weka.core.neighboursearch.TreePerformanceStats",
      "weka.filters.unsupervised.attribute.MakeIndicator",
      "weka.classifiers.lazy.IBk"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
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
      "weka.core.converters.AbstractLoader",
      "weka.core.converters.AbstractFileLoader",
      "weka.core.converters.C45Loader",
      "weka.core.AbstractInstance",
      "weka.core.SparseInstance",
      "weka.core.BinarySparseInstance",
      "weka.core.UnassignedDatasetException",
      "weka.core.converters.ArffLoader",
      "weka.core.converters.MatlabLoader",
      "weka.core.ProtectedProperties",
      "weka.core.converters.ConverterUtils$DataSource",
      "weka.core.Instances",
      "weka.classifiers.CostMatrix",
      "weka.core.converters.CSVLoader",
      "weka.core.Range",
      "weka.core.converters.TextDirectoryLoader",
      "weka.core.Attribute",
      "weka.classifiers.AbstractClassifier",
      "weka.classifiers.SingleClassifierEnhancer",
      "weka.classifiers.misc.InputMappedClassifier",
      "weka.classifiers.rules.ZeroR",
      "weka.core.neighboursearch.NearestNeighbourSearch",
      "weka.core.neighboursearch.CoverTree",
      "weka.core.NormalizableDistance",
      "weka.core.EuclideanDistance",
      "weka.core.converters.SerializedInstancesLoader",
      "weka.core.converters.DatabaseLoader",
      "weka.core.Environment",
      "weka.experiment.DatabaseUtils",
      "weka.core.converters.DatabaseConnection",
      "org.pentaho.packageManagement.PackageManager",
      "org.pentaho.packageManagement.DefaultPackageManager",
      "weka.core.WekaPackageManager",
      "weka.core.TestInstances",
      "weka.core.WekaEnumeration",
      "weka.core.Attribute$1",
      "weka.classifiers.RandomizableSingleClassifierEnhancer",
      "weka.core.Tag",
      "weka.classifiers.meta.CostSensitiveClassifier",
      "weka.filters.Filter",
      "weka.filters.SimpleFilter",
      "weka.filters.SimpleStreamFilter",
      "weka.filters.MultiFilter",
      "weka.filters.AllFilter",
      "weka.core.Option",
      "weka.core.converters.SVMLightLoader",
      "weka.classifiers.meta.CVParameterSelection",
      "weka.core.FastVector",
      "weka.core.converters.ArffLoader$ArffReader",
      "weka.core.converters.LibSVMLoader",
      "weka.classifiers.lazy.IBk",
      "weka.core.neighboursearch.LinearNNSearch",
      "weka.classifiers.bayes.BayesNet",
      "weka.classifiers.bayes.net.search.SearchAlgorithm",
      "weka.classifiers.bayes.net.search.local.LocalScoreSearchAlgorithm",
      "weka.classifiers.bayes.net.search.local.K2",
      "weka.classifiers.bayes.net.estimate.BayesNetEstimator",
      "weka.classifiers.bayes.net.estimate.SimpleEstimator",
      "weka.core.DenseInstance",
      "weka.core.xml.XMLDocument",
      "weka.core.xml.XMLInstances",
      "weka.core.converters.XRFFLoader",
      "weka.core.converters.JSONLoader",
      "weka.experiment.InstanceQuery",
      "weka.clusterers.AbstractClusterer",
      "weka.clusterers.RandomizableClusterer",
      "weka.clusterers.SimpleKMeans",
      "weka.core.neighboursearch.balltrees.BallNode",
      "weka.classifiers.meta.MultiClassClassifier",
      "weka.classifiers.meta.MultiClassClassifierUpdateable",
      "weka.classifiers.functions.Logistic",
      "weka.core.neighboursearch.BallTree",
      "weka.core.neighboursearch.balltrees.BallTreeConstructor",
      "weka.core.neighboursearch.balltrees.TopDownConstructor",
      "weka.core.neighboursearch.balltrees.BallSplitter",
      "weka.core.neighboursearch.balltrees.PointsClosestToFurthestChildren",
      "weka.core.UnassignedClassException",
      "weka.core.SerializedObject",
      "weka.attributeSelection.ASEvaluation",
      "weka.attributeSelection.UnsupervisedAttributeEvaluator",
      "weka.attributeSelection.PrincipalComponents",
      "weka.gui.GenericPropertiesCreator",
      "weka.gui.GenericObjectEditor",
      "weka.core.converters.ConverterUtils",
      "weka.core.neighboursearch.NearestNeighbourSearch$MyHeap",
      "weka.core.neighboursearch.NearestNeighbourSearch$MyHeapElement",
      "weka.core.neighboursearch.balltrees.BottomUpConstructor",
      "weka.core.Javadoc",
      "weka.core.ClassDiscovery",
      "weka.core.ClassCache",
      "weka.core.AllJavadoc",
      "weka.classifiers.functions.SimpleLogistic",
      "weka.core.Capabilities",
      "weka.core.Capabilities$Capability",
      "weka.classifiers.trees.J48",
      "weka.classifiers.trees.j48.ClassifierTree",
      "weka.classifiers.trees.j48.C45PruneableClassifierTree",
      "weka.core.RevisionUtils",
      "weka.classifiers.trees.RandomTree",
      "weka.classifiers.bayes.NaiveBayesMultinomialText",
      "weka.core.tokenizers.Tokenizer",
      "weka.core.tokenizers.CharacterDelimitedTokenizer",
      "weka.core.tokenizers.WordTokenizer",
      "weka.core.stemmers.NullStemmer",
      "weka.classifiers.trees.RandomForest",
      "weka.classifiers.IteratedSingleClassifierEnhancer",
      "weka.classifiers.RandomizableIteratedSingleClassifierEnhancer",
      "weka.classifiers.meta.LogitBoost",
      "weka.classifiers.trees.DecisionStump",
      "weka.core.TechnicalInformation",
      "weka.core.TechnicalInformation$Type",
      "weka.core.TechnicalInformation$Field",
      "weka.classifiers.MultipleClassifiersCombiner",
      "weka.classifiers.RandomizableMultipleClassifiersCombiner",
      "weka.classifiers.meta.MultiScheme",
      "weka.classifiers.functions.supportVector.Kernel",
      "weka.classifiers.functions.supportVector.StringKernel",
      "weka.classifiers.bayes.NaiveBayesMultinomial",
      "weka.classifiers.bayes.NaiveBayesMultinomialUpdateable",
      "weka.classifiers.RandomizableClassifier",
      "weka.classifiers.functions.SGD",
      "weka.classifiers.meta.RegressionByDiscretization",
      "weka.filters.unsupervised.attribute.PotentialClassIgnorer",
      "weka.filters.unsupervised.attribute.Discretize",
      "weka.classifiers.rules.DecisionTable",
      "weka.attributeSelection.ASSearch",
      "weka.attributeSelection.BestFirst",
      "weka.classifiers.functions.GaussianProcesses",
      "weka.classifiers.functions.supportVector.CachedKernel",
      "weka.classifiers.functions.supportVector.PolyKernel",
      "weka.classifiers.ParallelMultipleClassifiersCombiner",
      "weka.classifiers.RandomizableParallelMultipleClassifiersCombiner",
      "weka.classifiers.meta.Stacking",
      "weka.classifiers.misc.SerializedClassifier",
      "weka.classifiers.functions.SimpleLinearRegression",
      "weka.estimators.UnivariateKernelEstimator",
      "weka.estimators.UnivariateEqualFrequencyHistogramEstimator",
      "weka.classifiers.rules.OneR",
      "weka.clusterers.AbstractDensityBasedClusterer",
      "weka.clusterers.MakeDensityBasedClusterer",
      "weka.classifiers.trees.LMT",
      "weka.classifiers.evaluation.output.prediction.AbstractOutput",
      "weka.classifiers.evaluation.output.prediction.CSV",
      "weka.classifiers.functions.SGDText",
      "weka.classifiers.functions.VotedPerceptron",
      "weka.classifiers.trees.m5.M5Base",
      "weka.classifiers.trees.M5P",
      "weka.core.tokenizers.AlphabeticTokenizer",
      "weka.core.neighboursearch.KDTree",
      "weka.core.neighboursearch.kdtrees.KDTreeNodeSplitter",
      "weka.core.neighboursearch.kdtrees.SlidingMidPointOfWidestSide",
      "weka.classifiers.lazy.KStar",
      "weka.classifiers.lazy.LWL",
      "weka.classifiers.bayes.NaiveBayes",
      "weka.classifiers.bayes.NaiveBayesUpdateable",
      "weka.classifiers.meta.AdaBoostM1",
      "weka.classifiers.meta.FilteredClassifier",
      "weka.filters.supervised.attribute.AttributeSelection",
      "weka.attributeSelection.AttributeSelection",
      "weka.attributeSelection.CfsSubsetEval",
      "weka.attributeSelection.GreedyStepwise",
      "weka.filters.supervised.attribute.Discretize",
      "weka.classifiers.functions.MultilayerPerceptron",
      "weka.filters.unsupervised.attribute.NominalToBinary",
      "weka.classifiers.functions.neural.SigmoidUnit",
      "weka.classifiers.functions.neural.LinearUnit",
      "weka.classifiers.evaluation.output.prediction.XML",
      "weka.classifiers.functions.SMOreg",
      "weka.classifiers.functions.supportVector.RegOptimizer",
      "weka.classifiers.functions.supportVector.RegSMO",
      "weka.classifiers.functions.supportVector.RegSMOImproved",
      "weka.core.tokenizers.NGramTokenizer",
      "weka.experiment.Stats",
      "weka.classifiers.meta.ClassificationViaRegression",
      "weka.classifiers.rules.JRip",
      "weka.estimators.Estimator",
      "weka.estimators.PoissonEstimator",
      "weka.core.WekaException",
      "weka.core.UnsupportedAttributeTypeException",
      "weka.attributeSelection.CorrelationAttributeEval",
      "weka.classifiers.meta.Vote",
      "weka.classifiers.trees.REPTree",
      "weka.attributeSelection.InfoGainAttributeEval",
      "weka.classifiers.rules.M5Rules",
      "weka.classifiers.meta.AttributeSelectedClassifier",
      "weka.classifiers.functions.SMO",
      "weka.classifiers.ParallelIteratedSingleClassifierEnhancer",
      "weka.classifiers.RandomizableParallelIteratedSingleClassifierEnhancer",
      "weka.classifiers.meta.RandomCommittee",
      "weka.classifiers.evaluation.output.prediction.HTML",
      "weka.core.FindWithCapabilities",
      "weka.core.SingleIndex",
      "weka.attributeSelection.GainRatioAttributeEval",
      "weka.classifiers.functions.LinearRegression",
      "weka.classifiers.functions.supportVector.Puk",
      "weka.core.ManhattanDistance",
      "weka.classifiers.evaluation.NumericPrediction",
      "weka.classifiers.evaluation.Prediction",
      "weka.core.ChebyshevDistance",
      "weka.classifiers.evaluation.output.prediction.Null",
      "weka.classifiers.functions.supportVector.PrecomputedKernelMatrixKernel",
      "weka.clusterers.Cobweb",
      "weka.clusterers.HierarchicalClusterer",
      "weka.classifiers.rules.PART",
      "weka.attributeSelection.OneRAttributeEval",
      "weka.classifiers.evaluation.output.prediction.PlainText",
      "weka.estimators.NormalEstimator",
      "weka.estimators.KernelEstimator",
      "weka.core.neighboursearch.balltrees.MiddleOutConstructor",
      "weka.clusterers.SingleClustererEnhancer",
      "weka.clusterers.FilteredClusterer",
      "weka.attributeSelection.WrapperSubsetEval",
      "weka.core.matrix.Matrix",
      "weka.core.AttributeStats",
      "weka.core.Check",
      "weka.core.CheckGOE",
      "weka.classifiers.meta.Bagging",
      "weka.classifiers.meta.AdditiveRegression",
      "weka.attributeSelection.SymmetricalUncertAttributeEval",
      "weka.classifiers.rules.part.MakeDecList",
      "weka.core.OptionHandlerJavadoc",
      "weka.core.MinkowskiDistance",
      "weka.core.SelectedTag",
      "weka.classifiers.pmml.consumer.PMMLClassifier",
      "weka.classifiers.pmml.consumer.GeneralRegression",
      "weka.classifiers.pmml.consumer.GeneralRegression$ModelType",
      "weka.classifiers.pmml.consumer.GeneralRegression$CumulativeLinkFunction",
      "weka.classifiers.pmml.consumer.GeneralRegression$LinkFunction",
      "weka.classifiers.pmml.consumer.GeneralRegression$Distribution",
      "weka.classifiers.meta.RandomSubSpace",
      "weka.core.CheckOptionHandler",
      "weka.core.TechnicalInformationHandlerJavadoc",
      "weka.clusterers.FarthestFirst",
      "weka.classifiers.functions.supportVector.RBFKernel",
      "weka.core.GlobalInfoJavadoc",
      "weka.core.ContingencyTables",
      "weka.classifiers.misc.InputMappedClassifierBeanInfo",
      "weka.classifiers.pmml.consumer.NeuralNetwork",
      "weka.classifiers.pmml.consumer.NeuralNetwork$MiningFunction",
      "weka.classifiers.pmml.consumer.NeuralNetwork$ActivationFunction",
      "weka.classifiers.pmml.consumer.NeuralNetwork$Normalization",
      "weka.attributeSelection.ReliefFAttributeEval",
      "weka.estimators.MahalanobisEstimator",
      "weka.estimators.DiscreteEstimator",
      "weka.classifiers.pmml.consumer.Regression",
      "weka.classifiers.pmml.consumer.Regression$Normalization",
      "weka.classifiers.functions.supportVector.NormalizedPolyKernel",
      "weka.classifiers.pmml.consumer.RuleSetModel",
      "weka.classifiers.pmml.consumer.TreeModel$MiningFunction",
      "weka.classifiers.evaluation.NominalPrediction",
      "weka.clusterers.RandomizableDensityBasedClusterer",
      "weka.clusterers.EM",
      "weka.classifiers.evaluation.ThresholdCurve",
      "weka.classifiers.evaluation.TwoClassStats",
      "weka.classifiers.pmml.consumer.TreeModel",
      "weka.classifiers.pmml.consumer.TreeModel$MissingValueStrategy",
      "weka.classifiers.pmml.consumer.TreeModel$NoTrueChildStrategy",
      "weka.classifiers.pmml.consumer.TreeModel$SplitCharacteristic",
      "weka.core.ListOptions"
    );
  }
}
