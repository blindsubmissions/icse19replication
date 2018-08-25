/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 14:10:28 GMT 2018
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
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      String string0 = "HY009";
      fBProcedureCall0.setName("HY009");
      int int0 = 0;
      fBProcedureCall0.mapOutParamIndexToPosition(0, true);
      fBProcedureCall0.equals("HY009");
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      Object object0 = new Object();
      try { 
        fBProcedureParam0.setValue(object0);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot set parameter, since it is constant.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureParam", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName("]^g");
      fBProcedureCall0.getSQL(true);
      try { 
        fBProcedureCall0.mapOutParamIndexToPosition(0, false);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Specified parameter does not exist.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      List<FBProcedureParam> list0 = fBProcedureCall0.getInputParams();
      int int0 = 2911;
      int int1 = 1;
      fBProcedureCall0.mapOutParamIndexToPosition(2911);
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam(1);
      try { 
        fBProcedureParam0.setValue(list0);
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
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = 547;
      fBProcedureCall0.setName("5%");
      fBProcedureCall0.addParam(547, "07005");
      int int1 = 2720;
      fBProcedureCall0.getSQL(false);
      // Undeclared exception!
      try { 
        fBProcedureCall0.addParam((-1), "Cannot find parameter with the specified position.");
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
  /*Coverage entropy=2.0262296229952916
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam((-1520));
      fBProcedureCall0.clone();
      fBProcedureCall0.getSQL(true);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.getInputParams();
      fBProcedureCall0.getSQL(false);
      try { 
        fBProcedureCall0.registerOutParam(177, 41);
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
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = (-3132);
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureParam0.setType((-3132));
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      // Undeclared exception!
      try { 
        fBProcedureCall0.registerOutParam(0, (-3132));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.9061547465398496
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = (-519);
      fBProcedureCall0.mapOutParamIndexToPosition((-519), true);
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1, "");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      int int1 = 3646;
      fBProcedureCall0.getInputParam(3646);
      int int2 = 1470;
      fBProcedureCall0.clone();
      try { 
        fBProcedureCall0.mapOutParamIndexToPosition(1470, false);
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
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.mapOutParamIndexToPosition((-118));
      fBProcedureCall0.getOutputParam(0);
      fBProcedureCall0.getOutputParams();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam(1008);
      assertEquals((-1), fBProcedureParam0.getIndex());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.9002256148855206
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.clone();
      fBProcedureCall0.getOutputParam(0);
      fBProcedureCall0.getInputParam(40);
      String string0 = "SELECT * FROM";
      fBProcedureCall0.mapOutParamIndexToPosition(40);
      try { 
        fBProcedureCall0.registerOutParam(1, 40);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot find parameter with the specified position.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.clone();
      fBProcedureCall0.addParam(0, "");
      fBProcedureCall0.clone();
      fBProcedureCall0.getName();
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
  //Test case number: 10
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.clone();
      fBProcedureCall0.setName("F25");
      fBProcedureCall0.getSQL(false);
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      fBProcedureCall1.setName("F25");
      FBProcedureParam fBProcedureParam0 = fBProcedureCall1.getInputParam(349);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.addParam(2022, "");
      fBProcedureParam0.clone();
      fBProcedureCall0.getOutputParam(1011);
      fBProcedureCall0.getOutputParam((-1039));
      fBProcedureCall0.hashCode();
      fBProcedureCall1.addOutputParam(fBProcedureParam0);
      assertEquals(0, fBProcedureParam0.getPosition());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      boolean boolean0 = true;
      fBProcedureCall0.getSQL(true);
      fBProcedureCall0.getOutputParams();
      fBProcedureCall0.hashCode();
      fBProcedureCall0.getInputParams();
      fBProcedureCall0.setName("SELECT * FROM null");
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      int int0 = (-38650709);
      // Undeclared exception!
      try { 
        fBProcedureCall1.addParam((-38650709), "OUT");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -38650709
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.8105674553274598
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      int int0 = 1;
      fBProcedureParam0.setIndex(1);
      fBProcedureCall0.addParam(2853, "Value of parameter ");
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.getOutputParams();
      fBProcedureCall0.getSQL(true);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.hashCode();
      fBProcedureCall0.setName("SELECT * FROM null(null, Value of parameter)");
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getInputParam(1);
      Object object0 = new Object();
      fBProcedureParam1.clone();
      try { 
        fBProcedureParam1.setValue(object0);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot set parameter, since it is constant.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureParam", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.0900602314795482
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = (-519);
      fBProcedureCall0.mapOutParamIndexToPosition((-519));
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1, "");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      int int1 = 3646;
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getInputParam(3646);
      int int2 = 1470;
      fBProcedureCall0.clone();
      fBProcedureCall0.mapOutParamIndexToPosition((-519));
      fBProcedureCall0.addOutputParam(fBProcedureParam1);
      fBProcedureCall0.getSQL(false);
      int int3 = (-1022);
      try { 
        fBProcedureCall0.registerOutParam(1470, (-1022));
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
  /*Coverage entropy=1.809411383074172
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = 63;
      String string0 = "";
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(63, "");
      fBProcedureParam0.clone();
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(0, "s}dahA?*");
      fBProcedureCall0.getName();
      fBProcedureCall0.getOutputParams();
      int int1 = 887;
      fBProcedureParam1.setIndex(887);
      fBProcedureParam1.setType(0);
      FBProcedureCall fBProcedureCall1 = (FBProcedureCall)fBProcedureCall0.clone();
      fBProcedureCall1.getSQL(true);
      fBProcedureCall0.getOutputParams();
      boolean boolean0 = true;
      FBProcedureCall fBProcedureCall2 = new FBProcedureCall();
      fBProcedureParam1.setValue(fBProcedureCall2);
      fBProcedureCall0.mapOutParamIndexToPosition(0, true);
      fBProcedureCall0.addInputParam(fBProcedureParam1);
      fBProcedureCall0.setName("s}dahA?*");
      try { 
        fBProcedureCall2.mapOutParamIndexToPosition(0, false);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Specified parameter does not exist.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.8368972087620203
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = 63;
      String string0 = "";
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(63, "");
      fBProcedureParam0.clone();
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(0, "s}dahA?*");
      fBProcedureCall0.getName();
      fBProcedureCall0.getOutputParams();
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      fBProcedureParam1.setValue(fBProcedureCall1);
      int int1 = 887;
      fBProcedureParam1.setIndex(887);
      fBProcedureParam1.setType(0);
      FBProcedureCall fBProcedureCall2 = (FBProcedureCall)fBProcedureCall0.clone();
      fBProcedureCall2.getSQL(true);
      fBProcedureCall0.getOutputParams();
      boolean boolean0 = true;
      FBProcedureCall fBProcedureCall3 = new FBProcedureCall();
      fBProcedureParam1.setValue(fBProcedureCall3);
      fBProcedureCall0.mapOutParamIndexToPosition(0, true);
      fBProcedureCall0.addInputParam(fBProcedureParam1);
      fBProcedureCall0.setName("s}dahA?*");
      try { 
        fBProcedureCall3.mapOutParamIndexToPosition(0, false);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Specified parameter does not exist.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.9540922934379994
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(0, "s}dahA?*");
      fBProcedureCall0.getName();
      fBProcedureCall0.getOutputParams();
      fBProcedureParam0.setIndex(887);
      fBProcedureParam0.setType(0);
      FBProcedureCall fBProcedureCall1 = (FBProcedureCall)fBProcedureCall0.clone();
      fBProcedureCall1.getSQL(true);
      fBProcedureCall0.getOutputParams();
      FBProcedureCall fBProcedureCall2 = new FBProcedureCall();
      fBProcedureCall1.addOutputParam(fBProcedureParam0);
      fBProcedureCall1.getSQL(true);
      int int0 = 1291;
      // Undeclared exception!
      try { 
        fBProcedureCall2.registerOutParam(0, 1291);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.9730014063936123
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getOutputParam((-1437));
      fBProcedureCall0.setName("");
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam((-1437));
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.equals(fBProcedureCall1);
      Object object0 = fBProcedureCall0.clone();
      fBProcedureCall1.equals(object0);
      FBProcedureCall fBProcedureCall2 = new FBProcedureCall();
      // Undeclared exception!
      try { 
        fBProcedureCall2.addParam((-3229), " XR]:Zx^JX4R1F");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3229
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.9686932085049351
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam((-1437));
      fBProcedureCall0.setName((String) null);
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      fBProcedureCall1.getOutputParam((-1437));
      FBProcedureCall fBProcedureCall2 = new FBProcedureCall();
      fBProcedureCall2.addOutputParam(fBProcedureParam0);
      Object object0 = fBProcedureCall2.clone();
      fBProcedureCall1.equals(object0);
      try { 
        fBProcedureCall0.registerOutParam(2, (-1437));
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot find parameter with the specified position.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.2051551011994586
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = (-519);
      fBProcedureCall0.mapOutParamIndexToPosition((-519));
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1, "D\"Qp");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      int int1 = 3646;
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getInputParam((-1));
      fBProcedureCall0.clone();
      fBProcedureCall0.mapOutParamIndexToPosition((-1));
      fBProcedureCall0.addOutputParam(fBProcedureParam1);
      fBProcedureCall0.getSQL(false);
      fBProcedureCall0.registerOutParam((-1), 1420);
      FBProcedureParam fBProcedureParam2 = new FBProcedureParam(1470, "EXECUTE PROCEDURE null(D\"Qp)");
      fBProcedureCall0.addInputParam(fBProcedureParam1);
      fBProcedureCall0.getSQL(true);
      try { 
        fBProcedureCall0.registerOutParam(808, (-519));
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot find parameter with the specified position.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.5810937501718236
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = 2030;
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall2 = new FBProcedureCall();
      fBProcedureCall2.equals(fBProcedureCall1);
      fBProcedureCall0.getInputParam(2030);
      fBProcedureCall2.getOutputParam((-221756165));
      FBProcedureCall fBProcedureCall3 = new FBProcedureCall();
      try { 
        fBProcedureCall3.registerOutParam(63, (-221756165));
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot find parameter with the specified position.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=2.2102535776209735
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(0, "s}dahA?*");
      fBProcedureCall0.getName();
      List<FBProcedureParam> list0 = fBProcedureCall0.getOutputParams();
      fBProcedureParam0.setIndex(0);
      fBProcedureParam0.setType(0);
      FBProcedureCall fBProcedureCall1 = (FBProcedureCall)fBProcedureCall0.clone();
      fBProcedureCall1.getName();
      List<FBProcedureParam> list1 = fBProcedureCall1.getOutputParams();
      assertTrue(list1.equals((Object)list0));
      
      FBProcedureCall fBProcedureCall2 = new FBProcedureCall();
      fBProcedureCall1.addOutputParam(fBProcedureParam0);
      fBProcedureCall1.getSQL(true);
      fBProcedureCall1.getSQL(true);
      fBProcedureCall0.registerOutParam(0, 0);
      assertFalse(fBProcedureCall0.equals((Object)fBProcedureCall1));
      
      fBProcedureCall1.addParam(236, "s}dahA?*");
      assertNotSame(fBProcedureCall1, fBProcedureCall0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=2.338371704803573
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(0, "s}dahA?*");
      fBProcedureCall0.getName();
      fBProcedureCall0.getOutputParams();
      fBProcedureParam0.setIndex(0);
      fBProcedureParam0.setType(0);
      FBProcedureCall fBProcedureCall1 = (FBProcedureCall)fBProcedureCall0.clone();
      fBProcedureCall1.getName();
      fBProcedureCall1.getOutputParams();
      fBProcedureParam0.setValue("07005");
      FBProcedureCall fBProcedureCall2 = new FBProcedureCall();
      fBProcedureCall2.addInputParam(fBProcedureParam0);
      fBProcedureCall1.addOutputParam(fBProcedureParam0);
      fBProcedureCall1.getSQL(true);
      fBProcedureCall1.getSQL(true);
      assertFalse(fBProcedureCall1.equals((Object)fBProcedureCall0));
      
      fBProcedureCall0.registerOutParam(0, 0);
      fBProcedureCall1.addParam(236, "s}dahA?*");
      fBProcedureCall0.addParam(236, "ua{=M0I@&Yu5,_UeV");
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition((-513), true);
      assertEquals((-513), int0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=2.338371704803573
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(0, "s}dahA?*");
      fBProcedureCall0.getName();
      fBProcedureCall0.getOutputParams();
      fBProcedureParam0.setIndex(0);
      fBProcedureParam0.setType(0);
      FBProcedureCall fBProcedureCall1 = (FBProcedureCall)fBProcedureCall0.clone();
      fBProcedureCall1.getName();
      fBProcedureCall1.getOutputParams();
      fBProcedureParam0.setValue("07005");
      FBProcedureCall fBProcedureCall2 = new FBProcedureCall();
      fBProcedureCall2.addInputParam(fBProcedureParam0);
      fBProcedureCall1.addOutputParam(fBProcedureParam0);
      fBProcedureCall1.getSQL(true);
      fBProcedureCall1.getSQL(true);
      fBProcedureCall0.registerOutParam(0, 0);
      fBProcedureCall1.addParam(236, "s}dahA?*");
      fBProcedureCall2.registerOutParam(0, 0);
      fBProcedureCall0.mapOutParamIndexToPosition(0, true);
      fBProcedureCall2.addInputParam(fBProcedureParam0);
      assertTrue(fBProcedureCall2.equals((Object)fBProcedureCall0));
      
      fBProcedureCall0.addParam(236, "EXECUTE PROCEDURE");
      FBProcedureParam fBProcedureParam1 = new FBProcedureParam();
      fBProcedureCall1.addParam(1, "07005");
      assertNotSame(fBProcedureCall0, fBProcedureCall1);
  }
}
