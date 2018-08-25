/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 15:34:21 GMT 2018
 */

package freemind.controller;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import freemind.controller.Controller;
import freemind.controller.NodeMotionListener;
import freemind.main.FreeMind;
import freemind.main.FreeMindApplet;
import freemind.main.FreeMindMain;
import freemind.modes.ModeController;
import freemind.modes.browsemode.BrowseController;
import freemind.modes.browsemode.BrowseMode;
import freemind.modes.browsemode.BrowsePopupMenu;
import freemind.modes.filemode.FileMapModel;
import freemind.modes.filemode.FileMode;
import freemind.modes.mindmapmode.MindMapMode;
import freemind.modes.schememode.SchemeMode;
import freemind.preferences.FreemindPropertyListener;
import freemind.view.MapModule;
import freemind.view.mindmapview.MapView;
import java.awt.AWTEventMulticaster;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.MouseWheelListener;
import java.awt.event.WindowEvent;
import java.io.File;
import java.net.URI;
import java.util.Collection;
import java.util.Properties;
import javax.swing.Icon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JRadioButtonMenuItem;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.hsqldb.jdbc.jdbcConnection;
import org.hsqldb.persist.HsqlProperties;
import org.junit.runner.RunWith;
import plugins.collaboration.socket.MindMapClient;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Controller_ESTest extends Controller_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JRadioButtonMenuItem jRadioButtonMenuItem0 = new JRadioButtonMenuItem((Icon) null);
      jRadioButtonMenuItem0.getChangeListeners();
      String string0 = "`\"6";
      Color color0 = Color.LIGHT_GRAY;
      try { 
        Controller.showCommonJColorChooserDialog(jRadioButtonMenuItem0, "`\"6", color0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SchemeMode schemeMode0 = new SchemeMode();
      FreeMindMain freeMindMain0 = null;
      Controller controller0 = null;
      try {
        controller0 = new Controller((FreeMindMain) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("freemind.controller.Controller", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SchemeMode schemeMode0 = new SchemeMode();
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, true);
      // Undeclared exception!
      try { 
        Controller.addPropertyChangeListenerAndPropagate((FreemindPropertyListener) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("freemind.controller.Controller", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      BrowseMode browseMode0 = new BrowseMode();
      Controller.DisposeOnClose controller_DisposeOnClose0 = new Controller.DisposeOnClose();
      JCheckBoxMenuItem jCheckBoxMenuItem0 = new JCheckBoxMenuItem();
      FocusEvent focusEvent0 = new FocusEvent(jCheckBoxMenuItem0, 0, false);
      // Undeclared exception!
      try { 
        controller_DisposeOnClose0.componentHidden(focusEvent0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // javax.swing.JCheckBoxMenuItem cannot be cast to java.awt.Window
         //
         verifyException("freemind.controller.Controller$DisposeOnClose", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Collection collection0 = Controller.getPropertyChangeListeners();
      assertNotNull(collection0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      Controller.Closer controller_Closer0 = new Controller.Closer();
      // Undeclared exception!
      try { 
        controller_Closer0.windowClosing((WindowEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("freemind.controller.Controller$Closer", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      MindMapMode mindMapMode0 = new MindMapMode();
      mindMapMode0.getController();
      Controller.CloseAction controller_CloseAction0 = null;
      try {
        controller_CloseAction0 = new Controller.CloseAction((Controller) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("freemind.controller.Controller$CloseAction", e);
      }
  }
}