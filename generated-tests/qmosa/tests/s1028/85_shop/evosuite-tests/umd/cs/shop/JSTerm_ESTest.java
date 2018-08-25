/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 17:23:34 GMT 2018
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
import java.util.function.Consumer;
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
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringReader stringReader0 = new StringReader("t");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.makeConstant();
      JSTerm jSTerm1 = jSTerm0.call();
      JSSubstitution jSSubstitution0 = jSTerm0.matches(jSTerm1);
      assertFalse(jSSubstitution0.fail());
      assertFalse(jSTerm1.isVariable());
      assertFalse(jSTerm1.isEval());
      assertFalse(jSTerm1.isFunction());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      int int0 = 0;
      jSTerm0.setSize(0);
      JSJshopVars.percent = (-1);
      jSTerm0.isConstant();
      jSTerm0.isConstant();
      jSTerm0.makeEval(false);
      jSTerm0.isVariable();
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
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      StringReader stringReader0 = new StringReader("T#~3'e]fov=6'i}'d&t");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.whitespaceChars(42, 0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      jSTerm1.equals((JSPredicateForm) jSTerm0);
      jSTerm0.equals(jSTerm1);
      JSJshopVars.dot = 2;
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
  //Test case number: 3
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSJshopVars.coma = 2870;
      jSTerm0.makeConstant();
      jSTerm0.isEval();
      JSTerm jSTerm1 = new JSTerm();
      UnaryOperator<JSSubstitution> unaryOperator0 = UnaryOperator.identity();
      jSTerm0.replaceAll(unaryOperator0);
      // Undeclared exception!
      try { 
        jSTerm1.setElementAt(jSTerm0, 2870);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2870 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.698782989513801
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringReader stringReader0 = new StringReader(" . ");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.print();
      jSTerm0.isFunction();
      jSTerm0.makeEval(false);
      jSTerm0.isVariable();
      jSTerm0.isEval();
      jSTerm0.makeVariable();
      jSTerm0.isFunction();
      // Undeclared exception!
      try { 
        CharBuffer.wrap((CharSequence) null, (-1615), 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.StringCharBuffer", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.0431918705451206
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSTerm jSTerm1 = new JSTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSSubstitution0.add((Object) jSTerm1);
      jSTerm0.matches(jSTerm1, jSSubstitution0);
      JSJshopVars.exclamation = (-2);
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
  //Test case number: 6
  /*Coverage entropy=2.3345491092125656
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Expecting variable name in term");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSJshopVars.coma = 0;
      jSTerm0.makeEval(true);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      jSTerm0.equals(jSTerm1);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm2 = jSTerm0.applySubstitutionT(jSSubstitution0);
      jSTerm0.print();
      jSTerm2.applySubstitutionT(jSSubstitution0);
      jSTerm2.toStr();
      jSTerm1.makeVariable();
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
  //Test case number: 7
  /*Coverage entropy=2.0620695413001644
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Ah2{Vn*a{|qE*x:1F");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      stringReader0.skip((-1L));
      streamTokenizer0.wordChars(0, 2);
      streamTokenizer0.ttype = 0;
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      char[] charArray0 = new char[6];
      jSTerm0.toStr();
      charArray0[0] = 'D';
      charArray0[1] = 'K';
      charArray0[2] = 'I';
      charArray0[3] = '7';
      charArray0[4] = 'U';
      charArray0[5] = '+';
      stringReader0.read(charArray0);
      jSTerm0.makeEval(true);
      JSTerm jSTerm1 = new JSTerm();
      jSTerm0.equals(jSTerm1);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm1.matches(jSTerm0, jSSubstitution0);
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
  //Test case number: 8
  /*Coverage entropy=2.395908119293929
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Expecting variable name in term");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSJshopVars.coma = 0;
      jSTerm0.makeEval(true);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      jSTerm0.equals(jSTerm1);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm2 = jSTerm0.applySubstitutionT(jSSubstitution0);
      jSTerm0.print();
      JSTerm jSTerm3 = jSTerm2.applySubstitutionT(jSSubstitution0);
      jSTerm2.toStr();
      jSTerm1.makeVariable();
      jSTerm1.toStr();
      assertFalse(jSTerm1.isConstant());
      
      jSTerm0.equals(jSTerm2);
      jSTerm3.toStr();
      JSTerm jSTerm4 = jSTerm0.standardizerTerm();
      assertTrue(jSTerm4.isConstant());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.246163027094038
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Expecting variable name in term");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSJshopVars.coma = 0;
      jSTerm0.makeEval(true);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      jSTerm0.equals(jSTerm1);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm2 = jSTerm0.applySubstitutionT(jSSubstitution0);
      jSTerm0.print();
      JSTerm jSTerm3 = jSTerm2.applySubstitutionT(jSSubstitution0);
      jSTerm2.toStr();
      jSTerm1.equals(jSTerm3);
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      jSTerm1.matches(jSTerm2, jSSubstitution0);
      assertFalse(jSTerm1.isEval());
      
      JSTerm jSTerm4 = jSTerm0.cloneT();
      jSTerm0.matches(jSTerm4);
      jSTerm3.print();
      assertTrue(jSTerm0.isEval());
      assertTrue(jSTerm2.isConstant());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.7356219397587946
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringReader stringReader0 = new StringReader("JSTerm: Error reading control parameters: ");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      boolean boolean0 = jSTerm0.isGround();
      assertFalse(jSTerm0.isEval());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.9061547465398496
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSTerm jSTerm1 = new JSTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm1.equals(jSTerm0);
      jSSubstitution0.add((Object) jSTerm1);
      jSTerm1.isEval();
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
  //Test case number: 12
  /*Coverage entropy=1.484457535817486
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Expecting constant symbol as term");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = jSTerm0.matches(jSTerm1, jSSubstitution0);
      assertFalse(jSTerm0.isEval());
      assertTrue(jSSubstitution1.fail());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      StringReader stringReader0 = new StringReader("@oa#Szt0");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      jSTerm0.isGround();
      JSTerm jSTerm1 = new JSTerm();
      JSSubstitution jSSubstitution0 = jSTerm0.matches(jSTerm1, (JSSubstitution) null);
      assertEquals(0, jSSubstitution0.size());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringReader stringReader0 = new StringReader("%7'<|@(+|&v`T?\"");
      char[] charArray0 = new char[6];
      charArray0[0] = 'N';
      charArray0[1] = '\"';
      charArray0[2] = '$';
      charArray0[3] = '%';
      charArray0[4] = '+';
      charArray0[5] = 's';
      stringReader0.read(charArray0);
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
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringReader stringReader0 = new StringReader("%7'<|@(+|&v`T?\"");
      char[] charArray0 = new char[6];
      charArray0[0] = 'N';
      charArray0[1] = '\"';
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
  //Test case number: 16
  /*Coverage entropy=1.2424533248940002
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      System.setCurrentTimeMillis(0L);
      StringReader stringReader0 = new StringReader("?w`g;;qgm,WYvORlb9");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSJshopVars.equalT = (-2);
      boolean boolean0 = jSTerm0.isGround();
      assertFalse(jSTerm0.isEval());
      assertFalse(boolean0);
      assertFalse(jSTerm0.isFunction());
      assertEquals("[?%%%]", jSTerm0.toString());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      System.setCurrentTimeMillis(0L);
      JSTerm jSTerm0 = new JSTerm();
      boolean boolean0 = jSTerm0.isGround();
      assertTrue(boolean0);
      
      StringReader stringReader0 = new StringReader("?w`g;;qgm,WYvORlb9");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm2 = jSTerm1.call();
      jSTerm0.isEmpty();
      jSTerm2.print();
      assertFalse(jSTerm2.isFunction());
      assertEquals("[?%%%]", jSTerm2.toString());
      assertFalse(jSTerm2.isConstant());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      System.setCurrentTimeMillis(0L);
      StringReader stringReader0 = new StringReader("({p?.)~<{8.");
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
  //Test case number: 19
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.add((Object) jSSubstitution0);
      jSTerm0.isEmpty();
      jSTerm0.print();
      StringBuffer stringBuffer0 = jSTerm0.toStr();
      assertEquals(5, stringBuffer0.length());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.5004024235381879
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      int int0 = 10;
      JSJshopVars.leftBrac = 10;
      StringReader stringReader0 = new StringReader("variable");
      stringReader0.mark(62);
      stringReader0.markSupported();
      JSJshopVars.rightBrac = 62;
      Consumer<JSTerm> consumer0 = (Consumer<JSTerm>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      JSJshopVars.leftPar = (-3);
      jSTerm0.forEach(consumer0);
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
  //Test case number: 21
  /*Coverage entropy=1.8310204811135165
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.trimToSize();
      jSTerm0.add((Object) null);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSSubstitution0.add((Object) jSTerm0);
      JSTerm jSTerm1 = jSTerm0.applySubstitutionT(jSSubstitution0);
      JSTerm jSTerm2 = jSTerm1.standardizerTerm();
      assertFalse(jSTerm1.isEval());
      assertTrue(jSTerm2.isFunction());
      assertNotSame(jSTerm2, jSTerm1);
      assertTrue(jSTerm1.isFunction());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.8288411561741993
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.trimToSize();
      jSTerm0.add((Object) null);
      JSTerm jSTerm1 = jSTerm0.call();
      assertTrue(jSTerm1.isFunction());
      
      System.setCurrentTimeMillis((-1219L));
      JSTerm jSTerm2 = jSTerm0.standardizerTerm();
      assertFalse(jSTerm2.isVariable());
      assertFalse(jSTerm2.isEval());
      assertTrue(jSTerm2.isFunction());
      assertFalse(jSTerm2.isConstant());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.8891591637540217
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StringReader stringReader0 = new StringReader("%7'<|@(+|&v`T?\"");
      char[] charArray0 = new char[6];
      charArray0[0] = 'N';
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.makeVariable();
      jSTerm0.add((Object) "%7'<|@(+|&v`T?\"");
      JSTerm jSTerm1 = jSTerm0.cloneT();
      jSTerm1.matches(jSTerm0, jSSubstitution0);
      assertTrue(jSTerm0.isVariable());
      assertTrue(jSTerm1.isVariable());
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.6674619334292948
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.trimToSize();
      jSTerm0.add((Object) null);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSSubstitution0.add((Object) null);
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      jSTerm0.add((Object) jSSubstitution1);
      // Undeclared exception!
      try { 
        jSTerm0.applySubstitutionT(jSSubstitution1);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // umd.cs.shop.JSSubstitution cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.setSize(105);
      jSTerm0.isVariable();
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
  /*Coverage entropy=1.9338099989206319
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?w`g;;qgm,WvRlb9");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = jSTerm0.matches(jSTerm1, jSSubstitution0);
      System.setCurrentTimeMillis(322L);
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
  //Test case number: 27
  /*Coverage entropy=1.4750763110546947
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      jSTerm0.add((Object) comparator0);
      jSTerm0.add((Object) null);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSSubstitution0.add((Object) jSTerm0);
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
  //Test case number: 28
  /*Coverage entropy=2.082007361865277
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?w`g;;qgm,WvRlb9");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = jSTerm1.matches(jSTerm0, jSSubstitution0);
      System.setCurrentTimeMillis((-1));
      // Undeclared exception!
      try { 
        jSTerm1.applySubstitutionT(jSSubstitution1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.2153881010836147
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[? niDOA0<),! a9");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      int int0 = (-3);
      stringReader0.read();
      streamTokenizer0.ordinaryChar((-3));
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSJshopVars.rightBrac = 1559;
      streamTokenizer0.pushBack();
      JSTerm jSTerm1 = jSTerm0.parseList(streamTokenizer0);
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
  //Test case number: 30
  /*Coverage entropy=1.7782333057997075
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?w`g;;qgm,WvRlb9");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.add((Object) stringReader0);
      JSTerm jSTerm1 = new JSTerm();
      boolean boolean0 = jSTerm0.equals(jSTerm1);
      assertTrue(jSTerm0.isVariable());
      assertFalse(boolean0);
      
      JSTerm jSTerm2 = jSTerm0.cloneT();
      assertEquals(1, jSTerm2.size());
      assertFalse(jSTerm2.isFunction());
      assertTrue(jSTerm2.isVariable());
      assertFalse(jSTerm2.isConstant());
      assertFalse(jSTerm0.isFunction());
      assertEquals("[?%%%]", jSTerm2.toString());
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.769036161304013
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.setSize(105);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      StringReader stringReader0 = new StringReader("JSTerm");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      jSTerm1.print();
      // Undeclared exception!
      try { 
        jSTerm0.call();
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
  /*Coverage entropy=0.5004024235381879
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.setSize(105);
      jSTerm0.add((Object) "?");
      jSTerm0.isEmpty();
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
  //Test case number: 33
  /*Coverage entropy=2.037734194785151
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?w`g;;qgm,WvRlb9");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      assertFalse(jSTerm0.isConstant());
      
      JSTerm jSTerm1 = new JSTerm();
      stringReader0.ready();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = jSTerm0.matches(jSTerm1, jSSubstitution0);
      assertEquals(1, jSSubstitution1.size());
      
      System.setCurrentTimeMillis((-1));
      JSTerm jSTerm2 = jSTerm0.standardizerTerm();
      assertEquals("[?%%%0]", jSTerm2.toString());
      assertFalse(jSTerm2.isEval());
      assertFalse(jSTerm0.isFunction());
      assertFalse(jSTerm2.isConstant());
      assertFalse(jSTerm2.isFunction());
      assertTrue(jSTerm2.isVariable());
  }

  /**
  //Test case number: 34
  /*Coverage entropy=1.923901295464055
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.trimToSize();
      jSTerm0.add((Object) "jterm:");
      jSTerm0.isEmpty();
      jSTerm0.print();
      JSTerm jSTerm1 = jSTerm0.cloneT();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = jSTerm0.matches(jSTerm1, jSSubstitution0);
      assertFalse(jSSubstitution1.fail());
      
      boolean boolean0 = jSTerm0.equals(jSTerm1);
      assertFalse(jSTerm1.isConstant());
      assertFalse(jSTerm1.isVariable());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 35
  /*Coverage entropy=2.1380398790424184
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.trimToSize();
      jSTerm0.add((Object) "jterm:");
      jSTerm0.isEmpty();
      jSTerm0.print();
      JSTerm jSTerm1 = jSTerm0.cloneT();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm2 = new JSTerm();
      jSTerm2.matches(jSTerm1, jSSubstitution0);
      jSTerm1.call();
      jSTerm2.isGround();
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
  //Test case number: 36
  /*Coverage entropy=2.0988360454940334
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.trimToSize();
      jSTerm0.add((Object) "tQ][pX`wvWx#'_");
      jSTerm0.isEmpty();
      jSTerm0.print();
      JSTerm jSTerm1 = jSTerm0.cloneT();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      jSTerm1.addElement(jSTerm0);
      jSTerm0.matches(jSTerm1, jSSubstitution1);
      jSTerm1.isGround();
      jSTerm0.matches(jSTerm1, jSSubstitution1);
      StringReader stringReader0 = new StringReader("A!//ivXM%tI");
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
  //Test case number: 37
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      StringReader stringReader0 = new StringReader("%SQasxi");
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
  //Test case number: 38
  /*Coverage entropy=2.022808529414704
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.trimToSize();
      jSTerm0.add((Object) "tQ][pX`wvWx#'_");
      jSTerm0.isEmpty();
      jSTerm0.print();
      JSTerm jSTerm1 = jSTerm0.cloneT();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      jSTerm1.addElement(jSTerm0);
      jSTerm0.matches(jSTerm1, jSSubstitution1);
      jSTerm1.isGround();
      jSTerm0.matches(jSTerm1, jSSubstitution1);
      StringReader stringReader0 = new StringReader("A!//ivXM%tI");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      jSTerm1.cloneT();
      assertEquals("[tQ][pX`wvWx#'_, [tQ][pX`wvWx#'_]]", jSTerm1.toString());
  }

  /**
  //Test case number: 39
  /*Coverage entropy=0.45056120886630463
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.trimToSize();
      jSTerm0.add((Object) "jterm:");
      jSTerm0.isEmpty();
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
  //Test case number: 40
  /*Coverage entropy=2.0555861437635783
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) "tQ][pX`wvWx#'_");
      jSTerm0.isEmpty();
      jSTerm0.print();
      JSTerm jSTerm1 = jSTerm0.cloneT();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      jSTerm1.addElement(jSTerm0);
      jSTerm0.matches(jSTerm1, jSSubstitution1);
      boolean boolean0 = jSTerm1.isGround();
      JSSubstitution jSSubstitution2 = jSTerm0.matches(jSTerm1, jSSubstitution1);
      assertTrue(jSSubstitution2.fail());
      
      boolean boolean1 = jSTerm0.equals(jSTerm1);
      assertTrue(jSTerm1.isFunction());
      assertFalse(jSTerm1.isConstant());
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  /**
  //Test case number: 41
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(Sff%>Bn\r?.");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      stringReader0.reset();
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