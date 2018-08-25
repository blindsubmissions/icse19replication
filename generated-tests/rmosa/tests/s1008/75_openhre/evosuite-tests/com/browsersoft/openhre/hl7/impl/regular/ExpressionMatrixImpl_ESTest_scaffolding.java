/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Aug 23 08:55:33 GMT 2018
 */

package com.browsersoft.openhre.hl7.impl.regular;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ExpressionMatrixImpl_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl"; 
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
    java.lang.System.setProperty("user.dir", "/home/ubuntu/evosuite_readability_gen/projects/75_openhre"); 
    java.lang.System.setProperty("user.home", "/home/ubuntu"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "ubuntu"); 
    java.lang.System.setProperty("user.timezone", "Etc/UTC"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ExpressionMatrixImpl_ESTest_scaffolding.class.getClassLoader() ,
      "com.browsersoft.openhre.hl7.impl.regular.ExpressionImpl",
      "com.browsersoft.openhre.hl7.api.regular.Expression",
      "com.browsersoft.openhre.hl7.impl.regular.MessageTracerImpl",
      "com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl",
      "com.browsersoft.openhre.hl7.impl.config.HL7MessageSegmentImpl",
      "com.browsersoft.openhre.hl7.api.regular.MessageTracerHandler",
      "com.browsersoft.openhre.hl7.api.regular.InvalidExpressionException",
      "com.browsersoft.openhre.hl7.impl.config.HL7MessageImpl",
      "com.browsersoft.openhre.hl7.api.regular.ExpressionElementMapper",
      "com.browsersoft.openhre.hl7.api.regular.MessageTracer",
      "com.browsersoft.openhre.hl7.api.regular.ExpressionMatrixBuilder",
      "com.browsersoft.openhre.hl7.api.config.HL7MessageSegment",
      "com.browsersoft.openhre.hl7.api.regular.ExpressionMatrix",
      "com.browsersoft.openhre.hl7.api.config.HL7MessageGroupItem",
      "com.browsersoft.openhre.hl7.impl.config.HL7MessageGroupImpl",
      "com.browsersoft.openhre.hl7.impl.regular.ExpressionPartImpl",
      "com.browsersoft.openhre.hl7.api.regular.ExpressionPart",
      "com.browsersoft.openhre.hl7.impl.regular.ExpressionElementMapperImpl",
      "com.browsersoft.openhre.hl7.api.config.HL7Message",
      "com.browsersoft.openhre.hl7.impl.config.HL7MessageGroupItemImpl",
      "com.browsersoft.openhre.hl7.api.regular.ExpressionElementMapperItem",
      "com.browsersoft.openhre.hl7.api.config.HL7Segment",
      "com.browsersoft.openhre.hl7.api.config.HL7MessageGroup"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ExpressionMatrixImpl_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl",
      "com.browsersoft.openhre.hl7.impl.regular.ExpressionElementMapperImpl",
      "com.browsersoft.openhre.hl7.impl.regular.ExpressionElementMapperItemImpl",
      "com.browsersoft.openhre.hl7.impl.regular.MessageTracerImpl",
      "com.browsersoft.openhre.hl7.impl.regular.ExpressionImpl",
      "com.browsersoft.openhre.hl7.impl.config.HL7MessageGroupItemImpl",
      "com.browsersoft.openhre.hl7.impl.config.HL7MessageGroupImpl",
      "com.browsersoft.openhre.hl7.impl.regular.ExpressionPartImpl",
      "com.browsersoft.openhre.hl7.impl.config.HL7MessageImpl",
      "com.browsersoft.openhre.hl7.impl.parser.HL7SAXEventGeneratorImpl",
      "com.browsersoft.openhre.hl7.impl.parser.HL7CheckerImpl",
      "com.browsersoft.openhre.hl7.impl.parser.HL7ParserImpl",
      "com.browsersoft.openhre.hl7.impl.parser.HL7CheckerStateImpl",
      "com.browsersoft.openhre.hl7.impl.config.HL7MessageSegmentImpl",
      "com.browsersoft.openhre.hl7.impl.config.HL7SegmentImpl",
      "com.browsersoft.openhre.hl7.impl.config.HL7FieldListImpl",
      "com.browsersoft.openhre.hl7.impl.config.HL7MessageMapImpl",
      "com.browsersoft.openhre.hl7.impl.parser.HL72XMLImpl",
      "com.browsersoft.openhre.hl7.impl.parser.XMLUtils"
    );
  }
}
