/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 17:01:12 GMT 2018
 */

package net.sf.xbus.protocol.records;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Date;
import java.util.Hashtable;
import java.util.function.BiFunction;
import net.sf.xbus.base.bytearraylist.ByteArrayList;
import net.sf.xbus.base.xbussystem.XBUSSystem;
import net.sf.xbus.protocol.records.RecordTypeMessage;
import org.apache.axis.message.Detail;
import org.apache.axis.message.SAX2EventRecorder;
import org.apache.xerces.dom.CoreDocumentImpl;
import org.apache.xerces.dom.DOMInputImpl;
import org.apache.xerces.dom.DocumentImpl;
import org.apache.xerces.dom.PSVIDocumentImpl;
import org.apache.xerces.parsers.DOMASBuilderImpl;
import org.apache.xerces.util.SymbolTable;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import org.w3c.dom.Document;
import org.w3c.dom.ls.LSInput;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RecordTypeMessage_ESTest extends RecordTypeMessage_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      XBUSSystem xBUSSystem0 = null;
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.setResponseObject((Object) null, (XBUSSystem) null);
      String string0 = null;
      recordTypeMessage0.getResponseTimestamp();
      recordTypeMessage0.setResponseTimestamp((Date) null);
      Hashtable<ByteArrayList, Object> hashtable0 = new Hashtable<ByteArrayList, Object>();
      ByteArrayList byteArrayList0 = null;
      recordTypeMessage0.setRequestText((String) null, (XBUSSystem) null);
      Object object0 = new Object();
      hashtable0.remove(object0);
      // Undeclared exception!
      try { 
        hashtable0.put((ByteArrayList) null, recordTypeMessage0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XBUSSystem xBUSSystem0 = null;
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((String) null, (XBUSSystem) null, (String) null);
      Detail detail0 = new Detail();
      Document document0 = detail0.getOwnerDocument();
      detail0.setRecorder((SAX2EventRecorder) null);
      recordTypeMessage0.setResponseDocument(document0, (XBUSSystem) null);
      recordTypeMessage0.getRequestTextAsXML((XBUSSystem) null);
      recordTypeMessage0.synchronizeResponseFields((XBUSSystem) null);
      recordTypeMessage0.setRequestObject((Object) null, (XBUSSystem) null);
      try { 
        recordTypeMessage0.setResponseObject(detail0, (XBUSSystem) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // I_02_003_0 org.apache.axis.message.Detail cannot be cast to net.sf.xbus.base.bytearraylist.ByteArrayList
         //
         verifyException("net.sf.xbus.protocol.records.RecordTypeMessage", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.7478680974667573
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      XBUSSystem xBUSSystem0 = null;
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      DocumentImpl documentImpl0 = new DocumentImpl(true);
      recordTypeMessage0.setResponseDocument(documentImpl0, (XBUSSystem) null);
      recordTypeMessage0.getResponseText();
      recordTypeMessage0.getRequestText((XBUSSystem) null);
      recordTypeMessage0.getRequestText((XBUSSystem) null);
      recordTypeMessage0.getRequestText((XBUSSystem) null);
      Integer integer0 = new Integer(37);
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      recordTypeMessage0.getRequestObject((XBUSSystem) null);
      // Undeclared exception!
      try { 
        hashtable0.putIfAbsent((String) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      DocumentImpl documentImpl0 = new DocumentImpl(true);
      recordTypeMessage0.setResponseDocument(documentImpl0, (XBUSSystem) null);
      recordTypeMessage0.getResponseText();
      recordTypeMessage0.getRequestText((XBUSSystem) null);
      recordTypeMessage0.getRequestText((XBUSSystem) null);
      recordTypeMessage0.getRequestText((XBUSSystem) null);
      RecordTypeMessage recordTypeMessage1 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage1.setResponseText((String) null, (XBUSSystem) null);
      // Undeclared exception!
      try { 
        recordTypeMessage1.setRequestText("fr)nic", (XBUSSystem) null);
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
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      XBUSSystem xBUSSystem0 = null;
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.getResponseText();
      recordTypeMessage0.getRequestText((XBUSSystem) null);
      RecordTypeMessage recordTypeMessage1 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.setRequestObject((Object) null, (XBUSSystem) null);
      recordTypeMessage1.setResponseText((String) null, (XBUSSystem) null);
      // Undeclared exception!
      try { 
        recordTypeMessage1.setRequestText("fr)nic", (XBUSSystem) null);
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
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      XBUSSystem xBUSSystem0 = null;
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.getResponseText();
      recordTypeMessage0.getRequestText((XBUSSystem) null);
      RecordTypeMessage recordTypeMessage1 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.setRequestObject((Object) null, (XBUSSystem) null);
      recordTypeMessage1.setResponseText((String) null, (XBUSSystem) null);
      recordTypeMessage1.getResponseObject();
      // Undeclared exception!
      try { 
        recordTypeMessage0.setResponseText("?", (XBUSSystem) null);
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
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      XBUSSystem xBUSSystem0 = null;
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.getResponseText();
      recordTypeMessage0.getRequestText((XBUSSystem) null);
      RecordTypeMessage recordTypeMessage1 = new RecordTypeMessage((XBUSSystem) null);
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
  //Test case number: 7
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "");
      RecordTypeMessage recordTypeMessage1 = new RecordTypeMessage("", (XBUSSystem) null, "");
      Detail detail0 = new Detail();
      Document document0 = detail0.getOwnerDocument();
      detail0.setRecorder((SAX2EventRecorder) null);
      recordTypeMessage1.setResponseDocument(document0, (XBUSSystem) null);
      recordTypeMessage1.getRequestTextAsXML((XBUSSystem) null);
      recordTypeMessage1.setReturncode("ZPm6*+)rV27%0=,lh>?");
      recordTypeMessage0.getRequestText((XBUSSystem) null);
      recordTypeMessage0.synchronizeResponseFields((XBUSSystem) null);
      recordTypeMessage1.getResponseObject();
      recordTypeMessage1.setRequestObject((Object) null, (XBUSSystem) null);
      recordTypeMessage1.getResponseObject();
      XBUSSystem xBUSSystem0 = null;
      try {
        xBUSSystem0 = new XBUSSystem("0");
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
  /*Coverage entropy=2.458311329683084
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, (byte[]) null);
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.getResponseText();
      recordTypeMessage0.setRequestObject((Object) null, (XBUSSystem) null);
      recordTypeMessage0.setResponseText((String) null, (XBUSSystem) null);
      recordTypeMessage0.setRequestText((String) null, (XBUSSystem) null);
      recordTypeMessage0.getRequestText((XBUSSystem) null);
      recordTypeMessage0.setRequestObject((Object) null, (XBUSSystem) null);
      recordTypeMessage0.getResponseText();
      recordTypeMessage0.getResponseObject();
      System.setCurrentTimeMillis((-4124L));
      ByteArrayList byteArrayList0 = new ByteArrayList();
      recordTypeMessage0.setResponseObject(byteArrayList0, (XBUSSystem) null);
      recordTypeMessage0.getRequestObject((XBUSSystem) null);
      System.setCurrentTimeMillis((-4124L));
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      XBUSSystem xBUSSystem0 = null;
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      DocumentImpl documentImpl0 = new DocumentImpl(true);
      recordTypeMessage0.setResponseDocument(documentImpl0, (XBUSSystem) null);
      recordTypeMessage0.getResponseText();
      recordTypeMessage0.getRequestText((XBUSSystem) null);
      recordTypeMessage0.setRequestObject((Object) null, (XBUSSystem) null);
      RecordTypeMessage recordTypeMessage1 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage1.getResponseText();
      recordTypeMessage1.getResponseObject();
      System.setCurrentTimeMillis(4293L);
      ByteArrayList byteArrayList0 = new ByteArrayList();
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)57;
      byteArray0[1] = (byte)1;
      ByteArrayList byteArrayList1 = ByteArrayList.createByteArrayList(byteArray0, (byte)1);
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
  //Test case number: 10
  /*Coverage entropy=2.2718685126965625
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      XBUSSystem xBUSSystem0 = null;
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      PSVIDocumentImpl pSVIDocumentImpl0 = new PSVIDocumentImpl();
      recordTypeMessage0.setResponseDocument(pSVIDocumentImpl0, (XBUSSystem) null);
      recordTypeMessage0.getResponseText();
      Object object0 = new Object();
      RecordTypeMessage recordTypeMessage1 = new RecordTypeMessage("02", (XBUSSystem) null, "lf<K+rO</sbntH;");
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-52);
      byteArray0[1] = (byte)10;
      byteArray0[2] = (byte)9;
      byteArray0[3] = (byte)48;
      byteArray0[4] = (byte)2;
      ByteArrayList byteArrayList0 = ByteArrayList.createByteArrayList(byteArray0, (byte)10);
      recordTypeMessage1.setRequestObject(byteArrayList0, (XBUSSystem) null);
      // Undeclared exception!
      try { 
        recordTypeMessage1.setResponseText("I", (XBUSSystem) null);
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
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      XBUSSystem xBUSSystem0 = null;
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      byte[] byteArray0 = new byte[21];
      byteArray0[0] = (byte)10;
      byteArray0[1] = (byte)10;
      byteArray0[1] = (byte)10;
      byteArray0[3] = (byte)9;
      ByteArrayList byteArrayList0 = ByteArrayList.createByteArrayList(byteArray0, (byte)10);
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
}