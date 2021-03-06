/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 18:47:19 GMT 2018
 */

package com.lts.application.international;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.lts.application.ApplicationException;
import com.lts.application.international.MessageFormatter;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringReader;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MessageFormatter_ESTest extends MessageFormatter_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MessageFormatter.LoadBundleError messageFormatter_LoadBundleError0 = new MessageFormatter.LoadBundleError((String) null, (Throwable) null);
      MessageFormatter messageFormatter0 = new MessageFormatter();
      Object[] objectArray0 = new Object[3];
      objectArray0[0] = (Object) messageFormatter0;
      objectArray0[1] = (Object) messageFormatter_LoadBundleError0;
      objectArray0[2] = (Object) messageFormatter_LoadBundleError0;
      List<String> list0 = ResourceBundle.Control.FORMAT_DEFAULT;
      ResourceBundle.Control resourceBundle_Control0 = ResourceBundle.Control.getControl(list0);
      // Undeclared exception!
      try { 
        ResourceBundle.getBundle((String) null, resourceBundle_Control0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ResourceBundle$CacheKey", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      List<String> list0 = ResourceBundle.Control.FORMAT_CLASS;
      // Undeclared exception!
      try { 
        messageFormatter0.tryLoad("8={H6?", "critical.question.saveData");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ResourceBundle", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ClassLoader classLoader1 = classLoader0.getParent();
      messageFormatter0.listResources("Exception", classLoader1);
      // Undeclared exception!
      try { 
        messageFormatter0.addResourceBundles();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      Locale locale0 = Locale.CHINA;
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      messageFormatter0.createLoadException(linkedList0);
      try { 
        messageFormatter0.initializeResourceBundle((List<String>) linkedList0, (List<String>) linkedList0, locale0, classLoader0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Could not find any resource bundle give names: ; and resource path: 
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      List<String> list0 = ResourceBundle.Control.FORMAT_DEFAULT;
      messageFormatter0.loadCriticalBundles();
      messageFormatter0.listToString(list0);
      // Undeclared exception!
      try { 
        messageFormatter0.addResourceBundles();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      String string0 = null;
      String string1 = "TJ)o\\{lRS*hW|}0u]!h";
      Object[] objectArray0 = new Object[8];
      objectArray0[0] = (Object) messageFormatter0;
      Object object0 = new Object();
      objectArray0[1] = object0;
      List list0 = MessageFormatter.buildList(objectArray0);
      objectArray0[2] = (Object) messageFormatter0;
      objectArray0[3] = (Object) messageFormatter0;
      objectArray0[4] = (Object) "TJ)o{lRS*hW|}0u]!h";
      MockThrowable mockThrowable0 = new MockThrowable();
      String string2 = "vLyE";
      StringReader stringReader0 = new StringReader("vLyE");
      PropertyResourceBundle propertyResourceBundle0 = new PropertyResourceBundle(stringReader0);
      ApplicationException applicationException0 = new ApplicationException(mockThrowable0, "TJ)o{lRS*hW|}0u]!h", propertyResourceBundle0, list0);
      applicationException0.getStackTrace();
      // Undeclared exception!
      try { 
        messageFormatter0.getMessage((Throwable) applicationException0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // com.lts.application.ApplicationMessages.error.keyNotFound
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      List<String> list0 = ResourceBundle.Control.FORMAT_DEFAULT;
      try { 
        messageFormatter0.initializeResourceBundle(list0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Could not find any resource bundle give names: messages; and resource path: java.class, java.properties
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      MockThrowable mockThrowable0 = new MockThrowable();
      // Undeclared exception!
      try { 
        messageFormatter0.getMessage((Throwable) mockThrowable0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // com.lts.application.ApplicationMessages.error.keyNotFound
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      String string0 = null;
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) messageFormatter0;
      try { 
        messageFormatter0.getMessage((String) null, objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // com.lts.application.ApplicationMessages.error.keyNotFound
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      String string0 = null;
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) null;
      messageFormatter0.temp();
      // Undeclared exception!
      try { 
        messageFormatter0.tryLoad((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ResourceBundle", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      LinkedList<ApplicationException> linkedList0 = new LinkedList<ApplicationException>();
      MockThrowable mockThrowable0 = new MockThrowable("_(^]vlq6f>A+)JDC");
      ApplicationException applicationException0 = new ApplicationException(mockThrowable0, "Inq");
      linkedList0.add(applicationException0);
      // Undeclared exception!
      try { 
        messageFormatter0.createLoadException(linkedList0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.lts.application.ApplicationException cannot be cast to com.lts.application.international.MessageFormatter$LoadBundleError
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      String string0 = "\\)~";
      StringReader stringReader0 = new StringReader("; and resource path: ");
      PropertyResourceBundle propertyResourceBundle0 = new PropertyResourceBundle(stringReader0);
      Integer integer0 = new Integer((-3812));
      // Undeclared exception!
      try { 
        messageFormatter0.getMessage(")~", (Object) propertyResourceBundle0, (Object) integer0, (Object) "; and resource path: ");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // com.lts.application.ApplicationMessages.error.keyNotFound
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      List<String> list0 = ResourceBundle.Control.FORMAT_DEFAULT;
      ResourceBundle.Control resourceBundle_Control0 = ResourceBundle.Control.getControl(list0);
      String string0 = "rW;O%x%,7@1|bG<g";
      List<String> list1 = resourceBundle_Control0.getFormats("rW;O%x%,7@1|bG<g");
      ResourceBundle.Control.getControl(list0);
      messageFormatter0.listToString(list1);
      messageFormatter0.getLastException();
      try { 
        messageFormatter0.initializeResourceBundle(list0, list1);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Could not find any resource bundle give names: java.class, java.properties; and resource path: java.class, java.properties
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      messageFormatter0.initializeResourceBundle();
      MessageFormatter.buildList(messageFormatter0.DEFAULT_BUNDLE_PATH);
      messageFormatter0.temp();
      StringReader stringReader0 = new StringReader("resources.messages.standard");
      PropertyResourceBundle propertyResourceBundle0 = new PropertyResourceBundle(stringReader0);
      messageFormatter0.addBundle(propertyResourceBundle0);
      Locale locale0 = Locale.GERMANY;
      ClassLoader.getSystemClassLoader();
      List<String> list0 = ResourceBundle.Control.FORMAT_CLASS;
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ClassLoader classLoader1 = classLoader0.getParent();
      try { 
        messageFormatter0.initializeResourceBundle(list0, list0, locale0, classLoader1);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Could not find any resource bundle give names: java.class; and resource path: java.class
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      List<String> list0 = null;
      messageFormatter0.listToString((List<String>) null);
      Object[] objectArray0 = new Object[0];
      // Undeclared exception!
      try { 
        ResourceBundle.Control.getNoFallbackControl((List<String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ResourceBundle$Control", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      // Undeclared exception!
      try { 
        messageFormatter0.tryLoad("", "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ResourceBundle", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      Object object0 = new Object();
      Object object1 = new Object();
      Object object2 = new Object();
      Object object3 = new Object();
      Object object4 = new Object();
      Object object5 = new Object();
      Object object6 = new Object();
      Object object7 = new Object();
      MessageFormatter.buildList((Object[]) null);
      MessageFormatter messageFormatter1 = new MessageFormatter();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      List<String> list0 = ResourceBundle.Control.FORMAT_PROPERTIES;
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ClassLoader classLoader1 = classLoader0.getParent();
      assertFalse(classLoader1.equals((Object)classLoader0));
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, true);
      MessageFormatter messageFormatter0 = new MessageFormatter();
      MessageFormatter.buildList(messageFormatter0.DEFAULT_BUNDLE_PATH);
      // Undeclared exception!
      try { 
        messageFormatter0.formatMessage("critical.com.lts.application.errors.resourceBundle.load", (Object[]) null, (ResourceBundle) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.007556307437838
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      messageFormatter0.initializeResourceBundle();
      MessageFormatter.buildList(messageFormatter0.DEFAULT_BUNDLE_PATH);
      Object object0 = new Object();
      MessageFormatter messageFormatter1 = new MessageFormatter();
      messageFormatter1.temp();
      StringReader stringReader0 = new StringReader("8={H6?");
      StringReader stringReader1 = new StringReader(".");
      PropertyResourceBundle propertyResourceBundle0 = new PropertyResourceBundle(stringReader1);
      propertyResourceBundle0.getKeys();
      messageFormatter0.addBundle(propertyResourceBundle0);
      Locale locale0 = Locale.GERMANY;
      ClassLoader.getSystemClassLoader();
      messageFormatter0.getMessage(".");
      Object object1 = new Object();
      Object object2 = new Object();
      Integer integer0 = new Integer(1699);
      // Undeclared exception!
      try { 
        messageFormatter0.getMessage("", (Object) integer0, (Object) messageFormatter1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // com.lts.application.ApplicationMessages.error.keyNotFound
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }
}
