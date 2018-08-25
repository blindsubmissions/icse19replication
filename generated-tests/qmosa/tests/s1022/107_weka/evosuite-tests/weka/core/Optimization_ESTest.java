/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 14:25:39 GMT 2018
 */

package weka.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
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
      int int0 = 31;
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(31);
      optimization_DynamicIntArray0.addElement(31);
      optimization_DynamicIntArray0.removeAllElements();
      optimization_DynamicIntArray0.removeAllElements();
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.getRevision();
      // Undeclared exception!
      try { 
        optimization_DynamicIntArray0.removeElementAt(31);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(1);
      optimization_DynamicIntArray0.removeAllElements();
      optimization_DynamicIntArray0.addElement(1);
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.removeAllElements();
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.addElement(26);
      optimization_DynamicIntArray0.addElement(0);
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.addElement((-2428));
      optimization_DynamicIntArray0.copy();
      assertEquals(3, optimization_DynamicIntArray0.size());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      int int0 = 140;
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(140);
      optimization_DynamicIntArray0.size();
      optimization_DynamicIntArray0.copy();
      int int1 = 0;
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.addElement(0);
      // Undeclared exception!
      try { 
        optimization_DynamicIntArray0.elementAt(140);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 140
         //
         verifyException("weka.core.Optimization$DynamicIntArray", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(7);
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.size();
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.getRevision();
      double[][] doubleArray0 = new double[6][3];
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = (double) 7;
      doubleArray1[1] = (double) 7;
      doubleArray1[2] = (double) 7;
      doubleArray1[3] = (double) 0;
      doubleArray1[4] = (double) 7;
      doubleArray1[5] = (double) 0;
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[4];
      doubleArray2[0] = (double) 0;
      doubleArray2[1] = (-468.59162144);
      doubleArray2[2] = (double) 0;
      doubleArray2[3] = (double) 0;
      doubleArray0[1] = doubleArray2;
      double[] doubleArray3 = new double[2];
      doubleArray3[0] = (-468.59162144);
      doubleArray3[1] = (-468.59162144);
      doubleArray0[2] = doubleArray3;
      double[] doubleArray4 = new double[6];
      doubleArray4[0] = (double) 7;
      doubleArray4[1] = (double) 0;
      doubleArray4[2] = (-468.59162144);
      doubleArray4[3] = (double) 0;
      doubleArray4[4] = 3.0;
      doubleArray4[5] = (-468.59162144);
      doubleArray0[3] = doubleArray4;
      double[] doubleArray5 = new double[9];
      doubleArray5[0] = 3.0;
      doubleArray5[1] = (double) 0;
      doubleArray5[2] = (double) 7;
      doubleArray5[3] = (double) 0;
      doubleArray5[4] = (-468.59162144);
      doubleArray5[5] = 3.0;
      doubleArray5[6] = 3.0;
      doubleArray5[7] = (double) 7;
      doubleArray5[8] = (-468.59162144);
      doubleArray0[4] = doubleArray5;
      double[] doubleArray6 = new double[3];
      doubleArray6[0] = (double) 7;
      doubleArray6[1] = (double) 0;
      doubleArray6[2] = 1718.003366038594;
      doubleArray0[5] = doubleArray6;
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(doubleArray0, (-429), (-429));
      boolean[] booleanArray0 = new boolean[4];
      booleanArray0[0] = false;
      booleanArray0[1] = false;
      booleanArray0[2] = false;
      booleanArray0[3] = false;
      // Undeclared exception!
      try { 
        Optimization.solveTriangle(matrix0, doubleArray4, false, booleanArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("weka.core.Optimization", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[][] doubleArray0 = new double[1][7];
      double[] doubleArray1 = new double[10];
      doubleArray1[0] = 1434.435832322;
      doubleArray1[1] = (-1277.01);
      doubleArray1[2] = 1.0000000002328306;
      doubleArray1[3] = (-2117.0);
      doubleArray1[4] = 3347.955;
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(doubleArray0);
      boolean[] booleanArray0 = new boolean[7];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      booleanArray0[2] = true;
      booleanArray0[3] = true;
      booleanArray0[4] = true;
      booleanArray0[5] = true;
      booleanArray0[6] = false;
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
  //Test case number: 5
  /*Coverage entropy=1.6674619334292946
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(12);
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.addElement(12);
      optimization_DynamicIntArray0.getRevision();
      StringReader stringReader0 = new StringReader("Type: ");
      stringReader0.mark(12);
      weka.core.matrix.Matrix matrix0 = weka.core.matrix.Matrix.random(12, 12);
      double[] doubleArray0 = new double[0];
      boolean[] booleanArray0 = new boolean[4];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      booleanArray0[2] = true;
      booleanArray0[3] = true;
      Optimization.solveTriangle(matrix0, doubleArray0, true, booleanArray0);
      optimization_DynamicIntArray0.removeAllElements();
      Optimization optimization1 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray1 = null;
      try {
        optimization_DynamicIntArray1 = optimization1.new DynamicIntArray((-3));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.Optimization$DynamicIntArray", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      weka.core.matrix.Matrix.random(41, 41);
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (double) 41;
      doubleArray0[1] = (double) 41;
      doubleArray0[2] = (double) 41;
      doubleArray0[3] = (double) 41;
      double[][] doubleArray1 = new double[1][4];
      doubleArray1[0] = doubleArray0;
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(doubleArray1, 0, 40);
      boolean[] booleanArray0 = new boolean[5];
      booleanArray0[0] = false;
      booleanArray0[1] = true;
      booleanArray0[2] = false;
      booleanArray0[3] = true;
      booleanArray0[4] = false;
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
  //Test case number: 7
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[][] doubleArray0 = new double[0][0];
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(doubleArray0, 4332, 4332);
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = (double) (-1);
      doubleArray1[1] = (double) (-1);
      doubleArray1[2] = (double) 4332;
      doubleArray1[3] = (double) (-1);
      doubleArray1[4] = (double) 4332;
      // Undeclared exception!
      try { 
        Optimization.solveTriangle(matrix0, doubleArray1, false, (boolean[]) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.4750763110546947
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(12);
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.addElement(12);
      optimization_DynamicIntArray0.getRevision();
      assertEquals(1, optimization_DynamicIntArray0.size());
      
      StringReader stringReader0 = new StringReader("Type: ");
      stringReader0.mark(12);
      weka.core.matrix.Matrix matrix0 = weka.core.matrix.Matrix.random(12, 12);
      boolean[] booleanArray0 = new boolean[4];
      booleanArray0[0] = true;
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) 12;
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, false, booleanArray0);
      assertArrayEquals(new double[] {0.0}, doubleArray1, 0.01);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[][] doubleArray0 = new double[4][7];
      double[] doubleArray1 = new double[2];
      doubleArray1[0] = (double) (-429);
      doubleArray0[1] = doubleArray1;
      double[] doubleArray2 = new double[1];
      doubleArray2[0] = (double) (-429);
      doubleArray0[1] = doubleArray2;
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(doubleArray0, (-429), 25);
      weka.core.matrix.Matrix matrix1 = new weka.core.matrix.Matrix(25, 4);
      boolean[] booleanArray0 = new boolean[2];
      booleanArray0[0] = false;
      booleanArray0[1] = false;
      double[] doubleArray3 = Optimization.solveTriangle(matrix1, doubleArray1, false, booleanArray0);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN}, doubleArray3, 0.01);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[][] doubleArray0 = new double[4][7];
      double[] doubleArray1 = new double[2];
      doubleArray0[1] = doubleArray1;
      double[] doubleArray2 = new double[1];
      doubleArray0[1] = doubleArray2;
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(25, 4);
      boolean[] booleanArray0 = new boolean[2];
      weka.core.matrix.Matrix matrix1 = new weka.core.matrix.Matrix(doubleArray0, 152, 4);
      double[] doubleArray3 = Optimization.solveTriangle(matrix0, doubleArray1, true, booleanArray0);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray1, 0.01);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN}, doubleArray3, 0.01);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(1820, 1820);
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (double) 1820;
      doubleArray0[1] = (double) 1820;
      doubleArray0[2] = (-2454.1);
      doubleArray0[3] = (double) 1820;
      doubleArray0[4] = (double) 1820;
      boolean[] booleanArray0 = new boolean[10];
      booleanArray0[0] = false;
      booleanArray0[1] = false;
      booleanArray0[2] = true;
      booleanArray0[3] = false;
      booleanArray0[4] = false;
      booleanArray0[5] = false;
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, false, booleanArray0);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, 0.0, Double.NaN, Double.POSITIVE_INFINITY}, doubleArray1, 0.01);
  }
}