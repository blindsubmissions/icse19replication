/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 18:20:27 GMT 2018
 */

package com.soops.CEN4010.JMCA.JParser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.soops.CEN4010.JMCA.JParser.JavaCharStream;
import com.soops.CEN4010.JMCA.JParser.JavaParser;
import com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager;
import com.soops.CEN4010.JMCA.JParser.Node;
import com.soops.CEN4010.JMCA.JParser.SimpleNode;
import java.io.FileDescriptor;
import java.io.Reader;
import java.io.SequenceInputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Enumeration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.evosuite.runtime.util.SystemInUtil;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SimpleNode_ESTest extends SimpleNode_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.3245083869310707
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(18);
      simpleNode0.setIdentifier("O");
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = stringWriter0.append((CharSequence) "O");
      stringWriter0.write(1);
      simpleNode0.dump(">", stringWriter1);
      simpleNode0.dump("O", stringWriter1);
      StringWriter stringWriter2 = new StringWriter(32);
      simpleNode0.dump("]un", stringWriter0);
      SimpleNode simpleNode1 = new SimpleNode((-827));
      simpleNode1.dump("O", stringWriter1);
      simpleNode0.dump("\"D+rpv", stringWriter2);
      simpleNode0.dump("M<", stringWriter0);
      simpleNode1.dump("O", stringWriter1);
      assertEquals("O\u0001<VariableDeclaratorId>\n  <identifier>O</identifier>\n</VariableDeclaratorId>\n<VariableDeclaratorId>\n  <identifier>O</identifier>\n</VariableDeclaratorId>\n<VariableDeclaratorId>\n  <identifier>O</identifier>\n</VariableDeclaratorId>\n<VariableDeclaratorId>\n  <identifier>O</identifier>\n</VariableDeclaratorId>\n", stringWriter1.toString());
      assertEquals("O\u0001<VariableDeclaratorId>\n  <identifier>O</identifier>\n</VariableDeclaratorId>\n<VariableDeclaratorId>\n  <identifier>O</identifier>\n</VariableDeclaratorId>\n<VariableDeclaratorId>\n  <identifier>O</identifier>\n</VariableDeclaratorId>\n<VariableDeclaratorId>\n  <identifier>O</identifier>\n</VariableDeclaratorId>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.7031315809655685
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(9);
      simpleNode0.setIdentifier("-$\"HQGOd");
      simpleNode0.toString("-$\"HQGOd");
      StringWriter stringWriter0 = new StringWriter(1037);
      StringWriter stringWriter1 = new StringWriter(9);
      StringWriter stringWriter2 = new StringWriter();
      simpleNode0.dump("-$\"HQGOd", stringWriter2);
      assertEquals("<EnumBody>\n  <identifier>-$\"HQGOd</identifier>\n</EnumBody>\n", stringWriter2.toString());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((-1064));
      simpleNode0.jjtGetNumChildren();
      int int0 = simpleNode0.jjtGetNumChildren();
      assertEquals(0, int0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.48439011623800354
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(9);
      simpleNode0.setIdentifier(">=");
      StringWriter stringWriter0 = new StringWriter(9);
      StringWriter stringWriter1 = stringWriter0.append((CharSequence) ">=");
      int int0 = 6440;
      StringWriter stringWriter2 = new StringWriter(9);
      simpleNode0.dump("R*[YYd~RncoB", stringWriter0);
      simpleNode0.dump(">=", stringWriter1);
      simpleNode0.dump((String) null, stringWriter0);
      simpleNode0.dump((String) null, stringWriter0);
      SimpleNode simpleNode1 = new SimpleNode(98);
      simpleNode1.toString();
      StringWriter stringWriter3 = new StringWriter();
      JavaParser javaParser0 = new JavaParser("&&");
      char[] charArray0 = new char[5];
      charArray0[0] = '';
      charArray0[1] = 'j';
      charArray0[2] = 'Z';
      charArray0[3] = '}';
      charArray0[4] = 'T';
      // Undeclared exception!
      try { 
        stringWriter3.write(charArray0, (-3181), 4143);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringWriter", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.5481178804418445
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = 9;
      SimpleNode simpleNode0 = new SimpleNode(9);
      String string0 = "=<";
      simpleNode0.setIdentifier("=<");
      StringWriter stringWriter0 = new StringWriter();
      String string1 = "Zo]!h~Fxs688'wgKy$";
      simpleNode0.dump("Zo]!h~Fxs688'wgKy$", stringWriter0);
      char char0 = 'p';
      char[] charArray0 = new char[1];
      charArray0[0] = 'p';
      simpleNode0.toString();
      // Undeclared exception!
      try { 
        stringWriter0.write(charArray0, (-2834), 9);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringWriter", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.6614769771805253
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(18);
      simpleNode0.setIdentifier("=<");
      simpleNode0.setIdentifier("}@(2_u%!b:AA7");
      String string0 = ">";
      Enumeration<MockFileInputStream> enumeration0 = (Enumeration<MockFileInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      JavaParser javaParser0 = new JavaParser(sequenceInputStream0);
      int int0 = 10;
      SimpleNode simpleNode1 = new SimpleNode(javaParser0, 10);
      simpleNode1.setIdentifier("\"double\"");
      sequenceInputStream0.available();
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
  //Test case number: 6
  /*Coverage entropy=0.6081583698769648
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("VariableDeclaratorId");
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 9);
      simpleNode0.setIdentifier("&&");
      simpleNode0.jjtGetParent();
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = stringWriter0.append((CharSequence) "&&");
      StringWriter stringWriter2 = stringWriter1.append((CharSequence) "&&");
      stringWriter1.write((-1841082780));
      SimpleNode simpleNode1 = new SimpleNode(javaParser0, 1);
      simpleNode1.dump("VariableDeclaratorId", stringWriter1);
      simpleNode0.dump((String) null, stringWriter2);
      simpleNode0.setIdentifier("\f");
      StringWriter stringWriter3 = new StringWriter(5428);
      simpleNode0.dump("&&", stringWriter1);
      simpleNode0.dump("VariableDeclaratorId", stringWriter2);
      simpleNode1.dump("\f", stringWriter1);
      StringWriter stringWriter4 = new StringWriter();
      simpleNode0.dump("^=", stringWriter4);
      StringWriter stringWriter5 = stringWriter0.append('@');
      simpleNode1.dump("com.soops.CEN4010.JMCA.JParser.ParseException", stringWriter5);
      assertEquals("&&&&\u4E64<EnumBody>\n  <identifier>*amp</identifier>\n</EnumBody>\n<EnumBody>\n  <identifier>*amp</identifier>\n  <identifier>\f</identifier>\n</EnumBody>\n<EnumBody>\n  <identifier>*amp</identifier>\n  <identifier>\f</identifier>\n</EnumBody>\n@", stringWriter0.toString());
      assertEquals("&&&&\u4E64<EnumBody>\n  <identifier>*amp</identifier>\n</EnumBody>\n<EnumBody>\n  <identifier>*amp</identifier>\n  <identifier>\f</identifier>\n</EnumBody>\n<EnumBody>\n  <identifier>*amp</identifier>\n  <identifier>\f</identifier>\n</EnumBody>\n@", stringWriter5.toString());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((-1064));
      simpleNode0.jjtClose();
      StringReader stringReader0 = new StringReader("F+yrqCfB7pw\"2_s");
      // Undeclared exception!
      try { 
        simpleNode0.toString();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1064
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(1953);
      String string0 = "$5v@#)pAf+K/E|Pqn";
      StringWriter stringWriter0 = new StringWriter();
      JavaCharStream javaCharStream0 = new JavaCharStream((Reader) null, 1953, 1953);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaCharStream0.ReInit((Reader) null, 1953, 1953);
      StringBuffer stringBuffer0 = javaParserTokenManager0.image;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, (byte[]) null);
      SimpleNode simpleNode1 = new SimpleNode(10);
      simpleNode0.jjtSetParent(simpleNode1);
      // Undeclared exception!
      try { 
        stringWriter0.append((CharSequence) null, 1953, (-2050029255));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.49875846591288275
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(18);
      simpleNode0.setIdentifier("-");
      simpleNode0.setIdentifier("-");
      simpleNode0.setIdentifier("");
      simpleNode0.setIdentifier(">");
      simpleNode0.jjtGetParent();
      StringWriter stringWriter0 = new StringWriter(2726);
      StringWriter stringWriter1 = new StringWriter(2726);
      stringWriter1.close();
      simpleNode0.dump("?9jk[Pj]\"q", stringWriter1);
      simpleNode0.dump("", stringWriter0);
      simpleNode0.dump("-", stringWriter1);
      assertEquals("<VariableDeclaratorId>\n  <identifier>-</identifier>\n  <identifier>-</identifier>\n  <identifier>*gt</identifier>\n</VariableDeclaratorId>\n<VariableDeclaratorId>\n  <identifier>-</identifier>\n  <identifier>-</identifier>\n  <identifier>*gt</identifier>\n</VariableDeclaratorId>\n", stringWriter1.toString());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.537368801781397
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.jjtGetParent();
      simpleNode0.jjtAddChild((Node) null, 0);
      simpleNode0.jjtGetParent();
      StringWriter stringWriter0 = new StringWriter(1343);
      simpleNode0.dump("<=", stringWriter0);
      simpleNode0.setIdentifier("<=");
      simpleNode0.setIdentifier("3");
      simpleNode0.jjtGetParent();
      StringWriter stringWriter1 = new StringWriter(1343);
      StringWriter stringWriter2 = new StringWriter();
      simpleNode0.dump(",E+wNq8:Nq)py", stringWriter0);
      simpleNode0.dump("<<", stringWriter2);
      assertEquals(1, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.5481178804418445
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int int0 = 9;
      SimpleNode simpleNode0 = new SimpleNode(9);
      simpleNode0.setIdentifier("=<");
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      StringWriter stringWriter0 = new StringWriter();
      stringWriter0.write("=<");
      String string0 = "Zo]!h~Fxs688'wgKy$";
      simpleNode0.dump("Zo]!h~Fxs688'wgKy$", stringWriter0);
      char char0 = 'p';
      SystemInUtil.addInputLine("=<");
      // Undeclared exception!
      try { 
        simpleNode0.jjtGetChild((-988));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.7937300551584248
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      JavaParser javaParser0 = new JavaParser(mockFileInputStream0);
      Node node0 = javaParser0.currNode;
      simpleNode0.jjtAddChild((Node) null, 0);
      simpleNode0.jjtGetParent();
      simpleNode0.jjtAddChild((Node) null, 0);
      simpleNode0.jjtGetParent();
      StringWriter stringWriter0 = new StringWriter(0);
      simpleNode0.dump("", stringWriter0);
      simpleNode0.dump("\"throws\"", stringWriter0);
      assertEquals(1, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.33422114621338295
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(9);
      simpleNode0.setIdentifier("=<");
      Node[] nodeArray0 = new Node[8];
      nodeArray0[0] = (Node) simpleNode0;
      nodeArray0[1] = (Node) simpleNode0;
      nodeArray0[2] = (Node) simpleNode0;
      JavaParser javaParser0 = new JavaParser((Reader) null);
      Node node0 = javaParser0.currNode;
      nodeArray0[3] = null;
      nodeArray0[4] = (Node) simpleNode0;
      nodeArray0[5] = (Node) simpleNode0;
      nodeArray0[6] = (Node) simpleNode0;
      nodeArray0[7] = (Node) simpleNode0;
      simpleNode0.children = nodeArray0;
      StringWriter stringWriter0 = new StringWriter(1797);
      // Undeclared exception!
      try { 
        simpleNode0.dump("Zo]!h~Fxs688'wgKy$", stringWriter0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.36764947740014225
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(18);
      simpleNode0.setIdentifier("=<");
      StringWriter stringWriter0 = new StringWriter(0);
      simpleNode0.dump("Java Parser Version 1.1:  Usage is one of:", stringWriter0);
      stringWriter0.write("=<");
      simpleNode0.dump("Java Parser Version 1.1:  Usage is one of:", stringWriter0);
      simpleNode0.dump("Java Parser Version 1.1:  Usage is one of:", stringWriter0);
      Node[] nodeArray0 = new Node[0];
      simpleNode0.children = nodeArray0;
      StringWriter stringWriter1 = stringWriter0.append((CharSequence) "Java Parser Version 1.1:  Usage is one of:");
      simpleNode0.dump("<", stringWriter1);
      assertEquals("<VariableDeclaratorId>\n  <identifier>=<</identifier>\n</VariableDeclaratorId>\n=<<VariableDeclaratorId>\n  <identifier>=<</identifier>\n</VariableDeclaratorId>\n<VariableDeclaratorId>\n  <identifier>=<</identifier>\n</VariableDeclaratorId>\nJava Parser Version 1.1:  Usage is one of:<VariableDeclaratorId>\n  <identifier>=<</identifier>\n</VariableDeclaratorId>\n", stringWriter1.toString());
      assertEquals("<VariableDeclaratorId>\n  <identifier>=<</identifier>\n</VariableDeclaratorId>\n=<<VariableDeclaratorId>\n  <identifier>=<</identifier>\n</VariableDeclaratorId>\n<VariableDeclaratorId>\n  <identifier>=<</identifier>\n</VariableDeclaratorId>\nJava Parser Version 1.1:  Usage is one of:<VariableDeclaratorId>\n  <identifier>=<</identifier>\n</VariableDeclaratorId>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(1);
      simpleNode0.jjtGetParent();
      simpleNode0.jjtAddChild((Node) null, 0);
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("Wj9CjDFQ", stringWriter0);
      simpleNode0.jjtGetNumChildren();
      simpleNode0.dump("Wj9CjDFQ", stringWriter0);
      assertEquals(1, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.33422114621338295
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(9);
      simpleNode0.setIdentifier("=<");
      StringWriter stringWriter0 = new StringWriter(1797);
      simpleNode0.dump("Zo]!h~Fxs688'wgKy$", stringWriter0);
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, true);
      simpleNode0.dump(". State unchanged.", stringWriter0);
      ArrayList<String> arrayList0 = new ArrayList<String>();
      simpleNode0.identifiers = arrayList0;
      simpleNode0.dump("T:&0*u5LZ", stringWriter0);
      simpleNode0.dump("T:&0*u5LZ", stringWriter0);
      assertEquals("<EnumBody>\n  <identifier>=<</identifier>\n</EnumBody>\n<EnumBody>\n  <identifier>=<</identifier>\n</EnumBody>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.toString();
      simpleNode0.jjtGetParent();
      Integer integer0 = new Integer((-1770));
      simpleNode0.toString();
      SimpleNode simpleNode1 = new SimpleNode(1022);
      simpleNode0.jjtAddChild(simpleNode1, 1);
      int int0 = 20;
      simpleNode0.jjtAddChild((Node) null, 3241);
      SimpleNode simpleNode2 = new SimpleNode((-894));
      // Undeclared exception!
      try { 
        simpleNode2.toString();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -894
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.setIdentifier("<");
      StringWriter stringWriter0 = new StringWriter(1037);
      simpleNode0.dump(">>>", stringWriter0);
      assertEquals("<CompilationUnit>\n  <identifier>*lt</identifier>\n</CompilationUnit>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.setIdentifier(";");
      String string0 = "g%k5#kl!";
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump((String) null, stringWriter0);
      int int0 = 490;
      char[] charArray0 = new char[1];
      // Undeclared exception!
      try { 
        stringWriter0.write(charArray0, 66, (-1312));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringWriter", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.5481178804418445
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.setIdentifier("&&");
      simpleNode0.jjtGetParent();
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = new StringWriter();
      simpleNode0.dump(" : ", stringWriter0);
      simpleNode0.setIdentifier("&&");
      Node node0 = simpleNode0.parent;
      StringWriter stringWriter2 = new StringWriter();
      StringWriter stringWriter3 = new StringWriter(0);
      stringWriter3.write((String) null);
      simpleNode0.dump("q$/Ad8CUYWd8*", stringWriter3);
      simpleNode0.dump(">>>", stringWriter2);
      assertEquals("<CompilationUnit>\n  <identifier>*amp</identifier>\n  <identifier>*amp</identifier>\n</CompilationUnit>\n", stringWriter2.toString());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.36764947740014225
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(18);
      simpleNode0.setIdentifier(">");
      simpleNode0.setIdentifier("-");
      StringWriter stringWriter0 = new StringWriter();
      stringWriter0.append((CharSequence) ">");
      StringWriter stringWriter1 = new StringWriter(681);
      simpleNode0.dump((String) null, stringWriter0);
      simpleNode0.dump("0Xs<y1KO#9", stringWriter0);
      assertEquals("><VariableDeclaratorId>\n  <identifier>*gt</identifier>\n  <identifier>-</identifier>\n</VariableDeclaratorId>\n<VariableDeclaratorId>\n  <identifier>*gt</identifier>\n  <identifier>-</identifier>\n</VariableDeclaratorId>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(9);
      simpleNode0.setIdentifier("}");
      String string0 = "e";
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = stringWriter0.append((CharSequence) null);
      simpleNode0.dump(">", stringWriter0);
      simpleNode0.dump("[f0bzCQyzm@\",N.</<", stringWriter0);
      SimpleNode simpleNode1 = new SimpleNode((-709));
      simpleNode0.dump("T+? ZXk.D!}jb", stringWriter1);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      // Undeclared exception!
      try { 
        stringWriter1.append((CharSequence) "[f0bzCQyzm@\",N.</<", (-148), (-1432583002));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(18);
      simpleNode0.setIdentifier("=<");
      String string0 = "g>k5#kl!";
      simpleNode0.setIdentifier("<<");
      StringWriter stringWriter0 = new StringWriter(2808);
      stringWriter0.append((CharSequence) "g>k5#kl!");
      simpleNode0.dump("=<", stringWriter0);
      char char0 = '(';
      stringWriter0.append('(');
      String string1 = "]\"Zg[d|G_!j&vI";
      simpleNode0.setIdentifier("]\"Zg[d|G_!j&vI");
      StringWriter stringWriter1 = new StringWriter(18);
      stringWriter1.write(2808);
      JavaParser javaParser0 = null;
      char[] charArray0 = new char[2];
      charArray0[0] = '(';
      charArray0[1] = '(';
      // Undeclared exception!
      try { 
        stringWriter1.write(charArray0, (-105861870), (-1524));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringWriter", e);
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(18);
      StringWriter stringWriter0 = new StringWriter(0);
      simpleNode0.dump("Java Parser Version 1.1:  Usage is one of:", stringWriter0);
      stringWriter0.write("=<");
      simpleNode0.dump("Java Parser Version 1.1:  Usage is one of:", stringWriter0);
      simpleNode0.dump("Java Parser Version 1.1:  Usage is one of:", stringWriter0);
      Node[] nodeArray0 = new Node[0];
      simpleNode0.children = nodeArray0;
      StringWriter stringWriter1 = stringWriter0.append((CharSequence) "Java Parser Version 1.1:  Usage is one of:");
      simpleNode0.dump("<", stringWriter1);
      assertEquals("=<Java Parser Version 1.1:  Usage is one of:", stringWriter1.toString());
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(18);
      simpleNode0.setIdentifier(")");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump(">", stringWriter0);
      simpleNode0.dump((String) null, stringWriter0);
      assertEquals("<VariableDeclaratorId>\n</VariableDeclaratorId>\n<VariableDeclaratorId>\n</VariableDeclaratorId>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.setIdentifier("=<");
      StringWriter stringWriter0 = new StringWriter(0);
      simpleNode0.dump("=<", stringWriter0);
      simpleNode0.setIdentifier("Xn]aAA`&Quw.J");
      simpleNode0.setIdentifier("Xn]aAA`&Quw.J");
      simpleNode0.dump("Xn]aAA`&Quw.J", stringWriter0);
      simpleNode0.setIdentifier("&");
      StringWriter stringWriter1 = new StringWriter(0);
      simpleNode0.dump("Xn]aAA`&Quw.J", stringWriter0);
      simpleNode0.dump("Literal", stringWriter0);
      assertEquals("<CompilationUnit>\n  <identifier>=<</identifier>\n</CompilationUnit>\n<CompilationUnit>\n  <identifier>=<</identifier>\n  <identifier>Xn]aAA`&Quw.J</identifier>\n  <identifier>Xn]aAA`&Quw.J</identifier>\n</CompilationUnit>\n<CompilationUnit>\n  <identifier>=<</identifier>\n  <identifier>Xn]aAA`&Quw.J</identifier>\n  <identifier>Xn]aAA`&Quw.J</identifier>\n  <identifier>*amp</identifier>\n</CompilationUnit>\n<CompilationUnit>\n  <identifier>=<</identifier>\n  <identifier>Xn]aAA`&Quw.J</identifier>\n  <identifier>Xn]aAA`&Quw.J</identifier>\n  <identifier>*amp</identifier>\n</CompilationUnit>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(9);
      String string0 = "{";
      simpleNode0.setIdentifier("{");
      int int0 = 28;
      StringWriter stringWriter0 = new StringWriter(28);
      StringWriter stringWriter1 = stringWriter0.append((CharSequence) "R*[YYd~RncoB");
      SimpleNode simpleNode1 = new SimpleNode(27);
      simpleNode1.dump("{", stringWriter1);
      simpleNode0.dump("{", stringWriter1);
      SimpleNode simpleNode2 = new SimpleNode(28);
      String string1 = "}";
      simpleNode2.dump("}", stringWriter1);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      simpleNode0.dump("{", stringWriter0);
      // Undeclared exception!
      try { 
        stringWriter0.append((CharSequence) "R", 9, 110);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.33422114621338295
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(9);
      simpleNode0.setIdentifier(">=");
      StringWriter stringWriter0 = new StringWriter(9);
      StringWriter stringWriter1 = stringWriter0.append((CharSequence) null);
      stringWriter1.append('_');
      StringWriter stringWriter2 = new StringWriter(6440);
      simpleNode0.dump(">=", stringWriter2);
      simpleNode0.dump("R*[YYd~RncoB", stringWriter1);
      SimpleNode simpleNode1 = new SimpleNode((-1297));
      simpleNode1.dump("</identifier>", stringWriter0);
      simpleNode1.dump("</identifier>", (Writer) null);
      assertEquals(0, simpleNode1.jjtGetNumChildren());
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(9);
      simpleNode0.setIdentifier(">>");
      StringWriter stringWriter0 = new StringWriter(1797);
      simpleNode0.dump("Zo]!h~Fxs688'wgKy$", stringWriter0);
      simpleNode0.dump("UghO+?$u-}5`", stringWriter0);
      simpleNode0.dump("Z<p", stringWriter0);
      simpleNode0.dump("HSDBHgj|Vcu", stringWriter0);
      simpleNode0.toString();
      StringWriter stringWriter1 = new StringWriter();
      JavaParser javaParser0 = new JavaParser(">>");
      StringWriter stringWriter2 = new StringWriter(1797);
      simpleNode0.dump("Z<p", stringWriter2);
      simpleNode0.dump("Z<p", stringWriter0);
      StringWriter stringWriter3 = new StringWriter();
      simpleNode0.dump("line.separator", stringWriter0);
      assertEquals("<EnumBody>\n  <identifier>*rshft</identifier>\n</EnumBody>\n<EnumBody>\n  <identifier>*rshft</identifier>\n</EnumBody>\n<EnumBody>\n  <identifier>*rshft</identifier>\n</EnumBody>\n<EnumBody>\n  <identifier>*rshft</identifier>\n</EnumBody>\n<EnumBody>\n  <identifier>*rshft</identifier>\n</EnumBody>\n<EnumBody>\n  <identifier>*rshft</identifier>\n</EnumBody>\n", stringWriter0.toString());
  }
}