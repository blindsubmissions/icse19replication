/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 09:35:02 GMT 2018
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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import net.sourceforge.squirrel_sql.client.IApplication;
import net.sourceforge.squirrel_sql.client.gui.db.SQLAlias;
import net.sourceforge.squirrel_sql.client.gui.db.SQLAliasConnectionProperties;
import net.sourceforge.squirrel_sql.client.session.ISession;
import net.sourceforge.squirrel_sql.client.session.schemainfo.SchemaInfo;
import net.sourceforge.squirrel_sql.client.util.ApplicationFileWrappersImpl;
import net.sourceforge.squirrel_sql.fw.id.UidIdentifier;
import net.sourceforge.squirrel_sql.fw.sql.DatabaseObjectType;
import net.sourceforge.squirrel_sql.fw.sql.IDatabaseObjectInfo;
import net.sourceforge.squirrel_sql.fw.sql.ISQLConnection;
import net.sourceforge.squirrel_sql.fw.sql.ISQLDatabaseMetaData;
import net.sourceforge.squirrel_sql.fw.sql.ITableInfo;
import net.sourceforge.squirrel_sql.fw.sql.SQLConnection;
import net.sourceforge.squirrel_sql.fw.sql.SQLDriver;
import net.sourceforge.squirrel_sql.fw.sql.SQLDriverPropertyCollection;
import net.sourceforge.squirrel_sql.fw.sql.TableColumnInfo;
import net.sourceforge.squirrel_sql.fw.sql.TableInfo;
import net.sourceforge.squirrel_sql.fw.util.FileWrapperFactoryImpl;
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
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DBUtil.getLastStatement();
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      dBCopyPlugin0.getSourceSession();
      // Undeclared exception!
      try { 
        DBUtil.checkKeyword((ISession) null, (String) null, "net.sourceforge.squirrel_sql.plugins.dbcopy.dbcopy");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.squirrel_sql.plugins.dbcopy.util.DBUtil", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      dBCopyPlugin0.getDestSession();
      String string0 = "bH.qg!AevcBnks9T=u~";
      dBCopyPlugin0.setPasteToTableName("bH.qg!AevcBnks9T=u~");
      int int0 = (-239);
      // Undeclared exception!
      try { 
        DBUtil.getTableCount((ISession) null, "bH.qg!AevcBnks9T=u~", "net.sourceforge.squirrel_sql.plugins.dbcopy.dbcopy", ", ", (-239));
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = 720;
      int int1 = 200;
      DBUtil.typesAreEquivalent(720, 200);
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      dBCopyPlugin0.setPasteMenuEnabled(true);
      dBCopyPlugin0.getDestSession();
      dBCopyPlugin0.setDestSession((ISession) null);
      // Undeclared exception!
      try { 
        DBUtil.sanityCheckPreferences((ISession) null);
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
      TableColumnInfo tableColumnInfo0 = new TableColumnInfo("I$ork&nNDL^]{]2P", "I$ork&nNDL^]{]2P", "", "I$ork&nNDL^]{]2P", 8, "=>$X<oP[d", 8, 8, 92, 8, "", "", 92, 573, "=>$X<oP[d");
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      dBCopyPlugin0.getApplication();
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
  //Test case number: 4
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DBUtil.getLastStatementValues();
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
  //Test case number: 5
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      dBCopyPlugin0.getSourceSession();
      dBCopyPlugin0.setSourceSession((ISession) null);
      ApplicationFileWrappersImpl applicationFileWrappersImpl0 = new ApplicationFileWrappersImpl();
      applicationFileWrappersImpl0.getSquirrelHomeDir();
      dBCopyPlugin0.setApplicationFiles(applicationFileWrappersImpl0);
      FileWrapperFactoryImpl fileWrapperFactoryImpl0 = new FileWrapperFactoryImpl();
      dBCopyPlugin0.setFileWrapperFactory(fileWrapperFactoryImpl0);
      dBCopyPlugin0.getWebSite();
      DBUtil.validateColumnNames((ITableInfo) null, dBCopyPlugin0);
      DBCopyPreferenceBean dBCopyPreferenceBean0 = new DBCopyPreferenceBean();
      dBCopyPreferenceBean0.setFileCacheBufferSize(57);
      dBCopyPreferenceBean0.setPruneDuplicateIndexDefs(true);
      DBUtil.setPreferences(dBCopyPreferenceBean0);
      DBUtil.setLastStatementValues("numeric(18,0)");
      // Undeclared exception!
      try { 
        DBUtil.getQualifiedObjectName((ISession) null, "http://www.squirrelsql.org", "J}f^1Oxe>Jj1ipW", "", 1435);
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
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      dBCopyPlugin0.getPluginAppSettingsFolder();
      dBCopyPlugin0.getDestSession();
      DBUtil.replaceDistinctDataType((-2650), (TableColumnInfo) null, (ISession) null);
      DBUtil.setLastStatementValues("net.sourceforge.squirrel_sql.plugins.dbcopy.dbcopy");
      String string0 = "cascade";
      // Undeclared exception!
      try { 
        DBUtil.fixCase((ISession) null, "cascade");
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
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      dBCopyPlugin0.getPasteToTableInfo((ISQLConnection) null, (String) null, "");
      // Undeclared exception!
      try { 
        DBUtil.getColumnType((ISQLConnection) null, (ITableInfo) null, 0);
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
      TableColumnInfo tableColumnInfo0 = new TableColumnInfo("", "", "zwN", (String) null, 2000, "zwN", 2000, (-574), (-574), (-1089), (String) null, "", 2000, 2000, "IhLKu/F]lOF");
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      dBCopyPlugin0.getDestSession();
      int int0 = DBUtil.replaceOtherDataType(tableColumnInfo0, (ISession) null);
      assertEquals(2000, int0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Vector<IDatabaseObjectInfo> vector0 = new Vector<IDatabaseObjectInfo>();
      vector0.add((IDatabaseObjectInfo) null);
      DBUtil.convertObjectToTableList(vector0);
      String string0 = "0k~<q%~';Kj)A!|4";
      String string1 = ".$Lw";
      TableColumnInfo tableColumnInfo0 = new TableColumnInfo("z8gc", "SRc@a5/%s${'Sf|*!G", "0k~<q%~';Kj)A!|4", "SRc@a5/%s${'Sf|*!G", (-1102), ".$Lw", 18, 0, (-3641), (-3641), ".$Lw", "SRc@a5/%s${'Sf|*!G", 18, (-860), "SRc@a5/%s${'Sf|*!G");
      DBUtil.isBinaryType(tableColumnInfo0);
      String string2 = "cou&0PbFZCHDCB";
      DBUtil.setLastStatement("cou&0PbFZCHDCB");
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      dBCopyPlugin0.getSourceSession();
      // Undeclared exception!
      try { 
        DBUtil.deleteDataInExistingTable((ISession) null, "z8gc", "E`lQ-d", "cou&0PbFZCHDCB");
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
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DBCopyPreferenceBean dBCopyPreferenceBean0 = new DBCopyPreferenceBean();
      dBCopyPreferenceBean0.setAppendRecordsToExisting(false);
      DBUtil.setPreferences(dBCopyPreferenceBean0);
      String string0 = "org.jfree.data.statistics.HistogramType";
      String string1 = "Pg~5A\\U|G#P";
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      dBCopyPlugin0.getDestSession();
      String string2 = "AqmU}->Z-t";
      ArrayList<ITableInfo> arrayList0 = new ArrayList<ITableInfo>();
      DBUtil.convertTableToObjectList(arrayList0);
      // Undeclared exception!
      try { 
        DBUtil.deleteDataInExistingTable((ISession) null, "net.sourceforge.squirrel_sql.plugins.dbcopy.dbcopy", "char(1 char)", "");
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
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      dBCopyPlugin0.setPasteToTableName("net.sourceforge.squirrel_sql.plugins.dbcopy.dbcopy");
      dBCopyPlugin0.getSourceSession();
      dBCopyPlugin0.setSourceSession((ISession) null);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "%");
      TableColumnInfo tableColumnInfo0 = new TableColumnInfo("net.sourceforge.squirrel_sql.plugins.dbcopy.dbcopy", "d+4G", "5Kh%M!T$OtzrL6", "d+4G", 1111, "d+4G", 2890, (-1089), 1690, 1115, "DBUtil.info.executequery", "DBUtil.info.executequery", 2890, 23514, "d+4G");
      DBCopyPlugin dBCopyPlugin1 = new DBCopyPlugin();
      dBCopyPlugin0.getDestSession();
      int int0 = DBUtil.replaceOtherDataType(tableColumnInfo0, (ISession) null);
      assertEquals(1111, int0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DBUtil.typesAreEquivalent(0, 0);
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      dBCopyPlugin0.getApplication();
      SchemaInfo schemaInfo0 = new SchemaInfo((IApplication) null);
      schemaInfo0.getSQLDatabaseMetaData();
      dBCopyPlugin0.getSourceSession();
      IDatabaseObjectInfo[] iDatabaseObjectInfoArray0 = new IDatabaseObjectInfo[2];
      List<ITableInfo> list0 = DBUtil.convertObjectArrayToTableList(iDatabaseObjectInfoArray0);
      DBUtil.convertTableToObjectList(list0);
      dBCopyPlugin0.getSourceSession();
      // Undeclared exception!
      try { 
        schemaInfo0.getStoredProceduresInfos("0s2U(", "0s2U(");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.squirrel_sql.client.session.schemainfo.SchemaInfo", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DBCopyPreferenceBean dBCopyPreferenceBean0 = new DBCopyPreferenceBean();
      dBCopyPreferenceBean0.setAppendRecordsToExisting(false);
      DBUtil.setPreferences(dBCopyPreferenceBean0);
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      dBCopyPlugin0.getDestSession();
      ArrayList<ITableInfo> arrayList0 = new ArrayList<ITableInfo>();
      Vector<IDatabaseObjectInfo> vector0 = new Vector<IDatabaseObjectInfo>();
      TableColumnInfo tableColumnInfo0 = new TableColumnInfo("net.sourceforge.squirrel_sql.plugins.dbcopy.dbcopy", "c]a*(r char)", "c]a*(r char)", "net.sourceforge.squirrel_sql.plugins.dbcopy.dbcopy", 62, "select ", 2069, 5537, (-2984), (-1440), "net.sourceforge.squirrel_sql.plugins.dbcopy.dbcopy", "select ", (-2984), (-2984), "select ");
      DatabaseObjectType databaseObjectType0 = DatabaseObjectType.TABLE;
      tableColumnInfo0.replaceDatabaseObjectTypeConstantObjectsByConstantObjectsOfThisVM(databaseObjectType0);
      // Undeclared exception!
      try { 
        DBUtil.getColumnSql(dBCopyPlugin0, tableColumnInfo0, "long varchar for bit data", "z'6b$Jh#LeDgLWe");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.squirrel_sql.plugins.dbcopy.util.DBUtil", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      TableColumnInfo tableColumnInfo0 = new TableColumnInfo("cascade", "<A.F#[j,GIk~O,P_iT[", "cascade", "cascade", 1, "<A.F#[j,GIk~O,P_iT[", 8, 2002, 2002, 15, "V5`uRl/{aYeG<r#vm#", " .Zx%^xy38", 16, (-2226), "fixCase: unexpected exception: ");
      DBUtil.isBinaryType(tableColumnInfo0);
      TableColumnInfo[] tableColumnInfoArray0 = new TableColumnInfo[1];
      tableColumnInfoArray0[0] = tableColumnInfo0;
      DBUtil.getColumnList(tableColumnInfoArray0);
      dBCopyPlugin0.getDestSession();
      // Undeclared exception!
      try { 
        DBUtil.deleteDataInExistingTable((ISession) null, " .Zx%^xy38", "net.sourceforge.squirrel_sql.plugins.dbcopy.dbcopy", "");
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TableColumnInfo tableColumnInfo0 = new TableColumnInfo("4@!o", (String) null, "IhLKu/F]lOF", "DBUtil.error.firebirdcommit", (-1089), "zwN", (-1), (-200), (-1), 50, "IhLKu/F]lOF", "cascade", (-2383), (-612), "DBUtil.error.firebirdcommit");
      TableColumnInfo tableColumnInfo1 = new TableColumnInfo("", "cascade", "ALTER SEQUENCE $sequenceName$ $startWith$ $increment$ $minimum$ $maximum$ $cache$ $cycle$", "", (-2383), "DBUtil.error.firebirdcommit", (-1509), (-1341), (-1), 853, "4@!o", "cascade", (-397), (-2383), "2F/aDTs'ro#^39 vt");
      DatabaseObjectType databaseObjectType0 = DatabaseObjectType.TRIGGER_TYPE_DBO;
      tableColumnInfo1.replaceDatabaseObjectTypeConstantObjectsByConstantObjectsOfThisVM(databaseObjectType0);
      DBUtil.isBinaryType(tableColumnInfo1);
      DBUtil dBUtil0 = new DBUtil();
      assertNull(dBUtil0.getLastStatementValues());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      dBCopyPlugin0.getSourceSession();
      TableColumnInfo tableColumnInfo0 = new TableColumnInfo("cascade", "_+7", " .Zx%^xy38", "_+7", 29, "_+7", 1478, 2004, 16, 2004, "abortOnError", "", (-400), (-400), "Encountered unexpected exception while attempting to determine if catalogs are used in table definitions");
      DBUtil.isBinaryType(tableColumnInfo0);
      TableColumnInfo[] tableColumnInfoArray0 = new TableColumnInfo[9];
      tableColumnInfoArray0[0] = tableColumnInfo0;
      tableColumnInfoArray0[1] = tableColumnInfo0;
      tableColumnInfoArray0[2] = tableColumnInfo0;
      tableColumnInfoArray0[3] = tableColumnInfo0;
      tableColumnInfoArray0[4] = tableColumnInfo0;
      tableColumnInfoArray0[5] = tableColumnInfo0;
      tableColumnInfoArray0[6] = tableColumnInfo0;
      tableColumnInfoArray0[7] = tableColumnInfo0;
      tableColumnInfoArray0[8] = tableColumnInfo0;
      DBUtil.getColumnList(tableColumnInfoArray0);
      dBCopyPlugin0.getDestSession();
      // Undeclared exception!
      try { 
        DBUtil.getTables((ISession) null, "Dj_K/&ePo[$kt)j&/g", "SELECT data_type FROM information_schema.columns where column_name = ? ", "Encountered unexpected exception while attempting to determine if catalogs are used in table definitions");
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
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DBCopyPreferenceBean dBCopyPreferenceBean0 = new DBCopyPreferenceBean();
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      dBCopyPlugin0.getDestSession();
      String string0 = DBUtil.fixCase((ISession) null, "");
      assertEquals("", string0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      dBCopyPlugin0.getDestSession();
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      ConnectionWrapper connectionWrapper0 = new ConnectionWrapper(connection0);
      ITableInfo iTableInfo0 = null;
      DBUtil.validateColumnNames((ITableInfo) null, dBCopyPlugin0);
      // Undeclared exception!
      try { 
        DBUtil.getSelectQuery(dBCopyPlugin0, "cascade", (ITableInfo) null);
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      dBCopyPlugin0.getDestSession();
      dBCopyPlugin0.getPluginAppSettingsFolder();
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      ConnectionWrapper connectionWrapper0 = new ConnectionWrapper(connection0);
      DBUtil.validateColumnNames((ITableInfo) null, dBCopyPlugin0);
      dBCopyPlugin0.setDestSession((ISession) null);
      SQLDriverPropertyCollection sQLDriverPropertyCollection0 = new SQLDriverPropertyCollection();
      UidIdentifier uidIdentifier0 = new UidIdentifier();
      SQLDriver sQLDriver0 = new SQLDriver(uidIdentifier0);
      SQLConnection sQLConnection0 = new SQLConnection(connectionWrapper0, sQLDriverPropertyCollection0, sQLDriver0);
      // Undeclared exception!
      try { 
        DBUtil.getColumnName(sQLConnection0, (ITableInfo) null, 93);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.squirrel_sql.fw.sql.SQLDatabaseMetaData", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      DBCopyPlugin dBCopyPlugin1 = new DBCopyPlugin();
      dBCopyPlugin1.getSourceSession();
      dBCopyPlugin0.getDestSession();
      TableColumnInfo tableColumnInfo0 = new TableColumnInfo("@y|D", "@y|D", "net.sourceforge.squirrel_sql.plugins.dbcopy.dbcopy", "@y|D", 2002, "cascade", 2002, 7, 2002, 7, "", "cascade", 2002, 7, "DBUtil.info.bindblobmem");
      String string0 = DBUtil.getSchemaNameFromDbObject(tableColumnInfo0);
      assertEquals("@y|D", string0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      int int0 = 8;
      TableColumnInfo tableColumnInfo0 = new TableColumnInfo("\"::B5FT", "\"::B5FT", "\"::B5FT", "", (-4), "I$ork&nNDL^]{]2P", 93, 93, (-4), (-4551), "I$ork&nNDL^]{]2P", "The key (", (-4), (-4), "The key (");
      DatabaseObjectType databaseObjectType0 = DatabaseObjectType.SCHEMA;
      DatabaseObjectType databaseObjectType1 = DatabaseObjectType.createNewDatabaseObjectType("\"::B5FT");
      tableColumnInfo0.replaceDatabaseObjectTypeConstantObjectsByConstantObjectsOfThisVM(databaseObjectType1);
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      dBCopyPlugin0.getPluginJarFilePath();
      dBCopyPlugin0.getDestSession();
      DBUtil.isBinaryType(tableColumnInfo0);
      ConnectionWrapper connectionWrapper0 = null;
      try {
        connectionWrapper0 = new ConnectionWrapper((Connection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.gargoylesoftware.base.resource.jdbc.ConnectionWrapper", e);
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      dBCopyPlugin0.setPasteToTableName("net.sourceforge.squirrel_sql.plugins.dbcopy.dbcopy");
      dBCopyPlugin0.getSourceSession();
      dBCopyPlugin0.getDestSession();
      TableColumnInfo tableColumnInfo0 = new TableColumnInfo("y#fhacTOMg|3;hD~", "y#fhacTOMg|3;hD~", "y#fhacTOMg|3;hD~", "net.sourceforge.squirrel_sql.plugins.dbcopy.dbcopy", (-3), "cascade", 2001, (-3), 93, 2001, "net.sourceforge.squirrel_sql.plugins.dbcopy.dbcopy", "y#fhacTOMg|3;hD~", 1007, (-3), "y#fhacTOMg|3;hD~");
      boolean boolean0 = DBUtil.isBinaryType(tableColumnInfo0);
      assertTrue(boolean0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      dBCopyPlugin0.getDestSession();
      DBCopyPlugin dBCopyPlugin1 = new DBCopyPlugin();
      dBCopyPlugin0.getDestSession();
      String string0 = DBUtil.fixCase((ISession) null, (String) null);
      assertNull(string0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      dBCopyPlugin0.getPasteToTableInfo((ISQLConnection) null, (String) null, "substring(");
      String[] stringArray0 = new String[3];
      stringArray0[0] = null;
      stringArray0[1] = "substring(";
      boolean boolean0 = DBUtil.typesAreEquivalent(2, 660);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      ITableInfo iTableInfo0 = null;
      LinkedList<IDatabaseObjectInfo> linkedList0 = new LinkedList<IDatabaseObjectInfo>();
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "");
      dBCopyPlugin0.setSourceDatabaseObjects(linkedList0);
      // Undeclared exception!
      try { 
        DBUtil.getInsertSQL(dBCopyPlugin0, "net.sourceforge.squirrel_sql.plugins.dbcopy.dbcopy", (ITableInfo) null, (-3290));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.squirrel_sql.plugins.dbcopy.util.DBUtil", e);
      }
  }

  /**
  //Test case number: 26
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SQLDriverPropertyCollection sQLDriverPropertyCollection0 = new SQLDriverPropertyCollection();
      SQLDriver sQLDriver0 = new SQLDriver();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/home/ubuntu/.squirrel-sql");
      FileSystemHandling.shouldThrowIOException(evoSuiteFile0);
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
  //Test case number: 27
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      int int0 = 31;
      // Undeclared exception!
      try { 
        DBUtil.bindVariable((PreparedStatement) null, 11448517, 11448517, 31, (ResultSet) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.squirrel_sql.plugins.dbcopy.util.DBUtil", e);
      }
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.410116318288409
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      dBCopyPlugin0.getPasteToTableInfo((ISQLConnection) null, "net.sourceforge.squirrel_sql.plugins.dbcopy.dbcopy", "net.sourceforge.squirrel_sql.plugins.dbcopy.dbcopy");
      boolean boolean0 = DBUtil.typesAreEquivalent(16, (-1));
      assertFalse(boolean0);
      
      int int0 = DBUtil.getColumnType((ISQLConnection) null, (ITableInfo) null, "/EkHY");
      assertEquals((-1), int0);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      dBCopyPlugin0.getPluginJarFilePath();
      dBCopyPlugin0.getPasteToTableInfo((ISQLConnection) null, "rhr %-Jp\",v: wiG#", "rhr %-Jp\",v: wiG#");
      DBCopyPlugin dBCopyPlugin1 = new DBCopyPlugin();
      dBCopyPlugin1.getSourceSession();
      TableColumnInfo tableColumnInfo0 = new TableColumnInfo("@a", "net.sourceforge.squirrel_sql.plugins.dbcopy.dbcopy", "@a", "Null 'day' argument.", 2001, "O,/J'", 2001, 16, 1566, 1566, "net.sourceforge.squirrel_sql.plugins.dbcopy.dbcopy", "/home/ubuntu/evosuite_readability_gen/projects/102_squirrel-sql/plugins/dbcopy.jar", 3, 3, "L*A8GE6s-*.}r&;-");
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
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DBUtil.validateColumnNames((ITableInfo) null, (SessionInfoProvider) null);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      boolean boolean0 = DBUtil.typesAreEquivalent(3, 3);
      assertTrue(boolean0);
  }

  /**
  //Test case number: 32
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      dBCopyPlugin0.getWebSite();
      boolean boolean0 = DBUtil.typesAreEquivalent((-7), 2002);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      // Undeclared exception!
      try { 
        DBUtil.bindVariable((PreparedStatement) null, 2, (-5), 329, (ResultSet) null);
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
      // Undeclared exception!
      try { 
        DBUtil.bindVariable((PreparedStatement) null, 1111, 1111, (-193), (ResultSet) null);
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
      // Undeclared exception!
      try { 
        DBUtil.bindVariable((PreparedStatement) null, (-7), 2003, (-1397), (ResultSet) null);
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
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      dBCopyPlugin0.getPluginJarFilePath();
      // Undeclared exception!
      try { 
        DBUtil.bindVariable((PreparedStatement) null, (-5), (-5), 12, (ResultSet) null);
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      int int0 = (-2);
      TableColumnInfo tableColumnInfo0 = new TableColumnInfo("cos", "cos", "cos", "cos", (-2), (String) null, 1111, (-2), (-2132253265), (-2), "cos", "cos", (-2355), (-2355), (String) null);
      DatabaseObjectType databaseObjectType0 = DatabaseObjectType.SYNONYM;
      DatabaseObjectType.createNewDatabaseObjectType("PiqrVm%T$jc|Scze_dh");
      tableColumnInfo0.replaceDatabaseObjectTypeConstantObjectsByConstantObjectsOfThisVM(databaseObjectType0);
      tableColumnInfo0.replaceDatabaseObjectTypeConstantObjectsByConstantObjectsOfThisVM(databaseObjectType0);
      DBUtil.isBinaryType(tableColumnInfo0);
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      dBCopyPlugin0.setCopyMenuEnabled(true);
      dBCopyPlugin0.getSourceSession();
      dBCopyPlugin0.getPluginJarFilePath();
      // Undeclared exception!
      try { 
        DBUtil.deleteDataInExistingTable((ISession) null, "cos", "+ZG=*+", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.squirrel_sql.plugins.dbcopy.util.DBUtil", e);
      }
  }
}
