/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Aug 23 14:54:37 GMT 2018
 */

package net.sourceforge.squirrel_sql.plugins.dbcopy.util;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class DBUtil_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "net.sourceforge.squirrel_sql.plugins.dbcopy.util.DBUtil"; 
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
    java.lang.System.setProperty("user.dir", "/home/ubuntu/evosuite_readability_gen/projects/102_squirrel-sql"); 
    java.lang.System.setProperty("user.home", "/home/ubuntu"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "ubuntu"); 
    java.lang.System.setProperty("user.timezone", "Etc/UTC"); 
    java.lang.System.setProperty("log4j.configuration", "SUT.log4j.properties"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(DBUtil_ESTest_scaffolding.class.getClassLoader() ,
      "net.sourceforge.squirrel_sql.client.gui.desktopcontainer.DesktopStyle",
      "org.apache.log4j.helpers.PatternConverter",
      "org.apache.log4j.AppenderSkeleton",
      "net.sourceforge.squirrel_sql.client.gui.db.DataCache",
      "net.sourceforge.squirrel_sql.client.gui.db.SQLAliasConnectionProperties",
      "org.apache.log4j.Level",
      "org.apache.log4j.helpers.DateTimeDateFormat",
      "org.apache.log4j.helpers.QuietWriter",
      "org.apache.log4j.ConsoleAppender$SystemOutStream",
      "net.sourceforge.squirrel_sql.client.session.event.SimpleSessionListener",
      "org.apache.commons.cli.UnrecognizedOptionException",
      "net.sourceforge.squirrel_sql.client.MultipleWindowsHandler",
      "net.sourceforge.squirrel_sql.fw.sql.SQLDatabaseMetaData",
      "net.sourceforge.squirrel_sql.client.gui.db.SQLAliasSchemaDetailProperties",
      "org.apache.log4j.helpers.ISO8601DateFormat",
      "net.sourceforge.squirrel_sql.fw.sql.TableInfo",
      "net.sourceforge.squirrel_sql.client.plugin.IPluginManager",
      "net.sourceforge.squirrel_sql.client.session.ISQLEntryPanelFactory",
      "org.apache.log4j.helpers.PatternParser$BasicPatternConverter",
      "net.sourceforge.squirrel_sql.client.util.ApplicationFiles$1OldFileNameFilter",
      "net.sourceforge.squirrel_sql.client.session.schemainfo.SchemaInfo$1",
      "org.apache.log4j.Layout",
      "net.sourceforge.squirrel_sql.plugins.dbcopy.DBCopyPlugin",
      "net.sourceforge.squirrel_sql.client.session.JdbcConnectionData",
      "com.gargoylesoftware.base.resource.ManagedResource",
      "net.sourceforge.squirrel_sql.fw.sql.SQLDriverPropertyCollection",
      "net.sourceforge.squirrel_sql.fw.util.FileWrapperFactoryImpl",
      "net.sourceforge.squirrel_sql.client.preferences.IGlobalPreferencesPanel",
      "org.apache.log4j.Hierarchy",
      "net.sourceforge.squirrel_sql.client.FontInfoStore",
      "net.sourceforge.squirrel_sql.fw.util.log.ILogger",
      "org.apache.log4j.helpers.PatternParser$CategoryPatternConverter",
      "net.sourceforge.squirrel_sql.client.plugin.IPlugin",
      "net.sourceforge.squirrel_sql.fw.util.log.LoggerController",
      "net.sourceforge.squirrel_sql.client.session.mainpanel.objecttree.INodeExpander",
      "org.apache.commons.cli.Option",
      "org.apache.log4j.spi.OptionHandler",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "net.sourceforge.squirrel_sql.fw.util.FileWrapperFactory",
      "net.sourceforge.squirrel_sql.plugins.dbcopy.I18NBaseObject",
      "net.sourceforge.squirrel_sql.fw.util.log.Log4jLoggerFactory$1",
      "net.sourceforge.squirrel_sql.fw.util.Utilities$1",
      "net.sourceforge.squirrel_sql.fw.sql.IDatabaseObjectInfo",
      "net.sourceforge.squirrel_sql.fw.util.PropertyChangeReporter",
      "net.sourceforge.squirrel_sql.fw.id.IHasIdentifier",
      "com.gargoylesoftware.base.resource.jdbc.AlreadyClosedException",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.log4j.helpers.FormattingInfo",
      "net.sourceforge.squirrel_sql.client.gui.db.SQLAliasSchemaProperties",
      "org.apache.commons.cli.MissingArgumentException",
      "net.sourceforge.squirrel_sql.plugins.dbcopy.util.DBUtil",
      "net.sourceforge.squirrel_sql.fw.dialects.UserCancelledOperationException",
      "org.hibernate.exception.Nestable",
      "net.sourceforge.squirrel_sql.client.gui.desktopcontainer.SessionTabWidget",
      "net.sourceforge.squirrel_sql.fw.sql.DatabaseObjectInfo",
      "net.sourceforge.squirrel_sql.fw.util.log.ILoggerFactory",
      "net.sourceforge.squirrel_sql.fw.util.ExceptionFormatter",
      "net.n3.nanoxml.IXMLReader",
      "net.sourceforge.squirrel_sql.client.session.schemainfo.FilterMatcher",
      "net.sourceforge.squirrel_sql.fw.id.IntegerIdentifier",
      "org.apache.log4j.or.ObjectRenderer",
      "net.sourceforge.squirrel_sql.client.session.schemainfo.SchemaInfoUpdateListener",
      "net.sourceforge.squirrel_sql.fw.id.IntegerIdentifierFactory",
      "net.sourceforge.squirrel_sql.client.preferences.SquirrelPreferences",
      "net.sourceforge.squirrel_sql.fw.util.beanwrapper.StringWrapper",
      "net.sourceforge.squirrel_sql.fw.resources.LibraryResources",
      "net.sourceforge.squirrel_sql.client.resources.SquirrelResources",
      "net.sourceforge.squirrel_sql.client.session.IObjectTreeInternalFrame",
      "net.sourceforge.squirrel_sql.client.session.mainpanel.IMainPanelTab",
      "org.apache.log4j.helpers.PatternParser$ClassNamePatternConverter",
      "net.sourceforge.squirrel_sql.fw.datasetviewer.IDataSet",
      "net.sourceforge.squirrel_sql.client.gui.desktopcontainer.ISessionWidget",
      "org.apache.log4j.helpers.PatternParser",
      "org.apache.log4j.Category",
      "net.sourceforge.squirrel_sql.client.Version",
      "net.sourceforge.squirrel_sql.client.session.event.ISessionListener",
      "net.sourceforge.squirrel_sql.fw.util.TaskThreadPool",
      "net.sourceforge.squirrel_sql.client.plugin.PluginException",
      "net.sourceforge.squirrel_sql.client.plugin.DefaultSessionPlugin",
      "net.sourceforge.squirrel_sql.fw.sql.TableColumnInfo",
      "net.sourceforge.squirrel_sql.client.session.properties.SessionProperties",
      "org.apache.log4j.spi.LoggerFactory",
      "org.apache.log4j.ConsoleAppender",
      "org.apache.log4j.spi.Configurator",
      "net.sourceforge.squirrel_sql.client.gui.session.SessionPanel",
      "net.sourceforge.squirrel_sql.client.IApplicationArguments",
      "net.sourceforge.squirrel_sql.fw.sql.IProcedureInfo",
      "net.sourceforge.squirrel_sql.client.session.schemainfo.SchemaInfo",
      "net.sourceforge.squirrel_sql.fw.util.FileWrapper",
      "org.apache.log4j.PropertyWatchdog",
      "org.apache.commons.cli.Options",
      "net.sourceforge.squirrel_sql.client.preferences.PreferenceType",
      "net.sourceforge.squirrel_sql.plugins.dbcopy.DBCopyPluginResources",
      "org.apache.log4j.helpers.PatternParser$NamedPatternConverter",
      "net.sourceforge.squirrel_sql.fw.sql.SQLDriverProperty",
      "org.apache.commons.cli.OptionBuilder",
      "org.apache.commons.cli.CommandLine",
      "net.sourceforge.squirrel_sql.client.session.ExtendedColumnInfo",
      "net.sourceforge.squirrel_sql.client.gui.WindowManager",
      "net.sourceforge.squirrel_sql.fw.datasetviewer.IMainFrame",
      "net.sourceforge.squirrel_sql.client.gui.db.SQLAlias",
      "org.apache.commons.cli.CommandLineParser",
      "net.sourceforge.squirrel_sql.fw.util.Utilities",
      "org.apache.log4j.spi.AppenderAttachable",
      "net.sourceforge.squirrel_sql.client.IApplication",
      "net.sourceforge.squirrel_sql.client.plugin.PreferenceUtil",
      "org.apache.log4j.helpers.PatternParser$DatePatternConverter",
      "org.apache.log4j.helpers.PatternParser$MDCPatternConverter",
      "org.apache.log4j.Priority",
      "org.apache.log4j.LogManager",
      "net.sourceforge.squirrel_sql.fw.xml.XMLException",
      "net.sourceforge.squirrel_sql.plugins.dbcopy.SessionInfoProvider",
      "net.sourceforge.squirrel_sql.client.session.properties.ISessionPropertiesPanel",
      "net.sourceforge.squirrel_sql.client.session.SessionManager",
      "net.sourceforge.squirrel_sql.fw.sql.ForeignKeyInfo",
      "net.sourceforge.squirrel_sql.fw.sql.DatabaseObjectType",
      "org.apache.log4j.DefaultCategoryFactory",
      "net.sourceforge.squirrel_sql.client.util.ApplicationFileWrappersImpl",
      "net.sourceforge.squirrel_sql.fw.util.FileWrapperImpl",
      "org.apache.log4j.or.RendererMap",
      "net.sourceforge.squirrel_sql.client.gui.db.ISQLAliasExt",
      "net.sourceforge.squirrel_sql.client.plugin.PluginResources",
      "net.sourceforge.squirrel_sql.fw.persist.IValidatable",
      "org.apache.log4j.ConsoleAppender$SystemErrStream",
      "net.sourceforge.squirrel_sql.client.session.mainpanel.SQLHistory",
      "net.sourceforge.squirrel_sql.client.util.IOptionPanel",
      "net.sourceforge.squirrel_sql.fw.id.IIdentifier",
      "net.sourceforge.squirrel_sql.client.gui.desktopcontainer.TabWidget",
      "org.apache.commons.cli.Parser",
      "net.sourceforge.squirrel_sql.client.plugin.DefaultPlugin",
      "org.apache.log4j.helpers.PatternParser$LocationPatternConverter",
      "org.apache.log4j.CategoryKey",
      "org.apache.log4j.WriterAppender",
      "org.hibernate.HibernateException",
      "org.apache.commons.cli.Util",
      "org.apache.log4j.helpers.OnlyOnceErrorHandler",
      "net.sourceforge.squirrel_sql.plugins.dbcopy.util.ScriptWriter",
      "net.sourceforge.squirrel_sql.client.gui.db.aliasproperties.IAliasPropertiesPanelController",
      "net.sourceforge.squirrel_sql.client.session.IObjectTreeAPI",
      "net.sourceforge.squirrel_sql.client.session.schemainfo.ObjFilterMatcher",
      "org.apache.log4j.helpers.Loader",
      "net.sourceforge.squirrel_sql.fw.util.BaseException",
      "net.sourceforge.squirrel_sql.fw.util.StringManager",
      "org.apache.log4j.ProvisionNode",
      "org.apache.log4j.helpers.FileWatchdog",
      "net.sourceforge.squirrel_sql.client.gui.desktopcontainer.IWidget",
      "net.sourceforge.squirrel_sql.client.session.schemainfo.CaseInsensitiveString",
      "net.sourceforge.squirrel_sql.fw.sql.SQLUtilities",
      "net.sourceforge.squirrel_sql.fw.sql.ISQLDriver",
      "net.sourceforge.squirrel_sql.fw.util.log.ILoggerListener",
      "net.sourceforge.squirrel_sql.client.gui.session.SessionInternalFrame",
      "org.apache.log4j.helpers.PatternParser$LiteralPatternConverter",
      "org.apache.log4j.spi.RootLogger",
      "org.apache.log4j.spi.ErrorHandler",
      "net.sourceforge.squirrel_sql.fw.id.IIdentifierFactory",
      "org.apache.commons.cli.MissingOptionException",
      "org.apache.log4j.spi.RendererSupport",
      "net.sourceforge.squirrel_sql.client.action.ActionCollection",
      "org.apache.log4j.helpers.AppenderAttachableImpl",
      "net.sourceforge.squirrel_sql.client.gui.db.SQLAliasColorProperties",
      "net.sourceforge.squirrel_sql.client.preferences.INewSessionPropertiesPanel",
      "net.sourceforge.squirrel_sql.fw.sql.IQueryTokenizer",
      "net.sourceforge.squirrel_sql.client.plugin.PluginSessionCallback",
      "net.sourceforge.squirrel_sql.client.ApplicationArguments$IOptions",
      "org.apache.log4j.BasicConfigurator",
      "net.sourceforge.squirrel_sql.fw.xml.XMLBeanReader",
      "net.sourceforge.squirrel_sql.fw.sql.SQLDriverManager",
      "org.apache.log4j.helpers.AbsoluteTimeDateFormat",
      "net.sourceforge.squirrel_sql.fw.sql.ISQLConnection",
      "org.apache.log4j.Logger",
      "net.sourceforge.squirrel_sql.fw.sql.ProgressCallBack",
      "net.sourceforge.squirrel_sql.client.util.ApplicationFileWrappers",
      "net.sourceforge.squirrel_sql.fw.gui.action.wikiTable.IWikiTableConfigurationFactory",
      "net.sourceforge.squirrel_sql.client.session.ISQLPanelAPI",
      "org.apache.log4j.helpers.LogLog",
      "net.sourceforge.squirrel_sql.fw.sql.ISQLDatabaseMetaData",
      "net.sourceforge.squirrel_sql.fw.util.StringManagerFactory",
      "org.apache.log4j.spi.RepositorySelector",
      "net.sourceforge.squirrel_sql.client.gui.mainframe.MainFrame",
      "com.gargoylesoftware.base.resource.jdbc.ConnectionWrapper",
      "net.sourceforge.squirrel_sql.fw.sql.ISQLAlias",
      "org.apache.commons.cli.ParseException",
      "org.hibernate.MappingException",
      "net.sourceforge.squirrel_sql.client.session.parser.IParserEventsProcessor",
      "net.sourceforge.squirrel_sql.fw.util.ISessionProperties",
      "net.sourceforge.squirrel_sql.plugins.dbcopy.prefs.DBCopyPreferenceBean",
      "org.apache.log4j.or.DefaultRenderer",
      "net.sourceforge.squirrel_sql.fw.util.log.Log4jLogger",
      "net.sourceforge.squirrel_sql.fw.sql.SQLDriver",
      "net.sourceforge.squirrel_sql.fw.util.IMessageHandler",
      "org.apache.log4j.PropertyConfigurator",
      "net.sourceforge.squirrel_sql.client.session.event.SessionAdapter",
      "net.sourceforge.squirrel_sql.plugins.dbcopy.prefs.PreferencesManager",
      "net.sourceforge.squirrel_sql.client.session.ISession",
      "net.sourceforge.squirrel_sql.client.ApplicationListener",
      "org.apache.commons.cli.GnuParser",
      "org.apache.log4j.Appender",
      "net.sourceforge.squirrel_sql.client.util.ApplicationFiles",
      "net.sourceforge.squirrel_sql.fw.datasetviewer.DataSetException",
      "net.sourceforge.squirrel_sql.fw.util.Resources",
      "org.apache.commons.cli.OptionValidator",
      "net.sourceforge.squirrel_sql.client.plugin.IPluginDatabaseObjectType",
      "net.sourceforge.squirrel_sql.client.ApplicationArguments",
      "net.sourceforge.squirrel_sql.fw.sql.SQLConnection",
      "net.sourceforge.squirrel_sql.fw.persist.ValidationException",
      "net.sourceforge.squirrel_sql.client.session.ISQLInternalFrame",
      "net.sourceforge.squirrel_sql.fw.util.log.Log4jLoggerFactory",
      "net.sourceforge.squirrel_sql.fw.util.IResources",
      "net.sourceforge.squirrel_sql.fw.sql.ITableInfo",
      "net.sourceforge.squirrel_sql.client.plugin.ISessionPlugin",
      "org.apache.log4j.PatternLayout",
      "org.apache.log4j.spi.LoggerRepository",
      "org.hibernate.exception.NestableRuntimeException"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.sql.Connection", false, DBUtil_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(DBUtil_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "net.sourceforge.squirrel_sql.fw.util.StringManagerFactory",
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
      "net.sourceforge.squirrel_sql.fw.util.StringManager",
      "net.sourceforge.squirrel_sql.plugins.dbcopy.I18NBaseObject",
      "net.sourceforge.squirrel_sql.fw.util.FileWrapperFactoryImpl",
      "net.sourceforge.squirrel_sql.plugins.dbcopy.prefs.PreferencesManager",
      "net.sourceforge.squirrel_sql.plugins.dbcopy.util.DBUtil",
      "net.sourceforge.squirrel_sql.plugins.dbcopy.util.ScriptWriter",
      "net.sourceforge.squirrel_sql.fw.sql.SQLUtilities",
      "net.sourceforge.squirrel_sql.fw.dialects.CommonHibernateDialect",
      "net.sourceforge.squirrel_sql.fw.dialects.AxionDialectExt",
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
      "net.sourceforge.squirrel_sql.fw.sql.JDBCTypeMapper",
      "net.sourceforge.squirrel_sql.plugins.dbcopy.ColTypeMapper",
      "net.sourceforge.squirrel_sql.fw.id.IntegerIdentifierFactory",
      "net.sourceforge.squirrel_sql.fw.id.IntegerIdentifier",
      "net.sourceforge.squirrel_sql.fw.util.Resources",
      "net.sourceforge.squirrel_sql.fw.resources.LibraryResources",
      "net.sourceforge.squirrel_sql.fw.sql.DatabaseObjectType",
      "net.sourceforge.squirrel_sql.client.plugin.DefaultPlugin",
      "net.sourceforge.squirrel_sql.client.plugin.DefaultSessionPlugin",
      "net.sourceforge.squirrel_sql.plugins.dbcopy.DBCopyPlugin",
      "net.sourceforge.squirrel_sql.client.util.ApplicationFileWrappersImpl",
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
      "net.sourceforge.squirrel_sql.plugins.dbcopy.DBCopyPlugin$2",
      "net.sourceforge.squirrel_sql.fw.gui.GUIUtils",
      "net.sourceforge.squirrel_sql.fw.sql.DatabaseObjectInfo",
      "net.sourceforge.squirrel_sql.fw.sql.TableColumnInfo",
      "net.sourceforge.squirrel_sql.client.Version",
      "net.sourceforge.squirrel_sql.client.session.schemainfo.SchemaInfo",
      "net.sourceforge.squirrel_sql.client.session.event.SessionAdapter",
      "net.sourceforge.squirrel_sql.client.session.schemainfo.SchemaInfo$1",
      "com.gargoylesoftware.base.resource.jdbc.ConnectionWrapper",
      "com.gargoylesoftware.base.resource.jdbc.StatementWrapper",
      "com.gargoylesoftware.base.resource.jdbc.PreparedStatementWrapper",
      "com.gargoylesoftware.base.resource.jdbc.CallableStatementWrapper",
      "net.sourceforge.squirrel_sql.fw.sql.ForeignKeyInfo",
      "net.sourceforge.squirrel_sql.fw.util.FileWrapperImpl",
      "net.sourceforge.squirrel_sql.fw.sql.IndexInfo",
      "net.sourceforge.squirrel_sql.client.gui.db.SQLAlias",
      "net.sourceforge.squirrel_sql.fw.sql.SQLDriverPropertyCollection",
      "net.sourceforge.squirrel_sql.client.gui.db.SQLAliasSchemaProperties",
      "net.sourceforge.squirrel_sql.client.gui.db.SQLAliasColorProperties",
      "net.sourceforge.squirrel_sql.client.gui.db.SQLAliasConnectionProperties",
      "net.sourceforge.squirrel_sql.fw.sql.SQLDriver",
      "net.sourceforge.squirrel_sql.fw.sql.SQLConnection",
      "net.sourceforge.squirrel_sql.client.session.schemainfo.CaseInsensitiveString",
      "net.sourceforge.squirrel_sql.plugins.dbcopy.DBCopyPlugin$1",
      "net.sourceforge.squirrel_sql.plugins.dbcopy.prefs.DBCopyPreferenceBean",
      "net.sourceforge.squirrel_sql.fw.sql.TableInfo",
      "net.sourceforge.squirrel_sql.fw.xml.XMLBeanWriter",
      "net.n3.nanoxml.XMLElement",
      "net.n3.nanoxml.XMLWriter",
      "net.sourceforge.squirrel_sql.fw.sql.ProcedureInfo",
      "net.sourceforge.squirrel_sql.plugins.dbcopy.gui.DBCopyGlobalPreferencesTab",
      "net.sourceforge.squirrel_sql.plugins.dbcopy.gui.PreferencesPanel",
      "net.sourceforge.squirrel_sql.plugins.dbcopy.gui.PreferencesPanel$1",
      "net.sourceforge.squirrel_sql.plugins.dbcopy.gui.PreferencesPanel$2",
      "net.sourceforge.squirrel_sql.plugins.dbcopy.gui.PreferencesPanel$3",
      "net.sourceforge.squirrel_sql.plugins.dbcopy.gui.PreferencesPanel$4",
      "net.sourceforge.squirrel_sql.plugins.dbcopy.gui.PreferencesPanel$5",
      "net.sourceforge.squirrel_sql.client.plugin.PluginResources",
      "net.sourceforge.squirrel_sql.plugins.dbcopy.DBCopyPluginResources",
      "net.sourceforge.squirrel_sql.fw.xml.XMLBeanReader",
      "net.sourceforge.squirrel_sql.client.plugin.PreferenceUtil",
      "net.sourceforge.squirrel_sql.fw.id.UidIdentifier",
      "net.sourceforge.squirrel_sql.fw.sql.PrimaryKeyInfo",
      "net.sourceforge.squirrel_sql.fw.gui.FontInfo",
      "net.sourceforge.squirrel_sql.client.session.properties.SessionProperties",
      "net.sourceforge.squirrel_sql.client.session.properties.SessionProperties$IDataSetDestinations",
      "net.sourceforge.squirrel_sql.fw.util.PropertyChangeReporter",
      "net.sourceforge.squirrel_sql.client.session.schemainfo.FilterMatcher",
      "net.sourceforge.squirrel_sql.client.session.schemainfo.ObjFilterMatcher",
      "net.sourceforge.squirrel_sql.client.session.schemainfo.SchemaInfo$10",
      "net.sourceforge.squirrel_sql.fw.sql.SQLDatabaseMetaData",
      "net.sourceforge.squirrel_sql.fw.sql.SQLDriverProperty",
      "org.jfree.data.time.RegularTimePeriod",
      "org.jfree.data.time.Quarter",
      "com.gargoylesoftware.base.resource.jdbc.DatabaseMetaDataWrapper",
      "net.sourceforge.squirrel_sql.fw.util.BaseException",
      "net.sourceforge.squirrel_sql.client.plugin.PluginException",
      "net.sourceforge.squirrel_sql.fw.sql.ProgressCallBackAdaptor",
      "org.hibernate.jdbc.ColumnNameCache",
      "org.hibernate.jdbc.ResultSetWrapper",
      "net.sourceforge.squirrel_sql.fw.util.beanwrapper.StringWrapper",
      "net.sourceforge.squirrel_sql.client.session.schemainfo.SchemaInfoCacheSerializer",
      "org.jfree.date.SerialDate",
      "net.sourceforge.squirrel_sql.fw.persist.ValidationException",
      "net.sourceforge.squirrel_sql.fw.sql.SQLDriver$IStrings",
      "net.sourceforge.squirrel_sql.client.gui.db.SQLAlias$IStrings"
    );
  }
}
