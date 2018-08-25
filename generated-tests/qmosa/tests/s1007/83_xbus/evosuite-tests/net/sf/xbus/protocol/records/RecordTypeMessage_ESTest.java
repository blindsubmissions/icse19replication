/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 11:44:57 GMT 2018
 */

package net.sf.xbus.protocol.records;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Hashtable;
import net.sf.xbus.base.bytearraylist.ByteArrayList;
import net.sf.xbus.base.xbussystem.XBUSSystem;
import net.sf.xbus.protocol.records.RecordTypeMessage;
import org.apache.wml.dom.WMLDocumentImpl;
import org.apache.xerces.dom.CoreDocumentImpl;
import org.apache.xerces.dom.DeferredDocumentImpl;
import org.apache.xerces.dom.DocumentTypeImpl;
import org.apache.xerces.dom.PSVIDocumentImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;
import org.w3c.dom.DocumentType;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RecordTypeMessage_ESTest extends RecordTypeMessage_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      XBUSSystem xBUSSystem0 = null;
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.setErrortext("V=lgV\"$7k|1b`;'VB#");
      String string0 = "}rNF\"HDyO";
      // Undeclared exception!
      try { 
        recordTypeMessage0.setRequestText("}rNF\"HDyO", (XBUSSystem) null);
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
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.setErrortext("V=lgV\"$7k|1b`;'VB#");
      RecordTypeMessage recordTypeMessage1 = new RecordTypeMessage("org.apache.axis.deployment.wsdd.WSDDException", (XBUSSystem) null, "V=lgV\"$7k|1b`;'VB#");
      try { 
        recordTypeMessage1.setRequestObject("org.apache.axis.deployment.wsdd.WSDDException", (XBUSSystem) null);
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
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.setErrortext((String) null);
      recordTypeMessage0.getRequestObject((XBUSSystem) null);
      recordTypeMessage0.getResponseText();
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XBUSSystem xBUSSystem0 = null;
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.setErrortext((String) null);
      recordTypeMessage0.setRequestText((String) null, (XBUSSystem) null);
      // Undeclared exception!
      try { 
        recordTypeMessage0.setResponseText("V=lgV\"$7k|1b`;'VB#", (XBUSSystem) null);
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
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage("saxToDomFailed00", (XBUSSystem) null, "saxToDomFailed00");
      recordTypeMessage0.getRequestText((XBUSSystem) null);
      try { 
        recordTypeMessage0.setResponseObject("saxToDomFailed00", (XBUSSystem) null);
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
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage("saxToDomFailed00", (XBUSSystem) null, "saxToDomFailed00");
      recordTypeMessage0.getResponseObject();
      try { 
        recordTypeMessage0.setResponseObject("saxToDomFailed00", (XBUSSystem) null);
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
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.getResponseObject();
      recordTypeMessage0.setResponseObject((Object) null, (XBUSSystem) null);
      recordTypeMessage0.getRequestObject((XBUSSystem) null);
      DeferredDocumentImpl deferredDocumentImpl0 = new DeferredDocumentImpl();
      System.setCurrentTimeMillis((-1602L));
      recordTypeMessage0.synchronizeResponseFields((XBUSSystem) null);
      assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      assertEquals(0, recordTypeMessage0.getErrorcode());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.setErrortext("V=lgV\"$7k|1b`;'VB#");
      RecordTypeMessage recordTypeMessage1 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage1.setErrortext("V=lgV\"$7k|1b`;'VB#");
      assertEquals("RecordTypeMessage", recordTypeMessage1.getShortname());
      
      RecordTypeMessage recordTypeMessage2 = new RecordTypeMessage("axis.xml.reuseParsers", (XBUSSystem) null, "umF'm2v'(kO Hs");
      WMLDocumentImpl wMLDocumentImpl0 = new WMLDocumentImpl((DocumentType) null);
      DocumentTypeImpl documentTypeImpl0 = new DocumentTypeImpl(wMLDocumentImpl0, (String) null, "F'?#kB<0k((}Jd", "V=lgV\"$7k|1b`;'VB#");
      CoreDocumentImpl coreDocumentImpl0 = new CoreDocumentImpl(documentTypeImpl0, true);
      recordTypeMessage2.setResponseDocument(coreDocumentImpl0, (XBUSSystem) null);
      recordTypeMessage2.setRequestObject((Object) null, (XBUSSystem) null);
      recordTypeMessage2.getRequestObject((XBUSSystem) null);
      assertEquals("RC_OK", recordTypeMessage2.getReturncode());
      assertEquals("RecordTypeMessage", recordTypeMessage2.getShortname());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage("saxToDomFailed00", (XBUSSystem) null, "saxToDomFailed00");
      ByteArrayList byteArrayList0 = new ByteArrayList();
      recordTypeMessage0.setRequestObject(byteArrayList0, (XBUSSystem) null);
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)31;
      byteArray0[1] = (byte)24;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte) (-72);
      byteArray0[4] = (byte) (-98);
      ByteArrayList byteArrayList0 = ByteArrayList.createByteArrayList(byteArray0, 0);
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
  //Test case number: 10
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage("{9z86w?4`", (XBUSSystem) null, "saxToDomFailed00");
      recordTypeMessage0.getRequestObject((XBUSSystem) null);
      String string0 = null;
      recordTypeMessage0.setResponseText((String) null, (XBUSSystem) null);
      recordTypeMessage0.getResponseObject();
      Hashtable<Object, Object> hashtable0 = new Hashtable<Object, Object>();
      XBUSSystem xBUSSystem0 = null;
      try {
        xBUSSystem0 = new XBUSSystem("PRE", hashtable0, false);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.0982737395252498
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.setResponseObject((Object) null, (XBUSSystem) null);
      recordTypeMessage0.getRequestObject((XBUSSystem) null);
      ByteArrayList byteArrayList0 = new ByteArrayList();
      recordTypeMessage0.setResponseObject(byteArrayList0, (XBUSSystem) null);
      // Undeclared exception!
      try { 
        recordTypeMessage0.setResponseText("C_SQ*mdOO", (XBUSSystem) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sf.xbus.protocol.xml.XMLMessageAbstract", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.6674619334292946
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage("saxToDomFailed00", (XBUSSystem) null, "saxToDomFailed00");
      recordTypeMessage0.synchronizeResponseFields((XBUSSystem) null);
      ByteArrayList byteArrayList0 = new ByteArrayList();
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-100);
      byteArray0[1] = (byte)10;
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
  //Test case number: 13
  /*Coverage entropy=1.9061547465398496
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      XBUSSystem xBUSSystem0 = null;
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.setErrortext((String) null);
      PSVIDocumentImpl pSVIDocumentImpl0 = new PSVIDocumentImpl();
      recordTypeMessage0.setResponseDocument(pSVIDocumentImpl0, (XBUSSystem) null);
      recordTypeMessage0.setErrortext("V=lgV\"$7k|1b`;'VB#");
      recordTypeMessage0.getRequestTextAsXML((XBUSSystem) null);
      recordTypeMessage0.getResponseObject();
      recordTypeMessage0.setRequestObject((Object) null, (XBUSSystem) null);
      recordTypeMessage0.getResponseObject();
      System.setCurrentTimeMillis((-1L));
      try { 
        recordTypeMessage0.setRequestObject("org.apache.axis.deployment.wsdd.WSDDException", (XBUSSystem) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // I_02_003_0 java.lang.String cannot be cast to net.sf.xbus.base.bytearraylist.ByteArrayList
         //
         verifyException("net.sf.xbus.protocol.records.RecordTypeMessage", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.setErrortext((String) null);
      PSVIDocumentImpl pSVIDocumentImpl0 = new PSVIDocumentImpl();
      recordTypeMessage0.setResponseDocument(pSVIDocumentImpl0, (XBUSSystem) null);
      recordTypeMessage0.getResponseText();
      recordTypeMessage0.getRequestText((XBUSSystem) null);
      recordTypeMessage0.getRequestText((XBUSSystem) null);
      recordTypeMessage0.getResponseObject();
      RecordTypeMessage recordTypeMessage1 = new RecordTypeMessage("<kdk", (XBUSSystem) null, "<kdk");
      recordTypeMessage1.getRequestObject((XBUSSystem) null);
      recordTypeMessage1.getRequestText((XBUSSystem) null);
      recordTypeMessage0.getResponseText();
      recordTypeMessage0.getRequestText((XBUSSystem) null);
      recordTypeMessage0.getResponseText();
      RecordTypeMessage recordTypeMessage2 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage2.getRequestTextAsXML((XBUSSystem) null);
      recordTypeMessage1.getRequestObject((XBUSSystem) null);
      RecordTypeMessage recordTypeMessage3 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage3.getRequestObject((XBUSSystem) null);
      System.setCurrentTimeMillis(0L);
  }
}