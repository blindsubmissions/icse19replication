/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 15:51:51 GMT 2018
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
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(554, "");
      fBProcedureParam0.clone();
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.mapOutParamIndexToPosition(554);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      try { 
        fBProcedureCall0.mapOutParamIndexToPosition(155, false);
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.hashCode();
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      try { 
        fBProcedureCall0.registerOutParam(31, (-241));
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
  /*Coverage entropy=1.9721037385162659
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.clone();
      fBProcedureCall0.mapOutParamIndexToPosition(62);
      fBProcedureCall0.getSQL(true);
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam(62);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getOutputParam(62);
      fBProcedureParam1.clone();
      fBProcedureCall0.clone();
      fBProcedureParam0.setType(62);
      fBProcedureParam1.setType(547);
      fBProcedureCall0.addOutputParam(fBProcedureParam1);
      fBProcedureCall0.mapOutParamIndexToPosition(62, true);
      fBProcedureCall0.clone();
      int int0 = 0;
      fBProcedureCall0.getOutputParam(62);
      fBProcedureCall0.clone();
      fBProcedureCall0.clone();
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
  //Test case number: 4
  /*Coverage entropy=2.0431918705451206
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.mapOutParamIndexToPosition(344);
      fBProcedureCall0.getOutputParam(3);
      fBProcedureCall0.mapOutParamIndexToPosition((-2157));
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam(3);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.clone();
      // Undeclared exception!
      try { 
        fBProcedureCall0.getInputParam((-1328));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1329
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getInputParam(2098);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureParam0.setType(37);
      boolean boolean0 = false;
      fBProcedureParam0.clone();
      fBProcedureCall0.getSQL(false);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.setName("_x");
      fBProcedureCall0.getName();
      fBProcedureCall0.clone();
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getOutputParam(2098);
      try { 
        fBProcedureParam1.setValue("YM");
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // You cannot set value of an non-existing parameter.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall$NullParam", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getSQL(false);
      fBProcedureCall0.setName("EXECUTE PROCEDURE null");
      fBProcedureCall0.clone();
      fBProcedureCall0.clone();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam(0);
      fBProcedureCall0.addParam(0, "EXECUTE PROCEDURE null");
      fBProcedureCall0.getSQL(false);
      fBProcedureParam0.setType(0);
      fBProcedureCall0.hashCode();
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
  //Test case number: 7
  /*Coverage entropy=0.9743147528693494
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = 31;
      fBProcedureCall0.getInputParam(31);
      int int1 = 0;
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
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      boolean boolean0 = false;
      fBProcedureCall0.getSQL(false);
      fBProcedureCall0.getOutputParams();
      Object object0 = new Object();
      fBProcedureCall0.addParam(2, "EXECUTE PROCEDURE null");
      fBProcedureCall0.equals(object0);
      fBProcedureCall0.addParam(1692, "EXECUTE PROCEDURE");
      // Undeclared exception!
      try { 
        fBProcedureCall0.getInputParam((-2307));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2308
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.2459520807289133
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getSQL(false);
      fBProcedureCall0.getOutputParams();
      Object object0 = fBProcedureCall0.clone();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(2, "EXECUTE PROCEDURE null");
      fBProcedureCall0.equals(object0);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(1692, "EXECUTE PROCEDURE");
      fBProcedureParam0.setType((-34));
      fBProcedureParam1.setType(1692);
      fBProcedureParam1.setType(2);
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      fBProcedureCall1.addOutputParam(fBProcedureParam1);
      try { 
        fBProcedureCall0.registerOutParam(2, 0);
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
  /*Coverage entropy=2.133381930264545
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(554, "");
      FBProcedureParam fBProcedureParam1 = (FBProcedureParam)fBProcedureParam0.clone();
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.mapOutParamIndexToPosition(554);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.getSQL(true);
      FBProcedureParam fBProcedureParam2 = new FBProcedureParam();
      fBProcedureParam1.clone();
      fBProcedureParam1.setType((-56513902));
      fBProcedureParam1.setType(547);
      fBProcedureCall0.addOutputParam(fBProcedureParam1);
      int int0 = 15;
      // Undeclared exception!
      try { 
        fBProcedureCall0.registerOutParam(0, 15);
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
  /*Coverage entropy=0.8304717124362917
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(915, ")");
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(2913, "");
      assertEquals(2913, fBProcedureParam0.getPosition());
      
      String string0 = fBProcedureCall0.getSQL(false);
      assertEquals("EXECUTE PROCEDURE null(), )", string0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getSQL(false);
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      fBProcedureCall0.clone();
      FBProcedureCall fBProcedureCall2 = new FBProcedureCall();
      fBProcedureCall1.equals(fBProcedureCall2);
      int int0 = 1692;
      String string0 = "EXECUTE PROC]EDURE";
      // Undeclared exception!
      try { 
        fBProcedureCall2.addParam(1692, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.0154578847590634
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getOutputParams();
      FBProcedureCall fBProcedureCall1 = (FBProcedureCall)fBProcedureCall0.clone();
      String string0 = "KEaisz20hk^4_";
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(2, "KEaisz20hk^4_");
      fBProcedureCall0.equals(fBProcedureCall1);
      int int0 = 1600;
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(1600, "EXECUTE PROCEDURE");
      fBProcedureParam0.setIndex(1600);
      fBProcedureParam0.setType(1701);
      fBProcedureParam1.setType(1600);
      fBProcedureCall0.getInputParam(1600);
      FBProcedureCall fBProcedureCall2 = new FBProcedureCall();
      try { 
        fBProcedureCall2.registerOutParam(1600, 1701);
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
  /*Coverage entropy=1.6674619334292948
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName("Cannot find parameter with the specified position.");
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall1.addParam(0, "IRnQ:_/4");
      fBProcedureCall0.equals(fBProcedureCall1);
      int int0 = 1692;
      fBProcedureCall1.addParam(0, "Cannot find parameter with the specified position.");
      fBProcedureParam0.setType(1692);
      fBProcedureParam0.setType((-34));
      FBProcedureCall fBProcedureCall2 = new FBProcedureCall();
      int int1 = 63;
      fBProcedureCall0.getInputParam(63);
      // Undeclared exception!
      try { 
        fBProcedureCall1.getInputParam((-34));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -35
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.8854819933311895
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(554, "");
      fBProcedureCall0.getSQL(false);
      fBProcedureParam0.clone();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      fBProcedureCall0.clone();
      FBProcedureCall fBProcedureCall2 = new FBProcedureCall();
      int int0 = (-507);
      try { 
        fBProcedureCall1.registerOutParam(1555, (-507));
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
  /*Coverage entropy=2.3046193848206715
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getOutputParams();
      FBProcedureCall fBProcedureCall1 = (FBProcedureCall)fBProcedureCall0.clone();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(2, "KEaisz20hk^4_");
      fBProcedureCall0.equals(fBProcedureCall1);
      fBProcedureCall0.addParam(1600, "EXECUTE PROCEDURE");
      fBProcedureParam0.setIndex(1600);
      fBProcedureCall0.mapOutParamIndexToPosition(1600);
      fBProcedureCall1.getSQL(false);
      fBProcedureCall0.registerOutParam(1600, 1600);
      fBProcedureCall1.getSQL(true);
      // Undeclared exception!
      try { 
        fBProcedureCall1.addParam((-799), " (i");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -799
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.37189981105004
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getInputParams();
      FBProcedureCall fBProcedureCall1 = (FBProcedureCall)fBProcedureCall0.clone();
      fBProcedureCall1.setName("y6=w+TM({\u0001YOo");
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(2, "KEaisz20hk^4_");
      fBProcedureCall0.equals(fBProcedureCall1);
      fBProcedureCall0.addParam(1600, "EXECUTE PROCEDURE");
      fBProcedureParam0.setIndex(1600);
      fBProcedureCall0.mapOutParamIndexToPosition(1600);
      fBProcedureCall1.getSQL(false);
      FBProcedureCall fBProcedureCall2 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall3 = new FBProcedureCall();
      fBProcedureCall0.addParam(2, "org.firebirdsql.jdbc.FBProcedureCall$NullParam");
      try { 
        fBProcedureCall3.registerOutParam(1600, 4257);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot find parameter with the specified position.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.0636495704788542
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      fBProcedureCall0.addParam(1600, "EXECUTE PROCEDURE");
      fBProcedureParam0.setIndex(1600);
      fBProcedureCall0.mapOutParamIndexToPosition(0);
      fBProcedureCall0.getSQL(false);
      fBProcedureCall0.registerOutParam(1600, 1692);
      fBProcedureCall0.getSQL(false);
      fBProcedureCall1.getSQL(true);
      fBProcedureCall0.getOutputParam(0);
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
  //Test case number: 19
  /*Coverage entropy=2.20082764903455
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(746, "S8^o5*2CZ`:Sj$?");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.addOutputParam(fBProcedureParam1);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.getName();
      FBProcedureParam fBProcedureParam2 = fBProcedureCall0.getOutputParam((-28766209));
      fBProcedureCall0.addOutputParam(fBProcedureParam2);
      boolean boolean0 = false;
      fBProcedureCall0.getSQL(false);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      fBProcedureCall0.addOutputParam(fBProcedureParam2);
      fBProcedureCall1.addInputParam(fBProcedureParam1);
      fBProcedureCall0.getSQL(false);
      fBProcedureCall0.addOutputParam(fBProcedureParam1);
      fBProcedureCall0.mapOutParamIndexToPosition((-28766209));
      try { 
        fBProcedureCall0.registerOutParam(18, (-28766209));
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
  /*Coverage entropy=2.0177173722189474
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getOutputParams();
      FBProcedureCall fBProcedureCall1 = (FBProcedureCall)fBProcedureCall0.clone();
      fBProcedureCall1.addParam(2, "OVXg]");
      FBProcedureCall fBProcedureCall2 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall3 = new FBProcedureCall();
      fBProcedureCall3.getSQL(true);
      FBProcedureParam fBProcedureParam0 = fBProcedureCall3.addParam(2, "tkP?n~O7O$<");
      fBProcedureCall2.addInputParam(fBProcedureParam0);
      fBProcedureCall3.getSQL(false);
      try { 
        fBProcedureCall1.registerOutParam(2098, 2);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot find parameter with the specified position.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }
}
