/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 12:28:46 GMT 2018
 */

package com.browsersoft.openhre.hl7.impl.regular;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.browsersoft.openhre.hl7.api.config.HL7Segment;
import com.browsersoft.openhre.hl7.api.parse.HL7Checker;
import com.browsersoft.openhre.hl7.api.regular.ExpressionElementMapper;
import com.browsersoft.openhre.hl7.api.regular.ExpressionElementMapperItem;
import com.browsersoft.openhre.hl7.api.regular.ExpressionPart;
import com.browsersoft.openhre.hl7.api.regular.MessageTracerHandler;
import com.browsersoft.openhre.hl7.impl.config.HL7MessageSegmentImpl;
import com.browsersoft.openhre.hl7.impl.config.HL7SegmentMapImpl;
import com.browsersoft.openhre.hl7.impl.parser.HL72XMLImpl;
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
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      expressionMatrixImpl0.outNoStandardConnections(false, expressionElementMapperImpl0);
      expressionMatrixImpl0.getNumberOfNodes();
      expressionMatrixImpl0.getNumberOfNodes();
      expressionMatrixImpl0.setValue(0, 0, 0);
      expressionMatrixImpl0.creatMatrix(0);
      int int0 = expressionMatrixImpl0.getNumberOfElements();
      assertEquals(0, int0);
      
      expressionMatrixImpl0.setValue(0, 0, 0);
      assertEquals(0, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.7478680974667573
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      expressionElementMapperImpl0.clearAll();
      int int0 = expressionMatrixImpl0.addNewNode();
      expressionElementMapperImpl0.removeItem((-1));
      expressionElementMapperImpl0.clearAll();
      expressionElementMapperImpl0.getItem((-1));
      expressionElementMapperImpl0.setItem((-1), (ExpressionElementMapperItem) null);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.outNoStandardConnections(false, expressionElementMapperImpl0);
      expressionMatrixImpl0.getNumberOfElements();
      String string0 = expressionMatrixImpl0.toString();
      assertEquals("MATRIX\n-----------------------\n | \n0| \n1| \n\nCONNECTIONS\n-----------------------\n", string0);
      
      expressionMatrixImpl0.getValue((-1), (-1));
      int int1 = expressionMatrixImpl0.addNewNode();
      assertEquals(2, int1);
      
      int int2 = expressionMatrixImpl0.getValue(0, 2);
      assertEquals((-1), int2);
      
      int int3 = expressionMatrixImpl0.getNumberOfElements();
      assertTrue(int3 == int0);
      assertEquals(0, int3);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
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
  //Test case number: 3
  /*Coverage entropy=1.6674619334292946
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.getValue((-217), 12450);
      expressionMatrixImpl0.setValue((-901), (-901), (-217));
      expressionMatrixImpl0.getNumberOfNodes();
      int int0 = expressionMatrixImpl0.addNewNode();
      assertEquals(0, int0);
      
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.getValue((-901), 12450);
      expressionMatrixImpl0.getNumberOfNodes();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.setValue(12450, 2749, 12450);
      int int1 = expressionMatrixImpl0.getValue((-1), 67);
      assertEquals((-1), int1);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.9061547465398496
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(1559);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getNumberOfNodes();
      expressionMatrixImpl0.setValue((-2277), 0, 2322);
      assertEquals(1559, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.7674248259297283
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      expressionElementMapperImpl0.removeItem((-1));
      expressionElementMapperImpl0.clearAll();
      expressionMatrixImpl0.outNoStandardConnections(true, expressionElementMapperImpl0);
      expressionMatrixImpl0.toString();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl0.setValue(0, 0, 0);
      expressionMatrixImpl0.setValue(0, 447, 0);
      expressionMatrixImpl0.creatMatrix(0);
      HL72XMLImpl hL72XMLImpl0 = new HL72XMLImpl();
      HL7Checker hL7Checker0 = hL72XMLImpl0.getChecker();
      messageTracerImpl0.setHandler(hL7Checker0);
      expressionMatrixImpl0.getValue(0, 0);
      expressionMatrixImpl0.getNumberOfNodes();
      expressionMatrixImpl0.setValue(1, 0, 0);
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl0.creatMatrix(0);
      expressionMatrixImpl0.creatMatrix((-700));
      assertEquals((-700), expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.9459347757561138
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(0);
      expressionMatrixImpl0.creatMatrix(65);
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      ExpressionImpl expressionImpl0 = new ExpressionImpl();
      expressionImpl0.getItem(0);
      expressionImpl0.setItem((-554), (ExpressionPart) null);
      HL7MessageSegmentImpl hL7MessageSegmentImpl0 = new HL7MessageSegmentImpl();
      messageTracerImpl0.doEndItem(expressionImpl0, hL7MessageSegmentImpl0);
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl0.getNumberOfNodes();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.setValue(65, 2, 419);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(2838, 957, 2);
      expressionMatrixImpl0.getNumberOfNodes();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.creatMatrix(4);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.getValue(2838, (-249));
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      assertEquals(4, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.5971700403519438
  */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.creatMatrix((-3180));
      expressionMatrixImpl0.setValue(1, 0, 0);
      expressionMatrixImpl0.getValue(0, (-3180));
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.creatMatrix(1);
      messageTracerImpl0.setMapper((ExpressionElementMapper) null);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getNumberOfNodes();
      ExpressionImpl expressionImpl0 = new ExpressionImpl();
      expressionImpl0.setNumberOfElementTypes(3);
      HL7MessageSegmentImpl hL7MessageSegmentImpl0 = new HL7MessageSegmentImpl();
      messageTracerImpl0.doEndItem(expressionImpl0, hL7MessageSegmentImpl0);
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.creatMatrix(75);
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.creatMatrix(0);
      expressionMatrixImpl0.creatMatrix(2);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(1, (-1), 0);
      expressionMatrixImpl0.creatMatrix(75);
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      assertEquals(75, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.6699768031135118
  */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.creatMatrix((-3180));
      expressionMatrixImpl0.setValue(1, 0, 0);
      expressionMatrixImpl0.getNumberOfNodes();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.creatMatrix(1);
      messageTracerImpl0.setMapper((ExpressionElementMapper) null);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getValue(4, 0);
      ExpressionImpl expressionImpl0 = new ExpressionImpl();
      expressionImpl0.setNumberOfElementTypes((-1));
      HL7MessageSegmentImpl hL7MessageSegmentImpl0 = new HL7MessageSegmentImpl();
      HL7SegmentMapImpl hL7SegmentMapImpl0 = new HL7SegmentMapImpl();
      expressionImpl0.getItem(1832);
      expressionImpl0.setItem((-3180), (ExpressionPart) null);
      hL7SegmentMapImpl0.getItem("MATRIX\n-----------------------\n | \n0| \n1| \n2| \n\nCONNECTIONS\n-----------------------\n");
      hL7MessageSegmentImpl0.setSegment((HL7Segment) null);
      messageTracerImpl0.doEndItem(expressionImpl0, hL7MessageSegmentImpl0);
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(3, 0, 3);
      expressionMatrixImpl0.creatMatrix(2);
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      assertEquals(2, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.7328679513998633
  */
  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.getNumberOfNodes();
      expressionMatrixImpl0.creatMatrix(161);
      expressionMatrixImpl0.addNewNode();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getNumberOfNodes();
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.creatMatrix((-3180));
      expressionMatrixImpl0.setValue(0, 0, 0);
      messageTracerImpl0.setMatrix(expressionMatrixImpl0);
      expressionMatrixImpl0.creatMatrix(0);
      messageTracerImpl0.setMapper((ExpressionElementMapper) null);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getNumberOfElements();
      HL7MessageSegmentImpl hL7MessageSegmentImpl0 = new HL7MessageSegmentImpl();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(1, 161, 1);
      expressionMatrixImpl0.creatMatrix(1);
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.toString();
      messageTracerImpl0.getHandler();
      messageTracerImpl0.setHandler((MessageTracerHandler) null);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      assertEquals(1, expressionMatrixImpl0.getNumberOfElements());
  }
}
