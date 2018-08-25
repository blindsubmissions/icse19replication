/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 11:29:52 GMT 2018
 */

package umd.cs.shop;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StreamTokenizer;
import java.io.StringReader;
import java.nio.CharBuffer;
import java.util.Comparator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
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
      StringReader stringReader0 = new StringReader("- ");
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
      StringReader stringReader0 = new StringReader("(<9F%;o#6:)r");
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
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringReader stringReader0 = new StringReader("n6=Q'=");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.makeVariable();
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
  //Test case number: 3
  /*Coverage entropy=1.2816340498925647
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(>)&5;3yUj>y");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.cloneT();
      // Undeclared exception!
      try { 
        jSTerm0.equals((JSTerm) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.254652555959706
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SystemInUtil.addInputLine("T&)");
      StringReader stringReader0 = new StringReader("(<h9D%;oH#6:})P*");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer1);
      JSSubstitution jSSubstitution0 = jSTerm0.matches(jSTerm1);
      assertTrue(jSSubstitution0.fail());
      
      boolean boolean0 = jSTerm0.isGround();
      assertTrue(boolean0);
      assertFalse(jSTerm0.isEval());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.8734641445321513
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(Bvtm>J, ");
      stringReader0.read();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = jSTerm0.matches(jSTerm1, jSSubstitution0);
      assertFalse(jSTerm0.isEval());
      assertTrue(jSSubstitution1.fail());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.04138000510499
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(<9F%;oH#6:)Pr");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = jSTerm0.call();
      assertNotSame(jSTerm1, jSTerm0);
      assertFalse(jSTerm1.isVariable());
      assertEquals("[<, [9.0], [F%;oH6:]]", jSTerm1.toString());
      assertTrue(jSTerm1.isFunction());
      assertFalse(jSTerm1.isConstant());
      assertEquals(10, jSTerm1.capacity());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.45056120886630463
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringReader stringReader0 = new StringReader("($[r=->%gSA+z&_5[");
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm0 = new JSTerm();
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      jSSubstitution1.add((Object) "MWzC");
      jSTerm0.addElement(jSSubstitution1);
      jSTerm0.print();
      assertFalse(jSTerm0.isVariable());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringReader stringReader0 = new StringReader("C}PEGlOi)#&B*qP0em");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      StringBuffer stringBuffer0 = jSTerm0.toStr();
      assertFalse(jSTerm0.isEval());
      assertEquals("CPEGlOi ", stringBuffer0.toString());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      StringReader stringReader0 = new StringReader("?G\"M6Ug5g2.1");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      // Undeclared exception!
      try { 
        jSTerm0.equals((JSTerm) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.4718832548709924
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringReader stringReader0 = new StringReader("8o]ayQ07");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      streamTokenizer0.lowerCaseMode(true);
      jSTerm0.makeVariable();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution1 = jSTerm1.matches(jSTerm0, jSSubstitution0);
      jSSubstitution1.removeAllElements();
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
  /*Coverage entropy=1.1384051391289887
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SystemInUtil.addInputLine("T&)");
      StringReader stringReader0 = new StringReader("(<h9D%;oH#6:})P*");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      streamTokenizer0.sval = "Bvtm>J,";
      jSTerm0.makeFunction();
      streamTokenizer0.whitespaceChars(0, 37);
      jSTerm0.makeVariable();
      JSJshopVars.VarCounter = (-939);
      boolean boolean0 = jSTerm0.isGround();
      assertFalse(jSTerm0.isFunction());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.5670609309552819
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(BvGm>}, ");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.nextToken();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm();
      boolean boolean0 = jSTerm0.equals(jSTerm1);
      assertFalse(boolean0);
      assertFalse(jSTerm0.isEval());
      assertEquals("[BvGm>,]", jSTerm0.toString());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.4249913134082715
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(>)&5;3yUj>y");
      stringReader0.skip(0L);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = jSTerm0.standardizerTerm();
      assertFalse(jSTerm1.isConstant());
      assertTrue(jSTerm1.isFunction());
      assertFalse(jSTerm1.isEval());
      assertFalse(jSTerm1.isVariable());
      
      boolean boolean0 = jSTerm0.isGround();
      assertNotSame(jSTerm0, jSTerm1);
      assertTrue(boolean0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.3639196397750315
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SystemInUtil.addInputLine("T&)");
      StringReader stringReader0 = new StringReader("(<h9D%;oH#6:})P*");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = jSTerm0.cloneT();
      assertFalse(jSTerm1.isConstant());
      assertFalse(jSTerm1.isVariable());
      assertTrue(jSTerm1.isFunction());
      assertEquals("[<, [h9D%;oH6:]]", jSTerm1.toString());
      
      boolean boolean0 = jSTerm0.isGround();
      assertFalse(jSTerm0.isEval());
      assertNotSame(jSTerm0, jSTerm1);
      assertTrue(boolean0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.3639196397750315
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SystemInUtil.addInputLine("T&)");
      StringReader stringReader0 = new StringReader("(<h9D%;oH#6:})P*");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSPredicateForm jSPredicateForm0 = jSTerm0.standarizerPredicateForm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSSubstitution0.add((Object) stringReader0);
      // Undeclared exception!
      try { 
        jSTerm0.matches(jSPredicateForm0, jSSubstitution0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.io.StringReader cannot be cast to umd.cs.shop.JSPairVarTerm
         //
         verifyException("umd.cs.shop.JSSubstitution", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.makeVariable();
      jSTerm0.isEmpty();
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
  //Test case number: 17
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(R5pSh0pVH");
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
  //Test case number: 19
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.addElement(".");
      jSTerm0.addElement(".");
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
  //Test case number: 20
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
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
  //Test case number: 21
  /*Coverage entropy=1.8745804789360874
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SystemInUtil.addInputLine("T&)");
      StringReader stringReader0 = new StringReader("(<h9D%;oH#6:})P*");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm1 = jSTerm0.applySubstitutionT(jSSubstitution0);
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(anyInt() , anyInt());
      jSTerm1.sort(comparator0);
      assertFalse(jSTerm1.isEval());
      assertTrue(jSTerm1.isFunction());
      
      boolean boolean0 = jSTerm0.equals(jSTerm0);
      assertTrue(boolean0);
      
      JSTerm jSTerm2 = jSTerm0.call();
      assertEquals(10, jSTerm2.capacity());
      assertNotSame(jSTerm0, jSTerm1);
      assertNotSame(jSTerm2, jSTerm0);
      assertFalse(jSTerm2.isVariable());
      assertTrue(jSTerm2.equals((Object)jSTerm1));
      assertFalse(jSTerm2.isConstant());
      assertEquals("[<, [h9D%;oH6:]]", jSTerm2.toString());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.makeVariable();
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
  //Test case number: 23
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.makeVariable();
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
  //Test case number: 24
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
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
  //Test case number: 25
  /*Coverage entropy=1.1537419427010902
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SystemInUtil.addInputLine("T&)");
      StringReader stringReader0 = new StringReader("(<h9D%;oH#6:})P*");
      stringReader0.reset();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      char[] charArray0 = new char[2];
      charArray0[0] = 'y';
      charArray0[1] = '9';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      stringReader0.read(charBuffer0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.addElement(jSSubstitution0);
      jSTerm0.matches(jSTerm0, jSSubstitution0);
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
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.makeVariable();
      JSTerm jSTerm1 = new JSTerm();
      jSTerm0.equals(jSTerm1);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
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
  //Test case number: 27
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.makeVariable();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
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
  //Test case number: 28
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Expecting Term");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      assertEquals(32, streamTokenizer0.ttype);
      
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = jSTerm0.matches(jSTerm1, jSSubstitution0);
      assertTrue(jSSubstitution1.fail());
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?tzJ_dpvh");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = jSTerm0.call();
      assertEquals("[?%%%]", jSTerm1.toString());
      assertFalse(jSTerm1.isFunction());
      assertFalse(jSTerm1.isConstant());
      assertEquals(1, jSTerm1.capacity());
  }

  /**
  //Test case number: 30
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSTerm jSTerm1 = new JSTerm();
      jSTerm0.addElement(jSTerm1);
      StringBuffer stringBuffer0 = jSTerm0.toStr();
      assertEquals(5, stringBuffer0.length());
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.254652555959706
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SystemInUtil.addInputLine("T&)");
      StringReader stringReader0 = new StringReader("(<h9D%;oH#6:})P*");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      boolean boolean0 = jSTerm0.isGround();
      JSTerm jSTerm1 = new JSTerm();
      boolean boolean1 = jSTerm0.equals(jSTerm1);
      assertFalse(boolean1);
      
      boolean boolean2 = jSTerm1.equals(jSTerm0);
      assertFalse(boolean2 == boolean0);
      assertFalse(boolean2);
  }

  /**
  //Test case number: 32
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      StringReader stringReader0 = new StringReader("($[r=->%gSA+z&_5[");
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
  //Test case number: 33
  /*Coverage entropy=1.0366904997348778
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SystemInUtil.addInputLine("T&)");
      StringReader stringReader0 = new StringReader("(<h9D%;oH#6:})P*");
      stringReader0.reset();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.addElement(jSSubstitution0);
      // Undeclared exception!
      try { 
        jSTerm0.matches(jSTerm0, jSSubstitution0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // umd.cs.shop.JSSubstitution cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  /**
  //Test case number: 34
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(<h9D%;oH#6:})P*");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.print();
      assertEquals("[<, [h9D%;oH6:]]", jSTerm0.toString());
  }

  /**
  //Test case number: 35
  /*Coverage entropy=1.664235412577097
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SystemInUtil.addInputLine("T&)");
      StringReader stringReader0 = new StringReader("(<h9D%;oH#6:})P*");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.equals(jSTerm0);
      JSTerm jSTerm1 = jSTerm0.call();
      assertFalse(jSTerm1.isEmpty());
      
      jSTerm1.clear();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm1.matches(jSTerm0, jSSubstitution0);
      assertTrue(jSTerm1.isFunction());
  }

  /**
  //Test case number: 36
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.addElement(jSSubstitution0);
      jSTerm0.addElement(jSTerm0);
      // Undeclared exception!
      try { 
        jSTerm0.toStr();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  /**
  //Test case number: 37
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      StringReader stringReader0 = new StringReader("%It%");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      assertEquals("[%It]", jSTerm0.toString());
  }

  /**
  //Test case number: 38
  /*Coverage entropy=1.556183821230542
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(>)&5;3yUj>y");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = jSTerm0.call();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = jSTerm0.matches(jSTerm1, jSSubstitution0);
      assertFalse(jSSubstitution1.fail());
      assertEquals(10, jSTerm1.capacity());
      assertFalse(jSTerm1.isConstant());
  }

  /**
  //Test case number: 39
  /*Coverage entropy=1.3650697608766793
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(<h9D%;oH#6:})P*");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.makeEval(true);
      // Undeclared exception!
      try { 
        jSTerm0.call();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2 >= 2
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 40
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.removeAll(jSSubstitution0);
      jSTerm0.makeEval(true);
      jSTerm0.addElement(jSTerm0);
      jSTerm0.print();
      assertTrue(jSTerm0.isEval());
  }

  /**
  //Test case number: 41
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(xOF 2ip");
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
  //Test case number: 42
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      StringReader stringReader0 = new StringReader("8o]ayQ07");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      streamTokenizer0.lowerCaseMode(true);
      jSTerm0.makeVariable();
      jSTerm0.makeEval(true);
      jSTerm0.addElement(streamTokenizer0);
      jSTerm0.call();
      assertFalse(jSTerm0.isConstant());
  }

  /**
  //Test case number: 43
  /*Coverage entropy=1.6809640857036732
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      StringReader stringReader0 = new StringReader("4U)dR~d*B^DlzXz^");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm1 = jSTerm0.parseList(streamTokenizer0);
      jSTerm0.isEmpty();
      jSTerm1.print();
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
  //Test case number: 44
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      StringReader stringReader0 = new StringReader("8o]ayQ07");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.makeVariable();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      streamTokenizer0.lowerCaseMode(false);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution1 = jSTerm0.matches(jSTerm1, jSSubstitution0);
      jSTerm0.equals(jSTerm1);
      System.setCurrentTimeMillis((-1));
      jSTerm0.matches(jSTerm1, jSSubstitution1);
      assertFalse(jSTerm0.isConstant());
  }

  /**
  //Test case number: 45
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      StringReader stringReader0 = new StringReader(".");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader0);
      streamTokenizer0.resetSyntax();
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
  //Test case number: 46
  /*Coverage entropy=2.2484330456510495
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      StringReader stringReader0 = new StringReader("JH)GRF^$}!F8");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm1 = jSTerm0.parseList(streamTokenizer0);
      jSTerm0.equals(jSTerm1);
      stringReader0.reset();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm1.makeEval(true);
      jSTerm0.addElement(jSSubstitution0);
      jSTerm1.call();
      JSJshopVars.slash = 41;
      jSTerm1.matches(jSTerm0, (JSSubstitution) null);
      assertEquals(41, streamTokenizer0.ttype);
      
      boolean boolean0 = jSTerm0.isGround();
      assertTrue(boolean0);
  }

  /**
  //Test case number: 47
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(>\"MH");
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
  //Test case number: 48
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      StringReader stringReader0 = new StringReader("(-c29H4)");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      StringReader stringReader1 = new StringReader("JH):RF$}!F8");
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
  //Test case number: 49
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(<h9D%;H 6:})P*");
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
  //Test case number: 50
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(+V*L[.Ffh");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.lowerCaseMode(false);
      streamTokenizer0.sval = streamTokenizer0.sval;
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
  //Test case number: 51
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(>");
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