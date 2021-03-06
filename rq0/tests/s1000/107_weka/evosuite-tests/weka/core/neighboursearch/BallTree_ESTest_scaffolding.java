/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Aug 07 14:31:50 GMT 2018
 */

package weka.core.neighboursearch;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class BallTree_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "weka.core.neighboursearch.BallTree"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(BallTree_ESTest_scaffolding.class.getClassLoader() ,
      "weka.core.TechnicalInformation$Type",
      "weka.core.DistanceFunction",
      "weka.core.neighboursearch.balltrees.PointsClosestToFurthestChildren",
      "weka.core.neighboursearch.balltrees.TopDownConstructor",
      "weka.core.Copyable",
      "weka.core.UnassignedDatasetException",
      "weka.core.neighboursearch.balltrees.BallTreeConstructor",
      "weka.core.OptionHandler",
      "weka.core.RevisionUtils",
      "weka.core.AdditionalMeasureProducer",
      "weka.core.neighboursearch.balltrees.BallNode",
      "weka.core.neighboursearch.NearestNeighbourSearch$NeighborNode",
      "weka.core.Instance",
      "weka.core.Range",
      "weka.core.neighboursearch.BallTree",
      "weka.core.neighboursearch.NearestNeighbourSearch$MyHeapElement",
      "weka.core.neighboursearch.NearestNeighbourSearch$NeighborList",
      "weka.core.DenseInstance",
      "weka.core.AttributeStats",
      "weka.core.neighboursearch.NearestNeighbourSearch",
      "weka.core.TechnicalInformation$Field",
      "weka.core.neighboursearch.NearestNeighbourSearch$MyHeap",
      "weka.core.EuclideanDistance",
      "weka.core.AbstractInstance",
      "weka.core.Instances",
      "weka.core.TechnicalInformationHandler",
      "weka.core.neighboursearch.balltrees.BallSplitter",
      "weka.core.UnassignedClassException",
      "weka.core.Option",
      "weka.core.neighboursearch.PerformanceStats",
      "weka.core.TechnicalInformation",
      "weka.core.Utils",
      "weka.core.RevisionHandler",
      "weka.core.CustomDisplayStringProvider",
      "weka.core.neighboursearch.TreePerformanceStats",
      "weka.core.NormalizableDistance",
      "weka.core.Attribute"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(BallTree_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "weka.core.neighboursearch.NearestNeighbourSearch",
      "weka.core.neighboursearch.BallTree",
      "weka.core.TechnicalInformation$Type",
      "weka.core.TechnicalInformation$Field",
      "weka.core.NormalizableDistance",
      "weka.core.EuclideanDistance",
      "weka.core.Range",
      "weka.core.neighboursearch.balltrees.BallTreeConstructor",
      "weka.core.neighboursearch.balltrees.TopDownConstructor",
      "weka.core.neighboursearch.balltrees.BallSplitter",
      "weka.core.neighboursearch.balltrees.PointsClosestToFurthestChildren",
      "weka.core.neighboursearch.balltrees.BallNode",
      "weka.core.neighboursearch.KDTree",
      "weka.core.neighboursearch.kdtrees.KDTreeNodeSplitter",
      "weka.core.neighboursearch.kdtrees.SlidingMidPointOfWidestSide",
      "weka.core.Option",
      "weka.core.neighboursearch.CoverTree",
      "weka.core.Instances",
      "weka.core.AbstractInstance",
      "weka.core.DenseInstance",
      "weka.core.converters.ArffLoader$ArffReader",
      "weka.core.Utils",
      "weka.core.TechnicalInformation",
      "weka.core.neighboursearch.PerformanceStats",
      "weka.core.neighboursearch.TreePerformanceStats",
      "weka.core.neighboursearch.NearestNeighbourSearch$MyHeap",
      "weka.core.SparseInstance",
      "weka.core.BinarySparseInstance",
      "weka.core.neighboursearch.NearestNeighbourSearch$MyHeapElement",
      "weka.core.Attribute",
      "weka.core.ProtectedProperties",
      "weka.core.UnassignedDatasetException",
      "weka.core.neighboursearch.balltrees.BottomUpConstructor",
      "weka.core.ChebyshevDistance",
      "weka.core.RevisionUtils",
      "weka.core.neighboursearch.LinearNNSearch",
      "weka.core.AttributeStats",
      "weka.core.neighboursearch.CoverTree$CoverTreeNode",
      "weka.core.neighboursearch.balltrees.MiddleOutConstructor",
      "weka.core.WekaEnumeration",
      "weka.core.Attribute$1",
      "weka.core.neighboursearch.CoverTree$MyHeap",
      "weka.core.ManhattanDistance",
      "weka.core.MinkowskiDistance",
      "weka.core.UnassignedClassException",
      "weka.core.neighboursearch.covertrees.Stack",
      "weka.core.neighboursearch.CoverTree$MyHeapElement",
      "weka.core.converters.ConverterUtils$DataSource",
      "weka.core.converters.AbstractLoader",
      "weka.core.converters.AbstractFileLoader",
      "weka.core.converters.ArffLoader",
      "weka.core.neighboursearch.CoverTree$d_node",
      "weka.core.neighboursearch.kdtrees.KDTreeNode",
      "weka.core.neighboursearch.balltrees.BottomUpConstructor$TempNode",
      "weka.core.neighboursearch.balltrees.MedianDistanceFromArbitraryPoint"
    );
  }
}
