/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 12:04:06 GMT 2018
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
import org.firebirdsql.jdbc.FBCachedFetcher;
import org.firebirdsql.jdbc.FBObjectListener;
import org.firebirdsql.jdbc.FBResultSet;
import org.firebirdsql.jdbc.FBSQLException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FBCachedFetcher_ESTest extends FBCachedFetcher_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=2.2718685126965625
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      linkedList0.toArray();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.beforeFirst();
      fBCachedFetcher0.absolute(204);
      fBCachedFetcher0.absolute((-950));
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
  //Test case number: 1
  /*Coverage entropy=2.2718685126965625
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      linkedList0.toArray();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      assertFalse(fBCachedFetcher0.isBeforeFirst());
      
      fBCachedFetcher0.beforeFirst();
      fBCachedFetcher0.absolute(204);
      fBCachedFetcher0.absolute((-950));
      int int0 = fBCachedFetcher0.getRowNum();
      boolean boolean0 = fBCachedFetcher0.last();
      int int1 = fBCachedFetcher0.getFetchSize();
      assertTrue(int1 == int0);
      
      boolean boolean1 = fBCachedFetcher0.previous();
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      linkedList0.toArray();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.beforeFirst();
      fBCachedFetcher0.absolute(204);
      fBCachedFetcher0.absolute((-950));
      fBCachedFetcher0.getRowNum();
      fBCachedFetcher0.setFetchSize((-1343));
      fBCachedFetcher0.close();
      assertEquals((-1343), fBCachedFetcher0.getFetchSize());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.135240257526717
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[6][1];
      byte[] byteArray1 = new byte[5];
      byteArray1[0] = (byte) (-33);
      byteArray1[1] = (byte)0;
      byteArray1[2] = (byte) (-42);
      byteArray1[3] = (byte) (-42);
      byteArray1[4] = (byte)34;
      byteArray0[0] = byteArray1;
      byte[] byteArray2 = new byte[8];
      byteArray2[0] = (byte) (-42);
      byteArray2[1] = (byte) (-42);
      byteArray2[2] = (byte) (-42);
      byteArray2[3] = (byte)0;
      byteArray2[4] = (byte) (-33);
      byteArray2[5] = (byte) (-33);
      byteArray2[6] = (byte)0;
      byteArray2[7] = (byte) (-33);
      byteArray0[1] = byteArray2;
      byte[] byteArray3 = new byte[2];
      byteArray3[0] = (byte) (-33);
      byteArray3[1] = (byte)34;
      byteArray0[2] = byteArray3;
      byte[] byteArray4 = new byte[9];
      byteArray4[0] = (byte)0;
      byteArray4[1] = (byte)0;
      byteArray4[2] = (byte) (-42);
      byteArray4[3] = (byte) (-42);
      byteArray4[4] = (byte) (-42);
      byteArray4[5] = (byte) (-42);
      byteArray4[6] = (byte) (-51);
      byteArray4[7] = (byte)2;
      byteArray4[8] = (byte) (-42);
      byteArray0[3] = byteArray4;
      byte[] byteArray5 = new byte[9];
      byteArray5[0] = (byte)0;
      byteArray5[1] = (byte) (-42);
      byteArray5[2] = (byte) (-51);
      byteArray5[3] = (byte)2;
      byteArray5[4] = (byte) (-62);
      byteArray5[5] = (byte)0;
      byteArray5[6] = (byte)0;
      byteArray5[7] = (byte)2;
      byteArray5[8] = (byte) (-33);
      byteArray0[4] = byteArray5;
      byte[] byteArray6 = new byte[6];
      byteArray6[0] = (byte)2;
      byteArray6[1] = (byte) (-42);
      byteArray6[2] = (byte) (-62);
      byteArray6[3] = (byte) (-62);
      byteArray6[4] = (byte) (-33);
      byteArray6[5] = (byte) (-42);
      byteArray0[5] = byteArray6;
      linkedList0.add(byteArray0);
      linkedList0.toArray();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      int int0 = 204;
      // Undeclared exception!
      try { 
        fBCachedFetcher0.beforeFirst();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.6313454208085967
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      linkedList0.toArray();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.first();
      FBCachedFetcher fBCachedFetcher1 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher1.beforeFirst();
      FBCachedFetcher fBCachedFetcher2 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher2.absolute((-2230));
      try { 
        fBCachedFetcher2.absolute(0);
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
  /*Coverage entropy=2.0253262207700673
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      linkedList0.toArray();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.beforeFirst();
      fBCachedFetcher0.absolute(204);
      byte[][] byteArray0 = new byte[6][9];
      byte[] byteArray1 = new byte[0];
      byteArray0[0] = byteArray1;
      byte[] byteArray2 = new byte[0];
      byteArray0[1] = byteArray2;
      byte[] byteArray3 = new byte[4];
      byteArray3[0] = (byte)74;
      byteArray3[1] = (byte)100;
      byteArray3[2] = (byte) (-112);
      byteArray3[3] = (byte) (-49);
      byteArray0[2] = byteArray3;
      byte[] byteArray4 = new byte[5];
      byteArray4[0] = (byte) (-112);
      byteArray4[1] = (byte) (-112);
      byteArray4[2] = (byte)74;
      byteArray4[3] = (byte)74;
      byteArray4[4] = (byte) (-112);
      byteArray0[3] = byteArray4;
      byte[] byteArray5 = new byte[0];
      byteArray0[4] = byteArray5;
      byte[] byteArray6 = new byte[8];
      byteArray6[0] = (byte) (-112);
      byteArray6[1] = (byte)74;
      byteArray6[2] = (byte)74;
      byteArray6[3] = (byte)74;
      byteArray6[4] = (byte)100;
      byteArray6[5] = (byte) (-112);
      byteArray6[6] = (byte) (-112);
      byteArray6[7] = (byte)100;
      byteArray0[5] = byteArray6;
      linkedList0.add(byteArray0);
      FBCachedFetcher fBCachedFetcher1 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      // Undeclared exception!
      try { 
        fBCachedFetcher1.absolute((-950));
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
  /*Coverage entropy=2.0963525794641384
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      linkedList0.toArray();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.beforeFirst();
      fBCachedFetcher0.beforeFirst();
      fBCachedFetcher0.absolute((-3518));
      fBCachedFetcher0.absolute((-950));
      FBCachedFetcher fBCachedFetcher1 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher1.previous();
      byte[][] byteArray0 = new byte[0][8];
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
  //Test case number: 7
  /*Coverage entropy=2.2638576869792817
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      linkedList0.toArray();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      boolean boolean0 = fBCachedFetcher0.previous();
      fBCachedFetcher0.beforeFirst();
      fBCachedFetcher0.absolute(1077);
      fBCachedFetcher0.afterLast();
      fBCachedFetcher0.absolute(204);
      int int0 = fBCachedFetcher0.getRowNum();
      assertEquals(0, int0);
      
      boolean boolean1 = fBCachedFetcher0.relative(2336);
      assertFalse(boolean1);
      
      boolean boolean2 = fBCachedFetcher0.isLast();
      assertFalse(boolean2 == boolean0);
      assertTrue(boolean2);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.1458417525947544
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      byte[][] byteArray0 = new byte[5][3];
      byte[] byteArray1 = new byte[2];
      byteArray1[0] = (byte) (-93);
      linkedList0.add(byteArray0);
      FBCachedFetcher fBCachedFetcher1 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.first();
      fBCachedFetcher0.beforeFirst();
      // Undeclared exception!
      try { 
        fBCachedFetcher1.absolute(2869);
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
  /*Coverage entropy=2.0982737395252498
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      linkedList0.add((byte[][]) null);
      linkedList0.add((byte[][]) null);
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.updateRow((byte[][]) null);
      fBCachedFetcher0.absolute(409);
      fBCachedFetcher0.absolute(500);
      FBCachedFetcher fBCachedFetcher1 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.previous();
      assertEquals(2, fBCachedFetcher0.getRowNum());
      
      fBCachedFetcher1.insertRow((byte[][]) null);
      assertEquals(0, fBResultSet0.getRow());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.0982737395252498
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      linkedList0.add((byte[][]) null);
      linkedList0.add((byte[][]) null);
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.updateRow((byte[][]) null);
      fBCachedFetcher0.absolute(409);
      fBCachedFetcher0.absolute(500);
      linkedList0.offer((byte[][]) null);
      fBCachedFetcher0.next();
      boolean boolean0 = fBCachedFetcher0.isLast();
      assertEquals(3, fBCachedFetcher0.getRowNum());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.0815989915018633
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      linkedList0.toArray();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.first();
      fBCachedFetcher0.beforeFirst();
      fBCachedFetcher0.absolute(57);
      fBCachedFetcher0.absolute(204);
      int int0 = fBCachedFetcher0.getRowNum();
      assertEquals(0, int0);
      
      fBCachedFetcher0.relative(1468);
      boolean boolean0 = fBCachedFetcher0.last();
      assertFalse(boolean0);
      
      boolean boolean1 = fBCachedFetcher0.previous();
      boolean boolean2 = fBCachedFetcher0.isFirst();
      assertTrue(boolean2 == boolean1);
      assertFalse(boolean2);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.11928092190985
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      linkedList0.add((byte[][]) null);
      linkedList0.add((byte[][]) null);
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.updateRow((byte[][]) null);
      fBCachedFetcher0.updateRow((byte[][]) null);
      linkedList0.offer((byte[][]) null);
      fBCachedFetcher0.next();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      linkedList0.sort(comparator0);
      fBCachedFetcher0.isLast();
      fBCachedFetcher0.deleteRow();
      assertEquals(1, fBCachedFetcher0.getRowNum());
      
      fBCachedFetcher0.previous();
      fBCachedFetcher0.isEmpty();
      assertFalse(fBCachedFetcher0.isLast());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      linkedList0.add((byte[][]) null);
      linkedList0.add((byte[][]) null);
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      FBCachedFetcher fBCachedFetcher1 = new FBCachedFetcher(linkedList0, fBResultSet0);
      FBCachedFetcher fBCachedFetcher2 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher2.absolute(57);
      fBCachedFetcher1.absolute(57);
      fBCachedFetcher0.getRowNum();
      fBCachedFetcher1.relative(0);
      fBCachedFetcher2.last();
      fBCachedFetcher2.previous();
      boolean boolean0 = fBCachedFetcher2.isFirst();
      assertTrue(boolean0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.1788840333607156
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      linkedList0.add((byte[][]) null);
      linkedList0.add((byte[][]) null);
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.updateRow((byte[][]) null);
      fBCachedFetcher0.absolute(409);
      fBCachedFetcher0.relative(500);
      fBCachedFetcher0.last();
      fBCachedFetcher0.previous();
      fBCachedFetcher0.insertRow((byte[][]) null);
      fBCachedFetcher0.last();
      fBCachedFetcher0.deleteRow();
      assertEquals(3, fBCachedFetcher0.getRowNum());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.138333059508028
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      linkedList0.add((byte[][]) null);
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.updateRow((byte[][]) null);
      linkedList0.offer((byte[][]) null);
      fBCachedFetcher0.next();
      Comparator<byte[][]> comparator0 = (Comparator<byte[][]>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any(byte[][].class) , any(byte[][].class));
      linkedList0.sort(comparator0);
      fBCachedFetcher0.isLast();
      fBCachedFetcher0.deleteRow();
      fBCachedFetcher0.previous();
      fBCachedFetcher0.isEmpty();
      fBCachedFetcher0.updateRow((byte[][]) null);
      assertTrue(fBCachedFetcher0.isFirst());
  }
}
