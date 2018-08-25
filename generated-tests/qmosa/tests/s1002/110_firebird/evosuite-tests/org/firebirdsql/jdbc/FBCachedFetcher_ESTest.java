/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 10:19:33 GMT 2018
 */

package org.firebirdsql.jdbc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.SynchronousQueue;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.firebirdsql.gds.XSQLVAR;
import org.firebirdsql.gds.impl.jni.isc_stmt_handle_impl;
import org.firebirdsql.jdbc.FBCachedFetcher;
import org.firebirdsql.jdbc.FBObjectListener;
import org.firebirdsql.jdbc.FBResultSet;
import org.firebirdsql.jdbc.FBSQLException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FBCachedFetcher_ESTest extends FBCachedFetcher_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.getRowNum();
      fBCachedFetcher0.absolute(3398);
      byte[][] byteArray0 = new byte[4][7];
      byte[] byteArray1 = new byte[4];
      byteArray1[0] = (byte) (-119);
      byteArray1[1] = (byte) (-112);
      byteArray1[2] = (byte) (-2);
      linkedList0.add(byteArray0);
      fBCachedFetcher0.isEmpty();
      DelayQueue<Delayed> delayQueue0 = new DelayQueue<Delayed>();
      delayQueue0.poll();
      linkedList0.remove((Object) delayQueue0);
      linkedList0.clear();
      fBCachedFetcher0.getFetchSize();
      SynchronousQueue<Object> synchronousQueue0 = new SynchronousQueue<Object>();
      synchronousQueue0.contains(delayQueue0);
      linkedList0.containsAll(delayQueue0);
      FBCachedFetcher fBCachedFetcher1 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher1.isBeforeFirst();
      fBCachedFetcher1.close();
      fBCachedFetcher1.last();
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

  /**
  //Test case number: 1
  /*Coverage entropy=1.908133893291109
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.relative(610);
      fBCachedFetcher0.previous();
      fBCachedFetcher0.first();
      fBCachedFetcher0.insertRow((byte[][]) null);
      assertTrue(fBCachedFetcher0.isFirst());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.1383972463477248
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.relative(610);
      fBCachedFetcher0.previous();
      fBCachedFetcher0.first();
      linkedList0.add((byte[][]) null);
      fBCachedFetcher0.isEmpty();
      DelayQueue<Delayed> delayQueue0 = new DelayQueue<Delayed>();
      delayQueue0.poll();
      linkedList0.remove((Object) null);
      linkedList0.clear();
      fBCachedFetcher0.getFetchSize();
      SynchronousQueue<Object> synchronousQueue0 = new SynchronousQueue<Object>();
      linkedList0.add((byte[][]) null);
      fBCachedFetcher0.previous();
      fBCachedFetcher0.absolute((-8));
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
  /*Coverage entropy=2.253857589601352
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      linkedList0.sort(comparator0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.relative(610);
      fBCachedFetcher0.previous();
      fBCachedFetcher0.insertRow((byte[][]) null);
      fBCachedFetcher0.first();
      fBCachedFetcher0.updateRow((byte[][]) null);
      assertFalse(fBCachedFetcher0.isAfterLast());
      assertFalse(fBCachedFetcher0.isEmpty());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.relative(610);
      fBCachedFetcher0.previous();
      fBCachedFetcher0.first();
      linkedList0.remove();
      linkedList0.add((byte[][]) null);
      fBCachedFetcher0.isEmpty();
      DelayQueue<Delayed> delayQueue0 = new DelayQueue<Delayed>();
      delayQueue0.poll();
      linkedList0.remove((Object) fBCachedFetcher0);
      LinkedList<byte[][]> linkedList1 = new LinkedList<byte[][]>();
      linkedList1.clear();
      fBCachedFetcher0.getFetchSize();
      SynchronousQueue<Object> synchronousQueue0 = new SynchronousQueue<Object>();
      synchronousQueue0.contains(fBResultSet0);
      LinkedList<byte[][]> linkedList2 = new LinkedList<byte[][]>();
      SynchronousQueue<String> synchronousQueue1 = new SynchronousQueue<String>();
      linkedList2.containsAll(synchronousQueue1);
      fBCachedFetcher0.isBeforeFirst();
      fBCachedFetcher0.close();
      fBCachedFetcher0.last();
      fBCachedFetcher0.relative(61);
      fBCachedFetcher0.isLast();
      fBCachedFetcher0.beforeFirst();
      assertEquals(1, fBCachedFetcher0.getRowNum());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.relative(610);
      fBCachedFetcher0.afterLast();
      fBCachedFetcher0.previous();
      fBCachedFetcher0.first();
      linkedList0.add((byte[][]) null);
      fBCachedFetcher0.isEmpty();
      DelayQueue<Delayed> delayQueue0 = new DelayQueue<Delayed>();
      delayQueue0.poll();
      linkedList0.remove((Object) null);
      linkedList0.clear();
      fBCachedFetcher0.getFetchSize();
      SynchronousQueue<Object> synchronousQueue0 = new SynchronousQueue<Object>();
      synchronousQueue0.contains((Object) null);
      linkedList0.containsAll(synchronousQueue0);
      fBCachedFetcher0.isBeforeFirst();
      // Undeclared exception!
      try { 
        linkedList0.containsAll((Collection<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.AbstractCollection", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.02065988387882
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      linkedList0.add((byte[][]) null);
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.previous();
      fBCachedFetcher0.last();
      FBCachedFetcher fBCachedFetcher1 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher1.last();
      fBCachedFetcher0.deleteRow();
      assertEquals(2, fBCachedFetcher0.getRowNum());
      
      boolean boolean0 = fBCachedFetcher1.isLast();
      assertTrue(boolean0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.70805020110221
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.relative(610);
      fBCachedFetcher0.previous();
      fBCachedFetcher0.first();
      linkedList0.add((byte[][]) null);
      fBCachedFetcher0.isEmpty();
      DelayQueue<Delayed> delayQueue0 = new DelayQueue<Delayed>();
      delayQueue0.poll();
      linkedList0.remove((Object) fBCachedFetcher0);
      LinkedList<byte[][]> linkedList1 = new LinkedList<byte[][]>();
      linkedList1.clear();
      fBCachedFetcher0.getFetchSize();
      SynchronousQueue<Object> synchronousQueue0 = new SynchronousQueue<Object>();
      synchronousQueue0.contains(fBResultSet0);
      LinkedList<byte[][]> linkedList2 = new LinkedList<byte[][]>();
      SynchronousQueue<String> synchronousQueue1 = new SynchronousQueue<String>();
      linkedList2.containsAll(synchronousQueue1);
      fBCachedFetcher0.isBeforeFirst();
      fBCachedFetcher0.close();
      fBCachedFetcher0.last();
      fBCachedFetcher0.isFirst();
      FBCachedFetcher fBCachedFetcher1 = new FBCachedFetcher(linkedList2, fBResultSet0);
      fBCachedFetcher1.insertRow((byte[][]) null);
      fBCachedFetcher0.setFetchSize(610);
      fBCachedFetcher0.next();
      assertFalse(fBCachedFetcher0.isLast());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.getRowNum();
      int int0 = 3398;
      fBCachedFetcher0.absolute(3398);
      byte[][] byteArray0 = new byte[4][7];
      byte[] byteArray1 = new byte[4];
      byteArray1[0] = (byte) (-119);
      DelayQueue<Delayed> delayQueue0 = new DelayQueue<Delayed>();
      delayQueue0.poll();
      Object object0 = new Object();
      linkedList0.remove(object0);
      LinkedList<byte[][]> linkedList1 = new LinkedList<byte[][]>();
      linkedList1.clear();
      FBCachedFetcher fBCachedFetcher1 = new FBCachedFetcher(linkedList1, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher1.getFetchSize();
      SynchronousQueue<Object> synchronousQueue0 = new SynchronousQueue<Object>();
      synchronousQueue0.contains((Object) null);
      LinkedList<byte[][]> linkedList2 = new LinkedList<byte[][]>();
      SynchronousQueue<String> synchronousQueue1 = new SynchronousQueue<String>();
      linkedList2.containsAll(delayQueue0);
      fBCachedFetcher1.isBeforeFirst();
      FBCachedFetcher fBCachedFetcher2 = new FBCachedFetcher(linkedList1, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher2.close();
      fBCachedFetcher0.last();
      fBCachedFetcher1.isFirst();
      FBCachedFetcher fBCachedFetcher3 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
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
  //Test case number: 9
  /*Coverage entropy=2.395908119293929
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.relative(610);
      fBCachedFetcher0.previous();
      fBCachedFetcher0.first();
      linkedList0.add((byte[][]) null);
      fBCachedFetcher0.isEmpty();
      DelayQueue<Delayed> delayQueue0 = new DelayQueue<Delayed>();
      delayQueue0.poll();
      linkedList0.remove((Object) fBCachedFetcher0);
      LinkedList<byte[][]> linkedList1 = new LinkedList<byte[][]>();
      linkedList1.clear();
      fBCachedFetcher0.getFetchSize();
      SynchronousQueue<Object> synchronousQueue0 = new SynchronousQueue<Object>();
      synchronousQueue0.contains(fBResultSet0);
      LinkedList<byte[][]> linkedList2 = new LinkedList<byte[][]>();
      SynchronousQueue<String> synchronousQueue1 = new SynchronousQueue<String>();
      linkedList2.containsAll(synchronousQueue1);
      fBCachedFetcher0.isBeforeFirst();
      fBCachedFetcher0.close();
      fBCachedFetcher0.last();
      fBCachedFetcher0.last();
      fBCachedFetcher0.updateRow((byte[][]) null);
      assertFalse(fBCachedFetcher0.isLast());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.9512595041439564
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      fBResultSet0.last();
      linkedList0.add((byte[][]) null);
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.previous();
      fBCachedFetcher0.updateRow((byte[][]) null);
      fBCachedFetcher0.last();
      fBCachedFetcher0.isEmpty();
      assertTrue(fBCachedFetcher0.isLast());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.17494235218351
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      linkedList0.sort(comparator0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.relative(610);
      fBCachedFetcher0.previous();
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      fBCachedFetcher0.insertRow((byte[][]) null);
      fBCachedFetcher0.absolute((-3871));
      fBCachedFetcher0.next();
      boolean boolean0 = fBCachedFetcher0.previous();
      assertFalse(fBCachedFetcher0.isLast());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.0934737567911332
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.relative(610);
      fBCachedFetcher0.previous();
      linkedList0.add((byte[][]) null);
      fBCachedFetcher0.first();
      FBCachedFetcher fBCachedFetcher1 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.relative((-6));
      fBCachedFetcher1.previous();
      fBCachedFetcher1.insertRow((byte[][]) null);
      fBCachedFetcher1.first();
      fBCachedFetcher0.absolute(62);
      FBCachedFetcher fBCachedFetcher2 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.isEmpty();
      assertFalse(fBCachedFetcher0.isLast());
      
      fBCachedFetcher1.deleteRow();
      assertEquals(0, fBResultSet0.getRow());
  }
}
