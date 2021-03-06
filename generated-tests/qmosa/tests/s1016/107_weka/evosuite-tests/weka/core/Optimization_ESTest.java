/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 12:40:40 GMT 2018
 */

package weka.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
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
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(0);
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.addElement(0);
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.removeAllElements();
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.addElement(0);
      optimization_DynamicIntArray0.removeElementAt(0);
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.copy();
      assertEquals(0, optimization_DynamicIntArray0.size());
      
      optimization_DynamicIntArray0.addElement(7);
      assertEquals(1, optimization_DynamicIntArray0.size());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(3233);
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.addElement((-1690));
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.removeAllElements();
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.removeAllElements();
      optimization_DynamicIntArray0.addElement(3233);
      optimization_DynamicIntArray0.removeElementAt(0);
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.size();
      // Undeclared exception!
      try { 
        optimization_DynamicIntArray0.removeElementAt(145);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(1241);
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.addElement(0);
      optimization_DynamicIntArray0.removeElementAt(0);
      optimization_DynamicIntArray0.removeAllElements();
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.elementAt(0);
      optimization_DynamicIntArray0.removeAllElements();
      optimization_DynamicIntArray0.addElement(0);
      weka.core.matrix.Matrix matrix0 = weka.core.matrix.Matrix.random(37, 2);
      double[] doubleArray0 = new double[0];
      boolean[] booleanArray0 = new boolean[3];
      booleanArray0[0] = false;
      booleanArray0[1] = false;
      booleanArray0[2] = false;
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, false, booleanArray0);
      assertNotSame(doubleArray1, doubleArray0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(29);
      double[][] doubleArray0 = new double[1][9];
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = (double) 29;
      doubleArray1[1] = (double) 29;
      doubleArray1[2] = (double) 29;
      doubleArray1[3] = (double) 29;
      doubleArray1[4] = (double) 29;
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(doubleArray0, 3233, 933);
      boolean[] booleanArray0 = new boolean[7];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      booleanArray0[2] = true;
      booleanArray0[3] = true;
      booleanArray0[4] = false;
      booleanArray0[5] = true;
      booleanArray0[6] = true;
      // Undeclared exception!
      try { 
        Optimization.solveTriangle(matrix0, doubleArray1, true, booleanArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.9730014063936125
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(1241);
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.addElement(0);
      optimization_DynamicIntArray0.removeElementAt(0);
      optimization_DynamicIntArray0.removeAllElements();
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.elementAt(0);
      optimization_DynamicIntArray0.removeAllElements();
      optimization_DynamicIntArray0.addElement(0);
      weka.core.matrix.Matrix matrix0 = weka.core.matrix.Matrix.random(37, 2);
      double[] doubleArray0 = new double[0];
      boolean[] booleanArray0 = new boolean[4];
      booleanArray0[0] = false;
      booleanArray0[1] = true;
      booleanArray0[2] = true;
      booleanArray0[3] = true;
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, true, booleanArray0);
      assertArrayEquals(new double[] {}, doubleArray1, 0.01);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.7356219397587946
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(29);
      optimization_DynamicIntArray0.removeAllElements();
      optimization_DynamicIntArray0.removeAllElements();
      double[][] doubleArray0 = new double[1][9];
      optimization_DynamicIntArray0.removeAllElements();
      assertEquals(0, optimization_DynamicIntArray0.size());
      
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(doubleArray0, 87, 1);
      double[] doubleArray1 = new double[1];
      doubleArray1[0] = (double) 29;
      double[] doubleArray2 = Optimization.solveTriangle(matrix0, doubleArray1, false, (boolean[]) null);
      assertArrayEquals(new double[] {Double.POSITIVE_INFINITY}, doubleArray2, 0.01);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.7356219397587946
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(29);
      optimization_DynamicIntArray0.removeAllElements();
      double[] doubleArray0 = new double[5];
      doubleArray0[1] = (double) 29;
      double[][] doubleArray1 = new double[5][1];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      doubleArray1[2] = doubleArray0;
      double[] doubleArray2 = new double[9];
      doubleArray2[0] = (double) 29;
      doubleArray2[1] = (double) 55;
      doubleArray2[2] = (double) 29;
      doubleArray2[3] = (double) 55;
      doubleArray2[5] = (double) 29;
      doubleArray2[6] = (double) 55;
      doubleArray2[7] = (double) 55;
      doubleArray2[8] = (double) 55;
      doubleArray1[3] = doubleArray2;
      doubleArray1[4] = doubleArray0;
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(doubleArray1, 889, (-1703));
      double[] doubleArray3 = Optimization.solveTriangle(matrix0, doubleArray0, true, (boolean[]) null);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN}, doubleArray3, 0.01);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.7937300551584248
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(29);
      optimization_DynamicIntArray0.addElement(5975);
      optimization_DynamicIntArray0.removeAllElements();
      optimization_DynamicIntArray0.removeAllElements();
      assertEquals(0, optimization_DynamicIntArray0.size());
      
      double[][] doubleArray0 = new double[5][9];
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(doubleArray0, (-2306), 5975);
      double[] doubleArray1 = new double[3];
      doubleArray1[0] = (double) 5975;
      doubleArray1[1] = 0.5;
      doubleArray1[2] = (double) (-2306);
      double[] doubleArray2 = Optimization.solveTriangle(matrix0, doubleArray1, false, (boolean[]) null);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NEGATIVE_INFINITY}, doubleArray2, 0.01);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.6001660731596457
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(29);
      optimization_DynamicIntArray0.removeAllElements();
      assertEquals(0, optimization_DynamicIntArray0.size());
      
      double[] doubleArray0 = new double[5];
      doubleArray0[1] = (double) 29;
      weka.core.matrix.Matrix matrix0 = weka.core.matrix.Matrix.random(29, 29);
      boolean[] booleanArray0 = new boolean[8];
      booleanArray0[0] = true;
      booleanArray0[1] = false;
      booleanArray0[2] = false;
      booleanArray0[3] = true;
      booleanArray0[3] = true;
      booleanArray0[5] = false;
      booleanArray0[6] = false;
      booleanArray0[7] = false;
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, true, booleanArray0);
      assertArrayEquals(new double[] {0.0, Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY, 0.0, Double.NaN}, doubleArray1, 0.01);
      assertArrayEquals(new double[] {0.0, 29.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix((double[][]) null, 4924, 4924);
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) 4924;
      doubleArray0[1] = (double) 4924;
      boolean[] booleanArray0 = new boolean[9];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      booleanArray0[2] = true;
      booleanArray0[3] = false;
      booleanArray0[4] = true;
      booleanArray0[5] = true;
      booleanArray0[6] = true;
      booleanArray0[7] = true;
      booleanArray0[8] = false;
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, false, booleanArray0);
      assertNotSame(doubleArray0, doubleArray1);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.0437938808441543
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(19);
      optimization_DynamicIntArray0.addElement(5975);
      optimization_DynamicIntArray0.removeAllElements();
      optimization_DynamicIntArray0.removeAllElements();
      weka.core.matrix.Matrix matrix0 = weka.core.matrix.Matrix.identity(12, 17);
      optimization_DynamicIntArray0.getRevision();
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) 19;
      doubleArray0[1] = 1.0000000001164153;
      doubleArray0[2] = (-1197.96);
      doubleArray0[3] = (double) 5975;
      boolean[] booleanArray0 = new boolean[6];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      booleanArray0[2] = false;
      booleanArray0[3] = true;
      booleanArray0[4] = false;
      booleanArray0[5] = false;
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, false, booleanArray0);
      assertArrayEquals(new double[] {0.0, 0.0, (-1197.96), 0.0}, doubleArray1, 0.01);
  }
}
