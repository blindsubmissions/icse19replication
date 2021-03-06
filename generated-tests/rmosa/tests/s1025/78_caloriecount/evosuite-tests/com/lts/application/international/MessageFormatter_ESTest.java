/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 16:59:37 GMT 2018
 */

package com.lts.application.international;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.lts.application.ApplicationException;
import com.lts.application.international.MessageFormatter;
import java.io.BufferedInputStream;
import java.io.SequenceInputStream;
import java.io.StringReader;
import java.util.Collection;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MessageFormatter_ESTest extends MessageFormatter_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      // Undeclared exception!
      try { 
        messageFormatter0.listResources("resources.messages.standard", (ClassLoader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Object[] objectArray0 = new Object[10];
      List list0 = MessageFormatter.buildList(objectArray0);
      assertEquals(10, list0.size());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      // Undeclared exception!
      try { 
        messageFormatter0.getMessage("resources.messages.standard", (Object) "resources.messages.standard", (Object) "resources.messages.standard");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // com.lts.application.ApplicationMessages.error.keyNotFound
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Throwable throwable0 = null;
      Enumeration<BufferedInputStream> enumeration0 = (Enumeration<BufferedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(sequenceInputStream0, 2);
      String string0 = "com.lts.application.ApplicationMessages";
      ApplicationException applicationException0 = new ApplicationException((Throwable) null, "com.lts.application.ApplicationMessages", sequenceInputStream0);
      MessageFormatter.LoadBundleError messageFormatter_LoadBundleError0 = new MessageFormatter.LoadBundleError("lhr/n$97", applicationException0);
      Locale.LanguageRange locale_LanguageRange0 = null;
      try {
        locale_LanguageRange0 = new Locale.LanguageRange("7kqV=\" ~^R>w_[4GD'", 2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // weight=2.0
         //
         verifyException("java.util.Locale$LanguageRange", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      List list0 = messageFormatter0.loadCriticalBundles();
      assertEquals(0, list0.size());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
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
  //Test case number: 6
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      Throwable throwable0 = messageFormatter0.getLastException();
      assertNull(throwable0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
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
  //Test case number: 8
  /*Coverage entropy=1.3904377949394804
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      List<String> list0 = ResourceBundle.Control.FORMAT_DEFAULT;
      Locale locale0 = Locale.CANADA;
      Locale.getISOLanguages();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      try { 
        messageFormatter0.initializeResourceBundle(list0, list0, locale0, classLoader0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Could not find any resource bundle give names: java.class, java.properties; and resource path: java.class, java.properties
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      MockThrowable mockThrowable0 = new MockThrowable("resources.messages.standard");
      messageFormatter0.myLastException = (Throwable) mockThrowable0;
      mockThrowable0.getLocalizedMessage();
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
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      // Undeclared exception!
      try { 
        messageFormatter0.getMessage("resources.messages.standard");
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      ApplicationException applicationException0 = messageFormatter0.createLoadException(linkedList0);
      assertEquals("critical.com.lts.application.errors.resourceBundle.load", applicationException0.getKey());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      messageFormatter0.temp();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      assertNotNull(classLoader0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      MockThrowable mockThrowable0 = new MockThrowable();
      StringReader stringReader0 = new StringReader("resources.messages.standard");
      PropertyResourceBundle propertyResourceBundle0 = new PropertyResourceBundle(stringReader0);
      messageFormatter0.addBundle(propertyResourceBundle0);
      propertyResourceBundle0.getKeys();
      Object object0 = new Object();
      try { 
        messageFormatter0.formatMessage("8.L", (Object[]) null);
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
      List<String> list0 = ResourceBundle.Control.FORMAT_DEFAULT;
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
  //Test case number: 18
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      messageFormatter0.listToString((List<String>) null);
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      assertNotNull(classLoader0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      ApplicationException applicationException0 = new ApplicationException("resources.messages.standard", "resources.messages.standard", "resources.messages.standard");
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
  //Test case number: 20
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      StringReader stringReader0 = new StringReader("resources.messages.standard");
      PropertyResourceBundle propertyResourceBundle0 = new PropertyResourceBundle(stringReader0);
      messageFormatter0.addBundle(propertyResourceBundle0);
      propertyResourceBundle0.getKeys();
      String string0 = messageFormatter0.getMessage("resources.messages.standard", (Object[]) messageFormatter0.DEFAULT_BUNDLE_PATH);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      assertFalse(linkedList0.contains(string0));
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      // Undeclared exception!
      try { 
        messageFormatter0.tryLoad((String) null, "resources.messages.standard");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ResourceBundle", e);
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      List list0 = MessageFormatter.buildList((Object[]) null);
      assertTrue(list0.isEmpty());
  }
}
