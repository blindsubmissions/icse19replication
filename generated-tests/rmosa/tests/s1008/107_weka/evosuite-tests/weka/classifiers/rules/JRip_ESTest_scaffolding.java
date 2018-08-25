/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Aug 23 08:48:35 GMT 2018
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
      "org.pentaho.packageManagement.PackageConstraint",
      "weka.attributeSelection.AttributeEvaluator",
      "org.pentaho.packageManagement.Package",
      "weka.core.xml.XMLBasicSerialization",
      "weka.classifiers.rules.RuleStats",
      "weka.attributeSelection.SubsetEvaluator",
      "weka.classifiers.CostMatrix",
      "weka.filters.UnsupervisedFilter",
      "weka.core.logging.Logger$Level",
      "weka.classifiers.evaluation.output.prediction.AbstractOutput",
      "weka.classifiers.rules.JRip$NominalAntd",
      "weka.classifiers.rules.DecisionTable$DummySubsetEvaluator",
      "weka.filters.supervised.attribute.ClassOrder",
      "org.pentaho.packageManagement.DefaultPackageManager",
      "org.bounce.net.DefaultAuthenticator",
      "weka.filters.SimpleFilter",
      "weka.filters.SimpleStreamFilter",
      "weka.core.RelationalLocator",
      "weka.core.Utils",
      "weka.core.CustomDisplayStringProvider",
      "weka.classifiers.rules.Rule",
      "weka.core.NoSupportForMissingValuesException",
      "weka.classifiers.UpdateableClassifier",
      "weka.core.TechnicalInformation$Type",
      "weka.core.Copyable",
      "weka.core.Capabilities",
      "weka.core.BinarySparseInstance",
      "weka.core.AttributeLocator",
      "weka.core.SerializedObject",
      "weka.clusterers.UpdateableClusterer",
      "weka.attributeSelection.BestFirst",
      "weka.core.Summarizable",
      "weka.core.AdditionalMeasureProducer",
      "org.pentaho.packageManagement.PackageManager$1",
      "weka.core.CapabilitiesHandler",
      "weka.attributeSelection.ASEvaluation",
      "weka.core.AbstractInstance",
      "weka.core.SelectedTag",
      "org.pentaho.packageManagement.DefaultPackage",
      "weka.core.Version",
      "weka.core.Tag",
      "weka.classifiers.AbstractClassifier",
      "weka.filters.unsupervised.attribute.Center",
      "weka.core.OptionHandler",
      "weka.classifiers.rules.JRip",
      "weka.core.WekaException",
      "weka.filters.StreamableFilter",
      "weka.core.Range",
      "weka.core.Attribute$1",
      "weka.classifiers.Classifier",
      "weka.core.Capabilities$Capability",
      "weka.core.SparseInstance",
      "org.pentaho.packageManagement.PackageManager",
      "weka.core.WekaEnumeration",
      "weka.attributeSelection.AttributeTransformer",
      "weka.filters.unsupervised.attribute.ReplaceMissingValues",
      "weka.attributeSelection.PrincipalComponents",
      "weka.classifiers.Evaluation",
      "weka.attributeSelection.ASSearch",
      "weka.core.WekaPackageManager",
      "weka.filters.SupervisedFilter",
      "weka.core.TechnicalInformationHandler",
      "weka.attributeSelection.StartSetHandler",
      "weka.core.Option",
      "weka.filters.unsupervised.attribute.PotentialClassIgnorer",
      "weka.filters.Sourcable",
      "weka.core.Attribute",
      "weka.classifiers.rules.DecisionTable",
      "weka.core.FastVector",
      "weka.core.UnassignedDatasetException",
      "weka.core.RevisionUtils",
      "weka.core.Instance",
      "weka.core.ProtectedProperties",
      "weka.core.StringLocator",
      "weka.core.AttributeStats",
      "weka.filters.MultiFilter",
      "weka.core.WeightedInstancesHandler",
      "weka.core.TechnicalInformation$Field",
      "weka.classifiers.rules.JRip$NumericAntd",
      "weka.filters.unsupervised.attribute.Discretize",
      "weka.filters.unsupervised.attribute.Remove",
      "weka.core.Instances",
      "weka.core.UnassignedClassException",
      "weka.classifiers.rules.JRip$Antd",
      "weka.attributeSelection.UnsupervisedAttributeEvaluator",
      "weka.filters.unsupervised.attribute.Standardize",
      "weka.core.TechnicalInformation",
      "weka.core.UnsupportedAttributeTypeException",
      "weka.core.RevisionHandler",
      "weka.classifiers.evaluation.output.prediction.PlainText",
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
      "weka.core.Attribute",
      "weka.core.ProtectedProperties",
      "weka.core.RevisionUtils",
      "weka.core.AbstractInstance",
      "weka.core.SparseInstance",
      "weka.core.Capabilities",
      "org.pentaho.packageManagement.PackageManager",
      "org.pentaho.packageManagement.DefaultPackageManager",
      "weka.core.Version",
      "weka.core.Environment",
      "weka.core.WekaPackageManager",
      "weka.core.neighboursearch.NearestNeighbourSearch",
      "weka.core.neighboursearch.BallTree",
      "weka.core.NormalizableDistance",
      "weka.core.EuclideanDistance",
      "weka.core.Range",
      "weka.core.neighboursearch.balltrees.BallTreeConstructor",
      "weka.core.neighboursearch.balltrees.TopDownConstructor",
      "weka.core.neighboursearch.balltrees.BallSplitter",
      "weka.core.neighboursearch.balltrees.PointsClosestToFurthestChildren",
      "weka.core.DenseInstance",
      "weka.core.neighboursearch.NearestNeighbourSearch$MyHeap",
      "weka.core.neighboursearch.NearestNeighbourSearch$MyHeapElement",
      "weka.core.FastVector",
      "weka.core.Tag",
      "weka.classifiers.rules.DecisionTable",
      "weka.attributeSelection.ASSearch",
      "weka.attributeSelection.BestFirst",
      "weka.classifiers.CostMatrix",
      "weka.core.Instances",
      "weka.core.BinarySparseInstance",
      "weka.core.UnassignedDatasetException",
      "weka.attributeSelection.ASEvaluation",
      "weka.attributeSelection.UnsupervisedAttributeEvaluator",
      "weka.attributeSelection.PrincipalComponents",
      "weka.core.Option",
      "weka.core.TechnicalInformation",
      "weka.classifiers.Evaluation",
      "weka.core.WekaEnumeration",
      "weka.core.Attribute$1",
      "weka.core.neighboursearch.CoverTree",
      "weka.filters.Filter",
      "weka.filters.supervised.attribute.ClassOrder",
      "weka.core.SerializedObject",
      "weka.core.neighboursearch.KDTree",
      "weka.core.neighboursearch.kdtrees.KDTreeNodeSplitter",
      "weka.core.neighboursearch.kdtrees.SlidingMidPointOfWidestSide",
      "weka.classifiers.rules.RuleStats",
      "weka.classifiers.lazy.IBk",
      "weka.core.neighboursearch.LinearNNSearch",
      "weka.classifiers.MultipleClassifiersCombiner",
      "weka.classifiers.ParallelMultipleClassifiersCombiner",
      "weka.classifiers.RandomizableParallelMultipleClassifiersCombiner",
      "weka.classifiers.meta.Stacking",
      "weka.classifiers.rules.ZeroR",
      "weka.classifiers.SingleClassifierEnhancer",
      "weka.classifiers.misc.InputMappedClassifier",
      "weka.core.neighboursearch.balltrees.BallNode",
      "weka.classifiers.bayes.BayesNet",
      "weka.classifiers.bayes.net.search.SearchAlgorithm",
      "weka.classifiers.bayes.net.search.local.LocalScoreSearchAlgorithm",
      "weka.classifiers.bayes.net.search.local.K2",
      "weka.classifiers.bayes.net.estimate.BayesNetEstimator",
      "weka.classifiers.bayes.net.estimate.SimpleEstimator",
      "weka.core.converters.ArffLoader$ArffReader",
      "weka.filters.SimpleFilter",
      "weka.filters.SimpleStreamFilter",
      "weka.filters.MultiFilter",
      "weka.filters.AllFilter",
      "weka.core.UnassignedClassException",
      "weka.classifiers.RandomizableSingleClassifierEnhancer",
      "weka.classifiers.meta.MultiClassClassifier",
      "weka.classifiers.meta.MultiClassClassifierUpdateable",
      "weka.classifiers.functions.Logistic",
      "weka.classifiers.meta.CostSensitiveClassifier",
      "weka.core.WekaException",
      "weka.filters.unsupervised.attribute.Remove",
      "weka.core.neighboursearch.balltrees.BottomUpConstructor",
      "weka.core.SelectedTag",
      "weka.core.tokenizers.Tokenizer",
      "weka.core.tokenizers.AlphabeticTokenizer",
      "weka.classifiers.bayes.NaiveBayes",
      "weka.classifiers.trees.RandomTree",
      "weka.core.neighboursearch.balltrees.MiddleOutConstructor",
      "weka.classifiers.functions.GaussianProcesses",
      "weka.classifiers.functions.supportVector.Kernel",
      "weka.classifiers.functions.supportVector.CachedKernel",
      "weka.classifiers.functions.supportVector.PolyKernel",
      "weka.classifiers.RandomizableClassifier",
      "weka.classifiers.functions.SGDText",
      "weka.core.tokenizers.CharacterDelimitedTokenizer",
      "weka.core.tokenizers.WordTokenizer",
      "weka.core.stemmers.NullStemmer",
      "weka.classifiers.meta.FilteredClassifier",
      "weka.filters.supervised.attribute.AttributeSelection",
      "weka.attributeSelection.AttributeSelection",
      "weka.attributeSelection.CfsSubsetEval",
      "weka.attributeSelection.GreedyStepwise",
      "weka.classifiers.trees.J48",
      "weka.filters.supervised.attribute.Discretize",
      "weka.classifiers.misc.SerializedClassifier",
      "weka.core.tokenizers.NGramTokenizer",
      "weka.estimators.Estimator",
      "weka.estimators.PoissonEstimator",
      "weka.estimators.KernelEstimator",
      "weka.estimators.DiscreteEstimator",
      "weka.estimators.NormalEstimator",
      "weka.core.AttributeStats",
      "weka.core.neighboursearch.PerformanceStats",
      "weka.classifiers.IteratedSingleClassifierEnhancer",
      "weka.classifiers.meta.AdditiveRegression",
      "weka.classifiers.trees.DecisionStump",
      "weka.classifiers.trees.REPTree",
      "weka.core.UnsupportedAttributeTypeException",
      "weka.classifiers.bayes.NaiveBayesMultinomial",
      "weka.classifiers.trees.m5.M5Base",
      "weka.classifiers.rules.M5Rules",
      "weka.classifiers.functions.MultilayerPerceptron",
      "weka.filters.unsupervised.attribute.NominalToBinary",
      "weka.classifiers.functions.neural.SigmoidUnit",
      "weka.classifiers.functions.neural.LinearUnit",
      "weka.classifiers.trees.M5P",
      "weka.core.converters.ConverterUtils$DataSource",
      "weka.core.converters.AbstractLoader",
      "weka.core.converters.AbstractFileLoader",
      "weka.core.converters.ArffLoader",
      "weka.gui.GenericPropertiesCreator",
      "weka.gui.GenericObjectEditor",
      "weka.core.converters.ConverterUtils",
      "weka.attributeSelection.WrapperSubsetEval",
      "weka.attributeSelection.InfoGainAttributeEval",
      "weka.core.ChebyshevDistance",
      "weka.classifiers.functions.supportVector.PrecomputedKernelMatrixKernel",
      "weka.classifiers.lazy.KStar",
      "weka.classifiers.rules.PART",
      "weka.classifiers.meta.AttributeSelectedClassifier",
      "weka.attributeSelection.SymmetricalUncertAttributeEval",
      "weka.classifiers.rules.DecisionTable$DummySubsetEvaluator",
      "weka.classifiers.bayes.net.BIFReader",
      "weka.classifiers.RandomizableMultipleClassifiersCombiner",
      "weka.classifiers.meta.MultiScheme",
      "weka.attributeSelection.ReliefFAttributeEval",
      "weka.classifiers.functions.SimpleLinearRegression"
    );
  }
}