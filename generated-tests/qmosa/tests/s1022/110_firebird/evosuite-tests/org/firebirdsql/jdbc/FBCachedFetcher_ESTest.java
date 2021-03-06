/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 15:40:52 GMT 2018
 */

package org.firebirdsql.jdbc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Comparator;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.firebirdsql.gds.XSQLVAR;
import org.firebirdsql.gds.impl.jni.isc_stmt_handle_impl;
import org.firebirdsql.jdbc.FBCachedFetcher;
import org.firebirdsql.jdbc.FBObjectListener;
import org.firebirdsql.jdbc.FBResultSet;
import org.firebirdsql.jdbc.FBSQLException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FBCachedFetcher_ESTest extends FBCachedFetcher_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      int int0 = 67108864;
      linkedList0.clear();
      linkedList0.removeFirstOccurrence(fBCachedFetcher0);
      byte[][] byteArray0 = new byte[8][1];
      byte[] byteArray1 = new byte[5];
      byteArray1[0] = (byte) (-65);
      byteArray1[1] = (byte)95;
      byteArray1[2] = (byte)0;
      byteArray1[3] = (byte)86;
      byteArray1[4] = (byte) (-22);
      byteArray0[0] = byteArray1;
      byte[] byteArray2 = new byte[8];
      byteArray2[0] = (byte)0;
      byteArray2[1] = (byte)86;
      byteArray2[2] = (byte) (-22);
      byteArray2[3] = (byte) (-65);
      byteArray2[4] = (byte)86;
      byteArray2[5] = (byte) (-22);
      byteArray2[6] = (byte)0;
      byteArray2[7] = (byte) (-22);
      byteArray0[1] = byteArray2;
      byte[] byteArray3 = new byte[4];
      byteArray3[0] = (byte)86;
      byteArray3[1] = (byte) (-22);
      byteArray3[2] = (byte) (-22);
      byteArray3[3] = (byte)95;
      byteArray0[2] = byteArray3;
      byte[] byteArray4 = new byte[4];
      byteArray4[0] = (byte)86;
      byteArray4[1] = (byte)95;
      byteArray4[2] = (byte)95;
      byteArray4[3] = (byte)0;
      byteArray0[3] = byteArray4;
      byte[] byteArray5 = new byte[9];
      byteArray5[0] = (byte)0;
      byteArray5[1] = (byte)86;
      byteArray5[2] = (byte)95;
      byteArray5[3] = (byte) (-22);
      byteArray5[4] = (byte)95;
      byteArray5[5] = (byte)86;
      byteArray5[6] = (byte)86;
      byteArray5[7] = (byte)86;
      byteArray5[8] = (byte)1;
      byteArray0[4] = byteArray5;
      byte[] byteArray6 = new byte[0];
      byteArray0[5] = byteArray6;
      byte[] byteArray7 = new byte[3];
      byteArray7[0] = (byte) (-65);
      byteArray7[1] = (byte)21;
      byteArray7[2] = (byte)86;
      byteArray0[6] = byteArray7;
      byte[] byteArray8 = new byte[1];
      byteArray8[0] = (byte)21;
      byteArray0[7] = byteArray8;
      // Undeclared exception!
      try { 
        fBCachedFetcher0.updateRow(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.previous();
      fBCachedFetcher0.afterLast();
      fBCachedFetcher0.relative(14);
      FBCachedFetcher fBCachedFetcher1 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher1.close();
      // Undeclared exception!
      try { 
        fBCachedFetcher0.deleteRow();
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      assertFalse(fBCachedFetcher0.isBeforeFirst());
      
      boolean boolean0 = fBCachedFetcher0.next();
      assertFalse(boolean0);
      
      fBCachedFetcher0.afterLast();
      fBCachedFetcher0.setFetchSize(0);
      fBCachedFetcher0.beforeFirst();
      assertEquals(0, fBCachedFetcher0.getRowNum());
      assertEquals(0, fBCachedFetcher0.getFetchSize());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.afterLast();
      fBCachedFetcher0.close();
      int int0 = fBCachedFetcher0.getRowNum();
      assertEquals(0, int0);
      assertFalse(fBCachedFetcher0.isBeforeFirst());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.6094379124341
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.setFetchSize(7);
      fBCachedFetcher0.previous();
      try { 
        fBCachedFetcher0.absolute(0);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // You cannot position to the row 0 with absolute() method.
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      linkedList0.sort(comparator0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      FBCachedFetcher fBCachedFetcher1 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher1.afterLast();
      fBCachedFetcher0.close();
      fBCachedFetcher1.getFetchSize();
      byte[][] byteArray0 = new byte[8][2];
      byte[] byteArray1 = new byte[6];
      byteArray1[0] = (byte)100;
      byteArray1[1] = (byte)0;
      byteArray1[2] = (byte) (-12);
      byteArray1[3] = (byte)14;
      byteArray1[4] = (byte) (-80);
      byteArray1[5] = (byte) (-31);
      byteArray0[0] = byteArray1;
      byte[] byteArray2 = new byte[4];
      byteArray2[0] = (byte)14;
      byteArray2[1] = (byte)100;
      byteArray2[2] = (byte) (-31);
      byteArray2[3] = (byte) (-80);
      byteArray0[1] = byteArray2;
      byte[] byteArray3 = new byte[5];
      byteArray3[0] = (byte) (-31);
      byteArray3[1] = (byte)100;
      byteArray3[2] = (byte) (-117);
      byteArray3[3] = (byte)100;
      byteArray3[4] = (byte)0;
      byteArray0[2] = byteArray3;
      byte[] byteArray4 = new byte[0];
      byteArray0[3] = byteArray4;
      byte[] byteArray5 = new byte[7];
      byteArray5[0] = (byte)0;
      byteArray5[1] = (byte)0;
      byteArray5[2] = (byte) (-80);
      byteArray5[3] = (byte) (-117);
      byteArray5[4] = (byte)14;
      byteArray5[5] = (byte) (-117);
      byteArray5[6] = (byte)0;
      byteArray0[4] = byteArray5;
      byte[] byteArray6 = new byte[3];
      byteArray6[0] = (byte) (-80);
      byteArray6[1] = (byte)14;
      byteArray6[2] = (byte)100;
      byteArray0[5] = byteArray6;
      byte[] byteArray7 = new byte[5];
      byteArray7[0] = (byte) (-31);
      byteArray7[1] = (byte) (-117);
      byteArray7[2] = (byte)100;
      byteArray7[3] = (byte)0;
      byteArray7[4] = (byte)0;
      byteArray0[6] = byteArray7;
      byte[] byteArray8 = new byte[7];
      byteArray8[0] = (byte)43;
      byteArray8[1] = (byte)14;
      byteArray8[2] = (byte) (-80);
      byteArray8[3] = (byte)14;
      byteArray8[4] = (byte)100;
      byteArray8[5] = (byte) (-117);
      byteArray8[6] = (byte) (-12);
      byteArray0[7] = byteArray8;
      // Undeclared exception!
      try { 
        fBCachedFetcher0.insertRow(byteArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      boolean boolean0 = fBCachedFetcher0.isLast();
      assertTrue(boolean0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.7782333057997075
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FBObjectListener.FetcherListener fBObjectListener_FetcherListener0 = null;
      byte[][] byteArray0 = new byte[0][4];
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      linkedList0.add(byteArray0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      // Undeclared exception!
      try { 
        fBCachedFetcher0.previous();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      FBCachedFetcher fBCachedFetcher1 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      FBCachedFetcher fBCachedFetcher2 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      boolean boolean0 = fBCachedFetcher1.isFirst();
      assertFalse(boolean0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.2718685126965625
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      byte[][] byteArrayArray0 = null;
      linkedList0.add((byte[][]) null);
      fBCachedFetcher0.relative(753);
      fBCachedFetcher0.afterLast();
      FBCachedFetcher fBCachedFetcher1 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      // Undeclared exception!
      try { 
        fBCachedFetcher1.absolute(753);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.6595892270053698
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      byte[][] byteArrayArray0 = null;
      linkedList0.add((byte[][]) null);
      int int0 = 753;
      fBCachedFetcher0.relative(753);
      fBCachedFetcher0.afterLast();
      FBCachedFetcher fBCachedFetcher1 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      // Undeclared exception!
      try { 
        fBCachedFetcher1.afterLast();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.868351777640703
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      linkedList0.add((byte[][]) null);
      fBCachedFetcher0.last();
      fBCachedFetcher0.relative(753);
      fBCachedFetcher0.beforeFirst();
      FBCachedFetcher fBCachedFetcher1 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      // Undeclared exception!
      try { 
        fBCachedFetcher1.absolute((-716));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.0253262207700673
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.afterLast();
      assertEquals(2, fBCachedFetcher0.getRowNum());
      
      FBCachedFetcher fBCachedFetcher1 = new FBCachedFetcher(linkedList0, fBResultSet0);
      assertEquals(0, fBResultSet0.getRow());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.isLast();
      // Undeclared exception!
      try { 
        fBCachedFetcher0.deleteRow();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.20082764903455
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.updateRow((byte[][]) null);
      fBCachedFetcher0.next();
      fBCachedFetcher0.insertRow((byte[][]) null);
      fBCachedFetcher0.isFirst();
      boolean boolean0 = fBCachedFetcher0.relative(400);
      assertEquals(3, fBCachedFetcher0.getRowNum());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.9730014063936125
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.updateRow((byte[][]) null);
      fBCachedFetcher0.next();
      byte[][] byteArray0 = new byte[2][9];
      byte[] byteArray1 = new byte[7];
      byteArray1[0] = (byte)45;
      byteArray1[1] = (byte) (-78);
      byteArray1[2] = (byte) (-84);
      byteArray1[3] = (byte)72;
      byteArray1[4] = (byte) (-62);
      byteArray1[5] = (byte)7;
      fBCachedFetcher0.updateRow(byteArray0);
      fBCachedFetcher0.next();
      fBCachedFetcher0.insertRow(byteArray0);
      boolean boolean0 = fBCachedFetcher0.previous();
      assertEquals(1, fBCachedFetcher0.getRowNum());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.2485570837030413
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.updateRow((byte[][]) null);
      fBCachedFetcher0.first();
      fBCachedFetcher0.next();
      fBCachedFetcher0.insertRow((byte[][]) null);
      fBCachedFetcher0.previous();
      fBCachedFetcher0.deleteRow();
      assertTrue(fBCachedFetcher0.isLast());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.9722469794234418
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.updateRow((byte[][]) null);
      fBCachedFetcher0.first();
      fBCachedFetcher0.next();
      fBCachedFetcher0.updateRow((byte[][]) null);
      assertEquals(2, fBCachedFetcher0.getRowNum());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.0161537172613797
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      linkedList0.offer((byte[][]) null);
      fBCachedFetcher0.first();
      fBCachedFetcher0.next();
      fBCachedFetcher0.previous();
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      fBCachedFetcher0.deleteRow();
      assertTrue(fBCachedFetcher0.isEmpty());
  }
}
