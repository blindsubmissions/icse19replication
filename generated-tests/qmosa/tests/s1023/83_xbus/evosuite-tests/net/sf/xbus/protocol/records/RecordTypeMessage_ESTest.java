/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 16:17:05 GMT 2018
 */

package net.sf.xbus.protocol.records;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Date;
import java.util.Hashtable;
import net.sf.xbus.base.bytearraylist.ByteArrayList;
import net.sf.xbus.base.xbussystem.XBUSSystem;
import net.sf.xbus.protocol.records.RecordTypeMessage;
import org.apache.axis.MessageContext;
import org.apache.axis.deployment.wsdd.WSDDJAXRPCHandlerInfoChain;
import org.apache.axis.message.Detail;
import org.apache.xerces.dom.CoreDocumentImpl;
import org.apache.xerces.dom.DOMInputImpl;
import org.apache.xerces.dom.DeferredDocumentImpl;
import org.apache.xerces.dom.DocumentImpl;
import org.apache.xerces.dom.DocumentTypeImpl;
import org.apache.xerces.dom.PSVIDocumentImpl;
import org.apache.xerces.parsers.DOMASBuilderImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;
import org.w3c.dom.Document;
import org.w3c.dom.ls.LSException;
import org.w3c.dom.ls.LSInput;
import org.xml.sax.InputSource;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RecordTypeMessage_ESTest extends RecordTypeMessage_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XBUSSystem xBUSSystem0 = null;
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.synchronizeResponseFields((XBUSSystem) null);
      recordTypeMessage0.setShortname("Yx||%{n0N!");
      recordTypeMessage0.setResponseTimestamp((Date) null);
      RecordTypeMessage recordTypeMessage1 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage1.getResponseObject();
      recordTypeMessage0.setRequestObject((Object) null, (XBUSSystem) null);
      Detail detail0 = new Detail();
      detail0.getOwnerDocument();
      RecordTypeMessage recordTypeMessage2 = new RecordTypeMessage("Yx||%{n0N!", (XBUSSystem) null, "");
      DOMASBuilderImpl dOMASBuilderImpl0 = new DOMASBuilderImpl();
      DOMInputImpl dOMInputImpl0 = new DOMInputImpl();
      try { 
        dOMASBuilderImpl0.parse((LSInput) dOMInputImpl0);
        fail("Expecting exception: LSException");
      
      } catch(LSException e) {
         //
         // no-input-specified
         //
         verifyException("org.apache.xerces.parsers.DOMParserImpl", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      XBUSSystem xBUSSystem0 = null;
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.getRequestText((XBUSSystem) null);
      Detail detail0 = new Detail();
      detail0.getAttributesEx();
      InputSource inputSource0 = new InputSource();
      MessageContext.getCurrentContext();
      recordTypeMessage0.getRequestObject((XBUSSystem) null);
      recordTypeMessage0.getResponseText();
      recordTypeMessage0.setShortname((String) null);
      // Undeclared exception!
      try { 
        recordTypeMessage0.setResponseText("'", (XBUSSystem) null);
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
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      XBUSSystem xBUSSystem0 = null;
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage("@hzv,gWdwVwj'Ru", (XBUSSystem) null, "");
      recordTypeMessage0.setRequestText((String) null, (XBUSSystem) null);
      recordTypeMessage0.getRequestText((XBUSSystem) null);
      recordTypeMessage0.getResponseText();
      DeferredDocumentImpl deferredDocumentImpl0 = new DeferredDocumentImpl(false, false);
      recordTypeMessage0.getRequestObject((XBUSSystem) null);
      recordTypeMessage0.setErrorcode(2636);
      recordTypeMessage0.getRequestTextAsXML((XBUSSystem) null);
      MockDate mockDate0 = new MockDate(1624L);
      MockDate mockDate1 = new MockDate(0, 0, 0);
      mockDate1.getTime();
      recordTypeMessage0.setResponseTimestamp(mockDate1);
      recordTypeMessage0.getResponseObject();
      recordTypeMessage0.setRequestText((String) null, (XBUSSystem) null);
      recordTypeMessage0.getRequestObject((XBUSSystem) null);
      recordTypeMessage0.getResponseText();
      recordTypeMessage0.getResponseObject();
      recordTypeMessage0.setRequestObject((Object) null, (XBUSSystem) null);
      recordTypeMessage0.synchronizeRequestFields((XBUSSystem) null);
      recordTypeMessage0.setRequestObject((Object) null, (XBUSSystem) null);
      Hashtable<ByteArrayList, Integer> hashtable0 = new Hashtable<ByteArrayList, Integer>();
      XBUSSystem xBUSSystem1 = null;
      try {
        xBUSSystem1 = new XBUSSystem((String) null, hashtable0);
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
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      XBUSSystem xBUSSystem0 = null;
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage("@hzv,gWdwVwj'Ru", (XBUSSystem) null, "");
      recordTypeMessage0.setRequestText((String) null, (XBUSSystem) null);
      recordTypeMessage0.getRequestText((XBUSSystem) null);
      recordTypeMessage0.getResponseText();
      DeferredDocumentImpl deferredDocumentImpl0 = new DeferredDocumentImpl(false, false);
      recordTypeMessage0.getRequestObject((XBUSSystem) null);
      recordTypeMessage0.setErrorcode(2636);
      recordTypeMessage0.getRequestTextAsXML((XBUSSystem) null);
      MockDate mockDate0 = new MockDate(1624L);
      int int0 = 0;
      MockDate mockDate1 = new MockDate(0, 0, 0);
      mockDate1.getTime();
      recordTypeMessage0.setResponseTimestamp(mockDate1);
      recordTypeMessage0.getResponseObject();
      recordTypeMessage0.setRequestText((String) null, (XBUSSystem) null);
      RecordTypeMessage recordTypeMessage1 = new RecordTypeMessage((XBUSSystem) null);
      try { 
        recordTypeMessage1.setRequestObject(deferredDocumentImpl0, (XBUSSystem) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // I_02_003_0 org.apache.xerces.dom.DeferredDocumentImpl cannot be cast to net.sf.xbus.base.bytearraylist.ByteArrayList
         //
         verifyException("net.sf.xbus.protocol.records.RecordTypeMessage", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.0431918705451206
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      XBUSSystem xBUSSystem0 = null;
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      String string0 = "Yx||%{n0N!";
      recordTypeMessage0.synchronizeResponseFields((XBUSSystem) null);
      recordTypeMessage0.setShortname("Yx||%{n0N!");
      recordTypeMessage0.setResponseTimestamp((Date) null);
      recordTypeMessage0.getRequestObject((XBUSSystem) null);
      ByteArrayList byteArrayList0 = new ByteArrayList();
      recordTypeMessage0.setRequestObject(byteArrayList0, (XBUSSystem) null);
      String string1 = "1lsgPc0_kvd3";
      recordTypeMessage0.setErrortext("1lsgPc0_kvd3");
      // Undeclared exception!
      try { 
        recordTypeMessage0.setRequestText("Yx||%{n0N!", (XBUSSystem) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sf.xbus.protocol.xml.XMLMessageAbstract", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      XBUSSystem xBUSSystem0 = null;
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage("@hzv,gWdwVwj'Ru", (XBUSSystem) null, "");
      Detail detail0 = new Detail();
      InputSource inputSource0 = new InputSource();
      MessageContext.getCurrentContext();
      recordTypeMessage0.getRequestObject((XBUSSystem) null);
      recordTypeMessage0.getResponseText();
      recordTypeMessage0.setResponseText((String) null, (XBUSSystem) null);
      MockDate mockDate0 = new MockDate(1712, 199, 199);
      mockDate0.getTime();
      recordTypeMessage0.setResponseTimestamp(mockDate0);
      recordTypeMessage0.getResponseObject();
      Hashtable<ByteArrayList, Object> hashtable0 = new Hashtable<ByteArrayList, Object>();
      XBUSSystem xBUSSystem1 = null;
      try {
        xBUSSystem1 = new XBUSSystem("'", hashtable0);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      XBUSSystem xBUSSystem0 = null;
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage("", (XBUSSystem) null, "|PWyLp; U3i[/P:KZ");
      recordTypeMessage0.getResponseText();
      recordTypeMessage0.getRequestObject((XBUSSystem) null);
      recordTypeMessage0.setErrorcode(64);
      recordTypeMessage0.getRequestTextAsXML((XBUSSystem) null);
      recordTypeMessage0.getResponseObject();
      recordTypeMessage0.getResponseObject();
      ByteArrayList byteArrayList0 = new ByteArrayList();
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)64;
      byteArray0[1] = (byte)6;
      byteArray0[2] = (byte)1;
      byteArray0[3] = (byte)26;
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte)62;
      byteArray0[6] = (byte)12;
      ByteArrayList byteArrayList1 = ByteArrayList.createByteArrayList(byteArray0, 0);
      ByteArrayList.createByteArrayList(byteArray0, 0);
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
  //Test case number: 7
  /*Coverage entropy=1.7478680974667573
  */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      XBUSSystem xBUSSystem0 = null;
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage("@hzv,gWdwVwj'Ru", (XBUSSystem) null, "");
      recordTypeMessage0.synchronizeResponseFields((XBUSSystem) null);
      recordTypeMessage0.setErrorcode(1311);
      recordTypeMessage0.setShortname("");
      recordTypeMessage0.getRequestObject((XBUSSystem) null);
      ByteArrayList byteArrayList0 = new ByteArrayList();
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-98);
      byteArray0[2] = (byte) (-30);
      byteArray0[3] = (byte)6;
      byteArrayList0.add(byteArray0);
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
  //Test case number: 8
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      DocumentTypeImpl documentTypeImpl0 = new DocumentTypeImpl((CoreDocumentImpl) null, "");
      DocumentImpl documentImpl0 = new DocumentImpl(documentTypeImpl0);
      DocumentTypeImpl documentTypeImpl1 = new DocumentTypeImpl(documentImpl0, "streamClosed", "streamClosed", "x6");
      PSVIDocumentImpl pSVIDocumentImpl0 = new PSVIDocumentImpl(documentTypeImpl1);
      recordTypeMessage0.setResponseDocument(pSVIDocumentImpl0, (XBUSSystem) null);
      recordTypeMessage0.getResponseObject();
      assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.0431918705451206
  */
  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      WSDDJAXRPCHandlerInfoChain wSDDJAXRPCHandlerInfoChain0 = new WSDDJAXRPCHandlerInfoChain();
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage("org.apache.axis.encoding.ser.BeanSerializerFactory", (XBUSSystem) null, "http://xml.apache.org/axis/wsdd/");
      recordTypeMessage0.getRequestObject((XBUSSystem) null);
      recordTypeMessage0.getRequestText((XBUSSystem) null);
      recordTypeMessage0.getRequestObject((XBUSSystem) null);
      recordTypeMessage0.getResponseText();
      recordTypeMessage0.getRequestTextAsXML((XBUSSystem) null);
      recordTypeMessage0.setErrortext("typeMapping");
      CoreDocumentImpl coreDocumentImpl0 = new CoreDocumentImpl();
      DocumentTypeImpl documentTypeImpl0 = new DocumentTypeImpl(coreDocumentImpl0, "org.apache.axis.encoding.ser.BeanSerializerFactory", (String) null, "@rYUsXbzn]^");
      PSVIDocumentImpl pSVIDocumentImpl0 = new PSVIDocumentImpl(documentTypeImpl0);
      recordTypeMessage0.setResponseDocument(coreDocumentImpl0, (XBUSSystem) null);
      recordTypeMessage0.getResponseObject();
      recordTypeMessage0.getResponseText();
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      assertEquals("RC_OK", recordTypeMessage0.getReturncode());
  }
}
