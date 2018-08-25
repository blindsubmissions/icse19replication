/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 17:11:32 GMT 2018
 */

package org.firebirdsql.jdbc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.InputStream;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.firebirdsql.gds.XSQLVAR;
import org.firebirdsql.gds.impl.AbstractIscStmtHandle;
import org.firebirdsql.gds.impl.GDSHelper;
import org.firebirdsql.gds.impl.jni.isc_stmt_handle_impl;
import org.firebirdsql.jca.FBConnectionRequestInfo;
import org.firebirdsql.jca.FBManagedConnection;
import org.firebirdsql.jdbc.FBCachedFetcher;
import org.firebirdsql.jdbc.FBCallableStatement;
import org.firebirdsql.jdbc.FBConnection;
import org.firebirdsql.jdbc.FBResultSet;
import org.firebirdsql.jdbc.FBSQLException;
import org.firebirdsql.jdbc.InternalTransactionCoordinator;
import org.firebirdsql.jdbc.StoredProcedureMetaData;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FBCachedFetcher_ESTest extends FBCachedFetcher_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.9072839993213795
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      byte[][] byteArray0 = new byte[3][0];
      byte[] byteArray1 = new byte[6];
      byteArray1[0] = (byte) (-33);
      byteArray1[1] = (byte)50;
      byteArray1[2] = (byte)0;
      byteArray1[3] = (byte) (-5);
      byteArray1[4] = (byte)38;
      linkedList0.add(byteArray0);
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      LinkedList<byte[][]> linkedList1 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList1, fBResultSet0);
      boolean boolean0 = fBCachedFetcher0.isBeforeFirst();
      fBCachedFetcher0.beforeFirst();
      boolean boolean1 = fBCachedFetcher0.isAfterLast();
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.isBeforeFirst();
      fBCachedFetcher0.close();
      assertFalse(fBCachedFetcher0.isBeforeFirst());
      assertFalse(fBCachedFetcher0.isFirst());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      boolean boolean0 = fBCachedFetcher0.isBeforeFirst();
      fBCachedFetcher0.isFirst();
      boolean boolean1 = fBCachedFetcher0.absolute(335);
      assertFalse(boolean1);
      
      boolean boolean2 = fBCachedFetcher0.previous();
      assertTrue(boolean2 == boolean0);
      
      fBCachedFetcher0.afterLast();
      int int0 = fBCachedFetcher0.getRowNum();
      assertFalse(fBCachedFetcher0.isFirst());
      assertEquals(0, int0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.0866739010750055
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      byte[][] byteArray0 = new byte[3][0];
      byte[] byteArray1 = new byte[6];
      byteArray1[0] = (byte) (-33);
      byteArray1[1] = (byte)50;
      byteArray1[2] = (byte)0;
      byteArray1[3] = (byte) (-5);
      byteArray1[4] = (byte)38;
      byteArray1[5] = (byte)1;
      byteArray0[0] = byteArray1;
      byte[] byteArray2 = new byte[6];
      byteArray2[0] = (byte)1;
      byteArray2[1] = (byte) (-5);
      byteArray2[2] = (byte)1;
      byteArray2[3] = (byte)50;
      byteArray2[4] = (byte)50;
      byteArray2[5] = (byte)38;
      byteArray0[1] = byteArray2;
      byte[] byteArray3 = new byte[9];
      byteArray3[0] = (byte) (-5);
      byteArray3[1] = (byte) (-5);
      byteArray3[3] = (byte)1;
      linkedList0.add(byteArray0);
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.isBeforeFirst();
      fBCachedFetcher0.beforeFirst();
      boolean boolean0 = fBCachedFetcher0.isAfterLast();
      fBCachedFetcher0.updateRow(byteArray0);
      boolean boolean1 = fBCachedFetcher0.relative((-3377));
      assertTrue(boolean1 == boolean0);
      assertTrue(fBCachedFetcher0.isBeforeFirst());
      assertFalse(boolean1);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.3693821196946767
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      fBResultSet0.isFirst();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.isBeforeFirst();
      fBCachedFetcher0.insertRow((byte[][]) null);
      fBCachedFetcher0.isFirst();
      fBCachedFetcher0.previous();
      fBCachedFetcher0.afterLast();
      assertFalse(fBCachedFetcher0.isLast());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.7140875411870102
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[7][0];
      byte[] byteArray1 = new byte[5];
      byteArray1[0] = (byte) (-2);
      byteArray1[1] = (byte)34;
      byteArray1[2] = (byte)79;
      byteArray1[3] = (byte)0;
      byteArray1[4] = (byte)115;
      byteArray0[0] = byteArray1;
      byte[] byteArray2 = new byte[9];
      byteArray2[0] = (byte)0;
      byteArray2[1] = (byte)79;
      byteArray2[2] = (byte)34;
      byteArray2[3] = (byte)0;
      byteArray2[4] = (byte)79;
      byteArray2[5] = (byte)115;
      byteArray2[6] = (byte) (-2);
      byteArray2[7] = (byte) (-2);
      byteArray2[8] = (byte)115;
      byteArray0[1] = byteArray2;
      byte[] byteArray3 = new byte[3];
      byteArray3[0] = (byte)0;
      byteArray3[1] = (byte) (-2);
      byteArray3[2] = (byte) (-2);
      byteArray0[2] = byteArray3;
      byte[] byteArray4 = new byte[8];
      byteArray4[0] = (byte)0;
      byteArray4[1] = (byte)34;
      byteArray4[2] = (byte) (-112);
      byteArray4[3] = (byte)0;
      byteArray4[4] = (byte)34;
      byteArray4[5] = (byte)115;
      byteArray4[6] = (byte)34;
      byteArray4[7] = (byte)34;
      byteArray0[3] = byteArray4;
      byte[] byteArray5 = new byte[2];
      byteArray5[0] = (byte) (-112);
      byteArray5[1] = (byte) (-2);
      byteArray0[4] = byteArray5;
      byte[] byteArray6 = new byte[9];
      byteArray6[0] = (byte) (-2);
      byteArray6[1] = (byte) (-44);
      byteArray6[2] = (byte)0;
      byteArray6[3] = (byte) (-112);
      byteArray6[4] = (byte) (-112);
      byteArray6[5] = (byte)0;
      byteArray6[6] = (byte)79;
      byteArray6[7] = (byte)0;
      byteArray6[8] = (byte) (-2);
      byteArray0[5] = byteArray6;
      byte[] byteArray7 = new byte[4];
      byteArray7[0] = (byte) (-44);
      byteArray7[1] = (byte) (-44);
      byteArray7[2] = (byte)34;
      byteArray7[3] = (byte) (-44);
      byteArray0[6] = byteArray7;
      linkedList0.add(byteArray0);
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.last();
      fBCachedFetcher0.isBeforeFirst();
      fBCachedFetcher0.deleteRow();
      assertTrue(fBCachedFetcher0.isEmpty());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.7328679513998633
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      boolean boolean0 = fBCachedFetcher0.isBeforeFirst();
      boolean boolean1 = fBCachedFetcher0.isFirst();
      fBCachedFetcher0.previous();
      boolean boolean2 = fBCachedFetcher0.isLast();
      assertTrue(boolean2);
      assertFalse(boolean2 == boolean1);
      
      boolean boolean3 = fBCachedFetcher0.previous();
      assertTrue(boolean3 == boolean0);
      assertFalse(boolean3);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.351673301904631
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      linkedList0.parallelStream();
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.isFirst();
      linkedList0.toArray();
      fBCachedFetcher0.previous();
      fBCachedFetcher0.afterLast();
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
  //Test case number: 8
  /*Coverage entropy=2.403640410614949
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      fBResultSet0.isFirst();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.isBeforeFirst();
      fBCachedFetcher0.insertRow((byte[][]) null);
      fBCachedFetcher0.absolute(335544353);
      fBCachedFetcher0.previous();
      fBCachedFetcher0.afterLast();
      assertEquals(2, fBCachedFetcher0.getRowNum());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      linkedList0.parallelStream();
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.absolute((-1903));
      boolean boolean0 = fBCachedFetcher0.previous();
      fBCachedFetcher0.afterLast();
      fBCachedFetcher0.getFetchSize();
      boolean boolean1 = fBCachedFetcher0.relative((-1903));
      assertTrue(boolean1 == boolean0);
      
      int int0 = fBCachedFetcher0.getFetchSize();
      assertFalse(fBCachedFetcher0.isAfterLast());
      assertEquals(0, int0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.979204517434325
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      byte[][] byteArray0 = new byte[2][0];
      byte[] byteArray1 = new byte[0];
      byteArray0[0] = byteArray1;
      byte[] byteArray2 = new byte[3];
      byteArray2[0] = (byte)19;
      byteArray2[1] = (byte)1;
      byteArray2[2] = (byte) (-7);
      byteArray0[1] = byteArray2;
      linkedList0.offerLast(byteArray0);
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      FBResultSet fBResultSet1 = new FBResultSet(fBResultSet0.xsqlvars, linkedList0);
      FBCachedFetcher fBCachedFetcher1 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.isBeforeFirst();
      fBCachedFetcher0.isFirst();
      fBCachedFetcher0.previous();
      fBCachedFetcher0.next();
      fBCachedFetcher0.deleteRow();
      assertTrue(fBCachedFetcher0.isEmpty());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.9899913100731523
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      byte[][] byteArray0 = new byte[3][1];
      byte[] byteArray1 = new byte[3];
      byteArray1[0] = (byte)1;
      byteArray1[1] = (byte) (-5);
      byteArray1[2] = (byte)38;
      byteArray0[0] = byteArray1;
      byte[] byteArray2 = new byte[7];
      byteArray2[0] = (byte)1;
      byteArray2[1] = (byte) (-5);
      byteArray2[2] = (byte)1;
      byteArray2[3] = (byte) (-53);
      byteArray2[4] = (byte)1;
      byteArray2[5] = (byte)38;
      byteArray2[6] = (byte)38;
      byteArray0[1] = byteArray2;
      byte[] byteArray3 = new byte[5];
      byteArray3[0] = (byte) (-53);
      byteArray3[1] = (byte)38;
      byteArray3[2] = (byte)1;
      byteArray3[3] = (byte)1;
      byteArray3[4] = (byte) (-53);
      byteArray0[2] = byteArray3;
      linkedList0.add(byteArray0);
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.isBeforeFirst();
      fBCachedFetcher0.beforeFirst();
      boolean boolean0 = fBCachedFetcher0.isAfterLast();
      assertFalse(boolean0);
      assertFalse(fBCachedFetcher0.isLast());
      
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher1 = new FBCachedFetcher(linkedList0, fBResultSet0);
      boolean boolean1 = fBCachedFetcher1.isLast();
      assertFalse(boolean1);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.2581044308027463
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      fBResultSet0.isFirst();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.isBeforeFirst();
      fBCachedFetcher0.insertRow((byte[][]) null);
      fBCachedFetcher0.setFetchSize((-3155));
      fBCachedFetcher0.insertRow((byte[][]) null);
      fBCachedFetcher0.absolute(335);
      fBCachedFetcher0.previous();
      fBCachedFetcher0.afterLast();
      assertFalse(fBCachedFetcher0.isLast());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.2551692628794053
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[3][7];
      byte[] byteArray1 = new byte[2];
      byteArray1[0] = (byte) (-3);
      byteArray1[1] = (byte) (-79);
      byteArray0[0] = byteArray1;
      byte[] byteArray2 = new byte[0];
      byteArray0[1] = byteArray2;
      byte[] byteArray3 = new byte[7];
      byteArray3[0] = (byte) (-79);
      byteArray3[1] = (byte) (-3);
      byteArray3[2] = (byte) (-79);
      byteArray3[3] = (byte)33;
      byteArray3[4] = (byte) (-79);
      byteArray3[5] = (byte) (-79);
      byteArray3[6] = (byte) (-3);
      byteArray0[2] = byteArray3;
      linkedList0.add(byteArray0);
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      fBResultSet0.isFirst();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.isBeforeFirst();
      fBCachedFetcher0.insertRow((byte[][]) null);
      fBCachedFetcher0.previous();
      fBCachedFetcher0.next();
      fBCachedFetcher0.deleteRow();
      boolean boolean0 = fBCachedFetcher0.relative(100);
      assertFalse(fBCachedFetcher0.isBeforeFirst());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.273965716419247
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      fBResultSet0.isFirst();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.isBeforeFirst();
      fBCachedFetcher0.insertRow((byte[][]) null);
      FBCachedFetcher fBCachedFetcher1 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher1.previous();
      fBCachedFetcher1.next();
      Class<InputStream> class0 = InputStream.class;
      fBResultSet0.isWrapperFor(class0);
      fBCachedFetcher0.absolute(800);
      fBCachedFetcher0.next();
      FBCachedFetcher fBCachedFetcher2 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher1.isBeforeFirst();
      fBCachedFetcher0.updateRow((byte[][]) null);
      fBCachedFetcher2.isAfterLast();
      fBCachedFetcher0.isFirst();
      int int0 = 2749;
      FBConnection fBConnection0 = null;
      try {
        fBConnection0 = new FBConnection((FBManagedConnection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.AbstractConnection", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.977006172908861
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      fBResultSet0.isFirst();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.isBeforeFirst();
      fBCachedFetcher0.insertRow((byte[][]) null);
      fBCachedFetcher0.updateRow((byte[][]) null);
      FBCachedFetcher fBCachedFetcher1 = new FBCachedFetcher(linkedList0, fBResultSet0);
      FBCachedFetcher fBCachedFetcher2 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher2.absolute(1611);
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
}
