/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 04:42:02 GMT 2018
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      boolean boolean0 = fBProcedureCall0.equals(fBProcedureParam0);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.410116318288409
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = (-9);
      // Undeclared exception!
      try { 
        fBProcedureCall0.addParam((-9), "fn~,{");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -9
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getInputParam(3647);
      // Undeclared exception!
      try { 
        fBProcedureCall0.getInputParam((-336));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -337
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      String string0 = fBProcedureCall0.getName();
      assertNull(string0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(3, "HY000");
      assertEquals(3, fBProcedureParam0.getPosition());
      
      Object object0 = fBProcedureCall0.clone();
      assertNotSame(object0, fBProcedureCall0);
      assertTrue(object0.equals((Object)fBProcedureCall0));
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = 1;
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getInputParam(1);
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
  //Test case number: 6
  /*Coverage entropy=1.0027182645175161
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.mapOutParamIndexToPosition(1201);
      int int0 = (-1592);
      // Undeclared exception!
      try { 
        fBProcedureCall0.addParam((-1592), " oVt xe >nO`");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1592
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      List<FBProcedureParam> list0 = fBProcedureCall0.getOutputParams();
      assertEquals(0, list0.size());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.410116318288409
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = 180;
      // Undeclared exception!
      try { 
        fBProcedureCall0.addParam((-1242), "In(");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1242
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      String string0 = fBProcedureCall0.getSQL(false);
      assertEquals("EXECUTE PROCEDURE null", string0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      String string0 = fBProcedureCall0.getSQL(true);
      assertEquals("SELECT * FROM null", string0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.0027182645175161
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getOutputParam(575);
      int int0 = (-1592);
      // Undeclared exception!
      try { 
        fBProcedureCall0.addParam((-1592), " oVt xe >nO`");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1592
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam((-2947), "#`B(*4A`");
      // Undeclared exception!
      try { 
        fBProcedureCall0.addOutputParam(fBProcedureParam0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2947
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.035016633484322
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      int int0 = 1359;
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(1359, "t,Oh!ei?8Y[");
      fBProcedureParam1.setIndex(3932);
      fBProcedureCall0.addOutputParam(fBProcedureParam1);
      fBProcedureCall0.addParam(1359, "?5u4");
      fBProcedureCall0.addParam(3932, "?5u4");
      boolean boolean0 = true;
      // Undeclared exception!
      try { 
        fBProcedureCall0.getSQL(true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: 3932
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1, "br");
      assertEquals(1, fBProcedureParam0.getPosition());
      
      String string0 = fBProcedureCall0.getSQL(true);
      assertEquals("SELECT * FROM null(br)", string0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.3896811919839047
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      try { 
        fBProcedureCall0.registerOutParam(1360, 1360);
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      List<FBProcedureParam> list0 = fBProcedureCall0.getInputParams();
      assertTrue(list0.isEmpty());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      boolean boolean0 = fBProcedureCall0.equals(fBProcedureCall1);
      assertTrue(boolean0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      String string0 = " nVt xet and ";
      int int0 = 2759;
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(2759, " nVt xet and ");
      fBProcedureCall0.addParam(1208, " nVt xet and ");
      fBProcedureCall0.getSQL(true);
      try { 
        fBProcedureParam0.setValue(" nVt xet and ");
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(40, "07");
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      assertEquals(0, fBProcedureParam0.getType());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.hashCode();
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.7963116401738131
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      int int0 = 3;
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureParam0.clone();
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
  //Test case number: 22
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName("ov");
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      boolean boolean0 = fBProcedureCall0.equals(fBProcedureCall1);
      assertFalse(fBProcedureCall1.equals((Object)fBProcedureCall0));
      assertTrue(boolean0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName("In(");
      fBProcedureCall0.hashCode();
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      Object object0 = fBProcedureCall0.clone();
      assertTrue(object0.equals((Object)fBProcedureCall0));
      assertNotSame(object0, fBProcedureCall0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      String string0 = " out xet >ndi";
      int int0 = 36;
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(36, " out xet >ndi");
      fBProcedureCall0.clone();
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
  //Test case number: 26
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(40, "\"4_(sK#D[;op{_Un'");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(4120, true);
      assertEquals(4120, int0);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = (-336);
      fBProcedureCall0.getInputParam(1);
      // Undeclared exception!
      try { 
        fBProcedureCall0.getInputParam((-336));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -337
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      fBProcedureCall1.setName("rWbj9\"^5;{U");
      boolean boolean0 = fBProcedureCall0.equals(fBProcedureCall1);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = 855;
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(855, "");
      fBProcedureCall0.addParam(855, "-$?");
      FBProcedureParam fBProcedureParam1 = new FBProcedureParam(855, "");
      fBProcedureCall0.addParam(855, "-$?");
      fBProcedureCall0.getSQL(false);
      try { 
        fBProcedureParam0.setValue(fBProcedureCall0);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot set parameter, since it is constant.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureParam", e);
      }
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.4305622903362423
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(36, " oVt xet >nd`");
      fBProcedureParam0.setType(36);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(36, "KQPL6kiZPF");
      int int0 = 2195;
      fBProcedureParam0.setIndex(2195);
      fBProcedureParam1.setIndex(2195);
      fBProcedureCall0.registerOutParam(2195, (-377329872));
      fBProcedureParam0.setType((-377329872));
      fBProcedureParam1.setType((-158534275));
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      try { 
        fBProcedureParam1.setValue(fBProcedureCall1);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot set parameter, since it is constant.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureParam", e);
      }
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.5227336851951891
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      String string0 = " out xet >ndi";
      int int0 = 36;
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(36, " out xet >ndi");
      fBProcedureParam0.setType(36);
      fBProcedureParam0.setIndex(36);
      fBProcedureCall0.addParam(36, "KQPL6kiZPF");
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.getInputParam(36);
      fBProcedureCall0.registerOutParam(36, 1);
      int int1 = 574;
      fBProcedureCall0.registerOutParam(36, 574);
      int int2 = (-563);
      // Undeclared exception!
      try { 
        fBProcedureCall0.addParam((-17), "Ca7not find parameter with the specified position.");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -17
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(3932, "t,Oh!ei?8Y[");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.addParam(3932, "t,Oh!ei?8Y[");
      fBProcedureCall0.mapOutParamIndexToPosition(3932, true);
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      try { 
        fBProcedureCall1.mapOutParamIndexToPosition(887, false);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Specified parameter does not exist.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 33
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1359, "t,Oh!ei?8Y[");
      fBProcedureParam0.setIndex(887);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      assertEquals(1359, fBProcedureParam0.getPosition());
      
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(887, true);
      assertEquals(1, int0);
      
      String string0 = fBProcedureCall0.getSQL(false);
      assertEquals("EXECUTE PROCEDURE null(t,Oh!ei?8Y[)", string0);
      
      fBProcedureCall1.addParam(1, "s:p-PbuWhN");
      int int1 = fBProcedureCall0.mapOutParamIndexToPosition((-1544), true);
      assertEquals((-1544), int1);
      
      FBProcedureCall fBProcedureCall2 = new FBProcedureCall();
      int int2 = fBProcedureCall0.mapOutParamIndexToPosition(2591, true);
      assertEquals(2591, int2);
  }

  /**
  //Test case number: 34
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      String string0 = "t,Oh!ei?8Y[";
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1359, "t,Oh!ei?8Y[");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.addParam(1359, "t,Oh!ei?8Y[");
      fBProcedureCall0.addParam(136, "t,Oh!ei?8Y[");
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
  //Test case number: 35
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = 43;
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(43, " outxet p>nd");
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
  //Test case number: 36
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureParam0.setIndex(3);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(3, "?,5u4");
      fBProcedureParam1.setValue("EuSMPx_w0l#bvM75U");
      fBProcedureCall0.getSQL(true);
      fBProcedureCall0.registerOutParam((-1), (-402));
      assertTrue(FBProcedureCall.OLD_CALLABLE_STATEMENT_COMPATIBILITY);
  }
}
