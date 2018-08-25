/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 08:00:53 GMT 2018
 */

package accessories.plugins.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import accessories.plugins.time.JDayChooser;
import accessories.plugins.time.JMonthChooser;
import accessories.plugins.time.JYearChooser;
import freemind.controller.StructuredMenuItemHolder;
import freemind.main.FreeMind;
import freemind.main.FreeMindApplet;
import freemind.modes.mindmapmode.MindMapController;
import freemind.view.mindmapview.attributeview.AttributePopupMenu;
import java.awt.AWTEventMulticaster;
import java.awt.BorderLayout;
import java.awt.CheckboxMenuItem;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.MenuComponent;
import java.awt.Point;
import java.awt.PopupMenu;
import java.awt.SystemColor;
import java.awt.color.ICC_ColorSpace;
import java.awt.color.ICC_Profile;
import java.awt.event.ActionEvent;
import java.awt.event.ContainerListener;
import java.awt.event.FocusEvent;
import java.awt.event.HierarchyListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.awt.image.FilteredImageSource;
import java.awt.image.ImageProducer;
import java.awt.image.IndexColorModel;
import java.awt.image.MultiPixelPackedSampleModel;
import java.awt.image.Raster;
import java.awt.image.ReplicateScaleFilter;
import java.awt.image.SampleModel;
import java.awt.image.WritableRaster;
import java.io.File;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.AttributedCharacterIterator;
import java.time.DateTimeException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalUnit;
import java.util.Calendar;
import java.util.Hashtable;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.TimeZone;
import javax.help.BackAction;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JDialog;
import javax.swing.JEditorPane;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JProgressBar;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JRootPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JWindow;
import javax.swing.MenuElement;
import javax.swing.MenuSelectionManager;
import javax.swing.border.Border;
import javax.swing.event.MenuKeyEvent;
import javax.swing.text.AttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleContext;
import org.apache.crimson.tree.XmlDocument;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.mock.java.time.MockLocalDateTime;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.hsqldb.jdbc.jdbcCallableStatement;
import org.hsqldb.jdbc.jdbcConnection;
import org.hsqldb.persist.HsqlProperties;
import org.junit.runner.RunWith;
import org.openstreetmap.gui.jmapviewer.JMapViewer;
import org.xml.sax.SAXParseException;
import plugins.map.FreeMindMapController;
import plugins.map.MapDialog;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JDayChooser_ESTest extends JDayChooser_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.getClientProperty("");
      jDayChooser0.setWeekOfYearVisible(true);
      jDayChooser0.setDayBordersVisible(true);
      Month month0 = Month.OCTOBER;
      // Undeclared exception!
      try { 
        MockLocalDateTime.of(12, month0, 12, (-1463), 49);
        fail("Expecting exception: DateTimeException");
      
      } catch(DateTimeException e) {
         //
         // Invalid value for HourOfDay (valid values 0 - 23): -1463
         //
         verifyException("java.time.temporal.ValueRange", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.selectedDay = null;
      jDayChooser0.getMinSelectableDate();
      ZoneOffset zoneOffset0 = ZoneOffset.UTC;
      TimeZone.getTimeZone((ZoneId) zoneOffset0);
      String string0 = "";
      try { 
        XmlDocument.createXmlDocument("", false);
        fail("Expecting exception: SAXParseException");
      
      } catch(SAXParseException e) {
         //
         // java.lang.NullPointerException
         //
         verifyException("org.apache.crimson.parser.Parser2", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      boolean boolean0 = false;
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.getMaxSelectableDate();
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser_DecoratorButton0.getDisplayedMnemonicIndex();
      PopupMenu popupMenu0 = null;
      try {
        popupMenu0 = new PopupMenu("#M:'p0");
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=3.0910424533583143
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      JEditorPane jEditorPane0 = new JEditorPane("SqLyl)ot", "day");
      Color color0 = jEditorPane0.getSelectedTextColor();
      float[] floatArray0 = new float[6];
      floatArray0[0] = 0.1F;
      floatArray0[1] = 1423.0F;
      floatArray0[2] = 3677.2627F;
      floatArray0[3] = (-174.61092F);
      floatArray0[4] = 2284.98F;
      floatArray0[5] = (-773.0157F);
      color0.getRGBColorComponents(floatArray0);
      jDayChooser0.setDecorationBackgroundColor(color0);
      jDayChooser0.keyTyped((KeyEvent) null);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "SqLyl)ot";
      stringArray0[1] = "day";
      stringArray0[2] = "SqLyl)ot";
      stringArray0[3] = "day";
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
  //Test case number: 4
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      FocusEvent focusEvent0 = new FocusEvent(jDayChooser0, 1, false);
      focusEvent0.getOppositeComponent();
      focusEvent0.setSource(jDayChooser0);
      jDayChooser0.focusLost(focusEvent0);
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
  /*Coverage entropy=3.1354942159291497
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.setDecorationBordersVisible(true);
      jDayChooser0.setEnabled(true);
      Color color0 = jDayChooser0.getWeekdayForeground();
      assertEquals((-16754012), color0.getRGB());
      
      jDayChooser0.getLocale();
      jDayChooser0.setEnabled(true);
      jDayChooser0.getMinSelectableDate();
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser_DecoratorButton0.addMouseListener((MouseListener) null);
      MenuElement[] menuElementArray0 = new MenuElement[1];
      JCheckBoxMenuItem jCheckBoxMenuItem0 = new JCheckBoxMenuItem("day");
      menuElementArray0[0] = (MenuElement) jCheckBoxMenuItem0;
      MenuSelectionManager menuSelectionManager0 = new MenuSelectionManager();
      MenuKeyEvent menuKeyEvent0 = new MenuKeyEvent(jDayChooser_DecoratorButton0, 0, 2147483647L, 0, 0, '+', menuElementArray0, menuSelectionManager0);
      jDayChooser0.keyTyped(menuKeyEvent0);
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      JYearChooser jYearChooser0 = new JYearChooser();
      jYearChooser0.getUI();
      jYearChooser0.firePropertyChange("day", 238, 10102);
      jDayChooser0.setYearChooser(jYearChooser0);
      JWindow jWindow0 = null;
      try {
        jWindow0 = new JWindow();
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
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      JButton[] jButtonArray0 = new JButton[7];
      JInternalFrame jInternalFrame0 = new JInternalFrame("day", false, false, false, false);
      JRootPane jRootPane0 = jInternalFrame0.getRootPane();
      jRootPane0.getDefaultButton();
      jButtonArray0[0] = null;
      JDayChooser jDayChooser1 = new JDayChooser();
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser1.new DecoratorButton();
      jDayChooser_DecoratorButton0.getDisabledIcon();
      JButton jButton0 = new JButton((Icon) null);
      jButtonArray0[1] = jButton0;
      JButton jButton1 = jDayChooser1.selectedDay;
      jButtonArray0[2] = null;
      JButton jButton2 = new JButton((String) null, (Icon) null);
      jButtonArray0[3] = jButton2;
      JButton jButton3 = new JButton();
      jButtonArray0[4] = jButton3;
      JButton jButton4 = new JButton("4IXZY-", (Icon) null);
      jButtonArray0[5] = jButton4;
      JButton jButton5 = new JButton();
      jButtonArray0[6] = jButton5;
      jDayChooser0.days = jButtonArray0;
      jDayChooser0.transferFocusBackward();
      int int0 = jDayChooser0.getMaxDayCharacters();
      assertEquals(0, int0);
      
      jDayChooser0.getDayPanel();
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.isDecorationBordersVisible();
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isWeekOfYearVisible());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.580510611766821
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      boolean boolean0 = true;
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.setFocus();
      jDayChooser0.getInputMethodListeners();
      jDayChooser0.getBorder();
      jDayChooser0.setBorder((Border) null);
      HierarchyListener hierarchyListener0 = mock(HierarchyListener.class, new ViolatedAssumptionAnswer());
      HierarchyListener hierarchyListener1 = AWTEventMulticaster.add(hierarchyListener0, hierarchyListener0);
      AWTEventMulticaster.remove(hierarchyListener1, hierarchyListener1);
      jDayChooser0.removeHierarchyListener((HierarchyListener) null);
      // Undeclared exception!
      try { 
        Timestamp.valueOf("day");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Timestamp format must be yyyy-mm-dd hh:mm:ss[.fffffffff]
         //
         verifyException("java.sql.Timestamp", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      int int0 = jDayChooser0.getMaxDayCharacters();
      assertEquals(0, int0);
      
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser_DecoratorButton0.isFocusable();
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=3.178053830347946
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.isWeekOfYearVisible();
      jDayChooser0.addNotify();
      int int0 = 116;
      jDayChooser0.setMonth(116);
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser_DecoratorButton0.getDisabledSelectedIcon();
      jDayChooser_DecoratorButton0.isFocusable();
      jDayChooser0.getSundayForeground();
      jDayChooser0.getDayPanel();
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      jDayChooser0.setCalendar(mockGregorianCalendar0);
      Properties properties0 = FreeMindApplet.defaultProps;
      MockFile mockFile0 = null;
      try {
        mockFile0 = new MockFile("day", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFile", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=3.1354942159291497
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      int int0 = 0;
      jDayChooser0.setDebugGraphicsOptions(0);
      int int1 = 0;
      JProgressBar jProgressBar0 = new JProgressBar(0);
      jDayChooser0.add((Component) jProgressBar0);
      jDayChooser0.resetKeyboardActions();
      boolean boolean0 = true;
      jDayChooser0.setEnabled(true);
      int int2 = 93;
      jDayChooser0.setYear(93);
      jDayChooser0.isDecorationBackgroundVisible();
      jDayChooser0.getDay();
      jDayChooser0.setDayBordersVisible(true);
      jDayChooser0.init();
      char char0 = 'c';
      MenuElement[] menuElementArray0 = new MenuElement[8];
      MapDialog mapDialog0 = new MapDialog();
      // Undeclared exception!
      try { 
        mapDialog0.getFreeMindMapController();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("plugins.map.MapDialog", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      ReplicateScaleFilter replicateScaleFilter0 = new ReplicateScaleFilter(2606, 48);
      FilteredImageSource filteredImageSource0 = new FilteredImageSource((ImageProducer) null, replicateScaleFilter0);
      jDayChooser0.createImage((ImageProducer) null);
      jDayChooser0.setDecorationBackgroundVisible(false);
      jDayChooser0.drawDays();
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
  //Test case number: 14
  /*Coverage entropy=2.8421151244608924
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getContainerListeners();
      Date date0 = new Date(0L);
      BackAction backAction0 = new BackAction((Object) null);
      AWTEventMulticaster.remove((MouseListener) backAction0, (MouseListener) backAction0);
      jDayChooser0.removeMouseListener((MouseListener) null);
      Instant instant0 = MockInstant.ofEpochSecond(982L, 982L);
      Instant instant1 = MockInstant.with(instant0, (TemporalAdjuster) instant0);
      ChronoField chronoField0 = ChronoField.HOUR_OF_DAY;
      TemporalUnit temporalUnit0 = chronoField0.getBaseUnit();
      Instant instant2 = MockInstant.plus(instant1, 0L, temporalUnit0);
      Instant instant3 = MockInstant.minusSeconds(instant2, 1L);
      Instant instant4 = MockInstant.plusMillis(instant3, (-974L));
      java.util.Date.from(instant4);
      jDayChooser0.setMaxSelectableDate(date0);
      jDayChooser0.setDayBordersVisible(false);
      SystemColor systemColor0 = SystemColor.textHighlightText;
      jDayChooser0.setSundayForeground(systemColor0);
      jDayChooser0.drawWeeks();
      jDayChooser0.drawWeeks();
      jDayChooser0.setWeekOfYearVisible(false);
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser_DecoratorButton0.paint((Graphics) null);
      Locale locale0 = Locale.JAPANESE;
      jDayChooser0.setLocale(locale0);
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      Color color0 = Color.CYAN;
      float[] floatArray0 = new float[5];
      color0.getColorSpace();
      floatArray0[0] = 1620.933F;
      floatArray0[1] = 0.0F;
      floatArray0[2] = 2144.8315F;
      floatArray0[3] = 0.0F;
      floatArray0[4] = (-203.58899F);
      color0.getRGBComponents(floatArray0);
      jDayChooser0.setSundayForeground(color0);
      jDayChooser0.isDayBordersVisible();
      jDayChooser0.setAlwaysFireDayProperty(true);
      System.setCurrentTimeMillis((-906L));
      jDayChooser0.drawDays();
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.8199156776450796
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.updateUI();
      Color color0 = jDayChooser0.getWeekdayForeground();
      assertEquals(164, color0.getBlue());
      
      Color color1 = jDayChooser0.getDecorationBackgroundColor();
      jDayChooser0.setSundayForeground(color1);
      jDayChooser0.setYear(25);
      JDayChooser jDayChooser1 = new JDayChooser(true);
      jDayChooser1.setWeekOfYearVisible(false);
      JDayChooser jDayChooser2 = new JDayChooser(true);
      jDayChooser2.getDecorationBackgroundColor();
      assertEquals(14, jDayChooser2.getDay());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.6523040438424137
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.getHeight();
      JDayChooser jDayChooser1 = new JDayChooser(true);
      jDayChooser1.setMaxDayCharacters(114);
      assertEquals(0, jDayChooser1.getMaxDayCharacters());
      
      jDayChooser0.setMaxSelectableDate((java.util.Date) null);
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      JMapViewer jMapViewer0 = new JMapViewer();
      jDayChooser0.dayPanel = (JPanel) jMapViewer0;
      jDayChooser0.firePropertyChange("Metal", (short) (byte)67, (short)1469);
      jDayChooser0.firePropertyChange("Metal", (byte)67, (byte)27);
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      System.setCurrentTimeMillis(0L);
      MenuElement[] menuElementArray0 = new MenuElement[2];
      JMenuItem jMenuItem0 = new JMenuItem((Icon) null);
      menuElementArray0[0] = (MenuElement) jMenuItem0;
      JRadioButtonMenuItem jRadioButtonMenuItem0 = new JRadioButtonMenuItem("day");
      menuElementArray0[1] = (MenuElement) jRadioButtonMenuItem0;
      MenuSelectionManager menuSelectionManager0 = new MenuSelectionManager();
      MenuKeyEvent menuKeyEvent0 = new MenuKeyEvent(jDayChooser0, 63717, 3122L, (-220), (byte)67, '\"', menuElementArray0, menuSelectionManager0);
      jDayChooser0.keyReleased(menuKeyEvent0);
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=3.2958368660043296
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      ContainerListener containerListener0 = mock(ContainerListener.class, new ViolatedAssumptionAnswer());
      ContainerListener containerListener1 = AWTEventMulticaster.add(containerListener0, (ContainerListener) null);
      AWTEventMulticaster.remove(containerListener1, containerListener1);
      BorderLayout borderLayout0 = new BorderLayout();
      Dimension dimension0 = borderLayout0.minimumLayoutSize(jDayChooser0);
      Object object0 = dimension0.clone();
      jDayChooser0.setMinimumSize(dimension0);
      jDayChooser0.addContainerListener((ContainerListener) null);
      jDayChooser0.requestFocusInWindow();
      jDayChooser0.setEnabled(false);
      jDayChooser0.isWeekOfYearVisible();
      JDayChooser jDayChooser1 = new JDayChooser(false);
      jDayChooser1.setDecorationBordersVisible(false);
      jDayChooser1.updateUI();
      Color color0 = jDayChooser1.getWeekdayForeground();
      jDayChooser1.setSundayForeground(color0);
      jDayChooser1.setYear(0);
      jDayChooser1.setWeekOfYearVisible(true);
      jDayChooser1.getDecorationBackgroundColor();
      ActionEvent actionEvent0 = new ActionEvent(object0, 5, (String) null, 1320);
      // Undeclared exception!
      try { 
        jDayChooser1.actionPerformed(actionEvent0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.awt.Dimension cannot be cast to javax.swing.JButton
         //
         verifyException("accessories.plugins.time.JDayChooser", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=2.6618403890648796
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.getHeight();
      JDayChooser jDayChooser1 = new JDayChooser(false);
      jDayChooser1.setMaxDayCharacters(0);
      jDayChooser0.setMaxSelectableDate((java.util.Date) null);
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertFalse(jDayChooser0.isWeekOfYearVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=2.953824446207015
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getContainerListeners();
      Object object0 = new Object();
      BackAction backAction0 = new BackAction(object0);
      AWTEventMulticaster.remove((MouseListener) backAction0, (MouseListener) backAction0);
      BorderLayout borderLayout0 = new BorderLayout();
      borderLayout0.minimumLayoutSize(jDayChooser0);
      FlowLayout flowLayout0 = new FlowLayout(0, (-1342), 15);
      Dimension dimension0 = flowLayout0.minimumLayoutSize(jDayChooser0);
      dimension0.clone();
      JDayChooser jDayChooser1 = new JDayChooser(false);
      jDayChooser1.setMinimumSize(dimension0);
      assertEquals(170, dimension0.height);
      assertEquals((-2481), dimension0.width);
      
      ContainerListener containerListener0 = mock(ContainerListener.class, new ViolatedAssumptionAnswer());
      ContainerListener containerListener1 = mock(ContainerListener.class, new ViolatedAssumptionAnswer());
      ContainerListener containerListener2 = AWTEventMulticaster.add(containerListener0, containerListener1);
      AWTEventMulticaster.remove(containerListener2, containerListener2);
      jDayChooser0.addContainerListener((ContainerListener) null);
      jDayChooser0.requestFocusInWindow();
      jDayChooser0.setEnabled(true);
      jDayChooser1.isWeekOfYearVisible();
      JDayChooser jDayChooser2 = new JDayChooser(false);
      jDayChooser2.setDecorationBordersVisible(false);
      JDayChooser jDayChooser3 = new JDayChooser();
      jDayChooser3.updateUI();
      Color color0 = jDayChooser3.getWeekdayForeground();
      jDayChooser0.setSundayForeground(color0);
      JDayChooser jDayChooser4 = new JDayChooser();
      jDayChooser4.setYear(1292);
      jDayChooser4.setWeekOfYearVisible(false);
      Color color1 = jDayChooser3.getDecorationBackgroundColor();
      assertEquals(238, color1.getBlue());
      
      jDayChooser1.setSelectableDateRange((java.util.Date) null, (java.util.Date) null);
      assertFalse(jDayChooser1.isDecorationBordersVisible());
      assertTrue(jDayChooser1.isDayBordersVisible());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=2.7411026280506445
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.isWeekOfYearVisible();
      jDayChooser0.addNotify();
      jDayChooser0.setMonth(116);
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser_DecoratorButton0.getDisabledSelectedIcon();
      jDayChooser_DecoratorButton0.isFocusable();
      jDayChooser0.setMaxDayCharacters(1527);
      FocusEvent focusEvent0 = new FocusEvent(jDayChooser0, 33);
      jDayChooser0.focusGained(focusEvent0);
      jDayChooser0.setDay((-137));
      assertEquals(1, jDayChooser0.getDay());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=2.7378272172856213
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      System.setCurrentTimeMillis(1720L);
      JDayChooser jDayChooser1 = new JDayChooser();
      jDayChooser0.validate();
      jDayChooser1.getSelectedDay();
      assertEquals(1, jDayChooser1.getDay());
      
      jDayChooser1.setDay(210);
      StyleContext styleContext0 = new StyleContext();
      AttributeSet attributeSet0 = SimpleAttributeSet.EMPTY;
      Color color0 = styleContext0.getBackground(attributeSet0);
      jDayChooser1.setDecorationBackgroundColor(color0);
      jDayChooser0.setSelectableDateRange((java.util.Date) null, (java.util.Date) null);
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 24
  /*Coverage entropy=2.7823559208895667
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      ContainerListener containerListener0 = mock(ContainerListener.class, new ViolatedAssumptionAnswer());
      ContainerListener containerListener1 = AWTEventMulticaster.add(containerListener0, (ContainerListener) null);
      AWTEventMulticaster.remove(containerListener1, containerListener1);
      BorderLayout borderLayout0 = new BorderLayout();
      Dimension dimension0 = borderLayout0.minimumLayoutSize(jDayChooser0);
      dimension0.clone();
      jDayChooser0.setMinimumSize(dimension0);
      jDayChooser0.addContainerListener((ContainerListener) null);
      jDayChooser0.requestFocusInWindow();
      jDayChooser0.setEnabled(true);
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser_DecoratorButton0.getModel();
      jDayChooser_DecoratorButton0.getDisabledSelectedIcon();
      jDayChooser_DecoratorButton0.isFocusable();
      jDayChooser0.setMaxDayCharacters((-2627));
      jDayChooser0.setMaxDayCharacters((-2627));
      assertEquals(0, jDayChooser0.getMaxDayCharacters());
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 25
  /*Coverage entropy=3.1354942159291497
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setMonth(110);
      jDayChooser0.setDay(210);
      StyleContext styleContext0 = new StyleContext();
      AttributeSet attributeSet0 = SimpleAttributeSet.EMPTY;
      Color color0 = styleContext0.getBackground(attributeSet0);
      JDayChooser jDayChooser1 = new JDayChooser(true);
      jDayChooser1.setDecorationBackgroundColor(color0);
      jDayChooser0.setSelectableDateRange((java.util.Date) null, (java.util.Date) null);
      JMonthChooser jMonthChooser0 = new JMonthChooser();
      jMonthChooser0.transferFocusDownCycle();
      jDayChooser0.setMonthChooser(jMonthChooser0);
      assertEquals(31, jDayChooser0.getDay());
  }
}