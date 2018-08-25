/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Aug 07 14:19:38 GMT 2018
 */

package com.liferay.portal.security.pacl.checker;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class BaseChecker_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.liferay.portal.security.pacl.checker.BaseChecker"; 
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
    java.lang.System.setProperty("user.dir", "/home/ubuntu/evosuite_readability_gen/projects/108_liferay"); 
    java.lang.System.setProperty("user.home", "/home/ubuntu"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "ubuntu"); 
    java.lang.System.setProperty("user.timezone", "Etc/UTC"); 
    java.lang.System.setProperty("log4j.configuration", "SUT.log4j.properties"); 
    java.lang.System.setProperty("sun.arch.data.model", "64"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(BaseChecker_ESTest_scaffolding.class.getClassLoader() ,
      "net.sf.jsqlparser.statement.drop.Drop",
      "com.liferay.portal.security.pacl.checker.PortalHookChecker",
      "net.sf.jsqlparser.parser.JSqlParser",
      "net.sf.jsqlparser.statement.truncate.Truncate",
      "com.liferay.portal.security.pacl.checker.RuntimeChecker",
      "com.liferay.portal.kernel.log.Log",
      "com.liferay.portal.security.pacl.checker.SocketChecker",
      "com.liferay.portal.kernel.log.LogFactory",
      "com.liferay.portal.security.pacl.checker.DefaultRejectChecker",
      "com.liferay.portal.kernel.log.Jdk14LogFactoryImpl",
      "com.liferay.portal.security.pacl.checker.PortalRuntimeChecker",
      "com.liferay.portal.kernel.log.LogWrapper",
      "net.sf.jsqlparser.statement.update.Update",
      "com.liferay.portal.kernel.log.LogFactoryUtil",
      "net.sf.jsqlparser.schema.Table",
      "com.liferay.portal.security.pacl.PACLPolicy",
      "com.liferay.portal.security.pacl.checker.NetChecker",
      "com.liferay.portal.security.pacl.checker.SQLChecker",
      "net.sf.jsqlparser.statement.select.FromItem",
      "com.liferay.portal.security.pacl.checker.BaseChecker",
      "com.liferay.portal.kernel.util.Validator",
      "net.sf.jsqlparser.statement.create.table.CreateTable",
      "com.liferay.portal.kernel.log.Jdk14LogImpl",
      "com.liferay.portal.kernel.util.ServerDetector",
      "net.sf.jsqlparser.statement.select.Select",
      "net.sf.jsqlparser.statement.Statement",
      "net.sf.jsqlparser.statement.replace.Replace",
      "com.liferay.portal.security.pacl.checker.Checker",
      "com.liferay.portal.security.pacl.checker.PortalServiceChecker",
      "com.liferay.portal.security.pacl.checker.BaseReflectChecker",
      "com.liferay.portal.security.pacl.checker.PortalMessageBusChecker",
      "net.sf.jsqlparser.statement.insert.Insert",
      "com.liferay.portal.kernel.security.pacl.PACLConstants",
      "net.sf.jsqlparser.statement.delete.Delete"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(BaseChecker_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.liferay.portal.kernel.log.Jdk14LogFactoryImpl",
      "com.liferay.portal.kernel.log.LogFactoryUtil",
      "com.liferay.portal.kernel.log.LogWrapper",
      "com.liferay.portal.kernel.log.Jdk14LogImpl",
      "com.liferay.portal.security.pacl.checker.BaseChecker",
      "com.liferay.portal.kernel.util.ServerDetector",
      "com.liferay.portal.kernel.util.CentralizedThreadLocal$ThreadLocalMapThreadLocal",
      "com.liferay.portal.kernel.util.CentralizedThreadLocal",
      "com.liferay.portal.kernel.util.InitialThreadLocal",
      "com.liferay.portal.kernel.util.AutoResetThreadLocal",
      "com.liferay.portal.security.lang.PortalSecurityManagerThreadLocal",
      "org.springframework.transaction.annotation.Isolation",
      "org.springframework.transaction.annotation.Propagation",
      "com.liferay.portal.security.pacl.checker.FileChecker",
      "com.liferay.portal.kernel.util.SystemEnv",
      "com.liferay.portal.kernel.util.GetterUtil",
      "com.liferay.portal.kernel.util.PropertiesUtil",
      "com.liferay.portal.kernel.util.SystemProperties",
      "com.liferay.portal.kernel.util.StringUtil",
      "com.liferay.portal.kernel.util.ClassUtil",
      "com.liferay.portal.kernel.util.StringBundler",
      "com.liferay.portal.kernel.servlet.WebDirDetector",
      "com.liferay.portal.configuration.ConfigurationImpl",
      "org.apache.log4j.Level",
      "org.apache.log4j.Priority",
      "org.apache.commons.logging.impl.Log4JLogger",
      "org.apache.log4j.Category",
      "org.apache.log4j.Logger",
      "org.apache.log4j.Hierarchy",
      "org.apache.log4j.spi.RootLogger",
      "org.apache.log4j.or.DefaultRenderer",
      "org.apache.log4j.or.RendererMap",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.PropertyConfigurator",
      "org.apache.log4j.LogManager",
      "org.apache.log4j.CategoryKey",
      "org.apache.log4j.ProvisionNode",
      "com.germinus.easyconf.ComponentConfiguration",
      "com.liferay.portal.configuration.easyconf.ClassLoaderComponentConfiguration",
      "com.germinus.easyconf.ConfigurationSerializer",
      "com.thoughtworks.xstream.XStream",
      "com.thoughtworks.xstream.io.AbstractDriver",
      "com.thoughtworks.xstream.io.xml.AbstractXmlDriver",
      "com.thoughtworks.xstream.io.xml.AbstractXppDriver",
      "com.thoughtworks.xstream.io.xml.XppDriver",
      "com.thoughtworks.xstream.io.xml.XmlFriendlyNameCoder$1IntPairList",
      "com.thoughtworks.xstream.io.xml.XmlFriendlyNameCoder$IntPair",
      "com.thoughtworks.xstream.io.xml.XmlFriendlyNameCoder",
      "com.thoughtworks.xstream.core.util.WeakCache",
      "com.thoughtworks.xstream.core.util.ClassLoaderReference",
      "com.thoughtworks.xstream.core.util.CompositeClassLoader",
      "com.thoughtworks.xstream.core.DefaultConverterLookup",
      "com.thoughtworks.xstream.core.util.PrioritizedList",
      "com.thoughtworks.xstream.core.JVM$1",
      "com.thoughtworks.xstream.core.util.PresortedMap",
      "com.thoughtworks.xstream.core.util.PresortedMap$ArraySet",
      "com.thoughtworks.xstream.core.util.PresortedMap$1",
      "com.thoughtworks.xstream.core.util.PresortedSet",
      "com.thoughtworks.xstream.core.JVM",
      "com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider",
      "com.thoughtworks.xstream.converters.reflection.Sun14ReflectionProvider",
      "com.thoughtworks.xstream.converters.reflection.FieldDictionary",
      "com.thoughtworks.xstream.converters.reflection.ImmutableFieldKeySorter",
      "com.thoughtworks.xstream.mapper.DefaultMapper",
      "com.thoughtworks.xstream.mapper.MapperWrapper",
      "com.thoughtworks.xstream.mapper.DynamicProxyMapper",
      "com.thoughtworks.xstream.mapper.PackageAliasingMapper$1",
      "com.thoughtworks.xstream.mapper.PackageAliasingMapper",
      "com.thoughtworks.xstream.mapper.ClassAliasingMapper",
      "com.thoughtworks.xstream.mapper.FieldAliasingMapper",
      "com.thoughtworks.xstream.mapper.AbstractAttributeAliasingMapper",
      "com.thoughtworks.xstream.mapper.AttributeAliasingMapper",
      "com.thoughtworks.xstream.mapper.SystemAttributeAliasingMapper",
      "com.thoughtworks.xstream.mapper.ImplicitCollectionMapper",
      "com.thoughtworks.xstream.mapper.OuterClassMapper",
      "com.thoughtworks.xstream.mapper.ArrayMapper",
      "com.thoughtworks.xstream.mapper.DefaultImplementationsMapper",
      "com.thoughtworks.xstream.mapper.AttributeMapper",
      "com.thoughtworks.xstream.core.util.CompositeClassLoader$1",
      "com.thoughtworks.xstream.mapper.EnumMapper",
      "com.thoughtworks.xstream.mapper.LocalConversionMapper",
      "com.thoughtworks.xstream.mapper.ImmutableTypesMapper",
      "com.thoughtworks.xstream.mapper.AnnotationMapper",
      "com.thoughtworks.xstream.mapper.CachingMapper",
      "com.thoughtworks.xstream.converters.reflection.AbstractReflectionConverter",
      "com.thoughtworks.xstream.converters.reflection.ReflectionConverter",
      "com.thoughtworks.xstream.converters.reflection.SerializationMethodInvoker$1",
      "com.thoughtworks.xstream.core.util.FastField",
      "com.thoughtworks.xstream.converters.reflection.SerializationMethodInvoker",
      "com.thoughtworks.xstream.core.util.PrioritizedList$PrioritizedItem",
      "com.thoughtworks.xstream.converters.reflection.SerializableConverter",
      "com.thoughtworks.xstream.converters.reflection.ReflectionProviderWrapper",
      "com.thoughtworks.xstream.converters.reflection.SerializableConverter$UnserializableParentsReflectionProvider",
      "com.thoughtworks.xstream.converters.reflection.ExternalizableConverter",
      "com.thoughtworks.xstream.converters.basic.NullConverter",
      "com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter",
      "com.thoughtworks.xstream.converters.basic.IntConverter",
      "com.thoughtworks.xstream.converters.SingleValueConverterWrapper",
      "com.thoughtworks.xstream.converters.basic.FloatConverter",
      "com.thoughtworks.xstream.converters.basic.DoubleConverter",
      "com.thoughtworks.xstream.converters.basic.LongConverter",
      "com.thoughtworks.xstream.converters.basic.ShortConverter",
      "com.thoughtworks.xstream.converters.basic.CharConverter",
      "com.thoughtworks.xstream.converters.basic.BooleanConverter",
      "com.thoughtworks.xstream.converters.basic.ByteConverter",
      "com.thoughtworks.xstream.converters.basic.StringConverter",
      "com.thoughtworks.xstream.converters.basic.StringBufferConverter",
      "com.thoughtworks.xstream.converters.basic.DateConverter",
      "com.thoughtworks.xstream.core.util.ThreadSafeSimpleDateFormat",
      "com.thoughtworks.xstream.core.util.Pool",
      "com.thoughtworks.xstream.core.util.ThreadSafeSimpleDateFormat$1",
      "com.thoughtworks.xstream.converters.collections.BitSetConverter",
      "com.thoughtworks.xstream.converters.basic.URIConverter",
      "com.thoughtworks.xstream.converters.basic.URLConverter",
      "com.thoughtworks.xstream.converters.basic.BigIntegerConverter",
      "com.thoughtworks.xstream.converters.basic.BigDecimalConverter",
      "com.thoughtworks.xstream.converters.collections.AbstractCollectionConverter",
      "com.thoughtworks.xstream.converters.collections.ArrayConverter",
      "com.thoughtworks.xstream.converters.collections.CharArrayConverter",
      "com.thoughtworks.xstream.converters.collections.CollectionConverter",
      "com.thoughtworks.xstream.converters.collections.MapConverter",
      "com.thoughtworks.xstream.mapper.Mapper$Null",
      "com.thoughtworks.xstream.converters.collections.TreeMapConverter$NullComparator",
      "com.thoughtworks.xstream.converters.collections.TreeMapConverter",
      "com.thoughtworks.xstream.converters.collections.TreeSetConverter",
      "com.thoughtworks.xstream.converters.collections.TreeSetConverter$1",
      "com.thoughtworks.xstream.converters.collections.SingletonCollectionConverter",
      "com.thoughtworks.xstream.converters.collections.SingletonMapConverter",
      "com.thoughtworks.xstream.core.util.Fields",
      "com.thoughtworks.xstream.converters.collections.PropertiesConverter",
      "com.thoughtworks.xstream.core.util.Base64Encoder",
      "com.thoughtworks.xstream.converters.extended.EncodedByteArrayConverter",
      "com.thoughtworks.xstream.converters.extended.FileConverter",
      "com.thoughtworks.xstream.converters.extended.SqlTimestampConverter",
      "com.thoughtworks.xstream.converters.extended.SqlTimeConverter",
      "com.thoughtworks.xstream.converters.extended.SqlDateConverter",
      "com.thoughtworks.xstream.converters.extended.DynamicProxyConverter$1",
      "com.thoughtworks.xstream.converters.extended.DynamicProxyConverter",
      "com.thoughtworks.xstream.converters.extended.JavaClassConverter",
      "com.thoughtworks.xstream.converters.extended.JavaMethodConverter",
      "com.thoughtworks.xstream.converters.extended.JavaFieldConverter",
      "com.thoughtworks.xstream.converters.extended.FontConverter",
      "com.thoughtworks.xstream.converters.extended.ColorConverter",
      "com.thoughtworks.xstream.converters.reflection.AbstractAttributedCharacterIteratorAttributeConverter",
      "com.thoughtworks.xstream.converters.extended.TextAttributeConverter",
      "com.thoughtworks.xstream.core.util.OrderRetainingMap",
      "com.thoughtworks.xstream.core.util.OrderRetainingMap$ArraySet",
      "com.thoughtworks.xstream.converters.reflection.FieldKey",
      "com.thoughtworks.xstream.converters.extended.LookAndFeelConverter",
      "com.thoughtworks.xstream.converters.extended.LocaleConverter",
      "com.thoughtworks.xstream.converters.extended.GregorianCalendarConverter",
      "com.thoughtworks.xstream.converters.extended.SubjectConverter",
      "com.thoughtworks.xstream.converters.extended.ThrowableConverter",
      "com.thoughtworks.xstream.converters.extended.StackTraceElementFactory",
      "com.thoughtworks.xstream.converters.extended.StackTraceElementConverter",
      "com.thoughtworks.xstream.converters.extended.CurrencyConverter",
      "com.thoughtworks.xstream.converters.extended.RegexPatternConverter",
      "com.thoughtworks.xstream.converters.extended.CharsetConverter",
      "com.thoughtworks.xstream.converters.extended.DurationConverter",
      "com.thoughtworks.xstream.converters.extended.DurationConverter$1",
      "com.thoughtworks.xstream.converters.enums.EnumConverter",
      "com.thoughtworks.xstream.converters.enums.EnumSetConverter",
      "com.thoughtworks.xstream.converters.enums.EnumMapConverter",
      "com.thoughtworks.xstream.converters.basic.StringBuilderConverter",
      "com.thoughtworks.xstream.converters.basic.UUIDConverter",
      "com.thoughtworks.xstream.converters.reflection.SelfStreamingInstanceChecker",
      "com.thoughtworks.xstream.core.AbstractTreeMarshallingStrategy",
      "com.thoughtworks.xstream.core.ReferenceByXPathMarshallingStrategy",
      "com.germinus.easyconf.XstreamSerializer",
      "com.germinus.easyconf.ConfigurationLoader",
      "org.apache.commons.configuration.event.EventSource",
      "org.apache.commons.configuration.AbstractConfiguration",
      "org.apache.commons.configuration.CompositeConfiguration",
      "com.germinus.easyconf.AggregatedProperties",
      "com.liferay.portal.configuration.easyconf.ClassLoaderAggregateProperties",
      "org.apache.commons.logging.impl.NoOpLog",
      "org.apache.commons.configuration.BaseConfiguration",
      "org.apache.commons.collections.map.AbstractHashedMap",
      "org.apache.commons.collections.map.AbstractLinkedMap",
      "org.apache.commons.collections.map.LinkedMap",
      "org.apache.commons.collections.map.AbstractHashedMap$HashEntry",
      "org.apache.commons.collections.map.AbstractLinkedMap$LinkEntry",
      "org.apache.commons.configuration.MapConfiguration",
      "org.apache.commons.configuration.SystemConfiguration",
      "org.apache.commons.configuration.SubsetConfiguration",
      "com.liferay.portal.kernel.util.CentralizedThreadLocal$ThreadLocalMap",
      "com.liferay.portal.kernel.util.CentralizedThreadLocal$Entry",
      "com.germinus.easyconf.DatasourceURL",
      "com.germinus.easyconf.JndiURL",
      "org.apache.commons.configuration.AbstractFileConfiguration",
      "org.apache.commons.configuration.PropertiesConfiguration",
      "org.apache.commons.configuration.reloading.InvariantReloadingStrategy",
      "org.apache.commons.configuration.AbstractConfiguration$2",
      "org.apache.commons.configuration.ConfigurationUtils",
      "org.apache.commons.lang.StringUtils",
      "org.apache.commons.lang.exception.NestableException",
      "org.apache.commons.configuration.ConfigurationException",
      "org.apache.commons.lang.exception.NestableDelegate",
      "org.apache.commons.configuration.PropertiesConfigurationLayout",
      "org.apache.commons.configuration.PropertiesConfiguration$PropertiesReader",
      "org.apache.commons.lang.ArrayUtils",
      "org.apache.commons.lang.StringEscapeUtils",
      "org.apache.commons.lang.text.StrBuilder",
      "org.apache.commons.configuration.PropertyConverter",
      "org.apache.commons.collections.iterators.SingletonIterator",
      "org.apache.commons.configuration.PropertiesConfigurationLayout$PropertyLayoutData",
      "org.apache.commons.collections.iterators.AbstractEmptyIterator",
      "org.apache.commons.collections.iterators.EmptyIterator",
      "org.apache.commons.collections.iterators.EmptyListIterator",
      "org.apache.commons.collections.iterators.EmptyOrderedIterator",
      "org.apache.commons.collections.iterators.EmptyMapIterator",
      "org.apache.commons.collections.iterators.EmptyOrderedMapIterator",
      "org.apache.commons.collections.IteratorUtils",
      "com.liferay.portal.kernel.util.ArrayUtil",
      "com.germinus.easyconf.ComponentProperties",
      "com.liferay.portal.util.PropsUtil",
      "com.liferay.portal.kernel.util.Validator",
      "com.liferay.portal.util.PropsValues",
      "com.liferay.portal.security.pacl.checker.BaseReflectChecker",
      "com.liferay.portal.security.pacl.checker.RuntimeChecker",
      "com.liferay.portal.security.pacl.checker.PortalHookChecker",
      "com.liferay.portal.security.pacl.checker.SecurityChecker",
      "com.liferay.portal.security.pacl.checker.PortalRuntimeChecker",
      "com.liferay.portal.security.pacl.checker.NetChecker",
      "com.liferay.portal.security.pacl.checker.MBeanChecker",
      "org.bouncycastle.jce.provider.BouncyCastleProvider",
      "org.bouncycastle.jce.provider.BouncyCastleProvider$1",
      "org.bouncycastle.jce.provider.symmetric.AESMappings",
      "org.bouncycastle.asn1.ASN1Encodable",
      "org.bouncycastle.asn1.DERObject",
      "org.bouncycastle.asn1.ASN1Object",
      "org.bouncycastle.asn1.DERObjectIdentifier",
      "org.bouncycastle.asn1.nist.NISTObjectIdentifiers",
      "org.bouncycastle.jce.provider.symmetric.CamelliaMappings",
      "org.bouncycastle.asn1.ntt.NTTObjectIdentifiers",
      "org.bouncycastle.jce.provider.symmetric.CAST5Mappings",
      "org.bouncycastle.jce.provider.symmetric.Grainv1Mappings",
      "org.bouncycastle.jce.provider.symmetric.Grain128Mappings",
      "org.bouncycastle.jce.provider.symmetric.NoekeonMappings",
      "org.bouncycastle.jce.provider.symmetric.SEEDMappings",
      "org.bouncycastle.asn1.kisa.KISAObjectIdentifiers",
      "org.bouncycastle.jce.provider.asymmetric.ECMappings",
      "org.bouncycastle.asn1.x9.X9ObjectIdentifiers",
      "org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers",
      "org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers",
      "org.bouncycastle.asn1.eac.EACObjectIdentifiers",
      "org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers",
      "org.bouncycastle.asn1.oiw.OIWObjectIdentifiers",
      "org.bouncycastle.asn1.bc.BCObjectIdentifiers",
      "org.bouncycastle.asn1.iana.IANAObjectIdentifiers",
      "com.liferay.portal.security.pacl.BasePACLPolicy",
      "com.liferay.portal.security.pacl.ActivePACLPolicy",
      "com.liferay.portal.kernel.util.PropsUtil",
      "com.liferay.portal.kernel.security.pacl.permission.PortalRuntimePermission",
      "com.liferay.portal.security.pacl.checker.JNDIChecker",
      "com.liferay.portal.kernel.util.SetUtil",
      "com.liferay.portal.security.pacl.checker.PortalServiceChecker",
      "com.liferay.portal.security.pacl.checker.SQLChecker",
      "net.sf.jsqlparser.parser.CCJSqlParserManager",
      "com.liferay.portal.security.pacl.checker.PortalMessageBusChecker",
      "com.liferay.portal.security.pacl.InactivePACLPolicy",
      "com.liferay.portal.security.pacl.checker.SocketChecker",
      "org.bouncycastle.asn1.x509.X509CertificateStructure",
      "com.liferay.portal.security.pacl.checker.ReflectChecker",
      "com.liferay.portal.kernel.util.JavaDetector",
      "com.liferay.portal.security.pacl.checker.DefaultAcceptChecker",
      "org.hsqldb.jdbc.JDBCDriver",
      "org.postgresql.core.Logger",
      "org.postgresql.Driver",
      "org.apache.derby.jdbc.AutoloadedDriver",
      "com.liferay.portal.security.pacl.checker.DefaultRejectChecker",
      "org.bouncycastle.asn1.ASN1Sequence",
      "org.bouncycastle.asn1.DERSequence",
      "org.bouncycastle.asn1.BERSequence",
      "org.testng.internal.annotations.JDK15AnnotationFinder",
      "org.testng.internal.annotations.JDK15TagFactory$1",
      "org.testng.internal.annotations.JDK15TagFactory$2",
      "org.testng.internal.annotations.JDK15TagFactory",
      "org.testng.collections.Maps",
      "org.testng.internal.Configuration",
      "org.testng.internal.annotations.DefaultAnnotationTransformer",
      "org.testng.log4testng.Logger",
      "org.testng.internal.AnnotationTypeEnum",
      "org.testng.xml.XmlSuite",
      "org.testng.internal.version.VersionInfo",
      "org.testng.collections.Lists",
      "org.testng.SuiteRunner",
      "org.testng.TestListenerAdapter",
      "org.testng.SuiteRunState",
      "org.testng.internal.Attributes",
      "org.testng.SuiteRunner$DefaultTestRunnerFactory",
      "org.testng.junit.JUnitUtils$JUnitTestClass",
      "org.testng.TestRunner",
      "org.testng.TestRunner$ConfigurationListener",
      "org.testng.internal.TestNGProperty",
      "org.testng.internal.Constants",
      "org.testng.internal.XmlMethodSelector",
      "org.testng.internal.ResultMap",
      "org.testng.internal.RunInfo",
      "net.sf.jsqlparser.statement.replace.Replace",
      "net.sf.jsqlparser.test.tablesfinder.TablesNamesFinder",
      "com.liferay.portal.security.pacl.checker.SQLChecker$TableNamesFinder",
      "net.sf.jsqlparser.parser.CCJSqlParser",
      "net.sf.jsqlparser.parser.CCJSqlParser$LookaheadSuccess",
      "net.sf.jsqlparser.parser.SimpleCharStream",
      "net.sf.jsqlparser.parser.CCJSqlParserTokenManager",
      "net.sf.jsqlparser.parser.Token",
      "net.sf.jsqlparser.parser.CCJSqlParser$JJCalls",
      "net.sf.jsqlparser.parser.ParseException",
      "net.sf.jsqlparser.parser.CCJSqlParserConstants",
      "net.sf.jsqlparser.JSQLParserException",
      "net.sf.jsqlparser.statement.select.Select",
      "net.sf.jsqlparser.statement.delete.Delete",
      "net.sf.jsqlparser.statement.create.table.CreateTable",
      "org.testng.junit.JUnitUtils$JUnitTestMethod",
      "com.liferay.portal.kernel.util.ReflectionUtil",
      "com.liferay.portal.kernel.util.ProxyUtil",
      "com.liferay.portal.kernel.memory.EqualityWeakReference",
      "com.liferay.portal.security.pacl.PACLClassLoaderUtil",
      "com.liferay.portal.security.pacl.PACLPolicyManager",
      "org.geotools.factory.Hints$Key",
      "org.geotools.factory.Hints$ClassKey",
      "org.geotools.factory.Hints$FileKey",
      "org.geotools.factory.Hints$DataSourceKey",
      "org.geotools.factory.Hints$OptionKey",
      "org.geotools.factory.Hints$IntegerKey",
      "org.geotools.factory.Hints$DoubleKey",
      "org.geotools.factory.Hints",
      "net.sf.jsqlparser.statement.update.Update",
      "net.sf.jsqlparser.statement.truncate.Truncate",
      "net.sf.jsqlparser.statement.insert.Insert",
      "net.sf.jsqlparser.schema.Table",
      "org.bouncycastle.jce.provider.X509CertificateObject",
      "org.bouncycastle.jce.provider.PKCS12BagAttributeCarrierImpl",
      "net.sf.jsqlparser.statement.drop.Drop",
      "org.testng.internal.TestResult",
      "org.testng.SuiteRunner$ProxyTestRunnerFactory",
      "org.testng.xml.XmlTest",
      "org.testng.TestNG",
      "org.testng.InstanceOrderingMethodInterceptor",
      "org.testng.internal.Invoker",
      "org.testng.internal.Utils$1",
      "org.testng.internal.Utils",
      "org.testng.internal.MethodSelectorDescriptor",
      "org.testng.internal.ClassInfoMap",
      "org.testng.internal.BaseClassFinder",
      "org.testng.internal.TestNGClassFinder",
      "org.testng.internal.ObjectFactoryImpl",
      "org.testng.internal.TestNGMethodFinder",
      "org.testng.internal.MethodGroupsHelper",
      "org.testng.internal.MethodHelper",
      "org.testng.internal.Graph",
      "org.testng.ClassMethodMap",
      "org.testng.internal.ConfigurationGroupMethods",
      "org.jfree.data.xy.XYDatasetTableModel",
      "org.bouncycastle.asn1.ASN1TaggedObject",
      "org.bouncycastle.asn1.DERTaggedObject",
      "org.testng.xml.XmlClass",
      "org.testng.internal.ClassHelper",
      "org.testng.TestNGException",
      "org.bouncycastle.asn1.DERUTCTime",
      "net.sf.jsqlparser.statement.select.PlainSelect",
      "org.bouncycastle.asn1.DERT61String",
      "org.bouncycastle.asn1.BERTaggedObject",
      "org.bouncycastle.asn1.DERBMPString",
      "org.bouncycastle.asn1.x509.X509ObjectIdentifiers",
      "org.bouncycastle.asn1.DERBitString",
      "org.bouncycastle.asn1.DEROutputStream",
      "org.bouncycastle.asn1.OIDTokenizer",
      "org.bouncycastle.asn1.DEREncodableVector",
      "org.bouncycastle.asn1.ASN1EncodableVector",
      "net.sf.jsqlparser.util.deparser.StatementDeParser",
      "net.sf.jsqlparser.util.deparser.CreateTableDeParser",
      "org.bouncycastle.asn1.DERPrintableString",
      "org.bouncycastle.asn1.DERConstructedSequence",
      "net.sf.jsqlparser.expression.operators.relational.ExpressionList",
      "net.sf.jsqlparser.parser.TokenMgrError",
      "org.testng.internal.NoOpTestClass",
      "org.testng.junit.JUnitUtils",
      "org.bouncycastle.asn1.ASN1Null",
      "org.bouncycastle.asn1.DERNull",
      "org.bouncycastle.asn1.BERNull",
      "net.sf.jsqlparser.expression.InverseExpression",
      "org.bouncycastle.asn1.BERConstructedSequence",
      "net.sf.jsqlparser.expression.Function",
      "org.bouncycastle.asn1.DERBoolean",
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.data.general.AbstractSeriesDataset",
      "org.jfree.data.xy.AbstractXYDataset",
      "org.jfree.data.jdbc.JDBCXYDataset",
      "org.jfree.data.general.DatasetGroup",
      "org.bouncycastle.asn1.ASN1OctetString",
      "org.bouncycastle.asn1.DEROctetString",
      "org.bouncycastle.asn1.BERConstructedOctetString",
      "org.bouncycastle.asn1.DERInteger",
      "org.bouncycastle.asn1.DERExternal",
      "org.bouncycastle.asn1.DERUTF8String",
      "org.bouncycastle.asn1.DERVisibleString",
      "net.sf.jsqlparser.util.deparser.SelectDeParser",
      "net.sf.jsqlparser.util.deparser.ExpressionDeParser",
      "org.bouncycastle.asn1.DERIA5String",
      "net.sf.jsqlparser.expression.NullValue",
      "net.sf.jsqlparser.util.deparser.DeleteDeParser",
      "org.testng.internal.ClonedMethod",
      "org.jgroups.util.DefaultThreadFactory",
      "net.sf.jsqlparser.statement.select.Union",
      "org.bouncycastle.asn1.ASN1Set",
      "org.bouncycastle.asn1.DERSet",
      "org.bouncycastle.asn1.BERSet",
      "org.bouncycastle.asn1.ASN1OutputStream",
      "org.jfree.data.xy.AbstractIntervalXYDataset",
      "org.jfree.data.time.TimeTableXYDataset",
      "org.jfree.data.DefaultKeyedValues2D",
      "org.jfree.data.time.TimePeriodAnchor",
      "net.sf.jsqlparser.expression.LongValue",
      "org.jgroups.util.LazyThreadFactory",
      "org.jfree.data.xy.DefaultTableXYDataset",
      "org.jfree.data.xy.IntervalXYDelegate",
      "org.bouncycastle.asn1.ASN1InputStream",
      "net.sf.jsqlparser.util.deparser.InsertDeParser",
      "org.bouncycastle.asn1.DERUnknownTag",
      "aQute.lib.osgi.Instruction",
      "aQute.libg.generics.Create",
      "org.bouncycastle.asn1.DERApplicationSpecific",
      "org.bouncycastle.asn1.BERApplicationSpecific"
    );
  }
}