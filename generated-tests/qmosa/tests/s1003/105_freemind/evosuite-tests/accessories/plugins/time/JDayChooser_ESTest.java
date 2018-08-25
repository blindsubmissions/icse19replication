/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 08:59:57 GMT 2018
 */

package accessories.plugins.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import accessories.plugins.time.JDayChooser;
import accessories.plugins.time.JMonthChooser;
import accessories.plugins.time.JYearChooser;
import freemind.view.mindmapview.MultipleImage;
import java.awt.AWTEventMulticaster;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.ImageCapabilities;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.AffineTransform;
import java.awt.image.IndexColorModel;
import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.sql.Time;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import javax.help.ForwardAction;
import javax.swing.ActionMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JPopupMenu;
import javax.swing.JTable;
import javax.swing.KeyStroke;
import javax.swing.plaf.multi.MultiPanelUI;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.JTableHeader;
import org.apache.batik.bridge.SVGColorProfileElementBridge;
import org.apache.batik.bridge.SVGUseElementBridge;
import org.apache.batik.bridge.UserAgentAdapter;
import org.apache.batik.css.parser.Parser;
import org.apache.batik.ext.awt.g2d.GraphicContext;
import org.apache.batik.gvt.CompositeGraphicsNode;
import org.apache.batik.gvt.text.GVTAttributedCharacterIterator;
import org.apache.batik.svggen.SVGGeneratorContext;
import org.apache.batik.svggen.SVGGraphics2D;
import org.apache.crimson.tree.XmlDocument;
import org.apache.html.dom.HTMLDocumentImpl;
import org.apache.xalan.templates.ElemTextLiteral;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
import org.evosuite.runtime.mock.java.time.MockZonedDateTime;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.hsqldb.jdbc.jdbcCallableStatement;
import org.hsqldb.jdbc.jdbcConnection;
import org.hsqldb.lib.FileUtil;
import org.hsqldb.persist.HsqlProperties;
import org.junit.runner.RunWith;
import org.openstreetmap.gui.jmapviewer.tilesources.ScanexTileSource;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JDayChooser_ESTest extends JDayChooser_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      boolean boolean0 = false;
      JDayChooser jDayChooser0 = new JDayChooser(false);
      int int0 = 0;
      ActionMap actionMap0 = jDayChooser0.getActionMap();
      actionMap0.keys();
      jDayChooser0.setActionMap(actionMap0);
      jDayChooser0.getActionMap();
      jDayChooser0.setDay(0);
      jDayChooser0.keyTyped((KeyEvent) null);
      jDayChooser0.addListeners(0);
      jDayChooser0.drawWeeks();
      boolean boolean1 = false;
      ForwardAction forwardAction0 = new ForwardAction((Object) null);
      jDayChooser0.addMouseListener(forwardAction0);
      Time time0 = new Time(1809L);
      // Undeclared exception!
      try { 
        time0.toInstant();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.sql.Time", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = "accessories.plugins.time.JDayChooser$1";
      stringArray0[1] = "JDayChooser";
      stringArray0[2] = "f'x.H3a!_lOMvtW";
      stringArray0[3] = "";
      stringArray0[4] = "bgfBlI}N8[Lr'pr<a1";
      stringArray0[5] = "CoverageArea";
      stringArray0[6] = "ByGQ";
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
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      MultiPanelUI multiPanelUI0 = new MultiPanelUI();
      JPasswordField jPasswordField0 = new JPasswordField("day");
      int int0 = 0;
      jPasswordField0.getInsets();
      jDayChooser0.setDay(0);
      multiPanelUI0.getBaselineResizeBehavior(jPasswordField0);
      jDayChooser0.setUI(multiPanelUI0);
      jDayChooser0.init();
      jDayChooser0.getMaxDayCharacters();
      Parser parser0 = new Parser();
      boolean boolean0 = true;
      boolean boolean1 = true;
      jDayChooser0.firePropertyChange("Xk}mPrk6ysJc", true, true);
      parser0.getLocale();
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
  /*Coverage entropy=3.2958368660043296
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getComponentListeners();
      JMonthChooser jMonthChooser0 = jDayChooser0.monthChooser;
      jDayChooser0.setMonthChooser((JMonthChooser) null);
      Dimension dimension0 = jDayChooser0.getPreferredSize();
      jDayChooser0.setAlwaysFireDayProperty(true);
      jDayChooser0.isValidateRoot();
      jDayChooser0.initDecorations();
      jDayChooser0.getWeekdayForeground();
      jDayChooser0.setMaxDayCharacters(1859);
      dimension0.setSize(1859, 160);
      jDayChooser0.removeAll();
      jDayChooser0.getLocale();
      jDayChooser0.setMonth(160);
      jDayChooser0.setDay(0);
      jDayChooser0.setYear(2009);
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
      boolean boolean0 = false;
      JDayChooser jDayChooser0 = new JDayChooser(false);
      JYearChooser jYearChooser0 = new JYearChooser();
      jDayChooser0.setYearChooser(jYearChooser0);
      jDayChooser0.getWeekdayForeground();
      HsqlProperties hsqlProperties0 = new HsqlProperties();
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

  /**
  //Test case number: 5
  /*Coverage entropy=3.2188758248681983
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getHierarchyBoundsListeners();
      jDayChooser0.getActionMap();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      boolean boolean0 = false;
      byteArrayOutputStream0.write(164);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(byteArrayOutputStream0, false);
      mockPrintWriter0.print("");
      jDayChooser0.list((PrintWriter) mockPrintWriter0);
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser0.setForeground((Color) null);
      int int0 = 160;
      jDayChooser0.setYear(160);
      jDayChooser0.setDayBordersVisible(false);
      jDayChooser0.getSundayForeground();
      java.sql.Date date0 = new java.sql.Date(0L);
      date0.toLocalDate();
      Date date1 = jDayChooser0.setMaxSelectableDate(date0);
      jDayChooser0.setSelectableDateRange(date1, date0);
      ForwardAction forwardAction0 = new ForwardAction(mockPrintWriter0);
      jDayChooser_DecoratorButton0.addMouseListener(forwardAction0);
      jDayChooser0.setWeekdayForeground((Color) null);
      ActionEvent actionEvent0 = new ActionEvent(byteArrayOutputStream0, 164, "");
      // Undeclared exception!
      try { 
        jDayChooser0.actionPerformed(actionEvent0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.io.ByteArrayOutputStream cannot be cast to javax.swing.JButton
         //
         verifyException("accessories.plugins.time.JDayChooser", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      Date date0 = jDayChooser0.getMinSelectableDate();
      jDayChooser0.setSelectableDateRange(date0, date0);
      KeyEvent keyEvent0 = null;
      try {
        keyEvent0 = new KeyEvent(jDayChooser0, 927, 927, (-2481), 927, '[', (-1794));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid keyLocation
         //
         verifyException("java.awt.event.KeyEvent", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=3.1354942159291497
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.setWeekOfYearVisible(true);
      jDayChooser0.getMinSelectableDate();
      ImageCapabilities imageCapabilities0 = new ImageCapabilities(false);
      jDayChooser0.createVolatileImage(495, 1, imageCapabilities0);
      jDayChooser0.addListeners(0);
      jDayChooser0.getDecorationBackgroundColor();
      jDayChooser0.getMinSelectableDate();
      jDayChooser0.getSundayForeground();
      boolean boolean0 = jDayChooser0.isDayBordersVisible();
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(boolean0);
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=3.0910424533583143
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.init();
      jDayChooser0.getDay();
      jDayChooser0.getWeekdayForeground();
      jDayChooser0.getDay();
      jDayChooser0.isDecorationBackgroundVisible();
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser_DecoratorButton0.getText();
      JPopupMenu jPopupMenu0 = new JPopupMenu();
      KeyStroke.getKeyStroke("day");
      jPopupMenu0.unregisterKeyboardAction((KeyStroke) null);
      jDayChooser_DecoratorButton0.setComponentPopupMenu(jPopupMenu0);
      JFrame jFrame0 = null;
      try {
        jFrame0 = new JFrame("");
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=3.1354942159291497
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.init();
      jDayChooser0.getDecorationBackgroundColor();
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser0.remove((Component) jDayChooser_DecoratorButton0);
      jDayChooser_DecoratorButton0.isValidateRoot();
      jDayChooser_DecoratorButton0.setBorderPainted(true);
      jDayChooser_DecoratorButton0.isFocusable();
      jDayChooser0.setDecorationBordersVisible(false);
      int int0 = 0;
      int int1 = 208;
      char char0 = 'H';
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser_DecoratorButton0, 0, 0L, 0, 208, 'H');
      jDayChooser0.keyPressed(keyEvent0);
      HsqlProperties hsqlProperties0 = new HsqlProperties("");
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

  /**
  //Test case number: 10
  /*Coverage entropy=2.686724565214647
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getMouseMotionListeners();
      jDayChooser0.getMaxDayCharacters();
      JMonthChooser jMonthChooser0 = new JMonthChooser();
      jMonthChooser0.doLayout();
      jDayChooser0.setFocusable(false);
      jMonthChooser0.getMouseMotionListeners();
      jMonthChooser0.getBorder();
      jMonthChooser0.getComponents();
      jDayChooser0.setMonthChooser(jMonthChooser0);
      jDayChooser0.getRootPane();
      assertEquals(14, jDayChooser0.getDay());
      
      jDayChooser0.setDay(8240);
      jDayChooser0.setAlwaysFireDayProperty(true);
      jDayChooser0.setForeground((Color) null);
      assertEquals(28, jDayChooser0.getDay());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.637304661672375
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setDay((-2082));
      jDayChooser0.getDebugGraphicsOptions();
      jDayChooser0.setEnabled(false);
      jDayChooser0.updateUI();
      assertEquals(1, jDayChooser0.getDay());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.7107572577786656
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.setWeekOfYearVisible(true);
      jDayChooser0.getMinSelectableDate();
      ImageCapabilities imageCapabilities0 = new ImageCapabilities(false);
      MultipleImage multipleImage0 = new MultipleImage(10164);
      multipleImage0.getImage();
      jDayChooser0.imageUpdate((Image) null, (-1431655763), 342, 342, 1, 495);
      SystemColor systemColor0 = SystemColor.desktop;
      jDayChooser0.setBackground(systemColor0);
      jDayChooser0.setWeekOfYearVisible(false);
      jDayChooser0.getLocale();
      assertFalse(jDayChooser0.isWeekOfYearVisible());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=3.2188758248681983
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.init();
      jDayChooser0.getDecorationBackgroundColor();
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser0.remove((Component) jDayChooser_DecoratorButton0);
      jDayChooser_DecoratorButton0.isValidateRoot();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      jDayChooser_DecoratorButton0.setBorderPainted(false);
      jDayChooser_DecoratorButton0.isFocusable();
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 4, 4, 2150, 585, 'H');
      jDayChooser0.keyPressed(keyEvent0);
      jDayChooser0.setDay(208);
      jDayChooser0.keyReleased(keyEvent0);
      assertEquals(28, jDayChooser0.getDay());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.882005086088324
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      MultipleImage multipleImage0 = new MultipleImage(2115.4280377);
      multipleImage0.getImage();
      JDayChooser jDayChooser1 = new JDayChooser(false);
      jDayChooser1.initDecorations();
      jDayChooser1.getWeekdayForeground();
      jDayChooser1.setMaxDayCharacters((-2945));
      Dimension dimension0 = jDayChooser0.getSize();
      dimension0.setSize(1859, (-863));
      jDayChooser0.removeAll();
      jDayChooser1.getLocale();
      jDayChooser1.setMonth(842);
      jDayChooser0.setDay(403);
      jDayChooser0.setYear(160);
      // Undeclared exception!
      try { 
        jDayChooser1.getTemporaryCalendar();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("accessories.plugins.time.JDayChooser", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.8199156776450796
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getComponentListeners();
      JMonthChooser jMonthChooser0 = jDayChooser0.monthChooser;
      jDayChooser0.setMonthChooser((JMonthChooser) null);
      jDayChooser0.getPreferredSize();
      jDayChooser0.setAlwaysFireDayProperty(true);
      jDayChooser0.isValidateRoot();
      MultipleImage multipleImage0 = new MultipleImage(203);
      multipleImage0.getImage();
      jDayChooser0.imageUpdate((Image) null, 1605, 1321, 203, (-840), 72);
      SystemColor systemColor0 = SystemColor.desktop;
      jDayChooser0.setBackground(systemColor0);
      jDayChooser0.setWeekOfYearVisible(true);
      jDayChooser0.getLocale();
      java.sql.Date date0 = new java.sql.Date(1321);
      DateFormatSymbols dateFormatSymbols0 = new DateFormatSymbols();
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("day", dateFormatSymbols0);
      try { 
        mockSimpleDateFormat0.parse("month");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unparseable date: \"month\"
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=3.2188758248681983
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.setMaxDayCharacters(1584);
      jDayChooser0.setDecorationBackgroundVisible(false);
      Color color0 = Color.BLUE;
      SVGColorProfileElementBridge sVGColorProfileElementBridge0 = new SVGColorProfileElementBridge();
      UserAgentAdapter userAgentAdapter0 = new UserAgentAdapter();
      ScanexTileSource scanexTileSource0 = new ScanexTileSource("day");
      scanexTileSource0.getAttributionImage();
      jDayChooser0.imageUpdate((Image) null, 265, 1584, 259, 265, (-282));
      SystemColor systemColor0 = SystemColor.desktop;
      jDayChooser0.setBackground(systemColor0);
      jDayChooser0.setWeekOfYearVisible(false);
      jDayChooser0.getLocale();
      java.sql.Date date0 = new java.sql.Date((-1345L));
      Date date1 = jDayChooser0.setMinSelectableDate(date0);
      System.setCurrentTimeMillis((-533L));
      FocusEvent focusEvent0 = new FocusEvent(jDayChooser0, 37, true);
      jDayChooser0.focusGained(focusEvent0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      jDayChooser0.setCalendar(mockGregorianCalendar0);
      jDayChooser0.setSelectableDateRange(date0, date1);
      assertFalse(jDayChooser0.isDecorationBackgroundVisible());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=3.2580965380214835
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      MultipleImage multipleImage0 = new MultipleImage(2115.4280377);
      multipleImage0.getImage();
      jDayChooser0.imageUpdate((Image) null, 72, 72, 1605, 72, 1605);
      SystemColor systemColor0 = SystemColor.desktop;
      jDayChooser0.setBackground(systemColor0);
      jDayChooser0.setWeekOfYearVisible(false);
      jDayChooser0.getLocale();
      java.sql.Date date0 = new java.sql.Date(72);
      jDayChooser0.setMinSelectableDate(date0);
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 1605, 0L, (-749), 72, 'z');
      jDayChooser0.keyPressed(keyEvent0);
      jDayChooser0.getMaxSelectableDate();
      Date date1 = jDayChooser0.getMaxSelectableDate();
      jDayChooser0.setSelectableDateRange(date1, date1);
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getVerifyInputWhenFocusTarget();
      jDayChooser0.setEnabled(false);
      jDayChooser0.updateUI();
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser_DecoratorButton0.paint((Graphics) null);
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.7438550678980893
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      MultiPanelUI multiPanelUI0 = new MultiPanelUI();
      JPasswordField jPasswordField0 = new JPasswordField("day");
      JDayChooser jDayChooser1 = new JDayChooser(true);
      assertTrue(jDayChooser1.isWeekOfYearVisible());
      
      MultipleImage multipleImage0 = new MultipleImage(456.693);
      multipleImage0.getImage();
      boolean boolean0 = new Boolean(true);
      SystemColor systemColor0 = SystemColor.desktop;
      jDayChooser0.setBackground(systemColor0);
      jDayChooser0.setWeekOfYearVisible(false);
      jDayChooser0.getLocale();
      java.sql.Date date0 = new java.sql.Date(1605);
      jDayChooser0.setMinSelectableDate((Date) null);
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getHierarchyBoundsListeners();
      jDayChooser0.getActionMap();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      byteArrayOutputStream0.write(164);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(byteArrayOutputStream0, false);
      mockPrintWriter0.print("");
      jDayChooser0.list((PrintWriter) mockPrintWriter0);
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser0.getDebugGraphicsOptions();
      jDayChooser0.setEnabled(false);
      JDayChooser jDayChooser1 = new JDayChooser(false);
      jDayChooser1.updateUI();
      jDayChooser0.getDayPanel();
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=2.637304661672375
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      KeyListener keyListener0 = AWTEventMulticaster.add((KeyListener) jDayChooser0, (KeyListener) jDayChooser0);
      jDayChooser0.removeKeyListener(keyListener0);
      FileUtil fileUtil0 = FileUtil.getDefaultInstance();
      HsqlProperties hsqlProperties0 = new HsqlProperties("6", fileUtil0, false);
      int[] intArray0 = new int[3];
      intArray0[0] = 1;
      intArray0[1] = 1;
      intArray0[2] = 1494;
      hsqlProperties0.getIntegerProperty("nG*g6c", 1494, intArray0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      jDayChooser0.setMaxSelectableDate((Date) null);
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isWeekOfYearVisible());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.getTransferHandler();
      jDayChooser0.focusLost((FocusEvent) null);
      jDayChooser0.isWeekOfYearVisible();
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      assertEquals(14, jDayChooser0.getDay());
      
      jDayChooser0.setDay((-2082));
      jDayChooser0.setDay((-2082));
      jDayChooser0.getSelectedDay();
      jDayChooser0.getSelectedDay();
      assertEquals(1, jDayChooser0.getDay());
  }

  /**
  //Test case number: 24
  /*Coverage entropy=2.6752112485191817
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.setMaxDayCharacters((-147));
      SystemColor systemColor0 = SystemColor.desktop;
      jDayChooser0.setDecorationBackgroundColor(systemColor0);
      assertFalse(jDayChooser0.isWeekOfYearVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertEquals(0, jDayChooser0.getMaxDayCharacters());
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }
}