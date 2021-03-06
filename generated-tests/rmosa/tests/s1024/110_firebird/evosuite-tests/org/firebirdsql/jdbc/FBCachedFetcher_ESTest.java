/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 16:35:29 GMT 2018
 */

package org.firebirdsql.jdbc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.firebirdsql.gds.DatabaseParameterBuffer;
import org.firebirdsql.gds.IscDbHandle;
import org.firebirdsql.gds.XSQLVAR;
import org.firebirdsql.gds.impl.GDSHelper;
import org.firebirdsql.gds.impl.GDSType;
import org.firebirdsql.gds.impl.jni.LocalGDSImpl;
import org.firebirdsql.gds.impl.jni.isc_tr_handle_impl;
import org.firebirdsql.gds.impl.wire.isc_stmt_handle_impl;
import org.firebirdsql.jca.FBManagedConnectionFactory;
import org.firebirdsql.jdbc.FBCachedFetcher;
import org.firebirdsql.jdbc.FBConnectionProperties;
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
      byte[][] byteArray0 = new byte[6][6];
      byte[] byteArray1 = new byte[3];
      byteArray1[2] = (byte)1;
      byte[] byteArray2 = new byte[2];
      byteArray2[0] = (byte)1;
      byteArray2[1] = (byte)1;
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      int int0 = fBCachedFetcher0.getRowNum();
      assertEquals(0, int0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.6313454208085967
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      assertTrue(fBCachedFetcher0.isEmpty());
      
      fBCachedFetcher0.last();
      fBCachedFetcher0.afterLast();
      boolean boolean0 = fBCachedFetcher0.relative((-1022));
      assertFalse(boolean0);
      
      fBCachedFetcher0.isEmpty();
      assertTrue(fBCachedFetcher0.isLast());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[5][4];
      byte[] byteArray1 = new byte[0];
      byteArray0[0] = byteArray1;
      byte[] byteArray2 = new byte[2];
      byteArray2[0] = (byte) (-44);
      byteArray0[1] = byteArray2;
      byte[] byteArray3 = new byte[3];
      byteArray3[0] = (byte)0;
      byteArray0[2] = byteArray3;
      byte[] byteArray4 = new byte[5];
      byteArray4[0] = (byte)108;
      byteArray4[1] = (byte)108;
      byteArray4[2] = (byte)0;
      byteArray2[0] = (byte)0;
      byteArray0[3] = byteArray4;
      byte[] byteArray5 = new byte[2];
      byteArray5[0] = (byte)0;
      byteArray0[4] = byteArray5;
      linkedList0.add(byteArray0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      try { 
        fBCachedFetcher0.absolute((byte)0);
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
  /*Coverage entropy=1.1490596969706202
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      linkedList0.removeLastOccurrence(fBCachedFetcher0);
      fBCachedFetcher0.relative((-15));
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-15);
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte) (-87);
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte) (-12);
      byteArray0[5] = (byte) (-1);
      byteArray0[6] = (byte)90;
      byteArray0[7] = (byte)50;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      linkedList0.removeLastOccurrence((Object) null);
      fBCachedFetcher0.relative(12);
      boolean boolean0 = fBCachedFetcher0.relative((byte) (-1));
      assertFalse(boolean0);
      assertEquals(0, fBCachedFetcher0.getRowNum());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.close();
      boolean boolean0 = FileSystemHandling.shouldAllThrowIOExceptions();
      assertTrue(boolean0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.setFetchSize(2067);
      assertEquals(2067, fBCachedFetcher0.getFetchSize());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.3592367006650066
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[0][6];
      linkedList0.add(byteArray0);
      FBObjectListener.FetcherListener fBObjectListener_FetcherListener0 = null;
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      linkedList0.removeLastOccurrence(fBCachedFetcher0);
      // Undeclared exception!
      try { 
        fBCachedFetcher0.relative((-15));
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
  /*Coverage entropy=1.5403058252265167
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[6][7];
      byte[] byteArray1 = new byte[5];
      byteArray1[0] = (byte) (-32);
      byteArray1[1] = (byte) (-44);
      byteArray1[2] = (byte)0;
      byteArray1[3] = (byte) (-2);
      byteArray1[4] = (byte) (-105);
      byteArray0[0] = byteArray1;
      byte[] byteArray2 = new byte[3];
      byteArray2[0] = (byte) (-105);
      byteArray2[1] = (byte)0;
      byteArray2[2] = (byte) (-44);
      byteArray0[1] = byteArray2;
      byte[] byteArray3 = new byte[6];
      byteArray3[0] = (byte) (-2);
      byteArray3[1] = (byte)0;
      byteArray3[2] = (byte) (-44);
      byteArray3[3] = (byte)0;
      byteArray3[4] = (byte) (-2);
      byteArray3[5] = (byte) (-44);
      byteArray0[2] = byteArray3;
      byte[] byteArray4 = new byte[2];
      byteArray4[0] = (byte) (-44);
      byteArray4[1] = (byte)0;
      byteArray0[3] = byteArray4;
      byte[] byteArray5 = new byte[2];
      byteArray5[0] = (byte) (-32);
      byteArray5[1] = (byte) (-44);
      byteArray0[4] = byteArray5;
      byte[] byteArray6 = new byte[9];
      byteArray6[0] = (byte) (-2);
      byteArray6[1] = (byte) (-44);
      byteArray6[2] = (byte) (-2);
      byteArray6[3] = (byte) (-44);
      byteArray6[4] = (byte) (-44);
      byteArray6[5] = (byte) (-105);
      byteArray6[6] = (byte) (-44);
      byteArray6[7] = (byte) (-2);
      byteArray6[8] = (byte) (-44);
      byteArray0[5] = byteArray6;
      linkedList0.add(byteArray0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
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
  /*Coverage entropy=1.6094379124341003
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.beforeFirst();
      boolean boolean0 = fBCachedFetcher0.first();
      assertFalse(boolean0);
      
      fBCachedFetcher0.isEmpty();
      assertEquals(0, fBCachedFetcher0.getRowNum());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.5498260458782016
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
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
  //Test case number: 11
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      linkedList0.stream();
      byte[][] byteArray0 = new byte[4][3];
      byte[] byteArray1 = new byte[2];
      byteArray1[1] = (byte) (-86);
      byteArray0[0] = byteArray1;
      byte[] byteArray2 = new byte[2];
      byteArray2[0] = (byte) (-86);
      byteArray0[1] = byteArray2;
      byte[] byteArray3 = new byte[0];
      byteArray0[2] = byteArray3;
      byte[] byteArray4 = new byte[1];
      byteArray4[0] = (byte) (-86);
      byteArray0[3] = byteArray4;
      linkedList0.add(byteArray0);
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.next();
      fBCachedFetcher0.next();
      // Undeclared exception!
      try { 
        fBCachedFetcher0.deleteRow();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      boolean boolean0 = fBCachedFetcher0.isFirst();
      assertFalse(boolean0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      linkedList0.iterator();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      boolean boolean0 = fBCachedFetcher0.isLast();
      assertTrue(boolean0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[0][9];
      linkedList0.add(byteArray0);
      linkedList0.iterator();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      boolean boolean0 = fBCachedFetcher0.isLast();
      assertFalse(boolean0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)0;
      LinkedList<byte[][]> linkedList1 = new LinkedList<byte[][]>();
      linkedList0.spliterator();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList1, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.getFetchSize();
      System.setCurrentTimeMillis((byte)0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      linkedList0.addFirst((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      assertTrue(fBCachedFetcher0.isBeforeFirst());
      
      fBCachedFetcher0.updateRow((byte[][]) null);
      assertFalse(fBCachedFetcher0.isAfterLast());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      linkedList0.stream();
      byte[][] byteArray0 = new byte[4][3];
      byte[] byteArray1 = new byte[2];
      byteArray1[1] = (byte) (-86);
      byteArray0[0] = byteArray1;
      byte[] byteArray2 = new byte[2];
      byteArray2[0] = (byte) (-86);
      byteArray0[1] = byteArray2;
      byte[] byteArray3 = new byte[0];
      byteArray0[2] = byteArray3;
      byte[] byteArray4 = new byte[1];
      byteArray4[0] = (byte) (-86);
      byteArray0[3] = byteArray4;
      linkedList0.add(byteArray0);
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.next();
      fBCachedFetcher0.deleteRow();
      linkedList0.add((byte[][]) null);
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
  //Test case number: 18
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      linkedList0.stream();
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.insertRow((byte[][]) null);
      FileSystemHandling.shouldAllThrowIOExceptions();
      fBCachedFetcher0.isFirst();
      try { 
        fBResultSet0.getArray(1036);
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
  /*Coverage entropy=1.6631355916141728
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      linkedList0.stream();
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.insertRow((byte[][]) null);
      fBCachedFetcher0.insertRow((byte[][]) null);
      linkedList0.add((byte[][]) null);
      fBCachedFetcher0.deleteRow();
      linkedList0.add((byte[][]) null);
      fBCachedFetcher0.isEmpty();
      assertEquals(1, fBCachedFetcher0.getRowNum());
      
      fBCachedFetcher0.deleteRow();
      assertTrue(fBCachedFetcher0.isAfterLast());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.previous();
      fBCachedFetcher0.relative(100);
      boolean boolean0 = fBCachedFetcher0.previous();
      assertTrue(fBCachedFetcher0.isLast());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher1 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher1.absolute(35);
      fBCachedFetcher1.updateRow((byte[][]) null);
      GDSType.getType("org.firebirdsql.jdbc.FBCachedFetcher");
      LocalGDSImpl localGDSImpl0 = null;
      try {
        localGDSImpl0 = new LocalGDSImpl((GDSType) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
      }
  }
}
