/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 10:08:11 GMT 2018
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
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = 667;
      fBProcedureCall0.mapOutParamIndexToPosition(667);
      fBProcedureCall0.getInputParam(667);
      try { 
        fBProcedureCall0.registerOutParam(667, 667);
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
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.hashCode();
      fBProcedureCall0.setName("");
      fBProcedureCall0.setName("nZUA");
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam(0);
      assertEquals(0, fBProcedureParam0.getPosition());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = 0;
      fBProcedureCall0.mapOutParamIndexToPosition(0);
      int int1 = 3;
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(3, "Exception. ");
      fBProcedureParam0.setType((-180));
      fBProcedureParam0.setType(3);
      fBProcedureParam0.setIndex((-180));
      fBProcedureParam0.clone();
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.getInputParams();
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
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = 0;
      fBProcedureCall0.mapOutParamIndexToPosition(0, true);
      fBProcedureCall0.getName();
      fBProcedureCall0.getName();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getInputParam(4333);
      fBProcedureParam0.clone();
      fBProcedureParam0.setIndex(0);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.clone();
      fBProcedureCall0.equals((Object) null);
      fBProcedureCall0.clone();
      fBProcedureCall0.equals((Object) null);
      fBProcedureCall0.getOutputParams();
      fBProcedureCall0.getOutputParam(0);
      fBProcedureCall0.setName((String) null);
      try { 
        fBProcedureCall0.mapOutParamIndexToPosition((-434), false);
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
  /*Coverage entropy=1.4750763110546947
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = 0;
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(0, "");
      fBProcedureParam0.clone();
      fBProcedureParam0.setType((-2183));
      fBProcedureCall0.addInputParam(fBProcedureParam0);
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
  //Test case number: 5
  /*Coverage entropy=1.6987829895138011
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(0, "CH`");
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam(325);
      fBProcedureParam0.clone();
      fBProcedureParam0.setType(0);
      fBProcedureParam0.setIndex((-1));
      fBProcedureParam0.setIndex(0);
      fBProcedureCall0.getSQL(false);
      fBProcedureCall0.equals(fBProcedureParam0);
      String string0 = fBProcedureCall0.getName();
      assertNull(string0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.3114234446919735
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName("HY105");
      int int0 = 682;
      String string0 = "FjF&+~S14x=;7)xU";
      boolean boolean0 = true;
      fBProcedureCall0.getSQL(true);
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(682, "FjF&+~S14x=;7)xU");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.mapOutParamIndexToPosition(40);
      try { 
        fBProcedureCall0.registerOutParam(682, 2206);
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
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      Object object0 = fBProcedureCall0.clone();
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      boolean boolean0 = fBProcedureCall0.equals(fBProcedureCall1);
      assertTrue(boolean0);
      
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(3, true);
      assertEquals(3, int0);
      
      String string0 = fBProcedureCall0.getSQL(true);
      assertNotSame(fBProcedureCall0, object0);
      assertEquals("SELECT * FROM null", string0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.6216679171123505
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(2272, "");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureParam0.setType(2272);
      fBProcedureParam0.setType(0);
      List<FBProcedureParam> list0 = fBProcedureCall0.getInputParams();
      assertEquals(2273, list0.size());
      
      fBProcedureParam0.setType(2272);
      Object object0 = fBProcedureCall0.clone();
      assertTrue(object0.equals((Object)fBProcedureCall0));
      
      String string0 = fBProcedureCall0.getSQL(true);
      assertEquals("SELECT * FROM null", string0);
      
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      assertEquals(2272, fBProcedureParam0.getPosition());
      
      fBProcedureCall0.setName("Cannot set parameter, since it is constant.");
      assertNotSame(fBProcedureCall0, object0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.6114722042607261
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = 0;
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam(0);
      fBProcedureParam0.setType(0);
      fBProcedureParam0.setIndex(0);
      fBProcedureParam0.clone();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.clone();
      fBProcedureParam0.clone();
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
  /*Coverage entropy=2.17157089695751
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.setName("AX0kQo`)7KE#}MC");
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(0, "Cannot find parameter with the specified position.");
      int int0 = 0;
      fBProcedureCall0.getOutputParam(0);
      fBProcedureParam1.setIndex(0);
      FBProcedureParam fBProcedureParam2 = fBProcedureCall0.getInputParam(63);
      fBProcedureCall0.clone();
      fBProcedureCall0.addOutputParam(fBProcedureParam2);
      fBProcedureCall0.addInputParam(fBProcedureParam1);
      fBProcedureCall0.hashCode();
      fBProcedureCall0.getOutputParam(63);
      boolean boolean0 = false;
      fBProcedureCall0.addOutputParam(fBProcedureParam1);
      try { 
        fBProcedureCall0.mapOutParamIndexToPosition(1, false);
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
  /*Coverage entropy=1.6798011671138111
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(0, "");
      fBProcedureCall0.getSQL(true);
      fBProcedureCall0.getName();
      fBProcedureCall0.getInputParams();
      fBProcedureCall0.getInputParam(3);
      fBProcedureCall0.getSQL(false);
      fBProcedureCall0.getSQL(false);
      fBProcedureCall0.setName("p^\"!=Ql");
      fBProcedureCall0.getSQL(true);
      fBProcedureCall0.addParam(0, "EXECUTE PROCEDURE null(, null)");
      fBProcedureCall0.setName("EXECUTE PROCEDURE null(, null)");
      assertTrue(FBProcedureCall.OLD_CALLABLE_STATEMENT_COMPATIBILITY);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam((-1));
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
  //Test case number: 13
  /*Coverage entropy=2.0844297682153505
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = (-1);
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam((-1));
      fBProcedureParam0.clone();
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      int int1 = 3;
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(3, "}8YlRzfDtj");
      fBProcedureCall0.getOutputParam(1);
      FBProcedureParam fBProcedureParam2 = fBProcedureCall0.getOutputParam(0);
      fBProcedureParam1.setType(1742);
      fBProcedureCall0.addInputParam(fBProcedureParam1);
      fBProcedureCall0.addParam(0, "c:;),'tSTxj");
      fBProcedureCall0.addOutputParam(fBProcedureParam2);
      fBProcedureCall0.mapOutParamIndexToPosition(0);
      fBProcedureCall0.mapOutParamIndexToPosition(0);
      fBProcedureCall0.getOutputParam(3);
      fBProcedureCall0.registerOutParam((-1), 37);
      // Undeclared exception!
      try { 
        fBProcedureCall0.registerOutParam(0, 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.2102535776209735
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName("org.firebirdsql.jdbc.FBProcedureCall");
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      fBProcedureCall0.getInputParam(40);
      fBProcedureCall1.getSQL(false);
      fBProcedureCall1.setName("org.firebirdsql.jdbc.FBProcedureCall");
      FBProcedureParam fBProcedureParam0 = fBProcedureCall1.addParam(1688, "h{}(1)>dj=~+kK6:6;");
      fBProcedureParam0.setIndex((-3988));
      fBProcedureCall1.getSQL(true);
      fBProcedureParam0.setType((-3988));
      fBProcedureParam0.clone();
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureParam0.clone();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      FBProcedureCall fBProcedureCall2 = new FBProcedureCall();
      fBProcedureCall1.registerOutParam((-3988), 1688);
      fBProcedureCall0.clone();
      // Undeclared exception!
      try { 
        fBProcedureCall2.getInputParam((-3988));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3989
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.7478680974667575
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      Object object0 = fBProcedureCall0.clone();
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(37);
      assertEquals(37, int0);
      
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall1.addParam(2168, "iN+$|N/qGW,");
      assertEquals("iN+$|N/qGW,", fBProcedureParam0.getParamValue());
      assertEquals(2168, fBProcedureParam0.getPosition());
      
      fBProcedureCall0.mapOutParamIndexToPosition(1, true);
      assertNotSame(fBProcedureCall0, object0);
      
      fBProcedureCall1.getInputParam(2224);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall1.getInputParam(37);
      assertEquals(0, fBProcedureParam1.getPosition());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      assertTrue(fBProcedureCall1.equals((Object)fBProcedureCall0));
      
      fBProcedureCall1.addParam(3141, "01S00");
      fBProcedureCall0.setName("01S00");
      fBProcedureCall0.equals(fBProcedureCall1);
      boolean boolean0 = fBProcedureCall0.equals(fBProcedureCall1);
      assertFalse(fBProcedureCall1.equals((Object)fBProcedureCall0));
      assertFalse(boolean0);
  }
}
