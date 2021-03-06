/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 15:29:44 GMT 2018
 */

package com.soops.CEN4010.JMCA.JParser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.soops.CEN4010.JMCA.JParser.JJTJavaParserState;
import com.soops.CEN4010.JMCA.JParser.JavaCharStream;
import com.soops.CEN4010.JMCA.JParser.JavaParser;
import com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager;
import com.soops.CEN4010.JMCA.JParser.Node;
import com.soops.CEN4010.JMCA.JParser.SimpleNode;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.Reader;
import java.io.SequenceInputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Enumeration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SimpleNode_ESTest extends SimpleNode_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int int0 = 103;
      PipedInputStream pipedInputStream0 = new PipedInputStream(103);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0);
      JavaParser javaParser0 = new JavaParser(bufferedInputStream0);
      try { 
        javaParser0.TryStatement();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Parse error at line 1, column 0.  Encountered: <EOF>
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParser", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)10;
      byteArray0[2] = (byte)15;
      byteArray0[3] = (byte)86;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, (byte)86);
      JavaCharStream javaCharStream0 = new JavaCharStream(byteArrayInputStream0, (byte)10, (byte)15, (byte)86);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      JavaParser javaParser0 = new JavaParser(javaParserTokenManager0);
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, (byte)10);
      int int0 = simpleNode0.jjtGetNumChildren();
      assertEquals(0, int0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = ";SimF2=dm";
      StringReader stringReader0 = new StringReader(";SimF2=dm");
      JavaParser javaParser0 = new JavaParser(stringReader0);
      int int0 = (-3755);
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, (-3755));
      simpleNode0.jjtGetParent();
      // Undeclared exception!
      try { 
        simpleNode0.jjtAddChild((Node) null, (-3755));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      int int0 = 0;
      simpleNode0.setIdentifier("![h2");
      simpleNode0.jjtAddChild((Node) null, 0);
      simpleNode0.toString();
      simpleNode0.toString();
      Node[] nodeArray0 = new Node[0];
      simpleNode0.children = nodeArray0;
      simpleNode0.toString("b<r~Nm");
      ArrayList<String> arrayList0 = new ArrayList<String>();
      simpleNode0.identifiers = arrayList0;
      simpleNode0.toString("w6MvHkFJm`l9LEyi");
      // Undeclared exception!
      try { 
        simpleNode0.jjtGetChild(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      JavaParser javaParser0 = new JavaParser(sequenceInputStream0);
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 0);
      StringWriter stringWriter0 = new StringWriter(0);
      char[] charArray0 = new char[9];
      charArray0[0] = '2';
      charArray0[1] = 'B';
      charArray0[2] = 'M';
      charArray0[3] = 'V';
      charArray0[4] = '3';
      charArray0[5] = 'l';
      charArray0[6] = 'U';
      charArray0[7] = 'a';
      charArray0[8] = '\\';
      stringWriter0.write(charArray0, 0, 0);
      simpleNode0.dump((String) null, stringWriter0);
      assertEquals("", stringWriter0.toString());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(10);
      String string0 = "FDH1g> a";
      int int0 = 2900;
      simpleNode0.id = 2900;
      StringWriter stringWriter0 = new StringWriter();
      stringWriter0.append('t');
      stringWriter0.append((CharSequence) "FDH1g> a");
      stringWriter0.append('8');
      stringWriter0.append('8');
      stringWriter0.append((CharSequence) "FDH1g> a");
      simpleNode0.dump("FDH1g> a", stringWriter0);
      simpleNode0.jjtClose();
      simpleNode0.setIdentifier("FDH1g> a");
      // Undeclared exception!
      try { 
        simpleNode0.toString("FDH1g> a");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2900
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.1639556568820564
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.jjtOpen();
      simpleNode0.jjtClose();
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      simpleNode0.identifiers = arrayList0;
      arrayList0.add("#j");
      arrayList0.add("\"IK&-kkUUXC8#k@G");
      arrayList0.add("\"IK&-kkUUXC8#k@G");
      arrayList0.retainAll(simpleNode0.identifiers);
      arrayList0.add("\"new\"");
      SimpleNode simpleNode1 = new SimpleNode(0);
      simpleNode0.jjtAddChild(simpleNode1, 0);
      simpleNode0.toString("Y=k4");
      simpleNode0.toString();
      arrayList0.add(0, "\"IK&-kkUUXC8#k@G");
      simpleNode0.jjtClose();
      simpleNode0.toString();
      Node node0 = simpleNode0.parent;
      simpleNode0.jjtSetParent((Node) null);
      arrayList0.parallelStream();
      simpleNode0.jjtGetNumChildren();
      simpleNode0.jjtOpen();
      simpleNode0.toString();
      simpleNode0.toString();
      simpleNode1.toString("\"IK&-kkUUXC8#k@G");
      simpleNode0.jjtOpen();
      simpleNode0.jjtSetParent((Node) null);
      simpleNode0.toString("<U\"{^N-|YV@GJ4mn");
      StringWriter stringWriter0 = new StringWriter();
      stringWriter0.close();
      simpleNode0.dump("6 !m.R#FTT/Q^=U)w&", stringWriter0);
      simpleNode0.jjtAddChild(simpleNode1, 1);
      assertEquals(2, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.6674619334292946
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.jjtAddChild((Node) null, 0);
      simpleNode0.jjtGetParent();
      simpleNode0.jjtOpen();
      simpleNode0.jjtGetParent();
      simpleNode0.jjtOpen();
      simpleNode0.id = 0;
      simpleNode0.jjtAddChild((Node) null, 0);
      simpleNode0.jjtGetParent();
      simpleNode0.jjtGetParent();
      simpleNode0.jjtGetChild(0);
      simpleNode0.jjtGetChild(0);
      simpleNode0.jjtClose();
      simpleNode0.jjtAddChild((Node) null, 0);
      // Undeclared exception!
      try { 
        simpleNode0.jjtAddChild((Node) null, (-598));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -598
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.6699768031135118
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.jjtClose();
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      simpleNode0.identifiers = arrayList0;
      arrayList0.add("#j");
      arrayList0.add("\"IK&-kkUUXC8#k@G");
      arrayList0.add("\"IK&-kkUUXC8#k@G");
      arrayList0.retainAll(simpleNode0.identifiers);
      arrayList0.add("\"new\"");
      SimpleNode simpleNode1 = new SimpleNode(0);
      simpleNode0.jjtAddChild(simpleNode1, 0);
      simpleNode0.toString("Y=k4");
      simpleNode0.toString();
      arrayList0.add(0, "\"IK&-kkUUXC8#k@G");
      simpleNode0.jjtClose();
      simpleNode0.toString();
      Node node0 = simpleNode0.parent;
      simpleNode0.jjtSetParent((Node) null);
      arrayList0.parallelStream();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(comparator0).compare(any() , any());
      arrayList0.add("");
      arrayList0.sort(comparator0);
      simpleNode0.jjtGetNumChildren();
      simpleNode0.jjtOpen();
      simpleNode0.toString();
      simpleNode1.toString("Y=k4");
      simpleNode1.toString("\"IK&-kkUUXC8#k@G");
      simpleNode0.jjtOpen();
      simpleNode0.jjtSetParent((Node) null);
      simpleNode0.toString("<U\"{^N-|YV@GJ4mn");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode1.jjtAddChild((Node) null, 10);
      simpleNode0.dump("Y=k4", stringWriter0);
      assertEquals(1, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.9320738874454946
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      simpleNode0.identifiers = arrayList0;
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.shouldAllThrowIOExceptions();
      arrayList0.add("\"IK&-kkUUXC8#k@G");
      FileSystemHandling.shouldAllThrowIOExceptions();
      ArrayList<String> arrayList1 = simpleNode0.identifiers;
      arrayList1.add("xb");
      Node node0 = simpleNode0.parent;
      simpleNode0.jjtAddChild((Node) null, 0);
      simpleNode0.toString("</identifier>");
      simpleNode0.toString();
      arrayList0.add(0, ">=");
      simpleNode0.jjtClose();
      simpleNode0.toString();
      StringWriter stringWriter0 = new StringWriter();
      stringWriter0.flush();
      simpleNode0.dump("$kj0N@|+v", stringWriter0);
      assertEquals(1, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.3750242529845458
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.jjtClose();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      simpleNode0.identifiers = arrayList0;
      arrayList0.add("j");
      arrayList0.add("\"IK&-kkUUXC8#k@G");
      arrayList0.add("\"IK&-kkUUXC8#k@G");
      arrayList0.retainAll(simpleNode0.identifiers);
      arrayList0.add("v\"new\"");
      simpleNode0.jjtAddChild(simpleNode0, 0);
      simpleNode0.toString("Y=k4");
      simpleNode0.toString();
      arrayList0.add(0, "\"IK&-kkUUXC8#k@G");
      simpleNode0.jjtClose();
      simpleNode0.toString();
      Node node0 = simpleNode0.parent;
      simpleNode0.jjtSetParent((Node) null);
      arrayList0.parallelStream();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(comparator0).compare(any() , any());
      arrayList0.add(">");
      Comparator<String> comparator1 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(comparator1).compare(anyString() , anyString());
      arrayList0.sort(comparator1);
      arrayList0.sort(comparator0);
      simpleNode0.jjtOpen();
      simpleNode0.toString("Y=k4");
      simpleNode0.toString("\"IK&-kkUUXC8#k@G");
      simpleNode0.jjtOpen();
      simpleNode0.jjtSetParent((Node) null);
      simpleNode0.toString("CompilationUnit : j : \"IK&-kkUUXC8#k@G : \"IK&-kkUUXC8#k@G : v\"new\"");
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        simpleNode0.dump("CompilationUnit : j : \"IK&-kkUUXC8#k@G : \"IK&-kkUUXC8#k@G : v\"new\"", stringWriter0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.9646946227273334
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(2);
      simpleNode0.jjtClose();
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      simpleNode0.identifiers = arrayList0;
      ArrayList<String> arrayList1 = simpleNode0.identifiers;
      String string0 = "&";
      arrayList1.add("&");
      String string1 = null;
      arrayList0.add((String) null);
      arrayList0.add("{");
      arrayList1.add("\"IK&-kkUUXC8#k@G");
      SimpleNode simpleNode1 = new SimpleNode(2);
      simpleNode0.jjtOpen();
      simpleNode0.toString("<EXPONENT>");
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = new StringWriter();
      stringWriter0.flush();
      StringWriter stringWriter2 = new StringWriter(2);
      StringWriter stringWriter3 = new StringWriter();
      stringWriter2.flush();
      // Undeclared exception!
      try { 
        simpleNode0.dump("<EXPONENT>ImportDeclaration : & : null : { : \"IK&-kkUUXC8#k@G", stringWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }
}
