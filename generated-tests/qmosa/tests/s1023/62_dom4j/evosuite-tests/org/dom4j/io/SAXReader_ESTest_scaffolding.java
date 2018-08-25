/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Aug 24 17:24:34 GMT 2018
 */

package org.dom4j.io;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class SAXReader_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  protected static ExecutorService executor; 

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.dom4j.io.SAXReader"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    executor = Executors.newCachedThreadPool(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    executor.shutdownNow(); 
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
    java.lang.System.setProperty("user.dir", "/home/ubuntu/ext1/evosuite_readability_gen/projects/62_dom4j"); 
    java.lang.System.setProperty("user.home", "/root"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "root"); 
    java.lang.System.setProperty("user.timezone", "GMT"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(SAXReader_ESTest_scaffolding.class.getClassLoader() ,
      "org.dom4j.tree.LazyList$Entry",
      "org.dom4j.tree.DefaultElement",
      "org.dom4j.Node",
      "org.dom4j.util.SingletonStrategy",
      "org.dom4j.io.SAXReader$SAXEntityResolver",
      "org.dom4j.InvalidXPathException",
      "org.dom4j.io.SAXReader",
      "org.dom4j.io.DispatchHandler",
      "org.dom4j.io.SAXHelper",
      "org.dom4j.Entity",
      "org.dom4j.tree.LazyList",
      "org.dom4j.tree.NamespaceStack",
      "org.dom4j.DocumentType",
      "org.dom4j.io.SAXModifyException",
      "org.dom4j.tree.AbstractBranch",
      "org.dom4j.tree.DefaultDocument",
      "org.dom4j.ProcessingInstruction",
      "org.dom4j.io.ElementStack",
      "org.dom4j.Namespace",
      "org.dom4j.tree.AbstractDocument",
      "org.dom4j.tree.NamespaceCache",
      "org.dom4j.util.SimpleSingleton",
      "org.dom4j.DefaultDocumentFactory",
      "org.dom4j.Attribute",
      "org.dom4j.io.SAXModifyElementHandler",
      "org.jaxen.VariableContext",
      "org.dom4j.Document",
      "org.dom4j.io.PruningDispatchHandler",
      "org.dom4j.tree.ConcurrentReaderHashMap",
      "org.dom4j.ElementHandler",
      "org.dom4j.tree.ConcurrentReaderHashMap$Entry",
      "org.dom4j.io.ElementModifier",
      "org.dom4j.dom.DOMNamespace",
      "org.dom4j.tree.QNameCache",
      "org.dom4j.tree.AbstractElement",
      "org.dom4j.DocumentFactory",
      "org.dom4j.DocumentException",
      "org.dom4j.io.JAXPHelper",
      "org.dom4j.CDATA",
      "org.dom4j.io.PruningElementStack",
      "org.dom4j.Comment",
      "org.dom4j.rule.Pattern",
      "org.dom4j.IllegalAddException",
      "org.dom4j.tree.AbstractNode",
      "org.dom4j.ElementPath",
      "org.dom4j.Visitor",
      "org.dom4j.tree.LazyList$LazyListIterator",
      "org.dom4j.tree.ConcurrentReaderHashMap$BarrierLock",
      "org.dom4j.CharacterData",
      "org.dom4j.bean.BeanElement",
      "org.dom4j.NodeFilter",
      "org.dom4j.tree.DefaultNamespace",
      "org.dom4j.Branch",
      "org.dom4j.Text",
      "org.dom4j.NodeType",
      "org.dom4j.XPath",
      "org.dom4j.bean.BeanDocumentFactory",
      "org.dom4j.io.SAXContentHandler",
      "org.dom4j.Element",
      "org.dom4j.QName"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.net.URLStreamHandler", false, SAXReader_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.dom4j.io.ElementModifier", false, SAXReader_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(SAXReader_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.dom4j.io.SAXReader",
      "org.dom4j.io.SAXReader$SAXEntityResolver",
      "org.dom4j.DefaultDocumentFactory",
      "org.dom4j.io.SAXHelper",
      "org.dom4j.io.SAXContentHandler",
      "org.dom4j.util.SimpleSingleton",
      "org.dom4j.tree.QNameCache",
      "org.dom4j.tree.NamespaceStack",
      "org.dom4j.io.ElementStack",
      "org.dom4j.tree.AbstractNode",
      "org.dom4j.tree.AbstractCharacterData",
      "org.dom4j.tree.AbstractText",
      "org.dom4j.tree.FlyweightText",
      "org.dom4j.tree.DefaultText",
      "org.dom4j.QName",
      "org.dom4j.tree.NamespaceCache",
      "org.dom4j.tree.ConcurrentReaderHashMap",
      "org.dom4j.tree.ConcurrentReaderHashMap$BarrierLock",
      "org.dom4j.tree.ConcurrentReaderHashMap$Entry",
      "org.dom4j.Namespace",
      "org.dom4j.tree.AbstractBranch",
      "org.dom4j.tree.AbstractElement",
      "org.dom4j.tree.DefaultElement",
      "org.dom4j.tree.LazyList",
      "org.dom4j.tree.LazyList$Entry",
      "org.dom4j.io.DispatchHandler",
      "org.dom4j.io.PruningElementStack",
      "org.dom4j.DocumentException",
      "org.dom4j.io.JAXPHelper",
      "org.dom4j.bean.BeanDocumentFactory",
      "org.dom4j.bean.BeanElement",
      "org.dom4j.bean.BeanAttributeList",
      "org.dom4j.bean.BeanMetaData",
      "org.dom4j.io.PruningDispatchHandler",
      "org.dom4j.tree.DefaultNamespace",
      "org.dom4j.dom.DOMNamespace",
      "org.dom4j.tree.AbstractDocument",
      "org.dom4j.tree.DefaultDocument",
      "org.dom4j.dom.DOMDocumentFactory",
      "org.dom4j.dom.DOMDocument",
      "org.dom4j.tree.LazyList$LazyListIterator",
      "org.dom4j.io.SAXModifyElementHandler",
      "org.dom4j.NodeType"
    );
  }
}
