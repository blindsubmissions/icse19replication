/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 19:07:43 GMT 2018
 */

package umd.cs.shop;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StreamTokenizer;
import java.io.StringReader;
import java.nio.CharBuffer;
import java.util.function.UnaryOperator;
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
public class JSPredicateForm_ESTest extends JSPredicateForm_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.2868359830561607
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = null;
      try {
        jSPredicateForm0 = new JSPredicateForm("(HBND");
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.2868359830561607
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      StringReader stringReader0 = new StringReader("(aaQL");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      stringReader0.read();
      streamTokenizer0.slashStarComments(false);
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader0);
      streamTokenizer0.quoteChar(723);
      // Undeclared exception!
      try { 
        jSPredicateForm0.JSPredicateFormInit(streamTokenizer0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.34883209584303193
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(#Q >s");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSPredicateForm jSPredicateForm0 = null;
      try {
        jSPredicateForm0 = new JSPredicateForm(streamTokenizer0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.5359610497090694
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      JSPredicateForm jSPredicateForm1 = null;
      try {
        jSPredicateForm1 = new JSPredicateForm((StreamTokenizer) null);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringReader stringReader0 = new StringReader("K@N@U +");
      SystemInUtil.addInputLine("K@N@U +");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.add((Object) streamTokenizer0);
      jSTerm0.stream();
      // Undeclared exception!
      try { 
        jSTerm0.standarizerPredicateForm();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.io.StreamTokenizer cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringReader stringReader0 = new StringReader("7;T`)yxNnZXigd");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.commentChar((-1433272149));
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSPredicateForm jSPredicateForm0 = jSTerm0.applySubstitutionPF(jSSubstitution0);
      assertEquals("[7.0]", jSPredicateForm0.toString());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.5004024235381879
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringReader stringReader0 = new StringReader("N@O@U +");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.pushBack();
      SystemInUtil.addInputLine("N@O@U +");
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      stringReader0.read();
      SystemInUtil.addInputLine("nu");
      streamTokenizer0.slashSlashComments(true);
      stringReader0.close();
      jSTerm0.toStr();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSSubstitution0.stream();
      JSSubstitution jSSubstitution1 = jSTerm0.matches((JSPredicateForm) jSTerm0, jSSubstitution0);
      assertFalse(jSSubstitution1.fail());
      
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      JSSubstitution jSSubstitution2 = jSTerm0.matches(jSPredicateForm0, jSSubstitution0);
      assertTrue(jSSubstitution2.fail());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.37677016125643675
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringReader stringReader0 = new StringReader("5Xm^;lr*[&");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = (JSTerm)jSTerm0.clone();
      jSTerm0.add((Object) jSTerm1);
      jSTerm0.equals((JSPredicateForm) jSTerm0);
      jSTerm1.add((Object) stringReader0);
      char[] charArray0 = new char[1];
      // Undeclared exception!
      try { 
        stringReader0.read(charArray0, (-2960), 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm((String) null);
      assertTrue(jSPredicateForm0.isEmpty());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = null;
      try {
        jSPredicateForm0 = new JSPredicateForm("(");
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      jSPredicateForm0.print();
      assertEquals("[]", jSPredicateForm0.toString());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.34883209584303193
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = "(4+z0.sY";
      JSPredicateForm jSPredicateForm0 = null;
      try {
        jSPredicateForm0 = new JSPredicateForm("(4+z0.sY");
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.410116318288409
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringReader stringReader0 = new StringReader("N@O@U +");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.pushBack();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      stringReader0.read();
      SystemInUtil.addInputLine("N@O@U +");
      streamTokenizer0.slashSlashComments(true);
      stringReader0.close();
      jSTerm0.ensureCapacity(59);
      jSTerm0.equals((JSPredicateForm) jSTerm0);
      JSTerm jSTerm1 = new JSTerm();
      jSTerm1.add((Object) null);
      jSTerm0.equals((JSPredicateForm) jSTerm1);
      // Undeclared exception!
      try { 
        jSTerm1.print();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.0735428464085233
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = "K@NU ";
      StringReader stringReader0 = new StringReader("K@NU ");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      stringReader0.markSupported();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      char[] charArray0 = new char[1];
      charArray0[0] = 'm';
      stringReader0.read(charArray0);
      jSTerm0.ensureCapacity(565);
      streamTokenizer0.commentChar(565);
      char[] charArray1 = new char[4];
      jSTerm0.isGround();
      stringReader0.read(charArray1);
      jSTerm0.toStr();
      // Undeclared exception!
      try { 
        jSTerm0.matches((JSPredicateForm) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.410116318288409
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringReader stringReader0 = new StringReader("N@O@U +");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.pushBack();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      stringReader0.read();
      SystemInUtil.addInputLine("N@O@U +");
      streamTokenizer0.slashSlashComments(true);
      stringReader0.close();
      jSTerm0.ensureCapacity(59);
      jSTerm0.equals((JSPredicateForm) jSTerm0);
      JSTerm jSTerm1 = new JSTerm();
      jSTerm0.equals((JSPredicateForm) jSTerm1);
      // Undeclared exception!
      try { 
        jSTerm1.print();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.48509409130221154
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      StringReader stringReader0 = new StringReader("(Q >s");
      int int0 = 222;
      JSJshopVars.semicolon = 222;
      jSPredicateForm0.add((Object) "(Q >s");
      jSPredicateForm0.toStr();
      StringReader stringReader1 = new StringReader("Unexpected ) while reading Predicate");
      stringReader0.reset();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.quoteChar(723);
      // Undeclared exception!
      try { 
        jSPredicateForm0.JSPredicateFormInit(streamTokenizer0);
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
  /*Coverage entropy=0.48509409130221154
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      StringReader stringReader0 = new StringReader("(Q >s");
      JSJshopVars.semicolon = 222;
      jSPredicateForm0.toStr();
      StringReader stringReader1 = new StringReader("Unexpected ) while reading Predicate");
      stringReader0.reset();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.quoteChar(723);
      // Undeclared exception!
      try { 
        jSPredicateForm0.JSPredicateFormInit(streamTokenizer0);
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
  /*Coverage entropy=0.45056120886630463
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Expecting ')' Tor ter7.");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.nextToken();
      streamTokenizer0.nextToken();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      streamTokenizer0.slashStarComments(true);
      stringReader0.close();
      jSTerm0.ensureCapacity(39);
      jSTerm0.print();
      jSTerm0.toStr();
      boolean boolean0 = jSTerm0.equals((JSPredicateForm) jSTerm0);
      assertTrue(boolean0);
      
      boolean boolean1 = jSTerm0.equals((JSPredicateForm) null);
      assertFalse(boolean1);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StringReader stringReader0 = new StringReader("5Xm^;lr*[&");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = jSTerm0.matches((JSPredicateForm) jSTerm1, jSSubstitution0);
      assertTrue(jSSubstitution1.fail());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StringReader stringReader0 = new StringReader("7;T`)yxNnZXigd");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.commentChar((-1433272149));
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.add((Object) streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      // Undeclared exception!
      try { 
        jSTerm0.applySubstitutionPF(jSSubstitution0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.io.StreamTokenizer cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.0114042647073516
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StringReader stringReader0 = new StringReader("K@N@U +");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      streamTokenizer0.slashSlashComments(true);
      stringReader0.close();
      jSTerm0.ensureCapacity((-1174));
      jSTerm0.toStr();
      jSTerm0.toStr();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSPredicateForm jSPredicateForm0 = jSTerm0.standarizerPredicateForm();
      jSPredicateForm0.print();
      jSPredicateForm0.setSize(32);
      // Undeclared exception!
      try { 
        jSPredicateForm0.print();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.0114042647073516
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StringReader stringReader0 = new StringReader("K@N@U +");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.ensureCapacity(32);
      jSTerm0.print();
      JSPredicateForm jSPredicateForm0 = jSTerm0.standarizerPredicateForm();
      jSPredicateForm0.setSize(62);
      // Undeclared exception!
      try { 
        jSPredicateForm0.toStr();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StringReader stringReader0 = new StringReader("5Xm^;lr9[&");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.add((Object) jSTerm0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.makeFunction();
      JSSubstitution jSSubstitution1 = jSTerm0.matches((JSPredicateForm) jSTerm0, jSSubstitution0);
      assertFalse(jSSubstitution1.fail());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.8599672810355049
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StringReader stringReader0 = new StringReader("5Xm^;lr*[&");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = (JSTerm)jSTerm0.clone();
      jSTerm0.add((Object) jSTerm1);
      JSPredicateForm jSPredicateForm0 = jSTerm0.clonePF();
      stringReader0.markSupported();
      jSPredicateForm0.isEmpty();
      jSTerm1.add((Object) stringReader0);
      char[] charArray0 = new char[1];
      JSJshopVars.astherisk = (-1440898369);
      charArray0[0] = 'g';
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm1.containsAll(jSTerm1);
      stringReader0.close();
      jSPredicateForm0.ensureCapacity((-2));
      jSTerm0.print();
      jSTerm1.toStr();
      JSSubstitution jSSubstitution1 = jSTerm0.matches(jSPredicateForm0, jSSubstitution0);
      assertFalse(jSSubstitution1.fail());
      assertEquals("[5.0, [5.0]]", jSPredicateForm0.toString());
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.45056120886630463
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Expecting ')' Tor ter7.");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.nextToken();
      streamTokenizer0.nextToken();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      streamTokenizer0.slashStarComments(true);
      JSTerm jSTerm1 = new JSTerm();
      jSTerm0.add((Object) jSTerm1);
      stringReader0.close();
      jSTerm0.ensureCapacity(39);
      jSTerm0.print();
      jSTerm0.toStr();
      boolean boolean0 = jSTerm0.equals((JSPredicateForm) jSTerm0);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.46341355882643
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String string0 = "(Q hs";
      JSPredicateForm jSPredicateForm0 = null;
      try {
        jSPredicateForm0 = new JSPredicateForm("(Q hs");
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StringReader stringReader0 = new StringReader("5Xm^;lr*[&");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      jSTerm0.add((Object) jSTerm1);
      streamTokenizer0.resetSyntax();
      JSPredicateForm jSPredicateForm0 = jSTerm0.clonePF();
      jSTerm1.add((Object) stringReader0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm1.makeFunction();
      JSSubstitution jSSubstitution1 = jSTerm0.matches(jSPredicateForm0, jSSubstitution0);
      assertEquals(2, jSPredicateForm0.size());
      assertTrue(jSSubstitution1.fail());
  }

  /**
  //Test case number: 27
  /*Coverage entropy=0.37677016125643675
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String string0 = "(!h";
      JSPredicateForm jSPredicateForm0 = null;
      try {
        jSPredicateForm0 = new JSPredicateForm("(!h");
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      String string0 = "(Q ";
      JSPredicateForm jSPredicateForm0 = null;
      try {
        jSPredicateForm0 = new JSPredicateForm("(Q ");
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String string0 = "(Q 2>s";
      JSPredicateForm jSPredicateForm0 = null;
      try {
        jSPredicateForm0 = new JSPredicateForm("(Q 2>s");
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
  /*Coverage entropy=0.6837389058487535
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      StringReader stringReader0 = new StringReader("(!h");
      jSPredicateForm0.toStr();
      StringReader stringReader1 = new StringReader("(!h");
      stringReader1.reset();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader1);
      int int0 = 737;
      streamTokenizer0.resetSyntax();
      streamTokenizer0.quoteChar(737);
      // Undeclared exception!
      try { 
        jSPredicateForm0.JSPredicateFormInit(streamTokenizer0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  /**
  //Test case number: 31
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(R*UxX~Ci)8rI");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      stringReader0.ready();
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm("(R*UxX~Ci)8rI");
      // Undeclared exception!
      try { 
        jSPredicateForm0.insertElementAt("(R*UxX~Ci)8rI", (-4));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 32
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = null;
      try {
        jSPredicateForm0 = new JSPredicateForm("()&!h");
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }
}
