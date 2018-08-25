/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Aug 07 13:52:34 GMT 2018
 */

package weka.classifiers.trees;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class DecisionStump_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "weka.classifiers.trees.DecisionStump"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(DecisionStump_ESTest_scaffolding.class.getClassLoader() ,
      "weka.core.Environment",
      "weka.classifiers.trees.j48.BinC45ModelSelection",
      "weka.classifiers.AbstractClassifier",
      "org.pentaho.packageManagement.PackageConstraint",
      "org.pentaho.packageManagement.Package",
      "weka.core.OptionHandler",
      "weka.core.xml.XMLBasicSerialization",
      "weka.core.WekaException",
      "weka.classifiers.CostMatrix",
      "weka.core.logging.Logger$Level",
      "weka.core.PartitionGenerator",
      "weka.classifiers.Classifier",
      "weka.classifiers.evaluation.output.prediction.AbstractOutput",
      "weka.core.Capabilities$Capability",
      "weka.core.SparseInstance",
      "org.pentaho.packageManagement.PackageManager",
      "weka.classifiers.trees.J48",
      "weka.classifiers.trees.j48.ClassifierTree",
      "weka.classifiers.RandomizableSingleClassifierEnhancer",
      "org.pentaho.packageManagement.DefaultPackageManager",
      "weka.classifiers.trees.j48.PruneableClassifierTree",
      "weka.classifiers.Evaluation",
      "weka.core.WekaPackageManager",
      "org.bounce.net.DefaultAuthenticator",
      "weka.core.TechnicalInformationHandler",
      "weka.classifiers.meta.CostSensitiveClassifier",
      "weka.core.Option",
      "weka.classifiers.trees.j48.C45ModelSelection",
      "weka.core.Utils",
      "weka.core.Attribute",
      "weka.core.NoSupportForMissingValuesException",
      "weka.classifiers.UpdateableClassifier",
      "weka.core.Copyable",
      "weka.core.Capabilities",
      "weka.core.UnassignedDatasetException",
      "weka.clusterers.UpdateableClusterer",
      "weka.core.Summarizable",
      "weka.classifiers.trees.j48.ModelSelection",
      "weka.classifiers.SingleClassifierEnhancer",
      "weka.core.RevisionUtils",
      "weka.core.AdditionalMeasureProducer",
      "org.pentaho.packageManagement.PackageManager$1",
      "weka.core.Instance",
      "weka.core.ProtectedProperties",
      "weka.core.Drawable",
      "weka.core.Matchable",
      "weka.core.AttributeStats",
      "weka.core.WeightedInstancesHandler",
      "weka.core.CapabilitiesHandler",
      "weka.classifiers.trees.DecisionStump",
      "weka.core.Randomizable",
      "weka.core.AbstractInstance",
      "weka.core.Instances",
      "weka.core.SelectedTag",
      "org.pentaho.packageManagement.DefaultPackage",
      "weka.classifiers.trees.j48.C45PruneableClassifierTree",
      "weka.core.UnassignedClassException",
      "weka.classifiers.rules.ZeroR",
      "weka.core.Version",
      "weka.core.UnsupportedAttributeTypeException",
      "weka.core.TechnicalInformation",
      "weka.classifiers.Sourcable",
      "weka.core.RevisionHandler",
      "weka.classifiers.evaluation.output.prediction.PlainText",
      "weka.core.xml.XMLSerialization",
      "weka.classifiers.xml.XMLClassifier",
      "weka.core.Tag"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(DecisionStump_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "weka.classifiers.AbstractClassifier",
      "weka.classifiers.trees.DecisionStump",
      "weka.core.Capabilities$Capability",
      "weka.core.Utils",
      "weka.core.ContingencyTables",
      "weka.core.AbstractInstance",
      "weka.core.SparseInstance",
      "weka.core.BinarySparseInstance",
      "weka.core.UnassignedDatasetException",
      "weka.classifiers.Evaluation",
      "weka.core.Option",
      "weka.core.Capabilities",
      "org.pentaho.packageManagement.PackageManager",
      "org.pentaho.packageManagement.DefaultPackageManager",
      "weka.core.Version",
      "weka.core.Environment",
      "weka.core.WekaPackageManager",
      "weka.core.RevisionUtils",
      "weka.filters.Filter",
      "weka.filters.AllFilter",
      "weka.classifiers.SingleClassifierEnhancer",
      "weka.classifiers.RandomizableSingleClassifierEnhancer",
      "weka.core.Tag",
      "weka.classifiers.meta.CostSensitiveClassifier",
      "weka.classifiers.rules.ZeroR",
      "weka.classifiers.CostMatrix",
      "weka.classifiers.trees.REPTree",
      "weka.classifiers.bayes.BayesNet",
      "weka.classifiers.bayes.net.search.SearchAlgorithm",
      "weka.classifiers.bayes.net.search.local.LocalScoreSearchAlgorithm",
      "weka.classifiers.bayes.net.search.local.K2",
      "weka.classifiers.bayes.net.estimate.BayesNetEstimator",
      "weka.classifiers.bayes.net.estimate.SimpleEstimator",
      "weka.core.neighboursearch.balltrees.BallNode",
      "weka.filters.unsupervised.attribute.PotentialClassIgnorer",
      "weka.filters.unsupervised.attribute.ReplaceMissingValues",
      "weka.classifiers.lazy.LWL",
      "weka.core.neighboursearch.NearestNeighbourSearch",
      "weka.core.neighboursearch.LinearNNSearch",
      "weka.core.NormalizableDistance",
      "weka.core.EuclideanDistance",
      "weka.core.Range",
      "weka.core.ProtectedProperties",
      "weka.core.Attribute",
      "weka.classifiers.misc.InputMappedClassifier",
      "weka.classifiers.lazy.IBk",
      "weka.attributeSelection.ASEvaluation",
      "weka.attributeSelection.UnsupervisedAttributeEvaluator",
      "weka.attributeSelection.PrincipalComponents",
      "weka.core.Instances",
      "weka.core.converters.ArffLoader$ArffReader",
      "weka.core.neighboursearch.CoverTree",
      "weka.core.SerializedObject",
      "weka.core.DenseInstance",
      "weka.classifiers.functions.LinearRegression",
      "weka.core.SelectedTag",
      "weka.core.TechnicalInformation",
      "weka.core.TechnicalInformation$Type",
      "weka.core.TechnicalInformation$Field",
      "weka.core.neighboursearch.BallTree",
      "weka.core.neighboursearch.balltrees.BallTreeConstructor",
      "weka.core.neighboursearch.balltrees.TopDownConstructor",
      "weka.core.neighboursearch.balltrees.BallSplitter",
      "weka.core.neighboursearch.balltrees.PointsClosestToFurthestChildren",
      "weka.classifiers.trees.LMT",
      "weka.classifiers.trees.RandomTree",
      "weka.core.WekaException",
      "weka.classifiers.bayes.NaiveBayes",
      "weka.classifiers.bayes.NaiveBayesUpdateable",
      "weka.core.neighboursearch.NearestNeighbourSearch$MyHeap",
      "weka.core.neighboursearch.NearestNeighbourSearch$MyHeapElement",
      "weka.classifiers.meta.RegressionByDiscretization",
      "weka.filters.unsupervised.attribute.Discretize",
      "weka.classifiers.trees.J48",
      "weka.classifiers.RandomizableClassifier",
      "weka.classifiers.functions.SGDText",
      "weka.core.tokenizers.Tokenizer",
      "weka.core.tokenizers.CharacterDelimitedTokenizer",
      "weka.core.tokenizers.WordTokenizer",
      "weka.core.stemmers.NullStemmer",
      "weka.classifiers.trees.REPTree$Tree",
      "weka.core.neighboursearch.KDTree",
      "weka.core.neighboursearch.kdtrees.KDTreeNodeSplitter",
      "weka.core.neighboursearch.kdtrees.SlidingMidPointOfWidestSide",
      "weka.filters.SimpleFilter",
      "weka.filters.SimpleStreamFilter",
      "weka.filters.MultiFilter",
      "weka.classifiers.MultipleClassifiersCombiner",
      "weka.classifiers.RandomizableMultipleClassifiersCombiner",
      "weka.classifiers.meta.MultiScheme",
      "weka.classifiers.functions.SGD",
      "weka.classifiers.meta.FilteredClassifier",
      "weka.filters.supervised.attribute.AttributeSelection",
      "weka.attributeSelection.AttributeSelection",
      "weka.attributeSelection.CfsSubsetEval",
      "weka.attributeSelection.ASSearch",
      "weka.attributeSelection.GreedyStepwise",
      "weka.attributeSelection.BestFirst",
      "weka.filters.supervised.attribute.Discretize",
      "weka.classifiers.rules.PART",
      "weka.classifiers.functions.SMOreg",
      "weka.classifiers.functions.supportVector.RegOptimizer",
      "weka.classifiers.functions.supportVector.RegSMO",
      "weka.classifiers.functions.supportVector.RegSMOImproved",
      "weka.classifiers.functions.supportVector.Kernel",
      "weka.classifiers.functions.supportVector.CachedKernel",
      "weka.classifiers.functions.supportVector.PolyKernel",
      "weka.core.WekaEnumeration",
      "weka.core.Attribute$1",
      "weka.filters.supervised.attribute.NominalToBinary",
      "weka.classifiers.functions.Logistic",
      "weka.classifiers.misc.SerializedClassifier",
      "weka.classifiers.rules.OneR",
      "weka.classifiers.IteratedSingleClassifierEnhancer",
      "weka.classifiers.meta.AdditiveRegression",
      "weka.classifiers.trees.m5.M5Base",
      "weka.classifiers.rules.M5Rules",
      "weka.classifiers.meta.CVParameterSelection",
      "weka.core.FastVector",
      "weka.core.UnassignedClassException",
      "weka.classifiers.meta.MultiClassClassifier",
      "weka.classifiers.functions.SimpleLinearRegression",
      "weka.classifiers.ParallelMultipleClassifiersCombiner",
      "weka.classifiers.RandomizableParallelMultipleClassifiersCombiner",
      "weka.classifiers.meta.Stacking",
      "weka.core.neighboursearch.balltrees.BottomUpConstructor",
      "weka.classifiers.RandomizableIteratedSingleClassifierEnhancer",
      "weka.classifiers.meta.LogitBoost",
      "weka.classifiers.bayes.NaiveBayesMultinomialText",
      "weka.classifiers.trees.RandomForest",
      "weka.classifiers.meta.Vote",
      "weka.classifiers.functions.VotedPerceptron",
      "weka.classifiers.ParallelIteratedSingleClassifierEnhancer",
      "weka.classifiers.RandomizableParallelIteratedSingleClassifierEnhancer",
      "weka.classifiers.meta.RandomCommittee",
      "weka.classifiers.meta.RandomSubSpace",
      "weka.core.matrix.SingularValueDecomposition",
      "weka.classifiers.meta.ClassificationViaRegression",
      "weka.classifiers.trees.M5P",
      "weka.classifiers.rules.JRip",
      "weka.classifiers.functions.SMO",
      "weka.classifiers.meta.AdaBoostM1",
      "weka.classifiers.lazy.KStar",
      "weka.classifiers.functions.SimpleLogistic",
      "weka.classifiers.meta.MultiClassClassifierUpdateable",
      "weka.classifiers.meta.Bagging",
      "weka.classifiers.functions.GaussianProcesses",
      "weka.classifiers.rules.DecisionTable",
      "weka.classifiers.bayes.NaiveBayesMultinomial",
      "weka.core.neighboursearch.balltrees.MiddleOutConstructor",
      "weka.core.neighboursearch.PerformanceStats",
      "weka.attributeSelection.WrapperSubsetEval",
      "weka.attributeSelection.OneRAttributeEval",
      "weka.classifiers.bayes.NaiveBayesMultinomialUpdateable",
      "weka.classifiers.meta.AttributeSelectedClassifier",
      "weka.classifiers.trees.j48.ClassifierTree",
      "weka.classifiers.trees.j48.C45PruneableClassifierTree"
    );
  }
}
