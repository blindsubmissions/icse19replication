/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 14:33:40 GMT 2018
 */

package org.firebirdsql.jdbc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.Reader;
import java.util.LinkedList;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.firebirdsql.gds.XSQLVAR;
import org.firebirdsql.gds.impl.GDSHelper;
import org.firebirdsql.gds.impl.jni.DatabaseParameterBufferImp;
import org.firebirdsql.gds.impl.jni.NativeGDSImpl;
import org.firebirdsql.gds.impl.wire.JavaGDSImpl;
import org.firebirdsql.gds.impl.wire.isc_db_handle_impl;
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
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.isBeforeFirst();
      byte[][] byteArray0 = new byte[4][9];
      byte[] byteArray1 = new byte[7];
      byteArray1[0] = (byte) (-17);
      byteArray1[1] = (byte)29;
      byteArray1[2] = (byte)22;
      byteArray1[3] = (byte) (-101);
      byteArray1[4] = (byte)0;
      byteArray1[5] = (byte) (-121);
      byteArray1[6] = (byte) (-2);
      byteArray0[0] = byteArray1;
      byte[] byteArray2 = new byte[1];
      byteArray2[0] = (byte) (-2);
      byteArray0[1] = byteArray2;
      byte[] byteArray3 = new byte[8];
      byteArray3[0] = (byte) (-101);
      byteArray3[1] = (byte) (-17);
      byteArray3[2] = (byte) (-101);
      byteArray3[3] = (byte)0;
      byteArray3[4] = (byte) (-101);
      byteArray3[5] = (byte) (-101);
      byteArray3[6] = (byte) (-121);
      byteArray3[7] = (byte)22;
      byteArray0[2] = byteArray3;
      byte[] byteArray4 = new byte[6];
      byteArray4[0] = (byte) (-17);
      byteArray4[1] = (byte) (-121);
      byteArray4[2] = (byte) (-121);
      byteArray4[3] = (byte) (-101);
      byteArray4[4] = (byte) (-17);
      byteArray4[5] = (byte) (-2);
      byteArray0[3] = byteArray4;
      linkedList0.add(byteArray0);
      fBCachedFetcher0.first();
      fBCachedFetcher0.isFirst();
      fBCachedFetcher0.close();
      fBCachedFetcher0.setFetchSize(1193);
      assertEquals(1193, fBCachedFetcher0.getFetchSize());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      boolean boolean0 = fBCachedFetcher0.relative(796);
      FBCachedFetcher fBCachedFetcher1 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher1.getFetchSize();
      boolean boolean1 = fBCachedFetcher0.isFirst();
      assertTrue(boolean1 == boolean0);
      
      int int0 = fBCachedFetcher1.getFetchSize();
      assertEquals(0, int0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.1537419427010902
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.isLast();
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
  /*Coverage entropy=2.311810639660203
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.next();
      DatabaseParameterBufferImp databaseParameterBufferImp0 = new DatabaseParameterBufferImp();
      JavaGDSImpl javaGDSImpl0 = new JavaGDSImpl();
      fBCachedFetcher0.absolute(2181);
      fBCachedFetcher0.close();
      fBCachedFetcher0.beforeFirst();
      fBCachedFetcher0.last();
      fBCachedFetcher0.getRowNum();
      fBCachedFetcher0.relative(3411);
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
  //Test case number: 4
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.next();
      fBCachedFetcher0.afterLast();
      fBCachedFetcher0.previous();
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)9;
      byte byte0 = (byte)116;
      byteArray0[1] = (byte)116;
      byteArray0[2] = (byte)56;
      byteArray0[3] = (byte) (-114);
      byteArray0[4] = (byte)26;
      fBCachedFetcher0.isFirst();
      NativeGDSImpl nativeGDSImpl0 = null;
      try {
        nativeGDSImpl0 = new NativeGDSImpl();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      byte[][] byteArray0 = new byte[1][3];
      byte[] byteArray1 = new byte[4];
      byteArray1[0] = (byte)0;
      byteArray1[1] = (byte) (-57);
      byteArray1[2] = (byte)0;
      byteArray1[3] = (byte) (-57);
      byteArray0[0] = byteArray1;
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
  //Test case number: 6
  /*Coverage entropy=2.133095161628389
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.next();
      fBCachedFetcher0.afterLast();
      fBCachedFetcher0.previous();
      fBCachedFetcher0.relative((-192));
      fBCachedFetcher0.previous();
      fBCachedFetcher0.next();
      boolean boolean0 = fBCachedFetcher0.first();
      assertTrue(fBCachedFetcher0.isLast());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.5571130980576455
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[5][0];
      byte[] byteArray1 = new byte[0];
      byteArray0[0] = byteArray1;
      byte[] byteArray2 = new byte[9];
      byteArray2[0] = (byte)53;
      byteArray2[1] = (byte) (-78);
      byteArray2[2] = (byte)53;
      byteArray2[3] = (byte) (-1);
      byteArray2[4] = (byte)1;
      byteArray2[5] = (byte) (-1);
      byteArray2[6] = (byte)28;
      byteArray2[7] = (byte) (-44);
      byteArray2[8] = (byte) (-10);
      byteArray0[1] = byteArray2;
      byte[] byteArray3 = new byte[0];
      byteArray0[2] = byteArray3;
      byte[] byteArray4 = new byte[1];
      byteArray4[0] = (byte) (-1);
      byteArray0[3] = byteArray4;
      byte[] byteArray5 = new byte[9];
      byteArray5[0] = (byte) (-44);
      byteArray5[1] = (byte) (-28);
      byteArray5[2] = (byte)53;
      byteArray5[3] = (byte) (-2);
      byteArray5[4] = (byte)1;
      byteArray5[5] = (byte)53;
      byteArray5[6] = (byte)28;
      byteArray5[7] = (byte) (-1);
      byteArray5[8] = (byte) (-10);
      byteArray0[4] = byteArray5;
      linkedList0.add(byteArray0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.isLast();
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
  /*Coverage entropy=1.5498260458782016
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[4][0];
      byte[] byteArray1 = new byte[4];
      byteArray1[0] = (byte)4;
      byteArray1[1] = (byte)7;
      DelayQueue<Delayed> delayQueue0 = new DelayQueue<Delayed>();
      delayQueue0.peek();
      linkedList0.removeLastOccurrence((Object) null);
      byteArray1[2] = (byte)60;
      byteArray1[3] = (byte) (-26);
      byteArray0[0] = byteArray1;
      byte[] byteArray2 = new byte[5];
      byteArray2[0] = (byte)60;
      byteArray2[1] = (byte)7;
      byteArray2[2] = (byte)60;
      byteArray2[3] = (byte) (-26);
      byteArray2[4] = (byte)4;
      byteArray0[1] = byteArray2;
      byte[] byteArray3 = new byte[4];
      byteArray3[0] = (byte)83;
      byteArray3[1] = (byte)7;
      byteArray3[2] = (byte) (-26);
      byteArray3[3] = (byte) (-26);
      byteArray0[2] = byteArray3;
      byte[] byteArray4 = new byte[5];
      byteArray4[0] = (byte) (-26);
      byteArray4[1] = (byte)4;
      byteArray4[2] = (byte)60;
      byteArray4[3] = (byte)7;
      byteArray4[4] = (byte)7;
      byteArray0[3] = byteArray4;
      linkedList0.add(byteArray0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      assertTrue(fBCachedFetcher0.isBeforeFirst());
      
      byte[][] byteArray5 = new byte[10][3];
      fBCachedFetcher0.updateRow(byteArray5);
      assertFalse(fBCachedFetcher0.isAfterLast());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.8571028374420018
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      linkedList0.stream();
      fBResultSet0.close();
      fBCachedFetcher0.next();
      fBCachedFetcher0.absolute(381);
      fBCachedFetcher0.close();
      fBCachedFetcher0.next();
      fBCachedFetcher0.beforeFirst();
      fBCachedFetcher0.last();
      fBCachedFetcher0.getRowNum();
      fBCachedFetcher0.relative(0);
      FBCachedFetcher fBCachedFetcher1 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher1.next();
      fBCachedFetcher0.isLast();
      fBCachedFetcher0.insertRow((byte[][]) null);
      fBCachedFetcher1.previous();
      fBCachedFetcher0.deleteRow();
      fBCachedFetcher0.updateRow((byte[][]) null);
      fBCachedFetcher0.next();
      fBCachedFetcher0.insertRow((byte[][]) null);
      fBCachedFetcher0.insertRow((byte[][]) null);
      assertTrue(fBCachedFetcher0.isFirst());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.644572431519675
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      linkedList0.stream();
      fBResultSet0.close();
      fBCachedFetcher0.next();
      fBCachedFetcher0.absolute(381);
      fBCachedFetcher0.close();
      linkedList0.iterator();
      fBCachedFetcher0.insertRow((byte[][]) null);
      fBCachedFetcher0.next();
      fBCachedFetcher0.beforeFirst();
      fBCachedFetcher0.last();
      fBCachedFetcher0.getRowNum();
      fBCachedFetcher0.relative(0);
      FBCachedFetcher fBCachedFetcher1 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher1.next();
      fBCachedFetcher0.isLast();
      fBCachedFetcher0.insertRow((byte[][]) null);
      fBCachedFetcher1.previous();
      fBCachedFetcher0.deleteRow();
      fBCachedFetcher0.updateRow((byte[][]) null);
      fBCachedFetcher0.next();
      fBCachedFetcher0.insertRow((byte[][]) null);
      fBCachedFetcher0.insertRow((byte[][]) null);
      // Undeclared exception!
      try { 
        fBCachedFetcher1.deleteRow();
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }
}
