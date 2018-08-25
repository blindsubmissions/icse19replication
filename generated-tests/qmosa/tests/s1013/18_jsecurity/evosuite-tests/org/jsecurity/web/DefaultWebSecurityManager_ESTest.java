/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 13:26:19 GMT 2018
 */

package org.jsecurity.web;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestWrapper;
import javax.servlet.ServletResponse;
import javax.servlet.ServletResponseWrapper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.jsecurity.authc.UsernamePasswordToken;
import org.jsecurity.authc.credential.Sha256CredentialsMatcher;
import org.jsecurity.authz.permission.WildcardPermissionResolver;
import org.jsecurity.crypto.Cipher;
import org.jsecurity.realm.Realm;
import org.jsecurity.realm.SimpleAccountRealm;
import org.jsecurity.session.ProxiedSession;
import org.jsecurity.session.Session;
import org.jsecurity.session.SessionListener;
import org.jsecurity.subject.DelegatingSubject;
import org.jsecurity.subject.PrincipalCollection;
import org.jsecurity.subject.SimplePrincipalCollection;
import org.jsecurity.subject.Subject;
import org.jsecurity.web.DefaultWebSecurityManager;
import org.jsecurity.web.WebRememberMeManager;
import org.jsecurity.web.session.DefaultWebSessionManager;
import org.jsecurity.web.session.ServletContainerSessionManager;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DefaultWebSecurityManager_ESTest extends DefaultWebSecurityManager_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      Integer integer0 = new Integer(430);
      defaultWebSecurityManager0.setRememberMeCookieMaxAge(integer0);
      defaultWebSecurityManager0.getSessionMode();
      defaultWebSecurityManager0.newSessionManagerInstance();
      DelegatingSubject delegatingSubject0 = new DelegatingSubject(defaultWebSecurityManager0);
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest0);
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      ServletResponseWrapper servletResponseWrapper0 = new ServletResponseWrapper(servletResponse0);
      defaultWebSecurityManager0.bind(delegatingSubject0, servletRequestWrapper0, servletResponseWrapper0);
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.createSubject();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No ServletRequest found in ThreadContext. Make sure WebUtils.bind() is being called. (typically called by JSecurityFilter)  This could also happen when running integration tests that don't properly call WebUtils.bind().
         //
         verifyException("org.jsecurity.web.WebUtils", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm("stos <ZE/");
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager(simpleAccountRealm0);
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.setSessionIdCookiePath("stos <ZE/");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // The convenience passthrough methods for setting session id cookie attributes are only available when the underlying SessionManager implementation is org.jsecurity.web.session.DefaultWebSessionManager, which is enabled by default when the sessionMode is 'jsecurity'.
         //
         verifyException("org.jsecurity.web.DefaultWebSecurityManager", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      defaultWebSecurityManager0.setRememberMeCookiePath((String) null);
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.setSessionIdCookieName((String) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // The convenience passthrough methods for setting session id cookie attributes are only available when the underlying SessionManager implementation is org.jsecurity.web.session.DefaultWebSessionManager, which is enabled by default when the sessionMode is 'jsecurity'.
         //
         verifyException("org.jsecurity.web.DefaultWebSecurityManager", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      Session session0 = null;
      WebRememberMeManager webRememberMeManager0 = new WebRememberMeManager();
      Cipher cipher0 = webRememberMeManager0.getCipher();
      defaultWebSecurityManager0.setRememberMeCipher(cipher0);
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest0);
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      doReturn((PrintWriter) null).when(servletResponse0).getWriter();
      ServletResponseWrapper servletResponseWrapper0 = new ServletResponseWrapper(servletResponse0);
      servletResponseWrapper0.getWriter();
      defaultWebSecurityManager0.isAuthenticated((Session) null, servletRequestWrapper0, servletResponseWrapper0);
      defaultWebSecurityManager0.isHttpSessionMode();
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken((String) null, "http", inetAddress0);
      byte[] byteArray0 = new byte[0];
      try { 
        MockInetAddress.getByAddress(byteArray0);
        fail("Expecting exception: UnknownHostException");
      
      } catch(UnknownHostException e) {
         //
         // Not IPv4: []
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockInetAddress", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager(simpleAccountRealm0);
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "org.jsecurity.web.DefaultWebSecurityManager_PRINCIPALS_SESSION_KEY";
      stringArray0[1] = "org.jsecurity.web.DefaultWebSecurityManager_PRINCIPALS_SESSION_KEY";
      String string0 = "t9'>,W0`/'=";
      Sha256CredentialsMatcher sha256CredentialsMatcher0 = new Sha256CredentialsMatcher();
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.setSessionMode("org.jsecurity.web.DefaultWebSecurityManager_PRINCIPALS_SESSION_KEY");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid sessionMode [org.jsecurity.web.DefaultWebSecurityManager_PRINCIPALS_SESSION_KEY].  Allowed values are public static final String constants in the org.jsecurity.web.DefaultWebSecurityManager class: 'http' or 'jsecurity', with 'http' being the default.
         //
         verifyException("org.jsecurity.web.DefaultWebSecurityManager", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm("`wpma&");
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager(simpleAccountRealm0);
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest0);
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      ServletResponseWrapper servletResponseWrapper0 = new ServletResponseWrapper(servletResponse0);
      defaultWebSecurityManager0.isHttpSessionMode();
      SimpleAccountRealm simpleAccountRealm1 = new SimpleAccountRealm();
      DefaultWebSecurityManager defaultWebSecurityManager1 = new DefaultWebSecurityManager(simpleAccountRealm1);
      defaultWebSecurityManager1.newSessionManagerInstance();
      // Undeclared exception!
      try { 
        defaultWebSecurityManager1.setSessionIdCookieSecure(false);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // The convenience passthrough methods for setting session id cookie attributes are only available when the underlying SessionManager implementation is org.jsecurity.web.session.DefaultWebSessionManager, which is enabled by default when the sessionMode is 'jsecurity'.
         //
         verifyException("org.jsecurity.web.DefaultWebSecurityManager", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      Session session0 = null;
      defaultWebSecurityManager0.getPrincipals((Session) null);
      boolean boolean0 = false;
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(servletRequest0).getRemoteAddr();
      doReturn((String) null).when(servletRequest0).getRemoteHost();
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest0);
      ServletResponse servletResponse0 = null;
      servletRequestWrapper0.getRemoteAddr();
      defaultWebSecurityManager0.createSubject((PrincipalCollection) null, false, (Session) null, (ServletRequest) servletRequestWrapper0, (ServletResponse) null);
      String string0 = "";
      servletRequestWrapper0.removeAttribute("");
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      Locale locale0 = Locale.KOREAN;
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.AUTOSELECT_FILTERING;
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) set0, locale_FilteringMode0);
      defaultWebSecurityManager0.hasAllRoles((PrincipalCollection) null, list0);
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.setSessionIdCookieSecure(false);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // The convenience passthrough methods for setting session id cookie attributes are only available when the underlying SessionManager implementation is org.jsecurity.web.session.DefaultWebSessionManager, which is enabled by default when the sessionMode is 'jsecurity'.
         //
         verifyException("org.jsecurity.web.DefaultWebSecurityManager", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      SessionListener sessionListener0 = mock(SessionListener.class, new ViolatedAssumptionAnswer());
      defaultWebSecurityManager0.add(sessionListener0);
      Session session0 = null;
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(servletRequest0).getRemoteHost();
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest0);
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      ServletResponseWrapper servletResponseWrapper0 = new ServletResponseWrapper(servletResponse0);
      defaultWebSecurityManager0.createSubject((Session) null, (ServletRequest) servletRequestWrapper0, (ServletResponse) servletResponseWrapper0);
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.setSessionIdCookieMaxAge((-667));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // The convenience passthrough methods for setting session id cookie attributes are only available when the underlying SessionManager implementation is org.jsecurity.web.session.DefaultWebSessionManager, which is enabled by default when the sessionMode is 'jsecurity'.
         //
         verifyException("org.jsecurity.web.DefaultWebSecurityManager", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      defaultWebSecurityManager0.newSessionManagerInstance();
      DelegatingSubject delegatingSubject0 = new DelegatingSubject(defaultWebSecurityManager0);
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      DefaultWebSecurityManager defaultWebSecurityManager1 = new DefaultWebSecurityManager(simpleAccountRealm0);
      Collection<Realm> collection0 = defaultWebSecurityManager1.getRealms();
      DefaultWebSecurityManager defaultWebSecurityManager2 = new DefaultWebSecurityManager(collection0);
      defaultWebSecurityManager0.setSessionMode("jsecurity");
      ServletContainerSessionManager servletContainerSessionManager0 = new ServletContainerSessionManager();
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest0);
      ServletRequestWrapper servletRequestWrapper1 = new ServletRequestWrapper(servletRequestWrapper0);
      ServletRequestWrapper servletRequestWrapper2 = new ServletRequestWrapper(servletRequestWrapper0);
      ServletRequestWrapper servletRequestWrapper3 = new ServletRequestWrapper(servletRequestWrapper2);
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      ServletResponseWrapper servletResponseWrapper0 = new ServletResponseWrapper(servletResponse0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      ServletResponseWrapper servletResponseWrapper1 = new ServletResponseWrapper(servletResponseWrapper0);
      defaultWebSecurityManager1.newSessionManagerInstance();
      DefaultWebSessionManager defaultWebSessionManager0 = new DefaultWebSessionManager();
      // Undeclared exception!
      try { 
        defaultWebSessionManager0.getHostAddress("org.jsecurity.web.DefaultWebSecurityManager_PRINCIPALS_SESSION_KEY");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // There is no session with id [org.jsecurity.web.DefaultWebSecurityManager_PRINCIPALS_SESSION_KEY]
         //
         verifyException("org.jsecurity.session.mgt.eis.CachingSessionDAO", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      WebRememberMeManager webRememberMeManager0 = new WebRememberMeManager();
      defaultWebSecurityManager0.add((SessionListener) null);
      Session session0 = null;
      defaultWebSecurityManager0.getPrincipals((Session) null);
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      ServletResponseWrapper servletResponseWrapper0 = new ServletResponseWrapper(servletResponse0);
      ServletResponseWrapper servletResponseWrapper1 = new ServletResponseWrapper(servletResponseWrapper0);
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.bind((Subject) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No ServletRequest found in ThreadContext. Make sure WebUtils.bind() is being called. (typically called by JSecurityFilter)  This could also happen when running integration tests that don't properly call WebUtils.bind().
         //
         verifyException("org.jsecurity.web.WebUtils", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.7328679513998633
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      WebRememberMeManager webRememberMeManager0 = new WebRememberMeManager();
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      DefaultWebSecurityManager defaultWebSecurityManager1 = new DefaultWebSecurityManager(simpleAccountRealm0);
      Collection<Realm> collection0 = defaultWebSecurityManager1.getRealms();
      DefaultWebSecurityManager defaultWebSecurityManager2 = new DefaultWebSecurityManager(collection0);
      defaultWebSecurityManager1.setSessionMode("http");
      ServletContainerSessionManager servletContainerSessionManager0 = new ServletContainerSessionManager();
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      ServletResponseWrapper servletResponseWrapper0 = new ServletResponseWrapper(servletResponse0);
      ServletResponseWrapper servletResponseWrapper1 = new ServletResponseWrapper(servletResponseWrapper0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-66);
      byteArray0[1] = (byte)93;
      byteArray0[2] = (byte)39;
      byteArray0[3] = (byte) (-118);
      byteArray0[4] = (byte)101;
      defaultWebSecurityManager0.setRememberMeCipherKey(byteArray0);
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm("`s[V,uAUrV;/V_I");
      DefaultWebSecurityManager defaultWebSecurityManager1 = new DefaultWebSecurityManager(simpleAccountRealm0);
      defaultWebSecurityManager1.getPrincipals((Session) null);
      defaultWebSecurityManager1.getPrincipals((Session) null);
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection();
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(servletRequest0).getRemoteHost();
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest0);
      Subject subject0 = defaultWebSecurityManager0.createSubject((PrincipalCollection) simplePrincipalCollection0, false, (Session) null, (ServletRequest) servletRequestWrapper0, (ServletResponse) null);
      defaultWebSecurityManager0.bind(subject0, servletRequestWrapper0, (ServletResponse) null);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      DelegatingSubject delegatingSubject0 = new DelegatingSubject(defaultWebSecurityManager0);
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      DefaultWebSecurityManager defaultWebSecurityManager1 = new DefaultWebSecurityManager(simpleAccountRealm0);
      Collection<Realm> collection0 = defaultWebSecurityManager1.getRealms();
      DefaultWebSecurityManager defaultWebSecurityManager2 = new DefaultWebSecurityManager(collection0);
      defaultWebSecurityManager0.setSessionMode("jsecurity");
      ServletContainerSessionManager servletContainerSessionManager0 = new ServletContainerSessionManager();
      simpleAccountRealm0.init();
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/tmp/jsecurity-ehcache");
      FileSystemHandling.setPermissions(evoSuiteFile0, true, false, false);
      defaultWebSecurityManager0.setSessionIdCookiePath("n29APS##");
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.setSessionMode((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid sessionMode [null].  Allowed values are public static final String constants in the org.jsecurity.web.DefaultWebSecurityManager class: 'http' or 'jsecurity', with 'http' being the default.
         //
         verifyException("org.jsecurity.web.DefaultWebSecurityManager", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.9730014063936125
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-66);
      byteArray0[1] = (byte)93;
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      byteArray0[2] = (byte)39;
      byteArray0[3] = (byte) (-118);
      byteArray0[4] = (byte)101;
      defaultWebSecurityManager0.setRememberMeCipherKey(byteArray0);
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm("`s[V,uAUrV;/V_I");
      DefaultWebSecurityManager defaultWebSecurityManager1 = new DefaultWebSecurityManager(simpleAccountRealm0);
      defaultWebSecurityManager1.getPrincipals((Session) null);
      defaultWebSecurityManager1.getPrincipals((Session) null);
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection();
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(servletRequest0).getRemoteHost();
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest0);
      ServletRequestWrapper servletRequestWrapper1 = new ServletRequestWrapper(servletRequestWrapper0);
      ServletRequestWrapper servletRequestWrapper2 = new ServletRequestWrapper(servletRequestWrapper0);
      defaultWebSecurityManager1.getPrincipals((Session) null, servletRequestWrapper2, (ServletResponse) null);
      Subject subject0 = defaultWebSecurityManager0.createSubject((PrincipalCollection) null, true, (Session) null, (ServletRequest) servletRequestWrapper0, (ServletResponse) null);
      // Undeclared exception!
      try { 
        defaultWebSecurityManager1.bind(subject0, servletRequestWrapper0, (ServletResponse) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No ServletRequest found in ThreadContext. Make sure WebUtils.bind() is being called. (typically called by JSecurityFilter)  This could also happen when running integration tests that don't properly call WebUtils.bind().
         //
         verifyException("org.jsecurity.web.WebUtils", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.7478680974667573
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm("a non-null Subject instance");
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager(simpleAccountRealm0);
      Session session0 = null;
      defaultWebSecurityManager0.getPrincipals((Session) null);
      SimpleAccountRealm simpleAccountRealm1 = new SimpleAccountRealm();
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection(simpleAccountRealm1, "R8U15kUlbe*P%nS");
      Class<SimpleAccountRealm> class0 = SimpleAccountRealm.class;
      simplePrincipalCollection0.byType(class0);
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(servletRequest0).getRemoteHost();
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest0);
      ServletRequestWrapper servletRequestWrapper1 = new ServletRequestWrapper(servletRequestWrapper0);
      ServletResponse servletResponse0 = null;
      Subject subject0 = defaultWebSecurityManager0.createSubject((PrincipalCollection) simplePrincipalCollection0, true, (Session) null, (ServletRequest) servletRequestWrapper0, (ServletResponse) null);
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.bind(subject0, servletRequestWrapper0, (ServletResponse) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No ServletRequest found in ThreadContext. Make sure WebUtils.bind() is being called. (typically called by JSecurityFilter)  This could also happen when running integration tests that don't properly call WebUtils.bind().
         //
         verifyException("org.jsecurity.web.WebUtils", e);
      }
  }
}