/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Aug 07 14:32:14 GMT 2018
 */

package com.liferay.portal.json.jabsorb.serializer;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class LiferaySerializer_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.liferay.portal.json.jabsorb.serializer.LiferaySerializer"; 
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
    java.lang.System.setProperty("user.dir", "/home/ubuntu/evosuite_readability_gen/projects/108_liferay"); 
    java.lang.System.setProperty("user.home", "/home/ubuntu"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "ubuntu"); 
    java.lang.System.setProperty("user.timezone", "Etc/UTC"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(LiferaySerializer_ESTest_scaffolding.class.getClassLoader() ,
      "org.jabsorb.serializer.impl.BeanSerializer",
      "org.jabsorb.serializer.impl.PrimitiveSerializer",
      "org.json.JSONObject$Null",
      "org.jabsorb.serializer.impl.RawJSONObjectSerializer",
      "com.liferay.portal.json.jabsorb.serializer.LiferaySerializer",
      "org.jabsorb.serializer.impl.BooleanSerializer",
      "org.jabsorb.reflect.ClassData",
      "org.jabsorb.serializer.impl.ArraySerializer",
      "com.liferay.portal.kernel.log.Log",
      "org.jabsorb.serializer.ObjectMatch",
      "org.jabsorb.serializer.Serializer",
      "org.jabsorb.JSONRPCBridge$1",
      "com.liferay.portal.kernel.log.LogFactory",
      "org.json.JSONException",
      "org.json.JSONObject",
      "com.liferay.portal.kernel.log.Jdk14LogFactoryImpl",
      "org.jabsorb.JSONSerializer",
      "org.jabsorb.callback.InvocationCallback",
      "org.jabsorb.serializer.impl.ReferenceSerializer",
      "com.liferay.portal.kernel.log.LogWrapper",
      "org.jabsorb.serializer.AbstractSerializer",
      "org.jabsorb.serializer.impl.RawJSONArraySerializer",
      "org.jabsorb.JSONRPCResult",
      "org.jabsorb.serializer.impl.DictionarySerializer",
      "org.jabsorb.JSONRPCBridge$ObjectInstance",
      "com.liferay.portal.kernel.log.LogFactoryUtil",
      "org.jabsorb.serializer.impl.ListSerializer",
      "org.jabsorb.serializer.impl.NumberSerializer",
      "org.json.JSONTokener",
      "org.jabsorb.serializer.impl.StringSerializer",
      "org.jabsorb.JSONRPCBridge",
      "org.jabsorb.ExceptionTransformer",
      "org.jabsorb.serializer.impl.SetSerializer",
      "org.jabsorb.serializer.UnmarshallException",
      "com.liferay.portal.kernel.log.Jdk14LogImpl",
      "org.json.JSONString",
      "org.jabsorb.localarg.LocalArgResolver",
      "org.jabsorb.serializer.SerializerState",
      "org.jabsorb.serializer.impl.DateSerializer",
      "org.jabsorb.callback.CallbackController",
      "org.jabsorb.serializer.impl.MapSerializer",
      "org.jabsorb.serializer.ProcessedObject",
      "org.jabsorb.serializer.MarshallException",
      "org.json.JSONArray"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(LiferaySerializer_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.jabsorb.serializer.AbstractSerializer",
      "com.liferay.portal.kernel.log.Jdk14LogFactoryImpl",
      "com.liferay.portal.kernel.log.LogFactoryUtil",
      "com.liferay.portal.kernel.log.LogWrapper",
      "com.liferay.portal.kernel.log.Jdk14LogImpl",
      "com.liferay.portal.json.jabsorb.serializer.LiferaySerializer",
      "org.jabsorb.JSONSerializer",
      "org.springframework.transaction.annotation.Isolation",
      "org.springframework.transaction.annotation.Propagation",
      "org.jabsorb.serializer.SerializerState",
      "org.json.JSONObject$Null",
      "org.json.JSONObject",
      "org.testng.collections.Maps",
      "org.testng.log4testng.Logger",
      "org.testng.internal.AnnotationTypeEnum",
      "org.testng.xml.XmlSuite",
      "org.jabsorb.serializer.MarshallException",
      "org.json.JSONArray",
      "org.jabsorb.serializer.ProcessedObject",
      "org.json.JSONTokener",
      "org.json.JSONException",
      "org.jabsorb.serializer.UnmarshallException",
      "com.liferay.portal.kernel.security.pacl.permission.PortalRuntimePermission",
      "org.jruby.threading.DaemonThreadFactory",
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.data.general.AbstractSeriesDataset",
      "org.jfree.data.xy.AbstractXYDataset",
      "org.jfree.data.jdbc.JDBCXYDataset",
      "org.jfree.data.general.DatasetGroup",
      "org.jabsorb.serializer.FixUp",
      "org.jfree.data.xy.AbstractIntervalXYDataset",
      "org.jfree.data.time.TimeTableXYDataset",
      "org.jfree.data.DefaultKeyedValues2D",
      "org.jfree.data.time.TimePeriodAnchor",
      "org.jfree.data.xy.XYDatasetTableModel",
      "org.jabsorb.JSONRPCBridge$1",
      "org.jabsorb.serializer.impl.ReferenceSerializer",
      "org.jabsorb.serializer.impl.RawJSONArraySerializer",
      "org.jabsorb.serializer.impl.RawJSONObjectSerializer",
      "org.jabsorb.serializer.impl.BeanSerializer",
      "org.jabsorb.serializer.impl.ArraySerializer",
      "org.jabsorb.serializer.impl.DictionarySerializer",
      "org.jabsorb.serializer.impl.MapSerializer",
      "org.jabsorb.serializer.impl.SetSerializer",
      "org.jabsorb.serializer.impl.ListSerializer",
      "org.jabsorb.serializer.impl.DateSerializer",
      "org.jabsorb.serializer.impl.StringSerializer",
      "org.jabsorb.serializer.impl.NumberSerializer",
      "org.jabsorb.serializer.impl.BooleanSerializer",
      "org.jabsorb.serializer.impl.PrimitiveSerializer",
      "org.jabsorb.JSONRPCBridge",
      "org.jgroups.util.DefaultThreadFactory",
      "org.jfree.data.xy.CategoryTableXYDataset",
      "org.jfree.data.xy.IntervalXYDelegate",
      "org.testng.junit.JUnitUtils$JUnitTestClass",
      "org.testng.collections.Lists",
      "org.testng.junit.JUnitUtils$JUnitTestMethod",
      "org.testng.internal.annotations.DefaultAnnotationTransformer",
      "org.testng.internal.annotations.JDK15AnnotationFinder",
      "org.testng.internal.annotations.JDK15TagFactory$1",
      "org.testng.internal.annotations.JDK15TagFactory$2",
      "org.testng.internal.annotations.JDK15TagFactory",
      "org.testng.internal.BaseTestMethod$1",
      "org.testng.internal.BaseTestMethod",
      "org.testng.internal.ConfigurationMethod",
      "org.testng.internal.ConstructorOrMethod",
      "org.testng.internal.thread.ThreadUtil",
      "org.testng.internal.thread.AtomicIntegerAdapter",
      "org.jgroups.util.LazyThreadFactory",
      "org.jfree.data.xy.DefaultTableXYDataset",
      "org.jfree.data.general.DefaultValueDataset",
      "org.jfree.data.general.DatasetChangeEvent",
      "aQute.lib.osgi.Instruction",
      "aQute.libg.generics.Create",
      "org.apache.xmlbeans.GDateBuilder",
      "org.apache.xmlbeans.GDate",
      "org.apache.xmlbeans.GDuration",
      "org.apache.xmlbeans.XmlCalendar",
      "org.jfree.util.ObjectUtilities",
      "org.testng.TestNG",
      "org.jabsorb.serializer.impl.BeanSerializer$BeanData",
      "org.geotools.factory.Hints$Key",
      "org.geotools.factory.Hints$ClassKey",
      "org.geotools.factory.Hints$FileKey",
      "org.geotools.factory.Hints$DataSourceKey",
      "org.geotools.factory.Hints$OptionKey",
      "org.geotools.factory.Hints$IntegerKey",
      "org.geotools.factory.Hints$DoubleKey",
      "org.geotools.factory.Hints",
      "org.testng.internal.version.VersionInfo",
      "org.testng.internal.TestResult",
      "org.testng.internal.Attributes",
      "org.jabsorb.serializer.ObjectMatch",
      "org.testng.internal.annotations.Sets",
      "org.testng.CommandLineArgs",
      "org.jruby.util.CompoundJarURLStreamHandler",
      "org.jfree.data.time.RegularTimePeriod"
    );
  }
}
