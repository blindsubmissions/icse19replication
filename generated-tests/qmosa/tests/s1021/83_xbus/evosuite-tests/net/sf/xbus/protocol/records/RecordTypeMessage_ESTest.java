/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 15:33:53 GMT 2018
 */

package net.sf.xbus.protocol.records;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import javax.xml.namespace.QName;
import net.sf.xbus.base.bytearraylist.ByteArrayList;
import net.sf.xbus.base.xbussystem.XBUSSystem;
import net.sf.xbus.protocol.records.RecordTypeMessage;
import org.apache.axis.Message;
import org.apache.axis.SOAPPart;
import org.apache.axis.deployment.wsdd.WSDDRequestFlow;
import org.apache.axis.message.RPCParam;
import org.apache.axis.utils.LockableHashtable;
import org.apache.html.dom.HTMLDocumentImpl;
import org.apache.html.dom.HTMLUListElementImpl;
import org.apache.xerces.dom.DeferredDocumentImpl;
import org.apache.xerces.dom.DocumentImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import org.w3c.dom.DocumentType;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RecordTypeMessage_ESTest extends RecordTypeMessage_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XBUSSystem xBUSSystem0 = null;
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.getRequestText((XBUSSystem) null);
      recordTypeMessage0.getResponseObject();
      recordTypeMessage0.setRequestText((String) null, (XBUSSystem) null);
      recordTypeMessage0.synchronizeResponseFields((XBUSSystem) null);
      recordTypeMessage0.synchronizeRequestFields((XBUSSystem) null);
      recordTypeMessage0.getResponseObject();
      recordTypeMessage0.getRequestText((XBUSSystem) null);
      recordTypeMessage0.setResponseObject((Object) null, (XBUSSystem) null);
      recordTypeMessage0.setResponseObject((Object) null, (XBUSSystem) null);
      recordTypeMessage0.synchronizeResponseFields((XBUSSystem) null);
      recordTypeMessage0.synchronizeResponseFields((XBUSSystem) null);
      recordTypeMessage0.getResponseText();
      recordTypeMessage0.setRequestObject((Object) null, (XBUSSystem) null);
      // Undeclared exception!
      try { 
        recordTypeMessage0.setRequestText("0", (XBUSSystem) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sf.xbus.protocol.xml.XMLMessageAbstract", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String string0 = "";
      XBUSSystem xBUSSystem0 = null;
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage("", (XBUSSystem) null, "");
      recordTypeMessage0.synchronizeResponseFields((XBUSSystem) null);
      recordTypeMessage0.getResponseObject();
      recordTypeMessage0.getRequestTextAsXML((XBUSSystem) null);
      recordTypeMessage0.setResponseText((String) null, (XBUSSystem) null);
      XBUSSystem xBUSSystem1 = null;
      recordTypeMessage0.getRequestObject((XBUSSystem) null);
      recordTypeMessage0.setResponseObject((Object) null, (XBUSSystem) null);
      DeferredDocumentImpl deferredDocumentImpl0 = new DeferredDocumentImpl();
      deferredDocumentImpl0.setStandalone(false);
      // Undeclared exception!
      try { 
        recordTypeMessage0.setRequestDocument(deferredDocumentImpl0, (XBUSSystem) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xerces.dom.DeferredDocumentImpl", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String string0 = "003";
      XBUSSystem xBUSSystem0 = null;
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage("003", (XBUSSystem) null, "003");
      int int0 = 42;
      // Undeclared exception!
      try { 
        recordTypeMessage0.setResponseText("003", (XBUSSystem) null);
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
  /*Coverage entropy=2.2102535776209735
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.setRequestObject((Object) null, (XBUSSystem) null);
      recordTypeMessage0.getRequestText((XBUSSystem) null);
      recordTypeMessage0.getResponseObject();
      recordTypeMessage0.setRequestText((String) null, (XBUSSystem) null);
      recordTypeMessage0.synchronizeRequestFields((XBUSSystem) null);
      recordTypeMessage0.getResponseObject();
      recordTypeMessage0.getRequestText((XBUSSystem) null);
      recordTypeMessage0.setResponseObject((Object) null, (XBUSSystem) null);
      recordTypeMessage0.synchronizeResponseFields((XBUSSystem) null);
      recordTypeMessage0.getResponseText();
      recordTypeMessage0.setRequestObject((Object) null, (XBUSSystem) null);
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)22;
      ByteArrayList byteArrayList0 = ByteArrayList.createByteArrayList(byteArray0, 464);
      recordTypeMessage0.setRequestObject(byteArrayList0, (XBUSSystem) null);
      System.setCurrentTimeMillis((-1477L));
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      XBUSSystem xBUSSystem0 = null;
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.getRequestText((XBUSSystem) null);
      recordTypeMessage0.setRequestText((String) null, (XBUSSystem) null);
      recordTypeMessage0.synchronizeResponseFields((XBUSSystem) null);
      recordTypeMessage0.synchronizeRequestFields((XBUSSystem) null);
      recordTypeMessage0.getResponseObject();
      System.setCurrentTimeMillis((-3561L));
      System.setCurrentTimeMillis((-3561L));
      recordTypeMessage0.getRequestDocument((XBUSSystem) null);
      System.setCurrentTimeMillis((-310L));
      ByteArrayList byteArrayList0 = new ByteArrayList();
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)113;
      byteArray0[2] = (byte)19;
      byteArray0[3] = (byte)0;
      byteArrayList0.add(byteArray0);
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
  //Test case number: 5
  /*Coverage entropy=1.4750763110546947
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((String) null, (XBUSSystem) null, (String) null);
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)60;
      recordTypeMessage0.setRequestObject((Object) null, (XBUSSystem) null);
      ByteArrayList byteArrayList0 = ByteArrayList.createByteArrayList(byteArray0, (-13));
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
  //Test case number: 6
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      XBUSSystem xBUSSystem0 = null;
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      Message message0 = new Message((Object) null, false);
      SOAPPart sOAPPart0 = new SOAPPart(message0, recordTypeMessage0, true);
      sOAPPart0.getDoctype();
      DocumentImpl documentImpl0 = new DocumentImpl((DocumentType) null, false);
      recordTypeMessage0.setResponseDocument(documentImpl0, (XBUSSystem) null);
      recordTypeMessage0.getRequestText((XBUSSystem) null);
      recordTypeMessage0.setRequestText((String) null, (XBUSSystem) null);
      recordTypeMessage0.synchronizeRequestFields((XBUSSystem) null);
      recordTypeMessage0.getResponseObject();
      recordTypeMessage0.setResponseObject((Object) null, (XBUSSystem) null);
      recordTypeMessage0.setResponseObject((Object) null, (XBUSSystem) null);
      recordTypeMessage0.synchronizeResponseFields((XBUSSystem) null);
      recordTypeMessage0.synchronizeResponseFields((XBUSSystem) null);
      recordTypeMessage0.getResponseText();
      recordTypeMessage0.getResponseText();
      Integer integer0 = new Integer(2212);
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
  //Test case number: 7
  /*Coverage entropy=2.0982737395252498
  */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      Message message0 = new Message((Object) null, false);
      SOAPPart sOAPPart0 = new SOAPPart(message0, recordTypeMessage0, true);
      sOAPPart0.getDoctype();
      DocumentImpl documentImpl0 = new DocumentImpl((DocumentType) null, false);
      recordTypeMessage0.setResponseDocument(documentImpl0, (XBUSSystem) null);
      recordTypeMessage0.getRequestText((XBUSSystem) null);
      recordTypeMessage0.setRequestText((String) null, (XBUSSystem) null);
      recordTypeMessage0.synchronizeRequestFields((XBUSSystem) null);
      recordTypeMessage0.getResponseObject();
      recordTypeMessage0.synchronizeResponseFields((XBUSSystem) null);
      recordTypeMessage0.synchronizeResponseFields((XBUSSystem) null);
      recordTypeMessage0.getResponseText();
      recordTypeMessage0.getResponseText();
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "7!");
      Integer integer0 = new Integer(7);
      recordTypeMessage0.setRequestObject((Object) null, (XBUSSystem) null);
      RecordTypeMessage recordTypeMessage1 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage1.getResponseObject();
      RecordTypeMessage recordTypeMessage2 = new RecordTypeMessage((XBUSSystem) null);
      ByteArrayList byteArrayList0 = new ByteArrayList();
      recordTypeMessage1.setRequestObject(byteArrayList0, (XBUSSystem) null);
      recordTypeMessage0.getResponseText();
      assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
  }
}
