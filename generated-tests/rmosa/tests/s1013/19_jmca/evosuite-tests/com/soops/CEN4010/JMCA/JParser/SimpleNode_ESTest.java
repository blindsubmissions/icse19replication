/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 11:15:51 GMT 2018
 */

package com.soops.CEN4010.JMCA.JParser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.soops.CEN4010.JMCA.JParser.JavaParser;
import com.soops.CEN4010.JMCA.JParser.Node;
import com.soops.CEN4010.JMCA.JParser.SimpleNode;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.SequenceInputStream;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
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
      SimpleNode simpleNode0 = new SimpleNode((-982));
      String string0 = "w{*r&2?G(XZ";
      // Undeclared exception!
      try { 
        simpleNode0.jjtGetChild((-982));
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
  /*Coverage entropy=0.5500569563964232
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      Node node0 = simpleNode0.parent;
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)69;
      byteArray0[1] = (byte) (-79);
      byteArray0[2] = (byte)119;
      byteArray0[3] = (byte)0;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-1311), (-1311));
      JavaParser javaParser0 = new JavaParser(byteArrayInputStream0);
      Node node1 = javaParser0.currNode;
      simpleNode0.jjtSetParent((Node) null);
      simpleNode0.jjtAddChild((Node) null, 0);
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("private", stringWriter0);
      simpleNode0.setIdentifier("$");
      StringWriter stringWriter1 = new StringWriter(0);
      StringWriter stringWriter2 = stringWriter1.append((CharSequence) "private", 0, 0);
      simpleNode0.dump("$", stringWriter2);
      simpleNode0.dump("private", stringWriter1);
      stringWriter2.append('E');
      simpleNode0.dump("$", stringWriter2);
      simpleNode0.dump(";V4IhA2~PCN*8y", stringWriter1);
      simpleNode0.dump("$", stringWriter1);
      assertEquals(1, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.5481178804418445
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("<=");
      JavaParser javaParser1 = new JavaParser("com.soops.CEN4010.JMCA.JParser.SimpleNode");
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 0);
      simpleNode0.setIdentifier("</");
      StringWriter stringWriter0 = new StringWriter();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("<=");
      FileSystemHandling.createFolder(evoSuiteFile0);
      simpleNode0.dump("d6", stringWriter0);
      simpleNode0.dump("<<", stringWriter0);
      simpleNode0.dump("d6", stringWriter0);
      assertEquals("<CompilationUnit>\n  <identifier></</identifier>\n</CompilationUnit>\n<CompilationUnit>\n  <identifier></</identifier>\n</CompilationUnit>\n<CompilationUnit>\n  <identifier></</identifier>\n</CompilationUnit>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((-1494));
      simpleNode0.jjtOpen();
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("]Wo");
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 114);
      simpleNode0.jjtClose();
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      JavaParser javaParser0 = new JavaParser(pipedInputStream0);
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 75);
      int int0 = simpleNode0.jjtGetNumChildren();
      assertEquals(0, int0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.6691825225299436
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      Node node0 = simpleNode0.parent;
      simpleNode0.jjtAddChild((Node) null, 0);
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.toString("private");
      simpleNode0.dump("private", stringWriter0);
      simpleNode0.setIdentifier("$");
      StringWriter stringWriter1 = new StringWriter(0);
      StringWriter stringWriter2 = stringWriter1.append((CharSequence) "private", 0, 0);
      simpleNode0.dump("$", stringWriter2);
      simpleNode0.dump("private", stringWriter1);
      stringWriter2.append('E');
      simpleNode0.dump("$", stringWriter2);
      simpleNode0.dump(";V4IhA2~PCN*8y", stringWriter1);
      simpleNode0.dump(";V4IhA2~PCN*8y", stringWriter1);
      assertEquals(1, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(113);
      simpleNode0.jjtGetParent();
      // Undeclared exception!
      try { 
        simpleNode0.toString();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 113
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
      SimpleNode simpleNode0 = new SimpleNode(0);
      ArrayList<String> arrayList0 = new ArrayList<String>();
      simpleNode0.setIdentifier("");
      SimpleNode simpleNode1 = new SimpleNode(1172);
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump(";", stringWriter0);
      assertEquals("<CompilationUnit>\n</CompilationUnit>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.6264744012605674
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("IC<tG");
      SimpleNode simpleNode0 = new SimpleNode(9);
      StringWriter stringWriter0 = new StringWriter(9);
      simpleNode0.setIdentifier("-/");
      StringWriter stringWriter1 = new StringWriter();
      simpleNode0.dump("Statement", stringWriter0);
      StringWriter stringWriter2 = new StringWriter();
      SimpleNode simpleNode1 = new SimpleNode(9);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "</identifier>");
      simpleNode1.jjtSetParent(simpleNode0);
      simpleNode1.dump("static", stringWriter1);
      simpleNode0.setIdentifier("$");
      simpleNode0.dump((String) null, stringWriter0);
      SimpleNode simpleNode2 = new SimpleNode(javaParser0, 9);
      simpleNode1.jjtAddChild(simpleNode2, 0);
      simpleNode1.dump("-/", stringWriter0);
      StringWriter stringWriter3 = new StringWriter(9);
      simpleNode2.dump("Statement", stringWriter2);
      simpleNode0.dump("*amp", stringWriter3);
      simpleNode1.dump("IC<tG", stringWriter1);
      simpleNode1.dump("VariableDeclaratorId", stringWriter1);
      simpleNode1.dump((String) null, stringWriter2);
      simpleNode1.dump("VariableDeclaratorId", stringWriter1);
      assertEquals("<EnumBody></EnumBody>\n<EnumBody></EnumBody>\n<EnumBody></EnumBody>\n", stringWriter1.toString());
      
      simpleNode1.dump("d48;WktN`>N'z5", stringWriter3);
      assertEquals(1, simpleNode1.jjtGetNumChildren());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.68937906138404
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("<=");
      JavaParser javaParser1 = new JavaParser("com.soops.CEN4010.JMCA.JParser.SimpleNode");
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("com.soops.CEN4010.JMCA.JParser.SimpleNode");
      byte[] byteArray0 = new byte[0];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      StringWriter stringWriter0 = new StringWriter(376);
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 15);
      simpleNode0.setIdentifier(";");
      stringWriter0.flush();
      simpleNode0.dump("<=", stringWriter0);
      SimpleNode simpleNode1 = new SimpleNode(101);
      simpleNode0.dump((String) null, stringWriter0);
      simpleNode1.dump(";", stringWriter0);
      StringWriter stringWriter1 = new StringWriter();
      stringWriter1.flush();
      stringWriter1.append((CharSequence) null);
      stringWriter0.close();
      simpleNode1.setIdentifier("<");
      simpleNode1.dump("<=", stringWriter1);
      simpleNode0.toString();
      simpleNode1.dump("EqualityExpression", stringWriter0);
      simpleNode1.dump("</", stringWriter1);
      simpleNode0.dump("EqualityExpression", stringWriter0);
      assertEquals("<ClassOrInterfaceBodyDeclaration>\n</ClassOrInterfaceBodyDeclaration>\n<ClassOrInterfaceBodyDeclaration>\n</ClassOrInterfaceBodyDeclaration>\n<MemberValue>\n  <identifier>*lt</identifier>\n</MemberValue>\n<ClassOrInterfaceBodyDeclaration>\n</ClassOrInterfaceBodyDeclaration>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      ArrayList<String> arrayList0 = new ArrayList<String>();
      simpleNode0.identifiers = arrayList0;
      simpleNode0.setIdentifier("");
      simpleNode0.toString();
      simpleNode0.setIdentifier("Java Parser Version 1.1:  Reading from standard input . . .");
      Node node0 = simpleNode0.parent;
      simpleNode0.setIdentifier("");
      simpleNode0.toString();
      simpleNode0.jjtGetNumChildren();
      simpleNode0.toString();
      simpleNode0.toString("^8 aPR8");
      simpleNode0.jjtAddChild((Node) null, 0);
      simpleNode0.jjtSetParent((Node) null);
      simpleNode0.jjtGetNumChildren();
      simpleNode0.jjtAddChild((Node) null, 0);
      simpleNode0.jjtAddChild((Node) null, 0);
      simpleNode0.setIdentifier("Java Parser Version 1.1:  Reading from standard input . . .");
      simpleNode0.jjtAddChild((Node) null, 1);
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = stringWriter0.append('D');
      char[] charArray0 = new char[2];
      StringWriter stringWriter2 = stringWriter1.append((CharSequence) "");
      assertEquals("D", stringWriter2.toString());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.42425409852044593
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int int0 = 0;
      SimpleNode simpleNode0 = new SimpleNode(0);
      Node node0 = simpleNode0.parent;
      simpleNode0.jjtAddChild((Node) null, 0);
      StringWriter stringWriter0 = new StringWriter();
      String string0 = "private";
      simpleNode0.dump("private", stringWriter0);
      String string1 = "$";
      simpleNode0.setIdentifier("$");
      StringWriter stringWriter1 = new StringWriter(0);
      // Undeclared exception!
      try { 
        simpleNode0.jjtAddChild((Node) null, (-704));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -704
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.toString();
      SimpleNode simpleNode1 = new SimpleNode(0);
      simpleNode0.jjtAddChild(simpleNode1, 0);
      StringWriter stringWriter0 = new StringWriter(0);
      char[] charArray0 = new char[4];
      stringWriter0.write(charArray0);
      simpleNode0.jjtAddChild(simpleNode1, 254);
      simpleNode0.dump((String) null, stringWriter0);
      assertEquals("\u0000\u0000\u0000\u0000<CompilationUnit></CompilationUnit>\n", stringWriter0.toString());
      assertEquals(255, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("<=");
      JavaParser javaParser1 = new JavaParser("com.soops.CEN4010.JMCA.JParser.SimpleNode");
      SimpleNode simpleNode0 = new SimpleNode(15);
      String string0 = "}";
      simpleNode0.setIdentifier("<=");
      simpleNode0.setIdentifier("}");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump((String) null, stringWriter0);
      String string1 = null;
      StringWriter stringWriter1 = new StringWriter();
      stringWriter1.flush();
      stringWriter0.close();
      simpleNode0.dump("(qpd8b1$", stringWriter0);
      simpleNode0.dump("'S1XEWCR", stringWriter1);
      StringWriter stringWriter2 = new StringWriter(0);
      simpleNode0.dump("(qpd8b1$", stringWriter2);
      // Undeclared exception!
      try { 
        simpleNode0.dump("'S1XEWCR", (Writer) null);
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
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      StringWriter stringWriter0 = new StringWriter(0);
      simpleNode0.setIdentifier("<<");
      simpleNode0.dump("<<", stringWriter0);
      assertEquals("<CompilationUnit>\n  <identifier>*lshft</identifier>\n</CompilationUnit>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.3805062184775959
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("<=");
      SimpleNode simpleNode0 = new SimpleNode(0);
      StringWriter stringWriter0 = new StringWriter(1);
      simpleNode0.setIdentifier("<=");
      simpleNode0.dump("com.soops.CEN4010.JMCA.JParser.SimpleNode", stringWriter0);
      simpleNode0.dump("EqualityExpression", stringWriter0);
      StringWriter stringWriter1 = new StringWriter();
      stringWriter1.append('b');
      simpleNode0.dump("EqualityExpression", stringWriter1);
      assertEquals("b<CompilationUnit>\n  <identifier>*le</identifier>\n</CompilationUnit>\n", stringWriter1.toString());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      StringWriter stringWriter0 = new StringWriter();
      SimpleNode simpleNode0 = new SimpleNode(18);
      simpleNode0.setIdentifier("@?[S>4{@l.,%Q//|,");
      StringWriter stringWriter1 = new StringWriter(97);
      simpleNode0.setIdentifier("OEf.#GH()5hp(4Ug0");
      simpleNode0.dump("<HEX_LITERAL>", stringWriter0);
      StringWriter stringWriter2 = new StringWriter();
      stringWriter1.append('b');
      simpleNode0.dump("<HEX_LITERAL>", stringWriter1);
      assertEquals("b<VariableDeclaratorId>\n  <identifier>@?[S>4{@l.,%Q//|,</identifier>\n  <identifier>OEf.#GH()5hp(4Ug0</identifier>\n</VariableDeclaratorId>\n", stringWriter1.toString());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("IC<tG");
      SimpleNode simpleNode0 = new SimpleNode(9);
      simpleNode0.setIdentifier("{");
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = new StringWriter();
      simpleNode0.dump("<=", stringWriter0);
      SimpleNode simpleNode1 = new SimpleNode(0);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "1");
      simpleNode1.dump("static", stringWriter0);
      simpleNode0.dump("IC<tG", stringWriter1);
      simpleNode1.dump((String) null, stringWriter0);
      simpleNode0.dump((String) null, stringWriter0);
      assertEquals("<EnumBody>\n</EnumBody>\n<EnumBody>\n</EnumBody>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      String string0 = ")";
      StringWriter stringWriter0 = new StringWriter();
      SimpleNode simpleNode0 = new SimpleNode(18);
      Node[] nodeArray0 = new Node[1];
      nodeArray0[0] = (Node) simpleNode0;
      simpleNode0.children = nodeArray0;
      simpleNode0.setIdentifier(")");
      String string1 = "private";
      // Undeclared exception!
      try { 
        simpleNode0.dump(")", stringWriter0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("<=");
      JavaParser javaParser1 = new JavaParser("com.soops.CEN4010.JMCA.JParser.SimpleNode");
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      SimpleNode simpleNode0 = new SimpleNode(15);
      StringWriter stringWriter0 = new StringWriter(0);
      simpleNode0.dump("private", stringWriter0);
      StringWriter stringWriter1 = new StringWriter();
      stringWriter1.flush();
      stringWriter1.close();
      simpleNode0.setIdentifier(">");
      simpleNode0.dump("<=", stringWriter0);
      simpleNode0.toString();
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "ClassOrInterfaceBodyDeclaration : >");
      stringWriter0.append('!');
      SimpleNode simpleNode1 = new SimpleNode(1);
      SimpleNode simpleNode2 = new SimpleNode(1400);
      simpleNode2.dump("X", stringWriter0);
      assertEquals("<ClassOrInterfaceBodyDeclaration>\n  <identifier>*gt</identifier>\n</ClassOrInterfaceBodyDeclaration>\n!", stringWriter0.toString());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.36764947740014225
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("<=");
      JavaParser javaParser1 = new JavaParser("com.soops.CEN4010.JMCA.JParser.SimpleNode");
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.setIdentifier("H%63X8?,'i");
      simpleNode0.setIdentifier(">=");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("9xM) hKHkX", stringWriter0);
      StringWriter stringWriter1 = new StringWriter();
      simpleNode0.dump("I>ph3!W", stringWriter1);
      simpleNode0.dump("VR|D", stringWriter1);
      simpleNode0.dump("I>ph3!W", stringWriter1);
      simpleNode0.dump("|@C", stringWriter1);
      simpleNode0.dump("9xM) hKHkX", stringWriter0);
      simpleNode0.dump("<=", stringWriter0);
      assertEquals("<CompilationUnit>\n  <identifier>H%63X8?,'i</identifier>\n  <identifier>*ge</identifier>\n</CompilationUnit>\n<CompilationUnit>\n  <identifier>H%63X8?,'i</identifier>\n  <identifier>*ge</identifier>\n</CompilationUnit>\n<CompilationUnit>\n  <identifier>H%63X8?,'i</identifier>\n  <identifier>*ge</identifier>\n</CompilationUnit>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("<=");
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.setIdentifier(">>");
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = new StringWriter(0);
      StringWriter stringWriter2 = stringWriter1.append('T');
      simpleNode0.dump("l~wX", stringWriter0);
      simpleNode0.dump("l~wX", stringWriter1);
      StringWriter stringWriter3 = new StringWriter();
      simpleNode0.dump(" ", stringWriter2);
      SimpleNode simpleNode1 = new SimpleNode(381);
      simpleNode1.dump(">>", stringWriter1);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      ArrayList<String> arrayList0 = new ArrayList<String>(linkedList0);
      simpleNode0.dump("com.soops.CEN4010.JMCA.JParser.SimpleNode", stringWriter3);
      StringWriter stringWriter4 = new StringWriter();
      simpleNode1.dump("OF)@,nc,C-oSO", stringWriter3);
      simpleNode0.dump("lbG+H_|{GB;eG9|H", stringWriter1);
      // Undeclared exception!
      try { 
        simpleNode0.dump(">>", (Writer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("IC<tG");
      SimpleNode simpleNode0 = new SimpleNode(9);
      StringWriter stringWriter0 = new StringWriter(1);
      simpleNode0.setIdentifier("-/");
      StringWriter stringWriter1 = new StringWriter();
      simpleNode0.dump("Statement", stringWriter0);
      StringWriter stringWriter2 = new StringWriter();
      simpleNode0.dump("<=", stringWriter1);
      SimpleNode simpleNode1 = new SimpleNode(0);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "1");
      simpleNode1.dump("static", stringWriter1);
      simpleNode0.dump("IC<tG", stringWriter2);
      simpleNode0.dump((String) null, stringWriter0);
      Node[] nodeArray0 = new Node[0];
      simpleNode1.children = nodeArray0;
      simpleNode1.dump("IC<tG", stringWriter0);
      simpleNode0.dump("  <identifier>", stringWriter1);
      simpleNode1.dump("IC<tG", stringWriter2);
      SimpleNode simpleNode2 = new SimpleNode((-1721949063));
      assertFalse(simpleNode2.equals((Object)simpleNode1));
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("IC<tG");
      SimpleNode simpleNode0 = new SimpleNode(9);
      StringWriter stringWriter0 = new StringWriter(9);
      simpleNode0.setIdentifier("&");
      StringWriter stringWriter1 = new StringWriter();
      simpleNode0.dump("Statement", stringWriter0);
      StringWriter stringWriter2 = new StringWriter();
      simpleNode0.dump("<=", stringWriter1);
      SimpleNode simpleNode1 = new SimpleNode(0);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "1");
      simpleNode1.jjtSetParent(simpleNode0);
      simpleNode1.dump("static", stringWriter1);
      simpleNode0.setIdentifier("$");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "Statement");
      simpleNode1.dump("static", stringWriter0);
      simpleNode1.dump("$", stringWriter1);
      simpleNode0.dump((String) null, stringWriter0);
      simpleNode1.dump("Statement", stringWriter1);
      simpleNode0.dump("  <identifier>", stringWriter1);
      simpleNode0.dump("  <identifier>", stringWriter0);
      simpleNode1.dump((String) null, stringWriter2);
      simpleNode1.dump("Jimv\"jt##(d\"Jxy", stringWriter2);
      simpleNode0.dump((String) null, stringWriter1);
      assertEquals("<EnumBody>\n  <identifier>*amp</identifier>\n</EnumBody>\n<EnumBody>\n  <identifier>*amp</identifier>\n  <identifier>$</identifier>\n</EnumBody>\n<EnumBody>\n  <identifier>*amp</identifier>\n  <identifier>$</identifier>\n</EnumBody>\n", stringWriter1.toString());
  }
}
