/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 13:43:55 GMT 2018
 */

package net.sf.xbus.protocol.records;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.util.Hashtable;
import javax.xml.namespace.QName;
import net.sf.xbus.base.bytearraylist.ByteArrayList;
import net.sf.xbus.base.xbussystem.XBUSSystem;
import net.sf.xbus.protocol.records.RecordTypeMessage;
import org.apache.axis.deployment.wsdd.WSDDConstants;
import org.apache.axis.deployment.wsdd.WSDDFaultFlow;
import org.apache.axis.deployment.wsdd.WSDDService;
import org.apache.axis.encoding.DeserializationContext;
import org.apache.axis.message.Detail;
import org.apache.axis.message.SOAPBody;
import org.apache.axis.soap.SOAP12Constants;
import org.apache.axis.soap.SOAPConstants;
import org.apache.axis.utils.LockableHashtable;
import org.apache.html.dom.HTMLDocumentImpl;
import org.apache.html.dom.HTMLOptionElementImpl;
import org.apache.xerces.dom.DocumentImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import org.w3c.dom.Document;
import org.xml.sax.Attributes;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RecordTypeMessage_ESTest extends RecordTypeMessage_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage("8^R54#", (XBUSSystem) null, "0");
      recordTypeMessage0.getRequestText((XBUSSystem) null);
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = "";
      XBUSSystem xBUSSystem0 = null;
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage("", (XBUSSystem) null, "");
      recordTypeMessage0.getResponseText();
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
  //Test case number: 2
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      XBUSSystem xBUSSystem0 = null;
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.getResponseObject();
      recordTypeMessage0.setResponseObject((Object) null, (XBUSSystem) null);
      String string0 = "w4 m]c(";
      DocumentImpl documentImpl0 = new DocumentImpl();
      documentImpl0.getOwnerDocument();
      recordTypeMessage0.setResponseDocument((Document) null, (XBUSSystem) null);
      Hashtable<String, String> hashtable0 = new Hashtable<String, String>();
      XBUSSystem xBUSSystem1 = null;
      try {
        xBUSSystem1 = new XBUSSystem("w4 m]c(", hashtable0);
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
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = "\"{::?KBh)80'}x2";
      XBUSSystem xBUSSystem0 = null;
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage("\"{::?KBh)80'}x2", (XBUSSystem) null, "\"{::?KBh)80'}x2");
      recordTypeMessage0.synchronizeResponseFields((XBUSSystem) null);
      recordTypeMessage0.setErrortext("\"{::?KBh)80'}x2");
      try { 
        recordTypeMessage0.setResponseObject("\"{::?KBh)80'}x2", (XBUSSystem) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // I_02_003_0 java.lang.String cannot be cast to net.sf.xbus.base.bytearraylist.ByteArrayList
         //
         verifyException("net.sf.xbus.protocol.records.RecordTypeMessage", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      XBUSSystem xBUSSystem0 = null;
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.getRequestDocument((XBUSSystem) null);
      recordTypeMessage0.setResponseDocument((Document) null, (XBUSSystem) null);
      RecordTypeMessage recordTypeMessage1 = new RecordTypeMessage("#k^0Mu", (XBUSSystem) null, "#k^0Mu");
      RecordTypeMessage recordTypeMessage2 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage2.getRequestTextAsXML((XBUSSystem) null);
      XBUSSystem xBUSSystem1 = null;
      try {
        xBUSSystem1 = new XBUSSystem("");
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = "]3$\"A";
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage("]3$\"A", (XBUSSystem) null, "RecordTypeMessage");
      recordTypeMessage0.getRequestObject((XBUSSystem) null);
      recordTypeMessage0.setRequestObject((Object) null, (XBUSSystem) null);
      HTMLDocumentImpl hTMLDocumentImpl0 = new HTMLDocumentImpl();
      HTMLOptionElementImpl hTMLOptionElementImpl0 = new HTMLOptionElementImpl(hTMLDocumentImpl0, "[^hHTRMY");
      WSDDService wSDDService0 = null;
      try {
        wSDDService0 = new WSDDService(hTMLOptionElementImpl0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Invalid WSDD element 'null' (wanted 'service')
         //
         verifyException("org.apache.axis.deployment.wsdd.WSDDElement", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.1639556568820564
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.setResponseText((String) null, (XBUSSystem) null);
      recordTypeMessage0.getRequestObject((XBUSSystem) null);
      recordTypeMessage0.setResponseText((String) null, (XBUSSystem) null);
      recordTypeMessage0.setRequestText((String) null, (XBUSSystem) null);
      // Undeclared exception!
      try { 
        recordTypeMessage0.setResponseText("bad encoding style", (XBUSSystem) null);
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
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XBUSSystem xBUSSystem0 = null;
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      DocumentImpl documentImpl0 = new DocumentImpl();
      recordTypeMessage0.setResponseDocument(documentImpl0, (XBUSSystem) null);
      recordTypeMessage0.getResponseText();
      recordTypeMessage0.getResponseObject();
      recordTypeMessage0.setResponseDocument(documentImpl0, (XBUSSystem) null);
      recordTypeMessage0.setResponseDocument(documentImpl0, (XBUSSystem) null);
      recordTypeMessage0.synchronizeRequestFields((XBUSSystem) null);
      recordTypeMessage0.getRequestText((XBUSSystem) null);
      recordTypeMessage0.getResponseText();
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
  //Test case number: 8
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      System.setCurrentTimeMillis(5016L);
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      ByteArrayList byteArrayList0 = new ByteArrayList();
      recordTypeMessage0.setResponseObject(byteArrayList0, (XBUSSystem) null);
      recordTypeMessage0.getRequestObject((XBUSSystem) null);
      recordTypeMessage0.getRequestText((XBUSSystem) null);
      assertEquals(0, recordTypeMessage0.getErrorcode());
      assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.9061547465398496
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      XBUSSystem xBUSSystem0 = null;
      System.setCurrentTimeMillis(5016L);
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      ByteArrayList byteArrayList0 = new ByteArrayList();
      recordTypeMessage0.setResponseObject(byteArrayList0, (XBUSSystem) null);
      recordTypeMessage0.setRequestObject(byteArrayList0, (XBUSSystem) null);
      recordTypeMessage0.synchronizeRequestFields((XBUSSystem) null);
      // Undeclared exception!
      try { 
        recordTypeMessage0.setRequestText("s%}Sw`^bReIK 8O-", (XBUSSystem) null);
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
  /*Coverage entropy=2.1458417525947544
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      XBUSSystem xBUSSystem0 = null;
      System.setCurrentTimeMillis(5016L);
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      ByteArrayList byteArrayList0 = new ByteArrayList();
      byte[] byteArray0 = new byte[2];
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, true);
      byteArray0[0] = (byte)66;
      byteArray0[1] = (byte)0;
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
  //Test case number: 11
  /*Coverage entropy=1.9061547465398496
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      System.setCurrentTimeMillis(5016L);
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.setErrortext(" not found");
      recordTypeMessage0.getRequestTextAsXML((XBUSSystem) null);
      recordTypeMessage0.getRequestText((XBUSSystem) null);
      recordTypeMessage0.getRequestObject((XBUSSystem) null);
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)18;
      byteArray0[1] = (byte)59;
      byteArray0[2] = (byte) (-96);
      byteArray0[1] = (byte) (-68);
      ByteArrayList.createByteArrayList(byteArray0, (byte)18);
      RecordTypeMessage recordTypeMessage1 = new RecordTypeMessage((XBUSSystem) null);
      byte[] byteArray1 = new byte[3];
      byteArray1[0] = (byte)59;
      byteArray1[1] = (byte) (-125);
      byteArray1[2] = (byte)59;
      ByteArrayList byteArrayList0 = ByteArrayList.createByteArrayList(byteArray1, (-1685));
      // Undeclared exception!
      try { 
        recordTypeMessage1.setRequestObject(byteArrayList0, (XBUSSystem) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sf.xbus.protocol.xml.XMLMessageAbstract", e);
      }
  }
}
