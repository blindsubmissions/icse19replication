/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Aug 07 14:19:52 GMT 2018
 */

package weka.estimators;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class CheckEstimator_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "weka.estimators.CheckEstimator"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(CheckEstimator_ESTest_scaffolding.class.getClassLoader() ,
      "weka.estimators.CheckEstimator$EstTypes",
      "weka.core.Environment",
      "weka.clusterers.AbstractClusterer",
      "weka.core.TestInstances",
      "weka.core.DistanceFunction",
      "org.pentaho.packageManagement.PackageConstraint",
      "org.pentaho.packageManagement.Package",
      "weka.core.OptionHandler",
      "weka.core.WekaException",
      "weka.core.Range",
      "weka.filters.UnsupervisedFilter",
      "weka.core.Attribute$1",
      "weka.core.logging.Logger$Level",
      "weka.core.Statistics",
      "weka.core.scripting.JythonSerializableObject",
      "weka.core.Capabilities$Capability",
      "weka.core.SparseInstance",
      "weka.core.DenseInstance",
      "org.pentaho.packageManagement.PackageManager",
      "weka.core.WekaEnumeration",
      "weka.filters.unsupervised.attribute.ReplaceMissingValues",
      "org.pentaho.packageManagement.DefaultPackageManager",
      "weka.core.WekaPackageManager",
      "org.bounce.net.DefaultAuthenticator",
      "weka.estimators.EstimatorUtils",
      "weka.core.TechnicalInformationHandler",
      "weka.estimators.IncrementalEstimator",
      "weka.clusterers.NumberOfClustersRequestable",
      "weka.estimators.Estimator$Builder",
      "weka.clusterers.Clusterer",
      "weka.core.Option",
      "weka.filters.unsupervised.attribute.PotentialClassIgnorer",
      "weka.estimators.NormalEstimator",
      "weka.filters.Sourcable",
      "weka.core.Utils",
      "weka.core.CustomDisplayStringProvider",
      "weka.core.NormalizableDistance",
      "weka.clusterers.AbstractDensityBasedClusterer",
      "weka.core.Attribute",
      "weka.core.NoSupportForMissingValuesException",
      "weka.clusterers.SimpleKMeans",
      "weka.classifiers.UpdateableClassifier",
      "weka.estimators.CheckEstimator$PostProcessor",
      "weka.core.FastVector",
      "weka.core.Copyable",
      "weka.core.Capabilities",
      "weka.core.BinarySparseInstance",
      "weka.core.UnassignedDatasetException",
      "weka.core.SerializedObject",
      "weka.clusterers.UpdateableClusterer",
      "weka.estimators.CheckEstimator",
      "weka.core.RevisionUtils",
      "org.pentaho.packageManagement.PackageManager$1",
      "weka.core.Instance",
      "weka.estimators.Estimator",
      "weka.clusterers.RandomizableDensityBasedClusterer",
      "weka.core.ProtectedProperties",
      "weka.clusterers.DensityBasedClusterer",
      "weka.core.AttributeStats",
      "weka.core.WeightedInstancesHandler",
      "weka.core.CapabilitiesHandler",
      "weka.core.Randomizable",
      "weka.core.EuclideanDistance",
      "weka.core.AbstractInstance",
      "weka.core.Instances",
      "weka.core.scripting.JythonObject",
      "weka.estimators.CheckEstimator$AttrTypes",
      "org.pentaho.packageManagement.DefaultPackage",
      "weka.core.UnassignedClassException",
      "weka.clusterers.RandomizableClusterer",
      "weka.core.Version",
      "weka.core.TechnicalInformation",
      "weka.core.UnsupportedAttributeTypeException",
      "weka.core.RevisionHandler",
      "weka.filters.Filter",
      "weka.clusterers.EM"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(CheckEstimator_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "weka.estimators.CheckEstimator",
      "weka.estimators.CheckEstimator$EstTypes",
      "weka.estimators.CheckEstimator$AttrTypes",
      "weka.estimators.CheckEstimator$PostProcessor",
      "weka.estimators.Estimator",
      "weka.estimators.NormalEstimator",
      "weka.core.Utils",
      "weka.core.TestInstances",
      "weka.core.Instances",
      "weka.core.FastVector",
      "weka.core.RevisionUtils",
      "weka.core.Attribute",
      "weka.core.ProtectedProperties",
      "weka.core.AbstractInstance",
      "weka.core.DenseInstance",
      "weka.filters.Filter",
      "weka.filters.AllFilter",
      "weka.core.Option",
      "weka.clusterers.AbstractClusterer",
      "weka.clusterers.RandomizableClusterer",
      "weka.clusterers.SimpleKMeans",
      "weka.core.NormalizableDistance",
      "weka.core.EuclideanDistance",
      "weka.core.Range",
      "weka.core.WekaEnumeration",
      "weka.core.SerializedObject",
      "weka.core.Capabilities",
      "org.pentaho.packageManagement.PackageManager",
      "org.pentaho.packageManagement.DefaultPackageManager",
      "weka.core.Version",
      "weka.core.Environment",
      "weka.core.WekaPackageManager",
      "weka.core.Capabilities$Capability",
      "weka.core.WekaException",
      "weka.core.UnsupportedAttributeTypeException",
      "weka.core.SparseInstance",
      "weka.core.BinarySparseInstance",
      "weka.core.matrix.Matrix",
      "weka.estimators.MahalanobisEstimator",
      "weka.core.converters.ArffLoader$ArffReader",
      "weka.core.UnassignedDatasetException",
      "weka.core.Check",
      "weka.core.CheckOptionHandler",
      "weka.classifiers.AbstractClassifier",
      "weka.classifiers.rules.ZeroR",
      "weka.core.Tag",
      "weka.clusterers.HierarchicalClusterer",
      "weka.clusterers.AbstractDensityBasedClusterer",
      "weka.clusterers.RandomizableDensityBasedClusterer",
      "weka.clusterers.EM",
      "weka.estimators.PoissonEstimator",
      "weka.core.Statistics",
      "weka.core.ChebyshevDistance",
      "weka.estimators.KernelEstimator",
      "weka.filters.SimpleFilter",
      "weka.filters.SimpleStreamFilter",
      "weka.filters.MultiFilter",
      "weka.core.CheckGOE",
      "weka.core.Javadoc",
      "weka.core.TechnicalInformationHandlerJavadoc",
      "weka.core.MinkowskiDistance",
      "weka.estimators.DiscreteEstimator",
      "weka.estimators.Estimator$Builder",
      "weka.core.FindWithCapabilities",
      "weka.core.SingleIndex",
      "weka.clusterers.SingleClustererEnhancer",
      "weka.clusterers.FilteredClusterer",
      "weka.core.ManhattanDistance",
      "weka.core.GlobalInfoJavadoc",
      "weka.core.OptionHandlerJavadoc",
      "weka.core.ListOptions",
      "weka.clusterers.MakeDensityBasedClusterer",
      "weka.clusterers.FarthestFirst",
      "weka.core.Attribute$1",
      "weka.clusterers.Cobweb",
      "weka.core.ClassDiscovery",
      "weka.core.ClassCache",
      "weka.core.AllJavadoc",
      "weka.core.AttributeStats",
      "weka.experiment.Stats",
      "weka.core.converters.ConverterUtils$DataSource",
      "weka.core.converters.AbstractLoader",
      "weka.core.converters.AbstractFileLoader",
      "weka.core.converters.ArffLoader",
      "weka.core.TechnicalInformation",
      "weka.core.TechnicalInformation$Type",
      "weka.core.TechnicalInformation$Field",
      "weka.core.matrix.LUDecomposition",
      "weka.core.matrix.EigenvalueDecomposition",
      "weka.core.matrix.Maths",
      "weka.core.matrix.LinearRegression",
      "weka.estimators.EstimatorUtils",
      "weka.clusterers.ClusterEvaluation",
      "weka.core.NoSupportForMissingValuesException"
    );
  }
}
