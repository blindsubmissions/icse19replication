/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 12:50:31 GMT 2018
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
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "~}0=D'C8x1L~k\u0005", (-530), (-530));
      String[] stringArray0 = new String[8];
      stringArray0[0] = "~}0=D'C8x1L~k\u0005";
      stringArray0[1] = "~}0=D'C8x1L~k\u0005";
      stringArray0[2] = "45W){l/Pix";
      stringArray0[3] = "~}0=D'C8x1L~k\u0005";
      foreignKeyConstraint0.getParentColumns();
      foreignKeyConstraint0.isRestrictDelete();
      foreignKeyConstraint0.getChildColumns();
      foreignKeyConstraint0.getParentTable();
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "y^S}kL Fg", (-530), 0);
      foreignKeyConstraint1.getName();
      foreignKeyConstraint1.getDeleteRule();
      TableColumn tableColumn0 = null;
      try {
        tableColumn0 = new TableColumn((Table) null, (TableColumnMeta) null);
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
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
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
  //Test case number: 2
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Config.getInstance();
      DatabaseMetaData databaseMetaData0 = mock(DatabaseMetaData.class, new ViolatedAssumptionAnswer());
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "yes", 1, 1);
      foreignKeyConstraint0.getDeleteRuleDescription();
      int int0 = foreignKeyConstraint0.getDeleteRule();
      int int1 = foreignKeyConstraint0.getUpdateRule();
      assertTrue(int1 == int0);
      
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Restrict delete:\n Parent cannot be deleted if children exist", string0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.0791512728828505
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "-ahic");
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "~}0=D'C8x1L~k\u0005", (-530), (-530));
      String[] stringArray0 = new String[8];
      stringArray0[0] = "~}0=D'C8x1L~k\u0005";
      stringArray0[1] = "~}0=D'C8x1L~k\u0005";
      stringArray0[2] = "45W){l/Pix";
      stringArray0[3] = "~}0=D'C8x1L~k\u0005";
      List<TableColumn> list0 = foreignKeyConstraint0.getParentColumns();
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      assertFalse(boolean0);
      
      List<TableColumn> list1 = foreignKeyConstraint0.getChildColumns();
      foreignKeyConstraint0.getParentTable();
      foreignKeyConstraint0.addChildColumn((TableColumn) null);
      LinkedList<TableColumn> linkedList0 = new LinkedList<TableColumn>();
      foreignKeyConstraint0.getDeleteRuleDescription();
      foreignKeyConstraint0.getChildColumns();
      ForeignKeyConstraint.toString(list0);
      ForeignKeyConstraint.toString(list0);
      assertTrue(list0.equals((Object)list1));
      
      int int0 = foreignKeyConstraint0.getDeleteRule();
      assertEquals((-530), int0);
      
      foreignKeyConstraint0.getChildTable();
      assertEquals((-530), foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Password: ", (-3929), (-91));
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "Password: ", (-1772), (-3929));
      List<TableColumn> list0 = foreignKeyConstraint1.getChildColumns();
      foreignKeyConstraint1.getParentColumns();
      ForeignKeyConstraint.toString(list0);
      foreignKeyConstraint1.getDeleteRuleDescription();
      Integer integer0 = new Integer((-3929));
      boolean boolean0 = foreignKeyConstraint0.isImplied();
      assertEquals((-91), foreignKeyConstraint0.getDeleteRule());
      assertFalse(boolean0);
      assertEquals((-3929), foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.666332585328325
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Password: ", (-3929), (-91));
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
      foreignKeyConstraint0.getParentColumns();
      TableColumn tableColumn0 = new TableColumn((Table) null, tableColumnMeta0);
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "Password: ", (-91), 187);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "|:dr2+iE=OG69L");
      foreignKeyConstraint1.getParentColumns();
      foreignKeyConstraint1.getParentColumns();
      foreignKeyConstraint1.getDeleteRuleDescription();
      foreignKeyConstraint1.getDeleteRuleDescription();
      int int0 = foreignKeyConstraint0.getDeleteRule();
      assertEquals((-91), int0);
      
      boolean boolean0 = foreignKeyConstraint1.isReal();
      boolean boolean1 = foreignKeyConstraint0.isCascadeOnDelete();
      assertFalse(boolean1 == boolean0);
      
      foreignKeyConstraint1.getDeleteRuleName();
      assertFalse(foreignKeyConstraint1.isCascadeOnDelete());
      assertEquals((-91), foreignKeyConstraint1.getUpdateRule());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.8392967479776607
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "P:jvto.sk:", 13, 13);
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
      List<TableColumn> list0 = foreignKeyConstraint0.getParentColumns();
      foreignKeyConstraint0.getParentColumns();
      ForeignKeyConstraint.toString(list0);
      assertTrue(list0.contains(tableColumn0));
      
      foreignKeyConstraint0.getDeleteRuleDescription();
      int int0 = foreignKeyConstraint0.getDeleteRule();
      assertEquals(13, int0);
      
      boolean boolean0 = foreignKeyConstraint0.isReal();
      boolean boolean1 = foreignKeyConstraint0.isCascadeOnDelete();
      assertEquals(13, foreignKeyConstraint0.getUpdateRule());
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.804938433146752
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "~}0=D'C8x1L~k\u0005", (-530), 182);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "~}0=D'C8x1L~k\u0005";
      stringArray0[1] = "~}0=D'C8x1L~k\u0005";
      stringArray0[2] = "45W){l/Pix";
      stringArray0[3] = "~}0=D'C8x1L~k\u0005";
      stringArray0[4] = "~}0=D'C8x1L~k\u0005";
      stringArray0[5] = "~}0=D'C8x1L~k\u0005";
      stringArray0[6] = "~}0=D'C8x1L~k\u0005";
      stringArray0[7] = "~}0=D'C8x1L~k\u0005";
      Config config0 = new Config(stringArray0);
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      List<TableColumn> list0 = foreignKeyConstraint0.getParentColumns();
      ForeignKeyConstraint.toString(list0);
      foreignKeyConstraint0.getDeleteRuleDescription();
      boolean boolean0 = foreignKeyConstraint0.isNullOnDelete();
      assertFalse(boolean0);
      
      foreignKeyConstraint0.getDeleteRuleAlias();
      foreignKeyConstraint0.getDeleteRuleName();
      assertEquals((-530), foreignKeyConstraint0.getUpdateRule());
      assertEquals(182, foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.182995977034132
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "net.sourceforge.schemaspy.model.ForeignKeyConstraint", 0, 0);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "net.sourceforge.schemaspy.model.ForeignKeyConstraint");
      foreignKeyConstraint0.getParentColumns();
      foreignKeyConstraint0.getParentColumns();
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      List<TableColumn> list0 = foreignKeyConstraint0.getChildColumns();
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, false);
      foreignKeyConstraint0.getParentTable();
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Cascade on delete:\n Deletion of parent deletes child", string0);
      
      List<TableColumn> list1 = foreignKeyConstraint0.getChildColumns();
      ForeignKeyConstraint.toString(list1);
      ForeignKeyConstraint.toString(list0);
      foreignKeyConstraint0.getDeleteRule();
      foreignKeyConstraint0.getChildTable();
      boolean boolean1 = foreignKeyConstraint0.isReal();
      boolean boolean2 = foreignKeyConstraint0.isCascadeOnDelete();
      assertTrue(boolean2 == boolean1);
      assertEquals(0, foreignKeyConstraint0.getUpdateRule());
      assertFalse(boolean2 == boolean0);
      assertTrue(boolean2);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Config.getInstance();
      DatabaseMetaData databaseMetaData0 = mock(DatabaseMetaData.class, new ViolatedAssumptionAnswer());
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 2, 2);
      List<TableColumn> list0 = foreignKeyConstraint0.getParentColumns();
      foreignKeyConstraint0.getParentColumns();
      ForeignKeyConstraint.toString(list0);
      foreignKeyConstraint0.getDeleteRule();
      foreignKeyConstraint0.getChildTable();
      boolean boolean0 = foreignKeyConstraint0.isNullOnDelete();
      boolean boolean1 = foreignKeyConstraint0.isReal();
      assertEquals(2, foreignKeyConstraint0.getUpdateRule());
      assertTrue(boolean1 == boolean0);
      assertTrue(boolean1);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.9652370493802307
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "net.sourceforge.schemaspy.model.ForeignKeyConstraint", 0, 0);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "net.sourceforge.schemaspy.model.ForeignKeyConstraint");
      foreignKeyConstraint0.getParentColumns();
      foreignKeyConstraint0.getParentColumns();
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      assertFalse(boolean0);
      
      List<TableColumn> list0 = foreignKeyConstraint0.getChildColumns();
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, false);
      foreignKeyConstraint0.getParentTable();
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Cascade on delete:\n Deletion of parent deletes child", string0);
      
      List<TableColumn> list1 = foreignKeyConstraint0.getChildColumns();
      ForeignKeyConstraint.toString(list1);
      ForeignKeyConstraint.toString(list0);
      String string1 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals(0, foreignKeyConstraint0.getUpdateRule());
      assertEquals("Cascade on delete", string1);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.073542846408523
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "P:jvto.sk:", 0, 0);
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Cascade on delete:\n Deletion of parent deletes child", string0);
      
      String string1 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals(0, foreignKeyConstraint0.getUpdateRule());
      assertEquals("C", string1);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "b5WoXYc", 7, 7);
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "b5WoXYc", 7, 7);
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
  /*Coverage entropy=1.5426719687381505
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      Config.getInstance();
      DatabaseMetaData databaseMetaData0 = mock(DatabaseMetaData.class, new ViolatedAssumptionAnswer());
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "=es", 1, 1);
      foreignKeyConstraint0.getChildColumns();
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Restrict delete:\n Parent cannot be deleted if children exist", string0);
      
      String string1 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals("R", string1);
      
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      assertTrue(boolean0);
      assertEquals(1, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
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
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 1, 1);
      String string0 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals(1, foreignKeyConstraint0.getUpdateRule());
      assertEquals("Restrict delete", string0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.9867316488081914
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", (-1522), 46);
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "<div class='viewDefinition preFormatted'>", 46, (-1));
      ForeignKeyConstraint foreignKeyConstraint2 = new ForeignKeyConstraint((Table) null, "lJlty?K1`-;F", 112, (-1));
      foreignKeyConstraint2.compareTo(foreignKeyConstraint0);
      foreignKeyConstraint0.getDeleteRuleDescription();
      foreignKeyConstraint2.getDeleteRuleAlias();
      int int0 = foreignKeyConstraint0.compareTo(foreignKeyConstraint1);
      assertEquals((-41), int0);
      
      boolean boolean0 = foreignKeyConstraint1.isRestrictDelete();
      assertFalse(boolean0);
      
      System.setCurrentTimeMillis(0L);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      foreignKeyConstraint0.getDeleteRuleDescription();
      foreignKeyConstraint0.getDeleteRuleName();
      foreignKeyConstraint0.addParentColumn((TableColumn) null);
      assertFalse(foreignKeyConstraint0.isRestrictDelete());
      
      foreignKeyConstraint1.getDeleteRuleDescription();
      assertEquals((-1), foreignKeyConstraint1.getDeleteRule());
      assertEquals(46, foreignKeyConstraint1.getUpdateRule());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Config.getInstance();
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 1, 3);
      foreignKeyConstraint0.getDeleteRuleDescription();
      String string0 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals("Restrict delete", string0);
      
      foreignKeyConstraint0.getDeleteRuleDescription();
      String string1 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals("R", string1);
      
      String string2 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals(1, foreignKeyConstraint0.getUpdateRule());
      assertEquals(3, foreignKeyConstraint0.getDeleteRule());
      assertEquals("Restrict delete:\n Parent cannot be deleted if children exist", string2);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "CONTINUE", 217, 217);
      int int0 = foreignKeyConstraint0.compareTo(foreignKeyConstraint0);
      foreignKeyConstraint0.getDeleteRuleName();
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "CONTINUE", 1966, 217);
      Integer integer0 = new Integer(1994);
      assertFalse(integer0.equals((Object)int0));
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 3, 3);
      List<TableColumn> list0 = foreignKeyConstraint0.getParentColumns();
      foreignKeyConstraint0.isRestrictDelete();
      foreignKeyConstraint0.getChildColumns();
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, false);
      foreignKeyConstraint0.getParentTable();
      foreignKeyConstraint0.getDeleteRuleDescription();
      foreignKeyConstraint0.getChildColumns();
      List<TableColumn> list1 = foreignKeyConstraint0.getParentColumns();
      ForeignKeyConstraint.toString(list1);
      ForeignKeyConstraint.toString(list0);
      foreignKeyConstraint0.getDeleteRuleName();
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
  //Test case number: 19
  /*Coverage entropy=1.6769877743224173
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Config config0 = new Config();
      config0.isMeterEnabled();
      config0.setMeta("d|{(hrH0'zo^\"uWa[");
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 155, 2);
      foreignKeyConstraint0.getDeleteRuleDescription();
      foreignKeyConstraint0.getDeleteRuleName();
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      assertFalse(boolean0);
      
      String string0 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals("N", string0);
      
      String string1 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Null on delete:\n Foreign key to parent set to NULL when parent deleted", string1);
      
      String string2 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals(155, foreignKeyConstraint0.getUpdateRule());
      assertEquals("Null on delete", string2);
  }
}
