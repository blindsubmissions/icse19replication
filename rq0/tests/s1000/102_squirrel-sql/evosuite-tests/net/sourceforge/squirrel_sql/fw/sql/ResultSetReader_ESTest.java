/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 07 13:43:20 GMT 2018
 */

package net.sourceforge.squirrel_sql.fw.sql;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.sql.ResultSet;
import net.sourceforge.squirrel_sql.fw.dialects.DialectType;
import net.sourceforge.squirrel_sql.fw.sql.ResultSetReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.hibernate.jdbc.ColumnNameCache;
import org.hibernate.jdbc.ResultSetWrapper;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ResultSetReader_ESTest extends ResultSetReader_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DialectType dialectType0 = DialectType.GENERIC;
      ResultSetReader resultSetReader0 = null;
      try {
        resultSetReader0 = new ResultSetReader((ResultSet) null, dialectType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ResultSet == null
         //
         verifyException("net.sourceforge.squirrel_sql.fw.sql.ResultSetReader", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ResultSetWrapper resultSetWrapper0 = new ResultSetWrapper((ResultSet) null, (ColumnNameCache) null);
      DialectType dialectType0 = DialectType.MYSQL;
      ResultSetReader resultSetReader0 = null;
      try {
        resultSetReader0 = new ResultSetReader(resultSetWrapper0, dialectType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.hibernate.jdbc.ResultSetWrapper", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DialectType dialectType0 = DialectType.HSQLDB;
      ResultSetWrapper resultSetWrapper0 = new ResultSetWrapper((ResultSet) null, (ColumnNameCache) null);
      int[] intArray0 = new int[1];
      ResultSetReader resultSetReader0 = null;
      try {
        resultSetReader0 = new ResultSetReader(resultSetWrapper0, intArray0, dialectType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.hibernate.jdbc.ResultSetWrapper", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ResultSetWrapper resultSetWrapper0 = new ResultSetWrapper((ResultSet) null, (ColumnNameCache) null);
      int[] intArray0 = new int[0];
      DialectType dialectType0 = DialectType.H2;
      ResultSetReader resultSetReader0 = null;
      try {
        resultSetReader0 = new ResultSetReader(resultSetWrapper0, intArray0, dialectType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.hibernate.jdbc.ResultSetWrapper", e);
      }
  }
}