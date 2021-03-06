/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 14:55:54 GMT 2018
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
import java.util.Locale;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SimpleNode_ESTest extends SimpleNode_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int int0 = 1498;
      SimpleNode simpleNode0 = new SimpleNode(1498);
      SimpleNode simpleNode1 = new SimpleNode(0);
      Node node0 = simpleNode0.parent;
      simpleNode1.parent = null;
      simpleNode0.jjtAddChild(simpleNode1, 1498);
      String string0 = "";
      simpleNode0.setIdentifier("");
      simpleNode0.jjtOpen();
      simpleNode0.jjtGetChild(0);
      // Undeclared exception!
      try { 
        simpleNode0.toString("$DvJ1v32");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1498
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.7478680974667573
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = 1;
      SimpleNode simpleNode0 = new SimpleNode(1);
      String string0 = " ";
      Locale locale0 = Locale.JAPAN;
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
      ArrayList<String> arrayList0 = new ArrayList<String>(set0);
      simpleNode0.identifiers = arrayList0;
      simpleNode0.setIdentifier(" ");
      simpleNode0.jjtOpen();
      arrayList0.add((String) null);
      simpleNode0.toString((String) null);
      // Undeclared exception!
      try { 
        simpleNode0.jjtGetChild(1);
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
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      simpleNode0.identifiers = arrayList0;
      simpleNode0.identifiers = arrayList0;
      simpleNode0.parser = null;
      String string0 = simpleNode0.toString();
      assertEquals("CompilationUnit", string0);
      
      ArrayList<String> arrayList1 = simpleNode0.identifiers;
      simpleNode0.identifiers = arrayList1;
      simpleNode0.jjtGetNumChildren();
      SimpleNode simpleNode1 = new SimpleNode(0);
      simpleNode0.jjtSetParent(simpleNode1);
      arrayList1.add("!:.K8&ryLMYLG2");
      simpleNode0.setIdentifier(",78!^75PhW~xZrXj");
      simpleNode0.setIdentifier("CompilationUnit");
      simpleNode0.jjtOpen();
      simpleNode0.jjtGetNumChildren();
      int int0 = simpleNode0.jjtGetNumChildren();
      assertEquals(0, int0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(116);
      simpleNode0.jjtClose();
      StringWriter stringWriter0 = new StringWriter(116);
      StringWriter stringWriter1 = stringWriter0.append('t');
      StringWriter stringWriter2 = stringWriter1.append((CharSequence) null);
      simpleNode0.dump((String) null, stringWriter2);
      assertSame(stringWriter0, stringWriter2);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.9061547465398496
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      Node[] nodeArray0 = new Node[7];
      nodeArray0[0] = (Node) simpleNode0;
      nodeArray0[1] = (Node) simpleNode0;
      nodeArray0[2] = (Node) simpleNode0;
      nodeArray0[3] = (Node) simpleNode0;
      nodeArray0[4] = (Node) simpleNode0;
      nodeArray0[5] = (Node) simpleNode0;
      nodeArray0[6] = (Node) simpleNode0;
      simpleNode0.children = nodeArray0;
      StringReader stringReader0 = new StringReader("ForStatement");
      JavaParser javaParser0 = new JavaParser(stringReader0);
      SimpleNode simpleNode1 = new SimpleNode(javaParser0, 0);
      simpleNode0.jjtAddChild(simpleNode1, 0);
      SimpleNode simpleNode2 = (SimpleNode)simpleNode0.jjtGetChild(0);
      simpleNode1.jjtAddChild(simpleNode2, 0);
      simpleNode0.jjtOpen();
      simpleNode1.jjtClose();
      simpleNode1.jjtAddChild(simpleNode0, 0);
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        simpleNode2.dump("TxuucL:5]bN#", stringWriter0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(8);
      Node[] nodeArray0 = new Node[7];
      nodeArray0[0] = (Node) simpleNode0;
      nodeArray0[1] = (Node) simpleNode0;
      nodeArray0[2] = (Node) simpleNode0;
      nodeArray0[3] = (Node) simpleNode0;
      nodeArray0[5] = (Node) simpleNode0;
      nodeArray0[5] = (Node) simpleNode0;
      nodeArray0[6] = (Node) simpleNode0;
      simpleNode0.children = nodeArray0;
      StringReader stringReader0 = new StringReader("ForCBSStatement");
      JavaParser javaParser0 = new JavaParser(stringReader0);
      SimpleNode simpleNode1 = new SimpleNode(javaParser0, 8);
      int int0 = simpleNode0.jjtGetNumChildren();
      assertEquals(7, int0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.5810937501718236
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      Node[] nodeArray0 = new Node[7];
      nodeArray0[0] = (Node) simpleNode0;
      nodeArray0[1] = (Node) simpleNode0;
      nodeArray0[2] = (Node) simpleNode0;
      nodeArray0[3] = (Node) simpleNode0;
      nodeArray0[4] = (Node) simpleNode0;
      nodeArray0[5] = (Node) simpleNode0;
      nodeArray0[6] = (Node) simpleNode0;
      simpleNode0.children = nodeArray0;
      StringReader stringReader0 = new StringReader("ForStatement");
      JavaParser javaParser0 = new JavaParser(stringReader0);
      SimpleNode simpleNode1 = new SimpleNode(javaParser0, 0);
      simpleNode0.jjtAddChild(simpleNode1, 0);
      Node node0 = simpleNode0.jjtGetChild(0);
      simpleNode1.jjtAddChild(nodeArray0[1], 0);
      simpleNode1.jjtAddChild(node0, 1803);
      simpleNode0.toString();
      simpleNode1.jjtOpen();
      assertEquals(1804, simpleNode1.jjtGetNumChildren());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(3339);
      simpleNode0.id = (-2147483647);
      simpleNode0.id = 102;
      simpleNode0.setIdentifier("&I;}E@rR969");
      simpleNode0.jjtGetNumChildren();
      // Undeclared exception!
      try { 
        simpleNode0.dump("v2{dJge)0qzlCP+ h%", (Writer) null);
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
  /*Coverage entropy=2.0431918705451206
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.toString("Y/tB7eg,SS}6Z)I,FB");
      simpleNode0.setIdentifier("Y/tB7eg,SS}6Z)I,FBCompilationUnit");
      ArrayList<String> arrayList0 = new ArrayList<String>();
      arrayList0.add("Y/tB7eg,SS}6Z)I,FB");
      arrayList0.add("Y/tB7eg,SS}6Z)I,FB");
      arrayList0.add("Y/tB7eg,SS}6Z)I,FB");
      simpleNode0.identifiers = arrayList0;
      simpleNode0.identifiers.add("");
      arrayList0.containsAll(simpleNode0.identifiers);
      simpleNode0.toString("");
      simpleNode0.jjtGetNumChildren();
      simpleNode0.jjtClose();
      simpleNode0.jjtOpen();
      StringWriter stringWriter0 = new StringWriter(0);
      simpleNode0.dump("", stringWriter0);
      assertEquals("<CompilationUnit>\n  <identifier>Y/tB7eg,SS}6Z)I,FB</identifier>\n  <identifier>Y/tB7eg,SS}6Z)I,FB</identifier>\n  <identifier>Y/tB7eg,SS}6Z)I,FB</identifier>\n</CompilationUnit>\n", stringWriter0.toString());
      
      StringWriter stringWriter1 = new StringWriter(0);
      StringWriter stringWriter2 = stringWriter1.append('k');
      simpleNode0.dump("tG(Yhc", stringWriter2);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.5171515848932913
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "{");
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.toString("{");
      simpleNode0.setIdentifier("{CompilationUnit");
      ArrayList<String> arrayList0 = new ArrayList<String>();
      arrayList0.add("{");
      arrayList0.add("{");
      arrayList0.add("{");
      simpleNode0.identifiers = arrayList0;
      simpleNode0.identifiers.add("d");
      arrayList0.containsAll(simpleNode0.identifiers);
      simpleNode0.toString("");
      simpleNode0.jjtGetNumChildren();
      simpleNode0.jjtClose();
      simpleNode0.jjtGetNumChildren();
      simpleNode0.jjtGetNumChildren();
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("{CompilationUnit", stringWriter0);
      simpleNode0.dump(">=", stringWriter0);
      StringWriter stringWriter1 = stringWriter0.append('S');
      arrayList0.add("");
      stringWriter0.append((CharSequence) "{");
      simpleNode0.dump("", stringWriter1);
      simpleNode0.dump(">=", stringWriter1);
      assertEquals("<CompilationUnit>\n  <identifier>d</identifier>\n</CompilationUnit>\n<CompilationUnit>\n  <identifier>d</identifier>\n</CompilationUnit>\nS{<CompilationUnit>\n  <identifier>d</identifier>\n</CompilationUnit>\n<CompilationUnit>\n  <identifier>d</identifier>\n</CompilationUnit>\n", stringWriter1.toString());
      assertEquals("<CompilationUnit>\n  <identifier>d</identifier>\n</CompilationUnit>\n<CompilationUnit>\n  <identifier>d</identifier>\n</CompilationUnit>\nS{<CompilationUnit>\n  <identifier>d</identifier>\n</CompilationUnit>\n<CompilationUnit>\n  <identifier>d</identifier>\n</CompilationUnit>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.0767759226310025
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = "W";
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "W");
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.toString("W");
      simpleNode0.setIdentifier("WCompilationUnit");
      ArrayList<String> arrayList0 = new ArrayList<String>();
      arrayList0.add("W");
      arrayList0.add("W");
      arrayList0.add("W");
      simpleNode0.identifiers = arrayList0;
      simpleNode0.identifiers.add("d");
      String string1 = "";
      arrayList0.containsAll(simpleNode0.identifiers);
      simpleNode0.toString("");
      Node[] nodeArray0 = new Node[3];
      simpleNode0.jjtGetParent();
      nodeArray0[0] = null;
      nodeArray0[1] = (Node) simpleNode0;
      nodeArray0[2] = (Node) simpleNode0;
      simpleNode0.children = nodeArray0;
      simpleNode0.jjtGetNumChildren();
      simpleNode0.jjtClose();
      simpleNode0.jjtGetNumChildren();
      simpleNode0.jjtGetNumChildren();
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        simpleNode0.dump("WCompilationUnit", stringWriter0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.8222900060250078
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "{");
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.toString("{");
      simpleNode0.setIdentifier("{CompilationUnit");
      ArrayList<String> arrayList0 = new ArrayList<String>();
      arrayList0.add("{");
      arrayList0.add("{");
      arrayList0.add("{");
      simpleNode0.identifiers = arrayList0;
      simpleNode0.identifiers.add("d");
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      arrayList0.containsAll(simpleNode0.identifiers);
      simpleNode0.toString("");
      simpleNode0.jjtGetNumChildren();
      simpleNode0.jjtGetNumChildren();
      simpleNode0.jjtGetNumChildren();
      Node[] nodeArray0 = new Node[0];
      simpleNode0.children = nodeArray0;
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("{CompilationUnit", stringWriter0);
      simpleNode0.dump("", stringWriter0);
      simpleNode0.dump("", stringWriter0);
      simpleNode0.dump("CompilationUnit : { : { : { : d", stringWriter0);
      simpleNode0.dump("<=", stringWriter0);
      simpleNode0.dump("d", stringWriter0);
      assertEquals("<CompilationUnit>\n  <identifier>d</identifier>\n</CompilationUnit>\n<CompilationUnit>\n  <identifier>d</identifier>\n</CompilationUnit>\n<CompilationUnit>\n  <identifier>d</identifier>\n</CompilationUnit>\n<CompilationUnit>\n  <identifier>d</identifier>\n</CompilationUnit>\n<CompilationUnit>\n  <identifier>d</identifier>\n</CompilationUnit>\n<CompilationUnit>\n  <identifier>d</identifier>\n</CompilationUnit>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.074614291729384
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "W");
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.toString("W");
      simpleNode0.setIdentifier("WCompilationUnit");
      ArrayList<String> arrayList0 = new ArrayList<String>();
      arrayList0.add("W");
      arrayList0.add("W");
      simpleNode0.identifiers = arrayList0;
      simpleNode0.identifiers.add("d");
      arrayList0.containsAll(simpleNode0.identifiers);
      simpleNode0.toString("");
      simpleNode0.jjtClose();
      simpleNode0.jjtGetNumChildren();
      simpleNode0.jjtGetNumChildren();
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("WCompilationUnit", stringWriter0);
      simpleNode0.dump(">=", stringWriter0);
      arrayList0.add(">=");
      simpleNode0.dump(">=", stringWriter0);
      simpleNode0.dump((String) null, stringWriter0);
      simpleNode0.dump("", stringWriter0);
      simpleNode0.dump((String) null, stringWriter0);
      assertEquals("<CompilationUnit>\n  <identifier>W</identifier>\n  <identifier>W</identifier>\n  <identifier>d</identifier>\n</CompilationUnit>\n<CompilationUnit>\n  <identifier>W</identifier>\n  <identifier>W</identifier>\n  <identifier>d</identifier>\n</CompilationUnit>\n<CompilationUnit>\n  <identifier>W</identifier>\n  <identifier>W</identifier>\n  <identifier>d</identifier>\n  <identifier>*ge</identifier>\n</CompilationUnit>\n<CompilationUnit>\n  <identifier>W</identifier>\n  <identifier>W</identifier>\n  <identifier>d</identifier>\n  <identifier>*ge</identifier>\n</CompilationUnit>\n<CompilationUnit>\n  <identifier>W</identifier>\n  <identifier>W</identifier>\n  <identifier>d</identifier>\n  <identifier>*ge</identifier>\n</CompilationUnit>\n<CompilationUnit>\n  <identifier>W</identifier>\n  <identifier>W</identifier>\n  <identifier>d</identifier>\n  <identifier>*ge</identifier>\n</CompilationUnit>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.303092403761719
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "W");
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.toString("W");
      simpleNode0.setIdentifier("WCompilationUnit");
      ArrayList<String> arrayList0 = new ArrayList<String>();
      arrayList0.add("W");
      arrayList0.add("W");
      simpleNode0.identifiers = arrayList0;
      arrayList0.add("oY!2'$K)-XJmHKdW:");
      arrayList0.add(";");
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "oY!2'$K)-XJmHKdW:");
      simpleNode0.toString("d");
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = stringWriter0.append(';');
      StringWriter stringWriter2 = stringWriter1.append((CharSequence) "dCompilationUnit : W : W : oY!2'$K)-XJmHKdW: : ;");
      simpleNode0.dump("W", stringWriter2);
      simpleNode0.dump("!T", stringWriter0);
      assertEquals(";dCompilationUnit : W : W : oY!2'$K)-XJmHKdW: : ;<CompilationUnit>\n  <identifier>W</identifier>\n  <identifier>W</identifier>\n  <identifier>oY!2'$K)-XJmHKdW:</identifier>\n</CompilationUnit>\n<CompilationUnit>\n  <identifier>W</identifier>\n  <identifier>W</identifier>\n  <identifier>oY!2'$K)-XJmHKdW:</identifier>\n</CompilationUnit>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.806504609875222
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "{");
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.toString("CompilationUnit : W : W : W : d");
      simpleNode0.setIdentifier("CompilationUnit : W : W : W : dCompilationUnit");
      ArrayList<String> arrayList0 = new ArrayList<String>();
      arrayList0.add("N!gd");
      arrayList0.add("<<");
      ArrayList<String> arrayList1 = simpleNode0.identifiers;
      arrayList1.add("<<");
      arrayList1.add("<<");
      arrayList1.add("{");
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "N!gd");
      simpleNode0.toString("CompilationUnit : W : W : W : dCompilationUnit");
      StringWriter stringWriter0 = new StringWriter();
      stringWriter0.append('3');
      StringWriter stringWriter1 = stringWriter0.append((CharSequence) "<<");
      StringWriter stringWriter2 = new StringWriter();
      stringWriter1.append('3');
      simpleNode0.dump("CompilationUnit : W : W : W : d", stringWriter1);
      simpleNode0.dump((String) null, stringWriter0);
      assertEquals("3<<3<CompilationUnit>\n  <identifier>CompilationUnit : W : W : W : dCompilationUnit</identifier>\n  <identifier>*lshft</identifier>\n  <identifier>*lshft</identifier>\n</CompilationUnit>\n<CompilationUnit>\n  <identifier>CompilationUnit : W : W : W : dCompilationUnit</identifier>\n  <identifier>*lshft</identifier>\n  <identifier>*lshft</identifier>\n</CompilationUnit>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.908908734898781
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(1);
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.setIdentifier("*lshft");
      StringWriter stringWriter1 = stringWriter0.append((CharSequence) "*lshft");
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      arrayList0.add(">");
      arrayList0.add("<<");
      ArrayList<String> arrayList1 = simpleNode0.identifiers;
      arrayList1.add("Y9([._Xc@");
      arrayList1.add("Y9([._Xc@");
      ArrayList<String> arrayList2 = simpleNode0.identifiers;
      arrayList2.add("N!gd");
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "[;");
      simpleNode0.toString("Axr+&j7");
      StringWriter stringWriter2 = new StringWriter();
      stringWriter0.append('.');
      stringWriter1.append((CharSequence) "<<");
      stringWriter0.write("<<");
      StringWriter stringWriter3 = new StringWriter();
      StringWriter stringWriter4 = stringWriter3.append('-');
      stringWriter4.append((CharSequence) "Y9([._Xc@", 1, 1);
      simpleNode0.dump("\":\"", stringWriter1);
      assertEquals("*lshft.<<<<<PackageDeclaration>\n  <identifier>*lshft</identifier>\n  <identifier>*gt</identifier>\n  <identifier>*lshft</identifier>\n  <identifier>Y9([._Xc@</identifier>\n  <identifier>Y9([._Xc@</identifier>\n  <identifier>N!gd</identifier>\n</PackageDeclaration>\n", stringWriter1.toString());
      
      simpleNode0.dump("*lshft", stringWriter4);
      assertEquals("-<PackageDeclaration>\n  <identifier>*lshft</identifier>\n  <identifier>*gt</identifier>\n  <identifier>*lshft</identifier>\n  <identifier>Y9([._Xc@</identifier>\n  <identifier>Y9([._Xc@</identifier>\n  <identifier>N!gd</identifier>\n</PackageDeclaration>\n", stringWriter3.toString());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.0437938808441543
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "V{");
      SimpleNode simpleNode0 = new SimpleNode(18);
      simpleNode0.toString("CompilationUnit : W : W : W : d");
      simpleNode0.setIdentifier("CompilationUnit : W : W : W : dVariableDeclaratorId");
      ArrayList<String> arrayList0 = new ArrayList<String>();
      arrayList0.add("N!gd");
      arrayList0.add("<<");
      ArrayList<String> arrayList1 = simpleNode0.identifiers;
      arrayList1.add("<<");
      arrayList1.add("<<");
      arrayList1.add("V{");
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "N!gd");
      simpleNode0.toString("CompilationUnit : W : W : W : dVariableDeclaratorId");
      StringWriter stringWriter0 = new StringWriter();
      stringWriter0.append('.');
      StringWriter stringWriter1 = stringWriter0.append((CharSequence) "<<");
      StringWriter stringWriter2 = new StringWriter();
      StringWriter stringWriter3 = stringWriter1.append('.');
      simpleNode0.dump("CompilationUnit : W : W : W : d", stringWriter1);
      simpleNode0.dump((String) null, stringWriter0);
      simpleNode0.dump("CompilationUnit : W : W : W : dVariableDeclaratorId", stringWriter3);
      assertEquals(".<<.<VariableDeclaratorId>\n  <identifier>CompilationUnit : W : W : W : dVariableDeclaratorId</identifier>\n  <identifier>*lshft</identifier>\n  <identifier>*lshft</identifier>\n  <identifier>V{</identifier>\n</VariableDeclaratorId>\n<VariableDeclaratorId>\n  <identifier>CompilationUnit : W : W : W : dVariableDeclaratorId</identifier>\n  <identifier>*lshft</identifier>\n  <identifier>*lshft</identifier>\n  <identifier>V{</identifier>\n</VariableDeclaratorId>\n<VariableDeclaratorId>\n  <identifier>CompilationUnit : W : W : W : dVariableDeclaratorId</identifier>\n  <identifier>*lshft</identifier>\n  <identifier>*lshft</identifier>\n  <identifier>V{</identifier>\n</VariableDeclaratorId>\n", stringWriter0.toString());
      assertEquals(".<<.<VariableDeclaratorId>\n  <identifier>CompilationUnit : W : W : W : dVariableDeclaratorId</identifier>\n  <identifier>*lshft</identifier>\n  <identifier>*lshft</identifier>\n  <identifier>V{</identifier>\n</VariableDeclaratorId>\n<VariableDeclaratorId>\n  <identifier>CompilationUnit : W : W : W : dVariableDeclaratorId</identifier>\n  <identifier>*lshft</identifier>\n  <identifier>*lshft</identifier>\n  <identifier>V{</identifier>\n</VariableDeclaratorId>\n<VariableDeclaratorId>\n  <identifier>CompilationUnit : W : W : W : dVariableDeclaratorId</identifier>\n  <identifier>*lshft</identifier>\n  <identifier>*lshft</identifier>\n  <identifier>V{</identifier>\n</VariableDeclaratorId>\n", stringWriter1.toString());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.5670609309552819
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(1);
      Node[] nodeArray0 = new Node[7];
      nodeArray0[0] = (Node) simpleNode0;
      nodeArray0[1] = (Node) simpleNode0;
      nodeArray0[2] = (Node) simpleNode0;
      FileSystemHandling.shouldAllThrowIOExceptions();
      JavaParser javaParser0 = new JavaParser("-|4x");
      SimpleNode simpleNode1 = new SimpleNode(javaParser0, 1);
      StringWriter stringWriter0 = new StringWriter(1);
      simpleNode1.setIdentifier("&&");
      StringWriter stringWriter1 = new StringWriter();
      simpleNode1.dump("-|4x", stringWriter1);
      simpleNode0.dump("-|4x", stringWriter1);
      assertEquals("<PackageDeclaration>\n  <identifier>*amp</identifier>\n</PackageDeclaration>\n", stringWriter1.toString());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.908908734898781
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(5);
      Node[] nodeArray0 = new Node[7];
      nodeArray0[0] = (Node) simpleNode0;
      nodeArray0[1] = (Node) simpleNode0;
      nodeArray0[2] = (Node) simpleNode0;
      FileSystemHandling.shouldAllThrowIOExceptions();
      nodeArray0[3] = (Node) simpleNode0;
      nodeArray0[4] = (Node) simpleNode0;
      nodeArray0[6] = (Node) simpleNode0;
      nodeArray0[3] = (Node) simpleNode0;
      SimpleNode simpleNode1 = new SimpleNode(5);
      simpleNode0.jjtAddChild(simpleNode1, 0);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "-|4x");
      simpleNode1.toString("q");
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = stringWriter0.append('.');
      stringWriter1.append((CharSequence) "q");
      StringWriter stringWriter2 = new StringWriter();
      StringWriter stringWriter3 = stringWriter1.append('.');
      simpleNode0.dump("q", stringWriter3);
      assertEquals(1, simpleNode0.jjtGetNumChildren());
      
      simpleNode1.dump((String) null, stringWriter1);
      simpleNode1.dump("q", stringWriter1);
      assertEquals(".q.<ClassOrInterfaceDeclaration></ClassOrInterfaceDeclaration>\n", stringWriter0.toString());
  }
}
