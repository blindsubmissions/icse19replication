/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 11:01:41 GMT 2018
 */

package umd.cs.shop;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StreamTokenizer;
import java.io.StringReader;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
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
      StringReader stringReader0 = new StringReader("dv");
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
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm((String) null);
      // Undeclared exception!
      try { 
        jSPredicateForm0.standarizerPredicateForm();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      Consumer<JSPredicateForm> consumer0 = (Consumer<JSPredicateForm>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      jSPredicateForm0.forEach(consumer0);
      jSPredicateForm0.toStr();
      JSJshopVars.rightPar = 40;
      // Undeclared exception!
      try { 
        jSPredicateForm0.setElementAt((Object) null, 960);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 960 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      jSPredicateForm0.print();
      // Undeclared exception!
      try { 
        jSPredicateForm0.remove(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      jSSubstitution0.removeElements(jSSubstitution1);
      jSSubstitution1.addAll((Collection) jSPredicateForm0);
      StringReader stringReader0 = new StringReader("qI|#`.z_fumzzv9");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSPredicateForm0.matches((JSPredicateForm) jSTerm0, jSSubstitution1);
      jSTerm0.print();
      jSTerm0.ensureCapacity(1);
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
  //Test case number: 6
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      jSSubstitution1.removeElements(jSSubstitution0);
      jSPredicateForm0.equals((JSPredicateForm) null);
      StringReader stringReader0 = new StringReader("qI|#`.z_fumzzv9");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution2 = jSPredicateForm0.matches((JSPredicateForm) jSTerm0, jSSubstitution1);
      jSTerm0.print();
      JSSubstitution jSSubstitution3 = new JSSubstitution();
      jSSubstitution2.parallelStream();
      JSSubstitution jSSubstitution4 = new JSSubstitution();
      jSTerm0.matches(jSPredicateForm0, jSSubstitution4);
      JSTerm jSTerm1 = new JSTerm();
      // Undeclared exception!
      try { 
        jSPredicateForm0.equals((JSPredicateForm) jSTerm1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringReader stringReader0 = new StringReader("dv");
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.makeConstant();
      jSTerm0.add((Object) stringReader0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSSubstitution0.spliterator();
      jSTerm0.print();
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm((String) null);
      JSSubstitution jSSubstitution1 = jSTerm0.matches(jSPredicateForm0);
      assertTrue(jSSubstitution1.fail());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      StringReader stringReader0 = new StringReader("dv");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSPredicateForm jSPredicateForm0 = jSTerm0.clonePF();
      jSPredicateForm0.print();
      JSPredicateForm jSPredicateForm1 = jSPredicateForm0.applySubstitutionPF(jSSubstitution0);
      jSTerm0.toStr();
      StringBuffer stringBuffer0 = jSPredicateForm1.toStr();
      assertNotSame(jSPredicateForm1, jSPredicateForm0);
      assertEquals("(%%%)", stringBuffer0.toString());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.559581156259877
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringReader stringReader0 = new StringReader("wU@]*pz:0N@Q\"+5}>|");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      char[] charArray0 = new char[2];
      charArray0[0] = 'z';
      charArray0[1] = 'I';
      stringReader0.read(charArray0);
      jSTerm0.matches((JSPredicateForm) jSTerm0, jSSubstitution0);
      jSTerm0.clonePF();
      JSPredicateForm jSPredicateForm0 = null;
      try {
        jSPredicateForm0 = new JSPredicateForm("wU@]*pz:0N@Q\"+5}>|");
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
  /*Coverage entropy=1.5571130980576455
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringReader stringReader0 = new StringReader("wU@]*pz:0N@Q\"+5}>|");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      char[] charArray0 = new char[2];
      charArray0[0] = 'z';
      StringReader stringReader1 = new StringReader("8d)<`c}iL");
      stringReader0.skip(1L);
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader1);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer1);
      JSPredicateForm jSPredicateForm0 = jSTerm1.standarizerPredicateForm();
      boolean boolean0 = jSTerm1.equals((JSPredicateForm) jSTerm0);
      assertFalse(boolean0);
      
      jSTerm1.clonePF();
      JSSubstitution jSSubstitution1 = jSTerm0.matches(jSPredicateForm0, jSSubstitution0);
      assertTrue(jSSubstitution1.fail());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.5571130980576458
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringReader stringReader0 = new StringReader("2");
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.makeConstant();
      jSTerm0.add((Object) "2");
      jSTerm0.setSize(1240);
      StringReader stringReader1 = new StringReader("dv");
      stringReader1.skip(203L);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      streamTokenizer0.nval = (-21.922394764450633);
      stringReader1.read();
      jSTerm1.standarizerPredicateForm();
      JSPredicateForm jSPredicateForm0 = jSTerm1.clonePF();
      jSPredicateForm0.print();
      jSTerm1.toStr();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      // Undeclared exception!
      try { 
        jSTerm0.applySubstitutionPF(jSSubstitution0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.6957425341696346
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringReader stringReader0 = new StringReader("dv");
      StringReader stringReader1 = new StringReader("8d)<`c}iL");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader1);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.standarizerPredicateForm();
      JSPredicateForm jSPredicateForm0 = jSTerm0.standarizerPredicateForm();
      JSPredicateForm jSPredicateForm1 = jSTerm0.clonePF();
      JSTerm jSTerm1 = new JSTerm();
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) jSPredicateForm1;
      objectArray0[1] = (Object) "dv";
      jSTerm1.toArray(objectArray0);
      jSPredicateForm0.print();
      jSTerm0.toStr();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSPredicateForm jSPredicateForm2 = jSTerm0.applySubstitutionPF(jSSubstitution0);
      // Undeclared exception!
      try { 
        jSPredicateForm2.JSPredicateFormInit((StreamTokenizer) null);
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
  /*Coverage entropy=1.5810937501718239
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringReader stringReader0 = new StringReader("2[");
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.makeConstant();
      jSTerm0.add((Object) "2[");
      jSTerm0.setSize(1240);
      StringReader stringReader1 = new StringReader("dv");
      stringReader1.skip(203L);
      jSTerm0.remove((Object) "dv");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.parseNumbers();
      streamTokenizer0.eolIsSignificant(true);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      stringReader1.read();
      jSTerm1.add((Object) jSTerm0);
      jSTerm1.standarizerPredicateForm();
      JSPredicateForm jSPredicateForm0 = jSTerm1.clonePF();
      jSPredicateForm0.print();
      boolean boolean0 = jSPredicateForm0.equals((JSPredicateForm) jSTerm1);
      JSPredicateForm jSPredicateForm1 = jSTerm1.standarizerPredicateForm();
      JSJshopVars.lessT = (-969);
      boolean boolean1 = jSTerm1.equals((JSPredicateForm) jSTerm0);
      assertFalse(boolean1 == boolean0);
      
      StringBuffer stringBuffer0 = jSPredicateForm1.toStr();
      assertEquals("(2.02[ )", stringBuffer0.toString());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.7086559473420695
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringReader stringReader0 = new StringReader("2[");
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.makeConstant();
      jSTerm0.add((Object) "2[");
      jSTerm0.setSize(1240);
      StringReader stringReader1 = new StringReader("dv");
      stringReader1.skip(1240);
      stringReader1.skip(203L);
      jSTerm0.remove((Object) "dv");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.parseNumbers();
      streamTokenizer0.eolIsSignificant(true);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      jSTerm1.add((Object) jSTerm0);
      JSPredicateForm jSPredicateForm0 = jSTerm1.standarizerPredicateForm();
      JSPredicateForm jSPredicateForm1 = jSTerm1.clonePF();
      jSPredicateForm1.print();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSPredicateForm0.applySubstitutionPF(jSSubstitution0);
      jSPredicateForm0.matches((JSPredicateForm) jSTerm1, jSSubstitution0);
      // Undeclared exception!
      try { 
        jSTerm0.standarizerPredicateForm();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.6568547038794563
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringReader stringReader0 = new StringReader("2[");
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.makeConstant();
      jSTerm0.add((Object) "2[");
      jSTerm0.setSize(47);
      StringReader stringReader1 = new StringReader("dv");
      stringReader1.skip(203L);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.parseNumbers();
      streamTokenizer0.eolIsSignificant(true);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      stringReader1.read();
      jSTerm1.add((Object) jSTerm0);
      JSPredicateForm jSPredicateForm0 = jSTerm1.standarizerPredicateForm();
      JSPredicateForm jSPredicateForm1 = jSTerm1.clonePF();
      jSPredicateForm1.print();
      boolean boolean0 = jSPredicateForm1.equals((JSPredicateForm) jSTerm1);
      assertTrue(boolean0);
      
      JSPredicateForm jSPredicateForm2 = jSTerm1.standarizerPredicateForm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = jSPredicateForm0.matches(jSPredicateForm1, jSSubstitution0);
      assertFalse(jSSubstitution1.fail());
      assertNotSame(jSPredicateForm0, jSPredicateForm2);
  }
}
