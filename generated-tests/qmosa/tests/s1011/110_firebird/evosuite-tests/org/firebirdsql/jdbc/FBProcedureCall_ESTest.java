/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 12:50:43 GMT 2018
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
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getName();
      int int0 = 0;
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
  //Test case number: 1
  /*Coverage entropy=2.2718685126965625
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getSQL(true);
      String string0 = fBProcedureCall0.getSQL(true);
      assertEquals("SELECT * FROM null", string0);
      
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(1);
      assertEquals(1, int0);
      
      fBProcedureCall0.getName();
      fBProcedureCall0.getName();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam((-3084));
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      Object object0 = fBProcedureCall0.clone();
      Object object1 = fBProcedureCall0.clone();
      int int1 = fBProcedureCall0.hashCode();
      assertFalse(int1 == int0);
      assertTrue(fBProcedureCall0.equals((Object)object0));
      assertNotSame(fBProcedureCall0, object1);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getOutputParam(37);
      boolean boolean0 = fBProcedureCall0.equals((Object) null);
      assertFalse(boolean0);
      
      fBProcedureCall0.getOutputParams();
      Object object0 = fBProcedureCall0.clone();
      fBProcedureCall0.getOutputParam(0);
      fBProcedureCall0.getInputParams();
      assertNotSame(fBProcedureCall0, object0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName("");
      fBProcedureCall0.mapOutParamIndexToPosition(0);
      int int0 = 1;
      fBProcedureCall0.getSQL(false);
      String string0 = "zpd5P?^f9rNt}";
      fBProcedureCall0.getInputParam(1);
      fBProcedureCall0.mapOutParamIndexToPosition(1);
      fBProcedureCall0.clone();
      fBProcedureCall0.getOutputParam(1);
      boolean boolean0 = false;
      try { 
        fBProcedureCall0.mapOutParamIndexToPosition(1555, false);
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
  /*Coverage entropy=1.4868952268881837
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(0, "Rfl!I6t*WY");
      boolean boolean0 = true;
      boolean boolean1 = false;
      fBProcedureCall0.getSQL(false);
      int int0 = (-405);
      // Undeclared exception!
      try { 
        fBProcedureCall0.getInputParam((-405));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -406
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.7478680974667573
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = 1;
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam(1);
      fBProcedureParam0.clone();
      fBProcedureParam0.setIndex(1);
      fBProcedureCall0.mapOutParamIndexToPosition(1, true);
      Object object0 = null;
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      try { 
        fBProcedureParam0.setValue((Object) null);
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
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getSQL(true);
      fBProcedureCall0.getInputParams();
      fBProcedureCall0.setName("sB?yR(/;");
      fBProcedureCall0.getOutputParam(1687);
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1687, "SELECT * FROM null");
      assertEquals(1687, fBProcedureParam0.getPosition());
      
      fBProcedureCall0.getName();
      String string0 = fBProcedureCall0.getSQL(false);
      assertEquals("EXECUTE PROCEDURE sB?yR(/;(SELECT * FROM null)", string0);
      
      fBProcedureCall0.getSQL(true);
      fBProcedureCall0.setName("sB?yR(/;");
      fBProcedureCall0.hashCode();
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getInputParam(1687);
      assertEquals(0, fBProcedureParam1.getPosition());
      
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      Object object0 = fBProcedureCall0.clone();
      boolean boolean0 = fBProcedureCall0.equals(object0);
      assertTrue(boolean0);
      
      fBProcedureCall0.getName();
      assertNotSame(fBProcedureCall0, object0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.458311329683084
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.mapOutParamIndexToPosition(806, true);
      String string0 = "";
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(2594, "");
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.clone();
      fBProcedureCall0.mapOutParamIndexToPosition(2);
      fBProcedureParam0.clone();
      fBProcedureParam0.setType(3);
      fBProcedureCall0.getOutputParam(887);
      fBProcedureCall0.clone();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.getInputParams();
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      try { 
        fBProcedureCall1.registerOutParam(3, 0);
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
  /*Coverage entropy=2.2102535776209735
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getSQL(true);
      fBProcedureCall0.getInputParams();
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      fBProcedureCall1.setName("sB?yR(/;");
      FBProcedureCall fBProcedureCall2 = new FBProcedureCall();
      fBProcedureCall2.getName();
      fBProcedureCall0.getSQL(true);
      FBProcedureCall fBProcedureCall3 = new FBProcedureCall();
      fBProcedureCall3.getSQL(false);
      FBProcedureCall fBProcedureCall4 = new FBProcedureCall();
      fBProcedureCall4.setName("r4$BE8,Lpc.MM.`4");
      fBProcedureCall4.hashCode();
      fBProcedureCall4.getInputParam(1687);
      assertFalse(fBProcedureCall4.equals((Object)fBProcedureCall3));
      
      FBProcedureCall fBProcedureCall5 = new FBProcedureCall();
      fBProcedureCall5.clone();
      boolean boolean0 = fBProcedureCall3.equals(fBProcedureCall1);
      assertFalse(boolean0);
      
      FBProcedureCall fBProcedureCall6 = new FBProcedureCall();
      fBProcedureCall6.getName();
      assertFalse(fBProcedureCall6.equals((Object)fBProcedureCall1));
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.7478680974667573
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      int int0 = 2;
      fBProcedureParam0.setType(2);
      fBProcedureParam0.clone();
      fBProcedureParam0.setType(2);
      fBProcedureCall0.mapOutParamIndexToPosition((-2885));
      fBProcedureParam0.setIndex(0);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureParam0.clone();
      int int1 = 598;
      fBProcedureCall0.mapOutParamIndexToPosition((-2885), true);
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
  //Test case number: 10
  /*Coverage entropy=1.885449592837785
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.mapOutParamIndexToPosition(1);
      fBProcedureCall0.getOutputParam(626);
      fBProcedureCall0.addParam(2681, "");
      fBProcedureCall0.getInputParam(1);
      try { 
        fBProcedureCall0.registerOutParam(1, 1);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot find parameter with the specified position.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.172911478034337
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getSQL(true);
      fBProcedureCall0.getInputParams();
      fBProcedureCall0.setName("sB?yR(/;");
      fBProcedureCall0.getOutputParam(1687);
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1687, "SELECT * FROM null");
      fBProcedureCall0.getName();
      fBProcedureCall0.getName();
      fBProcedureCall0.getSQL(true);
      fBProcedureCall0.setName("sB?yR(/;");
      fBProcedureCall0.hashCode();
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getInputParam(1687);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      FBProcedureCall fBProcedureCall1 = (FBProcedureCall)fBProcedureCall0.clone();
      fBProcedureCall0.equals(fBProcedureCall1);
      fBProcedureCall0.getName();
      fBProcedureCall1.addParam(1687, "SELECT * FROM sB?yR(/;(SELECT * FROM null)");
      assertTrue(fBProcedureCall1.equals((Object)fBProcedureCall0));
      
      fBProcedureCall1.addOutputParam(fBProcedureParam1);
      assertFalse(fBProcedureCall1.equals((Object)fBProcedureCall0));
      assertNotSame(fBProcedureCall1, fBProcedureCall0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.893119556520245
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(887, "rf");
      fBProcedureCall0.addParam(307, "mE{ZC");
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      fBProcedureCall1.setName("WZ*>-O");
      FBProcedureCall fBProcedureCall2 = new FBProcedureCall();
      fBProcedureCall1.getName();
      fBProcedureCall0.getSQL(false);
      FBProcedureCall fBProcedureCall3 = new FBProcedureCall();
      fBProcedureCall3.getSQL(true);
      FBProcedureCall fBProcedureCall4 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall5 = new FBProcedureCall();
      fBProcedureCall5.setName("mE{ZC");
      fBProcedureCall4.hashCode();
      fBProcedureCall4.getInputParam(887);
      FBProcedureCall fBProcedureCall6 = new FBProcedureCall();
      fBProcedureCall0.clone();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall5.getInputParam(307);
      fBProcedureCall3.equals(fBProcedureParam0);
      assertFalse(fBProcedureCall5.equals((Object)fBProcedureCall4));
      
      FBProcedureCall fBProcedureCall7 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall8 = new FBProcedureCall();
      fBProcedureCall8.getName();
      assertFalse(fBProcedureCall8.equals((Object)fBProcedureCall4));
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.9889488342599533
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.mapOutParamIndexToPosition(4);
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(4, "Dm^zN");
      fBProcedureParam0.clone();
      fBProcedureCall0.setName("rf");
      fBProcedureCall0.addParam(4, "sB?yR(/;");
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      fBProcedureCall1.addParam(2, "kL Fg06>5ppZ");
      FBProcedureCall fBProcedureCall2 = new FBProcedureCall();
      fBProcedureCall2.getName();
      fBProcedureCall0.getSQL(false);
      fBProcedureCall0.getSQL(false);
      fBProcedureCall1.setName("rf");
      fBProcedureCall0.hashCode();
      // Undeclared exception!
      try { 
        fBProcedureCall1.getInputParam((-4563));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -4564
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.2459520807289133
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(1);
      assertEquals(1, int0);
      
      fBProcedureCall0.getInputParams();
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      fBProcedureCall1.setName((String) null);
      FBProcedureCall fBProcedureCall2 = new FBProcedureCall();
      fBProcedureCall1.getName();
      String string0 = fBProcedureCall1.getSQL(false);
      assertEquals("EXECUTE PROCEDURE null", string0);
      
      FBProcedureCall fBProcedureCall3 = new FBProcedureCall();
      boolean boolean0 = fBProcedureCall2.equals(fBProcedureCall1);
      assertTrue(boolean0);
      
      FBProcedureCall fBProcedureCall4 = new FBProcedureCall();
      fBProcedureCall4.setName((String) null);
      fBProcedureCall1.getOutputParam(1);
      fBProcedureCall2.getInputParams();
      String string1 = fBProcedureCall1.getSQL(true);
      assertEquals("SELECT * FROM null", string1);
      
      Object object0 = fBProcedureCall4.clone();
      assertNotSame(object0, fBProcedureCall4);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.488327743368588
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.mapOutParamIndexToPosition(4);
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(4, "Dm^zN");
      FBProcedureParam fBProcedureParam1 = (FBProcedureParam)fBProcedureParam0.clone();
      FBProcedureParam fBProcedureParam2 = new FBProcedureParam(4, "Dm^zN");
      fBProcedureParam2.setType(4);
      fBProcedureCall0.addOutputParam(fBProcedureParam2);
      fBProcedureParam1.clone();
      fBProcedureCall0.mapOutParamIndexToPosition(4, true);
      fBProcedureCall0.addInputParam(fBProcedureParam1);
      fBProcedureCall0.setName("");
      fBProcedureCall0.getOutputParam((-954));
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      fBProcedureCall0.getSQL(true);
      fBProcedureCall0.clone();
      try { 
        fBProcedureCall0.registerOutParam(1046, (-954));
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
  /*Coverage entropy=1.6674619334292946
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getOutputParam(4);
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      fBProcedureCall1.addParam(1350, "vqs}}K<(FK>{");
      fBProcedureCall1.registerOutParam((-1), 1767);
      assertTrue(FBProcedureCall.OLD_CALLABLE_STATEMENT_COMPATIBILITY);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.110016553375461
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getOutputParam(18);
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(18, "SoI`j");
      fBProcedureParam0.setIndex(1627);
      fBProcedureParam0.setType(396);
      fBProcedureParam0.clone();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.registerOutParam(1627, 1627);
      fBProcedureCall0.mapOutParamIndexToPosition(63);
      fBProcedureCall0.clone();
      fBProcedureCall0.getSQL(false);
      fBProcedureCall0.addParam(470, "EXECUTE PROCEDURE");
      fBProcedureCall0.getInputParam(1322);
      fBProcedureCall0.getSQL(false);
      // Undeclared exception!
      try { 
        fBProcedureCall0.addParam((-32688997), "EXECUTE PROCEDURE");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -32688997
         //
         verifyException("java.util.Vector", e);
      }
  }
}
