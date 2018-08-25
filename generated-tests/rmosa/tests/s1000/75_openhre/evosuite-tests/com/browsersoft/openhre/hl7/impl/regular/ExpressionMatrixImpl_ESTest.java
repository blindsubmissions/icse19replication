/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 04:29:01 GMT 2018
 */

package com.browsersoft.openhre.hl7.impl.regular;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.browsersoft.openhre.hl7.api.config.HL7Message;
import com.browsersoft.openhre.hl7.api.config.HL7MessageGroupItem;
import com.browsersoft.openhre.hl7.api.regular.ExpressionElementMapper;
import com.browsersoft.openhre.hl7.impl.config.HL7MessageGroupImpl;
import com.browsersoft.openhre.hl7.impl.config.HL7MessageImpl;
import com.browsersoft.openhre.hl7.impl.config.HL7MessageMapImpl;
import com.browsersoft.openhre.hl7.impl.config.HL7MessageSegmentImpl;
import com.browsersoft.openhre.hl7.impl.parser.HL7CheckerImpl;
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
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(4);
      expressionMatrixImpl0.addNewNode();
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
  //Test case number: 1
  /*Coverage entropy=1.5405845222393524
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl0.creatMatrix(0);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl0.creatMatrix(331);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getNumberOfNodes();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.toString();
      assertEquals(331, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.getValue(1519, (-1897));
      int int0 = expressionMatrixImpl0.addNewNode();
      assertEquals(0, int0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.addNewNode();
      assertEquals(0, int0);
      
      expressionMatrixImpl0.getValue(0, (-133));
      int int1 = expressionMatrixImpl0.getNumberOfNodes();
      assertFalse(int1 == int0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.setValue(4, 4, 4);
      expressionMatrixImpl0.setValue(0, 0, 0);
      assertEquals(0, expressionMatrixImpl0.getNumberOfNodes());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.getNumberOfElements();
      boolean boolean0 = true;
      ExpressionElementMapper expressionElementMapper0 = null;
      int int0 = (-599);
      int int1 = 80;
      expressionMatrixImpl0.setValue(0, (-599), 80);
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      ExpressionImpl expressionImpl0 = new ExpressionImpl();
      HL7MessageImpl hL7MessageImpl0 = new HL7MessageImpl();
      hL7MessageImpl0.getGroup();
      // Undeclared exception!
      try { 
        messageTracerImpl0.doBeginItem(expressionImpl0, (HL7MessageGroupItem) null);
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
  /*Coverage entropy=1.5516146755258797
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      String string0 = expressionMatrixImpl0.toString();
      assertEquals("MATRIX\n-----------------------\n | \n\nCONNECTIONS\n-----------------------\n", string0);
      
      expressionMatrixImpl0.creatMatrix(139);
      expressionMatrixImpl0.addNewNode();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      int int0 = expressionMatrixImpl0.addNewNode();
      assertEquals(1, int0);
      
      HL7CheckerImpl hL7CheckerImpl0 = new HL7CheckerImpl();
      expressionMatrixImpl0.toString();
      messageTracerImpl0.setHandler(hL7CheckerImpl0);
      expressionMatrixImpl0.toString();
      ExpressionImpl expressionImpl0 = new ExpressionImpl();
      HL7MessageGroupImpl hL7MessageGroupImpl0 = new HL7MessageGroupImpl();
      ExpressionImpl expressionImpl1 = new ExpressionImpl();
      messageTracerImpl0.getMapper();
      ExpressionImpl expressionImpl2 = new ExpressionImpl();
      HL7MessageSegmentImpl hL7MessageSegmentImpl0 = new HL7MessageSegmentImpl();
      messageTracerImpl0.doBeginItem(expressionImpl1, hL7MessageGroupImpl0);
      expressionMatrixImpl0.creatMatrix(522);
      expressionMatrixImpl0.setValue(1, 0, 139);
      expressionMatrixImpl0.getValue(0, 5021);
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      String string1 = expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      assertEquals("", string1);
      
      String string2 = expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      assertEquals("1 --- A ---> 139\n", string2);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      String string0 = expressionMatrixImpl0.toString();
      assertEquals("MATRIX\n-----------------------\n | \n\nCONNECTIONS\n-----------------------\n", string0);
      
      int int0 = expressionMatrixImpl0.getNumberOfElements();
      int int1 = expressionMatrixImpl0.addNewNode();
      assertTrue(int1 == int0);
      
      expressionMatrixImpl0.setValue(0, 0, 0);
      assertEquals(0, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      String string0 = expressionMatrixImpl0.toString();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.setMatrix(expressionMatrixImpl0);
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      HL7MessageGroupImpl hL7MessageGroupImpl0 = new HL7MessageGroupImpl();
      ExpressionImpl expressionImpl0 = new ExpressionImpl();
      messageTracerImpl0.getMapper();
      ExpressionImpl expressionImpl1 = new ExpressionImpl();
      HL7MessageSegmentImpl hL7MessageSegmentImpl0 = new HL7MessageSegmentImpl();
      messageTracerImpl0.doBeginItem(expressionImpl0, hL7MessageGroupImpl0);
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.setValue((-845), 130, 0);
      messageTracerImpl0.getMapper();
      ExpressionMatrixImpl expressionMatrixImpl1 = new ExpressionMatrixImpl();
      String string1 = expressionMatrixImpl1.outNoStandardConnections(true, (ExpressionElementMapper) null);
      assertFalse(string1.equals((Object)string0));
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = (-1761);
      expressionMatrixImpl0.getValue((-1761), (-1761));
      int int1 = 0;
      expressionMatrixImpl0.creatMatrix(0);
      boolean boolean0 = false;
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      HL7MessageMapImpl hL7MessageMapImpl0 = new HL7MessageMapImpl();
      hL7MessageMapImpl0.removeItem("WG_FOUND_CURLYBRACE");
      hL7MessageMapImpl0.getItem("WG_FOUND_CURLYBRACE");
      hL7MessageMapImpl0.getItem("WG_FOUND_CURLYBRACE");
      // Undeclared exception!
      try { 
        messageTracerImpl0.buildMatrixForMessage((HL7Message) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.browsersoft.openhre.hl7.impl.regular.MessageTracerImpl", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      String string0 = expressionMatrixImpl0.toString();
      assertEquals("MATRIX\n-----------------------\n | \n\nCONNECTIONS\n-----------------------\n", string0);
      
      expressionMatrixImpl0.creatMatrix(139);
      expressionMatrixImpl0.addNewNode();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      expressionMatrixImpl0.toString();
      int int0 = expressionMatrixImpl0.addNewNode();
      assertEquals(1, int0);
      
      HL7CheckerImpl hL7CheckerImpl0 = new HL7CheckerImpl();
      messageTracerImpl0.setHandler(hL7CheckerImpl0);
      expressionMatrixImpl0.toString();
      ExpressionImpl expressionImpl0 = new ExpressionImpl();
      HL7MessageGroupImpl hL7MessageGroupImpl0 = new HL7MessageGroupImpl();
      ExpressionImpl expressionImpl1 = new ExpressionImpl();
      messageTracerImpl0.getMapper();
      ExpressionImpl expressionImpl2 = new ExpressionImpl();
      HL7MessageSegmentImpl hL7MessageSegmentImpl0 = new HL7MessageSegmentImpl();
      messageTracerImpl0.doBeginItem(expressionImpl2, hL7MessageSegmentImpl0);
      expressionMatrixImpl0.creatMatrix(1981);
      expressionMatrixImpl0.setValue(0, 0, 0);
      messageTracerImpl0.getMapper();
      String string1 = expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      assertEquals("", string1);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.creatMatrix(364);
      expressionMatrixImpl0.addNewNode();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.addNewNode();
      HL7CheckerImpl hL7CheckerImpl0 = new HL7CheckerImpl();
      expressionMatrixImpl0.toString();
      messageTracerImpl0.setHandler(hL7CheckerImpl0);
      expressionMatrixImpl0.toString();
      ExpressionImpl expressionImpl0 = new ExpressionImpl();
      ExpressionImpl expressionImpl1 = new ExpressionImpl();
      messageTracerImpl0.getMapper();
      ExpressionImpl expressionImpl2 = new ExpressionImpl();
      HL7MessageSegmentImpl hL7MessageSegmentImpl0 = new HL7MessageSegmentImpl();
      messageTracerImpl0.doBeginItem(expressionImpl2, hL7MessageSegmentImpl0);
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.creatMatrix(1981);
      expressionMatrixImpl0.setValue(0, 0, (-845));
      // Undeclared exception!
      expressionMatrixImpl0.toString();
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.creatMatrix(139);
      expressionMatrixImpl0.addNewNode();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.addNewNode();
      HL7CheckerImpl hL7CheckerImpl0 = new HL7CheckerImpl();
      expressionMatrixImpl0.toString();
      messageTracerImpl0.setHandler(hL7CheckerImpl0);
      expressionMatrixImpl0.toString();
      ExpressionImpl expressionImpl0 = new ExpressionImpl();
      HL7MessageGroupImpl hL7MessageGroupImpl0 = new HL7MessageGroupImpl();
      ExpressionImpl expressionImpl1 = new ExpressionImpl();
      messageTracerImpl0.getMapper();
      ExpressionImpl expressionImpl2 = new ExpressionImpl();
      HL7MessageSegmentImpl hL7MessageSegmentImpl0 = new HL7MessageSegmentImpl();
      messageTracerImpl0.doBeginItem(expressionImpl2, hL7MessageSegmentImpl0);
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.creatMatrix(1981);
      expressionMatrixImpl0.setValue(0, 1, (-845));
      expressionMatrixImpl0.toString();
      // Undeclared exception!
      expressionMatrixImpl0.toString();
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.creatMatrix(189);
      expressionMatrixImpl0.addNewNode();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      expressionMatrixImpl0.addNewNode();
      HL7CheckerImpl hL7CheckerImpl0 = new HL7CheckerImpl();
      expressionMatrixImpl0.toString();
      messageTracerImpl0.setHandler(hL7CheckerImpl0);
      expressionMatrixImpl0.toString();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.creatMatrix(1);
      expressionMatrixImpl0.setValue(1, 0, (-1437));
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
  }
}
