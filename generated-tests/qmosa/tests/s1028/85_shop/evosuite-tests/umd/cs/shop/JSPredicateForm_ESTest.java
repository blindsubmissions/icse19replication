/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 17:34:13 GMT 2018
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
public class JSPredicateForm_ESTest extends JSPredicateForm_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringReader stringReader0 = new StringReader("oD\"mlhLJYKgb");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.resetSyntax();
      streamTokenizer0.parseNumbers();
      stringReader0.reset();
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
      JSPredicateForm jSPredicateForm0 = null;
      try {
        jSPredicateForm0 = new JSPredicateForm("");
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
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
  //Test case number: 3
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringReader stringReader0 = new StringReader("y3ttrJeDOBsSDVu4");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      streamTokenizer0.nval = 1300.2890111;
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSPredicateForm jSPredicateForm0 = jSTerm0.applySubstitutionPF(jSSubstitution0);
      JSPredicateForm jSPredicateForm1 = jSPredicateForm0.clonePF();
      Consumer<JSPredicateForm> consumer0 = (Consumer<JSPredicateForm>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      jSPredicateForm1.forEach(consumer0);
      JSPredicateForm jSPredicateForm2 = jSTerm0.standarizerPredicateForm();
      jSPredicateForm2.trimToSize();
      jSPredicateForm0.equals(jSPredicateForm1);
      jSPredicateForm2.matches(jSPredicateForm0);
      jSTerm0.toStr();
      UnaryOperator.identity();
      UnaryOperator<String> unaryOperator0 = UnaryOperator.identity();
      unaryOperator0.apply("y3ttrJeDOBsSDVu4");
      jSPredicateForm1.replaceAll(unaryOperator0);
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
  //Test case number: 4
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringReader stringReader0 = new StringReader("y3ttrJeDOBsSDVu4");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      streamTokenizer0.nval = 1300.2890111;
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSPredicateForm jSPredicateForm0 = jSTerm0.applySubstitutionPF(jSSubstitution0);
      JSPredicateForm jSPredicateForm1 = jSPredicateForm0.clonePF();
      Consumer<JSPredicateForm> consumer0 = (Consumer<JSPredicateForm>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      jSPredicateForm1.forEach(consumer0);
      JSPredicateForm jSPredicateForm2 = jSTerm0.standarizerPredicateForm();
      jSPredicateForm2.trimToSize();
      jSPredicateForm0.equals(jSPredicateForm1);
      JSPredicateForm jSPredicateForm3 = jSTerm0.clonePF();
      jSPredicateForm3.print();
      UnaryOperator<String> unaryOperator0 = UnaryOperator.identity();
      JSJshopVars.leftPar = 0;
      jSSubstitution0.replaceAll(unaryOperator0);
      jSPredicateForm2.toStr();
      // Undeclared exception!
      try { 
        jSPredicateForm0.removeElementAt((-4273));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: -4273
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.626020692420754
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringReader stringReader0 = new StringReader("y3ttrJeDOBsSDVu4");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      streamTokenizer0.nval = 1300.2890111;
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSPredicateForm jSPredicateForm0 = jSTerm0.applySubstitutionPF(jSSubstitution0);
      JSPredicateForm jSPredicateForm1 = jSPredicateForm0.clonePF();
      Consumer<JSPredicateForm> consumer0 = (Consumer<JSPredicateForm>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      jSPredicateForm1.forEach(consumer0);
      JSPredicateForm jSPredicateForm2 = jSTerm0.standarizerPredicateForm();
      jSPredicateForm2.trimToSize();
      jSPredicateForm0.equals(jSPredicateForm1);
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      jSTerm0.toStr();
      UnaryOperator.identity();
      UnaryOperator<String> unaryOperator0 = UnaryOperator.identity();
      unaryOperator0.apply("y3ttrJeDOBsSDVu4");
      jSSubstitution0.add((Object) jSPredicateForm0);
      JSSubstitution jSSubstitution2 = new JSSubstitution();
      jSSubstitution0.add((Object) null);
      JSPredicateForm jSPredicateForm3 = new JSPredicateForm();
      jSPredicateForm3.setSize(2366);
      jSPredicateForm3.matches(jSPredicateForm1, jSSubstitution1);
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
  //Test case number: 6
  /*Coverage entropy=1.8891591637540217
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringReader stringReader0 = new StringReader("y3ttrJeDOBsSDVu4");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      streamTokenizer0.nval = 1300.2890111;
      stringReader0.read();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSPredicateForm jSPredicateForm0 = jSTerm0.applySubstitutionPF(jSSubstitution0);
      jSPredicateForm0.clonePF();
      Consumer<JSTerm> consumer0 = (Consumer<JSTerm>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      jSTerm0.forEach(consumer0);
      JSPredicateForm jSPredicateForm1 = jSTerm0.standarizerPredicateForm();
      jSPredicateForm1.trimToSize();
      JSPredicateForm jSPredicateForm2 = new JSPredicateForm((String) null);
      boolean boolean0 = jSPredicateForm1.equals(jSPredicateForm2);
      assertFalse(boolean0);
      
      JSPredicateForm jSPredicateForm3 = jSTerm0.clonePF();
      jSTerm0.add((Object) stringReader0);
      UnaryOperator.identity();
      JSSubstitution jSSubstitution1 = jSPredicateForm3.matches(jSPredicateForm1, jSSubstitution0);
      assertFalse(jSSubstitution1.fail());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = "y3ttrJeDOBsSDVu4";
      StringReader stringReader0 = new StringReader("y3ttrJeDOBsSDVu4");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSPredicateForm jSPredicateForm0 = jSTerm0.applySubstitutionPF(jSSubstitution0);
      stringReader0.ready();
      Consumer<JSPredicateForm> consumer0 = (Consumer<JSPredicateForm>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      jSPredicateForm0.forEach(consumer0);
      Object object0 = new Object();
      jSTerm0.add(object0);
      // Undeclared exception!
      try { 
        jSTerm0.standarizerPredicateForm();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringReader stringReader0 = new StringReader("y3ttrJeDOBsSDVu4");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.add((Object) "y3ttrJeDOBsSDVu4");
      streamTokenizer0.nval = 1300.2890111;
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      // Undeclared exception!
      try { 
        jSTerm0.clonePF();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.5571130980576458
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringReader stringReader0 = new StringReader(".$Gp");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSPredicateForm jSPredicateForm0 = jSTerm0.standarizerPredicateForm();
      JSPredicateForm jSPredicateForm1 = jSPredicateForm0.clonePF();
      StringReader stringReader1 = new StringReader("bxa?xw$RaaMWFOE$");
      char[] charArray0 = new char[8];
      charArray0[0] = 'N';
      charArray0[1] = '0';
      charArray0[2] = 'h';
      charArray0[3] = 'N';
      charArray0[4] = 'N';
      charArray0[5] = '0';
      charArray0[6] = 'h';
      charArray0[7] = 'h';
      stringReader1.read(charArray0);
      jSTerm0.clonePF();
      jSPredicateForm1.print();
      jSTerm0.add((Object) streamTokenizer0);
      System.setCurrentTimeMillis(2048L);
      JSSubstitution jSSubstitution1 = new JSSubstitution();
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
  //Test case number: 10
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
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
  //Test case number: 11
  /*Coverage entropy=1.818483163012365
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringReader stringReader0 = new StringReader(".$Gp");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSPredicateForm jSPredicateForm0 = jSTerm0.clonePF();
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer1);
      JSPredicateForm jSPredicateForm1 = jSTerm1.standarizerPredicateForm();
      jSPredicateForm0.trimToSize();
      jSPredicateForm1.equals((JSPredicateForm) jSTerm0);
      JSPredicateForm jSPredicateForm2 = jSTerm0.clonePF();
      UnaryOperator<String> unaryOperator0 = UnaryOperator.identity();
      jSSubstitution0.replaceAll(unaryOperator0);
      JSPredicateForm jSPredicateForm3 = jSPredicateForm2.standarizerPredicateForm();
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      JSPredicateForm jSPredicateForm4 = jSPredicateForm0.applySubstitutionPF(jSSubstitution0);
      jSPredicateForm2.clonePF();
      JSPredicateForm jSPredicateForm5 = jSPredicateForm3.clonePF();
      jSPredicateForm5.clonePF();
      jSSubstitution0.add((Object) jSPredicateForm2);
      JSSubstitution jSSubstitution2 = new JSSubstitution();
      jSPredicateForm4.applySubstitutionPF(jSSubstitution2);
      JSTerm jSTerm2 = new JSTerm();
      jSSubstitution0.add((Object) jSTerm2);
      jSPredicateForm1.matches(jSPredicateForm0, jSSubstitution2);
      jSTerm0.print();
      jSPredicateForm1.equals((JSPredicateForm) jSTerm1);
      JSPredicateForm jSPredicateForm6 = new JSPredicateForm();
      jSPredicateForm6.print();
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
  //Test case number: 12
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringReader stringReader0 = new StringReader("2?AG%>1_zvD|");
      JSPredicateForm jSPredicateForm0 = null;
      try {
        jSPredicateForm0 = new JSPredicateForm("(h");
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
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      jSPredicateForm0.toStr();
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
  //Test case number: 14
  /*Coverage entropy=0.410116318288409
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringReader stringReader0 = new StringReader("((s9N");
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
  //Test case number: 15
  /*Coverage entropy=1.6674619334292948
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringReader stringReader0 = new StringReader("2?AG%>1_zvD|");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSPredicateForm jSPredicateForm0 = jSTerm0.standarizerPredicateForm();
      jSPredicateForm0.addAll((Collection) jSTerm0);
      jSTerm0.trimToSize();
      jSPredicateForm0.equals((JSPredicateForm) jSTerm0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      JSPredicateForm jSPredicateForm1 = jSTerm0.applySubstitutionPF(jSSubstitution1);
      jSPredicateForm1.clonePF();
      Consumer<Integer> consumer0 = (Consumer<Integer>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      jSTerm0.forEach(consumer0);
      JSPredicateForm jSPredicateForm2 = jSTerm0.standarizerPredicateForm();
      jSPredicateForm2.trimToSize();
      jSTerm0.equals(jSPredicateForm2);
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