/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 08:12:23 GMT 2018
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
import freemind.controller.MapMouseMotionListener;
import freemind.main.Resources;
import freemind.modes.browsemode.BrowseController;
import freemind.modes.browsemode.BrowseMode;
import freemind.view.mindmapview.NodeView;
import java.awt.AWTEventMulticaster;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.HeadlessException;
import java.awt.Point;
import java.awt.SystemColor;
import java.awt.color.ColorSpace;
import java.awt.dnd.DropTarget;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.AffineTransform;
import java.awt.image.IndexColorModel;
import java.beans.PropertyChangeListener;
import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import java.net.URL;
import java.text.ParsePosition;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.Locale;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.DebugGraphics;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JColorChooser;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JEditorPane;
import javax.swing.JLayeredPane;
import javax.swing.JList;
import javax.swing.JRootPane;
import javax.swing.JSpinner;
import javax.swing.KeyStroke;
import javax.swing.event.AncestorListener;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AsyncBoxView;
import javax.swing.text.AttributeSet;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.Element;
import javax.swing.text.GapContent;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleContext;
import javax.swing.tree.DefaultTreeCellRenderer;
import org.apache.batik.bridge.SVGDescElementBridge;
import org.apache.batik.dom.GenericDocument;
import org.apache.batik.gvt.renderer.StrokingTextPainter;
import org.apache.batik.gvt.text.GVTAttributedCharacterIterator;
import org.apache.batik.svggen.SVGGeneratorContext;
import org.apache.batik.svggen.SVGGraphics2D;
import org.apache.crimson.tree.XmlDocument;
import org.apache.fop.pdf.PDFInfo;
import org.apache.fop.svg.PDFDocumentGraphics2D;
import org.apache.xalan.processor.ProcessorLRE;
import org.apache.xalan.templates.ElemUse;
import org.apache.xerces.dom.DeferredDOMImplementationImpl;
import org.apache.xerces.dom.events.MutationEventImpl;
import org.apache.xerces.parsers.XML11NonValidatingConfiguration;
import org.apache.xerces.util.SymbolTable;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
import org.evosuite.runtime.mock.java.time.MockLocalDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.DocumentType;
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
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getLocale();
      jDayChooser0.setAlwaysFireDayProperty(true);
      Resources resources0 = Resources.getInstance();
      resources0.getResource("day");
      JEditorPane jEditorPane0 = null;
      try {
        jEditorPane0 = new JEditorPane((URL) null);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // invalid url
         //
         verifyException("javax.swing.JEditorPane", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getBorder();
      jDayChooser0.getDecorationBackgroundColor();
      jDayChooser0.drawDays();
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      AWTEventMulticaster.add((MouseListener) null, (MouseListener) null);
      AWTEventMulticaster.remove((MouseListener) null, (MouseListener) null);
      jDayChooser_DecoratorButton0.addMouseListener((MouseListener) null);
      jDayChooser_DecoratorButton0.addMouseListener((MouseListener) null);
      Locale locale0 = Locale.PRC;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      ActionEvent actionEvent0 = new ActionEvent(mockGregorianCalendar0, 123, "", 123);
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
  //Test case number: 2
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      boolean boolean0 = true;
      JDayChooser jDayChooser0 = new JDayChooser(true);
      JButton[] jButtonArray0 = new JButton[9];
      JButton jButton0 = new JButton("day");
      jButtonArray0[0] = jButton0;
      jDayChooser0.getSelectedDay();
      jButtonArray0[1] = null;
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jButtonArray0[2] = (JButton) jDayChooser_DecoratorButton0;
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton1 = jDayChooser0.new DecoratorButton();
      jButtonArray0[3] = (JButton) jDayChooser_DecoratorButton1;
      ActionMap actionMap0 = jDayChooser0.getActionMap();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-19), (-19), (-19));
      actionMap0.get(mockGregorianCalendar0);
      JButton jButton1 = new JButton((Action) null);
      jButtonArray0[4] = jButton1;
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton2 = jDayChooser0.new DecoratorButton();
      jButtonArray0[5] = (JButton) jDayChooser_DecoratorButton2;
      JDialog jDialog0 = null;
      try {
        jDialog0 = new JDialog((Dialog) null, true);
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
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.isRequestFocusEnabled();
      jDayChooser0.setFocus();
      jDayChooser0.getDecorationBackgroundColor();
      jDayChooser0.getDecorationBackgroundColor();
      jDayChooser0.getDay();
      DefaultTreeCellRenderer defaultTreeCellRenderer0 = new DefaultTreeCellRenderer();
      ProcessorLRE processorLRE0 = new ProcessorLRE();
      SVGGeneratorContext sVGGeneratorContext0 = SVGGeneratorContext.createDefault(processorLRE0);
      sVGGeneratorContext0.setPrecision(14);
      SVGGraphics2D sVGGraphics2D0 = null;
      try {
        sVGGraphics2D0 = new SVGGraphics2D(sVGGeneratorContext0, true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // ElemTemplateElement error: Function not supported!
         //
         verifyException("org.apache.xalan.templates.ElemTemplateElement", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      MockGregorianCalendar mockGregorianCalendar0 = (MockGregorianCalendar)jDayChooser0.today;
      jDayChooser0.setCalendar(mockGregorianCalendar0);
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      GapContent gapContent0 = new GapContent();
      StyleContext styleContext0 = new StyleContext();
      DefaultStyledDocument defaultStyledDocument0 = new DefaultStyledDocument(gapContent0, styleContext0);
      AttributeSet attributeSet0 = SimpleAttributeSet.EMPTY;
      int int0 = 0;
      AbstractDocument.LeafElement abstractDocument_LeafElement0 = null;
      try {
        abstractDocument_LeafElement0 = defaultStyledDocument0.new LeafElement((Element) null, attributeSet0, 0, 0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Illegal cast to MutableAttributeSet
         //
         verifyException("javax.swing.text.AbstractDocument$AbstractElement", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=3.1354942159291497
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.drawDays();
      jDayChooser0.setWeekOfYearVisible(true);
      jDayChooser0.setVerifyInputWhenFocusTarget(true);
      SystemColor systemColor0 = SystemColor.menu;
      jDayChooser0.setToolTipText("pointsAtX");
      jDayChooser0.setSundayForeground(systemColor0);
      jDayChooser0.setAlwaysFireDayProperty(true);
      jDayChooser0.firePropertyChange("", (short)0, (short)0);
      jDayChooser0.getDaysInMonth();
      int int0 = jDayChooser0.getDay();
      assertEquals(14, int0);
      
      SymbolTable symbolTable0 = new SymbolTable();
      XML11NonValidatingConfiguration xML11NonValidatingConfiguration0 = new XML11NonValidatingConfiguration(symbolTable0);
      String[] stringArray0 = new String[9];
      stringArray0[0] = "pointsAtX";
      stringArray0[1] = "day";
      stringArray0[2] = "pointsAtX";
      stringArray0[3] = "day";
      stringArray0[4] = "";
      stringArray0[5] = "pointsAtX";
      stringArray0[6] = "day";
      stringArray0[7] = "";
      stringArray0[8] = "pointsAtX";
      xML11NonValidatingConfiguration0.addRecognizedProperties(stringArray0);
      Locale locale0 = xML11NonValidatingConfiguration0.getLocale();
      jDayChooser0.setLocale(locale0);
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.firePropertyChange("bd a", false, false);
      jDayChooser0.setMonth((-725));
      jDayChooser0.getSundayForeground();
      BrowseMode browseMode0 = new BrowseMode();
      BrowseController browseController0 = null;
      try {
        browseController0 = new BrowseController(browseMode0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("freemind.modes.ControllerAdapter", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=3.0910424533583143
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      int int0 = 0;
      jDayChooser0.repaint(0, 0, 0, 0);
      jDayChooser0.isWeekOfYearVisible();
      jDayChooser0.getDaysInMonth();
      jDayChooser0.getPropertyChangeListeners("Windows");
      int int1 = (-433);
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 28, (-2003L), (-433), 28, '\\', 0);
      jDayChooser0.keyTyped(keyEvent0);
      Color color0 = jDayChooser0.getDecorationBackgroundColor();
      keyEvent0.setSource(color0);
      ActionEvent actionEvent0 = new ActionEvent(keyEvent0, 0, "day");
      actionEvent0.paramString();
      // Undeclared exception!
      try { 
        jDayChooser0.actionPerformed(actionEvent0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.awt.event.KeyEvent cannot be cast to javax.swing.JButton
         //
         verifyException("accessories.plugins.time.JDayChooser", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      assertEquals(14, jDayChooser0.getDay());
      
      jDayChooser0.day = 1864;
      SystemColor systemColor0 = SystemColor.text;
      systemColor0.getColorSpace();
      jDayChooser0.setWeekdayForeground(systemColor0);
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.65970797168196
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      Color color0 = jDayChooser0.decorationBackgroundColor;
      Color.getColor((String) null, 228);
      color0.getColorSpace();
      jDayChooser0.setForeground(color0);
      jDayChooser0.setDecorationBackgroundColor(color0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      AncestorListener ancestorListener0 = mock(AncestorListener.class, new ViolatedAssumptionAnswer());
      jDayChooser0.removeAncestorListener(ancestorListener0);
      ActionEvent actionEvent0 = new ActionEvent(mockGregorianCalendar0, 27, "Center", 0L, 0);
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
  //Test case number: 10
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setDecorationBordersVisible(true);
      jDayChooser0.getLocale();
      jDayChooser0.setYear(1090);
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      JColorChooser jColorChooser0 = Controller.getCommonJColorChooser();
      JComponent jComponent0 = jColorChooser0.getPreviewPanel();
      FocusEvent focusEvent0 = new FocusEvent(jComponent0, (-804), true);
      jDayChooser0.focusGained(focusEvent0);
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=3.0910424533583143
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      JYearChooser jYearChooser0 = jDayChooser0.yearChooser;
      jDayChooser0.setYearChooser((JYearChooser) null);
      jDayChooser0.setFocus();
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
  //Test case number: 13
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser0.isPaintingForPrint();
      jDayChooser0.getInputContext();
      SystemColor systemColor0 = SystemColor.textHighlight;
      jDayChooser0.oldDayBackgroundColor = (Color) systemColor0;
      jDayChooser_DecoratorButton0.getDisabledSelectedIcon();
      float[] floatArray0 = new float[7];
      floatArray0[0] = 2053.91F;
      floatArray0[1] = 351.733F;
      floatArray0[2] = 0.0F;
      floatArray0[3] = (-2589.17F);
      floatArray0[4] = (-1059.0763F);
      floatArray0[5] = 0.0F;
      floatArray0[6] = 0.0F;
      systemColor0.getColorComponents(floatArray0);
      jDayChooser_DecoratorButton0.isFocusable();
      jDayChooser0.setFocus();
      jDayChooser0.getDaysInMonth();
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)20;
      byteArray0[1] = (byte)4;
      byteArray0[2] = (byte)55;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)74;
      byteArray0[5] = (byte) (-86);
      byteArray0[6] = (byte)59;
      byteArray0[7] = (byte)25;
      IndexColorModel indexColorModel0 = null;
      try {
        indexColorModel0 = new IndexColorModel(9996, 28, byteArray0, byteArray0, byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of bits must be between 1 and 16.
         //
         verifyException("java.awt.image.IndexColorModel", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.getMaxSelectableDate();
      BrowseMode browseMode0 = new BrowseMode();
      BrowseController browseController0 = null;
      try {
        browseController0 = new BrowseController(browseMode0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("freemind.modes.ControllerAdapter", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = "c?Ou";
      String string0 = "day";
      stringArray0[1] = "day";
      stringArray0[2] = "";
      stringArray0[3] = "?s`)T4TY5kehLLJ(rj";
      stringArray0[4] = "uZM{]Tw6";
      stringArray0[5] = "s0>";
      stringArray0[6] = "Z@ISsM+b";
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
  //Test case number: 16
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.repaint();
      jDayChooser0.getVisibleRect();
      jDayChooser0.setMonth((-1710));
      Color color0 = jDayChooser0.getWeekdayForeground();
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertEquals(90, color0.getGreen());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.671760120846313
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      boolean boolean0 = jDayChooser0.isDayBordersVisible();
      assertTrue(boolean0);
      
      JMonthChooser jMonthChooser0 = new JMonthChooser();
      jDayChooser0.setMonthChooser(jMonthChooser0);
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser0.isPaintingForPrint();
      jDayChooser0.getInputContext();
      SystemColor systemColor0 = SystemColor.textHighlight;
      jDayChooser0.oldDayBackgroundColor = (Color) systemColor0;
      jDayChooser_DecoratorButton0.getDisabledSelectedIcon();
      float[] floatArray0 = new float[7];
      floatArray0[0] = 2053.91F;
      floatArray0[1] = 351.733F;
      floatArray0[2] = 0.0F;
      floatArray0[3] = (-2589.17F);
      jDayChooser0.setMonth((-1710));
      jDayChooser0.getMinSelectableDate();
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.7107572577786656
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setWeekOfYearVisible(true);
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser_DecoratorButton0.isFocusable();
      DebugGraphics debugGraphics0 = new DebugGraphics();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PDFDocumentGraphics2D pDFDocumentGraphics2D0 = null;
      try {
        pDFDocumentGraphics2D0 = new PDFDocumentGraphics2D(false, pipedOutputStream0, (-1710), 12297);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=2.7734338836114287
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.drawWeeks();
      jDayChooser0.setYear(9792);
      jDayChooser0.getDayPanel();
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser_DecoratorButton0.isFocusable();
      assertTrue(jDayChooser0.isWeekOfYearVisible());
      
      jDayChooser0.setWeekOfYearVisible(false);
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=2.7438550678980893
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      Date date0 = jDayChooser0.defaultMaxSelectableDate;
      Integer[] integerArray0 = new Integer[7];
      Integer integer0 = GVTAttributedCharacterIterator.TextAttribute.ORIENTATION_AUTO;
      integerArray0[0] = integer0;
      Integer integer1 = GVTAttributedCharacterIterator.TextAttribute.SMALL_CAPS;
      integerArray0[1] = integer1;
      Integer integer2 = GVTAttributedCharacterIterator.TextAttribute.ADJUST_ALL;
      integerArray0[2] = integer2;
      Integer integer3 = GVTAttributedCharacterIterator.TextAttribute.UNDERLINE_ON;
      integerArray0[3] = integer3;
      Integer integer4 = StrokingTextPainter.ADJUST_SPACING;
      integerArray0[4] = integer4;
      Integer integer5 = StrokingTextPainter.ADJUST_ALL;
      integerArray0[5] = integer5;
      Integer integer6 = GVTAttributedCharacterIterator.TextAttribute.ARABIC_ISOLATED;
      integerArray0[6] = integer6;
      JList<Integer> jList0 = new JList<Integer>(integerArray0);
      jList0.indexToLocation(164);
      jDayChooser0.getLocation((Point) null);
      Date date1 = jDayChooser0.setMaxSelectableDate(date0);
      jDayChooser0.setDay(1325);
      jDayChooser0.setMaxSelectableDate(date1);
      jDayChooser0.setMonth(24);
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
  //Test case number: 22
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      jDayChooser0.isDecorationBackgroundVisible();
      BrowseMode browseMode0 = new BrowseMode();
      BrowseController browseController0 = null;
      try {
        browseController0 = new BrowseController(browseMode0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("freemind.modes.ControllerAdapter", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=2.630470240160676
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setFocus();
      assertEquals(14, jDayChooser0.getDay());
      
      jDayChooser0.setDay((-692));
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  /**
  //Test case number: 24
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.getDebugGraphicsOptions();
      Color color0 = jDayChooser0.decorationBackgroundColor;
      Color color1 = Color.getColor("day", 0);
      color0.getColorSpace();
      Color.getColor((String) null, 0);
      jDayChooser0.setForeground(color1);
      jDayChooser0.setDecorationBackgroundColor(color0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      jDayChooser0.setDayBordersVisible(true);
      FocusEvent focusEvent0 = new FocusEvent(jDayChooser0, 1208, false, jDayChooser0);
      jDayChooser0.focusLost(focusEvent0);
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 25
  /*Coverage entropy=2.691693794629735
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.getDebugGraphicsOptions();
      Integer integer0 = GVTAttributedCharacterIterator.TextAttribute.ADJUST_ALL;
      Integer integer1 = GVTAttributedCharacterIterator.TextAttribute.UNDERLINE_ON;
      Integer integer2 = StrokingTextPainter.ADJUST_SPACING;
      Integer integer3 = StrokingTextPainter.ADJUST_ALL;
      Integer integer4 = GVTAttributedCharacterIterator.TextAttribute.ARABIC_ISOLATED;
      Integer[] integerArray0 = new Integer[0];
      JList<Integer> jList0 = new JList<Integer>(integerArray0);
      int int0 = 164;
      jList0.indexToLocation(103);
      JDayChooser jDayChooser1 = new JDayChooser(true);
      jDayChooser1.getLocation((Point) null);
      PDFInfo pDFInfo0 = new PDFInfo();
      pDFInfo0.getCreationDate();
      jDayChooser0.setMaxSelectableDate((Date) null);
      jDayChooser1.setDay((-1));
      jDayChooser0.setMaxSelectableDate((Date) null);
      jDayChooser1.setMonth((-118));
      // Undeclared exception!
      try { 
        jDayChooser1.setLocale((Locale) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 26
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Color color0 = Color.getColor("(#%a\"sgq2t`vBaMk", 228);
      color0.getColorSpace();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      AncestorListener ancestorListener0 = mock(AncestorListener.class, new ViolatedAssumptionAnswer());
      Integer integer0 = JLayeredPane.POPUP_LAYER;
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.addNotify();
      jDayChooser0.getMaxDayCharacters();
      jDayChooser0.initDecorations();
      jDayChooser0.getMaxDayCharacters();
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isWeekOfYearVisible());
  }

  /**
  //Test case number: 27
  /*Coverage entropy=3.1354942159291497
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      Date date0 = jDayChooser0.defaultMaxSelectableDate;
      Integer[] integerArray0 = new Integer[7];
      Integer integer0 = GVTAttributedCharacterIterator.TextAttribute.ORIENTATION_AUTO;
      integerArray0[0] = integer0;
      Integer integer1 = GVTAttributedCharacterIterator.TextAttribute.SMALL_CAPS;
      integerArray0[1] = integer1;
      Integer integer2 = GVTAttributedCharacterIterator.TextAttribute.ADJUST_ALL;
      integerArray0[2] = integer2;
      Integer integer3 = GVTAttributedCharacterIterator.TextAttribute.UNDERLINE_ON;
      Integer.remainderUnsigned((int) integerArray0[1], (-1667));
      integerArray0[3] = integer3;
      Integer integer4 = StrokingTextPainter.ADJUST_SPACING;
      integerArray0[4] = integer4;
      Integer integer5 = StrokingTextPainter.ADJUST_ALL;
      integerArray0[5] = integer5;
      Integer integer6 = GVTAttributedCharacterIterator.TextAttribute.ARABIC_ISOLATED;
      integerArray0[6] = integer6;
      JList<Integer> jList0 = new JList<Integer>(integerArray0);
      jList0.indexToLocation(164);
      jDayChooser0.getLocation((Point) null);
      Date date1 = jDayChooser0.setMaxSelectableDate(date0);
      jDayChooser0.setDay(1325);
      jDayChooser0.setMaxSelectableDate(date1);
      jDayChooser0.setMonth(462);
      jDayChooser0.setFocus();
      KeyEvent keyEvent0 = new KeyEvent(jList0, (-3512), 1325, 8906, (int) integer3, '\\', (int) integerArray0[5]);
      jDayChooser0.keyReleased(keyEvent0);
      assertEquals(31, jDayChooser0.getDay());
  }

  /**
  //Test case number: 28
  /*Coverage entropy=3.0910424533583143
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.getDebugGraphicsOptions();
      Color color0 = jDayChooser0.decorationBackgroundColor;
      Color.getColor((String) null, 228);
      color0.getColorSpace();
      jDayChooser0.setForeground(color0);
      jDayChooser0.setDecorationBackgroundColor(color0);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "Windows");
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      AncestorListener ancestorListener0 = mock(AncestorListener.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = jDayChooser0.isDayBordersVisible();
      assertTrue(boolean0);
      
      jDayChooser0.setEnabled(false);
      jDayChooser0.isDecorationBordersVisible();
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
  }

  /**
  //Test case number: 29
  /*Coverage entropy=2.824364840923503
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      JDayChooser jDayChooser1 = new JDayChooser(false);
      jDayChooser1.getDebugGraphicsOptions();
      Color color0 = jDayChooser0.decorationBackgroundColor;
      Color color1 = Color.getColor("day", 0);
      color1.getColorSpace();
      jDayChooser0.setForeground(color1);
      jDayChooser1.setDecorationBackgroundColor(color1);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      JDayChooser jDayChooser2 = new JDayChooser();
      jDayChooser2.isDayBordersVisible();
      jDayChooser1.setEnabled(true);
      jDayChooser0.setMaxDayCharacters((-1289));
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertEquals(0, jDayChooser0.getMaxDayCharacters());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 30
  /*Coverage entropy=2.65970797168196
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(19);
      LocalDate localDate0 = MockLocalDate.now((ZoneId) zoneOffset0);
      java.sql.Date date0 = java.sql.Date.valueOf(localDate0);
      date0.setTime(40L);
      jDayChooser0.setSelectableDateRange(date0, date0);
      jDayChooser0.setDay(19);
      assertEquals(19, jDayChooser0.getDay());
  }

  /**
  //Test case number: 31
  /*Coverage entropy=2.7438550678980893
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.getDebugGraphicsOptions();
      Color color0 = jDayChooser0.decorationBackgroundColor;
      Color.getColor("day", 0);
      Color.getColor((String) null, 256);
      color0.getColorSpace();
      jDayChooser0.setForeground(color0);
      jDayChooser0.setDecorationBackgroundColor(color0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      jDayChooser0.setFocus();
      Date date0 = jDayChooser0.minSelectableDate;
      Date date1 = jDayChooser0.setMinSelectableDate(date0);
      jDayChooser0.setSelectableDateRange(date0, date1);
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  /**
  //Test case number: 32
  /*Coverage entropy=2.729267023454784
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Color.getColor((String) null, 228);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setEnabled(false);
      jDayChooser0.setMaxDayCharacters(228);
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  /**
  //Test case number: 33
  /*Coverage entropy=2.761992090772484
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 10, 1283L, 15, 15, 'T');
      jDayChooser0.keyPressed(keyEvent0);
      jDayChooser0.setEnabled(false);
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
  }
}
