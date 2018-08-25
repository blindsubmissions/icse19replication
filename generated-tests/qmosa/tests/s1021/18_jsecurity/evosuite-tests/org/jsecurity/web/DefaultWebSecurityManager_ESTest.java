/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 15:40:48 GMT 2018
 */

package org.jsecurity.web;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.InetAddress;
import java.util.Collection;
import java.util.LinkedHashSet;
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
import org.jsecurity.realm.Realm;
import org.jsecurity.realm.SimpleAccountRealm;
import org.jsecurity.session.ProxiedSession;
import org.jsecurity.session.Session;
import org.jsecurity.session.SessionListener;
import org.jsecurity.session.mgt.eis.MemorySessionDAO;
import org.jsecurity.subject.DelegatingSubject;
import org.jsecurity.subject.PrincipalCollection;
import org.jsecurity.subject.SimplePrincipalCollection;
import org.jsecurity.subject.Subject;
import org.jsecurity.web.DefaultWebSecurityManager;
import org.jsecurity.web.session.DefaultWebSessionManager;
import org.jsecurity.web.session.ServletContainerSessionManager;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DefaultWebSecurityManager_ESTest extends DefaultWebSecurityManager_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      defaultWebSecurityManager0.newSessionManagerInstance();
      defaultWebSecurityManager0.getSessionMode();
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
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedHashSet<Realm> linkedHashSet0 = new LinkedHashSet<Realm>();
      DefaultWebSecurityManager defaultWebSecurityManager0 = null;
      try {
        defaultWebSecurityManager0 = new DefaultWebSecurityManager(linkedHashSet0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Realms collection argument cannot be empty.
         //
         verifyException("org.jsecurity.mgt.RealmSecurityManager", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager(simpleAccountRealm0);
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.setSessionIdCookiePath("].  Allowed values are ");
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
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      DefaultWebSessionManager defaultWebSessionManager0 = new DefaultWebSessionManager();
      defaultWebSecurityManager0.setSessionManager(defaultWebSessionManager0);
      defaultWebSecurityManager0.setRememberMeCookiePath("");
      MemorySessionDAO memorySessionDAO0 = new MemorySessionDAO();
      try { 
        memorySessionDAO0.readSession("");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // There is no session with id []
         //
         verifyException("org.jsecurity.session.mgt.eis.CachingSessionDAO", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm("cannot remove values from the request params.");
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager(simpleAccountRealm0);
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.setSessionMode("cannot remove values from the request params.");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid sessionMode [cannot remove values from the request params.].  Allowed values are public static final String constants in the org.jsecurity.web.DefaultWebSecurityManager class: 'http' or 'jsecurity', with 'http' being the default.
         //
         verifyException("org.jsecurity.web.DefaultWebSecurityManager", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      Integer integer0 = new Integer(46);
      defaultWebSecurityManager0.setRememberMeCookieMaxAge(integer0);
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.setSessionIdCookieName("");
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
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager(simpleAccountRealm0);
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.setSessionIdCookieMaxAge(4368);
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
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      defaultWebSecurityManager0.isHttpSessionMode();
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.setSessionIdCookieSecure(true);
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
  /*Coverage entropy=1.6957425341696348
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      Integer integer0 = new Integer(46);
      defaultWebSecurityManager0.setRememberMeCookieMaxAge(integer0);
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm("L-yg{Ed,pUY`");
      DefaultWebSecurityManager defaultWebSecurityManager1 = new DefaultWebSecurityManager(simpleAccountRealm0);
      defaultWebSecurityManager1.setSessionMode("http");
      assertTrue(defaultWebSecurityManager1.isHttpSessionMode());
      
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest0);
      ServletRequestWrapper servletRequestWrapper1 = new ServletRequestWrapper(servletRequestWrapper0);
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      ServletResponseWrapper servletResponseWrapper0 = new ServletResponseWrapper(servletResponse0);
      ServletResponseWrapper servletResponseWrapper1 = new ServletResponseWrapper(servletResponseWrapper0);
      defaultWebSecurityManager0.newSessionManagerInstance();
      assertEquals("http", defaultWebSecurityManager0.getSessionMode());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.4941751382893083
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager(simpleAccountRealm0);
      defaultWebSecurityManager0.newSessionManagerInstance();
      Session session0 = null;
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest0);
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      ServletResponseWrapper servletResponseWrapper0 = new ServletResponseWrapper(servletResponse0);
      defaultWebSecurityManager0.getPrincipals((Session) null, servletRequestWrapper0, servletResponseWrapper0);
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.start(inetAddress0);
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
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      simpleAccountRealm0.afterAuthorizationCacheSet();
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, ">=,=#QUF#`YXzg;zP");
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager(simpleAccountRealm0);
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection();
      SimplePrincipalCollection simplePrincipalCollection1 = new SimplePrincipalCollection(simplePrincipalCollection0);
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(servletRequest0).getRemoteHost();
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest0);
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      ServletResponseWrapper servletResponseWrapper0 = new ServletResponseWrapper(servletResponse0);
      servletResponseWrapper0.setContentType("org.jsecurity.web.DefaultWebSecurityManager_AUTHENTICATED_SESSION_KEY");
      defaultWebSecurityManager0.createSubject((PrincipalCollection) simplePrincipalCollection0, false, (Session) null, (ServletRequest) servletRequestWrapper0, (ServletResponse) servletResponseWrapper0);
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.setRememberMeCipherKeyBase64(">=,=#QUF#`YXzg;zP");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // The convenience passthrough methods for setting remember me cipher attributes are only available when the underlying RememberMeManager implementation is a subclass of org.jsecurity.subject.AbstractRememberMeManager.
         //
         verifyException("org.jsecurity.mgt.DefaultSecurityManager", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm("?");
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager(simpleAccountRealm0);
      DelegatingSubject delegatingSubject0 = new DelegatingSubject(defaultWebSecurityManager0);
      delegatingSubject0.isPermitted("!LjIup{rkqVl");
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest0);
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      ServletResponseWrapper servletResponseWrapper0 = new ServletResponseWrapper(servletResponse0);
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, false, false);
      defaultWebSecurityManager0.bind(delegatingSubject0, servletRequestWrapper0, servletResponseWrapper0);
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.createSubject((ServletRequest) servletRequestWrapper0, (ServletResponse) servletResponseWrapper0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // javax.servlet.ServletRequestWrapper cannot be cast to javax.servlet.http.HttpServletRequest
         //
         verifyException("org.jsecurity.web.session.ServletContainerSessionManager", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager(simpleAccountRealm0);
      defaultWebSecurityManager0.isAuthenticated((Session) null);
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(servletRequest0).getScheme();
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest0);
      servletRequestWrapper0.getScheme();
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
  //Test case number: 13
  /*Coverage entropy=2.3693821196946767
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(servletRequest0).getRemoteHost();
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest0);
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      ServletResponseWrapper servletResponseWrapper0 = new ServletResponseWrapper(servletResponse0);
      defaultWebSecurityManager0.createSubject((Session) null, (ServletRequest) servletRequestWrapper0, (ServletResponse) servletResponseWrapper0);
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.setSessionIdCookieMaxAge(517);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // The convenience passthrough methods for setting session id cookie attributes are only available when the underlying SessionManager implementation is org.jsecurity.web.session.DefaultWebSessionManager, which is enabled by default when the sessionMode is 'jsecurity'.
         //
         verifyException("org.jsecurity.web.DefaultWebSecurityManager", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm(">YAqxJgz~2}zckGP");
      simpleAccountRealm0.setName("].  Allowed values are ");
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager(simpleAccountRealm0);
      Subject subject0 = null;
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
  //Test case number: 15
  /*Coverage entropy=1.8310204811135162
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/tmp");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "Configuring ehcache from ehcache.xml found in the classpath: ");
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager(simpleAccountRealm0);
      defaultWebSecurityManager0.isAuthenticated((Session) null);
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      ServletRequest servletRequest1 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest1);
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      ServletResponseWrapper servletResponseWrapper0 = new ServletResponseWrapper(servletResponse0);
      defaultWebSecurityManager0.getPrincipals((Session) null, servletRequestWrapper0, servletResponseWrapper0);
      ServletResponseWrapper servletResponseWrapper1 = new ServletResponseWrapper(servletResponseWrapper0);
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      DelegatingSubject delegatingSubject0 = new DelegatingSubject((PrincipalCollection) null, true, inetAddress0, (Session) null, defaultWebSecurityManager0);
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.bind(delegatingSubject0, servletRequestWrapper0, servletResponseWrapper1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No ServletRequest found in ThreadContext. Make sure WebUtils.bind() is being called. (typically called by JSecurityFilter)  This could also happen when running integration tests that don't properly call WebUtils.bind().
         //
         verifyException("org.jsecurity.web.WebUtils", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      DefaultWebSecurityManager defaultWebSecurityManager1 = new DefaultWebSecurityManager(simpleAccountRealm0);
      defaultWebSecurityManager1.setSessionMode("jsecurity");
      assertEquals("jsecurity", defaultWebSecurityManager1.getSessionMode());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      defaultWebSecurityManager0.setSessionMode("jsecurity");
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest0);
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      ServletResponseWrapper servletResponseWrapper0 = new ServletResponseWrapper(servletResponse0);
      defaultWebSecurityManager0.setSessionIdCookieMaxAge(1353);
      assertEquals("jsecurity", defaultWebSecurityManager0.getSessionMode());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm("T*hT8Xku");
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager(simpleAccountRealm0);
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection("T*hT8Xku", "http");
      simplePrincipalCollection0.fromRealm("T*hT8Xku");
      DelegatingSubject delegatingSubject0 = new DelegatingSubject(simplePrincipalCollection0, false, (InetAddress) null, (Session) null, defaultWebSecurityManager0);
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest0);
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      SimplePrincipalCollection simplePrincipalCollection1 = new SimplePrincipalCollection(simplePrincipalCollection0);
      simplePrincipalCollection0.addAll((PrincipalCollection) simplePrincipalCollection1);
      ServletResponseWrapper servletResponseWrapper0 = new ServletResponseWrapper(servletResponse0);
      servletResponseWrapper0.setBufferSize(554);
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.bind(delegatingSubject0, servletRequestWrapper0, servletResponseWrapper0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No ServletRequest found in ThreadContext. Make sure WebUtils.bind() is being called. (typically called by JSecurityFilter)  This could also happen when running integration tests that don't properly call WebUtils.bind().
         //
         verifyException("org.jsecurity.web.WebUtils", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection();
      DelegatingSubject delegatingSubject0 = new DelegatingSubject(simplePrincipalCollection0, false, (InetAddress) null, (Session) null, defaultWebSecurityManager0);
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest0);
      SimplePrincipalCollection simplePrincipalCollection1 = new SimplePrincipalCollection(simplePrincipalCollection0);
      simplePrincipalCollection0.addAll((PrincipalCollection) simplePrincipalCollection1);
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      ServletResponseWrapper servletResponseWrapper0 = new ServletResponseWrapper(servletResponse0);
      ServletResponseWrapper servletResponseWrapper1 = new ServletResponseWrapper(servletResponseWrapper0);
      ServletRequestWrapper servletRequestWrapper1 = new ServletRequestWrapper(servletRequestWrapper0);
      ServletResponseWrapper servletResponseWrapper2 = new ServletResponseWrapper(servletResponseWrapper0);
      ServletResponseWrapper servletResponseWrapper3 = new ServletResponseWrapper(servletResponseWrapper2);
      ServletResponseWrapper servletResponseWrapper4 = new ServletResponseWrapper(servletResponseWrapper2);
      defaultWebSecurityManager0.bind(delegatingSubject0, servletRequestWrapper0, servletResponseWrapper4);
      assertTrue(defaultWebSecurityManager0.isHttpSessionMode());
  }
}
