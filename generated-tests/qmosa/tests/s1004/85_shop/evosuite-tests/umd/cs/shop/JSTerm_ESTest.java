/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 10:50:23 GMT 2018
 */

package umd.cs.shop;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.Reader;
import java.io.StreamTokenizer;
import java.io.StringReader;
import java.nio.CharBuffer;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;
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
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSJshopVars.rightPar = 46;
      JSTerm jSTerm1 = new JSTerm();
      jSTerm0.equals(jSTerm1);
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
  //Test case number: 1
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.isGround();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSSubstitution0.standarizerSubs();
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
  //Test case number: 2
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.isEval();
      jSTerm0.isFunction();
      jSTerm0.makeVariable();
      StringReader stringReader0 = new StringReader("a9hrx$l8B3j;m");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      stringReader0.ready();
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      jSTerm1.iterator();
      jSTerm0.listIterator();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSJshopVars.coma = (-1);
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
  //Test case number: 3
  /*Coverage entropy=1.0027182645175161
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      StringReader stringReader0 = new StringReader("88VC^-/O:p@6h;~~");
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
  //Test case number: 4
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSJshopVars.leftBrac = 0;
      jSTerm0.clone();
      StringReader stringReader0 = new StringReader("E$>621PZzR3ynS");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.wordChars(0, 0);
      streamTokenizer0.lowerCaseMode(false);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      jSTerm0.matches(jSTerm1);
      JSJshopVars.slash = (-2207);
      JSJshopVars.rightBrac = 178;
      jSTerm0.isEval();
      jSTerm0.makeEval(false);
      StringReader stringReader1 = new StringReader(" Term expected");
      CharBuffer charBuffer0 = CharBuffer.allocate(178);
      stringReader1.read(charBuffer0);
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader1);
      streamTokenizer1.ordinaryChars(14, 14);
      streamTokenizer1.ttype = 0;
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
  //Test case number: 5
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringReader stringReader0 = new StringReader("zzo,f0P");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.trimToSize();
      jSTerm0.print();
      jSTerm0.makeEval(false);
      jSTerm0.print();
      jSTerm0.print();
      assertFalse(jSTerm0.isEval());
      assertTrue(jSTerm0.isConstant());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(. o-ksGUe8k");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      int int0 = (-431);
      streamTokenizer0.ordinaryChar((-431));
      streamTokenizer0.nval = (double) (-431);
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
  //Test case number: 7
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringReader stringReader0 = new StringReader(";l(({6I9/\"m|h[$ _v");
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
  //Test case number: 8
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.isGround();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = jSSubstitution0.standarizerSubs();
      jSSubstitution1.removeAllElements();
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
  //Test case number: 9
  /*Coverage entropy=1.635743495231497
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSJshopVars.rightPar = 46;
      JSTerm jSTerm1 = new JSTerm();
      boolean boolean0 = jSTerm0.equals(jSTerm1);
      assertFalse(boolean0);
      
      JSTerm jSTerm2 = new JSTerm();
      jSTerm2.iterator();
      jSTerm1.isConstant();
      StringReader stringReader0 = new StringReader(" expected");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm3 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm4 = jSTerm3.call();
      assertFalse(jSTerm4.isEval());
      assertTrue(jSTerm4.isConstant());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.1595888143086257
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      StringReader stringReader0 = new StringReader("BeA ~y-3[/T~wY{m*I");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader0);
      streamTokenizer1.ordinaryChar((-74));
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      jSTerm0.clone();
      jSTerm1.isGround();
      jSTerm1.isFunction();
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
  //Test case number: 11
  /*Coverage entropy=1.666332585328325
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.equals(jSTerm0);
      jSTerm0.makeConstant();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSSubstitution0.removeAllElements();
      // Undeclared exception!
      try { 
        jSTerm0.matches(jSTerm0, jSSubstitution0);
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
  /*Coverage entropy=1.9730014063936125
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSJshopVars.rightPar = 46;
      JSTerm jSTerm1 = new JSTerm();
      jSTerm0.equals(jSTerm1);
      jSTerm0.makeConstant();
      jSTerm1.equals(jSTerm0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSSubstitution0.removeAllElements();
      jSTerm0.matches(jSTerm1, jSSubstitution0);
      jSTerm0.equals(jSTerm1);
      boolean boolean0 = jSTerm0.isGround();
      assertTrue(jSTerm0.isConstant());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.2161022480912633
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      StringReader stringReader0 = new StringReader("JSUtil>>stringTokenizer is returning %%%");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.ordinaryChar((-431));
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm2 = new JSTerm();
      jSTerm2.clone();
      jSTerm2.isGround();
      jSTerm2.isFunction();
      jSTerm2.makeFunction();
      jSTerm0.makeEval(false);
      stringReader0.reset();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSSubstitution0.assignFailure();
      jSTerm1.applySubstitutionT(jSSubstitution0);
      JSTerm jSTerm3 = new JSTerm();
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm4 = new JSTerm(streamTokenizer1);
      // Undeclared exception!
      try { 
        jSTerm3.toStr();
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
  /*Coverage entropy=2.3114234446919735
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringReader stringReader0 = new StringReader("a9hrx$l8B3j;m");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      stringReader0.ready();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.iterator();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSJshopVars.coma = (-1);
      jSTerm0.makeFunction();
      stringReader0.reset();
      jSSubstitution0.assignFailure();
      JSTerm jSTerm1 = jSTerm0.applySubstitutionT(jSSubstitution0);
      jSTerm0.toStr();
      jSTerm1.matches(jSTerm0, jSSubstitution0);
      jSTerm1.toStr();
      jSTerm1.makeConstant();
      assertFalse(jSTerm0.isConstant());
      
      JSTerm jSTerm2 = new JSTerm(streamTokenizer0);
      assertFalse(jSTerm2.isEval());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringReader stringReader0 = new StringReader("a9hrx$l8B3j;m");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.ttype = (-185);
      stringReader0.ready();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSJshopVars.lessT = (-2349);
      jSTerm0.iterator();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSJshopVars.coma = (-1);
      jSTerm0.makeFunction();
      stringReader0.reset();
      jSTerm0.print();
      jSTerm0.print();
      assertTrue(jSTerm0.isFunction());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.1639556568820564
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.isEval();
      jSTerm0.isFunction();
      jSTerm0.makeVariable();
      StringReader stringReader0 = new StringReader("a9hrx$l8B3j;m");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      stringReader0.ready();
      jSTerm0.iterator();
      jSTerm0.listIterator();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm1 = new JSTerm();
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      JSTerm jSTerm2 = new JSTerm();
      jSTerm2.makeFunction();
      stringReader0.reset();
      jSSubstitution0.assignFailure();
      // Undeclared exception!
      try { 
        jSTerm0.applySubstitutionT(jSSubstitution1);
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
  /*Coverage entropy=2.0262296229952916
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSJshopVars.slash = (-17);
      jSTerm0.iterator();
      jSTerm0.isGround();
      jSTerm0.isConstant();
      StringReader stringReader0 = new StringReader(")$_uAK#-23znx");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      jSTerm0.parseList(streamTokenizer0);
      JSJshopVars.leftBrac = 41;
      System.setCurrentTimeMillis(0L);
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
  //Test case number: 18
  /*Coverage entropy=1.9356005054539458
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StringReader stringReader0 = new StringReader("a9hrx$l8B3j;m");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.ttype = (-185);
      stringReader0.ready();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSJshopVars.lessT = (-2349);
      jSTerm0.iterator();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      jSTerm0.makeFunction();
      stringReader0.ready();
      StringReader stringReader1 = new StringReader(">nw)u");
      stringReader1.reset();
      jSTerm0.cloneT();
      jSTerm0.standardizerTerm();
      assertTrue(jSTerm0.isFunction());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.5977295736436044
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StringReader stringReader0 = new StringReader("a9hrx$l8B3j;m");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      stringReader0.ready();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.iterator();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      stringReader0.ready();
      jSTerm0.makeFunction();
      stringReader0.reset();
      jSTerm0.isConstant();
      jSTerm0.call();
      assertTrue(jSTerm0.isFunction());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.7721393884375285
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.isEval();
      jSTerm0.isFunction();
      jSTerm0.makeVariable();
      StringReader stringReader0 = new StringReader("a9hrx$l8B3j;m");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      stringReader0.ready();
      jSTerm0.iterator();
      jSTerm0.listIterator();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm1 = new JSTerm();
      StringReader stringReader1 = new StringReader("a9hrx$l8B3j;m");
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader0);
      streamTokenizer0.resetSyntax();
      JSTerm jSTerm2 = new JSTerm(streamTokenizer1);
      boolean boolean0 = jSTerm0.isGround();
      assertTrue(jSTerm0.isVariable());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = " (s&Q\"|+";
      StringReader stringReader0 = new StringReader(" (s&Q\"|+");
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
  //Test case number: 22
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      StringReader stringReader0 = new StringReader("+");
      StringReader stringReader1 = new StringReader("?");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader1);
      streamTokenizer0.lowerCaseMode(false);
      streamTokenizer0.resetSyntax();
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
  /*Coverage entropy=1.5867847075280475
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StringReader stringReader0 = new StringReader("a9hrx$l8B3j;m");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      stringReader0.ready();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.iterator();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      stringReader0.reset();
      jSSubstitution0.assignFailure();
      jSTerm0.toStr();
      JSSubstitution jSSubstitution1 = jSTerm0.matches(jSTerm0, jSSubstitution0);
      jSTerm0.makeConstant();
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      // Undeclared exception!
      try { 
        jSTerm1.addAll((-1), (Collection) jSSubstitution1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: -1
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=2.0173636234482513
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StringReader stringReader0 = new StringReader("a9hrx$l8B3j;m");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      stringReader0.ready();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.iterator();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      stringReader0.reset();
      jSSubstitution0.assignFailure();
      jSTerm0.toStr();
      jSTerm0.matches(jSTerm0, jSSubstitution0);
      jSTerm0.makeVariable();
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      jSTerm0.equals(jSTerm1);
      jSTerm1.isGround();
      System.setCurrentTimeMillis((-1));
      jSTerm0.cloneT();
      assertTrue(jSTerm0.isVariable());
  }

  /**
  //Test case number: 25
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StringReader stringReader0 = new StringReader("a9hrx$l8B3j;m");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.commentChar((-185));
      streamTokenizer0.ttype = (-185);
      stringReader0.ready();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      streamTokenizer0.nextToken();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      stringReader0.ready();
      StringReader stringReader1 = new StringReader(">nw)u");
      stringReader0.reset();
      JSTerm jSTerm1 = jSTerm0.cloneT();
      JSTerm jSTerm2 = jSTerm0.standardizerTerm();
      assertEquals("[%%%]", jSTerm0.toString());
      
      boolean boolean0 = jSTerm2.equals(jSTerm1);
      assertNotSame(jSTerm1, jSTerm0);
      assertNotSame(jSTerm2, jSTerm0);
      assertTrue(boolean0);
      assertFalse(jSTerm2.isEval());
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.5810937501718236
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.equals(jSTerm0);
      StringReader stringReader0 = new StringReader("%");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm1 = null;
      try {
        jSTerm1 = new JSTerm(streamTokenizer1);
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
  /*Coverage entropy=1.666332585328325
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSSubstitution0.add((Object) jSTerm0);
      jSSubstitution0.add((Object) jSTerm0);
      jSTerm0.remove((Object) jSSubstitution0);
      JSJshopVars.colon = 1473;
      jSTerm0.removeAll(jSSubstitution0);
      JSTerm jSTerm1 = new JSTerm();
      jSTerm1.addAll((Collection) jSSubstitution0);
      JSJshopVars.coma = 40;
      jSTerm1.makeFunction();
      jSTerm0.equals(jSTerm1);
      JSJshopVars.verticalL = 40;
      jSTerm0.addAll((Collection) jSTerm1);
      // Undeclared exception!
      try { 
        jSTerm1.print();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 28
  /*Coverage entropy=2.023775289509995
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StringReader stringReader0 = new StringReader("a9hrx$l8B3j;m");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      stringReader0.ready();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.iterator();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      stringReader0.reset();
      jSSubstitution0.assignFailure();
      jSTerm0.toStr();
      jSTerm0.matches(jSTerm0, jSSubstitution0);
      jSTerm0.makeVariable();
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      jSTerm0.equals(jSTerm1);
      jSTerm1.isGround();
      System.setCurrentTimeMillis((-1));
      jSTerm0.call();
      assertFalse(jSTerm0.isConstant());
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.8018924006588724
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSSubstitution0.add((Object) jSTerm0);
      jSSubstitution0.add((Object) jSTerm0);
      jSTerm0.remove((Object) jSSubstitution0);
      int int0 = 1473;
      JSJshopVars.colon = 1473;
      jSTerm0.removeAll(jSSubstitution0);
      JSTerm jSTerm1 = new JSTerm();
      jSTerm1.addAll((Collection) jSSubstitution0);
      JSJshopVars.coma = 40;
      jSTerm1.makeFunction();
      jSTerm0.equals(jSTerm1);
      JSJshopVars.verticalL = 40;
      jSTerm0.addAll((Collection) jSTerm1);
      // Undeclared exception!
      try { 
        jSTerm0.call();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  /**
  //Test case number: 30
  /*Coverage entropy=2.6156305770275505
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StringReader stringReader0 = new StringReader("a9hrx$l8B3j;m");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      stringReader0.ready();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.iterator();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      stringReader0.reset();
      jSSubstitution0.assignFailure();
      jSTerm0.toStr();
      jSTerm0.matches(jSTerm0, jSSubstitution0);
      jSTerm0.makeVariable();
      jSTerm0.equals(jSTerm0);
      jSTerm0.isGround();
      jSTerm0.call();
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
  //Test case number: 31
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
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
  //Test case number: 32
  /*Coverage entropy=1.807631656191928
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      StringReader stringReader0 = new StringReader("1ZQ$qn?]|b%JM&PI6BK");
      stringReader0.markSupported();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.call();
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm1.print();
      jSTerm0.matches(jSTerm1, jSSubstitution0);
      streamTokenizer0.nextToken();
      jSTerm0.isGround();
      JSTerm jSTerm2 = new JSTerm();
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
  //Test case number: 33
  /*Coverage entropy=1.781618808453643
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StringReader stringReader0 = new StringReader("a9hrx$l8B3j;m");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.ttype = (-185);
      stringReader0.ready();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSJshopVars.lessT = (-2349);
      jSTerm0.iterator();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSJshopVars.coma = (-1);
      jSTerm0.makeFunction();
      streamTokenizer0.ttype = 1890;
      stringReader0.reset();
      JSTerm jSTerm1 = jSTerm0.cloneT();
      boolean boolean0 = jSTerm0.equals(jSTerm1);
      assertTrue(jSTerm0.isFunction());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 34
  /*Coverage entropy=1.0027182645175161
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSSubstitution0.add((Object) jSTerm0);
      jSSubstitution0.add((Object) jSTerm0);
      StringReader stringReader0 = new StringReader("%K8kIk1y^G@PgTe.R)");
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
  //Test case number: 35
  /*Coverage entropy=1.568441954012883
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      StringReader stringReader0 = new StringReader("a9hrx$l8B3j;m");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      StringReader stringReader1 = new StringReader("cK*=Z)~;:J");
      stringReader1.ready();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      Object[] objectArray0 = new Object[8];
      objectArray0[0] = (Object) "a9hrx$l8B3j;m";
      objectArray0[1] = (Object) "cK*=Z)~;:J";
      objectArray0[2] = (Object) "a9hrx$l8B3j;m";
      objectArray0[1] = (Object) stringReader1;
      objectArray0[4] = (Object) stringReader0;
      objectArray0[5] = (Object) "a9hrx$l8B3j;m";
      objectArray0[6] = (Object) stringReader0;
      objectArray0[7] = (Object) stringReader0;
      jSTerm0.toArray(objectArray0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.makeFunction();
      JSTerm jSTerm1 = new JSTerm();
      jSTerm1.matches(jSTerm0, (JSSubstitution) null);
      System.setCurrentTimeMillis(0L);
      jSTerm0.matches(jSTerm1, (JSSubstitution) null);
      assertTrue(jSTerm0.isFunction());
  }

  /**
  //Test case number: 36
  /*Coverage entropy=1.7481554572476763
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.makeVariable();
      jSTerm0.iterator();
      jSTerm0.listIterator();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm1 = new JSTerm();
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
  //Test case number: 37
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      StringReader stringReader0 = new StringReader("a9hrb$l8B)j;m");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      StringReader stringReader1 = new StringReader("cK*=Z)~;:J");
      stringReader1.ready();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      Iterator iterator0 = jSTerm0.iterator();
      Object[] objectArray0 = new Object[10];
      objectArray0[6] = (Object) "a9hrb$l8B)j;m";
      jSTerm0.add((Object) iterator0);
      objectArray0[1] = (Object) "cK*=Z)~;:J";
      objectArray0[2] = (Object) "a9hrb$l8B)j;m";
      stringReader1.close();
      streamTokenizer0.slashStarComments(true);
      objectArray0[3] = (Object) stringReader1;
      objectArray0[4] = (Object) stringReader0;
      objectArray0[5] = (Object) "a9hrb$l8B)j;m";
      objectArray0[6] = (Object) stringReader0;
      jSTerm0.toArray(objectArray0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.makeFunction();
      stringReader0.reset();
      jSSubstitution0.assignFailure();
      // Undeclared exception!
      try { 
        jSTerm0.toStr();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.Vector$Itr cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  /**
  //Test case number: 38
  /*Coverage entropy=1.839789586841252
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSSubstitution0.add((Object) jSTerm0);
      jSTerm0.remove((Object) jSSubstitution0);
      int int0 = 1501;
      JSJshopVars.colon = 1501;
      jSTerm0.isFunction();
      JSTerm jSTerm1 = new JSTerm();
      jSTerm1.addAll((Collection) jSSubstitution0);
      JSJshopVars.coma = 40;
      jSTerm1.makeFunction();
      jSTerm0.equals(jSTerm1);
      jSTerm0.setSize(1501);
      JSJshopVars.verticalL = 40;
      jSTerm0.addAll((Collection) jSTerm1);
      jSTerm1.print();
      // Undeclared exception!
      try { 
        jSTerm0.isGround();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  /**
  //Test case number: 39
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.makeVariable();
      jSTerm0.iterator();
      jSTerm0.listIterator();
      JSTerm jSTerm1 = new JSTerm();
      jSTerm0.equals(jSTerm1);
      long long0 = (-1L);
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
  //Test case number: 40
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(. o-ssGUe8k");
      stringReader0.ready();
      stringReader0.reset();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.lowerCaseMode(false);
      int int0 = 2143;
      streamTokenizer0.wordChars(62, 2143);
      stringReader0.markSupported();
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
}
