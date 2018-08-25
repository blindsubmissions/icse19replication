/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 15:09:27 GMT 2018
 */

package com.soops.CEN4010.JMCA.JParser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.soops.CEN4010.JMCA.JParser.JavaParser;
import com.soops.CEN4010.JMCA.JParser.Node;
import com.soops.CEN4010.JMCA.JParser.SimpleNode;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SimpleNode_ESTest extends SimpleNode_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.3805062184775959
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.jjtOpen();
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      simpleNode0.identifiers = arrayList0;
      arrayList0.add("#j");
      arrayList0.add("\"IK&-kkUUXC8#k@G");
      arrayList0.add("#j");
      simpleNode0.identifiers.add("Q?");
      StringWriter stringWriter0 = new StringWriter(10);
      StringWriter stringWriter1 = stringWriter0.append('X');
      StringWriter stringWriter2 = stringWriter1.append((CharSequence) "#j");
      stringWriter2.append((CharSequence) "#j");
      simpleNode0.dump("ExtendsList", stringWriter0);
      simpleNode0.dump("\"IK&-kkUUXC8#k@G", stringWriter2);
      simpleNode0.dump("n-Y'7~UU)LM<", stringWriter2);
      assertEquals("X#j#j<CompilationUnit>\n  <identifier>#j</identifier>\n  <identifier>\"IK&-kkUUXC8#k@G</identifier>\n  <identifier>#j</identifier>\n  <identifier>Q?</identifier>\n</CompilationUnit>\n<CompilationUnit>\n  <identifier>#j</identifier>\n  <identifier>\"IK&-kkUUXC8#k@G</identifier>\n  <identifier>#j</identifier>\n  <identifier>Q?</identifier>\n</CompilationUnit>\n<CompilationUnit>\n  <identifier>#j</identifier>\n  <identifier>\"IK&-kkUUXC8#k@G</identifier>\n  <identifier>#j</identifier>\n  <identifier>Q?</identifier>\n</CompilationUnit>\n", stringWriter2.toString());
      assertEquals("X#j#j<CompilationUnit>\n  <identifier>#j</identifier>\n  <identifier>\"IK&-kkUUXC8#k@G</identifier>\n  <identifier>#j</identifier>\n  <identifier>Q?</identifier>\n</CompilationUnit>\n<CompilationUnit>\n  <identifier>#j</identifier>\n  <identifier>\"IK&-kkUUXC8#k@G</identifier>\n  <identifier>#j</identifier>\n  <identifier>Q?</identifier>\n</CompilationUnit>\n<CompilationUnit>\n  <identifier>#j</identifier>\n  <identifier>\"IK&-kkUUXC8#k@G</identifier>\n  <identifier>#j</identifier>\n  <identifier>Q?</identifier>\n</CompilationUnit>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.39537219111499866
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      int int0 = 47;
      SimpleNode simpleNode0 = new SimpleNode(47);
      String string0 = "<<";
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      arrayList0.add("<<");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("#Zp6lKz`kmb", stringWriter0);
      ArrayList<String> arrayList1 = simpleNode0.identifiers;
      FileSystemHandling.shouldAllThrowIOExceptions();
      StringWriter stringWriter1 = new StringWriter();
      SimpleNode simpleNode1 = new SimpleNode(47);
      Node[] nodeArray0 = new Node[1];
      nodeArray0[0] = (Node) simpleNode0;
      simpleNode1.children = nodeArray0;
      JavaParser javaParser0 = new JavaParser("#Zp6lKz`kmb");
      try { 
        javaParser0.ResultType();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Parse error at line 1, column 0.  Encountered: <EOF>
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParser", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
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
  //Test case number: 3
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      int int0 = simpleNode0.jjtGetNumChildren();
      assertEquals(0, int0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.33422114621338295
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      StringWriter stringWriter0 = new StringWriter();
      Node node0 = simpleNode0.parent;
      StringWriter stringWriter1 = new StringWriter(0);
      simpleNode0.dump((String) null, stringWriter1);
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      ArrayList<String> arrayList1 = simpleNode0.identifiers;
      arrayList1.add("y");
      simpleNode0.dump("y", stringWriter1);
      simpleNode0.dump((String) null, stringWriter1);
      StringWriter stringWriter2 = stringWriter1.append('{');
      simpleNode0.dump("y", stringWriter2);
      simpleNode0.setIdentifier("y");
      stringWriter2.write("else");
      stringWriter2.write("<");
      simpleNode0.dump((String) null, stringWriter2);
      simpleNode0.dump((String) null, stringWriter1);
      assertEquals("<CompilationUnit>\n  <identifier>y</identifier>\n</CompilationUnit>\n<CompilationUnit>\n  <identifier>y</identifier>\n</CompilationUnit>\n{<CompilationUnit>\n  <identifier>y</identifier>\n</CompilationUnit>\nelse<<CompilationUnit>\n  <identifier>y</identifier>\n  <identifier>y</identifier>\n</CompilationUnit>\n<CompilationUnit>\n  <identifier>y</identifier>\n  <identifier>y</identifier>\n</CompilationUnit>\n", stringWriter1.toString());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.3805062184775959
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(47);
      SimpleNode simpleNode1 = new SimpleNode(47);
      simpleNode1.jjtGetParent();
      simpleNode0.parent = null;
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, ";eO=]zi4R%'?");
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      arrayList0.retainAll(linkedList0);
      arrayList0.add("(");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump(";eO=]zi4R%'?", stringWriter0);
      simpleNode0.dump("`.'Y%y,", stringWriter0);
      simpleNode0.dump("`.'Y%y,", stringWriter0);
      assertEquals("<InstanceOfExpression>\n  <identifier>(</identifier>\n</InstanceOfExpression>\n<InstanceOfExpression>\n  <identifier>(</identifier>\n</InstanceOfExpression>\n<InstanceOfExpression>\n  <identifier>(</identifier>\n</InstanceOfExpression>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.2706407936167974
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(37);
      StringWriter stringWriter0 = new StringWriter();
      Node node0 = simpleNode0.parent;
      simpleNode0.jjtAddChild((Node) null, 37);
      stringWriter0.write("lI8?EWJ1Dh45pJo");
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      StringWriter stringWriter1 = new StringWriter(40);
      simpleNode0.dump((String) null, stringWriter1);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      stringWriter1.write(37);
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "}q_Vv|");
      ArrayList<String> arrayList1 = simpleNode0.identifiers;
      ArrayList<String> arrayList2 = simpleNode0.identifiers;
      arrayList2.add("z");
      StringWriter stringWriter2 = new StringWriter();
      simpleNode0.dump("}", stringWriter2);
      SimpleNode simpleNode1 = new SimpleNode(28);
      simpleNode0.dump("29ns0", stringWriter0);
      assertEquals(38, simpleNode0.jjtGetNumChildren());
      
      simpleNode1.dump("lI8?EWJ1Dh45pJo", stringWriter1);
      simpleNode1.dump("VariableDeclaratorId", stringWriter1);
      assertEquals("<NameList></NameList>\n%", stringWriter1.toString());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.42425409852044593
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      StringWriter stringWriter0 = new StringWriter();
      Node node0 = simpleNode0.parent;
      simpleNode0.jjtAddChild((Node) null, 0);
      StringWriter stringWriter1 = new StringWriter(0);
      simpleNode0.dump((String) null, stringWriter1);
      simpleNode0.jjtSetParent((Node) null);
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      ArrayList<String> arrayList1 = simpleNode0.identifiers;
      arrayList1.add("y");
      StringWriter stringWriter2 = new StringWriter();
      simpleNode0.dump("CompilationUnit", stringWriter1);
      simpleNode0.dump("CompilationUnit", stringWriter2);
      simpleNode0.dump("", stringWriter2);
      assertEquals(1, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.5500569563964232
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(47);
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.toString("#c ");
      Node node0 = simpleNode0.parent;
      simpleNode0.jjtAddChild((Node) null, 47);
      simpleNode0.dump((String) null, stringWriter0);
      simpleNode0.dump((String) null, stringWriter0);
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      arrayList0.add("]");
      StringWriter stringWriter1 = new StringWriter();
      simpleNode0.dump((String) null, stringWriter1);
      simpleNode0.dump("23>`ArYx(gl", stringWriter0);
      simpleNode0.dump("9LJ!>}@", stringWriter0);
      assertEquals(48, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.3805062184775959
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.toString();
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, ";eO=]zi4R%'?");
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      arrayList0.add("(");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("H^^37+", stringWriter0);
      simpleNode0.dump("`.'Y%y,", stringWriter0);
      assertEquals("<CompilationUnit>\n  <identifier>(</identifier>\n</CompilationUnit>\n<CompilationUnit>\n  <identifier>(</identifier>\n</CompilationUnit>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.5481178804418445
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(9);
      simpleNode0.jjtClose();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      simpleNode0.identifiers = arrayList0;
      FileSystemHandling.shouldAllThrowIOExceptions();
      arrayList0.add("\"IKt-k^UUXC8@G");
      StringWriter stringWriter0 = new StringWriter(2106);
      StringWriter stringWriter1 = stringWriter0.append((CharSequence) "\"IKt-k^UUXC8@G");
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      stringWriter0.append('0');
      simpleNode0.toString();
      simpleNode0.dump("ic+", stringWriter1);
      simpleNode0.dump("\"IKt-k^UUXC8@G", stringWriter0);
      simpleNode0.dump("\"IKt-k^UUXC8@G", stringWriter0);
      StringWriter stringWriter2 = stringWriter1.append('0');
      simpleNode0.dump("SHrsVd\"S#]q}8-I&/t", stringWriter2);
      assertEquals("\"IKt-k^UUXC8@G0<EnumBody>\n  <identifier>\"IKt-k^UUXC8@G</identifier>\n</EnumBody>\n<EnumBody>\n  <identifier>\"IKt-k^UUXC8@G</identifier>\n</EnumBody>\n<EnumBody>\n  <identifier>\"IKt-k^UUXC8@G</identifier>\n</EnumBody>\n0<EnumBody>\n  <identifier>\"IKt-k^UUXC8@G</identifier>\n</EnumBody>\n", stringWriter2.toString());
      assertEquals("\"IKt-k^UUXC8@G0<EnumBody>\n  <identifier>\"IKt-k^UUXC8@G</identifier>\n</EnumBody>\n<EnumBody>\n  <identifier>\"IKt-k^UUXC8@G</identifier>\n</EnumBody>\n<EnumBody>\n  <identifier>\"IKt-k^UUXC8@G</identifier>\n</EnumBody>\n0<EnumBody>\n  <identifier>\"IKt-k^UUXC8@G</identifier>\n</EnumBody>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.1461447460085638
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      SimpleNode simpleNode0 = new SimpleNode(47);
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      arrayList0.add("<<");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("#Zp6lKz`kmb", stringWriter0);
      ArrayList<String> arrayList1 = simpleNode0.identifiers;
      FileSystemHandling.shouldAllThrowIOExceptions();
      StringWriter stringWriter1 = new StringWriter();
      SimpleNode simpleNode1 = new SimpleNode(47);
      Node[] nodeArray0 = new Node[1];
      nodeArray0[0] = (Node) simpleNode0;
      simpleNode1.children = nodeArray0;
      simpleNode1.dump("#Zp6lKz`kmb", stringWriter0);
      simpleNode0.dump("#Zp6lKz`kmb", stringWriter1);
      simpleNode1.dump("<<", stringWriter0);
      simpleNode0.dump("<<", stringWriter1);
      simpleNode1.dump("JY4\".(k?d[2v>~H#", stringWriter1);
      simpleNode1.dump("JY4\".(k?d[2v>~H#", stringWriter1);
      assertEquals("<InstanceOfExpression>\n  <identifier>*lshft</identifier>\n</InstanceOfExpression>\n<InstanceOfExpression>\n  <identifier>*lshft</identifier>\n</InstanceOfExpression>\n<InstanceOfExpression><InstanceOfExpression>\n  <identifier>*lshft</identifier>\n</InstanceOfExpression>\n</InstanceOfExpression>\n<InstanceOfExpression><InstanceOfExpression>\n  <identifier>*lshft</identifier>\n</InstanceOfExpression>\n</InstanceOfExpression>\n", stringWriter1.toString());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.1732052067491771
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "*ge");
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      arrayList0.add("m");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("*ge", stringWriter0);
      SimpleNode simpleNode1 = new SimpleNode(0);
      simpleNode1.parent = (Node) simpleNode0;
      simpleNode1.dump("", stringWriter0);
      simpleNode1.dump("m", stringWriter0);
      assertEquals("<CompilationUnit>\n  <identifier>m</identifier>\n</CompilationUnit>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.33422114621338295
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(35);
      simpleNode0.jjtClose();
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      StringWriter stringWriter0 = new StringWriter();
      SimpleNode simpleNode1 = new SimpleNode(35);
      stringWriter0.write(35);
      ArrayList<String> arrayList1 = new ArrayList<String>();
      ArrayList<String> arrayList2 = simpleNode0.identifiers;
      arrayList2.add("z");
      simpleNode0.dump("{", stringWriter0);
      simpleNode1.dump("BiRVLo6Q=/<cvE,!", stringWriter0);
      simpleNode1.dump("8m", stringWriter0);
      simpleNode0.dump("8m", stringWriter0);
      assertEquals("#<ResultType>\n  <identifier>z</identifier>\n</ResultType>\n<ResultType>\n  <identifier>z</identifier>\n</ResultType>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      Node[] nodeArray0 = new Node[8];
      nodeArray0[0] = (Node) simpleNode0;
      nodeArray0[1] = (Node) simpleNode0;
      nodeArray0[1] = (Node) simpleNode0;
      nodeArray0[3] = (Node) simpleNode0;
      nodeArray0[4] = (Node) simpleNode0;
      nodeArray0[5] = (Node) simpleNode0;
      nodeArray0[6] = (Node) simpleNode0;
      nodeArray0[7] = (Node) simpleNode0;
      simpleNode0.children = nodeArray0;
      int int0 = simpleNode0.jjtGetNumChildren();
      assertEquals(8, int0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.5660857389596289
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      StringWriter stringWriter0 = new StringWriter();
      Node node0 = simpleNode0.parent;
      simpleNode0.jjtAddChild((Node) null, 0);
      simpleNode0.jjtAddChild((Node) null, 0);
      StringWriter stringWriter1 = stringWriter0.append((CharSequence) null);
      simpleNode0.dump((String) null, stringWriter1);
      simpleNode0.dump(":,", stringWriter0);
      assertEquals(1, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      Node node0 = simpleNode0.parent;
      simpleNode0.jjtAddChild((Node) null, 0);
      SimpleNode simpleNode1 = new SimpleNode(118);
      ArrayList<String> arrayList0 = new ArrayList<String>();
      simpleNode1.identifiers = arrayList0;
      simpleNode0.jjtAddChild(simpleNode1, 118);
      assertEquals(119, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "");
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      arrayList0.add("");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("*ge", stringWriter0);
      simpleNode0.dump("{", stringWriter0);
      assertEquals("<CompilationUnit>\n</CompilationUnit>\n<CompilationUnit>\n</CompilationUnit>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      StringWriter stringWriter0 = new StringWriter(0);
      StringWriter stringWriter1 = stringWriter0.append((CharSequence) null);
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      arrayList0.add("<=");
      simpleNode0.dump((String) null, stringWriter1);
      assertEquals("null<CompilationUnit>\n  <identifier>*le</identifier>\n</CompilationUnit>\n", stringWriter1.toString());
      assertEquals("null<CompilationUnit>\n  <identifier>*le</identifier>\n</CompilationUnit>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(9);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "*ge");
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      String string0 = ";";
      arrayList0.add(";");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump(";", stringWriter0);
      StringWriter stringWriter1 = null;
      try {
        stringWriter1 = new StringWriter((-681));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative buffer size
         //
         verifyException("java.io.StringWriter", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = new StringWriter();
      SimpleNode simpleNode1 = new SimpleNode(621);
      ArrayList<String> arrayList0 = new ArrayList<String>();
      ArrayList<String> arrayList1 = simpleNode0.identifiers;
      ArrayList<String> arrayList2 = simpleNode0.identifiers;
      arrayList2.add("}");
      simpleNode1.dump((String) null, stringWriter0);
      simpleNode0.dump("f+'Y&KMfn>$rw6&8s'", stringWriter1);
      simpleNode1.dump("BiRVLo6Q=/<cvE,!", stringWriter1);
      simpleNode0.dump("8m", stringWriter0);
      simpleNode0.dump("\"IKt-k^UUXC8@G", stringWriter1);
      assertEquals("<CompilationUnit>\n</CompilationUnit>\n<CompilationUnit>\n</CompilationUnit>\n", stringWriter1.toString());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.33422114621338295
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(6);
      simpleNode0.jjtClose();
      StringWriter stringWriter0 = new StringWriter(901);
      StringWriter stringWriter1 = new StringWriter(88);
      StringWriter stringWriter2 = new StringWriter(901);
      ArrayList<String> arrayList0 = new ArrayList<String>();
      arrayList0.add(">");
      ArrayList<String> arrayList1 = simpleNode0.identifiers;
      ArrayList<String> arrayList2 = simpleNode0.identifiers;
      arrayList2.add(">");
      simpleNode0.dump("Sb6", stringWriter2);
      SimpleNode simpleNode1 = new SimpleNode(901);
      simpleNode1.dump("&", stringWriter0);
      simpleNode0.dump(">", stringWriter0);
      assertEquals("<ExtendsList>\n  <identifier>*gt</identifier>\n</ExtendsList>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(28);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "Vp)6hr>?T}&");
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      arrayList0.add("&&");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump(";eO=]zi4R%'?", stringWriter0);
      simpleNode0.dump((String) null, stringWriter0);
      assertEquals("<Type>\n  <identifier>*amp</identifier>\n</Type>\n<Type>\n  <identifier>*amp</identifier>\n</Type>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.jjtOpen();
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      simpleNode0.identifiers = arrayList0;
      StringWriter stringWriter0 = new StringWriter(0);
      arrayList0.add("\"IK&-kkUUXC8#k@G");
      ArrayList<String> arrayList1 = simpleNode0.identifiers;
      arrayList0.add(">>");
      simpleNode0.dump("Q/", stringWriter0);
      simpleNode0.dump("ImplementsList", stringWriter0);
      assertEquals("<CompilationUnit>\n  <identifier>\"IK&-kkUUXC8#k@G</identifier>\n  <identifier>*rshft</identifier>\n</CompilationUnit>\n<CompilationUnit>\n  <identifier>\"IK&-kkUUXC8#k@G</identifier>\n  <identifier>*rshft</identifier>\n</CompilationUnit>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(6);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "</");
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      arrayList0.add("<");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump(";eO=]zi4R%'?", stringWriter0);
      StringWriter stringWriter1 = stringWriter0.append((CharSequence) "(");
      simpleNode0.dump("Fgw", stringWriter1);
      simpleNode0.dump(" : ", stringWriter0);
      assertEquals("<ExtendsList>\n  <identifier>*lt</identifier>\n</ExtendsList>\n(<ExtendsList>\n  <identifier>*lt</identifier>\n</ExtendsList>\n<ExtendsList>\n  <identifier>*lt</identifier>\n</ExtendsList>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      StringWriter stringWriter0 = new StringWriter();
      Node node0 = simpleNode0.parent;
      StringWriter stringWriter1 = new StringWriter(0);
      simpleNode0.dump((String) null, stringWriter1);
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      ArrayList<String> arrayList1 = simpleNode0.identifiers;
      arrayList0.add(">=");
      simpleNode0.dump(">=", stringWriter1);
      simpleNode0.dump((String) null, stringWriter0);
      simpleNode0.dump(",\"<#^(L=K^gG`ipQb", stringWriter0);
      assertEquals("<CompilationUnit>\n  <identifier>*ge</identifier>\n</CompilationUnit>\n<CompilationUnit>\n  <identifier>*ge</identifier>\n</CompilationUnit>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(9);
      StringWriter stringWriter0 = new StringWriter();
      Node node0 = simpleNode0.parent;
      SimpleNode simpleNode1 = new SimpleNode(1);
      simpleNode1.jjtAddChild(simpleNode0, 0);
      stringWriter0.append((CharSequence) null);
      StringWriter stringWriter1 = new StringWriter();
      simpleNode1.dump("\"RzMd]@jfjbx-v?<", stringWriter1);
      assertEquals(1, simpleNode1.jjtGetNumChildren());
      
      ArrayList<String> arrayList0 = new ArrayList<String>();
      ArrayList<String> arrayList1 = simpleNode1.identifiers;
      ArrayList<String> arrayList2 = simpleNode0.identifiers;
      arrayList2.add("&");
      StringWriter stringWriter2 = new StringWriter();
      simpleNode0.dump((String) null, stringWriter2);
      assertEquals("<EnumBody>\n  <identifier>*amp</identifier>\n</EnumBody>\n", stringWriter2.toString());
  }

  /**
  //Test case number: 27
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      SimpleNode simpleNode0 = new SimpleNode(47);
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      arrayList0.add("{");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("#Zp6lKz`kmb", stringWriter0);
      ArrayList<String> arrayList1 = simpleNode0.identifiers;
      FileSystemHandling.shouldAllThrowIOExceptions();
      StringWriter stringWriter1 = new StringWriter();
      SimpleNode simpleNode1 = new SimpleNode(47);
      Node[] nodeArray0 = new Node[1];
      nodeArray0[0] = (Node) simpleNode0;
      simpleNode1.children = nodeArray0;
      simpleNode1.dump("#Zp6lKz`kmb", stringWriter0);
      simpleNode0.dump("#Zp6lKz`kmb", stringWriter1);
      stringWriter0.append((CharSequence) "{");
      SimpleNode simpleNode2 = new SimpleNode(47);
      StringWriter stringWriter2 = stringWriter1.append('1');
      simpleNode2.dump("#Zp6lKz`kmb", stringWriter2);
      assertEquals("<InstanceOfExpression>\n</InstanceOfExpression>\n1", stringWriter1.toString());
      assertEquals("<InstanceOfExpression>\n</InstanceOfExpression>\n1", stringWriter2.toString());
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      stringWriter0.write("lI8?EWJ1Dh45pJo");
      stringWriter0.write("lI8?EWJ1Dh45pJo");
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      SimpleNode simpleNode0 = new SimpleNode(18);
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      ArrayList<String> arrayList1 = simpleNode0.identifiers;
      ArrayList<String> arrayList2 = simpleNode0.identifiers;
      arrayList0.add("<DIGIT>");
      StringWriter stringWriter1 = new StringWriter();
      simpleNode0.dump("z", stringWriter0);
      simpleNode0.dump("lI8?EWJ1Dh45pJo", stringWriter1);
      simpleNode0.dump("lI8?EWJ1Dh45pJo", stringWriter0);
      assertEquals("lI8?EWJ1Dh45pJolI8?EWJ1Dh45pJo<VariableDeclaratorId>\n  <identifier><DIGIT></identifier>\n</VariableDeclaratorId>\n<VariableDeclaratorId>\n  <identifier><DIGIT></identifier>\n</VariableDeclaratorId>\n", stringWriter0.toString());
  }
}