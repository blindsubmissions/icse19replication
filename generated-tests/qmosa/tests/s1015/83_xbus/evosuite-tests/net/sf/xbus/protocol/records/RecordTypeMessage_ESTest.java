/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 13:55:02 GMT 2018
 */

package net.sf.xbus.protocol.records;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Hashtable;
import net.sf.xbus.base.bytearraylist.ByteArrayList;
import net.sf.xbus.base.xbussystem.XBUSSystem;
import net.sf.xbus.protocol.records.RecordTypeMessage;
import org.apache.html.dom.HTMLDocumentImpl;
import org.apache.html.dom.HTMLObjectElementImpl;
import org.apache.xerces.dom.CoreDocumentImpl;
import org.apache.xerces.dom.PSVIDocumentImpl;
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
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = ")]X?z^P4K|";
      XBUSSystem xBUSSystem0 = null;
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage(")]X?z^P4K|", (XBUSSystem) null, ")]X?z^P4K|");
      recordTypeMessage0.synchronizeResponseFields((XBUSSystem) null);
      recordTypeMessage0.synchronizeResponseFields((XBUSSystem) null);
      String string1 = ")/{lZX*";
      String string2 = "9JA.cXMzi";
      // Undeclared exception!
      try { 
        recordTypeMessage0.setResponseText("9JA.cXMzi", (XBUSSystem) null);
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
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.setRequestDocument((Document) null, (XBUSSystem) null);
      recordTypeMessage0.setRequestObject((Object) null, (XBUSSystem) null);
      recordTypeMessage0.synchronizeRequestFields((XBUSSystem) null);
      recordTypeMessage0.getRequestTextAsXML((XBUSSystem) null);
      recordTypeMessage0.getResponseObject();
      recordTypeMessage0.synchronizeResponseFields((XBUSSystem) null);
      recordTypeMessage0.setResponseDocument((Document) null, (XBUSSystem) null);
      assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.0982737395252498
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.setRequestDocument((Document) null, (XBUSSystem) null);
      recordTypeMessage0.synchronizeRequestFields((XBUSSystem) null);
      recordTypeMessage0.getRequestTextAsXML((XBUSSystem) null);
      String string0 = "02";
      recordTypeMessage0.setReturncode("02");
      recordTypeMessage0.setErrortext((String) null);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      RecordTypeMessage recordTypeMessage1 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage1.setResponseText((String) null, (XBUSSystem) null);
      recordTypeMessage0.getRequestObject((XBUSSystem) null);
      recordTypeMessage1.setResponseText((String) null, (XBUSSystem) null);
      recordTypeMessage0.setRequestText((String) null, (XBUSSystem) null);
      recordTypeMessage0.getRequestObject((XBUSSystem) null);
      recordTypeMessage0.setRequestObject((Object) null, (XBUSSystem) null);
      ByteArrayList byteArrayList0 = new ByteArrayList();
      recordTypeMessage0.setRequestObject(byteArrayList0, (XBUSSystem) null);
      String string1 = "org.apache.html.dom.HTMLCollectionImpl";
      XBUSSystem xBUSSystem0 = null;
      try {
        xBUSSystem0 = new XBUSSystem("org.apache.html.dom.HTMLCollectionImpl");
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
  /*Coverage entropy=2.0982737395252498
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      XBUSSystem xBUSSystem0 = null;
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.setRequestDocument((Document) null, (XBUSSystem) null);
      recordTypeMessage0.setRequestObject((Object) null, (XBUSSystem) null);
      recordTypeMessage0.synchronizeRequestFields((XBUSSystem) null);
      recordTypeMessage0.getRequestTextAsXML((XBUSSystem) null);
      recordTypeMessage0.setReturncode("02");
      recordTypeMessage0.getRequestText((XBUSSystem) null);
      RecordTypeMessage recordTypeMessage1 = new RecordTypeMessage((String) null, (XBUSSystem) null, (String) null);
      recordTypeMessage1.getRequestTextAsXML((XBUSSystem) null);
      recordTypeMessage1.getResponseObject();
      recordTypeMessage1.getRequestTextAsXML((XBUSSystem) null);
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-1);
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)30;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)0;
      ByteArrayList byteArrayList0 = ByteArrayList.createByteArrayList(byteArray0, (byte) (-1));
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

  /**
  //Test case number: 4
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((String) null, (XBUSSystem) null, "=jE}rXTs[j/O0gLR");
      recordTypeMessage0.getRequestObject((XBUSSystem) null);
      recordTypeMessage0.setResponseObject((Object) null, (XBUSSystem) null);
      assertEquals(0, recordTypeMessage0.getErrorcode());
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      assertEquals("RC_OK", recordTypeMessage0.getReturncode());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.setRequestDocument((Document) null, (XBUSSystem) null);
      recordTypeMessage0.setRequestObject((Object) null, (XBUSSystem) null);
      recordTypeMessage0.synchronizeRequestFields((XBUSSystem) null);
      recordTypeMessage0.getRequestTextAsXML((XBUSSystem) null);
      recordTypeMessage0.setReturncode("02");
      recordTypeMessage0.getRequestText((XBUSSystem) null);
      RecordTypeMessage recordTypeMessage1 = new RecordTypeMessage((String) null, (XBUSSystem) null, (String) null);
      recordTypeMessage1.getRequestTextAsXML((XBUSSystem) null);
      recordTypeMessage1.getResponseObject();
      recordTypeMessage1.getRequestTextAsXML((XBUSSystem) null);
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-1);
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)30;
      recordTypeMessage0.getRequestObject((XBUSSystem) null);
      try { 
        recordTypeMessage1.setResponseObject("", (XBUSSystem) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // I_02_003_0 java.lang.String cannot be cast to net.sf.xbus.base.bytearraylist.ByteArrayList
         //
         verifyException("net.sf.xbus.protocol.records.RecordTypeMessage", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      RecordTypeMessage recordTypeMessage1 = new RecordTypeMessage("qA>nK!W peq!a?", (XBUSSystem) null, "qA>nK!W peq!a?");
      recordTypeMessage1.setReturncode("qA>nK!W peq!a?");
      ByteArrayList byteArrayList0 = new ByteArrayList();
      recordTypeMessage1.setResponseObject(byteArrayList0, (XBUSSystem) null);
      assertEquals("RC_OK", recordTypeMessage1.getReturncode());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage("org.apache.html.dom.HTMLFieldSetElementImpl", (XBUSSystem) null, "org.apache.html.dom.HTMLFieldSetElementImpl");
      recordTypeMessage0.getResponseText();
      RecordTypeMessage recordTypeMessage1 = new RecordTypeMessage("qA>nK!W peq!a?", (XBUSSystem) null, (String) null);
      recordTypeMessage0.setReturncode("xUuoY#ZbanJ9mPWb3");
      ByteArrayList byteArrayList0 = new ByteArrayList();
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)126;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)37;
      byteArray0[4] = (byte)5;
      ByteArrayList byteArrayList1 = ByteArrayList.createByteArrayList(byteArray0, (byte)0);
      // Undeclared exception!
      try { 
        recordTypeMessage1.setResponseObject(byteArrayList1, (XBUSSystem) null);
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
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      XBUSSystem xBUSSystem0 = null;
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage("org.apache.html.dom.HTMLFieldSetElementImpl", (XBUSSystem) null, "org.apache.html.dom.HTMLFieldSetElementImpl");
      recordTypeMessage0.getResponseText();
      recordTypeMessage0.getResponseText();
      RecordTypeMessage recordTypeMessage1 = new RecordTypeMessage((String) null, (XBUSSystem) null, (String) null);
      PSVIDocumentImpl pSVIDocumentImpl0 = new PSVIDocumentImpl();
      recordTypeMessage0.setResponseDocument(pSVIDocumentImpl0, (XBUSSystem) null);
      recordTypeMessage1.getRequestTextAsXML((XBUSSystem) null);
      recordTypeMessage0.getResponseObject();
      recordTypeMessage1.getRequestTextAsXML((XBUSSystem) null);
      // Undeclared exception!
      try { 
        recordTypeMessage0.setRequestText(":", (XBUSSystem) null);
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
  /*Coverage entropy=2.3693821196946767
  */
  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage("org.apache.html.dom.HTMLFieldSetElementImpl", (XBUSSystem) null, "org.apache.html.dom.HTMLFieldSetElementImpl");
      recordTypeMessage0.getResponseText();
      recordTypeMessage0.getResponseText();
      recordTypeMessage0.getRequestText((XBUSSystem) null);
      RecordTypeMessage recordTypeMessage1 = new RecordTypeMessage((String) null, (XBUSSystem) null, (String) null);
      recordTypeMessage1.getRequestTextAsXML((XBUSSystem) null);
      recordTypeMessage0.getResponseObject();
      recordTypeMessage1.getRequestTextAsXML((XBUSSystem) null);
      HTMLDocumentImpl hTMLDocumentImpl0 = new HTMLDocumentImpl();
      hTMLDocumentImpl0.getDoctype();
      CoreDocumentImpl coreDocumentImpl0 = new CoreDocumentImpl((DocumentType) null);
      recordTypeMessage1.setResponseDocument(coreDocumentImpl0, (XBUSSystem) null);
      recordTypeMessage1.getResponseText();
      PSVIDocumentImpl pSVIDocumentImpl0 = new PSVIDocumentImpl();
      recordTypeMessage0.setResponseDocument(pSVIDocumentImpl0, (XBUSSystem) null);
      recordTypeMessage1.getRequestTextAsXML((XBUSSystem) null);
      recordTypeMessage0.getResponseObject();
      RecordTypeMessage recordTypeMessage2 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage2.setRequestText((String) null, (XBUSSystem) null);
      recordTypeMessage2.getRequestText((XBUSSystem) null);
      recordTypeMessage0.getRequestObject((XBUSSystem) null);
      recordTypeMessage1.getRequestText((XBUSSystem) null);
      recordTypeMessage1.getRequestText((XBUSSystem) null);
      recordTypeMessage0.getResponseObject();
      Hashtable<Object, Object> hashtable0 = new Hashtable<Object, Object>();
      XBUSSystem xBUSSystem0 = null;
      try {
        xBUSSystem0 = new XBUSSystem((String) null, hashtable0, false);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }
}