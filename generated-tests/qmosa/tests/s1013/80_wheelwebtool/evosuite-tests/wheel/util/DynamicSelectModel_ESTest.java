/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 13:22:09 GMT 2018
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
import wheel.components.Form;
import wheel.components.StandaloneComponent;
import wheel.util.DynamicSelectModel;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DynamicSelectModel_ESTest extends DynamicSelectModel_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.value((String) null);
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.empty((Object) null);
      dynamicSelectModel1.collection((String) null);
      dynamicSelectModel1.collection("D*H^,P ");
      // Undeclared exception!
      try { 
        dynamicSelectModel2.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not create DynamicSelection model. Label attribute was null or not an el-expression.
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = null;
      try {
        dynamicSelectModel0 = new DynamicSelectModel((ElExpression) null, (ElExpression) null, (ElExpression) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not create DynamicSelection model. Collection attribute was null or not an el-expression.
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      String string0 = null;
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection((String) null);
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
  //Test case number: 3
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.value(" to create a value for dynamic ISelectModel. Index was ");
      dynamicSelectModel0.reset();
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.collection(" to create a value for dynamic ISelectModel. Index was ");
      DynamicSelectModel dynamicSelectModel3 = dynamicSelectModel2.label("KZ");
      DynamicSelectModel dynamicSelectModel4 = dynamicSelectModel1.enumeration(" to create a value for dynamic ISelectModel. Index was ");
      dynamicSelectModel4.label("[V>VJ7wKw8");
      dynamicSelectModel3.reset();
      // Undeclared exception!
      try { 
        dynamicSelectModel3.getObjects();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not evaluate expression  to create a value for dynamic ISelectModel. Index was .values() to create a dynamic ISelectModel.
         //
         verifyException("wheel.components.ElExpression", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.label("QN");
      String string0 = "";
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.translator("");
      DynamicSelectModel dynamicSelectModel3 = dynamicSelectModel2.value("");
      DynamicSelectModel dynamicSelectModel4 = dynamicSelectModel3.empty(dynamicSelectModel1);
      ErrorPage errorPage0 = new ErrorPage();
      dynamicSelectModel3.setTopLevelComponent(errorPage0);
      DynamicSelectModel dynamicSelectModel5 = dynamicSelectModel4.enumeration("");
      dynamicSelectModel5.getComponent();
      StandaloneComponent standaloneComponent0 = dynamicSelectModel1.getTopLevelComponent();
      dynamicSelectModel5.empty("QN");
      dynamicSelectModel3.setTopLevelComponent(standaloneComponent0);
      dynamicSelectModel1.getComponent();
      // Undeclared exception!
      try { 
        dynamicSelectModel2.translateValue("QN");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not evaluate expression .values() to create a dynamic ISelectModel.
         //
         verifyException("wheel.components.ElExpression", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.getTopLevelComponent();
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getLabel(16);
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
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      Object object0 = new Object();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.empty(object0);
      dynamicSelectModel1.translator("I");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getOptionCount();
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
  /*Coverage entropy=1.7478680974667573
  */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      String string0 = "wheel.components.ValidationRule";
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.value("wheel.components.ValidationRule");
      dynamicSelectModel0.collection("wheel.components.ValidationRule");
      dynamicSelectModel0.label((String) null);
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getValue((-513));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expression wheel.components.ValidationRule evaluated to an object that is not an instance of Collection or Object[]. Can't build a dynamic ISelectModel
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      String string0 = " to create a label for dynamic ISelectModel. Index was ";
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.label(" to create a label for dynamic ISelectModel. Index was ");
      String string1 = "";
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.collection("");
      DynamicSelectModel dynamicSelectModel3 = dynamicSelectModel2.empty(" to create a label for dynamic ISelectModel. Index was ");
      DynamicSelectModel dynamicSelectModel4 = dynamicSelectModel3.empty(dynamicSelectModel1);
      dynamicSelectModel4.enumeration("");
      dynamicSelectModel2.getComponent();
      dynamicSelectModel2.setComponent((Component) null);
      dynamicSelectModel3.translator("'d>>_Oz}0.<-l?gmRuK");
      dynamicSelectModel4.setComponent((Component) null);
      dynamicSelectModel0.validate();
      DynamicSelectModel dynamicSelectModel5 = dynamicSelectModel4.collection("");
      dynamicSelectModel4.label("");
      ErrorPage errorPage0 = new ErrorPage();
      errorPage0._classReferenceFromHints();
      dynamicSelectModel3.setTopLevelComponent(errorPage0);
      dynamicSelectModel2.translator(" to create a value for dynamic ISelectModel. Index was ");
      // Undeclared exception!
      try { 
        dynamicSelectModel5.getValue(118);
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
  /*Coverage entropy=1.9730014063936125
  */
  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      String string0 = " to create a label for dynamic ISelectModel. Index was ";
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.label(" to create a label for dynamic ISelectModel. Index was ");
      String string1 = "";
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.collection("");
      DynamicSelectModel dynamicSelectModel3 = dynamicSelectModel2.empty(" to create a label for dynamic ISelectModel. Index was ");
      DynamicSelectModel dynamicSelectModel4 = dynamicSelectModel3.empty(dynamicSelectModel1);
      dynamicSelectModel2.getComponent();
      dynamicSelectModel2.setComponent((Component) null);
      dynamicSelectModel3.translator("'d>>_Oz}0.<-l?gmRuK");
      dynamicSelectModel4.setComponent((Component) null);
      // Undeclared exception!
      try { 
        dynamicSelectModel0.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not create DynamicSelection model. Value attribute was null or not an el-expression.
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }
}
