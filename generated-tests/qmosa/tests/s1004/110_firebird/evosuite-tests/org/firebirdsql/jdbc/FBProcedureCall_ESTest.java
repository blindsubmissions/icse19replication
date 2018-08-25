/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 10:43:41 GMT 2018
 */

package org.firebirdsql.jdbc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
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
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getInputParam(41);
      fBProcedureParam0.setIndex(41);
      fBProcedureCall0.hashCode();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      // Undeclared exception!
      try { 
        fBProcedureCall0.registerOutParam((-21), (-21));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -22
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      String string0 = fBProcedureCall0.getSQL(true);
      assertEquals("SELECT * FROM null", string0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(0, "");
      fBProcedureParam0.clone();
      fBProcedureParam0.setIndex(0);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.getName();
      int int0 = 2861;
      int int1 = 1076;
      fBProcedureCall0.getOutputParam(1076);
      try { 
        fBProcedureCall0.registerOutParam(2861, 2861);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot find parameter with the specified position.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = 32;
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(32, "Value of parameter ");
      fBProcedureParam0.setIndex(32);
      fBProcedureParam0.setIndex(2);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getInputParam(32);
      fBProcedureParam1.clone();
      fBProcedureParam1.clone();
      boolean boolean0 = false;
      fBProcedureCall0.getSQL(false);
      fBProcedureParam0.setType(0);
      fBProcedureParam1.setType((-2287));
      try { 
        fBProcedureParam1.setValue(fBProcedureParam0);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // You cannot set value of an non-existing parameter.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall$NullParam", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(2781, "A|b'rZmxC|voDZp&");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      String string0 = "wLVIAHSXm57m|:";
      fBProcedureCall0.addParam(40, "wLVIAHSXm57m|:");
      fBProcedureCall0.getOutputParams();
      try { 
        fBProcedureCall0.registerOutParam(2781, 0);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot find parameter with the specified position.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.4750763110546947
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.clone();
      fBProcedureCall0.getOutputParams();
      // Undeclared exception!
      try { 
        fBProcedureCall0.getInputParam((-1672));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1673
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      fBProcedureCall0.equals(fBProcedureCall1);
      int int0 = (-1404);
      try { 
        fBProcedureCall0.mapOutParamIndexToPosition((-1404), false);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Specified parameter does not exist.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = 0;
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(0, "");
      fBProcedureParam0.setType(0);
      fBProcedureParam0.clone();
      fBProcedureParam0.clone();
      fBProcedureCall0.equals(fBProcedureParam0);
      fBProcedureCall0.getSQL(false);
      fBProcedureCall0.hashCode();
      fBProcedureCall0.getInputParams();
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
  //Test case number: 8
  /*Coverage entropy=1.4270610433807247
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getInputParam(2131);
      fBProcedureCall0.clone();
      String string0 = "X$;%B|A~a={eU)b";
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(3641, "X$;%B|A~a={eU)b");
      fBProcedureParam0.setIndex(0);
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
  //Test case number: 9
  /*Coverage entropy=1.7721393884375285
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam(1);
      fBProcedureParam0.setIndex(3221);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.clone();
      int int0 = 2076;
      String string0 = null;
      try { 
        fBProcedureCall0.registerOutParam(2076, 0);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot find parameter with the specified position.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.615630577027551
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getOutputParam(0);
      fBProcedureCall0.addParam(1, "");
      fBProcedureCall0.addParam(0, "org.firebirdsql.jdbc.FBSQLException");
      fBProcedureCall0.setName("org.firebirdsql.jdbc.FBSQLException");
      fBProcedureCall0.getSQL(true);
      fBProcedureCall0.addParam(1, "4$]}-hMWpMLX<+_3");
      fBProcedureCall0.mapOutParamIndexToPosition(0);
      fBProcedureCall0.mapOutParamIndexToPosition(0);
      fBProcedureCall0.mapOutParamIndexToPosition(1);
      fBProcedureCall0.getOutputParam(1);
      fBProcedureCall0.hashCode();
      fBProcedureCall0.getInputParams();
      int int0 = 63;
      fBProcedureCall0.getInputParam(63);
      fBProcedureCall0.clone();
      fBProcedureCall0.getName();
      // Undeclared exception!
      try { 
        fBProcedureCall0.registerOutParam((-5088), (-3183));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -5089
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.0982737395252498
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      List<FBProcedureParam> list0 = fBProcedureCall0.getOutputParams();
      fBProcedureCall0.equals(list0);
      fBProcedureCall0.hashCode();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(0, "G'>hn");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.registerOutParam((-1), 37);
      assertTrue(FBProcedureCall.OLD_CALLABLE_STATEMENT_COMPATIBILITY);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.1639556568820564
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(2435, "0n&mx");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.getOutputParam(2);
      fBProcedureCall0.getInputParams();
      fBProcedureCall0.getSQL(false);
      fBProcedureCall0.mapOutParamIndexToPosition(0);
      fBProcedureCall0.mapOutParamIndexToPosition((-32688997));
      try { 
        fBProcedureCall0.mapOutParamIndexToPosition(2, false);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Specified parameter does not exist.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.1339900594131094
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1603, "He;4r&");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.clone();
      fBProcedureCall0.hashCode();
      fBProcedureCall0.registerOutParam((-1), 1603);
      fBProcedureCall0.getInputParams();
      fBProcedureCall0.mapOutParamIndexToPosition((-56));
      try { 
        fBProcedureCall0.registerOutParam(1603, (-1));
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot find parameter with the specified position.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.771623955677366
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(2435, "0n&mx");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.getOutputParam(2);
      fBProcedureCall0.addParam(633, "&j ,L9joUZL+~UNtI");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      // Undeclared exception!
      try { 
        fBProcedureCall0.registerOutParam((-32688997), 1604);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -32688998
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.094729047527649
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      List<FBProcedureParam> list0 = fBProcedureCall0.getInputParams();
      fBProcedureCall0.equals(list0);
      fBProcedureCall0.hashCode();
      fBProcedureCall0.addParam(0, "G'>j)3hn");
      fBProcedureCall0.mapOutParamIndexToPosition(0, true);
      fBProcedureCall0.registerOutParam((-1), 37);
      assertTrue(FBProcedureCall.OLD_CALLABLE_STATEMENT_COMPATIBILITY);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.1217852989033927
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(40, "-x:k)wai>,?>$");
      fBProcedureParam0.setIndex(40);
      fBProcedureCall0.getSQL(true);
      FBProcedureCall fBProcedureCall1 = (FBProcedureCall)fBProcedureCall0.clone();
      fBProcedureParam0.setValue(fBProcedureCall1);
      fBProcedureParam0.clone();
      fBProcedureParam0.clone();
      fBProcedureCall0.equals(fBProcedureParam0);
      FBProcedureCall fBProcedureCall2 = (FBProcedureCall)fBProcedureCall0.clone();
      fBProcedureCall2.getSQL(true);
      fBProcedureCall0.setName("SELECT * FROM null(-x:k)wai>,?>$)");
      fBProcedureCall0.equals(fBProcedureCall2);
      fBProcedureCall0.registerOutParam(40, 40);
      fBProcedureParam0.clone();
      fBProcedureCall0.registerOutParam(40, 18);
      try { 
        fBProcedureCall0.registerOutParam(18, 40);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot find parameter with the specified position.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }
}