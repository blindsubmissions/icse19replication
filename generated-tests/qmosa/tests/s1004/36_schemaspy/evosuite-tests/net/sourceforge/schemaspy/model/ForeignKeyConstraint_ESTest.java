/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 10:54:03 GMT 2018
 */

package net.sourceforge.schemaspy.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;
import net.sourceforge.schemaspy.Config;
import net.sourceforge.schemaspy.model.Database;
import net.sourceforge.schemaspy.model.ForeignKeyConstraint;
import net.sourceforge.schemaspy.model.Table;
import net.sourceforge.schemaspy.model.TableColumn;
import net.sourceforge.schemaspy.model.xml.SchemaMeta;
import net.sourceforge.schemaspy.model.xml.TableColumnMeta;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ForeignKeyConstraint_ESTest extends ForeignKeyConstraint_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 1139, 1139);
      boolean boolean0 = foreignKeyConstraint0.isReal();
      boolean boolean1 = foreignKeyConstraint0.isCascadeOnDelete();
      assertFalse(boolean1 == boolean0);
      
      foreignKeyConstraint0.getParentColumns();
      foreignKeyConstraint0.getChildTable();
      assertEquals(1139, foreignKeyConstraint0.getDeleteRule());
      assertEquals(1139, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 1139, 1139);
      boolean boolean0 = foreignKeyConstraint0.isImplied();
      boolean boolean1 = foreignKeyConstraint0.isCascadeOnDelete();
      assertTrue(boolean1 == boolean0);
      
      foreignKeyConstraint0.getParentColumns();
      assertEquals(1139, foreignKeyConstraint0.getUpdateRule());
      assertEquals(1139, foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 1139, 1139);
      foreignKeyConstraint0.getChildColumns();
      boolean boolean0 = foreignKeyConstraint0.isReal();
      assertTrue(boolean0);
      
      boolean boolean1 = foreignKeyConstraint0.isCascadeOnDelete();
      foreignKeyConstraint0.getParentColumns();
      boolean boolean2 = foreignKeyConstraint0.isNullOnDelete();
      assertTrue(boolean2 == boolean1);
      assertEquals(1139, foreignKeyConstraint0.getDeleteRule());
      assertEquals(1139, foreignKeyConstraint0.getUpdateRule());
      assertFalse(boolean2);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 1139, 1139);
      foreignKeyConstraint0.getChildColumns();
      boolean boolean0 = foreignKeyConstraint0.isReal();
      boolean boolean1 = foreignKeyConstraint0.isCascadeOnDelete();
      assertFalse(boolean1 == boolean0);
      
      foreignKeyConstraint0.getParentColumns();
      foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals(1139, foreignKeyConstraint0.getUpdateRule());
      assertEquals(1139, foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, " references ", 68, 68);
      boolean boolean0 = foreignKeyConstraint0.isReal();
      boolean boolean1 = foreignKeyConstraint0.isCascadeOnDelete();
      assertFalse(boolean1 == boolean0);
      
      foreignKeyConstraint0.getParentColumns();
      foreignKeyConstraint0.getDeleteRuleName();
      assertEquals(68, foreignKeyConstraint0.getUpdateRule());
      assertEquals(68, foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 1139, 1139);
      foreignKeyConstraint0.getChildColumns();
      boolean boolean0 = foreignKeyConstraint0.isReal();
      boolean boolean1 = foreignKeyConstraint0.isCascadeOnDelete();
      assertFalse(boolean1 == boolean0);
      
      foreignKeyConstraint0.getParentColumns();
      foreignKeyConstraint0.getName();
      assertEquals(1139, foreignKeyConstraint0.getDeleteRule());
      assertEquals(1139, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Table table0 = null;
      TableColumnMeta tableColumnMeta0 = mock(TableColumnMeta.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(tableColumnMeta0).getComments();
      doReturn((String) null).when(tableColumnMeta0).getDefaultValue();
      doReturn(0).when(tableColumnMeta0).getDigits();
      doReturn((String) null).when(tableColumnMeta0).getId();
      doReturn((String) null).when(tableColumnMeta0).getName();
      doReturn(0).when(tableColumnMeta0).getSize();
      doReturn((String) null).when(tableColumnMeta0).getType();
      doReturn(false).when(tableColumnMeta0).isAutoUpdated();
      doReturn(false).when(tableColumnMeta0).isNullable();
      TableColumn tableColumn0 = new TableColumn((Table) null, tableColumnMeta0);
      ForeignKeyConstraint foreignKeyConstraint0 = null;
      try {
        foreignKeyConstraint0 = new ForeignKeyConstraint(tableColumn0, tableColumn0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.schemaspy.model.TableColumn", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 1139, 1139);
      foreignKeyConstraint0.isReal();
      foreignKeyConstraint0.isReal();
      foreignKeyConstraint0.getParentColumns();
      foreignKeyConstraint0.getParentTable();
      boolean boolean0 = foreignKeyConstraint0.isReal();
      assertTrue(boolean0);
      assertEquals(1139, foreignKeyConstraint0.getDeleteRule());
      assertEquals(1139, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 0, 0);
      foreignKeyConstraint0.isReal();
      foreignKeyConstraint0.isReal();
      foreignKeyConstraint0.isNullOnDelete();
      foreignKeyConstraint0.getParentColumns();
      foreignKeyConstraint0.getChildTable();
      foreignKeyConstraint0.isCascadeOnDelete();
      foreignKeyConstraint0.getDeleteRuleDescription();
      // Undeclared exception!
      try { 
        foreignKeyConstraint0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.schemaspy.model.ForeignKeyConstraint", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.1458417525947544
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 0, 0);
      foreignKeyConstraint0.isRestrictDelete();
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, (String) null, 0, (-23));
      foreignKeyConstraint0.isReal();
      foreignKeyConstraint1.isNullOnDelete();
      foreignKeyConstraint0.getParentColumns();
      foreignKeyConstraint0.getChildTable();
      foreignKeyConstraint1.getDeleteRuleAlias();
      foreignKeyConstraint1.getUpdateRule();
      System.setCurrentTimeMillis(0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "1gk81_ueyN}r>", (-264), 2);
      foreignKeyConstraint0.isReal();
      foreignKeyConstraint0.isNullOnDelete();
      foreignKeyConstraint0.getChildColumns();
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(resultSet0).getInt(anyString());
      doReturn((Object) null).when(resultSet0).getObject(anyString());
      doReturn((String) null, (String) null, (String) null, (String) null).when(resultSet0).getString(anyString());
      TableColumn tableColumn0 = null;
      try {
        tableColumn0 = new TableColumn((Table) null, resultSet0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.schemaspy.model.TableColumn", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.2718685126965625
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 0, 0);
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, (String) null, 0, 1);
      boolean boolean0 = foreignKeyConstraint0.isReal();
      boolean boolean1 = foreignKeyConstraint1.isNullOnDelete();
      assertFalse(boolean1 == boolean0);
      
      List<TableColumn> list0 = foreignKeyConstraint0.getParentColumns();
      foreignKeyConstraint0.getChildTable();
      String string0 = foreignKeyConstraint1.getDeleteRuleAlias();
      assertEquals("R", string0);
      
      int int0 = foreignKeyConstraint1.getUpdateRule();
      assertEquals(0, int0);
      
      System.setCurrentTimeMillis(0);
      ForeignKeyConstraint.toString(list0);
      assertFalse(foreignKeyConstraint0.isNullOnDelete());
      
      String string1 = foreignKeyConstraint1.getDeleteRuleDescription();
      assertEquals("Restrict delete:\n Parent cannot be deleted if children exist", string1);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 0, 0);
      foreignKeyConstraint0.isReal();
      foreignKeyConstraint0.isReal();
      TableColumnMeta tableColumnMeta0 = mock(TableColumnMeta.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(tableColumnMeta0).getComments();
      doReturn((String) null).when(tableColumnMeta0).getDefaultValue();
      doReturn(0).when(tableColumnMeta0).getDigits();
      doReturn((String) null).when(tableColumnMeta0).getId();
      doReturn((String) null).when(tableColumnMeta0).getName();
      doReturn(0).when(tableColumnMeta0).getSize();
      doReturn((String) null).when(tableColumnMeta0).getType();
      doReturn(false).when(tableColumnMeta0).isAutoUpdated();
      doReturn(false).when(tableColumnMeta0).isNullable();
      TableColumn tableColumn0 = new TableColumn((Table) null, tableColumnMeta0);
      foreignKeyConstraint0.addChildColumn(tableColumn0);
      foreignKeyConstraint0.isNullOnDelete();
      foreignKeyConstraint0.getParentColumns();
      foreignKeyConstraint0.getChildTable();
      foreignKeyConstraint0.getDeleteRuleAlias();
      foreignKeyConstraint0.getUpdateRule();
      System.setCurrentTimeMillis(0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.9061547465398496
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 26, 26);
      boolean boolean0 = foreignKeyConstraint0.isReal();
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, (String) null, 26, 1);
      foreignKeyConstraint0.isReal();
      boolean boolean1 = foreignKeyConstraint1.isNullOnDelete();
      assertFalse(boolean1);
      
      foreignKeyConstraint0.getParentColumns();
      foreignKeyConstraint0.getChildTable();
      assertFalse(foreignKeyConstraint0.isNullOnDelete());
      assertFalse(foreignKeyConstraint0.isRestrictDelete());
      
      boolean boolean2 = foreignKeyConstraint1.isRestrictDelete();
      assertTrue(boolean2 == boolean0);
      
      foreignKeyConstraint1.getParentColumns();
      assertEquals(26, foreignKeyConstraint1.getUpdateRule());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.0642580751745085
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 26, 26);
      foreignKeyConstraint0.isReal();
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, (String) null, 26, 1);
      foreignKeyConstraint0.isReal();
      foreignKeyConstraint1.isNullOnDelete();
      foreignKeyConstraint0.getParentColumns();
      foreignKeyConstraint0.getChildTable();
      foreignKeyConstraint0.getUpdateRule();
      System.setCurrentTimeMillis(1L);
      foreignKeyConstraint1.getDeleteRuleDescription();
      foreignKeyConstraint0.addChildColumn((TableColumn) null);
      // Undeclared exception!
      try { 
        foreignKeyConstraint1.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.schemaspy.model.ForeignKeyConstraint", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.1490596969706204
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Z!erWW42?}FvsD0&J", (-2036), 1);
      foreignKeyConstraint0.getDeleteRuleAlias();
      foreignKeyConstraint0.getDeleteRuleName();
      System.setCurrentTimeMillis(1);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.4750763110546947
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 2, 2);
      TableColumnMeta tableColumnMeta0 = mock(TableColumnMeta.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(tableColumnMeta0).getComments();
      doReturn((String) null).when(tableColumnMeta0).getDefaultValue();
      doReturn(0).when(tableColumnMeta0).getDigits();
      doReturn((String) null).when(tableColumnMeta0).getId();
      doReturn((String) null).when(tableColumnMeta0).getName();
      doReturn(0).when(tableColumnMeta0).getSize();
      doReturn((String) null).when(tableColumnMeta0).getType();
      doReturn(false).when(tableColumnMeta0).isAutoUpdated();
      doReturn(false).when(tableColumnMeta0).isNullable();
      TableColumn tableColumn0 = new TableColumn((Table) null, tableColumnMeta0);
      foreignKeyConstraint0.addChildColumn(tableColumn0);
      boolean boolean0 = foreignKeyConstraint0.isReal();
      assertTrue(boolean0);
      
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, (String) null, 2, 1);
      assertEquals(2, foreignKeyConstraint1.getUpdateRule());
      assertEquals("Restrict delete", foreignKeyConstraint1.getDeleteRuleName());
      
      String string0 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals("N", string0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.182995977034132
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 0, 0);
      foreignKeyConstraint0.isReal();
      List<TableColumn> list0 = foreignKeyConstraint0.getParentColumns();
      ForeignKeyConstraint.toString(list0);
      foreignKeyConstraint0.getChildColumns();
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "UkX;+T}", 0, 0);
      boolean boolean0 = foreignKeyConstraint1.isReal();
      boolean boolean1 = foreignKeyConstraint0.isRestrictDelete();
      assertFalse(boolean1 == boolean0);
      
      String string0 = foreignKeyConstraint1.getDeleteRuleName();
      assertEquals("Cascade on delete", string0);
      
      String string1 = foreignKeyConstraint1.getDeleteRuleDescription();
      assertEquals("Cascade on delete:\n Deletion of parent deletes child", string1);
      
      String string2 = foreignKeyConstraint1.getDeleteRuleAlias();
      assertEquals("C", string2);
      
      foreignKeyConstraint1.addParentColumn((TableColumn) null);
      assertEquals(0, foreignKeyConstraint1.getUpdateRule());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "n,SR9IRk%`Hoc X9fK", 18, 2);
      List<TableColumn> list0 = foreignKeyConstraint0.getParentColumns();
      String string0 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals("Null on delete", string0);
      
      boolean boolean0 = foreignKeyConstraint0.isCascadeOnDelete();
      boolean boolean1 = foreignKeyConstraint0.isNullOnDelete();
      assertFalse(boolean1 == boolean0);
      
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "", 18, 2);
      int int0 = foreignKeyConstraint1.compareTo(foreignKeyConstraint1);
      assertEquals(0, int0);
      
      ForeignKeyConstraint.toString(list0);
      assertEquals(18, foreignKeyConstraint0.getUpdateRule());
      assertTrue(foreignKeyConstraint0.isNullOnDelete());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.8891591637540217
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "xN|?bSgo/xn6", (-1218), (-1218));
      foreignKeyConstraint0.getDeleteRuleAlias();
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      System.setCurrentTimeMillis(1L);
      boolean boolean1 = foreignKeyConstraint0.isReal();
      assertFalse(boolean1 == boolean0);
      
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "", (-1218), 1);
      int int0 = foreignKeyConstraint0.compareTo(foreignKeyConstraint1);
      assertTrue(foreignKeyConstraint1.isRestrictDelete());
      assertEquals(12, int0);
      assertEquals((-1218), foreignKeyConstraint1.getUpdateRule());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=2.0431918705451206
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Z!erWW42?}FvsD0&J", (-2036), 1);
      foreignKeyConstraint0.isReal();
      foreignKeyConstraint0.getParentColumns();
      foreignKeyConstraint0.isNullOnDelete();
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "Z!erWW42?}FvsD0&J", 1, 1);
      // Undeclared exception!
      try { 
        foreignKeyConstraint0.compareTo(foreignKeyConstraint1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 2, 2);
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Null on delete:\n Foreign key to parent set to NULL when parent deleted", string0);
      assertEquals(2, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "R", 1, 3);
      foreignKeyConstraint0.getDeleteRuleName();
      foreignKeyConstraint0.isCascadeOnDelete();
      foreignKeyConstraint0.isNullOnDelete();
      foreignKeyConstraint0.isRestrictDelete();
      foreignKeyConstraint0.getDeleteRuleDescription();
      foreignKeyConstraint0.getDeleteRuleAlias();
      System.setCurrentTimeMillis(0L);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LinkedList<TableColumn> linkedList0 = new LinkedList<TableColumn>();
      linkedList0.stream();
      linkedList0.pollLast();
      linkedList0.add((TableColumn) null);
      // Undeclared exception!
      try { 
        ForeignKeyConstraint.toString((List<TableColumn>) linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.schemaspy.model.ForeignKeyConstraint", e);
      }
  }
}
