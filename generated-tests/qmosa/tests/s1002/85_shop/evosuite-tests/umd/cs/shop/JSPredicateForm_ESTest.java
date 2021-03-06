/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 10:07:12 GMT 2018
 */

package umd.cs.shop;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StreamTokenizer;
import java.io.StringReader;
import java.nio.CharBuffer;
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
      JSPredicateForm jSPredicateForm0 = null;
      try {
        jSPredicateForm0 = new JSPredicateForm(" ) ");
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
        jSPredicateForm0 = new JSPredicateForm("(\"kwn>!1");
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
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      jSPredicateForm0.print();
      StringReader stringReader0 = new StringReader("Expecting variable name in term");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.nval = 1657.66519425801;
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSPredicateForm0.matches((JSPredicateForm) jSTerm0);
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
  //Test case number: 3
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringReader stringReader0 = new StringReader("umd.cs.shop.JSPredicateForm");
      stringReader0.close();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.nval = 0.0;
      streamTokenizer0.commentChar(3512);
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader0);
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
  //Test case number: 4
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      jSPredicateForm0.print();
      StringReader stringReader0 = new StringReader("Expecting variable name in term");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.nval = 1656.1207011131453;
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSPredicateForm0.matches((JSPredicateForm) jSTerm0);
      JSPredicateForm jSPredicateForm1 = jSTerm0.standarizerPredicateForm();
      StringBuffer stringBuffer0 = jSPredicateForm1.toStr();
      assertEquals(11, stringBuffer0.length());
      
      JSSubstitution jSSubstitution0 = jSPredicateForm1.matches(jSPredicateForm0);
      assertTrue(jSSubstitution0.fail());
      
      JSPredicateForm jSPredicateForm2 = new JSPredicateForm();
      JSPredicateForm jSPredicateForm3 = jSPredicateForm1.clonePF();
      JSSubstitution jSSubstitution1 = jSTerm0.matches(jSPredicateForm3);
      assertNotSame(jSPredicateForm3, jSPredicateForm1);
      assertFalse(jSSubstitution1.fail());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      String string0 = "X2LBvQ";
      StringReader stringReader0 = new StringReader("X2LBvQ");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.equals((JSPredicateForm) null);
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
  //Test case number: 6
  /*Coverage entropy=2.0075563074378375
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringReader stringReader0 = new StringReader("UpTt 5RP");
      StringReader stringReader1 = new StringReader("Expecting variable name in term");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader1);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer1);
      jSTerm0.matches((JSPredicateForm) jSTerm1);
      jSTerm1.standarizerPredicateForm();
      JSPredicateForm jSPredicateForm0 = jSTerm1.clonePF();
      jSPredicateForm0.toStr();
      jSPredicateForm0.matches((JSPredicateForm) jSTerm0);
      JSPredicateForm jSPredicateForm1 = new JSPredicateForm();
      JSTerm jSTerm2 = new JSTerm(streamTokenizer1);
      jSTerm2.print();
      StreamTokenizer streamTokenizer2 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm3 = new JSTerm(streamTokenizer2);
      JSTerm jSTerm4 = new JSTerm();
      JSPredicateForm jSPredicateForm2 = null;
      try {
        jSPredicateForm2 = new JSPredicateForm(streamTokenizer0);
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
  /*Coverage entropy=1.8891591637540217
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      jSPredicateForm0.print();
      StringReader stringReader0 = new StringReader("Expecting variable name in term");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.nval = 1656.1207011131453;
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSPredicateForm jSPredicateForm1 = jSTerm0.standarizerPredicateForm();
      jSPredicateForm0.toStr();
      JSSubstitution jSSubstitution0 = jSPredicateForm1.matches(jSPredicateForm0);
      assertTrue(jSSubstitution0.fail());
      
      JSPredicateForm jSPredicateForm2 = new JSPredicateForm();
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      jSTerm0.print();
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm2 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution1 = jSTerm1.matches(jSPredicateForm1);
      assertTrue(jSSubstitution1.fail());
      
      JSPredicateForm jSPredicateForm3 = jSTerm1.standarizerPredicateForm();
      boolean boolean0 = jSTerm0.equals(jSPredicateForm3);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringReader stringReader0 = new StringReader("UpTt 5RP");
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
  //Test case number: 9
  /*Coverage entropy=0.410116318288409
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(FM?_&*^l1\u0006*gw");
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
  //Test case number: 10
  /*Coverage entropy=1.844621476365503
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringReader stringReader0 = new StringReader("UpTt 5RP");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSPredicateForm jSPredicateForm0 = jSTerm1.standarizerPredicateForm();
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      JSPredicateForm jSPredicateForm1 = new JSPredicateForm();
      JSPredicateForm jSPredicateForm2 = jSPredicateForm0.clonePF();
      jSPredicateForm1.setSize(1);
      JSTerm jSTerm2 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution2 = jSTerm1.matches(jSPredicateForm1);
      assertTrue(jSSubstitution2.fail());
      
      jSTerm0.standarizerPredicateForm();
      JSJshopVars.exclamation = (-77733981);
      boolean boolean0 = jSTerm1.equals(jSPredicateForm2);
      StringBuffer stringBuffer0 = jSPredicateForm0.toStr();
      assertEquals("(5.0)", stringBuffer0.toString());
      
      boolean boolean1 = jSPredicateForm2.equals(jSPredicateForm1);
      assertFalse(boolean1 == boolean0);
      assertNotSame(jSPredicateForm2, jSPredicateForm0);
      assertFalse(boolean1);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringReader stringReader0 = new StringReader("UpTt 5RP");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSPredicateForm jSPredicateForm0 = jSTerm1.standarizerPredicateForm();
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      stringReader0.reset();
      JSPredicateForm jSPredicateForm1 = new JSPredicateForm();
      JSPredicateForm jSPredicateForm2 = jSPredicateForm0.clonePF();
      jSPredicateForm1.setSize(1);
      JSTerm jSTerm2 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution2 = jSTerm1.matches(jSPredicateForm1);
      assertTrue(jSSubstitution2.fail());
      
      JSPredicateForm jSPredicateForm3 = jSTerm1.standarizerPredicateForm();
      jSPredicateForm3.standarizerPredicateForm();
      boolean boolean0 = jSTerm1.equals(jSPredicateForm2);
      assertTrue(boolean0);
      
      jSPredicateForm0.print();
      assertNotSame(jSPredicateForm0, jSPredicateForm2);
      assertNotSame(jSPredicateForm0, jSPredicateForm3);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.9701814400260844
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringReader stringReader0 = new StringReader("UpTt 5RP");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSPredicateForm jSPredicateForm0 = jSTerm0.standarizerPredicateForm();
      jSTerm1.toStr();
      jSPredicateForm0.matches((JSPredicateForm) jSTerm0);
      JSPredicateForm jSPredicateForm1 = jSPredicateForm0.standarizerPredicateForm();
      jSPredicateForm1.toStr();
      jSPredicateForm0.containsAll(jSSubstitution0);
      jSPredicateForm0.matches(jSPredicateForm1);
      JSPredicateForm jSPredicateForm2 = jSPredicateForm1.clonePF();
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      JSSubstitution jSSubstitution2 = new JSSubstitution();
      jSPredicateForm1.applySubstitutionPF(jSSubstitution2);
      JSPredicateForm jSPredicateForm3 = new JSPredicateForm((String) null);
      jSPredicateForm2.setSize(2095);
      JSSubstitution jSSubstitution3 = jSTerm0.matches(jSPredicateForm0);
      // Undeclared exception!
      try { 
        jSPredicateForm2.applySubstitutionPF(jSSubstitution3);
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
  /*Coverage entropy=1.8130821353869817
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      jSPredicateForm0.print();
      StringReader stringReader0 = new StringReader("8uL,8^#(");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.iterator();
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      jSTerm0.add((Object) jSTerm1);
      jSPredicateForm0.matches((JSPredicateForm) jSTerm0);
      jSPredicateForm0.toStr();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.clonePF();
      JSPredicateForm jSPredicateForm1 = jSTerm0.clonePF();
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader0);
      jSTerm0.matches(jSPredicateForm1);
      jSTerm0.standarizerPredicateForm();
      jSTerm0.equals((JSPredicateForm) jSTerm0);
      // Undeclared exception!
      try { 
        stringReader0.read((char[]) null, (-4), (-1));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.7682865045653187
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      jSPredicateForm0.print();
      StringReader stringReader0 = new StringReader("8uL,8^#(");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.iterator();
      jSTerm0.add((Object) jSTerm0);
      jSPredicateForm0.matches((JSPredicateForm) jSTerm0);
      jSPredicateForm0.toStr();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.clonePF();
      JSPredicateForm jSPredicateForm1 = jSTerm0.clonePF();
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader0);
      jSTerm0.matches(jSPredicateForm1);
      jSTerm0.standarizerPredicateForm();
      jSTerm0.equals((JSPredicateForm) jSTerm0);
      // Undeclared exception!
      try { 
        CharBuffer.wrap((CharSequence) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.CharBuffer", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.7666900269684687
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      jSPredicateForm0.print();
      StringReader stringReader0 = new StringReader("8uL,8^#(");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.iterator();
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      jSTerm0.add((Object) jSTerm1);
      JSSubstitution jSSubstitution0 = jSPredicateForm0.matches((JSPredicateForm) jSTerm0);
      jSPredicateForm0.toStr();
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader0);
      JSPredicateForm jSPredicateForm1 = new JSPredicateForm();
      JSSubstitution jSSubstitution2 = new JSSubstitution();
      JSPredicateForm jSPredicateForm2 = jSTerm0.standarizerPredicateForm();
      jSTerm1.equals(jSPredicateForm1);
      JSPredicateForm jSPredicateForm3 = jSPredicateForm2.applySubstitutionPF(jSSubstitution0);
      JSPredicateForm jSPredicateForm4 = jSPredicateForm3.standarizerPredicateForm();
      JSSubstitution jSSubstitution3 = jSPredicateForm3.matches(jSPredicateForm4, jSSubstitution2);
      assertFalse(jSSubstitution3.fail());
      
      StringBuffer stringBuffer0 = jSPredicateForm4.toStr();
      assertEquals("(8.0%%% )", stringBuffer0.toString());
      
      boolean boolean0 = jSPredicateForm3.equals(jSPredicateForm1);
      assertFalse(boolean0);
      
      jSPredicateForm4.print();
      JSSubstitution jSSubstitution4 = new JSSubstitution();
      jSPredicateForm1.matches(jSPredicateForm3, jSSubstitution4);
      assertTrue(jSPredicateForm3.equals((Object)jSPredicateForm2));
      assertEquals(2, jSPredicateForm3.size());
  }
}
