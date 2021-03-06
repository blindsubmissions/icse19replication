/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 16:14:11 GMT 2018
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
  /*Coverage entropy=1.2424533248940002
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(0, "@]bH,J7");
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
  //Test case number: 1
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam(1149);
      fBProcedureParam0.setType(1149);
      fBProcedureCall0.getSQL(true);
      fBProcedureCall0.getInputParams();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      int int0 = (-1528);
      fBProcedureCall0.setName(")|H`JnG\"2SphGiW1d^V");
      fBProcedureCall0.mapOutParamIndexToPosition(1149, true);
      // Undeclared exception!
      try { 
        fBProcedureCall0.addParam((-1528), ")|H`JnG\"2SphGiW1d^V");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1528
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
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      Object object0 = fBProcedureCall0.clone();
      Object object1 = fBProcedureCall1.clone();
      boolean boolean0 = fBProcedureCall0.equals(object1);
      assertTrue(boolean0);
      
      fBProcedureCall1.getSQL(true);
      fBProcedureCall0.getOutputParams();
      String string0 = fBProcedureCall0.getSQL(true);
      assertEquals("SELECT * FROM null", string0);
      
      Object object2 = new Object();
      boolean boolean1 = fBProcedureCall0.equals(object2);
      assertNotSame(fBProcedureCall0, object0);
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.clone();
      boolean boolean0 = false;
      try { 
        fBProcedureCall0.mapOutParamIndexToPosition(38, false);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Specified parameter does not exist.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.hashCode();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam(0);
      fBProcedureCall0.hashCode();
      Object object0 = fBProcedureCall0.clone();
      fBProcedureCall0.hashCode();
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(1521);
      assertEquals(1521, int0);
      
      fBProcedureCall0.mapOutParamIndexToPosition(0, true);
      fBProcedureParam0.clone();
      fBProcedureCall0.mapOutParamIndexToPosition(0);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      assertNotSame(fBProcedureCall0, object0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.hashCode();
      int int0 = 887;
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getInputParam(887);
      int int1 = (-117);
      fBProcedureParam0.setType((-117));
      FBProcedureParam fBProcedureParam1 = new FBProcedureParam(887, "07001");
      try { 
        fBProcedureParam1.setValue("07001");
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
  /*Coverage entropy=1.8343719702816235
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      String string0 = "";
      fBProcedureCall0.mapOutParamIndexToPosition(41);
      fBProcedureCall0.getInputParam(31);
      fBProcedureCall0.setName("");
      fBProcedureCall0.setName("");
      fBProcedureCall0.getSQL(false);
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureParam0.setIndex(31);
      int int0 = 0;
      try { 
        fBProcedureParam0.setValue("");
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot set parameter, since it is constant.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureParam", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.666332585328325
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getInputParam(297);
      String string0 = "@)q";
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(0, "@)q");
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      int int0 = 0;
      fBProcedureParam0.setType(0);
      fBProcedureParam0.clone();
      fBProcedureParam0.setType(0);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureParam0.clone();
      fBProcedureParam0.clone();
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
  //Test case number: 8
  /*Coverage entropy=1.7478680974667573
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = 0;
      int int1 = 1;
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1, "");
      fBProcedureParam0.clone();
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getOutputParam(293);
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
  //Test case number: 9
  /*Coverage entropy=1.5941666991180168
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getInputParam(3868);
      assertEquals((-1), fBProcedureParam0.getIndex());
      
      fBProcedureParam0.setIndex(3868);
      fBProcedureParam0.setIndex((-1));
      fBProcedureParam0.setIndex(0);
      fBProcedureParam0.setIndex((-493));
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.getOutputParam((-493));
      String string0 = fBProcedureCall0.getSQL(true);
      assertEquals("SELECT * FROM null(null)", string0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(375, "&-J*");
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.getSQL(true);
      int int0 = 0;
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getOutputParam(0);
      Object object0 = new Object();
      try { 
        fBProcedureParam1.setValue(object0);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // You cannot set value of an non-existing parameter.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall$NullParam", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      String string0 = fBProcedureCall0.getName();
      assertNull(string0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      String string0 = "'";
      fBProcedureCall0.setName("'");
      fBProcedureCall0.hashCode();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getInputParam(1164);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureParam0.setIndex(1164);
      Object object0 = fBProcedureCall0.clone();
      fBProcedureParam0.setIndex(41);
      fBProcedureCall0.getSQL(false);
      fBProcedureCall0.equals(object0);
      fBProcedureCall0.hashCode();
      fBProcedureCall0.getSQL(true);
      fBProcedureParam0.setIndex(41);
      try { 
        fBProcedureCall0.registerOutParam(1723, (-1));
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot find parameter with the specified position.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.6504194524862636
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getInputParam(668);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.getSQL(false);
      try { 
        fBProcedureCall0.registerOutParam(1938, (-115));
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
  /*Coverage entropy=1.73092767665729
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName((String) null);
      fBProcedureCall0.getSQL(false);
      fBProcedureCall0.mapOutParamIndexToPosition(3);
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam(3);
      fBProcedureParam0.setIndex(3);
      fBProcedureParam0.clone();
      fBProcedureCall0.addParam(40, "");
      fBProcedureParam0.setIndex(40);
      fBProcedureParam0.clone();
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.addParam(3, "z.I?JE$PJu0(BV>E");
      fBProcedureCall0.mapOutParamIndexToPosition(3);
      fBProcedureCall0.getSQL(false);
      try { 
        fBProcedureCall0.mapOutParamIndexToPosition(2222, false);
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
  /*Coverage entropy=1.8143075196071257
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam(1149);
      fBProcedureParam0.setType(1149);
      fBProcedureCall0.getSQL(true);
      fBProcedureCall0.getInputParams();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      FBProcedureParam fBProcedureParam1 = new FBProcedureParam();
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      try { 
        fBProcedureCall0.mapOutParamIndexToPosition((-1528), false);
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
  /*Coverage entropy=1.8310204811135165
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      fBProcedureCall1.addParam(547, "HEY");
      fBProcedureCall1.getOutputParam(2);
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(2, ".Y0y2w");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      FBProcedureParam fBProcedureParam1 = new FBProcedureParam();
      fBProcedureCall0.addInputParam(fBProcedureParam1);
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
  //Test case number: 17
  /*Coverage entropy=2.0513466752845892
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall1.addParam(547, "HEY");
      fBProcedureParam0.setType(547);
      fBProcedureCall1.getOutputParam(2);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall1.getSQL(true);
      Object object0 = fBProcedureCall0.clone();
      fBProcedureCall1.equals(object0);
      // Undeclared exception!
      try { 
        fBProcedureCall1.registerOutParam((-1857), (-1857));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1858
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.5810937501718239
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      fBProcedureCall0.clone();
      FBProcedureCall fBProcedureCall2 = (FBProcedureCall)fBProcedureCall0.clone();
      FBProcedureCall fBProcedureCall3 = new FBProcedureCall();
      boolean boolean0 = fBProcedureCall1.equals(fBProcedureCall3);
      assertTrue(boolean0);
      
      fBProcedureCall1.getSQL(true);
      fBProcedureCall1.getOutputParams();
      fBProcedureCall2.setName("SELECT * FROM null");
      fBProcedureCall1.getSQL(true);
      Object object0 = new Object();
      boolean boolean1 = fBProcedureCall3.equals(fBProcedureCall2);
      assertFalse(fBProcedureCall3.equals((Object)fBProcedureCall2));
      assertFalse(boolean1);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.110016553375461
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.mapOutParamIndexToPosition(668);
      fBProcedureCall0.getInputParam(668);
      fBProcedureCall0.mapOutParamIndexToPosition(668, true);
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(52, "snDqd|");
      FBProcedureParam fBProcedureParam1 = new FBProcedureParam(668, "snDqd|");
      fBProcedureCall0.registerOutParam((-1), (-1));
      fBProcedureParam1.setIndex(4322);
      fBProcedureCall0.mapOutParamIndexToPosition(52, true);
      fBProcedureParam1.clone();
      fBProcedureCall0.mapOutParamIndexToPosition(41, true);
      FBProcedureParam fBProcedureParam2 = new FBProcedureParam();
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      FBProcedureParam fBProcedureParam3 = new FBProcedureParam();
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      FBProcedureParam fBProcedureParam4 = fBProcedureCall0.getOutputParam(41);
      fBProcedureCall0.addOutputParam(fBProcedureParam4);
      fBProcedureCall0.clone();
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      fBProcedureCall0.getInputParam(668);
      // Undeclared exception!
      try { 
        fBProcedureCall1.getInputParam((-1444));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1445
         //
         verifyException("java.util.Vector", e);
      }
  }
}
