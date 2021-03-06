/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 17:06:22 GMT 2018
 */

package com.soops.CEN4010.JMCA.JParser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.soops.CEN4010.JMCA.JParser.JJTJavaParserState;
import com.soops.CEN4010.JMCA.JParser.JavaParser;
import com.soops.CEN4010.JMCA.JParser.Node;
import com.soops.CEN4010.JMCA.JParser.SimpleNode;
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
  /*Coverage entropy=0.9256504262569104
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("\"final\"");
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 0);
      simpleNode0.setIdentifier("\"final\"");
      String string0 = "";
      simpleNode0.toString();
      StringWriter stringWriter0 = new StringWriter();
      char[] charArray0 = new char[4];
      charArray0[0] = 'f';
      charArray0[1] = ',';
      charArray0[2] = '\"';
      charArray0[3] = '/';
      stringWriter0.write(charArray0, 0, 0);
      StringWriter stringWriter1 = stringWriter0.append((CharSequence) "\"final\"");
      simpleNode0.dump("", stringWriter1);
      try { 
        javaParser0.AnnotationTypeDeclaration(0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Parse error at line 1, column 0.  Encountered: <EOF>
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParser", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.33422114621338295
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(47);
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      arrayList0.add(">=");
      ArrayList<String> arrayList1 = new ArrayList<String>();
      arrayList1.add("Statement");
      StringWriter stringWriter0 = new StringWriter();
      char[] charArray0 = new char[0];
      stringWriter0.write(charArray0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      StringWriter stringWriter1 = stringWriter0.append((CharSequence) "Statement");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "Statement");
      simpleNode0.dump("}", stringWriter0);
      simpleNode0.dump("}", stringWriter1);
      SimpleNode simpleNode1 = new SimpleNode(47);
      simpleNode1.jjtAddChild(simpleNode0, 47);
      StringWriter stringWriter2 = stringWriter0.append((CharSequence) ">=");
      simpleNode1.dump(">=", stringWriter2);
      simpleNode0.dump(";&~nXSGIKA)", stringWriter0);
      simpleNode0.dump("*gt", stringWriter2);
      assertEquals("Statement<InstanceOfExpression>\n  <identifier>*ge</identifier>\n</InstanceOfExpression>\n<InstanceOfExpression>\n  <identifier>*ge</identifier>\n</InstanceOfExpression>\n>=<InstanceOfExpression><InstanceOfExpression>\n  <identifier>*ge</identifier>\n</InstanceOfExpression>\n</InstanceOfExpression>\n<InstanceOfExpression>\n  <identifier>*ge</identifier>\n</InstanceOfExpression>\n<InstanceOfExpression>\n  <identifier>*ge</identifier>\n</InstanceOfExpression>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.4709001279172663
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("'ej{h`$C1L");
      SimpleNode simpleNode0 = new SimpleNode(47);
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      simpleNode0.dump("ConstructorDeclaration", (Writer) null);
      arrayList0.add(">=");
      arrayList0.add("'ej{h`$C1L");
      ArrayList<String> arrayList1 = new ArrayList<String>();
      arrayList1.add("Statement");
      simpleNode0.jjtGetParent();
      StringWriter stringWriter0 = new StringWriter();
      SimpleNode simpleNode1 = new SimpleNode(javaParser0, 47);
      stringWriter0.close();
      SimpleNode simpleNode2 = new SimpleNode((-750));
      simpleNode2.dump(">=", (Writer) null);
      simpleNode0.jjtGetParent();
      StringWriter stringWriter1 = new StringWriter();
      FileSystemHandling.shouldAllThrowIOExceptions();
      simpleNode2.dump("ConstructorDeclaration", stringWriter0);
      simpleNode0.dump("Statement", stringWriter0);
      simpleNode1.dump("is:#", (Writer) null);
      simpleNode0.dump("cTcU\"XX", stringWriter1);
      // Undeclared exception!
      try { 
        simpleNode0.dump("'ej{h`$C1L", (Writer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(10);
      simpleNode0.identifiers = null;
      // Undeclared exception!
      try { 
        simpleNode0.jjtGetChild(349);
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(10);
      simpleNode0.jjtClose();
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.3805062184775959
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("'ej{h`$C1L");
      JavaParser javaParser1 = new JavaParser("'ej{h`$C1L");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/home/ubuntu/evosuite_readability_gen/projects/19_jmca");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, (String) null);
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.setIdentifier("<<");
      StringWriter stringWriter0 = new StringWriter();
      char[] charArray0 = new char[6];
      charArray0[0] = '/';
      charArray0[1] = '\"';
      charArray0[2] = '\"';
      charArray0[3] = '\"';
      charArray0[4] = '\"';
      charArray0[5] = '/';
      EvoSuiteFile evoSuiteFile1 = new EvoSuiteFile("'ej{h`$C1L");
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)10;
      byteArray0[3] = (byte)10;
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte) (-1);
      FileSystemHandling.appendDataToFile(evoSuiteFile1, byteArray0);
      stringWriter0.write(charArray0, 0, 0);
      stringWriter0.append((CharSequence) "<<");
      simpleNode0.dump("", stringWriter0);
      JJTJavaParserState jJTJavaParserState0 = javaParser0.jjtree;
      JJTJavaParserState jJTJavaParserState1 = javaParser0.jjtree;
      // Undeclared exception!
      try { 
        jJTJavaParserState1.rootNode();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      SimpleNode simpleNode0 = new SimpleNode(30);
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      arrayList0.add("");
      arrayList0.add("");
      arrayList0.add("");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("", stringWriter0);
      simpleNode0.dump("C0orpQskL?da^eNQr", stringWriter0);
      assertEquals("<ClassOrInterfaceType>\n</ClassOrInterfaceType>\n<ClassOrInterfaceType>\n</ClassOrInterfaceType>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.5140966973399504
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = "";
      JavaParser javaParser0 = new JavaParser("'ej{h`$C1L");
      SimpleNode simpleNode0 = new SimpleNode(47);
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      Writer writer0 = null;
      simpleNode0.dump("'ej{h`$C1L", (Writer) null);
      arrayList0.add("ShiftExpression");
      arrayList0.add("ConstructorDeclaration");
      String string1 = null;
      arrayList0.add((String) null);
      simpleNode0.toString();
      simpleNode0.jjtGetParent();
      StringWriter stringWriter0 = new StringWriter();
      stringWriter0.write(47);
      FileSystemHandling.shouldAllThrowIOExceptions();
      simpleNode0.parser = javaParser0;
      // Undeclared exception!
      try { 
        simpleNode0.dump("bLvri1", stringWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(47);
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      arrayList0.add(">=");
      ArrayList<String> arrayList1 = new ArrayList<String>();
      arrayList1.add("Statement");
      StringWriter stringWriter0 = new StringWriter();
      char[] charArray0 = new char[0];
      stringWriter0.write(charArray0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      simpleNode0.dump("/}", stringWriter0);
      simpleNode0.dump("/}", stringWriter0);
      SimpleNode simpleNode1 = new SimpleNode(47);
      simpleNode0.jjtSetParent(simpleNode1);
      simpleNode1.dump(">=", stringWriter0);
      simpleNode0.dump("\"(\"", stringWriter0);
      assertEquals("<InstanceOfExpression>\n  <identifier>*ge</identifier>\n</InstanceOfExpression>\n<InstanceOfExpression>\n  <identifier>*ge</identifier>\n</InstanceOfExpression>\n<InstanceOfExpression>\n  <identifier>*ge</identifier>\n</InstanceOfExpression>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((-531));
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      arrayList0.add("");
      simpleNode0.id = (-531);
      Node node0 = simpleNode0.parent;
      Node node1 = simpleNode0.parent;
      simpleNode0.jjtAddChild((Node) null, 111);
      int int0 = simpleNode0.jjtGetNumChildren();
      assertEquals(112, int0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.6816102690529531
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(1);
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      arrayList0.add("{");
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      arrayList0.add("{");
      simpleNode0.toString("=");
      arrayList0.add("<");
      simpleNode0.jjtGetParent();
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("\"public\"", stringWriter0);
      simpleNode0.dump("{", stringWriter0);
      assertEquals("<PackageDeclaration>\n  <identifier>*lt</identifier>\n</PackageDeclaration>\n<PackageDeclaration>\n  <identifier>*lt</identifier>\n</PackageDeclaration>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      StringWriter stringWriter0 = new StringWriter();
      Node[] nodeArray0 = new Node[0];
      simpleNode0.children = nodeArray0;
      simpleNode0.dump("\"<\"", stringWriter0);
      simpleNode0.setIdentifier("");
      simpleNode0.jjtGetParent();
      StringWriter stringWriter1 = new StringWriter();
      simpleNode0.dump("", stringWriter1);
      assertEquals("<CompilationUnit>\n</CompilationUnit>\n", stringWriter1.toString());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(29);
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      String string0 = "yj*8;#k{YSB4YW";
      arrayList0.add("yj*8;#k{YSB4YW");
      arrayList0.add("yj*8;#k{YSB4YW");
      arrayList0.add("yj*8;#k{YSB4YW");
      String string1 = " ";
      arrayList0.add(" ");
      Node node0 = null;
      simpleNode0.jjtAddChild((Node) null, 10);
      simpleNode0.jjtAddChild((Node) null, 29);
      StringWriter stringWriter0 = new StringWriter();
      int int0 = 86;
      // Undeclared exception!
      try { 
        stringWriter0.append((CharSequence) "yj*8;#k{YSB4YW", 86, (-2748));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((-531));
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      arrayList0.add("");
      simpleNode0.id = (-531);
      simpleNode0.identifiers = arrayList0;
      simpleNode0.jjtGetParent();
      simpleNode0.jjtGetParent();
      int int0 = simpleNode0.jjtGetNumChildren();
      assertEquals(0, int0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("\"final\"");
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 0);
      simpleNode0.setIdentifier("\"final\"");
      Node node0 = simpleNode0.parent;
      simpleNode0.jjtAddChild((Node) null, 0);
      simpleNode0.toString();
      simpleNode0.jjtAddChild((Node) null, 0);
      assertEquals(1, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(30);
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      arrayList0.add("ClassOrInterfaceBodyDeclaration");
      arrayList0.add(">");
      arrayList0.add("ConditionalOrExpression");
      Node node0 = simpleNode0.parent;
      StringWriter stringWriter0 = new StringWriter();
      FileSystemHandling.shouldAllThrowIOExceptions();
      simpleNode0.dump("eZ9Q!GW_?S8[pSAwkA)", stringWriter0);
      simpleNode0.dump(";", stringWriter0);
      assertEquals("<ClassOrInterfaceType>\n  <identifier>ClassOrInterfaceBodyDeclaration</identifier>\n  <identifier>*gt</identifier>\n  <identifier>ConditionalOrExpression</identifier>\n</ClassOrInterfaceType>\n<ClassOrInterfaceType>\n  <identifier>ClassOrInterfaceBodyDeclaration</identifier>\n  <identifier>*gt</identifier>\n  <identifier>ConditionalOrExpression</identifier>\n</ClassOrInterfaceType>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(63);
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      arrayList0.add("ShiftExpression");
      arrayList0.add("ConstructorDeclaration");
      arrayList0.add((String) null);
      simpleNode0.jjtGetParent();
      StringWriter stringWriter0 = new StringWriter();
      FileSystemHandling.shouldAllThrowIOExceptions();
      StringWriter stringWriter1 = new StringWriter();
      stringWriter1.append((CharSequence) "");
      simpleNode0.dump("", stringWriter1);
      assertEquals("<Literal>\n<identifier>Literal Value</identifier>\n</Literal>\n", stringWriter1.toString());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.19144408195771734
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(30);
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      arrayList0.add("{");
      arrayList0.add("<");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("<", stringWriter0);
      simpleNode0.dump("<", stringWriter0);
      simpleNode0.dump("{", stringWriter0);
      simpleNode0.dump("{", stringWriter0);
      assertEquals("<ClassOrInterfaceType>\n  <identifier>*lt</identifier>\n</ClassOrInterfaceType>\n<ClassOrInterfaceType>\n  <identifier>*lt</identifier>\n</ClassOrInterfaceType>\n<ClassOrInterfaceType>\n  <identifier>*lt</identifier>\n</ClassOrInterfaceType>\n<ClassOrInterfaceType>\n  <identifier>*lt</identifier>\n</ClassOrInterfaceType>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("'ej{h`$C1L");
      SimpleNode simpleNode0 = new SimpleNode(47);
      ArrayList<String> arrayList0 = new ArrayList<String>();
      ArrayList<String> arrayList1 = simpleNode0.identifiers;
      arrayList1.add("}");
      StringWriter stringWriter0 = new StringWriter();
      char[] charArray0 = new char[5];
      charArray0[1] = '4';
      charArray0[2] = '>';
      charArray0[3] = '!';
      charArray0[4] = '\"';
      stringWriter0.write(charArray0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      StringWriter stringWriter1 = stringWriter0.append((CharSequence) "'ej{h`$C1L");
      simpleNode0.dump("'ej{h`$C1L", stringWriter1);
      simpleNode0.dump("}", stringWriter0);
      SimpleNode simpleNode1 = new SimpleNode(86);
      stringWriter0.append((CharSequence) "}");
      simpleNode0.dump("'ej{h`$C1L", stringWriter0);
      simpleNode0.dump("\"static\"", stringWriter1);
      assertEquals("\u00004>!\"'ej{h`$C1L<InstanceOfExpression>\n</InstanceOfExpression>\n<InstanceOfExpression>\n</InstanceOfExpression>\n}<InstanceOfExpression>\n</InstanceOfExpression>\n<InstanceOfExpression>\n</InstanceOfExpression>\n", stringWriter1.toString());
      assertEquals("\u00004>!\"'ej{h`$C1L<InstanceOfExpression>\n</InstanceOfExpression>\n<InstanceOfExpression>\n</InstanceOfExpression>\n}<InstanceOfExpression>\n</InstanceOfExpression>\n<InstanceOfExpression>\n</InstanceOfExpression>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(4);
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      simpleNode0.dump("ConstructorDeclaration", (Writer) null);
      arrayList0.add("*4");
      arrayList0.add(";");
      Node node0 = simpleNode0.parent;
      StringWriter stringWriter0 = new StringWriter();
      FileSystemHandling.shouldAllThrowIOExceptions();
      stringWriter0.append((CharSequence) "*4");
      simpleNode0.dump("y5^ZOs1C.", stringWriter0);
      simpleNode0.dump("*4", stringWriter0);
      simpleNode0.dump("ConstructorDeclaration", stringWriter0);
      simpleNode0.dump("ConstructorDeclaration", stringWriter0);
      // Undeclared exception!
      try { 
        simpleNode0.dump("*4", (Writer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("'ej{h`$C1L");
      JavaParser javaParser1 = new JavaParser("'ej{h`$C1L");
      SimpleNode simpleNode0 = new SimpleNode(0);
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      arrayList0.add("&");
      arrayList0.add("pYakh:@g=y3No0N`@]");
      ArrayList<String> arrayList1 = simpleNode0.identifiers;
      SimpleNode simpleNode1 = new SimpleNode(0);
      StringWriter stringWriter0 = new StringWriter();
      FileSystemHandling.shouldAllThrowIOExceptions();
      StringWriter stringWriter1 = new StringWriter();
      simpleNode0.dump("=LRA", stringWriter1);
      SimpleNode simpleNode2 = new SimpleNode(0);
      StringWriter stringWriter2 = stringWriter1.append((CharSequence) "*4");
      simpleNode0.dump("q&*d[CC6a\"'zEt", stringWriter2);
      StringWriter stringWriter3 = stringWriter0.append((CharSequence) ">");
      simpleNode0.dump((String) null, stringWriter3);
      simpleNode0.dump("U[j<Z6-?5", stringWriter0);
      assertEquals("><CompilationUnit>\n  <identifier>*amp</identifier>\n  <identifier>pYakh:@g=y3No0N`@]</identifier>\n</CompilationUnit>\n<CompilationUnit>\n  <identifier>*amp</identifier>\n  <identifier>pYakh:@g=y3No0N`@]</identifier>\n</CompilationUnit>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.5445996236821669
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(4);
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      Writer writer0 = null;
      simpleNode0.dump("ConstructorDeclaration", (Writer) null);
      String string0 = "<";
      arrayList0.add("*4");
      arrayList0.add("<");
      Node node0 = simpleNode0.parent;
      StringWriter stringWriter0 = new StringWriter();
      arrayList0.add("ConstructorDeclaration");
      char[] charArray0 = new char[7];
      simpleNode0.toString();
      charArray0[0] = '7';
      charArray0[1] = '2';
      arrayList0.iterator();
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, ">>");
      charArray0[2] = '4';
      String string1 = "<=";
      arrayList0.add("<=");
      simpleNode0.jjtGetParent();
      StringWriter stringWriter1 = new StringWriter();
      stringWriter1.write(charArray0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      stringWriter0.append((CharSequence) "*4");
      simpleNode0.dump("<", stringWriter1);
      simpleNode0.dump("*4", stringWriter1);
      simpleNode0.dump("<", stringWriter1);
      // Undeclared exception!
      try { 
        simpleNode0.dump("y5^ZOs1C.", (Writer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(47);
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      arrayList0.add(">=");
      ArrayList<String> arrayList1 = new ArrayList<String>();
      arrayList1.add("Statement");
      ArrayList<String> arrayList2 = simpleNode0.identifiers;
      arrayList2.add("&&");
      StringWriter stringWriter0 = new StringWriter();
      char[] charArray0 = new char[3];
      charArray0[0] = ' ';
      charArray0[1] = '!';
      charArray0[2] = 's';
      stringWriter0.write(charArray0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      StringWriter stringWriter1 = stringWriter0.append((CharSequence) "&&");
      StringWriter stringWriter2 = new StringWriter();
      simpleNode0.dump((String) null, stringWriter2);
      SimpleNode simpleNode1 = new SimpleNode(453);
      stringWriter2.append((CharSequence) "{");
      simpleNode1.dump((String) null, stringWriter1);
      simpleNode1.dump("}", stringWriter0);
      simpleNode1.dump("xJ{'co", stringWriter2);
      assertEquals("<InstanceOfExpression>\n  <identifier>*ge</identifier>\n  <identifier>*amp</identifier>\n</InstanceOfExpression>\n{", stringWriter2.toString());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(47);
      simpleNode0.setIdentifier(">>");
      SystemInUtil.addInputLine("");
      ArrayList<String> arrayList0 = new ArrayList<String>();
      arrayList0.add("Statement");
      StringWriter stringWriter0 = new StringWriter();
      char[] charArray0 = new char[0];
      stringWriter0.write(charArray0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      simpleNode0.dump("y_\",6<W(", stringWriter0);
      assertEquals("<InstanceOfExpression>\n  <identifier>*rshft</identifier>\n</InstanceOfExpression>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("\"@j2r^qe4 ");
      SimpleNode simpleNode0 = new SimpleNode(18);
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      arrayList0.add(">=");
      arrayList0.add("\"@j2r^qe4 ");
      ArrayList<String> arrayList1 = new ArrayList<String>();
      StringWriter stringWriter0 = new StringWriter();
      arrayList0.add(">=");
      arrayList1.iterator();
      arrayList0.add("ql~9");
      StringWriter stringWriter1 = stringWriter0.append((CharSequence) ">=");
      SystemInUtil.addInputLine("\"@j2r^qe4 ");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("'ej{h`$C1L");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "!Ew'JzFW8b;");
      simpleNode0.dump("<=", stringWriter0);
      simpleNode0.dump("'ej3h`$C1L", stringWriter1);
      simpleNode0.dump("<=", stringWriter0);
      simpleNode0.dump("iual\":M0Jk@", stringWriter1);
      simpleNode0.dump("da6", stringWriter0);
      simpleNode0.dump("$eM8tL?!`D,<|:2~.a", stringWriter0);
      assertSame(stringWriter0, stringWriter1);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("'*j{h`$C1");
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 18);
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      arrayList0.add(")");
      arrayList0.add("true");
      ArrayList<String> arrayList1 = new ArrayList<String>();
      StringWriter stringWriter0 = new StringWriter();
      String string0 = "_D|eY`ctc?r9KV5%>8";
      arrayList1.add("_D|eY`ctc?r9KV5%>8");
      arrayList1.iterator();
      char[] charArray0 = new char[2];
      charArray0[0] = 'R';
      charArray0[1] = '.';
      stringWriter0.write(charArray0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      StringWriter stringWriter1 = stringWriter0.append((CharSequence) "<=");
      simpleNode0.dump("VariableDeclaratorId", stringWriter1);
      stringWriter1.append((CharSequence) "_D|eY`ctc?r9KV5%>8");
      simpleNode0.dump("j=+&-,$yBT9Xsem|ya", stringWriter0);
      simpleNode0.dump(">=", stringWriter0);
      // Undeclared exception!
      try { 
        stringWriter0.append((CharSequence) ")", 18, 18);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }
}
