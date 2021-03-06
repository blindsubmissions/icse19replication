/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 10:43:47 GMT 2018
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
import org.junit.runner.RunWith;
import weka.core.Optimization;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Optimization_ESTest extends Optimization_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(306);
      optimization_DynamicIntArray0.removeAllElements();
      optimization_DynamicIntArray0.size();
      int int0 = optimization_DynamicIntArray0.size();
      assertEquals(0, int0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.7478680974667573
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      int int0 = 0;
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(0);
      optimization_DynamicIntArray0.addElement(0);
      optimization_DynamicIntArray0.removeAllElements();
      optimization_DynamicIntArray0.addElement(0);
      optimization_DynamicIntArray0.addElement(2469);
      optimization_DynamicIntArray0.addElement((-1320));
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.removeAllElements();
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.addElement(0);
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.getRevision();
      int int1 = (-83);
      optimization_DynamicIntArray0.addElement(200);
      // Undeclared exception!
      try { 
        optimization_DynamicIntArray0.removeElementAt((-1320));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(200);
      optimization_DynamicIntArray0.addElement(28);
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.removeElementAt(0);
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.removeAllElements();
      optimization_DynamicIntArray0.addElement(200);
      optimization_DynamicIntArray0.removeAllElements();
      weka.core.matrix.Matrix matrix0 = weka.core.matrix.Matrix.random(20, 28);
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (-601.0);
      doubleArray0[1] = 2245.482;
      doubleArray0[2] = (double) 20;
      doubleArray0[3] = (double) 200;
      doubleArray0[4] = 1.0625;
      boolean[] booleanArray0 = new boolean[3];
      booleanArray0[0] = false;
      booleanArray0[1] = false;
      booleanArray0[2] = false;
      // Undeclared exception!
      try { 
        Optimization.solveTriangle(matrix0, doubleArray0, false, booleanArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("weka.core.Optimization", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(5784);
      optimization_DynamicIntArray0.getRevision();
      // Undeclared exception!
      try { 
        optimization_DynamicIntArray0.elementAt(5784);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5784
         //
         verifyException("weka.core.Optimization$DynamicIntArray", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(2593);
      Optimization.DynamicIntArray optimization_DynamicIntArray1 = (Optimization.DynamicIntArray)optimization_DynamicIntArray0.copy();
      assertEquals(0, optimization_DynamicIntArray1.size());
      
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(2593, 2593);
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 1.0625;
      doubleArray0[1] = (double) 2593;
      doubleArray0[2] = 1.0000000000000142;
      doubleArray0[3] = 1.0625;
      doubleArray0[4] = 1.0625;
      doubleArray0[5] = 1.0625;
      doubleArray0[6] = 1.0625;
      boolean[] booleanArray0 = new boolean[8];
      booleanArray0[0] = false;
      booleanArray0[1] = true;
      booleanArray0[2] = true;
      booleanArray0[3] = true;
      booleanArray0[4] = false;
      booleanArray0[5] = false;
      booleanArray0[6] = false;
      booleanArray0[7] = true;
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, true, booleanArray0);
      assertArrayEquals(new double[] {Double.POSITIVE_INFINITY, 0.0, 0.0, 0.0, Double.NaN, Double.NaN, Double.NaN}, doubleArray1, 0.01);
      assertArrayEquals(new double[] {1.0625, 2593.0, 1.0000000000000142, 1.0625, 1.0625, 1.0625, 1.0625}, doubleArray0, 0.01);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(306);
      optimization_DynamicIntArray0.removeAllElements();
      double[][] doubleArray0 = new double[2][6];
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = (double) 306;
      doubleArray1[1] = (double) 306;
      doubleArray1[2] = (double) 306;
      doubleArray1[3] = (double) 306;
      doubleArray1[4] = (double) 306;
      doubleArray1[5] = (double) 306;
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[6];
      doubleArray2[0] = (double) 306;
      doubleArray2[1] = (double) 306;
      doubleArray2[2] = (double) 306;
      doubleArray2[3] = (double) 306;
      doubleArray2[4] = (double) 306;
      doubleArray2[5] = (double) 306;
      doubleArray0[1] = doubleArray2;
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(doubleArray0, (-139), 2377);
      boolean[] booleanArray0 = new boolean[3];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      booleanArray0[2] = true;
      // Undeclared exception!
      try { 
        Optimization.solveTriangle(matrix0, doubleArray1, true, booleanArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("weka.core.Optimization", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.6674619334292948
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(200);
      optimization_DynamicIntArray0.addElement(28);
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.removeElementAt(0);
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.removeAllElements();
      optimization_DynamicIntArray0.addElement(200);
      optimization_DynamicIntArray0.removeAllElements();
      weka.core.matrix.Matrix.random(20, 28);
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (-601.0);
      doubleArray0[1] = 2245.482;
      double[][] doubleArray1 = new double[5][6];
      double[] doubleArray2 = new double[0];
      doubleArray1[0] = doubleArray2;
      doubleArray1[1] = doubleArray0;
      doubleArray1[2] = doubleArray0;
      doubleArray1[3] = doubleArray0;
      doubleArray1[4] = doubleArray0;
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(doubleArray1, 32, 200);
      boolean[] booleanArray0 = new boolean[7];
      booleanArray0[0] = false;
      double[] doubleArray3 = Optimization.solveTriangle(matrix0, doubleArray2, false, booleanArray0);
      assertEquals(0, doubleArray3.length);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(2593);
      optimization_DynamicIntArray0.copy();
      double[][] doubleArray0 = new double[1][6];
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = (double) 2377;
      doubleArray1[1] = (double) 2593;
      doubleArray1[2] = 1.0625;
      doubleArray1[3] = (double) 2593;
      doubleArray1[4] = 1.0625;
      doubleArray1[5] = 1.0625;
      doubleArray1[6] = (double) 2377;
      doubleArray0[0] = doubleArray1;
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(doubleArray0, 2593, (-126));
      boolean[] booleanArray0 = new boolean[9];
      booleanArray0[0] = false;
      booleanArray0[1] = false;
      booleanArray0[2] = false;
      booleanArray0[3] = false;
      booleanArray0[4] = false;
      booleanArray0[5] = false;
      booleanArray0[6] = false;
      booleanArray0[7] = false;
      booleanArray0[8] = false;
      // Undeclared exception!
      try { 
        Optimization.solveTriangle(matrix0, doubleArray1, false, booleanArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(200);
      assertEquals(0, optimization_DynamicIntArray0.size());
      
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(200, 2475);
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (double) 200;
      doubleArray0[1] = (double) 200;
      doubleArray0[2] = (double) 10;
      doubleArray0[3] = 310.9002250224;
      doubleArray0[4] = (-3147.1);
      doubleArray0[5] = (double) 2475;
      doubleArray0[6] = 310.9002250224;
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, false, (boolean[]) null);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.POSITIVE_INFINITY}, doubleArray1, 0.01);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.45056120886630463
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(306);
      double[][] doubleArray0 = new double[2][6];
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = (double) 306;
      doubleArray1[1] = (double) 306;
      doubleArray1[2] = (double) 306;
      doubleArray1[3] = (double) 306;
      doubleArray1[4] = (double) 306;
      doubleArray1[5] = (double) 306;
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(doubleArray0);
      boolean[] booleanArray0 = new boolean[7];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      booleanArray0[2] = true;
      booleanArray0[3] = false;
      booleanArray0[4] = false;
      booleanArray0[5] = true;
      booleanArray0[6] = true;
      // Undeclared exception!
      try { 
        Optimization.solveTriangle(matrix0, doubleArray1, false, booleanArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Random.setNextRandom((-3533));
      Random.setNextRandom((-3533));
      Random.setNextRandom(136);
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(298, 10);
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (double) 298;
      doubleArray0[1] = 310.9002250224;
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
      assertArrayEquals(new double[] {298.0, 310.9002250224, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray1, 0.01);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.34883209584303193
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(200);
      assertEquals(0, optimization_DynamicIntArray0.size());
      
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(1639, 2749);
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (double) 1639;
      doubleArray0[1] = (double) 2749;
      doubleArray0[2] = (double) 10;
      doubleArray0[3] = 310.9002250224;
      doubleArray0[4] = (-3147.1);
      doubleArray0[5] = (-192.0);
      doubleArray0[6] = (double) 1639;
      doubleArray0[7] = (double) 1639;
      doubleArray0[8] = (double) 10;
      boolean[] booleanArray0 = new boolean[9];
      booleanArray0[0] = false;
      booleanArray0[1] = false;
      booleanArray0[2] = false;
      booleanArray0[3] = false;
      booleanArray0[4] = false;
      booleanArray0[5] = false;
      booleanArray0[6] = false;
      booleanArray0[7] = true;
      booleanArray0[8] = false;
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, false, booleanArray0);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN, 0.0, Double.POSITIVE_INFINITY}, doubleArray1, 0.01);
  }
}
