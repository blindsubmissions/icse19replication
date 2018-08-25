/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 16:39:45 GMT 2018
 */

package umd.cs.shop;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.Reader;
import java.io.StreamTokenizer;
import java.io.StringReader;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Predicate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;
import umd.cs.shop.JSJshopVars;
import umd.cs.shop.JSPredicateForm;
import umd.cs.shop.JSSubstitution;
import umd.cs.shop.JSTerm;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSPredicateForm_ESTest extends JSPredicateForm_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringReader stringReader0 = new StringReader("VG-=7<mv81b9");
      stringReader0.ready();
      stringReader0.read();
      char[] charArray0 = new char[6];
      charArray0[0] = '4';
      charArray0[1] = 'k';
      charArray0[2] = 'h';
      charArray0[3] = '2';
      charArray0[4] = 'c';
      stringReader0.skip(1652L);
      charArray0[5] = '9';
      stringReader0.read(charArray0, 0, 0);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.resetSyntax();
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
  //Test case number: 1
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
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
  //Test case number: 2
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      jSPredicateForm0.print();
      String string0 = "";
      JSPredicateForm jSPredicateForm1 = null;
      try {
        jSPredicateForm1 = new JSPredicateForm("");
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
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      jSPredicateForm0.toStr();
      JSPredicateForm jSPredicateForm1 = new JSPredicateForm();
      int int0 = 2255;
      List list0 = new JSSubstitution();
      jSPredicateForm0.listIterator();
      jSPredicateForm1.print();
      jSPredicateForm1.addElement(jSPredicateForm0);
      // Undeclared exception!
      try { 
        jSPredicateForm0.equals(jSPredicateForm1);
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
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringReader stringReader0 = new StringReader("PlanningDomain: error");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.eolIsSignificant(true);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSPredicateForm jSPredicateForm0 = jSTerm0.clonePF();
      jSTerm0.makeVariable();
      jSPredicateForm0.containsAll(jSTerm0);
      JSJshopVars.minus = 32;
      JSPredicateForm jSPredicateForm1 = jSTerm0.clonePF();
      jSTerm0.equals(jSPredicateForm1);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = jSTerm1.matches((JSPredicateForm) jSTerm0);
      jSPredicateForm1.matches(jSPredicateForm0, jSSubstitution0);
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
  //Test case number: 5
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringReader stringReader0 = new StringReader("PlanningDomain: error");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.ordinaryChars(1914, (-3));
      streamTokenizer0.eolIsSignificant(true);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.toStr();
      JSPredicateForm jSPredicateForm0 = jSTerm0.standarizerPredicateForm();
      boolean boolean0 = jSTerm0.equals(jSPredicateForm0);
      assertTrue(boolean0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringReader stringReader0 = new StringReader("PlanningDomain: error");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.eolIsSignificant(true);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSPredicateForm jSPredicateForm0 = jSTerm0.clonePF();
      jSTerm0.makeVariable();
      jSPredicateForm0.containsAll(jSTerm0);
      streamTokenizer0.eolIsSignificant(true);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      StringBuffer stringBuffer0 = jSPredicateForm0.toStr();
      assertEquals(17, stringBuffer0.length());
      
      jSTerm1.standarizerPredicateForm();
      boolean boolean0 = jSTerm1.equals((JSPredicateForm) jSTerm0);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringReader stringReader0 = new StringReader("PlanningDomain: error");
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      streamTokenizer0.resetSyntax();
      System.setCurrentTimeMillis(32);
      JSPredicateForm jSPredicateForm0 = jSTerm0.applySubstitutionPF(jSSubstitution0);
      jSPredicateForm0.print();
      assertEquals(10, jSPredicateForm0.capacity());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringReader stringReader0 = new StringReader("PlanningDomain: error");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.eolIsSignificant(true);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm();
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm((String) null);
      jSTerm1.parallelStream();
      int int0 = (-599);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      char[] charArray0 = new char[4];
      charArray0[0] = '/';
      charArray0[1] = '_';
      charArray0[2] = 'i';
      charArray0[3] = '$';
      stringReader0.read(charArray0);
      // Undeclared exception!
      try { 
        jSTerm1.applySubstitutionPF(jSSubstitution0);
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
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = "PlanningDomain: error";
      StringReader stringReader0 = new StringReader("PlanningDomain: error");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.ordinaryChars((-3), (-1982585444));
      streamTokenizer0.eolIsSignificant(true);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.toStr();
      jSTerm0.add((Object) "PlanningDomain: error");
      // Undeclared exception!
      try { 
        jSTerm0.standarizerPredicateForm();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.4142790651247086
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringReader stringReader0 = new StringReader("PlanningDomain: error");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.eolIsSignificant(true);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSPredicateForm jSPredicateForm0 = jSTerm0.clonePF();
      jSTerm0.makeVariable();
      jSPredicateForm0.containsAll(jSTerm0);
      JSJshopVars.minus = 32;
      JSPredicateForm jSPredicateForm1 = jSTerm0.clonePF();
      jSTerm0.equals(jSPredicateForm1);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      jSTerm1.add((Object) "PlanningDomain: error");
      JSSubstitution jSSubstitution0 = jSTerm1.matches((JSPredicateForm) jSTerm0);
      jSPredicateForm1.matches(jSPredicateForm0, jSSubstitution0);
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
  /*Coverage entropy=1.3296613488547582
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      jSPredicateForm0.toStr();
      StringReader stringReader0 = new StringReader("54TY4,");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.eolIsSignificant(true);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.makeVariable();
      jSPredicateForm0.containsAll(jSTerm0);
      streamTokenizer0.eolIsSignificant(false);
      jSTerm0.clonePF();
      boolean boolean0 = jSTerm0.equals(jSPredicateForm0);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringReader stringReader0 = new StringReader("54.0");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.add((Object) null);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.toStr();
      jSTerm0.equals((JSPredicateForm) null);
      jSTerm0.equals((JSPredicateForm) null);
      // Undeclared exception!
      try { 
        jSTerm0.matches((JSPredicateForm) null, jSSubstitution0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.410116318288409
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringReader stringReader0 = new StringReader("4.0");
      stringReader0.markSupported();
      stringReader0.reset();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      stringReader0.read();
      jSTerm0.add((Object) jSTerm0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.matches((JSPredicateForm) jSTerm0, jSSubstitution0);
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
  //Test case number: 14
  /*Coverage entropy=1.6668756974308385
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringReader stringReader0 = new StringReader("4.0");
      stringReader0.markSupported();
      stringReader0.reset();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      stringReader0.read();
      jSTerm0.add((Object) jSTerm0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSPredicateForm jSPredicateForm0 = jSTerm0.applySubstitutionPF(jSSubstitution0);
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader0);
      JSPredicateForm jSPredicateForm1 = jSPredicateForm0.clonePF();
      jSPredicateForm1.toStr();
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      jSTerm0.matches(jSPredicateForm0, jSSubstitution1);
      // Undeclared exception!
      try { 
        jSTerm0.JSPredicateFormInit(streamTokenizer0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.7480673485460891
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringReader stringReader0 = new StringReader("4.0");
      stringReader0.markSupported();
      stringReader0.reset();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      stringReader0.read();
      jSTerm0.add((Object) jSTerm0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      streamTokenizer0.ordinaryChar((-2147483645));
      jSTerm0.toStr();
      jSTerm0.isEmpty();
      JSPredicateForm jSPredicateForm0 = jSTerm0.clonePF();
      JSPredicateForm jSPredicateForm1 = jSPredicateForm0.clonePF();
      System.setCurrentTimeMillis((-256L));
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      JSPredicateForm jSPredicateForm2 = jSTerm0.applySubstitutionPF(jSSubstitution0);
      jSPredicateForm2.print();
      JSPredicateForm jSPredicateForm3 = jSPredicateForm1.applySubstitutionPF(jSSubstitution1);
      jSPredicateForm2.equals(jSPredicateForm3);
      jSTerm0.toStr();
      JSPredicateForm jSPredicateForm4 = null;
      try {
        jSPredicateForm4 = new JSPredicateForm("");
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      Object[] objectArray0 = new Object[5];
      objectArray0[4] = (Object) jSSubstitution0;
      jSSubstitution0.toArray(objectArray0);
      String string0 = "( ";
      JSPredicateForm jSPredicateForm0 = null;
      try {
        jSPredicateForm0 = new JSPredicateForm("( ");
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      String string0 = "()";
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
  //Test case number: 18
  /*Coverage entropy=0.5004024235381879
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      String string0 = "(<";
      JSPredicateForm jSPredicateForm0 = null;
      try {
        jSPredicateForm0 = new JSPredicateForm("(<");
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
  /*Coverage entropy=1.357977854987324
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StringReader stringReader0 = new StringReader("mff:");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSPredicateForm jSPredicateForm0 = jSTerm0.standarizerPredicateForm();
      jSPredicateForm0.clonePF();
      JSPredicateForm jSPredicateForm1 = null;
      try {
        jSPredicateForm1 = new JSPredicateForm("(dHJ");
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }
}
