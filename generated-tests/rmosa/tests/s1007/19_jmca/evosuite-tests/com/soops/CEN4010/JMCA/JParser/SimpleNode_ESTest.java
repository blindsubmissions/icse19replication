/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 08:28:21 GMT 2018
 */

package com.soops.CEN4010.JMCA.JParser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.soops.CEN4010.JMCA.JParser.JavaParser;
import com.soops.CEN4010.JMCA.JParser.Node;
import com.soops.CEN4010.JMCA.JParser.SimpleNode;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.CharBuffer;
import java.util.ArrayList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.evosuite.runtime.util.SystemInUtil;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SimpleNode_ESTest extends SimpleNode_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.48439011623800354
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(48);
      SimpleNode simpleNode1 = new SimpleNode(48);
      simpleNode0.jjtSetParent(simpleNode1);
      SimpleNode simpleNode2 = new SimpleNode(48);
      simpleNode2.setIdentifier("<=");
      StringWriter stringWriter0 = new StringWriter(10);
      StringWriter stringWriter1 = new StringWriter();
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      simpleNode0.dump("<=", stringWriter1);
      StringWriter stringWriter2 = stringWriter0.append((CharSequence) "<=");
      simpleNode2.dump("<=", stringWriter2);
      simpleNode2.dump("C1,b", stringWriter0);
      assertEquals("<=<RelationalExpression>\n  <identifier>*le</identifier>\n</RelationalExpression>\n<RelationalExpression>\n  <identifier>*le</identifier>\n</RelationalExpression>\n", stringWriter0.toString());
      
      simpleNode0.dump("[g^6&yHdP.@N7  ", stringWriter1);
      assertEquals("", stringWriter1.toString());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.5500569563964232
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.jjtGetParent();
      simpleNode0.jjtAddChild((Node) null, 0);
      StringWriter stringWriter0 = new StringWriter(739);
      StringWriter stringWriter1 = new StringWriter('n');
      simpleNode0.dump("#", stringWriter1);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "FormalParameter");
      simpleNode0.setIdentifier("#");
      StringWriter stringWriter2 = new StringWriter(739);
      StringWriter stringWriter3 = stringWriter0.append('4');
      simpleNode0.dump((String) null, stringWriter1);
      simpleNode0.dump("#", stringWriter3);
      simpleNode0.dump("#", stringWriter1);
      simpleNode0.dump((String) null, stringWriter0);
      assertEquals(1, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.6248603116943127
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(48);
      simpleNode0.setIdentifier("com.soops.CEN4010.JMCA.JParser.SimpleNode");
      simpleNode0.setIdentifier("\"if\"");
      simpleNode0.jjtGetParent();
      simpleNode0.jjtGetNumChildren();
      StringWriter stringWriter0 = new StringWriter();
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      StringWriter stringWriter1 = new StringWriter();
      StringWriter stringWriter2 = new StringWriter(48);
      StringWriter stringWriter3 = stringWriter2.append((CharSequence) "\"if\"");
      simpleNode0.dump("\"if\"", stringWriter3);
      simpleNode0.dump("<=", stringWriter0);
      SimpleNode simpleNode1 = new SimpleNode(0);
      simpleNode1.dump("<=", stringWriter2);
      StringWriter stringWriter4 = stringWriter2.append('B');
      simpleNode1.dump("VariableDeclaratorId", stringWriter2);
      simpleNode0.dump("<=", stringWriter0);
      CharBuffer charBuffer0 = CharBuffer.allocate(48);
      StringWriter stringWriter5 = stringWriter4.append((CharSequence) charBuffer0);
      simpleNode1.dump("Y$B(B4,tu6apw", stringWriter5);
      assertEquals("\"if\"<RelationalExpression>\n  <identifier>com.soops.CEN4010.JMCA.JParser.SimpleNode</identifier>\n  <identifier>\"if\"</identifier>\n</RelationalExpression>\nB\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", stringWriter4.toString());
      assertEquals("\"if\"<RelationalExpression>\n  <identifier>com.soops.CEN4010.JMCA.JParser.SimpleNode</identifier>\n  <identifier>\"if\"</identifier>\n</RelationalExpression>\nB\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", stringWriter5.toString());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.4709001279172663
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(48);
      simpleNode0.setIdentifier("com.soops.CEN4010.JMCA.JParser.SimpleNode");
      simpleNode0.setIdentifier(">=");
      StringWriter stringWriter0 = new StringWriter(48);
      SystemInUtil.addInputLine("+");
      simpleNode0.dump("*ge", stringWriter0);
      JavaParser javaParser0 = new JavaParser("Block");
      SimpleNode simpleNode1 = new SimpleNode(javaParser0, (-3899));
      simpleNode0.dump("*ge", stringWriter0);
      simpleNode0.dump("com.soops.CEN4010.JMCA.JParser.SimpleNode", stringWriter0);
      StringWriter stringWriter1 = new StringWriter();
      simpleNode1.dump("*ge", (Writer) null);
      assertEquals(0, simpleNode1.jjtGetNumChildren());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((-1227));
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      simpleNode0.identifiers = arrayList0;
      // Undeclared exception!
      try { 
        simpleNode0.jjtGetChild((-1227));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.4709001279172663
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(48);
      String string0 = "com.soops.CEN4010.JMCA.JParser.SimpleNode";
      simpleNode0.setIdentifier("com.soops.CEN4010.JMCA.JParser.SimpleNode");
      simpleNode0.setIdentifier(">=");
      Node[] nodeArray0 = new Node[4];
      StringReader stringReader0 = new StringReader("+");
      JavaParser javaParser0 = new JavaParser(stringReader0);
      Node node0 = javaParser0.currNode;
      nodeArray0[0] = null;
      nodeArray0[1] = (Node) simpleNode0;
      nodeArray0[2] = (Node) simpleNode0;
      nodeArray0[3] = (Node) simpleNode0;
      simpleNode0.children = nodeArray0;
      StringWriter stringWriter0 = new StringWriter(48);
      String string1 = "*ge";
      // Undeclared exception!
      try { 
        simpleNode0.dump("*ge", stringWriter0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.48439011623800354
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(48);
      SimpleNode simpleNode1 = new SimpleNode(48);
      SimpleNode simpleNode2 = new SimpleNode(48);
      simpleNode2.setIdentifier("<=");
      simpleNode2.toString();
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      StringWriter stringWriter0 = new StringWriter(10);
      StringWriter stringWriter1 = new StringWriter();
      simpleNode0.dump("<=", stringWriter1);
      StringWriter stringWriter2 = stringWriter0.append((CharSequence) "<=");
      simpleNode2.dump("<=", stringWriter2);
      simpleNode0.dump("<=", stringWriter2);
      simpleNode0.dump("<=", stringWriter0);
      simpleNode2.dump("VariableDeclaratorId", stringWriter0);
      assertEquals("<=<RelationalExpression>\n  <identifier>*le</identifier>\n</RelationalExpression>\n<RelationalExpression>\n  <identifier>*le</identifier>\n</RelationalExpression>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(3133);
      // Undeclared exception!
      try { 
        simpleNode0.toString("_");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3133
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.3153962874226617
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(18);
      simpleNode0.setIdentifier("U)");
      SimpleNode simpleNode1 = new SimpleNode(18);
      simpleNode1.setIdentifier("<=");
      StringWriter stringWriter0 = new StringWriter(10);
      StringWriter stringWriter1 = new StringWriter();
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      stringWriter1.write("<=");
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      simpleNode0.dump("<=", stringWriter1);
      StringWriter stringWriter2 = stringWriter0.append((CharSequence) "<=");
      simpleNode1.dump("<=", stringWriter2);
      stringWriter2.append((CharSequence) "U)");
      simpleNode0.dump("<=", stringWriter2);
      simpleNode0.dump("<=", stringWriter0);
      simpleNode1.dump((String) null, stringWriter2);
      assertEquals("<=<VariableDeclaratorId>\n  <identifier>*le</identifier>\n</VariableDeclaratorId>\nU)<VariableDeclaratorId>\n  <identifier>U)</identifier>\n</VariableDeclaratorId>\n<VariableDeclaratorId>\n  <identifier>U)</identifier>\n</VariableDeclaratorId>\n<VariableDeclaratorId>\n  <identifier>*le</identifier>\n</VariableDeclaratorId>\n", stringWriter2.toString());
      assertEquals("<=<VariableDeclaratorId>\n  <identifier>*le</identifier>\n</VariableDeclaratorId>\nU)<VariableDeclaratorId>\n  <identifier>U)</identifier>\n</VariableDeclaratorId>\n<VariableDeclaratorId>\n  <identifier>U)</identifier>\n</VariableDeclaratorId>\n<VariableDeclaratorId>\n  <identifier>*le</identifier>\n</VariableDeclaratorId>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(1);
      simpleNode0.jjtAddChild((Node) null, 1);
      simpleNode0.jjtGetNumChildren();
      SimpleNode simpleNode1 = new SimpleNode(1);
      assertFalse(simpleNode1.equals((Object)simpleNode0));
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser((Reader) null);
      // Undeclared exception!
      try { 
        javaParser0.NameList();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.777209681786442
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(80);
      simpleNode0.setIdentifier(">");
      simpleNode0.jjtGetParent();
      simpleNode0.jjtGetNumChildren();
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.jjtAddChild((Node) null, 1);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, ">");
      StringWriter stringWriter1 = new StringWriter(771);
      StringWriter stringWriter2 = stringWriter0.append('4');
      simpleNode0.dump((String) null, stringWriter2);
      assertEquals(2, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int int0 = (-11);
      SimpleNode simpleNode0 = new SimpleNode((-11));
      SimpleNode simpleNode1 = new SimpleNode(1);
      Node[] nodeArray0 = new Node[9];
      nodeArray0[0] = (Node) simpleNode0;
      nodeArray0[1] = (Node) simpleNode0;
      nodeArray0[2] = (Node) simpleNode1;
      nodeArray0[3] = (Node) simpleNode1;
      nodeArray0[4] = (Node) simpleNode0;
      nodeArray0[6] = (Node) simpleNode0;
      nodeArray0[7] = (Node) simpleNode0;
      nodeArray0[8] = (Node) simpleNode0;
      simpleNode1.children = nodeArray0;
      Node node0 = simpleNode0.parent;
      FileSystemHandling.shouldAllThrowIOExceptions();
      // Undeclared exception!
      try { 
        simpleNode1.jjtAddChild(simpleNode0, (-11));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -11
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      SimpleNode simpleNode1 = new SimpleNode(1);
      simpleNode0.jjtAddChild(simpleNode1, 0);
      StringWriter stringWriter0 = new StringWriter(10);
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      FileSystemHandling.shouldAllThrowIOExceptions();
      simpleNode0.jjtAddChild(simpleNode1, 10);
      StringWriter stringWriter1 = stringWriter0.append('4');
      StringWriter stringWriter2 = stringWriter0.append('4');
      simpleNode1.dump((String) null, stringWriter2);
      simpleNode1.dump("wh", stringWriter1);
      assertSame(stringWriter1, stringWriter2);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "WKBrg~Hjh");
      SimpleNode simpleNode0 = new SimpleNode(48);
      SimpleNode simpleNode1 = new SimpleNode(48);
      SimpleNode simpleNode2 = new SimpleNode(92);
      simpleNode2.setIdentifier("}");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode2.dump("=PFM25", stringWriter0);
      simpleNode1.dump("}", stringWriter0);
      SimpleNode simpleNode3 = new SimpleNode(2);
      simpleNode3.dump("break", stringWriter0);
      StringWriter stringWriter1 = new StringWriter(2);
      simpleNode2.dump("R7z#[>D?da", stringWriter0);
      assertEquals("<TryStatement>\n</TryStatement>\n<TryStatement>\n</TryStatement>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(73);
      simpleNode0.setIdentifier(";");
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = new StringWriter(213);
      SimpleNode simpleNode1 = new SimpleNode(213);
      simpleNode1.dump("5>", stringWriter1);
      JavaParser javaParser0 = new JavaParser("5>");
      simpleNode0.dump("nX", stringWriter1);
      ArrayList<String> arrayList0 = simpleNode1.identifiers;
      StringWriter stringWriter2 = new StringWriter();
      StringWriter stringWriter3 = new StringWriter();
      simpleNode0.dump("IfStatement", stringWriter1);
      assertEquals("<Block>\n</Block>\n<Block>\n</Block>\n", stringWriter1.toString());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(48);
      SimpleNode simpleNode1 = new SimpleNode(48);
      simpleNode1.setIdentifier("{");
      StringWriter stringWriter0 = new StringWriter(10);
      StringWriter stringWriter1 = stringWriter0.append((CharSequence) "{");
      simpleNode1.dump("{", stringWriter1);
      StringWriter stringWriter2 = new StringWriter(48);
      StringWriter stringWriter3 = stringWriter2.append('y');
      simpleNode1.dump("{", stringWriter3);
      assertEquals("y<RelationalExpression>\n</RelationalExpression>\n", stringWriter3.toString());
      assertEquals("y<RelationalExpression>\n</RelationalExpression>\n", stringWriter2.toString());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.3805062184775959
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(73);
      simpleNode0.setIdentifier("M>");
      StringWriter stringWriter0 = new StringWriter(74);
      simpleNode0.setIdentifier("");
      StringWriter stringWriter1 = stringWriter0.append('\"');
      StringWriter stringWriter2 = new StringWriter();
      simpleNode0.dump("M>", stringWriter0);
      stringWriter1.append('\\');
      simpleNode0.dump("M>", stringWriter0);
      StringWriter stringWriter3 = stringWriter0.append((CharSequence) null);
      simpleNode0.dump("Y7'-V{o^IG_wO:#>;", stringWriter3);
      assertEquals("\"<Block>\n  <identifier>M></identifier>\n</Block>\n\\<Block>\n  <identifier>M></identifier>\n</Block>\nnull<Block>\n  <identifier>M></identifier>\n</Block>\n", stringWriter3.toString());
      assertEquals("\"<Block>\n  <identifier>M></identifier>\n</Block>\n\\<Block>\n  <identifier>M></identifier>\n</Block>\nnull<Block>\n  <identifier>M></identifier>\n</Block>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "WKBrg~Hjh");
      SimpleNode simpleNode0 = new SimpleNode(48);
      SimpleNode simpleNode1 = new SimpleNode(13);
      simpleNode1.setIdentifier("&");
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      StringWriter stringWriter0 = new StringWriter(48);
      StringWriter stringWriter1 = new StringWriter();
      simpleNode0.dump("&", stringWriter1);
      stringWriter0.append((CharSequence) "WKBrg~Hjh");
      simpleNode1.dump("&", stringWriter1);
      simpleNode0.dump("&", stringWriter1);
      simpleNode1.dump("&", stringWriter0);
      assertEquals("WKBrg~Hjh<TypeBound>\n  <identifier>*amp</identifier>\n</TypeBound>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(48);
      simpleNode0.setIdentifier("&&");
      StringWriter stringWriter0 = new StringWriter(10);
      StringWriter stringWriter1 = new StringWriter();
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      simpleNode0.dump("x9/`d", stringWriter0);
      StringWriter stringWriter2 = stringWriter0.append('h');
      simpleNode0.dump("{", stringWriter2);
      stringWriter0.append('^');
      StringWriter stringWriter3 = stringWriter2.append((CharSequence) "{");
      simpleNode0.dump("", stringWriter3);
      assertEquals("<RelationalExpression>\n  <identifier>*amp</identifier>\n</RelationalExpression>\nh<RelationalExpression>\n  <identifier>*amp</identifier>\n</RelationalExpression>\n^{<RelationalExpression>\n  <identifier>*amp</identifier>\n</RelationalExpression>\n", stringWriter3.toString());
      assertEquals("<RelationalExpression>\n  <identifier>*amp</identifier>\n</RelationalExpression>\nh<RelationalExpression>\n  <identifier>*amp</identifier>\n</RelationalExpression>\n^{<RelationalExpression>\n  <identifier>*amp</identifier>\n</RelationalExpression>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(48);
      SimpleNode simpleNode1 = new SimpleNode(48);
      simpleNode0.setIdentifier("<");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("<", stringWriter0);
      stringWriter0.append('i');
      SimpleNode simpleNode2 = new SimpleNode(277);
      assertFalse(simpleNode2.equals((Object)simpleNode0));
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      SimpleNode simpleNode1 = new SimpleNode(0);
      Node node0 = simpleNode0.parent;
      FileSystemHandling.shouldAllThrowIOExceptions();
      simpleNode1.jjtAddChild(simpleNode0, 0);
      StringWriter stringWriter0 = new StringWriter(0);
      StringWriter stringWriter1 = stringWriter0.append((CharSequence) "d%7 ^v-5Sy@", 0, 0);
      simpleNode1.dump("d%7 ^v-5Sy@", stringWriter1);
      StringWriter stringWriter2 = stringWriter1.append((CharSequence) "d%7 ^v-5Sy@");
      simpleNode0.dump(" v", stringWriter2);
      Node[] nodeArray0 = new Node[0];
      simpleNode0.children = nodeArray0;
      simpleNode0.dump(" v", stringWriter1);
      assertEquals("<CompilationUnit></CompilationUnit>\nd%7 ^v-5Sy@", stringWriter1.toString());
      assertEquals("<CompilationUnit></CompilationUnit>\nd%7 ^v-5Sy@", stringWriter0.toString());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(63);
      SimpleNode simpleNode1 = new SimpleNode(63);
      SimpleNode simpleNode2 = new SimpleNode(63);
      simpleNode1.setIdentifier("<=");
      StringWriter stringWriter0 = new StringWriter(63);
      StringWriter stringWriter1 = new StringWriter();
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      simpleNode1.dump("double", stringWriter0);
      stringWriter0.append((CharSequence) "<=");
      simpleNode2.dump((String) null, stringWriter0);
      StringWriter stringWriter2 = null;
      try {
        stringWriter2 = new StringWriter((-327));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative buffer size
         //
         verifyException("java.io.StringWriter", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(48);
      simpleNode0.setIdentifier("\"TxkO!Ly@HBsR>FwH1/");
      simpleNode0.setIdentifier(">>");
      StringWriter stringWriter0 = new StringWriter(3603);
      SystemInUtil.addInputLine(">>");
      simpleNode0.dump("\"TxkO!Ly@HBsR>FwH1/", stringWriter0);
      StringWriter stringWriter1 = new StringWriter();
      simpleNode0.dump("\"TxkO!Ly@HBsR>FwH1/", stringWriter0);
      StringWriter stringWriter2 = stringWriter1.append('&');
      simpleNode0.dump("dJfVX2dYi;GUM_", stringWriter2);
      assertEquals("&<RelationalExpression>\n  <identifier>\"TxkO!Ly@HBsR>FwH1/</identifier>\n  <identifier>*rshft</identifier>\n</RelationalExpression>\n", stringWriter2.toString());
      assertEquals("&<RelationalExpression>\n  <identifier>\"TxkO!Ly@HBsR>FwH1/</identifier>\n  <identifier>*rshft</identifier>\n</RelationalExpression>\n", stringWriter1.toString());
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(48);
      SimpleNode simpleNode1 = new SimpleNode(48);
      SimpleNode simpleNode2 = new SimpleNode(48);
      simpleNode0.setIdentifier("<<");
      StringWriter stringWriter0 = new StringWriter(10);
      StringWriter stringWriter1 = new StringWriter(48);
      StringWriter stringWriter2 = new StringWriter(48);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      simpleNode2.dump("*lshft", stringWriter2);
      stringWriter0.append(':');
      JavaParser javaParser0 = new JavaParser((Reader) null);
      SimpleNode simpleNode3 = new SimpleNode(javaParser0, (-122607198));
      simpleNode3.dump("<<", stringWriter2);
      simpleNode0.dump("\"new\"", stringWriter1);
      assertEquals("<RelationalExpression>\n  <identifier>*lshft</identifier>\n</RelationalExpression>\n", stringWriter1.toString());
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(18);
      SimpleNode simpleNode1 = new SimpleNode(18);
      SimpleNode simpleNode2 = new SimpleNode(18);
      simpleNode2.setIdentifier("<=");
      SimpleNode simpleNode3 = new SimpleNode((-210968058));
      simpleNode1.setIdentifier(")");
      StringWriter stringWriter0 = new StringWriter(10);
      StringWriter stringWriter1 = new StringWriter();
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      stringWriter0.write(")");
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      simpleNode2.dump("<=", stringWriter0);
      StringWriter stringWriter2 = stringWriter1.append((CharSequence) "<=");
      simpleNode1.dump((String) null, stringWriter2);
      simpleNode2.dump("<=", stringWriter2);
      simpleNode0.dump("<<", stringWriter2);
      simpleNode0.dump("<=", stringWriter0);
      assertEquals(")<VariableDeclaratorId>\n  <identifier>*le</identifier>\n</VariableDeclaratorId>\n", stringWriter0.toString());
  }
}