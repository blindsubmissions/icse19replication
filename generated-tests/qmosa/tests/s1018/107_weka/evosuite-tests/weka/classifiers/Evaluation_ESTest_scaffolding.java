/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Aug 24 13:28:39 GMT 2018
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
      "weka.clusterers.AbstractClusterer",
      "weka.filters.unsupervised.attribute.NominalToBinary",
      "weka.core.TestInstances",
      "weka.core.converters.ConverterUtils",
      "weka.core.DistanceFunction",
      "weka.core.converters.TextDirectoryLoader",
      "org.pentaho.packageManagement.PackageConstraint",
      "weka.attributeSelection.AttributeEvaluator",
      "org.pentaho.packageManagement.Package",
      "weka.core.xml.XMLBasicSerialization",
      "weka.attributeSelection.SubsetEvaluator",
      "weka.classifiers.CostMatrix",
      "weka.filters.UnsupervisedFilter",
      "weka.core.logging.Logger$Level",
      "weka.classifiers.evaluation.output.prediction.AbstractOutput",
      "weka.attributeSelection.CfsSubsetEval",
      "weka.core.DenseInstance",
      "weka.classifiers.trees.J48",
      "weka.core.stemmers.Stemmer",
      "weka.core.converters.IncrementalConverter",
      "weka.classifiers.RandomizableSingleClassifierEnhancer",
      "org.pentaho.packageManagement.DefaultPackageManager",
      "weka.estimators.UnivariateIntervalEstimator",
      "org.bounce.net.DefaultAuthenticator",
      "weka.clusterers.NumberOfClustersRequestable",
      "weka.core.stemmers.NullStemmer",
      "weka.core.EnvironmentHandler",
      "weka.classifiers.trees.j48.C45ModelSelection",
      "weka.core.RelationalLocator",
      "weka.core.Utils",
      "weka.core.converters.XRFFLoader",
      "weka.core.CustomDisplayStringProvider",
      "weka.core.tokenizers.Tokenizer",
      "weka.core.NormalizableDistance",
      "weka.classifiers.functions.SMOreg",
      "weka.core.NoSupportForMissingValuesException",
      "weka.clusterers.SimpleKMeans",
      "weka.classifiers.UpdateableClassifier",
      "weka.classifiers.bayes.NaiveBayesMultinomialText",
      "weka.core.TechnicalInformation$Type",
      "weka.core.MultiInstanceCapabilitiesHandler",
      "weka.core.Copyable",
      "weka.core.Capabilities",
      "weka.core.BinarySparseInstance",
      "weka.core.AttributeLocator",
      "weka.classifiers.RandomizableMultipleClassifiersCombiner",
      "weka.core.converters.SVMLightLoader",
      "weka.classifiers.functions.supportVector.CachedKernel",
      "weka.core.SerializedObject",
      "weka.clusterers.UpdateableClusterer",
      "weka.core.Summarizable",
      "weka.attributeSelection.BestFirst",
      "weka.classifiers.trees.j48.ModelSelection",
      "weka.core.AdditionalMeasureProducer",
      "weka.core.neighboursearch.balltrees.BallNode",
      "org.pentaho.packageManagement.PackageManager$1",
      "weka.attributeSelection.GreedyStepwise",
      "weka.core.Drawable",
      "weka.core.matrix.Matrix",
      "weka.classifiers.ConditionalDensityEstimator",
      "weka.core.CapabilitiesHandler",
      "weka.classifiers.trees.REPTree",
      "weka.attributeSelection.ASEvaluation",
      "weka.core.AbstractInstance",
      "weka.core.scripting.JythonObject",
      "weka.core.SelectedTag",
      "weka.classifiers.meta.FilteredClassifier",
      "weka.classifiers.functions.supportVector.RegOptimizer",
      "org.pentaho.packageManagement.DefaultPackage",
      "weka.classifiers.trees.j48.C45PruneableClassifierTree",
      "weka.classifiers.misc.InputMappedClassifier",
      "weka.classifiers.ParallelIteratedSingleClassifierEnhancer",
      "weka.clusterers.RandomizableClusterer",
      "weka.core.Version",
      "weka.attributeSelection.AttributeSelection",
      "weka.core.converters.AbstractLoader",
      "weka.filters.AllFilter",
      "weka.core.converters.BatchConverter",
      "weka.core.converters.ArffLoader$ArffReader",
      "weka.core.Tag",
      "weka.core.TechnicalInformationHandlerJavadoc",
      "weka.classifiers.IteratedSingleClassifierEnhancer",
      "weka.classifiers.trees.j48.BinC45ModelSelection",
      "weka.classifiers.AbstractClassifier",
      "weka.estimators.UnivariateDensityEstimator",
      "weka.core.converters.ArffLoader",
      "weka.filters.unsupervised.attribute.Center",
      "weka.core.OptionHandler",
      "weka.core.converters.MatlabLoader",
      "weka.core.WekaException",
      "weka.classifiers.trees.RandomForest",
      "weka.filters.supervised.attribute.AttributeSelection",
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
      "weka.attributeSelection.AttributeTransformer",
      "weka.core.tokenizers.WordTokenizer",
      "weka.classifiers.trees.j48.ClassifierTree",
      "weka.filters.unsupervised.attribute.ReplaceMissingValues",
      "weka.attributeSelection.PrincipalComponents",
      "weka.classifiers.trees.j48.PruneableClassifierTree",
      "weka.classifiers.Evaluation",
      "weka.classifiers.functions.supportVector.Kernel",
      "weka.attributeSelection.ASSearch",
      "weka.core.WekaPackageManager",
      "weka.filters.SupervisedFilter",
      "weka.core.TechnicalInformationHandler",
      "weka.core.converters.URLSourcedLoader",
      "weka.core.converters.FileSourcedConverter",
      "weka.attributeSelection.StartSetHandler",
      "weka.clusterers.Clusterer",
      "weka.classifiers.meta.CostSensitiveClassifier",
      "weka.core.tokenizers.CharacterDelimitedTokenizer",
      "weka.core.Option",
      "weka.filters.unsupervised.attribute.PotentialClassIgnorer",
      "weka.core.neighboursearch.PerformanceStats",
      "weka.filters.Sourcable",
      "weka.classifiers.meta.RandomSubSpace",
      "weka.core.Attribute",
      "weka.classifiers.meta.MultiScheme",
      "weka.classifiers.bayes.NaiveBayesMultinomialUpdateable",
      "weka.core.FastVector",
      "weka.estimators.UnivariateKernelEstimator",
      "weka.classifiers.MultipleClassifiersCombiner",
      "weka.core.xml.XMLDocument",
      "weka.core.UnassignedDatasetException",
      "weka.classifiers.functions.supportVector.RegSMOImproved",
      "weka.attributeSelection.RankedOutputSearch",
      "weka.classifiers.SingleClassifierEnhancer",
      "weka.core.RevisionUtils",
      "weka.core.Instance",
      "weka.core.converters.SerializedInstancesLoader",
      "weka.core.converters.Loader",
      "weka.classifiers.functions.supportVector.PolyKernel",
      "weka.classifiers.functions.supportVector.RegSMO",
      "weka.core.ProtectedProperties",
      "weka.classifiers.IntervalEstimator",
      "weka.core.StringLocator",
      "weka.core.Matchable",
      "weka.core.AttributeStats",
      "weka.core.WeightedInstancesHandler",
      "weka.classifiers.functions.GaussianProcesses",
      "weka.classifiers.trees.DecisionStump",
      "weka.estimators.UnivariateQuantileEstimator",
      "weka.core.TechnicalInformation$Field",
      "weka.filters.unsupervised.attribute.Remove",
      "weka.core.Randomizable",
      "weka.core.Javadoc",
      "weka.core.EuclideanDistance",
      "weka.classifiers.meta.AttributeSelectedClassifier",
      "weka.core.Instances",
      "weka.core.converters.AbstractFileLoader",
      "weka.classifiers.bayes.NaiveBayesMultinomial",
      "weka.filters.unsupervised.attribute.Normalize",
      "weka.core.converters.ConverterUtils$DataSink",
      "weka.core.UnassignedClassException",
      "weka.classifiers.rules.ZeroR",
      "weka.core.xml.XMLInstances",
      "weka.filters.unsupervised.attribute.Standardize",
      "weka.attributeSelection.UnsupervisedAttributeEvaluator",
      "weka.attributeSelection.Ranker",
      "weka.core.TechnicalInformation",
      "weka.core.UnsupportedAttributeTypeException",
      "weka.classifiers.Sourcable",
      "weka.core.RevisionHandler",
      "weka.classifiers.evaluation.output.prediction.PlainText",
      "weka.experiment.Stats",
      "weka.core.converters.ConverterUtils$DataSource",
      "weka.core.xml.XMLSerialization",
      "weka.classifiers.xml.XMLClassifier",
      "weka.filters.Filter",
      "weka.classifiers.RandomizableParallelIteratedSingleClassifierEnhancer",
      "weka.filters.supervised.attribute.Discretize"
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
      "weka.classifiers.AbstractClassifier",
      "weka.core.Tag",
      "weka.classifiers.functions.SMOreg",
      "weka.classifiers.functions.supportVector.RegOptimizer",
      "weka.classifiers.functions.supportVector.RegSMO",
      "weka.classifiers.functions.supportVector.RegSMOImproved",
      "weka.classifiers.functions.supportVector.Kernel",
      "weka.classifiers.functions.supportVector.CachedKernel",
      "weka.classifiers.functions.supportVector.PolyKernel",
      "weka.core.SelectedTag",
      "weka.core.TechnicalInformation",
      "weka.core.TechnicalInformation$Type",
      "weka.core.TechnicalInformation$Field",
      "weka.core.converters.AbstractLoader",
      "weka.core.converters.AbstractFileLoader",
      "weka.core.converters.MatlabLoader",
      "weka.classifiers.bayes.NaiveBayesMultinomial",
      "weka.core.Option",
      "weka.core.converters.ArffLoader",
      "weka.classifiers.evaluation.output.prediction.AbstractOutput",
      "weka.classifiers.evaluation.output.prediction.Null",
      "weka.core.AbstractInstance",
      "weka.core.DenseInstance",
      "weka.core.SparseInstance",
      "weka.core.BinarySparseInstance",
      "weka.core.UnassignedDatasetException",
      "weka.core.converters.JSONLoader",
      "weka.core.neighboursearch.NearestNeighbourSearch",
      "weka.core.neighboursearch.CoverTree",
      "weka.core.NormalizableDistance",
      "weka.core.EuclideanDistance",
      "weka.core.Range",
      "weka.core.Instances",
      "weka.classifiers.CostMatrix",
      "weka.core.converters.SerializedInstancesLoader",
      "weka.classifiers.bayes.NaiveBayesMultinomialText",
      "weka.core.tokenizers.Tokenizer",
      "weka.core.tokenizers.CharacterDelimitedTokenizer",
      "weka.core.tokenizers.WordTokenizer",
      "weka.core.stemmers.NullStemmer",
      "weka.core.converters.TextDirectoryLoader",
      "weka.core.Attribute",
      "weka.core.ProtectedProperties",
      "weka.core.Capabilities",
      "org.pentaho.packageManagement.PackageManager",
      "org.pentaho.packageManagement.DefaultPackageManager",
      "weka.core.Environment",
      "weka.core.WekaPackageManager",
      "weka.core.WekaException",
      "weka.core.UnsupportedAttributeTypeException",
      "weka.core.TestInstances",
      "weka.core.xml.XMLDocument",
      "weka.core.xml.XMLInstances",
      "weka.core.converters.XRFFLoader",
      "weka.core.WekaEnumeration",
      "weka.core.Attribute$1",
      "weka.core.converters.C45Loader",
      "weka.attributeSelection.ASEvaluation",
      "weka.attributeSelection.UnsupervisedAttributeEvaluator",
      "weka.attributeSelection.PrincipalComponents",
      "weka.core.converters.LibSVMLoader",
      "weka.classifiers.rules.ZeroR",
      "weka.core.converters.SVMLightLoader",
      "weka.clusterers.AbstractClusterer",
      "weka.clusterers.RandomizableClusterer",
      "weka.clusterers.SimpleKMeans",
      "weka.core.SerializedObject",
      "weka.core.converters.ConverterUtils$DataSource",
      "weka.gui.GenericPropertiesCreator",
      "weka.gui.GenericObjectEditor",
      "weka.core.converters.ConverterUtils",
      "weka.core.converters.DatabaseLoader",
      "weka.experiment.DatabaseUtils",
      "weka.core.converters.DatabaseConnection",
      "weka.classifiers.evaluation.output.prediction.HTML",
      "weka.core.converters.ArffLoader$ArffReader",
      "weka.classifiers.SingleClassifierEnhancer",
      "weka.classifiers.RandomizableSingleClassifierEnhancer",
      "weka.classifiers.meta.CostSensitiveClassifier",
      "weka.classifiers.trees.DecisionStump",
      "weka.filters.Filter",
      "weka.filters.AllFilter",
      "weka.clusterers.HierarchicalClusterer",
      "weka.clusterers.AbstractDensityBasedClusterer",
      "weka.clusterers.MakeDensityBasedClusterer",
      "weka.classifiers.bayes.BayesNet",
      "weka.classifiers.bayes.net.search.SearchAlgorithm",
      "weka.classifiers.bayes.net.search.local.LocalScoreSearchAlgorithm",
      "weka.classifiers.bayes.net.search.local.K2",
      "weka.classifiers.bayes.net.estimate.BayesNetEstimator",
      "weka.classifiers.bayes.net.estimate.SimpleEstimator",
      "weka.estimators.Estimator",
      "weka.estimators.MahalanobisEstimator",
      "weka.classifiers.rules.PART",
      "weka.core.RevisionUtils",
      "weka.classifiers.trees.RandomForest",
      "weka.classifiers.functions.SimpleLogistic",
      "weka.classifiers.meta.ClassificationViaRegression",
      "weka.classifiers.trees.m5.M5Base",
      "weka.classifiers.trees.M5P",
      "weka.classifiers.lazy.IBk",
      "weka.core.neighboursearch.LinearNNSearch",
      "weka.classifiers.misc.InputMappedClassifier",
      "weka.core.converters.CSVLoader",
      "weka.classifiers.functions.SimpleLinearRegression",
      "weka.core.neighboursearch.BallTree",
      "weka.core.neighboursearch.balltrees.BallTreeConstructor",
      "weka.core.neighboursearch.balltrees.TopDownConstructor",
      "weka.core.neighboursearch.balltrees.BallSplitter",
      "weka.core.neighboursearch.balltrees.PointsClosestToFurthestChildren",
      "weka.core.neighboursearch.NearestNeighbourSearch$MyHeap",
      "weka.core.neighboursearch.NearestNeighbourSearch$MyHeapElement",
      "weka.classifiers.rules.M5Rules",
      "weka.core.Javadoc",
      "weka.core.TechnicalInformationHandlerJavadoc",
      "weka.core.neighboursearch.balltrees.BottomUpConstructor",
      "weka.classifiers.bayes.NaiveBayesMultinomialUpdateable",
      "weka.classifiers.MultipleClassifiersCombiner",
      "weka.classifiers.ParallelMultipleClassifiersCombiner",
      "weka.classifiers.RandomizableParallelMultipleClassifiersCombiner",
      "weka.classifiers.meta.Stacking",
      "weka.classifiers.functions.GaussianProcesses",
      "weka.classifiers.functions.LinearRegression",
      "weka.classifiers.meta.AttributeSelectedClassifier",
      "weka.attributeSelection.CfsSubsetEval",
      "weka.attributeSelection.ASSearch",
      "weka.attributeSelection.BestFirst",
      "weka.classifiers.trees.J48",
      "weka.classifiers.IteratedSingleClassifierEnhancer",
      "weka.classifiers.ParallelIteratedSingleClassifierEnhancer",
      "weka.classifiers.RandomizableParallelIteratedSingleClassifierEnhancer",
      "weka.classifiers.meta.RandomCommittee",
      "weka.classifiers.trees.RandomTree",
      "weka.classifiers.rules.JRip",
      "weka.classifiers.RandomizableMultipleClassifiersCombiner",
      "weka.classifiers.meta.MultiScheme",
      "weka.classifiers.functions.MultilayerPerceptron",
      "weka.core.FastVector",
      "weka.filters.unsupervised.attribute.NominalToBinary",
      "weka.classifiers.functions.neural.SigmoidUnit",
      "weka.classifiers.functions.neural.LinearUnit",
      "weka.classifiers.evaluation.output.prediction.CSV",
      "weka.classifiers.meta.RandomSubSpace",
      "weka.classifiers.trees.REPTree",
      "weka.classifiers.meta.MultiClassClassifier",
      "weka.classifiers.functions.Logistic",
      "weka.classifiers.meta.FilteredClassifier",
      "weka.filters.supervised.attribute.AttributeSelection",
      "weka.attributeSelection.AttributeSelection",
      "weka.attributeSelection.GreedyStepwise",
      "weka.filters.supervised.attribute.Discretize",
      "weka.classifiers.RandomizableClassifier",
      "weka.classifiers.functions.SGD",
      "weka.attributeSelection.WrapperSubsetEval",
      "weka.classifiers.RandomizableIteratedSingleClassifierEnhancer",
      "weka.classifiers.meta.LogitBoost",
      "weka.classifiers.meta.CVParameterSelection",
      "weka.core.GlobalInfoJavadoc",
      "weka.core.neighboursearch.balltrees.BallNode",
      "weka.filters.SimpleFilter",
      "weka.filters.SimpleStreamFilter",
      "weka.filters.MultiFilter",
      "weka.classifiers.evaluation.output.prediction.XML",
      "weka.classifiers.bayes.NaiveBayes",
      "weka.classifiers.functions.SMO",
      "weka.core.AttributeStats",
      "weka.experiment.Stats",
      "weka.classifiers.bayes.NaiveBayesUpdateable",
      "weka.classifiers.trees.LMT",
      "weka.experiment.InstanceQuery",
      "weka.classifiers.rules.OneR",
      "weka.estimators.UnivariateKernelEstimator",
      "weka.classifiers.rules.part.MakeDecList",
      "weka.classifiers.functions.supportVector.NormalizedPolyKernel",
      "weka.classifiers.misc.SerializedClassifier",
      "weka.classifiers.meta.AdditiveRegression",
      "weka.classifiers.meta.RegressionByDiscretization",
      "weka.filters.unsupervised.attribute.PotentialClassIgnorer",
      "weka.filters.unsupervised.attribute.Discretize",
      "weka.core.neighboursearch.KDTree",
      "weka.core.neighboursearch.kdtrees.KDTreeNodeSplitter",
      "weka.core.neighboursearch.kdtrees.SlidingMidPointOfWidestSide",
      "weka.core.Capabilities$Capability"
    );
  }
}