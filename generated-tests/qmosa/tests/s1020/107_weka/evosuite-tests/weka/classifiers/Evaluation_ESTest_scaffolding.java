/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Aug 24 14:03:45 GMT 2018
 */

package weka.classifiers;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

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
      "weka.core.TestInstances",
      "weka.core.DistanceFunction",
      "weka.core.converters.TextDirectoryLoader",
      "org.pentaho.packageManagement.PackageConstraint",
      "org.pentaho.packageManagement.Package",
      "weka.core.xml.XMLBasicSerialization",
      "weka.classifiers.trees.m5.M5Base",
      "weka.classifiers.rules.RuleStats",
      "weka.classifiers.CostMatrix",
      "weka.filters.UnsupervisedFilter",
      "weka.core.logging.Logger$Level",
      "weka.classifiers.pmml.consumer.TreeModel$SplitCharacteristic",
      "weka.classifiers.evaluation.output.prediction.AbstractOutput",
      "weka.core.DenseInstance",
      "weka.core.converters.DatabaseConverter",
      "weka.core.stemmers.Stemmer",
      "weka.classifiers.pmml.consumer.TreeModel$MiningFunction",
      "weka.core.converters.IncrementalConverter",
      "weka.filters.supervised.attribute.ClassOrder",
      "weka.classifiers.evaluation.output.prediction.CSV",
      "weka.classifiers.RandomizableSingleClassifierEnhancer",
      "org.pentaho.packageManagement.DefaultPackageManager",
      "weka.estimators.UnivariateIntervalEstimator",
      "org.bounce.net.DefaultAuthenticator",
      "weka.classifiers.bayes.NaiveBayes",
      "weka.estimators.IncrementalEstimator",
      "weka.core.stemmers.NullStemmer",
      "weka.core.EnvironmentHandler",
      "weka.classifiers.trees.m5.RuleNode",
      "weka.core.RelationalLocator",
      "weka.core.Utils",
      "weka.core.CustomDisplayStringProvider",
      "weka.core.tokenizers.Tokenizer",
      "weka.classifiers.pmml.consumer.TreeModel$MissingValueStrategy",
      "weka.classifiers.functions.SMOreg",
      "weka.classifiers.rules.Rule",
      "weka.core.NoSupportForMissingValuesException",
      "weka.classifiers.UpdateableClassifier",
      "weka.classifiers.bayes.NaiveBayesMultinomialText",
      "weka.core.TechnicalInformation$Type",
      "weka.core.MultiInstanceCapabilitiesHandler",
      "weka.core.Copyable",
      "weka.core.Capabilities",
      "weka.core.AttributeLocator",
      "weka.core.BinarySparseInstance",
      "weka.filters.supervised.attribute.NominalToBinary",
      "weka.classifiers.functions.supportVector.CachedKernel",
      "weka.core.SerializedObject",
      "weka.clusterers.UpdateableClusterer",
      "weka.core.Summarizable",
      "weka.core.AdditionalMeasureProducer",
      "weka.core.neighboursearch.balltrees.BallNode",
      "org.pentaho.packageManagement.PackageManager$1",
      "weka.core.Drawable",
      "weka.classifiers.ConditionalDensityEstimator",
      "weka.core.CapabilitiesHandler",
      "weka.core.pmml.MiningSchema",
      "weka.classifiers.trees.REPTree",
      "weka.core.AbstractInstance",
      "weka.classifiers.pmml.consumer.PMMLClassifier",
      "weka.core.scripting.JythonObject",
      "weka.core.SelectedTag",
      "weka.classifiers.functions.supportVector.RegOptimizer",
      "org.pentaho.packageManagement.DefaultPackage",
      "weka.estimators.DiscreteEstimator",
      "weka.classifiers.bayes.BayesNet",
      "weka.classifiers.misc.InputMappedClassifier",
      "weka.classifiers.ParallelIteratedSingleClassifierEnhancer",
      "weka.experiment.ResultProducer",
      "weka.core.Version",
      "weka.core.converters.AbstractLoader",
      "weka.filters.AllFilter",
      "weka.classifiers.pmml.consumer.Regression",
      "weka.filters.unsupervised.attribute.RemoveUseless",
      "weka.gui.Logger",
      "weka.core.converters.BatchConverter",
      "weka.core.Tag",
      "weka.core.TechnicalInformationHandlerJavadoc",
      "weka.classifiers.IteratedSingleClassifierEnhancer",
      "weka.classifiers.AbstractClassifier",
      "weka.core.converters.ArffLoader",
      "weka.estimators.UnivariateDensityEstimator",
      "weka.core.OptionHandler",
      "weka.core.converters.MatlabLoader",
      "weka.core.WekaException",
      "weka.classifiers.rules.JRip",
      "weka.filters.StreamableFilter",
      "weka.core.Range",
      "weka.core.Attribute$1",
      "weka.core.PartitionGenerator",
      "weka.core.scripting.JythonSerializableObject",
      "weka.classifiers.Classifier",
      "weka.core.Capabilities$Capability",
      "weka.core.SparseInstance",
      "org.pentaho.packageManagement.PackageManager",
      "weka.core.WekaEnumeration",
      "weka.core.tokenizers.WordTokenizer",
      "weka.core.pmml.PMMLModel",
      "weka.classifiers.trees.M5P",
      "weka.filters.unsupervised.attribute.ReplaceMissingValues",
      "weka.classifiers.Evaluation",
      "weka.classifiers.functions.supportVector.Kernel",
      "weka.core.converters.CSVLoader",
      "weka.core.WekaPackageManager",
      "weka.filters.SupervisedFilter",
      "weka.classifiers.pmml.consumer.TreeModel",
      "weka.core.TechnicalInformationHandler",
      "weka.experiment.DatabaseUtils",
      "weka.core.converters.FileSourcedConverter",
      "weka.core.converters.URLSourcedLoader",
      "weka.classifiers.meta.CostSensitiveClassifier",
      "weka.core.tokenizers.CharacterDelimitedTokenizer",
      "weka.core.Option",
      "weka.filters.unsupervised.attribute.PotentialClassIgnorer",
      "weka.core.AllJavadoc",
      "weka.filters.Sourcable",
      "weka.classifiers.meta.RandomSubSpace",
      "weka.core.Attribute",
      "weka.core.Stopwords",
      "weka.classifiers.bayes.NaiveBayesMultinomialUpdateable",
      "weka.core.FastVector",
      "weka.estimators.UnivariateKernelEstimator",
      "weka.core.UnassignedDatasetException",
      "weka.classifiers.functions.supportVector.RegSMOImproved",
      "weka.classifiers.SingleClassifierEnhancer",
      "weka.core.RevisionUtils",
      "weka.classifiers.pmml.consumer.TreeModel$NoTrueChildStrategy",
      "weka.core.Instance",
      "weka.core.converters.Loader",
      "weka.classifiers.functions.supportVector.RegSMO",
      "weka.classifiers.functions.supportVector.PolyKernel",
      "weka.estimators.Estimator",
      "weka.core.ProtectedProperties",
      "weka.classifiers.IntervalEstimator",
      "weka.core.converters.C45Loader",
      "weka.core.StringLocator",
      "weka.core.AttributeStats",
      "weka.core.GlobalInfoJavadoc",
      "weka.core.WeightedInstancesHandler",
      "weka.classifiers.functions.GaussianProcesses",
      "weka.estimators.UnivariateQuantileEstimator",
      "weka.core.TechnicalInformation$Field",
      "weka.filters.unsupervised.attribute.Remove",
      "weka.core.converters.DatabaseLoader",
      "weka.core.Javadoc",
      "weka.core.Randomizable",
      "weka.core.Instances",
      "weka.core.converters.AbstractFileLoader",
      "weka.classifiers.bayes.NaiveBayesMultinomial",
      "weka.filters.unsupervised.attribute.Normalize",
      "weka.core.UnassignedClassException",
      "weka.classifiers.rules.ZeroR",
      "weka.filters.unsupervised.attribute.Standardize",
      "weka.core.converters.DatabaseConnection",
      "weka.core.TechnicalInformation",
      "weka.core.UnsupportedAttributeTypeException",
      "weka.classifiers.Sourcable",
      "weka.core.RevisionHandler",
      "weka.classifiers.evaluation.output.prediction.PlainText",
      "weka.experiment.Stats",
      "weka.core.converters.ConverterUtils$DataSource",
      "weka.core.xml.XMLSerialization",
      "weka.classifiers.xml.XMLClassifier",
      "weka.filters.unsupervised.attribute.MakeIndicator",
      "weka.classifiers.meta.ClassificationViaRegression",
      "weka.filters.Filter",
      "weka.classifiers.RandomizableParallelIteratedSingleClassifierEnhancer",
      "weka.filters.supervised.attribute.Discretize",
      "weka.classifiers.rules.JRip$RipperRule"
    );
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
      "weka.clusterers.AbstractClusterer",
      "weka.clusterers.RandomizableClusterer",
      "weka.clusterers.SimpleKMeans",
      "weka.core.NormalizableDistance",
      "weka.core.EuclideanDistance",
      "weka.core.Range",
      "weka.core.converters.AbstractLoader",
      "weka.core.converters.DatabaseLoader",
      "weka.core.Environment",
      "weka.experiment.DatabaseUtils",
      "weka.core.converters.DatabaseConnection",
      "org.pentaho.packageManagement.PackageManager",
      "org.pentaho.packageManagement.DefaultPackageManager",
      "weka.core.WekaPackageManager",
      "weka.experiment.InstanceQuery",
      "weka.core.Option",
      "weka.core.Instances",
      "weka.core.converters.AbstractFileLoader",
      "weka.core.converters.JSONLoader",
      "weka.core.AbstractInstance",
      "weka.core.SparseInstance",
      "weka.core.BinarySparseInstance",
      "weka.core.converters.MatlabLoader",
      "weka.attributeSelection.ASEvaluation",
      "weka.attributeSelection.UnsupervisedAttributeEvaluator",
      "weka.attributeSelection.PrincipalComponents",
      "weka.core.TestInstances",
      "weka.classifiers.CostMatrix",
      "weka.core.UnassignedClassException",
      "weka.filters.Filter",
      "weka.filters.AllFilter",
      "weka.core.converters.LibSVMLoader",
      "weka.classifiers.AbstractClassifier",
      "weka.classifiers.SingleClassifierEnhancer",
      "weka.classifiers.RandomizableSingleClassifierEnhancer",
      "weka.core.Tag",
      "weka.classifiers.meta.CostSensitiveClassifier",
      "weka.classifiers.rules.ZeroR",
      "weka.core.converters.ArffLoader",
      "weka.core.converters.C45Loader",
      "weka.core.converters.SerializedInstancesLoader",
      "weka.core.converters.CSVLoader",
      "weka.core.Attribute",
      "weka.core.ProtectedProperties",
      "weka.core.converters.ConverterUtils$DataSource",
      "weka.gui.GenericPropertiesCreator",
      "weka.gui.GenericObjectEditor",
      "weka.core.converters.ConverterUtils",
      "weka.core.converters.TextDirectoryLoader",
      "weka.core.WekaEnumeration",
      "weka.core.Attribute$1",
      "weka.classifiers.lazy.IBk",
      "weka.core.neighboursearch.NearestNeighbourSearch",
      "weka.core.neighboursearch.LinearNNSearch",
      "weka.core.converters.SVMLightLoader",
      "weka.core.Javadoc",
      "weka.core.GlobalInfoJavadoc",
      "weka.core.RevisionUtils",
      "weka.classifiers.bayes.BayesNet",
      "weka.classifiers.bayes.net.search.SearchAlgorithm",
      "weka.classifiers.bayes.net.search.local.LocalScoreSearchAlgorithm",
      "weka.classifiers.bayes.net.search.local.K2",
      "weka.classifiers.bayes.net.estimate.BayesNetEstimator",
      "weka.classifiers.bayes.net.estimate.SimpleEstimator",
      "weka.core.neighboursearch.CoverTree",
      "weka.core.Capabilities",
      "weka.core.tokenizers.Tokenizer",
      "weka.core.tokenizers.AlphabeticTokenizer",
      "weka.core.TechnicalInformationHandlerJavadoc",
      "weka.classifiers.trees.REPTree",
      "weka.classifiers.bayes.NaiveBayesMultinomial",
      "weka.core.xml.XMLDocument",
      "weka.core.xml.XMLInstances",
      "weka.core.converters.XRFFLoader",
      "weka.classifiers.rules.JRip",
      "weka.core.UnassignedDatasetException",
      "weka.classifiers.trees.m5.M5Base",
      "weka.classifiers.rules.M5Rules",
      "weka.experiment.Stats",
      "weka.classifiers.bayes.NaiveBayesMultinomialUpdateable",
      "weka.classifiers.IteratedSingleClassifierEnhancer",
      "weka.classifiers.meta.AdditiveRegression",
      "weka.classifiers.trees.DecisionStump",
      "weka.classifiers.functions.SMOreg",
      "weka.classifiers.functions.supportVector.RegOptimizer",
      "weka.classifiers.functions.supportVector.RegSMO",
      "weka.classifiers.functions.supportVector.RegSMOImproved",
      "weka.classifiers.functions.supportVector.Kernel",
      "weka.classifiers.functions.supportVector.CachedKernel",
      "weka.classifiers.functions.supportVector.PolyKernel",
      "weka.core.Capabilities$Capability",
      "weka.core.DenseInstance",
      "weka.estimators.Estimator",
      "weka.estimators.NormalEstimator",
      "weka.classifiers.ParallelIteratedSingleClassifierEnhancer",
      "weka.classifiers.RandomizableParallelIteratedSingleClassifierEnhancer",
      "weka.classifiers.meta.RandomSubSpace",
      "weka.core.neighboursearch.KDTree",
      "weka.core.neighboursearch.kdtrees.KDTreeNodeSplitter",
      "weka.core.neighboursearch.kdtrees.SlidingMidPointOfWidestSide",
      "weka.classifiers.evaluation.output.prediction.AbstractOutput",
      "weka.classifiers.evaluation.output.prediction.CSV",
      "weka.classifiers.pmml.consumer.PMMLClassifier",
      "weka.classifiers.pmml.consumer.RuleSetModel",
      "weka.classifiers.pmml.consumer.TreeModel$MiningFunction",
      "weka.core.neighboursearch.balltrees.BallNode",
      "weka.classifiers.misc.SerializedClassifier",
      "weka.classifiers.lazy.LWL",
      "weka.classifiers.bayes.NaiveBayes",
      "weka.classifiers.trees.M5P",
      "weka.classifiers.meta.FilteredClassifier",
      "weka.filters.supervised.attribute.AttributeSelection",
      "weka.attributeSelection.AttributeSelection",
      "weka.attributeSelection.CfsSubsetEval",
      "weka.attributeSelection.ASSearch",
      "weka.attributeSelection.GreedyStepwise",
      "weka.attributeSelection.BestFirst",
      "weka.classifiers.trees.J48",
      "weka.filters.supervised.attribute.Discretize",
      "weka.core.WekaException",
      "weka.core.UnsupportedAttributeTypeException",
      "weka.classifiers.lazy.KStar",
      "weka.classifiers.MultipleClassifiersCombiner",
      "weka.classifiers.ParallelMultipleClassifiersCombiner",
      "weka.classifiers.RandomizableParallelMultipleClassifiersCombiner",
      "weka.classifiers.meta.Stacking",
      "weka.classifiers.functions.supportVector.PrecomputedKernelMatrixKernel",
      "weka.core.SerializedObject",
      "weka.classifiers.rules.OneR",
      "weka.classifiers.functions.LinearRegression",
      "weka.core.ClassDiscovery",
      "weka.core.ClassCache",
      "weka.core.AllJavadoc",
      "weka.core.TechnicalInformation",
      "weka.core.TechnicalInformation$Type",
      "weka.core.TechnicalInformation$Field",
      "weka.core.ListOptions",
      "weka.classifiers.misc.InputMappedClassifier",
      "weka.estimators.KernelEstimator",
      "weka.classifiers.meta.ClassificationViaRegression",
      "weka.clusterers.Cobweb",
      "weka.classifiers.functions.supportVector.StringKernel",
      "weka.classifiers.functions.MultilayerPerceptron",
      "weka.core.FastVector",
      "weka.filters.unsupervised.attribute.NominalToBinary",
      "weka.classifiers.functions.neural.SigmoidUnit",
      "weka.classifiers.functions.neural.LinearUnit",
      "weka.classifiers.bayes.NaiveBayesMultinomialText",
      "weka.core.tokenizers.CharacterDelimitedTokenizer",
      "weka.core.tokenizers.WordTokenizer",
      "weka.core.stemmers.NullStemmer",
      "weka.classifiers.meta.RegressionByDiscretization",
      "weka.filters.unsupervised.attribute.PotentialClassIgnorer",
      "weka.filters.unsupervised.attribute.Discretize",
      "weka.core.AttributeStats",
      "weka.classifiers.misc.InputMappedClassifierBeanInfo",
      "weka.classifiers.RandomizableMultipleClassifiersCombiner",
      "weka.classifiers.meta.Vote",
      "weka.classifiers.evaluation.output.prediction.HTML",
      "weka.core.neighboursearch.BallTree",
      "weka.core.neighboursearch.balltrees.BallTreeConstructor",
      "weka.core.neighboursearch.balltrees.TopDownConstructor",
      "weka.core.neighboursearch.balltrees.BallSplitter",
      "weka.core.neighboursearch.balltrees.PointsClosestToFurthestChildren",
      "weka.core.neighboursearch.NearestNeighbourSearch$MyHeap",
      "weka.core.neighboursearch.NearestNeighbourSearch$MyHeapElement",
      "weka.classifiers.rules.DecisionTable",
      "weka.core.SelectedTag",
      "weka.classifiers.evaluation.output.prediction.XML",
      "weka.classifiers.rules.PART",
      "weka.classifiers.pmml.consumer.TreeModel",
      "weka.classifiers.pmml.consumer.TreeModel$MissingValueStrategy",
      "weka.classifiers.pmml.consumer.TreeModel$NoTrueChildStrategy",
      "weka.classifiers.pmml.consumer.TreeModel$SplitCharacteristic",
      "weka.core.SerializationHelper",
      "weka.classifiers.meta.MultiClassClassifier",
      "weka.classifiers.meta.MultiClassClassifierUpdateable",
      "weka.classifiers.functions.Logistic",
      "weka.classifiers.trees.RandomTree",
      "weka.classifiers.meta.MultiScheme",
      "weka.classifiers.trees.LMT",
      "weka.estimators.UnivariateKernelEstimator",
      "weka.classifiers.RandomizableClassifier",
      "weka.classifiers.functions.SGD",
      "weka.classifiers.bayes.NaiveBayesUpdateable",
      "weka.classifiers.evaluation.output.prediction.PlainText",
      "weka.classifiers.functions.SimpleLinearRegression",
      "weka.classifiers.functions.SMO",
      "weka.classifiers.evaluation.output.prediction.Null",
      "weka.filters.SimpleFilter",
      "weka.filters.SimpleStreamFilter",
      "weka.filters.MultiFilter",
      "weka.classifiers.functions.supportVector.RBFKernel"
    );
  }
}