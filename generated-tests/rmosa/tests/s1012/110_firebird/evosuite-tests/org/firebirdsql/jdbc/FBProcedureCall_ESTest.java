/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 10:34:14 GMT 2018
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
  /*Coverage entropy=0.9404479886553263
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(1624, "pxt=J{uE>m;`bW4kf/");
      fBProcedureCall0.getOutputParam(1624);
      fBProcedureCall0.addParam(1, "pxt=J{uE>m;`bW4kf/");
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(3, "pxt=J{uE>m;`bW4kf/");
      assertEquals(3, fBProcedureParam0.getPosition());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.3422673044417013
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      String string0 = "in-b";
      fBProcedureCall0.addParam(37, "Out$45)CRn&Y[MeDj");
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      fBProcedureCall1.addParam(37, "in-b");
      FBProcedureCall fBProcedureCall2 = new FBProcedureCall();
      fBProcedureCall2.addParam(37, "Out$45)CRn&Y[MeDj");
      int int0 = (-1);
      fBProcedureCall0.registerOutParam((-1), (-2017));
      // Undeclared exception!
      try { 
        fBProcedureCall2.addParam((-1913), "HY00");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1913
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      List<FBProcedureParam> list0 = fBProcedureCall0.getOutputParams();
      assertEquals(0, list0.size());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.6837389058487535
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName("pxt=J{uE>m;`bW4kf/");
      fBProcedureCall0.addParam(1624, "pxt=J{uE>m;`bW4kf/");
      fBProcedureCall0.addParam(1, "pxt=J{uE>m;`bW4kf/");
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(3, "pxt=J{uE>m;`bW4kf/");
      assertEquals(3, fBProcedureParam0.getPosition());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.9404479886553263
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(1624, "pxt=J{uE>m;`bW4kf/");
      fBProcedureCall0.addParam(1, "pxt=J{uE>m;`bW4kf/");
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(1);
      assertEquals(1, int0);
      
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(3, "pxt=J{uE>m;`bW4kf/");
      assertEquals(3, fBProcedureParam0.getPosition());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.6837389058487535
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      String string0 = "pxt=J{uE>\\m;`bW4kf/";
      fBProcedureCall0.addParam(1624, "pxt=J{uE>m;`bW4kf/");
      try { 
        fBProcedureCall0.mapOutParamIndexToPosition(1624, false);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Specified parameter does not exist.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName("Ouws$45)CRn&Y[MeDj");
      fBProcedureCall0.hashCode();
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.6837389058487535
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      String string0 = fBProcedureCall0.getSQL(false);
      assertEquals("EXECUTE PROCEDURE null", string0);
      
      fBProcedureCall0.addParam(1624, "pxt=J{uE>m;`bW4kf/");
      fBProcedureCall0.addParam(1, "pxt=J{uE>m;`bW4kf/");
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(3, "pxt=J{uE>m;`bW4kf/");
      assertEquals(3, fBProcedureParam0.getPosition());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.6837389058487535
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getSQL(true);
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      // Undeclared exception!
      try { 
        fBProcedureCall1.addParam((-1995), "in-b");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1995
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.37677016125643675
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(1624, "pxt=J{uE>m;`bW4kf/");
      fBProcedureCall0.addParam(1624, "9H");
      fBProcedureCall0.addParam(1, "pxt=J{uE>m;`bW4kf/");
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(3, "pxt=J{uE>m;`bW4kf/");
      assertEquals(3, fBProcedureParam0.getPosition());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.2275294114572126
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = (-1820);
      String string0 = "jn[hMh)H";
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam((-1820));
      int int1 = 1686;
      try { 
        fBProcedureParam0.setValue("jn[hMh)H");
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
  /*Coverage entropy=0.6837389058487535
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      String string0 = "pxt=J{uE>\\m;`bW4kf/";
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam((-713), "pxt=J{uE>m;`bW4kf/");
      // Undeclared exception!
      try { 
        fBProcedureCall0.addOutputParam(fBProcedureParam0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -713
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
      List<FBProcedureParam> list0 = fBProcedureCall0.getInputParams();
      assertTrue(list0.isEmpty());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      boolean boolean0 = fBProcedureCall0.equals("%Ec~Z%eJ$S$");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.6837389058487535
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(927, "Rd$^cawQ\"mjU");
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.addParam(1624, "pxt=J{uE>m;`bW4kf/");
      fBProcedureCall0.addParam(1, "pxt=J{uE>m;`bW4kf/");
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(3, "pxt=J{uE>m;`bW4kf/");
      assertEquals(3, fBProcedureParam1.getPosition());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      boolean boolean0 = fBProcedureCall0.equals(fBProcedureCall1);
      assertTrue(boolean0);
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
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(927, "Rd$^cawQ\"mjU");
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
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
  //Test case number: 18
  /*Coverage entropy=0.6837389058487535
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1624, "pxt=J{uE>m;`bW4kf/");
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      assertEquals(1624, fBProcedureParam0.getPosition());
      
      fBProcedureCall0.addParam(1, "pxt=J{uE>m;`bW4kf/");
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(3, "pxt=J{uE>m;`bW4kf/");
      assertEquals(3, fBProcedureParam1.getPosition());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      String string0 = fBProcedureCall0.getName();
      assertNull(string0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.9404479886553263
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.addParam(1624, "pxt=J{uE>m;`bW4kf/");
      fBProcedureCall0.addParam(1, "pxt=J{uE>m;`bW4kf/");
      Object object0 = fBProcedureCall0.clone();
      assertTrue(object0.equals((Object)fBProcedureCall0));
      
      fBProcedureCall0.addParam(3, "pxt=J{uE>m;`bW4kf/");
      fBProcedureCall0.addParam(3, "pxt=J{uE>m;`bW4kf/");
      assertNotSame(fBProcedureCall0, object0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.6837389058487535
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(1624, "pxt=J{uE>m;`bW4kf/");
      String string0 = fBProcedureCall0.getSQL(true);
      assertEquals("SELECT * FROM null(pxt=J{uE>m;`bW4kf/)", string0);
      
      fBProcedureCall0.addParam(1, "pxt=J{uE>m;`bW4kf/");
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(3, "pxt=J{uE>m;`bW4kf/");
      assertEquals(3, fBProcedureParam0.getPosition());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.9404479886553263
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(1624, "pxt=J{uE>m;`bW4kf/");
      fBProcedureCall0.addParam(1, "pxt=J{uE>m;`bW4kf/");
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(3, "pxt=J{uE>m;`bW4kf/");
      assertEquals(3, fBProcedureParam0.getPosition());
      
      fBProcedureCall0.getInputParam(1738);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getInputParam(1);
      assertEquals(0, fBProcedureParam1.getPosition());
      
      FBProcedureParam fBProcedureParam2 = fBProcedureCall0.getInputParam(2);
      assertEquals(0, fBProcedureParam2.getPosition());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(67, "07001");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.clone();
      // Undeclared exception!
      try { 
        fBProcedureCall0.addParam((-4023), "07001");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -4023
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(1624, "pxt=J{uE>m;`bW4kf/");
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1, "pxt=J{uE>m;`bW4kf/");
      assertEquals(1, fBProcedureParam0.getPosition());
      
      String string0 = fBProcedureCall0.getSQL(true);
      assertEquals("SELECT * FROM null(pxt=J{uE>m;`bW4kf/, pxt=J{uE>m;`bW4kf/)", string0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.7356219397587946
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(9, "a?wFKWH");
      String string0 = fBProcedureCall0.getSQL(true);
      assertEquals("SELECT * FROM null(a?wFKWH)", string0);
      
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(37, "OusrQ45)CRnY[e$j");
      assertEquals(37, fBProcedureParam0.getPosition());
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      String string0 = "GG^tmsvZxKA#?7\\";
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1, "GG^tmsvZxKA#?7");
      fBProcedureParam0.setValue("GG^tmsvZxKA#?7");
      fBProcedureParam0.clone();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
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
  //Test case number: 27
  /*Coverage entropy=0.9672604429127742
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1, "GG^tmsvZxKA#?7");
      fBProcedureCall0.getSQL(true);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      String string0 = fBProcedureCall0.getSQL(true);
      assertEquals("SELECT * FROM null(GG^tmsvZxKA#?7)", string0);
      
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(1760, "L->qqrCfl<W");
      assertEquals(1760, fBProcedureParam1.getPosition());
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName("exc");
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      boolean boolean0 = fBProcedureCall0.equals(fBProcedureCall1);
      assertFalse(fBProcedureCall1.equals((Object)fBProcedureCall0));
      assertTrue(boolean0);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getSQL(true);
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1, "GG^tmsvZxKA#?7");
      fBProcedureParam0.setValue("GG^tmsvZxKA#?7");
      assertEquals(1, fBProcedureParam0.getPosition());
      
      String string0 = fBProcedureCall0.getSQL(true);
      assertEquals("SELECT * FROM null(GG^tmsvZxKA#?7)", string0);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName("in");
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      boolean boolean0 = fBProcedureCall1.equals(fBProcedureCall0);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(1827, "GG^tmsvZxKA#?7");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.addParam(1, "GG^tmsvZxKA#?7");
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
  //Test case number: 32
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1, "GG^tmsvZxKA#?7");
      fBProcedureParam0.setValue("GG^tmsvZxKA#?7");
      fBProcedureParam0.setIndex(1);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(1);
      assertEquals(1, int0);
      
      fBProcedureCall0.addParam(1, "GG^tmsvZxKA#?7");
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(1, "GG^tmsvZxKA#?7");
      assertEquals(1, fBProcedureParam1.getPosition());
  }

  /**
  //Test case number: 33
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1, "Gtmsv~xKA#?7");
      fBProcedureParam0.clone();
      fBProcedureParam0.setValue(fBProcedureParam0);
      assertEquals(1, fBProcedureParam0.getPosition());
      
      fBProcedureCall0.registerOutParam((-1), 1);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getInputParam(1);
      assertFalse(fBProcedureParam1.isParam());
  }

  /**
  //Test case number: 34
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(38, " not set and ");
      fBProcedureParam0.setIndex(38);
      fBProcedureCall0.registerOutParam(38, 0);
      fBProcedureParam0.setIndex(2394);
      fBProcedureCall0.registerOutParam(2394, (-1033));
      assertNull(fBProcedureCall0.getName());
  }
}