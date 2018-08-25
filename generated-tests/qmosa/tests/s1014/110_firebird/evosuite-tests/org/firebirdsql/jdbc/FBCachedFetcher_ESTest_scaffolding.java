/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Aug 24 13:37:07 GMT 2018
 */

package org.firebirdsql.jdbc;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
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
    java.lang.System.setProperty("user.dir", "/home/ubuntu/ext1/evosuite_readability_gen/projects/110_firebird"); 
    java.lang.System.setProperty("user.home", "/root"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "root"); 
    java.lang.System.setProperty("user.timezone", "GMT"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(FBCachedFetcher_ESTest_scaffolding.class.getClassLoader() ,
      "org.firebirdsql.jdbc.FBResultSet",
      "org.firebirdsql.jdbc.AbstractConnection",
      "org.firebirdsql.jdbc.field.FieldDataProvider",
      "org.firebirdsql.jca.FBManagedConnection$1",
      "org.firebirdsql.jdbc.FirebirdConnectionProperties",
      "org.firebirdsql.logging.LoggerFactory$1",
      "org.firebirdsql.jdbc.FBObjectListener$BlobListener",
      "org.firebirdsql.logging.Logger",
      "org.firebirdsql.jca.FBIncorrectXidException",
      "org.firebirdsql.jca.FBManagedConnection$4",
      "org.firebirdsql.jdbc.FBSQLException",
      "org.firebirdsql.jca.FBManagedConnection$5",
      "org.firebirdsql.jdbc.InternalTransactionCoordinator$LocalTransactionCoordinator",
      "org.firebirdsql.jca.FBManagedConnection$2",
      "org.firebirdsql.gds.XSQLVAR",
      "org.firebirdsql.jca.FBManagedConnection$3",
      "org.firebirdsql.gds.impl.GDSHelper",
      "org.firebirdsql.jdbc.FBConnection",
      "org.firebirdsql.gds.GDSWarning",
      "org.firebirdsql.gds.GDS",
      "org.firebirdsql.jdbc.FBSQLWarning",
      "org.firebirdsql.jdbc.FirebirdResultSet",
      "org.firebirdsql.jdbc.InternalTransactionCoordinator$AutoCommitCoordinator",
      "org.firebirdsql.jca.FBResourceTransactionException",
      "org.firebirdsql.jdbc.FirebirdConnection",
      "org.firebirdsql.gds.IscTrHandle",
      "org.firebirdsql.gds.impl.DatabaseParameterBufferExtension",
      "org.firebirdsql.jdbc.InternalTransactionCoordinator",
      "org.firebirdsql.gds.impl.GDSHelper$GDSHelperErrorListener",
      "org.firebirdsql.jdbc.FBObjectListener$ResultSetListener",
      "org.firebirdsql.jdbc.field.FBField",
      "org.firebirdsql.gds.DatabaseParameterBuffer",
      "org.firebirdsql.gds.IscDbHandle",
      "org.firebirdsql.jdbc.FBResultSetNotUpdatableException",
      "org.firebirdsql.jca.FBManagedConnection",
      "org.firebirdsql.jdbc.FirebirdRowUpdater",
      "org.firebirdsql.jca.FBLocalTransaction",
      "org.firebirdsql.gds.GDSException",
      "org.firebirdsql.jdbc.InternalTransactionCoordinator$AbstractTransactionCoordinator",
      "org.firebirdsql.gds.impl.wire.isc_stmt_handle_impl",
      "org.firebirdsql.gds.IscStmtHandle",
      "org.firebirdsql.jca.FBConnectionRequestInfo",
      "org.firebirdsql.jdbc.FBObjectListener$StatementListener",
      "org.firebirdsql.jca.FBManagedConnectionFactory",
      "org.firebirdsql.jdbc.FirebirdSavepoint",
      "org.firebirdsql.jdbc.FBDriverNotCapableException",
      "org.firebirdsql.jca.FirebirdLocalTransaction",
      "org.firebirdsql.jdbc.FBSavepoint",
      "org.firebirdsql.jdbc.AbstractGeneratedKeysQuery",
      "org.firebirdsql.jdbc.AbstractResultSet",
      "org.firebirdsql.jdbc.FBDriverConsistencyCheckException",
      "org.firebirdsql.jdbc.Synchronizable",
      "org.firebirdsql.jca.FBManagedConnection$CELNotifier",
      "org.firebirdsql.jdbc.FBObjectListener",
      "org.firebirdsql.logging.Log4jLogger",
      "org.firebirdsql.jdbc.FBCachedFetcher",
      "org.firebirdsql.jdbc.AbstractConnection$GeneratedKeysQuery",
      "org.firebirdsql.gds.TransactionParameterBuffer",
      "org.firebirdsql.jdbc.FBFetcher",
      "org.firebirdsql.logging.LoggerFactory",
      "org.firebirdsql.jdbc.FirebirdStatement",
      "org.firebirdsql.jdbc.FBObjectListener$FetcherListener",
      "org.firebirdsql.jdbc.InternalTransactionCoordinator$ManagedTransactionCoordinator",
      "org.firebirdsql.util.SQLExceptionChainBuilder",
      "org.firebirdsql.gds.impl.AbstractIscTrHandle",
      "org.firebirdsql.jca.FBXAException",
      "org.firebirdsql.jdbc.AbstractStatement",
      "org.firebirdsql.gds.impl.AbstractIscStmtHandle",
      "org.firebirdsql.jca.FBResourceException"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("org.firebirdsql.jca.FBManagedConnection", false, FBCachedFetcher_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(FBCachedFetcher_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.firebirdsql.jdbc.FBCachedFetcher",
      "org.firebirdsql.jdbc.FBCachedFetcher$1",
      "org.firebirdsql.logging.LoggerFactory",
      "org.firebirdsql.logging.LoggerFactory$1",
      "org.firebirdsql.jca.FBManagedConnection$1",
      "org.firebirdsql.jca.FBManagedConnection$2",
      "org.firebirdsql.jca.FBManagedConnection$3",
      "org.firebirdsql.jca.FBManagedConnection$4",
      "org.firebirdsql.jca.FBManagedConnection$5",
      "org.firebirdsql.jca.FBManagedConnection",
      "org.firebirdsql.jdbc.AbstractConnection",
      "org.firebirdsql.jdbc.FBConnection",
      "org.firebirdsql.jdbc.InternalTransactionCoordinator",
      "org.firebirdsql.jdbc.AbstractResultSet",
      "org.firebirdsql.jdbc.FBResultSet",
      "org.firebirdsql.gds.impl.AbstractGDS",
      "org.firebirdsql.gds.impl.jni.BaseGDSImpl",
      "org.firebirdsql.gds.impl.jni.JniGDSImpl$1",
      "org.firebirdsql.gds.impl.jni.JniGDSImpl",
      "org.firebirdsql.gds.impl.GDSFactory$ReversedStringComparator",
      "org.firebirdsql.gds.impl.BaseGDSFactoryPlugin",
      "org.firebirdsql.gds.impl.wire.WireGDSFactoryPlugin",
      "org.firebirdsql.gds.impl.jni.NativeGDSFactoryPlugin",
      "org.firebirdsql.gds.impl.jni.LocalGDSFactoryPlugin",
      "org.firebirdsql.gds.impl.jni.EmbeddedGDSFactoryPlugin",
      "org.firebirdsql.gds.impl.oo.OOGDSFactoryPlugin",
      "org.firebirdsql.gds.impl.GDSFactory",
      "org.firebirdsql.gds.impl.GDSType",
      "org.firebirdsql.jca.FBLocalTransaction",
      "org.firebirdsql.jdbc.InternalTransactionCoordinator$AbstractTransactionCoordinator",
      "org.firebirdsql.jdbc.InternalTransactionCoordinator$LocalTransactionCoordinator",
      "org.firebirdsql.jdbc.AbstractStatement",
      "org.firebirdsql.jdbc.AbstractPreparedStatement",
      "org.firebirdsql.jdbc.FBPreparedStatement",
      "org.firebirdsql.jdbc.AbstractStatement$RSListener",
      "org.firebirdsql.jdbc.DummyCallableStatementMetaData",
      "org.firebirdsql.jdbc.AbstractCallableStatement",
      "org.firebirdsql.jdbc.FBCallableStatement",
      "org.firebirdsql.jdbc.FBConnectionProperties",
      "org.firebirdsql.jca.FBManagedConnectionFactory",
      "org.firebirdsql.jca.FBStandAloneConnectionManager",
      "org.firebirdsql.gds.XSQLVAR",
      "org.firebirdsql.gds.impl.jni.isc_blob_handle_impl",
      "org.firebirdsql.gds.impl.GDSHelper",
      "org.firebirdsql.gds.impl.wire.ParameterBufferBase",
      "org.firebirdsql.gds.impl.wire.DatabaseParameterBufferImp",
      "org.firebirdsql.gds.impl.wire.AbstractJavaGDSImpl",
      "org.firebirdsql.gds.impl.wire.JavaGDSImpl",
      "org.firebirdsql.gds.impl.AbstractIscDbHandle",
      "org.firebirdsql.gds.impl.jni.isc_db_handle_impl",
      "org.firebirdsql.jdbc.InternalTransactionCoordinator$MetaDataTransactionCoordinator",
      "org.firebirdsql.jdbc.FBEscapedCallParser",
      "org.firebirdsql.jdbc.FBEscapedParser",
      "org.firebirdsql.jdbc.FBProcedureCall",
      "org.firebirdsql.gds.impl.AbstractIscStmtHandle",
      "org.firebirdsql.gds.impl.wire.isc_stmt_handle_impl",
      "org.firebirdsql.gds.impl.wire.isc_db_handle_impl",
      "org.firebirdsql.gds.impl.jni.isc_stmt_handle_impl",
      "org.firebirdsql.jdbc.FBSQLException",
      "org.firebirdsql.jdbc.FBStatement",
      "org.firebirdsql.gds.impl.DatabaseParameterBufferExtension",
      "org.firebirdsql.jca.FBConnectionRequestInfo",
      "org.firebirdsql.jdbc.AbstractResultSet$1",
      "org.firebirdsql.jdbc.field.FBField",
      "org.firebirdsql.jdbc.field.TypeConversionException",
      "org.firebirdsql.jdbc.FBResultSetNotUpdatableException",
      "org.firebirdsql.gds.impl.jni.ParameterBufferBase",
      "org.firebirdsql.gds.impl.jni.DatabaseParameterBufferImp",
      "org.firebirdsql.gds.impl.wire.WireGDSFactoryPlugin$GDSHolder",
      "org.firebirdsql.jdbc.FBDriverNotCapableException",
      "org.firebirdsql.util.SQLExceptionChainBuilder"
    );
  }
}
