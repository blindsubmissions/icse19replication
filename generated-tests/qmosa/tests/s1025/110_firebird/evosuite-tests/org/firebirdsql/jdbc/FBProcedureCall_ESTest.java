/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 16:25:42 GMT 2018
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
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName("ek/\"l9");
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam(2759);
      fBProcedureParam0.setType(0);
      fBProcedureCall0.mapOutParamIndexToPosition(2759);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.getSQL(false);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      assertFalse(fBProcedureParam0.isValueSet());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.7677614722893296
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      String string0 = "07005";
      fBProcedureCall0.setName("07005");
      fBProcedureCall0.getInputParam(2035);
      int int0 = 1386;
      fBProcedureCall0.mapOutParamIndexToPosition(1386, true);
      int int1 = 0;
      fBProcedureCall0.clone();
      // Undeclared exception!
      try { 
        fBProcedureCall0.registerOutParam(0, 0);
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
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.clone();
      fBProcedureCall0.clone();
      fBProcedureCall0.getOutputParams();
      // Undeclared exception!
      try { 
        fBProcedureCall0.getInputParam((-1519));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1520
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.2424533248940002
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getInputParam(829);
      fBProcedureParam0.setIndex(829);
      fBProcedureParam0.clone();
      try { 
        fBProcedureParam0.setValue(fBProcedureCall0);
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
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName("HY002");
      fBProcedureCall0.hashCode();
      fBProcedureCall0.getInputParams();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getInputParam(2599);
      assertEquals(829, fBProcedureParam0.getIndex());
      
      fBProcedureParam0.setIndex(0);
      fBProcedureParam0.clone();
      fBProcedureParam0.setType(2599);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getOutputParam((-2580));
      fBProcedureCall0.getOutputParams();
      fBProcedureCall0.hashCode();
      FBProcedureParam fBProcedureParam2 = fBProcedureCall0.getOutputParam(0);
      fBProcedureParam2.setType((-1));
      fBProcedureParam2.setType(0);
      fBProcedureCall0.addInputParam(fBProcedureParam2);
      fBProcedureCall0.hashCode();
      fBProcedureParam1.setType(0);
      Object object0 = fBProcedureCall0.clone();
      fBProcedureCall0.hashCode();
      fBProcedureCall0.getName();
      fBProcedureCall0.addInputParam(fBProcedureParam1);
      assertTrue(fBProcedureCall0.equals((Object)object0));
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.7480673485460891
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getInputParam(63);
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getInputParam(63);
      fBProcedureParam0.clone();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.getInputParams();
      fBProcedureCall0.getInputParams();
      int int0 = 1518;
      fBProcedureCall0.addParam(1518, "");
      fBProcedureCall0.getOutputParam(1518);
      boolean boolean0 = false;
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
  //Test case number: 6
  /*Coverage entropy=2.2538575896013526
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(40, "EXECUTE PROCEDURE");
      fBProcedureParam0.setIndex(0);
      fBProcedureParam0.setType(0);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.getInputParams();
      List<FBProcedureParam> list0 = fBProcedureCall0.getOutputParams();
      String string0 = fBProcedureCall0.getSQL(false);
      assertEquals("EXECUTE PROCEDURE null(EXECUTE PROCEDURE)", string0);
      
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(40, true);
      assertEquals(40, int0);
      
      fBProcedureCall0.getInputParams();
      fBProcedureCall0.getOutputParam((-2186));
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(40, "EXECUTE PROCEDURE null(EXECUTE PROCEDURE)");
      fBProcedureCall0.addInputParam(fBProcedureParam1);
      fBProcedureCall0.addInputParam(fBProcedureParam1);
      assertEquals(40, fBProcedureParam1.getPosition());
      
      List<FBProcedureParam> list1 = fBProcedureCall0.getInputParams();
      assertEquals(41, list1.size());
      assertFalse(list1.equals((Object)list0));
      
      boolean boolean0 = fBProcedureCall0.equals((Object) null);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.458311329683084
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getOutputParam((-2183));
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureParam0.clone();
      fBProcedureCall0.getOutputParam(987);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.hashCode();
      fBProcedureCall0.hashCode();
      fBProcedureCall0.mapOutParamIndexToPosition(0);
      fBProcedureCall0.clone();
      Object object0 = fBProcedureCall0.clone();
      fBProcedureCall0.equals(object0);
      int int0 = 0;
      fBProcedureCall0.addParam(0, "l|");
      try { 
        fBProcedureCall0.registerOutParam(987, 0);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot find parameter with the specified position.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.812801419653985
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = 0;
      fBProcedureCall0.getSQL(false);
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam(0);
      fBProcedureParam0.setIndex(0);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      int int1 = 5470;
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(5470, "EXECUTE PROCEDURE null");
      fBProcedureParam1.clone();
      fBProcedureParam1.setIndex(5470);
      fBProcedureParam1.setIndex(0);
      fBProcedureCall0.addOutputParam(fBProcedureParam1);
      fBProcedureCall0.setName("EXECUTE PROCEDURE null");
      boolean boolean0 = false;
      fBProcedureCall0.getSQL(false);
      Object object0 = fBProcedureCall0.clone();
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
  //Test case number: 9
  /*Coverage entropy=1.4205719259467045
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      boolean boolean0 = true;
      fBProcedureCall0.getSQL(true);
      int int0 = 1121;
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam(1121);
      fBProcedureParam0.setType(1121);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      String string0 = "org.firebirdsql.jdbc.FBProcedureCall$NullParam";
      fBProcedureParam0.clone();
      fBProcedureParam0.clone();
      // Undeclared exception!
      try { 
        fBProcedureCall0.addParam((-2735), "org.firebirdsql.jdbc.FBProcedureCall$NullParam");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2735
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.9061547465398496
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.getInputParam(820);
      int int0 = 0;
      fBProcedureCall0.getSQL(false);
      fBProcedureCall0.getSQL(false);
      fBProcedureCall0.clone();
      boolean boolean0 = false;
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
  //Test case number: 11
  /*Coverage entropy=1.5977295736436044
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      FBProcedureParam fBProcedureParam1 = new FBProcedureParam();
      FBProcedureParam fBProcedureParam2 = new FBProcedureParam();
      fBProcedureParam2.clone();
      fBProcedureParam2.clone();
      fBProcedureCall0.addOutputParam(fBProcedureParam2);
      fBProcedureParam1.setIndex(2397);
      fBProcedureParam1.setType(2397);
      fBProcedureCall0.clone();
      fBProcedureParam1.setIndex(2397);
      fBProcedureCall0.addOutputParam(fBProcedureParam1);
      fBProcedureCall0.addOutputParam(fBProcedureParam1);
      fBProcedureCall0.mapOutParamIndexToPosition(0);
      fBProcedureCall0.mapOutParamIndexToPosition(0, true);
      fBProcedureCall0.getName();
      try { 
        fBProcedureParam1.setValue((Object) null);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot set parameter, since it is constant.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureParam", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.9730014063936123
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(887, "RwQMV=~A");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      int int0 = 887;
      fBProcedureCall0.getInputParam(887);
      fBProcedureCall0.addParam(887, "rw");
      fBProcedureCall0.getSQL(false);
      fBProcedureCall0.getSQL(false);
      fBProcedureCall0.clone();
      try { 
        fBProcedureCall0.mapOutParamIndexToPosition(887, false);
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
  /*Coverage entropy=1.8848713335781608
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      String string0 = "HY000";
      fBProcedureCall0.setName("HY000");
      Object object0 = fBProcedureCall0.clone();
      fBProcedureCall0.equals(object0);
      int int0 = 888;
      int int1 = 31;
      try { 
        fBProcedureCall0.registerOutParam(888, 31);
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
  /*Coverage entropy=1.858628376910564
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(629, "~6^?+gWVEb'*MpFd");
      fBProcedureParam0.clone();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.getSQL(false);
      try { 
        fBProcedureCall0.registerOutParam(298, 629);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot find parameter with the specified position.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.8740102918046606
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(623, "~6^?+gWVEb'*MpFd");
      Object object0 = new Object();
      fBProcedureParam0.setValue(object0);
      fBProcedureParam0.clone();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      boolean boolean0 = false;
      fBProcedureCall0.getSQL(false);
      fBProcedureCall0.getSQL(false);
      int int0 = 2378;
      try { 
        fBProcedureCall0.registerOutParam(2378, 2378);
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
  /*Coverage entropy=1.8143075196071257
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = 2;
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(2, "~6^?+gWVEb'*MpFd");
      fBProcedureParam0.setIndex(2);
      fBProcedureParam0.clone();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.getSQL(false);
      fBProcedureCall0.registerOutParam(2, (-28766209));
      fBProcedureCall0.registerOutParam(2, 2);
      fBProcedureCall0.mapOutParamIndexToPosition((-28766209), true);
      fBProcedureCall0.getSQL(true);
      int int1 = (-163);
      // Undeclared exception!
      try { 
        fBProcedureCall0.registerOutParam((-163), (-28766209));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -164
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.5810937501718239
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      fBProcedureCall1.setName("EvX1`-,");
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam(2068);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall1.getOutputParam(3390);
      boolean boolean0 = fBProcedureCall0.equals(fBProcedureCall1);
      assertFalse(fBProcedureCall1.equals((Object)fBProcedureCall0));
      assertFalse(fBProcedureCall0.equals((Object)fBProcedureCall1));
      assertFalse(boolean0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.7480673485460891
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(2, "~6^?+gWVEb'*MpFd");
      fBProcedureParam0.setIndex(2);
      fBProcedureParam0.setValue("~6^?+gWVEb'*MpFd");
      fBProcedureParam0.clone();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.getSQL(false);
      fBProcedureCall0.registerOutParam(2, (-28766209));
      fBProcedureCall0.registerOutParam(2, 2);
      fBProcedureCall0.getSQL(false);
      // Undeclared exception!
      try { 
        fBProcedureCall0.registerOutParam((-28766209), 3212);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -28766210
         //
         verifyException("java.util.Vector", e);
      }
  }
}
