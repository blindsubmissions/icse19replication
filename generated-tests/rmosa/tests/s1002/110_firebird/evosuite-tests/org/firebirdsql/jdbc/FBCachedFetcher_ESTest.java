/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 05:46:44 GMT 2018
 */

package org.firebirdsql.jdbc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.firebirdsql.gds.DatabaseParameterBuffer;
import org.firebirdsql.gds.GDS;
import org.firebirdsql.gds.IscDbHandle;
import org.firebirdsql.gds.XSQLDA;
import org.firebirdsql.gds.XSQLVAR;
import org.firebirdsql.gds.impl.GDSHelper;
import org.firebirdsql.gds.impl.jni.DatabaseParameterBufferImp;
import org.firebirdsql.gds.impl.wire.JavaGDSImpl;
import org.firebirdsql.gds.impl.wire.isc_db_handle_impl;
import org.firebirdsql.gds.impl.wire.isc_stmt_handle_impl;
import org.firebirdsql.gds.impl.wire.isc_tr_handle_impl;
import org.firebirdsql.jca.FBConnectionRequestInfo;
import org.firebirdsql.jdbc.FBCachedFetcher;
import org.firebirdsql.jdbc.FBDriverNotCapableException;
import org.firebirdsql.jdbc.FBObjectListener;
import org.firebirdsql.jdbc.FBResultSet;
import org.firebirdsql.jdbc.FBSQLException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FBCachedFetcher_ESTest extends FBCachedFetcher_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      try { 
        fBCachedFetcher0.absolute((-1));
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // You cannot position to the row 0 with absolute() method.
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.15374194270109
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.absolute(2014);
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
  //Test case number: 2
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.getRowNum();
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
  //Test case number: 3
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      boolean boolean0 = fBCachedFetcher0.isFirst();
      assertFalse(boolean0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.937155853065701
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      XSQLDA xSQLDA0 = new XSQLDA(2);
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      byte[][] byteArray0 = new byte[5][3];
      xSQLDA0.blr = xSQLDA0.blr;
      byteArray0[1] = null;
      byte[] byteArray1 = new byte[6];
      byteArray1[0] = (byte)75;
      byteArray1[1] = (byte) (-60);
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.next();
      fBCachedFetcher0.isEmpty();
      byteArray1[2] = (byte)1;
      byteArray1[3] = (byte) (-2);
      byteArray1[4] = (byte)75;
      byteArray1[5] = (byte) (-108);
      byteArray0[2] = byteArray1;
      byteArray0[4] = null;
      isc_stmt_handle_impl.printRow(byteArray0);
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[1];
      XSQLVAR xSQLVAR0 = new XSQLVAR();
      xSQLVARArray0[0] = xSQLVAR0;
      xSQLDA0.sqlvar = xSQLVARArray0;
      xSQLDA0.sqld = (-763);
      isc_stmt_handle_impl0.setOutSqlda(xSQLDA0);
      isc_stmt_handle_impl0.setAllRowsFetched(true);
      FBCachedFetcher fBCachedFetcher1 = null;
      try {
        fBCachedFetcher1 = new FBCachedFetcher((GDSHelper) null, 1, 2, isc_stmt_handle_impl0, (FBObjectListener.FetcherListener) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.567081229293324
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      assertFalse(fBCachedFetcher0.isBeforeFirst());
      
      fBCachedFetcher0.afterLast();
      fBCachedFetcher0.first();
      boolean boolean0 = fBCachedFetcher0.last();
      assertFalse(boolean0);
      
      fBCachedFetcher0.isEmpty();
      assertFalse(fBCachedFetcher0.isFirst());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.setFetchSize(547);
      assertEquals(547, fBCachedFetcher0.getFetchSize());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.5140145366537061
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XSQLDA xSQLDA0 = new XSQLDA(2);
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      byte[][] byteArray0 = new byte[5][3];
      xSQLDA0.blr = xSQLDA0.blr;
      byteArray0[1] = null;
      byte[] byteArray1 = new byte[9];
      byteArray1[0] = (byte)75;
      byteArray1[1] = (byte) (-60);
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.beforeFirst();
      FileSystemHandling.shouldAllThrowIOExceptions();
      fBCachedFetcher0.isEmpty();
      byteArray1[2] = (byte)1;
      byteArray1[3] = (byte) (-2);
      byteArray1[4] = (byte)75;
      byteArray1[5] = (byte) (-60);
      byteArray0[2] = byteArray1;
      byteArray0[4] = null;
      isc_stmt_handle_impl.printRow(byteArray0);
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[1];
      XSQLVAR xSQLVAR0 = new XSQLVAR();
      xSQLVARArray0[0] = xSQLVAR0;
      xSQLDA0.sqlvar = xSQLVARArray0;
      xSQLDA0.sqld = (-753);
      isc_stmt_handle_impl0.setOutSqlda(xSQLDA0);
      FBCachedFetcher fBCachedFetcher1 = null;
      try {
        fBCachedFetcher1 = new FBCachedFetcher((GDSHelper) null, (byte) (-60), (byte)75, isc_stmt_handle_impl0, (FBObjectListener.FetcherListener) null, true);
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
      byte[][] byteArray0 = new byte[7][2];
      byte[] byteArray1 = new byte[3];
      byteArray1[2] = (byte)22;
      byteArray0[0] = byteArray1;
      byteArray0[1] = byteArray1;
      byte[] byteArray2 = new byte[3];
      byteArray2[0] = (byte) (-1);
      byteArray2[1] = (byte)98;
      byteArray2[2] = (byte) (-113);
      byteArray0[2] = byteArray2;
      byte[] byteArray3 = new byte[5];
      byteArray3[0] = (byte)12;
      byteArray3[1] = (byte)103;
      byteArray3[2] = (byte)22;
      byteArray3[3] = (byte)22;
      byteArray0[3] = byteArray3;
      byte[] byteArray4 = new byte[8];
      byteArray4[0] = (byte)103;
      byteArray4[1] = (byte)98;
      byteArray4[5] = (byte)98;
      byteArray4[6] = (byte)103;
      byteArray4[7] = (byte) (-1);
      byteArray0[4] = byteArray4;
      byte[] byteArray5 = new byte[25];
      byteArray5[0] = (byte) (-1);
      byteArray5[2] = (byte)12;
      byteArray5[4] = (byte)22;
      byteArray5[6] = (byte)98;
      byteArray0[5] = byteArray5;
      byte[] byteArray6 = new byte[1];
      byteArray6[0] = (byte)22;
      byteArray0[6] = byteArray6;
      linkedList0.add(byteArray0);
      byte[] byteArray7 = new byte[8];
      byteArray7[1] = (byte)22;
      byteArray7[2] = (byte)56;
      byteArray7[5] = (byte)56;
      byteArray7[1] = (byte)56;
      byte[] byteArray8 = new byte[8];
      byte[] byteArray9 = new byte[8];
      byteArray9[2] = (byte) (-1);
      byteArray9[3] = (byte)82;
      byteArray9[7] = (byte)22;
      byte[] byteArray10 = new byte[5];
      byteArray10[0] = (byte) (-1);
      int int0 = fBCachedFetcher0.getFetchSize();
      assertEquals(0, int0);
      assertFalse(fBCachedFetcher0.isAfterLast());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[0][4];
      linkedList0.add(byteArray0);
      linkedList0.offerFirst(byteArray0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.isLast();
      boolean boolean0 = fBCachedFetcher0.isLast();
      assertFalse(boolean0);
      assertTrue(fBCachedFetcher0.isBeforeFirst());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.3592367006650066
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      boolean boolean0 = fBCachedFetcher0.relative(0);
      boolean boolean1 = fBCachedFetcher0.isLast();
      assertFalse(boolean1 == boolean0);
      assertTrue(boolean1);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[0][4];
      linkedList0.add(byteArray0);
      linkedList0.offerFirst(byteArray0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.close();
      assertTrue(fBCachedFetcher0.isLast());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.5498260458782016
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      byte[][] byteArray0 = new byte[9][1];
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
  //Test case number: 13
  /*Coverage entropy=1.3296613488547582
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[0][4];
      linkedList0.add(byteArray0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      // Undeclared exception!
      try { 
        fBCachedFetcher0.next();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.5832584594204766
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      // Undeclared exception!
      try { 
        fBCachedFetcher0.relative(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[0][4];
      linkedList0.offerFirst(byteArray0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      // Undeclared exception!
      try { 
        fBCachedFetcher0.absolute(1033);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[0][4];
      linkedList0.add(byteArray0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.updateRow(byteArray0);
      // Undeclared exception!
      try { 
        linkedList0.set((-3671), byteArray0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -3671, Size: 1
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.7890221622909375
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.insertRow((byte[][]) null);
      fBCachedFetcher0.next();
      fBCachedFetcher0.insertRow((byte[][]) null);
      fBCachedFetcher0.deleteRow();
      String string0 = "You cannot position to the row 0 with absolute() method.";
      // Undeclared exception!
      try { 
        fBCachedFetcher0.deleteRow();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.933809998920632
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.next();
      fBCachedFetcher0.insertRow((byte[][]) null);
      fBCachedFetcher0.insertRow((byte[][]) null);
      fBCachedFetcher0.isFirst();
      fBCachedFetcher0.deleteRow();
      try { 
        fBResultSet0.getString("You cannot position to the row 0 with absolute() method.");
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // The resultSet is not in a row, use next
         //
         verifyException("org.firebirdsql.jdbc.AbstractResultSet", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.7890221622909377
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.insertRow((byte[][]) null);
      fBCachedFetcher0.insertRow((byte[][]) null);
      fBCachedFetcher0.deleteRow();
      fBCachedFetcher0.deleteRow();
      fBCachedFetcher0.updateRow((byte[][]) null);
      try { 
        fBResultSet0.getString("You cannot position to the row 0 with absolute() method.");
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // The resultSet is not in a row, use next
         //
         verifyException("org.firebirdsql.jdbc.AbstractResultSet", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=2.0125287100263285
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.insertRow((byte[][]) null);
      fBCachedFetcher0.insertRow((byte[][]) null);
      FBCachedFetcher fBCachedFetcher1 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher1.first();
      fBCachedFetcher0.last();
      fBCachedFetcher1.isEmpty();
      fBCachedFetcher0.previous();
      assertFalse(fBCachedFetcher0.isLast());
      
      fBCachedFetcher1.absolute(771);
      fBCachedFetcher1.insertRow((byte[][]) null);
      boolean boolean0 = fBCachedFetcher1.previous();
      assertFalse(boolean0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      XSQLDA xSQLDA0 = new XSQLDA();
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[1];
      XSQLVAR xSQLVAR0 = new XSQLVAR();
      xSQLVARArray0[0] = xSQLVAR0;
      xSQLDA0.sqlvar = xSQLVARArray0;
      isc_stmt_handle_impl0.setOutSqlda(xSQLDA0);
      FBCachedFetcher fBCachedFetcher0 = null;
      try {
        fBCachedFetcher0 = new FBCachedFetcher((GDSHelper) null, 0, 0, isc_stmt_handle_impl0, (FBObjectListener.FetcherListener) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      XSQLDA xSQLDA0 = new XSQLDA();
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[1];
      XSQLVAR xSQLVAR0 = new XSQLVAR();
      xSQLVARArray0[0] = xSQLVAR0;
      xSQLDA0.sqlvar = xSQLVARArray0;
      isc_stmt_handle_impl0.setOutSqlda(xSQLDA0);
      FBCachedFetcher fBCachedFetcher0 = null;
      try {
        fBCachedFetcher0 = new FBCachedFetcher((GDSHelper) null, 1, 0, isc_stmt_handle_impl0, (FBObjectListener.FetcherListener) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      XSQLDA xSQLDA0 = new XSQLDA();
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[1];
      XSQLVAR xSQLVAR0 = new XSQLVAR();
      xSQLVARArray0[0] = xSQLVAR0;
      xSQLDA0.sqlvar = xSQLVARArray0;
      isc_stmt_handle_impl0.setOutSqlda(xSQLDA0);
      FBCachedFetcher fBCachedFetcher0 = null;
      try {
        fBCachedFetcher0 = new FBCachedFetcher((GDSHelper) null, 0, 1, isc_stmt_handle_impl0, (FBObjectListener.FetcherListener) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      XSQLDA xSQLDA0 = new XSQLDA();
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[1];
      XSQLVAR xSQLVAR0 = new XSQLVAR();
      xSQLVARArray0[0] = xSQLVAR0;
      xSQLDA0.sqlvar = xSQLVARArray0;
      isc_stmt_handle_impl0.setOutSqlda(xSQLDA0);
      FBCachedFetcher fBCachedFetcher0 = null;
      try {
        fBCachedFetcher0 = new FBCachedFetcher((GDSHelper) null, (-2915), (-2915), isc_stmt_handle_impl0, (FBObjectListener.FetcherListener) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      XSQLDA xSQLDA0 = new XSQLDA();
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[1];
      XSQLVAR xSQLVAR0 = new XSQLVAR();
      xSQLVARArray0[0] = xSQLVAR0;
      xSQLDA0.sqlvar = xSQLVARArray0;
      isc_stmt_handle_impl0.setOutSqlda(xSQLDA0);
      isc_stmt_handle_impl0.setAllRowsFetched(true);
      FBCachedFetcher fBCachedFetcher0 = null;
      try {
        fBCachedFetcher0 = new FBCachedFetcher((GDSHelper) null, 0, 1, isc_stmt_handle_impl0, (FBObjectListener.FetcherListener) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      XSQLDA xSQLDA0 = new XSQLDA();
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[1];
      XSQLVAR xSQLVAR0 = new XSQLVAR();
      xSQLVARArray0[0] = xSQLVAR0;
      xSQLDA0.sqlvar = xSQLVARArray0;
      isc_stmt_handle_impl0.setOutSqlda(xSQLDA0);
      isc_stmt_handle_impl0.setAllRowsFetched(true);
      JavaGDSImpl javaGDSImpl0 = new JavaGDSImpl();
      DatabaseParameterBufferImp databaseParameterBufferImp0 = new DatabaseParameterBufferImp();
      FBConnectionRequestInfo fBConnectionRequestInfo0 = new FBConnectionRequestInfo(databaseParameterBufferImp0);
      IscDbHandle iscDbHandle0 = javaGDSImpl0.createIscDbHandle();
      GDSHelper gDSHelper0 = new GDSHelper(javaGDSImpl0, fBConnectionRequestInfo0, iscDbHandle0, (GDSHelper.GDSHelperErrorListener) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(gDSHelper0, (-157), 16384, isc_stmt_handle_impl0, (FBObjectListener.FetcherListener) null, true);
      fBCachedFetcher0.isEmpty();
      try { 
        fBCachedFetcher0.first();
        fail("Expecting exception: FBDriverNotCapableException");
      
      } catch(FBDriverNotCapableException e) {
         //
         // Result set is TYPE_FORWARD_ONLY
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      XSQLDA xSQLDA0 = new XSQLDA();
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[1];
      XSQLVAR xSQLVAR0 = new XSQLVAR();
      xSQLVARArray0[0] = xSQLVAR0;
      xSQLDA0.sqlvar = xSQLVARArray0;
      isc_stmt_handle_impl0.setOutSqlda(xSQLDA0);
      isc_stmt_handle_impl0.setAllRowsFetched(true);
      JavaGDSImpl javaGDSImpl0 = new JavaGDSImpl();
      DatabaseParameterBufferImp databaseParameterBufferImp0 = new DatabaseParameterBufferImp();
      FBConnectionRequestInfo fBConnectionRequestInfo0 = new FBConnectionRequestInfo(databaseParameterBufferImp0);
      IscDbHandle iscDbHandle0 = javaGDSImpl0.createIscDbHandle();
      GDSHelper gDSHelper0 = new GDSHelper(javaGDSImpl0, fBConnectionRequestInfo0, iscDbHandle0, (GDSHelper.GDSHelperErrorListener) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(gDSHelper0, (-157), 16384, isc_stmt_handle_impl0, (FBObjectListener.FetcherListener) null, true);
      fBCachedFetcher0.isEmpty();
      try { 
        fBCachedFetcher0.absolute(335544726);
        fail("Expecting exception: FBDriverNotCapableException");
      
      } catch(FBDriverNotCapableException e) {
         //
         // Result set is TYPE_FORWARD_ONLY
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      XSQLDA xSQLDA0 = new XSQLDA();
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[1];
      XSQLVAR xSQLVAR0 = new XSQLVAR();
      xSQLVARArray0[0] = xSQLVAR0;
      xSQLDA0.sqlvar = xSQLVARArray0;
      isc_stmt_handle_impl0.setOutSqlda(xSQLDA0);
      isc_stmt_handle_impl0.setAllRowsFetched(true);
      JavaGDSImpl javaGDSImpl0 = new JavaGDSImpl();
      DatabaseParameterBufferImp databaseParameterBufferImp0 = new DatabaseParameterBufferImp();
      FBConnectionRequestInfo fBConnectionRequestInfo0 = new FBConnectionRequestInfo(databaseParameterBufferImp0);
      isc_db_handle_impl isc_db_handle_impl0 = (isc_db_handle_impl)javaGDSImpl0.createIscDbHandle();
      GDSHelper gDSHelper0 = new GDSHelper(javaGDSImpl0, fBConnectionRequestInfo0, isc_db_handle_impl0, (GDSHelper.GDSHelperErrorListener) null);
      isc_db_handle_impl0.out = isc_db_handle_impl0.out;
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(gDSHelper0, (-157), 16384, isc_stmt_handle_impl0, (FBObjectListener.FetcherListener) null, true);
      fBCachedFetcher0.isEmpty();
      try { 
        fBCachedFetcher0.relative(0);
        fail("Expecting exception: FBDriverNotCapableException");
      
      } catch(FBDriverNotCapableException e) {
         //
         // Result set is TYPE_FORWARD_ONLY
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  /**
  //Test case number: 29
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      XSQLVAR xSQLVAR0 = new XSQLVAR();
      XSQLDA xSQLDA0 = new XSQLDA(0);
      isc_stmt_handle_impl0.setOutSqlda(xSQLDA0);
      isc_stmt_handle_impl0.setAllRowsFetched(true);
      JavaGDSImpl javaGDSImpl0 = new JavaGDSImpl();
      DatabaseParameterBuffer databaseParameterBuffer0 = javaGDSImpl0.createDatabaseParameterBuffer();
      isc_tr_handle_impl isc_tr_handle_impl0 = new isc_tr_handle_impl();
      isc_tr_handle_impl0.getDbHandle();
      GDSHelper gDSHelper0 = new GDSHelper((GDS) null, databaseParameterBuffer0, (IscDbHandle) null, (GDSHelper.GDSHelperErrorListener) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(gDSHelper0, 2, 1, isc_stmt_handle_impl0, (FBObjectListener.FetcherListener) null, true);
      try { 
        fBCachedFetcher0.previous();
        fail("Expecting exception: FBDriverNotCapableException");
      
      } catch(FBDriverNotCapableException e) {
         //
         // Result set is TYPE_FORWARD_ONLY
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      XSQLDA xSQLDA0 = new XSQLDA();
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[1];
      XSQLVAR xSQLVAR0 = new XSQLVAR();
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, (byte[]) null);
      xSQLVARArray0[0] = xSQLVAR0;
      xSQLDA0.sqlvar = xSQLVARArray0;
      isc_stmt_handle_impl0.setOutSqlda(xSQLDA0);
      isc_stmt_handle_impl0.setAllRowsFetched(true);
      JavaGDSImpl javaGDSImpl0 = new JavaGDSImpl();
      DatabaseParameterBufferImp databaseParameterBufferImp0 = new DatabaseParameterBufferImp();
      FBConnectionRequestInfo fBConnectionRequestInfo0 = new FBConnectionRequestInfo(databaseParameterBufferImp0);
      IscDbHandle iscDbHandle0 = javaGDSImpl0.createIscDbHandle();
      GDSHelper gDSHelper0 = new GDSHelper(javaGDSImpl0, fBConnectionRequestInfo0, iscDbHandle0, (GDSHelper.GDSHelperErrorListener) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(gDSHelper0, (-157), 16384, isc_stmt_handle_impl0, (FBObjectListener.FetcherListener) null, true);
      fBCachedFetcher0.isEmpty();
      try { 
        fBCachedFetcher0.last();
        fail("Expecting exception: FBDriverNotCapableException");
      
      } catch(FBDriverNotCapableException e) {
         //
         // Result set is TYPE_FORWARD_ONLY
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }
}