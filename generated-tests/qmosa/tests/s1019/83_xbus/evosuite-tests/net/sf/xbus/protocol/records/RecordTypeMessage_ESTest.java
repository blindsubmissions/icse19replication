/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 15:01:14 GMT 2018
 */

package net.sf.xbus.protocol.records;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.DataInputStream;
import java.util.Date;
import java.util.Hashtable;
import net.sf.xbus.base.bytearraylist.ByteArrayList;
import net.sf.xbus.base.xbussystem.XBUSSystem;
import net.sf.xbus.protocol.records.RecordTypeMessage;
import org.apache.axis.Message;
import org.apache.axis.MessageContext;
import org.apache.axis.SOAPPart;
import org.apache.axis.encoding.DeserializationContext;
import org.apache.axis.message.SOAPEnvelope;
import org.apache.axis.soap.SOAPConstants;
import org.apache.html.dom.HTMLDocumentImpl;
import org.apache.xerces.dom.CoreDocumentImpl;
import org.apache.xerces.dom.DeferredDocumentImpl;
import org.apache.xerces.dom.DocumentTypeImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import org.w3c.dom.Document;
import org.w3c.dom.DocumentType;
import org.xml.sax.InputSource;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RecordTypeMessage_ESTest extends RecordTypeMessage_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      XBUSSystem xBUSSystem0 = null;
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      Integer integer0 = new Integer((-1001));
      try { 
        recordTypeMessage0.setRequestObject(integer0, (XBUSSystem) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // I_02_003_0 java.lang.Integer cannot be cast to net.sf.xbus.base.bytearraylist.ByteArrayList
         //
         verifyException("net.sf.xbus.protocol.records.RecordTypeMessage", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XBUSSystem xBUSSystem0 = null;
      String string0 = "";
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage("", (XBUSSystem) null, "");
      recordTypeMessage0.getRequestText((XBUSSystem) null);
      recordTypeMessage0.getRequestTextAsXML((XBUSSystem) null);
      recordTypeMessage0.getResponseObject();
      recordTypeMessage0.setRequestObject((Object) null, (XBUSSystem) null);
      recordTypeMessage0.getResponseObject();
      HTMLDocumentImpl hTMLDocumentImpl0 = new HTMLDocumentImpl();
      hTMLDocumentImpl0.getVersion();
      hTMLDocumentImpl0.getDoctype();
      CoreDocumentImpl coreDocumentImpl0 = new CoreDocumentImpl((DocumentType) null, true);
      recordTypeMessage0.setResponseDocument(coreDocumentImpl0, (XBUSSystem) null);
      recordTypeMessage0.setResponseDocument(hTMLDocumentImpl0, (XBUSSystem) null);
      Object object0 = new Object();
      try { 
        recordTypeMessage0.setRequestObject(object0, (XBUSSystem) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // I_02_003_0 java.lang.Object cannot be cast to net.sf.xbus.base.bytearraylist.ByteArrayList
         //
         verifyException("net.sf.xbus.protocol.records.RecordTypeMessage", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      XBUSSystem xBUSSystem0 = null;
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.getResponseText();
      recordTypeMessage0.getRequestTextAsXML((XBUSSystem) null);
      recordTypeMessage0.getRequestTextAsXML((XBUSSystem) null);
      recordTypeMessage0.synchronizeRequestFields((XBUSSystem) null);
      recordTypeMessage0.getRequestTextAsXML((XBUSSystem) null);
      recordTypeMessage0.getRequestObject((XBUSSystem) null);
      recordTypeMessage0.setRequestObject((Object) null, (XBUSSystem) null);
      recordTypeMessage0.synchronizeResponseFields((XBUSSystem) null);
      recordTypeMessage0.getRequestObject((XBUSSystem) null);
      recordTypeMessage0.getResponseObject();
      recordTypeMessage0.setErrortext((String) null);
      XBUSSystem xBUSSystem1 = null;
      try {
        xBUSSystem1 = new XBUSSystem((String) null);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      Date date0 = recordTypeMessage0.getRequestTimestamp();
      recordTypeMessage0.setResponseTimestamp(date0);
      recordTypeMessage0.getResponseObject();
      recordTypeMessage0.getResponseText();
      recordTypeMessage0.synchronizeResponseFields((XBUSSystem) null);
      recordTypeMessage0.synchronizeRequestFields((XBUSSystem) null);
      recordTypeMessage0.synchronizeRequestFields((XBUSSystem) null);
      recordTypeMessage0.setRequestText((String) null, (XBUSSystem) null);
      recordTypeMessage0.getResponseText();
      recordTypeMessage0.setResponseObject((Object) null, (XBUSSystem) null);
      recordTypeMessage0.getResponseObject();
      recordTypeMessage0.setRequestObject((Object) null, (XBUSSystem) null);
      recordTypeMessage0.synchronizeResponseFields((XBUSSystem) null);
      // Undeclared exception!
      try { 
        recordTypeMessage0.setResponseText("", (XBUSSystem) null);
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
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      XBUSSystem xBUSSystem0 = null;
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage("1F%3+O4D3=| J", (XBUSSystem) null, "HTM15 Tag '");
      recordTypeMessage0.synchronizeResponseFields((XBUSSystem) null);
      recordTypeMessage0.getRequestTextAsXML((XBUSSystem) null);
      recordTypeMessage0.setErrorcode(6);
      recordTypeMessage0.getRequestText((XBUSSystem) null);
      recordTypeMessage0.synchronizeResponseFields((XBUSSystem) null);
      recordTypeMessage0.getRequestTextAsXML((XBUSSystem) null);
      System.setCurrentTimeMillis(6);
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, false);
      System.setCurrentTimeMillis(6);
      try { 
        recordTypeMessage0.setResponseObject("1F%3+O4D3=| J", (XBUSSystem) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // I_02_003_0 java.lang.String cannot be cast to net.sf.xbus.base.bytearraylist.ByteArrayList
         //
         verifyException("net.sf.xbus.protocol.records.RecordTypeMessage", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage("J!ZR", (XBUSSystem) null, "");
      recordTypeMessage0.getRequestText((XBUSSystem) null);
      recordTypeMessage0.getRequestTextAsXML((XBUSSystem) null);
      recordTypeMessage0.getResponseObject();
      recordTypeMessage0.getResponseObject();
      recordTypeMessage0.setRequestObject((Object) null, (XBUSSystem) null);
      recordTypeMessage0.getResponseObject();
      HTMLDocumentImpl hTMLDocumentImpl0 = new HTMLDocumentImpl();
      hTMLDocumentImpl0.getVersion();
      hTMLDocumentImpl0.getDoctype();
      CoreDocumentImpl coreDocumentImpl0 = new CoreDocumentImpl((DocumentType) null, true);
      recordTypeMessage0.setResponseDocument(hTMLDocumentImpl0, (XBUSSystem) null);
      recordTypeMessage0.setResponseDocument(coreDocumentImpl0, (XBUSSystem) null);
      Object object0 = new Object();
      recordTypeMessage0.setRequestObject((Object) null, (XBUSSystem) null);
      RecordTypeMessage recordTypeMessage1 = new RecordTypeMessage("J!ZR", (XBUSSystem) null, ":)GFn.(aI#(*$(");
      recordTypeMessage1.setResponseText((String) null, (XBUSSystem) null);
      recordTypeMessage1.setRequestObject((Object) null, (XBUSSystem) null);
      assertEquals(0, recordTypeMessage1.getErrorcode());
      
      recordTypeMessage0.setResponseDocument(coreDocumentImpl0, (XBUSSystem) null);
      recordTypeMessage0.getRequestText((XBUSSystem) null);
      assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.2102535776209735
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, false);
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage("", (XBUSSystem) null, "");
      recordTypeMessage0.getRequestText((XBUSSystem) null);
      recordTypeMessage0.getRequestTextAsXML((XBUSSystem) null);
      recordTypeMessage0.getResponseObject();
      recordTypeMessage0.setRequestObject((Object) null, (XBUSSystem) null);
      recordTypeMessage0.getResponseObject();
      Object object0 = new Object();
      ByteArrayList byteArrayList0 = new ByteArrayList();
      recordTypeMessage0.setRequestObject(byteArrayList0, (XBUSSystem) null);
      recordTypeMessage0.setRequestObject((Object) null, (XBUSSystem) null);
      recordTypeMessage0.getRequestObject((XBUSSystem) null);
      String string0 = "";
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
  //Test case number: 7
  /*Coverage entropy=2.1639556568820564
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      Date date0 = recordTypeMessage0.getRequestTimestamp();
      MockDate mockDate0 = new MockDate(0L);
      mockDate0.clone();
      recordTypeMessage0.setResponseTimestamp(date0);
      recordTypeMessage0.getResponseObject();
      recordTypeMessage0.getRequestTextAsXML((XBUSSystem) null);
      RecordTypeMessage recordTypeMessage1 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage1.setReturncode((String) null);
      recordTypeMessage1.synchronizeResponseFields((XBUSSystem) null);
      recordTypeMessage1.getResponseText();
      assertEquals("RC_OK", recordTypeMessage1.getReturncode());
      
      ByteArrayList byteArrayList0 = new ByteArrayList();
      recordTypeMessage0.setResponseObject(byteArrayList0, (XBUSSystem) null);
      recordTypeMessage0.getRequestObject((XBUSSystem) null);
      Hashtable<String, DataInputStream> hashtable0 = new Hashtable<String, DataInputStream>();
      Hashtable<String, Object> hashtable1 = new Hashtable<String, Object>();
      recordTypeMessage0.getRequestText((XBUSSystem) null);
      recordTypeMessage0.getResponseText();
      assertEquals(0, recordTypeMessage0.getErrorcode());
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      assertEquals("RC_OK", recordTypeMessage0.getReturncode());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      XBUSSystem xBUSSystem0 = null;
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.getResponseObject();
      recordTypeMessage0.getRequestTextAsXML((XBUSSystem) null);
      RecordTypeMessage recordTypeMessage1 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage1.setReturncode((String) null);
      recordTypeMessage1.synchronizeResponseFields((XBUSSystem) null);
      recordTypeMessage1.getResponseText();
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      recordTypeMessage0.getResponseText();
      ByteArrayList byteArrayList0 = new ByteArrayList();
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-70);
      ByteArrayList byteArrayList1 = ByteArrayList.createByteArrayList(byteArray0, (byte) (-70));
      // Undeclared exception!
      try { 
        recordTypeMessage0.setResponseObject(byteArrayList1, (XBUSSystem) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sf.xbus.protocol.xml.XMLMessageAbstract", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.9730014063936125
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, true);
      XBUSSystem xBUSSystem0 = null;
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage("", (XBUSSystem) null, "");
      recordTypeMessage0.getRequestText((XBUSSystem) null);
      recordTypeMessage0.getRequestTextAsXML((XBUSSystem) null);
      recordTypeMessage0.getResponseObject();
      recordTypeMessage0.setRequestObject((Object) null, (XBUSSystem) null);
      recordTypeMessage0.getResponseObject();
      Object object0 = new Object();
      ByteArrayList byteArrayList0 = new ByteArrayList();
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)1;
      byteArray0[1] = (byte) (-101);
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)23;
      byteArray0[4] = (byte)0;
      byteArrayList0.add(byteArray0);
      byteArrayList0.iterator();
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
  /*Coverage entropy=1.7478680974667573
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      DeferredDocumentImpl deferredDocumentImpl0 = new DeferredDocumentImpl(false, false);
      DocumentTypeImpl documentTypeImpl0 = new DocumentTypeImpl(deferredDocumentImpl0, "I");
      CoreDocumentImpl coreDocumentImpl0 = new CoreDocumentImpl(documentTypeImpl0, true);
      recordTypeMessage0.setResponseDocument(coreDocumentImpl0, (XBUSSystem) null);
      Date date0 = recordTypeMessage0.getRequestTimestamp();
      MockInstant.now();
      date0.clone();
      recordTypeMessage0.getResponseObject();
      FileSystemHandling.shouldAllThrowIOExceptions();
      RecordTypeMessage recordTypeMessage1 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage1.getResponseText();
      recordTypeMessage1.getResponseObject();
      recordTypeMessage0.getRequestText((XBUSSystem) null);
      recordTypeMessage0.getResponseObject();
      System.setCurrentTimeMillis(918L);
      recordTypeMessage1.getResponseObject();
      recordTypeMessage0.getResponseText();
      assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
  }
}