/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Aug 24 14:06:25 GMT 2018
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
      "org.apache.derby.iapi.sql.compile.OptimizableList",
      "org.databene.commons.version.StringVersionNumberComponent",
      "org.databene.jdbacl.model.AbstractDBObject",
      "org.apache.derby.iapi.services.io.ErrorObjectInput",
      "org.apache.derby.iapi.store.access.TransactionController",
      "org.apache.derby.iapi.services.locks.Limit",
      "org.apache.derby.impl.store.access.btree.BTreeRowPosition",
      "org.databene.commons.CollectionUtil",
      "org.databene.script.Expression",
      "org.apache.derby.iapi.services.compiler.MethodBuilder",
      "org.apache.derby.impl.store.access.btree.index.B2ITableLocking3",
      "org.databene.commons.version.DateVersionNumberComponent",
      "org.databene.jdbacl.model.DBRow",
      "org.apache.derby.iapi.sql.LanguageFactory",
      "org.apache.derby.impl.sql.compile.UnaryComparisonOperatorNode",
      "org.databene.jdbacl.sql.parser.SQLParser$equality_expression_return",
      "org.apache.derby.impl.sql.execute.GenericConstantActionFactory",
      "org.apache.derby.impl.sql.compile.BinaryOperatorNode",
      "org.apache.derby.iapi.store.access.ScanController",
      "org.apache.derby.iapi.sql.dictionary.TableDescriptor",
      "org.apache.derby.iapi.services.property.PersistentSet",
      "org.apache.derby.iapi.sql.dictionary.PrivilegedSQLObject",
      "org.apache.derby.iapi.types.TypeId",
      "org.databene.jdbacl.model.DBCheckConstraint",
      "org.apache.derby.impl.sql.compile.FromList",
      "org.databene.jdbacl.sql.parser.SQLParser$exclusive_or_expression_return",
      "org.apache.derby.iapi.sql.compile.Visitor",
      "org.apache.derby.impl.store.access.btree.BTreeLockingPolicy",
      "org.apache.derby.impl.sql.compile.GroupByList",
      "org.apache.derby.iapi.services.i18n.LocaleFinder",
      "org.apache.derby.iapi.sql.conn.Authorizer",
      "org.apache.derby.impl.sql.compile.CompilerContextImpl",
      "org.hsqldb.lib.StringInputStream",
      "org.databene.jdbacl.model.MultiColumnObject",
      "org.apache.derby.iapi.sql.dictionary.DataDictionary",
      "org.databene.jdbacl.sql.parser.SQLParser$commands_return",
      "org.antlr.runtime.tree.CommonTree",
      "org.databene.jdbacl.sql.parser.SQLParser$primary_return",
      "org.apache.derby.iapi.sql.compile.TypeCompilerFactory",
      "org.apache.derby.iapi.store.access.RowLocationRetRowSource",
      "org.antlr.runtime.MismatchedNotSetException",
      "org.apache.derby.impl.sql.compile.ResultColumn",
      "org.apache.derby.iapi.sql.compile.OptimizablePredicateList",
      "org.apache.derby.iapi.services.context.Context",
      "org.apache.derby.iapi.sql.compile.Optimizable",
      "org.apache.derby.iapi.types.Orderable",
      "org.apache.derby.impl.db.BasicDatabase",
      "org.databene.commons.NameUtil",
      "org.h2.util.SmallLRUCache",
      "org.apache.derby.impl.sql.compile.LikeEscapeOperatorNode",
      "org.apache.derby.impl.sql.compile.ExpressionClassBuilder",
      "org.apache.derby.iapi.services.cache.ClassSize",
      "org.databene.jdbacl.model.DBUniqueConstraint",
      "org.apache.derby.iapi.store.access.conglomerate.TransactionManager",
      "org.apache.derby.impl.sql.compile.QueryTreeNodeVector",
      "org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream",
      "org.databene.jdbacl.model.TableHolder",
      "org.apache.derby.iapi.services.cache.ClassSize$1",
      "org.apache.derby.iapi.sql.conn.SQLSessionContext",
      "org.antlr.runtime.CharStream",
      "org.apache.derby.impl.sql.compile.FromVTI",
      "org.databene.jdbacl.sql.parser.SQLLexer",
      "org.apache.derby.impl.store.access.btree.LeafControlRow",
      "org.databene.jdbacl.model.DBDataType$TypeDescriptor",
      "org.databene.jdbacl.model.TableContainer",
      "org.apache.derby.iapi.sql.dictionary.ColumnDescriptor",
      "org.apache.derby.impl.store.access.btree.index.B2IRowLocking3",
      "org.apache.derby.iapi.store.access.conglomerate.LogicalUndo",
      "org.databene.commons.Converter",
      "org.databene.jdbacl.model.DBForeignKeyConstraint",
      "org.databene.commons.converter.ToStringConverter",
      "org.apache.derby.impl.sql.compile.InsertNode",
      "org.apache.derby.iapi.sql.execute.ExecRow",
      "org.apache.derby.iapi.sql.compile.ExpressionClassBuilderInterface",
      "org.apache.derby.impl.store.access.btree.OpenBTree",
      "org.apache.derby.iapi.sql.dictionary.IndexLister",
      "org.apache.derby.iapi.services.cache.ClassSizeCatalog",
      "org.antlr.runtime.Lexer",
      "org.apache.derby.iapi.store.access.conglomerate.Conglomerate",
      "org.apache.derby.iapi.services.locks.Lockable",
      "org.apache.derby.impl.sql.compile.FromBaseTable",
      "org.apache.derby.impl.store.access.conglomerate.RowPosition",
      "org.antlr.runtime.MissingTokenException",
      "org.apache.derby.iapi.sql.compile.RowOrdering",
      "org.apache.derby.iapi.sql.compile.Visitable",
      "org.apache.derby.iapi.sql.ResultColumnDescriptor",
      "org.apache.derby.impl.sql.conn.GenericLanguageConnectionFactory",
      "org.antlr.runtime.EarlyExitException",
      "org.apache.derby.iapi.error.StandardException",
      "org.databene.jdbacl.model.FKChangeRule",
      "org.h2.jdbcx.JdbcDataSourceFactory",
      "org.apache.derby.iapi.services.io.Storable",
      "org.apache.derby.iapi.store.raw.xact.RawTransaction",
      "org.apache.derby.catalog.Dependable",
      "org.apache.derby.iapi.sql.compile.NodeFactory",
      "org.apache.derby.iapi.services.property.PropertySetCallback",
      "org.antlr.runtime.Token",
      "org.apache.derby.impl.sql.compile.PredicateList",
      "org.apache.derby.iapi.sql.compile.JoinStrategy",
      "org.apache.derby.impl.sql.compile.IsNullNode",
      "org.antlr.runtime.Parser",
      "org.h2.message.Trace",
      "org.databene.jdbacl.model.DBObject",
      "org.apache.derby.impl.store.access.btree.ControlRow",
      "org.databene.commons.AssertionError",
      "org.apache.derby.vti.Restriction$OR",
      "org.antlr.runtime.tree.RewriteRuleElementStream",
      "org.apache.derby.impl.store.access.btree.index.B2I_v10_2",
      "org.databene.jdbacl.sql.ColumnExpression",
      "org.apache.derby.impl.sql.compile.FromTable",
      "org.apache.derby.impl.sql.compile.DMLStatementNode",
      "org.apache.derby.iapi.store.access.RowSource",
      "org.apache.derby.impl.sql.compile.DMLModStatementNode",
      "org.apache.derby.impl.sql.compile.UnaryOperatorNode",
      "org.apache.derby.iapi.sql.compile.Optimizer",
      "org.apache.derby.impl.sql.compile.QueryTreeNode",
      "org.apache.derby.vti.Restriction$AND",
      "org.apache.derby.impl.sql.compile.OrderByList",
      "org.apache.derby.iapi.sql.conn.LanguageConnectionContext",
      "org.antlr.runtime.NoViableAltException",
      "org.antlr.runtime.RecognizerSharedState",
      "org.antlr.runtime.CommonTokenStream",
      "org.databene.commons.OrderedSet",
      "org.antlr.runtime.RuleReturnScope",
      "org.apache.derby.impl.sql.compile.BaseTypeCompiler",
      "org.h2.util.MathUtils$1",
      "org.databene.commons.depend.Dependent",
      "org.apache.derby.iapi.types.DataTypeDescriptor",
      "org.databene.jdbacl.model.DBColumn",
      "org.databene.jdbacl.sql.parser.SQLParser$unary_expression_return",
      "org.apache.derby.iapi.store.access.StoreCostController",
      "org.apache.derby.iapi.services.io.ArrayInputStream",
      "org.apache.derby.iapi.store.raw.LockingPolicy",
      "org.antlr.runtime.tree.RewriteRuleSubtreeStream",
      "org.databene.jdbacl.model.ContainerComponent",
      "org.apache.derby.vti.VTIEnvironment",
      "org.apache.derby.iapi.store.raw.ContainerHandle",
      "org.apache.derby.impl.sql.GenericLanguageFactory",
      "org.databene.jdbacl.model.DBPackage",
      "org.apache.derby.impl.sql.compile.BinaryComparisonOperatorNode",
      "org.databene.jdbacl.sql.SQLParserUtil",
      "org.apache.derby.impl.sql.conn.GenericLanguageConnectionContext",
      "org.apache.derby.iapi.store.access.StoreCostResult",
      "org.apache.derby.iapi.sql.dictionary.UniqueSQLObjectDescriptor",
      "org.databene.jdbacl.SQLUtil",
      "org.apache.derby.iapi.sql.depend.Provider",
      "org.apache.derby.impl.sql.compile.BinaryLogicalOperatorNode",
      "org.apache.derby.iapi.services.monitor.ModuleControl",
      "org.databene.jdbacl.model.CompositeDBObject",
      "org.apache.derby.iapi.services.io.FormatableBitSet",
      "org.apache.derby.iapi.store.raw.AuxObject",
      "org.h2.message.TraceObject",
      "org.apache.derby.iapi.sql.dictionary.ConglomerateDescriptor",
      "org.apache.derby.iapi.sql.dictionary.GenericDescriptorList",
      "org.databene.jdbacl.sql.parser.SQLParser$value_return",
      "org.apache.derby.iapi.store.access.ConglomPropertyQueryable",
      "org.apache.derby.iapi.util.DoubleProperties",
      "org.hsqldb.jdbc.jdbcClob",
      "org.antlr.runtime.DFA",
      "org.apache.derby.iapi.sql.ParameterValueSet",
      "org.databene.commons.converter.FormatHolder",
      "org.antlr.runtime.tree.RewriteEmptyStreamException",
      "org.apache.derby.iapi.store.raw.Transaction",
      "org.apache.derby.catalog.IndexDescriptor",
      "org.apache.derby.catalog.DependableFinder",
      "org.apache.derby.iapi.sql.Statement",
      "org.antlr.runtime.MismatchedRangeException",
      "org.apache.derby.iapi.sql.dictionary.UniqueTupleDescriptor",
      "org.apache.derby.iapi.sql.conn.StatementContext",
      "org.apache.derby.impl.sql.compile.ActivationClassBuilder",
      "org.apache.derby.iapi.store.access.DynamicCompiledOpenConglomInfo",
      "org.h2.message.DbException",
      "org.databene.jdbacl.sql.parser.SQLParser",
      "org.databene.jdbacl.model.DBNotNullConstraint",
      "org.databene.jdbacl.model.DBDataType",
      "org.apache.derby.iapi.sql.execute.ConstantAction",
      "org.apache.derby.impl.sql.compile.ConstantNode",
      "org.apache.derby.impl.store.access.btree.WaitError",
      "org.apache.derby.impl.sql.conn.GenericStatementContext",
      "org.databene.jdbacl.model.TableContainerSupport",
      "org.antlr.runtime.tree.CommonTreeAdaptor",
      "org.h2.jdbcx.JdbcDataSource",
      "org.apache.derby.iapi.types.BooleanDataValue",
      "org.antlr.runtime.UnwantedTokenException",
      "org.databene.jdbacl.model.DBTable",
      "org.databene.commons.bean.HashCodeBuilder",
      "org.apache.derby.iapi.sql.compile.CompilerContext",
      "org.apache.derby.impl.store.access.btree.index.B2INoLocking",
      "org.databene.commons.StringUtil",
      "org.apache.derby.impl.sql.compile.AndNode",
      "org.antlr.runtime.tree.TreeAdaptor",
      "org.apache.derby.iapi.store.access.ConglomerateController",
      "org.databene.jdbacl.sql.parser.SQLParser$expression_return",
      "org.apache.derby.catalog.UUID",
      "org.apache.derby.impl.sql.compile.UserDefinedTypeCompiler",
      "org.apache.derby.iapi.sql.dictionary.TupleDescriptor",
      "org.databene.jdbacl.sql.parser.SQLParser$relational_expression_return",
      "org.databene.commons.Named",
      "org.apache.derby.impl.db.SlaveDatabase",
      "org.antlr.runtime.CharStreamState",
      "org.databene.jdbacl.NameSpec",
      "org.apache.derby.iapi.sql.compile.OptimizablePredicate",
      "org.apache.derby.iapi.sql.dictionary.ConstraintDescriptor",
      "org.apache.derby.vti.Restriction$ColumnQualifier",
      "org.apache.derby.iapi.sql.dictionary.ColumnDescriptorList",
      "org.databene.jdbacl.sql.parser.SQLParser$null_comparison_return",
      "org.apache.derby.impl.sql.compile.ValueNode",
      "org.databene.commons.Parser",
      "org.apache.derby.impl.store.raw.xact.Xact",
      "org.databene.jdbacl.model.DBSequence",
      "org.apache.derby.iapi.types.DataType",
      "org.apache.derby.iapi.services.io.Formatable",
      "org.apache.derby.iapi.store.access.ColumnOrdering",
      "org.apache.derby.iapi.services.io.Limit",
      "org.apache.derby.impl.store.access.btree.index.B2I",
      "org.antlr.runtime.tree.BaseTree",
      "org.apache.derby.impl.store.access.btree.BTreeController",
      "org.apache.derby.iapi.sql.dictionary.ConglomerateDescriptorList",
      "org.h2.message.TraceWriter",
      "org.databene.commons.ThreadAware",
      "org.databene.commons.version.VersionNumber",
      "org.apache.derby.iapi.sql.depend.DependencyManager",
      "org.apache.derby.iapi.sql.dictionary.ReferencedKeyConstraintDescriptor",
      "org.apache.derby.iapi.util.JBitSet",
      "org.databene.jdbacl.model.DBIndex",
      "org.databene.script.expression.ConstantExpression",
      "org.apache.derby.impl.store.access.conglomerate.OpenConglomerateScratchSpace",
      "org.databene.jdbacl.sql.parser.SQLParser$name_return",
      "org.antlr.runtime.BufferedTokenStream",
      "org.apache.derby.iapi.sql.dictionary.KeyConstraintDescriptor",
      "org.databene.jdbacl.model.DBConstraint",
      "org.databene.jdbacl.model.DefaultDBColumn",
      "org.apache.derby.iapi.sql.compile.Parser",
      "org.apache.derby.iapi.db.Database",
      "org.apache.derby.iapi.store.access.GroupFetchScanController",
      "org.antlr.runtime.BitSet",
      "org.apache.derby.impl.sql.compile.TypeCompilerFactoryImpl",
      "org.databene.jdbacl.model.DBTableComponent",
      "org.apache.derby.impl.sql.compile.StatementNode",
      "org.apache.derby.iapi.store.access.Qualifier",
      "org.apache.derby.iapi.util.Matchable",
      "org.apache.derby.impl.sql.conn.TempTableInfo",
      "org.h2.util.MathUtils",
      "org.apache.derby.impl.store.raw.xact.InternalXact",
      "org.apache.derby.iapi.sql.dictionary.ViewDescriptor",
      "org.databene.commons.collection.ListBasedSet",
      "org.apache.derby.iapi.sql.dictionary.AliasDescriptor",
      "org.databene.jdbacl.model.DBTrigger",
      "org.databene.jdbacl.sql.parser.SQLParser$in_expression_return",
      "org.antlr.runtime.tree.BaseTreeAdaptor",
      "org.apache.derby.iapi.services.monitor.ModuleSupportable",
      "org.apache.derby.iapi.services.locks.LockOwner",
      "org.apache.derby.impl.sql.compile.OrderedColumnList",
      "org.antlr.runtime.tree.RewriteRuleTokenStream",
      "org.apache.derby.impl.sql.compile.OptimizerImpl",
      "org.antlr.runtime.CommonToken",
      "org.databene.jdbacl.model.DBRowIterator",
      "org.h2.constant.SysProperties",
      "org.apache.derby.impl.sql.compile.SubqueryList",
      "org.apache.derby.iapi.services.io.ErrorInfo",
      "org.apache.derby.iapi.services.cache.Cacheable",
      "org.databene.jdbacl.sql.parser.SQLParser$between_expression_return",
      "org.databene.commons.version.NumberVersionNumberComponent",
      "org.databene.commons.Capitalization",
      "org.databene.commons.Assert",
      "org.apache.derby.iapi.services.cache.CacheableFactory",
      "org.databene.commons.version.VersionNumberParser",
      "org.antlr.runtime.RecognitionException",
      "org.apache.derby.iapi.sql.PreparedStatement",
      "org.apache.derby.impl.sql.compile.Predicate",
      "org.apache.derby.iapi.store.access.GenericScanController",
      "org.apache.derby.iapi.store.access.conglomerate.ScanManager",
      "org.h2.jdbc.JdbcConnection",
      "org.apache.derby.impl.sql.compile.RelationalOperator",
      "org.apache.derby.iapi.sql.depend.Dependent",
      "org.apache.derby.iapi.sql.Row",
      "org.apache.derby.iapi.sql.dictionary.SchemaDescriptor",
      "org.apache.derby.iapi.sql.compile.TypeCompiler",
      "org.databene.commons.Patterns",
      "org.apache.derby.impl.sql.compile.TableName",
      "org.databene.commons.NullSafeComparator",
      "org.databene.jdbacl.model.DefaultDatabase",
      "org.databene.commons.ParseException",
      "org.apache.derby.iapi.services.loader.JarReader",
      "org.antlr.runtime.TokenSource",
      "org.databene.commons.HeavyweightIterator",
      "org.apache.derby.impl.sql.compile.BinaryRelationalOperatorNode",
      "org.apache.derby.iapi.sql.conn.LanguageConnectionFactory",
      "org.h2.Driver",
      "org.databene.jdbacl.sql.parser.SQLParser$and_expression_return",
      "org.databene.jdbacl.model.AbstractDBTableComponent",
      "org.apache.derby.iapi.types.DataValueDescriptor",
      "org.apache.derby.impl.sql.compile.ResultColumnList",
      "org.databene.jdbacl.sql.parser.SQLParser$multiplicative_expression_return",
      "org.apache.derby.iapi.services.context.ContextManager",
      "org.apache.derby.iapi.sql.compile.RequiredRowOrdering",
      "org.databene.jdbacl.sql.parser.SQLParser$additive_expression_return",
      "org.apache.derby.iapi.store.access.StaticCompiledOpenConglomInfo",
      "org.apache.derby.database.Database",
      "org.databene.jdbacl.sql.parser.TextHolder",
      "org.apache.derby.iapi.services.io.TypedFormat",
      "org.databene.commons.version.VersionNumberComponent",
      "org.databene.commons.collection.OrderedNameMap",
      "org.databene.jdbacl.sql.parser.SQLLexer$DFA9",
      "org.antlr.runtime.TokenStream",
      "org.antlr.runtime.MismatchedTreeNodeException",
      "org.antlr.runtime.ParserRuleReturnScope",
      "org.databene.commons.ArrayFormat",
      "org.apache.derby.iapi.services.loader.ClassFactory",
      "org.antlr.runtime.ANTLRStringStream",
      "org.databene.commons.SyntaxError",
      "org.antlr.runtime.IntStream",
      "org.apache.derby.iapi.sql.execute.ExecutionFactory",
      "org.apache.derby.iapi.sql.dictionary.ConstraintDescriptorList",
      "org.databene.commons.OrderedMap",
      "org.antlr.runtime.tree.RewriteCardinalityException",
      "org.apache.derby.impl.store.access.conglomerate.GenericConglomerate",
      "org.apache.derby.iapi.services.io.LimitObjectInput",
      "org.databene.jdbacl.model.Database",
      "org.apache.derby.iapi.store.access.RowCountable",
      "org.apache.derby.iapi.services.context.ContextImpl",
      "org.databene.jdbacl.model.AbstractCompositeDBObject",
      "org.databene.jdbacl.model.DBCatalog",
      "org.apache.derby.impl.sql.compile.ResultSetNode",
      "org.apache.derby.impl.sql.compile.BooleanConstantNode",
      "org.apache.derby.vti.Restriction",
      "org.h2.message.TraceSystem",
      "org.hsqldb.lib.AsciiStringInputStream",
      "org.antlr.runtime.MismatchedSetException",
      "org.databene.jdbacl.model.DBPrimaryKeyConstraint",
      "org.antlr.runtime.MismatchedTokenException",
      "org.databene.jdbacl.model.SequenceHolder",
      "org.apache.derby.iapi.sql.compile.AccessPath",
      "org.apache.derby.impl.sql.compile.ColumnReference",
      "org.databene.jdbacl.sql.parser.SQLParser$DFA2",
      "org.databene.jdbacl.model.DBUniqueIndex",
      "org.apache.derby.iapi.sql.ResultDescription",
      "org.apache.derby.iapi.store.access.SpaceInfo",
      "org.databene.jdbacl.model.DefaultDBTable",
      "org.databene.commons.iterator.TableRowIterator",
      "org.antlr.runtime.tree.Tree",
      "org.apache.derby.iapi.store.raw.ContainerKey",
      "org.apache.derby.iapi.sql.compile.CostEstimate",
      "org.apache.derby.impl.store.access.btree.BTree",
      "org.databene.commons.ObjectNotFoundException",
      "org.antlr.runtime.BaseRecognizer",
      "org.databene.jdbacl.model.DBSchema",
      "org.apache.derby.impl.sql.compile.TernaryOperatorNode"
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
      "org.databene.jdbacl.model.DBNotNullConstraint",
      "org.databene.commons.Assert",
      "org.databene.commons.collection.ListBasedSet",
      "org.databene.commons.ObjectNotFoundException",
      "org.databene.jdbacl.model.TableContainer",
      "org.databene.jdbacl.model.TableContainerSupport",
      "org.databene.jdbacl.model.DefaultDBColumn",
      "org.databene.jdbacl.model.DBDataType",
      "org.databene.jdbacl.model.DBDataType$TypeDescriptor",
      "org.databene.jdbacl.model.DBForeignKeyConstraint",
      "org.databene.commons.AssertionError",
      "org.databene.commons.version.VersionNumberComponent",
      "org.databene.commons.version.NumberVersionNumberComponent",
      "org.databene.commons.Parser",
      "org.databene.commons.version.VersionNumberParser",
      "org.databene.commons.version.VersionNumber",
      "org.databene.jdbacl.model.DefaultDatabase",
      "org.hsqldb.lib.FileUtil",
      "org.apache.derby.iapi.sql.dictionary.ConstraintDescriptorList",
      "org.apache.derby.vti.VTITemplate",
      "org.apache.derby.impl.jdbc.EmbedResultSetMetaData",
      "org.apache.derby.impl.sql.GenericColumnDescriptor",
      "org.apache.derby.catalog.types.BaseTypeIdImpl",
      "org.apache.derby.catalog.types.DecimalTypeIdImpl",
      "org.apache.derby.iapi.types.TypeId",
      "org.apache.derby.catalog.types.TypeDescriptorImpl",
      "org.apache.derby.iapi.types.DataTypeDescriptor",
      "org.apache.derby.diag.ErrorMessages",
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
      "org.databene.jdbacl.model.DBUniqueConstraint",
      "org.databene.commons.bean.HashCodeBuilder",
      "org.databene.jdbacl.model.DBIndex",
      "org.databene.jdbacl.model.DBUniqueIndex",
      "org.databene.jdbacl.model.DBCheckConstraint",
      "org.antlr.runtime.ANTLRStringStream",
      "org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream",
      "org.databene.jdbacl.model.DBCatalog",
      "org.h2.message.TraceObject",
      "org.h2.Driver",
      "org.h2.jdbcx.JdbcDataSource",
      "org.h2.jdbcx.JdbcDataSourceFactory",
      "org.h2.message.TraceSystem",
      "org.h2.util.MathUtils",
      "org.h2.constant.SysProperties",
      "org.h2.util.SmallLRUCache",
      "org.h2.message.Trace",
      "org.databene.jdbacl.model.DBSchema",
      "org.databene.jdbacl.model.DBPrimaryKeyConstraint",
      "org.apache.derby.iapi.store.raw.xact.RawTransaction",
      "org.databene.commons.OrderedMap$ProxyEntry",
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
      "org.databene.commons.version.StringVersionNumberComponent",
      "org.databene.jdbacl.model.DBSequence",
      "org.apache.derby.impl.sql.catalog.DataDictionaryImpl",
      "org.apache.derby.impl.sql.compile.QueryTreeNode",
      "org.apache.derby.impl.sql.compile.ResultSetNode",
      "org.apache.derby.impl.sql.compile.FromTable",
      "org.apache.derby.impl.sql.compile.FromBaseTable",
      "org.apache.derby.impl.services.uuid.BasicUUID",
      "org.apache.derby.iapi.services.context.ContextService",
      "org.apache.derby.iapi.services.monitor.Monitor",
      "org.databene.jdbacl.model.DBPackage",
      "org.apache.derby.iapi.sql.dictionary.TupleDescriptor",
      "org.apache.derby.iapi.sql.dictionary.TableDescriptor",
      "org.apache.derby.iapi.sql.dictionary.ConglomerateDescriptorList",
      "org.apache.derby.iapi.sql.dictionary.ColumnDescriptorList",
      "org.apache.derby.iapi.sql.dictionary.GenericDescriptorList",
      "org.apache.derby.impl.sql.compile.FromVTI",
      "org.apache.derby.impl.sql.compile.StatementNode",
      "org.apache.derby.impl.sql.compile.DDLStatementNode",
      "org.apache.derby.impl.sql.compile.CreateIndexNode",
      "org.databene.commons.NullSafeComparator",
      "org.apache.derby.iapi.sql.dictionary.DataDescriptorGenerator",
      "org.apache.derby.iapi.types.DataType",
      "org.apache.derby.impl.store.access.conglomerate.GenericConglomerate",
      "org.apache.derby.impl.store.access.btree.BTree",
      "org.apache.derby.iapi.services.cache.ClassSizeCatalog",
      "org.apache.derby.iapi.services.cache.ClassSize$1",
      "org.apache.derby.iapi.services.cache.ClassSize",
      "org.apache.derby.impl.store.access.btree.index.B2I",
      "org.apache.derby.impl.store.access.btree.index.B2I_v10_2",
      "org.apache.derby.impl.sql.execute.BaseActivation",
      "org.apache.derby.impl.sql.execute.ConstantActionActivation",
      "org.apache.derby.impl.store.access.btree.index.B2I_10_3",
      "org.h2.util.New",
      "org.h2.command.dml.SetTypes",
      "org.h2.engine.ConnectionInfo",
      "org.h2.engine.Database",
      "org.h2.util.StringUtils",
      "org.h2.engine.Mode",
      "org.h2.util.TempFileDeleter",
      "org.h2.util.IOUtils",
      "org.h2.store.fs.FileSystem",
      "org.h2.store.fs.FileSystemDisk",
      "org.h2.util.Utils",
      "org.h2.message.DbException",
      "org.h2.constant.ErrorCode",
      "org.h2.jdbc.JdbcSQLException",
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
      "org.hsqldb.jdbc.jdbcClob",
      "org.h2.jdbc.JdbcConnection",
      "org.databene.commons.NameUtil",
      "org.apache.derby.iapi.sql.dictionary.CatalogRowFactory",
      "org.databene.jdbacl.sql.parser.SQLParser$value_return",
      "org.databene.jdbacl.sql.parser.SQLParser$name_return",
      "org.databene.jdbacl.sql.parser.SQLParser$keyword_return",
      "org.databene.commons.SyntaxError",
      "org.databene.jdbacl.model.DBNonUniqueIndex",
      "org.hsqldb.persist.HsqlProperties",
      "org.hsqldb.jdbc.jdbcConnection",
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
      "org.databene.jdbacl.model.FKChangeRule",
      "org.hsqldb.lib.HsqlByteArrayOutputStream",
      "org.hsqldb.rowio.RowOutputBase",
      "org.hsqldb.rowio.RowOutputTextLog",
      "org.databene.jdbacl.model.DBProcedure",
      "org.h2.value.Value",
      "org.h2.value.ValueNull",
      "org.h2.value.CompareMode",
      "org.h2.engine.SessionWithState",
      "org.h2.engine.SessionRemote",
      "org.h2.engine.Session",
      "org.h2.value.ValueLong",
      "org.h2.engine.Engine",
      "org.h2.store.FileLock",
      "org.h2.util.SortedProperties",
      "org.h2.util.MathUtils$1",
      "org.h2.jdbcx.JdbcConnectionPool",
      "org.postgresql.core.Logger",
      "org.postgresql.Driver",
      "org.postgresql.ds.common.BaseDataSource",
      "org.postgresql.ds.PGConnectionPoolDataSource",
      "org.antlr.runtime.Token",
      "org.databene.script.expression.ConstantExpression",
      "org.databene.jdbacl.sql.ColumnExpression",
      "org.apache.derby.iapi.sql.dictionary.SchemaDescriptor",
      "org.databene.jdbacl.sql.parser.SQLParser$literal_return",
      "org.apache.derby.iapi.services.io.FormatableProperties",
      "org.postgresql.jdbc2.AbstractJdbc2Connection",
      "org.postgresql.jdbc3.AbstractJdbc3Connection",
      "org.postgresql.jdbc3g.AbstractJdbc3gConnection",
      "org.postgresql.jdbc4.AbstractJdbc4Connection",
      "org.postgresql.jdbc4.Jdbc4Connection",
      "org.postgresql.core.v3.ConnectionFactoryImpl",
      "org.postgresql.core.v2.ConnectionFactoryImpl",
      "org.postgresql.core.ConnectionFactory",
      "org.postgresql.core.PGStream",
      "org.h2.util.Tool",
      "org.h2.tools.Recover",
      "org.databene.jdbacl.model.DBRowIterator",
      "org.apache.derby.impl.sql.compile.AlterTableNode",
      "org.postgresql.Driver$1",
      "org.postgresql.util.PSQLException",
      "org.postgresql.util.GT",
      "org.postgresql.util.PSQLState",
      "org.h2.tools.Csv",
      "org.h2.tools.SimpleResultSet",
      "org.antlr.runtime.MismatchedTokenException",
      "org.apache.derby.impl.sql.compile.TableElementNode",
      "org.apache.derby.impl.sql.compile.ConstraintDefinitionNode",
      "org.firebirdsql.gds.impl.AbstractGDS",
      "org.firebirdsql.gds.impl.jni.BaseGDSImpl",
      "org.firebirdsql.gds.impl.jni.JniGDSImpl",
      "org.h2.value.ValueLob",
      "org.h2.store.fs.FileSystemMemory",
      "org.h2.store.fs.FileSystemZip",
      "org.h2.store.fs.FileSystemSplit",
      "org.h2.store.fs.FileSystemDiskNio",
      "org.h2.store.fs.FileSystemDiskNioMapped",
      "org.databene.commons.ArrayUtil",
      "org.h2.command.ddl.CreateTableData",
      "org.apache.derby.impl.store.raw.xact.TransactionTable",
      "org.apache.derby.impl.store.raw.xact.XactFactory",
      "org.apache.derby.impl.store.raw.xact.ConcurrentXactFactory",
      "org.apache.derby.impl.store.raw.xact.TransactionMapFactory",
      "org.apache.derby.impl.store.raw.xact.ConcurrentTransactionMapFactory",
      "org.h2.jdbcx.JdbcXAConnection"
    );
  }
}