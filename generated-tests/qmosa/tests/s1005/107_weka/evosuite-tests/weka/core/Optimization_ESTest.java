/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 09:34:58 GMT 2018
 */

package weka.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
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
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      int int0 = 0;
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(0);
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.copy();
      // Undeclared exception!
      try { 
        optimization_DynamicIntArray0.removeElementAt(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(0);
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.removeAllElements();
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.getRevision();
      // Undeclared exception!
      try { 
        optimization_DynamicIntArray0.removeElementAt(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      int int0 = 2;
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(2);
      optimization_DynamicIntArray0.addElement(2);
      // Undeclared exception!
      try { 
        optimization_DynamicIntArray0.removeElementAt(2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(30);
      // Undeclared exception!
      try { 
        optimization_DynamicIntArray0.elementAt(30);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 30
         //
         verifyException("weka.core.Optimization$DynamicIntArray", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      int int0 = 0;
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(0);
      optimization_DynamicIntArray0.addElement(200);
      optimization_DynamicIntArray0.removeAllElements();
      optimization_DynamicIntArray0.removeAllElements();
      // Undeclared exception!
      try { 
        optimization_DynamicIntArray0.removeElementAt(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      int int0 = 200;
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(200);
      optimization_DynamicIntArray0.size();
      optimization_DynamicIntArray0.removeAllElements();
      optimization_DynamicIntArray0.addElement(0);
      optimization_DynamicIntArray0.addElement(0);
      // Undeclared exception!
      try { 
        optimization_DynamicIntArray0.removeElementAt(200);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      int int0 = 7;
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(7);
      weka.core.matrix.Matrix matrix0 = null;
      double[] doubleArray0 = new double[3];
      boolean boolean0 = false;
      boolean[] booleanArray0 = null;
      // Undeclared exception!
      try { 
        Optimization.solveTriangle((weka.core.matrix.Matrix) null, doubleArray0, false, (boolean[]) null);
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
  /*Coverage entropy=0.796311640173813
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(7);
      double[] doubleArray0 = new double[3];
      optimization_DynamicIntArray0.addElement(0);
      doubleArray0[0] = (double) 7;
      doubleArray0[1] = (double) 7;
      doubleArray0[2] = (double) 7;
      boolean[] booleanArray0 = new boolean[4];
      booleanArray0[0] = true;
      booleanArray0[1] = false;
      booleanArray0[2] = true;
      booleanArray0[3] = false;
      // Undeclared exception!
      try { 
        Optimization.solveTriangle((weka.core.matrix.Matrix) null, doubleArray0, false, booleanArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.Optimization", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[][] doubleArray0 = new double[6][3];
      double[] doubleArray1 = new double[2];
      doubleArray1[0] = (-471.41505667939);
      doubleArray1[1] = 3046.8365376493;
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[3];
      doubleArray2[0] = 3046.8365376493;
      doubleArray2[1] = 3046.8365376493;
      doubleArray2[2] = (-471.41505667939);
      doubleArray0[1] = doubleArray2;
      double[] doubleArray3 = new double[5];
      doubleArray3[0] = 3046.8365376493;
      doubleArray3[1] = (-471.41505667939);
      doubleArray3[2] = 1.0000000004656613;
      doubleArray3[3] = 3046.8365376493;
      doubleArray3[4] = 3046.8365376493;
      doubleArray0[2] = doubleArray3;
      double[] doubleArray4 = new double[8];
      doubleArray4[0] = (-471.41505667939);
      doubleArray4[1] = (-471.41505667939);
      doubleArray4[2] = (-471.41505667939);
      doubleArray4[3] = 1.0000000004656613;
      doubleArray4[4] = (-471.41505667939);
      doubleArray4[5] = 863.2470623482362;
      doubleArray4[6] = 1.0000000004656613;
      doubleArray4[7] = (-471.41505667939);
      doubleArray0[3] = doubleArray4;
      double[] doubleArray5 = new double[8];
      doubleArray5[0] = 2.28;
      doubleArray5[1] = 863.2470623482362;
      doubleArray5[2] = 1.0000000004656613;
      doubleArray5[3] = 863.2470623482362;
      doubleArray5[4] = (-1788.8010379494);
      doubleArray5[5] = 863.2470623482362;
      doubleArray5[6] = 863.2470623482362;
      doubleArray5[7] = 1.0000000004656613;
      doubleArray0[4] = doubleArray5;
      double[] doubleArray6 = new double[6];
      doubleArray6[0] = 3046.8365376493;
      doubleArray6[1] = 2.28;
      doubleArray6[2] = 1.0000000004656613;
      doubleArray6[3] = 3046.8365376493;
      doubleArray6[4] = 2.28;
      doubleArray6[5] = 863.2470623482362;
      doubleArray0[5] = doubleArray6;
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(doubleArray0, 10, 10);
      boolean[] booleanArray0 = new boolean[8];
      booleanArray0[0] = false;
      booleanArray0[1] = false;
      booleanArray0[2] = false;
      booleanArray0[3] = false;
      booleanArray0[4] = false;
      booleanArray0[5] = true;
      booleanArray0[6] = false;
      booleanArray0[7] = false;
      double[] doubleArray7 = Optimization.solveTriangle(matrix0, doubleArray2, false, booleanArray0);
      assertArrayEquals(new double[] {(-3518.2515926903766), (-71.9386538511201), (-471.41505645987024)}, doubleArray7, 0.01);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.4750763110546947
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(7);
      optimization_DynamicIntArray0.copy();
      Optimization optimization1 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray1 = optimization1.new DynamicIntArray(7);
      optimization_DynamicIntArray1.getRevision();
      optimization_DynamicIntArray0.removeAllElements();
      String string0 = optimization_DynamicIntArray0.getRevision();
      assertEquals(0, optimization_DynamicIntArray0.size());
      assertEquals("8076", string0);
      
      Optimization optimization2 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray2 = optimization2.new DynamicIntArray(2);
      Optimization.DynamicIntArray optimization_DynamicIntArray3 = (Optimization.DynamicIntArray)optimization_DynamicIntArray1.copy();
      assertEquals(0, optimization_DynamicIntArray3.size());
      assertNotSame(optimization_DynamicIntArray3, optimization_DynamicIntArray1);
      
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) 7;
      doubleArray0[1] = (double) 2;
      boolean[] booleanArray0 = new boolean[4];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      booleanArray0[2] = true;
      booleanArray0[3] = true;
      double[] doubleArray1 = Optimization.solveTriangle((weka.core.matrix.Matrix) null, doubleArray0, true, booleanArray0);
      assertArrayEquals(new double[] {7.0, 2.0}, doubleArray0, 0.01);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray1, 0.01);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 0.9;
      doubleArray0[1] = (-220.021535840701);
      doubleArray0[2] = 1.0000000037252903;
      doubleArray0[3] = 0.1;
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(87, 511);
      boolean[] booleanArray0 = new boolean[5];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      booleanArray0[4] = true;
      // Undeclared exception!
      try { 
        Optimization.solveTriangle(matrix0, doubleArray0, true, booleanArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("weka.core.Optimization", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 0.9;
      doubleArray0[1] = (-220.021535840701);
      doubleArray0[0] = 1.0000000037252903;
      doubleArray0[3] = 0.1;
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(87, 511);
      boolean[] booleanArray0 = new boolean[8];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      booleanArray0[4] = false;
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, true, booleanArray0);
      assertArrayEquals(new double[] {0.0, 0.0, Double.NaN, Double.NaN, Double.NaN, Double.NaN}, doubleArray1, 0.01);
      assertArrayEquals(new double[] {1.0000000037252903, (-220.021535840701), 0.0, 0.1, 0.0, 0.0}, doubleArray0, 0.01);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(27, 27);
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-3119.36);
      doubleArray0[1] = 0.1;
      boolean[] booleanArray0 = new boolean[8];
      booleanArray0[0] = true;
      booleanArray0[1] = false;
      booleanArray0[2] = false;
      booleanArray0[3] = true;
      booleanArray0[4] = false;
      booleanArray0[5] = false;
      booleanArray0[6] = false;
      booleanArray0[7] = false;
      matrix0.toString();
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, false, booleanArray0);
      assertEquals(2, doubleArray1.length);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(0);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "");
      weka.core.matrix.Matrix matrix0 = null;
      optimization_DynamicIntArray0.addElement((-3004));
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 1.0;
      boolean[] booleanArray0 = new boolean[9];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      booleanArray0[2] = false;
      booleanArray0[3] = true;
      booleanArray0[4] = false;
      booleanArray0[5] = false;
      booleanArray0[6] = false;
      booleanArray0[7] = false;
      booleanArray0[8] = false;
      Optimization.solveTriangle((weka.core.matrix.Matrix) null, doubleArray0, false, booleanArray0);
      Optimization optimization1 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray1 = null;
      try {
        optimization_DynamicIntArray1 = optimization1.new DynamicIntArray((-3004));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.Optimization$DynamicIntArray", e);
      }
  }
}