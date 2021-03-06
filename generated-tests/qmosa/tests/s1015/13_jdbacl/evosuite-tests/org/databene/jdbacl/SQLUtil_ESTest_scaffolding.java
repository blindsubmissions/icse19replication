/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Aug 24 13:44:10 GMT 2018
 */

package org.databene.jdbacl;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

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
      "org.apache.derby.iapi.types.RowLocation",
      "org.databene.script.Expression",
      "org.databene.commons.version.DateVersionNumberComponent",
      "org.databene.jdbacl.model.DBRow",
      "org.hsqldb.lib.HsqlByteArrayOutputStream",
      "org.databene.jdbacl.sql.parser.SQLParser$equality_expression_return",
      "org.apache.derby.impl.sql.catalog.SYSTRIGGERSRowFactory",
      "org.apache.derby.impl.sql.GenericStatement",
      "org.apache.derby.iapi.services.property.PersistentSet",
      "org.apache.derby.iapi.sql.dictionary.IndexRowGenerator",
      "org.apache.derby.iapi.sql.dictionary.PrivilegedSQLObject",
      "org.databene.jdbacl.model.DBCheckConstraint",
      "org.h2.value.ValueNull",
      "org.apache.derby.iapi.sql.compile.Visitor",
      "org.apache.derby.impl.sql.compile.CompilerContextImpl",
      "org.databene.jdbacl.model.MultiColumnObject",
      "org.apache.derby.iapi.sql.dictionary.DataDictionary",
      "org.databene.jdbacl.sql.parser.SQLParser$commands_return",
      "org.antlr.runtime.tree.CommonTree",
      "org.databene.jdbacl.sql.parser.SQLParser$primary_return",
      "org.hsqldb.lib.Collection",
      "org.antlr.runtime.MismatchedNotSetException",
      "org.firebirdsql.jdbc.FBResultSetNotUpdatableException",
      "org.h2.store.FileStoreInputStream",
      "org.apache.derby.iapi.services.context.Context",
      "org.apache.derby.iapi.types.Orderable",
      "org.databene.jdbacl.model.TableHolder",
      "org.firebirdsql.jdbc.field.FBFlushableField",
      "org.apache.derby.iapi.sql.execute.ExecIndexRow",
      "org.databene.jdbacl.sql.parser.SQLLexer",
      "org.firebirdsql.jdbc.field.FBTimeField",
      "org.databene.jdbacl.model.TableContainer",
      "org.firebirdsql.jdbc.field.FBLongField",
      "org.apache.derby.iapi.sql.dictionary.ColumnDescriptor",
      "org.firebirdsql.jdbc.field.FBTimestampField",
      "org.apache.derby.impl.sql.catalog.SYSPERMSRowFactory",
      "org.databene.commons.Converter",
      "org.databene.jdbacl.model.DBForeignKeyConstraint",
      "org.apache.derby.impl.sql.catalog.SYSTABLESRowFactory",
      "org.databene.commons.converter.ToStringConverter",
      "org.apache.derby.iapi.sql.execute.ExecRow",
      "org.apache.derby.iapi.sql.dictionary.IndexLister",
      "org.apache.derby.impl.sql.catalog.SYSCOLUMNSRowFactory",
      "org.firebirdsql.jdbc.field.FBBigDecimalField",
      "org.firebirdsql.jdbc.FBResultSet",
      "org.apache.derby.impl.sql.catalog.SYSCONGLOMERATESRowFactory",
      "org.antlr.runtime.EarlyExitException",
      "org.apache.derby.iapi.error.StandardException",
      "org.databene.jdbacl.model.FKChangeRule",
      "org.h2.value.ValueString",
      "org.hsqldb.lib.Iterator",
      "org.apache.derby.iapi.store.raw.xact.RawTransaction",
      "org.firebirdsql.jdbc.FBSQLException",
      "org.antlr.runtime.Token",
      "org.apache.derby.iapi.sql.dictionary.DataDescriptorGenerator",
      "org.apache.derby.catalog.ReferencedColumns",
      "org.antlr.runtime.Parser",
      "org.databene.jdbacl.model.DBObject",
      "org.apache.derby.iapi.services.monitor.ModuleFactory",
      "org.apache.derby.iapi.services.io.StreamStorable",
      "org.apache.derby.impl.sql.catalog.SYSCONSTRAINTSRowFactory",
      "org.hsqldb.lib.FileAccess",
      "org.antlr.runtime.tree.RewriteRuleElementStream",
      "org.antlr.runtime.RecognizerSharedState",
      "org.apache.derby.impl.sql.catalog.SYSFOREIGNKEYSRowFactory",
      "org.databene.commons.OrderedSet",
      "org.apache.derby.iapi.types.StringDataValue",
      "org.apache.derby.iapi.sql.dictionary.RoleGrantDescriptor",
      "org.firebirdsql.gds.GDSException",
      "org.apache.derby.iapi.types.DataTypeDescriptor",
      "org.databene.jdbacl.model.DBColumn",
      "org.firebirdsql.jdbc.field.FBStringField",
      "org.apache.derby.impl.sql.GenericLanguageFactory",
      "org.firebirdsql.jdbc.FBCachedFetcher",
      "org.databene.jdbacl.model.DBPackage",
      "org.h2.value.ValueFloat",
      "org.apache.derby.impl.sql.catalog.SYSTABLEPERMSRowFactory",
      "org.apache.derby.impl.sql.conn.GenericLanguageConnectionContext",
      "org.apache.derby.iapi.sql.dictionary.UniqueSQLObjectDescriptor",
      "org.apache.derby.iapi.db.TriggerExecutionContext",
      "org.h2.value.ValueBoolean",
      "org.antlr.runtime.DFA",
      "org.firebirdsql.jdbc.field.FBDoubleField",
      "org.h2.value.ValueLong",
      "org.databene.commons.converter.FormatHolder",
      "org.antlr.runtime.tree.RewriteEmptyStreamException",
      "org.apache.derby.iapi.sql.dictionary.SPSDescriptor",
      "org.hsqldb.lib.FileUtil",
      "org.apache.derby.iapi.store.raw.Transaction",
      "org.apache.derby.catalog.IndexDescriptor",
      "org.antlr.runtime.MismatchedRangeException",
      "org.apache.derby.iapi.sql.dictionary.UniqueTupleDescriptor",
      "org.h2.value.ValueStringIgnoreCase",
      "org.h2.message.DbException",
      "org.databene.jdbacl.model.DBNotNullConstraint",
      "org.apache.derby.iapi.sql.dictionary.DefaultDescriptor",
      "org.antlr.runtime.tree.CommonTreeAdaptor",
      "org.apache.derby.impl.sql.catalog.SYSSTATEMENTSRowFactory",
      "org.antlr.runtime.UnwantedTokenException",
      "org.h2.value.ValueBytes",
      "org.antlr.runtime.tree.TreeAdaptor",
      "org.apache.derby.iapi.store.access.ConglomerateController",
      "org.databene.jdbacl.sql.parser.SQLParser$relational_expression_return",
      "org.databene.jdbacl.NameSpec",
      "org.apache.derby.iapi.sql.dictionary.ConstraintDescriptor",
      "org.databene.commons.Parser",
      "org.apache.derby.impl.store.raw.xact.Xact",
      "org.apache.derby.iapi.types.DataType",
      "org.apache.derby.iapi.services.io.Formatable",
      "org.apache.derby.impl.sql.catalog.SYSCHECKSRowFactory",
      "org.firebirdsql.jdbc.AbstractResultSet$1",
      "org.apache.derby.iapi.services.io.Limit",
      "org.hsqldb.jdbc.jdbcConnection",
      "org.antlr.runtime.tree.BaseTree",
      "org.apache.derby.iapi.sql.dictionary.ConglomerateDescriptorList",
      "org.databene.commons.ThreadAware",
      "org.databene.commons.version.VersionNumber",
      "org.apache.derby.iapi.sql.dictionary.ReferencedKeyConstraintDescriptor",
      "org.firebirdsql.jdbc.field.FBWorkaroundStringField",
      "org.antlr.runtime.BufferedTokenStream",
      "org.firebirdsql.jdbc.Synchronizable",
      "org.databene.jdbacl.model.DefaultDBColumn",
      "org.apache.derby.impl.sql.catalog.TableKey",
      "org.apache.derby.iapi.sql.compile.Parser",
      "org.apache.derby.iapi.db.Database",
      "org.apache.derby.iapi.sql.dictionary.TriggerDescriptor",
      "org.antlr.runtime.BitSet",
      "org.hsqldb.store.BaseHashMap",
      "org.apache.derby.iapi.types.SQLChar",
      "org.apache.derby.impl.store.raw.xact.InternalXact",
      "org.antlr.runtime.tree.TreeNodeStream",
      "org.apache.derby.iapi.sql.dictionary.ViewDescriptor",
      "org.databene.commons.collection.ListBasedSet",
      "org.apache.derby.iapi.types.VariableSizeDataValue",
      "org.databene.jdbacl.sql.parser.SQLParser$in_expression_return",
      "org.apache.derby.iapi.services.locks.LockFactory",
      "org.apache.derby.iapi.services.monitor.ModuleSupportable",
      "org.apache.derby.iapi.sql.dictionary.PermissionsDescriptor",
      "org.h2.value.ValueTimestamp",
      "org.h2.value.Value$ValueBlob",
      "org.firebirdsql.gds.impl.AbstractIscStmtHandle",
      "org.databene.jdbacl.model.DBRowIterator",
      "org.hsqldb.jdbc.Util",
      "org.apache.derby.iapi.services.io.ErrorInfo",
      "org.hsqldb.lib.HashMap",
      "org.apache.derby.iapi.services.cache.Cacheable",
      "org.databene.commons.Capitalization",
      "org.databene.commons.version.VersionNumberParser",
      "org.antlr.runtime.RecognitionException",
      "org.apache.derby.iapi.sql.PreparedStatement",
      "org.firebirdsql.gds.XSQLVAR",
      "org.h2.store.DataHandler",
      "org.apache.derby.impl.sql.catalog.SYSKEYSRowFactory",
      "org.apache.derby.catalog.AliasInfo",
      "org.apache.derby.iapi.sql.dictionary.SchemaDescriptor",
      "org.databene.commons.Patterns",
      "org.databene.commons.NullSafeComparator",
      "org.databene.commons.ParseException",
      "org.antlr.runtime.TokenSource",
      "org.apache.derby.iapi.sql.dictionary.ForeignKeyConstraintDescriptor",
      "org.apache.derby.database.Database",
      "org.databene.jdbacl.sql.parser.TextHolder",
      "org.hsqldb.Trace",
      "org.apache.derby.iapi.services.locks.ShExLockable",
      "org.antlr.runtime.TokenStream",
      "org.databene.commons.ArrayFormat",
      "org.hsqldb.lib.BaseList",
      "org.antlr.runtime.ANTLRStringStream",
      "org.databene.commons.SyntaxError",
      "org.firebirdsql.jdbc.FirebirdRowUpdater",
      "org.hsqldb.Result",
      "org.apache.derby.iapi.sql.dictionary.ConstraintDescriptorList",
      "org.databene.commons.OrderedMap",
      "org.antlr.runtime.tree.RewriteCardinalityException",
      "org.apache.derby.iapi.sql.dictionary.ColPermsDescriptor",
      "org.h2.value.Value$ValueClob",
      "org.apache.derby.iapi.services.context.ContextImpl",
      "org.databene.jdbacl.model.DBCatalog",
      "org.databene.commons.comparator.IntComparator",
      "org.antlr.runtime.MismatchedTokenException",
      "org.databene.jdbacl.model.DBUniqueIndex",
      "org.apache.derby.iapi.sql.ResultDescription",
      "org.apache.derby.iapi.services.monitor.Monitor",
      "org.databene.jdbacl.model.DefaultDBTable",
      "org.databene.commons.iterator.TableRowIterator",
      "org.databene.commons.ObjectNotFoundException",
      "org.firebirdsql.jdbc.AbstractStatement",
      "org.databene.jdbacl.model.DBSchema",
      "org.h2.value.ValueTime",
      "org.h2.store.LobStorage",
      "org.apache.derby.iapi.sql.dictionary.SequenceDescriptor",
      "org.databene.commons.version.StringVersionNumberComponent",
      "org.databene.jdbacl.model.AbstractDBObject",
      "org.apache.derby.iapi.services.io.ErrorObjectInput",
      "org.apache.derby.iapi.store.access.TransactionController",
      "org.h2.store.FileStoreOutputStream",
      "org.apache.derby.iapi.services.locks.Limit",
      "org.databene.commons.CollectionUtil",
      "org.firebirdsql.jdbc.field.FBFloatField",
      "org.firebirdsql.jdbc.field.FBCachedLongVarCharField",
      "org.apache.derby.iapi.sql.LanguageFactory",
      "org.apache.derby.iapi.sql.execute.CursorActivation",
      "org.apache.derby.iapi.sql.dictionary.SubConstraintDescriptor",
      "org.apache.derby.iapi.sql.compile.OptimizerFactory",
      "org.hsqldb.lib.HsqlList",
      "org.apache.derby.catalog.TypeDescriptor",
      "org.apache.derby.iapi.sql.execute.ExecutionStmtValidator",
      "org.firebirdsql.jdbc.FBSQLWarning",
      "org.firebirdsql.jdbc.field.FBShortField",
      "org.apache.derby.iapi.sql.dictionary.TableDescriptor",
      "org.apache.derby.impl.sql.catalog.SYSFILESRowFactory",
      "org.apache.derby.iapi.sql.dictionary.PermDescriptor",
      "org.apache.derby.impl.sql.catalog.SYSSCHEMASRowFactory",
      "org.apache.derby.iapi.sql.dictionary.RoleClosureIterator",
      "org.apache.derby.impl.sql.catalog.SYSCOLPERMSRowFactory",
      "org.apache.derby.impl.sql.catalog.PermissionsCatalogRowFactory",
      "org.databene.jdbacl.sql.parser.SQLParser$exclusive_or_expression_return",
      "org.h2.value.ValueShort",
      "org.apache.derby.impl.sql.catalog.SYSSEQUENCESRowFactory",
      "org.apache.derby.iapi.services.i18n.LocaleFinder",
      "org.apache.derby.iapi.sql.conn.Authorizer",
      "org.h2.value.ValueDecimal",
      "org.apache.derby.impl.sql.catalog.DataDictionaryImpl",
      "org.firebirdsql.jdbc.FBDriverNotCapableException",
      "org.databene.jdbacl.model.DBUniqueConstraint",
      "org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream",
      "org.apache.derby.iapi.sql.conn.SQLSessionContext",
      "org.antlr.runtime.CharStream",
      "org.h2.value.Value",
      "org.hsqldb.resources.BundleHandler",
      "org.apache.derby.iapi.sql.dictionary.FileInfoDescriptor",
      "org.databene.jdbacl.model.DBDataType$TypeDescriptor",
      "org.firebirdsql.jdbc.FirebirdStatement",
      "org.antlr.runtime.Lexer",
      "org.apache.derby.iapi.services.locks.Lockable",
      "org.apache.derby.impl.sql.catalog.SYSVIEWSRowFactory",
      "org.apache.derby.iapi.sql.execute.RunTimeStatistics",
      "org.antlr.runtime.MissingTokenException",
      "org.apache.derby.iapi.sql.dictionary.DependencyDescriptor",
      "org.h2.value.CompareMode",
      "org.apache.derby.impl.sql.conn.GenericLanguageConnectionFactory",
      "org.apache.derby.iapi.sql.Activation",
      "org.apache.derby.iapi.sql.dictionary.CheckConstraintDescriptor",
      "org.apache.derby.impl.sql.catalog.SYSSTATISTICSRowFactory",
      "org.firebirdsql.jdbc.field.TypeConvertionException",
      "org.apache.derby.iapi.services.io.Storable",
      "org.h2.value.ValueJavaObject",
      "org.apache.derby.catalog.Dependable",
      "org.apache.derby.iapi.services.property.PropertySetCallback",
      "org.firebirdsql.gds.impl.GDSHelper",
      "org.apache.derby.impl.sql.catalog.SYSDUMMY1RowFactory",
      "org.databene.commons.AssertionError",
      "org.h2.value.ValueInt",
      "org.apache.derby.impl.sql.catalog.TabInfoImpl",
      "org.hsqldb.DatabaseURL",
      "org.apache.derby.iapi.types.DataValueFactory",
      "org.firebirdsql.jdbc.field.FBField",
      "org.apache.derby.iapi.sql.conn.LanguageConnectionContext",
      "org.antlr.runtime.NoViableAltException",
      "org.antlr.runtime.CommonTokenStream",
      "org.apache.derby.impl.sql.catalog.DD_Version",
      "org.antlr.runtime.RuleReturnScope",
      "org.hsqldb.store.HashIndex",
      "org.databene.commons.depend.Dependent",
      "org.h2.value.ValueUuid",
      "org.apache.derby.iapi.sql.compile.ASTVisitor",
      "org.databene.jdbacl.sql.parser.SQLParser$unary_expression_return",
      "org.apache.derby.iapi.services.io.ArrayInputStream",
      "org.hsqldb.lib.FileAccess$FileSync",
      "org.antlr.runtime.tree.RewriteRuleSubtreeStream",
      "org.h2.value.ValueDate",
      "org.databene.jdbacl.model.ContainerComponent",
      "org.firebirdsql.jdbc.field.FBBlobField",
      "org.databene.jdbacl.sql.SQLParserUtil",
      "org.apache.derby.impl.sql.catalog.SYSROLESRowFactory",
      "org.databene.jdbacl.SQLUtil",
      "org.apache.derby.iapi.sql.depend.Provider",
      "org.apache.derby.iapi.services.monitor.ModuleControl",
      "org.databene.jdbacl.model.CompositeDBObject",
      "org.firebirdsql.jdbc.FBObjectListener$FetcherListener",
      "org.apache.derby.iapi.services.io.FormatableBitSet",
      "org.apache.derby.iapi.sql.dictionary.ConglomerateDescriptor",
      "org.apache.derby.iapi.sql.dictionary.GenericDescriptorList",
      "org.apache.derby.iapi.store.access.ConglomPropertyQueryable",
      "org.firebirdsql.jdbc.field.TranslatingReader",
      "org.h2.value.ValueLobDb",
      "org.apache.derby.iapi.sql.ParameterValueSet",
      "org.apache.derby.iapi.sql.dictionary.SystemColumn",
      "org.apache.derby.catalog.DependableFinder",
      "org.apache.derby.iapi.sql.Statement",
      "org.apache.derby.iapi.sql.dictionary.RoutinePermsDescriptor",
      "org.firebirdsql.jdbc.field.FieldDataProvider",
      "org.apache.derby.iapi.sql.conn.StatementContext",
      "org.databene.jdbacl.sql.parser.SQLParser",
      "org.databene.jdbacl.model.DBDataType",
      "org.apache.derby.iapi.sql.execute.ConstantAction",
      "org.apache.derby.iapi.services.io.DynamicByteArrayOutputStream",
      "org.apache.derby.impl.sql.conn.GenericStatementContext",
      "org.databene.jdbacl.model.TableContainerSupport",
      "org.hsqldb.lib.Set",
      "org.databene.jdbacl.model.DBTable",
      "org.databene.commons.bean.HashCodeBuilder",
      "org.apache.derby.iapi.services.context.ContextService",
      "org.apache.derby.iapi.sql.compile.CompilerContext",
      "org.databene.commons.StringUtil",
      "org.h2.value.ValueResultSet",
      "org.h2.value.ValueDouble",
      "org.apache.derby.impl.sql.catalog.SYSDEPENDSRowFactory",
      "org.firebirdsql.jdbc.field.FBDateField",
      "org.databene.jdbacl.sql.parser.SQLParser$expression_return",
      "org.apache.derby.catalog.UUID",
      "org.apache.derby.iapi.sql.dictionary.TupleDescriptor",
      "org.databene.commons.Named",
      "org.antlr.runtime.CharStreamState",
      "org.apache.derby.impl.sql.catalog.SYSALIASESRowFactory",
      "org.apache.derby.iapi.sql.dictionary.ColumnDescriptorList",
      "org.databene.jdbacl.sql.parser.SQLParser$null_comparison_return",
      "org.hsqldb.persist.HsqlProperties",
      "org.firebirdsql.jdbc.FBObjectListener$ResultSetListener",
      "org.databene.jdbacl.model.DBSequence",
      "org.apache.derby.iapi.sql.execute.ScanQualifier",
      "org.hsqldb.SessionInterface",
      "org.apache.derby.iapi.sql.depend.DependencyManager",
      "org.databene.jdbacl.model.DBIndex",
      "org.apache.derby.iapi.sql.dictionary.KeyConstraintDescriptor",
      "org.databene.jdbacl.model.DBConstraint",
      "org.firebirdsql.jdbc.AbstractResultSet",
      "org.apache.derby.impl.sql.catalog.SYSROUTINEPERMSRowFactory",
      "org.databene.jdbacl.model.DBTableComponent",
      "org.apache.derby.iapi.store.access.Qualifier",
      "org.h2.value.ValueArray",
      "org.apache.derby.impl.sql.conn.TempTableInfo",
      "org.apache.derby.iapi.sql.dictionary.AliasDescriptor",
      "org.databene.jdbacl.model.DBTrigger",
      "org.antlr.runtime.tree.BaseTreeAdaptor",
      "org.h2.value.ValueStringFixed",
      "org.apache.derby.iapi.services.locks.LockOwner",
      "org.antlr.runtime.tree.RewriteRuleTokenStream",
      "org.apache.derby.iapi.sql.dictionary.SubKeyConstraintDescriptor",
      "org.antlr.runtime.CommonToken",
      "org.databene.jdbacl.sql.parser.SQLParser$between_expression_return",
      "org.apache.derby.iapi.store.access.AccessFactory",
      "org.databene.commons.version.NumberVersionNumberComponent",
      "org.databene.commons.Assert",
      "org.apache.derby.iapi.services.cache.CacheableFactory",
      "org.apache.derby.iapi.sql.dictionary.CatalogRowFactory",
      "org.apache.derby.iapi.sql.dictionary.TablePermsDescriptor",
      "org.apache.derby.iapi.services.uuid.UUIDFactory",
      "org.apache.derby.iapi.error.ShutdownException",
      "org.apache.derby.iapi.sql.depend.Dependent",
      "org.apache.derby.iapi.sql.Row",
      "org.databene.jdbacl.model.DefaultDatabase",
      "org.apache.derby.impl.services.uuid.BasicUUID",
      "org.firebirdsql.jdbc.field.FBIntegerField",
      "org.databene.commons.HeavyweightIterator",
      "org.apache.derby.iapi.sql.conn.LanguageConnectionFactory",
      "org.databene.jdbacl.sql.parser.SQLParser$and_expression_return",
      "org.hsqldb.lib.HsqlArrayList",
      "org.databene.jdbacl.model.AbstractDBTableComponent",
      "org.h2.value.ValueByte",
      "org.apache.derby.iapi.types.DataValueDescriptor",
      "org.databene.jdbacl.sql.parser.SQLParser$multiplicative_expression_return",
      "org.apache.derby.iapi.services.context.ContextManager",
      "org.databene.jdbacl.sql.parser.SQLParser$additive_expression_return",
      "org.hsqldb.HsqlException",
      "org.databene.commons.version.VersionNumberComponent",
      "org.apache.derby.iapi.services.io.TypedFormat",
      "org.firebirdsql.jdbc.field.FBLongVarCharField",
      "org.databene.commons.collection.OrderedNameMap",
      "org.databene.jdbacl.sql.parser.SQLLexer$DFA9",
      "org.antlr.runtime.MismatchedTreeNodeException",
      "org.antlr.runtime.ParserRuleReturnScope",
      "org.apache.derby.iapi.types.NumberDataValue",
      "org.antlr.runtime.IntStream",
      "org.apache.derby.iapi.sql.execute.ExecutionFactory",
      "org.firebirdsql.gds.IscStmtHandle",
      "org.apache.derby.iapi.services.io.LimitObjectInput",
      "org.databene.jdbacl.model.Database",
      "org.databene.jdbacl.model.AbstractCompositeDBObject",
      "org.h2.util.IOUtils",
      "org.apache.derby.iapi.types.ConcatableDataValue",
      "org.apache.derby.iapi.sql.execute.TupleFilter",
      "org.antlr.runtime.MismatchedSetException",
      "org.databene.jdbacl.model.DBPrimaryKeyConstraint",
      "org.databene.jdbacl.model.SequenceHolder",
      "org.databene.jdbacl.sql.parser.SQLParser$DFA2",
      "org.firebirdsql.jdbc.FBFetcher",
      "org.apache.derby.iapi.services.cache.CacheManager",
      "org.firebirdsql.jdbc.field.FBCachedBlobField",
      "org.antlr.runtime.tree.Tree",
      "org.hsqldb.Session",
      "org.apache.derby.iapi.sql.dictionary.SubCheckConstraintDescriptor",
      "org.antlr.runtime.BaseRecognizer"
    );
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
      "org.databene.jdbacl.model.DBDataType",
      "org.databene.jdbacl.model.DBDataType$TypeDescriptor",
      "org.databene.jdbacl.model.AbstractDBTableComponent",
      "org.databene.jdbacl.model.DefaultDBColumn",
      "org.firebirdsql.gds.XSQLVAR",
      "org.apache.derby.iapi.sql.dictionary.GenericDescriptorList",
      "org.firebirdsql.jdbc.AbstractResultSet",
      "org.firebirdsql.jdbc.FBResultSet",
      "org.firebirdsql.jdbc.FBCachedFetcher",
      "org.firebirdsql.jdbc.AbstractResultSet$1",
      "org.firebirdsql.jdbc.field.FBField",
      "org.firebirdsql.jdbc.FBSQLException",
      "org.firebirdsql.jdbc.field.TypeConvertionException",
      "org.databene.jdbacl.model.DBCatalog",
      "org.databene.jdbacl.model.DBSchema",
      "org.databene.commons.collection.ListBasedSet",
      "org.databene.jdbacl.model.DBConstraint",
      "org.databene.jdbacl.model.DBForeignKeyConstraint",
      "org.databene.commons.Assert",
      "org.databene.commons.AssertionError",
      "org.databene.jdbacl.model.DBUniqueConstraint",
      "org.databene.jdbacl.model.DBPrimaryKeyConstraint",
      "org.databene.jdbacl.model.DBIndex",
      "org.databene.jdbacl.model.DBUniqueIndex",
      "org.hsqldb.persist.HsqlProperties",
      "org.hsqldb.store.BaseHashMap",
      "org.hsqldb.lib.IntValueHashMap",
      "org.hsqldb.store.HashIndex",
      "org.hsqldb.lib.ArrayUtil",
      "org.databene.commons.bean.HashCodeBuilder",
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
      "org.antlr.runtime.RecognitionException",
      "org.antlr.runtime.NoViableAltException",
      "org.databene.commons.ParseException",
      "org.databene.jdbacl.model.TableContainer",
      "org.databene.jdbacl.model.TableContainerSupport",
      "org.h2.jdbcx.JdbcConnectionPool",
      "org.h2.message.TraceObject",
      "org.h2.Driver",
      "org.h2.jdbcx.JdbcDataSource",
      "org.h2.jdbcx.JdbcDataSourceFactory",
      "org.h2.message.TraceSystem",
      "org.h2.util.MathUtils",
      "org.h2.constant.SysProperties",
      "org.h2.util.SmallLRUCache",
      "org.h2.message.Trace",
      "org.databene.commons.ObjectNotFoundException",
      "org.postgresql.core.Logger",
      "org.postgresql.Driver",
      "org.postgresql.ds.common.BaseDataSource",
      "org.postgresql.ds.PGConnectionPoolDataSource",
      "org.h2.value.Value",
      "org.h2.value.ValueNull",
      "org.h2.value.ValueLobDb",
      "org.h2.util.IOUtils",
      "org.apache.derby.impl.sql.catalog.DataDictionaryImpl",
      "org.apache.derby.impl.store.raw.xact.XactFactory",
      "org.apache.derby.impl.store.raw.xact.ConcurrentXactFactory",
      "org.apache.derby.impl.store.raw.xact.TransactionMapFactory",
      "org.apache.derby.impl.store.raw.xact.ConcurrentTransactionMapFactory",
      "org.databene.jdbacl.model.DBSequence",
      "org.databene.commons.version.VersionNumberComponent",
      "org.databene.commons.version.NumberVersionNumberComponent",
      "org.databene.commons.Parser",
      "org.databene.commons.version.VersionNumberParser",
      "org.databene.commons.version.VersionNumber",
      "org.databene.commons.version.StringVersionNumberComponent",
      "org.databene.jdbacl.model.DefaultDatabase",
      "org.firebirdsql.logging.LoggerFactory",
      "org.firebirdsql.jca.FBManagedConnection$1",
      "org.firebirdsql.jca.FBManagedConnection$2",
      "org.firebirdsql.jca.FBManagedConnection$3",
      "org.firebirdsql.jca.FBManagedConnection$4",
      "org.firebirdsql.jca.FBManagedConnection$5",
      "org.firebirdsql.jca.FBManagedConnection",
      "org.firebirdsql.jdbc.AbstractConnection",
      "org.firebirdsql.jdbc.FBConnection",
      "org.firebirdsql.jdbc.InternalTransactionCoordinator",
      "org.apache.derby.iapi.store.raw.xact.RawTransaction",
      "org.apache.derby.impl.services.uuid.BasicUUID",
      "org.databene.jdbacl.model.DBNotNullConstraint",
      "org.h2.engine.SessionWithState",
      "org.h2.engine.Session",
      "org.h2.util.New",
      "org.h2.value.ValueLong",
      "org.h2.command.Prepared",
      "org.h2.command.dml.ScriptBase",
      "org.h2.command.dml.RunScriptCommand",
      "org.antlr.runtime.Token",
      "org.apache.derby.iapi.sql.dictionary.ConstraintDescriptorList",
      "org.firebirdsql.jdbc.FBClob",
      "org.firebirdsql.jdbc.FBDriverNotCapableException",
      "org.apache.derby.iapi.sql.dictionary.DataDescriptorGenerator",
      "org.apache.derby.impl.sql.compile.QueryTreeNode",
      "org.apache.derby.impl.sql.compile.ResultSetNode",
      "org.apache.derby.impl.sql.compile.FromTable",
      "org.apache.derby.impl.sql.compile.FromBaseTable",
      "org.apache.derby.impl.db.BasicDatabase",
      "org.apache.derby.iapi.sql.dictionary.TupleDescriptor",
      "org.apache.derby.iapi.sql.dictionary.ConstraintDescriptor",
      "org.apache.derby.iapi.sql.dictionary.CheckConstraintDescriptor",
      "org.apache.derby.iapi.sql.dictionary.ColumnDescriptorList",
      "org.databene.commons.OrderedMap$ProxyEntry",
      "org.databene.commons.comparator.IntComparator",
      "org.apache.derby.impl.sql.execute.BaseActivation",
      "org.apache.derby.impl.sql.execute.ConstantActionActivation",
      "org.apache.derby.impl.store.access.btree.OpenBTree",
      "org.apache.derby.impl.store.access.btree.BTreeController",
      "org.apache.derby.impl.sql.GenericLanguageFactory",
      "org.apache.derby.impl.sql.conn.GenericLanguageConnectionFactory",
      "org.apache.derby.impl.db.SlaveDatabase",
      "org.apache.derby.iapi.services.context.ContextImpl",
      "org.apache.derby.impl.sql.conn.GenericLanguageConnectionContext",
      "org.apache.derby.impl.sql.compile.FromVTI",
      "org.postgresql.jdbc2.AbstractJdbc2Connection",
      "org.postgresql.jdbc3.AbstractJdbc3Connection",
      "org.postgresql.jdbc3g.AbstractJdbc3gConnection",
      "org.postgresql.jdbc4.AbstractJdbc4Connection",
      "org.postgresql.jdbc4.Jdbc4Connection",
      "org.hsqldb.Result",
      "org.hsqldb.Session",
      "org.hsqldb.jdbc.jdbcConnection",
      "org.h2.command.dml.ScriptCommand",
      "org.databene.commons.ArrayUtil",
      "org.databene.commons.NullSafeComparator",
      "org.h2.engine.SessionRemote",
      "org.h2.jdbc.JdbcConnection",
      "org.h2.value.CompareMode",
      "org.databene.jdbacl.model.DBRowIterator",
      "org.h2.util.StringUtils",
      "org.h2.util.Utils",
      "org.h2.value.ValueTimestamp",
      "org.h2.util.DateTimeUtils",
      "org.h2.message.DbException",
      "org.h2.constant.ErrorCode",
      "org.h2.jdbc.JdbcSQLException",
      "org.firebirdsql.gds.impl.AbstractGDS",
      "org.firebirdsql.gds.impl.jni.BaseGDSImpl",
      "org.firebirdsql.gds.impl.jni.JniGDSImpl",
      "org.hsqldb.DatabaseURL",
      "org.hsqldb.jdbc.Util",
      "org.hsqldb.lib.HashMap",
      "org.hsqldb.lib.BaseList",
      "org.hsqldb.lib.HsqlArrayList",
      "org.hsqldb.resources.BundleHandler",
      "org.hsqldb.Trace",
      "org.hsqldb.HsqlException",
      "org.h2.value.ValueInt",
      "org.h2.command.ddl.CreateTableData",
      "org.h2.engine.DbObjectBase",
      "org.h2.schema.SchemaObjectBase",
      "org.h2.table.Table",
      "org.h2.table.TableBase",
      "org.h2.table.RegularTable",
      "org.h2.value.ValueTime",
      "org.antlr.runtime.MismatchedTokenException",
      "org.h2.util.Tool",
      "org.h2.tools.Recover",
      "org.h2.store.fs.FileSystem",
      "org.h2.store.fs.FileSystemDisk",
      "org.h2.command.dml.SetTypes",
      "org.h2.engine.ConnectionInfo",
      "org.h2.engine.Database",
      "org.h2.engine.Mode",
      "org.h2.util.TempFileDeleter",
      "org.h2.store.FileLock",
      "org.h2.util.SortedProperties",
      "org.h2.util.MathUtils$1",
      "org.databene.jdbacl.model.DBPackage",
      "org.databene.jdbacl.model.DBProcedure",
      "org.apache.derby.impl.sql.compile.StatementNode",
      "org.apache.derby.impl.sql.compile.DDLStatementNode",
      "org.apache.derby.impl.sql.compile.CreateIndexNode",
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
      "org.firebirdsql.jca.FBManagedConnectionFactory",
      "org.firebirdsql.jdbc.FBConnectionProperties",
      "org.firebirdsql.jca.FBStandAloneConnectionManager",
      "org.firebirdsql.gds.impl.jni.ParameterBufferBase",
      "org.firebirdsql.gds.impl.jni.DatabaseParameterBufferImp",
      "org.firebirdsql.gds.impl.AbstractIscDbHandle",
      "org.firebirdsql.gds.impl.wire.isc_db_handle_impl",
      "org.firebirdsql.gds.impl.GDSHelper",
      "org.apache.derby.iapi.services.context.ContextService",
      "org.apache.derby.iapi.services.monitor.Monitor",
      "org.h2.tools.SimpleResultSet",
      "org.hsqldb.lib.FileUtil",
      "org.apache.derby.iapi.sql.dictionary.TableDescriptor",
      "org.apache.derby.iapi.sql.dictionary.ConglomerateDescriptorList",
      "org.h2.value.DataType",
      "org.hsqldb.jdbc.jdbcStatement",
      "org.hsqldb.jdbc.jdbcPreparedStatement",
      "org.hsqldb.jdbc.jdbcCallableStatement",
      "org.apache.derby.impl.store.raw.xact.TransactionTable",
      "org.firebirdsql.jdbc.AbstractStatement",
      "org.firebirdsql.jdbc.AbstractPreparedStatement",
      "org.firebirdsql.jdbc.AbstractCallableStatement",
      "org.firebirdsql.jdbc.FBCallableStatement",
      "org.firebirdsql.jdbc.AbstractStatement$RSListener",
      "org.apache.derby.iapi.error.ShutdownException",
      "org.databene.jdbacl.model.DBTrigger",
      "org.apache.derby.vti.VTITemplate",
      "org.apache.derby.impl.jdbc.EmbedResultSetMetaData",
      "org.apache.derby.impl.sql.GenericColumnDescriptor",
      "org.apache.derby.catalog.types.BaseTypeIdImpl",
      "org.apache.derby.catalog.types.DecimalTypeIdImpl",
      "org.apache.derby.iapi.types.TypeId",
      "org.apache.derby.catalog.types.TypeDescriptorImpl",
      "org.apache.derby.iapi.types.DataTypeDescriptor",
      "org.apache.derby.diag.ErrorMessages",
      "org.databene.commons.NameUtil",
      "org.h2.store.LobStorage",
      "org.h2.tools.CompressTool",
      "org.h2.jdbcx.JdbcXAConnection",
      "org.databene.jdbacl.DBUtil",
      "org.apache.derby.impl.sql.compile.Predicate",
      "org.apache.derby.impl.sql.compile.InsertNode",
      "org.firebirdsql.gds.impl.wire.AbstractJavaGDSImpl",
      "org.firebirdsql.gds.impl.wire.JavaGDSImpl",
      "org.firebirdsql.gds.impl.jni.isc_db_handle_impl",
      "org.h2.tools.Csv",
      "org.databene.jdbacl.sql.parser.SQLParser$value_return",
      "org.databene.jdbacl.sql.parser.SQLParser$name_return",
      "org.databene.jdbacl.sql.parser.SQLParser$keyword_return",
      "org.databene.commons.SyntaxError",
      "org.h2.value.ValueLob",
      "org.postgresql.Driver$1",
      "org.postgresql.core.v3.ConnectionFactoryImpl",
      "org.postgresql.core.v2.ConnectionFactoryImpl",
      "org.postgresql.core.ConnectionFactory",
      "org.postgresql.core.PGStream",
      "org.postgresql.util.PSQLException",
      "org.postgresql.util.GT",
      "org.postgresql.util.PSQLState",
      "org.hsqldb.lib.HsqlByteArrayOutputStream",
      "org.hsqldb.rowio.RowOutputBase",
      "org.hsqldb.rowio.RowOutputBinary",
      "org.databene.jdbacl.sql.parser.SQLParser$literal_return"
    );
  }
}
