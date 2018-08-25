/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 16:40:01 GMT 2018
 */

package umd.cs.shop;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StreamTokenizer;
import java.io.StringReader;
import java.nio.CharBuffer;
import java.util.Collection;
import java.util.Comparator;
import java.util.function.Predicate;
import java.util.stream.Stream;
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
      StringReader stringReader0 = new StringReader("*");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.lowerCaseMode(true);
      streamTokenizer0.parseNumbers();
      streamTokenizer0.slashSlashComments(true);
      streamTokenizer0.nval = (-1.0);
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
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.makeConstant();
      JSJshopVars.coma = 3405;
      jSTerm0.spliterator();
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
  //Test case number: 2
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSTerm jSTerm1 = new JSTerm();
      jSTerm0.matches(jSTerm1);
      int int0 = 4183;
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      StringReader stringReader0 = new StringReader(";yk");
      jSTerm0.retainAll(jSTerm1);
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
  //Test case number: 3
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      int int0 = 0;
      JSJshopVars.flagLevel = 0;
      jSTerm0.makeVariable();
      // Undeclared exception!
      try { 
        jSTerm0.cloneT();
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
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringReader stringReader0 = new StringReader("60&?)n;7l=kP7LaT8sw");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
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
  //Test case number: 5
  /*Coverage entropy=1.073542846408523
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringReader stringReader0 = new StringReader("cLO5^4U| %'");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
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
  //Test case number: 6
  /*Coverage entropy=2.139085894695714
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringReader stringReader0 = new StringReader("e");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSJshopVars.rightPar = (-1);
      jSTerm0.toStr();
      jSTerm0.isGround();
      JSTerm jSTerm1 = new JSTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      jSTerm0.matches(jSTerm1, jSSubstitution1);
      jSTerm0.cloneT();
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader0);
      // Undeclared exception!
      try { 
        jSTerm1.parseList(streamTokenizer1);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringReader stringReader0 = new StringReader("e");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSJshopVars.rightPar = (-1);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.isEval();
      jSTerm0.standardizerTerm();
      StringReader stringReader1 = new StringReader("MWza%R<@(q5");
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader0);
      // Undeclared exception!
      try { 
        jSTerm0.JSPredicateFormInit(streamTokenizer1);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.294545165844896
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringReader stringReader0 = new StringReader("e");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSJshopVars.rightPar = (-1);
      jSTerm0.toStr();
      jSTerm0.equals(jSTerm0);
      JSTerm jSTerm1 = new JSTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        CharBuffer.wrap(charArray0, (-1), 38);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.CharBuffer", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.7709738809556868
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringReader stringReader0 = new StringReader("e");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSJshopVars.rightPar = (-1);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm1 = jSTerm0.applySubstitutionT(jSSubstitution0);
      assertTrue(jSTerm1.isConstant());
      
      Stream stream0 = jSSubstitution0.stream();
      jSSubstitution0.add((Object) stream0);
      jSTerm1.makeFunction();
      JSTerm jSTerm2 = jSTerm1.standardizerTerm();
      jSTerm2.add((Object) jSTerm1);
      Object[] objectArray0 = new Object[3];
      Object object0 = new Object();
      objectArray0[0] = object0;
      objectArray0[2] = (Object) jSTerm1;
      jSTerm2.toArray(objectArray0);
      streamTokenizer0.ordinaryChars(0, 10);
      jSTerm0.isVariable();
      jSTerm1.print();
      jSTerm1.isFunction();
      JSTerm jSTerm3 = jSTerm0.call();
      boolean boolean0 = jSTerm2.equals(jSTerm0);
      assertFalse(boolean0);
      
      jSTerm2.matches(jSTerm1);
      jSTerm3.isFunction();
      jSTerm2.isVariable();
      jSTerm2.applySubstitutionT(jSSubstitution0);
      JSJshopVars.interrogation = 0;
      jSTerm1.toStr();
      assertTrue(jSTerm1.isFunction());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.6319388545588898
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringReader stringReader0 = new StringReader("e");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSJshopVars.rightPar = (-1);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm1 = jSTerm0.applySubstitutionT(jSSubstitution0);
      assertTrue(jSTerm1.isConstant());
      
      Stream stream0 = jSSubstitution0.stream();
      jSSubstitution0.add((Object) stream0);
      jSTerm1.makeFunction();
      JSTerm jSTerm2 = jSTerm1.standardizerTerm();
      JSJshopVars.dot = (-1);
      jSTerm1.isEval();
      jSTerm0.isConstant();
      Object[] objectArray0 = new Object[3];
      Object object0 = new Object();
      objectArray0[0] = object0;
      objectArray0[1] = (Object) stringReader0;
      objectArray0[2] = (Object) jSTerm1;
      jSTerm2.toArray(objectArray0);
      streamTokenizer0.ordinaryChars(0, 0);
      jSTerm2.equals(jSTerm2);
      jSTerm1.print();
      streamTokenizer0.lowerCaseMode(false);
      jSTerm1.isFunction();
      JSTerm jSTerm3 = jSTerm0.call();
      boolean boolean0 = jSTerm2.equals(jSTerm0);
      assertFalse(boolean0);
      
      jSTerm2.matches(jSTerm1);
      jSTerm3.isFunction();
      jSTerm2.isVariable();
      jSTerm2.applySubstitutionT(jSSubstitution0);
      boolean boolean1 = jSTerm1.isGround();
      assertFalse(boolean1 == boolean0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.2912985160856447
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringReader stringReader0 = new StringReader("e");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSJshopVars.rightPar = (-1);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm1 = jSTerm0.applySubstitutionT(jSSubstitution0);
      Stream stream0 = jSSubstitution0.stream();
      jSSubstitution0.add((Object) stream0);
      jSTerm1.makeFunction();
      JSTerm jSTerm2 = jSTerm1.standardizerTerm();
      JSJshopVars.dot = (-1);
      jSTerm2.add((Object) jSTerm1);
      jSTerm0.isConstant();
      Object[] objectArray0 = new Object[3];
      Object object0 = new Object();
      objectArray0[0] = object0;
      objectArray0[1] = (Object) stringReader0;
      objectArray0[2] = (Object) jSTerm1;
      jSTerm2.toArray(objectArray0);
      jSTerm2.toArray(objectArray0);
      jSTerm2.isGround();
      JSTerm jSTerm3 = new JSTerm();
      jSTerm3.isVariable();
      // Undeclared exception!
      try { 
        jSTerm3.call();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      StringReader stringReader0 = new StringReader(") ");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader0);
      StreamTokenizer streamTokenizer2 = new StreamTokenizer(stringReader0);
      streamTokenizer2.parseNumbers();
      JSTerm jSTerm1 = jSTerm0.parseList(streamTokenizer0);
      assertFalse(jSTerm1.isVariable());
      assertFalse(jSTerm1.isFunction());
      assertTrue(jSTerm1.isConstant());
      assertEquals("[nil]", jSTerm1.toString());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.3797612053893156
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringReader stringReader0 = new StringReader("e");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSJshopVars.rightPar = (-1);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm1 = jSTerm0.applySubstitutionT(jSSubstitution0);
      Stream stream0 = jSSubstitution0.stream();
      jSSubstitution0.add((Object) stream0);
      jSTerm1.makeFunction();
      JSTerm jSTerm2 = jSTerm1.standardizerTerm();
      JSJshopVars.dot = (-1);
      jSTerm2.makeVariable();
      jSTerm2.add((Object) jSTerm1);
      jSTerm0.isConstant();
      Object[] objectArray0 = new Object[3];
      Object object0 = new Object();
      objectArray0[0] = object0;
      objectArray0[1] = (Object) stringReader0;
      objectArray0[2] = (Object) jSTerm1;
      jSTerm2.toArray(objectArray0);
      jSTerm2.toArray(objectArray0);
      jSTerm2.isGround();
      JSTerm jSTerm3 = new JSTerm();
      jSTerm3.isVariable();
      // Undeclared exception!
      try { 
        jSTerm3.call();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.9830877585747855
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringReader stringReader0 = new StringReader("cLO5^4U| %'");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm();
      jSTerm0.equals(jSTerm1);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      streamTokenizer0.lowerCaseMode(false);
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
  //Test case number: 15
  /*Coverage entropy=2.5086735659732424
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringReader stringReader0 = new StringReader("e");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSJshopVars.rightPar = (-1);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm1 = jSTerm0.applySubstitutionT(jSSubstitution0);
      assertFalse(jSTerm1.isFunction());
      
      Stream stream0 = jSSubstitution0.stream();
      jSSubstitution0.add((Object) stream0);
      jSTerm1.makeFunction();
      JSTerm jSTerm2 = jSTerm1.standardizerTerm();
      Object object0 = new Object();
      JSTerm jSTerm3 = new JSTerm();
      Object[] objectArray0 = new Object[6];
      objectArray0[0] = (Object) stream0;
      objectArray0[1] = (Object) "e";
      objectArray0[2] = (Object) jSTerm3;
      objectArray0[3] = (Object) streamTokenizer0;
      objectArray0[4] = (Object) stream0;
      objectArray0[5] = (Object) jSSubstitution0;
      jSTerm3.toArray(objectArray0);
      streamTokenizer0.ordinaryChars((-1), 215);
      jSTerm2.isVariable();
      jSTerm1.print();
      jSTerm1.remove((Object) null);
      JSTerm jSTerm4 = jSTerm2.call();
      jSTerm4.equals(jSTerm1);
      boolean boolean0 = jSTerm2.isFunction();
      assertTrue(boolean0);
      
      JSTerm jSTerm5 = new JSTerm();
      jSTerm5.isVariable();
      JSTerm jSTerm6 = jSTerm0.applySubstitutionT(jSSubstitution0);
      jSTerm0.toStr();
      jSTerm6.cloneT();
      assertTrue(jSTerm6.isConstant());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.478809678111712
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StringReader stringReader0 = new StringReader("e");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSJshopVars.rightPar = (-1);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm1 = jSTerm0.applySubstitutionT(jSSubstitution0);
      jSTerm1.makeFunction();
      JSTerm jSTerm2 = jSTerm1.standardizerTerm();
      jSTerm2.add((Object) jSTerm1);
      Object[] objectArray0 = new Object[3];
      Object object0 = new Object();
      objectArray0[0] = object0;
      objectArray0[2] = (Object) jSTerm1;
      Object[] objectArray1 = jSTerm2.toArray(objectArray0);
      jSTerm2.toArray(objectArray1);
      streamTokenizer0.ordinaryChars((-3), 1723);
      jSTerm1.isVariable();
      jSTerm1.print();
      Object object1 = new Object();
      jSTerm0.remove(object1);
      JSTerm jSTerm3 = jSTerm2.call();
      jSTerm0.equals(jSTerm1);
      jSTerm1.isFunction();
      JSTerm jSTerm4 = new JSTerm();
      jSTerm3.isVariable();
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      jSTerm2.applySubstitutionT(jSSubstitution1);
      // Undeclared exception!
      try { 
        jSTerm4.toStr();
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
  /*Coverage entropy=2.1390858946957136
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StringReader stringReader0 = new StringReader("B");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSSubstitution0.stream();
      jSSubstitution0.add((Object) "B");
      JSTerm jSTerm1 = new JSTerm();
      jSTerm1.makeFunction();
      JSTerm jSTerm2 = jSTerm0.standardizerTerm();
      jSTerm1.add((Object) "B");
      assertTrue(jSTerm1.isFunction());
      
      jSTerm0.isConstant();
      Object object0 = new Object();
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      JSTerm jSTerm3 = new JSTerm();
      jSTerm0.matches(jSTerm2);
      Object object1 = new Object();
      boolean boolean0 = jSTerm2.isGround();
      assertTrue(boolean0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.2424533248940002
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StringReader stringReader0 = new StringReader("6(<iJ|-hfg MR;Zs}4r");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
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
  //Test case number: 19
  /*Coverage entropy=2.007556307437838
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StringReader stringReader0 = new StringReader("e");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSJshopVars.rightPar = (-1);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      Stream stream0 = jSSubstitution0.stream();
      jSSubstitution0.add((Object) stream0);
      jSTerm0.makeFunction();
      JSTerm jSTerm1 = jSTerm0.standardizerTerm();
      JSJshopVars.dot = (-1);
      jSTerm1.add((Object) jSTerm0);
      jSTerm0.makeFunction();
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      JSTerm jSTerm2 = jSTerm1.applySubstitutionT((JSSubstitution) null);
      jSTerm0.cloneT();
      jSTerm2.standardizerTerm();
      assertTrue(jSTerm0.isFunction());
      assertTrue(jSTerm1.equals((Object)jSTerm2));
  }

  /**
  //Test case number: 20
  /*Coverage entropy=2.547466584499979
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StringReader stringReader0 = new StringReader("e");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm1 = jSTerm0.applySubstitutionT(jSSubstitution0);
      jSTerm1.makeFunction();
      JSTerm jSTerm2 = jSTerm1.standardizerTerm();
      jSTerm2.add((Object) jSTerm1);
      Object[] objectArray0 = new Object[3];
      Object object0 = new Object();
      jSTerm1.toStr();
      objectArray0[0] = object0;
      jSTerm2.toArray(objectArray0);
      streamTokenizer0.ordinaryChars(0, 10);
      jSTerm0.isVariable();
      jSTerm1.print();
      jSTerm1.remove((Object) null);
      JSTerm jSTerm3 = jSTerm0.call();
      jSTerm2.equals(jSTerm0);
      jSTerm3.isFunction();
      jSTerm2.isVariable();
      JSTerm jSTerm4 = jSTerm2.applySubstitutionT(jSSubstitution0);
      JSJshopVars.interrogation = 0;
      JSJshopVars.coma = 10;
      jSTerm1.toStr();
      jSTerm3.cloneT();
      System.setCurrentTimeMillis(10);
      JSTerm jSTerm5 = new JSTerm();
      jSTerm2.matches(jSTerm4, jSSubstitution0);
      assertEquals("[%%%, [%%%]]", jSTerm2.toString());
      
      boolean boolean0 = jSTerm5.isGround();
      assertTrue(boolean0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.8369882167858358
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      StringReader stringReader0 = new StringReader(" Expected (");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.slashSlashComments(true);
      Object[] objectArray0 = new Object[9];
      objectArray0[0] = (Object) jSTerm0;
      objectArray0[1] = (Object) stringReader0;
      objectArray0[2] = (Object) streamTokenizer0;
      objectArray0[3] = (Object) stringReader0;
      objectArray0[4] = (Object) streamTokenizer0;
      objectArray0[5] = (Object) streamTokenizer0;
      objectArray0[6] = (Object) stringReader0;
      objectArray0[7] = (Object) " Expected (";
      objectArray0[8] = (Object) " Expected (";
      jSTerm0.toArray(objectArray0);
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
  //Test case number: 22
  /*Coverage entropy=2.6613229347629224
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StringReader stringReader0 = new StringReader("e");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm1 = jSTerm0.applySubstitutionT(jSSubstitution0);
      assertTrue(jSTerm1.isConstant());
      
      jSTerm1.makeFunction();
      JSTerm jSTerm2 = jSTerm1.standardizerTerm();
      jSTerm2.add((Object) jSTerm1);
      Object[] objectArray0 = new Object[3];
      Object object0 = new Object();
      jSTerm1.toStr();
      objectArray0[0] = object0;
      jSTerm2.toArray(objectArray0);
      streamTokenizer0.ordinaryChars(0, 10);
      jSTerm0.isVariable();
      jSTerm1.print();
      jSTerm1.remove((Object) null);
      JSTerm jSTerm3 = jSTerm0.call();
      jSTerm2.equals(jSTerm0);
      jSTerm3.isFunction();
      jSTerm2.isVariable();
      JSTerm jSTerm4 = jSTerm1.applySubstitutionT(jSSubstitution0);
      jSTerm0.toStr();
      JSTerm jSTerm5 = jSTerm2.cloneT();
      System.setCurrentTimeMillis(10);
      JSTerm jSTerm6 = new JSTerm();
      jSTerm1.matches(jSTerm4, jSSubstitution0);
      boolean boolean0 = jSTerm5.isGround();
      assertTrue(boolean0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.484457535817486
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StringReader stringReader0 = new StringReader("e");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      streamTokenizer0.resetSyntax();
      JSJshopVars.rightPar = (-1);
      jSTerm0.makeVariable();
      streamTokenizer0.nval = (double) (-1);
      Object[] objectArray0 = new Object[3];
      Object object0 = new Object();
      objectArray0[0] = object0;
      objectArray0[1] = (Object) stringReader0;
      jSTerm0.removeElement(stringReader0);
      jSTerm0.call();
      assertTrue(jSTerm0.isVariable());
  }

  /**
  //Test case number: 24
  /*Coverage entropy=2.504574571642551
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StringReader stringReader0 = new StringReader("e");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSJshopVars.rightPar = (-1);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm1 = jSTerm0.applySubstitutionT(jSSubstitution0);
      Stream stream0 = jSSubstitution0.stream();
      jSSubstitution0.add((Object) stream0);
      jSTerm1.makeFunction();
      JSTerm jSTerm2 = jSTerm1.standardizerTerm();
      streamTokenizer0.nval = (double) (-1);
      jSTerm2.add((Object) jSTerm1);
      jSTerm2.firstElement();
      jSTerm2.toArray();
      streamTokenizer0.ordinaryChars((-1), 94);
      jSTerm0.isVariable();
      jSTerm2.print();
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      jSTerm2.remove((Object) "e");
      JSTerm jSTerm3 = jSTerm2.call();
      jSTerm2.equals(jSTerm3);
      jSTerm3.isFunction();
      JSTerm jSTerm4 = new JSTerm();
      jSTerm3.isVariable();
      jSTerm3.applySubstitutionT(jSSubstitution1);
      jSTerm2.toStr();
      JSTerm jSTerm5 = new JSTerm();
      // Undeclared exception!
      try { 
        jSTerm5.cloneT();
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
  /*Coverage entropy=0.37677016125643675
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      StringReader stringReader0 = new StringReader("()>E4NID4");
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
  //Test case number: 26
  /*Coverage entropy=2.2912985160856443
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StringReader stringReader0 = new StringReader("e");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSJshopVars.rightPar = (-1);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm1 = jSTerm0.applySubstitutionT(jSSubstitution0);
      Stream stream0 = jSSubstitution0.stream();
      jSSubstitution0.add((Object) stream0);
      jSTerm1.makeFunction();
      JSTerm jSTerm2 = jSTerm1.standardizerTerm();
      streamTokenizer0.nval = (double) (-1);
      jSTerm2.add((Object) jSTerm1);
      Object[] objectArray0 = new Object[3];
      Object object0 = new Object();
      JSTerm jSTerm3 = jSTerm2.applySubstitutionT(jSSubstitution0);
      objectArray0[0] = object0;
      objectArray0[1] = (Object) stringReader0;
      objectArray0[2] = (Object) jSTerm1;
      jSTerm2.toArray(objectArray0);
      jSTerm2.toArray();
      jSTerm2.isGround();
      JSTerm jSTerm4 = new JSTerm();
      JSTerm jSTerm5 = jSTerm1.cloneT();
      JSJshopVars.minus = (-1);
      jSTerm3.equals(jSTerm5);
      // Undeclared exception!
      try { 
        jSTerm4.cloneT();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.makeVariable();
      int int0 = 61;
      JSJshopVars.astherisk = 61;
      jSTerm0.isGround();
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
  //Test case number: 28
  /*Coverage entropy=1.7480673485460891
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StringReader stringReader0 = new StringReader("e");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm1 = jSTerm0.applySubstitutionT(jSSubstitution0);
      jSTerm1.makeFunction();
      StringReader stringReader1 = new StringReader("? ");
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader1);
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
}
