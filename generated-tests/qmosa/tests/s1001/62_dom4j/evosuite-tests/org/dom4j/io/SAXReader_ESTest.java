/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 11:03:00 GMT 2018
 */

package org.dom4j.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PushbackInputStream;
import java.io.Reader;
import java.io.SequenceInputStream;
import java.io.StringReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import org.dom4j.DefaultDocumentFactory;
import org.dom4j.DocumentFactory;
import org.dom4j.ElementHandler;
import org.dom4j.QName;
import org.dom4j.io.DispatchHandler;
import org.dom4j.io.ElementStack;
import org.dom4j.io.PruningElementStack;
import org.dom4j.io.SAXContentHandler;
import org.dom4j.io.SAXReader;
import org.dom4j.tree.NamespaceStack;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.io.MockRandomAccessFile;
import org.evosuite.runtime.mock.java.lang.MockException;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import org.xml.sax.EntityResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.Parser;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXParseException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.DefaultHandler2;
import org.xml.sax.helpers.LocatorImpl;
import org.xml.sax.helpers.ParserAdapter;
import org.xml.sax.helpers.XMLFilterImpl;
import org.xml.sax.helpers.XMLReaderAdapter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SAXReader_ESTest extends SAXReader_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = null;
      SAXReader sAXReader0 = new SAXReader((String) null);
      sAXReader0.getDocumentFactory();
      sAXReader0.setIncludeInternalDTDDeclarations(false);
      sAXReader0.resetHandlers();
      sAXReader0.getXMLFilter();
      sAXReader0.getDispatchHandler();
      boolean boolean0 = true;
      sAXReader0.setIncludeExternalDTDDeclarations(true);
      // Undeclared exception!
      try { 
        sAXReader0.setFeature((String) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xerces.jaxp.SAXParserImpl$JAXPSAXParser", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DocumentFactory documentFactory0 = DefaultDocumentFactory.getInstance();
      SAXReader sAXReader0 = new SAXReader(documentFactory0, false);
      sAXReader0.getXMLReader();
      sAXReader0.isIncludeExternalDTDDeclarations();
      sAXReader0.getDocumentFactory();
      sAXReader0.getXMLReader();
      sAXReader0.createDefaultEntityResolver("");
      String[] stringArray0 = new String[4];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      DispatchHandler dispatchHandler0 = new DispatchHandler();
      PruningElementStack pruningElementStack0 = null;
      try {
        pruningElementStack0 = new PruningElementStack(stringArray0, dispatchHandler0, (-1));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.dom4j.io.ElementStack", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      XMLReaderAdapter xMLReaderAdapter0 = new XMLReaderAdapter();
      ParserAdapter parserAdapter0 = new ParserAdapter(xMLReaderAdapter0);
      SAXReader sAXReader0 = new SAXReader(parserAdapter0, false);
      sAXReader0.getXMLFilter();
      assertFalse(sAXReader0.isValidating());
      assertTrue(sAXReader0.isStringInternEnabled());
      assertFalse(sAXReader0.isIgnoreComments());
      assertFalse(sAXReader0.isStripWhitespaceText());
      assertFalse(sAXReader0.isIncludeExternalDTDDeclarations());
      assertFalse(sAXReader0.isMergeAdjacentText());
      assertFalse(sAXReader0.isIncludeInternalDTDDeclarations());
      
      SAXReader sAXReader1 = new SAXReader((XMLReader) null);
      sAXReader1.getEntityResolver();
      assertTrue(sAXReader1.isStringInternEnabled());
      assertFalse(sAXReader1.isMergeAdjacentText());
      assertFalse(sAXReader1.isIgnoreComments());
      assertFalse(sAXReader1.isIncludeExternalDTDDeclarations());
      assertFalse(sAXReader1.isIncludeInternalDTDDeclarations());
      assertFalse(sAXReader1.isStripWhitespaceText());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
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
  //Test case number: 4
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = "`\\8";
      SAXReader sAXReader0 = null;
      try {
        sAXReader0 = new SAXReader("`8", true);
        fail("Expecting exception: SAXException");
      
      } catch(Throwable e) {
         //
         // SAX2 driver class `8 not found
         //
         verifyException("org.xml.sax.helpers.XMLReaderFactory", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SAXReader sAXReader0 = new SAXReader();
      boolean boolean0 = false;
      sAXReader0.setStripWhitespaceText(false);
      String string0 = "-5d64Q\\a ,-]r";
      sAXReader0.setMergeAdjacentText(true);
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      xMLFilterImpl0.processingInstruction("-5d64Qa ,-]r", "-5d64Qa ,-]r");
      InputSource inputSource0 = new InputSource("-5d64Qa ,-]r");
      // Undeclared exception!
      try { 
        xMLFilterImpl0.parse(inputSource0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // No parent for filter
         //
         verifyException("org.xml.sax.helpers.XMLFilterImpl", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DocumentFactory documentFactory0 = DefaultDocumentFactory.getInstance();
      SAXReader sAXReader0 = new SAXReader(documentFactory0);
      DocumentFactory documentFactory1 = DefaultDocumentFactory.getInstance();
      sAXReader0.setDocumentFactory(documentFactory1);
      boolean boolean0 = false;
      sAXReader0.setValidation(false);
      sAXReader0.setIncludeExternalDTDDeclarations(false);
      String string0 = "+~JTm~VKB_";
      EntityResolver entityResolver0 = sAXReader0.createDefaultEntityResolver("+~JTm~VKB_");
      sAXReader0.setEntityResolver(entityResolver0);
      sAXReader0.createXMLReader();
      sAXReader0.getEncoding();
      sAXReader0.createXMLReader();
      try { 
        sAXReader0.setProperty("+~JTm~VKB_", (Object) null);
        fail("Expecting exception: SAXNotRecognizedException");
      
      } catch(SAXNotRecognizedException e) {
         //
         // Property '+~JTm~VKB_' is not recognized.
         //
         verifyException("org.apache.xerces.parsers.AbstractSAXParser", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.772588722239781
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DocumentFactory documentFactory0 = DefaultDocumentFactory.getInstance();
      SAXReader sAXReader0 = new SAXReader(documentFactory0, true);
      sAXReader0.setIncludeExternalDTDDeclarations(true);
      sAXReader0.getXMLFilter();
      SAXContentHandler sAXContentHandler0 = sAXReader0.createContentHandler((XMLReader) null);
      sAXReader0.setStripWhitespaceText(false);
      sAXReader0.resetHandlers();
      sAXReader0.isStringInternEnabled();
      sAXReader0.setEntityResolver(sAXContentHandler0);
      sAXReader0.setEntityResolver(sAXContentHandler0);
      sAXReader0.isStringInternEnabled();
      String string0 = null;
      sAXReader0.installXMLFilter((XMLReader) null);
      sAXReader0.removeHandler((String) null);
      try { 
        sAXReader0.setProperty("org.dom4j.dom.DOMProcessingInstruction", (Object) null);
        fail("Expecting exception: SAXNotRecognizedException");
      
      } catch(SAXNotRecognizedException e) {
         //
         // Property 'org.dom4j.dom.DOMProcessingInstruction' is not recognized.
         //
         verifyException("org.apache.xerces.parsers.AbstractSAXParser", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SAXReader sAXReader0 = new SAXReader();
      String string0 = " namespace: \"";
      sAXReader0.setEncoding(" namespace: \"");
      sAXReader0.isIncludeInternalDTDDeclarations();
      sAXReader0.getDispatchHandler();
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
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NamespaceStack namespaceStack0 = new NamespaceStack();
      QName qName0 = namespaceStack0.getQName("http://xml.org/sax/features/namespace-prefixes", "http://xml.org/sax/features/namespace-prefixes", "&(psC,_");
      DocumentFactory documentFactory0 = qName0.getDocumentFactory();
      SAXReader sAXReader0 = new SAXReader(documentFactory0);
      sAXReader0.createDefaultEntityResolver("http://xml.org/sax/features/namespace-prefixes");
      assertFalse(sAXReader0.isIncludeInternalDTDDeclarations());
      assertFalse(sAXReader0.isMergeAdjacentText());
      assertFalse(sAXReader0.isIgnoreComments());
      assertTrue(sAXReader0.isStringInternEnabled());
      assertFalse(sAXReader0.isStripWhitespaceText());
      assertFalse(sAXReader0.isIncludeExternalDTDDeclarations());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SAXReader.SAXEntityResolver sAXReader_SAXEntityResolver0 = new SAXReader.SAXEntityResolver("CnNH4;pT-a:dR");
      SAXReader sAXReader0 = new SAXReader();
      sAXReader0.getXMLFilter();
      SAXReader sAXReader1 = new SAXReader((XMLReader) null);
      DefaultHandler2 defaultHandler2_0 = new DefaultHandler2();
      defaultHandler2_0.resolveEntity((String) null, (String) null);
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
  //Test case number: 11
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SAXReader sAXReader0 = new SAXReader(true);
      String string0 = "";
      LocatorImpl locatorImpl0 = new LocatorImpl();
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      SAXContentHandler sAXContentHandler0 = sAXReader0.createContentHandler(xMLFilterImpl0);
      sAXReader0.setErrorHandler(sAXContentHandler0);
      locatorImpl0.getSystemId();
      SAXParseException sAXParseException0 = new SAXParseException("", locatorImpl0);
      sAXReader0.setStringInternEnabled(true);
      sAXReader0.installXMLFilter(xMLFilterImpl0);
      try { 
        sAXReader0.setProperty("", sAXParseException0);
        fail("Expecting exception: SAXNotRecognizedException");
      
      } catch(SAXNotRecognizedException e) {
         //
         // Property '' is not recognized.
         //
         verifyException("org.apache.xerces.parsers.AbstractSAXParser", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=3.0910424533583143
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SAXReader sAXReader0 = new SAXReader((XMLReader) null);
      String string0 = "";
      StringReader stringReader0 = new StringReader("");
      sAXReader0.setStripWhitespaceText(true);
      stringReader0.markSupported();
      stringReader0.markSupported();
      stringReader0.close();
      sAXReader0.setStringInternEnabled(true);
      sAXReader0.setXMLReader((XMLReader) null);
      try { 
        sAXReader0.read((Reader) stringReader0, "");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Stream closed Nested exception: Stream closed
         //
         verifyException("org.dom4j.io.SAXReader", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SAXReader sAXReader0 = new SAXReader(true);
      DispatchHandler dispatchHandler0 = sAXReader0.getDispatchHandler();
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      dispatchHandler0.removeHandler("@bNBSqh)");
      xMLFilterImpl0.processingInstruction((String) null, "@bNBSqh)");
      sAXReader0.setEntityResolver(xMLFilterImpl0);
      sAXReader0.setIgnoreComments(true);
      sAXReader0.isStringInternEnabled();
      sAXReader0.getEntityResolver();
      String string0 = "p";
      SAXParseException sAXParseException0 = new SAXParseException("`0ydS:4Zy4s3{CgD=", (String) null, "p", (-1280), 2588);
      dispatchHandler0.removeHandler("Mi~yASP");
      MockException mockException0 = new MockException(sAXParseException0);
      sAXParseException0.getMessage();
      SAXParseException sAXParseException1 = new SAXParseException((String) null, (String) null, "@bNBSqh)", (-880), 2588, mockException0);
      xMLFilterImpl0.error(sAXParseException1);
      SAXContentHandler sAXContentHandler0 = sAXReader0.createContentHandler(xMLFilterImpl0);
      try { 
        sAXReader0.configureReader(xMLFilterImpl0, sAXContentHandler0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Validation not supported for XMLReader: org.xml.sax.helpers.XMLFilterImpl@429b3403 Nested exception: Feature: http://xml.org/sax/features/validation
         //
         verifyException("org.dom4j.io.SAXReader", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=3.178053830347946
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SAXReader sAXReader0 = new SAXReader();
      sAXReader0.setMergeAdjacentText(false);
      sAXReader0.isIgnoreComments();
      DispatchHandler dispatchHandler0 = sAXReader0.getDispatchHandler();
      sAXReader0.getXMLReader();
      dispatchHandler0.resetHandlers();
      dispatchHandler0.resetHandlers();
      dispatchHandler0.removeHandler((String) null);
      String string0 = "\" data: ";
      sAXReader0.setMergeAdjacentText(true);
      sAXReader0.getErrorHandler();
      sAXReader0.setDispatchHandler(dispatchHandler0);
      sAXReader0.setErrorHandler((ErrorHandler) null);
      dispatchHandler0.removeHandler("org.dom4j.tree.DefaultComment");
      try { 
        sAXReader0.read("\" data: ");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no protocol: \" data:  Nested exception: no protocol: \" data: 
         //
         verifyException("org.dom4j.io.SAXReader", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SAXReader sAXReader0 = new SAXReader(true);
      DispatchHandler dispatchHandler0 = sAXReader0.getDispatchHandler();
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      dispatchHandler0.removeHandler("@bNBSqh)");
      xMLFilterImpl0.processingInstruction((String) null, "@bNBSqh)");
      sAXReader0.setEntityResolver(xMLFilterImpl0);
      assertFalse(sAXReader0.isIgnoreComments());
      
      sAXReader0.setIgnoreComments(true);
      sAXReader0.isStringInternEnabled();
      sAXReader0.getEntityResolver();
      SAXReader sAXReader1 = new SAXReader((String) null, true);
      sAXReader0.setEntityResolver(xMLFilterImpl0);
      assertTrue(sAXReader0.isIgnoreComments());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SAXReader sAXReader0 = new SAXReader(true);
      DispatchHandler dispatchHandler0 = sAXReader0.getDispatchHandler();
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      dispatchHandler0.removeHandler("@bNBSqh)");
      xMLFilterImpl0.processingInstruction((String) null, "@bNBSqh)");
      sAXReader0.setEntityResolver(xMLFilterImpl0);
      sAXReader0.setIgnoreComments(true);
      sAXReader0.isStringInternEnabled();
      sAXReader0.getEntityResolver();
      SAXParseException sAXParseException0 = new SAXParseException("`0ydS:4Zy4s3{CgD=", (String) null, "p", (-1280), 2588);
      sAXParseException0.getMessage();
      dispatchHandler0.removeHandler("Mi~yASP");
      MockException mockException0 = new MockException(sAXParseException0);
      DefaultHandler2 defaultHandler2_0 = new DefaultHandler2();
      defaultHandler2_0.resolveEntity("@bNBSqh)", "");
      InputSource inputSource0 = new InputSource();
      try { 
        sAXReader0.read(inputSource0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // null Nested exception: null
         //
         verifyException("org.dom4j.io.SAXReader", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.772588722239781
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SAXReader sAXReader0 = new SAXReader();
      DispatchHandler dispatchHandler0 = sAXReader0.getDispatchHandler();
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      dispatchHandler0.removeHandler("@bNBSqh)");
      xMLFilterImpl0.processingInstruction((String) null, "@bNBSqh)");
      sAXReader0.setEntityResolver(xMLFilterImpl0);
      sAXReader0.setIgnoreComments(false);
      sAXReader0.isStringInternEnabled();
      sAXReader0.getEntityResolver();
      SAXParseException sAXParseException0 = new SAXParseException("`0ydS:4Zy4s3{CgD=", (String) null, "p", (-1280), 2588);
      dispatchHandler0.removeHandler("Mi~yASP");
      MockException mockException0 = new MockException(sAXParseException0);
      sAXParseException0.getMessage();
      SAXParseException sAXParseException1 = new SAXParseException((String) null, (String) null, "@bNBSqh)", (-880), 2588, mockException0);
      xMLFilterImpl0.error(sAXParseException1);
      SAXContentHandler sAXContentHandler0 = sAXReader0.createContentHandler(xMLFilterImpl0);
      sAXReader0.configureReader(xMLFilterImpl0, sAXContentHandler0);
      sAXReader0.setDispatchHandler(dispatchHandler0);
      sAXReader0.isIgnoreComments();
      sAXReader0.setIncludeExternalDTDDeclarations(false);
      sAXReader0.setDispatchHandler(dispatchHandler0);
      sAXReader0.isIncludeExternalDTDDeclarations();
      SAXReader.SAXEntityResolver sAXReader_SAXEntityResolver0 = new SAXReader.SAXEntityResolver("`0ydS:4Zy4s3{CgD=");
      InputSource inputSource0 = sAXReader_SAXEntityResolver0.resolveEntity("@bNBSqh)", (String) null);
      assertNotNull(inputSource0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.7478680974667573
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SAXReader sAXReader0 = new SAXReader();
      sAXReader0.setMergeAdjacentText(false);
      sAXReader0.isIgnoreComments();
      sAXReader0.getDispatchHandler();
      SAXReader.SAXEntityResolver sAXReader_SAXEntityResolver0 = new SAXReader.SAXEntityResolver("");
      InputSource inputSource0 = sAXReader_SAXEntityResolver0.resolveEntity("", "");
      InputSource inputSource1 = sAXReader_SAXEntityResolver0.resolveEntity("cvw(iqY<CuIQH> y", "cvw(iqY<CuIQH> y");
      assertFalse(inputSource1.equals((Object)inputSource0));
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SAXReader sAXReader0 = new SAXReader();
      SAXReader.SAXEntityResolver sAXReader_SAXEntityResolver0 = new SAXReader.SAXEntityResolver("8`yN[c}zy8^X_%|!2b");
      sAXReader_SAXEntityResolver0.resolveEntity("df", "df");
      sAXReader_SAXEntityResolver0.resolveEntity("", "Validation not supported for XMLReader: ");
      sAXReader_SAXEntityResolver0.resolveEntity("?", "org.jaxen.expr.iter.IterableAncestorOrSelfAxis");
      XMLReaderAdapter xMLReaderAdapter0 = new XMLReaderAdapter();
      try { 
        xMLReaderAdapter0.parse("Validation not supported for XMLReader: ");
        fail("Expecting exception: MalformedURLException");
      
      } catch(MalformedURLException e) {
         //
         // no protocol: Validation not supported for XMLReader: 
         //
         verifyException("java.net.URL", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=2.91704765594493
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      xMLFilterImpl0.processingInstruction((String) null, "@bNBSqh)");
      SAXParseException sAXParseException0 = new SAXParseException("`0ydS:4Zy4s3{CgD=", (String) null, "p", (-880), (-880));
      MockException mockException0 = new MockException(sAXParseException0);
      sAXParseException0.getMessage();
      xMLFilterImpl0.error(sAXParseException0);
      SAXReader.SAXEntityResolver sAXReader_SAXEntityResolver0 = new SAXReader.SAXEntityResolver("53WTu");
      sAXReader_SAXEntityResolver0.resolveEntity((String) null, "p");
      DefaultDocumentFactory defaultDocumentFactory0 = new DefaultDocumentFactory();
      SAXReader sAXReader0 = new SAXReader(defaultDocumentFactory0, true);
      sAXReader0.setValidation(false);
      sAXReader0.createDefaultEntityResolver("')Tf{K;CUS/f");
      try { 
        sAXReader0.read((Reader) null, (String) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // null Nested exception: null
         //
         verifyException("org.dom4j.io.SAXReader", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.45056120886630463
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SAXReader.SAXEntityResolver sAXReader_SAXEntityResolver0 = new SAXReader.SAXEntityResolver((String) null);
      sAXReader_SAXEntityResolver0.resolveEntity((String) null, "|IWv0+<zZ\"qwx\"i$|:T");
      sAXReader_SAXEntityResolver0.resolveEntity("]bmr^Of&S", "");
      sAXReader_SAXEntityResolver0.resolveEntity((String) null, (String) null);
      XMLReaderAdapter xMLReaderAdapter0 = new XMLReaderAdapter();
      try { 
        xMLReaderAdapter0.parse((String) null);
        fail("Expecting exception: MalformedURLException");
      
      } catch(MalformedURLException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.net.URL", e);
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=3.078014567747475
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      XMLFilterImpl xMLFilterImpl1 = new XMLFilterImpl(xMLFilterImpl0);
      boolean boolean0 = true;
      SAXReader sAXReader0 = new SAXReader(true);
      sAXReader0.setMergeAdjacentText(true);
      sAXReader0.getErrorHandler();
      DispatchHandler dispatchHandler0 = new DispatchHandler();
      sAXReader0.setDispatchHandler(dispatchHandler0);
      sAXReader0.setErrorHandler(xMLFilterImpl1);
      dispatchHandler0.removeHandler(" ");
      try { 
        sAXReader0.read("org.dom4j.tree.DefaultComment");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // /home/ubuntu/ext1/evosuite_readability_gen/projects/62_dom4j/org.dom4j.tree.DefaultComment (No such file or directory) Nested exception: /home/ubuntu/ext1/evosuite_readability_gen/projects/62_dom4j/org.dom4j.tree.DefaultComment (No such file or directory)
         //
         verifyException("org.dom4j.io.SAXReader", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.15374194270109
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      String string0 = "amp";
      SAXReader.SAXEntityResolver sAXReader_SAXEntityResolver0 = new SAXReader.SAXEntityResolver("amp");
      sAXReader_SAXEntityResolver0.resolveEntity("amp", "amp");
      SAXReader sAXReader0 = new SAXReader((XMLReader) null, true);
      try { 
        sAXReader0.setXMLReaderClassName("amp");
        fail("Expecting exception: SAXException");
      
      } catch(SAXException e) {
         //
         // SAX2 driver class amp not found
         //
         verifyException("org.xml.sax.helpers.XMLReaderFactory", e);
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=2.8782183066708504
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SAXReader sAXReader0 = new SAXReader(false);
      Reader reader0 = null;
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
  //Test case number: 25
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SAXReader sAXReader0 = new SAXReader();
      String string0 = "";
      sAXReader0.setXMLReader((XMLReader) null);
      DispatchHandler dispatchHandler0 = new DispatchHandler();
      sAXReader0.addHandler("", dispatchHandler0);
      sAXReader0.setIncludeExternalDTDDeclarations(true);
      DispatchHandler dispatchHandler1 = new DispatchHandler();
      try { 
        sAXReader0.setFeature("", true);
        fail("Expecting exception: SAXNotRecognizedException");
      
      } catch(SAXNotRecognizedException e) {
         //
         // Feature '' is not recognized.
         //
         verifyException("org.apache.xerces.parsers.AbstractSAXParser", e);
      }
  }

  /**
  //Test case number: 26
  /*Coverage entropy=2.821563807860364
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      XMLFilterImpl xMLFilterImpl1 = new XMLFilterImpl(xMLFilterImpl0);
      SAXReader sAXReader0 = new SAXReader(xMLFilterImpl1);
      File file0 = MockFile.createTempFile("('C{<L)e0<5] OA", "('C{<L)e0<5] OA");
      MockFile mockFile0 = new MockFile(file0, "('C{<L)e0<5] OA");
      try { 
        sAXReader0.read(file0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // No parent for filter Nested exception: No parent for filter
         //
         verifyException("org.dom4j.io.SAXReader", e);
      }
  }

  /**
  //Test case number: 27
  /*Coverage entropy=2.821563807860364
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      XMLFilterImpl xMLFilterImpl1 = new XMLFilterImpl(xMLFilterImpl0);
      SAXReader sAXReader0 = new SAXReader(xMLFilterImpl1);
      File file0 = MockFile.createTempFile("('C{<L)e0<5] OA", "('C{<L)e0<5] OA");
      MockFile mockFile0 = new MockFile(file0, "('C{<L)e0<5] OA");
      URL uRL0 = MockURL.getFtpExample();
      try { 
        sAXReader0.read(uRL0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // No parent for filter Nested exception: No parent for filter
         //
         verifyException("org.dom4j.io.SAXReader", e);
      }
  }

  /**
  //Test case number: 28
  /*Coverage entropy=3.0391156880191645
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SAXReader sAXReader0 = new SAXReader();
      sAXReader0.setMergeAdjacentText(false);
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl((XMLReader) null);
      xMLFilterImpl0.processingInstruction("", "");
      SAXParseException sAXParseException0 = new SAXParseException("c}TmEhLLE)e=0]U", "p", "", (-880), 2137);
      MockException mockException0 = new MockException(sAXParseException0);
      xMLFilterImpl0.error(sAXParseException0);
      SAXReader.SAXEntityResolver sAXReader_SAXEntityResolver0 = new SAXReader.SAXEntityResolver("p");
      sAXReader_SAXEntityResolver0.resolveEntity("9f@J('jqS=izcy", "p");
      DefaultDocumentFactory defaultDocumentFactory0 = new DefaultDocumentFactory();
      SAXReader sAXReader1 = new SAXReader(defaultDocumentFactory0, true);
      sAXReader1.setValidation(true);
      sAXReader0.createDefaultEntityResolver("http://xml.org/sax/features/use-locator2");
      try { 
        sAXReader1.read((Reader) null, "");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error on line 1 of document file:///home/ubuntu/ext1/evosuite_readability_gen/projects/62_dom4j/ : Content is not allowed in prolog. Nested exception: Content is not allowed in prolog.
         //
         verifyException("org.dom4j.io.SAXReader", e);
      }
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      String string0 = null;
      xMLFilterImpl0.processingInstruction((String) null, "@bNBSqh)");
      SAXParseException sAXParseException0 = new SAXParseException("`0ydS:4Zy4s3{CgD=", (String) null, "p", (-880), (-880));
      ElementStack elementStack0 = new ElementStack();
      elementStack0.getDispatchHandler();
      SAXReader sAXReader0 = new SAXReader(xMLFilterImpl0);
      sAXReader0.setDefaultHandler((ElementHandler) null);
      String string1 = "W\\`JIM&u'X7Ka\"pT";
      try { 
        MockURI.URI("`0ydS:4Zy4s3{CgD=", "p", "W`JIM&u'X7Ka\"pT");
        fail("Expecting exception: URISyntaxException");
      
      } catch(URISyntaxException e) {
         //
         // Illegal character in scheme name at index 0: `0ydS:4Zy4s3{CgD=:p#W%60JIM&u'X7Ka%22pT
         //
         verifyException("java.net.URI$Parser", e);
      }
  }

  /**
  //Test case number: 30
  /*Coverage entropy=2.87821830667085
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      SAXReader.SAXEntityResolver sAXReader_SAXEntityResolver0 = new SAXReader.SAXEntityResolver("amp");
      DefaultDocumentFactory defaultDocumentFactory0 = new DefaultDocumentFactory();
      SAXReader sAXReader0 = new SAXReader(defaultDocumentFactory0, true);
      try { 
        sAXReader0.read((InputStream) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // null Nested exception: null
         //
         verifyException("org.dom4j.io.SAXReader", e);
      }
  }

  /**
  //Test case number: 31
  /*Coverage entropy=2.9683918915419634
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SAXReader sAXReader0 = new SAXReader((XMLReader) null);
      StringReader stringReader0 = new StringReader("");
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl((XMLReader) null);
      sAXReader0.installXMLFilter(xMLFilterImpl0);
      xMLFilterImpl0.processingInstruction("", "");
      SAXParseException sAXParseException0 = new SAXParseException("#c?lP%", "", "", (-880), 478);
      MockException mockException0 = new MockException(sAXParseException0);
      sAXParseException0.getMessage();
      SAXParseException sAXParseException1 = new SAXParseException(" of document ", "dKGz9{:dW~x,E`F", "MKo+k5uTPX", (-880), 4363);
      xMLFilterImpl0.error(sAXParseException1);
      SAXReader.SAXEntityResolver sAXReader_SAXEntityResolver0 = new SAXReader.SAXEntityResolver("p");
      sAXReader_SAXEntityResolver0.resolveEntity("dKGz9{:dW~x,E`F", " of document ");
      DefaultDocumentFactory defaultDocumentFactory0 = new DefaultDocumentFactory();
      SAXReader sAXReader1 = new SAXReader(defaultDocumentFactory0, false);
      sAXReader1.setValidation(true);
      String string0 = "y/^HJ`v(Ou*";
      sAXReader0.createDefaultEntityResolver("y/^HJ`v(Ou*");
      try { 
        sAXReader1.read((Reader) stringReader0, "p");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error on line -1 of document  : Premature end of file. Nested exception: Premature end of file.
         //
         verifyException("org.dom4j.io.SAXReader", e);
      }
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      SAXReader.SAXEntityResolver sAXReader_SAXEntityResolver0 = new SAXReader.SAXEntityResolver("amp");
      QName qName0 = new QName("amp");
      qName0.getDocumentFactory();
      SAXReader sAXReader0 = new SAXReader((DocumentFactory) null, true);
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      sAXReader0.setXMLFilter(xMLFilterImpl0);
      assertTrue(sAXReader0.isValidating());
      assertFalse(sAXReader0.isStripWhitespaceText());
      assertFalse(sAXReader0.isMergeAdjacentText());
      assertFalse(sAXReader0.isIncludeExternalDTDDeclarations());
      assertTrue(sAXReader0.isStringInternEnabled());
      assertFalse(sAXReader0.isIgnoreComments());
      assertFalse(sAXReader0.isIncludeInternalDTDDeclarations());
  }

  /**
  //Test case number: 33
  /*Coverage entropy=2.821563807860364
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      XMLFilterImpl xMLFilterImpl1 = new XMLFilterImpl(xMLFilterImpl0);
      SAXReader sAXReader0 = new SAXReader(xMLFilterImpl1);
      File file0 = MockFile.createTempFile("('C{<L)e0<5] OA", "('C{<L)e0<5] OA");
      MockFile mockFile0 = new MockFile(file0, "('C{<L)e0<5] OA");
      try { 
        sAXReader0.read((InputStream) null, "('C{<L)e0<5] OA");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // No parent for filter Nested exception: No parent for filter
         //
         verifyException("org.dom4j.io.SAXReader", e);
      }
  }
}