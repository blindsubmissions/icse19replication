/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 12:21:17 GMT 2018
 */

package com.soops.CEN4010.JMCA.JParser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.soops.CEN4010.JMCA.JParser.JavaCharStream;
import com.soops.CEN4010.JMCA.JParser.JavaParser;
import com.soops.CEN4010.JMCA.JParser.Node;
import com.soops.CEN4010.JMCA.JParser.SimpleNode;
import java.io.PipedInputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SimpleNode_ESTest extends SimpleNode_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int int0 = 0;
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.jjtSetParent((Node) null);
      StringWriter stringWriter0 = new StringWriter();
      SimpleNode simpleNode1 = new SimpleNode(2);
      StringWriter stringWriter1 = null;
      try {
        stringWriter1 = new StringWriter((-2671));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative buffer size
         //
         verifyException("java.io.StringWriter", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.5481178804418445
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.setIdentifier("9");
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = new StringWriter('x');
      stringWriter1.write((String) null);
      stringWriter1.write("DCm|)k$[");
      StringWriter stringWriter2 = new StringWriter(0);
      stringWriter2.flush();
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      stringWriter0.append('x');
      char[] charArray0 = new char[8];
      charArray0[1] = '\u0000';
      charArray0[2] = 'R';
      stringWriter0.append((CharSequence) "9", 0, 0);
      charArray0[3] = 'x';
      stringWriter1.close();
      stringWriter0.close();
      String string0 = " ";
      simpleNode0.setIdentifier(" ");
      simpleNode0.dump("DCm|)k$[", stringWriter0);
      int int0 = (-1);
      // Undeclared exception!
      try { 
        simpleNode0.jjtGetChild((-764));
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
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      stringReader0.skip((-2204L));
      stringReader0.reset();
      JavaParser javaParser0 = new JavaParser("");
      JavaParser javaParser1 = new JavaParser("");
      SimpleNode simpleNode0 = new SimpleNode(javaParser1, 84);
      Node node0 = simpleNode0.parent;
      StringReader stringReader1 = new StringReader("Q=zSxB/RTq");
      simpleNode0.setIdentifier("");
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = new StringWriter(84);
      SimpleNode simpleNode1 = new SimpleNode(84);
      simpleNode1.dump("", stringWriter0);
      stringWriter0.close();
      SimpleNode simpleNode2 = new SimpleNode(84);
      simpleNode0.dump("{!9", stringWriter0);
      simpleNode1.dump("1", stringWriter1);
      simpleNode1.dump("Ti J<mUt^Rv", stringWriter0);
      Node[] nodeArray0 = new Node[0];
      simpleNode1.children = nodeArray0;
      simpleNode1.dump("hSQ|y}K%|44YwK", stringWriter1);
      simpleNode0.dump("{!9", stringWriter0);
      assertEquals("<ForInit>\n</ForInit>\n<ForInit>\n</ForInit>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.3805062184775959
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(84);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      StringWriter stringWriter0 = new StringWriter(2045);
      stringWriter0.close();
      String string0 = "do";
      stringWriter0.write("do");
      simpleNode0.setIdentifier("do");
      stringWriter0.close();
      String string1 = "{!9";
      simpleNode0.setIdentifier("{!9");
      simpleNode0.dump("{!9", stringWriter0);
      Node[] nodeArray0 = new Node[4];
      nodeArray0[0] = (Node) simpleNode0;
      nodeArray0[1] = (Node) simpleNode0;
      nodeArray0[2] = (Node) simpleNode0;
      nodeArray0[3] = (Node) simpleNode0;
      simpleNode0.children = nodeArray0;
      stringWriter0.close();
      simpleNode0.setIdentifier("do");
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      // Undeclared exception!
      try { 
        simpleNode0.dump((String) null, stringWriter0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.7566199756619738
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(47);
      simpleNode0.jjtOpen();
      String string0 = "";
      StringWriter stringWriter0 = new StringWriter(47);
      StringWriter stringWriter1 = stringWriter0.append('b');
      stringWriter0.close();
      simpleNode0.setIdentifier("_d=tm");
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "_d=tm");
      SimpleNode simpleNode1 = new SimpleNode(47);
      simpleNode1.jjtGetParent();
      simpleNode0.jjtAddChild((Node) null, 47);
      stringWriter0.write(47);
      simpleNode0.dump("", stringWriter0);
      stringWriter0.close();
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "WhileStatement");
      stringWriter0.close();
      SimpleNode simpleNode2 = new SimpleNode(86);
      simpleNode2.setIdentifier((String) null);
      PipedInputStream pipedInputStream0 = new PipedInputStream(47);
      SimpleNode simpleNode3 = new SimpleNode(10);
      String string1 = "/ui";
      simpleNode3.dump("/ui", stringWriter1);
      simpleNode3.dump((String) null, stringWriter0);
      // Undeclared exception!
      try { 
        simpleNode2.dump((String) null, stringWriter1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.jjtAddChild((Node) null, 0);
      StringWriter stringWriter0 = new StringWriter(22);
      StringWriter stringWriter1 = stringWriter0.append('.');
      simpleNode0.dump("G&xJ-Dl'j26", stringWriter1);
      StringWriter stringWriter2 = new StringWriter(2071);
      assertFalse(stringWriter2.equals((Object)stringWriter0));
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.5481178804418445
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = "";
      StringReader stringReader0 = new StringReader("");
      stringReader0.skip((-726L));
      stringReader0.reset();
      JavaParser javaParser0 = new JavaParser(stringReader0);
      SimpleNode simpleNode0 = new SimpleNode(84);
      int int0 = 2045;
      StringWriter stringWriter0 = new StringWriter(2045);
      stringWriter0.close();
      String string1 = "";
      StringWriter stringWriter1 = new StringWriter(2045);
      String string2 = "\"/\"";
      simpleNode0.setIdentifier("\"/\"");
      simpleNode0.toString();
      simpleNode0.dump("mFdb}oXsR6x :]p{>L", stringWriter1);
      // Undeclared exception!
      try { 
        stringWriter1.append((CharSequence) "", 84, 2045);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(15);
      StringWriter stringWriter0 = new StringWriter();
      stringWriter0.append('@');
      simpleNode0.setIdentifier("1rm");
      String string0 = simpleNode0.toString("");
      assertEquals("ClassOrInterfaceBodyDeclaration : 1rm", string0);
      
      int int0 = simpleNode0.jjtGetNumChildren();
      assertEquals(0, int0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.5481178804418445
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringReader stringReader0 = new StringReader("TSKJ8s)");
      JavaParser javaParser0 = new JavaParser(stringReader0);
      stringReader0.markSupported();
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 0);
      simpleNode0.setIdentifier("9");
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = new StringWriter(0);
      stringWriter1.flush();
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      stringWriter0.append('h');
      char[] charArray0 = new char[8];
      charArray0[2] = 'R';
      StringWriter stringWriter2 = stringWriter0.append((CharSequence) "9", 0, 0);
      stringWriter0.close();
      String string0 = " ";
      simpleNode0.setIdentifier(" ");
      simpleNode0.dump("9", stringWriter2);
      simpleNode0.dump("DCm|)k$[", stringWriter0);
      StringWriter stringWriter3 = null;
      try {
        stringWriter3 = new StringWriter((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative buffer size
         //
         verifyException("java.io.StringWriter", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(2045);
      stringWriter0.close();
      SimpleNode simpleNode0 = new SimpleNode((-287));
      simpleNode0.jjtClose();
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      int int0 = (-1909106111);
      SimpleNode simpleNode0 = new SimpleNode((-1909106111));
      Node[] nodeArray0 = new Node[15];
      nodeArray0[1] = (Node) simpleNode0;
      simpleNode0.children = nodeArray0;
      String string0 = "#ggOTdJ5|kJ:Ix";
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      simpleNode0.id = 0;
      StringWriter stringWriter0 = new StringWriter();
      char char0 = 'g';
      StringWriter stringWriter1 = stringWriter0.append('g');
      StringWriter stringWriter2 = stringWriter1.append((CharSequence) "#ggOTdJ5|kJ:Ix", 0, 0);
      // Undeclared exception!
      try { 
        simpleNode0.dump("#ggOTdJ5|kJ:Ix", stringWriter2);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int int0 = 0;
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.jjtAddChild(simpleNode0, 0);
      // Undeclared exception!
      try { 
        simpleNode0.jjtAddChild(simpleNode0, (-1910504870));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1910504870
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\"");
      stringReader0.skip((-726L));
      stringReader0.reset();
      JavaParser javaParser0 = new JavaParser(stringReader0);
      SimpleNode simpleNode0 = new SimpleNode(84);
      StringWriter stringWriter0 = new StringWriter(2045);
      stringWriter0.close();
      StringWriter stringWriter1 = new StringWriter(2045);
      SimpleNode simpleNode1 = new SimpleNode(14);
      simpleNode0.setIdentifier("*amp");
      PipedInputStream pipedInputStream0 = new PipedInputStream(84);
      simpleNode1.setIdentifier("E");
      simpleNode0.dump("PreIncrementExpression", stringWriter1);
      stringWriter1.write("*amp");
      SimpleNode simpleNode2 = new SimpleNode(0);
      simpleNode2.jjtAddChild(simpleNode1, 0);
      simpleNode2.jjtAddChild(simpleNode1, 1);
      stringWriter1.close();
      simpleNode0.dump("z.e?", stringWriter0);
      StringWriter stringWriter2 = new StringWriter();
      simpleNode1.dump("MLjB=mSu", stringWriter2);
      simpleNode0.dump("E", stringWriter1);
      simpleNode2.dump("L#0", stringWriter1);
      assertEquals("<ForInit>\n  <identifier>*amp</identifier>\n</ForInit>\n*amp<ForInit>\n  <identifier>*amp</identifier>\n</ForInit>\n<CompilationUnit><ClassOrInterfaceBody>\n  <identifier>E</identifier>\n</ClassOrInterfaceBody>\n<ClassOrInterfaceBody>\n  <identifier>E</identifier>\n</ClassOrInterfaceBody>\n</CompilationUnit>\n", stringWriter1.toString());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.36764947740014225
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JavaParser javaParser0 = new JavaParser(stringReader0);
      SimpleNode simpleNode0 = new SimpleNode(86);
      StringWriter stringWriter0 = new StringWriter(2045);
      simpleNode0.setIdentifier("");
      simpleNode0.dump("q", stringWriter0);
      stringWriter0.close();
      stringWriter0.close();
      simpleNode0.setIdentifier("q");
      simpleNode0.dump("", stringWriter0);
      simpleNode0.dump("", stringWriter0);
      assertEquals("<ForUpdate>\n</ForUpdate>\n<ForUpdate>\n  <identifier>q</identifier>\n</ForUpdate>\n<ForUpdate>\n  <identifier>q</identifier>\n</ForUpdate>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(84);
      simpleNode0.setIdentifier("<<");
      StringWriter stringWriter0 = new StringWriter();
      stringWriter0.close();
      simpleNode0.setIdentifier(">");
      simpleNode0.dump("}", stringWriter0);
      stringWriter0.close();
      FileSystemHandling.shouldAllThrowIOExceptions();
      simpleNode0.dump("}", stringWriter0);
      SimpleNode simpleNode1 = new SimpleNode(84);
      simpleNode1.dump("Z6S^Zz", stringWriter0);
      simpleNode1.setIdentifier("9");
      simpleNode1.dump(".zKo5]-5ck", stringWriter0);
      SimpleNode simpleNode2 = new SimpleNode(2147483645);
      assertFalse(simpleNode2.equals((Object)simpleNode0));
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(84);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      StringWriter stringWriter0 = new StringWriter(2045);
      stringWriter0.close();
      simpleNode0.setIdentifier("do");
      stringWriter0.close();
      simpleNode0.setIdentifier("{!9");
      simpleNode0.dump("{!9", stringWriter0);
      simpleNode0.setIdentifier("do");
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      simpleNode0.dump((String) null, stringWriter0);
      simpleNode0.setIdentifier("<=");
      simpleNode0.dump("{!9", stringWriter0);
      simpleNode0.dump("{!9", stringWriter0);
      simpleNode0.dump("vGO,xO", stringWriter0);
      simpleNode0.dump((String) null, stringWriter0);
      assertEquals("<ForInit>\n  <identifier>do</identifier>\n  <identifier>{!9</identifier>\n</ForInit>\n<ForInit>\n  <identifier>do</identifier>\n  <identifier>{!9</identifier>\n  <identifier>do</identifier>\n</ForInit>\n<ForInit>\n  <identifier>do</identifier>\n  <identifier>{!9</identifier>\n  <identifier>do</identifier>\n  <identifier>*le</identifier>\n</ForInit>\n<ForInit>\n  <identifier>do</identifier>\n  <identifier>{!9</identifier>\n  <identifier>do</identifier>\n  <identifier>*le</identifier>\n</ForInit>\n<ForInit>\n  <identifier>do</identifier>\n  <identifier>{!9</identifier>\n  <identifier>do</identifier>\n  <identifier>*le</identifier>\n</ForInit>\n<ForInit>\n  <identifier>do</identifier>\n  <identifier>{!9</identifier>\n  <identifier>do</identifier>\n  <identifier>*le</identifier>\n</ForInit>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(47);
      StringWriter stringWriter0 = new StringWriter(47);
      StringWriter stringWriter1 = stringWriter0.append('b');
      simpleNode0.setIdentifier("_d=tm");
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      stringWriter0.write(47);
      StringWriter stringWriter2 = stringWriter1.append('H');
      stringWriter0.close();
      simpleNode0.setIdentifier("_d=tm");
      simpleNode0.dump("", stringWriter1);
      stringWriter0.close();
      simpleNode0.setIdentifier("_d=tm");
      StringReader stringReader0 = new StringReader("");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      simpleNode0.dump("", stringWriter1);
      simpleNode0.setIdentifier(";");
      simpleNode0.dump("(1ZcnY<5(Y/[_-nb", stringWriter2);
      simpleNode0.dump("_d=tm", stringWriter1);
      assertEquals("b/H<InstanceOfExpression>\n  <identifier>_d=tm</identifier>\n  <identifier>_d=tm</identifier>\n</InstanceOfExpression>\n<InstanceOfExpression>\n  <identifier>_d=tm</identifier>\n  <identifier>_d=tm</identifier>\n  <identifier>_d=tm</identifier>\n</InstanceOfExpression>\n<InstanceOfExpression>\n  <identifier>_d=tm</identifier>\n  <identifier>_d=tm</identifier>\n  <identifier>_d=tm</identifier>\n</InstanceOfExpression>\n<InstanceOfExpression>\n  <identifier>_d=tm</identifier>\n  <identifier>_d=tm</identifier>\n  <identifier>_d=tm</identifier>\n</InstanceOfExpression>\n", stringWriter1.toString());
      assertEquals("b/H<InstanceOfExpression>\n  <identifier>_d=tm</identifier>\n  <identifier>_d=tm</identifier>\n</InstanceOfExpression>\n<InstanceOfExpression>\n  <identifier>_d=tm</identifier>\n  <identifier>_d=tm</identifier>\n  <identifier>_d=tm</identifier>\n</InstanceOfExpression>\n<InstanceOfExpression>\n  <identifier>_d=tm</identifier>\n  <identifier>_d=tm</identifier>\n  <identifier>_d=tm</identifier>\n</InstanceOfExpression>\n<InstanceOfExpression>\n  <identifier>_d=tm</identifier>\n  <identifier>_d=tm</identifier>\n  <identifier>_d=tm</identifier>\n</InstanceOfExpression>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.setIdentifier("<");
      JavaParser javaParser0 = new JavaParser((Reader) null);
      simpleNode0.parser = javaParser0;
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      simpleNode0.setIdentifier("}");
      StringWriter stringWriter0 = new StringWriter(34);
      simpleNode0.dump("<", stringWriter0);
      simpleNode0.dump(" ", stringWriter0);
      assertEquals("<CompilationUnit>\n  <identifier>*lt</identifier>\n</CompilationUnit>\n<CompilationUnit>\n  <identifier>*lt</identifier>\n</CompilationUnit>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(47);
      StringWriter stringWriter0 = new StringWriter(47);
      StringWriter stringWriter1 = stringWriter0.append('m');
      stringWriter0.close();
      simpleNode0.setIdentifier("_d=tm");
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      stringWriter0.write(47);
      StringWriter stringWriter2 = stringWriter1.append('H');
      stringWriter0.close();
      stringWriter1.close();
      simpleNode0.setIdentifier("*.37[V");
      StringReader stringReader0 = new StringReader("<=");
      stringReader0.close();
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      simpleNode0.setIdentifier("&&");
      simpleNode0.dump("*.37[V", stringWriter2);
      assertEquals("m/H<InstanceOfExpression>\n  <identifier>_d=tm</identifier>\n  <identifier>*.37[V</identifier>\n  <identifier>*amp</identifier>\n</InstanceOfExpression>\n", stringWriter2.toString());
      assertEquals("m/H<InstanceOfExpression>\n  <identifier>_d=tm</identifier>\n  <identifier>*.37[V</identifier>\n  <identifier>*amp</identifier>\n</InstanceOfExpression>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(86);
      StringWriter stringWriter0 = new StringWriter(10);
      simpleNode0.setIdentifier(">>");
      SimpleNode simpleNode1 = new SimpleNode((-1884131099));
      simpleNode1.setIdentifier("N|*KI");
      StringWriter stringWriter1 = stringWriter0.append('Z');
      simpleNode1.setIdentifier("et_q0hQw");
      simpleNode0.dump("N|*KI", stringWriter0);
      // Undeclared exception!
      try { 
        stringWriter1.append((CharSequence) ">>", (int) 'Z', (-1884131099));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\"");
      stringReader0.skip((-726L));
      stringReader0.reset();
      JavaParser javaParser0 = new JavaParser(stringReader0);
      SimpleNode simpleNode0 = new SimpleNode(84);
      StringWriter stringWriter0 = new StringWriter(2045);
      simpleNode0.setIdentifier("\"/\"");
      SimpleNode simpleNode1 = new SimpleNode(14);
      simpleNode0.setIdentifier("*amp");
      PipedInputStream pipedInputStream0 = new PipedInputStream(84);
      SimpleNode simpleNode2 = new SimpleNode(68);
      simpleNode2.setIdentifier("E");
      stringWriter0.append(',');
      stringWriter0.close();
      simpleNode0.setIdentifier(">=");
      StringBuffer stringBuffer0 = javaParser0.token_source.image;
      StringWriter stringWriter1 = stringWriter0.append((CharSequence) null);
      simpleNode0.dump("_d=tm", stringWriter1);
      assertEquals(",null<ForInit>\n  <identifier>\"/\"</identifier>\n  <identifier>*amp</identifier>\n  <identifier>*ge</identifier>\n</ForInit>\n", stringWriter0.toString());
      
      StringWriter stringWriter2 = new StringWriter(84);
      simpleNode1.dump("\"/\"", stringWriter2);
      assertEquals("", stringWriter2.toString());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      stringReader0.reset();
      JavaParser javaParser0 = new JavaParser(stringReader0);
      SimpleNode simpleNode0 = new SimpleNode(84);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      StringWriter stringWriter0 = new StringWriter(2045);
      stringWriter0.close();
      simpleNode0.setIdentifier("do");
      stringWriter0.close();
      stringWriter0.close();
      simpleNode0.setIdentifier("do");
      simpleNode0.dump("%mgU'", stringWriter0);
      simpleNode0.dump("do", stringWriter0);
      simpleNode0.setIdentifier("&");
      simpleNode0.dump("do", stringWriter0);
      simpleNode0.dump("do", stringWriter0);
      simpleNode0.dump("", stringWriter0);
      simpleNode0.dump("%mgU'", stringWriter0);
      assertEquals("<ForInit>\n  <identifier>do</identifier>\n  <identifier>do</identifier>\n</ForInit>\n<ForInit>\n  <identifier>do</identifier>\n  <identifier>do</identifier>\n</ForInit>\n<ForInit>\n  <identifier>do</identifier>\n  <identifier>do</identifier>\n  <identifier>*amp</identifier>\n</ForInit>\n<ForInit>\n  <identifier>do</identifier>\n  <identifier>do</identifier>\n  <identifier>*amp</identifier>\n</ForInit>\n<ForInit>\n  <identifier>do</identifier>\n  <identifier>do</identifier>\n  <identifier>*amp</identifier>\n</ForInit>\n<ForInit>\n  <identifier>do</identifier>\n  <identifier>do</identifier>\n  <identifier>*amp</identifier>\n</ForInit>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      FileSystemHandling.shouldAllThrowIOExceptions();
      stringReader0.skip((-726L));
      stringReader0.reset();
      JavaParser javaParser0 = new JavaParser(stringReader0);
      SimpleNode simpleNode0 = new SimpleNode(84);
      StringWriter stringWriter0 = new StringWriter(2045);
      stringWriter0.close();
      StringWriter stringWriter1 = new StringWriter(2045);
      simpleNode0.setIdentifier("\"/\"");
      SimpleNode simpleNode1 = new SimpleNode(14);
      simpleNode0.setIdentifier("*amp");
      PipedInputStream pipedInputStream0 = new PipedInputStream(14);
      stringWriter1.append((CharSequence) "");
      simpleNode1.setIdentifier("{");
      simpleNode1.dump(";X8=LGl@", stringWriter1);
      simpleNode1.dump("{", stringWriter0);
      SimpleNode simpleNode2 = new SimpleNode((-1085407416));
      simpleNode2.dump("", stringWriter1);
      simpleNode0.dump("+R_grQnp3", stringWriter0);
      simpleNode1.dump("", stringWriter0);
      assertEquals("<ClassOrInterfaceBody>\n</ClassOrInterfaceBody>\n<ForInit>\n  <identifier>\"/\"</identifier>\n  <identifier>*amp</identifier>\n</ForInit>\n<ClassOrInterfaceBody>\n</ClassOrInterfaceBody>\n", stringWriter0.toString());
  }
}
