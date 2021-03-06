/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 10:43:47 GMT 2018
 */

package com.browsersoft.openhre.hl7.impl.regular;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.browsersoft.openhre.hl7.api.regular.ExpressionElementMapper;
import com.browsersoft.openhre.hl7.api.regular.ExpressionElementMapperItem;
import com.browsersoft.openhre.hl7.impl.regular.ExpressionElementMapperImpl;
import com.browsersoft.openhre.hl7.impl.regular.ExpressionElementMapperItemImpl;
import com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl;
import com.browsersoft.openhre.hl7.impl.regular.MessageTracerImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ExpressionMatrixImpl_ESTest extends ExpressionMatrixImpl_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl0 = new ExpressionElementMapperItemImpl();
      expressionElementMapperImpl0.setItem(346, expressionElementMapperItemImpl0);
      expressionMatrixImpl0.outNoStandardConnections(false, expressionElementMapperImpl0);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getNumberOfNodes();
      expressionMatrixImpl0.setValue(0, 346, 1);
      int int0 = expressionMatrixImpl0.getNumberOfNodes();
      assertEquals(0, int0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getValue(2114, 2114);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getValue((-3606), (-3606));
      expressionMatrixImpl0.getNumberOfNodes();
      expressionMatrixImpl0.getNumberOfNodes();
      expressionMatrixImpl0.creatMatrix((-1));
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.getNumberOfNodes();
      // Undeclared exception!
      try { 
        expressionMatrixImpl0.addNewNode();
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.0431918705451206
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.creatMatrix(0);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(0);
      expressionMatrixImpl0.creatMatrix(0);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.setValue(0, 0, (-43));
      expressionMatrixImpl0.getValue(0, 0);
      expressionMatrixImpl0.creatMatrix(0);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.toString();
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      expressionElementMapperImpl0.removeItem((-1202));
      expressionElementMapperImpl0.clearAll();
      expressionElementMapperImpl0.getItem((-1));
      expressionElementMapperImpl0.addItem((ExpressionElementMapperItem) null);
      expressionMatrixImpl0.outNoStandardConnections(false, expressionElementMapperImpl0);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(1);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getNumberOfNodes();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.creatMatrix((-1202));
      expressionMatrixImpl0.outNoStandardConnections(false, expressionElementMapperImpl0);
      expressionMatrixImpl0.getValue(1851, 0);
      // Undeclared exception!
      try { 
        expressionMatrixImpl0.addNewNode();
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.setValue((-1986), (-119), (-119));
      expressionMatrixImpl0.creatMatrix((-1986));
      // Undeclared exception!
      try { 
        expressionMatrixImpl0.addNewNode();
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.5118965585343875
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      int int1 = expressionMatrixImpl0.addNewNode();
      assertEquals(2, int1);
      
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      int int2 = expressionMatrixImpl0.getNumberOfElements();
      assertTrue(int2 == int0);
      
      expressionMatrixImpl0.setValue(0, 0, 0);
      String string0 = expressionMatrixImpl0.toString();
      assertEquals("MATRIX\n-----------------------\n | \n0| \n1| \n2| \n\nCONNECTIONS\n-----------------------\n", string0);
      
      expressionMatrixImpl0.setValue(0, (-3881), 0);
      expressionMatrixImpl0.setValue(3553, (-3881), 0);
      assertEquals(0, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.4941751382893083
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = 1896;
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(1896);
      expressionMatrixImpl0.getValue(0, (-2807));
      expressionMatrixImpl0.addNewNode();
      int int1 = 1566;
      expressionMatrixImpl0.creatMatrix(1566);
      boolean boolean0 = true;
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.setMatrix(expressionMatrixImpl0);
      // Undeclared exception!
      try { 
        messageTracerImpl0.processNextSegment("p`8>Z|80");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.browsersoft.openhre.hl7.impl.regular.MessageTracerImpl", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.7480673485460891
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(655);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.getNumberOfNodes();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(1, 0, 0);
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.setValue(2, (-431), (-431));
      int int0 = expressionMatrixImpl0.getNumberOfElements();
      assertEquals(655, int0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.8937882323911377
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      boolean boolean0 = true;
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      expressionElementMapperImpl0.clearAll();
      expressionMatrixImpl0.outNoStandardConnections(true, expressionElementMapperImpl0);
      expressionMatrixImpl0.getNumberOfNodes();
      ExpressionElementMapperImpl expressionElementMapperImpl1 = new ExpressionElementMapperImpl();
      expressionElementMapperImpl1.removeItem(0);
      expressionMatrixImpl0.outNoStandardConnections(true, expressionElementMapperImpl1);
      expressionMatrixImpl0.creatMatrix(1);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      boolean boolean1 = false;
      ExpressionElementMapperImpl expressionElementMapperImpl2 = new ExpressionElementMapperImpl();
      expressionElementMapperImpl2.removeItem(2);
      expressionElementMapperImpl2.toString();
      expressionElementMapperImpl2.removeItem((-3309));
      expressionElementMapperImpl2.clearAll();
      expressionElementMapperImpl2.removeItem(203);
      expressionMatrixImpl0.toString();
      // Undeclared exception!
      try { 
        expressionMatrixImpl0.outNoStandardConnections(true, expressionElementMapperImpl1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.8143075196071254
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = (-200);
      expressionMatrixImpl0.creatMatrix(800);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.setValue(800, (-200), 38);
      expressionMatrixImpl0.creatMatrix(10);
      expressionMatrixImpl0.getValue(909, 909);
      boolean boolean0 = false;
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      expressionMatrixImpl0.outNoStandardConnections(false, expressionElementMapperImpl0);
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl0 = new ExpressionElementMapperItemImpl();
      expressionElementMapperImpl0.removeItem((-200));
      expressionElementMapperItemImpl0.toString();
      expressionElementMapperImpl0.addItem(expressionElementMapperItemImpl0);
      expressionMatrixImpl0.getValue(0, 0);
      expressionMatrixImpl0.outNoStandardConnections(true, expressionElementMapperImpl0);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.getNumberOfElements();
      // Undeclared exception!
      try { 
        expressionMatrixImpl0.outNoStandardConnections(false, expressionElementMapperImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.3827187230197877
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.creatMatrix(2824);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.setValue(75, 322, 75);
      expressionMatrixImpl0.addNewNode();
      boolean boolean0 = false;
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      // Undeclared exception!
      try { 
        expressionMatrixImpl0.outNoStandardConnections(false, expressionElementMapperImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.8143075196071254
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(895);
      expressionMatrixImpl0.getNumberOfNodes();
      expressionMatrixImpl0.creatMatrix(895);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(895);
      ExpressionElementMapper expressionElementMapper0 = null;
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.creatMatrix(3296);
      expressionMatrixImpl0.creatMatrix(1);
      expressionMatrixImpl0.getNumberOfNodes();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(895);
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.setValue(3314, (-902), 1);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      // Undeclared exception!
      expressionMatrixImpl0.toString();
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.589026915173973
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.creatMatrix(2824);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.setValue(89, 322, 89);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 89, 322);
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      // Undeclared exception!
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.0102750119258221
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.creatMatrix(2824);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.setValue(89, 322, 89);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 89, 322);
      expressionMatrixImpl0.toString();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.getNumberOfNodes();
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.450805020083924
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.creatMatrix(2824);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.setValue(89, 322, 89);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 89, 322);
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      boolean boolean0 = true;
      // Undeclared exception!
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.3897154547004784
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.creatMatrix(2824);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.setValue(0, 322, 0);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 2824, 322);
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      // Undeclared exception!
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.450805020083924
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.creatMatrix(2824);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 0, 2824);
      ExpressionMatrixImpl expressionMatrixImpl1 = new ExpressionMatrixImpl();
      expressionMatrixImpl1.addNewNode();
      expressionMatrixImpl1.setValue(842, 148, 0);
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      ExpressionMatrixImpl expressionMatrixImpl2 = new ExpressionMatrixImpl();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl2.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl1.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.3897154547004784
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.creatMatrix(2824);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.setValue(0, 322, 0);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 2824, 322);
      boolean boolean0 = false;
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      // Undeclared exception!
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.981102200701706
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.creatMatrix(2824);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.setValue(89, 2824, 89);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 0, 1148);
      expressionMatrixImpl0.toString();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      ExpressionMatrixImpl expressionMatrixImpl1 = new ExpressionMatrixImpl();
      expressionMatrixImpl1.toString();
      messageTracerImpl0.setMatrix(expressionMatrixImpl1);
      MessageTracerImpl messageTracerImpl1 = new MessageTracerImpl();
      messageTracerImpl1.getMapper();
      expressionMatrixImpl0.getNumberOfNodes();
  }
}
