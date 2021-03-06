/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 16:51:47 GMT 2018
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
import net.sourceforge.schemaspy.model.ForeignKeyConstraint;
import net.sourceforge.schemaspy.model.Table;
import net.sourceforge.schemaspy.model.TableColumn;
import net.sourceforge.schemaspy.model.xml.SchemaMeta;
import net.sourceforge.schemaspy.model.xml.TableColumnMeta;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
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
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = null;
      try {
        foreignKeyConstraint0 = new ForeignKeyConstraint((TableColumn) null, (TableColumn) null, 227, 227);
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "NO", (-388), (-388));
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
      int int0 = new Integer((-388));
      assertEquals((-388), int0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 202, 202);
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
      System.setCurrentTimeMillis(1L);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Q-^<dz|R(N76", (-689), (-689));
      foreignKeyConstraint0.getParentColumns();
      assertEquals((-689), foreignKeyConstraint0.getDeleteRule());
      assertEquals((-689), foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", (-737), (-737));
      foreignKeyConstraint0.getParentTable();
      assertEquals((-737), foreignKeyConstraint0.getDeleteRule());
      assertEquals((-737), foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.073542846408523
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Moz.`-`", 2, 2);
      foreignKeyConstraint0.getDeleteRuleDescription();
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
  //Test case number: 7
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 2, 2);
      boolean boolean0 = foreignKeyConstraint0.isCascadeOnDelete();
      assertEquals(2, foreignKeyConstraint0.getUpdateRule());
      assertFalse(boolean0);
      assertEquals("Null on delete:\n Foreign key to parent set to NULL when parent deleted", foreignKeyConstraint0.getDeleteRuleDescription());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", (-777), (-777));
      boolean boolean0 = foreignKeyConstraint0.isNullOnDelete();
      assertFalse(boolean0);
      assertEquals((-777), foreignKeyConstraint0.getUpdateRule());
      assertEquals((-777), foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 1912, 1912);
      foreignKeyConstraint0.addChildColumn((TableColumn) null);
      assertEquals(1912, foreignKeyConstraint0.getDeleteRule());
      assertEquals(1912, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.0735428464085233
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "ora", 46, 3);
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
  //Test case number: 11
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "YQ+HtxR:x.z>*C.5a&", 1575, 1575);
      foreignKeyConstraint0.getDeleteRuleName();
      assertEquals(1575, foreignKeyConstraint0.getDeleteRule());
      assertEquals(1575, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "DISCONNECT", 84, 84);
      foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals(84, foreignKeyConstraint0.getDeleteRule());
      assertEquals(84, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.4978661367769952
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "kVBwj#uv y8", 1529, 3);
      LinkedList<TableColumn> linkedList0 = new LinkedList<TableColumn>();
      foreignKeyConstraint0.getChildColumns();
      ForeignKeyConstraint.toString((List<TableColumn>) linkedList0);
      foreignKeyConstraint0.getChildColumns();
      String string0 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals("R", string0);
      
      boolean boolean0 = foreignKeyConstraint0.isReal();
      assertEquals(1529, foreignKeyConstraint0.getUpdateRule());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "DISCONNECT", 84, 1);
      String string0 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals(84, foreignKeyConstraint0.getUpdateRule());
      assertEquals("R", string0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 46, 0);
      foreignKeyConstraint0.getDeleteRuleName();
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(1575, 0, 0, 1575).when(resultSet0).getInt(anyString());
      doReturn((Table) null).when(resultSet0).getObject(anyString());
      doReturn("j'", "Cascade on delete", "j'", "j'").when(resultSet0).getString(anyString());
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
  //Test case number: 16
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "G-mwoY4Nss:$>", 44, 44);
      int int0 = foreignKeyConstraint0.getUpdateRule();
      assertEquals(44, int0);
      assertEquals(44, foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Moz.`-`", (-7), (-7));
      foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals((-7), foreignKeyConstraint0.getDeleteRule());
      assertEquals((-7), foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int int0 = 1;
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "SYSTEM_USER", 1, 2);
      List<TableColumn> list0 = new LinkedList<TableColumn>();
      foreignKeyConstraint0.getDeleteRuleAlias();
      Config config0 = Config.getInstance();
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      config0.isNumRowsEnabled();
      SchemaMeta schemaMeta0 = null;
      try {
        schemaMeta0 = new SchemaMeta("", "Excluding ", "UTF-8");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Meta directory \"\" must contain a file named \"UTF-8.meta.xml\"
         //
         verifyException("net.sourceforge.schemaspy.model.xml.SchemaMeta", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, (-1975), 0);
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Cascade on delete:\n Deletion of parent deletes child", string0);
      assertEquals((-1975), foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Moz.`-`", (-5421), (-5421));
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      assertEquals((-5421), foreignKeyConstraint0.getDeleteRule());
      assertEquals((-5421), foreignKeyConstraint0.getUpdateRule());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 1018, 0);
      foreignKeyConstraint0.getChildColumns();
      String string0 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals("C", string0);
      assertEquals(1018, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "COALESCE", 19, 19);
      foreignKeyConstraint0.addParentColumn((TableColumn) null);
      assertEquals(19, foreignKeyConstraint0.getUpdateRule());
      assertEquals(19, foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "SYSTEM_USER", 1597, 1597);
      boolean boolean0 = foreignKeyConstraint0.isImplied();
      assertEquals(1597, foreignKeyConstraint0.getDeleteRule());
      assertEquals(1597, foreignKeyConstraint0.getUpdateRule());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "yy[7Gda0", 1, 1);
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Restrict delete:\n Parent cannot be deleted if children exist", string0);
      assertEquals(1, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "yy[7Gda0", 1, 1);
      foreignKeyConstraint0.getDeleteRuleName();
      Config.getInstance();
      SchemaMeta schemaMeta0 = null;
      try {
        schemaMeta0 = new SchemaMeta("yy[7Gda0", "Restrict delete", "UTF-8");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Specified meta file \"yy[7Gda0\" does not exist
         //
         verifyException("net.sourceforge.schemaspy.model.xml.SchemaMeta", e);
      }
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "l", 2, 2);
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "WHEN", 2, 2);
      int int0 = foreignKeyConstraint0.compareTo(foreignKeyConstraint1);
      assertEquals((-11), int0);
      assertEquals(2, foreignKeyConstraint1.getUpdateRule());
      assertTrue(foreignKeyConstraint1.isNullOnDelete());
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Table table0 = null;
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "NJOWL.1G-", 2, 2);
      int int0 = 59;
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "NJOWL.1G-", 2, 59);
      foreignKeyConstraint0.getChildColumns();
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
  //Test case number: 28
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "YQ+HtxR:x.z>*C.5a&", 2, 2);
      String string0 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals("Null on delete", string0);
      assertEquals(2, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 29
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 24, 24);
      int int0 = foreignKeyConstraint0.compareTo(foreignKeyConstraint0);
      assertEquals(24, foreignKeyConstraint0.getUpdateRule());
      assertEquals(0, int0);
      assertEquals(24, foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "wtU,-^0Q-a2C(f@", 2, 2);
      boolean boolean0 = foreignKeyConstraint0.isNullOnDelete();
      assertTrue(boolean0);
      assertEquals(2, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "net.sourceforge.schemaspy.model.View", 3, 3);
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      assertTrue(boolean0);
      assertEquals(3, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "kVBwj#uv y8", 1529, 3);
      DatabaseMetaData databaseMetaData0 = mock(DatabaseMetaData.class, new ViolatedAssumptionAnswer());
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Restrict delete:\n Parent cannot be deleted if children exist", string0);
      assertEquals(1529, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 33
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LinkedList<TableColumn> linkedList0 = new LinkedList<TableColumn>();
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
  //Test case number: 34
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, " via ", 0, 0);
      boolean boolean0 = foreignKeyConstraint0.isCascadeOnDelete();
      assertTrue(boolean0);
      assertEquals(0, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 35
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "G3", 1, 1);
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      assertTrue(boolean0);
      assertEquals(1, foreignKeyConstraint0.getUpdateRule());
  }
}
