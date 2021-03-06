/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 10:30:44 GMT 2018
 */

package com.soops.CEN4010.JMCA.JParser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.soops.CEN4010.JMCA.JParser.JJTJavaParserState;
import com.soops.CEN4010.JMCA.JParser.JavaParser;
import com.soops.CEN4010.JMCA.JParser.Node;
import com.soops.CEN4010.JMCA.JParser.SimpleNode;
import java.io.PipedInputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Enumeration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.evosuite.runtime.util.SystemInUtil;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SimpleNode_ESTest extends SimpleNode_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(835);
      StringReader stringReader0 = new StringReader("RFJT%3lR;");
      JavaParser javaParser0 = new JavaParser(stringReader0);
      javaParser0.ClassOrInterfaceType();
      JJTJavaParserState jJTJavaParserState0 = javaParser0.jjtree;
      char[] charArray0 = new char[4];
      charArray0[0] = '^';
      charArray0[1] = ',';
      charArray0[2] = 'z';
      jJTJavaParserState0.rootNode();
      charArray0[3] = '=';
      // Undeclared exception!
      try { 
        stringReader0.read(charArray0, 835, 835);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(2550);
      simpleNode0.jjtGetParent();
      StringWriter stringWriter0 = new StringWriter(2550);
      simpleNode0.dump("*=#+?2", stringWriter0);
      // Undeclared exception!
      try { 
        simpleNode0.toString();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2550
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.toString("");
      simpleNode0.id = 1564;
      simpleNode0.jjtGetNumChildren();
      simpleNode0.setIdentifier("");
      simpleNode0.jjtClose();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      JavaParser javaParser0 = new JavaParser(pipedInputStream0);
      JJTJavaParserState jJTJavaParserState0 = javaParser0.jjtree;
      // Undeclared exception!
      try { 
        jJTJavaParserState0.rootNode();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int int0 = 0;
      SimpleNode simpleNode0 = new SimpleNode(0);
      Enumeration<PushbackInputStream> enumeration0 = (Enumeration<PushbackInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      JavaParser javaParser0 = new JavaParser(sequenceInputStream0);
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      simpleNode0.identifiers = arrayList0;
      simpleNode0.parser = javaParser0;
      simpleNode0.jjtGetParent();
      simpleNode0.jjtSetParent((Node) null);
      simpleNode0.jjtGetParent();
      simpleNode0.jjtClose();
      simpleNode0.jjtSetParent((Node) null);
      // Undeclared exception!
      try { 
        simpleNode0.jjtGetChild(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("");
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 0);
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      simpleNode0.identifiers = arrayList0;
      simpleNode0.toString();
      simpleNode0.jjtGetNumChildren();
      arrayList0.add("");
      simpleNode0.jjtAddChild(simpleNode0, 0);
      simpleNode0.jjtGetChild(0);
      simpleNode0.jjtGetNumChildren();
      simpleNode0.jjtGetChild(0);
      simpleNode0.jjtGetParent();
      simpleNode0.jjtGetNumChildren();
      String string0 = "Xtg*N.Y9M";
      StringWriter stringWriter0 = new StringWriter(0);
      StringWriter stringWriter1 = stringWriter0.append('@');
      simpleNode0.toString("");
      // Undeclared exception!
      try { 
        stringWriter1.append((CharSequence) "CompilationUnit : ", (-1546), 0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("");
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 0);
      simpleNode0.jjtGetParent();
      simpleNode0.id = 10;
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      simpleNode0.identifiers = arrayList0;
      simpleNode0.jjtOpen();
      simpleNode0.toString();
      simpleNode0.jjtGetNumChildren();
      arrayList0.add("");
      simpleNode0.jjtAddChild((Node) null, 10);
      int int0 = (-1908);
      // Undeclared exception!
      try { 
        simpleNode0.jjtAddChild((Node) null, (-1908));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1908
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.410116318288409
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int int0 = 27;
      SimpleNode simpleNode0 = new SimpleNode(27);
      Node[] nodeArray0 = new Node[4];
      nodeArray0[2] = (Node) simpleNode0;
      nodeArray0[3] = (Node) simpleNode0;
      simpleNode0.children = nodeArray0;
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        simpleNode0.dump("", stringWriter0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.0735428464085233
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(960);
      SimpleNode simpleNode1 = new SimpleNode(1);
      simpleNode1.jjtAddChild((Node) null, 1839);
      StringWriter stringWriter0 = new StringWriter();
      simpleNode1.dump("", stringWriter0);
      SimpleNode simpleNode2 = new SimpleNode(1839);
      // Undeclared exception!
      try { 
        simpleNode2.jjtGetChild(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.1595888143086257
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SystemInUtil.addInputLine("*rshft");
      SimpleNode simpleNode0 = new SimpleNode(27);
      simpleNode0.toString("");
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      JavaParser javaParser0 = new JavaParser(pipedInputStream0);
      SimpleNode simpleNode1 = new SimpleNode(javaParser0, 0);
      Node node0 = simpleNode1.parent;
      simpleNode1.jjtAddChild((Node) null, 27);
      simpleNode1.jjtAddChild(simpleNode0, 2183);
      StringWriter stringWriter0 = new StringWriter();
      simpleNode1.dump("", stringWriter0);
      simpleNode1.jjtAddChild(simpleNode0, 19);
      assertEquals(2184, simpleNode1.jjtGetNumChildren());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(27);
      String string0 = "";
      simpleNode0.setIdentifier("");
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = stringWriter0.append((CharSequence) "");
      int int0 = (-4139);
      SimpleNode simpleNode1 = new SimpleNode((-4139));
      simpleNode1.dump("i[Mns{$i-$+']$TQI", (Writer) null);
      simpleNode0.dump("", stringWriter1);
      String string1 = "v%s";
      // Undeclared exception!
      try { 
        simpleNode0.dump("", (Writer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.1595888143086257
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(27);
      simpleNode0.toString();
      simpleNode0.jjtAddChild((Node) null, 1);
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("Initializer", stringWriter0);
      StringWriter stringWriter1 = new StringWriter();
      simpleNode0.dump("Initializer", stringWriter0);
      SimpleNode simpleNode1 = new SimpleNode(1);
      simpleNode1.setIdentifier("}");
      simpleNode1.dump("_+=6g4l-:H?", stringWriter1);
      simpleNode1.dump("Qz", stringWriter0);
      simpleNode1.dump("c57I>|S.t", stringWriter0);
      simpleNode0.dump("Qz", stringWriter0);
      assertEquals(2, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.8855741515766717
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(27);
      simpleNode0.toString();
      simpleNode0.setIdentifier("U,t@");
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = stringWriter0.append((CharSequence) "Initializer");
      SimpleNode simpleNode1 = new SimpleNode(27);
      simpleNode0.dump("2bmnR", stringWriter0);
      simpleNode0.dump(";9VsFIiE2A,", stringWriter0);
      simpleNode1.dump("{", stringWriter1);
      StringWriter stringWriter2 = new StringWriter(99);
      StringBuffer stringBuffer0 = new StringBuffer(27);
      StringBuffer stringBuffer1 = new StringBuffer();
      StringWriter stringWriter3 = stringWriter2.append((CharSequence) stringBuffer1);
      simpleNode0.dump("AllocationExpression", stringWriter3);
      stringBuffer1.append("<=");
      SimpleNode simpleNode2 = new SimpleNode(27);
      simpleNode0.dump("<=", stringWriter3);
      simpleNode1.dump("Z288g!1yFd:Z.", stringWriter2);
      simpleNode1.setIdentifier("{");
      simpleNode0.dump("&j(2u;xlreggd`lm", stringWriter3);
      simpleNode0.dump("AllocationExpression", stringWriter1);
      assertEquals("Initializer<Initializer>\n  <identifier>U,t@</identifier>\n</Initializer>\n<Initializer>\n  <identifier>U,t@</identifier>\n</Initializer>\n<Initializer>\n  <identifier>U,t@</identifier>\n</Initializer>\n", stringWriter1.toString());
      
      StringWriter stringWriter4 = stringWriter3.append('/');
      simpleNode1.dump("<=", stringWriter4);
      assertEquals("<Initializer>\n  <identifier>U,t@</identifier>\n</Initializer>\n<Initializer>\n  <identifier>U,t@</identifier>\n</Initializer>\n<Initializer>\n  <identifier>U,t@</identifier>\n</Initializer>\n/<Initializer>\n</Initializer>\n", stringWriter4.toString());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.8734641445321513
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(27);
      simpleNode0.toString();
      int int0 = 1;
      simpleNode0.jjtAddChild((Node) null, 1);
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("Initializer", stringWriter0);
      StringWriter stringWriter1 = new StringWriter();
      simpleNode0.dump("Initializer", stringWriter0);
      StringWriter stringWriter2 = new StringWriter(1);
      simpleNode0.setIdentifier("&&");
      String string0 = "AllocaBionExpression";
      simpleNode0.dump("AllocaBionExpression", stringWriter1);
      JavaParser javaParser0 = null;
      SimpleNode simpleNode1 = null;
      try {
        simpleNode1 = new SimpleNode((JavaParser) null, (-1089767820));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.6885673693022826
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(47);
      simpleNode0.toString();
      StringWriter stringWriter0 = new StringWriter();
      SystemInUtil.addInputLine("<<");
      simpleNode0.setIdentifier("<<");
      simpleNode0.dump("<<", stringWriter0);
      simpleNode0.dump("D#gs0hR;", stringWriter0);
      simpleNode0.dump("D#gs0hR;", stringWriter0);
      simpleNode0.dump(">=", stringWriter0);
      assertEquals("<InstanceOfExpression>\n  <identifier>*lshft</identifier>\n</InstanceOfExpression>\n<InstanceOfExpression>\n  <identifier>*lshft</identifier>\n</InstanceOfExpression>\n<InstanceOfExpression>\n  <identifier>*lshft</identifier>\n</InstanceOfExpression>\n<InstanceOfExpression>\n  <identifier>*lshft</identifier>\n</InstanceOfExpression>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.1537419427010902
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      int int0 = 27;
      SimpleNode simpleNode0 = new SimpleNode(27);
      simpleNode0.toString();
      Node[] nodeArray0 = new Node[0];
      simpleNode0.children = nodeArray0;
      Writer writer0 = null;
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump(">=", stringWriter0);
      String string0 = "D#gs0hR;";
      simpleNode0.dump("Initializer", (Writer) null);
      simpleNode0.dump(">=", (Writer) null);
      StringWriter stringWriter1 = stringWriter0.append((CharSequence) ">=");
      simpleNode0.dump(">=", stringWriter1);
      simpleNode0.dump("D#gs0hR;", stringWriter0);
      simpleNode0.dump(">", (Writer) null);
      simpleNode0.dump(">=", (Writer) null);
      simpleNode0.dump("D#gs0hR;", (Writer) null);
      String string1 = "CompilationUnit";
      simpleNode0.setIdentifier("CompilationUnit");
      // Undeclared exception!
      try { 
        simpleNode0.dump("CompilationUnit", (Writer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.5875009311062074
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(47);
      simpleNode0.toString();
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("#n0G1[Ev0E-Nx*>?", stringWriter0);
      simpleNode0.dump("YNxeZ~t=?7t{M`P", stringWriter0);
      simpleNode0.dump("#n0G1[Ev0E-Nx*>?", stringWriter0);
      simpleNode0.dump("InstanceOfExpression", stringWriter0);
      String string0 = "*lshft";
      simpleNode0.dump("*lshft", stringWriter0);
      simpleNode0.setIdentifier(">");
      simpleNode0.dump("#n0G1[Ev0E-Nx*>?", stringWriter0);
      char[] charArray0 = new char[7];
      charArray0[0] = 'e';
      simpleNode0.setIdentifier("<=");
      simpleNode0.dump("InstanceOfExpression", stringWriter0);
      StringWriter stringWriter1 = stringWriter0.append('e');
      // Undeclared exception!
      try { 
        stringWriter1.append((CharSequence) "*lshft", (-2139), (-1968570227));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.7937300551584248
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(47);
      simpleNode0.toString();
      StringWriter stringWriter0 = new StringWriter();
      SystemInUtil.addInputLine("<");
      simpleNode0.setIdentifier("<");
      simpleNode0.dump("<", stringWriter0);
      simpleNode0.dump("<", stringWriter0);
      simpleNode0.dump("<", stringWriter0);
      simpleNode0.dump("InstanceOfExpression", stringWriter0);
      simpleNode0.dump("<", stringWriter0);
      assertEquals("<InstanceOfExpression>\n  <identifier>*lt</identifier>\n</InstanceOfExpression>\n<InstanceOfExpression>\n  <identifier>*lt</identifier>\n</InstanceOfExpression>\n<InstanceOfExpression>\n  <identifier>*lt</identifier>\n</InstanceOfExpression>\n<InstanceOfExpression>\n  <identifier>*lt</identifier>\n</InstanceOfExpression>\n<InstanceOfExpression>\n  <identifier>*lt</identifier>\n</InstanceOfExpression>\n", stringWriter0.toString());
  }
}
