/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 11:41:03 GMT 2018
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
import org.firebirdsql.gds.XSQLVAR;
import org.firebirdsql.gds.impl.AbstractIscStmtHandle;
import org.firebirdsql.gds.impl.GDSHelper;
import org.firebirdsql.jca.FBManagedConnection;
import org.firebirdsql.jca.FirebirdLocalTransaction;
import org.firebirdsql.jdbc.DummyCallableStatementMetaData;
import org.firebirdsql.jdbc.FBCachedFetcher;
import org.firebirdsql.jdbc.FBCallableStatement;
import org.firebirdsql.jdbc.FBConnection;
import org.firebirdsql.jdbc.FBObjectListener;
import org.firebirdsql.jdbc.FBResultSet;
import org.firebirdsql.jdbc.FBSQLException;
import org.firebirdsql.jdbc.InternalTransactionCoordinator;
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
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      FBResultSet fBResultSet1 = new FBResultSet(fBResultSet0.xsqlvars, linkedList0);
      FBCachedFetcher fBCachedFetcher1 = new FBCachedFetcher(linkedList0, fBResultSet0);
      int int0 = fBCachedFetcher0.getRowNum();
      assertEquals(0, int0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.isEmpty();
      fBCachedFetcher0.close();
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
  //Test case number: 2
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      boolean boolean0 = fBCachedFetcher0.previous();
      assertFalse(boolean0);
      
      boolean boolean1 = fBCachedFetcher0.relative((-1880));
      boolean boolean2 = fBCachedFetcher0.isLast();
      assertFalse(boolean2 == boolean1);
      assertFalse(fBCachedFetcher0.isBeforeFirst());
      assertTrue(boolean2);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.setFetchSize((-148));
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
  /*Coverage entropy=1.9061547465398496
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      boolean boolean0 = fBCachedFetcher0.previous();
      assertFalse(boolean0);
      
      boolean boolean1 = fBCachedFetcher0.relative((-1880));
      boolean boolean2 = fBCachedFetcher0.isLast();
      assertTrue(boolean2 == boolean1);
      assertTrue(fBCachedFetcher0.isBeforeFirst());
      assertFalse(boolean2);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.first();
      fBCachedFetcher0.getFetchSize();
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
  //Test case number: 6
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      assertFalse(fBCachedFetcher0.isBeforeFirst());
      
      boolean boolean0 = fBCachedFetcher0.next();
      boolean boolean1 = fBCachedFetcher0.absolute((-2371));
      assertTrue(boolean1 == boolean0);
      assertFalse(fBCachedFetcher0.isFirst());
      assertFalse(boolean1);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.9072839993213795
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.close();
      boolean boolean0 = fBCachedFetcher0.first();
      assertFalse(boolean0);
      
      fBCachedFetcher0.afterLast();
      assertTrue(fBCachedFetcher0.isLast());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.isEmpty();
      fBCachedFetcher0.insertRow((byte[][]) null);
      fBCachedFetcher0.close();
      fBCachedFetcher0.absolute(10);
      fBCachedFetcher0.isFirst();
      fBCachedFetcher0.insertRow((byte[][]) null);
      assertFalse(fBCachedFetcher0.isEmpty());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.isEmpty();
      fBCachedFetcher0.close();
      boolean boolean0 = fBCachedFetcher0.absolute(10);
      boolean boolean1 = fBCachedFetcher0.isFirst();
      assertTrue(boolean1 == boolean0);
      
      fBCachedFetcher0.beforeFirst();
      assertFalse(fBCachedFetcher0.isFirst());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.1537419427010902
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      byte[][] byteArrayArray0 = null;
      linkedList0.add((byte[][]) null);
      fBCachedFetcher0.close();
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
  //Test case number: 11
  /*Coverage entropy=2.0253262207700673
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.isEmpty();
      fBCachedFetcher0.insertRow((byte[][]) null);
      fBCachedFetcher0.absolute(10);
      fBCachedFetcher0.isFirst();
      fBCachedFetcher0.insertRow((byte[][]) null);
      System.setCurrentTimeMillis(10);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.7045514452672972
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.isEmpty();
      fBCachedFetcher0.insertRow((byte[][]) null);
      fBCachedFetcher0.deleteRow();
      assertFalse(fBCachedFetcher0.isLast());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.1639556568820564
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.isEmpty();
      fBCachedFetcher0.insertRow((byte[][]) null);
      assertFalse(fBCachedFetcher0.isEmpty());
      
      fBCachedFetcher0.close();
      fBCachedFetcher0.absolute(16);
      fBCachedFetcher0.updateRow((byte[][]) null);
      assertFalse(fBCachedFetcher0.isBeforeFirst());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.8438614379613667
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[4][9];
      byte[] byteArray1 = new byte[0];
      byteArray0[0] = byteArray1;
      byte[] byteArray2 = new byte[7];
      byteArray2[0] = (byte) (-84);
      byteArray2[1] = (byte)8;
      byteArray2[2] = (byte)10;
      byteArray2[3] = (byte)110;
      byteArray2[4] = (byte)81;
      byteArray2[5] = (byte)8;
      byteArray2[6] = (byte)99;
      byteArray0[1] = byteArray2;
      byte[] byteArray3 = new byte[7];
      byteArray3[0] = (byte)10;
      byteArray3[1] = (byte)8;
      byteArray3[2] = (byte)8;
      byteArray3[3] = (byte)10;
      byteArray3[4] = (byte)8;
      byteArray3[5] = (byte)110;
      byteArray3[6] = (byte)10;
      byteArray0[2] = byteArray3;
      byte[] byteArray4 = new byte[5];
      byteArray4[0] = (byte)110;
      byteArray4[1] = (byte)81;
      byteArray4[2] = (byte)8;
      byteArray4[3] = (byte)110;
      byteArray4[4] = (byte) (-62);
      byteArray0[3] = byteArray4;
      linkedList0.add(byteArray0);
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.isEmpty();
      fBCachedFetcher0.first();
      fBCachedFetcher0.insertRow(fBResultSet0.row);
      fBCachedFetcher0.deleteRow();
      assertTrue(fBCachedFetcher0.isLast());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.055586143763578
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.previous();
      fBCachedFetcher0.next();
      assertTrue(fBCachedFetcher0.isLast());
      
      fBCachedFetcher0.relative((-2357));
      fBCachedFetcher0.updateRow((byte[][]) null);
      assertEquals(0, fBCachedFetcher0.getRowNum());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.2102535776209735
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      byte[][] byteArray0 = new byte[0][6];
      linkedList0.add(byteArray0);
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.absolute(2819);
      fBCachedFetcher0.previous();
      fBCachedFetcher0.next();
      fBCachedFetcher0.relative(247);
      boolean boolean0 = fBCachedFetcher0.isLast();
      assertEquals(2, fBCachedFetcher0.getRowNum());
      assertFalse(boolean0);
  }
}
