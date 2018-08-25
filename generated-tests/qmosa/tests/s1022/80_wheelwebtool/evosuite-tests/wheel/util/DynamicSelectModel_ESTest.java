/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 15:55:05 GMT 2018
 */

package wheel.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import wheel.ErrorPage;
import wheel.components.Any;
import wheel.components.Component;
import wheel.components.ElExpression;
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
      String string0 = "q/{[.i?x&q2";
      ElExpression elExpression0 = new ElExpression("q/{[.i?x&q2");
      DynamicSelectModel dynamicSelectModel0 = null;
      try {
        dynamicSelectModel0 = new DynamicSelectModel(elExpression0, elExpression0, elExpression0);
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
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      String string0 = "";
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("");
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel0.label("");
      String string1 = "O3h\"WcCskX";
      dynamicSelectModel1.translator("O3h\"WcCskX");
      int int0 = 0;
      dynamicSelectModel2.label("");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getOptionCount();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not evaluate expression .values() to create a dynamic ISelectModel.
         //
         verifyException("wheel.components.ElExpression", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.reset();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.value("k}v>");
      StandaloneComponent standaloneComponent0 = dynamicSelectModel1.getTopLevelComponent();
      assertNull(standaloneComponent0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      String string0 = "Could not create DynamicSelection model. Label attribute was null or not an el-expression.";
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.label("Could not create DynamicSelection model. Label attribute was null or not an el-expression.");
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.empty("Could not create DynamicSelection model. Label attribute was null or not an el-expression.");
      DynamicSelectModel dynamicSelectModel3 = dynamicSelectModel2.translator("Could not create DynamicSelection model. Label attribute was null or not an el-expression.");
      DynamicSelectModel dynamicSelectModel4 = dynamicSelectModel3.translator("Could not create DynamicSelection model. Label attribute was null or not an el-expression.");
      dynamicSelectModel4.reset();
      DynamicSelectModel dynamicSelectModel5 = dynamicSelectModel2.translator("Could not create DynamicSelection model. Label attribute was null or not an el-expression.");
      dynamicSelectModel5.getTopLevelComponent();
      Any any0 = null;
      try {
        any0 = new Any((Component) null, "Could not create DynamicSelection model. Label attribute was null or not an el-expression.");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.components.Component", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      String string0 = "p(L7(#4|_";
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.label("p(L7(#4|_");
      String string1 = "";
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.value("");
      dynamicSelectModel2.collection("");
      // Undeclared exception!
      try { 
        dynamicSelectModel2.getOptionCount();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expression  evaluated to null. Can't build a dynamic ISelectModel
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.value((String) null);
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.label("#BX9do1$");
      DynamicSelectModel dynamicSelectModel3 = dynamicSelectModel2.empty(dynamicSelectModel0);
      DynamicSelectModel dynamicSelectModel4 = dynamicSelectModel3.enumeration((String) null);
      dynamicSelectModel4.reset();
      DynamicSelectModel dynamicSelectModel5 = dynamicSelectModel4.collection((String) null);
      DynamicSelectModel dynamicSelectModel6 = dynamicSelectModel5.enumeration((String) null);
      dynamicSelectModel6.empty(dynamicSelectModel3);
      dynamicSelectModel5.getComponent();
      DynamicSelectModel dynamicSelectModel7 = dynamicSelectModel3.translator("#BX9do1$");
      dynamicSelectModel7.value("%1i76o.edPR");
      dynamicSelectModel2.reset();
      // Undeclared exception!
      try { 
        dynamicSelectModel4.getLabel(6735);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mvel.PropertyAccessor", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      Object object0 = new Object();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.empty(object0);
      String string0 = "Cd^M~4";
      dynamicSelectModel1.collection("Cd^M~4");
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel0.label("j@");
      dynamicSelectModel2.label("Cd^M~4");
      dynamicSelectModel1.setTopLevelComponent((StandaloneComponent) null);
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getValue(55);
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
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      String string0 = "k";
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.label("k");
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.translator("k");
      DynamicSelectModel dynamicSelectModel3 = dynamicSelectModel2.value("Wn?caD!9\":..6_+d9");
      DynamicSelectModel dynamicSelectModel4 = dynamicSelectModel3.enumeration("k");
      dynamicSelectModel4.validate();
      String string1 = " evaluated to null. Can't build a dynamic ISelectModel";
      dynamicSelectModel1.label(" evaluated to null. Can't build a dynamic ISelectModel");
      Object object0 = new Object();
      DynamicSelectModel dynamicSelectModel5 = dynamicSelectModel4.empty(object0);
      Component component0 = null;
      dynamicSelectModel5.setComponent((Component) null);
      dynamicSelectModel1.label((String) null);
      // Undeclared exception!
      try { 
        dynamicSelectModel5.translateValue((String) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not evaluate expression k.values() to create a dynamic ISelectModel.
         //
         verifyException("wheel.components.ElExpression", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("");
      dynamicSelectModel1.reset();
      // Undeclared exception!
      try { 
        dynamicSelectModel0.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not create DynamicSelection model. Label attribute was null or not an el-expression.
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.9722469794234416
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.label(" ,R.jyNpB");
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel0.translator("");
      String string0 = "U[X{U#";
      dynamicSelectModel0.enumeration("U[X{U#");
      dynamicSelectModel0.validate();
      DynamicSelectModel dynamicSelectModel3 = dynamicSelectModel2.label(" evaluated to null. Can't build a dynamic ISelectModel");
      Object object0 = new Object();
      ErrorPage errorPage0 = new ErrorPage();
      ErrorPage errorPage1 = new ErrorPage();
      dynamicSelectModel3.setTopLevelComponent(errorPage1);
      DynamicSelectModel dynamicSelectModel4 = dynamicSelectModel1.collection("wheel.components.CheckboxGroup");
      dynamicSelectModel4.setTopLevelComponent(errorPage0);
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getObjects();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expression wheel.components.CheckboxGroup evaluated to an object that is not an instance of Collection or Object[]. Can't build a dynamic ISelectModel
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.4750763110546947
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.label(" ,R.jyNpB");
      String string0 = "c.Tz%";
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.translator("c.Tz%");
      dynamicSelectModel2.collection("c.Tz%");
      // Undeclared exception!
      try { 
        dynamicSelectModel2.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not create DynamicSelection model. Value attribute was null or not an el-expression.
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }
}
