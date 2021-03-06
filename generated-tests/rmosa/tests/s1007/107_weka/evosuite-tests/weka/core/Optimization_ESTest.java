/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 08:21:00 GMT 2018
 */

package weka.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import weka.core.Optimization;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Optimization_ESTest extends Optimization_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.5660857389596289
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(3, 113);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "";
      stringArray0[1] = "type";
      stringArray0[2] = "ridge = ";
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) 113;
      doubleArray0[1] = (double) 3;
      boolean[] booleanArray0 = new boolean[3];
      booleanArray0[0] = false;
      booleanArray0[1] = false;
      booleanArray0[2] = false;
      Optimization.solveTriangle(matrix0, doubleArray0, false, booleanArray0);
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(1);
      Optimization optimization1 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization optimization2 = mock(Optimization.class, CALLS_REAL_METHODS);
      int int0 = (-3326);
      // Undeclared exception!
      try { 
        optimization_DynamicIntArray0.removeElementAt(3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.5660857389596289
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(3, 3);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "";
      stringArray0[1] = "type";
      stringArray0[2] = "ridge = ";
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) 3;
      doubleArray0[1] = (double) 3;
      boolean[] booleanArray0 = new boolean[3];
      booleanArray0[0] = false;
      booleanArray0[1] = false;
      booleanArray0[2] = false;
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, false, booleanArray0);
      assertArrayEquals(new double[] {Double.NaN, Double.POSITIVE_INFINITY}, doubleArray1, 0.01);
      
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(1);
      optimization_DynamicIntArray0.removeAllElements();
      Optimization optimization1 = mock(Optimization.class, CALLS_REAL_METHODS);
      optimization_DynamicIntArray0.removeAllElements();
      assertEquals(0, optimization_DynamicIntArray0.size());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(1007);
      int int0 = optimization_DynamicIntArray0.size();
      assertEquals(0, int0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.5660857389596289
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(3, 113);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "";
      stringArray0[1] = "type";
      stringArray0[2] = "ridge = ";
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) 113;
      doubleArray0[1] = (double) 3;
      boolean[] booleanArray0 = new boolean[3];
      booleanArray0[0] = false;
      booleanArray0[1] = false;
      booleanArray0[2] = false;
      Optimization.solveTriangle(matrix0, doubleArray0, false, booleanArray0);
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(1);
      Optimization optimization1 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization optimization2 = mock(Optimization.class, CALLS_REAL_METHODS);
      optimization_DynamicIntArray0.getRevision();
      Optimization.DynamicIntArray optimization_DynamicIntArray1 = null;
      try {
        optimization_DynamicIntArray1 = optimization2.new DynamicIntArray((-3326));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.Optimization$DynamicIntArray", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.5660857389596289
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(3, 113);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "";
      stringArray0[1] = "type";
      stringArray0[2] = "ridge = ";
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) 113;
      doubleArray0[1] = (double) 3;
      boolean[] booleanArray0 = new boolean[3];
      booleanArray0[0] = false;
      booleanArray0[1] = false;
      booleanArray0[2] = false;
      Optimization.solveTriangle(matrix0, doubleArray0, false, booleanArray0);
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(1);
      optimization_DynamicIntArray0.copy();
      Optimization optimization1 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization optimization2 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray1 = null;
      try {
        optimization_DynamicIntArray1 = optimization2.new DynamicIntArray((-3326));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.Optimization$DynamicIntArray", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(0);
      assertEquals(0, optimization_DynamicIntArray0.size());
      
      optimization_DynamicIntArray0.addElement(0);
      assertEquals(1, optimization_DynamicIntArray0.size());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        Optimization.solveTriangle((weka.core.matrix.Matrix) null, doubleArray0, true, (boolean[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.Optimization", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(0);
      // Undeclared exception!
      try { 
        optimization_DynamicIntArray0.elementAt(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("weka.core.Optimization$DynamicIntArray", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.5660857389596289
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(3, 113);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "";
      stringArray0[1] = "type";
      stringArray0[2] = "ridge = ";
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) 113;
      doubleArray0[1] = (double) 3;
      boolean[] booleanArray0 = new boolean[3];
      booleanArray0[0] = false;
      booleanArray0[1] = false;
      booleanArray0[2] = false;
      Optimization.solveTriangle(matrix0, doubleArray0, false, booleanArray0);
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(1);
      optimization_DynamicIntArray0.addElement(113);
      Optimization optimization1 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization optimization2 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray1 = null;
      try {
        optimization_DynamicIntArray1 = optimization2.new DynamicIntArray((-3326));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.Optimization$DynamicIntArray", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = weka.core.matrix.Matrix.random(17, 17);
      double[] doubleArray0 = new double[1];
      boolean[] booleanArray0 = new boolean[7];
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, true, booleanArray0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertArrayEquals(new double[] {Double.NaN}, doubleArray1, 0.01);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      boolean[] booleanArray0 = new boolean[10];
      weka.core.matrix.Matrix matrix0 = weka.core.matrix.Matrix.random(18, 18);
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, true, booleanArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN}, doubleArray1, 0.01);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(37, 37);
      double[] doubleArray0 = new double[1];
      boolean[] booleanArray0 = new boolean[1];
      booleanArray0[0] = true;
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, true, booleanArray0);
      assertArrayEquals(new double[] {0.0}, doubleArray1, 0.01);
      
      double[] doubleArray2 = Optimization.solveTriangle(matrix0, doubleArray0, false, booleanArray0);
      assertArrayEquals(new double[] {0.0}, doubleArray2, 0.01);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = weka.core.matrix.Matrix.random(3, 3);
      double[] doubleArray0 = new double[10];
      doubleArray0[1] = (double) 113;
      boolean[] booleanArray0 = new boolean[9];
      booleanArray0[1] = true;
      // Undeclared exception!
      try { 
        Optimization.solveTriangle(matrix0, doubleArray0, true, booleanArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(3, 113);
      double[] doubleArray0 = new double[2];
      boolean[] booleanArray0 = new boolean[3];
      booleanArray0[0] = true;
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, false, booleanArray0);
      assertArrayEquals(new double[] {0.0, Double.NaN}, doubleArray1, 0.01);
  }
}
