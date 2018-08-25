/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 09:12:07 GMT 2018
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
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.color.ColorSpace;
import java.awt.color.ICC_Profile;
import java.awt.event.ActionEvent;
import java.awt.event.ContainerListener;
import java.awt.event.FocusEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseWheelListener;
import java.awt.image.IndexColorModel;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.PriorityQueue;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.event.AncestorListener;
import javax.swing.plaf.basic.BasicEditorPaneUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.Position;
import javax.xml.transform.URIResolver;
import org.apache.batik.gvt.text.GVTAttributedCharacterIterator;
import org.apache.batik.svggen.DefaultExtensionHandler;
import org.apache.fop.fonts.FontInfo;
import org.apache.fop.fonts.MultiByteFont;
import org.apache.fop.pdf.PDFDocument;
import org.apache.fop.pdf.PDFPage;
import org.apache.fop.pdf.PDFResources;
import org.apache.fop.svg.PDFGraphics2D;
import org.apache.xalan.processor.StylesheetHandler;
import org.apache.xalan.processor.TransformerFactoryImpl;
import org.apache.xpath.XPathContext;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.hsqldb.Result;
import org.hsqldb.Session;
import org.hsqldb.jdbc.jdbcCallableStatement;
import org.hsqldb.jdbc.jdbcConnection;
import org.hsqldb.persist.HsqlProperties;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JDayChooser_ESTest extends JDayChooser_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=3.1354942159291497
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      int int0 = 0;
      jDayChooser0.setMaxDayCharacters(0);
      jDayChooser0.isPaintingForPrint();
      AncestorListener ancestorListener0 = mock(AncestorListener.class, new ViolatedAssumptionAnswer());
      jDayChooser0.addAncestorListener(ancestorListener0);
      jDayChooser0.getFocusTraversalPolicy();
      jDayChooser0.keyTyped((KeyEvent) null);
      jDayChooser0.getBorder();
      jDayChooser0.addMouseWheelListener((MouseWheelListener) null);
      jDayChooser0.setDayBordersVisible(false);
      jDayChooser0.setSize(0, 0);
      jDayChooser0.initDecorations();
      jDayChooser0.isWeekOfYearVisible();
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
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      JMonthChooser jMonthChooser0 = new JMonthChooser();
      jDayChooser0.setMonthChooser(jMonthChooser0);
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.7107572577786656
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, (-473), (-1L), 90, 90, '.', 0);
      keyEvent0.getExtendedKeyCode();
      jDayChooser0.keyTyped(keyEvent0);
      jDayChooser0.getDayPanel();
      Date date0 = jDayChooser0.minSelectableDate;
      jDayChooser0.setSelectableDateRange(date0, date0);
      String string0 = "uri.io";
      MockFile mockFile0 = new MockFile("qwsR", "");
      // Undeclared exception!
      try { 
        Font.createFont(90, (File) mockFile0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // font format not recognized
         //
         verifyException("java.awt.Font", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.7419541084422874
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      ContainerListener containerListener0 = mock(ContainerListener.class, new ViolatedAssumptionAnswer());
      ContainerListener containerListener1 = AWTEventMulticaster.add(containerListener0, containerListener0);
      jDayChooser0.maxDayCharacters = 1434;
      jDayChooser0.getFocusListeners();
      jDayChooser0.setFocusCycleRoot(true);
      jDayChooser0.setMonth((-1528));
      AWTEventMulticaster.remove(containerListener1, containerListener1);
      jDayChooser0.addContainerListener((ContainerListener) null);
      jDayChooser0.doLayout();
      jDayChooser0.isDecorationBackgroundVisible();
      jDayChooser0.getWeekdayForeground();
      jDayChooser0.isDayBordersVisible();
      String string0 = "";
      HsqlProperties hsqlProperties0 = HsqlProperties.delimitedArgPairsToProps("z2Z\";)O:nj", "z2Z\";)O:nj", "z2Z\";)O:nj", "");
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
  //Test case number: 4
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "day";
      stringArray0[1] = "J,D+O&P";
      stringArray0[2] = "accessories.plugins.time.JDayChooser$DecoratorButton";
      stringArray0[3] = "";
      stringArray0[4] = "sk&9H*64O.WL)!fDcc";
      stringArray0[5] = "localFileName";
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
  //Test case number: 5
  /*Coverage entropy=3.2958368660043296
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setMonth(100);
      jDayChooser0.getKeyListeners();
      assertTrue(jDayChooser0.isDayBordersVisible());
      
      jDayChooser0.setDayBordersVisible(true);
      jDayChooser0.isWeekOfYearVisible();
      jDayChooser0.getLocale();
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 100, 100, (-441), 3390, 'U');
      KeyEvent.getKeyText(1034);
      KeyEvent.getKeyModifiersText(1045);
      Integer integer0 = GVTAttributedCharacterIterator.TextAttribute.ORIENTATION_AUTO;
      keyEvent0.setSource(integer0);
      jDayChooser0.keyPressed(keyEvent0);
      jDayChooser0.setYearChooser((JYearChooser) null);
      jDayChooser0.getMaxSelectableDate();
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=3.1354942159291497
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.setFocus();
      Color color0 = Color.RED;
      jDayChooser0.decorationBackgroundColor = color0;
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 0, 0, 0, 0, 'C');
      KeyEvent.getKeyText(0);
      jDayChooser0.keyTyped(keyEvent0);
      java.sql.Date date0 = new java.sql.Date(0);
      LocalDate localDate0 = date0.toLocalDate();
      LocalDate localDate1 = date0.toLocalDate();
      java.sql.Date date1 = java.sql.Date.valueOf(localDate1);
      date1.before(date0);
      java.sql.Date.valueOf(localDate0);
      jDayChooser0.setSelectableDateRange(date1, date0);
      jDayChooser0.setMaxSelectableDate(date1);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, (-3685), (-1455), 34, 0);
      mockGregorianCalendar0.roll(6, false);
      String string0 = " _vb?R<M>BaA}\\u*";
      ActionEvent actionEvent0 = new ActionEvent(mockGregorianCalendar0, 0, string0, (-671L), 34);
      actionEvent0.paramString();
      // Undeclared exception!
      try { 
        jDayChooser0.actionPerformed(actionEvent0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.evosuite.runtime.mock.java.util.MockGregorianCalendar cannot be cast to javax.swing.JButton
         //
         verifyException("accessories.plugins.time.JDayChooser", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.606610584382382
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.decorationBackgroundVisible = false;
      jDayChooser0.setDecorationBackgroundVisible(false);
      jDayChooser0.setWeekOfYearVisible(false);
      Session session0 = mock(Session.class, new ViolatedAssumptionAnswer());
      doReturn((Result) null).when(session0).execute(any(org.hsqldb.Result.class));
      jdbcConnection jdbcConnection0 = new jdbcConnection(session0);
      jdbcCallableStatement jdbcCallableStatement0 = null;
      try {
        jdbcCallableStatement0 = new jdbcCallableStatement(jdbcConnection0, "B;s'`F#c=I7", (-616));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.hsqldb.jdbc.jdbcPreparedStatement", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.65970797168196
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.getInputMethodListeners();
      assertFalse(jDayChooser0.isWeekOfYearVisible());
      
      jDayChooser0.setWeekOfYearVisible(true);
      jDayChooser0.getGraphicsConfiguration();
      int int0 = jDayChooser0.getDay();
      assertEquals(14, int0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=3.0910424533583143
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setVerifyInputWhenFocusTarget(false);
      jDayChooser0.requestFocusInWindow();
      jDayChooser0.setToolTipText("%h$2nb,1SH");
      jDayChooser0.firePropertyChange("SVGAbort", (short)0, (short) (-1697));
      jDayChooser0.isDayBordersVisible();
      Locale locale0 = new Locale("g*z1Lz4'bYuY", "g*z1Lz4'bYuY", "SVGAbort");
      ArrayList<Locale.LanguageRange> arrayList0 = new ArrayList<Locale.LanguageRange>();
      PriorityQueue<String> priorityQueue0 = new PriorityQueue<String>();
      Locale.lookupTag(arrayList0, priorityQueue0);
      jDayChooser0.setLocale(locale0);
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      ICC_Profile[] iCC_ProfileArray0 = new ICC_Profile[5];
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)12;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)57;
      jDayChooser0.setAlwaysFireDayProperty(false);
      byteArray0[3] = (byte) (-75);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      // Undeclared exception!
      try { 
        ICC_Profile.getInstance((InputStream) byteArrayInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid ICC Profile Data
         //
         verifyException("java.awt.color.ICC_Profile", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TransformerFactoryImpl transformerFactoryImpl0 = new TransformerFactoryImpl();
      DefaultTableModel defaultTableModel0 = new DefaultTableModel((Object[][]) null, (Object[]) null);
      XPathContext xPathContext0 = new XPathContext(defaultTableModel0, false);
      xPathContext0.getURIResolver();
      transformerFactoryImpl0.setURIResolver((URIResolver) null);
      StylesheetHandler stylesheetHandler0 = new StylesheetHandler(transformerFactoryImpl0);
      DefaultExtensionHandler defaultExtensionHandler0 = new DefaultExtensionHandler();
      JDayChooser jDayChooser0 = new JDayChooser(true);
      FocusEvent focusEvent0 = new FocusEvent(jDayChooser0, 541);
      jDayChooser0.focusLost(focusEvent0);
      assertTrue(jDayChooser0.isWeekOfYearVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=3.1354942159291497
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      BasicEditorPaneUI basicEditorPaneUI0 = new BasicEditorPaneUI();
      JYearChooser jYearChooser0 = new JYearChooser();
      JTextField jTextField0 = jYearChooser0.textField;
      ContainerListener containerListener0 = mock(ContainerListener.class, new ViolatedAssumptionAnswer());
      ContainerListener containerListener1 = AWTEventMulticaster.add(containerListener0, containerListener0);
      AWTEventMulticaster.remove(containerListener1, containerListener1);
      jTextField0.addContainerListener((ContainerListener) null);
      Position.Bias position_Bias0 = Position.Bias.Backward;
      jDayChooser0.createToolTip();
      Rectangle rectangle0 = new Rectangle(238, 238, 238, 238);
      rectangle0.y = 238;
      jDayChooser0.paintImmediately(rectangle0);
      jDayChooser0.setAlignmentX((-15.376365F));
      jDayChooser0.transferFocusDownCycle();
      jDayChooser0.init();
      jDayChooser0.getMaxSelectableDate();
      jDayChooser0.setFocus();
      jDayChooser0.getMinSelectableDate();
      jDayChooser0.setMonth((-3293));
      int int0 = jDayChooser0.getDaysInMonth();
      assertEquals(31, int0);
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isWeekOfYearVisible());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=3.2188758248681983
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      boolean boolean0 = jDayChooser0.isDecorationBackgroundVisible();
      jDayChooser0.setMaxDayCharacters(0);
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 63741, 11L, (-592), 0, '6', 0);
      KeyEvent.getExtendedKeyCodeForChar(0);
      InputEvent.getModifiersExText(0);
      keyEvent0.consume();
      jDayChooser0.keyReleased(keyEvent0);
      boolean boolean1 = jDayChooser0.isDecorationBordersVisible();
      assertFalse(boolean1 == boolean0);
      
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      PDFResources pDFResources0 = new PDFResources(0);
      PDFPage pDFPage0 = new PDFPage(pDFResources0, 0, 705);
      pDFPage0.getDocument();
      pDFResources0.setObjectNumber(3218);
      EmptyBorder emptyBorder0 = new EmptyBorder(164, 0, 8658, 0);
      jDayChooser_DecoratorButton0.setBorder(emptyBorder0);
      PDFGraphics2D pDFGraphics2D0 = new PDFGraphics2D(true, (FontInfo) null, (PDFDocument) null, pDFPage0, "searchresults", (String) null, (-1166.4054F));
      MultiByteFont multiByteFont0 = new MultiByteFont();
      org.apache.fop.fonts.Font font0 = new org.apache.fop.fonts.Font((String) null, multiByteFont0, 0);
      pDFGraphics2D0.setOverrideFontState(font0);
      jDayChooser_DecoratorButton0.paint(pDFGraphics2D0);
      jDayChooser0.setDecorationBackgroundVisible(true);
      jDayChooser0.setEnabled(true);
      jDayChooser0.getMaxDayCharacters();
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.793671240081695
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.grabFocus();
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 323, 323, 323, 323, 'M');
      keyEvent0.consume();
      keyEvent0.setKeyCode(3363);
      jDayChooser0.keyPressed(keyEvent0);
      jDayChooser0.setMaxDayCharacters(14);
      jDayChooser0.setDay(14);
      jDayChooser0.setDay(376);
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser_DecoratorButton0.getKeyListeners();
      jDayChooser_DecoratorButton0.addMouseListener((MouseListener) null);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(14, 4041, 3363, (-1), 25, (-1));
      jDayChooser0.setCalendar(mockGregorianCalendar0);
      assertEquals(28, jDayChooser0.getDay());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.701765291241601
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.addListeners(0);
      jDayChooser0.getDayPanel();
      assertEquals(14, jDayChooser0.getDay());
      
      jDayChooser0.setDay(0);
      jDayChooser0.getSelectedDay();
      jDayChooser0.selectedDay = null;
      jDayChooser0.getMaxSelectableDate();
      Date date0 = jDayChooser0.maxSelectableDate;
      jDayChooser0.setMaxSelectableDate(date0);
      jDayChooser0.setMaxSelectableDate(date0);
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.7936712400816957
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.grabFocus();
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 323, 323, 323, 323, 'M');
      keyEvent0.consume();
      keyEvent0.setKeyCode(3363);
      jDayChooser0.keyPressed(keyEvent0);
      jDayChooser0.setMaxDayCharacters(14);
      jDayChooser0.setDay(14);
      int int0 = 376;
      jDayChooser0.setDay(376);
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser_DecoratorButton0.addMouseListener((MouseListener) null);
      jDayChooser0.getDecorationBackgroundColor();
      jdbcConnection jdbcConnection0 = null;
      try {
        jdbcConnection0 = new jdbcConnection((HsqlProperties) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.hsqldb.jdbc.jdbcConnection", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=3.178053830347946
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.grabFocus();
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 323, 323, 323, 323, 'M');
      keyEvent0.consume();
      keyEvent0.setKeyCode(3363);
      jDayChooser0.keyPressed(keyEvent0);
      jDayChooser0.setMaxDayCharacters(14);
      jDayChooser0.setDay(14);
      jDayChooser0.setDay(376);
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser_DecoratorButton0.addMouseListener((MouseListener) null);
      jDayChooser0.setDayBordersVisible(true);
      jDayChooser0.getSundayForeground();
      assertEquals(28, jDayChooser0.getDay());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.673761264516174
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.getInputMethodListeners();
      jDayChooser0.setMaxDayCharacters((-3667));
      jDayChooser0.setDay(14);
      jDayChooser0.setDay(3);
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser_DecoratorButton0.addMouseListener((MouseListener) null);
      jDayChooser0.setEnabled(false);
      assertEquals(3, jDayChooser0.getDay());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.8274467288059113
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.grabFocus();
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 323, 323, 323, 323, 'M');
      keyEvent0.consume();
      keyEvent0.setKeyCode(3363);
      jDayChooser0.keyPressed(keyEvent0);
      jDayChooser0.setMaxDayCharacters(14);
      jDayChooser0.setDay(14);
      jDayChooser0.setDay(376);
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte) (-28);
      byteArray0[1] = (byte) (-25);
      byteArray0[2] = (byte)1;
      byteArray0[3] = (byte)52;
      byteArray0[4] = (byte) (-1);
      byteArray0[5] = (byte)26;
      byteArray0[6] = (byte) (-104);
      ImageIcon imageIcon0 = new ImageIcon(byteArray0);
      jDayChooser_DecoratorButton0.setDisabledSelectedIcon(imageIcon0);
      jDayChooser_DecoratorButton0.addMouseListener((MouseListener) null);
      jDayChooser0.setMaxDayCharacters((byte)1);
      assertEquals(28, jDayChooser0.getDay());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, (-448), (-1L), 90, 90, '.', 0);
      keyEvent0.getExtendedKeyCode();
      jDayChooser0.keyTyped(keyEvent0);
      jDayChooser0.setDay(49);
      jDayChooser0.setDay(17);
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser_DecoratorButton0.addMouseListener((MouseListener) null);
      Color color0 = Color.DARK_GRAY;
      jDayChooser0.setSundayForeground(color0);
      assertEquals(17, jDayChooser0.getDay());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=3.2958368660043296
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setMonth(100);
      jDayChooser0.getKeyListeners();
      jDayChooser0.setDayBordersVisible(true);
      jDayChooser0.isWeekOfYearVisible();
      jDayChooser0.getLocale();
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 100, 100, (-441), 3390, 'U');
      KeyEvent.getKeyText(1034);
      KeyEvent.getKeyModifiersText(1045);
      Integer integer0 = GVTAttributedCharacterIterator.TextAttribute.ORIENTATION_AUTO;
      keyEvent0.setSource(integer0);
      jDayChooser0.keyPressed(keyEvent0);
      Date date0 = jDayChooser0.maxSelectableDate;
      Date date1 = jDayChooser0.setMaxSelectableDate(date0);
      assertSame(date1, date0);
      
      jDayChooser0.setYear(10112);
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
  }
}