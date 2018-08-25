/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 06:39:14 GMT 2018
 */

package org.firebirdsql.jdbc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.firebirdsql.gds.XSQLVAR;
import org.firebirdsql.gds.impl.GDSHelper;
import org.firebirdsql.gds.impl.jni.isc_stmt_handle_impl;
import org.firebirdsql.gds.impl.wire.DatabaseParameterBufferImp;
import org.firebirdsql.gds.impl.wire.JavaGDSImpl;
import org.firebirdsql.gds.impl.wire.XdrOutputStream;
import org.firebirdsql.jca.FBConnectionRequestInfo;
import org.firebirdsql.jca.FBManagedConnection;
import org.firebirdsql.jdbc.FBCachedFetcher;
import org.firebirdsql.jdbc.FBConnection;
import org.firebirdsql.jdbc.FBDriverNotCapableException;
import org.firebirdsql.jdbc.FBObjectListener;
import org.firebirdsql.jdbc.FBResultSet;
import org.firebirdsql.jdbc.FBSQLException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FBCachedFetcher_ESTest extends FBCachedFetcher_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.close();
      boolean boolean0 = FileSystemHandling.shouldAllThrowIOExceptions();
      assertTrue(boolean0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.1490596969706202
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      assertTrue(fBCachedFetcher0.isEmpty());
      
      fBCachedFetcher0.relative(788);
      boolean boolean0 = fBCachedFetcher0.relative((-2));
      assertFalse(boolean0);
      
      fBCachedFetcher0.isEmpty();
      assertFalse(fBCachedFetcher0.isFirst());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
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
  //Test case number: 3
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
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
  //Test case number: 4
  /*Coverage entropy=1.5498260458782016
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JavaGDSImpl javaGDSImpl0 = new JavaGDSImpl();
      DatabaseParameterBufferImp databaseParameterBufferImp0 = new DatabaseParameterBufferImp();
      databaseParameterBufferImp0.write((XdrOutputStream) null);
      FBConnectionRequestInfo fBConnectionRequestInfo0 = new FBConnectionRequestInfo(databaseParameterBufferImp0);
      GDSHelper.GDSHelperErrorListener gDSHelper_GDSHelperErrorListener0 = mock(GDSHelper.GDSHelperErrorListener.class, new ViolatedAssumptionAnswer());
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      byte[][] byteArray0 = new byte[4][9];
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
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
  //Test case number: 5
  /*Coverage entropy=1.698782989513801
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.setFetchSize(250);
      fBCachedFetcher0.afterLast();
      fBCachedFetcher0.last();
      boolean boolean0 = fBCachedFetcher0.last();
      assertEquals(250, fBCachedFetcher0.getFetchSize());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.6094379124341003
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      linkedList0.removeFirstOccurrence((Object) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.beforeFirst();
      boolean boolean0 = fBCachedFetcher0.first();
      assertFalse(fBCachedFetcher0.isAfterLast());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.4270610433807245
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[9][5];
      byte[] byteArray1 = new byte[1];
      byteArray1[0] = (byte) (-2);
      byteArray0[0] = byteArray1;
      byte[] byteArray2 = new byte[4];
      byteArray2[0] = (byte) (-2);
      byteArray2[1] = (byte) (-2);
      byteArray2[2] = (byte) (-2);
      byteArray2[3] = (byte)33;
      byteArray0[1] = byteArray2;
      byte[] byteArray3 = new byte[3];
      byteArray3[0] = (byte)0;
      byteArray3[1] = (byte)33;
      byteArray3[2] = (byte)33;
      byteArray0[2] = byteArray3;
      byte[] byteArray4 = new byte[3];
      byteArray4[0] = (byte) (-2);
      byteArray4[1] = (byte)0;
      byteArray4[2] = (byte) (-25);
      byteArray0[3] = byteArray4;
      byte[] byteArray5 = new byte[6];
      byteArray5[0] = (byte)0;
      byteArray5[1] = (byte) (-25);
      byteArray5[2] = (byte) (-2);
      byteArray5[3] = (byte) (-25);
      byteArray5[4] = (byte)33;
      byteArray5[5] = (byte) (-2);
      byteArray0[4] = byteArray5;
      byte[] byteArray6 = new byte[2];
      byteArray6[0] = (byte) (-2);
      byteArray6[1] = (byte)33;
      byteArray0[5] = byteArray6;
      byte[] byteArray7 = new byte[8];
      byteArray7[0] = (byte)0;
      byteArray7[1] = (byte) (-25);
      byteArray7[2] = (byte)0;
      byteArray7[3] = (byte) (-25);
      byteArray7[4] = (byte)0;
      byteArray7[5] = (byte) (-105);
      byteArray7[6] = (byte) (-25);
      byteArray7[7] = (byte) (-25);
      byteArray0[6] = byteArray7;
      byte[] byteArray8 = new byte[1];
      byteArray8[0] = (byte)33;
      byteArray0[7] = byteArray8;
      byte[] byteArray9 = new byte[5];
      byteArray9[0] = (byte) (-2);
      byteArray9[1] = (byte) (-21);
      byteArray9[2] = (byte) (-105);
      byteArray9[3] = (byte) (-2);
      byteArray9[4] = (byte)33;
      byteArray0[8] = byteArray9;
      linkedList0.add(byteArray0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      // Undeclared exception!
      try { 
        fBCachedFetcher0.relative((-2));
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
  /*Coverage entropy=1.5247073930301436
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      LinkedList<byte[][]> linkedList1 = new LinkedList<byte[][]>();
      linkedList1.clone();
      linkedList1.add((byte[][]) null);
      linkedList1.addFirst((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList1, (FBObjectListener.FetcherListener) null);
      // Undeclared exception!
      try { 
        fBCachedFetcher0.last();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      boolean boolean0 = fBCachedFetcher0.last();
      assertFalse(boolean0);
      
      int int0 = fBCachedFetcher0.getRowNum();
      assertEquals(0, int0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      linkedList0.clone();
      byte[][] byteArray0 = new byte[0][2];
      linkedList0.add(byteArray0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      boolean boolean0 = fBCachedFetcher0.isLast();
      assertFalse(boolean0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      int int0 = fBCachedFetcher0.getFetchSize();
      assertEquals(0, int0);
      assertTrue(fBCachedFetcher0.isLast());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[2][4];
      byte[] byteArray1 = new byte[6];
      byteArray1[0] = (byte) (-1);
      byteArray1[0] = (byte) (-38);
      byteArray1[3] = (byte)47;
      byteArray1[4] = (byte)111;
      byteArray1[5] = (byte)28;
      byteArray0[0] = byteArray1;
      byte[] byteArray2 = new byte[5];
      byteArray2[0] = (byte) (-38);
      byteArray2[2] = (byte)47;
      byteArray2[3] = (byte)47;
      byteArray2[4] = (byte)47;
      byteArray0[1] = byteArray2;
      linkedList0.addLast(byteArray0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      assertTrue(fBCachedFetcher0.isBeforeFirst());
      
      byte[][] byteArray3 = new byte[0][4];
      fBCachedFetcher0.updateRow(byteArray3);
      assertFalse(fBCachedFetcher0.isAfterLast());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      linkedList0.removeFirstOccurrence((Object) null);
      byte[][] byteArray0 = new byte[1][5];
      byte[] byteArray1 = new byte[8];
      byteArray1[0] = (byte)56;
      byte[][] byteArray2 = new byte[8][9];
      byteArray2[0] = byteArray1;
      byteArray2[3] = byteArray1;
      byte[] byteArray3 = new byte[0];
      byteArray2[6] = byteArray3;
      byteArray2[7] = byteArray1;
      linkedList0.add(byteArray2);
      byteArray1[4] = (byte)0;
      byteArray1[6] = (byte)45;
      byteArray0[0] = byteArray1;
      linkedList0.add(byteArray0);
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.previous();
      fBCachedFetcher0.isFirst();
      fBCachedFetcher0.next();
      FileSystemHandling.shouldAllThrowIOExceptions();
      boolean boolean0 = fBCachedFetcher0.isFirst();
      assertFalse(fBCachedFetcher0.isBeforeFirst());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FileSystemHandling.shouldAllThrowIOExceptions();
      byte[][] byteArray0 = new byte[1][5];
      byte[] byteArray1 = new byte[0];
      linkedList0.add(byteArray0);
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.shouldAllThrowIOExceptions();
      fBCachedFetcher0.next();
      FileSystemHandling.shouldAllThrowIOExceptions();
      fBCachedFetcher0.deleteRow();
      fBCachedFetcher0.isEmpty();
      boolean boolean0 = fBCachedFetcher0.isEmpty();
      assertTrue(boolean0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.7201934592198251
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FileSystemHandling.shouldAllThrowIOExceptions();
      byte[][] byteArray0 = new byte[1][5];
      byte[][] byteArray1 = new byte[8][9];
      byte[] byteArray2 = new byte[0];
      byteArray1[6] = byteArray2;
      linkedList0.add(byteArray1);
      linkedList0.add(byteArray0);
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.shouldAllThrowIOExceptions();
      fBCachedFetcher0.next();
      FileSystemHandling.shouldAllThrowIOExceptions();
      fBCachedFetcher0.deleteRow();
      int int0 = 766;
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      try { 
        fBResultSet0.updateBlob(766, (InputStream) pipedInputStream0);
        fail("Expecting exception: FBDriverNotCapableException");
      
      } catch(FBDriverNotCapableException e) {
         //
         // Not yet implemented.
         //
         verifyException("org.firebirdsql.jdbc.AbstractResultSet", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FileSystemHandling.shouldAllThrowIOExceptions();
      byte[][] byteArray0 = new byte[1][5];
      byte[][] byteArray1 = new byte[8][9];
      byte[] byteArray2 = new byte[0];
      byteArray1[6] = byteArray2;
      FileSystemHandling.shouldAllThrowIOExceptions();
      linkedList0.add(byteArray0);
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.shouldAllThrowIOExceptions();
      fBCachedFetcher0.next();
      FileSystemHandling.shouldAllThrowIOExceptions();
      fBCachedFetcher0.next();
      // Undeclared exception!
      try { 
        fBCachedFetcher0.deleteRow();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FileSystemHandling.shouldAllThrowIOExceptions();
      byte[][] byteArray0 = new byte[1][5];
      byte[] byteArray1 = new byte[0];
      linkedList0.add(byteArray0);
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.shouldAllThrowIOExceptions();
      fBCachedFetcher0.next();
      FileSystemHandling.shouldAllThrowIOExceptions();
      fBCachedFetcher0.next();
      fBCachedFetcher0.isEmpty();
      fBCachedFetcher0.isEmpty();
      fBCachedFetcher0.isEmpty();
      fBCachedFetcher0.insertRow(byteArray0);
      assertFalse(fBCachedFetcher0.isBeforeFirst());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.0161537172613797
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JavaGDSImpl javaGDSImpl0 = new JavaGDSImpl();
      DatabaseParameterBufferImp databaseParameterBufferImp0 = new DatabaseParameterBufferImp();
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      linkedList0.listIterator();
      fBCachedFetcher0.insertRow((byte[][]) null);
      fBCachedFetcher0.isLast();
      fBCachedFetcher0.relative((-168));
      fBCachedFetcher0.relative(58);
      fBCachedFetcher0.updateRow((byte[][]) null);
      assertEquals(2, fBCachedFetcher0.getRowNum());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FileSystemHandling.shouldAllThrowIOExceptions();
      byte[][] byteArray0 = new byte[1][5];
      byte[][] byteArray1 = new byte[8][9];
      byte[] byteArray2 = new byte[0];
      byteArray1[6] = byteArray2;
      linkedList0.add(byteArray1);
      linkedList0.add(byteArray0);
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.shouldAllThrowIOExceptions();
      fBCachedFetcher0.next();
      fBCachedFetcher0.next();
      fBCachedFetcher0.previous();
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      FBManagedConnection fBManagedConnection0 = mock(FBManagedConnection.class, new ViolatedAssumptionAnswer());
      doReturn((FBConnectionRequestInfo) null).when(fBManagedConnection0).getConnectionRequestInfo();
      FBConnection fBConnection0 = null;
      try {
        fBConnection0 = new FBConnection(fBManagedConnection0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.AbstractConnection", e);
      }
  }
}