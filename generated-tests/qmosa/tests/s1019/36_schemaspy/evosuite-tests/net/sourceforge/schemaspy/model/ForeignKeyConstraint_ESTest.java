/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 15:07:14 GMT 2018
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
import java.util.regex.Pattern;
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
      Config config0 = new Config();
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      DatabaseMetaData databaseMetaData0 = mock(DatabaseMetaData.class, new ViolatedAssumptionAnswer());
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("AS3M+!");
      FileSystemHandling.setPermissions(evoSuiteFile0, true, true, false);
      config0.setOutputDir("5bWA");
      String string0 = "";
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
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
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
      TableColumnMeta tableColumnMeta1 = mock(TableColumnMeta.class, new ViolatedAssumptionAnswer());
      ForeignKeyConstraint foreignKeyConstraint0 = null;
      try {
        foreignKeyConstraint0 = new ForeignKeyConstraint(tableColumn0, tableColumn0, (-2456), 672);
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
  /*Coverage entropy=2.2718685126965625
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 35, 35);
      List<TableColumn> list0 = foreignKeyConstraint0.getParentColumns();
      ForeignKeyConstraint.toString(list0);
      foreignKeyConstraint0.getChildTable();
      foreignKeyConstraint0.isReal();
      foreignKeyConstraint0.isReal();
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      boolean boolean1 = foreignKeyConstraint0.isReal();
      assertFalse(boolean1 == boolean0);
      
      foreignKeyConstraint0.getChildColumns();
      foreignKeyConstraint0.getDeleteRuleDescription();
      foreignKeyConstraint0.getDeleteRuleName();
      assertEquals(35, foreignKeyConstraint0.getUpdateRule());
      assertEquals(35, foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 35, 35);
      foreignKeyConstraint0.getParentColumns();
      foreignKeyConstraint0.getChildTable();
      foreignKeyConstraint0.getUpdateRule();
      foreignKeyConstraint0.isReal();
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
  //Test case number: 4
  /*Coverage entropy=2.2718685126965625
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 35, 35);
      List<TableColumn> list0 = foreignKeyConstraint0.getParentColumns();
      ForeignKeyConstraint.toString(list0);
      foreignKeyConstraint0.getChildTable();
      foreignKeyConstraint0.isReal();
      foreignKeyConstraint0.isReal();
      foreignKeyConstraint0.isRestrictDelete();
      foreignKeyConstraint0.isNullOnDelete();
      foreignKeyConstraint0.isCascadeOnDelete();
      String string0 = foreignKeyConstraint0.getDeleteRuleName();
      LinkedList<TableColumn> linkedList0 = new LinkedList<TableColumn>();
      String string1 = ForeignKeyConstraint.toString((List<TableColumn>) linkedList0);
      assertFalse(string1.equals((Object)string0));
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 35, 35);
      List<TableColumn> list0 = foreignKeyConstraint0.getParentColumns();
      ForeignKeyConstraint.toString(list0);
      boolean boolean0 = foreignKeyConstraint0.isReal();
      boolean boolean1 = foreignKeyConstraint0.isRestrictDelete();
      foreignKeyConstraint0.isReal();
      boolean boolean2 = foreignKeyConstraint0.isCascadeOnDelete();
      assertTrue(boolean2 == boolean1);
      
      boolean boolean3 = foreignKeyConstraint0.isImplied();
      assertEquals(35, foreignKeyConstraint0.getUpdateRule());
      assertFalse(boolean3 == boolean0);
      assertEquals(35, foreignKeyConstraint0.getDeleteRule());
      assertFalse(boolean3);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 5, 3);
      List<TableColumn> list0 = foreignKeyConstraint0.getParentColumns();
      ForeignKeyConstraint.toString(list0);
      foreignKeyConstraint0.isReal();
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      boolean boolean1 = foreignKeyConstraint0.isReal();
      assertTrue(boolean1 == boolean0);
      
      foreignKeyConstraint0.getChildColumns();
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Restrict delete:\n Parent cannot be deleted if children exist", string0);
      
      String string1 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals("Restrict delete", string1);
      assertEquals(5, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.182995977034132
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 5, 5);
      List<TableColumn> list0 = foreignKeyConstraint0.getParentColumns();
      ForeignKeyConstraint.toString(list0);
      foreignKeyConstraint0.getChildTable();
      foreignKeyConstraint0.isReal();
      boolean boolean0 = foreignKeyConstraint0.isNullOnDelete();
      foreignKeyConstraint0.isReal();
      boolean boolean1 = foreignKeyConstraint0.isRestrictDelete();
      boolean boolean2 = foreignKeyConstraint0.isReal();
      assertFalse(boolean2 == boolean0);
      
      boolean boolean3 = foreignKeyConstraint0.isCascadeOnDelete();
      assertTrue(boolean3 == boolean1);
      
      foreignKeyConstraint0.getDeleteRuleDescription();
      foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals(5, foreignKeyConstraint0.getDeleteRule());
      assertEquals(5, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TableColumnMeta tableColumnMeta0 = mock(TableColumnMeta.class, new ViolatedAssumptionAnswer());
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 0, 0);
      foreignKeyConstraint0.getChildTable();
      boolean boolean0 = foreignKeyConstraint0.isCascadeOnDelete();
      assertTrue(boolean0);
      
      foreignKeyConstraint0.isReal();
      foreignKeyConstraint0.isReal();
      boolean boolean1 = foreignKeyConstraint0.isRestrictDelete();
      boolean boolean2 = foreignKeyConstraint0.isReal();
      assertFalse(boolean2 == boolean1);
      
      foreignKeyConstraint0.getChildColumns();
      foreignKeyConstraint0.getChildColumns();
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Cascade on delete:\n Deletion of parent deletes child", string0);
      
      String string1 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals("Cascade on delete", string1);
      
      foreignKeyConstraint0.getParentTable();
      assertEquals(0, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.196755797914435
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TableColumnMeta tableColumnMeta0 = mock(TableColumnMeta.class, new ViolatedAssumptionAnswer());
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 0, 0);
      foreignKeyConstraint0.getChildTable();
      foreignKeyConstraint0.isCascadeOnDelete();
      foreignKeyConstraint0.isReal();
      foreignKeyConstraint0.isReal();
      foreignKeyConstraint0.isRestrictDelete();
      foreignKeyConstraint0.getChildColumns();
      foreignKeyConstraint0.isReal();
      foreignKeyConstraint0.getChildColumns();
      foreignKeyConstraint0.getChildColumns();
      foreignKeyConstraint0.getDeleteRuleDescription();
      foreignKeyConstraint0.getDeleteRuleName();
      foreignKeyConstraint0.isRestrictDelete();
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "", (-501), (-2107));
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
  //Test case number: 10
  /*Coverage entropy=2.0642580751745085
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, true);
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 5, 3);
      foreignKeyConstraint0.getParentColumns();
      foreignKeyConstraint0.isReal();
      List<TableColumn> list0 = foreignKeyConstraint0.getChildColumns();
      foreignKeyConstraint0.isReal();
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      foreignKeyConstraint0.addChildColumn((TableColumn) null);
      boolean boolean1 = foreignKeyConstraint0.isReal();
      assertTrue(boolean1 == boolean0);
      
      List<TableColumn> list1 = foreignKeyConstraint0.getParentColumns();
      assertTrue(list1.equals((Object)list0));
      
      Config.getInstance();
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Restrict delete:\n Parent cannot be deleted if children exist", string0);
      
      String string1 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals("R", string1);
      
      boolean boolean2 = foreignKeyConstraint0.isNullOnDelete();
      assertFalse(boolean2);
      assertEquals(5, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.265238831585811
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TableColumnMeta tableColumnMeta0 = mock(TableColumnMeta.class, new ViolatedAssumptionAnswer());
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 0, 0);
      foreignKeyConstraint0.getChildTable();
      boolean boolean0 = foreignKeyConstraint0.isCascadeOnDelete();
      foreignKeyConstraint0.isReal();
      foreignKeyConstraint0.isReal();
      boolean boolean1 = foreignKeyConstraint0.isRestrictDelete();
      foreignKeyConstraint0.getChildColumns();
      boolean boolean2 = foreignKeyConstraint0.isReal();
      assertTrue(boolean2 == boolean0);
      
      foreignKeyConstraint0.getChildColumns();
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "Null on delete");
      foreignKeyConstraint0.getChildColumns();
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "Null on delete", 2, 2);
      int int0 = foreignKeyConstraint1.compareTo(foreignKeyConstraint0);
      assertEquals(14, int0);
      
      boolean boolean3 = foreignKeyConstraint0.isNullOnDelete();
      assertTrue(boolean3 == boolean1);
      
      foreignKeyConstraint0.getChildColumns();
      foreignKeyConstraint1.getChildColumns();
      foreignKeyConstraint1.getChildColumns();
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Cascade on delete:\n Deletion of parent deletes child", string0);
      
      String string1 = foreignKeyConstraint1.getDeleteRuleName();
      assertEquals("Null on delete", string1);
      assertFalse(foreignKeyConstraint1.isRestrictDelete());
      assertEquals(2, foreignKeyConstraint1.getUpdateRule());
      assertFalse(foreignKeyConstraint1.isCascadeOnDelete());
      assertTrue(foreignKeyConstraint1.isNullOnDelete());
      
      String string2 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals("Cascade on delete", string2);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.4799555205445176
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TableColumnMeta tableColumnMeta0 = mock(TableColumnMeta.class, new ViolatedAssumptionAnswer());
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 0, 0);
      foreignKeyConstraint0.getChildTable();
      foreignKeyConstraint0.isCascadeOnDelete();
      foreignKeyConstraint0.isReal();
      foreignKeyConstraint0.isReal();
      foreignKeyConstraint0.isRestrictDelete();
      foreignKeyConstraint0.getChildColumns();
      foreignKeyConstraint0.isReal();
      foreignKeyConstraint0.getChildColumns();
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "Null on delete");
      foreignKeyConstraint0.getParentColumns();
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "", 0, 2);
      foreignKeyConstraint1.getDeleteRuleDescription();
      foreignKeyConstraint0.isNullOnDelete();
      foreignKeyConstraint1.getDeleteRuleName();
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
  /*Coverage entropy=2.2783025250391344
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 0, 0);
      foreignKeyConstraint0.addParentColumn((TableColumn) null);
      foreignKeyConstraint0.getChildTable();
      boolean boolean0 = foreignKeyConstraint0.isCascadeOnDelete();
      foreignKeyConstraint0.isReal();
      foreignKeyConstraint0.isReal();
      boolean boolean1 = foreignKeyConstraint0.isRestrictDelete();
      foreignKeyConstraint0.getChildColumns();
      foreignKeyConstraint0.isReal();
      foreignKeyConstraint0.getChildColumns();
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "");
      foreignKeyConstraint0.getChildColumns();
      foreignKeyConstraint0.getChildColumns();
      boolean boolean2 = foreignKeyConstraint0.isReal();
      assertTrue(boolean2 == boolean0);
      
      foreignKeyConstraint0.getChildColumns();
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Cascade on delete:\n Deletion of parent deletes child", string0);
      
      String string1 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals("Cascade on delete", string1);
      
      boolean boolean3 = foreignKeyConstraint0.isNullOnDelete();
      assertTrue(boolean3 == boolean1);
      
      String string2 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals("C", string2);
      assertEquals(0, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.073542846408523
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "]5D9`T(^C[A?1U5e8#", 204, 93);
      foreignKeyConstraint0.compareTo(foreignKeyConstraint0);
      foreignKeyConstraint0.compareTo(foreignKeyConstraint0);
      Config.getInstance();
      foreignKeyConstraint0.getDeleteRuleDescription();
      System.setCurrentTimeMillis(0L);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.9810967544026823
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, false);
      TableColumnMeta tableColumnMeta0 = mock(TableColumnMeta.class, new ViolatedAssumptionAnswer());
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 0, 0);
      foreignKeyConstraint0.getChildTable();
      boolean boolean0 = foreignKeyConstraint0.isCascadeOnDelete();
      assertTrue(boolean0);
      
      foreignKeyConstraint0.isReal();
      foreignKeyConstraint0.isReal();
      boolean boolean1 = foreignKeyConstraint0.isRestrictDelete();
      foreignKeyConstraint0.getChildColumns();
      boolean boolean2 = foreignKeyConstraint0.isReal();
      assertFalse(boolean2 == boolean1);
      
      foreignKeyConstraint0.getChildColumns();
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "Null on delete");
      foreignKeyConstraint0.getParentColumns();
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "", 0, 2);
      foreignKeyConstraint1.getDeleteRuleDescription();
      Config.getInstance();
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Cascade on delete:\n Deletion of parent deletes child", string0);
      
      String string1 = foreignKeyConstraint1.getDeleteRuleAlias();
      assertEquals("N", string1);
      
      String string2 = foreignKeyConstraint1.getDeleteRuleDescription();
      assertFalse(foreignKeyConstraint1.isRestrictDelete());
      assertEquals("Null on delete:\n Foreign key to parent set to NULL when parent deleted", string2);
      assertEquals(0, foreignKeyConstraint1.getUpdateRule());
      assertFalse(foreignKeyConstraint1.isCascadeOnDelete());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.458311329683084
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TableColumnMeta tableColumnMeta0 = mock(TableColumnMeta.class, new ViolatedAssumptionAnswer());
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 0, 0);
      foreignKeyConstraint0.getChildTable();
      boolean boolean0 = foreignKeyConstraint0.isCascadeOnDelete();
      foreignKeyConstraint0.isReal();
      foreignKeyConstraint0.isReal();
      boolean boolean1 = foreignKeyConstraint0.isRestrictDelete();
      foreignKeyConstraint0.getChildColumns();
      foreignKeyConstraint0.isReal();
      foreignKeyConstraint0.getChildColumns();
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "Null on delete");
      foreignKeyConstraint0.getParentColumns();
      assertFalse(foreignKeyConstraint0.isNullOnDelete());
      
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "", 0, 2);
      String string0 = foreignKeyConstraint1.getDeleteRuleDescription();
      assertEquals("Null on delete:\n Foreign key to parent set to NULL when parent deleted", string0);
      
      String string1 = foreignKeyConstraint1.getDeleteRuleName();
      assertEquals("Null on delete", string1);
      
      boolean boolean2 = foreignKeyConstraint1.isNullOnDelete();
      assertFalse(boolean2 == boolean1);
      
      String string2 = foreignKeyConstraint1.getDeleteRuleAlias();
      assertEquals("N", string2);
      
      boolean boolean3 = foreignKeyConstraint1.isReal();
      assertFalse(foreignKeyConstraint1.isCascadeOnDelete());
      assertFalse(foreignKeyConstraint1.isRestrictDelete());
      assertTrue(boolean3 == boolean0);
      assertEquals(0, foreignKeyConstraint1.getUpdateRule());
      assertTrue(boolean3);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.4036404106149494
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TableColumnMeta tableColumnMeta0 = mock(TableColumnMeta.class, new ViolatedAssumptionAnswer());
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "vlt9J6DN-z,Qy", 3, 3);
      foreignKeyConstraint0.isCascadeOnDelete();
      foreignKeyConstraint0.isReal();
      foreignKeyConstraint0.isReal();
      foreignKeyConstraint0.isRestrictDelete();
      foreignKeyConstraint0.isReal();
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "vlt9J6DN-z,Qy", 3, 1);
      foreignKeyConstraint1.isRestrictDelete();
      foreignKeyConstraint0.getChildColumns();
      ForeignKeyConstraint foreignKeyConstraint2 = new ForeignKeyConstraint((Table) null, "vlt9J6DN-z,Qy", 9, 5737);
      foreignKeyConstraint2.isReal();
      List<TableColumn> list0 = foreignKeyConstraint0.getChildColumns();
      foreignKeyConstraint2.getDeleteRuleDescription();
      foreignKeyConstraint2.getDeleteRuleName();
      foreignKeyConstraint0.isNullOnDelete();
      foreignKeyConstraint0.getDeleteRuleAlias();
      foreignKeyConstraint2.isCascadeOnDelete();
      foreignKeyConstraint2.isReal();
      foreignKeyConstraint1.isRestrictDelete();
      foreignKeyConstraint1.getDeleteRuleAlias();
      ForeignKeyConstraint.toString(list0);
      // Undeclared exception!
      try { 
        foreignKeyConstraint2.toString();
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "                           in driverPath in [databa#eType].pr#perties.", 0, 0);
      Config.getInstance();
      LinkedList<TableColumn> linkedList0 = new LinkedList<TableColumn>();
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
      linkedList0.add(tableColumn0);
      String string0 = ForeignKeyConstraint.toString((List<TableColumn>) linkedList0);
      assertNull(string0);
  }
}
