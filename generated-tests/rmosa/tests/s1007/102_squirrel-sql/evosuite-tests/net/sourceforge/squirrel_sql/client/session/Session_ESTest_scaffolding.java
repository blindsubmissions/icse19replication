/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Aug 23 08:15:00 GMT 2018
 */

package net.sourceforge.squirrel_sql.client.session;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class Session_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "net.sourceforge.squirrel_sql.client.session.Session"; 
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
    java.lang.System.setProperty("user.dir", "/home/ubuntu/evosuite_readability_gen/projects/102_squirrel-sql"); 
    java.lang.System.setProperty("user.home", "/home/ubuntu"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "ubuntu"); 
    java.lang.System.setProperty("user.timezone", "Etc/UTC"); 
    java.lang.System.setProperty("log4j.configuration", "SUT.log4j.properties"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Session_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.log4j.helpers.PatternConverter",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.apache.log4j.AppenderSkeleton",
      "net.sourceforge.squirrel_sql.client.gui.db.ISQLAliasExt",
      "org.apache.log4j.or.RendererMap",
      "net.sourceforge.squirrel_sql.fw.persist.IValidatable",
      "org.apache.log4j.ConsoleAppender$SystemErrStream",
      "net.sourceforge.squirrel_sql.client.gui.db.SQLAliasConnectionProperties",
      "org.apache.log4j.Level",
      "org.apache.log4j.helpers.DateTimeDateFormat",
      "net.sourceforge.squirrel_sql.fw.id.IIdentifier",
      "org.apache.log4j.helpers.QuietWriter",
      "org.apache.log4j.ConsoleAppender$SystemOutStream",
      "net.sourceforge.squirrel_sql.client.gui.db.SQLAliasSchemaDetailProperties",
      "org.apache.log4j.helpers.ISO8601DateFormat",
      "org.apache.log4j.helpers.PatternParser$LocationPatternConverter",
      "org.apache.log4j.CategoryKey",
      "org.apache.log4j.helpers.PatternParser$BasicPatternConverter",
      "org.apache.log4j.WriterAppender",
      "org.apache.log4j.Layout",
      "org.apache.log4j.helpers.OnlyOnceErrorHandler",
      "net.sourceforge.squirrel_sql.fw.sql.SQLDriverPropertyCollection",
      "net.sourceforge.squirrel_sql.fw.id.UidIdentifier",
      "net.sourceforge.squirrel_sql.fw.util.BaseException",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.ProvisionNode",
      "net.sourceforge.squirrel_sql.fw.util.StringManager",
      "org.apache.log4j.Hierarchy",
      "net.sourceforge.squirrel_sql.fw.util.log.ILogger",
      "org.apache.log4j.helpers.FileWatchdog",
      "net.sourceforge.squirrel_sql.client.gui.desktopcontainer.IWidget",
      "org.apache.log4j.helpers.PatternParser$CategoryPatternConverter",
      "net.sourceforge.squirrel_sql.fw.util.log.LoggerController",
      "net.sourceforge.squirrel_sql.fw.sql.ISQLDriver",
      "net.sourceforge.squirrel_sql.fw.util.log.ILoggerListener",
      "org.apache.log4j.helpers.PatternParser$LiteralPatternConverter",
      "org.apache.log4j.spi.OptionHandler",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.log4j.spi.RootLogger",
      "org.apache.log4j.spi.ErrorHandler",
      "net.sourceforge.squirrel_sql.fw.util.DefaultExceptionFormatter",
      "org.apache.log4j.spi.RendererSupport",
      "net.sourceforge.squirrel_sql.fw.util.log.Log4jLoggerFactory$1",
      "net.sourceforge.squirrel_sql.fw.util.Utilities$1",
      "net.sourceforge.squirrel_sql.fw.id.IHasIdentifier",
      "org.apache.log4j.helpers.AppenderAttachableImpl",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.log4j.helpers.FormattingInfo",
      "net.sourceforge.squirrel_sql.client.gui.db.SQLAliasColorProperties",
      "net.sourceforge.squirrel_sql.client.gui.db.SQLAliasSchemaProperties",
      "net.sourceforge.squirrel_sql.fw.sql.IQueryTokenizer",
      "net.sourceforge.squirrel_sql.fw.util.ExceptionFormatter",
      "net.sourceforge.squirrel_sql.fw.util.log.ILoggerFactory",
      "org.apache.log4j.BasicConfigurator",
      "org.apache.log4j.or.ObjectRenderer",
      "org.apache.log4j.helpers.AbsoluteTimeDateFormat",
      "net.sourceforge.squirrel_sql.fw.sql.ISQLConnection",
      "net.sourceforge.squirrel_sql.fw.util.beanwrapper.StringWrapper",
      "net.sourceforge.squirrel_sql.fw.util.NullMessageHandler",
      "org.apache.log4j.Logger",
      "org.apache.log4j.helpers.PatternParser$ClassNamePatternConverter",
      "net.sourceforge.squirrel_sql.client.gui.desktopcontainer.ISessionWidget",
      "org.apache.log4j.helpers.PatternParser",
      "org.apache.log4j.helpers.LogLog",
      "net.sourceforge.squirrel_sql.fw.sql.ISQLDatabaseMetaData",
      "org.apache.log4j.Category",
      "net.sourceforge.squirrel_sql.fw.util.StringManagerFactory",
      "org.apache.log4j.spi.RepositorySelector",
      "net.sourceforge.squirrel_sql.client.gui.mainframe.MainFrame",
      "net.sourceforge.squirrel_sql.fw.sql.ISQLAlias",
      "org.apache.log4j.spi.LoggerFactory",
      "org.apache.log4j.ConsoleAppender",
      "net.sourceforge.squirrel_sql.client.session.parser.IParserEventsProcessor",
      "org.apache.log4j.spi.Configurator",
      "net.sourceforge.squirrel_sql.fw.util.ISessionProperties",
      "org.apache.log4j.or.DefaultRenderer",
      "net.sourceforge.squirrel_sql.fw.util.log.Log4jLogger",
      "org.apache.log4j.PropertyWatchdog",
      "net.sourceforge.squirrel_sql.fw.util.IMessageHandler",
      "net.sourceforge.squirrel_sql.fw.sql.SQLDriver",
      "org.apache.log4j.PropertyConfigurator",
      "net.sourceforge.squirrel_sql.client.session.ISession",
      "org.apache.log4j.helpers.PatternParser$NamedPatternConverter",
      "org.apache.log4j.Appender",
      "net.sourceforge.squirrel_sql.client.mainframe.action.OpenConnectionCommandListener",
      "net.sourceforge.squirrel_sql.fw.datasetviewer.IMainFrame",
      "net.sourceforge.squirrel_sql.client.gui.db.SQLAlias",
      "net.sourceforge.squirrel_sql.fw.util.Utilities",
      "org.apache.log4j.spi.AppenderAttachable",
      "net.sourceforge.squirrel_sql.client.IApplication",
      "net.sourceforge.squirrel_sql.fw.sql.SQLConnection",
      "net.sourceforge.squirrel_sql.fw.persist.ValidationException",
      "org.apache.log4j.helpers.PatternParser$DatePatternConverter",
      "org.apache.log4j.helpers.PatternParser$MDCPatternConverter",
      "net.sourceforge.squirrel_sql.fw.util.log.Log4jLoggerFactory",
      "org.apache.log4j.Priority",
      "org.apache.log4j.PatternLayout",
      "org.apache.log4j.spi.LoggerRepository",
      "org.apache.log4j.LogManager",
      "net.sourceforge.squirrel_sql.client.session.Session"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Session_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "net.sourceforge.squirrel_sql.fw.util.log.Log4jLoggerFactory",
      "net.sourceforge.squirrel_sql.fw.util.log.Log4jLoggerFactory$1",
      "org.apache.log4j.BasicConfigurator",
      "org.apache.log4j.Category",
      "org.apache.log4j.Logger",
      "org.apache.log4j.Hierarchy",
      "org.apache.log4j.spi.RootLogger",
      "org.apache.log4j.Priority",
      "org.apache.log4j.Level",
      "org.apache.log4j.or.DefaultRenderer",
      "org.apache.log4j.or.RendererMap",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.PropertyConfigurator",
      "org.apache.log4j.LogManager",
      "org.apache.log4j.AppenderSkeleton",
      "org.apache.log4j.WriterAppender",
      "org.apache.log4j.ConsoleAppender",
      "org.apache.log4j.Layout",
      "org.apache.log4j.PatternLayout",
      "org.apache.log4j.helpers.PatternParser",
      "org.apache.log4j.helpers.FormattingInfo",
      "org.apache.log4j.helpers.PatternConverter",
      "org.apache.log4j.helpers.PatternParser$BasicPatternConverter",
      "org.apache.log4j.helpers.PatternParser$LiteralPatternConverter",
      "org.apache.log4j.helpers.PatternParser$NamedPatternConverter",
      "org.apache.log4j.helpers.PatternParser$CategoryPatternConverter",
      "org.apache.log4j.helpers.OnlyOnceErrorHandler",
      "org.apache.log4j.helpers.QuietWriter",
      "org.apache.log4j.helpers.AppenderAttachableImpl",
      "net.sourceforge.squirrel_sql.fw.util.log.LoggerController",
      "net.sourceforge.squirrel_sql.fw.util.log.Log4jLogger",
      "org.apache.log4j.CategoryKey",
      "org.apache.log4j.ProvisionNode",
      "net.sourceforge.squirrel_sql.fw.util.Utilities",
      "net.sourceforge.squirrel_sql.fw.util.StringManagerFactory",
      "net.sourceforge.squirrel_sql.fw.util.StringManager",
      "net.sourceforge.squirrel_sql.client.session.Session",
      "net.sourceforge.squirrel_sql.client.session.Session$SQLConnectionListener",
      "net.sourceforge.squirrel_sql.client.session.Session$3",
      "net.sourceforge.squirrel_sql.client.session.Session$1",
      "net.sourceforge.squirrel_sql.client.session.Session$2",
      "net.sourceforge.squirrel_sql.fw.util.NullMessageHandler",
      "net.sourceforge.squirrel_sql.fw.sql.SQLDriver",
      "net.sourceforge.squirrel_sql.client.gui.db.SQLAlias",
      "net.sourceforge.squirrel_sql.fw.sql.SQLDriverPropertyCollection",
      "net.sourceforge.squirrel_sql.client.gui.db.SQLAliasSchemaProperties",
      "net.sourceforge.squirrel_sql.client.gui.db.SQLAliasColorProperties",
      "net.sourceforge.squirrel_sql.client.gui.db.SQLAliasConnectionProperties",
      "com.gargoylesoftware.base.resource.jdbc.ConnectionWrapper",
      "net.sourceforge.squirrel_sql.fw.sql.SQLConnection",
      "net.sourceforge.squirrel_sql.fw.sql.SQLDatabaseMetaData",
      "net.sourceforge.squirrel_sql.fw.id.UidIdentifier",
      "net.sourceforge.squirrel_sql.fw.util.DefaultExceptionFormatter",
      "net.sourceforge.squirrel_sql.client.plugin.DefaultPlugin",
      "net.sourceforge.squirrel_sql.client.DummyAppPlugin",
      "net.sourceforge.squirrel_sql.client.util.ApplicationFileWrappersImpl",
      "net.sourceforge.squirrel_sql.fw.util.FileWrapperFactoryImpl",
      "net.sourceforge.squirrel_sql.client.util.ApplicationFiles",
      "net.sourceforge.squirrel_sql.client.ApplicationArguments",
      "org.apache.commons.cli.Options",
      "net.sourceforge.squirrel_sql.client.ApplicationArguments$IOptions",
      "org.apache.commons.cli.Option",
      "org.apache.commons.cli.OptionValidator",
      "org.apache.commons.cli.OptionBuilder",
      "org.apache.commons.cli.Parser",
      "org.apache.commons.cli.GnuParser",
      "org.apache.commons.cli.CommandLine",
      "org.apache.commons.cli.Util",
      "net.sourceforge.squirrel_sql.client.util.ApplicationFiles$1OldFileNameFilter",
      "net.sourceforge.squirrel_sql.fw.id.IntegerIdentifier",
      "net.sourceforge.squirrel_sql.client.session.SQLPanelAPI",
      "net.sourceforge.squirrel_sql.client.session.FileManager",
      "net.sourceforge.squirrel_sql.fw.util.IOUtilitiesImpl",
      "net.sourceforge.squirrel_sql.fw.util.BaseException",
      "net.sourceforge.squirrel_sql.fw.persist.ValidationException",
      "net.sourceforge.squirrel_sql.client.gui.db.SQLAlias$IStrings",
      "net.sourceforge.squirrel_sql.client.session.mainpanel.BaseMainPanelTab",
      "net.sourceforge.squirrel_sql.client.session.mainpanel.ObjectTreeTab",
      "net.sourceforge.squirrel_sql.fw.id.IntegerIdentifierFactory",
      "net.sourceforge.squirrel_sql.client.session.BaseSQLEntryPanel",
      "net.sourceforge.squirrel_sql.client.session.DefaultSQLEntryPanel",
      "net.sourceforge.squirrel_sql.fw.sql.SQLDriver$IStrings",
      "net.sourceforge.squirrel_sql.fw.util.PropertyChangeReporter",
      "net.sourceforge.squirrel_sql.fw.sql.SQLDriverProperty",
      "net.sourceforge.squirrel_sql.fw.util.FileWrapperImpl",
      "com.gargoylesoftware.base.resource.jdbc.StatementWrapper",
      "com.gargoylesoftware.base.resource.jdbc.PreparedStatementWrapper",
      "net.sourceforge.squirrel_sql.client.Version",
      "com.gargoylesoftware.base.resource.jdbc.CallableStatementWrapper",
      "net.sourceforge.squirrel_sql.client.session.mainpanel.SQLPanel",
      "net.sourceforge.squirrel_sql.fw.gui.IntegerField",
      "net.sourceforge.squirrel_sql.fw.gui.IntegerField$IntegerDocument",
      "net.sourceforge.squirrel_sql.client.session.mainpanel.SQLPanel$SqlComboListener",
      "net.sourceforge.squirrel_sql.client.session.event.SQLExecutionAdapter",
      "net.sourceforge.squirrel_sql.client.session.mainpanel.SQLPanel$SQLExecutorHistoryListener",
      "net.sourceforge.squirrel_sql.fw.dialects.CommonHibernateDialect",
      "net.sourceforge.squirrel_sql.fw.dialects.AxionDialectExt",
      "org.apache.commons.logging.impl.Log4JLogger",
      "org.hibernate.dialect.function.StandardSQLFunction",
      "org.hibernate.dialect.Dialect$1",
      "org.hibernate.dialect.Dialect$2",
      "org.hibernate.dialect.Dialect$3",
      "org.hibernate.dialect.Dialect$4",
      "org.hibernate.dialect.Dialect",
      "net.sourceforge.squirrel_sql.fw.dialects.AxionDialectExt$AxionDialectHelper",
      "org.hibernate.dialect.TypeNames",
      "org.hibernate.dialect.function.SQLFunctionTemplate",
      "org.hibernate.type.AbstractType",
      "org.hibernate.util.StringHelper",
      "org.hibernate.type.NullableType",
      "org.hibernate.type.ImmutableType",
      "org.hibernate.type.PrimitiveType",
      "org.hibernate.type.LongType",
      "org.hibernate.type.ShortType",
      "org.hibernate.type.IntegerType",
      "org.hibernate.type.ByteType",
      "org.hibernate.type.FloatType",
      "org.hibernate.type.DoubleType",
      "org.hibernate.type.CharacterType",
      "org.hibernate.type.StringType",
      "org.hibernate.type.MutableType",
      "org.hibernate.type.TimeType",
      "org.hibernate.type.DateType",
      "org.hibernate.type.TimestampType",
      "org.hibernate.type.BooleanType",
      "org.hibernate.type.CharBooleanType",
      "org.hibernate.type.TrueFalseType",
      "org.hibernate.type.YesNoType",
      "org.hibernate.type.BigDecimalType",
      "org.hibernate.type.BigIntegerType",
      "org.hibernate.type.AbstractBynaryType",
      "org.hibernate.type.BinaryType",
      "org.hibernate.type.WrapperBinaryType",
      "org.hibernate.type.AbstractCharArrayType",
      "org.hibernate.type.CharArrayType",
      "org.hibernate.type.CharacterArrayType",
      "org.hibernate.type.TextType",
      "org.hibernate.type.BlobType",
      "org.hibernate.type.ClobType",
      "org.hibernate.type.CalendarType",
      "org.hibernate.type.CalendarDateType",
      "org.hibernate.type.LocaleType",
      "org.hibernate.type.CurrencyType",
      "org.hibernate.type.TimeZoneType",
      "org.hibernate.type.ClassType",
      "org.hibernate.type.SerializableType",
      "org.hibernate.type.AnyType",
      "org.hibernate.Hibernate",
      "org.hibernate.dialect.function.CastFunction",
      "net.sourceforge.squirrel_sql.fw.dialects.DB2DialectExt",
      "org.hibernate.dialect.DB2Dialect",
      "net.sourceforge.squirrel_sql.fw.dialects.DB2DialectExt$DB2DialectHelper",
      "org.hibernate.dialect.function.NoArgSQLFunction",
      "org.hibernate.dialect.function.AnsiTrimEmulationFunction",
      "org.hibernate.dialect.function.VarArgsSQLFunction",
      "net.sourceforge.squirrel_sql.fw.dialects.DaffodilDialectExt",
      "net.sourceforge.squirrel_sql.fw.dialects.DaffodilDialectExt$DaffodilDialectHelper",
      "net.sourceforge.squirrel_sql.fw.dialects.DerbyDialectExt",
      "net.sourceforge.squirrel_sql.fw.dialects.DerbyDialectExt$DerbyDialectHelper",
      "net.sourceforge.squirrel_sql.fw.dialects.FirebirdDialectExt",
      "org.hibernate.dialect.InterbaseDialect",
      "org.hibernate.dialect.FirebirdDialect",
      "net.sourceforge.squirrel_sql.fw.dialects.FirebirdDialectExt$FirebirdDialectHelper",
      "net.sourceforge.squirrel_sql.fw.dialects.FrontBaseDialectExt",
      "org.hibernate.dialect.FrontBaseDialect",
      "net.sourceforge.squirrel_sql.fw.dialects.FrontBaseDialectExt$FrontBaseDialectHelper",
      "net.sourceforge.squirrel_sql.fw.dialects.GenericDialectExt",
      "net.sourceforge.squirrel_sql.fw.dialects.GenericDialectExt$GenericDialectHelper",
      "net.sourceforge.squirrel_sql.fw.dialects.HADBDialectExt",
      "net.sourceforge.squirrel_sql.fw.dialects.HADBDialectExt$HADBDialectHelper",
      "net.sourceforge.squirrel_sql.fw.dialects.H2DialectExt",
      "net.sourceforge.squirrel_sql.fw.dialects.H2DialectExt$H2DialectHelper",
      "net.sourceforge.squirrel_sql.fw.dialects.HSQLDialectExt",
      "org.hibernate.exception.TemplatedViolatedConstraintNameExtracter",
      "org.hibernate.dialect.HSQLDialect$1",
      "org.hibernate.dialect.HSQLDialect",
      "net.sourceforge.squirrel_sql.fw.dialects.HSQLDialectExt$HSQLDialectHelper",
      "org.hibernate.property.BasicPropertyAccessor",
      "org.hibernate.property.DirectPropertyAccessor",
      "org.hibernate.util.ReflectHelper",
      "net.sourceforge.squirrel_sql.fw.dialects.InformixDialectExt",
      "org.hibernate.dialect.InformixDialect$1",
      "org.hibernate.dialect.InformixDialect",
      "net.sourceforge.squirrel_sql.fw.dialects.InformixDialectExt$InformixDialectHelper",
      "net.sourceforge.squirrel_sql.fw.dialects.InterbaseDialectExt",
      "net.sourceforge.squirrel_sql.fw.dialects.InterbaseDialectExt$InterbaseDialectHelper",
      "net.sourceforge.squirrel_sql.fw.dialects.IngresDialectExt",
      "org.hibernate.dialect.IngresDialect",
      "net.sourceforge.squirrel_sql.fw.dialects.IngresDialectExt$IngresDialectHelper",
      "net.sourceforge.squirrel_sql.fw.dialects.MAXDBDialectExt",
      "org.hibernate.dialect.SAPDBDialect",
      "net.sourceforge.squirrel_sql.fw.dialects.MAXDBDialectExt$MAXDBDialectHelper",
      "net.sourceforge.squirrel_sql.fw.dialects.McKoiDialectExt",
      "net.sourceforge.squirrel_sql.fw.dialects.McKoiDialectExt$McKoiDialectHelper",
      "net.sourceforge.squirrel_sql.fw.dialects.MySQLDialectExt",
      "org.hibernate.dialect.MySQLDialect",
      "net.sourceforge.squirrel_sql.fw.dialects.MySQLDialectExt$MySQLDialectHelper",
      "net.sourceforge.squirrel_sql.fw.dialects.MySQL5DialectExt",
      "net.sourceforge.squirrel_sql.fw.dialects.NetezzaDialextExt",
      "org.hibernate.dialect.PostgreSQLDialect$1",
      "org.hibernate.dialect.PostgreSQLDialect",
      "net.sourceforge.squirrel_sql.fw.dialects.NetezzaDialextExt$NetezzaDialectHelper",
      "org.hibernate.dialect.function.PositionSubstringFunction",
      "net.sourceforge.squirrel_sql.fw.dialects.GreenplumDialectExt",
      "net.sourceforge.squirrel_sql.fw.dialects.GreenplumDialectExt$GreenplumDialectHelper",
      "net.sourceforge.squirrel_sql.fw.dialects.OracleDialectExt",
      "org.hibernate.dialect.Oracle9Dialect$1",
      "org.hibernate.dialect.Oracle9Dialect",
      "net.sourceforge.squirrel_sql.fw.dialects.OracleDialectExt$OracleDialectHelper",
      "org.hibernate.dialect.function.NvlFunction",
      "net.sourceforge.squirrel_sql.fw.dialects.PointbaseDialectExt",
      "org.hibernate.dialect.PointbaseDialect",
      "net.sourceforge.squirrel_sql.fw.dialects.PointbaseDialectExt$PointbaseDialectHelper",
      "net.sourceforge.squirrel_sql.fw.dialects.PostgreSQLDialectExt",
      "net.sourceforge.squirrel_sql.fw.dialects.PostgreSQLDialectExt$PostgreSQLDialectHelper",
      "net.sourceforge.squirrel_sql.fw.dialects.ProgressDialectExt",
      "net.sourceforge.squirrel_sql.fw.dialects.ProgressDialectExt$ProgressDialectHelper",
      "net.sourceforge.squirrel_sql.fw.dialects.SybaseDialectExt",
      "org.hibernate.dialect.SybaseDialect",
      "net.sourceforge.squirrel_sql.fw.dialects.SybaseDialectExt$SybaseDialectHelper",
      "org.hibernate.dialect.function.CharIndexFunction",
      "net.sourceforge.squirrel_sql.fw.dialects.SQLServerDialectExt",
      "net.sourceforge.squirrel_sql.fw.dialects.SQLServerDialectExt$SQLServerDialectHelper",
      "net.sourceforge.squirrel_sql.fw.dialects.TimesTenDialectExt",
      "org.hibernate.dialect.TimesTenDialect",
      "net.sourceforge.squirrel_sql.fw.dialects.TimesTenDialectExt$TimesTenDialectHelper",
      "net.sourceforge.squirrel_sql.fw.dialects.IntersystemsCacheDialectExt",
      "org.hibernate.dialect.Cache71Dialect$1",
      "org.hibernate.dialect.Cache71Dialect",
      "net.sourceforge.squirrel_sql.fw.dialects.IntersystemsCacheDialectExt$CacheHelper",
      "org.hibernate.dialect.function.StandardJDBCEscapeFunction",
      "org.hibernate.dialect.function.ConvertFunction",
      "org.hibernate.dialect.function.ConditionalParenthesisFunction",
      "net.sourceforge.squirrel_sql.fw.gui.DialogUtils",
      "net.sourceforge.squirrel_sql.fw.dialects.DialectFactory",
      "com.gargoylesoftware.base.resource.jdbc.DatabaseMetaDataWrapper",
      "net.sourceforge.squirrel_sql.fw.dialects.DialectType",
      "org.apache.commons.lang.StringUtils",
      "net.sourceforge.squirrel_sql.fw.sql.SQLConnection$1",
      "net.sourceforge.squirrel_sql.fw.util.beanwrapper.StringWrapper",
      "net.sourceforge.squirrel_sql.client.session.mainpanel.SQLResultExecuterPanel",
      "net.sourceforge.squirrel_sql.client.session.mainpanel.ResultTabFactory",
      "net.sourceforge.squirrel_sql.client.session.mainpanel.SQLResultExecuterPanel$1",
      "net.sourceforge.squirrel_sql.fw.sql.QueryTokenizer",
      "net.sourceforge.squirrel_sql.client.gui.db.SchemaNameLoadInfo",
      "net.sourceforge.squirrel_sql.client.session.mainpanel.objecttree.ObjectTreePanel",
      "net.sourceforge.squirrel_sql.fw.id.UidIdentifierFactory",
      "net.sourceforge.squirrel_sql.client.util.IdentifierFactory",
      "net.sourceforge.squirrel_sql.client.session.parser.ParserEventsProcessorDummy",
      "net.sourceforge.squirrel_sql.client.gui.desktopcontainer.TabWidget",
      "net.sourceforge.squirrel_sql.client.gui.desktopcontainer.SessionTabWidget",
      "net.sourceforge.squirrel_sql.client.gui.session.SQLInternalFrame",
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.data.general.AbstractSeriesDataset",
      "org.jfree.data.xy.AbstractXYDataset",
      "org.jfree.data.xy.AbstractIntervalXYDataset",
      "org.jfree.data.statistics.HistogramDataset",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.data.statistics.HistogramType",
      "net.sourceforge.squirrel_sql.client.gui.db.SQLAliasSchemaDetailProperties",
      "org.jfree.data.xy.DefaultIntervalXYDataset",
      "org.jfree.data.time.RegularTimePeriod",
      "org.jfree.data.time.Day",
      "org.jfree.date.SerialDate",
      "org.jfree.date.SpreadsheetDate",
      "org.springframework.util.CustomizableThreadCreator",
      "org.springframework.scheduling.concurrent.CustomizableThreadFactory",
      "net.sourceforge.squirrel_sql.client.gui.db.SchemaLoadInfo",
      "org.jfree.data.gantt.Task",
      "org.springframework.util.ClassUtils",
      "org.springframework.util.Assert",
      "org.springframework.util.StringUtils",
      "net.sourceforge.squirrel_sql.client.gui.session.ObjectTreeInternalFrame",
      "net.sourceforge.squirrel_sql.client.session.mainpanel.SQLTab",
      "net.sourceforge.squirrel_sql.fw.util.ListMessageHandler",
      "org.jfree.data.statistics.SimpleHistogramBin",
      "org.jfree.data.statistics.DefaultMultiValueCategoryDataset",
      "org.jfree.data.KeyedObjects2D",
      "org.jfree.data.Range",
      "org.jfree.data.time.Second",
      "org.jfree.data.time.FixedMillisecond",
      "org.jfree.data.time.Quarter"
    );
  }
}
