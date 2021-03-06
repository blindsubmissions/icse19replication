/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 15:18:19 GMT 2018
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
  /*Coverage entropy=1.7478680974667573
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam(322);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(0);
      assertEquals(0, int0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.3030924037617193
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.mapOutParamIndexToPosition(0);
      String string0 = "V";
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(0, "V");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
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
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getSQL(false);
      List<FBProcedureParam> list0 = fBProcedureCall0.getOutputParams();
      assertEquals(0, list0.size());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.2110688711446103
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName(";c");
      fBProcedureCall0.mapOutParamIndexToPosition(0);
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam(63);
      fBProcedureCall0.mapOutParamIndexToPosition(2551);
      fBProcedureCall0.clone();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
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
  //Test case number: 4
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = 0;
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(0, "07001");
      fBProcedureParam0.setType(0);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.addParam(0, "07001");
      fBProcedureCall0.clone();
      fBProcedureCall0.hashCode();
      try { 
        fBProcedureCall0.registerOutParam(2663, 41);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot find parameter with the specified position.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.8688627696075708
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName("|[|vc7");
      fBProcedureCall0.clone();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(0, "");
      fBProcedureParam0.setIndex((-4904));
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.addParam(671, "TlT{{HY~");
      fBProcedureCall0.getSQL(true);
      fBProcedureCall0.setName("%t");
      fBProcedureCall0.mapOutParamIndexToPosition(1483, true);
      fBProcedureCall0.getSQL(true);
      fBProcedureCall0.getOutputParam((-4904));
      fBProcedureCall0.mapOutParamIndexToPosition((-1), true);
      // Undeclared exception!
      try { 
        fBProcedureCall0.addParam((-4904), "TlT{{HY~");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -4904
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.711845135233912
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = 31;
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getInputParam(31);
      fBProcedureCall0.getInputParam(1);
      fBProcedureCall0.hashCode();
      fBProcedureCall0.getOutputParams();
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
  //Test case number: 7
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getInputParam(567);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getOutputParam(567);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.addInputParam(fBProcedureParam1);
      boolean boolean0 = true;
      int int0 = 0;
      fBProcedureParam1.setIndex(0);
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
  //Test case number: 8
  /*Coverage entropy=1.6674619334292946
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam(2313);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getInputParam(2314);
      fBProcedureParam1.clone();
      fBProcedureParam1.clone();
      fBProcedureParam1.setType(2314);
      fBProcedureCall0.addOutputParam(fBProcedureParam1);
      fBProcedureCall0.addOutputParam(fBProcedureParam1);
      assertFalse(fBProcedureParam1.isValueSet());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      boolean boolean0 = fBProcedureCall0.equals("08S01");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getName();
      fBProcedureCall0.hashCode();
      fBProcedureCall0.getName();
      int int0 = 2489;
      boolean boolean0 = false;
      FBProcedureParam fBProcedureParam0 = null;
      try {
        fBProcedureParam0 = new FBProcedureParam((-1125), (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureParam", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.9061547465398496
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName("a");
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall1.getOutputParam(0);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.getOutputParams();
      FBProcedureParam fBProcedureParam1 = new FBProcedureParam();
      fBProcedureCall0.addInputParam(fBProcedureParam1);
      fBProcedureCall0.hashCode();
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.1500602244842355
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName(";c");
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam(63);
      fBProcedureCall0.mapOutParamIndexToPosition(2551);
      fBProcedureCall0.clone();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
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
  //Test case number: 13
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName("|[|vc7");
      FBProcedureCall fBProcedureCall1 = (FBProcedureCall)fBProcedureCall0.clone();
      fBProcedureCall1.getSQL(true);
      fBProcedureCall1.setName("|[|vc7");
      FBProcedureParam fBProcedureParam0 = fBProcedureCall1.getInputParam(1127);
      fBProcedureCall1.addInputParam(fBProcedureParam0);
      fBProcedureCall0.mapOutParamIndexToPosition(1618, true);
      fBProcedureCall1.getInputParam(1);
      fBProcedureCall0.getInputParams();
      FBProcedureCall fBProcedureCall2 = new FBProcedureCall();
      fBProcedureCall2.hashCode();
      fBProcedureCall1.hashCode();
      // Undeclared exception!
      try { 
        fBProcedureCall2.registerOutParam((-716), 41);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -717
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      Object object0 = fBProcedureCall0.clone();
      fBProcedureCall0.equals(object0);
      int int0 = (-3119);
      // Undeclared exception!
      try { 
        fBProcedureCall0.addParam((-3119), "08007");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3119
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.5030658660713345
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName("rq3jp* k<^/");
      fBProcedureCall0.clone();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(37, "|[|vc7");
      fBProcedureParam0.setIndex(0);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(18, "|[|vc7");
      assertEquals(18, fBProcedureParam1.getPosition());
      
      String string0 = fBProcedureCall0.getSQL(true);
      assertEquals("SELECT * FROM rq3jp* k<^/(|[|vc7, |[|vc7)", string0);
      
      fBProcedureCall0.setName("'w*Q");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.clone();
      Object object0 = fBProcedureCall0.clone();
      assertTrue(object0.equals((Object)fBProcedureCall0));
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName("|[|vc7");
      Object object0 = fBProcedureCall0.clone();
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall2 = new FBProcedureCall();
      Object object1 = fBProcedureCall2.clone();
      boolean boolean0 = fBProcedureCall0.equals(object1);
      assertNotSame(object1, fBProcedureCall2);
      assertTrue(fBProcedureCall0.equals((Object)object0));
      assertFalse(object1.equals((Object)fBProcedureCall0));
      assertTrue(boolean0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.893788232391138
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall1 = (FBProcedureCall)fBProcedureCall0.clone();
      fBProcedureCall1.setName("{j");
      fBProcedureCall1.getSQL(true);
      fBProcedureCall0.equals(fBProcedureCall1);
      int int0 = (-3110);
      String string0 = "08007";
      // Undeclared exception!
      try { 
        fBProcedureCall1.registerOutParam((-3110), (-3110));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3111
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.0982737395252498
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = 787;
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(787, "b*//%ga/cy#O$y6\"/^");
      fBProcedureParam0.setIndex(40);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.mapOutParamIndexToPosition(63);
      fBProcedureCall0.getSQL(true);
      FBProcedureParam fBProcedureParam1 = new FBProcedureParam(3536, "ceG$smxX?F'6");
      fBProcedureCall0.addOutputParam(fBProcedureParam1);
      fBProcedureCall0.getInputParam(877);
      // Undeclared exception!
      fBProcedureCall0.registerOutParam(877, 877);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.16597649534005
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName("|[|vc7");
      FBProcedureCall fBProcedureCall1 = (FBProcedureCall)fBProcedureCall0.clone();
      fBProcedureCall1.clone();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(0, "");
      int int0 = (-4904);
      fBProcedureParam0.setType((-4904));
      fBProcedureParam0.setIndex((-4904));
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      String string0 = "TlT{{HY~";
      fBProcedureCall0.addParam(671, "TlT{{HY~");
      fBProcedureCall0.getSQL(true);
      fBProcedureCall0.setName("%t");
      fBProcedureCall0.mapOutParamIndexToPosition(1483, true);
      fBProcedureCall0.getSQL(true);
      fBProcedureCall0.registerOutParam((-4904), 4457);
      fBProcedureCall0.getOutputParam((-4904));
      fBProcedureCall0.mapOutParamIndexToPosition((-1), true);
      try { 
        fBProcedureCall0.registerOutParam(1483, (-1652));
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
  /*Coverage entropy=2.2102535776209735
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName("|[|vc7");
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(0, "|[|vc7");
      fBProcedureParam0.setType((-4904));
      fBProcedureParam0.clone();
      fBProcedureParam0.setIndex((-4904));
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(671, "|[|vc7");
      fBProcedureCall0.getSQL(true);
      fBProcedureCall0.registerOutParam((-4904), (-4904));
      fBProcedureParam1.setIndex((-4904));
      fBProcedureCall0.getSQL(false);
      fBProcedureCall0.setName("SELECT * FROM |[|vc7(|[|vc7, |[|vc7)");
      fBProcedureCall0.addOutputParam(fBProcedureParam1);
      assertEquals(671, fBProcedureParam1.getPosition());
      
      FBProcedureCall fBProcedureCall1 = (FBProcedureCall)fBProcedureCall0.clone();
      FBProcedureCall fBProcedureCall2 = (FBProcedureCall)fBProcedureCall0.clone();
      fBProcedureCall0.addParam(671, "z!+1TZ.3c1iy#;b$^");
      assertNotSame(fBProcedureCall0, fBProcedureCall2);
      
      fBProcedureCall1.registerOutParam((-4904), 678);
      assertTrue(fBProcedureCall0.equals((Object)fBProcedureCall2));
      assertFalse(fBProcedureCall1.equals((Object)fBProcedureCall0));
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.7151961557867998
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getSQL(true);
      int int0 = 18;
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(18, "yh#dc8?L");
      fBProcedureParam0.clone();
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getInputParam(18);
      fBProcedureParam0.setType(2);
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      fBProcedureCall0.addOutputParam(fBProcedureParam1);
      fBProcedureCall1.clone();
      // Undeclared exception!
      try { 
        fBProcedureCall0.getSQL(true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: 18
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=2.1334472209998223
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName("<wR=`-SHk.tr_");
      fBProcedureCall0.clone();
      fBProcedureCall0.clone();
      boolean boolean0 = true;
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(31, "?E a/oPOZo^#");
      fBProcedureParam0.setType(0);
      fBProcedureParam0.setIndex(31);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.addParam(19, "");
      fBProcedureCall0.getSQL(true);
      fBProcedureCall0.setName("07001");
      fBProcedureCall0.mapOutParamIndexToPosition((-5229), true);
      fBProcedureCall0.getSQL(true);
      int int0 = 4457;
      try { 
        fBProcedureCall0.registerOutParam(671, 671);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot find parameter with the specified position.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.935797152425074
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getSQL(true);
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(18, "yh#dc8?L");
      fBProcedureParam0.setIndex(18);
      fBProcedureParam0.clone();
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getInputParam(18);
      fBProcedureParam0.setType(18);
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      fBProcedureCall0.addOutputParam(fBProcedureParam1);
      FBProcedureCall fBProcedureCall2 = (FBProcedureCall)fBProcedureCall1.clone();
      fBProcedureCall0.getSQL(true);
      fBProcedureCall2.addParam(1689, "SELECT * FROM null(yh#dc8?L)");
      try { 
        fBProcedureCall2.registerOutParam(18, (-192));
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot find parameter with the specified position.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }
}
