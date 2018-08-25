/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 14:17:10 GMT 2018
 */

package net.sf.xbus.protocol.records;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Hashtable;
import net.sf.xbus.base.bytearraylist.ByteArrayList;
import net.sf.xbus.base.xbussystem.XBUSSystem;
import net.sf.xbus.protocol.records.RecordTypeMessage;
import org.apache.axis.Message;
import org.apache.axis.SOAPPart;
import org.apache.axis.deployment.wsdd.WSDDHandler;
import org.apache.axis.utils.LockableHashtable;
import org.apache.wml.dom.WMLDocumentImpl;
import org.apache.xerces.dom.DeferredDocumentImpl;
import org.apache.xerces.dom.DocumentImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import org.w3c.dom.Document;
import org.w3c.dom.DocumentType;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RecordTypeMessage_ESTest extends RecordTypeMessage_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XBUSSystem xBUSSystem0 = null;
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage("enter HttpState.getProxyCredentials(AuthScope)", (XBUSSystem) null, "120");
      recordTypeMessage0.setErrorcode(246);
      recordTypeMessage0.synchronizeResponseFields((XBUSSystem) null);
      recordTypeMessage0.synchronizeResponseFields((XBUSSystem) null);
      recordTypeMessage0.getRequestTextAsXML((XBUSSystem) null);
      try { 
        recordTypeMessage0.setRequestObject("", (XBUSSystem) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // I_02_003_0 java.lang.String cannot be cast to net.sf.xbus.base.bytearraylist.ByteArrayList
         //
         verifyException("net.sf.xbus.protocol.records.RecordTypeMessage", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage("jd$9YPYo{/d", (XBUSSystem) null, "INOUT)");
      recordTypeMessage0.setErrortext("jd$9YPYo{/d");
      recordTypeMessage0.getRequestObject((XBUSSystem) null);
      recordTypeMessage0.getRequestText((XBUSSystem) null);
      recordTypeMessage0.setResponseText((String) null, (XBUSSystem) null);
      recordTypeMessage0.setRequestObject((Object) null, (XBUSSystem) null);
      recordTypeMessage0.setResponseText((String) null, (XBUSSystem) null);
      // Undeclared exception!
      try { 
        recordTypeMessage0.setRequestText("jd$9YPYo{/d", (XBUSSystem) null);
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
  /*Coverage entropy=2.1639556568820564
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      XBUSSystem xBUSSystem0 = null;
      XBUSSystem xBUSSystem1 = null;
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.setErrortext("mKA0]F$4ju*a|Yq%+");
      XBUSSystem xBUSSystem2 = null;
      RecordTypeMessage recordTypeMessage1 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage1.getRequestObject((XBUSSystem) null);
      recordTypeMessage0.getRequestText((XBUSSystem) null);
      ByteArrayList byteArrayList0 = new ByteArrayList();
      recordTypeMessage0.setRequestText((String) null, (XBUSSystem) null);
      recordTypeMessage0.setRequestObject(byteArrayList0, (XBUSSystem) null);
      // Undeclared exception!
      try { 
        recordTypeMessage1.setResponseText("", (XBUSSystem) null);
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
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      XBUSSystem xBUSSystem0 = null;
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.setErrortext("mKA0]F$4ju*a|Yq%+");
      XBUSSystem xBUSSystem1 = null;
      RecordTypeMessage recordTypeMessage1 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.getRequestText((XBUSSystem) null);
      ByteArrayList byteArrayList0 = new ByteArrayList();
      recordTypeMessage0.setRequestText((String) null, (XBUSSystem) null);
      DocumentImpl documentImpl0 = new DocumentImpl();
      documentImpl0.getOwnerDocument();
      recordTypeMessage0.setRequestDocument((Document) null, (XBUSSystem) null);
      recordTypeMessage0.setErrortext("");
      RecordTypeMessage recordTypeMessage2 = new RecordTypeMessage("default-selected", (XBUSSystem) null, "/EFbmT^Zp9");
      recordTypeMessage2.getRequestTextAsXML((XBUSSystem) null);
      recordTypeMessage1.getRequestTextAsXML((XBUSSystem) null);
      try { 
        recordTypeMessage0.setResponseObject("", (XBUSSystem) null);
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
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.getResponseObject();
      recordTypeMessage0.getRequestObject((XBUSSystem) null);
      recordTypeMessage0.setRequestObject((Object) null, (XBUSSystem) null);
      System.setCurrentTimeMillis((-3467L));
      recordTypeMessage0.getResponseObject();
      recordTypeMessage0.setErrortext("aje>B;KC/DA+V P:");
      RecordTypeMessage recordTypeMessage1 = new RecordTypeMessage("aje>B;KC/DA+V P:", (XBUSSystem) null, "");
      recordTypeMessage0.getRequestTextAsXML((XBUSSystem) null);
      recordTypeMessage1.getRequestTextAsXML((XBUSSystem) null);
      RecordTypeMessage recordTypeMessage2 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage2.setResponseObject((Object) null, (XBUSSystem) null);
      String string0 = "A}";
      Hashtable<Integer, Object> hashtable0 = null;
      XBUSSystem xBUSSystem0 = null;
      try {
        xBUSSystem0 = new XBUSSystem("FIG\"EX].|rmHOJS++h", (Hashtable) null);
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
  /*Coverage entropy=2.3693821196946767
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.getResponseObject();
      recordTypeMessage0.getRequestObject((XBUSSystem) null);
      RecordTypeMessage recordTypeMessage1 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage1.setRequestObject((Object) null, (XBUSSystem) null);
      System.setCurrentTimeMillis(2378L);
      recordTypeMessage0.getResponseObject();
      recordTypeMessage0.getResponseText();
      recordTypeMessage0.getResponseObject();
      recordTypeMessage1.getRequestObject((XBUSSystem) null);
      recordTypeMessage0.getRequestObject((XBUSSystem) null);
      recordTypeMessage1.synchronizeRequestFields((XBUSSystem) null);
      recordTypeMessage0.getRequestTextAsXML((XBUSSystem) null);
      recordTypeMessage0.setResponseText((String) null, (XBUSSystem) null);
      recordTypeMessage0.getResponseText();
      recordTypeMessage0.getRequestObject((XBUSSystem) null);
      ByteArrayList byteArrayList0 = new ByteArrayList();
      recordTypeMessage1.setResponseObject(byteArrayList0, (XBUSSystem) null);
      assertEquals(0, recordTypeMessage1.getErrorcode());
      assertEquals("RC_OK", recordTypeMessage1.getReturncode());
      
      recordTypeMessage0.getRequestObject((XBUSSystem) null);
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      assertEquals(0, recordTypeMessage0.getErrorcode());
      assertEquals("RC_OK", recordTypeMessage0.getReturncode());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.3693821196946767
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      XBUSSystem xBUSSystem0 = null;
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.getRequestObject((XBUSSystem) null);
      recordTypeMessage0.getRequestText((XBUSSystem) null);
      ByteArrayList byteArrayList0 = new ByteArrayList();
      recordTypeMessage0.setRequestObject(byteArrayList0, (XBUSSystem) null);
      recordTypeMessage0.setResponseText((String) null, (XBUSSystem) null);
      recordTypeMessage0.getRequestObject((XBUSSystem) null);
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)23;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)1;
      ByteArrayList byteArrayList1 = ByteArrayList.createByteArrayList(byteArray0, 0);
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
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, true);
      XBUSSystem xBUSSystem0 = null;
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.getRequestObject((XBUSSystem) null);
      ByteArrayList byteArrayList0 = new ByteArrayList();
      byte[] byteArray0 = new byte[3];
      byteArrayList0.add(byteArray0);
      byteArray0[0] = (byte)1;
      byteArray0[1] = (byte) (-49);
      byteArray0[2] = (byte) (-68);
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
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      XBUSSystem xBUSSystem0 = null;
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.getResponseObject();
      XBUSSystem xBUSSystem1 = null;
      RecordTypeMessage recordTypeMessage1 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage1.getRequestText((XBUSSystem) null);
      recordTypeMessage1.getRequestObject((XBUSSystem) null);
      recordTypeMessage0.getRequestText((XBUSSystem) null);
      ByteArrayList byteArrayList0 = new ByteArrayList();
      recordTypeMessage0.setRequestText((String) null, (XBUSSystem) null);
      recordTypeMessage1.setRequestObject((Object) null, (XBUSSystem) null);
      recordTypeMessage1.setResponseText((String) null, (XBUSSystem) null);
      recordTypeMessage1.getRequestText((XBUSSystem) null);
      SOAPPart sOAPPart0 = new SOAPPart((Message) null, (Object) null, false);
      sOAPPart0.getDoctype();
      WMLDocumentImpl wMLDocumentImpl0 = new WMLDocumentImpl((DocumentType) null);
      recordTypeMessage0.setResponseDocument(wMLDocumentImpl0, (XBUSSystem) null);
      recordTypeMessage0.getResponseText();
      // Undeclared exception!
      try { 
        recordTypeMessage0.setRequestText("5*kZOiV]1-q V,l!|u", (XBUSSystem) null);
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
  /*Coverage entropy=2.4583113296830845
  */
  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.getResponseObject();
      RecordTypeMessage recordTypeMessage1 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage1.getRequestText((XBUSSystem) null);
      recordTypeMessage1.getRequestObject((XBUSSystem) null);
      recordTypeMessage0.getRequestText((XBUSSystem) null);
      ByteArrayList byteArrayList0 = new ByteArrayList();
      recordTypeMessage0.setRequestText((String) null, (XBUSSystem) null);
      recordTypeMessage1.setRequestObject((Object) null, (XBUSSystem) null);
      recordTypeMessage1.setResponseText((String) null, (XBUSSystem) null);
      recordTypeMessage1.getRequestText((XBUSSystem) null);
      SOAPPart sOAPPart0 = new SOAPPart((Message) null, (Object) null, false);
      sOAPPart0.getDoctype();
      WMLDocumentImpl wMLDocumentImpl0 = new WMLDocumentImpl((DocumentType) null);
      recordTypeMessage0.setResponseDocument(wMLDocumentImpl0, (XBUSSystem) null);
      RecordTypeMessage recordTypeMessage2 = new RecordTypeMessage("5*kZOiV]1-q V,l!|u", (XBUSSystem) null, "axis.form.optimization");
      recordTypeMessage2.getResponseText();
      RecordTypeMessage recordTypeMessage3 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.getResponseObject();
      recordTypeMessage2.getResponseText();
      assertEquals("RecordTypeMessage", recordTypeMessage2.getShortname());
      
      recordTypeMessage1.getRequestObject((XBUSSystem) null);
      assertEquals(0, recordTypeMessage1.getErrorcode());
      
      recordTypeMessage3.getRequestText((XBUSSystem) null);
      RecordTypeMessage recordTypeMessage4 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.getRequestObject((XBUSSystem) null);
      assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      
      recordTypeMessage3.getResponseText();
      assertEquals("RecordTypeMessage", recordTypeMessage3.getShortname());
  }
}
