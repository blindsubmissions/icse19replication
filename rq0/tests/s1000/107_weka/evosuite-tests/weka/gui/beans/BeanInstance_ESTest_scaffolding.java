/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Aug 07 13:52:48 GMT 2018
 */

package weka.gui.beans;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class BeanInstance_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "weka.gui.beans.BeanInstance"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(BeanInstance_ESTest_scaffolding.class.getClassLoader() ,
      "weka.core.Environment",
      "weka.gui.HierarchyPropertyParser",
      "weka.gui.beans.InstanceEvent",
      "com.thoughtworks.xstream.XStream",
      "weka.gui.beans.TestSetProducer",
      "weka.gui.beans.TestSetListener",
      "com.thoughtworks.xstream.XStream$InitializationException",
      "weka.gui.beans.DataSourceListener",
      "weka.gui.beans.TestSetMaker",
      "com.thoughtworks.xstream.converters.Converter",
      "com.thoughtworks.xstream.security.TypePermission",
      "weka.gui.beans.KnowledgeFlowApp$BeanLayout",
      "com.thoughtworks.xstream.XStreamException",
      "com.thoughtworks.xstream.converters.SingleValueConverter",
      "weka.gui.beans.TestSetEvent",
      "weka.gui.beans.SerializedModelSaver",
      "weka.core.EnvironmentHandler",
      "weka.gui.beans.TrainTestSplitMaker",
      "com.thoughtworks.xstream.converters.ConverterMatcher",
      "com.thoughtworks.xstream.core.util.CompositeClassLoader",
      "com.thoughtworks.xstream.converters.ConverterLookup",
      "weka.gui.beans.AbstractTestSetProducer",
      "weka.gui.beans.KnowledgeFlowApp$MainKFPerspective",
      "weka.core.xml.KOML",
      "com.thoughtworks.xstream.core.util.CustomObjectOutputStream$StreamCallback",
      "weka.gui.visualize.VisualizePanel",
      "weka.gui.beans.BeanVisual",
      "weka.gui.beans.KFStep",
      "weka.core.Copyable",
      "weka.gui.AttributeVisualizationPanel",
      "weka.gui.beans.BatchClustererEvent",
      "weka.gui.beans.KnowledgeFlowApp$20",
      "weka.gui.beans.KnowledgeFlowApp$KFPerspective",
      "weka.gui.beans.Appender",
      "weka.core.xml.XStream",
      "weka.gui.beans.BeanCustomizer$ModifyListener",
      "com.thoughtworks.xstream.converters.ConversionException",
      "weka.gui.beans.InstanceListener",
      "com.thoughtworks.xstream.mapper.MapperWrapper",
      "com.thoughtworks.xstream.mapper.Mapper",
      "com.thoughtworks.xstream.core.util.CustomObjectInputStream$StreamCallback",
      "weka.gui.beans.ImageListener",
      "weka.gui.beans.BatchClassifierListener",
      "com.thoughtworks.xstream.mapper.SecurityMapper",
      "weka.gui.beans.KnowledgeFlowApp$34",
      "weka.gui.beans.StructureProducer",
      "weka.gui.beans.LogPanel",
      "weka.gui.beans.BeanInstance",
      "weka.core.Version",
      "weka.gui.beans.ClassifierPerformanceEvaluator",
      "weka.gui.beans.DataSource",
      "weka.gui.beans.HeadlessEventCollector",
      "weka.gui.Logger",
      "com.thoughtworks.xstream.mapper.AbstractXmlFriendlyMapper",
      "weka.core.Tag",
      "weka.gui.beans.BeanCommon",
      "weka.gui.visualize.PrintableHandler",
      "com.thoughtworks.xstream.core.util.CustomObjectOutputStream",
      "weka.gui.beans.ClassValuePicker",
      "weka.gui.beans.Visible",
      "com.thoughtworks.xstream.converters.DataHolder",
      "com.thoughtworks.xstream.core.util.CustomObjectInputStream",
      "weka.gui.beans.OffscreenChartRenderer",
      "com.thoughtworks.xstream.core.BaseException",
      "com.thoughtworks.xstream.converters.ConverterRegistry",
      "weka.gui.beans.UserRequestAcceptor",
      "weka.gui.beans.KnowledgeFlowApp",
      "weka.gui.beans.AttributeSummarizer",
      "weka.gui.beans.KnowledgeFlowApp$InvisibleNode",
      "weka.gui.ExtensionFileFilter",
      "weka.gui.beans.DataVisualizer",
      "weka.gui.beans.AbstractEvaluator",
      "com.thoughtworks.xstream.InitializationException",
      "weka.gui.beans.TrainingSetListener",
      "com.thoughtworks.xstream.mapper.DefaultMapper",
      "weka.core.Memory",
      "com.thoughtworks.xstream.mapper.ImmutableTypesMapper",
      "weka.gui.visualize.PrintablePanel",
      "weka.gui.beans.FlowByExpression",
      "weka.gui.beans.IncrementalClassifierListener",
      "weka.core.Instance",
      "weka.gui.beans.EventConstraints",
      "com.thoughtworks.xstream.mapper.AttributeMapper",
      "weka.core.converters.Loader",
      "com.thoughtworks.xstream.converters.ErrorWritingException",
      "weka.gui.beans.ImageEvent",
      "weka.gui.beans.BatchClassifierEvent",
      "weka.gui.beans.AbstractTrainAndTestSetProducer",
      "weka.gui.beans.TrainingSetEvent",
      "weka.gui.beans.IncrementalClassifierEvent",
      "weka.gui.beans.BatchClustererListener",
      "weka.gui.beans.StartUpListener",
      "com.thoughtworks.xstream.io.HierarchicalStreamDriver",
      "weka.core.Instances",
      "weka.gui.beans.DataSetEvent",
      "com.thoughtworks.xstream.MarshallingStrategy",
      "com.thoughtworks.xstream.converters.ErrorWriter",
      "com.thoughtworks.xstream.mapper.XStream11XmlFriendlyMapper",
      "weka.gui.beans.TrainingSetProducer",
      "weka.core.RevisionHandler",
      "weka.gui.AttributeSelectionPanel"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.awt.event.ComponentListener", false, BeanInstance_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(BeanInstance_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "weka.gui.beans.BeanInstance",
      "weka.gui.beans.DataVisualizer",
      "weka.gui.beans.AttributeSummarizer",
      "weka.gui.beans.BeanVisual",
      "weka.core.Memory",
      "weka.gui.beans.KnowledgeFlowApp",
      "weka.gui.ExtensionFileFilter",
      "weka.core.Version",
      "weka.core.Environment",
      "org.pentaho.packageManagement.PackageManager",
      "org.pentaho.packageManagement.DefaultPackageManager",
      "weka.core.WekaPackageManager",
      "weka.core.ClassDiscovery",
      "weka.core.ClassCache",
      "weka.gui.beans.FlowByExpression",
      "weka.gui.beans.InstanceEvent",
      "weka.gui.beans.SubstringReplacer",
      "weka.gui.beans.MetaBean",
      "weka.gui.beans.AbstractTrainAndTestSetProducer",
      "weka.gui.beans.CrossValidationFoldMaker",
      "weka.gui.beans.Appender",
      "weka.gui.beans.CostBenefitAnalysis",
      "weka.core.Tag",
      "weka.core.xml.KOML",
      "com.thoughtworks.xstream.XStream",
      "weka.core.xml.XStream",
      "weka.gui.beans.SerializedModelSaver",
      "weka.gui.beans.ClassAssigner",
      "weka.gui.beans.AbstractOffscreenChartRenderer",
      "weka.gui.beans.WekaOffscreenChartRenderer",
      "weka.gui.beans.ModelPerformanceChart",
      "weka.gui.visualize.Plot2D",
      "weka.core.FastVector",
      "weka.core.Utils",
      "weka.gui.visualize.VisualizeUtils",
      "weka.gui.visualize.InstanceInfoFrame",
      "weka.gui.visualize.PlotData2D",
      "weka.gui.beans.ClassValuePicker",
      "weka.gui.beans.Filter",
      "weka.filters.Filter",
      "weka.filters.AllFilter",
      "weka.gui.visualize.MatrixPanel",
      "weka.gui.visualize.ClassPanel",
      "weka.gui.visualize.MatrixPanel$1",
      "weka.gui.visualize.MatrixPanel$2",
      "weka.gui.visualize.MatrixPanel$3",
      "weka.gui.visualize.MatrixPanel$4",
      "weka.gui.visualize.MatrixPanel$5",
      "weka.gui.visualize.MatrixPanel$6",
      "weka.gui.visualize.MatrixPanel$7",
      "weka.gui.visualize.MatrixPanel$8",
      "weka.gui.visualize.MatrixPanel$Plot",
      "weka.gui.visualize.MatrixPanel$Plot$1",
      "weka.gui.visualize.MatrixPanel$Plot$2",
      "weka.gui.beans.StripChart",
      "weka.gui.beans.StripChart$ScalePanel",
      "weka.gui.beans.StripChart$LegendPanel",
      "weka.gui.beans.ChartEvent",
      "weka.gui.beans.PredictionAppender",
      "weka.gui.beans.ImageSaver",
      "weka.gui.beans.AbstractTrainingSetProducer",
      "weka.gui.beans.TrainingSetMaker",
      "weka.gui.beans.AbstractEvaluator",
      "weka.gui.beans.IncrementalClassifierEvaluator",
      "weka.gui.beans.AbstractDataSource",
      "weka.gui.beans.Loader",
      "weka.core.converters.AbstractLoader",
      "weka.core.converters.AbstractFileLoader",
      "weka.core.converters.ArffLoader",
      "weka.gui.beans.Loader$1",
      "weka.gui.beans.GraphViewer",
      "weka.gui.beans.Clusterer",
      "weka.clusterers.AbstractClusterer",
      "weka.clusterers.AbstractDensityBasedClusterer",
      "weka.clusterers.RandomizableDensityBasedClusterer",
      "weka.clusterers.EM",
      "weka.core.converters.AbstractSaver",
      "weka.core.converters.DatabaseSaver",
      "weka.experiment.DatabaseUtils",
      "weka.core.converters.DatabaseConnection",
      "weka.gui.beans.ClassAssignerCustomizer",
      "weka.gui.PropertySheetPanel",
      "weka.gui.beans.ClassAssignerCustomizer$1",
      "weka.gui.beans.ClassAssignerCustomizer$2",
      "weka.gui.beans.ClassAssignerCustomizer$3",
      "weka.classifiers.functions.supportVector.Kernel",
      "weka.classifiers.functions.supportVector.PrecomputedKernelMatrixKernel",
      "weka.gui.beans.Sorter",
      "weka.gui.beans.TextViewer",
      "weka.gui.beans.ScatterPlotMatrix",
      "weka.gui.ResultHistoryPanel",
      "weka.gui.visualize.PrintableComponent",
      "weka.gui.visualize.PrintableComponent$PrintMouseListener",
      "weka.gui.visualize.PrintableComponent$1",
      "weka.gui.visualize.PrintableComponent$2",
      "weka.gui.visualize.PrintableComponent$3",
      "weka.gui.visualize.PrintableComponent$4",
      "weka.gui.GenericObjectEditor",
      "weka.gui.beans.ClustererPerformanceEvaluator",
      "weka.gui.beans.InstanceStreamToBatchMaker",
      "weka.gui.beans.AbstractDataSink",
      "weka.gui.beans.Saver",
      "weka.core.converters.AbstractFileSaver",
      "weka.core.converters.ArffSaver",
      "weka.core.AbstractInstance",
      "weka.gui.beans.ClassifierPerformanceEvaluator",
      "weka.gui.WekaTaskMonitor",
      "weka.gui.LogPanel",
      "weka.gui.LogPanel$1",
      "weka.gui.LogPanel$4",
      "weka.gui.beans.SubstringLabeler",
      "weka.gui.beans.Classifier",
      "weka.classifiers.AbstractClassifier",
      "weka.classifiers.rules.ZeroR",
      "weka.gui.beans.IncrementalClassifierEvent",
      "weka.gui.beans.AbstractTestSetProducer",
      "weka.gui.beans.TestSetMaker",
      "weka.gui.AttributeSelectionPanel",
      "weka.gui.AttributeSelectionPanel$1",
      "weka.gui.AttributeSelectionPanel$2",
      "weka.gui.AttributeSelectionPanel$3",
      "weka.gui.AttributeSelectionPanel$4",
      "weka.gui.beans.TrainTestSplitMaker",
      "weka.gui.beans.Associator",
      "weka.associations.AbstractAssociator",
      "weka.associations.Apriori",
      "weka.core.TechnicalInformation",
      "weka.core.TechnicalInformation$Type",
      "weka.core.TechnicalInformation$Field",
      "weka.core.Instances",
      "weka.gui.beans.FlowByExpression$ExpressionNode",
      "weka.gui.beans.FlowByExpression$BracketNode"
    );
  }
}
