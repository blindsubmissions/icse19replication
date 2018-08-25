/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 16:48:14 GMT 2018
 */

package org.firebirdsql.jdbc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.function.UnaryOperator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.firebirdsql.gds.XSQLVAR;
import org.firebirdsql.gds.impl.GDSHelper;
import org.firebirdsql.gds.impl.wire.isc_stmt_handle_impl;
import org.firebirdsql.jdbc.FBCachedFetcher;
import org.firebirdsql.jdbc.FBObjectListener;
import org.firebirdsql.jdbc.FBResultSet;
import org.firebirdsql.jdbc.FBSQLException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FBCachedFetcher_ESTest extends FBCachedFetcher_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      linkedList0.pollLast();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.beforeFirst();
      boolean boolean0 = fBCachedFetcher0.absolute(2108);
      assertFalse(boolean0);
      
      fBCachedFetcher0.afterLast();
      linkedList0.add((byte[][]) null);
      boolean boolean1 = fBCachedFetcher0.isFirst();
      fBCachedFetcher0.close();
      assertFalse(fBCachedFetcher0.isBeforeFirst());
      
      boolean boolean2 = fBCachedFetcher0.next();
      assertTrue(boolean2 == boolean1);
      assertFalse(boolean2);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[0][8];
      linkedList0.add(byteArray0);
      byte[][] byteArray1 = linkedList0.pollLast();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.setFetchSize((-3205));
      fBCachedFetcher0.beforeFirst();
      // Undeclared exception!
      try { 
        fBCachedFetcher0.updateRow(byteArray1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.1639556568820564
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      linkedList0.pollLast();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      linkedList0.parallelStream();
      fBCachedFetcher0.beforeFirst();
      int int0 = 0;
      // Undeclared exception!
      try { 
        fBCachedFetcher0.insertRow((byte[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.2718685126965625
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      linkedList0.pollLast();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.relative((-873));
      fBCachedFetcher0.beforeFirst();
      // Undeclared exception!
      try { 
        fBCachedFetcher0.updateRow((byte[][]) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      linkedList0.pollLast();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.beforeFirst();
      fBCachedFetcher0.last();
      fBCachedFetcher0.getRowNum();
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
  /*Coverage entropy=2.0431918705451206
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      linkedList0.pollLast();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.beforeFirst();
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher1 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      // Undeclared exception!
      try { 
        fBCachedFetcher1.next();
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
  /*Coverage entropy=2.1458417525947544
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      linkedList0.pollLast();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.beforeFirst();
      assertFalse(fBCachedFetcher0.isAfterLast());
      
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher1 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      assertTrue(fBCachedFetcher1.isBeforeFirst());
      
      fBCachedFetcher1.updateRow((byte[][]) null);
      assertFalse(fBCachedFetcher1.isAfterLast());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.7677614722893296
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      linkedList0.pollLast();
      linkedList0.clear();
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      linkedList0.iterator();
      // Undeclared exception!
      try { 
        fBCachedFetcher0.beforeFirst();
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
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      linkedList0.pollLast();
      FBCachedFetcher fBCachedFetcher1 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      boolean boolean0 = fBCachedFetcher1.relative((-873));
      boolean boolean1 = fBCachedFetcher1.previous();
      assertTrue(boolean1 == boolean0);
      
      fBCachedFetcher1.beforeFirst();
      boolean boolean2 = fBCachedFetcher0.next();
      boolean boolean3 = fBCachedFetcher1.isFirst();
      assertTrue(boolean3 == boolean2);
      
      int int0 = fBCachedFetcher0.getFetchSize();
      assertEquals(0, int0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.9061547465398496
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      linkedList0.pollLast();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.next();
      fBCachedFetcher0.isFirst();
      fBCachedFetcher0.close();
      fBCachedFetcher0.next();
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher1 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      // Undeclared exception!
      try { 
        fBCachedFetcher1.previous();
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
  /*Coverage entropy=1.3592367006650063
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[9][2];
      byte[] byteArray1 = new byte[4];
      byteArray1[0] = (byte) (-110);
      byteArray1[1] = (byte) (-93);
      byteArray1[2] = (byte) (-105);
      byteArray1[3] = (byte) (-17);
      byteArray0[0] = byteArray1;
      byte[] byteArray2 = new byte[5];
      byteArray2[0] = (byte) (-17);
      byteArray2[1] = (byte)68;
      byteArray2[2] = (byte) (-17);
      byteArray2[3] = (byte) (-110);
      byteArray2[4] = (byte) (-17);
      byteArray0[1] = byteArray2;
      byte[] byteArray3 = new byte[7];
      byteArray3[0] = (byte) (-17);
      byteArray3[1] = (byte)119;
      byteArray3[2] = (byte) (-105);
      byteArray3[3] = (byte) (-17);
      byteArray3[4] = (byte)68;
      byteArray3[5] = (byte)96;
      byteArray3[6] = (byte)68;
      byteArray0[2] = byteArray3;
      byte[] byteArray4 = new byte[3];
      byteArray4[0] = (byte) (-105);
      byteArray4[1] = (byte) (-110);
      byteArray4[2] = (byte)96;
      byteArray0[3] = byteArray4;
      byte[] byteArray5 = new byte[6];
      byteArray5[0] = (byte)96;
      byteArray5[1] = (byte) (-17);
      byteArray5[2] = (byte) (-17);
      byteArray5[3] = (byte) (-17);
      byteArray5[4] = (byte) (-105);
      byteArray5[5] = (byte) (-105);
      byteArray0[4] = byteArray5;
      byte[] byteArray6 = new byte[8];
      byteArray6[0] = (byte)68;
      byteArray6[1] = (byte) (-93);
      byteArray6[2] = (byte)0;
      byteArray6[3] = (byte) (-17);
      byteArray6[4] = (byte)119;
      byteArray6[5] = (byte)119;
      byteArray6[6] = (byte)96;
      byteArray6[7] = (byte) (-93);
      byteArray0[5] = byteArray6;
      byte[] byteArray7 = new byte[6];
      byteArray7[0] = (byte)96;
      byteArray7[1] = (byte) (-110);
      byteArray7[2] = (byte) (-105);
      byteArray7[3] = (byte)119;
      byteArray7[4] = (byte)68;
      byteArray7[5] = (byte)0;
      byteArray0[6] = byteArray7;
      byte[] byteArray8 = new byte[9];
      byteArray8[0] = (byte)96;
      byteArray8[1] = (byte)0;
      byteArray8[2] = (byte) (-99);
      byteArray8[3] = (byte) (-110);
      byteArray8[4] = (byte)119;
      byteArray8[5] = (byte) (-93);
      byteArray8[6] = (byte) (-93);
      byteArray8[7] = (byte)96;
      byteArray8[8] = (byte) (-44);
      byteArray0[7] = byteArray8;
      byte[] byteArray9 = new byte[1];
      byteArray9[0] = (byte)68;
      byteArray0[8] = byteArray9;
      linkedList0.add(byteArray0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      // Undeclared exception!
      try { 
        fBCachedFetcher0.absolute((-888));
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
  /*Coverage entropy=1.7326587201992072
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      byte[][] byteArray0 = new byte[6][8];
      byte[] byteArray1 = new byte[0];
      byteArray0[5] = byteArray1;
      byte[] byteArray2 = new byte[8];
      FBCachedFetcher fBCachedFetcher1 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      byte[][] byteArray3 = new byte[1][3];
      byteArray3[0] = byteArray2;
      boolean boolean0 = fBCachedFetcher0.previous();
      assertFalse(boolean0);
      
      fBCachedFetcher1.first();
      boolean boolean1 = fBCachedFetcher1.absolute((-847));
      boolean boolean2 = fBCachedFetcher1.isLast();
      assertFalse(boolean2 == boolean1);
      assertTrue(boolean2);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.7480673485460896
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      linkedList0.clear();
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.updateRow((byte[][]) null);
      boolean boolean0 = fBCachedFetcher0.isLast();
      assertFalse(boolean0);
      assertFalse(fBCachedFetcher0.isAfterLast());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      LinkedList<byte[][]> linkedList1 = new LinkedList<byte[][]>();
      linkedList0.pollLast();
      LinkedList<byte[][]> linkedList2 = new LinkedList<byte[][]>();
      linkedList1.add((byte[][]) null);
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList2, fBResultSet0);
      fBCachedFetcher0.next();
      fBCachedFetcher0.insertRow((byte[][]) null);
      linkedList2.listIterator();
      fBCachedFetcher0.deleteRow();
      boolean boolean0 = fBCachedFetcher0.isFirst();
      assertFalse(fBCachedFetcher0.isLast());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.1458417525947544
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      LinkedList<byte[][]> linkedList1 = new LinkedList<byte[][]>();
      linkedList0.pollLast();
      LinkedList<byte[][]> linkedList2 = new LinkedList<byte[][]>();
      linkedList1.addLast((byte[][]) null);
      linkedList1.add((byte[][]) null);
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList2, fBResultSet0);
      fBCachedFetcher0.next();
      fBCachedFetcher0.insertRow((byte[][]) null);
      fBCachedFetcher0.deleteRow();
      fBCachedFetcher0.previous();
      fBCachedFetcher0.updateRow((byte[][]) null);
      assertEquals(1, fBCachedFetcher0.getRowNum());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.8891591637540217
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      LinkedList<byte[][]> linkedList1 = new LinkedList<byte[][]>();
      linkedList0.pollLast();
      LinkedList<byte[][]> linkedList2 = new LinkedList<byte[][]>();
      linkedList1.addLast((byte[][]) null);
      linkedList2.stream();
      linkedList2.pollLast();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList2, fBResultSet0);
      fBCachedFetcher0.next();
      fBCachedFetcher0.insertRow((byte[][]) null);
      fBCachedFetcher0.deleteRow();
      assertFalse(fBCachedFetcher0.isLast());
      
      fBCachedFetcher0.insertRow((byte[][]) null);
      fBCachedFetcher0.isEmpty();
      assertFalse(fBCachedFetcher0.isAfterLast());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.9701814400260846
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      linkedList0.pollLast();
      linkedList0.stream();
      LinkedList<byte[][]> linkedList1 = new LinkedList<byte[][]>(linkedList0);
      linkedList1.add((byte[][]) null);
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList1);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.next();
      FBCachedFetcher fBCachedFetcher1 = new FBCachedFetcher(linkedList1, fBResultSet0);
      FBCachedFetcher fBCachedFetcher2 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher2.next();
      FBCachedFetcher fBCachedFetcher3 = new FBCachedFetcher(linkedList1, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher1.insertRow((byte[][]) null);
      fBCachedFetcher1.deleteRow();
      assertFalse(fBCachedFetcher1.isBeforeFirst());
      
      boolean boolean0 = fBCachedFetcher3.isLast();
      assertFalse(boolean0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.9722469794234416
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      LinkedList<byte[][]> linkedList1 = new LinkedList<byte[][]>();
      linkedList0.pollLast();
      LinkedList<byte[][]> linkedList2 = new LinkedList<byte[][]>();
      linkedList1.addLast((byte[][]) null);
      linkedList1.add((byte[][]) null);
      linkedList2.removeAll(linkedList0);
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList2, fBResultSet0);
      fBCachedFetcher0.insertRow((byte[][]) null);
      fBCachedFetcher0.next();
      FBCachedFetcher fBCachedFetcher1 = new FBCachedFetcher(linkedList2, fBResultSet0);
      fBCachedFetcher1.next();
      fBCachedFetcher1.next();
      FBCachedFetcher fBCachedFetcher2 = new FBCachedFetcher(linkedList2, fBResultSet0);
      fBCachedFetcher2.insertRow((byte[][]) null);
      fBCachedFetcher2.deleteRow();
      fBCachedFetcher2.isLast();
      // Undeclared exception!
      try { 
        fBCachedFetcher0.deleteRow();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.3114234446919735
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      LinkedList<byte[][]> linkedList1 = new LinkedList<byte[][]>();
      linkedList1.pollLast();
      LinkedList<byte[][]> linkedList2 = new LinkedList<byte[][]>();
      linkedList2.addLast((byte[][]) null);
      LinkedList<byte[][]> linkedList3 = new LinkedList<byte[][]>();
      linkedList3.add((byte[][]) null);
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBResultSet fBResultSet1 = new FBResultSet(xSQLVARArray0, linkedList3);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList2, fBResultSet1);
      int int0 = 2158;
      fBCachedFetcher0.absolute(3008);
      fBCachedFetcher0.relative(2158);
      fBCachedFetcher0.previous();
      fBCachedFetcher0.first();
      fBCachedFetcher0.last();
      fBCachedFetcher0.last();
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      isc_stmt_handle_impl0.setDeleteCount(53);
      FBCachedFetcher fBCachedFetcher1 = null;
      try {
        fBCachedFetcher1 = new FBCachedFetcher((GDSHelper) null, 130, 713, isc_stmt_handle_impl0, fBResultSet0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }
}
