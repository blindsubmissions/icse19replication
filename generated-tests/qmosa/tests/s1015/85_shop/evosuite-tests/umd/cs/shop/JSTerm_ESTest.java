/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 13:55:02 GMT 2018
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
import java.util.ListIterator;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import umd.cs.shop.JSJshopVars;
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
      StringReader stringReader0 = new StringReader("R/Jx5dFko");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm();
      streamTokenizer0.ordinaryChars(0, 4);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.matches(jSTerm1, jSSubstitution0);
      boolean boolean0 = jSTerm1.isConstant();
      assertFalse(boolean0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      StringReader stringReader0 = new StringReader("");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      int int0 = (-505);
      streamTokenizer0.ordinaryChar((-505));
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
  //Test case number: 2
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringReader stringReader0 = new StringReader(")@4");
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
  //Test case number: 3
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringReader stringReader0 = new StringReader("pxP");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.print();
      assertFalse(jSTerm0.isEval());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.1639556568820564
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Fn>gOO-cA");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.makeVariable();
      stringReader0.ready();
      streamTokenizer0.ttype = (-1928);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.applySubstitutionT(jSSubstitution0);
      streamTokenizer0.resetSyntax();
      JSJshopVars.flagLevel = (-1928);
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
  //Test case number: 5
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.makeConstant();
      JSJshopVars.VarCounter = 2363;
      StringReader stringReader0 = new StringReader("yMCh&V-qu");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      UnaryOperator<String> unaryOperator0 = UnaryOperator.identity();
      char[] charArray0 = new char[3];
      charArray0[0] = 'k';
      charArray0[1] = 'p';
      charArray0[2] = 'U';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      stringReader0.read(charBuffer0);
      unaryOperator0.apply("yMCh&V-qu");
      streamTokenizer0.ordinaryChar(2065);
      jSTerm0.replaceAll(unaryOperator0);
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
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      StringReader stringReader0 = new StringReader("(.w<)49");
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
  //Test case number: 7
  /*Coverage entropy=1.4205719259467042
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.makeConstant();
      JSJshopVars.VarCounter = 2363;
      StringReader stringReader0 = new StringReader("yMCh&V-qu");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      UnaryOperator.identity();
      char[] charArray0 = new char[3];
      charArray0[0] = 'k';
      charArray0[1] = 'p';
      charArray0[2] = 'U';
      streamTokenizer0.ordinaryChars(2438, 2438);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
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
  //Test case number: 8
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      StringReader stringReader0 = new StringReader("(.w<)49");
      StringReader stringReader1 = new StringReader("yf3h>5Y(lh4`/|Jw?KB");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader1);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
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
  //Test case number: 9
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.makeConstant();
      JSJshopVars.VarCounter = 2363;
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
  //Test case number: 10
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      StringReader stringReader0 = new StringReader("(.w<)49");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm1 = new JSTerm();
      jSTerm1.clone();
      JSTerm jSTerm2 = new JSTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm3 = new JSTerm();
      jSTerm1.makeVariable();
      assertTrue(jSTerm1.isVariable());
      
      JSSubstitution jSSubstitution1 = jSTerm0.matches(jSTerm3);
      assertTrue(jSSubstitution1.fail());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.0888999753452235
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringReader stringReader0 = new StringReader("pxP");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm();
      jSTerm0.equals(jSTerm1);
      // Undeclared exception!
      try { 
        jSTerm0.removeElementAt((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: -1
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.0027182645175161
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.makeEval(false);
      assertFalse(jSTerm0.isEval());
      
      StringReader stringReader0 = new StringReader("9pW7W'N");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      Object object0 = new Object();
      JSTerm jSTerm2 = new JSTerm(streamTokenizer0);
      jSTerm2.removeAll(jSTerm1);
      jSTerm1.makeConstant();
      assertTrue(jSTerm1.isConstant());
      assertFalse(jSTerm1.isVariable());
      assertFalse(jSTerm1.isEval());
      assertFalse(jSTerm1.isFunction());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.73798344858705
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringReader stringReader0 = new StringReader("'");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.isGround();
      streamTokenizer0.slashStarComments(false);
      jSTerm0.isVariable();
      streamTokenizer0.commentChar(61);
      streamTokenizer0.slashSlashComments(false);
      streamTokenizer0.wordChars(1388, 1388);
      streamTokenizer0.ttype = 61;
      int int0 = (-858);
      jSTerm0.makeConstant();
      streamTokenizer0.quoteChar((-858));
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
  //Test case number: 14
  /*Coverage entropy=2.1006789212792607
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      StringReader stringReader0 = new StringReader("JE%TBnIH$?");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      JSJshopVars.apostrophe = (-1);
      jSTerm0.removeAll(jSTerm1);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm2 = jSTerm1.applySubstitutionT(jSSubstitution0);
      assertFalse(jSTerm2.isFunction());
      assertFalse(jSTerm2.isVariable());
      assertTrue(jSTerm2.isConstant());
      
      JSTerm jSTerm3 = jSTerm1.call();
      assertEquals(1, jSTerm3.capacity());
      
      boolean boolean0 = jSTerm1.isGround();
      assertTrue(boolean0);
      
      JSSubstitution jSSubstitution1 = jSTerm0.matches(jSTerm1, jSSubstitution0);
      assertFalse(jSTerm1.isEval());
      assertNotSame(jSTerm1, jSTerm2);
      assertTrue(jSSubstitution1.fail());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.45056120886630463
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSJshopVars.astherisk = 1755;
      StringReader stringReader0 = new StringReader("(Kz/{OfqszD|");
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
  //Test case number: 16
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
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
  //Test case number: 17
  /*Coverage entropy=2.3041437374610934
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSJshopVars.exclamation = 369;
      jSTerm0.add((Object) jSTerm0);
      JSTerm jSTerm1 = jSTerm0.standardizerTerm();
      jSTerm0.isGround();
      jSTerm0.removeElement("8afJzGujXwBlB?S");
      assertTrue(jSTerm0.equals((Object)jSTerm1));
      
      jSTerm0.removeElement(jSTerm0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSJshopVars.verticalL = 369;
      jSSubstitution0.add((Object) "8afJzGujXwBlB?S");
      jSSubstitution0.setSize(60);
      JSTerm jSTerm2 = jSTerm1.applySubstitutionT(jSSubstitution0);
      jSTerm2.toStr();
      jSTerm1.print();
      jSTerm0.matches(jSTerm1, jSSubstitution0);
      assertTrue(jSTerm1.isFunction());
      assertFalse(jSTerm1.isConstant());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.9273921261392744
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      StringReader stringReader0 = new StringReader("yH),Po[B");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm2 = new JSTerm();
      jSTerm2.makeConstant();
      streamTokenizer0.quoteChar(41);
      jSTerm0.parseList(streamTokenizer0);
      jSTerm1.standardizerTerm();
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
  //Test case number: 19
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StringReader stringReader0 = new StringReader("%}:*f}/ r)Xz}rmI`J");
      stringReader0.markSupported();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.pushBack();
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
  //Test case number: 20
  /*Coverage entropy=0.5004024235381879
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      StringReader stringReader0 = new StringReader("( ");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      stringReader0.markSupported();
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader0);
      streamTokenizer0.pushBack();
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
  //Test case number: 21
  /*Coverage entropy=2.2161022480912633
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) jSTerm0);
      JSTerm jSTerm1 = jSTerm0.standardizerTerm();
      boolean boolean0 = jSTerm1.isGround();
      jSTerm0.removeElement("8afJzGujXwBlB?S");
      jSTerm0.removeElement(jSTerm0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSSubstitution0.add((Object) "8afJzGujXwBlB?S");
      jSSubstitution0.setSize(33);
      JSTerm jSTerm2 = jSTerm1.applySubstitutionT(jSSubstitution0);
      StringBuffer stringBuffer0 = jSTerm2.toStr();
      assertTrue(jSTerm2.isFunction());
      assertEquals(5, stringBuffer0.length());
      
      JSTerm jSTerm3 = new JSTerm();
      boolean boolean1 = jSTerm3.equals(jSTerm1);
      assertNotSame(jSTerm1, jSTerm2);
      assertTrue(jSTerm1.isFunction());
      assertFalse(boolean1 == boolean0);
      assertFalse(jSTerm1.isEval());
      assertFalse(boolean1);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.8288411561741993
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSJshopVars.exclamation = 369;
      jSTerm0.add((Object) jSTerm0);
      JSTerm jSTerm1 = jSTerm0.standardizerTerm();
      jSTerm1.add((Object) "8afJzGujXwBlB?S");
      jSTerm0.removeElement((Object) null);
      // Undeclared exception!
      try { 
        jSTerm1.call();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.4750763110546947
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      int int0 = 33;
      jSTerm0.setSize(33);
      // Undeclared exception!
      try { 
        jSTerm0.standardizerTerm();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.5004024235381879
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) jSTerm0);
      StringReader stringReader0 = new StringReader("?U-nG,7J+vn}+ ");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.pushBack();
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      System.setCurrentTimeMillis(0L);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      int int0 = 35;
      jSTerm0.clone();
      jSTerm0.setSize(35);
      // Undeclared exception!
      try { 
        jSTerm0.toStr();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  /**
  //Test case number: 26
  /*Coverage entropy=2.242973226438147
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) jSTerm0);
      JSTerm jSTerm1 = jSTerm0.standardizerTerm();
      jSTerm0.removeElement("8afJzGujXwBlB?S");
      JSTerm jSTerm2 = jSTerm1.call();
      jSTerm1.add((Object) null);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm2.cloneT();
      StringReader stringReader0 = new StringReader("8afJzGujXwBlB?S");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm3 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      jSTerm2.applySubstitutionT(jSSubstitution0);
      JSSubstitution jSSubstitution2 = new JSSubstitution();
      jSTerm2.applySubstitutionT(jSSubstitution2);
      // Undeclared exception!
      try { 
        jSTerm1.cloneT();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  /**
  //Test case number: 27
  /*Coverage entropy=2.2873279346935895
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) "list");
      JSTerm jSTerm1 = jSTerm0.standardizerTerm();
      jSTerm0.removeElement(jSTerm1);
      jSTerm1.removeElement(jSTerm0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSSubstitution0.add((Object) null);
      JSTerm jSTerm2 = jSTerm1.applySubstitutionT(jSSubstitution0);
      jSSubstitution0.removeElement((Object) null);
      StringBuffer stringBuffer0 = jSTerm1.toStr();
      assertEquals("(list )", stringBuffer0.toString());
      
      jSTerm2.isGround();
      jSTerm2.matches(jSTerm1, jSSubstitution0);
      JSTerm jSTerm3 = jSTerm2.cloneT();
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      JSSubstitution jSSubstitution2 = jSTerm3.matches(jSTerm1, jSSubstitution1);
      assertNotSame(jSTerm3, jSTerm2);
      assertFalse(jSTerm1.isEval());
      assertNotSame(jSTerm2, jSTerm1);
      assertTrue(jSTerm3.isFunction());
      assertTrue(jSTerm2.isFunction());
      assertFalse(jSSubstitution2.fail());
      
      boolean boolean0 = jSTerm0.isGround();
      assertTrue(boolean0);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.9722469794234418
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) jSTerm0);
      JSTerm jSTerm1 = jSTerm0.standardizerTerm();
      jSTerm1.makeEval(true);
      jSTerm0.removeElement("8afJzGujXwBlB?S");
      // Undeclared exception!
      try { 
        jSTerm1.call();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // umd.cs.shop.JSTerm cannot be cast to java.lang.String
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  /**
  //Test case number: 29
  /*Coverage entropy=2.425639576350172
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) "list");
      JSTerm jSTerm1 = jSTerm0.standardizerTerm();
      jSTerm0.removeElement(jSTerm1);
      jSTerm1.removeElement(jSTerm0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSSubstitution0.add((Object) null);
      JSTerm jSTerm2 = jSTerm1.applySubstitutionT(jSSubstitution0);
      jSSubstitution0.removeElement((Object) null);
      boolean boolean0 = jSTerm2.isGround();
      JSSubstitution jSSubstitution1 = jSTerm2.matches(jSTerm1, jSSubstitution0);
      assertFalse(jSSubstitution1.fail());
      
      JSTerm jSTerm3 = jSTerm2.cloneT();
      jSTerm0.removeElement(jSTerm3);
      JSTerm jSTerm4 = jSTerm3.call();
      boolean boolean1 = jSTerm3.equals(jSTerm4);
      assertNotSame(jSTerm3, jSTerm2);
      assertNotSame(jSTerm4, jSTerm3);
      assertFalse(jSTerm1.isEval());
      assertTrue(boolean1 == boolean0);
      assertNotSame(jSTerm2, jSTerm1);
      assertTrue(jSTerm3.isFunction());
      assertTrue(jSTerm2.isFunction());
      assertEquals(10, jSTerm4.capacity());
      assertTrue(boolean1);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=2.1458417525947544
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) jSTerm0);
      jSTerm0.makeVariable();
      JSTerm jSTerm1 = jSTerm0.standardizerTerm();
      jSTerm1.makeEval(true);
      jSTerm0.removeElement("8afJzGujXwBlB?S");
      JSTerm jSTerm2 = jSTerm1.call();
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
  //Test case number: 31
  /*Coverage entropy=1.9269145052641095
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) jSTerm0);
      JSTerm jSTerm1 = jSTerm0.standardizerTerm();
      String string0 = "8afJzGujXwBlB?S";
      jSTerm0.removeElement("8afJzGujXwBlB?S");
      jSTerm1.call();
      JSJshopVars.verticalL = 722;
      jSTerm1.add((Object) null);
      Object object0 = jSTerm1.firstElement();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSSubstitution0.add(object0);
      JSTerm jSTerm2 = new JSTerm();
      // Undeclared exception!
      try { 
        jSTerm1.applySubstitutionT(jSSubstitution0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.7480673485460891
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) jSTerm0);
      JSTerm jSTerm1 = jSTerm0.standardizerTerm();
      jSTerm1.makeEval(true);
      jSTerm0.removeElement("8afJzGujXwBlB?S");
      jSTerm1.print();
      assertTrue(jSTerm1.isEval());
  }

  /**
  //Test case number: 33
  /*Coverage entropy=1.3038755293363848
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StringReader stringReader0 = new StringReader("2?;@@2.OX}KdL:,9");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      boolean boolean0 = jSTerm0.equals(jSTerm1);
      boolean boolean1 = jSTerm1.isGround();
      assertTrue(boolean1 == boolean0);
      assertFalse(jSTerm1.isFunction());
      assertFalse(jSTerm1.isEval());
      assertEquals("[?%%%]", jSTerm1.toString());
      assertFalse(boolean1);
  }

  /**
  //Test case number: 34
  /*Coverage entropy=1.69240886298655
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) jSTerm0);
      jSTerm0.standardizerTerm();
      StringReader stringReader0 = new StringReader("%q)+=!VSdwo/v~W/+");
      stringReader0.reset();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.pushBack();
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      System.setCurrentTimeMillis((-3591L));
      System.setCurrentTimeMillis((-1L));
  }

  /**
  //Test case number: 35
  /*Coverage entropy=1.8288411561741995
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) "list");
      JSTerm jSTerm1 = jSTerm0.standardizerTerm();
      JSTerm jSTerm2 = jSTerm0.cloneT();
      jSTerm0.removeElement(jSTerm1);
      jSTerm1.removeElement(jSTerm0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSSubstitution0.add((Object) null);
      jSTerm2.elementAt(0);
      jSTerm0.add((Object) "list");
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
  /*Coverage entropy=1.536722469437219
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      StringReader stringReader0 = new StringReader("equal");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = jSTerm0.call();
      streamTokenizer0.wordChars(108, 2610);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = jSTerm0.matches(jSTerm1, jSSubstitution0);
      assertFalse(jSSubstitution1.fail());
      assertNotSame(jSSubstitution1, jSSubstitution0);
      
      boolean boolean0 = jSTerm1.isGround();
      assertTrue(boolean0);
      assertFalse(jSTerm1.isEval());
  }

  /**
  //Test case number: 37
  /*Coverage entropy=2.059306028129147
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      StringReader stringReader0 = new StringReader("oyzgqap");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      jSSubstitution0.removeElement(jSTerm1);
      jSTerm0.add((Object) null);
      jSTerm0.makeVariable();
      JSTerm jSTerm2 = jSTerm0.cloneT();
      jSTerm2.removeElement("oyzgqap");
      jSTerm0.call();
      JSTerm jSTerm3 = new JSTerm();
      jSTerm3.equals(jSTerm1);
      jSTerm0.call();
      assertEquals(1, jSTerm0.size());
  }

  /**
  //Test case number: 38
  /*Coverage entropy=2.1281677116771607
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) jSTerm0);
      JSTerm jSTerm1 = jSTerm0.standardizerTerm();
      jSTerm0.removeElement("8afJzGujXwBlB?S");
      JSTerm jSTerm2 = jSTerm1.call();
      jSTerm1.add((Object) jSTerm0);
      jSTerm2.print();
      JSTerm jSTerm3 = (JSTerm)jSTerm2.firstElement();
      jSTerm2.remove((Object) jSTerm3);
      jSTerm2.removeAllElements();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSSubstitution0.add((Object) "8afJzGujXwBlB?S");
      jSSubstitution0.add((Object) jSTerm1);
      jSTerm1.isGround();
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
}
