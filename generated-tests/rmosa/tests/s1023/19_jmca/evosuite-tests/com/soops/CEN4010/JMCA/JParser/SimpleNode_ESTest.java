/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 15:45:06 GMT 2018
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
import java.io.FileDescriptor;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.SequenceInputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Enumeration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.evosuite.runtime.util.SystemInUtil;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SimpleNode_ESTest extends SimpleNode_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.6691825225299436
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(86);
      simpleNode0.toString();
      simpleNode0.jjtOpen();
      Node node0 = simpleNode0.parent;
      simpleNode0.toString();
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      simpleNode0.jjtAddChild((Node) null, 0);
      StringWriter stringWriter0 = new StringWriter(0);
      simpleNode0.dump("ForUpdate", stringWriter0);
      simpleNode0.dump("CB|_p._n}]sCL\"", stringWriter0);
      simpleNode0.setIdentifier("ForUpdate");
      simpleNode0.dump("CB|_p._n}]sCL\"", stringWriter0);
      simpleNode0.dump("@TJt?&lmXyTjZ6ET", stringWriter0);
      assertEquals(1, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.4349442022582592
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = stringWriter0.append('0');
      SimpleNode simpleNode0 = new SimpleNode('0');
      simpleNode0.setIdentifier("&");
      simpleNode0.dump("&", stringWriter1);
      stringWriter1.close();
      SimpleNode simpleNode1 = new SimpleNode(44);
      simpleNode0.dump("<=", stringWriter1);
      Node[] nodeArray0 = new Node[8];
      nodeArray0[0] = (Node) simpleNode0;
      JavaParser javaParser0 = new JavaParser("<=");
      Node node0 = javaParser0.currNode;
      simpleNode0.jjtSetParent((Node) null);
      nodeArray0[1] = (Node) simpleNode1;
      nodeArray0[2] = (Node) simpleNode0;
      nodeArray0[3] = (Node) simpleNode1;
      nodeArray0[4] = (Node) simpleNode0;
      nodeArray0[5] = (Node) simpleNode0;
      nodeArray0[6] = (Node) simpleNode0;
      nodeArray0[7] = (Node) simpleNode1;
      simpleNode1.children = nodeArray0;
      // Undeclared exception!
      try { 
        simpleNode1.dump("I?h", stringWriter1);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((-492));
      simpleNode0.jjtClose();
      String string0 = "";
      StringWriter stringWriter0 = new StringWriter();
      stringWriter0.write("");
      stringWriter0.flush();
      StringWriter stringWriter1 = stringWriter0.append('F');
      char[] charArray0 = new char[2];
      charArray0[0] = 'F';
      charArray0[1] = 'F';
      // Undeclared exception!
      try { 
        stringWriter1.write(charArray0, (-492), 5045);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringWriter", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      JavaParser javaParser0 = new JavaParser(mockFileInputStream0);
      SimpleNode simpleNode0 = new SimpleNode(0);
      Node node0 = simpleNode0.jjtGetParent();
      assertNull(node0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.6248603116943127
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(86);
      simpleNode0.toString();
      simpleNode0.toString("ForUpdate");
      simpleNode0.toString();
      simpleNode0.toString();
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump((String) null, stringWriter0);
      simpleNode0.setIdentifier("<=");
      stringWriter0.write("ForUpdate");
      simpleNode0.dump("<=", stringWriter0);
      simpleNode0.dump((String) null, stringWriter0);
      simpleNode0.dump("ForUpdate", stringWriter0);
      StringWriter stringWriter1 = new StringWriter();
      simpleNode0.dump((String) null, stringWriter1);
      simpleNode0.dump("ForUpdate", stringWriter0);
      assertEquals("ForUpdate<ForUpdate>\n  <identifier>*le</identifier>\n</ForUpdate>\n<ForUpdate>\n  <identifier>*le</identifier>\n</ForUpdate>\n<ForUpdate>\n  <identifier>*le</identifier>\n</ForUpdate>\n<ForUpdate>\n  <identifier>*le</identifier>\n</ForUpdate>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int int0 = 0;
      SimpleNode simpleNode0 = new SimpleNode(0);
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
  //Test case number: 6
  /*Coverage entropy=0.39439769144744274
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = stringWriter0.append('0');
      SimpleNode simpleNode0 = new SimpleNode('0');
      simpleNode0.setIdentifier("&");
      simpleNode0.dump("&", stringWriter1);
      stringWriter1.close();
      SimpleNode simpleNode1 = new SimpleNode(44);
      simpleNode0.dump("<=", stringWriter1);
      simpleNode1.dump("I?h", stringWriter1);
      assertEquals("0<RelationalExpression>\n  <identifier>*amp</identifier>\n</RelationalExpression>\n<RelationalExpression>\n  <identifier>*amp</identifier>\n</RelationalExpression>\n", stringWriter1.toString());
      assertEquals("0<RelationalExpression>\n  <identifier>*amp</identifier>\n</RelationalExpression>\n<RelationalExpression>\n  <identifier>*amp</identifier>\n</RelationalExpression>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.5500569563964232
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(84);
      Node node0 = simpleNode0.parent;
      simpleNode0.toString();
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      simpleNode0.jjtAddChild((Node) null, 0);
      StringWriter stringWriter0 = new StringWriter(84);
      stringWriter0.flush();
      simpleNode0.dump("CB|_p._n}]sCL\"", stringWriter0);
      simpleNode0.dump("ForInit", stringWriter0);
      SystemInUtil.addInputLine(";");
      simpleNode0.setIdentifier("ForInit");
      simpleNode0.dump("^~vk", stringWriter0);
      simpleNode0.dump("j$", stringWriter0);
      simpleNode0.dump("<SINGLE_LINE_COMMENT>", stringWriter0);
      simpleNode0.dump("CompilationUnit", stringWriter0);
      simpleNode0.dump("\"short\"", stringWriter0);
      simpleNode0.dump("#", stringWriter0);
      assertEquals(1, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.5481178804418445
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(4);
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.setIdentifier("q");
      simpleNode0.jjtGetNumChildren();
      StringWriter stringWriter1 = new StringWriter();
      simpleNode0.dump("q", stringWriter1);
      SequenceInputStream sequenceInputStream0 = null;
      try {
        sequenceInputStream0 = new SequenceInputStream((Enumeration<? extends InputStream>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.SequenceInputStream", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.5735160760972796
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = new StringWriter();
      SimpleNode simpleNode0 = new SimpleNode(18);
      SimpleNode simpleNode1 = new SimpleNode(18);
      stringWriter0.write((-923));
      String string0 = " ";
      simpleNode0.dump("&", stringWriter0);
      String string1 = ";";
      SystemInUtil.addInputLine(" ");
      simpleNode1.setIdentifier("&");
      simpleNode1.toString();
      simpleNode1.dump(";", stringWriter0);
      String string2 = "OR";
      simpleNode1.dump("OR", stringWriter1);
      int int0 = (-2469);
      StringWriter stringWriter2 = null;
      try {
        stringWriter2 = new StringWriter((-2469));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative buffer size
         //
         verifyException("java.io.StringWriter", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.8789343621996049
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = new StringWriter();
      SimpleNode simpleNode0 = new SimpleNode(18);
      SimpleNode simpleNode1 = new SimpleNode(18);
      SimpleNode simpleNode2 = new SimpleNode(18);
      simpleNode1.jjtAddChild(simpleNode2, 13);
      simpleNode1.dump(".", stringWriter0);
      simpleNode2.setIdentifier(".");
      simpleNode1.jjtAddChild(simpleNode2, 18);
      simpleNode2.dump(";", stringWriter0);
      StringWriter stringWriter2 = new StringWriter(18);
      simpleNode1.dump("^~vk", stringWriter2);
      simpleNode2.toString(";");
      JavaParser javaParser0 = new JavaParser("case");
      simpleNode2.parser = javaParser0;
      SimpleNode simpleNode3 = new SimpleNode(javaParser0, 79);
      Node[] nodeArray0 = new Node[2];
      simpleNode1.jjtAddChild(simpleNode3, 18);
      simpleNode3.children = nodeArray0;
      simpleNode1.dump("N8\"U'", stringWriter2);
      simpleNode3.dump(".", stringWriter0);
      assertEquals("<VariableDeclaratorId></VariableDeclaratorId>\n<VariableDeclaratorId>\n  <identifier>.</identifier>\n</VariableDeclaratorId>\n<SwitchLabel></SwitchLabel>\n", stringWriter0.toString());
      
      simpleNode2.dump(")Sv.dhYGS50", stringWriter2);
      simpleNode3.dump("%I?bB*4_mHsuWtGu{", stringWriter2);
      assertEquals("<VariableDeclaratorId><VariableDeclaratorId>\n  <identifier>.</identifier>\n</VariableDeclaratorId>\n<VariableDeclaratorId>\n  <identifier>.</identifier>\n</VariableDeclaratorId>\n</VariableDeclaratorId>\n<VariableDeclaratorId><VariableDeclaratorId>\n  <identifier>.</identifier>\n</VariableDeclaratorId>\n<SwitchLabel></SwitchLabel>\n</VariableDeclaratorId>\n<VariableDeclaratorId>\n  <identifier>.</identifier>\n</VariableDeclaratorId>\n<SwitchLabel></SwitchLabel>\n", stringWriter2.toString());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.4978661367769954
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(7);
      simpleNode0.toString();
      simpleNode0.toString();
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = stringWriter0.append((CharSequence) "ImplementsList");
      simpleNode0.dump("<+/Kb1", stringWriter1);
      StringReader stringReader0 = new StringReader("ImplementsList");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "ImplementsList");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 0, 7, 7);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      JavaParser javaParser0 = new JavaParser(javaParserTokenManager0);
      SimpleNode simpleNode1 = new SimpleNode(javaParser0, 10);
      simpleNode0.jjtAddChild(simpleNode1, 7);
      int int0 = simpleNode0.jjtGetNumChildren();
      assertEquals(8, int0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(32);
      simpleNode0.toString();
      simpleNode0.toString();
      simpleNode0.setIdentifier("}");
      StringWriter stringWriter0 = new StringWriter(32);
      simpleNode0.dump("}", stringWriter0);
      simpleNode0.dump("}", stringWriter0);
      simpleNode0.dump("TypeArgument", stringWriter0);
      assertEquals("<TypeArgument>\n</TypeArgument>\n<TypeArgument>\n</TypeArgument>\n<TypeArgument>\n</TypeArgument>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.7566199756619738
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("TypeParameters");
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 93);
      simpleNode0.jjtOpen();
      simpleNode0.setIdentifier("<");
      simpleNode0.jjtGetNumChildren();
      SimpleNode simpleNode1 = new SimpleNode((-129));
      SimpleNode simpleNode2 = new SimpleNode((-129));
      simpleNode1.parent = (Node) simpleNode2;
      StringWriter stringWriter0 = new StringWriter();
      String string0 = "VariableDeclaratorId";
      simpleNode1.dump("*rshft", stringWriter0);
      simpleNode0.dump("&", stringWriter0);
      simpleNode0.dump("<", stringWriter0);
      StringWriter stringWriter1 = new StringWriter(93);
      stringWriter0.append('K');
      simpleNode0.dump(" -@MkrNCx67gAEQ", stringWriter0);
      StringWriter stringWriter2 = stringWriter1.append((CharSequence) "*rshft", 0, 0);
      char char0 = '}';
      // Undeclared exception!
      try { 
        stringWriter2.append((CharSequence) "&", 27, 93);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = stringWriter0.append('0');
      SimpleNode simpleNode0 = new SimpleNode('0');
      simpleNode0.setIdentifier("&");
      simpleNode0.dump("&", stringWriter1);
      stringWriter1.close();
      SimpleNode simpleNode1 = new SimpleNode(44);
      Node[] nodeArray0 = new Node[8];
      nodeArray0[0] = (Node) simpleNode0;
      nodeArray0[1] = (Node) simpleNode1;
      nodeArray0[2] = (Node) simpleNode0;
      nodeArray0[3] = (Node) simpleNode1;
      nodeArray0[4] = (Node) simpleNode0;
      nodeArray0[5] = (Node) simpleNode0;
      nodeArray0[6] = (Node) simpleNode0;
      nodeArray0[7] = (Node) simpleNode1;
      simpleNode0.setIdentifier("");
      simpleNode0.dump("&", stringWriter1);
      assertEquals("0<RelationalExpression>\n  <identifier>*amp</identifier>\n</RelationalExpression>\n<RelationalExpression>\n  <identifier>*amp</identifier>\n</RelationalExpression>\n", stringWriter1.toString());
      assertEquals("0<RelationalExpression>\n  <identifier>*amp</identifier>\n</RelationalExpression>\n<RelationalExpression>\n  <identifier>*amp</identifier>\n</RelationalExpression>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(1);
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.setIdentifier(">=");
      simpleNode0.dump(">=", stringWriter0);
      assertEquals("<PackageDeclaration>\n  <identifier>*ge</identifier>\n</PackageDeclaration>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = stringWriter0.append('0');
      SimpleNode simpleNode0 = new SimpleNode('0');
      simpleNode0.setIdentifier("&");
      simpleNode0.dump("&", stringWriter1);
      simpleNode0.setIdentifier(">>");
      stringWriter1.write("wovL4kTdl]CnMp14ww");
      simpleNode0.dump("[Q*IYtARdG:#W<V<!2", stringWriter1);
      simpleNode0.setIdentifier("8MP0\" ");
      simpleNode0.dump("wovL4kTdl]CnMp14ww", stringWriter1);
      StringWriter stringWriter2 = new StringWriter();
      simpleNode0.dump("8MP0\" ", stringWriter1);
      assertEquals("0<RelationalExpression>\n  <identifier>*amp</identifier>\n</RelationalExpression>\nwovL4kTdl]CnMp14ww<RelationalExpression>\n  <identifier>*amp</identifier>\n  <identifier>*rshft</identifier>\n</RelationalExpression>\n<RelationalExpression>\n  <identifier>*amp</identifier>\n  <identifier>*rshft</identifier>\n  <identifier>8MP0\" </identifier>\n</RelationalExpression>\n<RelationalExpression>\n  <identifier>*amp</identifier>\n  <identifier>*rshft</identifier>\n  <identifier>8MP0\" </identifier>\n</RelationalExpression>\n", stringWriter1.toString());
      assertEquals("0<RelationalExpression>\n  <identifier>*amp</identifier>\n</RelationalExpression>\nwovL4kTdl]CnMp14ww<RelationalExpression>\n  <identifier>*amp</identifier>\n  <identifier>*rshft</identifier>\n</RelationalExpression>\n<RelationalExpression>\n  <identifier>*amp</identifier>\n  <identifier>*rshft</identifier>\n  <identifier>8MP0\" </identifier>\n</RelationalExpression>\n<RelationalExpression>\n  <identifier>*amp</identifier>\n  <identifier>*rshft</identifier>\n  <identifier>8MP0\" </identifier>\n</RelationalExpression>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      SimpleNode simpleNode0 = new SimpleNode(18);
      SimpleNode simpleNode1 = new SimpleNode(18);
      SimpleNode simpleNode2 = new SimpleNode(18);
      SystemInUtil.addInputLine(" ");
      simpleNode2.setIdentifier(".");
      simpleNode2.dump(";", stringWriter0);
      StringWriter stringWriter1 = new StringWriter(18);
      simpleNode1.dump("^~vk", stringWriter1);
      simpleNode0.setIdentifier(";");
      simpleNode2.dump("d9x,r\".\"<UgVR", stringWriter0);
      simpleNode2.dump(".", stringWriter1);
      simpleNode0.dump("AllocationExpression", stringWriter1);
      simpleNode0.dump("d9x,r\".\"<UgVR", stringWriter0);
      simpleNode0.dump(";", stringWriter0);
      StringWriter stringWriter2 = stringWriter0.append('z');
      simpleNode0.dump("/*", stringWriter2);
      assertEquals("<VariableDeclaratorId>\n  <identifier>.</identifier>\n</VariableDeclaratorId>\n<VariableDeclaratorId>\n  <identifier>.</identifier>\n</VariableDeclaratorId>\n<VariableDeclaratorId>\n</VariableDeclaratorId>\n<VariableDeclaratorId>\n</VariableDeclaratorId>\nz<VariableDeclaratorId>\n</VariableDeclaratorId>\n", stringWriter2.toString());
      assertEquals("<VariableDeclaratorId>\n  <identifier>.</identifier>\n</VariableDeclaratorId>\n<VariableDeclaratorId>\n  <identifier>.</identifier>\n</VariableDeclaratorId>\n<VariableDeclaratorId>\n</VariableDeclaratorId>\n<VariableDeclaratorId>\n</VariableDeclaratorId>\nz<VariableDeclaratorId>\n</VariableDeclaratorId>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(4);
      simpleNode0.toString();
      Node node0 = simpleNode0.parent;
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("TypeDeclaration", stringWriter0);
      simpleNode0.setIdentifier("&&");
      StringWriter stringWriter1 = new StringWriter();
      simpleNode0.dump("F", stringWriter0);
      simpleNode0.dump("q", stringWriter0);
      SimpleNode simpleNode1 = new SimpleNode(4);
      StringWriter stringWriter2 = new StringWriter(1881);
      simpleNode0.dump("F", stringWriter2);
      assertEquals("<TypeDeclaration>\n  <identifier>*amp</identifier>\n</TypeDeclaration>\n", stringWriter2.toString());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("TypeParameters");
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = stringWriter0.append('0');
      SimpleNode simpleNode0 = new SimpleNode('0');
      stringWriter1.append((CharSequence) "TypeParameters");
      simpleNode0.setIdentifier("{");
      simpleNode0.dump("{", stringWriter0);
      stringWriter0.close();
      SimpleNode simpleNode1 = new SimpleNode((-139));
      ArrayList<String> arrayList0 = new ArrayList<String>();
      simpleNode1.dump("TypeParameters", stringWriter0);
      assertEquals("0TypeParameters<RelationalExpression>\n</RelationalExpression>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("TypeParameters");
      StringWriter stringWriter0 = new StringWriter(93);
      StringWriter stringWriter1 = stringWriter0.append(';');
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 54);
      simpleNode0.setIdentifier("TypeParameters");
      JavaParser javaParser1 = new JavaParser("TypeParameters");
      simpleNode0.setIdentifier(">");
      StringWriter stringWriter2 = new StringWriter();
      stringWriter1.append(';');
      simpleNode0.dump("", stringWriter1);
      simpleNode0.dump("TypeParameters", stringWriter1);
      simpleNode0.dump("TypeParameters", stringWriter1);
      assertEquals(";;<PreDecrementExpression>\n  <identifier>TypeParameters</identifier>\n  <identifier>*gt</identifier>\n</PreDecrementExpression>\n<PreDecrementExpression>\n  <identifier>TypeParameters</identifier>\n  <identifier>*gt</identifier>\n</PreDecrementExpression>\n<PreDecrementExpression>\n  <identifier>TypeParameters</identifier>\n  <identifier>*gt</identifier>\n</PreDecrementExpression>\n", stringWriter1.toString());
      assertEquals(";;<PreDecrementExpression>\n  <identifier>TypeParameters</identifier>\n  <identifier>*gt</identifier>\n</PreDecrementExpression>\n<PreDecrementExpression>\n  <identifier>TypeParameters</identifier>\n  <identifier>*gt</identifier>\n</PreDecrementExpression>\n<PreDecrementExpression>\n  <identifier>TypeParameters</identifier>\n  <identifier>*gt</identifier>\n</PreDecrementExpression>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(86);
      simpleNode0.toString();
      simpleNode0.toString();
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump((String) null, stringWriter0);
      simpleNode0.setIdentifier("<=");
      stringWriter0.write("ForUpdate");
      simpleNode0.dump("<=", stringWriter0);
      simpleNode0.setIdentifier("ForUpdate");
      simpleNode0.dump("ForUpdate", stringWriter0);
      simpleNode0.setIdentifier("<<");
      simpleNode0.dump("ForUpdate", stringWriter0);
      simpleNode0.dump("ForUpdate", stringWriter0);
      simpleNode0.dump("*ge", stringWriter0);
      StringWriter stringWriter1 = new StringWriter();
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      JavaParser javaParser0 = new JavaParser("ForUpdate");
      SimpleNode simpleNode1 = new SimpleNode(javaParser0, (-8));
      simpleNode1.dump("", stringWriter1);
      simpleNode1.dump("<=", stringWriter1);
      simpleNode0.dump("RelationalExpression", stringWriter0);
      assertEquals("ForUpdate<ForUpdate>\n  <identifier>*le</identifier>\n</ForUpdate>\n<ForUpdate>\n  <identifier>*le</identifier>\n  <identifier>ForUpdate</identifier>\n</ForUpdate>\n<ForUpdate>\n  <identifier>*le</identifier>\n  <identifier>ForUpdate</identifier>\n  <identifier>*lshft</identifier>\n</ForUpdate>\n<ForUpdate>\n  <identifier>*le</identifier>\n  <identifier>ForUpdate</identifier>\n  <identifier>*lshft</identifier>\n</ForUpdate>\n<ForUpdate>\n  <identifier>*le</identifier>\n  <identifier>ForUpdate</identifier>\n  <identifier>*lshft</identifier>\n</ForUpdate>\n<ForUpdate>\n  <identifier>*le</identifier>\n  <identifier>ForUpdate</identifier>\n  <identifier>*lshft</identifier>\n</ForUpdate>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = stringWriter0.append(']');
      SimpleNode simpleNode0 = new SimpleNode((-2619));
      SimpleNode simpleNode1 = new SimpleNode(63);
      StringWriter stringWriter2 = new StringWriter();
      StringWriter stringWriter3 = new StringWriter();
      simpleNode1.dump("u ", stringWriter2);
      simpleNode0.dump("u ", stringWriter3);
      SimpleNode simpleNode2 = new SimpleNode(63);
      simpleNode2.setIdentifier("AssertStatement");
      simpleNode2.setIdentifier("CB|_p._n}]sCL\"");
      simpleNode0.dump("<", stringWriter2);
      simpleNode1.dump("Literal", stringWriter0);
      JavaParser javaParser0 = new JavaParser("ePIa<*");
      simpleNode2.dump(",P\"7k*-\"", stringWriter1);
      assertEquals("]<Literal>\n<identifier>Literal Value</identifier>\n</Literal>\n", stringWriter1.toString());
      assertEquals("]<Literal>\n<identifier>Literal Value</identifier>\n</Literal>\n", stringWriter0.toString());
  }
}
