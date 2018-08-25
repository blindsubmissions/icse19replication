/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 13:02:44 GMT 2018
 */

package com.soops.CEN4010.JMCA.JParser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.soops.CEN4010.JMCA.JParser.JavaParser;
import com.soops.CEN4010.JMCA.JParser.Node;
import com.soops.CEN4010.JMCA.JParser.SimpleNode;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.function.Consumer;
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
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((-1387));
      String string0 = "|";
      StringWriter stringWriter0 = new StringWriter();
      char[] charArray0 = new char[3];
      charArray0[0] = 'B';
      charArray0[1] = 'j';
      stringWriter0.write(charArray0, 0, 0);
      charArray0[2] = 'O';
      stringWriter0.write(charArray0, 0, 0);
      StringWriter stringWriter1 = stringWriter0.append((CharSequence) "|");
      Node[] nodeArray0 = new Node[5];
      nodeArray0[0] = (Node) simpleNode0;
      JavaParser javaParser0 = new JavaParser("S6@1w,OW");
      SimpleNode simpleNode1 = new SimpleNode(javaParser0, 92);
      nodeArray0[1] = (Node) simpleNode1;
      nodeArray0[2] = (Node) simpleNode0;
      nodeArray0[3] = (Node) simpleNode0;
      nodeArray0[4] = (Node) simpleNode0;
      simpleNode0.children = nodeArray0;
      simpleNode0.id = 0;
      stringWriter1.append('j');
      // Undeclared exception!
      try { 
        simpleNode0.dump("|", stringWriter1);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((-2307));
      Node[] nodeArray0 = new Node[2];
      nodeArray0[0] = (Node) simpleNode0;
      nodeArray0[1] = (Node) simpleNode0;
      simpleNode0.children = nodeArray0;
      int int0 = 110;
      simpleNode0.jjtAddChild(nodeArray0[0], 110);
      simpleNode0.jjtGetChild(110);
      ArrayList<String> arrayList0 = null;
      try {
        arrayList0 = new ArrayList<String>((-2454));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal Capacity: -2454
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser((Reader) null);
      // Undeclared exception!
      try { 
        javaParser0.Literal();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int int0 = 0;
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.toString();
      simpleNode0.toString("CompilationUnit");
      SimpleNode simpleNode1 = new SimpleNode(0);
      simpleNode0.jjtAddChild(simpleNode1, 0);
      Node node0 = simpleNode0.parent;
      simpleNode0.jjtSetParent((Node) null);
      simpleNode0.toString();
      Writer writer0 = null;
      // Undeclared exception!
      try { 
        simpleNode0.dump(")", (Writer) null);
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
  /*Coverage entropy=1.8288411561741993
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = 0;
      ArrayList<String> arrayList0 = new ArrayList<String>();
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.toString();
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = stringWriter0.append((CharSequence) "CompilationUnit");
      stringWriter0.flush();
      StringWriter stringWriter2 = stringWriter1.append('p');
      arrayList0.add("\"}v}7{5Pf$g8esWG");
      arrayList0.add("EnumConstant");
      simpleNode0.dump("&&", stringWriter0);
      JavaParser javaParser0 = new JavaParser("CompilationUnit");
      SimpleNode simpleNode1 = new SimpleNode(javaParser0, 0);
      simpleNode1.toString();
      simpleNode0.jjtGetParent();
      simpleNode0.jjtAddChild((Node) null, 0);
      simpleNode1.toString("\"}v}7{5Pf$g8esWG");
      int int1 = 2514;
      SimpleNode simpleNode2 = new SimpleNode(2514);
      simpleNode0.jjtAddChild(simpleNode2, 0);
      simpleNode2.dump("\"}v}7{5Pf$g8esWGCompilationUnit", stringWriter2);
      // Undeclared exception!
      try { 
        simpleNode1.jjtGetChild(0);
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
  /*Coverage entropy=1.2852930241200993
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.setIdentifier("");
      simpleNode0.setIdentifier((String) null);
      simpleNode0.jjtClose();
      simpleNode0.setIdentifier((String) null);
      simpleNode0.jjtAddChild((Node) null, 1831);
      ArrayList<String> arrayList0 = new ArrayList<String>();
      simpleNode0.identifiers = arrayList0;
      ArrayList<String> arrayList1 = new ArrayList<String>();
      simpleNode0.identifiers = arrayList1;
      simpleNode0.jjtSetParent((Node) null);
      simpleNode0.setIdentifier("");
      StringWriter stringWriter0 = new StringWriter(0);
      simpleNode0.dump("", stringWriter0);
      assertEquals(1832, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.074614291729384
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.setIdentifier("&");
      simpleNode0.setIdentifier("&");
      StringReader stringReader0 = new StringReader("&");
      JavaParser javaParser0 = new JavaParser(stringReader0);
      SimpleNode simpleNode1 = new SimpleNode(javaParser0, 0);
      simpleNode1.jjtClose();
      simpleNode1.setIdentifier("&");
      simpleNode1.jjtAddChild((Node) null, 0);
      ArrayList<String> arrayList0 = new ArrayList<String>();
      ArrayList<String> arrayList1 = new ArrayList<String>();
      simpleNode1.jjtSetParent((Node) null);
      simpleNode1.setIdentifier("&");
      StringWriter stringWriter0 = new StringWriter(1831);
      simpleNode1.dump("", stringWriter0);
      assertEquals(1, simpleNode1.jjtGetNumChildren());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.0791615912646864
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.toString();
      simpleNode0.toString("CompilationUnit");
      SimpleNode simpleNode1 = new SimpleNode(0);
      simpleNode0.jjtAddChild(simpleNode1, 0);
      StringWriter stringWriter0 = new StringWriter();
      int int0 = simpleNode1.jjtGetNumChildren();
      assertEquals(0, int0);
      
      StringWriter stringWriter1 = new StringWriter();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "CompilationUnit";
      stringArray0[1] = "CompilationUnitCompilationUnit";
      stringArray0[2] = "CompilationUnit";
      stringArray0[3] = "CompilationUnitCompilationUnit";
      stringArray0[4] = "CompilationUnitCompilationUnit";
      stringArray0[5] = "#y0vb]<";
      stringArray0[6] = "CompilationUnit";
      JavaParser.main(stringArray0);
      simpleNode0.dump("CompilationUnitCompilationUnit", stringWriter0);
      simpleNode0.jjtGetNumChildren();
      simpleNode0.dump("_vvI|", stringWriter1);
      simpleNode0.dump("CompilationUnitCompilationUnit", stringWriter0);
      int int1 = simpleNode0.jjtGetNumChildren();
      assertEquals(1, int1);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.0379083330628327
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.setIdentifier("&&");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("gi15)+{!hdG_i;oU+Ny", stringWriter0);
      JavaParser javaParser0 = new JavaParser("&&");
      simpleNode0.jjtGetNumChildren();
      StringWriter stringWriter1 = new StringWriter();
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      arrayList0.add("gi15)+{!hdG_i;oU+Ny");
      String string0 = ">>";
      arrayList0.add(">>");
      simpleNode0.dump("&&", stringWriter0);
      simpleNode0.jjtGetParent();
      int int0 = (-1056);
      // Undeclared exception!
      try { 
        simpleNode0.jjtAddChild((Node) null, (-1056));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.7937300551584248
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(1);
      String string0 = "<";
      simpleNode0.setIdentifier("<");
      String string1 = "gi15)+{!hdG_i;oU+Ny";
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("L>ML", stringWriter0);
      JavaParser javaParser0 = new JavaParser("gi15)+{!hdG_i;oU+Ny");
      simpleNode0.parser = javaParser0;
      simpleNode0.jjtGetNumChildren();
      StringWriter stringWriter1 = new StringWriter();
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      arrayList0.add("L>ML");
      // Undeclared exception!
      try { 
        stringWriter0.append((CharSequence) "L>ML", 1, (-1723780452));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.9404479886553264
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      ArrayList<String> arrayList0 = new ArrayList<String>();
      simpleNode0.identifiers = arrayList0;
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump(";", stringWriter0);
      JavaParser javaParser0 = new JavaParser("}");
      simpleNode0.jjtGetNumChildren();
      StringWriter stringWriter1 = new StringWriter();
      ArrayList<String> arrayList1 = simpleNode0.identifiers;
      simpleNode0.identifiers.add("ghYLc?szCL@i");
      arrayList0.add("}");
      simpleNode0.dump(">>", stringWriter1);
      StringWriter stringWriter2 = new StringWriter();
      simpleNode0.dump("&&", stringWriter0);
      stringWriter0.close();
      simpleNode0.dump("*`6Lz'\"AZ\n", stringWriter0);
      SimpleNode simpleNode1 = new SimpleNode(javaParser0, 0);
      SimpleNode simpleNode2 = new SimpleNode(0);
      simpleNode2.jjtGetNumChildren();
      simpleNode2.jjtGetNumChildren();
      simpleNode2.dump("*`6Lz'\"AZ\n", stringWriter1);
      StringWriter stringWriter3 = new StringWriter();
      simpleNode1.dump("&&", stringWriter1);
      assertEquals("<CompilationUnit>\n  <identifier>ghYLc?szCL@i</identifier>\n</CompilationUnit>\n", stringWriter1.toString());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.777661295762166
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.setIdentifier("&");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, (String) null);
      JavaParser javaParser0 = new JavaParser("TpjtVP|nue$(PVAK?");
      SimpleNode simpleNode1 = new SimpleNode(javaParser0, 0);
      simpleNode1.jjtGetNumChildren();
      StringWriter stringWriter0 = new StringWriter();
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      arrayList0.add("<FLOATING_POINT_LITERAL>");
      arrayList0.clone();
      arrayList0.add("<=");
      simpleNode0.dump("&", stringWriter0);
      StringWriter stringWriter1 = new StringWriter();
      simpleNode1.dump("TryStatement", stringWriter0);
      stringWriter1.close();
      simpleNode0.dump(">=", stringWriter0);
      SimpleNode simpleNode2 = new SimpleNode(javaParser0, 0);
      SimpleNode simpleNode3 = new SimpleNode((-1061));
      simpleNode2.jjtGetNumChildren();
      simpleNode1.jjtGetNumChildren();
      simpleNode3.dump("1SFSrnbr2tOI\"@x", stringWriter0);
      assertEquals("<CompilationUnit>\n  <identifier>*amp</identifier>\n  <identifier><FLOATING_POINT_LITERAL></identifier>\n  <identifier>*le</identifier>\n</CompilationUnit>\n<CompilationUnit>\n  <identifier>*amp</identifier>\n  <identifier><FLOATING_POINT_LITERAL></identifier>\n  <identifier>*le</identifier>\n</CompilationUnit>\n", stringWriter0.toString());
      
      StringWriter stringWriter2 = new StringWriter();
      simpleNode2.dump("-/y", stringWriter2);
      assertEquals(0, simpleNode2.jjtGetNumChildren());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.9404479886553264
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int int0 = 0;
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.setIdentifier("{");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("gi15)+{!hdG_i;oU+Ny", stringWriter0);
      String string0 = "&&";
      JavaParser javaParser0 = new JavaParser("&&");
      simpleNode0.jjtGetNumChildren();
      StringWriter stringWriter1 = new StringWriter();
      simpleNode0.dump("JlQ^&O>", stringWriter0);
      Writer writer0 = null;
      // Undeclared exception!
      try { 
        simpleNode0.dump("{", (Writer) null);
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
  /*Coverage entropy=0.4258484492385814
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.setIdentifier("&");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "&");
      StringWriter stringWriter0 = new StringWriter();
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      arrayList0.add(">=");
      arrayList0.clone();
      arrayList0.add(">=");
      simpleNode0.dump("y<S", stringWriter0);
      StringWriter stringWriter1 = new StringWriter();
      stringWriter1.close();
      simpleNode0.dump("QNM>IvjK+CW!wR*\"", stringWriter1);
      simpleNode0.dump(">=", stringWriter1);
      StringWriter stringWriter2 = new StringWriter();
      simpleNode0.dump(">=", stringWriter0);
      assertEquals("<CompilationUnit>\n  <identifier>*amp</identifier>\n  <identifier>*ge</identifier>\n  <identifier>*ge</identifier>\n</CompilationUnit>\n<CompilationUnit>\n  <identifier>*amp</identifier>\n  <identifier>*ge</identifier>\n  <identifier>*ge</identifier>\n</CompilationUnit>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.6598720137848267
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.setIdentifier("&");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.setIdentifier("<<");
      simpleNode0.toString();
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, (String) null);
      StringWriter stringWriter1 = new StringWriter();
      stringWriter0.close();
      simpleNode0.dump("CompilationUnit : & : <<", stringWriter0);
      simpleNode0.dump((String) null, stringWriter0);
      SimpleNode simpleNode1 = new SimpleNode(2);
      assertFalse(simpleNode1.equals((Object)simpleNode0));
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.666332585328325
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(1);
      simpleNode0.setIdentifier("FVVCQB(hlI.bjf|");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("L>ML", stringWriter0);
      JavaParser javaParser0 = new JavaParser("gi15)+{!hdG_i;oU+Ny");
      simpleNode0.parser = javaParser0;
      simpleNode0.jjtGetNumChildren();
      StringWriter stringWriter1 = new StringWriter();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "gi15)+{!hdG_i;oU+Ny";
      stringArray0[1] = "L>ML";
      stringArray0[3] = "gi15)+{!hdG_i;oU+Ny";
      stringArray0[4] = "FVVCQB(hlI.bjf|";
      stringArray0[5] = "L>ML";
      stringArray0[6] = "FVVCQB(hlI.bjf|";
      JavaParser.main(stringArray0);
      stringWriter1.write("FVVCQB(hlI.bjf|", 1, 0);
      stringWriter1.write("GzDm:Ta/N");
      simpleNode0.dump("FVVCQB(hlI.bjf|", stringWriter1);
      simpleNode0.toString("gi15)+{!hdG_i;oU+Ny");
      simpleNode0.setIdentifier(";");
      simpleNode0.jjtOpen();
      simpleNode0.dump("gi15)+{!hdG_i;oU+Ny", stringWriter0);
      simpleNode0.dump("VariableDeclaratorId", stringWriter0);
      assertEquals("<PackageDeclaration>\n  <identifier>FVVCQB(hlI.bjf|</identifier>\n</PackageDeclaration>\n<PackageDeclaration>\n  <identifier>FVVCQB(hlI.bjf|</identifier>\n</PackageDeclaration>\n<PackageDeclaration>\n  <identifier>FVVCQB(hlI.bjf|</identifier>\n</PackageDeclaration>\n", stringWriter0.toString());
  }
}
