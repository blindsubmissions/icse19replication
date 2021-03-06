/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 17:11:18 GMT 2018
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
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.EmptyStackException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SimpleNode_ESTest extends SimpleNode_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = (-2252);
      SimpleNode simpleNode0 = new SimpleNode((-2252));
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
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(10);
      Node node0 = simpleNode0.parent;
      simpleNode0.parent = null;
      simpleNode0.children = null;
      simpleNode0.parent = null;
      simpleNode0.jjtGetNumChildren();
      simpleNode0.toString();
      simpleNode0.toString();
      String string0 = "{";
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = stringWriter0.append((CharSequence) "EnumConstant");
      // Undeclared exception!
      try { 
        stringWriter1.append((CharSequence) "{", 0, 91);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int int0 = (-2448);
      SimpleNode simpleNode0 = new SimpleNode((-2448));
      simpleNode0.jjtGetParent();
      Node[] nodeArray0 = new Node[6];
      nodeArray0[0] = (Node) simpleNode0;
      nodeArray0[1] = null;
      nodeArray0[2] = (Node) simpleNode0;
      nodeArray0[3] = null;
      nodeArray0[4] = (Node) simpleNode0;
      nodeArray0[5] = (Node) simpleNode0;
      simpleNode0.children = nodeArray0;
      simpleNode0.parent = null;
      ArrayList<String> arrayList0 = new ArrayList<String>();
      arrayList0.stream();
      simpleNode0.identifiers = arrayList0;
      simpleNode0.parent = null;
      simpleNode0.jjtGetParent();
      simpleNode0.jjtGetParent();
      String string0 = "a\"0 ~?0B}(";
      StringWriter stringWriter0 = new StringWriter();
      char[] charArray0 = new char[1];
      char char0 = '6';
      // Undeclared exception!
      try { 
        stringWriter0.write("NameList", (-2448), (-2448));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int int0 = 0;
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.jjtAddChild((Node) null, 40);
      simpleNode0.setIdentifier("%f2eL");
      simpleNode0.jjtGetNumChildren();
      JJTJavaParserState jJTJavaParserState0 = new JJTJavaParserState();
      // Undeclared exception!
      try { 
        jJTJavaParserState0.closeNodeScope(simpleNode0, 40);
        fail("Expecting exception: EmptyStackException");
      
      } catch(EmptyStackException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Stack", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      String string0 = simpleNode0.toString("ConditionalOrExpression");
      assertEquals("ConditionalOrExpressionCompilationUnit", string0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      StringReader stringReader0 = new StringReader("ExplicitConstructorInvocation");
      stringReader0.markSupported();
      JavaParser javaParser0 = new JavaParser(stringReader0);
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 0);
      javaParser0.RelationalExpression();
      char[] charArray0 = new char[7];
      char char0 = 't';
      charArray0[1] = 't';
      charArray0[4] = 't';
      charArray0[5] = 't';
      int int0 = (-1063);
      SimpleNode simpleNode1 = new SimpleNode((-1063));
      simpleNode0.jjtAddChild(simpleNode1, 0);
      simpleNode0.jjtAddChild(simpleNode1, 0);
      // Undeclared exception!
      try { 
        simpleNode1.toString();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1063
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.951108670745811
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.jjtOpen();
      simpleNode0.children = null;
      simpleNode0.setIdentifier("6;2f`J");
      SimpleNode simpleNode1 = new SimpleNode(0);
      simpleNode1.jjtClose();
      simpleNode0.jjtSetParent(simpleNode1);
      StringWriter stringWriter0 = new StringWriter(0);
      stringWriter0.write(":rOc&&,!%qk");
      StringWriter stringWriter1 = stringWriter0.append((CharSequence) "6;2f`J");
      StringWriter stringWriter2 = stringWriter1.append('{');
      simpleNode0.dump("", stringWriter1);
      JJTJavaParserState jJTJavaParserState0 = new JJTJavaParserState();
      StringWriter stringWriter3 = new StringWriter();
      simpleNode1.dump("VariableDeclaratorId", stringWriter2);
      assertEquals(":rOc&&,!%qk6;2f`J{<CompilationUnit>\n  <identifier>6;2f`J</identifier>\n</CompilationUnit>\n", stringWriter2.toString());
      
      String string0 = simpleNode0.toString();
      assertEquals("CompilationUnit : 6;2f`J", string0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.7999587982097305
  */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      StringReader stringReader0 = new StringReader("ExplicitConstructorInvocation");
      stringReader0.markSupported();
      JavaParser javaParser0 = new JavaParser(stringReader0);
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 0);
      javaParser0.RelationalExpression();
      char[] charArray0 = new char[7];
      SimpleNode simpleNode1 = new SimpleNode(javaParser0, 1121);
      simpleNode0.jjtAddChild(simpleNode1, 779);
      charArray0[1] = 't';
      charArray0[4] = 't';
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = stringWriter0.append('Z');
      StringWriter stringWriter2 = stringWriter1.append((CharSequence) "6;2f`J");
      stringWriter2.write("Q,yMd#");
      simpleNode0.dump("6;2f`J", stringWriter0);
      SimpleNode simpleNode2 = new SimpleNode(javaParser0, 0);
      simpleNode0.jjtAddChild(simpleNode2, 0);
      simpleNode2.toString();
      StringWriter stringWriter3 = new StringWriter(3);
      simpleNode0.dump("mFRCTO=;i", stringWriter3);
      simpleNode2.jjtAddChild(simpleNode0, 3);
      // Undeclared exception!
      try { 
        simpleNode0.dump(">>", stringWriter3);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.951848439223888
  */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      StringReader stringReader0 = new StringReader("ExplicitConstructorInvocation");
      stringReader0.markSupported();
      JavaParser javaParser0 = new JavaParser(stringReader0);
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 0);
      javaParser0.RelationalExpression();
      char[] charArray0 = new char[7];
      charArray0[1] = 't';
      charArray0[4] = 't';
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = stringWriter0.append('Z');
      StringWriter stringWriter2 = stringWriter1.append((CharSequence) "6;2f`J");
      stringWriter2.write("Q,yMd#");
      simpleNode0.dump("6;2f`J", stringWriter0);
      SimpleNode simpleNode1 = new SimpleNode(javaParser0, 0);
      simpleNode1.jjtAddChild(simpleNode0, 0);
      simpleNode0.jjtAddChild(simpleNode1, 0);
      simpleNode0.toString();
      simpleNode1.jjtAddChild(simpleNode0, 1);
      assertEquals(1, simpleNode0.jjtGetNumChildren());
      assertEquals(2, simpleNode1.jjtGetNumChildren());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.2852930241200993
  */
  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.jjtOpen();
      SimpleNode simpleNode1 = new SimpleNode(0);
      simpleNode1.setIdentifier("");
      SimpleNode simpleNode2 = new SimpleNode(95);
      simpleNode0.jjtClose();
      StringWriter stringWriter0 = new StringWriter(110);
      stringWriter0.write("%P");
      stringWriter0.append((CharSequence) "%P");
      stringWriter0.append('{');
      simpleNode1.dump("6;2f`J", stringWriter0);
      assertEquals("%P%P{<CompilationUnit>\n</CompilationUnit>\n", stringWriter0.toString());
      
      JJTJavaParserState jJTJavaParserState0 = new JJTJavaParserState();
      StringWriter stringWriter1 = new StringWriter();
      String string0 = simpleNode2.toString();
      assertEquals("Annotation", string0);
  }
}
