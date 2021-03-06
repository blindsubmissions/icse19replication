/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 11:12:33 GMT 2018
 */

package umd.cs.shop;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StreamTokenizer;
import java.io.StringReader;
import java.util.Comparator;
import java.util.function.Predicate;
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
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringReader stringReader0 = new StringReader("umd.cs.shop.JSSubstitution");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.pushBack();
      streamTokenizer0.slashStarComments(true);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm1 = jSTerm0.applySubstitutionT(jSSubstitution0);
      JSJshopVars.leftBrac = 0;
      jSTerm1.isEval();
      JSJshopVars.greaterT = 0;
      jSTerm0.makeFunction();
      jSTerm0.toStr();
      boolean boolean0 = jSTerm1.isVariable();
      assertTrue(jSTerm0.isFunction());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringReader stringReader0 = new StringReader(" XxDnVkb2uIqwv^m+");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm1.matches(jSTerm0, jSSubstitution0);
      jSTerm0.matches(jSTerm1);
      jSTerm0.isVariable();
      JSTerm jSTerm2 = jSTerm0.call();
      JSJshopVars.percent = (-1);
      JSJshopVars.leftBrac = 63;
      jSTerm2.matches(jSTerm1);
      jSTerm0.isGround();
      // Undeclared exception!
      try { 
        jSTerm1.call();
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
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSJshopVars.lessT = (-2);
      JSTerm jSTerm1 = new JSTerm();
      jSTerm0.equals(jSTerm1);
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
  //Test case number: 3
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.makeEval(false);
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      jSTerm0.sort(comparator0);
      jSTerm0.isEval();
      JSTerm jSTerm1 = new JSTerm();
      jSTerm0.matches(jSTerm1);
      // Undeclared exception!
      try { 
        jSTerm1.standardizerTerm();
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
  /*Coverage entropy=1.073542846408523
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      StringReader stringReader0 = new StringReader(".");
      char[] charArray0 = new char[7];
      charArray0[0] = '!';
      charArray0[1] = 'v';
      charArray0[2] = 'U';
      charArray0[3] = 'V';
      charArray0[4] = 'u';
      charArray0[5] = '}';
      charArray0[6] = 'd';
      stringReader0.read(charArray0, 0, 0);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
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
  //Test case number: 5
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(");
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
  //Test case number: 6
  /*Coverage entropy=2.3693821196946767
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringReader stringReader0 = new StringReader(" XxDnVkb2uIqwv^m+");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = jSTerm0.matches(jSTerm0, jSSubstitution0);
      assertNotSame(jSSubstitution1, jSSubstitution0);
      
      JSSubstitution jSSubstitution2 = jSTerm0.matches(jSTerm0);
      assertFalse(jSSubstitution2.fail());
      
      jSTerm0.isVariable();
      JSTerm jSTerm1 = jSTerm0.call();
      jSTerm0.print();
      jSTerm1.makeConstant();
      assertFalse(jSTerm1.isFunction());
      
      JSTerm jSTerm2 = jSTerm0.cloneT();
      assertFalse(jSTerm2.isVariable());
      assertTrue(jSTerm2.isConstant());
      
      JSSubstitution jSSubstitution3 = new JSSubstitution();
      JSTerm jSTerm3 = jSTerm0.call();
      JSTerm jSTerm4 = jSTerm3.call();
      assertNotSame(jSTerm0, jSTerm2);
      assertFalse(jSTerm4.isEval());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringReader stringReader0 = new StringReader("umd.cs.shop.JSSubstitution");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.pushBack();
      streamTokenizer0.slashStarComments(true);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm1 = jSTerm0.applySubstitutionT(jSSubstitution0);
      jSTerm0.standardizerTerm();
      jSTerm1.isConstant();
      JSTerm jSTerm2 = jSTerm1.standardizerTerm();
      assertFalse(jSTerm2.isEval());
      assertNotSame(jSTerm1, jSTerm0);
      assertNotSame(jSTerm2, jSTerm1);
      assertFalse(jSTerm2.isVariable());
      assertTrue(jSTerm2.isConstant());
      assertFalse(jSTerm2.isEmpty());
      assertFalse(jSTerm2.isFunction());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.7356219397587946
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      StringReader stringReader0 = new StringReader("=Tnsy");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      jSTerm0.makeConstant();
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
  //Test case number: 9
  /*Coverage entropy=0.5004024235381879
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      StringReader stringReader0 = new StringReader("%%%");
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
  //Test case number: 10
  /*Coverage entropy=1.0986122886681098
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      StringReader stringReader0 = new StringReader("15(rH1>_");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      jSTerm0.makeConstant();
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      jSTerm1.matches((JSPredicateForm) jSTerm0);
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
  //Test case number: 11
  /*Coverage entropy=2.0642580751745085
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      JSTerm jSTerm1 = (JSTerm)jSTerm0.clone();
      jSSubstitution1.add((Object) jSTerm1);
      jSTerm0.addElement(jSSubstitution1);
      jSTerm1.isVariable();
      boolean boolean0 = jSTerm0.isGround();
      assertTrue(boolean0);
      
      JSSubstitution jSSubstitution2 = jSTerm0.matches(jSTerm1);
      assertTrue(jSSubstitution2.fail());
      
      JSTerm jSTerm2 = jSTerm0.call();
      assertFalse(jSTerm2.isConstant());
      assertFalse(jSTerm2.isVariable());
      assertTrue(jSTerm2.isFunction());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.2102535776209735
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      boolean boolean0 = jSTerm0.isGround();
      assertTrue(boolean0);
      
      StringReader stringReader0 = new StringReader("7?j;|mLEI]#X7");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      stringReader0.read();
      JSJshopVars.equalT = 55;
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      assertFalse(jSTerm1.isConstant());
      
      JSSubstitution jSSubstitution1 = jSTerm0.matches(jSTerm1);
      assertEquals(1, jSSubstitution1.size());
      
      JSTerm jSTerm2 = jSTerm1.call();
      assertFalse(jSTerm2.isFunction());
      assertEquals("[?%%%]", jSTerm2.toString());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      System.setCurrentTimeMillis((-718L));
      JSTerm jSTerm0 = new JSTerm();
      StringReader stringReader0 = new StringReader(")7N");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm1 = jSTerm0.parseList(streamTokenizer0);
      JSTerm jSTerm2 = jSTerm1.cloneT();
      assertTrue(jSTerm2.isConstant());
      assertEquals("[nil]", jSTerm1.toString());
      assertFalse(jSTerm2.isVariable());
      assertNotSame(jSTerm2, jSTerm1);
      assertFalse(jSTerm2.isFunction());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.6674619334292948
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      jSTerm0.clone();
      jSSubstitution0.stream();
      Integer integer0 = new Integer(544);
      jSSubstitution0.add((Object) integer0);
      jSTerm0.addElement(jSTerm0);
      JSTerm jSTerm1 = jSTerm0.standardizerTerm();
      assertFalse(jSTerm1.isEval());
      assertFalse(jSTerm1.isVariable());
      assertFalse(jSTerm1.isConstant());
      assertTrue(jSTerm1.isFunction());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.2102535776209735
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      jSSubstitution1.sort(comparator0);
      JSTerm jSTerm1 = (JSTerm)jSTerm0.clone();
      jSSubstitution1.add((Object) jSTerm1);
      jSTerm0.addElement(jSSubstitution1);
      jSTerm1.removeAll(jSSubstitution1);
      JSJshopVars.semicolon = 1;
      jSTerm1.isVariable();
      jSTerm0.isGround();
      JSSubstitution jSSubstitution2 = new JSSubstitution();
      JSTerm jSTerm2 = jSTerm0.call();
      System.setCurrentTimeMillis(0L);
      jSTerm1.equals(jSTerm2);
      // Undeclared exception!
      try { 
        jSTerm1.parseList((StreamTokenizer) null);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.6749900127837867
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      StringReader stringReader0 = new StringReader("M 3h");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.pushBack();
      streamTokenizer0.slashStarComments(true);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm2 = new JSTerm(streamTokenizer0);
      jSTerm2.print();
      JSSubstitution jSSubstitution1 = jSTerm1.matches(jSTerm2);
      assertTrue(jSSubstitution1.fail());
      assertFalse(jSTerm2.isEval());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.874954012530535
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      StringReader stringReader0 = new StringReader("M 3h");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.pushBack();
      streamTokenizer0.slashStarComments(true);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm2 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm3 = new JSTerm(streamTokenizer0);
      jSTerm3.makeFunction();
      jSTerm3.print();
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      JSTerm jSTerm4 = new JSTerm();
      jSTerm3.applySubstitutionT(jSSubstitution0);
      jSTerm3.cloneT();
      JSSubstitution jSSubstitution2 = new JSSubstitution();
      JSTerm jSTerm5 = null;
      try {
        jSTerm5 = new JSTerm(streamTokenizer0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.9254081650860664
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.makeVariable();
      jSTerm0.isGround();
      jSTerm0.addElement(jSSubstitution0);
      jSTerm0.isVariable();
      jSTerm0.isGround();
      StringReader stringReader0 = new StringReader("WSQ |9xG?C'k;#");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      // Undeclared exception!
      try { 
        jSTerm0.matches(jSTerm1);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // umd.cs.shop.JSSubstitution cannot be cast to java.lang.String
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.4750763110546947
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSSubstitution0.add((Object) jSTerm0);
      jSTerm0.addElement(jSSubstitution0);
      int int0 = 1066;
      Integer integer0 = new Integer(1066);
      Object object0 = jSTerm0.lastElement();
      jSSubstitution0.add(object0);
      Object object1 = new Object();
      jSTerm0.addElement(object1);
      // Undeclared exception!
      try { 
        jSTerm0.standardizerTerm();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=2.238941108704779
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      StringReader stringReader0 = new StringReader("M 3h");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.pushBack();
      streamTokenizer0.slashStarComments(false);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader0);
      StringReader stringReader1 = new StringReader("S''");
      stringReader1.read();
      JSTerm jSTerm2 = new JSTerm(streamTokenizer1);
      JSTerm jSTerm3 = new JSTerm(streamTokenizer1);
      JSSubstitution jSSubstitution1 = jSTerm2.matches(jSTerm3);
      assertTrue(jSSubstitution1.fail());
      
      JSSubstitution jSSubstitution2 = jSTerm1.matches(jSTerm0);
      JSTerm jSTerm4 = jSTerm2.call();
      JSTerm jSTerm5 = jSTerm4.applySubstitutionT(jSSubstitution2);
      assertTrue(jSTerm5.isConstant());
      assertTrue(jSSubstitution2.fail());
      assertFalse(jSTerm5.isVariable());
      assertEquals(10, jSTerm5.capacity());
      assertFalse(jSTerm5.isFunction());
      
      boolean boolean0 = jSTerm0.isGround();
      boolean boolean1 = jSTerm3.equals(jSTerm0);
      assertFalse(boolean1 == boolean0);
      assertFalse(jSTerm3.isEval());
      assertFalse(boolean1);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.666332585328325
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      StringReader stringReader0 = new StringReader("15(rH1>_");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm1 = new JSTerm();
      streamTokenizer0.nextToken();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      streamTokenizer0.resetSyntax();
      jSTerm0.isGround();
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
  /*Coverage entropy=1.8288411561741993
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSSubstitution0.add((Object) jSTerm0);
      jSTerm0.addElement(jSSubstitution0);
      jSTerm0.equals(jSTerm0);
      jSTerm0.isGround();
      JSTerm jSTerm1 = jSTerm0.cloneT();
      // Undeclared exception!
      try { 
        jSTerm0.equals(jSTerm1);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // umd.cs.shop.JSSubstitution cannot be cast to java.lang.String
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.6434177197931796
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      JSTerm jSTerm1 = (JSTerm)jSTerm0.clone();
      jSSubstitution1.add((Object) jSTerm1);
      jSTerm0.addElement(jSSubstitution1);
      jSTerm1.removeAll(jSSubstitution1);
      JSJshopVars.semicolon = 1;
      JSJshopVars.semicolon = 1;
      jSTerm0.addElement(jSSubstitution0);
      jSTerm0.equals(jSTerm1);
      // Undeclared exception!
      try { 
        jSTerm0.isGround();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // umd.cs.shop.JSSubstitution cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=2.1639556568820564
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StringReader stringReader0 = new StringReader("WZ(laO*]RjEEO@xpr_");
      StringReader stringReader1 = new StringReader("7?j;|mLEI]#X7");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader1);
      stringReader0.read();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm2 = jSTerm0.cloneT();
      assertTrue(jSTerm2.isConstant());
      assertFalse(jSTerm2.isVariable());
      assertFalse(jSTerm2.isFunction());
      assertNotSame(jSTerm2, jSTerm0);
      
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      Predicate<String> predicate0 = Predicate.isEqual((Object) jSSubstitution1);
      predicate0.negate();
      jSTerm1.removeIf(predicate0);
      JSTerm jSTerm3 = jSTerm1.standardizerTerm();
      assertFalse(jSTerm3.isEval());
      assertFalse(jSTerm1.isFunction());
      assertFalse(jSTerm3.isFunction());
      assertTrue(jSTerm3.isVariable());
      assertFalse(jSTerm3.isConstant());
      assertEquals("[?%%%0]", jSTerm3.toString());
  }

  /**
  //Test case number: 25
  /*Coverage entropy=2.242973226438147
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      JSTerm jSTerm1 = (JSTerm)jSTerm0.clone();
      jSSubstitution1.add((Object) jSTerm1);
      jSTerm0.addElement(jSSubstitution1);
      jSTerm1.removeAll(jSSubstitution1);
      JSJshopVars.semicolon = 1;
      JSJshopVars.semicolon = 1;
      StringReader stringReader0 = new StringReader("Tm\"hAvU0;]f6g{~\"|>t");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm2 = new JSTerm(streamTokenizer0);
      jSTerm2.lastElement();
      jSSubstitution1.setSize(1);
      JSSubstitution jSSubstitution2 = new JSSubstitution();
      jSTerm1.addElement((Object) null);
      JSSubstitution jSSubstitution3 = new JSSubstitution();
      JSTerm jSTerm3 = new JSTerm();
      JSTerm jSTerm4 = jSTerm1.applySubstitutionT(jSSubstitution0);
      JSSubstitution jSSubstitution4 = new JSSubstitution();
      jSTerm4.insertElementAt(jSSubstitution4, 1);
      jSTerm2.cloneT();
      JSSubstitution jSSubstitution5 = new JSSubstitution();
      JSTerm jSTerm5 = new JSTerm();
      jSTerm1.call();
      // Undeclared exception!
      try { 
        jSTerm4.cloneT();
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
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StringReader stringReader0 = new StringReader("WZ(laO*]RjEEO@xpr_");
      StringReader stringReader1 = new StringReader("7?j;|mLEI]#X7");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader1);
      stringReader0.read();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      jSTerm0.matches(jSTerm1);
      jSTerm1.toStr();
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
  //Test case number: 27
  /*Coverage entropy=1.0027182645175161
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      StringReader stringReader0 = new StringReader("%QIKu`WW/)HGWv6$Ja");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
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
  //Test case number: 28
  /*Coverage entropy=2.6156305770275505
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StringReader stringReader0 = new StringReader("%");
      StringReader stringReader1 = new StringReader("7?j;|mLEI]#X7");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader1);
      stringReader0.read();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = jSTerm0.matches(jSTerm1);
      assertEquals(1, jSSubstitution0.size());
      
      StringBuffer stringBuffer0 = jSTerm1.toStr();
      assertEquals("?%%% ", stringBuffer0.toString());
      
      JSTerm jSTerm2 = jSTerm0.standardizerTerm();
      assertFalse(jSTerm2.isVariable());
      assertFalse(jSTerm2.isEval());
      assertFalse(jSTerm2.isFunction());
      assertTrue(jSTerm2.isConstant());
      
      StringBuffer stringBuffer1 = jSTerm0.toStr();
      assertEquals("[7.0]", jSTerm0.toString());
      assertEquals(4, stringBuffer1.length());
      assertNotSame(jSTerm0, jSTerm2);
      
      JSTerm jSTerm3 = jSTerm1.cloneT();
      assertFalse(jSTerm3.isFunction());
      assertTrue(jSTerm3.isVariable());
      assertFalse(jSTerm3.isConstant());
      
      jSTerm1.print();
      assertEquals(1, jSTerm1.size());
      assertNotSame(jSTerm1, jSTerm3);
      assertFalse(jSTerm1.isFunction());
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.8288411561741995
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      System.setCurrentTimeMillis(2537L);
      JSTerm jSTerm0 = new JSTerm();
      Integer integer0 = new Integer(2121);
      jSTerm0.addElement(integer0);
      jSTerm0.isGround();
      jSTerm0.print();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSSubstitution0.setSize(2121);
      jSTerm0.addElement(integer0);
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      // Undeclared exception!
      try { 
        jSTerm0.applySubstitutionT(jSSubstitution0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.7666900269684687
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      System.setCurrentTimeMillis(2537L);
      JSTerm jSTerm0 = new JSTerm();
      Integer integer0 = new Integer(2121);
      jSTerm0.addElement(integer0);
      jSTerm0.isGround();
      JSJshopVars.equalT = 2121;
      jSTerm0.print();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSSubstitution0.setSize(2121);
      jSTerm0.addElement(integer0);
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      // Undeclared exception!
      try { 
        jSTerm0.call();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  /**
  //Test case number: 31
  /*Coverage entropy=2.350775770542846
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.isEmpty();
      jSTerm0.addElement(jSSubstitution0);
      jSTerm0.equals(jSTerm0);
      jSTerm0.isGround();
      JSTerm jSTerm1 = jSTerm0.cloneT();
      jSTerm0.toStr();
      JSTerm jSTerm2 = jSTerm0.call();
      jSTerm2.cloneT();
      // Undeclared exception!
      try { 
        jSTerm2.matches(jSTerm1);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // umd.cs.shop.JSSubstitution cannot be cast to java.lang.String
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.574679441748109
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      StringReader stringReader0 = new StringReader("WZ(laO*]RjEEO@xpr_");
      StringReader stringReader1 = new StringReader("7?j;|mLEI]#X7");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader1);
      stringReader0.read();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = jSTerm0.matches(jSTerm1);
      assertEquals(1, jSSubstitution0.size());
      
      JSTerm jSTerm2 = new JSTerm();
      boolean boolean0 = jSTerm1.equals(jSTerm0);
      assertFalse(boolean0);
      assertEquals("[?%%%]", jSTerm1.toString());
      assertFalse(jSTerm1.isEval());
      assertFalse(jSTerm1.isFunction());
  }

  /**
  //Test case number: 33
  /*Coverage entropy=2.0112424419724255
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StringReader stringReader0 = new StringReader("mZ(laO*NRjEE+@xpr_");
      StringReader stringReader1 = new StringReader("7?j;|mLEI]#X7");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader1);
      stringReader0.read();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) stringReader0;
      objectArray0[1] = (Object) jSTerm1;
      jSTerm0.toArray(objectArray0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm2 = jSTerm1.applySubstitutionT(jSSubstitution0);
      jSTerm2.cloneT();
      JSTerm jSTerm3 = jSTerm2.call();
      assertTrue(jSTerm3.isVariable());
      
      JSTerm jSTerm4 = jSTerm2.applySubstitutionT(jSSubstitution0);
      assertFalse(jSTerm4.isConstant());
      assertFalse(jSTerm4.isFunction());
      
      StringBuffer stringBuffer0 = jSTerm1.toStr();
      assertEquals("[?%%%]", jSTerm1.toString());
      assertNotSame(jSTerm1, jSTerm4);
      assertEquals(5, stringBuffer0.length());
      assertFalse(jSTerm1.isFunction());
  }

  /**
  //Test case number: 34
  /*Coverage entropy=1.9721037385162659
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      System.setCurrentTimeMillis(2537L);
      JSTerm jSTerm0 = new JSTerm();
      Integer integer0 = new Integer(2121);
      jSTerm0.addElement(integer0);
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) integer0;
      objectArray0[1] = (Object) jSTerm0;
      objectArray0[2] = (Object) integer0;
      objectArray0[3] = (Object) jSTerm0;
      jSTerm0.toArray(objectArray0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm1 = jSTerm0.applySubstitutionT(jSSubstitution0);
      assertTrue(jSTerm1.isFunction());
      assertFalse(jSTerm1.isEval());
      
      JSTerm jSTerm2 = jSTerm0.cloneT();
      assertFalse(jSTerm2.isVariable());
      
      JSTerm jSTerm3 = new JSTerm();
      JSSubstitution jSSubstitution1 = jSTerm3.matches(jSTerm2, jSSubstitution0);
      assertTrue(jSSubstitution1.fail());
      assertTrue(jSTerm2.isFunction());
      assertFalse(jSTerm2.isConstant());
  }

  /**
  //Test case number: 35
  /*Coverage entropy=2.1186492470699507
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.isEmpty();
      jSTerm0.addElement(jSSubstitution0);
      JSTerm jSTerm1 = jSTerm0.applySubstitutionT(jSSubstitution0);
      UnaryOperator.identity();
      jSTerm1.cloneT();
      jSTerm1.call();
      JSTerm jSTerm2 = new JSTerm();
      jSTerm2.ensureCapacity(45);
      StringReader stringReader0 = new StringReader("?");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm3 = null;
      try {
        jSTerm3 = new JSTerm(streamTokenizer0);
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
  /*Coverage entropy=0.24493002679463532
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      StringReader stringReader0 = new StringReader("WZ(laO*]RjEEO@xpZ+r_");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.nextToken();
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.clone();
      JSJshopVars.lessT = (-3);
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
  //Test case number: 37
  /*Coverage entropy=1.5949997094253325
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      StringReader stringReader0 = new StringReader("7?#3j;|mLEI]#X7");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = jSTerm1.matches(jSTerm0);
      jSTerm0.removeAll(jSTerm1);
      JSTerm jSTerm2 = jSTerm0.call();
      JSSubstitution jSSubstitution1 = jSTerm1.matches(jSTerm2, jSSubstitution0);
      assertFalse(jSTerm1.isFunction());
      assertFalse(jSTerm2.isEval());
      assertEquals("[?%%%]", jSTerm1.toString());
      assertFalse(jSSubstitution0.isEmpty());
      assertFalse(jSSubstitution1.fail());
      assertEquals(0, jSSubstitution1.size());
  }
}
