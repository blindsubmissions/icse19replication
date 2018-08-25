/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 07 14:09:52 GMT 2018
 */

package com.browsersoft.openhre.hl7.impl.regular;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.browsersoft.openhre.hl7.api.regular.ExpressionMatrix;
import com.browsersoft.openhre.hl7.api.regular.MessageTracerHandler;
import com.browsersoft.openhre.hl7.impl.config.HL7MessageGroupImpl;
import com.browsersoft.openhre.hl7.impl.config.HL7MessageImpl;
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
public class MessageTracerImpl_ESTest extends MessageTracerImpl_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      messageTracerImpl0.setMapper(expressionElementMapperImpl0);
      assertEquals(0, expressionElementMapperImpl0.size());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      MessageTracerHandler messageTracerHandler0 = messageTracerImpl0.getHandler();
      assertNull(messageTracerHandler0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      ExpressionMatrix expressionMatrix0 = messageTracerImpl0.getMatrix();
      assertNull(expressionMatrix0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      // Undeclared exception!
      try { 
        messageTracerImpl0.processEnd();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.browsersoft.openhre.hl7.impl.regular.MessageTracerImpl", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.reset();
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      HL7MessageImpl hL7MessageImpl0 = new HL7MessageImpl();
      // Undeclared exception!
      try { 
        messageTracerImpl0.buildMatrixForMessage(hL7MessageImpl0);
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
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ExpressionImpl expressionImpl0 = new ExpressionImpl();
      HL7MessageGroupImpl hL7MessageGroupImpl0 = new HL7MessageGroupImpl();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.processGroup(expressionImpl0, hL7MessageGroupImpl0);
      assertEquals(2, expressionImpl0.size());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      ExpressionImpl expressionImpl0 = new ExpressionImpl();
      HL7MessageGroupImpl hL7MessageGroupImpl0 = new HL7MessageGroupImpl();
      hL7MessageGroupImpl0.setRepeatable(true);
      messageTracerImpl0.processGroup(expressionImpl0, hL7MessageGroupImpl0);
      assertEquals(4, expressionImpl0.size());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      HL7CheckerImpl hL7CheckerImpl0 = new HL7CheckerImpl();
      messageTracerImpl0.setHandler(hL7CheckerImpl0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ExpressionImpl expressionImpl0 = new ExpressionImpl();
      HL7MessageGroupImpl hL7MessageGroupImpl0 = new HL7MessageGroupImpl();
      hL7MessageGroupImpl0.setRequired(true);
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.processGroup(expressionImpl0, hL7MessageGroupImpl0);
      assertEquals(0, expressionImpl0.size());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      messageTracerImpl0.setMatrix(expressionMatrixImpl0);
      // Undeclared exception!
      try { 
        messageTracerImpl0.processNextSegment("IDz");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.browsersoft.openhre.hl7.impl.regular.MessageTracerImpl", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      ExpressionImpl expressionImpl0 = new ExpressionImpl();
      HL7MessageGroupImpl hL7MessageGroupImpl0 = new HL7MessageGroupImpl();
      hL7MessageGroupImpl0.addItem(hL7MessageGroupImpl0);
      // Undeclared exception!
      try { 
        messageTracerImpl0.processGroup(expressionImpl0, hL7MessageGroupImpl0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      ExpressionImpl expressionImpl0 = new ExpressionImpl();
      HL7MessageGroupImpl hL7MessageGroupImpl0 = new HL7MessageGroupImpl();
      hL7MessageGroupImpl0.setAdditional("$g~qoap 7hh5d>1Q&");
      // Undeclared exception!
      try { 
        messageTracerImpl0.processGroup(expressionImpl0, hL7MessageGroupImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.browsersoft.openhre.hl7.impl.regular.MessageTracerImpl", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      ExpressionImpl expressionImpl0 = new ExpressionImpl();
      HL7MessageSegmentImpl hL7MessageSegmentImpl0 = new HL7MessageSegmentImpl();
      HL7MessageGroupImpl hL7MessageGroupImpl0 = new HL7MessageGroupImpl();
      hL7MessageGroupImpl0.addItem(hL7MessageSegmentImpl0);
      // Undeclared exception!
      try { 
        messageTracerImpl0.processGroupContent(expressionImpl0, hL7MessageGroupImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.browsersoft.openhre.hl7.impl.regular.MessageTracerImpl", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(40);
      messageTracerImpl0.setMatrix(expressionMatrixImpl0);
      // Undeclared exception!
      try { 
        messageTracerImpl0.processEnd();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.browsersoft.openhre.hl7.impl.regular.MessageTracerImpl", e);
      }
  }
}