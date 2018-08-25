/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 07:59:42 GMT 2018
 */

package weka.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedReader;
import java.io.StringReader;
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
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(1096);
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.addElement(1096);
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.addElement(42);
      optimization_DynamicIntArray0.removeAllElements();
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.addElement(1096);
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.removeAllElements();
      // Undeclared exception!
      weka.core.matrix.Matrix.random(42, 1601);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      int int0 = 0;
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(0);
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.addElement(0);
      optimization_DynamicIntArray0.addElement(0);
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.getRevision();
      int int1 = 19;
      optimization_DynamicIntArray0.addElement(19);
      // Undeclared exception!
      try { 
        optimization_DynamicIntArray0.removeElementAt(19);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(0);
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.addElement(0);
      assertEquals(1, optimization_DynamicIntArray0.size());
      
      optimization_DynamicIntArray0.removeElementAt(0);
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.size();
      optimization_DynamicIntArray0.removeAllElements();
      assertEquals(0, optimization_DynamicIntArray0.size());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.796311640173813
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(1578);
      optimization_DynamicIntArray0.getRevision();
      double[][] doubleArray0 = new double[1][6];
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = 1.0E-4;
      doubleArray1[1] = (double) 1578;
      doubleArray1[2] = (double) 1578;
      doubleArray1[3] = (double) 1578;
      doubleArray1[4] = (double) 1578;
      doubleArray0[0] = doubleArray1;
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(doubleArray0);
      boolean[] booleanArray0 = new boolean[9];
      booleanArray0[0] = false;
      booleanArray0[1] = false;
      booleanArray0[2] = false;
      booleanArray0[3] = false;
      booleanArray0[4] = true;
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
  //Test case number: 4
  /*Coverage entropy=1.5810937501718236
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(1111);
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.addElement((-1159));
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.removeAllElements();
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.addElement((-306));
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.removeAllElements();
      optimization_DynamicIntArray0.removeAllElements();
      optimization_DynamicIntArray0.addElement(3);
      optimization_DynamicIntArray0.addElement(586);
      optimization_DynamicIntArray0.removeAllElements();
      optimization_DynamicIntArray0.addElement(3124);
      optimization_DynamicIntArray0.elementAt(977);
      optimization_DynamicIntArray0.getRevision();
      weka.core.matrix.Matrix matrix0 = weka.core.matrix.Matrix.random(1111, 0);
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) 977;
      doubleArray0[1] = (double) 3124;
      boolean[] booleanArray0 = new boolean[1];
      booleanArray0[0] = true;
      // Undeclared exception!
      try { 
        Optimization.solveTriangle(matrix0, doubleArray0, true, booleanArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("weka.core.Optimization", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      weka.core.matrix.Matrix matrix0 = weka.core.matrix.Matrix.identity(0, 0);
      double[] doubleArray0 = new double[3];
      matrix0.toString();
      matrix0.chol();
      boolean[] booleanArray0 = new boolean[8];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      booleanArray0[2] = true;
      booleanArray0[3] = false;
      booleanArray0[4] = true;
      booleanArray0[5] = true;
      booleanArray0[6] = true;
      booleanArray0[7] = true;
      Optimization.solveTriangle(matrix0, doubleArray0, true, booleanArray0);
      Random.setNextRandom((-982));
      Random.setNextRandom(7);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = weka.core.matrix.Matrix.random(0, 0);
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, false, (boolean[]) null);
      assertNotSame(doubleArray0, doubleArray1);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = weka.core.matrix.Matrix.random(5, 5);
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (double) 5;
      doubleArray0[1] = (double) 5;
      doubleArray0[2] = (double) 5;
      doubleArray0[3] = (double) 5;
      doubleArray0[4] = 1.0;
      // Undeclared exception!
      try { 
        Optimization.solveTriangle(matrix0, doubleArray0, true, (boolean[]) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      weka.core.matrix.Matrix.random(0, 0);
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(27, 27);
      double[] doubleArray0 = new double[1];
      boolean[] booleanArray0 = new boolean[2];
      Optimization.solveTriangle(matrix0, doubleArray0, false, booleanArray0);
      Random.setNextRandom((-2391));
  }

  /**
  //Test case number: 9
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      weka.core.matrix.Matrix.random(0, 0);
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(27, 27);
      double[] doubleArray0 = new double[1];
      boolean[] booleanArray0 = new boolean[2];
      Optimization.solveTriangle(matrix0, doubleArray0, true, booleanArray0);
      Random.setNextRandom(27);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = weka.core.matrix.Matrix.identity(0, 0);
      weka.core.matrix.Matrix matrix1 = new weka.core.matrix.Matrix(27, 27);
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      doubleArray0[2] = (double) 27;
      doubleArray0[3] = (double) 27;
      boolean[] booleanArray0 = new boolean[8];
      booleanArray0[0] = false;
      booleanArray0[1] = true;
      booleanArray0[2] = false;
      booleanArray0[3] = false;
      booleanArray0[4] = true;
      booleanArray0[5] = false;
      booleanArray0[6] = true;
      booleanArray0[7] = true;
      double[] doubleArray1 = Optimization.solveTriangle(matrix1, doubleArray0, true, booleanArray0);
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
  //Test case number: 11
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Random.setNextRandom(28);
      weka.core.matrix.Matrix matrix0 = weka.core.matrix.Matrix.identity(28, 28);
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (double) 28;
      doubleArray0[1] = (double) 28;
      doubleArray0[2] = (double) 28;
      doubleArray0[3] = (double) 28;
      doubleArray0[5] = (double) 28;
      doubleArray0[6] = (double) 28;
      doubleArray0[7] = (double) 28;
      boolean[] booleanArray0 = new boolean[8];
      booleanArray0[0] = true;
      booleanArray0[1] = false;
      booleanArray0[2] = false;
      booleanArray0[3] = false;
      booleanArray0[4] = false;
      booleanArray0[5] = false;
      booleanArray0[6] = false;
      booleanArray0[7] = false;
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, false, booleanArray0);
      double[] doubleArray2 = Optimization.solveTriangle(matrix0, doubleArray1, false, booleanArray0);
      assertNotSame(doubleArray2, doubleArray0);
  }
}
