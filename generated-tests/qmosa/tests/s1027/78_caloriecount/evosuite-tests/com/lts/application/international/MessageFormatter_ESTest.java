/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 18:35:33 GMT 2018
 */

package com.lts.application.international;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.lts.application.ApplicationException;
import com.lts.application.international.MessageFormatter;
import java.io.InputStream;
import java.io.StringReader;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MessageFormatter_ESTest extends MessageFormatter_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      messageFormatter0.listResources("", classLoader0);
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      List<String> list0 = ResourceBundle.Control.FORMAT_CLASS;
      List<String> list1 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) list0);
      try { 
        messageFormatter0.initializeResourceBundle(list1);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Could not find any resource bundle give names: messages; and resource path: 
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      ApplicationException applicationException0 = new ApplicationException("G~G8@}~FWO|gz9", (Object[]) messageFormatter0.DEFAULT_BUNDLE_PATH);
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
  //Test case number: 2
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      ApplicationException applicationException0 = new ApplicationException("resources.messages.standard", messageFormatter0);
      messageFormatter0.myLastException = (Throwable) applicationException0;
      messageFormatter0.initializeResourceBundle();
      String string0 = "/resources/swing.properties";
      // Undeclared exception!
      try { 
        messageFormatter0.tryLoad("/resources/swing.properties");
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
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      messageFormatter0.getLastException();
      String string0 = "+|l&jO\")2U(<o";
      // Undeclared exception!
      try { 
        messageFormatter0.getMessage("+|l&jO\")2U(<o");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // com.lts.application.ApplicationMessages.error.keyNotFound
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
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
      Object object6 = new Object();
      objectArray0[6] = object6;
      Object object7 = new Object();
      objectArray0[7] = object7;
      Object object8 = new Object();
      objectArray0[8] = object8;
      List list0 = MessageFormatter.buildList(objectArray0);
      assertEquals(9, list0.size());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      messageFormatter0.temp();
      messageFormatter0.temp();
      messageFormatter0.temp();
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      LinkedList<String> linkedList1 = new LinkedList<String>();
      LinkedList<Object> linkedList2 = new LinkedList<Object>();
      ApplicationException applicationException0 = messageFormatter0.createLoadException(linkedList2);
      // Undeclared exception!
      try { 
        messageFormatter0.getMessage("", (Object) applicationException0, (Object) linkedList2);
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
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      messageFormatter0.addBundle((ResourceBundle) null);
      String string0 = "LRwt:f2mFye)ShW~y";
      // Undeclared exception!
      try { 
        messageFormatter0.getMessage("LRwt:f2mFye)ShW~y");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      messageFormatter0.loadCriticalBundles();
      Locale locale0 = Locale.CHINA;
      // Undeclared exception!
      try { 
        ResourceBundle.getBundle("resources.messages.standard", locale0);
        fail("Expecting exception: MissingResourceException");
      
      } catch(MissingResourceException e) {
         //
         // Can't find bundle for base name resources.messages.standard, locale zh_CN
         //
         verifyException("java.util.ResourceBundle", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      String string0 = "The system has encountered an severe error that has prevented it starting up.  This is probably the result of a bug or other problem that is beyond your control.  The details button may provide information that will help in resolving the problem so you may wish to copy the contents of that window and include it in any bug reports, etc.";
      String string1 = "";
      StringReader stringReader0 = new StringReader("");
      PropertyResourceBundle propertyResourceBundle0 = new PropertyResourceBundle(stringReader0);
      Object object0 = null;
      // Undeclared exception!
      try { 
        messageFormatter0.getMessage("The system has encountered an severe error that has prevented it starting up.  This is probably the result of a bug or other problem that is beyond your control.  The details button may provide information that will help in resolving the problem so you may wish to copy the contents of that window and include it in any bug reports, etc.", (Object) propertyResourceBundle0, (Object) null, (Object) stringReader0);
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
      Object[] objectArray0 = new Object[9];
      objectArray0[0] = (Object) "F";
      objectArray0[1] = (Object) messageFormatter0;
      objectArray0[2] = (Object) messageFormatter0;
      objectArray0[3] = (Object) messageFormatter0;
      objectArray0[4] = (Object) messageFormatter0;
      objectArray0[5] = (Object) messageFormatter0;
      objectArray0[6] = (Object) messageFormatter0;
      objectArray0[7] = (Object) messageFormatter0;
      objectArray0[8] = (Object) "F";
      try { 
        messageFormatter0.getMessage("F", objectArray0);
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
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ApplicationException applicationException0 = new ApplicationException("", "");
      ApplicationException applicationException1 = new ApplicationException(applicationException0, "", (Object) null, applicationException0);
      ApplicationException applicationException2 = new ApplicationException(applicationException1, "");
      MockThrowable mockThrowable0 = new MockThrowable("", applicationException2);
      MessageFormatter.LoadBundleError messageFormatter_LoadBundleError0 = new MessageFormatter.LoadBundleError("", mockThrowable0);
      MessageFormatter messageFormatter0 = new MessageFormatter();
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) "";
      objectArray0[1] = (Object) applicationException0;
      objectArray0[2] = (Object) applicationException1;
      MockThrowable mockThrowable1 = new MockThrowable();
      applicationException1.addSuppressed(mockThrowable1);
      objectArray0[3] = (Object) applicationException1;
      try { 
        messageFormatter0.formatMessage("", objectArray0);
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
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      objectArray0[3] = (Object) "";
      Object object0 = new Object();
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
  //Test case number: 13
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      String string0 = "cjX=i;PN";
      Object object0 = new Object();
      Object[] objectArray0 = null;
      // Undeclared exception!
      try { 
        messageFormatter0.formatMessage("critcal.error.unknown", (Object[]) null, (ResourceBundle) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      String string0 = "Error during repository cleanup.\nContinue startup?";
      LinkedList<PropertyResourceBundle> linkedList0 = new LinkedList<PropertyResourceBundle>();
      StringReader stringReader0 = new StringReader("resources.messages.standard");
      PropertyResourceBundle propertyResourceBundle0 = new PropertyResourceBundle(stringReader0);
      linkedList0.add(propertyResourceBundle0);
      List<String> list0 = ResourceBundle.Control.FORMAT_DEFAULT;
      messageFormatter0.listToString(list0);
      // Undeclared exception!
      try { 
        messageFormatter0.initializeResourceBundle((List) linkedList0, (List) linkedList0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.PropertyResourceBundle cannot be cast to java.lang.String
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      List<String> list0 = ResourceBundle.Control.FORMAT_CLASS;
      messageFormatter0.listToString(list0);
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
  //Test case number: 16
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      MessageFormatter.buildList(objectArray0);
      Object object0 = new Object();
      Locale locale0 = Locale.JAPAN;
      MessageFormatter messageFormatter0 = new MessageFormatter();
      String string0 = ";Z(hFB`f'x";
      // Undeclared exception!
      try { 
        messageFormatter0.tryLoad((String) null, ";Z(hFB`f'x");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ResourceBundle", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.6326309271543518
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      List<String> list0 = ResourceBundle.Control.FORMAT_CLASS;
      try { 
        messageFormatter0.initializeResourceBundle(list0, list0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Could not find any resource bundle give names: java.class; and resource path: java.class
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      MessageFormatter.buildList((Object[]) null);
      Object object0 = new Object();
      Object object1 = new Object();
      Locale locale0 = Locale.UK;
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.EXTENDED_FILTERING;
      Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) null, locale_FilteringMode0);
      String string0 = ":aBxU1l";
      // Undeclared exception!
      try { 
        ResourceBundle.getBundle(":aBxU1l", locale0);
        fail("Expecting exception: MissingResourceException");
      
      } catch(MissingResourceException e) {
         //
         // Can't find bundle for base name :aBxU1l, locale en_GB
         //
         verifyException("java.util.ResourceBundle", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      List<String> list0 = null;
      messageFormatter0.listToString((List<String>) null);
      List<String> list1 = ResourceBundle.Control.FORMAT_CLASS;
      messageFormatter0.addBundle((ResourceBundle) null);
      MessageFormatter messageFormatter1 = new MessageFormatter();
      ResourceBundle.Control resourceBundle_Control0 = ResourceBundle.Control.getControl(list1);
      StringReader stringReader0 = new StringReader("resources.messages.standard");
      PropertyResourceBundle propertyResourceBundle0 = new PropertyResourceBundle(stringReader0);
      propertyResourceBundle0.getLocale();
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, false);
      // Undeclared exception!
      try { 
        resourceBundle_Control0.getFallbackLocale("resources.messages.standard", (Locale) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ResourceBundle$Control", e);
      }
  }
}
