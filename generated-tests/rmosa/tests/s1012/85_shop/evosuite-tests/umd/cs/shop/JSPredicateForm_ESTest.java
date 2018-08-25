/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 10:44:11 GMT 2018
 */

package umd.cs.shop;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StreamTokenizer;
import java.io.StringReader;
import java.util.Collection;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.util.SystemInUtil;
import org.junit.runner.RunWith;
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
      String string0 = "(QQu,u#K";
      JSPredicateForm jSPredicateForm0 = null;
      try {
        jSPredicateForm0 = new JSPredicateForm("(QQu,u#K");
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
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = null;
      try {
        jSPredicateForm0 = new JSPredicateForm("Expecting variable name in term");
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
  /*Coverage entropy=1.0751393240053735
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringReader stringReader0 = new StringReader("IL~}r)#.");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      stringReader0.skip(41);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.isGround();
      jSSubstitution0.removeAllElements();
      streamTokenizer0.quoteChar(41);
      jSTerm0.add((Object) jSTerm0);
      stringReader0.skip(0L);
      JSTerm jSTerm1 = new JSTerm();
      jSTerm0.add((Object) streamTokenizer0);
      jSTerm0.matches((JSPredicateForm) jSTerm1);
      // Undeclared exception!
      try { 
        jSTerm0.standarizerPredicateForm();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringReader stringReader0 = new StringReader("6p^C'N_l62+L5X@");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.slashStarComments(false);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSPredicateForm jSPredicateForm0 = jSTerm0.applySubstitutionPF(jSSubstitution0);
      assertEquals(10, jSPredicateForm0.capacity());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StreamTokenizer streamTokenizer0 = null;
      JSPredicateForm jSPredicateForm0 = null;
      try {
        jSPredicateForm0 = new JSPredicateForm((StreamTokenizer) null);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      jSPredicateForm0.print();
      assertEquals("[]", jSPredicateForm0.toString());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSTerm jSTerm1 = new JSTerm();
      jSTerm0.add((Object) jSTerm1);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = jSTerm0.matches((JSPredicateForm) jSTerm1, jSSubstitution0);
      assertTrue(jSSubstitution1.fail());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
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
  //Test case number: 8
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Expecting Term");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      streamTokenizer0.quoteChar(32);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution1 = jSTerm0.matches((JSPredicateForm) jSTerm1, jSSubstitution0);
      assertTrue(jSSubstitution1.fail());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.45056120886630463
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringReader stringReader0 = new StringReader("IL~}r)#.");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.pushBack();
      streamTokenizer0.pushBack();
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader0);
      streamTokenizer0.pushBack();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm();
      jSTerm0.add((Object) jSTerm1);
      jSTerm0.toStr();
      JSTerm jSTerm2 = jSTerm0.cloneT();
      boolean boolean0 = jSTerm0.equals((JSPredicateForm) jSTerm0);
      jSTerm0.toStr();
      boolean boolean1 = jSTerm0.equals((JSPredicateForm) jSTerm2);
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      StringBuffer stringBuffer0 = jSPredicateForm0.toStr();
      assertEquals("", stringBuffer0.toString());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.0114042647073516
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringReader stringReader0 = new StringReader("It~}[)#.");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      streamTokenizer0.resetSyntax();
      JSPredicateForm jSPredicateForm0 = jSTerm0.clonePF();
      jSPredicateForm0.print();
      jSTerm0.print();
      assertTrue(jSTerm0.isConstant());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm((String) null);
      jSPredicateForm0.addElement((Object) null);
      // Undeclared exception!
      try { 
        jSPredicateForm0.toStr();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.0114042647073516
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringReader stringReader0 = new StringReader("It~}[)#.");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.nval = 1155.406481408761;
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSPredicateForm jSPredicateForm0 = jSTerm0.standarizerPredicateForm();
      StringBuffer stringBuffer0 = jSPredicateForm0.toStr();
      assertEquals("(It[)", stringBuffer0.toString());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.45056120886630463
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringReader stringReader0 = new StringReader(" Np}t)#y");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      StringReader stringReader1 = new StringReader(" Np}t)#y");
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader1);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      streamTokenizer0.lowerCaseMode(false);
      stringReader0.skip((-240L));
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.isGround();
      streamTokenizer1.nextToken();
      jSSubstitution0.removeAllElements();
      Integer integer0 = new Integer(41);
      jSTerm0.removeElement(streamTokenizer1);
      StreamTokenizer streamTokenizer2 = new StreamTokenizer(stringReader1);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer2);
      jSTerm0.equals((JSPredicateForm) jSTerm1);
      boolean boolean0 = jSTerm1.equals((JSPredicateForm) jSTerm0);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.0114042647073516
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringReader stringReader0 = new StringReader(" mm}t)#y");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = jSTerm0.cloneT();
      jSTerm1.toStr();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSSubstitution0.add((Object) jSTerm1);
      stringReader0.read();
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      JSPredicateForm jSPredicateForm0 = jSTerm1.standarizerPredicateForm();
      JSPredicateForm jSPredicateForm1 = jSPredicateForm0.standarizerPredicateForm();
      jSPredicateForm1.add((Object) stringReader0);
      // Undeclared exception!
      try { 
        jSPredicateForm1.print();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.io.StringReader cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      boolean boolean0 = jSPredicateForm0.equals((JSPredicateForm) null);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StringReader stringReader0 = new StringReader("IL~}r)#.");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.add((Object) "unexpected");
      jSTerm0.toStr();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      // Undeclared exception!
      try { 
        jSTerm0.applySubstitutionPF(jSSubstitution0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = "";
      JSPredicateForm jSPredicateForm0 = null;
      try {
        jSPredicateForm0 = new JSPredicateForm("()");
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StringReader stringReader0 = new StringReader("IL~}`)#.");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.pushBack();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.add((Object) jSTerm0);
      boolean boolean0 = jSTerm0.equals((JSPredicateForm) jSTerm0);
      assertTrue(boolean0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.34883209584303193
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = "(%";
      JSPredicateForm jSPredicateForm0 = null;
      try {
        jSPredicateForm0 = new JSPredicateForm("(%");
        fail("Expecting exception: Error");
      
      } catch(Error e) {
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
      StringReader stringReader0 = new StringReader(" Ll}r)#y");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.slashSlashComments(false);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSPredicateForm jSPredicateForm0 = jSTerm0.standarizerPredicateForm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSPredicateForm0.add((Object) streamTokenizer0);
      // Undeclared exception!
      try { 
        jSPredicateForm0.toStr();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.io.StreamTokenizer cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.5004024235381879
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StringReader stringReader0 = new StringReader(" Np}t)#y");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      StringReader stringReader1 = new StringReader(" Np}t)#y");
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader1);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      stringReader0.skip((-240L));
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.isGround();
      jSSubstitution0.removeAllElements();
      streamTokenizer1.quoteChar(41);
      Object object0 = jSTerm0.clone();
      jSTerm0.add(object0);
      Integer integer0 = new Integer((-4));
      jSTerm0.add((Object) integer0);
      stringReader0.ready();
      // Undeclared exception!
      try { 
        jSTerm0.matches((JSPredicateForm) jSTerm0, jSSubstitution0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.8599672810355049
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StringReader stringReader0 = new StringReader("IL~}r)#.");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      stringReader0.skip(41);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.isGround();
      jSSubstitution0.removeAllElements();
      streamTokenizer0.quoteChar(41);
      jSTerm0.add((Object) jSTerm0);
      JSPredicateForm jSPredicateForm0 = jSTerm0.standarizerPredicateForm();
      jSTerm0.matches(jSPredicateForm0, jSSubstitution0);
      StringBuffer stringBuffer0 = jSTerm0.toStr();
      assertEquals("ILr ", stringBuffer0.toString());
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.4437572842601484
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = null;
      try {
        jSPredicateForm0 = new JSPredicateForm("(RXuk 3H,u#[");
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm("(QQu,)#K");
      assertEquals("[QQu,]", jSPredicateForm0.toString());
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.37677016125643675
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = null;
      try {
        jSPredicateForm0 = new JSPredicateForm("(!Ako~A/xP;vQGO0");
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  /**
  //Test case number: 27
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String string0 = "(!&ko~A/xP;vQGO0";
      JSPredicateForm jSPredicateForm0 = null;
      try {
        jSPredicateForm0 = new JSPredicateForm("(!&ko~A/xP;vQGO0");
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
      String string0 = "(!Ako~AxP$QG<)";
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm("(!Ako~AxP$QG<)");
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      // Undeclared exception!
      try { 
        jSPredicateForm0.insertElementAt(jSPredicateForm0, 3474);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3474 > 1
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 29
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = null;
      try {
        jSPredicateForm0 = new JSPredicateForm("(Qou,ue ");
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StringReader stringReader0 = new StringReader(" Np}t)#y");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      StringReader stringReader1 = new StringReader(" Np}t)#y");
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader1);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      stringReader0.skip((-240L));
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.isGround();
      jSSubstitution0.removeAllElements();
      streamTokenizer0.quoteChar(737);
      Integer integer0 = new Integer(737);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer1);
      JSTerm jSTerm2 = new JSTerm();
      jSTerm1.add((Object) jSTerm2);
      jSTerm0.add((Object) jSTerm1);
      stringReader0.ready();
      JSSubstitution jSSubstitution1 = jSTerm1.matches((JSPredicateForm) jSTerm0, jSSubstitution0);
      assertTrue(jSSubstitution1.fail());
      
      JSPredicateForm jSPredicateForm0 = jSTerm0.clonePF();
      StringBuffer stringBuffer0 = jSPredicateForm0.toStr();
      assertEquals("(NptNpt )", stringBuffer0.toString());
  }
}
