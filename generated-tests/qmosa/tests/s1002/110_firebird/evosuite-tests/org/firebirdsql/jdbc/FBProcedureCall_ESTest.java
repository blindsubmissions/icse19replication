/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 10:08:09 GMT 2018
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
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam((-1));
      fBProcedureParam0.setIndex((-1));
      fBProcedureParam0.clone();
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.clone();
      fBProcedureCall0.setName("");
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getOutputParam((-1));
      fBProcedureParam1.clone();
      fBProcedureCall0.addOutputParam(fBProcedureParam1);
      int int0 = 0;
      fBProcedureCall0.getOutputParam(0);
      fBProcedureCall0.getSQL(false);
      int int1 = 0;
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
  //Test case number: 1
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = 0;
      fBProcedureCall0.getSQL(true);
      fBProcedureCall0.mapOutParamIndexToPosition(0);
      fBProcedureCall0.hashCode();
      fBProcedureCall0.addParam(0, "OUT");
      fBProcedureCall0.mapOutParamIndexToPosition((-403), true);
      int int1 = 63;
      boolean boolean0 = false;
      try { 
        fBProcedureCall0.mapOutParamIndexToPosition(63, false);
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
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.hashCode();
      String string0 = "";
      fBProcedureCall0.setName("");
      // Undeclared exception!
      try { 
        fBProcedureCall0.addParam((-3131), "");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3131
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      boolean boolean0 = true;
      fBProcedureCall0.getSQL(true);
      fBProcedureCall0.hashCode();
      fBProcedureCall0.getOutputParams();
      fBProcedureCall0.equals("SELECT * FROM null");
      fBProcedureCall0.mapOutParamIndexToPosition(178);
      int int0 = 0;
      fBProcedureCall0.clone();
      fBProcedureCall0.addParam(0, "SELECT * FROM null");
      int int1 = (-1022);
      try { 
        fBProcedureCall0.mapOutParamIndexToPosition((-1022), false);
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
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam(95);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getOutputParam(191);
      fBProcedureCall0.addInputParam(fBProcedureParam1);
      fBProcedureCall0.getSQL(false);
      fBProcedureCall0.getInputParams();
      fBProcedureCall0.mapOutParamIndexToPosition(191);
      fBProcedureCall0.equals(fBProcedureParam0);
      FBProcedureParam fBProcedureParam2 = fBProcedureCall0.getOutputParam(0);
      fBProcedureCall0.equals("EXECUTE PROCEDURE null(null)");
      fBProcedureCall0.getOutputParam(0);
      fBProcedureCall0.getInputParam(191);
      fBProcedureCall0.getOutputParam((-3257));
      fBProcedureCall0.addInputParam(fBProcedureParam2);
      FBProcedureParam fBProcedureParam3 = fBProcedureCall0.getOutputParam(191);
      assertEquals(0, fBProcedureParam3.getType());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.clone();
      int int0 = 31;
      String string0 = "\\NS^~\"x;Diu(;y7";
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(0, "NS^~\"x;Diu(;y7");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      try { 
        fBProcedureCall0.registerOutParam(31, 715);
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
  /*Coverage entropy=1.6459168300174678
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(1, "");
      fBProcedureCall0.addParam(1, "");
      String string0 = "";
      try { 
        fBProcedureCall0.registerOutParam(1, 2869);
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
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName("");
      fBProcedureCall0.getName();
      fBProcedureCall0.getName();
      fBProcedureCall0.mapOutParamIndexToPosition((-602), true);
      fBProcedureCall0.clone();
      fBProcedureCall0.getInputParam(1);
      try { 
        fBProcedureCall0.registerOutParam(1, (-4326));
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
  /*Coverage entropy=1.7489707507713133
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.mapOutParamIndexToPosition(3);
      int int0 = 2008;
      fBProcedureCall0.mapOutParamIndexToPosition(3);
      fBProcedureCall0.addParam(2008, "");
      fBProcedureCall0.getName();
      fBProcedureCall0.clone();
      fBProcedureCall0.setName((String) null);
      try { 
        fBProcedureCall0.mapOutParamIndexToPosition((-29), false);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Specified parameter does not exist.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.3667110520552042
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = 0;
      int int1 = 2898;
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getInputParam(2898);
      int int2 = (-669);
      Object object0 = fBProcedureCall0.clone();
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
  //Test case number: 10
  /*Coverage entropy=1.7478680974667573
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getSQL(false);
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam(1002);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      int int0 = (-3393);
      try { 
        fBProcedureCall0.mapOutParamIndexToPosition((-3393), false);
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
  /*Coverage entropy=2.1010096288875433
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam(37);
      fBProcedureParam0.setType((-3702));
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.equals((Object) null);
      fBProcedureCall0.getOutputParams();
      fBProcedureCall0.clone();
      int int0 = (-332);
      fBProcedureCall0.mapOutParamIndexToPosition((-332), true);
      // Undeclared exception!
      try { 
        fBProcedureCall0.registerOutParam((-94), 37);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -95
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.512658529529802
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getName();
      fBProcedureCall0.getName();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam(0);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.getInputParam(3135);
      fBProcedureCall0.hashCode();
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      fBProcedureCall1.mapOutParamIndexToPosition(3135);
      fBProcedureCall0.equals(fBProcedureCall1);
      fBProcedureCall1.getOutputParam(0);
      FBProcedureCall fBProcedureCall2 = new FBProcedureCall();
      fBProcedureCall2.clone();
      fBProcedureCall0.equals(fBProcedureCall2);
      fBProcedureCall2.mapOutParamIndexToPosition(0);
      fBProcedureCall1.mapOutParamIndexToPosition(887);
      fBProcedureCall1.getInputParams();
      // Undeclared exception!
      try { 
        fBProcedureCall2.addParam(887, (String) null);
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
  /*Coverage entropy=1.945934775756114
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName("9oM.-P");
      fBProcedureCall0.getSQL(true);
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam(887);
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      fBProcedureCall1.addOutputParam(fBProcedureParam0);
      fBProcedureCall1.mapOutParamIndexToPosition((-2075), true);
      fBProcedureCall0.hashCode();
      String string0 = "_nP=UO";
      // Undeclared exception!
      try { 
        fBProcedureCall1.addParam((-2075), "SELECT * FROM 9oM.-P");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2075
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.8460525146995626
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getSQL(false);
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam(1002);
      fBProcedureParam0.setType(1002);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.mapOutParamIndexToPosition(1002);
      fBProcedureCall0.addParam(1072, "_nP=UO");
      fBProcedureCall0.mapOutParamIndexToPosition((-3379), true);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      // Undeclared exception!
      try { 
        fBProcedureCall0.addInputParam((FBProcedureParam) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.0791512728828505
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam(37);
      fBProcedureParam0.setType((-3702));
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.equals((Object) null);
      fBProcedureCall0.getOutputParams();
      Object object0 = fBProcedureCall0.clone();
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      assertEquals((-274), fBProcedureParam0.getIndex());
      
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      fBProcedureCall0.mapOutParamIndexToPosition((-332));
      FBProcedureCall fBProcedureCall2 = new FBProcedureCall();
      fBProcedureCall1.equals(fBProcedureCall2);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getOutputParam((-3702));
      FBProcedureCall fBProcedureCall3 = new FBProcedureCall();
      fBProcedureParam1.setIndex(547);
      boolean boolean0 = object0.equals(fBProcedureParam0);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.4750763110546947
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getSQL(false);
      int int0 = 1002;
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1002, "EXECUTE PROCEDURE null");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      try { 
        fBProcedureCall0.mapOutParamIndexToPosition((-3393), false);
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
  /*Coverage entropy=2.156727312748295
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getSQL(false);
      fBProcedureCall0.getOutputParam(1002);
      FBProcedureCall fBProcedureCall1 = (FBProcedureCall)fBProcedureCall0.clone();
      fBProcedureCall1.hashCode();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(2, "#C{DJ");
      fBProcedureCall0.mapOutParamIndexToPosition(58, true);
      fBProcedureCall1.addInputParam(fBProcedureParam0);
      fBProcedureCall1.getSQL(false);
      // Undeclared exception!
      try { 
        fBProcedureCall0.registerOutParam((-94), (-332));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -95
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.9521382094153648
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam((-1));
      fBProcedureParam0.setIndex((-1));
      fBProcedureParam0.clone();
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      FBProcedureCall fBProcedureCall1 = (FBProcedureCall)fBProcedureCall0.clone();
      fBProcedureCall0.setName("");
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getOutputParam((-1));
      fBProcedureCall1.getOutputParam(3136);
      fBProcedureParam1.clone();
      fBProcedureCall0.addOutputParam(fBProcedureParam1);
      fBProcedureCall0.getOutputParam(0);
      fBProcedureCall0.getSQL(false);
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
  //Test case number: 19
  /*Coverage entropy=1.9888688737319609
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getSQL(false);
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam(1056);
      fBProcedureCall0.hashCode();
      fBProcedureCall0.addParam(1, "TbaD9lyV^suF@? Am");
      fBProcedureCall0.mapOutParamIndexToPosition(4, true);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.getSQL(true);
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      try { 
        fBProcedureCall1.registerOutParam(2, 6);
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
  /*Coverage entropy=2.16597649534005
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getSQL(false);
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam(1056);
      fBProcedureCall0.getOutputParam(1);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.mapOutParamIndexToPosition(1002);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(1, "org.firebirdsql.gds.GDSException");
      fBProcedureCall0.mapOutParamIndexToPosition(1002);
      fBProcedureCall0.getSQL(true);
      fBProcedureCall0.registerOutParam((-1), 1002);
      fBProcedureCall0.addOutputParam(fBProcedureParam1);
      assertEquals(1002, fBProcedureParam1.getType());
      
      Object object0 = fBProcedureCall0.clone();
      assertTrue(object0.equals((Object)fBProcedureCall0));
  }

  /**
  //Test case number: 21
  /*Coverage entropy=2.0791512728828505
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.mapOutParamIndexToPosition((-3300));
      FBProcedureCall fBProcedureCall1 = (FBProcedureCall)fBProcedureCall0.clone();
      fBProcedureCall1.setName((String) null);
      fBProcedureCall0.equals(fBProcedureCall1);
      FBProcedureCall fBProcedureCall2 = new FBProcedureCall();
      fBProcedureCall0.getOutputParam(1);
      fBProcedureCall2.setName("Q");
      FBProcedureCall fBProcedureCall3 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall4 = (FBProcedureCall)fBProcedureCall3.clone();
      fBProcedureCall0.clone();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureCall2.equals(fBProcedureCall4);
      fBProcedureCall3.mapOutParamIndexToPosition((-56513902));
      fBProcedureCall2.mapOutParamIndexToPosition(0);
      FBProcedureCall fBProcedureCall5 = new FBProcedureCall();
      fBProcedureCall5.getInputParams();
      FBProcedureCall fBProcedureCall6 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall7 = new FBProcedureCall();
      // Undeclared exception!
      try { 
        fBProcedureCall6.addParam((-1), "it was not registered as output parameter.");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=2.042767825562219
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getSQL(false);
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam(1056);
      fBProcedureCall0.hashCode();
      fBProcedureCall0.addParam(1, "TbaD9lyV^suF@? Am");
      fBProcedureCall0.mapOutParamIndexToPosition(14, true);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.mapOutParamIndexToPosition(14);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getOutputParam(37);
      fBProcedureParam1.setIndex(41);
      fBProcedureCall0.addOutputParam(fBProcedureParam1);
      fBProcedureCall0.getInputParam(14);
      // Undeclared exception!
      try { 
        fBProcedureCall0.getSQL(true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: 1
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=2.126363803186915
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getSQL(false);
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam(1056);
      fBProcedureParam0.clone();
      fBProcedureCall0.hashCode();
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(1, "TbaD9lyV^suF@? Am");
      fBProcedureCall0.mapOutParamIndexToPosition(14, true);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.mapOutParamIndexToPosition(14);
      fBProcedureParam0.setIndex(41);
      fBProcedureCall0.addOutputParam(fBProcedureParam1);
      fBProcedureCall0.getInputParam(14);
      fBProcedureCall0.getSQL(true);
      fBProcedureCall0.equals(fBProcedureParam0);
      fBProcedureCall0.mapOutParamIndexToPosition(14, true);
      fBProcedureCall0.registerOutParam((-1), 1003);
      try { 
        fBProcedureCall0.registerOutParam(37, 887);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot find parameter with the specified position.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.3667110520552042
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(55, "exe");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.clone();
      fBProcedureCall0.clone();
      int int0 = (-22733666);
      // Undeclared exception!
      try { 
        fBProcedureCall0.getInputParam((-22733666));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -22733667
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=2.2198357039098267
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getSQL(false);
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam(1056);
      fBProcedureParam0.setIndex((-1610));
      fBProcedureParam0.clone();
      fBProcedureCall0.hashCode();
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(1, "TbaD9lyV^suF@? Am");
      fBProcedureParam1.setType((-201774121));
      Object object0 = new Object();
      fBProcedureParam1.setValue(object0);
      boolean boolean0 = true;
      fBProcedureCall0.mapOutParamIndexToPosition(14, true);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.mapOutParamIndexToPosition(14);
      fBProcedureParam0.setIndex(41);
      fBProcedureCall0.addOutputParam(fBProcedureParam1);
      fBProcedureCall0.getInputParam(14);
      fBProcedureCall0.getSQL(true);
      fBProcedureCall0.equals(fBProcedureParam0);
      fBProcedureCall0.mapOutParamIndexToPosition(14, true);
      fBProcedureCall0.getInputParam(14);
      fBProcedureCall0.registerOutParam((-1), 1003);
      int int0 = 887;
      try { 
        fBProcedureCall0.registerOutParam(37, 887);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot find parameter with the specified position.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 26
  /*Coverage entropy=2.1352402575267164
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getOutputParam((-1));
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam(1002);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.hashCode();
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(13, "_nP=UO");
      assertEquals(13, fBProcedureParam1.getPosition());
      
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(63, true);
      assertEquals(63, int0);
      
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      Object object0 = new Object();
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      fBProcedureCall1.setName("iJ{QNi");
      boolean boolean0 = fBProcedureCall0.equals(fBProcedureCall1);
      assertFalse(boolean0);
      
      fBProcedureCall1.getInputParam(1002);
      assertFalse(fBProcedureCall1.equals((Object)fBProcedureCall0));
  }
}