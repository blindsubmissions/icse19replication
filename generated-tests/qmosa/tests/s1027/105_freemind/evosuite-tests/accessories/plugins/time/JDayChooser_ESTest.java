/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 15:46:36 GMT 2018
 */

package accessories.plugins.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import accessories.plugins.time.JDayChooser;
import freemind.controller.MenuBar;
import freemind.main.FreeMind;
import freemind.main.FreeMindApplet;
import freemind.main.Resources;
import freemind.modes.filemode.FileController;
import freemind.modes.schememode.SchemeMode;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Point;
import java.awt.datatransfer.Transferable;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetContext;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import java.beans.VetoableChangeListener;
import java.beans.VetoableChangeListenerProxy;
import java.io.File;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JDialog;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.MenuElement;
import javax.swing.MenuSelectionManager;
import javax.swing.TransferHandler;
import javax.swing.event.AncestorListener;
import javax.swing.event.MenuKeyEvent;
import javax.swing.plaf.basic.BasicToolBarUI;
import javax.swing.plaf.metal.MetalToolBarUI;
import javax.swing.plaf.metal.MetalTreeUI;
import javax.swing.text.DefaultCaret;
import org.apache.xml.dtm.ref.CoroutineManager;
import org.apache.xml.dtm.ref.IncrementalSAXSource_Filter;
import org.apache.xml.serializer.ToHTMLSAXHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.hsqldb.jdbc.jdbcCallableStatement;
import org.hsqldb.jdbc.jdbcConnection;
import org.hsqldb.persist.HsqlProperties;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JDayChooser_ESTest extends JDayChooser_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      ActionEvent actionEvent0 = new ActionEvent(jDayChooser0, 49, "", 1014);
      jDayChooser0.createToolTip();
      AncestorListener ancestorListener0 = mock(AncestorListener.class, new ViolatedAssumptionAnswer());
      jDayChooser0.removeAncestorListener(ancestorListener0);
      // Undeclared exception!
      try { 
        jDayChooser0.actionPerformed(actionEvent0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // accessories.plugins.time.JDayChooser cannot be cast to javax.swing.JButton
         //
         verifyException("accessories.plugins.time.JDayChooser", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      int int0 = jDayChooser0.getDay();
      assertEquals(14, int0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=3.2958368660043296
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.setVerifyInputWhenFocusTarget(true);
      jDayChooser0.getBorder();
      jDayChooser0.repaint();
      jDayChooser0.isDayBordersVisible();
      Date date0 = jDayChooser0.getMaxSelectableDate();
      jDayChooser0.setMaxSelectableDate(date0);
      Color color0 = jDayChooser0.getDecorationBackgroundColor();
      float[] floatArray0 = new float[9];
      floatArray0[0] = 373.37494F;
      floatArray0[1] = 1528.0F;
      floatArray0[2] = 0.0F;
      floatArray0[3] = 0.143F;
      floatArray0[4] = 911.3F;
      floatArray0[5] = 627.6685F;
      floatArray0[6] = 525.0F;
      floatArray0[7] = (-394.2F);
      floatArray0[8] = 0.0F;
      color0.getRGBComponents(floatArray0);
      Color.getColor("day");
      jDayChooser0.setSundayForeground(color0);
      jDayChooser0.setMinSelectableDate(date0);
      jDayChooser0.init();
      jDayChooser0.getDayPanel();
      MetalToolBarUI metalToolBarUI0 = new MetalToolBarUI();
      metalToolBarUI0.getFloatingColor();
      jDayChooser0.setWeekdayForeground((Color) null);
      jDayChooser0.setMaxDayCharacters((-911));
      assertTrue(jDayChooser0.isWeekOfYearVisible());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.setFocus();
      jDayChooser0.day = 0;
      // Undeclared exception!
      try { 
        jDayChooser0.getTemporaryCalendar();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("accessories.plugins.time.JDayChooser", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.isOptimizedDrawingEnabled();
      jDayChooser0.setDropTarget((DropTarget) null);
      Color color0 = jDayChooser0.getWeekdayForeground();
      jDayChooser0.setSundayForeground(color0);
      int int0 = 0;
      int int1 = 773;
      char char0 = 'X';
      MenuElement[] menuElementArray0 = new MenuElement[8];
      jDayChooser0.getComponentPopupMenu();
      menuElementArray0[0] = (MenuElement) null;
      SchemeMode schemeMode0 = new SchemeMode();
      FileController fileController0 = null;
      try {
        fileController0 = new FileController(schemeMode0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("freemind.modes.ControllerAdapter", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=3.094825497977894
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      VetoableChangeListener vetoableChangeListener0 = mock(VetoableChangeListener.class, new ViolatedAssumptionAnswer());
      VetoableChangeListenerProxy vetoableChangeListenerProxy0 = new VetoableChangeListenerProxy("s9(quOS7", vetoableChangeListener0);
      jDayChooser0.removeVetoableChangeListener(vetoableChangeListenerProxy0);
      jDayChooser0.getContainerListeners();
      jDayChooser0.isOpaque();
      jDayChooser0.setWeekOfYearVisible(false);
      jDayChooser0.setYear(0);
      jDayChooser0.drawDays();
      jDayChooser0.keyTyped((KeyEvent) null);
      jDayChooser0.drawDays();
      jDayChooser0.setMaxDayCharacters(0);
      Date date0 = jDayChooser0.getMaxSelectableDate();
      FocusEvent focusEvent0 = new FocusEvent(jDayChooser0, 1572, true, jDayChooser0);
      focusEvent0.setSource((Object) null);
      jDayChooser0.focusGained(focusEvent0);
      jDayChooser0.isDecorationBackgroundVisible();
      jDayChooser0.setSelectableDateRange(date0, date0);
      Date date1 = jDayChooser0.setMinSelectableDate(date0);
      jDayChooser0.setMinSelectableDate(date1);
      // Undeclared exception!
      try { 
        JDayChooser.main((String[]) null);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=3.178053830347946
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.getWeekdayForeground();
      jDayChooser0.getVisibleRect();
      jDayChooser0.getHierarchyListeners();
      jDayChooser0.getSelectedDay();
      jDayChooser0.setDay(2002);
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      DefaultCaret defaultCaret0 = new DefaultCaret();
      jDayChooser_DecoratorButton0.addMouseListener(defaultCaret0);
      jDayChooser0.getLocale();
      jDayChooser0.getDecorationBackgroundColor();
      jDayChooser0.setMaxDayCharacters(0);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "day";
      stringArray0[1] = "day";
      stringArray0[2] = "day";
      stringArray0[3] = "day";
      stringArray0[4] = "day";
      stringArray0[5] = "day";
      stringArray0[6] = "day";
      // Undeclared exception!
      try { 
        JDayChooser.main(stringArray0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.555867851282148
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setDecorationBackgroundVisible(false);
      jDayChooser0.setDay(0);
      Color color0 = Color.WHITE;
      jDayChooser0.setForeground(color0);
      assertEquals(1, jDayChooser0.getDay());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.7107572577786656
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.maxDayCharacters = (-1245);
      jDayChooser0.setYear(0);
      assertFalse(jDayChooser0.isWeekOfYearVisible());
      
      jDayChooser0.setWeekOfYearVisible(true);
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=3.178053830347946
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.getWeekdayForeground();
      jDayChooser0.getVisibleRect();
      jDayChooser0.getHierarchyListeners();
      jDayChooser0.getSelectedDay();
      jDayChooser0.setDay(2002);
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      DefaultCaret defaultCaret0 = new DefaultCaret();
      jDayChooser_DecoratorButton0.addMouseListener(defaultCaret0);
      jDayChooser0.getLocale();
      jDayChooser0.getDecorationBackgroundColor();
      jDayChooser0.setMaxDayCharacters(0);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "day";
      stringArray0[1] = "day";
      stringArray0[2] = "day";
      stringArray0[3] = "day";
      stringArray0[4] = "day";
      stringArray0[5] = "day";
      stringArray0[6] = "day";
      Color color0 = Color.MAGENTA;
      jDayChooser0.setForeground(color0);
      jDayChooser0.getSundayForeground();
      assertEquals(28, jDayChooser0.getDay());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.transferFocusDownCycle();
      jDayChooser0.setDecorationBackgroundVisible(false);
      jDayChooser0.updateUI();
      jDayChooser0.setDayBordersVisible(true);
      jDayChooser0.addListeners(0);
      assertFalse(jDayChooser0.isDecorationBackgroundVisible());
      
      JDayChooser jDayChooser1 = new JDayChooser(true);
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser1.new DecoratorButton();
      jDayChooser_DecoratorButton0.putClientProperty("freemind.controller.actions.generated.instance.JiBX_bindingTableColumnSetting_access", jDayChooser1);
      jDayChooser_DecoratorButton0.isFocusable();
      assertEquals(14, jDayChooser1.getDay());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      jDayChooser0.setCalendar(mockGregorianCalendar0);
      assertEquals(14, jDayChooser0.getDay());
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392409281320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=3.0910424533583143
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.setMaxDayCharacters(436);
      jDayChooser0.getTransferHandler();
      jDayChooser0.setDecorationBackgroundVisible(true);
      jDayChooser0.getDayPanel();
      jDayChooser0.getDecorationBackgroundColor();
      System.setCurrentTimeMillis(436);
      int int0 = jDayChooser0.getMaxDayCharacters();
      assertEquals(14, jDayChooser0.getDay());
      assertEquals(0, int0);
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertTrue(jDayChooser0.isWeekOfYearVisible());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.8499578092585933
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.setVerifyInputWhenFocusTarget(true);
      jDayChooser0.getBorder();
      jDayChooser0.repaint();
      jDayChooser0.isDayBordersVisible();
      Date date0 = jDayChooser0.getMaxSelectableDate();
      jDayChooser0.setMaxSelectableDate(date0);
      float[] floatArray0 = new float[9];
      floatArray0[0] = 373.37494F;
      floatArray0[1] = 1528.0F;
      floatArray0[2] = 0.0F;
      floatArray0[3] = 0.143F;
      floatArray0[4] = 911.3F;
      floatArray0[5] = 627.6685F;
      floatArray0[6] = 525.0F;
      floatArray0[7] = (-394.2F);
      floatArray0[8] = 0.0F;
      Color.getColor("day");
      jDayChooser0.setMinSelectableDate(date0);
      jDayChooser0.init();
      jDayChooser0.getDayPanel();
      MetalToolBarUI metalToolBarUI0 = new MetalToolBarUI();
      metalToolBarUI0.getFloatingColor();
      jDayChooser0.setWeekdayForeground((Color) null);
      jDayChooser0.setMaxDayCharacters((-911));
      assertEquals(14, jDayChooser0.getDay());
      
      jDayChooser0.setDay((-911));
      jDayChooser0.updateUI();
      jDayChooser0.setMonth((-2533));
      assertEquals(1, jDayChooser0.getDay());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.65970797168196
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.setFocus();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      BasicToolBarUI basicToolBarUI0 = new BasicToolBarUI();
      basicToolBarUI0.getDockingColor();
      jDayChooser0.setDecorationBackgroundColor((Color) null);
      jDayChooser0.init();
      assertTrue(jDayChooser0.isWeekOfYearVisible());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.setYear(11);
      jDayChooser0.keyReleased((KeyEvent) null);
      jDayChooser0.setDayBordersVisible(true);
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=3.1354942159291497
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getBaselineResizeBehavior();
      jDayChooser0.setEnabled(true);
      jDayChooser0.setDayBordersVisible(true);
      int int0 = (-499);
      FocusEvent focusEvent0 = new FocusEvent(jDayChooser0, (-499), false, jDayChooser0);
      jDayChooser0.focusLost(focusEvent0);
      jDayChooser0.setDayBordersVisible(false);
      jDayChooser0.setEnabled(false);
      jDayChooser0.setMaxDayCharacters(34);
      jDayChooser0.setWeekOfYearVisible(false);
      Resources resources0 = Resources.getInstance();
      Properties properties0 = resources0.getProperties();
      HsqlProperties hsqlProperties0 = new HsqlProperties(properties0);
      jdbcConnection jdbcConnection0 = null;
      try {
        jdbcConnection0 = new jdbcConnection(hsqlProperties0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.hsqldb.Trace", e);
      }
  }
}
