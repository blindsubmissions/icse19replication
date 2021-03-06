/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 12:44:18 GMT 2018
 */

package umd.cs.shop;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StreamTokenizer;
import java.io.StringReader;
import java.nio.CharBuffer;
import java.nio.ReadOnlyBufferException;
import java.util.Comparator;
import java.util.function.UnaryOperator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import umd.cs.shop.JSJshopVars;
import umd.cs.shop.JSPredicateForm;
import umd.cs.shop.JSSubstitution;
import umd.cs.shop.JSTerm;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSTerm_ESTest extends JSTerm_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.623532768112163
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(px#R bFs>VQq)r'97.");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      stringReader0.read();
      streamTokenizer0.resetSyntax();
      Integer integer0 = new Integer(114);
      char[] charArray0 = new char[4];
      charArray0[0] = 'J';
      jSTerm0.clear();
      charArray0[1] = 'B';
      charArray0[2] = ';';
      charArray0[3] = 'W';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      charBuffer0.flip();
      stringReader0.read(charBuffer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      // Undeclared exception!
      try { 
        jSTerm0.parseList(streamTokenizer0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.359218109205996
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(px#R bFs>VQq)r'97.");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      stringReader0.reset();
      JSTerm jSTerm1 = (JSTerm)jSTerm0.lastElement();
      jSTerm1.removeAllElements();
      JSTerm jSTerm2 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      // Undeclared exception!
      try { 
        jSTerm0.standarizerPredicateForm();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.2983621807966683
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(eRpI:");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.isGround();
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader0);
      streamTokenizer1.commentChar((-4));
      // Undeclared exception!
      try { 
        jSTerm0.parseList(streamTokenizer1);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.085321840425419
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(px#R bFs>VQq)r'97.");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      stringReader0.read();
      jSTerm0.cloneT();
      streamTokenizer0.resetSyntax();
      Integer integer0 = new Integer(114);
      char[] charArray0 = new char[4];
      charArray0[0] = 'J';
      jSTerm0.clear();
      charArray0[1] = 'B';
      charArray0[2] = ';';
      charArray0[3] = 'W';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      stringReader0.read(charBuffer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      // Undeclared exception!
      try { 
        jSTerm0.parseList(streamTokenizer0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.7261928332614538
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(>x#R bFs>VQq)r'97.");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.eolIsSignificant(false);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      stringReader0.read();
      stringReader0.read();
      streamTokenizer0.whitespaceChars(61, 114);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.matches(jSTerm1, jSSubstitution0);
      assertEquals(97.0, streamTokenizer0.nval, 0.01);
      assertFalse(jSTerm0.isEval());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      UnaryOperator<Object> unaryOperator0 = UnaryOperator.identity();
      jSTerm0.replaceAll(unaryOperator0);
      jSTerm0.makeVariable();
      // Undeclared exception!
      try { 
        jSTerm0.standardizerTerm();
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
  /*Coverage entropy=1.774252243654724
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringReader stringReader0 = new StringReader("g(>#R bFs>VQq)r'97.");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.wordChars(35, 35);
      stringReader0.read();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = jSTerm0.call();
      JSTerm jSTerm2 = jSTerm1.standardizerTerm();
      assertTrue(jSTerm2.isFunction());
      assertEquals("[>, [#R], [bFs>VQq]]", jSTerm2.toString());
      assertFalse(jSTerm2.isEval());
      
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = jSTerm0.matches(jSTerm1, jSSubstitution0);
      assertNotSame(jSTerm1, jSTerm0);
      assertNotSame(jSTerm1, jSTerm2);
      assertEquals(10, jSTerm1.capacity());
      assertTrue(jSTerm1.isFunction());
      assertFalse(jSSubstitution1.fail());
      assertTrue(jSSubstitution1.isEmpty());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.1637233479037756
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(=:eI,8=|");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.ordinaryChar((-2077));
      JSTerm jSTerm0 = new JSTerm();
      JSTerm jSTerm1 = new JSTerm();
      jSTerm0.equals(jSTerm1);
      streamTokenizer0.whitespaceChars(45, 1660);
      JSTerm jSTerm2 = null;
      try {
        jSTerm2 = new JSTerm(streamTokenizer0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.48439011623800354
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(pxgz$R b'VQqnr@97b");
      stringReader0.read();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm();
      boolean boolean0 = jSTerm0.equals(jSTerm1);
      assertTrue(jSTerm0.isConstant());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.45056120886630463
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSSubstitution0.iterator();
      jSTerm0.insertElementAt(jSSubstitution0, 0);
      jSTerm0.print();
      assertFalse(jSTerm0.isConstant());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringReader stringReader0 = new StringReader("%");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = null;
      try {
        jSTerm0 = new JSTerm(streamTokenizer0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.5236208972034047
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(px#R bFs>VQq)r'97.");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      stringReader0.read();
      streamTokenizer0.resetSyntax();
      Integer integer0 = new Integer(114);
      JSTerm jSTerm1 = jSTerm0.call();
      stringReader0.markSupported();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.matches(jSTerm1);
      streamTokenizer0.quoteChar((-1348));
      jSTerm0.matches(jSTerm1, jSSubstitution0);
      JSTerm jSTerm2 = null;
      try {
        jSTerm2 = new JSTerm(streamTokenizer0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = null;
      try {
        jSTerm0 = new JSTerm(streamTokenizer0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(:;heRiI=|");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = null;
      try {
        jSTerm0 = new JSTerm(streamTokenizer0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringReader stringReader0 = new StringReader("( ");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = null;
      try {
        jSTerm0 = new JSTerm(streamTokenizer0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.3112985309201002
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(px#R bFs>VQq)r'97.");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.makeEval(true);
      JSTerm jSTerm1 = (JSTerm)jSTerm0.lastElement();
      jSTerm1.removeAllElements();
      jSTerm0.insertElementAt(jSTerm1, 1);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.call();
      JSTerm jSTerm2 = new JSTerm();
      // Undeclared exception!
      try { 
        jSTerm2.applySubstitutionT(jSSubstitution0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StringReader stringReader0 = new StringReader("umd.cs.shop.JSJshopVars");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      StringBuffer stringBuffer0 = jSTerm0.toStr();
      assertEquals("%%% ", stringBuffer0.toString());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.48439011623800354
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(px$R bF?>VQqnr'97.");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.nextToken();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = jSTerm0.matches(jSTerm1, jSSubstitution0);
      assertTrue(jSSubstitution1.fail());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.9320738874454946
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(eRpt:");
      stringReader0.read();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = jSTerm0.matches(jSTerm1, jSSubstitution0);
      assertTrue(jSSubstitution1.fail());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.3592181092059956
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(px#R bFs>VQq)r'97.");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      stringReader0.reset();
      JSTerm jSTerm1 = (JSTerm)jSTerm0.lastElement();
      jSTerm1.removeAllElements();
      JSTerm jSTerm2 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      // Undeclared exception!
      try { 
        jSTerm1.applySubstitutionT(jSSubstitution0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.insertElementAt(jSSubstitution0, 0);
      StringBuffer stringBuffer0 = jSTerm0.toStr();
      assertEquals(5, stringBuffer0.length());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.2193917344001644
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(px#R bFs>VQq)r'97.");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.makeEval(true);
      JSTerm jSTerm1 = (JSTerm)jSTerm0.lastElement();
      jSTerm1.removeAllElements();
      jSTerm0.insertElementAt(jSTerm1, 1);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.call();
      JSTerm jSTerm2 = new JSTerm();
      // Undeclared exception!
      try { 
        jSTerm2.call();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSTerm jSTerm1 = new JSTerm();
      jSTerm1.makeVariable();
      // Undeclared exception!
      try { 
        jSTerm1.cloneT();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?W:N0< QnUA*9um");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer1);
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      boolean boolean0 = jSTerm0.equals(jSTerm1);
      assertFalse(jSTerm0.isConstant());
      assertTrue(jSTerm0.isVariable());
      assertFalse(boolean0);
      assertFalse(jSTerm0.isFunction());
      assertEquals("[?W:N0<]", jSTerm0.toString());
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.0973621529518913
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(px#R bFs>VQq)r'97.");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      stringReader0.reset();
      JSTerm jSTerm1 = (JSTerm)jSTerm0.lastElement();
      jSTerm1.removeAllElements();
      JSTerm jSTerm2 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      jSTerm0.isVariable();
      // Undeclared exception!
      try { 
        jSTerm0.matches(jSTerm2, jSSubstitution0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.insertElementAt(jSSubstitution0, 0);
      jSTerm0.insertElementAt(jSTerm0, 0);
      // Undeclared exception!
      try { 
        jSTerm0.toStr();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // umd.cs.shop.JSSubstitution cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.024450821350303
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(px#R bFs>VQq)r'97.");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      stringReader0.read();
      JSTerm jSTerm1 = new JSTerm();
      jSTerm1.equals(jSTerm0);
      jSTerm0.equals(jSTerm0);
      JSTerm jSTerm2 = null;
      try {
        jSTerm2 = new JSTerm(streamTokenizer0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JSJshopVars.rightPar = (-3);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      StringReader stringReader0 = new StringReader("?\"@>0$.:?U9:m4");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      streamTokenizer0.whitespaceChars((-1), (-539));
      // Undeclared exception!
      try { 
        jSTerm0.applySubstitutionT((JSSubstitution) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      StringReader stringReader0 = new StringReader("?~ pSw");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      JSJshopVars.coma = 32;
      jSTerm1.toStr();
      // Undeclared exception!
      try { 
        jSTerm1.parseList(streamTokenizer0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.774252243654724
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StringReader stringReader0 = new StringReader("g(>#R bFs>VQq)r'97.");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.wordChars(35, 35);
      stringReader0.read();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = jSTerm0.call();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.makeVariable();
      JSSubstitution jSSubstitution1 = jSTerm0.matches(jSTerm1, jSSubstitution0);
      jSTerm1.matches(jSTerm0, jSSubstitution1);
      assertTrue(jSTerm0.isVariable());
      assertFalse(jSTerm0.isFunction());
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.4526189749480296
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(px#R bFs>VQq)r'97.");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      stringReader0.read();
      streamTokenizer0.resetSyntax();
      Integer integer0 = new Integer(114);
      JSTerm jSTerm1 = jSTerm0.call();
      stringReader0.markSupported();
      jSTerm1.add((Object) jSTerm0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      streamTokenizer0.quoteChar((-1348));
      jSTerm0.matches(jSTerm1, jSSubstitution0);
      JSTerm jSTerm2 = null;
      try {
        jSTerm2 = new JSTerm(streamTokenizer0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.3925930714464037
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(px#R bFs>VQq)r'97.");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.makeEval(true);
      JSTerm jSTerm1 = (JSTerm)jSTerm0.lastElement();
      jSTerm1.removeAllElements();
      int int0 = 1;
      jSTerm0.insertElementAt(jSTerm1, 1);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm2 = jSTerm0.call();
      JSTerm jSTerm3 = new JSTerm();
      jSTerm3.makeVariable();
      jSTerm3.call();
      // Undeclared exception!
      try { 
        jSTerm2.parseList(streamTokenizer0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?VWmgIPARthEr");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      boolean boolean0 = jSTerm0.isGround();
      assertFalse(jSTerm0.isFunction());
      assertFalse(boolean0);
      assertEquals("[?%%%]", jSTerm0.toString());
  }

  /**
  //Test case number: 33
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JSJshopVars.rightPar = (-3);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      StringReader stringReader0 = new StringReader("?\"@$.:?U9:m4");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.print();
      assertTrue(jSTerm0.isVariable());
      assertEquals("[?%%%]", jSTerm0.toString());
      assertFalse(jSTerm0.isFunction());
      assertFalse(jSTerm0.isConstant());
  }

  /**
  //Test case number: 34
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      StringReader stringReader0 = new StringReader("%p$!J$n");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      assertEquals("[%p]", jSTerm0.toString());
  }

  /**
  //Test case number: 35
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.insertElementAt("Expecting Term", 0);
      jSTerm0.insertElementAt("Expecting Term", 0);
      // Undeclared exception!
      try { 
        jSTerm0.print();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  /**
  //Test case number: 36
  /*Coverage entropy=1.3030924037617193
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSTerm jSTerm1 = new JSTerm();
      jSTerm1.makeEval(true);
      jSTerm0.insertElementAt(jSTerm1, 0);
      jSTerm0.insertElementAt(jSTerm1, 0);
      assertTrue(jSTerm1.isEval());
      
      boolean boolean0 = jSTerm0.isGround();
      assertTrue(boolean0);
  }

  /**
  //Test case number: 37
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(px#R bFs>VQq)r'97.");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.makeEval(true);
      jSTerm0.print();
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "(px#R bFs>VQq)r'97.");
      // Undeclared exception!
      try { 
        stringReader0.read(charBuffer0);
        fail("Expecting exception: ReadOnlyBufferException");
      
      } catch(ReadOnlyBufferException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.StringCharBuffer", e);
      }
  }

  /**
  //Test case number: 38
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?W:N0< QnUA*9um");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer1);
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      jSTerm0.sort(comparator0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = jSTerm0.matches(jSTerm1, jSSubstitution0);
      JSSubstitution jSSubstitution2 = jSTerm1.matches(jSTerm0, jSSubstitution1);
      assertTrue(jSSubstitution2.equals((Object)jSSubstitution0));
      assertFalse(jSTerm0.isFunction());
      assertEquals("[?W:N0<]", jSTerm0.toString());
      assertFalse(jSSubstitution2.fail());
      assertNotSame(jSSubstitution2, jSSubstitution0);
  }

  /**
  //Test case number: 39
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      String string0 = "Expecting Term";
      jSTerm0.insertElementAt("Expecting Term", 0);
      jSTerm0.trimToSize();
      JSTerm jSTerm1 = jSTerm0.cloneT();
      jSTerm1.setElementAt("<r$D", 0);
      jSTerm0.equals(jSTerm1);
      JSJshopVars.astherisk = 0;
      StringReader stringReader0 = null;
      try {
        stringReader0 = new StringReader((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  /**
  //Test case number: 40
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(+!`");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = null;
      try {
        jSTerm0 = new JSTerm(streamTokenizer0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  /**
  //Test case number: 41
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.insertElementAt("Expecting Term", 0);
      JSTerm jSTerm1 = jSTerm0.cloneT();
      jSTerm1.set(0, "1qCI4%");
      StringReader stringReader0 = new StringReader("Expecting Term");
      JSJshopVars.apostrophe = 21;
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.matches(jSTerm1, jSSubstitution0);
      StringReader stringReader1 = new StringReader("member");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader1);
      streamTokenizer0.pushBack();
      JSTerm jSTerm2 = new JSTerm(streamTokenizer0);
      // Undeclared exception!
      try { 
        jSTerm2.parseList(streamTokenizer0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  /**
  //Test case number: 42
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(>;@-JbFs>aVQq)'97?.");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.whitespaceChars(56, 2078);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      assertEquals(1, jSTerm0.size());
  }

  /**
  //Test case number: 43
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSJshopVars.VarCounter = (-1885);
      JSTerm jSTerm1 = new JSTerm();
      jSTerm1.makeVariable();
      jSTerm0.insertElementAt(jSTerm1, 0);
      jSTerm0.insertElementAt(jSTerm1, 0);
      assertTrue(jSTerm1.isVariable());
      
      boolean boolean0 = jSTerm0.isGround();
      assertFalse(boolean0);
  }

  /**
  //Test case number: 44
  /*Coverage entropy=1.3103240067061637
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(px#R bFs>VQq)r'97.");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.makeEval(true);
      JSTerm jSTerm1 = (JSTerm)jSTerm0.lastElement();
      jSTerm0.insertElementAt(jSTerm1, 1);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.call();
      JSTerm jSTerm2 = new JSTerm();
      Integer integer0 = new Integer(41);
      // Undeclared exception!
      try { 
        jSTerm0.remove(6310);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: 6310
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 45
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      StringReader stringReader0 = new StringReader("KQE p#G,VY.-I)");
      stringReader0.ready();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = jSTerm0.parseList(streamTokenizer0);
      stringReader0.reset();
      streamTokenizer0.sval = null;
      jSTerm1.print();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      JSTerm jSTerm2 = jSTerm0.parseList(streamTokenizer0);
      JSTerm jSTerm3 = jSTerm2.applySubstitutionT(jSSubstitution1);
      jSTerm2.print();
      jSTerm3.equals(jSTerm1);
      System.setCurrentTimeMillis(0L);
  }

  /**
  //Test case number: 46
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      StringReader stringReader0 = new StringReader("g(>#R bFs>VQq)r'97.");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.commentChar(35);
      streamTokenizer0.wordChars(35, (-2056));
      stringReader0.read();
      JSTerm jSTerm0 = null;
      try {
        jSTerm0 = new JSTerm(streamTokenizer0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  /**
  //Test case number: 47
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      int int0 = 0;
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.makeEval(true);
      jSTerm0.makeVariable();
      JSTerm jSTerm1 = jSTerm0.call();
      jSTerm1.removeAllElements();
      // Undeclared exception!
      try { 
        jSTerm1.equals((JSPredicateForm) jSTerm0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }
}
