/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 14:33:42 GMT 2018
 */

package org.firebirdsql.jdbc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Comparator;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.firebirdsql.gds.XSQLVAR;
import org.firebirdsql.gds.impl.AbstractIscStmtHandle;
import org.firebirdsql.gds.impl.GDSHelper;
import org.firebirdsql.jca.FBManagedConnection;
import org.firebirdsql.jdbc.FBCachedFetcher;
import org.firebirdsql.jdbc.FBConnection;
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
  public void test0()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[4][2];
      linkedList0.add(byteArray0);
      linkedList0.add(byteArray0);
      LinkedList<byte[][]> linkedList1 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList1, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.previous();
      fBCachedFetcher0.isFirst();
      fBCachedFetcher0.beforeFirst();
      fBCachedFetcher0.last();
      fBCachedFetcher0.relative(79);
      linkedList1.toArray((Object[]) byteArray0);
      fBCachedFetcher0.relative((-1761));
      fBCachedFetcher0.isFirst();
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
  /*Coverage entropy=2.38267004824234
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      linkedList0.offerFirst((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBResultSet0.last();
      fBCachedFetcher0.insertRow((byte[][]) null);
      fBCachedFetcher0.setFetchSize(1381);
      fBCachedFetcher0.updateRow((byte[][]) null);
      fBCachedFetcher0.afterLast();
      fBCachedFetcher0.last();
      fBCachedFetcher0.isLast();
      byte[][] byteArray0 = new byte[2][2];
      byte[] byteArray1 = new byte[4];
      linkedList0.sort((Comparator<? super byte[][]>) null);
      byteArray1[0] = (byte)98;
      byteArray1[1] = (byte)69;
      linkedList0.add(byteArray0);
      byteArray1[2] = (byte)38;
      byteArray1[3] = (byte) (-34);
      byteArray0[0] = byteArray1;
      byte[] byteArray2 = new byte[2];
      byteArray2[0] = (byte)69;
      byteArray2[1] = (byte)98;
      byteArray0[1] = byteArray2;
      fBCachedFetcher0.updateRow(byteArray0);
      fBCachedFetcher0.getRowNum();
      fBCachedFetcher0.next();
      fBCachedFetcher0.previous();
      fBCachedFetcher0.absolute(100);
      fBCachedFetcher0.insertRow(byteArray0);
      assertEquals(1381, fBCachedFetcher0.getFetchSize());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.452138386666016
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      linkedList0.offerFirst((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBResultSet0.last();
      fBCachedFetcher0.insertRow((byte[][]) null);
      fBCachedFetcher0.setFetchSize(1381);
      fBCachedFetcher0.updateRow((byte[][]) null);
      fBCachedFetcher0.afterLast();
      fBCachedFetcher0.isLast();
      byte[][] byteArray0 = new byte[2][2];
      byte[] byteArray1 = new byte[4];
      linkedList0.sort((Comparator<? super byte[][]>) null);
      byteArray1[0] = (byte)98;
      byteArray1[1] = (byte)69;
      linkedList0.add(byteArray0);
      byteArray1[2] = (byte)38;
      byteArray1[3] = (byte) (-34);
      byteArray0[0] = byteArray1;
      byte[] byteArray2 = new byte[2];
      byteArray2[0] = (byte)69;
      byteArray2[1] = (byte)98;
      fBCachedFetcher0.previous();
      fBCachedFetcher0.deleteRow();
      fBCachedFetcher0.updateRow((byte[][]) null);
      fBCachedFetcher0.getFetchSize();
      fBCachedFetcher0.next();
      fBCachedFetcher0.relative((-2485));
      byte[][] byteArray3 = new byte[8][6];
      byteArray3[0] = byteArray2;
      byteArray3[1] = byteArray2;
      byteArray3[2] = byteArray1;
      byteArray3[3] = byteArray2;
      byteArray3[4] = byteArray1;
      byteArray3[5] = byteArray2;
      byteArray3[6] = byteArray1;
      byteArray3[7] = byteArray2;
      fBCachedFetcher0.insertRow(byteArray3);
      assertEquals(1381, fBCachedFetcher0.getFetchSize());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.4762471329830333
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      linkedList0.offerFirst((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.insertRow((byte[][]) null);
      fBCachedFetcher0.setFetchSize(1381);
      fBCachedFetcher0.updateRow((byte[][]) null);
      fBCachedFetcher0.afterLast();
      fBCachedFetcher0.last();
      fBCachedFetcher0.isLast();
      byte[][] byteArray0 = new byte[2][2];
      byte[] byteArray1 = new byte[4];
      byteArray1[0] = (byte)98;
      byteArray1[1] = (byte)69;
      linkedList0.add(byteArray0);
      byteArray1[2] = (byte)38;
      byteArray1[3] = (byte) (-34);
      byteArray0[0] = byteArray1;
      byte[] byteArray2 = new byte[2];
      byteArray2[0] = (byte)69;
      byte[][] byteArray3 = new byte[4][4];
      byteArray3[0] = byteArray1;
      byteArray3[1] = byteArray2;
      byteArray3[2] = byteArray1;
      byteArray3[3] = byteArray2;
      linkedList0.add(byteArray3);
      FBCachedFetcher fBCachedFetcher1 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher1.getRowNum();
      fBCachedFetcher0.isLast();
      fBCachedFetcher1.updateRow(byteArray3);
      fBCachedFetcher0.updateRow(byteArray0);
      assertEquals(1381, fBCachedFetcher0.getFetchSize());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.5968338688975634
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      linkedList0.offerFirst((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBResultSet0.last();
      fBCachedFetcher0.insertRow((byte[][]) null);
      fBCachedFetcher0.setFetchSize(1381);
      fBCachedFetcher0.updateRow((byte[][]) null);
      fBCachedFetcher0.afterLast();
      fBCachedFetcher0.isLast();
      byte[][] byteArray0 = new byte[2][2];
      byte[] byteArray1 = new byte[4];
      linkedList0.sort((Comparator<? super byte[][]>) null);
      linkedList0.add(byteArray0);
      byte[][] byteArray2 = new byte[1][9];
      byteArray2[0] = byteArray1;
      fBCachedFetcher0.updateRow(byteArray2);
      fBCachedFetcher0.getRowNum();
      FBCachedFetcher fBCachedFetcher1 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher1.next();
      fBCachedFetcher1.previous();
      boolean boolean0 = fBCachedFetcher0.absolute(2353);
      assertEquals(1381, fBCachedFetcher0.getFetchSize());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.833213344056216
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      linkedList0.offerFirst((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBResultSet0.last();
      fBCachedFetcher0.insertRow((byte[][]) null);
      fBCachedFetcher0.setFetchSize(1381);
      fBCachedFetcher0.updateRow((byte[][]) null);
      fBCachedFetcher0.afterLast();
      fBCachedFetcher0.last();
      fBCachedFetcher0.isLast();
      linkedList0.sort((Comparator<? super byte[][]>) null);
      LinkedList<byte[][]> linkedList1 = new LinkedList<byte[][]>();
      linkedList1.add((byte[][]) null);
      fBCachedFetcher0.previous();
      fBCachedFetcher0.deleteRow();
      fBCachedFetcher0.updateRow((byte[][]) null);
      fBCachedFetcher0.getFetchSize();
      fBCachedFetcher0.next();
      fBCachedFetcher0.afterLast();
      fBCachedFetcher0.relative((-2));
      fBCachedFetcher0.last();
      boolean boolean0 = fBCachedFetcher0.isFirst();
      assertEquals(1381, fBCachedFetcher0.getFetchSize());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[5][2];
      linkedList0.add(byteArray0);
      linkedList0.add(byteArray0);
      FBObjectListener.FetcherListener fBObjectListener_FetcherListener0 = null;
      LinkedList<byte[][]> linkedList1 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList1, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.afterLast();
      fBCachedFetcher0.isLast();
      // Undeclared exception!
      try { 
        linkedList0.sort((Comparator<? super byte[][]>) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // [[B cannot be cast to java.lang.Comparable
         //
         verifyException("java.util.ComparableTimSort", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.1537419427010902
  */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[1][7];
      byte[] byteArray1 = new byte[4];
      byteArray1[0] = (byte)47;
      byteArray1[1] = (byte)82;
      byteArray1[2] = (byte) (-106);
      byteArray1[3] = (byte)0;
      byteArray0[0] = byteArray1;
      linkedList0.add(byteArray0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.close();
      byte[][] byteArray2 = new byte[4][3];
      byte[] byteArray3 = new byte[2];
      byteArray3[0] = (byte)0;
      byteArray3[1] = (byte)47;
      byteArray2[0] = byteArray3;
      byteArray2[1] = byteArray1;
      byte[] byteArray4 = new byte[0];
      byteArray2[2] = byteArray4;
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
}