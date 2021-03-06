/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 12:17:21 GMT 2018
 */

package freemind.controller;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import accessories.plugins.ClonePlugin;
import freemind.controller.Controller;
import freemind.controller.MapModuleManager;
import freemind.main.FreeMindApplet;
import freemind.main.FreeMindMain;
import freemind.modes.Mode;
import freemind.modes.ModeController;
import freemind.modes.browsemode.BrowseController;
import freemind.modes.browsemode.BrowseMode;
import freemind.modes.filemode.FileMode;
import freemind.modes.filemode.FileNodeModel;
import freemind.modes.mindmapmode.MindMapController;
import freemind.modes.mindmapmode.MindMapMapModel;
import freemind.modes.mindmapmode.MindMapMode;
import freemind.modes.mindmapmode.MindMapToolBar;
import freemind.modes.mindmapmode.actions.AddArrowLinkAction;
import freemind.modes.schememode.SchemeMode;
import freemind.preferences.FreemindPropertyListener;
import freemind.view.MapModule;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Window;
import java.awt.event.ComponentEvent;
import java.awt.event.WindowEvent;
import java.io.StringWriter;
import javax.swing.JColorChooser;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;
import org.openstreetmap.gui.jmapviewer.Demo;
import plugins.collaboration.database.DatabaseConnectionHook;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Controller_ESTest extends Controller_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Controller.getPropertyChangeListeners();
      MindMapMode mindMapMode0 = new MindMapMode();
      mindMapMode0.getController();
      // Undeclared exception!
      try { 
        mindMapMode0.createModeController();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("freemind.modes.mindmapmode.MindMapMode", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Controller.Closer controller_Closer0 = new Controller.Closer();
      Demo demo0 = null;
      try {
        demo0 = new Demo();
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
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
  //Test case number: 3
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SchemeMode schemeMode0 = new SchemeMode();
      schemeMode0.getController();
      JColorChooser jColorChooser0 = Controller.getCommonJColorChooser();
      try { 
        Controller.showCommonJColorChooserDialog(jColorChooser0, "TCm]C'fkLG", (Color) null);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      BrowseMode browseMode0 = new BrowseMode();
      SchemeMode schemeMode0 = new SchemeMode();
      schemeMode0.getController();
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

  /**
  //Test case number: 5
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Controller.removePropertyChangeListener((FreemindPropertyListener) null);
      Mode mode0 = null;
      BrowseController browseController0 = null;
      try {
        browseController0 = new BrowseController((Mode) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("freemind.modes.ControllerAdapter", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Controller.DisposeOnClose controller_DisposeOnClose0 = new Controller.DisposeOnClose();
      // Undeclared exception!
      try { 
        controller_DisposeOnClose0.componentHidden((ComponentEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("freemind.controller.Controller$DisposeOnClose", e);
      }
  }
}
