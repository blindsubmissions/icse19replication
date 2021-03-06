/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 09:45:39 GMT 2018
 */

package org.firebirdsql.jdbc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.firebirdsql.jdbc.FBProcedureCall;
import org.firebirdsql.jdbc.FBProcedureParam;
import org.firebirdsql.jdbc.FBSQLException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FBProcedureCall_ESTest extends FBProcedureCall_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      String string0 = "Exception. ";
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(37, "Exception. ");
      fBProcedureParam0.setType(37);
      fBProcedureParam0.setIndex(37);
      fBProcedureCall0.setName("Exception. ");
      fBProcedureCall0.equals(fBProcedureParam0);
      int int0 = 1413;
      // Undeclared exception!
      try { 
        fBProcedureCall0.registerOutParam(0, 1413);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.410116318288409
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = (-1);
      // Undeclared exception!
      try { 
        fBProcedureCall0.addParam((-1), "8o&Z Ri[");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getName();
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      int int0 = (-15);
      int int1 = 0;
      boolean boolean0 = true;
      int int2 = 831;
      FBProcedureParam fBProcedureParam0 = fBProcedureCall1.getInputParam(831);
      fBProcedureCall1.addInputParam(fBProcedureParam0);
      Object object0 = fBProcedureCall1.clone();
      try { 
        fBProcedureParam0.setValue(object0);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // You cannot set value of an non-existing parameter.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall$NullParam", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getSQL(false);
      fBProcedureCall0.setName("");
      fBProcedureCall0.addParam(2370, "");
      fBProcedureCall0.addParam(3120, "");
      fBProcedureCall0.getOutputParams();
      fBProcedureCall0.getName();
      // Undeclared exception!
      try { 
        fBProcedureCall0.registerOutParam(0, 1794);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getInputParam(2058);
      assertEquals((-1), fBProcedureParam0.getIndex());
      
      fBProcedureParam0.setIndex((-724));
      fBProcedureParam0.setIndex(40);
      fBProcedureParam0.setIndex(0);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getOutputParam((-1088));
      fBProcedureCall0.getSQL(false);
      fBProcedureCall0.getInputParam(40);
      fBProcedureCall0.getName();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.addInputParam(fBProcedureParam1);
      boolean boolean0 = fBProcedureCall0.equals((Object) null);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.0431918705451206
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getOutputParams();
      fBProcedureCall0.mapOutParamIndexToPosition(2145);
      try { 
        fBProcedureCall0.registerOutParam(2145, 41);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot find parameter with the specified position.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      Object object0 = fBProcedureCall0.clone();
      fBProcedureCall0.equals(object0);
      fBProcedureCall0.getInputParams();
      int int0 = 75;
      fBProcedureCall0.getOutputParam(75);
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      int int1 = (-93);
      // Undeclared exception!
      try { 
        fBProcedureCall1.addParam((-93), ".;!k-");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -93
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.8762735844302758
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      int int0 = 3;
      fBProcedureParam0.setIndex(3);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.getSQL(true);
      fBProcedureParam0.setIndex(3686);
      int int1 = 1664;
      fBProcedureParam0.clone();
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(1664, "");
      String string0 = "08S01";
      fBProcedureCall0.setName("08S01");
      fBProcedureParam0.setType(1664);
      fBProcedureParam1.clone();
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.getOutputParam(31);
      boolean boolean0 = false;
      fBProcedureParam0.setType(3686);
      fBProcedureCall0.getSQL(false);
      try { 
        fBProcedureParam0.setValue("SELECT * FROM null");
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot set parameter, since it is constant.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureParam", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam(2089);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      assertTrue(FBProcedureCall.OLD_CALLABLE_STATEMENT_COMPATIBILITY);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.hashCode();
      int int0 = (-1464);
      // Undeclared exception!
      try { 
        fBProcedureCall0.getInputParam((-1464));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1465
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.7478680974667573
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getName();
      int int0 = 2;
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam(2);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureParam0.setType((-24));
      fBProcedureCall0.getName();
      fBProcedureCall0.getOutputParam((-24));
      int int1 = (-1127);
      try { 
        fBProcedureCall0.mapOutParamIndexToPosition((-1127), false);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Specified parameter does not exist.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.395908119293929
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = 5477;
      fBProcedureCall0.getSQL(true);
      fBProcedureCall0.setName("");
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam(5477);
      fBProcedureParam0.setIndex(5477);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      fBProcedureCall0.equals(fBProcedureCall1);
      fBProcedureCall0.addParam(5477, "");
      fBProcedureCall1.getName();
      fBProcedureCall1.addParam(5477, "");
      fBProcedureCall1.mapOutParamIndexToPosition(5477);
      // Undeclared exception!
      try { 
        fBProcedureCall0.getInputParam((-1068));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1069
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.0982737395252498
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(906, "QjH]]3\u0007Ac");
      fBProcedureCall0.mapOutParamIndexToPosition(887);
      boolean boolean0 = true;
      fBProcedureCall0.mapOutParamIndexToPosition(2569, true);
      fBProcedureCall0.setName((String) null);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureParam0.clone();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureParam0.setIndex((-907));
      fBProcedureParam0.clone();
      fBProcedureCall0.mapOutParamIndexToPosition(0);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      // Undeclared exception!
      try { 
        fBProcedureCall0.getInputParam(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.9140686784184837
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(4, "{2|3K");
      fBProcedureParam0.setIndex((-4886));
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.getSQL(false);
      fBProcedureCall0.clone();
      fBProcedureCall0.mapOutParamIndexToPosition(1999);
      fBProcedureCall0.mapOutParamIndexToPosition((-2914));
      fBProcedureCall0.addParam(1999, "*&i)0TtS");
      fBProcedureCall0.getSQL(false);
      int int0 = 1762;
      fBProcedureCall0.getInputParam(1762);
      // Undeclared exception!
      try { 
        fBProcedureCall0.getInputParam((-353));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -354
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.293412589485358
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(2089, "");
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureParam0.clone();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(458, "K");
      fBProcedureParam0.setIndex(2089);
      fBProcedureParam0.clone();
      fBProcedureCall0.mapOutParamIndexToPosition(2089);
      fBProcedureCall0.addOutputParam(fBProcedureParam1);
      fBProcedureCall0.getInputParam(40);
      fBProcedureCall0.getOutputParams();
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      fBProcedureCall1.getSQL(true);
      fBProcedureCall1.clone();
      fBProcedureCall0.registerOutParam((-1), 458);
      FBProcedureParam fBProcedureParam2 = fBProcedureCall0.getOutputParam(40);
      FBProcedureCall fBProcedureCall2 = new FBProcedureCall();
      fBProcedureParam2.setType(1900);
      // Undeclared exception!
      try { 
        fBProcedureCall2.registerOutParam((-4886), (-1101));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -4887
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName(")h(!dz,c%(aRuQCt<j");
      fBProcedureCall0.hashCode();
      try { 
        fBProcedureCall0.registerOutParam(40, (-638));
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot find parameter with the specified position.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.3474375882098704
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(0, "");
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureParam0.clone();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.addParam(458, "K");
      fBProcedureParam0.setIndex(0);
      fBProcedureParam0.clone();
      fBProcedureCall0.mapOutParamIndexToPosition(0);
      fBProcedureCall0.getInputParam(40);
      fBProcedureCall0.getOutputParams();
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      fBProcedureCall1.mapOutParamIndexToPosition(0, true);
      fBProcedureCall1.getSQL(true);
      fBProcedureCall1.clone();
      fBProcedureCall0.registerOutParam((-1), 458);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getOutputParam(40);
      FBProcedureCall fBProcedureCall2 = new FBProcedureCall();
      int int0 = 1900;
      fBProcedureParam1.setType(1900);
      // Undeclared exception!
      try { 
        fBProcedureCall2.registerOutParam((-4881), (-1101));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -4882
         //
         verifyException("java.util.Vector", e);
      }
  }
}
