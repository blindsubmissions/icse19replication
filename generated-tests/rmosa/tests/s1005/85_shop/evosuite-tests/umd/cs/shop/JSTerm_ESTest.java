/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 07:12:48 GMT 2018
 */

package umd.cs.shop;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StreamTokenizer;
import java.io.StringReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.util.SystemInUtil;
import org.junit.runner.RunWith;
import umd.cs.shop.JSJshopVars;
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
      StringReader stringReader0 = new StringReader("->");
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
      StringReader stringReader0 = new StringReader("(lakn}Y2|s?),?fm\"#");
      SystemInUtil.addInputLine("(lakn}Y2|s?),?fm\"#");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      boolean boolean0 = jSTerm0.isGround();
      assertFalse(jSTerm0.isEval());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.17884491271684755
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringReader stringReader0 = new StringReader("9(Zob ");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.iterator();
      jSTerm0.makeFunction();
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
  //Test case number: 3
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.makeVariable();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSSubstitution0.add((Object) jSTerm0);
      // Undeclared exception!
      try { 
        jSTerm0.applySubstitutionT(jSSubstitution0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.04138000510499
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(lakn}Y2|s?),?fm\"#");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      assertFalse(jSTerm0.isEval());
      
      JSTerm jSTerm1 = jSTerm0.call();
      assertEquals(10, jSTerm1.capacity());
      assertFalse(jSTerm1.isConstant());
      assertNotSame(jSTerm1, jSTerm0);
      assertTrue(jSTerm1.isFunction());
      assertFalse(jSTerm1.isVariable());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.556183821230542
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(>)");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.resetSyntax();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = jSTerm0.call();
      boolean boolean0 = jSTerm1.equals(jSTerm0);
      assertTrue(jSTerm1.isFunction());
      assertNotSame(jSTerm1, jSTerm0);
      assertTrue(boolean0);
      assertEquals(10, jSTerm1.capacity());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.makeVariable();
      boolean boolean0 = jSTerm0.isGround();
      assertTrue(jSTerm0.isVariable());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringReader stringReader0 = new StringReader("w VG");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.standardizerTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      assertTrue(jSSubstitution0.isEmpty());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.9320738874454946
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(l7Vn}YsU#<\"#");
      stringReader0.read();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.whitespaceChars(0, (-2211));
      streamTokenizer0.parseNumbers();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = jSTerm0.cloneT();
      assertFalse(jSTerm1.isVariable());
      assertFalse(jSTerm1.isFunction());
      assertTrue(jSTerm1.isConstant());
      
      boolean boolean0 = jSTerm0.isGround();
      assertTrue(boolean0);
      assertEquals("[%%%]", jSTerm0.toString());
      assertNotSame(jSTerm0, jSTerm1);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.4258484492385814
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(laVU}IYsJ?f6\"#");
      stringReader0.read();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = jSTerm0.call();
      assertTrue(jSTerm1.isConstant());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
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
  //Test case number: 11
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringReader stringReader0 = new StringReader("A M|K>6ir@jw[6?X");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.toStr();
      assertEquals(32, streamTokenizer0.ttype);
      assertEquals("Token[' '], line 1", streamTokenizer0.toString());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.3547772690411068
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.makeFunction();
      JSTerm jSTerm1 = (JSTerm)jSTerm0.clone();
      jSTerm0.addElement("(laVn}YsU#<\"#");
      StringReader stringReader0 = new StringReader("(laVn}YsU#<\"#");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      jSTerm1.matches(jSTerm0);
      streamTokenizer0.eolIsSignificant(false);
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
  //Test case number: 13
  /*Coverage entropy=0.7566199756619738
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(luX4L nS#");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      stringReader0.read();
      streamTokenizer0.whitespaceChars(40, 40);
      JSJshopVars.astherisk = (-4);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = jSTerm0.matches(jSTerm1, jSSubstitution0);
      assertEquals(32, streamTokenizer0.ttype);
      assertTrue(jSSubstitution1.equals((Object)jSSubstitution0));
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.7771358806162147
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringReader stringReader0 = new StringReader("w VG");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      streamTokenizer0.nextToken();
      jSTerm0.makeFunction();
      jSTerm0.standardizerTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.matches(jSTerm0, jSSubstitution0);
      assertEquals((-3), streamTokenizer0.ttype);
      assertFalse(jSTerm0.isConstant());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.48439011623800354
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(luX4L n^#");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      char[] charArray0 = new char[1];
      charArray0[0] = 'G';
      stringReader0.read(charArray0);
      JSJshopVars.astherisk = (-4);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader0);
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
  //Test case number: 16
  /*Coverage entropy=1.1240357221909014
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(>)");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm();
      boolean boolean0 = jSTerm0.equals(jSTerm1);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
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
  //Test case number: 18
  /*Coverage entropy=0.6096274235960984
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(lakn}Y2|s?#");
      stringReader0.read();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm();
      boolean boolean0 = jSTerm0.equals(jSTerm1);
      assertFalse(boolean0);
      assertEquals("[%%%]", jSTerm0.toString());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StringReader stringReader0 = new StringReader("( ");
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
  /*Coverage entropy=0.33422114621338295
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(luX4L nS#");
      char[] charArray0 = new char[4];
      charArray0[0] = 'x';
      charArray0[1] = '{';
      charArray0[2] = '<';
      charArray0[3] = 'F';
      stringReader0.read(charArray0);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSJshopVars.astherisk = (-4);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      boolean boolean0 = jSTerm0.isGround();
      assertEquals((-2), streamTokenizer0.ttype);
      assertTrue(boolean0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StringReader stringReader0 = new StringReader("w VG");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      streamTokenizer0.nextToken();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = jSTerm0.matches(jSTerm0, jSSubstitution0);
      assertEquals((-3), streamTokenizer0.ttype);
      assertFalse(jSSubstitution1.fail());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StringReader stringReader0 = new StringReader(".nRce");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      assertEquals((-2), streamTokenizer0.ttype);
      
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = jSTerm0.matches(jSTerm1, jSSubstitution0);
      assertTrue(jSSubstitution1.fail());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.addElement(".");
      jSTerm0.toStr();
      // Undeclared exception!
      try { 
        jSTerm0.subList(63, 63);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // toIndex = 63
         //
         verifyException("java.util.SubList", e);
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StringReader stringReader0 = new StringReader("? ");
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
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(;f}");
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
  //Test case number: 26
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?-m3'nWAD=<3PP!tx");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.nval = 333.0;
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.print();
      assertEquals("[?%%%]", jSTerm0.toString());
      assertTrue(jSTerm0.isVariable());
      assertFalse(jSTerm0.isFunction());
      assertFalse(jSTerm0.isConstant());
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.7163316357961729
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(>)");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.resetSyntax();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = jSTerm0.call();
      assertEquals(1, jSTerm1.size());
      
      jSTerm1.removeAll(jSTerm0);
      boolean boolean0 = jSTerm1.equals(jSTerm0);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.makeVariable();
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
  //Test case number: 29
  /*Coverage entropy=1.4184836619456562
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?-m3'nWAD=<3PP!tx");
      stringReader0.ready();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.remove((Object) null);
      JSTerm jSTerm1 = jSTerm0.call();
      assertFalse(jSTerm1.isConstant());
      assertEquals("[?%%%]", jSTerm0.toString());
      assertFalse(jSTerm1.isFunction());
      assertEquals(1, jSTerm1.capacity());
  }

  /**
  //Test case number: 30
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?-m3'nWAD=<3PP!tx");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      StringBuffer stringBuffer0 = jSTerm0.toStr();
      assertFalse(jSTerm0.isFunction());
      assertFalse(jSTerm0.isConstant());
      assertEquals(5, stringBuffer0.length());
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      int int0 = 347;
      jSTerm0.setSize(347);
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
  //Test case number: 32
  /*Coverage entropy=1.731174030483994
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      StringReader stringReader0 = new StringReader("km0Ro94)^");
      JSJshopVars.lessT = 40;
      JSJshopVars.dot = 40;
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm1 = jSTerm0.parseList(streamTokenizer0);
      jSTerm1.isGround();
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
  //Test case number: 33
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StringReader stringReader0 = new StringReader("B15Bty|jyY8{Z>),G");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      stringReader0.skip(41);
      jSTerm0.makeFunction();
      JSJshopVars.leftBrac = 41;
      jSTerm0.addElement("B15Bty|jyY8{Z>),G");
      // Undeclared exception!
      try { 
        jSTerm0.toStr();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  /**
  //Test case number: 34
  /*Coverage entropy=1.4034331435332974
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(>)");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSJshopVars.exclamation = 1490;
      jSTerm0.add((Object) streamTokenizer0);
      // Undeclared exception!
      try { 
        jSTerm0.call();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.io.StreamTokenizer cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  /**
  //Test case number: 35
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      StringReader stringReader0 = new StringReader("%I");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      assertEquals("[%I]", jSTerm0.toString());
  }

  /**
  //Test case number: 36
  /*Coverage entropy=1.781618808453643
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      StringReader stringReader0 = new StringReader("w VG");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      stringReader0.ready();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.makeVariable();
      streamTokenizer0.ordinaryChars(47, 47);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSSubstitution0.spliterator();
      JSTerm jSTerm1 = new JSTerm();
      jSTerm1.setSize(0);
      JSSubstitution jSSubstitution1 = jSTerm1.matches(jSTerm0, jSSubstitution0);
      assertTrue(jSTerm0.isVariable());
      assertFalse(jSSubstitution1.equals((Object)jSSubstitution0));
  }

  /**
  //Test case number: 37
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSTerm jSTerm1 = new JSTerm();
      jSTerm0.addElement(jSTerm1);
      jSTerm0.makeVariable();
      boolean boolean0 = jSTerm0.equals(jSTerm1);
      assertTrue(jSTerm0.isVariable());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 38
  /*Coverage entropy=1.666332585328325
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      SystemInUtil.addInputLine((String) null);
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.makeEval(true);
      jSTerm0.addElement(".");
      // Undeclared exception!
      try { 
        jSTerm0.call();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1 >= 1
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 39
  /*Coverage entropy=0.45056120886630463
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      SystemInUtil.addInputLine("%%%");
      jSTerm0.addElement("%%%");
      jSTerm0.print();
      jSTerm0.print();
      jSTerm0.setSize(2);
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
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      StringReader stringReader0 = new StringReader("km0Ro94)^");
      JSJshopVars.lessT = 40;
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm1 = jSTerm0.parseList(streamTokenizer0);
      jSTerm1.cloneT();
      System.setCurrentTimeMillis((-1042L));
  }

  /**
  //Test case number: 41
  /*Coverage entropy=1.9009814651385806
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      StringReader stringReader0 = new StringReader("km0Ro94)^");
      JSJshopVars.rightBrac = 1552;
      JSJshopVars.lessT = 40;
      JSJshopVars.dot = 40;
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm1 = jSTerm0.parseList(streamTokenizer0);
      JSJshopVars.VarCounter = 1552;
      jSTerm1.isGround();
      boolean boolean0 = jSTerm1.equals(jSTerm1);
      assertEquals(41, streamTokenizer0.ttype);
      assertTrue(boolean0);
  }

  /**
  //Test case number: 42
  /*Coverage entropy=1.7388948450374018
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      StringReader stringReader0 = new StringReader("km0Ro94)^");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm1 = jSTerm0.parseList(streamTokenizer0);
      jSTerm1.print();
      StringReader stringReader1 = null;
      try {
        stringReader1 = new StringReader((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  /**
  //Test case number: 43
  /*Coverage entropy=2.08705012098584
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      StringReader stringReader0 = new StringReader("km0Ro94)^");
      JSJshopVars.rightBrac = 1552;
      JSJshopVars.lessT = 40;
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm1 = jSTerm0.parseList(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm2 = jSTerm1.applySubstitutionT(jSSubstitution0);
      JSJshopVars.slash = (-1534);
      jSTerm1.matches(jSTerm2, jSSubstitution0);
      assertEquals(41, streamTokenizer0.ttype);
      assertNotSame(jSTerm1, jSTerm2);
  }

  /**
  //Test case number: 44
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?%%%");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = jSTerm0.matches(jSTerm1, jSSubstitution0);
      jSTerm0.matches(jSTerm1, jSSubstitution1);
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
  //Test case number: 45
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(NaiXr()Q'%]@");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      assertTrue(jSTerm0.isFunction());
  }

  /**
  //Test case number: 46
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(lVX4sU <\"#");
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
  //Test case number: 47
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
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

  /**
  //Test case number: 48
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(+aVn}YsfqU#t\"#");
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
  //Test case number: 49
  /*Coverage entropy=0.8979457248567797
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      StringReader stringReader0 = new StringReader("km0Do94)^");
      SystemInUtil.addInputLine("Expecting elements of the list");
      JSJshopVars.lessT = 1551;
      JSJshopVars.dot = (-3);
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
  //Test case number: 50
  /*Coverage entropy=0.9164648855394713
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      StringReader stringReader0 = new StringReader("km0Do94)^");
      SystemInUtil.addInputLine("Expecting elements of the list");
      JSJshopVars.dot = (-3);
      StringReader stringReader1 = new StringReader("Expecting elements of the list");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader1);
      streamTokenizer0.nextToken();
      streamTokenizer0.nval = (double) (-3);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSJshopVars.leftBrac = 1551;
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
  //Test case number: 51
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      StringReader stringReader0 = new StringReader("km0Ro94)^");
      JSJshopVars.rightBrac = 1552;
      JSJshopVars.lessT = 40;
      JSJshopVars.dot = 40;
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm1 = jSTerm0.parseList(streamTokenizer0);
      JSJshopVars.VarCounter = 1552;
      jSTerm1.add((Object) jSTerm0);
      jSTerm1.equals(jSTerm1);
      jSTerm1.isEval();
      assertEquals(41, streamTokenizer0.ttype);
      assertTrue(jSTerm1.isFunction());
  }

  /**
  //Test case number: 52
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(>{");
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
  //Test case number: 53
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.makeEval(true);
      jSTerm0.addElement("/^?$bcZGD");
      jSTerm0.print();
      assertTrue(jSTerm0.isEval());
  }

  /**
  //Test case number: 54
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(-,aNFVn8nFYqI\"]");
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
  //Test case number: 55
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      SystemInUtil.addInputLine((String) null);
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.makeVariable();
      jSTerm0.makeEval(true);
      jSTerm0.addElement(".");
      jSTerm0.call();
      jSTerm0.print();
      assertTrue(jSTerm0.isEval());
  }

  /**
  //Test case number: 56
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(<lakn}Y2|s?,?fm\"#");
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
  //Test case number: 57
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(<=laVn}Y2Rs?,?fm\"");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader0);
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
}
