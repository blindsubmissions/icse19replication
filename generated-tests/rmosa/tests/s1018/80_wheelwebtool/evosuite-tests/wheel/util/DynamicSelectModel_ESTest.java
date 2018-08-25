/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 13:34:05 GMT 2018
 */

package wheel.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
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
  //Test case number: 1
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
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
  //Test case number: 2
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
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
  //Test case number: 3
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.setTopLevelComponent((StandaloneComponent) null);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      StandaloneComponent standaloneComponent0 = dynamicSelectModel0.getTopLevelComponent();
      assertNull(standaloneComponent0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getLabel(201);
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
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("org.mvel.conversion.BigDecimalCH$6");
      dynamicSelectModel0.collection((String) null);
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getObjects();
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      ErrorPage errorPage0 = new ErrorPage();
      dynamicSelectModel0.setComponent(errorPage0);
      assertEquals("div", errorPage0.defaultTagName());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("H");
      dynamicSelectModel0.validate();
      assertSame(dynamicSelectModel0, dynamicSelectModel1);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("org.apache.commons.io.filefilter.SizeFileFilter");
      dynamicSelectModel1.label("org.apache.commons.io.filefilter.SizeFileFilter");
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

  /**
  //Test case number: 10
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("org.apache.commons.io.filefilter.SizeFileFilter");
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ErrorPage errorPage0 = new ErrorPage();
      Any any0 = new Any(errorPage0, "");
      DynamicSelectModel dynamicSelectModel0 = any0.selectModel();
      Component component0 = dynamicSelectModel0.getComponent();
      assertNull(component0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("org.mvel.conversion.BigDecimalCH$6");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getObjects();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expression org.mvel.conversion.BigDecimalCH$6 evaluated to an object that is not an instance of Collection or Object[]. Can't build a dynamic ISelectModel
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.0735428464085233
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ErrorPage errorPage0 = new ErrorPage();
      Object object0 = new Object();
      Label label0 = new Label(errorPage0, object0);
      label0.span(object0);
      TextArea textArea0 = new TextArea(label0, "[] from ", "attribute name can not be null");
      Any any0 = new Any(textArea0, "attribute name can not be null");
      DynamicSelectModel dynamicSelectModel0 = any0.selectModel();
      dynamicSelectModel0.enumeration("[] from ");
      dynamicSelectModel0.getObjects();
      dynamicSelectModel0.translateValue("java/lang/Doble");
      Object object1 = dynamicSelectModel0.translateValue("[] from ");
      assertNull(object1);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.empty("org.mvel.coversion.BigDecimalCH$6");
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.collection("[]rom ");
      Collection collection0 = dynamicSelectModel2.getObjects();
      assertNotNull(collection0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.63509159281281
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ErrorPage errorPage0 = new ErrorPage();
      Object object0 = new Object();
      Label label0 = new Label(errorPage0, object0);
      TextArea textArea0 = new TextArea(label0, "[] from ", "_Od9GV");
      Any any0 = new Any(textArea0, "_Od9GV");
      DynamicSelectModel dynamicSelectModel0 = any0.selectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("[] from ");
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.empty(object0);
      DynamicSelectModel dynamicSelectModel3 = dynamicSelectModel1.empty(textArea0);
      DynamicSelectModel dynamicSelectModel4 = dynamicSelectModel2.value("[] from ");
      dynamicSelectModel4.translateValue("_Od9GV");
      dynamicSelectModel2.translateValue("_Od9GV");
      dynamicSelectModel1.getObjects();
      dynamicSelectModel1.translateValue("Kheel.util.DynamicSelectModel");
      dynamicSelectModel1.translateValue("org.mvel.util.FastList@0000000075");
      dynamicSelectModel0.getObjects();
      Collection collection0 = dynamicSelectModel3.getObjects();
      Collection collection1 = dynamicSelectModel1.getObjects();
      assertSame(collection1, collection0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.8864851602714516
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ErrorPage errorPage0 = new ErrorPage();
      Object object0 = new Object();
      Label label0 = new Label(errorPage0, object0);
      TextArea textArea0 = new TextArea(label0, "[] from ", "_Od 9GV");
      Any any0 = new Any(textArea0, "_Od 9GV");
      DynamicSelectModel dynamicSelectModel0 = any0.selectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("[] from ");
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.empty(object0);
      DynamicSelectModel dynamicSelectModel3 = dynamicSelectModel1.empty(textArea0);
      DynamicSelectModel dynamicSelectModel4 = dynamicSelectModel2.value("[] from ");
      dynamicSelectModel4.reset();
      dynamicSelectModel4.translateValue("_Od 9GV");
      dynamicSelectModel2.translateValue("Kheel.util.DynamicSelectModel");
      dynamicSelectModel3.getObjects();
      dynamicSelectModel1.getObjects();
      DynamicSelectModel dynamicSelectModel5 = dynamicSelectModel2.translator("_Od 9GV");
      dynamicSelectModel1.translateValue("Kheel.util.DynamicSelectModel");
      dynamicSelectModel1.translateValue("org.mvel.util.FastList@0000000075");
      dynamicSelectModel4.getObjects();
      // Undeclared exception!
      try { 
        dynamicSelectModel5.translateValue("org.mvel.util.FastList@0000000089");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not evaluate expression _Od 9GV to translate value ' org.mvel.util.FastList@0000000089'
         //
         verifyException("wheel.components.ElExpression", e);
      }
  }
}
