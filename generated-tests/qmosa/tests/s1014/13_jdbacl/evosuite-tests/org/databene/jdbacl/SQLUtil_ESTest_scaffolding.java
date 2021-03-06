/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Aug 24 13:33:34 GMT 2018
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
      "org.apache.derby.iapi.sql.compile.OptimizableList",
      "org.databene.commons.version.StringVersionNumberComponent",
      "org.databene.jdbacl.model.AbstractDBObject",
      "org.h2.tools.Csv",
      "org.apache.derby.iapi.services.locks.Limit",
      "org.databene.commons.CollectionUtil",
      "org.databene.script.Expression",
      "org.databene.commons.version.DateVersionNumberComponent",
      "org.apache.derby.iapi.services.compiler.MethodBuilder",
      "org.databene.jdbacl.model.DBRow",
      "org.databene.jdbacl.sql.parser.SQLParser$equality_expression_return",
      "org.apache.derby.impl.sql.execute.GenericConstantActionFactory",
      "org.apache.derby.iapi.sql.dictionary.TableDescriptor",
      "org.apache.derby.iapi.sql.dictionary.IndexRowGenerator",
      "org.apache.derby.iapi.sql.dictionary.PrivilegedSQLObject",
      "org.databene.jdbacl.model.DBCheckConstraint",
      "org.apache.derby.impl.sql.compile.FromList",
      "org.databene.jdbacl.sql.parser.SQLParser$exclusive_or_expression_return",
      "org.apache.derby.iapi.sql.compile.Visitor",
      "org.databene.jdbacl.model.MultiColumnObject",
      "org.databene.jdbacl.sql.parser.SQLParser$commands_return",
      "org.antlr.runtime.tree.CommonTree",
      "org.databene.jdbacl.sql.parser.SQLParser$primary_return",
      "org.apache.derby.iapi.sql.dictionary.DataDictionary",
      "org.antlr.runtime.MismatchedNotSetException",
      "org.apache.derby.impl.sql.compile.ResultColumn",
      "org.apache.derby.iapi.sql.compile.Optimizable",
      "org.apache.derby.iapi.types.Orderable",
      "org.h2.util.SmallLRUCache",
      "org.h2.tools.SimpleRowSource",
      "org.postgresql.util.PSQLException",
      "org.apache.derby.impl.sql.compile.ExpressionClassBuilder",
      "org.databene.jdbacl.model.DBUniqueConstraint",
      "org.apache.derby.impl.sql.compile.QueryTreeNodeVector",
      "org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream",
      "org.databene.jdbacl.model.TableHolder",
      "org.antlr.runtime.CharStream",
      "org.databene.jdbacl.sql.parser.SQLLexer",
      "org.databene.jdbacl.model.DBDataType$TypeDescriptor",
      "org.databene.jdbacl.model.TableContainer",
      "org.databene.commons.Converter",
      "org.databene.jdbacl.model.DBForeignKeyConstraint",
      "org.databene.commons.converter.ToStringConverter",
      "org.apache.derby.iapi.sql.compile.ExpressionClassBuilderInterface",
      "org.antlr.runtime.Lexer",
      "org.apache.derby.impl.sql.compile.FromBaseTable",
      "org.antlr.runtime.MissingTokenException",
      "org.apache.derby.iapi.sql.compile.Visitable",
      "org.apache.derby.impl.sql.compile.TestConstraintNode",
      "org.apache.derby.iapi.sql.ResultColumnDescriptor",
      "org.antlr.runtime.EarlyExitException",
      "org.apache.derby.iapi.util.ByteArray",
      "org.apache.derby.iapi.error.StandardException",
      "org.databene.jdbacl.model.FKChangeRule",
      "org.h2.jdbcx.JdbcDataSourceFactory",
      "org.apache.derby.iapi.services.io.Storable",
      "org.postgresql.ds.PGConnectionPoolDataSource",
      "org.apache.derby.iapi.services.loader.GeneratedClass",
      "org.apache.derby.iapi.store.raw.xact.RawTransaction",
      "org.apache.derby.catalog.Dependable",
      "org.apache.derby.iapi.sql.compile.NodeFactory",
      "org.antlr.runtime.Token",
      "org.antlr.runtime.Parser",
      "org.h2.message.Trace",
      "org.databene.jdbacl.model.DBObject",
      "org.databene.commons.AssertionError",
      "org.antlr.runtime.tree.RewriteRuleElementStream",
      "org.databene.jdbacl.sql.ColumnExpression",
      "org.apache.derby.impl.sql.compile.DMLStatementNode",
      "org.apache.derby.impl.sql.compile.FromTable",
      "org.apache.derby.impl.sql.compile.DMLModStatementNode",
      "org.apache.derby.impl.sql.compile.UnaryOperatorNode",
      "org.apache.derby.impl.sql.compile.QueryTreeNode",
      "org.antlr.runtime.NoViableAltException",
      "org.antlr.runtime.RecognizerSharedState",
      "org.apache.derby.iapi.services.io.FormatableProperties",
      "org.antlr.runtime.CommonTokenStream",
      "org.databene.commons.OrderedSet",
      "org.antlr.runtime.RuleReturnScope",
      "org.h2.util.MathUtils$1",
      "org.apache.derby.impl.sql.compile.UnaryLogicalOperatorNode",
      "org.databene.commons.depend.Dependent",
      "org.apache.derby.iapi.types.DataTypeDescriptor",
      "org.databene.jdbacl.model.DBColumn",
      "org.databene.jdbacl.sql.parser.SQLParser$unary_expression_return",
      "org.antlr.runtime.tree.RewriteRuleSubtreeStream",
      "org.databene.jdbacl.model.ContainerComponent",
      "org.databene.jdbacl.model.DBPackage",
      "org.databene.jdbacl.sql.SQLParserUtil",
      "org.apache.derby.iapi.sql.dictionary.UniqueSQLObjectDescriptor",
      "org.databene.jdbacl.SQLUtil",
      "org.apache.derby.iapi.sql.depend.Provider",
      "org.databene.jdbacl.model.CompositeDBObject",
      "org.apache.derby.iapi.services.io.FormatableBitSet",
      "org.h2.message.TraceObject",
      "org.apache.derby.iapi.sql.dictionary.GenericDescriptorList",
      "org.databene.jdbacl.sql.parser.SQLParser$value_return",
      "org.antlr.runtime.DFA",
      "org.h2.jdbcx.JdbcConnectionPool",
      "org.databene.commons.converter.FormatHolder",
      "org.antlr.runtime.tree.RewriteEmptyStreamException",
      "org.apache.derby.iapi.store.raw.Transaction",
      "org.apache.derby.catalog.IndexDescriptor",
      "org.antlr.runtime.MismatchedRangeException",
      "org.apache.derby.iapi.sql.dictionary.UniqueTupleDescriptor",
      "org.postgresql.ds.common.BaseDataSource",
      "org.apache.derby.impl.sql.compile.ActivationClassBuilder",
      "org.h2.message.DbException",
      "org.databene.jdbacl.sql.parser.SQLParser",
      "org.postgresql.core.Logger",
      "org.databene.jdbacl.model.DBNotNullConstraint",
      "org.databene.jdbacl.model.DBDataType",
      "org.apache.derby.iapi.sql.execute.ConstantAction",
      "org.apache.derby.impl.sql.compile.ConstantNode",
      "org.apache.derby.iapi.services.io.DynamicByteArrayOutputStream",
      "org.databene.jdbacl.model.TableContainerSupport",
      "org.antlr.runtime.tree.CommonTreeAdaptor",
      "org.h2.jdbcx.JdbcDataSource",
      "org.antlr.runtime.UnwantedTokenException",
      "org.databene.jdbacl.model.DBTable",
      "org.databene.commons.bean.HashCodeBuilder",
      "org.databene.commons.StringUtil",
      "org.antlr.runtime.tree.TreeAdaptor",
      "org.databene.jdbacl.sql.parser.SQLParser$expression_return",
      "org.apache.derby.catalog.UUID",
      "org.apache.derby.iapi.sql.dictionary.TupleDescriptor",
      "org.databene.jdbacl.sql.parser.SQLParser$relational_expression_return",
      "org.databene.commons.Named",
      "org.antlr.runtime.CharStreamState",
      "org.databene.jdbacl.NameSpec",
      "org.apache.derby.iapi.sql.dictionary.ConstraintDescriptor",
      "org.databene.jdbacl.sql.parser.SQLParser$null_comparison_return",
      "org.apache.derby.impl.sql.compile.ValueNode",
      "org.databene.commons.Parser",
      "org.apache.derby.impl.store.raw.xact.Xact",
      "org.databene.jdbacl.model.DBSequence",
      "org.apache.derby.iapi.services.io.Formatable",
      "org.antlr.runtime.tree.BaseTree",
      "org.h2.message.TraceWriter",
      "org.h2.tools.SimpleResultSet",
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
      "org.antlr.runtime.BitSet",
      "org.databene.jdbacl.model.DBTableComponent",
      "org.apache.derby.impl.sql.compile.StatementNode",
      "org.h2.tools.SimpleResultSet$Column",
      "org.h2.util.MathUtils",
      "org.apache.derby.impl.store.raw.xact.InternalXact",
      "org.antlr.runtime.tree.TreeNodeStream",
      "org.databene.commons.collection.ListBasedSet",
      "org.databene.jdbacl.model.DBTrigger",
      "org.databene.jdbacl.sql.parser.SQLParser$in_expression_return",
      "org.antlr.runtime.tree.BaseTreeAdaptor",
      "org.apache.derby.iapi.services.locks.LockOwner",
      "org.antlr.runtime.tree.RewriteRuleTokenStream",
      "org.apache.derby.impl.sql.execute.TriggerInfo",
      "org.antlr.runtime.CommonToken",
      "org.postgresql.Driver",
      "org.databene.jdbacl.model.DBRowIterator",
      "org.h2.constant.SysProperties",
      "org.databene.jdbacl.sql.parser.SQLParser$between_expression_return",
      "org.databene.commons.version.NumberVersionNumberComponent",
      "org.databene.commons.Capitalization",
      "org.databene.commons.Assert",
      "org.databene.commons.version.VersionNumberParser",
      "org.antlr.runtime.RecognitionException",
      "org.apache.derby.iapi.sql.depend.Dependent",
      "org.apache.derby.iapi.sql.dictionary.SchemaDescriptor",
      "org.apache.derby.impl.sql.execute.FKInfo",
      "org.databene.commons.Patterns",
      "org.apache.derby.impl.sql.compile.TableName",
      "org.databene.commons.NullSafeComparator",
      "org.databene.jdbacl.model.DefaultDatabase",
      "org.databene.commons.ParseException",
      "org.antlr.runtime.TokenSource",
      "org.databene.commons.HeavyweightIterator",
      "org.h2.Driver",
      "org.databene.jdbacl.sql.parser.SQLParser$and_expression_return",
      "org.databene.jdbacl.model.AbstractDBTableComponent",
      "org.apache.derby.impl.sql.compile.ResultColumnList",
      "org.apache.derby.iapi.types.DataValueDescriptor",
      "org.databene.jdbacl.sql.parser.SQLParser$multiplicative_expression_return",
      "org.apache.derby.iapi.services.context.ContextManager",
      "org.databene.jdbacl.sql.parser.SQLParser$additive_expression_return",
      "org.databene.jdbacl.sql.parser.TextHolder",
      "org.apache.derby.iapi.services.io.TypedFormat",
      "org.databene.commons.version.VersionNumberComponent",
      "org.databene.commons.collection.OrderedNameMap",
      "org.databene.jdbacl.sql.parser.SQLLexer$DFA9",
      "org.antlr.runtime.TokenStream",
      "org.antlr.runtime.MismatchedTreeNodeException",
      "org.antlr.runtime.ParserRuleReturnScope",
      "org.databene.commons.ArrayFormat",
      "org.antlr.runtime.ANTLRStringStream",
      "org.databene.commons.SyntaxError",
      "org.antlr.runtime.IntStream",
      "org.apache.derby.iapi.sql.dictionary.ConstraintDescriptorList",
      "org.databene.commons.OrderedMap",
      "org.antlr.runtime.tree.RewriteCardinalityException",
      "org.apache.derby.iapi.sql.execute.ExecutionFactory",
      "org.databene.jdbacl.model.Database",
      "org.databene.jdbacl.model.AbstractCompositeDBObject",
      "org.databene.jdbacl.model.DBCatalog",
      "org.apache.derby.impl.sql.compile.ResultSetNode",
      "org.h2.message.TraceSystem",
      "org.antlr.runtime.MismatchedSetException",
      "org.databene.jdbacl.model.DBPrimaryKeyConstraint",
      "org.antlr.runtime.MismatchedTokenException",
      "org.databene.jdbacl.model.SequenceHolder",
      "org.databene.jdbacl.sql.parser.SQLParser$DFA2",
      "org.databene.jdbacl.model.DBUniqueIndex",
      "org.apache.derby.iapi.sql.ResultDescription",
      "org.apache.derby.impl.sql.compile.DeleteNode",
      "org.databene.jdbacl.model.DefaultDBTable",
      "org.databene.commons.iterator.TableRowIterator",
      "org.antlr.runtime.tree.Tree",
      "org.databene.commons.ObjectNotFoundException",
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
      "org.databene.commons.collection.ListBasedSet",
      "org.databene.jdbacl.model.AbstractDBTableComponent",
      "org.databene.jdbacl.model.DBConstraint",
      "org.databene.jdbacl.model.DBUniqueConstraint",
      "org.databene.jdbacl.model.DBPrimaryKeyConstraint",
      "org.databene.commons.version.VersionNumberComponent",
      "org.databene.commons.version.NumberVersionNumberComponent",
      "org.databene.commons.Parser",
      "org.databene.commons.version.VersionNumberParser",
      "org.databene.commons.version.VersionNumber",
      "org.databene.jdbacl.model.DefaultDatabase",
      "org.databene.commons.ObjectNotFoundException",
      "org.databene.jdbacl.model.DBIndex",
      "org.databene.jdbacl.model.DBUniqueIndex",
      "org.h2.util.Tool",
      "org.h2.tools.Recover",
      "org.h2.util.IOUtils",
      "org.h2.util.New",
      "org.h2.store.fs.FileSystem",
      "org.h2.store.fs.FileSystemDisk",
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
      "org.databene.jdbacl.model.TableContainer",
      "org.databene.jdbacl.model.TableContainerSupport",
      "org.apache.derby.iapi.sql.dictionary.GenericDescriptorList",
      "org.databene.jdbacl.model.DBCatalog",
      "org.databene.jdbacl.model.DBForeignKeyConstraint",
      "org.databene.commons.Assert",
      "org.databene.jdbacl.model.FKChangeRule",
      "org.databene.commons.bean.HashCodeBuilder",
      "org.databene.jdbacl.model.DBDataType",
      "org.databene.jdbacl.model.DBNotNullConstraint",
      "org.databene.commons.AssertionError",
      "org.antlr.runtime.RecognitionException",
      "org.antlr.runtime.NoViableAltException",
      "org.databene.commons.ParseException",
      "org.apache.derby.impl.sql.catalog.DataDictionaryImpl",
      "org.apache.derby.iapi.services.context.ContextService",
      "org.apache.derby.iapi.services.monitor.Monitor",
      "org.databene.jdbacl.model.DBSchema",
      "org.firebirdsql.jdbc.FBClob",
      "org.firebirdsql.jdbc.FBSQLException",
      "org.firebirdsql.jdbc.FBDriverNotCapableException",
      "org.apache.derby.iapi.store.raw.xact.RawTransaction",
      "org.databene.jdbacl.model.DefaultDBColumn",
      "org.apache.derby.impl.sql.compile.QueryTreeNode",
      "org.apache.derby.impl.sql.compile.ResultSetNode",
      "org.apache.derby.impl.sql.compile.FromTable",
      "org.apache.derby.impl.sql.compile.FromBaseTable",
      "org.databene.commons.version.StringVersionNumberComponent",
      "org.databene.jdbacl.model.DBDataType$TypeDescriptor",
      "org.apache.derby.impl.sql.compile.Predicate",
      "org.apache.derby.impl.services.uuid.BasicUUID",
      "org.databene.commons.comparator.IntComparator",
      "org.databene.jdbacl.model.DBPackage",
      "org.databene.jdbacl.model.DBProcedure",
      "org.postgresql.core.Logger",
      "org.postgresql.Driver",
      "org.postgresql.ds.common.BaseDataSource",
      "org.postgresql.ds.PGConnectionPoolDataSource",
      "org.h2.value.Value",
      "org.h2.value.ValueArray",
      "org.h2.util.StatementBuilder",
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
      "org.h2.command.dml.SetTypes",
      "org.h2.engine.ConnectionInfo",
      "org.h2.util.StringUtils",
      "org.h2.util.Utils",
      "org.h2.message.DbException",
      "org.h2.constant.ErrorCode",
      "org.h2.jdbc.JdbcSQLException",
      "org.apache.derby.impl.store.access.conglomerate.GenericController",
      "org.apache.derby.impl.store.access.conglomerate.GenericCostController",
      "org.apache.derby.impl.store.access.heap.HeapCostController",
      "org.hsqldb.lib.FileUtil",
      "org.databene.jdbacl.sql.parser.SQLParser$keyword_return",
      "org.databene.commons.SyntaxError",
      "org.apache.derby.iapi.sql.dictionary.ConstraintDescriptorList",
      "org.apache.derby.iapi.sql.dictionary.ColumnDescriptorList",
      "org.databene.jdbacl.sql.parser.SQLParser$arguments_return",
      "org.h2.value.ValueLob",
      "org.apache.derby.iapi.sql.dictionary.TupleDescriptor",
      "org.apache.derby.iapi.sql.dictionary.SchemaDescriptor",
      "org.apache.derby.iapi.sql.dictionary.TableDescriptor",
      "org.apache.derby.iapi.sql.dictionary.ConglomerateDescriptorList",
      "org.firebirdsql.logging.LoggerFactory",
      "org.firebirdsql.jca.FBManagedConnectionFactory",
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
      "org.apache.derby.impl.sql.execute.BaseActivation",
      "org.apache.derby.impl.sql.execute.ConstantActionActivation",
      "org.firebirdsql.gds.impl.AbstractGDS",
      "org.firebirdsql.gds.impl.wire.AbstractJavaGDSImpl",
      "org.firebirdsql.gds.impl.wire.JavaGDSImpl",
      "org.firebirdsql.gds.impl.GDSFactory$ReversedStringComparator",
      "org.firebirdsql.gds.impl.wire.WireGDSFactoryPlugin",
      "org.firebirdsql.gds.impl.jni.NativeGDSFactoryPlugin",
      "org.firebirdsql.gds.impl.jni.LocalGDSFactoryPlugin",
      "org.firebirdsql.gds.impl.jni.EmbeddedGDSFactoryPlugin",
      "org.firebirdsql.gds.impl.GDSFactory",
      "org.firebirdsql.gds.impl.GDSType",
      "org.firebirdsql.gds.impl.jni.ParameterBufferBase",
      "org.firebirdsql.gds.impl.jni.DatabaseParameterBufferImp",
      "org.firebirdsql.gds.impl.AbstractIscDbHandle",
      "org.firebirdsql.gds.impl.wire.isc_db_handle_impl",
      "org.firebirdsql.gds.impl.GDSHelper",
      "org.firebirdsql.jdbc.InternalTransactionCoordinator",
      "org.firebirdsql.jdbc.AbstractStatement",
      "org.firebirdsql.jdbc.AbstractPreparedStatement",
      "org.firebirdsql.jdbc.AbstractCallableStatement",
      "org.firebirdsql.jdbc.FBCallableStatement",
      "org.firebirdsql.jdbc.AbstractStatement$RSListener",
      "org.hsqldb.jdbc.jdbcClob",
      "org.databene.jdbacl.sql.parser.SQLParser$literal_return",
      "org.apache.derby.impl.sql.compile.FromVTI",
      "org.apache.derby.impl.sql.compile.StatementNode",
      "org.apache.derby.impl.sql.compile.DMLStatementNode",
      "org.apache.derby.impl.sql.compile.DMLModStatementNode",
      "org.apache.derby.impl.sql.compile.DeleteNode",
      "org.apache.derby.impl.sql.GenericPreparedStatement",
      "org.apache.derby.impl.sql.GenericStorablePreparedStatement",
      "org.databene.commons.OrderedMap$ProxyEntry",
      "org.apache.derby.iapi.services.io.FormatableProperties",
      "org.apache.derby.impl.sql.catalog.DD_Version",
      "org.firebirdsql.jdbc.FBStatement",
      "org.antlr.runtime.MismatchedTokenException",
      "org.apache.derby.iapi.sql.dictionary.DataDescriptorGenerator",
      "org.firebirdsql.gds.impl.wire.ParameterBufferBase",
      "org.firebirdsql.gds.impl.wire.DatabaseParameterBufferImp",
      "org.firebirdsql.jca.FBConnectionRequestInfo",
      "org.hsqldb.jdbc.Util",
      "org.hsqldb.store.BaseHashMap",
      "org.hsqldb.lib.HashMap",
      "org.hsqldb.store.HashIndex",
      "org.hsqldb.lib.BaseList",
      "org.hsqldb.lib.HsqlArrayList",
      "org.hsqldb.resources.BundleHandler",
      "org.hsqldb.Trace",
      "org.hsqldb.HsqlException",
      "org.hsqldb.persist.HsqlProperties",
      "org.hsqldb.jdbc.jdbcConnection",
      "org.hsqldb.DatabaseURL",
      "org.h2.tools.Csv",
      "org.h2.tools.SimpleResultSet",
      "org.apache.derby.impl.store.access.btree.OpenBTree",
      "org.apache.derby.impl.store.access.btree.BTreeController",
      "org.apache.derby.impl.sql.GenericLanguageFactory",
      "org.apache.derby.impl.sql.conn.GenericLanguageConnectionFactory",
      "org.apache.derby.impl.db.BasicDatabase",
      "org.apache.derby.impl.db.SlaveDatabase",
      "org.apache.derby.iapi.services.context.ContextImpl",
      "org.apache.derby.impl.sql.conn.GenericLanguageConnectionContext",
      "org.firebirdsql.jca.FBManagedConnection$1",
      "org.firebirdsql.jca.FBManagedConnection$2",
      "org.firebirdsql.jca.FBManagedConnection$3",
      "org.firebirdsql.jca.FBManagedConnection$4",
      "org.firebirdsql.jca.FBManagedConnection$5",
      "org.firebirdsql.jca.FBManagedConnection",
      "org.firebirdsql.jdbc.AbstractConnection",
      "org.firebirdsql.jdbc.FBConnection",
      "org.apache.derby.iapi.error.ShutdownException",
      "org.apache.derby.impl.sql.compile.CurrentOfNode",
      "org.firebirdsql.jdbc.FBConnectionProperties",
      "org.databene.jdbacl.model.DBSequence",
      "org.databene.jdbacl.DBUtil",
      "org.databene.jdbacl.model.DBTrigger",
      "org.firebirdsql.gds.impl.jni.BaseGDSImpl",
      "org.firebirdsql.gds.impl.jni.JniGDSImpl",
      "org.firebirdsql.gds.impl.jni.isc_db_handle_impl",
      "org.firebirdsql.jdbc.InternalTransactionCoordinator$AbstractTransactionCoordinator",
      "org.firebirdsql.jdbc.InternalTransactionCoordinator$MetaDataTransactionCoordinator",
      "org.firebirdsql.jdbc.InternalTransactionCoordinator$LocalTransactionCoordinator",
      "org.hsqldb.Result",
      "org.hsqldb.Session",
      "org.hsqldb.jdbc.jdbcStatement",
      "org.databene.script.expression.CompositeExpression",
      "org.databene.script.expression.SumExpression",
      "org.databene.commons.ArrayUtil",
      "org.h2.command.Prepared",
      "org.h2.command.dml.ScriptBase",
      "org.h2.command.dml.ScriptCommand",
      "org.hsqldb.jdbc.jdbcPreparedStatement",
      "org.h2.store.fs.FileSystemMemory",
      "org.h2.store.fs.FileSystemZip",
      "org.h2.store.fs.FileSystemSplit",
      "org.h2.store.fs.FileSystemDiskNio",
      "org.h2.store.fs.FileSystemDiskNioMapped",
      "org.h2.jdbc.JdbcConnection",
      "org.h2.value.CompareMode",
      "org.h2.engine.SessionWithState",
      "org.h2.engine.SessionRemote",
      "org.databene.commons.NameUtil",
      "org.postgresql.jdbc2.AbstractJdbc2Connection",
      "org.postgresql.jdbc3.AbstractJdbc3Connection",
      "org.postgresql.jdbc3g.AbstractJdbc3gConnection",
      "org.postgresql.jdbc4.AbstractJdbc4Connection",
      "org.postgresql.jdbc4.Jdbc4Connection",
      "org.apache.derby.iapi.services.io.DynamicByteArrayOutputStream",
      "org.postgresql.core.v3.ConnectionFactoryImpl",
      "org.postgresql.core.v2.ConnectionFactoryImpl",
      "org.postgresql.core.ConnectionFactory",
      "org.postgresql.core.PGStream",
      "org.postgresql.util.PSQLException",
      "org.postgresql.util.GT",
      "org.postgresql.util.PSQLState",
      "org.apache.derby.impl.sql.execute.rts.RealBasicNoPutResultSetStatistics",
      "org.apache.derby.impl.sql.execute.rts.RealNoPutResultSetStatistics",
      "org.apache.derby.impl.sql.execute.rts.RealHashScanStatistics",
      "org.apache.derby.impl.sql.execute.rts.RealDistinctScanStatistics",
      "org.apache.derby.impl.sql.execute.WriteCursorConstantAction",
      "org.apache.derby.impl.sql.execute.DeleteConstantAction",
      "org.hsqldb.lib.HsqlByteArrayOutputStream",
      "org.hsqldb.rowio.RowOutputBase",
      "org.hsqldb.rowio.RowOutputText",
      "org.hsqldb.rowio.RowOutputTextQuoted",
      "org.h2.value.ValueNull",
      "org.h2.engine.Session",
      "org.h2.value.ValueLong",
      "org.h2.engine.Engine",
      "org.h2.store.FileLock",
      "org.h2.engine.Database",
      "org.h2.engine.Mode",
      "org.h2.util.TempFileDeleter",
      "org.h2.util.SortedProperties",
      "org.h2.util.MathUtils$1",
      "org.apache.derby.impl.sql.compile.DDLStatementNode",
      "org.apache.derby.impl.sql.compile.CreateIndexNode",
      "org.firebirdsql.jdbc.FBEscapedCallParser",
      "org.firebirdsql.jdbc.FBEscapedParser",
      "org.firebirdsql.jdbc.FBProcedureCall",
      "org.firebirdsql.gds.XSQLVAR",
      "org.databene.commons.NullSafeComparator"
    );
  }
}
