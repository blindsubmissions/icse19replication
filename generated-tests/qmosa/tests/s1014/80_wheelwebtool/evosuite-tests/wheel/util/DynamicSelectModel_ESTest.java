/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 13:43:48 GMT 2018
 */

package wheel.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mvel.util.FastList;
import wheel.ErrorPage;
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
      String string0 = "aQiq";
      ElExpression elExpression0 = new ElExpression("aQiq");
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
      String string0 = "OGJ^#K)s|Y)U-FvC";
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("OGJ^#K)s|Y)U-FvC");
      dynamicSelectModel1.reset();
      // Undeclared exception!
      try { 
        dynamicSelectModel0.translateValue("OGJ^#K)s|Y)U-FvC");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not evaluate expression OGJ^#K)s|Y)U-FvC.values() to create a dynamic ISelectModel.
         //
         verifyException("wheel.components.ElExpression", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("");
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel0.value("");
      DynamicSelectModel dynamicSelectModel3 = dynamicSelectModel2.value("");
      ErrorPage errorPage0 = new ErrorPage();
      dynamicSelectModel3.setTopLevelComponent(errorPage0);
      dynamicSelectModel0.translator("");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getLabel(1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not evaluate expression .values() to create a dynamic ISelectModel.
         //
         verifyException("wheel.components.ElExpression", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      ErrorPage errorPage0 = new ErrorPage();
      errorPage0.clasS("Could not evaluate expression ");
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("Could not evaluate expression ");
      dynamicSelectModel0.setTopLevelComponent(errorPage0);
      dynamicSelectModel0.setTopLevelComponent(errorPage0);
      dynamicSelectModel0.getTopLevelComponent();
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getLabel(1056);
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
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.translator("C|D3");
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.label("C|D3");
      DynamicSelectModel dynamicSelectModel3 = dynamicSelectModel2.collection("'");
      DynamicSelectModel dynamicSelectModel4 = dynamicSelectModel3.value((String) null);
      DynamicSelectModel dynamicSelectModel5 = dynamicSelectModel4.enumeration("LSQtr7:cfXm>%V\"");
      dynamicSelectModel5.collection("'");
      dynamicSelectModel4.validate();
      assertSame(dynamicSelectModel0, dynamicSelectModel4);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.7478680974667573
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      String string0 = null;
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection((String) null);
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.label((String) null);
      ErrorPage errorPage0 = new ErrorPage();
      dynamicSelectModel0.value((String) null);
      dynamicSelectModel2.setTopLevelComponent(errorPage0);
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getObjects();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expression null evaluated to null. Can't build a dynamic ISelectModel
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      String string0 = null;
      dynamicSelectModel0.translator((String) null);
      String string1 = "E,m8iE";
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
  //Test case number: 7
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      Object object0 = new Object();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.translator("classXwDQ\"");
      dynamicSelectModel1.collection("classXwDQ\"");
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
  //Test case number: 8
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      Object object0 = new Object();
      dynamicSelectModel0.empty(object0);
      dynamicSelectModel0.collection("[G-6+Q59zh(X)Z>[p");
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.label("[G-6+Q59zh(X)Z>[p");
      Object object1 = new Object();
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.empty(object1);
      dynamicSelectModel2.reset();
      dynamicSelectModel2.getComponent();
      DynamicSelectModel dynamicSelectModel3 = dynamicSelectModel0.empty(dynamicSelectModel1);
      dynamicSelectModel3.setComponent((Component) null);
      String string0 = "<TT[6";
      // Undeclared exception!
      try { 
        dynamicSelectModel0.translateValue("<TT[6");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not evaluate expression [G-6+Q59zh(X)Z>[p to create a dynamic ISelectModel.
         //
         verifyException("wheel.components.ElExpression", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.4750763110546947
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("");
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.label("");
      DynamicSelectModel dynamicSelectModel3 = dynamicSelectModel2.empty(dynamicSelectModel0);
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
  //Test case number: 10
  /*Coverage entropy=1.7478680974667573
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("2");
      String string0 = "()Z";
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.label("()Z");
      ErrorPage errorPage0 = new ErrorPage();
      dynamicSelectModel2.value("()Z");
      dynamicSelectModel2.setTopLevelComponent(errorPage0);
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getObjects();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expression 2 evaluated to an object that is not an instance of Collection or Object[]. Can't build a dynamic ISelectModel
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.8018924006588724
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      String string0 = "[]";
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("[]");
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.empty("[]");
      dynamicSelectModel2.collection("[]");
      DynamicSelectModel dynamicSelectModel3 = dynamicSelectModel0.value("[]");
      String string1 = "org.mvel.util.FastList@0000000027";
      dynamicSelectModel1.translateValue("org.mvel.util.FastList@0000000027");
      DynamicSelectModel dynamicSelectModel4 = dynamicSelectModel1.empty((Object) null);
      dynamicSelectModel4.label("[]");
      dynamicSelectModel3.translateValue("[]");
      Object object0 = new Object();
      Any any0 = null;
      try {
        any0 = new Any((Component) null, "[]");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.components.Component", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.985053187904615
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      String string0 = "[]";
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.translator("[]");
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.empty("[]");
      DynamicSelectModel dynamicSelectModel3 = dynamicSelectModel2.collection("[]");
      DynamicSelectModel dynamicSelectModel4 = dynamicSelectModel0.value("[]");
      String string1 = "org.mvel.util.FastList@0000000027";
      dynamicSelectModel1.translateValue("org.mvel.util.FastList@0000000027");
      DynamicSelectModel dynamicSelectModel5 = dynamicSelectModel1.empty((Object) null);
      dynamicSelectModel5.label("[]");
      dynamicSelectModel3.reset();
      dynamicSelectModel4.translateValue("[]");
      Object object0 = new Object();
      dynamicSelectModel0.translateValue("org.mvel.util.FastList@0000000113");
      Any any0 = null;
      try {
        any0 = new Any((Component) null, "[]");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.components.Component", e);
      }
  }
}