/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 18:59:24 GMT 2018
 */

package com.browsersoft.openhre.hl7.impl.regular;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.browsersoft.openhre.hl7.api.regular.ExpressionElementMapper;
import com.browsersoft.openhre.hl7.api.regular.MessageTracerHandler;
import com.browsersoft.openhre.hl7.impl.regular.ExpressionElementMapperImpl;
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
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.setValue((-3755), (-10), (-10));
      expressionMatrixImpl0.getNumberOfElements();
      int int0 = expressionMatrixImpl0.getNumberOfElements();
      assertEquals(0, int0);
      
      String string0 = expressionMatrixImpl0.toString();
      assertEquals("MATRIX\n-----------------------\n | \n\nCONNECTIONS\n-----------------------\n", string0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl0.setValue(0, 65, 65);
      assertEquals(0, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.toString();
      String string0 = expressionMatrixImpl0.toString();
      assertEquals("MATRIX\n-----------------------\n | \n\nCONNECTIONS\n-----------------------\n", string0);
      
      int int0 = expressionMatrixImpl0.getValue(1, 65);
      assertEquals((-1), int0);
      
      int int1 = expressionMatrixImpl0.getNumberOfElements();
      assertEquals(0, int1);
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
      
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      int int1 = expressionMatrixImpl0.getValue(0, (-3243));
      assertEquals((-1), int1);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(0);
      expressionMatrixImpl0.setValue(164, 164, 1);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.setValue(2153, 0, 1);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.setValue(0, 2, (-2500));
      expressionMatrixImpl0.creatMatrix((-1));
      expressionMatrixImpl0.creatMatrix((-671));
      assertEquals((-671), expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.getValue((-1724), 0);
      assertEquals((-1), int0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      expressionMatrixImpl0.outNoStandardConnections(false, expressionElementMapperImpl0);
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      MessageTracerImpl messageTracerImpl1 = new MessageTracerImpl();
      messageTracerImpl1.getMapper();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(1);
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
  //Test case number: 7
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      messageTracerImpl0.setHandler((MessageTracerHandler) null);
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(1, 1, 1);
      expressionMatrixImpl0.toString();
      ExpressionMatrixImpl expressionMatrixImpl1 = new ExpressionMatrixImpl();
      expressionMatrixImpl1.getNumberOfNodes();
      expressionMatrixImpl1.getNumberOfNodes();
      ExpressionMatrixImpl expressionMatrixImpl2 = new ExpressionMatrixImpl();
      ExpressionMatrixImpl expressionMatrixImpl3 = new ExpressionMatrixImpl();
      expressionMatrixImpl3.getNumberOfNodes();
      expressionMatrixImpl1.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl1.setValue(0, (-1), 2539);
      expressionMatrixImpl3.setValue((-1), 0, 65);
      assertFalse(expressionMatrixImpl3.equals((Object)expressionMatrixImpl2));
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.creatMatrix(1690);
      ExpressionMatrixImpl expressionMatrixImpl1 = new ExpressionMatrixImpl();
      expressionMatrixImpl1.toString();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl1.creatMatrix(1030);
      expressionMatrixImpl1.addNewNode();
      expressionMatrixImpl0.creatMatrix(0);
      expressionMatrixImpl1.setValue(0, 0, 40);
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl1.outNoStandardConnections(false, (ExpressionElementMapper) null);
      assertEquals(1030, expressionMatrixImpl1.getNumberOfElements());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      ExpressionMatrixImpl expressionMatrixImpl1 = new ExpressionMatrixImpl();
      expressionMatrixImpl1.toString();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl0.creatMatrix(50);
      expressionMatrixImpl1.toString();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl1.creatMatrix(1690);
      assertEquals(1690, expressionMatrixImpl1.getNumberOfElements());
      
      expressionMatrixImpl1.addNewNode();
      expressionMatrixImpl1.creatMatrix(0);
      expressionMatrixImpl1.setValue(0, 90, 1);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.addNewNode();
      MessageTracerImpl messageTracerImpl1 = new MessageTracerImpl();
      messageTracerImpl1.getMapper();
      expressionMatrixImpl1.addNewNode();
      expressionMatrixImpl1.creatMatrix(1140);
      String string0 = expressionMatrixImpl1.outNoStandardConnections(false, (ExpressionElementMapper) null);
      assertEquals("", string0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.creatMatrix(1690);
      ExpressionMatrixImpl expressionMatrixImpl1 = new ExpressionMatrixImpl();
      expressionMatrixImpl1.toString();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl1.toString();
      expressionMatrixImpl1.creatMatrix(1030);
      int int0 = expressionMatrixImpl1.addNewNode();
      expressionMatrixImpl1.setValue(0, 0, 1030);
      expressionMatrixImpl1.toString();
      assertEquals(1030, expressionMatrixImpl1.getNumberOfElements());
      
      ExpressionMatrixImpl expressionMatrixImpl2 = new ExpressionMatrixImpl();
      expressionMatrixImpl2.getNumberOfNodes();
      int int1 = expressionMatrixImpl2.getNumberOfNodes();
      assertTrue(int1 == int0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      ExpressionMatrixImpl expressionMatrixImpl1 = new ExpressionMatrixImpl();
      String string0 = expressionMatrixImpl1.toString();
      expressionMatrixImpl0.creatMatrix(82);
      expressionMatrixImpl1.toString();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl1.creatMatrix(1685);
      expressionMatrixImpl1.addNewNode();
      expressionMatrixImpl1.creatMatrix(0);
      expressionMatrixImpl1.setValue(0, 90, 1);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getNumberOfNodes();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl1.addNewNode();
      expressionMatrixImpl1.creatMatrix(1140);
      String string1 = expressionMatrixImpl1.toString();
      assertFalse(string1.equals((Object)string0));
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.creatMatrix(1690);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(1690);
      expressionMatrixImpl0.setValue(0, 54, (-2742));
      expressionMatrixImpl0.toString();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      messageTracerImpl0.getMapper();
      ExpressionMatrixImpl expressionMatrixImpl1 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl1.creatMatrix(90);
      expressionMatrixImpl1.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      assertEquals(1690, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      ExpressionMatrixImpl expressionMatrixImpl1 = new ExpressionMatrixImpl();
      expressionMatrixImpl1.toString();
      expressionMatrixImpl0.creatMatrix(82);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl1.creatMatrix(1690);
      expressionMatrixImpl1.addNewNode();
      expressionMatrixImpl1.creatMatrix(0);
      expressionMatrixImpl1.setValue(0, 90, 1);
      String string0 = expressionMatrixImpl0.toString();
      assertEquals("MATRIX\n-----------------------\n | A , B , C , D , E , F , G , H , I , J , K , L , M , N , O , P , Q , R , S , T , U , V , W , X , Y , Z , [ , \\ , ] , ^ , _ , ` , a , b , c , d , e , f , g , h , i , j , k , l , m , n , o , p , q , r , s , t , u , v , w , x , y , z , { , | , } , ~ ,  , \u0080 , \u0081 , \u0082 , \u0083 , \u0084 , \u0085 , \u0086 , \u0087 , \u0088 , \u0089 , \u008A , \u008B , \u008C , \u008D , \u008E , \u008F , \u0090 , \u0091 , \u0092\n\nCONNECTIONS\n-----------------------\n", string0);
      
      expressionMatrixImpl0.getNumberOfNodes();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      ExpressionMatrixImpl expressionMatrixImpl2 = new ExpressionMatrixImpl();
      ExpressionMatrixImpl expressionMatrixImpl3 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl3.addNewNode();
      assertEquals(0, int0);
      
      expressionMatrixImpl1.creatMatrix(1690);
      String string1 = expressionMatrixImpl1.outNoStandardConnections(true, (ExpressionElementMapper) null);
      assertEquals("0 --- \u009B ---> 1\n", string1);
  }
}
