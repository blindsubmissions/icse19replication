/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 16:21:04 GMT 2018
 */

package freemind.controller;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import freemind.controller.Controller;
import freemind.controller.MapModuleManager;
import freemind.controller.StructuredMenuHolder;
import freemind.main.FreeMindApplet;
import freemind.main.FreeMindMain;
import freemind.modes.browsemode.BrowseController;
import freemind.modes.browsemode.BrowseMode;
import freemind.modes.mindmapmode.MindMapController;
import freemind.modes.mindmapmode.MindMapMode;
import freemind.modes.mindmapmode.actions.RemoveIconAction;
import freemind.preferences.FreemindPropertyListener;
import freemind.view.MapModule;
import java.awt.Color;
import java.awt.Component;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentEvent;
import java.awt.event.WindowEvent;
import java.util.Stack;
import javax.swing.Action;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JFormattedTextField;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JTable;
import javax.swing.KeyStroke;
import javax.swing.text.DefaultFormatterFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import plugins.collaboration.socket.MindMapClient;
import plugins.map.MapDialog;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Controller_ESTest extends Controller_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
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
  //Test case number: 1
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      Controller controller0 = null;
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
  //Test case number: 2
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
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
      boolean boolean0 = new Boolean(false);
      FileSystemHandling.shouldAllThrowIOExceptions();
      Stack<DefaultListCellRenderer.UIResource> stack0 = new Stack<DefaultListCellRenderer.UIResource>();
      Stack<String> stack1 = new Stack<String>();
      JTable jTable0 = new JTable(stack0, stack1);
      stack1.iterator();
      Color color0 = jTable0.getGridColor();
      try { 
        Controller.showCommonJColorChooserDialog((Component) null, "", color0);
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
      FileSystemHandling.shouldAllThrowIOExceptions();
      Controller.removePropertyChangeListener((FreemindPropertyListener) null);
      FreeMindApplet freeMindApplet0 = null;
      try {
        freeMindApplet0 = new FreeMindApplet();
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.applet.Applet", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FileSystemHandling.createFolder((EvoSuiteFile) null);
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
  //Test case number: 6
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
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
