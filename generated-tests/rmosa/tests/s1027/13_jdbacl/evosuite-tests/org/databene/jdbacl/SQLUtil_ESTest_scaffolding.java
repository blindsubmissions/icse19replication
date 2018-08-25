/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Aug 23 18:08:35 GMT 2018
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
    java.lang.System.setProperty("sun.management.compiler", "HotSpot 64-Bit Tiered Compilers"); 
    java.lang.System.setProperty("sun.arch.data.model", "64"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(SQLUtil_ESTest_scaffolding.class.getClassLoader() ,
      "org.databene.commons.converter.FormatHolder",
      "org.antlr.runtime.tree.RewriteEmptyStreamException",
      "org.apache.derby.iapi.store.raw.Transaction",
      "org.databene.jdbacl.model.AbstractDBObject",
      "org.antlr.runtime.MismatchedRangeException",
      "org.apache.derby.diag.ErrorMessages",
      "org.h2.message.DbException",
      "org.databene.jdbacl.sql.parser.SQLParser",
      "org.databene.jdbacl.model.DBNotNullConstraint",
      "org.databene.jdbacl.model.DBDataType",
      "org.apache.derby.iapi.services.locks.Limit",
      "org.databene.commons.CollectionUtil",
      "org.apache.derby.iapi.services.io.DynamicByteArrayOutputStream",
      "org.databene.jdbacl.model.TableContainerSupport",
      "org.databene.script.Expression",
      "org.antlr.runtime.tree.CommonTreeAdaptor",
      "org.h2.jdbcx.JdbcDataSource",
      "org.hsqldb.CachedRow",
      "org.databene.jdbacl.model.DBRow",
      "org.hsqldb.lib.HsqlByteArrayOutputStream",
      "org.antlr.runtime.UnwantedTokenException",
      "org.databene.jdbacl.model.DBTable",
      "org.databene.commons.bean.HashCodeBuilder",
      "org.databene.commons.StringUtil",
      "org.databene.jdbacl.sql.parser.SQLParser$equality_expression_return",
      "org.antlr.runtime.tree.TreeAdaptor",
      "org.databene.jdbacl.sql.parser.SQLParser$expression_return",
      "org.databene.jdbacl.sql.parser.SQLParser$relational_expression_return",
      "org.apache.derby.vti.VTICosting",
      "org.databene.commons.Named",
      "org.databene.jdbacl.model.DBCheckConstraint",
      "org.antlr.runtime.CharStreamState",
      "org.databene.jdbacl.NameSpec",
      "org.hsqldb.Row",
      "org.databene.jdbacl.sql.parser.SQLParser$exclusive_or_expression_return",
      "org.databene.jdbacl.sql.parser.SQLParser$null_comparison_return",
      "org.hsqldb.rowio.RowOutputBase",
      "org.apache.derby.impl.store.raw.xact.Xact",
      "org.databene.jdbacl.model.DBSequence",
      "org.hsqldb.Table",
      "org.databene.jdbacl.model.MultiColumnObject",
      "org.databene.jdbacl.sql.parser.SQLParser$commands_return",
      "org.antlr.runtime.tree.CommonTree",
      "org.databene.jdbacl.sql.parser.SQLParser$primary_return",
      "org.antlr.runtime.MismatchedNotSetException",
      "org.antlr.runtime.tree.BaseTree",
      "org.h2.message.TraceWriter",
      "org.databene.commons.ThreadAware",
      "org.h2.util.SmallLRUCache",
      "org.databene.jdbacl.model.DBIndex",
      "org.databene.script.expression.ConstantExpression",
      "org.databene.jdbacl.sql.parser.SQLParser$name_return",
      "org.databene.jdbacl.model.DBUniqueConstraint",
      "org.antlr.runtime.BufferedTokenStream",
      "org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream",
      "org.databene.jdbacl.model.DBConstraint",
      "org.databene.jdbacl.model.TableHolder",
      "org.databene.jdbacl.model.DefaultDBColumn",
      "org.antlr.runtime.BitSet",
      "org.databene.jdbacl.model.DBTableComponent",
      "org.antlr.runtime.CharStream",
      "org.hsqldb.store.BaseHashMap",
      "org.databene.jdbacl.sql.parser.SQLLexer",
      "org.hsqldb.persist.CachedObject",
      "org.databene.jdbacl.model.DBDataType$TypeDescriptor",
      "org.h2.util.MathUtils",
      "org.apache.derby.impl.store.raw.xact.InternalXact",
      "org.databene.commons.collection.ListBasedSet",
      "org.databene.jdbacl.model.TableContainer",
      "org.databene.jdbacl.model.DBTrigger",
      "org.databene.jdbacl.sql.parser.SQLParser$in_expression_return",
      "org.antlr.runtime.tree.BaseTreeAdaptor",
      "org.databene.commons.Converter",
      "org.databene.jdbacl.model.DBForeignKeyConstraint",
      "org.apache.derby.iapi.services.locks.LockOwner",
      "org.databene.commons.converter.ToStringConverter",
      "org.antlr.runtime.tree.RewriteRuleTokenStream",
      "org.antlr.runtime.Lexer",
      "org.antlr.runtime.CommonToken",
      "org.databene.jdbacl.model.DBRowIterator",
      "org.h2.constant.SysProperties",
      "org.antlr.runtime.MissingTokenException",
      "org.hsqldb.lib.HashMap",
      "org.antlr.runtime.EarlyExitException",
      "org.databene.jdbacl.sql.parser.SQLParser$between_expression_return",
      "org.apache.derby.iapi.error.StandardException",
      "org.databene.jdbacl.model.FKChangeRule",
      "org.h2.jdbcx.JdbcDataSourceFactory",
      "org.databene.commons.Capitalization",
      "org.databene.commons.Assert",
      "org.apache.derby.iapi.store.raw.xact.RawTransaction",
      "org.antlr.runtime.RecognitionException",
      "org.antlr.runtime.Token",
      "org.h2.jdbc.JdbcConnection",
      "org.antlr.runtime.Parser",
      "org.h2.message.Trace",
      "org.databene.commons.Patterns",
      "org.databene.jdbacl.model.DBObject",
      "org.databene.commons.NullSafeComparator",
      "org.databene.commons.ParseException",
      "org.hsqldb.rowio.RowOutputInterface",
      "org.databene.commons.AssertionError",
      "org.antlr.runtime.TokenSource",
      "org.databene.commons.HeavyweightIterator",
      "org.h2.Driver",
      "org.databene.jdbacl.sql.parser.SQLParser$and_expression_return",
      "org.antlr.runtime.tree.RewriteRuleElementStream",
      "org.databene.jdbacl.model.AbstractDBTableComponent",
      "org.databene.jdbacl.sql.ColumnExpression",
      "org.databene.jdbacl.sql.parser.SQLParser$multiplicative_expression_return",
      "org.databene.jdbacl.sql.parser.SQLParser$additive_expression_return",
      "org.databene.jdbacl.sql.parser.TextHolder",
      "org.databene.commons.version.VersionNumberComponent",
      "org.antlr.runtime.NoViableAltException",
      "org.antlr.runtime.RecognizerSharedState",
      "org.apache.derby.vti.VTITemplate",
      "org.databene.commons.collection.OrderedNameMap",
      "org.databene.jdbacl.sql.parser.SQLLexer$DFA9",
      "org.antlr.runtime.CommonTokenStream",
      "org.antlr.runtime.TokenStream",
      "org.antlr.runtime.MismatchedTreeNodeException",
      "org.databene.commons.OrderedSet",
      "org.antlr.runtime.RuleReturnScope",
      "org.antlr.runtime.ParserRuleReturnScope",
      "org.databene.commons.ArrayFormat",
      "org.h2.util.MathUtils$1",
      "org.antlr.runtime.ANTLRStringStream",
      "org.databene.commons.SyntaxError",
      "org.antlr.runtime.IntStream",
      "org.databene.commons.OrderedMap",
      "org.antlr.runtime.tree.RewriteCardinalityException",
      "org.databene.commons.depend.Dependent",
      "org.databene.jdbacl.model.DBColumn",
      "org.databene.jdbacl.sql.parser.SQLParser$unary_expression_return",
      "org.databene.jdbacl.model.Database",
      "org.hsqldb.lib.HashMappedList",
      "org.antlr.runtime.tree.RewriteRuleSubtreeStream",
      "org.databene.jdbacl.model.ContainerComponent",
      "org.databene.jdbacl.model.AbstractCompositeDBObject",
      "org.databene.jdbacl.model.DBCatalog",
      "org.databene.jdbacl.model.DBPackage",
      "org.h2.message.TraceSystem",
      "org.hsqldb.rowio.RowOutputTextLog",
      "org.databene.jdbacl.sql.SQLParserUtil",
      "org.antlr.runtime.MismatchedSetException",
      "org.databene.jdbacl.model.DBPrimaryKeyConstraint",
      "org.antlr.runtime.MismatchedTokenException",
      "org.databene.jdbacl.model.SequenceHolder",
      "org.databene.jdbacl.SQLUtil",
      "org.databene.jdbacl.sql.parser.SQLParser$DFA2",
      "org.databene.jdbacl.model.DBUniqueIndex",
      "org.hsqldb.BaseTable",
      "org.databene.jdbacl.model.CompositeDBObject",
      "org.databene.jdbacl.model.DefaultDBTable",
      "org.databene.commons.iterator.TableRowIterator",
      "org.antlr.runtime.tree.Tree",
      "org.h2.message.TraceObject",
      "org.databene.jdbacl.sql.parser.SQLParser$value_return",
      "org.databene.commons.ObjectNotFoundException",
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
      "org.postgresql.core.Logger",
      "org.postgresql.Driver",
      "org.postgresql.ds.common.BaseDataSource",
      "org.postgresql.ds.PGConnectionPoolDataSource",
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
      "org.apache.derby.iapi.sql.dictionary.DataDescriptorGenerator",
      "org.apache.derby.impl.sql.compile.QueryTreeNode",
      "org.apache.derby.impl.sql.compile.StatementNode",
      "org.apache.derby.impl.sql.compile.DDLStatementNode",
      "org.apache.derby.impl.sql.compile.AlterTableNode",
      "org.apache.derby.iapi.util.ByteArray",
      "org.apache.derby.iapi.sql.dictionary.GenericDescriptorList",
      "org.databene.jdbacl.model.DBRowIterator",
      "org.databene.jdbacl.model.DBPackage",
      "org.apache.derby.iapi.sql.dictionary.TableDescriptor",
      "org.apache.derby.iapi.sql.dictionary.ConglomerateDescriptorList",
      "org.apache.derby.iapi.sql.dictionary.ColumnDescriptorList",
      "org.apache.derby.iapi.sql.dictionary.ConstraintDescriptorList",
      "org.databene.jdbacl.model.DBIndex",
      "org.databene.jdbacl.model.DBUniqueIndex",
      "org.antlr.runtime.RecognitionException",
      "org.antlr.runtime.NoViableAltException",
      "org.databene.commons.ParseException",
      "org.h2.engine.SessionWithState",
      "org.h2.engine.SessionRemote",
      "org.databene.jdbacl.DBUtil",
      "org.databene.jdbacl.sql.parser.SQLParser$keyword_return",
      "org.databene.commons.SyntaxError",
      "org.apache.derby.impl.sql.compile.CreateIndexNode",
      "org.databene.jdbacl.sql.parser.SQLParser$literal_return",
      "org.hsqldb.jdbc.jdbcClob",
      "org.firebirdsql.jdbc.FBClob",
      "org.firebirdsql.jdbc.FBSQLException",
      "org.firebirdsql.jdbc.FBDriverNotCapableException",
      "org.apache.derby.impl.store.raw.xact.XactFactory",
      "org.apache.derby.impl.store.raw.xact.ConcurrentXactFactory",
      "org.apache.derby.impl.store.raw.xact.TransactionMapFactory",
      "org.apache.derby.impl.store.raw.xact.ConcurrentTransactionMapFactory",
      "org.databene.script.expression.UnaryExpression",
      "org.databene.script.expression.LogicalComplementExpression",
      "org.databene.script.expression.NullExpression",
      "org.firebirdsql.logging.LoggerFactory",
      "org.firebirdsql.jca.FBManagedConnectionFactory",
      "org.firebirdsql.gds.impl.GDSFactory$ReversedStringComparator",
      "org.firebirdsql.gds.impl.wire.WireGDSFactoryPlugin",
      "org.firebirdsql.gds.impl.GDSType",
      "org.firebirdsql.gds.impl.jni.NativeGDSFactoryPlugin",
      "org.firebirdsql.gds.impl.jni.LocalGDSFactoryPlugin",
      "org.firebirdsql.gds.impl.jni.EmbeddedGDSFactoryPlugin",
      "org.firebirdsql.gds.impl.GDSFactory",
      "org.firebirdsql.jdbc.FBConnectionProperties",
      "org.firebirdsql.jca.FBStandAloneConnectionManager",
      "org.firebirdsql.jca.FBManagedConnection$1",
      "org.firebirdsql.jca.FBManagedConnection$2",
      "org.firebirdsql.jca.FBManagedConnection$3",
      "org.firebirdsql.jca.FBManagedConnection$4",
      "org.firebirdsql.jca.FBManagedConnection$5",
      "org.firebirdsql.jca.FBManagedConnection",
      "org.firebirdsql.jdbc.AbstractConnection",
      "org.firebirdsql.jdbc.FBConnection",
      "org.firebirdsql.jdbc.InternalTransactionCoordinator",
      "org.hsqldb.lib.FileUtil",
      "org.apache.derby.iapi.services.context.ContextService",
      "org.apache.derby.iapi.error.ShutdownException",
      "org.databene.commons.iterator.ConvertingIterator",
      "org.databene.jdbacl.ArrayResultSetIterator",
      "org.databene.commons.iterator.IteratorProxy",
      "org.databene.jdbacl.QueryIterator",
      "org.hsqldb.lib.StringInputStream",
      "org.hsqldb.lib.AsciiStringInputStream",
      "org.apache.derby.vti.VTITemplate",
      "org.apache.derby.impl.jdbc.EmbedResultSetMetaData",
      "org.apache.derby.impl.sql.GenericColumnDescriptor",
      "org.apache.derby.catalog.types.BaseTypeIdImpl",
      "org.apache.derby.catalog.types.DecimalTypeIdImpl",
      "org.apache.derby.iapi.types.TypeId",
      "org.apache.derby.catalog.types.TypeDescriptorImpl",
      "org.apache.derby.iapi.types.DataTypeDescriptor",
      "org.apache.derby.diag.ErrorMessages",
      "org.firebirdsql.gds.impl.AbstractGDS",
      "org.firebirdsql.gds.impl.wire.AbstractJavaGDSImpl",
      "org.firebirdsql.gds.impl.wire.JavaGDSImpl",
      "org.firebirdsql.gds.impl.AbstractIscDbHandle",
      "org.firebirdsql.gds.impl.wire.isc_db_handle_impl",
      "org.firebirdsql.gds.impl.GDSHelper",
      "org.h2.value.Value",
      "org.h2.value.ValueLob",
      "org.h2.util.MathUtils",
      "org.h2.constant.SysProperties",
      "org.h2.util.StringUtils",
      "org.h2.util.Utils",
      "org.hsqldb.jdbc.Util",
      "org.hsqldb.store.BaseHashMap",
      "org.hsqldb.lib.HashMap",
      "org.hsqldb.store.HashIndex",
      "org.hsqldb.lib.BaseList",
      "org.hsqldb.lib.HsqlArrayList",
      "org.hsqldb.resources.BundleHandler",
      "org.hsqldb.Trace",
      "org.hsqldb.HsqlException",
      "org.databene.jdbacl.model.DBNonUniqueIndex",
      "org.h2.jdbcx.JdbcConnectionPool",
      "org.h2.message.TraceObject",
      "org.h2.Driver",
      "org.h2.jdbcx.JdbcDataSource",
      "org.h2.jdbcx.JdbcDataSourceFactory",
      "org.h2.message.TraceSystem",
      "org.h2.util.SmallLRUCache",
      "org.h2.message.Trace",
      "org.databene.commons.ArrayUtil",
      "org.databene.commons.NullSafeComparator",
      "org.apache.derby.iapi.services.io.DynamicByteArrayOutputStream",
      "org.apache.derby.impl.sql.compile.ResultSetNode",
      "org.apache.derby.impl.sql.compile.FromTable",
      "org.apache.derby.impl.sql.compile.FromVTI",
      "org.apache.derby.iapi.services.monitor.Monitor",
      "org.h2.value.ValueNull",
      "org.firebirdsql.gds.XSQLVAR",
      "org.h2.tools.Csv",
      "org.h2.tools.SimpleResultSet",
      "org.h2.message.DbException",
      "org.h2.constant.ErrorCode",
      "org.h2.jdbc.JdbcSQLException",
      "org.firebirdsql.gds.impl.jni.BaseGDSImpl",
      "org.firebirdsql.gds.impl.jni.JniGDSImpl",
      "org.h2.value.ValueArray",
      "org.h2.util.StatementBuilder",
      "org.databene.commons.NameUtil",
      "org.apache.derby.impl.io.vfmem.PathUtil",
      "org.apache.derby.impl.io.vfmem.DataStore",
      "org.apache.derby.impl.io.vfmem.VirtualFile",
      "org.h2.jdbc.JdbcConnection",
      "org.h2.value.CompareMode",
      "org.h2.command.dml.SetTypes",
      "org.h2.engine.ConnectionInfo",
      "org.h2.store.FileStore",
      "org.h2.util.TempFileDeleter",
      "org.h2.store.fs.FileObjectDisk",
      "org.h2.store.FileStoreInputStream",
      "org.h2.store.Data",
      "org.h2.engine.Session",
      "org.h2.value.ValueLong",
      "org.h2.command.Prepared",
      "org.h2.command.dml.ScriptBase",
      "org.h2.command.dml.RunScriptCommand",
      "org.hsqldb.lib.HsqlByteArrayOutputStream",
      "org.hsqldb.rowio.RowOutputBase",
      "org.hsqldb.rowio.RowOutputBinary",
      "org.apache.derby.impl.sql.execute.WriteCursorConstantAction",
      "org.apache.derby.impl.sql.execute.DeleteConstantAction",
      "org.apache.derby.impl.sql.compile.TableElementNode",
      "org.apache.derby.impl.sql.compile.ConstraintDefinitionNode",
      "org.hsqldb.lib.HsqlByteArrayInputStream",
      "org.hsqldb.rowio.RowInputBase",
      "org.hsqldb.rowio.RowInputText",
      "org.h2.value.ValueLobDb",
      "org.h2.engine.Database",
      "org.h2.engine.Mode",
      "org.h2.store.fs.FileSystemMemory",
      "org.h2.store.fs.FileSystemZip",
      "org.h2.store.fs.FileSystemSplit",
      "org.h2.store.fs.FileSystemDiskNio",
      "org.h2.store.fs.FileSystemDiskNioMapped",
      "org.firebirdsql.jdbc.AbstractResultSet",
      "org.firebirdsql.jdbc.FBResultSet",
      "org.firebirdsql.jdbc.FBCachedFetcher",
      "org.firebirdsql.jdbc.AbstractResultSet$1",
      "org.firebirdsql.jdbc.field.FBField",
      "org.firebirdsql.jdbc.field.TypeConvertionException",
      "org.hsqldb.Result",
      "org.hsqldb.Session",
      "org.hsqldb.jdbc.jdbcConnection",
      "org.hsqldb.jdbc.jdbcStatement",
      "org.hsqldb.jdbc.jdbcPreparedStatement",
      "org.hsqldb.jdbc.jdbcCallableStatement",
      "org.h2.jdbcx.JdbcXAConnection",
      "org.hsqldb.rowio.RowOutputTextLog",
      "org.h2.command.dml.ScriptCommand",
      "org.firebirdsql.jdbc.AbstractStatement",
      "org.firebirdsql.jdbc.AbstractPreparedStatement",
      "org.firebirdsql.jdbc.AbstractCallableStatement",
      "org.firebirdsql.jdbc.FBCallableStatement",
      "org.firebirdsql.jdbc.AbstractStatement$RSListener",
      "org.firebirdsql.gds.ISCConstants",
      "org.firebirdsql.jdbc.FBConnectionHelper",
      "org.firebirdsql.jdbc.FBDriverPropertyManager$PropertyInfo",
      "org.firebirdsql.jdbc.FBDriverPropertyManager",
      "org.hsqldb.jdbc.jdbcBlob",
      "org.h2.store.LobStorage",
      "org.h2.tools.CompressTool",
      "org.apache.derby.impl.sql.compile.DMLStatementNode",
      "org.apache.derby.impl.sql.compile.DMLModStatementNode",
      "org.apache.derby.impl.sql.compile.DeleteNode",
      "org.firebirdsql.gds.impl.wire.ParameterBufferBase",
      "org.firebirdsql.gds.impl.wire.DatabaseParameterBufferImp",
      "org.h2.value.ValueByte",
      "org.h2.command.dml.Query",
      "org.h2.command.dml.Select",
      "org.h2.value.ValueDouble",
      "org.h2.value.DataType",
      "org.h2.command.ddl.CreateTableData",
      "org.h2.engine.Engine",
      "org.h2.store.FileLock",
      "org.apache.derby.iapi.services.io.FormatableProperties",
      "org.h2.util.SortedProperties",
      "org.h2.util.MathUtils$1",
      "org.firebirdsql.jdbc.InternalTransactionCoordinator$AbstractTransactionCoordinator",
      "org.firebirdsql.jdbc.InternalTransactionCoordinator$MetaDataTransactionCoordinator",
      "org.firebirdsql.gds.impl.jni.ParameterBufferBase",
      "org.firebirdsql.gds.impl.jni.DatabaseParameterBufferImp",
      "org.firebirdsql.jdbc.FBEscapedCallParser",
      "org.firebirdsql.jdbc.FBEscapedParser",
      "org.firebirdsql.jdbc.FBProcedureCall",
      "org.h2.expression.Expression",
      "org.h2.expression.Parameter",
      "org.antlr.runtime.MismatchedTokenException",
      "org.apache.derby.impl.sql.compile.InsertNode",
      "org.apache.derby.impl.sql.execute.rts.RealBasicNoPutResultSetStatistics",
      "org.apache.derby.impl.sql.execute.rts.RealNoPutResultSetStatistics",
      "org.apache.derby.impl.sql.execute.rts.RealTableScanStatistics",
      "org.hsqldb.rowio.RowOutputText",
      "org.hsqldb.rowio.RowOutputTextQuoted",
      "org.apache.derby.impl.sql.execute.rts.RealHashScanStatistics",
      "org.apache.derby.impl.sql.execute.rts.RealDistinctScanStatistics",
      "org.apache.derby.impl.sql.execute.rts.RealHashTableStatistics",
      "org.databene.script.expression.BinaryExpression",
      "org.databene.script.expression.LessExpression",
      "org.databene.script.expression.CompositeExpression",
      "org.databene.script.expression.DivisionExpression",
      "org.databene.jdbacl.model.DBProcedure",
      "org.databene.script.expression.SumExpression",
      "org.apache.derby.impl.store.raw.data.BaseDataFileFactory",
      "org.apache.derby.impl.store.raw.data.BaseDataFileFactoryJ4",
      "org.apache.derby.impl.sql.compile.FromBaseTable",
      "org.apache.derby.impl.sql.compile.FKConstraintDefinitionNode",
      "org.databene.jdbacl.model.DBTrigger",
      "org.hsqldb.persist.HsqlProperties",
      "org.hsqldb.DatabaseURL",
      "org.firebirdsql.jca.FBConnectionRequestInfo",
      "org.firebirdsql.gds.impl.jni.isc_db_handle_impl",
      "org.postgresql.jdbc4.Jdbc4SQLXML",
      "org.firebirdsql.jdbc.FBStatement",
      "org.postgresql.jdbc2.AbstractJdbc2BlobClob",
      "org.postgresql.jdbc2.AbstractJdbc2Clob",
      "org.postgresql.jdbc3.AbstractJdbc3Clob",
      "org.postgresql.jdbc4.AbstractJdbc4Clob",
      "org.postgresql.jdbc4.Jdbc4Clob",
      "org.postgresql.ds.jdbc23.AbstractJdbc23PooledConnection",
      "org.postgresql.ds.jdbc4.AbstractJdbc4PooledConnection",
      "org.postgresql.ds.PGPooledConnection",
      "org.apache.derby.impl.store.access.conglomerate.GenericController",
      "org.apache.derby.impl.store.access.conglomerate.GenericConglomerateController",
      "org.apache.derby.impl.store.access.heap.HeapController",
      "org.hsqldb.rowio.RowInputBinary",
      "org.apache.derby.iapi.services.io.ArrayInputStream",
      "org.apache.derby.iapi.util.ReuseFactory",
      "org.apache.derby.iapi.services.io.FormatIdInputStream",
      "org.h2.value.ValueTimestamp",
      "org.h2.util.DateTimeUtils",
      "org.h2.value.ValueTime",
      "org.apache.derby.iapi.services.info.JVMInfo",
      "org.apache.derby.impl.services.monitor.BaseMonitor",
      "org.apache.derby.impl.services.monitor.FileMonitor",
      "org.apache.derby.impl.services.monitor.TopService",
      "org.apache.derby.iapi.services.info.ProductVersionHolder",
      "org.apache.derby.iapi.services.io.FileUtil",
      "org.firebirdsql.gds.impl.AbstractIscStmtHandle",
      "org.firebirdsql.gds.impl.wire.isc_stmt_handle_impl",
      "org.hsqldb.jdbc.jdbcResultSet",
      "org.hsqldb.jdbc.jdbcResultSetMetaData",
      "org.databene.jdbacl.ResultSetIterator",
      "org.apache.derby.impl.db.BasicDatabase",
      "org.apache.derby.impl.db.SlaveDatabase",
      "org.apache.derby.iapi.error.StandardException",
      "org.firebirdsql.jdbc.FBPreparedStatement",
      "org.firebirdsql.gds.GDSException",
      "org.firebirdsql.gds.GDSExceptionHelper",
      "org.firebirdsql.gds.GDSExceptionHelper$GDSMessage",
      "org.hsqldb.rowio.RowInputTextLog",
      "org.hsqldb.lib.IntValueHashMap",
      "org.hsqldb.Tokenizer",
      "org.apache.derby.iapi.services.i18n.MessageService",
      "org.apache.derby.impl.services.locks.AbstractPool",
      "org.apache.derby.impl.services.locks.SinglePool",
      "org.apache.derby.impl.services.bytecode.BCJava",
      "org.apache.derby.impl.store.replication.slave.SlaveController",
      "org.apache.derby.impl.sql.execute.GenericExecutionFactory",
      "org.apache.derby.impl.jdbc.authentication.AuthenticationServiceBase",
      "org.apache.derby.impl.jdbc.authentication.NoneAuthenticationServiceImpl",
      "org.apache.derby.iapi.jdbc.DRDAServerStarter",
      "org.apache.derby.iapi.types.DataValueFactoryImpl",
      "org.apache.derby.iapi.types.J2SEDataValueFactory",
      "org.apache.derby.impl.services.jmxnone.NoManagementService",
      "org.apache.derby.impl.store.replication.master.MasterController",
      "org.apache.derby.iapi.types.CDCDataValueFactory",
      "org.apache.derby.impl.store.access.btree.index.B2IFactory",
      "org.apache.derby.impl.services.uuid.BasicUUIDFactory",
      "org.apache.derby.impl.services.jce.JCECipherFactoryBuilder",
      "org.apache.derby.impl.store.access.RAMAccessManager",
      "org.apache.derby.impl.store.access.RllRAMAccessManager",
      "org.apache.derby.jdbc.InternalDriver",
      "org.apache.derby.jdbc.Driver169",
      "org.apache.derby.impl.sql.compile.OptimizerFactoryImpl",
      "org.apache.derby.impl.sql.compile.Level2OptimizerFactoryImpl",
      "org.apache.derby.impl.jdbc.authentication.SpecificAuthenticationServiceImpl",
      "org.apache.derby.impl.jdbc.authentication.JNDIAuthenticationService",
      "org.apache.derby.impl.jdbc.authentication.BasicAuthenticationServiceImpl",
      "org.apache.derby.iapi.services.property.PropertyValidation",
      "org.apache.derby.impl.services.stream.SingleStream",
      "org.apache.derby.impl.services.reflect.DatabaseClasses",
      "org.apache.derby.impl.services.reflect.ReflectClassesJava2",
      "org.apache.derby.jdbc.Driver20",
      "org.apache.derby.jdbc.Driver30",
      "org.apache.derby.jdbc.Driver40",
      "org.apache.derby.impl.store.raw.log.LogToFile",
      "org.apache.derby.impl.store.raw.log.ReadOnly",
      "org.apache.derby.impl.store.access.heap.HeapConglomerateFactory",
      "org.apache.derby.impl.services.daemon.SingleThreadDaemonFactory",
      "org.apache.derby.impl.sql.compile.TypeCompilerFactoryImpl",
      "org.apache.derby.impl.store.access.sort.ExternalSortFactory",
      "org.apache.derby.impl.store.access.sort.UniqueWithDuplicateNullsExternalSortFactory",
      "org.apache.derby.impl.services.cache.ConcurrentCacheFactory",
      "org.apache.derby.impl.sql.execute.RealResultSetStatisticsFactory",
      "org.apache.derby.impl.services.cache.ClockFactory",
      "org.apache.derby.impl.sql.execute.xplain.XPLAINFactory",
      "org.apache.derby.jdbc.ResourceAdapterImpl",
      "org.apache.derby.security.SystemPermission",
      "org.apache.derby.impl.services.jmx.JMXManagementService",
      "org.apache.derby.impl.services.timer.SingletonTimerFactory",
      "org.apache.derby.impl.sql.conn.GenericLanguageConnectionFactory",
      "org.apache.derby.impl.store.raw.RawStore",
      "org.apache.derby.impl.sql.GenericLanguageFactory",
      "org.apache.derby.iapi.sql.compile.NodeFactory",
      "org.apache.derby.impl.sql.compile.NodeFactoryImpl",
      "org.apache.derby.impl.services.locks.ConcurrentPool",
      "org.apache.derby.impl.services.monitor.ProtocolKey",
      "org.apache.derby.impl.services.monitor.ModuleInstance",
      "org.apache.derby.impl.services.stream.BasicGetLogHeader",
      "org.apache.derby.iapi.services.property.PropertyUtil",
      "org.apache.derby.impl.services.stream.BasicHeaderPrintWriter",
      "org.apache.derby.impl.services.timer.SingletonTimerFactory$1",
      "org.apache.derby.impl.services.timer.SingletonTimerFactory$2",
      "org.apache.derby.impl.services.timer.SingletonTimerFactory$3",
      "org.apache.derby.impl.services.jmx.JMXManagementService$1",
      "org.apache.derby.impl.services.jmx.JMXManagementService$2",
      "org.apache.derby.impl.services.jmx.JMXManagementService$3",
      "org.apache.derby.iapi.services.info.Version",
      "org.hsqldb.rowio.RowInputTextQuoted",
      "org.h2.value.ValueString",
      "org.h2.value.ValueStringFixed",
      "org.h2.jdbc.JdbcClob",
      "org.apache.derby.impl.io.vfmem.DataStoreEntry",
      "org.apache.derby.impl.io.vfmem.BlockedByteArray",
      "org.apache.derby.impl.io.vfmem.BlockedByteArrayOutputStream",
      "org.h2.value.ValueDecimal",
      "org.h2.value.ValueShort",
      "org.firebirdsql.gds.impl.jni.isc_stmt_handle_impl",
      "org.firebirdsql.jdbc.FBCachedBlob",
      "org.hsqldb.Result$ResultMetaData",
      "org.firebirdsql.jdbc.InternalTransactionCoordinator$LocalTransactionCoordinator",
      "org.firebirdsql.jdbc.InternalTransactionCoordinator$ManagedTransactionCoordinator",
      "org.databene.commons.comparator.IntComparator",
      "org.hsqldb.lib.ArrayUtil",
      "org.firebirdsql.jdbc.FBBlob",
      "org.apache.derby.iapi.store.access.GlobalXact",
      "org.apache.derby.impl.store.raw.xact.GlobalXactId",
      "org.apache.derby.impl.sql.execute.rts.RealNoRowsResultSetStatistics",
      "org.apache.derby.impl.sql.execute.rts.RealInsertVTIResultSetStatistics",
      "org.apache.derby.impl.sql.execute.rts.RealDeleteResultSetStatistics",
      "org.apache.derby.impl.sql.execute.rts.RealDeleteCascadeResultSetStatistics",
      "org.apache.derby.impl.sql.execute.rts.RealSortStatistics",
      "org.hsqldb.lib.StringUtil",
      "org.apache.derby.impl.store.access.btree.OpenBTree",
      "org.apache.derby.impl.store.access.btree.BTreeController",
      "org.apache.derby.impl.store.access.conglomerate.GenericCostController",
      "org.apache.derby.impl.store.access.heap.HeapCostController",
      "org.apache.derby.impl.services.daemon.BasicDaemon",
      "org.h2.engine.DbObjectBase",
      "org.h2.schema.SchemaObjectBase",
      "org.h2.table.Table",
      "org.h2.table.TableBase",
      "org.h2.table.RegularTable",
      "org.h2.value.ValueUuid",
      "org.apache.derby.impl.store.raw.xact.TransactionTable",
      "org.apache.derby.impl.sql.execute.rts.RealRowResultSetStatistics",
      "org.databene.script.expression.ExpressionUtil",
      "org.hsqldb.lib.StringConverter",
      "org.h2.store.FileLister",
      "org.apache.derby.impl.store.access.conglomerate.ConglomerateUtil",
      "org.apache.derby.impl.sql.catalog.DDdependableFinder",
      "org.apache.derby.iapi.types.DataType",
      "org.apache.derby.impl.store.access.conglomerate.GenericConglomerate",
      "org.apache.derby.impl.store.access.btree.BTree",
      "org.apache.derby.iapi.services.cache.ClassSizeCatalog",
      "org.apache.derby.iapi.services.cache.ClassSize$1",
      "org.apache.derby.iapi.services.cache.ClassSize",
      "org.apache.derby.impl.store.access.btree.index.B2I",
      "org.h2.store.LobStorage$LobInputStream",
      "org.apache.derby.iapi.types.CharStreamHeaderGenerator",
      "org.apache.derby.iapi.types.SQLChar",
      "org.apache.derby.iapi.types.SQLVarchar",
      "org.apache.derby.iapi.types.ClobStreamHeaderGenerator",
      "org.apache.derby.iapi.types.SQLClob",
      "org.apache.derby.impl.store.access.btree.index.B2I_10_3",
      "org.apache.derby.impl.store.access.btree.index.B2I_v10_2",
      "org.databene.commons.version.DateVersionNumberComponent",
      "org.hsqldb.jdbc.jdbcDatabaseMetaData",
      "org.h2.engine.RightOwner",
      "org.h2.engine.User",
      "org.apache.derby.impl.sql.execute.rts.RealCurrentOfStatistics",
      "org.apache.derby.impl.sql.execute.rts.RealNormalizeResultSetStatistics",
      "org.h2.value.ValueFloat",
      "org.apache.derby.iapi.types.SQLBinary",
      "org.apache.derby.iapi.types.SQLBit",
      "org.apache.derby.iapi.types.SQLVarbit",
      "org.apache.derby.iapi.types.SQLLongVarbit"
    );
  }
}
