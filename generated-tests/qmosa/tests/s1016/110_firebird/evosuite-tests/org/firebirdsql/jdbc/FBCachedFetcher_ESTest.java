/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 14:10:29 GMT 2018
 */

package org.firebirdsql.jdbc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.concurrent.SynchronousQueue;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.firebirdsql.gds.DatabaseParameterBuffer;
import org.firebirdsql.gds.GDS;
import org.firebirdsql.gds.IscDbHandle;
import org.firebirdsql.gds.XSQLVAR;
import org.firebirdsql.gds.impl.AbstractIscStmtHandle;
import org.firebirdsql.gds.impl.GDSHelper;
import org.firebirdsql.gds.impl.GDSType;
import org.firebirdsql.gds.impl.jni.EmbeddedGDSImpl;
import org.firebirdsql.gds.impl.jni.isc_db_handle_impl;
import org.firebirdsql.gds.impl.jni.isc_stmt_handle_impl;
import org.firebirdsql.gds.impl.wire.DatabaseParameterBufferImp;
import org.firebirdsql.gds.impl.wire.JavaGDSImpl;
import org.firebirdsql.jca.FBConnectionRequestInfo;
import org.firebirdsql.jca.FBManagedConnection;
import org.firebirdsql.jdbc.DummyCallableStatementMetaData;
import org.firebirdsql.jdbc.FBCachedFetcher;
import org.firebirdsql.jdbc.FBCallableStatement;
import org.firebirdsql.jdbc.FBConnection;
import org.firebirdsql.jdbc.FBObjectListener;
import org.firebirdsql.jdbc.FBResultSet;
import org.firebirdsql.jdbc.FBSQLException;
import org.firebirdsql.jdbc.InternalTransactionCoordinator;
import org.firebirdsql.jdbc.field.FBLongVarCharField;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FBCachedFetcher_ESTest extends FBCachedFetcher_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      linkedList0.parallelStream();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.setFetchSize((-1788));
      fBCachedFetcher0.close();
      fBCachedFetcher0.first();
      fBCachedFetcher0.getRowNum();
      fBCachedFetcher0.previous();
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
  //Test case number: 1
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      SynchronousQueue<Object> synchronousQueue0 = new SynchronousQueue<Object>();
      linkedList0.retainAll(synchronousQueue0);
      FBLongVarCharField[] fBLongVarCharFieldArray0 = new FBLongVarCharField[0];
      linkedList0.toArray(fBLongVarCharFieldArray0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.afterLast();
      int int0 = 0;
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
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.isFirst();
      fBCachedFetcher0.getRowNum();
      byte[][] byteArray0 = new byte[4][0];
      byte[] byteArray1 = new byte[5];
      byteArray1[0] = (byte) (-9);
      byteArray1[1] = (byte) (-4);
      byteArray1[2] = (byte)26;
      byteArray1[3] = (byte)49;
      byteArray1[4] = (byte)16;
      byteArray0[0] = byteArray1;
      byte[] byteArray2 = new byte[2];
      byteArray2[0] = (byte) (-9);
      byteArray2[1] = (byte) (-4);
      byteArray0[1] = byteArray2;
      byte[] byteArray3 = new byte[3];
      byteArray3[0] = (byte)16;
      byteArray3[1] = (byte) (-4);
      byteArray3[2] = (byte) (-9);
      byteArray0[2] = byteArray3;
      byte[] byteArray4 = new byte[1];
      byteArray4[0] = (byte) (-4);
      byteArray0[3] = byteArray4;
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
  //Test case number: 3
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      LinkedList<byte[][]> linkedList1 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList1, fBResultSet0);
      byte[][] byteArray0 = new byte[9][2];
      byte[] byteArray1 = new byte[2];
      byteArray1[0] = (byte) (-2);
      byteArray1[1] = (byte)86;
      byteArray0[0] = byteArray1;
      byte[] byteArray2 = new byte[1];
      byteArray2[0] = (byte)86;
      byteArray0[1] = byteArray2;
      byte[] byteArray3 = new byte[0];
      byteArray0[2] = byteArray3;
      byte[] byteArray4 = new byte[7];
      byteArray4[0] = (byte)14;
      byteArray4[1] = (byte)77;
      byteArray4[2] = (byte) (-2);
      byteArray4[3] = (byte) (-2);
      byteArray4[4] = (byte)86;
      byteArray4[5] = (byte)86;
      byteArray4[6] = (byte)86;
      byteArray0[3] = byteArray4;
      byte[] byteArray5 = new byte[7];
      byteArray5[0] = (byte) (-2);
      byteArray5[1] = (byte)77;
      byteArray5[2] = (byte)19;
      byteArray5[3] = (byte)1;
      byteArray5[4] = (byte)86;
      byteArray5[5] = (byte)14;
      byteArray5[6] = (byte) (-2);
      byteArray0[4] = byteArray5;
      byte[] byteArray6 = new byte[9];
      byteArray6[0] = (byte)77;
      byteArray6[1] = (byte)19;
      byteArray6[2] = (byte) (-124);
      byteArray6[3] = (byte)77;
      byteArray6[4] = (byte)77;
      byteArray6[5] = (byte)1;
      byteArray6[6] = (byte) (-2);
      byteArray6[7] = (byte)77;
      byteArray6[8] = (byte)19;
      byteArray0[5] = byteArray6;
      byte[] byteArray7 = new byte[4];
      byteArray7[0] = (byte)19;
      byteArray7[1] = (byte)1;
      byteArray7[2] = (byte)14;
      byteArray7[3] = (byte)21;
      byteArray0[6] = byteArray7;
      byte[] byteArray8 = new byte[1];
      byteArray8[0] = (byte)19;
      byteArray0[7] = byteArray8;
      byte[] byteArray9 = new byte[5];
      byteArray9[0] = (byte)14;
      byteArray9[1] = (byte)86;
      byteArray9[2] = (byte)19;
      byteArray9[3] = (byte)77;
      byteArray9[4] = (byte)21;
      byteArray0[8] = byteArray9;
      linkedList0.add(byteArray0);
      fBCachedFetcher0.insertRow((byte[][]) null);
      boolean boolean0 = fBCachedFetcher0.isFirst();
      assertEquals(0, fBResultSet0.getRow());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.791759469228055
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.beforeFirst();
      boolean boolean0 = fBCachedFetcher0.isLast();
      assertTrue(boolean0);
      assertFalse(fBCachedFetcher0.isBeforeFirst());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.isBeforeFirst();
      fBCachedFetcher0.relative((-2));
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
  //Test case number: 6
  /*Coverage entropy=2.176185661560307
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.absolute(2210);
      assertEquals(2, fBCachedFetcher0.getRowNum());
      
      fBCachedFetcher0.beforeFirst();
      fBCachedFetcher0.updateRow((byte[][]) null);
      assertTrue(fBCachedFetcher0.isBeforeFirst());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.1639556568820564
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      linkedList0.add((byte[][]) null);
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.afterLast();
      int int0 = 0;
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
  //Test case number: 8
  /*Coverage entropy=2.0866739010750055
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[2][2];
      byte[] byteArray1 = new byte[4];
      byteArray1[0] = (byte)103;
      byteArray1[1] = (byte)1;
      byteArray1[2] = (byte) (-45);
      byteArray1[3] = (byte) (-3);
      byteArray0[0] = byteArray1;
      byte[] byteArray2 = new byte[5];
      byteArray2[0] = (byte)1;
      byteArray2[1] = (byte)1;
      byteArray2[2] = (byte)1;
      byteArray2[3] = (byte) (-3);
      byteArray2[4] = (byte) (-3);
      byteArray0[1] = byteArray2;
      linkedList0.add(byteArray0);
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.beforeFirst();
      fBCachedFetcher0.isLast();
      // Undeclared exception!
      try { 
        fBCachedFetcher0.deleteRow();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.8065071652616695
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      linkedList0.addLast((byte[][]) null);
      linkedList0.addLast((byte[][]) null);
      linkedList0.listIterator();
      fBCachedFetcher0.relative(65535);
      fBCachedFetcher0.insertRow((byte[][]) null);
      boolean boolean0 = fBCachedFetcher0.isLast();
      assertEquals(2, fBCachedFetcher0.getRowNum());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.8288411561741993
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      linkedList0.pollLast();
      linkedList0.pollFirst();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.isLast();
      fBCachedFetcher0.insertRow((byte[][]) null);
      boolean boolean0 = fBCachedFetcher0.relative((-998));
      assertFalse(fBCachedFetcher0.isFirst());
      assertFalse(fBCachedFetcher0.isLast());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.253857589601352
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      linkedList0.add((byte[][]) null);
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.afterLast();
      int int0 = 6232;
      fBCachedFetcher0.relative(6232);
      fBCachedFetcher0.updateRow((byte[][]) null);
      GDSType.getType("9hQqpB");
      EmbeddedGDSImpl embeddedGDSImpl0 = null;
      try {
        embeddedGDSImpl0 = new EmbeddedGDSImpl((GDSType) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      linkedList0.add((byte[][]) null);
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.relative((-1561));
      fBCachedFetcher0.afterLast();
      int int0 = 0;
      fBCachedFetcher0.getFetchSize();
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
  //Test case number: 13
  /*Coverage entropy=1.9730014063936125
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      int int0 = 105;
      fBCachedFetcher0.absolute(105);
      fBCachedFetcher0.previous();
      fBCachedFetcher0.absolute(393);
      fBCachedFetcher0.last();
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

  /**
  //Test case number: 14
  /*Coverage entropy=2.264928636268562
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      linkedList0.add((byte[][]) null);
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.afterLast();
      FBCachedFetcher fBCachedFetcher1 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.isLast();
      fBCachedFetcher0.insertRow((byte[][]) null);
      assertFalse(fBCachedFetcher0.isBeforeFirst());
      
      fBCachedFetcher1.first();
      fBCachedFetcher1.deleteRow();
      assertFalse(fBCachedFetcher1.isLast());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.264928636268562
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      linkedList0.add((byte[][]) null);
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.afterLast();
      assertFalse(fBCachedFetcher0.isBeforeFirst());
      
      FBCachedFetcher fBCachedFetcher1 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher1.isLast();
      fBCachedFetcher1.insertRow((byte[][]) null);
      FBCachedFetcher fBCachedFetcher2 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher2.first();
      fBCachedFetcher1.deleteRow();
      assertFalse(fBCachedFetcher1.isAfterLast());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.253857589601352
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      linkedList0.add((byte[][]) null);
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.isLast();
      fBCachedFetcher0.insertRow((byte[][]) null);
      FBCachedFetcher fBCachedFetcher1 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.deleteRow();
      assertTrue(fBCachedFetcher0.isLast());
      
      fBCachedFetcher1.next();
      fBCachedFetcher1.relative(786);
      assertFalse(fBCachedFetcher1.isBeforeFirst());
  }
}
