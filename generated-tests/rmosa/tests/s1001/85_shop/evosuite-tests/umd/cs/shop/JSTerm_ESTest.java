/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 05:29:12 GMT 2018
 */

package umd.cs.shop;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StreamTokenizer;
import java.io.StringReader;
import java.nio.CharBuffer;
import java.util.ListIterator;
import java.util.function.Predicate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.util.SystemInUtil;
import org.junit.runner.RunWith;
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
      StringReader stringReader0 = new StringReader(">=");
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
  /*Coverage entropy=0.5875009311062074
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SystemInUtil.addInputLine("% ");
      StringReader stringReader0 = new StringReader("(h)'-4 \"");
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
  //Test case number: 2
  /*Coverage entropy=0.9035282968222415
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      System.setCurrentTimeMillis((-2037L));
      SystemInUtil.addInputLine("failed substitution");
      StringReader stringReader0 = new StringReader("(X)W-4M/\"");
      stringReader0.skip((-2037L));
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      assertFalse(jSTerm1.isEval());
      
      JSTerm jSTerm2 = jSTerm0.call();
      assertNotSame(jSTerm2, jSTerm0);
      assertEquals(10, jSTerm2.capacity());
      assertTrue(jSTerm2.isFunction());
      assertFalse(jSTerm2.isConstant());
      assertFalse(jSTerm2.isVariable());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.2145591551764051
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      System.setCurrentTimeMillis((-2037L));
      SystemInUtil.addInputLine("failed substitution");
      StringReader stringReader0 = new StringReader("(X)W-4M/\"");
      stringReader0.skip((-2037L));
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.makeConstant();
      System.setCurrentTimeMillis((-2037L));
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.771623955677366
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringReader stringReader0 = new StringReader("C.JE{aj");
      stringReader0.ready();
      stringReader0.skip(1L);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.nextToken();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.makeFunction();
      jSSubstitution0.add((Object) jSTerm0);
      stringReader0.markSupported();
      jSTerm0.retainAll(jSTerm0);
      jSTerm0.makeEval(false);
      ListIterator listIterator0 = jSTerm0.listIterator();
      jSTerm0.isFunction();
      jSTerm0.insertElementAt(listIterator0, 0);
      // Undeclared exception!
      try { 
        jSTerm0.standardizerTerm();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.777209681786442
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      System.setCurrentTimeMillis((-2037L));
      SystemInUtil.addInputLine("failed substitution");
      StringReader stringReader0 = new StringReader("(X)W-4M/\"");
      stringReader0.skip((-2037L));
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      JSJshopVars.equalT = 2398;
      boolean boolean0 = jSTerm0.equals(jSTerm1);
      assertFalse(boolean0);
      
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = jSTerm0.matches(jSTerm1, jSSubstitution0);
      assertTrue(jSSubstitution1.fail());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.3445982481028228
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      System.setCurrentTimeMillis((-2037L));
      SystemInUtil.addInputLine("failed substitution");
      StringReader stringReader0 = new StringReader("(X)W-4M/\"");
      stringReader0.skip((-2037L));
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSJshopVars.plus = 898;
      StringReader stringReader1 = new StringReader("(X)W-4M/\"");
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      System.setCurrentTimeMillis(589L);
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
  /*Coverage entropy=1.0746142917293842
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(fCqr");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.nextToken();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.makeVariable();
      JSTerm jSTerm1 = new JSTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.matches(jSTerm1, jSSubstitution0);
      assertTrue(jSTerm0.isVariable());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?`h oiKJ};$Km$f)@BT");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.toString();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSSubstitution0.add((Object) streamTokenizer0);
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm((String) null);
      // Undeclared exception!
      try { 
        jSTerm0.applySubstitutionT(jSSubstitution0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.io.StreamTokenizer cannot be cast to umd.cs.shop.JSPairVarTerm
         //
         verifyException("umd.cs.shop.JSSubstitution", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.5216415112269661
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      long long0 = (-2037L);
      System.setCurrentTimeMillis((-2037L));
      SystemInUtil.addInputLine("failed substitution");
      StringReader stringReader0 = new StringReader("(X)W-4M/\"");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSJshopVars.percent = 0;
      JSTerm jSTerm1 = jSTerm0.call();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.applySubstitutionT(jSSubstitution0);
      jSTerm1.call();
      // Undeclared exception!
      try { 
        CharBuffer.wrap((CharSequence) null, (-1362), (-3664));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.StringCharBuffer", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.42584844923858145
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringReader stringReader0 = new StringReader("iedicateforDprint(c 0 eloment");
      JSTerm jSTerm0 = new JSTerm();
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
  //Test case number: 11
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringReader stringReader0 = new StringReader("u8iBxbf-6");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.makeFunction();
      streamTokenizer0.whitespaceChars((-1), (-1));
      jSTerm0.toStr();
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
  //Test case number: 12
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SystemInUtil.addInputLine("failed substitution");
      StringReader stringReader0 = new StringReader("(X)W-4M/\"");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      boolean boolean0 = jSTerm1.equals(jSTerm0);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.makeConstant();
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
  //Test case number: 14
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?`hU oiKJ};$Km$f)@BT");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      assertFalse(jSTerm0.isConstant());
      assertTrue(jSTerm0.isVariable());
      assertFalse(jSTerm0.isFunction());
      assertEquals("[?`hU]", jSTerm0.toString());
      
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      StringBuffer stringBuffer0 = jSTerm1.toStr();
      assertEquals(9, stringBuffer0.length());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?`h oiKJ};$Km$f)@BT");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      StringBuffer stringBuffer0 = jSTerm0.toStr();
      assertFalse(jSTerm0.isFunction());
      assertFalse(jSTerm0.isConstant());
      assertEquals(4, stringBuffer0.length());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.1923348127712443
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StringReader stringReader0 = new StringReader("iredicateforDprint(: 0 eloment");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.nextToken();
      char[] charArray0 = new char[7];
      stringReader0.read(charArray0);
      JSTerm jSTerm0 = new JSTerm();
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
  //Test case number: 17
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(<");
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
  //Test case number: 18
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StringReader stringReader0 = new StringReader("%gkP\"M");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      assertEquals("[%gkP]", jSTerm0.toString());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StringReader stringReader0 = new StringReader("%%%");
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
  //Test case number: 20
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
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
  //Test case number: 21
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
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
  //Test case number: 22
  /*Coverage entropy=1.6766794227626187
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StringReader stringReader0 = new StringReader("u8iBxbf-6");
      stringReader0.read();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.makeFunction();
      jSTerm0.lastElement();
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      streamTokenizer0.whitespaceChars((-393), 60);
      jSSubstitution0.add((Object) stringReader0);
      JSTerm jSTerm1 = jSTerm0.cloneT();
      jSTerm1.containsAll(jSSubstitution1);
      JSTerm jSTerm2 = new JSTerm();
      JSSubstitution jSSubstitution2 = new JSSubstitution();
      jSTerm0.matches(jSTerm1, jSSubstitution1);
      jSTerm0.matches(jSTerm2, jSSubstitution1);
      JSSubstitution jSSubstitution3 = jSTerm0.matches(jSTerm1, jSSubstitution0);
      jSTerm2.matches(jSTerm0, jSSubstitution3);
      assertTrue(jSTerm0.isFunction());
      assertFalse(jSSubstitution3.fail());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?`h oiKJ};$Km$f)@BT");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      stringReader0.ready();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.isConstant();
      jSTerm0.spliterator();
      jSTerm0.isEmpty();
      JSTerm jSTerm1 = jSTerm0.cloneT();
      assertTrue(jSTerm1.isVariable());
      assertFalse(jSTerm0.isFunction());
      assertEquals("[?`h]", jSTerm1.toString());
      assertFalse(jSTerm1.isFunction());
      assertNotSame(jSTerm1, jSTerm0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=2.033812339488579
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SystemInUtil.addInputLine("?`h oiKJ};$Km$f)@BT");
      StringReader stringReader0 = new StringReader("?`h oiKJ};$Km$f)@BT");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      stringReader0.ready();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.isConstant();
      jSTerm0.spliterator();
      jSTerm0.makeEval(true);
      JSTerm jSTerm1 = jSTerm0.parseList(streamTokenizer0);
      jSTerm1.trimToSize();
      jSTerm0.makeFunction();
      jSTerm1.isGround();
      JSTerm jSTerm2 = jSTerm1.cloneT();
      jSTerm1.equals(jSTerm2);
      System.setCurrentTimeMillis(41);
      jSTerm0.equals(jSTerm1);
      boolean boolean0 = jSTerm2.equals(jSTerm1);
      assertTrue(jSTerm0.isEval());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?`h oiKJ};$Km$f)@BT");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm0 = new JSTerm();
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      assertFalse(jSTerm1.isConstant());
      
      JSSubstitution jSSubstitution1 = jSTerm0.matches(jSTerm1, jSSubstitution0);
      JSSubstitution jSSubstitution2 = jSTerm0.matches(jSTerm1, jSSubstitution1);
      assertEquals("[?`h]", jSTerm1.toString());
      assertFalse(jSTerm1.isFunction());
      assertEquals(1, jSSubstitution2.size());
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.04138000510499
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(h)'-4 \"");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm();
      boolean boolean0 = jSTerm0.equals(jSTerm1);
      boolean boolean1 = jSTerm1.equals(jSTerm0);
      assertTrue(boolean1 == boolean0);
      
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = jSTerm0.matches(jSTerm1, jSSubstitution0);
      assertTrue(jSSubstitution1.fail());
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.178580294980779
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      long long0 = (-2037L);
      System.setCurrentTimeMillis((-2037L));
      StringReader stringReader0 = new StringReader("(X)W-4M/\"");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.equals(jSTerm0);
      SystemInUtil.addInputLine("(X)W-4M/\"");
      System.setCurrentTimeMillis((-1906L));
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      // Undeclared exception!
      try { 
        jSTerm0.matches((JSTerm) null, jSSubstitution0);
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?`h oiKJ};$Km$f)@BT");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.whitespaceChars((-4), (-4));
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.print();
      assertTrue(jSTerm0.isVariable());
      assertEquals("[?`h]", jSTerm0.toString());
      assertFalse(jSTerm0.isFunction());
  }

  /**
  //Test case number: 29
  /*Coverage entropy=0.8981370031878679
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StringReader stringReader0 = new StringReader("u8iBxbf-6");
      stringReader0.read();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.makeFunction();
      jSTerm0.lastElement();
      streamTokenizer0.nval = (double) 117;
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      jSTerm0.print();
      assertTrue(jSTerm0.isFunction());
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.963908339870089
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StringReader stringReader0 = new StringReader("C.JE{aj");
      StringReader stringReader1 = new StringReader("WCM*Gd]t\"|,R");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      StringReader stringReader2 = new StringReader("C.JE{aj");
      stringReader2.markSupported();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      stringReader2.ready();
      char[] charArray0 = new char[7];
      charArray0[0] = 'P';
      charArray0[3] = 'I';
      charArray0[4] = 'I';
      charArray0[5] = 'W';
      charArray0[6] = 'P';
      jSTerm0.makeFunction();
      JSTerm jSTerm1 = jSTerm0.cloneT();
      jSTerm1.call();
      System.setCurrentTimeMillis((-1));
      jSTerm0.standardizerTerm();
      assertFalse(jSTerm0.isConstant());
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      StringReader stringReader0 = new StringReader("u8iBxbf-6");
      stringReader0.read();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      streamTokenizer0.whitespaceChars(3204, 3204);
      jSTerm0.makeFunction();
      jSTerm0.toString();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      jSTerm0.add((Object) jSSubstitution1);
      jSTerm0.isEmpty();
      // Undeclared exception!
      try { 
        jSTerm0.cloneT();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // umd.cs.shop.JSSubstitution cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      StringReader stringReader0 = new StringReader("u8iBxbf-6");
      stringReader0.read();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.makeFunction();
      streamTokenizer0.nval = (double) 117;
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.setSize(123);
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
  //Test case number: 33
  /*Coverage entropy=2.0756734225039306
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?`h oiKJ};$Km$f)@BT");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      stringReader0.ready();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.isConstant();
      jSTerm0.spliterator();
      jSTerm0.makeEval(true);
      JSTerm jSTerm1 = jSTerm0.parseList(streamTokenizer0);
      jSTerm1.isConstant();
      jSTerm0.iterator();
      SystemInUtil.addInputLine("?`h oiKJ};$Km$f)@BT");
      streamTokenizer0.parseNumbers();
      jSTerm0.equals(jSTerm1);
      jSTerm1.print();
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
  //Test case number: 34
  /*Coverage entropy=1.9962088260642754
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?`h oiKJ};$Km$f)@BT");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      stringReader0.ready();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSJshopVars.apostrophe = 32;
      jSTerm0.isConstant();
      jSTerm0.makeEval(true);
      JSTerm jSTerm1 = jSTerm0.parseList(streamTokenizer0);
      JSTerm jSTerm2 = jSTerm1.cloneT();
      JSTerm jSTerm3 = new JSTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSSubstitution0.addElement(jSTerm2);
      jSTerm2.matches(jSTerm1, jSSubstitution0);
      SystemInUtil.addInputLine((String) null);
      JSSubstitution jSSubstitution1 = jSTerm2.matches(jSTerm3, jSSubstitution0);
      jSTerm1.applySubstitutionT(jSSubstitution1);
      jSTerm3.matches(jSTerm2, jSSubstitution0);
      // Undeclared exception!
      try { 
        jSTerm3.parseList(streamTokenizer0);
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
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?`h oiKJ};$Km$f)@BT");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.spliterator();
      JSTerm jSTerm1 = jSTerm0.standardizerTerm();
      assertFalse(jSTerm1.isFunction());
      assertFalse(jSTerm1.isEval());
      assertFalse(jSTerm0.isFunction());
      assertEquals("[?`h0]", jSTerm1.toString());
      assertTrue(jSTerm1.isVariable());
  }

  /**
  //Test case number: 36
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      StringReader stringReader0 = new StringReader(" Expecting word as term");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = jSTerm0.matches(jSTerm1, jSSubstitution0);
      assertTrue(jSSubstitution1.fail());
  }

  /**
  //Test case number: 37
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?`h oiKJ};$Km$f)@BT");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution1 = jSTerm0.matches(jSTerm1, jSSubstitution0);
      JSSubstitution jSSubstitution2 = jSTerm0.matches(jSTerm1, jSSubstitution1);
      assertNotSame(jSSubstitution2, jSSubstitution0);
      assertFalse(jSTerm0.isFunction());
      assertEquals("[?`h]", jSTerm0.toString());
      assertFalse(jSSubstitution2.fail());
      assertTrue(jSSubstitution2.equals((Object)jSSubstitution0));
  }

  /**
  //Test case number: 38
  /*Coverage entropy=1.8943120247335319
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?`h oiKJ};$Km$f)@BT");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      stringReader0.ready();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSJshopVars.apostrophe = 32;
      jSTerm0.isConstant();
      jSTerm0.makeEval(true);
      JSTerm jSTerm1 = jSTerm0.parseList(streamTokenizer0);
      jSTerm1.makeEval(true);
      SystemInUtil.addInputLine((String) null);
      jSTerm1.call();
      streamTokenizer0.nextToken();
      JSTerm jSTerm2 = new JSTerm(streamTokenizer0);
      System.setCurrentTimeMillis(1L);
      jSTerm1.call();
      jSTerm0.call();
      assertTrue(jSTerm0.isEval());
  }

  /**
  //Test case number: 39
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?`h oiKJ};$Km$f)@BT");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.spliterator();
      JSTerm jSTerm1 = jSTerm0.parseList(streamTokenizer0);
      jSTerm1.isGround();
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
  //Test case number: 40
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      StringReader stringReader0 = new StringReader("u8iBxbf-6");
      stringReader0.read();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.makeFunction();
      jSTerm0.lastElement();
      jSTerm0.makeEval(true);
      streamTokenizer0.nval = (double) 117;
      jSTerm0.setSize(123);
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
  //Test case number: 41
  /*Coverage entropy=0.8981370031878679
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      StringReader stringReader0 = new StringReader("u8iBxbf-6");
      stringReader0.read();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.makeFunction();
      jSTerm0.lastElement();
      streamTokenizer0.nval = (double) 117;
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      jSTerm0.setSize(123);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
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
  //Test case number: 42
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      SystemInUtil.addInputLine("?`h oiKJ};$Km$f)@BT");
      StringReader stringReader0 = new StringReader("?`h oiKJ};$Km$f)@BT");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      stringReader0.ready();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.makeFunction();
      jSTerm0.isConstant();
      jSTerm0.makeEval(true);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm2 = jSTerm1.parseList(streamTokenizer0);
      jSTerm0.trimToSize();
      jSTerm2.makeFunction();
      jSTerm2.cloneT();
      System.setCurrentTimeMillis(0L);
      System.setCurrentTimeMillis(0L);
      boolean boolean0 = jSTerm0.equals(jSTerm2);
      assertTrue(jSTerm0.isEval());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 43
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(<?\u0006XM{eEY18bU");
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
  //Test case number: 44
  /*Coverage entropy=1.9777950282612196
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?`h oiKJ};$Km$f)@BT");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      stringReader0.ready();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      StringReader stringReader1 = new StringReader("?`h oiKJ};$Km$f)@BT");
      JSTerm jSTerm1 = jSTerm0.parseList(streamTokenizer0);
      SystemInUtil.addInputLine("Line : ");
      stringReader1.mark(41);
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader1);
      JSTerm jSTerm2 = jSTerm1.parseList(streamTokenizer1);
      jSTerm2.equals(jSTerm1);
      jSTerm2.call();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm1.matches(jSTerm2, jSSubstitution0);
      jSTerm2.matches(jSTerm1, jSSubstitution0);
      assertEquals(41, streamTokenizer1.ttype);
      assertEquals("Token[')'], line 1", streamTokenizer1.toString());
  }

  /**
  //Test case number: 45
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      StringReader stringReader0 = new StringReader("u8iBxbf-6");
      StringReader stringReader1 = new StringReader("(*nFjmY0X9+45(Fm");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader1);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
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
  //Test case number: 46
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      StringReader stringReader0 = new StringReader("iredicteforDprint(c 0 elo>eRt");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.nextToken();
      char[] charArray0 = new char[7];
      stringReader0.read(charArray0);
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
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(-<");
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
}
