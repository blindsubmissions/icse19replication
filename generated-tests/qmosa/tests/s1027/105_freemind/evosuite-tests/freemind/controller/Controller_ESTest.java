/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 15:57:20 GMT 2018
 */

package freemind.controller;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import freemind.controller.Controller;
import freemind.controller.MapModuleManager;
import freemind.extensions.ExportHook;
import freemind.main.FreeMind;
import freemind.main.FreeMindApplet;
import freemind.main.FreeMindMain;
import freemind.modes.browsemode.BrowseMode;
import freemind.modes.filemode.FileController;
import freemind.modes.mindmapmode.MindMapMode;
import freemind.preferences.FreemindPropertyListener;
import freemind.view.MapModule;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentEvent;
import java.awt.event.WindowEvent;
import java.io.File;
import java.util.Properties;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JTabbedPane;
import javax.swing.plaf.metal.MetalLabelUI;
import org.apache.xml.serializer.ToUnknownStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
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
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[22];
      byteArray0[0] = (byte) (-64);
      byteArray0[1] = (byte)8;
      byteArray0[2] = (byte) (-33);
      byteArray0[3] = (byte) (-63);
      byteArray0[4] = (byte) (-54);
      byteArray0[5] = (byte)119;
      byteArray0[6] = (byte) (-1);
      byteArray0[7] = (byte) (-10);
      ImageIcon imageIcon0 = new ImageIcon(byteArray0);
      JCheckBox jCheckBox0 = new JCheckBox(imageIcon0);
      Color color0 = Color.DARK_GRAY;
      try { 
        Controller.showCommonJColorChooserDialog(jCheckBox0, "", color0);
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
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      BrowseMode browseMode0 = new BrowseMode();
      browseMode0.getController();
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
      Controller.getCommonJColorChooser();
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
  //Test case number: 4
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      System.setCurrentTimeMillis((-617L));
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
  //Test case number: 5
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
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
