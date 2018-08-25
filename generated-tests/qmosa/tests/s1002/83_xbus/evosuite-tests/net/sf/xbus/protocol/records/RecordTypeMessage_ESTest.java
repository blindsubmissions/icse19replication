/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 10:17:35 GMT 2018
 */

package net.sf.xbus.protocol.records;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import javax.xml.namespace.QName;
import net.sf.xbus.base.bytearraylist.ByteArrayList;
import net.sf.xbus.base.xbussystem.XBUSSystem;
import net.sf.xbus.protocol.records.RecordTypeMessage;
import org.apache.axis.deployment.wsdd.WSDDResponseFlow;
import org.apache.axis.deployment.wsdd.WSDDService;
import org.apache.axis.utils.LockableHashtable;
import org.apache.html.dom.HTMLDocumentImpl;
import org.apache.wml.dom.WMLDocumentImpl;
import org.apache.xerces.dom.CoreDocumentImpl;
import org.apache.xerces.dom.DeferredDocumentImpl;
import org.apache.xerces.dom.DocumentImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import org.w3c.dom.Document;
import org.w3c.dom.DocumentType;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RecordTypeMessage_ESTest extends RecordTypeMessage_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      XBUSSystem xBUSSystem0 = null;
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.getRequestObject((XBUSSystem) null);
      recordTypeMessage0.getResponseObject();
      recordTypeMessage0.getRequestTextAsXML((XBUSSystem) null);
      recordTypeMessage0.setRequestObject((Object) null, (XBUSSystem) null);
      DeferredDocumentImpl deferredDocumentImpl0 = new DeferredDocumentImpl(true, false);
      // Undeclared exception!
      try { 
        recordTypeMessage0.setResponseDocument(deferredDocumentImpl0, (XBUSSystem) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xerces.dom.DeferredDocumentImpl", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.synchronizeResponseFields((XBUSSystem) null);
      recordTypeMessage0.getResponseObject();
      // Undeclared exception!
      try { 
        recordTypeMessage0.setResponseText("##lni`njR?L^1-N]3h", (XBUSSystem) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sf.xbus.protocol.xml.XMLMessageAbstract", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      XBUSSystem xBUSSystem0 = null;
      String string0 = " FaultDesc[";
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage("", (XBUSSystem) null, "");
      // Undeclared exception!
      try { 
        recordTypeMessage0.setRequestText(" FaultDesc[", (XBUSSystem) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sf.xbus.protocol.xml.XMLMessageAbstract", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XBUSSystem xBUSSystem0 = null;
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.getRequestObject((XBUSSystem) null);
      recordTypeMessage0.getResponseText();
      MockDate mockDate0 = new MockDate(62, 62, 0, 248, 719);
      recordTypeMessage0.setResponseTimestamp(mockDate0);
      recordTypeMessage0.getRequestObject((XBUSSystem) null);
      // Undeclared exception!
      try { 
        recordTypeMessage0.setRequestText("", (XBUSSystem) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sf.xbus.protocol.xml.XMLMessageAbstract", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.synchronizeResponseFields((XBUSSystem) null);
      recordTypeMessage0.getResponseObject();
      recordTypeMessage0.getRequestText((XBUSSystem) null);
      recordTypeMessage0.getResponseText();
      recordTypeMessage0.getRequestTextAsXML((XBUSSystem) null);
      recordTypeMessage0.getResponseText();
      recordTypeMessage0.getResponseObject();
      RecordTypeMessage recordTypeMessage1 = new RecordTypeMessage((String) null, (XBUSSystem) null, "static");
      recordTypeMessage1.getRequestObject((XBUSSystem) null);
      assertEquals("RecordTypeMessage", recordTypeMessage1.getShortname());
      
      recordTypeMessage0.setResponseObject((Object) null, (XBUSSystem) null);
      assertEquals(0, recordTypeMessage0.getErrorcode());
      assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.getRequestObject((XBUSSystem) null);
      recordTypeMessage0.setErrortext((String) null);
      recordTypeMessage0.getRequestText((XBUSSystem) null);
      recordTypeMessage0.setResponseText((String) null, (XBUSSystem) null);
      assertEquals(0, recordTypeMessage0.getErrorcode());
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      assertEquals("RC_OK", recordTypeMessage0.getReturncode());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.7478680974667573
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      RecordTypeMessage recordTypeMessage1 = new RecordTypeMessage("", (XBUSSystem) null, "");
      recordTypeMessage0.getRequestObject((XBUSSystem) null);
      byte[] byteArray0 = new byte[20];
      byteArray0[0] = (byte)52;
      ByteArrayList byteArrayList0 = ByteArrayList.createByteArrayList(byteArray0, (byte)52);
      recordTypeMessage1.setResponseObject(byteArrayList0, (XBUSSystem) null);
      RecordTypeMessage recordTypeMessage2 = new RecordTypeMessage("", (XBUSSystem) null, "");
      try { 
        recordTypeMessage2.setRequestObject("", (XBUSSystem) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // I_02_003_0 java.lang.String cannot be cast to net.sf.xbus.base.bytearraylist.ByteArrayList
         //
         verifyException("net.sf.xbus.protocol.records.RecordTypeMessage", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XBUSSystem xBUSSystem0 = null;
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)41;
      byte byte0 = (byte)89;
      byteArray0[1] = (byte)89;
      ByteArrayList byteArrayList0 = ByteArrayList.createByteArrayList(byteArray0, (-1787));
      // Undeclared exception!
      try { 
        recordTypeMessage0.setResponseObject(byteArrayList0, (XBUSSystem) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sf.xbus.protocol.xml.XMLMessageAbstract", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.9061547465398496
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, false);
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.getResponseText();
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-100);
      byteArray0[1] = (byte) (-77);
      byteArray0[2] = (byte)0;
      ByteArrayList byteArrayList0 = ByteArrayList.createByteArrayList(byteArray0, 3334);
      recordTypeMessage0.setResponseObject(byteArrayList0, (XBUSSystem) null);
      recordTypeMessage0.getRequestObject((XBUSSystem) null);
      recordTypeMessage0.setRequestObject(byteArrayList0, (XBUSSystem) null);
      assertEquals(0, recordTypeMessage0.getErrorcode());
      assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      
      RecordTypeMessage recordTypeMessage1 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage1.getResponseObject();
      recordTypeMessage1.getRequestObject((XBUSSystem) null);
      assertEquals("RecordTypeMessage", recordTypeMessage1.getShortname());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.getResponseObject();
      recordTypeMessage0.setErrortext("u/ZW;-5m");
      byte[] byteArray0 = new byte[3];
      byte byte0 = (byte)1;
      ByteArrayList byteArrayList0 = ByteArrayList.createByteArrayList(byteArray0, (-3646));
      // Undeclared exception!
      try { 
        recordTypeMessage0.setRequestObject(byteArrayList0, (XBUSSystem) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sf.xbus.protocol.xml.XMLMessageAbstract", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.458311329683084
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      XBUSSystem xBUSSystem0 = null;
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((String) null, (XBUSSystem) null, (String) null);
      recordTypeMessage0.getResponseText();
      recordTypeMessage0.getRequestTextAsXML((XBUSSystem) null);
      recordTypeMessage0.getResponseText();
      recordTypeMessage0.getResponseObject();
      CoreDocumentImpl coreDocumentImpl0 = new CoreDocumentImpl();
      recordTypeMessage0.setResponseDocument(coreDocumentImpl0, (XBUSSystem) null);
      recordTypeMessage0.getRequestText((XBUSSystem) null);
      recordTypeMessage0.getRequestObject((XBUSSystem) null);
      recordTypeMessage0.getResponseObject();
      RecordTypeMessage recordTypeMessage1 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.setRequestText((String) null, (XBUSSystem) null);
      System.setCurrentTimeMillis(1L);
      recordTypeMessage0.getRequestObject((XBUSSystem) null);
      try { 
        recordTypeMessage1.setRequestObject("_i;j", (XBUSSystem) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // I_02_003_0 java.lang.String cannot be cast to net.sf.xbus.base.bytearraylist.ByteArrayList
         //
         verifyException("net.sf.xbus.protocol.records.RecordTypeMessage", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.7478680974667573
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.getRequestObject((XBUSSystem) null);
      recordTypeMessage0.getResponseText();
      HTMLDocumentImpl hTMLDocumentImpl0 = new HTMLDocumentImpl();
      hTMLDocumentImpl0.getDoctype();
      WMLDocumentImpl wMLDocumentImpl0 = new WMLDocumentImpl((DocumentType) null);
      recordTypeMessage0.setResponseDocument(wMLDocumentImpl0, (XBUSSystem) null);
      recordTypeMessage0.getResponseText();
      recordTypeMessage0.getResponseObject();
      recordTypeMessage0.getResponseObject();
      System.setCurrentTimeMillis(0L);
  }
}