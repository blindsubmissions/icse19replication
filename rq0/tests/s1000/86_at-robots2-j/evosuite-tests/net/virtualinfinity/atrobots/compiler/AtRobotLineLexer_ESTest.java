/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 07 14:05:33 GMT 2018
 */

package net.virtualinfinity.atrobots.compiler;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.LineNumberReader;
import java.io.StringReader;
import net.virtualinfinity.atrobots.compiler.AtRobotLineLexer;
import net.virtualinfinity.atrobots.compiler.LineVisitor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AtRobotLineLexer_ESTest extends AtRobotLineLexer_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.4361220688991951
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringReader stringReader0 = new StringReader("9/L9Z");
      LineNumberReader lineNumberReader0 = new LineNumberReader(stringReader0);
      LineVisitor lineVisitor0 = mock(LineVisitor.class, new ViolatedAssumptionAnswer());
      AtRobotLineLexer atRobotLineLexer0 = new AtRobotLineLexer(lineNumberReader0, lineVisitor0);
      atRobotLineLexer0.visitAllLines();
      assertEquals(1, atRobotLineLexer0.getLineNumber());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = AtRobotLineLexer.parseNumber("grhCzI|b>p{=y[");
      assertEquals(Integer.MIN_VALUE, int0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LineVisitor lineVisitor0 = mock(LineVisitor.class, new ViolatedAssumptionAnswer());
      AtRobotLineLexer atRobotLineLexer0 = new AtRobotLineLexer((LineNumberReader) null, lineVisitor0);
      atRobotLineLexer0.visitLine("");
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LineVisitor lineVisitor0 = mock(LineVisitor.class, new ViolatedAssumptionAnswer());
      AtRobotLineLexer atRobotLineLexer0 = new AtRobotLineLexer((LineNumberReader) null, lineVisitor0);
      // Undeclared exception!
      try { 
        atRobotLineLexer0.visitLine("St");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.virtualinfinity.atrobots.compiler.AtRobotLineLexer", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = AtRobotLineLexer.parseNumber("0");
      assertEquals(0, int0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.3378606778364337
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LineVisitor lineVisitor0 = mock(LineVisitor.class, new ViolatedAssumptionAnswer());
      AtRobotLineLexer atRobotLineLexer0 = new AtRobotLineLexer((LineNumberReader) null, lineVisitor0);
      // Undeclared exception!
      try { 
        atRobotLineLexer0.visitLine(".(?-}Xa9vM}rJ#~Se");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.virtualinfinity.atrobots.compiler.AtRobotLineLexer", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int int0 = AtRobotLineLexer.parseNumber("0x0u");
      assertEquals(Integer.MIN_VALUE, int0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int int0 = AtRobotLineLexer.parseNumber("tjh");
      assertEquals(Integer.MIN_VALUE, int0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.6674619334292948
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringReader stringReader0 = new StringReader("|cdY<=");
      LineNumberReader lineNumberReader0 = new LineNumberReader(stringReader0);
      LineVisitor lineVisitor0 = mock(LineVisitor.class, new ViolatedAssumptionAnswer());
      AtRobotLineLexer atRobotLineLexer0 = new AtRobotLineLexer(lineNumberReader0, lineVisitor0);
      atRobotLineLexer0.visitAllLines();
      assertEquals(1, atRobotLineLexer0.getLineNumber());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LineVisitor lineVisitor0 = mock(LineVisitor.class, new ViolatedAssumptionAnswer());
      AtRobotLineLexer atRobotLineLexer0 = new AtRobotLineLexer((LineNumberReader) null, lineVisitor0);
      // Undeclared exception!
      try { 
        atRobotLineLexer0.visitLine("!#");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.virtualinfinity.atrobots.compiler.AtRobotLineLexer", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LineVisitor lineVisitor0 = mock(LineVisitor.class, new ViolatedAssumptionAnswer());
      AtRobotLineLexer atRobotLineLexer0 = new AtRobotLineLexer((LineNumberReader) null, lineVisitor0);
      // Undeclared exception!
      try { 
        atRobotLineLexer0.visitLine("!\"|,_");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.virtualinfinity.atrobots.compiler.AtRobotLineLexer", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int int0 = AtRobotLineLexer.parseNumber("0Xw4p4Uj");
      assertEquals(Integer.MIN_VALUE, int0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LineVisitor lineVisitor0 = mock(LineVisitor.class, new ViolatedAssumptionAnswer());
      AtRobotLineLexer atRobotLineLexer0 = new AtRobotLineLexer((LineNumberReader) null, lineVisitor0);
      // Undeclared exception!
      try { 
        atRobotLineLexer0.visitLine("#Kt8(R7QKb+93/++");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.virtualinfinity.atrobots.compiler.AtRobotLineLexer", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.6674619334292948
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LineVisitor lineVisitor0 = mock(LineVisitor.class, new ViolatedAssumptionAnswer());
      AtRobotLineLexer atRobotLineLexer0 = new AtRobotLineLexer((LineNumberReader) null, lineVisitor0);
      // Undeclared exception!
      try { 
        atRobotLineLexer0.visitLine("#Kt(R7^QKb+93/++");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.virtualinfinity.atrobots.compiler.AtRobotLineLexer", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LineVisitor lineVisitor0 = mock(LineVisitor.class, new ViolatedAssumptionAnswer());
      AtRobotLineLexer atRobotLineLexer0 = new AtRobotLineLexer((LineNumberReader) null, lineVisitor0);
      // Undeclared exception!
      try { 
        atRobotLineLexer0.visitLine(":D");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.virtualinfinity.atrobots.compiler.AtRobotLineLexer", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.5810937501718239
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LineVisitor lineVisitor0 = mock(LineVisitor.class, new ViolatedAssumptionAnswer());
      AtRobotLineLexer atRobotLineLexer0 = new AtRobotLineLexer((LineNumberReader) null, lineVisitor0);
      // Undeclared exception!
      try { 
        atRobotLineLexer0.visitLine("#m?\";'ZmXE<]vL]");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.virtualinfinity.atrobots.compiler.AtRobotLineLexer", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int int0 = AtRobotLineLexer.parseNumber("-");
      assertEquals(0, int0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LineVisitor lineVisitor0 = mock(LineVisitor.class, new ViolatedAssumptionAnswer());
      AtRobotLineLexer atRobotLineLexer0 = new AtRobotLineLexer((LineNumberReader) null, lineVisitor0);
      // Undeclared exception!
      try { 
        atRobotLineLexer0.visitLine(":'|D");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.virtualinfinity.atrobots.compiler.AtRobotLineLexer", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LineVisitor lineVisitor0 = mock(LineVisitor.class, new ViolatedAssumptionAnswer());
      AtRobotLineLexer atRobotLineLexer0 = new AtRobotLineLexer((LineNumberReader) null, lineVisitor0);
      // Undeclared exception!
      try { 
        atRobotLineLexer0.visitLine("#>~W");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.virtualinfinity.atrobots.compiler.AtRobotLineLexer", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.7478680974667573
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LineVisitor lineVisitor0 = mock(LineVisitor.class, new ViolatedAssumptionAnswer());
      AtRobotLineLexer atRobotLineLexer0 = new AtRobotLineLexer((LineNumberReader) null, lineVisitor0);
      // Undeclared exception!
      try { 
        atRobotLineLexer0.visitLine("#rIFJ");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.virtualinfinity.atrobots.compiler.AtRobotLineLexer", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.159588814308626
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LineVisitor lineVisitor0 = mock(LineVisitor.class, new ViolatedAssumptionAnswer());
      AtRobotLineLexer atRobotLineLexer0 = new AtRobotLineLexer((LineNumberReader) null, lineVisitor0);
      // Undeclared exception!
      try { 
        atRobotLineLexer0.visitLine("*.dh");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.virtualinfinity.atrobots.compiler.AtRobotLineLexer", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.0437938808441543
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LineVisitor lineVisitor0 = mock(LineVisitor.class, new ViolatedAssumptionAnswer());
      AtRobotLineLexer atRobotLineLexer0 = new AtRobotLineLexer((LineNumberReader) null, lineVisitor0);
      // Undeclared exception!
      try { 
        atRobotLineLexer0.visitLine("*fC!LM0GHPEj)h");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LineVisitor lineVisitor0 = mock(LineVisitor.class, new ViolatedAssumptionAnswer());
      AtRobotLineLexer atRobotLineLexer0 = new AtRobotLineLexer((LineNumberReader) null, lineVisitor0);
      // Undeclared exception!
      try { 
        atRobotLineLexer0.visitLine(":0");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.virtualinfinity.atrobots.compiler.AtRobotLineLexer", e);
      }
  }
}