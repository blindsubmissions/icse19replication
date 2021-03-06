/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 13:22:40 GMT 2018
 */

package umd.cs.shop;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.Reader;
import java.io.StreamTokenizer;
import java.io.StringReader;
import java.util.Collection;
import java.util.Comparator;
import java.util.ListIterator;
import java.util.Spliterator;
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
public class JSPredicateForm_ESTest extends JSPredicateForm_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = "Expecting constant symbol as term";
      StringReader stringReader0 = new StringReader("Expecting constant symbol as term");
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
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm((String) null);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSSubstitution0.listIterator();
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
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      jSPredicateForm0.add((Object) jSTerm0);
      jSTerm0.isEmpty();
      jSTerm0.matches(jSPredicateForm0);
      // Undeclared exception!
      try { 
        jSPredicateForm0.clonePF();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // umd.cs.shop.JSTerm cannot be cast to java.lang.String
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.329661348854758
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      StringReader stringReader0 = new StringReader("R$ w=Q\nuP!g.Y)");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      jSTerm0.matches((JSPredicateForm) jSTerm1);
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
  //Test case number: 5
  /*Coverage entropy=1.4941751382893085
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      StringReader stringReader0 = new StringReader("R$ w=QGnuP!g.Y)");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      stringReader0.markSupported();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      jSTerm0.matches((JSPredicateForm) jSTerm0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      jSTerm0.equals((JSPredicateForm) jSTerm1);
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
  //Test case number: 6
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      StringReader stringReader0 = new StringReader("R$ w=QGNnuP!g.Y)");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      streamTokenizer0.parseNumbers();
      Object[] objectArray0 = new Object[9];
      objectArray0[0] = (Object) jSTerm0;
      objectArray0[1] = (Object) jSSubstitution0;
      objectArray0[2] = (Object) jSTerm0;
      objectArray0[3] = (Object) jSTerm0;
      objectArray0[4] = (Object) jSTerm0;
      objectArray0[5] = (Object) streamTokenizer0;
      objectArray0[6] = (Object) "R$ w=QGNnuP!g.Y)";
      objectArray0[7] = (Object) streamTokenizer0;
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      JSPredicateForm jSPredicateForm0 = jSTerm0.applySubstitutionPF(jSSubstitution0);
      boolean boolean0 = jSTerm0.equals(jSPredicateForm0);
      assertTrue(boolean0);
      
      StringBuffer stringBuffer0 = jSPredicateForm0.toStr();
      assertEquals(3, stringBuffer0.length());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      jSPredicateForm0.print();
      jSPredicateForm0.iterator();
      StringBuffer stringBuffer0 = jSPredicateForm0.toStr();
      assertEquals("", stringBuffer0.toString());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      StringReader stringReader0 = new StringReader("R$ w=QGNnuP!g.Y)");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      streamTokenizer0.parseNumbers();
      Object[] objectArray0 = new Object[9];
      objectArray0[0] = (Object) jSTerm0;
      objectArray0[1] = (Object) jSSubstitution0;
      objectArray0[2] = (Object) jSTerm0;
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      JSPredicateForm jSPredicateForm0 = jSTerm0.applySubstitutionPF(jSSubstitution0);
      JSPredicateForm jSPredicateForm1 = new JSPredicateForm();
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution2 = new JSSubstitution();
      JSPredicateForm jSPredicateForm2 = jSTerm0.applySubstitutionPF(jSSubstitution2);
      jSPredicateForm2.add((Object) jSPredicateForm0);
      // Undeclared exception!
      try { 
        jSPredicateForm2.print();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // umd.cs.shop.JSPredicateForm cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.equals((JSPredicateForm) null);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      // Undeclared exception!
      try { 
        jSTerm0.applySubstitutionPF(jSSubstitution0);
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
  /*Coverage entropy=1.6726254461503207
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringReader stringReader0 = new StringReader("8TX~)PU&VS0A(");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSPredicateForm jSPredicateForm0 = jSTerm0.standarizerPredicateForm();
      JSPredicateForm jSPredicateForm1 = jSPredicateForm0.applySubstitutionPF(jSSubstitution0);
      System.setCurrentTimeMillis((-2));
      jSTerm0.spliterator();
      System.setCurrentTimeMillis((-2));
      jSPredicateForm1.spliterator();
      System.setCurrentTimeMillis((-2191L));
      jSPredicateForm0.isEmpty();
      boolean boolean0 = jSPredicateForm1.equals((JSPredicateForm) jSTerm0);
      assertTrue(boolean0);
      
      JSPredicateForm jSPredicateForm2 = jSPredicateForm1.applySubstitutionPF(jSSubstitution0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      jSTerm0.add((Object) jSTerm1);
      JSPredicateForm jSPredicateForm3 = jSTerm0.clonePF();
      assertEquals("[8.0, [TX]]", jSPredicateForm3.toString());
      
      jSPredicateForm0.print();
      assertNotSame(jSPredicateForm0, jSPredicateForm2);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      System.setCurrentTimeMillis(0L);
      StringReader stringReader0 = new StringReader("( ");
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
  //Test case number: 12
  /*Coverage entropy=1.461472129304024
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringReader stringReader0 = new StringReader("8TX~)PU&VS0A(");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSPredicateForm jSPredicateForm0 = jSTerm0.standarizerPredicateForm();
      jSTerm0.standarizerPredicateForm();
      JSTerm jSTerm1 = jSTerm0.parseList(streamTokenizer0);
      jSPredicateForm0.sort((Comparator) null);
      JSPredicateForm jSPredicateForm1 = jSTerm0.standarizerPredicateForm();
      streamTokenizer0.nextToken();
      JSPredicateForm jSPredicateForm2 = jSTerm1.standarizerPredicateForm();
      JSPredicateForm jSPredicateForm3 = jSPredicateForm2.standarizerPredicateForm();
      jSPredicateForm3.print();
      jSPredicateForm1.spliterator();
      jSTerm0.removeAllElements();
      jSTerm1.spliterator();
      System.setCurrentTimeMillis((-1404L));
      jSPredicateForm2.isEmpty();
      jSPredicateForm3.equals(jSPredicateForm2);
      jSPredicateForm0.applySubstitutionPF(jSSubstitution0);
      jSPredicateForm2.print();
      // Undeclared exception!
      try { 
        jSPredicateForm0.elementAt((-366172151));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.6674619334292948
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringReader stringReader0 = new StringReader("8Tyt ~)PU&VS0(");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.slashStarComments(true);
      stringReader0.mark(2795);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.standarizerPredicateForm();
      jSTerm0.toStr();
      StringReader stringReader1 = new StringReader("8Tyt ~)PU&VS0(");
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader1);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer1);
      JSPredicateForm jSPredicateForm0 = jSTerm1.applySubstitutionPF(jSSubstitution0);
      jSPredicateForm0.addElement("umd.cs.shop.JSSubstitution");
      jSTerm1.equals((JSPredicateForm) jSTerm0);
      jSTerm0.equals(jSPredicateForm0);
      JSPredicateForm jSPredicateForm1 = jSTerm1.applySubstitutionPF(jSSubstitution0);
      jSTerm1.toStr();
      stringReader1.mark(0);
      jSPredicateForm1.clonePF();
      System.setCurrentTimeMillis(2756L);
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
  //Test case number: 14
  /*Coverage entropy=1.7086559473420695
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = "8TX~)PU&VS0A(";
      StringReader stringReader0 = new StringReader("8TX~)PU&VS0A(");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.ordinaryChar(189);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.standarizerPredicateForm();
      JSTerm jSTerm1 = jSTerm0.parseList(streamTokenizer0);
      jSTerm0.sort((Comparator) null);
      JSPredicateForm jSPredicateForm0 = jSTerm0.standarizerPredicateForm();
      streamTokenizer0.nextToken();
      JSPredicateForm jSPredicateForm1 = jSTerm1.standarizerPredicateForm();
      JSPredicateForm jSPredicateForm2 = jSPredicateForm1.standarizerPredicateForm();
      jSPredicateForm2.print();
      jSPredicateForm0.spliterator();
      UnaryOperator<JSTerm> unaryOperator0 = UnaryOperator.identity();
      jSPredicateForm0.replaceAll(unaryOperator0);
      jSTerm1.spliterator();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSPredicateForm jSPredicateForm3 = jSTerm1.applySubstitutionPF(jSSubstitution0);
      jSPredicateForm3.firstElement();
      jSPredicateForm1.matches((JSPredicateForm) jSTerm1, jSSubstitution0);
      jSTerm1.clonePF();
      // Undeclared exception!
      try { 
        jSTerm0.set((-3), jSPredicateForm0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3
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
      System.setCurrentTimeMillis(0L);
      JSJshopVars.verticalL = 442;
      JSPredicateForm jSPredicateForm0 = null;
      try {
        jSPredicateForm0 = new JSPredicateForm("(B ");
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
  /*Coverage entropy=0.2868359830561607
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JSJshopVars.verticalL = 442;
      JSPredicateForm jSPredicateForm0 = null;
      try {
        jSPredicateForm0 = new JSPredicateForm("(W*");
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
  /*Coverage entropy=0.509137344082687
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = null;
      try {
        jSPredicateForm0 = new JSPredicateForm("(hR},:NP_;O [^");
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
  /*Coverage entropy=0.760755259244303
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm("(hR},:NP_;OI)^");
      JSSubstitution jSSubstitution0 = null;
      JSPredicateForm jSPredicateForm1 = jSPredicateForm0.standarizerPredicateForm();
      jSPredicateForm0.spliterator();
      jSPredicateForm1.spliterator();
      JSPredicateForm jSPredicateForm2 = null;
      try {
        jSPredicateForm2 = new JSPredicateForm("");
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
  /*Coverage entropy=0.45056120886630463
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(!ug.Pifj^w=");
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
}
