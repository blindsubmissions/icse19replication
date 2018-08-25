/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Aug 24 11:05:26 GMT 2018
 */

package org.firebirdsql.jdbc;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class FBCachedFetcher_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.firebirdsql.jdbc.FBCachedFetcher"; 
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
    java.lang.System.setProperty("user.dir", "/home/ubuntu/ext1/evosuite_readability_gen/projects/110_firebird"); 
    java.lang.System.setProperty("user.home", "/root"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "root"); 
    java.lang.System.setProperty("user.timezone", "GMT"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(FBCachedFetcher_ESTest_scaffolding.class.getClassLoader() ,
      "org.firebirdsql.jdbc.FBResultSet",
      "org.firebirdsql.jdbc.FBResultSetNotUpdatableException",
      "org.firebirdsql.jdbc.field.FieldDataProvider",
      "org.firebirdsql.jdbc.FirebirdRowUpdater",
      "org.firebirdsql.gds.GDSException",
      "org.firebirdsql.jdbc.FBObjectListener$BlobListener",
      "org.firebirdsql.gds.IscStmtHandle",
      "org.firebirdsql.jdbc.FBObjectListener$StatementListener",
      "org.firebirdsql.jdbc.FBDriverNotCapableException",
      "org.firebirdsql.jdbc.FBSQLException",
      "org.firebirdsql.jdbc.AbstractResultSet",
      "org.firebirdsql.gds.XSQLVAR",
      "org.firebirdsql.jdbc.Synchronizable",
      "org.firebirdsql.gds.impl.GDSHelper",
      "org.firebirdsql.jdbc.FBObjectListener",
      "org.firebirdsql.jdbc.FBCachedFetcher",
      "org.firebirdsql.jdbc.FirebirdResultSet",
      "org.firebirdsql.jdbc.FBSQLWarning",
      "org.firebirdsql.jdbc.FBFetcher",
      "org.firebirdsql.jdbc.FirebirdStatement",
      "org.firebirdsql.jdbc.FBObjectListener$FetcherListener",
      "org.firebirdsql.jdbc.AbstractStatement",
      "org.firebirdsql.jdbc.FBObjectListener$ResultSetListener",
      "org.firebirdsql.jdbc.field.FBField",
      "org.firebirdsql.gds.impl.AbstractIscStmtHandle"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(FBCachedFetcher_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.firebirdsql.jdbc.FBCachedFetcher",
      "org.firebirdsql.jdbc.FBCachedFetcher$1",
      "org.firebirdsql.gds.impl.AbstractGDS",
      "org.firebirdsql.logging.LoggerFactory",
      "org.firebirdsql.logging.LoggerFactory$1",
      "org.firebirdsql.gds.impl.jni.BaseGDSImpl",
      "org.firebirdsql.gds.impl.jni.JniGDSImpl$1",
      "org.firebirdsql.gds.impl.jni.JniGDSImpl",
      "org.firebirdsql.jca.FBManagedConnection$1",
      "org.firebirdsql.jca.FBManagedConnection$2",
      "org.firebirdsql.jca.FBManagedConnection$3",
      "org.firebirdsql.jca.FBManagedConnection$4",
      "org.firebirdsql.jca.FBManagedConnection$5",
      "org.firebirdsql.jca.FBManagedConnection",
      "org.firebirdsql.gds.XSQLVAR",
      "org.firebirdsql.gds.impl.GDSFactory$ReversedStringComparator",
      "org.firebirdsql.gds.impl.BaseGDSFactoryPlugin",
      "org.firebirdsql.gds.impl.wire.WireGDSFactoryPlugin",
      "org.firebirdsql.gds.impl.jni.NativeGDSFactoryPlugin",
      "org.firebirdsql.gds.impl.jni.LocalGDSFactoryPlugin",
      "org.firebirdsql.gds.impl.jni.EmbeddedGDSFactoryPlugin",
      "org.firebirdsql.gds.impl.oo.OOGDSFactoryPlugin",
      "org.firebirdsql.gds.impl.GDSFactory",
      "org.firebirdsql.gds.impl.GDSType",
      "org.firebirdsql.jdbc.AbstractConnection",
      "org.firebirdsql.jdbc.FBConnection",
      "org.firebirdsql.jdbc.InternalTransactionCoordinator",
      "org.firebirdsql.jdbc.AbstractResultSet",
      "org.firebirdsql.jdbc.FBResultSet",
      "org.firebirdsql.jdbc.FBConnectionProperties",
      "org.firebirdsql.jca.FBManagedConnectionFactory",
      "org.firebirdsql.jca.FBStandAloneConnectionManager",
      "org.firebirdsql.jdbc.AbstractResultSet$1",
      "org.firebirdsql.jdbc.field.FBField",
      "org.firebirdsql.jdbc.FBSQLException",
      "org.firebirdsql.jdbc.field.TypeConversionException",
      "org.firebirdsql.gds.impl.AbstractIscStmtHandle",
      "org.firebirdsql.gds.impl.jni.isc_stmt_handle_impl",
      "org.firebirdsql.jdbc.InternalTransactionCoordinator$AbstractTransactionCoordinator",
      "org.firebirdsql.jdbc.InternalTransactionCoordinator$MetaDataTransactionCoordinator",
      "org.firebirdsql.jdbc.DummyCallableStatementMetaData",
      "org.firebirdsql.gds.XSQLVAR$datetime",
      "org.firebirdsql.gds.impl.wire.isc_stmt_handle_impl",
      "org.firebirdsql.jdbc.AbstractStatement",
      "org.firebirdsql.jdbc.AbstractPreparedStatement",
      "org.firebirdsql.jdbc.FBPreparedStatement",
      "org.firebirdsql.jdbc.AbstractStatement$RSListener",
      "org.firebirdsql.gds.impl.wire.ParameterBufferBase",
      "org.firebirdsql.gds.impl.wire.DatabaseParameterBufferImp",
      "org.firebirdsql.jca.FBConnectionRequestInfo",
      "org.firebirdsql.gds.impl.AbstractIscDbHandle",
      "org.firebirdsql.gds.impl.jni.isc_db_handle_impl",
      "org.firebirdsql.gds.impl.GDSHelper",
      "org.firebirdsql.jdbc.FBStatement",
      "org.firebirdsql.gds.impl.jni.ParameterBufferBase",
      "org.firebirdsql.gds.impl.jni.DatabaseParameterBufferImp",
      "org.firebirdsql.gds.impl.jni.isc_blob_handle_impl",
      "org.firebirdsql.jdbc.FBResultSetNotUpdatableException",
      "org.firebirdsql.jdbc.FBDriverNotCapableException",
      "org.firebirdsql.jdbc.InternalTransactionCoordinator$LocalTransactionCoordinator",
      "org.firebirdsql.jdbc.InternalTransactionCoordinator$ManagedTransactionCoordinator",
      "org.firebirdsql.gds.impl.wire.AbstractJavaGDSImpl",
      "org.firebirdsql.gds.impl.wire.JavaGDSImpl",
      "org.firebirdsql.jdbc.AbstractCallableStatement",
      "org.firebirdsql.jdbc.FBCallableStatement",
      "org.firebirdsql.gds.impl.wire.isc_db_handle_impl",
      "org.firebirdsql.jdbc.DefaultCallableStatementMetaData",
      "org.firebirdsql.gds.impl.wire.WireGDSFactoryPlugin$GDSHolder",
      "org.firebirdsql.gds.impl.AbstractIscTrHandle",
      "org.firebirdsql.gds.impl.wire.isc_tr_handle_impl",
      "org.firebirdsql.gds.impl.DatabaseParameterBufferExtension",
      "org.firebirdsql.gds.XSQLDA",
      "org.firebirdsql.gds.GDSException"
    );
  }
}
