/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 15:40:51 GMT 2018
 */

package org.firebirdsql.jdbc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.LinkedList;
import java.util.concurrent.SynchronousQueue;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.firebirdsql.gds.XSQLVAR;
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
      byte[][] byteArray0 = new byte[8][2];
      byte[] byteArray1 = new byte[2];
      byteArray1[0] = (byte)56;
      byteArray1[1] = (byte)0;
      byteArray0[0] = byteArray1;
      byte[] byteArray2 = new byte[5];
      byteArray2[0] = (byte)56;
      byteArray2[1] = (byte)0;
      byteArray2[2] = (byte)56;
      byteArray2[3] = (byte)56;
      byteArray2[4] = (byte)56;
      byteArray0[1] = byteArray2;
      byte[] byteArray3 = new byte[7];
      byteArray3[0] = (byte)0;
      byteArray3[1] = (byte)0;
      byteArray3[2] = (byte)0;
      byteArray3[3] = (byte)56;
      byteArray3[4] = (byte)56;
      byteArray3[5] = (byte)56;
      byteArray3[6] = (byte)0;
      byteArray0[2] = byteArray3;
      byte[] byteArray4 = new byte[4];
      byteArray4[0] = (byte)56;
      byteArray4[1] = (byte)56;
      byteArray4[2] = (byte)56;
      byteArray4[3] = (byte)0;
      byteArray0[3] = byteArray4;
      byte[] byteArray5 = new byte[5];
      byteArray5[0] = (byte)0;
      byteArray5[1] = (byte)56;
      byteArray5[2] = (byte)56;
      byteArray5[3] = (byte)56;
      byteArray5[4] = (byte)0;
      byteArray0[4] = byteArray5;
      byte[] byteArray6 = new byte[2];
      byteArray6[0] = (byte)56;
      byteArray6[1] = (byte)0;
      byteArray0[5] = byteArray6;
      byte[] byteArray7 = new byte[6];
      byteArray7[0] = (byte)0;
      byteArray7[1] = (byte)0;
      byteArray7[2] = (byte)56;
      byteArray7[3] = (byte)0;
      byteArray7[4] = (byte)0;
      byteArray7[5] = (byte)0;
      byteArray0[6] = byteArray7;
      byte[] byteArray8 = new byte[3];
      byteArray8[0] = (byte)0;
      byteArray8[1] = (byte)56;
      byteArray8[2] = (byte)0;
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
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.isEmpty();
      fBCachedFetcher0.first();
      fBCachedFetcher0.last();
      fBCachedFetcher0.isEmpty();
      boolean boolean0 = fBCachedFetcher0.absolute(371);
      assertFalse(boolean0);
      
      fBCachedFetcher0.close();
      assertTrue(fBCachedFetcher0.isLast());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.isEmpty();
      linkedList0.offer((byte[][]) null);
      FBCachedFetcher fBCachedFetcher1 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher1.afterLast();
      fBCachedFetcher1.isLast();
      FBCachedFetcher fBCachedFetcher2 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher2.relative(72);
      fBCachedFetcher2.absolute((-431));
      fBCachedFetcher2.first();
      int int0 = fBCachedFetcher1.getRowNum();
      assertEquals(2, int0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.2420052954825502
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.isEmpty();
      linkedList0.offer((byte[][]) null);
      FBCachedFetcher fBCachedFetcher1 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher1.afterLast();
      boolean boolean0 = fBCachedFetcher0.isLast();
      fBCachedFetcher1.updateRow((byte[][]) null);
      assertEquals(2, fBCachedFetcher1.getRowNum());
      
      fBCachedFetcher0.relative((-431));
      fBCachedFetcher1.absolute((-431));
      fBCachedFetcher0.first();
      boolean boolean1 = fBCachedFetcher0.relative((-431));
      assertFalse(boolean1 == boolean0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      byte[][] byteArray0 = new byte[5][8];
      byte[] byteArray1 = new byte[2];
      byteArray1[0] = (byte) (-2);
      byteArray1[1] = (byte)5;
      byteArray0[0] = byteArray1;
      byte[] byteArray2 = new byte[1];
      byteArray2[0] = (byte) (-2);
      byteArray0[1] = byteArray2;
      byte[] byteArray3 = new byte[7];
      byteArray3[0] = (byte) (-2);
      byteArray3[1] = (byte) (-2);
      byteArray3[2] = (byte) (-2);
      byteArray3[3] = (byte)5;
      byteArray3[4] = (byte)5;
      byteArray3[5] = (byte) (-2);
      byteArray3[6] = (byte)5;
      byteArray0[2] = byteArray3;
      byte[] byteArray4 = new byte[3];
      byteArray4[0] = (byte)5;
      byteArray4[1] = (byte) (-2);
      byteArray4[2] = (byte) (-2);
      byteArray0[3] = byteArray4;
      byte[] byteArray5 = new byte[3];
      byteArray5[0] = (byte) (-2);
      byteArray5[1] = (byte)123;
      byteArray5[2] = (byte) (-2);
      byteArray0[4] = byteArray5;
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
  //Test case number: 5
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.isEmpty();
      boolean boolean0 = fBCachedFetcher0.first();
      assertFalse(boolean0);
      
      fBCachedFetcher0.isEmpty();
      int int0 = fBCachedFetcher0.getFetchSize();
      assertEquals(0, int0);
      
      fBCachedFetcher0.beforeFirst();
      assertEquals(0, fBCachedFetcher0.getRowNum());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.isEmpty();
      fBCachedFetcher0.previous();
      linkedList0.offer((byte[][]) null);
      FBCachedFetcher fBCachedFetcher1 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher1.afterLast();
      fBCachedFetcher0.isLast();
      fBCachedFetcher1.isLast();
      fBCachedFetcher0.setFetchSize(400);
      assertEquals(400, fBCachedFetcher0.getFetchSize());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      SynchronousQueue<byte[][]> synchronousQueue0 = new SynchronousQueue<byte[][]>();
      linkedList0.addAll((Collection<? extends byte[][]>) synchronousQueue0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      assertFalse(fBCachedFetcher0.isBeforeFirst());
      
      boolean boolean0 = fBCachedFetcher0.first();
      boolean boolean1 = fBCachedFetcher0.isFirst();
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.5498260458782016
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.isEmpty();
      assertFalse(fBCachedFetcher0.isAfterLast());
      
      linkedList0.offer((byte[][]) null);
      FBResultSet fBResultSet1 = new FBResultSet(fBResultSet0.xsqlvars, linkedList0);
      FBCachedFetcher fBCachedFetcher1 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher1.updateRow((byte[][]) null);
      assertFalse(fBCachedFetcher1.isAfterLast());
      assertTrue(fBCachedFetcher1.isBeforeFirst());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.447151308277912
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.isEmpty();
      linkedList0.offer((byte[][]) null);
      FBCachedFetcher fBCachedFetcher1 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher1.next();
      fBCachedFetcher1.beforeFirst();
      fBCachedFetcher1.afterLast();
      fBCachedFetcher0.isLast();
      fBCachedFetcher1.last();
      fBCachedFetcher0.isEmpty();
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
  //Test case number: 10
  /*Coverage entropy=2.299450484962775
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.isEmpty();
      linkedList0.offer((byte[][]) null);
      FBCachedFetcher fBCachedFetcher1 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher1.beforeFirst();
      fBCachedFetcher1.afterLast();
      fBCachedFetcher0.isLast();
      fBCachedFetcher1.insertRow((byte[][]) null);
      assertFalse(fBCachedFetcher1.isBeforeFirst());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBObjectListener.FetcherListener fBObjectListener_FetcherListener0 = null;
      byte[][] byteArray0 = new byte[8][2];
      byte[] byteArray1 = new byte[2];
      byteArray1[0] = (byte)56;
      byteArray1[1] = (byte)0;
      byteArray0[0] = byteArray1;
      byteArray0[1] = byteArray1;
      byte[] byteArray2 = new byte[7];
      byteArray2[0] = (byte)0;
      LinkedList<byte[][]> linkedList1 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList1, (FBObjectListener.FetcherListener) null);
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
  //Test case number: 12
  /*Coverage entropy=2.3152412852180704
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.isEmpty();
      linkedList0.offer((byte[][]) null);
      FBCachedFetcher fBCachedFetcher1 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher1.beforeFirst();
      fBCachedFetcher0.afterLast();
      fBCachedFetcher0.isLast();
      fBCachedFetcher1.next();
      fBCachedFetcher0.absolute(288);
      fBCachedFetcher1.deleteRow();
      assertTrue(fBCachedFetcher1.isEmpty());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.4657680061377407
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      linkedList0.poll();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.isEmpty();
      linkedList0.offer((byte[][]) null);
      FBCachedFetcher fBCachedFetcher1 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher1.beforeFirst();
      fBCachedFetcher0.afterLast();
      fBCachedFetcher0.isLast();
      fBCachedFetcher1.next();
      fBCachedFetcher1.insertRow((byte[][]) null);
      fBCachedFetcher0.absolute(3689);
      fBCachedFetcher1.deleteRow();
      boolean boolean0 = fBCachedFetcher1.relative(3689);
      assertFalse(fBCachedFetcher1.isBeforeFirst());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.previous();
      fBCachedFetcher0.relative(6768);
      assertFalse(fBCachedFetcher0.isBeforeFirst());
      
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher1 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher1.absolute(6768);
      fBCachedFetcher1.first();
      fBCachedFetcher1.isFirst();
      boolean boolean0 = fBCachedFetcher1.last();
      assertTrue(boolean0);
  }
}
