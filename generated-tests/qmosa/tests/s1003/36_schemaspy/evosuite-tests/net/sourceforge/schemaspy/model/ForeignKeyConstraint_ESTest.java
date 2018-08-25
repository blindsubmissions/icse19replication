/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 10:43:24 GMT 2018
 */

package net.sourceforge.schemaspy.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
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
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, ",s*", 1073, 0);
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Cascade on delete:\n Deletion of parent deletes child", string0);
      
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
      tableColumn0.removeAParentFKConstraint();
      tableColumn0.unlinkChildren();
      foreignKeyConstraint0.addChildColumn(tableColumn0);
      foreignKeyConstraint0.getName();
      boolean boolean0 = foreignKeyConstraint0.isImplied();
      boolean boolean1 = foreignKeyConstraint0.isRestrictDelete();
      assertTrue(boolean1 == boolean0);
      assertEquals(1073, foreignKeyConstraint0.getUpdateRule());
      assertFalse(boolean1);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.073542846408523
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, ",s*", 1073, 0);
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
      tableColumn0.removeAParentFKConstraint();
      tableColumn0.unlinkChildren();
      foreignKeyConstraint0.addChildColumn((TableColumn) null);
      Config.getInstance();
      SchemaMeta schemaMeta0 = null;
      try {
        schemaMeta0 = new SchemaMeta("UTF-8", "Cascade on delete:\n Deletion of parent deletes child", "");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Specified meta file \"UTF-8\" does not exist
         //
         verifyException("net.sourceforge.schemaspy.model.xml.SchemaMeta", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, ",s*", 1070, 0);
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
      tableColumn0.removeAParentFKConstraint();
      tableColumn0.unlinkChildren();
      foreignKeyConstraint0.addChildColumn(tableColumn0);
      foreignKeyConstraint0.getName();
      foreignKeyConstraint0.isImplied();
      foreignKeyConstraint0.isNullOnDelete();
      // Undeclared exception!
      try { 
        ForeignKeyConstraint.toString((List<TableColumn>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.schemaspy.model.ForeignKeyConstraint", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, ",s*", 1073, 0);
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Cascade on delete:\n Deletion of parent deletes child", string0);
      
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
      tableColumn0.removeAParentFKConstraint();
      tableColumn0.unlinkChildren();
      foreignKeyConstraint0.addChildColumn(tableColumn0);
      foreignKeyConstraint0.getName();
      FileSystemHandling.shouldAllThrowIOExceptions();
      foreignKeyConstraint0.getChildTable();
      assertEquals(1073, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.6987829895138007
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Config config0 = new Config();
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, " via ", (-1180), (-1180));
      foreignKeyConstraint0.getParentColumns();
      config0.setMaxDbThreads((-1180));
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      foreignKeyConstraint0.getChildTable();
      boolean boolean1 = foreignKeyConstraint0.isCascadeOnDelete();
      assertTrue(boolean1 == boolean0);
      
      foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals((-1180), foreignKeyConstraint0.getDeleteRule());
      assertEquals((-1180), foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.303092403761719
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Config config0 = new Config();
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 1073, 46);
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
      boolean boolean0 = foreignKeyConstraint0.isImplied();
      assertFalse(boolean0);
      
      foreignKeyConstraint0.getDeleteRuleName();
      assertEquals(1073, foreignKeyConstraint0.getUpdateRule());
      assertEquals(46, foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, ",s*", 1073, 0);
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Cascade on delete:\n Deletion of parent deletes child", string0);
      
      String[] stringArray0 = new String[5];
      stringArray0[0] = "Cascade on delete:\n Deletion of parent deletes child";
      stringArray0[0] = ",s*";
      stringArray0[2] = "Cascade on delete:\n Deletion of parent deletes child";
      stringArray0[3] = "Cascade on delete:\n Deletion of parent deletes child";
      stringArray0[4] = ",s*";
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      DatabaseMetaData databaseMetaData0 = mock(DatabaseMetaData.class, new ViolatedAssumptionAnswer());
      TableColumnMeta tableColumnMeta0 = mock(TableColumnMeta.class, new ViolatedAssumptionAnswer());
      foreignKeyConstraint0.getParentTable();
      boolean boolean0 = foreignKeyConstraint0.isReal();
      assertTrue(boolean0);
      
      foreignKeyConstraint0.getParentTable();
      assertEquals(1073, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.0431918705451206
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Config config0 = new Config();
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "UTF-8", (-1187), 46);
      List<TableColumn> list0 = foreignKeyConstraint0.getChildColumns();
      ForeignKeyConstraint.toString(list0);
      Config.getInstance();
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      DatabaseMetaData databaseMetaData0 = mock(DatabaseMetaData.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = foreignKeyConstraint0.isImplied();
      assertFalse(boolean0);
      
      boolean boolean1 = foreignKeyConstraint0.isNullOnDelete();
      boolean boolean2 = foreignKeyConstraint0.isRestrictDelete();
      assertTrue(boolean2 == boolean1);
      
      foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals(46, foreignKeyConstraint0.getDeleteRule());
      assertEquals((-1187), foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, ",s*", 1073, 0);
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Cascade on delete:\n Deletion of parent deletes child", string0);
      
      String[] stringArray0 = new String[5];
      stringArray0[0] = "Cascade on delete:\n Deletion of parent deletes child";
      stringArray0[1] = ",s*";
      stringArray0[2] = "Cascade on delete:\n Deletion of parent deletes child";
      stringArray0[3] = "Cascade on delete:\n Deletion of parent deletes child";
      stringArray0[4] = ",s*";
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      DatabaseMetaData databaseMetaData0 = mock(DatabaseMetaData.class, new ViolatedAssumptionAnswer());
      TableColumnMeta tableColumnMeta0 = mock(TableColumnMeta.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = foreignKeyConstraint0.isCascadeOnDelete();
      boolean boolean1 = foreignKeyConstraint0.isRestrictDelete();
      assertFalse(boolean1 == boolean0);
      
      int int0 = foreignKeyConstraint0.getUpdateRule();
      assertEquals(1073, int0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.666332585328325
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, ",s*", 1073, 0);
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
      foreignKeyConstraint0.isImplied();
      foreignKeyConstraint0.getDeleteRuleName();
      foreignKeyConstraint0.getDeleteRuleDescription();
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
      tableColumn0.getParentConstraint(tableColumn1);
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
  //Test case number: 10
  /*Coverage entropy=1.4978661367769954
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, ",s*", 1070, 0);
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Cascade on delete:\n Deletion of parent deletes child", string0);
      
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
      foreignKeyConstraint0.addParentColumn(tableColumn1);
      TableColumnMeta tableColumnMeta2 = mock(TableColumnMeta.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(tableColumnMeta2).getComments();
      doReturn((String) null).when(tableColumnMeta2).getDefaultValue();
      doReturn(0).when(tableColumnMeta2).getDigits();
      doReturn((String) null).when(tableColumnMeta2).getId();
      doReturn((String) null).when(tableColumnMeta2).getName();
      doReturn(0).when(tableColumnMeta2).getSize();
      doReturn((String) null).when(tableColumnMeta2).getType();
      doReturn(false).when(tableColumnMeta2).isAutoUpdated();
      doReturn(false).when(tableColumnMeta2).isNullable();
      TableColumn tableColumn2 = new TableColumn((Table) null, tableColumnMeta2);
      boolean boolean0 = foreignKeyConstraint0.isImplied();
      assertFalse(boolean0);
      
      String string1 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals(1070, foreignKeyConstraint0.getUpdateRule());
      assertEquals("Cascade on delete", string1);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.8143075196071254
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = ",\\s*";
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, ",s*", 1070, 0);
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
      tableColumn0.removeAParentFKConstraint();
      tableColumn0.unlinkChildren();
      foreignKeyConstraint0.addChildColumn(tableColumn0);
      foreignKeyConstraint0.getName();
      foreignKeyConstraint0.isImplied();
      foreignKeyConstraint0.isNullOnDelete();
      FileSystemHandling.shouldAllThrowIOExceptions();
      foreignKeyConstraint0.getDeleteRuleAlias();
      Config config0 = new Config();
      Connection connection0 = null;
      DatabaseMetaData databaseMetaData0 = mock(DatabaseMetaData.class, new ViolatedAssumptionAnswer());
      String string1 = "N";
      SchemaMeta schemaMeta0 = null;
      try {
        schemaMeta0 = new SchemaMeta("Cascade on delete:\n Deletion of parent deletes child", "N", "");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Specified meta file \"Cascade on delete:
         //  Deletion of parent deletes child\" does not exist
         //
         verifyException("net.sourceforge.schemaspy.model.xml.SchemaMeta", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.0431918705451206
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Z;'g;4e*)0{", (-2316), (-2316));
      List<TableColumn> list0 = foreignKeyConstraint0.getChildColumns();
      ForeignKeyConstraint.toString(list0);
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "SPACE", (-2316), (-1));
      foreignKeyConstraint1.getParentColumns();
      foreignKeyConstraint1.getParentColumns();
      foreignKeyConstraint1.compareTo(foreignKeyConstraint0);
      foreignKeyConstraint1.isNullOnDelete();
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
  //Test case number: 13
  /*Coverage entropy=1.666332585328325
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, ",s*", 1073, 0);
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
      boolean boolean0 = foreignKeyConstraint0.isImplied();
      String string0 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals("Cascade on delete", string0);
      
      String string1 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Cascade on delete:\n Deletion of parent deletes child", string1);
      
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
      int int0 = foreignKeyConstraint0.compareTo(foreignKeyConstraint0);
      assertEquals(0, int0);
      
      boolean boolean1 = foreignKeyConstraint0.isNullOnDelete();
      assertEquals(1073, foreignKeyConstraint0.getUpdateRule());
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.7233917060220525
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, ",s*", 1073, 1);
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
      boolean boolean0 = foreignKeyConstraint0.isImplied();
      String string0 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals("Restrict delete", string0);
      
      String string1 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Restrict delete:\n Parent cannot be deleted if children exist", string1);
      
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
      boolean boolean1 = foreignKeyConstraint0.isRestrictDelete();
      assertFalse(boolean1 == boolean0);
      
      String string2 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals("R", string2);
      assertEquals(1073, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Cascade on delete:\n Deletion of parent deletes child", 6, 1087);
      foreignKeyConstraint0.getChildColumns();
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "Cascade on delete:\n Deletion of parent deletes child", 1087, 3);
      String string0 = foreignKeyConstraint1.getDeleteRuleDescription();
      assertFalse(foreignKeyConstraint1.isNullOnDelete());
      assertEquals("Restrict delete:\n Parent cannot be deleted if children exist", string0);
      
      boolean boolean0 = foreignKeyConstraint0.isNullOnDelete();
      assertEquals(6, foreignKeyConstraint0.getUpdateRule());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.0791512728828505
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, ",s*", 1073, 1);
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
      foreignKeyConstraint0.isImplied();
      foreignKeyConstraint0.getDeleteRuleName();
      foreignKeyConstraint0.getDeleteRuleDescription();
      foreignKeyConstraint0.getDeleteRuleDescription();
      foreignKeyConstraint0.isNullOnDelete();
      Config config0 = new Config();
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, ",s*", 1, 1);
      foreignKeyConstraint1.getParentColumns();
      foreignKeyConstraint0.getParentColumns();
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
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Z;|'g;e*)0{", 3, 3);
      foreignKeyConstraint0.getParentColumns();
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Restrict delete:\n Parent cannot be deleted if children exist", string0);
      
      foreignKeyConstraint0.isRestrictDelete();
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      assertTrue(boolean0);
      
      String string1 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals(3, foreignKeyConstraint0.getUpdateRule());
      assertEquals("R", string1);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.7480673485460891
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Z;'g;4e*)0{", 0, 1);
      foreignKeyConstraint0.getDeleteRuleDescription();
      foreignKeyConstraint0.getParentColumns();
      foreignKeyConstraint0.getParentColumns();
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "MM", 1, 2);
      foreignKeyConstraint0.compareTo(foreignKeyConstraint1);
      foreignKeyConstraint1.getParentColumns();
      Config config0 = Config.getInstance();
      config0.getColumnExclusions();
      foreignKeyConstraint1.getDeleteRuleName();
      foreignKeyConstraint1.getDeleteRuleDescription();
      System.setCurrentTimeMillis(1);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Cascade on delete:\n Deletion of parent deletes child", (-949), 1070);
      List<TableColumn> list0 = foreignKeyConstraint0.getChildColumns();
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
      ForeignKeyConstraint.toString(list0);
      assertEquals(1, list0.size());
      
      List<TableColumn> list1 = foreignKeyConstraint0.getParentColumns();
      assertFalse(list1.equals((Object)list0));
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = "Z;'g;4e*qw{";
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Z;'g;4e*qw{", 0, 1);
      foreignKeyConstraint0.getDeleteRuleDescription();
      foreignKeyConstraint0.getParentColumns();
      foreignKeyConstraint0.getParentColumns();
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "MM", 1, 2);
      foreignKeyConstraint0.getDeleteRuleDescription();
      foreignKeyConstraint1.isNullOnDelete();
      Config config0 = null;
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      DatabaseMetaData databaseMetaData0 = mock(DatabaseMetaData.class, new ViolatedAssumptionAnswer());
      String string1 = "H4oy#%El|047^";
      SchemaMeta schemaMeta0 = null;
      try {
        schemaMeta0 = new SchemaMeta("Z;'g;4e*qw{", "MM", "Z;'g;4e*qw{");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Specified meta file \"Z;'g;4e*qw{\" does not exist
         //
         verifyException("net.sourceforge.schemaspy.model.xml.SchemaMeta", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.519382664642301
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 0, 3);
      foreignKeyConstraint0.getDeleteRuleDescription();
      foreignKeyConstraint0.getDeleteRuleName();
      foreignKeyConstraint0.getDeleteRuleAlias();
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
  //Test case number: 22
  /*Coverage entropy=1.415369135079188
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 2, 2);
      foreignKeyConstraint0.getDeleteRuleDescription();
      foreignKeyConstraint0.getDeleteRuleName();
      foreignKeyConstraint0.getDeleteRuleAlias();
      System.setCurrentTimeMillis(1L);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "TIMEZONE_MINUTE", (-77), 3);
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
      tableColumn0.unlinkParents();
      ForeignKeyConstraint foreignKeyConstraint1 = null;
      try {
        foreignKeyConstraint1 = new ForeignKeyConstraint((TableColumn) null, tableColumn0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.schemaspy.model.TableColumn", e);
      }
  }
}