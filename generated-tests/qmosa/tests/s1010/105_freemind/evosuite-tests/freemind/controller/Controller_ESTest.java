/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 10:55:28 GMT 2018
 */

package freemind.controller;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import freemind.controller.Controller;
import freemind.controller.MapModuleManager;
import freemind.main.FreeMindApplet;
import freemind.main.FreeMindMain;
import freemind.modes.browsemode.BrowseMode;
import freemind.modes.schememode.SchemeMode;
import freemind.preferences.FreemindPropertyListener;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ComponentEvent;
import java.awt.event.WindowEvent;
import javax.swing.Action;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JComponent;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.JToggleButton;
import org.apache.batik.svggen.SVGGraphics2D;
import org.apache.xalan.processor.ProcessorCharacters;
import org.apache.xalan.templates.DecimalFormatProperties;
import org.apache.xalan.templates.Stylesheet;
import org.apache.xml.utils.QName;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.javax.swing.MockSpinnerDateModel;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Controller_ESTest extends Controller_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
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
  //Test case number: 1
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SchemeMode schemeMode0 = new SchemeMode();
      schemeMode0.getController();
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-41);
      byteArray0[1] = (byte)8;
      byteArray0[2] = (byte) (-45);
      byteArray0[3] = (byte)122;
      byteArray0[4] = (byte)21;
      byteArray0[5] = (byte) (-91);
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
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
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MapModuleManager.MapTitleChangeListener mapModuleManager_MapTitleChangeListener0 = mock(MapModuleManager.MapTitleChangeListener.class, new ViolatedAssumptionAnswer());
      Controller.getPropertyChangeListeners();
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
  //Test case number: 3
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Controller.DisposeOnClose controller_DisposeOnClose0 = new Controller.DisposeOnClose();
      int int0 = 1222;
      int int1 = 10163;
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
  //Test case number: 4
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MapModuleManager.MapTitleChangeListener mapModuleManager_MapTitleChangeListener0 = mock(MapModuleManager.MapTitleChangeListener.class, new ViolatedAssumptionAnswer());
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
  //Test case number: 5
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.shouldAllThrowIOExceptions();
      Controller.removePropertyChangeListener((FreemindPropertyListener) null);
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
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      DefaultListCellRenderer defaultListCellRenderer0 = new DefaultListCellRenderer();
      try { 
        Controller.showCommonJColorChooserDialog(defaultListCellRenderer0, "optimizespeed", (Color) null);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }
}
