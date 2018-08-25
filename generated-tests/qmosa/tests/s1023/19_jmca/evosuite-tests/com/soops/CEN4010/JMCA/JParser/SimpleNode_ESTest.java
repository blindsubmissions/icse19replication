/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 16:02:57 GMT 2018
 */

package com.soops.CEN4010.JMCA.JParser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.soops.CEN4010.JMCA.JParser.JavaCharStream;
import com.soops.CEN4010.JMCA.JParser.JavaParser;
import com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager;
import com.soops.CEN4010.JMCA.JParser.Node;
import com.soops.CEN4010.JMCA.JParser.SimpleNode;
import java.io.StringReader;
import java.io.StringWriter;
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
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(50);
      StringWriter stringWriter0 = new StringWriter(0);
      stringWriter0.append((CharSequence) "V#t!zGzXZox|N6C&");
      simpleNode0.dump("V#t!zGzXZox|N6C&", stringWriter0);
      simpleNode0.toString("<=");
      simpleNode0.jjtGetParent();
      simpleNode0.toString("Mw1^Sp'N");
      simpleNode0.id = 0;
      simpleNode0.jjtGetParent();
      simpleNode0.jjtOpen();
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
  //Test case number: 1
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = 504;
      SimpleNode simpleNode0 = new SimpleNode(504);
      simpleNode0.children = null;
      Node node0 = simpleNode0.parent;
      simpleNode0.parent = null;
      String string0 = "]f";
      simpleNode0.setIdentifier("]f");
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
  //Test case number: 2
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = 2663;
      SimpleNode simpleNode0 = new SimpleNode(2663);
      String string0 = "";
      StringReader stringReader0 = new StringReader("");
      stringReader0.markSupported();
      JavaParser javaParser0 = new JavaParser(stringReader0);
      Node node0 = javaParser0.currNode;
      int int1 = 0;
      simpleNode0.jjtAddChild((Node) null, 0);
      try { 
        javaParser0.ContinueStatement();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Parse error at line 1, column 0.  Encountered: <EOF>
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParser", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.1639556568820564
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("Ndi<|n[ ");
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 1);
      simpleNode0.jjtGetParent();
      simpleNode0.jjtOpen();
      simpleNode0.toString();
      simpleNode0.setIdentifier("");
      simpleNode0.jjtGetParent();
      simpleNode0.jjtSetParent((Node) null);
      simpleNode0.jjtSetParent((Node) null);
      simpleNode0.toString();
      simpleNode0.jjtClose();
      simpleNode0.toString();
      simpleNode0.setIdentifier("PackageDeclaration : ");
      simpleNode0.jjtGetNumChildren();
      simpleNode0.parser = javaParser0;
      simpleNode0.jjtGetParent();
      String string0 = "";
      StringWriter stringWriter0 = null;
      try {
        stringWriter0 = new StringWriter((-1321));
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
  /*Coverage entropy=1.4978661367769954
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(7);
      simpleNode0.toString();
      simpleNode0.toString();
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = stringWriter0.append((CharSequence) "ImplementsList");
      simpleNode0.dump("<+/Kb1", stringWriter1);
      StringReader stringReader0 = new StringReader("ImplementsList");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "ImplementsList");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 0, 7, 7);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      JavaParser javaParser0 = new JavaParser(javaParserTokenManager0);
      SimpleNode simpleNode1 = new SimpleNode(javaParser0, 10);
      simpleNode0.jjtAddChild(simpleNode1, 7);
      int int0 = simpleNode0.jjtGetNumChildren();
      assertEquals(8, int0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.2424533248940002
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((-3615));
      simpleNode0.jjtOpen();
      simpleNode0.jjtOpen();
      Node[] nodeArray0 = new Node[0];
      simpleNode0.children = nodeArray0;
      Node node0 = simpleNode0.parent;
      simpleNode0.jjtSetParent((Node) null);
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      arrayList0.add("");
      simpleNode0.identifiers = arrayList0;
      simpleNode0.jjtAddChild((Node) null, 0);
      int int0 = (-1);
      // Undeclared exception!
      try { 
        simpleNode0.jjtAddChild((Node) null, (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.4750763110546947
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(7);
      simpleNode0.toString();
      simpleNode0.toString();
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = stringWriter0.append((CharSequence) "ImplementsList");
      simpleNode0.dump("<+/Kb1", stringWriter1);
      StringReader stringReader0 = new StringReader("ImplementsList");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 0, 7, 7);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      JavaParser javaParser0 = new JavaParser(javaParserTokenManager0);
      SimpleNode simpleNode1 = new SimpleNode(javaParser0, 10);
      simpleNode0.jjtAddChild(simpleNode1, 7);
      simpleNode0.dump("FieldDeclaration", stringWriter0);
      assertEquals("ImplementsList<ImplementsList></ImplementsList>\n", stringWriter0.toString());
      assertEquals(8, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.5875009311062074
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(7);
      simpleNode0.toString();
      simpleNode0.toString();
      simpleNode0.toString();
      StringWriter stringWriter0 = new StringWriter();
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)90;
      byteArray0[1] = (byte)90;
      byteArray0[2] = (byte)90;
      byteArray0[3] = (byte)90;
      byteArray0[4] = (byte)90;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      StringWriter stringWriter1 = new StringWriter();
      simpleNode0.setIdentifier("&");
      simpleNode0.dump("-)M5,?", stringWriter0);
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      simpleNode0.dump("if", stringWriter0);
      StringWriter stringWriter2 = new StringWriter((byte)90);
      simpleNode0.dump("ImplementsList", stringWriter0);
      simpleNode0.dump("&", stringWriter0);
      assertEquals("<ImplementsList>\n  <identifier>*amp</identifier>\n</ImplementsList>\n<ImplementsList>\n  <identifier>*amp</identifier>\n</ImplementsList>\n<ImplementsList>\n  <identifier>*amp</identifier>\n</ImplementsList>\n<ImplementsList>\n  <identifier>*amp</identifier>\n</ImplementsList>\n", stringWriter0.toString());
      
      simpleNode0.dump("-)M5,?", stringWriter2);
      stringWriter2.close();
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "ImplementsList");
      SimpleNode simpleNode1 = new SimpleNode(10);
      simpleNode1.dump("\"-\"", stringWriter2);
      assertEquals("<ImplementsList>\n  <identifier>*amp</identifier>\n</ImplementsList>\n", stringWriter2.toString());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.0791615912646864
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(38);
      simpleNode0.toString();
      simpleNode0.toString();
      StringWriter stringWriter0 = new StringWriter();
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)90;
      byteArray0[1] = (byte)90;
      byteArray0[2] = (byte)90;
      byteArray0[3] = (byte)90;
      byteArray0[4] = (byte)90;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      StringWriter stringWriter1 = new StringWriter();
      simpleNode0.setIdentifier(">");
      simpleNode0.dump("Expression", stringWriter0);
      stringWriter0.write(1661);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "Expression");
      simpleNode0.dump("if", stringWriter0);
      simpleNode0.dump(">", stringWriter0);
      simpleNode0.dump("Expression", stringWriter1);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "Expression");
      SimpleNode simpleNode1 = new SimpleNode(22);
      simpleNode1.toString("_");
      simpleNode0.dump("C<o?xRMKYEL\"U/R,4D", stringWriter1);
      simpleNode1.jjtAddChild(simpleNode0, (byte)90);
      simpleNode1.dump("4L+4ca\u0002JAQV{", stringWriter0);
      simpleNode1.dump("Expression", stringWriter1);
      assertEquals(91, simpleNode1.jjtGetNumChildren());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.8855741515766717
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(38);
      simpleNode0.toString();
      simpleNode0.toString();
      StringWriter stringWriter0 = new StringWriter();
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)90;
      byteArray0[1] = (byte)90;
      byteArray0[2] = (byte)90;
      byteArray0[3] = (byte)90;
      byteArray0[4] = (byte)90;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      StringWriter stringWriter1 = new StringWriter();
      simpleNode0.setIdentifier("");
      simpleNode0.dump("Expression", stringWriter0);
      stringWriter0.write(1661);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "Expression");
      // Undeclared exception!
      try { 
        stringWriter0.write((char[]) null, (int) (byte)90, 1053);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringWriter", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.9404479886553264
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(7);
      simpleNode0.toString();
      simpleNode0.toString();
      StringWriter stringWriter0 = new StringWriter(7);
      simpleNode0.setIdentifier("Q");
      SimpleNode simpleNode1 = new SimpleNode(10);
      simpleNode0.setIdentifier("}");
      SimpleNode simpleNode2 = new SimpleNode(10);
      simpleNode1.dump("Q", stringWriter0);
      simpleNode0.dump("ImplementsList", stringWriter0);
      simpleNode1.dump("\"&\"", stringWriter0);
      simpleNode2.dump("\"&\"", stringWriter0);
      assertEquals("<ImplementsList>\n  <identifier>Q</identifier>\n</ImplementsList>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.806504609875222
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(7);
      simpleNode0.setIdentifier("\"false\"");
      simpleNode0.toString();
      simpleNode0.toString();
      StringWriter stringWriter0 = new StringWriter(7);
      String string0 = "<=";
      simpleNode0.setIdentifier("<=");
      simpleNode0.dump("ImplementsList : \"false\"", stringWriter0);
      StringWriter stringWriter1 = new StringWriter();
      stringWriter1.close();
      // Undeclared exception!
      try { 
        simpleNode0.jjtAddChild((Node) null, (-1391));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.6096274235960984
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(38);
      simpleNode0.toString();
      simpleNode0.toString();
      StringWriter stringWriter0 = new StringWriter();
      SystemInUtil.addInputLine("Expression");
      SystemInUtil.addInputLine("7 r{");
      StringWriter stringWriter1 = new StringWriter();
      Node[] nodeArray0 = new Node[19];
      nodeArray0[0] = (Node) simpleNode0;
      nodeArray0[1] = (Node) simpleNode0;
      simpleNode0.setIdentifier(">=");
      SimpleNode simpleNode1 = new SimpleNode(71);
      StringReader stringReader0 = new StringReader("&&");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, (-1880948502), 71, 1);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      JavaParser javaParser0 = new JavaParser(javaParserTokenManager0);
      simpleNode1.parser = javaParser0;
      simpleNode0.dump("7 r{", stringWriter0);
      simpleNode0.dump("*amp", stringWriter1);
      simpleNode1.dump("*amp", stringWriter0);
      simpleNode0.dump(">=", stringWriter0);
      assertEquals("<Expression>\n  <identifier>*ge</identifier>\n</Expression>\n<Expression>\n  <identifier>*ge</identifier>\n</Expression>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.9404479886553264
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(38);
      simpleNode0.toString();
      simpleNode0.toString();
      StringWriter stringWriter0 = new StringWriter();
      byte[] byteArray0 = new byte[5];
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      StringWriter stringWriter1 = new StringWriter();
      simpleNode0.setIdentifier(">");
      simpleNode0.dump("Expression", stringWriter0);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "Expression");
      simpleNode0.dump(">", stringWriter0);
      simpleNode0.dump("Expression", stringWriter1);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "Expression");
      simpleNode0.setIdentifier("{");
      simpleNode0.dump("<identifier>Literal Value</identifier>\n", stringWriter0);
      simpleNode0.dump("[PtHG_ZFh*", stringWriter0);
      StringWriter stringWriter2 = new StringWriter();
      stringWriter0.append((CharSequence) "transient");
      simpleNode0.dump("<identifier>Literal Value</identifier>\n", stringWriter1);
      simpleNode0.dump("PreDecrementExpression", stringWriter1);
      simpleNode0.dump("<identifier>Literal Value</identifier>\n", stringWriter0);
      StringWriter stringWriter3 = new StringWriter(38);
      simpleNode0.dump((String) null, stringWriter3);
      assertEquals("<Expression>\n  <identifier>*gt</identifier>\n</Expression>\n", stringWriter3.toString());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.7201248812718097
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(7);
      simpleNode0.toString();
      simpleNode0.toString();
      StringWriter stringWriter0 = new StringWriter();
      String string0 = "6gA%UNQHCBq+,2?!c";
      SystemInUtil.addInputLine("6gA%UNQHCBq+,2?!c");
      EvoSuiteFile evoSuiteFile0 = null;
      SystemInUtil.addInputLine("<");
      String string1 = "&0";
      simpleNode0.setIdentifier(">>");
      simpleNode0.dump("MemberValueArrayInitializer", stringWriter0);
      StringWriter stringWriter1 = new StringWriter(271);
      // Undeclared exception!
      try { 
        stringWriter1.append((CharSequence) "MemberValueArrayInitializer", 356, 7);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }
}