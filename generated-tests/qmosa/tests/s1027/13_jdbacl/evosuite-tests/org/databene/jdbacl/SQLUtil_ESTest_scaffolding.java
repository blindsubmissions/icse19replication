/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Aug 24 17:23:58 GMT 2018
 */

package org.databene.jdbacl;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class SQLUtil_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.databene.jdbacl.SQLUtil"; 
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
    java.lang.System.setProperty("user.dir", "/home/ubuntu/evosuite_readability_gen/projects/13_jdbacl"); 
    java.lang.System.setProperty("user.home", "/home/ubuntu"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "ubuntu"); 
    java.lang.System.setProperty("user.timezone", "Etc/UTC"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(SQLUtil_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.derby.iapi.sql.dictionary.SequenceDescriptor",
      "org.databene.commons.version.StringVersionNumberComponent",
      "org.databene.jdbacl.model.AbstractDBObject",
      "org.apache.derby.iapi.store.access.TransactionController",
      "org.apache.derby.iapi.services.locks.Limit",
      "org.databene.commons.CollectionUtil",
      "org.apache.derby.iapi.types.RowLocation",
      "org.databene.script.Expression",
      "org.apache.derby.impl.sql.execute.RowResultSet",
      "org.databene.commons.version.DateVersionNumberComponent",
      "org.databene.jdbacl.model.DBRow",
      "org.apache.derby.iapi.sql.execute.CursorActivation",
      "org.apache.derby.impl.store.raw.data.PageActions",
      "org.apache.derby.iapi.sql.dictionary.SubConstraintDescriptor",
      "org.apache.derby.catalog.TypeDescriptor",
      "org.databene.jdbacl.sql.parser.SQLParser$equality_expression_return",
      "org.firebirdsql.jdbc.FBCachedBlob",
      "org.apache.derby.impl.sql.catalog.SYSTRIGGERSRowFactory",
      "org.apache.derby.iapi.store.access.ScanController",
      "org.apache.derby.iapi.store.raw.Page",
      "org.apache.derby.iapi.sql.dictionary.TableDescriptor",
      "org.apache.derby.impl.sql.catalog.SYSFILESRowFactory",
      "org.apache.derby.iapi.services.property.PersistentSet",
      "org.apache.derby.iapi.sql.dictionary.IndexRowGenerator",
      "org.apache.derby.iapi.sql.dictionary.PermDescriptor",
      "org.apache.derby.iapi.sql.dictionary.PrivilegedSQLObject",
      "org.apache.derby.impl.sql.catalog.SYSSCHEMASRowFactory",
      "org.apache.derby.iapi.sql.dictionary.RoleClosureIterator",
      "org.apache.derby.impl.sql.catalog.SYSCOLPERMSRowFactory",
      "org.databene.jdbacl.model.DBCheckConstraint",
      "org.apache.derby.impl.sql.catalog.PermissionsCatalogRowFactory",
      "org.databene.jdbacl.sql.parser.SQLParser$exclusive_or_expression_return",
      "org.apache.derby.impl.sql.catalog.SYSSEQUENCESRowFactory",
      "org.apache.derby.iapi.store.raw.data.DataFactory",
      "org.databene.jdbacl.model.MultiColumnObject",
      "org.apache.derby.iapi.sql.dictionary.DataDictionary",
      "org.databene.jdbacl.sql.parser.SQLParser$commands_return",
      "org.antlr.runtime.tree.CommonTree",
      "org.databene.jdbacl.sql.parser.SQLParser$primary_return",
      "org.apache.derby.iapi.store.access.RowLocationRetRowSource",
      "org.antlr.runtime.MismatchedNotSetException",
      "org.apache.derby.iapi.services.context.Context",
      "org.apache.derby.iapi.types.Orderable",
      "org.postgresql.util.PSQLException",
      "org.apache.derby.impl.sql.catalog.DataDictionaryImpl",
      "org.firebirdsql.jdbc.FBDriverNotCapableException",
      "org.databene.jdbacl.model.DBUniqueConstraint",
      "org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream",
      "org.databene.jdbacl.model.TableHolder",
      "org.apache.derby.iapi.sql.execute.ExecIndexRow",
      "org.apache.derby.iapi.sql.conn.SQLSessionContext",
      "org.antlr.runtime.CharStream",
      "org.databene.jdbacl.sql.parser.SQLLexer",
      "org.apache.derby.iapi.sql.dictionary.FileInfoDescriptor",
      "org.databene.jdbacl.model.DBDataType$TypeDescriptor",
      "org.apache.derby.iapi.sql.execute.TemporaryRowHolder",
      "org.firebirdsql.jdbc.FirebirdBlob",
      "org.databene.jdbacl.model.TableContainer",
      "org.apache.derby.iapi.sql.dictionary.ColumnDescriptor",
      "org.apache.derby.impl.io.vfmem.BlockedByteArray",
      "org.apache.derby.impl.sql.catalog.SYSPERMSRowFactory",
      "org.databene.commons.Converter",
      "org.apache.derby.iapi.sql.execute.NoPutResultSet",
      "org.databene.jdbacl.model.DBForeignKeyConstraint",
      "org.apache.derby.impl.sql.catalog.SYSTABLESRowFactory",
      "org.apache.derby.iapi.store.raw.Loggable",
      "org.databene.commons.converter.ToStringConverter",
      "org.apache.derby.iapi.sql.execute.ExecRow",
      "org.antlr.runtime.Lexer",
      "org.apache.derby.impl.sql.catalog.SYSCOLUMNSRowFactory",
      "org.apache.derby.iapi.services.locks.Lockable",
      "org.apache.derby.impl.sql.catalog.SYSVIEWSRowFactory",
      "org.apache.derby.impl.sql.catalog.SYSCONGLOMERATESRowFactory",
      "org.antlr.runtime.MissingTokenException",
      "org.apache.derby.iapi.sql.dictionary.DependencyDescriptor",
      "org.apache.derby.iapi.util.ByteArray",
      "org.apache.derby.impl.io.vfmem.BlockedByteArrayOutputStream",
      "org.antlr.runtime.EarlyExitException",
      "org.apache.derby.iapi.error.StandardException",
      "org.apache.derby.iapi.sql.Activation",
      "org.apache.derby.impl.sql.catalog.SYSSTATISTICSRowFactory",
      "org.databene.jdbacl.model.FKChangeRule",
      "org.apache.derby.iapi.services.io.Storable",
      "org.postgresql.ds.PGConnectionPoolDataSource",
      "org.apache.derby.iapi.services.loader.GeneratedClass",
      "org.apache.derby.iapi.store.raw.xact.RawTransaction",
      "org.apache.derby.catalog.Dependable",
      "org.apache.derby.iapi.services.loader.GeneratedMethod",
      "org.apache.derby.iapi.services.property.PropertySetCallback",
      "org.firebirdsql.jdbc.FBSQLException",
      "org.antlr.runtime.Token",
      "org.apache.derby.iapi.sql.dictionary.DataDescriptorGenerator",
      "org.apache.derby.impl.store.raw.data.StoredPage",
      "org.antlr.runtime.Parser",
      "org.databene.jdbacl.model.DBObject",
      "org.apache.derby.impl.sql.catalog.SYSDUMMY1RowFactory",
      "org.databene.commons.AssertionError",
      "org.apache.derby.iapi.services.io.StreamStorable",
      "org.apache.derby.impl.sql.catalog.SYSCONSTRAINTSRowFactory",
      "org.apache.derby.impl.store.raw.data.BaseDataFileFactory",
      "org.apache.derby.impl.sql.catalog.TabInfoImpl",
      "org.antlr.runtime.tree.RewriteRuleElementStream",
      "org.databene.jdbacl.sql.ColumnExpression",
      "org.apache.derby.iapi.store.access.RowSource",
      "org.apache.derby.impl.sql.execute.NoPutResultSetImpl",
      "org.apache.derby.iapi.types.DataValueFactory",
      "org.apache.derby.iapi.sql.conn.LanguageConnectionContext",
      "org.antlr.runtime.NoViableAltException",
      "org.antlr.runtime.RecognizerSharedState",
      "org.antlr.runtime.CommonTokenStream",
      "org.apache.derby.impl.sql.catalog.SYSFOREIGNKEYSRowFactory",
      "org.databene.commons.OrderedSet",
      "org.antlr.runtime.RuleReturnScope",
      "org.apache.derby.iapi.types.StringDataValue",
      "org.apache.derby.iapi.sql.dictionary.RoleGrantDescriptor",
      "org.apache.derby.iapi.store.raw.Corruptable",
      "org.databene.commons.depend.Dependent",
      "org.apache.derby.iapi.types.DataTypeDescriptor",
      "org.databene.jdbacl.model.DBColumn",
      "org.databene.jdbacl.sql.parser.SQLParser$unary_expression_return",
      "org.apache.derby.iapi.store.raw.LockingPolicy",
      "org.antlr.runtime.tree.RewriteRuleSubtreeStream",
      "org.databene.jdbacl.model.ContainerComponent",
      "org.apache.derby.iapi.store.raw.ContainerHandle",
      "org.apache.derby.iapi.store.raw.StreamContainerHandle",
      "org.databene.jdbacl.model.DBPackage",
      "org.databene.jdbacl.sql.SQLParserUtil",
      "org.apache.derby.impl.sql.catalog.SYSTABLEPERMSRowFactory",
      "org.apache.derby.impl.sql.catalog.SYSROLESRowFactory",
      "org.apache.derby.impl.store.raw.data.BaseContainer",
      "org.apache.derby.io.StorageFile",
      "org.apache.derby.iapi.sql.dictionary.UniqueSQLObjectDescriptor",
      "org.databene.jdbacl.SQLUtil",
      "org.apache.derby.iapi.sql.depend.Provider",
      "org.apache.derby.impl.io.vfmem.VirtualFile",
      "org.apache.derby.iapi.services.monitor.ModuleControl",
      "org.databene.jdbacl.model.CompositeDBObject",
      "org.apache.derby.iapi.services.io.FormatableBitSet",
      "org.apache.derby.iapi.sql.dictionary.ConglomerateDescriptor",
      "org.apache.derby.iapi.sql.dictionary.GenericDescriptorList",
      "org.databene.jdbacl.sql.parser.SQLParser$value_return",
      "org.apache.derby.iapi.store.access.FileResource",
      "org.apache.derby.iapi.store.access.ConglomPropertyQueryable",
      "org.antlr.runtime.DFA",
      "org.h2.jdbcx.JdbcConnectionPool",
      "org.apache.derby.iapi.sql.ParameterValueSet",
      "org.databene.commons.converter.FormatHolder",
      "org.antlr.runtime.tree.RewriteEmptyStreamException",
      "org.apache.derby.iapi.sql.dictionary.SPSDescriptor",
      "org.apache.derby.iapi.store.raw.Transaction",
      "org.apache.derby.iapi.sql.dictionary.SystemColumn",
      "org.apache.derby.catalog.IndexDescriptor",
      "org.apache.derby.catalog.DependableFinder",
      "org.antlr.runtime.MismatchedRangeException",
      "org.apache.derby.iapi.sql.dictionary.RoutinePermsDescriptor",
      "org.apache.derby.iapi.sql.dictionary.UniqueTupleDescriptor",
      "org.apache.derby.iapi.services.loader.GeneratedByteCode",
      "org.postgresql.ds.common.BaseDataSource",
      "org.apache.derby.iapi.store.raw.RawStoreFactory",
      "org.databene.jdbacl.sql.parser.SQLParser",
      "org.postgresql.core.Logger",
      "org.databene.jdbacl.model.DBNotNullConstraint",
      "org.databene.jdbacl.model.DBDataType",
      "org.apache.derby.iapi.sql.execute.ConstantAction",
      "org.apache.derby.impl.store.raw.data.AllocationActions",
      "org.apache.derby.iapi.sql.dictionary.DefaultDescriptor",
      "org.databene.jdbacl.model.TableContainerSupport",
      "org.apache.derby.impl.sql.execute.BasicNoPutResultSetImpl",
      "org.antlr.runtime.tree.CommonTreeAdaptor",
      "org.apache.derby.impl.store.raw.data.BaseDataFileFactoryJ4",
      "org.apache.derby.impl.sql.catalog.SYSSTATEMENTSRowFactory",
      "org.antlr.runtime.UnwantedTokenException",
      "org.databene.jdbacl.model.DBTable",
      "org.apache.derby.iapi.sql.execute.CursorResultSet",
      "org.databene.commons.bean.HashCodeBuilder",
      "org.databene.commons.StringUtil",
      "org.apache.derby.impl.sql.catalog.SYSDEPENDSRowFactory",
      "org.antlr.runtime.tree.TreeAdaptor",
      "org.apache.derby.iapi.store.access.ConglomerateController",
      "org.databene.jdbacl.sql.parser.SQLParser$expression_return",
      "org.apache.derby.io.StorageRandomAccessFile",
      "org.apache.derby.catalog.UUID",
      "org.apache.derby.impl.io.vfmem.BlockedByteArrayInputStream",
      "org.apache.derby.iapi.sql.dictionary.TupleDescriptor",
      "org.databene.jdbacl.sql.parser.SQLParser$relational_expression_return",
      "org.databene.commons.Named",
      "org.apache.derby.io.StorageFactory",
      "org.antlr.runtime.CharStreamState",
      "org.databene.jdbacl.NameSpec",
      "org.apache.derby.iapi.sql.dictionary.ConstraintDescriptor",
      "org.apache.derby.iapi.sql.dictionary.ColumnDescriptorList",
      "org.apache.derby.impl.sql.catalog.SYSALIASESRowFactory",
      "org.apache.derby.iapi.sql.execute.ResultSetFactory",
      "org.databene.jdbacl.sql.parser.SQLParser$null_comparison_return",
      "org.databene.commons.Parser",
      "org.apache.derby.iapi.sql.execute.ExecPreparedStatement",
      "org.apache.derby.impl.store.raw.xact.Xact",
      "org.apache.derby.iapi.sql.ResultSet",
      "org.databene.jdbacl.model.DBSequence",
      "org.apache.derby.iapi.types.DataType",
      "org.apache.derby.iapi.services.daemon.Serviceable",
      "org.apache.derby.iapi.services.io.Formatable",
      "org.apache.derby.iapi.sql.execute.ScanQualifier",
      "org.apache.derby.impl.sql.catalog.SYSCHECKSRowFactory",
      "org.apache.derby.impl.store.raw.data.CachedPage",
      "org.antlr.runtime.tree.BaseTree",
      "org.databene.commons.ThreadAware",
      "org.databene.commons.version.VersionNumber",
      "org.apache.derby.iapi.sql.dictionary.ReferencedKeyConstraintDescriptor",
      "org.apache.derby.iapi.sql.depend.DependencyManager",
      "org.databene.jdbacl.model.DBIndex",
      "org.databene.script.expression.ConstantExpression",
      "org.apache.derby.impl.sql.execute.ConstantActionActivation",
      "org.databene.jdbacl.sql.parser.SQLParser$name_return",
      "org.antlr.runtime.BufferedTokenStream",
      "org.apache.derby.iapi.sql.dictionary.KeyConstraintDescriptor",
      "org.databene.jdbacl.model.DBConstraint",
      "org.databene.jdbacl.model.DefaultDBColumn",
      "org.apache.derby.impl.sql.catalog.TableKey",
      "org.firebirdsql.jdbc.Synchronizable",
      "org.apache.derby.iapi.sql.dictionary.TriggerDescriptor",
      "org.apache.derby.impl.sql.catalog.SYSROUTINEPERMSRowFactory",
      "org.antlr.runtime.BitSet",
      "org.databene.jdbacl.model.DBTableComponent",
      "org.apache.derby.iapi.store.access.Qualifier",
      "org.apache.derby.iapi.util.Matchable",
      "org.apache.derby.iapi.types.SQLChar",
      "org.apache.derby.impl.store.raw.xact.InternalXact",
      "org.apache.derby.iapi.sql.dictionary.ViewDescriptor",
      "org.databene.commons.collection.ListBasedSet",
      "org.apache.derby.iapi.sql.dictionary.AliasDescriptor",
      "org.apache.derby.iapi.types.VariableSizeDataValue",
      "org.databene.jdbacl.model.DBTrigger",
      "org.databene.jdbacl.sql.parser.SQLParser$in_expression_return",
      "org.apache.derby.iapi.services.locks.LockFactory",
      "org.antlr.runtime.tree.BaseTreeAdaptor",
      "org.apache.derby.iapi.services.monitor.ModuleSupportable",
      "org.apache.derby.iapi.services.locks.LockOwner",
      "org.antlr.runtime.tree.RewriteRuleTokenStream",
      "org.apache.derby.iapi.sql.dictionary.PermissionsDescriptor",
      "org.apache.derby.iapi.sql.dictionary.SubKeyConstraintDescriptor",
      "org.antlr.runtime.CommonToken",
      "org.postgresql.Driver",
      "org.databene.jdbacl.model.DBRowIterator",
      "org.apache.derby.impl.io.vfmem.PathUtil",
      "org.apache.derby.iapi.services.cache.Cacheable",
      "org.databene.jdbacl.sql.parser.SQLParser$between_expression_return",
      "org.databene.commons.version.NumberVersionNumberComponent",
      "org.apache.derby.iapi.store.raw.log.LogInstant",
      "org.databene.commons.Capitalization",
      "org.databene.commons.Assert",
      "org.apache.derby.iapi.services.cache.CacheableFactory",
      "org.apache.derby.iapi.sql.dictionary.CatalogRowFactory",
      "org.apache.derby.iapi.store.raw.log.LogFactory",
      "org.databene.commons.version.VersionNumberParser",
      "org.antlr.runtime.RecognitionException",
      "org.apache.derby.iapi.sql.PreparedStatement",
      "org.apache.derby.iapi.sql.dictionary.TablePermsDescriptor",
      "org.apache.derby.iapi.store.access.GenericScanController",
      "org.apache.derby.iapi.services.uuid.UUIDFactory",
      "org.databene.commons.OrderedMap$ProxyEntry",
      "org.apache.derby.impl.sql.catalog.SYSKEYSRowFactory",
      "org.apache.derby.catalog.AliasInfo",
      "org.apache.derby.iapi.sql.depend.Dependent",
      "org.apache.derby.iapi.sql.Row",
      "org.apache.derby.iapi.sql.dictionary.SchemaDescriptor",
      "org.apache.derby.impl.io.vfmem.DataStore",
      "org.databene.commons.Patterns",
      "org.databene.commons.NullSafeComparator",
      "org.databene.jdbacl.model.DefaultDatabase",
      "org.databene.commons.ParseException",
      "org.apache.derby.iapi.store.raw.data.RawContainerHandle",
      "org.apache.derby.impl.services.uuid.BasicUUID",
      "org.antlr.runtime.TokenSource",
      "org.apache.derby.iapi.sql.dictionary.ForeignKeyConstraintDescriptor",
      "org.databene.commons.HeavyweightIterator",
      "org.databene.jdbacl.sql.parser.SQLParser$and_expression_return",
      "org.databene.jdbacl.model.AbstractDBTableComponent",
      "org.apache.derby.iapi.types.DataValueDescriptor",
      "org.apache.derby.impl.store.raw.data.BasePage",
      "org.databene.jdbacl.sql.parser.SQLParser$multiplicative_expression_return",
      "org.apache.derby.iapi.services.context.ContextManager",
      "org.databene.jdbacl.sql.parser.SQLParser$additive_expression_return",
      "org.databene.jdbacl.sql.parser.TextHolder",
      "org.apache.derby.iapi.services.io.TypedFormat",
      "org.databene.commons.version.VersionNumberComponent",
      "org.apache.derby.impl.sql.execute.UnionResultSet",
      "org.databene.commons.collection.OrderedNameMap",
      "org.apache.derby.impl.sql.execute.BaseActivation",
      "org.databene.jdbacl.sql.parser.SQLLexer$DFA9",
      "org.antlr.runtime.TokenStream",
      "org.antlr.runtime.MismatchedTreeNodeException",
      "org.antlr.runtime.ParserRuleReturnScope",
      "org.apache.derby.iapi.types.NumberDataValue",
      "org.databene.commons.ArrayFormat",
      "org.apache.derby.iapi.store.access.DatabaseInstant",
      "org.antlr.runtime.ANTLRStringStream",
      "org.apache.derby.impl.io.vfmem.DataStoreEntry",
      "org.apache.derby.impl.store.raw.data.FileContainer",
      "org.databene.commons.SyntaxError",
      "org.antlr.runtime.IntStream",
      "org.apache.derby.iapi.sql.execute.ExecutionFactory",
      "org.apache.derby.iapi.sql.dictionary.ConstraintDescriptorList",
      "org.databene.commons.OrderedMap",
      "org.antlr.runtime.tree.RewriteCardinalityException",
      "org.apache.derby.iapi.sql.dictionary.ColPermsDescriptor",
      "org.databene.jdbacl.model.Database",
      "org.apache.derby.iapi.store.access.RowCountable",
      "org.databene.jdbacl.model.AbstractCompositeDBObject",
      "org.databene.jdbacl.model.DBCatalog",
      "org.apache.derby.iapi.types.ConcatableDataValue",
      "org.apache.derby.iapi.sql.execute.TupleFilter",
      "org.antlr.runtime.MismatchedSetException",
      "org.databene.jdbacl.model.DBPrimaryKeyConstraint",
      "org.antlr.runtime.MismatchedTokenException",
      "org.databene.jdbacl.model.SequenceHolder",
      "org.databene.jdbacl.sql.parser.SQLParser$DFA2",
      "org.databene.jdbacl.model.DBUniqueIndex",
      "org.apache.derby.iapi.sql.ResultDescription",
      "org.apache.derby.iapi.services.cache.CacheManager",
      "org.databene.jdbacl.model.DefaultDBTable",
      "org.databene.commons.iterator.TableRowIterator",
      "org.antlr.runtime.tree.Tree",
      "org.apache.derby.iapi.store.raw.ContainerKey",
      "org.databene.commons.ObjectNotFoundException",
      "org.apache.derby.iapi.sql.dictionary.SubCheckConstraintDescriptor",
      "org.apache.derby.iapi.services.daemon.DaemonService",
      "org.antlr.runtime.BaseRecognizer",
      "org.databene.jdbacl.model.DBSchema"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("org.databene.jdbacl.model.CompositeDBObject", false, SQLUtil_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(SQLUtil_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.databene.commons.CollectionUtil",
      "org.databene.jdbacl.SQLUtil",
      "org.databene.jdbacl.NameSpec",
      "org.databene.commons.converter.FormatHolder",
      "org.databene.commons.Capitalization",
      "org.databene.commons.converter.ToStringConverter",
      "org.databene.commons.ArrayFormat",
      "org.databene.commons.StringUtil",
      "org.databene.jdbacl.model.AbstractDBObject",
      "org.databene.jdbacl.model.AbstractCompositeDBObject",
      "org.databene.jdbacl.model.DefaultDBTable",
      "org.databene.commons.OrderedMap",
      "org.databene.commons.collection.OrderedNameMap",
      "org.databene.commons.OrderedSet",
      "org.databene.jdbacl.model.AbstractDBTableComponent",
      "org.databene.jdbacl.model.DBConstraint",
      "org.databene.jdbacl.model.DBForeignKeyConstraint",
      "org.databene.commons.Assert",
      "org.databene.jdbacl.model.FKChangeRule",
      "org.databene.commons.bean.HashCodeBuilder",
      "org.databene.commons.collection.ListBasedSet",
      "org.databene.commons.ObjectNotFoundException",
      "org.databene.jdbacl.model.DBCatalog",
      "org.databene.commons.version.VersionNumberComponent",
      "org.databene.commons.version.NumberVersionNumberComponent",
      "org.databene.commons.Parser",
      "org.databene.commons.version.VersionNumberParser",
      "org.databene.commons.version.VersionNumber",
      "org.databene.jdbacl.model.DBNotNullConstraint",
      "org.databene.commons.AssertionError",
      "org.h2.util.Tool",
      "org.h2.tools.Recover",
      "org.h2.util.IOUtils",
      "org.h2.util.New",
      "org.h2.store.fs.FileSystem",
      "org.h2.store.fs.FileSystemDisk",
      "org.databene.jdbacl.model.DBDataType",
      "org.databene.jdbacl.model.DBCheckConstraint",
      "org.antlr.runtime.ANTLRStringStream",
      "org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream",
      "org.databene.jdbacl.sql.SQLParserUtil",
      "org.antlr.runtime.BaseRecognizer",
      "org.antlr.runtime.Lexer",
      "org.antlr.runtime.DFA",
      "org.databene.jdbacl.sql.parser.SQLLexer",
      "org.antlr.runtime.RecognizerSharedState",
      "org.databene.jdbacl.sql.parser.SQLLexer$DFA9",
      "org.antlr.runtime.BufferedTokenStream",
      "org.antlr.runtime.CommonTokenStream",
      "org.antlr.runtime.Parser",
      "org.antlr.runtime.BitSet",
      "org.databene.jdbacl.sql.parser.SQLParser",
      "org.antlr.runtime.tree.BaseTreeAdaptor",
      "org.antlr.runtime.tree.CommonTreeAdaptor",
      "org.databene.jdbacl.sql.parser.SQLParser$DFA2",
      "org.antlr.runtime.RuleReturnScope",
      "org.antlr.runtime.ParserRuleReturnScope",
      "org.databene.jdbacl.sql.parser.SQLParser$expression_return",
      "org.antlr.runtime.CharStreamState",
      "org.antlr.runtime.CommonToken",
      "org.antlr.runtime.tree.BaseTree",
      "org.antlr.runtime.tree.CommonTree",
      "org.databene.jdbacl.sql.parser.SQLParser$and_expression_return",
      "org.databene.jdbacl.sql.parser.SQLParser$exclusive_or_expression_return",
      "org.databene.jdbacl.sql.parser.SQLParser$equality_expression_return",
      "org.databene.jdbacl.sql.parser.SQLParser$null_comparison_return",
      "org.databene.jdbacl.sql.parser.SQLParser$relational_expression_return",
      "org.databene.jdbacl.sql.parser.SQLParser$in_expression_return",
      "org.databene.jdbacl.sql.parser.SQLParser$between_expression_return",
      "org.databene.jdbacl.sql.parser.SQLParser$additive_expression_return",
      "org.databene.jdbacl.sql.parser.SQLParser$multiplicative_expression_return",
      "org.databene.jdbacl.sql.parser.SQLParser$unary_expression_return",
      "org.databene.jdbacl.sql.parser.SQLParser$primary_return",
      "org.antlr.runtime.tree.RewriteRuleElementStream",
      "org.antlr.runtime.tree.RewriteRuleTokenStream",
      "org.antlr.runtime.tree.RewriteRuleSubtreeStream",
      "org.antlr.runtime.Token",
      "org.databene.jdbacl.sql.parser.SQLParser$value_return",
      "org.databene.jdbacl.sql.parser.SQLParser$name_return",
      "org.databene.script.expression.ConstantExpression",
      "org.databene.jdbacl.sql.ColumnExpression",
      "org.databene.jdbacl.model.DBDataType$TypeDescriptor",
      "org.databene.jdbacl.model.DefaultDBColumn",
      "org.apache.derby.iapi.store.raw.xact.RawTransaction",
      "org.databene.commons.OrderedMap$ProxyEntry",
      "org.databene.commons.version.StringVersionNumberComponent",
      "org.databene.jdbacl.model.DefaultDatabase",
      "org.databene.jdbacl.model.TableContainer",
      "org.databene.jdbacl.model.TableContainerSupport",
      "org.databene.jdbacl.model.DBUniqueConstraint",
      "org.databene.jdbacl.model.DBPrimaryKeyConstraint",
      "org.databene.jdbacl.model.DBSchema",
      "org.databene.jdbacl.model.DBSequence",
      "org.apache.derby.impl.sql.catalog.DataDictionaryImpl",
      "org.apache.derby.impl.services.uuid.BasicUUID",
      "org.apache.derby.iapi.sql.dictionary.TupleDescriptor",
      "org.apache.derby.iapi.sql.dictionary.SchemaDescriptor",
      "org.apache.derby.impl.sql.execute.BaseActivation",
      "org.apache.derby.impl.sql.execute.ConstantActionActivation",
      "org.h2.value.Value",
      "org.h2.value.ValueNull",
      "org.databene.jdbacl.model.DBTrigger",
      "org.databene.jdbacl.model.DBPackage",
      "org.databene.jdbacl.model.DBProcedure",
      "org.postgresql.core.Logger",
      "org.postgresql.Driver",
      "org.postgresql.ds.common.BaseDataSource",
      "org.postgresql.ds.PGConnectionPoolDataSource",
      "org.apache.derby.iapi.sql.dictionary.ConstraintDescriptorList",
      "org.apache.derby.impl.sql.compile.QueryTreeNode",
      "org.apache.derby.impl.sql.compile.TableElementNode",
      "org.apache.derby.impl.sql.compile.ConstraintDefinitionNode",
      "org.apache.derby.impl.sql.execute.rts.RealBasicNoPutResultSetStatistics",
      "org.apache.derby.impl.sql.execute.rts.RealNoPutResultSetStatistics",
      "org.apache.derby.impl.sql.execute.rts.RealTableScanStatistics",
      "org.apache.derby.iapi.services.io.FormatableProperties",
      "org.databene.jdbacl.sql.parser.SQLParser$literal_return",
      "org.databene.commons.ParseException",
      "org.databene.commons.SyntaxError",
      "org.postgresql.Driver$1",
      "org.postgresql.jdbc2.AbstractJdbc2Connection",
      "org.postgresql.jdbc3.AbstractJdbc3Connection",
      "org.postgresql.jdbc3g.AbstractJdbc3gConnection",
      "org.postgresql.jdbc4.AbstractJdbc4Connection",
      "org.postgresql.jdbc4.Jdbc4Connection",
      "org.postgresql.core.v3.ConnectionFactoryImpl",
      "org.postgresql.core.v2.ConnectionFactoryImpl",
      "org.postgresql.core.ConnectionFactory",
      "org.postgresql.core.PGStream",
      "org.postgresql.util.PSQLException",
      "org.postgresql.util.GT",
      "org.postgresql.util.PSQLState",
      "org.databene.commons.ArrayUtil",
      "org.databene.commons.NullSafeComparator",
      "org.apache.derby.iapi.sql.dictionary.ColumnDescriptorList",
      "org.apache.derby.impl.sql.compile.StatementNode",
      "org.apache.derby.impl.sql.compile.DDLStatementNode",
      "org.apache.derby.impl.sql.compile.AlterTableNode",
      "org.firebirdsql.gds.impl.jni.ParameterBufferBase",
      "org.firebirdsql.gds.impl.jni.DatabaseParameterBufferImp",
      "org.firebirdsql.gds.impl.AbstractIscDbHandle",
      "org.firebirdsql.gds.impl.jni.isc_db_handle_impl",
      "org.firebirdsql.logging.LoggerFactory",
      "org.firebirdsql.gds.impl.GDSHelper",
      "org.firebirdsql.jdbc.InternalTransactionCoordinator",
      "org.firebirdsql.jdbc.FBBlob",
      "org.apache.derby.iapi.sql.dictionary.TableDescriptor",
      "org.apache.derby.iapi.sql.dictionary.ConglomerateDescriptorList",
      "org.apache.derby.iapi.sql.dictionary.GenericDescriptorList",
      "org.apache.derby.vti.VTITemplate",
      "org.apache.derby.impl.jdbc.EmbedResultSetMetaData",
      "org.apache.derby.impl.sql.GenericColumnDescriptor",
      "org.apache.derby.catalog.types.BaseTypeIdImpl",
      "org.apache.derby.catalog.types.DecimalTypeIdImpl",
      "org.apache.derby.iapi.types.TypeId",
      "org.apache.derby.catalog.types.TypeDescriptorImpl",
      "org.apache.derby.iapi.types.DataTypeDescriptor",
      "org.apache.derby.diag.ErrorMessages",
      "org.apache.derby.impl.sql.compile.DMLStatementNode",
      "org.apache.derby.impl.sql.compile.DMLModStatementNode",
      "org.apache.derby.impl.sql.compile.DeleteNode",
      "org.firebirdsql.gds.impl.GDSFactory$ReversedStringComparator",
      "org.firebirdsql.gds.impl.wire.WireGDSFactoryPlugin",
      "org.firebirdsql.gds.impl.jni.NativeGDSFactoryPlugin",
      "org.firebirdsql.gds.impl.jni.LocalGDSFactoryPlugin",
      "org.firebirdsql.gds.impl.jni.EmbeddedGDSFactoryPlugin",
      "org.firebirdsql.gds.impl.GDSFactory",
      "org.firebirdsql.gds.impl.GDSType",
      "org.firebirdsql.jdbc.FBConnectionProperties",
      "org.firebirdsql.jca.FBManagedConnectionFactory",
      "org.firebirdsql.jca.FBStandAloneConnectionManager",
      "org.antlr.runtime.RecognitionException",
      "org.antlr.runtime.NoViableAltException",
      "org.databene.jdbacl.model.DBIndex",
      "org.databene.jdbacl.model.DBNonUniqueIndex",
      "org.databene.jdbacl.model.DBUniqueIndex",
      "org.apache.derby.impl.db.BasicDatabase",
      "org.apache.derby.iapi.services.io.ArrayInputStream",
      "org.apache.derby.iapi.util.ReuseFactory",
      "org.apache.derby.iapi.services.io.FormatIdInputStream",
      "org.h2.engine.SessionWithState",
      "org.h2.engine.Session",
      "org.h2.value.ValueLong",
      "org.h2.util.MathUtils",
      "org.h2.constant.SysProperties",
      "org.h2.command.Prepared",
      "org.h2.command.dml.ScriptBase",
      "org.h2.command.dml.ScriptCommand",
      "org.databene.commons.iterator.ConvertingIterator",
      "org.databene.jdbacl.ArrayResultSetIterator",
      "org.databene.commons.iterator.IteratorProxy",
      "org.databene.jdbacl.QueryIterator",
      "org.databene.commons.NameUtil",
      "org.apache.derby.iapi.sql.dictionary.DataDescriptorGenerator",
      "org.apache.derby.iapi.services.context.ContextService",
      "org.apache.derby.iapi.services.monitor.Monitor",
      "org.databene.jdbacl.sql.parser.SQLParser$keyword_return",
      "org.h2.message.TraceObject",
      "org.h2.Driver",
      "org.h2.jdbcx.JdbcDataSource",
      "org.h2.jdbcx.JdbcDataSourceFactory",
      "org.h2.message.TraceSystem",
      "org.h2.util.SmallLRUCache",
      "org.h2.message.Trace",
      "org.h2.tools.SimpleResultSet",
      "org.h2.util.StringUtils",
      "org.h2.util.Utils",
      "org.h2.message.DbException",
      "org.h2.constant.ErrorCode",
      "org.h2.jdbc.JdbcSQLException",
      "org.antlr.runtime.MismatchedTokenException",
      "org.h2.jdbc.JdbcConnection",
      "org.h2.value.CompareMode",
      "org.databene.jdbacl.sql.parser.SQLParser$arguments_return",
      "org.postgresql.ds.jdbc23.AbstractJdbc23PooledConnection",
      "org.postgresql.ds.jdbc4.AbstractJdbc4PooledConnection",
      "org.postgresql.ds.PGPooledConnection",
      "org.hsqldb.lib.HsqlByteArrayOutputStream",
      "org.hsqldb.rowio.RowOutputBase",
      "org.hsqldb.rowio.RowOutputBinary",
      "org.firebirdsql.jca.FBManagedConnection$1",
      "org.firebirdsql.jca.FBManagedConnection$2",
      "org.firebirdsql.jca.FBManagedConnection$3",
      "org.firebirdsql.jca.FBManagedConnection$4",
      "org.firebirdsql.jca.FBManagedConnection$5",
      "org.firebirdsql.jca.FBManagedConnection",
      "org.firebirdsql.jdbc.AbstractConnection",
      "org.firebirdsql.jdbc.FBConnection",
      "org.h2.jdbcx.JdbcConnectionPool",
      "org.apache.derby.impl.io.vfmem.PathUtil",
      "org.apache.derby.impl.io.vfmem.DataStore",
      "org.apache.derby.impl.io.vfmem.VirtualFile",
      "org.apache.derby.impl.io.vfmem.DataStoreEntry",
      "org.apache.derby.impl.io.vfmem.BlockedByteArray",
      "org.apache.derby.impl.io.vfmem.BlockedByteArrayOutputStream",
      "org.h2.engine.SessionRemote",
      "org.h2.store.LobStorage",
      "org.h2.tools.CompressTool",
      "org.h2.value.ValueLobDb",
      "org.firebirdsql.jdbc.FBClob",
      "org.firebirdsql.jdbc.FBSQLException",
      "org.firebirdsql.jdbc.FBDriverNotCapableException",
      "org.hsqldb.jdbc.jdbcClob",
      "org.apache.derby.iapi.services.io.DynamicByteArrayOutputStream",
      "org.h2.value.ValueLob",
      "org.h2.command.dml.RunScriptCommand",
      "org.h2.value.DataType",
      "org.hsqldb.lib.FileUtil"
    );
  }
}