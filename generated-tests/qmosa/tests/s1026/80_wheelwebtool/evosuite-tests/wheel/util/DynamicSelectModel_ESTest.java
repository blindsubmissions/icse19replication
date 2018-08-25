/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 17:01:02 GMT 2018
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
import wheel.components.TextArea;
import wheel.components.XmlEntityRef;
import wheel.util.DynamicSelectModel;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DynamicSelectModel_ESTest extends DynamicSelectModel_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ElExpression elExpression0 = new ElExpression("]&ZWfI}#X{q");
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
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.translator((String) null);
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.label((String) null);
      String string0 = "h-zXDO!zl4";
      dynamicSelectModel2.enumeration("h-zXDO!zl4");
      // Undeclared exception!
      try { 
        dynamicSelectModel2.getValue(32);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not evaluate expression h-zXDO!zl4.values() to create a dynamic ISelectModel.
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
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.empty((Object) null);
      dynamicSelectModel1.setComponent((Component) null);
      dynamicSelectModel1.setComponent((Component) null);
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.label("OZ[Qx|56\"Sn=");
      assertSame(dynamicSelectModel2, dynamicSelectModel0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.label("wheel.components.Checkbox");
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.enumeration("TVdz");
      dynamicSelectModel2.label("TVdz");
      dynamicSelectModel2.reset();
      String string0 = "F|U}<";
      // Undeclared exception!
      try { 
        dynamicSelectModel2.getObjects();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not evaluate expression TVdz.values() to create a dynamic ISelectModel.
         //
         verifyException("wheel.components.ElExpression", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      String string0 = "";
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getLabel(92);
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
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      Object object0 = new Object();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.empty(object0);
      String string0 = "@{jPPuW%srPaj ";
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.value("@{jPPuW%srPaj ");
      String string1 = "";
      DynamicSelectModel dynamicSelectModel3 = dynamicSelectModel2.translator("");
      DynamicSelectModel dynamicSelectModel4 = dynamicSelectModel3.label("YPsYGmw;1");
      DynamicSelectModel dynamicSelectModel5 = dynamicSelectModel4.collection("x");
      dynamicSelectModel5.getComponent();
      Object object1 = new Object();
      DynamicSelectModel dynamicSelectModel6 = dynamicSelectModel0.empty(object1);
      dynamicSelectModel6.translator("@{jPPuW%srPaj ");
      dynamicSelectModel6.value("@{jPPuW%srPaj ");
      // Undeclared exception!
      try { 
        dynamicSelectModel4.translateValue("");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not evaluate expression x to create a dynamic ISelectModel.
         //
         verifyException("wheel.components.ElExpression", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      String string0 = "";
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.translator("");
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.collection("");
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
  //Test case number: 7
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.getTopLevelComponent();
      dynamicSelectModel0.setTopLevelComponent((StandaloneComponent) null);
      String string0 = "UYX-lkKajV0([;Z_zi";
      dynamicSelectModel0.enumeration("UYX-lkKajV0([;Z_zi");
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.empty("UYX-lkKajV0([;Z_zi");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getOptionCount();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not evaluate expression UYX-lkKajV0([;Z_zi.values() to create a dynamic ISelectModel.
         //
         verifyException("wheel.components.ElExpression", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.0431918705451206
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object object0 = new Object();
      Object object1 = new Object();
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.label("j2");
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.enumeration("j2");
      DynamicSelectModel dynamicSelectModel3 = dynamicSelectModel2.translator("'");
      DynamicSelectModel dynamicSelectModel4 = dynamicSelectModel3.value("");
      DynamicSelectModel dynamicSelectModel5 = dynamicSelectModel4.collection("1");
      // Undeclared exception!
      try { 
        dynamicSelectModel5.translateValue("");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expression 1 evaluated to an object that is not an instance of Collection or Object[]. Can't build a dynamic ISelectModel
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.value(":'k{xb7~,");
      dynamicSelectModel1.getComponent();
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.enumeration("h&McG}\"qN]FM{P");
      dynamicSelectModel2.validate();
      DynamicSelectModel dynamicSelectModel3 = dynamicSelectModel2.value("]F0yH3~+hE");
      dynamicSelectModel0.validate();
      assertSame(dynamicSelectModel0, dynamicSelectModel3);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      String string0 = "";
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.translator("");
      dynamicSelectModel1.collection("");
      String string1 = "'ZV\"U#Kvh";
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
  //Test case number: 11
  /*Coverage entropy=1.5810937501718236
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      Object object0 = new Object();
      DynamicSelectModel dynamicSelectModel1 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel0.label((String) null);
      dynamicSelectModel1.enumeration((String) null);
      String string0 = "'";
      DynamicSelectModel dynamicSelectModel3 = dynamicSelectModel1.translator((String) null);
      dynamicSelectModel3.validate();
      dynamicSelectModel0.collection("QFH");
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