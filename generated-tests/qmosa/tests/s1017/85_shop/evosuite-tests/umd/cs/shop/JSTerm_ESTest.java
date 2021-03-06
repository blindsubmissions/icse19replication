/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 14:17:32 GMT 2018
 */

package umd.cs.shop;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StreamTokenizer;
import java.io.StringReader;
import java.util.Collection;
import java.util.Comparator;
import java.util.function.Predicate;
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
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.makeFunction();
      int int0 = 0;
      JSJshopVars.leftBrac = 0;
      jSTerm0.makeVariable();
      StringReader stringReader0 = new StringReader(" ) ");
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
  //Test case number: 1
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.isGround();
      // Undeclared exception!
      try { 
        jSTerm0.toStr();
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
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringReader stringReader0 = new StringReader(" Expected (");
      char[] charArray0 = new char[8];
      charArray0[0] = 'l';
      charArray0[1] = '#';
      charArray0[2] = 'A';
      charArray0[3] = '<';
      charArray0[4] = '0';
      charArray0[5] = 'c';
      charArray0[6] = 'S';
      charArray0[7] = 'y';
      stringReader0.read(charArray0);
      stringReader0.read();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.parseNumbers();
      streamTokenizer0.pushBack();
      streamTokenizer0.eolIsSignificant(true);
      streamTokenizer0.wordChars(2065, 1);
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
  //Test case number: 3
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.makeFunction();
      JSTerm jSTerm1 = new JSTerm();
      JSSubstitution jSSubstitution0 = jSTerm0.matches(jSTerm1);
      // Undeclared exception!
      try { 
        jSTerm1.matches(jSTerm0, jSSubstitution0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.makeEval(true);
      // Undeclared exception!
      try { 
        jSTerm0.print();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.589026915173973
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.makeConstant();
      jSTerm0.isConstant();
      JSTerm jSTerm1 = jSTerm0.call();
      StringReader stringReader0 = new StringReader("!/6y9I>uOJ$Hq|<U#=");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
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
  //Test case number: 6
  /*Coverage entropy=1.7478680974667573
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringReader stringReader0 = new StringReader("uTz)");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      streamTokenizer0.slashStarComments(false);
      boolean boolean0 = jSTerm0.isEval();
      assertFalse(boolean0);
      
      jSTerm0.isConstant();
      JSTerm jSTerm1 = jSTerm0.call();
      jSTerm1.call();
      StringBuffer stringBuffer0 = jSTerm0.toStr();
      assertEquals(4, stringBuffer0.length());
      
      boolean boolean1 = jSTerm1.isVariable();
      assertFalse(jSTerm1.isFunction());
      assertFalse(boolean1);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringReader stringReader0 = new StringReader("0bkOi5K^4");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm1 = jSTerm0.standardizerTerm();
      JSJshopVars.equalT = (-2);
      jSSubstitution0.addAll((Collection) jSTerm0);
      int int0 = 37;
      JSJshopVars.plus = (-2);
      jSTerm1.standarizerPredicateForm();
      // Undeclared exception!
      try { 
        jSSubstitution0.addAll(37, (Collection) jSTerm0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: 37
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(^QHfg(3Z>_}z\"NCV'.");
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
  //Test case number: 9
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      jSPredicateForm0.add((Object) jSTerm0);
      jSTerm0.addAll((Collection) jSPredicateForm0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      jSSubstitution0.sort(comparator0);
      jSTerm0.add((Object) jSSubstitution0);
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
  //Test case number: 10
  /*Coverage entropy=1.9730014063936123
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.removeElement(jSSubstitution0);
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      Comparator<JSSubstitution> comparator0 = (Comparator<JSSubstitution>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      jSSubstitution0.sort(comparator0);
      jSTerm0.add((Object) jSSubstitution1);
      jSTerm0.toStr();
      jSTerm0.isConstant();
      jSTerm0.toStr();
      JSTerm jSTerm1 = new JSTerm();
      JSSubstitution jSSubstitution2 = new JSSubstitution();
      JSSubstitution jSSubstitution3 = jSTerm0.matches(jSTerm1, jSSubstitution2);
      assertTrue(jSSubstitution3.fail());
      
      StringBuffer stringBuffer0 = jSTerm0.toStr();
      assertEquals("([] )", stringBuffer0.toString());
      
      jSTerm0.isVariable();
      JSTerm jSTerm2 = jSTerm0.cloneT();
      assertTrue(jSTerm2.isFunction());
      assertFalse(jSTerm2.isVariable());
      assertFalse(jSTerm2.isConstant());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringReader stringReader0 = new StringReader("7pI");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.print();
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
  //Test case number: 12
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.makeFunction();
      jSTerm0.clone();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.makeConstant();
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      // Undeclared exception!
      try { 
        jSTerm0.applySubstitutionT(jSSubstitution0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.7481554572476763
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.isConstant();
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      Comparator<JSSubstitution> comparator0 = (Comparator<JSSubstitution>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      jSSubstitution0.sort(comparator0);
      jSTerm0.add((Object) jSSubstitution1);
      jSTerm0.toStr();
      jSTerm0.isConstant();
      jSTerm0.toStr();
      JSTerm jSTerm1 = new JSTerm();
      JSSubstitution jSSubstitution2 = new JSSubstitution();
      jSTerm0.matches(jSTerm1, jSSubstitution2);
      jSTerm0.toStr();
      jSTerm0.isVariable();
      StringReader stringReader0 = new StringReader("%%%");
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
  //Test case number: 14
  /*Coverage entropy=1.9924470451737486
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.isConstant();
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      Comparator<JSSubstitution> comparator0 = (Comparator<JSSubstitution>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      jSSubstitution0.sort(comparator0);
      jSTerm0.add((Object) jSSubstitution1);
      jSTerm0.toStr();
      jSTerm0.isConstant();
      jSTerm0.toStr();
      JSTerm jSTerm1 = new JSTerm();
      JSSubstitution jSSubstitution2 = new JSSubstitution();
      jSTerm0.matches(jSTerm1, jSSubstitution2);
      StringReader stringReader0 = new StringReader("Ie(qbtw&3zA:?=\u0001");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm2 = new JSTerm(streamTokenizer0);
      jSTerm2.makeVariable();
      jSTerm1.equals(jSTerm2);
      jSTerm0.print();
      assertFalse(jSTerm0.isEmpty());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.makeConstant();
      jSTerm0.isConstant();
      JSTerm jSTerm1 = jSTerm0.call();
      JSTerm jSTerm2 = new JSTerm();
      JSSubstitution jSSubstitution0 = jSTerm2.matches(jSTerm0);
      // Undeclared exception!
      try { 
        jSTerm0.matches(jSTerm1, jSSubstitution0);
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
  /*Coverage entropy=1.5247073930301436
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      jSPredicateForm0.add((Object) jSTerm0);
      jSTerm0.addAll((Collection) jSPredicateForm0);
      StringReader stringReader0 = new StringReader("O2^W+$J>BcqD");
      StringReader stringReader1 = new StringReader("Ie(qbtw&3zA:?=\u0001");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader1);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      jSTerm0.makeVariable();
      JSTerm jSTerm2 = new JSTerm();
      jSTerm1.equals(jSTerm2);
      // Undeclared exception!
      try { 
        jSTerm2.print();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.8310204811135162
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.makeConstant();
      jSTerm0.isConstant();
      JSTerm jSTerm1 = new JSTerm();
      JSSubstitution jSSubstitution0 = jSTerm0.matches(jSTerm1);
      JSTerm jSTerm2 = new JSTerm();
      JSSubstitution jSSubstitution1 = jSTerm2.matches(jSTerm0, jSSubstitution0);
      assertTrue(jSTerm0.isConstant());
      assertTrue(jSSubstitution1.fail());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.4750763110546947
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.clone();
      jSTerm0.add((Object) jSTerm0);
      jSTerm0.addAll((Collection) jSTerm0);
      // Undeclared exception!
      try { 
        jSTerm0.standardizerTerm();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.2718685126965625
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm1 = new JSTerm();
      jSTerm1.isConstant();
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      jSSubstitution1.sort(comparator0);
      jSTerm0.add((Object) jSTerm1);
      jSTerm0.toStr();
      jSTerm1.isConstant();
      jSTerm0.toStr();
      JSTerm jSTerm2 = new JSTerm();
      JSSubstitution jSSubstitution2 = new JSSubstitution();
      jSTerm0.matches(jSTerm2, jSSubstitution2);
      StringReader stringReader0 = new StringReader("Ie(qbtw&3zA:?=\u0001");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm3 = new JSTerm(streamTokenizer0);
      jSTerm2.makeVariable();
      jSTerm2.equals(jSTerm1);
      // Undeclared exception!
      try { 
        jSTerm2.cloneT();
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
  /*Coverage entropy=2.2326944771870667
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      System.setCurrentTimeMillis(1003L);
      StringReader stringReader0 = new StringReader("W,a/vl'ovPP");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSJshopVars.lessT = 1;
      JSTerm jSTerm1 = jSTerm0.cloneT();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm2 = jSTerm0.applySubstitutionT(jSSubstitution0);
      JSJshopVars.lessT = 641;
      jSTerm1.matches(jSTerm2, jSSubstitution0);
      jSTerm2.call();
      System.setCurrentTimeMillis(599L);
      jSTerm0.spliterator();
      jSTerm2.toStr();
      jSTerm0.isGround();
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
  //Test case number: 21
  /*Coverage entropy=1.695865445077461
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      jSPredicateForm0.clone();
      StringReader stringReader0 = new StringReader(" expected");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      jSTerm1.makeFunction();
      JSTerm jSTerm2 = new JSTerm();
      JSSubstitution jSSubstitution0 = jSTerm2.matches(jSTerm1);
      jSTerm2.matches(jSTerm0, jSSubstitution0);
      assertFalse(jSTerm1.isConstant());
      assertTrue(jSSubstitution0.fail());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      StringReader stringReader0 = new StringReader("?");
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
  //Test case number: 23
  /*Coverage entropy=2.4036404106149494
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      jSTerm0.clone();
      JSTerm jSTerm1 = new JSTerm();
      Object object0 = jSTerm1.clone();
      jSTerm0.add(object0);
      JSTerm jSTerm2 = new JSTerm();
      jSTerm2.addAll((Collection) jSTerm0);
      JSTerm jSTerm3 = jSTerm0.standardizerTerm();
      StringReader stringReader0 = new StringReader("C&37qy1xo`]Q");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm4 = new JSTerm(streamTokenizer0);
      jSTerm4.standardizerTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      jSSubstitution0.add(object0);
      JSTerm jSTerm5 = jSTerm0.applySubstitutionT(jSSubstitution0);
      jSTerm3.addAll((Collection) jSSubstitution0);
      jSTerm5.call();
      jSTerm5.addElement(streamTokenizer0);
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
  /*Coverage entropy=0.45056120886630463
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) jSTerm0);
      jSTerm0.addAll((Collection) jSTerm0);
      // Undeclared exception!
      try { 
        jSTerm0.print();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.8392967479776605
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StringReader stringReader0 = new StringReader("%FP");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      Object object0 = new Object();
      JSTerm jSTerm0 = new JSTerm();
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer1);
      boolean boolean0 = jSTerm0.equals(jSTerm1);
      boolean boolean1 = jSTerm1.isGround();
      assertFalse(boolean1 == boolean0);
      
      jSTerm1.print();
      assertFalse(jSTerm1.isEval());
      assertEquals("[%FP]", jSTerm1.toString());
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.7721393884375285
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.makeFunction();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      StringReader stringReader0 = new StringReader("Ik8JV)Vkg5h0v");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      jSTerm1.addElement(streamTokenizer0);
      jSTerm1.cloneT();
      jSTerm1.call();
      jSTerm0.parseList(streamTokenizer0);
      assertTrue(jSTerm0.isFunction());
  }

  /**
  //Test case number: 27
  /*Coverage entropy=2.114308130951528
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      jSPredicateForm0.clone();
      jSPredicateForm0.add((Object) jSTerm0);
      jSTerm0.addAll((Collection) jSPredicateForm0);
      JSTerm jSTerm1 = jSTerm0.standardizerTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      jSTerm0.retainAll(jSPredicateForm0);
      jSTerm1.addElement(jSTerm0);
      JSTerm jSTerm2 = jSTerm1.cloneT();
      jSTerm2.makeVariable();
      jSTerm2.isGround();
      jSTerm1.applySubstitutionT(jSSubstitution0);
      jSTerm0.applySubstitutionT(jSSubstitution1);
      assertEquals(1, jSTerm0.size());
  }

  /**
  //Test case number: 28
  /*Coverage entropy=2.276422685805818
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      jSPredicateForm0.clone();
      jSPredicateForm0.add((Object) jSTerm0);
      jSTerm0.addAll((Collection) jSPredicateForm0);
      StringReader stringReader0 = new StringReader("?K@WL@#YN5|l4;");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm2 = jSTerm0.standardizerTerm();
      JSTerm jSTerm3 = jSTerm2.standardizerTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm4 = jSTerm1.applySubstitutionT(jSSubstitution0);
      JSTerm jSTerm5 = (JSTerm)jSTerm3.clone();
      assertTrue(jSTerm2.isFunction());
      assertFalse(jSTerm2.isEval());
      assertTrue(jSTerm5.isFunction());
      
      JSTerm jSTerm6 = jSTerm0.cloneT();
      assertTrue(jSTerm6.isFunction());
      
      JSSubstitution jSSubstitution1 = jSTerm1.matches(jSTerm4, jSSubstitution0);
      assertFalse(jSTerm1.isFunction());
      assertEquals("[?%%%]", jSTerm4.toString());
      assertFalse(jSTerm4.isEval());
      assertTrue(jSTerm4.isVariable());
      assertFalse(jSTerm4.isConstant());
      assertEquals(1, jSSubstitution1.size());
      assertNotSame(jSTerm4, jSTerm1);
      assertFalse(jSTerm4.isFunction());
  }

  /**
  //Test case number: 29
  /*Coverage entropy=2.458311329683084
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      jSPredicateForm0.clone();
      jSPredicateForm0.add((Object) jSTerm0);
      StringReader stringReader0 = new StringReader("?K@WL@#YN5|l4;");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm2 = jSTerm1.standardizerTerm();
      assertFalse(jSTerm2.isEval());
      assertEquals("[?%%%0]", jSTerm2.toString());
      assertTrue(jSTerm2.isVariable());
      
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm3 = jSTerm1.applySubstitutionT(jSSubstitution0);
      jSSubstitution0.cloneS();
      StringBuffer stringBuffer0 = jSTerm1.toStr();
      assertEquals(5, stringBuffer0.length());
      
      JSTerm jSTerm4 = jSTerm3.call();
      assertNotSame(jSTerm3, jSTerm1);
      assertFalse(jSTerm4.isFunction());
      assertEquals(1, jSTerm4.capacity());
      assertFalse(jSTerm1.isFunction());
      assertFalse(jSTerm4.isConstant());
  }

  /**
  //Test case number: 30
  /*Coverage entropy=2.3594656874870674
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      jSPredicateForm0.clone();
      jSPredicateForm0.add((Object) jSTerm0);
      jSTerm0.addAll((Collection) jSPredicateForm0);
      JSTerm jSTerm1 = jSTerm0.standardizerTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      JSJshopVars.exclamation = 1069;
      jSTerm0.retainAll(jSPredicateForm0);
      jSTerm1.addElement(jSTerm0);
      JSTerm jSTerm2 = jSTerm1.cloneT();
      boolean boolean0 = jSTerm2.isGround();
      JSTerm jSTerm3 = jSTerm1.applySubstitutionT(jSSubstitution0);
      JSTerm jSTerm4 = jSTerm0.applySubstitutionT(jSSubstitution1);
      assertFalse(jSTerm4.isEval());
      
      JSTerm jSTerm5 = jSTerm1.call();
      boolean boolean1 = jSTerm4.equals(jSTerm5);
      assertFalse(boolean1 == boolean0);
      assertEquals("[[(this Collection)], [[(this Collection)]]]", jSTerm5.toString());
      assertFalse(jSTerm0.isFunction());
      assertFalse(jSTerm4.equals((Object)jSTerm3));
      assertNotSame(jSTerm1, jSTerm2);
      assertTrue(jSTerm5.isFunction());
      assertTrue(jSTerm5.equals((Object)jSTerm2));
      assertFalse(boolean1);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=2.2602036229975626
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      JSPredicateForm jSPredicateForm1 = (JSPredicateForm)jSPredicateForm0.clone();
      jSPredicateForm0.add((Object) jSTerm0);
      jSTerm0.addAll((Collection) jSPredicateForm0);
      StringReader stringReader0 = new StringReader("?K@WL@#YN5|l4;");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      jSTerm0.retainAll(jSPredicateForm1);
      jSTerm0.addElement("?K@WL@#YN5|l4;");
      JSTerm jSTerm1 = jSTerm0.cloneT();
      boolean boolean0 = jSTerm1.isGround();
      assertTrue(jSTerm1.isFunction());
      
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm2 = jSTerm0.applySubstitutionT(jSSubstitution0);
      jSTerm2.applySubstitutionT(jSSubstitution0);
      JSTerm jSTerm3 = jSTerm0.call();
      boolean boolean1 = jSTerm2.equals(jSTerm3);
      assertTrue(boolean1 == boolean0);
      assertTrue(jSTerm2.isFunction());
      assertTrue(boolean1);
  }

  /**
  //Test case number: 32
  /*Coverage entropy=2.284929477270969
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      JSPredicateForm jSPredicateForm1 = (JSPredicateForm)jSPredicateForm0.clone();
      jSPredicateForm0.add((Object) jSTerm0);
      jSTerm0.addAll((Collection) jSPredicateForm0);
      StringReader stringReader0 = new StringReader("?K@WL@#YN5|l4;");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      jSTerm0.retainAll(jSPredicateForm1);
      jSTerm0.addElement("?K@WL@#YN5|l4;");
      JSTerm jSTerm1 = jSTerm0.cloneT();
      jSTerm1.isGround();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm2 = jSTerm0.applySubstitutionT(jSSubstitution0);
      JSTerm jSTerm3 = jSTerm2.applySubstitutionT(jSSubstitution0);
      jSTerm3.matches((JSPredicateForm) jSTerm2);
      JSTerm jSTerm4 = jSTerm0.call();
      jSTerm4.matches(jSTerm1);
      System.setCurrentTimeMillis((-4));
  }

  /**
  //Test case number: 33
  /*Coverage entropy=2.08055716002842
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      StringReader stringReader1 = new StringReader("8.QT uebEyup1Nbw~^");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader1);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = jSTerm0.applySubstitutionT(jSSubstitution0);
      jSTerm0.lastElement();
      streamTokenizer0.ttype = 33;
      jSTerm0.call();
      jSTerm1.isGround();
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      JSTerm jSTerm2 = jSTerm0.applySubstitutionT(jSSubstitution1);
      jSTerm2.applySubstitutionT(jSSubstitution0);
      jSTerm2.matches((JSPredicateForm) jSTerm0);
      jSTerm0.call();
      JSTerm jSTerm3 = new JSTerm(streamTokenizer0);
      jSTerm2.matches(jSTerm3);
      System.setCurrentTimeMillis(0L);
  }

  /**
  //Test case number: 34
  /*Coverage entropy=1.69240886298655
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      Object object0 = jSPredicateForm0.clone();
      jSPredicateForm0.add(object0);
      jSTerm0.addAll((Collection) jSPredicateForm0);
      jSTerm0.standardizerTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      String string0 = " (gFZ9k48iQhztq;:-";
      StringReader stringReader0 = new StringReader(" (gFZ9k48iQhztq;:-");
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
  //Test case number: 35
  /*Coverage entropy=2.458311329683084
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) jSTerm0);
      StringReader stringReader0 = new StringReader("?K@WL@#YN5|l4;");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      jSTerm1.standardizerTerm();
      JSTerm jSTerm2 = jSTerm1.standardizerTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm3 = jSTerm2.applySubstitutionT(jSSubstitution0);
      assertTrue(jSTerm3.isVariable());
      
      JSTerm jSTerm4 = jSTerm2.cloneT();
      JSSubstitution jSSubstitution1 = jSTerm1.matches(jSTerm0, jSSubstitution0);
      assertEquals(1, jSSubstitution1.size());
      
      jSTerm4.print();
      assertEquals("[?%%%0]", jSTerm2.toString());
      assertFalse(jSTerm2.isFunction());
      assertFalse(jSTerm1.isFunction());
      assertFalse(jSTerm4.isEval());
      assertNotSame(jSTerm4, jSTerm3);
  }

  /**
  //Test case number: 36
  /*Coverage entropy=2.372303775825629
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) jSTerm0);
      StringReader stringReader0 = new StringReader("?n.DkGxfD");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm2 = jSTerm1.standardizerTerm();
      JSTerm jSTerm3 = jSTerm2.standardizerTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm4 = jSTerm3.applySubstitutionT(jSSubstitution0);
      jSTerm1.cloneT();
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      jSTerm0.matches(jSTerm4, jSSubstitution1);
      jSTerm1.isGround();
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm5 = null;
      try {
        jSTerm5 = new JSTerm(streamTokenizer1);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  /**
  //Test case number: 37
  /*Coverage entropy=2.4611266279997657
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) jSTerm0);
      StringReader stringReader0 = new StringReader("?K@WL@#YN5|l4;");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      jSTerm1.standardizerTerm();
      JSTerm jSTerm2 = jSTerm1.standardizerTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm3 = jSTerm2.applySubstitutionT(jSSubstitution0);
      jSTerm2.cloneT();
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      JSTerm jSTerm4 = jSTerm0.applySubstitutionT(jSSubstitution0);
      JSSubstitution jSSubstitution2 = jSTerm1.matches(jSTerm2, jSSubstitution1);
      JSTerm jSTerm5 = jSTerm4.standardizerTerm();
      assertTrue(jSTerm5.isFunction());
      
      JSSubstitution jSSubstitution3 = jSTerm1.matches(jSTerm0, jSSubstitution2);
      assertNotSame(jSTerm0, jSTerm4);
      
      JSTerm jSTerm6 = jSTerm3.call();
      jSTerm6.call();
      assertFalse(jSTerm1.isFunction());
      assertFalse(jSSubstitution0.equals((Object)jSSubstitution3));
      assertEquals("[?%%%0]", jSTerm6.toString());
      assertNotSame(jSTerm3, jSTerm2);
      assertFalse(jSTerm6.isFunction());
      assertTrue(jSTerm6.isVariable());
      assertTrue(jSTerm3.isVariable());
  }
}
