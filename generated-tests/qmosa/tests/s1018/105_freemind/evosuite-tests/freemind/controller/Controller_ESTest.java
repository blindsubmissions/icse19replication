/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 13:16:09 GMT 2018
 */

package freemind.controller;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import freemind.controller.Controller;
import freemind.controller.StructuredMenuHolder;
import freemind.main.FreeMindMain;
import freemind.modes.mindmapmode.MindMapController;
import freemind.modes.mindmapmode.MindMapMode;
import freemind.modes.mindmapmode.actions.RemoveIconAction;
import freemind.modes.schememode.SchemeMode;
import freemind.preferences.FreemindPropertyListener;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentEvent;
import java.awt.event.WindowEvent;
import java.awt.geom.AffineTransform;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListenerProxy;
import javax.swing.Action;
import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JSpinner;
import javax.swing.JSplitPane;
import javax.swing.MenuElement;
import javax.swing.MenuSelectionManager;
import javax.swing.event.MenuKeyEvent;
import javax.swing.plaf.basic.BasicSplitPaneDivider;
import javax.swing.plaf.basic.BasicSplitPaneUI;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Controller_ESTest extends Controller_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Controller.getPropertyChangeListeners();
      Controller.DisposeOnClose controller_DisposeOnClose0 = new Controller.DisposeOnClose();
      int int0 = 0;
      JSplitPane jSplitPane0 = new JSplitPane(0, (Component) null, (Component) null);
      int int1 = 35;
      int int2 = (-896);
      char char0 = 'F';
      MenuElement[] menuElementArray0 = new MenuElement[7];
      String string0 = "ap3A7+REa";
      MindMapMode mindMapMode0 = new MindMapMode();
      MindMapController mindMapController0 = null;
      try {
        mindMapController0 = new MindMapController(mindMapMode0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("freemind.modes.ControllerAdapter", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      Controller.getCommonJColorChooser();
      byteArray0[0] = (byte) (-107);
      byteArray0[1] = (byte)52;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      FileSystemHandling.shouldAllThrowIOExceptions();
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
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
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
  //Test case number: 3
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JMenu jMenu0 = new JMenu((Action) null);
      Color color0 = Color.getColor("2K1T+qb]3", 0);
      try { 
        Controller.showCommonJColorChooserDialog(jMenu0, "Browse", color0);
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
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

  /**
  //Test case number: 5
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      String string0 = "file:";
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "file:");
      Controller.removePropertyChangeListener((FreemindPropertyListener) null);
      SchemeMode schemeMode0 = new SchemeMode();
      schemeMode0.getController();
      Font font0 = Font.decode("file:");
      // Undeclared exception!
      try { 
        font0.deriveFont(2, (AffineTransform) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // transform must not be null
         //
         verifyException("java.awt.Font", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      Controller.addPropertyChangeListener((FreemindPropertyListener) null);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = null;
      boolean boolean0 = false;
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
}
