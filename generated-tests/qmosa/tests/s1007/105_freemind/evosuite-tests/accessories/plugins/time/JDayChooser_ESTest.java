/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 09:59:28 GMT 2018
 */

package accessories.plugins.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import accessories.plugins.time.JDayChooser;
import accessories.plugins.time.JMonthChooser;
import accessories.plugins.time.JYearChooser;
import freemind.modes.mindmapmode.actions.AddArrowLinkAction;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.color.ColorSpace;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseListener;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.AttributedCharacterIterator;
import java.text.ParsePosition;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Hashtable;
import java.util.Locale;
import java.util.Map;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.text.DefaultCaret;
import javax.swing.tree.DefaultTreeCellRenderer;
import org.apache.fop.image.FopImage;
import org.apache.fop.image.JpegImage;
import org.apache.fop.svg.PDFDocumentGraphics2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.mock.java.time.MockZonedDateTime;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.hsqldb.Session;
import org.hsqldb.jdbc.jdbcCallableStatement;
import org.hsqldb.jdbc.jdbcConnection;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JDayChooser_ESTest extends JDayChooser_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.decorationBordersVisible = true;
      jDayChooser0.getDayPanel();
      jDayChooser0.setDecorationBackgroundVisible(true);
      jDayChooser0.getSundayForeground();
      MockDate mockDate0 = new MockDate((-95), 228, 228);
      mockDate0.toInstant();
      // Undeclared exception!
      try { 
        mockDate0.before((Date) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=3.1354942159291497
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getSundayForeground();
      Class<AddArrowLinkAction> class0 = AddArrowLinkAction.class;
      jDayChooser0.getListeners(class0);
      int int0 = jDayChooser0.getDay();
      assertEquals(14, int0);
      
      JYearChooser jYearChooser0 = new JYearChooser();
      jDayChooser0.setYearChooser(jYearChooser0);
      jDayChooser0.isDayBordersVisible();
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      
      jDayChooser0.updateUI();
      assertFalse(jDayChooser0.isWeekOfYearVisible());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=3.1354942159291497
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      int int0 = (-1247);
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, (-1247), (-1247), (-1247), (-1247), 'Y');
      keyEvent0.setKeyCode((-1247));
      keyEvent0.setKeyChar('Y');
      KeyEvent.getKeyText((-1247));
      jDayChooser0.createToolTip();
      jDayChooser0.keyPressed(keyEvent0);
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
  //Test case number: 3
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getBackground();
      JMonthChooser jMonthChooser0 = jDayChooser0.monthChooser;
      jDayChooser0.setMonthChooser((JMonthChooser) null);
      jDayChooser0.invalidate();
      jDayChooser0.firePropertyChange("5\"?q~Pg)^JT8", (short)0, (short)0);
      jDayChooser0.initDecorations();
      jDayChooser0.isDecorationBordersVisible();
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getColorModel();
      jDayChooser0.drawDays();
      jDayChooser0.setYear((-264));
      jDayChooser0.getSundayForeground();
      assertFalse(jDayChooser0.isWeekOfYearVisible());
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      Color color0 = Color.magenta;
      float[] floatArray0 = new float[7];
      floatArray0[0] = 0.0F;
      floatArray0[1] = 1.0F;
      floatArray0[2] = 1.0F;
      floatArray0[3] = 981.0789F;
      jDayChooser0.getComponents();
      floatArray0[4] = 0.0F;
      Color.getColor("day", color0);
      floatArray0[5] = (-3348.0F);
      floatArray0[6] = 0.0F;
      color0.getRGBColorComponents(floatArray0);
      jDayChooser0.resetKeyboardActions();
      jDayChooser0.setWeekdayForeground(color0);
      jDayChooser0.init();
      jDayChooser0.getSelectedDay();
      ActionEvent actionEvent0 = null;
      try {
        actionEvent0 = new ActionEvent((Object) null, (-1293), "day", 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null source
         //
         verifyException("java.util.EventObject", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=3.0910424533583143
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.getHeight();
      jDayChooser0.firePropertyChange("p", (short) (-4290), (short) (-4290));
      jDayChooser0.getActionForKeyStroke((KeyStroke) null);
      jDayChooser0.setDebugGraphicsOptions(0);
      jDayChooser0.getMinimumSize();
      jDayChooser0.setYear(0);
      jDayChooser0.setFocus();
      jDayChooser0.getMaxDayCharacters();
      jDayChooser0.getMaxDayCharacters();
      ActionEvent actionEvent0 = new ActionEvent(jDayChooser0, 0, "p");
      actionEvent0.paramString();
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
  //Test case number: 7
  /*Coverage entropy=2.580510611766821
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      boolean boolean0 = true;
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.getAncestorListeners();
      jDayChooser0.removeNotify();
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
  //Test case number: 8
  /*Coverage entropy=3.2580965380214835
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.isOpaque();
      jDayChooser0.getMaxSelectableDate();
      jDayChooser0.isDayBordersVisible();
      DefaultCaret defaultCaret0 = new DefaultCaret();
      defaultCaret0.isVisible();
      jDayChooser0.removeFocusListener(defaultCaret0);
      Locale locale0 = Locale.ROOT;
      jDayChooser0.setLocale(locale0);
      jDayChooser0.setName("");
      jDayChooser0.setDayBordersVisible(false);
      Color color0 = Color.YELLOW;
      jDayChooser0.setWeekdayForeground(color0);
      jDayChooser0.setDayBordersVisible(false);
      JDayChooser jDayChooser1 = new JDayChooser();
      jDayChooser1.isWeekOfYearVisible();
      jDayChooser0.isDecorationBackgroundVisible();
      jDayChooser0.setDay(0);
      assertEquals(1, jDayChooser0.getDay());
      
      FocusEvent focusEvent0 = new FocusEvent(jDayChooser1, 0, true);
      jDayChooser1.focusLost(focusEvent0);
      assertEquals(14, jDayChooser1.getDay());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.671760120846313
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getColorModel();
      jDayChooser0.repaint();
      jDayChooser0.setMonth((-36));
      jDayChooser0.setLocation((-2828), (-36));
      jDayChooser0.drawDays();
      jDayChooser0.getSundayForeground();
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=3.2580965380214835
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, (-1247), (-1247), (-1247), (-1247), 'Y');
      keyEvent0.setKeyCode((-1247));
      keyEvent0.setKeyChar('Y');
      keyEvent0.getExtendedKeyCode();
      KeyEvent.getKeyText((-1247));
      jDayChooser0.createToolTip();
      jDayChooser0.keyPressed(keyEvent0);
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser_DecoratorButton0.isFocusable();
      jDayChooser0.getSelectedDay();
      jDayChooser0.drawWeeks();
      jDayChooser0.getDecorationBackgroundColor();
      PDFDocumentGraphics2D pDFDocumentGraphics2D0 = new PDFDocumentGraphics2D();
      Color.getColor("\uFB21");
      jDayChooser_DecoratorButton0.paint(pDFDocumentGraphics2D0);
      jDayChooser0.drawWeeks();
      Color.getColor("day", (-1247));
      JpegImage jpegImage0 = null;
      try {
        jpegImage0 = new JpegImage((FopImage.ImageInfo) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.fop.image.AbstractFopImage", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=3.2958368660043296
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getMaxSelectableDate();
      boolean boolean0 = jDayChooser0.isDayBordersVisible();
      assertTrue(boolean0);
      
      DefaultCaret defaultCaret0 = new DefaultCaret();
      defaultCaret0.isVisible();
      jDayChooser0.removeFocusListener(defaultCaret0);
      jDayChooser0.setAlwaysFireDayProperty(true);
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser_DecoratorButton0.addMouseListener((MouseListener) null);
      jDayChooser0.isDecorationBordersVisible();
      jDayChooser0.drawDays();
      jDayChooser0.setMaxDayCharacters(0);
      jDayChooser0.getDaysInMonth();
      jDayChooser0.getDayPanel();
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser_DecoratorButton0, 0, 0L, 0, 0, 'C');
      jDayChooser0.keyTyped(keyEvent0);
      Color color0 = jDayChooser0.getWeekdayForeground();
      assertEquals((-16754012), color0.getRGB());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      MockZonedDateTime.now();
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar();
      jDayChooser0.setCalendar(mockGregorianCalendar1);
      jDayChooser0.getMinSelectableDate();
      assertEquals(14, jDayChooser0.getDay());
      
      jDayChooser0.setDay(3394);
      assertEquals(28, jDayChooser0.getDay());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.7107572577786656
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      Locale locale0 = Locale.TAIWAN;
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("day", locale0);
      ParsePosition parsePosition0 = new ParsePosition(790);
      mockSimpleDateFormat0.parse("day", parsePosition0);
      jDayChooser0.setSelectableDateRange((Date) null, (Date) null);
      JDayChooser jDayChooser1 = new JDayChooser();
      jDayChooser1.getMinSelectableDate();
      Color color0 = null;
      try {
        color0 = new Color(790, 0.0F, 64.7F);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Color parameter outside of expected range: Red Blue
         //
         verifyException("java.awt.Color", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=3.2188758248681983
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.getHeight();
      jDayChooser0.firePropertyChange("p", (short) (-4290), (short) (-4290));
      jDayChooser0.getActionForKeyStroke((KeyStroke) null);
      jDayChooser0.setDebugGraphicsOptions(0);
      jDayChooser0.getMinimumSize();
      jDayChooser0.setYear(0);
      jDayChooser0.setFocus();
      jDayChooser0.getMaxDayCharacters();
      jDayChooser0.getMaxDayCharacters();
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser_DecoratorButton0.addMouseListener((MouseListener) null);
      jDayChooser0.isDecorationBordersVisible();
      jDayChooser0.drawDays();
      jDayChooser0.setMaxDayCharacters(28);
      jDayChooser0.getDaysInMonth();
      JPanel jPanel0 = jDayChooser0.getDayPanel();
      KeyEvent keyEvent0 = new KeyEvent(jPanel0, 0, 0, 120, 120, 'C');
      String[] stringArray0 = new String[9];
      stringArray0[0] = "p";
      stringArray0[1] = "day";
      stringArray0[2] = "p";
      stringArray0[3] = "day";
      stringArray0[4] = "p";
      stringArray0[5] = "day";
      stringArray0[6] = "p";
      stringArray0[7] = "p";
      stringArray0[8] = "p";
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
  //Test case number: 15
  /*Coverage entropy=3.0910424533583143
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      ZonedDateTime zonedDateTime0 = mockGregorianCalendar0.toZonedDateTime();
      GregorianCalendar gregorianCalendar0 = MockGregorianCalendar.from(zonedDateTime0);
      jDayChooser0.setCalendar(gregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392409281320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", gregorianCalendar0.toString());
      
      JDayChooser jDayChooser1 = new JDayChooser(false);
      jDayChooser0.firePropertyChange("n/UhXD\"~}eVF\"v+A", (byte)13, (byte)13);
      jDayChooser1.setSundayForeground((Color) null);
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 943, 0L, (-2474), (-869), 'w');
      jDayChooser1.keyTyped(keyEvent0);
      assertFalse(jDayChooser1.isDecorationBordersVisible());
      assertTrue(jDayChooser1.isDayBordersVisible());
      assertEquals(14, jDayChooser1.getDay());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.8072459411997186
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      Date date0 = jDayChooser0.getMaxSelectableDate();
      jDayChooser0.isDayBordersVisible();
      DefaultCaret defaultCaret0 = new DefaultCaret();
      defaultCaret0.isVisible();
      jDayChooser0.setSelectableDateRange(date0, date0);
      JDayChooser jDayChooser1 = new JDayChooser();
      jDayChooser0.getMinSelectableDate();
      Color color0 = null;
      try {
        color0 = new Color(0.0F, 836.8564F, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Color parameter outside of expected range: Green
         //
         verifyException("java.awt.Color", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=3.0174018402780143
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.getHeight();
      JDayChooser jDayChooser1 = new JDayChooser();
      jDayChooser1.firePropertyChange("remove_node_background_color", (short) (-232), (short) (-1413));
      jDayChooser0.getActionForKeyStroke((KeyStroke) null);
      jDayChooser1.setDebugGraphicsOptions((-1713));
      Dimension dimension0 = jDayChooser1.getMinimumSize();
      assertEquals(140, dimension0.height);
      
      jDayChooser1.setYear((-30));
      jDayChooser1.setFocus();
      jDayChooser0.getMaxDayCharacters();
      int int0 = jDayChooser0.getMaxDayCharacters();
      assertEquals(0, int0);
      
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser_DecoratorButton0.addMouseListener((MouseListener) null);
      jDayChooser0.isDecorationBordersVisible();
      jDayChooser0.drawDays();
      jDayChooser1.setMaxDayCharacters((-30));
      int int1 = jDayChooser1.getDaysInMonth();
      assertEquals(28, int1);
      
      jDayChooser1.getDayPanel();
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 160, (short) (-1413), 28, (short) (-4290), 'C');
      jDayChooser1.keyTyped(keyEvent0);
      Locale locale0 = Locale.ENGLISH;
      jDayChooser1.setLocale(locale0);
      assertTrue(jDayChooser1.isDayBordersVisible());
      assertEquals(14, jDayChooser1.getDay());
      assertFalse(jDayChooser1.isWeekOfYearVisible());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=3.332204510175204
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.getHeight();
      jDayChooser0.getActionForKeyStroke((KeyStroke) null);
      jDayChooser0.setDebugGraphicsOptions(0);
      Dimension dimension0 = jDayChooser0.getMinimumSize();
      assertEquals(203, dimension0.width);
      
      jDayChooser0.setYear(0);
      jDayChooser0.setFocus();
      jDayChooser0.getMaxDayCharacters();
      int int0 = jDayChooser0.getMaxDayCharacters();
      assertEquals(0, int0);
      
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser_DecoratorButton0.addMouseListener((MouseListener) null);
      boolean boolean0 = jDayChooser0.isDecorationBordersVisible();
      assertFalse(boolean0);
      
      jDayChooser0.drawDays();
      jDayChooser0.setMaxDayCharacters(28);
      jDayChooser0.getDaysInMonth();
      JPanel jPanel0 = jDayChooser0.getDayPanel();
      KeyEvent keyEvent0 = new KeyEvent(jPanel0, 0, 0, 120, 120, 'C');
      jDayChooser0.keyTyped(keyEvent0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      jDayChooser0.getLocale();
      jDayChooser0.setWeekOfYearVisible(false);
      Date date0 = jDayChooser0.defaultMinSelectableDate;
      jDayChooser0.setSelectableDateRange(date0, date0);
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.908151781490806
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      ZonedDateTime zonedDateTime0 = mockGregorianCalendar0.toZonedDateTime();
      GregorianCalendar gregorianCalendar0 = MockGregorianCalendar.from(zonedDateTime0);
      jDayChooser0.setCalendar(gregorianCalendar0);
      jDayChooser0.setMaxDayCharacters((-809));
      jDayChooser0.getDaysInMonth();
      jDayChooser0.getDayPanel();
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 120, 0L, 160, 160, '\'');
      jDayChooser0.keyTyped(keyEvent0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      Locale locale0 = Locale.ENGLISH;
      jDayChooser0.setWeekOfYearVisible(true);
      assertTrue(jDayChooser0.isWeekOfYearVisible());
      
      Date date0 = jDayChooser0.defaultMinSelectableDate;
      JDayChooser jDayChooser1 = new JDayChooser(true);
      MockDate mockDate0 = new MockDate(28, 177, 3549, 6, 6);
      jDayChooser1.setSelectableDateRange(mockDate0, mockDate0);
      assertEquals(14, jDayChooser1.getDay());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=2.7438550678980893
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.toZonedDateTime();
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar();
      jDayChooser0.setCalendar(mockGregorianCalendar1);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392409281320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar1.toString());
      
      DefaultTreeCellRenderer defaultTreeCellRenderer0 = new DefaultTreeCellRenderer();
      Color color0 = defaultTreeCellRenderer0.getBackgroundNonSelectionColor();
      jDayChooser0.setDecorationBackgroundColor(color0);
      MockDate mockDate0 = new MockDate();
      jDayChooser0.setMaxSelectableDate(mockDate0);
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=2.889778681735234
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      byte[] byteArray0 = new byte[0];
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      jDayChooser0.getDebugGraphicsOptions();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      jDayChooser0.setCalendar(mockGregorianCalendar0);
      jDayChooser0.setMaxDayCharacters(46);
      jDayChooser0.getDaysInMonth();
      jDayChooser0.getDayPanel();
      FileSystemHandling.shouldAllThrowIOExceptions();
      Locale locale0 = Locale.ENGLISH;
      jDayChooser0.setWeekOfYearVisible(true);
      Date date0 = jDayChooser0.defaultMinSelectableDate;
      JDayChooser jDayChooser1 = new JDayChooser(true);
      MockDate mockDate0 = new MockDate((-2076), 177, 46, 28, 238);
      jDayChooser0.setSelectableDateRange(date0, mockDate0);
      assertTrue(jDayChooser0.isWeekOfYearVisible());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=2.8082127632410736
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.toZonedDateTime();
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar();
      jDayChooser0.setCalendar(mockGregorianCalendar1);
      MockGregorianCalendar mockGregorianCalendar2 = new MockGregorianCalendar(3369, 3369, 2232, 47, 30);
      mockGregorianCalendar2.toZonedDateTime();
      jDayChooser0.setCalendar(mockGregorianCalendar2);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=3369,MONTH=3369,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=2232,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=47,HOUR_OF_DAY=47,MINUTE=30,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]", mockGregorianCalendar2.toString());
      
      Date date0 = jDayChooser0.defaultMaxSelectableDate;
      Date date1 = jDayChooser0.setMaxSelectableDate(date0);
      Time time0 = new Time(2232);
      Date date2 = jDayChooser0.setMinSelectableDate(time0);
      jDayChooser0.setSelectableDateRange(date2, date0);
      assertSame(date0, date1);
      
      jDayChooser0.setEnabled(false);
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=2.8421151244608924
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      DefaultTreeCellRenderer defaultTreeCellRenderer0 = new DefaultTreeCellRenderer();
      defaultTreeCellRenderer0.getBackgroundNonSelectionColor();
      JDayChooser jDayChooser1 = new JDayChooser();
      Color color0 = Color.green;
      jDayChooser1.setDecorationBackgroundColor(color0);
      jDayChooser0.setMaxSelectableDate((Date) null);
      jDayChooser0.setSelectableDateRange((Date) null, (Date) null);
      jDayChooser0.setEnabled(false);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      jDayChooser0.setWeekOfYearVisible(true);
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  /**
  //Test case number: 24
  /*Coverage entropy=3.0910424533583143
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.toZonedDateTime();
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar();
      jDayChooser0.setCalendar(mockGregorianCalendar1);
      MockGregorianCalendar mockGregorianCalendar2 = new MockGregorianCalendar(3369, 3369, 2232, 47, 30);
      mockGregorianCalendar2.toZonedDateTime();
      Color color0 = Color.green;
      jDayChooser0.setDecorationBackgroundColor(color0);
      MockDate mockDate0 = new MockDate();
      MockDate mockDate1 = new MockDate();
      FocusEvent focusEvent0 = new FocusEvent(jDayChooser0, 3369, true);
      jDayChooser0.focusGained(focusEvent0);
      assertFalse(jDayChooser0.getIgnoreRepaint());
  }

  /**
  //Test case number: 25
  /*Coverage entropy=3.332204510175204
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.getTimeZone();
      ZonedDateTime zonedDateTime0 = mockGregorianCalendar0.toZonedDateTime();
      GregorianCalendar gregorianCalendar0 = MockGregorianCalendar.from(zonedDateTime0);
      jDayChooser0.setCalendar(gregorianCalendar0);
      jDayChooser0.setMaxDayCharacters((-809));
      jDayChooser0.getDaysInMonth();
      jDayChooser0.getDayPanel();
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 28, 0L, 160, 160, '\'');
      jDayChooser0.keyTyped(keyEvent0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      Locale locale0 = Locale.ENGLISH;
      jDayChooser0.setWeekOfYearVisible(true);
      Date date0 = jDayChooser0.defaultMinSelectableDate;
      JDayChooser jDayChooser1 = new JDayChooser(true);
      MockDate mockDate0 = new MockDate(28, 177, '\'', 6, 6);
      jDayChooser1.keyPressed(keyEvent0);
      jDayChooser1.setFocus();
      jDayChooser0.keyReleased(keyEvent0);
      jDayChooser1.keyReleased(keyEvent0);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=2.5874635434129054
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.getInsets();
      jDayChooser0.getAutoscrolls();
      int int0 = 228;
      jDayChooser0.setDay(228);
      jDayChooser0.setFocusTraversalPolicyProvider(false);
      jDayChooser0.drawDays();
      System.setCurrentTimeMillis(0);
      jDayChooser0.setMonth(0);
      System.setCurrentTimeMillis((-784L));
      jDayChooser0.setDay(0);
      // Undeclared exception!
      try { 
        Time.valueOf("dqixD8tqhS]By^dXJby");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.sql.Time", e);
      }
  }
}