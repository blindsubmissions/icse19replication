/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 08:20:44 GMT 2018
 */

package com.lts.application.international;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.lts.application.ApplicationException;
import com.lts.application.international.MessageFormatter;
import java.io.StringReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MessageFormatter_ESTest extends MessageFormatter_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      String string0 = "";
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      // Undeclared exception!
      try { 
        messageFormatter0.getMessage("");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // com.lts.application.ApplicationMessages.error.keyNotFound
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      messageFormatter0.temp();
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      List list0 = messageFormatter0.loadCriticalBundles();
      assertTrue(list0.isEmpty());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      List list0 = MessageFormatter.buildList(objectArray0);
      assertEquals(4, list0.size());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = ", ";
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, ", ");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, ", ");
      MessageFormatter messageFormatter0 = new MessageFormatter();
      Throwable throwable0 = messageFormatter0.myLastException;
      String string1 = "hi there";
      ApplicationException applicationException0 = new ApplicationException((Throwable) null, "hi there", (Object[]) messageFormatter0.DEFAULT_BUNDLE_PATH);
      String string2 = "2Qn`osJg7}WLSt6'";
      applicationException0.setKey("2Qn`osJg7}WLSt6'");
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
  //Test case number: 5
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      Locale locale0 = Locale.KOREA;
      MessageFormatter messageFormatter0 = new MessageFormatter();
      Locale locale1 = Locale.TAIWAN;
      locale0.getDisplayScript(locale1);
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
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
  //Test case number: 6
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      List<String> list0 = ResourceBundle.Control.FORMAT_DEFAULT;
      String string0 = messageFormatter0.listToString(list0);
      assertEquals("java.class, java.properties", string0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.2148896539491203
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("resources.messages.standard");
      linkedList0.add((String) null);
      Locale locale0 = Locale.KOREA;
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      // Undeclared exception!
      try { 
        messageFormatter0.initializeResourceBundle((List<String>) linkedList0, (List<String>) linkedList0, locale0, classLoader0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      // Undeclared exception!
      try { 
        messageFormatter0.listResources(".;.#]o", (ClassLoader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      LinkedList<List<String>> linkedList0 = new LinkedList<List<String>>();
      ApplicationException applicationException0 = messageFormatter0.createLoadException(linkedList0);
      assertEquals("critical.com.lts.application.errors.resourceBundle.load", applicationException0.getKey());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      // Undeclared exception!
      try { 
        messageFormatter0.getMessage("resources.messages.standard", (Object) "resources.messages.standard", (Object) "resources.messages.standard", (Object) "resources.messages.standard");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // com.lts.application.ApplicationMessages.error.keyNotFound
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      List<String> list0 = ResourceBundle.Control.FORMAT_PROPERTIES;
      // Undeclared exception!
      try { 
        messageFormatter0.createLoadException(list0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to com.lts.application.international.MessageFormatter$LoadBundleError
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      // Undeclared exception!
      try { 
        messageFormatter0.getMessage((Throwable) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // com.lts.application.ApplicationMessages.error.keyNotFound
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      String string0 = ";'*!LfZBv{";
      Object[] objectArray0 = new Object[8];
      // Undeclared exception!
      try { 
        messageFormatter0.getMessage("] = ", (Object) "] = ", (Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // com.lts.application.ApplicationMessages.error.keyNotFound
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
      messageFormatter0.initializeResourceBundle();
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      // Undeclared exception!
      try { 
        messageFormatter0.initializeResourceBundle((List<String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      try { 
        messageFormatter0.getMessage("resources.messages.standard", (Object[]) messageFormatter0.DEFAULT_BUNDLE_PATH);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // com.lts.application.ApplicationMessages.error.keyNotFound
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      Throwable throwable0 = messageFormatter0.getLastException();
      assertNull(throwable0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
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
  //Test case number: 19
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      ApplicationException applicationException0 = new ApplicationException("S|.%J@k=1ni.", "S|.%J@k=1ni.", linkedList0);
      MessageFormatter.LoadBundleError messageFormatter_LoadBundleError0 = new MessageFormatter.LoadBundleError("S|.%J@k=1ni.", applicationException0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      List list0 = MessageFormatter.buildList((Object[]) null);
      assertTrue(list0.isEmpty());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      String string0 = messageFormatter0.listToString((List<String>) null);
      assertEquals("null", string0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.15374194270109
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      StringReader stringReader0 = new StringReader("kYF4.|gpCg");
      PropertyResourceBundle propertyResourceBundle0 = new PropertyResourceBundle(stringReader0);
      messageFormatter0.addBundle(propertyResourceBundle0);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      Object[] objectArray0 = null;
      try { 
        messageFormatter0.formatMessage("tIg\"BIe", (Object[]) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // com.lts.application.ApplicationMessages.error.keyNotFound
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      StringReader stringReader0 = new StringReader("kYFar4.|gpCg");
      PropertyResourceBundle propertyResourceBundle0 = new PropertyResourceBundle(stringReader0);
      messageFormatter0.addBundle(propertyResourceBundle0);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      FileSystemHandling.shouldAllThrowIOExceptions();
      ClassLoader.getSystemClassLoader();
      List<String> list0 = ResourceBundle.Control.FORMAT_PROPERTIES;
      Object object0 = new Object();
      Object[] objectArray0 = new Object[0];
      String string0 = messageFormatter0.formatMessage("kYFar4.|gpCg", objectArray0);
      assertEquals("", string0);
  }
}
