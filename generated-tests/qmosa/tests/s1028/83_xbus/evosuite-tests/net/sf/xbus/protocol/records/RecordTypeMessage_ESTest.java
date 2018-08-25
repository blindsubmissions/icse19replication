/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 17:23:32 GMT 2018
 */

package net.sf.xbus.protocol.records;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Hashtable;
import net.sf.xbus.base.bytearraylist.ByteArrayList;
import net.sf.xbus.base.xbussystem.XBUSSystem;
import net.sf.xbus.protocol.records.RecordTypeMessage;
import org.apache.axis.deployment.wsdd.WSDDHandler;
import org.apache.axis.utils.LockableHashtable;
import org.apache.html.dom.HTMLDocumentImpl;
import org.apache.html.dom.HTMLIFrameElementImpl;
import org.apache.html.dom.HTMLImageElementImpl;
import org.apache.xerces.dom.CoreDocumentImpl;
import org.apache.xerces.dom.DeferredDocumentImpl;
import org.apache.xerces.dom.DocumentTypeImpl;
import org.apache.xerces.dom.PSVIDocumentImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;
import org.w3c.dom.Document;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RecordTypeMessage_ESTest extends RecordTypeMessage_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage("kgAh;A", (XBUSSystem) null, "kgAh;A");
      MockDate mockDate0 = new MockDate(1702, 1702, 0, 4110, 1702, 4110);
      recordTypeMessage0.setResponseTimestamp(mockDate0);
      recordTypeMessage0.getRequestObject((XBUSSystem) null);
      recordTypeMessage0.getRequestTextAsXML((XBUSSystem) null);
      XBUSSystem xBUSSystem0 = null;
      try {
        xBUSSystem0 = new XBUSSystem("kgAh;A", (Hashtable) null);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XBUSSystem xBUSSystem0 = null;
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      // Undeclared exception!
      try { 
        recordTypeMessage0.setResponseText("Lah9", (XBUSSystem) null);
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
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      // Undeclared exception!
      try { 
        recordTypeMessage0.setRequestText("q", (XBUSSystem) null);
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
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.setRequestObject((Object) null, (XBUSSystem) null);
      recordTypeMessage0.getResponseObject();
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.setRequestObject((Object) null, (XBUSSystem) null);
      recordTypeMessage0.getRequestText((XBUSSystem) null);
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.getResponseText();
      RecordTypeMessage recordTypeMessage1 = new RecordTypeMessage((String) null, (XBUSSystem) null, (String) null);
      try { 
        recordTypeMessage0.setRequestObject(recordTypeMessage1, (XBUSSystem) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // I_02_003_0 net.sf.xbus.protocol.records.RecordTypeMessage cannot be cast to net.sf.xbus.base.bytearraylist.ByteArrayList
         //
         verifyException("net.sf.xbus.protocol.records.RecordTypeMessage", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.getResponseText();
      recordTypeMessage0.setResponseText((String) null, (XBUSSystem) null);
      assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      assertEquals(0, recordTypeMessage0.getErrorcode());
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XBUSSystem xBUSSystem0 = null;
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage("W3/Rxp4zAZ)A.u", (XBUSSystem) null, "W3/Rxp4zAZ)A.u");
      ByteArrayList byteArrayList0 = new ByteArrayList();
      recordTypeMessage0.setResponseObject(byteArrayList0, (XBUSSystem) null);
      ByteArrayList byteArrayList1 = new ByteArrayList();
      byteArrayList0.addAll(byteArrayList1);
      recordTypeMessage0.setReturncode("W3/Rxp4zAZ)A.u");
      recordTypeMessage0.getResponseText();
      // Undeclared exception!
      try { 
        byteArrayList1.getContentAsString("org.apache.wml.dom.WMLTableElementImpl");
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.setRequestObject((Object) null, (XBUSSystem) null);
      recordTypeMessage0.getRequestObject((XBUSSystem) null);
      recordTypeMessage0.getRequestObject((XBUSSystem) null);
      recordTypeMessage0.setRequestText((String) null, (XBUSSystem) null);
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.getResponseObject();
      recordTypeMessage0.setResponseObject((Object) null, (XBUSSystem) null);
      assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      assertEquals(0, recordTypeMessage0.getErrorcode());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage("RC_OK", (XBUSSystem) null, "");
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-94);
      byteArray0[2] = (byte)7;
      ByteArrayList byteArrayList0 = ByteArrayList.createByteArrayList(byteArray0, (-679));
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
  //Test case number: 11
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage("@p !", (XBUSSystem) null, "tr");
      byte[] byteArray0 = new byte[0];
      ByteArrayList byteArrayList0 = ByteArrayList.createByteArrayList(byteArray0, (-2119));
      recordTypeMessage0.setRequestObject(byteArrayList0, (XBUSSystem) null);
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      XBUSSystem xBUSSystem0 = null;
      ByteArrayList byteArrayList0 = new ByteArrayList();
      ByteArrayList byteArrayList1 = new ByteArrayList();
      byteArrayList0.addAll(byteArrayList1);
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      DeferredDocumentImpl deferredDocumentImpl0 = new DeferredDocumentImpl();
      DocumentTypeImpl documentTypeImpl0 = new DocumentTypeImpl(deferredDocumentImpl0, "W3/Rxp4zAZ)A.u", "W3/Rxp4zAZ)A.u", "W3/Rxp4zAZ)A.u");
      System.setCurrentTimeMillis((-526L));
      recordTypeMessage0.getRequestObject((XBUSSystem) null);
      recordTypeMessage0.getRequestObject((XBUSSystem) null);
      byte[] byteArray0 = new byte[4];
      byte byte0 = (byte)28;
      byteArray0[1] = (byte)49;
      byteArray0[2] = (byte)7;
      byteArray0[3] = (byte) (-73);
      ByteArrayList byteArrayList2 = ByteArrayList.createByteArrayList(byteArray0, (-3376));
      // Undeclared exception!
      try { 
        recordTypeMessage0.setResponseObject(byteArrayList2, (XBUSSystem) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sf.xbus.protocol.xml.XMLMessageAbstract", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ByteArrayList byteArrayList0 = new ByteArrayList();
      ByteArrayList byteArrayList1 = new ByteArrayList();
      byteArrayList0.addAll(byteArrayList1);
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      DeferredDocumentImpl deferredDocumentImpl0 = new DeferredDocumentImpl();
      DocumentTypeImpl documentTypeImpl0 = new DocumentTypeImpl(deferredDocumentImpl0, "W3/Rxp4zAZ)A.u", "W3/Rxp4zAZ)A.u", "W3/Rxp4zAZ)A.u");
      PSVIDocumentImpl pSVIDocumentImpl0 = new PSVIDocumentImpl(documentTypeImpl0);
      DocumentTypeImpl documentTypeImpl1 = new DocumentTypeImpl(deferredDocumentImpl0, "W3/Rxp4zAZ)A.u");
      CoreDocumentImpl coreDocumentImpl0 = new CoreDocumentImpl(documentTypeImpl1);
      recordTypeMessage0.setResponseDocument(coreDocumentImpl0, (XBUSSystem) null);
      recordTypeMessage0.getResponseObject();
      recordTypeMessage0.getResponseText();
      assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
  }
}