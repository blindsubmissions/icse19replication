/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 11:17:53 GMT 2018
 */

package org.jsecurity.web;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedReader;
import java.io.Serializable;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Collection;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestWrapper;
import javax.servlet.ServletResponse;
import javax.servlet.ServletResponseWrapper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.jsecurity.authc.UsernamePasswordToken;
import org.jsecurity.authz.Permission;
import org.jsecurity.authz.permission.PermissionResolver;
import org.jsecurity.mgt.DefaultSecurityManager;
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
import org.jsecurity.web.WebRememberMeManager;
import org.jsecurity.web.attr.CookieAttribute;
import org.jsecurity.web.session.DefaultWebSessionManager;
import org.jsecurity.web.session.ServletContainerSessionManager;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DefaultWebSecurityManager_ESTest extends DefaultWebSecurityManager_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      defaultWebSecurityManager0.getRealms();
      DefaultWebSecurityManager defaultWebSecurityManager1 = null;
      try {
        defaultWebSecurityManager1 = new DefaultWebSecurityManager((Collection<Realm>) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Realms collection argument cannot be null.
         //
         verifyException("org.jsecurity.mgt.RealmSecurityManager", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager(simpleAccountRealm0);
      Collection<Realm> collection0 = defaultWebSecurityManager0.getRealms();
      DefaultWebSecurityManager defaultWebSecurityManager1 = new DefaultWebSecurityManager(collection0);
      PermissionResolver permissionResolver0 = simpleAccountRealm0.getPermissionResolver();
      simpleAccountRealm0.setPermissionResolver(permissionResolver0);
      // Undeclared exception!
      try { 
        defaultWebSecurityManager1.setRememberMeCookieMaxAge((Integer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
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
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      String string0 = null;
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
  //Test case number: 3
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm((String) null);
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager(simpleAccountRealm0);
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
  //Test case number: 4
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm("XP`");
      Class<UsernamePasswordToken> class0 = UsernamePasswordToken.class;
      simpleAccountRealm0.setAuthenticationTokenClass(class0);
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager(simpleAccountRealm0);
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.setSessionIdCookieMaxAge((-2545));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // The convenience passthrough methods for setting session id cookie attributes are only available when the underlying SessionManager implementation is org.jsecurity.web.session.DefaultWebSessionManager, which is enabled by default when the sessionMode is 'jsecurity'.
         //
         verifyException("org.jsecurity.web.DefaultWebSecurityManager", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      byte[] byteArray0 = new byte[0];
      defaultWebSecurityManager0.setRememberMeDecryptionCipherKey(byteArray0);
      String string0 = "_INET_ADDRESS_KEY";
      defaultWebSecurityManager0.setRememberMeCookiePath("_INET_ADDRESS_KEY");
      Integer.getInteger("org.jsecurity.web.DefaultWebSecurityManager_PRINCIPALS_SESSION_KEY", (-1449));
      Integer.getInteger("http", (-1449));
      WebRememberMeManager webRememberMeManager0 = new WebRememberMeManager();
      Integer.getInteger("org.jsecurity.mgt.SessionsSecurityManager");
      // Undeclared exception!
      try { 
        webRememberMeManager0.getRememberedPrincipals();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No ServletRequest found in ThreadContext. Make sure WebUtils.bind() is being called. (typically called by JSecurityFilter)  This could also happen when running integration tests that don't properly call WebUtils.bind().
         //
         verifyException("org.jsecurity.web.WebUtils", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.7478680974667573
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm("X)>=Sj@T.L<dV");
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager(simpleAccountRealm0);
      Session session0 = null;
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      doReturn((Locale) null).when(servletRequest0).getLocale();
      doReturn((String) null).when(servletRequest0).getParameter(anyString());
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest0);
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      servletRequestWrapper0.getParameter("yIzue/ZwnheTC");
      ServletResponseWrapper servletResponseWrapper0 = new ServletResponseWrapper(servletResponse0);
      char[] charArray0 = new char[4];
      charArray0[0] = ' ';
      charArray0[1] = ']';
      charArray0[2] = '{';
      charArray0[3] = 'j';
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("http", charArray0, false, inetAddress0);
      simpleAccountRealm0.supports(usernamePasswordToken0);
      defaultWebSecurityManager0.getPrincipals((Session) null, servletRequestWrapper0, servletResponseWrapper0);
      servletRequestWrapper0.getLocale();
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.setSessionMode("{!H*6x62AA&CGql");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid sessionMode [{!H*6x62AA&CGql].  Allowed values are public static final String constants in the org.jsecurity.web.DefaultWebSecurityManager class: 'http' or 'jsecurity', with 'http' being the default.
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
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.setSessionIdCookiePath("onFailedLogin(AuthenticationToken,AuthenticationException) method threw an exception.  Logging and propagating original AuthenticationException.");
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
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      SessionListener sessionListener0 = mock(SessionListener.class, new ViolatedAssumptionAnswer());
      defaultWebSecurityManager0.remove(sessionListener0);
      defaultWebSecurityManager0.newSessionManagerInstance();
      DelegatingSubject delegatingSubject0 = new DelegatingSubject(defaultWebSecurityManager0);
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.bind(delegatingSubject0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No ServletRequest found in ThreadContext. Make sure WebUtils.bind() is being called. (typically called by JSecurityFilter)  This could also happen when running integration tests that don't properly call WebUtils.bind().
         //
         verifyException("org.jsecurity.web.WebUtils", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager(simpleAccountRealm0);
      Collection<Realm> collection0 = defaultWebSecurityManager0.getRealms();
      DefaultWebSecurityManager defaultWebSecurityManager1 = new DefaultWebSecurityManager(collection0);
      Collection<Realm> collection1 = defaultWebSecurityManager0.getRealms();
      DefaultWebSecurityManager defaultWebSecurityManager2 = new DefaultWebSecurityManager(collection1);
      DefaultSecurityManager defaultSecurityManager0 = new DefaultSecurityManager();
      DelegatingSubject delegatingSubject0 = new DelegatingSubject(defaultSecurityManager0);
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest0);
      ServletResponse servletResponse0 = null;
      defaultWebSecurityManager1.bind(delegatingSubject0, servletRequestWrapper0, (ServletResponse) null);
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.setSessionIdCookieName("nWld_wG~v<");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // The convenience passthrough methods for setting session id cookie attributes are only available when the underlying SessionManager implementation is org.jsecurity.web.session.DefaultWebSessionManager, which is enabled by default when the sessionMode is 'jsecurity'.
         //
         verifyException("org.jsecurity.web.DefaultWebSecurityManager", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      System.setCurrentTimeMillis(0L);
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      defaultWebSecurityManager0.getSessionMode();
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
  //Test case number: 11
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager(simpleAccountRealm0);
      Collection<Realm> collection0 = defaultWebSecurityManager0.getRealms();
      DefaultWebSecurityManager defaultWebSecurityManager1 = new DefaultWebSecurityManager(collection0);
      Collection<Realm> collection1 = defaultWebSecurityManager0.getRealms();
      DefaultWebSecurityManager defaultWebSecurityManager2 = new DefaultWebSecurityManager(collection1);
      DefaultSecurityManager defaultSecurityManager0 = new DefaultSecurityManager();
      DelegatingSubject delegatingSubject0 = new DelegatingSubject(defaultSecurityManager0);
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest0);
      defaultWebSecurityManager1.bind(delegatingSubject0, servletRequestWrapper0, (ServletResponse) null);
      defaultWebSecurityManager2.setSessionMode("http");
      assertTrue(defaultWebSecurityManager2.isHttpSessionMode());
      
      LinkedList<Realm> linkedList0 = new LinkedList<Realm>();
      DefaultWebSecurityManager defaultWebSecurityManager3 = new DefaultWebSecurityManager(collection0);
      assertTrue(defaultWebSecurityManager0.isHttpSessionMode());
      assertEquals("http", defaultWebSecurityManager0.getSessionMode());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection(defaultWebSecurityManager0, "http");
      DefaultWebSessionManager defaultWebSessionManager0 = new DefaultWebSessionManager();
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(servletRequest0).getParameter(anyString());
      doReturn((Enumeration) null).when(servletRequest0).getParameterNames();
      doReturn((String) null).when(servletRequest0).getRemoteHost();
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest0);
      ServletRequestWrapper servletRequestWrapper1 = new ServletRequestWrapper(servletRequestWrapper0);
      servletRequestWrapper0.getParameterNames();
      ServletRequestWrapper servletRequestWrapper2 = new ServletRequestWrapper(servletRequestWrapper0);
      servletRequestWrapper2.getParameter("org.jsecurity.web.DefaultWebSecurityManager_PRINCIPALS_SESSION_KEY");
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      SessionListener sessionListener0 = mock(SessionListener.class, new ViolatedAssumptionAnswer());
      defaultWebSecurityManager0.remove(sessionListener0);
      defaultWebSecurityManager0.newSessionManagerInstance();
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm("No disk store path defined. Skipping disk store path conflict test.");
      DefaultWebSecurityManager defaultWebSecurityManager1 = new DefaultWebSecurityManager(simpleAccountRealm0);
      defaultWebSecurityManager1.setSessionMode("jsecurity");
      assertEquals("jsecurity", defaultWebSecurityManager1.getSessionMode());
      
      ServletResponseWrapper servletResponseWrapper0 = new ServletResponseWrapper(servletResponse0);
      defaultWebSecurityManager0.createSubject((Session) null, (ServletRequest) servletRequestWrapper2, (ServletResponse) servletResponseWrapper0);
      assertTrue(defaultWebSecurityManager0.isHttpSessionMode());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.893788232391138
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager(simpleAccountRealm0);
      Collection<Realm> collection0 = defaultWebSecurityManager0.getRealms();
      DefaultWebSecurityManager defaultWebSecurityManager1 = new DefaultWebSecurityManager(collection0);
      Collection<Realm> collection1 = defaultWebSecurityManager0.getRealms();
      DefaultWebSecurityManager defaultWebSecurityManager2 = new DefaultWebSecurityManager(collection1);
      DefaultSecurityManager defaultSecurityManager0 = new DefaultSecurityManager();
      DelegatingSubject delegatingSubject0 = new DelegatingSubject(defaultSecurityManager0);
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      doReturn((BufferedReader) null).when(servletRequest0).getReader();
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest0);
      LinkedList<Permission> linkedList0 = new LinkedList<Permission>();
      delegatingSubject0.isPermitted((List<Permission>) linkedList0);
      ServletResponse servletResponse0 = null;
      defaultWebSecurityManager1.bind(delegatingSubject0, servletRequestWrapper0, (ServletResponse) null);
      defaultWebSecurityManager2.setAuthorizer(defaultWebSecurityManager0);
      defaultWebSecurityManager0.setSessionMode("jsecurity");
      defaultWebSecurityManager0.setSessionIdCookieName("nWld_wG~v<");
      defaultWebSecurityManager0.newSessionManagerInstance();
      servletRequestWrapper0.getReader();
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-113);
      byteArray0[1] = (byte)47;
      byteArray0[2] = (byte) (-128);
      byteArray0[3] = (byte) (-1);
      byteArray0[4] = (byte)19;
      try { 
        MockInetAddress.getByAddress("*{WLy", byteArray0);
        fail("Expecting exception: UnknownHostException");
      
      } catch(UnknownHostException e) {
         //
         // Not IPv4: [-113, 47, -128, -1, 19]
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockInetAddress", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection();
      DefaultWebSessionManager defaultWebSessionManager0 = new DefaultWebSessionManager();
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(servletRequest0).getRemoteAddr();
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest0);
      defaultWebSecurityManager0.getSubject();
      ServletRequestWrapper servletRequestWrapper1 = new ServletRequestWrapper(servletRequestWrapper0);
      servletRequestWrapper0.getRemoteAddr();
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      DefaultSecurityManager defaultSecurityManager0 = new DefaultSecurityManager(simpleAccountRealm0);
      DelegatingSubject delegatingSubject0 = new DelegatingSubject(simplePrincipalCollection0, false, inetAddress0, (Session) null, defaultSecurityManager0);
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      ServletResponseWrapper servletResponseWrapper0 = new ServletResponseWrapper(servletResponse0);
      defaultWebSecurityManager0.bind(delegatingSubject0, servletRequestWrapper0, servletResponseWrapper0);
      assertTrue(defaultWebSecurityManager0.isHttpSessionMode());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      defaultWebSecurityManager0.getSubject();
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      DefaultSecurityManager defaultSecurityManager0 = new DefaultSecurityManager(simpleAccountRealm0);
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      DelegatingSubject delegatingSubject0 = new DelegatingSubject((PrincipalCollection) null, true, inetAddress0, (Session) null, defaultWebSecurityManager0);
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      ServletResponseWrapper servletResponseWrapper0 = new ServletResponseWrapper(servletResponse0);
      ServletResponseWrapper servletResponseWrapper1 = new ServletResponseWrapper(servletResponseWrapper0);
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest0);
      ServletResponseWrapper servletResponseWrapper2 = new ServletResponseWrapper(servletResponseWrapper0);
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.bind(delegatingSubject0, servletRequestWrapper0, servletResponseWrapper2);
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
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      defaultWebSecurityManager0.getSubject();
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection();
      DefaultWebSessionManager defaultWebSessionManager0 = new DefaultWebSessionManager();
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      doReturn((Locale) null).when(servletRequest0).getLocale();
      doReturn((String) null).when(servletRequest0).getRemoteAddr();
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest0);
      ServletRequestWrapper servletRequestWrapper1 = new ServletRequestWrapper(servletRequestWrapper0);
      defaultWebSecurityManager0.getSubject();
      ServletRequestWrapper servletRequestWrapper2 = new ServletRequestWrapper(servletRequestWrapper1);
      servletRequestWrapper1.getRemoteAddr();
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      SimpleAccountRealm simpleAccountRealm1 = new SimpleAccountRealm();
      DefaultSecurityManager defaultSecurityManager0 = new DefaultSecurityManager(simpleAccountRealm0);
      Object object0 = new Object();
      SimplePrincipalCollection simplePrincipalCollection1 = new SimplePrincipalCollection(object0, "org.jsecurity.web.DefaultWebSecurityManager_PRINCIPALS_SESSION_KEY");
      DelegatingSubject delegatingSubject0 = new DelegatingSubject(simplePrincipalCollection1, false, inetAddress0, (Session) null, defaultSecurityManager0);
      servletRequestWrapper0.getLocale();
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      ServletResponseWrapper servletResponseWrapper0 = new ServletResponseWrapper(servletResponse0);
      ServletResponseWrapper servletResponseWrapper1 = new ServletResponseWrapper(servletResponseWrapper0);
      ServletResponseWrapper servletResponseWrapper2 = new ServletResponseWrapper(servletResponseWrapper0);
      ServletResponseWrapper servletResponseWrapper3 = new ServletResponseWrapper(servletResponseWrapper0);
      ServletResponseWrapper servletResponseWrapper4 = new ServletResponseWrapper(servletResponseWrapper0);
      ServletResponseWrapper servletResponseWrapper5 = new ServletResponseWrapper(servletResponseWrapper3);
      ServletRequestWrapper servletRequestWrapper3 = new ServletRequestWrapper(servletRequestWrapper1);
      DefaultWebSecurityManager defaultWebSecurityManager1 = new DefaultWebSecurityManager(simpleAccountRealm1);
      ServletRequestWrapper servletRequestWrapper4 = new ServletRequestWrapper(servletRequestWrapper2);
      defaultWebSecurityManager1.bind(delegatingSubject0, servletRequestWrapper2, servletResponseWrapper2);
      assertTrue(defaultWebSecurityManager1.isHttpSessionMode());
  }
}