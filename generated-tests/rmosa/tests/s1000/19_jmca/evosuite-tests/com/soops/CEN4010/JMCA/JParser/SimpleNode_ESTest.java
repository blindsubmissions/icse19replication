/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 04:38:01 GMT 2018
 */

package com.soops.CEN4010.JMCA.JParser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.soops.CEN4010.JMCA.JParser.JJTJavaParserState;
import com.soops.CEN4010.JMCA.JParser.JavaParser;
import com.soops.CEN4010.JMCA.JParser.Node;
import com.soops.CEN4010.JMCA.JParser.SimpleNode;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Enumeration;
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
  /*Coverage entropy=0.5481178804418445
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(9);
      simpleNode0.toString();
      simpleNode0.setIdentifier("]=");
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = stringWriter0.append((CharSequence) "]=");
      simpleNode0.dump("]=", stringWriter0);
      simpleNode0.dump("#1Y3#kv", stringWriter1);
      assertEquals("]=<EnumBody>\n  <identifier>]=</identifier>\n</EnumBody>\n<EnumBody>\n  <identifier>]=</identifier>\n</EnumBody>\n", stringWriter1.toString());
      assertEquals("]=<EnumBody>\n  <identifier>]=</identifier>\n</EnumBody>\n<EnumBody>\n  <identifier>]=</identifier>\n</EnumBody>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(255);
      int int0 = simpleNode0.jjtGetNumChildren();
      assertEquals(0, int0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = 125;
      SimpleNode simpleNode0 = new SimpleNode(125);
      ArrayList<String> arrayList0 = new ArrayList<String>();
      simpleNode0.identifiers = arrayList0;
      simpleNode0.jjtClose();
      arrayList0.add("h{KgdQV6f");
      JavaParser javaParser0 = new JavaParser("&&");
      JJTJavaParserState jJTJavaParserState0 = javaParser0.jjtree;
      // Undeclared exception!
      try { 
        jJTJavaParserState0.rootNode();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(1);
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
  //Test case number: 4
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("");
      try { 
        javaParser0.SwitchLabel();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Parse error at line 1, column 0.  Encountered: <EOF>
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParser", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.880524555284045
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(19);
      simpleNode0.jjtGetParent();
      simpleNode0.jjtAddChild((Node) null, 19);
      simpleNode0.toString();
      simpleNode0.setIdentifier("<=");
      StringWriter stringWriter0 = new StringWriter();
      stringWriter0.write(19);
      StringWriter stringWriter1 = new StringWriter();
      simpleNode0.dump("lBFzO};k#RNS+C&+9(b", stringWriter0);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      simpleNode0.toString("ps@@H8w`S*Gh9");
      stringWriter0.flush();
      simpleNode0.dump(".BZ>@z7p \"WDp|]f", stringWriter0);
      assertEquals(20, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int int0 = 255;
      SimpleNode simpleNode0 = new SimpleNode(255);
      SimpleNode simpleNode1 = new SimpleNode(10);
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      JavaParser javaParser0 = new JavaParser(sequenceInputStream0);
      Node node0 = javaParser0.currNode;
      simpleNode0.jjtAddChild((Node) null, 255);
      JJTJavaParserState jJTJavaParserState0 = javaParser0.jjtree;
      // Undeclared exception!
      try { 
        simpleNode0.jjtAddChild(simpleNode1, (-867));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -867
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(10);
      Node node0 = simpleNode0.parent;
      simpleNode0.jjtSetParent((Node) null);
      Node[] nodeArray0 = new Node[2];
      nodeArray0[0] = (Node) simpleNode0;
      nodeArray0[1] = (Node) simpleNode0;
      simpleNode0.children = nodeArray0;
      simpleNode0.jjtAddChild((Node) null, 374);
      StringWriter stringWriter0 = new StringWriter(10);
      String string0 = null;
      // Undeclared exception!
      try { 
        simpleNode0.dump((String) null, stringWriter0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(10);
      simpleNode0.setIdentifier("}");
      simpleNode0.setIdentifier("tfKPzegw;`i@cU<Lrhe");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("tfKPzegw;`i@cU<Lrhe", stringWriter0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.355712859746894
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(14);
      simpleNode0.setIdentifier("<");
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = new StringWriter();
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-30);
      byteArray0[1] = (byte) (-30);
      byteArray0[2] = (byte) (-30);
      byteArray0[3] = (byte) (-30);
      byteArray0[4] = (byte) (-30);
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      SimpleNode simpleNode1 = new SimpleNode(9);
      simpleNode1.setIdentifier("&&");
      StringWriter stringWriter2 = new StringWriter();
      StringWriter stringWriter3 = new StringWriter();
      simpleNode0.dump("<", stringWriter0);
      StringWriter stringWriter4 = new StringWriter(563);
      simpleNode1.dump("Z;kAh2shoV$~>!`,:", stringWriter1);
      simpleNode1.dump("&&", stringWriter1);
      simpleNode0.dump("9_eVq", stringWriter4);
      simpleNode1.dump("Z;kAh2shoV$~>!`,:", stringWriter1);
      simpleNode1.dump("&&", stringWriter0);
      assertEquals("<ClassOrInterfaceBody>\n  <identifier>*lt</identifier>\n</ClassOrInterfaceBody>\n<EnumBody>\n  <identifier>*amp</identifier>\n</EnumBody>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(1);
      Node node0 = simpleNode0.parent;
      SimpleNode simpleNode1 = new SimpleNode(1);
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      JavaParser javaParser0 = new JavaParser(sequenceInputStream0);
      Node node1 = javaParser0.currNode;
      simpleNode1.jjtAddChild(simpleNode0, 1);
      simpleNode0.toString("&&");
      int int0 = simpleNode1.jjtGetNumChildren();
      assertEquals(2, int0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.3805062184775959
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)124;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)16;
      byteArray0[3] = (byte) (-125);
      byteArray0[4] = (byte)7;
      byteArray0[5] = (byte) (-30);
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      SimpleNode simpleNode0 = new SimpleNode(9);
      simpleNode0.setIdentifier("<");
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = new StringWriter();
      simpleNode0.dump("Was expecting:", stringWriter1);
      StringWriter stringWriter2 = new StringWriter(9);
      simpleNode0.dump("E),0K%-e", stringWriter2);
      Node[] nodeArray0 = new Node[0];
      simpleNode0.children = nodeArray0;
      simpleNode0.dump("N`mn'CyY$T8MH,z;mV", stringWriter2);
      simpleNode0.dump("<", stringWriter0);
      simpleNode0.dump("Was expecting:", stringWriter0);
      StringWriter stringWriter3 = new StringWriter((byte)124);
      simpleNode0.dump("E),0K%-e", stringWriter3);
      assertEquals("<EnumBody>\n  <identifier>*lt</identifier>\n</EnumBody>\n", stringWriter3.toString());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int int0 = 14;
      SimpleNode simpleNode0 = new SimpleNode(14);
      SimpleNode simpleNode1 = new SimpleNode(14);
      String string0 = "wxDE}I{DilQ";
      StringWriter stringWriter0 = new StringWriter();
      Node[] nodeArray0 = new Node[9];
      nodeArray0[0] = (Node) simpleNode0;
      nodeArray0[1] = (Node) simpleNode1;
      nodeArray0[2] = (Node) simpleNode1;
      nodeArray0[3] = (Node) simpleNode1;
      nodeArray0[4] = (Node) simpleNode0;
      nodeArray0[5] = (Node) simpleNode1;
      nodeArray0[6] = (Node) simpleNode0;
      nodeArray0[7] = (Node) simpleNode0;
      nodeArray0[8] = (Node) simpleNode1;
      simpleNode1.children = nodeArray0;
      StringWriter stringWriter1 = new StringWriter(14);
      simpleNode0.dump("wxDE}I{DilQ", stringWriter1);
      // Undeclared exception!
      try { 
        simpleNode1.dump("wxDE}I{DilQ", stringWriter0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)124;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)16;
      byteArray0[3] = (byte) (-125);
      byteArray0[3] = (byte)7;
      byteArray0[5] = (byte) (-30);
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      SimpleNode simpleNode0 = new SimpleNode(9);
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = new StringWriter();
      simpleNode0.dump("Was expecting:", stringWriter1);
      StringWriter stringWriter2 = new StringWriter(9);
      simpleNode0.dump("E),0K%-e", stringWriter2);
      Node[] nodeArray0 = new Node[0];
      simpleNode0.children = nodeArray0;
      simpleNode0.dump("N`mn'CyY$T8MH,z;mV", stringWriter2);
      simpleNode0.dump("<", stringWriter0);
      simpleNode0.dump("Was expecting:", stringWriter0);
      StringWriter stringWriter3 = new StringWriter((byte)124);
      simpleNode0.dump("E),0K%-e", stringWriter3);
      assertEquals("", stringWriter3.toString());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.7937300551584248
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(10);
      Node node0 = simpleNode0.parent;
      simpleNode0.jjtSetParent((Node) null);
      simpleNode0.jjtAddChild((Node) null, 0);
      StringWriter stringWriter0 = new StringWriter(0);
      StringWriter stringWriter1 = new StringWriter(10);
      simpleNode0.dump("8IF@", stringWriter1);
      simpleNode0.dump("IN_SINGLE_LINE_COMMENT", stringWriter0);
      simpleNode0.dump("IN_SINGLE_LINE_COMMENT", stringWriter0);
      assertEquals(1, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(18);
      simpleNode0.setIdentifier("9lassOrInterfaceBodyDeclaration");
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = new StringWriter();
      StringWriter stringWriter2 = new StringWriter();
      StringWriter stringWriter3 = new StringWriter();
      StringWriter stringWriter4 = new StringWriter(18);
      simpleNode0.dump((String) null, stringWriter1);
      simpleNode0.dump(">>", stringWriter4);
      SimpleNode simpleNode1 = new SimpleNode(37);
      stringWriter4.write(10);
      simpleNode1.setIdentifier(">>");
      StringWriter stringWriter5 = new StringWriter();
      simpleNode1.dump(">", stringWriter3);
      simpleNode1.dump(">", stringWriter2);
      simpleNode1.dump("9lassOrInterfaceBodyDeclaration", stringWriter0);
      simpleNode1.dump("gfp%", stringWriter5);
      simpleNode1.dump(">", stringWriter2);
      simpleNode1.dump("AndExpression", stringWriter3);
      assertEquals("<NameList>\n  <identifier>*rshft</identifier>\n</NameList>\n<NameList>\n  <identifier>*rshft</identifier>\n</NameList>\n", stringWriter3.toString());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(14);
      StringWriter stringWriter0 = new StringWriter(14);
      StringWriter stringWriter1 = new StringWriter();
      StringWriter stringWriter2 = new StringWriter();
      SimpleNode simpleNode1 = new SimpleNode(0);
      simpleNode0.setIdentifier("&");
      String string0 = "7D!+5?Ew8A!";
      simpleNode0.setIdentifier("naHnkZ}W?0#EQk0erd");
      StringWriter stringWriter3 = new StringWriter();
      simpleNode0.dump("naHnkZ}W?0#EQk0erd", stringWriter2);
      // Undeclared exception!
      try { 
        stringWriter0.append((CharSequence) "&", (-1933044865), (-1933044865));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(9);
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = new StringWriter();
      simpleNode0.setIdentifier("");
      simpleNode0.dump("Ij!b(j(F", stringWriter0);
      simpleNode0.dump("Ij!b(j(F", stringWriter0);
      simpleNode0.dump("*le", stringWriter1);
      assertEquals("<EnumBody>\n</EnumBody>\n", stringWriter1.toString());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(14);
      SimpleNode simpleNode1 = new SimpleNode(14);
      simpleNode0.setIdentifier("wxDE}I{DilQ");
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = new StringWriter(14);
      simpleNode0.dump("wxDE}I{DilQ", stringWriter1);
      simpleNode1.dump("wxDE}I{DilQ", stringWriter0);
      simpleNode1.setIdentifier("<<");
      StringWriter stringWriter2 = new StringWriter();
      StringWriter stringWriter3 = new StringWriter();
      simpleNode0.dump("K@g}{\"c9@", stringWriter0);
      StringWriter stringWriter4 = new StringWriter(14);
      simpleNode0.dump("ia3wBW6l1kMsz", stringWriter1);
      simpleNode1.dump("K@g}{\"c9@", stringWriter2);
      simpleNode1.dump("VariableDeclaratorId", stringWriter4);
      simpleNode0.dump("K@g}{\"c9@", stringWriter1);
      assertEquals("<ClassOrInterfaceBody>\n  <identifier>wxDE}I{DilQ</identifier>\n</ClassOrInterfaceBody>\n<ClassOrInterfaceBody>\n  <identifier>wxDE}I{DilQ</identifier>\n</ClassOrInterfaceBody>\n<ClassOrInterfaceBody>\n  <identifier>wxDE}I{DilQ</identifier>\n</ClassOrInterfaceBody>\n", stringWriter1.toString());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(19);
      SimpleNode simpleNode1 = new SimpleNode(19);
      simpleNode0.setIdentifier("s+EQuwP'");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode1.dump("&N<i>nYmu~8", stringWriter0);
      simpleNode0.dump(";r*oAU8*(;E", stringWriter0);
      SimpleNode simpleNode2 = new SimpleNode(19);
      simpleNode2.setIdentifier("{");
      StringWriter stringWriter1 = new StringWriter();
      simpleNode2.dump("Y!#=}>*(pBJ;cT", stringWriter0);
      assertEquals("<VariableInitializer>\n  <identifier>s+EQuwP'</identifier>\n</VariableInitializer>\n<VariableInitializer>\n</VariableInitializer>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(14);
      SimpleNode simpleNode1 = new SimpleNode(14);
      simpleNode1.setIdentifier(">");
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = new StringWriter();
      simpleNode1.dump(">GHFr", stringWriter0);
      simpleNode1.dump("Ij!b(j(F", stringWriter1);
      simpleNode0.dump("Ij!b(j(F", stringWriter0);
      simpleNode0.dump(">GHFr", stringWriter1);
      simpleNode1.dump(">GHFr", stringWriter1);
      simpleNode1.dump(")M|NiTZW2d", stringWriter0);
      assertEquals("<ClassOrInterfaceBody>\n  <identifier>*gt</identifier>\n</ClassOrInterfaceBody>\n<ClassOrInterfaceBody>\n  <identifier>*gt</identifier>\n</ClassOrInterfaceBody>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(14);
      simpleNode0.setIdentifier("5R");
      simpleNode0.setIdentifier("<");
      StringWriter stringWriter0 = new StringWriter();
      stringWriter0.flush();
      StringWriter stringWriter1 = new StringWriter();
      simpleNode0.setIdentifier(">=");
      StringWriter stringWriter2 = new StringWriter();
      simpleNode0.dump("g-", stringWriter0);
      simpleNode0.dump("g-", stringWriter1);
      stringWriter2.append('v');
      simpleNode0.dump("}`PGtH/'99#d?S53", stringWriter2);
      simpleNode0.dump("", stringWriter1);
      StringWriter stringWriter3 = stringWriter0.append((CharSequence) "");
      simpleNode0.dump("g-", stringWriter3);
      assertEquals("<ClassOrInterfaceBody>\n  <identifier>5R</identifier>\n  <identifier>*lt</identifier>\n  <identifier>*ge</identifier>\n</ClassOrInterfaceBody>\n<ClassOrInterfaceBody>\n  <identifier>5R</identifier>\n  <identifier>*lt</identifier>\n  <identifier>*ge</identifier>\n</ClassOrInterfaceBody>\n", stringWriter3.toString());
      assertEquals("<ClassOrInterfaceBody>\n  <identifier>5R</identifier>\n  <identifier>*lt</identifier>\n  <identifier>*ge</identifier>\n</ClassOrInterfaceBody>\n<ClassOrInterfaceBody>\n  <identifier>5R</identifier>\n  <identifier>*lt</identifier>\n  <identifier>*ge</identifier>\n</ClassOrInterfaceBody>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(30);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      simpleNode0.setIdentifier("<");
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = new StringWriter();
      StringWriter stringWriter2 = new StringWriter(840);
      simpleNode0.setIdentifier(";");
      StringWriter stringWriter3 = new StringWriter();
      simpleNode0.dump("$", stringWriter0);
      simpleNode0.dump(";", stringWriter3);
      assertEquals("<ClassOrInterfaceType>\n  <identifier>*lt</identifier>\n</ClassOrInterfaceType>\n", stringWriter3.toString());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(18);
      SimpleNode simpleNode1 = new SimpleNode(18);
      simpleNode0.setIdentifier(")");
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = new StringWriter();
      StringWriter stringWriter2 = new StringWriter();
      SimpleNode simpleNode2 = new SimpleNode(85);
      simpleNode2.dump("$", stringWriter0);
      SimpleNode simpleNode3 = new SimpleNode(307);
      simpleNode0.setIdentifier("$");
      StringWriter stringWriter3 = new StringWriter();
      simpleNode3.dump("$", stringWriter1);
      StringWriter stringWriter4 = new StringWriter(18);
      simpleNode1.dump(";", stringWriter0);
      simpleNode1.dump("l<n4", stringWriter0);
      simpleNode2.dump("gt+y@3wX`N", stringWriter4);
      simpleNode0.dump("+=", stringWriter3);
      SimpleNode simpleNode4 = new SimpleNode(18);
      simpleNode4.dump("').2%&|Rp^P", stringWriter0);
      assertEquals("", stringWriter0.toString());
  }
}
