/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 19:11:21 GMT 2018
 */

package com.lts.application.international;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.lts.application.ApplicationException;
import com.lts.application.international.MessageFormatter;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.StringReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;
import java.util.function.Consumer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MessageFormatter_ESTest extends MessageFormatter_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable("Gw #h<");
      StackTraceElement stackTraceElement0 = new StackTraceElement(">MUE", "=", "UW^IQi8]]W)5;x692", 0);
      mockThrowable0.setOriginForDelegate(stackTraceElement0);
      MessageFormatter.LoadBundleError messageFormatter_LoadBundleError0 = new MessageFormatter.LoadBundleError("(s>n|kd``;\",c+f{xlZ", mockThrowable0);
      MessageFormatter messageFormatter0 = new MessageFormatter();
      Object[] objectArray0 = new Object[6];
      objectArray0[0] = (Object) stackTraceElement0;
      objectArray0[1] = (Object) mockThrowable0;
      objectArray0[2] = (Object) mockThrowable0;
      objectArray0[3] = (Object) mockThrowable0;
      messageFormatter_LoadBundleError0.bundleName = "/;3',TyJsCsJY{`lWJ7";
      objectArray0[4] = (Object) "Gw #h<";
      objectArray0[5] = (Object) "(s>n|kd``;\",c+f{xlZ";
      ResourceBundle resourceBundle0 = null;
      // Undeclared exception!
      try { 
        messageFormatter0.formatMessage("=", objectArray0, (ResourceBundle) null);
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
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      List<String> list0 = ResourceBundle.Control.FORMAT_DEFAULT;
      messageFormatter0.listToString(list0);
      Object[] objectArray0 = new Object[7];
      Object object0 = new Object();
      objectArray0[0] = object0;
      objectArray0[1] = (Object) "java.class, java.properties";
      objectArray0[2] = (Object) list0;
      objectArray0[3] = (Object) list0;
      objectArray0[4] = (Object) list0;
      objectArray0[5] = (Object) list0;
      objectArray0[6] = (Object) "java.class, java.properties";
      try { 
        messageFormatter0.getMessage("java.class, java.properties", objectArray0);
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
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      messageFormatter0.initializeResourceBundle();
      messageFormatter0.getLastException();
      MessageFormatter.buildList(messageFormatter0.DEFAULT_BUNDLE_PATH);
      String string0 = "yh%#v&";
      messageFormatter0.initializeResourceBundle();
      messageFormatter0.temp();
      ResourceBundle resourceBundle0 = null;
      Object[] objectArray0 = new Object[5];
      objectArray0[0] = (Object) null;
      objectArray0[1] = (Object) "Invalid menu specification: first row cannot be a separator";
      objectArray0[2] = (Object) null;
      objectArray0[3] = (Object) null;
      objectArray0[4] = (Object) messageFormatter0;
      try { 
        messageFormatter0.getMessage("Invalid menu specification: first row cannot be a separator", objectArray0);
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
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
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
  //Test case number: 4
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) messageFormatter0;
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ClassLoader classLoader1 = classLoader0.getParent();
      messageFormatter0.listResources("S6", classLoader1);
      objectArray0[1] = (Object) messageFormatter0;
      objectArray0[2] = (Object) messageFormatter0;
      objectArray0[3] = (Object) messageFormatter0;
      ApplicationException applicationException0 = new ApplicationException("resources.messages.standard", objectArray0);
      messageFormatter0.myLastException = (Throwable) applicationException0;
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
      // Undeclared exception!
      try { 
        messageFormatter0.getMessage("not implemented");
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
  //Test case number: 7
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      String string0 = null;
      // Undeclared exception!
      try { 
        messageFormatter0.tryLoad((String) null, ",/:N={hMg{2ydN,");
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
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      // Undeclared exception!
      try { 
        messageFormatter0.tryLoad("", "hpeU'.B ~S90e");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ResourceBundle", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      List list0 = messageFormatter0.loadCriticalBundles();
      // Undeclared exception!
      try { 
        messageFormatter0.getMessage("k0=4zt@}]", (Object) list0, (Object) list0);
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
        messageFormatter0.getMessage("mQyE6_EfZ+&EAFbI's|", (Object) null, (Object) "mQyE6_EfZ+&EAFbI's|", (Object) "mQyE6_EfZ+&EAFbI's|");
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
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      linkedList0.add((Object) messageFormatter0);
      // Undeclared exception!
      try { 
        messageFormatter0.createLoadException(linkedList0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.lts.application.international.MessageFormatter cannot be cast to com.lts.application.international.MessageFormatter$LoadBundleError
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Object[] objectArray0 = new Object[7];
      Object object0 = new Object();
      objectArray0[0] = object0;
      MessageFormatter messageFormatter0 = new MessageFormatter();
      LinkedList<ApplicationException> linkedList0 = new LinkedList<ApplicationException>();
      messageFormatter0.createLoadException(linkedList0);
      StringReader stringReader0 = new StringReader("");
      PropertyResourceBundle propertyResourceBundle0 = new PropertyResourceBundle(stringReader0);
      Object object1 = new Object();
      // Undeclared exception!
      try { 
        messageFormatter0.getMessage("", object0, object1);
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
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable("Gw #h<");
      StackTraceElement stackTraceElement0 = new StackTraceElement(">MUE", "=", "UW^IQi8]]W)5;x692", 0);
      mockThrowable0.setOriginForDelegate(stackTraceElement0);
      MessageFormatter.LoadBundleError messageFormatter_LoadBundleError0 = new MessageFormatter.LoadBundleError("(s>n|kd`kB\",c+f{xlZ", mockThrowable0);
      MessageFormatter messageFormatter0 = new MessageFormatter();
      Object[] objectArray0 = new Object[6];
      objectArray0[0] = (Object) stackTraceElement0;
      objectArray0[1] = (Object) mockThrowable0;
      String string0 = messageFormatter0.listToString((List<String>) null);
      assertEquals("null", string0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Object[] objectArray0 = new Object[7];
      Object object0 = new Object();
      objectArray0[0] = object0;
      MessageFormatter messageFormatter0 = new MessageFormatter();
      LinkedList<ApplicationException> linkedList0 = new LinkedList<ApplicationException>();
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "resources.messages.standard");
      ApplicationException applicationException0 = messageFormatter0.createLoadException(linkedList0);
      String string0 = "";
      StringReader stringReader0 = new StringReader("");
      Object object1 = new Object();
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
  //Test case number: 15
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MessageFormatter.buildList((Object[]) null);
      MessageFormatter messageFormatter0 = new MessageFormatter();
      List<String> list0 = ResourceBundle.Control.FORMAT_DEFAULT;
      Locale locale0 = null;
      try {
        locale0 = new Locale((String) null, "resources.messages.standard");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Locale", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.7782333057997075
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable("Gw #h<");
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-18);
      byteArray0[2] = (byte)9;
      byteArray0[3] = (byte) (-18);
      byteArray0[4] = (byte) (-127);
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte) (-127);
      byteArray0[8] = (byte) (-18);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 9, 5);
      byteArrayInputStream0.read();
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      PropertyResourceBundle propertyResourceBundle0 = new PropertyResourceBundle(dataInputStream0);
      propertyResourceBundle0.handleGetObject("Gw #h<");
      MessageFormatter messageFormatter0 = new MessageFormatter();
      messageFormatter0.addBundle(propertyResourceBundle0);
      MessageFormatter.buildList(messageFormatter0.DEFAULT_BUNDLE_PATH);
      messageFormatter0.temp();
      messageFormatter0.formatMessage("com.lts.application.fatal.createTempArea", (Object[]) null, (ResourceBundle) propertyResourceBundle0);
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
}