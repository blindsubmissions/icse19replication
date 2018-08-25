/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 09:25:28 GMT 2018
 */

package com.browsersoft.openhre.hl7.impl.regular;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.browsersoft.openhre.hl7.api.regular.ExpressionElementMapper;
import com.browsersoft.openhre.hl7.api.regular.ExpressionElementMapperItem;
import com.browsersoft.openhre.hl7.api.regular.ExpressionPart;
import com.browsersoft.openhre.hl7.impl.config.HL7MessageGroupImpl;
import com.browsersoft.openhre.hl7.impl.config.HL7MessageSegmentImpl;
import com.browsersoft.openhre.hl7.impl.regular.ExpressionElementMapperImpl;
import com.browsersoft.openhre.hl7.impl.regular.ExpressionImpl;
import com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl;
import com.browsersoft.openhre.hl7.impl.regular.MessageTracerImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ExpressionMatrixImpl_ESTest extends ExpressionMatrixImpl_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(1559);
      expressionMatrixImpl0.setValue(1559, 1559, 1559);
      expressionMatrixImpl0.setValue((-643), 60, 164);
      assertEquals(1559, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(0);
      int int0 = (-1857);
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      expressionMatrixImpl0.creatMatrix(1072);
      expressionElementMapperImpl0.getItem((-1857));
      expressionElementMapperImpl0.addItem((ExpressionElementMapperItem) null);
      expressionElementMapperImpl0.getItem((-1857));
      expressionMatrixImpl0.addNewNode();
      expressionElementMapperImpl0.setItem(3036, (ExpressionElementMapperItem) null);
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
  //Test case number: 2
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(281, (-964), (-3786));
      expressionMatrixImpl0.setValue(0, (-688), 0);
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      String string0 = expressionMatrixImpl0.outNoStandardConnections(false, expressionElementMapperImpl0);
      assertEquals("", string0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.addNewNode();
      String string0 = expressionMatrixImpl0.toString();
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      expressionElementMapperImpl0.removeItem(0);
      expressionElementMapperImpl0.clearAll();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.toString();
      messageTracerImpl0.getMapper();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.setValue(936, 16384, 2158);
      expressionMatrixImpl0.setValue(0, 1909, 447);
      MessageTracerImpl messageTracerImpl1 = new MessageTracerImpl();
      messageTracerImpl1.getMapper();
      String string1 = expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      assertFalse(string1.equals((Object)string0));
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.addNewNode();
      int int1 = expressionMatrixImpl0.addNewNode();
      assertEquals(1, int1);
      
      expressionMatrixImpl0.toString();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getValue(0, (-257));
      MessageTracerImpl messageTracerImpl1 = new MessageTracerImpl();
      messageTracerImpl1.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      ExpressionMatrixImpl expressionMatrixImpl1 = new ExpressionMatrixImpl();
      expressionMatrixImpl1.toString();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      ExpressionMatrixImpl expressionMatrixImpl2 = new ExpressionMatrixImpl();
      int int2 = expressionMatrixImpl2.getNumberOfElements();
      assertTrue(int2 == int0);
      
      expressionMatrixImpl0.getValue(30, (-1783));
      int int3 = expressionMatrixImpl1.getValue(8, 4535);
      assertEquals((-1), int3);
      
      String string0 = expressionMatrixImpl0.toString();
      assertEquals("MATRIX\n-----------------------\n | \n0| \n1| \n\nCONNECTIONS\n-----------------------\n", string0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.getValue(65, 0);
      expressionMatrixImpl0.creatMatrix(29);
      expressionMatrixImpl0.creatMatrix(29);
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      ExpressionImpl expressionImpl0 = new ExpressionImpl();
      expressionImpl0.readFromStringForDebug(" ---> ");
      expressionImpl0.getItem(59);
      expressionImpl0.setItem(38, (ExpressionPart) null);
      HL7MessageSegmentImpl hL7MessageSegmentImpl0 = new HL7MessageSegmentImpl();
      ExpressionImpl expressionImpl1 = new ExpressionImpl();
      HL7MessageGroupImpl hL7MessageGroupImpl0 = new HL7MessageGroupImpl();
      messageTracerImpl0.doEndItem(expressionImpl0, hL7MessageGroupImpl0);
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getNumberOfNodes();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.setValue(1914, 29, 1281);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.getNumberOfNodes();
      expressionMatrixImpl0.setValue(1, 1, 29);
      expressionMatrixImpl0.getNumberOfNodes();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getNumberOfElements();
      ExpressionMatrixImpl expressionMatrixImpl1 = new ExpressionMatrixImpl();
      expressionMatrixImpl1.creatMatrix(501);
      expressionMatrixImpl1.addNewNode();
      expressionMatrixImpl1.getValue((-1), 3);
      int int0 = expressionMatrixImpl0.addNewNode();
      assertEquals(29, expressionMatrixImpl0.getNumberOfElements());
      assertEquals(4, int0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.getNumberOfNodes();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.getValue((-3113), 0);
      expressionMatrixImpl0.creatMatrix(65);
      expressionMatrixImpl0.creatMatrix(65);
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      ExpressionImpl expressionImpl0 = new ExpressionImpl();
      expressionImpl0.getItem(0);
      expressionImpl0.setItem(65, (ExpressionPart) null);
      HL7MessageSegmentImpl hL7MessageSegmentImpl0 = new HL7MessageSegmentImpl();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl0.getNumberOfNodes();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.setValue(1, 0, 0);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(3, 0, 501);
      expressionMatrixImpl0.getNumberOfNodes();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.getNumberOfNodes();
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      assertEquals(65, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(65);
      expressionMatrixImpl0.creatMatrix(65);
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      ExpressionImpl expressionImpl0 = new ExpressionImpl();
      expressionImpl0.getItem(0);
      expressionImpl0.setItem(65, (ExpressionPart) null);
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl0.getNumberOfNodes();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl0.setValue(1, 1, 0);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.getNumberOfNodes();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.creatMatrix(65);
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.toString();
      assertEquals(65, expressionMatrixImpl0.getNumberOfElements());
  }
}
