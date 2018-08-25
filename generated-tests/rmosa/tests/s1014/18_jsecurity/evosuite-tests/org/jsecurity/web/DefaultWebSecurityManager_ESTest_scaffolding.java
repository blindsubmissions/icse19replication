/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Aug 23 11:50:00 GMT 2018
 */

package org.jsecurity.web;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class DefaultWebSecurityManager_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.jsecurity.web.DefaultWebSecurityManager"; 
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
    java.lang.System.setProperty("user.dir", "/home/ubuntu/evosuite_readability_gen/projects/18_jsecurity"); 
    java.lang.System.setProperty("user.home", "/home/ubuntu"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "ubuntu"); 
    java.lang.System.setProperty("user.timezone", "Etc/UTC"); 
    java.lang.System.setProperty("log4j.configuration", "SUT.log4j.properties"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(DefaultWebSecurityManager_ESTest_scaffolding.class.getClassLoader() ,
      "org.jsecurity.web.attr.WebAttribute",
      "org.jsecurity.codec.CodecException",
      "org.jsecurity.authc.IncorrectCredentialsException",
      "org.jsecurity.util.PermissionUtils",
      "org.jsecurity.cache.HashtableCache",
      "net.sf.ehcache.config.ConfigurationHelper",
      "net.sf.ehcache.util.PropertyUtil",
      "org.jsecurity.session.mgt.eis.SessionDAO",
      "org.jsecurity.authc.Account",
      "org.jsecurity.authc.AuthenticationToken",
      "org.apache.log4j.Level",
      "org.jsecurity.authc.SimpleAuthenticationInfo",
      "org.jsecurity.authz.AuthorizingAccount",
      "org.jsecurity.authz.SimpleAuthorizationInfo",
      "org.jsecurity.authc.MergableAuthenticationInfo",
      "edu.emory.mathcs.backport.java.util.concurrent.BlockingQueue",
      "org.jsecurity.cache.ehcache.EhCacheManager",
      "org.jsecurity.session.SessionListener",
      "org.jsecurity.authz.Authorizer",
      "net.sf.ehcache.Cache",
      "org.jsecurity.authz.permission.WildcardPermission",
      "org.jsecurity.util.Destroyable",
      "org.jsecurity.session.SessionException",
      "org.jsecurity.web.attr.AbstractWebAttribute",
      "net.sf.ehcache.config.BeanHandler$ElementInfo",
      "org.jsecurity.authc.AccountException",
      "org.jsecurity.subject.MutablePrincipalCollection",
      "org.jsecurity.crypto.BlowfishCipher",
      "net.sf.ehcache.config.Configuration",
      "org.jsecurity.authz.SimpleAuthorizingAccount",
      "org.jsecurity.io.Serializer",
      "org.apache.log4j.Hierarchy",
      "org.jsecurity.subject.AbstractRememberMeManager",
      "net.sf.ehcache.CacheException",
      "org.jsecurity.session.StoppedSessionException",
      "org.jsecurity.authz.UnauthenticatedException",
      "org.jsecurity.authc.Authenticator",
      "org.jsecurity.authc.pam.ModularRealmAuthenticator",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.jsecurity.codec.Base64",
      "net.sf.ehcache.config.CacheConfiguration$CacheExtensionFactoryConfiguration",
      "net.sf.ehcache.store.LruMemoryStore$SpoolingLinkedHashMap",
      "org.jsecurity.authz.SimpleRole",
      "org.jsecurity.authz.Permission",
      "org.jsecurity.web.session.WebSessionManager",
      "org.jsecurity.realm.text.TextConfigurationRealm",
      "org.jsecurity.session.mgt.eis.MemorySessionDAO",
      "org.jsecurity.mgt.AuthorizingSecurityManager",
      "org.apache.log4j.helpers.OptionConverter",
      "org.jsecurity.JSecurityException",
      "net.sf.ehcache.Ehcache",
      "net.sf.ehcache.Status",
      "org.jsecurity.authc.AuthenticationInfo",
      "org.jsecurity.session.mgt.SessionManager",
      "org.jsecurity.session.mgt.AbstractValidatingSessionManager",
      "org.jsecurity.cache.CacheException",
      "org.apache.log4j.or.ObjectRenderer",
      "org.jsecurity.cache.Cache",
      "org.jsecurity.realm.AuthorizingRealm",
      "edu.emory.mathcs.backport.java.util.concurrent.ExecutionException",
      "org.jsecurity.subject.DelegatingSubject",
      "org.apache.log4j.Category",
      "org.jsecurity.authc.LockedAccountException",
      "org.jsecurity.web.DefaultWebSecurityManager",
      "net.sf.ehcache.store.DiskStore$SpoolAndExpiryThread",
      "org.jsecurity.web.attr.RequestParamAttribute",
      "net.sf.ehcache.Element",
      "edu.emory.mathcs.backport.java.util.concurrent.AbstractExecutorService",
      "org.jsecurity.realm.Realm",
      "org.apache.log4j.spi.LoggerFactory",
      "org.apache.log4j.spi.Configurator",
      "org.jsecurity.session.InvalidSessionException",
      "net.sf.ehcache.event.CacheManagerEventListenerRegistry",
      "org.jsecurity.util.CollectionUtils",
      "org.jsecurity.authc.LogoutAware",
      "net.sf.ehcache.event.CacheManagerEventListener",
      "net.sf.ehcache.ObjectExistsException",
      "org.jsecurity.mgt.CachingSecurityManager",
      "org.jsecurity.authz.ModularRealmAuthorizer",
      "org.apache.log4j.PropertyWatchdog",
      "org.jsecurity.realm.AuthenticatingRealm",
      "org.jsecurity.session.mgt.AbstractSessionManager",
      "org.jsecurity.util.Initializable",
      "org.jsecurity.cache.ehcache.EhCache",
      "net.sf.ehcache.store.LfuMemoryStore",
      "net.sf.ehcache.store.LfuPolicy$Metadata",
      "org.jsecurity.authc.pam.AllSuccessfulModularAuthenticationStrategy",
      "org.jsecurity.util.InstantiationException",
      "org.jsecurity.authz.HostUnauthorizedException",
      "org.jsecurity.util.StringUtils",
      "org.jsecurity.authc.UsernamePasswordToken",
      "org.apache.log4j.spi.AppenderAttachable",
      "org.jsecurity.mgt.SessionsSecurityManager",
      "org.jsecurity.authz.AuthorizationInfo",
      "org.jsecurity.io.DefaultSerializer",
      "org.apache.log4j.Priority",
      "org.jsecurity.session.SessionFactory",
      "org.jsecurity.realm.SimpleAccountRealm",
      "org.jsecurity.authc.pam.AbstractAuthenticationStrategy",
      "org.apache.log4j.LogManager",
      "edu.emory.mathcs.backport.java.util.Queue",
      "org.jsecurity.web.WebRememberMeManager",
      "org.jsecurity.crypto.Cipher",
      "net.sf.ehcache.store.DiskStore$DiskElement",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.jsecurity.mgt.AuthenticatingSecurityManager",
      "org.jsecurity.cache.CacheManager",
      "org.jsecurity.subject.Subject",
      "org.jsecurity.authz.permission.PermissionResolverAware",
      "net.sf.ehcache.CacheManager$1",
      "net.sf.ehcache.config.CacheConfiguration$BootstrapCacheLoaderFactoryConfiguration",
      "org.apache.log4j.or.RendererMap",
      "org.jsecurity.authc.ExpiredCredentialsException",
      "org.jsecurity.subject.RememberMeManager",
      "org.jsecurity.util.LifecycleUtils",
      "org.jsecurity.authc.CredentialsException",
      "org.jsecurity.authc.pam.ModularAuthenticationStrategy",
      "net.sf.ehcache.config.DiskStoreConfiguration",
      "net.sf.ehcache.store.Store",
      "net.sf.ehcache.store.MemoryStoreEvictionPolicy",
      "org.jsecurity.authz.permission.PermissionResolver",
      "edu.emory.mathcs.backport.java.util.concurrent.ExecutorService",
      "org.jsecurity.authc.RememberMeAuthenticationToken",
      "org.apache.log4j.CategoryKey",
      "net.sf.ehcache.store.LruMemoryStore",
      "org.jsecurity.cache.CacheManagerAware",
      "org.jsecurity.io.ResourceUtils",
      "net.sf.ehcache.CacheManager",
      "net.sf.ehcache.config.CacheConfiguration$CacheEventListenerFactoryConfiguration",
      "org.jsecurity.util.ThreadContext",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.ProvisionNode",
      "org.jsecurity.session.mgt.ExecutorServiceSessionValidationScheduler",
      "org.jsecurity.authz.permission.WildcardPermissionResolver",
      "net.sf.ehcache.store.DiskStore$1",
      "org.apache.log4j.helpers.FileWatchdog",
      "org.jsecurity.cache.HashtableCacheManager",
      "org.jsecurity.session.UnknownSessionException",
      "org.jsecurity.subject.PrincipalCollection",
      "edu.emory.mathcs.backport.java.util.concurrent.Executor",
      "net.sf.ehcache.store.FifoMemoryStore",
      "org.jsecurity.authz.UnauthorizedException",
      "org.jsecurity.mgt.RealmSecurityManager",
      "net.sf.ehcache.config.CacheConfiguration",
      "org.apache.log4j.spi.RootLogger",
      "org.jsecurity.web.attr.CookieAttribute",
      "org.jsecurity.session.ExpiredSessionException",
      "org.apache.log4j.spi.RendererSupport",
      "org.jsecurity.util.UnknownClassException",
      "org.jsecurity.authc.pam.UnsupportedTokenException",
      "org.jsecurity.util.ThreadContext$1",
      "net.sf.ehcache.config.FactoryConfiguration",
      "org.jsecurity.realm.CachingRealm",
      "org.jsecurity.session.mgt.eis.CachingSessionDAO",
      "net.sf.ehcache.store.DiskStore$MemoryEfficientByteArrayOutputStream",
      "org.jsecurity.authc.credential.SimpleCredentialsMatcher",
      "net.sf.ehcache.config.CacheConfiguration$CacheExceptionHandlerFactoryConfiguration",
      "org.jsecurity.authc.AbstractAuthenticator",
      "net.sf.ehcache.event.RegisteredEventListeners",
      "org.jsecurity.util.ClassUtils",
      "org.jsecurity.mgt.DefaultSecurityManager",
      "org.apache.log4j.Logger",
      "net.sf.ehcache.store.MemoryStore",
      "org.jsecurity.authc.credential.CredentialsMatcher",
      "edu.emory.mathcs.backport.java.util.concurrent.ThreadPoolExecutor",
      "org.jsecurity.authc.AuthenticationListener",
      "org.apache.log4j.helpers.LogLog",
      "org.jsecurity.authc.DisabledAccountException",
      "org.jsecurity.session.mgt.SessionValidationScheduler",
      "org.jsecurity.mgt.SecurityManager",
      "org.jsecurity.authc.SimpleAccount",
      "org.apache.log4j.spi.RepositorySelector",
      "org.jsecurity.session.mgt.ValidatingSessionManager",
      "org.jsecurity.session.mgt.DefaultSessionManager",
      "org.jsecurity.authz.AuthorizationException",
      "org.jsecurity.authc.UnknownAccountException",
      "org.jsecurity.web.session.ServletContainerSessionManager",
      "org.jsecurity.web.session.DefaultWebSessionManager",
      "org.apache.log4j.or.DefaultRenderer",
      "org.jsecurity.subject.SimplePrincipalCollection",
      "org.jsecurity.codec.CodecSupport",
      "org.apache.log4j.PropertyConfigurator",
      "org.jsecurity.session.Session",
      "org.apache.commons.logging.impl.Log4JLogger",
      "org.jsecurity.authc.InetAuthenticationToken",
      "net.sf.ehcache.config.CacheConfiguration$CacheLoaderFactoryConfiguration",
      "net.sf.ehcache.store.DiskStore",
      "net.sf.ehcache.config.BeanHandler",
      "net.sf.ehcache.config.ConfigurationFactory",
      "org.jsecurity.authc.AuthenticationListenerRegistrar",
      "org.jsecurity.authc.AuthenticationException",
      "org.jsecurity.session.SessionListenerRegistrar",
      "org.jsecurity.realm.text.PropertiesRealm",
      "org.jsecurity.web.WebUtils",
      "org.apache.log4j.spi.LoggerRepository",
      "org.jsecurity.io.SerializationException"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("javax.servlet.ServletRequest", false, DefaultWebSecurityManager_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("javax.servlet.ServletResponse", false, DefaultWebSecurityManager_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(DefaultWebSecurityManager_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
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
      "org.jsecurity.mgt.CachingSecurityManager",
      "org.jsecurity.mgt.RealmSecurityManager",
      "org.jsecurity.mgt.AuthenticatingSecurityManager",
      "org.jsecurity.mgt.AuthorizingSecurityManager",
      "org.jsecurity.mgt.SessionsSecurityManager",
      "org.jsecurity.mgt.DefaultSecurityManager",
      "org.jsecurity.web.DefaultWebSecurityManager",
      "org.jsecurity.util.LifecycleUtils",
      "org.jsecurity.web.WebUtils",
      "org.jsecurity.util.ThreadContext$1",
      "org.jsecurity.util.ThreadContext",
      "org.jsecurity.cache.ehcache.EhCacheManager",
      "net.sf.ehcache.CacheManager",
      "org.jsecurity.io.ResourceUtils",
      "org.jsecurity.util.ClassUtils",
      "net.sf.ehcache.event.CacheManagerEventListenerRegistry",
      "net.sf.ehcache.Status",
      "net.sf.ehcache.config.ConfigurationFactory",
      "net.sf.ehcache.config.Configuration",
      "net.sf.ehcache.config.BeanHandler",
      "net.sf.ehcache.config.BeanHandler$ElementInfo",
      "net.sf.ehcache.config.DiskStoreConfiguration",
      "net.sf.ehcache.config.CacheConfiguration",
      "net.sf.ehcache.config.ConfigurationHelper",
      "net.sf.ehcache.store.MemoryStoreEvictionPolicy",
      "net.sf.ehcache.Cache",
      "net.sf.ehcache.event.RegisteredEventListeners",
      "net.sf.ehcache.util.PropertyUtil",
      "net.sf.ehcache.store.DiskStore",
      "net.sf.ehcache.store.DiskStore$SpoolAndExpiryThread",
      "net.sf.ehcache.store.MemoryStore",
      "net.sf.ehcache.store.LruMemoryStore",
      "net.sf.ehcache.store.LruMemoryStore$SpoolingLinkedHashMap",
      "org.jsecurity.authc.AbstractAuthenticator",
      "org.jsecurity.authc.pam.ModularRealmAuthenticator",
      "org.jsecurity.authc.pam.AbstractAuthenticationStrategy",
      "org.jsecurity.authc.pam.AllSuccessfulModularAuthenticationStrategy",
      "org.jsecurity.authz.ModularRealmAuthorizer",
      "org.jsecurity.session.mgt.AbstractSessionManager",
      "org.jsecurity.web.session.ServletContainerSessionManager",
      "org.jsecurity.subject.AbstractRememberMeManager",
      "org.jsecurity.web.WebRememberMeManager",
      "org.jsecurity.io.DefaultSerializer",
      "org.jsecurity.codec.Base64",
      "org.jsecurity.codec.CodecSupport",
      "org.jsecurity.crypto.BlowfishCipher",
      "org.jsecurity.web.attr.AbstractWebAttribute",
      "org.jsecurity.web.attr.CookieAttribute",
      "org.jsecurity.realm.CachingRealm",
      "org.jsecurity.realm.AuthenticatingRealm",
      "org.jsecurity.realm.AuthorizingRealm",
      "org.jsecurity.realm.SimpleAccountRealm",
      "org.jsecurity.authc.credential.SimpleCredentialsMatcher",
      "org.jsecurity.authz.permission.WildcardPermissionResolver",
      "org.jsecurity.cache.ehcache.EhCache",
      "org.jsecurity.subject.SimplePrincipalCollection",
      "org.jsecurity.session.mgt.AbstractValidatingSessionManager",
      "org.jsecurity.session.mgt.DefaultSessionManager",
      "org.jsecurity.web.session.DefaultWebSessionManager",
      "org.jsecurity.session.mgt.eis.CachingSessionDAO",
      "org.jsecurity.session.mgt.eis.MemorySessionDAO",
      "org.jsecurity.cache.HashtableCacheManager",
      "org.jsecurity.web.attr.RequestParamAttribute",
      "org.jsecurity.authz.permission.WildcardPermission",
      "org.jsecurity.authc.UsernamePasswordToken",
      "org.jsecurity.util.CollectionUtils",
      "org.jsecurity.authc.SimpleAccount",
      "org.jsecurity.authz.SimpleAuthorizingAccount",
      "org.jsecurity.authc.SimpleAuthenticationInfo",
      "org.jsecurity.authz.SimpleAuthorizationInfo",
      "net.sf.ehcache.Element",
      "org.jsecurity.cache.HashtableCache",
      "org.jsecurity.authz.SimpleRole",
      "org.jsecurity.JSecurityException",
      "org.jsecurity.session.SessionException",
      "org.jsecurity.session.InvalidSessionException",
      "org.jsecurity.session.UnknownSessionException",
      "org.jsecurity.authc.pam.AtLeastOneSuccessfulModularAuthenticationStrategy",
      "org.jsecurity.authc.AuthenticationException",
      "org.jsecurity.realm.text.TextConfigurationRealm",
      "org.jsecurity.realm.text.PropertiesRealm",
      "org.jsecurity.util.StringUtils",
      "org.jsecurity.util.PermissionUtils",
      "org.jsecurity.subject.DelegatingSubject",
      "org.jsecurity.session.mgt.ExecutorServiceSessionValidationScheduler",
      "org.jsecurity.codec.Hex",
      "org.jsecurity.authc.pam.FirstSuccessfulAuthenticationStrategy",
      "org.jsecurity.authz.AuthorizationException",
      "org.jsecurity.authz.UnauthenticatedException",
      "org.jsecurity.session.ProxiedSession",
      "org.jsecurity.authc.credential.HashedCredentialsMatcher",
      "org.jsecurity.authc.credential.Sha1CredentialsMatcher",
      "org.jsecurity.authc.credential.Md5CredentialsMatcher",
      "org.jsecurity.authc.credential.AllowAllCredentialsMatcher",
      "org.jsecurity.authz.UnauthorizedException",
      "org.jsecurity.authc.credential.Sha256CredentialsMatcher",
      "org.jsecurity.authz.permission.AllPermission"
    );
  }
}
