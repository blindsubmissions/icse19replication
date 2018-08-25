/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 12:49:51 GMT 2018
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
      String string0 = "pb/^:V9(Vl'HTwJ2D";
      ElExpression elExpression0 = new ElExpression("pb/^:V9(Vl'HTwJ2D");
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
      String string0 = "org.xmlpull.v1.XmlPullParserFactory";
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.value("org.xmlpull.v1.XmlPullParserFactory");
      dynamicSelectModel1.enumeration(",");
      dynamicSelectModel0.reset();
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getObjects();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not evaluate expression ,.values() to create a dynamic ISelectModel.
         //
         verifyException("wheel.components.ElExpression", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ErrorPage errorPage0 = new ErrorPage();
      TextArea textArea0 = new TextArea(errorPage0, "ordinal()", "Vq=t0YE");
      Any any0 = new Any(textArea0, "Vq=t0YE");
      DynamicSelectModel dynamicSelectModel0 = any0.selectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.empty(errorPage0);
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.translator("Vq=t0YE");
      dynamicSelectModel2.collection((String) null);
      // Undeclared exception!
      try { 
        dynamicSelectModel2.getObjects();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expression null evaluated to null. Can't build a dynamic ISelectModel
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
      Object object0 = new Object();
      dynamicSelectModel0.empty(object0);
      Object object1 = new Object();
      dynamicSelectModel0.empty(object1);
      String string0 = "";
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getOptionCount();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expression  evaluated to null. Can't build a dynamic ISelectModel
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.7478680974667573
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.value("@T\")OvtUS63Z}");
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.collection("B SXb)hV");
      dynamicSelectModel2.collection("@T\")OvtUS63Z}");
      dynamicSelectModel0.translator("@T\")OvtUS63Z}");
      DynamicSelectModel dynamicSelectModel3 = dynamicSelectModel2.collection("org.apache.commons.io.filefilter.NameFileFilter");
      // Undeclared exception!
      try { 
        dynamicSelectModel3.getValue(0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expression org.apache.commons.io.filefilter.NameFileFilter evaluated to an object that is not an instance of Collection or Object[]. Can't build a dynamic ISelectModel
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
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.value("xcfIatq;fwWQ^{g-8i");
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.collection("xcfIatq;fwWQ^{g-8i");
      DynamicSelectModel dynamicSelectModel3 = dynamicSelectModel2.enumeration("zGo`uAK");
      DynamicSelectModel dynamicSelectModel4 = dynamicSelectModel3.translator("attribute position must be 0..");
      dynamicSelectModel4.label("attribute position must be 0..");
      String string0 = "%c";
      dynamicSelectModel4.label("%c");
      DynamicSelectModel dynamicSelectModel5 = dynamicSelectModel4.translator("q)O&A$r;");
      dynamicSelectModel5.empty(dynamicSelectModel2);
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getLabel((-1));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not evaluate expression zGo`uAK.values() to create a dynamic ISelectModel.
         //
         verifyException("wheel.components.ElExpression", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.setComponent((Component) null);
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("toString()");
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.label("c9<'&|6C\\=.<qDap^");
      // Undeclared exception!
      try { 
        dynamicSelectModel2.translateValue("ZhCg,j6/=>my,lP3C*w");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not evaluate expression toString() to create a dynamic ISelectModel.
         //
         verifyException("wheel.components.ElExpression", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      String string0 = "@T\")OvtUS63Z}";
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.value("@T\")OvtUS63Z}");
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.collection("Expression ");
      DynamicSelectModel dynamicSelectModel3 = dynamicSelectModel1.label("Expression ");
      dynamicSelectModel3.validate();
      dynamicSelectModel0.translator("@T\")OvtUS63Z}");
      dynamicSelectModel2.collection("org.apache.commons.io.filefilter.NameFileFilter");
      // Undeclared exception!
      try { 
        dynamicSelectModel3.getOptionCount();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expression org.apache.commons.io.filefilter.NameFileFilter evaluated to an object that is not an instance of Collection or Object[]. Can't build a dynamic ISelectModel
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.empty("@T\")OvtUS63Z}");
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.enumeration((String) null);
      dynamicSelectModel2.getComponent();
      dynamicSelectModel2.getTopLevelComponent();
      dynamicSelectModel0.setTopLevelComponent((StandaloneComponent) null);
      assertSame(dynamicSelectModel0, dynamicSelectModel1);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      String string0 = "B SXb)hV";
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("B SXb)hV");
      String string1 = "org.apache.commons.io.filefilter.NameFileFilter";
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.collection("@T\")OvtUS63Z}");
      dynamicSelectModel0.translator("@T\")OvtUS63Z}");
      dynamicSelectModel1.collection("org.apache.commons.io.filefilter.NameFileFilter");
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
  //Test case number: 10
  /*Coverage entropy=1.6674619334292948
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.collection(":-d:y%4t>");
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.label("");
      dynamicSelectModel1.translator("");
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.collection("");
      dynamicSelectModel2.reset();
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
