/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 11:27:06 GMT 2018
 */

package org.dom4j.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PushbackInputStream;
import java.io.Reader;
import java.io.SequenceInputStream;
import java.io.StringReader;
import java.net.URL;
import java.util.Enumeration;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.dom4j.DefaultDocumentFactory;
import org.dom4j.DocumentFactory;
import org.dom4j.Element;
import org.dom4j.ElementHandler;
import org.dom4j.Namespace;
import org.dom4j.QName;
import org.dom4j.bean.BeanAttribute;
import org.dom4j.bean.BeanAttributeList;
import org.dom4j.bean.BeanElement;
import org.dom4j.io.DispatchHandler;
import org.dom4j.io.ElementStack;
import org.dom4j.io.PruningDispatchHandler;
import org.dom4j.io.PruningElementStack;
import org.dom4j.io.SAXContentHandler;
import org.dom4j.io.SAXReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.lang.MockException;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import org.xml.sax.DTDHandler;
import org.xml.sax.EntityResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.HandlerBase;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXParseException;
import org.xml.sax.XMLFilter;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.DefaultHandler2;
import org.xml.sax.ext.Locator2Impl;
import org.xml.sax.helpers.ParserAdapter;
import org.xml.sax.helpers.XMLFilterImpl;
import org.xml.sax.helpers.XMLReaderAdapter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SAXReader_ESTest extends SAXReader_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      SAXReader sAXReader0 = new SAXReader(xMLFilterImpl0);
      boolean boolean0 = false;
      sAXReader0.setIncludeExternalDTDDeclarations(false);
      xMLFilterImpl0.startDocument();
      XMLFilterImpl xMLFilterImpl1 = new XMLFilterImpl();
      xMLFilterImpl1.ignorableWhitespace((char[]) null, (-3771), (-3771));
      xMLFilterImpl1.skippedEntity("");
      try { 
        sAXReader0.setProperty("", xMLFilterImpl1);
        fail("Expecting exception: SAXNotRecognizedException");
      
      } catch(SAXNotRecognizedException e) {
         //
         // Property: 
         //
         verifyException("org.xml.sax.helpers.XMLFilterImpl", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Namespace namespace0 = Namespace.XML_NAMESPACE;
      QName qName0 = new QName("", namespace0, "");
      qName0.getDocumentFactory();
      SAXReader sAXReader0 = new SAXReader((DocumentFactory) null, true);
      sAXReader0.setDocumentFactory((DocumentFactory) null);
      boolean boolean0 = sAXReader0.isIncludeExternalDTDDeclarations();
      assertFalse(boolean0);
      
      sAXReader0.setIgnoreComments(false);
      assertTrue(sAXReader0.isValidating());
      assertTrue(sAXReader0.isStringInternEnabled());
      assertFalse(sAXReader0.isIgnoreComments());
      assertFalse(sAXReader0.isMergeAdjacentText());
      assertFalse(sAXReader0.isStripWhitespaceText());
      assertFalse(sAXReader0.isIncludeInternalDTDDeclarations());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SAXReader sAXReader0 = new SAXReader(true);
      sAXReader0.createXMLReader();
      boolean boolean0 = true;
      sAXReader0.setIgnoreComments(true);
      sAXReader0.setStringInternEnabled(true);
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
  //Test case number: 3
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SAXReader sAXReader0 = new SAXReader();
      sAXReader0.setEncoding("]8T{=b*zMCh");
      sAXReader0.getXMLReader();
      sAXReader0.getErrorHandler();
      boolean boolean0 = false;
      sAXReader0.setIncludeInternalDTDDeclarations(false);
      String string0 = "";
      try { 
        sAXReader0.setProperty("", "");
        fail("Expecting exception: SAXNotRecognizedException");
      
      } catch(SAXNotRecognizedException e) {
         //
         // Property '' is not recognized.
         //
         verifyException("org.apache.xerces.parsers.AbstractSAXParser", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      boolean boolean0 = true;
      SAXReader sAXReader0 = new SAXReader(true);
      StringReader stringReader0 = new StringReader("Exception cannot be its own cause");
      stringReader0.skip((-1L));
      stringReader0.skip((-843L));
      stringReader0.markSupported();
      try { 
        sAXReader0.read((Reader) stringReader0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error on line 1 of document  : Content is not allowed in prolog. Nested exception: Content is not allowed in prolog.
         //
         verifyException("org.dom4j.io.SAXReader", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DocumentFactory documentFactory0 = DefaultDocumentFactory.getInstance();
      SAXReader sAXReader0 = new SAXReader(documentFactory0);
      sAXReader0.setStripWhitespaceText(true);
      sAXReader0.setDispatchHandler((DispatchHandler) null);
      sAXReader0.isMergeAdjacentText();
      SAXReader.SAXEntityResolver sAXReader_SAXEntityResolver0 = new SAXReader.SAXEntityResolver("(eoGcw@Ph?u9");
      InputSource inputSource0 = sAXReader_SAXEntityResolver0.resolveEntity("(eoGcw@Ph?u9", "ldd1MQNVJAr9");
      assertNotNull(inputSource0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SAXReader sAXReader0 = new SAXReader(true);
      sAXReader0.getXMLFilter();
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl((XMLReader) null);
      char[] charArray0 = new char[5];
      charArray0[0] = '/';
      charArray0[1] = '3';
      charArray0[2] = '+';
      charArray0[3] = 'T';
      charArray0[4] = 'd';
      xMLFilterImpl0.characters(charArray0, 0, 0);
      sAXReader0.setXMLFilter(xMLFilterImpl0);
      sAXReader0.getEncoding();
      sAXReader0.setStringInternEnabled(true);
      assertFalse(sAXReader0.isIncludeExternalDTDDeclarations());
      
      sAXReader0.setIncludeExternalDTDDeclarations(true);
      boolean boolean0 = sAXReader0.isIncludeExternalDTDDeclarations();
      assertTrue(boolean0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.848899705841817
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DocumentFactory documentFactory0 = DefaultDocumentFactory.getInstance();
      SAXReader sAXReader0 = new SAXReader(documentFactory0);
      sAXReader0.isValidating();
      boolean boolean0 = true;
      File file0 = MockFile.createTempFile("yn#M.G'W2VH=L", "yn#M.G'W2VH=L");
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
  //Test case number: 8
  /*Coverage entropy=3.1354942159291497
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SAXReader sAXReader0 = new SAXReader();
      sAXReader0.getEntityResolver();
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl((XMLReader) null);
      sAXReader0.setXMLFilter(xMLFilterImpl0);
      DefaultDocumentFactory defaultDocumentFactory0 = new DefaultDocumentFactory();
      sAXReader0.setDocumentFactory(defaultDocumentFactory0);
      sAXReader0.setValidation(false);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(pipedInputStream0, 621);
      try { 
        sAXReader0.read((InputStream) pushbackInputStream0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Pipe not connected Nested exception: Pipe not connected
         //
         verifyException("org.dom4j.io.SAXReader", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.022808529414704
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BeanElement beanElement0 = new BeanElement(" r4M", " r4M");
      BeanAttributeList beanAttributeList0 = new BeanAttributeList(beanElement0);
      QName qName0 = beanAttributeList0.getQName(0);
      Element element0 = beanElement0.createCopy("F3ks514_Bwtn>b");
      beanElement0.getPath(element0);
      DocumentFactory documentFactory0 = qName0.getDocumentFactory();
      SAXReader sAXReader0 = new SAXReader(documentFactory0, true);
      assertFalse(sAXReader0.isIncludeInternalDTDDeclarations());
      
      sAXReader0.setIncludeInternalDTDDeclarations(true);
      sAXReader0.getXMLFilter();
      sAXReader0.setXMLReader((XMLReader) null);
      sAXReader0.isIgnoreComments();
      SAXReader.SAXEntityResolver sAXReader_SAXEntityResolver0 = new SAXReader.SAXEntityResolver("/ r4M");
      BeanAttribute beanAttribute0 = new BeanAttribute(beanAttributeList0, 0);
      Namespace namespace0 = beanAttribute0.getNamespace();
      QName.get("F3ks514_Bwtn>b", namespace0);
      sAXReader_SAXEntityResolver0.resolveEntity("p1g", "+3t6d");
      sAXReader0.getEntityResolver();
      boolean boolean0 = sAXReader0.isMergeAdjacentText();
      assertTrue(sAXReader0.isIncludeInternalDTDDeclarations());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SAXReader sAXReader0 = new SAXReader(false);
      sAXReader0.getXMLFilter();
      try { 
        sAXReader0.setFeature("]", false);
        fail("Expecting exception: SAXNotRecognizedException");
      
      } catch(SAXNotRecognizedException e) {
         //
         // Feature ']' is not recognized.
         //
         verifyException("org.apache.xerces.parsers.AbstractSAXParser", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SAXReader.SAXEntityResolver sAXReader_SAXEntityResolver0 = new SAXReader.SAXEntityResolver("");
      sAXReader_SAXEntityResolver0.resolveEntity("", "");
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
  //Test case number: 12
  /*Coverage entropy=2.8875778250565496
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      boolean boolean0 = true;
      SAXReader sAXReader0 = new SAXReader((DocumentFactory) null, true);
      StringReader stringReader0 = new StringReader("/K#");
      stringReader0.skip((-2111L));
      try { 
        sAXReader0.read((Reader) stringReader0, "/K#");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error on line 1 of document file:///K# : Content is not allowed in prolog. Nested exception: Content is not allowed in prolog.
         //
         verifyException("org.dom4j.io.SAXReader", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.945934775756114
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DefaultDocumentFactory defaultDocumentFactory0 = new DefaultDocumentFactory();
      SAXReader sAXReader0 = new SAXReader(defaultDocumentFactory0, false);
      sAXReader0.getXMLFilter();
      SAXReader sAXReader1 = new SAXReader((XMLReader) null, false);
      sAXReader1.isIncludeInternalDTDDeclarations();
      sAXReader1.getXMLFilter();
      sAXReader0.setXMLReader((XMLReader) null);
      sAXReader0.removeHandler(">/^ Oe6Se{{vW?");
      SAXReader.SAXEntityResolver sAXReader_SAXEntityResolver0 = new SAXReader.SAXEntityResolver("0d3Un8eu");
      InputSource inputSource0 = sAXReader_SAXEntityResolver0.resolveEntity((String) null, "");
      InputSource inputSource1 = sAXReader_SAXEntityResolver0.resolveEntity("org.dom4j.io.SAXReader", "9");
      assertNotSame(inputSource1, inputSource0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.833213344056216
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SAXReader sAXReader0 = new SAXReader(true);
      sAXReader0.resetHandlers();
      DispatchHandler dispatchHandler0 = sAXReader0.getDispatchHandler();
      dispatchHandler0.resetHandlers();
      dispatchHandler0.getHandler((String) null);
      dispatchHandler0.setDefaultHandler((ElementHandler) null);
      sAXReader0.setDefaultHandler(dispatchHandler0);
      HandlerBase handlerBase0 = new HandlerBase();
      sAXReader0.setIncludeInternalDTDDeclarations(true);
      handlerBase0.resolveEntity((String) null, (String) null);
      handlerBase0.startDocument();
      handlerBase0.endElement("");
      sAXReader0.setErrorHandler(handlerBase0);
      sAXReader0.setIncludeExternalDTDDeclarations(false);
      sAXReader0.getXMLFilter();
      sAXReader0.isIgnoreComments();
      sAXReader0.isStringInternEnabled();
      EntityResolver entityResolver0 = sAXReader0.createDefaultEntityResolver("JFc\"7S[X)'k");
      sAXReader0.createDefaultEntityResolver("");
      sAXReader0.resetHandlers();
      sAXReader0.addHandler("JFc\"7S[X)'k", (ElementHandler) null);
      sAXReader0.setIncludeExternalDTDDeclarations(true);
      sAXReader0.addHandler("JFc\"7S[X)'k", (ElementHandler) null);
      try { 
        sAXReader0.setProperty("org.dom4j.tree.AbstractAttribute", entityResolver0);
        fail("Expecting exception: SAXNotRecognizedException");
      
      } catch(SAXNotRecognizedException e) {
         //
         // Property 'org.dom4j.tree.AbstractAttribute' is not recognized.
         //
         verifyException("org.apache.xerces.parsers.AbstractSAXParser", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SAXReader sAXReader0 = new SAXReader(false);
      sAXReader0.setValidation(false);
      sAXReader0.setEntityResolver((EntityResolver) null);
      String string0 = "";
      DispatchHandler dispatchHandler0 = new DispatchHandler();
      DispatchHandler dispatchHandler1 = sAXReader0.getDispatchHandler();
      dispatchHandler0.setDefaultHandler(dispatchHandler1);
      sAXReader0.addHandler("", dispatchHandler0);
      try { 
        sAXReader0.setXMLReaderClassName("");
        fail("Expecting exception: SAXException");
      
      } catch(SAXException e) {
         //
         // SAX2 driver class  not found
         //
         verifyException("org.xml.sax.helpers.XMLReaderFactory", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.9252027641711082
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SAXReader.SAXEntityResolver sAXReader_SAXEntityResolver0 = new SAXReader.SAXEntityResolver("");
      sAXReader_SAXEntityResolver0.resolveEntity("", "");
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      SAXReader sAXReader0 = new SAXReader(xMLFilterImpl0, false);
      sAXReader0.setIgnoreComments(false);
      StringReader stringReader0 = new StringReader("");
      try { 
        sAXReader0.read((Reader) stringReader0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // No parent for filter Nested exception: No parent for filter
         //
         verifyException("org.dom4j.io.SAXReader", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.7478680974667573
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = null;
      SAXReader sAXReader0 = new SAXReader((String) null);
      sAXReader0.getXMLFilter();
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl((XMLReader) null);
      SAXReader sAXReader1 = new SAXReader(xMLFilterImpl0, true);
      DefaultHandler2 defaultHandler2_0 = new DefaultHandler2();
      String string1 = "//tmp/yn#M.G'W2VH=L0yn#M.G'W2VH=L";
      FileSystemHandling.shouldAllThrowIOExceptions();
      String string2 = "";
      defaultHandler2_0.resolveEntity("//tmp/yn#M.G'W2VH=L0yn#M.G'W2VH=L", "#K", "", "");
      try { 
        sAXReader1.read((InputSource) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // null Nested exception: null
         //
         verifyException("org.dom4j.io.SAXReader", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SAXReader sAXReader0 = new SAXReader((String) null, false);
      try { 
        sAXReader0.read("<?");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no protocol: <? Nested exception: no protocol: <?
         //
         verifyException("org.dom4j.io.SAXReader", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.87821830667085
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Namespace namespace0 = new Namespace(":U{e", "");
      QName qName0 = QName.get("", namespace0);
      String string0 = "RN1\",3";
      Locator2Impl locator2Impl0 = new Locator2Impl();
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)92;
      byteArray0[1] = (byte)1;
      byteArray0[2] = (byte)79;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      MockException mockException0 = new MockException();
      SAXParseException sAXParseException0 = new SAXParseException("RN1\",3", locator2Impl0, mockException0);
      qName0.equals(sAXParseException0);
      qName0.getDocumentFactory();
      SAXReader sAXReader0 = new SAXReader((DocumentFactory) null);
      namespace0.hasContent();
      InputStream inputStream0 = null;
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) null);
      try { 
        sAXReader0.read((InputStream) bufferedInputStream0, "jS0");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Stream closed Nested exception: Stream closed
         //
         verifyException("org.dom4j.io.SAXReader", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.6674619334292948
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SAXReader sAXReader0 = new SAXReader(true);
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      SAXContentHandler sAXContentHandler0 = sAXReader0.createContentHandler(xMLFilterImpl0);
      try { 
        sAXReader0.configureReader(xMLFilterImpl0, sAXContentHandler0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Validation not supported for XMLReader: org.xml.sax.helpers.XMLFilterImpl@278bed5e Nested exception: Feature: http://xml.org/sax/features/validation
         //
         verifyException("org.dom4j.io.SAXReader", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=3.131333581636701
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SAXReader sAXReader0 = new SAXReader();
      sAXReader0.getEntityResolver();
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      sAXReader0.setXMLFilter(xMLFilterImpl0);
      DefaultDocumentFactory defaultDocumentFactory0 = new DefaultDocumentFactory();
      sAXReader0.setDocumentFactory(defaultDocumentFactory0);
      sAXReader0.setValidation(false);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(pipedInputStream0, 2733);
      SAXReader.SAXEntityResolver sAXReader_SAXEntityResolver0 = new SAXReader.SAXEntityResolver((String) null);
      sAXReader_SAXEntityResolver0.resolveEntity("t/qcd(=?qYN", "*2Ts*");
      StringReader stringReader0 = new StringReader("aabL4eB");
      try { 
        sAXReader0.read((Reader) stringReader0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error on line 1 of document  : Content is not allowed in prolog. Nested exception: Content is not allowed in prolog.
         //
         verifyException("org.dom4j.io.SAXReader", e);
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=2.8427542652575086
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SAXReader.SAXEntityResolver sAXReader_SAXEntityResolver0 = new SAXReader.SAXEntityResolver("");
      sAXReader_SAXEntityResolver0.resolveEntity("", "");
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      FileSystemHandling.shouldAllThrowIOExceptions();
      SAXReader.SAXEntityResolver sAXReader_SAXEntityResolver1 = new SAXReader.SAXEntityResolver("");
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      sAXReader_SAXEntityResolver0.resolveEntity(".X-L", "");
      sAXReader_SAXEntityResolver0.resolveEntity("-^7", "http://xml.org/sax/features/use-locator2");
      DocumentFactory documentFactory0 = DefaultDocumentFactory.getInstance();
      SAXReader sAXReader0 = new SAXReader(documentFactory0);
      try { 
        sAXReader0.read((Reader) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // null Nested exception: null
         //
         verifyException("org.dom4j.io.SAXReader", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.7480673485460891
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      SAXReader sAXReader0 = new SAXReader(xMLFilterImpl0, true);
      sAXReader0.setXMLFilter(xMLFilterImpl0);
      DefaultDocumentFactory defaultDocumentFactory0 = new DefaultDocumentFactory();
      sAXReader0.setDocumentFactory(defaultDocumentFactory0);
      sAXReader0.setValidation(true);
      assertFalse(sAXReader0.isMergeAdjacentText());
      
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(pipedInputStream0, 58);
      SAXReader.SAXEntityResolver sAXReader_SAXEntityResolver0 = new SAXReader.SAXEntityResolver("<n`\"e3.z&PR");
      sAXReader_SAXEntityResolver0.resolveEntity("<n`\"e3.z&PR", "<n`\"e3.z&PR");
      sAXReader0.setMergeAdjacentText(true);
      assertTrue(sAXReader0.isMergeAdjacentText());
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = null;
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "\"ZQ<[F.}}S(q9.zw7|");
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      SAXReader.SAXEntityResolver sAXReader_SAXEntityResolver0 = new SAXReader.SAXEntityResolver("\"ZQ<[F.}}S(q9.zw7|");
      sAXReader_SAXEntityResolver0.resolveEntity((String) null, (String) null);
      String string0 = "No text at offset: ";
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      String string1 = null;
      sAXReader_SAXEntityResolver0.resolveEntity("No text at offset: ", (String) null);
      SAXReader sAXReader0 = null;
      try {
        sAXReader0 = new SAXReader("No text at offset: ", false);
        fail("Expecting exception: SAXException");
      
      } catch(Throwable e) {
         //
         // SAX2 driver class No text at offset:  not found
         //
         verifyException("org.xml.sax.helpers.XMLReaderFactory", e);
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=2.8782183066708504
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          SAXReader sAXReader0 = new SAXReader();
          PipedInputStream pipedInputStream0 = new PipedInputStream();
          SequenceInputStream sequenceInputStream0 = new SequenceInputStream(pipedInputStream0, pipedInputStream0);
          URL uRL0 = MockURL.getFtpExample();
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
             // sun.reflect.GeneratedMethodAccessor181.invoke(Unknown Source)
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
             // sun.reflect.GeneratedMethodAccessor181.invoke(Unknown Source)
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
  //Test case number: 26
  /*Coverage entropy=2.9921969608854835
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SAXReader sAXReader0 = new SAXReader();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(pipedInputStream0, pipedInputStream0);
      MockURL.getFtpExample();
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream1 = new SequenceInputStream(enumeration0);
      SAXReader sAXReader1 = new SAXReader((XMLReader) null);
      sAXReader1.setIncludeInternalDTDDeclarations(true);
      try { 
        sAXReader1.read((InputStream) sequenceInputStream1, "/4&XWI2;Vck");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error on line -1 of document  : Premature end of file. Nested exception: Premature end of file.
         //
         verifyException("org.dom4j.io.SAXReader", e);
      }
  }
}