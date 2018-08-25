/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 10:56:16 GMT 2018
 */

package accessories.plugins.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import accessories.plugins.time.JDayChooser;
import accessories.plugins.time.JMonthChooser;
import accessories.plugins.time.JYearChooser;
import freemind.controller.StructuredMenuHolder;
import freemind.controller.StructuredMenuItemHolder;
import freemind.modes.MindIcon;
import freemind.modes.Mode;
import freemind.modes.filemode.FileController;
import freemind.modes.mindmapmode.MindMapController;
import freemind.view.mindmapview.attributeview.AttributePopupMenu;
import java.awt.AWTKeyStroke;
import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.TextArea;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.awt.image.MemoryImageSource;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import javax.swing.Action;
import javax.swing.Box;
import javax.swing.DebugGraphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JRootPane;
import javax.swing.JTable;
import javax.swing.MenuElement;
import javax.swing.MenuSelectionManager;
import javax.swing.event.MenuKeyEvent;
import org.apache.batik.css.parser.Parser;
import org.apache.batik.gvt.RootGraphicsNode;
import org.apache.batik.svggen.ImageHandlerJPEGEncoder;
import org.apache.fop.pdf.PDFDocument;
import org.apache.fop.pdf.PDFInfo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import plugins.map.MapDialog;
import plugins.map.Registration;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JDayChooser_ESTest extends JDayChooser_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=3.178053830347946
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      int int0 = 0;
      int[] intArray0 = new int[2];
      intArray0[0] = 0;
      intArray0[1] = 0;
      jDayChooser_DecoratorButton0.firePropertyChange("_=,lyS!CL':\"", '(', '2');
      Hashtable<JButton, Calendar> hashtable0 = new Hashtable<JButton, Calendar>();
      HashMap<JButton, MockGregorianCalendar> hashMap0 = new HashMap<JButton, MockGregorianCalendar>();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(9999, 2161, (-30), 0, 234);
      hashMap0.put(jDayChooser_DecoratorButton0, mockGregorianCalendar0);
      hashtable0.putAll(hashMap0);
      MemoryImageSource memoryImageSource0 = new MemoryImageSource(0, 0, intArray0, 0, 9999, hashtable0);
      Image image0 = jDayChooser0.createImage((ImageProducer) memoryImageSource0);
      jDayChooser_DecoratorButton0.getVerifyInputWhenFocusTarget();
      jDayChooser0.prepareImage(image0, (ImageObserver) jDayChooser_DecoratorButton0);
      jDayChooser_DecoratorButton0.isFocusable();
      Date date0 = jDayChooser0.minSelectableDate;
      jDayChooser0.setMinSelectableDate(date0);
      jDayChooser0.setYear(0);
      jDayChooser0.addListeners(0);
      jDayChooser0.getMinSelectableDate();
      jDayChooser0.getDaysInMonth();
      jDayChooser0.getMaxDayCharacters();
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
  //Test case number: 1
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String[] stringArray0 = new String[0];
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
  //Test case number: 2
  /*Coverage entropy=2.566314107430989
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser0.getFocusTraversalPolicy();
      jDayChooser_DecoratorButton0.isFocusable();
      jDayChooser0.decorationBordersVisible = false;
      int int0 = 86;
      jDayChooser0.removeAll();
      jDayChooser0.setDay(86);
      SystemColor systemColor0 = SystemColor.menu;
      String string0 = null;
      float[] floatArray0 = new float[2];
      floatArray0[0] = (float) 86;
      floatArray0[1] = (float) 86;
      // Undeclared exception!
      try { 
        systemColor0.getRGBColorComponents(floatArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("java.awt.Color", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.7107572577786656
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setDecorationBackgroundVisible(true);
      jDayChooser0.isFocusOwner();
      jDayChooser0.setIgnoreRepaint(true);
      jDayChooser0.setWeekOfYearVisible(false);
      int int0 = (-2742);
      FocusEvent focusEvent0 = new FocusEvent(jDayChooser0, (-2742));
      focusEvent0.paramString();
      JButton[] jButtonArray0 = new JButton[2];
      JButton jButton0 = new JButton();
      jButtonArray0[0] = jButton0;
      MindIcon mindIcon0 = MindIcon.factory("");
      ImageIcon imageIcon0 = mindIcon0.getIcon();
      JButton jButton1 = new JButton((String) null, imageIcon0);
      jButtonArray0[1] = jButton1;
      jDayChooser0.weeks = jButtonArray0;
      focusEvent0.getOppositeComponent();
      jDayChooser0.focusLost(focusEvent0);
      // Undeclared exception!
      try { 
        jDayChooser0.drawDays();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("accessories.plugins.time.JDayChooser", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=3.0910424533583143
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.decorationBordersVisible = false;
      int int0 = 10025;
      FocusEvent focusEvent0 = new FocusEvent(jDayChooser0, 10025);
      focusEvent0.paramString();
      focusEvent0.getOppositeComponent();
      jDayChooser0.focusGained(focusEvent0);
      jDayChooser0.isDecorationBordersVisible();
      jDayChooser0.setAlwaysFireDayProperty(false);
      jDayChooser0.setDay(10025);
      jDayChooser0.setWeekOfYearVisible(false);
      jDayChooser0.setDecorationBackgroundVisible(true);
      jDayChooser0.init();
      long long0 = 0L;
      int int1 = 2685;
      char char0 = 'i';
      MenuElement[] menuElementArray0 = new MenuElement[2];
      JMenu jMenu0 = new JMenu((String) null, true);
      MapDialog mapDialog0 = new MapDialog();
      // Undeclared exception!
      try { 
        mapDialog0.getRegistration();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("freemind.extensions.HookAdapter", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      boolean boolean0 = false;
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.getHierarchyBoundsListeners();
      jDayChooser0.transferFocus();
      ActionEvent actionEvent0 = new ActionEvent(jDayChooser0, 79, "rf[MiDX!e$~ZG;tG@ ,", 79, 0);
      Object object0 = jDayChooser0.getTreeLock();
      actionEvent0.setSource(object0);
      Window.Type window_Type0 = Window.Type.NORMAL;
      Window.Type.values();
      actionEvent0.setSource(window_Type0);
      actionEvent0.paramString();
      // Undeclared exception!
      try { 
        jDayChooser0.actionPerformed(actionEvent0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.awt.Window$Type cannot be cast to javax.swing.JButton
         //
         verifyException("accessories.plugins.time.JDayChooser", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.7438550678980893
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.getUI();
      jDayChooser0.setYear((-2172));
      jDayChooser0.updateUI();
      Date date0 = jDayChooser0.getMinSelectableDate();
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser_DecoratorButton0.isFocusable();
      jDayChooser0.setMaxSelectableDate(date0);
      TextArea textArea0 = null;
      try {
        textArea0 = new TextArea((-2172), 0);
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
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      boolean boolean0 = true;
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.isWeekOfYearVisible();
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      DebugGraphics debugGraphics0 = new DebugGraphics();
      Color color0 = jDayChooser0.getSundayForeground();
      // Undeclared exception!
      try { 
        debugGraphics0.setXORMode(color0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("javax.swing.DebugGraphics", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=3.0910424533583143
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getLocale();
      jDayChooser0.getPopupLocation((MouseEvent) null);
      jDayChooser0.setEnabled(false);
      FocusEvent focusEvent0 = new FocusEvent(jDayChooser0, 0, false);
      jDayChooser0.focusLost(focusEvent0);
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=3.2958368660043296
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.getMaxDayCharacters();
      jDayChooser0.drawWeeks();
      MockDate mockDate0 = new MockDate();
      Date date0 = jDayChooser0.setMaxSelectableDate(mockDate0);
      jDayChooser0.minSelectableDate = date0;
      jDayChooser0.getBaseline(0, 0);
      FocusEvent focusEvent0 = new FocusEvent(jDayChooser0, 1274);
      focusEvent0.paramString();
      Object object0 = jDayChooser0.getTreeLock();
      focusEvent0.setSource(object0);
      jDayChooser0.focusLost(focusEvent0);
      JMonthChooser jMonthChooser0 = new JMonthChooser(false);
      jMonthChooser0.getPropertyChangeListeners();
      jDayChooser0.setMonthChooser(jMonthChooser0);
      jDayChooser0.getMinSelectableDate();
      jDayChooser0.setYear(0);
      jDayChooser0.setEnabled(false);
      jDayChooser0.setWeekOfYearVisible(true);
      jDayChooser0.getMaxSelectableDate();
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getLocale();
      jDayChooser0.isDayBordersVisible();
      DelayQueue<Delayed> delayQueue0 = new DelayQueue<Delayed>();
      delayQueue0.poll();
      ActionEvent actionEvent0 = null;
      try {
        actionEvent0 = new ActionEvent((Object) null, 0, "scale");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null source
         //
         verifyException("java.util.EventObject", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=3.0910424533583143
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setFocus();
      jDayChooser0.getDecorationBackgroundColor();
      JDayChooser jDayChooser1 = new JDayChooser(true);
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 21, 21, 141, 21, 'K');
      jDayChooser1.keyTyped(keyEvent0);
      assertEquals(14, jDayChooser1.getDay());
      assertFalse(jDayChooser1.isDecorationBordersVisible());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.5983833927870665
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.setMonth(1338);
      assertTrue(jDayChooser0.isWeekOfYearVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.555867851282148
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Component component0 = Box.createGlue();
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent(component0, 999, 0L, 1118, 999, 30, 676, (-3217), 30, true, 30, 999, 3614);
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getToolTipText((MouseEvent) mouseWheelEvent0);
      jDayChooser0.setDay((-968));
      assertEquals(1, jDayChooser0.getDay());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.759895175471732
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.getMaxDayCharacters();
      jDayChooser0.drawWeeks();
      MockDate mockDate0 = new MockDate();
      Date date0 = jDayChooser0.setMaxSelectableDate(mockDate0);
      jDayChooser0.minSelectableDate = date0;
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent(jDayChooser0, 164, (-1L), 999, (-741), 999, 164, (-1025), 0, false, 0, 286, 999);
      jDayChooser0.getToolTipText((MouseEvent) mouseWheelEvent0);
      assertEquals(14, jDayChooser0.getDay());
      
      jDayChooser0.setDay(406);
      jDayChooser0.getDay();
      jDayChooser0.setSelectableDateRange(mockDate0, date0);
      assertEquals(28, jDayChooser0.getDay());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=3.2188758248681983
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      Locale locale0 = Locale.ITALIAN;
      jDayChooser0.getPopupLocation((MouseEvent) null);
      jDayChooser0.setEnabled(false);
      RootGraphicsNode rootGraphicsNode0 = new RootGraphicsNode();
      Locale.filter((List<Locale.LanguageRange>) rootGraphicsNode0, (Collection<Locale>) rootGraphicsNode0);
      jDayChooser0.setLocale(locale0);
      MockDate mockDate0 = new MockDate();
      jDayChooser0.setMaxSelectableDate(mockDate0);
      jDayChooser0.isDecorationBackgroundVisible();
      jDayChooser0.setMonth((-7));
      jDayChooser0.getWeekdayForeground();
      assertTrue(jDayChooser0.isDayBordersVisible());
      
      jDayChooser0.setDayBordersVisible(false);
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=3.0910424533583143
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setFocus();
      JDayChooser jDayChooser1 = new JDayChooser(true);
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 21, 21, 21, 21, 'K');
      jDayChooser1.keyTyped(keyEvent0);
      jDayChooser0.keyReleased(keyEvent0);
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=3.0910424533583143
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.getMaxDayCharacters();
      jDayChooser0.drawWeeks();
      MockDate mockDate0 = new MockDate();
      Date date0 = jDayChooser0.setMaxSelectableDate(mockDate0);
      jDayChooser0.minSelectableDate = date0;
      JDayChooser jDayChooser1 = new JDayChooser(true);
      JYearChooser jYearChooser0 = new JYearChooser();
      jDayChooser1.yearChooser = jYearChooser0;
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser1, 21, (-2497L), 164, 0, '2');
      jDayChooser1.keyTyped(keyEvent0);
      assertTrue(jDayChooser1.isWeekOfYearVisible());
      
      System.setCurrentTimeMillis(164);
      Color color0 = Color.GREEN;
      jDayChooser0.setSundayForeground(color0);
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.7107572577786656
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.isDecorationBordersVisible();
      jDayChooser0.firePropertyChange("PM:Fc`xvhuq", 676, 29);
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent(jDayChooser0, 1191, 1191, 676, (-2281), 31, 31, 31, 8388607, false, 900, 30, (-58));
      mouseWheelEvent0.getModifiersEx();
      JDayChooser jDayChooser1 = new JDayChooser();
      jDayChooser1.getToolTipText((MouseEvent) mouseWheelEvent0);
      jDayChooser1.setDay(4812);
      Color color0 = Color.lightGray;
      jDayChooser1.setDecorationBackgroundColor(color0);
      assertEquals(28, jDayChooser1.getDay());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getMaximumSize();
      jDayChooser0.getDayPanel();
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setFocusCycleRoot(true);
      jDayChooser0.setEnabled(true);
      MockGregorianCalendar mockGregorianCalendar0 = (MockGregorianCalendar)jDayChooser0.today;
      jDayChooser0.setCalendar(mockGregorianCalendar0);
      ImageHandlerJPEGEncoder imageHandlerJPEGEncoder0 = null;
      try {
        imageHandlerJPEGEncoder0 = new ImageHandlerJPEGEncoder("day", "day");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // imageDir does not exist
         //
         verifyException("org.apache.batik.svggen.AbstractImageHandlerEncoder", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=3.178053830347946
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      Locale locale0 = Locale.ITALIAN;
      jDayChooser0.setEnabled(false);
      RootGraphicsNode rootGraphicsNode0 = new RootGraphicsNode();
      Locale.filter((List<Locale.LanguageRange>) rootGraphicsNode0, (Collection<Locale>) rootGraphicsNode0);
      jDayChooser0.setLocale(locale0);
      MockDate mockDate0 = new MockDate();
      jDayChooser0.setWeekOfYearVisible(false);
      jDayChooser0.setMinSelectableDate(mockDate0);
      Color color0 = Color.PINK;
      jDayChooser0.setWeekdayForeground(color0);
      System.setCurrentTimeMillis((-3830L));
  }

  /**
  //Test case number: 22
  /*Coverage entropy=2.7438550678980893
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, true);
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, (-2394), (-2394), (-2394), (-2394), 'K');
      jDayChooser0.keyTyped(keyEvent0);
      PDFDocument pDFDocument0 = new PDFDocument("day");
      PDFInfo pDFInfo0 = pDFDocument0.getInfo();
      pDFInfo0.getCreationDate();
      jDayChooser0.setMaxSelectableDate((Date) null);
      JDayChooser jDayChooser1 = new JDayChooser();
      jDayChooser1.isDecorationBackgroundVisible();
      assertEquals(14, jDayChooser1.getDay());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=2.8421151244608924
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getInsets();
      DebugGraphics debugGraphics0 = new DebugGraphics();
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser_DecoratorButton0.paint(debugGraphics0);
      int int0 = jDayChooser0.getMaxDayCharacters();
      assertEquals(0, int0);
      
      JDayChooser jDayChooser1 = new JDayChooser();
      StructuredMenuHolder structuredMenuHolder0 = new StructuredMenuHolder();
      JMenu jMenu0 = new JMenu("day", true);
      JMenu jMenu1 = structuredMenuHolder0.addMenu(jMenu0, "day");
      JMenuItem jMenuItem0 = jMenu1.add("day");
      KeyEvent keyEvent0 = new KeyEvent(jMenuItem0, 232, (-685L), 0, 8908, 'n');
      jDayChooser0.keyPressed(keyEvent0);
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 24
  /*Coverage entropy=2.7252378164437348
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      Locale locale0 = Locale.ITALIAN;
      RootGraphicsNode rootGraphicsNode0 = new RootGraphicsNode();
      Locale.filter((List<Locale.LanguageRange>) rootGraphicsNode0, (Collection<Locale>) rootGraphicsNode0);
      jDayChooser0.setLocale(locale0);
      MockDate mockDate0 = new MockDate();
      jDayChooser0.setMonth(18432);
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 25
  /*Coverage entropy=2.7329045285804874
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)20;
      byteArray0[1] = (byte)27;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      JDayChooser jDayChooser0 = new JDayChooser();
      Parser parser0 = new Parser();
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent(jDayChooser0, (-741), (byte)20, (byte)20, (-1), 35, 39, (-1), 2370, false, 286, (-412), 410);
      jDayChooser0.getToolTipText((MouseEvent) mouseWheelEvent0);
      jDayChooser0.setDay(1117);
      jDayChooser0.getDay();
      Instant instant0 = MockInstant.now();
      MockInstant.minusSeconds(instant0, (byte)27);
      Color color0 = Color.lightGray;
      jDayChooser0.setDecorationBackgroundColor(color0);
      jDayChooser0.setMonth(28);
      assertEquals(31, jDayChooser0.getDay());
  }

  /**
  //Test case number: 26
  /*Coverage entropy=3.178053830347946
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.setMaxDayCharacters(639);
      DebugGraphics debugGraphics0 = new DebugGraphics();
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser_DecoratorButton0.paint(debugGraphics0);
      int int0 = jDayChooser0.getMaxDayCharacters();
      assertEquals(0, int0);
      
      JDayChooser jDayChooser1 = new JDayChooser();
      jDayChooser0.setMonth(10);
      assertEquals(14, jDayChooser0.getDay());
      
      JYearChooser jYearChooser0 = jDayChooser0.yearChooser;
      jDayChooser1.setYearChooser((JYearChooser) null);
      assertTrue(jDayChooser1.isDayBordersVisible());
      assertFalse(jDayChooser1.isWeekOfYearVisible());
  }

  /**
  //Test case number: 27
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      Box.createGlue();
      JDayChooser jDayChooser1 = new JDayChooser(false);
      jDayChooser1.getSelectedDay();
      jDayChooser0.selectedDay = null;
      jDayChooser1.createVolatileImage((-425), 11);
      jDayChooser0.setEnabled(false);
      jDayChooser1.setEnabled(false);
      JDayChooser jDayChooser2 = new JDayChooser(true);
      assertFalse(jDayChooser2.isDecorationBordersVisible());
      assertEquals(14, jDayChooser2.getDay());
      assertTrue(jDayChooser2.isDayBordersVisible());
  }

  /**
  //Test case number: 28
  /*Coverage entropy=2.729267023454784
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setEnabled(false);
      Object[][] objectArray0 = new Object[4][5];
      Object object0 = jDayChooser0.getTreeLock();
      Object[] objectArray1 = new Object[2];
      objectArray1[0] = (Object) jDayChooser0;
      objectArray1[1] = (Object) jDayChooser0;
      objectArray0[1] = objectArray1;
      Object[] objectArray2 = new Object[9];
      objectArray2[0] = object0;
      objectArray2[1] = (Object) jDayChooser0;
      objectArray2[2] = (Object) jDayChooser0;
      objectArray2[3] = object0;
      objectArray2[4] = object0;
      objectArray2[5] = object0;
      objectArray2[6] = object0;
      objectArray2[7] = (Object) jDayChooser0;
      objectArray2[8] = object0;
      objectArray0[2] = objectArray2;
      Object[] objectArray3 = new Object[1];
      objectArray3[0] = object0;
      objectArray0[3] = objectArray3;
      JTable jTable0 = new JTable(objectArray0, objectArray3);
      jDayChooser0.setMaxDayCharacters((-87));
      jDayChooser0.setMaxDayCharacters((-1437625606));
      jDayChooser0.setMaxDayCharacters((-3603));
      assertEquals(14, jDayChooser0.getDay());
      assertEquals(0, jDayChooser0.getMaxDayCharacters());
  }
}
