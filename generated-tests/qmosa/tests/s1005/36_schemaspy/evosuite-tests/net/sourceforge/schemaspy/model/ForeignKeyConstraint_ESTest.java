/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 11:05:12 GMT 2018
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
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "9Y");
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "}A}h1TZA}]_", 1, 1);
      String[] stringArray0 = new String[9];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "}A}h1TZA}]_";
      stringArray0[3] = "}A}h1TZA}]_";
      stringArray0[4] = "";
      foreignKeyConstraint0.getChildColumns();
      stringArray0[5] = "%j!Lq}xO";
      stringArray0[6] = "}A}h1TZA}]_";
      stringArray0[7] = "";
      stringArray0[8] = "";
      Config config0 = new Config(stringArray0);
      String string0 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals(1, foreignKeyConstraint0.getUpdateRule());
      assertEquals("Restrict delete", string0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Table table0 = null;
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("A# q7");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "-charset");
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "}A}h1TZA}]_", 3316, 3316);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      TableColumnMeta tableColumnMeta0 = null;
      String[] stringArray0 = new String[4];
      stringArray0[0] = "}A}h1TZA}]_";
      stringArray0[1] = "}A}h1TZA}]_";
      String string0 = "";
      stringArray0[2] = "";
      stringArray0[3] = "}A}h1TZA}]_";
      Config config0 = new Config(stringArray0);
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      DatabaseMetaData databaseMetaData0 = mock(DatabaseMetaData.class, new ViolatedAssumptionAnswer());
      String string1 = "q6L;s909cYM|ziL1V";
      String string2 = "";
      String string3 = "`|Vmk3#r8u|l{.<zq";
      foreignKeyConstraint0.getChildTable();
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
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Cascade on delete:\n Deletion of parent deletes child", (-3740), 3308);
      Config config0 = new Config();
      foreignKeyConstraint0.getDeleteRuleAlias();
      foreignKeyConstraint0.getParentTable();
      assertEquals(3308, foreignKeyConstraint0.getDeleteRule());
      assertEquals((-3740), foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "}A}h1TZA}]_", 3308, 3308);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "}A}h1TZA}]_";
      foreignKeyConstraint0.getChildColumns();
      stringArray0[0] = "}A}h1TZA}]_";
      System.setCurrentTimeMillis(0L);
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      assertEquals(3308, foreignKeyConstraint0.getUpdateRule());
      assertEquals(3308, foreignKeyConstraint0.getDeleteRule());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "}A}h1TZA}]_", 1, 1);
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
      String[] stringArray0 = new String[8];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[4] = "}A}h1TZA}]_";
      stringArray0[3] = "}A}h1TZA}]_";
      stringArray0[4] = "";
      stringArray0[5] = "%j!Lq}xO";
      stringArray0[6] = "}A}h1TZA}]_";
      Config config0 = Config.getInstance();
      config0.setConnectionProperties("");
      DatabaseMetaData databaseMetaData0 = mock(DatabaseMetaData.class, new ViolatedAssumptionAnswer());
      TableColumnMeta tableColumnMeta1 = mock(TableColumnMeta.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(tableColumnMeta1).getComments();
      doReturn((String) null).when(tableColumnMeta1).getDefaultValue();
      doReturn(0).when(tableColumnMeta1).getDigits();
      doReturn((String) null).when(tableColumnMeta1).getId();
      doReturn((String) null).when(tableColumnMeta1).getName();
      doReturn(0).when(tableColumnMeta1).getSize();
      doReturn((String) null).when(tableColumnMeta1).getType();
      doReturn(false).when(tableColumnMeta1).isAutoUpdated();
      doReturn(false).when(tableColumnMeta1).isNullable();
      TableColumn tableColumn1 = new TableColumn((Table) null, tableColumnMeta1);
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "g<f.pru_SUIY", 1, 1);
      foreignKeyConstraint1.addParentColumn(tableColumn0);
      foreignKeyConstraint1.addParentColumn(tableColumn1);
      Config.getInstance();
      String string0 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals("Restrict delete", string0);
      
      boolean boolean0 = foreignKeyConstraint0.isImplied();
      assertFalse(boolean0);
      assertEquals(1, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "}A}h1TZA}]_", 1, 1);
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
      List<TableColumn> list0 = foreignKeyConstraint0.getChildColumns();
      ForeignKeyConstraint.toString(list0);
      List<TableColumn> list1 = foreignKeyConstraint0.getChildColumns();
      foreignKeyConstraint0.addParentColumn(tableColumn0);
      foreignKeyConstraint0.addChildColumn(tableColumn0);
      ForeignKeyConstraint.toString(list1);
      assertTrue(list1.contains(tableColumn0));
      assertEquals("R", foreignKeyConstraint0.getDeleteRuleAlias());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 1, 1);
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
      String[] stringArray0 = new String[7];
      stringArray0[0] = "";
      String string0 = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "";
      stringArray0[6] = "";
      Config config0 = new Config(stringArray0);
      foreignKeyConstraint0.getDeleteRuleDescription();
      SchemaMeta schemaMeta0 = null;
      try {
        schemaMeta0 = new SchemaMeta("Restrict delete:\n Parent cannot be deleted if children exist", "", "2>UEsoaa[A9Fpyw-l^");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Specified meta file \"Restrict delete:
         //  Parent cannot be deleted if children exist\" does not exist
         //
         verifyException("net.sourceforge.schemaspy.model.xml.SchemaMeta", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.9061547465398496
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "}A}h1TZA}]_", 3308, 3308);
      Config.getInstance();
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "UTF-8", 2, 3308);
      int int0 = foreignKeyConstraint0.compareTo(foreignKeyConstraint1);
      assertEquals(8, int0);
      
      foreignKeyConstraint1.getChildColumns();
      boolean boolean0 = foreignKeyConstraint1.isCascadeOnDelete();
      assertEquals(2, foreignKeyConstraint1.getUpdateRule());
      assertEquals(3308, foreignKeyConstraint1.getDeleteRule());
      assertFalse(boolean0);
      
      int int1 = foreignKeyConstraint0.getUpdateRule();
      assertEquals(3308, int1);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.7328679513998633
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "QA}h;TZA}]c_", 1, 1);
      String[] stringArray0 = new String[9];
      stringArray0[0] = "";
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "wq*z]z`N%", (-2212), 3167);
      int int0 = foreignKeyConstraint1.compareTo(foreignKeyConstraint0);
      assertEquals(6, int0);
      
      foreignKeyConstraint1.getChildColumns();
      assertEquals(3167, foreignKeyConstraint1.getDeleteRule());
      assertEquals((-2212), foreignKeyConstraint1.getUpdateRule());
      
      String string0 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals("R", string0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.9061547465398496
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "}A}h1TZA}]_", 1, 1);
      String[] stringArray0 = new String[9];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "}A}h1TZA}]_";
      stringArray0[3] = "}A}h1TZA}]_";
      List<TableColumn> list0 = foreignKeyConstraint0.getChildColumns();
      ForeignKeyConstraint.toString(list0);
      stringArray0[4] = "";
      stringArray0[5] = "";
      stringArray0[6] = "}A}h1TZA}]_";
      System.setCurrentTimeMillis(1);
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
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
      boolean boolean1 = foreignKeyConstraint0.isNullOnDelete();
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
      assertEquals(1, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "}A}h1TZA}]_", 1, 1);
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "}A}h1TZA}]_", (-63), (-1));
      Config.getInstance();
      ForeignKeyConstraint foreignKeyConstraint2 = new ForeignKeyConstraint((Table) null, "", (-1572), 5342);
      foreignKeyConstraint1.getParentColumns();
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
  //Test case number: 11
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "}A}h1TZA}]_", 1, 1);
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
      List<TableColumn> list0 = foreignKeyConstraint0.getChildColumns();
      ForeignKeyConstraint.toString(list0);
      System.setCurrentTimeMillis((-2364L));
      foreignKeyConstraint0.isRestrictDelete();
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
  //Test case number: 12
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Table table0 = null;
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 4, 4);
      foreignKeyConstraint0.compareTo(foreignKeyConstraint0);
      foreignKeyConstraint0.getChildColumns();
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
  //Test case number: 13
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = "QA}h;TZA}]c_";
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "QA}h;TZA}]c_", 1, 1);
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, true);
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "", 0, 2);
      Config config0 = new Config();
      foreignKeyConstraint1.getDeleteRuleAlias();
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      DatabaseMetaData databaseMetaData0 = mock(DatabaseMetaData.class, new ViolatedAssumptionAnswer());
      String string1 = "";
      String string2 = "COALESCE";
      SchemaMeta schemaMeta0 = null;
      try {
        schemaMeta0 = new SchemaMeta("N", "", "");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Specified meta file \"N\" does not exist
         //
         verifyException("net.sourceforge.schemaspy.model.xml.SchemaMeta", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = "";
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 46, 46);
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "", 1, 0);
      Config config0 = new Config();
      foreignKeyConstraint1.getDeleteRuleAlias();
      SchemaMeta schemaMeta0 = null;
      try {
        schemaMeta0 = new SchemaMeta("Cascade on delete", "C", "=TLM");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Specified meta file \"Cascade on delete\" does not exist
         //
         verifyException("net.sourceforge.schemaspy.model.xml.SchemaMeta", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "@jwF5", (-2267), 6);
      foreignKeyConstraint0.addChildColumn((TableColumn) null);
      assertEquals((-2267), foreignKeyConstraint0.getUpdateRule());
      assertEquals(6, foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "}A}h1TZA}]_", 1, 1);
      String[] stringArray0 = new String[9];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "}A}h1TZA}]_";
      stringArray0[3] = "}A}h1TZA}]_";
      stringArray0[4] = "";
      stringArray0[5] = "%j!Lq}xO";
      stringArray0[6] = "}A}h1TZA}]_";
      stringArray0[7] = "";
      stringArray0[8] = "";
      Config config0 = new Config(stringArray0);
      String string0 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals("Restrict delete", string0);
      
      boolean boolean0 = foreignKeyConstraint0.isReal();
      assertTrue(boolean0);
      
      String string1 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals(1, foreignKeyConstraint0.getUpdateRule());
      assertEquals("R", string1);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Config.getInstance();
      System.setCurrentTimeMillis(1);
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, " \"Cy[9|+t>?D", 20, 3);
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Restrict delete:\n Parent cannot be deleted if children exist", string0);
      assertEquals(20, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.15374194270109
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 4, 4);
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "", (-1548), 3);
      Config config0 = new Config();
      ForeignKeyConstraint foreignKeyConstraint2 = new ForeignKeyConstraint((Table) null, "UTF-8", 5342, 3);
      foreignKeyConstraint0.getParentColumns();
      ForeignKeyConstraint foreignKeyConstraint3 = new ForeignKeyConstraint((Table) null, "", 3, 3);
      Config.getInstance();
      foreignKeyConstraint1.getDeleteRuleName();
      System.setCurrentTimeMillis(3);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.9652370493802307
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 4, 4);
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "&%K<t+", 4, 4);
      Config.getInstance();
      int int0 = foreignKeyConstraint0.compareTo(foreignKeyConstraint1);
      assertEquals((-6), int0);
      
      String[] stringArray0 = new String[3];
      stringArray0[0] = "5||uw|";
      stringArray0[1] = "5||uw|";
      stringArray0[2] = "5||uw|";
      Config config0 = new Config(stringArray0);
      foreignKeyConstraint1.getDeleteRuleName();
      foreignKeyConstraint1.getDeleteRuleDescription();
      foreignKeyConstraint0.getDeleteRuleAlias();
      boolean boolean0 = foreignKeyConstraint1.isReal();
      assertTrue(boolean0);
      
      foreignKeyConstraint0.addParentColumn((TableColumn) null);
      assertEquals(4, foreignKeyConstraint0.getDeleteRule());
      assertEquals(4, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, true);
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "QA}hTZAg}c_", 0, 0);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      Config.getInstance();
      foreignKeyConstraint0.getDeleteRuleName();
      System.setCurrentTimeMillis(1);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.5602982517726534
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "TRAILING", 4, 4);
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "", 4, 3);
      Config.getInstance();
      Config.getInstance();
      foreignKeyConstraint0.isNullOnDelete();
      System.setCurrentTimeMillis(27L);
      foreignKeyConstraint0.getDeleteRuleDescription();
      String string0 = foreignKeyConstraint1.getDeleteRuleAlias();
      assertEquals(4, foreignKeyConstraint1.getUpdateRule());
      assertFalse(foreignKeyConstraint1.isNullOnDelete());
      assertEquals("R", string0);
      
      String string1 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals("", string1);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      System.setCurrentTimeMillis(0);
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
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "-charset", 0, 0);
      foreignKeyConstraint0.addChildColumn(tableColumn0);
      System.setCurrentTimeMillis(0);
      foreignKeyConstraint0.isCascadeOnDelete();
      foreignKeyConstraint0.getDeleteRuleDescription();
      System.setCurrentTimeMillis(1947L);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "EXCEPT", 3, 3);
      Config.getInstance();
      foreignKeyConstraint0.isNullOnDelete();
      foreignKeyConstraint0.isRestrictDelete();
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
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      Config.getInstance();
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "UTF-8", 277, 2);
      String string0 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals(277, foreignKeyConstraint0.getUpdateRule());
      assertEquals("Null on delete", string0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String string0 = "Restrict delete:\n Parent cannot be deleted if children exist";
      String string1 = "";
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 1, 2);
      foreignKeyConstraint0.isNullOnDelete();
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "Restrict delete:\n Parent cannot be deleted if children exist", 2, 2);
      foreignKeyConstraint1.isRestrictDelete();
      Config config0 = null;
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      DatabaseMetaData databaseMetaData0 = mock(DatabaseMetaData.class, new ViolatedAssumptionAnswer());
      String string2 = "3+ey<";
      SchemaMeta schemaMeta0 = null;
      try {
        schemaMeta0 = new SchemaMeta("", "", "3+ey<");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Meta directory \"\" must contain a file named \"3+ey<.meta.xml\"
         //
         verifyException("net.sourceforge.schemaspy.model.xml.SchemaMeta", e);
      }
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.2424533248940002
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LinkedList<TableColumn> linkedList0 = new LinkedList<TableColumn>();
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, ": ", (-1), 2);
      foreignKeyConstraint0.isReal();
      System.setCurrentTimeMillis((-339L));
      boolean boolean0 = foreignKeyConstraint0.isReal();
      assertTrue(boolean0);
      
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Null on delete:\n Foreign key to parent set to NULL when parent deleted", string0);
      assertEquals((-1), foreignKeyConstraint0.getUpdateRule());
  }
}