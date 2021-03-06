/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 11:52:31 GMT 2018
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
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      fBProcedureCall0.equals(fBProcedureCall1);
      fBProcedureCall1.addParam(0, "-%q/K%iig<aT[,");
      // Undeclared exception!
      try { 
        fBProcedureCall1.getInputParam(0);
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
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName((String) null);
      fBProcedureCall0.getSQL(false);
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
  //Test case number: 2
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam(0);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.addParam(0, "");
      fBProcedureCall0.addParam(0, "Specified parameter does not exist.");
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(0);
      assertEquals(0, int0);
      
      fBProcedureCall0.setName("Y`4NJF");
      fBProcedureCall0.getOutputParam(0);
      fBProcedureCall0.getOutputParam(63);
      List<FBProcedureParam> list0 = fBProcedureCall0.getInputParams();
      assertEquals(1, list0.size());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.70805020110221
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.mapOutParamIndexToPosition((-147));
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1648, "You cannot set value of an non-existing parameter.");
      fBProcedureCall0.getSQL(false);
      fBProcedureCall0.getInputParams();
      fBProcedureCall0.setName("y]U|Fb2hmJ(3h3");
      fBProcedureCall0.getOutputParams();
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getOutputParam(1648);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.clone();
      fBProcedureCall0.getSQL(true);
      fBProcedureCall0.setName("y]U|Fb2hmJ(3h3");
      fBProcedureCall0.equals("y]U|Fb2hmJ(3h3");
      fBProcedureCall0.getName();
      fBProcedureCall0.addOutputParam(fBProcedureParam1);
      try { 
        fBProcedureCall0.mapOutParamIndexToPosition((-848), false);
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
  /*Coverage entropy=1.6434177197931796
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName("IN");
      String string0 = "$Y=4mbD#E$4L";
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(887, "$Y=4mbD#E$4L");
      fBProcedureParam0.setType(0);
      fBProcedureParam0.clone();
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      int int0 = 31;
      // Undeclared exception!
      try { 
        fBProcedureCall0.registerOutParam((-1399), 31);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1400
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.0642580751745085
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName("08S01");
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(0, "08S01");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureParam0.setType((-1));
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.mapOutParamIndexToPosition((-1));
      fBProcedureCall0.hashCode();
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getInputParam(612);
      assertEquals(0, fBProcedureParam1.getPosition());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getSQL(true);
      fBProcedureCall0.setName("SELECT * FROM null");
      int int0 = 2;
      try { 
        fBProcedureCall0.registerOutParam(2, 2);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot find parameter with the specified position.
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
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam((-648));
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.getSQL(true);
      fBProcedureCall0.getOutputParam(0);
      fBProcedureCall0.hashCode();
      fBProcedureCall0.hashCode();
      List<FBProcedureParam> list0 = fBProcedureCall0.getOutputParams();
      assertFalse(list0.isEmpty());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.0982737395252498
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      boolean boolean0 = false;
      fBProcedureCall0.getSQL(false);
      int int0 = 0;
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(0, "@u'/KGb*;`WV]^|Ow3");
      fBProcedureParam0.setType(0);
      fBProcedureParam0.clone();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.clone();
      fBProcedureCall0.clone();
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getOutputParam((-416));
      fBProcedureParam1.clone();
      FBProcedureParam fBProcedureParam2 = fBProcedureCall0.getOutputParam(1);
      fBProcedureParam2.setIndex(1);
      fBProcedureCall0.addInputParam(fBProcedureParam2);
      fBProcedureCall0.addOutputParam(fBProcedureParam1);
      fBProcedureCall0.hashCode();
      int int1 = (-3245);
      boolean boolean1 = true;
      try { 
        fBProcedureParam2.setValue("@u'/KGb*;`WV]^|Ow3");
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
  /*Coverage entropy=1.9154649919032563
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getInputParam(2409);
      fBProcedureParam0.clone();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.mapOutParamIndexToPosition(0);
      fBProcedureCall0.getSQL(true);
      fBProcedureCall0.hashCode();
      fBProcedureCall0.getName();
      fBProcedureCall0.addParam(0, " not set and ");
      fBProcedureCall0.getSQL(true);
      fBProcedureCall0.getName();
      fBProcedureCall0.getName();
      try { 
        fBProcedureCall0.mapOutParamIndexToPosition((-1990), false);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Specified parameter does not exist.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.3114234446919735
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall1 = (FBProcedureCall)fBProcedureCall0.clone();
      fBProcedureCall0.mapOutParamIndexToPosition((-852));
      fBProcedureCall0.setName(" not set and ");
      fBProcedureCall1.setName("<;PSucKxNHFf");
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1399, "sp");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureParam0.setType(1399);
      fBProcedureCall1.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.mapOutParamIndexToPosition((-852));
      fBProcedureCall1.hashCode();
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      // Undeclared exception!
      try { 
        fBProcedureCall1.getInputParam((-852));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -853
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.90853528164356
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam(0);
      fBProcedureParam0.setIndex(0);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.mapOutParamIndexToPosition(0);
      boolean boolean0 = true;
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
  //Test case number: 12
  /*Coverage entropy=1.6534854765685243
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(2409, "a'U");
      fBProcedureParam0.clone();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      int int0 = 0;
      fBProcedureCall0.mapOutParamIndexToPosition((-2678), true);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getOutputParam(2409);
      fBProcedureParam0.clone();
      fBProcedureCall0.addOutputParam(fBProcedureParam1);
      fBProcedureCall0.clone();
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      fBProcedureCall1.clone();
      fBProcedureCall1.getOutputParam(2409);
      FBProcedureCall fBProcedureCall2 = new FBProcedureCall();
      // Undeclared exception!
      try { 
        fBProcedureCall0.addParam((-24632774), "a'U");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -24632774
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.8143075196071257
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      fBProcedureCall0.equals(fBProcedureCall1);
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(887, "?Z");
      fBProcedureParam0.clone();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.mapOutParamIndexToPosition(63);
      fBProcedureCall0.getSQL(true);
      fBProcedureCall1.hashCode();
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(887, " not set and ");
      fBProcedureCall1.getSQL(false);
      FBProcedureCall fBProcedureCall2 = new FBProcedureCall();
      try { 
        fBProcedureParam1.setValue("?Z");
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot set parameter, since it is constant.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureParam", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.3532737176317284
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(4, "Yp? 2du-?KY5P");
      fBProcedureCall0.getSQL(false);
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall2 = new FBProcedureCall();
      fBProcedureParam0.clone();
      // Undeclared exception!
      try { 
        fBProcedureCall2.getInputParam(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.8380834670331856
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(22, "Yp? 2du-?KY5P");
      FBProcedureParam fBProcedureParam1 = new FBProcedureParam((-1), "OUT");
      fBProcedureParam1.clone();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      int int0 = 3;
      fBProcedureCall0.mapOutParamIndexToPosition(3);
      fBProcedureCall0.setName("Yp? 2du-?KY5P");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      Object object0 = new Object();
      fBProcedureCall0.registerOutParam((-1), 22);
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
  //Test case number: 16
  /*Coverage entropy=2.0087880182031395
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      fBProcedureCall0.equals(fBProcedureCall1);
      assertTrue(fBProcedureCall0.equals((Object)fBProcedureCall1));
      
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(0, "?Z");
      fBProcedureParam0.clone();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.mapOutParamIndexToPosition(0);
      fBProcedureCall0.getSQL(true);
      fBProcedureCall1.hashCode();
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.getSQL(false);
      fBProcedureCall0.getInputParam(887);
      assertFalse(fBProcedureCall0.equals((Object)fBProcedureCall1));
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.666332585328325
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(22, "Yp? 2du-?KY5P");
      FBProcedureParam fBProcedureParam1 = new FBProcedureParam((-1), "OUT");
      FBProcedureParam fBProcedureParam2 = (FBProcedureParam)fBProcedureParam1.clone();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.mapOutParamIndexToPosition((-1));
      fBProcedureCall0.getSQL(true);
      // Undeclared exception!
      try { 
        fBProcedureCall0.addInputParam(fBProcedureParam2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.8255635085702335
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(22, "Yp?2du-?KYAS5P");
      int int0 = (-1);
      String string0 = "OUT";
      FBProcedureParam fBProcedureParam1 = new FBProcedureParam((-1), "OUT");
      fBProcedureParam1.clone();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureParam0.clone();
      fBProcedureParam0.setValue("OUT");
      int int1 = 3;
      fBProcedureCall0.mapOutParamIndexToPosition(3);
      fBProcedureCall0.setName("Yp?2du-?KYAS5P");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      Object object0 = new Object();
      fBProcedureCall0.registerOutParam((-1), 22);
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
  //Test case number: 19
  /*Coverage entropy=2.094729047527649
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureParam0.clone();
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(2409, "Value of parameter ");
      FBProcedureParam fBProcedureParam2 = new FBProcedureParam(2409, "Value of parameter ");
      fBProcedureParam0.clone();
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      fBProcedureCall1.addOutputParam(fBProcedureParam1);
      FBProcedureCall fBProcedureCall2 = new FBProcedureCall();
      fBProcedureCall2.mapOutParamIndexToPosition(2);
      fBProcedureCall0.getSQL(false);
      fBProcedureCall2.addParam(2, "OUT");
      fBProcedureCall2.registerOutParam((-1), (-128680600));
      assertNotSame(fBProcedureCall2, fBProcedureCall0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=2.0277066601535387
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      boolean boolean0 = FBProcedureCall.OLD_CALLABLE_STATEMENT_COMPATIBILITY;
      fBProcedureCall0.clone();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(0, "?Z");
      fBProcedureParam0.setType(0);
      fBProcedureParam0.clone();
      fBProcedureParam0.clone();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureParam0.setValue("?Z");
      fBProcedureParam0.clone();
      fBProcedureCall0.getSQL(true);
      fBProcedureParam0.clone();
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      fBProcedureCall1.addParam(0, "SELECT * FROM null(?Z)");
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall1.addParam(0, "SELECT * FROM null(?Z)");
      try { 
        fBProcedureCall0.registerOutParam(1290, 0);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot find parameter with the specified position.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }
}
