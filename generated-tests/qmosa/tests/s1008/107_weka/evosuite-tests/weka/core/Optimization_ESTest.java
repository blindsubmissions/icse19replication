/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 10:20:57 GMT 2018
 */

package weka.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import weka.core.Optimization;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Optimization_ESTest extends Optimization_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      int int0 = 0;
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(0);
      optimization_DynamicIntArray0.addElement(0);
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.addElement((-1));
      optimization_DynamicIntArray0.removeAllElements();
      // Undeclared exception!
      try { 
        optimization_DynamicIntArray0.removeElementAt(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(6);
      optimization_DynamicIntArray0.addElement(0);
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.removeAllElements();
      optimization_DynamicIntArray0.addElement(2933);
      int int0 = optimization_DynamicIntArray0.size();
      assertEquals(1, int0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.7478680974667573
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(200);
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.removeAllElements();
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.addElement(200);
      optimization_DynamicIntArray0.removeAllElements();
      optimization_DynamicIntArray0.addElement(0);
      assertEquals(1, optimization_DynamicIntArray0.size());
      
      optimization_DynamicIntArray0.removeAllElements();
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(0, 200);
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (-61.320512456);
      doubleArray0[1] = (double) 200;
      doubleArray0[2] = (double) 0;
      doubleArray0[3] = (double) 0;
      doubleArray0[4] = (double) 200;
      doubleArray0[5] = (double) 0;
      doubleArray0[6] = (double) 200;
      doubleArray0[7] = (double) 0;
      boolean[] booleanArray0 = new boolean[9];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      booleanArray0[2] = true;
      booleanArray0[3] = true;
      booleanArray0[4] = true;
      booleanArray0[5] = true;
      booleanArray0[6] = true;
      booleanArray0[7] = true;
      booleanArray0[8] = true;
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, true, booleanArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray1, 0.01);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(0);
      // Undeclared exception!
      try { 
        optimization_DynamicIntArray0.elementAt(200);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 200
         //
         verifyException("weka.core.Optimization$DynamicIntArray", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.5810937501718236
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(200);
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.removeAllElements();
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.addElement(200);
      optimization_DynamicIntArray0.removeAllElements();
      optimization_DynamicIntArray0.addElement(0);
      optimization_DynamicIntArray0.removeAllElements();
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(0, 200);
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (-61.320512456);
      doubleArray0[1] = (double) 200;
      doubleArray0[2] = (double) 0;
      doubleArray0[3] = (double) 0;
      doubleArray0[4] = (double) 200;
      doubleArray0[5] = (double) 0;
      doubleArray0[6] = (double) 200;
      doubleArray0[7] = (double) 0;
      boolean[] booleanArray0 = new boolean[9];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      booleanArray0[2] = true;
      booleanArray0[3] = true;
      booleanArray0[4] = true;
      booleanArray0[5] = true;
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
  //Test case number: 5
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(1939, 14);
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = (double) 2365;
      doubleArray0[1] = (double) 14;
      boolean[] booleanArray0 = new boolean[7];
      booleanArray0[3] = false;
      booleanArray0[2] = false;
      booleanArray0[3] = true;
      booleanArray0[4] = false;
      booleanArray0[5] = false;
      booleanArray0[6] = false;
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, false, booleanArray0);
      assertArrayEquals(new double[] {Double.NaN, Double.POSITIVE_INFINITY}, doubleArray1, 0.01);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(1939, 14);
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 1.0000000000582077;
      doubleArray0[1] = (double) 14;
      doubleArray0[2] = 2.0;
      doubleArray0[3] = (double) 1939;
      doubleArray0[4] = (double) 2365;
      doubleArray0[5] = 1065.05;
      doubleArray0[6] = (double) 14;
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, true, (boolean[]) null);
      assertArrayEquals(new double[] {Double.POSITIVE_INFINITY, Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN}, doubleArray1, 0.01);
      assertArrayEquals(new double[] {1.0000000000582077, 14.0, 2.0, 1939.0, 2365.0, 1065.05, 14.0}, doubleArray0, 0.01);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.2265558156134033
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(200);
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.removeAllElements();
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.addElement(200);
      optimization_DynamicIntArray0.removeAllElements();
      optimization_DynamicIntArray0.removeAllElements();
      optimization_DynamicIntArray0.addElement(200);
      assertEquals(1, optimization_DynamicIntArray0.size());
      
      optimization_DynamicIntArray0.removeAllElements();
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(200, 200);
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (-61.320512456);
      doubleArray0[1] = (double) 200;
      doubleArray0[2] = (double) 200;
      doubleArray0[3] = (double) 200;
      doubleArray0[4] = (double) 200;
      doubleArray0[5] = (double) 200;
      doubleArray0[6] = (double) 200;
      doubleArray0[7] = (double) 200;
      boolean[] booleanArray0 = new boolean[9];
      booleanArray0[0] = true;
      booleanArray0[2] = true;
      booleanArray0[3] = true;
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      booleanArray0[4] = true;
      booleanArray0[6] = true;
      booleanArray0[7] = true;
      booleanArray0[8] = true;
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, true, booleanArray0);
      assertArrayEquals(new double[] {0.0, Double.POSITIVE_INFINITY, 0.0, 0.0, 0.0, Double.NaN, 0.0, 0.0}, doubleArray1, 0.01);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(5, 5);
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 2351;
      doubleArray0[1] = (double) 12;
      doubleArray0[2] = (double) 12;
      boolean[] booleanArray0 = new boolean[3];
      booleanArray0[0] = false;
      booleanArray0[1] = true;
      booleanArray0[2] = false;
      Optimization.solveTriangle(matrix0, doubleArray0, false, booleanArray0);
      Random.setNextRandom(5);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(200, 200);
      double[] doubleArray0 = new double[0];
      boolean[] booleanArray0 = new boolean[3];
      booleanArray0[0] = false;
      booleanArray0[1] = false;
      booleanArray0[2] = false;
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, false, booleanArray0);
      assertNotSame(doubleArray1, doubleArray0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(0, 2365);
      double[] doubleArray0 = new double[6];
      boolean[] booleanArray0 = new boolean[9];
      booleanArray0[0] = false;
      booleanArray0[1] = false;
      booleanArray0[2] = false;
      booleanArray0[3] = false;
      booleanArray0[4] = false;
      booleanArray0[5] = true;
      booleanArray0[6] = false;
      booleanArray0[7] = false;
      booleanArray0[8] = false;
      // Undeclared exception!
      try { 
        Optimization.solveTriangle(matrix0, doubleArray0, false, booleanArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
