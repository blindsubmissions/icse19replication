/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 16:25:23 GMT 2018
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
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ForeignKeyConstraint_ESTest extends ForeignKeyConstraint_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TableColumn tableColumn0 = null;
      ForeignKeyConstraint foreignKeyConstraint0 = null;
      try {
        foreignKeyConstraint0 = new ForeignKeyConstraint((TableColumn) null, (TableColumn) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.schemaspy.model.ForeignKeyConstraint", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = "Qv-\\^<dxz|R(N76";
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Qv-^<dxz|R(N76", 1529, (-737));
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
      foreignKeyConstraint0.isNullOnDelete();
      foreignKeyConstraint0.getName();
      TableColumn tableColumn0 = new TableColumn((Table) null, tableColumnMeta0);
      foreignKeyConstraint0.addParentColumn(tableColumn0);
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
  //Test case number: 2
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Qv-^<dxz|R(N76", 1507, 1507);
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      DatabaseMetaData databaseMetaData0 = mock(DatabaseMetaData.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = foreignKeyConstraint0.isImplied();
      assertFalse(boolean0);
      
      foreignKeyConstraint0.getDeleteRuleDescription();
      foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals(1507, foreignKeyConstraint0.getUpdateRule());
      assertEquals(1507, foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Qv-^<dxz|R(N76", 1529, 1529);
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      DatabaseMetaData databaseMetaData0 = mock(DatabaseMetaData.class, new ViolatedAssumptionAnswer());
      foreignKeyConstraint0.isRestrictDelete();
      foreignKeyConstraint0.getDeleteRuleDescription();
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      assertFalse(boolean0);
      
      foreignKeyConstraint0.getParentTable();
      assertEquals(1529, foreignKeyConstraint0.getDeleteRule());
      assertEquals(1529, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.7478680974667573
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Qv-^<dxz|R(N76", 1529, 1529);
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "Qv-^<dxz|R(N76", 1529, (-1));
      foreignKeyConstraint1.isRestrictDelete();
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
      ForeignKeyConstraint foreignKeyConstraint2 = null;
      try {
        foreignKeyConstraint2 = new ForeignKeyConstraint(tableColumn0, tableColumn0, (-1), (-97));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.schemaspy.model.TableColumn", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.540305825226517
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Qv-^<dxz|R(N76", 1529, 1529);
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "Qv-^<dxz|R(N76", 1529, (-1));
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, (String) null);
      boolean boolean0 = foreignKeyConstraint1.isRestrictDelete();
      assertFalse(boolean0);
      
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, false);
      foreignKeyConstraint1.getDeleteRuleDescription();
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
      foreignKeyConstraint0.addParentColumn(tableColumn0);
      foreignKeyConstraint1.getDeleteRuleName();
      foreignKeyConstraint1.getDeleteRuleName();
      assertEquals((-1), foreignKeyConstraint1.getDeleteRule());
      assertEquals(1529, foreignKeyConstraint1.getUpdateRule());
      
      foreignKeyConstraint0.addParentColumn(tableColumn0);
      assertFalse(foreignKeyConstraint0.isRestrictDelete());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.277034259466139
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Qv-^<dxz|R(N76", 1529, 1529);
      assertFalse(foreignKeyConstraint0.isRestrictDelete());
      
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "Qv-^<dxz|R(N76", 1529, (-1));
      boolean boolean0 = foreignKeyConstraint1.isRestrictDelete();
      assertFalse(boolean0);
      
      ForeignKeyConstraint foreignKeyConstraint2 = new ForeignKeyConstraint((Table) null, (String) null, 0, 2);
      foreignKeyConstraint1.getDeleteRuleAlias();
      assertEquals(1529, foreignKeyConstraint1.getUpdateRule());
      
      String string0 = foreignKeyConstraint2.getDeleteRuleAlias();
      assertEquals("N", string0);
      assertFalse(foreignKeyConstraint2.isRestrictDelete());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.2718685126965625
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Qv-^<dxz|R(N76", 1529, (-737));
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      foreignKeyConstraint0.getParentColumns();
      DatabaseMetaData databaseMetaData0 = mock(DatabaseMetaData.class, new ViolatedAssumptionAnswer());
      Connection connection1 = mock(Connection.class, new ViolatedAssumptionAnswer());
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "h8\"r#|", (-769), (-1));
      int int0 = foreignKeyConstraint0.compareTo(foreignKeyConstraint1);
      assertEquals(9, int0);
      
      List<TableColumn> list0 = foreignKeyConstraint0.getChildColumns();
      boolean boolean0 = foreignKeyConstraint0.isCascadeOnDelete();
      assertFalse(boolean0);
      
      foreignKeyConstraint0.getParentTable();
      foreignKeyConstraint1.addChildColumn((TableColumn) null);
      ForeignKeyConstraint.toString(list0);
      assertEquals(1529, foreignKeyConstraint0.getUpdateRule());
      assertEquals((-737), foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.15374194270109
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Qv-^<dxz|R(N76", 1529, (-737));
      foreignKeyConstraint0.isNullOnDelete();
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "Qv-^<dxz|R(N76", 3, 1);
      assertFalse(foreignKeyConstraint1.isNullOnDelete());
      
      ForeignKeyConstraint foreignKeyConstraint2 = new ForeignKeyConstraint((Table) null, "Qv-^<dxz|R(N76", 1, 3);
      foreignKeyConstraint2.getDeleteRuleAlias();
      String string0 = foreignKeyConstraint2.getDeleteRuleAlias();
      assertEquals("R", string0);
      assertFalse(foreignKeyConstraint2.isNullOnDelete());
      assertEquals(3, foreignKeyConstraint2.getDeleteRule());
      assertEquals(1, foreignKeyConstraint2.getUpdateRule());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Qv-^<dxz|R(N76", 1529, (-796));
      foreignKeyConstraint0.getChildColumns();
      foreignKeyConstraint0.getUpdateRule();
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
  //Test case number: 10
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Qv-^<dxz|R(N76", 1529, 1529);
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "Qv-^<dxz|R(N76", 1529, 1);
      foreignKeyConstraint1.isRestrictDelete();
      foreignKeyConstraint1.getDeleteRuleDescription();
      TableColumnMeta tableColumnMeta0 = mock(TableColumnMeta.class, new ViolatedAssumptionAnswer());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.1682824501765625
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 0, 2);
      String string0 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals("N", string0);
      
      String string1 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals(0, foreignKeyConstraint0.getUpdateRule());
      assertEquals("Null on delete", string1);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, ":v-^4*@dxzRUN76", 1529, (-737));
      TableColumnMeta tableColumnMeta0 = mock(TableColumnMeta.class, new ViolatedAssumptionAnswer());
      foreignKeyConstraint0.isCascadeOnDelete();
      foreignKeyConstraint0.getName();
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, ":v-^4*@dxzRUN76");
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      foreignKeyConstraint0.getDeleteRuleDescription();
      foreignKeyConstraint0.isRestrictDelete();
      foreignKeyConstraint0.getDeleteRuleName();
      foreignKeyConstraint0.getChildTable();
      boolean boolean1 = foreignKeyConstraint0.isCascadeOnDelete();
      assertEquals(1529, foreignKeyConstraint0.getUpdateRule());
      assertEquals((-737), foreignKeyConstraint0.getDeleteRule());
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.3592367006650063
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Qv-^<dxz|R(N76", 1529, 1529);
      int int0 = foreignKeyConstraint0.compareTo(foreignKeyConstraint0);
      assertEquals(0, int0);
      
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      DatabaseMetaData databaseMetaData0 = mock(DatabaseMetaData.class, new ViolatedAssumptionAnswer());
      foreignKeyConstraint0.isRestrictDelete();
      foreignKeyConstraint0.getDeleteRuleDescription();
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      assertEquals(1529, foreignKeyConstraint0.getDeleteRule());
      assertEquals(1529, foreignKeyConstraint0.getUpdateRule());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.0431918705451206
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, ":v-^4*@dxzRUN76", 1529, (-737));
      TableColumnMeta tableColumnMeta0 = mock(TableColumnMeta.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = foreignKeyConstraint0.isCascadeOnDelete();
      assertFalse(boolean0);
      
      foreignKeyConstraint0.getName();
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, ":v-^4*@dxzRUN76");
      boolean boolean1 = foreignKeyConstraint0.isRestrictDelete();
      foreignKeyConstraint0.getDeleteRuleDescription();
      foreignKeyConstraint0.isRestrictDelete();
      foreignKeyConstraint0.getDeleteRuleName();
      boolean boolean2 = foreignKeyConstraint0.isReal();
      assertEquals((-737), foreignKeyConstraint0.getDeleteRule());
      assertFalse(boolean2 == boolean1);
      assertEquals(1529, foreignKeyConstraint0.getUpdateRule());
      assertTrue(boolean2);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.277034259466139
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 0, 2);
      foreignKeyConstraint0.isRestrictDelete();
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Null on delete:\n Foreign key to parent set to NULL when parent deleted", string0);
      
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      assertFalse(boolean0);
      assertEquals(0, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.212256610922266
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, true);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "Restrict delete");
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Qv-^<dxz|R(N76", 1529, (-737));
      TableColumnMeta tableColumnMeta0 = mock(TableColumnMeta.class, new ViolatedAssumptionAnswer());
      foreignKeyConstraint0.isNullOnDelete();
      System.setCurrentTimeMillis(1);
      List<TableColumn> list0 = foreignKeyConstraint0.getParentColumns();
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "Qv-^<dxz|R(N76", 9, 1);
      foreignKeyConstraint0.isRestrictDelete();
      foreignKeyConstraint0.getDeleteRuleDescription();
      ForeignKeyConstraint.toString(list0);
      foreignKeyConstraint0.isRestrictDelete();
      foreignKeyConstraint1.getDeleteRuleName();
      // Undeclared exception!
      try { 
        foreignKeyConstraint1.compareTo(foreignKeyConstraint0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, ":v-^4*@dxzRUN76", 1529, (-737));
      boolean boolean0 = foreignKeyConstraint0.isCascadeOnDelete();
      assertFalse(boolean0);
      
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "");
      foreignKeyConstraint0.isRestrictDelete();
      assertEquals((-737), foreignKeyConstraint0.getDeleteRule());
      
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, ":v-^4*@dxzRUN76", 1529, 0);
      foreignKeyConstraint1.getDeleteRuleAlias();
      String string0 = foreignKeyConstraint1.getDeleteRuleAlias();
      assertTrue(foreignKeyConstraint1.isCascadeOnDelete());
      assertEquals(1529, foreignKeyConstraint1.getUpdateRule());
      assertEquals("C", string0);
      assertFalse(foreignKeyConstraint1.isRestrictDelete());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 0, 2);
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      boolean boolean1 = foreignKeyConstraint0.isCascadeOnDelete();
      boolean boolean2 = foreignKeyConstraint0.isNullOnDelete();
      assertFalse(boolean2 == boolean1);
      assertFalse(boolean2 == boolean0);
      assertEquals(0, foreignKeyConstraint0.getUpdateRule());
      assertTrue(boolean2);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)3;
      byteArray0[1] = (byte) (-45);
      byteArray0[2] = (byte)2;
      byteArray0[3] = (byte)78;
      byteArray0[4] = (byte) (-1);
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 0, 0);
      boolean boolean0 = foreignKeyConstraint0.isCascadeOnDelete();
      boolean boolean1 = foreignKeyConstraint0.isReal();
      assertTrue(boolean1 == boolean0);
      assertEquals(0, foreignKeyConstraint0.getUpdateRule());
      assertTrue(boolean1);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Qv-^<dxz|R(N76", 1529, 0);
      boolean boolean0 = foreignKeyConstraint0.isReal();
      assertTrue(boolean0);
      
      String string0 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals("Cascade on delete", string0);
      assertEquals(1529, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 3149, 3);
      foreignKeyConstraint0.isRestrictDelete();
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Restrict delete:\n Parent cannot be deleted if children exist", string0);
      
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      assertEquals(3149, foreignKeyConstraint0.getUpdateRule());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 0, 0);
      String string0 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals("C", string0);
      
      String string1 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals("Cascade on delete", string1);
      
      String string2 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Cascade on delete:\n Deletion of parent deletes child", string2);
      assertEquals(0, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.666332585328325
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Qv-^<dxz|R(N76", (-798), 30);
      foreignKeyConstraint0.getDeleteRuleAlias();
      foreignKeyConstraint0.getDeleteRuleName();
      assertEquals((-798), foreignKeyConstraint0.getUpdateRule());
      assertEquals(30, foreignKeyConstraint0.getDeleteRule());
      
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "Qv-^<dxz|R(N76", 3, 3);
      String string0 = foreignKeyConstraint1.getDeleteRuleDescription();
      assertEquals("Restrict delete:\n Parent cannot be deleted if children exist", string0);
      
      boolean boolean0 = foreignKeyConstraint1.isReal();
      assertTrue(boolean0);
      
      foreignKeyConstraint1.addParentColumn((TableColumn) null);
      assertFalse(foreignKeyConstraint1.isNullOnDelete());
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.1490596969706204
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = "Qv-\\^dxz|R(N76";
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Qv-^dxz|R(N76", 1529, 1529);
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "Qv-^dxz|R(N76", (-1748), 1);
      foreignKeyConstraint1.getDeleteRuleAlias();
      foreignKeyConstraint0.getDeleteRuleName();
      Config.getInstance();
      Connection connection0 = null;
      DatabaseMetaData databaseMetaData0 = mock(DatabaseMetaData.class, new ViolatedAssumptionAnswer());
      String string1 = "F8FZZ-*?71 t>++";
      SchemaMeta schemaMeta0 = null;
      try {
        schemaMeta0 = new SchemaMeta("`mI2gwwU", "F8FZZ-*?71 t>++", "");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Specified meta file \"`mI2gwwU\" does not exist
         //
         verifyException("net.sourceforge.schemaspy.model.xml.SchemaMeta", e);
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LinkedList<TableColumn> linkedList0 = new LinkedList<TableColumn>();
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

  /**
  //Test case number: 26
  /*Coverage entropy=1.519382664642301
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Cascade on delete:\n Deletion of parent deletes child", 189, 3);
      foreignKeyConstraint0.getDeleteRuleAlias();
      foreignKeyConstraint0.getDeleteRuleName();
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
}