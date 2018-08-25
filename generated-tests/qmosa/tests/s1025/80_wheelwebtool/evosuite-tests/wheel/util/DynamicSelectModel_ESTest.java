/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 16:39:17 GMT 2018
 */

package wheel.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import wheel.ErrorPage;
import wheel.components.ActionExpression;
import wheel.components.Any;
import wheel.components.Component;
import wheel.components.ElExpression;
import wheel.components.FormElement;
import wheel.components.Label;
import wheel.components.StandaloneComponent;
import wheel.components.TextArea;
import wheel.util.DynamicSelectModel;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DynamicSelectModel_ESTest extends DynamicSelectModel_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = "Could not create DynamicSelection model. Collection attribute was null or not an el-expression.";
      ElExpression elExpression0 = new ElExpression("Could not create DynamicSelection model. Collection attribute was null or not an el-expression.");
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
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      String string0 = "v|O/bm&$f>UMr";
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.translator("v|O/bm&$f>UMr");
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.collection("v|O/bm&$f>UMr");
      dynamicSelectModel1.reset();
      dynamicSelectModel0.translator("v|O/bm&$f>UMr");
      // Undeclared exception!
      try { 
        dynamicSelectModel2.getObjects();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not evaluate expression v|O/bm&$f>UMr to create a dynamic ISelectModel.
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
      ErrorPage errorPage0 = new ErrorPage();
      ActionExpression actionExpression0 = new ActionExpression("{;J");
      Any any0 = new Any(errorPage0, actionExpression0);
      DynamicSelectModel dynamicSelectModel0 = any0.selectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.empty("{;J");
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.label("");
      DynamicSelectModel dynamicSelectModel3 = dynamicSelectModel2.enumeration("");
      DynamicSelectModel dynamicSelectModel4 = dynamicSelectModel3.empty(dynamicSelectModel1);
      assertSame(dynamicSelectModel4, dynamicSelectModel0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.translator("could not create reader for encoding ");
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.value("TFt:R.D5}DNJcSct");
      DynamicSelectModel dynamicSelectModel3 = dynamicSelectModel2.empty(dynamicSelectModel0);
      dynamicSelectModel3.getComponent();
      Object object0 = new Object();
      DynamicSelectModel dynamicSelectModel4 = dynamicSelectModel2.empty(object0);
      assertSame(dynamicSelectModel4, dynamicSelectModel0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.getTopLevelComponent();
      dynamicSelectModel0.setTopLevelComponent((StandaloneComponent) null);
      String string0 = "H+Y$";
      // Undeclared exception!
      try { 
        dynamicSelectModel0.translateValue("H+Y$");
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      int int0 = (-170);
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getValue((-170));
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
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.value((String) null);
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection((String) null);
      String string0 = "v";
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getOptionCount();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expression null evaluated to null. Can't build a dynamic ISelectModel
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.collection("6:+iy1ajnIO");
      String string0 = " evaluated to an object that is not an instance of Collection or Object[]. Can't build a dynamic ISelectModel";
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.translator(" evaluated to an object that is not an instance of Collection or Object[]. Can't build a dynamic ISelectModel");
      dynamicSelectModel1.collection(" evaluated to an object that is not an instance of Collection or Object[]. Can't build a dynamic ISelectModel");
      dynamicSelectModel1.collection("2wqS1MTX$65Bi[?G");
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
  //Test case number: 8
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.label(" evaluated to null. Can't build a dynamic ISelectModel");
      Object object0 = new Object();
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.empty(object0);
      String string0 = "";
      DynamicSelectModel dynamicSelectModel3 = dynamicSelectModel2.collection("");
      String string1 = "2wqS1MTX$65Bi[?G";
      String string2 = null;
      dynamicSelectModel2.collection((String) null);
      // Undeclared exception!
      try { 
        dynamicSelectModel3.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not create DynamicSelection model. Value attribute was null or not an el-expression.
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
      dynamicSelectModel0.value("'v*ab[\"~w6<D!<7");
      ErrorPage errorPage0 = new ErrorPage();
      TextArea textArea0 = new TextArea(errorPage0, (String) null, "processing DOCDECL is not supported");
      TextArea textArea1 = new TextArea(errorPage0, ":hhkV?3", "");
      textArea1.value("characters ]]> are not allowed in content");
      Object object0 = new Object();
      Object object1 = new Object();
      Label label0 = new Label(errorPage0, object1);
      dynamicSelectModel0.setComponent((Component) null);
      dynamicSelectModel0.translator("%eZSdU");
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
  //Test case number: 10
  /*Coverage entropy=1.6674619334292946
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("6:+iy1ajnIO");
      String string0 = " evaluated to an object that is not an instance of Collection or Object[]. Can't build a dynamic ISelectModel";
      dynamicSelectModel1.collection(" evaluated to an object that is not an instance of Collection or Object[]. Can't build a dynamic ISelectModel");
      String string1 = "2wqS1MTX$65Bi[?G";
      dynamicSelectModel1.collection("2wqS1MTX$65Bi[?G");
      dynamicSelectModel0.validate();
      // Undeclared exception!
      dynamicSelectModel0.translateValue(" evaluated to an object that is not an instance of Collection or Object[]. Can't build a dynamic ISelectModel");
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.7478680974667573
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      String string0 = ">";
      dynamicSelectModel0.collection("/6");
      String string1 = "^v24@5j6W;V{Gu_n";
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.label("^v24@5j6W;V{Gu_n");
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.label((String) null);
      Object object0 = new Object();
      dynamicSelectModel2.empty(object0);
      // Undeclared exception!
      try { 
        dynamicSelectModel2.getLabel(0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expression /6 evaluated to an object that is not an instance of Collection or Object[]. Can't build a dynamic ISelectModel
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }
}
