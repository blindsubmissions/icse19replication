/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 13:55:11 GMT 2018
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
      ForeignKeyConstraint foreignKeyConstraint0 = null;
      try {
        foreignKeyConstraint0 = new ForeignKeyConstraint((TableColumn) null, (TableColumn) null, 887, 887);
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
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedList<TableColumn> linkedList0 = new LinkedList<TableColumn>();
      String string0 = ForeignKeyConstraint.toString((List<TableColumn>) linkedList0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.796311640173813
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Table table0 = null;
      String string0 = null;
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, (-1), (-1));
      foreignKeyConstraint0.getDeleteRuleDescription();
      Config config0 = new Config();
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      DatabaseMetaData databaseMetaData0 = mock(DatabaseMetaData.class, new ViolatedAssumptionAnswer());
      doReturn((ResultSet) null).when(databaseMetaData0).getTables(anyString() , anyString() , anyString() , any(java.lang.String[].class));
      Database database0 = null;
      try {
        database0 = new Database(config0, connection0, databaseMetaData0, "UTF-8", "UTF-8", "", (SchemaMeta) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.schemaspy.model.Database", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.7963116401738131
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Adding foreign key constraint '", (-902), 1);
      foreignKeyConstraint0.getDeleteRuleAlias();
      System.setCurrentTimeMillis(0L);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, (-1), (-1));
      foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals((-1), foreignKeyConstraint0.getDeleteRule());
      assertEquals((-1), foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 26, 26);
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
      System.setCurrentTimeMillis(26);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 127, 127);
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
      System.setCurrentTimeMillis(127);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "C", 83, 83);
      foreignKeyConstraint0.addChildColumn((TableColumn) null);
      System.setCurrentTimeMillis(1256L);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
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
  //Test case number: 9
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Mx0v0g9", 79, 79);
      foreignKeyConstraint0.getParentColumns();
      assertEquals(79, foreignKeyConstraint0.getUpdateRule());
      assertEquals(79, foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "{", 10, 10);
      boolean boolean0 = foreignKeyConstraint0.isImplied();
      assertFalse(boolean0);
      assertEquals(10, foreignKeyConstraint0.getDeleteRule());
      assertEquals(10, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, (-1), (-1));
      boolean boolean0 = foreignKeyConstraint0.isCascadeOnDelete();
      assertFalse(boolean0);
      assertEquals((-1), foreignKeyConstraint0.getDeleteRule());
      assertEquals((-1), foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.7963116401738131
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, (-1), (-1));
      foreignKeyConstraint0.getDeleteRuleName();
      Config config0 = new Config();
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      DatabaseMetaData databaseMetaData0 = mock(DatabaseMetaData.class, new ViolatedAssumptionAnswer());
      doReturn((ResultSet) null).when(databaseMetaData0).getTables(anyString() , anyString() , anyString() , any(java.lang.String[].class));
      Database database0 = null;
      try {
        database0 = new Database(config0, connection0, databaseMetaData0, "-norows", "-norows", "Cascade on delete:\n Deletion of parent deletes child", (SchemaMeta) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.schemaspy.model.Database", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)56;
      byteArray0[2] = (byte) (-39);
      byteArray0[3] = (byte)1;
      byteArray0[4] = (byte)30;
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      byteArray0[5] = (byte)124;
      byteArray0[6] = (byte)46;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 1, 0);
      foreignKeyConstraint0.getParentTable();
      foreignKeyConstraint0.getParentTable();
      String string0 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals("C", string0);
      assertEquals(1, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Add$ng foreign key constraint '", 38, 38);
      foreignKeyConstraint0.getChildTable();
      assertEquals(38, foreignKeyConstraint0.getUpdateRule());
      assertEquals(38, foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 2, 2);
      boolean boolean0 = foreignKeyConstraint0.isReal();
      assertTrue(boolean0);
      assertEquals(2, foreignKeyConstraint0.getUpdateRule());
      assertEquals(2, foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, (-19), (-19));
      foreignKeyConstraint0.getUpdateRule();
      String[] stringArray0 = new String[14];
      stringArray0[5] = stringArray0[2];
      Config config0 = null;
      try {
        config0 = new Config(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.schemaspy.Config", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "#3f9", (-3049), (-3049));
      boolean boolean0 = foreignKeyConstraint0.isNullOnDelete();
      assertFalse(boolean0);
      assertEquals((-3049), foreignKeyConstraint0.getUpdateRule());
      assertEquals((-3049), foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "G", 10, 10);
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      assertEquals(10, foreignKeyConstraint0.getUpdateRule());
      assertFalse(boolean0);
      assertEquals(10, foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "{", 3, 3);
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Restrict delete:\n Parent cannot be deleted if children exist", string0);
      assertEquals(3, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 33, 0);
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals(33, foreignKeyConstraint0.getUpdateRule());
      assertEquals("Cascade on delete:\n Deletion of parent deletes child", string0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Vghx&@%", (-1969), 1);
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Restrict delete:\n Parent cannot be deleted if children exist", string0);
      assertEquals((-1969), foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, (-1), 2);
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Null on delete:\n Foreign key to parent set to NULL when parent deleted", string0);
      assertEquals((-1), foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 2, 2);
      boolean boolean0 = foreignKeyConstraint0.isNullOnDelete();
      assertTrue(boolean0);
      assertEquals(2, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 2, 2);
      String string0 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals("Null on delete", string0);
      assertEquals(2, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, (-2309), (-2309));
      foreignKeyConstraint0.addParentColumn((TableColumn) null);
      assertEquals((-2309), foreignKeyConstraint0.getUpdateRule());
      assertEquals((-2309), foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 1, 1);
      String string0 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals("Restrict delete", string0);
      assertEquals(1, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 46, 1);
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      assertEquals(46, foreignKeyConstraint0.getUpdateRule());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 2, 2);
      foreignKeyConstraint0.getName();
      String string0 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals(2, foreignKeyConstraint0.getUpdateRule());
      assertEquals("N", string0);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 46, 3);
      String string0 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals(46, foreignKeyConstraint0.getUpdateRule());
      assertEquals("Restrict delete", string0);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, (-158), 3);
      FileSystemHandling.shouldAllThrowIOExceptions();
      foreignKeyConstraint0.getDeleteRuleAlias();
      Config.getInstance();
      System.setCurrentTimeMillis((-158));
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 0, 0);
      boolean boolean0 = foreignKeyConstraint0.isCascadeOnDelete();
      assertTrue(boolean0);
      assertEquals(0, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 10, (-269));
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "", (-269), 46);
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
  //Test case number: 33
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "{", 3, 3);
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      assertEquals(3, foreignKeyConstraint0.getUpdateRule());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 34
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", (-1), (-1));
      int int0 = foreignKeyConstraint0.compareTo(foreignKeyConstraint0);
      assertEquals((-1), foreignKeyConstraint0.getDeleteRule());
      assertEquals(0, int0);
      assertEquals((-1), foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 35
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "?", (-269), (-269));
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "vE(agI'C]", (-269), (-269));
      int int0 = foreignKeyConstraint0.compareTo(foreignKeyConstraint1);
      assertEquals((-55), int0);
      assertEquals((-269), foreignKeyConstraint1.getDeleteRule());
      assertEquals((-269), foreignKeyConstraint1.getUpdateRule());
  }

  /**
  //Test case number: 36
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, (byte)17, (byte)0);
      String string0 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals(17, foreignKeyConstraint0.getUpdateRule());
      assertEquals("Cascade on delete", string0);
  }

  /**
  //Test case number: 37
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LinkedList<TableColumn> linkedList0 = new LinkedList<TableColumn>();
      linkedList0.clear();
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
}
