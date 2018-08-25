/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Aug 24 14:17:21 GMT 2018
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
      "org.h2.store.LobStorage",
      "org.apache.derby.iapi.sql.dictionary.SequenceDescriptor",
      "org.databene.commons.version.StringVersionNumberComponent",
      "org.databene.jdbacl.model.AbstractDBObject",
      "org.apache.derby.iapi.store.access.TransactionController",
      "org.apache.derby.iapi.services.locks.Limit",
      "org.h2.store.FileStoreOutputStream",
      "org.databene.commons.CollectionUtil",
      "org.apache.derby.iapi.types.RowLocation",
      "org.hsqldb.rowio.RowOutputBinary",
      "org.databene.jdbacl.model.DBNonUniqueIndex",
      "org.databene.script.Expression",
      "org.databene.commons.version.DateVersionNumberComponent",
      "org.databene.jdbacl.model.DBRow",
      "org.hsqldb.lib.HsqlByteArrayOutputStream",
      "org.apache.derby.iapi.sql.dictionary.SubConstraintDescriptor",
      "org.apache.derby.catalog.TypeDescriptor",
      "org.databene.jdbacl.sql.parser.SQLParser$equality_expression_return",
      "org.apache.derby.impl.sql.catalog.SYSTRIGGERSRowFactory",
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
      "org.hsqldb.Row",
      "org.h2.value.ValueNull",
      "org.databene.jdbacl.sql.parser.SQLParser$exclusive_or_expression_return",
      "org.h2.value.ValueShort",
      "org.apache.derby.impl.sql.catalog.SYSSEQUENCESRowFactory",
      "org.h2.value.ValueDecimal",
      "org.hsqldb.Table",
      "org.databene.jdbacl.model.MultiColumnObject",
      "org.apache.derby.iapi.sql.dictionary.DataDictionary",
      "org.databene.jdbacl.sql.parser.SQLParser$commands_return",
      "org.antlr.runtime.tree.CommonTree",
      "org.databene.jdbacl.sql.parser.SQLParser$primary_return",
      "org.antlr.runtime.MismatchedNotSetException",
      "org.apache.derby.iapi.services.context.Context",
      "org.h2.store.FileStoreInputStream",
      "org.apache.derby.iapi.types.Orderable",
      "org.h2.util.SmallLRUCache",
      "org.apache.derby.impl.sql.catalog.DataDictionaryImpl",
      "org.databene.jdbacl.model.DBUniqueConstraint",
      "org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream",
      "org.databene.jdbacl.model.TableHolder",
      "org.apache.derby.iapi.sql.execute.ExecIndexRow",
      "org.antlr.runtime.CharStream",
      "org.h2.value.Value",
      "org.databene.jdbacl.sql.parser.SQLLexer",
      "org.hsqldb.persist.CachedObject",
      "org.apache.derby.iapi.sql.dictionary.FileInfoDescriptor",
      "org.databene.jdbacl.model.DBDataType$TypeDescriptor",
      "org.databene.jdbacl.model.TableContainer",
      "org.apache.derby.iapi.sql.dictionary.ColumnDescriptor",
      "org.apache.derby.impl.sql.catalog.SYSPERMSRowFactory",
      "org.databene.commons.Converter",
      "org.databene.jdbacl.model.DBForeignKeyConstraint",
      "org.apache.derby.impl.sql.catalog.SYSTABLESRowFactory",
      "org.databene.commons.converter.ToStringConverter",
      "org.apache.derby.iapi.sql.execute.ExecRow",
      "org.apache.derby.iapi.sql.dictionary.IndexLister",
      "org.antlr.runtime.Lexer",
      "org.apache.derby.impl.sql.catalog.SYSCOLUMNSRowFactory",
      "org.apache.derby.iapi.services.locks.Lockable",
      "org.apache.derby.impl.sql.catalog.SYSVIEWSRowFactory",
      "org.apache.derby.impl.sql.catalog.SYSCONGLOMERATESRowFactory",
      "org.antlr.runtime.MissingTokenException",
      "org.apache.derby.iapi.sql.dictionary.DependencyDescriptor",
      "org.h2.value.CompareMode",
      "org.antlr.runtime.EarlyExitException",
      "org.apache.derby.iapi.error.StandardException",
      "org.apache.derby.impl.sql.catalog.SYSSTATISTICSRowFactory",
      "org.databene.jdbacl.model.FKChangeRule",
      "org.h2.jdbcx.JdbcDataSourceFactory",
      "org.apache.derby.iapi.services.io.Storable",
      "org.h2.value.ValueString",
      "org.h2.value.ValueJavaObject",
      "org.apache.derby.iapi.store.raw.xact.RawTransaction",
      "org.apache.derby.catalog.Dependable",
      "org.apache.derby.iapi.services.property.PropertySetCallback",
      "org.antlr.runtime.Token",
      "org.apache.derby.iapi.sql.dictionary.DataDescriptorGenerator",
      "org.antlr.runtime.Parser",
      "org.h2.message.Trace",
      "org.databene.jdbacl.model.DBObject",
      "org.apache.derby.impl.sql.catalog.SYSDUMMY1RowFactory",
      "org.hsqldb.rowio.RowOutputInterface",
      "org.databene.commons.AssertionError",
      "org.apache.derby.iapi.services.io.StreamStorable",
      "org.apache.derby.impl.sql.catalog.SYSCONSTRAINTSRowFactory",
      "org.h2.value.ValueInt",
      "org.apache.derby.impl.sql.catalog.TabInfoImpl",
      "org.antlr.runtime.tree.RewriteRuleElementStream",
      "org.databene.jdbacl.sql.ColumnExpression",
      "org.apache.derby.iapi.types.DataValueFactory",
      "org.apache.derby.iapi.sql.conn.LanguageConnectionContext",
      "org.antlr.runtime.NoViableAltException",
      "org.antlr.runtime.RecognizerSharedState",
      "org.antlr.runtime.CommonTokenStream",
      "org.apache.derby.impl.sql.catalog.SYSFOREIGNKEYSRowFactory",
      "org.apache.derby.impl.sql.catalog.DD_Version",
      "org.databene.commons.OrderedSet",
      "org.antlr.runtime.RuleReturnScope",
      "org.apache.derby.iapi.types.StringDataValue",
      "org.h2.util.MathUtils$1",
      "org.apache.derby.iapi.sql.dictionary.RoleGrantDescriptor",
      "org.databene.commons.depend.Dependent",
      "org.apache.derby.iapi.types.DataTypeDescriptor",
      "org.databene.jdbacl.model.DBColumn",
      "org.h2.value.ValueUuid",
      "org.databene.jdbacl.sql.parser.SQLParser$unary_expression_return",
      "org.antlr.runtime.tree.RewriteRuleSubtreeStream",
      "org.h2.value.ValueDate",
      "org.databene.jdbacl.model.ContainerComponent",
      "org.databene.jdbacl.model.DBPackage",
      "org.h2.value.ValueFloat",
      "org.databene.jdbacl.sql.SQLParserUtil",
      "org.apache.derby.impl.sql.catalog.SYSTABLEPERMSRowFactory",
      "org.apache.derby.impl.sql.catalog.SYSROLESRowFactory",
      "org.apache.derby.iapi.sql.dictionary.UniqueSQLObjectDescriptor",
      "org.databene.jdbacl.SQLUtil",
      "org.apache.derby.iapi.sql.depend.Provider",
      "org.apache.derby.iapi.services.monitor.ModuleControl",
      "org.hsqldb.BaseTable",
      "org.databene.jdbacl.model.CompositeDBObject",
      "org.apache.derby.iapi.services.io.FormatableBitSet",
      "org.h2.message.TraceObject",
      "org.apache.derby.iapi.sql.dictionary.ConglomerateDescriptor",
      "org.apache.derby.iapi.sql.dictionary.GenericDescriptorList",
      "org.databene.jdbacl.sql.parser.SQLParser$value_return",
      "org.h2.value.ValueBoolean",
      "org.apache.derby.iapi.store.access.ConglomPropertyQueryable",
      "org.h2.value.ValueLobDb",
      "org.antlr.runtime.DFA",
      "org.h2.value.ValueLong",
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
      "org.h2.value.ValueStringIgnoreCase",
      "org.h2.message.DbException",
      "org.databene.jdbacl.sql.parser.SQLParser",
      "org.databene.jdbacl.model.DBNotNullConstraint",
      "org.databene.jdbacl.model.DBDataType",
      "org.apache.derby.iapi.sql.dictionary.DefaultDescriptor",
      "org.databene.jdbacl.model.TableContainerSupport",
      "org.antlr.runtime.tree.CommonTreeAdaptor",
      "org.h2.jdbcx.JdbcDataSource",
      "org.hsqldb.CachedRow",
      "org.apache.derby.impl.sql.catalog.SYSSTATEMENTSRowFactory",
      "org.antlr.runtime.UnwantedTokenException",
      "org.databene.jdbacl.model.DBTable",
      "org.databene.commons.bean.HashCodeBuilder",
      "org.databene.commons.StringUtil",
      "org.h2.value.ValueBytes",
      "org.h2.value.ValueResultSet",
      "org.h2.value.ValueDouble",
      "org.apache.derby.impl.sql.catalog.SYSDEPENDSRowFactory",
      "org.antlr.runtime.tree.TreeAdaptor",
      "org.apache.derby.iapi.store.access.ConglomerateController",
      "org.databene.jdbacl.sql.parser.SQLParser$expression_return",
      "org.apache.derby.catalog.UUID",
      "org.apache.derby.iapi.sql.dictionary.TupleDescriptor",
      "org.databene.jdbacl.sql.parser.SQLParser$relational_expression_return",
      "org.databene.commons.Named",
      "org.antlr.runtime.CharStreamState",
      "org.databene.jdbacl.NameSpec",
      "org.apache.derby.iapi.sql.dictionary.ConstraintDescriptor",
      "org.apache.derby.impl.sql.catalog.SYSALIASESRowFactory",
      "org.apache.derby.iapi.sql.dictionary.ColumnDescriptorList",
      "org.databene.jdbacl.sql.parser.SQLParser$null_comparison_return",
      "org.databene.commons.Parser",
      "org.hsqldb.rowio.RowOutputBase",
      "org.apache.derby.impl.store.raw.xact.Xact",
      "org.apache.derby.iapi.types.DataType",
      "org.databene.jdbacl.model.DBSequence",
      "org.apache.derby.iapi.services.io.Formatable",
      "org.apache.derby.iapi.sql.execute.ScanQualifier",
      "org.apache.derby.impl.sql.catalog.SYSCHECKSRowFactory",
      "org.antlr.runtime.tree.BaseTree",
      "org.apache.derby.iapi.sql.dictionary.ConglomerateDescriptorList",
      "org.h2.message.TraceWriter",
      "org.databene.commons.ThreadAware",
      "org.databene.commons.version.VersionNumber",
      "org.apache.derby.iapi.sql.dictionary.ReferencedKeyConstraintDescriptor",
      "org.apache.derby.iapi.sql.depend.DependencyManager",
      "org.databene.jdbacl.model.DBIndex",
      "org.databene.script.expression.ConstantExpression",
      "org.databene.jdbacl.sql.parser.SQLParser$name_return",
      "org.antlr.runtime.BufferedTokenStream",
      "org.apache.derby.iapi.sql.dictionary.KeyConstraintDescriptor",
      "org.databene.jdbacl.model.DBConstraint",
      "org.databene.jdbacl.model.DefaultDBColumn",
      "org.apache.derby.impl.sql.catalog.TableKey",
      "org.apache.derby.iapi.sql.dictionary.TriggerDescriptor",
      "org.apache.derby.impl.sql.catalog.SYSROUTINEPERMSRowFactory",
      "org.antlr.runtime.BitSet",
      "org.databene.jdbacl.model.DBTableComponent",
      "org.apache.derby.iapi.store.access.Qualifier",
      "org.h2.value.ValueArray",
      "org.hsqldb.store.BaseHashMap",
      "org.hsqldb.types.JavaObject",
      "org.apache.derby.iapi.types.SQLChar",
      "org.h2.util.MathUtils",
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
      "org.h2.value.ValueStringFixed",
      "org.antlr.runtime.tree.RewriteRuleTokenStream",
      "org.apache.derby.iapi.sql.dictionary.PermissionsDescriptor",
      "org.h2.value.ValueTimestamp",
      "org.apache.derby.iapi.sql.dictionary.SubKeyConstraintDescriptor",
      "org.antlr.runtime.CommonToken",
      "org.h2.value.Value$ValueBlob",
      "org.databene.jdbacl.model.DBRowIterator",
      "org.h2.constant.SysProperties",
      "org.hsqldb.types.Binary",
      "org.hsqldb.lib.HashMap",
      "org.apache.derby.iapi.services.cache.Cacheable",
      "org.databene.jdbacl.sql.parser.SQLParser$between_expression_return",
      "org.apache.derby.iapi.store.access.AccessFactory",
      "org.databene.commons.version.NumberVersionNumberComponent",
      "org.databene.commons.Capitalization",
      "org.databene.commons.Assert",
      "org.apache.derby.iapi.services.cache.CacheableFactory",
      "org.apache.derby.iapi.sql.dictionary.CatalogRowFactory",
      "org.databene.commons.version.VersionNumberParser",
      "org.antlr.runtime.RecognitionException",
      "org.apache.derby.iapi.sql.dictionary.TablePermsDescriptor",
      "org.apache.derby.iapi.services.uuid.UUIDFactory",
      "org.h2.store.DataHandler",
      "org.h2.jdbc.JdbcConnection",
      "org.apache.derby.impl.sql.catalog.SYSKEYSRowFactory",
      "org.apache.derby.catalog.AliasInfo",
      "org.apache.derby.iapi.sql.depend.Dependent",
      "org.apache.derby.iapi.sql.Row",
      "org.apache.derby.iapi.sql.dictionary.SchemaDescriptor",
      "org.databene.commons.Patterns",
      "org.databene.commons.NullSafeComparator",
      "org.databene.jdbacl.model.DefaultDatabase",
      "org.databene.commons.ParseException",
      "org.apache.derby.impl.services.uuid.BasicUUID",
      "org.antlr.runtime.TokenSource",
      "org.apache.derby.iapi.sql.dictionary.ForeignKeyConstraintDescriptor",
      "org.databene.commons.HeavyweightIterator",
      "org.h2.Driver",
      "org.databene.jdbacl.sql.parser.SQLParser$and_expression_return",
      "org.databene.jdbacl.model.AbstractDBTableComponent",
      "org.apache.derby.iapi.types.DataValueDescriptor",
      "org.h2.value.ValueByte",
      "org.databene.jdbacl.sql.parser.SQLParser$multiplicative_expression_return",
      "org.databene.jdbacl.sql.parser.SQLParser$additive_expression_return",
      "org.databene.jdbacl.sql.parser.TextHolder",
      "org.databene.commons.version.VersionNumberComponent",
      "org.apache.derby.iapi.services.io.TypedFormat",
      "org.databene.commons.collection.OrderedNameMap",
      "org.apache.derby.iapi.services.locks.ShExLockable",
      "org.databene.jdbacl.sql.parser.SQLLexer$DFA9",
      "org.antlr.runtime.TokenStream",
      "org.antlr.runtime.MismatchedTreeNodeException",
      "org.antlr.runtime.ParserRuleReturnScope",
      "org.apache.derby.iapi.types.NumberDataValue",
      "org.databene.commons.ArrayFormat",
      "org.antlr.runtime.ANTLRStringStream",
      "org.databene.commons.SyntaxError",
      "org.antlr.runtime.IntStream",
      "org.apache.derby.iapi.sql.execute.ExecutionFactory",
      "org.apache.derby.iapi.sql.dictionary.ConstraintDescriptorList",
      "org.databene.commons.OrderedMap",
      "org.antlr.runtime.tree.RewriteCardinalityException",
      "org.apache.derby.iapi.sql.dictionary.ColPermsDescriptor",
      "org.databene.jdbacl.model.Database",
      "org.hsqldb.lib.HashMappedList",
      "org.h2.value.Value$ValueClob",
      "org.databene.jdbacl.model.AbstractCompositeDBObject",
      "org.databene.jdbacl.model.DBCatalog",
      "org.h2.util.IOUtils",
      "org.h2.message.TraceSystem",
      "org.apache.derby.iapi.types.ConcatableDataValue",
      "org.apache.derby.iapi.sql.execute.TupleFilter",
      "org.antlr.runtime.MismatchedSetException",
      "org.databene.jdbacl.model.DBPrimaryKeyConstraint",
      "org.antlr.runtime.MismatchedTokenException",
      "org.databene.jdbacl.model.SequenceHolder",
      "org.databene.jdbacl.sql.parser.SQLParser$DFA2",
      "org.apache.derby.iapi.services.cache.CacheManager",
      "org.databene.jdbacl.model.DefaultDBTable",
      "org.databene.commons.iterator.TableRowIterator",
      "org.antlr.runtime.tree.Tree",
      "org.databene.commons.ObjectNotFoundException",
      "org.apache.derby.iapi.sql.dictionary.SubCheckConstraintDescriptor",
      "org.antlr.runtime.BaseRecognizer",
      "org.databene.jdbacl.model.DBSchema",
      "org.h2.value.ValueTime"
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
      "org.databene.jdbacl.model.AbstractDBTableComponent",
      "org.databene.jdbacl.model.DBConstraint",
      "org.databene.jdbacl.model.DBUniqueConstraint",
      "org.databene.jdbacl.model.DBPrimaryKeyConstraint",
      "org.databene.jdbacl.model.DBIndex",
      "org.databene.jdbacl.model.DBUniqueIndex",
      "org.databene.commons.bean.HashCodeBuilder",
      "org.databene.jdbacl.model.TableContainer",
      "org.databene.jdbacl.model.TableContainerSupport",
      "org.databene.commons.collection.ListBasedSet",
      "org.databene.jdbacl.model.DBNonUniqueIndex",
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
      "org.antlr.runtime.RecognitionException",
      "org.antlr.runtime.NoViableAltException",
      "org.databene.commons.ParseException",
      "org.databene.jdbacl.model.DefaultDatabase",
      "org.databene.jdbacl.model.DBCatalog",
      "org.databene.commons.ObjectNotFoundException",
      "org.databene.jdbacl.model.DBSchema",
      "org.databene.commons.version.VersionNumberComponent",
      "org.databene.commons.version.NumberVersionNumberComponent",
      "org.databene.commons.Parser",
      "org.databene.commons.version.VersionNumberParser",
      "org.databene.commons.version.VersionNumber",
      "org.apache.derby.iapi.sql.dictionary.GenericDescriptorList",
      "org.databene.jdbacl.model.DBDataType",
      "org.databene.commons.version.StringVersionNumberComponent",
      "org.apache.derby.impl.sql.execute.BaseActivation",
      "org.apache.derby.impl.sql.execute.ConstantActionActivation",
      "org.antlr.runtime.CommonToken",
      "org.antlr.runtime.Token",
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
      "org.databene.jdbacl.model.DefaultDBColumn",
      "org.h2.util.New",
      "org.h2.command.dml.SetTypes",
      "org.h2.util.MathUtils",
      "org.h2.constant.SysProperties",
      "org.h2.engine.ConnectionInfo",
      "org.h2.message.TraceObject",
      "org.h2.jdbc.JdbcConnection",
      "org.h2.value.CompareMode",
      "org.h2.engine.SessionWithState",
      "org.h2.engine.SessionRemote",
      "org.h2.engine.Session",
      "org.h2.value.Value",
      "org.h2.value.ValueLong",
      "org.h2.engine.Engine",
      "org.h2.store.FileLock",
      "org.h2.util.IOUtils",
      "org.h2.store.fs.FileSystem",
      "org.h2.store.fs.FileSystemDisk",
      "org.h2.engine.Database",
      "org.h2.util.StringUtils",
      "org.h2.engine.Mode",
      "org.h2.util.SmallLRUCache",
      "org.h2.util.TempFileDeleter",
      "org.h2.message.TraceSystem",
      "org.h2.message.Trace",
      "org.h2.util.SortedProperties",
      "org.h2.util.MathUtils$1",
      "org.h2.util.Utils",
      "org.h2.message.DbException",
      "org.h2.constant.ErrorCode",
      "org.h2.jdbc.JdbcSQLException",
      "org.apache.derby.impl.sql.catalog.DataDictionaryImpl",
      "org.databene.jdbacl.model.DBDataType$TypeDescriptor",
      "org.apache.derby.iapi.sql.dictionary.ConstraintDescriptorList",
      "org.apache.derby.impl.store.raw.xact.TransactionTable",
      "org.apache.derby.impl.store.raw.xact.XactFactory",
      "org.databene.jdbacl.model.DBNotNullConstraint",
      "org.databene.commons.Assert",
      "org.apache.derby.impl.sql.conn.GenericLanguageConnectionFactory",
      "org.apache.derby.iapi.services.context.ContextService",
      "org.apache.derby.iapi.store.raw.xact.RawTransaction",
      "org.databene.jdbacl.model.DBForeignKeyConstraint",
      "org.databene.commons.AssertionError",
      "org.firebirdsql.jdbc.FBClob",
      "org.firebirdsql.jdbc.FBSQLException",
      "org.firebirdsql.jdbc.FBDriverNotCapableException",
      "org.databene.jdbacl.model.DBRowIterator",
      "org.databene.jdbacl.model.DBSequence",
      "org.apache.derby.impl.store.access.btree.OpenBTree",
      "org.apache.derby.impl.store.access.btree.BTreeController",
      "org.apache.derby.impl.sql.compile.QueryTreeNode",
      "org.apache.derby.impl.sql.compile.StatementNode",
      "org.apache.derby.impl.sql.compile.DMLStatementNode",
      "org.apache.derby.impl.sql.compile.DMLModStatementNode",
      "org.apache.derby.impl.sql.compile.DeleteNode",
      "org.apache.derby.impl.sql.compile.ResultSetNode",
      "org.apache.derby.impl.sql.compile.FromTable",
      "org.apache.derby.impl.sql.compile.FromBaseTable",
      "org.firebirdsql.gds.impl.AbstractGDS",
      "org.firebirdsql.logging.LoggerFactory",
      "org.firebirdsql.gds.impl.jni.BaseGDSImpl",
      "org.firebirdsql.gds.impl.jni.JniGDSImpl",
      "org.apache.derby.impl.sql.compile.DDLStatementNode",
      "org.apache.derby.impl.sql.compile.CreateIndexNode",
      "org.apache.derby.impl.db.BasicDatabase",
      "org.apache.derby.impl.db.SlaveDatabase",
      "org.apache.derby.iapi.sql.dictionary.TupleDescriptor",
      "org.apache.derby.iapi.sql.dictionary.PermissionsDescriptor",
      "org.apache.derby.iapi.sql.dictionary.ColPermsDescriptor",
      "org.apache.derby.iapi.services.monitor.Monitor",
      "org.apache.derby.impl.sql.GenericPreparedStatement",
      "org.apache.derby.impl.sql.GenericStorablePreparedStatement",
      "org.h2.jdbcx.JdbcConnectionPool",
      "org.h2.Driver",
      "org.h2.jdbcx.JdbcDataSource",
      "org.h2.jdbcx.JdbcDataSourceFactory",
      "org.h2.jdbcx.JdbcXAConnection",
      "org.apache.derby.impl.sql.compile.FromVTI",
      "org.apache.derby.impl.services.uuid.BasicUUID",
      "org.databene.jdbacl.sql.parser.SQLParser$primary_return",
      "org.antlr.runtime.tree.RewriteRuleElementStream",
      "org.antlr.runtime.tree.RewriteRuleTokenStream",
      "org.antlr.runtime.tree.RewriteRuleSubtreeStream",
      "org.databene.jdbacl.sql.parser.SQLParser$value_return",
      "org.databene.jdbacl.sql.parser.SQLParser$name_return",
      "org.databene.commons.NameUtil",
      "org.apache.derby.impl.sql.compile.AlterTableNode",
      "org.apache.derby.impl.sql.compile.HasNodeVisitor",
      "org.apache.derby.impl.sql.compile.HasTableFunctionVisitor",
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
      "org.databene.script.expression.ConstantExpression",
      "org.databene.jdbacl.sql.ColumnExpression",
      "org.apache.derby.iapi.sql.dictionary.SchemaDescriptor",
      "org.databene.jdbacl.DBUtil",
      "org.firebirdsql.gds.impl.GDSFactory$ReversedStringComparator",
      "org.firebirdsql.gds.impl.wire.WireGDSFactoryPlugin",
      "org.firebirdsql.gds.impl.jni.NativeGDSFactoryPlugin",
      "org.firebirdsql.gds.impl.jni.LocalGDSFactoryPlugin",
      "org.firebirdsql.gds.impl.jni.EmbeddedGDSFactoryPlugin",
      "org.firebirdsql.gds.impl.GDSFactory",
      "org.firebirdsql.gds.impl.GDSType",
      "org.firebirdsql.jca.FBManagedConnection$1",
      "org.firebirdsql.jca.FBManagedConnection$2",
      "org.firebirdsql.jca.FBManagedConnection$3",
      "org.firebirdsql.jca.FBManagedConnection$4",
      "org.firebirdsql.jca.FBManagedConnection$5",
      "org.firebirdsql.jca.FBManagedConnection",
      "org.firebirdsql.jdbc.AbstractConnection",
      "org.firebirdsql.jdbc.FBConnection",
      "org.firebirdsql.jdbc.InternalTransactionCoordinator",
      "org.apache.derby.iapi.error.ShutdownException",
      "org.hsqldb.jdbc.jdbcClob",
      "org.h2.value.ValueLob",
      "org.firebirdsql.jca.FBManagedConnectionFactory",
      "org.firebirdsql.jdbc.FBConnectionProperties",
      "org.firebirdsql.jca.FBStandAloneConnectionManager",
      "org.hsqldb.lib.FileUtil",
      "org.firebirdsql.jdbc.FBCachedBlob",
      "org.databene.jdbacl.sql.parser.SQLParser$arguments_return",
      "org.databene.commons.LoggerEscalator",
      "org.databene.commons.ArrayBuilder",
      "org.databene.commons.ArrayUtil",
      "org.databene.script.expression.CompositeExpression",
      "org.databene.jdbacl.sql.FunctionInvocation",
      "org.databene.commons.NullSafeComparator",
      "org.hsqldb.Result",
      "org.hsqldb.Session",
      "org.hsqldb.jdbc.jdbcConnection",
      "org.h2.command.Prepared",
      "org.h2.command.dml.ScriptBase",
      "org.h2.command.dml.ScriptCommand",
      "org.h2.value.ValueArray",
      "org.h2.util.StatementBuilder",
      "org.apache.derby.iapi.sql.dictionary.TableDescriptor",
      "org.apache.derby.iapi.sql.dictionary.ConglomerateDescriptorList",
      "org.apache.derby.iapi.sql.dictionary.ColumnDescriptorList",
      "org.antlr.runtime.MismatchedTokenException",
      "org.h2.value.ValueLobDb",
      "org.hsqldb.lib.HsqlByteArrayOutputStream",
      "org.hsqldb.rowio.RowOutputBase",
      "org.hsqldb.rowio.RowOutputBinary",
      "org.databene.jdbacl.sql.parser.SQLParser$keyword_return",
      "org.databene.commons.SyntaxError",
      "org.h2.util.Tool",
      "org.h2.tools.Recover",
      "org.databene.commons.OrderedMap$ProxyEntry",
      "org.h2.tools.Csv",
      "org.h2.tools.SimpleResultSet",
      "org.apache.derby.iapi.services.io.FormatableProperties",
      "org.postgresql.jdbc2.AbstractJdbc2Connection",
      "org.postgresql.jdbc3.AbstractJdbc3Connection",
      "org.postgresql.jdbc3g.AbstractJdbc3gConnection",
      "org.postgresql.jdbc4.AbstractJdbc4Connection",
      "org.postgresql.jdbc4.Jdbc4Connection",
      "org.postgresql.core.Logger",
      "org.postgresql.Driver",
      "org.postgresql.core.v3.ConnectionFactoryImpl",
      "org.postgresql.core.v2.ConnectionFactoryImpl",
      "org.postgresql.core.ConnectionFactory",
      "org.postgresql.core.PGStream",
      "org.postgresql.util.PSQLException",
      "org.postgresql.util.GT",
      "org.postgresql.util.PSQLState",
      "org.apache.derby.iapi.sql.dictionary.DataDescriptorGenerator",
      "org.h2.value.ValueNull",
      "org.hsqldb.jdbc.jdbcStatement",
      "org.hsqldb.jdbc.jdbcPreparedStatement",
      "org.hsqldb.jdbc.jdbcCallableStatement",
      "org.firebirdsql.gds.XSQLVAR",
      "org.firebirdsql.jdbc.AbstractResultSet",
      "org.firebirdsql.jdbc.FBResultSet",
      "org.firebirdsql.jdbc.FBCachedFetcher",
      "org.firebirdsql.jdbc.AbstractResultSet$1",
      "org.firebirdsql.jdbc.field.FBField",
      "org.firebirdsql.jdbc.field.TypeConvertionException",
      "org.apache.derby.impl.sql.execute.WriteCursorConstantAction",
      "org.apache.derby.impl.sql.execute.DeleteConstantAction",
      "org.hsqldb.persist.HsqlProperties",
      "org.hsqldb.DatabaseURL",
      "org.hsqldb.jdbc.Util",
      "org.hsqldb.store.BaseHashMap",
      "org.hsqldb.lib.HashMap",
      "org.hsqldb.store.HashIndex",
      "org.hsqldb.lib.BaseList",
      "org.hsqldb.lib.HsqlArrayList",
      "org.hsqldb.resources.BundleHandler",
      "org.hsqldb.Trace",
      "org.hsqldb.HsqlException",
      "org.apache.derby.impl.sql.compile.Predicate",
      "org.apache.derby.impl.sql.GenericLanguageFactory",
      "org.apache.derby.iapi.services.context.ContextImpl",
      "org.apache.derby.impl.sql.conn.GenericLanguageConnectionContext",
      "org.h2.store.LobStorage",
      "org.h2.tools.CompressTool",
      "org.h2.store.LobStorage$LobInputStream",
      "org.apache.derby.impl.store.raw.data.BaseDataFileFactory",
      "org.apache.derby.impl.store.raw.data.BaseDataFileFactoryJ4",
      "org.h2.value.DataType",
      "org.databene.jdbacl.sql.parser.SQLParser$literal_return",
      "org.databene.jdbacl.model.DBPackage",
      "org.databene.jdbacl.model.DBProcedure",
      "org.firebirdsql.jdbc.AbstractStatement",
      "org.firebirdsql.jdbc.AbstractPreparedStatement",
      "org.firebirdsql.jdbc.AbstractCallableStatement",
      "org.firebirdsql.jdbc.FBCallableStatement",
      "org.firebirdsql.jdbc.AbstractStatement$RSListener",
      "org.apache.derby.iapi.services.io.DynamicByteArrayOutputStream",
      "org.apache.derby.impl.store.access.conglomerate.ConglomerateUtil",
      "org.apache.derby.iapi.error.StandardException",
      "org.postgresql.ds.common.BaseDataSource",
      "org.postgresql.ds.PGConnectionPoolDataSource",
      "org.postgresql.jdbc2.AbstractJdbc2BlobClob",
      "org.postgresql.jdbc2.AbstractJdbc2Clob",
      "org.postgresql.jdbc3.AbstractJdbc3Clob",
      "org.postgresql.jdbc4.AbstractJdbc4Clob",
      "org.postgresql.jdbc4.Jdbc4Clob",
      "org.hsqldb.lib.StringInputStream",
      "org.hsqldb.lib.AsciiStringInputStream",
      "org.databene.jdbacl.model.FKChangeRule"
    );
  }
}
