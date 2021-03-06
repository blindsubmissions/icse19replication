/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 17:11:20 GMT 2018
 */

package net.sourceforge.schemaspy.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
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
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Config.getInstance();
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
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
  //Test case number: 1
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Table table0 = null;
      String string0 = "Restrict delete";
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Restrict delete", 0, 0);
      foreignKeyConstraint0.isImplied();
      foreignKeyConstraint0.getParentColumns();
      foreignKeyConstraint0.getChildColumns();
      List<TableColumn> list0 = foreignKeyConstraint0.getParentColumns();
      ForeignKeyConstraint.toString(list0);
      String[] stringArray0 = null;
      foreignKeyConstraint0.getDeleteRuleDescription();
      Config.getInstance();
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      DatabaseMetaData databaseMetaData0 = null;
      String string1 = "";
      SchemaMeta schemaMeta0 = null;
      try {
        schemaMeta0 = new SchemaMeta("vInJ];-rdm", (String) null, " names with custom SQL: ");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Specified meta file \"vInJ];-rdm\" does not exist
         //
         verifyException("net.sourceforge.schemaspy.model.xml.SchemaMeta", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "  <div class='viewDefinition'>", 171, (-293));
      foreignKeyConstraint0.isReal();
      List<TableColumn> list0 = foreignKeyConstraint0.getChildColumns();
      foreignKeyConstraint0.getParentColumns();
      List<TableColumn> list1 = foreignKeyConstraint0.getParentColumns();
      ForeignKeyConstraint.toString(list1);
      foreignKeyConstraint0.getUpdateRule();
      foreignKeyConstraint0.getDeleteRuleName();
      foreignKeyConstraint0.getParentTable();
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
      foreignKeyConstraint0.getChildColumns();
      ForeignKeyConstraint.toString(list0);
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "java.util.Collections$UnmodifiableRandomAccessList@0000000005", (-147), 2718);
      Config.getInstance();
      System.setCurrentTimeMillis(171);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 0, 2686);
      boolean boolean0 = foreignKeyConstraint0.isImplied();
      List<TableColumn> list0 = foreignKeyConstraint0.getChildColumns();
      foreignKeyConstraint0.getParentColumns();
      ForeignKeyConstraint.toString(list0);
      boolean boolean1 = foreignKeyConstraint0.isCascadeOnDelete();
      assertTrue(boolean1 == boolean0);
      
      foreignKeyConstraint0.getName();
      assertEquals(0, foreignKeyConstraint0.getUpdateRule());
      assertEquals(2686, foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.0642580751745085
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Restrict delete", 4, 4);
      foreignKeyConstraint0.isImplied();
      foreignKeyConstraint0.getChildColumns();
      List<TableColumn> list0 = foreignKeyConstraint0.getParentColumns();
      ForeignKeyConstraint.toString(list0);
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      DatabaseMetaData databaseMetaData0 = mock(DatabaseMetaData.class, new ViolatedAssumptionAnswer());
      foreignKeyConstraint0.getDeleteRuleDescription();
      foreignKeyConstraint0.isNullOnDelete();
      // Undeclared exception!
      try { 
        foreignKeyConstraint0.compareTo((ForeignKeyConstraint) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.schemaspy.model.ForeignKeyConstraint", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Restrict delete", 0, 0);
      boolean boolean0 = foreignKeyConstraint0.isReal();
      assertTrue(boolean0);
      
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
      List<TableColumn> list0 = foreignKeyConstraint0.getChildColumns();
      Config.getInstance();
      boolean boolean1 = foreignKeyConstraint0.isNullOnDelete();
      List<TableColumn> list1 = foreignKeyConstraint0.getParentColumns();
      ForeignKeyConstraint.toString(list0);
      assertFalse(list0.equals((Object)list1));
      
      boolean boolean2 = foreignKeyConstraint0.isCascadeOnDelete();
      assertFalse(boolean2 == boolean1);
      
      foreignKeyConstraint0.getName();
      assertEquals(0, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.945934775756114
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Restrict delete", 0, 0);
      boolean boolean0 = foreignKeyConstraint0.isImplied();
      foreignKeyConstraint0.getChildColumns();
      int int0 = foreignKeyConstraint0.getUpdateRule();
      assertEquals(0, int0);
      
      foreignKeyConstraint0.getParentColumns();
      boolean boolean1 = foreignKeyConstraint0.isReal();
      assertFalse(boolean1 == boolean0);
      
      String string0 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals("C", string0);
      
      String string1 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals("Cascade on delete", string1);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.0791512728828505
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 4, 4);
      boolean boolean0 = foreignKeyConstraint0.isImplied();
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "pt", 1309, 2768);
      foreignKeyConstraint1.getChildColumns();
      List<TableColumn> list0 = foreignKeyConstraint0.getParentColumns();
      ForeignKeyConstraint.toString(list0);
      foreignKeyConstraint1.getDeleteRuleDescription();
      boolean boolean1 = foreignKeyConstraint1.isNullOnDelete();
      assertTrue(boolean1 == boolean0);
      
      int int0 = foreignKeyConstraint1.compareTo(foreignKeyConstraint0);
      assertEquals(2, int0);
      assertEquals(2768, foreignKeyConstraint1.getDeleteRule());
      assertEquals(1309, foreignKeyConstraint1.getUpdateRule());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 0, (-2736));
      boolean boolean0 = foreignKeyConstraint0.isNullOnDelete();
      List<TableColumn> list0 = foreignKeyConstraint0.getChildColumns();
      foreignKeyConstraint0.getParentColumns();
      ForeignKeyConstraint.toString(list0);
      boolean boolean1 = foreignKeyConstraint0.isCascadeOnDelete();
      assertTrue(boolean1 == boolean0);
      
      foreignKeyConstraint0.getChildTable();
      assertEquals((-2736), foreignKeyConstraint0.getDeleteRule());
      assertEquals(0, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.9459347757561138
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, false);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Restrict delete", 4, 4);
      boolean boolean0 = foreignKeyConstraint0.isImplied();
      foreignKeyConstraint0.getChildColumns();
      List<TableColumn> list0 = foreignKeyConstraint0.getParentColumns();
      ForeignKeyConstraint.toString(list0);
      DatabaseMetaData databaseMetaData0 = mock(DatabaseMetaData.class, new ViolatedAssumptionAnswer());
      foreignKeyConstraint0.getDeleteRuleDescription();
      boolean boolean1 = foreignKeyConstraint0.isNullOnDelete();
      assertTrue(boolean1 == boolean0);
      
      foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals(4, foreignKeyConstraint0.getDeleteRule());
      assertEquals(4, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.0642580751745085
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 4, 4);
      boolean boolean0 = foreignKeyConstraint0.isImplied();
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
      List<TableColumn> list0 = foreignKeyConstraint0.getChildColumns();
      List<TableColumn> list1 = foreignKeyConstraint0.getParentColumns();
      ForeignKeyConstraint.toString(list0);
      assertFalse(list0.equals((Object)list1));
      
      foreignKeyConstraint0.getDeleteRuleDescription();
      boolean boolean1 = foreignKeyConstraint0.isNullOnDelete();
      assertTrue(boolean1 == boolean0);
      
      int int0 = foreignKeyConstraint0.compareTo(foreignKeyConstraint0);
      assertEquals(4, foreignKeyConstraint0.getDeleteRule());
      assertEquals(4, foreignKeyConstraint0.getUpdateRule());
      assertEquals(0, int0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "net.sourceforge.schemaspy.model.TableIndex", 2676, 2676);
      foreignKeyConstraint0.addChildColumn((TableColumn) null);
      Config config0 = Config.getInstance();
      assertNull(config0.getConnectionPropertiesFile());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.0431918705451206
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Restrict delete", 0, 0);
      foreignKeyConstraint0.isReal();
      foreignKeyConstraint0.getDeleteRuleDescription();
      Config.getInstance();
      foreignKeyConstraint0.isRestrictDelete();
      foreignKeyConstraint0.isReal();
      foreignKeyConstraint0.getChildColumns();
      Config.getInstance();
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "UTF-8", 0, 2);
      foreignKeyConstraint1.isNullOnDelete();
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
  //Test case number: 13
  /*Coverage entropy=2.0791512728828505
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 4, 4);
      foreignKeyConstraint0.isImplied();
      foreignKeyConstraint0.getParentColumns();
      foreignKeyConstraint0.isReal();
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "", 4, 4);
      foreignKeyConstraint1.getChildColumns();
      foreignKeyConstraint1.getDeleteRuleDescription();
      foreignKeyConstraint1.isNullOnDelete();
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
  //Test case number: 14
  /*Coverage entropy=2.278302525039135
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, false);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Restrict delete", 4, 4);
      foreignKeyConstraint0.isImplied();
      List<TableColumn> list0 = foreignKeyConstraint0.getChildColumns();
      List<TableColumn> list1 = foreignKeyConstraint0.getParentColumns();
      ForeignKeyConstraint.toString(list1);
      DatabaseMetaData databaseMetaData0 = mock(DatabaseMetaData.class, new ViolatedAssumptionAnswer());
      foreignKeyConstraint0.getDeleteRuleDescription();
      foreignKeyConstraint0.getDeleteRuleAlias();
      ForeignKeyConstraint.toString(list0);
      foreignKeyConstraint0.getDeleteRuleName();
      foreignKeyConstraint0.getDeleteRuleDescription();
      foreignKeyConstraint0.isReal();
      foreignKeyConstraint0.getDeleteRuleName();
      foreignKeyConstraint0.isRestrictDelete();
      foreignKeyConstraint0.addParentColumn((TableColumn) null);
      System.setCurrentTimeMillis(4);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.3662893177133655
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "x", 106, 4);
      foreignKeyConstraint0.isImplied();
      List<TableColumn> list0 = foreignKeyConstraint0.getChildColumns();
      foreignKeyConstraint0.getUpdateRule();
      List<TableColumn> list1 = foreignKeyConstraint0.getParentColumns();
      ForeignKeyConstraint.toString(list1);
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
      foreignKeyConstraint0.isReal();
      foreignKeyConstraint0.getDeleteRuleAlias();
      foreignKeyConstraint0.getDeleteRuleName();
      ForeignKeyConstraint.toString(list0);
      assertEquals(1, list0.size());
      
      foreignKeyConstraint0.isReal();
      foreignKeyConstraint0.isCascadeOnDelete();
      foreignKeyConstraint0.isReal();
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("", string0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.0431918705451206
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "}.=M}Bo3aTGinf*2*L", 2686, 1);
      foreignKeyConstraint0.getDeleteRuleDescription();
      Config.getInstance();
      foreignKeyConstraint0.isRestrictDelete();
      foreignKeyConstraint0.isReal();
      foreignKeyConstraint0.getChildColumns();
      Config.getInstance();
      foreignKeyConstraint0.isReal();
      foreignKeyConstraint0.getDeleteRuleAlias();
      foreignKeyConstraint0.getDeleteRuleName();
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      DatabaseMetaData databaseMetaData0 = mock(DatabaseMetaData.class, new ViolatedAssumptionAnswer());
      String string0 = "";
      SchemaMeta schemaMeta0 = null;
      try {
        schemaMeta0 = new SchemaMeta("N", "R", "");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Specified meta file \"N\" does not exist
         //
         verifyException("net.sourceforge.schemaspy.model.xml.SchemaMeta", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.08442976821535
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "}.=M}Bo3aTGinf*2*L", 2686, 1);
      foreignKeyConstraint0.getDeleteRuleDescription();
      Config.getInstance();
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, false);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "}.=M}Bo3aTGinf*2*L", 1, 2);
      foreignKeyConstraint1.getParentColumns();
      foreignKeyConstraint1.isReal();
      foreignKeyConstraint0.getDeleteRuleAlias();
      foreignKeyConstraint1.getDeleteRuleName();
      foreignKeyConstraint0.getDeleteRuleDescription();
      foreignKeyConstraint0.isReal();
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
  //Test case number: 18
  /*Coverage entropy=1.8364223867541591
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "remarks");
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "%NJ[|]/N?>A;", 95, 58);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "%NJ[|]/N?>A;", (-3115), 3);
      foreignKeyConstraint0.getParentColumns();
      boolean boolean0 = foreignKeyConstraint1.isReal();
      foreignKeyConstraint0.getDeleteRuleAlias();
      String string0 = foreignKeyConstraint1.getDeleteRuleName();
      assertTrue(foreignKeyConstraint1.isRestrictDelete());
      assertEquals("Restrict delete", string0);
      
      ForeignKeyConstraint foreignKeyConstraint2 = new ForeignKeyConstraint((Table) null, "remarks", (-3115), 64);
      foreignKeyConstraint2.getDeleteRuleDescription();
      Config.getInstance();
      boolean boolean1 = foreignKeyConstraint2.isRestrictDelete();
      assertFalse(boolean1 == boolean0);
      assertEquals((-3115), foreignKeyConstraint2.getUpdateRule());
      assertFalse(boolean1);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.5810937501718236
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "}.=M}Bo3aTGinf*2*L", 2686, 1);
      foreignKeyConstraint0.getDeleteRuleDescription();
      Config config0 = new Config();
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, false);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "}.=M}Bo3aTGinf*2*L", 1, 2);
      boolean boolean0 = foreignKeyConstraint1.isReal();
      assertTrue(boolean0);
      
      String string0 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals("R", string0);
      
      String string1 = foreignKeyConstraint1.getDeleteRuleName();
      assertEquals("Null on delete", string1);
      
      String string2 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Restrict delete:\n Parent cannot be deleted if children exist", string2);
      
      Config.getInstance();
      String string3 = foreignKeyConstraint1.getDeleteRuleDescription();
      assertEquals("Null on delete:\n Foreign key to parent set to NULL when parent deleted", string3);
      assertEquals(1, foreignKeyConstraint1.getUpdateRule());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.1682824501765625
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Failed to validate ", 1, 2);
      foreignKeyConstraint0.getDeleteRuleAlias();
      foreignKeyConstraint0.getDeleteRuleName();
      foreignKeyConstraint0.getDeleteRuleAlias();
      foreignKeyConstraint0.getDeleteRuleName();
      Config.getInstance();
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
}
