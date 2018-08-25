/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 13:28:57 GMT 2018
 */

package accessories.plugins.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import accessories.plugins.time.JDayChooser;
import accessories.plugins.time.JMonthChooser;
import accessories.plugins.time.JYearChooser;
import java.awt.AWTEventMulticaster;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.ScrollPane;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.awt.image.MemoryImageSource;
import java.sql.Time;
import java.text.AttributedCharacterIterator;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Vector;
import javax.help.BackAction;
import javax.help.JHelpTOCNavigator;
import javax.help.plaf.basic.BasicTOCNavigatorUI;
import javax.swing.DebugGraphics;
import javax.swing.Icon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTable;
import javax.swing.MenuElement;
import javax.swing.MenuSelectionManager;
import javax.swing.event.AncestorListener;
import javax.swing.event.MenuDragMouseEvent;
import javax.swing.plaf.basic.BasicCheckBoxUI;
import org.apache.batik.gvt.text.GVTAttributedCharacterIterator;
import org.apache.fop.fonts.FontInfo;
import org.apache.fop.pdf.PDFDocument;
import org.apache.fop.pdf.PDFResourceContext;
import org.apache.fop.pdf.PDFResources;
import org.apache.fop.svg.PDFDocumentGraphics2D;
import org.apache.fop.svg.PDFGraphics2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.time.MockLocalTime;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import org.openstreetmap.gui.jmapviewer.tilesources.OsmTileSource;
import plugins.map.FreeMindMapController;
import plugins.map.MapDialog;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JDayChooser_ESTest extends JDayChooser_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      DebugGraphics debugGraphics0 = new DebugGraphics((Graphics) null);
      jDayChooser0.printAll(debugGraphics0);
      jDayChooser0.getUI();
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser0.getSundayForeground();
      jDayChooser0.setAlwaysFireDayProperty(true);
      GridLayout gridLayout0 = new GridLayout();
      jDayChooser0.setLayout(gridLayout0);
      assertTrue(jDayChooser0.isDayBordersVisible());
      
      jDayChooser0.setDayBordersVisible(false);
      jDayChooser0.getDaysInMonth();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(28, 28, 28, 28, 28);
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      jDayChooser0.setMaxSelectableDate(date0);
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getPropertyChangeListeners();
      jDayChooser0.getColorModel();
      jDayChooser0.initDecorations();
      String[] stringArray0 = new String[1];
      JButton[] jButtonArray0 = new JButton[3];
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jButtonArray0[0] = (JButton) jDayChooser_DecoratorButton0;
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton1 = jDayChooser0.new DecoratorButton();
      jButtonArray0[1] = (JButton) jDayChooser_DecoratorButton1;
      BasicCheckBoxUI basicCheckBoxUI0 = new BasicCheckBoxUI();
      basicCheckBoxUI0.getDefaultIcon();
      JButton jButton0 = new JButton((Icon) null);
      jButtonArray0[2] = jButton0;
      jDayChooser0.days = jButtonArray0;
      jDayChooser_DecoratorButton0.isSelected();
      stringArray0[0] = "day";
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
  /*Coverage entropy=2.637304661672375
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getPropertyChangeListeners("+H");
      jDayChooser0.setBounds((-256), (-256), 0, (-256));
      // Undeclared exception!
      try { 
        jDayChooser0.setLocale((Locale) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      boolean boolean0 = jDayChooser0.isDayBordersVisible();
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=3.1354942159291497
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.weekPanel = null;
      jDayChooser0.setYear((-579));
      jDayChooser0.getFocusTraversalPolicy();
      jDayChooser0.setDecorationBackgroundVisible(true);
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 216, 216, 216, 12303, 'e');
      KeyEvent.getKeyText(216);
      KeyEvent.getExtendedKeyCodeForChar(12303);
      keyEvent0.setKeyCode(12303);
      jDayChooser0.keyTyped(keyEvent0);
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      
      jDayChooser0.updateUI();
      jDayChooser0.setYear(1693);
      JMonthChooser jMonthChooser0 = new JMonthChooser();
      jMonthChooser0.setFocusTraversalPolicyProvider(true);
      jMonthChooser0.repaint((long) 1693);
      jMonthChooser0.getAlignmentX();
      jDayChooser0.setMonthChooser(jMonthChooser0);
      jDayChooser0.drawWeeks();
      jDayChooser0.getMinSelectableDate();
      jDayChooser0.drawDays();
      jDayChooser0.setMonthChooser(jMonthChooser0);
      jDayChooser0.keyTyped(keyEvent0);
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      PDFDocumentGraphics2D pDFDocumentGraphics2D0 = new PDFDocumentGraphics2D();
      pDFDocumentGraphics2D0.getFontInfo();
      PDFResources pDFResources0 = new PDFResources(0);
      PDFResourceContext pDFResourceContext0 = new PDFResourceContext(pDFResources0);
      pDFResourceContext0.getDocument();
      PDFGraphics2D pDFGraphics2D0 = new PDFGraphics2D(true, (FontInfo) null, (PDFDocument) null, pDFResourceContext0, "Z.Cds", "Unknown keyCode: 0xd8", 165.4F);
      jDayChooser_DecoratorButton0.paint(pDFGraphics2D0);
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=3.0910424533583143
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      SystemColor systemColor0 = SystemColor.windowBorder;
      jDayChooser0.setSundayForeground(systemColor0);
      jDayChooser0.getSelectedDay();
      Locale locale0 = Locale.US;
      jDayChooser0.setLocale(locale0);
      Color color0 = jDayChooser0.getWeekdayForeground();
      jDayChooser0.initDecorations();
      float[] floatArray0 = new float[2];
      floatArray0[0] = (-1736.3F);
      floatArray0[1] = (-2811.0F);
      // Undeclared exception!
      try { 
        color0.getRGBColorComponents(floatArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("java.awt.Color", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getDaysInMonth();
      jDayChooser0.isDecorationBackgroundVisible();
      ScrollPane scrollPane0 = null;
      try {
        scrollPane0 = new ScrollPane(28);
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
  /*Coverage entropy=2.7107572577786656
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.getCursor();
      AncestorListener ancestorListener0 = mock(AncestorListener.class, new ViolatedAssumptionAnswer());
      jDayChooser0.addAncestorListener(ancestorListener0);
      jDayChooser0.setFont((Font) null);
      jDayChooser0.setWeekOfYearVisible(false);
      AWTEventMulticaster.remove((MouseMotionListener) null, (MouseMotionListener) null);
      jDayChooser0.removeMouseMotionListener((MouseMotionListener) null);
      jDayChooser0.getLocale();
      jDayChooser0.setDecorationBackgroundVisible(false);
      jDayChooser0.getDay();
      ActionEvent actionEvent0 = null;
      try {
        actionEvent0 = new ActionEvent((Object) null, (-5878), "day");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null source
         //
         verifyException("java.util.EventObject", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.9849507206355423
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      JPanel jPanel0 = jDayChooser0.getDayPanel();
      jPanel0.resetKeyboardActions();
      jDayChooser0.day = 2235;
      jDayChooser0.setMaxDayCharacters((-4));
      jDayChooser0.removeAll();
      jDayChooser0.init();
      jDayChooser0.setMonth((-4));
      jDayChooser0.drawDays();
      jDayChooser0.setYear((-4));
      jDayChooser0.isDecorationBordersVisible();
      jDayChooser0.setName("Dialog Plain 11");
      jDayChooser0.initDecorations();
      OsmTileSource.CycleMap osmTileSource_CycleMap0 = new OsmTileSource.CycleMap();
      osmTileSource_CycleMap0.getAttributionImage();
      jDayChooser0.checkImage((Image) null, 311, (-1798), (ImageObserver) jPanel0);
      FocusEvent focusEvent0 = new FocusEvent(jPanel0, 132, false);
      focusEvent0.paramString();
      jDayChooser0.focusGained(focusEvent0);
      jDayChooser0.isDecorationBordersVisible();
      jDayChooser0.isWeekOfYearVisible();
      jDayChooser0.setFocus();
      assertEquals(30, jDayChooser0.getDay());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=3.178053830347946
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.decorationBackgroundVisible = true;
      jDayChooser0.getPropertyChangeListeners("accessories.plugins.time.JDayChooser");
      jDayChooser0.setMonthChooser((JMonthChooser) null);
      jDayChooser0.setEnabled(true);
      AWTEventMulticaster.remove((MouseMotionListener) null, (MouseMotionListener) null);
      JDayChooser jDayChooser1 = new JDayChooser();
      jDayChooser1.removeMouseMotionListener((MouseMotionListener) null);
      jDayChooser1.getLocale();
      jDayChooser1.setDecorationBackgroundVisible(true);
      jDayChooser1.getDay();
      GVTAttributedCharacterIterator.TextAttribute gVTAttributedCharacterIterator_TextAttribute0 = GVTAttributedCharacterIterator.TextAttribute.WRITING_MODE;
      ActionEvent actionEvent0 = new ActionEvent(gVTAttributedCharacterIterator_TextAttribute0, 14, "West");
      // Undeclared exception!
      try { 
        jDayChooser1.actionPerformed(actionEvent0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.batik.gvt.text.GVTAttributedCharacterIterator$TextAttribute cannot be cast to javax.swing.JButton
         //
         verifyException("accessories.plugins.time.JDayChooser", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.914066666252331
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.decorationBackgroundVisible = true;
      jDayChooser0.getPropertyChangeListeners("accessories.plugins.time.JDayChooser");
      jDayChooser0.setMonthChooser((JMonthChooser) null);
      jDayChooser0.setEnabled(true);
      jDayChooser0.setWeekdayForeground((Color) null);
      Color color0 = jDayChooser0.getSundayForeground();
      float[] floatArray0 = new float[4];
      floatArray0[0] = (float) (-3874);
      floatArray0[1] = (float) 10;
      floatArray0[2] = (float) 10;
      floatArray0[3] = (float) (-3874);
      color0.getRGBColorComponents(floatArray0);
      jDayChooser0.getSelectedDay();
      jDayChooser0.getDayPanel();
      jDayChooser0.setFocus();
      jDayChooser0.setDecorationBackgroundColor(color0);
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      JApplet jApplet0 = null;
      try {
        jApplet0 = new JApplet();
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.applet.Applet", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setAutoscrolls(false);
      jDayChooser0.getMaxSelectableDate();
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.671760120846313
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getSundayForeground();
      jDayChooser0.getDecorationBackgroundColor();
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isWeekOfYearVisible());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      JDayChooser jDayChooser0 = new JDayChooser(false);
      JYearChooser jYearChooser0 = jDayChooser0.yearChooser;
      jDayChooser0.setYearChooser((JYearChooser) null);
      jDayChooser0.setYearChooser((JYearChooser) null);
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=3.178053830347946
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      AncestorListener ancestorListener0 = mock(AncestorListener.class, new ViolatedAssumptionAnswer());
      jDayChooser0.addAncestorListener(ancestorListener0);
      jDayChooser0.setFont((Font) null);
      jDayChooser0.setWeekOfYearVisible(true);
      AWTEventMulticaster.remove((MouseMotionListener) null, (MouseMotionListener) null);
      jDayChooser0.removeMouseMotionListener((MouseMotionListener) null);
      jDayChooser0.getLocale();
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser_DecoratorButton0.repaint(49, 21, 49, 16);
      jDayChooser_DecoratorButton0.isFocusable();
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 21, 21, 21, 21, '-');
      jDayChooser0.keyReleased(keyEvent0);
      jDayChooser0.setMonth(16);
      assertTrue(jDayChooser0.isWeekOfYearVisible());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.580510611766821
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      AncestorListener ancestorListener0 = mock(AncestorListener.class, new ViolatedAssumptionAnswer());
      jDayChooser0.removeAncestorListener(ancestorListener0);
      jDayChooser0.setMinSelectableDate((Date) null);
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.990692146341092
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      JPanel jPanel0 = jDayChooser0.getDayPanel();
      jDayChooser0.day = 2235;
      jDayChooser0.setMaxDayCharacters((-4));
      jDayChooser0.removeAll();
      jDayChooser0.init();
      jDayChooser0.setMonth((-4));
      jDayChooser0.drawDays();
      jDayChooser0.setYear((-4));
      jDayChooser0.isDecorationBordersVisible();
      jDayChooser0.setName("Dialog Plain 11");
      jDayChooser0.initDecorations();
      OsmTileSource.CycleMap osmTileSource_CycleMap0 = new OsmTileSource.CycleMap();
      osmTileSource_CycleMap0.getTilePath(14, 21, (-4));
      osmTileSource_CycleMap0.getAttributionImage();
      jDayChooser0.checkImage((Image) null, 2235, (-4320), (ImageObserver) jPanel0);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      FocusEvent focusEvent0 = new FocusEvent(jPanel0, 228, false);
      focusEvent0.paramString();
      jDayChooser0.focusGained(focusEvent0);
      jDayChooser0.isDecorationBordersVisible();
      jDayChooser0.isWeekOfYearVisible();
      jDayChooser0.setWeekOfYearVisible(false);
      assertEquals(30, jDayChooser0.getDay());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.512984856509157
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.setDay((-586));
      assertEquals(1, jDayChooser0.getDay());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=3.1354942159291497
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getDay();
      jDayChooser0.setMaxDayCharacters(14);
      Calendar calendar0 = MockCalendar.getInstance();
      calendar0.getTimeZone();
      Locale locale0 = Locale.CHINESE;
      jDayChooser0.locale = locale0;
      jDayChooser0.setLocation(14, 14);
      jDayChooser0.setCalendar(calendar0);
      locale0.getDisplayScript(jDayChooser0.locale);
      jDayChooser0.setDayBordersVisible(true);
      int int0 = 4849;
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
  //Test case number: 19
  /*Coverage entropy=2.8641800140015383
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.removeAll();
      JPanel jPanel0 = jDayChooser0.getDayPanel();
      jDayChooser0.day = 2235;
      jDayChooser0.setMaxDayCharacters((-4));
      jDayChooser0.removeAll();
      jDayChooser0.init();
      jDayChooser0.setMonth((-4));
      jDayChooser0.drawDays();
      jDayChooser0.setYear((-4));
      jDayChooser0.getLocale();
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser_DecoratorButton0.repaint((-258), (-1205), (-258), 90);
      jDayChooser_DecoratorButton0.isFocusable();
      KeyEvent keyEvent0 = new KeyEvent(jPanel0, 4, (-1205), 16, 440, '-');
      JDayChooser jDayChooser1 = new JDayChooser();
      jDayChooser1.keyReleased(keyEvent0);
      jDayChooser0.setMonth(21);
      assertEquals(31, jDayChooser0.getDay());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=2.9849507206355423
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.removeAll();
      JPanel jPanel0 = jDayChooser0.getDayPanel();
      jDayChooser0.day = 2235;
      jDayChooser0.setMaxDayCharacters((-4));
      jDayChooser0.removeAll();
      jDayChooser0.setWeekOfYearVisible(true);
      AWTEventMulticaster.remove((MouseMotionListener) null, (MouseMotionListener) null);
      jDayChooser0.removeMouseMotionListener((MouseMotionListener) null);
      jDayChooser0.getLocale();
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser_DecoratorButton0.repaint(16, 2235, (-4), 0);
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton1 = jDayChooser0.new DecoratorButton();
      jDayChooser_DecoratorButton1.isFocusable();
      KeyEvent keyEvent0 = new KeyEvent(jPanel0, 49, 49, (-787), 49, '~');
      jDayChooser0.keyReleased(keyEvent0);
      jDayChooser0.setMonth(3);
      MockDate mockDate0 = new MockDate(3, (-1111), 35, 16, 10066);
      jDayChooser0.setMinSelectableDate(mockDate0);
      jDayChooser0.setMinSelectableDate(mockDate0);
      assertEquals(30, jDayChooser0.getDay());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      System.setCurrentTimeMillis(500L);
      JDayChooser jDayChooser0 = new JDayChooser(true);
      int int0 = jDayChooser0.getMaxDayCharacters();
      assertEquals(0, int0);
      
      jDayChooser0.setEnabled(true);
      System.setCurrentTimeMillis((-4374L));
      Vector<AttributedCharacterIterator.Attribute> vector0 = new Vector<AttributedCharacterIterator.Attribute>();
      JTable jTable0 = new JTable(vector0, vector0);
      int[] intArray0 = new int[9];
      intArray0[0] = 0;
      intArray0[1] = 0;
      intArray0[2] = (-1770);
      intArray0[3] = 0;
      intArray0[4] = 0;
      intArray0[5] = 0;
      intArray0[6] = 0;
      intArray0[7] = 0;
      intArray0[8] = 863;
      MemoryImageSource memoryImageSource0 = new MemoryImageSource(0, 0, intArray0, (-1770), 0);
      jTable0.createImage((ImageProducer) memoryImageSource0);
      Color color0 = jTable0.getGridColor();
      jDayChooser0.setDecorationBackgroundColor(color0);
      jDayChooser0.setDay(0);
      assertEquals(1, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isWeekOfYearVisible());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=2.799517964535027
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getDay();
      jDayChooser0.setMaxDayCharacters(14);
      MockCalendar.getInstance();
      Locale locale0 = Locale.CHINESE;
      jDayChooser0.locale = locale0;
      jDayChooser0.setLocation(14, 14);
      Color color0 = jDayChooser0.getSundayForeground();
      assertEquals((-6029312), color0.getRGB());
      
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 2, 2, 2, 2, 'a', 2);
      jDayChooser0.keyPressed(keyEvent0);
      jDayChooser0.drawDays();
      assertEquals(0, jDayChooser0.getMaxDayCharacters());
      assertEquals(14, jDayChooser0.getDay());
  }
}
