/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 17:20:13 GMT 2018
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
  /*Coverage entropy=1.1240357221909014
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(1065, "in|Xe' RL}j.&(2-g");
      fBProcedureCall0.addParam(1065, "4>iG{|@w$;~^");
      fBProcedureCall0.addParam(3, "hi");
      fBProcedureCall0.addParam(3, "|");
      try { 
        fBProcedureCall0.registerOutParam(1065, 1065);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot find parameter with the specified position.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.7549967581308246
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1065, "in|Xe' RL}j.&(2-g");
      assertEquals("in|Xe' RL}j.&(2-g", fBProcedureParam0.getParamValue());
      
      fBProcedureCall0.addParam(1065, "4>iG{|@w$;~^");
      fBProcedureCall0.addParam(3, "hi");
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(3, "|");
      assertEquals(3, fBProcedureParam1.getPosition());
      
      FBProcedureParam fBProcedureParam2 = fBProcedureCall0.getInputParam(1999);
      assertEquals(1065, fBProcedureParam2.getType());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.5359610497090694
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(1065, "in|Xe' RL}j.&(2-g");
      fBProcedureCall0.addParam(1065, "4>iG{|@w$;~^");
      int int0 = 3;
      try { 
        fBProcedureCall0.mapOutParamIndexToPosition(3, false);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Specified parameter does not exist.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.5359610497090694
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1065, "in|Xe' RL}j.&(2-g");
      assertEquals("in|Xe' RL}j.&(2-g", fBProcedureParam0.getParamValue());
      
      fBProcedureCall0.addParam(1065, "4>iG{|@w$;~^");
      String string0 = fBProcedureCall0.getSQL(false);
      assertEquals("EXECUTE PROCEDURE null(4>iG{|@w$;~^)", string0);
      
      fBProcedureCall0.addParam(3, "hi");
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(3, "|");
      assertEquals(3, fBProcedureParam1.getPosition());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      String string0 = fBProcedureCall0.getSQL(true);
      assertEquals("SELECT * FROM null", string0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.5359610497090694
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1065, "in|Xe' RL}j.&(2-g");
      assertEquals("in|Xe' RL}j.&(2-g", fBProcedureParam0.getParamValue());
      
      fBProcedureCall0.addParam(1065, "4>iG{|@w$;~^");
      String string0 = fBProcedureCall0.getSQL(true);
      assertEquals("SELECT * FROM null(4>iG{|@w$;~^)", string0);
      
      fBProcedureCall0.addParam(3, "hi");
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(3, "|");
      assertEquals(3, fBProcedureParam1.getPosition());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.5359610497090694
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1065, "in|Xe' RL}j.&(2-g");
      assertEquals("in|Xe' RL}j.&(2-g", fBProcedureParam0.getParamValue());
      
      fBProcedureCall0.setName("in|Xe' RL}j.&(2-g");
      fBProcedureCall0.addParam(1065, "4>iG{|@w$;~^");
      fBProcedureCall0.addParam(3, "hi");
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(3, "|");
      assertEquals(3, fBProcedureParam1.getPosition());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      List<FBProcedureParam> list0 = fBProcedureCall0.getInputParams();
      assertTrue(list0.isEmpty());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      String string0 = fBProcedureCall0.getName();
      assertNull(string0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.7549967581308246
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1065, "in|Xe' RL}j.&(2-g");
      assertEquals("in|Xe' RL}j.&(2-g", fBProcedureParam0.getParamValue());
      
      fBProcedureCall0.addParam(1065, "4>iG{|@w$;~^");
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(1065);
      assertEquals(1065, int0);
      
      fBProcedureCall0.addParam(3, "hi");
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(3, "|");
      assertEquals(3, fBProcedureParam1.getPosition());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.5359610497090694
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1065, "in|Xe' RL}j.&(2-g");
      fBProcedureCall0.addParam(1065, "4>iG{|@w$;~^");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      assertEquals(1065, fBProcedureParam0.getPosition());
      assertEquals("in|Xe' RL}j.&(2-g", fBProcedureParam0.getParamValue());
      
      fBProcedureCall0.addParam(3, "hi");
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(3, "|");
      assertEquals(3, fBProcedureParam1.getPosition());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.5359610497090694
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(1065, "in|Xe' RL}j.&(2-g");
      fBProcedureCall0.addParam(1065, "4>iG{|@w$;~^");
      Object object0 = fBProcedureCall0.clone();
      assertTrue(object0.equals((Object)fBProcedureCall0));
      
      fBProcedureCall0.addParam(3, "hi");
      fBProcedureCall0.addParam(3, "|");
      assertNotSame(fBProcedureCall0, object0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      Object object0 = fBProcedureCall0.clone();
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
  //Test case number: 13
  /*Coverage entropy=0.5660857389596289
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(1065, "oUtUg&/");
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1065, "oUtUg&/");
      fBProcedureParam0.setType((-1247));
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      assertEquals("oUtUg&/", fBProcedureParam0.getParamValue());
      
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(146, "p");
      assertEquals(146, fBProcedureParam1.getPosition());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.5359610497090694
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1065, "in|Xe' RL}j.&(2-g");
      fBProcedureCall0.addParam(1065, "4>iG{|@w$;~^");
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      assertEquals("in|Xe' RL}j.&(2-g", fBProcedureParam0.getParamValue());
      
      fBProcedureCall0.addParam(3, "hi");
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(3, "|");
      assertEquals(3, fBProcedureParam1.getPosition());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.2483379411064275
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int int0 = 1065;
      String string0 = "in|Xe' RL}j\\.&(2-g";
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(1065, "in|Xe' RL}j.&(2-g");
      String string1 = "qUUgF&\\|";
      int int1 = 3352;
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getInputParam(3352);
      Object object0 = new Object();
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
  //Test case number: 16
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.hashCode();
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.5359610497090694
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(1065, "in|Xe' RL}j.&(2-g");
      fBProcedureCall0.addParam(3352, "3XAO{1D9cq0`-Mtl}");
      fBProcedureCall0.addParam(1065, "qUUgF&|");
      String string0 = fBProcedureCall0.getSQL(false);
      assertEquals("EXECUTE PROCEDURE null(qUUgF&|, 3XAO{1D9cq0`-Mtl})", string0);
      
      fBProcedureCall0.addParam(1065, "hi");
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(3352, "in|Xe' RL}j.&(2-g");
      assertEquals("in|Xe' RL}j.&(2-g", fBProcedureParam0.getParamValue());
      
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(2, " not set and ");
      assertEquals(2, fBProcedureParam1.getPosition());
      assertEquals("not set and", fBProcedureParam1.getParamValue());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      List<FBProcedureParam> list0 = fBProcedureCall0.getOutputParams();
      assertEquals(0, list0.size());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(4, "wPL");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      FBProcedureParam fBProcedureParam1 = new FBProcedureParam(4, "-yQ-XMF\"Ty#B?");
      FBProcedureCall fBProcedureCall1 = (FBProcedureCall)fBProcedureCall0.clone();
      FBProcedureCall fBProcedureCall2 = new FBProcedureCall();
      try { 
        fBProcedureParam0.setValue(fBProcedureCall1);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot set parameter, since it is constant.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureParam", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      boolean boolean0 = fBProcedureCall0.equals(fBProcedureCall1);
      assertTrue(boolean0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      boolean boolean0 = fBProcedureCall0.equals("iLfe");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName("iLf4e");
      fBProcedureCall0.hashCode();
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.7937300551584247
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(1065, "oUtUg&/");
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1065, "oUtUg&/");
      fBProcedureParam0.setType((-1247));
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      assertEquals("oUtUg&/", fBProcedureParam0.getParamValue());
      
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition((-134045580), true);
      assertEquals((-134045580), int0);
      
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(146, "p");
      assertEquals(146, fBProcedureParam1.getPosition());
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName("");
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      boolean boolean0 = fBProcedureCall0.equals(fBProcedureCall1);
      assertFalse(fBProcedureCall1.equals((Object)fBProcedureCall0));
      assertTrue(boolean0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.0335620542068176
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = 2;
      fBProcedureCall0.clone();
      fBProcedureCall0.addParam(2, "PVq|?eFcX4Sc");
      fBProcedureCall0.getSQL(true);
      // Undeclared exception!
      try { 
        fBProcedureCall0.addParam((-4192), "SELECT * FROM");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -4192
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      fBProcedureCall1.setName("3/");
      boolean boolean0 = fBProcedureCall0.equals(fBProcedureCall1);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(2, "PVq|?eFcX4Sc");
      fBProcedureParam0.setIndex((-1895));
      fBProcedureParam0.setType(2);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      assertEquals(2, fBProcedureParam0.getPosition());
      
      String string0 = fBProcedureCall0.getSQL(true);
      assertEquals("SELECT * FROM null(PVq|?eFcX4Sc)", string0);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = 35;
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(35, "PVq|?eFcX4Sc");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      int int1 = 4;
      fBProcedureCall0.addParam(4, "PVq|?eFcX4Sc");
      try { 
        fBProcedureCall0.getSQL(true);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Value of parameter -1 not set and it was not registered as output parameter.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 29
  /*Coverage entropy=0.9404479886553263
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(40, "4e?");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.mapOutParamIndexToPosition(31, true);
      fBProcedureCall0.addParam(3400, "in|Xe' RL}j.&(2-g");
      // Undeclared exception!
      try { 
        fBProcedureCall0.addParam((-83340273), "in|Xe' RL}j.&(2-g");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -83340273
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.2483379411064275
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(1065, "in|Xe' RL}j.&(2-g");
      fBProcedureCall0.addParam(1065, "4>iG{|@w$;~^");
      fBProcedureCall0.addParam(3, "hi");
      fBProcedureCall0.addParam(3, "|");
      fBProcedureCall0.getInputParam(1065);
      fBProcedureCall0.registerOutParam((-1), (-3235));
      assertTrue(FBProcedureCall.OLD_CALLABLE_STATEMENT_COMPATIBILITY);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.377819508039033
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureParam0.setType(456);
      fBProcedureParam0.clone();
      fBProcedureParam0.setIndex(456);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.registerOutParam(456, 456);
      fBProcedureCall0.registerOutParam(456, 456);
      assertNull(fBProcedureCall0.getName());
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(3, "PVq|?eFcX4Sc");
      fBProcedureParam0.setValue("PVq|?eFcX4Sc");
      fBProcedureParam0.setType((-1351));
      assertEquals(3, fBProcedureParam0.getPosition());
      
      String string0 = fBProcedureCall0.getSQL(true);
      assertEquals("SELECT * FROM null(PVq|?eFcX4Sc)", string0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(40, "4e?");
      fBProcedureParam0.setIndex(31);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.mapOutParamIndexToPosition(31, true);
      fBProcedureCall0.addParam(3400, "in|Xe' RL}j.&(2-g");
      // Undeclared exception!
      try { 
        fBProcedureCall0.addParam((-83340273), "in|Xe' RL}j.&(2-g");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -83340273
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 34
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(3018, "PVq|?e0FcX4Sc");
      fBProcedureParam0.setType(433);
      fBProcedureParam0.setValue(fBProcedureCall0);
      fBProcedureParam0.setIndex(3018);
      fBProcedureCall0.registerOutParam(3018, 3018);
      assertTrue(FBProcedureCall.OLD_CALLABLE_STATEMENT_COMPATIBILITY);
  }

  /**
  //Test case number: 35
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      int int0 = 1065;
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(1065, "in |Xe' _RL}j&(2-g");
      fBProcedureCall0.addParam(1065, "oUtUg&/");
      String string0 = "ow,*R;%$xwe*hzU";
      fBProcedureCall0.addParam(1065, "ow,*R;%$xwe*hzU");
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      int int1 = 2540;
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      try { 
        fBProcedureCall0.registerOutParam(1065, 1065);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot find parameter with the specified position.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }
}
