/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 10:30:42 GMT 2018
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
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 853, 0);
      foreignKeyConstraint0.getParentColumns();
      Config.getInstance();
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      DatabaseMetaData databaseMetaData0 = mock(DatabaseMetaData.class, new ViolatedAssumptionAnswer());
      TableColumnMeta tableColumnMeta0 = mock(TableColumnMeta.class, new ViolatedAssumptionAnswer());
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Cascade on delete:\n Deletion of parent deletes child", string0);
      
      int int0 = foreignKeyConstraint0.getUpdateRule();
      assertEquals(853, int0);
      
      List<TableColumn> list0 = foreignKeyConstraint0.getChildColumns();
      String string1 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals("C", string1);
      
      ForeignKeyConstraint.toString(list0);
      boolean boolean0 = foreignKeyConstraint0.isImplied();
      assertFalse(boolean0);
      
      boolean boolean1 = foreignKeyConstraint0.isReal();
      boolean boolean2 = foreignKeyConstraint0.isCascadeOnDelete();
      assertTrue(boolean2 == boolean1);
      assertTrue(boolean2);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 853, 0);
      foreignKeyConstraint0.getParentColumns();
      Config.getInstance();
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      DatabaseMetaData databaseMetaData0 = mock(DatabaseMetaData.class, new ViolatedAssumptionAnswer());
      TableColumnMeta tableColumnMeta0 = mock(TableColumnMeta.class, new ViolatedAssumptionAnswer());
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, false);
      boolean boolean0 = foreignKeyConstraint0.isReal();
      assertTrue(boolean0);
      
      foreignKeyConstraint0.getParentTable();
      assertEquals(853, foreignKeyConstraint0.getUpdateRule());
      assertEquals(0, foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", (-2182), 16);
      List<TableColumn> list0 = foreignKeyConstraint0.getParentColumns();
      Config.getInstance();
      foreignKeyConstraint0.getDeleteRuleDescription();
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "", 3, 16);
      int int0 = foreignKeyConstraint1.getUpdateRule();
      assertEquals(3, int0);
      
      foreignKeyConstraint0.getChildColumns();
      foreignKeyConstraint1.getDeleteRuleAlias();
      ForeignKeyConstraint.toString(list0);
      boolean boolean0 = foreignKeyConstraint0.isImplied();
      assertFalse(boolean0);
      
      boolean boolean1 = foreignKeyConstraint0.isReal();
      boolean boolean2 = foreignKeyConstraint0.isCascadeOnDelete();
      assertEquals(16, foreignKeyConstraint0.getDeleteRule());
      assertFalse(boolean2 == boolean1);
      assertFalse(boolean2);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 853, 0);
      foreignKeyConstraint0.getParentColumns();
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      DatabaseMetaData databaseMetaData0 = mock(DatabaseMetaData.class, new ViolatedAssumptionAnswer());
      TableColumnMeta tableColumnMeta0 = mock(TableColumnMeta.class, new ViolatedAssumptionAnswer());
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Cascade on delete:\n Deletion of parent deletes child", string0);
      
      int int0 = foreignKeyConstraint0.getUpdateRule();
      assertEquals(853, int0);
      
      List<TableColumn> list0 = foreignKeyConstraint0.getChildColumns();
      String string1 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals("C", string1);
      
      ForeignKeyConstraint.toString(list0);
      boolean boolean0 = foreignKeyConstraint0.isImplied();
      boolean boolean1 = foreignKeyConstraint0.isReal();
      assertFalse(boolean1 == boolean0);
      
      foreignKeyConstraint0.getChildTable();
      assertEquals(853, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 853, 0);
      foreignKeyConstraint0.getParentColumns();
      Config.getInstance();
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      DatabaseMetaData databaseMetaData0 = mock(DatabaseMetaData.class, new ViolatedAssumptionAnswer());
      TableColumnMeta tableColumnMeta0 = mock(TableColumnMeta.class, new ViolatedAssumptionAnswer());
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Cascade on delete:\n Deletion of parent deletes child", string0);
      
      int int0 = new Integer(0);
      List<TableColumn> list0 = foreignKeyConstraint0.getChildColumns();
      String string1 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals("C", string1);
      
      ForeignKeyConstraint.toString(list0);
      boolean boolean0 = foreignKeyConstraint0.isNullOnDelete();
      assertEquals(853, foreignKeyConstraint0.getUpdateRule());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "Cascade on delete:\n Deletion of parent deletes child");
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 925, 925);
      foreignKeyConstraint0.getName();
      foreignKeyConstraint0.getName();
      foreignKeyConstraint0.addParentColumn((TableColumn) null);
      assertEquals(925, foreignKeyConstraint0.getDeleteRule());
      assertEquals(925, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.7999587982097305
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 853, 0);
      foreignKeyConstraint0.getParentColumns();
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "", 259, 259);
      List<TableColumn> list0 = foreignKeyConstraint0.getParentColumns();
      Config.getInstance();
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Cascade on delete:\n Deletion of parent deletes child", string0);
      
      Integer integer0 = new Integer(853);
      foreignKeyConstraint1.getChildColumns();
      foreignKeyConstraint1.getDeleteRuleAlias();
      ForeignKeyConstraint.toString(list0);
      boolean boolean0 = foreignKeyConstraint0.isNullOnDelete();
      assertFalse(boolean0);
      
      String string1 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals(853, foreignKeyConstraint0.getUpdateRule());
      assertEquals("Cascade on delete", string1);
      
      foreignKeyConstraint1.getDeleteRuleDescription();
      assertFalse(foreignKeyConstraint1.isNullOnDelete());
      assertEquals(259, foreignKeyConstraint1.getDeleteRule());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.8310204811135162
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 146, 2);
      foreignKeyConstraint0.getParentColumns();
      Config.getInstance();
      foreignKeyConstraint0.getDeleteRuleDescription();
      Integer integer0 = new Integer((-718));
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
        foreignKeyConstraint1 = new ForeignKeyConstraint(tableColumn0, tableColumn0, (-1), (-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.schemaspy.model.TableColumn", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.9459347757561138
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 46, 57);
      List<TableColumn> list0 = foreignKeyConstraint0.getParentColumns();
      Config.getInstance();
      foreignKeyConstraint0.getDeleteRuleDescription();
      Integer integer0 = new Integer((-1493));
      foreignKeyConstraint0.getDeleteRuleAlias();
      ForeignKeyConstraint.toString(list0);
      boolean boolean0 = foreignKeyConstraint0.isNullOnDelete();
      foreignKeyConstraint0.getDeleteRuleName();
      foreignKeyConstraint0.getDeleteRuleDescription();
      ForeignKeyConstraint.toString(list0);
      boolean boolean1 = foreignKeyConstraint0.isReal();
      assertEquals(57, foreignKeyConstraint0.getDeleteRule());
      assertEquals(46, foreignKeyConstraint0.getUpdateRule());
      assertFalse(boolean1 == boolean0);
      assertTrue(boolean1);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.0642580751745085
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 174, (-2127));
      foreignKeyConstraint0.getParentColumns();
      Config.getInstance();
      foreignKeyConstraint0.getDeleteRuleDescription();
      Integer integer0 = new Integer(853);
      List<TableColumn> list0 = foreignKeyConstraint0.getChildColumns();
      foreignKeyConstraint0.getDeleteRuleAlias();
      ForeignKeyConstraint.toString(list0);
      foreignKeyConstraint0.getChildColumns();
      foreignKeyConstraint0.isReal();
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
  //Test case number: 11
  /*Coverage entropy=2.0431918705451206
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 174, 1);
      foreignKeyConstraint0.getParentColumns();
      Config.getInstance();
      foreignKeyConstraint0.getDeleteRuleDescription();
      Integer integer0 = new Integer((-2127));
      List<TableColumn> list0 = foreignKeyConstraint0.getChildColumns();
      foreignKeyConstraint0.getDeleteRuleAlias();
      ForeignKeyConstraint.toString(list0);
      ForeignKeyConstraint foreignKeyConstraint1 = null;
      try {
        foreignKeyConstraint1 = new ForeignKeyConstraint((TableColumn) null, (TableColumn) null, 1, 174);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.schemaspy.model.ForeignKeyConstraint", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.0791512728828505
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 146, 2);
      foreignKeyConstraint0.getParentColumns();
      Config.getInstance();
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "N", 146, 155);
      foreignKeyConstraint1.getParentColumns();
      Config.getInstance();
      foreignKeyConstraint1.getDeleteRuleDescription();
      List<TableColumn> list0 = foreignKeyConstraint0.getChildColumns();
      String string0 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals("N", string0);
      
      ForeignKeyConstraint.toString(list0);
      boolean boolean0 = foreignKeyConstraint1.isReal();
      assertTrue(boolean0);
      
      ForeignKeyConstraint foreignKeyConstraint2 = new ForeignKeyConstraint((Table) null, "UTF-8", (-927), (-927));
      int int0 = foreignKeyConstraint0.compareTo(foreignKeyConstraint2);
      assertEquals(146, foreignKeyConstraint0.getUpdateRule());
      assertEquals((-5), int0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.0791512728828505
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", (-1642), 2);
      foreignKeyConstraint0.getParentColumns();
      Config.getInstance();
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "", 146, 155);
      foreignKeyConstraint0.getParentColumns();
      Config.getInstance();
      foreignKeyConstraint0.getDeleteRuleDescription();
      List<TableColumn> list0 = foreignKeyConstraint0.getChildColumns();
      foreignKeyConstraint1.getDeleteRuleAlias();
      ForeignKeyConstraint.toString(list0);
      foreignKeyConstraint1.isReal();
      ForeignKeyConstraint foreignKeyConstraint2 = new ForeignKeyConstraint((Table) null, "", 146, 155);
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
  /*Coverage entropy=1.9652370493802307
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", (-1642), 2);
      List<TableColumn> list0 = foreignKeyConstraint0.getParentColumns();
      Config.getInstance();
      Integer integer0 = new Integer(146);
      Config.getInstance();
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
      foreignKeyConstraint0.addChildColumn(tableColumn0);
      Integer integer1 = new Integer(1977);
      List<TableColumn> list1 = foreignKeyConstraint0.getChildColumns();
      foreignKeyConstraint0.getDeleteRuleAlias();
      ForeignKeyConstraint.toString(list0);
      foreignKeyConstraint0.isNullOnDelete();
      ForeignKeyConstraint.toString(list1);
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      DatabaseMetaData databaseMetaData0 = mock(DatabaseMetaData.class, new ViolatedAssumptionAnswer());
      String string0 = "td^;Zc_}My4Q";
      String string1 = "TO";
      String string2 = " p}\"m\".$PBc;v-z4h;";
      SchemaMeta schemaMeta0 = null;
      try {
        schemaMeta0 = new SchemaMeta(" p}\"m\".$PBc;v-z4h;", "", "UTF-8");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Specified meta file \" p}\"m\".$PBc;v-z4h;\" does not exist
         //
         verifyException("net.sourceforge.schemaspy.model.xml.SchemaMeta", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.9459347757561138
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 149, (-2127));
      foreignKeyConstraint0.getParentColumns();
      Config.getInstance();
      foreignKeyConstraint0.getDeleteRuleDescription();
      List<TableColumn> list0 = foreignKeyConstraint0.getChildColumns();
      foreignKeyConstraint0.getDeleteRuleAlias();
      ForeignKeyConstraint.toString(list0);
      foreignKeyConstraint0.getChildColumns();
      boolean boolean0 = foreignKeyConstraint0.isReal();
      assertTrue(boolean0);
      
      int int0 = foreignKeyConstraint0.compareTo(foreignKeyConstraint0);
      assertEquals(0, int0);
      assertEquals((-2127), foreignKeyConstraint0.getDeleteRule());
      assertEquals(149, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.278302525039135
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", (-1642), 2);
      foreignKeyConstraint0.getParentColumns();
      foreignKeyConstraint0.getParentColumns();
      foreignKeyConstraint0.getDeleteRuleDescription();
      foreignKeyConstraint0.getDeleteRuleAlias();
      foreignKeyConstraint0.getChildColumns();
      LinkedList<TableColumn> linkedList0 = new LinkedList<TableColumn>();
      ForeignKeyConstraint.toString((List<TableColumn>) linkedList0);
      boolean boolean0 = foreignKeyConstraint0.isNullOnDelete();
      String string0 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals("Null on delete", string0);
      
      foreignKeyConstraint0.getDeleteRuleDescription();
      String string1 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Null on delete:\n Foreign key to parent set to NULL when parent deleted", string1);
      
      boolean boolean1 = foreignKeyConstraint0.isReal();
      assertTrue(boolean1 == boolean0);
      
      foreignKeyConstraint0.addChildColumn((TableColumn) null);
      foreignKeyConstraint0.getDeleteRuleAlias();
      boolean boolean2 = foreignKeyConstraint0.isRestrictDelete();
      assertFalse(boolean2);
      
      String string2 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals((-1642), foreignKeyConstraint0.getUpdateRule());
      assertEquals("N", string2);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Cascade on del?te:\n Del`tion of pare9t deletes child", 880, 3);
      foreignKeyConstraint0.getDeleteRuleAlias();
      foreignKeyConstraint0.isRestrictDelete();
      foreignKeyConstraint0.getDeleteRuleDescription();
      foreignKeyConstraint0.getDeleteRuleAlias();
      foreignKeyConstraint0.getDeleteRuleAlias();
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "R", 880, (-1268));
      foreignKeyConstraint1.getChildColumns();
      Table table0 = null;
      try {
        table0 = new Table((Database) null, "okm;z3+RR", "R", "Null on delete:\n Foreign key to parent set to NULL when parent deleted", "R");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.schemaspy.model.Table", e);
      }
  }
}