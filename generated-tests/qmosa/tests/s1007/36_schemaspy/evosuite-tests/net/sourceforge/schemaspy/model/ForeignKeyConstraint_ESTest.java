/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 11:52:24 GMT 2018
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
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int int0 = (-280);
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "0pn", (-692), (-280));
      foreignKeyConstraint0.getDeleteRuleAlias();
      Database database0 = null;
      String string0 = ";5pda";
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
      Table table0 = null;
      try {
        table0 = new Table((Database) null, "u", (String) null, ";5pda", "t<>");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.schemaspy.model.Table", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "0pn", (-692), (-280));
      foreignKeyConstraint0.getDeleteRuleAlias();
      foreignKeyConstraint0.getParentColumns();
      TableColumnMeta tableColumnMeta0 = mock(TableColumnMeta.class, new ViolatedAssumptionAnswer());
      foreignKeyConstraint0.getDeleteRuleName();
      foreignKeyConstraint0.getChildTable();
      foreignKeyConstraint0.getChildColumns();
      assertEquals((-692), foreignKeyConstraint0.getUpdateRule());
      assertEquals((-280), foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "0pn", (-692), (-280));
      foreignKeyConstraint0.getDeleteRuleAlias();
      foreignKeyConstraint0.getParentColumns();
      Config.getInstance();
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      DatabaseMetaData databaseMetaData0 = mock(DatabaseMetaData.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      assertFalse(boolean0);
      
      TableColumnMeta tableColumnMeta0 = mock(TableColumnMeta.class, new ViolatedAssumptionAnswer());
      foreignKeyConstraint0.getDeleteRuleName();
      assertEquals((-692), foreignKeyConstraint0.getUpdateRule());
      assertEquals((-280), foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "0pn", (-692), (-280));
      foreignKeyConstraint0.getDeleteRuleAlias();
      foreignKeyConstraint0.getParentColumns();
      TableColumnMeta tableColumnMeta0 = mock(TableColumnMeta.class, new ViolatedAssumptionAnswer());
      foreignKeyConstraint0.getDeleteRuleName();
      foreignKeyConstraint0.getChildTable();
      boolean boolean0 = foreignKeyConstraint0.isImplied();
      assertFalse(boolean0);
      
      foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals((-280), foreignKeyConstraint0.getDeleteRule());
      assertEquals((-692), foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "0pn", (-692), (-280));
      foreignKeyConstraint0.getChildColumns();
      foreignKeyConstraint0.getParentColumns();
      TableColumnMeta tableColumnMeta0 = mock(TableColumnMeta.class, new ViolatedAssumptionAnswer());
      foreignKeyConstraint0.getDeleteRuleName();
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      foreignKeyConstraint0.getDeleteRuleName();
      boolean boolean1 = foreignKeyConstraint0.isCascadeOnDelete();
      assertTrue(boolean1 == boolean0);
      
      foreignKeyConstraint0.getParentTable();
      assertEquals((-280), foreignKeyConstraint0.getDeleteRule());
      assertEquals((-692), foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "0pn", (-692), (-280));
      foreignKeyConstraint0.getParentColumns();
      TableColumnMeta tableColumnMeta0 = mock(TableColumnMeta.class, new ViolatedAssumptionAnswer());
      foreignKeyConstraint0.getDeleteRuleName();
      Config config0 = new Config();
      config0.getTableExclusions();
      int int0 = foreignKeyConstraint0.getUpdateRule();
      assertEquals((-692), int0);
      assertEquals((-280), foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "0pn", (-692), (-280));
      foreignKeyConstraint0.getDeleteRuleAlias();
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
      foreignKeyConstraint0.getDeleteRuleName();
      List<TableColumn> list0 = foreignKeyConstraint0.getChildColumns();
      assertEquals((-280), foreignKeyConstraint0.getDeleteRule());
      assertEquals((-692), foreignKeyConstraint0.getUpdateRule());
      assertTrue(list0.contains(tableColumn0));
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "0pn", 163, (-692));
      foreignKeyConstraint0.getDeleteRuleAlias();
      String string0 = "u";
      String string1 = null;
      String string2 = ";5pda";
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
  //Test case number: 8
  /*Coverage entropy=2.0431918705451206
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "0pn", (-692), (-280));
      foreignKeyConstraint0.getDeleteRuleAlias();
      foreignKeyConstraint0.getParentColumns();
      Config.getInstance();
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      DatabaseMetaData databaseMetaData0 = mock(DatabaseMetaData.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      foreignKeyConstraint0.getDeleteRuleDescription();
      foreignKeyConstraint0.getName();
      foreignKeyConstraint0.getDeleteRuleAlias();
      boolean boolean1 = foreignKeyConstraint0.isNullOnDelete();
      assertEquals((-692), foreignKeyConstraint0.getUpdateRule());
      assertEquals((-280), foreignKeyConstraint0.getDeleteRule());
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.2718685126965625
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "0pn", (-692), (-301));
      foreignKeyConstraint0.getChildColumns();
      foreignKeyConstraint0.getParentColumns();
      TableColumnMeta tableColumnMeta0 = mock(TableColumnMeta.class, new ViolatedAssumptionAnswer());
      foreignKeyConstraint0.getDeleteRuleName();
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      foreignKeyConstraint0.getDeleteRuleName();
      boolean boolean1 = foreignKeyConstraint0.isCascadeOnDelete();
      foreignKeyConstraint0.getParentTable();
      boolean boolean2 = foreignKeyConstraint0.isNullOnDelete();
      assertTrue(boolean2 == boolean1);
      
      boolean boolean3 = foreignKeyConstraint0.isReal();
      assertEquals((-692), foreignKeyConstraint0.getUpdateRule());
      assertFalse(boolean3 == boolean0);
      assertEquals((-301), foreignKeyConstraint0.getDeleteRule());
      assertTrue(boolean3);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.3693821196946767
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "0pn", 976, 139);
      foreignKeyConstraint0.getChildColumns();
      List<TableColumn> list0 = foreignKeyConstraint0.getParentColumns();
      foreignKeyConstraint0.getDeleteRuleName();
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "i^Yb\"", 139, 139);
      int int0 = foreignKeyConstraint0.compareTo(foreignKeyConstraint1);
      assertEquals((-57), int0);
      
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      ForeignKeyConstraint.toString(list0);
      boolean boolean1 = foreignKeyConstraint0.isCascadeOnDelete();
      assertFalse(boolean1);
      
      boolean boolean2 = foreignKeyConstraint0.isNullOnDelete();
      assertEquals(976, foreignKeyConstraint0.getUpdateRule());
      assertEquals(139, foreignKeyConstraint0.getDeleteRule());
      assertTrue(boolean2 == boolean0);
      
      boolean boolean3 = FileSystemHandling.shouldAllThrowIOExceptions();
      assertFalse(boolean3 == boolean2);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.2718685126965625
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      FileSystemHandling.shouldAllThrowIOExceptions();
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "0pn", (-692), (-280));
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      foreignKeyConstraint0.getDeleteRuleAlias();
      List<TableColumn> list0 = foreignKeyConstraint0.getChildColumns();
      Config.getInstance();
      foreignKeyConstraint0.addChildColumn((TableColumn) null);
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      foreignKeyConstraint0.getParentTable();
      List<TableColumn> list1 = foreignKeyConstraint0.getParentColumns();
      assertTrue(list1.equals((Object)list0));
      
      boolean boolean1 = foreignKeyConstraint0.isNullOnDelete();
      assertFalse(boolean1);
      
      boolean boolean2 = foreignKeyConstraint0.isReal();
      assertEquals((-280), foreignKeyConstraint0.getDeleteRule());
      assertEquals((-692), foreignKeyConstraint0.getUpdateRule());
      assertFalse(boolean2 == boolean0);
      assertTrue(boolean2);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.9061547465398496
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "0pn", (-692), (-429));
      foreignKeyConstraint0.getParentColumns();
      foreignKeyConstraint0.getChildColumns();
      foreignKeyConstraint0.getParentColumns();
      foreignKeyConstraint0.getDeleteRuleName();
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "H| jaM");
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "0pn", (-594), 2168);
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
  //Test case number: 13
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "0pn", (-692), (-692));
      foreignKeyConstraint0.getChildColumns();
      foreignKeyConstraint0.addParentColumn((TableColumn) null);
      foreignKeyConstraint0.getParentColumns();
      boolean boolean0 = foreignKeyConstraint0.isNullOnDelete();
      boolean boolean1 = foreignKeyConstraint0.isReal();
      assertTrue(boolean1);
      
      boolean boolean2 = foreignKeyConstraint0.isCascadeOnDelete();
      assertEquals((-692), foreignKeyConstraint0.getDeleteRule());
      assertTrue(boolean2 == boolean0);
      assertEquals((-692), foreignKeyConstraint0.getUpdateRule());
      assertFalse(boolean2);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.2783025250391344
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "0pn", (-692), (-692));
      foreignKeyConstraint0.getParentColumns();
      foreignKeyConstraint0.getChildColumns();
      List<TableColumn> list0 = foreignKeyConstraint0.getParentColumns();
      foreignKeyConstraint0.getDeleteRuleName();
      int int0 = foreignKeyConstraint0.compareTo(foreignKeyConstraint0);
      assertEquals(0, int0);
      
      foreignKeyConstraint0.getDeleteRuleDescription();
      foreignKeyConstraint0.getDeleteRuleAlias();
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      ForeignKeyConstraint.toString(list0);
      boolean boolean1 = foreignKeyConstraint0.isCascadeOnDelete();
      assertFalse(boolean1);
      
      boolean boolean2 = foreignKeyConstraint0.isNullOnDelete();
      assertTrue(boolean2 == boolean0);
      
      FileSystemHandling.shouldAllThrowIOExceptions();
      foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals((-692), foreignKeyConstraint0.getUpdateRule());
      assertEquals((-692), foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "0pn", 53, 0);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      foreignKeyConstraint0.getDeleteRuleAlias();
      Config.getInstance();
      foreignKeyConstraint0.isRestrictDelete();
      foreignKeyConstraint0.getDeleteRuleName();
      Connection connection0 = null;
      DatabaseMetaData databaseMetaData0 = mock(DatabaseMetaData.class, new ViolatedAssumptionAnswer());
      String string0 = "";
      String string1 = "";
      String string2 = "";
      SchemaMeta schemaMeta0 = null;
      try {
        schemaMeta0 = new SchemaMeta("UTF-8", "AYT&'kn9w#\"1spf-", "");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Specified meta file \"UTF-8\" does not exist
         //
         verifyException("net.sourceforge.schemaspy.model.xml.SchemaMeta", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.9061547465398496
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "0pn", 53, 0);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      String string0 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals("C", string0);
      
      Config.getInstance();
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      boolean boolean1 = foreignKeyConstraint0.isNullOnDelete();
      boolean boolean2 = foreignKeyConstraint0.isReal();
      assertFalse(boolean2 == boolean0);
      
      boolean boolean3 = foreignKeyConstraint0.isCascadeOnDelete();
      assertFalse(boolean3 == boolean1);
      assertEquals(53, foreignKeyConstraint0.getUpdateRule());
      assertTrue(boolean3);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.0431918705451206
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "0pn", 53, 0);
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "0pn", 53, 0);
      Config.getInstance();
      Config config0 = new Config();
      config0.getRenderer();
      List<TableColumn> list0 = foreignKeyConstraint0.getChildColumns();
      ForeignKeyConstraint.toString(list0);
      Config config1 = Config.getInstance();
      config1.getTableExclusions();
      foreignKeyConstraint0.isRestrictDelete();
      foreignKeyConstraint0.getDeleteRuleName();
      foreignKeyConstraint1.getDeleteRuleDescription();
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
  //Test case number: 18
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "0pn", 53, 5);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      foreignKeyConstraint0.getDeleteRuleAlias();
      Config config0 = Config.getInstance();
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "UTF-8", (-304), 3);
      Config.getInstance();
      config0.getDescription();
      config0.getRenderer();
      config0.getTableExclusions();
      boolean boolean0 = foreignKeyConstraint1.isRestrictDelete();
      String string0 = foreignKeyConstraint1.getDeleteRuleName();
      assertEquals("Restrict delete", string0);
      
      String string1 = foreignKeyConstraint1.getDeleteRuleDescription();
      assertEquals("Restrict delete:\n Parent cannot be deleted if children exist", string1);
      
      foreignKeyConstraint0.getDeleteRuleAlias();
      boolean boolean1 = foreignKeyConstraint0.isReal();
      assertTrue(boolean1 == boolean0);
      assertFalse(foreignKeyConstraint0.isRestrictDelete());
      assertEquals(53, foreignKeyConstraint0.getUpdateRule());
      assertTrue(boolean1);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.519382664642301
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "0pn", 53, 5);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      foreignKeyConstraint0.getDeleteRuleAlias();
      assertFalse(foreignKeyConstraint0.isRestrictDelete());
      
      Config config0 = Config.getInstance();
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "UTF-8", (-304), 3);
      Config.getInstance();
      config0.getDescription();
      config0.getRenderer();
      String string0 = foreignKeyConstraint1.getDeleteRuleDescription();
      assertEquals("Restrict delete:\n Parent cannot be deleted if children exist", string0);
      
      Config.getInstance();
      String string1 = foreignKeyConstraint1.getDeleteRuleAlias();
      assertEquals("R", string1);
      
      Config.getInstance();
      boolean boolean0 = foreignKeyConstraint1.isRestrictDelete();
      boolean boolean1 = foreignKeyConstraint1.isNullOnDelete();
      assertEquals((-304), foreignKeyConstraint1.getUpdateRule());
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.7478680974667573
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 53, 5);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      foreignKeyConstraint0.getDeleteRuleAlias();
      Config config0 = Config.getInstance();
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "$/", 3, 2);
      Config config1 = Config.getInstance();
      config0.getDescription();
      config0.getRenderer();
      config1.getTableExclusions();
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      boolean boolean1 = foreignKeyConstraint1.isNullOnDelete();
      assertFalse(boolean1 == boolean0);
      assertFalse(foreignKeyConstraint1.isRestrictDelete());
      
      foreignKeyConstraint0.getDeleteRuleDescription();
      assertFalse(foreignKeyConstraint0.isNullOnDelete());
      assertEquals(53, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.9730014063936123
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "0pn", (-669), (-669));
      foreignKeyConstraint0.getDeleteRuleName();
      foreignKeyConstraint0.getDeleteRuleAlias();
      Config.getInstance();
      foreignKeyConstraint0.isRestrictDelete();
      foreignKeyConstraint0.getDeleteRuleName();
      foreignKeyConstraint0.getDeleteRuleDescription();
      Config.getInstance();
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "UTF-8", 1, 1);
      foreignKeyConstraint1.getDeleteRuleAlias();
      Config.getInstance();
      foreignKeyConstraint1.isRestrictDelete();
      foreignKeyConstraint0.isNullOnDelete();
      System.setCurrentTimeMillis(0L);
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
  //Test case number: 22
  /*Coverage entropy=1.7328679513998633
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, ",c`Px<0E", 5, 1);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      foreignKeyConstraint0.getDeleteRuleAlias();
      Config config0 = Config.getInstance();
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "0pn", 53, 1);
      Config config1 = Config.getInstance();
      config1.getDescription();
      config0.getRenderer();
      config0.getTableExclusions();
      boolean boolean0 = foreignKeyConstraint1.isRestrictDelete();
      assertTrue(boolean0);
      
      config1.setPromptForPasswordEnabled(true);
      String string0 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals("Restrict delete", string0);
      
      String string1 = foreignKeyConstraint1.getDeleteRuleDescription();
      assertEquals("Restrict delete:\n Parent cannot be deleted if children exist", string1);
      
      foreignKeyConstraint1.getDeleteRuleAlias();
      System.setCurrentTimeMillis(53);
      String string2 = foreignKeyConstraint1.getDeleteRuleAlias();
      assertEquals("R", string2);
      assertEquals(53, foreignKeyConstraint1.getUpdateRule());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LinkedList<TableColumn> linkedList0 = new LinkedList<TableColumn>();
      TableColumn tableColumn0 = null;
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
  //Test case number: 24
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, true);
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, true);
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, true, false);
      System.setCurrentTimeMillis((-1));
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", (-1), 2);
      foreignKeyConstraint0.getDeleteRuleAlias();
      String string0 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals("N", string0);
      
      foreignKeyConstraint0.getDeleteRuleName();
      String string1 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals("Null on delete", string1);
      assertEquals((-1), foreignKeyConstraint0.getUpdateRule());
  }
}
