/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 11:28:24 GMT 2018
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
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName("");
      fBProcedureCall0.mapOutParamIndexToPosition(0);
      boolean boolean0 = true;
      fBProcedureCall0.getSQL(true);
      String string0 = null;
      int int0 = (-883);
      boolean boolean1 = false;
      try { 
        fBProcedureCall0.mapOutParamIndexToPosition(993, false);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Specified parameter does not exist.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.mapOutParamIndexToPosition((-1));
      fBProcedureParam0.clone();
      Object object0 = fBProcedureCall0.clone();
      fBProcedureParam0.setType(887);
      fBProcedureCall0.getOutputParam((-635));
      fBProcedureParam0.setType((-1));
      fBProcedureCall0.getSQL(false);
      fBProcedureCall0.getSQL(false);
      fBProcedureCall0.setName((String) null);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.mapOutParamIndexToPosition((-1));
      fBProcedureCall0.getSQL(true);
      fBProcedureCall0.registerOutParam((-1), (-1));
      fBProcedureCall0.getInputParams();
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      assertEquals((-1), fBProcedureParam0.getType());
      assertNotSame(fBProcedureCall0, object0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.8343719702816235
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getSQL(true);
      fBProcedureCall0.addParam(0, "SELECT * FROM null");
      fBProcedureCall0.addParam(0, "I>E)");
      fBProcedureCall0.mapOutParamIndexToPosition(0);
      int int0 = 0;
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
  //Test case number: 3
  /*Coverage entropy=1.7481554572476763
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(925, "XQGp<(-5jV5Bb@");
      fBProcedureCall0.addParam(925, "'");
      fBProcedureCall0.clone();
      try { 
        fBProcedureCall0.registerOutParam(925, 1);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot find parameter with the specified position.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getInputParam(63);
      fBProcedureParam0.clone();
      fBProcedureParam0.setType(63);
      fBProcedureParam0.setType(1971);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.getName();
      int int0 = 1587;
      fBProcedureCall0.getInputParam(1587);
      fBProcedureCall0.hashCode();
      try { 
        fBProcedureCall0.registerOutParam(63, 63);
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
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getOutputParams();
      fBProcedureCall0.getSQL(true);
      fBProcedureCall0.getOutputParams();
      fBProcedureCall0.getOutputParam(1208);
      int int0 = 2185;
      String string0 = "";
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(2185, "");
      fBProcedureParam0.setIndex(1208);
      fBProcedureParam0.setIndex(2185);
      fBProcedureParam0.clone();
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
  //Test case number: 6
  /*Coverage entropy=1.5193826646423012
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = 5296;
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam(5296);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      int int1 = 0;
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getOutputParam(0);
      fBProcedureParam1.setType(5296);
      fBProcedureParam1.clone();
      fBProcedureParam1.setIndex(0);
      fBProcedureParam1.setIndex(5296);
      fBProcedureCall0.mapOutParamIndexToPosition(5296, true);
      fBProcedureParam1.setIndex(0);
      try { 
        fBProcedureParam1.setValue(fBProcedureCall0);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // You cannot set value of an non-existing parameter.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall$NullParam", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.1682824501765625
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getInputParam(3199);
      String string0 = fBProcedureCall0.getSQL(false);
      assertEquals("EXECUTE PROCEDURE null(null)", string0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.4036404106149494
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getOutputParam(124);
      fBProcedureCall0.mapOutParamIndexToPosition(41);
      fBProcedureCall0.getInputParam(124);
      fBProcedureCall0.clone();
      fBProcedureCall0.getOutputParam(41);
      fBProcedureCall0.clone();
      fBProcedureCall0.getInputParams();
      fBProcedureCall0.hashCode();
      fBProcedureCall0.mapOutParamIndexToPosition(41, true);
      fBProcedureCall0.getOutputParam(124);
      fBProcedureCall0.mapOutParamIndexToPosition(41);
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(41, "&#;");
      fBProcedureParam0.setType(41);
      fBProcedureCall0.clone();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.addParam(560, "");
      fBProcedureCall0.mapOutParamIndexToPosition(41);
      try { 
        fBProcedureCall0.registerOutParam(41, 41);
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
  /*Coverage entropy=2.5400363038209806
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName("");
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(0, "");
      fBProcedureParam0.setType(1);
      fBProcedureParam0.setType(2366);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.setName("");
      fBProcedureCall0.addParam(0, "");
      fBProcedureCall0.mapOutParamIndexToPosition(0);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(919, "");
      fBProcedureCall0.getInputParams();
      fBProcedureCall0.getInputParams();
      fBProcedureCall0.addOutputParam(fBProcedureParam1);
      fBProcedureCall0.hashCode();
      fBProcedureCall0.setName("");
      fBProcedureCall0.getOutputParams();
      fBProcedureCall0.addParam(0, "");
      fBProcedureCall0.addOutputParam(fBProcedureParam1);
      // Undeclared exception!
      try { 
        fBProcedureCall0.registerOutParam((-1044), 204);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1045
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.7785860824530713
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = 887;
      fBProcedureCall0.getSQL(true);
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(887, "SELECT * FROM null");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.mapOutParamIndexToPosition(887);
      int int1 = (-2792);
      fBProcedureCall0.clone();
      boolean boolean0 = true;
      fBProcedureCall0.getSQL(true);
      fBProcedureCall0.setName("");
      String string0 = "";
      // Undeclared exception!
      try { 
        fBProcedureCall0.addParam((-2792), "");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2792
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.615840063074387
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam(2);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.getInputParam(3199);
      String string0 = fBProcedureCall0.getSQL(false);
      assertEquals("EXECUTE PROCEDURE null(null, null)", string0);
      
      Object object0 = new Object();
      boolean boolean0 = fBProcedureCall0.equals(object0);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.9061547465398496
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition((-1051));
      assertEquals((-1051), int0);
      
      fBProcedureCall0.getInputParam(3199);
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      Object object0 = fBProcedureCall1.clone();
      boolean boolean0 = fBProcedureCall1.equals(object0);
      assertFalse(object0.equals((Object)fBProcedureCall0));
      assertTrue(boolean0);
      assertNotSame(object0, fBProcedureCall1);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.3046193848206715
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureCall0.mapOutParamIndexToPosition((-1));
      fBProcedureParam0.clone();
      FBProcedureCall fBProcedureCall1 = (FBProcedureCall)fBProcedureCall0.clone();
      fBProcedureParam0.setType(887);
      fBProcedureCall0.getOutputParam((-635));
      fBProcedureParam0.setType((-1));
      fBProcedureCall0.getSQL(false);
      fBProcedureCall0.getSQL(false);
      fBProcedureCall0.getSQL(false);
      fBProcedureCall0.setName("EXECUTE PROCEDURE null");
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.mapOutParamIndexToPosition((-1));
      String string0 = fBProcedureCall0.getSQL(false);
      assertEquals("EXECUTE PROCEDURE EXECUTE PROCEDURE null(null)", string0);
      
      fBProcedureCall0.registerOutParam((-1), (-1));
      int int0 = fBProcedureCall1.mapOutParamIndexToPosition((-1));
      assertEquals((-1), int0);
      
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getInputParam(887);
      assertNotSame(fBProcedureCall0, fBProcedureCall1);
      assertEquals(0, fBProcedureParam1.getIndex());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.8143075196071252
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getInputParam(3199);
      fBProcedureCall0.equals(fBProcedureParam0);
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      fBProcedureCall1.clone();
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      FBProcedureCall fBProcedureCall2 = new FBProcedureCall();
      fBProcedureCall1.getInputParam(3199);
      fBProcedureCall2.equals(fBProcedureCall1);
      assertFalse(fBProcedureCall2.equals((Object)fBProcedureCall1));
      
      fBProcedureCall1.setName("");
      FBProcedureCall fBProcedureCall3 = new FBProcedureCall();
      fBProcedureCall1.equals(fBProcedureCall3);
      assertTrue(fBProcedureCall3.equals((Object)fBProcedureCall2));
      
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(2175, "");
      assertEquals(2175, fBProcedureParam1.getPosition());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.17157089695751
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = 1;
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1, "+j3137aOw?,6u=v]q!");
      fBProcedureCall0.clone();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      FBProcedureParam fBProcedureParam1 = new FBProcedureParam();
      fBProcedureCall0.addInputParam(fBProcedureParam1);
      int int1 = (-973);
      fBProcedureCall0.mapOutParamIndexToPosition(1);
      fBProcedureParam0.setIndex(4);
      fBProcedureParam0.setType(4);
      fBProcedureCall0.registerOutParam(4, 1);
      fBProcedureParam1.clone();
      try { 
        fBProcedureCall0.registerOutParam(2851, (-3597));
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
  /*Coverage entropy=2.0374048491606533
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = 1;
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1, "+j3137aOw?,6u=v]q!");
      fBProcedureCall0.clone();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureParam0.setValue("+j3137aOw?,6u=v]q!");
      FBProcedureParam fBProcedureParam1 = new FBProcedureParam();
      fBProcedureCall0.addInputParam(fBProcedureParam1);
      fBProcedureCall0.mapOutParamIndexToPosition(1);
      fBProcedureParam0.setIndex(4);
      fBProcedureParam0.setType(4);
      fBProcedureCall0.registerOutParam(4, 1);
      fBProcedureParam1.clone();
      int int1 = 2851;
      try { 
        fBProcedureCall0.registerOutParam(2851, (-3597));
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot find parameter with the specified position.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.2312356911067466
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(1, "+j3137aOw?,6u=v]q!");
      FBProcedureCall fBProcedureCall1 = (FBProcedureCall)fBProcedureCall0.clone();
      fBProcedureCall1.getSQL(true);
      // Undeclared exception!
      try { 
        fBProcedureCall1.addParam((-144406114), ")a|ei5zVrVD|iAf");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -144406114
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName("-_j");
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      boolean boolean0 = fBProcedureCall1.equals(fBProcedureCall0);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.17157089695751
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = 1;
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1, "+j3137aOw?,6u=v]q!");
      fBProcedureCall0.clone();
      fBProcedureParam0.setIndex(1);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      FBProcedureParam fBProcedureParam1 = new FBProcedureParam();
      fBProcedureCall0.addInputParam(fBProcedureParam1);
      fBProcedureParam1.setIndex(1);
      fBProcedureCall0.mapOutParamIndexToPosition(1);
      fBProcedureParam0.setIndex(4);
      fBProcedureParam0.setType(4);
      fBProcedureCall0.registerOutParam(4, 1);
      try { 
        fBProcedureCall0.registerOutParam(2851, (-3597));
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
  /*Coverage entropy=1.193330312488684
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1, "+j3137aOw?,6u=v]q!");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureParam0.clone();
      fBProcedureCall0.getSQL(true);
      // Undeclared exception!
      try { 
        fBProcedureCall0.addParam((-2223), "i>e");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2223
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.9957230070723035
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1, "+j3137aOw?,6u=v]q!");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      fBProcedureParam0.setValue(fBProcedureCall1);
      fBProcedureParam0.clone();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.getSQL(false);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      try { 
        fBProcedureCall0.registerOutParam(1, 2);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot find parameter with the specified position.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.2222669235381565
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1, "+j3137aOw?,6u=v]q!");
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(633, "+j3137aOw?,6u=v]q!");
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      fBProcedureCall1.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.addOutputParam(fBProcedureParam1);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureParam0.clone();
      try { 
        fBProcedureCall0.getSQL(false);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Value of parameter -1 not set and it was not registered as output parameter.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }
}