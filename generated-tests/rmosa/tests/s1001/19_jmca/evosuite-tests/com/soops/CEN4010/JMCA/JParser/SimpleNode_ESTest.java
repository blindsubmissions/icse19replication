/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 05:05:56 GMT 2018
 */

package com.soops.CEN4010.JMCA.JParser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.soops.CEN4010.JMCA.JParser.JJTJavaParserState;
import com.soops.CEN4010.JMCA.JParser.JavaParser;
import com.soops.CEN4010.JMCA.JParser.Node;
import com.soops.CEN4010.JMCA.JParser.SimpleNode;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
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
  /*Coverage entropy=0.6248603116943127
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(30);
      StringWriter stringWriter0 = new StringWriter();
      stringWriter0.flush();
      simpleNode0.toString("L:C");
      StringWriter stringWriter1 = stringWriter0.append('^');
      simpleNode0.dump("L:C", stringWriter1);
      simpleNode0.setIdentifier("<");
      stringWriter1.write("L:C");
      Node node0 = simpleNode0.parent;
      FileSystemHandling.shouldAllThrowIOExceptions();
      simpleNode0.dump("MethodDeclarator", stringWriter0);
      simpleNode0.dump("L:C", stringWriter1);
      assertEquals("^L:C<ClassOrInterfaceType>\n  <identifier>*lt</identifier>\n</ClassOrInterfaceType>\n<ClassOrInterfaceType>\n  <identifier>*lt</identifier>\n</ClassOrInterfaceType>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.48439011623800354
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(68);
      SystemInUtil.addInputLine("x46dIZZ%E=F");
      simpleNode0.toString();
      StringWriter stringWriter0 = new StringWriter();
      stringWriter0.flush();
      simpleNode0.dump("L:C", (Writer) null);
      simpleNode0.setIdentifier("<");
      Node node0 = simpleNode0.parent;
      stringWriter0.write("BooleanLiteral");
      simpleNode0.parent = null;
      stringWriter0.write(68);
      stringWriter0.append((CharSequence) "L:C");
      simpleNode0.dump("Qdt,R(w=4kn#", stringWriter0);
      assertEquals("BooleanLiteralDL:C<AllocationExpression>\n  <identifier>*lt</identifier>\n</AllocationExpression>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.6248603116943127
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("$bGb_?)");
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 37);
      FileSystemHandling.shouldAllThrowIOExceptions();
      simpleNode0.setIdentifier(">=");
      SimpleNode simpleNode1 = new SimpleNode(javaParser0, (-1105601886));
      simpleNode1.jjtSetParent(simpleNode0);
      StringWriter stringWriter0 = new StringWriter();
      simpleNode1.dump("$bGb_?)", stringWriter0);
      simpleNode0.dump("", stringWriter0);
      simpleNode1.dump("6(6s#Nw}bby7b", stringWriter0);
      simpleNode0.dump("*lt", stringWriter0);
      assertEquals("<NameList>\n  <identifier>*ge</identifier>\n</NameList>\n<NameList>\n  <identifier>*ge</identifier>\n</NameList>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      Node node0 = simpleNode0.jjtGetParent();
      assertNull(node0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.4709001279172663
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("$bGb)");
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 37);
      simpleNode0.setIdentifier(">=");
      StringWriter stringWriter0 = new StringWriter();
      stringWriter0.append('j');
      ArrayList<String> arrayList0 = new ArrayList<String>();
      simpleNode0.identifiers = arrayList0;
      StringWriter stringWriter1 = new StringWriter(94);
      SimpleNode simpleNode1 = new SimpleNode(javaParser0, 'j');
      simpleNode1.dump("$bGb)", stringWriter1);
      simpleNode0.setIdentifier("{");
      simpleNode1.setIdentifier(">=");
      SimpleNode simpleNode2 = new SimpleNode(javaParser0, 37);
      simpleNode0.dump("{", stringWriter1);
      simpleNode1.dump((String) null, stringWriter0);
      simpleNode1.dump("$bGb_?)", stringWriter0);
      simpleNode0.dump("{", stringWriter1);
      assertEquals("<NameList>\n</NameList>\n<NameList>\n</NameList>\n", stringWriter1.toString());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.6598720137848267
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(750);
      SimpleNode simpleNode1 = new SimpleNode(95);
      simpleNode1.jjtSetParent(simpleNode0);
      simpleNode1.jjtAddChild(simpleNode0, 41);
      StringWriter stringWriter0 = new StringWriter();
      simpleNode1.parent = (Node) simpleNode0;
      Node node0 = simpleNode0.parent;
      simpleNode1.dump("ra/gy1;E:TH$'vTgZO", stringWriter0);
      assertEquals(42, simpleNode1.jjtGetNumChildren());
      
      simpleNode0.dump("ra/gy1;E:TH$'vTgZO", stringWriter0);
      assertEquals("<Annotation></Annotation>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JavaParser javaParser0 = new JavaParser(stringReader0);
      SimpleNode simpleNode0 = new SimpleNode((-1843015613));
      simpleNode0.jjtClose();
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.5481178804418445
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = "M?w(7\"9/_cTuR1$@p*U";
      JavaParser javaParser0 = new JavaParser("M?w(7\"9/_cTuR1$@p*U");
      int int0 = 47;
      SimpleNode simpleNode0 = new SimpleNode(47);
      simpleNode0.setIdentifier("M?w(7\"9/_cTuR1$@p*U");
      Node[] nodeArray0 = new Node[5];
      nodeArray0[0] = (Node) simpleNode0;
      // Undeclared exception!
      try { 
        simpleNode0.jjtGetChild(171);
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
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((-392));
      JavaParser javaParser0 = new JavaParser("");
      SimpleNode simpleNode1 = new SimpleNode(javaParser0, (-392));
      simpleNode0.parent = (Node) simpleNode1;
      int int0 = simpleNode0.jjtGetNumChildren();
      assertEquals(0, int0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int int0 = 0;
      String string0 = "9";
      JavaParser javaParser0 = new JavaParser("9");
      int int1 = (-2147483647);
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, (-2147483647));
      JJTJavaParserState jJTJavaParserState0 = new JJTJavaParserState();
      JJTJavaParserState jJTJavaParserState1 = new JJTJavaParserState();
      jJTJavaParserState1.pushNode(simpleNode0);
      SimpleNode simpleNode1 = (SimpleNode)jJTJavaParserState1.rootNode();
      simpleNode0.jjtAddChild(simpleNode1, 0);
      simpleNode0.jjtGetNumChildren();
      // Undeclared exception!
      try { 
        simpleNode1.toString();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2147483647
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.5481178804418445
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(53);
      StringWriter stringWriter0 = new StringWriter(53);
      simpleNode0.setIdentifier("D");
      char[] charArray0 = new char[6];
      simpleNode0.toString();
      charArray0[0] = '?';
      stringWriter0.write(charArray0);
      simpleNode0.children = null;
      simpleNode0.dump("D", stringWriter0);
      simpleNode0.dump("UnaryExpression", stringWriter0);
      simpleNode0.dump("r.jczug'~5iL&ym(S=U", stringWriter0);
      assertEquals("?\u0000\u0000\u0000\u0000\u0000<PreIncrementExpression>\n  <identifier>D</identifier>\n</PreIncrementExpression>\n<PreIncrementExpression>\n  <identifier>D</identifier>\n</PreIncrementExpression>\n<PreIncrementExpression>\n  <identifier>D</identifier>\n</PreIncrementExpression>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.6614769771805253
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("$bGb)");
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 37);
      String string0 = ">=";
      simpleNode0.setIdentifier(">=");
      StringWriter stringWriter0 = new StringWriter();
      stringWriter0.flush();
      StringWriter stringWriter1 = stringWriter0.append('o');
      simpleNode0.dump("SynchronizedStatement", stringWriter0);
      simpleNode0.setIdentifier("<");
      Node node0 = simpleNode0.parent;
      char[] charArray0 = new char[9];
      charArray0[0] = 'o';
      charArray0[1] = 'o';
      charArray0[2] = 'o';
      charArray0[3] = 'o';
      charArray0[4] = 'o';
      charArray0[5] = 'o';
      charArray0[6] = 'o';
      charArray0[7] = 'o';
      charArray0[8] = 'o';
      stringWriter1.write(charArray0);
      StringWriter stringWriter2 = new StringWriter();
      StringWriter stringWriter3 = stringWriter1.append((CharSequence) ">=");
      simpleNode0.dump("SynchronizedStatement", stringWriter2);
      simpleNode0.dump(">=", stringWriter3);
      String string1 = "Annotation";
      try { 
        javaParser0.TypeParameter();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Parse error at line 1, column 0.  Encountered: <EOF>
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParser", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.33422114621338295
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(53);
      simpleNode0.setIdentifier("%");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.setIdentifier("%");
      char[] charArray0 = new char[6];
      charArray0[0] = '?';
      charArray0[1] = 'P';
      charArray0[2] = '`';
      charArray0[3] = '?';
      charArray0[4] = '~';
      simpleNode0.dump("CompilationUnit", stringWriter0);
      SimpleNode simpleNode1 = new SimpleNode((-1106552649));
      simpleNode1.dump("%", stringWriter0);
      simpleNode0.dump("CompilationUnit", stringWriter0);
      simpleNode1.dump("IN_SINGLE_LINE_COMMENT", stringWriter0);
      assertEquals("<PreIncrementExpression>\n  <identifier>%</identifier>\n  <identifier>%</identifier>\n</PreIncrementExpression>\n<PreIncrementExpression>\n  <identifier>%</identifier>\n  <identifier>%</identifier>\n</PreIncrementExpression>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(95);
      SimpleNode simpleNode1 = new SimpleNode(95);
      SimpleNode simpleNode2 = new SimpleNode(95);
      simpleNode2.jjtAddChild(simpleNode0, 95);
      simpleNode2.jjtAddChild(simpleNode0, 95);
      simpleNode1.toString();
      StringWriter stringWriter0 = new StringWriter(95);
      simpleNode1.dump("<", stringWriter0);
      simpleNode2.jjtAddChild((Node) null, 107);
      simpleNode2.toString();
      simpleNode0.jjtAddChild(simpleNode2, 95);
      assertEquals(96, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(68);
      StringWriter stringWriter0 = new StringWriter();
      stringWriter0.flush();
      simpleNode0.setIdentifier("");
      simpleNode0.dump("", stringWriter0);
      stringWriter0.write("b");
      simpleNode0.dump("kP lr69m=zK=R{RN", stringWriter0);
      assertEquals("<AllocationExpression>\n</AllocationExpression>\nb<AllocationExpression>\n</AllocationExpression>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("U");
      SimpleNode simpleNode0 = new SimpleNode(50);
      simpleNode0.setIdentifier("<<");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("<<", stringWriter0);
      assertEquals("<AdditiveExpression>\n  <identifier>*lshft</identifier>\n</AdditiveExpression>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(10);
      simpleNode0.setIdentifier("&&");
      StringWriter stringWriter0 = new StringWriter();
      stringWriter0.append('F');
      simpleNode0.dump("$Hb(JGlJtT1C", stringWriter0);
      assertEquals("F<EnumConstant>\n  <identifier>*amp</identifier>\n</EnumConstant>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(30);
      simpleNode0.setIdentifier("%");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.setIdentifier("<=");
      char[] charArray0 = new char[2];
      charArray0[0] = '`';
      charArray0[1] = 'l';
      stringWriter0.write(charArray0);
      simpleNode0.dump("%", stringWriter0);
      simpleNode0.dump((String) null, stringWriter0);
      assertEquals("`l<ClassOrInterfaceType>\n  <identifier>%</identifier>\n  <identifier>*le</identifier>\n</ClassOrInterfaceType>\n<ClassOrInterfaceType>\n  <identifier>%</identifier>\n  <identifier>*le</identifier>\n</ClassOrInterfaceType>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      stringWriter0.flush();
      SimpleNode simpleNode0 = new SimpleNode(37);
      simpleNode0.setIdentifier("}");
      Node node0 = simpleNode0.parent;
      simpleNode0.dump("case", stringWriter0);
      simpleNode0.dump("*g", stringWriter0);
      assertEquals("<NameList>\n</NameList>\n<NameList>\n</NameList>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(30);
      SimpleNode simpleNode1 = new SimpleNode(37);
      simpleNode1.setIdentifier("Mjw(7\"9/_cTuR1$@p*U");
      StringWriter stringWriter0 = new StringWriter();
      stringWriter0.close();
      stringWriter0.flush();
      simpleNode0.setIdentifier("&");
      simpleNode1.dump("Mjw(7\"9/_cTuR1$@p*U", stringWriter0);
      stringWriter0.append((CharSequence) "&");
      simpleNode0.dump((String) null, stringWriter0);
      assertEquals("<NameList>\n  <identifier>Mjw(7\"9/_cTuR1$@p*U</identifier>\n</NameList>\n&<ClassOrInterfaceType>\n  <identifier>*amp</identifier>\n</ClassOrInterfaceType>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)90;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      SimpleNode simpleNode0 = new SimpleNode((-2093064));
      byte[] byteArray1 = new byte[0];
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray1);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      simpleNode0.id = 3045;
      StringWriter stringWriter0 = new StringWriter(3110);
      StringWriter stringWriter1 = stringWriter0.append('g');
      simpleNode0.dump("|iW}QiC'2q", stringWriter0);
      Node[] nodeArray0 = new Node[0];
      simpleNode0.children = nodeArray0;
      simpleNode0.dump("VariableDeclaratorId", stringWriter0);
      simpleNode0.dump("Qbve/P#0-b23BS\"5", stringWriter0);
      simpleNode0.dump("V", stringWriter0);
      simpleNode0.dump("Qbve/P#0-b23BS\"5", stringWriter0);
      simpleNode0.dump("|iW}QiC'2q", stringWriter1);
      simpleNode0.dump("(0_VHn", stringWriter0);
      assertEquals("g", stringWriter0.toString());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((-1108452621));
      simpleNode0.id = 1;
      simpleNode0.setIdentifier(">");
      SimpleNode simpleNode1 = new SimpleNode((-1108452621));
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump(">", stringWriter0);
      assertEquals("<PackageDeclaration>\n  <identifier>*gt</identifier>\n</PackageDeclaration>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("`$M");
      SimpleNode simpleNode0 = new SimpleNode(30);
      SimpleNode simpleNode1 = new SimpleNode((-1118424342));
      simpleNode0.setIdentifier(">>");
      Node node0 = simpleNode0.parent;
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("M?w(7\"9/_cTuR1$@p*U", stringWriter0);
      stringWriter0.write(30);
      stringWriter0.append((CharSequence) ">>");
      assertEquals("<ClassOrInterfaceType>\n  <identifier>*rshft</identifier>\n</ClassOrInterfaceType>\n\u001E>>", stringWriter0.toString());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser(";");
      SimpleNode simpleNode0 = new SimpleNode(47);
      simpleNode0.setIdentifier(";");
      simpleNode0.setIdentifier(";");
      StringWriter stringWriter0 = new StringWriter(47);
      StringWriter stringWriter1 = stringWriter0.append('u');
      simpleNode0.dump("</", stringWriter1);
      simpleNode0.dump("\"enum\"", stringWriter0);
      SimpleNode simpleNode1 = new SimpleNode(47);
      StringWriter stringWriter2 = stringWriter1.append((CharSequence) "\"enum\"");
      simpleNode1.dump("</", stringWriter2);
      assertEquals("u<InstanceOfExpression>\n</InstanceOfExpression>\n<InstanceOfExpression>\n</InstanceOfExpression>\n\"enum\"", stringWriter1.toString());
      assertEquals("u<InstanceOfExpression>\n</InstanceOfExpression>\n<InstanceOfExpression>\n</InstanceOfExpression>\n\"enum\"", stringWriter0.toString());
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      int int0 = 47;
      SimpleNode simpleNode0 = new SimpleNode(63);
      simpleNode0.setIdentifier("CH aqC wrGhLJO(7");
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = stringWriter0.append((CharSequence) "CH aqC wrGhLJO(7");
      stringWriter1.flush();
      StringWriter stringWriter2 = stringWriter1.append('o');
      String string0 = "SynchronizedStatement";
      simpleNode0.dump("Mjw(7\"9/_cTuR1$@p*U", stringWriter2);
      String string1 = "<";
      String string2 = "*lt";
      simpleNode0.setIdentifier("*lt");
      Node node0 = simpleNode0.parent;
      StringWriter stringWriter3 = new StringWriter();
      StringWriter stringWriter4 = new StringWriter();
      stringWriter4.append((CharSequence) "<");
      // Undeclared exception!
      try { 
        stringWriter2.append((CharSequence) "CH aqC wrGhLJO(7", 304, 63);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }
}