/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 16:23:41 GMT 2018
 */

package org.jsecurity.web;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.InetAddress;
import java.util.Collection;
import java.util.LinkedHashSet;
import javax.servlet.ServletInputStream;
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
import org.jsecurity.authc.pam.ModularAuthenticationStrategy;
import org.jsecurity.authc.pam.ModularRealmAuthenticator;
import org.jsecurity.authz.Permission;
import org.jsecurity.authz.permission.PermissionResolver;
import org.jsecurity.authz.permission.WildcardPermissionResolver;
import org.jsecurity.mgt.DefaultSecurityManager;
import org.jsecurity.realm.Realm;
import org.jsecurity.realm.SimpleAccountRealm;
import org.jsecurity.session.Session;
import org.jsecurity.session.mgt.eis.MemorySessionDAO;
import org.jsecurity.subject.DelegatingSubject;
import org.jsecurity.subject.PrincipalCollection;
import org.jsecurity.subject.SimplePrincipalCollection;
import org.jsecurity.subject.Subject;
import org.jsecurity.web.DefaultWebSecurityManager;
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
      Session session0 = null;
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.setSessionIdCookiePath("] threw an exception during onLogout for subject with principals [");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // The convenience passthrough methods for setting session id cookie attributes are only available when the underlying SessionManager implementation is org.jsecurity.web.session.DefaultWebSessionManager, which is enabled by default when the sessionMode is 'jsecurity'.
         //
         verifyException("org.jsecurity.web.DefaultWebSecurityManager", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      boolean boolean0 = false;
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
  //Test case number: 2
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedHashSet<Realm> linkedHashSet0 = new LinkedHashSet<Realm>();
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm("rf*");
      linkedHashSet0.add(simpleAccountRealm0);
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager(linkedHashSet0);
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.setSessionMode("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid sessionMode [].  Allowed values are public static final String constants in the org.jsecurity.web.DefaultWebSecurityManager class: 'http' or 'jsecurity', with 'http' being the default.
         //
         verifyException("org.jsecurity.web.DefaultWebSecurityManager", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.166084939249829
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      System.setCurrentTimeMillis(1L);
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      doReturn((ServletInputStream) null).when(servletRequest0).getInputStream();
      doReturn((String) null).when(servletRequest0).getRemoteHost();
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest0);
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      servletRequestWrapper0.getInputStream();
      ServletResponseWrapper servletResponseWrapper0 = new ServletResponseWrapper(servletResponse0);
      servletResponseWrapper0.setContentType("org.jsecurity.web.DefaultWebSecurityManager_AUTHENTICATED_SESSION_KEY");
      defaultWebSecurityManager0.getPrincipals((Session) null, servletRequestWrapper0, servletResponseWrapper0);
      ServletResponseWrapper servletResponseWrapper1 = new ServletResponseWrapper(servletResponseWrapper0);
      defaultWebSecurityManager0.getPrincipals((Session) null, servletRequestWrapper0, servletResponseWrapper1);
      defaultWebSecurityManager0.isAuthenticated((Session) null);
      Subject subject0 = defaultWebSecurityManager0.createSubject((Session) null, (ServletRequest) servletRequestWrapper0, (ServletResponse) servletResponseWrapper1);
      assertFalse(subject0.isAuthenticated());
      
      ServletResponseWrapper servletResponseWrapper2 = new ServletResponseWrapper(servletResponseWrapper0);
      defaultWebSecurityManager0.bind(subject0, servletRequestWrapper0, servletResponseWrapper2);
      assertTrue(defaultWebSecurityManager0.isHttpSessionMode());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      ServletRequest servletRequest0 = null;
      FileSystemHandling.shouldAllThrowIOExceptions();
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      ServletResponseWrapper servletResponseWrapper0 = new ServletResponseWrapper(servletResponse0);
      defaultWebSecurityManager0.getPrincipals((Session) null, (ServletRequest) null, servletResponseWrapper0);
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm("w9.fvwS%f3.pw{Ky-|");
      LinkedHashSet<Realm> linkedHashSet0 = new LinkedHashSet<Realm>();
      linkedHashSet0.add(simpleAccountRealm0);
      DefaultWebSecurityManager defaultWebSecurityManager1 = new DefaultWebSecurityManager(linkedHashSet0);
      InetAddress inetAddress0 = MockInetAddress.getByName("Bad option value [");
      DefaultSecurityManager defaultSecurityManager0 = new DefaultSecurityManager(simpleAccountRealm0);
      DelegatingSubject delegatingSubject0 = new DelegatingSubject((PrincipalCollection) null, true, inetAddress0, (Session) null, defaultSecurityManager0);
      // Undeclared exception!
      try { 
        defaultWebSecurityManager1.bind(delegatingSubject0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No ServletRequest found in ThreadContext. Make sure WebUtils.bind() is being called. (typically called by JSecurityFilter)  This could also happen when running integration tests that don't properly call WebUtils.bind().
         //
         verifyException("org.jsecurity.web.WebUtils", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.277034259466139
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      ServletRequest servletRequest0 = null;
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      ServletResponseWrapper servletResponseWrapper0 = new ServletResponseWrapper(servletResponse0);
      ServletResponseWrapper servletResponseWrapper1 = new ServletResponseWrapper(servletResponseWrapper0);
      servletResponseWrapper0.reset();
      DelegatingSubject delegatingSubject0 = new DelegatingSubject(defaultWebSecurityManager0);
      String string0 = "Processing properties line - key: [";
      delegatingSubject0.hasRole("org.jsecurity.web.DefaultWebSecurityManager_AUTHENTICATED_SESSION_KEY");
      defaultWebSecurityManager0.getPrincipals((Session) null);
      byte[] byteArray0 = new byte[5];
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm("Processing properties line - key: [");
      ModularRealmAuthenticator modularRealmAuthenticator0 = new ModularRealmAuthenticator(simpleAccountRealm0);
      modularRealmAuthenticator0.getModularAuthenticationStrategy();
      defaultWebSecurityManager0.setModularAuthenticationStrategy((ModularAuthenticationStrategy) null);
      byteArray0[0] = (byte)114;
      defaultWebSecurityManager0.newSessionManagerInstance();
      ServletContainerSessionManager servletContainerSessionManager0 = new ServletContainerSessionManager();
      ServletRequestWrapper servletRequestWrapper0 = null;
      try {
        servletRequestWrapper0 = new ServletRequestWrapper((ServletRequest) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Request cannot be null
         //
         verifyException("javax.servlet.ServletRequestWrapper", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.5403058252265167
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      ServletResponseWrapper servletResponseWrapper0 = new ServletResponseWrapper(servletResponse0);
      defaultWebSecurityManager0.getPrincipals((Session) null, (ServletRequest) null, servletResponseWrapper0);
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection();
      Class<String> class0 = String.class;
      Collection<String> collection0 = simplePrincipalCollection0.byType(class0);
      defaultWebSecurityManager0.checkRoles((PrincipalCollection) null, collection0);
      SimplePrincipalCollection simplePrincipalCollection1 = new SimplePrincipalCollection();
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      DelegatingSubject delegatingSubject0 = new DelegatingSubject(simplePrincipalCollection1, false, inetAddress0, (Session) null, defaultWebSecurityManager0);
      delegatingSubject0.hasRole("p");
      delegatingSubject0.isPermittedAll((Collection<Permission>) null);
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest0);
      ServletRequestWrapper servletRequestWrapper1 = new ServletRequestWrapper(servletRequestWrapper0);
      defaultWebSecurityManager0.bind(delegatingSubject0, servletRequestWrapper1, (ServletResponse) null);
      ServletResponseWrapper servletResponseWrapper1 = null;
      try {
        servletResponseWrapper1 = new ServletResponseWrapper((ServletResponse) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Response cannot be null
         //
         verifyException("javax.servlet.ServletResponseWrapper", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedHashSet<Realm> linkedHashSet0 = new LinkedHashSet<Realm>();
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm("rf*");
      linkedHashSet0.add(simpleAccountRealm0);
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager(linkedHashSet0);
      defaultWebSecurityManager0.newSessionManagerInstance();
      assertTrue(defaultWebSecurityManager0.isHttpSessionMode());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      ModularRealmAuthenticator modularRealmAuthenticator0 = new ModularRealmAuthenticator();
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.setRememberMeCookieMaxAge((Integer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsecurity.web.DefaultWebSecurityManager", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager(simpleAccountRealm0);
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.setRememberMeCookiePath("http mode - enabling ServletContainerSessionManager (Http Sessions)");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsecurity.web.DefaultWebSecurityManager", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
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
  //Test case number: 11
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Session session0 = null;
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.setSessionIdCookieName("].  Allowed values are ");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // The convenience passthrough methods for setting session id cookie attributes are only available when the underlying SessionManager implementation is org.jsecurity.web.session.DefaultWebSessionManager, which is enabled by default when the sessionMode is 'jsecurity'.
         //
         verifyException("org.jsecurity.web.DefaultWebSecurityManager", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager(simpleAccountRealm0);
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
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      defaultWebSecurityManager0.setSessionMode("jsecurity");
      defaultWebSecurityManager0.setSessionMode("jsecurity");
      defaultWebSecurityManager0.newSessionManagerInstance();
      assertEquals("jsecurity", defaultWebSecurityManager0.getSessionMode());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.setSessionIdCookieMaxAge(1888);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // The convenience passthrough methods for setting session id cookie attributes are only available when the underlying SessionManager implementation is org.jsecurity.web.session.DefaultWebSessionManager, which is enabled by default when the sessionMode is 'jsecurity'.
         //
         verifyException("org.jsecurity.web.DefaultWebSecurityManager", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      defaultWebSecurityManager0.setSessionMode("jsecurity");
      defaultWebSecurityManager0.setSessionIdCookieMaxAge((-69));
      assertEquals("jsecurity", defaultWebSecurityManager0.getSessionMode());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      defaultWebSecurityManager0.getSessionMode();
      ServletContainerSessionManager servletContainerSessionManager0 = new ServletContainerSessionManager();
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      ServletResponseWrapper servletResponseWrapper0 = new ServletResponseWrapper(servletResponse0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      defaultWebSecurityManager0.setSessionMode("http");
      assertTrue(defaultWebSecurityManager0.isHttpSessionMode());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      ServletResponse servletResponse0 = null;
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection();
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      DelegatingSubject delegatingSubject0 = new DelegatingSubject(simplePrincipalCollection0, true, inetAddress0, (Session) null, defaultWebSecurityManager0);
      String string0 = "p";
      delegatingSubject0.hasRole("p");
      delegatingSubject0.isPermittedAll((Collection<Permission>) null);
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(servletRequest0).getContentLength();
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest0);
      servletRequestWrapper0.getContentLength();
      ServletRequestWrapper servletRequestWrapper1 = new ServletRequestWrapper(servletRequestWrapper0);
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.bind(delegatingSubject0, servletRequestWrapper1, (ServletResponse) null);
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
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedHashSet<Realm> linkedHashSet0 = new LinkedHashSet<Realm>();
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm("rf*");
      WildcardPermissionResolver wildcardPermissionResolver0 = new WildcardPermissionResolver();
      Permission permission0 = wildcardPermissionResolver0.resolvePermission("rf*");
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection(permission0, "rf*");
      Class<String> class0 = String.class;
      Collection<String> collection0 = simplePrincipalCollection0.byType(class0);
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager(simpleAccountRealm0);
      defaultWebSecurityManager0.checkRoles(simplePrincipalCollection0, collection0);
      ServletResponse servletResponse0 = null;
      SimplePrincipalCollection simplePrincipalCollection1 = new SimplePrincipalCollection();
      MockInetAddress.getLoopbackAddress();
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      DelegatingSubject delegatingSubject0 = new DelegatingSubject(simplePrincipalCollection0, false, inetAddress0, (Session) null, defaultWebSecurityManager0);
      delegatingSubject0.hasRole("p");
      delegatingSubject0.isPermittedAll((Collection<Permission>) null);
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest0);
      ServletRequestWrapper servletRequestWrapper1 = new ServletRequestWrapper(servletRequestWrapper0);
      ServletRequestWrapper servletRequestWrapper2 = new ServletRequestWrapper(servletRequestWrapper1);
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.bind(delegatingSubject0, servletRequestWrapper2, (ServletResponse) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No ServletRequest found in ThreadContext. Make sure WebUtils.bind() is being called. (typically called by JSecurityFilter)  This could also happen when running integration tests that don't properly call WebUtils.bind().
         //
         verifyException("org.jsecurity.web.WebUtils", e);
      }
  }
}
