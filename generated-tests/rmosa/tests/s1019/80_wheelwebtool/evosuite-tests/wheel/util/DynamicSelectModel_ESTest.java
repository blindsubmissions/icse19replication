/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 14:07:26 GMT 2018
 */

package wheel.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.CharBuffer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;
import wheel.ErrorPage;
import wheel.components.Any;
import wheel.components.Component;
import wheel.components.ElExpression;
import wheel.components.Label;
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
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      // Undeclared exception!
      try { 
        dynamicSelectModel0.validate();
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
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("org.mvel.BlankLiteral");
      dynamicSelectModel1.collection("");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getObjects();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expression  evaluated to null. Can't build a dynamic ISelectModel
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
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
  //Test case number: 3
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getLabel(58);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("#");
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
  //Test case number: 5
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("");
      dynamicSelectModel0.validate();
      assertSame(dynamicSelectModel0, dynamicSelectModel1);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.reset();
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      StandaloneComponent standaloneComponent0 = dynamicSelectModel0.getTopLevelComponent();
      assertNull(standaloneComponent0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      ErrorPage errorPage0 = new ErrorPage();
      dynamicSelectModel0.setComponent(errorPage0);
      assertFalse(errorPage0._isBuilt());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.setTopLevelComponent((StandaloneComponent) null);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      Component component0 = dynamicSelectModel0.getComponent();
      assertNull(component0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("org.mvel.BlankLiteral");
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.label("org.mvel.BlankLiteral");
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

  /**
  //Test case number: 12
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("org.mvel.BlankLiteral");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getObjects();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expression org.mvel.BlankLiteral evaluated to an object that is not an instance of Collection or Object[]. Can't build a dynamic ISelectModel
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("[]");
      dynamicSelectModel1.getObjects();
      Object object0 = dynamicSelectModel1.translateValue("[]");
      assertNull(object0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.8864851602714514
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ErrorPage errorPage0 = new ErrorPage();
      Object object0 = new Object();
      Label label0 = new Label(errorPage0, object0);
      CharBuffer charBuffer0 = CharBuffer.allocate(419);
      Any any0 = new Any(label0, charBuffer0);
      DynamicSelectModel dynamicSelectModel0 = any0.selectModel();
      Object object1 = new Object();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.empty(object1);
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.collection("[]");
      dynamicSelectModel1.getObjects();
      DynamicSelectModel dynamicSelectModel3 = dynamicSelectModel2.value("[]");
      dynamicSelectModel0.getObjects();
      dynamicSelectModel1.empty("[]");
      charBuffer0.order();
      dynamicSelectModel3.getOptionCount();
      dynamicSelectModel1.collection(" to create a label for dynamic ISelectModel. Index was ");
      dynamicSelectModel1.label(" to create a label for dynamic ISelectModel. Index was ");
      dynamicSelectModel2.translateValue("org.mvel.util.FastList@0000000034");
      dynamicSelectModel0.translateValue("[]");
      System.setCurrentTimeMillis(419);
      dynamicSelectModel2.getObjects();
      System.setCurrentTimeMillis(419);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ErrorPage errorPage0 = new ErrorPage();
      Object object0 = new Object();
      Label label0 = new Label(errorPage0, object0);
      int int0 = 419;
      CharBuffer charBuffer0 = CharBuffer.allocate(419);
      Any any0 = new Any(label0, charBuffer0);
      DynamicSelectModel dynamicSelectModel0 = any0.selectModel();
      String string0 = "[]";
      Object object1 = new Object();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.empty(object1);
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.collection("[]");
      dynamicSelectModel1.getObjects();
      dynamicSelectModel2.value("[]");
      dynamicSelectModel1.empty("[]");
      charBuffer0.order();
      dynamicSelectModel1.translator(" to create a label for dynamic ISelectModel. Index was ");
      dynamicSelectModel1.label(" to create a label for dynamic ISelectModel. Index was ");
      // Undeclared exception!
      try { 
        dynamicSelectModel2.translateValue("org.mvel.util.FastList@0000000034");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not evaluate expression  to create a label for dynamic ISelectModel. Index was  to translate value ' org.mvel.util.FastList@0000000034'
         //
         verifyException("wheel.components.ElExpression", e);
      }
  }
}
