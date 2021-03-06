/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 07 14:19:38 GMT 2018
 */

package com.liferay.portal.security.pacl.checker;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.liferay.portal.kernel.log.Jdk14LogImpl;
import com.liferay.portal.security.pacl.PACLPolicy;
import com.liferay.portal.security.pacl.checker.DefaultRejectChecker;
import com.liferay.portal.security.pacl.checker.NetChecker;
import com.liferay.portal.security.pacl.checker.PortalHookChecker;
import com.liferay.portal.security.pacl.checker.PortalMessageBusChecker;
import com.liferay.portal.security.pacl.checker.PortalRuntimeChecker;
import com.liferay.portal.security.pacl.checker.PortalServiceChecker;
import com.liferay.portal.security.pacl.checker.RuntimeChecker;
import com.liferay.portal.security.pacl.checker.SQLChecker;
import com.liferay.portal.security.pacl.checker.SocketChecker;
import java.io.ObjectStreamConstants;
import java.io.SerializablePermission;
import java.util.logging.Logger;
import net.sf.jsqlparser.statement.update.Update;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BaseChecker_ESTest extends BaseChecker_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PortalMessageBusChecker portalMessageBusChecker0 = new PortalMessageBusChecker();
      // Undeclared exception!
      try { 
        portalMessageBusChecker0.initListenDestinationNames();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portal.security.pacl.checker.BaseChecker", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DefaultRejectChecker defaultRejectChecker0 = new DefaultRejectChecker();
      SerializablePermission serializablePermission0 = ObjectStreamConstants.SUBSTITUTION_PERMISSION;
      // Undeclared exception!
      try { 
        defaultRejectChecker0.checkPermission(serializablePermission0);
        fail("Expecting exception: SecurityException");
      
      } catch(SecurityException e) {
         //
         // Permission java.io.SerializablePermission attempted to enableSubstitution
         //
         verifyException("com.liferay.portal.security.pacl.checker.BaseChecker", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NetChecker netChecker0 = new NetChecker();
      netChecker0.getPACLPolicy();
      netChecker0.setPACLPolicy((PACLPolicy) null);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PortalServiceChecker portalServiceChecker0 = new PortalServiceChecker();
      // Undeclared exception!
      try { 
        portalServiceChecker0.afterPropertiesSet();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portal.security.pacl.checker.BaseChecker", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PortalMessageBusChecker portalMessageBusChecker0 = new PortalMessageBusChecker();
      portalMessageBusChecker0.getPortalClassLoader();
      PortalServiceChecker portalServiceChecker0 = new PortalServiceChecker();
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PortalHookChecker portalHookChecker0 = new PortalHookChecker();
      boolean boolean0 = portalHookChecker0.isJSPCompiler("", "");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PortalHookChecker portalHookChecker0 = new PortalHookChecker();
      ClassLoader classLoader0 = portalHookChecker0.getCommonClassLoader();
      assertNotNull(classLoader0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DefaultRejectChecker defaultRejectChecker0 = new DefaultRejectChecker();
      ClassLoader classLoader0 = defaultRejectChecker0.getSystemClassLoader();
      assertNotNull(classLoader0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PortalHookChecker portalHookChecker0 = new PortalHookChecker();
      // Undeclared exception!
      try { 
        portalHookChecker0.getClassLoader();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portal.security.pacl.checker.BaseChecker", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PortalHookChecker portalHookChecker0 = new PortalHookChecker();
      // Undeclared exception!
      try { 
        portalHookChecker0.initCustomJspDir();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portal.security.pacl.checker.BaseChecker", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RuntimeChecker runtimeChecker0 = new RuntimeChecker();
      // Undeclared exception!
      try { 
        runtimeChecker0.getServletContextName();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portal.security.pacl.checker.BaseChecker", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PortalHookChecker portalHookChecker0 = new PortalHookChecker();
      Logger logger0 = Logger.getGlobal();
      Jdk14LogImpl jdk14LogImpl0 = new Jdk14LogImpl(logger0);
      // Undeclared exception!
      try { 
        portalHookChecker0.throwSecurityException(jdk14LogImpl0, "<Z6?mA a+m?Ye}hG-");
        fail("Expecting exception: SecurityException");
      
      } catch(SecurityException e) {
         //
         // <Z6?mA a+m?Ye}hG-
         //
         verifyException("com.liferay.portal.security.pacl.checker.BaseChecker", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SocketChecker socketChecker0 = new SocketChecker();
      // Undeclared exception!
      try { 
        socketChecker0.initConnectHostsAndPorts();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portal.security.pacl.checker.BaseChecker", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PortalMessageBusChecker portalMessageBusChecker0 = new PortalMessageBusChecker();
      // Undeclared exception!
      try { 
        portalMessageBusChecker0.getProperty("e]8HtlMW|AV3J");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portal.security.pacl.checker.BaseChecker", e);
      }
  }
}
