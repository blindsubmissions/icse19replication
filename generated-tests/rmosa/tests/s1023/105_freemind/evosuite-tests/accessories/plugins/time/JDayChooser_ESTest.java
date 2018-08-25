/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 15:59:43 GMT 2018
 */

package accessories.plugins.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import accessories.plugins.time.JDayChooser;
import accessories.plugins.time.JMonthChooser;
import accessories.plugins.time.JYearChooser;
import java.awt.Color;
import java.awt.Component;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.UnsupportedEncodingException;
import java.sql.Time;
import java.time.temporal.Temporal;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Stack;
import javax.swing.AbstractButton;
import javax.swing.ActionMap;
import javax.swing.Box;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.MenuElement;
import javax.swing.MenuSelectionManager;
import javax.swing.TransferHandler;
import javax.swing.border.BevelBorder;
import javax.swing.event.AncestorListener;
import javax.swing.event.MenuKeyEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.StyledEditorKit;
import javax.swing.tree.DefaultTreeCellRenderer;
import org.apache.fop.image.FopImage;
import org.apache.fop.image.JpegImage;
import org.apache.fop.pdf.PDFDocument;
import org.apache.fop.pdf.PDFPage;
import org.apache.fop.pdf.PDFResources;
import org.apache.fop.pdf.PDFStream;
import org.apache.fop.svg.PDFDocumentGraphics2D;
import org.apache.xerces.parsers.XML11NonValidatingConfiguration;
import org.apache.xerces.util.SymbolTable;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.time.MockZonedDateTime;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.jibx.runtime.impl.UnmarshallingContext;
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
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.setMonthChooser((JMonthChooser) null);
      KeyEvent keyEvent0 = null;
      try {
        keyEvent0 = new KeyEvent(jDayChooser0, 581, 581, 24, 581, 'L', 24);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid keyLocation
         //
         verifyException("java.awt.event.KeyEvent", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JYearChooser jYearChooser0 = new JYearChooser();
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jYearChooser0.setDayChooser(jDayChooser0);
      JDayChooser jDayChooser1 = jYearChooser0.dayChooser;
      jDayChooser1.setWeekOfYearVisible(false);
      PDFDocumentGraphics2D pDFDocumentGraphics2D0 = new PDFDocumentGraphics2D(false);
      assertEquals("", pDFDocumentGraphics2D0.getString());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JYearChooser jYearChooser0 = new JYearChooser();
      jYearChooser0.oldYear = 20;
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jYearChooser0.setDayChooser(jDayChooser0);
      JDayChooser jDayChooser1 = jYearChooser0.dayChooser;
      jDayChooser1.setWeekOfYearVisible(true);
      assertTrue(jDayChooser1.isDecorationBackgroundVisible());
      assertEquals(14, jDayChooser1.getDay());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.7039446318508737
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      JPanel jPanel0 = new JPanel(true);
      jDayChooser0.dayPanel = jPanel0;
      Locale locale0 = jDayChooser0.getLocale();
      jDayChooser0.locale = locale0;
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      SystemColor systemColor0 = SystemColor.scrollbar;
      float[] floatArray0 = new float[3];
      floatArray0[0] = (-1.0F);
      floatArray0[1] = 0.0F;
      floatArray0[2] = 90.0F;
      // Undeclared exception!
      try { 
        systemColor0.getRGBComponents(floatArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("java.awt.Color", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      TransferHandler transferHandler0 = new TransferHandler("x");
      Color color0 = jDayChooser0.getSundayForeground();
      assertEquals((-6029312), color0.getRGB());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertTrue(jDayChooser0.isWeekOfYearVisible());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      SystemColor systemColor0 = SystemColor.scrollbar;
      jDayChooser0.getMaxSelectableDate();
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.getDayPanel();
      UnmarshallingContext unmarshallingContext0 = new UnmarshallingContext();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      try { 
        pipedInputStream0.read();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      String string0 = AbstractButton.CONTENT_AREA_FILLED_CHANGED_PROPERTY;
      Locale locale0 = Locale.UK;
      Locale locale1 = JComponent.getDefaultLocale();
      locale0.getDisplayLanguage(locale1);
      jDayChooser0.setLocale(locale0);
      jDayChooser0.updateUI();
      jDayChooser0.setEnabled(true);
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isWeekOfYearVisible());
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.5983833927870665
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      AncestorListener ancestorListener0 = mock(AncestorListener.class, new ViolatedAssumptionAnswer());
      jDayChooser0.removeAncestorListener(ancestorListener0);
      jDayChooser0.setMonth(3250);
      assertTrue(jDayChooser0.isWeekOfYearVisible());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.608820614830946
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.setDecorationBackgroundVisible(true);
      jDayChooser0.setMaxDayCharacters(4);
      jDayChooser0.transferFocus();
      MenuSelectionManager menuSelectionManager0 = new MenuSelectionManager();
      // Undeclared exception!
      try { 
        Time.valueOf("day");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.sql.Time", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.isOpaque();
      Date date0 = jDayChooser0.minSelectableDate;
      jDayChooser0.setSelectableDateRange(date0, date0);
      JYearChooser jYearChooser0 = new JYearChooser();
      JDayChooser jDayChooser1 = jYearChooser0.dayChooser;
      assertNull(jDayChooser1);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      String string0 = AbstractButton.CONTENT_AREA_FILLED_CHANGED_PROPERTY;
      Locale locale0 = Locale.UK;
      Locale locale1 = JComponent.getDefaultLocale();
      jDayChooser0.setSelectableDateRange((Date) null, (Date) null);
      locale0.getDisplayLanguage(locale1);
      jDayChooser0.setLocale(locale0);
      jDayChooser0.updateUI();
      assertTrue(jDayChooser0.isWeekOfYearVisible());
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getSelectedDay();
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isWeekOfYearVisible());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.setMaxDayCharacters((-3365));
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertEquals(0, jDayChooser0.getMaxDayCharacters());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      PipedInputStream pipedInputStream0 = new PipedInputStream(160);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0, 160);
      DataInputStream dataInputStream0 = new DataInputStream(bufferedInputStream0);
      ActionEvent actionEvent0 = new ActionEvent(dataInputStream0, 1871, "day", (-4276));
      // Undeclared exception!
      try { 
        jDayChooser0.actionPerformed(actionEvent0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.io.DataInputStream cannot be cast to javax.swing.JButton
         //
         verifyException("accessories.plugins.time.JDayChooser", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      Stack<Temporal> stack0 = new Stack<Temporal>();
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, false, true);
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(stack0, 449);
      JTable jTable0 = new JTable(defaultTableModel0);
      jTable0.getCellRect(49, 449, true);
      jDayChooser0.setDecorationBordersVisible(true);
      jDayChooser0.isDecorationBordersVisible();
      MockZonedDateTime.now();
      jDayChooser0.setYear(3739);
      jDayChooser0.getMinimumSize();
      assertEquals(14, jDayChooser0.getDay());
      
      jDayChooser0.setDay(8222);
      assertEquals(28, jDayChooser0.getDay());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.7039446318508737
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.setYear(1789);
      SystemColor systemColor0 = SystemColor.scrollbar;
      jDayChooser0.setDecorationBackgroundColor(systemColor0);
      jDayChooser0.setFocus();
      System.setCurrentTimeMillis(1662L);
      jDayChooser0.setDayBordersVisible(false);
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertTrue(jDayChooser0.isWeekOfYearVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.593621512459067
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      String string0 = AbstractButton.CONTENT_AREA_FILLED_CHANGED_PROPERTY;
      SymbolTable symbolTable0 = new SymbolTable();
      XML11NonValidatingConfiguration xML11NonValidatingConfiguration0 = new XML11NonValidatingConfiguration(symbolTable0);
      Locale locale0 = xML11NonValidatingConfiguration0.getLocale();
      Calendar calendar0 = MockCalendar.getInstance(locale0);
      calendar0.setFirstDayOfWeek(17);
      jDayChooser0.setCalendar(calendar0);
      jDayChooser0.setDay((-2608));
      ScanexTileSource scanexTileSource0 = new ScanexTileSource("@");
      scanexTileSource0.getAttributionImage();
      // Undeclared exception!
      try { 
        jDayChooser0.addListeners(2129920);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      FileSystemHandling.shouldAllThrowIOExceptions();
      JDayChooser jDayChooser0 = new JDayChooser(false);
      FopImage.ImageInfo fopImage_ImageInfo0 = new FopImage.ImageInfo();
      JpegImage jpegImage0 = new JpegImage(fopImage_ImageInfo0);
      jpegImage0.getTransparentColor();
      jDayChooser0.setSundayForeground((Color) null);
      jDayChooser0.updateUI();
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      SystemColor systemColor0 = SystemColor.activeCaption;
      jDayChooser0.oldDayBackgroundColor = (Color) systemColor0;
      ActionMap actionMap0 = jDayChooser0.getActionMap();
      actionMap0.clear();
      FocusEvent focusEvent0 = new FocusEvent(jDayChooser0, (-1587), false);
      focusEvent0.setSource(jDayChooser0);
      jDayChooser0.focusLost(focusEvent0);
      int int0 = jDayChooser0.getMaxDayCharacters();
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertEquals(0, int0);
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.getMouseWheelListeners();
      jDayChooser0.getAutoscrolls();
      jDayChooser0.getAlignmentY();
      jDayChooser0.getKeyListeners();
      jDayChooser0.focusGained((FocusEvent) null);
      jDayChooser0.drawWeeks();
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.getMinSelectableDate();
      jDayChooser0.init();
      MockPrintStream mockPrintStream0 = null;
      try {
        mockPrintStream0 = new MockPrintStream("day", "day");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(Throwable e) {
         //
         // day
         //
         verifyException("java.io.PrintStream", e);
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      JDayChooser jDayChooser1 = new JDayChooser(true);
      jDayChooser0.addKeyListener(jDayChooser1);
      jDayChooser0.getMouseWheelListeners();
      jDayChooser0.getAutoscrolls();
      jDayChooser0.drawWeeks();
      boolean boolean0 = jDayChooser0.isWeekOfYearVisible();
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertTrue(boolean0);
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JYearChooser jYearChooser0 = new JYearChooser();
      jYearChooser0.removeNotify();
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jYearChooser0.setDayChooser(jDayChooser0);
      PDFDocumentGraphics2D pDFDocumentGraphics2D0 = new PDFDocumentGraphics2D(true);
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser_DecoratorButton0.setFocusPainted(false);
      jDayChooser_DecoratorButton0.paint(pDFDocumentGraphics2D0);
      jDayChooser0.setEnabled(true);
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 24
  /*Coverage entropy=2.7039446318508737
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JYearChooser jYearChooser0 = new JYearChooser();
      jYearChooser0.removeNotify();
      boolean boolean0 = false;
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jYearChooser0.setDayChooser(jDayChooser0);
      boolean boolean1 = true;
      PDFDocumentGraphics2D pDFDocumentGraphics2D0 = new PDFDocumentGraphics2D(true);
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser_DecoratorButton0.requestFocus(false);
      // Undeclared exception!
      try { 
        pDFDocumentGraphics2D0.setPaintMode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.batik.ext.awt.g2d.AbstractGraphics2D", e);
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
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
  //Test case number: 26
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JYearChooser jYearChooser0 = new JYearChooser();
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jYearChooser0.setDayChooser(jDayChooser0);
      PDFDocumentGraphics2D pDFDocumentGraphics2D0 = new PDFDocumentGraphics2D(true);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      jDayChooser0.setMaxSelectableDate(date0);
      jDayChooser0.setEnabled(true);
      System.setCurrentTimeMillis(0L);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.createToolTip();
      SystemColor systemColor0 = SystemColor.infoText;
      jDayChooser0.setDecorationBackgroundColor(systemColor0);
      jDayChooser0.setWeekdayForeground((Color) null);
      jDayChooser0.drawDays();
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
  }

  /**
  //Test case number: 28
  /*Coverage entropy=2.6741970408327744
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      assertEquals(14, jDayChooser0.getDay());
      
      Locale locale0 = Locale.PRC;
      String string0 = AbstractButton.CONTENT_AREA_FILLED_CHANGED_PROPERTY;
      System.setCurrentTimeMillis(0L);
      jDayChooser0.setDay(341);
      MenuElement[] menuElementArray0 = new MenuElement[0];
      ScanexTileSource scanexTileSource0 = new ScanexTileSource("contentAreaFilled");
      scanexTileSource0.getAttributionImage();
      jDayChooser0.imageUpdate((Image) null, 865, 1534, 205, (-286), 3818);
      MenuSelectionManager menuSelectionManager0 = MenuSelectionManager.defaultManager();
      MenuKeyEvent menuKeyEvent0 = new MenuKeyEvent(jDayChooser0, 341, 0L, 865, 36, '!', menuElementArray0, menuSelectionManager0);
      jDayChooser0.keyPressed(menuKeyEvent0);
      jDayChooser0.setDay(36);
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser0.keyPressed(menuKeyEvent0);
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  /**
  //Test case number: 29
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.drawWeeks();
      jDayChooser0.updateUI();
      Color color0 = jDayChooser0.getWeekdayForeground();
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertEquals(90, color0.getGreen());
  }

  /**
  //Test case number: 30
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JYearChooser jYearChooser0 = new JYearChooser();
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jYearChooser0.setDayChooser(jDayChooser0);
      JDayChooser jDayChooser1 = jYearChooser0.dayChooser;
      JDayChooser jDayChooser2 = jYearChooser0.dayChooser;
      jDayChooser1.repaint(100L);
      jDayChooser2.getBaselineResizeBehavior();
      jDayChooser1.getGraphics();
      jDayChooser0.drawWeeks();
      jDayChooser0.updateUI();
      jYearChooser0.setVisible(false);
      jDayChooser0.setMaxDayCharacters(19);
      Color color0 = jDayChooser0.getWeekdayForeground();
      assertEquals(0, color0.getRed());
      
      jDayChooser2.drawDays();
      jDayChooser2.isDayBordersVisible();
      assertFalse(jDayChooser2.isDecorationBordersVisible());
      assertEquals(14, jDayChooser2.getDay());
  }

  /**
  //Test case number: 31
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.setMaxDayCharacters(0);
      jDayChooser0.drawDays();
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 32
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      Color color0 = jDayChooser0.getDecorationBackgroundColor();
      jDayChooser0.setDecorationBackgroundColor(color0);
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals((-2956050), color0.getRGB());
  }

  /**
  //Test case number: 33
  /*Coverage entropy=2.7039446318508737
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      SystemColor systemColor0 = SystemColor.scrollbar;
      MockDate mockDate0 = new MockDate();
      jDayChooser0.setMinSelectableDate(mockDate0);
      jDayChooser0.getAccessibleContext();
      jDayChooser0.setDecorationBackgroundColor(systemColor0);
      jDayChooser0.setFocus();
      System.setCurrentTimeMillis(2000L);
  }

  /**
  //Test case number: 34
  /*Coverage entropy=2.7072400880413086
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      String string0 = AbstractButton.CONTENT_AREA_FILLED_CHANGED_PROPERTY;
      Locale locale0 = Locale.UK;
      Locale locale1 = JComponent.getDefaultLocale();
      locale0.getDisplayLanguage(locale1);
      jDayChooser0.setLocale(locale0);
      jDayChooser0.updateUI();
      jDayChooser0.setFocus();
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 160, 160, 160, 160, '3');
      jDayChooser0.keyPressed(keyEvent0);
      jDayChooser0.setDay(160);
      assertEquals(28, jDayChooser0.getDay());
  }

  /**
  //Test case number: 35
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JYearChooser jYearChooser0 = new JYearChooser();
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jYearChooser0.setDayChooser(jDayChooser0);
      JDayChooser jDayChooser1 = jYearChooser0.dayChooser;
      jDayChooser1.getCursor();
      jDayChooser0.drawWeeks();
      jDayChooser1.updateUI();
      jDayChooser1.setMaxDayCharacters(5);
      jDayChooser0.keyReleased((KeyEvent) null);
      assertEquals(0, jDayChooser0.getMaxDayCharacters());
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  /**
  //Test case number: 36
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JYearChooser jYearChooser0 = new JYearChooser();
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jYearChooser0.setDayChooser(jDayChooser0);
      jDayChooser0.setWeekOfYearVisible(true);
      JMonthChooser jMonthChooser0 = new JMonthChooser(true);
      PDFDocumentGraphics2D pDFDocumentGraphics2D0 = new PDFDocumentGraphics2D(true);
      jDayChooser0.setMaxSelectableDate((Date) null);
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
  }

  /**
  //Test case number: 37
  /*Coverage entropy=2.5983833927870665
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      JDayChooser jDayChooser0 = new JDayChooser(true);
      String string0 = AbstractButton.CONTENT_AREA_FILLED_CHANGED_PROPERTY;
      Locale locale0 = Locale.UK;
      Locale locale1 = JComponent.getDefaultLocale();
      Locale.getISOCountries();
      jDayChooser0.maxDayCharacters = 368;
      locale0.getDisplayLanguage(locale1);
      jDayChooser0.setLocale(locale0);
      jDayChooser0.updateUI();
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 38
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      JDayChooser jDayChooser1 = new JDayChooser(true);
      jDayChooser1.setMaxDayCharacters(3);
      jDayChooser0.transferFocus();
      MenuSelectionManager menuSelectionManager0 = new MenuSelectionManager();
  }

  /**
  //Test case number: 39
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.getName();
      jDayChooser0.setDecorationBackgroundVisible(false);
      java.sql.Date date0 = new java.sql.Date((-2608L));
      JDayChooser jDayChooser1 = new JDayChooser(false);
      boolean boolean0 = jDayChooser0.isDecorationBackgroundVisible();
      assertFalse(boolean0);
  }

  /**
  //Test case number: 40
  /*Coverage entropy=2.7154417719562174
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      JDayChooser jDayChooser1 = new JDayChooser(false);
      jDayChooser0.setDay(3);
      Component component0 = Box.createHorizontalStrut(39);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      KeyEvent keyEvent0 = new KeyEvent(component0, 46, 39, 6, 33, 'r');
      KeyEvent.getKeyModifiersText(31);
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
  //Test case number: 41
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      JComponent.getDefaultLocale();
      jDayChooser0.setMinSelectableDate((Date) null);
      jDayChooser0.firePropertyChange("G)aekhG$", (byte) (-122), (byte) (-122));
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      PDFDocument pDFDocument0 = new PDFDocument("day");
      PDFResources pDFResources0 = new PDFResources((-1029));
      PDFPage pDFPage0 = new PDFPage(pDFResources0, (PDFStream) null, (-1029), (-1029));
      assertEquals(0, pDFPage0.getGeneration());
  }

  /**
  //Test case number: 42
  /*Coverage entropy=2.730297871878041
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      JYearChooser jYearChooser0 = new JYearChooser();
      jYearChooser0.removeNotify();
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setDay(35);
      KeyEvent keyEvent0 = new KeyEvent(jYearChooser0, 39, 35, 35, 39, 'Z');
      keyEvent0.consume();
      jDayChooser0.setMonth((-299));
      jDayChooser0.keyPressed(keyEvent0);
      jDayChooser0.keyPressed(keyEvent0);
      KeyEvent keyEvent1 = null;
      try {
        keyEvent1 = new KeyEvent(jDayChooser0, 35, 1152L, 27, 35, 'Z', 27);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid keyLocation
         //
         verifyException("java.awt.event.KeyEvent", e);
      }
  }

  /**
  //Test case number: 43
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      SystemColor systemColor0 = SystemColor.scrollbar;
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 8713, (-5180L), 8713, 37, 'Z');
      jDayChooser0.keyPressed(keyEvent0);
      jDayChooser0.setDay((-1));
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser0.keyPressed(keyEvent0);
      assertEquals(1, jDayChooser0.getDay());
  }

  /**
  //Test case number: 44
  /*Coverage entropy=2.698555534979564
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      JYearChooser jYearChooser0 = new JYearChooser();
      jYearChooser0.removeNotify();
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setDay(35);
      int int0 = 39;
      KeyEvent keyEvent0 = new KeyEvent(jYearChooser0, 39, 35, 35, 39, 'Z');
      keyEvent0.consume();
      keyEvent0.setKeyCode(35);
      jDayChooser0.keyPressed(keyEvent0);
      jDayChooser0.keyPressed(keyEvent0);
      KeyEvent keyEvent1 = null;
      try {
        keyEvent1 = new KeyEvent(jDayChooser0, 35, 1152L, 27, 35, 'Z', 27);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid keyLocation
         //
         verifyException("java.awt.event.KeyEvent", e);
      }
  }

  /**
  //Test case number: 45
  /*Coverage entropy=2.7205968383010655
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      boolean boolean0 = false;
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.setDay(33);
      Component component0 = Box.createHorizontalStrut(3);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      KeyEvent keyEvent0 = new KeyEvent(component0, (-4073), 39, (-4349), 34, 'T');
      KeyEvent.getKeyModifiersText(39);
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
  //Test case number: 46
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 38, 38, 38, 38, 'T');
      jDayChooser0.keyPressed(keyEvent0);
      assertEquals(7, jDayChooser0.getDay());
  }

  /**
  //Test case number: 47
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      SystemColor systemColor0 = SystemColor.scrollbar;
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 6, 2542L, 6, 40, 'r');
      KeyEvent.getKeyModifiersText(29);
      jDayChooser0.keyPressed(keyEvent0);
      System.setCurrentTimeMillis(6);
  }

  /**
  //Test case number: 48
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      FileSystemHandling.shouldAllThrowIOExceptions();
      NetworkHandling.createRemoteTextFile((EvoSuiteURL) null, "/1j-1]m\"WuD>}m+R^");
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getFocusTraversalPolicy();
      jDayChooser0.day = 10;
      jDayChooser0.initialized = false;
      jDayChooser0.repaint();
      jDayChooser0.getMouseListeners();
      jDayChooser0.setFocusable(false);
      jDayChooser0.updateUI();
      Locale locale0 = Locale.CHINA;
      Class<StyledEditorKit.ForegroundAction> class0 = StyledEditorKit.ForegroundAction.class;
      jDayChooser0.getListeners(class0);
      Locale locale1 = Locale.KOREAN;
      Locale.setDefault(locale0);
      locale0.getDisplayVariant(locale1);
      jDayChooser0.setLocale(locale0);
      jDayChooser0.drawDays();
      assertFalse(jDayChooser0.getIgnoreRepaint());
  }

  /**
  //Test case number: 49
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      DefaultTreeCellRenderer defaultTreeCellRenderer0 = new DefaultTreeCellRenderer();
      Icon icon0 = defaultTreeCellRenderer0.getDefaultOpenIcon();
      JButton jButton0 = new JButton("org.apache.log4j.DailyRollingFileAppender", icon0);
      jDayChooser0.selectedDay = jButton0;
      jDayChooser0.updateUI();
      jButton0.removeKeyListener(jDayChooser0);
      assertEquals(14, jDayChooser0.getDay());
      
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "o{)yR");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "1l6N3");
      defaultTreeCellRenderer0.removeNotify();
      defaultTreeCellRenderer0.getMouseListeners();
      jDayChooser0.setDay(46);
      System.setCurrentTimeMillis(46);
      jDayChooser0.setFocus();
      jDayChooser0.updateUI();
      jDayChooser0.setDayBordersVisible(false);
      assertEquals(28, jDayChooser0.getDay());
  }

  /**
  //Test case number: 50
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      Color color0 = Color.DARK_GRAY;
      BevelBorder bevelBorder0 = new BevelBorder(8, color0, color0);
      jDayChooser0.initialized = false;
      Rectangle rectangle0 = bevelBorder0.getInteriorRectangle((Component) jDayChooser0, 43, 8, (-1443), (-1443));
      bevelBorder0.getHighlightInnerColor((Component) jDayChooser0);
      Rectangle rectangle1 = jDayChooser0.getBounds(rectangle0);
      jDayChooser0.getBounds(rectangle1);
      jDayChooser0.updateUI();
      Random.setNextRandom(23);
      jDayChooser0.setDay(0);
      jDayChooser0.setDay(21);
      jDayChooser0.setDay(0);
      Random.setNextRandom(0);
      jDayChooser0.setEnabled(false);
      jDayChooser0.setDayBordersVisible(false);
      jDayChooser0.setDay(1143);
      jDayChooser0.updateUI();
      assertFalse(jDayChooser0.getIgnoreRepaint());
  }
}