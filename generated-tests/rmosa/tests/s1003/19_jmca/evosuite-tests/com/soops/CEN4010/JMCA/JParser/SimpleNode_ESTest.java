/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 06:05:40 GMT 2018
 */

package com.soops.CEN4010.JMCA.JParser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.soops.CEN4010.JMCA.JParser.JJTJavaParserState;
import com.soops.CEN4010.JMCA.JParser.JavaCharStream;
import com.soops.CEN4010.JMCA.JParser.JavaParser;
import com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager;
import com.soops.CEN4010.JMCA.JParser.Node;
import com.soops.CEN4010.JMCA.JParser.SimpleNode;
import java.io.PipedInputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.EmptyStackException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SimpleNode_ESTest extends SimpleNode_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.410116318288409
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int int0 = 27;
      SimpleNode simpleNode0 = new SimpleNode(27);
      Node[] nodeArray0 = new Node[4];
      nodeArray0[0] = (Node) simpleNode0;
      nodeArray0[1] = (Node) simpleNode0;
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "69Tv?ga'nUvq>>");
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
  //Test case number: 1
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(18);
      // Undeclared exception!
      try { 
        simpleNode0.jjtGetChild(18);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.537368801781397
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(40);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      simpleNode0.setIdentifier("\"\n\"");
      JavaParser javaParser0 = new JavaParser("\"\n\"");
      Node node0 = javaParser0.currNode;
      SimpleNode simpleNode1 = new SimpleNode(javaParser0, 0);
      simpleNode1.jjtAddChild((Node) null, 40);
      StringWriter stringWriter0 = new StringWriter(0);
      StringWriter stringWriter1 = new StringWriter();
      simpleNode0.dump("aO4.qxjHky", stringWriter0);
      simpleNode1.dump("}", stringWriter1);
      assertEquals(41, simpleNode1.jjtGetNumChildren());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.355712859746894
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(47);
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      simpleNode0.identifiers = arrayList0;
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      simpleNode0.setIdentifier("$");
      JavaParser javaParser0 = new JavaParser("$");
      arrayList0.add("$");
      arrayList0.add("$");
      StringWriter stringWriter0 = new StringWriter(905);
      simpleNode0.dump("$", stringWriter0);
      simpleNode0.dump("$", stringWriter0);
      stringWriter0.flush();
      simpleNode0.id = 18;
      String string0 = "";
      simpleNode0.dump("", stringWriter0);
      StringWriter stringWriter1 = null;
      try {
        stringWriter1 = new StringWriter((-2021261220));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative buffer size
         //
         verifyException("java.io.StringWriter", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = 0;
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.jjtOpen();
      JJTJavaParserState jJTJavaParserState0 = new JJTJavaParserState();
      // Undeclared exception!
      try { 
        jJTJavaParserState0.popNode();
        fail("Expecting exception: EmptyStackException");
      
      } catch(EmptyStackException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Stack", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.7668382315802122
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(27);
      Node[] nodeArray0 = new Node[4];
      nodeArray0[0] = (Node) simpleNode0;
      nodeArray0[1] = (Node) simpleNode0;
      nodeArray0[2] = (Node) simpleNode0;
      nodeArray0[3] = (Node) simpleNode0;
      simpleNode0.children = nodeArray0;
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.setIdentifier("VariableDeclaratorId");
      simpleNode0.jjtClose();
      simpleNode0.toString();
      StringWriter stringWriter1 = stringWriter0.append((CharSequence) null);
      char[] charArray0 = new char[8];
      charArray0[0] = 'K';
      charArray0[1] = '+';
      charArray0[2] = '';
      charArray0[3] = '-';
      charArray0[4] = '/';
      charArray0[5] = 'M';
      charArray0[6] = '\\';
      charArray0[7] = '}';
      stringWriter1.write(charArray0);
      // Undeclared exception!
      try { 
        simpleNode0.dump((String) null, stringWriter1);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(98);
      FileSystemHandling.shouldAllThrowIOExceptions();
      String string0 = "X_K6sI";
      StringWriter stringWriter0 = new StringWriter();
      char[] charArray0 = new char[2];
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, false, true);
      charArray0[0] = 'X';
      Node[] nodeArray0 = new Node[9];
      nodeArray0[0] = (Node) simpleNode0;
      nodeArray0[1] = (Node) simpleNode0;
      simpleNode0.jjtGetParent();
      nodeArray0[2] = null;
      nodeArray0[3] = (Node) simpleNode0;
      nodeArray0[4] = (Node) simpleNode0;
      nodeArray0[5] = (Node) simpleNode0;
      nodeArray0[6] = (Node) simpleNode0;
      nodeArray0[7] = (Node) simpleNode0;
      nodeArray0[8] = (Node) simpleNode0;
      simpleNode0.children = nodeArray0;
      charArray0[1] = '_';
      stringWriter0.write("X_K6sI");
      // Undeclared exception!
      try { 
        stringWriter0.write(charArray0, 98, (-1));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringWriter", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.5660857389596289
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(39);
      JavaParser javaParser0 = new JavaParser("~%7");
      StringWriter stringWriter0 = new StringWriter(39);
      simpleNode0.dump("<!;`;_x?S0qkq.", stringWriter0);
      Node node0 = javaParser0.currNode;
      simpleNode0.jjtAddChild((Node) null, 0);
      StringWriter stringWriter1 = new StringWriter();
      StringWriter stringWriter2 = new StringWriter();
      simpleNode0.dump("", stringWriter2);
      simpleNode0.dump("", stringWriter2);
      assertEquals(1, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(324);
      String string0 = "wQ's\"Ykz\"RQ`zCbXe";
      Node node0 = simpleNode0.parent;
      simpleNode0.jjtSetParent((Node) null);
      StringWriter stringWriter0 = new StringWriter();
      stringWriter0.append((CharSequence) "wQ's\"Ykz\"RQ`zCbXe");
      char[] charArray0 = new char[0];
      int int0 = (-336760122);
      // Undeclared exception!
      try { 
        stringWriter0.write(charArray0, 9, (-336760122));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringWriter", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.5305096302300272
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(43);
      Node[] nodeArray0 = new Node[4];
      nodeArray0[0] = (Node) simpleNode0;
      nodeArray0[1] = (Node) simpleNode0;
      nodeArray0[2] = (Node) simpleNode0;
      nodeArray0[3] = (Node) simpleNode0;
      simpleNode0.children = nodeArray0;
      String string0 = "ny<:8O";
      simpleNode0.setIdentifier("ny<:8O");
      simpleNode0.jjtGetNumChildren();
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = stringWriter0.append((CharSequence) null);
      StringWriter stringWriter2 = stringWriter1.append('2');
      // Undeclared exception!
      try { 
        simpleNode0.dump((String) null, stringWriter2);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.7031315809655685
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(47);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      simpleNode0.setIdentifier("\"\n\"");
      simpleNode0.toString("\"\n\"");
      JavaParser javaParser0 = new JavaParser("\"\n\"");
      StringWriter stringWriter0 = new StringWriter();
      stringWriter0.close();
      StringWriter stringWriter1 = new StringWriter(47);
      StringWriter stringWriter2 = new StringWriter();
      simpleNode0.dump("ur-m<-r%/L:MovMQ+[", stringWriter0);
      simpleNode0.dump("*rshft", stringWriter2);
      // Undeclared exception!
      try { 
        simpleNode0.dump("7Hu8<[~ |,x~b|p", (Writer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.6204696872989239
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(3);
      simpleNode0.setIdentifier(")");
      simpleNode0.setIdentifier(")");
      simpleNode0.setIdentifier("");
      simpleNode0.jjtGetNumChildren();
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, ")");
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = new StringBuffer();
      SimpleNode simpleNode1 = new SimpleNode(0);
      SimpleNode simpleNode2 = new SimpleNode(3);
      simpleNode2.jjtAddChild(simpleNode1, 41);
      StringWriter stringWriter1 = new StringWriter();
      StringWriter stringWriter2 = new StringWriter();
      StringWriter stringWriter3 = new StringWriter(3);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile(")");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "");
      simpleNode0.dump("", stringWriter0);
      simpleNode1.dump("", stringWriter0);
      StringWriter stringWriter4 = new StringWriter();
      simpleNode2.jjtAddChild(simpleNode1, 10);
      simpleNode1.dump("x:_dBcaRB\u0007'", stringWriter4);
      JavaParser javaParser0 = new JavaParser("InclusiveOrExpression");
      simpleNode2.dump("<identifier>Literal Value</identifier>\n", stringWriter3);
      simpleNode0.dump("KB-om>33F,3UtZ]*w", stringWriter1);
      assertEquals("<Modifiers>\n  <identifier>)</identifier>\n  <identifier>)</identifier>\n</Modifiers>\n", stringWriter1.toString());
      
      simpleNode1.dump("k<$kjry9fRCsGG=z7a9", stringWriter4);
      assertEquals(0, simpleNode1.jjtGetNumChildren());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(43);
      Node[] nodeArray0 = new Node[4];
      nodeArray0[0] = (Node) simpleNode0;
      nodeArray0[1] = (Node) simpleNode0;
      nodeArray0[2] = (Node) simpleNode0;
      nodeArray0[3] = (Node) simpleNode0;
      simpleNode0.children = nodeArray0;
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.jjtAddChild(nodeArray0[2], 43);
      assertEquals(44, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(22);
      simpleNode0.setIdentifier(">>");
      StringWriter stringWriter0 = new StringWriter();
      stringWriter0.write(">>");
      simpleNode0.dump(">>", stringWriter0);
      simpleNode0.dump("*rshft", stringWriter0);
      assertEquals(">><MethodDeclarator>\n  <identifier>*rshft</identifier>\n</MethodDeclarator>\n<MethodDeclarator>\n  <identifier>*rshft</identifier>\n</MethodDeclarator>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.5140966973399504
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(47);
      String string0 = ")";
      simpleNode0.setIdentifier(")");
      simpleNode0.setIdentifier(">");
      simpleNode0.jjtGetNumChildren();
      StringWriter stringWriter0 = new StringWriter();
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) ")");
      StringWriter stringWriter1 = new StringWriter();
      StringWriter stringWriter2 = stringWriter1.append((CharSequence) ")");
      char[] charArray0 = new char[8];
      charArray0[0] = 'e';
      charArray0[1] = 'e';
      charArray0[2] = 'e';
      charArray0[3] = 'e';
      charArray0[4] = 'e';
      charArray0[5] = 'e';
      charArray0[6] = 'e';
      charArray0[7] = 'e';
      Node[] nodeArray0 = new Node[1];
      nodeArray0[0] = (Node) simpleNode0;
      simpleNode0.children = nodeArray0;
      CharBuffer.wrap(charArray0);
      charBuffer0.slice();
      charBuffer0.asReadOnlyBuffer();
      StringWriter stringWriter3 = stringWriter2.append((CharSequence) charBuffer0);
      stringWriter3.write("(", 0, 0);
      stringWriter0.append('e');
      stringWriter3.append('e');
      // Undeclared exception!
      try { 
        simpleNode0.dump(")", stringWriter2);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(27);
      simpleNode0.setIdentifier("</identifier>");
      simpleNode0.setIdentifier(";");
      simpleNode0.jjtGetNumChildren();
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = new StringWriter();
      stringWriter1.append((CharSequence) ";");
      StringWriter stringWriter2 = new StringWriter(0);
      StringWriter stringWriter3 = stringWriter0.append((CharSequence) ";");
      StringWriter stringWriter4 = stringWriter2.append((CharSequence) "_c||");
      StringWriter stringWriter5 = new StringWriter();
      stringWriter0.append('T');
      simpleNode0.dump(";", stringWriter4);
      simpleNode0.dump(";", stringWriter3);
      assertEquals(";T<Initializer>\n  <identifier></identifier></identifier>\n</Initializer>\n", stringWriter3.toString());
      assertEquals(";T<Initializer>\n  <identifier></identifier></identifier>\n</Initializer>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.5305096302300272
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(27);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      simpleNode0.setIdentifier("}");
      simpleNode0.setIdentifier(">");
      simpleNode0.jjtGetNumChildren();
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = stringWriter0.append((CharSequence) "}");
      stringWriter1.append((CharSequence) "xLP!6ZmCFX%0z#q/um");
      stringWriter0.append('C');
      simpleNode0.dump(">", stringWriter1);
      assertEquals("}xLP!6ZmCFX%0z#q/umC<Initializer>\n  <identifier>*gt</identifier>\n</Initializer>\n", stringWriter1.toString());
      assertEquals("}xLP!6ZmCFX%0z#q/umC<Initializer>\n  <identifier>*gt</identifier>\n</Initializer>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(47);
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      simpleNode0.identifiers = arrayList0;
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      JavaParser javaParser0 = new JavaParser("$");
      arrayList0.add("$");
      simpleNode0.id = 47;
      StringWriter stringWriter0 = new StringWriter(905);
      simpleNode0.dump("$", stringWriter0);
      arrayList0.add("$");
      simpleNode0.dump("$", stringWriter0);
      arrayList0.add("{");
      stringWriter0.flush();
      simpleNode0.id = 18;
      String string0 = "R";
      simpleNode0.dump("R", stringWriter0);
      StringWriter stringWriter1 = null;
      try {
        stringWriter1 = new StringWriter((-2021261220));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative buffer size
         //
         verifyException("java.io.StringWriter", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(47);
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      JavaParser javaParser0 = new JavaParser("PackageDeclaration");
      arrayList0.add("<<");
      StringReader stringReader0 = new StringReader("i)");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      StringWriter stringWriter0 = new StringWriter(47);
      simpleNode0.dump("PackageDeclaration", stringWriter0);
      StringWriter stringWriter1 = new StringWriter(47);
      simpleNode0.dump("I.oz@4+y~=eD|~", stringWriter0);
      simpleNode0.dump(")", stringWriter0);
      simpleNode0.dump("M|v?J", stringWriter0);
      simpleNode0.dump((String) null, stringWriter0);
      assertEquals("<InstanceOfExpression>\n  <identifier>*lshft</identifier>\n</InstanceOfExpression>\n<InstanceOfExpression>\n  <identifier>*lshft</identifier>\n</InstanceOfExpression>\n<InstanceOfExpression>\n  <identifier>*lshft</identifier>\n</InstanceOfExpression>\n<InstanceOfExpression>\n  <identifier>*lshft</identifier>\n</InstanceOfExpression>\n<InstanceOfExpression>\n  <identifier>*lshft</identifier>\n</InstanceOfExpression>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(58);
      ArrayList<String> arrayList0 = new ArrayList<String>();
      simpleNode0.identifiers = arrayList0;
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      String string0 = "<=";
      simpleNode0.identifiers.add("<=");
      StringWriter stringWriter0 = new StringWriter(1);
      simpleNode0.dump("N?FkRfh+(t", stringWriter0);
      simpleNode0.dump("<=", stringWriter0);
      simpleNode0.dump("<=", stringWriter0);
      SimpleNode simpleNode1 = new SimpleNode(18);
      SimpleNode simpleNode2 = new SimpleNode(10);
      simpleNode2.dump("WN[Fhg^IBiiPj}Vm@", stringWriter0);
      simpleNode2.dump("<=", stringWriter0);
      SimpleNode simpleNode3 = new SimpleNode(1);
      PipedInputStream pipedInputStream0 = new PipedInputStream(1);
      JavaCharStream javaCharStream0 = new JavaCharStream(pipedInputStream0);
      JavaParserTokenManager javaParserTokenManager0 = null;
      try {
        javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0, 10);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 10. State unchanged.
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(47);
      simpleNode0.setIdentifier("&&");
      JavaParser javaParser0 = new JavaParser("w9");
      StringWriter stringWriter0 = new StringWriter(47);
      StringWriter stringWriter1 = new StringWriter();
      stringWriter1.flush();
      simpleNode0.dump("w9", stringWriter1);
      assertEquals("<InstanceOfExpression>\n  <identifier>*amp</identifier>\n</InstanceOfExpression>\n", stringWriter1.toString());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(22);
      simpleNode0.setIdentifier("<");
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = new StringBuffer();
      StringWriter stringWriter1 = stringWriter0.append((CharSequence) stringBuffer0);
      stringWriter1.append('*');
      simpleNode0.dump("ox", stringWriter1);
      assertEquals("*<MethodDeclarator>\n  <identifier>*lt</identifier>\n</MethodDeclarator>\n", stringWriter1.toString());
      assertEquals("*<MethodDeclarator>\n  <identifier>*lt</identifier>\n</MethodDeclarator>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(43);
      simpleNode0.setIdentifier(")");
      simpleNode0.setIdentifier(">=");
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = new StringWriter();
      simpleNode0.dump(")", stringWriter0);
      simpleNode0.dump(")", stringWriter0);
      assertEquals("<InclusiveOrExpression>\n  <identifier>)</identifier>\n  <identifier>*ge</identifier>\n</InclusiveOrExpression>\n<InclusiveOrExpression>\n  <identifier>)</identifier>\n  <identifier>*ge</identifier>\n</InclusiveOrExpression>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((-512));
      StringWriter stringWriter0 = new StringWriter(0);
      Node[] nodeArray0 = new Node[0];
      simpleNode0.children = nodeArray0;
      simpleNode0.dump((String) null, stringWriter0);
      simpleNode0.dump(" Z`<A", stringWriter0);
      simpleNode0.dump((String) null, stringWriter0);
      assertEquals("", stringWriter0.toString());
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(47);
      simpleNode0.setIdentifier("&");
      JavaParser javaParser0 = new JavaParser("w9");
      StringWriter stringWriter0 = new StringWriter(47);
      StringWriter stringWriter1 = new StringWriter();
      stringWriter1.flush();
      simpleNode0.dump("w9", stringWriter1);
      assertEquals("<InstanceOfExpression>\n  <identifier>*amp</identifier>\n</InstanceOfExpression>\n", stringWriter1.toString());
  }
}