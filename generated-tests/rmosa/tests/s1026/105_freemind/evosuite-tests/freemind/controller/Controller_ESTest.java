/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 17:41:39 GMT 2018
 */

package freemind.controller;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import freemind.controller.Controller;
import freemind.main.FreeMindMain;
import freemind.modes.mindmapmode.MindMapMode;
import freemind.modes.schememode.SchemeMode;
import freemind.preferences.FreemindPropertyListener;
import java.awt.HeadlessException;
import java.awt.SystemColor;
import java.awt.event.WindowEvent;
import java.util.Collection;
import javax.swing.Box;
import javax.swing.JOptionPane;
import javax.swing.MenuElement;
import javax.swing.MenuSelectionManager;
import javax.swing.event.MenuKeyEvent;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Controller_ESTest extends Controller_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MindMapMode mindMapMode0 = new MindMapMode();
      mindMapMode0.getController();
      Box box0 = Box.createHorizontalBox();
      SystemColor systemColor0 = SystemColor.inactiveCaptionBorder;
      try { 
        Controller.showCommonJColorChooserDialog(box0, "1.8.0_181", systemColor0);
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
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Collection collection0 = Controller.getPropertyChangeListeners();
      assertNotNull(collection0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Controller.DisposeOnClose controller_DisposeOnClose0 = new Controller.DisposeOnClose();
      JOptionPane jOptionPane0 = new JOptionPane();
      MenuElement[] menuElementArray0 = new MenuElement[1];
      MenuKeyEvent menuKeyEvent0 = new MenuKeyEvent(jOptionPane0, 0, 0, 0, 0, '\\', menuElementArray0, (MenuSelectionManager) null);
      // Undeclared exception!
      try { 
        controller_DisposeOnClose0.componentHidden(menuKeyEvent0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // javax.swing.JOptionPane cannot be cast to java.awt.Window
         //
         verifyException("freemind.controller.Controller$DisposeOnClose", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
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
  //Test case number: 4
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
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

  /**
  //Test case number: 6
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
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
  //Test case number: 7
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Controller.removePropertyChangeListener((FreemindPropertyListener) null);
  }
}
