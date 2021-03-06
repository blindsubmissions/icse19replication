/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 14:23:00 GMT 2018
 */

package org.jsecurity.web;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedReader;
import java.net.InetAddress;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestWrapper;
import javax.servlet.ServletResponse;
import javax.servlet.ServletResponseWrapper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.jsecurity.authc.AuthenticationToken;
import org.jsecurity.authz.ModularRealmAuthorizer;
import org.jsecurity.authz.Permission;
import org.jsecurity.cache.HashtableCacheManager;
import org.jsecurity.mgt.DefaultSecurityManager;
import org.jsecurity.realm.Realm;
import org.jsecurity.realm.SimpleAccountRealm;
import org.jsecurity.session.Session;
import org.jsecurity.session.SessionListener;
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
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager(simpleAccountRealm0);
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
  //Test case number: 1
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      String string0 = " class: '";
      HashtableCacheManager hashtableCacheManager0 = new HashtableCacheManager();
      hashtableCacheManager0.getCache("");
      hashtableCacheManager0.getCache("jsecurity");
      hashtableCacheManager0.getCache(" class: '");
      hashtableCacheManager0.getCache("jsecurity");
      defaultWebSecurityManager0.setCacheManager(hashtableCacheManager0);
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.setSessionIdCookieName(" class: '");
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
      PrincipalCollection principalCollection0 = null;
      LinkedList<Permission> linkedList0 = new LinkedList<Permission>();
      defaultWebSecurityManager0.setRememberMeCookiePath(":Q]");
      defaultWebSecurityManager0.isPermitted((PrincipalCollection) null, (List<Permission>) linkedList0);
      defaultWebSecurityManager0.isHttpSessionMode();
      String string0 = "";
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.setSessionIdCookiePath("");
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
  /*Coverage entropy=1.7478680974667573
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager(simpleAccountRealm0);
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest0);
      LinkedHashSet<Realm> linkedHashSet0 = new LinkedHashSet<Realm>();
      linkedHashSet0.add(simpleAccountRealm0);
      DefaultWebSecurityManager defaultWebSecurityManager1 = new DefaultWebSecurityManager(linkedHashSet0);
      DefaultWebSecurityManager defaultWebSecurityManager2 = new DefaultWebSecurityManager();
      // Undeclared exception!
      try { 
        defaultWebSecurityManager2.setSessionMode((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid sessionMode [null].  Allowed values are public static final String constants in the org.jsecurity.web.DefaultWebSecurityManager class: 'http' or 'jsecurity', with 'http' being the default.
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
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager(simpleAccountRealm0);
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest0);
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      ServletResponseWrapper servletResponseWrapper0 = new ServletResponseWrapper(servletResponse0);
      defaultWebSecurityManager0.setSessionMode("jsecurity");
      servletResponseWrapper0.resetBuffer();
      defaultWebSecurityManager0.getSessionMode();
      DefaultWebSecurityManager defaultWebSecurityManager1 = new DefaultWebSecurityManager();
      defaultWebSecurityManager0.getSessionMode();
      ServletContainerSessionManager servletContainerSessionManager0 = new ServletContainerSessionManager();
      // Undeclared exception!
      try { 
        servletContainerSessionManager0.getStartTimestamp("jsecurity");
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
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm(")p)@vAiq(`uz-1=/");
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager(simpleAccountRealm0);
      Integer integer0 = new Integer((-759));
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.setRememberMeCookieMaxAge(integer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
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
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(servletRequest0).getLocalPort();
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest0);
      ServletRequestWrapper servletRequestWrapper1 = new ServletRequestWrapper(servletRequestWrapper0);
      servletRequestWrapper0.getLocalPort();
      String string0 = "public static final String constants in the ";
      servletRequestWrapper1.setCharacterEncoding("public static final String constants in the ");
      ServletResponse servletResponse0 = null;
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)108;
      byteArray0[1] = (byte)108;
      byteArray0[2] = (byte)108;
      byteArray0[3] = (byte)108;
      byteArray0[4] = (byte)108;
      byteArray0[5] = (byte)108;
      byteArray0[6] = (byte)108;
      byteArray0[7] = (byte)108;
      byteArray0[8] = (byte)108;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm("iNk,FRs]'");
      SimpleAccountRealm simpleAccountRealm1 = new SimpleAccountRealm("J:");
      SimpleAccountRealm simpleAccountRealm2 = new SimpleAccountRealm();
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager(simpleAccountRealm2);
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.setSessionIdCookieMaxAge((byte)108);
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
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm("pa3yZ(O]{,l");
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection();
      simpleAccountRealm0.init();
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      SimpleAccountRealm simpleAccountRealm1 = new SimpleAccountRealm();
      DefaultWebSecurityManager defaultWebSecurityManager1 = new DefaultWebSecurityManager(simpleAccountRealm1);
      Session session0 = null;
      defaultWebSecurityManager1.getPrincipals((Session) null);
      defaultWebSecurityManager1.newSessionManagerInstance();
      ServletRequest servletRequest0 = null;
      boolean boolean0 = true;
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      ServletResponseWrapper servletResponseWrapper0 = new ServletResponseWrapper(servletResponse0);
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.createSubject((PrincipalCollection) null, true, (Session) null, (ServletRequest) null, (ServletResponse) servletResponseWrapper0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsecurity.web.WebUtils", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm("pa3yZ(O]{,l");
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      DefaultWebSecurityManager defaultWebSecurityManager1 = new DefaultWebSecurityManager(simpleAccountRealm0);
      DefaultWebSecurityManager defaultWebSecurityManager2 = new DefaultWebSecurityManager();
      Session session0 = null;
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(servletRequest0).getRemoteHost();
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest0);
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      ServletResponseWrapper servletResponseWrapper0 = new ServletResponseWrapper(servletResponse0);
      Subject subject0 = defaultWebSecurityManager2.createSubject((Session) null, (ServletRequest) servletRequestWrapper0, (ServletResponse) servletResponseWrapper0);
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.bind(subject0);
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
  /*Coverage entropy=1.893788232391138
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager(simpleAccountRealm0);
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      ServletResponseWrapper servletResponseWrapper0 = new ServletResponseWrapper(servletResponse0);
      defaultWebSecurityManager0.setSessionMode("jsecurity");
      servletResponseWrapper0.resetBuffer();
      defaultWebSecurityManager0.getSessionMode();
      defaultWebSecurityManager0.getSessionMode();
      DelegatingSubject delegatingSubject0 = new DelegatingSubject(defaultWebSecurityManager0);
      defaultWebSecurityManager0.bind(delegatingSubject0, servletRequest0, servletResponseWrapper0);
      Boolean boolean0 = new Boolean("jsecurity");
      ServletRequest servletRequest1 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      doReturn((BufferedReader) null).when(servletRequest1).getReader();
      doReturn(0).when(servletRequest1).getServerPort();
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest1);
      servletRequestWrapper0.getReader();
      servletRequestWrapper0.getServerPort();
      ServletResponseWrapper servletResponseWrapper1 = new ServletResponseWrapper(servletResponseWrapper0);
      DefaultWebSessionManager defaultWebSessionManager0 = new DefaultWebSessionManager();
      DefaultWebSecurityManager defaultWebSecurityManager1 = new DefaultWebSecurityManager(simpleAccountRealm0);
      assertEquals("http", defaultWebSecurityManager1.getSessionMode());
      
      defaultWebSecurityManager0.setSessionIdCookieName("NN;>[c");
      assertEquals("jsecurity", defaultWebSecurityManager0.getSessionMode());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.5498260458782016
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager(simpleAccountRealm0);
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      defaultWebSecurityManager0.setSessionMode("http");
      defaultWebSecurityManager0.getSessionMode();
      DefaultWebSecurityManager defaultWebSecurityManager1 = new DefaultWebSecurityManager(simpleAccountRealm0);
      DefaultWebSessionManager defaultWebSessionManager0 = new DefaultWebSessionManager();
      try { 
        defaultWebSessionManager0.retrieveSession("http");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // There is no session with id [http]
         //
         verifyException("org.jsecurity.session.mgt.eis.CachingSessionDAO", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm("pa3yZ(O]{,l");
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      DefaultWebSecurityManager defaultWebSecurityManager1 = new DefaultWebSecurityManager(simpleAccountRealm0);
      DefaultWebSecurityManager defaultWebSecurityManager2 = new DefaultWebSecurityManager();
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(servletRequest0).getRemoteHost();
      doReturn(0).when(servletRequest0).getServerPort();
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest0);
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      ServletResponseWrapper servletResponseWrapper0 = new ServletResponseWrapper(servletResponse0);
      Subject subject0 = defaultWebSecurityManager2.createSubject((Session) null, (ServletRequest) servletRequestWrapper0, (ServletResponse) servletResponseWrapper0);
      servletRequestWrapper0.getServerPort();
      ServletResponseWrapper servletResponseWrapper1 = new ServletResponseWrapper(servletResponseWrapper0);
      DefaultWebSessionManager defaultWebSessionManager0 = new DefaultWebSessionManager();
      LinkedHashSet<DefaultWebSecurityManager> linkedHashSet0 = new LinkedHashSet<DefaultWebSecurityManager>();
      defaultWebSessionManager0.enableSessionValidationIfNecessary();
      subject0.logout();
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
  //Test case number: 13
  /*Coverage entropy=1.4750763110546947
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm("].  There is no space from ");
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      DefaultWebSecurityManager defaultWebSecurityManager1 = new DefaultWebSecurityManager();
      defaultWebSecurityManager1.setRememberMeEncryptionCipherKeyBase64("_PRINCIPALS_SESSION_KEY");
      Session session0 = null;
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, false);
      Boolean boolean0 = new Boolean("89d2_Q&HXWv^F<");
      defaultWebSecurityManager0.getPrincipals((Session) null);
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      DelegatingSubject delegatingSubject0 = new DelegatingSubject((PrincipalCollection) null, true, inetAddress0, (Session) null, defaultWebSecurityManager1);
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      ServletResponseWrapper servletResponseWrapper0 = new ServletResponseWrapper(servletResponse0);
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.bind(delegatingSubject0, servletRequest0, servletResponseWrapper0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No ServletRequest found in ThreadContext. Make sure WebUtils.bind() is being called. (typically called by JSecurityFilter)  This could also happen when running integration tests that don't properly call WebUtils.bind().
         //
         verifyException("org.jsecurity.web.WebUtils", e);
      }
  }
}
