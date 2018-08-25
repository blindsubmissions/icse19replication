/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 08:22:41 GMT 2018
 */

package net.sourceforge.squirrel_sql.client.session;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import javax.swing.text.DefaultEditorKit;
import net.sourceforge.squirrel_sql.client.DummyAppPlugin;
import net.sourceforge.squirrel_sql.client.IApplication;
import net.sourceforge.squirrel_sql.client.gui.db.SQLAlias;
import net.sourceforge.squirrel_sql.client.session.Session;
import net.sourceforge.squirrel_sql.client.session.mainpanel.SQLTab;
import net.sourceforge.squirrel_sql.client.util.ApplicationFileWrappersImpl;
import net.sourceforge.squirrel_sql.fw.id.UidIdentifier;
import net.sourceforge.squirrel_sql.fw.sql.SQLConnection;
import net.sourceforge.squirrel_sql.fw.sql.SQLDriver;
import net.sourceforge.squirrel_sql.fw.util.FileWrapperFactoryImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Session_ESTest extends Session_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DummyAppPlugin dummyAppPlugin0 = new DummyAppPlugin();
      ApplicationFileWrappersImpl applicationFileWrappersImpl0 = new ApplicationFileWrappersImpl();
      dummyAppPlugin0.setApplicationFiles(applicationFileWrappersImpl0);
      dummyAppPlugin0.getApplication();
      UidIdentifier uidIdentifier0 = new UidIdentifier();
      SQLDriver sQLDriver0 = new SQLDriver(uidIdentifier0);
      SQLAlias sQLAlias0 = new SQLAlias();
      String string0 = ":uR";
      sQLAlias0.getDriverPropertiesClone();
      Session session0 = null;
      try {
        session0 = new Session((IApplication) null, sQLDriver0, sQLAlias0, (SQLConnection) null, ":uR", ":uR", uidIdentifier0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null IApplication passed
         //
         verifyException("net.sourceforge.squirrel_sql.client.session.Session", e);
      }
  }
}
