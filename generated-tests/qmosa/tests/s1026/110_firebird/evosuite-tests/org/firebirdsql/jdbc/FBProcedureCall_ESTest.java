/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 16:48:19 GMT 2018
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
      fBProcedureCall0.getOutputParam(41);
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureParam0.clone();
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.getOutputParam((-4594));
      try { 
        fBProcedureCall0.mapOutParamIndexToPosition((-4594), false);
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
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = 0;
      boolean boolean0 = false;
      boolean boolean1 = false;
      fBProcedureCall0.getSQL(false);
      fBProcedureCall0.getSQL(false);
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
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
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
  //Test case number: 3
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.mapOutParamIndexToPosition(0);
      fBProcedureCall0.getName();
      fBProcedureCall0.setName((String) null);
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.setName((String) null);
      fBProcedureParam0.clone();
      fBProcedureCall0.getInputParams();
      int int0 = (-231);
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
  //Test case number: 4
  /*Coverage entropy=1.4750763110546947
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(63, "`\"2k,/(y9$}?^-t");
      int int0 = (-3036);
      // Undeclared exception!
      try { 
        fBProcedureCall0.registerOutParam((-3036), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3037
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.7481554572476763
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(547, "");
      fBProcedureParam0.clone();
      fBProcedureParam0.setType((-3707));
      fBProcedureCall0.getInputParam(170);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      try { 
        fBProcedureCall0.registerOutParam(170, 547);
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
  /*Coverage entropy=2.0578975319224093
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam(1351);
      fBProcedureCall0.setName((String) null);
      fBProcedureParam0.setType(2);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.clone();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.getSQL(true);
      // Undeclared exception!
      try { 
        fBProcedureCall0.registerOutParam((-4090), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -4091
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.1639556568820564
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getInputParam(40);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.mapOutParamIndexToPosition(1);
      int int0 = (-4004);
      fBProcedureCall0.clone();
      String string0 = "";
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getOutputParam((-4004));
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
  //Test case number: 8
  /*Coverage entropy=1.7478680974667573
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = 0;
      String string0 = "it was not registered as output parameter.";
      fBProcedureCall0.addParam(0, "it was not registered as output parameter.");
      fBProcedureCall0.mapOutParamIndexToPosition(0, true);
      fBProcedureCall0.hashCode();
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
  /*Coverage entropy=1.8065071652616695
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName("");
      fBProcedureCall0.getInputParam(1313);
      fBProcedureCall0.getSQL(true);
      fBProcedureCall0.addParam(1313, "");
      fBProcedureCall0.getSQL(true);
      try { 
        fBProcedureCall0.mapOutParamIndexToPosition((-1414), false);
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
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.mapOutParamIndexToPosition(0, true);
      int int0 = 2370;
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(2370, "Fa\"O0^@5UmL[3Gj$@");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.getSQL(false);
      fBProcedureParam0.clone();
      fBProcedureParam0.clone();
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getInputParam(1119);
      fBProcedureCall0.addInputParam(fBProcedureParam1);
      fBProcedureCall0.getOutputParams();
      fBProcedureCall0.clone();
      fBProcedureParam0.setIndex(3287);
      fBProcedureCall0.getName();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      // Undeclared exception!
      try { 
        fBProcedureCall0.registerOutParam(0, 3287);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      Object object0 = fBProcedureCall0.clone();
      fBProcedureCall0.equals(object0);
      fBProcedureCall0.mapOutParamIndexToPosition((-3934), true);
      int int0 = (-1774);
      boolean boolean0 = false;
      FBProcedureParam fBProcedureParam0 = null;
      try {
        fBProcedureParam0 = new FBProcedureParam((-888), (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureParam", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.2718685126965625
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.mapOutParamIndexToPosition(0, true);
      int int0 = 2370;
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(2370, "Fa\"O0^@5UmL[3Gj$@");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.getSQL(false);
      fBProcedureParam0.clone();
      fBProcedureParam0.clone();
      fBProcedureCall0.getInputParam(1119);
      fBProcedureCall0.mapOutParamIndexToPosition(2370);
      fBProcedureCall0.mapOutParamIndexToPosition(0);
      fBProcedureCall0.getSQL(false);
      fBProcedureCall0.getName();
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      fBProcedureCall1.clone();
      // Undeclared exception!
      try { 
        fBProcedureCall0.getInputParam((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      String string0 = "fa";
      fBProcedureCall0.getSQL(false);
      fBProcedureCall0.addParam(1240, "fa");
      int int0 = 31;
      fBProcedureCall0.getInputParam(31);
      fBProcedureCall0.equals("fa");
      fBProcedureCall0.getSQL(false);
      // Undeclared exception!
      try { 
        fBProcedureCall0.getInputParam((-28734958));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -28734959
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.351673301904631
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getSQL(true);
      Object object0 = new Object();
      fBProcedureCall0.equals(object0);
      fBProcedureCall0.hashCode();
      fBProcedureCall0.setName("SELECT * FROM null");
      fBProcedureCall0.clone();
      fBProcedureCall0.mapOutParamIndexToPosition(1353);
      fBProcedureCall0.hashCode();
      int int0 = (-872);
      boolean boolean0 = true;
      // Undeclared exception!
      try { 
        fBProcedureCall0.registerOutParam((-2943), 694);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2944
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.3046193848206715
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getInputParams();
      fBProcedureCall0.mapOutParamIndexToPosition((-1));
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam((-1));
      String string0 = "";
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(1473, "");
      FBProcedureParam fBProcedureParam2 = new FBProcedureParam();
      fBProcedureCall0.addInputParam(fBProcedureParam2);
      fBProcedureParam0.clone();
      fBProcedureParam1.setType((-3692));
      fBProcedureCall0.addOutputParam(fBProcedureParam1);
      int int0 = (-1);
      fBProcedureCall0.registerOutParam((-1), (-3692));
      // Undeclared exception!
      try { 
        fBProcedureCall0.addParam((-623), "mZhE^");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -623
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.9722469794234416
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = 35;
      int int1 = (-2453);
      fBProcedureCall0.mapOutParamIndexToPosition((-2453));
      fBProcedureCall0.hashCode();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1240, "->6");
      fBProcedureParam0.setType((-1345));
      fBProcedureParam0.setIndex(1240);
      fBProcedureCall0.registerOutParam(1240, 1240);
      // Undeclared exception!
      try { 
        fBProcedureCall0.registerOutParam((-452), (-452));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -453
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.0642580751745085
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getInputParams();
      fBProcedureCall0.mapOutParamIndexToPosition((-1));
      fBProcedureCall0.getOutputParam((-1));
      fBProcedureCall0.mapOutParamIndexToPosition((-1), true);
      fBProcedureCall0.addParam(14, "_T9w?QqV7m!^p`");
      fBProcedureCall0.getSQL(true);
      fBProcedureCall0.registerOutParam((-1), 18);
      fBProcedureCall0.getSQL(true);
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      fBProcedureCall0.mapOutParamIndexToPosition(211);
      fBProcedureCall0.getSQL(false);
      // Undeclared exception!
      try { 
        fBProcedureCall1.registerOutParam((-4378), 211);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -4379
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.945934775756114
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getOutputParam((-1));
      fBProcedureCall0.addParam(14, "_T9w?QqV7m!^p`");
      fBProcedureCall0.getSQL(true);
      fBProcedureCall0.registerOutParam((-1), 18);
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      fBProcedureCall0.getSQL(true);
      FBProcedureCall fBProcedureCall2 = new FBProcedureCall();
      fBProcedureCall0.mapOutParamIndexToPosition((-1));
      fBProcedureCall0.getSQL(true);
      try { 
        fBProcedureCall2.registerOutParam(211, (-649));
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
  /*Coverage entropy=1.4750763110546947
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName("Ex \"FE@rxG|EG%TN");
      String string0 = fBProcedureCall0.getSQL(false);
      assertEquals("EXECUTE PROCEDURE Ex \"FE@rxG|EG%TN", string0);
      
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(995, "no");
      assertEquals(995, fBProcedureParam0.getPosition());
      
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      boolean boolean0 = fBProcedureCall0.equals(fBProcedureCall1);
      assertFalse(boolean0);
  }
}
