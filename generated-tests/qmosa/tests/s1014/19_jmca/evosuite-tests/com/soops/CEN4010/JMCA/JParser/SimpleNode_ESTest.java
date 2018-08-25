/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 13:36:55 GMT 2018
 */

package com.soops.CEN4010.JMCA.JParser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.soops.CEN4010.JMCA.JParser.JavaParser;
import com.soops.CEN4010.JMCA.JParser.Node;
import com.soops.CEN4010.JMCA.JParser.SimpleNode;
import java.io.PipedInputStream;
import java.io.StringWriter;
import java.nio.CharBuffer;
import java.util.ArrayList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SimpleNode_ESTest extends SimpleNode_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("");
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, (-3157));
      simpleNode0.jjtGetParent();
      simpleNode0.jjtGetParent();
      simpleNode0.jjtClose();
      simpleNode0.jjtAddChild((Node) null, 440);
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      simpleNode0.identifiers = arrayList0;
      // Undeclared exception!
      try { 
        simpleNode0.jjtAddChild((Node) null, (-3157));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3157
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(52);
      StringWriter stringWriter0 = new StringWriter(1298);
      stringWriter0.close();
      stringWriter0.append((CharSequence) "a+OLzwgM~Jp!(*4-%");
      char[] charArray0 = new char[8];
      charArray0[0] = 'm';
      charArray0[1] = 'm';
      charArray0[2] = 'm';
      charArray0[3] = '';
      charArray0[4] = 'm';
      charArray0[5] = 'm';
      charArray0[6] = 'm';
      charArray0[7] = 'm';
      stringWriter0.write(charArray0);
      stringWriter0.append('m');
      simpleNode0.dump("a+OLzwgM~Jp!(*4-%", stringWriter0);
      simpleNode0.toString("&");
      // Undeclared exception!
      try { 
        simpleNode0.jjtGetChild(613);
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
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.setIdentifier("nt");
      simpleNode0.jjtGetParent();
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      simpleNode0.identifiers = arrayList0;
      simpleNode0.jjtSetParent((Node) null);
      simpleNode0.jjtGetNumChildren();
      int int0 = simpleNode0.jjtGetNumChildren();
      assertEquals(0, int0);
      
      simpleNode0.jjtSetParent((Node) null);
      simpleNode0.toString("");
      simpleNode0.toString();
      String string0 = simpleNode0.toString("");
      assertEquals("CompilationUnit : nt", string0);
      
      simpleNode0.jjtClose();
      simpleNode0.jjtOpen();
      simpleNode0.jjtClose();
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.9061547465398496
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.jjtGetNumChildren();
      StringWriter stringWriter0 = new StringWriter();
      stringWriter0.append('4');
      simpleNode0.dump("-Oux_2>3<4\\VwL$@-P", stringWriter0);
      simpleNode0.jjtGetNumChildren();
      simpleNode0.toString("yT^2}.@k8");
      StringWriter stringWriter1 = new StringWriter();
      simpleNode0.dump("-Oux_2>3<4\\VwL$@-P", stringWriter1);
      simpleNode0.setIdentifier("yT^2}.@k8CompilationUnit");
      SimpleNode simpleNode1 = new SimpleNode(0);
      simpleNode0.jjtGetParent();
      simpleNode0.dump("v-y|+V[;LF`", stringWriter0);
      assertEquals("4<CompilationUnit>\n  <identifier>yT^2}.@k8CompilationUnit</identifier>\n</CompilationUnit>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = 114;
      SimpleNode simpleNode0 = new SimpleNode(114);
      String string0 = "";
      JavaParser javaParser0 = new JavaParser("");
      SimpleNode simpleNode1 = new SimpleNode(javaParser0, 58);
      Node[] nodeArray0 = new Node[0];
      simpleNode0.children = nodeArray0;
      simpleNode1.setIdentifier("");
      simpleNode1.toString();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      simpleNode0.identifiers = arrayList0;
      int int1 = 18;
      simpleNode0.id = 18;
      simpleNode0.jjtAddChild(simpleNode1, 58);
      simpleNode1.parser = javaParser0;
      simpleNode0.jjtGetParent();
      simpleNode0.parent = null;
      simpleNode0.jjtGetNumChildren();
      simpleNode1.jjtAddChild((Node) null, 59);
      simpleNode0.jjtGetNumChildren();
      simpleNode0.toString("");
      ArrayList<String> arrayList1 = simpleNode0.identifiers;
      simpleNode1.identifiers = arrayList1;
      simpleNode0.jjtOpen();
      // Undeclared exception!
      try { 
        simpleNode0.jjtGetChild(59);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 59
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.2424533248940002
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("&");
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 1882);
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("s.", stringWriter0);
      SimpleNode simpleNode1 = new SimpleNode(1882);
      simpleNode1.jjtAddChild(simpleNode0, 1882);
      // Undeclared exception!
      try { 
        simpleNode1.dump("&", stringWriter0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1882
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.04138000510499
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.jjtGetNumChildren();
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.jjtSetParent((Node) null);
      stringWriter0.append('4');
      simpleNode0.dump("q,p5N9", stringWriter0);
      simpleNode0.jjtGetNumChildren();
      simpleNode0.toString("yT^2}.@k8");
      StringWriter stringWriter1 = new StringWriter();
      simpleNode0.dump("&&", stringWriter0);
      simpleNode0.setIdentifier("&");
      simpleNode0.dump("yT^2}.@k8", stringWriter0);
      assertEquals("4<CompilationUnit>\n  <identifier>*amp</identifier>\n</CompilationUnit>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.2275294114572126
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(52);
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = new StringWriter();
      simpleNode0.toString("*ge");
      StringWriter stringWriter2 = new StringWriter();
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      simpleNode0.dump("*ge", stringWriter2);
      simpleNode0.setIdentifier("h\"<a)_vm");
      SimpleNode simpleNode1 = new SimpleNode(1298);
      simpleNode0.setIdentifier(";");
      SimpleNode simpleNode2 = new SimpleNode((-2339));
      SimpleNode simpleNode3 = new SimpleNode((-884));
      simpleNode0.dump("<<", stringWriter1);
      simpleNode1.dump("*geUnaryExpression", stringWriter1);
      simpleNode3.dump((String) null, stringWriter1);
      assertEquals("<UnaryExpression>\n  <identifier>h\"<a)_vm</identifier>\n</UnaryExpression>\n", stringWriter1.toString());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.1894736293243366
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.jjtGetNumChildren();
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.jjtSetParent((Node) null);
      StringWriter stringWriter1 = stringWriter0.append('4');
      simpleNode0.dump("q,p5N9", stringWriter1);
      simpleNode0.jjtGetNumChildren();
      simpleNode0.toString("yT^2}.@k8");
      StringWriter stringWriter2 = new StringWriter();
      simpleNode0.toString();
      simpleNode0.dump("yT^2}.@k8CompilationUnit", stringWriter1);
      simpleNode0.setIdentifier(">>");
      simpleNode0.dump("jWTu$aEAF6py^+", stringWriter1);
      simpleNode0.dump("q,p5N9", stringWriter2);
      assertEquals("<CompilationUnit>\n  <identifier>*rshft</identifier>\n</CompilationUnit>\n", stringWriter2.toString());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.0102750119258221
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(10);
      SimpleNode simpleNode1 = new SimpleNode((-2076016974));
      simpleNode0.parent = (Node) simpleNode1;
      simpleNode0.jjtGetNumChildren();
      StringWriter stringWriter0 = new StringWriter();
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "*rshft");
      simpleNode0.jjtSetParent((Node) null);
      StringWriter stringWriter1 = stringWriter0.append('(');
      StringWriter stringWriter2 = stringWriter1.append('(');
      simpleNode0.dump("q,p5N9", stringWriter1);
      simpleNode0.jjtGetNumChildren();
      simpleNode0.toString("q,p5N9");
      StringWriter stringWriter3 = new StringWriter();
      simpleNode0.dump("yT^2}.@k8", stringWriter3);
      simpleNode0.setIdentifier("&&");
      simpleNode0.dump("&", stringWriter2);
      assertEquals("((<EnumConstant>\n  <identifier>*amp</identifier>\n</EnumConstant>\n", stringWriter2.toString());
      assertEquals("((<EnumConstant>\n  <identifier>*amp</identifier>\n</EnumConstant>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.3897154547004784
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(52);
      StringWriter stringWriter0 = new StringWriter(52);
      StringWriter stringWriter1 = new StringWriter();
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "*rshft");
      simpleNode0.jjtSetParent((Node) null);
      stringWriter0.append('7');
      StringWriter stringWriter2 = stringWriter0.append('U');
      simpleNode0.dump("*rshft", stringWriter1);
      simpleNode0.jjtGetNumChildren();
      simpleNode0.toString("mIUJ`7w2&k");
      StringWriter stringWriter3 = new StringWriter();
      simpleNode0.dump("\"/=\"", stringWriter2);
      simpleNode0.setIdentifier("");
      simpleNode0.dump("MemberValuePair", stringWriter2);
      assertEquals("7U<UnaryExpression>\n</UnaryExpression>\n", stringWriter2.toString());
      assertEquals("7U<UnaryExpression>\n</UnaryExpression>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.14839214282331
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.jjtGetNumChildren();
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.jjtSetParent((Node) null);
      simpleNode0.dump("q,p5N9", stringWriter0);
      simpleNode0.jjtGetNumChildren();
      simpleNode0.toString("yT^2}.@k8");
      StringWriter stringWriter1 = new StringWriter();
      simpleNode0.dump("&&", stringWriter0);
      SimpleNode simpleNode1 = new SimpleNode((-2045465869));
      simpleNode1.dump("<<", stringWriter1);
      simpleNode1.setIdentifier("yT^2}.@k8");
      StringWriter stringWriter2 = new StringWriter();
      simpleNode0.dump("q,p5N9", stringWriter1);
      simpleNode0.setIdentifier("<<");
      simpleNode0.dump((String) null, stringWriter0);
      assertEquals("<CompilationUnit>\n  <identifier>*lshft</identifier>\n</CompilationUnit>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.0791615912646864
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.jjtGetNumChildren();
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.jjtSetParent((Node) null);
      StringWriter stringWriter1 = stringWriter0.append('4');
      simpleNode0.dump("q,p5N9", stringWriter0);
      simpleNode0.jjtGetNumChildren();
      stringWriter1.close();
      StringWriter stringWriter2 = new StringWriter();
      simpleNode0.toString();
      StringWriter stringWriter3 = new StringWriter();
      simpleNode0.dump((String) null, stringWriter1);
      simpleNode0.setIdentifier("<");
      StringWriter stringWriter4 = new StringWriter();
      simpleNode0.dump("yT^2}.@k8", stringWriter1);
      simpleNode0.setIdentifier("");
      simpleNode0.dump("CompilationUnit", stringWriter3);
      assertEquals("<CompilationUnit>\n  <identifier>*lt</identifier>\n</CompilationUnit>\n", stringWriter3.toString());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.9017412329512398
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(51);
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = new StringWriter();
      simpleNode0.jjtGetNumChildren();
      simpleNode0.toString("MemberValuePair");
      StringWriter stringWriter2 = new StringWriter();
      simpleNode0.dump("MemberValuePair", stringWriter2);
      simpleNode0.setIdentifier("byte");
      StringWriter stringWriter3 = new StringWriter();
      simpleNode0.dump("MemberValuePair", stringWriter0);
      simpleNode0.setIdentifier(">=");
      stringWriter1.append((CharSequence) "byte");
      StringWriter stringWriter4 = new StringWriter();
      stringWriter4.append('.');
      simpleNode0.dump("R,&G", stringWriter2);
      assertEquals("<MultiplicativeExpression>\n  <identifier>byte</identifier>\n  <identifier>*ge</identifier>\n</MultiplicativeExpression>\n", stringWriter2.toString());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.6837389058487535
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(60);
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump((String) null, stringWriter0);
      simpleNode0.setIdentifier("6iN>U)4+");
      char char0 = 's';
      StringWriter stringWriter1 = stringWriter0.append('s');
      String string0 = "DefaultValue";
      simpleNode0.dump((String) null, stringWriter1);
      simpleNode0.setIdentifier("}");
      StringWriter stringWriter2 = stringWriter1.append((CharSequence) "DefaultValue");
      simpleNode0.dump((String) null, stringWriter2);
      // Undeclared exception!
      try { 
        CharBuffer.wrap((CharSequence) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.CharBuffer", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.2852930241200993
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(51);
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.jjtGetNumChildren();
      simpleNode0.toString("MemberValuePair");
      StringWriter stringWriter1 = new StringWriter();
      StringWriter stringWriter2 = stringWriter1.append((CharSequence) "MemberValuePair");
      simpleNode0.dump("cm", stringWriter2);
      simpleNode0.setIdentifier("R(2M{WwL");
      StringWriter stringWriter3 = new StringWriter();
      simpleNode0.dump("MultiplicativeExpression", stringWriter3);
      simpleNode0.setIdentifier("{");
      StringWriter stringWriter4 = stringWriter0.append((CharSequence) ">=");
      StringWriter stringWriter5 = new StringWriter();
      simpleNode0.dump(" wI@`[>!|U!{J%`", stringWriter3);
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)60;
      byteArray0[1] = (byte)88;
      byteArray0[2] = (byte) (-35);
      byteArray0[3] = (byte)29;
      byteArray0[4] = (byte)97;
      byteArray0[5] = (byte) (-110);
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      simpleNode0.dump("ev[Qw;T6", stringWriter1);
      simpleNode0.dump("`Mu_qx:5g", stringWriter4);
      assertEquals(">=<MultiplicativeExpression>\n  <identifier>R(2M{WwL</identifier>\n</MultiplicativeExpression>\n", stringWriter4.toString());
      assertEquals(">=<MultiplicativeExpression>\n  <identifier>R(2M{WwL</identifier>\n</MultiplicativeExpression>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.1894736293243366
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(51);
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = new StringWriter();
      StringWriter stringWriter2 = new StringWriter();
      simpleNode0.jjtGetNumChildren();
      simpleNode0.toString("?zC=]=\"nNiS\"aJ$a;wv");
      StringWriter stringWriter3 = new StringWriter();
      simpleNode0.toString("UT");
      StringWriter stringWriter4 = new StringWriter();
      simpleNode0.dump(".%k", stringWriter3);
      simpleNode0.setIdentifier("UT");
      StringWriter stringWriter5 = new StringWriter();
      JavaParser javaParser0 = new JavaParser("char");
      SimpleNode simpleNode1 = new SimpleNode(javaParser0, 4);
      simpleNode1.dump("`Mu_qx:5g", stringWriter0);
      simpleNode0.setIdentifier(">");
      StringWriter stringWriter6 = stringWriter0.append((CharSequence) "?3@-Rx)eE");
      StringWriter stringWriter7 = new StringWriter();
      simpleNode0.dump("</", stringWriter6);
      simpleNode1.dump("\"transient\"", stringWriter0);
      assertEquals("?3@-Rx)eE<MultiplicativeExpression>\n  <identifier>UT</identifier>\n  <identifier>*gt</identifier>\n</MultiplicativeExpression>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.6614769771805253
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(43);
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.toString("MemberValuePair");
      StringWriter stringWriter1 = new StringWriter();
      simpleNode0.dump("MemberValuePair", stringWriter1);
      simpleNode0.setIdentifier("byte");
      simpleNode0.dump("MemberValuePair", stringWriter0);
      simpleNode0.toString();
      simpleNode0.dump("MemberValuePair", stringWriter1);
      simpleNode0.dump("~_DH", stringWriter0);
      Node[] nodeArray0 = new Node[5];
      nodeArray0[0] = (Node) simpleNode0;
      nodeArray0[1] = (Node) simpleNode0;
      nodeArray0[2] = (Node) simpleNode0;
      nodeArray0[3] = (Node) simpleNode0;
      nodeArray0[4] = (Node) simpleNode0;
      simpleNode0.children = nodeArray0;
      // Undeclared exception!
      try { 
        simpleNode0.dump("EnumDeclartion", stringWriter1);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.9320738874454946
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(66);
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = new StringWriter();
      simpleNode0.toString("6Dw4WC(>&");
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      JavaParser javaParser0 = new JavaParser(pipedInputStream0);
      SimpleNode simpleNode1 = new SimpleNode(javaParser0, 66);
      StringWriter stringWriter2 = new StringWriter(66);
      simpleNode1.dump("7s\"X", stringWriter2);
      SimpleNode simpleNode2 = new SimpleNode(javaParser0, (-1060));
      simpleNode0.setIdentifier("<=");
      StringWriter stringWriter3 = new StringWriter();
      simpleNode0.dump("[;WEKmdx>mM6|]aJi", stringWriter1);
      JavaParser javaParser1 = new JavaParser(pipedInputStream0);
      SimpleNode simpleNode3 = new SimpleNode(javaParser1, (-1910504865));
      simpleNode0.setIdentifier("6Dw4WC(>&Arguments");
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      SimpleNode simpleNode4 = new SimpleNode(94);
      simpleNode4.dump("W+X5&P>MI1X>;B", stringWriter3);
      simpleNode2.dump("7PG", stringWriter3);
      simpleNode0.dump("[;WEKmdx>mM6|]aJi", stringWriter1);
      simpleNode4.dump("6Dw4WC(>&", stringWriter3);
      assertFalse(simpleNode4.equals((Object)simpleNode0));
  }
}