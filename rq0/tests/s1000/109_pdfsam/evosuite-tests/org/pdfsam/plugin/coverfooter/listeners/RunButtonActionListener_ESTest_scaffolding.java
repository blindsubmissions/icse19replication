/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Aug 07 14:40:30 GMT 2018
 */

package org.pdfsam.plugin.coverfooter.listeners;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class RunButtonActionListener_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.pdfsam.plugin.coverfooter.listeners.RunButtonActionListener"; 
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
    java.lang.System.setProperty("user.dir", "/home/ubuntu/evosuite_readability_gen/projects/109_pdfsam"); 
    java.lang.System.setProperty("user.home", "/home/ubuntu"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "ubuntu"); 
    java.lang.System.setProperty("user.timezone", "Etc/UTC"); 
    java.lang.System.setProperty("log4j.configuration", "SUT.log4j.properties"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(RunButtonActionListener_ESTest_scaffolding.class.getClassLoader() ,
      "org.pdfsam.guiclient.exceptions.ConfigurationException",
      "org.pdfsam.guiclient.business.listeners.AbstractRunButtonActionListener",
      "org.pdfsam.guiclient.configuration.services.xml.strategy.XmlConfigStrategy",
      "org.apache.log4j.PropertyWatchdog",
      "org.pdfsam.guiclient.configuration.services.xml.strategy.DefaultXmlStrategy",
      "org.apache.log4j.or.ObjectRenderer",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.apache.log4j.PropertyConfigurator",
      "org.pdfsam.guiclient.plugins.interfaces.AbstractPlugablePanel",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.or.RendererMap",
      "org.pdfsam.guiclient.configuration.services.xml.strategy.AbstractXmlConfigStrategy",
      "org.apache.log4j.ProvisionNode",
      "org.apache.log4j.Hierarchy",
      "org.apache.log4j.Logger",
      "org.dom4j.DocumentException",
      "org.pdfsam.console.business.ConsoleServicesFacade",
      "org.apache.log4j.helpers.FileWatchdog",
      "org.pdfsam.guiclient.configuration.Configuration",
      "org.pdfsam.plugin.coverfooter.listeners.RunButtonActionListener",
      "org.pdfsam.guiclient.configuration.services.xml.strategy.BackwardCompatibilityXmlStrategy",
      "org.pdfsam.guiclient.commons.business.WorkExecutor$WorkQueue$PoolWorker",
      "org.apache.log4j.Level",
      "org.pdfsam.guiclient.utils.DialogUtility",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.Category",
      "org.pdfsam.guiclient.configuration.services.ConfigurationService",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.log4j.spi.RootLogger",
      "org.pdfsam.guiclient.configuration.services.xml.XmlConfigurationService",
      "org.pdfsam.guiclient.plugins.interfaces.Plugable",
      "org.apache.log4j.spi.AppenderAttachable",
      "org.pdfsam.guiclient.dto.PdfSelectionTableItem",
      "org.apache.log4j.spi.RepositorySelector",
      "org.pdfsam.plugin.coverfooter.GUI.CoverFooterMainGUI",
      "org.apache.log4j.spi.RendererSupport",
      "org.apache.log4j.Priority",
      "org.apache.log4j.spi.LoggerFactory",
      "org.apache.log4j.CategoryKey",
      "org.apache.log4j.spi.Configurator",
      "org.pdfsam.guiclient.configuration.services.ConfigurationServiceLocator",
      "org.pdfsam.guiclient.configuration.services.GuiConfigurationService",
      "org.apache.log4j.spi.LoggerRepository",
      "org.apache.log4j.LogManager",
      "org.apache.log4j.or.DefaultRenderer",
      "org.apache.log4j.helpers.OptionConverter",
      "org.pdfsam.guiclient.commons.business.WorkExecutor",
      "org.pdfsam.guiclient.commons.business.WorkExecutor$WorkQueue"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(RunButtonActionListener_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.pdfsam.guiclient.business.listeners.AbstractRunButtonActionListener",
      "org.apache.log4j.Category",
      "org.apache.log4j.Logger",
      "org.apache.log4j.Hierarchy",
      "org.apache.log4j.spi.RootLogger",
      "org.apache.log4j.Priority",
      "org.apache.log4j.Level",
      "org.apache.log4j.or.DefaultRenderer",
      "org.apache.log4j.or.RendererMap",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.PropertyConfigurator",
      "org.apache.log4j.LogManager",
      "org.apache.log4j.CategoryKey",
      "org.apache.log4j.ProvisionNode",
      "org.pdfsam.plugin.coverfooter.listeners.RunButtonActionListener",
      "org.pdfsam.guiclient.commons.business.WorkExecutor",
      "org.pdfsam.guiclient.configuration.Configuration",
      "org.pdfsam.guiclient.commons.business.SoundPlayer",
      "org.pdfsam.guiclient.plugins.interfaces.AbstractPlugablePanel",
      "org.pdfsam.plugin.coverfooter.GUI.CoverFooterMainGUI",
      "org.pdfsam.guiclient.configuration.services.ConfigurationServiceLocator",
      "org.pdfsam.guiclient.configuration.services.xml.XmlConfigurationService",
      "org.pdfsam.guiclient.commons.components.CommonComponentsFactory",
      "org.pdfsam.guiclient.commons.components.DefaultPopupMenu",
      "org.pdfsam.guiclient.commons.business.WorkExecutor$WorkQueue",
      "org.pdfsam.guiclient.commons.business.WorkExecutor$WorkQueue$PoolWorker",
      "org.pdfsam.guiclient.dto.StringItem",
      "org.pdfsam.guiclient.utils.FileExtensionUtility",
      "org.apache.commons.lang.StringUtils",
      "com.lowagie.text.pdf.PdfGraphics2D$HyperLinkKey",
      "org.dom4j.DocumentFactory",
      "org.dom4j.tree.QNameCache",
      "org.dom4j.bean.BeanDocumentFactory",
      "org.dom4j.bean.BeanMetaData",
      "org.dom4j.util.SimpleSingleton",
      "org.dom4j.QName",
      "org.dom4j.tree.AbstractNode",
      "org.dom4j.tree.NamespaceCache",
      "org.dom4j.tree.ConcurrentReaderHashMap",
      "org.dom4j.tree.ConcurrentReaderHashMap$BarrierLock",
      "org.dom4j.tree.ConcurrentReaderHashMap$Entry",
      "org.dom4j.Namespace",
      "org.dom4j.bean.BeanAttributeList",
      "org.dom4j.tree.AbstractAttribute",
      "org.dom4j.bean.BeanAttribute",
      "org.pdfsam.guiclient.utils.DialogUtility"
    );
  }
}
