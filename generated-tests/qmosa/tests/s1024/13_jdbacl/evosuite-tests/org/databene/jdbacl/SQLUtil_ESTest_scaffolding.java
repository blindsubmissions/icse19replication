/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Aug 24 16:28:53 GMT 2018
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
    java.lang.System.setProperty("sun.arch.data.model", "64"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(SQLUtil_ESTest_scaffolding.class.getClassLoader() ,
      "org.h2.store.LobStorage",
      "org.h2.value.ValueLong",
      "org.databene.commons.converter.FormatHolder",
      "org.antlr.runtime.tree.RewriteEmptyStreamException",
      "org.h2.tools.Recover$1",
      "org.hsqldb.lib.FileUtil",
      "org.apache.derby.iapi.store.raw.Transaction",
      "org.databene.jdbacl.model.AbstractDBObject",
      "org.antlr.runtime.MismatchedRangeException",
      "org.firebirdsql.jdbc.field.FieldDataProvider",
      "org.postgresql.ds.common.BaseDataSource",
      "org.h2.message.DbException",
      "org.databene.jdbacl.sql.parser.SQLParser",
      "org.postgresql.core.Logger",
      "org.databene.jdbacl.model.DBNotNullConstraint",
      "org.databene.jdbacl.model.DBDataType",
      "org.apache.derby.iapi.services.locks.Limit",
      "org.firebirdsql.jdbc.FBObjectListener$BlobListener",
      "org.firebirdsql.jca.FBTpb",
      "org.databene.commons.CollectionUtil",
      "org.firebirdsql.jca.FBIncorrectXidException",
      "org.databene.jdbacl.model.TableContainerSupport",
      "org.databene.script.Expression",
      "org.antlr.runtime.tree.CommonTreeAdaptor",
      "org.databene.jdbacl.model.DBRow",
      "org.firebirdsql.jdbc.FBConnection",
      "org.antlr.runtime.UnwantedTokenException",
      "org.databene.jdbacl.model.DBTable",
      "org.databene.commons.bean.HashCodeBuilder",
      "org.databene.commons.StringUtil",
      "org.databene.jdbacl.sql.parser.SQLParser$equality_expression_return",
      "org.firebirdsql.jdbc.FBSQLWarning",
      "org.antlr.runtime.tree.TreeAdaptor",
      "org.databene.jdbacl.sql.parser.SQLParser$expression_return",
      "org.databene.jdbacl.sql.parser.SQLParser$relational_expression_return",
      "org.databene.commons.Named",
      "org.databene.jdbacl.model.DBCheckConstraint",
      "org.antlr.runtime.CharStreamState",
      "org.databene.jdbacl.NameSpec",
      "org.databene.jdbacl.sql.parser.SQLParser$exclusive_or_expression_return",
      "org.databene.jdbacl.sql.parser.SQLParser$null_comparison_return",
      "org.firebirdsql.gds.impl.GDSHelper$GDSHelperErrorListener",
      "org.apache.derby.impl.store.raw.xact.Xact",
      "org.databene.jdbacl.model.DBSequence",
      "org.h2.store.Data",
      "org.databene.jdbacl.model.MultiColumnObject",
      "org.databene.jdbacl.sql.parser.SQLParser$commands_return",
      "org.antlr.runtime.tree.CommonTree",
      "org.databene.jdbacl.sql.parser.SQLParser$primary_return",
      "org.antlr.runtime.MismatchedNotSetException",
      "org.antlr.runtime.tree.BaseTree",
      "org.h2.store.FileStoreInputStream",
      "org.databene.commons.ThreadAware",
      "org.h2.util.SmallLRUCache",
      "org.databene.commons.version.VersionNumber",
      "org.postgresql.util.PSQLException",
      "org.firebirdsql.jca.FBConnectionRequestInfo",
      "org.databene.jdbacl.model.DBIndex",
      "org.firebirdsql.jca.FBManagedConnectionFactory",
      "org.firebirdsql.jdbc.FirebirdSavepoint",
      "org.firebirdsql.jdbc.FBDriverNotCapableException",
      "org.databene.jdbacl.model.DBUniqueConstraint",
      "org.firebirdsql.gds.impl.GDSType",
      "org.antlr.runtime.BufferedTokenStream",
      "org.firebirdsql.jca.FirebirdLocalTransaction",
      "org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream",
      "org.databene.jdbacl.model.DBConstraint",
      "org.databene.jdbacl.model.TableHolder",
      "org.databene.jdbacl.model.DefaultDBColumn",
      "org.antlr.runtime.BitSet",
      "org.databene.jdbacl.model.DBTableComponent",
      "org.antlr.runtime.CharStream",
      "org.h2.value.Value",
      "org.databene.jdbacl.sql.parser.SQLLexer",
      "org.h2.util.TempFileDeleter",
      "org.databene.jdbacl.model.DBDataType$TypeDescriptor",
      "org.apache.derby.impl.store.raw.xact.InternalXact",
      "org.antlr.runtime.tree.TreeNodeStream",
      "org.databene.commons.collection.ListBasedSet",
      "org.databene.jdbacl.model.TableContainer",
      "org.databene.jdbacl.model.DBTrigger",
      "org.databene.jdbacl.sql.parser.SQLParser$in_expression_return",
      "org.h2.tools.Recover",
      "org.antlr.runtime.tree.BaseTreeAdaptor",
      "org.databene.commons.Converter",
      "org.databene.jdbacl.model.DBForeignKeyConstraint",
      "org.apache.derby.iapi.services.locks.LockOwner",
      "org.databene.commons.converter.ToStringConverter",
      "org.antlr.runtime.tree.RewriteRuleTokenStream",
      "org.antlr.runtime.Lexer",
      "org.antlr.runtime.CommonToken",
      "org.h2.value.Value$ValueBlob",
      "org.firebirdsql.jca.FBResourceException",
      "org.postgresql.Driver",
      "org.databene.jdbacl.model.DBRowIterator",
      "org.antlr.runtime.MissingTokenException",
      "org.firebirdsql.jdbc.AbstractConnection",
      "org.antlr.runtime.EarlyExitException",
      "org.databene.jdbacl.sql.parser.SQLParser$between_expression_return",
      "org.apache.derby.iapi.error.StandardException",
      "org.firebirdsql.jdbc.FirebirdConnectionProperties",
      "org.databene.jdbacl.model.FKChangeRule",
      "org.databene.commons.Capitalization",
      "org.postgresql.ds.PGConnectionPoolDataSource",
      "org.databene.commons.Assert",
      "org.apache.derby.iapi.store.raw.xact.RawTransaction",
      "org.antlr.runtime.RecognitionException",
      "org.firebirdsql.jdbc.FBSQLException",
      "org.antlr.runtime.Token",
      "org.firebirdsql.jdbc.InternalTransactionCoordinator$LocalTransactionCoordinator",
      "org.h2.store.DataHandler",
      "org.databene.commons.OrderedMap$ProxyEntry",
      "org.firebirdsql.gds.impl.GDSHelper",
      "org.firebirdsql.gds.GDS",
      "org.antlr.runtime.Parser",
      "org.databene.commons.Patterns",
      "org.databene.commons.ArrayUtil",
      "org.databene.jdbacl.model.DBObject",
      "org.databene.commons.NullSafeComparator",
      "org.databene.jdbacl.model.DefaultDatabase",
      "org.databene.commons.ParseException",
      "org.databene.commons.AssertionError",
      "org.antlr.runtime.TokenSource",
      "org.firebirdsql.jdbc.InternalTransactionCoordinator$AutoCommitCoordinator",
      "org.databene.commons.HeavyweightIterator",
      "org.hsqldb.lib.FileAccess",
      "org.firebirdsql.jdbc.FirebirdConnection",
      "org.databene.jdbacl.sql.parser.SQLParser$and_expression_return",
      "org.antlr.runtime.tree.RewriteRuleElementStream",
      "org.databene.jdbacl.model.AbstractDBTableComponent",
      "org.firebirdsql.gds.impl.DatabaseParameterBufferExtension",
      "org.databene.jdbacl.sql.parser.SQLParser$multiplicative_expression_return",
      "org.databene.jdbacl.sql.parser.SQLParser$additive_expression_return",
      "org.h2.util.Tool",
      "org.databene.jdbacl.sql.parser.TextHolder",
      "org.antlr.runtime.NoViableAltException",
      "org.antlr.runtime.RecognizerSharedState",
      "org.databene.commons.collection.OrderedNameMap",
      "org.firebirdsql.gds.DatabaseParameterBuffer",
      "org.databene.jdbacl.sql.parser.SQLLexer$DFA9",
      "org.antlr.runtime.CommonTokenStream",
      "org.antlr.runtime.TokenStream",
      "org.antlr.runtime.MismatchedTreeNodeException",
      "org.databene.commons.OrderedSet",
      "org.antlr.runtime.RuleReturnScope",
      "org.antlr.runtime.ParserRuleReturnScope",
      "org.databene.commons.ArrayFormat",
      "org.antlr.runtime.ANTLRStringStream",
      "org.firebirdsql.jca.FBManagedConnection",
      "org.databene.commons.SyntaxError",
      "org.h2.store.FileStore",
      "org.antlr.runtime.IntStream",
      "org.databene.commons.OrderedMap",
      "org.antlr.runtime.tree.RewriteCardinalityException",
      "org.firebirdsql.gds.GDSException",
      "org.firebirdsql.jdbc.InternalTransactionCoordinator$AbstractTransactionCoordinator",
      "org.databene.commons.depend.Dependent",
      "org.firebirdsql.gds.IscStmtHandle",
      "org.databene.jdbacl.model.DBColumn",
      "org.firebirdsql.jdbc.FBObjectListener$StatementListener",
      "org.databene.jdbacl.sql.parser.SQLParser$unary_expression_return",
      "org.databene.jdbacl.model.Database",
      "org.hsqldb.lib.FileAccess$FileSync",
      "org.antlr.runtime.tree.RewriteRuleSubtreeStream",
      "org.h2.value.Value$ValueClob",
      "org.databene.jdbacl.model.ContainerComponent",
      "org.databene.jdbacl.model.AbstractCompositeDBObject",
      "org.databene.jdbacl.model.DBCatalog",
      "org.h2.result.SearchRow",
      "org.databene.jdbacl.model.DBPackage",
      "org.databene.jdbacl.sql.SQLParserUtil",
      "org.antlr.runtime.MismatchedSetException",
      "org.databene.jdbacl.model.DBPrimaryKeyConstraint",
      "org.antlr.runtime.MismatchedTokenException",
      "org.databene.jdbacl.model.SequenceHolder",
      "org.databene.jdbacl.SQLUtil",
      "org.databene.jdbacl.sql.parser.SQLParser$DFA2",
      "org.h2.tools.Recover$PageInputStream",
      "org.firebirdsql.gds.TransactionParameterBuffer",
      "org.databene.jdbacl.model.DBUniqueIndex",
      "org.databene.jdbacl.model.CompositeDBObject",
      "org.databene.jdbacl.model.DefaultDBTable",
      "org.databene.commons.iterator.TableRowIterator",
      "org.antlr.runtime.tree.Tree",
      "org.firebirdsql.jdbc.InternalTransactionCoordinator$ManagedTransactionCoordinator",
      "org.databene.commons.ObjectNotFoundException",
      "org.firebirdsql.jca.FBXAException",
      "org.firebirdsql.jdbc.FBConnectionProperties",
      "org.antlr.runtime.BaseRecognizer",
      "org.databene.jdbacl.model.DBSchema",
      "org.antlr.runtime.DFA"
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
      "org.databene.jdbacl.model.AbstractDBTableComponent",
      "org.databene.jdbacl.model.DBIndex",
      "org.databene.jdbacl.model.DBUniqueIndex",
      "org.databene.jdbacl.model.AbstractCompositeDBObject",
      "org.databene.jdbacl.model.DefaultDBTable",
      "org.databene.commons.OrderedMap",
      "org.databene.commons.collection.OrderedNameMap",
      "org.databene.commons.OrderedSet",
      "org.databene.jdbacl.model.DBDataType",
      "org.databene.jdbacl.model.TableContainer",
      "org.databene.jdbacl.model.TableContainerSupport",
      "org.databene.jdbacl.model.DBSchema",
      "org.databene.jdbacl.model.DBConstraint",
      "org.databene.jdbacl.model.DBUniqueConstraint",
      "org.databene.jdbacl.model.DBPrimaryKeyConstraint",
      "org.databene.commons.collection.ListBasedSet",
      "org.databene.commons.ObjectNotFoundException",
      "org.databene.jdbacl.model.DBCatalog",
      "org.databene.commons.version.VersionNumberComponent",
      "org.databene.commons.version.NumberVersionNumberComponent",
      "org.databene.commons.Parser",
      "org.databene.commons.version.VersionNumberParser",
      "org.databene.commons.version.VersionNumber",
      "org.databene.jdbacl.model.DefaultDatabase",
      "org.databene.jdbacl.model.DBDataType$TypeDescriptor",
      "org.apache.derby.iapi.store.raw.xact.RawTransaction",
      "org.databene.jdbacl.model.DefaultDBColumn",
      "org.databene.commons.OrderedMap$ProxyEntry",
      "org.postgresql.core.Logger",
      "org.postgresql.Driver",
      "org.postgresql.ds.common.BaseDataSource",
      "org.postgresql.ds.PGConnectionPoolDataSource",
      "org.h2.jdbcx.JdbcConnectionPool",
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
      "org.antlr.runtime.MismatchedTokenException",
      "org.databene.commons.ParseException",
      "org.firebirdsql.jdbc.FBClob",
      "org.firebirdsql.jdbc.FBSQLException",
      "org.firebirdsql.jdbc.FBDriverNotCapableException",
      "org.databene.commons.version.StringVersionNumberComponent",
      "org.apache.derby.iapi.services.io.DynamicByteArrayOutputStream",
      "org.databene.jdbacl.model.DBNotNullConstraint",
      "org.databene.commons.Assert",
      "org.databene.jdbacl.model.DBForeignKeyConstraint",
      "org.databene.commons.AssertionError",
      "org.antlr.runtime.NoViableAltException",
      "org.databene.commons.bean.HashCodeBuilder",
      "org.antlr.runtime.Token",
      "org.hsqldb.lib.HsqlByteArrayOutputStream",
      "org.hsqldb.rowio.RowOutputBase",
      "org.hsqldb.rowio.RowOutputBinary",
      "org.h2.tools.Csv",
      "org.h2.util.MathUtils",
      "org.h2.constant.SysProperties",
      "org.h2.tools.SimpleResultSet",
      "org.h2.util.New",
      "org.h2.util.StringUtils",
      "org.h2.util.IOUtils",
      "org.h2.util.Utils",
      "org.h2.message.DbException",
      "org.h2.constant.ErrorCode",
      "org.h2.jdbc.JdbcSQLException",
      "org.hsqldb.lib.FileUtil",
      "org.apache.derby.impl.sql.catalog.DataDictionaryImpl",
      "org.apache.derby.impl.db.BasicDatabase",
      "org.apache.derby.impl.services.uuid.BasicUUID",
      "org.apache.derby.iapi.sql.dictionary.TupleDescriptor",
      "org.apache.derby.iapi.sql.dictionary.SchemaDescriptor",
      "org.apache.derby.iapi.sql.dictionary.ConstraintDescriptorList",
      "org.firebirdsql.jdbc.InternalTransactionCoordinator",
      "org.h2.message.TraceObject",
      "org.h2.jdbc.JdbcConnection",
      "org.h2.value.CompareMode",
      "org.databene.jdbacl.model.DBRowIterator",
      "org.apache.derby.iapi.sql.dictionary.TableDescriptor",
      "org.apache.derby.iapi.sql.dictionary.ConglomerateDescriptorList",
      "org.apache.derby.iapi.sql.dictionary.ColumnDescriptorList",
      "org.apache.derby.iapi.sql.dictionary.GenericDescriptorList",
      "org.hsqldb.Result",
      "org.hsqldb.Session",
      "org.hsqldb.jdbc.jdbcConnection",
      "org.hsqldb.jdbc.jdbcStatement",
      "org.hsqldb.jdbc.jdbcPreparedStatement",
      "org.hsqldb.jdbc.jdbcCallableStatement",
      "org.h2.Driver",
      "org.h2.jdbcx.JdbcDataSource",
      "org.h2.jdbcx.JdbcDataSourceFactory",
      "org.h2.message.TraceSystem",
      "org.h2.util.SmallLRUCache",
      "org.h2.message.Trace",
      "org.h2.util.Tool",
      "org.h2.tools.Recover",
      "org.h2.store.fs.FileSystem",
      "org.h2.store.fs.FileSystemDisk",
      "org.h2.value.Value",
      "org.h2.value.ValueNull",
      "org.databene.commons.ArrayUtil",
      "org.databene.commons.NullSafeComparator",
      "org.hsqldb.jdbc.jdbcClob",
      "org.databene.jdbacl.sql.parser.SQLParser$value_return",
      "org.databene.jdbacl.sql.parser.SQLParser$name_return",
      "org.databene.script.expression.ConstantExpression",
      "org.databene.jdbacl.sql.ColumnExpression",
      "org.databene.jdbacl.model.DBTrigger",
      "org.h2.command.dml.SetTypes",
      "org.h2.engine.ConnectionInfo",
      "org.databene.jdbacl.model.DBPackage",
      "org.firebirdsql.logging.LoggerFactory",
      "org.firebirdsql.jca.FBManagedConnection$1",
      "org.firebirdsql.jca.FBManagedConnection$2",
      "org.firebirdsql.jca.FBManagedConnection$3",
      "org.firebirdsql.jca.FBManagedConnection$4",
      "org.firebirdsql.jca.FBManagedConnection$5",
      "org.firebirdsql.jca.FBManagedConnection",
      "org.firebirdsql.jdbc.AbstractConnection",
      "org.firebirdsql.jdbc.FBConnection",
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
      "org.apache.derby.vti.VTITemplate",
      "org.apache.derby.impl.jdbc.EmbedResultSetMetaData",
      "org.apache.derby.impl.sql.GenericColumnDescriptor",
      "org.apache.derby.catalog.types.BaseTypeIdImpl",
      "org.apache.derby.catalog.types.DecimalTypeIdImpl",
      "org.apache.derby.iapi.types.TypeId",
      "org.apache.derby.catalog.types.TypeDescriptorImpl",
      "org.apache.derby.iapi.types.DataTypeDescriptor",
      "org.apache.derby.diag.ErrorMessages",
      "org.databene.jdbacl.model.DBSequence",
      "org.firebirdsql.gds.impl.AbstractGDS",
      "org.firebirdsql.gds.impl.jni.BaseGDSImpl",
      "org.firebirdsql.gds.impl.jni.JniGDSImpl",
      "org.h2.value.ValueLob",
      "org.postgresql.jdbc2.AbstractJdbc2Connection",
      "org.postgresql.jdbc3.AbstractJdbc3Connection",
      "org.postgresql.jdbc3g.AbstractJdbc3gConnection",
      "org.postgresql.jdbc4.AbstractJdbc4Connection",
      "org.postgresql.jdbc4.Jdbc4Connection",
      "org.postgresql.core.v3.ConnectionFactoryImpl",
      "org.postgresql.core.v2.ConnectionFactoryImpl",
      "org.postgresql.core.ConnectionFactory",
      "org.postgresql.core.PGStream",
      "org.databene.commons.NameUtil",
      "org.databene.jdbacl.sql.parser.SQLParser$keyword_return",
      "org.databene.commons.SyntaxError",
      "org.h2.command.Prepared",
      "org.h2.command.dml.ScriptBase",
      "org.h2.command.dml.ScriptCommand",
      "org.apache.derby.impl.sql.compile.QueryTreeNode",
      "org.apache.derby.impl.sql.compile.ResultSetNode",
      "org.apache.derby.impl.sql.compile.FromTable",
      "org.apache.derby.impl.sql.compile.FromVTI",
      "org.apache.derby.impl.store.access.btree.OpenBTree",
      "org.apache.derby.impl.store.access.btree.BTreeController",
      "org.apache.derby.impl.sql.GenericLanguageFactory",
      "org.apache.derby.impl.sql.conn.GenericLanguageConnectionFactory",
      "org.apache.derby.impl.db.SlaveDatabase",
      "org.apache.derby.iapi.services.context.ContextImpl",
      "org.apache.derby.impl.sql.conn.GenericLanguageConnectionContext",
      "org.apache.derby.iapi.types.DataType",
      "org.apache.derby.iapi.services.cache.ClassSizeCatalog",
      "org.apache.derby.iapi.services.cache.ClassSize$1",
      "org.apache.derby.iapi.services.cache.ClassSize",
      "org.apache.derby.iapi.types.CharStreamHeaderGenerator",
      "org.apache.derby.iapi.types.SQLChar",
      "org.apache.derby.iapi.types.SQLVarchar",
      "org.apache.derby.iapi.types.ClobStreamHeaderGenerator",
      "org.apache.derby.iapi.types.SQLClob",
      "org.apache.derby.iapi.error.StandardException",
      "org.firebirdsql.gds.XSQLVAR",
      "org.firebirdsql.jdbc.AbstractResultSet",
      "org.firebirdsql.jdbc.FBResultSet",
      "org.firebirdsql.jdbc.FBCachedFetcher",
      "org.firebirdsql.jdbc.AbstractResultSet$1",
      "org.firebirdsql.jdbc.field.FBField",
      "org.firebirdsql.jdbc.field.TypeConvertionException",
      "org.apache.derby.iapi.sql.dictionary.CatalogRowFactory",
      "org.databene.jdbacl.model.FKChangeRule"
    );
  }
}
