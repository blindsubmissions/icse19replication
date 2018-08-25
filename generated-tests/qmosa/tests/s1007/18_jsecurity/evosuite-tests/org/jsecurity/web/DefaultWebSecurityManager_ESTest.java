/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 11:41:14 GMT 2018
 */

package org.jsecurity.web;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.Serializable;
import java.net.InetAddress;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
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
import org.jsecurity.authc.SimpleAccount;
import org.jsecurity.authc.UsernamePasswordToken;
import org.jsecurity.authz.Permission;
import org.jsecurity.crypto.BlowfishCipher;
import org.jsecurity.realm.Realm;
import org.jsecurity.realm.SimpleAccountRealm;
import org.jsecurity.session.ProxiedSession;
import org.jsecurity.session.Session;
import org.jsecurity.session.mgt.SessionManager;
import org.jsecurity.subject.PrincipalCollection;
import org.jsecurity.subject.SimplePrincipalCollection;
import org.jsecurity.subject.Subject;
import org.jsecurity.web.DefaultWebSecurityManager;
import org.jsecurity.web.WebRememberMeManager;
import org.jsecurity.web.session.DefaultWebSessionManager;
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
      Serializable serializable0 = null;
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.setSessionMode("org.jsecurity.mgt.DefaultSecurityManager");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid sessionMode [org.jsecurity.mgt.DefaultSecurityManager].  Allowed values are public static final String constants in the org.jsecurity.web.DefaultWebSecurityManager class: 'http' or 'jsecurity', with 'http' being the default.
         //
         verifyException("org.jsecurity.web.DefaultWebSecurityManager", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
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
  //Test case number: 2
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
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
  //Test case number: 3
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-39);
      byteArray0[1] = (byte)71;
      byteArray0[2] = (byte) (-118);
      byteArray0[3] = (byte)1;
      byteArray0[4] = (byte)2;
      byteArray0[5] = (byte)8;
      byteArray0[6] = (byte)15;
      byteArray0[7] = (byte)0;
      defaultWebSecurityManager0.setRememberMeEncryptionCipherKey(byteArray0);
      defaultWebSecurityManager0.isHttpSessionMode();
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
  //Test case number: 4
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager(simpleAccountRealm0);
      Integer integer0 = new Integer(1000);
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
  //Test case number: 5
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection();
      SimplePrincipalCollection simplePrincipalCollection1 = new SimplePrincipalCollection(simplePrincipalCollection0);
      simplePrincipalCollection0.addAll((PrincipalCollection) simplePrincipalCollection1);
      Session session0 = null;
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(servletRequest0).getRemoteHost();
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest0);
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      ServletResponseWrapper servletResponseWrapper0 = new ServletResponseWrapper(servletResponse0);
      Subject subject0 = defaultWebSecurityManager0.createSubject((PrincipalCollection) simplePrincipalCollection0, false, (Session) null, (ServletRequest) servletRequestWrapper0, (ServletResponse) servletResponseWrapper0);
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
  //Test case number: 6
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(servletRequest0).getRemoteHost();
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      ServletResponseWrapper servletResponseWrapper0 = new ServletResponseWrapper(servletResponse0);
      ServletResponseWrapper servletResponseWrapper1 = new ServletResponseWrapper(servletResponseWrapper0);
      Session session0 = null;
      defaultWebSecurityManager0.createSubject((Session) null, servletRequest0, (ServletResponse) servletResponseWrapper1);
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
  //Test case number: 7
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      BlowfishCipher blowfishCipher0 = new BlowfishCipher();
      BlowfishCipher.main((String[]) null);
      defaultWebSecurityManager0.setRememberMeCipher(blowfishCipher0);
      byte[] byteArray0 = new byte[9];
      defaultWebSecurityManager0.destroy();
      byteArray0[0] = (byte) (-1);
      SessionManager sessionManager0 = defaultWebSecurityManager0.newSessionManagerInstance();
      defaultWebSecurityManager0.setSessionManager(sessionManager0);
      byteArray0[1] = (byte) (-37);
      byteArray0[2] = (byte)61;
      byteArray0[3] = (byte)59;
      byteArray0[4] = (byte)0;
      byte byte0 = (byte)61;
      byteArray0[5] = (byte)61;
      byteArray0[6] = (byte)17;
      byteArray0[8] = (byte)0;
      defaultWebSecurityManager0.setRememberMeEncryptionCipherKey(byteArray0);
      defaultWebSecurityManager0.setRememberMeCookiePath("i3wn3IABQ]n@]a=0B~");
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
  //Test case number: 8
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.setSessionIdCookiePath("M$C-8GJ[p3CX?]I");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // The convenience passthrough methods for setting session id cookie attributes are only available when the underlying SessionManager implementation is org.jsecurity.web.session.DefaultWebSessionManager, which is enabled by default when the sessionMode is 'jsecurity'.
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
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/tmp/jsecurity-ehcache");
      FileSystemHandling.shouldThrowIOException(evoSuiteFile0);
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest0);
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      String string0 = defaultWebSecurityManager0.getSessionMode();
      assertEquals("http", string0);
      assertTrue(defaultWebSecurityManager0.isHttpSessionMode());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      defaultWebSecurityManager0.setSessionMode("jsecurity");
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(servletRequest0).getRemoteHost();
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest0);
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      ServletResponseWrapper servletResponseWrapper0 = new ServletResponseWrapper(servletResponse0);
      defaultWebSecurityManager0.createSubject((Session) null, (ServletRequest) servletRequestWrapper0, (ServletResponse) servletResponseWrapper0);
      defaultWebSecurityManager0.setSessionIdCookieName("get() - in thread [");
      defaultWebSecurityManager0.isHttpSessionMode();
      ServletResponseWrapper servletResponseWrapper1 = new ServletResponseWrapper(servletResponseWrapper0);
      DefaultWebSecurityManager defaultWebSecurityManager1 = new DefaultWebSecurityManager();
      // Undeclared exception!
      try { 
        defaultWebSecurityManager1.createSubject((ServletRequest) servletRequestWrapper0, (ServletResponse) servletResponseWrapper0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // javax.servlet.ServletRequestWrapper cannot be cast to javax.servlet.http.HttpServletRequest
         //
         verifyException("org.jsecurity.web.session.ServletContainerSessionManager", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
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
  //Test case number: 12
  /*Coverage entropy=1.2658567518727373
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      defaultWebSecurityManager0.setSessionMode("jsecurity");
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, false);
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest0);
      servletRequestWrapper0.getRequest();
      ServletRequestWrapper servletRequestWrapper1 = new ServletRequestWrapper(servletRequestWrapper0);
      ServletRequestWrapper servletRequestWrapper2 = new ServletRequestWrapper(servletRequestWrapper1);
      ServletRequestWrapper servletRequestWrapper3 = new ServletRequestWrapper(servletRequestWrapper0);
      defaultWebSecurityManager0.setSessionMode("jsecurity");
      DefaultWebSessionManager defaultWebSessionManager0 = new DefaultWebSessionManager();
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      ServletResponseWrapper servletResponseWrapper0 = new ServletResponseWrapper(servletResponse0);
      // Undeclared exception!
      try { 
        defaultWebSessionManager0.getSession(servletRequestWrapper0, servletResponseWrapper0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // javax.servlet.ServletRequestWrapper cannot be cast to javax.servlet.http.HttpServletRequest
         //
         verifyException("org.jsecurity.web.WebUtils", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      defaultWebSecurityManager0.getRealms();
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.setSessionIdCookieMaxAge(50);
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
  /*Coverage entropy=2.253857589601352
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(servletRequest0).getRemoteHost();
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      ServletResponseWrapper servletResponseWrapper0 = new ServletResponseWrapper(servletResponse0);
      Subject subject0 = defaultWebSecurityManager0.createSubject((Session) null, servletRequest0, (ServletResponse) servletResponseWrapper0);
      assertFalse(subject0.isAuthenticated());
      
      ServletResponseWrapper servletResponseWrapper1 = new ServletResponseWrapper(servletResponseWrapper0);
      ServletRequest servletRequest1 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest1);
      ServletRequestWrapper servletRequestWrapper1 = new ServletRequestWrapper(servletRequestWrapper0);
      defaultWebSecurityManager0.setSessionMode("http");
      assertTrue(defaultWebSecurityManager0.isHttpSessionMode());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.1006789212792607
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      defaultWebSecurityManager0.setSessionMode("jsecurity");
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(servletRequest0).getRemoteHost();
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest0);
      ServletRequestWrapper servletRequestWrapper1 = new ServletRequestWrapper(servletRequestWrapper0);
      ServletRequestWrapper servletRequestWrapper2 = new ServletRequestWrapper(servletRequestWrapper1);
      ServletRequestWrapper servletRequestWrapper3 = new ServletRequestWrapper(servletRequestWrapper2);
      ServletRequestWrapper servletRequestWrapper4 = new ServletRequestWrapper(servletRequestWrapper3);
      ServletRequestWrapper servletRequestWrapper5 = new ServletRequestWrapper(servletRequestWrapper1);
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      ServletResponseWrapper servletResponseWrapper0 = new ServletResponseWrapper(servletResponse0);
      ServletResponseWrapper servletResponseWrapper1 = new ServletResponseWrapper(servletResponseWrapper0);
      ServletResponseWrapper servletResponseWrapper2 = new ServletResponseWrapper(servletResponseWrapper0);
      ServletRequestWrapper servletRequestWrapper6 = new ServletRequestWrapper(servletRequestWrapper0);
      Subject subject0 = defaultWebSecurityManager0.createSubject((Session) null, (ServletRequest) servletRequestWrapper5, (ServletResponse) servletResponseWrapper0);
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection();
      SimplePrincipalCollection simplePrincipalCollection1 = new SimplePrincipalCollection(simplePrincipalCollection0);
      Subject subject1 = defaultWebSecurityManager0.createSubject((PrincipalCollection) simplePrincipalCollection0, true, (Session) null, (ServletRequest) servletRequestWrapper2, (ServletResponse) servletResponseWrapper2);
      defaultWebSecurityManager0.bind(subject0, servletRequestWrapper2, servletResponseWrapper1);
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.bind(subject1, servletRequestWrapper3, servletResponseWrapper0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No ServletRequest found in ThreadContext. Make sure WebUtils.bind() is being called. (typically called by JSecurityFilter)  This could also happen when running integration tests that don't properly call WebUtils.bind().
         //
         verifyException("org.jsecurity.web.WebUtils", e);
      }
  }
}