/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 12:17:04 GMT 2018
 */

package wheel.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import wheel.components.Any;
import wheel.components.Component;
import wheel.components.ElExpression;
import wheel.components.FormElement;
import wheel.components.StandaloneComponent;
import wheel.util.DynamicSelectModel;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DynamicSelectModel_ESTest extends DynamicSelectModel_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ElExpression elExpression0 = new ElExpression("&}~knmeMG!3jpJ)9");
      ElExpression elExpression1 = elExpression0.errorMessage((String) null);
      DynamicSelectModel dynamicSelectModel0 = null;
      try {
        dynamicSelectModel0 = new DynamicSelectModel(elExpression1, elExpression1, elExpression1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not create DynamicSelection model. Collection attribute was null or not an el-expression.
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.reset();
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getLabel(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("CjQ<D>&9Ft9&7IJf~yp");
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.enumeration("$~S&IWn.w($pC-'P*g");
      dynamicSelectModel2.value("6R");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.translateValue("CjQ<D>&9Ft9&7IJf~yp");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not evaluate expression $~S&IWn.w($pC-'P*g.values() to create a dynamic ISelectModel.
         //
         verifyException("wheel.components.ElExpression", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.label("byY+q#5h");
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.enumeration("");
      assertSame(dynamicSelectModel2, dynamicSelectModel1);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection(".values()");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getValue(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      String string0 = "+=eebl?uXU:b)G@n3";
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getOptionCount();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      Object object0 = new Object();
      dynamicSelectModel0.getTopLevelComponent();
      dynamicSelectModel0.setTopLevelComponent((StandaloneComponent) null);
      String string0 = ")z~!w@\\@ODB!Ms";
      dynamicSelectModel0.label(")z~!w@@ODB!Ms");
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.empty(object0);
      dynamicSelectModel1.translator(")z~!w@@ODB!Ms");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getObjects();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      String string0 = "wheel.util.DynamicSelectModel";
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.value("wheel.util.DynamicSelectModel");
      dynamicSelectModel1.collection("wheel.util.DynamicSelectModel");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getObjects();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expression wheel.util.DynamicSelectModel evaluated to an object that is not an instance of Collection or Object[]. Can't build a dynamic ISelectModel
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      String string0 = "";
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("");
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.label("");
      // Undeclared exception!
      try { 
        dynamicSelectModel2.translateValue("");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expression  evaluated to null. Can't build a dynamic ISelectModel
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.getTopLevelComponent();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection(" to translate value ' ");
      dynamicSelectModel0.setTopLevelComponent((StandaloneComponent) null);
      dynamicSelectModel0.getComponent();
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.translator("Could not create DynamicSelection model. Label attribute was null or not an el-expression.");
      dynamicSelectModel1.collection("Could not create DynamicSelection model. Label attribute was null or not an el-expression.");
      dynamicSelectModel2.setComponent((Component) null);
      // Undeclared exception!
      try { 
        dynamicSelectModel2.translateValue("Could not create DynamicSelection model. Label attribute was null or not an el-expression.");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not evaluate expression Could not create DynamicSelection model. Label attribute was null or not an el-expression. to create a dynamic ISelectModel.
         //
         verifyException("wheel.components.ElExpression", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = " xmlns=";
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      String string1 = "";
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("");
      Object object0 = new Object();
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.empty(object0);
      String string2 = "";
      DynamicSelectModel dynamicSelectModel3 = dynamicSelectModel2.value("");
      Object object1 = new Object();
      dynamicSelectModel3.empty(object1);
      dynamicSelectModel3.getTopLevelComponent();
      // Undeclared exception!
      try { 
        dynamicSelectModel1.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not create DynamicSelection model. Label attribute was null or not an el-expression.
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.9061547465398496
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("");
      Object object0 = new Object();
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.empty(object0);
      DynamicSelectModel dynamicSelectModel3 = dynamicSelectModel2.value("");
      Object object1 = new Object();
      dynamicSelectModel2.label("");
      DynamicSelectModel dynamicSelectModel4 = dynamicSelectModel3.empty(object1);
      dynamicSelectModel4.collection("'");
      dynamicSelectModel3.getTopLevelComponent();
      dynamicSelectModel1.validate();
      assertSame(dynamicSelectModel1, dynamicSelectModel3);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.6674619334292946
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.label("");
      Object object0 = new Object();
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.empty(object0);
      Object object1 = new Object();
      dynamicSelectModel2.label("");
      DynamicSelectModel dynamicSelectModel3 = dynamicSelectModel0.empty(object1);
      dynamicSelectModel3.collection("'");
      dynamicSelectModel0.getTopLevelComponent();
      // Undeclared exception!
      try { 
        dynamicSelectModel1.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not create DynamicSelection model. Value attribute was null or not an el-expression.
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }
}
