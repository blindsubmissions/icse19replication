/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 10:50:36 GMT 2018
 */

package com.lts.application.international;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.lts.application.ApplicationException;
import com.lts.application.international.MessageFormatter;
import java.io.BufferedInputStream;
import java.io.ObjectInputStream;
import java.io.PipedInputStream;
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
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MessageFormatter_ESTest extends MessageFormatter_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      messageFormatter0.getLastException();
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
  //Test case number: 1
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      Object object0 = new Object();
      objectArray0[0] = object0;
      Object object1 = new Object();
      objectArray0[1] = object1;
      Object object2 = new Object();
      objectArray0[2] = object2;
      Object object3 = new Object();
      objectArray0[3] = object3;
      Object object4 = new Object();
      objectArray0[4] = object4;
      Object object5 = new Object();
      objectArray0[5] = object5;
      MessageFormatter.buildList(objectArray0);
      MessageFormatter messageFormatter0 = new MessageFormatter();
      List<String> list0 = ResourceBundle.Control.FORMAT_PROPERTIES;
      try { 
        messageFormatter0.initializeResourceBundle(list0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Could not find any resource bundle give names: messages; and resource path: java.properties
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      String string0 = null;
      Object[] objectArray0 = new Object[4];
      String string1 = "-oI!kDNUu~xgR4C/rfk";
      // Undeclared exception!
      try { 
        messageFormatter0.getMessage("-oI!kDNUu~xgR4C/rfk");
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
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ClassLoader classLoader1 = classLoader0.getParent();
      classLoader1.clearAssertionStatus();
      messageFormatter0.listResources("", classLoader1);
      String string0 = "Y#a'~E[?Nc+$?$6$c+";
      // Undeclared exception!
      try { 
        messageFormatter0.tryLoad("-", "Y#a'~E[?Nc+$?$6$c+");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ResourceBundle", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      messageFormatter0.loadCriticalBundles();
      MessageFormatter.buildList(messageFormatter0.DEFAULT_BUNDLE_PATH);
      List<String> list0 = ResourceBundle.Control.FORMAT_PROPERTIES;
      ResourceBundle.Control resourceBundle_Control0 = ResourceBundle.Control.getNoFallbackControl(list0);
      List<String> list1 = resourceBundle_Control0.getFormats("resources.messages.standard");
      messageFormatter0.listToString(list1);
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) messageFormatter0;
      objectArray0[1] = (Object) list0;
      Object object0 = new Object();
      objectArray0[2] = object0;
      objectArray0[3] = (Object) "dv8G;l";
      try { 
        messageFormatter0.formatMessage("dv8G;l", objectArray0);
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
  /*Coverage entropy=1.0114042647073516
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      Object object0 = new Object();
      objectArray0[0] = object0;
      Object object1 = new Object();
      objectArray0[1] = object1;
      Object object2 = new Object();
      objectArray0[2] = object2;
      Object object3 = new Object();
      objectArray0[3] = object3;
      Object object4 = new Object();
      objectArray0[4] = object4;
      Object object5 = new Object();
      objectArray0[5] = object5;
      MessageFormatter.buildList(objectArray0);
      MessageFormatter messageFormatter0 = new MessageFormatter();
      String string0 = "";
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
  //Test case number: 6
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      String string0 = "You have unsaved changes.  Save them now?";
      // Undeclared exception!
      try { 
        messageFormatter0.getMessage("You have unsaved changes.  Save them now?", (Object) "You have unsaved changes.  Save them now?", (Object) "You have unsaved changes.  Save them now?", (Object) "You have unsaved changes.  Save them now?");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // com.lts.application.ApplicationMessages.error.keyNotFound
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
      String string0 = ")bQiuVT)LFg";
      // Undeclared exception!
      try { 
        messageFormatter0.getMessage(")bQiuVT)LFg", (Object) ")bQiuVT)LFg", (Object) ")bQiuVT)LFg");
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
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      messageFormatter0.temp();
      LinkedList<ApplicationException> linkedList0 = new LinkedList<ApplicationException>();
      StringReader stringReader0 = new StringReader("/");
      PropertyResourceBundle propertyResourceBundle0 = new PropertyResourceBundle(stringReader0);
      ApplicationException applicationException0 = new ApplicationException("/", propertyResourceBundle0, (Object) null);
      ApplicationException applicationException1 = new ApplicationException("resources.messages.standard", (Object[]) messageFormatter0.DEFAULT_BUNDLE_PATH);
      MessageFormatter.LoadBundleError messageFormatter_LoadBundleError0 = new MessageFormatter.LoadBundleError("G3biKJ<RyR:_4os>[DE", applicationException1);
      ApplicationException applicationException2 = new ApplicationException(applicationException0, "/", messageFormatter_LoadBundleError0, applicationException1);
      linkedList0.add(applicationException2);
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
  //Test case number: 9
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      messageFormatter0.listToString((List<String>) null);
      Object[] objectArray0 = new Object[9];
      objectArray0[0] = (Object) null;
      objectArray0[1] = (Object) messageFormatter0;
      objectArray0[2] = (Object) messageFormatter0;
      objectArray0[3] = (Object) null;
      objectArray0[4] = (Object) "null";
      objectArray0[5] = (Object) "null";
      objectArray0[6] = (Object) "null";
      objectArray0[7] = (Object) "IBE";
      objectArray0[8] = (Object) messageFormatter0;
      try { 
        messageFormatter0.getMessage("IBE", objectArray0);
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
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      messageFormatter0.temp();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      messageFormatter0.createLoadException(linkedList0);
      String string0 = "\\uRRkP1RoHE";
      // Undeclared exception!
      try { 
        messageFormatter0.listResources(string0, (ClassLoader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      MessageFormatter.LoadBundleError messageFormatter_LoadBundleError0 = new MessageFormatter.LoadBundleError("com.lts.application.errors.repository.PuttingEntry", (Throwable) null);
      messageFormatter0.initializeResourceBundle();
      List<String> list0 = ResourceBundle.Control.FORMAT_CLASS;
      try { 
        messageFormatter0.initializeResourceBundle(list0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Could not find any resource bundle give names: messages; and resource path: java.class
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
      String string0 = null;
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
  //Test case number: 13
  /*Coverage entropy=1.4750763110546947
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      MessageFormatter.buildList(messageFormatter0.DEFAULT_BUNDLE_PATH);
      ApplicationException applicationException0 = new ApplicationException("child, ", (Object[]) messageFormatter0.DEFAULT_BUNDLE_PATH);
      MessageFormatter.LoadBundleError messageFormatter_LoadBundleError0 = new MessageFormatter.LoadBundleError("1I:R[f G)", applicationException0);
      ApplicationException applicationException1 = new ApplicationException("resources.messages.standard", messageFormatter_LoadBundleError0, messageFormatter_LoadBundleError0);
      ApplicationException applicationException2 = new ApplicationException(applicationException1, "child, ");
      String string0 = "<undefined>";
      Object object0 = new Object();
      ApplicationException applicationException3 = new ApplicationException(applicationException2, "<undefined>", object0);
      // Undeclared exception!
      try { 
        messageFormatter0.getMessage((Throwable) applicationException3);
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
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      List<String> list0 = ResourceBundle.Control.FORMAT_CLASS;
      Object object0 = new Object();
      MessageFormatter.buildList((Object[]) null);
      Locale locale0 = Locale.UK;
      ClassLoader.getSystemClassLoader();
      List<String> list1 = ResourceBundle.Control.FORMAT_DEFAULT;
      MessageFormatter messageFormatter0 = new MessageFormatter();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      try { 
        messageFormatter0.initializeResourceBundle(list1, list0, locale0, classLoader0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Could not find any resource bundle give names: java.class; and resource path: java.class, java.properties
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Object[] objectArray0 = null;
      MessageFormatter messageFormatter0 = new MessageFormatter();
      messageFormatter0.getLastException();
      messageFormatter0.myLastException = null;
      // Undeclared exception!
      try { 
        messageFormatter0.formatMessage("RuU\"egr", (Object[]) null, (ResourceBundle) null);
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
  /*Coverage entropy=1.4750763110546947
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      ClassLoader.getSystemClassLoader();
      MessageFormatter messageFormatter0 = new MessageFormatter();
      StringReader stringReader0 = new StringReader("resources.messages.standard");
      PropertyResourceBundle propertyResourceBundle0 = new PropertyResourceBundle(stringReader0);
      messageFormatter0.addBundle(propertyResourceBundle0);
      Object object0 = new Object();
      Object[] objectArray0 = new Object[5];
      objectArray0[0] = (Object) "0u";
      objectArray0[1] = (Object) propertyResourceBundle0;
      objectArray0[2] = (Object) locale0;
      objectArray0[3] = (Object) null;
      objectArray0[4] = (Object) propertyResourceBundle0;
      try { 
        messageFormatter0.getMessage("0u", objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // com.lts.application.ApplicationMessages.error.keyNotFound
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }
}
