/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 15:23:51 GMT 2018
 */

package accessories.plugins.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import accessories.plugins.time.JDayChooser;
import accessories.plugins.time.JMonthChooser;
import accessories.plugins.time.JYearChooser;
import freemind.controller.Controller;
import freemind.modes.filemode.FileMode;
import java.awt.Color;
import java.awt.ContainerOrderFocusTraversalPolicy;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.RenderingHints;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Vector;
import javax.swing.DebugGraphics;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JList;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JToolBar;
import javax.swing.MenuElement;
import javax.swing.MenuSelectionManager;
import javax.swing.event.MenuKeyEvent;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.basic.BasicComboBoxEditor;
import javax.swing.plaf.basic.BasicScrollBarUI;
import javax.swing.tree.DefaultTreeCellRenderer;
import org.apache.batik.css.parser.Parser;
import org.apache.batik.svggen.SVGGeneratorContext;
import org.apache.batik.svggen.SVGGraphics2D;
import org.apache.fop.svg.PDFDocumentGraphics2D;
import org.apache.html.dom.HTMLDocumentImpl;
import org.apache.xerces.dom.ASDOMImplementationImpl;
import org.apache.xerces.dom.DocumentTypeImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.mock.java.time.MockLocalDateTime;
import org.evosuite.runtime.mock.java.time.MockZonedDateTime;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import org.w3c.dom.Document;

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
      jDayChooser0.getMaxSelectableDate();
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser_DecoratorButton0.getAction();
      BasicScrollBarUI basicScrollBarUI0 = new BasicScrollBarUI();
      FileMode fileMode0 = new FileMode();
      fileMode0.getController();
      // Undeclared exception!
      try { 
        fileMode0.init((Controller) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("freemind.modes.ControllerAdapter", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      boolean boolean0 = false;
      JDayChooser jDayChooser0 = new JDayChooser(false);
      BasicComboBoxEditor basicComboBoxEditor0 = new BasicComboBoxEditor();
      basicComboBoxEditor0.setItem(jDayChooser0);
      jDayChooser0.addFocusListener(basicComboBoxEditor0);
      boolean boolean1 = false;
      jDayChooser0.setWeekOfYearVisible(false);
      jDayChooser0.isDecorationBackgroundVisible();
      ZoneId zoneId0 = null;
      jDayChooser0.getComponentPopupMenu();
      // Undeclared exception!
      try { 
        MockLocalDateTime.now((ZoneId) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // zone
         //
         verifyException("java.util.Objects", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      int int0 = (-811);
      FocusEvent focusEvent0 = new FocusEvent(jDayChooser0, (-811), false, jDayChooser0);
      focusEvent0.getOppositeComponent();
      jDayChooser0.focusLost(focusEvent0);
      jDayChooser0.setName("k}aEptfshTK2py|3Wl");
      jDayChooser0.setDecorationBordersVisible(false);
      // Undeclared exception!
      try { 
        jDayChooser0.setCalendar((Calendar) null);
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
  /*Coverage entropy=2.6618403890648796
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.setMaxDayCharacters(11);
      DefaultTreeCellRenderer defaultTreeCellRenderer0 = new DefaultTreeCellRenderer();
      Color color0 = defaultTreeCellRenderer0.getTextNonSelectionColor();
      jDayChooser0.setDecorationBackgroundColor(color0);
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(0, jDayChooser0.getMaxDayCharacters());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=3.2188758248681983
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      Locale locale0 = Locale.TAIWAN;
      Locale locale1 = Locale.FRENCH;
      locale1.getUnicodeLocaleAttributes();
      locale1.getUnicodeLocaleAttributes();
      locale0.getDisplayScript(locale1);
      ArrayList<Locale.LanguageRange> arrayList0 = new ArrayList<Locale.LanguageRange>();
      Vector<String> vector0 = new Vector<String>();
      Locale.lookupTag(arrayList0, vector0);
      locale0.getExtensionKeys();
      jDayChooser0.setLocale(locale0);
      jDayChooser0.setMonth(3398);
      SystemColor systemColor0 = SystemColor.inactiveCaptionBorder;
      float[] floatArray0 = new float[5];
      floatArray0[0] = (float) 3398;
      floatArray0[1] = (float) 3398;
      floatArray0[2] = (float) 3398;
      floatArray0[3] = 622.522F;
      floatArray0[4] = (float) 3398;
      systemColor0.getComponents(floatArray0);
      systemColor0.getColorSpace();
      jDayChooser0.setDecorationBackgroundColor(systemColor0);
      jDayChooser0.getWeekdayForeground();
      jDayChooser0.setMonth(569);
      jDayChooser0.isDayBordersVisible();
      jDayChooser0.isDecorationBordersVisible();
      jDayChooser0.setLocale(locale0);
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      ActionEvent actionEvent0 = new ActionEvent(jDayChooser0, 254, "#EmW3x&Y|/");
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
  //Test case number: 5
  /*Coverage entropy=2.637304661672375
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      Dimension dimension0 = new Dimension(1036, 1036);
      int int0 = 2724;
      dimension0.height = 2724;
      jDayChooser0.setFocus();
      dimension0.height = 65312;
      jDayChooser0.setMaximumSize(dimension0);
      jDayChooser0.getDaysInMonth();
      jDayChooser0.setWeekOfYearVisible(true);
      jDayChooser0.drawDays();
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      PDFDocumentGraphics2D pDFDocumentGraphics2D0 = new PDFDocumentGraphics2D(true);
      // Undeclared exception!
      try { 
        pDFDocumentGraphics2D0.create();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.batik.ext.awt.g2d.AbstractGraphics2D", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.drawDays();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "A?";
      stringArray0[1] = "day";
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
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.setYearChooser((JYearChooser) null);
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=3.0910424533583143
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      ColorUIResource colorUIResource0 = (ColorUIResource)jDayChooser0.oldDayBackgroundColor;
      float[] floatArray0 = new float[7];
      floatArray0[0] = (float) (-3519);
      floatArray0[1] = (float) (-3519);
      floatArray0[2] = (float) (-3519);
      floatArray0[3] = (float) 2358;
      floatArray0[4] = (float) (-3519);
      floatArray0[5] = (float) 2358;
      floatArray0[6] = 0.0F;
      colorUIResource0.getComponents(floatArray0);
      Color.getColor("day", 2358);
      jDayChooser0.setSundayForeground(colorUIResource0);
      jDayChooser0.setEnabled(false);
      jDayChooser0.setDoubleBuffered(false);
      jDayChooser0.validate();
      jDayChooser0.firePropertyChange((String) null, '&', '&');
      FocusEvent focusEvent0 = new FocusEvent(jDayChooser0, (-3519), false, jDayChooser0);
      focusEvent0.paramString();
      jDayChooser0.focusLost(focusEvent0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-3519), (-3519), (-3519));
      Clock clock0 = mock(Clock.class, new ViolatedAssumptionAnswer());
      doReturn((ZoneId) null).when(clock0).getZone();
      doReturn((Instant) null).when(clock0).instant();
      // Undeclared exception!
      try { 
        MockZonedDateTime.now(clock0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // instant
         //
         verifyException("java.util.Objects", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.5240421428674074
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      assertEquals(14, jDayChooser0.getDay());
      
      jDayChooser0.setDay(230);
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      MouseEvent mouseEvent0 = new MouseEvent(jDayChooser0, 0, (-441L), 0, 1672, 0, 0, 0, 0, true, 0);
      jDayChooser0.dispatchEvent(mouseEvent0);
      jDayChooser0.getDayPanel();
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser_DecoratorButton0.getBorder();
      jDayChooser_DecoratorButton0.getDisplayedMnemonicIndex();
      boolean boolean0 = jDayChooser_DecoratorButton0.isFocusable();
      assertFalse(boolean0);
      
      jDayChooser0.setDayBordersVisible(true);
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.6618403890648796
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.setMaxDayCharacters(0);
      DefaultTreeCellRenderer defaultTreeCellRenderer0 = new DefaultTreeCellRenderer();
      Color color0 = defaultTreeCellRenderer0.getTextNonSelectionColor();
      JDayChooser jDayChooser1 = new JDayChooser(true);
      jDayChooser1.setDecorationBackgroundColor(color0);
      assertEquals(14, jDayChooser1.getDay());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=3.332204510175204
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.addListeners(0);
      jDayChooser0.setDay(0);
      jDayChooser0.updateUI();
      jDayChooser0.addListeners(0);
      jDayChooser0.setMaxDayCharacters(1765);
      jDayChooser0.setEnabled(true);
      Instant instant0 = MockInstant.ofEpochSecond((long) 1765, (long) 1765);
      Date date0 = Date.from(instant0);
      Date date1 = jDayChooser0.minSelectableDate;
      jDayChooser0.setSelectableDateRange(date0, date1);
      PDFDocumentGraphics2D pDFDocumentGraphics2D0 = new PDFDocumentGraphics2D(false);
      jDayChooser0.setSelectableDateRange(date1, date1);
      jDayChooser0.getAccessibleContext();
      jDayChooser0.setDecorationBordersVisible(true);
      jDayChooser0.getDaysInMonth();
      jDayChooser0.isWeekOfYearVisible();
      Color color0 = jDayChooser0.getSundayForeground();
      jDayChooser0.initialized = true;
      jDayChooser0.isWeekOfYearVisible();
      jDayChooser0.getWeekdayForeground();
      jDayChooser0.getMinSelectableDate();
      jDayChooser0.getMaxDayCharacters();
      jDayChooser0.setWeekdayForeground(color0);
      jDayChooser0.addListeners(0);
      jDayChooser0.getDecorationBackgroundColor();
      System.setCurrentTimeMillis(28);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=3.0910424533583143
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      JInternalFrame jInternalFrame0 = new JInternalFrame("day", false, false);
      Icon icon0 = jInternalFrame0.getFrameIcon();
      JRadioButtonMenuItem jRadioButtonMenuItem0 = new JRadioButtonMenuItem(icon0);
      MenuSelectionManager menuSelectionManager0 = new MenuSelectionManager();
      MenuElement[] menuElementArray0 = new MenuElement[5];
      menuElementArray0[0] = (MenuElement) jRadioButtonMenuItem0;
      menuElementArray0[1] = (MenuElement) jRadioButtonMenuItem0;
      menuElementArray0[2] = (MenuElement) jRadioButtonMenuItem0;
      menuElementArray0[3] = (MenuElement) jRadioButtonMenuItem0;
      menuElementArray0[4] = (MenuElement) jRadioButtonMenuItem0;
      MenuKeyEvent menuKeyEvent0 = new MenuKeyEvent(jRadioButtonMenuItem0, 1529, 1529, (-1090), (-1090), '#', menuElementArray0, menuSelectionManager0);
      MenuKeyEvent menuKeyEvent1 = new MenuKeyEvent(jInternalFrame0, 1583, 1L, 11, 707, '#', menuElementArray0, menuSelectionManager0);
      jDayChooser0.keyPressed(menuKeyEvent1);
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.9808986865328033
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      Locale locale0 = Locale.TAIWAN;
      Locale locale1 = Locale.FRENCH;
      locale1.getUnicodeLocaleAttributes();
      locale1.getUnicodeLocaleAttributes();
      locale0.getDisplayScript(locale1);
      ArrayList<Locale.LanguageRange> arrayList0 = new ArrayList<Locale.LanguageRange>();
      Vector<String> vector0 = new Vector<String>();
      Locale.lookupTag(arrayList0, vector0);
      locale0.getExtensionKeys();
      jDayChooser0.setLocale(locale0);
      jDayChooser0.setMonth(3398);
      SystemColor systemColor0 = SystemColor.inactiveCaptionBorder;
      float[] floatArray0 = new float[5];
      floatArray0[0] = (float) 3398;
      floatArray0[1] = (float) 3398;
      floatArray0[2] = (float) 3398;
      jDayChooser0.getGraphics();
      jDayChooser0.setSelectableDateRange((Date) null, (Date) null);
      jDayChooser0.getAccessibleContext();
      jDayChooser0.setDecorationBordersVisible(false);
      jDayChooser0.getDaysInMonth();
      jDayChooser0.isWeekOfYearVisible();
      jDayChooser0.getSundayForeground();
      jDayChooser0.isWeekOfYearVisible();
      jDayChooser0.getWeekdayForeground();
      jDayChooser0.getMinSelectableDate();
      jDayChooser0.getMaxDayCharacters();
      jDayChooser0.setWeekdayForeground(systemColor0);
      // Undeclared exception!
      try { 
        jDayChooser0.addListeners((-5048));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -5048
         //
         verifyException("accessories.plugins.time.JDayChooser", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.919285603816364
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) jDayChooser0;
      objectArray0[1] = (Object) jDayChooser0;
      objectArray0[2] = (Object) jDayChooser0;
      objectArray0[3] = (Object) jDayChooser0;
      jDayChooser0.drawWeeks();
      JList<Object> jList0 = new JList<Object>(objectArray0);
      jList0.firePropertyChange("", true, false);
      Color color0 = jList0.getSelectionBackground();
      color0.getColorSpace();
      color0.getColorSpace();
      jDayChooser0.setDecorationBackgroundColor(color0);
      jDayChooser0.getSelectedDay();
      jDayChooser0.isWeekOfYearVisible();
      FocusEvent focusEvent0 = new FocusEvent(jList0, (-56), true, jDayChooser0);
      Calendar calendar0 = MockCalendar.getInstance();
      calendar0.setFirstDayOfWeek(549);
      focusEvent0.setSource(calendar0);
      jDayChooser0.focusGained(focusEvent0);
      jDayChooser0.setMaxDayCharacters((-56));
      jDayChooser0.setYear((-56));
      jDayChooser0.setDay((-56));
      jDayChooser0.getSelectedDay();
      jDayChooser0.setWeekOfYearVisible(false);
      assertFalse(jDayChooser0.isWeekOfYearVisible());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=3.178053830347946
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, false);
      JDayChooser jDayChooser0 = new JDayChooser(false);
      ContainerOrderFocusTraversalPolicy containerOrderFocusTraversalPolicy0 = new ContainerOrderFocusTraversalPolicy();
      jDayChooser0.setFocusTraversalPolicy(containerOrderFocusTraversalPolicy0);
      jDayChooser0.hasFocus();
      jDayChooser0.setAlwaysFireDayProperty(false);
      jDayChooser0.updateUI();
      SystemColor systemColor0 = SystemColor.inactiveCaptionText;
      jDayChooser0.setDecorationBackgroundColor(systemColor0);
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 34, 0L, 34, 34, 'j');
      InputEvent.getModifiersExText((-790));
      // Undeclared exception!
      try { 
        jDayChooser0.keyPressed(keyEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("accessories.plugins.time.JDayChooser", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=3.2580965380214835
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) jDayChooser0;
      objectArray0[1] = (Object) jDayChooser0;
      objectArray0[2] = (Object) jDayChooser0;
      objectArray0[3] = (Object) jDayChooser0;
      jDayChooser0.drawWeeks();
      JList<Object> jList0 = new JList<Object>(objectArray0);
      jList0.firePropertyChange("", true, false);
      Color color0 = jList0.getSelectionBackground();
      color0.getColorSpace();
      color0.getColorSpace();
      jDayChooser0.setDecorationBackgroundColor(color0);
      JButton jButton0 = jDayChooser0.getSelectedDay();
      assertNull(jButton0);
      
      jDayChooser0.isWeekOfYearVisible();
      FocusEvent focusEvent0 = new FocusEvent(jList0, (-56), true, jDayChooser0);
      Calendar calendar0 = MockCalendar.getInstance();
      calendar0.setFirstDayOfWeek(549);
      focusEvent0.setSource(calendar0);
      MenuSelectionManager menuSelectionManager0 = MenuSelectionManager.defaultManager();
      MenuKeyEvent menuKeyEvent0 = new MenuKeyEvent(jDayChooser0, 11, 0L, 707, 11, 'g', (MenuElement[]) null, menuSelectionManager0);
      jDayChooser0.keyPressed(menuKeyEvent0);
      jDayChooser0.keyTyped(menuKeyEvent0);
      JMonthChooser jMonthChooser0 = new JMonthChooser(false);
      jDayChooser0.setMonthChooser(jMonthChooser0);
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=3.058225712435686
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, false);
      JDayChooser jDayChooser0 = new JDayChooser(false);
      ContainerOrderFocusTraversalPolicy containerOrderFocusTraversalPolicy0 = new ContainerOrderFocusTraversalPolicy();
      jDayChooser0.setFocusTraversalPolicy(containerOrderFocusTraversalPolicy0);
      jDayChooser0.hasFocus();
      jDayChooser0.setAlwaysFireDayProperty(false);
      jDayChooser0.updateUI();
      SystemColor systemColor0 = SystemColor.inactiveCaptionText;
      jDayChooser0.setDecorationBackgroundColor(systemColor0);
      Date date0 = jDayChooser0.setMaxSelectableDate((Date) null);
      jDayChooser0.setSelectableDateRange(date0, (Date) null);
      jDayChooser0.getAccessibleContext();
      JDayChooser jDayChooser1 = new JDayChooser();
      jDayChooser1.setDecorationBordersVisible(false);
      jDayChooser0.getDaysInMonth();
      jDayChooser1.isWeekOfYearVisible();
      jDayChooser0.getSundayForeground();
      boolean boolean0 = jDayChooser1.isWeekOfYearVisible();
      assertFalse(boolean0);
      
      Color color0 = jDayChooser0.getWeekdayForeground();
      assertEquals((-16754012), color0.getRGB());
      
      jDayChooser1.getMinSelectableDate();
      jDayChooser1.getMaxDayCharacters();
      SystemColor systemColor1 = SystemColor.controlLtHighlight;
      jDayChooser0.setWeekdayForeground(systemColor1);
      jDayChooser0.addListeners(0);
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=3.2958368660043296
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.addListeners(0);
      jDayChooser0.setDay(0);
      jDayChooser0.updateUI();
      jDayChooser0.addListeners(0);
      jDayChooser0.setMaxDayCharacters(1765);
      jDayChooser0.setEnabled(true);
      Instant instant0 = MockInstant.now();
      Date date0 = Date.from(instant0);
      Date date1 = jDayChooser0.minSelectableDate;
      jDayChooser0.setSelectableDateRange(date0, date1);
      jDayChooser0.getGraphics();
      jDayChooser0.setSelectableDateRange(date1, date1);
      jDayChooser0.getAccessibleContext();
      jDayChooser0.setDecorationBordersVisible(true);
      jDayChooser0.getDaysInMonth();
      jDayChooser0.isWeekOfYearVisible();
      Color color0 = jDayChooser0.getSundayForeground();
      jDayChooser0.isWeekOfYearVisible();
      Color color1 = Color.darkGray;
      jDayChooser0.getMinSelectableDate();
      jDayChooser0.getMaxDayCharacters();
      jDayChooser0.setWeekdayForeground(color0);
      jDayChooser0.addListeners(0);
      System.setCurrentTimeMillis(0L);
      jDayChooser0.getLocale();
      assertEquals(1, jDayChooser0.getDay());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=2.83226898726388
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, false);
      JDayChooser jDayChooser0 = new JDayChooser(false);
      ContainerOrderFocusTraversalPolicy containerOrderFocusTraversalPolicy0 = new ContainerOrderFocusTraversalPolicy();
      jDayChooser0.setFocusTraversalPolicy(containerOrderFocusTraversalPolicy0);
      jDayChooser0.hasFocus();
      jDayChooser0.setAlwaysFireDayProperty(true);
      jDayChooser0.updateUI();
      SystemColor systemColor0 = SystemColor.inactiveCaptionText;
      jDayChooser0.setDecorationBackgroundColor((Color) null);
      int int0 = 29;
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 34, (-1L), 10003, 29, '\'');
      InputEvent.getModifiersExText(22);
      jDayChooser0.keyPressed(keyEvent0);
      jDayChooser0.setEnabled(true);
      Parser parser0 = new Parser();
      parser0.getLocale();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
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
}
