/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Aug 23 06:19:59 GMT 2018
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
      "weka.core.DistanceFunction",
      "org.pentaho.packageManagement.PackageConstraint",
      "org.pentaho.packageManagement.Package",
      "weka.core.xml.XMLBasicSerialization",
      "weka.classifiers.rules.RuleStats",
      "weka.attributeSelection.SubsetEvaluator",
      "weka.filters.UnsupervisedFilter",
      "weka.core.logging.Logger$Level",
      "weka.classifiers.evaluation.output.prediction.AbstractOutput",
      "weka.core.DenseInstance",
      "weka.classifiers.rules.JRip$NominalAntd",
      "weka.classifiers.rules.DecisionTable$DummySubsetEvaluator",
      "weka.filters.supervised.attribute.ClassOrder",
      "org.pentaho.packageManagement.DefaultPackageManager",
      "org.bounce.net.DefaultAuthenticator",
      "weka.core.RelationalLocator",
      "weka.core.Utils",
      "weka.core.CustomDisplayStringProvider",
      "weka.classifiers.rules.Rule",
      "weka.core.NoSupportForMissingValuesException",
      "weka.classifiers.UpdateableClassifier",
      "weka.classifiers.ParallelMultipleClassifiersCombiner",
      "weka.core.TechnicalInformation$Type",
      "weka.core.Copyable",
      "weka.core.Capabilities",
      "weka.core.AttributeLocator",
      "weka.core.BinarySparseInstance",
      "weka.core.SerializedObject",
      "weka.clusterers.UpdateableClusterer",
      "weka.attributeSelection.BestFirst",
      "weka.core.Summarizable",
      "weka.core.AdditionalMeasureProducer",
      "weka.core.neighboursearch.balltrees.BallNode",
      "org.pentaho.packageManagement.PackageManager$1",
      "weka.core.CapabilitiesHandler",
      "weka.attributeSelection.ASEvaluation",
      "weka.core.AbstractInstance",
      "weka.core.scripting.JythonObject",
      "weka.core.SelectedTag",
      "org.pentaho.packageManagement.DefaultPackage",
      "weka.core.Version",
      "weka.core.Tag",
      "weka.classifiers.AbstractClassifier",
      "weka.classifiers.meta.Stacking",
      "weka.core.OptionHandler",
      "weka.classifiers.rules.JRip",
      "weka.core.WekaException",
      "weka.filters.StreamableFilter",
      "weka.core.Range",
      "weka.core.scripting.JythonSerializableObject",
      "weka.classifiers.Classifier",
      "weka.core.Capabilities$Capability",
      "weka.core.SparseInstance",
      "org.pentaho.packageManagement.PackageManager",
      "weka.core.WekaEnumeration",
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
      "weka.classifiers.MultipleClassifiersCombiner",
      "weka.core.UnassignedDatasetException",
      "weka.core.RevisionUtils",
      "weka.core.Instance",
      "weka.core.ProtectedProperties",
      "weka.core.StringLocator",
      "weka.core.AttributeStats",
      "weka.core.WeightedInstancesHandler",
      "weka.core.TechnicalInformation$Field",
      "weka.classifiers.rules.JRip$NumericAntd",
      "weka.filters.unsupervised.attribute.Discretize",
      "weka.filters.unsupervised.attribute.Remove",
      "weka.core.Randomizable",
      "weka.core.Instances",
      "weka.classifiers.RandomizableParallelMultipleClassifiersCombiner",
      "weka.core.UnassignedClassException",
      "weka.classifiers.rules.ZeroR",
      "weka.classifiers.rules.JRip$Antd",
      "weka.core.TechnicalInformation",
      "weka.core.UnsupportedAttributeTypeException",
      "weka.classifiers.Sourcable",
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
      "weka.core.FastVector",
      "weka.classifiers.SingleClassifierEnhancer",
      "weka.classifiers.misc.InputMappedClassifier",
      "weka.classifiers.rules.ZeroR",
      "weka.core.AbstractInstance",
      "weka.core.DenseInstance",
      "weka.core.ProtectedProperties",
      "weka.core.Attribute",
      "weka.classifiers.CostMatrix",
      "weka.core.RevisionUtils",
      "weka.classifiers.bayes.BayesNet",
      "weka.classifiers.bayes.net.search.SearchAlgorithm",
      "weka.core.Tag",
      "weka.classifiers.bayes.net.search.local.LocalScoreSearchAlgorithm",
      "weka.classifiers.bayes.net.search.local.K2",
      "weka.classifiers.bayes.net.estimate.BayesNetEstimator",
      "weka.classifiers.bayes.net.estimate.SimpleEstimator",
      "weka.core.TechnicalInformation",
      "weka.core.SparseInstance",
      "weka.classifiers.rules.DecisionTable",
      "weka.attributeSelection.ASSearch",
      "weka.attributeSelection.BestFirst",
      "weka.core.Range",
      "weka.core.BinarySparseInstance",
      "weka.core.UnassignedDatasetException",
      "weka.core.Capabilities",
      "org.pentaho.packageManagement.PackageManager",
      "org.pentaho.packageManagement.DefaultPackageManager",
      "weka.core.Version",
      "weka.core.Environment",
      "weka.core.WekaPackageManager",
      "weka.classifiers.RandomizableSingleClassifierEnhancer",
      "weka.classifiers.meta.CostSensitiveClassifier",
      "weka.core.WekaEnumeration",
      "weka.core.Attribute$1",
      "weka.filters.Filter",
      "weka.filters.supervised.attribute.ClassOrder",
      "weka.core.Instances",
      "weka.core.converters.ArffLoader$ArffReader",
      "weka.core.neighboursearch.NearestNeighbourSearch",
      "weka.core.neighboursearch.BallTree",
      "weka.core.NormalizableDistance",
      "weka.core.EuclideanDistance",
      "weka.core.neighboursearch.balltrees.BallTreeConstructor",
      "weka.core.neighboursearch.balltrees.TopDownConstructor",
      "weka.core.neighboursearch.balltrees.BallSplitter",
      "weka.core.neighboursearch.balltrees.PointsClosestToFurthestChildren",
      "weka.core.neighboursearch.NearestNeighbourSearch$MyHeap",
      "weka.core.neighboursearch.NearestNeighbourSearch$MyHeapElement",
      "weka.core.SerializedObject",
      "weka.attributeSelection.ASEvaluation",
      "weka.attributeSelection.UnsupervisedAttributeEvaluator",
      "weka.attributeSelection.PrincipalComponents",
      "weka.core.neighboursearch.balltrees.BallNode",
      "weka.core.Option",
      "weka.classifiers.lazy.IBk",
      "weka.core.neighboursearch.LinearNNSearch",
      "weka.classifiers.rules.RuleStats",
      "weka.classifiers.Evaluation",
      "weka.filters.unsupervised.attribute.Remove",
      "weka.core.SelectedTag",
      "weka.core.neighboursearch.CoverTree",
      "weka.core.WekaException",
      "weka.core.neighboursearch.KDTree",
      "weka.core.neighboursearch.kdtrees.KDTreeNodeSplitter",
      "weka.core.neighboursearch.kdtrees.SlidingMidPointOfWidestSide",
      "weka.classifiers.meta.AttributeSelectedClassifier",
      "weka.attributeSelection.CfsSubsetEval",
      "weka.classifiers.trees.J48",
      "weka.filters.SimpleFilter",
      "weka.filters.SimpleStreamFilter",
      "weka.filters.MultiFilter",
      "weka.filters.AllFilter",
      "weka.classifiers.bayes.NaiveBayesMultinomial",
      "weka.classifiers.bayes.NaiveBayesMultinomialUpdateable",
      "weka.core.UnassignedClassException",
      "weka.classifiers.meta.FilteredClassifier",
      "weka.filters.supervised.attribute.AttributeSelection",
      "weka.attributeSelection.AttributeSelection",
      "weka.attributeSelection.GreedyStepwise",
      "weka.filters.supervised.attribute.Discretize",
      "weka.core.neighboursearch.balltrees.BottomUpConstructor",
      "weka.core.UnsupportedAttributeTypeException",
      "weka.core.tokenizers.Tokenizer",
      "weka.core.tokenizers.AlphabeticTokenizer",
      "weka.core.neighboursearch.balltrees.MiddleOutConstructor",
      "weka.classifiers.RandomizableClassifier",
      "weka.classifiers.functions.SGDText",
      "weka.core.tokenizers.CharacterDelimitedTokenizer",
      "weka.core.tokenizers.WordTokenizer",
      "weka.core.stemmers.NullStemmer",
      "weka.core.tokenizers.NGramTokenizer",
      "weka.classifiers.meta.MultiClassClassifier",
      "weka.classifiers.functions.Logistic",
      "weka.core.converters.ConverterUtils$DataSource",
      "weka.core.converters.AbstractLoader",
      "weka.core.converters.AbstractFileLoader",
      "weka.core.converters.ArffLoader",
      "weka.classifiers.functions.VotedPerceptron",
      "weka.attributeSelection.Ranker",
      "weka.classifiers.MultipleClassifiersCombiner",
      "weka.classifiers.ParallelMultipleClassifiersCombiner",
      "weka.classifiers.RandomizableParallelMultipleClassifiersCombiner",
      "weka.classifiers.meta.Stacking",
      "weka.classifiers.trees.RandomForest",
      "weka.classifiers.functions.GaussianProcesses",
      "weka.classifiers.functions.supportVector.Kernel",
      "weka.classifiers.functions.supportVector.CachedKernel",
      "weka.classifiers.functions.supportVector.PolyKernel",
      "weka.classifiers.functions.SMO",
      "weka.classifiers.functions.LinearRegression",
      "weka.classifiers.meta.MultiClassClassifierUpdateable",
      "weka.classifiers.meta.CVParameterSelection",
      "weka.attributeSelection.GainRatioAttributeEval",
      "weka.classifiers.IteratedSingleClassifierEnhancer",
      "weka.classifiers.meta.AdditiveRegression",
      "weka.classifiers.trees.DecisionStump",
      "weka.classifiers.ParallelIteratedSingleClassifierEnhancer",
      "weka.classifiers.RandomizableParallelIteratedSingleClassifierEnhancer",
      "weka.classifiers.meta.RandomSubSpace",
      "weka.classifiers.trees.REPTree",
      "weka.classifiers.bayes.NaiveBayesMultinomialText",
      "weka.classifiers.meta.RegressionByDiscretization",
      "weka.filters.unsupervised.attribute.PotentialClassIgnorer",
      "weka.filters.unsupervised.attribute.Discretize",
      "weka.classifiers.RandomizableMultipleClassifiersCombiner",
      "weka.classifiers.meta.Vote",
      "weka.core.AttributeStats",
      "weka.attributeSelection.OneRAttributeEval",
      "weka.core.ChebyshevDistance",
      "weka.experiment.Stats",
      "weka.classifiers.lazy.LWL",
      "weka.classifiers.misc.SerializedClassifier",
      "weka.classifiers.RandomizableIteratedSingleClassifierEnhancer",
      "weka.classifiers.meta.LogitBoost",
      "weka.classifiers.meta.MultiScheme",
      "weka.attributeSelection.WrapperSubsetEval",
      "weka.classifiers.bayes.NaiveBayes",
      "weka.classifiers.trees.m5.M5Base",
      "weka.classifiers.rules.M5Rules",
      "weka.classifiers.functions.SGD"
    );
  }
}
