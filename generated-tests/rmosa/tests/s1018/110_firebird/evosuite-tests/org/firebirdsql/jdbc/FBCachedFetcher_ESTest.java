/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 13:45:31 GMT 2018
 */

package org.firebirdsql.jdbc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.Reader;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.function.Consumer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.firebirdsql.gds.XSQLVAR;
import org.firebirdsql.gds.impl.GDSHelper;
import org.firebirdsql.gds.impl.jni.EmbeddedGDSImpl;
import org.firebirdsql.gds.impl.jni.isc_db_handle_impl;
import org.firebirdsql.gds.impl.jni.isc_stmt_handle_impl;
import org.firebirdsql.gds.impl.wire.DatabaseParameterBufferImp;
import org.firebirdsql.jca.FBConnectionRequestInfo;
import org.firebirdsql.jdbc.FBCachedFetcher;
import org.firebirdsql.jdbc.FBObjectListener;
import org.firebirdsql.jdbc.FBResultSet;
import org.firebirdsql.jdbc.FBResultSetNotUpdatableException;
import org.firebirdsql.jdbc.FBSQLException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FBCachedFetcher_ESTest extends FBCachedFetcher_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.15374194270109
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      LinkedHashSet<byte[][]> linkedHashSet0 = new LinkedHashSet<byte[][]>(632);
      linkedList0.addAll((Collection<? extends byte[][]>) linkedHashSet0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.absolute((-472));
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
  //Test case number: 1
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      fBResultSet0.close();
      assertTrue(fBResultSet0.isClosed());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBObjectListener.FetcherListener fBObjectListener_FetcherListener0 = null;
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
  /*Coverage entropy=1.6094379124341003
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      assertTrue(fBCachedFetcher0.isEmpty());
      
      fBCachedFetcher0.beforeFirst();
      boolean boolean0 = fBCachedFetcher0.first();
      assertFalse(boolean0);
      assertTrue(fBCachedFetcher0.isLast());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.2130075659799042
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      linkedList0.add((byte[][]) null);
      boolean boolean0 = fBCachedFetcher0.relative((-1372));
      assertFalse(boolean0);
      assertTrue(fBCachedFetcher0.isLast());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.setFetchSize((-1324));
      assertEquals((-1324), fBCachedFetcher0.getFetchSize());
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
      FileSystemHandling.shouldAllThrowIOExceptions();
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.isFirst();
      FileSystemHandling.shouldAllThrowIOExceptions();
      try { 
        fBResultSet0.rowDeleted();
        fail("Expecting exception: FBResultSetNotUpdatableException");
      
      } catch(FBResultSetNotUpdatableException e) {
         //
         // Underlying ResultSet is not updatable.
         //
         verifyException("org.firebirdsql.jdbc.AbstractResultSet", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.499030672979008
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.isBeforeFirst();
      byte[][] byteArrayArray0 = null;
      linkedList0.add((byte[][]) null);
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
  //Test case number: 8
  /*Coverage entropy=1.4270610433807245
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      linkedList0.push((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      linkedList0.add((byte[][]) null);
      // Undeclared exception!
      try { 
        fBCachedFetcher0.relative((-1372));
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
  /*Coverage entropy=1.5403058252265167
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[0][6];
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
  //Test case number: 10
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.next();
      fBCachedFetcher0.isFirst();
      String string0 = ")7I:{vUyt*A b";
      try { 
        fBResultSet0.getCharacterStream(")7I:{vUyt*A b");
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // The resultSet is not in a row, use next
         //
         verifyException("org.firebirdsql.jdbc.AbstractResultSet", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.7677614722893293
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      linkedList0.add((byte[][]) null);
      linkedList0.add((byte[][]) null);
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      linkedList0.add((byte[][]) null);
      LinkedList<byte[][]> linkedList1 = new LinkedList<byte[][]>();
      linkedList1.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList1, fBResultSet0);
      fBCachedFetcher0.next();
      boolean boolean0 = fBCachedFetcher0.relative(85);
      assertEquals(2, fBCachedFetcher0.getRowNum());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.5403058252265167
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.last();
      fBCachedFetcher0.afterLast();
      // Undeclared exception!
      try { 
        linkedList0.subList(379, 379);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // toIndex = 379
         //
         verifyException("java.util.SubList", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      int int0 = fBCachedFetcher0.getFetchSize();
      assertEquals(0, int0);
      assertEquals(0, fBCachedFetcher0.getRowNum());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.499030672979008
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      LinkedList<byte[][]> linkedList1 = new LinkedList<byte[][]>();
      linkedList1.push((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList1, fBResultSet0);
      fBCachedFetcher0.updateRow((byte[][]) null);
      System.setCurrentTimeMillis(338L);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      System.setCurrentTimeMillis(0L);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      byte[][] byteArray0 = new byte[1][1];
      byte[] byteArray1 = new byte[9];
      byteArray1[0] = (byte) (-126);
      byteArray1[1] = (byte)67;
      byteArray1[2] = (byte)86;
      byteArray1[3] = (byte) (-51);
      byteArray1[4] = (byte) (-44);
      byteArray1[5] = (byte)21;
      byteArray1[6] = (byte)1;
      byteArray1[7] = (byte) (-112);
      byteArray1[8] = (byte)4;
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
  //Test case number: 16
  /*Coverage entropy=1.3296613488547582
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      System.setCurrentTimeMillis(0L);
      linkedList0.add((byte[][]) null);
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
  //Test case number: 17
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.isLast();
      System.setCurrentTimeMillis((-1L));
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[0][2];
      linkedList0.add(byteArray0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.isLast();
      System.setCurrentTimeMillis((-1L));
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.next();
      byte[] byteArray0 = new byte[5];
      linkedList0.add((byte[][]) null);
      byteArray0[0] = (byte)9;
      byteArray0[1] = (byte)116;
      byteArray0[2] = (byte) (-114);
      FileSystemHandling.shouldAllThrowIOExceptions();
      fBCachedFetcher0.next();
      boolean boolean0 = fBCachedFetcher0.previous();
      assertTrue(fBCachedFetcher0.isFirst());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.insertRow((byte[][]) null);
      fBCachedFetcher0.insertRow((byte[][]) null);
      assertFalse(fBCachedFetcher0.isLast());
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
      linkedList0.push((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.absolute(1326);
      fBCachedFetcher0.updateRow((byte[][]) null);
      assertEquals(2, fBCachedFetcher0.getRowNum());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.next();
      fBCachedFetcher0.deleteRow();
      assertTrue(fBCachedFetcher0.isEmpty());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.7201934592198251
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[5][2];
      byte[] byteArray1 = new byte[7];
      byteArray1[0] = (byte)0;
      byteArray1[1] = (byte)78;
      byteArray1[2] = (byte)56;
      byteArray1[3] = (byte) (-74);
      byteArray1[4] = (byte)0;
      byteArray1[5] = (byte) (-112);
      byteArray1[6] = (byte)113;
      byteArray0[0] = byteArray1;
      byte[] byteArray2 = new byte[9];
      byteArray2[0] = (byte)113;
      byteArray2[1] = (byte)78;
      byteArray2[2] = (byte)113;
      byteArray2[3] = (byte)56;
      byteArray2[4] = (byte)14;
      byteArray2[5] = (byte)102;
      byteArray2[6] = (byte)0;
      byteArray2[7] = (byte) (-112);
      byteArray2[8] = (byte)78;
      byteArray0[1] = byteArray2;
      byte[] byteArray3 = new byte[1];
      byteArray3[0] = (byte)78;
      byteArray0[2] = byteArray3;
      byte[] byteArray4 = new byte[6];
      byteArray4[0] = (byte)78;
      byteArray4[1] = (byte)102;
      byteArray4[2] = (byte)102;
      byteArray4[3] = (byte)0;
      byteArray4[4] = (byte) (-112);
      byteArray4[5] = (byte)78;
      byteArray0[3] = byteArray4;
      byte[] byteArray5 = new byte[7];
      byteArray5[0] = (byte) (-74);
      byteArray5[1] = (byte)14;
      byteArray5[2] = (byte)0;
      byteArray5[3] = (byte)0;
      byteArray5[4] = (byte) (-112);
      byteArray5[5] = (byte) (-112);
      byteArray5[6] = (byte) (-74);
      byteArray0[4] = byteArray5;
      linkedList0.add(byteArray0);
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      byte[][] byteArray6 = new byte[1][5];
      byte[] byteArray7 = new byte[17];
      byteArray7[0] = (byte) (-107);
      byteArray7[1] = (byte)3;
      byteArray6[0] = byteArray7;
      linkedList0.add(byteArray6);
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.next();
      fBCachedFetcher0.deleteRow();
      assertFalse(fBCachedFetcher0.isBeforeFirst());
  }
}
