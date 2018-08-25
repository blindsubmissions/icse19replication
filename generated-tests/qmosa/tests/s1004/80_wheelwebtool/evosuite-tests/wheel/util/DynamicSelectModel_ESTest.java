/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 10:50:15 GMT 2018
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
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      String string0 = "$VALUES";
      dynamicSelectModel0.translator("$VALUES");
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
  //Test case number: 1
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ElExpression elExpression0 = new ElExpression("");
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
  //Test case number: 2
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      String string0 = "";
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.empty("");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getLabel(2270);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      String string0 = " with namespace '";
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection(" with namespace '");
      dynamicSelectModel1.collection(" with namespace '");
      dynamicSelectModel1.enumeration(" with namespace '");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getOptionCount();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not evaluate expression  with namespace '.values() to create a dynamic ISelectModel.
         //
         verifyException("wheel.components.ElExpression", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      String string0 = "}LR,+j)aTzw";
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.translator("}LR,+j)aTzw");
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.value("A?Ad(xsg7k>q[E\"");
      dynamicSelectModel1.enumeration("5$&eD:Wi;Is2? ");
      int int0 = (-1594);
      Object object0 = new Object();
      dynamicSelectModel2.empty(object0);
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getOptionCount();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not evaluate expression 5$&eD:Wi;Is2? .values() to create a dynamic ISelectModel.
         //
         verifyException("wheel.components.ElExpression", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.getComponent();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.label((String) null);
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.collection((String) null);
      DynamicSelectModel dynamicSelectModel3 = dynamicSelectModel0.enumeration("zYR+N/");
      assertSame(dynamicSelectModel3, dynamicSelectModel2);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.reset();
      Object object0 = new Object();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.empty(object0);
      dynamicSelectModel0.reset();
      Object object1 = new Object();
      dynamicSelectModel1.empty(object1);
      String string0 = "";
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.label("");
      String string1 = "";
      // Undeclared exception!
      try { 
        dynamicSelectModel2.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not create DynamicSelection model. Collection attribute was null or not an el-expression.
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      Object object0 = new Object();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.empty(object0);
      dynamicSelectModel0.reset();
      dynamicSelectModel1.translator((String) null);
      dynamicSelectModel0.getTopLevelComponent();
      // Undeclared exception!
      try { 
        dynamicSelectModel1.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not create DynamicSelection model. Collection attribute was null or not an el-expression.
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.getTopLevelComponent();
      dynamicSelectModel0.setTopLevelComponent((StandaloneComponent) null);
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
  //Test case number: 9
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ElExpression elExpression0 = new ElExpression("");
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.value("");
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.label("");
      DynamicSelectModel dynamicSelectModel3 = dynamicSelectModel2.translator("");
      DynamicSelectModel dynamicSelectModel4 = dynamicSelectModel3.collection("HcfPT^?@;|5`CiIO6");
      DynamicSelectModel dynamicSelectModel5 = dynamicSelectModel4.enumeration("(uO>|J/.!Yg");
      dynamicSelectModel5.validate();
      Object object0 = new Object();
      dynamicSelectModel1.empty((Object) null);
      // Undeclared exception!
      try { 
        dynamicSelectModel3.getValue(20);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not evaluate expression (uO>|J/.!Yg.values() to create a dynamic ISelectModel.
         //
         verifyException("wheel.components.ElExpression", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = "";
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.translator("");
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.collection("");
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
  //Test case number: 11
  /*Coverage entropy=1.9061547465398496
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = new DynamicSelectModel();
      dynamicSelectModel1.value("");
      dynamicSelectModel0.label(" to translate value ' ");
      dynamicSelectModel1.translator(" encoding=");
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel0.collection(" to translate value ' ");
      dynamicSelectModel2.enumeration((String) null);
      DynamicSelectModel dynamicSelectModel3 = dynamicSelectModel1.collection("6$f>V*n\"FMQu_");
      // Undeclared exception!
      try { 
        dynamicSelectModel3.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not create DynamicSelection model. Label attribute was null or not an el-expression.
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      Object object0 = new Object();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.empty(object0);
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.collection("");
      DynamicSelectModel dynamicSelectModel3 = dynamicSelectModel2.translator("\t");
      dynamicSelectModel0.enumeration("");
      DynamicSelectModel dynamicSelectModel4 = dynamicSelectModel3.label("\t");
      DynamicSelectModel dynamicSelectModel5 = dynamicSelectModel4.value("\t");
      dynamicSelectModel5.setComponent((Component) null);
      dynamicSelectModel0.setComponent((Component) null);
      assertSame(dynamicSelectModel0, dynamicSelectModel2);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.4750763110546947
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = "";
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.translator("");
      dynamicSelectModel1.label("oZA0D ,3BFt'N");
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel0.translator("");
      String string1 = "";
      dynamicSelectModel2.collection("");
      String string2 = "";
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
  //Test case number: 14
  /*Coverage entropy=1.7478680974667573
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.value("Ecpe#*Z");
      dynamicSelectModel1.translator("Ecpe#*Z");
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel0.collection("org.mvel.ast.InlineCollectionNode");
      // Undeclared exception!
      try { 
        dynamicSelectModel2.translateValue("Ecpe#*Z");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expression org.mvel.ast.InlineCollectionNode evaluated to an object that is not an instance of Collection or Object[]. Can't build a dynamic ISelectModel
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }
}