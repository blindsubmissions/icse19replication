/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 13:59:41 GMT 2018
 */

package org.firebirdsql.jdbc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.function.Predicate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.firebirdsql.gds.impl.GDSHelper;
import org.firebirdsql.gds.impl.jni.isc_stmt_handle_impl;
import org.firebirdsql.jca.FBConnectionRequestInfo;
import org.firebirdsql.jca.FBManagedConnection;
import org.firebirdsql.jdbc.FBCachedFetcher;
import org.firebirdsql.jdbc.FBConnection;
import org.firebirdsql.jdbc.FBFetcher;
import org.firebirdsql.jdbc.FBObjectListener;
import org.firebirdsql.jdbc.FBSQLException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FBCachedFetcher_ESTest extends FBCachedFetcher_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      linkedList0.clear();
      fBCachedFetcher0.last();
      byte[][] byteArray0 = new byte[8][0];
      byte[] byteArray1 = new byte[6];
      byteArray1[0] = (byte)98;
      byteArray1[1] = (byte)25;
      byteArray1[2] = (byte)107;
      byteArray1[3] = (byte)39;
      byteArray1[4] = (byte)34;
      byteArray1[5] = (byte) (-69);
      byteArray0[0] = byteArray1;
      byte[] byteArray2 = new byte[8];
      byteArray2[0] = (byte) (-59);
      byteArray2[1] = (byte)98;
      byteArray2[2] = (byte)39;
      byteArray2[3] = (byte)107;
      byteArray2[4] = (byte)34;
      byteArray2[5] = (byte)98;
      byteArray2[6] = (byte)107;
      byteArray2[7] = (byte)100;
      byteArray0[1] = byteArray2;
      byte[] byteArray3 = new byte[8];
      byteArray3[0] = (byte) (-59);
      byteArray3[1] = (byte)25;
      byteArray3[2] = (byte)107;
      byteArray3[3] = (byte)34;
      byteArray3[4] = (byte)34;
      byteArray3[5] = (byte)25;
      byteArray3[6] = (byte) (-69);
      byteArray3[7] = (byte) (-59);
      byteArray0[2] = byteArray3;
      byte[] byteArray4 = new byte[8];
      byteArray4[0] = (byte)107;
      byteArray4[1] = (byte) (-59);
      byteArray4[2] = (byte) (-122);
      byteArray4[3] = (byte)98;
      byteArray4[4] = (byte)39;
      byteArray4[5] = (byte)25;
      byteArray4[6] = (byte)39;
      byteArray4[7] = (byte)107;
      byteArray0[3] = byteArray4;
      byte[] byteArray5 = new byte[0];
      byteArray0[4] = byteArray5;
      byte[] byteArray6 = new byte[3];
      byteArray6[0] = (byte)50;
      byteArray6[1] = (byte) (-59);
      byteArray6[2] = (byte)107;
      byteArray0[5] = byteArray6;
      byte[] byteArray7 = new byte[1];
      byteArray7[0] = (byte)50;
      byteArray0[6] = byteArray7;
      byte[] byteArray8 = new byte[6];
      byteArray8[0] = (byte)34;
      byteArray8[1] = (byte)107;
      byteArray8[2] = (byte)98;
      byteArray8[3] = (byte)107;
      byteArray8[4] = (byte) (-122);
      byteArray8[5] = (byte) (-69);
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
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.relative(1368);
      fBCachedFetcher0.next();
      fBCachedFetcher0.getFetchSize();
      byte[][] byteArray0 = new byte[1][8];
      byte[] byteArray1 = new byte[5];
      byteArray1[0] = (byte) (-13);
      byteArray1[1] = (byte)33;
      byteArray1[2] = (byte)0;
      byteArray1[3] = (byte)0;
      byteArray1[4] = (byte)125;
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
  //Test case number: 2
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.setFetchSize((-1280));
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
  //Test case number: 3
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      linkedList0.add((byte[][]) null);
      linkedList0.add((byte[][]) null);
      boolean boolean0 = fBCachedFetcher0.previous();
      assertFalse(boolean0);
      
      fBCachedFetcher0.close();
      assertFalse(fBCachedFetcher0.isBeforeFirst());
      assertFalse(fBCachedFetcher0.isAfterLast());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.4735023850806486
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.last();
      byte[][] byteArray0 = new byte[8][0];
      byte[] byteArray1 = new byte[6];
      byteArray1[0] = (byte)98;
      byteArray1[1] = (byte)25;
      byteArray1[2] = (byte)107;
      byteArray1[3] = (byte)39;
      byteArray1[4] = (byte)34;
      byteArray1[5] = (byte) (-69);
      byteArray0[0] = byteArray1;
      linkedList0.add(byteArray0);
      fBCachedFetcher0.previous();
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
  //Test case number: 5
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      LinkedList<byte[][]> linkedList1 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList1, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.getFetchSize();
      fBCachedFetcher0.afterLast();
      fBCachedFetcher0.beforeFirst();
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
  //Test case number: 6
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      linkedList0.offerFirst((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.isBeforeFirst();
      fBCachedFetcher0.getRowNum();
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
  //Test case number: 7
  /*Coverage entropy=1.4270610433807247
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBObjectListener.FetcherListener fBObjectListener_FetcherListener0 = null;
      LinkedList<byte[][]> linkedList1 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[2][8];
      byte[] byteArray1 = new byte[5];
      byteArray1[0] = (byte) (-70);
      byteArray1[1] = (byte)14;
      byteArray1[2] = (byte) (-112);
      byteArray1[3] = (byte)3;
      byteArray1[4] = (byte) (-90);
      byteArray0[0] = byteArray1;
      byte[] byteArray2 = new byte[4];
      byteArray2[0] = (byte) (-70);
      byteArray2[1] = (byte)14;
      byteArray2[2] = (byte) (-90);
      byteArray2[3] = (byte)14;
      byteArray0[1] = byteArray2;
      linkedList1.add(byteArray0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList1, (FBObjectListener.FetcherListener) null);
      // Undeclared exception!
      try { 
        fBCachedFetcher0.relative((-2240));
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
  /*Coverage entropy=2.1639556568820564
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.last();
      byte[][] byteArray0 = new byte[1][0];
      byte[] byteArray1 = new byte[6];
      linkedList0.add(byteArray0);
      byteArray1[0] = (byte)98;
      linkedList0.add(byteArray0);
      fBCachedFetcher0.previous();
      fBCachedFetcher0.absolute(1777);
      fBCachedFetcher0.first();
      fBCachedFetcher0.first();
      FBCachedFetcher fBCachedFetcher1 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      byte[][] byteArray2 = new byte[9][5];
      byteArray2[0] = byteArray1;
      byte[] byteArray3 = new byte[1];
      byteArray3[0] = (byte)0;
      byteArray2[1] = byteArray3;
      byteArray2[2] = byteArray1;
      byteArray2[3] = byteArray1;
      byte[] byteArray4 = new byte[8];
      byteArray4[0] = (byte) (-64);
      byteArray4[1] = (byte)98;
      byteArray4[2] = (byte)98;
      byteArray4[3] = (byte)98;
      fBCachedFetcher0.next();
      // Undeclared exception!
      try { 
        fBCachedFetcher1.next();
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
  /*Coverage entropy=1.69240886298655
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      linkedList0.offerFirst((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.isBeforeFirst();
      fBCachedFetcher0.getRowNum();
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
  /*Coverage entropy=1.8891591637540217
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      linkedList0.offerFirst((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.isBeforeFirst();
      fBCachedFetcher0.updateRow((byte[][]) null);
      // Undeclared exception!
      try { 
        fBCachedFetcher0.absolute((-1035));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      boolean boolean0 = fBCachedFetcher0.isFirst();
      boolean boolean1 = fBCachedFetcher0.isAfterLast();
      assertTrue(boolean1 == boolean0);
      
      boolean boolean2 = fBCachedFetcher0.absolute((-2240));
      assertTrue(boolean2 == boolean0);
      assertFalse(boolean2);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.7478680974667573
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[2][8];
      linkedList0.add(byteArray0);
      Integer integer0 = new Integer((-3478));
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      // Undeclared exception!
      try { 
        fBCachedFetcher0.absolute(651);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.1535324566542537
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      linkedList0.removeFirstOccurrence(fBCachedFetcher0);
      fBCachedFetcher0.isLast();
      fBCachedFetcher0.next();
      fBCachedFetcher0.isFirst();
      fBCachedFetcher0.first();
      fBCachedFetcher0.isFirst();
      byte[][] byteArray0 = new byte[3][7];
      byte[] byteArray1 = new byte[8];
      byteArray1[0] = (byte) (-125);
      byteArray1[1] = (byte) (-1);
      byteArray1[2] = (byte) (-88);
      byteArray1[3] = (byte) (-28);
      byteArray1[4] = (byte)113;
      byteArray1[5] = (byte)23;
      byteArray1[6] = (byte)40;
      byteArray1[7] = (byte)27;
      byteArray0[0] = byteArray1;
      byte[] byteArray2 = new byte[1];
      byteArray2[0] = (byte)40;
      byteArray0[1] = byteArray2;
      byte[] byteArray3 = new byte[9];
      byteArray3[0] = (byte) (-118);
      byteArray3[1] = (byte)0;
      byteArray3[2] = (byte) (-1);
      byteArray3[3] = (byte)23;
      byteArray3[4] = (byte)23;
      byteArray3[5] = (byte)27;
      byteArray3[6] = (byte) (-28);
      byteArray3[7] = (byte)27;
      byteArray3[8] = (byte)40;
      byteArray0[2] = byteArray3;
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
  //Test case number: 14
  /*Coverage entropy=1.8937882323911377
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBObjectListener.FetcherListener fBObjectListener_FetcherListener0 = null;
      byte[][] byteArrayArray0 = null;
      Predicate<byte[][]> predicate0 = Predicate.isEqual((Object) null);
      predicate0.negate();
      linkedList0.removeIf(predicate0);
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.updateRow((byte[][]) null);
      FBManagedConnection fBManagedConnection0 = mock(FBManagedConnection.class, new ViolatedAssumptionAnswer());
      doReturn((FBConnectionRequestInfo) null).when(fBManagedConnection0).getConnectionRequestInfo();
      fBCachedFetcher0.isLast();
      fBCachedFetcher0.isFirst();
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
