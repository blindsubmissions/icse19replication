/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 13:13:45 GMT 2018
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = "{M#hX";
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "{M#hX", 206, 206);
      foreignKeyConstraint0.getParentColumns();
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
  //Test case number: 2
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[0] = "V.u8*Rv'9ANWC`-";
      String string0 = "oj?yMn&\\p7BCa$";
      stringArray0[1] = "oj?yMn&p7BCa$";
      stringArray0[2] = "xM$htquk,C60dx";
      stringArray0[3] = "'%^Tba>zC]WCvFTu[";
      stringArray0[4] = "FETCH";
      stringArray0[5] = "-pfp";
      stringArray0[6] = "Restrict delete:\n Parent cannot be deleted if children exist";
      stringArray0[7] = "O I)xK9+bsr-vE";
      stringArray0[8] = "R";
      Config config0 = new Config(stringArray0);
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      DatabaseMetaData databaseMetaData0 = mock(DatabaseMetaData.class, new ViolatedAssumptionAnswer());
      String string1 = "uuPw8";
      config0.getIndirectColumnExclusions();
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "_:Z~ABg", 75, 0);
      foreignKeyConstraint0.isCascadeOnDelete();
      SchemaMeta schemaMeta0 = null;
      try {
        schemaMeta0 = new SchemaMeta("Restrict delete", "", "");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Specified meta file \"Restrict delete\" does not exist
         //
         verifyException("net.sourceforge.schemaspy.model.xml.SchemaMeta", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "nst", 21, (-2650));
      String[] stringArray0 = new String[3];
      stringArray0[0] = "nst";
      stringArray0[1] = "nst";
      stringArray0[2] = "nst";
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      Config config0 = new Config(stringArray0);
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      DatabaseMetaData databaseMetaData0 = mock(DatabaseMetaData.class, new ViolatedAssumptionAnswer());
      Config.getInstance();
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = foreignKeyConstraint0.isNullOnDelete();
      boolean boolean1 = foreignKeyConstraint0.isImplied();
      assertTrue(boolean1 == boolean0);
      
      foreignKeyConstraint0.getChildTable();
      assertEquals(21, foreignKeyConstraint0.getUpdateRule());
      assertEquals((-2650), foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.7478680974667573
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "nst", 1, (-2650));
      String[] stringArray0 = new String[3];
      stringArray0[0] = "nst";
      stringArray0[1] = "nst";
      stringArray0[2] = "nst";
      Config config0 = new Config(stringArray0);
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      DatabaseMetaData databaseMetaData0 = mock(DatabaseMetaData.class, new ViolatedAssumptionAnswer());
      Config.getInstance();
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
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = foreignKeyConstraint0.isNullOnDelete();
      boolean boolean1 = foreignKeyConstraint0.isRestrictDelete();
      assertTrue(boolean1 == boolean0);
      
      foreignKeyConstraint0.addChildColumn((TableColumn) null);
      assertEquals((-2650), foreignKeyConstraint0.getDeleteRule());
      assertEquals(1, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "finest", 1, (-2650));
      String[] stringArray0 = new String[3];
      stringArray0[0] = "finest";
      stringArray0[1] = "finest";
      stringArray0[2] = "finest";
      Config config0 = new Config(stringArray0);
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      DatabaseMetaData databaseMetaData0 = mock(DatabaseMetaData.class, new ViolatedAssumptionAnswer());
      Config config1 = new Config();
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
      foreignKeyConstraint0.isRestrictDelete();
      foreignKeyConstraint0.isNullOnDelete();
      ForeignKeyConstraint foreignKeyConstraint1 = null;
      try {
        foreignKeyConstraint1 = new ForeignKeyConstraint(tableColumn0, tableColumn0, (-1824), 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.schemaspy.model.TableColumn", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[0] = "V.u8*Rv'9ANWC`-";
      stringArray0[1] = "oj?yMn&p7BCa$";
      stringArray0[2] = "xM$htquk,C60dx";
      stringArray0[3] = "'%^Tba>zC]WCvFTu[";
      stringArray0[4] = "FETCH";
      stringArray0[5] = "-pfp";
      stringArray0[6] = "Restrict delete:\n Parent cannot be deleted if children exist";
      stringArray0[7] = "O I)xK9+bsr-vE";
      stringArray0[8] = "oj?yMn&p7BCa$";
      Config config0 = new Config(stringArray0);
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      DatabaseMetaData databaseMetaData0 = mock(DatabaseMetaData.class, new ViolatedAssumptionAnswer());
      config0.getIndirectColumnExclusions();
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "_:Z~ABg", 75, 3);
      foreignKeyConstraint0.isCascadeOnDelete();
      SchemaMeta schemaMeta0 = null;
      try {
        schemaMeta0 = new SchemaMeta("Restrict delete", "", "");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Specified meta file \"Restrict delete\" does not exist
         //
         verifyException("net.sourceforge.schemaspy.model.xml.SchemaMeta", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.1458417525947544
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "nst", 1, (-2650));
      String[] stringArray0 = new String[3];
      stringArray0[0] = "nst";
      stringArray0[1] = "nst";
      stringArray0[2] = "nst";
      Config config0 = new Config(stringArray0);
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      DatabaseMetaData databaseMetaData0 = mock(DatabaseMetaData.class, new ViolatedAssumptionAnswer());
      Config.getInstance();
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      foreignKeyConstraint0.isNullOnDelete();
      foreignKeyConstraint0.isRestrictDelete();
      foreignKeyConstraint0.isReal();
      foreignKeyConstraint0.getDeleteRuleAlias();
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "nst", (-2650), 1);
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
  /*Coverage entropy=1.7478680974667573
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = "TIMESTAMP";
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "TIMESTAMP", (-2650), (-2171));
      String[] stringArray0 = new String[2];
      stringArray0[0] = "5k?XYy*Hd2mHYKU)c/M";
      stringArray0[1] = "TIMESTAMP";
      Config config0 = new Config(stringArray0);
      Config.getInstance();
      foreignKeyConstraint0.isNullOnDelete();
      foreignKeyConstraint0.isRestrictDelete();
      foreignKeyConstraint0.isReal();
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      DatabaseMetaData databaseMetaData0 = mock(DatabaseMetaData.class, new ViolatedAssumptionAnswer());
      String string1 = "";
      String string2 = "";
      foreignKeyConstraint0.addParentColumn((TableColumn) null);
      SchemaMeta schemaMeta0 = null;
      try {
        schemaMeta0 = new SchemaMeta("TIMESTAMP", "", "G7I");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Specified meta file \"TIMESTAMP\" does not exist
         //
         verifyException("net.sourceforge.schemaspy.model.xml.SchemaMeta", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.8392967479776605
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "finest", 29, 29);
      String[] stringArray0 = new String[5];
      stringArray0[1] = "finest";
      stringArray0[1] = "net.sourceforge.schemaspy.Config$MissingRequiredParameterException";
      stringArray0[2] = "finest";
      stringArray0[3] = "finest";
      List<TableColumn> list0 = foreignKeyConstraint0.getChildColumns();
      ForeignKeyConstraint.toString(list0);
      stringArray0[4] = "finest";
      Config config0 = new Config();
      Config.getInstance();
      boolean boolean0 = foreignKeyConstraint0.isNullOnDelete();
      foreignKeyConstraint0.isRestrictDelete();
      foreignKeyConstraint0.getDeleteRuleDescription();
      foreignKeyConstraint0.getDeleteRuleName();
      boolean boolean1 = foreignKeyConstraint0.isRestrictDelete();
      assertEquals(29, foreignKeyConstraint0.getUpdateRule());
      assertTrue(boolean1 == boolean0);
      assertEquals(29, foreignKeyConstraint0.getDeleteRule());
      assertFalse(boolean1);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.7478680974667573
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "nst", 1, 1);
      foreignKeyConstraint0.getChildColumns();
      LinkedList<TableColumn> linkedList0 = new LinkedList<TableColumn>();
      ForeignKeyConstraint.toString((List<TableColumn>) linkedList0);
      Config config0 = new Config();
      Config.getInstance();
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      assertTrue(boolean0);
      
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Restrict delete:\n Parent cannot be deleted if children exist", string0);
      assertEquals(1, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "finest", 29, 29);
      String[] stringArray0 = new String[5];
      stringArray0[1] = "finest";
      stringArray0[1] = "net.sourceforge.schemaspy.Config$MissingRequiredParameterException";
      stringArray0[2] = "finest";
      stringArray0[3] = "finest";
      List<TableColumn> list0 = foreignKeyConstraint0.getChildColumns();
      ForeignKeyConstraint.toString(list0);
      stringArray0[4] = "finest";
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      boolean boolean1 = foreignKeyConstraint0.isReal();
      assertFalse(boolean1 == boolean0);
      
      foreignKeyConstraint0.getDeleteRuleAlias();
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "net.sourceforge.schemaspy.Config$MissingRequiredParameterException", 1, 29);
      foreignKeyConstraint1.compareTo(foreignKeyConstraint0);
      int int0 = foreignKeyConstraint1.compareTo(foreignKeyConstraint0);
      assertEquals(8, int0);
      
      foreignKeyConstraint1.getDeleteRuleName();
      assertEquals(29, foreignKeyConstraint1.getDeleteRule());
      assertEquals(1, foreignKeyConstraint1.getUpdateRule());
      
      foreignKeyConstraint0.getParentTable();
      assertEquals(29, foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.019814992492946
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "nst", 1, (-2650));
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      boolean boolean1 = foreignKeyConstraint0.isReal();
      assertFalse(boolean1 == boolean0);
      
      foreignKeyConstraint0.getDeleteRuleAlias();
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "M}2f@Y$p>p}", (-2650), 1);
      foreignKeyConstraint0.compareTo(foreignKeyConstraint1);
      int int0 = foreignKeyConstraint0.compareTo(foreignKeyConstraint1);
      assertEquals(1, int0);
      
      String string0 = foreignKeyConstraint1.getDeleteRuleName();
      assertTrue(foreignKeyConstraint1.isRestrictDelete());
      assertEquals((-2650), foreignKeyConstraint1.getUpdateRule());
      assertEquals("Restrict delete", string0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.2538575896013526
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "finest", 29, 29);
      String[] stringArray0 = new String[5];
      stringArray0[1] = "finest";
      stringArray0[1] = "net.sourceforge.schemaspy.Config$MissingRequiredParameterException";
      stringArray0[2] = "finest";
      stringArray0[3] = "finest";
      List<TableColumn> list0 = foreignKeyConstraint0.getChildColumns();
      ForeignKeyConstraint.toString(list0);
      stringArray0[4] = "finest";
      Config config0 = new Config();
      foreignKeyConstraint0.isReal();
      foreignKeyConstraint0.getDeleteRuleAlias();
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "", 1, 1);
      foreignKeyConstraint0.compareTo(foreignKeyConstraint1);
      foreignKeyConstraint1.getDeleteRuleAlias();
      foreignKeyConstraint0.getParentTable();
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
  //Test case number: 14
  /*Coverage entropy=1.9061547465398496
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "nst", 1, 1);
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "nst", 1, 2142);
      Config.getInstance();
      boolean boolean0 = foreignKeyConstraint1.isNullOnDelete();
      assertFalse(boolean0);
      
      boolean boolean1 = foreignKeyConstraint1.isRestrictDelete();
      assertEquals(1, foreignKeyConstraint1.getUpdateRule());
      
      boolean boolean2 = foreignKeyConstraint0.isReal();
      assertFalse(boolean2 == boolean1);
      
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
      String string0 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals("R", string0);
      
      int int0 = foreignKeyConstraint0.compareTo(foreignKeyConstraint0);
      assertEquals(0, int0);
      assertFalse(foreignKeyConstraint0.isNullOnDelete());
      assertTrue(foreignKeyConstraint0.isRestrictDelete());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 3, 3);
      foreignKeyConstraint0.isRestrictDelete();
      foreignKeyConstraint0.isReal();
      foreignKeyConstraint0.getDeleteRuleAlias();
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "", 3, 1);
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
  //Test case number: 16
  /*Coverage entropy=1.9792045174343245
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 2, 2);
      foreignKeyConstraint0.isRestrictDelete();
      foreignKeyConstraint0.isReal();
      foreignKeyConstraint0.getDeleteRuleAlias();
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "", 2, 1);
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
  //Test case number: 17
  /*Coverage entropy=2.022808529414704
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 1, 3);
      foreignKeyConstraint0.isRestrictDelete();
      foreignKeyConstraint0.isReal();
      foreignKeyConstraint0.getDeleteRuleAlias();
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "Null on delete:\n Foreign key to parent set to NULL when parent deleted", 1, 3);
      foreignKeyConstraint0.compareTo(foreignKeyConstraint1);
      foreignKeyConstraint0.compareTo(foreignKeyConstraint1);
      foreignKeyConstraint1.getDeleteRuleName();
      foreignKeyConstraint0.getDeleteRuleDescription();
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
  //Test case number: 18
  /*Coverage entropy=2.1639556568820564
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Mm", 1453, 2);
      Config.getInstance();
      boolean boolean0 = foreignKeyConstraint0.isNullOnDelete();
      boolean boolean1 = foreignKeyConstraint0.isRestrictDelete();
      assertFalse(boolean1);
      
      boolean boolean2 = foreignKeyConstraint0.isReal();
      assertTrue(boolean2 == boolean0);
      
      foreignKeyConstraint0.getDeleteRuleAlias();
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "N", 1453, 1360);
      LinkedList<TableColumn> linkedList0 = new LinkedList<TableColumn>();
      ForeignKeyConstraint.toString((List<TableColumn>) linkedList0);
      int int0 = foreignKeyConstraint1.compareTo(foreignKeyConstraint0);
      assertFalse(foreignKeyConstraint1.isNullOnDelete());
      assertFalse(foreignKeyConstraint1.isRestrictDelete());
      assertEquals(1, int0);
      
      String string0 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals(1453, foreignKeyConstraint0.getUpdateRule());
      assertEquals("N", string0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.1458417525947544
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "h|z[j(HY", 103, 0);
      Config.getInstance();
      foreignKeyConstraint0.isNullOnDelete();
      boolean boolean0 = foreignKeyConstraint0.isNullOnDelete();
      boolean boolean1 = foreignKeyConstraint0.isRestrictDelete();
      assertTrue(boolean1 == boolean0);
      
      boolean boolean2 = foreignKeyConstraint0.isReal();
      assertTrue(boolean2);
      
      String string0 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals("C", string0);
      
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "ctPpRraq}c&;P0mSUAa", 103, 1360);
      LinkedList<TableColumn> linkedList0 = new LinkedList<TableColumn>();
      ForeignKeyConstraint.toString((List<TableColumn>) linkedList0);
      foreignKeyConstraint1.compareTo(foreignKeyConstraint0);
      int int0 = foreignKeyConstraint0.compareTo(foreignKeyConstraint1);
      assertEquals(5, int0);
      
      foreignKeyConstraint1.getDeleteRuleAlias();
      assertFalse(foreignKeyConstraint1.isNullOnDelete());
      assertEquals(103, foreignKeyConstraint1.getUpdateRule());
      assertEquals(1360, foreignKeyConstraint1.getDeleteRule());
      assertFalse(foreignKeyConstraint1.isRestrictDelete());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=2.1639556568820564
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 800, 727);
      Config config0 = new Config();
      foreignKeyConstraint0.isNullOnDelete();
      foreignKeyConstraint0.isReal();
      foreignKeyConstraint0.isReal();
      foreignKeyConstraint0.getChildColumns();
      foreignKeyConstraint0.isReal();
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "", (-2372), 0);
      foreignKeyConstraint1.getDeleteRuleAlias();
      foreignKeyConstraint0.getDeleteRuleName();
      System.setCurrentTimeMillis(1L);
      foreignKeyConstraint0.isRestrictDelete();
      foreignKeyConstraint1.isReal();
      foreignKeyConstraint1.getDeleteRuleDescription();
      TableColumn tableColumn0 = null;
      Table table0 = null;
      try {
        table0 = new Table((Database) null, "", "LOWER", "Cascade on delete:\n Deletion of parent deletes child", "oqgb/");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.schemaspy.model.Table", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.303092403761719
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, ">kK#? ;m3.Q2O}dp 3", 0, 0);
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Cascade on delete:\n Deletion of parent deletes child", string0);
      
      int int0 = foreignKeyConstraint0.compareTo(foreignKeyConstraint0);
      assertEquals(0, int0);
      
      foreignKeyConstraint0.getDeleteRuleName();
      String string1 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals("Cascade on delete", string1);
      assertEquals(0, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.4750763110546947
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, ">kK#? ;m3.Q2O}dp 3", 72, 2);
      foreignKeyConstraint0.getDeleteRuleAlias();
      foreignKeyConstraint0.getDeleteRuleName();
      foreignKeyConstraint0.isReal();
      foreignKeyConstraint0.getDeleteRuleAlias();
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "Null on delete", (-183), (-183));
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "");
      Config.getInstance();
      System.setCurrentTimeMillis(0L);
  }
}
