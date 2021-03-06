/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Aug 07 14:36:07 GMT 2018
 */

package dk.statsbiblioteket.summa.common;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class Logging_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "dk.statsbiblioteket.summa.common.Logging"; 
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
    java.lang.System.setProperty("user.dir", "/home/ubuntu/evosuite_readability_gen/projects/44_summa"); 
    java.lang.System.setProperty("user.home", "/home/ubuntu"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "ubuntu"); 
    java.lang.System.setProperty("user.timezone", "Etc/UTC"); 
    java.lang.System.setProperty("log4j.configuration", "SUT.log4j.properties"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Logging_ESTest_scaffolding.class.getClassLoader() ,
      "dk.statsbiblioteket.util.qa.QAInfo$State",
      "org.apache.log4j.PropertyWatchdog",
      "org.apache.commons.logging.impl.SimpleLog",
      "dk.statsbiblioteket.summa.common.Logging$1",
      "dk.statsbiblioteket.summa.common.filter.Payload",
      "org.apache.log4j.or.ObjectRenderer",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.apache.log4j.PropertyConfigurator",
      "dk.statsbiblioteket.summa.common.util.StringMap",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.or.RendererMap",
      "org.apache.commons.logging.impl.Log4JLogger",
      "org.apache.log4j.ProvisionNode",
      "dk.statsbiblioteket.summa.common.util.ConvenientMap",
      "org.apache.log4j.Hierarchy",
      "org.apache.log4j.Logger",
      "dk.statsbiblioteket.util.qa.QAInfo",
      "dk.statsbiblioteket.util.Strings$2",
      "org.apache.log4j.helpers.FileWatchdog",
      "org.apache.log4j.Level",
      "dk.statsbiblioteket.summa.common.Logging$LogLevel",
      "dk.statsbiblioteket.summa.common.Logging",
      "dk.statsbiblioteket.util.Strings$1",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.Category",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.log4j.spi.RootLogger",
      "org.apache.commons.logging.impl.SLF4JLocationAwareLog",
      "org.apache.log4j.spi.AppenderAttachable",
      "org.apache.commons.logging.impl.NoOpLog",
      "org.apache.log4j.spi.RepositorySelector",
      "dk.statsbiblioteket.util.qa.QAInfo$Level",
      "org.apache.log4j.spi.RendererSupport",
      "org.apache.commons.logging.impl.Jdk13LumberjackLogger",
      "org.apache.log4j.Priority",
      "dk.statsbiblioteket.util.Strings",
      "org.apache.log4j.spi.LoggerFactory",
      "org.apache.log4j.CategoryKey",
      "dk.statsbiblioteket.summa.common.Record",
      "org.apache.log4j.spi.Configurator",
      "org.apache.commons.logging.impl.SimpleLog$1",
      "org.apache.log4j.spi.LoggerRepository",
      "org.apache.log4j.LogManager",
      "org.apache.log4j.or.DefaultRenderer",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.commons.logging.impl.Jdk14Logger"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Logging_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "dk.statsbiblioteket.summa.common.Logging",
      "dk.statsbiblioteket.summa.common.Logging$LogLevel",
      "dk.statsbiblioteket.util.qa.QAInfo$Level",
      "dk.statsbiblioteket.util.qa.QAInfo$State",
      "dk.statsbiblioteket.summa.common.Logging$1",
      "dk.statsbiblioteket.util.Strings$1",
      "dk.statsbiblioteket.util.Strings$2",
      "dk.statsbiblioteket.util.Strings",
      "org.apache.commons.logging.impl.NoOpLog",
      "org.apache.log4j.Level",
      "org.apache.log4j.Priority",
      "org.apache.commons.logging.impl.Log4JLogger",
      "org.apache.log4j.Category",
      "org.apache.log4j.Logger",
      "org.apache.log4j.Hierarchy",
      "org.apache.log4j.spi.RootLogger",
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
      "dk.statsbiblioteket.summa.common.filter.Payload",
      "dk.statsbiblioteket.summa.common.Record",
      "org.apache.commons.logging.impl.Jdk13LumberjackLogger",
      "org.apache.commons.logging.impl.LogKitLogger",
      "org.apache.commons.logging.impl.SimpleLog$1",
      "org.apache.commons.logging.impl.SimpleLog",
      "dk.statsbiblioteket.summa.common.util.StringMap",
      "dk.statsbiblioteket.summa.common.util.ConvenientMap",
      "org.apache.commons.logging.impl.Jdk14Logger",
      "dk.statsbiblioteket.util.Zips",
      "org.apache.log4j.spi.LoggingEvent",
      "org.apache.log4j.spi.ThrowableInformation",
      "org.apache.log4j.Layout",
      "org.apache.log4j.PatternLayout",
      "org.apache.log4j.helpers.PatternParser",
      "org.apache.log4j.helpers.FormattingInfo",
      "org.apache.log4j.AppenderSkeleton",
      "org.apache.log4j.WriterAppender",
      "org.apache.log4j.FileAppender",
      "org.apache.log4j.RollingFileAppender",
      "org.apache.log4j.helpers.OnlyOnceErrorHandler",
      "org.apache.log4j.helpers.PatternConverter",
      "org.apache.log4j.helpers.PatternParser$BasicPatternConverter",
      "org.apache.log4j.helpers.PatternParser$LiteralPatternConverter",
      "org.apache.log4j.helpers.QuietWriter",
      "org.apache.log4j.helpers.NullEnumeration",
      "org.apache.log4j.ConsoleAppender"
    );
  }
}
