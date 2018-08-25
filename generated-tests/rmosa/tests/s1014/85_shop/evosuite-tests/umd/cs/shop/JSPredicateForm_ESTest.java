/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 11:48:47 GMT 2018
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
      String string0 = "(JOx";
      JSPredicateForm jSPredicateForm0 = null;
      try {
        jSPredicateForm0 = new JSPredicateForm("(JOx");
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
      StringReader stringReader0 = new StringReader("(og!,;|fv_~i9Zyv+");
      stringReader0.skip(1994L);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
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
      StringReader stringReader0 = new StringReader("(NOt");
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader0);
      JSPredicateForm jSPredicateForm0 = null;
      try {
        jSPredicateForm0 = new JSPredicateForm(streamTokenizer1);
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      // Undeclared exception!
      try { 
        jSTerm0.JSPredicateFormInit((StreamTokenizer) null);
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
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      jSPredicateForm0.addElement("nor");
      jSPredicateForm0.toStr();
      StringBuffer stringBuffer0 = jSPredicateForm0.toStr();
      assertEquals("(nor)", stringBuffer0.toString());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.639031859650177
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringReader stringReader0 = new StringReader("K^Oq)&");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      char[] charArray0 = new char[3];
      charArray0[0] = 'Y';
      charArray0[1] = '4';
      charArray0[2] = 'B';
      stringReader0.read(charArray0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      jSSubstitution1.iterator();
      jSSubstitution1.add((Object) "K^Oq)&");
      JSTerm jSTerm1 = (JSTerm)jSTerm0.clone();
      jSTerm0.add((Object) jSTerm1);
      JSPredicateForm jSPredicateForm0 = jSTerm0.clonePF();
      jSTerm1.containsAll(jSPredicateForm0);
      assertEquals("[KOq, [KOq]]", jSPredicateForm0.toString());
      
      stringReader0.read();
      jSTerm0.print();
      boolean boolean0 = jSTerm0.equals((JSPredicateForm) jSTerm0);
      boolean boolean1 = jSTerm1.equals((JSPredicateForm) jSTerm0);
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
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
  //Test case number: 7
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      StringBuffer stringBuffer0 = jSPredicateForm0.toStr();
      assertEquals("", stringBuffer0.toString());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.0751393240053735
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringReader stringReader0 = new StringReader("K^Oq)&");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      Object[] objectArray0 = new Object[0];
      jSSubstitution0.toArray(objectArray0);
      jSSubstitution0.iterator();
      jSTerm0.add((Object) jSTerm0);
      JSPredicateForm jSPredicateForm0 = jSTerm0.applySubstitutionPF(jSSubstitution0);
      jSTerm0.matches(jSPredicateForm0);
      JSJshopVars.greaterT = (-71);
      JSSubstitution jSSubstitution1 = jSPredicateForm0.matches((JSPredicateForm) jSTerm0, jSSubstitution0);
      assertFalse(jSSubstitution1.fail());
      
      jSPredicateForm0.isEmpty();
      jSSubstitution0.instance(jSTerm0);
      System.setCurrentTimeMillis((-71));
      JSPredicateForm jSPredicateForm1 = jSPredicateForm0.applySubstitutionPF(jSSubstitution0);
      assertNotSame(jSPredicateForm1, jSPredicateForm0);
      assertEquals("[KOq, [KOq]]", jSPredicateForm0.toString());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.46341355882643
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      StringReader stringReader0 = new StringReader("(M j+jDCJAe6-");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.parseNumbers();
      jSPredicateForm0.print();
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
  //Test case number: 10
  /*Coverage entropy=0.34883209584303193
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringReader stringReader0 = new StringReader("K^Oq)&");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      jSSubstitution1.iterator();
      jSSubstitution1.add((Object) "K^Oq)&");
      JSTerm jSTerm1 = (JSTerm)jSTerm0.clone();
      jSTerm0.add((Object) jSTerm1);
      stringReader0.read();
      jSTerm0.print();
      boolean boolean0 = jSTerm0.equals((JSPredicateForm) jSTerm0);
      boolean boolean1 = jSTerm1.equals((JSPredicateForm) jSTerm0);
      assertFalse(boolean1 == boolean0);
      
      boolean boolean2 = jSTerm0.equals((JSPredicateForm) null);
      assertFalse(boolean2);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.5359610497090694
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      jSPredicateForm0.addElement("(bbol");
      JSTerm jSTerm0 = new JSTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSPredicateForm0.matches((JSPredicateForm) jSTerm0, jSSubstitution0);
      StringReader stringReader0 = new StringReader("(bbol");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.commentChar((-20637127));
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
  //Test case number: 12
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm((String) null);
      assertTrue(jSPredicateForm0.isEmpty());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      jSPredicateForm0.addElement("not");
      // Undeclared exception!
      try { 
        jSPredicateForm0.clonePF();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1 >= 1
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
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      jSPredicateForm0.addElement("not");
      // Undeclared exception!
      try { 
        jSPredicateForm0.standarizerPredicateForm();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1 >= 1
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) jSPredicateForm0);
      jSPredicateForm0.retainAll(jSTerm0);
      jSPredicateForm0.addElement("nor");
      jSPredicateForm0.print();
      assertEquals(10, jSPredicateForm0.capacity());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.remove((Object) jSPredicateForm0);
      jSTerm0.add((Object) jSPredicateForm0);
      jSPredicateForm0.retainAll(jSTerm0);
      jSPredicateForm0.add((Object) "nor");
      jSPredicateForm0.addElement("nor");
      // Undeclared exception!
      try { 
        jSPredicateForm0.print();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.5359610497090694
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      StringReader stringReader0 = new StringReader("(NOQ");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.resetSyntax();
      jSPredicateForm0.print();
      streamTokenizer0.quoteChar(37);
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
  //Test case number: 18
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      jSPredicateForm0.addElement("V|Jy{L@IY(pm{7");
      StringReader stringReader0 = new StringReader("V|Jy{L@IY(pm{7");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      boolean boolean0 = jSPredicateForm0.equals((JSPredicateForm) jSTerm0);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.6559757323365467
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      SystemInUtil.addInputLine("(not");
      jSPredicateForm0.addElement("(bbol");
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) "(not");
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = jSTerm0.matches(jSPredicateForm0, jSSubstitution0);
      StringReader stringReader0 = new StringReader("(bbol");
      jSSubstitution1.parallelStream();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      jSSubstitution1.add((Object) streamTokenizer0);
      streamTokenizer0.nval = 2788.0;
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
  //Test case number: 20
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StringReader stringReader0 = new StringReader("K^Oq)&");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.add((Object) jSTerm0);
      JSPredicateForm jSPredicateForm0 = jSTerm0.standarizerPredicateForm();
      assertEquals("[KOq, [KOq]]", jSPredicateForm0.toString());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.37677016125643675
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = null;
      try {
        jSPredicateForm0 = new JSPredicateForm("( !Ox");
        fail("Expecting exception: Error");
      
      } catch(Error e) {
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
      StringReader stringReader0 = new StringReader("K^Oq)&");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.add((Object) jSTerm0);
      JSJshopVars.greaterT = (-71);
      JSSubstitution jSSubstitution1 = jSTerm0.matches((JSPredicateForm) jSTerm0, jSSubstitution0);
      assertFalse(jSSubstitution1.fail());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      jSPredicateForm0.addElement("nor");
      jSPredicateForm0.addElement("nor");
      // Undeclared exception!
      try { 
        jSPredicateForm0.toStr();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = null;
      try {
        jSPredicateForm0 = new JSPredicateForm("( !");
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
  /*Coverage entropy=0.34883209584303193
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StringReader stringReader0 = new StringReader("K^Oq)&");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      jSSubstitution1.iterator();
      JSTerm jSTerm1 = new JSTerm();
      jSTerm0.add((Object) jSTerm1);
      jSSubstitution1.add((Object) "K^Oq)&");
      JSTerm jSTerm2 = (JSTerm)jSTerm0.clone();
      jSTerm0.add((Object) jSTerm2);
      stringReader0.read();
      jSTerm0.print();
      boolean boolean0 = jSTerm0.equals((JSPredicateForm) jSTerm0);
      boolean boolean1 = jSTerm2.equals((JSPredicateForm) jSTerm0);
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm("(abo)sl");
      assertEquals(10, jSPredicateForm0.capacity());
  }

  /**
  //Test case number: 27
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      JSTerm jSTerm0 = new JSTerm();
      StringReader stringReader0 = new StringReader("(!w_ K");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
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
  //Test case number: 28
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      StringReader stringReader0 = new StringReader("(M 4Oj+jEDCJe6-");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
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
  //Test case number: 29
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.addElement("not");
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      // Undeclared exception!
      try { 
        jSTerm0.applySubstitutionPF(jSSubstitution0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1 >= 1
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 30
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      jSPredicateForm0.addElement("not");
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      // Undeclared exception!
      try { 
        jSPredicateForm0.matches(jSPredicateForm0, jSSubstitution0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1 >= 1
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 31
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = null;
      try {
        jSPredicateForm0 = new JSPredicateForm("()jo/");
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  /**
  //Test case number: 32
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(N ");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
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
  //Test case number: 33
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      jSPredicateForm0.addElement("not");
      // Undeclared exception!
      try { 
        jSPredicateForm0.toStr();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1 >= 1
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 34
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      jSPredicateForm0.addElement("not");
      // Undeclared exception!
      try { 
        jSPredicateForm0.print();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1 >= 1
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 35
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.addElement("not");
      // Undeclared exception!
      try { 
        jSTerm0.equals((JSPredicateForm) jSTerm0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1 >= 1
         //
         verifyException("java.util.Vector", e);
      }
  }
}