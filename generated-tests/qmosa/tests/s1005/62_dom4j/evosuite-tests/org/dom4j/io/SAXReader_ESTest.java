/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 12:03:13 GMT 2018
 */

package org.dom4j.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PushbackInputStream;
import java.io.Reader;
import java.io.SequenceInputStream;
import java.io.StringReader;
import java.net.URI;
import java.net.URL;
import java.util.Enumeration;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.dom4j.DefaultDocumentFactory;
import org.dom4j.Document;
import org.dom4j.DocumentFactory;
import org.dom4j.ElementHandler;
import org.dom4j.QName;
import org.dom4j.io.DispatchHandler;
import org.dom4j.io.ElementModifier;
import org.dom4j.io.ElementStack;
import org.dom4j.io.PruningDispatchHandler;
import org.dom4j.io.PruningElementStack;
import org.dom4j.io.SAXContentHandler;
import org.dom4j.io.SAXModifyElementHandler;
import org.dom4j.io.SAXReader;
import org.dom4j.tree.NamespaceStack;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.io.MockRandomAccessFile;
import org.evosuite.runtime.mock.java.lang.MockException;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import org.xml.sax.EntityResolver;
import org.xml.sax.HandlerBase;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXParseException;
import org.xml.sax.XMLFilter;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.DefaultHandler2;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.LocatorImpl;
import org.xml.sax.helpers.ParserAdapter;
import org.xml.sax.helpers.XMLFilterImpl;
import org.xml.sax.helpers.XMLReaderAdapter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SAXReader_ESTest extends SAXReader_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DefaultDocumentFactory defaultDocumentFactory0 = new DefaultDocumentFactory();
      SAXReader sAXReader0 = new SAXReader(defaultDocumentFactory0, false);
      defaultDocumentFactory0.createProcessingInstruction("org.dom4j.io.SAXReader", "org.dom4j.io.SAXReader");
      sAXReader0.isIncludeInternalDTDDeclarations();
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl((XMLReader) null);
      DefaultHandler defaultHandler0 = new DefaultHandler();
      sAXReader0.configureReader(xMLFilterImpl0, defaultHandler0);
      defaultDocumentFactory0.createCDATA("Oe7()sb>%V09\"7w//W");
      try { 
        sAXReader0.setFeature(">S", true);
        fail("Expecting exception: SAXNotRecognizedException");
      
      } catch(SAXNotRecognizedException e) {
         //
         // Feature '>S' is not recognized.
         //
         verifyException("org.apache.xerces.parsers.AbstractSAXParser", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = "";
      SAXReader sAXReader0 = null;
      try {
        sAXReader0 = new SAXReader("");
        fail("Expecting exception: SAXException");
      
      } catch(Throwable e) {
         //
         // SAX2 driver class  not found
         //
         verifyException("org.xml.sax.helpers.XMLReaderFactory", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      boolean boolean0 = false;
      SAXReader sAXReader0 = new SAXReader(false);
      sAXReader0.setIncludeInternalDTDDeclarations(true);
      String string0 = "http://xml.org/sax/properties/lexical-handler";
      File file0 = MockFile.createTempFile("WglRd", "http://xml.org/sax/properties/lexical-handler");
      try { 
        sAXReader0.read(file0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error on line -1 of document  : Premature end of file. Nested exception: Premature end of file.
         //
         verifyException("org.dom4j.io.SAXReader", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          boolean boolean0 = false;
          SAXReader sAXReader0 = new SAXReader(false);
          sAXReader0.getDispatchHandler();
          boolean boolean1 = true;
          URL uRL0 = MockURL.getFileExample();
          try { 
            sAXReader0.read(uRL0);
            fail("Expecting exception: Exception");
          
          } catch(Exception e) {
             //
             // Security manager blocks (\"java.lang.RuntimePermission\" \"ftpClientProvider\")
             // java.lang.Thread.getStackTrace(Thread.java:1559)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:434)
             // sun.net.ftp.FtpClientProvider.<init>(FtpClientProvider.java:60)
             // sun.net.ftp.impl.DefaultFtpClientProvider.<init>(DefaultFtpClientProvider.java:31)
             // sun.net.ftp.FtpClientProvider$1.run(FtpClientProvider.java:151)
             // java.security.AccessController.doPrivileged(Native Method)
             // sun.net.ftp.FtpClientProvider.provider(FtpClientProvider.java:141)
             // sun.net.ftp.FtpClient.create(FtpClient.java:108)
             // sun.net.www.protocol.ftp.FtpURLConnection.connect(FtpURLConnection.java:286)
             // sun.net.www.protocol.ftp.FtpURLConnection.getInputStream(FtpURLConnection.java:400)
             // org.apache.xerces.impl.XMLEntityManager.setupCurrentEntity(Unknown Source)
             // org.apache.xerces.impl.XMLVersionDetector.determineDocVersion(Unknown Source)
             // org.apache.xerces.parsers.XML11Configuration.parse(Unknown Source)
             // org.apache.xerces.parsers.XML11Configuration.parse(Unknown Source)
             // org.apache.xerces.parsers.XMLParser.parse(Unknown Source)
             // org.apache.xerces.parsers.AbstractSAXParser.parse(Unknown Source)
             // org.apache.xerces.jaxp.SAXParserImpl$JAXPSAXParser.parse(Unknown Source)
             // org.dom4j.io.SAXReader.read(SAXReader.java:436)
             // org.dom4j.io.SAXReader.read(SAXReader.java:288)
             // sun.reflect.GeneratedMethodAccessor110.invoke(Unknown Source)
             // sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
             // java.lang.reflect.Method.invoke(Method.java:498)
             // org.evosuite.testcase.statements.MethodStatement$1.execute(MethodStatement.java:257)
             // org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:169)
             // org.evosuite.testcase.statements.MethodStatement.execute(MethodStatement.java:220)
             // org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:307)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:213)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:55)
             // java.util.concurrent.FutureTask.run(FutureTask.java:266)
             // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
             // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
             // java.lang.Thread.run(Thread.java:748)
             //  Nested exception: Security manager blocks (\"java.lang.RuntimePermission\" \"ftpClientProvider\")
             // java.lang.Thread.getStackTrace(Thread.java:1559)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:434)
             // sun.net.ftp.FtpClientProvider.<init>(FtpClientProvider.java:60)
             // sun.net.ftp.impl.DefaultFtpClientProvider.<init>(DefaultFtpClientProvider.java:31)
             // sun.net.ftp.FtpClientProvider$1.run(FtpClientProvider.java:151)
             // java.security.AccessController.doPrivileged(Native Method)
             // sun.net.ftp.FtpClientProvider.provider(FtpClientProvider.java:141)
             // sun.net.ftp.FtpClient.create(FtpClient.java:108)
             // sun.net.www.protocol.ftp.FtpURLConnection.connect(FtpURLConnection.java:286)
             // sun.net.www.protocol.ftp.FtpURLConnection.getInputStream(FtpURLConnection.java:400)
             // org.apache.xerces.impl.XMLEntityManager.setupCurrentEntity(Unknown Source)
             // org.apache.xerces.impl.XMLVersionDetector.determineDocVersion(Unknown Source)
             // org.apache.xerces.parsers.XML11Configuration.parse(Unknown Source)
             // org.apache.xerces.parsers.XML11Configuration.parse(Unknown Source)
             // org.apache.xerces.parsers.XMLParser.parse(Unknown Source)
             // org.apache.xerces.parsers.AbstractSAXParser.parse(Unknown Source)
             // org.apache.xerces.jaxp.SAXParserImpl$JAXPSAXParser.parse(Unknown Source)
             // org.dom4j.io.SAXReader.read(SAXReader.java:436)
             // org.dom4j.io.SAXReader.read(SAXReader.java:288)
             // sun.reflect.GeneratedMethodAccessor110.invoke(Unknown Source)
             // sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
             // java.lang.reflect.Method.invoke(Method.java:498)
             // org.evosuite.testcase.statements.MethodStatement$1.execute(MethodStatement.java:257)
             // org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:169)
             // org.evosuite.testcase.statements.MethodStatement.execute(MethodStatement.java:220)
             // org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:307)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:213)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:55)
             // java.util.concurrent.FutureTask.run(FutureTask.java:266)
             // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
             // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
             // java.lang.Thread.run(Thread.java:748)
             //
             verifyException("org.dom4j.io.SAXReader", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.848899705841817
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DocumentFactory documentFactory0 = DefaultDocumentFactory.getInstance();
      SAXReader sAXReader0 = new SAXReader(documentFactory0, true);
      StringReader stringReader0 = new StringReader("");
      char[] charArray0 = new char[3];
      charArray0[0] = 'R';
      charArray0[1] = 'E';
      charArray0[2] = 'M';
      stringReader0.read(charArray0);
      try { 
        sAXReader0.read((Reader) stringReader0, "");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error on line -1 of document  : Premature end of file. Nested exception: Premature end of file.
         //
         verifyException("org.dom4j.io.SAXReader", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SAXReader sAXReader0 = null;
      try {
        sAXReader0 = new SAXReader("s9qs:Y#$pyg.l``&=e", true);
        fail("Expecting exception: SAXException");
      
      } catch(Throwable e) {
         //
         // SAX2 driver class s9qs:Y#$pyg.l``&=e not found
         //
         verifyException("org.xml.sax.helpers.XMLReaderFactory", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.70805020110221
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SAXReader sAXReader0 = new SAXReader();
      XMLReaderAdapter xMLReaderAdapter0 = new XMLReaderAdapter();
      ParserAdapter parserAdapter0 = new ParserAdapter(xMLReaderAdapter0);
      xMLReaderAdapter0.startDocument();
      parserAdapter0.setContentHandler(xMLReaderAdapter0);
      SAXContentHandler sAXContentHandler0 = sAXReader0.createContentHandler(parserAdapter0);
      sAXReader0.configureReader(parserAdapter0, sAXContentHandler0);
      sAXReader0.getXMLReader();
      sAXReader0.setEncoding("B~h9Qk8_;.");
      DispatchHandler dispatchHandler0 = new DispatchHandler();
      dispatchHandler0.removeHandler("VtR7Lq/j@R");
      dispatchHandler0.addHandler("B~h9Qk8_;.", (ElementHandler) null);
      dispatchHandler0.resetHandlers();
      sAXReader0.addHandler("B~h9Qk8_;.", dispatchHandler0);
      sAXReader0.setStringInternEnabled(false);
      sAXReader0.isValidating();
      Object object0 = new Object();
      sAXReader0.createDefaultEntityResolver("B~h9Qk8_;.");
      try { 
        sAXReader0.setProperty("", object0);
        fail("Expecting exception: SAXNotRecognizedException");
      
      } catch(SAXNotRecognizedException e) {
         //
         // Property '' is not recognized.
         //
         verifyException("org.apache.xerces.parsers.AbstractSAXParser", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      HandlerBase handlerBase0 = new HandlerBase();
      xMLFilterImpl0.setDTDHandler(handlerBase0);
      SAXReader sAXReader0 = new SAXReader(xMLFilterImpl0, false);
      sAXReader0.setIgnoreComments(false);
      assertTrue(sAXReader0.isStringInternEnabled());
      assertFalse(sAXReader0.isIncludeExternalDTDDeclarations());
      assertFalse(sAXReader0.isIgnoreComments());
      assertFalse(sAXReader0.isIncludeInternalDTDDeclarations());
      assertFalse(sAXReader0.isStripWhitespaceText());
      assertFalse(sAXReader0.isValidating());
      assertFalse(sAXReader0.isMergeAdjacentText());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DocumentFactory documentFactory0 = DefaultDocumentFactory.getInstance();
      SAXReader sAXReader0 = new SAXReader(documentFactory0);
      sAXReader0.setDocumentFactory(documentFactory0);
      String string0 = "";
      SAXReader.SAXEntityResolver sAXReader_SAXEntityResolver0 = new SAXReader.SAXEntityResolver("");
      sAXReader_SAXEntityResolver0.uriPrefix = "";
      sAXReader_SAXEntityResolver0.resolveEntity("", "/+");
      PruningDispatchHandler pruningDispatchHandler0 = new PruningDispatchHandler();
      pruningDispatchHandler0.resetHandlers();
      sAXReader0.setDefaultHandler(pruningDispatchHandler0);
      sAXReader0.removeHandler("4@+M2J+-u");
      sAXReader0.isIncludeExternalDTDDeclarations();
      ParserAdapter parserAdapter0 = null;
      try {
        parserAdapter0 = new ParserAdapter();
        fail("Expecting exception: SAXException");
      
      } catch(Throwable e) {
         //
         // System property org.xml.sax.parser not specified
         //
         verifyException("org.xml.sax.helpers.ParserAdapter", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.9264175554979963
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SAXReader.SAXEntityResolver sAXReader_SAXEntityResolver0 = new SAXReader.SAXEntityResolver("");
      sAXReader_SAXEntityResolver0.resolveEntity("", "");
      String string0 = "?K%AfGf";
      InputSource inputSource0 = sAXReader_SAXEntityResolver0.resolveEntity("?K%AfGf", "");
      sAXReader_SAXEntityResolver0.resolveEntity("", "");
      inputSource0.getSystemId();
      inputSource0.setEncoding((String) null);
      SAXReader sAXReader0 = new SAXReader(false);
      sAXReader0.isIncludeExternalDTDDeclarations();
      try { 
        sAXReader0.read(inputSource0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error on line 1 of document file:///home/ubuntu/ext1/evosuite_readability_gen/projects/62_dom4j/ : Content is not allowed in prolog. Nested exception: Content is not allowed in prolog.
         //
         verifyException("org.dom4j.io.SAXReader", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SAXReader sAXReader0 = new SAXReader();
      sAXReader0.createXMLReader();
      sAXReader0.getXMLFilter();
      PruningDispatchHandler pruningDispatchHandler0 = new PruningDispatchHandler();
      pruningDispatchHandler0.getHandler("");
      pruningDispatchHandler0.addHandler("", (ElementHandler) null);
      DispatchHandler dispatchHandler0 = new DispatchHandler();
      pruningDispatchHandler0.setDefaultHandler(dispatchHandler0);
      pruningDispatchHandler0.removeHandler((String) null);
      sAXReader0.addHandler("oX$gNbqIw ", (ElementHandler) null);
      sAXReader0.setIncludeInternalDTDDeclarations(true);
      sAXReader0.getDispatchHandler();
      sAXReader0.isStringInternEnabled();
      sAXReader0.getEncoding();
      sAXReader0.setIncludeInternalDTDDeclarations(true);
      sAXReader0.setMergeAdjacentText(false);
      MockFile mockFile0 = new MockFile("");
      try { 
        sAXReader0.read((File) mockFile0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // null Nested exception: null
         //
         verifyException("org.dom4j.io.SAXReader", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=3.1354942159291497
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SAXReader sAXReader0 = new SAXReader();
      DocumentFactory documentFactory0 = DefaultDocumentFactory.getInstance();
      sAXReader0.setEncoding("");
      sAXReader0.setDocumentFactory(documentFactory0);
      sAXReader0.setStringInternEnabled(true);
      XMLReader xMLReader0 = sAXReader0.getXMLReader();
      sAXReader0.setDocumentFactory(documentFactory0);
      DocumentFactory documentFactory1 = sAXReader0.getDocumentFactory();
      sAXReader0.setStripWhitespaceText(true);
      SAXContentHandler sAXContentHandler0 = sAXReader0.createContentHandler(xMLReader0);
      sAXReader0.setErrorHandler(sAXContentHandler0);
      sAXReader0.isIncludeExternalDTDDeclarations();
      sAXReader0.setIncludeInternalDTDDeclarations(true);
      sAXReader0.resetHandlers();
      sAXReader0.setIncludeExternalDTDDeclarations(true);
      sAXReader0.configureReader(xMLReader0, sAXContentHandler0);
      sAXReader0.setMergeAdjacentText(true);
      sAXReader0.setDocumentFactory(documentFactory1);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "";
      ElementModifier elementModifier0 = mock(ElementModifier.class, new ViolatedAssumptionAnswer());
      SAXModifyElementHandler sAXModifyElementHandler0 = new SAXModifyElementHandler(elementModifier0);
      PruningElementStack pruningElementStack0 = new PruningElementStack(stringArray0, sAXModifyElementHandler0);
      pruningElementStack0.getDispatchHandler();
      sAXReader0.addHandler("", (ElementHandler) null);
      sAXReader0.resetHandlers();
      sAXReader0.setEntityResolver(sAXContentHandler0);
      sAXReader0.removeHandler("t!JD\"I~<cp@/SVk");
      try { 
        sAXReader0.setXMLReaderClassName("t!JD\"I~<cp@/SVk");
        fail("Expecting exception: SAXException");
      
      } catch(SAXException e) {
         //
         // SAX2 driver class t!JD\"I~<cp@/SVk not found
         //
         verifyException("org.xml.sax.helpers.XMLReaderFactory", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DocumentFactory documentFactory0 = DefaultDocumentFactory.getInstance();
      SAXReader sAXReader0 = new SAXReader(documentFactory0, false);
      PruningDispatchHandler pruningDispatchHandler0 = new PruningDispatchHandler();
      String string0 = "Fg<XhF [c3@";
      try { 
        sAXReader0.read("Fg<XhF [c3@");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no protocol: Fg<XhF [c3@ Nested exception: no protocol: Fg<XhF [c3@
         //
         verifyException("org.dom4j.io.SAXReader", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DocumentFactory documentFactory0 = DefaultDocumentFactory.getInstance();
      SAXReader sAXReader0 = new SAXReader(documentFactory0);
      boolean boolean0 = true;
      sAXReader0.setValidation(true);
      sAXReader0.setValidation(true);
      String string0 = "";
      StringReader stringReader0 = new StringReader("");
      sAXReader0.setStringInternEnabled(true);
      try { 
        sAXReader0.read((Reader) stringReader0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error on line -1 of document  : Premature end of file. Nested exception: Premature end of file.
         //
         verifyException("org.dom4j.io.SAXReader", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SAXReader.SAXEntityResolver sAXReader_SAXEntityResolver0 = new SAXReader.SAXEntityResolver("e>a=");
      sAXReader_SAXEntityResolver0.uriPrefix = "e>a=";
      sAXReader_SAXEntityResolver0.uriPrefix = "e>a=";
      SAXReader sAXReader0 = new SAXReader(true);
      sAXReader0.setEncoding("//tmp/WglRd0http:/xml.org/sax/properties/lexical-handler");
      sAXReader0.setIncludeExternalDTDDeclarations(true);
      SAXReader.SAXEntityResolver sAXReader_SAXEntityResolver1 = new SAXReader.SAXEntityResolver("http://xml.org/sax/properties/declaration-handler");
      sAXReader_SAXEntityResolver1.resolveEntity("", "//tmp/WglRd0http:/xml.org/sax/properties/lexical-handler");
      PipedOutputStream pipedOutputStream0 = null;
      try {
        pipedOutputStream0 = new PipedOutputStream((PipedInputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.8652352524488442
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DefaultDocumentFactory defaultDocumentFactory0 = new DefaultDocumentFactory();
      SAXReader sAXReader0 = new SAXReader(defaultDocumentFactory0, false);
      defaultDocumentFactory0.createProcessingInstruction("org.dom4j.io.SAXReader", "org.dom4j.io.SAXReader");
      sAXReader0.isIncludeInternalDTDDeclarations();
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl((XMLReader) null);
      DefaultHandler defaultHandler0 = new DefaultHandler();
      sAXReader0.configureReader(xMLFilterImpl0, defaultHandler0);
      sAXReader0.getDocumentFactory();
      sAXReader0.setIncludeInternalDTDDeclarations(false);
      sAXReader0.isMergeAdjacentText();
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(sequenceInputStream0, 31);
      try { 
        sAXReader0.read((InputStream) pushbackInputStream0, "Oe7()sb>%V09\"7w//W");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error on line -1 of document  : Premature end of file. Nested exception: Premature end of file.
         //
         verifyException("org.dom4j.io.SAXReader", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      SAXReader sAXReader0 = new SAXReader((String) null);
      FileSystemHandling.shouldAllThrowIOExceptions();
      DispatchHandler dispatchHandler0 = new DispatchHandler();
      dispatchHandler0.removeHandler((String) null);
      dispatchHandler0.setDefaultHandler((ElementHandler) null);
      sAXReader0.setDispatchHandler(dispatchHandler0);
      sAXReader0.setDispatchHandler(dispatchHandler0);
      sAXReader0.getXMLFilter();
      sAXReader0.installXMLFilter((XMLReader) null);
      sAXReader0.setXMLReader((XMLReader) null);
      SAXReader.SAXEntityResolver sAXReader_SAXEntityResolver0 = new SAXReader.SAXEntityResolver((String) null);
      InputSource inputSource0 = sAXReader_SAXEntityResolver0.resolveEntity((String) null, (String) null);
      assertNotNull(inputSource0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HandlerBase handlerBase0 = new HandlerBase();
      DefaultDocumentFactory defaultDocumentFactory0 = new DefaultDocumentFactory();
      NamespaceStack namespaceStack0 = new NamespaceStack(defaultDocumentFactory0);
      QName qName0 = namespaceStack0.getAttributeQName("GVxXTVaiPuhUROmG/f", "", "");
      defaultDocumentFactory0.createDocument("");
      DocumentFactory documentFactory0 = qName0.getDocumentFactory();
      SAXReader sAXReader0 = new SAXReader(documentFactory0);
      sAXReader0.getErrorHandler();
      sAXReader0.getErrorHandler();
      StringReader stringReader0 = new StringReader("GVxXTVaiPuhUROmG/f");
      try { 
        sAXReader0.read((Reader) stringReader0, "}o.Bza:'I");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error on line 1 of document }o.Bza:'I : Content is not allowed in prolog. Nested exception: Content is not allowed in prolog.
         //
         verifyException("org.dom4j.io.SAXReader", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.9829650292177696
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DocumentFactory documentFactory0 = DefaultDocumentFactory.getInstance();
      SAXReader sAXReader0 = new SAXReader(documentFactory0, true);
      StringReader stringReader0 = new StringReader("");
      char[] charArray0 = new char[3];
      charArray0[0] = 'R';
      sAXReader0.setIncludeExternalDTDDeclarations(true);
      SAXReader.SAXEntityResolver sAXReader_SAXEntityResolver0 = new SAXReader.SAXEntityResolver("");
      sAXReader0.getXMLFilter();
      SAXReader sAXReader1 = new SAXReader((XMLReader) null);
      try { 
        sAXReader0.read("");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error on line 1 of document file:///home/ubuntu/ext1/evosuite_readability_gen/projects/62_dom4j/ : Content is not allowed in prolog. Nested exception: Content is not allowed in prolog.
         //
         verifyException("org.dom4j.io.SAXReader", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SAXReader sAXReader0 = new SAXReader(false);
      sAXReader0.getXMLFilter();
      SAXReader sAXReader1 = new SAXReader((XMLReader) null, false);
      sAXReader1.setXMLFilter((XMLFilter) null);
      PruningDispatchHandler pruningDispatchHandler0 = new PruningDispatchHandler();
      sAXReader0.setDispatchHandler(pruningDispatchHandler0);
      MockFile mockFile0 = null;
      try {
        mockFile0 = new MockFile((URI) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DefaultDocumentFactory defaultDocumentFactory0 = new DefaultDocumentFactory();
      XMLReaderAdapter xMLReaderAdapter0 = new XMLReaderAdapter();
      ParserAdapter parserAdapter0 = new ParserAdapter(xMLReaderAdapter0);
      ParserAdapter parserAdapter1 = new ParserAdapter(xMLReaderAdapter0);
      SAXReader sAXReader0 = new SAXReader(parserAdapter1, false);
      SAXContentHandler sAXContentHandler0 = sAXReader0.createContentHandler(parserAdapter0);
      sAXReader0.configureReader(parserAdapter1, sAXContentHandler0);
      sAXReader0.getEntityResolver();
      BufferedInputStream bufferedInputStream0 = null;
      try {
        bufferedInputStream0 = new BufferedInputStream((InputStream) null, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Buffer size <= 0
         //
         verifyException("java.io.BufferedInputStream", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SAXReader sAXReader0 = new SAXReader((DocumentFactory) null, false);
      StringReader stringReader0 = new StringReader("");
      SAXReader sAXReader1 = new SAXReader((String) null, true);
      DispatchHandler dispatchHandler0 = new DispatchHandler();
      MockURL.getFileExample();
      DefaultDocumentFactory defaultDocumentFactory0 = new DefaultDocumentFactory();
      Document document0 = defaultDocumentFactory0.createDocument("");
      assertNull(document0.getName());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=2.821563807860364
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      XMLFilterImpl xMLFilterImpl1 = new XMLFilterImpl(xMLFilterImpl0);
      XMLReaderAdapter xMLReaderAdapter0 = new XMLReaderAdapter(xMLFilterImpl1);
      ParserAdapter parserAdapter0 = new ParserAdapter(xMLReaderAdapter0);
      SAXReader sAXReader0 = new SAXReader(parserAdapter0, true);
      StringReader stringReader0 = new StringReader("<?");
      try { 
        sAXReader0.read((Reader) stringReader0, "<?");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Validation not supported for XMLReader: org.xml.sax.helpers.ParserAdapter@6c93116e Nested exception: Feature: http://xml.org/sax/features/validation Nested exception: Validation not supported for XMLReader: org.xml.sax.helpers.ParserAdapter@6c93116e Nested exception: Feature: http://xml.org/sax/features/validation
         //
         verifyException("org.dom4j.io.SAXReader", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=2.833213344056216
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      XMLFilterImpl xMLFilterImpl1 = new XMLFilterImpl(xMLFilterImpl0);
      XMLReaderAdapter xMLReaderAdapter0 = new XMLReaderAdapter(xMLFilterImpl1);
      ParserAdapter parserAdapter0 = new ParserAdapter(xMLReaderAdapter0);
      SAXReader sAXReader0 = new SAXReader(parserAdapter0, true);
      sAXReader0.setEntityResolver(xMLFilterImpl1);
      sAXReader0.createContentHandler(xMLFilterImpl0);
      StringReader stringReader0 = new StringReader("<?");
      try { 
        sAXReader0.read((Reader) stringReader0, "<?");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Validation not supported for XMLReader: org.xml.sax.helpers.ParserAdapter@392a6dae Nested exception: Feature: http://xml.org/sax/features/validation Nested exception: Validation not supported for XMLReader: org.xml.sax.helpers.ParserAdapter@392a6dae Nested exception: Feature: http://xml.org/sax/features/validation
         //
         verifyException("org.dom4j.io.SAXReader", e);
      }
  }
}