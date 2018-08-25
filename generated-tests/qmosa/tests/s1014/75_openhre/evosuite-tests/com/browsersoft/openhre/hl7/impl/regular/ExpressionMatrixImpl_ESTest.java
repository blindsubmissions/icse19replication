/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 13:31:59 GMT 2018
 */

package com.browsersoft.openhre.hl7.impl.regular;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.browsersoft.openhre.hl7.api.config.HL7Segment;
import com.browsersoft.openhre.hl7.api.regular.ExpressionElementMapper;
import com.browsersoft.openhre.hl7.impl.config.HL7SegmentMapImpl;
import com.browsersoft.openhre.hl7.impl.parser.HL7CheckerImpl;
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
  /*Coverage entropy=1.8310204811135162
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      expressionMatrixImpl0.outNoStandardConnections(false, expressionElementMapperImpl0);
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionElementMapperImpl0.clearAll();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.creatMatrix(801);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.creatMatrix(801);
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
  //Test case number: 1
  /*Coverage entropy=1.7721393884375285
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.setValue((-3428), 0, (-3428));
      expressionMatrixImpl0.creatMatrix(130);
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.getValue((-3428), 1376);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getNumberOfElements();
      int int0 = expressionMatrixImpl0.addNewNode();
      assertEquals(130, expressionMatrixImpl0.getNumberOfElements());
      assertEquals(0, int0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.5802363404761086
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(0);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(0);
      expressionMatrixImpl0.addNewNode();
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      expressionElementMapperImpl0.removeItem(1);
      expressionElementMapperImpl0.clearAll();
      expressionMatrixImpl0.outNoStandardConnections(false, expressionElementMapperImpl0);
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.setValue(0, (-1371), (-2025));
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.setValue(5, 0, 0);
      expressionMatrixImpl0.creatMatrix(0);
      expressionMatrixImpl0.creatMatrix(3512);
      expressionMatrixImpl0.setValue(1072, 0, 2);
      assertEquals(3512, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.9356005054539458
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix((-2912));
      expressionMatrixImpl0.creatMatrix(1);
      expressionMatrixImpl0.getValue((-2912), 0);
      expressionMatrixImpl0.creatMatrix((-1406));
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      HL7CheckerImpl hL7CheckerImpl0 = new HL7CheckerImpl();
      messageTracerImpl0.setHandler(hL7CheckerImpl0);
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.getValue(36, 2467);
      expressionMatrixImpl0.creatMatrix(0);
      MessageTracerImpl messageTracerImpl1 = new MessageTracerImpl();
      messageTracerImpl1.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl0.getNumberOfNodes();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.getNumberOfElements();
      messageTracerImpl1.setMatrix(expressionMatrixImpl0);
      messageTracerImpl1.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.getNumberOfNodes();
      expressionMatrixImpl0.setValue((-1), (-1), 0);
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.creatMatrix(0);
      assertEquals(0, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.5810937501718236
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(26);
      expressionMatrixImpl0.toString();
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl0 = new ExpressionElementMapperItemImpl();
      expressionElementMapperItemImpl0.setSegment((HL7Segment) null);
      expressionElementMapperImpl0.addItem(expressionElementMapperItemImpl0);
      expressionElementMapperImpl0.toString();
      // Undeclared exception!
      try { 
        expressionMatrixImpl0.outNoStandardConnections(true, expressionElementMapperImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.9459347757561138
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(0);
      expressionMatrixImpl0.creatMatrix(65);
      expressionMatrixImpl0.creatMatrix((-922));
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.creatMatrix((-2244));
      expressionMatrixImpl0.setValue(0, (-2224), 0);
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.creatMatrix(2);
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl0.creatMatrix(65);
      expressionMatrixImpl0.creatMatrix(0);
      expressionMatrixImpl0.getNumberOfNodes();
      expressionMatrixImpl0.getValue((-2244), 2416);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      assertEquals(0, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.7674248259297283
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(0);
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl0 = new ExpressionElementMapperItemImpl();
      HL7SegmentMapImpl hL7SegmentMapImpl0 = new HL7SegmentMapImpl();
      expressionElementMapperItemImpl0.setID("t^43");
      hL7SegmentMapImpl0.getSegmentsIds();
      hL7SegmentMapImpl0.getItem("post");
      expressionElementMapperItemImpl0.setSegment((HL7Segment) null);
      expressionMatrixImpl0.outNoStandardConnections(true, expressionElementMapperImpl0);
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.setValue((-854), (-1371), (-854));
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.setValue((-2025), 1, 0);
      expressionMatrixImpl0.creatMatrix(0);
      expressionMatrixImpl0.creatMatrix((-2208));
      expressionMatrixImpl0.setValue((-2912), 3512, 0);
      int int0 = expressionMatrixImpl0.getValue(0, (-854));
      assertEquals((-2208), expressionMatrixImpl0.getNumberOfElements());
      assertEquals((-1), int0);
  }
}