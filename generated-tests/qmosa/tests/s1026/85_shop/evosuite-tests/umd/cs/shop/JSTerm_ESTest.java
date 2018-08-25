/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 17:01:41 GMT 2018
 */

package umd.cs.shop;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StreamTokenizer;
import java.io.StringReader;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Predicate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import umd.cs.shop.JSEvaluate;
import umd.cs.shop.JSJshopVars;
import umd.cs.shop.JSPredicateForm;
import umd.cs.shop.JSSubstitution;
import umd.cs.shop.JSTerm;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSTerm_ESTest extends JSTerm_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringReader stringReader0 = new StringReader(">");
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
  //Test case number: 1
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Expecting constant symbol as term");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      streamTokenizer0.nextToken();
      stringReader0.ready();
      jSTerm0.toStr();
      jSTerm0.isConstant();
      char[] charArray0 = new char[8];
      charArray0[0] = 'C';
      charArray0[1] = 'S';
      charArray0[2] = '}';
      charArray0[3] = 'D';
      charArray0[4] = 'M';
      charArray0[5] = 'B';
      charArray0[6] = '9';
      charArray0[7] = '%';
      stringReader0.read(charArray0);
      streamTokenizer0.sval = "Expecting constant symbol as term";
      // Undeclared exception!
      try { 
        jSTerm0.equals((JSTerm) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.3693821196946767
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringReader stringReader0 = new StringReader("YGmw;1P/6R[");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.print();
      JSTerm jSTerm1 = jSTerm0.standardizerTerm();
      jSTerm1.iterator();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm1.addElement(jSSubstitution0);
      jSTerm1.cloneT();
      streamTokenizer0.quoteChar(59);
      jSTerm1.isFunction();
      jSTerm1.call();
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
  //Test case number: 3
  /*Coverage entropy=2.334549109212565
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringReader stringReader0 = new StringReader("v- )6Cf(m{Wq");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.nval = 1335.832576023972;
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSJshopVars.rightBrac = 32;
      jSTerm0.print();
      JSTerm jSTerm1 = jSTerm0.standardizerTerm();
      jSTerm1.iterator();
      jSTerm1.addElement(streamTokenizer0);
      jSTerm0.cloneT();
      streamTokenizer0.quoteChar(32);
      jSTerm1.isFunction();
      jSTerm0.call();
      assertEquals(32, streamTokenizer0.ttype);
      
      JSTerm jSTerm2 = jSTerm0.parseList(streamTokenizer0);
      jSTerm0.makeEval(false);
      jSTerm2.call();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = jSTerm2.matches(jSTerm0, jSSubstitution0);
      assertTrue(jSSubstitution1.fail());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.756536739908486
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringReader stringReader0 = new StringReader("yq,s-e=y+Qig");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm();
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.matches(jSTerm1, jSSubstitution0);
      jSTerm0.makeEval(true);
      jSTerm1.toStr();
      jSTerm1.parallelStream();
      StringReader stringReader1 = new StringReader("Q5O%]v)LQ:");
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader0);
      jSTerm1.toStr();
      JSTerm jSTerm2 = null;
      try {
        jSTerm2 = new JSTerm(streamTokenizer1);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSSubstitution0.add((Object) null);
      StringReader stringReader0 = new StringReader("oi");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      streamTokenizer0.wordChars(1, 667);
      jSTerm0.isVariable();
      streamTokenizer0.pushBack();
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      jSTerm1.applySubstitutionT(jSSubstitution0);
      // Undeclared exception!
      try { 
        jSTerm0.call();
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
  /*Coverage entropy=0.796311640173813
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringReader stringReader0 = new StringReader("YGmw;1P/6R[");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      char[] charArray0 = new char[5];
      charArray0[0] = '9';
      charArray0[1] = 'C';
      charArray0[2] = '}';
      charArray0[3] = '}';
      charArray0[4] = 'M';
      stringReader0.read(charArray0);
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer1);
      // Undeclared exception!
      try { 
        jSTerm0.equals((JSTerm) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringReader stringReader0 = new StringReader("YGmw;1P/6R[");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.eolIsSignificant(false);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.makeConstant();
      jSTerm0.makeFunction();
      assertFalse(jSTerm0.isConstant());
      
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.makeConstant();
      JSTerm jSTerm1 = jSTerm0.standardizerTerm();
      jSTerm1.matches(jSTerm0);
      assertFalse(jSTerm0.isVariable());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.294545165844896
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringReader stringReader0 = new StringReader("v- )6Cf(m{Wq");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.isGround();
      JSTerm jSTerm1 = new JSTerm();
      boolean boolean0 = jSTerm0.equals(jSTerm1);
      assertEquals(32, streamTokenizer0.ttype);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.45056120886630463
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      StringReader stringReader0 = new StringReader("5%!`]*G");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
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
  //Test case number: 10
  /*Coverage entropy=2.067188784530552
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringReader stringReader0 = new StringReader("YGmw;1P/6R[");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.eolIsSignificant(false);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.makeConstant();
      jSTerm0.makeFunction();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm1 = jSTerm0.applySubstitutionT(jSSubstitution0);
      jSSubstitution0.removeElement("YGmw;1P/6R[");
      System.setCurrentTimeMillis((-729L));
      jSTerm0.matches(jSTerm1, jSSubstitution0);
      jSTerm0.print();
      assertFalse(jSTerm0.isConstant());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.7274635571421673
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringReader stringReader0 = new StringReader("YGmw;1P/6R[");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.eolIsSignificant(false);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.makeConstant();
      streamTokenizer0.lowerCaseMode(false);
      jSTerm0.makeFunction();
      jSTerm0.call();
      assertTrue(jSTerm0.isFunction());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      StringReader stringReader0 = new StringReader("?");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.eolIsSignificant(false);
      JSTerm jSTerm1 = null;
      try {
        jSTerm1 = new JSTerm(streamTokenizer0);
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
  /*Coverage entropy=2.36060911398924
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      Object[] objectArray0 = new Object[7];
      objectArray0[0] = (Object) jSTerm0;
      objectArray0[1] = (Object) jSTerm0;
      objectArray0[2] = (Object) jSTerm0;
      jSTerm0.add(objectArray0[0]);
      objectArray0[3] = (Object) jSTerm0;
      objectArray0[4] = (Object) jSTerm0;
      objectArray0[5] = (Object) jSTerm0;
      objectArray0[6] = (Object) jSTerm0;
      jSTerm0.toArray(objectArray0);
      int int0 = 59;
      JSJshopVars.dot = 59;
      jSTerm0.isGround();
      JSTerm jSTerm1 = jSTerm0.call();
      jSTerm1.retainAll(jSTerm0);
      jSTerm1.toStr();
      JSTerm jSTerm2 = jSTerm1.standardizerTerm();
      JSTerm jSTerm3 = jSTerm2.call();
      jSTerm1.toStr();
      JSTerm jSTerm4 = jSTerm1.standardizerTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      // Undeclared exception!
      try { 
        jSTerm4.matches(jSTerm3, jSSubstitution0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.8946891171539901
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringReader stringReader0 = new StringReader("v- )6Cf(m{Wq");
      StringReader stringReader1 = new StringReader("uq\"j>`");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader1);
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.makeConstant();
      streamTokenizer0.commentChar(94);
      streamTokenizer0.lowerCaseMode(false);
      jSTerm0.makeFunction();
      assertFalse(jSTerm0.isConstant());
      
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.makeConstant();
      JSTerm jSTerm1 = new JSTerm();
      jSTerm0.matches(jSTerm1);
      assertEquals("[%%%]", jSTerm0.toString());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.9924470451737488
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      Object[] objectArray0 = new Object[7];
      objectArray0[0] = (Object) jSTerm0;
      objectArray0[1] = (Object) jSTerm0;
      objectArray0[2] = (Object) jSTerm0;
      jSTerm0.add(objectArray0[0]);
      objectArray0[3] = (Object) jSTerm0;
      objectArray0[4] = (Object) jSTerm0;
      objectArray0[5] = (Object) jSTerm0;
      objectArray0[6] = (Object) jSTerm0;
      jSTerm0.toArray(objectArray0);
      JSJshopVars.dot = 59;
      boolean boolean0 = jSTerm0.isGround();
      assertTrue(boolean0);
      
      JSTerm jSTerm1 = jSTerm0.call();
      jSTerm1.retainAll(jSTerm0);
      assertFalse(jSTerm1.isVariable());
      
      JSTerm jSTerm2 = new JSTerm();
      JSSubstitution jSSubstitution0 = jSTerm2.matches(jSTerm1);
      assertTrue(jSTerm1.isFunction());
      assertTrue(jSSubstitution0.fail());
      assertFalse(jSTerm1.isConstant());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      Object[] objectArray0 = new Object[7];
      objectArray0[0] = (Object) jSTerm0;
      objectArray0[1] = (Object) jSTerm0;
      objectArray0[2] = (Object) jSTerm0;
      StringReader stringReader0 = new StringReader("(");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm1 = null;
      try {
        jSTerm1 = new JSTerm(streamTokenizer0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.2381869370864838
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StringReader stringReader0 = new StringReader("YGmw;1P/6R[");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.eolIsSignificant(false);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.makeConstant();
      jSTerm0.makeFunction();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm1 = jSTerm0.applySubstitutionT(jSSubstitution0);
      JSTerm jSTerm2 = jSTerm0.cloneT();
      jSTerm0.toStr();
      boolean boolean0 = jSTerm1.equals(jSTerm2);
      assertTrue(jSTerm0.isFunction());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.45056120886630463
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      Object[] objectArray0 = new Object[7];
      objectArray0[0] = (Object) jSTerm0;
      objectArray0[1] = (Object) jSTerm0;
      objectArray0[2] = (Object) jSTerm0;
      jSTerm0.add(objectArray0[0]);
      objectArray0[3] = (Object) jSTerm0;
      objectArray0[4] = (Object) jSTerm0;
      objectArray0[5] = (Object) jSTerm0;
      objectArray0[6] = (Object) jSTerm0;
      JSJshopVars.dot = 59;
      jSTerm0.add((Object) null);
      // Undeclared exception!
      try { 
        jSTerm0.print();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.666332585328325
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      StringReader stringReader0 = new StringReader("%yi0\"Bhe5_k~pc;<{7V");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.eolIsSignificant(false);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      jSTerm0.makeConstant();
      jSTerm1.makeFunction();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      // Undeclared exception!
      try { 
        jSTerm0.applySubstitutionT((JSSubstitution) null);
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
  /*Coverage entropy=2.5400363038209806
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      Object[] objectArray0 = new Object[7];
      objectArray0[0] = (Object) jSTerm0;
      objectArray0[2] = (Object) jSTerm0;
      jSTerm0.add(objectArray0[0]);
      objectArray0[3] = (Object) jSTerm0;
      objectArray0[4] = (Object) jSTerm0;
      objectArray0[5] = (Object) jSTerm0;
      objectArray0[6] = (Object) jSTerm0;
      JSJshopVars.dot = 59;
      jSTerm0.isGround();
      JSTerm jSTerm1 = jSTerm0.call();
      jSTerm1.retainAll(jSTerm0);
      jSTerm1.toStr();
      JSTerm jSTerm2 = jSTerm1.standardizerTerm();
      Consumer<JSSubstitution> consumer0 = (Consumer<JSSubstitution>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      jSTerm2.forEach(consumer0);
      JSTerm jSTerm3 = jSTerm2.call();
      jSTerm3.makeVariable();
      JSTerm jSTerm4 = jSTerm1.standardizerTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm3.cloneT();
      jSTerm4.print();
      jSTerm3.toStr();
      jSTerm4.addAll((Collection) jSTerm2);
      StringReader stringReader0 = new StringReader("!");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      // Undeclared exception!
      try { 
        jSTerm2.elementAt(59);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 59 >= 1
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=2.0431918705451206
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      Object[] objectArray0 = new Object[7];
      objectArray0[0] = (Object) jSTerm0;
      objectArray0[1] = (Object) jSTerm0;
      objectArray0[2] = (Object) jSTerm0;
      jSTerm0.makeEval(true);
      jSTerm0.add(objectArray0[0]);
      objectArray0[4] = (Object) jSTerm0;
      objectArray0[5] = (Object) jSTerm0;
      objectArray0[6] = (Object) jSTerm0;
      JSJshopVars.dot = 59;
      jSTerm0.isGround();
      // Undeclared exception!
      try { 
        jSTerm0.call();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // umd.cs.shop.JSTerm cannot be cast to java.lang.String
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=2.4454678304086483
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      Object[] objectArray0 = new Object[7];
      objectArray0[0] = (Object) jSTerm0;
      objectArray0[1] = (Object) jSTerm0;
      objectArray0[2] = (Object) jSTerm0;
      jSTerm0.add(objectArray0[0]);
      objectArray0[4] = (Object) jSTerm0;
      objectArray0[5] = (Object) jSTerm0;
      objectArray0[6] = (Object) jSTerm0;
      jSTerm0.isGround();
      JSTerm jSTerm1 = jSTerm0.call();
      jSTerm1.retainAll(jSTerm0);
      jSTerm1.toStr();
      jSTerm1.standardizerTerm();
      jSTerm1.makeVariable();
      JSTerm jSTerm2 = jSTerm1.standardizerTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      // Undeclared exception!
      try { 
        jSTerm1.matches(jSTerm2, jSSubstitution0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // umd.cs.shop.JSTerm cannot be cast to java.lang.String
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=2.4166220638147236
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StringReader stringReader0 = new StringReader("YGmw;1P/6R[");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      stringReader0.read();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.makeConstant();
      streamTokenizer0.resetSyntax();
      jSTerm0.makeFunction();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.firstElement();
      jSSubstitution0.add((Object) "%%%");
      JSTerm jSTerm1 = jSTerm0.applySubstitutionT(jSSubstitution0);
      jSTerm0.makeVariable();
      JSTerm jSTerm2 = jSTerm1.standardizerTerm();
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      jSTerm2.matches(jSTerm0, jSSubstitution0);
      JSTerm jSTerm3 = new JSTerm();
      // Undeclared exception!
      try { 
        jSTerm3.cloneT();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=2.1186492470699507
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StringReader stringReader0 = new StringReader("YGmw;1P/6R[");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      stringReader0.read();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.makeConstant();
      streamTokenizer0.resetSyntax();
      jSTerm0.makeFunction();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.firstElement();
      jSSubstitution0.add((Object) "%%%");
      JSTerm jSTerm1 = jSTerm0.applySubstitutionT(jSSubstitution0);
      jSSubstitution0.removeElement((Object) null);
      System.setCurrentTimeMillis((-1));
      jSTerm1.toStr();
      jSTerm1.addAll((Collection) jSSubstitution0);
      jSTerm0.cloneT();
      JSEvaluate.numericValue(jSTerm1);
      // Undeclared exception!
      try { 
        jSTerm1.toStr();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=2.1383972463477248
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StringReader stringReader0 = new StringReader("YGmw;1P/6R[");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.eolIsSignificant(false);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.makeFunction();
      JSTerm jSTerm1 = jSTerm0.standardizerTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm2 = jSTerm0.cloneT();
      jSTerm2.print();
      jSTerm1.toStr();
      jSTerm2.addAll((Collection) jSTerm0);
      // Undeclared exception!
      try { 
        jSTerm2.cloneT();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.5810937501718239
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.makeEval(true);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.add((Object) jSSubstitution0);
      jSTerm0.isGround();
      JSTerm jSTerm1 = new JSTerm();
      jSTerm1.ensureCapacity(569);
      JSTerm jSTerm2 = new JSTerm();
      jSTerm0.print();
      assertTrue(jSTerm0.isEval());
  }

  /**
  //Test case number: 27
  /*Coverage entropy=2.2602036229975626
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.add((Object) jSSubstitution0);
      jSTerm0.isGround();
      JSTerm jSTerm1 = jSTerm0.call();
      jSTerm1.equals(jSTerm0);
      jSTerm0.applySubstitutionT(jSSubstitution0);
      assertTrue(jSTerm0.equals((Object)jSTerm1));
      
      jSTerm0.setSize(41);
      JSTerm jSTerm2 = jSTerm1.standardizerTerm();
      jSTerm0.equals(jSTerm2);
      boolean boolean0 = jSTerm0.equals(jSTerm2);
      assertTrue(jSTerm1.isFunction());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=2.5681011930904805
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StringReader stringReader0 = new StringReader("YGmw;1P/6R[");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      stringReader0.read();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      streamTokenizer0.resetSyntax();
      JSJshopVars.slash = (-1);
      jSTerm0.makeFunction();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.firstElement();
      jSSubstitution0.add((Object) "%%%");
      JSTerm jSTerm1 = jSTerm0.applySubstitutionT(jSSubstitution0);
      jSTerm0.makeVariable();
      JSTerm jSTerm2 = jSTerm1.standardizerTerm();
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      jSTerm2.matches(jSTerm0, jSSubstitution0);
      jSTerm2.isGround();
      jSTerm2.equals(jSTerm0);
      JSSubstitution jSSubstitution2 = new JSSubstitution();
      jSTerm2.applySubstitutionT(jSSubstitution0);
      jSTerm2.setSize(2576);
      jSTerm1.cloneT();
      JSTerm jSTerm3 = new JSTerm();
      StringReader stringReader1 = new StringReader("?j-?:JGz InIIo");
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader1);
      // Undeclared exception!
      try { 
        jSTerm3.parseList(streamTokenizer1);
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
  /*Coverage entropy=2.730633212389677
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StringReader stringReader0 = new StringReader("YGmw;P/6R[");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      stringReader0.read();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      streamTokenizer0.resetSyntax();
      jSTerm0.makeFunction();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.firstElement();
      jSSubstitution0.add((Object) jSTerm0);
      JSTerm jSTerm1 = jSTerm0.applySubstitutionT(jSSubstitution0);
      JSTerm jSTerm2 = jSTerm1.standardizerTerm();
      JSTerm jSTerm3 = jSTerm1.call();
      jSTerm2.makeVariable();
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      jSTerm0.matches(jSTerm3, jSSubstitution1);
      jSTerm2.print();
      jSTerm1.toStr();
      jSTerm2.addAll((Collection) jSSubstitution1);
      jSTerm1.cloneT();
      jSTerm0.toStr();
      boolean boolean0 = jSTerm3.equals(jSTerm0);
      assertTrue(jSTerm0.isFunction());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=2.2047854169135204
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      Object[] objectArray0 = new Object[9];
      objectArray0[0] = (Object) jSTerm0;
      objectArray0[1] = (Object) jSTerm0;
      objectArray0[2] = (Object) jSTerm0;
      jSTerm0.add(objectArray0[0]);
      objectArray0[4] = (Object) jSTerm0;
      jSTerm0.makeVariable();
      objectArray0[5] = (Object) jSTerm0;
      objectArray0[6] = (Object) jSTerm0;
      jSTerm0.isGround();
      JSTerm jSTerm1 = jSTerm0.call();
      jSTerm1.toStr();
      jSTerm1.standardizerTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      // Undeclared exception!
      try { 
        jSTerm1.applySubstitutionPF(jSSubstitution0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // umd.cs.shop.JSTerm cannot be cast to java.lang.String
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  /**
  //Test case number: 31
  /*Coverage entropy=2.2198357039098267
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      StringReader stringReader0 = new StringReader("YGmw;1P/6R[");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      stringReader0.read();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      streamTokenizer0.resetSyntax();
      JSJshopVars.slash = (-1);
      jSTerm0.makeFunction();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      stringReader0.reset();
      jSTerm0.firstElement();
      jSSubstitution0.add((Object) "%%%");
      JSTerm jSTerm1 = jSTerm0.applySubstitutionT(jSSubstitution0);
      jSTerm0.makeVariable();
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      jSTerm1.matches(jSTerm0, jSSubstitution0);
      jSTerm1.spliterator();
      jSTerm0.equals(jSTerm1);
      JSTerm jSTerm2 = new JSTerm();
      jSTerm2.isGround();
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
  //Test case number: 32
  /*Coverage entropy=2.347437588209871
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      Object[] objectArray0 = new Object[6];
      objectArray0[0] = (Object) jSTerm0;
      jSTerm0.isGround();
      objectArray0[1] = (Object) jSTerm0;
      objectArray0[2] = (Object) jSTerm0;
      jSTerm0.add(objectArray0[0]);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSSubstitution0.spliterator();
      jSTerm0.print();
      jSTerm0.print();
      StringReader stringReader0 = new StringReader("CyhMh4$3_Q_@*.raU~7");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      jSTerm0.equals(jSTerm1);
      JSTerm jSTerm2 = jSTerm1.applySubstitutionT(jSSubstitution0);
      jSTerm0.setSize(3072);
      jSTerm2.cloneT();
      // Undeclared exception!
      try { 
        jSTerm0.standardizerTerm();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 33
  /*Coverage entropy=0.5004024235381879
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) "(");
      JSTerm jSTerm1 = null;
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      StringReader stringReader0 = new StringReader("(%Mhp2pHtG");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
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
  //Test case number: 34
  /*Coverage entropy=1.6326309271543518
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      StringReader stringReader0 = new StringReader("E?,");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      char[] charArray0 = new char[0];
      stringReader0.read();
      streamTokenizer0.eolIsSignificant(true);
      stringReader0.read(charArray0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.call();
      JSJshopVars.leftPar = (-1);
      JSSubstitution jSSubstitution0 = null;
      jSTerm0.clear();
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
  //Test case number: 35
  /*Coverage entropy=1.4183036843924253
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      StringReader stringReader0 = new StringReader("YGmw;P/6R[");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      stringReader0.read();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      streamTokenizer0.resetSyntax();
      jSTerm0.makeFunction();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSSubstitution0.spliterator();
      JSTerm jSTerm1 = new JSTerm();
      jSTerm0.add((Object) jSTerm1);
      jSTerm0.isGround();
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
  //Test case number: 36
  /*Coverage entropy=2.2900425997201577
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      StringReader stringReader0 = new StringReader("YGmw;P/6R[");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      stringReader0.read();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      streamTokenizer0.resetSyntax();
      jSTerm0.makeFunction();
      char[] charArray0 = new char[3];
      charArray0[0] = '|';
      charArray0[1] = 'g';
      JSTerm jSTerm1 = jSTerm0.call();
      charArray0[2] = '@';
      stringReader0.read(charArray0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSSubstitution0.spliterator();
      jSTerm0.add((Object) jSTerm1);
      jSTerm0.isGround();
      JSTerm jSTerm2 = jSTerm0.call();
      jSTerm2.setSize(89);
      JSTerm jSTerm3 = jSTerm0.cloneT();
      Predicate<Integer> predicate0 = Predicate.isEqual((Object) jSSubstitution0);
      Predicate<Object> predicate1 = (Predicate<Object>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      doReturn(false, false, false, false).when(predicate1).test(any());
      Predicate<Integer> predicate2 = predicate0.or(predicate1);
      Predicate<Integer> predicate3 = predicate2.negate();
      Predicate<Integer> predicate4 = predicate3.and(predicate2);
      jSTerm0.removeIf(predicate4);
      JSTerm jSTerm4 = jSTerm0.applySubstitutionT(jSSubstitution0);
      jSTerm3.standardizerTerm();
      jSTerm4.equals(jSTerm0);
      boolean boolean0 = jSTerm4.equals(jSTerm0);
      assertTrue(jSTerm0.isFunction());
      assertTrue(boolean0);
  }
}
