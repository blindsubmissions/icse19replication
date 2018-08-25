/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Aug 07 13:44:09 GMT 2018
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
public class FlowRunner_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "weka.gui.beans.FlowRunner"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(FlowRunner_ESTest_scaffolding.class.getClassLoader() ,
      "weka.core.Environment",
      "weka.gui.HierarchyPropertyParser",
      "weka.gui.beans.InstanceEvent",
      "weka.core.converters.ConverterUtils",
      "weka.gui.beans.TestSetProducer",
      "weka.gui.beans.AbstractDataSource",
      "org.pentaho.packageManagement.PackageConstraint",
      "weka.core.converters.TextDirectoryLoader",
      "weka.core.converters.Saver",
      "org.pentaho.packageManagement.Package",
      "weka.core.xml.XMLBasicSerialization",
      "weka.core.converters.AbstractFileSaver",
      "weka.classifiers.CostMatrix",
      "weka.gui.beans.TestSetListener",
      "weka.core.logging.Logger$Level",
      "weka.core.logging.OutputLogger",
      "weka.core.converters.XRFFSaver",
      "weka.core.ClassCache",
      "weka.gui.beans.xml.XMLBeans",
      "weka.gui.beans.DataSourceListener",
      "weka.core.converters.DatabaseConverter",
      "weka.gui.SysErrLog",
      "weka.gui.PropertyPanel",
      "weka.core.converters.IncrementalConverter",
      "org.pentaho.packageManagement.DefaultPackageManager",
      "weka.gui.beans.Saver",
      "weka.gui.beans.WekaWrapper",
      "weka.gui.GenericPropertiesCreator",
      "org.bounce.net.DefaultAuthenticator",
      "weka.gui.beans.KnowledgeFlowApp$BeanLayout",
      "weka.gui.beans.TestSetEvent",
      "weka.gui.beans.Clusterer",
      "weka.core.EnvironmentHandler",
      "weka.core.Utils",
      "weka.core.converters.XRFFLoader",
      "weka.gui.beans.KnowledgeFlowApp$MainKFPerspective",
      "weka.gui.GenericObjectEditor$JTreePopupMenu",
      "weka.gui.beans.BeanVisual",
      "weka.core.Copyable",
      "weka.core.Capabilities",
      "weka.gui.beans.AbstractDataSink",
      "weka.core.converters.SVMLightLoader",
      "weka.gui.beans.KnowledgeFlowApp$20",
      "weka.gui.beans.KnowledgeFlowApp$KFPerspective",
      "weka.core.Matrix",
      "weka.gui.beans.BeanCustomizer$ModifyListener",
      "org.pentaho.packageManagement.PackageManager$1",
      "weka.core.converters.AbstractSaver",
      "weka.core.logging.Logger",
      "weka.gui.beans.InstanceListener",
      "weka.gui.beans.Classifier",
      "weka.core.matrix.Matrix",
      "weka.core.CapabilitiesHandler",
      "weka.gui.TaskLogger",
      "weka.gui.beans.ThresholdDataEvent",
      "weka.associations.Associator",
      "weka.core.AbstractInstance",
      "weka.gui.beans.KnowledgeFlowApp$34",
      "weka.gui.beans.StructureProducer",
      "org.pentaho.packageManagement.DefaultPackage",
      "weka.gui.beans.LogPanel",
      "weka.gui.beans.MetaBean",
      "weka.experiment.ResultProducer",
      "weka.gui.beans.BeanInstance",
      "weka.core.Version",
      "weka.core.converters.AbstractLoader",
      "weka.gui.beans.DataSource",
      "weka.experiment.SplitEvaluator",
      "weka.gui.beans.HeadlessEventCollector",
      "weka.gui.Logger",
      "weka.core.converters.BatchConverter",
      "weka.gui.beans.Saver$SaveBatchThread",
      "weka.gui.beans.Startable",
      "weka.gui.beans.ThresholdDataListener",
      "weka.gui.beans.BeanCommon",
      "weka.gui.visualize.PrintableHandler",
      "weka.core.converters.ArffLoader",
      "weka.core.xml.MethodHandler",
      "weka.core.OptionHandler",
      "weka.core.ClassDiscovery",
      "weka.gui.GenericObjectEditor$1",
      "weka.gui.beans.ClassValuePicker",
      "weka.gui.beans.Visible",
      "weka.classifiers.Classifier",
      "weka.core.converters.SerializedInstancesSaver",
      "weka.gui.beans.ConfigurationProducer",
      "weka.core.logging.ConsoleLogger",
      "org.pentaho.packageManagement.PackageManager",
      "weka.gui.beans.FlowRunner",
      "weka.gui.beans.FlowRunner$SimpleLogger",
      "weka.core.logging.OutputLogger$OutputPrintStream",
      "weka.gui.LogPanel",
      "weka.gui.LogPanel$4",
      "weka.gui.GenericObjectEditor",
      "weka.core.WekaPackageManager",
      "weka.gui.beans.BeanConnection",
      "weka.core.converters.CSVLoader",
      "weka.gui.CustomPanelSupplier",
      "weka.gui.LogPanel$1",
      "weka.gui.beans.UserRequestAcceptor",
      "weka.gui.WekaTaskMonitor",
      "weka.gui.beans.KnowledgeFlowApp",
      "weka.gui.beans.KnowledgeFlowApp$InvisibleNode",
      "weka.core.converters.URLSourcedLoader",
      "weka.core.converters.FileSourcedConverter",
      "weka.clusterers.Clusterer",
      "weka.core.converters.CSVSaver",
      "weka.gui.ExtensionFileFilter",
      "weka.core.converters.ArffSaver",
      "weka.gui.beans.TextViewer",
      "weka.core.converters.DatabaseSaver",
      "weka.gui.beans.TrainingSetListener",
      "weka.core.Memory",
      "weka.core.xml.XMLDocument",
      "weka.core.UnassignedDatasetException",
      "weka.gui.visualize.PrintablePanel",
      "weka.core.xml.PropertyHandler",
      "weka.core.Instance",
      "weka.core.converters.SerializedInstancesLoader",
      "weka.gui.beans.EventConstraints",
      "weka.core.converters.Loader",
      "weka.gui.beans.TrainingSetEvent",
      "weka.gui.beans.Filter",
      "weka.gui.beans.DataSink",
      "weka.gui.beans.StartUpListener",
      "weka.gui.beans.Associator",
      "weka.core.converters.DatabaseLoader",
      "weka.core.Tee",
      "weka.core.Instances",
      "weka.core.logging.FileLogger",
      "weka.gui.beans.DataSetEvent",
      "weka.core.converters.AbstractFileLoader",
      "weka.core.UnassignedClassException",
      "weka.gui.beans.Loader$LoadThread",
      "weka.gui.beans.Loader",
      "weka.core.xml.XMLSerializationMethodHandler",
      "weka.gui.beans.Loader$1",
      "weka.gui.beans.TrainingSetProducer",
      "weka.core.RevisionHandler",
      "weka.gui.beans.FlowRunner$1",
      "weka.gui.AttributeSelectionPanel",
      "weka.core.xml.XMLSerialization",
      "weka.gui.GenericObjectEditor$GOEPanel",
      "weka.gui.beans.TextListener",
      "weka.filters.Filter"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(FlowRunner_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "weka.gui.beans.FlowRunner",
      "weka.gui.beans.FlowRunner$1",
      "weka.gui.beans.FlowRunner$SimpleLogger",
      "weka.core.Memory",
      "weka.gui.beans.KnowledgeFlowApp",
      "org.pentaho.packageManagement.PackageManager",
      "org.pentaho.packageManagement.DefaultPackageManager",
      "weka.core.Version",
      "weka.core.Environment",
      "weka.core.WekaPackageManager",
      "weka.core.logging.Logger$Level",
      "weka.core.ClassloaderUtil",
      "weka.core.Utils",
      "weka.gui.explorer.ExplorerDefaults",
      "weka.gui.GenericPropertiesCreator",
      "weka.core.ClassDiscovery",
      "weka.core.ClassCache",
      "weka.gui.GenericObjectEditor",
      "weka.core.converters.ConverterUtils",
      "weka.gui.ConverterFileChooser",
      "weka.gui.beans.PluginManager",
      "weka.gui.beans.BeanConnection",
      "weka.gui.beans.BeanInstance",
      "weka.core.logging.Logger",
      "weka.gui.beans.Sorter",
      "weka.gui.beans.InstanceEvent",
      "weka.gui.beans.BeanVisual",
      "weka.gui.beans.AbstractDataSink",
      "weka.gui.beans.Saver",
      "weka.core.converters.AbstractSaver",
      "weka.core.converters.AbstractFileSaver",
      "weka.core.converters.ArffSaver",
      "weka.core.AbstractInstance",
      "weka.classifiers.functions.supportVector.Kernel",
      "weka.classifiers.functions.supportVector.PrecomputedKernelMatrixKernel",
      "weka.core.logging.ConsoleLogger",
      "weka.core.logging.FileLogger",
      "weka.core.logging.OutputLogger",
      "weka.core.Tee",
      "weka.core.logging.OutputLogger$OutputPrintStream",
      "weka.gui.ExtensionFileFilter",
      "weka.gui.beans.AbstractDataSource",
      "weka.gui.beans.Loader",
      "weka.core.converters.AbstractLoader",
      "weka.core.converters.AbstractFileLoader",
      "weka.core.converters.ArffLoader",
      "weka.gui.beans.Loader$1",
      "weka.gui.beans.Loader$LoadThread",
      "weka.core.converters.C45Loader",
      "weka.gui.beans.DataVisualizer",
      "weka.gui.beans.AttributeSummarizer",
      "weka.core.converters.JSONLoader",
      "weka.core.converters.TextDirectoryLoader",
      "weka.core.converters.XRFFSaver",
      "weka.core.SingleIndex",
      "weka.core.xml.XMLDocument",
      "weka.core.xml.XMLInstances",
      "weka.core.converters.XRFFLoader",
      "weka.core.xml.XMLSerialization",
      "weka.core.xml.XMLBasicSerialization",
      "weka.gui.beans.xml.XMLBeans",
      "weka.core.xml.PropertyHandler",
      "weka.core.xml.XMLSerializationMethodHandler",
      "weka.core.xml.MethodHandler",
      "weka.gui.LogPanel",
      "weka.gui.LogPanel$1",
      "weka.gui.LogPanel$4",
      "weka.gui.SysErrLog",
      "weka.core.converters.SVMLightLoader",
      "weka.gui.beans.TextViewer",
      "weka.gui.beans.SubstringReplacer",
      "weka.gui.beans.ClassValuePicker",
      "weka.core.Tag",
      "weka.core.xml.KOML",
      "com.thoughtworks.xstream.XStream",
      "weka.core.xml.XStream",
      "weka.gui.beans.SerializedModelSaver",
      "weka.gui.beans.AbstractEvaluator",
      "weka.gui.beans.IncrementalClassifierEvaluator",
      "weka.gui.beans.ChartEvent",
      "weka.gui.beans.AbstractTrainAndTestSetProducer",
      "weka.gui.beans.TrainTestSplitMaker",
      "weka.gui.beans.Clusterer",
      "weka.clusterers.AbstractClusterer",
      "weka.clusterers.AbstractDensityBasedClusterer",
      "weka.clusterers.RandomizableDensityBasedClusterer",
      "weka.clusterers.EM",
      "weka.gui.beans.Appender",
      "weka.gui.beans.Filter",
      "weka.filters.Filter",
      "weka.filters.AllFilter",
      "weka.classifiers.AbstractClassifier",
      "weka.classifiers.misc.SerializedClassifier",
      "weka.core.converters.MatlabLoader",
      "weka.gui.beans.PredictionAppender",
      "weka.gui.beans.StripChart",
      "weka.gui.beans.StripChart$ScalePanel",
      "weka.gui.beans.StripChart$LegendPanel",
      "weka.gui.visualize.VisualizeUtils",
      "weka.gui.beans.StripChart$StripPlotter",
      "weka.core.converters.MatlabSaver",
      "weka.gui.beans.Classifier",
      "weka.classifiers.rules.ZeroR",
      "weka.gui.beans.IncrementalClassifierEvent",
      "weka.gui.beans.ClustererPerformanceEvaluator",
      "weka.gui.beans.ImageSaver",
      "weka.core.converters.CSVSaver",
      "weka.classifiers.RandomizableClassifier",
      "weka.classifiers.functions.SGDText",
      "weka.core.tokenizers.Tokenizer",
      "weka.core.tokenizers.CharacterDelimitedTokenizer",
      "weka.core.tokenizers.WordTokenizer",
      "weka.core.stemmers.NullStemmer",
      "weka.core.converters.CSVLoader",
      "weka.core.Range",
      "weka.gui.beans.ModelPerformanceChart",
      "weka.core.converters.DatabaseSaver",
      "weka.experiment.DatabaseUtils",
      "weka.core.converters.DatabaseConnection",
      "weka.core.Capabilities",
      "weka.core.Capabilities$Capability",
      "weka.classifiers.SingleClassifierEnhancer",
      "weka.classifiers.RandomizableSingleClassifierEnhancer",
      "weka.classifiers.meta.CostSensitiveClassifier",
      "weka.classifiers.CostMatrix",
      "weka.gui.beans.FlowByExpression",
      "weka.gui.beans.ClassifierPerformanceEvaluator",
      "weka.gui.beans.AbstractTestSetProducer",
      "weka.gui.beans.TestSetMaker",
      "weka.core.ProtectedProperties",
      "weka.gui.beans.ClassAssigner",
      "weka.gui.WekaTaskMonitor",
      "weka.core.converters.DatabaseLoader",
      "weka.gui.beans.GraphViewer",
      "weka.core.converters.SerializedInstancesLoader",
      "weka.gui.beans.Sorter$InstanceHolder",
      "weka.gui.beans.CrossValidationFoldMaker",
      "weka.core.converters.LibSVMLoader",
      "weka.core.converters.LibSVMSaver",
      "weka.classifiers.bayes.NaiveBayesMultinomialText",
      "weka.gui.beans.CostBenefitAnalysis",
      "weka.gui.beans.SubstringLabeler",
      "weka.gui.beans.AbstractTrainingSetProducer",
      "weka.gui.beans.TrainingSetMaker",
      "weka.gui.beans.InstanceStreamToBatchMaker",
      "weka.core.converters.JSONSaver",
      "weka.core.RevisionUtils"
    );
  }
}