/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 06:43:15 GMT 2018
 */

package com.lts.application.international;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.lts.application.ApplicationException;
import com.lts.application.international.MessageFormatter;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.StringReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MessageFormatter_ESTest extends MessageFormatter_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
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
  //Test case number: 1
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      ApplicationException applicationException0 = new ApplicationException("resources.messages.standard");
      MessageFormatter.LoadBundleError messageFormatter_LoadBundleError0 = new MessageFormatter.LoadBundleError("resources.messages.standard", applicationException0);
      MockFile mockFile0 = new MockFile("resources.messages.standard");
      MockFileInputStream mockFileInputStream0 = null;
      try {
        mockFileInputStream0 = new MockFileInputStream(mockFile0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      List<String> list0 = ResourceBundle.Control.FORMAT_PROPERTIES;
      // Undeclared exception!
      try { 
        messageFormatter0.initializeResourceBundle(list0, (List) null);
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
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = "5\"2ch+Q{";
      MessageFormatter messageFormatter0 = new MessageFormatter();
      Object[] objectArray0 = new Object[6];
      objectArray0[0] = (Object) messageFormatter0;
      objectArray0[1] = (Object) messageFormatter0;
      objectArray0[2] = (Object) "eO19*&jso3vmsaw";
      objectArray0[3] = (Object) messageFormatter0;
      objectArray0[4] = (Object) messageFormatter0;
      objectArray0[5] = (Object) messageFormatter0;
      try { 
        messageFormatter0.getMessage("eO19*&jso3vmsaw", objectArray0);
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
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
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
  //Test case number: 5
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      Throwable throwable0 = messageFormatter0.getLastException();
      assertNull(throwable0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
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
  //Test case number: 7
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
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
  //Test case number: 8
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      messageFormatter0.temp();
  }

  /**
  //Test case number: 9
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      Object object0 = new Object();
      objectArray0[1] = object0;
      objectArray0[2] = object0;
      List list0 = MessageFormatter.buildList(objectArray0);
      assertEquals(6, list0.size());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.3904377949394804
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      Locale locale0 = Locale.CANADA;
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      List<String> list0 = ResourceBundle.Control.FORMAT_DEFAULT;
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
  //Test case number: 11
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
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
  //Test case number: 12
  /*Coverage entropy=1.15374194270109
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-119);
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)0;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PropertyResourceBundle propertyResourceBundle0 = new PropertyResourceBundle(byteArrayInputStream0);
      messageFormatter0.addBundle(propertyResourceBundle0);
      Object[] objectArray0 = null;
      try { 
        messageFormatter0.formatMessage("", (Object[]) null);
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      List list0 = messageFormatter0.loadCriticalBundles();
      assertEquals(0, list0.size());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      List list0 = MessageFormatter.buildList((Object[]) null);
      assertTrue(list0.isEmpty());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      messageFormatter0.initializeResourceBundle();
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
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
  //Test case number: 17
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
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
  //Test case number: 18
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
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
  //Test case number: 19
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      LinkedList<InputStream> linkedList0 = new LinkedList<InputStream>();
      ApplicationException applicationException0 = messageFormatter0.createLoadException(linkedList0);
      assertEquals("critical.com.lts.application.errors.resourceBundle.load", applicationException0.getKey());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
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
  //Test case number: 21
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      List<String> list0 = ResourceBundle.Control.FORMAT_DEFAULT;
      MessageFormatter messageFormatter0 = new MessageFormatter();
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
  //Test case number: 22
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      String string0 = messageFormatter0.listToString((List<String>) null);
      assertEquals("null", string0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      Locale locale0 = Locale.KOREA;
      ClassLoader.getSystemClassLoader();
      StringReader stringReader0 = new StringReader("resources.messages.standard");
      PropertyResourceBundle propertyResourceBundle0 = new PropertyResourceBundle(stringReader0);
      messageFormatter0.addBundle(propertyResourceBundle0);
      String string0 = messageFormatter0.formatMessage("resources.messages.standard", messageFormatter0.DEFAULT_BUNDLE_PATH);
      assertEquals("", string0);
  }
}
