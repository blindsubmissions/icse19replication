/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Aug 07 13:53:34 GMT 2018
 */

package weka.gui.beans;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class Saver_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "weka.gui.beans.Saver"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Saver_ESTest_scaffolding.class.getClassLoader() ,
      "weka.core.Environment",
      "weka.gui.beans.InstanceEvent",
      "weka.core.TestInstances",
      "weka.gui.beans.TestSetProducer",
      "weka.gui.beans.AbstractDataSource",
      "weka.core.converters.TextDirectoryLoader",
      "weka.core.converters.Saver",
      "org.pentaho.packageManagement.Package",
      "weka.core.converters.AbstractFileSaver",
      "weka.gui.beans.TextEvent",
      "weka.gui.beans.LogWriter",
      "weka.gui.beans.TestSetListener",
      "weka.filters.UnsupervisedFilter",
      "weka.gui.beans.Filter$1",
      "weka.gui.beans.DataSourceListener",
      "weka.gui.beans.Filter$2",
      "weka.core.DenseInstance",
      "weka.core.converters.DatabaseConverter",
      "weka.gui.beans.SubstringReplacer",
      "weka.core.converters.IncrementalConverter",
      "org.pentaho.packageManagement.DefaultPackageManager",
      "weka.gui.beans.Saver",
      "weka.gui.beans.WekaWrapper",
      "weka.gui.beans.KnowledgeFlowApp$BeanLayout",
      "org.bounce.net.DefaultAuthenticator",
      "weka.gui.beans.TestSetEvent",
      "weka.filters.unsupervised.attribute.Add",
      "weka.core.converters.JSONLoader",
      "weka.associations.Apriori",
      "weka.gui.beans.BatchAssociationRulesListener",
      "weka.gui.beans.Sorter",
      "weka.core.EnvironmentHandler",
      "weka.core.RelationalLocator",
      "weka.core.Utils",
      "weka.core.CustomDisplayStringProvider",
      "weka.gui.beans.GraphEvent",
      "weka.gui.beans.KnowledgeFlowApp$MainKFPerspective",
      "weka.core.NoSupportForMissingValuesException",
      "weka.classifiers.UpdateableClassifier",
      "weka.gui.visualize.PlotData2D",
      "weka.core.TechnicalInformation$Type",
      "weka.gui.beans.BeanVisual",
      "weka.gui.beans.KFStep",
      "weka.core.Copyable",
      "weka.core.Capabilities",
      "weka.gui.beans.AbstractDataSink",
      "weka.core.AttributeLocator",
      "weka.core.converters.SVMLightLoader",
      "weka.gui.beans.KnowledgeFlowApp$20",
      "weka.gui.beans.GraphListener",
      "weka.gui.beans.KnowledgeFlowApp$KFPerspective",
      "weka.core.SerializedObject",
      "weka.clusterers.UpdateableClusterer",
      "weka.gui.beans.BeanCustomizer$ModifyListener",
      "org.pentaho.packageManagement.PackageManager$1",
      "weka.core.converters.AbstractSaver",
      "weka.associations.AssociationRules",
      "weka.gui.beans.InstanceListener",
      "weka.gui.beans.BatchAssociationRulesEvent",
      "weka.gui.beans.Associator$1",
      "weka.core.SingleIndex",
      "weka.gui.beans.Sorter$InstanceHolder",
      "weka.core.CapabilitiesHandler",
      "weka.gui.beans.ThresholdDataEvent",
      "weka.associations.Associator",
      "weka.core.AbstractInstance",
      "weka.gui.beans.KnowledgeFlowApp$34",
      "weka.core.scripting.JythonObject",
      "weka.core.SelectedTag",
      "weka.gui.beans.StructureProducer",
      "org.pentaho.packageManagement.DefaultPackage",
      "weka.core.converters.JSONSaver",
      "weka.experiment.ResultProducer",
      "weka.core.Version",
      "weka.core.converters.AbstractLoader",
      "weka.gui.beans.DataSource",
      "weka.filters.AllFilter",
      "weka.gui.Logger",
      "weka.gui.beans.Saver$SaveBatchThread",
      "weka.core.converters.BatchConverter",
      "weka.gui.beans.Startable",
      "weka.core.Tag",
      "weka.gui.beans.ThresholdDataListener",
      "weka.gui.beans.BeanCommon",
      "weka.gui.beans.ConfigurationListener",
      "weka.gui.visualize.PrintableHandler",
      "weka.core.converters.ArffLoader",
      "weka.core.OptionHandler",
      "weka.gui.beans.Sorter$1",
      "weka.core.WekaException",
      "weka.filters.StreamableFilter",
      "weka.gui.beans.Visible",
      "weka.core.converters.SVMLightSaver",
      "weka.core.Attribute$1",
      "weka.core.scripting.JythonSerializableObject",
      "weka.gui.beans.ConfigurationProducer",
      "weka.core.Capabilities$Capability",
      "org.pentaho.packageManagement.PackageManager",
      "weka.associations.CARuleMiner",
      "weka.core.WekaEnumeration",
      "weka.core.WekaPackageManager",
      "weka.gui.beans.FlowByExpression$BracketNode",
      "weka.gui.beans.UserRequestAcceptor",
      "weka.gui.beans.Sorter$SortComparator",
      "weka.gui.beans.KnowledgeFlowApp",
      "weka.core.TechnicalInformationHandler",
      "weka.experiment.DatabaseUtils",
      "weka.gui.beans.KnowledgeFlowApp$InvisibleNode",
      "weka.core.converters.FileSourcedConverter",
      "weka.core.converters.URLSourcedLoader",
      "weka.gui.ExtensionFileFilter",
      "weka.core.converters.ArffSaver",
      "weka.filters.Sourcable",
      "weka.core.Attribute",
      "weka.core.converters.DatabaseSaver",
      "weka.gui.beans.TrainingSetListener",
      "weka.core.FastVector",
      "weka.core.Memory",
      "weka.core.UnassignedDatasetException",
      "weka.gui.visualize.PrintablePanel",
      "weka.gui.beans.FlowByExpression",
      "weka.core.Instance",
      "weka.gui.beans.EventConstraints",
      "weka.gui.beans.FlowByExpression$ExpressionNode",
      "weka.core.converters.Loader",
      "weka.core.ProtectedProperties",
      "weka.gui.beans.TrainingSetEvent",
      "weka.core.StringLocator",
      "weka.core.AttributeStats",
      "weka.core.GlobalInfoJavadoc",
      "weka.gui.beans.Filter",
      "weka.gui.beans.DataSink",
      "weka.core.TechnicalInformation$Field",
      "weka.gui.beans.Associator",
      "weka.associations.AssociationRulesProducer",
      "weka.filters.unsupervised.attribute.Remove",
      "weka.core.Javadoc",
      "weka.core.Instances",
      "weka.gui.beans.DataSetEvent",
      "weka.core.converters.AbstractFileLoader",
      "weka.core.UnassignedClassException",
      "weka.gui.beans.Loader$LoadThread",
      "weka.gui.beans.Loader",
      "weka.core.converters.DatabaseConnection",
      "weka.core.TechnicalInformation",
      "weka.core.UnsupportedAttributeTypeException",
      "weka.gui.beans.TrainingSetProducer",
      "weka.gui.beans.Loader$1",
      "weka.core.RevisionHandler",
      "weka.associations.AbstractAssociator",
      "weka.gui.AttributeSelectionPanel",
      "weka.filters.Filter",
      "weka.gui.beans.TextListener"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Saver_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "weka.gui.beans.AbstractDataSink",
      "weka.gui.beans.Saver",
      "weka.gui.beans.Saver$SaveBatchThread",
      "weka.gui.beans.Saver$1",
      "weka.core.Version",
      "weka.core.Environment",
      "weka.gui.beans.BeanVisual",
      "weka.core.converters.AbstractSaver",
      "weka.core.converters.AbstractFileSaver",
      "weka.core.converters.ArffSaver",
      "weka.core.AbstractInstance",
      "weka.core.Memory",
      "weka.gui.beans.KnowledgeFlowApp",
      "weka.gui.beans.FlowByExpression",
      "weka.gui.beans.InstanceEvent",
      "weka.core.ListOptions",
      "weka.gui.beans.AbstractDataSource",
      "weka.gui.beans.Loader",
      "weka.core.converters.AbstractLoader",
      "weka.core.converters.AbstractFileLoader",
      "weka.core.converters.ArffLoader",
      "weka.gui.beans.Loader$1",
      "weka.gui.beans.TestSetEvent",
      "weka.core.SerializedObject",
      "weka.core.Capabilities",
      "weka.core.Utils",
      "org.pentaho.packageManagement.PackageManager",
      "org.pentaho.packageManagement.DefaultPackageManager",
      "weka.core.WekaPackageManager",
      "weka.core.Capabilities$Capability",
      "weka.core.converters.C45Saver",
      "weka.gui.beans.SubstringReplacer",
      "weka.gui.beans.ModelPerformanceChart",
      "weka.gui.beans.ThresholdDataEvent",
      "weka.gui.beans.DataVisualizer",
      "weka.gui.beans.AttributeSummarizer",
      "weka.core.Javadoc",
      "weka.core.GlobalInfoJavadoc",
      "weka.core.RevisionUtils",
      "weka.gui.beans.Sorter$InstanceHolder",
      "weka.core.DenseInstance",
      "weka.core.converters.SerializedInstancesLoader",
      "weka.gui.beans.Filter",
      "weka.filters.Filter",
      "weka.filters.AllFilter",
      "weka.gui.beans.Associator",
      "weka.associations.AbstractAssociator",
      "weka.core.Tag",
      "weka.associations.Apriori",
      "weka.core.TechnicalInformation",
      "weka.core.TechnicalInformation$Type",
      "weka.core.TechnicalInformation$Field",
      "weka.core.SparseInstance",
      "weka.core.BinarySparseInstance",
      "weka.core.UnassignedDatasetException",
      "weka.gui.beans.Sorter",
      "weka.core.converters.JSONSaver",
      "weka.core.SingleIndex",
      "weka.core.converters.JSONLoader",
      "weka.gui.beans.AbstractTestSetProducer",
      "weka.gui.beans.TestSetMaker",
      "weka.core.converters.DatabaseLoader",
      "weka.experiment.DatabaseUtils",
      "weka.core.converters.DatabaseConnection",
      "weka.gui.beans.TrainingSetEvent",
      "weka.core.converters.CSVSaver",
      "weka.core.OptionHandlerJavadoc",
      "weka.core.TestInstances",
      "weka.core.Instances",
      "weka.gui.beans.AbstractOffscreenChartRenderer",
      "weka.gui.beans.WekaOffscreenChartRenderer",
      "weka.core.FindWithCapabilities",
      "weka.gui.visualize.Plot2D",
      "weka.core.FastVector",
      "weka.gui.visualize.VisualizeUtils",
      "weka.gui.visualize.InstanceInfoFrame",
      "weka.gui.visualize.PlotData2D",
      "weka.gui.beans.AbstractTrainAndTestSetProducer",
      "weka.gui.beans.CrossValidationFoldMaker",
      "weka.core.xml.XMLDocument",
      "weka.core.xml.XMLInstances",
      "weka.core.converters.XRFFLoader",
      "weka.core.converters.SerializedInstancesSaver",
      "weka.gui.explorer.AbstractPlotInstances",
      "weka.gui.explorer.ClassifierErrorsPlotInstances",
      "weka.gui.explorer.ExplorerDefaults",
      "weka.core.converters.C45Loader",
      "weka.core.converters.SVMLightLoader",
      "weka.core.converters.LibSVMLoader",
      "weka.experiment.InstanceQuery",
      "weka.core.Option",
      "weka.gui.beans.AbstractTrainingSetProducer",
      "weka.gui.beans.TrainingSetMaker",
      "weka.gui.beans.ImageSaver",
      "weka.gui.beans.PredictionAppender",
      "weka.gui.beans.ClassAssigner",
      "weka.gui.beans.DataSetEvent",
      "weka.core.TechnicalInformationHandlerJavadoc",
      "weka.gui.beans.SubstringLabeler",
      "weka.core.ProtectedProperties",
      "weka.core.Attribute",
      "weka.classifiers.AbstractClassifier",
      "weka.classifiers.SingleClassifierEnhancer",
      "weka.classifiers.misc.InputMappedClassifier",
      "weka.classifiers.rules.ZeroR",
      "weka.gui.beans.AbstractEvaluator",
      "weka.gui.beans.ClassifierPerformanceEvaluator",
      "weka.gui.beans.TrainTestSplitMaker",
      "weka.gui.beans.Classifier",
      "weka.gui.beans.IncrementalClassifierEvent",
      "weka.gui.ExtensionFileFilter",
      "weka.gui.beans.ClassValuePicker",
      "weka.core.neighboursearch.NearestNeighbourSearch",
      "weka.core.neighboursearch.CoverTree",
      "weka.core.NormalizableDistance",
      "weka.core.EuclideanDistance",
      "weka.core.Range",
      "weka.core.WekaEnumeration",
      "weka.core.Attribute$1",
      "weka.core.converters.LibSVMSaver",
      "weka.core.converters.XRFFSaver",
      "weka.core.xml.KOML",
      "com.thoughtworks.xstream.XStream",
      "weka.core.xml.XStream",
      "weka.gui.beans.SerializedModelSaver",
      "weka.core.converters.TextDirectoryLoader",
      "weka.core.MinkowskiDistance",
      "weka.classifiers.lazy.IBk",
      "weka.core.neighboursearch.LinearNNSearch",
      "weka.core.json.JSONInstances",
      "weka.core.json.JSONNode",
      "weka.core.json.JSONNode$NodeType",
      "weka.attributeSelection.ASEvaluation",
      "weka.attributeSelection.UnsupervisedAttributeEvaluator",
      "weka.attributeSelection.PrincipalComponents",
      "weka.gui.beans.TextViewer",
      "weka.core.converters.CSVLoader",
      "weka.gui.beans.Appender",
      "weka.core.converters.SVMLightSaver",
      "weka.core.converters.MatlabLoader",
      "weka.core.Check",
      "weka.core.CheckOptionHandler",
      "weka.core.neighboursearch.NearestNeighbourSearch$MyHeap",
      "weka.core.neighboursearch.NearestNeighbourSearch$MyHeapElement",
      "weka.classifiers.trees.DecisionStump",
      "weka.classifiers.IteratedSingleClassifierEnhancer",
      "weka.classifiers.ParallelIteratedSingleClassifierEnhancer",
      "weka.classifiers.RandomizableParallelIteratedSingleClassifierEnhancer",
      "weka.classifiers.meta.RandomCommittee",
      "weka.classifiers.trees.RandomTree",
      "weka.gui.beans.CostBenefitAnalysis",
      "weka.classifiers.bayes.NaiveBayesMultinomialText",
      "weka.core.tokenizers.Tokenizer",
      "weka.core.tokenizers.CharacterDelimitedTokenizer",
      "weka.core.tokenizers.WordTokenizer",
      "weka.core.stemmers.NullStemmer",
      "weka.core.converters.ArffLoader$ArffReader",
      "weka.classifiers.functions.SimpleLinearRegression",
      "weka.gui.beans.ScatterPlotMatrix",
      "weka.core.ChebyshevDistance",
      "weka.clusterers.AbstractClusterer",
      "weka.clusterers.RandomizableClusterer",
      "weka.clusterers.SimpleKMeans",
      "weka.gui.beans.ClustererPerformanceEvaluator",
      "weka.estimators.Estimator",
      "weka.estimators.NormalEstimator",
      "weka.core.CheckGOE",
      "weka.core.converters.MatlabSaver",
      "weka.gui.beans.Clusterer",
      "weka.clusterers.AbstractDensityBasedClusterer",
      "weka.clusterers.RandomizableDensityBasedClusterer",
      "weka.clusterers.EM",
      "weka.classifiers.bayes.BayesNet",
      "weka.classifiers.bayes.net.search.SearchAlgorithm",
      "weka.classifiers.bayes.net.search.local.LocalScoreSearchAlgorithm",
      "weka.classifiers.bayes.net.search.local.K2",
      "weka.classifiers.bayes.net.estimate.BayesNetEstimator",
      "weka.classifiers.bayes.net.estimate.SimpleEstimator",
      "weka.core.ManhattanDistance",
      "weka.classifiers.CostMatrix",
      "weka.gui.beans.MetaBean",
      "weka.classifiers.RandomizableSingleClassifierEnhancer",
      "weka.classifiers.meta.CostSensitiveClassifier",
      "weka.gui.beans.InstanceStreamToBatchMaker",
      "weka.gui.beans.FlowByExpression$ExpressionClause$ExpressionType",
      "weka.classifiers.trees.REPTree",
      "weka.core.ClassDiscovery",
      "weka.core.ClassCache",
      "weka.core.AllJavadoc",
      "weka.classifiers.meta.RegressionByDiscretization",
      "weka.filters.unsupervised.attribute.PotentialClassIgnorer",
      "weka.filters.unsupervised.attribute.Discretize",
      "weka.classifiers.trees.J48",
      "weka.classifiers.trees.j48.ClassifierTree",
      "weka.classifiers.trees.j48.C45PruneableClassifierTree",
      "weka.attributeSelection.CorrelationAttributeEval",
      "weka.core.converters.DatabaseSaver",
      "weka.core.WekaException",
      "weka.core.UnsupportedAttributeTypeException",
      "weka.classifiers.lazy.LWL",
      "weka.classifiers.functions.SimpleLogistic",
      "weka.gui.beans.IncrementalClassifierEvaluator",
      "weka.gui.beans.ChartEvent",
      "weka.classifiers.meta.FilteredClassifier",
      "weka.filters.supervised.attribute.AttributeSelection",
      "weka.attributeSelection.AttributeSelection",
      "weka.attributeSelection.CfsSubsetEval",
      "weka.attributeSelection.ASSearch",
      "weka.attributeSelection.GreedyStepwise",
      "weka.attributeSelection.BestFirst",
      "weka.filters.supervised.attribute.Discretize",
      "weka.classifiers.trees.RandomForest",
      "weka.classifiers.functions.supportVector.Kernel",
      "weka.filters.SimpleFilter",
      "weka.filters.SimpleStreamFilter",
      "weka.filters.MultiFilter",
      "weka.gui.beans.StripChart",
      "weka.gui.beans.StripChart$ScalePanel",
      "weka.gui.beans.StripChart$LegendPanel",
      "weka.core.neighboursearch.KDTree",
      "weka.core.neighboursearch.kdtrees.KDTreeNodeSplitter",
      "weka.core.neighboursearch.kdtrees.SlidingMidPointOfWidestSide",
      "weka.classifiers.trees.LMT",
      "weka.core.neighboursearch.BallTree",
      "weka.core.neighboursearch.balltrees.BallTreeConstructor",
      "weka.core.neighboursearch.balltrees.TopDownConstructor",
      "weka.core.neighboursearch.balltrees.BallSplitter",
      "weka.core.neighboursearch.balltrees.PointsClosestToFurthestChildren",
      "weka.filters.unsupervised.attribute.Add",
      "weka.classifiers.functions.supportVector.PrecomputedKernelMatrixKernel",
      "weka.classifiers.meta.CVParameterSelection",
      "weka.classifiers.bayes.NaiveBayesMultinomial",
      "weka.clusterers.Cobweb",
      "weka.classifiers.functions.supportVector.StringKernel",
      "weka.core.matrix.Matrix",
      "weka.estimators.MahalanobisEstimator",
      "weka.gui.beans.GraphViewer",
      "weka.classifiers.MultipleClassifiersCombiner",
      "weka.classifiers.ParallelMultipleClassifiersCombiner",
      "weka.classifiers.RandomizableParallelMultipleClassifiersCombiner",
      "weka.classifiers.meta.Stacking",
      "weka.attributeSelection.ReliefFAttributeEval",
      "weka.clusterers.MakeDensityBasedClusterer",
      "weka.classifiers.meta.MultiClassClassifier",
      "weka.classifiers.meta.MultiClassClassifierUpdateable",
      "weka.classifiers.functions.Logistic",
      "weka.classifiers.functions.supportVector.CachedKernel",
      "weka.classifiers.functions.supportVector.RBFKernel",
      "weka.core.AttributeStats",
      "weka.classifiers.RandomizableMultipleClassifiersCombiner",
      "weka.classifiers.meta.Vote",
      "weka.associations.SingleAssociatorEnhancer",
      "weka.associations.FilteredAssociator",
      "weka.filters.unsupervised.attribute.ReplaceMissingValues",
      "weka.attributeSelection.InfoGainAttributeEval",
      "weka.classifiers.functions.MultilayerPerceptron",
      "weka.filters.unsupervised.attribute.NominalToBinary",
      "weka.classifiers.functions.neural.SigmoidUnit",
      "weka.classifiers.functions.neural.LinearUnit",
      "weka.attributeSelection.SymmetricalUncertAttributeEval",
      "weka.attributeSelection.GainRatioAttributeEval",
      "weka.classifiers.functions.supportVector.PolyKernel",
      "weka.classifiers.functions.supportVector.NormalizedPolyKernel",
      "weka.classifiers.rules.OneR",
      "weka.classifiers.rules.JRip",
      "weka.classifiers.lazy.KStar",
      "weka.clusterers.SingleClustererEnhancer",
      "weka.clusterers.FilteredClusterer",
      "weka.classifiers.bayes.NaiveBayes",
      "weka.classifiers.bayes.NaiveBayesUpdateable",
      "weka.estimators.DiscreteEstimator",
      "weka.classifiers.functions.LinearRegression",
      "weka.classifiers.RandomizableIteratedSingleClassifierEnhancer",
      "weka.classifiers.meta.AdaBoostM1",
      "weka.core.neighboursearch.balltrees.BallNode",
      "weka.classifiers.meta.MultiScheme",
      "weka.classifiers.functions.GaussianProcesses",
      "weka.core.tokenizers.AlphabeticTokenizer",
      "weka.classifiers.RandomizableClassifier",
      "weka.classifiers.functions.SGD",
      "weka.classifiers.meta.AdditiveRegression",
      "weka.clusterers.HierarchicalClusterer",
      "weka.classifiers.misc.SerializedClassifier",
      "weka.classifiers.functions.SMO",
      "weka.classifiers.meta.AttributeSelectedClassifier",
      "weka.core.neighboursearch.PerformanceStats",
      "weka.core.neighboursearch.TreePerformanceStats",
      "weka.classifiers.rules.PART",
      "weka.classifiers.rules.part.MakeDecList",
      "weka.classifiers.meta.LogitBoost",
      "weka.associations.FPGrowth",
      "weka.associations.DefaultAssociationRule$METRIC_TYPE",
      "weka.clusterers.FarthestFirst",
      "weka.classifiers.functions.SGDText",
      "weka.core.converters.ConverterUtils$DataSource",
      "weka.gui.WekaTaskMonitor",
      "weka.gui.LogPanel",
      "weka.gui.LogPanel$1",
      "weka.classifiers.trees.m5.M5Base",
      "weka.classifiers.rules.M5Rules",
      "weka.estimators.KernelEstimator",
      "weka.estimators.PoissonEstimator",
      "weka.core.neighboursearch.balltrees.MiddleOutConstructor",
      "weka.classifiers.functions.SMOreg",
      "weka.classifiers.functions.supportVector.RegOptimizer",
      "weka.classifiers.functions.supportVector.RegSMO",
      "weka.classifiers.functions.supportVector.RegSMOImproved"
    );
  }
}
