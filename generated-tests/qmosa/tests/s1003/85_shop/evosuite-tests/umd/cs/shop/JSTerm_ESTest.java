/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 10:28:49 GMT 2018
 */

package umd.cs.shop;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StreamTokenizer;
import java.io.StringReader;
import java.util.Collection;
import java.util.Spliterator;
import java.util.function.Consumer;
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
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.isGround();
      jSTerm0.makeEval(true);
      JSJshopVars.percent = 0;
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
  //Test case number: 1
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringReader stringReader0 = new StringReader("*");
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
  //Test case number: 2
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Wro,qegw{");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.standardizerTerm();
      jSTerm0.makeFunction();
      jSTerm0.makeEval(true);
      assertTrue(jSTerm0.isFunction());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringReader stringReader0 = new StringReader("hi6\"%`\";&)fC8$g");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      streamTokenizer0.ordinaryChar((-2545));
      stringReader0.read();
      JSTerm jSTerm1 = jSTerm0.standardizerTerm();
      boolean boolean0 = jSTerm1.isEval();
      JSTerm jSTerm2 = jSTerm0.standardizerTerm();
      streamTokenizer0.commentChar(1);
      JSTerm jSTerm3 = jSTerm2.cloneT();
      assertTrue(jSTerm3.isConstant());
      
      JSTerm jSTerm4 = jSTerm2.standardizerTerm();
      boolean boolean1 = jSTerm2.isGround();
      assertFalse(boolean1 == boolean0);
      
      jSTerm2.print();
      jSTerm4.print();
      assertFalse(jSTerm4.isVariable());
      assertNotSame(jSTerm2, jSTerm3);
      assertFalse(jSTerm2.isFunction());
      assertEquals(1, jSTerm2.size());
      assertNotSame(jSTerm4, jSTerm0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?L3Fk.|S0f4)Q|nGw{a");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.whitespaceChars(0, 0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = jSTerm0.standardizerTerm();
      JSJshopVars.dot = 41;
      JSTerm jSTerm2 = jSTerm1.cloneT();
      jSTerm2.standardizerTerm();
      StringBuffer stringBuffer0 = jSTerm2.toStr();
      assertEquals("?L3Fk.|S0f40 ", stringBuffer0.toString());
      assertEquals("[?L3Fk.|S0f40]", jSTerm1.toString());
      assertFalse(jSTerm2.isConstant());
      assertFalse(jSTerm0.isFunction());
      assertFalse(jSTerm2.isEval());
      assertNotSame(jSTerm2, jSTerm1);
      assertFalse(jSTerm1.isFunction());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
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
  //Test case number: 6
  /*Coverage entropy=1.8310204811135165
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) jSTerm0);
      jSTerm0.removeElement(jSTerm0);
      jSTerm0.makeEval(true);
      JSJshopVars.leftBrac = (-370);
      jSTerm0.isEval();
      jSTerm0.makeVariable();
      jSTerm0.call();
      int int0 = (-4424);
      JSJshopVars.semicolon = (-4424);
      JSJshopVars.VarCounter = (-4424);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      // Undeclared exception!
      try { 
        jSSubstitution0.removeElementAt(1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.7356219397587946
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringReader stringReader0 = new StringReader("An?SOZ]=VNsCY'J");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = jSTerm0.call();
      jSTerm1.removeAllElements();
      StringReader stringReader1 = new StringReader("");
      stringReader1.mark(51);
      stringReader1.skip((-1));
      StringReader stringReader2 = null;
      try {
        stringReader2 = new StringReader((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.037404849160653
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      StringReader stringReader0 = new StringReader("floor");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm2 = jSTerm1.cloneT();
      JSSubstitution jSSubstitution0 = jSTerm1.matches(jSTerm2);
      jSSubstitution0.add((Object) stringReader0);
      jSTerm2.isGround();
      jSTerm1.equals(jSTerm0);
      jSTerm2.equals(jSTerm0);
      jSTerm2.retainAll(jSTerm1);
      jSTerm0.equals(jSTerm2);
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
  //Test case number: 9
  /*Coverage entropy=2.0140355237092673
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?L3Fk.|S0f4)Q|nGw{a");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.whitespaceChars(0, 0);
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer1);
      jSTerm0.makeFunction();
      streamTokenizer1.sval = "| ";
      JSTerm jSTerm1 = jSTerm0.cloneT();
      jSTerm0.toStr();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm1.applySubstitutionT(jSSubstitution0);
      assertFalse(jSTerm0.isVariable());
      assertTrue(jSTerm0.isFunction());
      assertNotSame(jSTerm0, jSTerm1);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.7917594692280554
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?L3Fk.|S0f4)Q|nGw{a");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.containsAll(jSSubstitution0);
      JSTerm jSTerm1 = jSTerm0.applySubstitutionT(jSSubstitution0);
      assertFalse(jSTerm0.isFunction());
      assertTrue(jSTerm1.isVariable());
      assertEquals("[?L3Fk.|S0f4]", jSTerm1.toString());
      assertFalse(jSTerm1.isFunction());
      assertNotSame(jSTerm1, jSTerm0);
      assertFalse(jSTerm1.isConstant());
      assertFalse(jSTerm1.isEval());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.0140355237092673
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringReader stringReader0 = new StringReader("An?SOZ]=VNsCY'J");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.ordinaryChars(900, (-778));
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = jSTerm0.cloneT();
      JSSubstitution jSSubstitution0 = jSTerm1.matches(jSTerm0);
      jSSubstitution0.add((Object) stringReader0);
      assertEquals(1, jSSubstitution0.size());
      
      jSTerm1.isGround();
      jSTerm0.equals(jSTerm1);
      jSTerm0.equals(jSTerm1);
      jSTerm1.equals(jSTerm0);
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      jSTerm0.applySubstitutionT(jSSubstitution1);
      assertEquals("[%%%]", jSTerm0.toString());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.7219544494060541
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?L3Fk.|S0f4)Q|nGw{a");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.whitespaceChars((-20), 7);
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer1);
      jSTerm0.makeFunction();
      streamTokenizer1.sval = "| ";
      jSTerm0.cloneT();
      jSTerm0.toStr();
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
  //Test case number: 13
  /*Coverage entropy=2.0488828279013447
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?L3Fk.|S0f4)Q|nGw{a");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.whitespaceChars(0, 0);
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      streamTokenizer0.slashSlashComments(true);
      jSTerm0.makeFunction();
      streamTokenizer1.sval = "96>VB]";
      jSTerm0.cloneT();
      jSTerm0.toStr();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.standardizerTerm();
      assertFalse(jSTerm0.isVariable());
      assertTrue(jSTerm0.isFunction());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.1146299722481476
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?L3Fk.|S0f4)Q|nGw{a");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.whitespaceChars(0, 0);
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer1);
      jSTerm0.makeFunction();
      streamTokenizer1.parseNumbers();
      streamTokenizer1.sval = "| ";
      JSTerm jSTerm1 = jSTerm0.cloneT();
      stringReader0.close();
      jSTerm0.equals(jSTerm1);
      jSTerm0.toStr();
      jSTerm0.print();
      assertTrue(jSTerm0.isFunction());
      assertFalse(jSTerm0.isVariable());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.711845135233912
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?L3Fk.|S0f4)Q|nGw{a");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.whitespaceChars(0, 14);
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader0);
      streamTokenizer1.ttype = (-236);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer1);
      JSJshopVars.percent = (-2330);
      jSTerm0.makeFunction();
      JSTerm jSTerm1 = new JSTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm1.matches(jSTerm0, jSSubstitution0);
      assertTrue(jSTerm0.isFunction());
      assertFalse(jSTerm0.isVariable());
      assertEquals("[?L3Fk.|S0f4]", jSTerm0.toString());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.076048752693783
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?L3Fk.|S0f4)Q|nGw{a");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      char[] charArray0 = new char[5];
      charArray0[0] = 'G';
      charArray0[1] = '$';
      charArray0[2] = 'Z';
      charArray0[3] = 'R';
      charArray0[4] = '3';
      stringReader0.read(charArray0);
      streamTokenizer0.whitespaceChars(0, 0);
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer1);
      jSTerm0.makeFunction();
      streamTokenizer1.parseNumbers();
      streamTokenizer1.sval = "| ";
      JSTerm jSTerm1 = jSTerm0.cloneT();
      Consumer<JSTerm> consumer0 = (Consumer<JSTerm>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      jSTerm1.forEach(consumer0);
      jSTerm0.toStr();
      jSTerm0.print();
      jSTerm0.call();
      assertTrue(jSTerm0.isFunction());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.2718685126965625
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      StringReader stringReader0 = new StringReader("GLD'* 5tGej0%}!d=");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader0);
      streamTokenizer1.whitespaceChars((-3), 0);
      StreamTokenizer streamTokenizer2 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer1);
      streamTokenizer2.slashSlashComments(false);
      jSTerm0.makeFunction();
      jSTerm1.cloneT();
      jSTerm1.toStr();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
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
  //Test case number: 18
  /*Coverage entropy=1.8734517375545654
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?L3Fk.|S0f4)Q|nGw{a");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.whitespaceChars(0, 0);
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer1);
      jSTerm0.makeFunction();
      JSTerm jSTerm1 = new JSTerm();
      jSTerm1.equals(jSTerm0);
      jSTerm0.cloneT();
      assertTrue(jSTerm0.isFunction());
      assertFalse(jSTerm0.isVariable());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.1146299722481476
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?L3Fk.|S0f4)Q|nGw{a");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.whitespaceChars(0, 0);
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer1);
      jSTerm0.makeFunction();
      streamTokenizer1.lowerCaseMode(true);
      streamTokenizer1.sval = "| ";
      JSTerm jSTerm1 = jSTerm0.cloneT();
      jSTerm0.toStr();
      jSTerm0.isGround();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm1.matches(jSTerm0, jSSubstitution0);
      assertFalse(jSTerm0.isVariable());
      assertTrue(jSTerm0.isFunction());
      assertFalse(jSTerm0.isConstant());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=2.245723930485144
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?L3Fk.|S0f4)Q|nGw{a");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.whitespaceChars(0, 0);
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm();
      JSSubstitution jSSubstitution0 = jSTerm0.matches(jSTerm1);
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      jSTerm1.matches(jSTerm0);
      JSSubstitution jSSubstitution2 = new JSSubstitution();
      jSSubstitution0.add((Object) jSSubstitution2);
      jSTerm1.isGround();
      JSTerm jSTerm2 = new JSTerm();
      jSTerm2.equals(jSTerm1);
      jSTerm2.equals(jSTerm1);
      jSTerm2.equals(jSTerm1);
      JSSubstitution jSSubstitution3 = new JSSubstitution();
      JSTerm jSTerm3 = new JSTerm();
      // Undeclared exception!
      try { 
        jSTerm2.applySubstitutionT(jSSubstitution1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=2.5475313664679273
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?L3Fk.|S0f4)Q|nGw{a");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.ordinaryChars(4781, 2634);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = jSTerm0.cloneT();
      JSSubstitution jSSubstitution0 = jSTerm0.matches(jSTerm1);
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      jSSubstitution0.add((Object) jSSubstitution1);
      jSTerm1.isGround();
      jSTerm1.equals(jSTerm0);
      jSTerm1.equals(jSTerm0);
      jSTerm1.equals(jSTerm0);
      JSSubstitution jSSubstitution2 = new JSSubstitution();
      JSTerm jSTerm2 = new JSTerm();
      JSJshopVars.interrogation = 41;
      jSTerm0.call();
      // Undeclared exception!
      try { 
        jSTerm2.applySubstitutionT(jSSubstitution2);
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
  /*Coverage entropy=2.2718685126965625
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?L3Fk.|S0f4)Q|nGw{a");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.whitespaceChars(0, 0);
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = jSTerm0.cloneT();
      JSTerm jSTerm2 = jSTerm1.cloneT();
      StringBuffer stringBuffer0 = jSTerm0.toStr();
      assertEquals(12, stringBuffer0.length());
      
      JSTerm jSTerm3 = jSTerm1.call();
      assertTrue(jSTerm3.isVariable());
      
      jSTerm1.print();
      assertFalse(jSTerm1.isFunction());
      assertFalse(jSTerm0.isFunction());
      assertNotSame(jSTerm1, jSTerm2);
      assertFalse(jSTerm1.isConstant());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.483694055645857
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?L3Fk.|S0f4)Q|nGw{a");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.whitespaceChars(0, 14);
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      Object object0 = jSTerm0.clone();
      jSSubstitution0.add(object0);
      jSTerm0.isGround();
      JSTerm jSTerm1 = new JSTerm();
      jSTerm0.equals(jSTerm1);
      jSTerm0.equals(jSTerm1);
      JSTerm jSTerm2 = new JSTerm(streamTokenizer1);
      jSTerm1.equals(jSTerm0);
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      JSTerm jSTerm3 = new JSTerm();
      jSTerm3.removeAllElements();
      JSTerm jSTerm4 = null;
      try {
        jSTerm4 = new JSTerm(streamTokenizer1);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.5810937501718239
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?L3Fk.|S0f4)Q|nGw{a");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader0);
      streamTokenizer1.whitespaceChars(7, (-20));
      StreamTokenizer streamTokenizer2 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer2);
      jSTerm0.makeFunction();
      JSTerm jSTerm1 = jSTerm0.cloneT();
      jSTerm1.addAll((Collection) jSTerm0);
      // Undeclared exception!
      try { 
        jSTerm1.cloneT();
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
  /*Coverage entropy=1.7830734690382193
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?L3Fk.|S0f4)Q|nGw{a");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.parseList(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm();
      JSJshopVars.plus = 41;
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm2 = new JSTerm();
      jSTerm2.matches(jSTerm0, jSSubstitution0);
      JSTerm jSTerm3 = new JSTerm(streamTokenizer0);
      assertEquals((-1), streamTokenizer0.ttype);
      assertFalse(jSTerm3.isVariable());
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.679204331602707
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StringReader stringReader0 = new StringReader("RL3Fk.|S0f4)Q|nGw{a");
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm();
      jSTerm0.matches(jSTerm1, jSSubstitution0);
      // Undeclared exception!
      try { 
        jSTerm1.toStr();
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
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?L3Fk.|S0f4)Q|nGw{a");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.ordinaryChar((-4));
      StringReader stringReader1 = new StringReader("(");
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader1);
      JSTerm jSTerm0 = null;
      try {
        jSTerm0 = new JSTerm(streamTokenizer1);
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
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      String string0 = "(cxM6J9g#wVCpzj*+0";
      StringReader stringReader0 = new StringReader("(cxM6J9g#wVCpzj*+0");
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
  //Test case number: 29
  /*Coverage entropy=2.0330001999799117
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?L3Fk.|S0f4)Q|nGw{a");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.ordinaryChar((-4));
      streamTokenizer0.whitespaceChars((-4), 7);
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer1);
      jSTerm0.makeFunction();
      JSJshopVars.exclamation = 5648;
      streamTokenizer1.sval = "| ";
      JSTerm jSTerm1 = jSTerm0.cloneT();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.applySubstitutionT(jSSubstitution0);
      jSTerm0.addAll((Collection) jSTerm1);
      // Undeclared exception!
      try { 
        jSTerm0.isGround();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  /**
  //Test case number: 30
  /*Coverage entropy=2.151322079921271
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?L3Fk.|S0f4)Q|nGw{a");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.whitespaceChars((-20), 14);
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader0);
      streamTokenizer1.slashSlashComments(true);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer1);
      jSTerm0.makeFunction();
      streamTokenizer1.slashSlashComments(false);
      JSTerm jSTerm1 = jSTerm0.cloneT();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSSubstitution0.add((Object) "?L3Fk.|S0f4)Q|nGw{a");
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      jSSubstitution1.add((Object) jSSubstitution0);
      JSSubstitution jSSubstitution2 = new JSSubstitution();
      JSTerm jSTerm2 = jSTerm0.applySubstitutionT(jSSubstitution2);
      jSTerm1.addAll((Collection) jSTerm2);
      jSTerm0.isGround();
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
  //Test case number: 31
  /*Coverage entropy=1.4205719259467045
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?L3Fk.|S0f4)Q|nGw{a");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.ordinaryChar((-4));
      streamTokenizer0.whitespaceChars((-4), 7);
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm();
      JSTerm jSTerm1 = jSTerm0.parseList(streamTokenizer1);
      jSTerm1.toStr();
      System.setCurrentTimeMillis(0L);
      JSTerm jSTerm2 = new JSTerm(streamTokenizer0);
      jSTerm2.toStr();
      assertEquals((-1), streamTokenizer0.ttype);
      assertEquals("[%%%]", jSTerm2.toString());
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.073542846408523
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(cxM6J9g#wVCpzj*+0");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      stringReader0.reset();
      stringReader0.skip((-3440L));
      streamTokenizer0.ordinaryChars((-1518), 123);
      JSTerm jSTerm0 = new JSTerm();
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
  //Test case number: 33
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StringReader stringReader0 = new StringReader("An?SOZ]=VNsCY'J");
      StringReader stringReader1 = new StringReader("3}@");
      StringReader stringReader2 = new StringReader("?");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader2);
      stringReader2.markSupported();
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
  //Test case number: 34
  /*Coverage entropy=1.8055149492285163
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?L3Fk.|S0f4)Q|nGIw{a");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.ordinaryChar((-4));
      JSTerm jSTerm0 = new JSTerm();
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      assertFalse(jSTerm1.isConstant());
      
      JSSubstitution jSSubstitution0 = jSTerm1.matches(jSTerm0);
      System.setCurrentTimeMillis(41);
      System.setCurrentTimeMillis(41);
      JSSubstitution jSSubstitution1 = jSTerm1.matches(jSTerm0, jSSubstitution0);
      assertTrue(jSTerm1.isVariable());
      assertEquals("[?L3Fk.|S0f4]", jSTerm1.toString());
      assertFalse(jSTerm1.isFunction());
      assertTrue(jSSubstitution1.fail());
  }

  /**
  //Test case number: 35
  /*Coverage entropy=2.0161537172613797
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?L3Fk.|S0f4)Q|nGw{a");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader0);
      streamTokenizer1.slashSlashComments(false);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer1);
      streamTokenizer0.commentChar(41);
      jSTerm0.makeFunction();
      JSTerm jSTerm1 = jSTerm0.cloneT();
      jSTerm1.makeFunction();
      jSTerm1.remove((Object) "?L3Fk.|S0f4)Q|nGw{a");
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm2 = jSTerm0.applySubstitutionT(jSSubstitution0);
      jSTerm0.addAll((Collection) jSTerm2);
      System.setCurrentTimeMillis(982L);
      JSJshopVars.rightPar = 41;
      JSTerm jSTerm3 = (JSTerm)jSTerm0.clone();
      jSSubstitution0.add((Object) jSTerm3);
      jSTerm2.isEmpty();
      // Undeclared exception!
      try { 
        jSTerm0.equals(jSTerm3);
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
  /*Coverage entropy=1.951848439223888
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?L3Fk.|S0f4)Q|nGw{a");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader0);
      streamTokenizer1.slashSlashComments(false);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer1);
      streamTokenizer0.commentChar(41);
      jSTerm0.makeFunction();
      JSTerm jSTerm1 = jSTerm0.cloneT();
      jSTerm1.makeFunction();
      jSTerm1.remove((Object) "?L3Fk.|S0f4)Q|nGw{a");
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm2 = jSTerm0.applySubstitutionT(jSSubstitution0);
      jSTerm0.addAll((Collection) jSTerm2);
      jSTerm2.applySubstitutionPF(jSSubstitution0);
      System.setCurrentTimeMillis(982L);
      JSJshopVars.rightPar = 41;
      jSTerm0.clone();
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
}
