/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 13:59:20 GMT 2018
 */

package net.sourceforge.schemaspy.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
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
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ForeignKeyConstraint_ESTest extends ForeignKeyConstraint_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
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
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "SUM", (-2191), (-655));
      LinkedList<TableColumn> linkedList0 = new LinkedList<TableColumn>();
      TableColumn tableColumn0 = new TableColumn((Table) null, tableColumnMeta0);
      linkedList0.add(tableColumn0);
      linkedList0.listIterator();
      String string0 = ForeignKeyConstraint.toString((List<TableColumn>) linkedList0);
      assertNull(string0);
      
      foreignKeyConstraint0.getChildTable();
      foreignKeyConstraint0.getParentTable();
      assertEquals((-655), foreignKeyConstraint0.getDeleteRule());
      assertEquals((-2191), foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 969, 0);
      boolean boolean0 = foreignKeyConstraint0.isImplied();
      assertEquals(969, foreignKeyConstraint0.getUpdateRule());
      assertEquals("Cascade on delete:\n Deletion of parent deletes child", foreignKeyConstraint0.getDeleteRuleDescription());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TableColumnMeta tableColumnMeta0 = mock(TableColumnMeta.class, new ViolatedAssumptionAnswer());
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "SUM", (-2191), (-655));
      LinkedList<TableColumn> linkedList0 = new LinkedList<TableColumn>();
      linkedList0.listIterator();
      ForeignKeyConstraint.toString((List<TableColumn>) linkedList0);
      foreignKeyConstraint0.getChildTable();
      foreignKeyConstraint0.getDeleteRuleName();
      assertEquals((-655), foreignKeyConstraint0.getDeleteRule());
      assertEquals((-2191), foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "\"", 3756, 3756);
      boolean boolean0 = foreignKeyConstraint0.isNullOnDelete();
      assertFalse(boolean0);
      
      foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals(3756, foreignKeyConstraint0.getUpdateRule());
      assertEquals(3756, foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "\"", 3750, 3750);
      foreignKeyConstraint0.addParentColumn((TableColumn) null);
      boolean boolean0 = foreignKeyConstraint0.isNullOnDelete();
      assertFalse(boolean0);
      assertEquals(3750, foreignKeyConstraint0.getDeleteRule());
      assertEquals(3750, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "\"", 1569, 2);
      boolean boolean0 = foreignKeyConstraint0.isNullOnDelete();
      assertTrue(boolean0);
      
      boolean boolean1 = foreignKeyConstraint0.isRestrictDelete();
      assertFalse(boolean1);
      assertEquals(1569, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TableColumnMeta tableColumnMeta0 = mock(TableColumnMeta.class, new ViolatedAssumptionAnswer());
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "\"", 3750, (-603));
      foreignKeyConstraint0.getChildColumns();
      boolean boolean0 = foreignKeyConstraint0.isReal();
      assertTrue(boolean0);
      
      foreignKeyConstraint0.getName();
      assertEquals((-603), foreignKeyConstraint0.getDeleteRule());
      assertEquals(3750, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.9192232309261148
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int int0 = 3750;
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "\"", 3750, 3750);
      foreignKeyConstraint0.getChildColumns();
      foreignKeyConstraint0.getChildTable();
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "\"", 3750, 3750);
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
  //Test case number: 8
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TableColumnMeta tableColumnMeta0 = mock(TableColumnMeta.class, new ViolatedAssumptionAnswer());
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "SUM", (-655), 3);
      LinkedList<TableColumn> linkedList0 = new LinkedList<TableColumn>();
      ForeignKeyConstraint.toString((List<TableColumn>) linkedList0);
      foreignKeyConstraint0.getChildTable();
      String string0 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals((-655), foreignKeyConstraint0.getUpdateRule());
      assertEquals("Restrict delete", string0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "\"", 1569, 2);
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      boolean boolean1 = foreignKeyConstraint0.isCascadeOnDelete();
      assertFalse(boolean1);
      
      boolean boolean2 = foreignKeyConstraint0.isReal();
      assertEquals(1569, foreignKeyConstraint0.getUpdateRule());
      assertFalse(boolean2 == boolean0);
      assertEquals(2, foreignKeyConstraint0.getDeleteRule());
      assertTrue(boolean2);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.303092403761719
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "gV*DsC%)!^Kdaf", (-1), (-1));
      foreignKeyConstraint0.getDeleteRuleDescription();
      foreignKeyConstraint0.isReal();
      foreignKeyConstraint0.getDeleteRuleAlias();
      System.setCurrentTimeMillis((-1));
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.4941751382893085
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 2, 2);
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      assertFalse(boolean0);
      
      foreignKeyConstraint0.getChildTable();
      String string0 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals(2, foreignKeyConstraint0.getUpdateRule());
      assertEquals("Null on delete", string0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "SUM", (-624), (-1945));
      List<TableColumn> list0 = foreignKeyConstraint0.getChildColumns();
      ForeignKeyConstraint.toString(list0);
      foreignKeyConstraint0.getChildColumns();
      foreignKeyConstraint0.getChildTable();
      foreignKeyConstraint0.getDeleteRuleName();
      int int0 = foreignKeyConstraint0.getUpdateRule();
      assertEquals((-624), int0);
      
      boolean boolean0 = foreignKeyConstraint0.isCascadeOnDelete();
      assertEquals((-1945), foreignKeyConstraint0.getDeleteRule());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TableColumnMeta tableColumnMeta0 = mock(TableColumnMeta.class, new ViolatedAssumptionAnswer());
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "SUM", (-655), 3);
      LinkedList<TableColumn> linkedList0 = new LinkedList<TableColumn>();
      ForeignKeyConstraint.toString((List<TableColumn>) linkedList0);
      foreignKeyConstraint0.getChildColumns();
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "SUM", 4208, 959);
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals((-655), foreignKeyConstraint0.getUpdateRule());
      assertEquals("Restrict delete:\n Parent cannot be deleted if children exist", string0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TableColumnMeta tableColumnMeta0 = mock(TableColumnMeta.class, new ViolatedAssumptionAnswer());
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "SUM", (-655), 3);
      LinkedList<TableColumn> linkedList0 = new LinkedList<TableColumn>();
      ForeignKeyConstraint.toString((List<TableColumn>) linkedList0);
      foreignKeyConstraint0.getChildColumns();
      foreignKeyConstraint0.getDeleteRuleAlias();
      System.setCurrentTimeMillis(3);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.303092403761719
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "\"", 3750, 3750);
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "sl+i_]{vm", 3750, 0);
      foreignKeyConstraint0.getDeleteRuleDescription();
      foreignKeyConstraint0.isReal();
      foreignKeyConstraint1.getDeleteRuleAlias();
      System.setCurrentTimeMillis(0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.277034259466139
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 2, 2);
      foreignKeyConstraint0.isRestrictDelete();
      foreignKeyConstraint0.getDeleteRuleAlias();
      System.setCurrentTimeMillis(1567);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TableColumnMeta tableColumnMeta0 = mock(TableColumnMeta.class, new ViolatedAssumptionAnswer());
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "SUM", (-639), 3);
      LinkedList<TableColumn> linkedList0 = new LinkedList<TableColumn>();
      ForeignKeyConstraint.toString((List<TableColumn>) linkedList0);
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      assertTrue(boolean0);
      
      String string0 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals("R", string0);
      
      String string1 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals("Restrict delete", string1);
      assertEquals((-639), foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 2, 2);
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, (String) null, 2, 2);
      String string0 = foreignKeyConstraint1.getDeleteRuleDescription();
      assertEquals(2, foreignKeyConstraint1.getUpdateRule());
      assertEquals("Null on delete:\n Foreign key to parent set to NULL when parent deleted", string0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = "\"";
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "\"", 226, 226);
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "z*SZ7zN8$brC?G", 3790, 3750);
      foreignKeyConstraint0.isReal();
      foreignKeyConstraint0.compareTo(foreignKeyConstraint1);
      Config config0 = new Config();
      Connection connection0 = null;
      DatabaseMetaData databaseMetaData0 = mock(DatabaseMetaData.class, new ViolatedAssumptionAnswer());
      String string1 = "'";
      String string2 = null;
      String string3 = null;
      SchemaMeta schemaMeta0 = null;
      try {
        schemaMeta0 = new SchemaMeta("%R%rFf_l{bR >7M:TL", "%R%rFf_l{bR >7M:TL", (String) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Specified meta file \"%R%rFf_l{bR >7M:TL\" does not exist
         //
         verifyException("net.sourceforge.schemaspy.model.xml.SchemaMeta", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.666332585328325
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "\"", 3750, 3750);
      int int0 = foreignKeyConstraint0.compareTo(foreignKeyConstraint0);
      assertEquals(0, int0);
      
      foreignKeyConstraint0.getDeleteRuleName();
      foreignKeyConstraint0.getDeleteRuleDescription();
      boolean boolean0 = foreignKeyConstraint0.isReal();
      assertTrue(boolean0);
      
      foreignKeyConstraint0.getDeleteRuleAlias();
      foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals(3750, foreignKeyConstraint0.getUpdateRule());
      assertEquals(3750, foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "gV*DsC%)!^Kdaf", 0, 0);
      foreignKeyConstraint0.getDeleteRuleName();
      foreignKeyConstraint0.getDeleteRuleDescription();
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
      ForeignKeyConstraint foreignKeyConstraint1 = null;
      try {
        foreignKeyConstraint1 = new ForeignKeyConstraint(tableColumn0, tableColumn0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.schemaspy.model.TableColumn", e);
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.7478680974667573
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 800, 1);
      boolean boolean0 = foreignKeyConstraint0.isCascadeOnDelete();
      assertFalse(boolean0);
      
      String string0 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals("R", string0);
      
      String string1 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Restrict delete:\n Parent cannot be deleted if children exist", string1);
      
      boolean boolean1 = foreignKeyConstraint0.isRestrictDelete();
      assertEquals(800, foreignKeyConstraint0.getUpdateRule());
      assertTrue(boolean1);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "(k4XDS&", 24, 0);
      boolean boolean0 = foreignKeyConstraint0.isCascadeOnDelete();
      String string0 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals("C", string0);
      
      foreignKeyConstraint0.isReal();
      boolean boolean1 = foreignKeyConstraint0.isReal();
      assertTrue(boolean1 == boolean0);
      assertEquals(24, foreignKeyConstraint0.getUpdateRule());
      assertTrue(boolean1);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 800, 1);
      foreignKeyConstraint0.isCascadeOnDelete();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      Config config0 = new Config();
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      DatabaseMetaData databaseMetaData0 = mock(DatabaseMetaData.class, new ViolatedAssumptionAnswer());
      String string0 = "`PKpnGmKyk/n|t$:=.$";
      config0.getColumnExclusions();
      String string1 = ";M^Ir;h3QvIT54";
      String string2 = null;
      String string3 = "70HIM-BZ]$[N?L>tpr";
      foreignKeyConstraint0.getDeleteRuleName();
      SchemaMeta schemaMeta0 = null;
      try {
        schemaMeta0 = new SchemaMeta("Restrict delete", "70HIM-BZ]$[N?L>tpr", "");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Specified meta file \"Restrict delete\" does not exist
         //
         verifyException("net.sourceforge.schemaspy.model.xml.SchemaMeta", e);
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=2.2538575896013526
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 99, (-3394));
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "", 2, 46);
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
      foreignKeyConstraint1.addChildColumn((TableColumn) null);
      foreignKeyConstraint0.getParentColumns();
      foreignKeyConstraint1.isNullOnDelete();
      foreignKeyConstraint0.isRestrictDelete();
      foreignKeyConstraint0.getDeleteRuleName();
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
}