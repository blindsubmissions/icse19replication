/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 10:39:29 GMT 2018
 */

package net.sf.xbus.protocol.records;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import net.sf.xbus.base.bytearraylist.ByteArrayList;
import net.sf.xbus.base.xbussystem.XBUSSystem;
import net.sf.xbus.protocol.records.RecordTypeMessage;
import org.apache.axis.Message;
import org.apache.axis.SOAPPart;
import org.apache.axis.message.MimeHeaders;
import org.apache.xerces.dom.DocumentImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RecordTypeMessage_ESTest extends RecordTypeMessage_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.setShortname((String) null);
      recordTypeMessage0.setRequestObject((Object) null, (XBUSSystem) null);
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
  //Test case number: 1
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XBUSSystem xBUSSystem0 = null;
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage("dbvxJ", (XBUSSystem) null, "LG#!FT");
      ByteArrayList byteArrayList0 = new ByteArrayList();
      byteArrayList0.toByteArray();
      recordTypeMessage0.setResponseObject(byteArrayList0, (XBUSSystem) null);
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
  //Test case number: 2
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      XBUSSystem xBUSSystem0 = null;
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      MockDate mockDate0 = new MockDate(346L);
      recordTypeMessage0.getResponseText();
      RecordTypeMessage recordTypeMessage1 = new RecordTypeMessage((String) null, (XBUSSystem) null, "W|dga.;=4,x0Wj2R%m$");
      recordTypeMessage1.setShortname("");
      try { 
        recordTypeMessage1.setRequestObject("", (XBUSSystem) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // I_02_003_0 java.lang.String cannot be cast to net.sf.xbus.base.bytearraylist.ByteArrayList
         //
         verifyException("net.sf.xbus.protocol.records.RecordTypeMessage", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.7478680974667573
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XBUSSystem xBUSSystem0 = null;
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.setShortname((String) null);
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-46);
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)68;
      byteArray0[3] = (byte) (-108);
      byteArray0[4] = (byte) (-1);
      byteArray0[5] = (byte)125;
      byteArray0[6] = (byte) (-30);
      byteArray0[7] = (byte)0;
      ByteArrayList byteArrayList0 = ByteArrayList.createByteArrayList(byteArray0, (byte)125);
      ByteArrayList.createByteArrayList(byteArray0, (byte) (-46));
      recordTypeMessage0.setRequestObject(byteArrayList0, (XBUSSystem) null);
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
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage("_J>?h?", (XBUSSystem) null, "_J>?h?");
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      recordTypeMessage0.getResponseText();
      DocumentImpl documentImpl0 = new DocumentImpl(false);
      recordTypeMessage0.synchronizeResponseFields((XBUSSystem) null);
      recordTypeMessage0.getRequestText((XBUSSystem) null);
      recordTypeMessage0.getResponseObject();
      recordTypeMessage0.getRequestText((XBUSSystem) null);
      assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      MockDate mockDate0 = new MockDate(346L);
      recordTypeMessage0.getResponseText();
      MockDate.UTC(1, (-1), 0, 1649, (-1), 1);
      recordTypeMessage0.getRequestText((XBUSSystem) null);
      RecordTypeMessage recordTypeMessage1 = new RecordTypeMessage("Host must be set to create a host URL", (XBUSSystem) null, "W|dga.;=4,x0Wj2R%m$");
      recordTypeMessage1.getResponseText();
      recordTypeMessage1.getRequestTextAsXML((XBUSSystem) null);
      recordTypeMessage1.getRequestTextAsXML((XBUSSystem) null);
      System.setCurrentTimeMillis((-2174281259000L));
      // Undeclared exception!
      try { 
        recordTypeMessage1.setResponseText("RecordTypeMessage", (XBUSSystem) null);
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
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      
      recordTypeMessage0.setShortname((String) null);
      recordTypeMessage0.setResponseObject((Object) null, (XBUSSystem) null);
      recordTypeMessage0.synchronizeResponseFields((XBUSSystem) null);
      recordTypeMessage0.getRequestText((XBUSSystem) null);
      recordTypeMessage0.getResponseObject();
      recordTypeMessage0.getRequestText((XBUSSystem) null);
      assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      assertEquals(0, recordTypeMessage0.getErrorcode());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.setShortname((String) null);
      recordTypeMessage0.setRequestText((String) null, (XBUSSystem) null);
      Object object0 = new Object();
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      XBUSSystem xBUSSystem0 = null;
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.getResponseText();
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte) (-30);
      byteArray0[1] = (byte) (-30);
      byteArray0[2] = (byte) (-30);
      byteArray0[3] = (byte) (-30);
      byteArray0[4] = (byte) (-30);
      byteArray0[5] = (byte) (-30);
      byteArray0[6] = (byte) (-30);
      ByteArrayList.createByteArrayList(byteArray0, 200);
      ByteArrayList.createByteArrayList(byteArray0, (byte) (-30));
      ByteArrayList byteArrayList0 = ByteArrayList.createByteArrayList(byteArray0, (-1));
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
  //Test case number: 9
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      MockDate mockDate0 = new MockDate(346L);
      recordTypeMessage0.getResponseText();
      mockDate0.clone();
      MockDate.UTC(1, (-1), 0, 1649, 0, 1);
      MockDate.UTC((-1), 0, 0, (-1), 1, 175);
      recordTypeMessage0.setResponseTimestamp(mockDate0);
      recordTypeMessage0.setErrortext("W|dga.;=4,x0Wj2R%m$");
      recordTypeMessage0.getRequestObject((XBUSSystem) null);
      recordTypeMessage0.synchronizeResponseFields((XBUSSystem) null);
      recordTypeMessage0.setResponseText((String) null, (XBUSSystem) null);
      assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      assertEquals(0, recordTypeMessage0.getErrorcode());
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.2718685126965625
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      RecordTypeMessage recordTypeMessage1 = new RecordTypeMessage((String) null, (XBUSSystem) null, "attachment");
      recordTypeMessage0.getResponseText();
      recordTypeMessage0.setReturncode("attachment");
      RecordTypeMessage recordTypeMessage2 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.synchronizeRequestFields((XBUSSystem) null);
      recordTypeMessage0.getRequestObject((XBUSSystem) null);
      recordTypeMessage1.getRequestText((XBUSSystem) null);
      RecordTypeMessage recordTypeMessage3 = new RecordTypeMessage("[j@ %PD%><Eur=$,\"", (XBUSSystem) null, (String) null);
      RecordTypeMessage recordTypeMessage4 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage4.getRequestObject((XBUSSystem) null);
      recordTypeMessage2.getResponseObject();
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)2;
      byteArray0[1] = (byte)83;
      byteArray0[2] = (byte)116;
      byteArray0[3] = (byte) (-127);
      ByteArrayList byteArrayList0 = ByteArrayList.createByteArrayList(byteArray0, (byte)2);
      // Undeclared exception!
      try { 
        recordTypeMessage3.setResponseObject(byteArrayList0, (XBUSSystem) null);
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
  /*Coverage entropy=1.7478680974667573
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage("bv7fxJ", (XBUSSystem) null, "bv7fxJ");
      MimeHeaders mimeHeaders0 = new MimeHeaders();
      Message message0 = new Message((Object) null, true, mimeHeaders0);
      Integer integer0 = new Integer(6);
      SOAPPart sOAPPart0 = new SOAPPart(message0, integer0, true);
      recordTypeMessage0.setResponseDocument(sOAPPart0, (XBUSSystem) null);
      recordTypeMessage0.getRequestObject((XBUSSystem) null);
      recordTypeMessage0.getResponseText();
      recordTypeMessage0.getResponseText();
      recordTypeMessage0.getResponseObject();
      assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
  }
}
