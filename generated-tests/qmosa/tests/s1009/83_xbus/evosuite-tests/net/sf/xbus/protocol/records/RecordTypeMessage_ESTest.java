/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 12:06:27 GMT 2018
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
import org.apache.xerces.dom.CoreDocumentImpl;
import org.apache.xerces.dom.PSVIDocumentImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RecordTypeMessage_ESTest extends RecordTypeMessage_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = "org.apache.wml.dom.WMLAccessElementImpl";
      XBUSSystem xBUSSystem0 = null;
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage("org.apache.wml.dom.WMLAccessElementImpl", (XBUSSystem) null, "org.apache.wml.dom.WMLAccessElementImpl");
      recordTypeMessage0.setShortname("02");
      // Undeclared exception!
      try { 
        recordTypeMessage0.setResponseText("net.sf.xbus.protocol.records.RecordTypeMessage", (XBUSSystem) null);
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
  public void test01()  throws Throwable  {
      XBUSSystem xBUSSystem0 = null;
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.synchronizeResponseFields((XBUSSystem) null);
      recordTypeMessage0.setReturncode("");
      recordTypeMessage0.setErrortext("RC_OK");
      recordTypeMessage0.getResponseText();
      recordTypeMessage0.getRequestTextAsXML((XBUSSystem) null);
      // Undeclared exception!
      try { 
        recordTypeMessage0.setRequestText("RC_OK", (XBUSSystem) null);
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
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.getRequestText((XBUSSystem) null);
      recordTypeMessage0.getResponseObject();
      recordTypeMessage0.setRequestObject((Object) null, (XBUSSystem) null);
      recordTypeMessage0.getResponseObject();
      recordTypeMessage0.getRequestText((XBUSSystem) null);
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.getResponseObject();
      RecordTypeMessage recordTypeMessage1 = new RecordTypeMessage((String) null, (XBUSSystem) null, (String) null);
      recordTypeMessage1.getResponseObject();
      recordTypeMessage1.setRequestText((String) null, (XBUSSystem) null);
      assertEquals("RecordTypeMessage", recordTypeMessage1.getShortname());
      
      RecordTypeMessage recordTypeMessage2 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage2.synchronizeResponseFields((XBUSSystem) null);
      recordTypeMessage2.getRequestTextAsXML((XBUSSystem) null);
      assertEquals("RC_OK", recordTypeMessage2.getReturncode());
      assertEquals("RecordTypeMessage", recordTypeMessage2.getShortname());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.getResponseText();
      recordTypeMessage0.getResponseObject();
      recordTypeMessage0.setResponseObject((Object) null, (XBUSSystem) null);
      recordTypeMessage0.setResponseText((String) null, (XBUSSystem) null);
      assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      assertEquals(0, recordTypeMessage0.getErrorcode());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.synchronizeResponseFields((XBUSSystem) null);
      recordTypeMessage0.getRequestText((XBUSSystem) null);
      Integer integer0 = new Integer((-957));
      try { 
        recordTypeMessage0.setResponseObject(integer0, (XBUSSystem) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // I_02_003_0 java.lang.Integer cannot be cast to net.sf.xbus.base.bytearraylist.ByteArrayList
         //
         verifyException("net.sf.xbus.protocol.records.RecordTypeMessage", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      recordTypeMessage0.getRequestObject((XBUSSystem) null);
      recordTypeMessage0.getRequestText((XBUSSystem) null);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "");
      recordTypeMessage0.getResponseObject();
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)5;
      byteArray0[1] = (byte) (-1);
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)83;
      byteArray0[4] = (byte)104;
      byteArray0[5] = (byte) (-96);
      byteArray0[6] = (byte) (-126);
      byteArray0[7] = (byte)0;
      ByteArrayList byteArrayList0 = ByteArrayList.createByteArrayList(byteArray0, (byte) (-126));
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
  //Test case number: 7
  /*Coverage entropy=1.7478680974667573
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage("", (XBUSSystem) null, "");
      recordTypeMessage0.getResponseText();
      recordTypeMessage0.getResponseObject();
      ByteArrayList byteArrayList0 = new ByteArrayList();
      recordTypeMessage0.setRequestObject(byteArrayList0, (XBUSSystem) null);
      Integer integer0 = new Integer(2119);
      try { 
        recordTypeMessage0.setResponseObject(integer0, (XBUSSystem) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // I_02_003_0 java.lang.Integer cannot be cast to net.sf.xbus.base.bytearraylist.ByteArrayList
         //
         verifyException("net.sf.xbus.protocol.records.RecordTypeMessage", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.7478680974667573
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.getRequestObject((XBUSSystem) null);
      recordTypeMessage0.getRequestText((XBUSSystem) null);
      recordTypeMessage0.setReturncode((String) null);
      recordTypeMessage0.getResponseText();
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)104;
      byteArray0[1] = (byte) (-126);
      byteArray0[2] = (byte) (-126);
      byteArray0[3] = (byte) (-96);
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte)83;
      RecordTypeMessage recordTypeMessage1 = new RecordTypeMessage((XBUSSystem) null);
      ByteArrayList byteArrayList0 = new ByteArrayList();
      recordTypeMessage1.setResponseObject(byteArrayList0, (XBUSSystem) null);
      assertEquals("RC_OK", recordTypeMessage1.getReturncode());
      assertEquals(0, recordTypeMessage1.getErrorcode());
      assertEquals("RecordTypeMessage", recordTypeMessage1.getShortname());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.9061547465398496
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      XBUSSystem xBUSSystem0 = null;
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      recordTypeMessage0.getRequestObject((XBUSSystem) null);
      recordTypeMessage0.getRequestText((XBUSSystem) null);
      recordTypeMessage0.getRequestObject((XBUSSystem) null);
      recordTypeMessage0.getRequestText((XBUSSystem) null);
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      recordTypeMessage0.setReturncode((String) null);
      recordTypeMessage0.getResponseText();
      String string0 = "dK";
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-97);
      ByteArrayList byteArrayList0 = ByteArrayList.createByteArrayList(byteArray0, (byte) (-97));
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
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      PSVIDocumentImpl pSVIDocumentImpl0 = new PSVIDocumentImpl();
      recordTypeMessage0.setResponseDocument(pSVIDocumentImpl0, (XBUSSystem) null);
      recordTypeMessage0.getResponseObject();
      recordTypeMessage0.getResponseText();
      assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
  }
}
