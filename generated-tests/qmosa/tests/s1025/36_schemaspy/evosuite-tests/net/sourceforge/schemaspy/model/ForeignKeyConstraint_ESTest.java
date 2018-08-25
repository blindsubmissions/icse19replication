/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 16:36:36 GMT 2018
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
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ForeignKeyConstraint_ESTest extends ForeignKeyConstraint_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "8`>gGRM`", 0, 0);
      TableColumnMeta tableColumnMeta0 = mock(TableColumnMeta.class, new ViolatedAssumptionAnswer());
      TableColumnMeta tableColumnMeta1 = mock(TableColumnMeta.class, new ViolatedAssumptionAnswer());
      List<TableColumn> list0 = foreignKeyConstraint0.getChildColumns();
      ForeignKeyConstraint.toString(list0);
      boolean boolean0 = foreignKeyConstraint0.isCascadeOnDelete();
      assertTrue(boolean0);
      
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "i-90gu3)hDu](]\"[tX", 0, 0);
      int int0 = foreignKeyConstraint0.compareTo(foreignKeyConstraint1);
      assertEquals((-49), int0);
      
      String string0 = foreignKeyConstraint1.getDeleteRuleName();
      assertEquals("Cascade on delete", string0);
      assertEquals(0, foreignKeyConstraint1.getUpdateRule());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.9061547465398496
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 147, 147);
      foreignKeyConstraint0.getChildColumns();
      boolean boolean0 = foreignKeyConstraint0.isCascadeOnDelete();
      assertFalse(boolean0);
      
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "i-90gu3)hDu](]\"[tX", 147, 3);
      int int0 = foreignKeyConstraint0.compareTo(foreignKeyConstraint1);
      assertEquals((-19), int0);
      
      String string0 = foreignKeyConstraint1.getDeleteRuleName();
      assertEquals("Restrict delete", string0);
      assertEquals(147, foreignKeyConstraint1.getUpdateRule());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.7963116401738131
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, (-49), 183);
      foreignKeyConstraint0.getDeleteRuleName();
      assertEquals(183, foreignKeyConstraint0.getDeleteRule());
      assertEquals((-49), foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = "8`>gGRM`";
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "8`>gGRM`", 0, 0);
      foreignKeyConstraint0.getChildColumns();
      foreignKeyConstraint0.getDeleteRuleAlias();
      Config config0 = null;
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      DatabaseMetaData databaseMetaData0 = mock(DatabaseMetaData.class, new ViolatedAssumptionAnswer());
      String string1 = "";
      String string2 = null;
      String string3 = null;
      SchemaMeta schemaMeta0 = null;
      try {
        schemaMeta0 = new SchemaMeta("-connprops", "-connprops", "' to ");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Specified meta file \"-connprops\" does not exist
         //
         verifyException("net.sourceforge.schemaspy.model.xml.SchemaMeta", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "8`>gGRM`", 0, 0);
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
      foreignKeyConstraint0.addChildColumn((TableColumn) null);
      foreignKeyConstraint0.addChildColumn(tableColumn0);
      TableColumnMeta tableColumnMeta1 = mock(TableColumnMeta.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(tableColumnMeta1).getComments();
      // Undeclared exception!
      try { 
        tableColumn0.update(tableColumnMeta1);
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
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", (-1), 0);
      TableColumnMeta tableColumnMeta0 = mock(TableColumnMeta.class, new ViolatedAssumptionAnswer());
      TableColumnMeta tableColumnMeta1 = mock(TableColumnMeta.class, new ViolatedAssumptionAnswer());
      List<TableColumn> list0 = foreignKeyConstraint0.getChildColumns();
      ForeignKeyConstraint.toString(list0);
      List<TableColumn> list1 = foreignKeyConstraint0.getChildColumns();
      ForeignKeyConstraint.toString(list1);
      boolean boolean0 = foreignKeyConstraint0.isCascadeOnDelete();
      assertTrue(boolean0);
      
      int int0 = foreignKeyConstraint0.getUpdateRule();
      assertEquals((-1), int0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 147, 147);
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "", 0, (-1038));
      foreignKeyConstraint0.getChildColumns();
      foreignKeyConstraint0.getDeleteRuleAlias();
      foreignKeyConstraint1.isCascadeOnDelete();
      Config config0 = null;
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      DatabaseMetaData databaseMetaData0 = mock(DatabaseMetaData.class, new ViolatedAssumptionAnswer());
      String string0 = ")'/@TI&";
      SchemaMeta schemaMeta0 = null;
      try {
        schemaMeta0 = new SchemaMeta(")'/@TI&", "", " via ");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Specified meta file \")'/@TI&\" does not exist
         //
         verifyException("net.sourceforge.schemaspy.model.xml.SchemaMeta", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "8`>gGRM`", 0, 0);
      List<TableColumn> list0 = foreignKeyConstraint0.getChildColumns();
      List<TableColumn> list1 = foreignKeyConstraint0.getParentColumns();
      ForeignKeyConstraint.toString(list0);
      boolean boolean0 = foreignKeyConstraint0.isCascadeOnDelete();
      assertTrue(boolean0);
      
      ForeignKeyConstraint.toString(list1);
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Cascade on delete:\n Deletion of parent deletes child", string0);
      assertEquals(0, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "8`>gGRM`", 0, 0);
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
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "", (-647), (-647));
      foreignKeyConstraint1.getChildColumns();
      List<TableColumn> list0 = foreignKeyConstraint1.getChildColumns();
      foreignKeyConstraint1.getParentColumns();
      ForeignKeyConstraint.toString(list0);
      boolean boolean0 = foreignKeyConstraint1.isCascadeOnDelete();
      assertEquals((-647), foreignKeyConstraint1.getUpdateRule());
      assertFalse(boolean0);
      assertEquals((-647), foreignKeyConstraint1.getDeleteRule());
      
      foreignKeyConstraint0.getChildTable();
      assertTrue(foreignKeyConstraint0.isCascadeOnDelete());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.7478680974667573
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = "8`>gGRM`";
      FileSystemHandling.shouldAllThrowIOExceptions();
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "8`>gGRM`", 0, 0);
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "8`>gGRM`", 1230, 2);
      foreignKeyConstraint1.getChildColumns();
      ForeignKeyConstraint foreignKeyConstraint2 = new ForeignKeyConstraint((Table) null, "8`>gGRM`", (-448), 2);
      foreignKeyConstraint1.isCascadeOnDelete();
      // Undeclared exception!
      try { 
        foreignKeyConstraint2.compareTo(foreignKeyConstraint1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "8`>gGRM`", 0, 0);
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
      TableColumnMeta tableColumnMeta1 = mock(TableColumnMeta.class, new ViolatedAssumptionAnswer());
      List<TableColumn> list0 = foreignKeyConstraint0.getChildColumns();
      TableColumn tableColumn0 = new TableColumn((Table) null, tableColumnMeta0);
      foreignKeyConstraint0.addChildColumn(tableColumn0);
      ForeignKeyConstraint.toString(list0);
      assertFalse(list0.isEmpty());
      
      String string0 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals("Cascade on delete", string0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "8`>gGRM`", 0, 0);
      List<TableColumn> list0 = foreignKeyConstraint0.getChildColumns();
      foreignKeyConstraint0.getParentColumns();
      ForeignKeyConstraint.toString(list0);
      boolean boolean0 = foreignKeyConstraint0.isCascadeOnDelete();
      boolean boolean1 = foreignKeyConstraint0.isImplied();
      assertEquals(0, foreignKeyConstraint0.getUpdateRule());
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "nF", (-546), (-546));
      foreignKeyConstraint0.getChildColumns();
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "nF", (-546), 0);
      foreignKeyConstraint0.getChildColumns();
      foreignKeyConstraint0.getDeleteRuleAlias();
      boolean boolean0 = foreignKeyConstraint0.isCascadeOnDelete();
      assertFalse(boolean0);
      
      boolean boolean1 = foreignKeyConstraint1.isCascadeOnDelete();
      assertEquals((-546), foreignKeyConstraint1.getUpdateRule());
      
      boolean boolean2 = foreignKeyConstraint0.isReal();
      assertEquals((-546), foreignKeyConstraint0.getDeleteRule());
      assertTrue(boolean2 == boolean1);
      assertTrue(boolean2);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 147, 147);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "", (-1440), (-1440));
      foreignKeyConstraint1.getChildColumns();
      List<TableColumn> list0 = foreignKeyConstraint0.getParentColumns();
      List<TableColumn> list1 = foreignKeyConstraint0.getChildColumns();
      ForeignKeyConstraint.toString(list1);
      boolean boolean0 = foreignKeyConstraint1.isCascadeOnDelete();
      assertFalse(boolean0);
      
      ForeignKeyConstraint.toString(list0);
      assertFalse(foreignKeyConstraint0.isCascadeOnDelete());
      
      foreignKeyConstraint1.getDeleteRuleDescription();
      assertEquals((-1440), foreignKeyConstraint1.getUpdateRule());
      assertEquals((-1440), foreignKeyConstraint1.getDeleteRule());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.666332585328325
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "8`>gGRM`", 0, 0);
      foreignKeyConstraint0.addParentColumn((TableColumn) null);
      TableColumnMeta tableColumnMeta0 = mock(TableColumnMeta.class, new ViolatedAssumptionAnswer());
      TableColumnMeta tableColumnMeta1 = mock(TableColumnMeta.class, new ViolatedAssumptionAnswer());
      List<TableColumn> list0 = foreignKeyConstraint0.getChildColumns();
      ForeignKeyConstraint.toString(list0);
      String string0 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals("Cascade on delete", string0);
      
      foreignKeyConstraint0.addParentColumn((TableColumn) null);
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      assertEquals(0, foreignKeyConstraint0.getUpdateRule());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.6674619334292948
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "8`>gGRM`", 0, 0);
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "8`>gGRM`", 1230, 2);
      foreignKeyConstraint1.getChildColumns();
      ForeignKeyConstraint foreignKeyConstraint2 = new ForeignKeyConstraint((Table) null, "8`>gGRM`", (-448), 2);
      foreignKeyConstraint1.addParentColumn((TableColumn) null);
      List<TableColumn> list0 = foreignKeyConstraint1.getChildColumns();
      ForeignKeyConstraint.toString(list0);
      String string0 = foreignKeyConstraint2.getDeleteRuleName();
      assertEquals("Null on delete", string0);
      assertEquals((-448), foreignKeyConstraint2.getUpdateRule());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.945934775756114
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "8`>gGRM`", 0, 0);
      List<TableColumn> list0 = foreignKeyConstraint0.getChildColumns();
      List<TableColumn> list1 = foreignKeyConstraint0.getParentColumns();
      ForeignKeyConstraint.toString(list0);
      boolean boolean0 = foreignKeyConstraint0.isCascadeOnDelete();
      boolean boolean1 = foreignKeyConstraint0.isNullOnDelete();
      assertFalse(boolean1 == boolean0);
      
      String string0 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals("Cascade on delete", string0);
      
      ForeignKeyConstraint.toString(list1);
      foreignKeyConstraint0.getParentTable();
      assertEquals(0, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
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
  //Test case number: 18
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "8`>gGRM`", 0, 0);
      foreignKeyConstraint0.addParentColumn((TableColumn) null);
      ForeignKeyConstraint foreignKeyConstraint1 = null;
      try {
        foreignKeyConstraint1 = new ForeignKeyConstraint((TableColumn) null, (TableColumn) null, (-1028), 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.schemaspy.model.ForeignKeyConstraint", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "8`>gGRM`", 0, 0);
      foreignKeyConstraint0.getChildColumns();
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
      Config config0 = new Config();
      foreignKeyConstraint0.isCascadeOnDelete();
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "8`>gGRM`", (-1015), 0);
      String string0 = foreignKeyConstraint1.getDeleteRuleName();
      assertTrue(foreignKeyConstraint1.isCascadeOnDelete());
      assertEquals((-1015), foreignKeyConstraint1.getUpdateRule());
      assertEquals("Cascade on delete", string0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=2.1458417525947544
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "8`>gGRM`", 0, 0);
      TableColumnMeta tableColumnMeta0 = mock(TableColumnMeta.class, new ViolatedAssumptionAnswer());
      TableColumnMeta tableColumnMeta1 = mock(TableColumnMeta.class, new ViolatedAssumptionAnswer());
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "", 0, 1);
      foreignKeyConstraint0.isCascadeOnDelete();
      int int0 = foreignKeyConstraint1.compareTo(foreignKeyConstraint0);
      assertEquals((-8), int0);
      
      Config config0 = new Config();
      boolean boolean0 = foreignKeyConstraint0.isCascadeOnDelete();
      assertTrue(boolean0);
      
      List<TableColumn> list0 = foreignKeyConstraint0.getParentColumns();
      foreignKeyConstraint0.getChildColumns();
      ForeignKeyConstraint.toString(list0);
      ForeignKeyConstraint foreignKeyConstraint2 = new ForeignKeyConstraint((Table) null, "table", 1, (-377));
      assertEquals(1, foreignKeyConstraint2.getUpdateRule());
      assertFalse(foreignKeyConstraint2.isCascadeOnDelete());
      
      String string0 = foreignKeyConstraint1.getDeleteRuleName();
      assertFalse(foreignKeyConstraint1.isCascadeOnDelete());
      assertEquals("Restrict delete", string0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.5810937501718236
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 0, 3);
      foreignKeyConstraint0.getDeleteRuleAlias();
      boolean boolean0 = foreignKeyConstraint0.isCascadeOnDelete();
      boolean boolean1 = foreignKeyConstraint0.isNullOnDelete();
      assertTrue(boolean1 == boolean0);
      
      System.setCurrentTimeMillis(0);
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Restrict delete:\n Parent cannot be deleted if children exist", string0);
      
      String string1 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals("R", string1);
      assertEquals(0, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Null on delete:\n Foreign key to parent set to NULL when parent deleted", (-4183), 3);
      String string0 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals("R", string0);
      
      foreignKeyConstraint0.isCascadeOnDelete();
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      boolean boolean1 = foreignKeyConstraint0.isCascadeOnDelete();
      assertFalse(boolean1 == boolean0);
      
      String string1 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals("Restrict delete", string1);
      
      String string2 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Restrict delete:\n Parent cannot be deleted if children exist", string2);
      assertEquals((-4183), foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", (-1795), (-17));
      foreignKeyConstraint0.compareTo(foreignKeyConstraint0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "i-0gu3)hDu](][tX";
      Config config0 = new Config(stringArray0);
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      System.setCurrentTimeMillis(22);
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
  //Test case number: 24
  /*Coverage entropy=1.4750763110546947
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 2, 2);
      String string0 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals("N", string0);
      
      boolean boolean0 = foreignKeyConstraint0.isCascadeOnDelete();
      assertFalse(boolean0);
      
      System.setCurrentTimeMillis(2);
      String string1 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Null on delete:\n Foreign key to parent set to NULL when parent deleted", string1);
      assertEquals(2, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 1268, 1);
      foreignKeyConstraint0.getDeleteRuleDescription();
      Config config0 = new Config();
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      DatabaseMetaData databaseMetaData0 = mock(DatabaseMetaData.class, new ViolatedAssumptionAnswer());
      String string0 = "Cascade on delete";
      SchemaMeta schemaMeta0 = null;
      try {
        schemaMeta0 = new SchemaMeta((String) null, "`n", "@3JCC!NVi2m1PMZ F]");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Null o3 delete:\n Gorei0n key to parent set to NULL whe8 parent deleted", 12, 12);
      assertFalse(foreignKeyConstraint0.isRestrictDelete());
      
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "IC$ln=", 1845, 1);
      System.setCurrentTimeMillis(1845);
      boolean boolean0 = foreignKeyConstraint1.isRestrictDelete();
      assertTrue(boolean0);
      assertEquals(1845, foreignKeyConstraint1.getUpdateRule());
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Null on deletx:\n Foreign key to parent8set to NULL wheO parent deleted", 1709, 49);
      String string0 = "";
      int int0 = 1;
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "", (-718), 1);
      foreignKeyConstraint1.getDeleteRuleAlias();
      FileSystemHandling.shouldAllThrowIOExceptions();
      foreignKeyConstraint1.isNullOnDelete();
      Config config0 = new Config();
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      DatabaseMetaData databaseMetaData0 = mock(DatabaseMetaData.class, new ViolatedAssumptionAnswer());
      String string1 = "A\"v,S";
      String string2 = " via ";
      SchemaMeta schemaMeta0 = null;
      try {
        schemaMeta0 = new SchemaMeta("R", " via ", (String) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Specified meta file \"R\" does not exist
         //
         verifyException("net.sourceforge.schemaspy.model.xml.SchemaMeta", e);
      }
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Null o3 delete:\n Gorei0n key to parent set to NULL whe8 parent deleted", 2, 2);
      FileSystemHandling.shouldAllThrowIOExceptions();
      foreignKeyConstraint0.isNullOnDelete();
      foreignKeyConstraint0.isRestrictDelete();
      foreignKeyConstraint0.isRestrictDelete();
      foreignKeyConstraint0.isRestrictDelete();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "Null o3 delete:\n Gorei0n key to parent set to NULL whe8 parent deleted";
      stringArray0[1] = "Null o3 delete:\n Gorei0n key to parent set to NULL whe8 parent deleted";
      String string0 = "GLOBAL";
      stringArray0[2] = "GLOBAL";
      stringArray0[3] = "Null o3 delete:\n Gorei0n key to parent set to NULL whe8 parent deleted";
      stringArray0[4] = "Null o3 delete:\n Gorei0n key to parent set to NULL whe8 parent deleted";
      stringArray0[5] = "Null o3 delete:\n Gorei0n key to parent set to NULL whe8 parent deleted";
      stringArray0[6] = "Null o3 delete:\n Gorei0n key to parent set to NULL whe8 parent deleted";
      Config config0 = new Config(stringArray0);
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      DatabaseMetaData databaseMetaData0 = mock(DatabaseMetaData.class, new ViolatedAssumptionAnswer());
      String string1 = "e";
      String string2 = "[sb!O";
      SchemaMeta schemaMeta0 = null;
      try {
        schemaMeta0 = new SchemaMeta("", "Null o3 delete:\n Gorei0n key to parent set to NULL whe8 parent deleted", "Null o3 delete:\n Gorei0n key to parent set to NULL whe8 parent deleted");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Meta directory \"\" must contain a file named \"Null o3 delete:
         //  Gorei0n key to parent set to NULL whe8 parent deleted.meta.xml\"
         //
         verifyException("net.sourceforge.schemaspy.model.xml.SchemaMeta", e);
      }
  }
}
