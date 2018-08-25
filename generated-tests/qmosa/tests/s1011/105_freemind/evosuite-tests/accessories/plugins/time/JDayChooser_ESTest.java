/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 11:20:12 GMT 2018
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
import freemind.extensions.MindMapHook;
import freemind.modes.mindmapmode.MindMapController;
import freemind.modes.schememode.SchemeMode;
import freemind.view.mindmapview.attributeview.AttributePopupMenu;
import java.awt.AWTEventMulticaster;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.SystemColor;
import java.awt.color.ColorSpace;
import java.awt.event.ActionEvent;
import java.awt.event.ContainerListener;
import java.awt.event.FocusEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.font.FontRenderContext;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.ColorModel;
import java.awt.image.ComponentColorModel;
import java.awt.image.DataBuffer;
import java.awt.image.DataBufferByte;
import java.awt.image.ImageProducer;
import java.awt.image.IndexColorModel;
import java.awt.image.MemoryImageSource;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PrintWriter;
import java.io.PushbackInputStream;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.Hashtable;
import java.util.Locale;
import javax.help.BackAction;
import javax.swing.Box;
import javax.swing.JColorChooser;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.MenuElement;
import javax.swing.MenuSelectionManager;
import javax.swing.TransferHandler;
import javax.swing.event.MenuKeyEvent;
import javax.swing.text.AttributeSet;
import javax.swing.text.DefaultCaret;
import javax.swing.text.DefaultEditorKit;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.Element;
import javax.swing.text.JTextComponent;
import javax.swing.text.LabelView;
import javax.swing.text.StringContent;
import javax.swing.text.StyleContext;
import org.apache.batik.bridge.SVGPathElementBridge;
import org.apache.batik.bridge.SVGUseElementBridge;
import org.apache.batik.ext.awt.g2d.GraphicContext;
import org.apache.batik.svggen.DOMTreeManager;
import org.apache.batik.svggen.ExtensionHandler;
import org.apache.batik.svggen.ImageHandlerPNGEncoder;
import org.apache.batik.svggen.SVGGeneratorContext;
import org.apache.batik.svggen.SVGGraphics2D;
import org.apache.xalan.processor.ProcessorImport;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.hsqldb.jdbc.jdbcCallableStatement;
import org.hsqldb.jdbc.jdbcConnection;
import org.hsqldb.lib.FileUtil;
import org.hsqldb.persist.HsqlProperties;
import org.junit.runner.RunWith;
import org.w3c.dom.Document;
import plugins.collaboration.database.DatabaseConnectionHook;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JDayChooser_ESTest extends JDayChooser_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      JComponent.getDefaultLocale();
      jDayChooser0.drawDays();
      jDayChooser0.setFocus();
      jDayChooser0.setAlwaysFireDayProperty(true);
      int int0 = 408;
      int int1 = 0;
      char char0 = ':';
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 408, 0L, 408, 0, ':');
      // Undeclared exception!
      try { 
        InputEvent.getMaskForButton(408);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // button doesn't exist 408
         //
         verifyException("java.awt.event.InputEvent", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getTopLevelAncestor();
      jDayChooser0.setMaxDayCharacters(2842);
      jDayChooser0.isDecorationBackgroundVisible();
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertFalse(jDayChooser0.isWeekOfYearVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.getGraphics();
      jDayChooser0.isValidateRoot();
      jDayChooser0.getWeekdayForeground();
      int int0 = 5463;
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)4;
      byteArray0[1] = (byte) (-54);
      byteArray0[2] = (byte) (-29);
      byteArray0[3] = (byte) (-26);
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte) (-43);
      byteArray0[6] = (byte)26;
      byteArray0[7] = (byte)0;
      byteArray0[8] = (byte) (-75);
      byte[] byteArray1 = new byte[8];
      byteArray1[0] = (byte)0;
      byteArray1[1] = (byte)26;
      byteArray1[2] = (byte)0;
      byteArray1[3] = (byte) (-26);
      byteArray1[4] = (byte) (-54);
      byteArray1[5] = (byte) (-29);
      byteArray1[6] = (byte)0;
      byteArray1[7] = (byte) (-75);
      IndexColorModel indexColorModel0 = null;
      try {
        indexColorModel0 = new IndexColorModel(5463, 5463, byteArray0, byteArray1, byteArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of bits must be between 1 and 16.
         //
         verifyException("java.awt.image.IndexColorModel", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=3.2188758248681983
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      Time time0 = new Time(4871L);
      Locale locale0 = Locale.CHINA;
      Locale locale1 = Locale.KOREA;
      locale1.getDisplayName();
      locale0.getDisplayCountry(locale1);
      jDayChooser0.setLocale(locale0);
      time0.getTime();
      time0.toLocalTime();
      Instant instant0 = MockInstant.ofEpochSecond(267L);
      Date.from(instant0);
      jDayChooser0.setSelectableDateRange(time0, time0);
      jDayChooser0.isDecorationBackgroundVisible();
      jDayChooser0.isDayBordersVisible();
      jDayChooser0.setMaxDayCharacters((-3492));
      jDayChooser0.isDayBordersVisible();
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      
      jDayChooser0.setDecorationBordersVisible(true);
      jDayChooser0.keyTyped((KeyEvent) null);
      jDayChooser0.setMaxDayCharacters((-3492));
      jDayChooser0.drawWeeks();
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.getDay();
      jDayChooser0.getMaxSelectableDate();
      jDayChooser0.init();
      KeyEvent keyEvent0 = null;
      try {
        keyEvent0 = new KeyEvent(jDayChooser0, 3, 0L, (-3701), (-2135), 'C', (-3701));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid keyLocation
         //
         verifyException("java.awt.event.KeyEvent", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
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
  //Test case number: 6
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      Component component0 = Box.createVerticalGlue();
      int int0 = 199;
      FocusEvent focusEvent0 = new FocusEvent(component0, 199, true);
      focusEvent0.setSource(component0);
      jDayChooser0.focusLost(focusEvent0);
      jDayChooser0.setDecorationBordersVisible(true);
      StyleContext styleContext0 = new StyleContext();
      DefaultStyledDocument defaultStyledDocument0 = new DefaultStyledDocument();
      defaultStyledDocument0.getStyle("day");
      // Undeclared exception!
      try { 
        styleContext0.getBackground((AttributeSet) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("javax.swing.text.StyleConstants", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=3.0910424533583143
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      MockDate mockDate0 = new MockDate(0, 0, 142, (-1271), (-505));
      mockDate0.toInstant();
      jDayChooser0.setMaxSelectableDate(mockDate0);
      jDayChooser0.getInputVerifier();
      assertTrue(jDayChooser0.isDayBordersVisible());
      
      jDayChooser0.setDayBordersVisible(true);
      jDayChooser0.setYear(142);
      int int0 = jDayChooser0.getDay();
      assertEquals(14, int0);
      
      jDayChooser0.drawWeeks();
      JList<Integer> jList0 = new JList<Integer>();
      Color color0 = jList0.getSelectionBackground();
      jDayChooser0.setForeground(color0);
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.637304661672375
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getX();
      boolean boolean0 = true;
      jDayChooser0.setEnabled(true);
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      // Undeclared exception!
      try { 
        ColorSpace.getInstance(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown color space
         //
         verifyException("java.awt.color.ColorSpace", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=3.0910424533583143
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.transferFocus();
      jDayChooser0.setAutoscrolls(true);
      jDayChooser0.setMonth(6);
      jDayChooser0.setMonth(0);
      jDayChooser0.getSelectedDay();
      jDayChooser0.setEnabled(false);
      jDayChooser0.setFocusTraversalPolicyProvider(true);
      jDayChooser0.setAlwaysFireDayProperty(false);
      jDayChooser0.setDecorationBackgroundVisible(false);
      String string0 = "rX+4.?f,ho^!a}fI";
      FileUtil fileUtil0 = FileUtil.getDefaultInstance();
      HsqlProperties hsqlProperties0 = new HsqlProperties("rX+4.?f,ho^!a}fI", fileUtil0, true);
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
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setVisible(false);
      jDayChooser0.getHeight();
      jDayChooser0.getDay();
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
  //Test case number: 11
  /*Coverage entropy=3.0910424533583143
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getTopLevelAncestor();
      jDayChooser0.today = null;
      SystemColor systemColor0 = SystemColor.inactiveCaptionBorder;
      Color.getColor("day", (-571));
      jDayChooser0.setSundayForeground(systemColor0);
      jDayChooser0.paintImmediately((-571), (-571), 0, (-571));
      Locale locale0 = Locale.ENGLISH;
      locale0.getUnicodeLocaleKeys();
      locale0.toLanguageTag();
      jDayChooser0.setLocale(locale0);
      jDayChooser0.getMaxSelectableDate();
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.6618403890648796
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      boolean boolean0 = false;
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.isDecorationBackgroundVisible();
      jDayChooser0.getTransferHandler();
      jDayChooser0.setTransferHandler((TransferHandler) null);
      int int0 = 0;
      jDayChooser0.setMaxDayCharacters(0);
      String string0 = "Windows";
      Color color0 = Color.DARK_GRAY;
      Color.getColor("Pi");
      try { 
        JColorChooser.showDialog(jDayChooser0, "h", color0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      AWTEventMulticaster.remove((ContainerListener) null, (ContainerListener) null);
      AWTEventMulticaster.add((ContainerListener) null, (ContainerListener) null);
      jDayChooser0.removeContainerListener((ContainerListener) null);
      jDayChooser0.setDecorationBackgroundVisible(true);
      jDayChooser0.setMonth((-2009));
      jDayChooser0.init();
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser_DecoratorButton0.isFocusable();
      jDayChooser_DecoratorButton0.isFocusable();
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.771495325882871
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.setDay((-3417));
      jDayChooser0.getLocale();
      jDayChooser0.getDayPanel();
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 130, (-3417), 0, 0, '9');
      jDayChooser0.keyPressed(keyEvent0);
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      KeyStroke.getKeyStroke("");
      Object object0 = jDayChooser0.getTreeLock();
      BackAction backAction0 = new BackAction(object0);
      backAction0.isEnabled();
      jDayChooser_DecoratorButton0.addMouseListener(backAction0);
      jDayChooser0.getMaxDayCharacters();
      jDayChooser0.setDecorationBackgroundColor((Color) null);
      assertEquals(1, jDayChooser0.getDay());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=3.1354942159291497
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.getMaximumSize();
      jDayChooser0.firePropertyChange("", false, true);
      jDayChooser0.setAlwaysFireDayProperty(true);
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, false);
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser_DecoratorButton0.paint((Graphics) null);
      jDayChooser0.getDayPanel();
      DefaultEditorKit.PasteAction defaultEditorKit_PasteAction0 = new DefaultEditorKit.PasteAction();
      jDayChooser0.getAutoscrolls();
      ActionEvent actionEvent0 = new ActionEvent(defaultEditorKit_PasteAction0, Integer.MAX_VALUE, "org.apache.batik.dom.svg.SVGOMAltGlyphDefElement");
      JMonthChooser jMonthChooser0 = jDayChooser0.monthChooser;
      jDayChooser0.setMonthChooser((JMonthChooser) null);
      // Undeclared exception!
      try { 
        jDayChooser0.actionPerformed(actionEvent0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // javax.swing.text.DefaultEditorKit$PasteAction cannot be cast to javax.swing.JButton
         //
         verifyException("accessories.plugins.time.JDayChooser", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getTopLevelAncestor();
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
  //Test case number: 17
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 2264, 2264, 2264, 2264, 'I');
      KeyEvent.getExtendedKeyCodeForChar(2264);
      keyEvent0.consume();
      jDayChooser0.keyReleased(keyEvent0);
      jDayChooser0.getBaseline(0, 0);
      assertTrue(jDayChooser0.isDayBordersVisible());
      
      jDayChooser0.setDayBordersVisible(false);
      jDayChooser0.isWeekOfYearVisible();
      jDayChooser0.isWeekOfYearVisible();
      jDayChooser0.setFocus();
      assertFalse(jDayChooser0.isDayBordersVisible());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.799517964535027
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.getMaximumSize();
      jDayChooser0.firePropertyChange("", false, true);
      jDayChooser0.setAlwaysFireDayProperty(true);
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser0.setMaxDayCharacters(37);
      boolean boolean0 = jDayChooser0.isDayBordersVisible();
      assertTrue(boolean0);
      
      jDayChooser0.setDecorationBordersVisible(false);
      jDayChooser0.keyTyped((KeyEvent) null);
      jDayChooser0.setMaxDayCharacters(37);
      jDayChooser0.drawWeeks();
      SystemColor systemColor0 = SystemColor.textText;
      jDayChooser0.setWeekdayForeground(systemColor0);
      jDayChooser0.setMonth(Integer.MAX_VALUE);
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertEquals(0, jDayChooser0.getMaxDayCharacters());
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isWeekOfYearVisible());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.691693794629735
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      AWTEventMulticaster.remove((ContainerListener) null, (ContainerListener) null);
      StringContent stringContent0 = new StringContent(36);
      StyleContext styleContext0 = StyleContext.getDefaultStyleContext();
      DefaultStyledDocument defaultStyledDocument0 = new DefaultStyledDocument(stringContent0, styleContext0);
      Element element0 = defaultStyledDocument0.getParagraphElement(591);
      LabelView labelView0 = new LabelView(element0);
      labelView0.getBackground();
      jDayChooser0.setDecorationBackgroundColor((Color) null);
      jDayChooser0.setMaxSelectableDate((Date) null);
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=3.0910424533583143
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.getName();
      jDayChooser0.getMaximumSize();
      jDayChooser0.firePropertyChange("", false, true);
      jDayChooser0.setAlwaysFireDayProperty(true);
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser_DecoratorButton0.paint((Graphics) null);
      jDayChooser0.setMonth(Integer.MAX_VALUE);
      jDayChooser0.init();
      jDayChooser0.getMinSelectableDate();
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setMonth(31);
      jDayChooser0.focusGained((FocusEvent) null);
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=2.5663141074309888
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      JMonthChooser jMonthChooser0 = new JMonthChooser(true);
      Locale locale0 = jMonthChooser0.getLocale();
      jDayChooser0.setLocale(locale0);
      jDayChooser0.setDay(10027);
      assertEquals(28, jDayChooser0.getDay());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      
      jDayChooser0.decorationBordersVisible = false;
      jDayChooser0.getX();
      Color color0 = Color.GREEN;
      jDayChooser0.oldDayBackgroundColor = color0;
      jDayChooser0.setYear(1450);
      int int0 = jDayChooser0.getDaysInMonth();
      assertEquals(28, int0);
      
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Color color1 = jDayChooser0.getSundayForeground();
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertEquals((-6029312), color1.getRGB());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 24
  /*Coverage entropy=2.807245941199719
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, (String) null);
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.firePropertyChange("stemh", false, false);
      jDayChooser0.setAlwaysFireDayProperty(false);
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser_DecoratorButton0.paint((Graphics) null);
      jDayChooser0.setMonth(36);
      jDayChooser0.init();
      jDayChooser0.setWeekOfYearVisible(false);
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }
}
