/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Aug 23 17:47:07 GMT 2018
 */

package org.quickserver.net.server;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class TheClient_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.quickserver.net.server.TheClient"; 
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
    java.lang.System.setProperty("user.dir", "/home/ubuntu/evosuite_readability_gen/projects/93_quickserver"); 
    java.lang.System.setProperty("user.home", "/home/ubuntu"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "ubuntu"); 
    java.lang.System.setProperty("user.timezone", "Etc/UTC"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(TheClient_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.pool.PoolableObjectFactory",
      "org.quickserver.net.server.AuthStatus",
      "org.apache.commons.pool.ObjectPool",
      "org.quickserver.net.server.QuickServer",
      "org.quickserver.util.xmlreader.ClientHandlerObjectPoolConfig",
      "org.quickserver.util.xmlreader.Secure",
      "org.quickserver.net.server.ClientExtendedEventHandler",
      "org.quickserver.net.server.ClientAuthenticationHandler",
      "org.quickserver.net.server.ClientEventHandler",
      "org.quickserver.net.qsadmin.Authenticator",
      "org.quickserver.util.xmlreader.BasicServerConfig",
      "org.quickserver.net.server.ClientObjectHandler",
      "org.quickserver.net.server.DataMode",
      "org.quickserver.net.qsadmin.CommandHandler",
      "org.quickserver.net.ConnectionLostException",
      "org.quickserver.net.server.ClientEvent",
      "org.quickserver.util.xmlreader.ByteBufferObjectPoolConfig",
      "org.quickserver.util.xmlreader.ClientDataObjectPoolConfig",
      "org.quickserver.net.server.impl.DefaultClientEventHandler",
      "org.quickserver.net.server.ClientHandler",
      "org.quickserver.util.pool.QSObjectPool",
      "org.quickserver.util.io.ByteBufferOutputStream",
      "org.quickserver.net.qsadmin.QSAdminServer",
      "org.quickserver.net.server.ClientWriteHandler",
      "org.quickserver.net.qsadmin.Data",
      "org.quickserver.util.xmlreader.ServerHooks",
      "org.quickserver.net.server.ClientData",
      "org.quickserver.util.xmlreader.ThreadObjectPoolConfig",
      "org.quickserver.sql.DBPoolUtil",
      "org.quickserver.net.server.ClientCommandHandler",
      "org.quickserver.util.pool.thread.ClientPool",
      "org.quickserver.util.xmlreader.ObjectPoolConfig",
      "org.quickserver.net.server.ClientIdentifier",
      "org.quickserver.net.server.impl.BasicClientHandler$InstanceId",
      "org.quickserver.util.xmlreader.PoolConfig",
      "org.quickserver.util.io.ByteBufferInputStream",
      "org.quickserver.util.xmlreader.ServerMode",
      "org.quickserver.util.xmlreader.DefaultDataMode",
      "org.quickserver.util.xmlreader.AccessConstraintConfig",
      "org.quickserver.net.server.impl.BasicClientHandler",
      "org.quickserver.util.xmlreader.QSAdminServerConfig",
      "org.quickserver.net.server.ClientBinaryHandler",
      "org.quickserver.net.ServerHook",
      "org.quickserver.net.server.impl.NonBlockingClientHandler",
      "org.quickserver.util.xmlreader.QuickServerConfig",
      "org.quickserver.net.Service",
      "org.quickserver.net.server.impl.BlockingClientHandler",
      "org.quickserver.net.server.TheClient",
      "org.quickserver.util.xmlreader.DBObjectPoolConfig",
      "org.quickserver.util.xmlreader.AdvancedSettings",
      "org.quickserver.util.xmlreader.SecureStore",
      "org.quickserver.net.AppException",
      "org.quickserver.util.xmlreader.ConfigReader",
      "org.quickserver.net.server.QuickAuthenticationHandler",
      "org.quickserver.net.server.Authenticator",
      "org.quickserver.net.server.DataType"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(TheClient_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.quickserver.net.server.TheClient",
      "org.quickserver.net.server.ClientEvent",
      "org.quickserver.net.server.impl.DefaultClientEventHandler",
      "org.quickserver.net.server.QuickServer",
      "org.quickserver.net.server.impl.BasicClientHandler",
      "org.quickserver.net.server.impl.BlockingClientHandler",
      "org.quickserver.net.server.impl.BasicClientHandler$InstanceId",
      "org.quickserver.util.xmlreader.BasicServerConfig",
      "org.quickserver.util.xmlreader.QuickServerConfig",
      "org.quickserver.util.xmlreader.PoolConfig",
      "org.quickserver.util.xmlreader.ObjectPoolConfig",
      "org.quickserver.util.xmlreader.Secure",
      "org.quickserver.util.xmlreader.SecureStore",
      "org.quickserver.util.xmlreader.ServerMode",
      "org.quickserver.util.xmlreader.AdvancedSettings",
      "org.quickserver.util.xmlreader.DefaultDataMode",
      "org.quickserver.net.server.DataMode",
      "org.quickserver.net.server.QuickAuthenticationHandler",
      "org.quickserver.net.qsadmin.Authenticator",
      "org.quickserver.net.qsadmin.CommandHandler",
      "org.quickserver.util.xmlreader.ConfigReader",
      "org.quickserver.net.AppException",
      "org.quickserver.net.server.impl.NonBlockingClientHandler",
      "org.quickserver.net.qsadmin.Data",
      "org.quickserver.util.xmlreader.ThreadObjectPoolConfig",
      "org.apache.commons.pool.BasePoolableObjectFactory",
      "org.quickserver.util.pool.thread.ThreadObjectFactory",
      "org.quickserver.util.MyString",
      "org.quickserver.net.qsadmin.QSAdminServer"
    );
  }
}
