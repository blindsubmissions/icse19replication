/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 07:49:13 GMT 2018
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
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = null;
      try {
        foreignKeyConstraint0 = new ForeignKeyConstraint((TableColumn) null, (TableColumn) null, 0, 0);
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
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "6", 3, 3);
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
      System.setCurrentTimeMillis(3);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "X#!w,(mYYmdQwgh+:", 56, 56);
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
      System.setCurrentTimeMillis(56);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
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
  //Test case number: 4
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 46, 46);
      foreignKeyConstraint0.getChildTable();
      assertEquals(46, foreignKeyConstraint0.getDeleteRule());
      assertEquals(46, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.796311640173813
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "i}#$z(OY_", (-1), (-1));
      foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals((-1), foreignKeyConstraint0.getUpdateRule());
      assertEquals((-1), foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.0735428464085233
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, (String) null);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", (-3588), 2);
      System.setCurrentTimeMillis(0L);
      String string0 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals("Null on delete", string0);
      
      String string1 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals((-3588), foreignKeyConstraint0.getUpdateRule());
      assertEquals("N", string1);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "i}#$z(OY_", (-1), (-1));
      foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals((-1), foreignKeyConstraint0.getUpdateRule());
      assertEquals((-1), foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "nk-iY{f", 372, 372);
      int int0 = foreignKeyConstraint0.getUpdateRule();
      assertEquals(372, foreignKeyConstraint0.getDeleteRule());
      assertEquals(372, int0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "v?9-h+#0NM]R:>k}", 169, 169);
      boolean boolean0 = foreignKeyConstraint0.isImplied();
      assertEquals(169, foreignKeyConstraint0.getDeleteRule());
      assertEquals(169, foreignKeyConstraint0.getUpdateRule());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "qhLZbt^%", 37, 37);
      foreignKeyConstraint0.getParentColumns();
      assertEquals(37, foreignKeyConstraint0.getUpdateRule());
      assertEquals(37, foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedList<TableColumn> linkedList0 = new LinkedList<TableColumn>();
      String string0 = ForeignKeyConstraint.toString((List<TableColumn>) linkedList0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "xh&6gQoNJ.(j", (-2173), (-2173));
      foreignKeyConstraint0.getParentTable();
      assertEquals((-2173), foreignKeyConstraint0.getDeleteRule());
      assertEquals((-2173), foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "nk-iY{f", (-2156), (-2156));
      int int0 = foreignKeyConstraint0.compareTo(foreignKeyConstraint0);
      assertEquals(0, int0);
      assertEquals((-2156), foreignKeyConstraint0.getDeleteRule());
      assertEquals((-2156), foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 119, 119);
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      assertEquals(119, foreignKeyConstraint0.getUpdateRule());
      assertFalse(boolean0);
      assertEquals(119, foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "v?9-h+#0NM]R:>k}", 169, 169);
      boolean boolean0 = foreignKeyConstraint0.isCascadeOnDelete();
      assertEquals(169, foreignKeyConstraint0.getDeleteRule());
      assertFalse(boolean0);
      assertEquals(169, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 21, 21);
      boolean boolean0 = foreignKeyConstraint0.isReal();
      assertTrue(boolean0);
      assertEquals(21, foreignKeyConstraint0.getDeleteRule());
      assertEquals(21, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "BhZiBT*", (-900), (-900));
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "C", (-900), (-900));
      int int0 = foreignKeyConstraint0.compareTo(foreignKeyConstraint1);
      assertEquals((-900), foreignKeyConstraint1.getDeleteRule());
      assertEquals((-900), foreignKeyConstraint1.getUpdateRule());
      assertEquals((-1), int0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Null on delete", 2656, 2656);
      foreignKeyConstraint0.addChildColumn((TableColumn) null);
      assertEquals(2656, foreignKeyConstraint0.getDeleteRule());
      assertEquals(2656, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "fL^ {ht", 202, 1585);
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "fL^ {ht", 1, 25);
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
  //Test case number: 20
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, ">tG6L)GHB", 1, 1);
      String string0 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals("R", string0);
      assertEquals(1, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "3D=2zv*=y", (-1766), (-1766));
      foreignKeyConstraint0.getDeleteRuleName();
      assertEquals((-1766), foreignKeyConstraint0.getDeleteRule());
      assertEquals((-1766), foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", (-2963), (-2963));
      boolean boolean0 = foreignKeyConstraint0.isNullOnDelete();
      assertEquals((-2963), foreignKeyConstraint0.getUpdateRule());
      assertFalse(boolean0);
      assertEquals((-2963), foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "II!D'{wn~W", 0, 0);
      boolean boolean0 = foreignKeyConstraint0.isCascadeOnDelete();
      assertEquals(0, foreignKeyConstraint0.getUpdateRule());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "^l'=.:{=.\"d(b_e\"", 0, 0);
      String string0 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals("Cascade on delete", string0);
      assertEquals(0, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "i}#$z(OY_", 0, 0);
      String string0 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals("C", string0);
      assertEquals(0, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 300, 2);
      foreignKeyConstraint0.getDeleteRuleDescription();
      Config config0 = null;
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      DatabaseMetaData databaseMetaData0 = mock(DatabaseMetaData.class, new ViolatedAssumptionAnswer());
      String string0 = null;
      String string1 = "ap21";
      SchemaMeta schemaMeta0 = null;
      try {
        schemaMeta0 = new SchemaMeta("Pv>uK62('/c@", "isdO8:[lN*X98<i", "ap21");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Specified meta file \"Pv>uK62('/c@\" does not exist
         //
         verifyException("net.sourceforge.schemaspy.model.xml.SchemaMeta", e);
      }
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "=UEx*y`=rnj|'P", 3, 3);
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      assertTrue(boolean0);
      assertEquals(3, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "MZm'd3f", 1, 1);
      String string0 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals(1, foreignKeyConstraint0.getUpdateRule());
      assertEquals("Restrict delete", string0);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "^l=.:{=.\"d(b_e\"", 1, 1);
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      assertTrue(boolean0);
      assertEquals(1, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "u", 1, 1);
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Restrict delete:\n Parent cannot be deleted if children exist", string0);
      
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "Restrict delete:\n Parent cannot be deleted if children exist", 1, 1);
      assertEquals(1, foreignKeyConstraint1.getUpdateRule());
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "mf=qK9`xSAF#?", 2, 2);
      foreignKeyConstraint0.isNullOnDelete();
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      SchemaMeta schemaMeta0 = null;
      try {
        schemaMeta0 = new SchemaMeta("", "0Q1A8(+S!yHg", "");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Meta directory \"\" must contain a file named \".meta.xml\"
         //
         verifyException("net.sourceforge.schemaspy.model.xml.SchemaMeta", e);
      }
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 3, 3);
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Restrict delete:\n Parent cannot be deleted if children exist", string0);
      
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "x+`4iQ8R_c", 1, 1);
      assertEquals(1, foreignKeyConstraint1.getUpdateRule());
  }

  /**
  //Test case number: 33
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LinkedList<TableColumn> linkedList0 = new LinkedList<TableColumn>();
      linkedList0.offerLast((TableColumn) null);
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "MZm'd3f", 1, 1);
      foreignKeyConstraint0.addParentColumn((TableColumn) null);
      assertEquals(1, foreignKeyConstraint0.getUpdateRule());
      assertTrue(foreignKeyConstraint0.isRestrictDelete());
  }

  /**
  //Test case number: 35
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      int int0 = (-1);
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "&", (-1), 0);
      foreignKeyConstraint0.getDeleteRuleDescription();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      SchemaMeta schemaMeta0 = null;
      try {
        schemaMeta0 = new SchemaMeta("Cascade on delete:\n Deletion of parent deletes child", "net.sourceforge.schemaspy.model.ForeignKeyConstraint", "net.sourceforge.schemaspy.model.ForeignKeyConstraint");
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
  //Test case number: 36
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "fL2 {$", 3, 3);
      String string0 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals("Restrict delete", string0);
      assertEquals(3, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 37
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "AND", 162, 3);
      String string0 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals("R", string0);
      assertEquals(162, foreignKeyConstraint0.getUpdateRule());
  }
}