/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 10:43:51 GMT 2018
 */

package net.sourceforge.squirrel_sql.plugins.dbcopy.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.gargoylesoftware.base.resource.jdbc.CallableStatementWrapper;
import com.gargoylesoftware.base.resource.jdbc.ConnectionWrapper;
import java.awt.datatransfer.StringSelection;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.TransferHandler;
import javax.swing.tree.DefaultTreeCellRenderer;
import net.sourceforge.squirrel_sql.client.IApplication;
import net.sourceforge.squirrel_sql.client.gui.db.SQLAlias;
import net.sourceforge.squirrel_sql.client.session.ISession;
import net.sourceforge.squirrel_sql.client.session.schemainfo.SchemaInfo;
import net.sourceforge.squirrel_sql.client.util.ApplicationFileWrappersImpl;
import net.sourceforge.squirrel_sql.fw.id.IntegerIdentifier;
import net.sourceforge.squirrel_sql.fw.id.UidIdentifier;
import net.sourceforge.squirrel_sql.fw.sql.DatabaseObjectInfo;
import net.sourceforge.squirrel_sql.fw.sql.DatabaseObjectType;
import net.sourceforge.squirrel_sql.fw.sql.ForeignKeyInfo;
import net.sourceforge.squirrel_sql.fw.sql.IDatabaseObjectInfo;
import net.sourceforge.squirrel_sql.fw.sql.ISQLConnection;
import net.sourceforge.squirrel_sql.fw.sql.ISQLDatabaseMetaData;
import net.sourceforge.squirrel_sql.fw.sql.ITableInfo;
import net.sourceforge.squirrel_sql.fw.sql.ProcedureInfo;
import net.sourceforge.squirrel_sql.fw.sql.ProgressCallBack;
import net.sourceforge.squirrel_sql.fw.sql.SQLConnection;
import net.sourceforge.squirrel_sql.fw.sql.SQLDatabaseMetaData;
import net.sourceforge.squirrel_sql.fw.sql.SQLDriver;
import net.sourceforge.squirrel_sql.fw.sql.SQLDriverPropertyCollection;
import net.sourceforge.squirrel_sql.fw.sql.TableColumnInfo;
import net.sourceforge.squirrel_sql.fw.sql.TableInfo;
import net.sourceforge.squirrel_sql.plugins.dbcopy.DBCopyPlugin;
import net.sourceforge.squirrel_sql.plugins.dbcopy.SessionInfoProvider;
import net.sourceforge.squirrel_sql.plugins.dbcopy.prefs.DBCopyPreferenceBean;
import net.sourceforge.squirrel_sql.plugins.dbcopy.util.DBUtil;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DBUtil_ESTest extends DBUtil_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = DBUtil.fixCase((ISession) null, (String) null);
      assertNull(string0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DBCopyPreferenceBean dBCopyPreferenceBean0 = new DBCopyPreferenceBean();
      DBUtil.setPreferences(dBCopyPreferenceBean0);
      ISession iSession0 = null;
      String string0 = "#D3/Ny";
      // Undeclared exception!
      try { 
        DBUtil.checkKeyword((ISession) null, "#D3/Ny", "#D3/Ny");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.squirrel_sql.plugins.dbcopy.util.DBUtil", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TableColumnInfo tableColumnInfo0 = new TableColumnInfo("|sXFIj4L~/", "DBUtil.mappingErrorKeyword", "|sXFIj4L~/", "", 969, "kSQ%9fumeh", 969, 969, (-1355), 814, "", "kSQ%9fumeh", 814, 0, "");
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      dBCopyPlugin0.getSourceSession();
      int int0 = DBUtil.replaceDistinctDataType(969, tableColumnInfo0, (ISession) null);
      assertEquals(969, int0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DBUtil.setLastStatementValues("Z");
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      String string0 = "sqlShareHistory";
      dBCopyPlugin0.getApplication();
      SchemaInfo schemaInfo0 = new SchemaInfo((IApplication) null);
      schemaInfo0.getSQLDatabaseMetaData();
      TableInfo tableInfo0 = null;
      try {
        tableInfo0 = new TableInfo("sqlShareHistory", "Z", "Z", "Z", "net.sourceforge.squirrel_sql.plugins.dbcopy.dbcopy", (ISQLDatabaseMetaData) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // SQLDatabaseMetaData == null
         //
         verifyException("net.sourceforge.squirrel_sql.fw.sql.DatabaseObjectInfo", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      dBCopyPlugin0.getSourceSession();
      String string0 = "Q:?m0R";
      int int0 = 0;
      // Undeclared exception!
      try { 
        DBUtil.getTableCount((ISession) null, "net.sourceforge.squirrel_sql.plugins.dbcopy.dbcopy", "Q:?m0R", (String) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.squirrel_sql.plugins.dbcopy.util.DBUtil", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DBUtil.typesAreEquivalent(365, (-159));
      String string0 = "";
      String string1 = "";
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      dBCopyPlugin0.getDestSession();
      dBCopyPlugin0.setDestSession((ISession) null);
      dBCopyPlugin0.setPasteToTableName("executeQuery: TimesTen allows a maximum fetch size of 128.  Altering preferred fetch size from ");
      // Undeclared exception!
      try { 
        DBUtil.dropTable("", (String) null, "", (ISession) null, false, (-159));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.squirrel_sql.plugins.dbcopy.util.DBUtil", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DBUtil dBUtil0 = new DBUtil();
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      dBCopyPlugin0.getSourceSession();
      // Undeclared exception!
      try { 
        DBUtil.getCatSep((ISession) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.squirrel_sql.plugins.dbcopy.util.DBUtil", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DBCopyPreferenceBean dBCopyPreferenceBean0 = new DBCopyPreferenceBean();
      dBCopyPreferenceBean0.setTestColumnNames(false);
      dBCopyPreferenceBean0.setCommitAfterTableDefs(false);
      dBCopyPreferenceBean0.setSelectFetchSize(128);
      DBUtil.setPreferences(dBCopyPreferenceBean0);
      TableColumnInfo tableColumnInfo0 = new TableColumnInfo("", ":0<%iM", "D", "D", 2176, "D", (-2), (-4), (-107), 0, "Column", "uU}*DN:8,bERsXWEIog", (-393), 365, "Wui0qZ''");
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      dBCopyPlugin0.getDestSession();
      DBUtil.replaceOtherDataType(tableColumnInfo0, (ISession) null);
      // Undeclared exception!
      try { 
        DBUtil.getQualifiedObjectName((ISession) null, "uU}*DN:8,bERsXWEIog", (String) null, ":0<%iM", 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.squirrel_sql.plugins.dbcopy.util.DBUtil", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      TableColumnInfo tableColumnInfo0 = null;
      ISession iSession0 = null;
      DBUtil.setLastStatement("uizt[!");
      // Undeclared exception!
      try { 
        DBUtil.getMaxColumnLengthSQL((ISession) null, (TableColumnInfo) null, "; ", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.squirrel_sql.plugins.dbcopy.util.DBUtil", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      ArrayList<IDatabaseObjectInfo> arrayList0 = new ArrayList<IDatabaseObjectInfo>();
      DBUtil.convertObjectToTableList(arrayList0);
      dBCopyPlugin0.getDestSession();
      String string0 = "^r1~6bE:g;H bhw\"\"O#";
      String string1 = null;
      String string2 = "";
      TableColumnInfo tableColumnInfo0 = new TableColumnInfo("Skipping FK (", "", "`LHCU:X.", (String) null, 2001, "Skipping FK (", 38, 38, 8, 128, "", "^r1~6bE:g;H bhw\"\"O#", 0, (-1624), (String) null);
      DBCopyPlugin dBCopyPlugin1 = new DBCopyPlugin();
      dBCopyPlugin1.getDestSession();
      // Undeclared exception!
      try { 
        DBUtil.replaceDistinctDataType(2001, tableColumnInfo0, (ISession) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.squirrel_sql.plugins.dbcopy.util.DBUtil", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DBUtil.typesAreEquivalent(0, 0);
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      dBCopyPlugin0.getDestSession();
      DBUtil.fixCase((ISession) null, "");
      // Undeclared exception!
      try { 
        DBUtil.checkKeyword((ISession) null, "", "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.squirrel_sql.plugins.dbcopy.util.DBUtil", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DBUtil.typesAreEquivalent(0, 0);
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      dBCopyPlugin0.getDestSession();
      // Undeclared exception!
      try { 
        DBUtil.fixCase((ISession) null, "net.sourceforge.squirrel_sql.plugins.dbcopy.dbcopy");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.squirrel_sql.plugins.dbcopy.util.DBUtil", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DBUtil dBUtil0 = new DBUtil();
      LinkedList<ITableInfo> linkedList0 = new LinkedList<ITableInfo>();
      List<IDatabaseObjectInfo> list0 = DBUtil.convertTableToObjectList(linkedList0);
      assertTrue(list0.isEmpty());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DatabaseObjectInfo databaseObjectInfo0 = new DatabaseObjectInfo("D.f,qTikG%", "D.f,qTikG%", "D.f,qTikG%");
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      dBCopyPlugin0.getApplication();
      SchemaInfo schemaInfo0 = new SchemaInfo((IApplication) null);
      // Undeclared exception!
      try { 
        DBUtil.getSchemaFromDbObject(databaseObjectInfo0, schemaInfo0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // SQLDatabaseMetaData == null
         //
         verifyException("net.sourceforge.squirrel_sql.fw.sql.DatabaseObjectInfo", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.getQualifiedObjectName((ISession) null, "Null 'array' argument.", "Null 'array' argument.", "f[pfbL&TYU1", 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.squirrel_sql.plugins.dbcopy.util.DBUtil", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DBUtil.getLastStatement();
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      doReturn((CallableStatement) null).when(connection0).prepareCall(anyString() , anyInt() , anyInt());
      ConnectionWrapper connectionWrapper0 = new ConnectionWrapper(connection0);
      String string0 = "+r}!km\"1h(#Q67m))";
      // Undeclared exception!
      try { 
        connectionWrapper0.prepareCall("+r}!km\"1h(#Q67m))", (-4), (-4));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // statement
         //
         verifyException("com.gargoylesoftware.base.resource.jdbc.StatementWrapper", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      boolean boolean0 = DBUtil.typesAreEquivalent(8, 8);
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      DBCopyPlugin dBCopyPlugin1 = new DBCopyPlugin();
      dBCopyPlugin1.getSourceSession();
      dBCopyPlugin1.getSourceSession();
      TableColumnInfo tableColumnInfo0 = new TableColumnInfo("net.sourceforge.squirrel_sql.plugins.dbcopy.dbcopy", "KHYo,<p[$ZIKv8kyx;", "m:%", (String) null, 8, "F}", 2003, (-3308), 2003, 8, ";", "net.sourceforge.squirrel_sql.plugins.dbcopy.dbcopy", 2467, 2467, (String) null);
      boolean boolean1 = DBUtil.isBinaryType(tableColumnInfo0);
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DBCopyPreferenceBean dBCopyPreferenceBean0 = new DBCopyPreferenceBean();
      dBCopyPreferenceBean0.setSelectFetchSize(32739);
      DBUtil.setPreferences(dBCopyPreferenceBean0);
      TableColumnInfo tableColumnInfo0 = new TableColumnInfo(":0<%iM", "net.sourceforge.squirrel_sql.plugins.dbcopy.dbcopy", "clob", "", 365, "clob", (-393), 365, 365, 0, "", ":0<%iM", 32739, 30, "0");
      LinkedList<IDatabaseObjectInfo> linkedList0 = new LinkedList<IDatabaseObjectInfo>();
      DBUtil.getSchemaNameFromDbObject(tableColumnInfo0);
      List<ITableInfo> list0 = DBUtil.convertObjectToTableList(linkedList0);
      assertTrue(list0.isEmpty());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = "Null 'array' argument.";
      String string1 = "pX6sp~$Ta5!";
      DatabaseObjectInfo databaseObjectInfo0 = new DatabaseObjectInfo("Null 'array' argument.", "Null 'array' argument.", "pX6sp~$Ta5!");
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      DatabaseObjectType databaseObjectType0 = DatabaseObjectType.SCHEMA;
      DefaultTreeCellRenderer defaultTreeCellRenderer0 = new DefaultTreeCellRenderer();
      Icon icon0 = defaultTreeCellRenderer0.getDefaultLeafIcon();
      DatabaseObjectType.createNewDatabaseObjectType("+r}!km\"1h(#Q67m))", icon0);
      ImageIcon imageIcon0 = new ImageIcon();
      DatabaseObjectType.createNewDatabaseObjectType((String) null, (Icon) imageIcon0);
      DatabaseObjectType.createNewDatabaseObjectType("Null 'array' argument.");
      databaseObjectInfo0.replaceDatabaseObjectTypeConstantObjectsByConstantObjectsOfThisVM(databaseObjectType0);
      dBCopyPlugin0.getApplication();
      SchemaInfo schemaInfo0 = new SchemaInfo((IApplication) null);
      DBUtil.getSchemaFromDbObject(databaseObjectInfo0, schemaInfo0);
      dBCopyPlugin0.getSourceSession();
      // Undeclared exception!
      try { 
        DBUtil.sameDatabaseType((ISession) null, (ISession) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.squirrel_sql.plugins.dbcopy.util.DBUtil", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DBUtil.typesAreEquivalent(8, 8);
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      DBCopyPlugin dBCopyPlugin1 = new DBCopyPlugin();
      dBCopyPlugin1.getSourceSession();
      dBCopyPlugin1.getSourceSession();
      TableColumnInfo tableColumnInfo0 = new TableColumnInfo("KHYo,<p[$ZIKv8kyx;", "z:?VWFlYGo", "repeat", "KHYo,<p[$ZIKv8kyx;", 8, "Z_,]8]]|DC^k\"&xU~ZM", 8, (-3308), 2006, 3043, "K#){ge:?", "DELETE FROM ", (-3308), 2003, "Z_,]8]]|DC^k\"&xU~ZM");
      LinkedList<IDatabaseObjectInfo> linkedList0 = new LinkedList<IDatabaseObjectInfo>();
      linkedList0.add((IDatabaseObjectInfo) tableColumnInfo0);
      DBUtil.getSchemaNameFromDbObject(tableColumnInfo0);
      // Undeclared exception!
      try { 
        DBUtil.convertObjectToTableList(linkedList0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // net.sourceforge.squirrel_sql.fw.sql.TableColumnInfo cannot be cast to net.sourceforge.squirrel_sql.fw.sql.ITableInfo
         //
         verifyException("net.sourceforge.squirrel_sql.plugins.dbcopy.util.DBUtil", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DBUtil dBUtil0 = new DBUtil();
      LinkedList<ITableInfo> linkedList0 = new LinkedList<ITableInfo>();
      TableColumnInfo tableColumnInfo0 = new TableColumnInfo((String) null, (String) null, (String) null, "Null 'array' argument.", 2467, (String) null, 2467, 2467, (-1569), (-1569), (String) null, "datename", (-2921), (-1363), "ZzL1R#*)glg");
      DBUtil.isBinaryType(tableColumnInfo0);
      TableColumnInfo[] tableColumnInfoArray0 = new TableColumnInfo[2];
      tableColumnInfoArray0[0] = tableColumnInfo0;
      tableColumnInfoArray0[1] = tableColumnInfo0;
      DBUtil.getColumnList(tableColumnInfoArray0);
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      dBCopyPlugin0.getDestSession();
      // Undeclared exception!
      try { 
        DBUtil.deleteDataInExistingTable((ISession) null, "PEc^QBS7U$$i;AA]]x", "xCNCDT` Gzt$A!J7&T", "xCNCDT` Gzt$A!J7&T");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.squirrel_sql.plugins.dbcopy.util.DBUtil", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LinkedList<ITableInfo> linkedList0 = new LinkedList<ITableInfo>();
      TableColumnInfo tableColumnInfo0 = new TableColumnInfo(" tableName=", "net.sourceforge.squirrel_sql.plugins.dbcopy.dbcopy", ";", "net.sourceforge.squirrel_sql.plugins.dbcopy.dbcopy", 2610, "d)k~W3", 110, 60, (-1251), 2610, (String) null, "net.sourceforge.squirrel_sql.plugins.dbcopy.dbcopy", (-691), (-1033), "catalog=");
      LinkedList<IDatabaseObjectInfo> linkedList1 = new LinkedList<IDatabaseObjectInfo>();
      DatabaseObjectInfo databaseObjectInfo0 = new DatabaseObjectInfo("net.sourceforge.squirrel_sql.plugins.dbcopy.dbcopy", "                                ", "7>sj/s.h");
      DatabaseObjectType databaseObjectType0 = DatabaseObjectType.SCHEMA;
      databaseObjectInfo0.replaceDatabaseObjectTypeConstantObjectsByConstantObjectsOfThisVM(databaseObjectType0);
      DBUtil.getSchemaNameFromDbObject(databaseObjectInfo0);
      DBUtil.convertObjectToTableList(linkedList1);
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      dBCopyPlugin0.getDestSession();
      // Undeclared exception!
      try { 
        DBUtil.getQualifiedObjectName((ISession) null, "PEc^QBS7U$$i;AA]]x", "net.sourceforge.squirrel_sql.plugins.dbcopy.dbcopy", "HqX~rB-[e*a+zX/,VON", 60);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.squirrel_sql.plugins.dbcopy.util.DBUtil", e);
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      ArrayList<IDatabaseObjectInfo> arrayList0 = new ArrayList<IDatabaseObjectInfo>();
      dBCopyPlugin0.getDestDatabaseObject();
      arrayList0.add((IDatabaseObjectInfo) null);
      dBCopyPlugin0.setPasteToTableName("");
      DBUtil.convertObjectToTableList(arrayList0);
      dBCopyPlugin0.getDestSession();
      IDatabaseObjectInfo[] iDatabaseObjectInfoArray0 = new IDatabaseObjectInfo[2];
      iDatabaseObjectInfoArray0[0] = null;
      iDatabaseObjectInfoArray0[1] = null;
      DBUtil.convertObjectArrayToTableList(iDatabaseObjectInfoArray0);
      // Undeclared exception!
      try { 
        DBUtil.getTableInfo((ISession) null, "wqp_Ny]g:'mV", "H");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.squirrel_sql.plugins.dbcopy.util.DBUtil", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      UidIdentifier uidIdentifier0 = new UidIdentifier();
      SQLAlias sQLAlias0 = new SQLAlias(uidIdentifier0);
      SQLDriver sQLDriver0 = new SQLDriver(uidIdentifier0);
      boolean boolean0 = false;
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      int int0 = 1003;
      // Undeclared exception!
      try { 
        DBUtil.getInsertSQL(dBCopyPlugin0, "net.sourceforge.squirrel_sql.plugins.dbcopy.dbcopy", (ITableInfo) null, 1003);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.squirrel_sql.plugins.dbcopy.util.DBUtil", e);
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TableColumnInfo tableColumnInfo0 = new TableColumnInfo("ZWzL1R#*)glg", (String) null, "A connection must be supplied.", "2SkOk_7F~qy&", (-3), (String) null, 40000, (-3), 16, (-790), "ZWzL1R#*)glg", "!/", 16, (-1450), "F^ep(ZLE^_");
      boolean boolean0 = DBUtil.isBinaryType(tableColumnInfo0);
      assertTrue(boolean0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      ArrayList<IDatabaseObjectInfo> arrayList0 = new ArrayList<IDatabaseObjectInfo>();
      dBCopyPlugin0.getDestDatabaseObject();
      arrayList0.add((IDatabaseObjectInfo) null);
      dBCopyPlugin0.setPasteToTableName("");
      List<ITableInfo> list0 = DBUtil.convertObjectToTableList(arrayList0);
      dBCopyPlugin0.getDestSession();
      LinkedList<IDatabaseObjectInfo> linkedList0 = new LinkedList<IDatabaseObjectInfo>();
      Stack<ITableInfo> stack0 = new Stack<ITableInfo>();
      List<IDatabaseObjectInfo> list1 = DBUtil.convertTableToObjectList(list0);
      assertEquals(1, list1.size());
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TableColumnInfo tableColumnInfo0 = new TableColumnInfo((String) null, "N6)ymf0", (String) null, (String) null, 1234, "b*:$!&m-wU>vZjb)a", 1234, (-558), 1234, (-2082408383), "b*:$!&m-wU>vZjb)a", "net.sourceforge.squirrel_sql.fw.gui.GUIUtils", (-2082408383), (-558), "H2C&C0'<sU");
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      dBCopyPlugin0.getDestSession();
      DBUtil.replaceOtherDataType(tableColumnInfo0, (ISession) null);
      DBUtil.validateColumnNames((ITableInfo) null, dBCopyPlugin0);
      assertEquals("1.15", dBCopyPlugin0.getVersion());
  }

  /**
  //Test case number: 27
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DBUtil.typesAreEquivalent(2, 49);
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      DBCopyPlugin dBCopyPlugin1 = new DBCopyPlugin();
      dBCopyPlugin0.getSourceSession();
      ISession iSession0 = dBCopyPlugin1.getSourceSession();
      assertNull(iSession0);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      TableColumnInfo tableColumnInfo0 = new TableColumnInfo((String) null, ";", (String) null, ";", 0, (String) null, 0, 0, 181, 2715, "~Y+", ";", 1369, 0, ";");
      DatabaseObjectType databaseObjectType0 = DatabaseObjectType.SCHEMA;
      tableColumnInfo0.replaceDatabaseObjectTypeConstantObjectsByConstantObjectsOfThisVM(databaseObjectType0);
      tableColumnInfo0.replaceDatabaseObjectTypeConstantObjectsByConstantObjectsOfThisVM(databaseObjectType0);
      DBUtil.isBinaryType(tableColumnInfo0);
      DBUtil.typesAreEquivalent((-1403), 204);
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      // Undeclared exception!
      try { 
        DBUtil.getSelectQuery(dBCopyPlugin0, "wqp_Ny]g:'mV", (ITableInfo) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.squirrel_sql.plugins.dbcopy.util.DBUtil", e);
      }
  }

  /**
  //Test case number: 29
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      int int0 = 96;
      // Undeclared exception!
      try { 
        DBUtil.getColumnName((ISQLConnection) null, (ITableInfo) null, 96);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.squirrel_sql.plugins.dbcopy.util.DBUtil", e);
      }
  }

  /**
  //Test case number: 30
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      boolean boolean0 = DBUtil.typesAreEquivalent((-7), (-7));
      assertTrue(boolean0);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "fT");
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      dBCopyPlugin0.unload();
      dBCopyPlugin0.getPasteToTableInfo((ISQLConnection) null, " class loader.", "isG[nj");
      dBCopyPlugin0.unload();
      // Undeclared exception!
      try { 
        DBUtil.getColumnType((ISQLConnection) null, (ITableInfo) null, 2005);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.squirrel_sql.plugins.dbcopy.util.DBUtil", e);
      }
  }

  /**
  //Test case number: 32
  /*Coverage entropy=0.5004024235381879
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DBUtil.typesAreEquivalent(16, 16);
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      dBCopyPlugin0.getDestSession();
      // Undeclared exception!
      try { 
        DBUtil.getTableInfo((ISession) null, "DBUtil.error.bindclobfailure", "abP");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.squirrel_sql.plugins.dbcopy.util.DBUtil", e);
      }
  }

  /**
  //Test case number: 33
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      boolean boolean0 = DBUtil.typesAreEquivalent(3, 1127);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 34
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ITableInfo iTableInfo0 = null;
      DBUtil.validateColumnNames((ITableInfo) null, (SessionInfoProvider) null);
      // Undeclared exception!
      try { 
        DBUtil.getCreateTableSql((SessionInfoProvider) null, (ITableInfo) null, "              t           Y     ", "sv&&D,\"Lsz>b", "sv&&D,\"Lsz>b");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.squirrel_sql.plugins.dbcopy.util.DBUtil", e);
      }
  }

  /**
  //Test case number: 35
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ArrayList<ITableInfo> arrayList0 = new ArrayList<ITableInfo>();
      arrayList0.listIterator();
      TableColumnInfo tableColumnInfo0 = new TableColumnInfo(". Using 'length'", "(", (String) null, (String) null, 1111, ".", 5, 1111, 214, (-2002), ";>5WBs%H8Kj|N", "->F((J^rWV", 1111, (-2002), ".");
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      dBCopyPlugin0.getDestSession();
      DBUtil.replaceOtherDataType(tableColumnInfo0, (ISession) null);
      DBCopyPlugin dBCopyPlugin1 = new DBCopyPlugin();
      DBCopyPlugin dBCopyPlugin2 = new DBCopyPlugin();
      DBCopyPlugin dBCopyPlugin3 = new DBCopyPlugin();
      dBCopyPlugin3.getDestSession();
      int int0 = (-2);
      DBCopyPlugin dBCopyPlugin4 = new DBCopyPlugin();
      dBCopyPlugin4.getApplication();
      SchemaInfo schemaInfo0 = new SchemaInfo((IApplication) null);
      schemaInfo0.getSQLDatabaseMetaData();
      TableColumnInfo tableColumnInfo1 = null;
      try {
        tableColumnInfo1 = new TableColumnInfo("'", ";>5WBs%H8Kj|N", "->F((J^rWV", "aq)c(nC&{L9<", (-69), "DBUtil.error.bindclobfailure", 1111, 45, (-2002), (-5695), "'", "T", 91, 91, "7b ", (ISQLDatabaseMetaData) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // SQLDatabaseMetaData == null
         //
         verifyException("net.sourceforge.squirrel_sql.fw.sql.DatabaseObjectInfo", e);
      }
  }

  /**
  //Test case number: 36
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DBUtil.typesAreEquivalent((-4), (-4));
      TableColumnInfo tableColumnInfo0 = new TableColumnInfo((String) null, "Max function is null for dialect=", (String) null, (String) null, (-4), "null SQLConnection passed", 81, 81, 81, (-162), (String) null, "{91}s3l1!8OK-X", (-162), (-329), "Max function is null for dialect=");
      DBUtil.isBinaryType(tableColumnInfo0);
      System.setCurrentTimeMillis(0L);
  }

  /**
  //Test case number: 37
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ISQLConnection iSQLConnection0 = null;
      ITableInfo iTableInfo0 = null;
      // Undeclared exception!
      try { 
        DBUtil.getColumnCount((ISQLConnection) null, (ITableInfo) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.squirrel_sql.plugins.dbcopy.util.DBUtil", e);
      }
  }

  /**
  //Test case number: 38
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      TableColumnInfo tableColumnInfo0 = new TableColumnInfo("*#X>&2[.Zm:", "                               ", (String) null, "                               ", (-2), "                                ", 2174, (-2), (-2), (-2), "", (String) null, 2174, 2174, "*#X>&2[.Zm:");
      DBUtil.isBinaryType(tableColumnInfo0);
      System.setCurrentTimeMillis((-1L));
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      dBCopyPlugin0.getSourceSession();
      // Undeclared exception!
      try { 
        DBUtil.getTables((ISession) null, "                                ", (String) null, "net.sourceforge.squirrel_sql.plugins.dbcopy.dbcopy");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.squirrel_sql.plugins.dbcopy.util.DBUtil", e);
      }
  }
}
