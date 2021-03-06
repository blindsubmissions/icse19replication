/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 15:34:14 GMT 2018
 */

package umd.cs.shop;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StreamTokenizer;
import java.io.StringReader;
import java.util.Collection;
import java.util.Comparator;
import java.util.ListIterator;
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
public class JSPredicateForm_ESTest extends JSPredicateForm_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = "k$$@g_gNG";
      JSPredicateForm jSPredicateForm0 = null;
      try {
        jSPredicateForm0 = new JSPredicateForm("k$$@g_gNG");
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
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      jSPredicateForm0.print();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      // Undeclared exception!
      try { 
        jSPredicateForm0.applySubstitutionPF(jSSubstitution0);
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
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      StringBuffer stringBuffer0 = jSPredicateForm0.toStr();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSSubstitution0.removeElement(stringBuffer0);
      jSPredicateForm0.removeElement(stringBuffer0);
      jSSubstitution0.add((Object) null);
      jSPredicateForm0.removeAll(jSSubstitution0);
      jSPredicateForm0.addAll(0, (Collection) jSSubstitution0);
      JSJshopVars.semicolon = 0;
      // Undeclared exception!
      try { 
        jSPredicateForm0.print();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      StringBuffer stringBuffer0 = jSPredicateForm0.toStr();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSSubstitution0.removeElement(stringBuffer0);
      jSPredicateForm0.isEmpty();
      jSPredicateForm0.removeAll(jSSubstitution0);
      jSPredicateForm0.addAll(0, (Collection) jSSubstitution0);
      JSJshopVars.semicolon = 0;
      jSPredicateForm0.print();
      jSPredicateForm0.print();
      jSPredicateForm0.print();
      JSPredicateForm jSPredicateForm1 = null;
      jSPredicateForm0.equals((JSPredicateForm) null);
      // Undeclared exception!
      try { 
        jSPredicateForm0.clonePF();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.019814992492946
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) "Line : ");
      JSPredicateForm jSPredicateForm0 = jSTerm0.clonePF();
      StringReader stringReader0 = new StringReader("Line : ");
      JSPredicateForm jSPredicateForm1 = jSPredicateForm0.clonePF();
      JSSubstitution jSSubstitution0 = jSPredicateForm0.matches((JSPredicateForm) jSTerm0);
      jSPredicateForm0.matches((JSPredicateForm) jSTerm0);
      jSPredicateForm1.standarizerPredicateForm();
      JSPredicateForm jSPredicateForm2 = new JSPredicateForm();
      jSPredicateForm2.addAll((Collection) jSPredicateForm1);
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      jSPredicateForm2.applySubstitutionPF(jSSubstitution0);
      jSPredicateForm0.standarizerPredicateForm();
      JSPredicateForm jSPredicateForm3 = new JSPredicateForm();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSPredicateForm jSPredicateForm4 = null;
      try {
        jSPredicateForm4 = new JSPredicateForm(streamTokenizer0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.6957425341696346
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) "Line : ");
      JSPredicateForm jSPredicateForm0 = jSTerm0.clonePF();
      jSTerm0.print();
      boolean boolean0 = jSPredicateForm0.equals((JSPredicateForm) null);
      JSPredicateForm jSPredicateForm1 = jSTerm0.clonePF();
      JSSubstitution jSSubstitution0 = jSPredicateForm0.matches((JSPredicateForm) jSTerm0);
      jSPredicateForm0.matches(jSPredicateForm1);
      JSPredicateForm jSPredicateForm2 = jSPredicateForm1.standarizerPredicateForm();
      jSPredicateForm0.addAll((Collection) jSSubstitution0);
      JSSubstitution jSSubstitution1 = jSPredicateForm2.matches((JSPredicateForm) jSTerm0, jSSubstitution0);
      JSSubstitution jSSubstitution2 = new JSSubstitution();
      JSJshopVars.semicolon = 837;
      jSSubstitution2.clear();
      JSPredicateForm jSPredicateForm3 = new JSPredicateForm();
      JSSubstitution jSSubstitution3 = jSPredicateForm1.matches(jSPredicateForm0, jSSubstitution1);
      assertNotSame(jSPredicateForm2, jSPredicateForm1);
      assertFalse(jSSubstitution3.fail());
      
      boolean boolean1 = jSPredicateForm0.equals(jSPredicateForm3);
      assertTrue(boolean1 == boolean0);
      
      JSPredicateForm jSPredicateForm4 = jSTerm0.clonePF();
      assertNotSame(jSPredicateForm4, jSPredicateForm0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringReader stringReader0 = new StringReader("O");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSPredicateForm jSPredicateForm0 = jSTerm0.clonePF();
      jSPredicateForm0.iterator();
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      jSPredicateForm0.sort(comparator0);
      jSTerm0.equals(jSPredicateForm0);
      jSPredicateForm0.print();
      jSPredicateForm0.toStr();
      jSTerm0.standarizerPredicateForm();
      JSJshopVars.minus = (-1);
      StringReader stringReader1 = new StringReader("F$XVQ2=r2%jVG[Q}jH");
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader0);
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
  //Test case number: 8
  /*Coverage entropy=1.4941751382893085
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) "Line : ");
      StringReader stringReader0 = new StringReader("oi e : ");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm2 = new JSTerm(streamTokenizer0);
      jSTerm1.add((Object) jSTerm2);
      jSTerm2.clonePF();
      jSTerm1.print();
      jSTerm2.equals((JSPredicateForm) jSTerm0);
      jSTerm0.clonePF();
      // Undeclared exception!
      try { 
        jSTerm2.matches((JSPredicateForm) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.7328679513998633
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) "Liae : ");
      JSPredicateForm jSPredicateForm0 = jSTerm0.clonePF();
      jSTerm0.print();
      jSPredicateForm0.equals((JSPredicateForm) null);
      JSTerm jSTerm1 = new JSTerm();
      jSPredicateForm0.matches((JSPredicateForm) jSTerm0);
      jSPredicateForm0.matches((JSPredicateForm) jSTerm1);
      // Undeclared exception!
      try { 
        jSTerm1.standarizerPredicateForm();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      String string0 = "not";
      jSTerm0.add((Object) "not");
      // Undeclared exception!
      try { 
        jSTerm0.clonePF();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1 >= 1
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.798652206252129
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = "e";
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) "Line : ");
      JSPredicateForm jSPredicateForm0 = jSTerm0.clonePF();
      StringReader stringReader0 = new StringReader("");
      JSPredicateForm jSPredicateForm1 = jSTerm0.clonePF();
      Predicate<Integer> predicate0 = Predicate.isEqual((Object) "");
      jSTerm0.removeIf(predicate0);
      jSPredicateForm1.matches(jSPredicateForm0);
      JSSubstitution jSSubstitution0 = jSTerm0.matches(jSPredicateForm1);
      JSPredicateForm jSPredicateForm2 = jSPredicateForm0.standarizerPredicateForm();
      JSPredicateForm jSPredicateForm3 = new JSPredicateForm();
      jSSubstitution0.retainAll(jSTerm0);
      jSPredicateForm2.addAll((Collection) jSPredicateForm0);
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      JSSubstitution jSSubstitution2 = new JSSubstitution();
      JSPredicateForm jSPredicateForm4 = jSPredicateForm0.applySubstitutionPF(jSSubstitution2);
      jSPredicateForm4.toStr();
      // Undeclared exception!
      try { 
        jSPredicateForm2.standarizerPredicateForm();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(@tEni");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.parseNumbers();
      streamTokenizer0.nval = 0.0;
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
  //Test case number: 13
  /*Coverage entropy=0.410116318288409
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = "(YtEni";
      StringReader stringReader0 = new StringReader("(YtEni");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.parseNumbers();
      streamTokenizer0.nval = 0.0;
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
  //Test case number: 14
  /*Coverage entropy=1.8397895868412517
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      System.setCurrentTimeMillis(2068L);
      StringReader stringReader0 = new StringReader("8U3n9bdHB/$&8Yr");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSPredicateForm jSPredicateForm0 = jSTerm0.clonePF();
      jSTerm0.iterator();
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      jSPredicateForm0.sort(comparator0);
      jSTerm0.equals(jSPredicateForm0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      JSPredicateForm jSPredicateForm1 = jSTerm1.clonePF();
      jSTerm1.standarizerPredicateForm();
      JSPredicateForm jSPredicateForm2 = new JSPredicateForm();
      boolean boolean0 = jSPredicateForm0.equals((JSPredicateForm) jSTerm0);
      assertTrue(boolean0);
      
      StringBuffer stringBuffer0 = jSPredicateForm1.toStr();
      assertEquals(5, stringBuffer0.length());
      
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSPredicateForm jSPredicateForm3 = jSTerm1.applySubstitutionPF(jSSubstitution0);
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      JSSubstitution jSSubstitution2 = jSTerm0.matches(jSPredicateForm3, jSSubstitution1);
      assertTrue(jSSubstitution2.fail());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.5359610497090694
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm("(T$:sQEc$){/cSqf.");
      JSPredicateForm jSPredicateForm1 = new JSPredicateForm("(T$:sQEc$){/cSqf.");
      assertEquals(1, jSPredicateForm1.size());
      
      boolean boolean0 = jSPredicateForm0.equals(jSPredicateForm1);
      assertTrue(boolean0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StringReader stringReader0 = new StringReader("8U3n9bdHB/$&8Yr");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
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
  //Test case number: 17
  /*Coverage entropy=1.15374194270109
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StringReader stringReader0 = new StringReader("8U3n9bdHB/$&8Yr");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.add((Object) jSTerm0);
      JSPredicateForm jSPredicateForm0 = jSTerm0.standarizerPredicateForm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.equals(jSPredicateForm0);
      jSPredicateForm0.toStr();
      JSTerm jSTerm1 = new JSTerm();
      JSTerm jSTerm2 = new JSTerm();
      // Undeclared exception!
      try { 
        jSTerm1.addAll((-2), (Collection) jSTerm2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: -2
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.0832550105185086
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StringReader stringReader0 = new StringReader("8U3{9bdHB/$&8Y");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.add((Object) jSTerm0);
      streamTokenizer0.nextToken();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.equals((JSPredicateForm) jSTerm0);
      jSTerm0.add((Object) jSTerm0);
      jSTerm0.matches((JSPredicateForm) jSTerm0);
      System.setCurrentTimeMillis(0L);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.6865700306609468
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StringReader stringReader0 = new StringReader("8U3n9bdHB/$&8Yr");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.add((Object) jSTerm0);
      JSPredicateForm jSPredicateForm0 = jSTerm0.standarizerPredicateForm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSPredicateForm jSPredicateForm1 = jSPredicateForm0.standarizerPredicateForm();
      jSPredicateForm1.addAll((Collection) jSTerm0);
      JSPredicateForm jSPredicateForm2 = jSTerm0.applySubstitutionPF(jSSubstitution0);
      jSTerm0.print();
      jSTerm0.standarizerPredicateForm();
      stringReader0.reset();
      jSPredicateForm2.toStr();
      JSPredicateForm jSPredicateForm3 = jSTerm0.clonePF();
      jSPredicateForm3.standarizerPredicateForm();
      jSPredicateForm2.applySubstitutionPF(jSSubstitution0);
      jSPredicateForm0.matches((JSPredicateForm) jSTerm0, jSSubstitution0);
      jSPredicateForm1.clone();
      assertEquals("[8.0, [8.0], 8.0, [8.0, (this Collection)]]", jSPredicateForm1.toString());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.6434177197931796
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StringReader stringReader0 = new StringReader("8U3n9bdHB/$&8Yr");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSPredicateForm jSPredicateForm0 = jSTerm0.standarizerPredicateForm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSPredicateForm0.addAll((Collection) jSTerm0);
      JSPredicateForm jSPredicateForm1 = jSTerm0.applySubstitutionPF(jSSubstitution0);
      jSTerm0.print();
      jSTerm0.standarizerPredicateForm();
      stringReader0.reset();
      jSPredicateForm1.toStr();
      JSPredicateForm jSPredicateForm2 = new JSPredicateForm((String) null);
      jSPredicateForm1.standarizerPredicateForm();
      System.setCurrentTimeMillis((-2));
      System.setCurrentTimeMillis((-1069L));
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
}
