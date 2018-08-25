/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 11:53:24 GMT 2018
 */

package net.sourceforge.squirrel_sql.plugins.dbcopy.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.gargoylesoftware.base.resource.jdbc.CallableStatementWrapper;
import com.gargoylesoftware.base.resource.jdbc.ConnectionWrapper;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import javax.swing.Icon;
import javax.swing.ImageIcon;
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
import net.sourceforge.squirrel_sql.fw.sql.ISQLDriver;
import net.sourceforge.squirrel_sql.fw.sql.ITableInfo;
import net.sourceforge.squirrel_sql.fw.sql.IndexInfo;
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
      String string0 = DBUtil.getLastStatementValues();
      assertNull(string0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = (-680);
      String string0 = "}4@LnV>(";
      int int1 = 1863;
      TableColumnInfo tableColumnInfo0 = new TableColumnInfo("Wf}vWCW#Wd", (String) null, "Wf}vWCW#Wd", (String) null, 268, "BX(1p1'+?f", 268, 268, (-680), (-680), "BX(1p1'+?f", "}4@LnV>(", 1863, (-1914), "}4@LnV>(");
      DBUtil.isBinaryType(tableColumnInfo0);
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      dBCopyPlugin0.getDestSession();
      // Undeclared exception!
      try { 
        dBCopyPlugin0.sessionEnding((ISession) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.squirrel_sql.plugins.dbcopy.DBCopyPlugin", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      dBCopyPlugin0.getDestSession();
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
  //Test case number: 3
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = "";
      DBUtil.setLastStatementValues("");
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      doReturn((CallableStatement) null).when(connection0).prepareCall(anyString());
      ConnectionWrapper connectionWrapper0 = new ConnectionWrapper(connection0);
      String string1 = "xu58hMaS? #H";
      // Undeclared exception!
      try { 
        connectionWrapper0.prepareCall("xu58hMaS? #H");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // statement
         //
         verifyException("com.gargoylesoftware.base.resource.jdbc.StatementWrapper", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DBCopyPreferenceBean dBCopyPreferenceBean0 = new DBCopyPreferenceBean();
      dBCopyPreferenceBean0.setAutoCommitEnabled(true);
      DBUtil.setPreferences(dBCopyPreferenceBean0);
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      doReturn((CallableStatement) null).when(connection0).prepareCall(anyString());
      ConnectionWrapper connectionWrapper0 = new ConnectionWrapper(connection0);
      String string0 = "SELECT data_type FROM information_schema.columns where column_name = ? ";
      // Undeclared exception!
      try { 
        connectionWrapper0.prepareCall("SELECT data_type FROM information_schema.columns where column_name = ? ");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // statement
         //
         verifyException("com.gargoylesoftware.base.resource.jdbc.StatementWrapper", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      dBCopyPlugin0.getDestSession();
      String string0 = "";
      int int0 = 57;
      ApplicationFileWrappersImpl applicationFileWrappersImpl0 = new ApplicationFileWrappersImpl();
      dBCopyPlugin0.setApplicationFiles(applicationFileWrappersImpl0);
      // Undeclared exception!
      try { 
        DBUtil.getTableCount((ISession) null, "", "", "", 57);
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
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      dBCopyPlugin0.getWebSite();
      dBCopyPlugin0.getSourceSession();
      // Undeclared exception!
      try { 
        DBUtil.getTables((ISession) null, "ubXTx\"qq]F)K", "net.sourceforge.squirrel_sql.plugins.dbcopy.dbcopy", "");
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TableColumnInfo tableColumnInfo0 = new TableColumnInfo((String) null, (String) null, "}UjTY", "O-|z<68(g$+IXUG;", (-1941), "", (-1941), (-3188), (-903), 1231, "org.jfree.data.gantt.Task", "OW", 16, (-3189), (String) null);
      DBUtil.setLastStatement("OW");
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      dBCopyPlugin0.getPasteToTableInfo((ISQLConnection) null, (String) null, (String) null);
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
  //Test case number: 8
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = DBUtil.getLastStatement();
      assertNull(string0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int int0 = 582;
      int int1 = (-911);
      DBUtil.typesAreEquivalent(582, (-911));
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      dBCopyPlugin0.getSourceSession();
      // Undeclared exception!
      try { 
        DBUtil.getQualifiedObjectName((ISession) null, "y|B/", "TLDjWrU13", "max", 2680);
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
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DBUtil dBUtil0 = new DBUtil();
      assertNull(dBUtil0.getLastStatementValues());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      FileSystemHandling.shouldAllThrowIOExceptions();
      dBCopyPlugin0.getDestSession();
      PriorityBlockingQueue<TableColumnInfo> priorityBlockingQueue0 = new PriorityBlockingQueue<TableColumnInfo>();
      LinkedList<IDatabaseObjectInfo> linkedList0 = new LinkedList<IDatabaseObjectInfo>(priorityBlockingQueue0);
      DBUtil.convertObjectToTableList(linkedList0);
      // Undeclared exception!
      try { 
        DBUtil.executeQuery((ISession) null, "net.sourceforge.squirrel_sql.plugins.dbcopy.dbcopy");
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
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      dBCopyPlugin0.getSourceSession();
      SQLDriverPropertyCollection sQLDriverPropertyCollection0 = new SQLDriverPropertyCollection();
      SQLDriver sQLDriver0 = new SQLDriver();
      String string0 = null;
      DBUtil.fixCase((ISession) null, (String) null);
      int int0 = 1826;
      String string1 = "net.sourceforge.squirrel_sql.plugins.dbcopy.dbcopy";
      String string2 = "This database dialect doesn't support adding comments to columns";
      String string3 = "r&Y0\"IyEmlTU?jD";
      int int1 = (-545);
      int int2 = (-82);
      String string4 = "n)";
      SQLConnection sQLConnection0 = null;
      try {
        sQLConnection0 = new SQLConnection((Connection) null, sQLDriverPropertyCollection0, sQLDriver0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // SQLConnection == null
         //
         verifyException("net.sourceforge.squirrel_sql.fw.sql.SQLConnection", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      dBCopyPlugin0.getSourceSession();
      TableColumnInfo tableColumnInfo0 = new TableColumnInfo("I[uV{~r,vu_=", "net.sourceforge.squirrel_sql.plugins.dbcopy.dbcopy", "1", "This database dialect doesn't support adding comments to columns", 8, "fixCase: unexpected exception: ", 274, 8, 8, 8, "swing.defaultlaf", "1", 1111, 8, "");
      DBCopyPlugin dBCopyPlugin1 = new DBCopyPlugin();
      DatabaseObjectType databaseObjectType0 = DatabaseObjectType.DATABASE_TYPE_DBO;
      ImageIcon imageIcon0 = new ImageIcon();
      DatabaseObjectType.createNewDatabaseObjectType("1", (Icon) imageIcon0);
      tableColumnInfo0.replaceDatabaseObjectTypeConstantObjectsByConstantObjectsOfThisVM(databaseObjectType0);
      String string0 = DBUtil.fixCase((ISession) null, "");
      assertEquals("", string0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = "*WRq";
      TableColumnInfo tableColumnInfo0 = new TableColumnInfo("`\"]", "`\"]", "`\"]", "This database dialect doesn't support adding comments to columns", 2, "This database dialect doesn't support adding comments to columns", 225, 2, (-2114445435), 1111, "`\"]", "*WRq", 684, 2, "`\"]");
      DatabaseObjectType databaseObjectType0 = DatabaseObjectType.TRIGGER;
      tableColumnInfo0.replaceDatabaseObjectTypeConstantObjectsByConstantObjectsOfThisVM(databaseObjectType0);
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      dBCopyPlugin0.getDestSession();
      DBUtil.replaceDistinctDataType(225, tableColumnInfo0, (ISession) null);
      // Undeclared exception!
      try { 
        DBUtil.convertTableToObjectList((List<ITableInfo>) null);
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
  /*Coverage entropy=0.5004024235381879
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = "-@)%l=y|";
      String string1 = "5";
      String string2 = "";
      TableColumnInfo tableColumnInfo0 = new TableColumnInfo("-@)%l=y|", "%upper", "5", "", 14, "", 2569, 2569, 14, 2569, "from sys.SYSVIEWS v, sys.SYSTABLES t, sys.SYSSCHEMAS s ", "y5ux5[S&UqsS", (-1994091956), 513, "g");
      TableColumnInfo[] tableColumnInfoArray0 = new TableColumnInfo[7];
      DatabaseObjectType databaseObjectType0 = DatabaseObjectType.OTHER;
      tableColumnInfo0.replaceDatabaseObjectTypeConstantObjectsByConstantObjectsOfThisVM(databaseObjectType0);
      tableColumnInfoArray0[0] = tableColumnInfo0;
      tableColumnInfoArray0[1] = tableColumnInfo0;
      tableColumnInfoArray0[2] = tableColumnInfo0;
      tableColumnInfoArray0[3] = tableColumnInfo0;
      tableColumnInfoArray0[4] = tableColumnInfo0;
      tableColumnInfoArray0[5] = tableColumnInfo0;
      tableColumnInfoArray0[6] = tableColumnInfo0;
      DBUtil.getColumnList(tableColumnInfoArray0);
      SchemaInfo schemaInfo0 = new SchemaInfo((IApplication) null);
      // Undeclared exception!
      try { 
        DBUtil.getSchemaFromDbObject(tableColumnInfo0, schemaInfo0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // SQLDatabaseMetaData == null
         //
         verifyException("net.sourceforge.squirrel_sql.fw.sql.DatabaseObjectInfo", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      DatabaseObjectInfo databaseObjectInfo0 = new DatabaseObjectInfo("net.sourceforge.squirrel_sql.plugins.dbcopy.dbcopy", "net.sourceforge.squirrel_sql.plugins.dbcopy.dbcopy", "net.sourceforge.squirrel_sql.plugins.dbcopy.dbcopy");
      DBUtil.getSchemaNameFromDbObject(databaseObjectInfo0);
      dBCopyPlugin0.getSourceSession();
      IntegerIdentifier integerIdentifier0 = new IntegerIdentifier((-472));
      DBCopyPlugin dBCopyPlugin1 = new DBCopyPlugin();
      // Undeclared exception!
      try { 
        DBUtil.tableHasForeignKey("wtx*}\"$tU8+>N}MDo", "net.sourceforge.squirrel_sql.plugins.dbcopy.dbcopy", "net.sourceforge.squirrel_sql.plugins.dbcopy.dbcopy", (ForeignKeyInfo) null, dBCopyPlugin0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.squirrel_sql.plugins.dbcopy.util.DBUtil", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      TableColumnInfo tableColumnInfo0 = new TableColumnInfo("This database dialect doesn't support adding comments to columns", "2a{R\".Ad*", "RT\u0005P1BF`", "RT\u0005P1BF`", 1111, "This database dialect doesn't support adding comments to columns", 2003, 57, (-2381), (-2403), "CREATE TABLE ", "CREATE TABLE ", (-2381), 1111, (String) null);
      DBCopyPlugin dBCopyPlugin1 = new DBCopyPlugin();
      dBCopyPlugin1.getDestSession();
      DBUtil.replaceDistinctDataType(2003, tableColumnInfo0, (ISession) null);
      SQLDriverPropertyCollection sQLDriverPropertyCollection0 = new SQLDriverPropertyCollection();
      UidIdentifier uidIdentifier0 = new UidIdentifier();
      SQLDriver sQLDriver0 = new SQLDriver(uidIdentifier0);
      assertEquals("-a0cd474:1656bbeb5e0:-7ef0", uidIdentifier0.toString());
      
      ArrayList<ITableInfo> arrayList0 = new ArrayList<ITableInfo>();
      FileSystemHandling.shouldAllThrowIOExceptions();
      int int0 = DBUtil.replaceOtherDataType(tableColumnInfo0, (ISession) null);
      assertEquals(1111, int0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ArrayList<ITableInfo> arrayList0 = new ArrayList<ITableInfo>();
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      TableColumnInfo tableColumnInfo0 = new TableColumnInfo("1", "`g|1me#[^.I',?L^~*", "`g|1me#[^.I',?L^~*", "~*]NSRB!_", 2004, "`g|1me#[^.I',?L^~*", 2004, 2004, 2004, (-4), "~*]NSRB!_", (String) null, (-4), (-7), "-11-");
      boolean boolean0 = DBUtil.isBinaryType(tableColumnInfo0);
      assertTrue(boolean0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      dBCopyPlugin0.getSourceSession();
      // Undeclared exception!
      try { 
        DBUtil.getTableCount((ISession) null, "net.sourceforge.squirrel_sql.plugins.dbcopy.dbcopy", "net.sourceforge.squirrel_sql.plugins.dbcopy.dbcopy", "net.sourceforge.squirrel_sql.plugins.dbcopy.dbcopy", 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.squirrel_sql.plugins.dbcopy.util.DBUtil", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = "DBUtil.info.bindclobfile";
      TableColumnInfo tableColumnInfo0 = new TableColumnInfo("DBUtil.info.bindclobfile", ",6C6", ",6C6", ",6C6", 0, ",6C6", (-2692), (-2692), 0, 0, " as ", ",6C6", (-2040), 0, "%upper");
      DatabaseObjectType databaseObjectType0 = DatabaseObjectType.PROC_TYPE_DBO;
      DatabaseObjectType.createNewDatabaseObjectType(". Using 'max'", (Icon) null);
      tableColumnInfo0.replaceDatabaseObjectTypeConstantObjectsByConstantObjectsOfThisVM(databaseObjectType0);
      tableColumnInfo0.replaceDatabaseObjectTypeConstantObjectsByConstantObjectsOfThisVM(databaseObjectType0);
      tableColumnInfo0.replaceDatabaseObjectTypeConstantObjectsByConstantObjectsOfThisVM(databaseObjectType0);
      SchemaInfo schemaInfo0 = new SchemaInfo((IApplication) null);
      ITableInfo iTableInfo0 = null;
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      DBUtil.validateColumnNames((ITableInfo) null, dBCopyPlugin0);
      ApplicationFileWrappersImpl applicationFileWrappersImpl0 = new ApplicationFileWrappersImpl();
      dBCopyPlugin0.setApplicationFiles(applicationFileWrappersImpl0);
      dBCopyPlugin0.getSourceSession();
      dBCopyPlugin0.getDestSession();
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
  //Test case number: 21
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      dBCopyPlugin0.getPasteToTableInfo((ISQLConnection) null, "T f*^8~", "T f*^8~");
      TableColumnInfo tableColumnInfo0 = new TableColumnInfo("java.sql.Blob", (String) null, "T f*^8~", "", 2003, (String) null, 2003, (-4), 2001, 3483, "|jd>@p8W3 ?a=oaQ6R)", "|jd>@p8W3 ?a=oaQ6R)", 3483, 2, "");
      dBCopyPlugin0.getDestSession();
      DBUtil.replaceDistinctDataType(2, tableColumnInfo0, (ISession) null);
      SQLDriverPropertyCollection sQLDriverPropertyCollection0 = new SQLDriverPropertyCollection();
      UidIdentifier uidIdentifier0 = new UidIdentifier();
      SQLDriver sQLDriver0 = new SQLDriver(uidIdentifier0);
      ArrayList<ITableInfo> arrayList0 = new ArrayList<ITableInfo>();
      FileSystemHandling.shouldAllThrowIOExceptions();
      DBUtil.replaceOtherDataType(tableColumnInfo0, (ISession) null);
      // Undeclared exception!
      try { 
        DBUtil.getColumnType((ISQLConnection) null, (ITableInfo) null, 2001);
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
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      TableColumnInfo tableColumnInfo0 = new TableColumnInfo("net.sourceforge.squirrel_sql.client", "ag:QX^S-%Nl)58qKP_", "RT\u0005P1BF`", "y=(@_2}9u8WN", (-1), "ag:QX^S-%Nl)58qKP_", (-1), 1134, 2, (-1), "This database dialect doesn't support adding comments to columns", "RT\u0005P1BF`", 974, 1163, "This database dialect doesn't support adding comments to columns");
      DatabaseObjectType databaseObjectType0 = DatabaseObjectType.PROCEDURE;
      dBCopyPlugin0.getPluginUserSettingsFolder();
      tableColumnInfo0.replaceDatabaseObjectTypeConstantObjectsByConstantObjectsOfThisVM(databaseObjectType0);
      DBUtil.typesAreEquivalent(2, 1163);
      DBCopyPlugin dBCopyPlugin1 = new DBCopyPlugin();
      SQLDriverPropertyCollection sQLDriverPropertyCollection0 = new SQLDriverPropertyCollection();
      UidIdentifier uidIdentifier0 = new UidIdentifier();
      uidIdentifier0.setString("This database dialect doesn't support adding comments to columns");
      SQLDriver sQLDriver0 = new SQLDriver(uidIdentifier0);
      SQLDriver sQLDriver1 = new SQLDriver(uidIdentifier0);
      dBCopyPlugin1.getDestSession();
      FileSystemHandling.shouldAllThrowIOExceptions();
      // Undeclared exception!
      try { 
        dBCopyPlugin0.getGlobalPreferencePanels();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.squirrel_sql.plugins.dbcopy.gui.PreferencesPanel", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      boolean boolean0 = DBUtil.typesAreEquivalent((-7), (-7));
      assertTrue(boolean0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      dBCopyPlugin0.getDestSession();
      dBCopyPlugin0.setSourceSession((ISession) null);
      IDatabaseObjectInfo[] iDatabaseObjectInfoArray0 = new IDatabaseObjectInfo[1];
      List<ITableInfo> list0 = DBUtil.convertObjectArrayToTableList(iDatabaseObjectInfoArray0);
      assertFalse(list0.isEmpty());
      
      boolean boolean0 = DBUtil.typesAreEquivalent(10, 10);
      assertTrue(boolean0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      dBCopyPlugin0.getSourceSession();
      DBCopyPlugin dBCopyPlugin1 = new DBCopyPlugin();
      dBCopyPlugin0.unload();
      DBUtil.validateColumnNames((ITableInfo) null, (SessionInfoProvider) null);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DBUtil.typesAreEquivalent(3, 3);
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      SQLDriverPropertyCollection sQLDriverPropertyCollection0 = new SQLDriverPropertyCollection();
      UidIdentifier uidIdentifier0 = new UidIdentifier();
      uidIdentifier0.setString("-DmigratePreferences was specified, but file ");
      uidIdentifier0.setString("-DmigratePreferences was specified, but file ");
      SQLDriver sQLDriver0 = new SQLDriver(uidIdentifier0);
      SQLDriver sQLDriver1 = new SQLDriver(uidIdentifier0);
      dBCopyPlugin0.getDestSession();
      FileSystemHandling.shouldAllThrowIOExceptions();
      DBCopyPlugin dBCopyPlugin1 = new DBCopyPlugin();
      dBCopyPlugin1.getPasteToTableInfo((ISQLConnection) null, "-DmigratePreferences was specified, but file ", "getUseScrollableTabbedPanes");
      DBUtil.getColumnType((ISQLConnection) null, (ITableInfo) null, "net.sourceforge.squirrel_sql.plugins.dbcopy.dbcopy");
      dBCopyPlugin1.setCopyMenuEnabled(true);
      // Undeclared exception!
      try { 
        dBCopyPlugin1.getGlobalPreferencePanels();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.squirrel_sql.plugins.dbcopy.gui.PreferencesPanel", e);
      }
  }

  /**
  //Test case number: 27
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Vector<IDatabaseObjectInfo> vector0 = new Vector<IDatabaseObjectInfo>();
      String string0 = "Ic*W[D%>/cR";
      DatabaseObjectInfo databaseObjectInfo0 = new DatabaseObjectInfo("Ic*W[D%>/cR", "Ic*W[D%>/cR", (String) null);
      vector0.add((IDatabaseObjectInfo) databaseObjectInfo0);
      // Undeclared exception!
      try { 
        DBUtil.convertObjectToTableList(vector0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // net.sourceforge.squirrel_sql.fw.sql.DatabaseObjectInfo cannot be cast to net.sourceforge.squirrel_sql.fw.sql.ITableInfo
         //
         verifyException("net.sourceforge.squirrel_sql.plugins.dbcopy.util.DBUtil", e);
      }
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      ArrayList<ITableInfo> arrayList0 = new ArrayList<ITableInfo>();
      arrayList0.add((ITableInfo) null);
      dBCopyPlugin0.getPasteToTableInfo((ISQLConnection) null, "S^VZ", "getUseScrollableTabbedPanes");
      int int0 = DBUtil.getColumnType((ISQLConnection) null, (ITableInfo) null, "utc_date");
      assertEquals((-1), int0);
      
      dBCopyPlugin0.setCopyMenuEnabled(true);
      List<IDatabaseObjectInfo> list0 = DBUtil.convertTableToObjectList(arrayList0);
      assertEquals(1, list0.size());
  }

  /**
  //Test case number: 29
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      TableColumnInfo tableColumnInfo0 = new TableColumnInfo("PLUM", "g;QaWKs%gT", " in schema ", " in schema ", (-2381), "+_`4T%ze|&36]", 5033, 644, 3, 1186, " in schema ", "g;QaWKs%gT", 1186, (-2381), " in schema ");
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      DatabaseObjectType databaseObjectType0 = DatabaseObjectType.DATATYPE;
      DatabaseObjectType databaseObjectType1 = DatabaseObjectType.SYNONYM;
      tableColumnInfo0.replaceDatabaseObjectTypeConstantObjectsByConstantObjectsOfThisVM(databaseObjectType1);
      dBCopyPlugin0.getSourceSession();
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
  //Test case number: 30
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/home/ubuntu/.squirrel-sql");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, " in schema ");
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      DBUtil.typesAreEquivalent(2, 2);
      TableColumnInfo tableColumnInfo0 = new TableColumnInfo("gbK&n01eTcj9-sS/yO", "NO", "gbK&n01eTcj9-sS/yO", "NO", (-4), "q", 7, 2802, (-2), 7, "@K\"(Z_KSi;", "\"B^V", (-4), 925, "\"B^V");
      DBUtil.isBinaryType(tableColumnInfo0);
      // Undeclared exception!
      try { 
        DBUtil.getQualifiedObjectName((ISession) null, "@K\"(Z_KSi;", (String) null, (String) null, 475);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.squirrel_sql.plugins.dbcopy.util.DBUtil", e);
      }
  }

  /**
  //Test case number: 31
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      // Undeclared exception!
      try { 
        DBUtil.getInsertSQL(dBCopyPlugin0, "DBUtil.info.bindclobfile", (ITableInfo) null, (-2345));
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
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      boolean boolean0 = DBUtil.typesAreEquivalent(16, 16);
      assertTrue(boolean0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      int int0 = new Integer(1951);
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      // Undeclared exception!
      try { 
        DBUtil.getSelectQuery(dBCopyPlugin0, (String) null, (ITableInfo) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.squirrel_sql.plugins.dbcopy.util.DBUtil", e);
      }
  }

  /**
  //Test case number: 34
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      dBCopyPlugin0.getPasteToTableInfo((ISQLConnection) null, "", "long raw");
      int int0 = 58;
      // Undeclared exception!
      try { 
        DBUtil.getColumnName((ISQLConnection) null, (ITableInfo) null, 58);
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
  /*Coverage entropy=0.796311640173813
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DBUtil.typesAreEquivalent(16, (-7));
      TableColumnInfo tableColumnInfo0 = new TableColumnInfo("`", "`", "`", (String) null, 454, "=\"*#0lV|mO_5}aDZrr", (-492), 2292, 1934, (-1982292595), "2XJRAuI4Vu2H", "=\"*#0lV|mO_5}aDZrr", 454, 40, "help");
      DatabaseObjectType databaseObjectType0 = DatabaseObjectType.PRIMARY_KEY;
      tableColumnInfo0.replaceDatabaseObjectTypeConstantObjectsByConstantObjectsOfThisVM(databaseObjectType0);
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      dBCopyPlugin0.getDestSession();
      DBUtil.replaceOtherDataType(tableColumnInfo0, (ISession) null);
      dBCopyPlugin0.getSourceSession();
      // Undeclared exception!
      try { 
        DBUtil.executeQuery((ISession) null, "eF");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.squirrel_sql.plugins.dbcopy.util.DBUtil", e);
      }
  }

  /**
  //Test case number: 36
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      dBCopyPlugin0.getApplication();
      SchemaInfo schemaInfo0 = new SchemaInfo((IApplication) null);
      TableColumnInfo tableColumnInfo0 = new TableColumnInfo("net.sourceforge.squirrel_sql.plugins.dbcopy.dbcopy", "-10-", "net.sourceforge.squirrel_sql.plugins.dbcopy.dbcopy", "-10-", 1, "net.sourceforge.squirrel_sql.plugins.dbcopy.dbcopy", 0, 1, 0, 2, "net.sourceforge.squirrel_sql.plugins.dbcopy.dbcopy", "net.sourceforge.squirrel_sql.plugins.dbcopy.dbcopy", 1, 0, "net.sourceforge.squirrel_sql.plugins.dbcopy.dbcopy");
      DatabaseObjectType databaseObjectType0 = DatabaseObjectType.SCHEMA;
      tableColumnInfo0.replaceDatabaseObjectTypeConstantObjectsByConstantObjectsOfThisVM(databaseObjectType0);
      DBUtil.getSchemaFromDbObject(tableColumnInfo0, schemaInfo0);
      System.setCurrentTimeMillis(0);
      dBCopyPlugin0.getDestSession();
      // Undeclared exception!
      try { 
        DBUtil.checkKeyword((ISession) null, "char($l) ascii", "49nj)N~y&U}E0");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.squirrel_sql.plugins.dbcopy.util.DBUtil", e);
      }
  }

  /**
  //Test case number: 37
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      boolean boolean0 = DBUtil.typesAreEquivalent((-7), 16);
      assertTrue(boolean0);
      
      boolean boolean1 = FileSystemHandling.shouldAllThrowIOExceptions();
      assertFalse(boolean1 == boolean0);
  }
}